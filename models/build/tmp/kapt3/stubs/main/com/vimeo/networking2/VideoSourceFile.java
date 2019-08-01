package com.vimeo.networking2;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\'\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0095\u0001\u0012\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\t\u0012\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\t\u0012\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0003\u0010\u000f\u001a\u0004\u0018\u00010\t\u0012\n\b\u0003\u0010\u0010\u001a\u0004\u0018\u00010\t\u0012\n\b\u0003\u0010\u0011\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0002\u0010\u0012J\u000b\u0010$\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\tH\u00c6\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\tH\u00c6\u0003J\u0010\u0010\'\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0017J\u000b\u0010(\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0010\u0010)\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0017J\u0010\u0010*\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0017J\u000b\u0010+\u001a\u0004\u0018\u00010\tH\u00c6\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\u000bH\u00c6\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\tH\u00c6\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\tH\u00c6\u0003J\u0010\u0010/\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0017J\u009e\u0001\u00100\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\t2\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\t2\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\u00062\n\b\u0003\u0010\u000f\u001a\u0004\u0018\u00010\t2\n\b\u0003\u0010\u0010\u001a\u0004\u0018\u00010\t2\n\b\u0003\u0010\u0011\u001a\u0004\u0018\u00010\u0006H\u00c6\u0001\u00a2\u0006\u0002\u00101J\u0013\u00102\u001a\u0002032\b\u00104\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u00105\u001a\u00020\u0006H\u00d6\u0001J\t\u00106\u001a\u00020\tH\u00d6\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\n\n\u0002\u0010\u0018\u001a\u0004\b\u0016\u0010\u0017R\u0015\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\n\n\u0002\u0010\u0018\u001a\u0004\b\u0019\u0010\u0017R\u0013\u0010\b\u001a\u0004\u0018\u00010\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0013\u0010\f\u001a\u0004\u0018\u00010\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001bR\u0013\u0010\u0010\u001a\u0004\u0018\u00010\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001bR\u0015\u0010\u000e\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\n\n\u0002\u0010\u0018\u001a\u0004\b \u0010\u0017R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\t\u00a2\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001bR\u0013\u0010\r\u001a\u0004\u0018\u00010\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001bR\u0015\u0010\u0011\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\n\n\u0002\u0010\u0018\u001a\u0004\b#\u0010\u0017\u00a8\u00067"}, d2 = {"Lcom/vimeo/networking2/VideoSourceFile;", "", "createdTime", "Ljava/util/Date;", "expires", "fps", "", "height", "link", "", "log", "Lcom/vimeo/networking2/VideoLog;", "md5", "videoQuality", "size", "sourceLink", "rawType", "width", "(Ljava/util/Date;Ljava/util/Date;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Lcom/vimeo/networking2/VideoLog;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V", "getCreatedTime", "()Ljava/util/Date;", "getExpires", "getFps", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getHeight", "getLink", "()Ljava/lang/String;", "getLog", "()Lcom/vimeo/networking2/VideoLog;", "getMd5", "getRawType", "getSize", "getSourceLink", "getVideoQuality", "getWidth", "component1", "component10", "component11", "component12", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/util/Date;Ljava/util/Date;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Lcom/vimeo/networking2/VideoLog;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)Lcom/vimeo/networking2/VideoSourceFile;", "equals", "", "other", "hashCode", "toString", "models"})
@com.squareup.moshi.JsonClass(generateAdapter = true)
public final class VideoSourceFile {
    
    /**
     * * The time in ISO 8601 format when the video file was created.
     */
    @org.jetbrains.annotations.Nullable()
    private final java.util.Date createdTime = null;
    
    /**
     * * The time in ISO 8601 format when the video file expires.
     */
    @org.jetbrains.annotations.Nullable()
    private final java.util.Date expires = null;
    
    /**
     * * The FPS of the video.
     */
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Integer fps = null;
    
    /**
     * * The height of the video in pixels.
     */
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Integer height = null;
    
    /**
     * * The direct link to this video file.
     */
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String link = null;
    
    /**
     * * Video logging information.
     */
    @org.jetbrains.annotations.Nullable()
    private final com.vimeo.networking2.VideoLog log = null;
    
    /**
     * * The MD5 hash of the video file.
     */
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String md5 = null;
    
