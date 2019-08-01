package com.vimeo.networking2;

import java.lang.System;

/**
 * * User information.
 */
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b2\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B\u00ef\u0001\u0012\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\u0010\b\u0003\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0006\u0012\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\u0010\b\u0003\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0006\u0012\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0003\u0010\u000f\u001a\u0004\u0018\u00010\u0004\u0012\u0016\b\u0003\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0011\u0012\n\b\u0003\u0010\u0014\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0003\u0010\u0015\u001a\u0004\u0018\u00010\u0016\u0012\n\b\u0003\u0010\u0017\u001a\u0004\u0018\u00010\u0018\u0012\n\b\u0003\u0010\u0019\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0003\u0010\u001a\u001a\u0004\u0018\u00010\u001b\u0012\n\b\u0003\u0010\u001c\u001a\u0004\u0018\u00010\u0004\u0012\u0010\b\u0003\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u001e\u0018\u00010\u0006\u0012\n\b\u0003\u0010\u001f\u001a\u0004\u0018\u00010 \u00a2\u0006\u0002\u0010!J\u000b\u0010@\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003J\u000b\u0010A\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003J\u000b\u0010B\u001a\u0004\u0018\u00010\u0016H\u00c6\u0003J\u000b\u0010C\u001a\u0004\u0018\u00010\u0018H\u00c6\u0003J\u000b\u0010D\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003J\u000b\u0010E\u001a\u0004\u0018\u00010\u001bH\u00c6\u0003J\u000b\u0010F\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003J\u0011\u0010G\u001a\n\u0012\u0004\u0012\u00020\u001e\u0018\u00010\u0006H\u00c6\u0003J\u000b\u0010H\u001a\u0004\u0018\u00010 H\u00c6\u0003J\u0011\u0010I\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0006H\u00c6\u0003J\u000b\u0010J\u001a\u0004\u0018\u00010\bH\u00c6\u0003J\u000b\u0010K\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003J\u0011\u0010L\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0006H\u00c6\u0003J\u000b\u0010M\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003J\u000b\u0010N\u001a\u0004\u0018\u00010\u000eH\u00c6\u0003J\u000b\u0010O\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003J\u0017\u0010P\u001a\u0010\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0011H\u00c6\u0003J\u00f3\u0001\u0010Q\u001a\u00020\u00002\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0010\b\u0003\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00062\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u00042\u0010\b\u0003\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u00062\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\u00042\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0003\u0010\u000f\u001a\u0004\u0018\u00010\u00042\u0016\b\u0003\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u00112\n\b\u0003\u0010\u0014\u001a\u0004\u0018\u00010\u00042\n\b\u0003\u0010\u0015\u001a\u0004\u0018\u00010\u00162\n\b\u0003\u0010\u0017\u001a\u0004\u0018\u00010\u00182\n\b\u0003\u0010\u0019\u001a\u0004\u0018\u00010\u00042\n\b\u0003\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\n\b\u0003\u0010\u001c\u001a\u0004\u0018\u00010\u00042\u0010\b\u0003\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u001e\u0018\u00010\u00062\n\b\u0003\u0010\u001f\u001a\u0004\u0018\u00010 H\u00c6\u0001J\u0013\u0010R\u001a\u00020S2\b\u0010T\u001a\u0004\u0018\u00010UH\u00d6\u0003J\t\u0010V\u001a\u00020WH\u00d6\u0001J\t\u0010X\u001a\u00020\u0004H\u00d6\u0001R\u0013\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0019\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b\u00a2\u0006\b\n\u0000\u001a\u0004\b&\u0010\'R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b(\u0010#R$\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u00068\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\b)\u0010*\u001a\u0004\b+\u0010%R\u0016\u0010,\u001a\u0004\u0018\u00010\u0004X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b-\u0010#R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b.\u0010#R\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b/\u00100R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b1\u0010#R\u0013\u0010\u001f\u001a\u0004\u0018\u00010 \u00a2\u0006\b\n\u0000\u001a\u0004\b2\u00103R\"\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0011X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b4\u00105R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b6\u0010#R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u0016\u00a2\u0006\b\n\u0000\u001a\u0004\b7\u00108R\u0013\u0010\u0017\u001a\u0004\u0018\u00010\u0018\u00a2\u0006\b\n\u0000\u001a\u0004\b9\u0010:R\u0013\u0010\u0019\u001a\u0004\u0018\u00010\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b;\u0010#R\u0013\u0010\u001a\u001a\u0004\u0018\u00010\u001b\u00a2\u0006\b\n\u0000\u001a\u0004\b<\u0010=R\u0013\u0010\u001c\u001a\u0004\u0018\u00010\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b>\u0010#R\u0019\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u001e\u0018\u00010\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b?\u0010%\u00a8\u0006Y"}, d2 = {"Lcom/vimeo/networking2/User;", "Lcom/vimeo/networking2/common/Followable;", "Lcom/vimeo/networking2/common/Entity;", "bio", "", "contentFilters", "", "createdTime", "Ljava/util/Date;", "email", "emails", "Lcom/vimeo/networking2/Email;", "link", "liveQuota", "Lcom/vimeo/networking2/LiveQuota;", "location", "metadata", "Lcom/vimeo/networking2/Metadata;", "Lcom/vimeo/networking2/UserConnections;", "Lcom/vimeo/networking2/UserInteractions;", "name", "pictures", "Lcom/vimeo/networking2/PictureCollection;", "preferences", "Lcom/vimeo/networking2/Preferences;", "resourceKey", "uploadQuota", "Lcom/vimeo/networking2/UploadQuota;", "uri", "websites", "Lcom/vimeo/networking2/Website;", "membership", "Lcom/vimeo/networking2/Membership;", "(Ljava/lang/String;Ljava/util/List;Ljava/util/Date;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lcom/vimeo/networking2/LiveQuota;Ljava/lang/String;Lcom/vimeo/networking2/Metadata;Ljava/lang/String;Lcom/vimeo/networking2/PictureCollection;Lcom/vimeo/networking2/Preferences;Ljava/lang/String;Lcom/vimeo/networking2/UploadQuota;Ljava/lang/String;Ljava/util/List;Lcom/vimeo/networking2/Membership;)V", "getBio", "()Ljava/lang/String;", "getContentFilters", "()Ljava/util/List;", "getCreatedTime", "()Ljava/util/Date;", "getEmail", "emails$annotations", "()V", "getEmails", "identifier", "getIdentifier", "getLink", "getLiveQuota", "()Lcom/vimeo/networking2/LiveQuota;", "getLocation", "getMembership", "()Lcom/vimeo/networking2/Membership;", "getMetadata", "()Lcom/vimeo/networking2/Metadata;", "getName", "getPictures", "()Lcom/vimeo/networking2/PictureCollection;", "getPreferences", "()Lcom/vimeo/networking2/Preferences;", "getResourceKey", "getUploadQuota", "()Lcom/vimeo/networking2/UploadQuota;", "getUri", "getWebsites", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "", "hashCode", "", "toString", "models"})
@com.squareup.moshi.JsonClass(generateAdapter = true)
public final class User implements com.vimeo.networking2.common.Followable, com.vimeo.networking2.common.Entity {
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String identifier = null;
    
