package com.vimeo.networking2;

import java.lang.System;

/**
 * * Information on liking a video.
 */
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B;\u0012\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0010\b\u0003\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\b\u00a2\u0006\u0002\u0010\nJ\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\fJ\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u0011\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007H\u00c6\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\bH\u00c6\u0003JD\u0010\u0018\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0010\b\u0003\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00072\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\bH\u00c6\u0001\u00a2\u0006\u0002\u0010\u0019J\u0013\u0010\u001a\u001a\u00020\u00032\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u00d6\u0003J\t\u0010\u001d\u001a\u00020\u001eH\u00d6\u0001J\t\u0010\u001f\u001a\u00020\bH\u00d6\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0096\u0004\u00a2\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\t\u001a\u0004\u0018\u00010\bX\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013\u00a8\u0006 "}, d2 = {"Lcom/vimeo/networking2/LikeInteraction;", "Lcom/vimeo/networking2/common/UpdatableInteraction;", "added", "", "addedTime", "Ljava/util/Date;", "options", "", "", "uri", "(Ljava/lang/Boolean;Ljava/util/Date;Ljava/util/List;Ljava/lang/String;)V", "getAdded", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getAddedTime", "()Ljava/util/Date;", "getOptions", "()Ljava/util/List;", "getUri", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/Boolean;Ljava/util/Date;Ljava/util/List;Ljava/lang/String;)Lcom/vimeo/networking2/LikeInteraction;", "equals", "other", "", "hashCode", "", "toString", "models"})
@com.squareup.moshi.JsonClass(generateAdapter = true)
public final class LikeInteraction implements com.vimeo.networking2.common.UpdatableInteraction {
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Boolean added = null;
    @org.jetbrains.annotations.Nullable()
    private final java.util.Date addedTime = null;
    @org.jetbrains.annotations.Nullable()
    private final java.util.List<java.lang.String> options = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String uri = null;
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Boolean getAdded() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.util.Date getAddedTime() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.util.List<java.lang.String> getOptions() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.String getUri() {
        return null;
    }
    
    public LikeInteraction(@org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "added")
    java.lang.Boolean added, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "added_time")
    java.util.Date addedTime, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "options")
    java.util.List<java.lang.String> options, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "uri")
    java.lang.String uri) {
        super();
    }
    
    public LikeInteraction() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean component1() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.Date component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<java.lang.String> component3() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component4() {
        return null;
    }
    
    /**
     * * Information on liking a video.
     */
    @org.jetbrains.annotations.NotNull()
    public final com.vimeo.networking2.LikeInteraction copy(@org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "added")
    java.lang.Boolean added, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "added_time")
    java.util.Date addedTime, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "options")
    java.util.List<java.lang.String> options, @org.jetbrains.annotations.Nullable()
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