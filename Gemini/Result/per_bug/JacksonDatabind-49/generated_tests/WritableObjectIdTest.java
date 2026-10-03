package com.fasterxml.jackson.databind.ser.impl;

import com.fasterxml.jackson.annotation.ObjectIdGenerator;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.SerializableString;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class WritableObjectIdTest {

    private ObjectIdGenerator<Object> generator;
    private WritableObjectId writableObjectId;
    private JsonGenerator jsonGenerator;
    private SerializerProvider serializerProvider;
    private ObjectIdWriter objectIdWriter;

    @SuppressWarnings("unchecked")
    @Before
    public void setUp() {
        generator = (ObjectIdGenerator<Object>) mock(ObjectIdGenerator.class);
        writableObjectId = new WritableObjectId(generator);
        jsonGenerator = mock(JsonGenerator.class);
        serializerProvider = mock(SerializerProvider.class);
        objectIdWriter = mock(ObjectIdWriter.class);
    }

    @Test
    public void testGenerateId() {
        Object pojo = new Object();
        Object expectedId = "test-id-123";
        when(generator.generateId(pojo)).thenReturn(expectedId);

        Object actualId = writableObjectId.generateId(pojo);

        assertEquals(expectedId, actualId);
        assertEquals(expectedId, writableObjectId.id);
        verify(generator, times(1)).generateId(pojo);
    }

    @Test
    public void testWriteAsId_NullId() throws Exception {
        writableObjectId.id = null;
        writableObjectId.idWritten = true;
        objectIdWriter.alwaysAsId = true;

        boolean result = writableObjectId.writeAsId(jsonGenerator, serializerProvider, objectIdWriter);

        assertFalse(result);
        verifyZeroInteractions(jsonGenerator);
    }

    @Test
    public void testWriteAsId_IdNotNull_NeitherWrittenNorAlwaysAsId() throws Exception {
        writableObjectId.id = "id-1";
        writableObjectId.idWritten = false;
        objectIdWriter.alwaysAsId = false;

        boolean result = writableObjectId.writeAsId(jsonGenerator, serializerProvider, objectIdWriter);

        assertFalse(result);
        verifyZeroInteractions(jsonGenerator);
    }

    @Test
    public void testWriteAsId_IdNotNull_IdWrittenTrue_CanWriteObjectId() throws Exception {
        writableObjectId.id = "id-1";
        writableObjectId.idWritten = true;
        objectIdWriter.alwaysAsId = false;
        when(jsonGenerator.canWriteObjectId()).thenReturn(true);

        boolean result = writableObjectId.writeAsId(jsonGenerator, serializerProvider, objectIdWriter);

        assertTrue(result);
        verify(jsonGenerator).canWriteObjectId();
        verify(jsonGenerator).writeObjectRef("id-1");
    }

    @Test
    public void testWriteAsId_IdNotNull_AlwaysAsIdTrue_CannotWriteObjectId() throws Exception {
        writableObjectId.id = 123;
        writableObjectId.idWritten = false;
        objectIdWriter.alwaysAsId = true;
        
        com.fasterxml.jackson.databind.JsonSerializer<Object> serializer = mock(com.fasterxml.jackson.databind.JsonSerializer.class);
        objectIdWriter.serializer = serializer;

        when(jsonGenerator.canWriteObjectId()).thenReturn(false);

        boolean result = writableObjectId.writeAsId(jsonGenerator, serializerProvider, objectIdWriter);

        assertTrue(result);
        verify(jsonGenerator).canWriteObjectId();
        verify(serializer).serialize(123, jsonGenerator, serializerProvider);
    }

    @Test
    public void testWriteAsField_CanWriteObjectId() throws Exception {
        writableObjectId.id = "native-id";
        when(jsonGenerator.canWriteObjectId()).thenReturn(true);

        writableObjectId.writeAsField(jsonGenerator, serializerProvider, objectIdWriter);

        assertTrue(writableObjectId.idWritten);
        verify(jsonGenerator).canWriteObjectId();
        verify(jsonGenerator).writeObjectId("native-id");
        verify(jsonGenerator, never()).writeFieldName(any(SerializableString.class));
    }

    @Test
    public void testWriteAsField_CannotWriteObjectId_NullName() throws Exception {
        writableObjectId.id = "field-id";
        when(jsonGenerator.canWriteObjectId()).thenReturn(false);
        objectIdWriter.propertyName = null;

        writableObjectId.writeAsField(jsonGenerator, serializerProvider, objectIdWriter);

        assertTrue(writableObjectId.idWritten);
        verify(jsonGenerator).canWriteObjectId();
        verify(jsonGenerator, never()).writeFieldName(any(SerializableString.class));
    }

    @Test
    public void testWriteAsField_CannotWriteObjectId_NonNullName() throws Exception {
        writableObjectId.id = "field-id";
        when(jsonGenerator.canWriteObjectId()).thenReturn(false);
        SerializableString propertyName = mock(SerializableString.class);
        objectIdWriter.propertyName = propertyName;
        
        com.fasterxml.jackson.databind.JsonSerializer<Object> serializer = mock(com.fasterxml.jackson.databind.JsonSerializer.class);
        objectIdWriter.serializer = serializer;

        writableObjectId.writeAsField(jsonGenerator, serializerProvider, objectIdWriter);

        assertTrue(writableObjectId.idWritten);
        verify(jsonGenerator).canWriteObjectId();
        verify(jsonGenerator).writeFieldName(propertyName);
        verify(serializer).serialize("field-id", jsonGenerator, serializerProvider);
    }
}