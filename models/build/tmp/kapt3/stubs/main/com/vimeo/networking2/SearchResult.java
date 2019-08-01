package com.vimeo.networking2;

import java.lang.System;

/**
 * * Search Result DTO.
 */
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Bq\u0012\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0003\u0010\u0010\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\u0011J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\tH\u00c6\u0003J\u0010\u0010#\u001a\u0004\u0018\u00010\u000bH\u00c6\u0003\u00a2\u0006\u0002\u0010\u0018J\u0010\u0010$\u001a\u0004\u0018\u00010\u000bH\u00c6\u0003\u00a2\u0006\u0002\u0010\u0018J\u0010\u0010%\u001a\u0004\u0018\u00010\u000bH\u00c6\u0003\u00a2\u0006\u0002\u0010\u0018J\u000b\u0010&\u001a\u0004\u0018\u00010\u000fH\u00c6\u0003J\u000b\u0010\'\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003Jz\u0010(\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\u000b2\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0003\u0010\u0010\u001a\u0004\u0018\u00010\u0005H\u00c6\u0001\u00a2\u0006\u0002\u0010)J\u0013\u0010*\u001a\u00020\u000b2\b\u0010+\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010,\u001a\u00020-H\u00d6\u0001J\t\u0010.\u001a\u00020\u0005H\u00d6\u0001R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0015\u0010\n\u001a\u0004\u0018\u00010\u000b\u00a2\u0006\n\n\u0002\u0010\u0019\u001a\u0004\b\n\u0010\u0018R\u0015\u0010\f\u001a\u0004\u0018\u00010\u000b\u00a2\u0006\n\n\u0002\u0010\u0019\u001a\u0004\b\f\u0010\u0018R\u0015\u0010\r\u001a\u0004\u0018\u00010\u000b\u00a2\u0006\n\n\u0002\u0010\u0019\u001a\u0004\b\r\u0010\u0018R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0013R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0013\u0010\b\u001a\u0004\u0018\u00010\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001e\u00a8\u0006/"}, d2 = {"Lcom/vimeo/networking2/SearchResult;", "", "channel", "Lcom/vimeo/networking2/Channel;", "blog", "", "group", "Lcom/vimeo/networking2/Group;", "video", "Lcom/vimeo/networking2/Video;", "isFeatured", "", "isSpatial", "isStaffPick", "user", "Lcom/vimeo/networking2/User;", "rawType", "(Lcom/vimeo/networking2/Channel;Ljava/lang/String;Lcom/vimeo/networking2/Group;Lcom/vimeo/networking2/Video;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Lcom/vimeo/networking2/User;Ljava/lang/String;)V", "getBlog", "()Ljava/lang/String;", "getChannel", "()Lcom/vimeo/networking2/Channel;", "getGroup", "()Lcom/vimeo/networking2/Group;", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getRawType", "getUser", "()Lcom/vimeo/networking2/User;", "getVideo", "()Lcom/vimeo/networking2/Video;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Lcom/vimeo/networking2/Channel;Ljava/lang/String;Lcom/vimeo/networking2/Group;Lcom/vimeo/networking2/Video;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Lcom/vimeo/networking2/User;Ljava/lang/String;)Lcom/vimeo/networking2/SearchResult;", "equals", "other", "hashCode", "", "toString", "models"})
@com.squareup.moshi.JsonClass(generateAdapter = true)
public final class SearchResult {
    
    /**
     * * Channel data.
     */
    @org.jetbrains.annotations.Nullable()
    private final com.vimeo.networking2.Channel channel = null;
    
    /**
     * * Blog.
     */
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String blog = null;
    
    /**
     * * Group data.
     */
    @org.jetbrains.annotations.Nullable()
    private final com.vimeo.networking2.Group group = null;
    
    /**
     * * Video data.
     */
    @org.jetbrains.annotations.Nullable()
    private final com.vimeo.networking2.Video video = null;
    
    /**
     * * Is this video a featured result?
     */
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Boolean isFeatured = null;
    
