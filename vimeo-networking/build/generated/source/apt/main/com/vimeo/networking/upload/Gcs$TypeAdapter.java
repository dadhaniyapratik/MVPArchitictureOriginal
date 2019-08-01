package com.vimeo.networking.upload;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.vimeo.networking.model.Metadata;
import java.io.IOException;
import java.lang.Override;
import java.lang.SuppressWarnings;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class Gcs$TypeAdapter extends TypeAdapter<Gcs> {
  public static final TypeToken<Gcs> TYPE_TOKEN = TypeToken.get(com.vimeo.networking.upload.Gcs.class);

  private final Gson mGson;

  private final TypeAdapter<Metadata> mTypeAdapter0;

  public Gcs$TypeAdapter(Gson gson) {
    this.mGson = gson;
    this.mTypeAdapter0 = gson.getAdapter(com.vimeo.networking.model.Metadata$TypeAdapter.TYPE_TOKEN);
  }

  @Override
  public void write(JsonWriter writer, Gcs object) throws IOException {
    if (object == null) {
      writer.nullValue();
      return;
    }
    writer.beginObject();

    writer.name("start_byte");
    if (object.getStartingByte() != null)  {
      com.vimeo.stag.KnownTypeAdapters.LONG.write(writer, object.getStartingByte());
    }
    else {
      writer.nullValue();
    }

    writer.name("end_byte");
    if (object.getEndingByte() != null)  {
      com.vimeo.stag.KnownTypeAdapters.LONG.write(writer, object.getEndingByte());
    }
    else {
      writer.nullValue();
    }

    writer.name("upload_link");
    if (object.getUploadLink() != null)  {
      com.google.gson.internal.bind.TypeAdapters.STRING.write(writer, object.getUploadLink());
    }
    else {
      writer.nullValue();
    }

    writer.name("metadata");
    if (object.getMetadata() != null)  {
      mTypeAdapter0.write(writer, object.getMetadata());
    }
    else {
      writer.nullValue();
    }

    writer.endObject();
  }

  @Override
  public Gcs read(JsonReader reader) throws IOException {
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
    com.vimeo.networking.upload.Gcs object = new com.vimeo.networking.upload.Gcs();
    while (reader.hasNext()) {
      String name = reader.nextName();
      switch (name) {
        case "start_byte":
        	object.setStartingByte(com.vimeo.stag.KnownTypeAdapters.LONG.read(reader));
        	break;
        case "end_byte":
        	object.setEndingByte(com.vimeo.stag.KnownTypeAdapters.LONG.read(reader));
        	break;
        case "upload_link":
        	object.setUploadLink(com.google.gson.internal.bind.TypeAdapters.STRING.read(reader));
        	break;
        case "metadata":
        	object.setMetadata(mTypeAdapter0.read(reader));
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
