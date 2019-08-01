package com.vimeo.networking2;

import java.lang.System;

/**
 * * A model that holds the type of push subscriptions a user has.
 */
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001a\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001BK\u0012\b\b\u0003\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0003\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0003\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0003\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0003\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0003\u0010\b\u001a\u00020\u0003\u0012\b\b\u0003\u0010\t\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\nJ\t\u0010\u0013\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0014\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0015\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0016\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0017\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0018\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0019\u001a\u00020\u0003H\u00c6\u0003JO\u0010\u001a\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u00032\b\b\u0003\u0010\u0006\u001a\u00020\u00032\b\b\u0003\u0010\u0007\u001a\u00020\u00032\b\b\u0003\u0010\b\u001a\u00020\u00032\b\b\u0003\u0010\t\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\u001b\u001a\u00020\u00032\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001d\u001a\u00020\u001eH\u00d6\u0001J\t\u0010\u001f\u001a\u00020 H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0007\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0011\u0010\t\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\fR\u0011\u0010\b\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\f\u00a8\u0006!"}, d2 = {"Lcom/vimeo/networking2/Subscriptions;", "", "comment", "", "credit", "like", "reply", "follow", "videoAvailable", "followedUserVideoAvailable", "(ZZZZZZZ)V", "getComment", "()Z", "getCredit", "getFollow", "getFollowedUserVideoAvailable", "getLike", "getReply", "getVideoAvailable", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "hashCode", "", "toString", "", "models"})
@com.squareup.moshi.JsonClass(generateAdapter = true)
public final class Subscriptions {
    
    /**
     * * The "new comments on your video" setting.
     */
    private final boolean comment = false;
    
    /**
     * * The "you are added to the credits of a video".
     */
    private final boolean credit = false;
    
    /**
     * * The "new likes on your videos" setting.
     */
    private final boolean like = false;
    
    /**
     * * The "new reply to your comment" setting.
     */
    private final boolean reply = false;
    
    /**
     * * The "a user follows you" setting.
     */
    private final boolean follow = false;
    
    /**
     * * The "new upload transcode complete (new video is posted)" setting.
     */
    private final boolean videoAvailable = false;
    
    /**
     * * The "someone you follow uploaded a new item" setting.
     */
    private final boolean followedUserVideoAvailable = false;
    
    /**
     * * The "new comments on your video" setting.
     */
    public final boolean getComment() {
        return false;
    }
    
    /**
     * * The "you are added to the credits of a video".
     */
    public final boolean getCredit() {
        return false;
    }
    
    /**
     * * The "new likes on your videos" setting.
     */
    public final boolean getLike() {
        return false;
    }
    
    /**
     * * The "new reply to your comment" setting.
     */
    public final boolean getReply() {
        return false;
    }
    
    /**
     * * The "a user follows you" setting.
     */
    public final boolean getFollow() {
        return false;
    }
    
    /**
     * * The "new upload transcode complete (new video is posted)" setting.
     */
    public final boolean getVideoAvailable() {
        return false;
    }
    
    /**
     * * The "someone you follow uploaded a new item" setting.
     */
    public final boolean getFollowedUserVideoAvailable() {
        return false;
    }
    
    public Subscriptions(@com.squareup.moshi.Json(name = "comment")
    boolean comment, @com.squareup.moshi.Json(name = "credit")
    boolean credit, @com.squareup.moshi.Json(name = "like")
    boolean like, @com.squareup.moshi.Json(name = "reply")
    boolean reply, @com.squareup.moshi.Json(name = "follow")
    boolean follow, @com.squareup.moshi.Json(name = "video_available")
    boolean videoAvailable, @com.squareup.moshi.Json(name = "followed_user_video_available")
    boolean followedUserVideoAvailable) {
        super();
    }
    
    public Subscriptions() {
        super();
    }
    
    /**
     * * The "new comments on your video" setting.
     */
    public final boolean component1() {
        return false;
    }
    
    /**
     * * The "you are added to the credits of a video".
     */
    public final boolean component2() {
        return false;
    }
    
    /**
     * * The "new likes on your videos" setting.
     */
    public final boolean component3() {
        return false;
    }
    
    /**
     * * The "new reply to your comment" setting.
     */
    public final boolean component4() {
        return false;
    }
    
    /**
     * * The "a user follows you" setting.
     */
    public final boolean component5() {
        return false;
    }
    
    /**
     * * The "new upload transcode complete (new video is posted)" setting.
     */
    public final boolean component6() {
        return false;
    }
    
    /**
     * * The "someone you follow uploaded a new item" setting.
     */
    public final boolean component7() {
        return false;
    }
    
    /**
     * * A model that holds the type of push subscriptions a user has.
     */
    @org.jetbrains.annotations.NotNull()
    public final com.vimeo.networking2.Subscriptions copy(@com.squareup.moshi.Json(name = "comment")
    boolean comment, @com.squareup.moshi.Json(name = "credit")
    boolean credit, @com.squareup.moshi.Json(name = "like")
    boolean like, @com.squareup.moshi.Json(name = "reply")
    boolean reply, @com.squareup.moshi.Json(name = "follow")
    boolean follow, @com.squareup.moshi.Json(name = "video_available")
    boolean videoAvailable, @com.squareup.moshi.Json(name = "followed_user_video_available")
    boolean followedUserVideoAvailable) {
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