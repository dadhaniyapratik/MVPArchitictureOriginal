package com.vimeo.networking2;

import java.lang.System;

/**
 * * Cinema data.
 */
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Be\u0012\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0010\b\u0003\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\u0010\b\u0003\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n\u0012\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\r\u0012\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\n\b\u0003\u0010\u000f\u001a\u0004\u0018\u00010\r\u00a2\u0006\u0002\u0010\u0010J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u0011\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007H\u00c6\u0003J\u0011\u0010 \u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nH\u00c6\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\rH\u00c6\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\rH\u00c6\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\rH\u00c6\u0003Ji\u0010$\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0010\b\u0003\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00072\u0010\b\u0003\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n2\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\b\u0003\u0010\u000f\u001a\u0004\u0018\u00010\rH\u00c6\u0001J\u0013\u0010%\u001a\u00020&2\b\u0010\'\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010(\u001a\u00020)H\u00d6\u0001J\t\u0010*\u001a\u00020\rH\u00d6\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0019\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\f\u001a\u0004\u0018\u00010\r\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\r\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0018R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\r\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0018R\u0019\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001c\u00a8\u0006+"}, d2 = {"Lcom/vimeo/networking2/ProgrammedContentItem;", "", "category", "Lcom/vimeo/networking2/Category;", "channel", "Lcom/vimeo/networking2/Channel;", "videoList", "", "Lcom/vimeo/networking2/Video;", "metadata", "Lcom/vimeo/networking2/MetadataConnections;", "Lcom/vimeo/networking2/CinemaConnections;", "name", "", "rawType", "uri", "(Lcom/vimeo/networking2/Category;Lcom/vimeo/networking2/Channel;Ljava/util/List;Lcom/vimeo/networking2/MetadataConnections;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCategory", "()Lcom/vimeo/networking2/Category;", "getChannel", "()Lcom/vimeo/networking2/Channel;", "getMetadata", "()Lcom/vimeo/networking2/MetadataConnections;", "getName", "()Ljava/lang/String;", "getRawType", "getUri", "getVideoList", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "", "toString", "models"})
@com.squareup.moshi.JsonClass(generateAdapter = true)
public final class ProgrammedContentItem {
    
    /**
     * * The category associated with this programmed cinema item.
     */
    @org.jetbrains.annotations.Nullable()
    private final com.vimeo.networking2.Category category = null;
    
    /**
     * * The channel associated with this programmed cinema item.
     */
    @org.jetbrains.annotations.Nullable()
    private final com.vimeo.networking2.Channel channel = null;
    
    /**
     * * Content for the programmed cinema item.
     */
    @org.jetbrains.annotations.Nullable()
    private final java.util.List<com.vimeo.networking2.Video> videoList = null;
    
    /**
     * * ProgrammedContentItem metadata.
     */
    @org.jetbrains.annotations.Nullable()
    private final com.vimeo.networking2.MetadataConnections<com.vimeo.networking2.CinemaConnections> metadata = null;
    
    /**
     * * The name of the programmed cinema item.
     */
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String name = null;
    
    /**
     * * The type of programmed cinema item.
     *     * @see ProgrammedContentItem.type
     */
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String rawType = null;
    
    /**
     * * The programmed cinema items' canonical relative URI.
     */
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String uri = null;
    
    /**
     * * The category associated with this programmed cinema item.
     */
    @org.jetbrains.annotations.Nullable()
    public final com.vimeo.networking2.Category getCategory() {
        return null;
    }
    
    /**
     * * The channel associated with this programmed cinema item.
     */
    @org.jetbrains.annotations.Nullable()
    public final com.vimeo.networking2.Channel getChannel() {
        return null;
    }
    
    /**
     * * Content for the programmed cinema item.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.vimeo.networking2.Video> getVideoList() {
        return null;
    }
    
    /**
     * * ProgrammedContentItem metadata.
     */
    @org.jetbrains.annotations.Nullable()
    public final com.vimeo.networking2.MetadataConnections<com.vimeo.networking2.CinemaConnections> getMetadata() {
        return null;
    }
    
    /**
     * * The name of the programmed cinema item.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getName() {
        return null;
    }
    
    /**
     * * The type of programmed cinema item.
     *     * @see ProgrammedContentItem.type
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getRawType() {
        return null;
    }
    
    /**
     * * The programmed cinema items' canonical relative URI.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getUri() {
        return null;
    }
    
    public ProgrammedContentItem(@org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "category")
    com.vimeo.networking2.Category category, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "channel")
    com.vimeo.networking2.Channel channel, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "content")
    java.util.List<com.vimeo.networking2.Video> videoList, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "metadata")
    com.vimeo.networking2.MetadataConnections<com.vimeo.networking2.CinemaConnections> metadata, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "name")
    java.lang.String name, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "type")
    java.lang.String rawType, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "uri")
    java.lang.String uri) {
        super();
    }
    
    public ProgrammedContentItem() {
        super();
    }
    
    /**
     * * The category associated with this programmed cinema item.
     */
    @org.jetbrains.annotations.Nullable()
    public final com.vimeo.networking2.Category component1() {
        return null;
    }
    
    /**
     * * The channel associated with this programmed cinema item.
     */
    @org.jetbrains.annotations.Nullable()
    public final com.vimeo.networking2.Channel component2() {
        return null;
    }
    
    /**
     * * Content for the programmed cinema item.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.vimeo.networking2.Video> component3() {
        return null;
    }
    
    /**
     * * ProgrammedContentItem metadata.
     */
    @org.jetbrains.annotations.Nullable()
    public final com.vimeo.networking2.MetadataConnections<com.vimeo.networking2.CinemaConnections> component4() {
        return null;
    }
    
    /**
     * * The name of the programmed cinema item.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component5() {
        return null;
    }
    
    /**
     * * The type of programmed cinema item.
     *     * @see ProgrammedContentItem.type
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component6() {
        return null;
    }
    
    /**
     * * The programmed cinema items' canonical relative URI.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component7() {
        return null;
    }
    
    /**
     * * Cinema data.
     */
    @org.jetbrains.annotations.NotNull()
    public final com.vimeo.networking2.ProgrammedContentItem copy(@org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "category")
    com.vimeo.networking2.Category category, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "channel")
    com.vimeo.networking2.Channel channel, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "content")
    java.util.List<com.vimeo.networking2.Video> videoList, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "metadata")
    com.vimeo.networking2.MetadataConnections<com.vimeo.networking2.CinemaConnections> metadata, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "name")
    java.lang.String name, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "type")
    java.lang.String rawType, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "uri")
    java.lang.String uri) {
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