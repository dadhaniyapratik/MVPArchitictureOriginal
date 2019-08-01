package com.mvparchiticture.data.model.request

import com.fasterxml.jackson.annotation.JsonProperty

data class ContactUsRequest(
        @field:JsonProperty("name") val name : String="",
        @field:JsonProperty("emailaddress") val emailaddress : String="",
        @field:JsonProperty("comment") val comment : String=""
)