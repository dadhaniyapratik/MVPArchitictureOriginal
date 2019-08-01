package com.vimeo.networking2;

import java.lang.System;

/**
 * * All connections for a video.
 */
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b)\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0095\u0001\u0012\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u000fJ\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\'\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0099\u0001\u0010+\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001J\u0013\u0010,\u001a\u00020-2\b\u0010.\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010/\u001a\u000200H\u00d6\u0001J\t\u00101\u001a\u000202H\u00d6\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011R\u001e\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0011R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0011R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0011R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0011R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0011R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0011R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0011R\u0013\u0010\r\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0011R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0011\u00a8\u00063"}, d2 = {"Lcom/vimeo/networking2/VideoConnections;", "", "comment", "Lcom/vimeo/networking2/Connection;", "credit", "likes", "liveStats", "pictures", "playback", "recommendations", "related", "season", "textTracks", "trailer", "usersWithAccess", "(Lcom/vimeo/networking2/Connection;Lcom/vimeo/networking2/Connection;Lcom/vimeo/networking2/Connection;Lcom/vimeo/networking2/Connection;Lcom/vimeo/networking2/Connection;Lcom/vimeo/networking2/Connection;Lcom/vimeo/networking2/Connection;Lcom/vimeo/networking2/Connection;Lcom/vimeo/networking2/Connection;Lcom/vimeo/networking2/Connection;Lcom/vimeo/networking2/Connection;Lcom/vimeo/networking2/Connection;)V", "getComment", "()Lcom/vimeo/networking2/Connection;", "getCredit", "getLikes", "liveStats$annotations", "()V", "getLiveStats", "getPictures", "getPlayback", "getRecommendations", "getRelated", "getSeason", "getTextTracks", "getTrailer", "getUsersWithAccess", "component1", "component10", "component11", "component12", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "", "toString", "", "models"})
@com.squareup.moshi.JsonClass(generateAdapter = true)
public final class VideoConnections {
    
    /**
     * * Information about the comments on this video.
     */
    @org.jetbrains.annotations.Nullable()
    private final com.vimeo.networking2.Connection comment = null;
    
    /**
     * * Information about the users credited in this video.
     */
    @org.jetbrains.annotations.Nullable()
    private final com.vimeo.networking2.Connection credit = null;
    
    /**
     * * Information about the users who have liked this video.
     */
    @org.jetbrains.annotations.Nullable()
    private final com.vimeo.networking2.Connection likes = null;
    
    /**
     * * Information about this video's live stream stats.
     */
    @org.jetbrains.annotations.Nullable()
    private final com.vimeo.networking2.Connection liveStats = null;
    
    /**
     * * Information about this video's thumbnails.
     */
    @org.jetbrains.annotations.Nullable()
    private final com.vimeo.networking2.Connection pictures = null;
    
    /**
     * * The DRM playback status connection for this video.
     */
    @org.jetbrains.annotations.Nullable()
    private final com.vimeo.networking2.Connection playback = null;
    
    /**
     * * The recommendations for this video.
     */
    @org.jetbrains.annotations.Nullable()
    private final com.vimeo.networking2.Connection recommendations = null;
    
    /**
     * * Related content for this video.
     */
    @org.jetbrains.annotations.Nullable()
    private final com.vimeo.networking2.Connection related = null;
    
    /**
     * * Information about the video's season.
     */
    @org.jetbrains.annotations.Nullable()
    private final com.vimeo.networking2.Connection season = null;
    
    /**
     * * Information about this video's text tracks.
     */
    @org.jetbrains.annotations.Nullable()
    private final com.vimeo.networking2.Connection textTracks = null;
    
    /**
     * * Information about this video's VOD trailer.
     */
    @org.jetbrains.annotations.Nullable()
    private final com.vimeo.networking2.Connection trailer = null;
    
    /**
     * * Information about the user privacy of this video, if the video privacy is users.
     */
    @org.jetbrains.annotations.Nullable()
    private final com.vimeo.networking2.Connection usersWithAccess = null;
    
    /**
     * * Information about the comments on this video.
     */
    @org.jetbrains.annotations.Nullable()
    public final com.vimeo.networking2.Connection getComment() {
        return null;
    }
    
    /**
     * * Information about the users credited in this video.
     */
    @org.jetbrains.annotations.Nullable()
    public final com.vimeo.networking2.Connection getCredit() {
        return null;
    }
    
    /**
     * * Information about the users who have liked this video.
     */
    @org.jetbrains.annotations.Nullable()
    public final com.vimeo.networking2.Connection getLikes() {
        return null;
    }
    
    @com.vimeo.networking2.annotations.Internal()
    public static void liveStats$annotations() {
    }
    
    /**
     * * Information about this video's live stream stats.
     */
    @org.jetbrains.annotations.Nullable()
    public final com.vimeo.networking2.Connection getLiveStats() {
        return null;
    }
    
    /**
     * * Information about this video's thumbnails.
     */
    @org.jetbrains.annotations.Nullable()
    public final com.vimeo.networking2.Connection getPictures() {
        return null;
    }
    
    /**
     * * The DRM playback status connection for this video.
     */
    @org.jetbrains.annotations.Nullable()
    public final com.vimeo.networking2.Connection getPlayback() {
        return null;
    }
    
