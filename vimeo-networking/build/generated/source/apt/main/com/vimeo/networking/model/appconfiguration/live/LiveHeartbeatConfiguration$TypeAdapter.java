package com.vimeo.networking.model.appconfiguration.live;

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
public final class LiveHeartbeatConfiguration$TypeAdapter extends TypeAdapter<LiveHeartbeatConfiguration> {
  public static final TypeToken<LiveHeartbeatConfiguration> TYPE_TOKEN = TypeToken.get(com.vimeo.networking.model.appconfiguration.live.LiveHeartbeatConfiguration.class);

  private final Gson mGson;

  public LiveHeartbeatConfiguration$TypeAdapter(Gson gson) {
    this.mGson = gson;
  }

  @Override
  public void write(JsonWriter writer, LiveHeartbeatConfiguration object) throws IOException {
    if (object == null) {
      writer.nullValue();
      return;
    }
    writer.beginObject();

    writer.name("interval");
    if (object.getInterval() != null)  {
      com.vimeo.stag.KnownTypeAdapters.INTEGER.write(writer, object.getInterval());
    }
    else {
      writer.nullValue();
    }

    writer.name("enabled");
    if (object.getIsEnabled() != null)  {
      com.google.gson.internal.bind.TypeAdapters.BOOLEAN.write(writer, object.getIsEnabled());
    }
    else {
      writer.nullValue();
    }

    writer.endObject();
  }

  @Override
  public LiveHeartbeatConfiguration read(JsonReader reader) throws IOException {
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
    com.vimeo.networking.model.appconfiguration.live.LiveHeartbeatConfiguration object = new com.vimeo.networking.model.appconfiguration.live.LiveHeartbeatConfiguration();
    while (reader.hasNext()) {
      String name = reader.nextName();
      switch (name) {
        case "interval":
        	object.setInterval(com.vimeo.stag.KnownTypeAdapters.INTEGER.read(reader));
        	break;
        case "enabled":
        	object.setIsEnabled(com.google.gson.internal.bind.TypeAdapters.BOOLEAN.read(reader));
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
