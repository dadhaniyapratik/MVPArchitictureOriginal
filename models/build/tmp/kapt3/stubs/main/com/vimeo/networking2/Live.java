package com.vimeo.networking2;

import java.lang.System;

/**
 * * Live video information.
 */
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b&\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B}\u0012\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\t\u0012\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u00a2\u0006\u0002\u0010\u0010J\u000b\u0010*\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\u000fH\u00c6\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\tH\u00c6\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\tH\u00c6\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\tH\u00c6\u0003J\u0081\u0001\u00104\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\t2\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u00c6\u0001J\u0013\u00105\u001a\u0002062\b\u00107\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u00108\u001a\u000209H\u00d6\u0001J\t\u0010:\u001a\u00020\tH\u00d6\u0001R\u001e\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\b\u0015\u0010\u0012\u001a\u0004\b\u0016\u0010\u0014R\u001e\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\b\u0017\u0010\u0012\u001a\u0004\b\u0018\u0010\u0019R\u001e\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\b\u001a\u0010\u0012\u001a\u0004\b\u001b\u0010\u0014R\u001e\u0010\b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\b\u001c\u0010\u0012\u001a\u0004\b\u001d\u0010\u001eR\u001e\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\b\u001f\u0010\u0012\u001a\u0004\b \u0010\u001eR\u001e\u0010\r\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\b!\u0010\u0012\u001a\u0004\b\"\u0010\u001eR\u001e\u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\b#\u0010\u0012\u001a\u0004\b$\u0010\u0014R\u001e\u0010\f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\b%\u0010\u0012\u001a\u0004\b&\u0010\u0014R\u001e\u0010\u000e\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\b\'\u0010\u0012\u001a\u0004\b(\u0010)\u00a8\u0006;"}, d2 = {"Lcom/vimeo/networking2/Live;", "", "activeTime", "Ljava/util/Date;", "archivedTime", "chat", "Lcom/vimeo/networking2/LiveChat;", "endedTime", "key", "", "link", "scheduledStartTime", "secondsRemaining", "liveStatus", "streamingError", "Lcom/vimeo/networking2/ApiError;", "(Ljava/util/Date;Ljava/util/Date;Lcom/vimeo/networking2/LiveChat;Ljava/util/Date;Ljava/lang/String;Ljava/lang/String;Ljava/util/Date;Ljava/util/Date;Ljava/lang/String;Lcom/vimeo/networking2/ApiError;)V", "activeTime$annotations", "()V", "getActiveTime", "()Ljava/util/Date;", "archivedTime$annotations", "getArchivedTime", "chat$annotations", "getChat", "()Lcom/vimeo/networking2/LiveChat;", "endedTime$annotations", "getEndedTime", "key$annotations", "getKey", "()Ljava/lang/String;", "link$annotations", "getLink", "liveStatus$annotations", "getLiveStatus", "scheduledStartTime$annotations", "getScheduledStartTime", "secondsRemaining$annotations", "getSecondsRemaining", "streamingError$annotations", "getStreamingError", "()Lcom/vimeo/networking2/ApiError;", "component1", "component10", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "", "toString", "models"})
@com.squareup.moshi.JsonClass(generateAdapter = true)
@com.vimeo.networking2.annotations.Internal()
public final class Live {
    
    /**
     * * The time in ISO 8601 format when the live stream began.
     */
    @org.jetbrains.annotations.Nullable()
    private final java.util.Date activeTime = null;
    
    /**
     * * The time in ISO 8601 format when the live stream was archived.
     */
    @org.jetbrains.annotations.Nullable()
    private final java.util.Date archivedTime = null;
    
    /**
     * * Information about the live clip's chat.
     */
    @org.jetbrains.annotations.Nullable()
    private final com.vimeo.networking2.LiveChat chat = null;
    
    /**
     * * The time in ISO 8601 format when the live stream ended.
     */
    @org.jetbrains.annotations.Nullable()
    private final java.util.Date endedTime = null;
    
    /**
     * * The streaming key string, which is used in conjunction with the RTMP [link].
     */
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String key = null;
    
    /**
     * * The upstream RTMP link. Send your live content to this link.
     */
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String link = null;
    
    /**
     * * The time in ISO 8601 format when the live stream was scheduled to start.
     */
    @org.jetbrains.annotations.Nullable()
    private final java.util.Date scheduledStartTime = null;
    
    /**
     * * The number of seconds before the termination of the live stream.
     */
    @org.jetbrains.annotations.Nullable()
    private final java.util.Date secondsRemaining = null;
    
    /**
     * * The status of the RTMP [link].
     *     * @see Live.liveStatusType
     */
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String liveStatus = null;
    
    /**
     * * If [liveStatusType] is [LiveStatusType.STREAMING_ERROR], this is the reason for that error.
     */
    @org.jetbrains.annotations.Nullable()
    private final com.vimeo.networking2.ApiError streamingError = null;
    
    @com.vimeo.networking2.annotations.Internal()
    public static void activeTime$annotations() {
    }
    
