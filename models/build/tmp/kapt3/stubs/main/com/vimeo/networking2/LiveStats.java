package com.vimeo.networking2;

import java.lang.System;

/**
 * * Live stats data.
 */
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0002\u0010\u0007J\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\tJ\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\tJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003J2\u0010\u0011\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u00c6\u0001\u00a2\u0006\u0002\u0010\u0012J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0016\u001a\u00020\u0017H\u00d6\u0001J\t\u0010\u0018\u001a\u00020\u0019H\u00d6\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010\n\u001a\u0004\b\b\u0010\tR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010\n\u001a\u0004\b\u000b\u0010\tR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r\u00a8\u0006\u001a"}, d2 = {"Lcom/vimeo/networking2/LiveStats;", "", "plays", "", "totalViewTime", "viewers", "Lcom/vimeo/networking2/LiveStatsViewers;", "(Ljava/lang/Long;Ljava/lang/Long;Lcom/vimeo/networking2/LiveStatsViewers;)V", "getPlays", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getTotalViewTime", "getViewers", "()Lcom/vimeo/networking2/LiveStatsViewers;", "component1", "component2", "component3", "copy", "(Ljava/lang/Long;Ljava/lang/Long;Lcom/vimeo/networking2/LiveStatsViewers;)Lcom/vimeo/networking2/LiveStats;", "equals", "", "other", "hashCode", "", "toString", "", "models"})
@com.squareup.moshi.JsonClass(generateAdapter = true)
public final class LiveStats {
    
    /**
     * * The current total amount of plays this video has received.
     */
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Long plays = null;
    
    /**
     * * The total amount of time spent watching this video by all viewers.
     */
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Long totalViewTime = null;
    
    /**
     * * Information about the number of people watching the stream.
     */
    @org.jetbrains.annotations.Nullable()
    private final com.vimeo.networking2.LiveStatsViewers viewers = null;
    
    /**
     * * The current total amount of plays this video has received.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Long getPlays() {
        return null;
    }
    
    /**
     * * The total amount of time spent watching this video by all viewers.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Long getTotalViewTime() {
        return null;
    }
    
    /**
     * * Information about the number of people watching the stream.
     */
    @org.jetbrains.annotations.Nullable()
    public final com.vimeo.networking2.LiveStatsViewers getViewers() {
        return null;
    }
    
    public LiveStats(@org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "plays")
    java.lang.Long plays, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "total_view_time")
    java.lang.Long totalViewTime, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "viewers")
    com.vimeo.networking2.LiveStatsViewers viewers) {
        super();
    }
    
    public LiveStats() {
        super();
    }
    
    /**
     * * The current total amount of plays this video has received.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Long component1() {
        return null;
    }
    
    /**
     * * The total amount of time spent watching this video by all viewers.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Long component2() {
        return null;
    }
    
    /**
     * * Information about the number of people watching the stream.
     */
    @org.jetbrains.annotations.Nullable()
    public final com.vimeo.networking2.LiveStatsViewers component3() {
        return null;
    }
    
    /**
     * * Live stats data.
     */
    @org.jetbrains.annotations.NotNull()
    public final com.vimeo.networking2.LiveStats copy(@org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "plays")
    java.lang.Long plays, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "total_view_time")
    java.lang.Long totalViewTime, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "viewers")
    com.vimeo.networking2.LiveStatsViewers viewers) {
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