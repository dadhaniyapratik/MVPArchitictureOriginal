// Code generated by moshi-kotlin-codegen. Do not edit.
package com.vimeo.networking2

import com.squareup.moshi.JsonAdapter
import com.squareup.moshi.JsonReader
import com.squareup.moshi.JsonWriter
import com.squareup.moshi.Moshi
import java.lang.NullPointerException
import kotlin.Boolean
import kotlin.Int
import kotlin.String

class NotificationConnectionJsonAdapter(moshi: Moshi) : JsonAdapter<NotificationConnection>() {
    private val options: JsonReader.Options =
            JsonReader.Options.of("new_total", "total", "type_count", "type_unseen_count", "unread_total", "uri")

    private val nullableIntAdapter: JsonAdapter<Int?> =
            moshi.adapter<Int?>(Int::class.javaObjectType, kotlin.collections.emptySet(), "newTotal")

    private val nullableNotificationTypeCountAdapter: JsonAdapter<NotificationTypeCount?> =
            moshi.adapter<NotificationTypeCount?>(NotificationTypeCount::class.java, kotlin.collections.emptySet(), "typeCount")

    private val nullableStringAdapter: JsonAdapter<String?> =
            moshi.adapter<String?>(String::class.java, kotlin.collections.emptySet(), "uri")

    override fun toString(): String = "GeneratedJsonAdapter(NotificationConnection)"

    override fun fromJson(reader: JsonReader): NotificationConnection {
        var newTotal: Int? = null
        var newTotalSet: Boolean = false
        var total: Int? = null
        var totalSet: Boolean = false
        var typeCount: NotificationTypeCount? = null
        var typeCountSet: Boolean = false
        var typeUnseenCount: NotificationTypeCount? = null
        var typeUnseenCountSet: Boolean = false
        var unreadTotal: Int? = null
        var unreadTotalSet: Boolean = false
        var uri: String? = null
        var uriSet: Boolean = false
        reader.beginObject()
        while (reader.hasNext()) {
            when (reader.selectName(options)) {
                0 ->  {
                    newTotal = nullableIntAdapter.fromJson(reader)
                    newTotalSet = true
                }
                1 ->  {
                    total = nullableIntAdapter.fromJson(reader)
                    totalSet = true
                }
                2 ->  {
                    typeCount = nullableNotificationTypeCountAdapter.fromJson(reader)
                    typeCountSet = true
                }
                3 ->  {
                    typeUnseenCount = nullableNotificationTypeCountAdapter.fromJson(reader)
                    typeUnseenCountSet = true
                }
                4 ->  {
                    unreadTotal = nullableIntAdapter.fromJson(reader)
                    unreadTotalSet = true
                }
                5 ->  {
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
        var result = NotificationConnection()
        result = result.copy(
                newTotal = if (newTotalSet) newTotal else result.newTotal,
                total = if (totalSet) total else result.total,
                typeCount = if (typeCountSet) typeCount else result.typeCount,
                typeUnseenCount = if (typeUnseenCountSet) typeUnseenCount else result.typeUnseenCount,
                unreadTotal = if (unreadTotalSet) unreadTotal else result.unreadTotal,
                uri = if (uriSet) uri else result.uri)
        return result
    }

    override fun toJson(writer: JsonWriter, value: NotificationConnection?) {
        if (value == null) {
            throw NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.")
        }
        writer.beginObject()
        writer.name("new_total")
        nullableIntAdapter.toJson(writer, value.newTotal)
        writer.name("total")
        nullableIntAdapter.toJson(writer, value.total)
        writer.name("type_count")
        nullableNotificationTypeCountAdapter.toJson(writer, value.typeCount)
        writer.name("type_unseen_count")
        nullableNotificationTypeCountAdapter.toJson(writer, value.typeUnseenCount)
        writer.name("unread_total")
        nullableIntAdapter.toJson(writer, value.unreadTotal)
        writer.name("uri")
        nullableStringAdapter.toJson(writer, value.uri)
        writer.endObject()
    }
}
