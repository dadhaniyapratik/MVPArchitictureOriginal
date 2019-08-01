package com.vimeo.networking2;

import java.lang.System;

/**
 * * All actions that can be taken on a category.
 */
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u0004J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0015\u0010\b\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001R\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0011"}, d2 = {"Lcom/vimeo/networking2/CategoryInteractions;", "Lcom/vimeo/networking2/common/FollowableInteractions;", "follow", "Lcom/vimeo/networking2/FollowInteraction;", "(Lcom/vimeo/networking2/FollowInteraction;)V", "getFollow", "()Lcom/vimeo/networking2/FollowInteraction;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "models"})
@com.squareup.moshi.JsonClass(generateAdapter = true)
public final class CategoryInteractions implements com.vimeo.networking2.common.FollowableInteractions {
    @org.jetbrains.annotations.Nullable()
    private final com.vimeo.networking2.FollowInteraction follow = null;
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public com.vimeo.networking2.FollowInteraction getFollow() {
        return null;
    }
    
    public CategoryInteractions(@org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "follow")
    com.vimeo.networking2.FollowInteraction follow) {
        super();
    }
    
    public CategoryInteractions() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.vimeo.networking2.FollowInteraction component1() {
        return null;
    }
    
    /**
     * * All actions that can be taken on a category.
     */
    @org.jetbrains.annotations.NotNull()
    public final com.vimeo.networking2.CategoryInteractions copy(@org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "follow")
    com.vimeo.networking2.FollowInteraction follow) {
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