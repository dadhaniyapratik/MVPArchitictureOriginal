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
public final class VideoSuggestion$VideoSuggestionMetadata$TypeAdapter extends TypeAdapter<VideoSuggestion.VideoSuggestionMetadata> {
  public static final TypeToken<VideoSuggestion.VideoSuggestionMetadata> TYPE_TOKEN = TypeToken.get(com.vimeo.networking.model.search.VideoSuggestion.VideoSuggestionMetadata.class);

  private final Gson mGson;

  public VideoSuggestion$VideoSuggestionMetadata$TypeAdapter(Gson gson) {
    this.mGson = gson;
  }

  @Override
  public void write(JsonWriter writer, VideoSuggestion.VideoSuggestionMetadata object) throws
      IOException {
    if (object == null) {
      writer.nullValue();
      return;
    }
    writer.beginObject();

    writer.name("score");
    writer.value(object.mScore);

    writer.endObject();
  }

  @Override
  public VideoSuggestion.VideoSuggestionMetadata read(JsonReader reader) throws IOException {
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
    com.vimeo.networking.model.search.VideoSuggestion.VideoSuggestionMetadata object = new com.vimeo.networking.model.search.VideoSuggestion.VideoSuggestionMetadata();
    while (reader.hasNext()) {
      String name = reader.nextName();
      switch (name) {
        case "score":
        	object.mScore = com.vimeo.stag.KnownTypeAdapters.PrimitiveIntTypeAdapter.read(reader, object.mScore);
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
