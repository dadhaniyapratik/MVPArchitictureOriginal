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
public final class Embed$TypeAdapter extends TypeAdapter<Embed> {
  public static final TypeToken<Embed> TYPE_TOKEN = TypeToken.get(com.vimeo.networking.model.Embed.class);

  private final Gson mGson;

  public Embed$TypeAdapter(Gson gson) {
    this.mGson = gson;
  }

  @Override
  public void write(JsonWriter writer, Embed object) throws IOException {
    if (object == null) {
      writer.nullValue();
      return;
    }
    writer.beginObject();

    writer.name("html");
    if (object.mHtml != null)  {
      com.google.gson.internal.bind.TypeAdapters.STRING.write(writer, object.mHtml);
    }
    else {
      writer.nullValue();
    }

    writer.endObject();
  }

  @Override
  public Embed read(JsonReader reader) throws IOException {
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
    com.vimeo.networking.model.Embed object = new com.vimeo.networking.model.Embed();
    while (reader.hasNext()) {
      String name = reader.nextName();
      switch (name) {
        case "html":
        	object.mHtml = com.google.gson.internal.bind.TypeAdapters.STRING.read(reader);
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
