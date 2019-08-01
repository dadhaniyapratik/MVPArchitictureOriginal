// Code generated by moshi-kotlin-codegen. Do not edit.
package com.vimeo.networking2

import com.squareup.moshi.JsonAdapter
import com.squareup.moshi.JsonReader
import com.squareup.moshi.JsonWriter
import com.squareup.moshi.Moshi
import java.lang.NullPointerException
import kotlin.Boolean
import kotlin.String

class GroupConnectionsJsonAdapter(moshi: Moshi) : JsonAdapter<GroupConnections>() {
    private val options: JsonReader.Options = JsonReader.Options.of("users", "videos")

    private val nullableConnectionAdapter: JsonAdapter<Connection?> =
            moshi.adapter<Connection?>(Connection::class.java, kotlin.collections.emptySet(), "users")

    override fun toString(): String = "GeneratedJsonAdapter(GroupConnections)"

    override fun fromJson(reader: JsonReader): GroupConnections {
        var users: Connection? = null
        var usersSet: Boolean = false
        var videos: Connection? = null
        var videosSet: Boolean = false
        reader.beginObject()
        while (reader.hasNext()) {
            when (reader.selectName(options)) {
                0 ->  {
                    users = nullableConnectionAdapter.fromJson(reader)
                    usersSet = true
                }
                1 ->  {
                    videos = nullableConnectionAdapter.fromJson(reader)
                    videosSet = true
                }
                -1 -> {
                    // Unknown name, skip it.
                    reader.skipName()
                    reader.skipValue()
                }
            }
        }
        reader.endObject()
        var result = GroupConnections()
        result = result.copy(
                users = if (usersSet) users else result.users,
                videos = if (videosSet) videos else result.videos)
        return result
    }

    override fun toJson(writer: JsonWriter, value: GroupConnections?) {
        if (value == null) {
            throw NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.")
        }
        writer.beginObject()
        writer.name("users")
        nullableConnectionAdapter.toJson(writer, value.users)
        writer.name("videos")
        nullableConnectionAdapter.toJson(writer, value.videos)
        writer.endObject()
    }
}
