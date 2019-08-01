package com.vimeo.networking.model.search;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.vimeo.networking.model.PictureCollection;
import java.io.IOException;
import java.lang.Override;
import java.lang.SuppressWarnings;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class TvodSuggestion$TvodSuggestionMetadata$TypeAdapter extends TypeAdapter<TvodSuggestion.TvodSuggestionMetadata> {
  public static final TypeToken<TvodSuggestion.TvodSuggestionMetadata> TYPE_TOKEN = TypeToken.get(com.vimeo.networking.model.search.TvodSuggestion.TvodSuggestionMetadata.class);

  private final Gson mGson;

  private final TypeAdapter<PictureCollection> mTypeAdapter0;

  public TvodSuggestion$TvodSuggestionMetadata$TypeAdapter(Gson gson) {
    this.mGson = gson;
    this.mTypeAdapter0 = gson.getAdapter(com.vimeo.networking.model.PictureCollection$TypeAdapter.TYPE_TOKEN);
  }

  @Override
  public void write(JsonWriter writer, TvodSuggestion.TvodSuggestionMetadata object) throws
      IOException {
    if (object == null) {
      writer.nullValue();
      return;
    }
    writer.beginObject();

    writer.name("target_url");
    if (object.mTargetUrl != null)  {
      com.google.gson.internal.bind.TypeAdapters.STRING.write(writer, object.mTargetUrl);
    }
    else {
      writer.nullValue();
    }

    writer.name("poster");
    if (object.mPoster != null)  {
      mTypeAdapter0.write(writer, object.mPoster);
    }
    else {
      writer.nullValue();
    }

    writer.endObject();
  }

  @Override
  public TvodSuggestion.TvodSuggestionMetadata read(JsonReader reader) throws IOException {
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
    com.vimeo.networking.model.search.TvodSuggestion.TvodSuggestionMetadata object = new com.vimeo.networking.model.search.TvodSuggestion.TvodSuggestionMetadata();
    while (reader.hasNext()) {
      String name = reader.nextName();
      switch (name) {
        case "target_url":
        	object.mTargetUrl = com.google.gson.internal.bind.TypeAdapters.STRING.read(reader);
        	break;
        case "poster":
        	object.mPoster = mTypeAdapter0.read(reader);
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
