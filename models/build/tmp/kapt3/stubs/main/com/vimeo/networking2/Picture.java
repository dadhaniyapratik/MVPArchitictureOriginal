package com.vimeo.networking2;

import java.lang.System;

/**
 * * Pictures information such as dimensions, link to image, etc...
 */
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001BA\u0012\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\tJ\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u000bJ\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u000bJJ\u0010\u0019\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001\u00a2\u0006\u0002\u0010\u001aJ\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u00d6\u0003J\t\u0010\u001f\u001a\u00020\u0003H\u00d6\u0001J\t\u0010 \u001a\u00020\u0005H\u00d6\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\r\u001a\u0004\u0018\u00010\u0005X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000fR\u0015\u0010\b\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010\f\u001a\u0004\b\u0013\u0010\u000b\u00a8\u0006!"}, d2 = {"Lcom/vimeo/networking2/Picture;", "Lcom/vimeo/networking2/common/Entity;", "height", "", "link", "", "linkWithPlayButton", "resourceKey", "width", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V", "getHeight", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "identifier", "getIdentifier", "()Ljava/lang/String;", "getLink", "getLinkWithPlayButton", "getResourceKey", "getWidth", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)Lcom/vimeo/networking2/Picture;", "equals", "", "other", "", "hashCode", "toString", "models"})
@com.squareup.moshi.JsonClass(generateAdapter = true)
public final class Picture implements com.vimeo.networking2.common.Entity {
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String identifier = null;
    
    /**
     * * The height of the image.
     */
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Integer height = null;
    
    /**
     * * The direct link to the image.
     */
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String link = null;
    
    /**
     * * The direct link to the image with a play button overlay.
     */
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String linkWithPlayButton = null;
    
    /**
     * * The picture resource key.
     */
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String resourceKey = null;
    
    /**
     * * The width of the image.
     */
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Integer width = null;
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.String getIdentifier() {
        return null;
    }
    
    /**
     * * The height of the image.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getHeight() {
        return null;
    }
    
    /**
     * * The direct link to the image.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getLink() {
        return null;
    }
    
    /**
     * * The direct link to the image with a play button overlay.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getLinkWithPlayButton() {
        return null;
    }
    
    /**
     * * The picture resource key.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getResourceKey() {
        return null;
    }
    
    /**
     * * The width of the image.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getWidth() {
        return null;
    }
    
    public Picture(@org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "height")
    java.lang.Integer height, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "link")
    java.lang.String link, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "link_with_play_button")
    java.lang.String linkWithPlayButton, @org.jetbrains.annotations.Nullable()
    java.lang.String resourceKey, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "width")
    java.lang.Integer width) {
        super();
    }
    
    public Picture() {
        super();
    }
    
    /**
     * * The height of the image.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component1() {
        return null;
    }
    
    /**
     * * The direct link to the image.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component2() {
        return null;
    }
    
    /**
     * * The direct link to the image with a play button overlay.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component3() {
        return null;
    }
    
    /**
     * * The picture resource key.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component4() {
        return null;
    }
    
    /**
     * * The width of the image.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component5() {
        return null;
    }
    
    /**
     * * Pictures information such as dimensions, link to image, etc...
     */
    @org.jetbrains.annotations.NotNull()
    public final com.vimeo.networking2.Picture copy(@org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "height")
    java.lang.Integer height, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "link")
    java.lang.String link, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "link_with_play_button")
    java.lang.String linkWithPlayButton, @org.jetbrains.annotations.Nullable()
    java.lang.String resourceKey, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "width")
    java.lang.Integer width) {
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