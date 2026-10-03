package com.fasterxml.jackson.databind.introspect;

import org.junit.Test;
import static org.junit.Assert.*;

import com.fasterxml.jackson.annotation.ObjectIdGenerator;
import com.fasterxml.jackson.annotation.ObjectIdResolver;
import com.fasterxml.jackson.annotation.SimpleObjectIdResolver;
import com.fasterxml.jackson.databind.PropertyName;

public class ObjectIdInfoTest {

    // Dummy generator and resolver for testing purposes
    private static class DummyGenerator extends ObjectIdGenerator<Object> {
        @Override public boolean canUseFor(ObjectIdGenerator<?> gen) { return false; }
        @Override public ObjectIdGenerator<Object> forScope(Class<?> scope) { return null; }
        @Override public ObjectIdGenerator<Object> newForSerialization(Object context) { return null; }
        @Override public Object generateId(Object forPojo) { return null; }
        @Override public IdKey key(Object key) { return null; }
    }

    private static class DummyResolver implements ObjectIdResolver {
        @Override public void bindItem(IdKey id, Object ob) {}
        @Override public Object resolveId(IdKey id) { return null; }
        @Override public ObjectIdResolver newForDeserialization(Object context) { return null; }
        @Override public boolean canUseFor(ObjectIdResolver resolverType) { return false; }
    }

    @Test
    public void testFullConstructorWithResolverNull() {
        // Test branch where resolver == null defaults to SimpleObjectIdResolver.class
        PropertyName prop = new PropertyName("testProp");
        ObjectIdInfo info = new ObjectIdInfo(prop, Object.class, DummyGenerator.class, null);

        assertEquals(prop, info.getPropertyName());
        assertEquals(Object.class, info.getScope());
        assertEquals(DummyGenerator.class, info.getGeneratorType());
        assertEquals(SimpleObjectIdResolver.class, info.getResolverType());
        assertFalse(info.getAlwaysAsId());
    }

    @Test
    public void testFullConstructorWithCustomResolver() {
        // Test branch where resolver is NOT null
        PropertyName prop = new PropertyName("testProp");
        ObjectIdInfo info = new ObjectIdInfo(prop, Object.class, DummyGenerator.class, DummyResolver.class);

        assertEquals(prop, info.getPropertyName());
        assertEquals(Object.class, info.getScope());
        assertEquals(DummyGenerator.class, info.getGeneratorType());
        assertEquals(DummyResolver.class, info.getResolverType());
        assertFalse(info.getAlwaysAsId());
    }

    @Test
    public void testDeprecatedConstructorScopeGen() {
        // Test deprecated constructor: ObjectIdInfo(PropertyName, Class, Class)
        PropertyName prop = new PropertyName("propName");
        ObjectIdInfo info = new ObjectIdInfo(prop, String.class, DummyGenerator.class);

        assertEquals(prop, info.getPropertyName());
        assertEquals(String.class, info.getScope());
        assertEquals(DummyGenerator.class, info.getGeneratorType());
        assertEquals(SimpleObjectIdResolver.class, info.getResolverType());
        assertFalse(info.getAlwaysAsId());
    }

    @Test
    public void testDeprecatedConstructorStringGen() {
        // Test deprecated constructor: ObjectIdInfo(String, Class, Class)
        ObjectIdInfo info = new ObjectIdInfo("stringProp", Integer.class, DummyGenerator.class);

        assertEquals(new PropertyName("stringProp"), info.getPropertyName());
        assertEquals(Integer.class, info.getScope());
        assertEquals(DummyGenerator.class, info.getGeneratorType());
        assertEquals(SimpleObjectIdResolver.class, info.getResolverType());
        assertFalse(info.getAlwaysAsId());
    }

    @Test
    public void testWithAlwaysAsIdBranches() {
        PropertyName prop = new PropertyName("prop");
        ObjectIdInfo info = new ObjectIdInfo(prop, Object.class, DummyGenerator.class, DummyResolver.class);

        // Initial state is false
        assertFalse(info.getAlwaysAsId());

        // Branch 1: _alwaysAsId == state (false == false) -> should return 'this'
        ObjectIdInfo sameInfo = info.withAlwaysAsId(false);
        assertSame("Should return the exact same instance when state matches", info, sameInfo);

        // Branch 2: _alwaysAsId != state (false != true) -> should return a new instance
        ObjectIdInfo updatedInfo = info.withAlwaysAsId(true);
        assertNotSame("Should return a new instance when state changes", info, updatedInfo);
        assertTrue(updatedInfo.getAlwaysAsId());
        
        // Branch 3: calling withAlwaysAsId(true) again should return the updated instance directly
        ObjectIdInfo sameUpdatedInfo = updatedInfo.withAlwaysAsId(true);
        assertSame(updatedInfo, sameUpdatedInfo);
    }

    @Test
    public void testToStringFormatting() {
        // Test toString() with null fields (Edge case)
        ObjectIdInfo nullInfo = new ObjectIdInfo((PropertyName) null, null, null, null);
        String nullStr = nullInfo.toString();
        assertTrue(nullStr.contains("propName=null"));
        assertTrue(nullStr.contains("scope=null"));
        assertTrue(nullStr.contains("generatorType=null"));
        assertTrue(nullStr.contains("alwaysAsId=false"));

        // Test toString() with valid fields
        ObjectIdInfo validInfo = new ObjectIdInfo(new PropertyName("id"), Object.class, DummyGenerator.class, DummyResolver.class);
        String validStr = validInfo.toString();
        assertTrue(validStr.contains("propName=id"));
        assertTrue(validStr.contains("scope=" + Object.class.getName()));
        assertTrue(validStr.contains("generatorType=" + DummyGenerator.class.getName()));
        assertTrue(validStr.contains("alwaysAsId=false"));
    }
}