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
public final class TvodSuggestion$TypeAdapter extends TypeAdapter<TvodSuggestion> {
  public static final TypeToken<TvodSuggestion> TYPE_TOKEN = TypeToken.get(com.vimeo.networking.model.search.TvodSuggestion.class);

  private final Gson mGson;

  private final TypeAdapter<TvodSuggestion.TvodSuggestionMetadata> mTypeAdapter0;

  public TvodSuggestion$TypeAdapter(Gson gson) {
    this.mGson = gson;
    this.mTypeAdapter0 = gson.getAdapter(com.vimeo.networking.model.search.TvodSuggestion$TvodSuggestionMetadata$TypeAdapter.TYPE_TOKEN);
  }

  @Override
  public void write(JsonWriter writer, TvodSuggestion object) throws IOException {
    if (object == null) {
      writer.nullValue();
      return;
    }
    writer.beginObject();

    writer.name("text");
    if (object.mText != null)  {
      com.google.gson.internal.bind.TypeAdapters.STRING.write(writer, object.mText);
    }
    else {
      throw new java.io.IOException("mText cannot be null");
    }

    writer.name("meta");
    if (object.mMetadata != null)  {
      mTypeAdapter0.write(writer, object.mMetadata);
    }
    else {
      writer.nullValue();
    }

    writer.endObject();
  }

  @Override
  public TvodSuggestion read(JsonReader reader) throws IOException {
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
    com.vimeo.networking.model.search.TvodSuggestion object = new com.vimeo.networking.model.search.TvodSuggestion();
    while (reader.hasNext()) {
      String name = reader.nextName();
      switch (name) {
        case "text":
        	object.mText = com.google.gson.internal.bind.TypeAdapters.STRING.read(reader);
        	break;
        case "meta":
        	object.mMetadata = mTypeAdapter0.read(reader);
        	break;
        default:
        reader.skipValue();
        break;
      }
    }
    reader.endObject();
    if (object.mText == null) {
      throw new java.io.IOException("mText cannot be null");
    }
    return object;
  }
}
