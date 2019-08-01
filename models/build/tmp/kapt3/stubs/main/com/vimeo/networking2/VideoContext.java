package com.vimeo.networking2;

import java.lang.System;

/**
 * * Video context data.
 */
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u0005J\u000b\u0010\t\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J!\u0010\u000b\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001J\t\u0010\u0011\u001a\u00020\u0003H\u00d6\u0001R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007\u00a8\u0006\u0012"}, d2 = {"Lcom/vimeo/networking2/VideoContext;", "", "videoAction", "", "resourceType", "(Ljava/lang/String;Ljava/lang/String;)V", "getResourceType", "()Ljava/lang/String;", "getVideoAction", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "models"})
@com.squareup.moshi.JsonClass(generateAdapter = true)
public final class VideoContext {
    
    /**
     * * The contextual action.
     *     * @see VideoContext.videoActionType
     */
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String videoAction = null;
    
    /**
     * * The contextual resource type.
     */
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String resourceType = null;
    
    /**
     * * The contextual action.
     *     * @see VideoContext.videoActionType
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getVideoAction() {
        return null;
    }
    
    /**
     * * The contextual resource type.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getResourceType() {
        return null;
    }
    
    public VideoContext(@org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "action")
    java.lang.String videoAction, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "resource_type")
    java.lang.String resourceType) {
        super();
    }
    
    public VideoContext() {
        super();
    }
    
    /**
     * * The contextual action.
     *     * @see VideoContext.videoActionType
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component1() {
        return null;
    }
    
    /**
     * * The contextual resource type.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component2() {
        return null;
    }
    
    /**
     * * Video context data.
     */
    @org.jetbrains.annotations.NotNull()
    public final com.vimeo.networking2.VideoContext copy(@org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "action")
    java.lang.String videoAction, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "resource_type")
    java.lang.String resourceType) {
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