package com.vimeo.networking.model;

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
public final class Channel$TypeAdapter extends TypeAdapter<Channel> {
  public static final TypeToken<Channel> TYPE_TOKEN = TypeToken.get(com.vimeo.networking.model.Channel.class);

  private final Gson mGson;

  private final TypeAdapter<Date> mTypeAdapter0;

  private final TypeAdapter<User> mTypeAdapter1;

  private final TypeAdapter<PictureCollection> mTypeAdapter2;

  private final TypeAdapter<Privacy> mTypeAdapter3;

  private final TypeAdapter<Metadata> mTypeAdapter4;

  public Channel$TypeAdapter(Gson gson) {
    this.mGson = gson;
    com.google.gson.reflect.TypeToken<java.util.Date> typeToken0 = com.google.gson.reflect.TypeToken.get(java.util.Date.class);
    com.google.gson.reflect.TypeToken<com.vimeo.networking.model.Privacy> typeToken1 = com.google.gson.reflect.TypeToken.get(com.vimeo.networking.model.Privacy.class);
    this.mTypeAdapter0 = gson.getAdapter(typeToken0);
    this.mTypeAdapter1 = gson.getAdapter(com.vimeo.networking.model.User$TypeAdapter.TYPE_TOKEN);
    this.mTypeAdapter2 = gson.getAdapter(com.vimeo.networking.model.PictureCollection$TypeAdapter.TYPE_TOKEN);
    this.mTypeAdapter3 = gson.getAdapter(typeToken1);
    this.mTypeAdapter4 = gson.getAdapter(com.vimeo.networking.model.Metadata$TypeAdapter.TYPE_TOKEN);
  }

  @Override
  public void write(JsonWriter writer, Channel object) throws IOException {
    if (object == null) {
      writer.nullValue();
      return;
    }
    writer.beginObject();

    writer.name("uri");
    if (object.mUri != null)  {
      com.google.gson.internal.bind.TypeAdapters.STRING.write(writer, object.mUri);
    }
    else {
      writer.nullValue();
    }

    writer.name("name");
    if (object.mName != null)  {
      com.google.gson.internal.bind.TypeAdapters.STRING.write(writer, object.mName);
    }
    else {
      writer.nullValue();
    }

    writer.name("description");
    if (object.mDescription != null)  {
      com.google.gson.internal.bind.TypeAdapters.STRING.write(writer, object.mDescription);
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

    writer.name("created_time");
    if (object.mCreatedTime != null)  {
      mTypeAdapter0.write(writer, object.mCreatedTime);
    }
    else {
      writer.nullValue();
    }

    writer.name("modified_time");
    if (object.mModifiedTime != null)  {
      mTypeAdapter0.write(writer, object.mModifiedTime);
    }
    else {
      writer.nullValue();
    }

    writer.name("user");
    if (object.mUser != null)  {
      mTypeAdapter1.write(writer, object.mUser);
    }
    else {
      writer.nullValue();
    }

    writer.name("pictures");
    if (object.mPictures != null)  {
      mTypeAdapter2.write(writer, object.mPictures);
    }
    else {
      writer.nullValue();
    }

    writer.name("header");
    if (object.mHeader != null)  {
      mTypeAdapter2.write(writer, object.mHeader);
    }
    else {
      writer.nullValue();
    }

    writer.name("privacy");
    if (object.mPrivacy != null)  {
      mTypeAdapter3.write(writer, object.mPrivacy);
    }
    else {
      writer.nullValue();
    }

    writer.name("metadata");
    if (object.mMetadata != null)  {
      mTypeAdapter4.write(writer, object.mMetadata);
    }
    else {
      writer.nullValue();
    }

    writer.name("resource_key");
    if (object.getResourceKey() != null)  {
      com.google.gson.internal.bind.TypeAdapters.STRING.write(writer, object.getResourceKey());
    }
    else {
      writer.nullValue();
    }

    writer.endObject();
  }

  @Override
  public Channel read(JsonReader reader) throws IOException {
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
    com.vimeo.networking.model.Channel object = new com.vimeo.networking.model.Channel();
    while (reader.hasNext()) {
      String name = reader.nextName();
      switch (name) {
        case "uri":
        	object.mUri = com.google.gson.internal.bind.TypeAdapters.STRING.read(reader);
        	break;
        case "name":
        	object.mName = com.google.gson.internal.bind.TypeAdapters.STRING.read(reader);
        	break;
        case "description":
        	object.mDescription = com.google.gson.internal.bind.TypeAdapters.STRING.read(reader);
        	break;
        case "link":
        	object.mLink = com.google.gson.internal.bind.TypeAdapters.STRING.read(reader);
        	break;
        case "created_time":
        	object.mCreatedTime = mTypeAdapter0.read(reader);
        	break;
        case "modified_time":
        	object.mModifiedTime = mTypeAdapter0.read(reader);
        	break;
        case "user":
        	object.mUser = mTypeAdapter1.read(reader);
        	break;
        case "pictures":
        	object.mPictures = mTypeAdapter2.read(reader);
        	break;
        case "header":
        	object.mHeader = mTypeAdapter2.read(reader);
        	break;
        case "privacy":
        	object.mPrivacy = mTypeAdapter3.read(reader);
        	break;
        case "metadata":
        	object.mMetadata = mTypeAdapter4.read(reader);
        	break;
        case "resource_key":
        	object.setResourceKey(com.google.gson.internal.bind.TypeAdapters.STRING.read(reader));
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
