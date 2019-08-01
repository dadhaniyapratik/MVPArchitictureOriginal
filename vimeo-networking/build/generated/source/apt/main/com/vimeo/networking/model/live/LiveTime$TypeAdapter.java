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
public final class LiveTime$TypeAdapter extends TypeAdapter<LiveTime> {
  public static final TypeToken<LiveTime> TYPE_TOKEN = TypeToken.get(com.vimeo.networking.model.live.LiveTime.class);

  private final Gson mGson;

  public LiveTime$TypeAdapter(Gson gson) {
    this.mGson = gson;
  }

  @Override
  public void write(JsonWriter writer, LiveTime object) throws IOException {
    if (object == null) {
      writer.nullValue();
      return;
    }
    writer.beginObject();

    writer.name("event_maximum");
    if (object.getEventMaximum() != null)  {
      com.vimeo.stag.KnownTypeAdapters.INTEGER.write(writer, object.getEventMaximum());
    }
    else {
      writer.nullValue();
    }

    writer.name("monthly_maximum");
    if (object.getMonthlyMaximum() != null)  {
      com.vimeo.stag.KnownTypeAdapters.LONG.write(writer, object.getMonthlyMaximum());
    }
    else {
      writer.nullValue();
    }

    writer.name("monthly_remaining");
    if (object.getMonthlyRemaining() != null)  {
      com.vimeo.stag.KnownTypeAdapters.LONG.write(writer, object.getMonthlyRemaining());
    }
    else {
      writer.nullValue();
    }

    writer.endObject();
  }

  @Override
  public LiveTime read(JsonReader reader) throws IOException {
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
    com.vimeo.networking.model.live.LiveTime object = new com.vimeo.networking.model.live.LiveTime();
    while (reader.hasNext()) {
      String name = reader.nextName();
      switch (name) {
        case "event_maximum":
        	object.setEventMaximum(com.vimeo.stag.KnownTypeAdapters.INTEGER.read(reader));
        	break;
        case "monthly_maximum":
        	object.setMonthlyMaximum(com.vimeo.stag.KnownTypeAdapters.LONG.read(reader));
        	break;
        case "monthly_remaining":
        	object.setMonthlyRemaining(com.vimeo.stag.KnownTypeAdapters.LONG.read(reader));
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
