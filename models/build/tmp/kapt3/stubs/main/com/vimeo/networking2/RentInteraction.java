package com.vimeo.networking2;

import java.lang.System;

/**
 * * The Rent interaction for an On Demand video.
 */
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b-\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Bq\u0012\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\t\u0012\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u0010J\u000b\u0010,\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0010\u0010-\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0017J\u0010\u0010.\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003\u00a2\u0006\u0002\u0010\u001bJ\u000b\u0010/\u001a\u0004\u0018\u00010\tH\u00c6\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0010\u00101\u001a\u0004\u0018\u00010\fH\u00c6\u0003\u00a2\u0006\u0002\u0010$J\u000b\u00102\u001a\u0004\u0018\u00010\tH\u00c6\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u00104\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003Jz\u00105\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\t2\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u000f\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001\u00a2\u0006\u0002\u00106J\u0013\u00107\u001a\u00020\u00072\b\u00108\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u00109\u001a\u00020:H\u00d6\u0001J\t\u0010;\u001a\u00020\u0003H\u00d6\u0001R\u001e\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R \u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\u0010\n\u0002\u0010\u0018\u0012\u0004\b\u0015\u0010\u0012\u001a\u0004\b\u0016\u0010\u0017R \u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004\u00a2\u0006\u0010\n\u0002\u0010\u001c\u0012\u0004\b\u0019\u0010\u0012\u001a\u0004\b\u001a\u0010\u001bR\u001e\u0010\b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\b\u001d\u0010\u0012\u001a\u0004\b\u001e\u0010\u001fR\u001e\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\b \u0010\u0012\u001a\u0004\b!\u0010\u0014R \u0010\u000b\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004\u00a2\u0006\u0010\n\u0002\u0010%\u0012\u0004\b\"\u0010\u0012\u001a\u0004\b#\u0010$R\u001e\u0010\r\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\b&\u0010\u0012\u001a\u0004\b\'\u0010\u001fR\u001e\u0010\u000e\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\b(\u0010\u0012\u001a\u0004\b)\u0010\u0014R\u001e\u0010\u000f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\b*\u0010\u0012\u001a\u0004\b+\u0010\u0014\u00a8\u0006<"}, d2 = {"Lcom/vimeo/networking2/RentInteraction;", "", "currency", "", "displayPrice", "", "drm", "", "expirationDate", "Ljava/util/Date;", "link", "price", "", "purchaseTime", "streamAccess", "uri", "(Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Boolean;Ljava/util/Date;Ljava/lang/String;Ljava/lang/Double;Ljava/util/Date;Ljava/lang/String;Ljava/lang/String;)V", "currency$annotations", "()V", "getCurrency", "()Ljava/lang/String;", "displayPrice$annotations", "getDisplayPrice", "()Ljava/lang/Long;", "Ljava/lang/Long;", "drm$annotations", "getDrm", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "expirationDate$annotations", "getExpirationDate", "()Ljava/util/Date;", "link$annotations", "getLink", "price$annotations", "getPrice", "()Ljava/lang/Double;", "Ljava/lang/Double;", "purchaseTime$annotations", "getPurchaseTime", "streamAccess$annotations", "getStreamAccess", "uri$annotations", "getUri", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Boolean;Ljava/util/Date;Ljava/lang/String;Ljava/lang/Double;Ljava/util/Date;Ljava/lang/String;Ljava/lang/String;)Lcom/vimeo/networking2/RentInteraction;", "equals", "other", "hashCode", "", "toString", "models"})
@com.squareup.moshi.JsonClass(generateAdapter = true)
@com.vimeo.networking2.annotations.Internal()
public final class RentInteraction {
    
    /**
     * * The currency code for the current user's region.
     */
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String currency = null;
    
    /**
     * * Formatted price to display to rent an On Demand video.
     */
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Long displayPrice = null;
    
    /**
     * * Whether the video has DRM.
     */
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Boolean drm = null;
    
    /**
     * * The time in ISO 8601 format when the rental period for the video expires.
     */
    @org.jetbrains.annotations.Nullable()
    private final java.util.Date expirationDate = null;
    
    /**
     * * The URL to rent the On Demand video on Vimeo.
     */
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String link = null;
    
    /**
     * * The numeric value of the price for buying the On Demand video.
     */
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Double price = null;
    
    /**
     * * The time in ISO 8601 format when the On Demand video was rented.
     */
    @org.jetbrains.annotations.Nullable()
    private final java.util.Date purchaseTime = null;
    
