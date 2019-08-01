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

class SpaceJsonAdapter(moshi: Moshi) : JsonAdapter<Space>() {
    private val options: JsonReader.Options =
            JsonReader.Options.of("free", "max", "showing", "used")

    private val nullableLongAdapter: JsonAdapter<Long?> =
            moshi.adapter<Long?>(Long::class.javaObjectType, kotlin.collections.emptySet(), "free")

    private val nullableStringAdapter: JsonAdapter<String?> =
            moshi.adapter<String?>(String::class.java, kotlin.collections.emptySet(), "showing")

    override fun toString(): String = "GeneratedJsonAdapter(Space)"

    override fun fromJson(reader: JsonReader): Space {
        var free: Long? = null
        var freeSet: Boolean = false
        var max: Long? = null
        var maxSet: Boolean = false
        var showing: String? = null
        var showingSet: Boolean = false
        var used: Long? = null
        var usedSet: Boolean = false
        reader.beginObject()
        while (reader.hasNext()) {
            when (reader.selectName(options)) {
                0 ->  {
                    free = nullableLongAdapter.fromJson(reader)
                    freeSet = true
                }
                1 ->  {
                    max = nullableLongAdapter.fromJson(reader)
                    maxSet = true
                }
                2 ->  {
                    showing = nullableStringAdapter.fromJson(reader)
                    showingSet = true
                }
                3 ->  {
                    used = nullableLongAdapter.fromJson(reader)
                    usedSet = true
                }
                -1 -> {
                    // Unknown name, skip it.
                    reader.skipName()
                    reader.skipValue()
                }
            }
        }
        reader.endObject()
        var result = Space()
        result = result.copy(
                free = if (freeSet) free else result.free,
                max = if (maxSet) max else result.max,
                showing = if (showingSet) showing else result.showing,
                used = if (usedSet) used else result.used)
        return result
    }

    override fun toJson(writer: JsonWriter, value: Space?) {
        if (value == null) {
            throw NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.")
        }
        writer.beginObject()
        writer.name("free")
        nullableLongAdapter.toJson(writer, value.free)
        writer.name("max")
        nullableLongAdapter.toJson(writer, value.max)
        writer.name("showing")
        nullableStringAdapter.toJson(writer, value.showing)
        writer.name("used")
        nullableLongAdapter.toJson(writer, value.used)
        writer.endObject()
    }
}
