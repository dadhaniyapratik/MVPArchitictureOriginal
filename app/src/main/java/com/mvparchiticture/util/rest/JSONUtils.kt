package com.mvparchiticture.util.rest

import com.fasterxml.jackson.databind.ObjectMapper
import com.fasterxml.jackson.annotation.JsonAutoDetect
import com.fasterxml.jackson.core.type.TypeReference
import com.fasterxml.jackson.databind.DeserializationFeature
import com.fasterxml.jackson.databind.SerializationFeature
import com.mvparchiticture.data.model.response.ErrorResponse
import com.mvparchiticture.util.extensions.readValue
import java.lang.Compiler.enable
import java.lang.Compiler.disable



object JSONUtils{

    private var jsonMapper  = ObjectMapper()

    fun getJsonMapper() : ObjectMapper {

            // to enable standard indentation ("pretty-printing"):
            jsonMapper.enable(SerializationFeature.INDENT_OUTPUT)
            // to allow serialization of "empty" POJOs (no properties to serialize)
            // (without this setting, an exception is thrown in those cases)
            jsonMapper.disable(SerializationFeature.FAIL_ON_EMPTY_BEANS)
            // to write java.util.Date, Calendar as number (timestamp):
            jsonMapper.disable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS)

            // DeserializationFeature for changing how JSON is read as POJOs:

            // to prevent exception when encountering unknown property:
            jsonMapper.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES)
            // to allow coercion of JSON empty String ("") to null Object value:
            jsonMapper.enable(DeserializationFeature.ACCEPT_EMPTY_STRING_AS_NULL_OBJECT)
            jsonMapper.setVisibility(jsonMapper.serializationConfig
                    .defaultVisibilityChecker
                    .withFieldVisibility(JsonAutoDetect.Visibility.ANY)
                    .withGetterVisibility(JsonAutoDetect.Visibility.NONE)
                    .withSetterVisibility(JsonAutoDetect.Visibility.NONE)
                    .withCreatorVisibility(JsonAutoDetect.Visibility.NONE))


        return jsonMapper
    }

    fun convertObjectToJson(obj: Any) : String{
        return jsonMapper.writeValueAsString(obj)
    }



}