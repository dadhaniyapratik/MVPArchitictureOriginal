package com.vimeo.networking2;

import java.lang.System;

/**
 * * All connections for a user.
 */
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b9\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0081\u0002\u0012\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0003\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0013\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0014\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0015\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0016\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0017\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0018\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u0019J\u000b\u00103\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u00104\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u00105\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u00106\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u00107\u001a\u0004\u0018\u00010\u0010H\u00c6\u0003J\u000b\u00108\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u00109\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010:\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010;\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010<\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010=\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010>\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010?\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010@\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010A\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010B\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010C\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010D\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010E\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010F\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010G\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0085\u0002\u0010H\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u000f\u001a\u0004\u0018\u00010\u00102\n\b\u0003\u0010\u0011\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0012\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0013\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0014\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0015\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0016\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0017\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0018\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001J\u0013\u0010I\u001a\u00020J2\b\u0010K\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010L\u001a\u00020MH\u00d6\u0001J\t\u0010N\u001a\u00020OH\u00d6\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001bR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001bR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001bR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001bR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b \u0010\u001bR\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001bR\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001bR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001bR\u0013\u0010\f\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b$\u0010\u001bR\u0013\u0010\r\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b%\u0010\u001bR\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b&\u0010\u001bR\u001e\u0010\u000f\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\b\'\u0010(\u001a\u0004\b)\u0010*R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b+\u0010\u001bR\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b,\u0010\u001bR\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b-\u0010\u001bR\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b.\u0010\u001bR\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b/\u0010\u001bR\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b0\u0010\u001bR\u0013\u0010\u0017\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b1\u0010\u001bR\u0013\u0010\u0018\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b2\u0010\u001b\u00a8\u0006P"}, d2 = {"Lcom/vimeo/networking2/UserConnections;", "", "albums", "Lcom/vimeo/networking2/Connection;", "appearances", "block", "categories", "channels", "feed", "folders", "followers", "following", "groups", "likes", "moderatedChannels", "notifications", "Lcom/vimeo/networking2/NotificationConnection;", "pictures", "portfolios", "recommendedChannels", "recommendedUsers", "shared", "teamMembers", "videos", "watchLater", "(Lcom/vimeo/networking2/Connection;Lcom/vimeo/networking2/Connection;Lcom/vimeo/networking2/Connection;Lcom/vimeo/networking2/Connection;Lcom/vimeo/networking2/Connection;Lcom/vimeo/networking2/Connection;Lcom/vimeo/networking2/Connection;Lcom/vimeo/networking2/Connection;Lcom/vimeo/networking2/Connection;Lcom/vimeo/networking2/Connection;Lcom/vimeo/networking2/Connection;Lcom/vimeo/networking2/Connection;Lcom/vimeo/networking2/NotificationConnection;Lcom/vimeo/networking2/Connection;Lcom/vimeo/networking2/Connection;Lcom/vimeo/networking2/Connection;Lcom/vimeo/networking2/Connection;Lcom/vimeo/networking2/Connection;Lcom/vimeo/networking2/Connection;Lcom/vimeo/networking2/Connection;Lcom/vimeo/networking2/Connection;)V", "getAlbums", "()Lcom/vimeo/networking2/Connection;", "getAppearances", "getBlock", "getCategories", "getChannels", "getFeed", "getFolders", "getFollowers", "getFollowing", "getGroups", "getLikes", "getModeratedChannels", "notifications$annotations", "()V", "getNotifications", "()Lcom/vimeo/networking2/NotificationConnection;", "getPictures", "getPortfolios", "getRecommendedChannels", "getRecommendedUsers", "getShared", "getTeamMembers", "getVideos", "getWatchLater", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "", "toString", "", "models"})
@com.squareup.moshi.JsonClass(generateAdapter = true)
public final class UserConnections {
    
