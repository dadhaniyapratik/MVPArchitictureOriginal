package com.vimeo.networking2;

import java.lang.System;

/**
 * * A collection of push notifications the user is subscribed to.
 */
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\u0002\u0010\bJ\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J-\u0010\u0012\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u00c6\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0016\u001a\u00020\u0017H\u00d6\u0001J\t\u0010\u0018\u001a\u00020\u0007H\u00d6\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e\u00a8\u0006\u0019"}, d2 = {"Lcom/vimeo/networking2/NotificationSubscriptions;", "", "modifiedTime", "Ljava/util/Date;", "subscriptions", "Lcom/vimeo/networking2/Subscriptions;", "uri", "", "(Ljava/util/Date;Lcom/vimeo/networking2/Subscriptions;Ljava/lang/String;)V", "getModifiedTime", "()Ljava/util/Date;", "getSubscriptions", "()Lcom/vimeo/networking2/Subscriptions;", "getUri", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "models"})
@com.squareup.moshi.JsonClass(generateAdapter = true)
public final class NotificationSubscriptions {
    
    /**
     * * The ISODate time the settings were modified.
     */
    @org.jetbrains.annotations.Nullable()
    private final java.util.Date modifiedTime = null;
    
    /**
     * * The settings for each notification subscription.
     */
    @org.jetbrains.annotations.Nullable()
    private final com.vimeo.networking2.Subscriptions subscriptions = null;
    
    /**
     * * The subscription settings' canonical relative URI.
     */
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String uri = null;
    
    /**
     * * The ISODate time the settings were modified.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.util.Date getModifiedTime() {
        return null;
    }
    
    /**
     * * The settings for each notification subscription.
     */
    @org.jetbrains.annotations.Nullable()
    public final com.vimeo.networking2.Subscriptions getSubscriptions() {
        return null;
    }
    
    /**
     * * The subscription settings' canonical relative URI.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getUri() {
        return null;
    }
    
    public NotificationSubscriptions(@org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "modified_time")
    java.util.Date modifiedTime, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "subscriptions")
    com.vimeo.networking2.Subscriptions subscriptions, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "uri")
    java.lang.String uri) {
        super();
    }
    
    public NotificationSubscriptions() {
        super();
    }
    
    /**
     * * The ISODate time the settings were modified.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.util.Date component1() {
        return null;
    }
    
    /**
     * * The settings for each notification subscription.
     */
    @org.jetbrains.annotations.Nullable()
    public final com.vimeo.networking2.Subscriptions component2() {
        return null;
    }
    
    /**
     * * The subscription settings' canonical relative URI.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component3() {
        return null;
    }
    
    /**
     * * A collection of push notifications the user is subscribed to.
     */
    @org.jetbrains.annotations.NotNull()
    public final com.vimeo.networking2.NotificationSubscriptions copy(@org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "modified_time")
    java.util.Date modifiedTime, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "subscriptions")
    com.vimeo.networking2.Subscriptions subscriptions, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "uri")
    java.lang.String uri) {
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