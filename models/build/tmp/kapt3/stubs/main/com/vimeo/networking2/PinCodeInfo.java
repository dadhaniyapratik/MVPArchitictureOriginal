package com.vimeo.networking2;

import java.lang.System;

/**
 * * A model representing pin code information to be used in association with authorization.
 */
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001BM\u0012\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\nJ\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0010J\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0010J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003JV\u0010\u001a\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001\u00a2\u0006\u0002\u0010\u001bJ\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001f\u001a\u00020\u0007H\u00d6\u0001J\t\u0010 \u001a\u00020\u0003H\u00d6\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u000f\u0010\u0010R\u0015\u0010\b\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u0012\u0010\u0010R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\f\u00a8\u0006!"}, d2 = {"Lcom/vimeo/networking2/PinCodeInfo;", "", "activateLink", "", "authorizeLink", "deviceCode", "expiresIn", "", "interval", "userCode", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;)V", "getActivateLink", "()Ljava/lang/String;", "getAuthorizeLink", "getDeviceCode", "getExpiresIn", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getInterval", "getUserCode", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;)Lcom/vimeo/networking2/PinCodeInfo;", "equals", "", "other", "hashCode", "toString", "models"})
@com.squareup.moshi.JsonClass(generateAdapter = true)
public final class PinCodeInfo {
    
    /**
     * * The activation URL.
     */
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String activateLink = null;
    
    /**
     * * The authorization URL.
     */
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String authorizeLink = null;
    
    /**
     * * The device code string.
     */
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String deviceCode = null;
    
    /**
     * * The remaining time in seconds before the device code expires.
     */
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Integer expiresIn = null;
    
    /**
     * * The interval.
     */
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Integer interval = null;
    
    /**
     * * The user code.
     */
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String userCode = null;
    
    /**
     * * The activation URL.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getActivateLink() {
        return null;
    }
    
    /**
     * * The authorization URL.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getAuthorizeLink() {
        return null;
    }
    
    /**
     * * The device code string.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getDeviceCode() {
        return null;
    }
    
    /**
     * * The remaining time in seconds before the device code expires.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getExpiresIn() {
        return null;
    }
    
    /**
     * * The interval.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getInterval() {
        return null;
    }
    
    /**
     * * The user code.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getUserCode() {
        return null;
    }
    
    public PinCodeInfo(@org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "activate_link")
    java.lang.String activateLink, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "authorize_link")
    java.lang.String authorizeLink, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "device_code")
    java.lang.String deviceCode, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "expires_in")
    java.lang.Integer expiresIn, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "interval")
    java.lang.Integer interval, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "user_code")
    java.lang.String userCode) {
        super();
    }
    
    public PinCodeInfo() {
        super();
    }
    
    /**
     * * The activation URL.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component1() {
        return null;
    }
    
    /**
     * * The authorization URL.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component2() {
        return null;
    }
    
    /**
     * * The device code string.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component3() {
        return null;
    }
    
    /**
     * * The remaining time in seconds before the device code expires.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component4() {
        return null;
    }
    
    /**
     * * The interval.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component5() {
        return null;
    }
    
    /**
     * * The user code.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component6() {
        return null;
    }
    
    /**
     * * A model representing pin code information to be used in association with authorization.
     */
    @org.jetbrains.annotations.NotNull()
    public final com.vimeo.networking2.PinCodeInfo copy(@org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "activate_link")
    java.lang.String activateLink, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "authorize_link")
    java.lang.String authorizeLink, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "device_code")
    java.lang.String deviceCode, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "expires_in")
    java.lang.Integer expiresIn, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "interval")
    java.lang.Integer interval, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "user_code")
    java.lang.String userCode) {
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