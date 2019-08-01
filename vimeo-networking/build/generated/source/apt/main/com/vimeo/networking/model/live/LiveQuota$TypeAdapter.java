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
public final class LiveQuota$TypeAdapter extends TypeAdapter<LiveQuota> {
  public static final TypeToken<LiveQuota> TYPE_TOKEN = TypeToken.get(com.vimeo.networking.model.live.LiveQuota.class);

  private final Gson mGson;

  private final TypeAdapter<LiveStreamsQuota> mTypeAdapter0;

  private final TypeAdapter<LiveTime> mTypeAdapter1;

  public LiveQuota$TypeAdapter(Gson gson) {
    this.mGson = gson;
    this.mTypeAdapter0 = gson.getAdapter(com.vimeo.networking.model.live.LiveStreamsQuota$TypeAdapter.TYPE_TOKEN);
    this.mTypeAdapter1 = gson.getAdapter(com.vimeo.networking.model.live.LiveTime$TypeAdapter.TYPE_TOKEN);
  }

  @Override
  public void write(JsonWriter writer, LiveQuota object) throws IOException {
    if (object == null) {
      writer.nullValue();
      return;
    }
    writer.beginObject();

    writer.name("streams");
    if (object.getStreams() != null)  {
      mTypeAdapter0.write(writer, object.getStreams());
    }
    else {
      writer.nullValue();
    }

    writer.name("time");
    if (object.getTime() != null)  {
      mTypeAdapter1.write(writer, object.getTime());
    }
    else {
      writer.nullValue();
    }

    writer.endObject();
  }

  @Override
  public LiveQuota read(JsonReader reader) throws IOException {
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
    com.vimeo.networking.model.live.LiveQuota object = new com.vimeo.networking.model.live.LiveQuota();
    while (reader.hasNext()) {
      String name = reader.nextName();
      switch (name) {
        case "streams":
        	object.setStreams(mTypeAdapter0.read(reader));
        	break;
        case "time":
        	object.setTime(mTypeAdapter1.read(reader));
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
