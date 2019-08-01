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
public final class LiveStatsViewers$TypeAdapter extends TypeAdapter<LiveStatsViewers> {
  public static final TypeToken<LiveStatsViewers> TYPE_TOKEN = TypeToken.get(com.vimeo.networking.model.live.LiveStatsViewers.class);

  private final Gson mGson;

  public LiveStatsViewers$TypeAdapter(Gson gson) {
    this.mGson = gson;
  }

  @Override
  public void write(JsonWriter writer, LiveStatsViewers object) throws IOException {
    if (object == null) {
      writer.nullValue();
      return;
    }
    writer.beginObject();

    writer.name("current");
    if (object.getCurrent() != null)  {
      com.vimeo.stag.KnownTypeAdapters.LONG.write(writer, object.getCurrent());
    }
    else {
      writer.nullValue();
    }

    writer.name("peak");
    if (object.getPeak() != null)  {
      com.vimeo.stag.KnownTypeAdapters.LONG.write(writer, object.getPeak());
    }
    else {
      writer.nullValue();
    }

    writer.endObject();
  }

  @Override
  public LiveStatsViewers read(JsonReader reader) throws IOException {
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
    com.vimeo.networking.model.live.LiveStatsViewers object = new com.vimeo.networking.model.live.LiveStatsViewers();
    while (reader.hasNext()) {
      String name = reader.nextName();
      switch (name) {
        case "current":
        	object.setCurrent(com.vimeo.stag.KnownTypeAdapters.LONG.read(reader));
        	break;
        case "peak":
        	object.setPeak(com.vimeo.stag.KnownTypeAdapters.LONG.read(reader));
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
