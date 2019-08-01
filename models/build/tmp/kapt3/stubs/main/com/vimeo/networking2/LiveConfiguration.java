package com.vimeo.networking2;

import java.lang.System;

/**
 * * Live Streaming configuration data.
 */
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\u0006J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J!\u0010\u0010\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u00c6\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0014\u001a\u00020\u0015H\u00d6\u0001J\t\u0010\u0016\u001a\u00020\u0017H\u00d6\u0001R\u001e\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\b\u000b\u0010\b\u001a\u0004\b\f\u0010\r\u00a8\u0006\u0018"}, d2 = {"Lcom/vimeo/networking2/LiveConfiguration;", "", "chat", "Lcom/vimeo/networking2/LiveChatConfiguration;", "heartbeat", "Lcom/vimeo/networking2/LiveHeartbeatConfiguration;", "(Lcom/vimeo/networking2/LiveChatConfiguration;Lcom/vimeo/networking2/LiveHeartbeatConfiguration;)V", "chat$annotations", "()V", "getChat", "()Lcom/vimeo/networking2/LiveChatConfiguration;", "heartbeat$annotations", "getHeartbeat", "()Lcom/vimeo/networking2/LiveHeartbeatConfiguration;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "models"})
@com.squareup.moshi.JsonClass(generateAdapter = true)
@com.vimeo.networking2.annotations.Internal()
public final class LiveConfiguration {
    
    /**
     * * Live chat configuration data.
     */
    @org.jetbrains.annotations.Nullable()
    private final com.vimeo.networking2.LiveChatConfiguration chat = null;
    
    /**
     * * Live heart beat configuration data.
     */
    @org.jetbrains.annotations.Nullable()
    private final com.vimeo.networking2.LiveHeartbeatConfiguration heartbeat = null;
    
    @com.vimeo.networking2.annotations.Internal()
    public static void chat$annotations() {
    }
    
    /**
     * * Live chat configuration data.
     */
    @org.jetbrains.annotations.Nullable()
    public final com.vimeo.networking2.LiveChatConfiguration getChat() {
        return null;
    }
    
    @com.vimeo.networking2.annotations.Internal()
    public static void heartbeat$annotations() {
    }
    
    /**
     * * Live heart beat configuration data.
     */
    @org.jetbrains.annotations.Nullable()
    public final com.vimeo.networking2.LiveHeartbeatConfiguration getHeartbeat() {
        return null;
    }
    
    public LiveConfiguration(@org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "chat")
    com.vimeo.networking2.LiveChatConfiguration chat, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "heartbeat")
    com.vimeo.networking2.LiveHeartbeatConfiguration heartbeat) {
        super();
    }
    
    public LiveConfiguration() {
        super();
    }
    
    /**
     * * Live chat configuration data.
     */
    @org.jetbrains.annotations.Nullable()
    public final com.vimeo.networking2.LiveChatConfiguration component1() {
        return null;
    }
    
    /**
     * * Live heart beat configuration data.
     */
    @org.jetbrains.annotations.Nullable()
    public final com.vimeo.networking2.LiveHeartbeatConfiguration component2() {
        return null;
    }
    
    /**
     * * Live Streaming configuration data.
     */
    @org.jetbrains.annotations.NotNull()
    public final com.vimeo.networking2.LiveConfiguration copy(@org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "chat")
    com.vimeo.networking2.LiveChatConfiguration chat, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "heartbeat")
    com.vimeo.networking2.LiveHeartbeatConfiguration heartbeat) {
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