package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.deser.ValueInstantiator;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.type.TypeFactory;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

import static org.junit.Assert.*;

public class MapDeserializerTest {

    private ObjectMapper objectMapper;
    private DeserializationContext deserializationContext;

    @Before
    public void setUp() {
        objectMapper = new ObjectMapper();
        deserializationContext = objectMapper.getDeserializationContext();
    }

    @Test
    public void testIsCachable_DefaultState() {
        JavaType mapType = TypeFactory.defaultInstance().constructMapType(HashMap.class, String.class, Object.class);
        ValueInstantiator instantiator = new JacksonStdImplValueInstantiatorDummy(mapType);
        MapDeserializer deserializer = new MapDeserializer(mapType, instantiator, null, null, null);
        
        // เงื่อนไข: _valueTypeDeserializer == null และ _ignorableProperties == null ต้องได้ true
        assertTrue("Should be cachable by default", deserializer.isCachable());
    }

    @Test
    public void testIsCachable_WithIgnorableProperties() {
        JavaType mapType = TypeFactory.defaultInstance().constructMapType(HashMap.class, String.class, Object.class);
        ValueInstantiator instantiator = new JacksonStdImplValueInstantiatorDummy(mapType);
        MapDeserializer deserializer = new MapDeserializer(mapType, instantiator, null, null, null);
        deserializer.setIgnorableProperties(new String[]{"ignoreMe"});

        // เงื่อนไข: _ignorableProperties != null ต้องได้ false
        assertFalse("Should not be cachable when ignorable properties are set", deserializer.isCachable());
    }

    @Test(expected = JsonMappingException.class)
    public void testDeserialize_NoDefaultConstructor_ThrowsException() throws Exception {
        JavaType mapType = TypeFactory.defaultInstance().constructMapType(HashMap.class, String.class, Object.class);
        // สร้าง ValueInstantiator ที่ไม่รองรับ Default Constructor
        ValueInstantiator instantiator = new ValueInstantiator.Base(mapType) {
            @Override
            public boolean canCreateUsingDefault() {
                return false;
            }
        };
        MapDeserializer deserializer = new MapDeserializer(mapType, instantiator, null, null, null);
        
        JsonFactory f = new JsonFactory();
        JsonParser jp = f.createParser("{}");
        jp.nextToken(); // ไปที่ START_OBJECT

        deserializer.deserialize(jp, deserializationContext);
    }

    @Test(expected = JsonMappingException.class)
    public void testDeserialize_InvalidToken_ThrowsException() throws Exception {
        JavaType mapType = TypeFactory.defaultInstance().constructMapType(HashMap.class, String.class, Object.class);
        ValueInstantiator instantiator = new JacksonStdImplValueInstantiatorDummy(mapType);
        MapDeserializer deserializer = new MapDeserializer(mapType, instantiator, null, null, null);

        JsonFactory f = new JsonFactory();
        JsonParser jp = f.createParser("123"); // VALUE_NUMBER_INT ไม่ใช่ START_OBJECT/FIELD_NAME/END_OBJECT/VALUE_STRING
        jp.nextToken();

        deserializer.deserialize(jp, deserializationContext);
    }

    @Test
    public void testDeserialize_StandardStringKeyAndNullValue() throws Exception {
        JavaType mapType = TypeFactory.defaultInstance().constructMapType(HashMap.class, String.class, Object.class);
        ValueInstantiator instantiator = new JacksonStdImplValueInstantiatorDummy(mapType);
        
        // ทดสอบ standard string key และ value เป็น null (VALUE_NULL branch)
        MapDeserializer deserializer = new MapDeserializer(mapType, instantiator, null, null, null);
        deserializer.setIgnorableProperties(new String[]{"skipField"});

        JsonFactory f = new JsonFactory();
        // ใส่ทั้ง Field ปกติ, Field ที่เป็น null, และ Field ที่ต้องถูก ignore
        JsonParser jp = f.createParser("{\"key1\": null, \"skipField\": \"val\", \"key2\": \"value2\"}");
        jp.nextToken();

        Map<Object, Object> result = deserializer.deserialize(jp, deserializationContext);
        assertNotNull(result);
        assertTrue(result.containsKey("key1"));
        assertNull(result.get("key1"));
        assertTrue(result.containsKey("key2"));
        assertFalse(result.containsKey("skipField"));
    }

    @Test
    public void testSetIgnorableProperties_NullAndEmpty() {
        JavaType mapType = TypeFactory.defaultInstance().constructMapType(HashMap.class, String.class, Object.class);
        ValueInstantiator instantiator = new JacksonStdImplValueInstantiatorDummy(mapType);
        MapDeserializer deserializer = new MapDeserializer(mapType, instantiator, null, null, null);

        deserializer.setIgnorableProperties(null);
        deserializer.setIgnorableProperties(new String[]{});
        // ตรวจสอบว่าไม่เกิด NullPointerException และทำงานผ่าน Branch เรียบร้อย
        assertTrue(deserializer.isCachable());
    }

    @Test
    public void testGettersAndAccessors() {
        JavaType mapType = TypeFactory.defaultInstance().constructMapType(HashMap.class, String.class, Object.class);
        ValueInstantiator instantiator = new JacksonStdImplValueInstantiatorDummy(mapType);
        MapDeserializer deserializer = new MapDeserializer(mapType, instantiator, null, null, null);

        assertEquals(HashMap.class, deserializer.getMapClass());
        assertEquals(mapType, deserializer.getValueType());
        assertNotNull(deserializer.getContentType());
    }

    // Dummy ValueInstantiator สำหรับใช้ในการทดสอบ
    private static class JacksonStdImplValueInstantiatorDummy extends ValueInstantiator {
        private final JavaType _type;

        public JacksonStdImplValueInstantiatorDummy(JavaType type) {
            _type = type;
        }

        @Override
        public boolean canCreateUsingDefault() {
            return true;
        }

        @Override
        public Object createUsingDefault(DeserializationContext ctxt) {
            try {
                return _type.getRawClass().newInstance();
            } catch (Exception e) {
                return new HashMap<Object, Object>();
            }
        }
    }
}