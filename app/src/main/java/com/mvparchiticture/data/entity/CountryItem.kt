package com.mvparchiticture.data.entity

import android.os.Parcelable
import com.fasterxml.jackson.annotation.JsonProperty
import kotlinx.android.parcel.Parcelize


@Parcelize
data class CountryItem(@field:JsonProperty("name") var name: String = "",
                       @field:JsonProperty("flag") var flag: String = "",

//                       @field:JsonProperty("borders") var borders: MutableList<String> = mutableListOf(),
                       var isExpanded: Boolean = false) : Parcelable