package com.vimeo.networking2;

import java.lang.System;

/**
 * * Category information.
 */
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0002\b&\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B\u009b\u0001\u0012\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u0016\b\u0003\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\n\u0012\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\b\u0012\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\u0000\u0012\n\b\u0003\u0010\u000f\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0003\u0010\u0010\u001a\u0004\u0018\u00010\b\u0012\u0010\b\u0003\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u0012\u0012\n\b\u0003\u0010\u0013\u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0003\u0010\u0015\u001a\u0004\u0018\u00010\b\u00a2\u0006\u0002\u0010\u0016J\u000b\u0010,\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003J\u0010\u0010-\u001a\u0004\u0018\u00010\u0014H\u00c6\u0003\u00a2\u0006\u0002\u0010)J\u000b\u0010.\u001a\u0004\u0018\u00010\bH\u00c6\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\bH\u00c6\u0003J\u0017\u00101\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\nH\u00c6\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\bH\u00c6\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\u0000H\u00c6\u0003J\u000b\u00104\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003J\u000b\u00105\u001a\u0004\u0018\u00010\bH\u00c6\u0003J\u0011\u00106\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u0012H\u00c6\u0003J\u00a4\u0001\u00107\u001a\u00020\u00002\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0016\b\u0003\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\n2\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\b2\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\u00002\n\b\u0003\u0010\u000f\u001a\u0004\u0018\u00010\u00042\n\b\u0003\u0010\u0010\u001a\u0004\u0018\u00010\b2\u0010\b\u0003\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u00122\n\b\u0003\u0010\u0013\u001a\u0004\u0018\u00010\u00142\n\b\u0003\u0010\u0015\u001a\u0004\u0018\u00010\bH\u00c6\u0001\u00a2\u0006\u0002\u00108J\u0013\u00109\u001a\u00020\u00142\b\u0010:\u001a\u0004\u0018\u00010;H\u00d6\u0003J\t\u0010<\u001a\u00020=H\u00d6\u0001J\t\u0010>\u001a\u00020\bH\u00d6\u0001R\u0013\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0016\u0010\u0019\u001a\u0004\u0018\u00010\bX\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001bR\"\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\nX\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0013\u0010\r\u001a\u0004\u0018\u00010\b\u00a2\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001bR\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0000\u00a2\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b$\u0010\u0018R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\b\u00a2\u0006\b\n\u0000\u001a\u0004\b%\u0010\u001bR\u0019\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u0012\u00a2\u0006\b\n\u0000\u001a\u0004\b&\u0010\'R\u0015\u0010\u0013\u001a\u0004\u0018\u00010\u0014\u00a2\u0006\n\n\u0002\u0010*\u001a\u0004\b(\u0010)R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\b\u00a2\u0006\b\n\u0000\u001a\u0004\b+\u0010\u001b\u00a8\u0006?"}, d2 = {"Lcom/vimeo/networking2/Category;", "Lcom/vimeo/networking2/common/Followable;", "Lcom/vimeo/networking2/common/Entity;", "icon", "Lcom/vimeo/networking2/PictureCollection;", "lastVideoFeaturedTime", "Ljava/util/Date;", "link", "", "metadata", "Lcom/vimeo/networking2/Metadata;", "Lcom/vimeo/networking2/CategoryConnections;", "Lcom/vimeo/networking2/CategoryInteractions;", "name", "parent", "pictures", "resourceKey", "subcategories", "", "topLevel", "", "uri", "(Lcom/vimeo/networking2/PictureCollection;Ljava/util/Date;Ljava/lang/String;Lcom/vimeo/networking2/Metadata;Ljava/lang/String;Lcom/vimeo/networking2/Category;Lcom/vimeo/networking2/PictureCollection;Ljava/lang/String;Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/String;)V", "getIcon", "()Lcom/vimeo/networking2/PictureCollection;", "identifier", "getIdentifier", "()Ljava/lang/String;", "getLastVideoFeaturedTime", "()Ljava/util/Date;", "getLink", "getMetadata", "()Lcom/vimeo/networking2/Metadata;", "getName", "getParent", "()Lcom/vimeo/networking2/Category;", "getPictures", "getResourceKey", "getSubcategories", "()Ljava/util/List;", "getTopLevel", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getUri", "component1", "component10", "component11", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Lcom/vimeo/networking2/PictureCollection;Ljava/util/Date;Ljava/lang/String;Lcom/vimeo/networking2/Metadata;Ljava/lang/String;Lcom/vimeo/networking2/Category;Lcom/vimeo/networking2/PictureCollection;Ljava/lang/String;Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/String;)Lcom/vimeo/networking2/Category;", "equals", "other", "", "hashCode", "", "toString", "models"})
@com.squareup.moshi.JsonClass(generateAdapter = true)
public final class Category implements com.vimeo.networking2.common.Followable, com.vimeo.networking2.common.Entity {
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String identifier = null;
    
