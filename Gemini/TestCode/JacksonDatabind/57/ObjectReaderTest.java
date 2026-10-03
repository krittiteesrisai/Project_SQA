package com.fasterxml.jackson.databind;

import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.databind.node.NullNode;
import com.fasterxml.jackson.databind.type.SimpleType;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.Reader;
import java.io.StringReader;
import java.net.URL;
import java.util.Iterator;

import static org.junit.Assert.*;

public class ObjectReaderTest {

    private final ObjectMapper objectMapper = new ObjectMapper();

    @Test
    public void testReadValueNullInputWithNoUpdateValue() throws Exception {
        ObjectReader reader = objectMapper.readerFor(String.class);
        // ส่ง JSON "null" เข้าไป
        String json = "null";
        String result = reader.readValue(json);
        assertNull(result);
    }

    @Test
    public void testReadValueNullInputWithUpdateValue() throws Exception {
        String existingValue = "existing";
        ObjectReader reader = objectMapper.readerFor(String.class).withValueToUpdate(existingValue);
        String json = "null";
        // เมื่อ valueToUpdate ไม่เป็น null และเจอ VALUE_NULL จะคืนค่า valueToUpdate เดิม
        String result = reader.readValue(json);
        assertEquals("existing", result);
    }

    @Test
    public void testReadValueEndArrayOrObjectReturnsUpdateValue() throws Exception {
        String existingValue = "fallback";
        ObjectReader reader = objectMapper.readerFor(String.class).withValueToUpdate(existingValue);
        // JSON ที่เป็น Array เปล่าๆ จะทำให้เจอ END_ARRAY ทันทีหลัง _initForReading
        String json = "[]";
        String result = reader.readValue(json);
        assertEquals("fallback", result);
    }

    @Test(expected = IllegalArgumentException.class)
    data/constructor/update/array/validation:
    public void testConstructorThrowsExceptionWhenUpdatingArray() {
        JavaType arrayType = objectMapper.constructType(String[].class);
        // ทดลองสร้าง ObjectReader ที่มี valueToUpdate เป็น Array ซึ่งผิดกฎ
        new ObjectReader(objectMapper, objectMapper.getDeserializationConfig(),
                arrayType, new String[0], null, null);
    }

    @Test(expected = JsonParseException.class)
    public void testUndetectableSourceReaderWithFormatDetection() throws Exception {
        ObjectReader reader = objectMapper.readerFor(String.class)
                .withFormatDetection(objectMapper.readerFor(String.class));
        Reader src = new StringReader("\"test\"");
        // Format detection ไม่รองรับ Reader จะต้องพ่น JsonParseException ออกมา
        reader.readValue(src);
    }

    @Test(expected = JsonParseException.class)
    public void testUndetectableSourceStringWithFormatDetection() throws Exception {
        ObjectReader reader = objectMapper.readerFor(String.class)
                .withFormatDetection(objectMapper.readerFor(String.class));
        // Format detection ไม่รองรับ String
        reader.readValue("\"test\"");
    }

    @Test
    public void testUnwrapAndDeserializeSuccess() throws Exception {
        // ทดสอบการเปิด Root Wrapping
        ObjectMapper mapper = new ObjectMapper();
        mapper.configure(DeserializationFeature.UNWRAP_ROOT_VALUE, true);
        ObjectReader reader = mapper.readerFor(SimpleBean.class);
        
        String json = "{\"SimpleBean\":{\"value\":\"hello\"}}";
        SimpleBean bean = reader.readValue(json);
        assertNotNull(bean);
        assertEquals("hello", bean.value);
    }

    @Test(expected = JsonMappingException.class)
    public void testUnwrapAndDeserializeNotStartObject() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        mapper.configure(DeserializationFeature.UNWRAP_ROOT_VALUE, true);
        ObjectReader reader = mapper.readerFor(SimpleBean.class);
        
        // ส่ง JSON ที่ไม่ได้เริ่มด้วย START_OBJECT (เช่น เริ่มด้วย String หรือ Array)
        String json = "\"notAnObject\"";
        reader.readValue(json);
    }

    @Test(expected = JsonMappingException.class)
    public void testUnwrapAndDeserializeNotFieldName() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        mapper.configure(DeserializationFeature.UNWRAP_ROOT_VALUE, true);
        ObjectReader reader = mapper.readerFor(SimpleBean.class);
        
        // Object เปล่าไม่มี Field Name
        String json = "{}";
        reader.readValue(json);
    }

    @Test(expected = JsonMappingException.class)
    public void testUnwrapAndDeserializeWrongRootName() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        mapper.configure(DeserializationFeature.UNWRAP_ROOT_VALUE, true);
        ObjectReader reader = mapper.readerFor(SimpleBean.class);
        
        // Root name ไม่ตรงกับที่คาดหวัง
        String json = "{\"WrongName\":{\"value\":\"hello\"}}";
        reader.readValue(json);
    }

    @Test(expected = JsonMappingException.class)
    public void testUnwrapAndDeserializeMissingEndObject() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        mapper.configure(DeserializationFeature.UNWRAP_ROOT_VALUE, true);
        ObjectReader reader = mapper.readerFor(SimpleBean.class);
        
        // ขาด End Object ปิดท้าย
        String json = "{\"SimpleBean\":{\"value\":\"hello\"}";
        reader.readValue(json);
    }

    @Test
    public void testReadTreeNullValue() throws Exception {
        ObjectReader reader = objectMapper.readerFor(JsonNode.class);
        JsonNode node = reader.readTree("null");
        assertTrue(node.isNull());
    }

    // Helper class สำหรับทดสอบ Root Unwrapping
    @com.fasterxml.jackson.annotation.JsonRootName("SimpleBean")
    public static class SimpleBean {
        public String value;
    }
}