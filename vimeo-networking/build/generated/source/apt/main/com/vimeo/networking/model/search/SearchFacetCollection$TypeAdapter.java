package com.vimeo.networking.model.search;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.lang.Override;
import java.lang.SuppressWarnings;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class SearchFacetCollection$TypeAdapter extends TypeAdapter<SearchFacetCollection> {
  public static final TypeToken<SearchFacetCollection> TYPE_TOKEN = TypeToken.get(com.vimeo.networking.model.search.SearchFacetCollection.class);

  private final Gson mGson;

  private final TypeAdapter<SearchFacet> mTypeAdapter0;

  public SearchFacetCollection$TypeAdapter(Gson gson) {
    this.mGson = gson;
    this.mTypeAdapter0 = gson.getAdapter(com.vimeo.networking.model.search.SearchFacet$TypeAdapter.TYPE_TOKEN);
  }

  @Override
  public void write(JsonWriter writer, SearchFacetCollection object) throws IOException {
    if (object == null) {
      writer.nullValue();
      return;
    }
    writer.beginObject();

    writer.name("type");
    if (object.mTypeFacet != null)  {
      mTypeAdapter0.write(writer, object.mTypeFacet);
    }
    else {
      writer.nullValue();
    }

    writer.name("category");
    if (object.mCategoryFacet != null)  {
      mTypeAdapter0.write(writer, object.mCategoryFacet);
    }
    else {
      writer.nullValue();
    }

    writer.name("duration");
    if (object.mDurationFacet != null)  {
      mTypeAdapter0.write(writer, object.mDurationFacet);
    }
    else {
      writer.nullValue();
    }

    writer.name("license");
    if (object.mLicenseFacet != null)  {
      mTypeAdapter0.write(writer, object.mLicenseFacet);
    }
    else {
      writer.nullValue();
    }

    writer.name("uploaded");
    if (object.mUploadedFacet != null)  {
      mTypeAdapter0.write(writer, object.mUploadedFacet);
    }
    else {
      writer.nullValue();
    }

    writer.name("user_type");
    if (object.mUserTypeFacet != null)  {
      mTypeAdapter0.write(writer, object.mUserTypeFacet);
    }
    else {
      writer.nullValue();
    }

    writer.endObject();
  }

  @Override
  public SearchFacetCollection read(JsonReader reader) throws IOException {
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
    com.vimeo.networking.model.search.SearchFacetCollection object = new com.vimeo.networking.model.search.SearchFacetCollection();
    while (reader.hasNext()) {
      String name = reader.nextName();
      switch (name) {
        case "type":
        	object.mTypeFacet = mTypeAdapter0.read(reader);
        	break;
        case "category":
        	object.mCategoryFacet = mTypeAdapter0.read(reader);
        	break;
        case "duration":
        	object.mDurationFacet = mTypeAdapter0.read(reader);
        	break;
        case "license":
        	object.mLicenseFacet = mTypeAdapter0.read(reader);
        	break;
        case "uploaded":
        	object.mUploadedFacet = mTypeAdapter0.read(reader);
        	break;
        case "user_type":
        	object.mUserTypeFacet = mTypeAdapter0.read(reader);
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
