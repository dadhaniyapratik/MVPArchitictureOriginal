package com.vimeo.networking2;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0016\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BA\u0012\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\tJ\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u000bJ\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u000bJ\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003JJ\u0010\u0017\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u0005H\u00c6\u0001\u00a2\u0006\u0002\u0010\u0018J\u0013\u0010\u0019\u001a\u00020\u00032\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001b\u001a\u00020\u001cH\u00d6\u0001J\t\u0010\u001d\u001a\u00020\u0005H\u00d6\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010\f\u001a\u0004\b\u000f\u0010\u000bR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000e\u00a8\u0006\u001e"}, d2 = {"Lcom/vimeo/networking2/Privacy;", "", "add", "", "commentPrivacy", "", "download", "embedPrivacy", "viewPrivacy", "(Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;)V", "getAdd", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getCommentPrivacy", "()Ljava/lang/String;", "getDownload", "getEmbedPrivacy", "getViewPrivacy", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;)Lcom/vimeo/networking2/Privacy;", "equals", "other", "hashCode", "", "toString", "models"})
@com.squareup.moshi.JsonClass(generateAdapter = true)
public final class Privacy {
    
    /**
     * * Whether other users can add the user's videos.
     */
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Boolean add = null;
    
    /**
     * * The user's privacy preference for comments.
     *     * @see Privacy.commentPrivacyType
     */
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String commentPrivacy = null;
    
    /**
     * * Whether other users can download the user's videos.
     */
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Boolean download = null;
    
    /**
     * * The user's privacy preference for embeds.
     *     * @see Privacy.embedPrivacyType
     */
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String embedPrivacy = null;
    
    /**
     * * The privacy settings of the channel.
     *     * @see Privacy.viewPrivacyType
     */
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String viewPrivacy = null;
    
    /**
     * * Whether other users can add the user's videos.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean getAdd() {
        return null;
    }
    
    /**
     * * The user's privacy preference for comments.
     *     * @see Privacy.commentPrivacyType
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getCommentPrivacy() {
        return null;
    }
    
    /**
     * * Whether other users can download the user's videos.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean getDownload() {
        return null;
    }
    
    /**
     * * The user's privacy preference for embeds.
     *     * @see Privacy.embedPrivacyType
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getEmbedPrivacy() {
        return null;
    }
    
    /**
     * * The privacy settings of the channel.
     *     * @see Privacy.viewPrivacyType
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getViewPrivacy() {
        return null;
    }
    
    public Privacy(@org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "add")
    java.lang.Boolean add, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "comments")
    java.lang.String commentPrivacy, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "download")
    java.lang.Boolean download, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "embed")
    java.lang.String embedPrivacy, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "view")
    java.lang.String viewPrivacy) {
        super();
    }
    
    public Privacy() {
        super();
    }
    
    /**
     * * Whether other users can add the user's videos.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean component1() {
        return null;
    }
    
    /**
     * * The user's privacy preference for comments.
     *     * @see Privacy.commentPrivacyType
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component2() {
        return null;
    }
    
    /**
     * * Whether other users can download the user's videos.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean component3() {
        return null;
    }
    
    /**
     * * The user's privacy preference for embeds.
     *     * @see Privacy.embedPrivacyType
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component4() {
        return null;
    }
    
    /**
     * * The privacy settings of the channel.
     *     * @see Privacy.viewPrivacyType
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component5() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.vimeo.networking2.Privacy copy(@org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "add")
    java.lang.Boolean add, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "comments")
    java.lang.String commentPrivacy, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "download")
    java.lang.Boolean download, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "embed")
    java.lang.String embedPrivacy, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "view")
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