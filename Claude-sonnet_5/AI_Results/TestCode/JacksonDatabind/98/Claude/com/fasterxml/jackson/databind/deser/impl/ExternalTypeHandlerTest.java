package com.fasterxml.jackson.databind.deser.impl;

import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Date;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.deser.SettableBeanProperty;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.jsontype.TypeIdResolver;
import com.fasterxml.jackson.databind.module.SimpleModule;

public class ExternalTypeHandlerTest
{
    private ObjectMapper mapper;
    private DeserializationContext ctxt;

    @Before
    public void setUp() throws IOException {
        mapper = new ObjectMapper();
        ctxt = captureContext(mapper);
    }

    // ---------------------------------------------------------------
    // Helpers
    // ---------------------------------------------------------------

    /** Probe class + custom deserializer used only to obtain a REAL, fully
     * configured DeserializationContext instance, so we don't need to guess
     * internal behavior of TokenBuffer / DeserializationContext. */
    static class Probe {}

    private DeserializationContext captureContext(ObjectMapper m) throws IOException {
        final DeserializationContext[] holder = new DeserializationContext[1];
        SimpleModule module = new SimpleModule();
        module.addDeserializer(Probe.class, new JsonDeserializer<Probe>() {
            @Override
            public Probe deserialize(JsonParser p, DeserializationContext c) throws IOException {
                holder[0] = c;
                p.skipChildren();
                return new Probe();
            }
        });
        m.registerModule(module);
        m.readValue("{}", Probe.class);
        return holder[0];
    }

    private JsonParser parser(ObjectMapper m, String json) throws IOException {
        JsonParser p = m.getFactory().createParser(json);
        p.nextToken();
        return p;
    }

    private ExternalTypeHandler buildHandler(ObjectMapper m,
            SettableBeanProperty prop, TypeDeserializer typeDeser) {
        JavaType beanType = m.getTypeFactory().constructType(Object.class);
        ExternalTypeHandler.Builder b = ExternalTypeHandler.builder(beanType);
        b.addExternal(prop, typeDeser);
        BeanPropertyMap map = mock(BeanPropertyMap.class);
        when(map.find(anyString())).thenReturn(null);
        return b.build(map).start();
    }

    private ExternalTypeHandler buildHandlerTwoProps(ObjectMapper m,
            SettableBeanProperty prop1, TypeDeserializer typeDeser1,
            SettableBeanProperty prop2, TypeDeserializer typeDeser2) {
        JavaType beanType = m.getTypeFactory().constructType(Object.class);
        ExternalTypeHandler.Builder b = ExternalTypeHandler.builder(beanType);
        b.addExternal(prop1, typeDeser1);
        b.addExternal(prop2, typeDeser2);
        BeanPropertyMap map = mock(BeanPropertyMap.class);
        when(map.find(anyString())).thenReturn(null);
        return b.build(map).start();
    }

    private String[] typeIdsOf(ExternalTypeHandler h) throws Exception {
        Field f = ExternalTypeHandler.class.getDeclaredField("_typeIds");
        f.setAccessible(true);
        return (String[]) f.get(h);
    }

    private Object[] tokensOf(ExternalTypeHandler h) throws Exception {
        Field f = ExternalTypeHandler.class.getDeclaredField("_tokens");
        f.setAccessible(true);
        return (Object[]) f.get(h);
    }

    // ---------------------------------------------------------------
    // handleTypePropertyValue()
    // ---------------------------------------------------------------

    @Test
    public void handleTypePropertyValue_unknownProperty_returnsFalse() throws Exception {
        SettableBeanProperty prop = mock(SettableBeanProperty.class);
        when(prop.getName()).thenReturn("value");
        TypeDeserializer typeDeser = mock(TypeDeserializer.class);
        when(typeDeser.getPropertyName()).thenReturn("type");

        ExternalTypeHandler handler = buildHandler(mapper, prop, typeDeser);

        boolean result = handler.handleTypePropertyValue(
                parser(mapper, "\"whatever\""), ctxt, "noSuchProp", new Object());

        assertFalse(result);
    }

