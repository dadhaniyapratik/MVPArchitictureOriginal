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
public final class NotificationConnection$NotificationTypeCount$TypeAdapter extends TypeAdapter<NotificationConnection.NotificationTypeCount> {
  public static final TypeToken<NotificationConnection.NotificationTypeCount> TYPE_TOKEN = TypeToken.get(com.vimeo.networking.model.notifications.NotificationConnection.NotificationTypeCount.class);

  private final Gson mGson;

  public NotificationConnection$NotificationTypeCount$TypeAdapter(Gson gson) {
    this.mGson = gson;
  }

  @Override
  public void write(JsonWriter writer, NotificationConnection.NotificationTypeCount object) throws
      IOException {
    if (object == null) {
      writer.nullValue();
      return;
    }
    writer.beginObject();

    writer.name("comment");
    writer.value(object.mCommentTotal);

    writer.name("credit");
    writer.value(object.mCreditTotal);

    writer.name("like");
    writer.value(object.mLikeTotal);

    writer.name("share");
    writer.value(object.mShareTotal);

    writer.name("video_available");
    writer.value(object.mVideoAvailableTotal);

    writer.name("followed_user_video_available");
    writer.value(object.mFollowedUserVideoAvailableTotal);

    writer.name("mention");
    writer.value(object.mMentionTotal);

    writer.name("reply");
    writer.value(object.mReplyTotal);

    writer.name("storage_warning");
    writer.value(object.mStorageWarningTotal);

    writer.name("follow");
    writer.value(object.mFollowTotal);

    writer.name("account_expiration_warning");
    writer.value(object.mAccountExpirationWarningTotal);

    writer.name("vod_purchase");
    writer.value(object.mTvodPurchaseTotal);

    writer.name("vod_preorder_available");
    writer.value(object.mTvodPreorderAvailableTotal);

    writer.name("vod_rental_expiration_warning");
    writer.value(object.mTvodRentailExpirationWarningTotal);

    writer.endObject();
  }

  @Override
  public NotificationConnection.NotificationTypeCount read(JsonReader reader) throws IOException {
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
    com.vimeo.networking.model.notifications.NotificationConnection.NotificationTypeCount object = new com.vimeo.networking.model.notifications.NotificationConnection.NotificationTypeCount();
    while (reader.hasNext()) {
      String name = reader.nextName();
      switch (name) {
        case "comment":
        	object.mCommentTotal = com.vimeo.stag.KnownTypeAdapters.PrimitiveIntTypeAdapter.read(reader, object.mCommentTotal);
        	break;
        case "credit":
        	object.mCreditTotal = com.vimeo.stag.KnownTypeAdapters.PrimitiveIntTypeAdapter.read(reader, object.mCreditTotal);
        	break;
        case "like":
        	object.mLikeTotal = com.vimeo.stag.KnownTypeAdapters.PrimitiveIntTypeAdapter.read(reader, object.mLikeTotal);
        	break;
        case "share":
        	object.mShareTotal = com.vimeo.stag.KnownTypeAdapters.PrimitiveIntTypeAdapter.read(reader, object.mShareTotal);
        	break;
        case "video_available":
        	object.mVideoAvailableTotal = com.vimeo.stag.KnownTypeAdapters.PrimitiveIntTypeAdapter.read(reader, object.mVideoAvailableTotal);
        	break;
        case "followed_user_video_available":
        	object.mFollowedUserVideoAvailableTotal = com.vimeo.stag.KnownTypeAdapters.PrimitiveIntTypeAdapter.read(reader, object.mFollowedUserVideoAvailableTotal);
        	break;
        case "mention":
        	object.mMentionTotal = com.vimeo.stag.KnownTypeAdapters.PrimitiveIntTypeAdapter.read(reader, object.mMentionTotal);
        	break;
        case "reply":
        	object.mReplyTotal = com.vimeo.stag.KnownTypeAdapters.PrimitiveIntTypeAdapter.read(reader, object.mReplyTotal);
        	break;
        case "storage_warning":
        	object.mStorageWarningTotal = com.vimeo.stag.KnownTypeAdapters.PrimitiveIntTypeAdapter.read(reader, object.mStorageWarningTotal);
        	break;
        case "follow":
        	object.mFollowTotal = com.vimeo.stag.KnownTypeAdapters.PrimitiveIntTypeAdapter.read(reader, object.mFollowTotal);
        	break;
        case "account_expiration_warning":
        	object.mAccountExpirationWarningTotal = com.vimeo.stag.KnownTypeAdapters.PrimitiveIntTypeAdapter.read(reader, object.mAccountExpirationWarningTotal);
        	break;
        case "vod_purchase":
        	object.mTvodPurchaseTotal = com.vimeo.stag.KnownTypeAdapters.PrimitiveIntTypeAdapter.read(reader, object.mTvodPurchaseTotal);
        	break;
        case "vod_preorder_available":
        	object.mTvodPreorderAvailableTotal = com.vimeo.stag.KnownTypeAdapters.PrimitiveIntTypeAdapter.read(reader, object.mTvodPreorderAvailableTotal);
        	break;
        case "vod_rental_expiration_warning":
        	object.mTvodRentailExpirationWarningTotal = com.vimeo.stag.KnownTypeAdapters.PrimitiveIntTypeAdapter.read(reader, object.mTvodRentailExpirationWarningTotal);
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
