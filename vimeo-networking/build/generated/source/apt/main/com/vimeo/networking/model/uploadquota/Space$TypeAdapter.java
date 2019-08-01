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
public final class Space$TypeAdapter extends TypeAdapter<Space> {
  public static final TypeToken<Space> TYPE_TOKEN = TypeToken.get(com.vimeo.networking.model.uploadquota.Space.class);

  private final Gson mGson;

  private final TypeAdapter<Space.Type> mTypeAdapter0;

  public Space$TypeAdapter(Gson gson) {
    this.mGson = gson;
    com.google.gson.reflect.TypeToken<com.vimeo.networking.model.uploadquota.Space.Type> typeToken0 = com.google.gson.reflect.TypeToken.get(com.vimeo.networking.model.uploadquota.Space.Type.class);
    this.mTypeAdapter0 = gson.getAdapter(typeToken0);
  }

  @Override
  public void write(JsonWriter writer, Space object) throws IOException {
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
      throw new java.io.IOException("getFree() cannot be null");
    }

    writer.name("max");
    if (object.getMax() != null)  {
      com.vimeo.stag.KnownTypeAdapters.LONG.write(writer, object.getMax());
    }
    else {
      throw new java.io.IOException("getMax() cannot be null");
    }

    writer.name("used");
    if (object.getUsed() != null)  {
      com.vimeo.stag.KnownTypeAdapters.LONG.write(writer, object.getUsed());
    }
    else {
      throw new java.io.IOException("getUsed() cannot be null");
    }

    writer.name("showing");
    if (object.getType() != null)  {
      mTypeAdapter0.write(writer, object.getType());
    }
    else {
      writer.nullValue();
    }

    writer.endObject();
  }

  @Override
  public Space read(JsonReader reader) throws IOException {
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
    com.vimeo.networking.model.uploadquota.Space object = new com.vimeo.networking.model.uploadquota.Space();
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
        case "showing":
        	object.setType(mTypeAdapter0.read(reader));
        	break;
        default:
        reader.skipValue();
        break;
      }
    }
    reader.endObject();
    if (object.getFree() == null) {
      throw new java.io.IOException("getFree() cannot be null");
    }
    if (object.getMax() == null) {
      throw new java.io.IOException("getMax() cannot be null");
    }
    if (object.getUsed() == null) {
      throw new java.io.IOException("getUsed() cannot be null");
    }
    return object;
  }
}
