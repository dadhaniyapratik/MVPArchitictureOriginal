package com.vimeo.networking2;

import java.lang.System;

/**
 * * An item in the user's feed.
 */
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b \n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0083\u0001\u0012\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0010\b\u0003\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t\u0012\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0003\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0003\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0003\u0010\u0013\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0003\u0010\u0014\u001a\u0004\u0018\u00010\u0015\u00a2\u0006\u0002\u0010\u0016J\u000b\u0010*\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\u0015H\u00c6\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J\u0011\u0010.\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tH\u00c6\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\fH\u00c6\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\u000eH\u00c6\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\u0010H\u00c6\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\u0012H\u00c6\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\u0010H\u00c6\u0003J\u0087\u0001\u00104\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0010\b\u0003\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t2\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0003\u0010\u000f\u001a\u0004\u0018\u00010\u00102\n\b\u0003\u0010\u0011\u001a\u0004\u0018\u00010\u00122\n\b\u0003\u0010\u0013\u001a\u0004\u0018\u00010\u00102\n\b\u0003\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u00c6\u0001J\u0013\u00105\u001a\u0002062\b\u00107\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u00108\u001a\u000209H\u00d6\u0001J\t\u0010:\u001a\u00020\u0010H\u00d6\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0019\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f\u00a2\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0010\u00a2\u0006\b\n\u0000\u001a\u0004\b%\u0010 R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u0015\u00a2\u0006\b\n\u0000\u001a\u0004\b&\u0010\'R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u00a2\u0006\b\n\u0000\u001a\u0004\b(\u0010)\u00a8\u0006;"}, d2 = {"Lcom/vimeo/networking2/FeedItem;", "", "category", "Lcom/vimeo/networking2/Category;", "channel", "Lcom/vimeo/networking2/Channel;", "group", "Lcom/vimeo/networking2/Group;", "metadata", "Lcom/vimeo/networking2/MetadataConnections;", "Lcom/vimeo/networking2/FeedItemConnections;", "tag", "Lcom/vimeo/networking2/Tag;", "time", "Ljava/util/Date;", "rawType", "", "video", "Lcom/vimeo/networking2/Video;", "uri", "user", "Lcom/vimeo/networking2/User;", "(Lcom/vimeo/networking2/Category;Lcom/vimeo/networking2/Channel;Lcom/vimeo/networking2/Group;Lcom/vimeo/networking2/MetadataConnections;Lcom/vimeo/networking2/Tag;Ljava/util/Date;Ljava/lang/String;Lcom/vimeo/networking2/Video;Ljava/lang/String;Lcom/vimeo/networking2/User;)V", "getCategory", "()Lcom/vimeo/networking2/Category;", "getChannel", "()Lcom/vimeo/networking2/Channel;", "getGroup", "()Lcom/vimeo/networking2/Group;", "getMetadata", "()Lcom/vimeo/networking2/MetadataConnections;", "getRawType", "()Ljava/lang/String;", "getTag", "()Lcom/vimeo/networking2/Tag;", "getTime", "()Ljava/util/Date;", "getUri", "getUser", "()Lcom/vimeo/networking2/User;", "getVideo", "()Lcom/vimeo/networking2/Video;", "component1", "component10", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "", "toString", "models"})
@com.squareup.moshi.JsonClass(generateAdapter = true)
public final class FeedItem {
    
    /**
     * * The category that this event occurred for. This will be present for only
     *     * [AttributionType.CATEGORY] feed item type.
     */
    @org.jetbrains.annotations.Nullable()
    private final com.vimeo.networking2.Category category = null;
    
    /**
     * * The channel that this event occurred for. This will be present for only
     *     * [AttributionType.CHANNEL] feed item type.
     */
    @org.jetbrains.annotations.Nullable()
    private final com.vimeo.networking2.Channel channel = null;
    
    /**
     * * The group that this event occurred for. This will be present for only
     *     * [AttributionType.GROUP] feed item type.
     */
    @org.jetbrains.annotations.Nullable()
    private final com.vimeo.networking2.Group group = null;
    
    /**
     * * The feed item's metadata.
     */
    @org.jetbrains.annotations.Nullable()
    private final com.vimeo.networking2.MetadataConnections<com.vimeo.networking2.FeedItemConnections> metadata = null;
    
    /**
     * * The tag that this event occurred for. This will be present for only
     *     * [AttributionType.TAG] feed item type.
     */
    @org.jetbrains.annotations.Nullable()
    private final com.vimeo.networking2.Tag tag = null;
    
    /**
     * * Time that the event occurred.
     */
    @org.jetbrains.annotations.Nullable()
    private final java.util.Date time = null;
    
    /**
     * * Feed item type.
     *     * @see FeedItem.type
     */
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String rawType = null;
    
    /**
     * * Video associated with ths feed item.
     */
    @org.jetbrains.annotations.Nullable()
    private final com.vimeo.networking2.Video video = null;
    
    /**
     * * The uri for the [FeedItem].
     */
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String uri = null;
    
    /**
     * * The user that this event occurred for. This will be present for [AttributionType.LIKE],
     *     * [AttributionType.APPEARANCE], and [AttributionType.SHARE] activity types.
     */
    @org.jetbrains.annotations.Nullable()
    private final com.vimeo.networking2.User user = null;
    
    /**
     * * The category that this event occurred for. This will be present for only
     *     * [AttributionType.CATEGORY] feed item type.
     */
    @org.jetbrains.annotations.Nullable()
    public final com.vimeo.networking2.Category getCategory() {
        return null;
    }
    
