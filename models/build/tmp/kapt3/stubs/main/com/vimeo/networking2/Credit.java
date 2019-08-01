package com.vimeo.networking2;

import java.lang.System;

/**
 * * Video credit data.
 */
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BA\u0012\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\t\u00a2\u0006\u0002\u0010\nJ\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\tH\u00c6\u0003JE\u0010\u0018\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\tH\u00c6\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001c\u001a\u00020\u001dH\u00d6\u0001J\t\u0010\u001e\u001a\u00020\u0003H\u00d6\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\b\u001a\u0004\u0018\u00010\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012\u00a8\u0006\u001f"}, d2 = {"Lcom/vimeo/networking2/Credit;", "", "name", "", "role", "uri", "user", "Lcom/vimeo/networking2/User;", "video", "Lcom/vimeo/networking2/Video;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/vimeo/networking2/User;Lcom/vimeo/networking2/Video;)V", "getName", "()Ljava/lang/String;", "getRole", "getUri", "getUser", "()Lcom/vimeo/networking2/User;", "getVideo", "()Lcom/vimeo/networking2/Video;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "models"})
@com.squareup.moshi.JsonClass(generateAdapter = true)
public final class Credit {
    
    /**
     * * The name of the person credited.
     */
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String name = null;
    
    /**
     * * The character that this person portrayed, or the job that this person performed.
     */
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String role = null;
    
    /**
     * * The unique identifier to access the credits resource.
     */
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String uri = null;
    
    /**
     * * The Vimeo user associated with this credit.
     */
    @org.jetbrains.annotations.Nullable()
    private final com.vimeo.networking2.User user = null;
    
    /**
     * * The video associated with this credit.
     */
    @org.jetbrains.annotations.Nullable()
    private final com.vimeo.networking2.Video video = null;
    
    /**
     * * The name of the person credited.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getName() {
        return null;
    }
    
    /**
     * * The character that this person portrayed, or the job that this person performed.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getRole() {
        return null;
    }
    
    /**
     * * The unique identifier to access the credits resource.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getUri() {
        return null;
    }
    
    /**
     * * The Vimeo user associated with this credit.
     */
    @org.jetbrains.annotations.Nullable()
    public final com.vimeo.networking2.User getUser() {
        return null;
    }
    
    /**
     * * The video associated with this credit.
     */
    @org.jetbrains.annotations.Nullable()
    public final com.vimeo.networking2.Video getVideo() {
        return null;
    }
    
    public Credit(@org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "name")
    java.lang.String name, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "role")
    java.lang.String role, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "uri")
    java.lang.String uri, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "user")
    com.vimeo.networking2.User user, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "video")
    com.vimeo.networking2.Video video) {
        super();
    }
    
    public Credit() {
        super();
    }
    
    /**
     * * The name of the person credited.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component1() {
        return null;
    }
    
    /**
     * * The character that this person portrayed, or the job that this person performed.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component2() {
        return null;
    }
    
    /**
     * * The unique identifier to access the credits resource.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component3() {
        return null;
    }
    
    /**
     * * The Vimeo user associated with this credit.
     */
    @org.jetbrains.annotations.Nullable()
    public final com.vimeo.networking2.User component4() {
        return null;
    }
    
    /**
     * * The video associated with this credit.
     */
    @org.jetbrains.annotations.Nullable()
    public final com.vimeo.networking2.Video component5() {
        return null;
    }
    
    /**
     * * Video credit data.
     */
    @org.jetbrains.annotations.NotNull()
    public final com.vimeo.networking2.Credit copy(@org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "name")
    java.lang.String name, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "role")
    java.lang.String role, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "uri")
    java.lang.String uri, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "user")
    com.vimeo.networking2.User user, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "video")
    com.vimeo.networking2.Video video) {
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