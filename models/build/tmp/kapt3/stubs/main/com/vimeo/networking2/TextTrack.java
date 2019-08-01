package com.vimeo.networking2;

import java.lang.System;

/**
 * * Information on a text text.
 */
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001f\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Be\u0012\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\rJ\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u000fJ\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003Jn\u0010\"\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\u0005H\u00c6\u0001\u00a2\u0006\u0002\u0010#J\u0013\u0010$\u001a\u00020\u00032\b\u0010%\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010&\u001a\u00020\'H\u00d6\u0001J\t\u0010(\u001a\u00020\u0005H\u00d6\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0012R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0012R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0012R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0012R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0012\u00a8\u0006)"}, d2 = {"Lcom/vimeo/networking2/TextTrack;", "", "active", "", "hlsLink", "", "hlsLinkExpiresTime", "Ljava/util/Date;", "language", "link", "uri", "name", "rawType", "(Ljava/lang/Boolean;Ljava/lang/String;Ljava/util/Date;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getActive", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getHlsLink", "()Ljava/lang/String;", "getHlsLinkExpiresTime", "()Ljava/util/Date;", "getLanguage", "getLink", "getName", "getRawType", "getUri", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "(Ljava/lang/Boolean;Ljava/lang/String;Ljava/util/Date;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/vimeo/networking2/TextTrack;", "equals", "other", "hashCode", "", "toString", "models"})
@com.squareup.moshi.JsonClass(generateAdapter = true)
public final class TextTrack {
    
    /**
     * * Whether this text track is active.
     */
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Boolean active = null;
    
    /**
     * * The read-only URL of the text track file, intended for use with HLS playback.
     */
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String hlsLink = null;
    
    /**
     * * The time in ISO 8601 format when the read-only HLS playback text track file expires.
     */
    @org.jetbrains.annotations.Nullable()
    private final java.util.Date hlsLinkExpiresTime = null;
    
    /**
     * * The language code for this text track. To see a full list, request
     *     * `/languages?filter=texttrack`.
     */
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String language = null;
    
    /**
     * * The read-only URL of the text track file. You can upload to this link when you
     *     * create it for the first time.
     */
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String link = null;
    
    /**
     * * The relative URI of the text track.
     */
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String uri = null;
    
    /**
     * * The descriptive name of this text track.
     */
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String name = null;
    
    /**
     * *The type of the text track.
     *     * @see TextTrack.type
     */
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String rawType = null;
    
    /**
     * * Whether this text track is active.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean getActive() {
        return null;
    }
    
    /**
     * * The read-only URL of the text track file, intended for use with HLS playback.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getHlsLink() {
        return null;
    }
    
    /**
     * * The time in ISO 8601 format when the read-only HLS playback text track file expires.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.util.Date getHlsLinkExpiresTime() {
        return null;
    }
    
    /**
     * * The language code for this text track. To see a full list, request
     *     * `/languages?filter=texttrack`.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getLanguage() {
        return null;
    }
    
    /**
     * * The read-only URL of the text track file. You can upload to this link when you
     *     * create it for the first time.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getLink() {
        return null;
    }
    
    /**
     * * The relative URI of the text track.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getUri() {
        return null;
    }
    
    /**
     * * The descriptive name of this text track.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getName() {
        return null;
    }
    
    /**
     * *The type of the text track.
     *     * @see TextTrack.type
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getRawType() {
        return null;
    }
    
    public TextTrack(@org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "active")
    java.lang.Boolean active, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "hsl_link")
    java.lang.String hlsLink, @org.jetbrains.annotations.Nullable()
    java.util.Date hlsLinkExpiresTime, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "language")
    java.lang.String language, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "link")
    java.lang.String link, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "uri")
    java.lang.String uri, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "name")
    java.lang.String name, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "type")
    java.lang.String rawType) {
        super();
    }
    
    public TextTrack() {
        super();
    }
    
    /**
     * * Whether this text track is active.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean component1() {
        return null;
    }
    
    /**
     * * The read-only URL of the text track file, intended for use with HLS playback.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component2() {
        return null;
    }
    
    /**
     * * The time in ISO 8601 format when the read-only HLS playback text track file expires.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.util.Date component3() {
        return null;
    }
    
    /**
     * * The language code for this text track. To see a full list, request
     *     * `/languages?filter=texttrack`.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component4() {
        return null;
    }
    
    /**
     * * The read-only URL of the text track file. You can upload to this link when you
     *     * create it for the first time.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component5() {
        return null;
    }
    
    /**
     * * The relative URI of the text track.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component6() {
        return null;
    }
    
    /**
     * * The descriptive name of this text track.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component7() {
        return null;
    }
    
    /**
     * *The type of the text track.
     *     * @see TextTrack.type
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component8() {
        return null;
    }
    
    /**
     * * Information on a text text.
     */
    @org.jetbrains.annotations.NotNull()
    public final com.vimeo.networking2.TextTrack copy(@org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "active")
    java.lang.Boolean active, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "hsl_link")
    java.lang.String hlsLink, @org.jetbrains.annotations.Nullable()
    java.util.Date hlsLinkExpiresTime, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "language")
    java.lang.String language, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "link")
    java.lang.String link, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "uri")
    java.lang.String uri, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "name")
    java.lang.String name, @org.jetbrains.annotations.Nullable()
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