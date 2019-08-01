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
public final class Email$TypeAdapter extends TypeAdapter<Email> {
  public static final TypeToken<Email> TYPE_TOKEN = TypeToken.get(com.vimeo.networking.model.Email.class);

  private final Gson mGson;

  public Email$TypeAdapter(Gson gson) {
    this.mGson = gson;
  }

  @Override
  public void write(JsonWriter writer, Email object) throws IOException {
    if (object == null) {
      writer.nullValue();
      return;
    }
    writer.beginObject();

    writer.name("email");
    if (object.mEmail != null)  {
      com.google.gson.internal.bind.TypeAdapters.STRING.write(writer, object.mEmail);
    }
    else {
      writer.nullValue();
    }

    writer.endObject();
  }

  @Override
  public Email read(JsonReader reader) throws IOException {
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
    com.vimeo.networking.model.Email object = new com.vimeo.networking.model.Email();
    while (reader.hasNext()) {
      String name = reader.nextName();
      switch (name) {
        case "email":
        	object.mEmail = com.google.gson.internal.bind.TypeAdapters.STRING.read(reader);
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
