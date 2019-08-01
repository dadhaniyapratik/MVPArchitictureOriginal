package com.vimeo.networking2;

import java.lang.System;

/**
 * * Live Quota information.
 */
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\u0006J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J!\u0010\u0010\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u00c6\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0014\u001a\u00020\u0015H\u00d6\u0001J\t\u0010\u0016\u001a\u00020\u0017H\u00d6\u0001R\u001e\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\b\u000b\u0010\b\u001a\u0004\b\f\u0010\r\u00a8\u0006\u0018"}, d2 = {"Lcom/vimeo/networking2/LiveQuota;", "", "streams", "Lcom/vimeo/networking2/LiveStreamsQuota;", "time", "Lcom/vimeo/networking2/LiveTime;", "(Lcom/vimeo/networking2/LiveStreamsQuota;Lcom/vimeo/networking2/LiveTime;)V", "streams$annotations", "()V", "getStreams", "()Lcom/vimeo/networking2/LiveStreamsQuota;", "time$annotations", "getTime", "()Lcom/vimeo/networking2/LiveTime;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "models"})
@com.squareup.moshi.JsonClass(generateAdapter = true)
@com.vimeo.networking2.annotations.Internal()
public final class LiveQuota {
    
    /**
     * * Live streams quota data.
     */
    @org.jetbrains.annotations.Nullable()
    private final com.vimeo.networking2.LiveStreamsQuota streams = null;
    
    /**
     * * Live time data.
     */
    @org.jetbrains.annotations.Nullable()
    private final com.vimeo.networking2.LiveTime time = null;
    
    @com.vimeo.networking2.annotations.Internal()
    public static void streams$annotations() {
    }
    
    /**
     * * Live streams quota data.
     */
    @org.jetbrains.annotations.Nullable()
    public final com.vimeo.networking2.LiveStreamsQuota getStreams() {
        return null;
    }
    
    @com.vimeo.networking2.annotations.Internal()
    public static void time$annotations() {
    }
    
    /**
     * * Live time data.
     */
    @org.jetbrains.annotations.Nullable()
    public final com.vimeo.networking2.LiveTime getTime() {
        return null;
    }
    
    public LiveQuota(@org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "streams")
    com.vimeo.networking2.LiveStreamsQuota streams, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "time")
    com.vimeo.networking2.LiveTime time) {
        super();
    }
    
    public LiveQuota() {
        super();
    }
    
    /**
     * * Live streams quota data.
     */
    @org.jetbrains.annotations.Nullable()
    public final com.vimeo.networking2.LiveStreamsQuota component1() {
        return null;
    }
    
    /**
     * * Live time data.
     */
    @org.jetbrains.annotations.Nullable()
    public final com.vimeo.networking2.LiveTime component2() {
        return null;
    }
    
    /**
     * * Live Quota information.
     */
    @org.jetbrains.annotations.NotNull()
    public final com.vimeo.networking2.LiveQuota copy(@org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "streams")
    com.vimeo.networking2.LiveStreamsQuota streams, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "time")
    com.vimeo.networking2.LiveTime time) {
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