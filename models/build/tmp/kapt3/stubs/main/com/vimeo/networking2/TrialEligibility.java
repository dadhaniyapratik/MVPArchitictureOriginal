package com.vimeo.networking2;

import java.lang.System;

/**
 * * Trial account eligibility.
 */
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\n\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\bJ\u001a\u0010\u000b\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001\u00a2\u0006\u0002\u0010\fJ\u0013\u0010\r\u001a\u00020\u00032\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001J\t\u0010\u0011\u001a\u00020\u0012H\u00d6\u0001R \u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\u0010\n\u0002\u0010\t\u0012\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\u00a8\u0006\u0013"}, d2 = {"Lcom/vimeo/networking2/TrialEligibility;", "", "eligible", "", "(Ljava/lang/Boolean;)V", "eligible$annotations", "()V", "getEligible", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "component1", "copy", "(Ljava/lang/Boolean;)Lcom/vimeo/networking2/TrialEligibility;", "equals", "other", "hashCode", "", "toString", "", "models"})
@com.squareup.moshi.JsonClass(generateAdapter = true)
@com.vimeo.networking2.annotations.Internal()
public final class TrialEligibility {
    
    /**
     * * `true` or `false` depending on if the user is eligible for a trial period.
     */
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Boolean eligible = null;
    
    @com.vimeo.networking2.annotations.Internal()
    public static void eligible$annotations() {
    }
    
    /**
     * * `true` or `false` depending on if the user is eligible for a trial period.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean getEligible() {
        return null;
    }
    
    public TrialEligibility(@org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "eligible")
    java.lang.Boolean eligible) {
        super();
    }
    
    public TrialEligibility() {
        super();
    }
    
    /**
     * * `true` or `false` depending on if the user is eligible for a trial period.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean component1() {
        return null;
    }
    
    /**
     * * Trial account eligibility.
     */
    @org.jetbrains.annotations.NotNull()
    public final com.vimeo.networking2.TrialEligibility copy(@org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "eligible")
    java.lang.Boolean eligible) {
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