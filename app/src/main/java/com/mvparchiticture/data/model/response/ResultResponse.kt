package com.mvparchiticture.data.model.response

import com.fasterxml.jackson.annotation.JsonFormat
import com.fasterxml.jackson.annotation.JsonProperty

class ResultResponse<out T> {

    @JsonProperty("")
    val data: T? = null
//
//   @JsonProperty("ResponseCode")
//    val code: Int? = null
//
//    @JsonProperty("ResponseMessage")
//    val message: String? = null

}