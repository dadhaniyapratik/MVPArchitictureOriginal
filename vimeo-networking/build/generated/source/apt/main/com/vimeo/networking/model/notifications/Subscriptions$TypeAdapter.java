package com.vimeo.networking.model.notifications;

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
public final class Subscriptions$TypeAdapter extends TypeAdapter<Subscriptions> {
  public static final TypeToken<Subscriptions> TYPE_TOKEN = TypeToken.get(com.vimeo.networking.model.notifications.Subscriptions.class);

  private final Gson mGson;

  public Subscriptions$TypeAdapter(Gson gson) {
    this.mGson = gson;
  }

  @Override
  public void write(JsonWriter writer, Subscriptions object) throws IOException {
    if (object == null) {
      writer.nullValue();
      return;
    }
    writer.beginObject();

    writer.name("comment");
    writer.value(object.mComment);

    writer.name("credit");
    writer.value(object.mCredit);

    writer.name("like");
    writer.value(object.mLike);

    writer.name("reply");
    writer.value(object.mReply);

    writer.name("follow");
    writer.value(object.mFollow);

    writer.name("video_available");
    writer.value(object.mVideoAvailable);

    writer.name("followed_user_video_available");
    writer.value(object.mFollowedUserVideoAvailable);

    writer.endObject();
  }

  @Override
  public Subscriptions read(JsonReader reader) throws IOException {
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
    com.vimeo.networking.model.notifications.Subscriptions object = new com.vimeo.networking.model.notifications.Subscriptions();
    while (reader.hasNext()) {
      String name = reader.nextName();
      switch (name) {
        case "comment":
        	object.mComment = com.vimeo.stag.KnownTypeAdapters.PrimitiveBooleanTypeAdapter.read(reader, object.mComment);
        	break;
        case "credit":
        	object.mCredit = com.vimeo.stag.KnownTypeAdapters.PrimitiveBooleanTypeAdapter.read(reader, object.mCredit);
        	break;
        case "like":
        	object.mLike = com.vimeo.stag.KnownTypeAdapters.PrimitiveBooleanTypeAdapter.read(reader, object.mLike);
        	break;
        case "reply":
        	object.mReply = com.vimeo.stag.KnownTypeAdapters.PrimitiveBooleanTypeAdapter.read(reader, object.mReply);
        	break;
        case "follow":
        	object.mFollow = com.vimeo.stag.KnownTypeAdapters.PrimitiveBooleanTypeAdapter.read(reader, object.mFollow);
        	break;
        case "video_available":
        	object.mVideoAvailable = com.vimeo.stag.KnownTypeAdapters.PrimitiveBooleanTypeAdapter.read(reader, object.mVideoAvailable);
        	break;
        case "followed_user_video_available":
        	object.mFollowedUserVideoAvailable = com.vimeo.stag.KnownTypeAdapters.PrimitiveBooleanTypeAdapter.read(reader, object.mFollowedUserVideoAvailable);
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
