package com.fasterxml.jackson.databind.deser.std;

import org.junit.Test;
import static org.junit.Assert.*;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.InvocationTargetException;

import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.introspect.AnnotatedMethod;
import com.fasterxml.jackson.databind.introspect.AnnotatedParameter;
import com.fasterxml.jackson.databind.introspect.AnnotatedWithParams;
import com.fasterxml.jackson.databind.module.SimpleDeserializers;

public class StdValueInstantiatorTest {

    private final ObjectMapper mapper = new ObjectMapper();
    private final DeserializationConfig config = mapper.getDeserializationConfig();
    private final DeserializationContext ctxt = mapper.getDeserializationContext();

    // Dummy classes for testing creators
    public static class DummyBean {
        public String value;
        public DummyBean() {}
        public DummyBean(String value) { this.value = value; }
        public DummyBean(int val) { this.value = String.valueOf(val); }
        public DummyBean(long val) { this.value = String.valueOf(val); }
        public DummyBean(double val) { this.value = String.valueOf(val); }
        public DummyBean(boolean val) { this.value = String.valueOf(val); }
        
        public static DummyBean createFromString(String arg) { return new DummyBean(arg); }
        public static DummyBean createFromInt(int arg) { return new DummyBean(arg); }
        public static DummyBean createFromLong(long arg) { return new DummyBean(arg); }
        public static DummyBean createFromDouble(double arg) { return new DummyBean(arg); }
        public static DummyBean createFromBoolean(boolean arg) { return new DummyBean(arg); }
        
        public static DummyBean failingCreator() { throw new RuntimeException("fail"); }
        public static DummyBean failingInitError() { throw new ExceptionInInitializerError("init fail"); }
        public static DummyBean failingInvocation() { throw new InvocationTargetException(new RuntimeException("inv fail")); }
    }

    private AnnotatedWithParams getAnnotatedMethod(Class<?> clazz, String methodName, Class<?>... parameterTypes) throws Exception {
        Method m = clazz.getMethod(methodName, parameterTypes);
        return new AnnotatedMethod(null, m, null, null);
    }

    @Test
    public void testConstructorsAndMetadataEdgeCases() {
        // Null class and null java type
        StdValueInstantiator inst1 = new StdValueInstantiator(config, (Class<?>) null);
        assertEquals("Object", inst1.getValueTypeDesc());
        assertEquals(Object.class, inst1.getValueClass());

        JavaType nullJavaType = null;
        StdValueInstantiator inst2 = new StdValueInstantiator(config, nullJavaType);
        assertEquals("UNKNOWN TYPE", inst2.getValueTypeDesc());
        assertEquals(Object.class, inst2.getValueClass());

        // Valid JavaType
        JavaType stringType = mapper.constructType(String.class);
        StdValueInstantiator inst3 = new StdValueInstantiator(config, stringType);
        assertEquals(stringType.toString(), inst3.getValueTypeDesc());
        assertEquals(String.class, inst3.getValueClass());

        // Copy constructor
        StdValueInstantiator inst4 = new StdValueInstantiator(inst3);
        assertEquals(stringType.toString(), inst4.getValueTypeDesc());
        assertEquals(String.class, inst4.getValueClass());
        
        // Mutators and getters
        inst4.configureIncompleteParameter(null);
        assertNull(inst4.getIncompleteParameter());
    }

    @Test
    public void testCanInstantiateFlags() throws Exception {
        StdValueInstantiator inst = new StdValueInstantiator(config, DummyBean.class);
        assertFalse(inst.canInstantiate());
        assertFalse(inst.canCreateUsingDefault());
        assertFalse(inst.canCreateUsingDelegate());
        assertFalse(inst.canCreateUsingArrayDelegate());
        assertFalse(inst.canCreateFromObjectWith());
        assertFalse(inst.canCreateFromString());
        assertFalse(inst.canCreateFromInt());
        assertFalse(inst.canCreateFromLong());
        assertFalse(inst.canCreateFromDouble());
        assertFalse(inst.canCreateFromBoolean());

        inst.configureFromObjectSettings(
            getAnnotatedMethod(DummyBean.class),
            getAnnotatedMethod(DummyBean.class, String.class),
            mapper.constructType(String.class),
            null,
            getAnnotatedMethod(DummyBean.class, String.class),
            new SettableBeanProperty[0]
        );

        assertTrue(inst.canCreateUsingDefault());
        assertTrue(inst.canCreateUsingDelegate());
        assertTrue(inst.canCreateFromObjectWith());
        assertTrue(inst.canInstantiate());

        inst.configureFromArraySettings(getAnnotatedMethod(DummyBean.class, String.class), mapper.constructType(String.class), null);
        assertTrue(inst.canCreateUsingArrayDelegate());
        assertEquals(mapper.constructType(String.class), inst.getArrayDelegateType(config));
        assertEquals(mapper.constructType(String.class), inst.getDelegateType(config));
        assertNotNull(inst.getDelegateCreator());
        assertNotNull(inst.getArrayDelegateCreator());
        assertNotNull(inst.getDefaultCreator());
        assertNotNull(inst.getWithArgsCreator());
        assertNotNull(inst.getFromObjectArguments(config));

        inst.configureFromStringCreator(getAnnotatedMethod(DummyBean.class, "createFromString", String.class));
        inst.configureFromIntCreator(getAnnotatedMethod(DummyBean.class, "createFromInt", int.class));
        inst.configureFromLongCreator(getAnnotatedMethod(DummyBean.class, "createFromLong", long.class));
        inst.configureFromDoubleCreator(getAnnotatedMethod(DummyBean.class, "createFromDouble", double.class));
        inst.configureFromBooleanCreator(getAnnotatedMethod(DummyBean.class, "createFromBoolean", boolean.class));

        assertTrue(inst.canCreateFromString());
        assertTrue(inst.canCreateFromInt());
        assertTrue(inst.canCreateFromLong());
        assertTrue(inst.canCreateFromDouble());
        assertTrue(inst.canCreateFromBoolean());
    }

