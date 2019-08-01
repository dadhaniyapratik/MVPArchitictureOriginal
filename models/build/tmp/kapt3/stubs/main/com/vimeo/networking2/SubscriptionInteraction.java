package com.vimeo.networking2;

import java.lang.System;

/**
 * * Information on the subscription video action.
 */
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0017\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\b\u00a2\u0006\u0002\u0010\tJ\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\rJ\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\bH\u00c6\u0003J>\u0010\u001b\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\bH\u00c6\u0001\u00a2\u0006\u0002\u0010\u001cJ\u0013\u0010\u001d\u001a\u00020\u00032\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001f\u001a\u00020 H\u00d6\u0001J\t\u0010!\u001a\u00020\bH\u00d6\u0001R \u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\u0010\n\u0002\u0010\u000e\u0012\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\b\u000f\u0010\u000b\u001a\u0004\b\u0010\u0010\u0011R\u001e\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\b\u0012\u0010\u000b\u001a\u0004\b\u0013\u0010\u0011R\u001e\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\b\u0014\u0010\u000b\u001a\u0004\b\u0015\u0010\u0016\u00a8\u0006\""}, d2 = {"Lcom/vimeo/networking2/SubscriptionInteraction;", "", "drm", "", "expiresTime", "Ljava/util/Date;", "purchaseTime", "streamAccess", "", "(Ljava/lang/Boolean;Ljava/util/Date;Ljava/util/Date;Ljava/lang/String;)V", "drm$annotations", "()V", "getDrm", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "expiresTime$annotations", "getExpiresTime", "()Ljava/util/Date;", "purchaseTime$annotations", "getPurchaseTime", "streamAccess$annotations", "getStreamAccess", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/Boolean;Ljava/util/Date;Ljava/util/Date;Ljava/lang/String;)Lcom/vimeo/networking2/SubscriptionInteraction;", "equals", "other", "hashCode", "", "toString", "models"})
@com.squareup.moshi.JsonClass(generateAdapter = true)
@com.vimeo.networking2.annotations.Internal()
public final class SubscriptionInteraction {
    
    /**
     * * Whether the video has DRM.
     */
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Boolean drm = null;
    
    /**
     * * The time in ISO 8601 format when the subscription expires.
     */
    @org.jetbrains.annotations.Nullable()
    private final java.util.Date expiresTime = null;
    
    /**
     * * The time in ISO 8601 format when the subscription was purchased.
     */
    @org.jetbrains.annotations.Nullable()
    private final java.util.Date purchaseTime = null;
    
    /**
     * * The stream type.
     *     * @see SubscriptionInteraction.streamAccessType
     */
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String streamAccess = null;
    
    @com.vimeo.networking2.annotations.Internal()
    public static void drm$annotations() {
    }
    
    /**
     * * Whether the video has DRM.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean getDrm() {
        return null;
    }
    
    @com.vimeo.networking2.annotations.Internal()
    public static void expiresTime$annotations() {
    }
    
    /**
     * * The time in ISO 8601 format when the subscription expires.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.util.Date getExpiresTime() {
        return null;
    }
    
    @com.vimeo.networking2.annotations.Internal()
    public static void purchaseTime$annotations() {
    }
    
    /**
     * * The time in ISO 8601 format when the subscription was purchased.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.util.Date getPurchaseTime() {
        return null;
    }
    
    @com.vimeo.networking2.annotations.Internal()
    public static void streamAccess$annotations() {
    }
    
    /**
     * * The stream type.
     *     * @see SubscriptionInteraction.streamAccessType
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getStreamAccess() {
        return null;
    }
    
    public SubscriptionInteraction(@org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "drm")
    java.lang.Boolean drm, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "expires_time")
    java.util.Date expiresTime, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "purchase_time")
    java.util.Date purchaseTime, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "stream")
    java.lang.String streamAccess) {
        super();
    }
    
    public SubscriptionInteraction() {
        super();
    }
    
    /**
     * * Whether the video has DRM.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean component1() {
        return null;
    }
    
    /**
     * * The time in ISO 8601 format when the subscription expires.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.util.Date component2() {
        return null;
    }
    
    /**
     * * The time in ISO 8601 format when the subscription was purchased.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.util.Date component3() {
        return null;
    }
    
    /**
     * * The stream type.
     *     * @see SubscriptionInteraction.streamAccessType
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component4() {
        return null;
    }
    
    /**
     * * Information on the subscription video action.
     */
    @org.jetbrains.annotations.NotNull()
    public final com.vimeo.networking2.SubscriptionInteraction copy(@org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "drm")
    java.lang.Boolean drm, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "expires_time")
    java.util.Date expiresTime, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "purchase_time")
    java.util.Date purchaseTime, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "stream")
    java.lang.String streamAccess) {
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