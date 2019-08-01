package com.vimeo.networking2;

import java.lang.System;

/**
 * * All connections for a channel.
 */
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u0006J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J-\u0010\u000e\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0012\u001a\u00020\u0013H\u00d6\u0001J\t\u0010\u0014\u001a\u00020\u0015H\u00d6\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b\u00a8\u0006\u0016"}, d2 = {"Lcom/vimeo/networking2/ChannelConnections;", "", "privacyUsers", "Lcom/vimeo/networking2/Connection;", "users", "videos", "(Lcom/vimeo/networking2/Connection;Lcom/vimeo/networking2/Connection;Lcom/vimeo/networking2/Connection;)V", "getPrivacyUsers", "()Lcom/vimeo/networking2/Connection;", "getUsers", "getVideos", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "models"})
@com.squareup.moshi.JsonClass(generateAdapter = true)
public final class ChannelConnections {
    
    /**
     * * Information provided to channel moderators about which users they have specifically
     *     * permitted to access a private channel. This data requires a bearer token with the
     *     * private scope.
     */
    @org.jetbrains.annotations.Nullable()
    private final com.vimeo.networking2.Connection privacyUsers = null;
    
    /**
     * * Information about the users following or moderating this channel.
     */
    @org.jetbrains.annotations.Nullable()
    private final com.vimeo.networking2.Connection users = null;
    
    /**
     * * Information about the videos that belong to this channel.
     */
    @org.jetbrains.annotations.Nullable()
    private final com.vimeo.networking2.Connection videos = null;
    
    /**
     * * Information provided to channel moderators about which users they have specifically
     *     * permitted to access a private channel. This data requires a bearer token with the
     *     * private scope.
     */
    @org.jetbrains.annotations.Nullable()
    public final com.vimeo.networking2.Connection getPrivacyUsers() {
        return null;
    }
    
    /**
     * * Information about the users following or moderating this channel.
     */
    @org.jetbrains.annotations.Nullable()
    public final com.vimeo.networking2.Connection getUsers() {
        return null;
    }
    
    /**
     * * Information about the videos that belong to this channel.
     */
    @org.jetbrains.annotations.Nullable()
    public final com.vimeo.networking2.Connection getVideos() {
        return null;
    }
    
    public ChannelConnections(@org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "privacy_users")
    com.vimeo.networking2.Connection privacyUsers, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "users")
    com.vimeo.networking2.Connection users, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "videos")
    com.vimeo.networking2.Connection videos) {
        super();
    }
    
    public ChannelConnections() {
        super();
    }
    
    /**
     * * Information provided to channel moderators about which users they have specifically
     *     * permitted to access a private channel. This data requires a bearer token with the
     *     * private scope.
     */
    @org.jetbrains.annotations.Nullable()
    public final com.vimeo.networking2.Connection component1() {
        return null;
    }
    
    /**
     * * Information about the users following or moderating this channel.
     */
    @org.jetbrains.annotations.Nullable()
    public final com.vimeo.networking2.Connection component2() {
        return null;
    }
    
    /**
     * * Information about the videos that belong to this channel.
     */
    @org.jetbrains.annotations.Nullable()
    public final com.vimeo.networking2.Connection component3() {
        return null;
    }
    
    /**
     * * All connections for a channel.
     */
    @org.jetbrains.annotations.NotNull()
    public final com.vimeo.networking2.ChannelConnections copy(@org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "privacy_users")
    com.vimeo.networking2.Connection privacyUsers, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "users")
    com.vimeo.networking2.Connection users, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "videos")
    com.vimeo.networking2.Connection videos) {
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