    /**
     * * The user's bio.
     */
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String bio = null;
    
    /**
     * * The user's content filters.
     *     * @see User.contentFilterTypes
     */
    @org.jetbrains.annotations.Nullable()
    private final java.util.List<java.lang.String> contentFilters = null;
    
    /**
     * * The time in ISO 8601 format when the user account was created.
     */
    @org.jetbrains.annotations.Nullable()
    private final java.util.Date createdTime = null;
    
    /**
     * * The user's email address.
     */
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String email = null;
    
    /**
     * * An array of alternate emails for the user.
     */
    @org.jetbrains.annotations.Nullable()
    private final java.util.List<com.vimeo.networking2.Email> emails = null;
    
    /**
     * * The absolute URL of this user's profile page.
     */
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String link = null;
    
    /**
     * * Information about the user's live streaming quota.
     */
    @org.jetbrains.annotations.Nullable()
    private final com.vimeo.networking2.LiveQuota liveQuota = null;
    
    /**
     * * The user's location.
     */
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String location = null;
    
    /**
     * * The user's metadata.
     */
    @org.jetbrains.annotations.Nullable()
    private final com.vimeo.networking2.Metadata<com.vimeo.networking2.UserConnections, com.vimeo.networking2.UserInteractions> metadata = null;
    