    @Test
    public void handleTypePropertyValue_propNameNotTypeName_returnsFalse() throws Exception {
        // "value" resolves to the same index, but is NOT the external type property name
        SettableBeanProperty prop = mock(SettableBeanProperty.class);
        when(prop.getName()).thenReturn("value");
        TypeDeserializer typeDeser = mock(TypeDeserializer.class);
        when(typeDeser.getPropertyName()).thenReturn("type");

        ExternalTypeHandler handler = buildHandler(mapper, prop, typeDeser);

        boolean result = handler.handleTypePropertyValue(
                parser(mapper, "\"anyTypeText\""), ctxt, "value", new Object());

        assertFalse(result);
    }

    @Test
    public void handleTypePropertyValue_beanNull_storesTypeIdOnly() throws Exception {
        SettableBeanProperty prop = mock(SettableBeanProperty.class);
        when(prop.getName()).thenReturn("value");
        TypeDeserializer typeDeser = mock(TypeDeserializer.class);
        when(typeDeser.getPropertyName()).thenReturn("type");

        ExternalTypeHandler handler = buildHandler(mapper, prop, typeDeser);

        boolean result = handler.handleTypePropertyValue(
                parser(mapper, "\"myType\""), ctxt, "type", null);

        assertTrue(result);
        assertEquals("myType", typeIdsOf(handler)[0]);
        assertNull(tokensOf(handler)[0]);
        verify(prop, never()).deserializeAndSet(any(JsonParser.class), any(DeserializationContext.class), any());
    }

    @Test
    public void handleTypePropertyValue_tokenNotBuffered_storesTypeIdOnly() throws Exception {
        SettableBeanProperty prop = mock(SettableBeanProperty.class);
        when(prop.getName()).thenReturn("value");
        TypeDeserializer typeDeser = mock(TypeDeserializer.class);
        when(typeDeser.getPropertyName()).thenReturn("type");

        ExternalTypeHandler handler = buildHandler(mapper, prop, typeDeser);

        boolean result = handler.handleTypePropertyValue(
                parser(mapper, "\"myType\""), ctxt, "type", new Object());

        assertTrue(result);
        assertEquals("myType", typeIdsOf(handler)[0]);
        verify(prop, never()).deserializeAndSet(any(JsonParser.class), any(DeserializationContext.class), any());
    }

    @Test
    public void handleTypePropertyValue_canDeserialize_invokesDeserializeAndSet() throws Exception {
        SettableBeanProperty prop = mock(SettableBeanProperty.class);
        when(prop.getName()).thenReturn("value");
        TypeDeserializer typeDeser = mock(TypeDeserializer.class);
        when(typeDeser.getPropertyName()).thenReturn("type");

        ExternalTypeHandler handler = buildHandler(mapper, prop, typeDeser);
        Object bean = new Object();

        handler.handlePropertyValue(parser(mapper, "123"), ctxt, "value", null);
        assertNotNull(tokensOf(handler)[0]);

        boolean result = handler.handleTypePropertyValue(
                parser(mapper, "\"myType\""), ctxt, "type", bean);

        assertTrue(result);
        verify(prop).deserializeAndSet(any(JsonParser.class), eq(ctxt), eq(bean));
        assertNull(tokensOf(handler)[0]);
    }

    @Test
    public void handleTypePropertyValue_listAllFalse_returnsFalse() throws Exception {
        SettableBeanProperty prop1 = mock(SettableBeanProperty.class);
        when(prop1.getName()).thenReturn("dup");
        TypeDeserializer typeDeser1 = mock(TypeDeserializer.class);
        when(typeDeser1.getPropertyName()).thenReturn("typeA");

        SettableBeanProperty prop2 = mock(SettableBeanProperty.class);
        when(prop2.getName()).thenReturn("dup");
        TypeDeserializer typeDeser2 = mock(TypeDeserializer.class);
        when(typeDeser2.getPropertyName()).thenReturn("typeB");

        ExternalTypeHandler handler = buildHandlerTwoProps(mapper, prop1, typeDeser1, prop2, typeDeser2);

        boolean result = handler.handleTypePropertyValue(
                parser(mapper, "\"someText\""), ctxt, "dup", new Object());

        assertFalse(result);
    }

