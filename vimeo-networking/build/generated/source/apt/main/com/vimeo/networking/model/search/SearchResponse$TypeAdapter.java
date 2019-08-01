package com.vimeo.networking.model.search;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.vimeo.networking.model.Paging;
import java.io.IOException;
import java.lang.Override;
import java.lang.SuppressWarnings;
import java.util.ArrayList;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class SearchResponse$TypeAdapter extends TypeAdapter<SearchResponse> {
  public static final TypeToken<SearchResponse> TYPE_TOKEN = TypeToken.get(com.vimeo.networking.model.search.SearchResponse.class);

  private final Gson mGson;

  private final TypeAdapter<Paging> mTypeAdapter0;

  private final TypeAdapter<SearchResult> mTypeAdapter1;

  private final TypeAdapter<ArrayList<SearchResult>> mTypeAdapter2;

  private final TypeAdapter<SearchFacetCollection> mTypeAdapter3;

  public SearchResponse$TypeAdapter(Gson gson) {
    this.mGson = gson;
    this.mTypeAdapter0 = gson.getAdapter(com.vimeo.networking.model.Paging$TypeAdapter.TYPE_TOKEN);
    this.mTypeAdapter1 = gson.getAdapter(com.vimeo.networking.model.search.SearchResult$TypeAdapter.TYPE_TOKEN);
    this.mTypeAdapter2 = new com.vimeo.stag.KnownTypeAdapters.ListTypeAdapter<com.vimeo.networking.model.search.SearchResult,java.util.ArrayList<com.vimeo.networking.model.search.SearchResult>>(mTypeAdapter1, new com.vimeo.stag.KnownTypeAdapters.ArrayListInstantiator<com.vimeo.networking.model.search.SearchResult>());
    this.mTypeAdapter3 = gson.getAdapter(com.vimeo.networking.model.search.SearchFacetCollection$TypeAdapter.TYPE_TOKEN);
  }

  @Override
  public void write(JsonWriter writer, SearchResponse object) throws IOException {
    if (object == null) {
      writer.nullValue();
      return;
    }
    writer.beginObject();

    writer.name("total");
    writer.value(object.getTotal());

    writer.name("page");
    writer.value(object.getPage());

    writer.name("per_page");
    writer.value(object.getPerPage());

    writer.name("paging");
    if (object.getPaging() != null)  {
      mTypeAdapter0.write(writer, object.getPaging());
    }
    else {
      writer.nullValue();
    }

    writer.name("data");
    if (object.getData() != null)  {
      mTypeAdapter2.write(writer, object.getData());
    }
    else {
      writer.nullValue();
    }

    writer.name("facets");
    if (object.mFacetCollection != null)  {
      mTypeAdapter3.write(writer, object.mFacetCollection);
    }
    else {
      writer.nullValue();
    }

    writer.name("mature_hidden_count");
    writer.value(object.mMatureHiddenCount);

    writer.endObject();
  }

  @Override
  public SearchResponse read(JsonReader reader) throws IOException {
    com.google.gson.stream.JsonToken peek = reader.peek();
    if (com.google.gson.stream.JsonToken.NULL == peek) {
      reader.nextNull();
      return null;
    }
    if (com.google.gson.stream.JsonToken.BEGIN_OBJECT != peek) {
      reader.skipValue();
      return null;
    }
    reader.beginObject();
    com.vimeo.networking.model.search.SearchResponse object = new com.vimeo.networking.model.search.SearchResponse();
    while (reader.hasNext()) {
      String name = reader.nextName();
      switch (name) {
        case "total":
        	object.setTotal(com.vimeo.stag.KnownTypeAdapters.PrimitiveIntTypeAdapter.read(reader, object.getTotal()));
        	break;
        case "page":
        	object.setPage(com.vimeo.stag.KnownTypeAdapters.PrimitiveIntTypeAdapter.read(reader, object.getPage()));
        	break;
        case "per_page":
        	object.setPerPage(com.vimeo.stag.KnownTypeAdapters.PrimitiveIntTypeAdapter.read(reader, object.getPerPage()));
        	break;
        case "paging":
        	object.setPaging(mTypeAdapter0.read(reader));
        	break;
        case "data":
        	object.setData(mTypeAdapter2.read(reader));
        	break;
        case "facets":
        	object.mFacetCollection = mTypeAdapter3.read(reader);
        	break;
        case "mature_hidden_count":
        	object.mMatureHiddenCount = com.vimeo.stag.KnownTypeAdapters.PrimitiveIntTypeAdapter.read(reader, object.mMatureHiddenCount);
        	break;
        default:
        reader.skipValue();
        break;
      }
    }
    reader.endObject();
    return object;
  }
}
