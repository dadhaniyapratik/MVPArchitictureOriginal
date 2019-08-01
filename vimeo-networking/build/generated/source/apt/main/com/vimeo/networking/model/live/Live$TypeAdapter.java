package com.vimeo.networking.model.live;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.vimeo.networking.model.error.VimeoError;
import java.io.IOException;
import java.lang.Override;
import java.lang.SuppressWarnings;
import java.util.Date;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class Live$TypeAdapter extends TypeAdapter<Live> {
  public static final TypeToken<Live> TYPE_TOKEN = TypeToken.get(com.vimeo.networking.model.live.Live.class);

  private final Gson mGson;

  private final TypeAdapter<Date> mTypeAdapter0;

  private final TypeAdapter<VimeoError> mTypeAdapter1;

  private final TypeAdapter<LiveChat> mTypeAdapter2;

  public Live$TypeAdapter(Gson gson) {
    this.mGson = gson;
    com.google.gson.reflect.TypeToken<java.util.Date> typeToken0 = com.google.gson.reflect.TypeToken.get(java.util.Date.class);
    this.mTypeAdapter0 = gson.getAdapter(typeToken0);
    this.mTypeAdapter1 = gson.getAdapter(com.vimeo.networking.model.error.VimeoError$TypeAdapter.TYPE_TOKEN);
    this.mTypeAdapter2 = gson.getAdapter(com.vimeo.networking.model.live.LiveChat$TypeAdapter.TYPE_TOKEN);
  }

  @Override
  public void write(JsonWriter writer, Live object) throws IOException {
    if (object == null) {
      writer.nullValue();
      return;
    }
    writer.beginObject();

    writer.name("active_time");
    if (object.getActiveTime() != null)  {
      mTypeAdapter0.write(writer, object.getActiveTime());
    }
    else {
      writer.nullValue();
    }

    writer.name("archived_time");
    if (object.getArchivedTime() != null)  {
      mTypeAdapter0.write(writer, object.getArchivedTime());
    }
    else {
      writer.nullValue();
    }

    writer.name("ended_time");
    if (object.getEndedTime() != null)  {
      mTypeAdapter0.write(writer, object.getEndedTime());
    }
    else {
      writer.nullValue();
    }

    writer.name("scheduled_start_time");
    if (object.getStartTime() != null)  {
      mTypeAdapter0.write(writer, object.getStartTime());
    }
    else {
      writer.nullValue();
    }

    writer.name("link");
    if (object.getLink() != null)  {
      com.google.gson.internal.bind.TypeAdapters.STRING.write(writer, object.getLink());
    }
    else {
      writer.nullValue();
    }

    writer.name("key");
    if (object.getKey() != null)  {
      com.google.gson.internal.bind.TypeAdapters.STRING.write(writer, object.getKey());
    }
    else {
      writer.nullValue();
    }

    writer.name("status");
    if (object.getStatus() != null)  {
      com.google.gson.internal.bind.TypeAdapters.STRING.write(writer, object.getStatus());
    }
    else {
      writer.nullValue();
    }

    writer.name("streaming_error");
    if (object.getError() != null)  {
      mTypeAdapter1.write(writer, object.getError());
    }
    else {
      writer.nullValue();
    }

    writer.name("chat");
    if (object.getChat() != null)  {
      mTypeAdapter2.write(writer, object.getChat());
    }
    else {
      writer.nullValue();
    }

    writer.endObject();
  }

  @Override
  public Live read(JsonReader reader) throws IOException {
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
    com.vimeo.networking.model.live.Live object = new com.vimeo.networking.model.live.Live();
    while (reader.hasNext()) {
      String name = reader.nextName();
      switch (name) {
        case "active_time":
        	object.setActiveTime(mTypeAdapter0.read(reader));
        	break;
        case "archived_time":
        	object.setArchivedTime(mTypeAdapter0.read(reader));
        	break;
        case "ended_time":
        	object.setEndedTime(mTypeAdapter0.read(reader));
        	break;
        case "scheduled_start_time":
        	object.setStartTime(mTypeAdapter0.read(reader));
        	break;
        case "link":
        	object.setLink(com.google.gson.internal.bind.TypeAdapters.STRING.read(reader));
        	break;
        case "key":
        	object.setKey(com.google.gson.internal.bind.TypeAdapters.STRING.read(reader));
        	break;
        case "status":
        	object.setStatus(com.google.gson.internal.bind.TypeAdapters.STRING.read(reader));
        	break;
        case "streaming_error":
        	object.setError(mTypeAdapter1.read(reader));
        	break;
        case "chat":
        	object.setChat(mTypeAdapter2.read(reader));
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
