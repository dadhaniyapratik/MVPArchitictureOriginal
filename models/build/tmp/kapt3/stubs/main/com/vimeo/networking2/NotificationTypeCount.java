package com.vimeo.networking2;

import java.lang.System;

/**
 * * This data requires a bearer token with the private scope.
 */
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b>\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u00ad\u0001\u0012\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u0011J\u0010\u00101\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0015J\u0010\u00102\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0015J\u0010\u00103\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0015J\u0010\u00104\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0015J\u0010\u00105\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0015J\u0010\u00106\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0015J\u0010\u00107\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0015J\u0010\u00108\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0015J\u0010\u00109\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0015J\u0010\u0010:\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0015J\u0010\u0010;\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0015J\u0010\u0010<\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0015J\u0010\u0010=\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0015J\u0010\u0010>\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0015J\u00b6\u0001\u0010?\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u000f\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0010\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001\u00a2\u0006\u0002\u0010@J\u0013\u0010A\u001a\u00020B2\b\u0010C\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010D\u001a\u00020\u0003H\u00d6\u0001J\t\u0010E\u001a\u00020FH\u00d6\u0001R \u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\u0010\n\u0002\u0010\u0016\u0012\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R \u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\u0010\n\u0002\u0010\u0016\u0012\u0004\b\u0017\u0010\u0013\u001a\u0004\b\u0018\u0010\u0015R \u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\u0010\n\u0002\u0010\u0016\u0012\u0004\b\u0019\u0010\u0013\u001a\u0004\b\u001a\u0010\u0015R \u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\u0010\n\u0002\u0010\u0016\u0012\u0004\b\u001b\u0010\u0013\u001a\u0004\b\u001c\u0010\u0015R \u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\u0010\n\u0002\u0010\u0016\u0012\u0004\b\u001d\u0010\u0013\u001a\u0004\b\u001e\u0010\u0015R \u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\u0010\n\u0002\u0010\u0016\u0012\u0004\b\u001f\u0010\u0013\u001a\u0004\b \u0010\u0015R \u0010\t\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\u0010\n\u0002\u0010\u0016\u0012\u0004\b!\u0010\u0013\u001a\u0004\b\"\u0010\u0015R \u0010\n\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\u0010\n\u0002\u0010\u0016\u0012\u0004\b#\u0010\u0013\u001a\u0004\b$\u0010\u0015R \u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\u0010\n\u0002\u0010\u0016\u0012\u0004\b%\u0010\u0013\u001a\u0004\b&\u0010\u0015R \u0010\f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\u0010\n\u0002\u0010\u0016\u0012\u0004\b\'\u0010\u0013\u001a\u0004\b(\u0010\u0015R \u0010\r\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\u0010\n\u0002\u0010\u0016\u0012\u0004\b)\u0010\u0013\u001a\u0004\b*\u0010\u0015R \u0010\u000e\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\u0010\n\u0002\u0010\u0016\u0012\u0004\b+\u0010\u0013\u001a\u0004\b,\u0010\u0015R \u0010\u000f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\u0010\n\u0002\u0010\u0016\u0012\u0004\b-\u0010\u0013\u001a\u0004\b.\u0010\u0015R \u0010\u0010\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\u0010\n\u0002\u0010\u0016\u0012\u0004\b/\u0010\u0013\u001a\u0004\b0\u0010\u0015\u00a8\u0006G"}, d2 = {"Lcom/vimeo/networking2/NotificationTypeCount;", "", "accountExpirationWarningTotal", "", "comment", "credit", "follow", "followedUserVideoAvailable", "like", "mention", "reply", "share", "storageWarning", "videoAvailable", "vodPreorderAvailable", "vodPurchase", "vodRentalExpirationWarning", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V", "accountExpirationWarningTotal$annotations", "()V", "getAccountExpirationWarningTotal", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "comment$annotations", "getComment", "credit$annotations", "getCredit", "follow$annotations", "getFollow", "followedUserVideoAvailable$annotations", "getFollowedUserVideoAvailable", "like$annotations", "getLike", "mention$annotations", "getMention", "reply$annotations", "getReply", "share$annotations", "getShare", "storageWarning$annotations", "getStorageWarning", "videoAvailable$annotations", "getVideoAvailable", "vodPreorderAvailable$annotations", "getVodPreorderAvailable", "vodPurchase$annotations", "getVodPurchase", "vodRentalExpirationWarning$annotations", "getVodRentalExpirationWarning", "component1", "component10", "component11", "component12", "component13", "component14", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)Lcom/vimeo/networking2/NotificationTypeCount;", "equals", "", "other", "hashCode", "toString", "", "models"})
@com.squareup.moshi.JsonClass(generateAdapter = true)
@com.vimeo.networking2.annotations.Internal()
public final class NotificationTypeCount {
    
