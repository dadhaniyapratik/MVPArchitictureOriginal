package com.vimeo.networking2;

import java.lang.System;

/**
 * * User's upload quota information.
 */
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\t\u00a2\u0006\u0002\u0010\nJ\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\tH\u00c6\u0003J9\u0010\u0017\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\tH\u00c6\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001b\u001a\u00020\u001cH\u00d6\u0001J\t\u0010\u001d\u001a\u00020\u001eH\u00d6\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\b\u001a\u0004\u0018\u00010\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012\u00a8\u0006\u001f"}, d2 = {"Lcom/vimeo/networking2/UploadQuota;", "", "lifetime", "Lcom/vimeo/networking2/Lifetime;", "periodic", "Lcom/vimeo/networking2/Periodic;", "quota", "Lcom/vimeo/networking2/Quota;", "space", "Lcom/vimeo/networking2/Space;", "(Lcom/vimeo/networking2/Lifetime;Lcom/vimeo/networking2/Periodic;Lcom/vimeo/networking2/Quota;Lcom/vimeo/networking2/Space;)V", "getLifetime", "()Lcom/vimeo/networking2/Lifetime;", "getPeriodic", "()Lcom/vimeo/networking2/Periodic;", "getQuota", "()Lcom/vimeo/networking2/Quota;", "getSpace", "()Lcom/vimeo/networking2/Space;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "", "models"})
@com.squareup.moshi.JsonClass(generateAdapter = true)
public final class UploadQuota {
    
    /**
     * * The number of bytes remaining in your lifetime maximum.
     */
    @org.jetbrains.annotations.Nullable()
    private final com.vimeo.networking2.Lifetime lifetime = null;
    
    /**
     * * The number of bytes remaining in your upload quota for the current period.
     */
    @org.jetbrains.annotations.Nullable()
    private final com.vimeo.networking2.Periodic periodic = null;
    
    /**
     * * Quota information.
     */
    @org.jetbrains.annotations.Nullable()
    private final com.vimeo.networking2.Quota quota = null;
    
    /**
     * * Space information.
     */
    @org.jetbrains.annotations.Nullable()
    private final com.vimeo.networking2.Space space = null;
    
    /**
     * * The number of bytes remaining in your lifetime maximum.
     */
    @org.jetbrains.annotations.Nullable()
    public final com.vimeo.networking2.Lifetime getLifetime() {
        return null;
    }
    
    /**
     * * The number of bytes remaining in your upload quota for the current period.
     */
    @org.jetbrains.annotations.Nullable()
    public final com.vimeo.networking2.Periodic getPeriodic() {
        return null;
    }
    
    /**
     * * Quota information.
     */
    @org.jetbrains.annotations.Nullable()
    public final com.vimeo.networking2.Quota getQuota() {
        return null;
    }
    
    /**
     * * Space information.
     */
    @org.jetbrains.annotations.Nullable()
    public final com.vimeo.networking2.Space getSpace() {
        return null;
    }
    
    public UploadQuota(@org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "lifetime")
    com.vimeo.networking2.Lifetime lifetime, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "periodic")
    com.vimeo.networking2.Periodic periodic, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "quota")
    com.vimeo.networking2.Quota quota, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "space")
    com.vimeo.networking2.Space space) {
        super();
    }
    
    public UploadQuota() {
        super();
    }
    
    /**
     * * The number of bytes remaining in your lifetime maximum.
     */
    @org.jetbrains.annotations.Nullable()
    public final com.vimeo.networking2.Lifetime component1() {
        return null;
    }
    
    /**
     * * The number of bytes remaining in your upload quota for the current period.
     */
    @org.jetbrains.annotations.Nullable()
    public final com.vimeo.networking2.Periodic component2() {
        return null;
    }
    
    /**
     * * Quota information.
     */
    @org.jetbrains.annotations.Nullable()
    public final com.vimeo.networking2.Quota component3() {
        return null;
    }
    
    /**
     * * Space information.
     */
    @org.jetbrains.annotations.Nullable()
    public final com.vimeo.networking2.Space component4() {
        return null;
    }
    
    /**
     * * User's upload quota information.
     */
    @org.jetbrains.annotations.NotNull()
    public final com.vimeo.networking2.UploadQuota copy(@org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "lifetime")
    com.vimeo.networking2.Lifetime lifetime, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "periodic")
    com.vimeo.networking2.Periodic periodic, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "quota")
    com.vimeo.networking2.Quota quota, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "space")
    com.vimeo.networking2.Space space) {
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