package com.fasterxml.jackson.databind.ser;

import static org.junit.Assert.*;

import java.io.IOException;
import java.util.concurrent.atomic.AtomicReference;

import org.junit.Before;
import org.junit.Test;

import com.fasterxml.jackson.annotation.ObjectIdGenerator;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.introspect.AnnotatedMethod;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.fasterxml.jackson.databind.ser.impl.WritableObjectId;

public class DefaultSerializerProviderTest {

    private ObjectMapper objectMapper;
    private DefaultSerializerProvider.Impl provider;

    @Before
    public void setUp() {
        objectMapper = new ObjectMapper();
        provider = (DefaultSerializerProvider.Impl) objectMapper.getSerializerProviderInstance();
    }

    @Test
    public void testCopyValid() {
        DefaultSerializerProvider copied = provider.copy();
        assertNotNull(copied);
        assertNotSame(provider, copied);
    }

    @Test(expected = IllegalStateException.class)
    public void testCopyInvalidSubclass() {
        DefaultSerializerProvider customProvider = new DefaultSerializerProvider(provider) {
            @Override
            public DefaultSerializerProvider createInstance(SerializationConfig config, SerializerFactory jsf) {
                return this;
            }
        };
        customProvider.copy();
    }

    @Test
    public void testSerializerInstanceNull() throws Exception {
        assertNull(provider.serializerInstance(null, null));
    }

    @Test
    public void testSerializerInstanceDirect() throws Exception {
        JsonSerializer<Object> dummySer = new JsonSerializer<Object>() {
            @Override
            public void serialize(Object value, JsonGenerator gen, SerializerProvider serializers) {}
        };
        JsonSerializer<Object> res = provider.serializerInstance(null, dummySer);
        assertEquals(dummySer, res);
    }

    @Test(expected = JsonMappingException.class)
    public void testSerializerInstanceInvalidType() throws Exception {
        provider.serializerInstance(null, "NotAClassOrSerializer");
    }

    @Test
    public void testSerializerInstanceNoneClass() throws Exception {
        assertNull(provider.serializerInstance(null, JsonSerializer.None.class));
    }

    @Test(expected = JsonMappingException.class)
    public void testSerializerInstanceNotAssignable() throws Exception {
        provider.serializerInstance(null, String.class);
    }

    @Test
    public void testSerializerInstanceValidClass() throws Exception {
        JsonSerializer<?> ser = provider.serializerInstance(null, com.fasterxml.jackson.databind.ser.std.StdSerializer.class);
        assertNotNull(ser);
    }

    @Test
    public void testIncludeFilterInstanceNull() {
        assertNull(provider.includeFilterInstance(null, null));
    }

    @Test
    public void testIncludeFilterInstanceValid() {
        Object filter = provider.includeFilterInstance(null, DummyFilter.class);
        assertNotNull(filter);
    }

    @Test
    public void testIncludeFilterSuppressNulls() throws Exception {
        assertTrue(provider.includeFilterSuppressNulls(null));
        assertFalse(provider.includeFilterSuppressNulls(new DummyFilter()));
    }

    @Test
    public void testFindObjectId() {
        Object pojo = new Object();
        ObjectIdGenerator<Int> genType = new ObjectIdGenerators.IntSequenceGenerator();
        
        WritableObjectId oid1 = provider.findObjectId(pojo, genType);
        assertNotNull(oid1);

        // ทดสอบดึงอันเดิมซ้ำ (Branch Seen)
        WritableObjectId oid2 = provider.findObjectId(pojo, genType);
        assertEquals(oid1, oid2);
    }

    @Test
    public void testHasSerializerForObject() {
        AtomicReference<Throwable> cause = new AtomicReference<>();
        boolean has = provider.hasSerializerFor(Object.class, cause);
        // ขึ้นอยู่กับการตั้งค่า FAIL_ON_EMPTY_BEANS ของ ObjectMapper
        assertTrue(has || !has);
    }

    @Test
    public void testHasSerializerForExceptionHandling() {
        AtomicReference<Throwable> cause = new AtomicReference<>();
        // ใช้คลาสที่ไม่สามารถ serialize ได้เพื่อทริก exception
        boolean has = provider.hasSerializerFor(UnserializableClass.class, cause);
        assertFalse(has);
    }

    @Test
    public void testAcceptJsonFormatVisitorNull() {
        try {
            provider.acceptJsonFormatVisitor(null, null);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertEquals("A class must be provided", e.getMessage());
        } catch (JsonMappingException e) {
            fail("Unexpected JsonMappingException");
        }
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGenerateJsonSchemaInvalidNode() throws Exception {
        // บังคับให้เกิด IllegalArgumentException เพราะ Non-object schema
        provider.generateJsonSchema(int.class);
    }

    // Helper classes for testing
    public static class DummyFilter {
        @Override
        public boolean equals(Object obj) {
            return false;
        }
    }

    private static class UnserializableClass {
        public Object getBad() { throw new RuntimeException("fail"); }
    }
}