    /**
     * * The channel that this event occurred for. This will be present for only
     *     * [AttributionType.CHANNEL] feed item type.
     */
    @org.jetbrains.annotations.Nullable()
    public final com.vimeo.networking2.Channel getChannel() {
        return null;
    }
    
    /**
     * * The group that this event occurred for. This will be present for only
     *     * [AttributionType.GROUP] feed item type.
     */
    @org.jetbrains.annotations.Nullable()
    public final com.vimeo.networking2.Group getGroup() {
        return null;
    }
    
    /**
     * * The feed item's metadata.
     */
    @org.jetbrains.annotations.Nullable()
    public final com.vimeo.networking2.MetadataConnections<com.vimeo.networking2.FeedItemConnections> getMetadata() {
        return null;
    }
    
    /**
     * * The tag that this event occurred for. This will be present for only
     *     * [AttributionType.TAG] feed item type.
     */
    @org.jetbrains.annotations.Nullable()
    public final com.vimeo.networking2.Tag getTag() {
        return null;
    }
    
    /**
     * * Time that the event occurred.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.util.Date getTime() {
        return null;
    }
    
    /**
     * * Feed item type.
     *     * @see FeedItem.type
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getRawType() {
        return null;
    }
    
    /**
     * * Video associated with ths feed item.
     */
    @org.jetbrains.annotations.Nullable()
    public final com.vimeo.networking2.Video getVideo() {
        return null;
    }
    
    /**
     * * The uri for the [FeedItem].
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getUri() {
        return null;
    }
    
    /**
     * * The user that this event occurred for. This will be present for [AttributionType.LIKE],
     *     * [AttributionType.APPEARANCE], and [AttributionType.SHARE] activity types.
     */
    @org.jetbrains.annotations.Nullable()
    public final com.vimeo.networking2.User getUser() {
        return null;
    }
    
    public FeedItem(@org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "category")
    com.vimeo.networking2.Category category, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "channel")
    com.vimeo.networking2.Channel channel, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "group")
    com.vimeo.networking2.Group group, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "metadata")
    com.vimeo.networking2.MetadataConnections<com.vimeo.networking2.FeedItemConnections> metadata, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "tag")
    com.vimeo.networking2.Tag tag, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "time")
    java.util.Date time, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "type")
    java.lang.String rawType, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "clip")
    com.vimeo.networking2.Video video, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "uri")
    java.lang.String uri, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "user")
    com.vimeo.networking2.User user) {
        super();
    }
    
    public FeedItem() {
        super();
    }
    
    /**
     * * The category that this event occurred for. This will be present for only
     *     * [AttributionType.CATEGORY] feed item type.
     */
    @org.jetbrains.annotations.Nullable()
    public final com.vimeo.networking2.Category component1() {
        return null;
    }
    
    /**
     * * The channel that this event occurred for. This will be present for only
     *     * [AttributionType.CHANNEL] feed item type.
     */
    @org.jetbrains.annotations.Nullable()
    public final com.vimeo.networking2.Channel component2() {
        return null;
    }
    
    /**
     * * The group that this event occurred for. This will be present for only
     *     * [AttributionType.GROUP] feed item type.
     */
    @org.jetbrains.annotations.Nullable()
    public final com.vimeo.networking2.Group component3() {
        return null;
    }
    
    /**
     * * The feed item's metadata.
     */
    @org.jetbrains.annotations.Nullable()
    public final com.vimeo.networking2.MetadataConnections<com.vimeo.networking2.FeedItemConnections> component4() {
        return null;
    }
    
    /**
     * * The tag that this event occurred for. This will be present for only
     *     * [AttributionType.TAG] feed item type.
     */
    @org.jetbrains.annotations.Nullable()
    public final com.vimeo.networking2.Tag component5() {
        return null;
    }
    
    /**
     * * Time that the event occurred.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.util.Date component6() {
        return null;
    }
    
    /**
     * * Feed item type.
     *     * @see FeedItem.type
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component7() {
        return null;
    }
    
    /**
     * * Video associated with ths feed item.
     */
    @org.jetbrains.annotations.Nullable()
    public final com.vimeo.networking2.Video component8() {
        return null;
    }
    
    /**
     * * The uri for the [FeedItem].
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component9() {
        return null;
    }
    
    /**
     * * The user that this event occurred for. This will be present for [AttributionType.LIKE],
     *     * [AttributionType.APPEARANCE], and [AttributionType.SHARE] activity types.
     */
    @org.jetbrains.annotations.Nullable()
    public final com.vimeo.networking2.User component10() {
        return null;
    }
    
    /**
     * * An item in the user's feed.
     */
    @org.jetbrains.annotations.NotNull()
    public final com.vimeo.networking2.FeedItem copy(@org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "category")
    com.vimeo.networking2.Category category, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "channel")
    com.vimeo.networking2.Channel channel, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "group")
    com.vimeo.networking2.Group group, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "metadata")
    com.vimeo.networking2.MetadataConnections<com.vimeo.networking2.FeedItemConnections> metadata, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "tag")
    com.vimeo.networking2.Tag tag, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "time")
    java.util.Date time, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "type")
    java.lang.String rawType, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "clip")
    com.vimeo.networking2.Video video, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "uri")
    java.lang.String uri, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "user")
    com.vimeo.networking2.User user) {
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