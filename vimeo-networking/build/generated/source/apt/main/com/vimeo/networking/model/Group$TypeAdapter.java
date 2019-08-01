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
public final class Group$TypeAdapter extends TypeAdapter<Group> {
  public static final TypeToken<Group> TYPE_TOKEN = TypeToken.get(com.vimeo.networking.model.Group.class);

  private final Gson mGson;

  private final TypeAdapter<Date> mTypeAdapter0;

  private final TypeAdapter<PictureCollection> mTypeAdapter1;

  private final TypeAdapter<Privacy> mTypeAdapter2;

  private final TypeAdapter<User> mTypeAdapter3;

  private final TypeAdapter<Metadata> mTypeAdapter4;

  public Group$TypeAdapter(Gson gson) {
    this.mGson = gson;
    com.google.gson.reflect.TypeToken<java.util.Date> typeToken0 = com.google.gson.reflect.TypeToken.get(java.util.Date.class);
    com.google.gson.reflect.TypeToken<com.vimeo.networking.model.Privacy> typeToken1 = com.google.gson.reflect.TypeToken.get(com.vimeo.networking.model.Privacy.class);
    this.mTypeAdapter0 = gson.getAdapter(typeToken0);
    this.mTypeAdapter1 = gson.getAdapter(com.vimeo.networking.model.PictureCollection$TypeAdapter.TYPE_TOKEN);
    this.mTypeAdapter2 = gson.getAdapter(typeToken1);
    this.mTypeAdapter3 = gson.getAdapter(com.vimeo.networking.model.User$TypeAdapter.TYPE_TOKEN);
    this.mTypeAdapter4 = gson.getAdapter(com.vimeo.networking.model.Metadata$TypeAdapter.TYPE_TOKEN);
  }

  @Override
  public void write(JsonWriter writer, Group object) throws IOException {
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

    writer.name("created_time");
    if (object.mCreatedTime != null)  {
      mTypeAdapter0.write(writer, object.mCreatedTime);
    }
    else {
      writer.nullValue();
    }

    writer.name("group_description");
    if (object.mGroupDescription != null)  {
      com.google.gson.internal.bind.TypeAdapters.STRING.write(writer, object.mGroupDescription);
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

    writer.name("name");
    if (object.mName != null)  {
      com.google.gson.internal.bind.TypeAdapters.STRING.write(writer, object.mName);
    }
    else {
      writer.nullValue();
    }

    writer.name("picture_collection");
    if (object.mPictureCollection != null)  {
      mTypeAdapter1.write(writer, object.mPictureCollection);
    }
    else {
      writer.nullValue();
    }

    writer.name("privacy");
    if (object.mPrivacy != null)  {
      mTypeAdapter2.write(writer, object.mPrivacy);
    }
    else {
      writer.nullValue();
    }

    writer.name("user");
    if (object.mUser != null)  {
      mTypeAdapter3.write(writer, object.mUser);
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
  public Group read(JsonReader reader) throws IOException {
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
    com.vimeo.networking.model.Group object = new com.vimeo.networking.model.Group();
    while (reader.hasNext()) {
      String name = reader.nextName();
      switch (name) {
        case "uri":
        	object.mUri = com.google.gson.internal.bind.TypeAdapters.STRING.read(reader);
        	break;
        case "created_time":
        	object.mCreatedTime = mTypeAdapter0.read(reader);
        	break;
        case "group_description":
        	object.mGroupDescription = com.google.gson.internal.bind.TypeAdapters.STRING.read(reader);
        	break;
        case "link":
        	object.mLink = com.google.gson.internal.bind.TypeAdapters.STRING.read(reader);
        	break;
        case "name":
        	object.mName = com.google.gson.internal.bind.TypeAdapters.STRING.read(reader);
        	break;
        case "picture_collection":
        	object.mPictureCollection = mTypeAdapter1.read(reader);
        	break;
        case "privacy":
        	object.mPrivacy = mTypeAdapter2.read(reader);
        	break;
        case "user":
        	object.mUser = mTypeAdapter3.read(reader);
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
