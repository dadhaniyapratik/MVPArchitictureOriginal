package com.mvparchiticture.data.model.response

import com.fasterxml.jackson.annotation.JsonProperty

class ResultResponseVimeo<out T> {

    @JsonProperty("data")
    val data: T? = null
    }