    /**
     * * The user's Plus or PRO account is about to expire.
     */
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Integer accountExpirationWarningTotal = null;
    
    /**
     * * There are new comments on a video.
     */
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Integer comment = null;
    
    /**
     * * The user has been added to the credits of a video.
     */
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Integer credit = null;
    
    /**
     * * A user has followed the current user.
     */
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Integer follow = null;
    
    /**
     * * Someone who the user follows has uploaded a new video.
     */
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Integer followedUserVideoAvailable = null;
    
    /**
     * * There are new likes on the user's videos.
     */
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Integer like = null;
    
    /**
     * * The user has been at-mentioned in a comment.
     */
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Integer mention = null;
    
    /**
     * * A comment by the usert has received a new reply.
     */
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Integer reply = null;
    
    /**
     * * Someone has shared a video with the user.
     */
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Integer share = null;
    
    /**
     * * The user is approaching their weekly storage limit.
     */
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Integer storageWarning = null;
    
    /**
     * * The transcode is complete for the user's uploaded video, and the video has now been posted.
     */
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Integer videoAvailable = null;
    
    /**
     * * The user's preordered VOD is now available.
     */
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Integer vodPreorderAvailable = null;
    
    /**
     * * The user has purchased VOD.
     */
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Integer vodPurchase = null;
    
    /**
     * * The user's VOD rental is about to expire.
     */
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Integer vodRentalExpirationWarning = null;
    
    @com.vimeo.networking2.annotations.Internal()
    public static void accountExpirationWarningTotal$annotations() {
    }
    
