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
public final class InteractionCollection$TypeAdapter extends TypeAdapter<InteractionCollection> {
  public static final TypeToken<InteractionCollection> TYPE_TOKEN = TypeToken.get(com.vimeo.networking.model.InteractionCollection.class);

  private final Gson mGson;

  private final TypeAdapter<Interaction> mTypeAdapter0;

  public InteractionCollection$TypeAdapter(Gson gson) {
    this.mGson = gson;
    this.mTypeAdapter0 = gson.getAdapter(com.vimeo.networking.model.Interaction$TypeAdapter.TYPE_TOKEN);
  }

  @Override
  public void write(JsonWriter writer, InteractionCollection object) throws IOException {
    if (object == null) {
      writer.nullValue();
      return;
    }
    writer.beginObject();

    writer.name("watchlater");
    if (object.mWatchLater != null)  {
      mTypeAdapter0.write(writer, object.mWatchLater);
    }
    else {
      writer.nullValue();
    }

    writer.name("like");
    if (object.mLike != null)  {
      mTypeAdapter0.write(writer, object.mLike);
    }
    else {
      writer.nullValue();
    }

    writer.name("follow");
    if (object.mFollow != null)  {
      mTypeAdapter0.write(writer, object.mFollow);
    }
    else {
      writer.nullValue();
    }

    writer.name("buy");
    if (object.mBuy != null)  {
      mTypeAdapter0.write(writer, object.mBuy);
    }
    else {
      writer.nullValue();
    }

    writer.name("purchase");
    if (object.mPurchase != null)  {
      mTypeAdapter0.write(writer, object.mPurchase);
    }
    else {
      writer.nullValue();
    }

    writer.name("rent");
    if (object.mRent != null)  {
      mTypeAdapter0.write(writer, object.mRent);
    }
    else {
      writer.nullValue();
    }

    writer.name("subscribe");
    if (object.mSubscribe != null)  {
      mTypeAdapter0.write(writer, object.mSubscribe);
    }
    else {
      writer.nullValue();
    }

    writer.name("channel");
    if (object.mChannelMembership != null)  {
      mTypeAdapter0.write(writer, object.mChannelMembership);
    }
    else {
      writer.nullValue();
    }

    writer.name("report");
    if (object.getReport() != null)  {
      mTypeAdapter0.write(writer, object.getReport());
    }
    else {
      writer.nullValue();
    }

    writer.name("add_moderators");
    if (object.getAddModerators() != null)  {
      mTypeAdapter0.write(writer, object.getAddModerators());
    }
    else {
      writer.nullValue();
    }

    writer.name("moderate_videos");
    if (object.getModerateVideos() != null)  {
      mTypeAdapter0.write(writer, object.getModerateVideos());
    }
    else {
      writer.nullValue();
    }

    writer.name("add_logos");
    if (object.getAddLogos() != null)  {
      mTypeAdapter0.write(writer, object.getAddLogos());
    }
    else {
      writer.nullValue();
    }

    writer.name("add_videos");
    if (object.getAddVideos() != null)  {
      mTypeAdapter0.write(writer, object.getAddVideos());
    }
    else {
      writer.nullValue();
    }

    writer.endObject();
  }

  @Override
  public InteractionCollection read(JsonReader reader) throws IOException {
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
    com.vimeo.networking.model.InteractionCollection object = new com.vimeo.networking.model.InteractionCollection();
    while (reader.hasNext()) {
      String name = reader.nextName();
      switch (name) {
        case "watchlater":
        	object.mWatchLater = mTypeAdapter0.read(reader);
        	break;
        case "like":
        	object.mLike = mTypeAdapter0.read(reader);
        	break;
        case "follow":
        	object.mFollow = mTypeAdapter0.read(reader);
        	break;
        case "buy":
        	object.mBuy = mTypeAdapter0.read(reader);
        	break;
        case "purchase":
        	object.mPurchase = mTypeAdapter0.read(reader);
        	break;
        case "rent":
        	object.mRent = mTypeAdapter0.read(reader);
        	break;
        case "subscribe":
        	object.mSubscribe = mTypeAdapter0.read(reader);
        	break;
        case "channel":
        	object.mChannelMembership = mTypeAdapter0.read(reader);
        	break;
        case "report":
        	object.setReport(mTypeAdapter0.read(reader));
        	break;
        case "add_moderators":
        	object.setAddModerators(mTypeAdapter0.read(reader));
        	break;
        case "moderate_videos":
        	object.setModerateVideos(mTypeAdapter0.read(reader));
        	break;
        case "add_logos":
        	object.setAddLogos(mTypeAdapter0.read(reader));
        	break;
        case "add_videos":
        	object.setAddVideos(mTypeAdapter0.read(reader));
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
