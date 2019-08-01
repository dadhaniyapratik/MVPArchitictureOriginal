package com.vimeo.networking.model.live;

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
public final class LiveStreamsQuota$TypeAdapter extends TypeAdapter<LiveStreamsQuota> {
  public static final TypeToken<LiveStreamsQuota> TYPE_TOKEN = TypeToken.get(com.vimeo.networking.model.live.LiveStreamsQuota.class);

  private final Gson mGson;

  public LiveStreamsQuota$TypeAdapter(Gson gson) {
    this.mGson = gson;
  }

  @Override
  public void write(JsonWriter writer, LiveStreamsQuota object) throws IOException {
    if (object == null) {
      writer.nullValue();
      return;
    }
    writer.beginObject();

    writer.name("maximum");
    if (object.getMaximum() != null)  {
      com.vimeo.stag.KnownTypeAdapters.INTEGER.write(writer, object.getMaximum());
    }
    else {
      writer.nullValue();
    }

    writer.name("remaining");
    if (object.getRemaining() != null)  {
      com.vimeo.stag.KnownTypeAdapters.INTEGER.write(writer, object.getRemaining());
    }
    else {
      writer.nullValue();
    }

    writer.endObject();
  }

  @Override
  public LiveStreamsQuota read(JsonReader reader) throws IOException {
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
    com.vimeo.networking.model.live.LiveStreamsQuota object = new com.vimeo.networking.model.live.LiveStreamsQuota();
    while (reader.hasNext()) {
      String name = reader.nextName();
      switch (name) {
        case "maximum":
        	object.setMaximum(com.vimeo.stag.KnownTypeAdapters.INTEGER.read(reader));
        	break;
        case "remaining":
        	object.setRemaining(com.vimeo.stag.KnownTypeAdapters.INTEGER.read(reader));
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
