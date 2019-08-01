package com.vimeo.networking2;

import java.lang.System;

/**
 * * This class represents the model for a Video On Demand (VOD) container.
 */
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0089\u0001\u0012\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\u0016\b\u0003\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\b\u0012\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\r\u0012\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0003\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0011\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u00a2\u0006\u0002\u0010\u0014J\u000b\u0010%\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0013H\u00c6\u0003J\u000b\u0010\'\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0017\u0010)\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\bH\u00c6\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\rH\u00c6\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\u000fH\u00c6\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u008d\u0001\u0010/\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00032\u0016\b\u0003\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\b2\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0003\u0010\u0010\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0011\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u00c6\u0001J\u0013\u00100\u001a\u0002012\b\u00102\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u00103\u001a\u000204H\u00d6\u0001J\t\u00105\u001a\u00020\u0003H\u00d6\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0016R\u001f\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0016R\u0013\u0010\f\u001a\u0004\u0018\u00010\r\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0016R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0018R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u00a2\u0006\b\n\u0000\u001a\u0004\b#\u0010$\u00a8\u00066"}, d2 = {"Lcom/vimeo/networking2/TvodItem;", "", "description", "", "film", "Lcom/vimeo/networking2/Video;", "link", "metadata", "Lcom/vimeo/networking2/Metadata;", "Lcom/vimeo/networking2/TvodItemConnections;", "Lcom/vimeo/networking2/PurchaseOnDemandInteraction;", "name", "pictures", "Lcom/vimeo/networking2/PictureCollection;", "published", "Lcom/vimeo/networking2/Publish;", "rawType", "trailer", "user", "Lcom/vimeo/networking2/User;", "(Ljava/lang/String;Lcom/vimeo/networking2/Video;Ljava/lang/String;Lcom/vimeo/networking2/Metadata;Ljava/lang/String;Lcom/vimeo/networking2/PictureCollection;Lcom/vimeo/networking2/Publish;Ljava/lang/String;Lcom/vimeo/networking2/Video;Lcom/vimeo/networking2/User;)V", "getDescription", "()Ljava/lang/String;", "getFilm", "()Lcom/vimeo/networking2/Video;", "getLink", "getMetadata", "()Lcom/vimeo/networking2/Metadata;", "getName", "getPictures", "()Lcom/vimeo/networking2/PictureCollection;", "getPublished", "()Lcom/vimeo/networking2/Publish;", "getRawType", "getTrailer", "getUser", "()Lcom/vimeo/networking2/User;", "component1", "component10", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "", "toString", "models"})
@com.squareup.moshi.JsonClass(generateAdapter = true)
public final class TvodItem {
    
    /**
     * * The description of this [TvodItem].
     */
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String description = null;
    
    /**
     * * This [TvodItem]'s film, if it is a film.
     */
    @org.jetbrains.annotations.Nullable()
    private final com.vimeo.networking2.Video film = null;
    
    /**
     * * The link to the [TvodItem] on Vimeo.
     */
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String link = null;
    
    /**
     * * Metadata about [TvodItem].
     */
    @org.jetbrains.annotations.Nullable()
    private final com.vimeo.networking2.Metadata<com.vimeo.networking2.TvodItemConnections, com.vimeo.networking2.PurchaseOnDemandInteraction> metadata = null;
    
    /**
     * * A descriptive title of this [TvodItem].
     */
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String name = null;
    
    /**
     * * The active poster for this [TvodItem].
     */
    @org.jetbrains.annotations.Nullable()
    private final com.vimeo.networking2.PictureCollection pictures = null;
    
    /**
     * * Information on the time the [TvodItem] was published.
     */
    @org.jetbrains.annotations.Nullable()
    private final com.vimeo.networking2.Publish published = null;
    
    /**
     * * Whether this [TvodItem] is for a film or a series.
     *     * @see TvodItem.type
     */
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String rawType = null;
    
    /**
     * * The trailer for this [TvodItem].
     */
    @org.jetbrains.annotations.Nullable()
    private final com.vimeo.networking2.Video trailer = null;
    
    /**
     * * The user who created this [TvodItem].
     */
    @org.jetbrains.annotations.Nullable()
    private final com.vimeo.networking2.User user = null;
    
    /**
     * * The description of this [TvodItem].
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getDescription() {
        return null;
    }
    
    /**
     * * This [TvodItem]'s film, if it is a film.
     */
    @org.jetbrains.annotations.Nullable()
    public final com.vimeo.networking2.Video getFilm() {
        return null;
    }
    
