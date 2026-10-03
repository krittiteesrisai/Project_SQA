package com.fasterxml.jackson.databind.deser.impl;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.deser.SettableBeanProperty;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.jsontype.TypeIdResolver;
import com.fasterxml.jackson.databind.util.TokenBuffer;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.HashMap;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class ExternalTypeHandlerTest {

    private ObjectMapper mapper;
    private DeserializationContext ctxt;
    private JsonParser parser;
    private SettableBeanProperty property;
    private TypeDeserializer typeDeserializer;
    private TypeIdResolver typeIdResolver;
    private ExternalTypeHandler.Builder builder;

    @Before
    public void setUp() {
        mapper = new ObjectMapper();
        ctxt = mapper.getDeserializationContext();
        parser = mock(JsonParser.class);
        property = mock(SettableBeanProperty.class);
        typeDeserializer = mock(TypeDeserializer.class);
        typeIdResolver = mock(TypeIdResolver.class);

        when(typeDeserializer.getPropertyName()).thenReturn("typeProp");
        when(property.getName()).thenReturn("valueProp");

        builder = new ExternalTypeHandler.Builder();
    }

    @Test
    public void testHandleTypePropertyValue_NotFound() throws Exception {
        ExternalTypeHandler handler = builder.build();
        boolean handled = handler.handleTypePropertyValue(parser, ctxt, "unknownProp", new Object());
        assertFalse(handled);
    }

    @Test
    public void testHandleTypePropertyValue_NotTypeProperty() throws Exception {
        builder.addExternal(property, typeDeserializer);
        ExternalTypeHandler handler = builder.build();
        // ส่งชื่อ Property ปกติที่ไม่ใช่ typeProp
        boolean handled = handler.handleTypePropertyValue(parser, ctxt, "valueProp", new Object());
        assertFalse(handled);
    }

    @Test
    public void testHandleTypePropertyValue_StoreTypeIdWhenNoToken() throws Exception {
        builder.addExternal(property, typeDeserializer);
        ExternalTypeHandler handler = builder.build();

        when(parser.getText()).thenReturn("myTypeId");

        boolean handled = handler.handleTypePropertyValue(parser, ctxt, "typeProp", new Object());
        assertTrue(handled);
    }

    @Test
    public void testHandleTypePropertyValue_DeserializeWhenTokenAndBeanExist() throws Exception {
        builder.addExternal(property, typeDeserializer);
        ExternalTypeHandler handler = builder.build();
        ExternalTypeHandler startedHandler = handler.start();

        // จำลองสถานการณ์ให้มี Token อยู่ก่อนแล้วผ่าน handlePropertyValue
        when(parser.getCurrentToken()).thenReturn(JsonToken.VALUE_STRING);
        when(parser.getText()).thenReturn("myTypeId");

        // จำลองการใส่ Token เข้าไปใน index 0 ก่อน
        boolean firstHandle = startedHandler.handlePropertyValue(parser, ctxt, "valueProp", new Object());
        assertTrue(firstHandle);

        // ตอนนี้ _tokens[0] จะไม่เป็น null แล้ว เรียก handleTypePropertyValue ซ้ำเพื่อให้เข้าเงื่อนไข canDeserialize = true
        boolean handled = startedHandler.handleTypePropertyValue(parser, ctxt, "typeProp", new Object());
        assertTrue(handled);
    }

    @Test
    public void testHandlePropertyValue_TypePropertyBranch() throws Exception {
        builder.addExternal(property, typeDeserializer);
        ExternalTypeHandler handler = builder.build();
        ExternalTypeHandler startedHandler = handler.start();

        when(parser.getText()).thenReturn("someType");

        boolean handled = startedHandler.handlePropertyValue(parser, ctxt, "typeProp", null);
        assertTrue(handled);
    }

    @Test
    public void testHandlePropertyValue_ValuePropertyBranch() throws Exception {
        builder.addExternal(property, typeDeserializer);
        ExternalTypeHandler handler = builder.build();
        ExternalTypeHandler startedHandler = handler.start();

        // จำลองการอ่าน Value ปกติ
        boolean handled = startedHandler.handlePropertyValue(parser, ctxt, "valueProp", null);
        assertTrue(handled);
    }

    @Test(expected = JsonMappingException.class)
    public void testComplete_MissingTypeAndPropertyThrowsException() throws Exception {
        builder.addExternal(property, typeDeserializer);
        ExternalTypeHandler handler = builder.build().start();

        // ไม่มีทั้ง typeId และ tokens, แต่ถ้ามี tokens แบบ scalar แล้วไม่มี default type จะพ่น Exception
        // จำลอง Token เป็น Scalar แต่ไม่มี Default Type
        TokenBuffer tb = new TokenBuffer(parser, false);
        tb.writeString("test");
        
        // เราสามารถทดสอบกรณีที่ typeId != null แต่ _tokens[i] == null เพื่อให้เข้าเงื่อนไขโยน exception อีกแบบได้เช่นกัน
        // หรือบังคับโยน Missing external type id property ผ่าน complete
        JavaType mockType = mock(JavaType.class);
        when(property.getType()).thenReturn(mockType);
        when(typeDeserializer.getDefaultImpl()).thenReturn(null);
        when(typeDeserializer.getTypeIdResolver()).thenReturn(typeIdResolver);

        // จำลองให้ _tokens มีค่าเป็น Scalar
        // ใช้ reflection หรือจำลอง flow ผ่าน handlePropertyValue เพื่อใส่ Token
        when(parser.getCurrentToken()).thenReturn(JsonToken.VALUE_STRING);
        handler.handlePropertyValue(parser, ctxt, "valueProp", new Object());

        handler.complete(parser, ctxt, new Object());
    }

    @Test(expected = JsonMappingException.class)
    public void testComplete_MissingPropertyForTypeIdThrowsException() throws Exception {
        builder.addExternal(property, typeDeserializer);
        ExternalTypeHandler handler = builder.build().start();

        // ใส่ typeId เข้าไป แต่ไม่มี tokens (_tokens[i] == null)
        handler.handleTypePropertyValue(parser, ctxt, "typeProp", new Object());

        handler.complete(parser, ctxt, new Object());
    }
}