package com.vimeo.networking2;

import java.lang.System;

/**
 * * All action that can be taken on a channel.
 */
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\bJ\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J9\u0010\u0013\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u00d6\u0003J\t\u0010\u0018\u001a\u00020\u0019H\u00d6\u0001J\t\u0010\u001a\u001a\u00020\u001bH\u00d6\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\n\u00a8\u0006\u001c"}, d2 = {"Lcom/vimeo/networking2/ChannelInteractions;", "Lcom/vimeo/networking2/common/FollowableInteractions;", "addModerators", "Lcom/vimeo/networking2/BasicInteraction;", "addTo", "follow", "Lcom/vimeo/networking2/ChannelFollowInteraction;", "moderateVideos", "(Lcom/vimeo/networking2/BasicInteraction;Lcom/vimeo/networking2/BasicInteraction;Lcom/vimeo/networking2/ChannelFollowInteraction;Lcom/vimeo/networking2/BasicInteraction;)V", "getAddModerators", "()Lcom/vimeo/networking2/BasicInteraction;", "getAddTo", "getFollow", "()Lcom/vimeo/networking2/ChannelFollowInteraction;", "getModerateVideos", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "models"})
@com.squareup.moshi.JsonClass(generateAdapter = true)
public final class ChannelInteractions implements com.vimeo.networking2.common.FollowableInteractions {
    
    /**
     * * An action indicating that the authenticated user is the owner of the channel and may
     *     * therefore add other users as channel moderators. This data requires a bearer token with
     *     * the private scope.
     */
    @org.jetbrains.annotations.Nullable()
    private final com.vimeo.networking2.BasicInteraction addModerators = null;
    
    /**
     * * When a channel appears in the context of adding or removing a video from it
     *     * (/videos/{video_id}/available_channels), include information about adding or removing
     *     * the video. This data requires a bearer token with the private scope.
     */
    @org.jetbrains.annotations.Nullable()
    private final com.vimeo.networking2.BasicInteraction addTo = null;
    
    /**
     * * An action indicating if the authenticated user has followed this channel.
     *     * This data requires a bearer token with the private scope.
     */
    @org.jetbrains.annotations.Nullable()
    private final com.vimeo.networking2.ChannelFollowInteraction follow = null;
    
    /**
     * * An action indicating that the authenticated user is a moderator of the channel and may
     *     * therefore add or remove videos from the channel. This data requires a bearer token with
     *     * the private scope.
     */
    @org.jetbrains.annotations.Nullable()
    private final com.vimeo.networking2.BasicInteraction moderateVideos = null;
    
    /**
     * * An action indicating that the authenticated user is the owner of the channel and may
     *     * therefore add other users as channel moderators. This data requires a bearer token with
     *     * the private scope.
     */
    @org.jetbrains.annotations.Nullable()
    public final com.vimeo.networking2.BasicInteraction getAddModerators() {
        return null;
    }
    
    /**
     * * When a channel appears in the context of adding or removing a video from it
     *     * (/videos/{video_id}/available_channels), include information about adding or removing
     *     * the video. This data requires a bearer token with the private scope.
     */
    @org.jetbrains.annotations.Nullable()
    public final com.vimeo.networking2.BasicInteraction getAddTo() {
        return null;
    }
    
    /**
     * * An action indicating if the authenticated user has followed this channel.
     *     * This data requires a bearer token with the private scope.
     */
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public com.vimeo.networking2.ChannelFollowInteraction getFollow() {
        return null;
    }
    
    /**
     * * An action indicating that the authenticated user is a moderator of the channel and may
     *     * therefore add or remove videos from the channel. This data requires a bearer token with
     *     * the private scope.
     */
    @org.jetbrains.annotations.Nullable()
    public final com.vimeo.networking2.BasicInteraction getModerateVideos() {
        return null;
    }
    
    public ChannelInteractions(@org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "add_moderators")
    com.vimeo.networking2.BasicInteraction addModerators, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "add_to")
    com.vimeo.networking2.BasicInteraction addTo, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "follow")
    com.vimeo.networking2.ChannelFollowInteraction follow, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "moderate_videos")
    com.vimeo.networking2.BasicInteraction moderateVideos) {
        super();
    }
    
    public ChannelInteractions() {
        super();
    }
    
    /**
     * * An action indicating that the authenticated user is the owner of the channel and may
     *     * therefore add other users as channel moderators. This data requires a bearer token with
     *     * the private scope.
     */
    @org.jetbrains.annotations.Nullable()
    public final com.vimeo.networking2.BasicInteraction component1() {
        return null;
    }
    
    /**
     * * When a channel appears in the context of adding or removing a video from it
     *     * (/videos/{video_id}/available_channels), include information about adding or removing
     *     * the video. This data requires a bearer token with the private scope.
     */
    @org.jetbrains.annotations.Nullable()
    public final com.vimeo.networking2.BasicInteraction component2() {
        return null;
    }
    
    /**
     * * An action indicating if the authenticated user has followed this channel.
     *     * This data requires a bearer token with the private scope.
     */
    @org.jetbrains.annotations.Nullable()
    public final com.vimeo.networking2.ChannelFollowInteraction component3() {
        return null;
    }
    
    /**
     * * An action indicating that the authenticated user is a moderator of the channel and may
     *     * therefore add or remove videos from the channel. This data requires a bearer token with
     *     * the private scope.
     */
    @org.jetbrains.annotations.Nullable()
    public final com.vimeo.networking2.BasicInteraction component4() {
        return null;
    }
    
    /**
     * * All action that can be taken on a channel.
     */
    @org.jetbrains.annotations.NotNull()
    public final com.vimeo.networking2.ChannelInteractions copy(@org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "add_moderators")
    com.vimeo.networking2.BasicInteraction addModerators, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "add_to")
    com.vimeo.networking2.BasicInteraction addTo, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "follow")
    com.vimeo.networking2.ChannelFollowInteraction follow, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "moderate_videos")
    com.vimeo.networking2.BasicInteraction moderateVideos) {
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