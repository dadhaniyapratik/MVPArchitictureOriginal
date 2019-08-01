package com.vimeo.networking2;

import java.lang.System;

/**
 * * Channel information.
 */
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\'\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B\u00c5\u0001\u0012\u0010\b\u0003\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\u0007\u0012\u0016\b\u0003\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f\u0018\u00010\r\u0012\n\b\u0003\u0010\u0010\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0003\u0010\u0011\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0003\u0010\u0012\u001a\u0004\u0018\u00010\n\u0012\n\b\u0003\u0010\u0013\u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0003\u0010\u0015\u001a\u0004\u0018\u00010\u0007\u0012\u0010\b\u0003\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0004\u0012\n\b\u0003\u0010\u0018\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0003\u0010\u0019\u001a\u0004\u0018\u00010\u001a\u00a2\u0006\u0002\u0010\u001bJ\u0011\u00102\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004H\u00c6\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\u0014H\u00c6\u0003J\u000b\u00104\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J\u0011\u00105\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0004H\u00c6\u0003J\u000b\u00106\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J\u000b\u00107\u001a\u0004\u0018\u00010\u001aH\u00c6\u0003J\u000b\u00108\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J\u000b\u00109\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J\u000b\u0010:\u001a\u0004\u0018\u00010\nH\u00c6\u0003J\u000b\u0010;\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J\u0017\u0010<\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f\u0018\u00010\rH\u00c6\u0003J\u000b\u0010=\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J\u000b\u0010>\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J\u000b\u0010?\u001a\u0004\u0018\u00010\nH\u00c6\u0003J\u00c9\u0001\u0010@\u001a\u00020\u00002\u0010\b\u0003\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\u00072\u0016\b\u0003\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f\u0018\u00010\r2\n\b\u0003\u0010\u0010\u001a\u0004\u0018\u00010\u00072\n\b\u0003\u0010\u0011\u001a\u0004\u0018\u00010\u00072\n\b\u0003\u0010\u0012\u001a\u0004\u0018\u00010\n2\n\b\u0003\u0010\u0013\u001a\u0004\u0018\u00010\u00142\n\b\u0003\u0010\u0015\u001a\u0004\u0018\u00010\u00072\u0010\b\u0003\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u00042\n\b\u0003\u0010\u0018\u001a\u0004\u0018\u00010\u00072\n\b\u0003\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u00c6\u0001J\u0013\u0010A\u001a\u00020B2\b\u0010C\u001a\u0004\u0018\u00010DH\u00d6\u0003J\t\u0010E\u001a\u00020FH\u00d6\u0001J\t\u0010G\u001a\u00020\u0007H\u00d6\u0001R\u0019\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b \u0010\u001fR\u0013\u0010\t\u001a\u0004\u0018\u00010\n\u00a2\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0016\u0010#\u001a\u0004\u0018\u00010\u0007X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b$\u0010\u001fR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b%\u0010\u001fR\"\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f\u0018\u00010\rX\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b&\u0010\'R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b(\u0010\u001fR\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b)\u0010\u001fR\u0013\u0010\u0012\u001a\u0004\u0018\u00010\n\u00a2\u0006\b\n\u0000\u001a\u0004\b*\u0010\"R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0014\u00a2\u0006\b\n\u0000\u001a\u0004\b+\u0010,R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b-\u0010\u001fR\u0019\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b.\u0010\u001dR\u0013\u0010\u0018\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b/\u0010\u001fR\u0013\u0010\u0019\u001a\u0004\u0018\u00010\u001a\u00a2\u0006\b\n\u0000\u001a\u0004\b0\u00101\u00a8\u0006H"}, d2 = {"Lcom/vimeo/networking2/Channel;", "Lcom/vimeo/networking2/common/Followable;", "Lcom/vimeo/networking2/common/Entity;", "categories", "", "Lcom/vimeo/networking2/Category;", "createdTime", "", "description", "header", "Lcom/vimeo/networking2/PictureCollection;", "link", "metadata", "Lcom/vimeo/networking2/Metadata;", "Lcom/vimeo/networking2/ChannelConnections;", "Lcom/vimeo/networking2/ChannelInteractions;", "modifiedTime", "name", "pictures", "privacy", "Lcom/vimeo/networking2/Privacy;", "resourceKey", "tags", "Lcom/vimeo/networking2/Tag;", "uri", "user", "Lcom/vimeo/networking2/User;", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lcom/vimeo/networking2/PictureCollection;Ljava/lang/String;Lcom/vimeo/networking2/Metadata;Ljava/lang/String;Ljava/lang/String;Lcom/vimeo/networking2/PictureCollection;Lcom/vimeo/networking2/Privacy;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lcom/vimeo/networking2/User;)V", "getCategories", "()Ljava/util/List;", "getCreatedTime", "()Ljava/lang/String;", "getDescription", "getHeader", "()Lcom/vimeo/networking2/PictureCollection;", "identifier", "getIdentifier", "getLink", "getMetadata", "()Lcom/vimeo/networking2/Metadata;", "getModifiedTime", "getName", "getPictures", "getPrivacy", "()Lcom/vimeo/networking2/Privacy;", "getResourceKey", "getTags", "getUri", "getUser", "()Lcom/vimeo/networking2/User;", "component1", "component10", "component11", "component12", "component13", "component14", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "", "hashCode", "", "toString", "models"})
@com.squareup.moshi.JsonClass(generateAdapter = true)
public final class Channel implements com.vimeo.networking2.common.Followable, com.vimeo.networking2.common.Entity {
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String identifier = null;
    
