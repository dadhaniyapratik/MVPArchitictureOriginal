package com.vimeo.networking.model.search;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.lang.Override;
import java.lang.SuppressWarnings;
import java.util.ArrayList;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class SearchFacet$TypeAdapter extends TypeAdapter<SearchFacet> {
  public static final TypeToken<SearchFacet> TYPE_TOKEN = TypeToken.get(com.vimeo.networking.model.search.SearchFacet.class);

  private final Gson mGson;

  private final TypeAdapter<FacetOption> mTypeAdapter0;

  private final TypeAdapter<ArrayList<FacetOption>> mTypeAdapter1;

  public SearchFacet$TypeAdapter(Gson gson) {
    this.mGson = gson;
    this.mTypeAdapter0 = gson.getAdapter(com.vimeo.networking.model.search.FacetOption$TypeAdapter.TYPE_TOKEN);
    this.mTypeAdapter1 = new com.vimeo.stag.KnownTypeAdapters.ListTypeAdapter<com.vimeo.networking.model.search.FacetOption,java.util.ArrayList<com.vimeo.networking.model.search.FacetOption>>(mTypeAdapter0, new com.vimeo.stag.KnownTypeAdapters.ArrayListInstantiator<com.vimeo.networking.model.search.FacetOption>());
  }

  @Override
  public void write(JsonWriter writer, SearchFacet object) throws IOException {
    if (object == null) {
      writer.nullValue();
      return;
    }
    writer.beginObject();

    writer.name("name");
    if (object.mName != null)  {
      com.google.gson.internal.bind.TypeAdapters.STRING.write(writer, object.mName);
    }
    else {
      writer.nullValue();
    }

    writer.name("options");
    if (object.mOptions != null)  {
      mTypeAdapter1.write(writer, object.mOptions);
    }
    else {
      writer.nullValue();
    }

    writer.endObject();
  }

  @Override
  public SearchFacet read(JsonReader reader) throws IOException {
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
    com.vimeo.networking.model.search.SearchFacet object = new com.vimeo.networking.model.search.SearchFacet();
    while (reader.hasNext()) {
      String name = reader.nextName();
      switch (name) {
        case "name":
        	object.mName = com.google.gson.internal.bind.TypeAdapters.STRING.read(reader);
        	break;
        case "options":
        	object.mOptions = mTypeAdapter1.read(reader);
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
