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
public final class UserBadge$TypeAdapter extends TypeAdapter<UserBadge> {
  public static final TypeToken<UserBadge> TYPE_TOKEN = TypeToken.get(com.vimeo.networking.model.UserBadge.class);

  private final Gson mGson;

  public UserBadge$TypeAdapter(Gson gson) {
    this.mGson = gson;
  }

  @Override
  public void write(JsonWriter writer, UserBadge object) throws IOException {
    if (object == null) {
      writer.nullValue();
      return;
    }
    writer.beginObject();

    writer.name("type");
    if (object.mBadgeType != null)  {
      com.google.gson.internal.bind.TypeAdapters.STRING.write(writer, object.mBadgeType);
    }
    else {
      writer.nullValue();
    }

    writer.name("text");
    if (object.mText != null)  {
      com.google.gson.internal.bind.TypeAdapters.STRING.write(writer, object.mText);
    }
    else {
      writer.nullValue();
    }

    writer.name("alt_text");
    if (object.mAlternateText != null)  {
      com.google.gson.internal.bind.TypeAdapters.STRING.write(writer, object.mAlternateText);
    }
    else {
      writer.nullValue();
    }

    writer.name("url");
    if (object.mUrl != null)  {
      com.google.gson.internal.bind.TypeAdapters.STRING.write(writer, object.mUrl);
    }
    else {
      writer.nullValue();
    }

    writer.endObject();
  }

  @Override
  public UserBadge read(JsonReader reader) throws IOException {
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
    com.vimeo.networking.model.UserBadge object = new com.vimeo.networking.model.UserBadge();
    while (reader.hasNext()) {
      String name = reader.nextName();
      switch (name) {
        case "type":
        case "m_badge_type":
        	object.mBadgeType = com.google.gson.internal.bind.TypeAdapters.STRING.read(reader);
        	break;
        case "text":
        case "m_text":
        	object.mText = com.google.gson.internal.bind.TypeAdapters.STRING.read(reader);
        	break;
        case "alt_text":
        case "m_alternate_text":
        	object.mAlternateText = com.google.gson.internal.bind.TypeAdapters.STRING.read(reader);
        	break;
        case "url":
        case "m_url":
        	object.mUrl = com.google.gson.internal.bind.TypeAdapters.STRING.read(reader);
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
