package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.module.SimpleModule;
import com.fasterxml.jackson.databind.type.TypeFactory;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.*;

import static org.junit.Assert.*;

public class UntypedObjectDeserializerTest {

    private ObjectMapper objectMapper;

    @Before
    public void setUp() {
        objectMapper = new ObjectMapper();
    }

    @Test
    public void testResolveAndContextualizationWithCustomTypes() throws Exception {
        UntypedObjectDeserializer deserializer = new UntypedObjectDeserializer(
                TypeFactory.defaultInstance().constructType(ArrayList.class),
                TypeFactory.defaultInstance().constructType(LinkedHashMap.class)
        );
        DeserializationContext ctxt = objectMapper.getDeserializationContext();
        deserializer.resolve(ctxt);

        JsonDeserializer<?> contextualized = deserializer.createContextual(ctxt, null);
        assertNotNull(contextualized);
    }

    @Test
    public void testVanillaContextualizationOptimization() throws Exception {
        UntypedObjectDeserializer deserializer = new UntypedObjectDeserializer(null, null);
        DeserializationContext ctxt = objectMapper.getDeserializationContext();
        deserializer.resolve(ctxt);
        
        JsonDeserializer<?> contextualized = deserializer.createContextual(ctxt, null);
        assertTrue(contextualized instanceof UntypedObjectDeserializer.Vanilla);
    }

    @Test
    public void testIsCachable() {
        UntypedObjectDeserializer deserializer = new UntypedObjectDeserializer();
        assertTrue(deserializer.isCachable());
    }

    @Test
    public void testDeserializeNull() throws IOException {
        String json = "null";
        Object result = objectMapper.readValue(json, Object.class);
        assertNull(result);
    }

    @Test
    public void testDeserializeBoolean() throws IOException {
        assertEquals(Boolean.TRUE, objectMapper.readValue("true", Object.class));
        assertEquals(Boolean.FALSE, objectMapper.readValue("false", Object.class));
    }

    @Test
    public void testDeserializeString() throws IOException {
        String json = "\"Hello Jackson\"";
        Object result = objectMapper.readValue(json, Object.class);
        assertEquals("Hello Jackson", result);
    }

    @Test
    public void testDeserializeNumbers() throws IOException {
        // Integer
        Object intResult = objectMapper.readValue("42", Object.class);
        assertTrue(intResult instanceof Integer);
        assertEquals(42, intResult);

        // Float / Double
        Object floatResult = objectMapper.readValue("3.14", Object.class);
        assertTrue(floatResult instanceof Double);
        assertEquals(3.14, floatResult);
    }

