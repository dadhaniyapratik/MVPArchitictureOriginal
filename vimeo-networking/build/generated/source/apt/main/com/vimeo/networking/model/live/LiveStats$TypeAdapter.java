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
public final class LiveStats$TypeAdapter extends TypeAdapter<LiveStats> {
  public static final TypeToken<LiveStats> TYPE_TOKEN = TypeToken.get(com.vimeo.networking.model.live.LiveStats.class);

  private final Gson mGson;

  private final TypeAdapter<LiveStatsViewers> mTypeAdapter0;

  public LiveStats$TypeAdapter(Gson gson) {
    this.mGson = gson;
    this.mTypeAdapter0 = gson.getAdapter(com.vimeo.networking.model.live.LiveStatsViewers$TypeAdapter.TYPE_TOKEN);
  }

  @Override
  public void write(JsonWriter writer, LiveStats object) throws IOException {
    if (object == null) {
      writer.nullValue();
      return;
    }
    writer.beginObject();

    writer.name("plays");
    if (object.getPlays() != null)  {
      com.vimeo.stag.KnownTypeAdapters.LONG.write(writer, object.getPlays());
    }
    else {
      writer.nullValue();
    }

    writer.name("total_view_time");
    if (object.getTotalViewTime() != null)  {
      com.vimeo.stag.KnownTypeAdapters.LONG.write(writer, object.getTotalViewTime());
    }
    else {
      writer.nullValue();
    }

    writer.name("viewers");
    if (object.getViewers() != null)  {
      mTypeAdapter0.write(writer, object.getViewers());
    }
    else {
      writer.nullValue();
    }

    writer.endObject();
  }

  @Override
  public LiveStats read(JsonReader reader) throws IOException {
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
    com.vimeo.networking.model.live.LiveStats object = new com.vimeo.networking.model.live.LiveStats();
    while (reader.hasNext()) {
      String name = reader.nextName();
      switch (name) {
        case "plays":
        	object.setPlays(com.vimeo.stag.KnownTypeAdapters.LONG.read(reader));
        	break;
        case "total_view_time":
        	object.setTotalViewTime(com.vimeo.stag.KnownTypeAdapters.LONG.read(reader));
        	break;
        case "viewers":
        	object.setViewers(mTypeAdapter0.read(reader));
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
