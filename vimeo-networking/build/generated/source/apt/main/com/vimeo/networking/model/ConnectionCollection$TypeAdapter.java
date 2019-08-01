package com.vimeo.networking.model;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.vimeo.networking.model.notifications.NotificationConnection;
import java.io.IOException;
import java.lang.Override;
import java.lang.SuppressWarnings;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class ConnectionCollection$TypeAdapter extends TypeAdapter<ConnectionCollection> {
  public static final TypeToken<ConnectionCollection> TYPE_TOKEN = TypeToken.get(com.vimeo.networking.model.ConnectionCollection.class);

  private final Gson mGson;

  private final TypeAdapter<Connection> mTypeAdapter0;

  private final TypeAdapter<NotificationConnection> mTypeAdapter1;

  private final TypeAdapter<Interaction> mTypeAdapter2;

  public ConnectionCollection$TypeAdapter(Gson gson) {
    this.mGson = gson;
    this.mTypeAdapter0 = gson.getAdapter(com.vimeo.networking.model.Connection$TypeAdapter.TYPE_TOKEN);
    this.mTypeAdapter1 = gson.getAdapter(com.vimeo.networking.model.notifications.NotificationConnection$TypeAdapter.TYPE_TOKEN);
    this.mTypeAdapter2 = gson.getAdapter(com.vimeo.networking.model.Interaction$TypeAdapter.TYPE_TOKEN);
  }

  @Override
  public void write(JsonWriter writer, ConnectionCollection object) throws IOException {
    if (object == null) {
      writer.nullValue();
      return;
    }
    writer.beginObject();

    writer.name("videos");
    if (object.mVideos != null)  {
      mTypeAdapter0.write(writer, object.mVideos);
    }
    else {
      writer.nullValue();
    }

    writer.name("categories");
    if (object.mCategories != null)  {
      mTypeAdapter0.write(writer, object.mCategories);
    }
    else {
      writer.nullValue();
    }

    writer.name("comments");
    if (object.mComments != null)  {
      mTypeAdapter0.write(writer, object.mComments);
    }
    else {
      writer.nullValue();
    }

    writer.name("credits");
    if (object.mCredits != null)  {
      mTypeAdapter0.write(writer, object.mCredits);
    }
    else {
      writer.nullValue();
    }

    writer.name("likes");
    if (object.mLikes != null)  {
      mTypeAdapter0.write(writer, object.mLikes);
    }
    else {
      writer.nullValue();
    }

    writer.name("pictures");
    if (object.mPictures != null)  {
      mTypeAdapter0.write(writer, object.mPictures);
    }
    else {
      writer.nullValue();
    }

    writer.name("texttracks");
    if (object.mTextTracks != null)  {
      mTypeAdapter0.write(writer, object.mTextTracks);
    }
    else {
      writer.nullValue();
    }

    writer.name("albums");
    if (object.mAlbums != null)  {
      mTypeAdapter0.write(writer, object.mAlbums);
    }
    else {
      writer.nullValue();
    }

    writer.name("channels");
    if (object.mChannels != null)  {
      mTypeAdapter0.write(writer, object.mChannels);
    }
    else {
      writer.nullValue();
    }

    writer.name("moderated_channels");
    if (object.mModeratedChannels != null)  {
      mTypeAdapter0.write(writer, object.mModeratedChannels);
    }
    else {
      writer.nullValue();
    }

    writer.name("feed");
    if (object.mFeed != null)  {
      mTypeAdapter0.write(writer, object.mFeed);
    }
    else {
      writer.nullValue();
    }

    writer.name("followers");
    if (object.mFollowers != null)  {
      mTypeAdapter0.write(writer, object.mFollowers);
    }
    else {
      writer.nullValue();
    }

    writer.name("following");
    if (object.mFollowing != null)  {
      mTypeAdapter0.write(writer, object.mFollowing);
    }
    else {
      writer.nullValue();
    }

    writer.name("groups");
    if (object.mGroups != null)  {
      mTypeAdapter0.write(writer, object.mGroups);
    }
    else {
      writer.nullValue();
    }

    writer.name("portfolios");
    if (object.mPortfolios != null)  {
      mTypeAdapter0.write(writer, object.mPortfolios);
    }
    else {
      writer.nullValue();
    }

    writer.name("shared");
    if (object.mShared != null)  {
      mTypeAdapter0.write(writer, object.mShared);
    }
    else {
      writer.nullValue();
    }

    writer.name("recommendations");
    if (object.mRecommendations != null)  {
      mTypeAdapter0.write(writer, object.mRecommendations);
    }
    else {
      writer.nullValue();
    }

    writer.name("appearances");
    if (object.mAppearances != null)  {
      mTypeAdapter0.write(writer, object.mAppearances);
    }
    else {
      writer.nullValue();
    }

    writer.name("related");
    if (object.mRelated != null)  {
      mTypeAdapter0.write(writer, object.mRelated);
    }
    else {
      writer.nullValue();
    }

    writer.name("replies");
    if (object.mReplies != null)  {
      mTypeAdapter0.write(writer, object.mReplies);
    }
    else {
      writer.nullValue();
    }

    writer.name("users");
    if (object.mUsers != null)  {
      mTypeAdapter0.write(writer, object.mUsers);
    }
    else {
      writer.nullValue();
    }

    writer.name("watchlater");
    if (object.mWatchlater != null)  {
      mTypeAdapter0.write(writer, object.mWatchlater);
    }
    else {
      writer.nullValue();
    }

    writer.name("ondemand");
    if (object.mTvod != null)  {
      mTypeAdapter0.write(writer, object.mTvod);
    }
    else {
      writer.nullValue();
    }

    writer.name("season");
    if (object.mSeason != null)  {
      mTypeAdapter0.write(writer, object.mSeason);
    }
    else {
      writer.nullValue();
    }

    writer.name("seasons");
    if (object.mSeasons != null)  {
      mTypeAdapter0.write(writer, object.mSeasons);
    }
    else {
      writer.nullValue();
    }

    writer.name("trailer");
    if (object.mTrailer != null)  {
      mTypeAdapter0.write(writer, object.mTrailer);
    }
    else {
      writer.nullValue();
    }

    writer.name("playback");
    if (object.mPlaybackFailureReason != null)  {
      mTypeAdapter0.write(writer, object.mPlaybackFailureReason);
    }
    else {
      writer.nullValue();
    }

    writer.name("recommended_channels");
    if (object.mRecommendedChannels != null)  {
      mTypeAdapter0.write(writer, object.mRecommendedChannels);
    }
    else {
      writer.nullValue();
    }

    writer.name("recommended_users");
    if (object.mRecommendedUsers != null)  {
      mTypeAdapter0.write(writer, object.mRecommendedUsers);
    }
    else {
      writer.nullValue();
    }

    writer.name("upload_attempt");
    if (object.getUploadAttempt() != null)  {
      mTypeAdapter0.write(writer, object.getUploadAttempt());
    }
    else {
      writer.nullValue();
    }

    writer.name("watched_videos");
    if (object.mWatchedVideos != null)  {
      mTypeAdapter0.write(writer, object.mWatchedVideos);
    }
    else {
      writer.nullValue();
    }

    writer.name("users_with_access");
    if (object.mUsersWithAccess != null)  {
      mTypeAdapter0.write(writer, object.mUsersWithAccess);
    }
    else {
      writer.nullValue();
    }

    writer.name("notifications");
    if (object.mNotifications != null)  {
      mTypeAdapter1.write(writer, object.mNotifications);
    }
    else {
      writer.nullValue();
    }

    writer.name("contents");
    if (object.mContents != null)  {
      mTypeAdapter0.write(writer, object.mContents);
    }
    else {
      writer.nullValue();
    }

    writer.name("folders");
    if (object.getFolders() != null)  {
      mTypeAdapter0.write(writer, object.getFolders());
    }
    else {
      writer.nullValue();
    }

    writer.name("live_stats");
    if (object.getLiveStats() != null)  {
      mTypeAdapter2.write(writer, object.getLiveStats());
    }
    else {
      writer.nullValue();
    }

    writer.endObject();
  }

  @Override
  public ConnectionCollection read(JsonReader reader) throws IOException {
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
    com.vimeo.networking.model.ConnectionCollection object = new com.vimeo.networking.model.ConnectionCollection();
    while (reader.hasNext()) {
      String name = reader.nextName();
      switch (name) {
        case "videos":
        	object.mVideos = mTypeAdapter0.read(reader);
        	break;
        case "categories":
        	object.mCategories = mTypeAdapter0.read(reader);
        	break;
        case "comments":
        	object.mComments = mTypeAdapter0.read(reader);
        	break;
        case "credits":
        	object.mCredits = mTypeAdapter0.read(reader);
        	break;
        case "likes":
        	object.mLikes = mTypeAdapter0.read(reader);
        	break;
        case "pictures":
        	object.mPictures = mTypeAdapter0.read(reader);
        	break;
        case "texttracks":
        	object.mTextTracks = mTypeAdapter0.read(reader);
        	break;
        case "albums":
        	object.mAlbums = mTypeAdapter0.read(reader);
        	break;
        case "channels":
        	object.mChannels = mTypeAdapter0.read(reader);
        	break;
        case "moderated_channels":
        	object.mModeratedChannels = mTypeAdapter0.read(reader);
        	break;
        case "feed":
        	object.mFeed = mTypeAdapter0.read(reader);
        	break;
        case "followers":
        	object.mFollowers = mTypeAdapter0.read(reader);
        	break;
        case "following":
        	object.mFollowing = mTypeAdapter0.read(reader);
        	break;
        case "groups":
        	object.mGroups = mTypeAdapter0.read(reader);
        	break;
        case "portfolios":
        	object.mPortfolios = mTypeAdapter0.read(reader);
        	break;
        case "shared":
        	object.mShared = mTypeAdapter0.read(reader);
        	break;
        case "recommendations":
        	object.mRecommendations = mTypeAdapter0.read(reader);
        	break;
        case "appearances":
        	object.mAppearances = mTypeAdapter0.read(reader);
        	break;
        case "related":
        	object.mRelated = mTypeAdapter0.read(reader);
        	break;
        case "replies":
        	object.mReplies = mTypeAdapter0.read(reader);
        	break;
        case "users":
        	object.mUsers = mTypeAdapter0.read(reader);
        	break;
        case "watchlater":
        	object.mWatchlater = mTypeAdapter0.read(reader);
        	break;
        case "ondemand":
        	object.mTvod = mTypeAdapter0.read(reader);
        	break;
        case "season":
        	object.mSeason = mTypeAdapter0.read(reader);
        	break;
        case "seasons":
        	object.mSeasons = mTypeAdapter0.read(reader);
        	break;
        case "trailer":
        	object.mTrailer = mTypeAdapter0.read(reader);
        	break;
        case "playback":
        	object.mPlaybackFailureReason = mTypeAdapter0.read(reader);
        	break;
        case "recommended_channels":
        	object.mRecommendedChannels = mTypeAdapter0.read(reader);
        	break;
        case "recommended_users":
        	object.mRecommendedUsers = mTypeAdapter0.read(reader);
        	break;
        case "upload_attempt":
        	object.setUploadAttempt(mTypeAdapter0.read(reader));
        	break;
        case "watched_videos":
        	object.mWatchedVideos = mTypeAdapter0.read(reader);
        	break;
        case "users_with_access":
        	object.mUsersWithAccess = mTypeAdapter0.read(reader);
        	break;
        case "notifications":
        	object.mNotifications = mTypeAdapter1.read(reader);
        	break;
        case "contents":
        	object.mContents = mTypeAdapter0.read(reader);
        	break;
        case "folders":
        	object.setFolders(mTypeAdapter0.read(reader));
        	break;
        case "live_stats":
        	object.setLiveStats(mTypeAdapter2.read(reader));
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
