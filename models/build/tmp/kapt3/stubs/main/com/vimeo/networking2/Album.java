package com.vimeo.networking2;

import java.lang.System;

/**
 * * Group of videos to share publicly or privately.
 */
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b;\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001B\u0087\u0002\u0012\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0003\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\u0016\b\u0003\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0012\u0012\n\b\u0003\u0010\u0015\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010\u0016\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0003\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0018\u0012\n\b\u0003\u0010\u0019\u001a\u0004\u0018\u00010\u001a\u0012\n\b\u0003\u0010\u001b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u001c\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0003\u0010\u001d\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u001e\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u001f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010 \u001a\u0004\u0018\u00010!\u00a2\u0006\u0002\u0010\"J\u000b\u0010E\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0017\u0010F\u001a\u0010\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0012H\u00c6\u0003J\u000b\u0010G\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010H\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0011\u0010I\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0018H\u00c6\u0003J\u000b\u0010J\u001a\u0004\u0018\u00010\u001aH\u00c6\u0003J\u000b\u0010K\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0010\u0010L\u001a\u0004\u0018\u00010\u000eH\u00c6\u0003\u00a2\u0006\u0002\u00100J\u000b\u0010M\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010N\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010O\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010P\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010Q\u001a\u0004\u0018\u00010!H\u00c6\u0003J\u000b\u0010R\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J\u000b\u0010S\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0010\u0010T\u001a\u0004\u0018\u00010\nH\u00c6\u0003\u00a2\u0006\u0002\u0010+J\u000b\u0010U\u001a\u0004\u0018\u00010\fH\u00c6\u0003J\u0010\u0010V\u001a\u0004\u0018\u00010\u000eH\u00c6\u0003\u00a2\u0006\u0002\u00100J\u000b\u0010W\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010X\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0090\u0002\u0010Y\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0003\u0010\u000f\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0010\u001a\u0004\u0018\u00010\u00032\u0016\b\u0003\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u00122\n\b\u0003\u0010\u0015\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0016\u001a\u0004\u0018\u00010\u00032\u0010\b\u0003\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00182\n\b\u0003\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\n\b\u0003\u0010\u001b\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u001c\u001a\u0004\u0018\u00010\u000e2\n\b\u0003\u0010\u001d\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u001e\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u001f\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010 \u001a\u0004\u0018\u00010!H\u00c6\u0001\u00a2\u0006\u0002\u0010ZJ\u0013\u0010[\u001a\u00020\u000e2\b\u0010\\\u001a\u0004\u0018\u00010]H\u00d6\u0003J\t\u0010^\u001a\u00020\nH\u00d6\u0001J\t\u0010_\u001a\u00020\u0003H\u00d6\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\'\u0010(R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b)\u0010$R\u0015\u0010\t\u001a\u0004\u0018\u00010\n\u00a2\u0006\n\n\u0002\u0010,\u001a\u0004\b*\u0010+R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f\u00a2\u0006\b\n\u0000\u001a\u0004\b-\u0010.R\u0015\u0010\r\u001a\u0004\u0018\u00010\u000e\u00a2\u0006\n\n\u0002\u00101\u001a\u0004\b/\u00100R\u0016\u00102\u001a\u0004\u0018\u00010\u0003X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b3\u0010$R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b4\u0010$R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b5\u0010$R\u001f\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0012\u00a2\u0006\b\n\u0000\u001a\u0004\b6\u00107R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b8\u0010&R\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b9\u0010$R\u0019\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0018\u00a2\u0006\b\n\u0000\u001a\u0004\b:\u0010;R\u0013\u0010\u0019\u001a\u0004\u0018\u00010\u001a\u00a2\u0006\b\n\u0000\u001a\u0004\b<\u0010=R\u0013\u0010\u001b\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b>\u0010$R\u0015\u0010\u001c\u001a\u0004\u0018\u00010\u000e\u00a2\u0006\n\n\u0002\u00101\u001a\u0004\b?\u00100R\u0013\u0010\u001d\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b@\u0010$R\u0013\u0010\u001e\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bA\u0010$R\u0013\u0010\u001f\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bB\u0010$R\u0013\u0010 \u001a\u0004\u0018\u00010!\u00a2\u0006\b\n\u0000\u001a\u0004\bC\u0010D\u00a8\u0006`"}, d2 = {"Lcom/vimeo/networking2/Album;", "Lcom/vimeo/networking2/common/Entity;", "brandColor", "", "createdTime", "Ljava/util/Date;", "customLogo", "Lcom/vimeo/networking2/PictureCollection;", "description", "duration", "", "embed", "Lcom/vimeo/networking2/AlbumEmbed;", "hideNav", "", "layout", "link", "metadata", "Lcom/vimeo/networking2/Metadata;", "Lcom/vimeo/networking2/AlbumConnections;", "Lcom/vimeo/networking2/AlbumInteractions;", "modifiedTime", "name", "pictures", "", "privacy", "Lcom/vimeo/networking2/AlbumPrivacy;", "resourceKey", "reviewMode", "sort", "theme", "uri", "user", "Lcom/vimeo/networking2/User;", "(Ljava/lang/String;Ljava/util/Date;Lcom/vimeo/networking2/PictureCollection;Ljava/lang/String;Ljava/lang/Integer;Lcom/vimeo/networking2/AlbumEmbed;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Lcom/vimeo/networking2/Metadata;Ljava/util/Date;Ljava/lang/String;Ljava/util/List;Lcom/vimeo/networking2/AlbumPrivacy;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/vimeo/networking2/User;)V", "getBrandColor", "()Ljava/lang/String;", "getCreatedTime", "()Ljava/util/Date;", "getCustomLogo", "()Lcom/vimeo/networking2/PictureCollection;", "getDescription", "getDuration", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getEmbed", "()Lcom/vimeo/networking2/AlbumEmbed;", "getHideNav", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "identifier", "getIdentifier", "getLayout", "getLink", "getMetadata", "()Lcom/vimeo/networking2/Metadata;", "getModifiedTime", "getName", "getPictures", "()Ljava/util/List;", "getPrivacy", "()Lcom/vimeo/networking2/AlbumPrivacy;", "getResourceKey", "getReviewMode", "getSort", "getTheme", "getUri", "getUser", "()Lcom/vimeo/networking2/User;", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/util/Date;Lcom/vimeo/networking2/PictureCollection;Ljava/lang/String;Ljava/lang/Integer;Lcom/vimeo/networking2/AlbumEmbed;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Lcom/vimeo/networking2/Metadata;Ljava/util/Date;Ljava/lang/String;Ljava/util/List;Lcom/vimeo/networking2/AlbumPrivacy;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/vimeo/networking2/User;)Lcom/vimeo/networking2/Album;", "equals", "other", "", "hashCode", "toString", "models"})
@com.squareup.moshi.JsonClass(generateAdapter = true)
public final class Album implements com.vimeo.networking2.common.Entity {
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String identifier = null;
    