    /**
     * * The recommendations for this video.
     */
    @org.jetbrains.annotations.Nullable()
    public final com.vimeo.networking2.Connection getRecommendations() {
        return null;
    }
    
    /**
     * * Related content for this video.
     */
    @org.jetbrains.annotations.Nullable()
    public final com.vimeo.networking2.Connection getRelated() {
        return null;
    }
    
    /**
     * * Information about the video's season.
     */
    @org.jetbrains.annotations.Nullable()
    public final com.vimeo.networking2.Connection getSeason() {
        return null;
    }
    
    /**
     * * Information about this video's text tracks.
     */
    @org.jetbrains.annotations.Nullable()
    public final com.vimeo.networking2.Connection getTextTracks() {
        return null;
    }
    
    /**
     * * Information about this video's VOD trailer.
     */
    @org.jetbrains.annotations.Nullable()
    public final com.vimeo.networking2.Connection getTrailer() {
        return null;
    }
    
    /**
     * * Information about the user privacy of this video, if the video privacy is users.
     */
    @org.jetbrains.annotations.Nullable()
    public final com.vimeo.networking2.Connection getUsersWithAccess() {
        return null;
    }
    
    public VideoConnections(@org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "comment")
    com.vimeo.networking2.Connection comment, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "credit")
    com.vimeo.networking2.Connection credit, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "likes")
    com.vimeo.networking2.Connection likes, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "live_stats")
    com.vimeo.networking2.Connection liveStats, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "pictures")
    com.vimeo.networking2.Connection pictures, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "playback")
    com.vimeo.networking2.Connection playback, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "recommendations")
    com.vimeo.networking2.Connection recommendations, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "related")
    com.vimeo.networking2.Connection related, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "season")
    com.vimeo.networking2.Connection season, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "texttracks")
    com.vimeo.networking2.Connection textTracks, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "trailer")
    com.vimeo.networking2.Connection trailer, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "users_with_access")
    com.vimeo.networking2.Connection usersWithAccess) {
        super();
    }
    
    public VideoConnections() {
        super();
    }
    
    /**
     * * Information about the comments on this video.
     */
    @org.jetbrains.annotations.Nullable()
    public final com.vimeo.networking2.Connection component1() {
        return null;
    }
    
    /**
     * * Information about the users credited in this video.
     */
    @org.jetbrains.annotations.Nullable()
    public final com.vimeo.networking2.Connection component2() {
        return null;
    }
    
    /**
     * * Information about the users who have liked this video.
     */
    @org.jetbrains.annotations.Nullable()
    public final com.vimeo.networking2.Connection component3() {
        return null;
    }
    
    /**
     * * Information about this video's live stream stats.
     */
    @org.jetbrains.annotations.Nullable()
    public final com.vimeo.networking2.Connection component4() {
        return null;
    }
    
    /**
     * * Information about this video's thumbnails.
     */
    @org.jetbrains.annotations.Nullable()
    public final com.vimeo.networking2.Connection component5() {
        return null;
    }
    
    /**
     * * The DRM playback status connection for this video.
     */
    @org.jetbrains.annotations.Nullable()
    public final com.vimeo.networking2.Connection component6() {
        return null;
    }
    
    /**
     * * The recommendations for this video.
     */
    @org.jetbrains.annotations.Nullable()
    public final com.vimeo.networking2.Connection component7() {
        return null;
    }
    
    /**
     * * Related content for this video.
     */
    @org.jetbrains.annotations.Nullable()
    public final com.vimeo.networking2.Connection component8() {
        return null;
    }
    
    /**
     * * Information about the video's season.
     */
    @org.jetbrains.annotations.Nullable()
    public final com.vimeo.networking2.Connection component9() {
        return null;
    }
    
    /**
     * * Information about this video's text tracks.
     */
    @org.jetbrains.annotations.Nullable()
    public final com.vimeo.networking2.Connection component10() {
        return null;
    }
    
    /**
     * * Information about this video's VOD trailer.
     */
    @org.jetbrains.annotations.Nullable()
    public final com.vimeo.networking2.Connection component11() {
        return null;
    }
    
    /**
     * * Information about the user privacy of this video, if the video privacy is users.
     */
    @org.jetbrains.annotations.Nullable()
    public final com.vimeo.networking2.Connection component12() {
        return null;
    }
    
    /**
     * * All connections for a video.
     */
    @org.jetbrains.annotations.NotNull()
    public final com.vimeo.networking2.VideoConnections copy(@org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "comment")
    com.vimeo.networking2.Connection comment, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "credit")
    com.vimeo.networking2.Connection credit, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "likes")
    com.vimeo.networking2.Connection likes, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "live_stats")
    com.vimeo.networking2.Connection liveStats, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "pictures")
    com.vimeo.networking2.Connection pictures, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "playback")
    com.vimeo.networking2.Connection playback, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "recommendations")
    com.vimeo.networking2.Connection recommendations, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "related")
    com.vimeo.networking2.Connection related, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "season")
    com.vimeo.networking2.Connection season, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "texttracks")
    com.vimeo.networking2.Connection textTracks, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "trailer")
    com.vimeo.networking2.Connection trailer, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "users_with_access")
    com.vimeo.networking2.Connection usersWithAccess) {
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