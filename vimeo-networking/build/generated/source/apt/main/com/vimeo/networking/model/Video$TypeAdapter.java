package com.vimeo.networking.model;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.vimeo.networking.model.live.Live;
import com.vimeo.networking.model.playback.Play;
import com.vimeo.networking.upload.Upload;
import java.io.IOException;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Date;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class Video$TypeAdapter extends TypeAdapter<Video> {
  public static final TypeToken<Video> TYPE_TOKEN = TypeToken.get(com.vimeo.networking.model.Video.class);

  private final Gson mGson;

  private final TypeAdapter<Embed> mTypeAdapter0;

  private final TypeAdapter<Date> mTypeAdapter1;

  private final TypeAdapter<ArrayList<String>> mTypeAdapter2;

  private final TypeAdapter<Privacy> mTypeAdapter3;

  private final TypeAdapter<PictureCollection> mTypeAdapter4;

  private final TypeAdapter<Tag> mTypeAdapter5;

  private final TypeAdapter<ArrayList<Tag>> mTypeAdapter6;

  private final TypeAdapter<StatsCollection> mTypeAdapter7;

  private final TypeAdapter<Metadata> mTypeAdapter8;

  private final TypeAdapter<User> mTypeAdapter9;

  private final TypeAdapter<Video.Status> mTypeAdapter10;

  private final TypeAdapter<Category> mTypeAdapter11;

  private final TypeAdapter<ArrayList<Category>> mTypeAdapter12;

  private final TypeAdapter<ReviewPage> mTypeAdapter13;

  private final TypeAdapter<FileTransferPage> mTypeAdapter14;

  private final TypeAdapter<Play> mTypeAdapter15;

  private final TypeAdapter<VideoBadge> mTypeAdapter16;

  private final TypeAdapter<Spatial> mTypeAdapter17;

  private final TypeAdapter<Live> mTypeAdapter18;

  private final TypeAdapter<Upload> mTypeAdapter19;

  public Video$TypeAdapter(Gson gson) {
    this.mGson = gson;
    com.google.gson.reflect.TypeToken<java.util.Date> typeToken0 = com.google.gson.reflect.TypeToken.get(java.util.Date.class);
    com.google.gson.reflect.TypeToken<com.vimeo.networking.model.Privacy> typeToken1 = com.google.gson.reflect.TypeToken.get(com.vimeo.networking.model.Privacy.class);
    this.mTypeAdapter0 = gson.getAdapter(com.vimeo.networking.model.Embed$TypeAdapter.TYPE_TOKEN);
    this.mTypeAdapter1 = gson.getAdapter(typeToken0);
    this.mTypeAdapter2 = new com.vimeo.stag.KnownTypeAdapters.ListTypeAdapter<java.lang.String,java.util.ArrayList<java.lang.String>>(com.google.gson.internal.bind.TypeAdapters.STRING, new com.vimeo.stag.KnownTypeAdapters.ArrayListInstantiator<java.lang.String>());
    this.mTypeAdapter3 = gson.getAdapter(typeToken1);
    this.mTypeAdapter4 = gson.getAdapter(com.vimeo.networking.model.PictureCollection$TypeAdapter.TYPE_TOKEN);
    this.mTypeAdapter5 = gson.getAdapter(com.vimeo.networking.model.Tag$TypeAdapter.TYPE_TOKEN);
    this.mTypeAdapter6 = new com.vimeo.stag.KnownTypeAdapters.ListTypeAdapter<com.vimeo.networking.model.Tag,java.util.ArrayList<com.vimeo.networking.model.Tag>>(mTypeAdapter5, new com.vimeo.stag.KnownTypeAdapters.ArrayListInstantiator<com.vimeo.networking.model.Tag>());
    this.mTypeAdapter7 = gson.getAdapter(com.vimeo.networking.model.StatsCollection$TypeAdapter.TYPE_TOKEN);
    this.mTypeAdapter8 = gson.getAdapter(com.vimeo.networking.model.Metadata$TypeAdapter.TYPE_TOKEN);
    this.mTypeAdapter9 = gson.getAdapter(com.vimeo.networking.model.User$TypeAdapter.TYPE_TOKEN);
    this.mTypeAdapter10 = gson.getAdapter(com.vimeo.networking.model.Video$Status$TypeAdapter.TYPE_TOKEN);
    this.mTypeAdapter11 = gson.getAdapter(com.vimeo.networking.model.Category$TypeAdapter.TYPE_TOKEN);
    this.mTypeAdapter12 = new com.vimeo.stag.KnownTypeAdapters.ListTypeAdapter<com.vimeo.networking.model.Category,java.util.ArrayList<com.vimeo.networking.model.Category>>(mTypeAdapter11, new com.vimeo.stag.KnownTypeAdapters.ArrayListInstantiator<com.vimeo.networking.model.Category>());
    this.mTypeAdapter13 = gson.getAdapter(com.vimeo.networking.model.ReviewPage$TypeAdapter.TYPE_TOKEN);
    this.mTypeAdapter14 = gson.getAdapter(com.vimeo.networking.model.FileTransferPage$TypeAdapter.TYPE_TOKEN);
    this.mTypeAdapter15 = gson.getAdapter(com.vimeo.networking.model.playback.Play$TypeAdapter.TYPE_TOKEN);
    this.mTypeAdapter16 = gson.getAdapter(com.vimeo.networking.model.VideoBadge$TypeAdapter.TYPE_TOKEN);
    this.mTypeAdapter17 = gson.getAdapter(com.vimeo.networking.model.Spatial$TypeAdapter.TYPE_TOKEN);
    this.mTypeAdapter18 = gson.getAdapter(com.vimeo.networking.model.live.Live$TypeAdapter.TYPE_TOKEN);
    this.mTypeAdapter19 = gson.getAdapter(com.vimeo.networking.upload.Upload$TypeAdapter.TYPE_TOKEN);
  }

  @Override
  public void write(JsonWriter writer, Video object) throws IOException {
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

    writer.name("duration");
    writer.value(object.mDuration);

    writer.name("width");
    writer.value(object.mWidth);

    writer.name("height");
    writer.value(object.mHeight);

    writer.name("embed");
    if (object.mEmbed != null)  {
      mTypeAdapter0.write(writer, object.mEmbed);
    }
    else {
      writer.nullValue();
    }

    writer.name("language");
    if (object.mLanguage != null)  {
      com.google.gson.internal.bind.TypeAdapters.STRING.write(writer, object.mLanguage);
    }
    else {
      writer.nullValue();
    }

    writer.name("created_time");
    if (object.mCreatedTime != null)  {
      mTypeAdapter1.write(writer, object.mCreatedTime);
    }
    else {
      writer.nullValue();
    }

    writer.name("modified_time");
    if (object.mModifiedTime != null)  {
      mTypeAdapter1.write(writer, object.mModifiedTime);
    }
    else {
      writer.nullValue();
    }

    writer.name("release_time");
    if (object.mReleaseTime != null)  {
      mTypeAdapter1.write(writer, object.mReleaseTime);
    }
    else {
      writer.nullValue();
    }

    writer.name("content_rating");
    if (object.mContentRating != null)  {
      mTypeAdapter2.write(writer, object.mContentRating);
    }
    else {
      writer.nullValue();
    }

    writer.name("license");
    if (object.mLicense != null)  {
      com.google.gson.internal.bind.TypeAdapters.STRING.write(writer, object.mLicense);
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

    writer.name("pictures");
    if (object.mPictures != null)  {
      mTypeAdapter4.write(writer, object.mPictures);
    }
    else {
      writer.nullValue();
    }

    writer.name("tags");
    if (object.mTags != null)  {
      mTypeAdapter6.write(writer, object.mTags);
    }
    else {
      writer.nullValue();
    }

    writer.name("stats");
    if (object.mStats != null)  {
      mTypeAdapter7.write(writer, object.mStats);
    }
    else {
      writer.nullValue();
    }

    writer.name("metadata");
    if (object.mMetadata != null)  {
      mTypeAdapter8.write(writer, object.mMetadata);
    }
    else {
      writer.nullValue();
    }

    writer.name("user");
    if (object.mUser != null)  {
      mTypeAdapter9.write(writer, object.mUser);
    }
    else {
      writer.nullValue();
    }

    writer.name("status");
    if (object.mStatus != null)  {
      mTypeAdapter10.write(writer, object.mStatus);
    }
    else {
      writer.nullValue();
    }

    writer.name("categories");
    if (object.mCategories != null)  {
      mTypeAdapter12.write(writer, object.mCategories);
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

    writer.name("review_page");
    if (object.getReviewPage() != null)  {
      mTypeAdapter13.write(writer, object.getReviewPage());
    }
    else {
      writer.nullValue();
    }

    writer.name("file_transfer");
    if (object.getFileTransferPage() != null)  {
      mTypeAdapter14.write(writer, object.getFileTransferPage());
    }
    else {
      writer.nullValue();
    }

    writer.name("play");
    if (object.mPlay != null)  {
      mTypeAdapter15.write(writer, object.mPlay);
    }
    else {
      writer.nullValue();
    }

    writer.name("badge");
    if (object.mVideoBadge != null)  {
      mTypeAdapter16.write(writer, object.mVideoBadge);
    }
    else {
      writer.nullValue();
    }

    writer.name("spatial");
    if (object.mSpatial != null)  {
      mTypeAdapter17.write(writer, object.mSpatial);
    }
    else {
      writer.nullValue();
    }

    writer.name("live");
    if (object.mLive != null)  {
      mTypeAdapter18.write(writer, object.mLive);
    }
    else {
      writer.nullValue();
    }

    writer.name("resource_key");
    if (object.mResourceKey != null)  {
      com.google.gson.internal.bind.TypeAdapters.STRING.write(writer, object.mResourceKey);
    }
    else {
      writer.nullValue();
    }

    writer.name("upload");
    if (object.getUpload() != null)  {
      mTypeAdapter19.write(writer, object.getUpload());
    }
    else {
      writer.nullValue();
    }

    writer.endObject();
  }

  @Override
  public Video read(JsonReader reader) throws IOException {
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
    com.vimeo.networking.model.Video object = new com.vimeo.networking.model.Video();
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
        case "duration":
        	object.mDuration = com.vimeo.stag.KnownTypeAdapters.PrimitiveIntTypeAdapter.read(reader, object.mDuration);
        	break;
        case "width":
        	object.mWidth = com.vimeo.stag.KnownTypeAdapters.PrimitiveIntTypeAdapter.read(reader, object.mWidth);
        	break;
        case "height":
        	object.mHeight = com.vimeo.stag.KnownTypeAdapters.PrimitiveIntTypeAdapter.read(reader, object.mHeight);
        	break;
        case "embed":
        	object.mEmbed = mTypeAdapter0.read(reader);
        	break;
        case "language":
        	object.mLanguage = com.google.gson.internal.bind.TypeAdapters.STRING.read(reader);
        	break;
        case "created_time":
        	object.mCreatedTime = mTypeAdapter1.read(reader);
        	break;
        case "modified_time":
        	object.mModifiedTime = mTypeAdapter1.read(reader);
        	break;
        case "release_time":
        	object.mReleaseTime = mTypeAdapter1.read(reader);
        	break;
        case "content_rating":
        	object.mContentRating = mTypeAdapter2.read(reader);
        	break;
        case "license":
        	object.mLicense = com.google.gson.internal.bind.TypeAdapters.STRING.read(reader);
        	break;
        case "privacy":
        	object.mPrivacy = mTypeAdapter3.read(reader);
        	break;
        case "pictures":
        	object.mPictures = mTypeAdapter4.read(reader);
        	break;
        case "tags":
        	object.mTags = mTypeAdapter6.read(reader);
        	break;
        case "stats":
        	object.mStats = mTypeAdapter7.read(reader);
        	break;
        case "metadata":
        	object.mMetadata = mTypeAdapter8.read(reader);
        	break;
        case "user":
        	object.mUser = mTypeAdapter9.read(reader);
        	break;
        case "status":
        	object.mStatus = mTypeAdapter10.read(reader);
        	break;
        case "categories":
        	object.mCategories = mTypeAdapter12.read(reader);
        	break;
        case "password":
        	object.mPassword = com.google.gson.internal.bind.TypeAdapters.STRING.read(reader);
        	break;
        case "review_page":
        	object.setReviewPage(mTypeAdapter13.read(reader));
        	break;
        case "file_transfer":
        	object.setFileTransferPage(mTypeAdapter14.read(reader));
        	break;
        case "play":
        	object.mPlay = mTypeAdapter15.read(reader);
        	break;
        case "badge":
        case "m_video_badge":
        	object.mVideoBadge = mTypeAdapter16.read(reader);
        	break;
        case "spatial":
        	object.mSpatial = mTypeAdapter17.read(reader);
        	break;
        case "live":
        	object.mLive = mTypeAdapter18.read(reader);
        	break;
        case "resource_key":
        	object.mResourceKey = com.google.gson.internal.bind.TypeAdapters.STRING.read(reader);
        	break;
        case "upload":
        	object.setUpload(mTypeAdapter19.read(reader));
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
