package com.vimeo.networking2;

import java.lang.System;

/**
 * * List of comments that are pageable.
 */
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001BG\u0012\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u0010\b\u0003\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\n\u00a2\u0006\u0002\u0010\u000bJ\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003\u00a2\u0006\u0002\u0010\u000fJ\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003\u00a2\u0006\u0002\u0010\u000fJ\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003\u00a2\u0006\u0002\u0010\u000fJ\u000b\u0010\u0018\u001a\u0004\u0018\u00010\bH\u00c6\u0003J\u0011\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\nH\u00c6\u0003JP\u0010\u001a\u001a\u00020\u00002\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0010\b\u0003\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\nH\u00c6\u0001\u00a2\u0006\u0002\u0010\u001bJ\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u00d6\u0003J\t\u0010 \u001a\u00020\u0004H\u00d6\u0001J\t\u0010!\u001a\u00020\"H\u00d6\u0001R\u001c\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\nX\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u0004X\u0096\u0004\u00a2\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u0004X\u0096\u0004\u00a2\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u0013\u0010\u000fR\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0096\u0004\u00a2\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u0014\u0010\u000f\u00a8\u0006#"}, d2 = {"Lcom/vimeo/networking2/CommentList;", "Lcom/vimeo/networking2/common/Pageable;", "Lcom/vimeo/networking2/Comment;", "total", "", "page", "perPage", "paging", "Lcom/vimeo/networking2/Paging;", "data", "", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Lcom/vimeo/networking2/Paging;Ljava/util/List;)V", "getData", "()Ljava/util/List;", "getPage", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getPaging", "()Lcom/vimeo/networking2/Paging;", "getPerPage", "getTotal", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Lcom/vimeo/networking2/Paging;Ljava/util/List;)Lcom/vimeo/networking2/CommentList;", "equals", "", "other", "", "hashCode", "toString", "", "models"})
@com.squareup.moshi.JsonClass(generateAdapter = true)
public final class CommentList implements com.vimeo.networking2.common.Pageable<com.vimeo.networking2.Comment> {
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Integer total = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Integer page = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Integer perPage = null;
    @org.jetbrains.annotations.Nullable()
    private final com.vimeo.networking2.Paging paging = null;
    @org.jetbrains.annotations.Nullable()
    private final java.util.List<com.vimeo.networking2.Comment> data = null;
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Integer getTotal() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Integer getPage() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Integer getPerPage() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public com.vimeo.networking2.Paging getPaging() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.util.List<com.vimeo.networking2.Comment> getData() {
        return null;
    }
    
    public CommentList(@org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "total")
    java.lang.Integer total, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "page")
    java.lang.Integer page, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "per_page")
    java.lang.Integer perPage, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "paging")
    com.vimeo.networking2.Paging paging, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "data")
    java.util.List<com.vimeo.networking2.Comment> data) {
        super();
    }
    
    public CommentList() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component1() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component3() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.vimeo.networking2.Paging component4() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.vimeo.networking2.Comment> component5() {
        return null;
    }
    
    /**
     * * List of comments that are pageable.
     */
    @org.jetbrains.annotations.NotNull()
    public final com.vimeo.networking2.CommentList copy(@org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "total")
    java.lang.Integer total, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "page")
    java.lang.Integer page, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "per_page")
    java.lang.Integer perPage, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "paging")
    com.vimeo.networking2.Paging paging, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "data")
    java.util.List<com.vimeo.networking2.Comment> data) {
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