    /**
     * * Hexadecimal color code for the decorative color.
     *     * For example, album videos use this color for player buttons.
     */
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String brandColor = null;
    
    /**
     * * The time in ISO 8601 format that the album was created.
     */
    @org.jetbrains.annotations.Nullable()
    private final java.util.Date createdTime = null;
    
    /**
     * * Custom logo for the album.
     */
    @org.jetbrains.annotations.Nullable()
    private final com.vimeo.networking2.PictureCollection customLogo = null;
    
    /**
     * * A brief description of the album's content.
     */
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String description = null;
    
    /**
     * * The total duration in seconds of all the videos in the album.
     */
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Integer duration = null;
    
    /**
     * * Embed data for the album.
     */
    @org.jetbrains.annotations.Nullable()
    private final com.vimeo.networking2.AlbumEmbed embed = null;
    
    /**
     * * Whether to hide the Vimeo navigation when viewing the album.
     */
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Boolean hideNav = null;
    
    /**
     * * The album's layout preference.
     *     * @see Album.layoutType
     */
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String layout = null;
    
    /**
     * * The URL to access the album.
     */
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String link = null;
    
    /**
     * * Metadata about the album.
     */
    @org.jetbrains.annotations.Nullable()
    private final com.vimeo.networking2.Metadata<com.vimeo.networking2.AlbumConnections, com.vimeo.networking2.AlbumInteractions> metadata = null;
    
    /**
     * * The time in ISO 8601 format when the album was last modified.
     */
    @org.jetbrains.annotations.Nullable()
    private final java.util.Date modifiedTime = null;
    
    /**
     * * The album's display name.
     */
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String name = null;
    
    /**
     * * A list of 3 most recently added videos to the album.
     */
    @org.jetbrains.annotations.Nullable()
    private final java.util.List<com.vimeo.networking2.PictureCollection> pictures = null;
    
