package com.vimeo.networking2;

import java.lang.System;

/**
 * * A grouping of all facets.
 */
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001BM\u0012\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\tJ\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003JQ\u0010\u0017\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001b\u001a\u00020\u001cH\u00d6\u0001J\t\u0010\u001d\u001a\u00020\u001eH\u00d6\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000bR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000b\u00a8\u0006\u001f"}, d2 = {"Lcom/vimeo/networking2/SearchFacetCollection;", "", "categoryFacet", "Lcom/vimeo/networking2/SearchFacet;", "durationFacet", "licenseFacet", "typeFacet", "uploadedFacet", "userTypeFacet", "(Lcom/vimeo/networking2/SearchFacet;Lcom/vimeo/networking2/SearchFacet;Lcom/vimeo/networking2/SearchFacet;Lcom/vimeo/networking2/SearchFacet;Lcom/vimeo/networking2/SearchFacet;Lcom/vimeo/networking2/SearchFacet;)V", "getCategoryFacet", "()Lcom/vimeo/networking2/SearchFacet;", "getDurationFacet", "getLicenseFacet", "getTypeFacet", "getUploadedFacet", "getUserTypeFacet", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "", "models"})
@com.squareup.moshi.JsonClass(generateAdapter = true)
public final class SearchFacetCollection {
    
    /**
     * * A specific category you want videos for.
     */
    @org.jetbrains.annotations.Nullable()
    private final com.vimeo.networking2.SearchFacet categoryFacet = null;
    
    /**
     * * How long you want videos to be.
     */
    @org.jetbrains.annotations.Nullable()
    private final com.vimeo.networking2.SearchFacet durationFacet = null;
    
    /**
     * * A specific license you want videos to be.
     */
    @org.jetbrains.annotations.Nullable()
    private final com.vimeo.networking2.SearchFacet licenseFacet = null;
    
    /**
     * * The type of filter to use to return result.
     */
    @org.jetbrains.annotations.Nullable()
    private final com.vimeo.networking2.SearchFacet typeFacet = null;
    
    /**
     * * How fresh you want videos.
     */
    @org.jetbrains.annotations.Nullable()
    private final com.vimeo.networking2.SearchFacet uploadedFacet = null;
    
    /**
     * * The account level of users you want returned.
     */
    @org.jetbrains.annotations.Nullable()
    private final com.vimeo.networking2.SearchFacet userTypeFacet = null;
    
    /**
     * * A specific category you want videos for.
     */
    @org.jetbrains.annotations.Nullable()
    public final com.vimeo.networking2.SearchFacet getCategoryFacet() {
        return null;
    }
    
    /**
     * * How long you want videos to be.
     */
    @org.jetbrains.annotations.Nullable()
    public final com.vimeo.networking2.SearchFacet getDurationFacet() {
        return null;
    }
    
    /**
     * * A specific license you want videos to be.
     */
    @org.jetbrains.annotations.Nullable()
    public final com.vimeo.networking2.SearchFacet getLicenseFacet() {
        return null;
    }
    
    /**
     * * The type of filter to use to return result.
     */
    @org.jetbrains.annotations.Nullable()
    public final com.vimeo.networking2.SearchFacet getTypeFacet() {
        return null;
    }
    
    /**
     * * How fresh you want videos.
     */
    @org.jetbrains.annotations.Nullable()
    public final com.vimeo.networking2.SearchFacet getUploadedFacet() {
        return null;
    }
    
    /**
     * * The account level of users you want returned.
     */
    @org.jetbrains.annotations.Nullable()
    public final com.vimeo.networking2.SearchFacet getUserTypeFacet() {
        return null;
    }
    
    public SearchFacetCollection(@org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "category")
    com.vimeo.networking2.SearchFacet categoryFacet, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "duration")
    com.vimeo.networking2.SearchFacet durationFacet, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "license")
    com.vimeo.networking2.SearchFacet licenseFacet, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "type")
    com.vimeo.networking2.SearchFacet typeFacet, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "uploaded")
    com.vimeo.networking2.SearchFacet uploadedFacet, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "user_type")
    com.vimeo.networking2.SearchFacet userTypeFacet) {
        super();
    }
    
    public SearchFacetCollection() {
        super();
    }
    
    /**
     * * A specific category you want videos for.
     */
    @org.jetbrains.annotations.Nullable()
    public final com.vimeo.networking2.SearchFacet component1() {
        return null;
    }
    
    /**
     * * How long you want videos to be.
     */
    @org.jetbrains.annotations.Nullable()
    public final com.vimeo.networking2.SearchFacet component2() {
        return null;
    }
    
    /**
     * * A specific license you want videos to be.
     */
    @org.jetbrains.annotations.Nullable()
    public final com.vimeo.networking2.SearchFacet component3() {
        return null;
    }
    
    /**
     * * The type of filter to use to return result.
     */
    @org.jetbrains.annotations.Nullable()
    public final com.vimeo.networking2.SearchFacet component4() {
        return null;
    }
    
    /**
     * * How fresh you want videos.
     */
    @org.jetbrains.annotations.Nullable()
    public final com.vimeo.networking2.SearchFacet component5() {
        return null;
    }
    
    /**
     * * The account level of users you want returned.
     */
    @org.jetbrains.annotations.Nullable()
    public final com.vimeo.networking2.SearchFacet component6() {
        return null;
    }
    
    /**
     * * A grouping of all facets.
     */
    @org.jetbrains.annotations.NotNull()
    public final com.vimeo.networking2.SearchFacetCollection copy(@org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "category")
    com.vimeo.networking2.SearchFacet categoryFacet, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "duration")
    com.vimeo.networking2.SearchFacet durationFacet, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "license")
    com.vimeo.networking2.SearchFacet licenseFacet, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "type")
    com.vimeo.networking2.SearchFacet typeFacet, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "uploaded")
    com.vimeo.networking2.SearchFacet uploadedFacet, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "user_type")
    com.vimeo.networking2.SearchFacet userTypeFacet) {
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