    /**
     * * Is this On Demand a 360 video?
     */
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Boolean isSpatial = null;
    
    /**
     * * Is this video a Staff Pick?
     */
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Boolean isStaffPick = null;
    
    /**
     * * User data.
     */
    @org.jetbrains.annotations.Nullable()
    private final com.vimeo.networking2.User user = null;
    
    /**
     * * The type of object that this search result is representing.
     *     * @see SearchResult.type
     */
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String rawType = null;
    
    /**
     * * Channel data.
     */
    @org.jetbrains.annotations.Nullable()
    public final com.vimeo.networking2.Channel getChannel() {
        return null;
    }
    
    /**
     * * Blog.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getBlog() {
        return null;
    }
    
    /**
     * * Group data.
     */
    @org.jetbrains.annotations.Nullable()
    public final com.vimeo.networking2.Group getGroup() {
        return null;
    }
    
    /**
     * * Video data.
     */
    @org.jetbrains.annotations.Nullable()
    public final com.vimeo.networking2.Video getVideo() {
        return null;
    }
    
    /**
     * * Is this video a featured result?
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean isFeatured() {
        return null;
    }
    
    /**
     * * Is this On Demand a 360 video?
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean isSpatial() {
        return null;
    }
    
    /**
     * * Is this video a Staff Pick?
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean isStaffPick() {
        return null;
    }
    
    /**
     * * User data.
     */
    @org.jetbrains.annotations.Nullable()
    public final com.vimeo.networking2.User getUser() {
        return null;
    }
    
    /**
     * * The type of object that this search result is representing.
     *     * @see SearchResult.type
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getRawType() {
        return null;
    }
    
    public SearchResult(@org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "channel")
    com.vimeo.networking2.Channel channel, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "blog")
    java.lang.String blog, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "group")
    com.vimeo.networking2.Group group, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "video")
    com.vimeo.networking2.Video video, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "is_featured")
    java.lang.Boolean isFeatured, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "is_spatial")
    java.lang.Boolean isSpatial, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "is_staffpick")
    java.lang.Boolean isStaffPick, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "people")
    com.vimeo.networking2.User user, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "type")
    java.lang.String rawType) {
        super();
    }
    
    public SearchResult() {
        super();
    }
    
    /**
     * * Channel data.
     */
    @org.jetbrains.annotations.Nullable()
    public final com.vimeo.networking2.Channel component1() {
        return null;
    }
    
    /**
     * * Blog.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component2() {
        return null;
    }
    
    /**
     * * Group data.
     */
    @org.jetbrains.annotations.Nullable()
    public final com.vimeo.networking2.Group component3() {
        return null;
    }
    
    /**
     * * Video data.
     */
    @org.jetbrains.annotations.Nullable()
    public final com.vimeo.networking2.Video component4() {
        return null;
    }
    
    /**
     * * Is this video a featured result?
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean component5() {
        return null;
    }
    
    /**
     * * Is this On Demand a 360 video?
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean component6() {
        return null;
    }
    
    /**
     * * Is this video a Staff Pick?
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean component7() {
        return null;
    }
    
    /**
     * * User data.
     */
    @org.jetbrains.annotations.Nullable()
    public final com.vimeo.networking2.User component8() {
        return null;
    }
    
    /**
     * * The type of object that this search result is representing.
     *     * @see SearchResult.type
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component9() {
        return null;
    }
    
    /**
     * * Search Result DTO.
     */
    @org.jetbrains.annotations.NotNull()
    public final com.vimeo.networking2.SearchResult copy(@org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "channel")
    com.vimeo.networking2.Channel channel, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "blog")
    java.lang.String blog, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "group")
    com.vimeo.networking2.Group group, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "video")
    com.vimeo.networking2.Video video, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "is_featured")
    java.lang.Boolean isFeatured, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "is_spatial")
    java.lang.Boolean isSpatial, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "is_staffpick")
    java.lang.Boolean isStaffPick, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "people")
    com.vimeo.networking2.User user, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "type")
    java.lang.String rawType) {
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