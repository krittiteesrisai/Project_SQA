package com.fasterxml.jackson.databind.ser;

import org.junit.Test;
import static org.junit.Assert.*;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

import com.fasterxml.jackson.core.io.SerializedString;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.introspect.*;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor;
import com.fasterxml.jackson.databind.jsonschema.SchemaAware;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.fasterxml.jackson.databind.util.Annotations;
import com.fasterxml.jackson.databind.util.NameTransformer;

public class BeanPropertyWriterTest {

    // Dummy class for reflection testing
    static class DummyBean {
        public String publicField = "testValue";
        private String property = "propValue";
        public String getProperty() { return property; }
    }

    // Helper method to create a minimal BeanPropertyWriter via AnnotatedField
    private BeanPropertyWriter createFieldWriter() throws Exception {
        Field f = DummyBean.class.getField("publicField");
        AnnotatedField annField = new AnnotatedField(null, f, null);
        PropertyName propName = new PropertyName("publicField");
        BeanPropertyDefinition propDef = new SimpleBeanPropertyDefinition(null, propName, null, null, null);
        
        return new BeanPropertyWriter(propDef, annField, null, null, null, null, null, false, null);
    }

    // Helper method to create a BeanPropertyWriter via AnnotatedMethod
    private BeanPropertyWriter createMethodWriter() throws Exception {
        Method m = DummyBean.class.getMethod("getProperty");
        AnnotatedMethod annMethod = new AnnotatedMethod(null, m, null, null);
        PropertyName propName = new PropertyName("property");
        BeanPropertyDefinition propDef = new SimpleBeanPropertyDefinition(null, propName, null, null, null);
        
        return new BeanPropertyWriter(propDef, annMethod, null, null, null, null, null, false, null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructorInvalidMemberType() throws Exception {
        PropertyName propName = new PropertyName("invalid");
        BeanPropertyDefinition propDef = new SimpleBeanPropertyDefinition(null, propName, null, null, null);
        // Pass a mock or dummy AnnotatedMember that is neither Field nor Method (e.g., AnnotatedClass)
        AnnotatedClass invalidMember = new AnnotatedClass(null, DummyBean.class, null);
        
        new BeanPropertyWriter(propDef, invalidMember, null, null, null, null, null, false, null);
    }

    @Test
    public void testAssignSerializerValidAndInvalid() throws Exception {
        BeanPropertyWriter bpw = createFieldWriter();
        assertFalse(bpw.hasSerializer());

        JsonSerializer<Object> ser1 = (JsonSerializer<Object>) (JsonSerializer<?>) new JsonSerializer<Object>() {
            @Override
            public void serialize(Object value, com.fasterxml.jackson.core.JsonGenerator gen, SerializerProvider serializers) {}
        };
        JsonSerializer<Object> ser2 = (JsonSerializer<Object>) (JsonSerializer<?>) new JsonSerializer<Object>() {
            @Override
            public void serialize(Object value, com.fasterxml.jackson.core.JsonGenerator gen, SerializerProvider serializers) {}
        };

        // First assignment
        bpw.assignSerializer(ser1);
        assertTrue(bpw.hasSerializer());

        // Re-assign same serializer should not throw
        bpw.assignSerializer(ser1);

        // Re-assign different serializer should throw IllegalStateException
        try {
            bpw.assignSerializer(ser2);
            fail("Expected IllegalStateException due to overriding serializer");
        } catch (IllegalStateException e) {
            // expected
        }
    }

    @Test
    public void testAssignNullSerializerValidAndInvalid() throws Exception {
        BeanPropertyWriter bpw = createFieldWriter();
        assertFalse(bpw.hasNullSerializer());

        JsonSerializer<Object> nullSer1 = (JsonSerializer<Object>) (JsonSerializer<?>) new JsonSerializer<Object>() {
            @Override
            public void serialize(Object value, com.fasterxml.jackson.core.JsonGenerator gen, SerializerProvider serializers) {}
        };
        JsonSerializer<Object> nullSer2 = (JsonSerializer<Object>) (JsonSerializer<?>) new JsonSerializer<Object>() {
            @Override
            public void serialize(Object value, com.fasterxml.jackson.core.JsonGenerator gen, SerializerProvider serializers) {}
        };

        bpw.assignNullSerializer(nullSer1);
        assertTrue(bpw.hasNullSerializer());

        // Re-assign same null serializer
        bpw.assignNullSerializer(nullSer1);

        // Re-assign different null serializer
        try {
            bpw.assignNullSerializer(nullSer2);
            fail("Expected IllegalStateException due to overriding null serializer");
        } catch (IllegalStateException e) {
            // expected
        }
    }

    @Test
    public void testInternalSettingsOperations() throws Exception {
        BeanPropertyWriter bpw = createFieldWriter();
        
        // Get non-existent setting when map is null
        assertNull(bpw.getInternalSetting("key1"));

        // Set setting (initializes map)
        assertNull(bpw.setInternalSetting("key1", "val1"));
        assertEquals("val1", bpw.getInternalSetting("key1"));

        // Remove non-existent key
        assertNull(bpw.removeInternalSetting("nonExistent"));

        // Remove existing key (triggers map.size() == 0 branch -> sets map to null)
        assertEquals("val1", bpw.removeInternalSetting("key1"));
        assertNull(bpw.getInternalSetting("key1"));
    }

    @Test
    public void testToStringFormatting() throws Exception {
        BeanPropertyWriter fieldBpw = createFieldWriter();
        String fieldStr = fieldBpw.toString();
        assertTrue(fieldStr.contains("property 'publicField'"));
        assertTrue(fieldStr.contains("field \""));
        assertTrue(fieldStr.contains("no static serializer"));

        BeanPropertyWriter methodBpw = createMethodWriter();
        String methodStr = methodBpw.toString();
        assertTrue(methodStr.contains("property 'property'"));
        assertTrue(methodStr.contains("via method "));
    }

    @Test
    public void testGettersAndBasicProperties() throws Exception {
        BeanPropertyWriter bpw = createFieldWriter();
        assertEquals("publicField", bpw.getName());
        assertNotNull(bpw.getSerializedName());
        assertFalse(bpw.willSuppressNulls());
        assertNull(bpw.getSerializationType());
        assertNull(bpw.getRawSerializationType());
        assertNotNull(bpw.getPropertyType());
        assertNotNull(bpw.getGenericPropertyType());
        assertNull(bpw.getViews());

        // Test method property type branches
        BeanPropertyWriter methodBpw = createMethodWriter();
        assertNotNull(methodBpw.getPropertyType());
        assertNotNull(methodBpw.getGenericPropertyType());
    }

    @Test
    public void testRename() throws Exception {
        BeanPropertyWriter bpw = createFieldWriter();
        NameTransformer transformer = new NameTransformer() {
            @Override
            public String transform(String name) {
                return name + "_transformed";
            }
        };
        BeanPropertyWriter renamed = bpw.rename(transformer);
        assertNotNull(renamed);
        assertEquals("publicField_transformed", renamed.getName());

        // Test rename where name doesn't change
        NameTransformer identityTransformer = NameTransformer.NOP;
        BeanPropertyWriter same = bpw.rename(identityTransformer);
        assertSame(bpw, same);
    }
}