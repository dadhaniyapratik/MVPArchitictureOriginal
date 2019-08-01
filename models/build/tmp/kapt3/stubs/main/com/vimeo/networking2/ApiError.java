package com.vimeo.networking2;

import java.lang.System;

/**
 * *  This class represents an error response from the Vimeo API. It holds useful getters to
 * *  understand why your request might have failed.
 */
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u0007J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J9\u0010\u0011\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0015\u001a\u00020\u0016H\u00d6\u0001J\t\u0010\u0017\u001a\u00020\u0003H\u00d6\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t\u00a8\u0006\u0018"}, d2 = {"Lcom/vimeo/networking2/ApiError;", "", "developerMessage", "", "errorMessage", "errorCode", "link", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getDeveloperMessage", "()Ljava/lang/String;", "getErrorCode", "getErrorMessage", "getLink", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "models"})
@com.squareup.moshi.JsonClass(generateAdapter = true)
public final class ApiError {
    
    /**
     * * Developer friendly error message.
     */
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String developerMessage = null;
    
    /**
     * * User friendly error message.
     */
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String errorMessage = null;
    
    /**
     * * The error code.
     *     * @see ApiError.errorCodeType
     */
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String errorCode = null;
    
    /**
     * * A link to more information about the error.
     */
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String link = null;
    
    /**
     * * Developer friendly error message.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getDeveloperMessage() {
        return null;
    }
    
    /**
     * * User friendly error message.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getErrorMessage() {
        return null;
    }
    
    /**
     * * The error code.
     *     * @see ApiError.errorCodeType
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getErrorCode() {
        return null;
    }
    
    /**
     * * A link to more information about the error.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getLink() {
        return null;
    }
    
    public ApiError(@org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "developer_message")
    java.lang.String developerMessage, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "error")
    java.lang.String errorMessage, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "error_code")
    java.lang.String errorCode, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "link")
    java.lang.String link) {
        super();
    }
    
    public ApiError() {
        super();
    }
    
    /**
     * * Developer friendly error message.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component1() {
        return null;
    }
    
    /**
     * * User friendly error message.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component2() {
        return null;
    }
    
    /**
     * * The error code.
     *     * @see ApiError.errorCodeType
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component3() {
        return null;
    }
    
    /**
     * * A link to more information about the error.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component4() {
        return null;
    }
    
    /**
     * *  This class represents an error response from the Vimeo API. It holds useful getters to
     * *  understand why your request might have failed.
     */
    @org.jetbrains.annotations.NotNull()
    public final com.vimeo.networking2.ApiError copy(@org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "developer_message")
    java.lang.String developerMessage, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "error")
    java.lang.String errorMessage, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "error_code")
    java.lang.String errorCode, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "link")
    java.lang.String link) {
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