    /**
     * * The video quality (as determined by height and width).
     *     * @see VideoSourceFile.videoQualityType
     */
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String videoQuality = null;
    
    /**
     * * The file size of the video.
     */
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Integer size = null;
    
    /**
     * * The source link for the video file.
     */
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String sourceLink = null;
    
    /**
     * * The type of the video file.
     *     * @see VideoSourceFile.type
     */
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String rawType = null;
    
    /**
     * * The width of the video in pixels.
     */
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Integer width = null;
    
    /**
     * * The time in ISO 8601 format when the video file was created.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.util.Date getCreatedTime() {
        return null;
    }
    
    /**
     * * The time in ISO 8601 format when the video file expires.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.util.Date getExpires() {
        return null;
    }
    
    /**
     * * The FPS of the video.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getFps() {
        return null;
    }
    
    /**
     * * The height of the video in pixels.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getHeight() {
        return null;
    }
    
    /**
     * * The direct link to this video file.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getLink() {
        return null;
    }
    
    /**
     * * Video logging information.
     */
    @org.jetbrains.annotations.Nullable()
    public final com.vimeo.networking2.VideoLog getLog() {
        return null;
    }
    
    /**
     * * The MD5 hash of the video file.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getMd5() {
        return null;
    }
    
    /**
     * * The video quality (as determined by height and width).
     *     * @see VideoSourceFile.videoQualityType
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getVideoQuality() {
        return null;
    }
    
    /**
     * * The file size of the video.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getSize() {
        return null;
    }
    
    /**
     * * The source link for the video file.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getSourceLink() {
        return null;
    }
    
    /**
     * * The type of the video file.
     *     * @see VideoSourceFile.type
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getRawType() {
        return null;
    }
    
    /**
     * * The width of the video in pixels.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getWidth() {
        return null;
    }
    
    public VideoSourceFile(@org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "created_time")
    java.util.Date createdTime, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "expires")
    java.util.Date expires, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "fps")
    java.lang.Integer fps, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "height")
    java.lang.Integer height, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "link")
    java.lang.String link, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "log")
    com.vimeo.networking2.VideoLog log, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "md5")
    java.lang.String md5, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "quality")
    java.lang.String videoQuality, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "size")
    java.lang.Integer size, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "source_link")
    java.lang.String sourceLink, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "type")
    java.lang.String rawType, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "width")
    java.lang.Integer width) {
        super();
    }
    
    public VideoSourceFile() {
        super();
    }
    
    /**
     * * The time in ISO 8601 format when the video file was created.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.util.Date component1() {
        return null;
    }
    
    /**
     * * The time in ISO 8601 format when the video file expires.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.util.Date component2() {
        return null;
    }
    
    /**
     * * The FPS of the video.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component3() {
        return null;
    }
    
    /**
     * * The height of the video in pixels.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component4() {
        return null;
    }
    
    /**
     * * The direct link to this video file.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component5() {
        return null;
    }
    
    /**
     * * Video logging information.
     */
    @org.jetbrains.annotations.Nullable()
    public final com.vimeo.networking2.VideoLog component6() {
        return null;
    }
    
    /**
     * * The MD5 hash of the video file.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component7() {
        return null;
    }
    
    /**
     * * The video quality (as determined by height and width).
     *     * @see VideoSourceFile.videoQualityType
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component8() {
        return null;
    }
    
    /**
     * * The file size of the video.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component9() {
        return null;
    }
    
    /**
     * * The source link for the video file.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component10() {
        return null;
    }
    
    /**
     * * The type of the video file.
     *     * @see VideoSourceFile.type
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component11() {
        return null;
    }
    
    /**
     * * The width of the video in pixels.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component12() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.vimeo.networking2.VideoSourceFile copy(@org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "created_time")
    java.util.Date createdTime, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "expires")
    java.util.Date expires, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "fps")
    java.lang.Integer fps, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "height")
    java.lang.Integer height, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "link")
    java.lang.String link, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "log")
    com.vimeo.networking2.VideoLog log, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "md5")
    java.lang.String md5, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "quality")
    java.lang.String videoQuality, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "size")
    java.lang.Integer size, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "source_link")
    java.lang.String sourceLink, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "type")
    java.lang.String rawType, @org.jetbrains.annotations.Nullable()
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