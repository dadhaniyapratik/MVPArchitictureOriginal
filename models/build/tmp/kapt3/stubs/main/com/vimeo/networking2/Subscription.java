package com.vimeo.networking2;

import java.lang.System;

/**
 * * Information about the user's subscription.
 */
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\u0006J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J!\u0010\r\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u00c6\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0011\u001a\u00020\u0012H\u00d6\u0001J\t\u0010\u0013\u001a\u00020\u0014H\u00d6\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\u0015"}, d2 = {"Lcom/vimeo/networking2/Subscription;", "", "renewal", "Lcom/vimeo/networking2/SubscriptionRenewal;", "trial", "Lcom/vimeo/networking2/SubscriptionTrial;", "(Lcom/vimeo/networking2/SubscriptionRenewal;Lcom/vimeo/networking2/SubscriptionTrial;)V", "getRenewal", "()Lcom/vimeo/networking2/SubscriptionRenewal;", "getTrial", "()Lcom/vimeo/networking2/SubscriptionTrial;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "models"})
@com.squareup.moshi.JsonClass(generateAdapter = true)
public final class Subscription {
    
    /**
     * * Information about the user's next renewal.
     */
    @org.jetbrains.annotations.Nullable()
    private final com.vimeo.networking2.SubscriptionRenewal renewal = null;
    
    /**
     * * Information about the user's trial period.
     */
    @org.jetbrains.annotations.Nullable()
    private final com.vimeo.networking2.SubscriptionTrial trial = null;
    
    /**
     * * Information about the user's next renewal.
     */
    @org.jetbrains.annotations.Nullable()
    public final com.vimeo.networking2.SubscriptionRenewal getRenewal() {
        return null;
    }
    
    /**
     * * Information about the user's trial period.
     */
    @org.jetbrains.annotations.Nullable()
    public final com.vimeo.networking2.SubscriptionTrial getTrial() {
        return null;
    }
    
    public Subscription(@org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "renewal")
    com.vimeo.networking2.SubscriptionRenewal renewal, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "trial")
    com.vimeo.networking2.SubscriptionTrial trial) {
        super();
    }
    
    public Subscription() {
        super();
    }
    
    /**
     * * Information about the user's next renewal.
     */
    @org.jetbrains.annotations.Nullable()
    public final com.vimeo.networking2.SubscriptionRenewal component1() {
        return null;
    }
    
    /**
     * * Information about the user's trial period.
     */
    @org.jetbrains.annotations.Nullable()
    public final com.vimeo.networking2.SubscriptionTrial component2() {
        return null;
    }
    
    /**
     * * Information about the user's subscription.
     */
    @org.jetbrains.annotations.NotNull()
    public final com.vimeo.networking2.Subscription copy(@org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "renewal")
    com.vimeo.networking2.SubscriptionRenewal renewal, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "trial")
    com.vimeo.networking2.SubscriptionTrial trial) {
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