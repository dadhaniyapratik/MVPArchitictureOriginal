package com.vimeo.networking2;

import java.lang.System;

/**
 * * All connections for groups.
 */
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u0005J\u000b\u0010\t\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J!\u0010\u000b\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001J\t\u0010\u0011\u001a\u00020\u0012H\u00d6\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007\u00a8\u0006\u0013"}, d2 = {"Lcom/vimeo/networking2/GroupConnections;", "", "users", "Lcom/vimeo/networking2/Connection;", "videos", "(Lcom/vimeo/networking2/Connection;Lcom/vimeo/networking2/Connection;)V", "getUsers", "()Lcom/vimeo/networking2/Connection;", "getVideos", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "models"})
@com.squareup.moshi.JsonClass(generateAdapter = true)
public final class GroupConnections {
    
    /**
     * * Information about the members or moderators of this group.
     */
    @org.jetbrains.annotations.Nullable()
    private final com.vimeo.networking2.Connection users = null;
    
    /**
     * * Information about the videos contained within this group.
     */
    @org.jetbrains.annotations.Nullable()
    private final com.vimeo.networking2.Connection videos = null;
    
    /**
     * * Information about the members or moderators of this group.
     */
    @org.jetbrains.annotations.Nullable()
    public final com.vimeo.networking2.Connection getUsers() {
        return null;
    }
    
    /**
     * * Information about the videos contained within this group.
     */
    @org.jetbrains.annotations.Nullable()
    public final com.vimeo.networking2.Connection getVideos() {
        return null;
    }
    
    public GroupConnections(@org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "users")
    com.vimeo.networking2.Connection users, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "videos")
    com.vimeo.networking2.Connection videos) {
        super();
    }
    
    public GroupConnections() {
        super();
    }
    
    /**
     * * Information about the members or moderators of this group.
     */
    @org.jetbrains.annotations.Nullable()
    public final com.vimeo.networking2.Connection component1() {
        return null;
    }
    
    /**
     * * Information about the videos contained within this group.
     */
    @org.jetbrains.annotations.Nullable()
    public final com.vimeo.networking2.Connection component2() {
        return null;
    }
    
    /**
     * * All connections for groups.
     */
    @org.jetbrains.annotations.NotNull()
    public final com.vimeo.networking2.GroupConnections copy(@org.jetbrains.annotations.Nullable()
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