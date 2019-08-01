package com.vimeo.networking.model.error;

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
public final class InvalidParameter$TypeAdapter extends TypeAdapter<InvalidParameter> {
  public static final TypeToken<InvalidParameter> TYPE_TOKEN = TypeToken.get(com.vimeo.networking.model.error.InvalidParameter.class);

  private final Gson mGson;

  public InvalidParameter$TypeAdapter(Gson gson) {
    this.mGson = gson;
  }

  @Override
  public void write(JsonWriter writer, InvalidParameter object) throws IOException {
    if (object == null) {
      writer.nullValue();
      return;
    }
    writer.beginObject();

    writer.name("field");
    if (object.mField != null)  {
      com.google.gson.internal.bind.TypeAdapters.STRING.write(writer, object.mField);
    }
    else {
      writer.nullValue();
    }

    writer.name("error_code");
    if (object.getRawErrorCode() != null)  {
      com.google.gson.internal.bind.TypeAdapters.STRING.write(writer, object.getRawErrorCode());
    }
    else {
      writer.nullValue();
    }

    writer.name("user_message");
    if (object.mUserMessage != null)  {
      com.google.gson.internal.bind.TypeAdapters.STRING.write(writer, object.mUserMessage);
    }
    else {
      writer.nullValue();
    }

    writer.name("developer_message");
    if (object.mDeveloperMessage != null)  {
      com.google.gson.internal.bind.TypeAdapters.STRING.write(writer, object.mDeveloperMessage);
    }
    else {
      writer.nullValue();
    }

    writer.endObject();
  }

  @Override
  public InvalidParameter read(JsonReader reader) throws IOException {
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
    com.vimeo.networking.model.error.InvalidParameter object = new com.vimeo.networking.model.error.InvalidParameter();
    while (reader.hasNext()) {
      String name = reader.nextName();
      switch (name) {
        case "field":
        	object.mField = com.google.gson.internal.bind.TypeAdapters.STRING.read(reader);
        	break;
        case "error_code":
        	object.setRawErrorCode(com.google.gson.internal.bind.TypeAdapters.STRING.read(reader));
        	break;
        case "user_message":
        	object.mUserMessage = com.google.gson.internal.bind.TypeAdapters.STRING.read(reader);
        	break;
        case "developer_message":
        	object.mDeveloperMessage = com.google.gson.internal.bind.TypeAdapters.STRING.read(reader);
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
