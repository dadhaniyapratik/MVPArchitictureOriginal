package com.vimeo.networking2;

import java.lang.System;

/**
 * * Video file data.
 */
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u0007J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J-\u0010\u0014\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0018\u001a\u00020\u0019H\u00d6\u0001J\t\u0010\u001a\u001a\u00020\u0003H\u00d6\u0001R\u001e\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\b\f\u0010\t\u001a\u0004\b\r\u0010\u000eR\u001e\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\b\u000f\u0010\t\u001a\u0004\b\u0010\u0010\u000b\u00a8\u0006\u001b"}, d2 = {"Lcom/vimeo/networking2/VideoFile;", "", "link", "", "linkExpirationTime", "Ljava/util/Date;", "log", "(Ljava/lang/String;Ljava/util/Date;Ljava/lang/String;)V", "link$annotations", "()V", "getLink", "()Ljava/lang/String;", "linkExpirationTime$annotations", "getLinkExpirationTime", "()Ljava/util/Date;", "log$annotations", "getLog", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "models"})
@com.squareup.moshi.JsonClass(generateAdapter = true)
@com.vimeo.networking2.annotations.Internal()
public final class VideoFile {
    
    /**
     * * The direct link to the video file.
     */
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String link = null;
    
    /**
     * * The time in ISO 8601 format when the link to the video file expires.
     */
    @org.jetbrains.annotations.Nullable()
    private final java.util.Date linkExpirationTime = null;
    
    /**
     * * The URL for logging events.
     */
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String log = null;
    
    @com.vimeo.networking2.annotations.Internal()
    public static void link$annotations() {
    }
    
    /**
     * * The direct link to the video file.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getLink() {
        return null;
    }
    
    @com.vimeo.networking2.annotations.Internal()
    public static void linkExpirationTime$annotations() {
    }
    
    /**
     * * The time in ISO 8601 format when the link to the video file expires.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.util.Date getLinkExpirationTime() {
        return null;
    }
    
    @com.vimeo.networking2.annotations.Internal()
    public static void log$annotations() {
    }
    
    /**
     * * The URL for logging events.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getLog() {
        return null;
    }
    
    public VideoFile(@org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "link")
    java.lang.String link, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "link_expiration_time")
    java.util.Date linkExpirationTime, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "log")
    java.lang.String log) {
        super();
    }
    
    public VideoFile() {
        super();
    }
    
    /**
     * * The direct link to the video file.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component1() {
        return null;
    }
    
    /**
     * * The time in ISO 8601 format when the link to the video file expires.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.util.Date component2() {
        return null;
    }
    
    /**
     * * The URL for logging events.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component3() {
        return null;
    }
    
    /**
     * * Video file data.
     */
    @org.jetbrains.annotations.NotNull()
    public final com.vimeo.networking2.VideoFile copy(@org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "link")
    java.lang.String link, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "link_expiration_time")
    java.util.Date linkExpirationTime, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "log")
    java.lang.String log) {
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