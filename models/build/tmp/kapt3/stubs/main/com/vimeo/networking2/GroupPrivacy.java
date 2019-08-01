package com.vimeo.networking2;

import java.lang.System;

/**
 * * Group's privacy settings.
 */
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BM\u0012\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\tJ\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003JQ\u0010\u0017\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001b\u001a\u00020\u001cH\u00d6\u0001J\t\u0010\u001d\u001a\u00020\u0003H\u00d6\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000bR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000b\u00a8\u0006\u001e"}, d2 = {"Lcom/vimeo/networking2/GroupPrivacy;", "", "commentPrivacy", "", "forumsPrivacy", "invitePrivacy", "joinPrivacy", "videosPrivacy", "viewPrivacy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCommentPrivacy", "()Ljava/lang/String;", "getForumsPrivacy", "getInvitePrivacy", "getJoinPrivacy", "getVideosPrivacy", "getViewPrivacy", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "models"})
@com.squareup.moshi.JsonClass(generateAdapter = true)
public final class GroupPrivacy {
    
    /**
     * * Who can comment on the group.
     *     * @see GroupPrivacy.commentPrivacyType
     */
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String commentPrivacy = null;
    
    /**
     * * Who is allowed to use forums related to the group.
     *     * @see GroupPrivacy.forumsPrivacyType
     */
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String forumsPrivacy = null;
    
    /**
     * * Who can invite new members to the group.
     *     * @see GroupPrivacy.invitePrivacyType
     */
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String invitePrivacy = null;
    
    /**
     * * Who can join the group.
     *     * @see GroupPrivacy.joinPrivacyType
     */
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String joinPrivacy = null;
    
    /**
     * * Who can add videos to the group.
     *     * @see GroupPrivacy.videosPrivacyType
     */
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String videosPrivacy = null;
    
    /**
     * * Who can view the group.
     *     * @see GroupPrivacy.viewPrivacyType
     */
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String viewPrivacy = null;
    
    /**
     * * Who can comment on the group.
     *     * @see GroupPrivacy.commentPrivacyType
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getCommentPrivacy() {
        return null;
    }
    
    /**
     * * Who is allowed to use forums related to the group.
     *     * @see GroupPrivacy.forumsPrivacyType
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getForumsPrivacy() {
        return null;
    }
    
    /**
     * * Who can invite new members to the group.
     *     * @see GroupPrivacy.invitePrivacyType
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getInvitePrivacy() {
        return null;
    }
    
    /**
     * * Who can join the group.
     *     * @see GroupPrivacy.joinPrivacyType
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getJoinPrivacy() {
        return null;
    }
    
    /**
     * * Who can add videos to the group.
     *     * @see GroupPrivacy.videosPrivacyType
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getVideosPrivacy() {
        return null;
    }
    
    /**
     * * Who can view the group.
     *     * @see GroupPrivacy.viewPrivacyType
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getViewPrivacy() {
        return null;
    }
    
    public GroupPrivacy(@org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "comment")
    java.lang.String commentPrivacy, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "forums")
    java.lang.String forumsPrivacy, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "invite")
    java.lang.String invitePrivacy, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "join")
    java.lang.String joinPrivacy, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "videos")
    java.lang.String videosPrivacy, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "videos")
    java.lang.String viewPrivacy) {
        super();
    }
    
    public GroupPrivacy() {
        super();
    }
    
    /**
     * * Who can comment on the group.
     *     * @see GroupPrivacy.commentPrivacyType
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component1() {
        return null;
    }
    
    /**
     * * Who is allowed to use forums related to the group.
     *     * @see GroupPrivacy.forumsPrivacyType
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component2() {
        return null;
    }
    
    /**
     * * Who can invite new members to the group.
     *     * @see GroupPrivacy.invitePrivacyType
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component3() {
        return null;
    }
    
    /**
     * * Who can join the group.
     *     * @see GroupPrivacy.joinPrivacyType
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component4() {
        return null;
    }
    
    /**
     * * Who can add videos to the group.
     *     * @see GroupPrivacy.videosPrivacyType
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component5() {
        return null;
    }
    
    /**
     * * Who can view the group.
     *     * @see GroupPrivacy.viewPrivacyType
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component6() {
        return null;
    }
    
    /**
     * * Group's privacy settings.
     */
    @org.jetbrains.annotations.NotNull()
    public final com.vimeo.networking2.GroupPrivacy copy(@org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "comment")
    java.lang.String commentPrivacy, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "forums")
    java.lang.String forumsPrivacy, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "invite")
    java.lang.String invitePrivacy, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "join")
    java.lang.String joinPrivacy, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "videos")
    java.lang.String videosPrivacy, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "videos")
    java.lang.String viewPrivacy) {
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