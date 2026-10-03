package com.fasterxml.jackson.databind.deser;

import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.module.SimpleModule;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.*;

public class BeanDeserializerTest {

    private ObjectMapper objectMapper;

    @Before
    public void setUp() {
        objectMapper = new ObjectMapper();
    }

    // --- Simple POJO for testing ---
    public static class SimpleBean {
        public String name;
        public int age;

        public SimpleBean() {}
        
        public SimpleBean(String name, int age) {
            this.name = name;
            this.age = age;
        }
    }

    public static class CreatorBean {
        public final String title;
        public final int id;

        public CreatorBean(String title, int id) {
            this.title = title;
            this.id = id;
        }
    }

    @Test
    public void testVanillaDeserializeSuccess() throws IOException {
        String json = "{\"name\":\"Alice\",\"age\":30}";
        SimpleBean bean = objectMapper.readValue(json, SimpleBean.class);
        assertNotNull(bean);
        assertEquals("Alice", bean.name);
        assertEquals(30, bean.age);
    }

    @Test
    public void testDeserializeOtherString() throws IOException {
        // Test VALUE_STRING branch in _deserializeOther using a deserializer configured for String creator or delegate
        ObjectMapper mapper = new ObjectMapper();
        // If a class only accepts string via creator
        String json = "\"JustAString\"";
        // Let's test basic scalar failure or handling if unsupported
        try {
            mapper.readValue(json, SimpleBean.class);
            fail("Expected JsonMappingException");
        } catch (JsonMappingException e) {
            assertNotNull(e.getMessage());
        }
    }

    @Test
    public void testDeserializeUnknownProperties() throws IOException {
        String json = "{\"name\":\"Bob\",\"age\":25,\"unknownProp\":\"shouldBeHandled\"}";
        SimpleBean bean = objectMapper.readValue(json, SimpleBean.class);
        assertNotNull(bean);
        assertEquals("Bob", bean.name);
        assertEquals(25, bean.age);
    }

    @Test(expected = JsonMappingException.class)
    public void testDeserializeInvalidTokenThrowsException() throws IOException {
        // Sending a boolean where an Object/Bean is expected should trigger default exception in _deserializeOther
        String json = "true";
        objectMapper.readValue(json, SimpleBean.class);
    }

    @Test
    public void testPropertyBasedCreator() throws IOException {
        String json = "{\"title\":\"Jackson Guide\",\"id\":101}";
        CreatorBean bean = objectMapper.readValue(json, CreatorBean.class);
        assertNotNull(bean);
        assertEquals("Jackson Guide", bean.title);
        assertEquals(101, bean.id);
    }

    @Test
    public void testEmptyObjectDeserialization() throws IOException {
        String json = "{}";
        SimpleBean bean = objectMapper.readValue(json, SimpleBean.class);
        assertNotNull(bean);
        assertNull(bean.name);
        assertEquals(0, bean.age);
    }

    @Test(expected = IOException.class)
    public void testMalformedJsonThrowsException() throws IOException {
        String json = "{\"name\":\"Unclosed";
        objectMapper.readValue(json, SimpleBean.class);
    }
}