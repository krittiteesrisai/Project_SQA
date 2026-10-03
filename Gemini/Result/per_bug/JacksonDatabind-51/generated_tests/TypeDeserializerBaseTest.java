package com.fasterxml.jackson.databind.jsontype.impl;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.jsontype.TypeIdResolver;
import com.fasterxml.jackson.databind.type.TypeFactory;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import java.io.IOException;

import static org.junit.Assert.*;
import static org.mockito.Matchers.any;
import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.*;

public class TypeDeserializerBaseTest {

    private DeserializationContext context;
    private TypeIdResolver idResolver;
    private JavaType baseType;
    private ConcreteTypeDeserializer deserializer;
    private JsonParser jsonParser;

    // คลาสลูกคอนกรีตสำหรับการทดสอบ Abstract Class
    private static class ConcreteTypeDeserializer extends TypeDeserializerBase {
        public ConcreteTypeDeserializer(JavaType baseType, TypeIdResolver idRes,
                String typePropertyName, boolean typeIdVisible, JavaType defaultImpl) {
            super(baseType, idRes, typePropertyName, typeIdVisible, defaultImpl);
        }

        protected ConcreteTypeDeserializer(TypeDeserializerBase src, BeanProperty property) {
            super(src, property);
        }

        @Override
        public TypeDeserializer forProperty(BeanProperty prop) {
            return new ConcreteTypeDeserializer(this, prop);
        }

        @Override
        public com.fasterxml.jackson.annotation.JsonTypeInfo.As getTypeInclusion() {
            return com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY;
        }

        // Expose protected methods for testing
        public JsonDeserializer<Object> callFindDeserializer(DeserializationContext ctxt, String typeId) throws IOException {
            return _findDeserializer(ctxt, typeId);
        }

        public JsonDeserializer<Object> callFindDefaultImplDeserializer(DeserializationContext ctxt) throws IOException {
            return _findDefaultImplDeserializer(ctxt);
        }

        public Object callDeserializeWithNativeTypeId(JsonParser jp, DeserializationContext ctxt, Object typeId) throws IOException {
            return _deserializeWithNativeTypeId(jp, ctxt, typeId);
        }

        public JavaType callHandleUnknownTypeId(DeserializationContext ctxt, String typeId, TypeIdResolver idResolver, JavaType baseType) throws IOException {
            return _handleUnknownTypeId(ctxt, typeId, idResolver, baseType);
        }
    }

    // Mock TypeIdResolverBase สำหรับทดสอบ Branch ของ TypeIdResolverBase
    private static abstract class DummyTypeIdResolverBase extends TypeIdResolverBase {
        protected DummyTypeIdResolverBase(JavaType baseType, TypeFactory typeFactory) {
            super(baseType, typeFactory);
        }
    }

    @Before
    public void setUp() {
        context = mock(DeserializationContext.class);
        idResolver = mock(TypeIdResolver.class);
        baseType = mock(JavaType.class);
        jsonParser = mock(JsonParser.class);
        when(context.getTypeFactory()).thenReturn(TypeFactory.defaultInstance());
    }

    @Test
    public void testLifeCycleAndAccessors() {
        JavaType defaultImpl = mock(JavaType.class);
        when(defaultImpl.getRawClass()).thenReturn((Class) String.class);
        when(baseType.getRawClass()).thenReturn((Class) Integer.class);

        ConcreteTypeDeserializer deser = new ConcreteTypeDeserializer(
                baseType, idResolver, null, true, defaultImpl);

        assertEquals("", deser.getPropertyName());
        assertEquals(idResolver, deser.getTypeIdResolver());
        assertEquals(String.class, deser.getDefaultImpl());
        assertEquals("java.lang.Integer", deser.baseTypeName());
        assertNotNull(deser.toString());
        assertNotNull(deser.forProperty(null));
        assertNotNull(deser.getTypeInclusion());
    }

    @Test
    public void testFindDeserializerCached() throws IOException {
        ConcreteTypeDeserializer deser = new ConcreteTypeDeserializer(
                baseType, idResolver, "type", false, null);

        // Populate cache via first call or internal state simulation
        when(idResolver.typeFromId(context, "int")).thenReturn(baseType);
        when(context.findContextualValueDeserializer(any(JavaType.class), any())).thenReturn(mock(JsonDeserializer.class));

        JsonDeserializer<Object> first = deser.callFindDeserializer(context, "int");
        JsonDeserializer<Object> second = deser.callFindDeserializer(context, "int");

        assertSame(first, second);
        // Verify idFrom/typeFromId called only once due to cache
        verify(idResolver, times(1)).typeFromId(context, "int");
    }

