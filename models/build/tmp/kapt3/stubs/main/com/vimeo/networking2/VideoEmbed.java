package com.vimeo.networking2;

import java.lang.System;

/**
 * * Video embed data.
 */
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b \n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Bq\u0012\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\r\u0012\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0003\u0010\u000f\u001a\u0004\u0018\u00010\n\u00a2\u0006\u0002\u0010\u0010J\u000b\u0010 \u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J\u0010\u0010$\u001a\u0004\u0018\u00010\nH\u00c6\u0003\u00a2\u0006\u0002\u0010\u0019J\u0010\u0010%\u001a\u0004\u0018\u00010\nH\u00c6\u0003\u00a2\u0006\u0002\u0010\u0019J\u000b\u0010&\u001a\u0004\u0018\u00010\rH\u00c6\u0003J\u000b\u0010\'\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J\u0010\u0010(\u001a\u0004\u0018\u00010\nH\u00c6\u0003\u00a2\u0006\u0002\u0010\u0019Jz\u0010)\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\u00072\n\b\u0003\u0010\u000f\u001a\u0004\u0018\u00010\nH\u00c6\u0001\u00a2\u0006\u0002\u0010*J\u0013\u0010+\u001a\u00020\n2\b\u0010,\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010-\u001a\u00020.H\u00d6\u0001J\t\u0010/\u001a\u00020\u0007H\u00d6\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u0015\u0010\t\u001a\u0004\u0018\u00010\n\u00a2\u0006\n\n\u0002\u0010\u001a\u001a\u0004\b\u0018\u0010\u0019R\u0015\u0010\u000b\u001a\u0004\u0018\u00010\n\u00a2\u0006\n\n\u0002\u0010\u001a\u001a\u0004\b\u001b\u0010\u0019R\u0013\u0010\f\u001a\u0004\u0018\u00010\r\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0016R\u0015\u0010\u000f\u001a\u0004\u0018\u00010\n\u00a2\u0006\n\n\u0002\u0010\u001a\u001a\u0004\b\u001f\u0010\u0019\u00a8\u00060"}, d2 = {"Lcom/vimeo/networking2/VideoEmbed;", "", "badges", "Lcom/vimeo/networking2/VideoBadges;", "buttons", "Lcom/vimeo/networking2/EmbedButtons;", "color", "", "html", "playBar", "", "speed", "title", "Lcom/vimeo/networking2/EmbedTitle;", "uri", "volume", "(Lcom/vimeo/networking2/VideoBadges;Lcom/vimeo/networking2/EmbedButtons;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Lcom/vimeo/networking2/EmbedTitle;Ljava/lang/String;Ljava/lang/Boolean;)V", "getBadges", "()Lcom/vimeo/networking2/VideoBadges;", "getButtons", "()Lcom/vimeo/networking2/EmbedButtons;", "getColor", "()Ljava/lang/String;", "getHtml", "getPlayBar", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getSpeed", "getTitle", "()Lcom/vimeo/networking2/EmbedTitle;", "getUri", "getVolume", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Lcom/vimeo/networking2/VideoBadges;Lcom/vimeo/networking2/EmbedButtons;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Lcom/vimeo/networking2/EmbedTitle;Ljava/lang/String;Ljava/lang/Boolean;)Lcom/vimeo/networking2/VideoEmbed;", "equals", "other", "hashCode", "", "toString", "models"})
@com.squareup.moshi.JsonClass(generateAdapter = true)
public final class VideoEmbed {
    
    /**
     * * A collection of the video's badges.
     */
    @org.jetbrains.annotations.Nullable()
    private final com.vimeo.networking2.VideoBadges badges = null;
    
    /**
     * * A collection of information about the buttons that appear on the
     *     * interface of the embeddable player.
     */
    @org.jetbrains.annotations.Nullable()
    private final com.vimeo.networking2.EmbedButtons buttons = null;
    
    /**
     * * The primary player color, which controls the color of the progress bar, buttons,
     *     * and more.
     */
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String color = null;
    
    /**
     * * HTML code for embedding this video on a web page.
     */
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String html = null;
    
    /**
     * * Whether the playbar appears in the embeddable player for this video.
     */
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Boolean playBar = null;
    
    /**
     * * Whether the speed controls appear in the embeddable player for this video.
     */
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Boolean speed = null;
    
