package com.mvparchiticture.data.model.response

import com.fasterxml.jackson.annotation.JsonProperty


data class ErrorResponse(@field:JsonProperty("ResponseCode") val code: Int? = null,
                         @field:JsonProperty("ResponseMessage") val message: String? = null) {

}