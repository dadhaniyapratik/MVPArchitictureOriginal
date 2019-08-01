package com.vimeo.networking2;

import java.lang.System;

/**
 * * Live heart beat configuration.
 */
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0012\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\u0006J\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\nJ\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0002\u0010\u000eJ&\u0010\u0012\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u00c6\u0001\u00a2\u0006\u0002\u0010\u0013J\u0013\u0010\u0014\u001a\u00020\u00032\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0016\u001a\u00020\u0005H\u00d6\u0001J\t\u0010\u0017\u001a\u00020\u0018H\u00d6\u0001R \u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\u0010\n\u0002\u0010\u000b\u0012\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR \u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\u0010\n\u0002\u0010\u000f\u0012\u0004\b\f\u0010\b\u001a\u0004\b\r\u0010\u000e\u00a8\u0006\u0019"}, d2 = {"Lcom/vimeo/networking2/LiveHeartbeatConfiguration;", "", "enabled", "", "interval", "", "(Ljava/lang/Boolean;Ljava/lang/Integer;)V", "enabled$annotations", "()V", "getEnabled", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "interval$annotations", "getInterval", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "component2", "copy", "(Ljava/lang/Boolean;Ljava/lang/Integer;)Lcom/vimeo/networking2/LiveHeartbeatConfiguration;", "equals", "other", "hashCode", "toString", "", "models"})
@com.squareup.moshi.JsonClass(generateAdapter = true)
@com.vimeo.networking2.annotations.Internal()
public final class LiveHeartbeatConfiguration {
    
    /**
     * * Is live heartbeat logging enabled? If it is enabled, then mobile apps should send a
     *     * heartbeat log, play.{hls|dash}.live.heartbeat, so we can track the amount of concurrent
     *     * users viewing a stream.
     */
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Boolean enabled = null;
    
    /**
     * * The interval, in seconds, at which a live heartbeat should be sent.
     */
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Integer interval = null;
    
    @com.vimeo.networking2.annotations.Internal()
    public static void enabled$annotations() {
    }
    
    /**
     * * Is live heartbeat logging enabled? If it is enabled, then mobile apps should send a
     *     * heartbeat log, play.{hls|dash}.live.heartbeat, so we can track the amount of concurrent
     *     * users viewing a stream.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean getEnabled() {
        return null;
    }
    
    @com.vimeo.networking2.annotations.Internal()
    public static void interval$annotations() {
    }
    
    /**
     * * The interval, in seconds, at which a live heartbeat should be sent.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getInterval() {
        return null;
    }
    
    public LiveHeartbeatConfiguration(@org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "enabled")
    java.lang.Boolean enabled, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "interval")
    java.lang.Integer interval) {
        super();
    }
    
    public LiveHeartbeatConfiguration() {
        super();
    }
    
    /**
     * * Is live heartbeat logging enabled? If it is enabled, then mobile apps should send a
     *     * heartbeat log, play.{hls|dash}.live.heartbeat, so we can track the amount of concurrent
     *     * users viewing a stream.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean component1() {
        return null;
    }
    
    /**
     * * The interval, in seconds, at which a live heartbeat should be sent.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component2() {
        return null;
    }
    
    /**
     * * Live heart beat configuration.
     */
    @org.jetbrains.annotations.NotNull()
    public final com.vimeo.networking2.LiveHeartbeatConfiguration copy(@org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "enabled")
    java.lang.Boolean enabled, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "interval")
    java.lang.Integer interval) {
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