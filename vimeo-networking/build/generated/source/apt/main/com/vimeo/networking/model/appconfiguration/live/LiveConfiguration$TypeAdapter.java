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
public final class LiveConfiguration$TypeAdapter extends TypeAdapter<LiveConfiguration> {
  public static final TypeToken<LiveConfiguration> TYPE_TOKEN = TypeToken.get(com.vimeo.networking.model.appconfiguration.live.LiveConfiguration.class);

  private final Gson mGson;

  private final TypeAdapter<LiveHeartbeatConfiguration> mTypeAdapter0;

  private final TypeAdapter<LiveChatConfiguration> mTypeAdapter1;

  public LiveConfiguration$TypeAdapter(Gson gson) {
    this.mGson = gson;
    this.mTypeAdapter0 = gson.getAdapter(com.vimeo.networking.model.appconfiguration.live.LiveHeartbeatConfiguration$TypeAdapter.TYPE_TOKEN);
    this.mTypeAdapter1 = gson.getAdapter(com.vimeo.networking.model.appconfiguration.live.LiveChatConfiguration$TypeAdapter.TYPE_TOKEN);
  }

  @Override
  public void write(JsonWriter writer, LiveConfiguration object) throws IOException {
    if (object == null) {
      writer.nullValue();
      return;
    }
    writer.beginObject();

    writer.name("heartbeat");
    if (object.getLiveHeartbeatConfiguration() != null)  {
      mTypeAdapter0.write(writer, object.getLiveHeartbeatConfiguration());
    }
    else {
      writer.nullValue();
    }

    writer.name("chat");
    if (object.getLiveChatConfiguration() != null)  {
      mTypeAdapter1.write(writer, object.getLiveChatConfiguration());
    }
    else {
      writer.nullValue();
    }

    writer.endObject();
  }

  @Override
  public LiveConfiguration read(JsonReader reader) throws IOException {
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
    com.vimeo.networking.model.appconfiguration.live.LiveConfiguration object = new com.vimeo.networking.model.appconfiguration.live.LiveConfiguration();
    while (reader.hasNext()) {
      String name = reader.nextName();
      switch (name) {
        case "heartbeat":
        	object.setLiveHeartbeatConfiguration(mTypeAdapter0.read(reader));
        	break;
        case "chat":
        	object.setLiveChatConfiguration(mTypeAdapter1.read(reader));
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