    /**
     * * Information about the albums created by this user.
     */
    @org.jetbrains.annotations.Nullable()
    private final com.vimeo.networking2.Connection albums = null;
    
    /**
     * * Information about the appearances of this user in other videos.
     */
    @org.jetbrains.annotations.Nullable()
    private final com.vimeo.networking2.Connection appearances = null;
    
    /**
     * * Information on the users that the current user has blocked. This data requires a
     *     * bearer token with the private scope.
     */
    @org.jetbrains.annotations.Nullable()
    private final com.vimeo.networking2.Connection block = null;
    
    /**
     * * Information about this user's followed categories.
     */
    @org.jetbrains.annotations.Nullable()
    private final com.vimeo.networking2.Connection categories = null;
    
    /**
     * * Information about this user's subscribed channels.
     */
    @org.jetbrains.annotations.Nullable()
    private final com.vimeo.networking2.Connection channels = null;
    
    /**
     * * Information about this user's feed.
     */
    @org.jetbrains.annotations.Nullable()
    private final com.vimeo.networking2.Connection feed = null;
    
    /**
     * * Information about this user's folders.
     */
    @org.jetbrains.annotations.Nullable()
    private final com.vimeo.networking2.Connection folders = null;
    
    /**
     * * Information about the user's followers.
     */
    @org.jetbrains.annotations.Nullable()
    private final com.vimeo.networking2.Connection followers = null;
    
    /**
     * * Information about the users that the current user is following.
     */
    @org.jetbrains.annotations.Nullable()
    private final com.vimeo.networking2.Connection following = null;
    
    /**
     * * Information about the groups created by this user.
     */
    @org.jetbrains.annotations.Nullable()
    private final com.vimeo.networking2.Connection groups = null;
    
    /**
     * * Information about the videos that this user has liked.
     */
    @org.jetbrains.annotations.Nullable()
    private final com.vimeo.networking2.Connection likes = null;
    
    /**
     * * Information about the channels that this user moderates.
     */
    @org.jetbrains.annotations.Nullable()
    private final com.vimeo.networking2.Connection moderatedChannels = null;
    
    /**
     * * Information about this user's notifications. This data requires a bearer
     *     * token with the private scope.
     */
    @org.jetbrains.annotations.Nullable()
    private final com.vimeo.networking2.NotificationConnection notifications = null;
    
    /**
     * * Information about this user's portraits.
     */
    @org.jetbrains.annotations.Nullable()
    private final com.vimeo.networking2.Connection pictures = null;
    
    /**
     * * Information about this user's portfolios.
     */
    @org.jetbrains.annotations.Nullable()
    private final com.vimeo.networking2.Connection portfolios = null;
    
    /**
     * * A collection of recommended channels for the current user to follow. This data requires a
     *     * bearer token with the private scope.
     */
    @org.jetbrains.annotations.Nullable()
    private final com.vimeo.networking2.Connection recommendedChannels = null;
    
    /**
     * * A Collection of recommended users for the current user to follow. This data requires a
     *     * bearer token with the private scope.
     */
    @org.jetbrains.annotations.Nullable()
    private final com.vimeo.networking2.Connection recommendedUsers = null;
    
    /**
     * * Information about the videos that have been shared with this user.
     */
    @org.jetbrains.annotations.Nullable()
    private final com.vimeo.networking2.Connection shared = null;
    
    /**
     * * Information about the user's team.
     */
    @org.jetbrains.annotations.Nullable()
    private final com.vimeo.networking2.Connection teamMembers = null;
    
    /**
     * * Information about the videos uploaded by this user.
     */
    @org.jetbrains.annotations.Nullable()
    private final com.vimeo.networking2.Connection videos = null;
    
    /**
     * * Information about the videos that this user wants to watch later.
     */
    @org.jetbrains.annotations.Nullable()
    private final com.vimeo.networking2.Connection watchLater = null;
    
