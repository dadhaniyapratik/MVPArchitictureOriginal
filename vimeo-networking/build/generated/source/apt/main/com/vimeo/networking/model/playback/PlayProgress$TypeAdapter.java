package com.vimeo.networking.model.playback;

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
public final class PlayProgress$TypeAdapter extends TypeAdapter<PlayProgress> {
  public static final TypeToken<PlayProgress> TYPE_TOKEN = TypeToken.get(com.vimeo.networking.model.playback.PlayProgress.class);

  private final Gson mGson;

  public PlayProgress$TypeAdapter(Gson gson) {
    this.mGson = gson;
  }

  @Override
  public void write(JsonWriter writer, PlayProgress object) throws IOException {
    if (object == null) {
      writer.nullValue();
      return;
    }
    writer.beginObject();

    writer.name("seconds");
    if (object.mSeconds != null)  {
      com.vimeo.stag.KnownTypeAdapters.FLOAT.write(writer, object.mSeconds);
    }
    else {
      writer.nullValue();
    }

    writer.endObject();
  }

  @Override
  public PlayProgress read(JsonReader reader) throws IOException {
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
    com.vimeo.networking.model.playback.PlayProgress object = new com.vimeo.networking.model.playback.PlayProgress();
    while (reader.hasNext()) {
      String name = reader.nextName();
      switch (name) {
        case "seconds":
        case "m_seconds":
        	object.mSeconds = com.vimeo.stag.KnownTypeAdapters.FLOAT.read(reader);
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
