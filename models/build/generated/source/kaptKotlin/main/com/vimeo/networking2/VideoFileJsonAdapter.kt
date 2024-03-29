// Code generated by moshi-kotlin-codegen. Do not edit.
package com.vimeo.networking2

import com.squareup.moshi.JsonAdapter
import com.squareup.moshi.JsonReader
import com.squareup.moshi.JsonWriter
import com.squareup.moshi.Moshi
import java.lang.NullPointerException
import java.util.Date
import kotlin.Boolean
import kotlin.String

class VideoFileJsonAdapter(moshi: Moshi) : JsonAdapter<VideoFile>() {
    private val options: JsonReader.Options =
            JsonReader.Options.of("link", "link_expiration_time", "log")

    private val nullableStringAdapter: JsonAdapter<String?> =
            moshi.adapter<String?>(String::class.java, kotlin.collections.emptySet(), "link")

    private val nullableDateAdapter: JsonAdapter<Date?> =
            moshi.adapter<Date?>(Date::class.java, kotlin.collections.emptySet(), "linkExpirationTime")

    override fun toString(): String = "GeneratedJsonAdapter(VideoFile)"

    override fun fromJson(reader: JsonReader): VideoFile {
        var link: String? = null
        var linkSet: Boolean = false
        var linkExpirationTime: Date? = null
        var linkExpirationTimeSet: Boolean = false
        var log: String? = null
        var logSet: Boolean = false
        reader.beginObject()
        while (reader.hasNext()) {
            when (reader.selectName(options)) {
                0 ->  {
                    link = nullableStringAdapter.fromJson(reader)
                    linkSet = true
                }
                1 ->  {
                    linkExpirationTime = nullableDateAdapter.fromJson(reader)
                    linkExpirationTimeSet = true
                }
                2 ->  {
                    log = nullableStringAdapter.fromJson(reader)
                    logSet = true
                }
                -1 -> {
                    // Unknown name, skip it.
                    reader.skipName()
                    reader.skipValue()
                }
            }
        }
        reader.endObject()
        var result = VideoFile()
        result = result.copy(
                link = if (linkSet) link else result.link,
                linkExpirationTime = if (linkExpirationTimeSet) linkExpirationTime else result.linkExpirationTime,
                log = if (logSet) log else result.log)
        return result
    }

    override fun toJson(writer: JsonWriter, value: VideoFile?) {
        if (value == null) {
            throw NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.")
        }
        writer.beginObject()
        writer.name("link")
        nullableStringAdapter.toJson(writer, value.link)
        writer.name("link_expiration_time")
        nullableDateAdapter.toJson(writer, value.linkExpirationTime)
        writer.name("log")
        nullableStringAdapter.toJson(writer, value.log)
        writer.endObject()
    }
}
