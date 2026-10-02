package com.fasterxml.jackson.databind.deser.impl;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import java.io.IOException;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.deser.SettableBeanProperty;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.jsontype.TypeIdResolver;
import com.fasterxml.jackson.databind.type.TypeFactory;

// หมายเหตุ: ไม่มี import ของ ExternalTypeHandler เพราะ test class นี้อยู่ใน
// package เดียวกันกับคลาสเป้าหมาย (com.fasterxml.jackson.databind.deser.impl)
// ซึ่งจำเป็นเพื่อเข้าถึง overload complete(..., PropertyValueBuffer, PropertyBasedCreator)

@RunWith(PowerMockRunner.class)
@PrepareForTest(TypeDeserializer.class)
public class ExternalTypeHandlerTest {

    private static final JsonFactory JSON_F = new JsonFactory();

    private SettableBeanProperty property;
    private TypeDeserializer typeDeser;
    private DeserializationContext ctxt;

    private void setUpMocks() {
        property = mock(SettableBeanProperty.class);
        when(property.getName()).thenReturn("value");
        when(property.getCreatorIndex()).thenReturn(-1);
        JavaType type = TypeFactory.defaultInstance().constructType(Object.class);
        when(property.getType()).thenReturn(type);

        typeDeser = mock(TypeDeserializer.class);
        when(typeDeser.getPropertyName()).thenReturn("type");
        when(typeDeser.getDefaultImpl()).thenReturn(null);

        ctxt = mock(DeserializationContext.class);
    }

    private ExternalTypeHandler newHandler() {
        ExternalTypeHandler.Builder b = new ExternalTypeHandler.Builder();
        b.addExternal(property, typeDeser);
        ExternalTypeHandler blueprint = b.build();
        return blueprint.start();
    }

    private JsonParser parserAt(String json) throws IOException {
        JsonParser p = JSON_F.createParser(json);
        p.nextToken();
        return p;
    }

    // =========================================================
    // handleTypePropertyValue
    // =========================================================

    @Test
    public void testHandleTypePropertyValue_unknownProperty_returnsFalse() throws IOException {
        setUpMocks();
        ExternalTypeHandler handler = newHandler();
        JsonParser p = parserAt("\"typeA\"");
        assertFalse(handler.handleTypePropertyValue(p, ctxt, "nosuch", new Object()));
    }

    @Test
    public void testHandleTypePropertyValue_propNameIsPropertyNotTypeName_returnsFalse() throws IOException {
        setUpMocks();
        ExternalTypeHandler handler = newHandler();
        JsonParser p = parserAt("\"typeA\"");
        // "value" is indexed (bean-property name) แต่ไม่ใช่ typePropertyName -> hasTypePropertyName() == false
        assertFalse(handler.handleTypePropertyValue(p, ctxt, "value", new Object()));
    }

    @Test
    public void testHandleTypePropertyValue_beanNull_storesTypeId_returnsTrue() throws IOException {
        setUpMocks();
        ExternalTypeHandler handler = newHandler();
        JsonParser p = parserAt("\"typeA\"");
        assertTrue(handler.handleTypePropertyValue(p, ctxt, "type", null));
        verify(property, never()).deserializeAndSet(any(JsonParser.class), any(DeserializationContext.class), any());
    }

    @Test
    public void testHandleTypePropertyValue_beanNonNull_tokensNull_storesTypeId_returnsTrue() throws IOException {
        setUpMocks();
        ExternalTypeHandler handler = newHandler();
        JsonParser p = parserAt("\"typeA\"");
        assertTrue(handler.handleTypePropertyValue(p, ctxt, "type", new Object()));
        verify(property, never()).deserializeAndSet(any(JsonParser.class), any(DeserializationContext.class), any());
    }

    @Test
    public void testHandleTypePropertyValue_beanNonNull_tokensPresent_deserializesImmediately() throws IOException {
        setUpMocks();
        ExternalTypeHandler handler = newHandler();
        Object bean = new Object();

        JsonParser pValue = parserAt("\"payload\"");
        assertTrue(handler.handlePropertyValue(pValue, ctxt, "value", null));

        JsonParser pType = parserAt("\"typeA\"");
        assertTrue(handler.handleTypePropertyValue(pType, ctxt, "type", bean));

        verify(property, times(1)).deserializeAndSet(any(JsonParser.class), eq(ctxt), eq(bean));
    }

    // =========================================================
    // handlePropertyValue
    // =========================================================

    @Test
    public void testHandlePropertyValue_unknownProperty_returnsFalse() throws IOException {
        setUpMocks();
        ExternalTypeHandler handler = newHandler();
        JsonParser p = parserAt("\"x\"");
        assertFalse(handler.handlePropertyValue(p, ctxt, "nosuch", new Object()));
    }

