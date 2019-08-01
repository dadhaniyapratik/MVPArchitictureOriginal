package com.vimeo.networking2;

import java.lang.System;

/**
 * * GCS data.
 */
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0002\u0010\u0007J\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u000bJ\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u000bJ\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003J2\u0010\u0015\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u00c6\u0001\u00a2\u0006\u0002\u0010\u0016J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001a\u001a\u00020\u0003H\u00d6\u0001J\t\u0010\u001b\u001a\u00020\u0006H\u00d6\u0001R \u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\u0010\n\u0002\u0010\f\u0012\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR \u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\u0010\n\u0002\u0010\f\u0012\u0004\b\r\u0010\t\u001a\u0004\b\u000e\u0010\u000bR\u001e\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\b\u000f\u0010\t\u001a\u0004\b\u0010\u0010\u0011\u00a8\u0006\u001c"}, d2 = {"Lcom/vimeo/networking2/Gcs;", "", "endByte", "", "startByte", "uploadLink", "", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;)V", "endByte$annotations", "()V", "getEndByte", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "startByte$annotations", "getStartByte", "uploadLink$annotations", "getUploadLink", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;)Lcom/vimeo/networking2/Gcs;", "equals", "", "other", "hashCode", "toString", "models"})
@com.squareup.moshi.JsonClass(generateAdapter = true)
@com.vimeo.networking2.annotations.Internal()
public final class Gcs {
    
    /**
     * * Expected ending byte range for the current upload_link.
     */
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Integer endByte = null;
    
    /**
     * * Expected starting byte size for the current upload_link.
     */
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Integer startByte = null;
    
    /**
     * * Link for uploading file chunk to.
     */
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String uploadLink = null;
    
    @com.vimeo.networking2.annotations.Internal()
    public static void endByte$annotations() {
    }
    
    /**
     * * Expected ending byte range for the current upload_link.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getEndByte() {
        return null;
    }
    
    @com.vimeo.networking2.annotations.Internal()
    public static void startByte$annotations() {
    }
    
    /**
     * * Expected starting byte size for the current upload_link.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getStartByte() {
        return null;
    }
    
    @com.vimeo.networking2.annotations.Internal()
    public static void uploadLink$annotations() {
    }
    
    /**
     * * Link for uploading file chunk to.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getUploadLink() {
        return null;
    }
    
    public Gcs(@org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "end_byte")
    java.lang.Integer endByte, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "start_byte")
    java.lang.Integer startByte, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "upload_link")
    java.lang.String uploadLink) {
        super();
    }
    
    public Gcs() {
        super();
    }
    
    /**
     * * Expected ending byte range for the current upload_link.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component1() {
        return null;
    }
    
    /**
     * * Expected starting byte size for the current upload_link.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component2() {
        return null;
    }
    
    /**
     * * Link for uploading file chunk to.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component3() {
        return null;
    }
    
    /**
     * * GCS data.
     */
    @org.jetbrains.annotations.NotNull()
    public final com.vimeo.networking2.Gcs copy(@org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "end_byte")
    java.lang.Integer endByte, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "start_byte")
    java.lang.Integer startByte, @org.jetbrains.annotations.Nullable()
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