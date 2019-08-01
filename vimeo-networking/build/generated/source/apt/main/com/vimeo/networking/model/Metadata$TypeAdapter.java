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
public final class Metadata$TypeAdapter extends TypeAdapter<Metadata> {
  public static final TypeToken<Metadata> TYPE_TOKEN = TypeToken.get(com.vimeo.networking.model.Metadata.class);

  private final Gson mGson;

  private final TypeAdapter<ConnectionCollection> mTypeAdapter0;

  private final TypeAdapter<InteractionCollection> mTypeAdapter1;

  public Metadata$TypeAdapter(Gson gson) {
    this.mGson = gson;
    this.mTypeAdapter0 = gson.getAdapter(com.vimeo.networking.model.ConnectionCollection$TypeAdapter.TYPE_TOKEN);
    this.mTypeAdapter1 = gson.getAdapter(com.vimeo.networking.model.InteractionCollection$TypeAdapter.TYPE_TOKEN);
  }

  @Override
  public void write(JsonWriter writer, Metadata object) throws IOException {
    if (object == null) {
      writer.nullValue();
      return;
    }
    writer.beginObject();

    writer.name("connections");
    if (object.mConnections != null)  {
      mTypeAdapter0.write(writer, object.mConnections);
    }
    else {
      writer.nullValue();
    }

    writer.name("interactions");
    if (object.mInteractions != null)  {
      mTypeAdapter1.write(writer, object.mInteractions);
    }
    else {
      writer.nullValue();
    }

    writer.endObject();
  }

  @Override
  public Metadata read(JsonReader reader) throws IOException {
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
    com.vimeo.networking.model.Metadata object = new com.vimeo.networking.model.Metadata();
    while (reader.hasNext()) {
      String name = reader.nextName();
      switch (name) {
        case "connections":
        	object.mConnections = mTypeAdapter0.read(reader);
        	break;
        case "interactions":
        	object.mInteractions = mTypeAdapter1.read(reader);
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
