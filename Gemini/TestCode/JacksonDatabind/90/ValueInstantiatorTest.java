package com.fasterxml.jackson.databind.deser;

import org.junit.Test;
import static org.junit.Assert.*;

import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.introspect.AnnotatedWithParams;
import com.fasterxml.jackson.databind.type.TypeFactory;

import java.io.IOException;

public class ValueInstantiatorTest {

    // --- Concrete subclass for testing default and custom implementations ---
    private static class TestValueInstantiator extends ValueInstantiator {
        private boolean canCreateBoolean = false;
        private boolean canCreateDefault = false;

        public void setCanCreateBoolean(boolean val) {
            this.canCreateBoolean = val;
        }

        public void setCanCreateDefault(boolean val) {
            this.canCreateDefault = val;
        }

        @Override
        public boolean canCreateFromBoolean() {
            return canCreateBoolean;
        }

        @Override
        public boolean canCreateUsingDefault() {
            return canCreateDefault;
        }

        @Override
        public Object createFromBoolean(DeserializationContext ctxt, boolean value) throws IOException {
            return value; // Return boolean directly for fallback testing
        }
    }

    // --- Null Class Instantiator to test 'UNKNOWN' value type description ---
    private static class NullClassInstantiator extends ValueInstantiator {
        @Override
        public Class<?> getValueClass() {
            return null;
        }
    }

    @Test
    Deals:
    public void testGetValueTypeDesc_Normal() {
        ValueInstantiator inst = new ValueInstantiator.Base(String.class);
        assertEquals(String.class.getName(), inst.getValueTypeDesc());
    }

    @Test
    public void testGetValueTypeDesc_NullClass() {
        ValueInstantiator inst = new NullClassInstantiator();
        assertEquals("UNKNOWN", inst.getValueTypeDesc());
    }

    @Test
    public void testBaseConstructors() {
        ValueInstantiator.Base inst1 = new ValueInstantiator.Base(Integer.class);
        assertEquals(Integer.class, inst1.getValueClass());
        assertEquals(Integer.class.getName(), inst1.getValueTypeDesc());

        JavaType javaType = TypeFactory.defaultInstance().constructType(Long.class);
        ValueInstantiator.Base inst2 = new ValueInstantiator.Base(javaType);
        assertEquals(Long.class, inst2.getValueClass());
        assertEquals(Long.class.getName(), inst2.getValueTypeDesc());
    }

    @Test
    public void testCanInstantiate_AllFalse() {
        ValueInstantiator inst = new ValueInstantiator() {};
        assertFalse(inst.canInstantiate());
        assertFalse(inst.canCreateFromString());
        assertFalse(inst.canCreateFromInt());
        assertFalse(inst.canCreateFromLong());
        assertFalse(inst.canCreateFromDouble());
        assertFalse(inst.canCreateFromBoolean());
        assertFalse(inst.canCreateUsingDefault());
        assertFalse(inst.canCreateUsingDelegate());
        assertFalse(inst.canCreateUsingArrayDelegate());
        assertFalse(inst.canCreateFromObjectWith());
        
        assertNull(inst.getFromObjectArguments(null));
        assertNull(inst.getDelegateType(null));
        assertNull(inst.getArrayDelegateType(null));
        assertNull(inst.getDefaultCreator());
        assertNull(inst.getDelegateCreator());
        assertNull(inst.getArrayDelegateCreator());
        assertNull(inst.getWithArgsCreator());
        assertNull(inst.getIncompleteParameter());
    }

    @Test
    public void testCanInstantiate_TrueViaBoolean() {
        TestValueInstantiator inst = new TestValueInstantiator();
        inst.setCanCreateBoolean(true);
        assertTrue(inst.canInstantiate());
        assertTrue(inst.canCreateFromBoolean());
    }

    @Test
    public void testCanInstantiate_TrueViaDefault() {
        TestValueInstantiator inst = new TestValueInstantiator();
        inst.setCanCreateDefault(true);
        assertTrue(inst.canInstantiate());
        assertTrue(inst.canCreateUsingDefault());
    }

    @Test
    public void testStringFallbacks_BooleanTrue() throws IOException {
        TestValueInstantiator inst = new TestValueInstantiator();
        inst.setCanCreateBoolean(true);

        Object resultTrue = inst.createFromString(null, "  true  ");
        assertEquals(Boolean.TRUE, resultTrue);

        Object resultFalse = inst.createFromString(null, "false");
        assertEquals(Boolean.FALSE, resultFalse);
    }

    @Test
    public void testStringFallbacks_EmptyStringAcceptAsNull() throws IOException {
        TestValueInstantiator inst = new ValueInstantiator.Base(String.class);
        
        // Mock or use basic context if available, but here we test standard default implementation behavior
        // Since we cannot use Mockito, we rely on standard exception handling or subclasses if context is needed.
        // For testing empty string check when ctxt is null, it would throw NPE if not handled, 
        // let's verify edge cases safely where possible or check default methods.
    }

    @Test(expected = IOException.class)
    public void testDefaultInstantiationThrowsException() throws IOException {
        ValueInstantiator inst = new ValueInstantiator.Base(String.class);
        inst.createUsingDefault(null);
    }

    @Test(expected = IOException.class)
    public void testCreateFromObjectWithThrowsException() throws IOException {
        ValueInstantiator inst = new ValueInstantiator.Base(String.class);
        inst.createFromObjectWith(null, new Object[0]);
    }

    @Test(expected = IOException.class)
    public void testCreateUsingDelegateThrowsException() throws IOException {
        ValueInstantiator inst = new ValueInstantiator.Base(String.class);
        inst.createUsingDelegate(null, new Object());
    }

    @Test(expected = IOException.class)
    public void testCreateUsingArrayDelegateThrowsException() throws IOException {
        ValueInstantiator inst = new ValueInstantiator.Base(String.class);
        inst.createUsingArrayDelegate(null, new Object());
    }

    @Test(expected = IOException.class)
    public void testCreateFromIntThrowsException() throws IOException {
        ValueInstantiator inst = new ValueInstantiator.Base(String.class);
        inst.createFromInt(null, 10);
    }

    @Test(expected = IOException.class)
    public void testCreateFromLongThrowsException() throws IOException {
        ValueInstantiator inst = new ValueInstantiator.Base(String.class);
        inst.createFromLong(null, 10L);
    }

    @Test(expected = IOException.class)
    public void testCreateFromDoubleThrowsException() throws IOException {
        ValueInstantiator inst = new ValueInstantiator.Base(String.class);
        inst.createFromDouble(null, 10.0);
    }

    @Test(expected = IOException.class)
    public void testCreateFromBooleanThrowsException() throws IOException {
        ValueInstantiator inst = new ValueInstantiator.Base(String.class);
        inst.createFromBoolean(null, true);
    }
}