    /**
     * * The active icon for the category.
     */
    @org.jetbrains.annotations.Nullable()
    private final com.vimeo.networking2.PictureCollection icon = null;
    
    /**
     * * The last time, in ISO 8601 format, that a video was featured.
     */
    @org.jetbrains.annotations.Nullable()
    private final java.util.Date lastVideoFeaturedTime = null;
    
    /**
     * * The URL to access the category in a browser.
     */
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String link = null;
    
    /**
     * * Metadata about the category.
     */
    @org.jetbrains.annotations.Nullable()
    private final com.vimeo.networking2.Metadata<com.vimeo.networking2.CategoryConnections, com.vimeo.networking2.CategoryInteractions> metadata = null;
    
    /**
     * * The display name that identifies the category.
     */
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String name = null;
    
    /**
     * * The container of this category's parent category, if the current category is
     *     * a subcategory.
     */
    @org.jetbrains.annotations.Nullable()
    private final com.vimeo.networking2.Category parent = null;
    
    /**
     * * The active picture for this category; defaults to vertical color bars.
     */
    @org.jetbrains.annotations.Nullable()
    private final com.vimeo.networking2.PictureCollection pictures = null;
    
    /**
     * * The resource key of the category.
     */
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String resourceKey = null;
    
    /**
     * * All the subcategories that belong to this category, if the current category is
     *     * a top-level parent.
     */
    @org.jetbrains.annotations.Nullable()
    private final java.util.List<com.vimeo.networking2.Category> subcategories = null;
    
    /**
     * * Whether the category is not a subcategory of another category.
     */
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Boolean topLevel = null;
    
    /**
     * * The unique identifier to access the category resource.
     */
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String uri = null;
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.String getIdentifier() {
        return null;
    }
    
    /**
     * * The active icon for the category.
     */
    @org.jetbrains.annotations.Nullable()
    public final com.vimeo.networking2.PictureCollection getIcon() {
        return null;
    }
    
    /**
     * * The last time, in ISO 8601 format, that a video was featured.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.util.Date getLastVideoFeaturedTime() {
        return null;
    }
    
    /**
     * * The URL to access the category in a browser.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getLink() {
        return null;
    }
    
    /**
     * * Metadata about the category.
     */
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public com.vimeo.networking2.Metadata<com.vimeo.networking2.CategoryConnections, com.vimeo.networking2.CategoryInteractions> getMetadata() {
        return null;
    }
    
    /**
     * * The display name that identifies the category.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getName() {
        return null;
    }
    
    /**
     * * The container of this category's parent category, if the current category is
     *     * a subcategory.
     */
    @org.jetbrains.annotations.Nullable()
    public final com.vimeo.networking2.Category getParent() {
        return null;
    }
    
    /**
     * * The active picture for this category; defaults to vertical color bars.
     */
    @org.jetbrains.annotations.Nullable()
    public final com.vimeo.networking2.PictureCollection getPictures() {
        return null;
    }
    
