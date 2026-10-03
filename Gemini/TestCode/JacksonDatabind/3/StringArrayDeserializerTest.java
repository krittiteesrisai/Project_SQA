package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.*;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.*;

public class StringArrayDeserializerTest {

    private final ObjectMapper mapper = new ObjectMapper();
    private final JsonFactory jsonFactory = new JsonFactory();

    @Test
    public void testDeserializeStandardStringArray() throws IOException {
        String json = "[\"apple\", \"banana\", null, \"cherry\"]";
        JsonParser jp = jsonFactory.createParser(json);
        DeserializationContext ctxt = mapper.getDeserializationContext();

        // ขยับ Parser ไปที่ START_ARRAY
        jp.nextToken();

        String[] result = StringArrayDeserializer.instance.deserialize(jp, ctxt);

        assertNotNull(result);
        assertEquals(4, result.length);
        assertEquals("apple", result[0]);
        assertEquals("banana", result[1]);
        assertNull(result[2]);
        assertEquals("cherry", result[3]);
    }

    @Test
    public void testDeserializeWithNonStringValues() throws IOException {
        // ทดสอบการแปลงค่าตัวเลขและ Boolean ภายในอาเรย์ให้เป็น String
        String json = "[123, true]";
        JsonParser jp = jsonFactory.createParser(json);
        DeserializationContext ctxt = mapper.getDeserializationContext();
        jp.nextToken();

        String[] result = StringArrayDeserializer.instance.deserialize(jp, ctxt);

        assertNotNull(result);
        assertEquals(2, result.length);
        assertEquals("123", result[0]);
        assertEquals("true", result[1]);
    }

    @Test
    public void testDeserializeChunkOverflowBoundary() throws IOException {
        // ทดสอบการขยาย ObjectBuffer เมื่อข้อมูลเกินขนาด chunk เริ่มต้น (โดยปกติ chunk เริ่มต้นขนาดเล็ก)
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < 200; i++) {
            sb.append("\"item").append(i).append("\"");
            if (i < 199) sb.append(",");
        }
        sb.append("]");

        JsonParser jp = jsonFactory.createParser(sb.toString());
        DeserializationContext ctxt = mapper.getDeserializationContext();
        jp.nextToken();

        String[] result = StringArrayDeserializer.instance.deserialize(jp, ctxt);

        assertNotNull(result);
        assertEquals(200, result.length);
        assertEquals("item0", result[0]);
        assertEquals("item199", result[199]);
    }

    @Test
    public void testHandleNonArrayThrowsMappingException() throws IOException {
        // ทดสอบกรณีส่ง Object เดี่ยวหรือค่าอื่นๆ มาโดยไม่เปิดใช้ ACCEPT_SINGLE_VALUE_AS_ARRAY
        String json = "\"not-an-array\"";
        JsonParser jp = jsonFactory.createParser(json);
        DeserializationContext ctxt = mapper.getDeserializationContext();
        jp.nextToken();

        try {
            StringArrayDeserializer.instance.deserialize(jp, ctxt);
            fail("Expected JsonMappingException to be thrown");
        } catch (JsonMappingException e) {
            assertTrue(e.getMessage().contains("String[]"));
        }
    }

    @Test
    public void testHandleNonArrayAcceptSingleValueAsArray() throws IOException {
        ObjectMapper customMapper = new ObjectMapper();
        customMapper.enable(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY);

        String json = "\"single-value\"";
        JsonParser jp = jsonFactory.createParser(json);
        DeserializationContext ctxt = customMapper.getDeserializationContext();
        jp.nextToken();

        String[] result = StringArrayDeserializer.instance.deserialize(jp, ctxt);

        assertNotNull(result);
        assertEquals(1, result.length);
        assertEquals("single-value", result[0]);
    }

    @Test
    public void testHandleNonArrayAcceptSingleValueAsNull() throws IOException {
        ObjectMapper customMapper = new ObjectMapper();
        customMapper.enable(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY);

        String json = "null";
        JsonParser jp = jsonFactory.createParser(json);
        DeserializationContext ctxt = customMapper.getDeserializationContext();
        jp.nextToken();

        String[] result = StringArrayDeserializer.instance.deserialize(jp, ctxt);

        assertNotNull(result);
        assertEquals(1, result.length);
        assertNull(result[0]);
    }

    @Test
    public void testHandleNonArrayAcceptEmptyStringAsNull() throws IOException {
        ObjectMapper customMapper = new ObjectMapper();
        customMapper.enable(DeserializationFeature.ACCEPT_EMPTY_STRING_AS_NULL_OBJECT);

        String json = "\"\"";
        JsonParser jp = jsonFactory.createParser(json);
        DeserializationContext ctxt = customMapper.getDeserializationContext();
        jp.nextToken();

        String[] result = StringArrayDeserializer.instance.deserialize(jp, ctxt);
        assertNull(result);
    }

    @Test
    public void testHandleNonArrayAcceptEmptyStringButNonEmptyContent() throws IOException {
        ObjectMapper customMapper = new ObjectMapper();
        customMapper.enable(DeserializationFeature.ACCEPT_EMPTY_STRING_AS_NULL_OBJECT);

        String json = "\"abc\"";
        JsonParser jp = jsonFactory.createParser(json);
        DeserializationContext ctxt = customMapper.getDeserializationContext();
        jp.nextToken();

        try {
            StringArrayDeserializer.instance.deserialize(jp, ctxt);
            fail("Expected JsonMappingException");
        } catch (JsonMappingException e) {
            // Expected path when string length != 0 and ACCEPT_SINGLE_VALUE_AS_ARRAY is disabled
        }
    }

    @Test
    public void testDeserializeWithType() throws Exception {
        String json = "[\"test\"]";
        JsonParser jp = jsonFactory.createParser(json);
        DeserializationContext ctxt = mapper.getDeserializationContext();
        jp.nextToken();

        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer = 
            mapper.getDeserializationConfig()
                  .findTypeDeserializer(mapper.constructType(String[].class));

        // กรณีที่ typeDeserializer เป็น null อาจเกิด NullPointerException หรือพฤติกรรมตาม TypeResolver
        if (typeDeserializer != null) {
            Object result = StringArrayDeserializer.instance.deserializeWithType(jp, ctxt, typeDeserializer);
            assertNotNull(result);
        }
    }

    @Test
    public void testCreateContextual() throws Exception {
        DeserializationContext ctxt = mapper.getDeserializationContext();
        JsonDeserializer<?> contextual = StringArrayDeserializer.instance.createContextual(ctxt, null);
        
        // เนื่องจากเป็นดีซีเรียลไลเซอร์เริ่มต้น (Default String Deserializer) createContextual ควรคืนค่า instance เดิมหรือเทียบเท่า
        assertNotNull(contextual);
    }
}