    /**
     * * Information about the albums created by this user.
     */
    @org.jetbrains.annotations.Nullable()
    public final com.vimeo.networking2.Connection getAlbums() {
        return null;
    }
    
    /**
     * * Information about the appearances of this user in other videos.
     */
    @org.jetbrains.annotations.Nullable()
    public final com.vimeo.networking2.Connection getAppearances() {
        return null;
    }
    
    /**
     * * Information on the users that the current user has blocked. This data requires a
     *     * bearer token with the private scope.
     */
    @org.jetbrains.annotations.Nullable()
    public final com.vimeo.networking2.Connection getBlock() {
        return null;
    }
    
    /**
     * * Information about this user's followed categories.
     */
    @org.jetbrains.annotations.Nullable()
    public final com.vimeo.networking2.Connection getCategories() {
        return null;
    }
    
    /**
     * * Information about this user's subscribed channels.
     */
    @org.jetbrains.annotations.Nullable()
    public final com.vimeo.networking2.Connection getChannels() {
        return null;
    }
    
    /**
     * * Information about this user's feed.
     */
    @org.jetbrains.annotations.Nullable()
    public final com.vimeo.networking2.Connection getFeed() {
        return null;
    }
    
    /**
     * * Information about this user's folders.
     */
    @org.jetbrains.annotations.Nullable()
    public final com.vimeo.networking2.Connection getFolders() {
        return null;
    }
    
    /**
     * * Information about the user's followers.
     */
    @org.jetbrains.annotations.Nullable()
    public final com.vimeo.networking2.Connection getFollowers() {
        return null;
    }
    
    /**
     * * Information about the users that the current user is following.
     */
    @org.jetbrains.annotations.Nullable()
    public final com.vimeo.networking2.Connection getFollowing() {
        return null;
    }
    
    /**
     * * Information about the groups created by this user.
     */
    @org.jetbrains.annotations.Nullable()
    public final com.vimeo.networking2.Connection getGroups() {
        return null;
    }
    
    /**
     * * Information about the videos that this user has liked.
     */
    @org.jetbrains.annotations.Nullable()
    public final com.vimeo.networking2.Connection getLikes() {
        return null;
    }
    
    /**
     * * Information about the channels that this user moderates.
     */
    @org.jetbrains.annotations.Nullable()
    public final com.vimeo.networking2.Connection getModeratedChannels() {
        return null;
    }
    
    @com.vimeo.networking2.annotations.Internal()
    public static void notifications$annotations() {
    }
    
    /**
     * * Information about this user's notifications. This data requires a bearer
     *     * token with the private scope.
     */
    @org.jetbrains.annotations.Nullable()
    public final com.vimeo.networking2.NotificationConnection getNotifications() {
        return null;
    }
    
    /**
     * * Information about this user's portraits.
     */
    @org.jetbrains.annotations.Nullable()
    public final com.vimeo.networking2.Connection getPictures() {
        return null;
    }
    
    /**
     * * Information about this user's portfolios.
     */
    @org.jetbrains.annotations.Nullable()
    public final com.vimeo.networking2.Connection getPortfolios() {
        return null;
    }
    
    /**
     * * A collection of recommended channels for the current user to follow. This data requires a
     *     * bearer token with the private scope.
     */
    @org.jetbrains.annotations.Nullable()
    public final com.vimeo.networking2.Connection getRecommendedChannels() {
        return null;
    }
    
    /**
     * * A Collection of recommended users for the current user to follow. This data requires a
     *     * bearer token with the private scope.
     */
    @org.jetbrains.annotations.Nullable()
    public final com.vimeo.networking2.Connection getRecommendedUsers() {
        return null;
    }
    
    /**
     * * Information about the videos that have been shared with this user.
     */
    @org.jetbrains.annotations.Nullable()
    public final com.vimeo.networking2.Connection getShared() {
        return null;
    }
    
