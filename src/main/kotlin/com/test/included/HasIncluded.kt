package com.test.included

import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty

interface HasIncluded {
    @JsonProperty("included")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    fun getIncluded(): List<Any> {
        return listOf()
    }
}