    @Test
    public void handleTypePropertyValue_listMixed_oneMatchesOneDoesNot() throws Exception {
        SettableBeanProperty prop1 = mock(SettableBeanProperty.class);
        when(prop1.getName()).thenReturn("shared");
        TypeDeserializer typeDeser1 = mock(TypeDeserializer.class);
        when(typeDeser1.getPropertyName()).thenReturn("typeX");

        SettableBeanProperty prop2 = mock(SettableBeanProperty.class);
        when(prop2.getName()).thenReturn("other");
        TypeDeserializer typeDeser2 = mock(TypeDeserializer.class);
        when(typeDeser2.getPropertyName()).thenReturn("shared");

        ExternalTypeHandler handler = buildHandlerTwoProps(mapper, prop1, typeDeser1, prop2, typeDeser2);

        boolean result = handler.handleTypePropertyValue(
                parser(mapper, "\"theTypeId\""), ctxt, "shared", null);

        assertTrue(result);
        assertNull(typeIdsOf(handler)[0]);
        assertEquals("theTypeId", typeIdsOf(handler)[1]);
    }

    // ---------------------------------------------------------------
    // handlePropertyValue()
    // ---------------------------------------------------------------

    @Test
    public void handlePropertyValue_unknownProperty_returnsFalse() throws Exception {
        SettableBeanProperty prop = mock(SettableBeanProperty.class);
        when(prop.getName()).thenReturn("value");
        TypeDeserializer typeDeser = mock(TypeDeserializer.class);
        when(typeDeser.getPropertyName()).thenReturn("type");

        ExternalTypeHandler handler = buildHandler(mapper, prop, typeDeser);

        boolean result = handler.handlePropertyValue(parser(mapper, "123"), ctxt, "noSuch", new Object());
        assertFalse(result);
    }

    @Test
    public void handlePropertyValue_typeProperty_beanNull_storesTypeId() throws Exception {
        SettableBeanProperty prop = mock(SettableBeanProperty.class);
        when(prop.getName()).thenReturn("value");
        TypeDeserializer typeDeser = mock(TypeDeserializer.class);
        when(typeDeser.getPropertyName()).thenReturn("type");

        ExternalTypeHandler handler = buildHandler(mapper, prop, typeDeser);

        boolean result = handler.handlePropertyValue(parser(mapper, "\"myType\""), ctxt, "type", null);

        assertTrue(result);
        assertEquals("myType", typeIdsOf(handler)[0]);
        verify(prop, never()).deserializeAndSet(any(JsonParser.class), any(DeserializationContext.class), any());
    }

    @Test
    public void handlePropertyValue_typeProperty_canDeserialize_invokesDeserializeAndSet() throws Exception {
        SettableBeanProperty prop = mock(SettableBeanProperty.class);
        when(prop.getName()).thenReturn("value");
        TypeDeserializer typeDeser = mock(TypeDeserializer.class);
        when(typeDeser.getPropertyName()).thenReturn("type");

        ExternalTypeHandler handler = buildHandler(mapper, prop, typeDeser);
        Object bean = new Object();

        handler.handlePropertyValue(parser(mapper, "\"payload\""), ctxt, "value", null);

        boolean result = handler.handlePropertyValue(parser(mapper, "\"myType\""), ctxt, "type", bean);

        assertTrue(result);
        verify(prop).deserializeAndSet(any(JsonParser.class), eq(ctxt), eq(bean));
        assertNull(tokensOf(handler)[0]);
        assertNull(typeIdsOf(handler)[0]);
    }

    @Test
    public void handlePropertyValue_valueProperty_beanNull_buffersToken() throws Exception {
        SettableBeanProperty prop = mock(SettableBeanProperty.class);
        when(prop.getName()).thenReturn("value");
        TypeDeserializer typeDeser = mock(TypeDeserializer.class);
        when(typeDeser.getPropertyName()).thenReturn("type");

        ExternalTypeHandler handler = buildHandler(mapper, prop, typeDeser);

        boolean result = handler.handlePropertyValue(parser(mapper, "\"payload\""), ctxt, "value", null);

        assertTrue(result);
        assertNotNull(tokensOf(handler)[0]);
        verify(prop, never()).deserializeAndSet(any(JsonParser.class), any(DeserializationContext.class), any());
    }

