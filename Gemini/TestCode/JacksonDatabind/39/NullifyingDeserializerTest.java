package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.JsonTokenId;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class NullifyingDeserializerTest {

    private final NullifyingDeserializer deserializer = NullifyingDeserializer.instance;

    @Test
    public void testInstanceIsNotNull() {
        assertNotNull(NullifyingDeserializer.instance);
    }

    @Test
    public void testConstructor() {
        NullifyingDeserializer customInstance = new NullifyingDeserializer();
        assertNotNull(customInstance);
    }

    @Test
    public void testDeserialize() throws IOException {
        JsonParser parser = mock(JsonParser.class);
        DeserializationContext context = mock(DeserializationContext.class);

        Object result = deserializer.deserialize(parser, context);

        assertNull(result);
        verify(parser, times(1)).skipChildren();
    }

    @Test
    public void testDeserializeWithType_StartArray() throws IOException {
        testDeserializeWithTypeHelper(JsonTokenId.ID_START_ARRAY, true);
    }

    @Test
    public void testDeserializeWithType_StartObject() throws IOException {
        testDeserializeWithTypeHelper(JsonTokenId.ID_START_OBJECT, true);
    }

    @Test
    public void testDeserializeWithType_FieldName() throws IOException {
        testDeserializeWithTypeHelper(JsonTokenId.ID_FIELD_NAME, true);
    }

    @Test
    public void testDeserializeWithType_StringDefault() throws IOException {
        testDeserializeWithTypeHelper(JsonTokenId.ID_STRING, false);
    }

    @Test
    public void testDeserializeWithType_NumberIntDefault() throws IOException {
        testDeserializeWithTypeHelper(JsonTokenId.ID_NUMBER_INT, false);
    }

    @Test
    public void testDeserializeWithType_NullDefault() throws IOException {
        testDeserializeWithTypeHelper(JsonTokenId.ID_NULL, false);
    }

    private void testDeserializeWithTypeHelper(int tokenId, boolean expectTypeDeserializerCall) throws IOException {
        JsonParser parser = mock(JsonParser.class);
        DeserializationContext context = mock(DeserializationContext.class);
        TypeDeserializer typeDeserializer = mock(TypeDeserializer.class);

        when(parser.getCurrentTokenId()).thenReturn(tokenId);
        Object expectedReturn = expectTypeDeserializerCall ? new Object() : null;
        if (expectTypeDeserializerCall) {
            when(typeDeserializer.deserializeTypedFromAny(parser, context)).thenReturn(expectedReturn);
        }

        Object result = deserializer.deserializeWithType(parser, context, typeDeserializer);

        if (expectTypeDeserializerCall) {
            assertEquals(expectedReturn, result);
            verify(typeDeserializer, times(1)).deserializeTypedFromAny(parser, context);
        } else {
            assertNull(result);
            verify(typeDeserializer, never()).deserializeTypedFromAny(any(), any());
        }
    }
}