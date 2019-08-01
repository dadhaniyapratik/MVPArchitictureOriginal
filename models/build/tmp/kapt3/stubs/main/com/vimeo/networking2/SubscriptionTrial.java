package com.vimeo.networking2;

import java.lang.System;

/**
 * * Information about the user's trial period.
 */
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\u0006J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0002\u0010\bJ&\u0010\u0012\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u00c6\u0001\u00a2\u0006\u0002\u0010\u0013J\u0013\u0010\u0014\u001a\u00020\u00052\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0016\u001a\u00020\u0017H\u00d6\u0001J\t\u0010\u0018\u001a\u00020\u0003H\u00d6\u0001R\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\u000b\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f\u00a8\u0006\u0019"}, d2 = {"Lcom/vimeo/networking2/SubscriptionTrial;", "", "rawStatus", "", "hasBeenInFreeTrial", "", "(Ljava/lang/String;Ljava/lang/Boolean;)V", "getHasBeenInFreeTrial", "()Ljava/lang/Boolean;", "setHasBeenInFreeTrial", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "getRawStatus", "()Ljava/lang/String;", "setRawStatus", "(Ljava/lang/String;)V", "component1", "component2", "copy", "(Ljava/lang/String;Ljava/lang/Boolean;)Lcom/vimeo/networking2/SubscriptionTrial;", "equals", "other", "hashCode", "", "toString", "models"})
@com.squareup.moshi.JsonClass(generateAdapter = true)
public final class SubscriptionTrial {
    
    /**
     * * The status of the user's trial.
     *     * If the value is "free_trial" the user is currently in a free trial.
     */
    @org.jetbrains.annotations.Nullable()
    private java.lang.String rawStatus;
    
    /**
     * * Has the user been in (or is currently in) a free trial.
     */
    @org.jetbrains.annotations.Nullable()
    private java.lang.Boolean hasBeenInFreeTrial;
    
    /**
     * * The status of the user's trial.
     *     * If the value is "free_trial" the user is currently in a free trial.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getRawStatus() {
        return null;
    }
    
    /**
     * * The status of the user's trial.
     *     * If the value is "free_trial" the user is currently in a free trial.
     */
    public final void setRawStatus(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    /**
     * * Has the user been in (or is currently in) a free trial.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean getHasBeenInFreeTrial() {
        return null;
    }
    
    /**
     * * Has the user been in (or is currently in) a free trial.
     */
    public final void setHasBeenInFreeTrial(@org.jetbrains.annotations.Nullable()
    java.lang.Boolean p0) {
    }
    
    public SubscriptionTrial(@org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "status")
    java.lang.String rawStatus, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "has_been_in_free_trial")
    java.lang.Boolean hasBeenInFreeTrial) {
        super();
    }
    
    public SubscriptionTrial() {
        super();
    }
    
    /**
     * * The status of the user's trial.
     *     * If the value is "free_trial" the user is currently in a free trial.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component1() {
        return null;
    }
    
    /**
     * * Has the user been in (or is currently in) a free trial.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean component2() {
        return null;
    }
    
    /**
     * * Information about the user's trial period.
     */
    @org.jetbrains.annotations.NotNull()
    public final com.vimeo.networking2.SubscriptionTrial copy(@org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "status")
    java.lang.String rawStatus, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "has_been_in_free_trial")
    java.lang.Boolean hasBeenInFreeTrial) {
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