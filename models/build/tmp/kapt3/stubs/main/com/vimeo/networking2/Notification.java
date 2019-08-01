package com.vimeo.networking2;

import java.lang.System;

/**
 * * Notification data.
 */
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b \n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Bq\u0012\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0003\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0003\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u00a2\u0006\u0002\u0010\u0012J\u000b\u0010$\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J\u000b\u0010\'\u001a\u0004\u0018\u00010\tH\u00c6\u0003J\u0010\u0010(\u001a\u0004\u0018\u00010\u000bH\u00c6\u0003\u00a2\u0006\u0002\u0010\u001cJ\u0010\u0010)\u001a\u0004\u0018\u00010\u000bH\u00c6\u0003\u00a2\u0006\u0002\u0010\u001cJ\u000b\u0010*\u001a\u0004\u0018\u00010\u000eH\u00c6\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\u000eH\u00c6\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\u0011H\u00c6\u0003Jz\u0010-\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0003\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\n\b\u0003\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u00c6\u0001\u00a2\u0006\u0002\u0010.J\u0013\u0010/\u001a\u00020\u000b2\b\u00100\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u00101\u001a\u000202H\u00d6\u0001J\t\u00103\u001a\u00020\u000eH\u00d6\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\b\u001a\u0004\u0018\u00010\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0015\u0010\n\u001a\u0004\u0018\u00010\u000b\u00a2\u0006\n\n\u0002\u0010\u001d\u001a\u0004\b\u001b\u0010\u001cR\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0015\u0010\f\u001a\u0004\u0018\u00010\u000b\u00a2\u0006\n\n\u0002\u0010\u001d\u001a\u0004\b \u0010\u001cR\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001fR\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u00a2\u0006\b\n\u0000\u001a\u0004\b\"\u0010#\u00a8\u00064"}, d2 = {"Lcom/vimeo/networking2/Notification;", "", "clip", "Lcom/vimeo/networking2/Video;", "comment", "Lcom/vimeo/networking2/Comment;", "createdTime", "Ljava/util/Date;", "credit", "Lcom/vimeo/networking2/Credit;", "new", "", "seen", "rawType", "", "uri", "user", "Lcom/vimeo/networking2/User;", "(Lcom/vimeo/networking2/Video;Lcom/vimeo/networking2/Comment;Ljava/util/Date;Lcom/vimeo/networking2/Credit;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Lcom/vimeo/networking2/User;)V", "getClip", "()Lcom/vimeo/networking2/Video;", "getComment", "()Lcom/vimeo/networking2/Comment;", "getCreatedTime", "()Ljava/util/Date;", "getCredit", "()Lcom/vimeo/networking2/Credit;", "getNew", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getRawType", "()Ljava/lang/String;", "getSeen", "getUri", "getUser", "()Lcom/vimeo/networking2/User;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Lcom/vimeo/networking2/Video;Lcom/vimeo/networking2/Comment;Ljava/util/Date;Lcom/vimeo/networking2/Credit;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Lcom/vimeo/networking2/User;)Lcom/vimeo/networking2/Notification;", "equals", "other", "hashCode", "", "toString", "models"})
@com.squareup.moshi.JsonClass(generateAdapter = true)
public final class Notification {
    
    /**
     * * The clip associated with a clip like notification.
     */
    @org.jetbrains.annotations.Nullable()
    private final com.vimeo.networking2.Video clip = null;
    
    /**
     * * The clip comment associated with a comment notification.
     */
    @org.jetbrains.annotations.Nullable()
    private final com.vimeo.networking2.Comment comment = null;
    
    /**
     * * The ISODate time a notification was created.
     */
    @org.jetbrains.annotations.Nullable()
    private final java.util.Date createdTime = null;
    
    /**
     * * The clip credit associated with a credit notification.
     */
    @org.jetbrains.annotations.Nullable()
    private final com.vimeo.networking2.Credit credit = null;
    
    /**
     * * Is the notification marked as seen.
     */
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Boolean seen = null;
    