    /**
     * * The privacy settings of the album.
     */
    @org.jetbrains.annotations.Nullable()
    private final com.vimeo.networking2.AlbumPrivacy privacy = null;
    
    /**
     * * The album resource key.
     */
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String resourceKey = null;
    
    /**
     * * Whether album videos should use the review mode URL.
     */
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Boolean reviewMode = null;
    
    /**
     * * Sort type of the album.
     *     * @see Album.sortType
     */
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String sort = null;
    
    /**
     * * The album's color theme preference.
     *     * @see Album.themeType
     */
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String theme = null;
    
    /**
     * * The album's URI.
     */
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String uri = null;
    
    /**
     * * The owner of the album.
     */
    @org.jetbrains.annotations.Nullable()
    private final com.vimeo.networking2.User user = null;
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.String getIdentifier() {
        return null;
    }
    
    /**
     * * Hexadecimal color code for the decorative color.
     *     * For example, album videos use this color for player buttons.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getBrandColor() {
        return null;
    }
    
    /**
     * * The time in ISO 8601 format that the album was created.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.util.Date getCreatedTime() {
        return null;
    }
    
    /**
     * * Custom logo for the album.
     */
    @org.jetbrains.annotations.Nullable()
    public final com.vimeo.networking2.PictureCollection getCustomLogo() {
        return null;
    }
    
    /**
     * * A brief description of the album's content.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getDescription() {
        return null;
    }
    
    /**
     * * The total duration in seconds of all the videos in the album.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getDuration() {
        return null;
    }
    
    /**
     * * Embed data for the album.
     */
    @org.jetbrains.annotations.Nullable()
    public final com.vimeo.networking2.AlbumEmbed getEmbed() {
        return null;
    }
    
    /**
     * * Whether to hide the Vimeo navigation when viewing the album.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean getHideNav() {
        return null;
    }
    
    /**
     * * The album's layout preference.
     *     * @see Album.layoutType
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getLayout() {
        return null;
    }
    
    /**
     * * The URL to access the album.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getLink() {
        return null;
    }
    
    /**
     * * Metadata about the album.
     */
    @org.jetbrains.annotations.Nullable()
    public final com.vimeo.networking2.Metadata<com.vimeo.networking2.AlbumConnections, com.vimeo.networking2.AlbumInteractions> getMetadata() {
        return null;
    }
    
    /**
     * * The time in ISO 8601 format when the album was last modified.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.util.Date getModifiedTime() {
        return null;
    }
    
    /**
     * * The album's display name.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getName() {
        return null;
    }
    
    /**
     * * A list of 3 most recently added videos to the album.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.vimeo.networking2.PictureCollection> getPictures() {
        return null;
    }
    
    /**
     * * The privacy settings of the album.
     */
    @org.jetbrains.annotations.Nullable()
    public final com.vimeo.networking2.AlbumPrivacy getPrivacy() {
        return null;
    }
    
    /**
     * * The album resource key.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getResourceKey() {
        return null;
    }
    
    /**
     * * Whether album videos should use the review mode URL.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean getReviewMode() {
        return null;
    }
    
    /**
     * * Sort type of the album.
     *     * @see Album.sortType
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getSort() {
        return null;
    }
    
    /**
     * * The album's color theme preference.
     *     * @see Album.themeType
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getTheme() {
        return null;
    }
    
    /**
     * * The album's URI.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getUri() {
        return null;
    }
    
    /**
     * * The owner of the album.
     */
    @org.jetbrains.annotations.Nullable()
    public final com.vimeo.networking2.User getUser() {
        return null;
    }
    
