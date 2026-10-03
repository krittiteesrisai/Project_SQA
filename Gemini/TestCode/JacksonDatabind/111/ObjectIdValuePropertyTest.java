package com.fasterxml.jackson.databind.deser.impl;

import com.fasterxml.jackson.annotation.ObjectIdGenerator;
import com.fasterxml.jackson.annotation.ObjectIdResolver;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.deser.SettableBeanProperty;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.node.MissingNode;
import org.junit.Test;
import org.mockito.Mockito;

import java.io.IOException;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class ObjectIdValuePropertyTest {

    @Test
    testWithNativeAndGetterMethods() {
        // ทดสอบ Constructor พื้นฐาน, getAnnotation, getMember และเซ็ตค่าต่างๆ เพื่อเก็บ Coverage พื้นฐาน
        ObjectIdReader reader = mock(ObjectIdReader.class);
        reader.propertyName = PropertyName.construct("id");
        when(reader.getIdType()).thenAnswer(inv -> String.class);
        when(reader.getDeserializer()).thenAnswer(inv -> mock(JsonDeserializer.class));

        PropertyMetadata metadata = PropertyMetadata.STD_REQUIRED;
        ObjectIdValueProperty prop = new ObjectIdValueProperty(reader, metadata);

        assertNull(prop.getAnnotation(null));
        assertNull(prop.getMember());

        // Test copy constructor with PropertyName
        ObjectIdValueProperty propByName = new ObjectIdValueProperty(prop, PropertyName.construct("newId"));
        assertNotNull(propByName);

        // Test withNullProvider
        SettableBeanProperty nullProvProp = prop.withNullProvider(null);
        assertNotNull(nullProvProp);
    }

    @Test
    public void testWithValueDeserializer_SameAndDifferent() {
        ObjectIdReader reader = mock(ObjectIdReader.class);
        reader.propertyName = PropertyName.construct("id");
        JsonDeserializer<?> deser1 = mock(JsonDeserializer.class);
        JsonDeserializer<?> deser2 = mock(JsonDeserializer.class);
        when(reader.getDeserializer()).thenReturn((JsonDeserializer) deser1);

        ObjectIdValueProperty prop = new ObjectIdValueProperty(reader, PropertyMetadata.STD_REQUIRED);

        // Branch 1: _valueDeserializer == deser (Same)
        SettableBeanProperty sameProp = prop.withValueDeserializer(deser1);
        assertSame(prop, sameProp);

        // Branch 2: _valueDeserializer != deser (Different)
        SettableBeanProperty diffProp = prop.withValueDeserializer(deser2);
        assertNotSame(prop, diffProp);
    }

    @Test
    public void testDeserializeSetAndReturn_ValueNull() throws IOException {
        // Branch: p.hasToken(JsonToken.VALUE_NULL) == true
        ObjectIdReader reader = mock(ObjectIdReader.class);
        reader.propertyName = PropertyName.construct("id");
        JsonpParser p = mock(JsonParser.class);
        when(p.hasToken(JsonToken.VALUE_NULL)).thenReturn(true);

        ObjectIdValueProperty prop = new ObjectIdValueProperty(reader, PropertyMetadata.STD_REQUIRED);
        Object result = prop.deserializeSetAndReturn(p, mock(DeserializationContext.class), new Object());

        assertNull(result);
        // Ensure deserialize is never called when token is VALUE_NULL
        verify(reader.getDeserializer(), never());
    }

    @Test
    public void testDeserializeSetAndReturn_WithoutIdProperty() throws IOException {
        // Branch: p.hasToken(JsonToken.VALUE_NULL) == false, idProp == null
        ObjectIdReader reader = mock(ObjectIdReader.class);
        reader.propertyName = PropertyName.construct("id");
        JsonDeserializer<Object> deser = mock(JsonDeserializer.class);
        when(deser.deserialize(any(JsonParser.class), any(DeserializationContext.class))).thenReturn("test-id");
        when(reader.getDeserializer()).thenReturn(deser);
        
        reader.generator = mock(ObjectIdGenerator.class);
        reader.resolver = mock(ObjectIdResolver.class);
        reader.idProperty = null; // ไม่มี idProperty

        JsonParser p = mock(JsonParser.class);
        when(p.hasToken(JsonToken.VALUE_NULL)).thenReturn(false);

        DeserializationContext ctxt = mock(DeserializationContext.class);
        ReadableObjectId roid = mock(ReadableObjectId.class);
        when(ctxt.findObjectId(eq("test-id"), any(), any())).thenReturn(roid);

        Object instance = new Object();
        ObjectIdValueProperty prop = new ObjectIdValueProperty(reader, PropertyMetadata.STD_REQUIRED);

        Object result = prop.deserializeSetAndReturn(p, ctxt, instance);

        assertEquals(instance, result);
        verify(roid).bindItem(instance);
    }

    @Test
    public void testDeserializeSetAndReturn_WithIdProperty() throws IOException {
        // Branch: p.hasToken(JsonToken.VALUE_NULL) == false, idProp != null
        ObjectIdReader reader = mock(ObjectIdReader.class);
        reader.propertyName = PropertyName.construct("id");
        JsonDeserializer<Object> deser = mock(JsonDeserializer.class);
        when(deser.deserialize(any(JsonParser.class), any(DeserializationContext.class))).thenReturn("test-id");
        when(reader.getDeserializer()).thenReturn(deser);

        SettableBeanProperty idProp = mock(SettableBeanProperty.class);
        Object instance = new Object();
        when(idProp.setAndReturn(instance, "test-id")).thenReturn(instance);

        reader.generator = mock(ObjectIdGenerator.class);
        reader.resolver = mock(ObjectIdResolver.class);
        reader.idProperty = idProp; // มี idProperty

        JsonParser p = mock(JsonParser.class);
        when(p.hasToken(JsonToken.VALUE_NULL)).thenReturn(false);

        DeserializationContext ctxt = mock(DeserializationContext.class);
        ReadableObjectId roid = mock(ReadableObjectId.class);
        when(ctxt.findObjectId(eq("test-id"), any(), any())).thenReturn(roid);

        ObjectIdValueProperty prop = new ObjectIdValueProperty(reader, PropertyMetadata.STD_REQUIRED);

        Object result = prop.deserializeSetAndReturn(p, ctxt, instance);

        assertEquals(instance, result);
        verify(idProp).setAndReturn(instance, "test-id");
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testSetAndReturn_NullIdPropertyThrowsException() throws IOException {
        // Branch: idProp == null in setAndReturn -> throws UnsupportedOperationException
        ObjectIdReader reader = mock(ObjectIdReader.class);
        reader.propertyName = PropertyName.construct("id");
        reader.idProperty = null;

        ObjectIdValueProperty prop = new ObjectIdValueProperty(reader, PropertyMetadata.STD_REQUIRED);
        prop.setAndReturn(new Object(), "some-value");
    }

    @Test
    public void testSetAndReturn_DelegatesSuccessfully() throws IOException {
        // Branch: idProp != null in setAndReturn -> delegates correctly
        ObjectIdReader reader = mock(ObjectIdReader.class);
        reader.propertyName = PropertyName.construct("id");
        SettableBeanProperty idProp = mock(SettableBeanProperty.class);
        reader.idProperty = idProp;

        Object instance = new Object();
        Object value = "value";
        when(idProp.setAndReturn(instance, value)).thenReturn(instance);

        ObjectIdValueProperty prop = new ObjectIdValueProperty(reader, PropertyMetadata.STD_REQUIRED);
        Object result = prop.setAndReturn(instance, value);

        assertEquals(instance, result);
        verify(idProp).setAndReturn(instance, value);
    }
    
    @Test
    public void testDirectSetDelegation() throws IOException {
        // Test delegate method set() calls setAndReturn()
        ObjectIdReader reader = mock(ObjectIdReader.class);
        reader.propertyName = PropertyName.construct("id");
        SettableBeanProperty idProp = mock(SettableBeanProperty.class);
        reader.idProperty = idProp;

        Object instance = new Object();
        Object value = "value";

        ObjectIdValueProperty prop = new ObjectIdValueProperty(reader, PropertyMetadata.STD_REQUIRED);
        prop.set(instance, value);

        verify(idProp).setAndReturn(instance, value);
    }
}