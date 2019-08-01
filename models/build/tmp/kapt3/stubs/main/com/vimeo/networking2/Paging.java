package com.vimeo.networking2;

import java.lang.System;

/**
 * * Paging urls for next, previous, fist and last pages.
 */
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u0007J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J9\u0010\u0011\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0015\u001a\u00020\u0016H\u00d6\u0001J\t\u0010\u0017\u001a\u00020\u0003H\u00d6\u0001R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t\u00a8\u0006\u0018"}, d2 = {"Lcom/vimeo/networking2/Paging;", "", "next", "", "previous", "first", "last", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getFirst", "()Ljava/lang/String;", "getLast", "getNext", "getPrevious", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "models"})
@com.squareup.moshi.JsonClass(generateAdapter = true)
public final class Paging {
    
    /**
     * * Next page's url.
     */
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String next = null;
    
    /**
     * * Previous page's url.
     */
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String previous = null;
    
    /**
     * * First page's url.
     */
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String first = null;
    
    /**
     * * Last page's url.
     */
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String last = null;
    
    /**
     * * Next page's url.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getNext() {
        return null;
    }
    
    /**
     * * Previous page's url.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getPrevious() {
        return null;
    }
    
    /**
     * * First page's url.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getFirst() {
        return null;
    }
    
    /**
     * * Last page's url.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getLast() {
        return null;
    }
    
    public Paging(@org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "next")
    java.lang.String next, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "previous")
    java.lang.String previous, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "first")
    java.lang.String first, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "last")
    java.lang.String last) {
        super();
    }
    
    public Paging() {
        super();
    }
    
    /**
     * * Next page's url.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component1() {
        return null;
    }
    
    /**
     * * Previous page's url.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component2() {
        return null;
    }
    
    /**
     * * First page's url.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component3() {
        return null;
    }
    
    /**
     * * Last page's url.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component4() {
        return null;
    }
    
    /**
     * * Paging urls for next, previous, fist and last pages.
     */
    @org.jetbrains.annotations.NotNull()
    public final com.vimeo.networking2.Paging copy(@org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "next")
    java.lang.String next, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "previous")
    java.lang.String previous, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "first")
    java.lang.String first, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "last")
    java.lang.String last) {
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