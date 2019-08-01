package com.vimeo.networking2;

import java.lang.System;

/**
 * * A collection of stats associated with this video.
 */
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\b\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0006J\u001a\u0010\t\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001\u00a2\u0006\u0002\u0010\nJ\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u000e\u001a\u00020\u0003H\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0011"}, d2 = {"Lcom/vimeo/networking2/VideoStats;", "", "plays", "", "(Ljava/lang/Integer;)V", "getPlays", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "copy", "(Ljava/lang/Integer;)Lcom/vimeo/networking2/VideoStats;", "equals", "", "other", "hashCode", "toString", "", "models"})
@com.squareup.moshi.JsonClass(generateAdapter = true)
public final class VideoStats {
    
    /**
     * * The current total number of times that the video has been played.
     */
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Integer plays = null;
    
    /**
     * * The current total number of times that the video has been played.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getPlays() {
        return null;
    }
    
    public VideoStats(@org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "plays")
    java.lang.Integer plays) {
        super();
    }
    
    public VideoStats() {
        super();
    }
    
    /**
     * * The current total number of times that the video has been played.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component1() {
        return null;
    }
    
    /**
     * * A collection of stats associated with this video.
     */
    @org.jetbrains.annotations.NotNull()
    public final com.vimeo.networking2.VideoStats copy(@org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "plays")
    java.lang.Integer plays) {
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