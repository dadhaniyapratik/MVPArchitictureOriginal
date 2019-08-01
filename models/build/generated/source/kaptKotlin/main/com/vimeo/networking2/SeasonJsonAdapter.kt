// Code generated by moshi-kotlin-codegen. Do not edit.
package com.vimeo.networking2

import com.squareup.moshi.JsonAdapter
import com.squareup.moshi.JsonReader
import com.squareup.moshi.JsonWriter
import com.squareup.moshi.Moshi
import com.squareup.moshi.Types
import java.lang.NullPointerException
import kotlin.Boolean
import kotlin.Int
import kotlin.String

class SeasonJsonAdapter(moshi: Moshi) : JsonAdapter<Season>() {
    private val options: JsonReader.Options =
            JsonReader.Options.of("description", "metadata", "name", "position", "resource_key", "type", "uri", "user")

    private val nullableStringAdapter: JsonAdapter<String?> =
            moshi.adapter<String?>(String::class.java, kotlin.collections.emptySet(), "description")

    private val nullableMetadataOfSeasonConnectionsSeasonInteractionsAdapter: JsonAdapter<Metadata<SeasonConnections, SeasonInteractions>?> =
            moshi.adapter<Metadata<SeasonConnections, SeasonInteractions>?>(Types.newParameterizedType(Metadata::class.java, SeasonConnections::class.java, SeasonInteractions::class.java), kotlin.collections.emptySet(), "metadata")

    private val nullableIntAdapter: JsonAdapter<Int?> =
            moshi.adapter<Int?>(Int::class.javaObjectType, kotlin.collections.emptySet(), "position")

    private val nullableUserAdapter: JsonAdapter<User?> =
            moshi.adapter<User?>(User::class.java, kotlin.collections.emptySet(), "user")

    override fun toString(): String = "GeneratedJsonAdapter(Season)"

    override fun fromJson(reader: JsonReader): Season {
        var description: String? = null
        var descriptionSet: Boolean = false
        var metadata: Metadata<SeasonConnections, SeasonInteractions>? = null
        var metadataSet: Boolean = false
        var name: String? = null
        var nameSet: Boolean = false
        var position: Int? = null
        var positionSet: Boolean = false
        var resourceKey: String? = null
        var resourceKeySet: Boolean = false
        var rawType: String? = null
        var rawTypeSet: Boolean = false
        var uri: String? = null
        var uriSet: Boolean = false
        var user: User? = null
        var userSet: Boolean = false
        reader.beginObject()
        while (reader.hasNext()) {
            when (reader.selectName(options)) {
                0 ->  {
                    description = nullableStringAdapter.fromJson(reader)
                    descriptionSet = true
                }
                1 ->  {
                    metadata = nullableMetadataOfSeasonConnectionsSeasonInteractionsAdapter.fromJson(reader)
                    metadataSet = true
                }
                2 ->  {
                    name = nullableStringAdapter.fromJson(reader)
                    nameSet = true
                }
                3 ->  {
                    position = nullableIntAdapter.fromJson(reader)
                    positionSet = true
                }
                4 ->  {
                    resourceKey = nullableStringAdapter.fromJson(reader)
                    resourceKeySet = true
                }
                5 ->  {
                    rawType = nullableStringAdapter.fromJson(reader)
                    rawTypeSet = true
                }
                6 ->  {
                    uri = nullableStringAdapter.fromJson(reader)
                    uriSet = true
                }
                7 ->  {
                    user = nullableUserAdapter.fromJson(reader)
                    userSet = true
                }
                -1 -> {
                    // Unknown name, skip it.
                    reader.skipName()
                    reader.skipValue()
                }
            }
        }
        reader.endObject()
        var result = Season()
        result = result.copy(
                description = if (descriptionSet) description else result.description,
                metadata = if (metadataSet) metadata else result.metadata,
                name = if (nameSet) name else result.name,
                position = if (positionSet) position else result.position,
                resourceKey = if (resourceKeySet) resourceKey else result.resourceKey,
                rawType = if (rawTypeSet) rawType else result.rawType,
                uri = if (uriSet) uri else result.uri,
                user = if (userSet) user else result.user)
        return result
    }

    override fun toJson(writer: JsonWriter, value: Season?) {
        if (value == null) {
            throw NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.")
        }
        writer.beginObject()
        writer.name("description")
        nullableStringAdapter.toJson(writer, value.description)
        writer.name("metadata")
        nullableMetadataOfSeasonConnectionsSeasonInteractionsAdapter.toJson(writer, value.metadata)
        writer.name("name")
        nullableStringAdapter.toJson(writer, value.name)
        writer.name("position")
        nullableIntAdapter.toJson(writer, value.position)
        writer.name("resource_key")
        nullableStringAdapter.toJson(writer, value.resourceKey)
        writer.name("type")
        nullableStringAdapter.toJson(writer, value.rawType)
        writer.name("uri")
        nullableStringAdapter.toJson(writer, value.uri)
        writer.name("user")
        nullableUserAdapter.toJson(writer, value.user)
        writer.endObject()
    }
}