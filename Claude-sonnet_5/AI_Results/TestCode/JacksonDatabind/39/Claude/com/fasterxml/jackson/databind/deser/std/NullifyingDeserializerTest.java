package com.fasterxml.jackson.databind.deser.std;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import java.io.IOException;

import org.junit.Before;
import org.junit.Test;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonTokenId;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;

public class NullifyingDeserializerTest {

    private NullifyingDeserializer deserializer;
    private JsonParser mockParser;
    private DeserializationContext mockContext;
    private TypeDeserializer mockTypeDeserializer;

    @Before
    public void setUp() {
        deserializer = new NullifyingDeserializer();
        mockParser = mock(JsonParser.class);
        mockContext = mock(DeserializationContext.class);
        mockTypeDeserializer = mock(TypeDeserializer.class);
    }

    // ---------- constructor / static instance ----------

    @Test
    public void testStaticInstanceIsNotNull() {
        assertNotNull(NullifyingDeserializer.instance);
    }

    @Test
    public void testHandledTypeIsObjectClass() {
        // StdDeserializer เก็บ handled type ผ่าน super(Object.class)
        assertEquals(Object.class, deserializer.handledType());
    }

    // ---------- deserialize() ----------

    @Test
    public void testDeserialize_callsSkipChildrenAndReturnsNull() throws IOException {
        Object result = deserializer.deserialize(mockParser, mockContext);

        verify(mockParser, times(1)).skipChildren();
        assertNull(result);
    }

    @Test(expected = IOException.class)
    public void testDeserialize_propagatesIOExceptionFromSkipChildren() throws IOException {
        when(mockParser.skipChildren()).thenThrow(new IOException("boom"));
        deserializer.deserialize(mockParser, mockContext);
    }

    // ---------- deserializeWithType(): branch ID_START_ARRAY ----------

    @Test
    public void testDeserializeWithType_startArray_delegatesToTypeDeserializer() throws IOException {
        when(mockParser.getCurrentTokenId()).thenReturn(JsonTokenId.ID_START_ARRAY);
        Object expected = new Object();
        when(mockTypeDeserializer.deserializeTypedFromAny(mockParser, mockContext)).thenReturn(expected);

        Object result = deserializer.deserializeWithType(mockParser, mockContext, mockTypeDeserializer);

        verify(mockTypeDeserializer, times(1)).deserializeTypedFromAny(mockParser, mockContext);
        assertSame(expected, result);
    }

    // ---------- deserializeWithType(): branch ID_START_OBJECT ----------

    @Test
    public void testDeserializeWithType_startObject_delegatesToTypeDeserializer() throws IOException {
        when(mockParser.getCurrentTokenId()).thenReturn(JsonTokenId.ID_START_OBJECT);
        Object expected = new Object();
        when(mockTypeDeserializer.deserializeTypedFromAny(mockParser, mockContext)).thenReturn(expected);

        Object result = deserializer.deserializeWithType(mockParser, mockContext, mockTypeDeserializer);

        verify(mockTypeDeserializer, times(1)).deserializeTypedFromAny(mockParser, mockContext);
        assertSame(expected, result);
    }

    // ---------- deserializeWithType(): branch ID_FIELD_NAME ----------

    @Test
    public void testDeserializeWithType_fieldName_delegatesToTypeDeserializer() throws IOException {
        when(mockParser.getCurrentTokenId()).thenReturn(JsonTokenId.ID_FIELD_NAME);
        Object expected = new Object();
        when(mockTypeDeserializer.deserializeTypedFromAny(mockParser, mockContext)).thenReturn(expected);

        Object result = deserializer.deserializeWithType(mockParser, mockContext, mockTypeDeserializer);

        verify(mockTypeDeserializer, times(1)).deserializeTypedFromAny(mockParser, mockContext);
        assertSame(expected, result);
    }

    // ---------- deserializeWithType(): default branch (หลาย token id) ----------

    @Test
    public void testDeserializeWithType_defaultCase_string_returnsNullWithoutDelegate() throws IOException {
        when(mockParser.getCurrentTokenId()).thenReturn(JsonTokenId.ID_STRING);

        Object result = deserializer.deserializeWithType(mockParser, mockContext, mockTypeDeserializer);

        verify(mockTypeDeserializer, never())
                .deserializeTypedFromAny(any(JsonParser.class), any(DeserializationContext.class));
        assertNull(result);
    }

    @Test
    public void testDeserializeWithType_defaultCase_null_returnsNullWithoutDelegate() throws IOException {
        when(mockParser.getCurrentTokenId()).thenReturn(JsonTokenId.ID_NULL);

        Object result = deserializer.deserializeWithType(mockParser, mockContext, mockTypeDeserializer);

        verify(mockTypeDeserializer, never())
                .deserializeTypedFromAny(any(JsonParser.class), any(DeserializationContext.class));
        assertNull(result);
    }

    @Test
    public void testDeserializeWithType_defaultCase_endArray_returnsNullWithoutDelegate() throws IOException {
        when(mockParser.getCurrentTokenId()).thenReturn(JsonTokenId.ID_END_ARRAY);

        Object result = deserializer.deserializeWithType(mockParser, mockContext, mockTypeDeserializer);

        verify(mockTypeDeserializer, never())
                .deserializeTypedFromAny(any(JsonParser.class), any(DeserializationContext.class));
        assertNull(result);
    }

    @Test
    public void testDeserializeWithType_defaultCase_endObject_returnsNullWithoutDelegate() throws IOException {
        when(mockParser.getCurrentTokenId()).thenReturn(JsonTokenId.ID_END_OBJECT);

        Object result = deserializer.deserializeWithType(mockParser, mockContext, mockTypeDeserializer);

        verify(mockTypeDeserializer, never())
                .deserializeTypedFromAny(any(JsonParser.class), any(DeserializationContext.class));
        assertNull(result);
    }

    @Test
    public void testDeserializeWithType_defaultCase_numberInt_returnsNullWithoutDelegate() throws IOException {
        when(mockParser.getCurrentTokenId()).thenReturn(JsonTokenId.ID_NUMBER_INT);

        Object result = deserializer.deserializeWithType(mockParser, mockContext, mockTypeDeserializer);

        verify(mockTypeDeserializer, never())
                .deserializeTypedFromAny(any(JsonParser.class), any(DeserializationContext.class));
        assertNull(result);
    }

    @Test
    public void testDeserializeWithType_defaultCase_notAvailable_returnsNullWithoutDelegate() throws IOException {
        // ค่า boundary: token id ที่บ่งบอกว่า parser ยังไม่มี token (edge case)
        when(mockParser.getCurrentTokenId()).thenReturn(JsonTokenId.ID_NOT_AVAILABLE);

        Object result = deserializer.deserializeWithType(mockParser, mockContext, mockTypeDeserializer);

        verify(mockTypeDeserializer, never())
                .deserializeTypedFromAny(any(JsonParser.class), any(DeserializationContext.class));
        assertNull(result);
    }

    // ---------- deserializeWithType(): exception propagation จาก typeDeserializer ----------

    @Test(expected = IOException.class)
    public void testDeserializeWithType_propagatesIOExceptionFromTypeDeserializer() throws IOException {
        when(mockParser.getCurrentTokenId()).thenReturn(JsonTokenId.ID_START_OBJECT);
        when(mockTypeDeserializer.deserializeTypedFromAny(mockParser, mockContext))
                .thenThrow(new IOException("fail"));

        deserializer.deserializeWithType(mockParser, mockContext, mockTypeDeserializer);
    }
}
