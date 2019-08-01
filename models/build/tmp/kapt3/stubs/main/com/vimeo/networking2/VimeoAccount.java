package com.vimeo.networking2;

import java.lang.System;

/**
 * * This class represents an authenticated account with Vimeo. It can be through client credentials
 * * or a truly authenticated [User].
 */
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BM\u0012\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u000bJ\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\tH\u00c6\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003JQ\u0010\u001b\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001J\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001f\u001a\u00020 H\u00d6\u0001J\t\u0010!\u001a\u00020\u0003H\u00d6\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\rR\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\rR\u0013\u0010\b\u001a\u0004\u0018\u00010\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014\u00a8\u0006\""}, d2 = {"Lcom/vimeo/networking2/VimeoAccount;", "", "accessToken", "", "expiresOn", "Ljava/util/Date;", "refreshToken", "scope", "user", "Lcom/vimeo/networking2/User;", "tokenType", "(Ljava/lang/String;Ljava/util/Date;Ljava/lang/String;Ljava/lang/String;Lcom/vimeo/networking2/User;Ljava/lang/String;)V", "getAccessToken", "()Ljava/lang/String;", "getExpiresOn", "()Ljava/util/Date;", "getRefreshToken", "getScope", "getTokenType", "getUser", "()Lcom/vimeo/networking2/User;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "models"})
@com.squareup.moshi.JsonClass(generateAdapter = true)
public final class VimeoAccount {
    
    /**
     * * The access token string.
     */
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String accessToken = null;
    
    /**
     * * The date and time that the token expires.
     */
    @org.jetbrains.annotations.Nullable()
    private final java.util.Date expiresOn = null;
    
    /**
     * * The refresh token string.
     */
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String refreshToken = null;
    
    /**
     * * The scope or scopes that the token supports.
     */
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String scope = null;
    
    /**
     * * The authenticated user.
     */
    @org.jetbrains.annotations.Nullable()
    private final com.vimeo.networking2.User user = null;
    
    /**
     * * The token type.
     */
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String tokenType = null;
    
    /**
     * * The access token string.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getAccessToken() {
        return null;
    }
    
    /**
     * * The date and time that the token expires.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.util.Date getExpiresOn() {
        return null;
    }
    
    /**
     * * The refresh token string.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getRefreshToken() {
        return null;
    }
    
    /**
     * * The scope or scopes that the token supports.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getScope() {
        return null;
    }
    
    /**
     * * The authenticated user.
     */
    @org.jetbrains.annotations.Nullable()
    public final com.vimeo.networking2.User getUser() {
        return null;
    }
    
    /**
     * * The token type.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getTokenType() {
        return null;
    }
    
    public VimeoAccount(@org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "access_token")
    java.lang.String accessToken, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "expires_on")
    java.util.Date expiresOn, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "refresh_token")
    java.lang.String refreshToken, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "scope")
    java.lang.String scope, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "user")
    com.vimeo.networking2.User user, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "token_type")
    java.lang.String tokenType) {
        super();
    }
    
    public VimeoAccount() {
        super();
    }
    
    /**
     * * The access token string.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component1() {
        return null;
    }
    
    /**
     * * The date and time that the token expires.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.util.Date component2() {
        return null;
    }
    
    /**
     * * The refresh token string.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component3() {
        return null;
    }
    
    /**
     * * The scope or scopes that the token supports.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component4() {
        return null;
    }
    
    /**
     * * The authenticated user.
     */
    @org.jetbrains.annotations.Nullable()
    public final com.vimeo.networking2.User component5() {
        return null;
    }
    
    /**
     * * The token type.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component6() {
        return null;
    }
    
    /**
     * * This class represents an authenticated account with Vimeo. It can be through client credentials
     * * or a truly authenticated [User].
     */
    @org.jetbrains.annotations.NotNull()
    public final com.vimeo.networking2.VimeoAccount copy(@org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "access_token")
    java.lang.String accessToken, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "expires_on")
    java.util.Date expiresOn, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "refresh_token")
    java.lang.String refreshToken, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "scope")
    java.lang.String scope, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "user")
    com.vimeo.networking2.User user, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "token_type")
    java.lang.String tokenType) {
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