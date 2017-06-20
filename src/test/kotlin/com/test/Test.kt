package com.test

import com.fasterxml.jackson.databind.ObjectMapper
import com.fasterxml.jackson.module.kotlin.KotlinModule
import org.junit.Assert.assertEquals
import org.junit.Test

class Test {
    companion object {
        private val MAPPER = ObjectMapper().registerModule(KotlinModule())
    }

    @Test
    @Throws(Exception::class)
    fun verySimpleSerializationTest() {
        val doc = DummyDocument()

        val actual = MAPPER.writerWithDefaultPrettyPrinter().writeValueAsString(doc)

        assertEquals(actual, "{\n  \"data\" : \"test\",\n  \"included\" : [ \"test\" ]\n}")

    }
}

internal class DummyDocument : DocumentSingleResponse {
    fun getData(): String {
        return "test"
    }

//    override fun getIncluded(): List<String> {
//        return listOf("test")
//    }
}
