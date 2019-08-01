package com.vimeo.networking2;

import java.lang.System;

/**
 * * Upload data.
 */
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u001e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Bq\u0012\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u000eJ\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0010\u0010$\u001a\u0004\u0018\u00010\u000bH\u00c6\u0003\u00a2\u0006\u0002\u0010\u001aJ\u000b\u0010%\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003Jz\u0010\'\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001\u00a2\u0006\u0002\u0010(J\u0013\u0010)\u001a\u00020*2\b\u0010+\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010,\u001a\u00020-H\u00d6\u0001J\t\u0010.\u001a\u00020\u0003H\u00d6\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u001e\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0010R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0010R\u0015\u0010\n\u001a\u0004\u0018\u00010\u000b\u00a2\u0006\n\n\u0002\u0010\u001b\u001a\u0004\b\u0019\u0010\u001aR\u0013\u0010\f\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0010R\u0013\u0010\r\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0010\u00a8\u0006/"}, d2 = {"Lcom/vimeo/networking2/Upload;", "", "approach", "", "completeUri", "form", "gcs", "Lcom/vimeo/networking2/Gcs;", "link", "redirectUrl", "size", "", "status", "uploadLink", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/vimeo/networking2/Gcs;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;)V", "getApproach", "()Ljava/lang/String;", "getCompleteUri", "getForm", "gcs$annotations", "()V", "getGcs", "()Lcom/vimeo/networking2/Gcs;", "getLink", "getRedirectUrl", "getSize", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getStatus", "getUploadLink", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/vimeo/networking2/Gcs;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;)Lcom/vimeo/networking2/Upload;", "equals", "", "other", "hashCode", "", "toString", "models"})
@com.squareup.moshi.JsonClass(generateAdapter = true)
public final class Upload {
    
    /**
     * * The approach for uploading the video.
     *     * @see Upload.approachType
     */
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String approach = null;
    
    /**
     * * The URI for completing the upload.
     */
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String completeUri = null;
    
    /**
     * * The HTML form for uploading a video through the post approach.
     */
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String form = null;
    
    /**
     * * GCS information to perform an upload.
     */
    @org.jetbrains.annotations.Nullable()
    private final com.vimeo.networking2.Gcs gcs = null;
    
    /**
     * * The link of the video to capture through the pull approach.
     */
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String link = null;
    
    /**
     * * The redirect URL for the upload app.
     */
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String redirectUrl = null;
    
    /**
     * * The file size in bytes of the uploaded video.
     */
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Long size = null;
    
    /**
     * * The status code for the availability of the uploaded video.
     *     * @see Upload.statusType
     */
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String status = null;
    
    /**
     * * The link for sending video file data.
     */
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String uploadLink = null;
    
    /**
     * * The approach for uploading the video.
     *     * @see Upload.approachType
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getApproach() {
        return null;
    }
    
    /**
     * * The URI for completing the upload.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getCompleteUri() {
        return null;
    }
    
    /**
     * * The HTML form for uploading a video through the post approach.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getForm() {
        return null;
    }
    
    @com.vimeo.networking2.annotations.Internal()
    public static void gcs$annotations() {
    }
    
    /**
     * * GCS information to perform an upload.
     */
    @org.jetbrains.annotations.Nullable()
    public final com.vimeo.networking2.Gcs getGcs() {
        return null;
    }
    
    /**
     * * The link of the video to capture through the pull approach.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getLink() {
        return null;
    }
    
    /**
     * * The redirect URL for the upload app.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getRedirectUrl() {
        return null;
    }
    
    /**
     * * The file size in bytes of the uploaded video.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Long getSize() {
        return null;
    }
    
    /**
     * * The status code for the availability of the uploaded video.
     *     * @see Upload.statusType
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getStatus() {
        return null;
    }
    
    /**
     * * The link for sending video file data.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getUploadLink() {
        return null;
    }
    
    public Upload(@org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "approach")
    java.lang.String approach, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "complete_uri")
    java.lang.String completeUri, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "form")
    java.lang.String form, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "gcs")
    com.vimeo.networking2.Gcs gcs, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "link")
    java.lang.String link, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "redirectUrl")
    java.lang.String redirectUrl, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "size")
    java.lang.Long size, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "status")
    java.lang.String status, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "upload_link")
    java.lang.String uploadLink) {
        super();
    }
    
    public Upload() {
        super();
    }
    
    /**
     * * The approach for uploading the video.
     *     * @see Upload.approachType
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component1() {
        return null;
    }
    
    /**
     * * The URI for completing the upload.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component2() {
        return null;
    }
    
    /**
     * * The HTML form for uploading a video through the post approach.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component3() {
        return null;
    }
    
    /**
     * * GCS information to perform an upload.
     */
    @org.jetbrains.annotations.Nullable()
    public final com.vimeo.networking2.Gcs component4() {
        return null;
    }
    
    /**
     * * The link of the video to capture through the pull approach.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component5() {
        return null;
    }
    
    /**
     * * The redirect URL for the upload app.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component6() {
        return null;
    }
    
    /**
     * * The file size in bytes of the uploaded video.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Long component7() {
        return null;
    }
    
    /**
     * * The status code for the availability of the uploaded video.
     *     * @see Upload.statusType
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component8() {
        return null;
    }
    
    /**
     * * The link for sending video file data.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component9() {
        return null;
    }
    
    /**
     * * Upload data.
     */
    @org.jetbrains.annotations.NotNull()
    public final com.vimeo.networking2.Upload copy(@org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "approach")
    java.lang.String approach, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "complete_uri")
    java.lang.String completeUri, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "form")
    java.lang.String form, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "gcs")
    com.vimeo.networking2.Gcs gcs, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "link")
    java.lang.String link, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "redirectUrl")
    java.lang.String redirectUrl, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "size")
    java.lang.Long size, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "status")
    java.lang.String status, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "upload_link")
    java.lang.String uploadLink) {
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