// Code generated by moshi-kotlin-codegen. Do not edit.
package com.vimeo.networking2

import com.squareup.moshi.JsonAdapter
import com.squareup.moshi.JsonReader
import com.squareup.moshi.JsonWriter
import com.squareup.moshi.Moshi
import java.lang.NullPointerException
import kotlin.Boolean
import kotlin.String

class PurchaseOnDemandInteractionJsonAdapter(moshi: Moshi) : JsonAdapter<PurchaseOnDemandInteraction>() {
    private val options: JsonReader.Options = JsonReader.Options.of("buy", "subscribe")

    private val nullableBuyInteractionAdapter: JsonAdapter<BuyInteraction?> =
            moshi.adapter<BuyInteraction?>(BuyInteraction::class.java, kotlin.collections.emptySet(), "buy")

    private val nullableSubscriptionInteractionAdapter: JsonAdapter<SubscriptionInteraction?> =
            moshi.adapter<SubscriptionInteraction?>(SubscriptionInteraction::class.java, kotlin.collections.emptySet(), "subscriptionInteraction")

    override fun toString(): String = "GeneratedJsonAdapter(PurchaseOnDemandInteraction)"

    override fun fromJson(reader: JsonReader): PurchaseOnDemandInteraction {
        var buy: BuyInteraction? = null
        var buySet: Boolean = false
        var subscriptionInteraction: SubscriptionInteraction? = null
        var subscriptionInteractionSet: Boolean = false
        reader.beginObject()
        while (reader.hasNext()) {
            when (reader.selectName(options)) {
                0 ->  {
                    buy = nullableBuyInteractionAdapter.fromJson(reader)
                    buySet = true
                }
                1 ->  {
                    subscriptionInteraction = nullableSubscriptionInteractionAdapter.fromJson(reader)
                    subscriptionInteractionSet = true
                }
                -1 -> {
                    // Unknown name, skip it.
                    reader.skipName()
                    reader.skipValue()
                }
            }
        }
        reader.endObject()
        var result = PurchaseOnDemandInteraction()
        result = result.copy(
                buy = if (buySet) buy else result.buy,
                subscriptionInteraction = if (subscriptionInteractionSet) subscriptionInteraction else result.subscriptionInteraction)
        return result
    }

    override fun toJson(writer: JsonWriter, value: PurchaseOnDemandInteraction?) {
        if (value == null) {
            throw NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.")
        }
        writer.beginObject()
        writer.name("buy")
        nullableBuyInteractionAdapter.toJson(writer, value.buy)
        writer.name("subscribe")
        nullableSubscriptionInteractionAdapter.toJson(writer, value.subscriptionInteraction)
        writer.endObject()
    }
}