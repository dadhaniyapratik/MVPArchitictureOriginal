package com.vimeo.networking2;

import java.lang.System;

/**
 * * Facebook API configuration data.
 */
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0010\b\u0003\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u0005J\u0011\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003H\u00c6\u0003J\u001b\u0010\u000b\u001a\u00020\u00002\u0010\b\u0003\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003H\u00c6\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001J\t\u0010\u0011\u001a\u00020\u0004H\u00d6\u0001R$\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\u00a8\u0006\u0012"}, d2 = {"Lcom/vimeo/networking2/FacebookConfiguration;", "", "requiredScopes", "", "", "(Ljava/util/List;)V", "requiredScopes$annotations", "()V", "getRequiredScopes", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "models"})
@com.squareup.moshi.JsonClass(generateAdapter = true)
@com.vimeo.networking2.annotations.Internal()
public final class FacebookConfiguration {
    
    /**
     * * An array of required scopes for connecting users to Facebook.
     */
    @org.jetbrains.annotations.Nullable()
    private final java.util.List<java.lang.String> requiredScopes = null;
    
    @com.vimeo.networking2.annotations.Internal()
    public static void requiredScopes$annotations() {
    }
    
    /**
     * * An array of required scopes for connecting users to Facebook.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<java.lang.String> getRequiredScopes() {
        return null;
    }
    
    public FacebookConfiguration(@org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "required_scopes")
    java.util.List<java.lang.String> requiredScopes) {
        super();
    }
    
    public FacebookConfiguration() {
        super();
    }
    
    /**
     * * An array of required scopes for connecting users to Facebook.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<java.lang.String> component1() {
        return null;
    }
    
    /**
     * * Facebook API configuration data.
     */
    @org.jetbrains.annotations.NotNull()
    public final com.vimeo.networking2.FacebookConfiguration copy(@org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "required_scopes")
    java.util.List<java.lang.String> requiredScopes) {
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