    @Test
    public void testHandlePropertyValue_typeProperty_beanNull_storesOnly() throws IOException {
        setUpMocks();
        ExternalTypeHandler handler = newHandler();
        JsonParser p = parserAt("\"typeA\"");
        assertTrue(handler.handlePropertyValue(p, ctxt, "type", null));
        verify(property, never()).deserializeAndSet(any(JsonParser.class), any(DeserializationContext.class), any());
    }

    @Test
    public void testHandlePropertyValue_typeProperty_beanNonNull_tokensPresent_deserializes() throws IOException {
        setUpMocks();
        ExternalTypeHandler handler = newHandler();
        Object bean = new Object();

        JsonParser pValue = parserAt("\"payload\"");
        assertTrue(handler.handlePropertyValue(pValue, ctxt, "value", null));

        JsonParser pType = parserAt("\"typeA\"");
        assertTrue(handler.handlePropertyValue(pType, ctxt, "type", bean));

        verify(property, times(1)).deserializeAndSet(any(JsonParser.class), eq(ctxt), eq(bean));
    }

    @Test
    public void testHandlePropertyValue_valueProperty_beanNull_buffersOnly() throws IOException {
        setUpMocks();
        ExternalTypeHandler handler = newHandler();
        JsonParser p = parserAt("\"payload\"");
        assertTrue(handler.handlePropertyValue(p, ctxt, "value", null));
        verify(property, never()).deserializeAndSet(any(JsonParser.class), any(DeserializationContext.class), any());
    }

    @Test
    public void testHandlePropertyValue_valueProperty_beanNonNull_typeIdPresent_deserializes() throws IOException {
        setUpMocks();
        ExternalTypeHandler handler = newHandler();
        Object bean = new Object();

        JsonParser pType = parserAt("\"typeA\"");
        assertTrue(handler.handlePropertyValue(pType, ctxt, "type", null));

        JsonParser pValue = parserAt("\"payload\"");
        assertTrue(handler.handlePropertyValue(pValue, ctxt, "value", bean));

        verify(property, times(1)).deserializeAndSet(any(JsonParser.class), eq(ctxt), eq(bean));
    }

    @Test
    public void testDeserializeAndSet_nullBufferedToken_callsSetWithNull() throws IOException {
        setUpMocks();
        ExternalTypeHandler handler = newHandler();
        Object bean = new Object();

        JsonParser pValue = parserAt("null");
        assertTrue(handler.handlePropertyValue(pValue, ctxt, "value", null));

        JsonParser pType = parserAt("\"typeA\"");
        assertTrue(handler.handleTypePropertyValue(pType, ctxt, "type", bean));

        verify(property, times(1)).set(eq(bean), isNull());
        verify(property, never()).deserializeAndSet(any(JsonParser.class), any(DeserializationContext.class), any());
    }

    // =========================================================
    // complete(p, ctxt, bean)
    // =========================================================

    @Test
    public void testComplete_noProperties_returnsBeanUnchanged() throws IOException {
        setUpMocks();
        ExternalTypeHandler.Builder b = new ExternalTypeHandler.Builder();
        ExternalTypeHandler handler = b.build().start();

        Object bean = new Object();
        Object result = handler.complete(parserAt("{}"), ctxt, bean);
        assertSame(bean, result);
    }

    @Test
    public void testComplete_typeIdNullTokensNull_skipped() throws IOException {
        setUpMocks();
        ExternalTypeHandler handler = newHandler();
        Object bean = new Object();
        Object result = handler.complete(parserAt("{}"), ctxt, bean);
        assertSame(bean, result);
        verify(property, never()).set(any(), any());
        verify(property, never()).deserializeAndSet(any(JsonParser.class), any(DeserializationContext.class), any());
    }

    @Test
    public void testComplete_typeIdNullTokensNonScalar_fallsThroughWithNullTypeId() throws IOException {
        // สาขา: tokens != null แต่ firstToken() ไม่ใช่ scalar (START_OBJECT) -> ข้าม natural-type check
        // แล้ว "หลุด" ไปเรียก _deserializeAndSet ด้วย typeId == null (พฤติกรรมตามซอร์สที่ให้มา)
        setUpMocks();
        ExternalTypeHandler handler = newHandler();
        Object bean = new Object();

        JsonParser pValue = parserAt("{\"a\":1}");
        assertTrue(handler.handlePropertyValue(pValue, ctxt, "value", null));

        handler.complete(parserAt("{}"), ctxt, bean);

        verify(property, times(1)).deserializeAndSet(any(JsonParser.class), eq(ctxt), eq(bean));
    }