    /**
     * * Information about the user's team.
     */
    @org.jetbrains.annotations.Nullable()
    public final com.vimeo.networking2.Connection getTeamMembers() {
        return null;
    }
    
    /**
     * * Information about the videos uploaded by this user.
     */
    @org.jetbrains.annotations.Nullable()
    public final com.vimeo.networking2.Connection getVideos() {
        return null;
    }
    
    /**
     * * Information about the videos that this user wants to watch later.
     */
    @org.jetbrains.annotations.Nullable()
    public final com.vimeo.networking2.Connection getWatchLater() {
        return null;
    }
    
    public UserConnections(@org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "albums")
    com.vimeo.networking2.Connection albums, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "appearances")
    com.vimeo.networking2.Connection appearances, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "block")
    com.vimeo.networking2.Connection block, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "categories")
    com.vimeo.networking2.Connection categories, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "channels")
    com.vimeo.networking2.Connection channels, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "feed")
    com.vimeo.networking2.Connection feed, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "folders")
    com.vimeo.networking2.Connection folders, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "followers")
    com.vimeo.networking2.Connection followers, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "following")
    com.vimeo.networking2.Connection following, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "groups")
    com.vimeo.networking2.Connection groups, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "likes")
    com.vimeo.networking2.Connection likes, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "moderated_channels")
    com.vimeo.networking2.Connection moderatedChannels, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "notifications")
    com.vimeo.networking2.NotificationConnection notifications, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "pictures")
    com.vimeo.networking2.Connection pictures, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "portfolios")
    com.vimeo.networking2.Connection portfolios, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "recommended_channels")
    com.vimeo.networking2.Connection recommendedChannels, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "recommended_users")
    com.vimeo.networking2.Connection recommendedUsers, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "shared")
    com.vimeo.networking2.Connection shared, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "team_members")
    com.vimeo.networking2.Connection teamMembers, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "videos")
    com.vimeo.networking2.Connection videos, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "watchlater")
    com.vimeo.networking2.Connection watchLater) {
        super();
    }
    
    public UserConnections() {
        super();
    }
    
    /**
     * * Information about the albums created by this user.
     */
    @org.jetbrains.annotations.Nullable()
    public final com.vimeo.networking2.Connection component1() {
        return null;
    }
    
    /**
     * * Information about the appearances of this user in other videos.
     */
    @org.jetbrains.annotations.Nullable()
    public final com.vimeo.networking2.Connection component2() {
        return null;
    }
    
    /**
     * * Information on the users that the current user has blocked. This data requires a
     *     * bearer token with the private scope.
     */
    @org.jetbrains.annotations.Nullable()
    public final com.vimeo.networking2.Connection component3() {
        return null;
    }
    
    /**
     * * Information about this user's followed categories.
     */
    @org.jetbrains.annotations.Nullable()
    public final com.vimeo.networking2.Connection component4() {
        return null;
    }
    
    /**
     * * Information about this user's subscribed channels.
     */
    @org.jetbrains.annotations.Nullable()
    public final com.vimeo.networking2.Connection component5() {
        return null;
    }
    
    /**
     * * Information about this user's feed.
     */
    @org.jetbrains.annotations.Nullable()
    public final com.vimeo.networking2.Connection component6() {
        return null;
    }
    
    /**
     * * Information about this user's folders.
     */
    @org.jetbrains.annotations.Nullable()
    public final com.vimeo.networking2.Connection component7() {
        return null;
    }
    
    /**
     * * Information about the user's followers.
     */
    @org.jetbrains.annotations.Nullable()
    public final com.vimeo.networking2.Connection component8() {
        return null;
    }
    
    /**
     * * Information about the users that the current user is following.
     */
    @org.jetbrains.annotations.Nullable()
    public final com.vimeo.networking2.Connection component9() {
        return null;
    }
    
    /**
     * * Information about the groups created by this user.
     */
    @org.jetbrains.annotations.Nullable()
    public final com.vimeo.networking2.Connection component10() {
        return null;
    }
    
    /**
     * * Information about the videos that this user has liked.
     */
    @org.jetbrains.annotations.Nullable()
    public final com.vimeo.networking2.Connection component11() {
        return null;
    }
    
    /**
     * * Information about the channels that this user moderates.
     */
    @org.jetbrains.annotations.Nullable()
    public final com.vimeo.networking2.Connection component12() {
        return null;
    }
    
    /**
     * * Information about this user's notifications. This data requires a bearer
     *     * token with the private scope.
     */
    @org.jetbrains.annotations.Nullable()
    public final com.vimeo.networking2.NotificationConnection component13() {
        return null;
    }
    
    /**
     * * Information about this user's portraits.
     */
    @org.jetbrains.annotations.Nullable()
    public final com.vimeo.networking2.Connection component14() {
        return null;
    }
    
    /**
     * * Information about this user's portfolios.
     */
    @org.jetbrains.annotations.Nullable()
    public final com.vimeo.networking2.Connection component15() {
        return null;
    }
    
    /**
     * * A collection of recommended channels for the current user to follow. This data requires a
     *     * bearer token with the private scope.
     */
    @org.jetbrains.annotations.Nullable()
    public final com.vimeo.networking2.Connection component16() {
        return null;
    }
    
    /**
     * * A Collection of recommended users for the current user to follow. This data requires a
     *     * bearer token with the private scope.
     */
    @org.jetbrains.annotations.Nullable()
    public final com.vimeo.networking2.Connection component17() {
        return null;
    }
    
    /**
     * * Information about the videos that have been shared with this user.
     */
    @org.jetbrains.annotations.Nullable()
    public final com.vimeo.networking2.Connection component18() {
        return null;
    }
    
    /**
     * * Information about the user's team.
     */
    @org.jetbrains.annotations.Nullable()
    public final com.vimeo.networking2.Connection component19() {
        return null;
    }
    
    /**
     * * Information about the videos uploaded by this user.
     */
    @org.jetbrains.annotations.Nullable()
    public final com.vimeo.networking2.Connection component20() {
        return null;
    }
    
    /**
     * * Information about the videos that this user wants to watch later.
     */
    @org.jetbrains.annotations.Nullable()
    public final com.vimeo.networking2.Connection component21() {
        return null;
    }
    
    /**
     * * All connections for a user.
     */
    @org.jetbrains.annotations.NotNull()
    public final com.vimeo.networking2.UserConnections copy(@org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "albums")
    com.vimeo.networking2.Connection albums, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "appearances")
    com.vimeo.networking2.Connection appearances, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "block")
    com.vimeo.networking2.Connection block, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "categories")
    com.vimeo.networking2.Connection categories, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "channels")
    com.vimeo.networking2.Connection channels, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "feed")
    com.vimeo.networking2.Connection feed, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "folders")
    com.vimeo.networking2.Connection folders, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "followers")
    com.vimeo.networking2.Connection followers, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "following")
    com.vimeo.networking2.Connection following, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "groups")
    com.vimeo.networking2.Connection groups, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "likes")
    com.vimeo.networking2.Connection likes, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "moderated_channels")
    com.vimeo.networking2.Connection moderatedChannels, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "notifications")
    com.vimeo.networking2.NotificationConnection notifications, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "pictures")
    com.vimeo.networking2.Connection pictures, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "portfolios")
    com.vimeo.networking2.Connection portfolios, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "recommended_channels")
    com.vimeo.networking2.Connection recommendedChannels, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "recommended_users")
    com.vimeo.networking2.Connection recommendedUsers, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "shared")
    com.vimeo.networking2.Connection shared, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "team_members")
    com.vimeo.networking2.Connection teamMembers, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "videos")
    com.vimeo.networking2.Connection videos, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "watchlater")
    com.vimeo.networking2.Connection watchLater) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object p0) {
        return false;
    }
}