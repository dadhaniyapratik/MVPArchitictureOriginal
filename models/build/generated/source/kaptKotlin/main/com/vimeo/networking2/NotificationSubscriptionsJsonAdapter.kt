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

class NotificationSubscriptionsJsonAdapter(moshi: Moshi) : JsonAdapter<NotificationSubscriptions>() {
    private val options: JsonReader.Options =
            JsonReader.Options.of("modified_time", "subscriptions", "uri")

    private val nullableDateAdapter: JsonAdapter<Date?> =
            moshi.adapter<Date?>(Date::class.java, kotlin.collections.emptySet(), "modifiedTime")

    private val nullableSubscriptionsAdapter: JsonAdapter<Subscriptions?> =
            moshi.adapter<Subscriptions?>(Subscriptions::class.java, kotlin.collections.emptySet(), "subscriptions")

    private val nullableStringAdapter: JsonAdapter<String?> =
            moshi.adapter<String?>(String::class.java, kotlin.collections.emptySet(), "uri")

    override fun toString(): String = "GeneratedJsonAdapter(NotificationSubscriptions)"

    override fun fromJson(reader: JsonReader): NotificationSubscriptions {
        var modifiedTime: Date? = null
        var modifiedTimeSet: Boolean = false
        var subscriptions: Subscriptions? = null
        var subscriptionsSet: Boolean = false
        var uri: String? = null
        var uriSet: Boolean = false
        reader.beginObject()
        while (reader.hasNext()) {
            when (reader.selectName(options)) {
                0 ->  {
                    modifiedTime = nullableDateAdapter.fromJson(reader)
                    modifiedTimeSet = true
                }
                1 ->  {
                    subscriptions = nullableSubscriptionsAdapter.fromJson(reader)
                    subscriptionsSet = true
                }
                2 ->  {
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
        var result = NotificationSubscriptions()
        result = result.copy(
                modifiedTime = if (modifiedTimeSet) modifiedTime else result.modifiedTime,
                subscriptions = if (subscriptionsSet) subscriptions else result.subscriptions,
                uri = if (uriSet) uri else result.uri)
        return result
    }

    override fun toJson(writer: JsonWriter, value: NotificationSubscriptions?) {
        if (value == null) {
            throw NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.")
        }
        writer.beginObject()
        writer.name("modified_time")
        nullableDateAdapter.toJson(writer, value.modifiedTime)
        writer.name("subscriptions")
        nullableSubscriptionsAdapter.toJson(writer, value.subscriptions)
        writer.name("uri")
        nullableStringAdapter.toJson(writer, value.uri)
        writer.endObject()
    }
}
