package com.fasterxml.jackson.databind.deser.impl;

import com.fasterxml.jackson.annotation.ObjectIdGenerator;
import com.fasterxml.jackson.annotation.ObjectIdResolver;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.type.TypeFactory;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import java.io.IOException;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class ObjectIdValuePropertyTest {

    private ObjectIdReader objectIdReaderMock;
    private PropertyMetadata propertyMetadataMock;
    private JsonDeserializer<Object> deserializerMock;
    private JsonParser jsonParserMock;
    private DeserializationContext deserializationContextMock;
    private ObjectIdGenerator<Object> objectIdGeneratorMock;
    private ObjectIdResolver objectIdResolverMock;
    
    @SuppressWarnings("unchecked")
    @Before
    public void setUp() {
        objectIdReaderMock = mock(ObjectIdReader.class);
        propertyMetadataMock = PropertyMetadata.STD_REQUIRED;
        deserializerMock = (JsonDeserializer<Object>) mock(JsonDeserializer.class);
        jsonParserMock = mock(JsonParser.class);
        deserializationContextMock = mock(DeserializationContext.class);
        objectIdGeneratorMock = (ObjectIdGenerator<Object>) mock(ObjectIdGenerator.class);
        objectIdResolverMock = mock(ObjectIdResolver.class);

        objectIdReaderMock.propertyName = PropertyName.construct("id");
        // กำหนดพฤติกรรมพื้นฐานให้ ObjectIdReader
        when(objectIdReaderMock.getIdType()).thenReturn(TypeFactory.defaultInstance().constructType(String.class));
        when(objectIdReaderMock.getDeserializer()).thenReturn(deserializerMock);
    }

    @Test
    public void testConstructorsAndDelegateMethods() {
        objectIdReaderMock.generator = objectIdGeneratorMock;
        objectIdReaderMock.resolver = objectIdResolverMock;
        objectIdReaderMock.idProperty = null;

        ObjectIdValueProperty prop = new ObjectIdValueProperty(objectIdReaderMock, propertyMetadataMock);
        
        // ทดสอบ withName
        ObjectIdValueProperty propWithName = prop.withName(PropertyName.newAndDefault("newId"));
        assertNotNull(propWithName);

        // ทดสอบ withValueDeserializer
        ObjectIdValueProperty propWithDeser = prop.withValueDeserializer(deserializerMock);
        assertNotNull(propWithDeser);

        // ทดสอบ BeanProperty impl methods
        assertNull(prop.getAnnotation(null));
        assertNull(prop.getMember());
    }

    @Test
    public void testDeserializeSetAndReturn_NullId() throws IOException {
        // [Branch Coverage]: id == null -> คืนค่า null ทันทีโดยไม่เรียก findObjectId
        when(deserializerMock.deserialize(jsonParserMock, deserializationContextMock)).thenReturn(null);

        objectIdReaderMock.generator = objectIdGeneratorMock;
        objectIdReaderMock.resolver = objectIdResolverMock;
        objectIdReaderMock.idProperty = null;

        ObjectIdValueProperty prop = new ObjectIdValueProperty(objectIdReaderMock, propertyMetadataMock);
        Object instance = new Object();

        Object result = prop.deserializeSetAndReturn(jsonParserMock, deserializationContextMock, instance);
        
        assertNull(result);
        verify(deserializationContextMock, never()).findObjectId(any(), any(), any());
    }

    @Test
    public void testDeserializeSetAndReturn_NonNullId_NoIdProperty() throws IOException {
        // [Branch Coverage]: id != null, แต่ idProperty == null
        String fakeId = "123";
        when(deserializerMock.deserialize(jsonParserMock, deserializationContextMock)).thenReturn(fakeId);

        ReadableObjectId readableObjectIdMock = mock(ReadableObjectId.class);
        when(deserializationContextMock.findObjectId(fakeId, objectIdGeneratorMock, objectIdResolverMock))
                .thenReturn(readableObjectIdMock);

        objectIdReaderMock.generator = objectIdGeneratorMock;
        objectIdReaderMock.resolver = objectIdResolverMock;
        objectIdReaderMock.idProperty = null;

        ObjectIdValueProperty prop = new ObjectIdValueProperty(objectIdReaderMock, propertyMetadataMock);
        Object instance = new Object();

        Object result = prop.deserializeSetAndReturn(jsonParserMock, deserializationContextMock, instance);

        assertEquals(instance, result);
        verify(readableObjectIdMock).bindItem(instance);
    }

    @Test
    public void testDeserializeSetAndReturn_NonNullId_WithIdProperty() throws IOException {
        // [Branch Coverage]: id != null, และ idProperty != null
        String fakeId = "456";
        when(deserializerMock.deserialize(jsonParserMock, deserializationContextMock)).thenReturn(fakeId);

        ReadableObjectId readableObjectIdMock = mock(ReadableObjectId.class);
        when(deserializationContextMock.findObjectId(fakeId, objectIdGeneratorMock, objectIdResolverMock))
                .thenReturn(readableObjectIdMock);

        SettableBeanProperty idPropMock = mock(SettableBeanProperty.class);
        Object expectedInstance = new Object();
        when(idPropMock.setAndReturn(any(), eq(fakeId))).thenReturn(expectedInstance);

        objectIdReaderMock.generator = objectIdGeneratorMock;
        objectIdReaderMock.resolver = objectIdResolverMock;
        objectIdReaderMock.idProperty = idPropMock;

        ObjectIdValueProperty prop = new ObjectIdValueProperty(objectIdReaderMock, propertyMetadataMock);
        Object instance = new Object();

        Object result = prop.deserializeSetAndReturn(jsonParserMock, deserializationContextMock, instance);

        assertEquals(expectedInstance, result);
        verify(readableObjectIdMock).bindItem(instance);
        verify(idPropMock).setAndReturn(instance, fakeId);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testSetAndReturn_ThrowsExceptionWhenIdPropertyIsNull() throws IOException {
        // [Branch Coverage & Edge Case]: idProp == null แล้วเรียก setAndReturn ต้องพ่น UnsupportedOperationException
        objectIdReaderMock.idProperty = null;

        ObjectIdValueProperty prop = new ObjectIdValueProperty(objectIdReaderMock, propertyMetadataMock);
        prop.setAndReturn(new Object(), "value");
    }

    @Test
    public void testSetAndReturn_DelegatesWhenIdPropertyNotNull() throws IOException {
        // [Branch Coverage]: idProp != null เรียก set และ setAndReturn ปกติ
        SettableBeanProperty idPropMock = mock(SettableBeanProperty.class);
        Object instance = new Object();
        Object value = "val";
        when(idPropMock.setAndReturn(instance, value)).thenReturn(instance);

        objectIdReaderMock.idProperty = idPropMock;

        ObjectIdValueProperty prop = new ObjectIdValueProperty(objectIdReaderMock, propertyMetadataMock);
        
        // ทดสอบ setAndReturn
        Object result1 = prop.setAndReturn(instance, value);
        assertEquals(instance, result1);

        // ทดสอบ set (เรียกผ่าน wrapper)
        prop.set(instance, value);
        verify(idPropMock, times(2)).setAndReturn(instance, value);
    }
}