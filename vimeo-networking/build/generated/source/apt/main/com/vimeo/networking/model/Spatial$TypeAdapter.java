package com.vimeo.networking.model;

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
public final class Spatial$TypeAdapter extends TypeAdapter<Spatial> {
  public static final TypeToken<Spatial> TYPE_TOKEN = TypeToken.get(com.vimeo.networking.model.Spatial.class);

  private final Gson mGson;

  public Spatial$TypeAdapter(Gson gson) {
    this.mGson = gson;
  }

  @Override
  public void write(JsonWriter writer, Spatial object) throws IOException {
    if (object == null) {
      writer.nullValue();
      return;
    }
    writer.beginObject();

    writer.name("projection");
    if (object.mProjection != null)  {
      com.google.gson.internal.bind.TypeAdapters.STRING.write(writer, object.mProjection);
    }
    else {
      throw new java.io.IOException("mProjection cannot be null");
    }

    writer.name("stereo_format");
    if (object.mStereoFormat != null)  {
      com.google.gson.internal.bind.TypeAdapters.STRING.write(writer, object.mStereoFormat);
    }
    else {
      throw new java.io.IOException("mStereoFormat cannot be null");
    }

    writer.endObject();
  }

  @Override
  public Spatial read(JsonReader reader) throws IOException {
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
    com.vimeo.networking.model.Spatial object = new com.vimeo.networking.model.Spatial();
    while (reader.hasNext()) {
      String name = reader.nextName();
      switch (name) {
        case "projection":
        case "m_projection":
        	object.mProjection = com.google.gson.internal.bind.TypeAdapters.STRING.read(reader);
        	break;
        case "stereo_format":
        case "m_stereo_format":
        	object.mStereoFormat = com.google.gson.internal.bind.TypeAdapters.STRING.read(reader);
        	break;
        default:
        reader.skipValue();
        break;
      }
    }
    reader.endObject();
    if (object.mProjection == null) {
      throw new java.io.IOException("mProjection cannot be null");
    }
    if (object.mStereoFormat == null) {
      throw new java.io.IOException("mStereoFormat cannot be null");
    }
    return object;
  }
}
