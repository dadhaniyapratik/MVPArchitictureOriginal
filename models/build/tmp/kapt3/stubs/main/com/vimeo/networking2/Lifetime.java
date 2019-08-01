package com.vimeo.networking2;

import java.lang.System;

/**
 * * Lifetime data.
 */
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u0006J\u0010\u0010\f\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\bJ\u0010\u0010\r\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\bJ\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\bJ2\u0010\u000f\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001\u00a2\u0006\u0002\u0010\u0010J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0014\u001a\u00020\u0015H\u00d6\u0001J\t\u0010\u0016\u001a\u00020\u0017H\u00d6\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0007\u0010\bR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010\t\u001a\u0004\b\n\u0010\bR\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u000b\u0010\b\u00a8\u0006\u0018"}, d2 = {"Lcom/vimeo/networking2/Lifetime;", "", "free", "", "max", "used", "(Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;)V", "getFree", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getMax", "getUsed", "component1", "component2", "component3", "copy", "(Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;)Lcom/vimeo/networking2/Lifetime;", "equals", "", "other", "hashCode", "", "toString", "", "models"})
@com.squareup.moshi.JsonClass(generateAdapter = true)
public final class Lifetime {
    
    /**
     * * The number of bytes remaining in your lifetime maximum.
     */
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Long free = null;
    
    /**
     * * The total number of bytes that you can upload across the lifetime of your account.
     */
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Long max = null;
    
    /**
     * * The number of bytes that you've already uploaded against your lifetime limit.
     */
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Long used = null;
    
    /**
     * * The number of bytes remaining in your lifetime maximum.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Long getFree() {
        return null;
    }
    
    /**
     * * The total number of bytes that you can upload across the lifetime of your account.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Long getMax() {
        return null;
    }
    
    /**
     * * The number of bytes that you've already uploaded against your lifetime limit.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Long getUsed() {
        return null;
    }
    
    public Lifetime(@org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "free")
    java.lang.Long free, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "max")
    java.lang.Long max, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "used")
    java.lang.Long used) {
        super();
    }
    
    public Lifetime() {
        super();
    }
    
    /**
     * * The number of bytes remaining in your lifetime maximum.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Long component1() {
        return null;
    }
    
    /**
     * * The total number of bytes that you can upload across the lifetime of your account.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Long component2() {
        return null;
    }
    
    /**
     * * The number of bytes that you've already uploaded against your lifetime limit.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Long component3() {
        return null;
    }
    
    /**
     * * Lifetime data.
     */
    @org.jetbrains.annotations.NotNull()
    public final com.vimeo.networking2.Lifetime copy(@org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "free")
    java.lang.Long free, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "max")
    java.lang.Long max, @org.jetbrains.annotations.Nullable()
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