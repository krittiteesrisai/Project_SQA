package com.fasterxml.jackson.databind.deser;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.deser.impl.ObjectIdReader;
import com.fasterxml.jackson.databind.module.SimpleModule;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.*;

public class BeanDeserializerTest {

    private ObjectMapper objectMapper;
    private DeserializationContext deserializationContext;

    @Before
    public void setUp() {
        objectMapper = new ObjectMapper();
        deserializationContext = objectMapper.getDeserializationContext();
    }

    @After
    public void tearDown() {
        objectMapper = null;
        deserializationContext = null;
    }

    /**
     * ดักจับ Branch: p.isExpectedStartObjectToken() เป็น true และ _vanillaProcessing เป็น true
     */
    @Test
    public void testVanillaDeserializeSuccess() throws Exception {
        String json = "{\"name\":\"test\"}";
        try (JsonParser p = objectMapper.getFactory().createParser(json)) {
            p.nextToken(); // START_OBJECT
            
            BeanDeserializerBuilder builder = new BeanDeserializerBuilder(
                    objectMapper.constructType(SimpleBean.class), 
                    objectMapper.getDeserializationConfig()
            );
            BeanDescription beanDesc = objectMapper.getDeserializationConfig().introspect(objectMapper.constructType(SimpleBean.class));
            BeanDeserializer deserializer = new BeanDeserializer(
                    builder, beanDesc, null, null, null, false, false
            );

            Object result = deserializer.deserialize(p, deserializationContext);
            assertNotNull(result);
            assertTrue(result instanceof SimpleBean);
        }
    }

    /**
     * ดักจับ Branch: _deserializeOther กับ Token แบบต่างๆ (VALUE_STRING, VALUE_NUMBER_INT, VALUE_NULL ฯลฯ)
     */
    @Test
    public void testDeserializeOtherValueString() throws Exception {
        String json = "\"some-string\"";
        try (JsonParser p = objectMapper.getFactory().createParser(json)) {
            p.nextToken(); // VALUE_STRING
            
            BeanDeserializerBuilder builder = new BeanDeserializerBuilder(
                    objectMapper.constructType(SimpleBean.class), 
                    objectMapper.getDeserializationConfig()
            );
            BeanDescription beanDesc = objectMapper.getDeserializationConfig().introspect(objectMapper.constructType(SimpleBean.class));
            BeanDeserializer deserializer = new BeanDeserializer(
                    builder, beanDesc, null, null, null, false, false
            );

            // จะเรียก _deserializeOther ผ่าน VALUE_STRING ซึ่งมักต้องการ Creator ผิดพลาดหรือไม่ได้กำหนด
            try {
                deserializer.deserialize(p, deserializationContext);
                fail("Expected Midding / Unexpected token exception");
            } catch (Exception e) {
                assertNotNull(e);
            }
        }
    }

    /**
     * ดักจับ Branch: deserializeFromNull เมื่อ p.requiresCustomCodec() เป็น false (โยน UnexpectedTokenException)
     */
    @Test(expected = JsonMappingException.class)
    public void testDeserializeFromNullStandard() throws Exception {
        String json = "null";
        try (JsonParser p = objectMapper.getFactory().createParser(json)) {
            p.nextToken(); // VALUE_NULL
            
            BeanDeserializerBuilder builder = new BeanDeserializerBuilder(
                    objectMapper.constructType(SimpleBean.class), 
                    objectMapper.getDeserializationConfig()
            );
            BeanDescription beanDesc = objectMapper.getDeserializationConfig().introspect(objectMapper.constructType(SimpleBean.class));
            BeanDeserializer deserializer = new BeanDeserializer(
                    builder, beanDesc, null, null, null, true, false
            );

            deserializer.deserializeFromNull(p, deserializationContext);
        }
    }

    /**
     * ดักจับ Branch: deserialize(p, ctxt, bean) เมื่อ bean ถูกส่งเข้ามา และตรวจสอบ ActiveView / Unwrapped handlers
     */
    @Test
    public void testDeserializeIntoExistingBean() throws Exception {
        String json = "{\"name\":\"updatedName\"}";
        SimpleBean existingBean = new SimpleBean();
        
        try (JsonParser p = objectMapper.getFactory().createParser(json)) {
            p.nextToken(); // START_OBJECT
            
            BeanDeserializerBuilder builder = new BeanDeserializerBuilder(
                    objectMapper.constructType(SimpleBean.class), 
                    objectMapper.getDeserializationConfig()
            );
            BeanDescription beanDesc = objectMapper.getDeserializationConfig().introspect(objectMapper.constructType(SimpleBean.class));
            BeanDeserializer deserializer = new BeanDeserializer(
                    builder, beanDesc, null, null, null, true, false
            );

            Object result = deserializer.deserialize(p, deserializationContext, existingBean);
            assertSame(existingBean, result);
        }
    }

    /**
     * ดักจับ Edge Cases: _creatorReturnedNullException() และการจัดการ Null Pointer จาก Creator
     */
    @Test
    public void testCreatorReturnedNullHandling() {
        BeanDeserializerBuilder builder = new BeanDeserializerBuilder(
                objectMapper.constructType(SimpleBean.class), 
                objectMapper.getDeserializationConfig()
        );
        BeanDescription beanDesc = objectMapper.getDeserializationConfig().introspect(objectMapper.constructType(SimpleBean.class));
        BeanDeserializer deserializer = new BeanDeserializer(
                builder, beanDesc, null, null, null, false, false
        );

        Exception ex = deserializer._creatorReturnedNullException();
        assertNotNull(ex);
        assertTrue(ex instanceof NullPointerException);
        assertEquals("JSON Creator returned null", ex.getMessage());
        
        // ทดสอบซ้ำเพื่อให้ครอบคลุม Branch กรณี _nullFromCreator ถูกสร้างไว้แล้ว (Singleton/Cached instance)
        Exception exCached = deserializer._creatorReturnedNullException();
        assertSame(ex, exCached);
    }

    /**
     * Helper Bean class สำหรับใช้ทำ Test Double / Introspection
     */
    public static class SimpleBean {
        public String name;
        public SimpleBean() {}
    }
}