package com.vimeo.networking2;

import java.lang.System;

/**
 * * Information about the user's next renewal.
 */
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\u0006J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J!\u0010\u000f\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u00c6\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0013\u001a\u00020\u0014H\u00d6\u0001J\t\u0010\u0015\u001a\u00020\u0003H\u00d6\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f\u00a8\u0006\u0016"}, d2 = {"Lcom/vimeo/networking2/SubscriptionRenewal;", "", "displayDate", "", "renewalDate", "Ljava/util/Date;", "(Ljava/lang/String;Ljava/util/Date;)V", "getDisplayDate", "()Ljava/lang/String;", "getRenewalDate", "()Ljava/util/Date;", "setRenewalDate", "(Ljava/util/Date;)V", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "models"})
@com.squareup.moshi.JsonClass(generateAdapter = true)
public final class SubscriptionRenewal {
    
    /**
     * * The date in YYYY-MM-DD format when the user's membership renews (or expires, if they have
     *     * disabled autorenew). For display only.
     */
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String displayDate = null;
    
    /**
     * * The date the user's membership renews (or expires, if they have disabled autorenew).
     */
    @org.jetbrains.annotations.Nullable()
    private java.util.Date renewalDate;
    
    /**
     * * The date in YYYY-MM-DD format when the user's membership renews (or expires, if they have
     *     * disabled autorenew). For display only.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getDisplayDate() {
        return null;
    }
    
    /**
     * * The date the user's membership renews (or expires, if they have disabled autorenew).
     */
    @org.jetbrains.annotations.Nullable()
    public final java.util.Date getRenewalDate() {
        return null;
    }
    
    /**
     * * The date the user's membership renews (or expires, if they have disabled autorenew).
     */
    public final void setRenewalDate(@org.jetbrains.annotations.Nullable()
    java.util.Date p0) {
    }
    
    public SubscriptionRenewal(@org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "display_date")
    java.lang.String displayDate, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "renewal_date")
    java.util.Date renewalDate) {
        super();
    }
    
    public SubscriptionRenewal() {
        super();
    }
    
    /**
     * * The date in YYYY-MM-DD format when the user's membership renews (or expires, if they have
     *     * disabled autorenew). For display only.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component1() {
        return null;
    }
    
    /**
     * * The date the user's membership renews (or expires, if they have disabled autorenew).
     */
    @org.jetbrains.annotations.Nullable()
    public final java.util.Date component2() {
        return null;
    }
    
    /**
     * * Information about the user's next renewal.
     */
    @org.jetbrains.annotations.NotNull()
    public final com.vimeo.networking2.SubscriptionRenewal copy(@org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "display_date")
    java.lang.String displayDate, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "renewal_date")
    java.util.Date renewalDate) {
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