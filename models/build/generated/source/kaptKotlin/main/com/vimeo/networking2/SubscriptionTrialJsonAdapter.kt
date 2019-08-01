// Code generated by moshi-kotlin-codegen. Do not edit.
package com.vimeo.networking2

import com.squareup.moshi.JsonAdapter
import com.squareup.moshi.JsonReader
import com.squareup.moshi.JsonWriter
import com.squareup.moshi.Moshi
import java.lang.NullPointerException
import kotlin.Boolean
import kotlin.String

class SubscriptionTrialJsonAdapter(moshi: Moshi) : JsonAdapter<SubscriptionTrial>() {
    private val options: JsonReader.Options =
            JsonReader.Options.of("status", "has_been_in_free_trial")

    private val nullableStringAdapter: JsonAdapter<String?> =
            moshi.adapter<String?>(String::class.java, kotlin.collections.emptySet(), "rawStatus")

    private val nullableBooleanAdapter: JsonAdapter<Boolean?> =
            moshi.adapter<Boolean?>(Boolean::class.javaObjectType, kotlin.collections.emptySet(), "hasBeenInFreeTrial")

    override fun toString(): String = "GeneratedJsonAdapter(SubscriptionTrial)"

    override fun fromJson(reader: JsonReader): SubscriptionTrial {
        var rawStatus: String? = null
        var rawStatusSet: Boolean = false
        var hasBeenInFreeTrial: Boolean? = null
        var hasBeenInFreeTrialSet: Boolean = false
        reader.beginObject()
        while (reader.hasNext()) {
            when (reader.selectName(options)) {
                0 ->  {
                    rawStatus = nullableStringAdapter.fromJson(reader)
                    rawStatusSet = true
                }
                1 ->  {
                    hasBeenInFreeTrial = nullableBooleanAdapter.fromJson(reader)
                    hasBeenInFreeTrialSet = true
                }
                -1 -> {
                    // Unknown name, skip it.
                    reader.skipName()
                    reader.skipValue()
                }
            }
        }
        reader.endObject()
        var result = SubscriptionTrial()
        result = result.copy(
                rawStatus = if (rawStatusSet) rawStatus else result.rawStatus,
                hasBeenInFreeTrial = if (hasBeenInFreeTrialSet) hasBeenInFreeTrial else result.hasBeenInFreeTrial)
        return result
    }

    override fun toJson(writer: JsonWriter, value: SubscriptionTrial?) {
        if (value == null) {
            throw NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.")
        }
        writer.beginObject()
        writer.name("status")
        nullableStringAdapter.toJson(writer, value.rawStatus)
        writer.name("has_been_in_free_trial")
        nullableBooleanAdapter.toJson(writer, value.hasBeenInFreeTrial)
        writer.endObject()
    }
}
