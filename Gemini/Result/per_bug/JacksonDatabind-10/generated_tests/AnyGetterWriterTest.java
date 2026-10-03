package com.fasterxml.jackson.databind.ser;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.ser.std.MapSerializer;

import org.junit.Test;
import static org.junit.Assert.*;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class AnyGetterWriterTest {

    // --- Stub Classes สำหรับจำลองพฤติกรรม ---

    private static class TestAnnotatedMember extends AnnotatedMember {
        private final Object returnValue;
        private final String name;

        public TestAnnotatedMember(Object returnValue, String name) {
            super(null, null);
            this.returnValue = returnValue;
            this.name = name;
        }

        @Override public Object getValue(Object bean) throws IllegalArgumentException { return returnValue; }
        @Override public String getName() { return name; }
        @Override public int getModifiers() { return 0; }
        @Override public Class<?> getRawType() { return Object.class; }
        @Override public boolean equals(Object o) { return false; }
        @Override public int hashCode() { return 0; }
        @Override public String toString() { return ""; }
        @Override public com.fasterxml.jackson.databind.util.Annotations getAllAnnotations() { return null; }
        @Override public com.fasterxml.jackson.databind.introspect.Annotated withAnnotations(com.fasterxml.jackson.databind.util.Annotations anns) { return this; }
        @Override public Class<?> getDeclaringClass() { return null; }
        @Override public java.lang.reflect.Member getMember() { return null; }
        @Override public void setValue(Object pojo, Object value) throws UnsupportedOperationException, IllegalArgumentException {}
    }

    private static class DummyMapSerializer extends MapSerializer {
        boolean serializeFieldsCalled = false;
        boolean serializeFilteredCalled = false;

        public DummyMapSerializer() {
            super(null, null, null, false, null, null, null);
        }

        @Override
        public void serializeFields(Map<?,?> value, JsonGenerator gen, SerializerProvider provider) {
            serializeFieldsCalled = true;
        }

        @Override
        public void serializeFilteredFields(Map<?,?> value, JsonGenerator gen, SerializerProvider provider, PropertyFilter filter, Object suppressableValue) {
            serializeFilteredCalled = true;
        }
    }

    // --- Test Cases สำหรับ getAndSerialize ---

    @Test
    public void testGetAndSerialize_NullValue() throws Exception {
        AnnotatedMember accessor = new TestAnnotatedMember(null, "anyProp");
        AnyGetterWriter writer = new AnyGetterWriter(null, accessor, null);

        // Should return without error or action
        writer.getAndSerialize(new Object(), null, null);
    }

    @Test(expected = JsonMappingException.class)
    public void testGetAndSerialize_NotAMap_ThrowsException() throws Exception {
        AnnotatedMember accessor = new TestAnnotatedMember("NotAMapString", "anyProp");
        AnyGetterWriter writer = new AnyGetterWriter(null, accessor, null);

        // Should throw JsonMappingException because value is String, not Map
        writer.getAndSerialize(new Object(), null, null);
    }

    @Test
    public void testGetAndSerialize_WithMapSerializer() throws Exception {
        Map<String, String> mapVal = new HashMap<>();
        mapVal.put("key", "val");
        AnnotatedMember accessor = new TestAnnotatedMember(mapVal, "anyProp");
        DummyMapSerializer mapSerializer = new DummyMapSerializer();
        
        AnyGetterWriter writer = new AnyGetterWriter(null, accessor, mapSerializer);
        writer.getAndSerialize(new Object(), null, null);

        assertTrue("MapSerializer.serializeFields should be called", mapSerializer.serializeFieldsCalled);
    }

    @Test
    public void testGetAndSerialize_NullMapSerializer() throws Exception {
        Map<String, String> mapVal = new HashMap<>();
        AnnotatedMember accessor = new TestAnnotatedMember(mapVal, "anyProp");
        
        AnyGetterWriter writer = new AnyGetterWriter(null, accessor, null);
        // Should execute smoothly without MapSerializer
        writer.getAndSerialize(new Object(), null, null);
    }

    // --- Test Cases สำหรับ getAndFilter ---

    @Test
    public void testGetAndFilter_NullValue() throws Exception {
        AnnotatedMember accessor = new TestAnnotatedMember(null, "anyProp");
        AnyGetterWriter writer = new AnyGetterWriter(null, accessor, null);

        writer.getAndFilter(new Object(), null, null, null);
    }

    @Test(expected = JsonMappingException.class)
    public void testGetAndFilter_NotAMap_ThrowsException() throws Exception {
        AnnotatedMember accessor = new TestAnnotatedMember(12345, "anyProp");
        AnyGetterWriter writer = new AnyGetterWriter(null, accessor, null);

        writer.getAndFilter(new Object(), null, null, null);
    }

    @Test
    public void testGetAndFilter_WithMapSerializer() throws Exception {
        Map<String, String> mapVal = Collections.singletonMap("a", "b");
        AnnotatedMember accessor = new TestAnnotatedMember(mapVal, "anyProp");
        DummyMapSerializer mapSerializer = new DummyMapSerializer();

        AnyGetterWriter writer = new AnyGetterWriter(null, accessor, mapSerializer);
        writer.getAndFilter(new Object(), null, null, null);

        assertTrue("MapSerializer.serializeFilteredFields should be called", mapSerializer.serializeFilteredCalled);
    }

    @Test
    public void testGetAndFilter_NullMapSerializer() throws Exception {
        Map<String, String> mapVal = Collections.singletonMap("a", "b");
        AnnotatedMember accessor = new TestAnnotatedMember(mapVal, "anyProp");

        AnyGetterWriter writer = new AnyGetterWriter(null, accessor, null);
        writer.getAndFilter(new Object(), null, null, null);
    }

    // --- Test Cases สำหรับ resolve ---

    @Test
    public void testResolve() throws Exception {
        DummyMapSerializer mapSerializer = new DummyMapSerializer();
        AnyGetterWriter writer = new AnyGetterWriter(null, null, mapSerializer);
        
        // ObjectMapper provides SerializerProvider context
        ObjectMapper mapper = new ObjectMapper();
        SerializerProvider provider = mapper.getSerializerProvider();

        // Ensure resolve method executes successfully
        writer.resolve(provider);
    }
}