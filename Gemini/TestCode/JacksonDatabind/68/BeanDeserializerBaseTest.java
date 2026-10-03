package com.fasterxml.jackson.databind.deser;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap;
import com.fasterxml.jackson.databind.deser.impl.ObjectIdReader;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.util.NameTransformer;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.*;

public class BeanDeserializerBaseTest {

    private ObjectMapper objectMapper;
    private DeserializationContext defaultContext;
    private ConcreteBeanDeserializer deserializer;

    // Concrete subclass ของ BeanDeserializerBase เพื่อใช้ทดสอบพฤติกรรมภายใน
    private static class ConcreteBeanDeserializer extends BeanDeserializerBase {
        protected ConcreteBeanDeserializer(BeanDeserializerBase src) {
            super(src);
        }

        protected ConcreteBeanDeserializer(BeanDeserializerBuilder builder, BeanDescription beanDesc,
                                           BeanPropertyMap properties, java.util.Map<String, SettableBeanProperty> backRefs,
                                           Set<String> ignorableProps, boolean ignoreAllUnknown, boolean hasViews) {
            super(builder, beanDesc, properties, backRefs, ignorableProps, ignoreAllUnknown, hasViews);
        }

        @Override
        public JsonDeserializer<Object> unwrappingDeserializer(NameTransformer unwrapper) {
            return this;
        }

        @Override
        public BeanDeserializerBase withObjectIdReader(ObjectIdReader oir) {
            return new ConcreteBeanDeserializer(this);
        }

        @Override
        public BeanDeserializerBase withIgnorableProperties(Set<String> ignorableProps) {
            return new ConcreteBeanDeserializer(this);
        }

        @Override
        protected BeanDeserializerBase asArrayDeserializer() {
            return this;
        }

        @Override
        public Object deserializeFromObject(JsonParser p, DeserializationContext ctxt) throws IOException {
            return null;
        }

        @Override
        protected Object _deserializeUsingPropertyBased(JsonParser p, DeserializationContext ctxt) throws IOException {
            return null;
        }
    }

    @Before
    public void setUp() {
        objectMapper = new ObjectMapper();
        defaultContext = objectMapper.getDeserializationContext();
        
        JavaType type = objectMapper.constructType(DummyBean.class);
        BeanDescription beanDesc = objectMapper.getSerializationConfig().introspect(type);
        BeanDeserializerBuilder builder = new BeanDeserializerBuilder(beanDesc, objectMapper.getDeserializationConfig());
        
        deserializer = new ConcreteBeanDeserializer(
                builder, beanDesc, BeanPropertyMap.construct(Collections.emptyList()),
                Collections.emptyMap(), Collections.emptySet(), false, false
        );
    }

    @Test
    public void testWrapAndThrowWithInvocationTargetException() {
        Throwable cause = new RuntimeException("Root Cause");
        InvocationTargetException targetException = new InvocationTargetException(cause, "Invocation Failed");
        
        try {
            deserializer.wrapAndThrow(targetException, new DummyBean(), "someField", defaultContext);
            fail("Expected JsonMappingException");
        } catch (JsonMappingException e) {
            assertNotNull(e);
            assertTrue(e.getMessage().contains("Root Cause"));
        } catch (IOException e) {
            fail("Unexpected IOException: " + e.getMessage());
        }
    }

    @Test(expected = OutOfMemoryError.class)
    public void testWrapAndThrowWithDirectError() throws IOException {
        OutOfMemoryError error = new OutOfMemoryError("OOM");
        deserializer.wrapAndThrow(error, new DummyBean(), "someField", defaultContext);
    }

    @Test
    public void testWrapAndThrowWithIOExceptionDisabledWrapping() throws IOException {
        IOException ioException = new IOException("Disk error");
        defaultContext = defaultContext.without(DeserializationFeature.WRAP_EXCEPTIONS);
        
        try {
            deserializer.wrapAndThrow(ioException, new DummyBean(), "someField", defaultContext);
            fail("Expected IOException");
        } catch (IOException e) {
            assertEquals("Disk error", e.getMessage());
        }
    }

    @Test
    public void testFindPropertyMissing() {
        assertNull(deserializer.findProperty("nonExistentProperty"));
    }

    @Test
    public void testHasPropertyEdgeCases() {
        assertFalse(deserializer.hasProperty("anyName"));
        assertEquals(0, deserializer.getPropertyCount());
        assertTrue(deserializer.getKnownPropertyNames().isEmpty());
    }

    @Test
    public void testDeserializeFromArrayEmptyAsNull() throws IOException {
        defaultContext.enable(DeserializationFeature.ACCEPT_EMPTY_ARRAY_AS_NULL_OBJECT);
        // จำลองการอ่าน JSON Array เปล่า []
        String json = "[]";
        try (JsonParser p = objectMapper.getFactory().createParser(json)) {
            p.nextToken(); // START_ARRAY
            Object result = deserializer.deserializeFromArray(p, defaultContext);
            assertNull(result);
        }
    }

    // Dummy Bean สำหรับใช้ทดสอบ
    public static class DummyBean {
        public String name;
    }
}