    /**
     * * The user's Plus or PRO account is about to expire.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getAccountExpirationWarningTotal() {
        return null;
    }
    
    @com.vimeo.networking2.annotations.Internal()
    public static void comment$annotations() {
    }
    
    /**
     * * There are new comments on a video.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getComment() {
        return null;
    }
    
    @com.vimeo.networking2.annotations.Internal()
    public static void credit$annotations() {
    }
    
    /**
     * * The user has been added to the credits of a video.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getCredit() {
        return null;
    }
    
    @com.vimeo.networking2.annotations.Internal()
    public static void follow$annotations() {
    }
    
    /**
     * * A user has followed the current user.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getFollow() {
        return null;
    }
    
    @com.vimeo.networking2.annotations.Internal()
    public static void followedUserVideoAvailable$annotations() {
    }
    
    /**
     * * Someone who the user follows has uploaded a new video.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getFollowedUserVideoAvailable() {
        return null;
    }
    
    @com.vimeo.networking2.annotations.Internal()
    public static void like$annotations() {
    }
    
    /**
     * * There are new likes on the user's videos.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getLike() {
        return null;
    }
    
    @com.vimeo.networking2.annotations.Internal()
    public static void mention$annotations() {
    }
    
    /**
     * * The user has been at-mentioned in a comment.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getMention() {
        return null;
    }
    
    @com.vimeo.networking2.annotations.Internal()
    public static void reply$annotations() {
    }
    
    /**
     * * A comment by the usert has received a new reply.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getReply() {
        return null;
    }
    
    @com.vimeo.networking2.annotations.Internal()
    public static void share$annotations() {
    }
    
    /**
     * * Someone has shared a video with the user.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getShare() {
        return null;
    }
    
    @com.vimeo.networking2.annotations.Internal()
    public static void storageWarning$annotations() {
    }
    
    /**
     * * The user is approaching their weekly storage limit.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getStorageWarning() {
        return null;
    }
    
    @com.vimeo.networking2.annotations.Internal()
    public static void videoAvailable$annotations() {
    }
    
    /**
     * * The transcode is complete for the user's uploaded video, and the video has now been posted.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getVideoAvailable() {
        return null;
    }
    
    @com.vimeo.networking2.annotations.Internal()
    public static void vodPreorderAvailable$annotations() {
    }
    
    /**
     * * The user's preordered VOD is now available.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getVodPreorderAvailable() {
        return null;
    }
    
    @com.vimeo.networking2.annotations.Internal()
    public static void vodPurchase$annotations() {
    }
    
    /**
     * * The user has purchased VOD.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getVodPurchase() {
        return null;
    }
    
    @com.vimeo.networking2.annotations.Internal()
    public static void vodRentalExpirationWarning$annotations() {
    }
    
    /**
     * * The user's VOD rental is about to expire.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getVodRentalExpirationWarning() {
        return null;
    }
    
    public NotificationTypeCount(@org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "account_expiration_warning")
    java.lang.Integer accountExpirationWarningTotal, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "comment")
    java.lang.Integer comment, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "credit")
    java.lang.Integer credit, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "follow")
    java.lang.Integer follow, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "followed_user_video_available")
    java.lang.Integer followedUserVideoAvailable, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "like")
    java.lang.Integer like, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "mention")
    java.lang.Integer mention, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "reply")
    java.lang.Integer reply, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "share")
    java.lang.Integer share, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "storage_warning")
    java.lang.Integer storageWarning, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "video_available")
    java.lang.Integer videoAvailable, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "vod_preorder_available")
    java.lang.Integer vodPreorderAvailable, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "vod_purchase")
    java.lang.Integer vodPurchase, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "vod_rental_expiration_warning")
    java.lang.Integer vodRentalExpirationWarning) {
        super();
    }
    
    public NotificationTypeCount() {
        super();
    }
    
    /**
     * * The user's Plus or PRO account is about to expire.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component1() {
        return null;
    }
    
    /**
     * * There are new comments on a video.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component2() {
        return null;
    }
    
    /**
     * * The user has been added to the credits of a video.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component3() {
        return null;
    }
    
    /**
     * * A user has followed the current user.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component4() {
        return null;
    }
    
    /**
     * * Someone who the user follows has uploaded a new video.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component5() {
        return null;
    }
    
    /**
     * * There are new likes on the user's videos.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component6() {
        return null;
    }
    
    /**
     * * The user has been at-mentioned in a comment.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component7() {
        return null;
    }
    
    /**
     * * A comment by the usert has received a new reply.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component8() {
        return null;
    }
    
    /**
     * * Someone has shared a video with the user.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component9() {
        return null;
    }
    
    /**
     * * The user is approaching their weekly storage limit.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component10() {
        return null;
    }
    
    /**
     * * The transcode is complete for the user's uploaded video, and the video has now been posted.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component11() {
        return null;
    }
    
    /**
     * * The user's preordered VOD is now available.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component12() {
        return null;
    }
    
    /**
     * * The user has purchased VOD.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component13() {
        return null;
    }
    
    /**
     * * The user's VOD rental is about to expire.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component14() {
        return null;
    }
    
    /**
     * * This data requires a bearer token with the private scope.
     */
    @org.jetbrains.annotations.NotNull()
    public final com.vimeo.networking2.NotificationTypeCount copy(@org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "account_expiration_warning")
    java.lang.Integer accountExpirationWarningTotal, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "comment")
    java.lang.Integer comment, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "credit")
    java.lang.Integer credit, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "follow")
    java.lang.Integer follow, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "followed_user_video_available")
    java.lang.Integer followedUserVideoAvailable, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "like")
    java.lang.Integer like, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "mention")
    java.lang.Integer mention, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "reply")
    java.lang.Integer reply, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "share")
    java.lang.Integer share, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "storage_warning")
    java.lang.Integer storageWarning, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "video_available")
    java.lang.Integer videoAvailable, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "vod_preorder_available")
    java.lang.Integer vodPreorderAvailable, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "vod_purchase")
    java.lang.Integer vodPurchase, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "vod_rental_expiration_warning")
    java.lang.Integer vodRentalExpirationWarning) {
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