    /**
     * * The categories to which this channel belongs as specified by the channel moderators.
     */
    @org.jetbrains.annotations.Nullable()
    private final java.util.List<com.vimeo.networking2.Category> categories = null;
    
    /**
     * * The time in ISO 8601 format when the channel was created.
     */
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String createdTime = null;
    
    /**
     * * A brief explanation of the channel's content.
     */
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String description = null;
    
    /**
     * * The banner that appears by default at the top of the channel page.
     */
    @org.jetbrains.annotations.Nullable()
    private final com.vimeo.networking2.PictureCollection header = null;
    
    /**
     * * The URL to access the channel in a browser.
     */
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String link = null;
    
    /**
     * * Metadata about the channel.
     */
    @org.jetbrains.annotations.Nullable()
    private final com.vimeo.networking2.Metadata<com.vimeo.networking2.ChannelConnections, com.vimeo.networking2.ChannelInteractions> metadata = null;
    
    /**
     * * The time in ISO 8601 format when the album was last modified.
     */
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String modifiedTime = null;
    
    /**
     * * The display name that identifies the channel.
     */
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String name = null;
    
    /**
     * * The active image for the channel; defaults to the thumbnail of the last video
     *     * added to the channel.
     */
    @org.jetbrains.annotations.Nullable()
    private final com.vimeo.networking2.PictureCollection pictures = null;
    
    /**
     * * The privacy settings of the channel.
     */
    @org.jetbrains.annotations.Nullable()
    private final com.vimeo.networking2.Privacy privacy = null;
    
    /**
     * * The channel resource key.
     */
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String resourceKey = null;
    
    /**
     * * An array of all tags assigned to this channel.
     */
    @org.jetbrains.annotations.Nullable()
    private final java.util.List<com.vimeo.networking2.Tag> tags = null;
    
    /**
     * * The unique identifier to access the channel resource.
     */
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String uri = null;
    
    /**
     * * The Vimeo user who owns the channel.
     */
    @org.jetbrains.annotations.Nullable()
    private final com.vimeo.networking2.User user = null;
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.String getIdentifier() {
        return null;
    }
    
    /**
     * * The categories to which this channel belongs as specified by the channel moderators.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.vimeo.networking2.Category> getCategories() {
        return null;
    }
    
    /**
     * * The time in ISO 8601 format when the channel was created.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getCreatedTime() {
        return null;
    }
    
    /**
     * * A brief explanation of the channel's content.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getDescription() {
        return null;
    }
    
    /**
     * * The banner that appears by default at the top of the channel page.
     */
    @org.jetbrains.annotations.Nullable()
    public final com.vimeo.networking2.PictureCollection getHeader() {
        return null;
    }
    
    /**
     * * The URL to access the channel in a browser.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getLink() {
        return null;
    }
    
    /**
     * * Metadata about the channel.
     */
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public com.vimeo.networking2.Metadata<com.vimeo.networking2.ChannelConnections, com.vimeo.networking2.ChannelInteractions> getMetadata() {
        return null;
    }
    
    /**
     * * The time in ISO 8601 format when the album was last modified.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getModifiedTime() {
        return null;
    }
    
    /**
     * * The display name that identifies the channel.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getName() {
        return null;
    }
    
    /**
     * * The active image for the channel; defaults to the thumbnail of the last video
     *     * added to the channel.
     */
    @org.jetbrains.annotations.Nullable()
    public final com.vimeo.networking2.PictureCollection getPictures() {
        return null;
    }
    
    /**
     * * The privacy settings of the channel.
     */
    @org.jetbrains.annotations.Nullable()
    public final com.vimeo.networking2.Privacy getPrivacy() {
        return null;
    }
    