    @Test
    public void handlePropertyValue_valueProperty_canDeserialize_invokesDeserializeAndSet() throws Exception {
        SettableBeanProperty prop = mock(SettableBeanProperty.class);
        when(prop.getName()).thenReturn("value");
        TypeDeserializer typeDeser = mock(TypeDeserializer.class);
        when(typeDeser.getPropertyName()).thenReturn("type");

        ExternalTypeHandler handler = buildHandler(mapper, prop, typeDeser);
        Object bean = new Object();

        handler.handlePropertyValue(parser(mapper, "\"myType\""), ctxt, "type", null);

        boolean result = handler.handlePropertyValue(parser(mapper, "\"payload\""), ctxt, "value", bean);

        assertTrue(result);
        verify(prop).deserializeAndSet(any(JsonParser.class), eq(ctxt), eq(bean));
        assertNull(tokensOf(handler)[0]);
    }

    @Test
    public void handlePropertyValue_listTypeBranch_updatesAllIndices() throws Exception {
        SettableBeanProperty prop1 = mock(SettableBeanProperty.class);
        when(prop1.getName()).thenReturn("val1");
        TypeDeserializer typeDeser1 = mock(TypeDeserializer.class);
        when(typeDeser1.getPropertyName()).thenReturn("sharedType");

        SettableBeanProperty prop2 = mock(SettableBeanProperty.class);
        when(prop2.getName()).thenReturn("val2");
        TypeDeserializer typeDeser2 = mock(TypeDeserializer.class);
        when(typeDeser2.getPropertyName()).thenReturn("sharedType");

        ExternalTypeHandler handler = buildHandlerTwoProps(mapper, prop1, typeDeser1, prop2, typeDeser2);

        boolean result = handler.handlePropertyValue(parser(mapper, "\"typeVal\""), ctxt, "sharedType", null);

        assertTrue(result);
        assertEquals("typeVal", typeIdsOf(handler)[0]);
        assertEquals("typeVal", typeIdsOf(handler)[1]);
    }

    @Test
    public void handlePropertyValue_listValueBranch_updatesAllIndices() throws Exception {
        SettableBeanProperty prop1 = mock(SettableBeanProperty.class);
        when(prop1.getName()).thenReturn("sharedValue");
        TypeDeserializer typeDeser1 = mock(TypeDeserializer.class);
        when(typeDeser1.getPropertyName()).thenReturn("typeA");

        SettableBeanProperty prop2 = mock(SettableBeanProperty.class);
        when(prop2.getName()).thenReturn("sharedValue");
        TypeDeserializer typeDeser2 = mock(TypeDeserializer.class);
        when(typeDeser2.getPropertyName()).thenReturn("typeB");

        ExternalTypeHandler handler = buildHandlerTwoProps(mapper, prop1, typeDeser1, prop2, typeDeser2);

        boolean result = handler.handlePropertyValue(parser(mapper, "\"payload\""), ctxt, "sharedValue", null);

        assertTrue(result);
        assertNotNull(tokensOf(handler)[0]);
        assertNotNull(tokensOf(handler)[1]);
        assertSame(tokensOf(handler)[0], tokensOf(handler)[1]);
    }

    @Test
    public void deserializeAndSet_nullBufferedValue_setsPropertyNullDirectly() throws Exception {
        SettableBeanProperty prop = mock(SettableBeanProperty.class);
        when(prop.getName()).thenReturn("value");
        TypeDeserializer typeDeser = mock(TypeDeserializer.class);
        when(typeDeser.getPropertyName()).thenReturn("type");

        ExternalTypeHandler handler = buildHandler(mapper, prop, typeDeser);
        Object bean = new Object();

        handler.handlePropertyValue(parser(mapper, "\"myType\""), ctxt, "type", null);

        boolean result = handler.handlePropertyValue(parser(mapper, "null"), ctxt, "value", bean);

        assertTrue(result);
        verify(prop).set(eq(bean), isNull());
        verify(prop, never()).deserializeAndSet(any(JsonParser.class), any(DeserializationContext.class), any());
    }

