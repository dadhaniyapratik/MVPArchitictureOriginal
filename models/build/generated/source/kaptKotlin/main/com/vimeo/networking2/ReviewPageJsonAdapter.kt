// Code generated by moshi-kotlin-codegen. Do not edit.
package com.vimeo.networking2

import com.squareup.moshi.JsonAdapter
import com.squareup.moshi.JsonReader
import com.squareup.moshi.JsonWriter
import com.squareup.moshi.Moshi
import java.lang.NullPointerException
import kotlin.Boolean
import kotlin.String

class ReviewPageJsonAdapter(moshi: Moshi) : JsonAdapter<ReviewPage>() {
    private val options: JsonReader.Options =
            JsonReader.Options.of("active", "link", "notes", "vimeo_logo")

    private val nullableBooleanAdapter: JsonAdapter<Boolean?> =
            moshi.adapter<Boolean?>(Boolean::class.javaObjectType, kotlin.collections.emptySet(), "active")

    private val nullableStringAdapter: JsonAdapter<String?> =
            moshi.adapter<String?>(String::class.java, kotlin.collections.emptySet(), "link")

    override fun toString(): String = "GeneratedJsonAdapter(ReviewPage)"

    override fun fromJson(reader: JsonReader): ReviewPage {
        var active: Boolean? = null
        var activeSet: Boolean = false
        var link: String? = null
        var linkSet: Boolean = false
        var notes: String? = null
        var notesSet: Boolean = false
        var vimeoLogo: Boolean? = null
        var vimeoLogoSet: Boolean = false
        reader.beginObject()
        while (reader.hasNext()) {
            when (reader.selectName(options)) {
                0 ->  {
                    active = nullableBooleanAdapter.fromJson(reader)
                    activeSet = true
                }
                1 ->  {
                    link = nullableStringAdapter.fromJson(reader)
                    linkSet = true
                }
                2 ->  {
                    notes = nullableStringAdapter.fromJson(reader)
                    notesSet = true
                }
                3 ->  {
                    vimeoLogo = nullableBooleanAdapter.fromJson(reader)
                    vimeoLogoSet = true
                }
                -1 -> {
                    // Unknown name, skip it.
                    reader.skipName()
                    reader.skipValue()
                }
            }
        }
        reader.endObject()
        var result = ReviewPage()
        result = result.copy(
                active = if (activeSet) active else result.active,
                link = if (linkSet) link else result.link,
                notes = if (notesSet) notes else result.notes,
                vimeoLogo = if (vimeoLogoSet) vimeoLogo else result.vimeoLogo)
        return result
    }

    override fun toJson(writer: JsonWriter, value: ReviewPage?) {
        if (value == null) {
            throw NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.")
        }
        writer.beginObject()
        writer.name("active")
        nullableBooleanAdapter.toJson(writer, value.active)
        writer.name("link")
        nullableStringAdapter.toJson(writer, value.link)
        writer.name("notes")
        nullableStringAdapter.toJson(writer, value.notes)
        writer.name("vimeo_logo")
        nullableBooleanAdapter.toJson(writer, value.vimeoLogo)
        writer.endObject()
    }
}