    /**
     * * A collection of information relating to the embeddable player's title bar.
     */
    @org.jetbrains.annotations.Nullable()
    private final com.vimeo.networking2.EmbedTitle title = null;
    
    /**
     * * The URI of the embed preset.
     */
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String uri = null;
    
    /**
     * * Whether the volume controls appear in the embeddable player for this video.
     */
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Boolean volume = null;
    
    /**
     * * A collection of the video's badges.
     */
    @org.jetbrains.annotations.Nullable()
    public final com.vimeo.networking2.VideoBadges getBadges() {
        return null;
    }
    
    /**
     * * A collection of information about the buttons that appear on the
     *     * interface of the embeddable player.
     */
    @org.jetbrains.annotations.Nullable()
    public final com.vimeo.networking2.EmbedButtons getButtons() {
        return null;
    }
    
    /**
     * * The primary player color, which controls the color of the progress bar, buttons,
     *     * and more.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getColor() {
        return null;
    }
    
    /**
     * * HTML code for embedding this video on a web page.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getHtml() {
        return null;
    }
    
    /**
     * * Whether the playbar appears in the embeddable player for this video.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean getPlayBar() {
        return null;
    }
    
    /**
     * * Whether the speed controls appear in the embeddable player for this video.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean getSpeed() {
        return null;
    }
    
    /**
     * * A collection of information relating to the embeddable player's title bar.
     */
    @org.jetbrains.annotations.Nullable()
    public final com.vimeo.networking2.EmbedTitle getTitle() {
        return null;
    }
    
    /**
     * * The URI of the embed preset.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getUri() {
        return null;
    }
    
    /**
     * * Whether the volume controls appear in the embeddable player for this video.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean getVolume() {
        return null;
    }
    
    public VideoEmbed(@org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "badges")
    com.vimeo.networking2.VideoBadges badges, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "buttons")
    com.vimeo.networking2.EmbedButtons buttons, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "color")
    java.lang.String color, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "html")
    java.lang.String html, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "playBar")
    java.lang.Boolean playBar, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "speed")
    java.lang.Boolean speed, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "title")
    com.vimeo.networking2.EmbedTitle title, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "uri")
    java.lang.String uri, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "volume")
    java.lang.Boolean volume) {
        super();
    }
    
    public VideoEmbed() {
        super();
    }
    
    /**
     * * A collection of the video's badges.
     */
    @org.jetbrains.annotations.Nullable()
    public final com.vimeo.networking2.VideoBadges component1() {
        return null;
    }
    
    /**
     * * A collection of information about the buttons that appear on the
     *     * interface of the embeddable player.
     */
    @org.jetbrains.annotations.Nullable()
    public final com.vimeo.networking2.EmbedButtons component2() {
        return null;
    }
    
    /**
     * * The primary player color, which controls the color of the progress bar, buttons,
     *     * and more.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component3() {
        return null;
    }
    
    /**
     * * HTML code for embedding this video on a web page.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component4() {
        return null;
    }
    
    /**
     * * Whether the playbar appears in the embeddable player for this video.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean component5() {
        return null;
    }
    
    /**
     * * Whether the speed controls appear in the embeddable player for this video.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean component6() {
        return null;
    }
    
    /**
     * * A collection of information relating to the embeddable player's title bar.
     */
    @org.jetbrains.annotations.Nullable()
    public final com.vimeo.networking2.EmbedTitle component7() {
        return null;
    }
    
    /**
     * * The URI of the embed preset.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component8() {
        return null;
    }
    
    /**
     * * Whether the volume controls appear in the embeddable player for this video.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean component9() {
        return null;
    }
    
    /**
     * * Video embed data.
     */
    @org.jetbrains.annotations.NotNull()
    public final com.vimeo.networking2.VideoEmbed copy(@org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "badges")
    com.vimeo.networking2.VideoBadges badges, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "buttons")
    com.vimeo.networking2.EmbedButtons buttons, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "color")
    java.lang.String color, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "html")
    java.lang.String html, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "playBar")
    java.lang.Boolean playBar, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "speed")
    java.lang.Boolean speed, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "title")
    com.vimeo.networking2.EmbedTitle title, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "uri")
    java.lang.String uri, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "volume")
    java.lang.Boolean volume) {
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