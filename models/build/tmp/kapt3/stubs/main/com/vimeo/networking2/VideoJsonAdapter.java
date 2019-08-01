package com.vimeo.networking2;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u00b8\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\u0010\u00104\u001a\u00020\u00022\u0006\u00105\u001a\u000206H\u0016J\u001a\u00107\u001a\u0002082\u0006\u00109\u001a\u00020:2\b\u0010;\u001a\u0004\u0018\u00010\u0002H\u0016J\b\u0010<\u001a\u00020\u0010H\u0016R\u0016\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0001X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0001X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u0001X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\f\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r0\u0001X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u000f\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\r0\u0001X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u0011\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\r0\u0001X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u0001X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\"\u0010\u0015\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u00160\u0001X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0019\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u0001X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001c0\u0001X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u001d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001e0\u0001X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u001f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010 0\u0001X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010!\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\"0\u0001X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010#\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u0001X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010$\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010%0\u0001X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010&\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\'0\u0001X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010(\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010)0\u0001X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010*\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010+0\u0001X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010,\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010-0\u0001X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010.\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010/0\u0001X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u00100\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001010\u0001X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u00102\u001a\u000203X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006="}, d2 = {"Lcom/vimeo/networking2/VideoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/vimeo/networking2/Video;", "moshi", "Lcom/squareup/moshi/Moshi;", "(Lcom/squareup/moshi/Moshi;)V", "nullableDateAdapter", "Ljava/util/Date;", "nullableFileTransferPageAdapter", "Lcom/vimeo/networking2/FileTransferPage;", "nullableIntAdapter", "", "nullableListOfCategoryAdapter", "", "Lcom/vimeo/networking2/Category;", "nullableListOfStringAdapter", "", "nullableListOfTagAdapter", "Lcom/vimeo/networking2/Tag;", "nullableLiveAdapter", "Lcom/vimeo/networking2/Live;", "nullableMetadataOfVideoConnectionsVideoInteractionsAdapter", "Lcom/vimeo/networking2/Metadata;", "Lcom/vimeo/networking2/VideoConnections;", "Lcom/vimeo/networking2/VideoInteractions;", "nullablePictureCollectionAdapter", "Lcom/vimeo/networking2/PictureCollection;", "nullablePlayAdapter", "Lcom/vimeo/networking2/Play;", "nullablePrivacyAdapter", "Lcom/vimeo/networking2/Privacy;", "nullableReviewPageAdapter", "Lcom/vimeo/networking2/ReviewPage;", "nullableSpatialAdapter", "Lcom/vimeo/networking2/Spatial;", "nullableStringAdapter", "nullableTranscodeAdapter", "Lcom/vimeo/networking2/Transcode;", "nullableUploadAdapter", "Lcom/vimeo/networking2/Upload;", "nullableUserAdapter", "Lcom/vimeo/networking2/User;", "nullableVideoBadgeAdapter", "Lcom/vimeo/networking2/VideoBadge;", "nullableVideoContextAdapter", "Lcom/vimeo/networking2/VideoContext;", "nullableVideoEmbedAdapter", "Lcom/vimeo/networking2/VideoEmbed;", "nullableVideoStatsAdapter", "Lcom/vimeo/networking2/VideoStats;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "fromJson", "reader", "Lcom/squareup/moshi/JsonReader;", "toJson", "", "writer", "Lcom/squareup/moshi/JsonWriter;", "value", "toString", "models"})
public final class VideoJsonAdapter extends com.squareup.moshi.JsonAdapter<com.vimeo.networking2.Video> {
    private final com.squareup.moshi.JsonReader.Options options = null;
    private final com.squareup.moshi.JsonAdapter<com.vimeo.networking2.VideoBadge> nullableVideoBadgeAdapter = null;
    private final com.squareup.moshi.JsonAdapter<java.util.List<com.vimeo.networking2.Category>> nullableListOfCategoryAdapter = null;
    private final com.squareup.moshi.JsonAdapter<java.util.List<java.lang.String>> nullableListOfStringAdapter = null;
    private final com.squareup.moshi.JsonAdapter<com.vimeo.networking2.VideoContext> nullableVideoContextAdapter = null;
    private final com.squareup.moshi.JsonAdapter<java.util.Date> nullableDateAdapter = null;
    private final com.squareup.moshi.JsonAdapter<java.lang.String> nullableStringAdapter = null;
    private final com.squareup.moshi.JsonAdapter<java.lang.Integer> nullableIntAdapter = null;
    private final com.squareup.moshi.JsonAdapter<com.vimeo.networking2.VideoEmbed> nullableVideoEmbedAdapter = null;
    private final com.squareup.moshi.JsonAdapter<com.vimeo.networking2.Live> nullableLiveAdapter = null;
    private final com.squareup.moshi.JsonAdapter<com.vimeo.networking2.Metadata<com.vimeo.networking2.VideoConnections, com.vimeo.networking2.VideoInteractions>> nullableMetadataOfVideoConnectionsVideoInteractionsAdapter = null;
    private final com.squareup.moshi.JsonAdapter<com.vimeo.networking2.PictureCollection> nullablePictureCollectionAdapter = null;
    private final com.squareup.moshi.JsonAdapter<com.vimeo.networking2.Play> nullablePlayAdapter = null;
    private final com.squareup.moshi.JsonAdapter<com.vimeo.networking2.Privacy> nullablePrivacyAdapter = null;
    private final com.squareup.moshi.JsonAdapter<com.vimeo.networking2.ReviewPage> nullableReviewPageAdapter = null;
    private final com.squareup.moshi.JsonAdapter<com.vimeo.networking2.FileTransferPage> nullableFileTransferPageAdapter = null;
    private final com.squareup.moshi.JsonAdapter<com.vimeo.networking2.Spatial> nullableSpatialAdapter = null;
    private final com.squareup.moshi.JsonAdapter<com.vimeo.networking2.VideoStats> nullableVideoStatsAdapter = null;
    private final com.squareup.moshi.JsonAdapter<java.util.List<com.vimeo.networking2.Tag>> nullableListOfTagAdapter = null;
    private final com.squareup.moshi.JsonAdapter<com.vimeo.networking2.Transcode> nullableTranscodeAdapter = null;
    private final com.squareup.moshi.JsonAdapter<com.vimeo.networking2.Upload> nullableUploadAdapter = null;
    private final com.squareup.moshi.JsonAdapter<com.vimeo.networking2.User> nullableUserAdapter = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.vimeo.networking2.Video fromJson(@org.jetbrains.annotations.NotNull()
    com.squareup.moshi.JsonReader reader) {
        return null;
    }
    
    @java.lang.Override()
    public void toJson(@org.jetbrains.annotations.NotNull()
    com.squareup.moshi.JsonWriter writer, @org.jetbrains.annotations.Nullable()
    com.vimeo.networking2.Video value) {
    }
    
    public VideoJsonAdapter(@org.jetbrains.annotations.NotNull()
    com.squareup.moshi.Moshi moshi) {
        super();
    }
}