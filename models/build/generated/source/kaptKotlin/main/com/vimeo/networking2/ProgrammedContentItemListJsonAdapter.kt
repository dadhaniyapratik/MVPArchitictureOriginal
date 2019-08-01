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
import kotlin.collections.List

class ProgrammedContentItemListJsonAdapter(moshi: Moshi) : JsonAdapter<ProgrammedContentItemList>() {
    private val options: JsonReader.Options =
            JsonReader.Options.of("total", "page", "per_page", "paging", "data")

    private val nullableIntAdapter: JsonAdapter<Int?> =
            moshi.adapter<Int?>(Int::class.javaObjectType, kotlin.collections.emptySet(), "total")

    private val nullablePagingAdapter: JsonAdapter<Paging?> =
            moshi.adapter<Paging?>(Paging::class.java, kotlin.collections.emptySet(), "paging")

    private val nullableListOfProgrammedContentItemAdapter: JsonAdapter<List<ProgrammedContentItem>?> =
            moshi.adapter<List<ProgrammedContentItem>?>(Types.newParameterizedType(List::class.java, ProgrammedContentItem::class.java), kotlin.collections.emptySet(), "data")

    override fun toString(): String = "GeneratedJsonAdapter(ProgrammedContentItemList)"

    override fun fromJson(reader: JsonReader): ProgrammedContentItemList {
        var total: Int? = null
        var totalSet: Boolean = false
        var page: Int? = null
        var pageSet: Boolean = false
        var perPage: Int? = null
        var perPageSet: Boolean = false
        var paging: Paging? = null
        var pagingSet: Boolean = false
        var data: List<ProgrammedContentItem>? = null
        var dataSet: Boolean = false
        reader.beginObject()
        while (reader.hasNext()) {
            when (reader.selectName(options)) {
                0 ->  {
                    total = nullableIntAdapter.fromJson(reader)
                    totalSet = true
                }
                1 ->  {
                    page = nullableIntAdapter.fromJson(reader)
                    pageSet = true
                }
                2 ->  {
                    perPage = nullableIntAdapter.fromJson(reader)
                    perPageSet = true
                }
                3 ->  {
                    paging = nullablePagingAdapter.fromJson(reader)
                    pagingSet = true
                }
                4 ->  {
                    data = nullableListOfProgrammedContentItemAdapter.fromJson(reader)
                    dataSet = true
                }
                -1 -> {
                    // Unknown name, skip it.
                    reader.skipName()
                    reader.skipValue()
                }
            }
        }
        reader.endObject()
        var result = ProgrammedContentItemList()
        result = result.copy(
                total = if (totalSet) total else result.total,
                page = if (pageSet) page else result.page,
                perPage = if (perPageSet) perPage else result.perPage,
                paging = if (pagingSet) paging else result.paging,
                data = if (dataSet) data else result.data)
        return result
    }

    override fun toJson(writer: JsonWriter, value: ProgrammedContentItemList?) {
        if (value == null) {
            throw NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.")
        }
        writer.beginObject()
        writer.name("total")
        nullableIntAdapter.toJson(writer, value.total)
        writer.name("page")
        nullableIntAdapter.toJson(writer, value.page)
        writer.name("per_page")
        nullableIntAdapter.toJson(writer, value.perPage)
        writer.name("paging")
        nullablePagingAdapter.toJson(writer, value.paging)
        writer.name("data")
        nullableListOfProgrammedContentItemAdapter.toJson(writer, value.data)
        writer.endObject()
    }
}