    @Test
    public void testCreateUsingDefault() throws Exception {
        StdValueInstantiator inst = new StdValueInstantiator(config, DummyBean.class);
        // _defaultCreator is null -> calls super
        try {
            inst.createUsingDefault(ctxt);
        } catch (Exception e) {
            // Expected from super or handling
        }

        inst.configureFromObjectSettings(getAnnotatedMethod(DummyBean.class), null, null, null, null, null);
        Object obj = inst.createUsingDefault(ctxt);
        assertNotNull(obj);

        // Exception handling
        inst.configureFromObjectSettings(getAnnotatedMethod(DummyBean.class, "failingCreator"), null, null, null, null, null);
        try {
            inst.createUsingDefault(ctxt);
            fail("Should have thrown exception");
        } catch (Exception e) {
            // Expected instantiation problem
        }
    }

    @Test
    public void testCreateFromObjectWith() throws Exception {
        StdValueInstantiator inst = new StdValueInstantiator(config, DummyBean.class);
        Object[] args = new Object[] { "test" };
        
        // _withArgsCreator is null -> calls super
        try {
            inst.createFromObjectWith(ctxt, args);
        } catch (Exception e) {}

        inst.configureFromObjectSettings(null, null, null, null, getAnnotatedMethod(DummyBean.class, String.class), new SettableBeanProperty[0]);
        Object obj = inst.createFromObjectWith(ctxt, args);
        assertNotNull(obj);

        // Exception handling
        inst.configureFromObjectSettings(null, null, null, null, getAnnotatedMethod(DummyBean.class, "failingCreator"), new SettableBeanProperty[0]);
        try {
            inst.createFromObjectWith(ctxt, args);
            fail("Should have thrown exception");
        } catch (Exception e) {}
    }

    @Test
    public void testCreateUsingDelegateAndArrayDelegate() throws Exception {
        StdValueInstantiator inst = new StdValueInstantiator(config, DummyBean.class);
        
        // Both creators null in delegate
        try {
            inst.createUsingDelegate(ctxt, "delegateVal");
            fail("Should throw IllegalStateException");
        } catch (IllegalStateException e) {
            assertTrue(e.getMessage().contains("No delegate constructor"));
        }

        // _delegateCreator is null, but _arrayDelegateCreator is not
        inst.configureFromArraySettings(getAnnotatedMethod(DummyBean.class, String.class), mapper.constructType(String.class), null);
        Object obj1 = inst.createUsingDelegate(ctxt, "delVal");
        assertNotNull(obj1);

        // _arrayDelegateCreator is null, but _delegateCreator is not (fallback test via createUsingArrayDelegate)
        StdValueInstantiator inst2 = new StdValueInstantiator(config, DummyBean.class);
        inst2.configureFromObjectSettings(null, getAnnotatedMethod(DummyBean.class, String.class), mapper.constructType(String.class), null, null, null);
        Object obj2 = inst2.createUsingArrayDelegate(ctxt, "arrDelVal");
        assertNotNull(obj2);
        
        // Array delegate direct call
        Object obj3 = inst.createUsingArrayDelegate(ctxt, "arrVal");
        assertNotNull(obj3);
    }

    @Test
    public void testScalarCreators() throws Exception {
        StdValueInstantiator inst = new StdValueInstantiator(config, DummyBean.class);

        // String creator null and non-null
        try {
            inst.createFromString(ctxt, "abc");
        } catch (Exception e) {}

        inst.configureFromStringCreator(getAnnotatedMethod(DummyBean.class, "createFromString", String.class));
        assertNotNull(inst.createFromString(ctxt, "abc"));

        // Int creator (native vs widening to long)
        inst.configureFromIntCreator(getAnnotatedMethod(DummyBean.class, "createFromInt", int.class));
        assertNotNull(inst.createFromInt(ctxt, 123));

        // Int fallback to Long creator
        StdValueInstantiator instIntLong = new StdValueInstantiator(config, DummyBean.class);
        instIntLong.configureFromLongCreator(getAnnotatedMethod(DummyBean.class, "createFromLong", long.class));
        assertNotNull(instIntLong.createFromInt(ctxt, 456));

        // Long creator
        inst.configureFromLongCreator(getAnnotatedMethod(DummyBean.class, "createFromLong", long.class));
        assertNotNull(inst.createFromLong(ctxt, 789L));

        // Double creator
        inst.configureFromDoubleCreator(getAnnotatedMethod(DummyBean.class, "createFromDouble", double.class));
        assertNotNull(inst.createFromDouble(ctxt, 1.1));

        // Boolean creator
        inst.configureFromBooleanCreator(getAnnotatedMethod(DummyBean.class, "createFromBoolean", boolean.class));
        assertNotNull(inst.createFromBoolean(ctxt, true));
    }

    @Test
    public void testRewrapCtorProblemVariations() throws Exception {
        StdValueInstantiator inst = new StdValueInstantiator(config, DummyBean.class);
        
        // ExceptionInInitializerError
        inst.configureFromStringCreator(getAnnotatedMethod(DummyBean.class, "failingInitError"));
        try {
            inst.createFromString(ctxt, "test");
            fail();
        } catch (JsonMappingException e) {}

        // InvocationTargetException
        inst.configureFromStringCreator(getAnnotatedMethod(DummyBean.class, "failingInvocation"));
        try {
            inst.createFromString(ctxt, "test");
            fail();
        } catch (JsonMappingException e) {}
    }
}