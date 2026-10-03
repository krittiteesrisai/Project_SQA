package com.fasterxml.jackson.databind.deser;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.introspect.AnnotatedField;
import com.fasterxml.jackson.databind.introspect.AnnotatedMethod;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import org.junit.Test;
import org.mockito.Mockito;

import java.io.IOException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class SettableAnyPropertyTest {

    @Test
    public void testReadResolve_Valid() throws Exception {
        AnnotatedField setter = mock(AnnotatedField.class);
        when(setter.getAnnotated()).thenReturn(mock(java.lang.reflect.Field.class));
        
        SettableAnyProperty prop = new SettableAnyProperty(null, setter, null, null, null, null);
        Object resolved = prop.readResolve();
        assertSame(prop, resolved);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testReadResolve_NullSetter() throws Exception {
        SettableAnyProperty prop = new SettableAnyProperty(null, null, null, null, null, null);
        prop.readResolve();
    }

    @Test(expected = IllegalArgumentException.class)
    public void testReadResolve_NullAnnotated() throws Exception {
        AnnotatedField setter = mock(AnnotatedField.class);
        when(setter.getAnnotated()).thenReturn(null);
        
        SettableAnyProperty prop = new SettableAnyProperty(null, setter, null, null, null, null);
        prop.readResolve();
    }

    @Test
    public void testHasValueDeserializer() {
        JsonDeserializer<Object> deser = mock(JsonDeserializer.class);
        SettableAnyProperty propWith = new SettableAnyProperty(null, null, null, null, deser, null);
        assertTrue(propWith.hasValueDeserializer());

        SettableAnyProperty propWithout = new SettableAnyProperty(null, null, null, null, null, null);
        assertFalse(propWithout.hasValueDeserializer());
    }

    @Test
    public void testGettersAndToString() {
        BeanProperty bp = mock(BeanProperty.class);
        JavaType jt = mock(JavaType.class);
        AnnotatedField setter = mock(AnnotatedField.class);
        Class<?> declaringClass = HashMap.class;
        when(setter.getDeclaringClass()).thenReturn((Class) declaringClass);

        SettableAnyProperty prop = new SettableAnyProperty(bp, setter, jt, null, null, null);
        assertEquals(bp, prop.getProperty());
        assertEquals(jt, prop.getType());
        assertTrue(prop.toString().contains("java.util.HashMap"));
    }

    @Test
    public void testDeserialize_NullToken() throws Exception {
        JsonParser p = mock(JsonParser.class);
        DeserializationContext ctxt = mock(DeserializationContext.class);
        JsonDeserializer<Object> deser = mock(JsonDeserializer.class);

        when(p.getCurrentToken()).thenReturn(JsonToken.VALUE_NULL);
        when(deser.getNullValue(ctxt)).thenReturn("NULL_OBJ");

        SettableAnyProperty prop = new SettableAnyProperty(null, null, null, null, deser, null);
        Object result = prop.deserialize(p, ctxt);
        assertEquals("NULL_OBJ", result);
    }

    @Test
    public void testDeserialize_WithTypeDeserializer() throws Exception {
        JsonParser p = mock(JsonParser.class);
        DeserializationContext ctxt = mock(DeserializationContext.class);
        JsonDeserializer<Object> deser = mock(JsonDeserializer.class);
        TypeDeserializer typeDeser = mock(TypeDeserializer.class);

        when(p.getCurrentToken()).thenReturn(JsonToken.VALUE_STRING);
        when(deser.deserializeWithType(p, ctxt, typeDeser)).thenReturn("TYPED_OBJ");

        SettableAnyProperty prop = new SettableAnyProperty(null, null, null, null, deser, typeDeser);
        Object result = prop.deserialize(p, ctxt);
        assertEquals("TYPED_OBJ", result);
    }

    @Test
    public void testDeserialize_Standard() throws Exception {
        JsonParser p = mock(JsonParser.class);
        DeserializationContext ctxt = mock(DeserializationContext.class);
        JsonDeserializer<Object> deser = mock(JsonDeserializer.class);

        when(p.getCurrentToken()).thenReturn(JsonToken.VALUE_STRING);
        when(deser.deserialize(p, ctxt)).thenReturn("STD_OBJ");

        SettableAnyProperty prop = new SettableAnyProperty(null, null, null, null, deser, null);
        Object result = prop.deserialize(p, ctxt);
        assertEquals("STD_OBJ", result);
    }

    @Test
    public void testSet_FieldNotNullMap() throws Exception {
        AnnotatedField setter = mock(AnnotatedField.class);
        Object instance = new Object();
        Map<Object, Object> map = new HashMap<>();

        when(setter.getValue(instance)).thenReturn(map);

        SettableAnyProperty prop = new SettableAnyProperty(null, setter, null, null, null, null);
        // Force _setterIsField to true via reflection or subclassing if needed, 
        // but wait, constructor sets _setterIsField = setter instanceof AnnotatedField.
        // So passing AnnotatedField sets it to true.
        prop.set(instance, "key1", "val1");

        assertEquals("val1", map.get("key1"));
    }

    @Test
    public void testSet_FieldNullMap() throws Exception {
        AnnotatedField setter = mock(AnnotatedField.class);
        Object instance = new Object();

        when(setter.getValue(instance)).thenReturn(null);

        SettableAnyProperty prop = new SettableAnyProperty(null, setter, null, null, null, null);
        // Should not throw NPE, ignores gracefully
        prop.set(instance, "key1", "val1");
    }

    @Test
    public void testThrowAsIOE_IllegalArgumentException() throws Exception {
        AnnotatedMethod setter = mock(AnnotatedMethod.class);
        JavaType type = mock(JavaType.class);
        when(setter.getDeclaringClass()).thenReturn((Class) HashMap.class);
        when(type.toString()).thenReturn("String");

        SettableAnyProperty prop = new SettableAnyProperty(null, setter, type, null, null, null);
        
        Exception ex = new IllegalArgumentException("Bad argument");
        try {
            prop._throwAsIOE(ex, "propName", 123);
            fail("Expected JsonMappingException");
        } catch (JsonMappingException e) {
            assertTrue(e.getMessage().contains("Problem deserializing \"any\" property"));
            assertTrue(e.getMessage().contains("problem: Bad argument"));
        }
    }

    @Test
    public void testThrowAsIOE_IllegalArgumentExceptionNullMessage() throws Exception {
        AnnotatedMethod setter = mock(AnnotatedMethod.class);
        JavaType type = mock(JavaType.class);
        when(setter.getDeclaringClass()).thenReturn((Class) HashMap.class);
        when(type.toString()).thenReturn("String");

        SettableAnyProperty prop = new SettableAnyProperty(null, setter, type, null, null, null);
        
        Exception ex = new IllegalArgumentException((String) null);
        try {
            prop._throwAsIOE(ex, "propName", 123);
            fail("Expected JsonMappingException");
        } catch (JsonMappingException e) {
            assertTrue(e.getMessage().contains("(no error message provided)"));
        }
    }

    @Test
    public void testThrowAsIOE_RuntimeException() throws Exception {
        AnnotatedMethod setter = mock(AnnotatedMethod.class);
        when(setter.getDeclaringClass()).thenReturn((Class) HashMap.class);

        SettableAnyProperty prop = new SettableAnyProperty(null, setter, null, null, null, null);
        RuntimeException ex = new RuntimeException("Runtime failure");
        try {
            prop._throwAsIOE(ex, "propName", 123);
            fail("Expected RuntimeException");
        } catch (RuntimeException e) {
            assertEquals("Runtime failure", e.getMessage());
        }
    }
}