    // ---------------------------------------------------------------
    // complete(JsonParser, ctxt, bean)
    // ---------------------------------------------------------------

    @Test
    public void complete_skipsWhenNoTypeIdAndNoToken() throws Exception {
        SettableBeanProperty prop = mock(SettableBeanProperty.class);
        when(prop.getName()).thenReturn("value");
        TypeDeserializer typeDeser = mock(TypeDeserializer.class);
        when(typeDeser.getPropertyName()).thenReturn("type");

        ExternalTypeHandler handler = buildHandler(mapper, prop, typeDeser);
        Object bean = new Object();

        Object result = handler.complete(parser(mapper, "{}"), ctxt, bean);

        assertSame(bean, result);
        verify(prop, never()).set(any(), any());
        verify(prop, never()).deserializeAndSet(any(JsonParser.class), any(DeserializationContext.class), any());
    }

    @Test
    public void complete_naturalTypeMatch_setsPropertyDirectlyWithoutTypeId() throws Exception {
        SettableBeanProperty prop = mock(SettableBeanProperty.class);
        when(prop.getName()).thenReturn("value");
        JavaType stringType = mock(JavaType.class);
        when(stringType.getRawClass()).thenReturn(String.class);
        when(prop.getType()).thenReturn(stringType);

        TypeDeserializer typeDeser = mock(TypeDeserializer.class);
        when(typeDeser.getPropertyName()).thenReturn("type");

        ExternalTypeHandler handler = buildHandler(mapper, prop, typeDeser);
        Object bean = new Object();

        handler.handlePropertyValue(parser(mapper, "\"stringVal\""), ctxt, "value", null);

        Object result = handler.complete(parser(mapper, "{}"), ctxt, bean);

        assertSame(bean, result);
        // NOTE: อ้างอิงพฤติกรรม "natural type" ตาม doc comment [databind#118] ในซอร์ส
        // (ไม่มี implementation ของ TypeDeserializer.deserializeIfNatural ให้ดูตรง ๆ)
        verify(prop).set(eq(bean), eq("stringVal"));
        verify(prop, never()).deserializeAndSet(any(JsonParser.class), any(DeserializationContext.class), any());
    }

    @Test
    public void complete_naturalTypeNoMatch_hasDefaultType_usesDefaultTypeIdAndDeserializes() throws Exception {
        SettableBeanProperty prop = mock(SettableBeanProperty.class);
        when(prop.getName()).thenReturn("value");
        JavaType oddType = mock(JavaType.class);
        when(oddType.getRawClass()).thenReturn(Date.class); // ไม่ match natural-type ใด ๆ
        when(prop.getType()).thenReturn(oddType);

        TypeDeserializer typeDeser = mock(TypeDeserializer.class);
        when(typeDeser.getPropertyName()).thenReturn("type");
        when(typeDeser.getDefaultImpl()).thenReturn(Integer.class);
        TypeIdResolver idResolver = mock(TypeIdResolver.class);
        when(idResolver.idFromValueAndType(isNull(), eq((Class) Integer.class))).thenReturn("defaultTypeId");
        when(typeDeser.getTypeIdResolver()).thenReturn(idResolver);

        ExternalTypeHandler handler = buildHandler(mapper, prop, typeDeser);
        Object bean = new Object();

        handler.handlePropertyValue(parser(mapper, "true"), ctxt, "value", null);

        Object result = handler.complete(parser(mapper, "{}"), ctxt, bean);

        assertSame(bean, result);
        verify(prop).deserializeAndSet(any(JsonParser.class), eq(ctxt), eq(bean));
        verify(prop, never()).set(any(), any());
    }

    @Test
    public void complete_naturalTypeNoMatch_noDefaultType_throwsInputMismatch() throws Exception {
        SettableBeanProperty prop = mock(SettableBeanProperty.class);
        when(prop.getName()).thenReturn("value");
        JavaType oddType = mock(JavaType.class);
        when(oddType.getRawClass()).thenReturn(Date.class);
        when(prop.getType()).thenReturn(oddType);

        TypeDeserializer typeDeser = mock(TypeDeserializer.class);
        when(typeDeser.getPropertyName()).thenReturn("type");
        when(typeDeser.getDefaultImpl()).thenReturn(null);

        ExternalTypeHandler handler = buildHandler(mapper, prop, typeDeser);
        Object bean = new Object();

        handler.handlePropertyValue(parser(mapper, "true"), ctxt, "value", null);

        try {
            handler.complete(parser(mapper, "{}"), ctxt, bean);
            fail("Expected IOException from ctxt.reportInputMismatch(...)");
        } catch (IOException expected) {
            // exact subtype not defined in source under test
        }
    }

