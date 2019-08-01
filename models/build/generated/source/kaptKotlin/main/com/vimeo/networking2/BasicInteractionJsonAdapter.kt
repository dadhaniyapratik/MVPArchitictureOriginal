// Code generated by moshi-kotlin-codegen. Do not edit.
package com.vimeo.networking2

import com.squareup.moshi.JsonAdapter
import com.squareup.moshi.JsonReader
import com.squareup.moshi.JsonWriter
import com.squareup.moshi.Moshi
import com.squareup.moshi.Types
import java.lang.NullPointerException
import kotlin.Boolean
import kotlin.String
import kotlin.collections.List

class BasicInteractionJsonAdapter(moshi: Moshi) : JsonAdapter<BasicInteraction>() {
    private val options: JsonReader.Options = JsonReader.Options.of("options", "uri")

    private val nullableListOfStringAdapter: JsonAdapter<List<String>?> =
            moshi.adapter<List<String>?>(Types.newParameterizedType(List::class.java, String::class.java), kotlin.collections.emptySet(), "options")

    private val nullableStringAdapter: JsonAdapter<String?> =
            moshi.adapter<String?>(String::class.java, kotlin.collections.emptySet(), "uri")

    override fun toString(): String = "GeneratedJsonAdapter(BasicInteraction)"

    override fun fromJson(reader: JsonReader): BasicInteraction {
        var options_: List<String>? = null
        var optionsSet: Boolean = false
        var uri: String? = null
        var uriSet: Boolean = false
        reader.beginObject()
        while (reader.hasNext()) {
            when (reader.selectName(options)) {
                0 ->  {
                    options_ = nullableListOfStringAdapter.fromJson(reader)
                    optionsSet = true
                }
                1 ->  {
                    uri = nullableStringAdapter.fromJson(reader)
                    uriSet = true
                }
                -1 -> {
                    // Unknown name, skip it.
                    reader.skipName()
                    reader.skipValue()
                }
            }
        }
        reader.endObject()
        var result = BasicInteraction()
        result = result.copy(
                options = if (optionsSet) options_ else result.options,
                uri = if (uriSet) uri else result.uri)
        return result
    }

    override fun toJson(writer: JsonWriter, value: BasicInteraction?) {
        if (value == null) {
            throw NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.")
        }
        writer.beginObject()
        writer.name("options")
        nullableListOfStringAdapter.toJson(writer, value.options)
        writer.name("uri")
        nullableStringAdapter.toJson(writer, value.uri)
        writer.endObject()
    }
}
