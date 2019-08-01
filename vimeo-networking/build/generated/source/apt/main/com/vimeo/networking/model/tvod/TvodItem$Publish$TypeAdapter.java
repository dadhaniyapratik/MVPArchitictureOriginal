package com.vimeo.networking.model.tvod;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.lang.Override;
import java.lang.SuppressWarnings;
import java.util.Date;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class TvodItem$Publish$TypeAdapter extends TypeAdapter<TvodItem.Publish> {
  public static final TypeToken<TvodItem.Publish> TYPE_TOKEN = TypeToken.get(com.vimeo.networking.model.tvod.TvodItem.Publish.class);

  private final Gson mGson;

  private final TypeAdapter<Date> mTypeAdapter0;

  public TvodItem$Publish$TypeAdapter(Gson gson) {
    this.mGson = gson;
    com.google.gson.reflect.TypeToken<java.util.Date> typeToken0 = com.google.gson.reflect.TypeToken.get(java.util.Date.class);
    this.mTypeAdapter0 = gson.getAdapter(typeToken0);
  }

  @Override
  public void write(JsonWriter writer, TvodItem.Publish object) throws IOException {
    if (object == null) {
      writer.nullValue();
      return;
    }
    writer.beginObject();

    writer.name("time");
    if (object.mTime != null)  {
      mTypeAdapter0.write(writer, object.mTime);
    }
    else {
      writer.nullValue();
    }

    writer.endObject();
  }

  @Override
  public TvodItem.Publish read(JsonReader reader) throws IOException {
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
    com.vimeo.networking.model.tvod.TvodItem.Publish object = new com.vimeo.networking.model.tvod.TvodItem.Publish();
    while (reader.hasNext()) {
      String name = reader.nextName();
      switch (name) {
        case "time":
        	object.mTime = mTypeAdapter0.read(reader);
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
