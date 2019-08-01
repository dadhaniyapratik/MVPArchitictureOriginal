package com.vimeo.networking2;

import java.lang.System;

/**
 * * An object returned from the configs endpoint. This is a way for the
 * * api to specify configuration for our application.
 */
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\t\u00a2\u0006\u0002\u0010\nJ\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\tH\u00c6\u0003J9\u0010\u001b\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\tH\u00c6\u0001J\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001f\u001a\u00020 H\u00d6\u0001J\t\u0010!\u001a\u00020\"H\u00d6\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001e\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\b\u0011\u0010\u000e\u001a\u0004\b\u0012\u0010\u0013R\u001e\u0010\b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\b\u0014\u0010\u000e\u001a\u0004\b\u0015\u0010\u0016\u00a8\u0006#"}, d2 = {"Lcom/vimeo/networking2/AppConfiguration;", "", "api", "Lcom/vimeo/networking2/ApiConfiguration;", "facebook", "Lcom/vimeo/networking2/FacebookConfiguration;", "features", "Lcom/vimeo/networking2/FeaturesConfiguration;", "live", "Lcom/vimeo/networking2/LiveConfiguration;", "(Lcom/vimeo/networking2/ApiConfiguration;Lcom/vimeo/networking2/FacebookConfiguration;Lcom/vimeo/networking2/FeaturesConfiguration;Lcom/vimeo/networking2/LiveConfiguration;)V", "getApi", "()Lcom/vimeo/networking2/ApiConfiguration;", "facebook$annotations", "()V", "getFacebook", "()Lcom/vimeo/networking2/FacebookConfiguration;", "features$annotations", "getFeatures", "()Lcom/vimeo/networking2/FeaturesConfiguration;", "live$annotations", "getLive", "()Lcom/vimeo/networking2/LiveConfiguration;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "", "models"})
@com.squareup.moshi.JsonClass(generateAdapter = true)
public final class AppConfiguration {
    
    /**
     * * API configuration data.
     */
    @org.jetbrains.annotations.Nullable()
    private final com.vimeo.networking2.ApiConfiguration api = null;
    
    /**
     * * Facebook API configuration data.
     */
    @org.jetbrains.annotations.Nullable()
    private final com.vimeo.networking2.FacebookConfiguration facebook = null;
    
    /**
     * * Various feature configuration data.
     */
    @org.jetbrains.annotations.Nullable()
    private final com.vimeo.networking2.FeaturesConfiguration features = null;
    
    /**
     * * Various live streaming configuration data.
     */
    @org.jetbrains.annotations.Nullable()
    private final com.vimeo.networking2.LiveConfiguration live = null;
    
    /**
     * * API configuration data.
     */
    @org.jetbrains.annotations.Nullable()
    public final com.vimeo.networking2.ApiConfiguration getApi() {
        return null;
    }
    
    @com.vimeo.networking2.annotations.Internal()
    public static void facebook$annotations() {
    }
    
    /**
     * * Facebook API configuration data.
     */
    @org.jetbrains.annotations.Nullable()
    public final com.vimeo.networking2.FacebookConfiguration getFacebook() {
        return null;
    }
    
    @com.vimeo.networking2.annotations.Internal()
    public static void features$annotations() {
    }
    
    /**
     * * Various feature configuration data.
     */
    @org.jetbrains.annotations.Nullable()
    public final com.vimeo.networking2.FeaturesConfiguration getFeatures() {
        return null;
    }
    
    @com.vimeo.networking2.annotations.Internal()
    public static void live$annotations() {
    }
    
    /**
     * * Various live streaming configuration data.
     */
    @org.jetbrains.annotations.Nullable()
    public final com.vimeo.networking2.LiveConfiguration getLive() {
        return null;
    }
    
    public AppConfiguration(@org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "api")
    com.vimeo.networking2.ApiConfiguration api, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "facebook")
    com.vimeo.networking2.FacebookConfiguration facebook, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "features")
    com.vimeo.networking2.FeaturesConfiguration features, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "live")
    com.vimeo.networking2.LiveConfiguration live) {
        super();
    }
    
    public AppConfiguration() {
        super();
    }
    
    /**
     * * API configuration data.
     */
    @org.jetbrains.annotations.Nullable()
    public final com.vimeo.networking2.ApiConfiguration component1() {
        return null;
    }
    
    /**
     * * Facebook API configuration data.
     */
    @org.jetbrains.annotations.Nullable()
    public final com.vimeo.networking2.FacebookConfiguration component2() {
        return null;
    }
    
    /**
     * * Various feature configuration data.
     */
    @org.jetbrains.annotations.Nullable()
    public final com.vimeo.networking2.FeaturesConfiguration component3() {
        return null;
    }
    
    /**
     * * Various live streaming configuration data.
     */
    @org.jetbrains.annotations.Nullable()
    public final com.vimeo.networking2.LiveConfiguration component4() {
        return null;
    }
    
    /**
     * * An object returned from the configs endpoint. This is a way for the
     * * api to specify configuration for our application.
     */
    @org.jetbrains.annotations.NotNull()
    public final com.vimeo.networking2.AppConfiguration copy(@org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "api")
    com.vimeo.networking2.ApiConfiguration api, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "facebook")
    com.vimeo.networking2.FacebookConfiguration facebook, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "features")
    com.vimeo.networking2.FeaturesConfiguration features, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "live")
    com.vimeo.networking2.LiveConfiguration live) {
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