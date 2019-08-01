package com.vimeo.networking2;

import java.lang.System;

/**
 * * Live Stream Quota dto.
 */
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u0005J\u0010\u0010\r\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\tJ\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\tJ&\u0010\u000f\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001\u00a2\u0006\u0002\u0010\u0010J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0014\u001a\u00020\u0003H\u00d6\u0001J\t\u0010\u0015\u001a\u00020\u0016H\u00d6\u0001R \u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\u0010\n\u0002\u0010\n\u0012\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR \u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\u0010\n\u0002\u0010\n\u0012\u0004\b\u000b\u0010\u0007\u001a\u0004\b\f\u0010\t\u00a8\u0006\u0017"}, d2 = {"Lcom/vimeo/networking2/LiveStreamsQuota;", "", "maximum", "", "remaining", "(Ljava/lang/Integer;Ljava/lang/Integer;)V", "maximum$annotations", "()V", "getMaximum", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "remaining$annotations", "getRemaining", "component1", "component2", "copy", "(Ljava/lang/Integer;Ljava/lang/Integer;)Lcom/vimeo/networking2/LiveStreamsQuota;", "equals", "", "other", "hashCode", "toString", "", "models"})
@com.squareup.moshi.JsonClass(generateAdapter = true)
@com.vimeo.networking2.annotations.Internal()
public final class LiveStreamsQuota {
    
    /**
     * * The maximum amount of streams that the user can create.
     */
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Integer maximum = null;
    
    /**
     * * The amount of remaining live streams that the user can create this month.
     */
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Integer remaining = null;
    
    @com.vimeo.networking2.annotations.Internal()
    public static void maximum$annotations() {
    }
    
    /**
     * * The maximum amount of streams that the user can create.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getMaximum() {
        return null;
    }
    
    @com.vimeo.networking2.annotations.Internal()
    public static void remaining$annotations() {
    }
    
    /**
     * * The amount of remaining live streams that the user can create this month.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getRemaining() {
        return null;
    }
    
    public LiveStreamsQuota(@org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "maximum")
    java.lang.Integer maximum, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "remaining")
    java.lang.Integer remaining) {
        super();
    }
    
    public LiveStreamsQuota() {
        super();
    }
    
    /**
     * * The maximum amount of streams that the user can create.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component1() {
        return null;
    }
    
    /**
     * * The amount of remaining live streams that the user can create this month.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component2() {
        return null;
    }
    
    /**
     * * Live Stream Quota dto.
     */
    @org.jetbrains.annotations.NotNull()
    public final com.vimeo.networking2.LiveStreamsQuota copy(@org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "maximum")
    java.lang.Integer maximum, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "remaining")
    java.lang.Integer remaining) {
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