    /**
     * * The user's display name.
     */
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String name = null;
    
    /**
     * * The active portrait of this user.
     */
    @org.jetbrains.annotations.Nullable()
    private final com.vimeo.networking2.PictureCollection pictures = null;
    
    /**
     * * User's preferences.
     */
    @org.jetbrains.annotations.Nullable()
    private final com.vimeo.networking2.Preferences preferences = null;
    
    /**
     * * The user's resource key string.
     */
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String resourceKey = null;
    
    /**
     * * Appears only when the user has upload access and is looking at their own user record.
     */
    @org.jetbrains.annotations.Nullable()
    private final com.vimeo.networking2.UploadQuota uploadQuota = null;
    
    /**
     * * The user's canonical relative URI.
     */
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String uri = null;
    
    /**
     * * The user's websites.
     */
    @org.jetbrains.annotations.Nullable()
    private final java.util.List<com.vimeo.networking2.Website> websites = null;
    
    /**
     * * The user's membership.
     */
    @org.jetbrains.annotations.Nullable()
    private final com.vimeo.networking2.Membership membership = null;
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.String getIdentifier() {
        return null;
    }
    
    /**
     * * The user's bio.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getBio() {
        return null;
    }
    
    /**
     * * The user's content filters.
     *     * @see User.contentFilterTypes
     */
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<java.lang.String> getContentFilters() {
        return null;
    }
    
    /**
     * * The time in ISO 8601 format when the user account was created.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.util.Date getCreatedTime() {
        return null;
    }
    
    /**
     * * The user's email address.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getEmail() {
        return null;
    }
    
    @com.vimeo.networking2.annotations.Internal()
    public static void emails$annotations() {
    }
    
    /**
     * * An array of alternate emails for the user.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.vimeo.networking2.Email> getEmails() {
        return null;
    }
    
    /**
     * * The absolute URL of this user's profile page.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getLink() {
        return null;
    }
    
    /**
     * * Information about the user's live streaming quota.
     */
    @org.jetbrains.annotations.Nullable()
    public final com.vimeo.networking2.LiveQuota getLiveQuota() {
        return null;
    }
    
    /**
     * * The user's location.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getLocation() {
        return null;
    }
    
    /**
     * * The user's metadata.
     */
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public com.vimeo.networking2.Metadata<com.vimeo.networking2.UserConnections, com.vimeo.networking2.UserInteractions> getMetadata() {
        return null;
    }
    
    /**
     * * The user's display name.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getName() {
        return null;
    }
    
    /**
     * * The active portrait of this user.
     */
    @org.jetbrains.annotations.Nullable()
    public final com.vimeo.networking2.PictureCollection getPictures() {
        return null;
    }
    
    /**
     * * User's preferences.
     */
    @org.jetbrains.annotations.Nullable()
    public final com.vimeo.networking2.Preferences getPreferences() {
        return null;
    }
    
    /**
     * * The user's resource key string.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getResourceKey() {
        return null;
    }
    
    /**
     * * Appears only when the user has upload access and is looking at their own user record.
     */
    @org.jetbrains.annotations.Nullable()
    public final com.vimeo.networking2.UploadQuota getUploadQuota() {
        return null;
    }
    
    /**
     * * The user's canonical relative URI.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getUri() {
        return null;
    }
    
    /**
     * * The user's websites.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.vimeo.networking2.Website> getWebsites() {
        return null;
    }
    
    /**
     * * The user's membership.
     */
    @org.jetbrains.annotations.Nullable()
    public final com.vimeo.networking2.Membership getMembership() {
        return null;
    }
    
