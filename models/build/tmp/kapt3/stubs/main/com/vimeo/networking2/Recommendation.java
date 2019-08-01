package com.vimeo.networking2;

import java.lang.System;

/**
 * * Recommendation DTO.
 */
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BA\u0012\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\t\u00a2\u0006\u0002\u0010\nJ\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\tH\u00c6\u0003JE\u0010\u001a\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\tH\u00c6\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u00d6\u0003J\t\u0010\u001f\u001a\u00020 H\u00d6\u0001J\t\u0010!\u001a\u00020\u0005H\u00d6\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u000f\u001a\u0004\u0018\u00010\u0005X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000eR\u0013\u0010\b\u001a\u0004\u0018\u00010\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014\u00a8\u0006\""}, d2 = {"Lcom/vimeo/networking2/Recommendation;", "Lcom/vimeo/networking2/common/Entity;", "channel", "Lcom/vimeo/networking2/Channel;", "description", "", "resourceKey", "rawType", "user", "Lcom/vimeo/networking2/User;", "(Lcom/vimeo/networking2/Channel;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/vimeo/networking2/User;)V", "getChannel", "()Lcom/vimeo/networking2/Channel;", "getDescription", "()Ljava/lang/String;", "identifier", "getIdentifier", "getRawType", "getResourceKey", "getUser", "()Lcom/vimeo/networking2/User;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "", "hashCode", "", "toString", "models"})
@com.squareup.moshi.JsonClass(generateAdapter = true)
public final class Recommendation implements com.vimeo.networking2.common.Entity {
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String identifier = null;
    
    /**
     * * The recommended channel.
     */
    @org.jetbrains.annotations.Nullable()
    private final com.vimeo.networking2.Channel channel = null;
    
    /**
     * * The reason for the recommendation.
     */
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String description = null;
    
    /**
     * * The recommendation's resource key string.
     */
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String resourceKey = null;
    
    /**
     * * Type of recommendation.
     *     * @see Recommendation.type
     */
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String rawType = null;
    
    /**
     * * The user that is being recommended.
     */
    @org.jetbrains.annotations.Nullable()
    private final com.vimeo.networking2.User user = null;
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.String getIdentifier() {
        return null;
    }
    
    /**
     * * The recommended channel.
     */
    @org.jetbrains.annotations.Nullable()
    public final com.vimeo.networking2.Channel getChannel() {
        return null;
    }
    
    /**
     * * The reason for the recommendation.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getDescription() {
        return null;
    }
    
    /**
     * * The recommendation's resource key string.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getResourceKey() {
        return null;
    }
    
    /**
     * * Type of recommendation.
     *     * @see Recommendation.type
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getRawType() {
        return null;
    }
    
    /**
     * * The user that is being recommended.
     */
    @org.jetbrains.annotations.Nullable()
    public final com.vimeo.networking2.User getUser() {
        return null;
    }
    
    public Recommendation(@org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "channel")
    com.vimeo.networking2.Channel channel, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "description")
    java.lang.String description, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "resource_key")
    java.lang.String resourceKey, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "type")
    java.lang.String rawType, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "user")
    com.vimeo.networking2.User user) {
        super();
    }
    
    public Recommendation() {
        super();
    }
    
    /**
     * * The recommended channel.
     */
    @org.jetbrains.annotations.Nullable()
    public final com.vimeo.networking2.Channel component1() {
        return null;
    }
    
    /**
     * * The reason for the recommendation.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component2() {
        return null;
    }
    
    /**
     * * The recommendation's resource key string.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component3() {
        return null;
    }
    
    /**
     * * Type of recommendation.
     *     * @see Recommendation.type
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component4() {
        return null;
    }
    
    /**
     * * The user that is being recommended.
     */
    @org.jetbrains.annotations.Nullable()
    public final com.vimeo.networking2.User component5() {
        return null;
    }
    
    /**
     * * Recommendation DTO.
     */
    @org.jetbrains.annotations.NotNull()
    public final com.vimeo.networking2.Recommendation copy(@org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "channel")
    com.vimeo.networking2.Channel channel, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "description")
    java.lang.String description, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "resource_key")
    java.lang.String resourceKey, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "type")
    java.lang.String rawType, @org.jetbrains.annotations.Nullable()
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