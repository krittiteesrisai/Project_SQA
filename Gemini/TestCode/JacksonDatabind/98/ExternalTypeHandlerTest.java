package com.fasterxml.jackson.databind.deser.impl;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.deser.SettableBeanProperty;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.util.TokenBuffer;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.*;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class ExternalTypeHandlerTest {

    private ObjectMapper objectMapper;
    private DeserializationContext context;
    private JsonParser parser;
    private JavaType beanType;
    
    @Before
    public void setUp() {
        objectMapper = new ObjectMapper();
        context = objectMapper.getDeserializationContext();
        beanType = objectMapper.constructType(Object.class);
    }

    @Test
    public void testBuilderAndStart() {
        ExternalTypeHandler.Builder builder = ExternalTypeHandler.builder(beanType);
        assertNotNull(builder);

        SettableBeanProperty prop = mock(SettableBeanProperty.class);
        when(prop.getName()).thenReturn("propName");
        
        TypeDeserializer typeDeser = mock(TypeDeserializer.class);
        when(typeDeser.getPropertyName()).thenReturn("typePropName");

        builder.addExternal(prop, typeDeser);
        
        BeanPropertyMap otherProps = mock(BeanPropertyMap.class);
        when(otherProps.find("typePropName")).thenReturn(null);

        ExternalTypeHandler handler = builder.build(otherProps);
        assertNotNull(handler);

        ExternalTypeHandler startedHandler = handler.start();
        assertNotNull(startedHandler);
    }

    @Test
    public void testHandleTypePropertyValue_NotFound() throws Exception {
        ExternalTypeHandler.Builder builder = ExternalTypeHandler.builder(beanType);
        ExternalTypeHandler handler = builder.build(BeanPropertyMap.construct(Collections.emptyList()));

        parser = objectMapper.getFactory().createParser("\"someValue\"");
        parser.nextToken();

        boolean handled = handler.handleTypePropertyValue(parser, context, "unknownProp", new Object());
        assertFalse(handled);
    }

    @Test
    public void testHandlePropertyValue_NotFound() throws Exception {
        ExternalTypeHandler.Builder builder = ExternalTypeHandler.builder(beanType);
        ExternalTypeHandler handler = builder.build(BeanPropertyMap.construct(Collections.emptyList()));

        parser = objectMapper.getFactory().createParser("\"someValue\"");
        parser.nextToken();

        boolean handled = handler.handlePropertyValue(parser, context, "unknownProp", new Object());
        assertFalse(handled);
    }

    @Test
    public void testComplete_MissingTypeIdAndTokens() throws Exception {
        SettableBeanProperty prop = mock(SettableBeanProperty.class);
        when(prop.getName()).thenReturn("prop");
        
        TypeDeserializer typeDeser = mock(TypeDeserializer.class);
        when(typeDeser.getPropertyName()).thenReturn("typeProp");
        when(typeDeser.getDefaultImpl()).thenReturn(null);

        ExternalTypeHandler.Builder builder = ExternalTypeHandler.builder(beanType);
        builder.addExternal(prop, typeDeser);
        ExternalTypeHandler handler = builder.build(BeanPropertyMap.construct(Collections.emptyList())).start();

        parser = objectMapper.getFactory().createParser("{}");
        parser.nextToken();

        Object bean = new Object();
        Object result = handler.complete(parser, context, bean);
        assertEquals(bean, result);
    }

    @Test
    public void testComplete_WithDefaultType() throws Exception {
        SettableBeanProperty prop = mock(SettableBeanProperty.class);
        when(prop.getName()).thenReturn("prop");
        
        TypeDeserializer typeDeser = mock(TypeDeserializer.class);
        when(typeDeser.getPropertyName()).thenReturn("typeProp");
        when(typeDeser.getDefaultImpl()).thenAnswer(inv -> String.class);
        
        com.fasterxml.jackson.databind.jsontype.TypeIdResolver idResolver = mock(com.fasterxml.jackson.databind.jsontype.TypeIdResolver.class);
        when(typeDeser.getTypeIdResolver()).thenReturn(idResolver);
        when(idResolver.idFromValueAndType(isNull(), eq(String.class))).thenReturn("defaultId");

        ExternalTypeHandler.Builder builder = ExternalTypeHandler.builder(beanType);
        builder.addExternal(prop, typeDeser);
        ExternalTypeHandler handler = builder.build(BeanPropertyMap.construct(Collections.emptyList())).start();

        parser = objectMapper.getFactory().createParser("{}");
        parser.nextToken();

        Object bean = new Object();
        // Force token buffer state if possible or let complete evaluate
        Object result = handler.complete(parser, context, bean);
        assertNotNull(result);
    }

    @Test
    public void testExtTypedPropertyMethods() {
        SettableBeanProperty prop = mock(SettableBeanProperty.class);
        TypeDeserializer typeDeser = mock(TypeDeserializer.class);
        when(typeDeser.getPropertyName()).thenReturn("extType");
        when(typeDeser.getDefaultImpl()).thenReturn(null);

        ExternalTypeHandler.Builder builder = ExternalTypeHandler.builder(beanType);
        builder.addExternal(prop, typeDeser);
        
        // This exercises builder internal list branching when multiple properties map to the same name
        builder.addExternal(prop, typeDeser);
        
        ExternalTypeHandler handler = builder.build(BeanPropertyMap.construct(Collections.emptyList()));
        assertNotNull(handler);
    }
}