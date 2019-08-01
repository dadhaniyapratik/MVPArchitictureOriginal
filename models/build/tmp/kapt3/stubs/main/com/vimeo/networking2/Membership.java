package com.vimeo.networking2;

import java.lang.System;

/**
 * * This object contains user membership information.
 */
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\b\u00a2\u0006\u0002\u0010\tJ\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\bH\u00c6\u0003J9\u0010\u0017\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\bH\u00c6\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001b\u001a\u00020\u001cH\u00d6\u0001J\t\u0010\u001d\u001a\u00020\u0003H\u00d6\u0001R\u001e\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012\u00a8\u0006\u001e"}, d2 = {"Lcom/vimeo/networking2/Membership;", "", "display", "", "rawType", "badge", "Lcom/vimeo/networking2/UserBadge;", "subscription", "Lcom/vimeo/networking2/Subscription;", "(Ljava/lang/String;Ljava/lang/String;Lcom/vimeo/networking2/UserBadge;Lcom/vimeo/networking2/Subscription;)V", "badge$annotations", "()V", "getBadge", "()Lcom/vimeo/networking2/UserBadge;", "getDisplay", "()Ljava/lang/String;", "getRawType", "getSubscription", "()Lcom/vimeo/networking2/Subscription;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "models"})
@com.squareup.moshi.JsonClass(generateAdapter = true)
public final class Membership {
    
    /**
     * * The user's membership level
     */
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String display = null;
    
    /**
     * * The user's account type.
     *     * @see [Membership.type]
     */
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String rawType = null;
    
    /**
     * * Information about the user's badge.
     */
    @org.jetbrains.annotations.Nullable()
    private final com.vimeo.networking2.UserBadge badge = null;
    
    /**
     * * Information about the user's subscription.
     */
    @org.jetbrains.annotations.Nullable()
    private final com.vimeo.networking2.Subscription subscription = null;
    
    /**
     * * The user's membership level
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getDisplay() {
        return null;
    }
    
    /**
     * * The user's account type.
     *     * @see [Membership.type]
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getRawType() {
        return null;
    }
    
    @com.vimeo.networking2.annotations.Internal()
    public static void badge$annotations() {
    }
    
    /**
     * * Information about the user's badge.
     */
    @org.jetbrains.annotations.Nullable()
    public final com.vimeo.networking2.UserBadge getBadge() {
        return null;
    }
    
    /**
     * * Information about the user's subscription.
     */
    @org.jetbrains.annotations.Nullable()
    public final com.vimeo.networking2.Subscription getSubscription() {
        return null;
    }
    
    public Membership(@org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "display")
    java.lang.String display, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "type")
    java.lang.String rawType, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "badge")
    com.vimeo.networking2.UserBadge badge, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "subscription")
    com.vimeo.networking2.Subscription subscription) {
        super();
    }
    
    public Membership() {
        super();
    }
    
    /**
     * * The user's membership level
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component1() {
        return null;
    }
    
    /**
     * * The user's account type.
     *     * @see [Membership.type]
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component2() {
        return null;
    }
    
    /**
     * * Information about the user's badge.
     */
    @org.jetbrains.annotations.Nullable()
    public final com.vimeo.networking2.UserBadge component3() {
        return null;
    }
    
    /**
     * * Information about the user's subscription.
     */
    @org.jetbrains.annotations.Nullable()
    public final com.vimeo.networking2.Subscription component4() {
        return null;
    }
    
    /**
     * * This object contains user membership information.
     */
    @org.jetbrains.annotations.NotNull()
    public final com.vimeo.networking2.Membership copy(@org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "display")
    java.lang.String display, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "type")
    java.lang.String rawType, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "badge")
    com.vimeo.networking2.UserBadge badge, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "subscription")
    com.vimeo.networking2.Subscription subscription) {
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