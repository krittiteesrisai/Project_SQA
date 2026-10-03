package com.fasterxml.jackson.databind.deser.impl;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.deser.NullValueProvider;
import com.fasterxml.jackson.databind.deser.SettableBeanProperty;
import com.fasterxml.jackson.databind.deser.UnresolvedForwardReference;
import com.fasterxml.jackson.databind.introspect.ObjectIdInfo;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.type.TypeFactory;
import org.junit.Test;
import org.mockito.Mockito;

import java.io.IOException;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class ObjectIdReferencePropertyTest {

    @SuppressWarnings("unchecked")
    @Test
    TestWithSameValueDeserializer() {
        SettableBeanProperty forward = mock(SettableBeanProperty.class);
        ObjectIdReferenceProperty prop = new ObjectIdReferenceProperty(forward, (ObjectIdInfo) null);
        JsonDeserializer<Object> deser = (JsonDeserializer<Object>) mock(JsonDeserializer.class);

        // เซ็ต Deserializer ครั้งแรกเพื่อให้ _valueDeserializer ไม่เป็น null
        SettableBeanProperty propWithDeser = prop.withValueDeserializer(deser);
        
        // ทดสอบ Branch: _valueDeserializer == deser (True)
        SettableBeanProperty sameProp = propWithDeser.withValueDeserializer(deser);
        assertSame(propWithDeser, sameProp);

        // ทดสอบ Branch: _valueDeserializer == deser (False)
        JsonDeserializer<Object> newDeser = (JsonDeserializer<Object>) mock(JsonDeserializer.class);
        SettableBeanProperty diffProp = propWithDeser.withValueDeserializer(newDeser);
        assertNotSame(propWithDeser, diffProp);
    }

    @Test
    TestWithNullProvider() {
        SettableBeanProperty forward = mock(SettableBeanProperty.class);
        ObjectIdReferenceProperty prop = new ObjectIdReferenceProperty(forward, (ObjectIdInfo) null);
        NullValueProvider nullProvider = mock(NullValueProvider.class);

        SettableBeanProperty updated = prop.withNullProvider(nullProvider);
        assertNotNull(updated);
        assertNotSame(prop, updated);
    }

    @Test
    TestFixAccessBranch() {
        // Branch: _forward == null (Edge case ป้องกัน NullPointerException)
        ObjectIdReferenceProperty propNullForward = new ObjectIdReferenceProperty((SettableBeanProperty) null, (ObjectIdInfo) null);
        DeserializationConfig config = mock(DeserializationConfig.class);
        propNullForward.fixAccess(config); // ต้องไม่พัง

        // Branch: _forward != null (True)
        SettableBeanProperty forward = mock(SettableBeanProperty.class);
        ObjectIdReferenceProperty propNotNullForward = new ObjectIdReferenceProperty(forward, (ObjectIdInfo) null);
        propNotNullForward.fixAccess(config);
        verify(forward, times(1)).fixAccess(config);
    }

    @Test
    TestDelegationMethods() {
        SettableBeanProperty forward = mock(SettableBeanProperty.class);
        ObjectIdReferenceProperty prop = new ObjectIdReferenceProperty(forward, (ObjectIdInfo) null);
        Class<Annotation> annotationClass = (Class<Annotation>) (Class<?>) org.junit.Test.class;

        prop.getAnnotation(annotationClass);
        verify(forward, times(1)).getAnnotation(annotationClass);

        prop.getMember();
        verify(forward, times(1)).getMember();

        prop.getCreatorIndex();
        verify(forward, times(1)).getCreatorIndex();

        Object instance = new Object();
        Object value = new Object();
        try {
            prop.set(instance, value);
            verify(forward, times(1)).set(instance, value);

            prop.setAndReturn(instance, value);
            verify(forward, times(1)).setAndReturn(instance, value);
        } catch (IOException e) {
            fail("IOException should not be thrown: " + e.getMessage());
        }
    }

    @SuppressWarnings("unchecked")
    @Test(expected = JsonMappingException.class)
    TestDeserializeSetAndReturn_UnresolvedWithoutIdentityInfo() throws Throwable {
        JsonParser p = mock(JsonParser.class);
        DeserializationContext ctxt = mock(DeserializationContext.class);
        Object instance = new Object();

        SettableBeanProperty forward = mock(SettableBeanProperty.class);
        JsonDeserializer<Object> deser = (JsonDeserializer<Object>) mock(JsonDeserializer.class);
        
        // กำหนดให้ deserialize โยน UnresolvedForwardReference
        UnresolvedForwardReference forwardRef = mock(UnresolvedForwardReference.class);
        when(deser.deserialize(p, ctxt)).thenThrow(forwardRef);
        // ไม่มี ObjectIdReader และไม่มี ObjectIdInfo -> usingIdentityInfo = false
        when(deser.getObjectIdReader()).thenReturn(null);

        ObjectIdReferenceProperty prop = new ObjectIdReferenceProperty(forward, null);
        ObjectIdReferenceProperty propWithDeser = (ObjectIdReferenceProperty) prop.withValueDeserializer(deser);

        try {
            propWithDeser.deserializeSetAndReturn(p, ctxt, instance);
        } catch (Throwable t) {
            // ตรวจสอบว่าเข้าเงื่อนไขโยน JsonMappingException เมื่อ !usingIdentityInfo
            throw t;
        }
    }

    @SuppressWarnings("unchecked")
    @Test
    TestDeserializeSetAndReturn_UnresolvedWithIdentityInfo() throws Exception {
        JsonParser p = mock(JsonParser.class);
        DeserializationContext ctxt = mock(DeserializationContext.class);
        Object instance = new Object();

        SettableBeanProperty forward = mock(SettableBeanProperty.class);
        JsonDeserializer<Object> deser = (JsonDeserializer<Object>) mock(JsonDeserializer.class);
        
        UnresolvedForwardReference forwardRef = mock(UnresolvedForwardReference.class);
        ReadableObjectId roid = mock(ReadableObjectId.class);
        when(forwardRef.getRoid()).thenReturn(roid);
        when(deser.deserialize(p, ctxt)).thenThrow(forwardRef);
        
        // มี ObjectIdInfo -> usingIdentityInfo = true
        ObjectIdInfo objectIdInfo = mock(ObjectIdInfo.class);
        ObjectIdReferenceProperty prop = new ObjectIdReferenceProperty(forward, objectIdInfo);
        ObjectIdReferenceProperty propWithDeser = (ObjectIdReferenceProperty) prop.withValueDeserializer(deser);

        // กำหนด JavaType เพื่อเลี่ยง NPE ใน PropertyReferring constructor
        JavaType type = TypeFactory.defaultInstance().constructType(Object.class);
        when(forward.getType()).thenReturn(type);

        Object result = propWithDeser.deserializeSetAndReturn(p, ctxt, instance);
        assertNull(result);
        verify(roid, times(1)).appendReferring(any(ObjectIdReferenceProperty.PropertyReferring.class));
    }

    @Test(expected = IllegalArgumentException.class)
    TestPropertyReferring_InvalidId() throws Throwable {
        SettableBeanProperty forward = mock(SettableBeanProperty.class);
        ObjectIdReferenceProperty prop = new ObjectIdReferenceProperty(forward, (ObjectIdInfo) null);
        UnresolvedForwardReference ref = mock(UnresolvedForwardReference.class);
        ReadableObjectId roid = mock(ReadableObjectId.class);
        when(ref.getRoid()).thenReturn(roid);
        // สมมติว่า hasId คืนค่า false
        when(roid.hasId(any())).thenReturn(false);

        JavaType type = TypeFactory.defaultInstance().constructType(Object.class);
        when(forward.getType()).thenReturn(type);

        ObjectIdReferenceProperty.PropertyReferring referring = 
            new ObjectIdReferenceProperty.PropertyReferring(prop, ref, Object.class, new Object());

        try {
            referring.handleResolvedForwardReference("unknown-id", "some-value");
        } catch (Throwable t) {
            // คาดหวัง IllegalArgumentException จาก !hasId(id)
            throw t;
        }
    }

    @Test
    TestPropertyReferring_ValidId() throws Exception {
        SettableBeanProperty forward = mock(SettableBeanProperty.class);
        ObjectIdReferenceProperty prop = new ObjectIdReferenceProperty(forward, (ObjectIdInfo) null);
        UnresolvedForwardReference ref = mock(UnresolvedForwardReference.class);
        ReadableObjectId roid = mock(ReadableObjectId.class);
        when(ref.getRoid()).thenReturn(roid);
        // สมมติว่า hasId คืนค่า true
        when(roid.hasId(any())).thenReturn(true);

        JavaType type = TypeFactory.defaultInstance().constructType(Object.class);
        when(forward.getType()).thenReturn(type);

        Object pojo = new Object();
        ObjectIdReferenceProperty.PropertyReferring referring = 
            new ObjectIdReferenceProperty.PropertyReferring(prop, ref, Object.class, pojo);

        referring.handleResolvedForwardReference("valid-id", "resolved-value");
        verify(forward, times(1)).set(pojo, "resolved-value");
    }
}