    /**
     * * The resource key of the category.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getResourceKey() {
        return null;
    }
    
    /**
     * * All the subcategories that belong to this category, if the current category is
     *     * a top-level parent.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.vimeo.networking2.Category> getSubcategories() {
        return null;
    }
    
    /**
     * * Whether the category is not a subcategory of another category.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean getTopLevel() {
        return null;
    }
    
    /**
     * * The unique identifier to access the category resource.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getUri() {
        return null;
    }
    
    public Category(@org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "icon")
    com.vimeo.networking2.PictureCollection icon, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "last_video_featured_time")
    java.util.Date lastVideoFeaturedTime, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "link")
    java.lang.String link, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "metadata")
    com.vimeo.networking2.Metadata<com.vimeo.networking2.CategoryConnections, com.vimeo.networking2.CategoryInteractions> metadata, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "name")
    java.lang.String name, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "parent")
    com.vimeo.networking2.Category parent, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "pictures")
    com.vimeo.networking2.PictureCollection pictures, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "resource_key")
    java.lang.String resourceKey, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "subcategories")
    java.util.List<com.vimeo.networking2.Category> subcategories, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "top_level")
    java.lang.Boolean topLevel, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "uri")
    java.lang.String uri) {
        super();
    }
    
    public Category() {
        super();
    }
    
    /**
     * * The active icon for the category.
     */
    @org.jetbrains.annotations.Nullable()
    public final com.vimeo.networking2.PictureCollection component1() {
        return null;
    }
    
    /**
     * * The last time, in ISO 8601 format, that a video was featured.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.util.Date component2() {
        return null;
    }
    
    /**
     * * The URL to access the category in a browser.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component3() {
        return null;
    }
    
    /**
     * * Metadata about the category.
     */
    @org.jetbrains.annotations.Nullable()
    public final com.vimeo.networking2.Metadata<com.vimeo.networking2.CategoryConnections, com.vimeo.networking2.CategoryInteractions> component4() {
        return null;
    }
    
    /**
     * * The display name that identifies the category.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component5() {
        return null;
    }
    
    /**
     * * The container of this category's parent category, if the current category is
     *     * a subcategory.
     */
    @org.jetbrains.annotations.Nullable()
    public final com.vimeo.networking2.Category component6() {
        return null;
    }
    
    /**
     * * The active picture for this category; defaults to vertical color bars.
     */
    @org.jetbrains.annotations.Nullable()
    public final com.vimeo.networking2.PictureCollection component7() {
        return null;
    }
    
    /**
     * * The resource key of the category.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component8() {
        return null;
    }
    
    /**
     * * All the subcategories that belong to this category, if the current category is
     *     * a top-level parent.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.vimeo.networking2.Category> component9() {
        return null;
    }
    
    /**
     * * Whether the category is not a subcategory of another category.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean component10() {
        return null;
    }
    
    /**
     * * The unique identifier to access the category resource.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component11() {
        return null;
    }
    
    /**
     * * Category information.
     */
    @org.jetbrains.annotations.NotNull()
    public final com.vimeo.networking2.Category copy(@org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "icon")
    com.vimeo.networking2.PictureCollection icon, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "last_video_featured_time")
    java.util.Date lastVideoFeaturedTime, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "link")
    java.lang.String link, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "metadata")
    com.vimeo.networking2.Metadata<com.vimeo.networking2.CategoryConnections, com.vimeo.networking2.CategoryInteractions> metadata, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "name")
    java.lang.String name, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "parent")
    com.vimeo.networking2.Category parent, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "pictures")
    com.vimeo.networking2.PictureCollection pictures, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "resource_key")
    java.lang.String resourceKey, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "subcategories")
    java.util.List<com.vimeo.networking2.Category> subcategories, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "top_level")
    java.lang.Boolean topLevel, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "uri")
    java.lang.String uri) {
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