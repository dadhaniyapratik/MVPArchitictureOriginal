package com.vimeo.networking2.common;

import java.lang.System;

/**
 * * All lists that can be paged should implement this interface to provide
 * * paging urls, total number of items returns for each page and the data for each page.
 */
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\bf\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002R\u001a\u0010\u0003\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0004X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\bX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u0004\u0018\u00010\fX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u0004\u0018\u00010\bX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0010\u0010\nR\u0014\u0010\u0011\u001a\u0004\u0018\u00010\bX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0012\u0010\n\u00a8\u0006\u0013"}, d2 = {"Lcom/vimeo/networking2/common/Pageable;", "Data_T", "", "data", "", "getData", "()Ljava/util/List;", "page", "", "getPage", "()Ljava/lang/Integer;", "paging", "Lcom/vimeo/networking2/Paging;", "getPaging", "()Lcom/vimeo/networking2/Paging;", "perPage", "getPerPage", "total", "getTotal", "models"})
public abstract interface Pageable<Data_T extends java.lang.Object> {
    
    /**
     * * Total number of items returned.
     */
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Integer getTotal();
    
    /**
     * * The current page number.
     */
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Integer getPage();
    
    /**
     * * The total number of items to return for each page.
     */
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Integer getPerPage();
    
    /**
     * * Urls to the first, last page, next and previous pages.
     */
    @org.jetbrains.annotations.Nullable()
    public abstract com.vimeo.networking2.Paging getPaging();
    
    /**
     * * The data returned for each page.
     */
    @org.jetbrains.annotations.Nullable()
    public abstract java.util.List<Data_T> getData();
}