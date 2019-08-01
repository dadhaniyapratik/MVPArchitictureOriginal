package com.vimeo.networking2;

import java.lang.System;

/**
 * * All actions that can be taken on a [Season].
 */
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u0004J\u000b\u0010\t\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0015\u0010\n\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u000e\u001a\u00020\u000fH\u00d6\u0001J\t\u0010\u0010\u001a\u00020\u0011H\u00d6\u0001R\u001e\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\u00a8\u0006\u0012"}, d2 = {"Lcom/vimeo/networking2/SeasonInteractions;", "", "purchase", "Lcom/vimeo/networking2/PurchaseOnDemandInteraction;", "(Lcom/vimeo/networking2/PurchaseOnDemandInteraction;)V", "purchase$annotations", "()V", "getPurchase", "()Lcom/vimeo/networking2/PurchaseOnDemandInteraction;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "models"})
@com.squareup.moshi.JsonClass(generateAdapter = true)
public final class SeasonInteractions {
    
    /**
     * * The interactions for an On Demand video.
     */
    @org.jetbrains.annotations.Nullable()
    private final com.vimeo.networking2.PurchaseOnDemandInteraction purchase = null;
    
    @com.vimeo.networking2.annotations.Internal()
    public static void purchase$annotations() {
    }
    
    /**
     * * The interactions for an On Demand video.
     */
    @org.jetbrains.annotations.Nullable()
    public final com.vimeo.networking2.PurchaseOnDemandInteraction getPurchase() {
        return null;
    }
    
    public SeasonInteractions(@org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "purchase")
    com.vimeo.networking2.PurchaseOnDemandInteraction purchase) {
        super();
    }
    
    public SeasonInteractions() {
        super();
    }
    
    /**
     * * The interactions for an On Demand video.
     */
    @org.jetbrains.annotations.Nullable()
    public final com.vimeo.networking2.PurchaseOnDemandInteraction component1() {
        return null;
    }
    
    /**
     * * All actions that can be taken on a [Season].
     */
    @org.jetbrains.annotations.NotNull()
    public final com.vimeo.networking2.SeasonInteractions copy(@org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "purchase")
    com.vimeo.networking2.PurchaseOnDemandInteraction purchase) {
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