    @Test
    public void testDeserializeFloatWithBigDecimalFeature() throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        mapper.enable(DeserializationFeature.USE_BIG_DECIMAL_FOR_FLOATS);
        Object result = mapper.readValue("123.456", Object.class);
        assertTrue(result instanceof BigDecimal);
        assertEquals(new BigDecimal("123.456"), result);
    }

    @Test
    public void testDeserializeIntCoercion() throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        mapper.enable(DeserializationFeature.USE_BIG_INTEGER_FOR_INTS);
        Object result = mapper.readValue("999999999999", Object.class);
        assertTrue(result instanceof BigInteger);
        assertEquals(new BigInteger("999999999999"), result);
    }

    @Test
    public void testDeserializeEmptyObject() throws IOException {
        String json = "{}";
        Object result = objectMapper.readValue(json, Object.class);
        assertTrue(result instanceof Map);
        assertTrue(((Map<?, ?>) result).isEmpty());
    }

    @Test
    public void testDeserializeSingleEntryObject() throws IOException {
        String json = "{\"key1\": \"value1\"}";
        Object result = objectMapper.readValue(json, Object.class);
        assertTrue(result instanceof Map);
        Map<?, ?> map = (Map<?, ?>) result;
        assertEquals(1, map.size());
        assertEquals("value1", map.get("key1"));
    }

    @Test
    public void testDeserializeTwoEntryObject() throws IOException {
        String json = "{\"key1\": \"value1\", \"key2\": \"value2\"}";
        Object result = objectMapper.readValue(json, Object.class);
        assertTrue(result instanceof Map);
        Map<?, ?> map = (Map<?, ?>) result;
        assertEquals(2, map.size());
        assertEquals("value1", map.get("key1"));
        assertEquals("value2", map.get("key2"));
    }

    @Test
    public void testDeserializeMultiEntryObject() throws IOException {
        String json = "{\"key1\": 1, \"key2\": 2, \"key3\": 3, \"key4\": 4}";
        Object result = objectMapper.readValue(json, Object.class);
        assertTrue(result instanceof Map);
        Map<?, ?> map = (Map<?, ?>) result;
        assertEquals(4, map.size());
        assertEquals(1, map.get("key1"));
        assertEquals(4, map.get("key4"));
    }

    @Test
    public void testDeserializeEmptyArray() throws IOException {
        String json = "[]";
        Object result = objectMapper.readValue(json, Object.class);
        assertTrue(result instanceof List);
        assertTrue(((List<?>) result).isEmpty());
    }

    @Test
    public void testDeserializeSingleElementArray() throws IOException {
        String json = "[\"item1\"]";
        Object result = objectMapper.readValue(json, Object.class);
        assertTrue(result instanceof List);
        List<?> list = (List<?>) result;
        assertEquals(1, list.size());
        assertEquals("item1", list.get(0));
    }

    @Test
    public void testDeserializeTwoElementArray() throws IOException {
        String json = "[\"item1\", \"item2\"]";
        Object result = objectMapper.readValue(json, Object.class);
        assertTrue(result instanceof List);
        List<?> list = (List<?>) result;
        assertEquals(2, list.size());
        assertEquals("item1", list.get(0));
        assertEquals("item2", list.get(1));
    }

    @Test
    public void testDeserializeMultiElementArrayChunkResize() throws IOException {
        // มากกว่า 2 Elements เพื่อกระตุ้น Buffer chunk resizing ใน mapArray
        String json = "[1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11]";
        Object result = objectMapper.readValue(json, Object.class);
        assertTrue(result instanceof List);
        List<?> list = (List<?>) result;
        assertEquals(11, list.size());
        assertEquals(1, list.get(0));
        assertEquals(11, list.get(10));
    }

    @Test
    public void testDeserializeArrayAsJavaArrayFeature() throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        mapper.enable(DeserializationFeature.USE_JAVA_ARRAY_FOR_JSON_ARRAY);
        String json = "[1, 2, 3]";
        Object result = mapper.readValue(json, Object.class);
        assertTrue(result instanceof Object[]);
        Object[] arr = (Object[]) result;
        assertEquals(3, arr.length);
        assertEquals(1, arr[0]);
    }

    @Test
    public void testDeserializeEmptyArrayAsJavaArrayFeature() throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        mapper.enable(DeserializationFeature.USE_JAVA_ARRAY_FOR_JSON_ARRAY);
        String json = "[]";
        Object result = mapper.readValue(json, Object.class);
        assertTrue(result instanceof Object[]);
        assertEquals(0, ((Object[]) result).length);
    }

    @Test(expected = JsonMappingException.class)
    public void testInvalidTokenThrowsMappingException() throws IOException {
        // จำลองสถานการณ์ส่ง Token ที่ไม่รองรับ (เช่น End Array โดดๆ หรือ Invalid JSON token stream)
        JsonParser parser = objectMapper.getFactory().createParser("]");
        UntypedObjectDeserializer deserializer = new UntypedObjectDeserializer();
        DeserializationContext ctxt = objectMapper.getDeserializationContext();
        parser.nextToken(); // เลื่อนไปที่ START_ARRAY หรือ END_ARRAY ตามบริบท
        deserializer.deserialize(parser, ctxt);
    }

    @Test
    public void testDeserializeWithType() throws Exception {
        UntypedObjectDeserializer deserializer = new UntypedObjectDeserializer();
        JsonParser parser = objectMapper.getFactory().createParser("\"test-type\"");
        parser.nextToken();
        DeserializationContext ctxt = objectMapper.getDeserializationContext();
        
        // ทดสอบผ่านการเรียก deserializeWithType ทางอ้อมหรือจำลอง TypeDeserializer
        Object result = deserializer.deserializeWithType(parser, ctxt, new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(
                TypeFactory.unknownType(), null, "type", false, TypeFactory.unknownType()
        ) {
            @Override
            public Object deserializeTypedFromAny(JsonParser jp, DeserializationContext ctxt) throws IOException {
                return "typed-any";
            }
        });
        assertEquals("test-type", result);
    }
}