    public Album(@org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "brand_color")
    java.lang.String brandColor, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "created_time")
    java.util.Date createdTime, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "custom_logo")
    com.vimeo.networking2.PictureCollection customLogo, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "description")
    java.lang.String description, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "duration")
    java.lang.Integer duration, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "embed")
    com.vimeo.networking2.AlbumEmbed embed, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "hide_nav")
    java.lang.Boolean hideNav, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "layout")
    java.lang.String layout, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "link")
    java.lang.String link, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "metadata")
    com.vimeo.networking2.Metadata<com.vimeo.networking2.AlbumConnections, com.vimeo.networking2.AlbumInteractions> metadata, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "modified_time")
    java.util.Date modifiedTime, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "name")
    java.lang.String name, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "pictures")
    java.util.List<com.vimeo.networking2.PictureCollection> pictures, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "privacy")
    com.vimeo.networking2.AlbumPrivacy privacy, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "resource_key")
    java.lang.String resourceKey, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "review_mode")
    java.lang.Boolean reviewMode, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "sort")
    java.lang.String sort, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "theme")
    java.lang.String theme, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "uri")
    java.lang.String uri, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "user")
    com.vimeo.networking2.User user) {
        super();
    }
    
    public Album() {
        super();
    }
    
    /**
     * * Hexadecimal color code for the decorative color.
     *     * For example, album videos use this color for player buttons.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component1() {
        return null;
    }
    
    /**
     * * The time in ISO 8601 format that the album was created.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.util.Date component2() {
        return null;
    }
    
    /**
     * * Custom logo for the album.
     */
    @org.jetbrains.annotations.Nullable()
    public final com.vimeo.networking2.PictureCollection component3() {
        return null;
    }
    
    /**
     * * A brief description of the album's content.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component4() {
        return null;
    }
    
    /**
     * * The total duration in seconds of all the videos in the album.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component5() {
        return null;
    }
    
    /**
     * * Embed data for the album.
     */
    @org.jetbrains.annotations.Nullable()
    public final com.vimeo.networking2.AlbumEmbed component6() {
        return null;
    }
    
    /**
     * * Whether to hide the Vimeo navigation when viewing the album.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean component7() {
        return null;
    }
    
    /**
     * * The album's layout preference.
     *     * @see Album.layoutType
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component8() {
        return null;
    }
    
    /**
     * * The URL to access the album.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component9() {
        return null;
    }
    
    /**
     * * Metadata about the album.
     */
    @org.jetbrains.annotations.Nullable()
    public final com.vimeo.networking2.Metadata<com.vimeo.networking2.AlbumConnections, com.vimeo.networking2.AlbumInteractions> component10() {
        return null;
    }
    
    /**
     * * The time in ISO 8601 format when the album was last modified.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.util.Date component11() {
        return null;
    }
    
    /**
     * * The album's display name.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component12() {
        return null;
    }
    
    /**
     * * A list of 3 most recently added videos to the album.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.vimeo.networking2.PictureCollection> component13() {
        return null;
    }
    
    /**
     * * The privacy settings of the album.
     */
    @org.jetbrains.annotations.Nullable()
    public final com.vimeo.networking2.AlbumPrivacy component14() {
        return null;
    }
    
    /**
     * * The album resource key.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component15() {
        return null;
    }
    
    /**
     * * Whether album videos should use the review mode URL.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean component16() {
        return null;
    }
    
    /**
     * * Sort type of the album.
     *     * @see Album.sortType
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component17() {
        return null;
    }
    
    /**
     * * The album's color theme preference.
     *     * @see Album.themeType
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component18() {
        return null;
    }
    
    /**
     * * The album's URI.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component19() {
        return null;
    }
    
    /**
     * * The owner of the album.
     */
    @org.jetbrains.annotations.Nullable()
    public final com.vimeo.networking2.User component20() {
        return null;
    }
    
    /**
     * * Group of videos to share publicly or privately.
     */
    @org.jetbrains.annotations.NotNull()
    public final com.vimeo.networking2.Album copy(@org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "brand_color")
    java.lang.String brandColor, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "created_time")
    java.util.Date createdTime, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "custom_logo")
    com.vimeo.networking2.PictureCollection customLogo, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "description")
    java.lang.String description, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "duration")
    java.lang.Integer duration, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "embed")
    com.vimeo.networking2.AlbumEmbed embed, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "hide_nav")
    java.lang.Boolean hideNav, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "layout")
    java.lang.String layout, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "link")
    java.lang.String link, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "metadata")
    com.vimeo.networking2.Metadata<com.vimeo.networking2.AlbumConnections, com.vimeo.networking2.AlbumInteractions> metadata, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "modified_time")
    java.util.Date modifiedTime, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "name")
    java.lang.String name, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "pictures")
    java.util.List<com.vimeo.networking2.PictureCollection> pictures, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "privacy")
    com.vimeo.networking2.AlbumPrivacy privacy, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "resource_key")
    java.lang.String resourceKey, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "review_mode")
    java.lang.Boolean reviewMode, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "sort")
    java.lang.String sort, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "theme")
    java.lang.String theme, @org.jetbrains.annotations.Nullable()
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