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
public final class UploadQuota$TypeAdapter extends TypeAdapter<UploadQuota> {
  public static final TypeToken<UploadQuota> TYPE_TOKEN = TypeToken.get(com.vimeo.networking.model.uploadquota.UploadQuota.class);

  private final Gson mGson;

  private final TypeAdapter<Space> mTypeAdapter0;

  private final TypeAdapter<Periodic> mTypeAdapter1;

  private final TypeAdapter<Lifetime> mTypeAdapter2;

  public UploadQuota$TypeAdapter(Gson gson) {
    this.mGson = gson;
    this.mTypeAdapter0 = gson.getAdapter(com.vimeo.networking.model.uploadquota.Space$TypeAdapter.TYPE_TOKEN);
    this.mTypeAdapter1 = gson.getAdapter(com.vimeo.networking.model.uploadquota.Periodic$TypeAdapter.TYPE_TOKEN);
    this.mTypeAdapter2 = gson.getAdapter(com.vimeo.networking.model.uploadquota.Lifetime$TypeAdapter.TYPE_TOKEN);
  }

  @Override
  public void write(JsonWriter writer, UploadQuota object) throws IOException {
    if (object == null) {
      writer.nullValue();
      return;
    }
    writer.beginObject();

    writer.name("space");
    if (object.getSpace() != null)  {
      mTypeAdapter0.write(writer, object.getSpace());
    }
    else {
      throw new java.io.IOException("getSpace() cannot be null");
    }

    writer.name("periodic");
    if (object.getPeriodic() != null)  {
      mTypeAdapter1.write(writer, object.getPeriodic());
    }
    else {
      writer.nullValue();
    }

    writer.name("lifetime");
    if (object.getLifetime() != null)  {
      mTypeAdapter2.write(writer, object.getLifetime());
    }
    else {
      writer.nullValue();
    }

    writer.endObject();
  }

  @Override
  public UploadQuota read(JsonReader reader) throws IOException {
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
    com.vimeo.networking.model.uploadquota.UploadQuota object = new com.vimeo.networking.model.uploadquota.UploadQuota();
    while (reader.hasNext()) {
      String name = reader.nextName();
      switch (name) {
        case "space":
        	object.setSpace(mTypeAdapter0.read(reader));
        	break;
        case "periodic":
        	object.setPeriodic(mTypeAdapter1.read(reader));
        	break;
        case "lifetime":
        	object.setLifetime(mTypeAdapter2.read(reader));
        	break;
        default:
        reader.skipValue();
        break;
      }
    }
    reader.endObject();
    if (object.getSpace() == null) {
      throw new java.io.IOException("getSpace() cannot be null");
    }
    return object;
  }
}