    /**
     * * The type of notification.
     *     * @see Notification.type
     */
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String rawType = null;
    
    /**
     * * The notification's canonical relative URI.
     */
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String uri = null;
    
    /**
     * * The user associated with a user follow notification.
     */
    @org.jetbrains.annotations.Nullable()
    private final com.vimeo.networking2.User user = null;
    
    /**
     * * The clip associated with a clip like notification.
     */
    @org.jetbrains.annotations.Nullable()
    public final com.vimeo.networking2.Video getClip() {
        return null;
    }
    
    /**
     * * The clip comment associated with a comment notification.
     */
    @org.jetbrains.annotations.Nullable()
    public final com.vimeo.networking2.Comment getComment() {
        return null;
    }
    
    /**
     * * The ISODate time a notification was created.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.util.Date getCreatedTime() {
        return null;
    }
    
    /**
     * * The clip credit associated with a credit notification.
     */
    @org.jetbrains.annotations.Nullable()
    public final com.vimeo.networking2.Credit getCredit() {
        return null;
    }
    
    /**
     * * Is the notification marked as new.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean getNew() {
        return null;
    }
    
    /**
     * * Is the notification marked as seen.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean getSeen() {
        return null;
    }
    
    /**
     * * The type of notification.
     *     * @see Notification.type
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getRawType() {
        return null;
    }
    
    /**
     * * The notification's canonical relative URI.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getUri() {
        return null;
    }
    
    /**
     * * The user associated with a user follow notification.
     */
    @org.jetbrains.annotations.Nullable()
    public final com.vimeo.networking2.User getUser() {
        return null;
    }
    
    public Notification(@org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "clip")
    com.vimeo.networking2.Video clip, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "comment")
    com.vimeo.networking2.Comment comment, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "created_time")
    java.util.Date createdTime, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "credit")
    com.vimeo.networking2.Credit credit, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "new")
    java.lang.Boolean p4_54480, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "seen")
    java.lang.Boolean seen, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "type")
    java.lang.String rawType, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "uri")
    java.lang.String uri, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "user")
    com.vimeo.networking2.User user) {
        super();
    }
    
    public Notification() {
        super();
    }
    
    /**
     * * The clip associated with a clip like notification.
     */
    @org.jetbrains.annotations.Nullable()
    public final com.vimeo.networking2.Video component1() {
        return null;
    }
    
    /**
     * * The clip comment associated with a comment notification.
     */
    @org.jetbrains.annotations.Nullable()
    public final com.vimeo.networking2.Comment component2() {
        return null;
    }
    
    /**
     * * The ISODate time a notification was created.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.util.Date component3() {
        return null;
    }
    
    /**
     * * The clip credit associated with a credit notification.
     */
    @org.jetbrains.annotations.Nullable()
    public final com.vimeo.networking2.Credit component4() {
        return null;
    }
    
    /**
     * * Is the notification marked as new.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean component5() {
        return null;
    }
    
    /**
     * * Is the notification marked as seen.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean component6() {
        return null;
    }
    
    /**
     * * The type of notification.
     *     * @see Notification.type
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component7() {
        return null;
    }
    
    /**
     * * The notification's canonical relative URI.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component8() {
        return null;
    }
    
    /**
     * * The user associated with a user follow notification.
     */
    @org.jetbrains.annotations.Nullable()
    public final com.vimeo.networking2.User component9() {
        return null;
    }
    
    /**
     * * Notification data.
     */
    @org.jetbrains.annotations.NotNull()
    public final com.vimeo.networking2.Notification copy(@org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "clip")
    com.vimeo.networking2.Video clip, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "comment")
    com.vimeo.networking2.Comment comment, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "created_time")
    java.util.Date createdTime, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "credit")
    com.vimeo.networking2.Credit credit, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "new")
    java.lang.Boolean p4_54480, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "seen")
    java.lang.Boolean seen, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "type")
    java.lang.String rawType, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "uri")
    java.lang.String uri, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "user")
    com.vimeo.networking2.User user) {
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