    /**
     * * The channel resource key.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getResourceKey() {
        return null;
    }
    
    /**
     * * An array of all tags assigned to this channel.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.vimeo.networking2.Tag> getTags() {
        return null;
    }
    
    /**
     * * The unique identifier to access the channel resource.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getUri() {
        return null;
    }
    
    /**
     * * The Vimeo user who owns the channel.
     */
    @org.jetbrains.annotations.Nullable()
    public final com.vimeo.networking2.User getUser() {
        return null;
    }
    
    public Channel(@org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "categories")
    java.util.List<com.vimeo.networking2.Category> categories, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "created_time")
    java.lang.String createdTime, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "description")
    java.lang.String description, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "header")
    com.vimeo.networking2.PictureCollection header, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "link")
    java.lang.String link, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "metadata")
    com.vimeo.networking2.Metadata<com.vimeo.networking2.ChannelConnections, com.vimeo.networking2.ChannelInteractions> metadata, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "modified_time")
    java.lang.String modifiedTime, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "name")
    java.lang.String name, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "pictures")
    com.vimeo.networking2.PictureCollection pictures, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "privacy")
    com.vimeo.networking2.Privacy privacy, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "resource_key")
    java.lang.String resourceKey, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "tags")
    java.util.List<com.vimeo.networking2.Tag> tags, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "uri")
    java.lang.String uri, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "user")
    com.vimeo.networking2.User user) {
        super();
    }
    
    public Channel() {
        super();
    }
    
    /**
     * * The categories to which this channel belongs as specified by the channel moderators.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.vimeo.networking2.Category> component1() {
        return null;
    }
    
    /**
     * * The time in ISO 8601 format when the channel was created.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component2() {
        return null;
    }
    
    /**
     * * A brief explanation of the channel's content.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component3() {
        return null;
    }
    
    /**
     * * The banner that appears by default at the top of the channel page.
     */
    @org.jetbrains.annotations.Nullable()
    public final com.vimeo.networking2.PictureCollection component4() {
        return null;
    }
    
    /**
     * * The URL to access the channel in a browser.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component5() {
        return null;
    }
    
    /**
     * * Metadata about the channel.
     */
    @org.jetbrains.annotations.Nullable()
    public final com.vimeo.networking2.Metadata<com.vimeo.networking2.ChannelConnections, com.vimeo.networking2.ChannelInteractions> component6() {
        return null;
    }
    
    /**
     * * The time in ISO 8601 format when the album was last modified.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component7() {
        return null;
    }
    
    /**
     * * The display name that identifies the channel.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component8() {
        return null;
    }
    
    /**
     * * The active image for the channel; defaults to the thumbnail of the last video
     *     * added to the channel.
     */
    @org.jetbrains.annotations.Nullable()
    public final com.vimeo.networking2.PictureCollection component9() {
        return null;
    }
    
    /**
     * * The privacy settings of the channel.
     */
    @org.jetbrains.annotations.Nullable()
    public final com.vimeo.networking2.Privacy component10() {
        return null;
    }
    
    /**
     * * The channel resource key.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component11() {
        return null;
    }
    
    /**
     * * An array of all tags assigned to this channel.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.vimeo.networking2.Tag> component12() {
        return null;
    }
    
    /**
     * * The unique identifier to access the channel resource.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component13() {
        return null;
    }
    
    /**
     * * The Vimeo user who owns the channel.
     */
    @org.jetbrains.annotations.Nullable()
    public final com.vimeo.networking2.User component14() {
        return null;
    }
    
    /**
     * * Channel information.
     */
    @org.jetbrains.annotations.NotNull()
    public final com.vimeo.networking2.Channel copy(@org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "categories")
    java.util.List<com.vimeo.networking2.Category> categories, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "created_time")
    java.lang.String createdTime, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "description")
    java.lang.String description, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "header")
    com.vimeo.networking2.PictureCollection header, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "link")
    java.lang.String link, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "metadata")
    com.vimeo.networking2.Metadata<com.vimeo.networking2.ChannelConnections, com.vimeo.networking2.ChannelInteractions> metadata, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "modified_time")
    java.lang.String modifiedTime, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "name")
    java.lang.String name, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "pictures")
    com.vimeo.networking2.PictureCollection pictures, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "privacy")
    com.vimeo.networking2.Privacy privacy, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "resource_key")
    java.lang.String resourceKey, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "tags")
    java.util.List<com.vimeo.networking2.Tag> tags, @org.jetbrains.annotations.Nullable()
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