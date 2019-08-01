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
public final class VideosPreference$TypeAdapter extends TypeAdapter<VideosPreference> {
  public static final TypeToken<VideosPreference> TYPE_TOKEN = TypeToken.get(com.vimeo.networking.model.VideosPreference.class);

  private final Gson mGson;

  private final TypeAdapter<Privacy> mTypeAdapter0;

  public VideosPreference$TypeAdapter(Gson gson) {
    this.mGson = gson;
    com.google.gson.reflect.TypeToken<com.vimeo.networking.model.Privacy> typeToken0 = com.google.gson.reflect.TypeToken.get(com.vimeo.networking.model.Privacy.class);
    this.mTypeAdapter0 = gson.getAdapter(typeToken0);
  }

  @Override
  public void write(JsonWriter writer, VideosPreference object) throws IOException {
    if (object == null) {
      writer.nullValue();
      return;
    }
    writer.beginObject();

    writer.name("privacy");
    if (object.mPrivacy != null)  {
      mTypeAdapter0.write(writer, object.mPrivacy);
    }
    else {
      writer.nullValue();
    }

    writer.name("password");
    if (object.mPassword != null)  {
      com.google.gson.internal.bind.TypeAdapters.STRING.write(writer, object.mPassword);
    }
    else {
      writer.nullValue();
    }

    writer.endObject();
  }

  @Override
  public VideosPreference read(JsonReader reader) throws IOException {
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
    com.vimeo.networking.model.VideosPreference object = new com.vimeo.networking.model.VideosPreference();
    while (reader.hasNext()) {
      String name = reader.nextName();
      switch (name) {
        case "privacy":
        case "m_privacy":
        	object.mPrivacy = mTypeAdapter0.read(reader);
        	break;
        case "password":
        case "m_password":
        	object.mPassword = com.google.gson.internal.bind.TypeAdapters.STRING.read(reader);
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