    /**
     * * The time in ISO 8601 format when the live stream began.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.util.Date getActiveTime() {
        return null;
    }
    
    @com.vimeo.networking2.annotations.Internal()
    public static void archivedTime$annotations() {
    }
    
    /**
     * * The time in ISO 8601 format when the live stream was archived.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.util.Date getArchivedTime() {
        return null;
    }
    
    @com.vimeo.networking2.annotations.Internal()
    public static void chat$annotations() {
    }
    
    /**
     * * Information about the live clip's chat.
     */
    @org.jetbrains.annotations.Nullable()
    public final com.vimeo.networking2.LiveChat getChat() {
        return null;
    }
    
    @com.vimeo.networking2.annotations.Internal()
    public static void endedTime$annotations() {
    }
    
    /**
     * * The time in ISO 8601 format when the live stream ended.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.util.Date getEndedTime() {
        return null;
    }
    
    @com.vimeo.networking2.annotations.Internal()
    public static void key$annotations() {
    }
    
    /**
     * * The streaming key string, which is used in conjunction with the RTMP [link].
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getKey() {
        return null;
    }
    
    @com.vimeo.networking2.annotations.Internal()
    public static void link$annotations() {
    }
    
    /**
     * * The upstream RTMP link. Send your live content to this link.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getLink() {
        return null;
    }
    
    @com.vimeo.networking2.annotations.Internal()
    public static void scheduledStartTime$annotations() {
    }
    
    /**
     * * The time in ISO 8601 format when the live stream was scheduled to start.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.util.Date getScheduledStartTime() {
        return null;
    }
    
    @com.vimeo.networking2.annotations.Internal()
    public static void secondsRemaining$annotations() {
    }
    
    /**
     * * The number of seconds before the termination of the live stream.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.util.Date getSecondsRemaining() {
        return null;
    }
    
    @com.vimeo.networking2.annotations.Internal()
    public static void liveStatus$annotations() {
    }
    
    /**
     * * The status of the RTMP [link].
     *     * @see Live.liveStatusType
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getLiveStatus() {
        return null;
    }
    
    @com.vimeo.networking2.annotations.Internal()
    public static void streamingError$annotations() {
    }
    
    /**
     * * If [liveStatusType] is [LiveStatusType.STREAMING_ERROR], this is the reason for that error.
     */
    @org.jetbrains.annotations.Nullable()
    public final com.vimeo.networking2.ApiError getStreamingError() {
        return null;
    }
    
    public Live(@org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "active_time")
    java.util.Date activeTime, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "archived_time")
    java.util.Date archivedTime, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "chat")
    com.vimeo.networking2.LiveChat chat, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "ended_time")
    java.util.Date endedTime, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "key")
    java.lang.String key, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "link")
    java.lang.String link, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "scheduled_start_time")
    java.util.Date scheduledStartTime, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "seconds_remaining")
    java.util.Date secondsRemaining, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "status")
    java.lang.String liveStatus, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "streaming_error")
    com.vimeo.networking2.ApiError streamingError) {
        super();
    }
    
    public Live() {
        super();
    }
    
    /**
     * * The time in ISO 8601 format when the live stream began.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.util.Date component1() {
        return null;
    }
    
    /**
     * * The time in ISO 8601 format when the live stream was archived.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.util.Date component2() {
        return null;
    }
    
    /**
     * * Information about the live clip's chat.
     */
    @org.jetbrains.annotations.Nullable()
    public final com.vimeo.networking2.LiveChat component3() {
        return null;
    }
    
    /**
     * * The time in ISO 8601 format when the live stream ended.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.util.Date component4() {
        return null;
    }
    
    /**
     * * The streaming key string, which is used in conjunction with the RTMP [link].
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component5() {
        return null;
    }
    
    /**
     * * The upstream RTMP link. Send your live content to this link.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component6() {
        return null;
    }
    
    /**
     * * The time in ISO 8601 format when the live stream was scheduled to start.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.util.Date component7() {
        return null;
    }
    
    /**
     * * The number of seconds before the termination of the live stream.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.util.Date component8() {
        return null;
    }
    
    /**
     * * The status of the RTMP [link].
     *     * @see Live.liveStatusType
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component9() {
        return null;
    }
    
    /**
     * * If [liveStatusType] is [LiveStatusType.STREAMING_ERROR], this is the reason for that error.
     */
    @org.jetbrains.annotations.Nullable()
    public final com.vimeo.networking2.ApiError component10() {
        return null;
    }
    
    /**
     * * Live video information.
     */
    @org.jetbrains.annotations.NotNull()
    public final com.vimeo.networking2.Live copy(@org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "active_time")
    java.util.Date activeTime, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "archived_time")
    java.util.Date archivedTime, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "chat")
    com.vimeo.networking2.LiveChat chat, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "ended_time")
    java.util.Date endedTime, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "key")
    java.lang.String key, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "link")
    java.lang.String link, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "scheduled_start_time")
    java.util.Date scheduledStartTime, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "seconds_remaining")
    java.util.Date secondsRemaining, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "status")
    java.lang.String liveStatus, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "streaming_error")
    com.vimeo.networking2.ApiError streamingError) {
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