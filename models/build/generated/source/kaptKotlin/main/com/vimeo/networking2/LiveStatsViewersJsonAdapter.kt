// Code generated by moshi-kotlin-codegen. Do not edit.
package com.vimeo.networking2

import com.squareup.moshi.JsonAdapter
import com.squareup.moshi.JsonReader
import com.squareup.moshi.JsonWriter
import com.squareup.moshi.Moshi
import java.lang.NullPointerException
import kotlin.Boolean
import kotlin.Long
import kotlin.String

class LiveStatsViewersJsonAdapter(moshi: Moshi) : JsonAdapter<LiveStatsViewers>() {
    private val options: JsonReader.Options = JsonReader.Options.of("current", "peak")

    private val nullableLongAdapter: JsonAdapter<Long?> =
            moshi.adapter<Long?>(Long::class.javaObjectType, kotlin.collections.emptySet(), "current")

    override fun toString(): String = "GeneratedJsonAdapter(LiveStatsViewers)"

    override fun fromJson(reader: JsonReader): LiveStatsViewers {
        var current: Long? = null
        var currentSet: Boolean = false
        var peak: Long? = null
        var peakSet: Boolean = false
        reader.beginObject()
        while (reader.hasNext()) {
            when (reader.selectName(options)) {
                0 ->  {
                    current = nullableLongAdapter.fromJson(reader)
                    currentSet = true
                }
                1 ->  {
                    peak = nullableLongAdapter.fromJson(reader)
                    peakSet = true
                }
                -1 -> {
                    // Unknown name, skip it.
                    reader.skipName()
                    reader.skipValue()
                }
            }
        }
        reader.endObject()
        var result = LiveStatsViewers()
        result = result.copy(
                current = if (currentSet) current else result.current,
                peak = if (peakSet) peak else result.peak)
        return result
    }

    override fun toJson(writer: JsonWriter, value: LiveStatsViewers?) {
        if (value == null) {
            throw NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.")
        }
        writer.beginObject()
        writer.name("current")
        nullableLongAdapter.toJson(writer, value.current)
        writer.name("peak")
        nullableLongAdapter.toJson(writer, value.peak)
        writer.endObject()
    }
}