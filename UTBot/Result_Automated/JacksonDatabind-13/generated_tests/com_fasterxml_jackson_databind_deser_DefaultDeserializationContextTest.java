package com.fasterxml.jackson.databind.deser;

import org.junit.Test;
import com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl;
import java.util.LinkedHashMap;
import com.fasterxml.jackson.annotation.ObjectIdGenerator.IdKey;
import com.fasterxml.jackson.annotation.ObjectIdGenerator;
import com.fasterxml.jackson.databind.deser.impl.ReadableObjectId;
import java.util.LinkedList;
import com.fasterxml.jackson.databind.ser.impl.PropertyBasedObjectIdGenerator;
import com.fasterxml.jackson.annotation.ObjectIdResolver;
import com.fasterxml.jackson.annotation.SimpleObjectIdResolver;
import java.util.Map;
import java.util.ArrayList;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer;
import com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer;
import com.fasterxml.jackson.databind.deser.std.NumberDeserializers.IntegerDeserializer;
import com.fasterxml.jackson.databind.deser.std.NumberDeserializers;
import com.fasterxml.jackson.databind.KeyDeserializer;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public final class com_fasterxml_jackson_databind_deser_DefaultDeserializationContextTest {
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.copy
    
    ///region Errors report for copy
    
    public void testCopy_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        /* There is no instantiatable inheritor of the class under test
        that does not override a method given for testing */
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.checkUnresolvedObjectId
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method checkUnresolvedObjectId()
    
    /**
    @utbot.classUnderTest {@link DefaultDeserializationContext}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.DefaultDeserializationContext#checkUnresolvedObjectId()}
 * @utbot.executesCondition {@code (_objectIds == null): False}
 * @utbot.executesCondition {@code (!isEnabled(DeserializationFeature.FAIL_ON_UNRESOLVED_OBJECT_IDS)): True}
 * @utbot.returnsFrom {@code return;}
 *  */
    @Test
    public void testCheckUnresolvedObjectId_NotIsEnabled() throws Exception  {
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        LinkedHashMap _objectIds = new LinkedHashMap();
        impl._objectIds = _objectIds;
        
        impl.checkUnresolvedObjectId();
    }
    
    /**
    @utbot.classUnderTest {@link DefaultDeserializationContext}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.DefaultDeserializationContext#checkUnresolvedObjectId()}
 * @utbot.executesCondition {@code (_objectIds == null): False}
 * @utbot.executesCondition {@code (!isEnabled(DeserializationFeature.FAIL_ON_UNRESOLVED_OBJECT_IDS)): False}
 * @utbot.executesCondition {@code (exception != null): False}
 * @utbot.invokes {@link java.util.LinkedHashMap#entrySet()}
 * @utbot.invokes {@link java.util.Set#iterator()}
 *  */
    @Test
    public void testCheckUnresolvedObjectId_ExceptionEqualsNull() throws Exception  {
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        LinkedHashMap _objectIds = new LinkedHashMap();
        impl._objectIds = _objectIds;
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_featureFlags", 1024);
        
        impl.checkUnresolvedObjectId();
    }
    
    /**
    @utbot.classUnderTest {@link DefaultDeserializationContext}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.DefaultDeserializationContext#checkUnresolvedObjectId()}
 * @utbot.executesCondition {@code (_objectIds == null): True}
 * @utbot.returnsFrom {@code return;}
 *  */
    @Test
    public void testCheckUnresolvedObjectId__objectIdsEqualsNull() throws UnresolvedForwardReference  {
        DefaultDeserializationContext.Impl impl = new DefaultDeserializationContext.Impl(null, null);
        
        impl.checkUnresolvedObjectId();
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method checkUnresolvedObjectId()
    
    /**
    @utbot.classUnderTest {@link DefaultDeserializationContext}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.DefaultDeserializationContext#checkUnresolvedObjectId()}
 * @utbot.executesCondition {@code (_objectIds == null): False}
 * @utbot.executesCondition {@code (!isEnabled(DeserializationFeature.FAIL_ON_UNRESOLVED_OBJECT_IDS)): False}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.deser.DefaultDeserializationContext#isEnabled(com.fasterxml.jackson.databind.DeserializationFeature)}
 * @utbot.invokes {@link java.util.LinkedHashMap#entrySet()}
 * @utbot.invokes {@link java.util.Set#iterator()}
 * @utbot.iterates iterate the loop {@code for(Entry<IdKey, ReadableObjectId> entry: _objectIds.entrySet())} once
 * @utbot.throwsException {@link java.lang.NullPointerException} when: roid.hasReferringProperties()
 *  */
    @Test
    public void testCheckUnresolvedObjectId_ThrowNullPointerException() throws Exception  {
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        LinkedHashMap _objectIds = new LinkedHashMap();
        ObjectIdGenerator.IdKey idKey = ((ObjectIdGenerator.IdKey) createInstance("com.fasterxml.jackson.annotation.ObjectIdGenerator$IdKey"));
        _objectIds.put(idKey, null);
        impl._objectIds = _objectIds;
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_featureFlags", 1024);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.checkUnresolvedObjectId] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.checkUnresolvedObjectId(DefaultDeserializationContext.java:152) */
        impl.checkUnresolvedObjectId();
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method checkUnresolvedObjectId()
    
    @Test
    public void testCheckUnresolvedObjectId1() throws Exception  {
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        LinkedHashMap _objectIds = new LinkedHashMap();
        ObjectIdGenerator.IdKey idKey = ((ObjectIdGenerator.IdKey) createInstance("com.fasterxml.jackson.annotation.ObjectIdGenerator$IdKey"));
        ReadableObjectId readableObjectId = ((ReadableObjectId) createInstance("com.fasterxml.jackson.databind.deser.impl.ReadableObjectId"));
        _objectIds.put(idKey, readableObjectId);
        impl._objectIds = _objectIds;
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_featureFlags", 1024);
        
        impl.checkUnresolvedObjectId();
    }
    
    @Test
    public void testCheckUnresolvedObjectId2() throws Exception  {
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        LinkedHashMap _objectIds = new LinkedHashMap();
        ObjectIdGenerator.IdKey idKey = ((ObjectIdGenerator.IdKey) createInstance("com.fasterxml.jackson.annotation.ObjectIdGenerator$IdKey"));
        ReadableObjectId readableObjectId = ((ReadableObjectId) createInstance("com.fasterxml.jackson.databind.deser.impl.ReadableObjectId"));
        LinkedList _referringProperties = new LinkedList();
        setField(readableObjectId, "com.fasterxml.jackson.databind.deser.impl.ReadableObjectId", "_referringProperties", _referringProperties);
        _objectIds.put(idKey, readableObjectId);
        impl._objectIds = _objectIds;
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_featureFlags", 1024);
        
        impl.checkUnresolvedObjectId();
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method checkUnresolvedObjectId()
    
    @Test
    public void testCheckUnresolvedObjectId3() throws Exception  {
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        LinkedHashMap _objectIds = new LinkedHashMap();
        ObjectIdGenerator.IdKey idKey = ((ObjectIdGenerator.IdKey) createInstance("com.fasterxml.jackson.annotation.ObjectIdGenerator$IdKey"));
        ReadableObjectId readableObjectId = ((ReadableObjectId) createInstance("com.fasterxml.jackson.databind.deser.impl.ReadableObjectId"));
        _objectIds.put(idKey, readableObjectId);
        _objectIds.put(null, null);
        impl._objectIds = _objectIds;
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_featureFlags", 1024);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.checkUnresolvedObjectId] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.checkUnresolvedObjectId(DefaultDeserializationContext.java:152) */
        impl.checkUnresolvedObjectId();
    }
    
    @Test
    public void testCheckUnresolvedObjectId4() throws Exception  {
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        LinkedHashMap _objectIds = new LinkedHashMap();
        ReadableObjectId readableObjectId = ((ReadableObjectId) createInstance("com.fasterxml.jackson.databind.deser.impl.ReadableObjectId"));
        LinkedList _referringProperties = new LinkedList();
        _referringProperties.add(null);
        _referringProperties.add(null);
        _referringProperties.add(null);
        _referringProperties.add(null);
        _referringProperties.add(null);
        _referringProperties.add(null);
        _referringProperties.add(null);
        _referringProperties.add(null);
        _referringProperties.add(null);
        _referringProperties.add(null);
        setField(readableObjectId, "com.fasterxml.jackson.databind.deser.impl.ReadableObjectId", "_referringProperties", _referringProperties);
        _objectIds.put(null, readableObjectId);
        impl._objectIds = _objectIds;
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_featureFlags", 1024);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.checkUnresolvedObjectId] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.checkUnresolvedObjectId(DefaultDeserializationContext.java:158) */
        impl.checkUnresolvedObjectId();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.findObjectId
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method findObjectId(java.lang.Object, com.fasterxml.jackson.annotation.ObjectIdGenerator)
    
    /**
    @utbot.classUnderTest {@link DefaultDeserializationContext}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.DefaultDeserializationContext#findObjectId(java.lang.Object,com.fasterxml.jackson.annotation.ObjectIdGenerator)}
 * @utbot.returnsFrom {@code return findObjectId(id, gen, new SimpleObjectIdResolver());}
 *  */
    @Test
    public void testFindObjectId_ReturnFindObjectId() throws Exception  {
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        LinkedHashMap _objectIds = new LinkedHashMap();
        ReadableObjectId readableObjectId = ((ReadableObjectId) createInstance("com.fasterxml.jackson.databind.deser.impl.ReadableObjectId"));
        _objectIds.put(null, readableObjectId);
        impl._objectIds = _objectIds;
        PropertyBasedObjectIdGenerator propertyBasedObjectIdGenerator = ((PropertyBasedObjectIdGenerator) createInstance("com.fasterxml.jackson.databind.ser.impl.PropertyBasedObjectIdGenerator"));
        
        ReadableObjectId actual = impl.findObjectId(null, propertyBasedObjectIdGenerator);
        
        Object actualItem = actual.item;
        assertNull(actualItem);
        
        Object actualId = actual.id;
        assertNull(actualId);
        
        ObjectIdGenerator.IdKey actual_key = ((ObjectIdGenerator.IdKey) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.impl.ReadableObjectId", "_key"));
        assertNull(actual_key);
        
        LinkedList actual_referringProperties = ((LinkedList) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.impl.ReadableObjectId", "_referringProperties"));
        assertNull(actual_referringProperties);
        
        ObjectIdResolver actual_resolver = ((ObjectIdResolver) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.impl.ReadableObjectId", "_resolver"));
        assertNull(actual_resolver);
        
    }
    
    /**
    @utbot.classUnderTest {@link DefaultDeserializationContext}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.DefaultDeserializationContext#findObjectId(java.lang.Object,com.fasterxml.jackson.annotation.ObjectIdGenerator)}
 * @utbot.returnsFrom {@code return findObjectId(id, gen, new SimpleObjectIdResolver());}
 *  */
    @Test
    public void testFindObjectId_ReturnFindObjectId_1() throws Exception  {
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        LinkedHashMap _objectIds = new LinkedHashMap();
        ReadableObjectId readableObjectId = ((ReadableObjectId) createInstance("com.fasterxml.jackson.databind.deser.impl.ReadableObjectId"));
        _objectIds.put(null, readableObjectId);
        impl._objectIds = _objectIds;
        com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator propertyBasedObjectIdGenerator = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(null);
        
        ReadableObjectId actual = impl.findObjectId(null, propertyBasedObjectIdGenerator);
        
        Object actualItem = actual.item;
        assertNull(actualItem);
        
        Object actualId = actual.id;
        assertNull(actualId);
        
        ObjectIdGenerator.IdKey actual_key = ((ObjectIdGenerator.IdKey) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.impl.ReadableObjectId", "_key"));
        assertNull(actual_key);
        
        LinkedList actual_referringProperties = ((LinkedList) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.impl.ReadableObjectId", "_referringProperties"));
        assertNull(actual_referringProperties);
        
        ObjectIdResolver actual_resolver = ((ObjectIdResolver) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.impl.ReadableObjectId", "_resolver"));
        assertNull(actual_resolver);
        
    }
    
    /**
    @utbot.classUnderTest {@link DefaultDeserializationContext}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.DefaultDeserializationContext#findObjectId(java.lang.Object,com.fasterxml.jackson.annotation.ObjectIdGenerator)}
 * @utbot.returnsFrom {@code return findObjectId(id, gen, new SimpleObjectIdResolver());}
 *  */
    @Test
    public void testFindObjectId_ReturnFindObjectId_2() throws Exception  {
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        LinkedHashMap _objectIds = new LinkedHashMap();
        ObjectIdGenerator.IdKey idKey = ((ObjectIdGenerator.IdKey) createInstance("com.fasterxml.jackson.annotation.ObjectIdGenerator$IdKey"));
        Class type = Object.class;
        setField(idKey, "com.fasterxml.jackson.annotation.ObjectIdGenerator$IdKey", "type", type);
        Integer key = 0;
        setField(idKey, "com.fasterxml.jackson.annotation.ObjectIdGenerator$IdKey", "key", key);
        ReadableObjectId readableObjectId = ((ReadableObjectId) createInstance("com.fasterxml.jackson.databind.deser.impl.ReadableObjectId"));
        _objectIds.put(idKey, readableObjectId);
        impl._objectIds = _objectIds;
        Integer integer = 0;
        PropertyBasedObjectIdGenerator propertyBasedObjectIdGenerator = ((PropertyBasedObjectIdGenerator) createInstance("com.fasterxml.jackson.databind.ser.impl.PropertyBasedObjectIdGenerator"));
        
        ReadableObjectId actual = impl.findObjectId(integer, propertyBasedObjectIdGenerator);
        
        ReadableObjectId expected = ((ReadableObjectId) createInstance("com.fasterxml.jackson.databind.deser.impl.ReadableObjectId"));
        setField(expected, "com.fasterxml.jackson.databind.deser.impl.ReadableObjectId", "id", integer);
        ObjectIdGenerator.IdKey _key = ((ObjectIdGenerator.IdKey) createInstance("com.fasterxml.jackson.annotation.ObjectIdGenerator$IdKey"));
        Class type1 = PropertyBasedObjectIdGenerator.class;
        setField(_key, "com.fasterxml.jackson.annotation.ObjectIdGenerator$IdKey", "type", type1);
        setField(_key, "com.fasterxml.jackson.annotation.ObjectIdGenerator$IdKey", "key", integer);
        setField(_key, "com.fasterxml.jackson.annotation.ObjectIdGenerator$IdKey", "hashCode", 1015462492);
        setField(expected, "com.fasterxml.jackson.databind.deser.impl.ReadableObjectId", "_key", _key);
        SimpleObjectIdResolver _resolver = ((SimpleObjectIdResolver) createInstance("com.fasterxml.jackson.annotation.SimpleObjectIdResolver"));
        setField(expected, "com.fasterxml.jackson.databind.deser.impl.ReadableObjectId", "_resolver", _resolver);
        
        Object actualItem = actual.item;
        assertNull(actualItem);
        
        Object expectedId = expected.id;
        Object actualId = actual.id;
        assertEquals(expectedId, actualId);
        
        ObjectIdGenerator.IdKey expected_key = ((ObjectIdGenerator.IdKey) getFieldValue(expected, "com.fasterxml.jackson.databind.deser.impl.ReadableObjectId", "_key"));
        ObjectIdGenerator.IdKey actual_key = ((ObjectIdGenerator.IdKey) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.impl.ReadableObjectId", "_key"));
        // com.fasterxml.jackson.annotation.ObjectIdGenerator.IdKey has overridden equals method
        assertEquals(expected_key, actual_key);
        
        LinkedList actual_referringProperties = ((LinkedList) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.impl.ReadableObjectId", "_referringProperties"));
        assertNull(actual_referringProperties);
        
        ObjectIdResolver expected_resolver = ((ObjectIdResolver) getFieldValue(expected, "com.fasterxml.jackson.databind.deser.impl.ReadableObjectId", "_resolver"));
        ObjectIdResolver actual_resolver = ((ObjectIdResolver) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.impl.ReadableObjectId", "_resolver"));
        Map actual_resolver_items = ((Map) getFieldValue(actual_resolver, "com.fasterxml.jackson.annotation.SimpleObjectIdResolver", "_items"));
        assertNull(actual_resolver_items);
        
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method findObjectId(java.lang.Object, com.fasterxml.jackson.annotation.ObjectIdGenerator)
    
    @Test
    public void testFindObjectId1() throws Exception  {
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        LinkedHashMap _objectIds = new LinkedHashMap();
        impl._objectIds = _objectIds;
        Character character = '\uFF00';
        PropertyBasedObjectIdGenerator propertyBasedObjectIdGenerator = ((PropertyBasedObjectIdGenerator) createInstance("com.fasterxml.jackson.databind.ser.impl.PropertyBasedObjectIdGenerator"));
        Class _scope = Object.class;
        setField(propertyBasedObjectIdGenerator, "com.fasterxml.jackson.annotation.ObjectIdGenerators$Base", "_scope", _scope);
        
        Class initialPropertyBasedObjectIdGenerator_scope = ((Class) getFieldValue(propertyBasedObjectIdGenerator, "com.fasterxml.jackson.annotation.ObjectIdGenerators$Base", "_scope"));
        
        ReadableObjectId actual = impl.findObjectId(character, propertyBasedObjectIdGenerator);
        
        ReadableObjectId expected = ((ReadableObjectId) createInstance("com.fasterxml.jackson.databind.deser.impl.ReadableObjectId"));
        setField(expected, "com.fasterxml.jackson.databind.deser.impl.ReadableObjectId", "id", character);
        ObjectIdGenerator.IdKey _key = ((ObjectIdGenerator.IdKey) createInstance("com.fasterxml.jackson.annotation.ObjectIdGenerator$IdKey"));
        Class type = PropertyBasedObjectIdGenerator.class;
        setField(_key, "com.fasterxml.jackson.annotation.ObjectIdGenerator$IdKey", "type", type);
        setField(_key, "com.fasterxml.jackson.annotation.ObjectIdGenerator$IdKey", "scope", _scope);
        setField(_key, "com.fasterxml.jackson.annotation.ObjectIdGenerator$IdKey", "key", character);
        setField(_key, "com.fasterxml.jackson.annotation.ObjectIdGenerator$IdKey", "hashCode", 65978575);
        setField(expected, "com.fasterxml.jackson.databind.deser.impl.ReadableObjectId", "_key", _key);
        SimpleObjectIdResolver _resolver = ((SimpleObjectIdResolver) createInstance("com.fasterxml.jackson.annotation.SimpleObjectIdResolver"));
        setField(expected, "com.fasterxml.jackson.databind.deser.impl.ReadableObjectId", "_resolver", _resolver);
        
        Object actualItem = actual.item;
        assertNull(actualItem);
        
        Object expectedId = expected.id;
        Object actualId = actual.id;
        assertEquals(expectedId, actualId);
        
        ObjectIdGenerator.IdKey expected_key = ((ObjectIdGenerator.IdKey) getFieldValue(expected, "com.fasterxml.jackson.databind.deser.impl.ReadableObjectId", "_key"));
        ObjectIdGenerator.IdKey actual_key = ((ObjectIdGenerator.IdKey) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.impl.ReadableObjectId", "_key"));
        // com.fasterxml.jackson.annotation.ObjectIdGenerator.IdKey has overridden equals method
        assertEquals(expected_key, actual_key);
        
        LinkedList actual_referringProperties = ((LinkedList) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.impl.ReadableObjectId", "_referringProperties"));
        assertNull(actual_referringProperties);
        
        ObjectIdResolver expected_resolver = ((ObjectIdResolver) getFieldValue(expected, "com.fasterxml.jackson.databind.deser.impl.ReadableObjectId", "_resolver"));
        ObjectIdResolver actual_resolver = ((ObjectIdResolver) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.impl.ReadableObjectId", "_resolver"));
        Map actual_resolver_items = ((Map) getFieldValue(actual_resolver, "com.fasterxml.jackson.annotation.SimpleObjectIdResolver", "_items"));
        assertNull(actual_resolver_items);
        
        Class finalPropertyBasedObjectIdGenerator_scope = ((Class) getFieldValue(propertyBasedObjectIdGenerator, "com.fasterxml.jackson.annotation.ObjectIdGenerators$Base", "_scope"));
        
        assertFalse(initialPropertyBasedObjectIdGenerator_scope == finalPropertyBasedObjectIdGenerator_scope);
    }
    
    @Test
    public void testFindObjectId2() throws Exception  {
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        LinkedHashMap _objectIds = new LinkedHashMap();
        impl._objectIds = _objectIds;
        Integer integer = -256;
        Class class1 = Object.class;
        com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator propertyBasedObjectIdGenerator = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(class1);
        
        Class initialPropertyBasedObjectIdGenerator_scope = ((Class) getFieldValue(propertyBasedObjectIdGenerator, "com.fasterxml.jackson.annotation.ObjectIdGenerators$Base", "_scope"));
        
        ReadableObjectId actual = impl.findObjectId(integer, propertyBasedObjectIdGenerator);
        
        ReadableObjectId expected = ((ReadableObjectId) createInstance("com.fasterxml.jackson.databind.deser.impl.ReadableObjectId"));
        setField(expected, "com.fasterxml.jackson.databind.deser.impl.ReadableObjectId", "id", integer);
        ObjectIdGenerator.IdKey _key = ((ObjectIdGenerator.IdKey) createInstance("com.fasterxml.jackson.annotation.ObjectIdGenerator$IdKey"));
        Class type = com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator.class;
        setField(_key, "com.fasterxml.jackson.annotation.ObjectIdGenerator$IdKey", "type", type);
        setField(_key, "com.fasterxml.jackson.annotation.ObjectIdGenerator$IdKey", "scope", class1);
        setField(_key, "com.fasterxml.jackson.annotation.ObjectIdGenerator$IdKey", "key", integer);
        setField(_key, "com.fasterxml.jackson.annotation.ObjectIdGenerator$IdKey", "hashCode", 863156456);
        setField(expected, "com.fasterxml.jackson.databind.deser.impl.ReadableObjectId", "_key", _key);
        SimpleObjectIdResolver _resolver = ((SimpleObjectIdResolver) createInstance("com.fasterxml.jackson.annotation.SimpleObjectIdResolver"));
        setField(expected, "com.fasterxml.jackson.databind.deser.impl.ReadableObjectId", "_resolver", _resolver);
        
        Object actualItem = actual.item;
        assertNull(actualItem);
        
        Object expectedId = expected.id;
        Object actualId = actual.id;
        assertEquals(expectedId, actualId);
        
        ObjectIdGenerator.IdKey expected_key = ((ObjectIdGenerator.IdKey) getFieldValue(expected, "com.fasterxml.jackson.databind.deser.impl.ReadableObjectId", "_key"));
        ObjectIdGenerator.IdKey actual_key = ((ObjectIdGenerator.IdKey) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.impl.ReadableObjectId", "_key"));
        // com.fasterxml.jackson.annotation.ObjectIdGenerator.IdKey has overridden equals method
        assertEquals(expected_key, actual_key);
        
        LinkedList actual_referringProperties = ((LinkedList) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.impl.ReadableObjectId", "_referringProperties"));
        assertNull(actual_referringProperties);
        
        ObjectIdResolver expected_resolver = ((ObjectIdResolver) getFieldValue(expected, "com.fasterxml.jackson.databind.deser.impl.ReadableObjectId", "_resolver"));
        ObjectIdResolver actual_resolver = ((ObjectIdResolver) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.impl.ReadableObjectId", "_resolver"));
        Map actual_resolver_items = ((Map) getFieldValue(actual_resolver, "com.fasterxml.jackson.annotation.SimpleObjectIdResolver", "_items"));
        assertNull(actual_resolver_items);
        
        Class finalPropertyBasedObjectIdGenerator_scope = ((Class) getFieldValue(propertyBasedObjectIdGenerator, "com.fasterxml.jackson.annotation.ObjectIdGenerators$Base", "_scope"));
        
        assertFalse(initialPropertyBasedObjectIdGenerator_scope == finalPropertyBasedObjectIdGenerator_scope);
    }
    
    @Test
    public void testFindObjectId3() throws Exception  {
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        LinkedHashMap _objectIds = new LinkedHashMap();
        ObjectIdGenerator.IdKey idKey = ((ObjectIdGenerator.IdKey) createInstance("com.fasterxml.jackson.annotation.ObjectIdGenerator$IdKey"));
        ReadableObjectId readableObjectId = ((ReadableObjectId) createInstance("com.fasterxml.jackson.databind.deser.impl.ReadableObjectId"));
        _objectIds.put(idKey, readableObjectId);
        impl._objectIds = _objectIds;
        Integer integer = -256;
        PropertyBasedObjectIdGenerator propertyBasedObjectIdGenerator = ((PropertyBasedObjectIdGenerator) createInstance("com.fasterxml.jackson.databind.ser.impl.PropertyBasedObjectIdGenerator"));
        Class _scope = Object.class;
        setField(propertyBasedObjectIdGenerator, "com.fasterxml.jackson.annotation.ObjectIdGenerators$Base", "_scope", _scope);
        
        Class initialPropertyBasedObjectIdGenerator_scope = ((Class) getFieldValue(propertyBasedObjectIdGenerator, "com.fasterxml.jackson.annotation.ObjectIdGenerators$Base", "_scope"));
        
        ReadableObjectId actual = impl.findObjectId(integer, propertyBasedObjectIdGenerator);
        
        ReadableObjectId expected = ((ReadableObjectId) createInstance("com.fasterxml.jackson.databind.deser.impl.ReadableObjectId"));
        setField(expected, "com.fasterxml.jackson.databind.deser.impl.ReadableObjectId", "id", integer);
        ObjectIdGenerator.IdKey _key = ((ObjectIdGenerator.IdKey) createInstance("com.fasterxml.jackson.annotation.ObjectIdGenerator$IdKey"));
        Class type = PropertyBasedObjectIdGenerator.class;
        setField(_key, "com.fasterxml.jackson.annotation.ObjectIdGenerator$IdKey", "type", type);
        setField(_key, "com.fasterxml.jackson.annotation.ObjectIdGenerator$IdKey", "scope", _scope);
        setField(_key, "com.fasterxml.jackson.annotation.ObjectIdGenerator$IdKey", "key", integer);
        setField(_key, "com.fasterxml.jackson.annotation.ObjectIdGenerator$IdKey", "hashCode", 66044111);
        setField(expected, "com.fasterxml.jackson.databind.deser.impl.ReadableObjectId", "_key", _key);
        SimpleObjectIdResolver _resolver = ((SimpleObjectIdResolver) createInstance("com.fasterxml.jackson.annotation.SimpleObjectIdResolver"));
        setField(expected, "com.fasterxml.jackson.databind.deser.impl.ReadableObjectId", "_resolver", _resolver);
        
        Object actualItem = actual.item;
        assertNull(actualItem);
        
        Object expectedId = expected.id;
        Object actualId = actual.id;
        assertEquals(expectedId, actualId);
        
        ObjectIdGenerator.IdKey expected_key = ((ObjectIdGenerator.IdKey) getFieldValue(expected, "com.fasterxml.jackson.databind.deser.impl.ReadableObjectId", "_key"));
        ObjectIdGenerator.IdKey actual_key = ((ObjectIdGenerator.IdKey) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.impl.ReadableObjectId", "_key"));
        // com.fasterxml.jackson.annotation.ObjectIdGenerator.IdKey has overridden equals method
        assertEquals(expected_key, actual_key);
        
        LinkedList actual_referringProperties = ((LinkedList) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.impl.ReadableObjectId", "_referringProperties"));
        assertNull(actual_referringProperties);
        
        ObjectIdResolver expected_resolver = ((ObjectIdResolver) getFieldValue(expected, "com.fasterxml.jackson.databind.deser.impl.ReadableObjectId", "_resolver"));
        ObjectIdResolver actual_resolver = ((ObjectIdResolver) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.impl.ReadableObjectId", "_resolver"));
        Map actual_resolver_items = ((Map) getFieldValue(actual_resolver, "com.fasterxml.jackson.annotation.SimpleObjectIdResolver", "_items"));
        assertNull(actual_resolver_items);
        
        Class finalPropertyBasedObjectIdGenerator_scope = ((Class) getFieldValue(propertyBasedObjectIdGenerator, "com.fasterxml.jackson.annotation.ObjectIdGenerators$Base", "_scope"));
        
        assertFalse(initialPropertyBasedObjectIdGenerator_scope == finalPropertyBasedObjectIdGenerator_scope);
    }
    
    @Test
    public void testFindObjectId4() throws Exception  {
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        ArrayList _objectIdResolvers = new ArrayList();
        setField(impl, "com.fasterxml.jackson.databind.deser.DefaultDeserializationContext", "_objectIdResolvers", _objectIdResolvers);
        Integer integer = -256;
        Class class1 = Object.class;
        com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator propertyBasedObjectIdGenerator = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(class1);
        
        Class initialPropertyBasedObjectIdGenerator_scope = ((Class) getFieldValue(propertyBasedObjectIdGenerator, "com.fasterxml.jackson.annotation.ObjectIdGenerators$Base", "_scope"));
        
        ReadableObjectId actual = impl.findObjectId(integer, propertyBasedObjectIdGenerator);
        
        ReadableObjectId expected = ((ReadableObjectId) createInstance("com.fasterxml.jackson.databind.deser.impl.ReadableObjectId"));
        setField(expected, "com.fasterxml.jackson.databind.deser.impl.ReadableObjectId", "id", integer);
        ObjectIdGenerator.IdKey _key = ((ObjectIdGenerator.IdKey) createInstance("com.fasterxml.jackson.annotation.ObjectIdGenerator$IdKey"));
        Class type = com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator.class;
        setField(_key, "com.fasterxml.jackson.annotation.ObjectIdGenerator$IdKey", "type", type);
        setField(_key, "com.fasterxml.jackson.annotation.ObjectIdGenerator$IdKey", "scope", class1);
        setField(_key, "com.fasterxml.jackson.annotation.ObjectIdGenerator$IdKey", "key", integer);
        setField(_key, "com.fasterxml.jackson.annotation.ObjectIdGenerator$IdKey", "hashCode", 863156456);
        setField(expected, "com.fasterxml.jackson.databind.deser.impl.ReadableObjectId", "_key", _key);
        SimpleObjectIdResolver _resolver = ((SimpleObjectIdResolver) createInstance("com.fasterxml.jackson.annotation.SimpleObjectIdResolver"));
        setField(expected, "com.fasterxml.jackson.databind.deser.impl.ReadableObjectId", "_resolver", _resolver);
        
        Object actualItem = actual.item;
        assertNull(actualItem);
        
        Object expectedId = expected.id;
        Object actualId = actual.id;
        assertEquals(expectedId, actualId);
        
        ObjectIdGenerator.IdKey expected_key = ((ObjectIdGenerator.IdKey) getFieldValue(expected, "com.fasterxml.jackson.databind.deser.impl.ReadableObjectId", "_key"));
        ObjectIdGenerator.IdKey actual_key = ((ObjectIdGenerator.IdKey) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.impl.ReadableObjectId", "_key"));
        // com.fasterxml.jackson.annotation.ObjectIdGenerator.IdKey has overridden equals method
        assertEquals(expected_key, actual_key);
        
        LinkedList actual_referringProperties = ((LinkedList) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.impl.ReadableObjectId", "_referringProperties"));
        assertNull(actual_referringProperties);
        
        ObjectIdResolver expected_resolver = ((ObjectIdResolver) getFieldValue(expected, "com.fasterxml.jackson.databind.deser.impl.ReadableObjectId", "_resolver"));
        ObjectIdResolver actual_resolver = ((ObjectIdResolver) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.impl.ReadableObjectId", "_resolver"));
        Map actual_resolver_items = ((Map) getFieldValue(actual_resolver, "com.fasterxml.jackson.annotation.SimpleObjectIdResolver", "_items"));
        assertNull(actual_resolver_items);
        
        Class finalPropertyBasedObjectIdGenerator_scope = ((Class) getFieldValue(propertyBasedObjectIdGenerator, "com.fasterxml.jackson.annotation.ObjectIdGenerators$Base", "_scope"));
        
        assertFalse(initialPropertyBasedObjectIdGenerator_scope == finalPropertyBasedObjectIdGenerator_scope);
    }
    
    @Test
    public void testFindObjectId5() throws Exception  {
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        ArrayList _objectIdResolvers = new ArrayList();
        setField(impl, "com.fasterxml.jackson.databind.deser.DefaultDeserializationContext", "_objectIdResolvers", _objectIdResolvers);
        Integer integer = -2097408;
        PropertyBasedObjectIdGenerator propertyBasedObjectIdGenerator = ((PropertyBasedObjectIdGenerator) createInstance("com.fasterxml.jackson.databind.ser.impl.PropertyBasedObjectIdGenerator"));
        
        ReadableObjectId actual = impl.findObjectId(integer, propertyBasedObjectIdGenerator);
        
        ReadableObjectId expected = ((ReadableObjectId) createInstance("com.fasterxml.jackson.databind.deser.impl.ReadableObjectId"));
        setField(expected, "com.fasterxml.jackson.databind.deser.impl.ReadableObjectId", "id", integer);
        ObjectIdGenerator.IdKey _key = ((ObjectIdGenerator.IdKey) createInstance("com.fasterxml.jackson.annotation.ObjectIdGenerator$IdKey"));
        Class type = PropertyBasedObjectIdGenerator.class;
        setField(_key, "com.fasterxml.jackson.annotation.ObjectIdGenerator$IdKey", "type", type);
        setField(_key, "com.fasterxml.jackson.annotation.ObjectIdGenerator$IdKey", "key", integer);
        setField(_key, "com.fasterxml.jackson.annotation.ObjectIdGenerator$IdKey", "hashCode", 1013365084);
        setField(expected, "com.fasterxml.jackson.databind.deser.impl.ReadableObjectId", "_key", _key);
        SimpleObjectIdResolver _resolver = ((SimpleObjectIdResolver) createInstance("com.fasterxml.jackson.annotation.SimpleObjectIdResolver"));
        setField(expected, "com.fasterxml.jackson.databind.deser.impl.ReadableObjectId", "_resolver", _resolver);
        
        Object actualItem = actual.item;
        assertNull(actualItem);
        
        Object expectedId = expected.id;
        Object actualId = actual.id;
        assertEquals(expectedId, actualId);
        
        ObjectIdGenerator.IdKey expected_key = ((ObjectIdGenerator.IdKey) getFieldValue(expected, "com.fasterxml.jackson.databind.deser.impl.ReadableObjectId", "_key"));
        ObjectIdGenerator.IdKey actual_key = ((ObjectIdGenerator.IdKey) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.impl.ReadableObjectId", "_key"));
        // com.fasterxml.jackson.annotation.ObjectIdGenerator.IdKey has overridden equals method
        assertEquals(expected_key, actual_key);
        
        LinkedList actual_referringProperties = ((LinkedList) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.impl.ReadableObjectId", "_referringProperties"));
        assertNull(actual_referringProperties);
        
        ObjectIdResolver expected_resolver = ((ObjectIdResolver) getFieldValue(expected, "com.fasterxml.jackson.databind.deser.impl.ReadableObjectId", "_resolver"));
        ObjectIdResolver actual_resolver = ((ObjectIdResolver) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.impl.ReadableObjectId", "_resolver"));
        Map actual_resolver_items = ((Map) getFieldValue(actual_resolver, "com.fasterxml.jackson.annotation.SimpleObjectIdResolver", "_items"));
        assertNull(actual_resolver_items);
        
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method findObjectId(java.lang.Object, com.fasterxml.jackson.annotation.ObjectIdGenerator)
    
    @Test
    public void testFindObjectId6() throws Exception  {
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        LinkedHashMap _objectIds = new LinkedHashMap();
        _objectIds.put(null, null);
        impl._objectIds = _objectIds;
        PropertyBasedObjectIdGenerator propertyBasedObjectIdGenerator = ((PropertyBasedObjectIdGenerator) createInstance("com.fasterxml.jackson.databind.ser.impl.PropertyBasedObjectIdGenerator"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.findObjectId] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.impl.ReadableObjectId.<init>(ReadableObjectId.java:42)
            com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.findObjectId(DefaultDeserializationContext.java:127)
            com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.findObjectId(DefaultDeserializationContext.java:136) */
        impl.findObjectId(null, propertyBasedObjectIdGenerator);
    }
    
    @Test
    public void testFindObjectId7() throws Exception  {
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        LinkedHashMap _objectIds = new LinkedHashMap();
        _objectIds.put(null, null);
        impl._objectIds = _objectIds;
        com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator propertyBasedObjectIdGenerator = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(null);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.findObjectId] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.impl.ReadableObjectId.<init>(ReadableObjectId.java:42)
            com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.findObjectId(DefaultDeserializationContext.java:127)
            com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.findObjectId(DefaultDeserializationContext.java:136) */
        impl.findObjectId(null, propertyBasedObjectIdGenerator);
    }
    
    @Test
    public void testFindObjectId8() throws Exception  {
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        ArrayList _objectIdResolvers = new ArrayList();
        _objectIdResolvers.add(null);
        _objectIdResolvers.add(null);
        _objectIdResolvers.add(null);
        setField(impl, "com.fasterxml.jackson.databind.deser.DefaultDeserializationContext", "_objectIdResolvers", _objectIdResolvers);
        Character character = '\uFF00';
        com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator propertyBasedObjectIdGenerator = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(null);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.findObjectId] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.findObjectId(DefaultDeserializationContext.java:106)
            com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.findObjectId(DefaultDeserializationContext.java:136) */
        impl.findObjectId(character, propertyBasedObjectIdGenerator);
    }
    
    @Test
    public void testFindObjectId9() throws Exception  {
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        LinkedHashMap _objectIds = new LinkedHashMap();
        ReadableObjectId readableObjectId = ((ReadableObjectId) createInstance("com.fasterxml.jackson.databind.deser.impl.ReadableObjectId"));
        _objectIds.put(null, readableObjectId);
        impl._objectIds = _objectIds;
        ArrayList _objectIdResolvers = new ArrayList();
        _objectIdResolvers.add(null);
        _objectIdResolvers.add(null);
        _objectIdResolvers.add(null);
        setField(impl, "com.fasterxml.jackson.databind.deser.DefaultDeserializationContext", "_objectIdResolvers", _objectIdResolvers);
        Integer integer = 1576525569;
        PropertyBasedObjectIdGenerator propertyBasedObjectIdGenerator = ((PropertyBasedObjectIdGenerator) createInstance("com.fasterxml.jackson.databind.ser.impl.PropertyBasedObjectIdGenerator"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.findObjectId] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.findObjectId(DefaultDeserializationContext.java:106)
            com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.findObjectId(DefaultDeserializationContext.java:136) */
        impl.findObjectId(integer, propertyBasedObjectIdGenerator);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.findObjectId
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method findObjectId(java.lang.Object, com.fasterxml.jackson.annotation.ObjectIdGenerator, com.fasterxml.jackson.annotation.ObjectIdResolver)
    
    /**
    @utbot.classUnderTest {@link DefaultDeserializationContext}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.DefaultDeserializationContext#findObjectId(java.lang.Object,com.fasterxml.jackson.annotation.ObjectIdGenerator,com.fasterxml.jackson.annotation.ObjectIdResolver)}
 * @utbot.executesCondition {@code (_objectIds == null): False}
 * @utbot.executesCondition {@code (entry != null): True}
 * @utbot.invokes {@link com.fasterxml.jackson.annotation.ObjectIdGenerator#key(java.lang.Object)}
 * @utbot.invokes {@link java.util.LinkedHashMap#get(java.lang.Object)}
 * @utbot.returnsFrom {@code return entry;}
 *  */
    @Test
    public void testFindObjectId_EntryNotEqualsNull() throws Exception  {
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        LinkedHashMap _objectIds = new LinkedHashMap();
        ReadableObjectId readableObjectId = ((ReadableObjectId) createInstance("com.fasterxml.jackson.databind.deser.impl.ReadableObjectId"));
        _objectIds.put(null, readableObjectId);
        impl._objectIds = _objectIds;
        PropertyBasedObjectIdGenerator propertyBasedObjectIdGenerator = ((PropertyBasedObjectIdGenerator) createInstance("com.fasterxml.jackson.databind.ser.impl.PropertyBasedObjectIdGenerator"));
        
        ReadableObjectId actual = impl.findObjectId(null, propertyBasedObjectIdGenerator, null);
        
        Object actualItem = actual.item;
        assertNull(actualItem);
        
        Object actualId = actual.id;
        assertNull(actualId);
        
        ObjectIdGenerator.IdKey actual_key = ((ObjectIdGenerator.IdKey) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.impl.ReadableObjectId", "_key"));
        assertNull(actual_key);
        
        LinkedList actual_referringProperties = ((LinkedList) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.impl.ReadableObjectId", "_referringProperties"));
        assertNull(actual_referringProperties);
        
        ObjectIdResolver actual_resolver = ((ObjectIdResolver) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.impl.ReadableObjectId", "_resolver"));
        assertNull(actual_resolver);
        
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method findObjectId(java.lang.Object, com.fasterxml.jackson.annotation.ObjectIdGenerator, com.fasterxml.jackson.annotation.ObjectIdResolver)
    
    /**
    @utbot.classUnderTest {@link DefaultDeserializationContext}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.DefaultDeserializationContext#findObjectId(java.lang.Object,com.fasterxml.jackson.annotation.ObjectIdGenerator,com.fasterxml.jackson.annotation.ObjectIdResolver)}
 * @utbot.executesCondition {@code (_objectIds == null): False}
 * @utbot.executesCondition {@code (entry != null): False}
 * @utbot.executesCondition {@code (_objectIdResolvers == null): True}
 * @utbot.executesCondition {@code (resolver == null): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: resolver = resolverType.newForDeserialization(this);
 *  */
    @Test
    public void testFindObjectId_ThrowNullPointerException_5() throws Exception  {
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        LinkedHashMap _objectIds = new LinkedHashMap();
        impl._objectIds = _objectIds;
        PropertyBasedObjectIdGenerator propertyBasedObjectIdGenerator = ((PropertyBasedObjectIdGenerator) createInstance("com.fasterxml.jackson.databind.ser.impl.PropertyBasedObjectIdGenerator"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.findObjectId] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.findObjectId(DefaultDeserializationContext.java:114) */
        impl.findObjectId(null, propertyBasedObjectIdGenerator, null);
    }
    
    /**
    @utbot.classUnderTest {@link DefaultDeserializationContext}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.DefaultDeserializationContext#findObjectId(java.lang.Object,com.fasterxml.jackson.annotation.ObjectIdGenerator,com.fasterxml.jackson.annotation.ObjectIdResolver)}
 * @utbot.executesCondition {@code (_objectIds == null): True}
 * @utbot.executesCondition {@code (_objectIdResolvers == null): False}
 * @utbot.executesCondition {@code (resolver == null): True}
 * @utbot.invokes {@link java.util.List#iterator()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: resolver = resolverType.newForDeserialization(this);
 *  */
    @Test
    public void testFindObjectId_ThrowNullPointerException_6() throws Exception  {
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        ArrayList _objectIdResolvers = new ArrayList();
        setField(impl, "com.fasterxml.jackson.databind.deser.DefaultDeserializationContext", "_objectIdResolvers", _objectIdResolvers);
        PropertyBasedObjectIdGenerator propertyBasedObjectIdGenerator = ((PropertyBasedObjectIdGenerator) createInstance("com.fasterxml.jackson.databind.ser.impl.PropertyBasedObjectIdGenerator"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.findObjectId] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.findObjectId(DefaultDeserializationContext.java:114) */
        impl.findObjectId(null, propertyBasedObjectIdGenerator, null);
    }
    
    /**
    @utbot.classUnderTest {@link DefaultDeserializationContext}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.DefaultDeserializationContext#findObjectId(java.lang.Object,com.fasterxml.jackson.annotation.ObjectIdGenerator,com.fasterxml.jackson.annotation.ObjectIdResolver)}
 * @utbot.executesCondition {@code (_objectIds == null): True}
 * @utbot.executesCondition {@code (_objectIdResolvers == null): True}
 * @utbot.executesCondition {@code (resolver == null): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: resolver = resolverType.newForDeserialization(this);
 *  */
    @Test
    public void testFindObjectId_ThrowNullPointerException() throws Exception  {
        DefaultDeserializationContext.Impl impl = new DefaultDeserializationContext.Impl(null, null);
        PropertyBasedObjectIdGenerator propertyBasedObjectIdGenerator = ((PropertyBasedObjectIdGenerator) createInstance("com.fasterxml.jackson.databind.ser.impl.PropertyBasedObjectIdGenerator"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.findObjectId] produces [java.lang.NullPointerException] */
        impl.findObjectId(null, propertyBasedObjectIdGenerator, null);
    }
    
    /**
    @utbot.classUnderTest {@link DefaultDeserializationContext}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.DefaultDeserializationContext#findObjectId(java.lang.Object,com.fasterxml.jackson.annotation.ObjectIdGenerator,com.fasterxml.jackson.annotation.ObjectIdResolver)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: final ObjectIdGenerator.IdKey key = gen.key(id);
 *  */
    @Test
    public void testFindObjectId_ThrowNullPointerException_1() {
        DefaultDeserializationContext.Impl impl = new DefaultDeserializationContext.Impl(null, null);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.findObjectId] produces [java.lang.NullPointerException] */
        impl.findObjectId(null, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link DefaultDeserializationContext}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.DefaultDeserializationContext#findObjectId(java.lang.Object,com.fasterxml.jackson.annotation.ObjectIdGenerator,com.fasterxml.jackson.annotation.ObjectIdResolver)}
 * @utbot.executesCondition {@code (_objectIds == null): True}
 * @utbot.executesCondition {@code (_objectIdResolvers == null): True}
 * @utbot.executesCondition {@code (resolver == null): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: resolver = resolverType.newForDeserialization(this);
 *  */
    @Test
    public void testFindObjectId_ThrowNullPointerException_2() throws Exception  {
        DefaultDeserializationContext.Impl impl = new DefaultDeserializationContext.Impl(null, null);
        Integer integer = -256;
        PropertyBasedObjectIdGenerator propertyBasedObjectIdGenerator = ((PropertyBasedObjectIdGenerator) createInstance("com.fasterxml.jackson.databind.ser.impl.PropertyBasedObjectIdGenerator"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.findObjectId] produces [java.lang.NullPointerException] */
        impl.findObjectId(integer, propertyBasedObjectIdGenerator, null);
    }
    
    /**
    @utbot.classUnderTest {@link DefaultDeserializationContext}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.DefaultDeserializationContext#findObjectId(java.lang.Object,com.fasterxml.jackson.annotation.ObjectIdGenerator,com.fasterxml.jackson.annotation.ObjectIdResolver)}
 * @utbot.executesCondition {@code (_objectIds == null): True}
 * @utbot.executesCondition {@code (_objectIdResolvers == null): True}
 * @utbot.executesCondition {@code (resolver == null): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: resolver = resolverType.newForDeserialization(this);
 *  */
    @Test
    public void testFindObjectId_ThrowNullPointerException_3() {
        DefaultDeserializationContext.Impl impl = new DefaultDeserializationContext.Impl(null, null);
        com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator propertyBasedObjectIdGenerator = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(null);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.findObjectId] produces [java.lang.NullPointerException] */
        impl.findObjectId(null, propertyBasedObjectIdGenerator, null);
    }
    
    /**
    @utbot.classUnderTest {@link DefaultDeserializationContext}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.DefaultDeserializationContext#findObjectId(java.lang.Object,com.fasterxml.jackson.annotation.ObjectIdGenerator,com.fasterxml.jackson.annotation.ObjectIdResolver)}
 * @utbot.executesCondition {@code (_objectIds == null): True}
 * @utbot.executesCondition {@code (_objectIdResolvers == null): True}
 * @utbot.executesCondition {@code (resolver == null): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: resolver = resolverType.newForDeserialization(this);
 *  */
    @Test
    public void testFindObjectId_ThrowNullPointerException_4() {
        DefaultDeserializationContext.Impl impl = new DefaultDeserializationContext.Impl(null, null);
        Integer integer = -256;
        com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator propertyBasedObjectIdGenerator = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(null);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.findObjectId] produces [java.lang.NullPointerException] */
        impl.findObjectId(integer, propertyBasedObjectIdGenerator, null);
    }
    
    /**
    @utbot.classUnderTest {@link DefaultDeserializationContext}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.DefaultDeserializationContext#findObjectId(java.lang.Object,com.fasterxml.jackson.annotation.ObjectIdGenerator,com.fasterxml.jackson.annotation.ObjectIdResolver)}
 * @utbot.executesCondition {@code (_objectIds == null): False}
 * @utbot.executesCondition {@code (entry != null): True}
 * @utbot.returnsFrom {@code return entry;}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return entry;
 *  */
    @Test
    public void testFindObjectId_ThrowNullPointerException_7() throws Exception  {
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        LinkedHashMap _objectIds = new LinkedHashMap();
        ObjectIdGenerator.IdKey idKey = ((ObjectIdGenerator.IdKey) createInstance("com.fasterxml.jackson.annotation.ObjectIdGenerator$IdKey"));
        Class type = Object.class;
        setField(idKey, "com.fasterxml.jackson.annotation.ObjectIdGenerator$IdKey", "type", type);
        Integer key = 0;
        setField(idKey, "com.fasterxml.jackson.annotation.ObjectIdGenerator$IdKey", "key", key);
        ReadableObjectId readableObjectId = ((ReadableObjectId) createInstance("com.fasterxml.jackson.databind.deser.impl.ReadableObjectId"));
        _objectIds.put(idKey, readableObjectId);
        impl._objectIds = _objectIds;
        Integer integer = 0;
        PropertyBasedObjectIdGenerator propertyBasedObjectIdGenerator = ((PropertyBasedObjectIdGenerator) createInstance("com.fasterxml.jackson.databind.ser.impl.PropertyBasedObjectIdGenerator"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.findObjectId] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.findObjectId(DefaultDeserializationContext.java:114) */
        impl.findObjectId(integer, propertyBasedObjectIdGenerator, null);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method findObjectId(java.lang.Object, com.fasterxml.jackson.annotation.ObjectIdGenerator, com.fasterxml.jackson.annotation.ObjectIdResolver)
    
    @Test
    public void testFindObjectId10() throws Exception  {
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        LinkedHashMap _objectIds = new LinkedHashMap();
        ObjectIdGenerator.IdKey idKey = ((ObjectIdGenerator.IdKey) createInstance("com.fasterxml.jackson.annotation.ObjectIdGenerator$IdKey"));
        Integer key = 0;
        setField(idKey, "com.fasterxml.jackson.annotation.ObjectIdGenerator$IdKey", "key", key);
        ReadableObjectId readableObjectId = ((ReadableObjectId) createInstance("com.fasterxml.jackson.databind.deser.impl.ReadableObjectId"));
        _objectIds.put(idKey, readableObjectId);
        impl._objectIds = _objectIds;
        Integer integer = 0;
        PropertyBasedObjectIdGenerator propertyBasedObjectIdGenerator = ((PropertyBasedObjectIdGenerator) createInstance("com.fasterxml.jackson.databind.ser.impl.PropertyBasedObjectIdGenerator"));
        SimpleObjectIdResolver simpleObjectIdResolver = new SimpleObjectIdResolver();
        
        ReadableObjectId actual = impl.findObjectId(integer, propertyBasedObjectIdGenerator, simpleObjectIdResolver);
        
        ReadableObjectId expected = ((ReadableObjectId) createInstance("com.fasterxml.jackson.databind.deser.impl.ReadableObjectId"));
        setField(expected, "com.fasterxml.jackson.databind.deser.impl.ReadableObjectId", "id", integer);
        ObjectIdGenerator.IdKey _key = ((ObjectIdGenerator.IdKey) createInstance("com.fasterxml.jackson.annotation.ObjectIdGenerator$IdKey"));
        Class type = PropertyBasedObjectIdGenerator.class;
        setField(_key, "com.fasterxml.jackson.annotation.ObjectIdGenerator$IdKey", "type", type);
        setField(_key, "com.fasterxml.jackson.annotation.ObjectIdGenerator$IdKey", "key", integer);
        setField(_key, "com.fasterxml.jackson.annotation.ObjectIdGenerator$IdKey", "hashCode", 1015462492);
        setField(expected, "com.fasterxml.jackson.databind.deser.impl.ReadableObjectId", "_key", _key);
        SimpleObjectIdResolver _resolver = ((SimpleObjectIdResolver) createInstance("com.fasterxml.jackson.annotation.SimpleObjectIdResolver"));
        setField(expected, "com.fasterxml.jackson.databind.deser.impl.ReadableObjectId", "_resolver", _resolver);
        
        Object actualItem = actual.item;
        assertNull(actualItem);
        
        Object expectedId = expected.id;
        Object actualId = actual.id;
        assertEquals(expectedId, actualId);
        
        ObjectIdGenerator.IdKey expected_key = ((ObjectIdGenerator.IdKey) getFieldValue(expected, "com.fasterxml.jackson.databind.deser.impl.ReadableObjectId", "_key"));
        ObjectIdGenerator.IdKey actual_key = ((ObjectIdGenerator.IdKey) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.impl.ReadableObjectId", "_key"));
        // com.fasterxml.jackson.annotation.ObjectIdGenerator.IdKey has overridden equals method
        assertEquals(expected_key, actual_key);
        
        LinkedList actual_referringProperties = ((LinkedList) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.impl.ReadableObjectId", "_referringProperties"));
        assertNull(actual_referringProperties);
        
        ObjectIdResolver expected_resolver = ((ObjectIdResolver) getFieldValue(expected, "com.fasterxml.jackson.databind.deser.impl.ReadableObjectId", "_resolver"));
        ObjectIdResolver actual_resolver = ((ObjectIdResolver) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.impl.ReadableObjectId", "_resolver"));
        Map actual_resolver_items = ((Map) getFieldValue(actual_resolver, "com.fasterxml.jackson.annotation.SimpleObjectIdResolver", "_items"));
        assertNull(actual_resolver_items);
        
    }
    
    @Test
    public void testFindObjectId11() throws Exception  {
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        LinkedHashMap _objectIds = new LinkedHashMap();
        ObjectIdGenerator.IdKey idKey = ((ObjectIdGenerator.IdKey) createInstance("com.fasterxml.jackson.annotation.ObjectIdGenerator$IdKey"));
        Class type = Object.class;
        setField(idKey, "com.fasterxml.jackson.annotation.ObjectIdGenerator$IdKey", "type", type);
        Integer key = 0;
        setField(idKey, "com.fasterxml.jackson.annotation.ObjectIdGenerator$IdKey", "key", key);
        _objectIds.put(idKey, null);
        impl._objectIds = _objectIds;
        ArrayList _objectIdResolvers = new ArrayList();
        setField(impl, "com.fasterxml.jackson.databind.deser.DefaultDeserializationContext", "_objectIdResolvers", _objectIdResolvers);
        Integer integer = 0;
        PropertyBasedObjectIdGenerator propertyBasedObjectIdGenerator = ((PropertyBasedObjectIdGenerator) createInstance("com.fasterxml.jackson.databind.ser.impl.PropertyBasedObjectIdGenerator"));
        SimpleObjectIdResolver simpleObjectIdResolver = new SimpleObjectIdResolver();
        
        ReadableObjectId actual = impl.findObjectId(integer, propertyBasedObjectIdGenerator, simpleObjectIdResolver);
        
        ReadableObjectId expected = ((ReadableObjectId) createInstance("com.fasterxml.jackson.databind.deser.impl.ReadableObjectId"));
        setField(expected, "com.fasterxml.jackson.databind.deser.impl.ReadableObjectId", "id", integer);
        ObjectIdGenerator.IdKey _key = ((ObjectIdGenerator.IdKey) createInstance("com.fasterxml.jackson.annotation.ObjectIdGenerator$IdKey"));
        Class type1 = PropertyBasedObjectIdGenerator.class;
        setField(_key, "com.fasterxml.jackson.annotation.ObjectIdGenerator$IdKey", "type", type1);
        setField(_key, "com.fasterxml.jackson.annotation.ObjectIdGenerator$IdKey", "key", integer);
        setField(_key, "com.fasterxml.jackson.annotation.ObjectIdGenerator$IdKey", "hashCode", 1015462492);
        setField(expected, "com.fasterxml.jackson.databind.deser.impl.ReadableObjectId", "_key", _key);
        SimpleObjectIdResolver _resolver = ((SimpleObjectIdResolver) createInstance("com.fasterxml.jackson.annotation.SimpleObjectIdResolver"));
        setField(expected, "com.fasterxml.jackson.databind.deser.impl.ReadableObjectId", "_resolver", _resolver);
        
        Object actualItem = actual.item;
        assertNull(actualItem);
        
        Object expectedId = expected.id;
        Object actualId = actual.id;
        assertEquals(expectedId, actualId);
        
        ObjectIdGenerator.IdKey expected_key = ((ObjectIdGenerator.IdKey) getFieldValue(expected, "com.fasterxml.jackson.databind.deser.impl.ReadableObjectId", "_key"));
        ObjectIdGenerator.IdKey actual_key = ((ObjectIdGenerator.IdKey) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.impl.ReadableObjectId", "_key"));
        // com.fasterxml.jackson.annotation.ObjectIdGenerator.IdKey has overridden equals method
        assertEquals(expected_key, actual_key);
        
        LinkedList actual_referringProperties = ((LinkedList) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.impl.ReadableObjectId", "_referringProperties"));
        assertNull(actual_referringProperties);
        
        ObjectIdResolver expected_resolver = ((ObjectIdResolver) getFieldValue(expected, "com.fasterxml.jackson.databind.deser.impl.ReadableObjectId", "_resolver"));
        ObjectIdResolver actual_resolver = ((ObjectIdResolver) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.impl.ReadableObjectId", "_resolver"));
        Map actual_resolver_items = ((Map) getFieldValue(actual_resolver, "com.fasterxml.jackson.annotation.SimpleObjectIdResolver", "_items"));
        assertNull(actual_resolver_items);
        
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method findObjectId(java.lang.Object, com.fasterxml.jackson.annotation.ObjectIdGenerator, com.fasterxml.jackson.annotation.ObjectIdResolver)
    
    @Test
    public void testFindObjectId12() throws Exception  {
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        ArrayList _objectIdResolvers = new ArrayList();
        _objectIdResolvers.add(null);
        _objectIdResolvers.add(null);
        _objectIdResolvers.add(null);
        setField(impl, "com.fasterxml.jackson.databind.deser.DefaultDeserializationContext", "_objectIdResolvers", _objectIdResolvers);
        Integer integer = 2147483392;
        PropertyBasedObjectIdGenerator propertyBasedObjectIdGenerator = ((PropertyBasedObjectIdGenerator) createInstance("com.fasterxml.jackson.databind.ser.impl.PropertyBasedObjectIdGenerator"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.findObjectId] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.findObjectId(DefaultDeserializationContext.java:106) */
        impl.findObjectId(integer, propertyBasedObjectIdGenerator, null);
    }
    
    @Test
    public void testFindObjectId13() throws Exception  {
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        LinkedHashMap _objectIds = new LinkedHashMap();
        _objectIds.put(null, null);
        impl._objectIds = _objectIds;
        ArrayList _objectIdResolvers = new ArrayList();
        _objectIdResolvers.add(null);
        _objectIdResolvers.add(null);
        _objectIdResolvers.add(null);
        setField(impl, "com.fasterxml.jackson.databind.deser.DefaultDeserializationContext", "_objectIdResolvers", _objectIdResolvers);
        PropertyBasedObjectIdGenerator propertyBasedObjectIdGenerator = ((PropertyBasedObjectIdGenerator) createInstance("com.fasterxml.jackson.databind.ser.impl.PropertyBasedObjectIdGenerator"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.findObjectId] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.findObjectId(DefaultDeserializationContext.java:106) */
        impl.findObjectId(null, propertyBasedObjectIdGenerator, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.deserializerInstance
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #0 for method deserializerInstance(com.fasterxml.jackson.databind.introspect.Annotated, java.lang.Object)
    /// 
    /// Common steps:
    /// <pre>
    /// Tests execute conditions:
    ///     {@code (deserDef instanceof JsonDeserializer): False},
    ///     {@code (!(deserDef instanceof Class)): False}
    /// return from: {@code return null;}
    /// </pre>
    
    /**
    @utbot.classUnderTest {@link DefaultDeserializationContext}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.DefaultDeserializationContext#deserializerInstance(com.fasterxml.jackson.databind.introspect.Annotated,java.lang.Object)}
 * @utbot.executesCondition {@code (deserClass): False}
 *  */
    @Test
    public void testDeserializerInstance_NotDeserClass() throws JsonMappingException  {
        DefaultDeserializationContext.Impl impl = new DefaultDeserializationContext.Impl(null, null);
        Class class1 = Object.class;
        
        JsonDeserializer actual = impl.deserializerInstance(null, class1);
        
        assertNull(actual);
        
        Class finalClass1 = class1;
        
    }
    
    /**
    @utbot.classUnderTest {@link DefaultDeserializationContext}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.DefaultDeserializationContext#deserializerInstance(com.fasterxml.jackson.databind.introspect.Annotated,java.lang.Object)}
 * @utbot.executesCondition {@code (deserClass): True}
 * @utbot.executesCondition {@code (ClassUtil.isBogusClass(deserClass)): True}
 *  */
    @Test
    public void testDeserializerInstance_ClassUtilIsBogusClass() throws JsonMappingException  {
        DefaultDeserializationContext.Impl impl = new DefaultDeserializationContext.Impl(null, null);
        Class class1 = Object.class;
        
        JsonDeserializer actual = impl.deserializerInstance(null, class1);
        
        assertNull(actual);
        
        Class finalClass1 = class1;
        
    }
    
    /**
    @utbot.classUnderTest {@link DefaultDeserializationContext}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.DefaultDeserializationContext#deserializerInstance(com.fasterxml.jackson.databind.introspect.Annotated,java.lang.Object)}
 * @utbot.executesCondition {@code (deserClass): True}
 * @utbot.executesCondition {@code (ClassUtil.isBogusClass(deserClass)): True}
 *  */
    @Test
    public void testDeserializerInstance_ClassUtilIsBogusClass_1() throws JsonMappingException  {
        DefaultDeserializationContext.Impl impl = new DefaultDeserializationContext.Impl(null, null);
        Class class1 = Object.class;
        
        JsonDeserializer actual = impl.deserializerInstance(null, class1);
        
        assertNull(actual);
        
        Class finalClass1 = class1;
        
    }
    
    /**
    @utbot.classUnderTest {@link DefaultDeserializationContext}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.DefaultDeserializationContext#deserializerInstance(com.fasterxml.jackson.databind.introspect.Annotated,java.lang.Object)}
 * @utbot.executesCondition {@code (deserClass): True}
 * @utbot.executesCondition {@code (ClassUtil.isBogusClass(deserClass)): True}
 *  */
    @Test
    public void testDeserializerInstance_ClassUtilIsBogusClass_2() throws JsonMappingException  {
        DefaultDeserializationContext.Impl impl = new DefaultDeserializationContext.Impl(null, null);
        Class class1 = Object.class;
        
        JsonDeserializer actual = impl.deserializerInstance(null, class1);
        
        assertNull(actual);
        
        Class finalClass1 = class1;
        
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #1 for method deserializerInstance(com.fasterxml.jackson.databind.introspect.Annotated, java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link DefaultDeserializationContext}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.DefaultDeserializationContext#deserializerInstance(com.fasterxml.jackson.databind.introspect.Annotated,java.lang.Object)}
 * @utbot.executesCondition {@code (deserDef == null): True}
 *  */
    @Test
    public void testDeserializerInstance_DeserDefEqualsNull() throws JsonMappingException  {
        DefaultDeserializationContext.Impl impl = new DefaultDeserializationContext.Impl(null, null);
        
        JsonDeserializer actual = impl.deserializerInstance(null, null);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #2 for method deserializerInstance(com.fasterxml.jackson.databind.introspect.Annotated, java.lang.Object)
    /// 
    /// Common steps:
    /// <pre>
    /// Tests execute conditions:
    ///     {@code (deserDef instanceof JsonDeserializer): True}
    /// return from: {@code return (JsonDeserializer<Object>) deser;}
    /// </pre>
    
    /**
    @utbot.classUnderTest {@link DefaultDeserializationContext}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.DefaultDeserializationContext#deserializerInstance(com.fasterxml.jackson.databind.introspect.Annotated,java.lang.Object)}
 * @utbot.executesCondition {@code (deser instanceof ResolvableDeserializer): True}
 * @utbot.returnsFrom {@code return (JsonDeserializer<Object>) deser;}
 *  */
    @Test
    public void testDeserializerInstance_DeserInstanceOfResolvableDeserializer() throws Exception  {
        DefaultDeserializationContext.Impl impl = new DefaultDeserializationContext.Impl(null, null);
        StdDelegatingDeserializer stdDelegatingDeserializer = ((StdDelegatingDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer"));
        NullifyingDeserializer _delegateDeserializer = ((NullifyingDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer"));
        setField(stdDelegatingDeserializer, "com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer", "_delegateDeserializer", _delegateDeserializer);
        
        StdDelegatingDeserializer actual = ((StdDelegatingDeserializer) impl.deserializerInstance(null, stdDelegatingDeserializer));
        
        JsonDeserializer stdDelegatingDeserializer_delegateDeserializer = ((JsonDeserializer) getFieldValue(stdDelegatingDeserializer, "com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer", "_delegateDeserializer"));
        JsonDeserializer actual_delegateDeserializer = ((JsonDeserializer) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer", "_delegateDeserializer"));
        
    }
    
    /**
    @utbot.classUnderTest {@link DefaultDeserializationContext}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.DefaultDeserializationContext#deserializerInstance(com.fasterxml.jackson.databind.introspect.Annotated,java.lang.Object)}
 * @utbot.executesCondition {@code (deser instanceof ResolvableDeserializer): True}
 * @utbot.returnsFrom {@code return (JsonDeserializer<Object>) deser;}
 *  */
    @Test
    public void testDeserializerInstance_DeserInstanceOfResolvableDeserializer_1() throws Exception  {
        DefaultDeserializationContext.Impl impl = new DefaultDeserializationContext.Impl(null, null);
        StdDelegatingDeserializer stdDelegatingDeserializer = ((StdDelegatingDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer"));
        
        StdDelegatingDeserializer actual = ((StdDelegatingDeserializer) impl.deserializerInstance(null, stdDelegatingDeserializer));
        
        JsonDeserializer actual_delegateDeserializer = ((JsonDeserializer) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer", "_delegateDeserializer"));
        assertNull(actual_delegateDeserializer);
        
    }
    
    /**
    @utbot.classUnderTest {@link DefaultDeserializationContext}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.DefaultDeserializationContext#deserializerInstance(com.fasterxml.jackson.databind.introspect.Annotated,java.lang.Object)}
 * @utbot.executesCondition {@code (deser instanceof ResolvableDeserializer): True}
 * @utbot.returnsFrom {@code return (JsonDeserializer<Object>) deser;}
 *  */
    @Test
    public void testDeserializerInstance_DeserInstanceOfResolvableDeserializer_2() throws Exception  {
        DefaultDeserializationContext.Impl impl = new DefaultDeserializationContext.Impl(null, null);
        StdDelegatingDeserializer stdDelegatingDeserializer = ((StdDelegatingDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer"));
        StdDelegatingDeserializer _delegateDeserializer = ((StdDelegatingDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer"));
        setField(stdDelegatingDeserializer, "com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer", "_delegateDeserializer", _delegateDeserializer);
        
        StdDelegatingDeserializer actual = ((StdDelegatingDeserializer) impl.deserializerInstance(null, stdDelegatingDeserializer));
        
        JsonDeserializer stdDelegatingDeserializer_delegateDeserializer = ((JsonDeserializer) getFieldValue(stdDelegatingDeserializer, "com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer", "_delegateDeserializer"));
        JsonDeserializer actual_delegateDeserializer = ((JsonDeserializer) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer", "_delegateDeserializer"));
        JsonDeserializer actual_delegateDeserializer_delegateDeserializer = ((JsonDeserializer) getFieldValue(actual_delegateDeserializer, "com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer", "_delegateDeserializer"));
        assertNull(actual_delegateDeserializer_delegateDeserializer);
        
    }
    
    /**
    @utbot.classUnderTest {@link DefaultDeserializationContext}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.DefaultDeserializationContext#deserializerInstance(com.fasterxml.jackson.databind.introspect.Annotated,java.lang.Object)}
 * @utbot.executesCondition {@code (deser instanceof ResolvableDeserializer): False}
 * @utbot.returnsFrom {@code return (JsonDeserializer<Object>) deser;}
 *  */
    @Test
    public void testDeserializerInstance_NotDeserNotInstanceOfResolvableDeserializer() throws JsonMappingException  {
        DefaultDeserializationContext.Impl impl = new DefaultDeserializationContext.Impl(null, null);
        NumberDeserializers.IntegerDeserializer integerDeserializer = new NumberDeserializers.IntegerDeserializer(null, null);
        
        NumberDeserializers.IntegerDeserializer actual = ((NumberDeserializers.IntegerDeserializer) impl.deserializerInstance(null, integerDeserializer));
        
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method deserializerInstance(com.fasterxml.jackson.databind.introspect.Annotated, java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link DefaultDeserializationContext}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.DefaultDeserializationContext#deserializerInstance(com.fasterxml.jackson.databind.introspect.Annotated,java.lang.Object)}
 * @utbot.executesCondition {@code (!(deserDef instanceof Class)): False}
 * @utbot.executesCondition {@code (deserClass): True}
 * @utbot.executesCondition {@code (ClassUtil.isBogusClass(deserClass)): False}
 * @utbot.executesCondition {@code (!JsonDeserializer.class.isAssignableFrom(deserClass)): False}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.DeserializationConfig#getHandlerInstantiator()}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: HandlerInstantiator hi = _config.getHandlerInstantiator();
 *  */
    @Test(expected = IllegalStateException.class)
    public void testDeserializerInstance_ThrowIllegalStateException_2() throws Exception  {
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        Class class1 = Object.class;
        
        impl.deserializerInstance(null, class1);
    }
    
    /**
    @utbot.classUnderTest {@link DefaultDeserializationContext}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.DefaultDeserializationContext#deserializerInstance(com.fasterxml.jackson.databind.introspect.Annotated,java.lang.Object)}
 * @utbot.executesCondition {@code (!(deserDef instanceof Class)): True}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.Class#getName()}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#toString()}
 * @utbot.throwsException {@link java.lang.IllegalStateException} when: !(deserDef instanceof Class)
 *  */
    @Test(expected = IllegalStateException.class)
    public void testDeserializerInstance_ThrowIllegalStateException() throws JsonMappingException  {
        DefaultDeserializationContext.Impl impl = new DefaultDeserializationContext.Impl(null, null);
        byte[] byteArray = {};
        
        impl.deserializerInstance(null, byteArray);
    }
    
    /**
    @utbot.classUnderTest {@link DefaultDeserializationContext}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.DefaultDeserializationContext#deserializerInstance(com.fasterxml.jackson.databind.introspect.Annotated,java.lang.Object)}
 * @utbot.executesCondition {@code (!(deserDef instanceof Class)): False}
 * @utbot.executesCondition {@code (deserClass): True}
 * @utbot.executesCondition {@code (ClassUtil.isBogusClass(deserClass)): False}
 * @utbot.executesCondition {@code (!JsonDeserializer.class.isAssignableFrom(deserClass)): True}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.Class#getName()}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#toString()}
 * @utbot.throwsException {@link java.lang.IllegalStateException} when: !JsonDeserializer.class.isAssignableFrom(deserClass)
 *  */
    @Test(expected = IllegalStateException.class)
    public void testDeserializerInstance_ThrowIllegalStateException_1() throws JsonMappingException  {
        DefaultDeserializationContext.Impl impl = new DefaultDeserializationContext.Impl(null, null);
        Class class1 = Object.class;
        
        impl.deserializerInstance(null, class1);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.keyDeserializerInstance
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #0 for method keyDeserializerInstance(com.fasterxml.jackson.databind.introspect.Annotated, java.lang.Object)
    /// 
    /// Common steps:
    /// <pre>
    /// Tests execute conditions:
    ///     {@code (deserDef == null): False},
    ///     {@code (deserDef instanceof KeyDeserializer): False},
    ///     {@code (!(deserDef instanceof Class)): False}
    /// return from: {@code return null;}
    /// </pre>
    
    /**
    @utbot.classUnderTest {@link DefaultDeserializationContext}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.DefaultDeserializationContext#keyDeserializerInstance(com.fasterxml.jackson.databind.introspect.Annotated,java.lang.Object)}
 * @utbot.executesCondition {@code (deserClass): False}
 *  */
    @Test
    public void testKeyDeserializerInstance_NotDeserClass() throws JsonMappingException  {
        DefaultDeserializationContext.Impl impl = new DefaultDeserializationContext.Impl(null, null);
        Class class1 = Object.class;
        
        KeyDeserializer actual = impl.keyDeserializerInstance(null, class1);
        
        assertNull(actual);
        
        Class finalClass1 = class1;
        
    }
    
    /**
    @utbot.classUnderTest {@link DefaultDeserializationContext}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.DefaultDeserializationContext#keyDeserializerInstance(com.fasterxml.jackson.databind.introspect.Annotated,java.lang.Object)}
 * @utbot.executesCondition {@code (deserClass): True}
 * @utbot.executesCondition {@code (ClassUtil.isBogusClass(deserClass)): True}
 *  */
    @Test
    public void testKeyDeserializerInstance_ClassUtilIsBogusClass() throws JsonMappingException  {
        DefaultDeserializationContext.Impl impl = new DefaultDeserializationContext.Impl(null, null);
        Class class1 = Object.class;
        
        KeyDeserializer actual = impl.keyDeserializerInstance(null, class1);
        
        assertNull(actual);
        
        Class finalClass1 = class1;
        
    }
    
    /**
    @utbot.classUnderTest {@link DefaultDeserializationContext}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.DefaultDeserializationContext#keyDeserializerInstance(com.fasterxml.jackson.databind.introspect.Annotated,java.lang.Object)}
 * @utbot.executesCondition {@code (deserClass): True}
 * @utbot.executesCondition {@code (ClassUtil.isBogusClass(deserClass)): True}
 *  */
    @Test
    public void testKeyDeserializerInstance_ClassUtilIsBogusClass_1() throws JsonMappingException  {
        DefaultDeserializationContext.Impl impl = new DefaultDeserializationContext.Impl(null, null);
        Class class1 = Object.class;
        
        KeyDeserializer actual = impl.keyDeserializerInstance(null, class1);
        
        assertNull(actual);
        
        Class finalClass1 = class1;
        
    }
    
    /**
    @utbot.classUnderTest {@link DefaultDeserializationContext}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.DefaultDeserializationContext#keyDeserializerInstance(com.fasterxml.jackson.databind.introspect.Annotated,java.lang.Object)}
 * @utbot.executesCondition {@code (deserClass): True}
 * @utbot.executesCondition {@code (ClassUtil.isBogusClass(deserClass)): True}
 *  */
    @Test
    public void testKeyDeserializerInstance_ClassUtilIsBogusClass_2() throws JsonMappingException  {
        DefaultDeserializationContext.Impl impl = new DefaultDeserializationContext.Impl(null, null);
        Class class1 = Object.class;
        
        KeyDeserializer actual = impl.keyDeserializerInstance(null, class1);
        
        assertNull(actual);
        
        Class finalClass1 = class1;
        
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #1 for method keyDeserializerInstance(com.fasterxml.jackson.databind.introspect.Annotated, java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link DefaultDeserializationContext}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.DefaultDeserializationContext#keyDeserializerInstance(com.fasterxml.jackson.databind.introspect.Annotated,java.lang.Object)}
 * @utbot.executesCondition {@code (deserDef == null): False}
 * @utbot.executesCondition {@code (deserDef instanceof KeyDeserializer): True}
 * @utbot.executesCondition {@code (deser instanceof ResolvableDeserializer): False}
 * @utbot.returnsFrom {@code return deser;}
 *  */
    @Test
    public void testKeyDeserializerInstance_NotDeserNotInstanceOfResolvableDeserializer() throws Exception  {
        DefaultDeserializationContext.Impl impl = new DefaultDeserializationContext.Impl(null, null);
        Object stringKD = createInstance("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer$StringKD");
        
        Object actual = impl.keyDeserializerInstance(null, stringKD);
        
    }
    
    /**
    @utbot.classUnderTest {@link DefaultDeserializationContext}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.DefaultDeserializationContext#keyDeserializerInstance(com.fasterxml.jackson.databind.introspect.Annotated,java.lang.Object)}
 * @utbot.executesCondition {@code (deserDef == null): True}
 *  */
    @Test
    public void testKeyDeserializerInstance_DeserDefEqualsNull() throws JsonMappingException  {
        DefaultDeserializationContext.Impl impl = new DefaultDeserializationContext.Impl(null, null);
        
        KeyDeserializer actual = impl.keyDeserializerInstance(null, null);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method keyDeserializerInstance(com.fasterxml.jackson.databind.introspect.Annotated, java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link DefaultDeserializationContext}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.DefaultDeserializationContext#keyDeserializerInstance(com.fasterxml.jackson.databind.introspect.Annotated,java.lang.Object)}
 * @utbot.executesCondition {@code (!(deserDef instanceof Class)): False}
 * @utbot.executesCondition {@code (deserClass): True}
 * @utbot.executesCondition {@code (ClassUtil.isBogusClass(deserClass)): False}
 * @utbot.executesCondition {@code (!KeyDeserializer.class.isAssignableFrom(deserClass)): False}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.DeserializationConfig#getHandlerInstantiator()}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: HandlerInstantiator hi = _config.getHandlerInstantiator();
 *  */
    @Test(expected = IllegalStateException.class)
    public void testKeyDeserializerInstance_ThrowIllegalStateException_2() throws Exception  {
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        Class class1 = Object.class;
        
        impl.keyDeserializerInstance(null, class1);
    }
    
    /**
    @utbot.classUnderTest {@link DefaultDeserializationContext}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.DefaultDeserializationContext#keyDeserializerInstance(com.fasterxml.jackson.databind.introspect.Annotated,java.lang.Object)}
 * @utbot.executesCondition {@code (!(deserDef instanceof Class)): True}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.Class#getName()}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#toString()}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: deserDef.getClass().getName()
 *  */
    @Test(expected = IllegalStateException.class)
    public void testKeyDeserializerInstance_ThrowIllegalStateException() throws JsonMappingException  {
        DefaultDeserializationContext.Impl impl = new DefaultDeserializationContext.Impl(null, null);
        byte[] byteArray = {};
        
        impl.keyDeserializerInstance(null, byteArray);
    }
    
    /**
    @utbot.classUnderTest {@link DefaultDeserializationContext}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.DefaultDeserializationContext#keyDeserializerInstance(com.fasterxml.jackson.databind.introspect.Annotated,java.lang.Object)}
 * @utbot.executesCondition {@code (!(deserDef instanceof Class)): False}
 * @utbot.executesCondition {@code (deserClass): True}
 * @utbot.executesCondition {@code (ClassUtil.isBogusClass(deserClass)): False}
 * @utbot.executesCondition {@code (!KeyDeserializer.class.isAssignableFrom(deserClass)): True}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.Class#getName()}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#toString()}
 * @utbot.throwsException {@link java.lang.IllegalStateException} when: !KeyDeserializer.class.isAssignableFrom(deserClass)
 *  */
    @Test(expected = IllegalStateException.class)
    public void testKeyDeserializerInstance_ThrowIllegalStateException_1() throws JsonMappingException  {
        DefaultDeserializationContext.Impl impl = new DefaultDeserializationContext.Impl(null, null);
        Class class1 = Object.class;
        
        impl.keyDeserializerInstance(null, class1);
    }
    ///endregion
    
    ///endregion
    
    ///region Util methods
    
    private static Object createInstance(String className) throws Exception {
        Class<?> clazz = Class.forName(className);
        return Class.forName("sun.misc.Unsafe").getDeclaredMethod("allocateInstance", Class.class)
            .invoke(getUnsafeInstance(), clazz);
    }
    
        private static void setField(Object object, String fieldClassName, String fieldName, Object fieldValue) throws ClassNotFoundException, NoSuchFieldException, NoSuchMethodException, IllegalAccessException, java.lang.reflect.InvocationTargetException {
        Class<?> clazz = Class.forName(fieldClassName);
        java.lang.reflect.Field field = clazz.getDeclaredField(fieldName);
    
        java.lang.reflect.Field modifiersField;
        
                java.lang.reflect.Method methodForGetDeclaredFields1065331200648100 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields1065331200648100.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass1065331200656500 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1065331200648100.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1065331200656500).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
        modifiersField.setAccessible(true);
        modifiersField.setInt(field, field.getModifiers() & ~java.lang.reflect.Modifier.FINAL);
    
        field.setAccessible(true);
        field.set(object, fieldValue);
    }
    
    private static Object getFieldValue(Object obj, String fieldClassName, String fieldName) throws ClassNotFoundException, NoSuchMethodException, java.lang.reflect.InvocationTargetException, IllegalAccessException, NoSuchFieldException {
        Class<?> clazz = Class.forName(fieldClassName);
        java.lang.reflect.Field field = clazz.getDeclaredField(fieldName);
        
        field.setAccessible(true);
        
        java.lang.reflect.Field modifiersField;
        
            java.lang.reflect.Method methodForGetDeclaredFields1065331201003599 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields1065331201003599.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass1065331201007600 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1065331201003599.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1065331201007600).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
        modifiersField.setAccessible(true);
        modifiersField.setInt(field, field.getModifiers() & ~java.lang.reflect.Modifier.FINAL);
        
        return field.get(obj);
    }
    
    private static Object getUnsafeInstance() throws ClassNotFoundException, NoSuchFieldException, IllegalAccessException {
        java.lang.reflect.Field f = Class.forName("sun.misc.Unsafe").getDeclaredField("theUnsafe");
        f.setAccessible(true);
        return f.get(null);
    }
    ///endregion
}

