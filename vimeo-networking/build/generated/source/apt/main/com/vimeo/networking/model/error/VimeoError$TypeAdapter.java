package com.vimeo.networking.model.error;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.lang.Override;
import java.lang.SuppressWarnings;
import java.util.List;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class VimeoError$TypeAdapter extends TypeAdapter<VimeoError> {
  public static final TypeToken<VimeoError> TYPE_TOKEN = TypeToken.get(com.vimeo.networking.model.error.VimeoError.class);

  private final Gson mGson;

  private final TypeAdapter<InvalidParameter> mTypeAdapter0;

  private final TypeAdapter<List<InvalidParameter>> mTypeAdapter1;

  public VimeoError$TypeAdapter(Gson gson) {
    this.mGson = gson;
    this.mTypeAdapter0 = gson.getAdapter(com.vimeo.networking.model.error.InvalidParameter$TypeAdapter.TYPE_TOKEN);
    this.mTypeAdapter1 = new com.vimeo.stag.KnownTypeAdapters.ListTypeAdapter<com.vimeo.networking.model.error.InvalidParameter,java.util.List<com.vimeo.networking.model.error.InvalidParameter>>(mTypeAdapter0, new com.vimeo.stag.KnownTypeAdapters.ListInstantiator<com.vimeo.networking.model.error.InvalidParameter>());
  }

  @Override
  public void write(JsonWriter writer, VimeoError object) throws IOException {
    if (object == null) {
      writer.nullValue();
      return;
    }
    writer.beginObject();

    writer.name("error");
    if (object.mErrorMessage != null)  {
      com.google.gson.internal.bind.TypeAdapters.STRING.write(writer, object.mErrorMessage);
    }
    else {
      writer.nullValue();
    }

    writer.name("link");
    if (object.mLink != null)  {
      com.google.gson.internal.bind.TypeAdapters.STRING.write(writer, object.mLink);
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

    writer.name("error_code");
    if (object.getRawErrorCode() != null)  {
      com.google.gson.internal.bind.TypeAdapters.STRING.write(writer, object.getRawErrorCode());
    }
    else {
      writer.nullValue();
    }

    writer.name("invalid_parameters");
    if (object.mInvalidParameters != null)  {
      mTypeAdapter1.write(writer, object.mInvalidParameters);
    }
    else {
      writer.nullValue();
    }

    writer.endObject();
  }

  @Override
  public VimeoError read(JsonReader reader) throws IOException {
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
    com.vimeo.networking.model.error.VimeoError object = new com.vimeo.networking.model.error.VimeoError();
    while (reader.hasNext()) {
      String name = reader.nextName();
      switch (name) {
        case "error":
        	object.mErrorMessage = com.google.gson.internal.bind.TypeAdapters.STRING.read(reader);
        	break;
        case "link":
        	object.mLink = com.google.gson.internal.bind.TypeAdapters.STRING.read(reader);
        	break;
        case "developer_message":
        	object.mDeveloperMessage = com.google.gson.internal.bind.TypeAdapters.STRING.read(reader);
        	break;
        case "error_code":
        	object.setRawErrorCode(com.google.gson.internal.bind.TypeAdapters.STRING.read(reader));
        	break;
        case "invalid_parameters":
        	object.mInvalidParameters = mTypeAdapter1.read(reader);
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
