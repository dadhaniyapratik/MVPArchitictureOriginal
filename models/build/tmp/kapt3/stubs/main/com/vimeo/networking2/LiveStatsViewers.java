package com.vimeo.networking2;

import java.lang.System;

/**
 * * Live stats viewers data.
 */
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u0005J\u0010\u0010\n\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0007J\u0010\u0010\u000b\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0007J&\u0010\f\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001\u00a2\u0006\u0002\u0010\rJ\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0011\u001a\u00020\u0012H\u00d6\u0001J\t\u0010\u0013\u001a\u00020\u0014H\u00d6\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0006\u0010\u0007R\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010\b\u001a\u0004\b\t\u0010\u0007\u00a8\u0006\u0015"}, d2 = {"Lcom/vimeo/networking2/LiveStatsViewers;", "", "current", "", "peak", "(Ljava/lang/Long;Ljava/lang/Long;)V", "getCurrent", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getPeak", "component1", "component2", "copy", "(Ljava/lang/Long;Ljava/lang/Long;)Lcom/vimeo/networking2/LiveStatsViewers;", "equals", "", "other", "hashCode", "", "toString", "", "models"})
@com.squareup.moshi.JsonClass(generateAdapter = true)
public final class LiveStatsViewers {
    
    /**
     * * The current amount of people watching this video.
     */
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Long current = null;
    
    /**
     * * The peak amount of people watching this video at any time in the provided date range.
     */
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Long peak = null;
    
    /**
     * * The current amount of people watching this video.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Long getCurrent() {
        return null;
    }
    
    /**
     * * The peak amount of people watching this video at any time in the provided date range.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Long getPeak() {
        return null;
    }
    
    public LiveStatsViewers(@org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "current")
    java.lang.Long current, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "peak")
    java.lang.Long peak) {
        super();
    }
    
    public LiveStatsViewers() {
        super();
    }
    
    /**
     * * The current amount of people watching this video.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Long component1() {
        return null;
    }
    
    /**
     * * The peak amount of people watching this video at any time in the provided date range.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Long component2() {
        return null;
    }
    
    /**
     * * Live stats viewers data.
     */
    @org.jetbrains.annotations.NotNull()
    public final com.vimeo.networking2.LiveStatsViewers copy(@org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "current")
    java.lang.Long current, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "peak")
    java.lang.Long peak) {
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