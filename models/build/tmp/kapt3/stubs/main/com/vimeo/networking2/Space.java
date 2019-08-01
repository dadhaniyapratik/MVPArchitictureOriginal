package com.vimeo.networking2;

import java.lang.System;

/**
 * * Upload quota space data.
 */
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\bJ\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\nJ\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\nJ\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003J\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\nJ>\u0010\u0014\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001\u00a2\u0006\u0002\u0010\u0015J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0019\u001a\u00020\u001aH\u00d6\u0001J\t\u0010\u001b\u001a\u00020\u0006H\u00d6\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\nR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\f\u0010\nR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0015\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\u000f\u0010\n\u00a8\u0006\u001c"}, d2 = {"Lcom/vimeo/networking2/Space;", "", "free", "", "max", "showing", "", "used", "(Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Long;)V", "getFree", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getMax", "getShowing", "()Ljava/lang/String;", "getUsed", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Long;)Lcom/vimeo/networking2/Space;", "equals", "", "other", "hashCode", "", "toString", "models"})
@com.squareup.moshi.JsonClass(generateAdapter = true)
public final class Space {
    
    /**
     * * The number of bytes remaining in your upload quota.
     */
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Long free = null;
    
    /**
     * * The maximum number of bytes allotted to your upload quota.
     */
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Long max = null;
    
    /**
     * * Whether the values of the upload_quota.space fields are for the lifetime quota or
     *     * the periodic quota.
     *     * @see Space.showingType
     */
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String showing = null;
    
    /**
     * * The number of bytes that you've already uploaded against your quota.
     */
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Long used = null;
    
    /**
     * * The number of bytes remaining in your upload quota.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Long getFree() {
        return null;
    }
    
    /**
     * * The maximum number of bytes allotted to your upload quota.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Long getMax() {
        return null;
    }
    
    /**
     * * Whether the values of the upload_quota.space fields are for the lifetime quota or
     *     * the periodic quota.
     *     * @see Space.showingType
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getShowing() {
        return null;
    }
    
    /**
     * * The number of bytes that you've already uploaded against your quota.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Long getUsed() {
        return null;
    }
    
    public Space(@org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "free")
    java.lang.Long free, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "max")
    java.lang.Long max, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "showing")
    java.lang.String showing, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "used")
    java.lang.Long used) {
        super();
    }
    
    public Space() {
        super();
    }
    
    /**
     * * The number of bytes remaining in your upload quota.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Long component1() {
        return null;
    }
    
    /**
     * * The maximum number of bytes allotted to your upload quota.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Long component2() {
        return null;
    }
    
    /**
     * * Whether the values of the upload_quota.space fields are for the lifetime quota or
     *     * the periodic quota.
     *     * @see Space.showingType
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component3() {
        return null;
    }
    
    /**
     * * The number of bytes that you've already uploaded against your quota.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Long component4() {
        return null;
    }
    
    /**
     * * Upload quota space data.
     */
    @org.jetbrains.annotations.NotNull()
    public final com.vimeo.networking2.Space copy(@org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "free")
    java.lang.Long free, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "max")
    java.lang.Long max, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "showing")
    java.lang.String showing, @org.jetbrains.annotations.Nullable()
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