package com.vimeo.networking2;

import java.lang.System;

/**
 * * All of [TvodItem]'s connections.
 */
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001BM\u0012\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\t\u00a2\u0006\u0002\u0010\nJ\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\tH\u00c6\u0003JQ\u0010\u0019\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\tH\u00c6\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001d\u001a\u00020\u001eH\u00d6\u0001J\t\u0010\u001f\u001a\u00020 H\u00d6\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fR\u0013\u0010\b\u001a\u0004\u0018\u00010\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012\u00a8\u0006!"}, d2 = {"Lcom/vimeo/networking2/TvodItemConnections;", "", "comments", "Lcom/vimeo/networking2/Connection;", "genres", "likes", "pictures", "seasons", "videos", "Lcom/vimeo/networking2/VideosTvodItemConnection;", "(Lcom/vimeo/networking2/Connection;Lcom/vimeo/networking2/Connection;Lcom/vimeo/networking2/Connection;Lcom/vimeo/networking2/Connection;Lcom/vimeo/networking2/Connection;Lcom/vimeo/networking2/VideosTvodItemConnection;)V", "getComments", "()Lcom/vimeo/networking2/Connection;", "getGenres", "getLikes", "getPictures", "getSeasons", "getVideos", "()Lcom/vimeo/networking2/VideosTvodItemConnection;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "", "models"})
@com.squareup.moshi.JsonClass(generateAdapter = true)
public final class TvodItemConnections {
    
    /**
     * * Information about the comments associated with this page.
     */
    @org.jetbrains.annotations.Nullable()
    private final com.vimeo.networking2.Connection comments = null;
    
    /**
     * * Information about the genres associated with this page.
     */
    @org.jetbrains.annotations.Nullable()
    private final com.vimeo.networking2.Connection genres = null;
    
    /**
     * * Information about the likes associated with this page.
     */
    @org.jetbrains.annotations.Nullable()
    private final com.vimeo.networking2.Connection likes = null;
    
    /**
     * * Information about the pictures associated with this page.
     */
    @org.jetbrains.annotations.Nullable()
    private final com.vimeo.networking2.Connection pictures = null;
    
    /**
     * * Information about the seasons associated with this page.
     */
    @org.jetbrains.annotations.Nullable()
    private final com.vimeo.networking2.Connection seasons = null;
    
    /**
     * * Information about the videos associated with this page.
     */
    @org.jetbrains.annotations.Nullable()
    private final com.vimeo.networking2.VideosTvodItemConnection videos = null;
    
    /**
     * * Information about the comments associated with this page.
     */
    @org.jetbrains.annotations.Nullable()
    public final com.vimeo.networking2.Connection getComments() {
        return null;
    }
    
    /**
     * * Information about the genres associated with this page.
     */
    @org.jetbrains.annotations.Nullable()
    public final com.vimeo.networking2.Connection getGenres() {
        return null;
    }
    
    /**
     * * Information about the likes associated with this page.
     */
    @org.jetbrains.annotations.Nullable()
    public final com.vimeo.networking2.Connection getLikes() {
        return null;
    }
    
    /**
     * * Information about the pictures associated with this page.
     */
    @org.jetbrains.annotations.Nullable()
    public final com.vimeo.networking2.Connection getPictures() {
        return null;
    }
    
    /**
     * * Information about the seasons associated with this page.
     */
    @org.jetbrains.annotations.Nullable()
    public final com.vimeo.networking2.Connection getSeasons() {
        return null;
    }
    
    /**
     * * Information about the videos associated with this page.
     */
    @org.jetbrains.annotations.Nullable()
    public final com.vimeo.networking2.VideosTvodItemConnection getVideos() {
        return null;
    }
    
    public TvodItemConnections(@org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "comment")
    com.vimeo.networking2.Connection comments, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "genres")
    com.vimeo.networking2.Connection genres, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "likes")
    com.vimeo.networking2.Connection likes, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "pictures")
    com.vimeo.networking2.Connection pictures, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "seasons")
    com.vimeo.networking2.Connection seasons, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "videos")
    com.vimeo.networking2.VideosTvodItemConnection videos) {
        super();
    }
    
    public TvodItemConnections() {
        super();
    }
    
    /**
     * * Information about the comments associated with this page.
     */
    @org.jetbrains.annotations.Nullable()
    public final com.vimeo.networking2.Connection component1() {
        return null;
    }
    
    /**
     * * Information about the genres associated with this page.
     */
    @org.jetbrains.annotations.Nullable()
    public final com.vimeo.networking2.Connection component2() {
        return null;
    }
    
    /**
     * * Information about the likes associated with this page.
     */
    @org.jetbrains.annotations.Nullable()
    public final com.vimeo.networking2.Connection component3() {
        return null;
    }
    
    /**
     * * Information about the pictures associated with this page.
     */
    @org.jetbrains.annotations.Nullable()
    public final com.vimeo.networking2.Connection component4() {
        return null;
    }
    
    /**
     * * Information about the seasons associated with this page.
     */
    @org.jetbrains.annotations.Nullable()
    public final com.vimeo.networking2.Connection component5() {
        return null;
    }
    
    /**
     * * Information about the videos associated with this page.
     */
    @org.jetbrains.annotations.Nullable()
    public final com.vimeo.networking2.VideosTvodItemConnection component6() {
        return null;
    }
    
    /**
     * * All of [TvodItem]'s connections.
     */
    @org.jetbrains.annotations.NotNull()
    public final com.vimeo.networking2.TvodItemConnections copy(@org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "comment")
    com.vimeo.networking2.Connection comments, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "genres")
    com.vimeo.networking2.Connection genres, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "likes")
    com.vimeo.networking2.Connection likes, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "pictures")
    com.vimeo.networking2.Connection pictures, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "seasons")
    com.vimeo.networking2.Connection seasons, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "videos")
    com.vimeo.networking2.VideosTvodItemConnection videos) {
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