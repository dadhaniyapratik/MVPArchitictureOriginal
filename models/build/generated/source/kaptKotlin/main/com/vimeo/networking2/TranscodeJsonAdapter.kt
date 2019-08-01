// Code generated by moshi-kotlin-codegen. Do not edit.
package com.vimeo.networking2

import com.squareup.moshi.JsonAdapter
import com.squareup.moshi.JsonReader
import com.squareup.moshi.JsonWriter
import com.squareup.moshi.Moshi
import java.lang.NullPointerException
import kotlin.Boolean
import kotlin.String

class TranscodeJsonAdapter(moshi: Moshi) : JsonAdapter<Transcode>() {
    private val options: JsonReader.Options = JsonReader.Options.of("status")

    private val nullableStringAdapter: JsonAdapter<String?> =
            moshi.adapter<String?>(String::class.java, kotlin.collections.emptySet(), "status")

    override fun toString(): String = "GeneratedJsonAdapter(Transcode)"

    override fun fromJson(reader: JsonReader): Transcode {
        var status: String? = null
        var statusSet: Boolean = false
        reader.beginObject()
        while (reader.hasNext()) {
            when (reader.selectName(options)) {
                0 ->  {
                    status = nullableStringAdapter.fromJson(reader)
                    statusSet = true
                }
                -1 -> {
                    // Unknown name, skip it.
                    reader.skipName()
                    reader.skipValue()
                }
            }
        }
        reader.endObject()
        var result = Transcode()
        result = result.copy(
                status = if (statusSet) status else result.status)
        return result
    }

    override fun toJson(writer: JsonWriter, value: Transcode?) {
        if (value == null) {
            throw NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.")
        }
        writer.beginObject()
        writer.name("status")
        nullableStringAdapter.toJson(writer, value.status)
        writer.endObject()
    }
}