    @Test
    public void testFindDeserializerTypeFoundWithClassMatch() throws IOException {
        ConcreteTypeDeserializer deser = new ConcreteTypeDeserializer(
                baseType, idResolver, "type", false, null);

        JavaType resolvedType = mock(JavaType.class);
        when(baseType.getClass()).thenReturn((Class) resolvedType.getClass());
        when(resolvedType.getRawClass()).thenReturn((Class) String.class);
        when(idResolver.typeFromId(context, "str")).thenReturn(resolvedType);
        when(context.findContextualValueDeserializer(any(JavaType.class), any())).thenReturn(mock(JsonDeserializer.class));

        JsonDeserializer<Object> result = deser.callFindDeserializer(context, "str");
        assertNotNull(result);
    }

    @Test
    public void testFindDeserializerTypeNullDefaultImplNullHandleUnknownReturnsNull() throws IOException {
        ConcreteTypeDeserializer deser = new ConcreteTypeDeserializer(
                baseType, idResolver, "type", false, null);

        when(idResolver.typeFromId(context, "unknown")).thenReturn(null);
        when(context.isEnabled(DeserializationFeature.FAIL_ON_INVALID_SUBTYPE)).thenReturn(true);
        when(context.handleUnknownTypeId(any(), anyString(), any(), any())).thenReturn(null);

        JsonDeserializer<Object> result = deser.callFindDeserializer(context, "unknown");
        assertNull(result);
    }

    @Test
    public void testFindDeserializerTypeNullDefaultImplNullHandleUnknownReturnsActual() throws IOException {
        ConcreteTypeDeserializer deser = new ConcreteTypeDeserializer(
                baseType, idResolver, "type", false, null);

        when(idResolver.typeFromId(context, "unknown")).thenReturn(null);
        when(context.isEnabled(DeserializationFeature.FAIL_ON_INVALID_SUBTYPE)).thenReturn(true);
        when(context.handleUnknownTypeId(any(), anyString(), any(), any())).thenReturn(baseType);
        when(context.findContextualValueDeserializer(any(JavaType.class), any())).thenReturn(mock(JsonDeserializer.class));

        JsonDeserializer<Object> result = deser.callFindDeserializer(context, "unknown");
        assertNotNull(result);
    }

    @Test
    public void testFindDefaultImplDeserializerNullFailDisabled() throws IOException {
        ConcreteTypeDeserializer deser = new ConcreteTypeDeserializer(
                baseType, idResolver, "type", false, null);

        when(context.isEnabled(DeserializationFeature.FAIL_ON_INVALID_SUBTYPE)).thenReturn(false);

        JsonDeserializer<Object> result = deser.callFindDefaultImplDeserializer(context);
        assertSame(NullifyingDeserializer.instance, result);
    }

    @Test
    public void testFindDefaultImplDeserializerNullFailEnabled() throws IOException {
        ConcreteTypeDeserializer deser = new ConcreteTypeDeserializer(
                baseType, idResolver, "type", false, null);

        when(context.isEnabled(DeserializationFeature.FAIL_ON_INVALID_SUBTYPE)).thenReturn(true);

        JsonDeserializer<Object> result = deser.callFindDefaultImplDeserializer(context);
        assertNull(result);
    }

    @Test
    public void testFindDefaultImplDeserializerBogusClass() throws IOException {
        JavaType bogusType = mock(JavaType.class);
        // Void.class is typically handled or recognized as bogus depending on ClassUtil, 
        // let's pass Void.class to trigger ClassUtil.isBogusClass if applicable, 
        // or mock raw class.
        when(bogusType.getRawClass()).thenReturn((Class) void.class);

        ConcreteTypeDeserializer deser = new ConcreteTypeDeserializer(
                baseType, idResolver, "type", false, bogusType);

        JsonDeserializer<Object> result = deser.callFindDefaultImplDeserializer(context);
        assertSame(NullifyingDeserializer.instance, result);
    }

    @Test
    public void testFindDefaultImplDeserializerNormal() throws IOException {
        JavaType validImpl = mock(JavaType.class);
        when(validImpl.getRawClass()).thenReturn((Class) String.class);

        ConcreteTypeDeserializer deser = new ConcreteTypeDeserializer(
                baseType, idResolver, "type", false, validImpl);

        JsonDeserializer<Object> mockDeser = mock(JsonDeserializer.class);
        when(context.findContextualValueDeserializer(validImpl, null)).thenReturn(mockDeser);

        JsonDeserializer<Object> result1 = deser.callFindDefaultImplDeserializer(context);
        JsonDeserializer<Object> result2 = deser.callFindDefaultImplDeserializer(context); // test cache/synchronized

        assertSame(mockDeser, result1);
        assertSame(result1, result2);
    }

