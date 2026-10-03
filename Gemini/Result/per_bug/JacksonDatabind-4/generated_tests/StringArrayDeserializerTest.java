package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.*;

public class StringArrayDeserializerTest {

    @Test
    public void testDeserializeStandardArray() throws IOException {
        String json = "[\"a\", null, \"b\"]";
        ObjectMapper mapper = new ObjectMapper();
        JsonFactory f = mapper.getFactory();
        JsonParser jp = f.createParser(json);
        jp.nextToken(); // move to START_ARRAY

        DeserializationContext ctxt = mapper.getDeserializationContext();
        String[] result = StringArrayDeserializer.instance.deserialize(jp, ctxt);

        assertNotNull(result);
        assertEquals(3, result.length);
        assertEquals("a", result[0]);
        assertNull(result[1]);
        assertEquals("b", result[2]);
    }

    @Test
    public void testDeserializeNonStringValuesInArray() throws IOException {
        // ทดสอบเคสที่ข้อมูลไม่ใช่ VALUE_STRING หรือ VALUE_NULL โดยตรง (เช่น ตัวเลข, บูลีน) เพื่อให้เข้าเงื่อนไข _parseString
        String json = "[123, true]";
        ObjectMapper mapper = new ObjectMapper();
        JsonFactory f = mapper.getFactory();
        JsonParser jp = f.createParser(json);
        jp.nextToken();

        DeserializationContext ctxt = mapper.getDeserializationContext();
        String[] result = StringArrayDeserializer.instance.deserialize(jp, ctxt);

        assertNotNull(result);
        assertEquals(2, result.length);
        assertEquals("123", result[0]);
        assertEquals("true", result[1]);
    }

    @Test
    public void testDeserializeChunkExpansion() throws IOException {
        // สร้างอาเรย์ที่มีสมาชิกมากกว่า 20 ตัว เพื่อทดสอบการขยาย ObjectBuffer chunk (ix >= chunk.length)
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < 25; i++) {
            sb.append("\"val").append(i).append("\"");
            if (i < 24) sb.append(",");
        }
        sb.append("]");

        ObjectMapper mapper = new ObjectMapper();
        JsonFactory f = mapper.getFactory();
        JsonParser jp = f.createParser(sb.toString());
        jp.nextToken();

        DeserializationContext ctxt = mapper.getDeserializationContext();
        String[] result = StringArrayDeserializer.instance.deserialize(jp, ctxt);

        assertNotNull(result);
        assertEquals(25, result.length);
        assertEquals("val0", result[0]);
        assertEquals("val24", result[24]);
    }

    @Test
    public void testDeserializeCustom() throws IOException {
        // สร้าง Custom Deserializer ผ่าน Contextual
        ObjectMapper mapper = new ObjectMapper();
        StringArrayDeserializer customDeser = new StringArrayDeserializer(new com.fasterxml.jackson.databind.JsonDeserializer<String>() {
            @Override
            public String deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
                return "custom_" + p.getText();
            }
            @Override
            public String getNullValue(DeserializationContext ctxt) {
                return "custom_null";
            }
        });

        String json = "[\"test\", null]";
        JsonFactory f = mapper.getFactory();
        JsonParser jp = f.createParser(json);
        jp.nextToken();

        DeserializationContext ctxt = mapper.getDeserializationContext();
        String[] result = customDeser.deserialize(jp, ctxt);

        assertNotNull(result);
        assertEquals(2, result.length);
        assertEquals("custom_test", result[0]);
        assertEquals("custom_null", result[1]);
    }

    @Test(expected = com.fasterxml.jackson.databind.JsonMappingException.class)
    public void testHandleNonArrayThrowsException() throws IOException {
        // ปิด ACCEPT_SINGLE_VALUE_AS_ARRAY แล้วส่งค่าเดี่ยว (ไม่ใช่ Array) เพื่อให้เกิดการโยน Exception
        String json = "\"notAnArray\"";
        ObjectMapper mapper = new ObjectMapper();
        mapper.disable(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY);
        JsonFactory f = mapper.getFactory();
        JsonParser jp = f.createParser(json);
        jp.nextToken();

        DeserializationContext ctxt = mapper.getDeserializationContext();
        StringArrayDeserializer.instance.deserialize(jp, ctxt);
    }

    @Test
    public void testHandleNonArrayAcceptSingleValueAsArray() throws IOException {
        // เปิด ACCEPT_SINGLE_VALUE_AS_ARRAY และส่งค่าเดี่ยว
        String json = "\"singleValue\"";
        ObjectMapper mapper = new ObjectMapper();
        mapper.enable(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY);
        JsonFactory f = mapper.getFactory();
        JsonParser jp = f.createParser(json);
        jp.nextToken();

        DeserializationContext ctxt = mapper.getDeserializationContext();
        String[] result = StringArrayDeserializer.instance.deserialize(jp, ctxt);

        assertNotNull(result);
        assertEquals(1, result.length);
        assertEquals("singleValue", result[0]);
    }

    @Test
    public void testHandleNonArrayAcceptSingleValueNull() throws IOException {
        String json = "null";
        ObjectMapper mapper = new ObjectMapper();
        mapper.enable(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY);
        JsonFactory f = mapper.getFactory();
        JsonParser jp = f.createParser(json);
        jp.nextToken();

        DeserializationContext ctxt = mapper.getDeserializationContext();
        String[] result = StringArrayDeserializer.instance.deserialize(jp, ctxt);

        assertNotNull(result);
        assertEquals(1, result.length);
        assertNull(result[0]);
    }

    @Test
    public void testHandleNonArrayAcceptEmptyStringAsNull() throws IOException {
        // เปิด ACCEPT_EMPTY_STRING_AS_NULL_OBJECT และส่งค่าว่าง ""
        String json = "\"\"";
        ObjectMapper mapper = new ObjectMapper();
        mapper.disable(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY);
        mapper.enable(DeserializationFeature.ACCEPT_EMPTY_STRING_AS_NULL_OBJECT);
        JsonFactory f = mapper.getFactory();
        JsonParser jp = f.createParser(json);
        jp.nextToken();

        DeserializationContext ctxt = mapper.getDeserializationContext();
        String[] result = StringArrayDeserializer.instance.deserialize(jp, ctxt);

        assertNull(result);
    }

    @Test
    public void testDeserializeWithType() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        JsonFactory f = mapper.getFactory();
        JsonParser jp = f.createParser("[\"abc\"]");
        jp.nextToken();

        DeserializationContext ctxt = mapper.getDeserializationContext();
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeser = 
            mapper.getDeserializationConfig()
                  .findRootDeserializer(ctxt, mapper.constructType(String[].class))
                  .getValueTypeDeserializer();

        // ทดสอบเมธอด deserializeWithType หาก TypeDeserializer เป็น null อาจจะจำลอง หรือเรียกตรงๆ
        if (typeDeser != null) {
            Object res = StringArrayDeserializer.instance.deserializeWithType(jp, ctxt, typeDeser);
            assertNotNull(res);
        }
    }
}