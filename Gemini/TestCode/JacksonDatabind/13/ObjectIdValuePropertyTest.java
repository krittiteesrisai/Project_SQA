package com.fasterxml.jackson.databind.deser.impl;

import com.fasterxml.jackson.annotation.ObjectIdGenerator;
import com.fasterxml.jackson.annotation.ObjectIdResolver;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.type.TypeFactory;
import org.junit.Test;

import java.beans.ConstructorProperties;
import java.io.IOException;

import static org.junit.Assert.*;

/**
 * Senior Java Test Automation Engineer - JUnit 4 Test Suite
 * Target Class: com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty
 * Defects4J: JacksonDatabind-13b
 */
public class ObjectIdValuePropertyTest {

    // Helper dummy classes and generators for testing
    public static class DummyBean {
        public String id;
        public String name;
    }

    public static class DummyObjectIdGenerator extends ObjectIdGenerator<String> {
        @Override public Class<?> getScope() { return Object.class; }
        @Override public ObjectIdGenerator<String> forScope(Class<?> scope) { return this; }
        @Override public ObjectIdGenerator<String> newForSerialization(Object context) { return this; }
        @Override public IdKey key(Object key) { return new IdKey(getClass(), getScope(), key); }
        @Override public String generateId(Object forPojo) { return "test-id"; }
    }

    public static class DummyResolver implements ObjectIdResolver {
        @Override public void bindItem(IdKey id, Object ob) {}
        @Override public Object resolveId(IdKey id) { return null; }
        @Override public ObjectIdResolver newForDeserialization(Object context) { return this; }
        @Override public boolean canUseFor(ObjectIdResolver resolver) { return true; }
    }

    private ObjectIdReader createObjectIdReader(SettableBeanProperty idProp) {
        JavaType idType = TypeFactory.defaultInstance().constructType(String.class);
        PropertyName propName = new PropertyName("id");
        ObjectIdGenerator<String> generator = new DummyObjectIdGenerator();
        ObjectIdResolver resolver = new DummyResolver();
        JsonDeserializer<?> deser = new JsonDeserializer<Object>() {
            @Override
            public Object deserialize(com.fasterxml.jackson.core.JsonParser p, DeserializationContext ctxt) throws IOException {
                return "mock-id-value";
            }
        };

        return new ObjectIdReader(idType, propName, generator, deser, idProp, resolver);
    }

    @Test
    public void testConstructorsAndWithMethods() {
        ObjectIdReader reader = createObjectIdReader(null);
        PropertyMetadata metadata = PropertyMetadata.STD_REQUIRED;

        ObjectIdValueProperty prop = new ObjectIdValueProperty(reader, metadata);
        assertNotNull(prop);

        // Test copy constructor with deserializer
        ObjectIdValueProperty propDeser = new ObjectIdValueProperty(prop, prop._valueDeserializer);
        assertNotNull(propDeser);

        // Test deprecated copy constructor with PropertyName
        ObjectIdValueProperty propName = new ObjectIdValueProperty(prop, new PropertyName("newId"));
        assertNotNull(propName);

        // Test deprecated copy constructor with String
        ObjectIdValueProperty propStrName = new ObjectIdValueProperty(prop, "stringId");
        assertNotNull(propStrName);

        // Test withName
        ObjectIdValueProperty propWithNewName = prop.withName(new PropertyName("anotherName"));
        assertNotNull(propWithNewName);

        // Test withValueDeserializer
        ObjectIdValueProperty propWithDeser = prop.withValueDeserializer(prop._valueDeserializer);
        assertNotNull(propWithDeser);
    }

