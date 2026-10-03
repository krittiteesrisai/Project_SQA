package com.fasterxml.jackson.databind.deser.impl;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.deser.SettableBeanProperty;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.util.TokenBuffer;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.HashMap;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class ExternalTypeHandlerTest {

    private SettableBeanProperty mockProperty;
    private TypeDeserializer mockTypeDeserializer;
    private JsonParser mockParser;
    private DeserializationContext mockContext;
    private ExternalTypeHandler.Builder builder;

    @Before
    public void setUp() {
        mockProperty = mock(SettableBeanProperty.class);
        mockTypeDeserializer = mock(TypeDeserializer.class);
        mockParser = mock(JsonParser.class);
        mockContext = mock(DeserializationContext.class);

        when(mockProperty.getName()).thenReturn("extProp");
        when(mockTypeDeserializer.getPropertyName()).thenReturn("extType");

        builder = new ExternalTypeHandler.Builder();
        builder.addExternal(mockProperty, mockTypeDeserializer);
    }

    @Test
    public void testHandleTypePropertyValue_UnknownProperty() throws Exception {
        ExternalTypeHandler handler = builder.build().start();
        boolean handled = handler.handleTypePropertyValue(mockParser, mockContext, "unknownProp", new Object());
        assertFalse(handled);
    }

    @Test
    public void testHandleTypePropertyValue_NotTypeProperty() throws Exception {
        ExternalTypeHandler handler = builder.build().start();
        // "extProp" is not the type property name ("extType")
        boolean handled = handler.handleTypePropertyValue(mockParser, mockContext, "extProp", new Object());
        assertFalse(handled);
    }

    @Test
    public void testHandleTypePropertyValue_StoresTypeIdWhenNoToken() throws Exception {
        ExternalTypeHandler handler = builder.build().start();
        when(mockParser.getText()).thenReturn("typeIdVal");

        boolean handled = handler.handleTypePropertyValue(mockParser, mockContext, "extType", new Object());
        assertTrue(handled);
    }

    @Test
    public void testHandleTypePropertyValue_DeserializesWhenTokenExists() throws Exception {
        ExternalTypeHandler handler = builder.build().start();
        // Populate token buffer first via handlePropertyValue
        when(mockParser.getCurrentToken()).thenReturn(JsonToken.VALUE_STRING);
        when(mockParser.getText()).thenReturn("typeIdVal");

        // First feed value property to populate token
        handler.handlePropertyValue(mockParser, mockContext, "extProp", new Object());

        // Now handle type property with bean and token present
        boolean handled = handler.handleTypePropertyValue(mockParser, mockContext, "extType", new Object());
        assertTrue(handled);
    }

    @Test
    public void testHandlePropertyValue_UnknownProperty() throws Exception {
        ExternalTypeHandler handler = builder.build().start();
        boolean handled = handler.handlePropertyValue(mockParser, mockContext, "unknownProp", new Object());
        assertFalse(handled);
    }

    @Test
    public void testHandlePropertyValue_IsTypeProperty() throws Exception {
        ExternalTypeHandler handler = builder.build().start();
        when(mockParser.getText()).thenReturn("someType");

        boolean handled = handler.handlePropertyValue(mockParser, mockContext, "extType", new Object());
        assertTrue(handled);
        verify(mockParser, times(1)).skipChildren();
    }

    @Test
    public void testHandlePropertyValue_IsValuePropertyWithoutBean() throws Exception {
        ExternalTypeHandler handler = builder.build().start();
        boolean handled = handler.handlePropertyValue(mockParser, mockContext, "extProp", null);
        assertTrue(handled);
    }

    @Test
    public void testComplete_MissingBothTypeAndProperty_Continues() throws Exception {
        ExternalTypeHandler handler = builder.build().start();
        Object bean = new Object();
        Object result = handler.complete(mockParser, mockContext, bean);
        assertEquals(bean, result);
    }

    @Test(expected = JsonMappingException.class)
    public void testComplete_MissingExternalTypeIdReportsException() throws Exception {
        ExternalTypeHandler handler = builder.build().start();
        Object bean = new Object();

        // Put a token buffer so it triggers the type evaluation branch
        TokenBuffer tb = new TokenBuffer(mockParser, mockContext);
        tb.writeString("testValue");
        
        // Use reflection or standard behavior by feeding tokens via handlePropertyValue
        when(mockParser.getCurrentToken()).thenReturn(JsonToken.VALUE_STRING);
        handler.handlePropertyValue(mockParser, mockContext, "extProp", bean);

        when(mockTypeDeserializer.getDefaultImpl()).thenReturn(null);

        handler.complete(mockParser, mockContext, bean);
    }

    @Test(expected = JsonMappingException.class)
    public void testComplete_MissingPropertyForExternalTypeIdReportsException() throws Exception {
        ExternalTypeHandler handler = builder.build().start();
        Object bean = new Object();

        when(mockParser.getText()).thenReturn("typeIdVal");
        // Handle type property only (leaves tokens[i] as null)
        handler.handleTypePropertyValue(mockParser, mockContext, "extType", bean);

        handler.complete(mockParser, mockContext, bean);
    }

    @Test
    public void test_DeserializeAndSet_ValueNull() throws Exception {
        ExternalTypeHandler handler = builder.build().start();
        Object bean = new Object();

        // Force a TokenBuffer containing VALUE_NULL
        TokenBuffer tb = new TokenBuffer(mockParser, mockContext);
        tb.writeNull();
        
        // We can test private/protected method execution paths via handlePropertyValue/complete or direct invocation simulation
        when(mockParser.getCurrentToken()).thenReturn(JsonToken.VALUE_NULL);
        
        // Feed null value
        handler.handlePropertyValue(mockParser, mockContext, "extProp", bean);
        when(mockParser.getText()).thenReturn("someType");
        
        // Complete with null token scenario
        Object result = handler.complete(mockParser, mockContext, bean);
        assertNotNull(result);
    }
}