    @Test
    public void complete_typePresent_tokenMissing_requiredProperty_throws() throws Exception {
        SettableBeanProperty prop = mock(SettableBeanProperty.class);
        when(prop.getName()).thenReturn("value");
        when(prop.isRequired()).thenReturn(true);
        TypeDeserializer typeDeser = mock(TypeDeserializer.class);
        when(typeDeser.getPropertyName()).thenReturn("type");

        ExternalTypeHandler handler = buildHandler(mapper, prop, typeDeser);
        Object bean = new Object();

        handler.handlePropertyValue(parser(mapper, "\"myType\""), ctxt, "type", null);

        try {
            handler.complete(parser(mapper, "{}"), ctxt, bean);
            fail("Expected exception: required property's value never supplied");
        } catch (IOException expected) {
            // ok
        }
    }

    @Test
    public void complete_typePresent_tokenMissing_notRequired_featureDisabled_returnsBeanEarly() throws Exception {
        ObjectMapper localMapper = new ObjectMapper();
        localMapper.configure(DeserializationFeature.FAIL_ON_MISSING_EXTERNAL_TYPE_ID_PROPERTY, false);
        DeserializationContext localCtxt = captureContext(localMapper);

        SettableBeanProperty prop = mock(SettableBeanProperty.class);
        when(prop.getName()).thenReturn("value");
        when(prop.isRequired()).thenReturn(false);
        TypeDeserializer typeDeser = mock(TypeDeserializer.class);
        when(typeDeser.getPropertyName()).thenReturn("type");

        ExternalTypeHandler handler = buildHandler(localMapper, prop, typeDeser);
        Object bean = new Object();

        handler.handlePropertyValue(parser(localMapper, "\"myType\""), localCtxt, "type", null);

        Object result = handler.complete(parser(localMapper, "{}"), localCtxt, bean);

        assertSame(bean, result);
        verify(prop, never()).deserializeAndSet(any(JsonParser.class), any(DeserializationContext.class), any());
    }

    @Test
    public void complete_typePresent_tokenMissing_featureEnabled_throwsEvenIfNotRequired() throws Exception {
        ObjectMapper localMapper = new ObjectMapper();
        localMapper.configure(DeserializationFeature.FAIL_ON_MISSING_EXTERNAL_TYPE_ID_PROPERTY, true);
        DeserializationContext localCtxt = captureContext(localMapper);

        SettableBeanProperty prop = mock(SettableBeanProperty.class);
        when(prop.getName()).thenReturn("value");
        when(prop.isRequired()).thenReturn(false);
        TypeDeserializer typeDeser = mock(TypeDeserializer.class);
        when(typeDeser.getPropertyName()).thenReturn("type");

        ExternalTypeHandler handler = buildHandler(localMapper, prop, typeDeser);
        Object bean = new Object();

        handler.handlePropertyValue(parser(localMapper, "\"myType\""), localCtxt, "type", null);

        try {
            handler.complete(parser(localMapper, "{}"), localCtxt, bean);
            fail("Expected exception due to FAIL_ON_MISSING_EXTERNAL_TYPE_ID_PROPERTY=true");
        } catch (IOException expected) {
            // ok
        }
    }

    @Test
    public void complete_normalPath_bothPresent_invokesDeserializeAndSet() throws Exception {
        SettableBeanProperty prop = mock(SettableBeanProperty.class);
        when(prop.getName()).thenReturn("value");
        TypeDeserializer typeDeser = mock(TypeDeserializer.class);
        when(typeDeser.getPropertyName()).thenReturn("type");

        ExternalTypeHandler handler = buildHandler(mapper, prop, typeDeser);
        Object bean = new Object();

        handler.handlePropertyValue(parser(mapper, "\"myType\""), ctxt, "type", null);
        handler.handlePropertyValue(parser(mapper, "\"payload\""), ctxt, "value", null);

        Object result = handler.complete(parser(mapper, "{}"), ctxt, bean);

        assertSame(bean, result);
        verify(prop).deserializeAndSet(any(JsonParser.class), eq(ctxt), eq(bean));
    }

