package com.vimeo.networking2;

import java.lang.System;

/**
 * * All action that can be taken on a video.
 */
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001BY\u0012\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\u000e\u00a2\u0006\u0002\u0010\u000fJ\u000b\u0010\"\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\tH\u00c6\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010\'\u001a\u0004\u0018\u00010\fH\u00c6\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u000eH\u00c6\u0003J]\u0010)\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\u000eH\u00c6\u0001J\u0013\u0010*\u001a\u00020+2\b\u0010,\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010-\u001a\u00020.H\u00d6\u0001J\t\u0010/\u001a\u000200H\u00d6\u0001R\u001e\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\b\u0014\u0010\u0011\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u001e\u0010\b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\b\u0019\u0010\u0011\u001a\u0004\b\u001a\u0010\u001bR\u0013\u0010\n\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0016R\u001e\u0010\u000b\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\b\u001d\u0010\u0011\u001a\u0004\b\u001e\u0010\u001fR\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b \u0010!\u00a8\u00061"}, d2 = {"Lcom/vimeo/networking2/VideoInteractions;", "", "buy", "Lcom/vimeo/networking2/BuyInteraction;", "channel", "Lcom/vimeo/networking2/BasicInteraction;", "like", "Lcom/vimeo/networking2/LikeInteraction;", "rent", "Lcom/vimeo/networking2/RentInteraction;", "report", "subscription", "Lcom/vimeo/networking2/SubscriptionInteraction;", "watchLater", "Lcom/vimeo/networking2/WatchLaterInteraction;", "(Lcom/vimeo/networking2/BuyInteraction;Lcom/vimeo/networking2/BasicInteraction;Lcom/vimeo/networking2/LikeInteraction;Lcom/vimeo/networking2/RentInteraction;Lcom/vimeo/networking2/BasicInteraction;Lcom/vimeo/networking2/SubscriptionInteraction;Lcom/vimeo/networking2/WatchLaterInteraction;)V", "buy$annotations", "()V", "getBuy", "()Lcom/vimeo/networking2/BuyInteraction;", "channel$annotations", "getChannel", "()Lcom/vimeo/networking2/BasicInteraction;", "getLike", "()Lcom/vimeo/networking2/LikeInteraction;", "rent$annotations", "getRent", "()Lcom/vimeo/networking2/RentInteraction;", "getReport", "subscription$annotations", "getSubscription", "()Lcom/vimeo/networking2/SubscriptionInteraction;", "getWatchLater", "()Lcom/vimeo/networking2/WatchLaterInteraction;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "", "toString", "", "models"})
@com.squareup.moshi.JsonClass(generateAdapter = true)
public final class VideoInteractions {
    
    /**
     * * The buy interaction for a On Demand video.
     */
    @org.jetbrains.annotations.Nullable()
    private final com.vimeo.networking2.BuyInteraction buy = null;
    
    /**
     * * When a video is referenced by a channel URI, if the user is a moderator of the
     *     * channel, include information about removing the video from the channel.
     */
    @org.jetbrains.annotations.Nullable()
    private final com.vimeo.networking2.BasicInteraction channel = null;
    
    /**
     * * Information about whether the authenticated user has liked this video.
     */
    @org.jetbrains.annotations.Nullable()
    private final com.vimeo.networking2.LikeInteraction like = null;
    
    /**
     * * The Rent interaction for an On Demand video.
     */
    @org.jetbrains.annotations.Nullable()
    private final com.vimeo.networking2.RentInteraction rent = null;
    
    /**
     * * Information about where and how to report a video.
     */
    @org.jetbrains.annotations.Nullable()
    private final com.vimeo.networking2.BasicInteraction report = null;
    
    /**
     * * Subscription information for an On Demand video.
     */
    @org.jetbrains.annotations.Nullable()
    private final com.vimeo.networking2.SubscriptionInteraction subscription = null;
    
    /**
     * * Information about whether this video appears on the authenticated user's Watch Later list.
     */
    @org.jetbrains.annotations.Nullable()
    private final com.vimeo.networking2.WatchLaterInteraction watchLater = null;
    
    @com.vimeo.networking2.annotations.Internal()
    public static void buy$annotations() {
    }
    
    /**
     * * The buy interaction for a On Demand video.
     */
    @org.jetbrains.annotations.Nullable()
    public final com.vimeo.networking2.BuyInteraction getBuy() {
        return null;
    }
    
    @com.vimeo.networking2.annotations.Internal()
    public static void channel$annotations() {
    }
    
    /**
     * * When a video is referenced by a channel URI, if the user is a moderator of the
     *     * channel, include information about removing the video from the channel.
     */
    @org.jetbrains.annotations.Nullable()
    public final com.vimeo.networking2.BasicInteraction getChannel() {
        return null;
    }
    
    /**
     * * Information about whether the authenticated user has liked this video.
     */
    @org.jetbrains.annotations.Nullable()
    public final com.vimeo.networking2.LikeInteraction getLike() {
        return null;
    }
    
    @com.vimeo.networking2.annotations.Internal()
    public static void rent$annotations() {
    }
    
    /**
     * * The Rent interaction for an On Demand video.
     */
    @org.jetbrains.annotations.Nullable()
    public final com.vimeo.networking2.RentInteraction getRent() {
        return null;
    }
    
    /**
     * * Information about where and how to report a video.
     */
    @org.jetbrains.annotations.Nullable()
    public final com.vimeo.networking2.BasicInteraction getReport() {
        return null;
    }
    
    @com.vimeo.networking2.annotations.Internal()
    public static void subscription$annotations() {
    }
    
    /**
     * * Subscription information for an On Demand video.
     */
    @org.jetbrains.annotations.Nullable()
    public final com.vimeo.networking2.SubscriptionInteraction getSubscription() {
        return null;
    }
    
    /**
     * * Information about whether this video appears on the authenticated user's Watch Later list.
     */
    @org.jetbrains.annotations.Nullable()
    public final com.vimeo.networking2.WatchLaterInteraction getWatchLater() {
        return null;
    }
    
    public VideoInteractions(@org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "buy")
    com.vimeo.networking2.BuyInteraction buy, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "channel")
    com.vimeo.networking2.BasicInteraction channel, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "like")
    com.vimeo.networking2.LikeInteraction like, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "rent")
    com.vimeo.networking2.RentInteraction rent, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "report")
    com.vimeo.networking2.BasicInteraction report, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "subscribe")
    com.vimeo.networking2.SubscriptionInteraction subscription, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "watchlater")
    com.vimeo.networking2.WatchLaterInteraction watchLater) {
        super();
    }
    
    public VideoInteractions() {
        super();
    }
    
    /**
     * * The buy interaction for a On Demand video.
     */
    @org.jetbrains.annotations.Nullable()
    public final com.vimeo.networking2.BuyInteraction component1() {
        return null;
    }
    
    /**
     * * When a video is referenced by a channel URI, if the user is a moderator of the
     *     * channel, include information about removing the video from the channel.
     */
    @org.jetbrains.annotations.Nullable()
    public final com.vimeo.networking2.BasicInteraction component2() {
        return null;
    }
    
    /**
     * * Information about whether the authenticated user has liked this video.
     */
    @org.jetbrains.annotations.Nullable()
    public final com.vimeo.networking2.LikeInteraction component3() {
        return null;
    }
    
    /**
     * * The Rent interaction for an On Demand video.
     */
    @org.jetbrains.annotations.Nullable()
    public final com.vimeo.networking2.RentInteraction component4() {
        return null;
    }
    
    /**
     * * Information about where and how to report a video.
     */
    @org.jetbrains.annotations.Nullable()
    public final com.vimeo.networking2.BasicInteraction component5() {
        return null;
    }
    
    /**
     * * Subscription information for an On Demand video.
     */
    @org.jetbrains.annotations.Nullable()
    public final com.vimeo.networking2.SubscriptionInteraction component6() {
        return null;
    }
    
    /**
     * * Information about whether this video appears on the authenticated user's Watch Later list.
     */
    @org.jetbrains.annotations.Nullable()
    public final com.vimeo.networking2.WatchLaterInteraction component7() {
        return null;
    }
    
    /**
     * * All action that can be taken on a video.
     */
    @org.jetbrains.annotations.NotNull()
    public final com.vimeo.networking2.VideoInteractions copy(@org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "buy")
    com.vimeo.networking2.BuyInteraction buy, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "channel")
    com.vimeo.networking2.BasicInteraction channel, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "like")
    com.vimeo.networking2.LikeInteraction like, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "rent")
    com.vimeo.networking2.RentInteraction rent, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "report")
    com.vimeo.networking2.BasicInteraction report, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "subscribe")
    com.vimeo.networking2.SubscriptionInteraction subscription, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "watchlater")
    com.vimeo.networking2.WatchLaterInteraction watchLater) {
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