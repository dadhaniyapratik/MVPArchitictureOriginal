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
public final class FeedItem$TypeAdapter extends TypeAdapter<FeedItem> {
  public static final TypeToken<FeedItem> TYPE_TOKEN = TypeToken.get(com.vimeo.networking.model.FeedItem.class);

  private final Gson mGson;

  private final TypeAdapter<Video> mTypeAdapter0;

  private final TypeAdapter<Date> mTypeAdapter1;

  private final TypeAdapter<User> mTypeAdapter2;

  private final TypeAdapter<Channel> mTypeAdapter3;

  private final TypeAdapter<Category> mTypeAdapter4;

  private final TypeAdapter<Tag> mTypeAdapter5;

  private final TypeAdapter<Group> mTypeAdapter6;

  private final TypeAdapter<Metadata> mTypeAdapter7;

  public FeedItem$TypeAdapter(Gson gson) {
    this.mGson = gson;
    com.google.gson.reflect.TypeToken<java.util.Date> typeToken0 = com.google.gson.reflect.TypeToken.get(java.util.Date.class);
    this.mTypeAdapter0 = gson.getAdapter(com.vimeo.networking.model.Video$TypeAdapter.TYPE_TOKEN);
    this.mTypeAdapter1 = gson.getAdapter(typeToken0);
    this.mTypeAdapter2 = gson.getAdapter(com.vimeo.networking.model.User$TypeAdapter.TYPE_TOKEN);
    this.mTypeAdapter3 = gson.getAdapter(com.vimeo.networking.model.Channel$TypeAdapter.TYPE_TOKEN);
    this.mTypeAdapter4 = gson.getAdapter(com.vimeo.networking.model.Category$TypeAdapter.TYPE_TOKEN);
    this.mTypeAdapter5 = gson.getAdapter(com.vimeo.networking.model.Tag$TypeAdapter.TYPE_TOKEN);
    this.mTypeAdapter6 = gson.getAdapter(com.vimeo.networking.model.Group$TypeAdapter.TYPE_TOKEN);
    this.mTypeAdapter7 = gson.getAdapter(com.vimeo.networking.model.Metadata$TypeAdapter.TYPE_TOKEN);
  }

  @Override
  public void write(JsonWriter writer, FeedItem object) throws IOException {
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

    writer.name("clip");
    if (object.mClip != null)  {
      mTypeAdapter0.write(writer, object.mClip);
    }
    else {
      writer.nullValue();
    }

    writer.name("type");
    if (object.mType != null)  {
      com.google.gson.internal.bind.TypeAdapters.STRING.write(writer, object.mType);
    }
    else {
      writer.nullValue();
    }

    writer.name("time");
    if (object.mTime != null)  {
      mTypeAdapter1.write(writer, object.mTime);
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

    writer.name("channel");
    if (object.mChannel != null)  {
      mTypeAdapter3.write(writer, object.mChannel);
    }
    else {
      writer.nullValue();
    }

    writer.name("category");
    if (object.mCategory != null)  {
      mTypeAdapter4.write(writer, object.mCategory);
    }
    else {
      writer.nullValue();
    }

    writer.name("tag");
    if (object.mTag != null)  {
      mTypeAdapter5.write(writer, object.mTag);
    }
    else {
      writer.nullValue();
    }

    writer.name("group");
    if (object.mGroup != null)  {
      mTypeAdapter6.write(writer, object.mGroup);
    }
    else {
      writer.nullValue();
    }

    writer.name("metadata");
    if (object.mMetadata != null)  {
      mTypeAdapter7.write(writer, object.mMetadata);
    }
    else {
      writer.nullValue();
    }

    writer.endObject();
  }

  @Override
  public FeedItem read(JsonReader reader) throws IOException {
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
    com.vimeo.networking.model.FeedItem object = new com.vimeo.networking.model.FeedItem();
    while (reader.hasNext()) {
      String name = reader.nextName();
      switch (name) {
        case "uri":
        	object.mUri = com.google.gson.internal.bind.TypeAdapters.STRING.read(reader);
        	break;
        case "clip":
        	object.mClip = mTypeAdapter0.read(reader);
        	break;
        case "type":
        	object.mType = com.google.gson.internal.bind.TypeAdapters.STRING.read(reader);
        	break;
        case "time":
        	object.mTime = mTypeAdapter1.read(reader);
        	break;
        case "user":
        	object.mUser = mTypeAdapter2.read(reader);
        	break;
        case "channel":
        	object.mChannel = mTypeAdapter3.read(reader);
        	break;
        case "category":
        	object.mCategory = mTypeAdapter4.read(reader);
        	break;
        case "tag":
        	object.mTag = mTypeAdapter5.read(reader);
        	break;
        case "group":
        	object.mGroup = mTypeAdapter6.read(reader);
        	break;
        case "metadata":
        	object.mMetadata = mTypeAdapter7.read(reader);
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
