package com.vimeo.networking2;

import java.lang.System;

/**
 * * Live chat configuration data.
 */
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b \n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BY\u0012\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\nJ\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J]\u0010\"\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001J\u0013\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010&\u001a\u00020\'H\u00d6\u0001J\t\u0010(\u001a\u00020\u0003H\u00d6\u0001R\u001e\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\b\u000f\u0010\f\u001a\u0004\b\u0010\u0010\u000eR\u001e\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\b\u0011\u0010\f\u001a\u0004\b\u0012\u0010\u000eR\u001e\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\b\u0013\u0010\f\u001a\u0004\b\u0014\u0010\u000eR\u001e\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\b\u0015\u0010\f\u001a\u0004\b\u0016\u0010\u000eR\u001e\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\b\u0017\u0010\f\u001a\u0004\b\u0018\u0010\u000eR\u001e\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\b\u0019\u0010\f\u001a\u0004\b\u001a\u0010\u000e\u00a8\u0006)"}, d2 = {"Lcom/vimeo/networking2/LiveChatConfiguration;", "", "apiKey", "", "appId", "authDomain", "databaseUrl", "messagingSenderId", "projectId", "storageBucket", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "apiKey$annotations", "()V", "getApiKey", "()Ljava/lang/String;", "appId$annotations", "getAppId", "authDomain$annotations", "getAuthDomain", "databaseUrl$annotations", "getDatabaseUrl", "messagingSenderId$annotations", "getMessagingSenderId", "projectId$annotations", "getProjectId", "storageBucket$annotations", "getStorageBucket", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "", "toString", "models"})
@com.squareup.moshi.JsonClass(generateAdapter = true)
@com.vimeo.networking2.annotations.Internal()
public final class LiveChatConfiguration {
    
    /**
     * * The live chat Firebase API key.
     */
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String apiKey = null;
    
    /**
     * * The live chat Firebase app ID.
     */
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String appId = null;
    
    /**
     * * The live chat Firebase authentication domain.
     */
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String authDomain = null;
    
    /**
     * * The live chat Firebase database URL.
     */
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String databaseUrl = null;
    
    /**
     * * The live chat Firebase messaging sender ID.
     */
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String messagingSenderId = null;
    
    /**
     * * The live chat Firebase project ID.
     */
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String projectId = null;
    
    /**
     * * The live chat Firebase storage bucket.
     */
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String storageBucket = null;
    
    @com.vimeo.networking2.annotations.Internal()
    public static void apiKey$annotations() {
    }
    
    /**
     * * The live chat Firebase API key.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getApiKey() {
        return null;
    }
    
    @com.vimeo.networking2.annotations.Internal()
    public static void appId$annotations() {
    }
    
    /**
     * * The live chat Firebase app ID.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getAppId() {
        return null;
    }
    
    @com.vimeo.networking2.annotations.Internal()
    public static void authDomain$annotations() {
    }
    
    /**
     * * The live chat Firebase authentication domain.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getAuthDomain() {
        return null;
    }
    
    @com.vimeo.networking2.annotations.Internal()
    public static void databaseUrl$annotations() {
    }
    
    /**
     * * The live chat Firebase database URL.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getDatabaseUrl() {
        return null;
    }
    
    @com.vimeo.networking2.annotations.Internal()
    public static void messagingSenderId$annotations() {
    }
    
    /**
     * * The live chat Firebase messaging sender ID.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getMessagingSenderId() {
        return null;
    }
    
    @com.vimeo.networking2.annotations.Internal()
    public static void projectId$annotations() {
    }
    
    /**
     * * The live chat Firebase project ID.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getProjectId() {
        return null;
    }
    
    @com.vimeo.networking2.annotations.Internal()
    public static void storageBucket$annotations() {
    }
    
    /**
     * * The live chat Firebase storage bucket.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getStorageBucket() {
        return null;
    }
    
    public LiveChatConfiguration(@org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "api_key")
    java.lang.String apiKey, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "app_id")
    java.lang.String appId, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "auth_domain")
    java.lang.String authDomain, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "database_url")
    java.lang.String databaseUrl, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "messaging_sender_id")
    java.lang.String messagingSenderId, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "project_id")
    java.lang.String projectId, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "storage_bucket")
    java.lang.String storageBucket) {
        super();
    }
    
    public LiveChatConfiguration() {
        super();
    }
    
    /**
     * * The live chat Firebase API key.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component1() {
        return null;
    }
    
    /**
     * * The live chat Firebase app ID.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component2() {
        return null;
    }
    
    /**
     * * The live chat Firebase authentication domain.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component3() {
        return null;
    }
    
    /**
     * * The live chat Firebase database URL.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component4() {
        return null;
    }
    
    /**
     * * The live chat Firebase messaging sender ID.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component5() {
        return null;
    }
    
    /**
     * * The live chat Firebase project ID.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component6() {
        return null;
    }
    
    /**
     * * The live chat Firebase storage bucket.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component7() {
        return null;
    }
    
    /**
     * * Live chat configuration data.
     */
    @org.jetbrains.annotations.NotNull()
    public final com.vimeo.networking2.LiveChatConfiguration copy(@org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "api_key")
    java.lang.String apiKey, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "app_id")
    java.lang.String appId, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "auth_domain")
    java.lang.String authDomain, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "database_url")
    java.lang.String databaseUrl, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "messaging_sender_id")
    java.lang.String messagingSenderId, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "project_id")
    java.lang.String projectId, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "storage_bucket")
    java.lang.String storageBucket) {
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