    /**
     * * The user's streaming access to this On Demand video.
     *     * @see RentInteraction.streamAccessType
     */
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String streamAccess = null;
    
    /**
     * * The product URI to rent the On Demand video.
     */
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String uri = null;
    
    @com.vimeo.networking2.annotations.Internal()
    public static void currency$annotations() {
    }
    
    /**
     * * The currency code for the current user's region.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getCurrency() {
        return null;
    }
    
    @com.vimeo.networking2.annotations.Internal()
    public static void displayPrice$annotations() {
    }
    
    /**
     * * Formatted price to display to rent an On Demand video.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Long getDisplayPrice() {
        return null;
    }
    
    @com.vimeo.networking2.annotations.Internal()
    public static void drm$annotations() {
    }
    
    /**
     * * Whether the video has DRM.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean getDrm() {
        return null;
    }
    
    @com.vimeo.networking2.annotations.Internal()
    public static void expirationDate$annotations() {
    }
    
    /**
     * * The time in ISO 8601 format when the rental period for the video expires.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.util.Date getExpirationDate() {
        return null;
    }
    
    @com.vimeo.networking2.annotations.Internal()
    public static void link$annotations() {
    }
    
    /**
     * * The URL to rent the On Demand video on Vimeo.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getLink() {
        return null;
    }
    
    @com.vimeo.networking2.annotations.Internal()
    public static void price$annotations() {
    }
    
    /**
     * * The numeric value of the price for buying the On Demand video.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double getPrice() {
        return null;
    }
    
    @com.vimeo.networking2.annotations.Internal()
    public static void purchaseTime$annotations() {
    }
    
    /**
     * * The time in ISO 8601 format when the On Demand video was rented.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.util.Date getPurchaseTime() {
        return null;
    }
    
    @com.vimeo.networking2.annotations.Internal()
    public static void streamAccess$annotations() {
    }
    
    /**
     * * The user's streaming access to this On Demand video.
     *     * @see RentInteraction.streamAccessType
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getStreamAccess() {
        return null;
    }
    
    @com.vimeo.networking2.annotations.Internal()
    public static void uri$annotations() {
    }
    
    /**
     * * The product URI to rent the On Demand video.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getUri() {
        return null;
    }
    
    public RentInteraction(@org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "currency")
    java.lang.String currency, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "display_price")
    java.lang.Long displayPrice, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "drm")
    java.lang.Boolean drm, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "expires_time")
    java.util.Date expirationDate, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "link")
    java.lang.String link, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "price")
    java.lang.Double price, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "purchase_time")
    java.util.Date purchaseTime, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "stream")
    java.lang.String streamAccess, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "uri")
    java.lang.String uri) {
        super();
    }
    
    public RentInteraction() {
        super();
    }
    
    /**
     * * The currency code for the current user's region.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component1() {
        return null;
    }
    
    /**
     * * Formatted price to display to rent an On Demand video.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Long component2() {
        return null;
    }
    
    /**
     * * Whether the video has DRM.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean component3() {
        return null;
    }
    
    /**
     * * The time in ISO 8601 format when the rental period for the video expires.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.util.Date component4() {
        return null;
    }
    
    /**
     * * The URL to rent the On Demand video on Vimeo.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component5() {
        return null;
    }
    
    /**
     * * The numeric value of the price for buying the On Demand video.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double component6() {
        return null;
    }
    
    /**
     * * The time in ISO 8601 format when the On Demand video was rented.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.util.Date component7() {
        return null;
    }
    
    /**
     * * The user's streaming access to this On Demand video.
     *     * @see RentInteraction.streamAccessType
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component8() {
        return null;
    }
    
    /**
     * * The product URI to rent the On Demand video.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component9() {
        return null;
    }
    
    /**
     * * The Rent interaction for an On Demand video.
     */
    @org.jetbrains.annotations.NotNull()
    public final com.vimeo.networking2.RentInteraction copy(@org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "currency")
    java.lang.String currency, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "display_price")
    java.lang.Long displayPrice, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "drm")
    java.lang.Boolean drm, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "expires_time")
    java.util.Date expirationDate, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "link")
    java.lang.String link, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "price")
    java.lang.Double price, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "purchase_time")
    java.util.Date purchaseTime, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "stream")
    java.lang.String streamAccess, @org.jetbrains.annotations.Nullable()
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