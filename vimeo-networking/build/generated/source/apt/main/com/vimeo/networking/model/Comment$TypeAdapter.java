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
public final class Comment$TypeAdapter extends TypeAdapter<Comment> {
  public static final TypeToken<Comment> TYPE_TOKEN = TypeToken.get(com.vimeo.networking.model.Comment.class);

  private final Gson mGson;

  private final TypeAdapter<Comment.CommentType> mTypeAdapter0;

  private final TypeAdapter<Date> mTypeAdapter1;

  private final TypeAdapter<User> mTypeAdapter2;

  private final TypeAdapter<Metadata> mTypeAdapter3;

  public Comment$TypeAdapter(Gson gson) {
    this.mGson = gson;
    com.google.gson.reflect.TypeToken<java.util.Date> typeToken0 = com.google.gson.reflect.TypeToken.get(java.util.Date.class);
    this.mTypeAdapter0 = gson.getAdapter(com.vimeo.networking.model.Comment$CommentType$TypeAdapter.TYPE_TOKEN);
    this.mTypeAdapter1 = gson.getAdapter(typeToken0);
    this.mTypeAdapter2 = gson.getAdapter(com.vimeo.networking.model.User$TypeAdapter.TYPE_TOKEN);
    this.mTypeAdapter3 = gson.getAdapter(com.vimeo.networking.model.Metadata$TypeAdapter.TYPE_TOKEN);
  }

  @Override
  public void write(JsonWriter writer, Comment object) throws IOException {
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

    writer.name("type");
    if (object.mType != null)  {
      mTypeAdapter0.write(writer, object.mType);
    }
    else {
      writer.nullValue();
    }

    writer.name("created_on");
    if (object.mCreatedOn != null)  {
      mTypeAdapter1.write(writer, object.mCreatedOn);
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

    writer.name("user");
    if (object.mUser != null)  {
      mTypeAdapter2.write(writer, object.mUser);
    }
    else {
      writer.nullValue();
    }

    writer.name("metadata");
    if (object.mMetadata != null)  {
      mTypeAdapter3.write(writer, object.mMetadata);
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
  public Comment read(JsonReader reader) throws IOException {
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
    com.vimeo.networking.model.Comment object = new com.vimeo.networking.model.Comment();
    while (reader.hasNext()) {
      String name = reader.nextName();
      switch (name) {
        case "uri":
        	object.mUri = com.google.gson.internal.bind.TypeAdapters.STRING.read(reader);
        	break;
        case "type":
        	object.mType = mTypeAdapter0.read(reader);
        	break;
        case "created_on":
        	object.mCreatedOn = mTypeAdapter1.read(reader);
        	break;
        case "text":
        	object.mText = com.google.gson.internal.bind.TypeAdapters.STRING.read(reader);
        	break;
        case "user":
        	object.mUser = mTypeAdapter2.read(reader);
        	break;
        case "metadata":
        	object.mMetadata = mTypeAdapter3.read(reader);
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
