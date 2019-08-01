// Code generated by moshi-kotlin-codegen. Do not edit.
package com.vimeo.networking2

import com.squareup.moshi.JsonAdapter
import com.squareup.moshi.JsonReader
import com.squareup.moshi.JsonWriter
import com.squareup.moshi.Moshi
import java.lang.NullPointerException
import kotlin.Boolean
import kotlin.String

class EmbedButtonsJsonAdapter(moshi: Moshi) : JsonAdapter<EmbedButtons>() {
    private val options: JsonReader.Options =
            JsonReader.Options.of("embed", "fullscreen", "hd", "like", "scaling", "share", "watchlater")

    private val nullableBooleanAdapter: JsonAdapter<Boolean?> =
            moshi.adapter<Boolean?>(Boolean::class.javaObjectType, kotlin.collections.emptySet(), "embed")

    override fun toString(): String = "GeneratedJsonAdapter(EmbedButtons)"

    override fun fromJson(reader: JsonReader): EmbedButtons {
        var embed: Boolean? = null
        var embedSet: Boolean = false
        var fullscreen: Boolean? = null
        var fullscreenSet: Boolean = false
        var hd: Boolean? = null
        var hdSet: Boolean = false
        var like: Boolean? = null
        var likeSet: Boolean = false
        var scaling: Boolean? = null
        var scalingSet: Boolean = false
        var share: Boolean? = null
        var shareSet: Boolean = false
        var watchLater: Boolean? = null
        var watchLaterSet: Boolean = false
        reader.beginObject()
        while (reader.hasNext()) {
            when (reader.selectName(options)) {
                0 ->  {
                    embed = nullableBooleanAdapter.fromJson(reader)
                    embedSet = true
                }
                1 ->  {
                    fullscreen = nullableBooleanAdapter.fromJson(reader)
                    fullscreenSet = true
                }
                2 ->  {
                    hd = nullableBooleanAdapter.fromJson(reader)
                    hdSet = true
                }
                3 ->  {
                    like = nullableBooleanAdapter.fromJson(reader)
                    likeSet = true
                }
                4 ->  {
                    scaling = nullableBooleanAdapter.fromJson(reader)
                    scalingSet = true
                }
                5 ->  {
                    share = nullableBooleanAdapter.fromJson(reader)
                    shareSet = true
                }
                6 ->  {
                    watchLater = nullableBooleanAdapter.fromJson(reader)
                    watchLaterSet = true
                }
                -1 -> {
                    // Unknown name, skip it.
                    reader.skipName()
                    reader.skipValue()
                }
            }
        }
        reader.endObject()
        var result = EmbedButtons()
        result = result.copy(
                embed = if (embedSet) embed else result.embed,
                fullscreen = if (fullscreenSet) fullscreen else result.fullscreen,
                hd = if (hdSet) hd else result.hd,
                like = if (likeSet) like else result.like,
                scaling = if (scalingSet) scaling else result.scaling,
                share = if (shareSet) share else result.share,
                watchLater = if (watchLaterSet) watchLater else result.watchLater)
        return result
    }

    override fun toJson(writer: JsonWriter, value: EmbedButtons?) {
        if (value == null) {
            throw NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.")
        }
        writer.beginObject()
        writer.name("embed")
        nullableBooleanAdapter.toJson(writer, value.embed)
        writer.name("fullscreen")
        nullableBooleanAdapter.toJson(writer, value.fullscreen)
        writer.name("hd")
        nullableBooleanAdapter.toJson(writer, value.hd)
        writer.name("like")
        nullableBooleanAdapter.toJson(writer, value.like)
        writer.name("scaling")
        nullableBooleanAdapter.toJson(writer, value.scaling)
        writer.name("share")
        nullableBooleanAdapter.toJson(writer, value.share)
        writer.name("watchlater")
        nullableBooleanAdapter.toJson(writer, value.watchLater)
        writer.endObject()
    }
}
