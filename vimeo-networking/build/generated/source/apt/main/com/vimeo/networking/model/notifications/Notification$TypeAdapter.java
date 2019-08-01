package com.vimeo.networking.model.notifications;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.vimeo.networking.model.Comment;
import com.vimeo.networking.model.Credit;
import com.vimeo.networking.model.User;
import com.vimeo.networking.model.Video;
import java.io.IOException;
import java.lang.Override;
import java.lang.SuppressWarnings;
import java.util.Date;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class Notification$TypeAdapter extends TypeAdapter<Notification> {
  public static final TypeToken<Notification> TYPE_TOKEN = TypeToken.get(com.vimeo.networking.model.notifications.Notification.class);

  private final Gson mGson;

  private final TypeAdapter<Date> mTypeAdapter0;

  private final TypeAdapter<User> mTypeAdapter1;

  private final TypeAdapter<Comment> mTypeAdapter2;

  private final TypeAdapter<Video> mTypeAdapter3;

  private final TypeAdapter<Credit> mTypeAdapter4;

  public Notification$TypeAdapter(Gson gson) {
    this.mGson = gson;
    com.google.gson.reflect.TypeToken<java.util.Date> typeToken0 = com.google.gson.reflect.TypeToken.get(java.util.Date.class);
    this.mTypeAdapter0 = gson.getAdapter(typeToken0);
    this.mTypeAdapter1 = gson.getAdapter(com.vimeo.networking.model.User$TypeAdapter.TYPE_TOKEN);
    this.mTypeAdapter2 = gson.getAdapter(com.vimeo.networking.model.Comment$TypeAdapter.TYPE_TOKEN);
    this.mTypeAdapter3 = gson.getAdapter(com.vimeo.networking.model.Video$TypeAdapter.TYPE_TOKEN);
    this.mTypeAdapter4 = gson.getAdapter(com.vimeo.networking.model.Credit$TypeAdapter.TYPE_TOKEN);
  }

  @Override
  public void write(JsonWriter writer, Notification object) throws IOException {
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
    if (object.mCreatedDate != null)  {
      mTypeAdapter0.write(writer, object.mCreatedDate);
    }
    else {
      writer.nullValue();
    }

    writer.name("type");
    if (object.mType != null)  {
      com.google.gson.internal.bind.TypeAdapters.STRING.write(writer, object.mType);
    }
    else {
      throw new java.io.IOException("mType cannot be null");
    }

    writer.name("user");
    if (object.mUser != null)  {
      mTypeAdapter1.write(writer, object.mUser);
    }
    else {
      writer.nullValue();
    }

    writer.name("comment");
    if (object.mComment != null)  {
      mTypeAdapter2.write(writer, object.mComment);
    }
    else {
      writer.nullValue();
    }

    writer.name("clip");
    if (object.mVideo != null)  {
      mTypeAdapter3.write(writer, object.mVideo);
    }
    else {
      writer.nullValue();
    }

    writer.name("credit");
    if (object.mCredit != null)  {
      mTypeAdapter4.write(writer, object.mCredit);
    }
    else {
      writer.nullValue();
    }

    writer.name("new");
    writer.value(object.mIsNew);

    writer.name("seen");
    writer.value(object.mIsSeen);

    writer.endObject();
  }

  @Override
  public Notification read(JsonReader reader) throws IOException {
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
    com.vimeo.networking.model.notifications.Notification object = new com.vimeo.networking.model.notifications.Notification();
    while (reader.hasNext()) {
      String name = reader.nextName();
      switch (name) {
        case "uri":
        	object.mUri = com.google.gson.internal.bind.TypeAdapters.STRING.read(reader);
        	break;
        case "created_time":
        	object.mCreatedDate = mTypeAdapter0.read(reader);
        	break;
        case "type":
        	object.mType = com.google.gson.internal.bind.TypeAdapters.STRING.read(reader);
        	break;
        case "user":
        	object.mUser = mTypeAdapter1.read(reader);
        	break;
        case "comment":
        	object.mComment = mTypeAdapter2.read(reader);
        	break;
        case "clip":
        	object.mVideo = mTypeAdapter3.read(reader);
        	break;
        case "credit":
        	object.mCredit = mTypeAdapter4.read(reader);
        	break;
        case "new":
        	object.mIsNew = com.vimeo.stag.KnownTypeAdapters.PrimitiveBooleanTypeAdapter.read(reader, object.mIsNew);
        	break;
        case "seen":
        	object.mIsSeen = com.vimeo.stag.KnownTypeAdapters.PrimitiveBooleanTypeAdapter.read(reader, object.mIsSeen);
        	break;
        default:
        reader.skipValue();
        break;
      }
    }
    reader.endObject();
    if (object.mType == null) {
      throw new java.io.IOException("mType cannot be null");
    }
    return object;
  }
}