    @Test
    public void testComplete_naturalTypeResultNonNull_setsPropertyDirectly() throws IOException {
        setUpMocks();
        PowerMockito.mockStatic(TypeDeserializer.class);
        PowerMockito.when(TypeDeserializer.deserializeIfNatural(
                any(JsonParser.class), any(DeserializationContext.class), any(JavaType.class)))
                .thenReturn("naturalValue");

        ExternalTypeHandler handler = newHandler();
        Object bean = new Object();

        JsonParser pValue = parserAt("\"payload\"");
        assertTrue(handler.handlePropertyValue(pValue, ctxt, "value", null));

        handler.complete(parserAt("{}"), ctxt, bean);

        verify(property, times(1)).set(eq(bean), eq("naturalValue"));
        verify(property, never()).deserializeAndSet(any(JsonParser.class), any(DeserializationContext.class), any());
    }

    @Test(expected = JsonMappingException.class)
    public void testComplete_naturalTypeResultNull_noDefaultType_throws() throws IOException {
        setUpMocks();
        PowerMockito.mockStatic(TypeDeserializer.class);
        PowerMockito.when(TypeDeserializer.deserializeIfNatural(
                any(JsonParser.class), any(DeserializationContext.class), any(JavaType.class)))
                .thenReturn(null);
        when(typeDeser.getDefaultImpl()).thenReturn(null); // hasDefaultType() == false
        doThrow(new JsonMappingException("missing type id"))
                .when(ctxt).reportMappingException(anyString(), any(Object[].class));

        ExternalTypeHandler handler = newHandler();

        JsonParser pValue = parserAt("\"payload\"");
        assertTrue(handler.handlePropertyValue(pValue, ctxt, "value", null));

        handler.complete(parserAt("{}"), ctxt, new Object());
    }

    @Test
    public void testComplete_naturalTypeResultNull_hasDefaultType_usesDefaultTypeId() throws IOException {
        setUpMocks();
        PowerMockito.mockStatic(TypeDeserializer.class);
        PowerMockito.when(TypeDeserializer.deserializeIfNatural(
                any(JsonParser.class), any(DeserializationContext.class), any(JavaType.class)))
                .thenReturn(null);

        TypeIdResolver idResolver = mock(TypeIdResolver.class);
        when(idResolver.idFromValueAndType(isNull(), eq(String.class))).thenReturn("defType");
        when(typeDeser.getDefaultImpl()).thenReturn(String.class); // hasDefaultType() == true
        when(typeDeser.getTypeIdResolver()).thenReturn(idResolver);

        ExternalTypeHandler handler = newHandler();
        Object bean = new Object();

        JsonParser pValue = parserAt("\"payload\"");
        assertTrue(handler.handlePropertyValue(pValue, ctxt, "value", null));

        handler.complete(parserAt("{}"), ctxt, bean);

        verify(property, times(1)).deserializeAndSet(any(JsonParser.class), eq(ctxt), eq(bean));
    }

    @Test(expected = JsonMappingException.class)
    public void testComplete_typeIdPresentTokensNull_throws() throws IOException {
        setUpMocks();
        doThrow(new JsonMappingException("missing property"))
                .when(ctxt).reportMappingException(anyString(), any(Object[].class));

        ExternalTypeHandler handler = newHandler();

        JsonParser pType = parserAt("\"typeA\"");
        assertTrue(handler.handleTypePropertyValue(pType, ctxt, "type", null));

        handler.complete(parserAt("{}"), ctxt, new Object());
    }

    @Test
    public void testComplete_typeIdPresentTokensPresent_deserializesNormally() throws IOException {
        setUpMocks();
        ExternalTypeHandler handler = newHandler();
        Object bean = new Object();

        JsonParser pType = parserAt("\"typeA\"");
        assertTrue(handler.handleTypePropertyValue(pType, ctxt, "type", null));

        JsonParser pValue = parserAt("\"payload\"");
        assertTrue(handler.handlePropertyValue(pValue, ctxt, "value", null));

        handler.complete(parserAt("{}"), ctxt, bean);

        verify(property, times(1)).deserializeAndSet(any(JsonParser.class), eq(ctxt), eq(bean));
    }

    // =========================================================
    // complete(p, ctxt, PropertyValueBuffer, PropertyBasedCreator)
    // =========================================================

