package com.vimeo.networking.model.uploadquota;

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
public final class Periodic$TypeAdapter extends TypeAdapter<Periodic> {
  public static final TypeToken<Periodic> TYPE_TOKEN = TypeToken.get(com.vimeo.networking.model.uploadquota.Periodic.class);

  private final Gson mGson;

  public Periodic$TypeAdapter(Gson gson) {
    this.mGson = gson;
  }

  @Override
  public void write(JsonWriter writer, Periodic object) throws IOException {
    if (object == null) {
      writer.nullValue();
      return;
    }
    writer.beginObject();

    writer.name("free");
    if (object.getFree() != null)  {
      com.vimeo.stag.KnownTypeAdapters.LONG.write(writer, object.getFree());
    }
    else {
      writer.nullValue();
    }

    writer.name("max");
    if (object.getMax() != null)  {
      com.vimeo.stag.KnownTypeAdapters.LONG.write(writer, object.getMax());
    }
    else {
      writer.nullValue();
    }

    writer.name("used");
    if (object.getUsed() != null)  {
      com.vimeo.stag.KnownTypeAdapters.LONG.write(writer, object.getUsed());
    }
    else {
      writer.nullValue();
    }

    writer.endObject();
  }

  @Override
  public Periodic read(JsonReader reader) throws IOException {
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
    com.vimeo.networking.model.uploadquota.Periodic object = new com.vimeo.networking.model.uploadquota.Periodic();
    while (reader.hasNext()) {
      String name = reader.nextName();
      switch (name) {
        case "free":
        	object.setFree(com.vimeo.stag.KnownTypeAdapters.LONG.read(reader));
        	break;
        case "max":
        	object.setMax(com.vimeo.stag.KnownTypeAdapters.LONG.read(reader));
        	break;
        case "used":
        	object.setUsed(com.vimeo.stag.KnownTypeAdapters.LONG.read(reader));
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
