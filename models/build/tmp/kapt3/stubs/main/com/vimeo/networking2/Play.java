package com.vimeo.networking2;

import java.lang.System;

/**
 * * Play information.
 */
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u001a\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BY\u0012\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0010\b\u0003\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\u0010\b\u0003\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\b\u0012\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\r\u00a2\u0006\u0002\u0010\u000eJ\u000b\u0010 \u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003J\u0011\u0010#\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bH\u00c6\u0003J\u0011\u0010$\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\bH\u00c6\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\rH\u00c6\u0003J]\u0010&\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0010\b\u0003\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b2\u0010\b\u0003\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\b2\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\rH\u00c6\u0001J\u0013\u0010\'\u001a\u00020(2\b\u0010)\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010*\u001a\u00020+H\u00d6\u0001J\t\u0010,\u001a\u00020\rH\u00d6\u0001R\u001e\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\b\u0013\u0010\u0010\u001a\u0004\b\u0014\u0010\u0012R\u001e\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\b\u0015\u0010\u0010\u001a\u0004\b\u0016\u0010\u0017R$\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b8\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\b\u0018\u0010\u0010\u001a\u0004\b\u0019\u0010\u001aR$\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\b8\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\b\u001b\u0010\u0010\u001a\u0004\b\u001c\u0010\u001aR\u001e\u0010\f\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\b\u001d\u0010\u0010\u001a\u0004\b\u001e\u0010\u001f\u00a8\u0006-"}, d2 = {"Lcom/vimeo/networking2/Play;", "", "dash", "Lcom/vimeo/networking2/VideoFile;", "hls", "progress", "Lcom/vimeo/networking2/PlayProgress;", "progressive", "", "Lcom/vimeo/networking2/ProgressiveVideoFile;", "source", "Lcom/vimeo/networking2/VideoSourceFile;", "videoPlayStatus", "", "(Lcom/vimeo/networking2/VideoFile;Lcom/vimeo/networking2/VideoFile;Lcom/vimeo/networking2/PlayProgress;Ljava/util/List;Ljava/util/List;Ljava/lang/String;)V", "dash$annotations", "()V", "getDash", "()Lcom/vimeo/networking2/VideoFile;", "hls$annotations", "getHls", "progress$annotations", "getProgress", "()Lcom/vimeo/networking2/PlayProgress;", "progressive$annotations", "getProgressive", "()Ljava/util/List;", "source$annotations", "getSource", "videoPlayStatus$annotations", "getVideoPlayStatus", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "models"})
@com.squareup.moshi.JsonClass(generateAdapter = true)
@com.vimeo.networking2.annotations.Internal()
public final class Play {
    
    /**
     * * The DASH video file.
     */
    @org.jetbrains.annotations.Nullable()
    private final com.vimeo.networking2.VideoFile dash = null;
    
    /**
     * * HLS video files.
     */
    @org.jetbrains.annotations.Nullable()
    private final com.vimeo.networking2.VideoFile hls = null;
    
    /**
     * * The play progress in seconds.
     */
    @org.jetbrains.annotations.Nullable()
    private final com.vimeo.networking2.PlayProgress progress = null;
    
    /**
     * * Progressive files.
     */
    @org.jetbrains.annotations.Nullable()
    private final java.util.List<com.vimeo.networking2.ProgressiveVideoFile> progressive = null;
    
    /**
     * * The source file of the video.
     */
    @org.jetbrains.annotations.Nullable()
    private final java.util.List<com.vimeo.networking2.VideoSourceFile> source = null;
    
    /**
     * * The play status of the video.
     *     * @see Play.videoPlayStatusType
     */
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String videoPlayStatus = null;
    
    @com.vimeo.networking2.annotations.Internal()
    public static void dash$annotations() {
    }
    
    /**
     * * The DASH video file.
     */
    @org.jetbrains.annotations.Nullable()
    public final com.vimeo.networking2.VideoFile getDash() {
        return null;
    }
    
    @com.vimeo.networking2.annotations.Internal()
    public static void hls$annotations() {
    }
    
    /**
     * * HLS video files.
     */
    @org.jetbrains.annotations.Nullable()
    public final com.vimeo.networking2.VideoFile getHls() {
        return null;
    }
    
    @com.vimeo.networking2.annotations.Internal()
    public static void progress$annotations() {
    }
    
    /**
     * * The play progress in seconds.
     */
    @org.jetbrains.annotations.Nullable()
    public final com.vimeo.networking2.PlayProgress getProgress() {
        return null;
    }
    
    @com.vimeo.networking2.annotations.Internal()
    public static void progressive$annotations() {
    }
    
    /**
     * * Progressive files.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.vimeo.networking2.ProgressiveVideoFile> getProgressive() {
        return null;
    }
    
    @com.vimeo.networking2.annotations.Internal()
    public static void source$annotations() {
    }
    
    /**
     * * The source file of the video.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.vimeo.networking2.VideoSourceFile> getSource() {
        return null;
    }
    
    @com.vimeo.networking2.annotations.Internal()
    public static void videoPlayStatus$annotations() {
    }
    
    /**
     * * The play status of the video.
     *     * @see Play.videoPlayStatusType
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getVideoPlayStatus() {
        return null;
    }
    
    public Play(@org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "dash")
    com.vimeo.networking2.VideoFile dash, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "hls")
    com.vimeo.networking2.VideoFile hls, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "progress")
    com.vimeo.networking2.PlayProgress progress, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "progressive")
    java.util.List<com.vimeo.networking2.ProgressiveVideoFile> progressive, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "source")
    java.util.List<com.vimeo.networking2.VideoSourceFile> source, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "status")
    java.lang.String videoPlayStatus) {
        super();
    }
    
    public Play() {
        super();
    }
    
    /**
     * * The DASH video file.
     */
    @org.jetbrains.annotations.Nullable()
    public final com.vimeo.networking2.VideoFile component1() {
        return null;
    }
    
    /**
     * * HLS video files.
     */
    @org.jetbrains.annotations.Nullable()
    public final com.vimeo.networking2.VideoFile component2() {
        return null;
    }
    
    /**
     * * The play progress in seconds.
     */
    @org.jetbrains.annotations.Nullable()
    public final com.vimeo.networking2.PlayProgress component3() {
        return null;
    }
    
    /**
     * * Progressive files.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.vimeo.networking2.ProgressiveVideoFile> component4() {
        return null;
    }
    
    /**
     * * The source file of the video.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.vimeo.networking2.VideoSourceFile> component5() {
        return null;
    }
    
    /**
     * * The play status of the video.
     *     * @see Play.videoPlayStatusType
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component6() {
        return null;
    }
    
    /**
     * * Play information.
     */
    @org.jetbrains.annotations.NotNull()
    public final com.vimeo.networking2.Play copy(@org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "dash")
    com.vimeo.networking2.VideoFile dash, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "hls")
    com.vimeo.networking2.VideoFile hls, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "progress")
    com.vimeo.networking2.PlayProgress progress, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "progressive")
    java.util.List<com.vimeo.networking2.ProgressiveVideoFile> progressive, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "source")
    java.util.List<com.vimeo.networking2.VideoSourceFile> source, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "status")
    java.lang.String videoPlayStatus) {
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