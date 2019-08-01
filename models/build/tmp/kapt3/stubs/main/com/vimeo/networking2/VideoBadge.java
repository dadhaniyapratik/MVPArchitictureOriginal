package com.vimeo.networking2;

import java.lang.System;

/**
 * * Video badge data.
 */
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BA\u0012\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\tJ\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003JE\u0010\u0018\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001c\u001a\u00020\u001dH\u00d6\u0001J\t\u0010\u001e\u001a\u00020\u0003H\u00d6\u0001R\u001e\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\rR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\r\u00a8\u0006\u001f"}, d2 = {"Lcom/vimeo/networking2/VideoBadge;", "", "festival", "", "link", "pictures", "Lcom/vimeo/networking2/PictureCollection;", "text", "rawType", "(Ljava/lang/String;Ljava/lang/String;Lcom/vimeo/networking2/PictureCollection;Ljava/lang/String;Ljava/lang/String;)V", "festival$annotations", "()V", "getFestival", "()Ljava/lang/String;", "getLink", "getPictures", "()Lcom/vimeo/networking2/PictureCollection;", "getRawType", "getText", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "models"})
@com.squareup.moshi.JsonClass(generateAdapter = true)
public final class VideoBadge {
    
    /**
     * * The festival that this badge represents.
     */
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String festival = null;
    
    /**
     * * The link for the badge
     */
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String link = null;
    
    /**
     * * The badge image.
     */
    @org.jetbrains.annotations.Nullable()
    private final com.vimeo.networking2.PictureCollection pictures = null;
    
    /**
     * * The name of the badge.
     */
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String text = null;
    
    /**
     * * The type of the badge.
     *     * @see VideoBadge.type
     */
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String rawType = null;
    
    @com.vimeo.networking2.annotations.Internal()
    public static void festival$annotations() {
    }
    
    /**
     * * The festival that this badge represents.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getFestival() {
        return null;
    }
    
    /**
     * * The link for the badge
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getLink() {
        return null;
    }
    
    /**
     * * The badge image.
     */
    @org.jetbrains.annotations.Nullable()
    public final com.vimeo.networking2.PictureCollection getPictures() {
        return null;
    }
    
    /**
     * * The name of the badge.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getText() {
        return null;
    }
    
    /**
     * * The type of the badge.
     *     * @see VideoBadge.type
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getRawType() {
        return null;
    }
    
    public VideoBadge(@org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "festival")
    java.lang.String festival, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "link")
    java.lang.String link, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "pictures")
    com.vimeo.networking2.PictureCollection pictures, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "text")
    java.lang.String text, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "type")
    java.lang.String rawType) {
        super();
    }
    
    public VideoBadge() {
        super();
    }
    
    /**
     * * The festival that this badge represents.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component1() {
        return null;
    }
    
    /**
     * * The link for the badge
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component2() {
        return null;
    }
    
    /**
     * * The badge image.
     */
    @org.jetbrains.annotations.Nullable()
    public final com.vimeo.networking2.PictureCollection component3() {
        return null;
    }
    
    /**
     * * The name of the badge.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component4() {
        return null;
    }
    
    /**
     * * The type of the badge.
     *     * @see VideoBadge.type
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component5() {
        return null;
    }
    
    /**
     * * Video badge data.
     */
    @org.jetbrains.annotations.NotNull()
    public final com.vimeo.networking2.VideoBadge copy(@org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "festival")
    java.lang.String festival, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "link")
    java.lang.String link, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "pictures")
    com.vimeo.networking2.PictureCollection pictures, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "text")
    java.lang.String text, @org.jetbrains.annotations.Nullable()
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