    @Test
    public void testCompleteWithCreator_typeIdNullTokensNull_skipped() throws IOException {
        setUpMocks();
        ExternalTypeHandler handler = newHandler();
        PropertyValueBuffer buffer = mock(PropertyValueBuffer.class);
        PropertyBasedCreator creator = mock(PropertyBasedCreator.class);
        Object builtBean = new Object();
        when(creator.build(eq(ctxt), eq(buffer))).thenReturn(builtBean);

        Object result = handler.complete(parserAt("{}"), ctxt, buffer, creator);

        assertSame(builtBean, result);
        verify(property, never()).deserialize(any(JsonParser.class), any(DeserializationContext.class));
        // loop ที่ 3 เซ็ต prop.set(bean, values[i]) แบบไม่มีเงื่อนไข แม้ values[i] จะยังเป็น null
        verify(property, times(1)).set(eq(builtBean), isNull());
    }

    @Test
    public void testCompleteWithCreator_nonCreatorProperty_setAfterBuild() throws IOException {
        setUpMocks();
        when(property.getCreatorIndex()).thenReturn(-1);
        Object deserializedValue = "deserializedVal";
        when(property.deserialize(any(JsonParser.class), eq(ctxt))).thenReturn(deserializedValue);

        ExternalTypeHandler handler = newHandler();

        JsonParser pType = parserAt("\"typeA\"");
        assertTrue(handler.handleTypePropertyValue(pType, ctxt, "type", null));
        JsonParser pValue = parserAt("\"payload\"");
        assertTrue(handler.handlePropertyValue(pValue, ctxt, "value", null));

        PropertyValueBuffer buffer = mock(PropertyValueBuffer.class);
        PropertyBasedCreator creator = mock(PropertyBasedCreator.class);
        Object builtBean = new Object();
        when(creator.build(eq(ctxt), eq(buffer))).thenReturn(builtBean);

        Object result = handler.complete(parserAt("{}"), ctxt, buffer, creator);

        assertSame(builtBean, result);
        verify(property, times(1)).set(eq(builtBean), eq(deserializedValue));
        verify(buffer, never()).assignParameter(any(SettableBeanProperty.class), any());
    }

    @Test
    public void testCompleteWithCreator_creatorProperty_assignsParameter() throws IOException {
        setUpMocks();
        when(property.getCreatorIndex()).thenReturn(0);
        Object deserializedValue = "deserializedVal";
        when(property.deserialize(any(JsonParser.class), eq(ctxt))).thenReturn(deserializedValue);

        ExternalTypeHandler handler = newHandler();

        JsonParser pType = parserAt("\"typeA\"");
        assertTrue(handler.handleTypePropertyValue(pType, ctxt, "type", null));
        JsonParser pValue = parserAt("\"payload\"");
        assertTrue(handler.handlePropertyValue(pValue, ctxt, "value", null));

        PropertyValueBuffer buffer = mock(PropertyValueBuffer.class);
        PropertyBasedCreator creator = mock(PropertyBasedCreator.class);
        Object builtBean = new Object();
        when(creator.build(eq(ctxt), eq(buffer))).thenReturn(builtBean);

        Object result = handler.complete(parserAt("{}"), ctxt, buffer, creator);

        assertSame(builtBean, result);
        verify(buffer, times(1)).assignParameter(eq(property), eq(deserializedValue));
        verify(property, never()).set(any(), any());
    }

    @Test(expected = JsonMappingException.class)
    public void testCompleteWithCreator_missingTypeIdNoDefault_throws() throws IOException {
        setUpMocks();
        when(typeDeser.getDefaultImpl()).thenReturn(null);
        doThrow(new JsonMappingException("missing type id"))
                .when(ctxt).reportMappingException(anyString(), any(Object[].class));

        ExternalTypeHandler handler = newHandler();

        JsonParser pValue = parserAt("\"payload\"");
        assertTrue(handler.handlePropertyValue(pValue, ctxt, "value", null));

        PropertyValueBuffer buffer = mock(PropertyValueBuffer.class);
        PropertyBasedCreator creator = mock(PropertyBasedCreator.class);

        handler.complete(parserAt("{}"), ctxt, buffer, creator);
    }

    @Test(expected = JsonMappingException.class)
    public void testCompleteWithCreator_missingProperty_throws() throws IOException {
        setUpMocks();
        doThrow(new JsonMappingException("missing property"))
                .when(ctxt).reportMappingException(anyString(), any(Object[].class));

        ExternalTypeHandler handler = newHandler();

        JsonParser pType = parserAt("\"typeA\"");
        assertTrue(handler.handleTypePropertyValue(pType, ctxt, "type", null));

        PropertyValueBuffer buffer = mock(PropertyValueBuffer.class);
        PropertyBasedCreator creator = mock(PropertyBasedCreator.class);

        handler.complete(parserAt("{}"), ctxt, buffer, creator);
    }
}
