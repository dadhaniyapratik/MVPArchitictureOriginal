package com.vimeo.networking2;

import java.lang.System;

/**
 * * A model representing the specific data needed for the live chat feature when a live video is playing.
 * * Additional data can be found in the [LiveChatConfiguration] class available in the [AppConfiguration].
 */
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0002\u0010\u0007J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003J-\u0010\u0014\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u00c6\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0018\u001a\u00020\u0019H\u00d6\u0001J\t\u0010\u001a\u001a\u00020\u0003H\u00d6\u0001R\u001e\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\b\f\u0010\t\u001a\u0004\b\r\u0010\u000bR\u001e\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\b\u000e\u0010\t\u001a\u0004\b\u000f\u0010\u0010\u00a8\u0006\u001b"}, d2 = {"Lcom/vimeo/networking2/LiveChat;", "", "roomId", "", "token", "user", "Lcom/vimeo/networking2/User;", "(Ljava/lang/String;Ljava/lang/String;Lcom/vimeo/networking2/User;)V", "roomId$annotations", "()V", "getRoomId", "()Ljava/lang/String;", "token$annotations", "getToken", "user$annotations", "getUser", "()Lcom/vimeo/networking2/User;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "models"})
@com.squareup.moshi.JsonClass(generateAdapter = true)
@com.vimeo.networking2.annotations.Internal()
public final class LiveChat {
    
    /**
     * * The identification number of the live clip's chat room.
     */
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String roomId = null;
    
    /**
     * * The JSON Web Token to access the live clip's chat room.
     */
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String token = null;
    
    /**
     * * User.
     */
    @org.jetbrains.annotations.Nullable()
    private final com.vimeo.networking2.User user = null;
    
    @com.vimeo.networking2.annotations.Internal()
    public static void roomId$annotations() {
    }
    
    /**
     * * The identification number of the live clip's chat room.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getRoomId() {
        return null;
    }
    
    @com.vimeo.networking2.annotations.Internal()
    public static void token$annotations() {
    }
    
    /**
     * * The JSON Web Token to access the live clip's chat room.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getToken() {
        return null;
    }
    
    @com.vimeo.networking2.annotations.Internal()
    public static void user$annotations() {
    }
    
    /**
     * * User.
     */
    @org.jetbrains.annotations.Nullable()
    public final com.vimeo.networking2.User getUser() {
        return null;
    }
    
    public LiveChat(@org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "room_id")
    java.lang.String roomId, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "token")
    java.lang.String token, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "user")
    com.vimeo.networking2.User user) {
        super();
    }
    
    public LiveChat() {
        super();
    }
    
    /**
     * * The identification number of the live clip's chat room.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component1() {
        return null;
    }
    
    /**
     * * The JSON Web Token to access the live clip's chat room.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component2() {
        return null;
    }
    
    /**
     * * User.
     */
    @org.jetbrains.annotations.Nullable()
    public final com.vimeo.networking2.User component3() {
        return null;
    }
    
    /**
     * * A model representing the specific data needed for the live chat feature when a live video is playing.
     * * Additional data can be found in the [LiveChatConfiguration] class available in the [AppConfiguration].
     */
    @org.jetbrains.annotations.NotNull()
    public final com.vimeo.networking2.LiveChat copy(@org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "room_id")
    java.lang.String roomId, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "token")
    java.lang.String token, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "user")
    com.vimeo.networking2.User user) {
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