    @Test
    public void testDeserializeWithNativeTypeIdNullDefaultFound() throws IOException {
        ConcreteTypeDeserializer deser = new ConcreteTypeDeserializer(
                baseType, idResolver, "type", false, null);

        when(context.isEnabled(DeserializationFeature.FAIL_ON_INVALID_SUBTYPE)).thenReturn(false);
        JsonDeserializer<Object> mockDeser = mock(JsonDeserializer.class);
        when(jsonParser.getTypeId()).thenReturn(null);
        // When typeId is null, it falls back to default impl deserializer (NullifyingDeserializer.instance)
        
        Object result = deser.callDeserializeWithNativeTypeId(jsonParser, context, null);
        assertNotNull(result);
    }

    @Test(expected = IOException.class)
    public void testDeserializeWithNativeTypeIdNullDefaultNullReportsException() throws IOException {
        ConcreteTypeDeserializer deser = new ConcreteTypeDeserializer(
                baseType, idResolver, "type", false, null);

        when(context.isEnabled(DeserializationFeature.FAIL_ON_INVALID_SUBTYPE)).thenReturn(true);
        doThrow(new IOException("Mapping exception")).when(context).reportMappingException(anyString());

        deser.callDeserializeWithNativeTypeId(jsonParser, context, null);
    }

    @Test
    public void testDeserializeWithNativeTypeIdNotNullString() throws IOException {
        ConcreteTypeDeserializer deser = new ConcreteTypeDeserializer(
                baseType, idResolver, "type", false, null);

        when(idResolver.typeFromId(context, "customId")).thenReturn(baseType);
        JsonDeserializer<Object> mockDeser = mock(JsonDeserializer.class);
        when(context.findContextualValueDeserializer(any(), any())).thenReturn(mockDeser);
        when(mockDeser.deserialize(jsonParser, context)).thenReturn("deserializedValue");

        Object result = deser.callDeserializeWithNativeTypeId(jsonParser, context, "customId");
        assertEquals("deserializedValue", result);
    }

    @Test
    public void testDeserializeWithNativeTypeIdNotNullNonString() throws IOException {
        ConcreteTypeDeserializer deser = new ConcreteTypeDeserializer(
                baseType, idResolver, "type", false, null);

        when(idResolver.typeFromId(context, "123")).thenReturn(baseType);
        JsonDeserializer<Object> mockDeser = mock(JsonDeserializer.class);
        when(context.findContextualValueDeserializer(any(), any())).thenReturn(mockDeser);
        when(mockDeser.deserialize(jsonParser, context)).thenReturn("deserializedValueInt");

        Object result = deser.callDeserializeWithNativeTypeId(jsonParser, context, 123);
        assertEquals("deserializedValueInt", result);
    }

    @Test
    public void testHandleUnknownTypeIdWithTypeIdResolverBase() throws IOException {
        DummyTypeIdResolverBase dummyResolver = mock(DummyTypeIdResolverBase.class);
        when(dummyResolver.getDescForKnownTypeIds()).thenReturn("id1, id2");

        ConcreteTypeDeserializer deser = new ConcreteTypeDeserializer(
                baseType, dummyResolver, "type", false, null);

        deser.callHandleUnknownTypeId(context, "unknownId", dummyResolver, baseType);
        verify(context).handleUnknownTypeId(eq(baseType), eq("unknownId"), eq(dummyResolver), eq("known type ids = id1, id2"));
    }

    @Test
    public void testHandleUnknownTypeIdWithTypeIdResolverBaseNullDesc() throws IOException {
        DummyTypeIdResolverBase dummyResolver = mock(DummyTypeIdResolverBase.class);
        when(dummyResolver.getDescForKnownTypeIds()).thenReturn(null);

        ConcreteTypeDeserializer deser = new ConcreteTypeDeserializer(
                baseType, dummyResolver, "type", false, null);

        deser.callHandleUnknownTypeId(context, "unknownId", dummyResolver, baseType);
        verify(context).handleUnknownTypeId(eq(baseType), eq("unknownId"), eq(dummyResolver), eq("known type ids are not statically known"));
    }
}