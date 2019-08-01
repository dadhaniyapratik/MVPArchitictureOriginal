package com.vimeo.networking2;

import java.lang.System;

/**
 * * Quota data.
 */
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u0005J\u0010\u0010\n\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0007J\u0010\u0010\u000b\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0007J&\u0010\f\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001\u00a2\u0006\u0002\u0010\rJ\u0013\u0010\u000e\u001a\u00020\u00032\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0010\u001a\u00020\u0011H\u00d6\u0001J\t\u0010\u0012\u001a\u00020\u0013H\u00d6\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0006\u0010\u0007R\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010\b\u001a\u0004\b\t\u0010\u0007\u00a8\u0006\u0014"}, d2 = {"Lcom/vimeo/networking2/Quota;", "", "hd", "", "sd", "(Ljava/lang/Boolean;Ljava/lang/Boolean;)V", "getHd", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getSd", "component1", "component2", "copy", "(Ljava/lang/Boolean;Ljava/lang/Boolean;)Lcom/vimeo/networking2/Quota;", "equals", "other", "hashCode", "", "toString", "", "models"})
@com.squareup.moshi.JsonClass(generateAdapter = true)
public final class Quota {
    
    /**
     * * Whether you can upload HD videos.
     */
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Boolean hd = null;
    
    /**
     * * Whether you can upload SD videos.
     */
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Boolean sd = null;
    
    /**
     * * Whether you can upload HD videos.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean getHd() {
        return null;
    }
    
    /**
     * * Whether you can upload SD videos.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean getSd() {
        return null;
    }
    
    public Quota(@org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "hd")
    java.lang.Boolean hd, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "sd")
    java.lang.Boolean sd) {
        super();
    }
    
    public Quota() {
        super();
    }
    
    /**
     * * Whether you can upload HD videos.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean component1() {
        return null;
    }
    
    /**
     * * Whether you can upload SD videos.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean component2() {
        return null;
    }
    
    /**
     * * Quota data.
     */
    @org.jetbrains.annotations.NotNull()
    public final com.vimeo.networking2.Quota copy(@org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "hd")
    java.lang.Boolean hd, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "sd")
    java.lang.Boolean sd) {
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