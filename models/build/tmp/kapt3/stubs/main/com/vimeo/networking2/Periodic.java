package com.vimeo.networking2;

import java.lang.System;

/**
 * * Periodic upload quota information.
 */
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\bJ\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\nJ\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\nJ\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003J\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\nJ>\u0010\u0014\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001\u00a2\u0006\u0002\u0010\u0015J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0019\u001a\u00020\u001aH\u00d6\u0001J\t\u0010\u001b\u001a\u00020\u001cH\u00d6\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\nR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\f\u0010\nR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0015\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\u000f\u0010\n\u00a8\u0006\u001d"}, d2 = {"Lcom/vimeo/networking2/Periodic;", "", "free", "", "max", "resetDate", "Ljava/util/Date;", "used", "(Ljava/lang/Long;Ljava/lang/Long;Ljava/util/Date;Ljava/lang/Long;)V", "getFree", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getMax", "getResetDate", "()Ljava/util/Date;", "getUsed", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/Long;Ljava/lang/Long;Ljava/util/Date;Ljava/lang/Long;)Lcom/vimeo/networking2/Periodic;", "equals", "", "other", "hashCode", "", "toString", "", "models"})
@com.squareup.moshi.JsonClass(generateAdapter = true)
public final class Periodic {
    
    /**
     * * The number of bytes remaining in your upload quota for the current period.
     */
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Long free = null;
    
    /**
     * * The total number of bytes that you can upload per period.
     */
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Long max = null;
    
    /**
     * * The time in ISO 8601 format when your upload quota resets.
     */
    @org.jetbrains.annotations.Nullable()
    private final java.util.Date resetDate = null;
    
    /**
     * * The number of bytes that you've already uploaded against your quota in the current period.
     */
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Long used = null;
    
    /**
     * * The number of bytes remaining in your upload quota for the current period.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Long getFree() {
        return null;
    }
    
    /**
     * * The total number of bytes that you can upload per period.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Long getMax() {
        return null;
    }
    
    /**
     * * The time in ISO 8601 format when your upload quota resets.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.util.Date getResetDate() {
        return null;
    }
    
    /**
     * * The number of bytes that you've already uploaded against your quota in the current period.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Long getUsed() {
        return null;
    }
    
    public Periodic(@org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "free")
    java.lang.Long free, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "max")
    java.lang.Long max, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "reset_date")
    java.util.Date resetDate, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "used")
    java.lang.Long used) {
        super();
    }
    
    public Periodic() {
        super();
    }
    
    /**
     * * The number of bytes remaining in your upload quota for the current period.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Long component1() {
        return null;
    }
    
    /**
     * * The total number of bytes that you can upload per period.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Long component2() {
        return null;
    }
    
    /**
     * * The time in ISO 8601 format when your upload quota resets.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.util.Date component3() {
        return null;
    }
    
    /**
     * * The number of bytes that you've already uploaded against your quota in the current period.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Long component4() {
        return null;
    }
    
    /**
     * * Periodic upload quota information.
     */
    @org.jetbrains.annotations.NotNull()
    public final com.vimeo.networking2.Periodic copy(@org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "free")
    java.lang.Long free, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "max")
    java.lang.Long max, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "reset_date")
    java.util.Date resetDate, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "used")
    java.lang.Long used) {
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