package com.vimeo.networking.model;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import java.lang.Override;
import java.lang.SuppressWarnings;

public final class StagFactory implements TypeAdapterFactory {
  @SuppressWarnings({
      "unchecked",
      "rawtypes"
  })
  @Override
  public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
    Class<? super T> clazz = type.getRawType();
    if (clazz == com.vimeo.networking.model.TrialEligibility.class) {
      return (TypeAdapter<T>) new com.vimeo.networking.model.TrialEligibility$TypeAdapter(gson);
    }
    if (clazz == com.vimeo.networking.model.VideoList.class) {
      return (TypeAdapter<T>) new com.vimeo.networking.model.VideoList$TypeAdapter(gson);
    }
    if (clazz == com.vimeo.networking.model.ProgressiveVideoFile.MimeType.class) {
      return (TypeAdapter<T>) new com.vimeo.networking.model.ProgressiveVideoFile$MimeType$TypeAdapter(gson);
    }
    if (clazz == com.vimeo.networking.model.Connection.class) {
      return (TypeAdapter<T>) new com.vimeo.networking.model.Connection$TypeAdapter(gson);
    }
    if (clazz == com.vimeo.networking.model.ProgressiveVideoFile.class) {
      return (TypeAdapter<T>) new com.vimeo.networking.model.ProgressiveVideoFile$TypeAdapter(gson);
    }
    if (clazz == com.vimeo.networking.model.UserBadge.class) {
      return (TypeAdapter<T>) new com.vimeo.networking.model.UserBadge$TypeAdapter(gson);
    }
    if (clazz == com.vimeo.networking.model.PinCodeInfo.class) {
      return (TypeAdapter<T>) new com.vimeo.networking.model.PinCodeInfo$TypeAdapter(gson);
    }
    if (clazz == com.vimeo.networking.model.Document.class) {
      return (TypeAdapter<T>) new com.vimeo.networking.model.Document$TypeAdapter(gson);
    }
    if (clazz == com.vimeo.networking.model.VimeoAccount.class) {
      return (TypeAdapter<T>) new com.vimeo.networking.model.VimeoAccount$TypeAdapter(gson);
    }
    if (clazz == com.vimeo.networking.model.AlbumPrivacy.class) {
      return (TypeAdapter<T>) new com.vimeo.networking.model.AlbumPrivacy$TypeAdapter(gson);
    }
    if (clazz == com.vimeo.networking.model.FeedItem.class) {
      return (TypeAdapter<T>) new com.vimeo.networking.model.FeedItem$TypeAdapter(gson);
    }
    if (clazz == com.vimeo.networking.model.PictureCollection.class) {
      return (TypeAdapter<T>) new com.vimeo.networking.model.PictureCollection$TypeAdapter(gson);
    }
    if (clazz == com.vimeo.networking.model.TextTrackList.class) {
      return (TypeAdapter<T>) new com.vimeo.networking.model.TextTrackList$TypeAdapter(gson);
    }
    if (clazz == com.vimeo.networking.model.Paging.class) {
      return (TypeAdapter<T>) new com.vimeo.networking.model.Paging$TypeAdapter(gson);
    }
    if (clazz == com.vimeo.networking.model.Spatial.class) {
      return (TypeAdapter<T>) new com.vimeo.networking.model.Spatial$TypeAdapter(gson);
    }
    if (clazz == com.vimeo.networking.model.Recommendation.class) {
      return (TypeAdapter<T>) new com.vimeo.networking.model.Recommendation$TypeAdapter(gson);
    }
    if (clazz == com.vimeo.networking.model.ReviewPage.class) {
      return (TypeAdapter<T>) new com.vimeo.networking.model.ReviewPage$TypeAdapter(gson);
    }
    if (clazz == com.vimeo.networking.model.Metadata.class) {
      return (TypeAdapter<T>) new com.vimeo.networking.model.Metadata$TypeAdapter(gson);
    }
    if (clazz == com.vimeo.networking.model.Interaction.IapStatus.class) {
      return (TypeAdapter<T>) new com.vimeo.networking.model.Interaction$IapStatus$TypeAdapter(gson);
    }
    if (clazz == com.vimeo.networking.model.Album.LayoutType.class) {
      return (TypeAdapter<T>) new com.vimeo.networking.model.Album$LayoutType$TypeAdapter(gson);
    }
    if (clazz == com.vimeo.networking.model.Preferences.class) {
      return (TypeAdapter<T>) new com.vimeo.networking.model.Preferences$TypeAdapter(gson);
    }
    if (clazz == com.vimeo.networking.model.Privacy.ViewValue.class) {
      return (TypeAdapter<T>) new com.vimeo.networking.model.Privacy$ViewValue$TypeAdapter(gson);
    }
    if (clazz == com.vimeo.networking.model.Privacy.EmbedValue.class) {
      return (TypeAdapter<T>) new com.vimeo.networking.model.Privacy$EmbedValue$TypeAdapter(gson);
    }
    if (clazz == com.vimeo.networking.model.Interaction.Stream.class) {
      return (TypeAdapter<T>) new com.vimeo.networking.model.Interaction$Stream$TypeAdapter(gson);
    }
    if (clazz == com.vimeo.networking.model.Category.class) {
      return (TypeAdapter<T>) new com.vimeo.networking.model.Category$TypeAdapter(gson);
    }
    if (clazz == com.vimeo.networking.model.Subscription.class) {
      return (TypeAdapter<T>) new com.vimeo.networking.model.Subscription$TypeAdapter(gson);
    }
    if (clazz == com.vimeo.networking.model.User.class) {
      return (TypeAdapter<T>) new com.vimeo.networking.model.User$TypeAdapter(gson);
    }
    if (clazz == com.vimeo.networking.model.HlsVideoFile.class) {
      return (TypeAdapter<T>) new com.vimeo.networking.model.HlsVideoFile$TypeAdapter(gson);
    }
    if (clazz == com.vimeo.networking.model.Album.ThemeType.class) {
      return (TypeAdapter<T>) new com.vimeo.networking.model.Album$ThemeType$TypeAdapter(gson);
    }
    if (clazz == com.vimeo.networking.model.ConnectionCollection.class) {
      return (TypeAdapter<T>) new com.vimeo.networking.model.ConnectionCollection$TypeAdapter(gson);
    }
    if (clazz == com.vimeo.networking.model.SubscriptionRenewal.class) {
      return (TypeAdapter<T>) new com.vimeo.networking.model.SubscriptionRenewal$TypeAdapter(gson);
    }
    if (clazz == com.vimeo.networking.model.VideoBadge.class) {
      return (TypeAdapter<T>) new com.vimeo.networking.model.VideoBadge$TypeAdapter(gson);
    }
    if (clazz == com.vimeo.networking.model.StatsCollection.class) {
      return (TypeAdapter<T>) new com.vimeo.networking.model.StatsCollection$TypeAdapter(gson);
    }
    if (clazz == com.vimeo.networking.model.Channel.class) {
      return (TypeAdapter<T>) new com.vimeo.networking.model.Channel$TypeAdapter(gson);
    }
    if (clazz == com.vimeo.networking.model.Email.class) {
      return (TypeAdapter<T>) new com.vimeo.networking.model.Email$TypeAdapter(gson);
    }
    if (clazz == com.vimeo.networking.model.Group.class) {
      return (TypeAdapter<T>) new com.vimeo.networking.model.Group$TypeAdapter(gson);
    }
    if (clazz == com.vimeo.networking.model.TextTrack.class) {
      return (TypeAdapter<T>) new com.vimeo.networking.model.TextTrack$TypeAdapter(gson);
    }
    if (clazz == com.vimeo.networking.model.Privacy.CommentValue.class) {
      return (TypeAdapter<T>) new com.vimeo.networking.model.Privacy$CommentValue$TypeAdapter(gson);
    }
    if (clazz == com.vimeo.networking.model.UserList.class) {
      return (TypeAdapter<T>) new com.vimeo.networking.model.UserList$TypeAdapter(gson);
    }
    if (clazz == com.vimeo.networking.model.Credit.class) {
      return (TypeAdapter<T>) new com.vimeo.networking.model.Credit$TypeAdapter(gson);
    }
    if (clazz == com.vimeo.networking.model.VideosPreference.class) {
      return (TypeAdapter<T>) new com.vimeo.networking.model.VideosPreference$TypeAdapter(gson);
    }
    if (clazz == com.vimeo.networking.model.DashVideoFile.class) {
      return (TypeAdapter<T>) new com.vimeo.networking.model.DashVideoFile$TypeAdapter(gson);
    }
    if (clazz == com.vimeo.networking.model.PictureResource.class) {
      return (TypeAdapter<T>) new com.vimeo.networking.model.PictureResource$TypeAdapter(gson);
    }
    if (clazz == com.vimeo.networking.model.AlbumList.class) {
      return (TypeAdapter<T>) new com.vimeo.networking.model.AlbumList$TypeAdapter(gson);
    }
    if (clazz == com.vimeo.networking.model.AlbumPrivacy.AlbumPrivacyViewValue.class) {
      return (TypeAdapter<T>) new com.vimeo.networking.model.AlbumPrivacy$AlbumPrivacyViewValue$TypeAdapter(gson);
    }
    if (clazz == com.vimeo.networking.model.Comment.CommentType.class) {
      return (TypeAdapter<T>) new com.vimeo.networking.model.Comment$CommentType$TypeAdapter(gson);
    }
    if (clazz == com.vimeo.networking.model.FeedList.class) {
      return (TypeAdapter<T>) new com.vimeo.networking.model.FeedList$TypeAdapter(gson);
    }
    if (clazz == com.vimeo.networking.model.Comment.class) {
      return (TypeAdapter<T>) new com.vimeo.networking.model.Comment$TypeAdapter(gson);
    }
    if (clazz == com.vimeo.networking.model.Membership.class) {
      return (TypeAdapter<T>) new com.vimeo.networking.model.Membership$TypeAdapter(gson);
    }
    if (clazz == com.vimeo.networking.model.FileTransferPage.class) {
      return (TypeAdapter<T>) new com.vimeo.networking.model.FileTransferPage$TypeAdapter(gson);
    }
    if (clazz == com.vimeo.networking.model.Embed.class) {
      return (TypeAdapter<T>) new com.vimeo.networking.model.Embed$TypeAdapter(gson);
    }
    if (clazz == com.vimeo.networking.model.Website.class) {
      return (TypeAdapter<T>) new com.vimeo.networking.model.Website$TypeAdapter(gson);
    }
    if (clazz == com.vimeo.networking.model.Tag.class) {
      return (TypeAdapter<T>) new com.vimeo.networking.model.Tag$TypeAdapter(gson);
    }
    if (clazz == com.vimeo.networking.model.Picture.class) {
      return (TypeAdapter<T>) new com.vimeo.networking.model.Picture$TypeAdapter(gson);
    }
    if (clazz == com.vimeo.networking.model.CommentList.class) {
      return (TypeAdapter<T>) new com.vimeo.networking.model.CommentList$TypeAdapter(gson);
    }
    if (clazz == com.vimeo.networking.model.RecommendationList.class) {
      return (TypeAdapter<T>) new com.vimeo.networking.model.RecommendationList$TypeAdapter(gson);
    }
    if (clazz == com.vimeo.networking.model.ChannelList.class) {
      return (TypeAdapter<T>) new com.vimeo.networking.model.ChannelList$TypeAdapter(gson);
    }
    if (clazz == com.vimeo.networking.model.Video.class) {
      return (TypeAdapter<T>) new com.vimeo.networking.model.Video$TypeAdapter(gson);
    }
    if (clazz == com.vimeo.networking.model.Album.SortType.class) {
      return (TypeAdapter<T>) new com.vimeo.networking.model.Album$SortType$TypeAdapter(gson);
    }
    if (clazz == com.vimeo.networking.model.Interaction.class) {
      return (TypeAdapter<T>) new com.vimeo.networking.model.Interaction$TypeAdapter(gson);
    }
    if (clazz == com.vimeo.networking.model.SubscriptionTrial.class) {
      return (TypeAdapter<T>) new com.vimeo.networking.model.SubscriptionTrial$TypeAdapter(gson);
    }
    if (clazz == com.vimeo.networking.model.InteractionCollection.class) {
      return (TypeAdapter<T>) new com.vimeo.networking.model.InteractionCollection$TypeAdapter(gson);
    }
    if (clazz == com.vimeo.networking.model.Video.Status.class) {
      return (TypeAdapter<T>) new com.vimeo.networking.model.Video$Status$TypeAdapter(gson);
    }
    if (clazz == com.vimeo.networking.model.Album.class) {
      return (TypeAdapter<T>) new com.vimeo.networking.model.Album$TypeAdapter(gson);
    }
    if (clazz == com.vimeo.networking.model.AlbumEmbed.class) {
      return (TypeAdapter<T>) new com.vimeo.networking.model.AlbumEmbed$TypeAdapter(gson);
    }
    if (clazz == com.vimeo.networking.model.CategoryList.class) {
      return (TypeAdapter<T>) new com.vimeo.networking.model.CategoryList$TypeAdapter(gson);
    }
    return null;
  }
}