    @Test
    public void testBeanPropertyImplementations() {
        ObjectIdReader reader = createObjectIdReader(null);
        ObjectIdValueProperty prop = new ObjectIdValueProperty(reader, PropertyMetadata.STD_OPTIONAL);

        // getAnnotation should always return null
        assertNull(prop.getAnnotation(ConstructorProperties.class));

        // getMember should always return null
        assertNull(prop.getMember());
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testSetAndReturnWithoutIdPropertyThrowsException() throws IOException {
        // Edge Case: idProp is null, calling setAndReturn should trigger UnsupportedOperationException
        ObjectIdReader reader = createObjectIdReader(null);
        ObjectIdValueProperty prop = new ObjectIdValueProperty(reader, PropertyMetadata.STD_OPTIONAL);

        DummyBean instance = new DummyBean();
        prop.setAndReturn(instance, "some-value");
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testSetWithoutIdPropertyThrowsException() throws IOException {
        // Edge Case: idProp is null, calling set should also trigger UnsupportedOperationException via setAndReturn
        ObjectIdReader reader = createObjectIdReader(null);
        ObjectIdValueProperty prop = new ObjectIdValueProperty(reader, PropertyMetadata.STD_OPTIONAL);

        DummyBean instance = new DummyBean();
        prop.set(instance, "some-value");
    }

    @Test
    public void testSetAndReturnWithValidIdProperty() throws IOException {
        // Setup a dummy idProperty using a real SettableBeanProperty (e.g., CreatorProperty or similar, or a custom anonymous subclass)
        JavaType idType = TypeFactory.defaultInstance().constructType(String.class);
        PropertyName propName = new PropertyName("id");
        PropertyMetadata metadata = PropertyMetadata.STD_OPTIONAL;
        
        SettableBeanProperty dummyIdProp = new SettableBeanProperty(propName, idType, metadata, null) {
            @Override public SettableBeanProperty withName(PropertyName newName) { return this; }
            @Override public SettableBeanProperty withValueDeserializer(JsonDeserializer<?> deser) { return this; }
            @Override public void deserializeAndSet(com.fasterxml.jackson.core.JsonParser p, DeserializationContext ctxt, Object instance) {}
            @Override public Object deserializeSetAndReturn(com.fasterxml.jackson.core.JsonParser p, DeserializationContext ctxt, Object instance) { return null; }
            @Override public void set(Object instance, Object value) { ((DummyBean) instance).id = (String) value; }
            @Override public Object setAndReturn(Object instance, Object value) {
                set(instance, value);
                return instance;
            }
            @Override public <A extends java.lang.annotation.Annotation> A getAnnotation(Class<A> acls) { return null; }
            @Override public AnnotatedMember getMember() { return null; }
        };

        ObjectIdReader reader = createObjectIdReader(dummyIdProp);
        ObjectIdValueProperty prop = new ObjectIdValueProperty(reader, metadata);

        DummyBean instance = new DummyBean();
        Object result = prop.setAndReturn(instance, "id-123");

        assertEquals("id-123", instance.id);
        assertEquals(instance, result);

        // Test set() delegation as well
        prop.set(instance, "id-456");
        assertEquals("id-456", instance.id);
    }

    @Test
    public void testDeserializeSetAndReturnWithoutIdProperty() throws IOException {
        // Branch: idProp == null inside deserializeSetAndReturn
        ObjectIdReader reader = createObjectIdReader(null);
        ObjectIdValueProperty prop = new ObjectIdValueProperty(reader, PropertyMetadata.STD_OPTIONAL);

        ObjectMapper mapper = new ObjectMapper();
        com.fasterxml.jackson.core.JsonParser jp = mapper.getFactory().createParser("\"some-id\"");
        jp.nextToken(); // move to value
        DeserializationContext ctxt = mapper.getDeserializationContext();

        DummyBean instance = new DummyBean();
        Object result = prop.deserializeSetAndReturn(jp, ctxt, instance);

        assertEquals(instance, result);
        jp.close();
    }

    @Test
    public void testDeserializeAndSetDelegation() throws IOException {
        // Tests deserializeAndSet which simply delegates to deserializeSetAndReturn
        ObjectIdReader reader = createObjectIdReader(null);
        ObjectIdValueProperty prop = new ObjectIdValueProperty(reader, PropertyMetadata.STD_OPTIONAL);

        ObjectMapper mapper = new ObjectMapper();
        com.fasterxml.jackson.core.JsonParser jp = mapper.getFactory().createParser("\"some-id\"");
        jp.nextToken();
        DeserializationContext ctxt = mapper.getDeserializationContext();

        DummyBean instance = new DummyBean();
        // Should execute without exception
        prop.deserializeAndSet(jp, ctxt, instance);
        jp.close();
    }
}