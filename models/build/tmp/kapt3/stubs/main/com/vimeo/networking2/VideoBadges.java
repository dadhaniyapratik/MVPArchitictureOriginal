package com.vimeo.networking2;

import java.lang.System;

/**
 * * Video badges data.
 */
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u0007J\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\tJ\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\tJ2\u0010\u0011\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001\u00a2\u0006\u0002\u0010\u0012J\u0013\u0010\u0013\u001a\u00020\u00032\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0015\u001a\u00020\u0016H\u00d6\u0001J\t\u0010\u0017\u001a\u00020\u0018H\u00d6\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010\n\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010\n\u001a\u0004\b\r\u0010\t\u00a8\u0006\u0019"}, d2 = {"Lcom/vimeo/networking2/VideoBadges;", "", "hdr", "", "live", "Lcom/vimeo/networking2/Live;", "weekendChallenge", "(Ljava/lang/Boolean;Lcom/vimeo/networking2/Live;Ljava/lang/Boolean;)V", "getHdr", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getLive", "()Lcom/vimeo/networking2/Live;", "getWeekendChallenge", "component1", "component2", "component3", "copy", "(Ljava/lang/Boolean;Lcom/vimeo/networking2/Live;Ljava/lang/Boolean;)Lcom/vimeo/networking2/VideoBadges;", "equals", "other", "hashCode", "", "toString", "", "models"})
@com.squareup.moshi.JsonClass(generateAdapter = true)
public final class VideoBadges {
    
    /**
     * * Whether the video has an HDR-compatible transcode.
     */
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Boolean hdr = null;
    
    /**
     * * Live data.
     */
    @org.jetbrains.annotations.Nullable()
    private final com.vimeo.networking2.Live live = null;
    
    /**
     * * Whether the video is a Vimeo Weekend Challenge.
     */
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Boolean weekendChallenge = null;
    
    /**
     * * Whether the video has an HDR-compatible transcode.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean getHdr() {
        return null;
    }
    
    /**
     * * Live data.
     */
    @org.jetbrains.annotations.Nullable()
    public final com.vimeo.networking2.Live getLive() {
        return null;
    }
    
    /**
     * * Whether the video is a Vimeo Weekend Challenge.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean getWeekendChallenge() {
        return null;
    }
    
    public VideoBadges(@org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "hdr")
    java.lang.Boolean hdr, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "live")
    com.vimeo.networking2.Live live, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "weekendChallenge")
    java.lang.Boolean weekendChallenge) {
        super();
    }
    
    public VideoBadges() {
        super();
    }
    
    /**
     * * Whether the video has an HDR-compatible transcode.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean component1() {
        return null;
    }
    
    /**
     * * Live data.
     */
    @org.jetbrains.annotations.Nullable()
    public final com.vimeo.networking2.Live component2() {
        return null;
    }
    
    /**
     * * Whether the video is a Vimeo Weekend Challenge.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean component3() {
        return null;
    }
    
    /**
     * * Video badges data.
     */
    @org.jetbrains.annotations.NotNull()
    public final com.vimeo.networking2.VideoBadges copy(@org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "hdr")
    java.lang.Boolean hdr, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "live")
    com.vimeo.networking2.Live live, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "weekendChallenge")
    java.lang.Boolean weekendChallenge) {
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