    // ---------------------------------------------------------------
    // complete(JsonParser, ctxt, PropertyValueBuffer, PropertyBasedCreator)
    // ---------------------------------------------------------------

    @Test
    public void completeWithCreator_buildsBeanAndAssignsCreatorParameter() throws Exception {
        SettableBeanProperty prop = mock(SettableBeanProperty.class);
        when(prop.getName()).thenReturn("value");
        JavaType strType = mock(JavaType.class);
        when(strType.getRawClass()).thenReturn(String.class);
        when(prop.getType()).thenReturn(strType);
        when(prop.getCreatorIndex()).thenReturn(0);
        when(prop.deserialize(any(JsonParser.class), eq(ctxt))).thenReturn("payloadValue");

        TypeDeserializer typeDeser = mock(TypeDeserializer.class);
        when(typeDeser.getPropertyName()).thenReturn("type");
        when(typeDeser.getDefaultImpl()).thenReturn(null);

        ExternalTypeHandler handler = buildHandler(mapper, prop, typeDeser);

        handler.handlePropertyValue(parser(mapper, "\"payloadValue\""), ctxt, "value", null);
        handler.handlePropertyValue(parser(mapper, "\"myType\""), ctxt, "type", null);

        PropertyValueBuffer buffer = mock(PropertyValueBuffer.class);
        PropertyBasedCreator creator = mock(PropertyBasedCreator.class);
        Object builtBean = new Object();
        when(creator.build(eq(ctxt), eq(buffer))).thenReturn(builtBean);

        Object result = handler.complete(parser(mapper, "{}"), ctxt, buffer, creator);

        assertSame(builtBean, result);
        verify(buffer).assignParameter(eq(prop), eq((Object) "payloadValue"));
        verify(creator).build(eq(ctxt), eq(buffer));
        verify(prop, never()).set(any(), any()); // creatorIndex >= 0 -> skip post-loop set
    }

    @Test
    public void completeWithCreator_skipsPropertyWithNoTypeIdAndNoToken() throws Exception {
        SettableBeanProperty prop = mock(SettableBeanProperty.class);
        when(prop.getName()).thenReturn("value");
        when(prop.getCreatorIndex()).thenReturn(0);
        TypeDeserializer typeDeser = mock(TypeDeserializer.class);
        when(typeDeser.getPropertyName()).thenReturn("type");

        ExternalTypeHandler handler = buildHandler(mapper, prop, typeDeser);

        PropertyValueBuffer buffer = mock(PropertyValueBuffer.class);
        PropertyBasedCreator creator = mock(PropertyBasedCreator.class);
        Object builtBean = new Object();
        when(creator.build(eq(ctxt), eq(buffer))).thenReturn(builtBean);

        Object result = handler.complete(parser(mapper, "{}"), ctxt, buffer, creator);

        assertSame(builtBean, result);
        verify(buffer, never()).assignParameter(any(SettableBeanProperty.class), any());
        verify(prop, never()).set(any(), any());
    }

    @Test
    public void completeWithCreator_missingTypeId_noDefaultType_throws() throws Exception {
        SettableBeanProperty prop = mock(SettableBeanProperty.class);
        when(prop.getName()).thenReturn("value");
        TypeDeserializer typeDeser = mock(TypeDeserializer.class);
        when(typeDeser.getPropertyName()).thenReturn("type");
        when(typeDeser.getDefaultImpl()).thenReturn(null);

        ExternalTypeHandler handler = buildHandler(mapper, prop, typeDeser);

        handler.handlePropertyValue(parser(mapper, "\"payload\""), ctxt, "value", null);

        PropertyValueBuffer buffer = mock(PropertyValueBuffer.class);
        PropertyBasedCreator creator = mock(P