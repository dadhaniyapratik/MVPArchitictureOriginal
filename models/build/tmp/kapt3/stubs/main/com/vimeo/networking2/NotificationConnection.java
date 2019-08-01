package com.vimeo.networking2;

import java.lang.System;

/**
 * * All actions that can be taken on notifications.
 */
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u001b\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001BM\u0012\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\n\u00a2\u0006\u0002\u0010\u000bJ\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u000fJ\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u000fJ\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0006H\u00c6\u0003J\u0010\u0010!\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u000fJ\u000b\u0010\"\u001a\u0004\u0018\u00010\nH\u00c6\u0003JV\u0010#\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\nH\u00c6\u0001\u00a2\u0006\u0002\u0010$J\u0013\u0010%\u001a\u00020&2\b\u0010\'\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010(\u001a\u00020\u0003H\u00d6\u0001J\t\u0010)\u001a\u00020\nH\u00d6\u0001R \u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\u0010\n\u0002\u0010\u0010\u0012\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR \u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\u0010\n\u0002\u0010\u0010\u0012\u0004\b\u0011\u0010\r\u001a\u0004\b\u0012\u0010\u000fR\u001e\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\b\u0013\u0010\r\u001a\u0004\b\u0014\u0010\u0015R\u001e\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\b\u0016\u0010\r\u001a\u0004\b\u0017\u0010\u0015R \u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\u0010\n\u0002\u0010\u0010\u0012\u0004\b\u0018\u0010\r\u001a\u0004\b\u0019\u0010\u000fR\u001e\u0010\t\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\b\u001a\u0010\r\u001a\u0004\b\u001b\u0010\u001c\u00a8\u0006*"}, d2 = {"Lcom/vimeo/networking2/NotificationConnection;", "", "newTotal", "", "total", "typeCount", "Lcom/vimeo/networking2/NotificationTypeCount;", "typeUnseenCount", "unreadTotal", "uri", "", "(Ljava/lang/Integer;Ljava/lang/Integer;Lcom/vimeo/networking2/NotificationTypeCount;Lcom/vimeo/networking2/NotificationTypeCount;Ljava/lang/Integer;Ljava/lang/String;)V", "newTotal$annotations", "()V", "getNewTotal", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "total$annotations", "getTotal", "typeCount$annotations", "getTypeCount", "()Lcom/vimeo/networking2/NotificationTypeCount;", "typeUnseenCount$annotations", "getTypeUnseenCount", "unreadTotal$annotations", "getUnreadTotal", "uri$annotations", "getUri", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(Ljava/lang/Integer;Ljava/lang/Integer;Lcom/vimeo/networking2/NotificationTypeCount;Lcom/vimeo/networking2/NotificationTypeCount;Ljava/lang/Integer;Ljava/lang/String;)Lcom/vimeo/networking2/NotificationConnection;", "equals", "", "other", "hashCode", "toString", "models"})
@com.squareup.moshi.JsonClass(generateAdapter = true)
@com.vimeo.networking2.annotations.Internal()
public final class NotificationConnection {
    
    /**
     * * The total number of new notifications. This data requires a bearer token
     *     * with the private scope.
     */
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Integer newTotal = null;
    
    /**
     * * The total number of notifications. This data requires a bearer token with
     *     * the private scope.
     */
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Integer total = null;
    
    /**
     * * Information about this user's notifications. This data requires a bearer token
     *     * with the private scope.
     */
    @org.jetbrains.annotations.Nullable()
    private final com.vimeo.networking2.NotificationTypeCount typeCount = null;
    
    /**
     * * An array of notification types and the total number of unseen notifications.
     */
    @org.jetbrains.annotations.Nullable()
    private final com.vimeo.networking2.NotificationTypeCount typeUnseenCount = null;
    
    /**
     * * The total number of unread notifications.
     */
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Integer unreadTotal = null;
    
    /**
     * * The API URI that resolves to the connection data.
     */
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String uri = null;
    
    @com.vimeo.networking2.annotations.Internal()
    public static void newTotal$annotations() {
    }
    
    /**
     * * The total number of new notifications. This data requires a bearer token
     *     * with the private scope.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getNewTotal() {
        return null;
    }
    
    @com.vimeo.networking2.annotations.Internal()
    public static void total$annotations() {
    }
    
    /**
     * * The total number of notifications. This data requires a bearer token with
     *     * the private scope.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getTotal() {
        return null;
    }
    
    @com.vimeo.networking2.annotations.Internal()
    public static void typeCount$annotations() {
    }
    
    /**
     * * Information about this user's notifications. This data requires a bearer token
     *     * with the private scope.
     */
    @org.jetbrains.annotations.Nullable()
    public final com.vimeo.networking2.NotificationTypeCount getTypeCount() {
        return null;
    }
    
    @com.vimeo.networking2.annotations.Internal()
    public static void typeUnseenCount$annotations() {
    }
    
    /**
     * * An array of notification types and the total number of unseen notifications.
     */
    @org.jetbrains.annotations.Nullable()
    public final com.vimeo.networking2.NotificationTypeCount getTypeUnseenCount() {
        return null;
    }
    
    @com.vimeo.networking2.annotations.Internal()
    public static void unreadTotal$annotations() {
    }
    
    /**
     * * The total number of unread notifications.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getUnreadTotal() {
        return null;
    }
    
    @com.vimeo.networking2.annotations.Internal()
    public static void uri$annotations() {
    }
    
    /**
     * * The API URI that resolves to the connection data.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getUri() {
        return null;
    }
    
    public NotificationConnection(@org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "new_total")
    java.lang.Integer newTotal, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "total")
    java.lang.Integer total, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "type_count")
    com.vimeo.networking2.NotificationTypeCount typeCount, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "type_unseen_count")
    com.vimeo.networking2.NotificationTypeCount typeUnseenCount, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "unread_total")
    java.lang.Integer unreadTotal, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "uri")
    java.lang.String uri) {
        super();
    }
    
    public NotificationConnection() {
        super();
    }
    
    /**
     * * The total number of new notifications. This data requires a bearer token
     *     * with the private scope.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component1() {
        return null;
    }
    
    /**
     * * The total number of notifications. This data requires a bearer token with
     *     * the private scope.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component2() {
        return null;
    }
    
    /**
     * * Information about this user's notifications. This data requires a bearer token
     *     * with the private scope.
     */
    @org.jetbrains.annotations.Nullable()
    public final com.vimeo.networking2.NotificationTypeCount component3() {
        return null;
    }
    
    /**
     * * An array of notification types and the total number of unseen notifications.
     */
    @org.jetbrains.annotations.Nullable()
    public final com.vimeo.networking2.NotificationTypeCount component4() {
        return null;
    }
    
    /**
     * * The total number of unread notifications.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component5() {
        return null;
    }
    
    /**
     * * The API URI that resolves to the connection data.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component6() {
        return null;
    }
    
    /**
     * * All actions that can be taken on notifications.
     */
    @org.jetbrains.annotations.NotNull()
    public final com.vimeo.networking2.NotificationConnection copy(@org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "new_total")
    java.lang.Integer newTotal, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "total")
    java.lang.Integer total, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "type_count")
    com.vimeo.networking2.NotificationTypeCount typeCount, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "type_unseen_count")
    com.vimeo.networking2.NotificationTypeCount typeUnseenCount, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "unread_total")
    java.lang.Integer unreadTotal, @org.jetbrains.annotations.Nullable()
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