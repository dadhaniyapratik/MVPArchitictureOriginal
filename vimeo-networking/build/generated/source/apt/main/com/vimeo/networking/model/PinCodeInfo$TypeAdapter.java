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
public final class PinCodeInfo$TypeAdapter extends TypeAdapter<PinCodeInfo> {
  public static final TypeToken<PinCodeInfo> TYPE_TOKEN = TypeToken.get(com.vimeo.networking.model.PinCodeInfo.class);

  private final Gson mGson;

  public PinCodeInfo$TypeAdapter(Gson gson) {
    this.mGson = gson;
  }

  @Override
  public void write(JsonWriter writer, PinCodeInfo object) throws IOException {
    if (object == null) {
      writer.nullValue();
      return;
    }
    writer.beginObject();

    writer.name("device_code");
    if (object.mDeviceCode != null)  {
      com.google.gson.internal.bind.TypeAdapters.STRING.write(writer, object.mDeviceCode);
    }
    else {
      writer.nullValue();
    }

    writer.name("user_code");
    if (object.mUserCode != null)  {
      com.google.gson.internal.bind.TypeAdapters.STRING.write(writer, object.mUserCode);
    }
    else {
      writer.nullValue();
    }

    writer.name("authorize_link");
    if (object.mAuthorizeLink != null)  {
      com.google.gson.internal.bind.TypeAdapters.STRING.write(writer, object.mAuthorizeLink);
    }
    else {
      writer.nullValue();
    }

    writer.name("activate_link");
    if (object.mActivateLink != null)  {
      com.google.gson.internal.bind.TypeAdapters.STRING.write(writer, object.mActivateLink);
    }
    else {
      writer.nullValue();
    }

    writer.name("expires_in");
    writer.value(object.mExpiresIn);

    writer.name("interval");
    writer.value(object.mInterval);

    writer.endObject();
  }

  @Override
  public PinCodeInfo read(JsonReader reader) throws IOException {
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
    com.vimeo.networking.model.PinCodeInfo object = new com.vimeo.networking.model.PinCodeInfo();
    while (reader.hasNext()) {
      String name = reader.nextName();
      switch (name) {
        case "device_code":
        	object.mDeviceCode = com.google.gson.internal.bind.TypeAdapters.STRING.read(reader);
        	break;
        case "user_code":
        	object.mUserCode = com.google.gson.internal.bind.TypeAdapters.STRING.read(reader);
        	break;
        case "authorize_link":
        	object.mAuthorizeLink = com.google.gson.internal.bind.TypeAdapters.STRING.read(reader);
        	break;
        case "activate_link":
        	object.mActivateLink = com.google.gson.internal.bind.TypeAdapters.STRING.read(reader);
        	break;
        case "expires_in":
        	object.mExpiresIn = com.vimeo.stag.KnownTypeAdapters.PrimitiveIntTypeAdapter.read(reader, object.mExpiresIn);
        	break;
        case "interval":
        	object.mInterval = com.vimeo.stag.KnownTypeAdapters.PrimitiveIntTypeAdapter.read(reader, object.mInterval);
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