    /**
     * * The link to the [TvodItem] on Vimeo.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getLink() {
        return null;
    }
    
    /**
     * * Metadata about [TvodItem].
     */
    @org.jetbrains.annotations.Nullable()
    public final com.vimeo.networking2.Metadata<com.vimeo.networking2.TvodItemConnections, com.vimeo.networking2.PurchaseOnDemandInteraction> getMetadata() {
        return null;
    }
    
    /**
     * * A descriptive title of this [TvodItem].
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getName() {
        return null;
    }
    
    /**
     * * The active poster for this [TvodItem].
     */
    @org.jetbrains.annotations.Nullable()
    public final com.vimeo.networking2.PictureCollection getPictures() {
        return null;
    }
    
    /**
     * * Information on the time the [TvodItem] was published.
     */
    @org.jetbrains.annotations.Nullable()
    public final com.vimeo.networking2.Publish getPublished() {
        return null;
    }
    
    /**
     * * Whether this [TvodItem] is for a film or a series.
     *     * @see TvodItem.type
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getRawType() {
        return null;
    }
    
    /**
     * * The trailer for this [TvodItem].
     */
    @org.jetbrains.annotations.Nullable()
    public final com.vimeo.networking2.Video getTrailer() {
        return null;
    }
    
    /**
     * * The user who created this [TvodItem].
     */
    @org.jetbrains.annotations.Nullable()
    public final com.vimeo.networking2.User getUser() {
        return null;
    }
    
    public TvodItem(@org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "description")
    java.lang.String description, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "film")
    com.vimeo.networking2.Video film, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "link")
    java.lang.String link, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "metadata")
    com.vimeo.networking2.Metadata<com.vimeo.networking2.TvodItemConnections, com.vimeo.networking2.PurchaseOnDemandInteraction> metadata, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "name")
    java.lang.String name, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "pictures")
    com.vimeo.networking2.PictureCollection pictures, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "published")
    com.vimeo.networking2.Publish published, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "type")
    java.lang.String rawType, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "trailer")
    com.vimeo.networking2.Video trailer, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "user")
    com.vimeo.networking2.User user) {
        super();
    }
    
    public TvodItem() {
        super();
    }
    
    /**
     * * The description of this [TvodItem].
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component1() {
        return null;
    }
    
    /**
     * * This [TvodItem]'s film, if it is a film.
     */
    @org.jetbrains.annotations.Nullable()
    public final com.vimeo.networking2.Video component2() {
        return null;
    }
    
    /**
     * * The link to the [TvodItem] on Vimeo.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component3() {
        return null;
    }
    
    /**
     * * Metadata about [TvodItem].
     */
    @org.jetbrains.annotations.Nullable()
    public final com.vimeo.networking2.Metadata<com.vimeo.networking2.TvodItemConnections, com.vimeo.networking2.PurchaseOnDemandInteraction> component4() {
        return null;
    }
    
    /**
     * * A descriptive title of this [TvodItem].
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component5() {
        return null;
    }
    
    /**
     * * The active poster for this [TvodItem].
     */
    @org.jetbrains.annotations.Nullable()
    public final com.vimeo.networking2.PictureCollection component6() {
        return null;
    }
    
    /**
     * * Information on the time the [TvodItem] was published.
     */
    @org.jetbrains.annotations.Nullable()
    public final com.vimeo.networking2.Publish component7() {
        return null;
    }
    
    /**
     * * Whether this [TvodItem] is for a film or a series.
     *     * @see TvodItem.type
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component8() {
        return null;
    }
    
    /**
     * * The trailer for this [TvodItem].
     */
    @org.jetbrains.annotations.Nullable()
    public final com.vimeo.networking2.Video component9() {
        return null;
    }
    
    /**
     * * The user who created this [TvodItem].
     */
    @org.jetbrains.annotations.Nullable()
    public final com.vimeo.networking2.User component10() {
        return null;
    }
    
    /**
     * * This class represents the model for a Video On Demand (VOD) container.
     */
    @org.jetbrains.annotations.NotNull()
    public final com.vimeo.networking2.TvodItem copy(@org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "description")
    java.lang.String description, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "film")
    com.vimeo.networking2.Video film, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "link")
    java.lang.String link, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "metadata")
    com.vimeo.networking2.Metadata<com.vimeo.networking2.TvodItemConnections, com.vimeo.networking2.PurchaseOnDemandInteraction> metadata, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "name")
    java.lang.String name, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "pictures")
    com.vimeo.networking2.PictureCollection pictures, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "published")
    com.vimeo.networking2.Publish published, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "type")
    java.lang.String rawType, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "trailer")
    com.vimeo.networking2.Video trailer, @org.jetbrains.annotations.Nullable()
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