    public User(@org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "bio")
    java.lang.String bio, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "content_filter")
    java.util.List<java.lang.String> contentFilters, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "created_time")
    java.util.Date createdTime, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "email")
    java.lang.String email, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "emails")
    java.util.List<com.vimeo.networking2.Email> emails, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "link")
    java.lang.String link, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "live_quota")
    com.vimeo.networking2.LiveQuota liveQuota, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "location")
    java.lang.String location, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "metadata")
    com.vimeo.networking2.Metadata<com.vimeo.networking2.UserConnections, com.vimeo.networking2.UserInteractions> metadata, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "name")
    java.lang.String name, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "pictures")
    com.vimeo.networking2.PictureCollection pictures, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "preferences")
    com.vimeo.networking2.Preferences preferences, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "resource_key")
    java.lang.String resourceKey, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "upload_quota")
    com.vimeo.networking2.UploadQuota uploadQuota, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "uri")
    java.lang.String uri, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "websites")
    java.util.List<com.vimeo.networking2.Website> websites, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "membership")
    com.vimeo.networking2.Membership membership) {
        super();
    }
    
    public User() {
        super();
    }
    
    /**
     * * The user's bio.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component1() {
        return null;
    }
    
    /**
     * * The user's content filters.
     *     * @see User.contentFilterTypes
     */
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<java.lang.String> component2() {
        return null;
    }
    
    /**
     * * The time in ISO 8601 format when the user account was created.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.util.Date component3() {
        return null;
    }
    
    /**
     * * The user's email address.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component4() {
        return null;
    }
    
    /**
     * * An array of alternate emails for the user.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.vimeo.networking2.Email> component5() {
        return null;
    }
    
    /**
     * * The absolute URL of this user's profile page.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component6() {
        return null;
    }
    
    /**
     * * Information about the user's live streaming quota.
     */
    @org.jetbrains.annotations.Nullable()
    public final com.vimeo.networking2.LiveQuota component7() {
        return null;
    }
    
    /**
     * * The user's location.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component8() {
        return null;
    }
    
    /**
     * * The user's metadata.
     */
    @org.jetbrains.annotations.Nullable()
    public final com.vimeo.networking2.Metadata<com.vimeo.networking2.UserConnections, com.vimeo.networking2.UserInteractions> component9() {
        return null;
    }
    
    /**
     * * The user's display name.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component10() {
        return null;
    }
    
    /**
     * * The active portrait of this user.
     */
    @org.jetbrains.annotations.Nullable()
    public final com.vimeo.networking2.PictureCollection component11() {
        return null;
    }
    
    /**
     * * User's preferences.
     */
    @org.jetbrains.annotations.Nullable()
    public final com.vimeo.networking2.Preferences component12() {
        return null;
    }
    
    /**
     * * The user's resource key string.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component13() {
        return null;
    }
    
    /**
     * * Appears only when the user has upload access and is looking at their own user record.
     */
    @org.jetbrains.annotations.Nullable()
    public final com.vimeo.networking2.UploadQuota component14() {
        return null;
    }
    
    /**
     * * The user's canonical relative URI.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component15() {
        return null;
    }
    
    /**
     * * The user's websites.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.vimeo.networking2.Website> component16() {
        return null;
    }
    
    /**
     * * The user's membership.
     */
    @org.jetbrains.annotations.Nullable()
    public final com.vimeo.networking2.Membership component17() {
        return null;
    }
    
    /**
     * * User information.
     */
    @org.jetbrains.annotations.NotNull()
    public final com.vimeo.networking2.User copy(@org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "bio")
    java.lang.String bio, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "content_filter")
    java.util.List<java.lang.String> contentFilters, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "created_time")
    java.util.Date createdTime, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "email")
    java.lang.String email, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "emails")
    java.util.List<com.vimeo.networking2.Email> emails, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "link")
    java.lang.String link, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "live_quota")
    com.vimeo.networking2.LiveQuota liveQuota, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "location")
    java.lang.String location, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "metadata")
    com.vimeo.networking2.Metadata<com.vimeo.networking2.UserConnections, com.vimeo.networking2.UserInteractions> metadata, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "name")
    java.lang.String name, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "pictures")
    com.vimeo.networking2.PictureCollection pictures, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "preferences")
    com.vimeo.networking2.Preferences preferences, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "resource_key")
    java.lang.String resourceKey, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "upload_quota")
    com.vimeo.networking2.UploadQuota uploadQuota, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "uri")
    java.lang.String uri, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "websites")
    java.util.List<com.vimeo.networking2.Website> websites, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "membership")
    com.vimeo.networking2.Membership membership) {
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