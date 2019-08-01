package com.vimeo.networking.model.live;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.vimeo.networking.model.User;
import java.io.IOException;
import java.lang.Override;
import java.lang.SuppressWarnings;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class LiveChat$TypeAdapter extends TypeAdapter<LiveChat> {
  public static final TypeToken<LiveChat> TYPE_TOKEN = TypeToken.get(com.vimeo.networking.model.live.LiveChat.class);

  private final Gson mGson;

  private final TypeAdapter<User> mTypeAdapter0;

  public LiveChat$TypeAdapter(Gson gson) {
    this.mGson = gson;
    this.mTypeAdapter0 = gson.getAdapter(com.vimeo.networking.model.User$TypeAdapter.TYPE_TOKEN);
  }

  @Override
  public void write(JsonWriter writer, LiveChat object) throws IOException {
    if (object == null) {
      writer.nullValue();
      return;
    }
    writer.beginObject();

    writer.name("room_id");
    if (object.getRoomId() != null)  {
      com.google.gson.internal.bind.TypeAdapters.STRING.write(writer, object.getRoomId());
    }
    else {
      writer.nullValue();
    }

    writer.name("token");
    if (object.getToken() != null)  {
      com.google.gson.internal.bind.TypeAdapters.STRING.write(writer, object.getToken());
    }
    else {
      writer.nullValue();
    }

    writer.name("user");
    if (object.getUser() != null)  {
      mTypeAdapter0.write(writer, object.getUser());
    }
    else {
      writer.nullValue();
    }

    writer.endObject();
  }

  @Override
  public LiveChat read(JsonReader reader) throws IOException {
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
    com.vimeo.networking.model.live.LiveChat object = new com.vimeo.networking.model.live.LiveChat();
    while (reader.hasNext()) {
      String name = reader.nextName();
      switch (name) {
        case "room_id":
        	object.setRoomId(com.google.gson.internal.bind.TypeAdapters.STRING.read(reader));
        	break;
        case "token":
        	object.setToken(com.google.gson.internal.bind.TypeAdapters.STRING.read(reader));
        	break;
        case "user":
        	object.setUser(mTypeAdapter0.read(reader));
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
