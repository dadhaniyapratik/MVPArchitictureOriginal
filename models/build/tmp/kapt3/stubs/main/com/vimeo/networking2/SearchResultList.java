package com.vimeo.networking2;

import java.lang.System;

/**
 * * List of search result that could be paged.
 */
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B_\u0012\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\u0010\b\u0003\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\r\u00a2\u0006\u0002\u0010\u000eJ\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003J\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0014J\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0014J\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0014J\u0010\u0010\u001f\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0014J\u000b\u0010 \u001a\u0004\u0018\u00010\u000bH\u00c6\u0003J\u0011\u0010!\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\rH\u00c6\u0003Jh\u0010\"\u001a\u00020\u00002\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u00062\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u00062\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0010\b\u0003\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\rH\u00c6\u0001\u00a2\u0006\u0002\u0010#J\u0013\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010\'H\u00d6\u0003J\t\u0010(\u001a\u00020\u0006H\u00d6\u0001J\t\u0010)\u001a\u00020*H\u00d6\u0001R\u001c\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\rX\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\n\n\u0002\u0010\u0015\u001a\u0004\b\u0013\u0010\u0014R\u0018\u0010\b\u001a\u0004\u0018\u00010\u0006X\u0096\u0004\u00a2\u0006\n\n\u0002\u0010\u0015\u001a\u0004\b\u0016\u0010\u0014R\u0016\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0018\u0010\t\u001a\u0004\u0018\u00010\u0006X\u0096\u0004\u00a2\u0006\n\n\u0002\u0010\u0015\u001a\u0004\b\u0019\u0010\u0014R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u0006X\u0096\u0004\u00a2\u0006\n\n\u0002\u0010\u0015\u001a\u0004\b\u001a\u0010\u0014\u00a8\u0006+"}, d2 = {"Lcom/vimeo/networking2/SearchResultList;", "Lcom/vimeo/networking2/common/Pageable;", "Lcom/vimeo/networking2/SearchResult;", "facetCollection", "Lcom/vimeo/networking2/SearchFacetCollection;", "matureHiddenCount", "", "total", "page", "perPage", "paging", "Lcom/vimeo/networking2/Paging;", "data", "", "(Lcom/vimeo/networking2/SearchFacetCollection;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Lcom/vimeo/networking2/Paging;Ljava/util/List;)V", "getData", "()Ljava/util/List;", "getFacetCollection", "()Lcom/vimeo/networking2/SearchFacetCollection;", "getMatureHiddenCount", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getPage", "getPaging", "()Lcom/vimeo/networking2/Paging;", "getPerPage", "getTotal", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "(Lcom/vimeo/networking2/SearchFacetCollection;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Lcom/vimeo/networking2/Paging;Ljava/util/List;)Lcom/vimeo/networking2/SearchResultList;", "equals", "", "other", "", "hashCode", "toString", "", "models"})
@com.squareup.moshi.JsonClass(generateAdapter = true)
public final class SearchResultList implements com.vimeo.networking2.common.Pageable<com.vimeo.networking2.SearchResult> {
    
    /**
     * * The search facets.
     */
    @org.jetbrains.annotations.Nullable()
    private final com.vimeo.networking2.SearchFacetCollection facetCollection = null;
    
    /**
     * * The number of videos that were hidden from the results due to mature content.
     */
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Integer matureHiddenCount = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Integer total = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Integer page = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Integer perPage = null;
    @org.jetbrains.annotations.Nullable()
    private final com.vimeo.networking2.Paging paging = null;
    @org.jetbrains.annotations.Nullable()
    private final java.util.List<com.vimeo.networking2.SearchResult> data = null;
    
    /**
     * * The search facets.
     */
    @org.jetbrains.annotations.Nullable()
    public final com.vimeo.networking2.SearchFacetCollection getFacetCollection() {
        return null;
    }
    
    /**
     * * The number of videos that were hidden from the results due to mature content.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getMatureHiddenCount() {
        return null;
    }
    
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
    public java.util.List<com.vimeo.networking2.SearchResult> getData() {
        return null;
    }
    
    public SearchResultList(@org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "facets")
    com.vimeo.networking2.SearchFacetCollection facetCollection, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "mature_hidden_count")
    java.lang.Integer matureHiddenCount, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "total")
    java.lang.Integer total, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "page")
    java.lang.Integer page, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "per_page")
    java.lang.Integer perPage, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "paging")
    com.vimeo.networking2.Paging paging, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "data")
    java.util.List<com.vimeo.networking2.SearchResult> data) {
        super();
    }
    
    public SearchResultList() {
        super();
    }
    
    /**
     * * The search facets.
     */
    @org.jetbrains.annotations.Nullable()
    public final com.vimeo.networking2.SearchFacetCollection component1() {
        return null;
    }
    
    /**
     * * The number of videos that were hidden from the results due to mature content.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component3() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component4() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component5() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.vimeo.networking2.Paging component6() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.vimeo.networking2.SearchResult> component7() {
        return null;
    }
    
    /**
     * * List of search result that could be paged.
     */
    @org.jetbrains.annotations.NotNull()
    public final com.vimeo.networking2.SearchResultList copy(@org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "facets")
    com.vimeo.networking2.SearchFacetCollection facetCollection, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "mature_hidden_count")
    java.lang.Integer matureHiddenCount, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "total")
    java.lang.Integer total, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "page")
    java.lang.Integer page, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "per_page")
    java.lang.Integer perPage, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "paging")
    com.vimeo.networking2.Paging paging, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "data")
    java.util.List<com.vimeo.networking2.SearchResult> data) {
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