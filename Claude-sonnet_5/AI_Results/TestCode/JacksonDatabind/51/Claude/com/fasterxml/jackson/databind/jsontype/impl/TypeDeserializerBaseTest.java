package com.fasterxml.jackson.databind.jsontype.impl;

import java.io.IOException;
import java.util.Map;

import org.junit.Test;
import org.mockito.ArgumentCaptor;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.jsontype.TypeIdResolver;
import com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase; // target class (same package, explicit import for clarity)
import com.fasterxml.jackson.databind.type.TypeFactory;

public class TypeDeserializerBaseTest {

    // ------------------------------------------------------------------
    // Helper concrete subclass to access protected members for testing
    // ------------------------------------------------------------------
    static class TestableTypeDeserializer extends TypeDeserializerBase {

        TestableTypeDeserializer(JavaType baseType, TypeIdResolver idRes, String typePropertyName,
                boolean typeIdVisible, JavaType defaultImpl) {
            super(baseType, idRes, typePropertyName, typeIdVisible, defaultImpl);
        }

        TestableTypeDeserializer(TypeDeserializerBase src, BeanProperty property) {
            super(src, property);
        }

        @Override
        public TypeDeserializer forProperty(BeanProperty prop) {
            return new TestableTypeDeserializer(this, prop);
        }

        @Override
        public JsonTypeInfo.As getTypeInclusion() {
            return JsonTypeInfo.As.PROPERTY;
        }

        // Abstract methods required by TypeDeserializer base API but not exercised
        // by these unit tests (assumption based on well-known Jackson API shape).
        @Override
        public Object deserializeTypedFromObject(JsonParser p, DeserializationContext ctxt) throws IOException {
            throw new UnsupportedOperationException();
        }

        @Override
        public Object deserializeTypedFromArray(JsonParser p, DeserializationContext ctxt) throws IOException {
            throw new UnsupportedOperationException();
        }

        @Override
        public Object deserializeTypedFromScalar(JsonParser p, DeserializationContext ctxt) throws IOException {
            throw new UnsupportedOperationException();
        }

        @Override
        public Object deserializeTypedFromAny(JsonParser p, DeserializationContext ctxt) throws IOException {
            throw new UnsupportedOperationException();
        }

        // ---- exposers / wrappers for protected members ----
        BeanProperty exposedProperty() { return _property; }
        boolean exposedTypeIdVisible() { return _typeIdVisible; }
        Map<String, JsonDeserializer<Object>> exposedDeserializerMap() { return _deserializers; }

        JsonDeserializer<Object> callFindDeserializer(DeserializationContext ctxt, String typeId) throws IOException {
            return _findDeserializer(ctxt, typeId);
        }

        JsonDeserializer<Object> callFindDefaultImplDeserializer(DeserializationContext ctxt) throws IOException {
            return _findDefaultImplDeserializer(ctxt);
        }

        Object callDeserializeWithNativeTypeId(JsonParser p, DeserializationContext ctxt) throws IOException {
            return _deserializeWithNativeTypeId(p, ctxt);
        }

        Object callDeserializeWithNativeTypeId(JsonParser p, DeserializationContext ctxt, Object typeId) throws IOException {
            return _deserializeWithNativeTypeId(p, ctxt, typeId);
        }

        JavaType callHandleUnknownTypeId(DeserializationContext ctxt, String typeId,
                TypeIdResolver idResolver, JavaType baseType) throws IOException {
            return _handleUnknownTypeId(ctxt, typeId, idResolver, baseType);
        }
    }

    // ==================================================================
    // Constructor / accessor tests
    // ==================================================================

    @Test
    public void constructor_nullTypePropertyName_becomesEmptyString() {
        TypeIdResolver idResolver = mock(TypeIdResolver.class);
        JavaType baseType = TypeFactory.defaultInstance().constructType(Object.class);
        TestableTypeDeserializer td = new TestableTypeDeserializer(baseType, idResolver, null, false, null);
        assertEquals("", td.getPropertyName());
    }

    @Test
    public void constructor_nonNullTypePropertyName_isPreservedAndTypeIdVisibleStored() {
        TypeIdResolver idResolver = mock(TypeIdResolver.class);
        JavaType baseType = TypeFactory.defaultInstance().constructType(Object.class);
        TestableTypeDeserializer td = new TestableTypeDeserializer(baseType, idResolver, "@type", true, null);
        assertEquals("@type", td.getPropertyName());
        assertTrue(td.exposedTypeIdVisible());
    }

    @Test
    public void constructor_propertyIsNullByDefault() {
        TypeIdResolver idResolver = mock(TypeIdResolver.class);
        JavaType baseType = TypeFactory.defaultInstance().constructType(Object.class);
        TestableTypeDeserializer td = new TestableTypeDeserializer(baseType, idResolver, "type", false, null);
        assertNull(td.exposedProperty());
    }

    @Test
    public void getDefaultImpl_nullDefaultImpl_returnsNull() {
        TypeIdResolver idResolver = mock(TypeIdResolver.class);
        JavaType baseType = TypeFactory.defaultInstance().constructType(Object.class);
        TestableTypeDeserializer td = new TestableTypeDeserializer(baseType, idResolver, "type", false, null);
        assertNull(td.getDefaultImpl());
    }

    @Test
    public void getDefaultImpl_nonNullDefaultImpl_returnsRawClass() {
        TypeIdResolver idResolver = mock(TypeIdResolver.class);
        JavaType baseType = TypeFactory.defaultInstance().constructType(Object.class);
        JavaType defaultImpl = TypeFactory.defaultInstance().constructType(String.class);
        TestableTypeDeserializer td = new TestableTypeDeserializer(baseType, idResolver, "type", false, defaultImpl);
        assertEquals(String.class, td.getDefaultImpl());
    }

    @Test
    public void baseTypeName_returnsRawClassName() {
        TypeIdResolver idResolver = mock(TypeIdResolver.class);
        JavaType baseType = TypeFactory.defaultInstance().constructType(String.class);
        TestableTypeDeserializer td = new TestableTypeDeserializer(baseType, idResolver, "type", false, null);
        assertEquals(String.class.getName(), td.baseTypeName());
    }

    @Test
    public void getTypeIdResolver_returnsSameInstance() {
        TypeIdResolver idResolver = mock(TypeIdResolver.class);
        JavaType baseType = TypeFactory.defaultInstance().constructType(Object.class);
        TestableTypeDeserializer td = new TestableTypeDeserializer(baseType, idResolver, "type", false, null);
        assertSame(idResolver, td.getTypeIdResolver());
    }

    @Test
    public void toString_containsClassBaseTypeAndIdResolverInfo() {
        TypeIdResolver idResolver = mock(TypeIdResolver.class);
        JavaType baseType = TypeFactory.defaultInstance().constructType(String.class);
        TestableTypeDeserializer td = new TestableTypeDeserializer(baseType, idResolver, "type", false, null);

        String s = td.toString();

        assertTrue(s.startsWith("[" + td.getClass().getName()));
        assertTrue(s.contains("; base-type:"));
        assertTrue(s.contains("; id-resolver: "));
        assertTrue(s.endsWith("]"));
    }

    @Test
    public void forProperty_createsCopyWithGivenProperty() {
        TypeIdResolver idResolver = mock(TypeIdResolver.class);
        JavaType baseType = TypeFactory.defaultInstance().constructType(Object.class);
        TestableTypeDeserializer original = new TestableTypeDeserializer(baseType, idResolver, "type", false, null);
        BeanProperty prop = mock(BeanProperty.class);

        TypeDeserializer copy = original.forProperty(prop);

        assertNotSame(original, copy);
        assertTrue(copy instanceof TestableTypeDeserializer);
        assertSame(prop, ((TestableTypeDeserializer) copy).exposedProperty());
    }

    @Test
    public void copyConstructor_sharesDeserializerCacheAcrossInstances() throws IOException {
        TypeIdResolver idResolver = mock(TypeIdResolver.class);
        JavaType baseType = TypeFactory.defaultInstance().constructType(Object.class);
        JavaType targetType = TypeFactory.defaultInstance().constructType(
                new TypeReference<java.util.List<String>>() {}.getType());
        when(idResolver.typeFromId(any(DeserializationContext.class), eq("int"))).thenReturn(targetType);

        DeserializationContext ctxt = mock(DeserializationContext.class);
        JsonDeserializer<Object> mockDeser = mock(JsonDeserializer.class);
        when(ctxt.findContextualValueDeserializer(eq(targetType), any(BeanProperty.class))).thenReturn(mockDeser);

        TestableTypeDeserializer original = new TestableTypeDeserializer(baseType, idResolver, "type", false, null);
        JsonDeserializer<Object> firstResult = original.callFindDeserializer(ctxt, "int");
        assertSame(mockDeser, firstResult);

        BeanProperty prop = mock(BeanProperty.class);
        TestableTypeDeserializer copy = new TestableTypeDeserializer(original, prop);

        assertSame(prop, copy.exposedProperty());
        assertEquals(original.getPropertyName(), copy.getPropertyName());
        assertSame(original.getTypeIdResolver(), copy.getTypeIdResolver());
        assertEquals(original.baseTypeName(), copy.baseTypeName());

        // Copy uses the SAME cache map -> second lookup must not call idResolver again.
        JsonDeserializer<Object> secondResult = copy.callFindDeserializer(ctxt, "int");
        assertSame(mockDeser, secondResult);
        verify(idResolver, times(1)).typeFromId(any(DeserializationContext.class), eq("int"));
    }

    // ==================================================================
    // _findDeserializer tests
    // ==================================================================

    @Test
    public void findDeserializer_cachesResultAndReusesOnSecondCall() throws IOException {
        TypeIdResolver idResolver = mock(TypeIdResolver.class);
        JavaType baseType = TypeFactory.defaultInstance().constructType(Object.class);
        JavaType resolvedType = TypeFactory.defaultInstance().constructType(
                new TypeReference<java.util.List<String>>() {}.getType());
        when(idResolver.typeFromId(any(DeserializationContext.class), eq("list"))).thenReturn(resolvedType);
        DeserializationContext ctxt = mock(DeserializationContext.class);
        JsonDeserializer<Object> mockDeser = mock(JsonDeserializer.class);
        when(ctxt.findContextualValueDeserializer(eq(resolvedType), any(BeanProperty.class))).thenReturn(mockDeser);

        TestableTypeDeserializer td = new TestableTypeDeserializer(baseType, idResolver, "type", false, null);

        JsonDeserializer<Object> first = td.callFindDeserializer(ctxt, "list");
        JsonDeserializer<Object> second = td.callFindDeserializer(ctxt, "list");

        assertSame(mockDeser, first);
        assertSame(mockDeser, second);
        verify(idResolver, times(1)).typeFromId(any(DeserializationContext.class), eq("list"));
        assertTrue(td.exposedDeserializerMap().containsKey("list"));
    }

    @Test
    public void findDeserializer_emptyTypeId_treatedAsRegularKey() throws IOException {
        TypeIdResolver idResolver = mock(TypeIdResolver.class);
        JavaType baseType = TypeFactory.defaultInstance().constructType(Object.class);
        JavaType resolvedType = TypeFactory.defaultInstance().constructType(
                new TypeReference<java.util.List<String>>() {}.getType());
        when(idResolver.typeFromId(any(DeserializationContext.class), eq(""))).thenReturn(resolvedType);
        DeserializationContext ctxt = mock(DeserializationContext.class);
        JsonDeserializer<Object> mockDeser = mock(JsonDeserializer.class);
        when(ctxt.findContextualValueDeserializer(eq(resolvedType), any(BeanProperty.class))).thenReturn(mockDeser);

        TestableTypeDeserializer td = new TestableTypeDeserializer(baseType, idResolver, "type", false, null);

        JsonDeserializer<Object> result = td.callFindDeserializer(ctxt, "");

        assertSame(mockDeser, result);
    }

    @Test
    public void findDeserializer_typeNull_noDefaultImpl_featureDisabled_returnsNullifyingDeserializer() throws IOException {
        TypeIdResolver idResolver = mock(TypeIdResolver.class);
        JavaType baseType = TypeFactory.defaultInstance().constructType(Object.class);
        when(idResolver.typeFromId(any(DeserializationContext.class), eq("unknown"))).thenReturn(null);
        DeserializationContext ctxt = mock(DeserializationContext.class);
        when(ctxt.isEnabled(DeserializationFeature.FAIL_ON_INVALID_SUBTYPE)).thenReturn(false);

        TestableTypeDeserializer td = new TestableTypeDeserializer(baseType, idResolver, "type", false, null);

        JsonDeserializer<Object> result = td.callFindDeserializer(ctxt, "unknown");

        assertSame(NullifyingDeserializer.instance, result);
        assertTrue(td.exposedDeserializerMap().containsKey("unknown"));
    }

    @Test
    public void findDeserializer_typeNull_featureEnabled_unknownTypeUnresolved_returnsNullWithoutCaching() throws IOException {
        TypeIdResolver idResolver = mock(TypeIdResolver.class); // not TypeIdResolverBase
        JavaType baseType = TypeFactory.defaultInstance().constructType(Object.class);
        when(idResolver.typeFromId(any(DeserializationContext.class), eq("unknown"))).thenReturn(null);
        DeserializationContext ctxt = mock(DeserializationContext.class);
        when(ctxt.isEnabled(DeserializationFeature.FAIL_ON_INVALID_SUBTYPE)).thenReturn(true);
        when(ctxt.handleUnknownTypeId(eq(baseType), eq("unknown"), eq(idResolver), any()))
                .thenReturn(null);

        TestableTypeDeserializer td = new TestableTypeDeserializer(baseType, idResolver, "type", false, null);

        JsonDeserializer<Object> result = td.callFindDeserializer(ctxt, "unknown");

        assertNull(result);
        // Early "return null" bypasses the cache-put line in the source.
        assertFalse(td.exposedDeserializerMap().containsKey("unknown"));
    }

    @Test
    public void findDeserializer_typeNull_unknownTypeResolvedViaHandler_returnsDeserializerAndCaches() throws IOException {
        TypeIdResolver idResolver = mock(TypeIdResolver.class);
        JavaType baseType = TypeFactory.defaultInstance().constructType(Object.class);
        when(idResolver.typeFromId(any(DeserializationContext.class), eq("unknown"))).thenReturn(null);
        DeserializationContext ctxt = mock(DeserializationContext.class);
        when(ctxt.isEnabled(DeserializationFeature.FAIL_ON_INVALID_SUBTYPE)).thenReturn(true);
        JavaType actualType = TypeFactory.defaultInstance().constructType(String.class);
        when(ctxt.handleUnknownTypeId(eq(baseType), eq("unknown"), eq(idResolver), any()))
                .thenReturn(actualType);
        JsonDeserializer<Object> mockDeser = mock(JsonDeserializer.class);
        when(ctxt.findContextualValueDeserializer(eq(actualType), any(BeanProperty.class))).thenReturn(mockDeser);

        TestableTypeDeserializer td = new TestableTypeDeserializer(baseType, idResolver, "type", false, null);

        JsonDeserializer<Object> result = td.callFindDeserializer(ctxt, "unknown");

        assertSame(mockDeser, result);
        assertTrue(td.exposedDeserializerMap().containsKey("unknown"));
    }

    /**
     * Potential real defect: ConcurrentHashMap ("_deserializers") does not allow null
     * values. If the resolved contextual deserializer ends up null, the source still
     * executes "_deserializers.put(typeId, deser)" with a null value, which throws
     * NullPointerException. This test documents/captures that behavior.
     */
    @Test(expected = NullPointerException.class)
    public void findDeserializer_contextualDeserializerNullAfterHandler_throwsNpeOnCachePut() throws IOException {
        TypeIdResolver idResolver = mock(TypeIdResolver.class);
        JavaType baseType = TypeFactory.defaultInstance().constructType(Object.class);
        when(idResolver.typeFromId(any(DeserializationContext.class), eq("unknown"))).thenReturn(null);
        DeserializationContext ctxt = mock(DeserializationContext.class);
        when(ctxt.isEnabled(DeserializationFeature.FAIL_ON_INVALID_SUBTYPE)).thenReturn(true);
        JavaType actualType = TypeFactory.defaultInstance().constructType(String.class);
        when(ctxt.handleUnknownTypeId(eq(baseType), eq("unknown"), eq(idResolver), any()))
                .thenReturn(actualType);
        when(ctxt.findContextualValueDeserializer(eq(actualType), any(BeanProperty.class))).thenReturn(null);

        TestableTypeDeserializer td = new TestableTypeDeserializer(baseType, idResolver, "type", false, null);

        td.callFindDeserializer(ctxt, "unknown");
    }

    @Test
    public void findDeserializer_typeResolved_sameJavaTypeClass_narrowsUsingTypeFactory() throws IOException {
        TypeIdResolver idResolver = mock(TypeIdResolver.class);
        JavaType baseType = TypeFactory.defaultInstance().constructType(Object.class); // SimpleType
        JavaType resolvedRawType = TypeFactory.defaultInstance().constructType(String.class); // SimpleType too
        when(idResolver.typeFromId(any(DeserializationContext.class), eq("str"))).thenReturn(resolvedRawType);
        DeserializationContext ctxt = mock(DeserializationContext.class);
        when(ctxt.getTypeFactory()).thenReturn(TypeFactory.defaultInstance());
        JsonDeserializer<Object> mockDeser = mock(JsonDeserializer.class);
        when(ctxt.findContextualValueDeserializer(any(JavaType.class), any(BeanProperty.class))).thenReturn(mockDeser);

        TestableTypeDeserializer td = new TestableTypeDeserializer(baseType, idResolver, "type", false, null);

        JsonDeserializer<Object> result = td.callFindDeserializer(ctxt, "str");

        assertSame(mockDeser, result);
        verify(ctxt, times(1)).getTypeFactory();
    }

    @Test
    public void findDeserializer_baseTypeNull_skipsNarrowing() throws IOException {
        TypeIdResolver idResolver = mock(TypeIdResolver.class);
        JavaType resolvedType = TypeFactory.defaultInstance().constructType(String.class);
        when(idResolver.typeFromId(any(DeserializationContext.class), eq("str"))).thenReturn(resolvedType);
        DeserializationContext ctxt = mock(DeserializationContext.class);
        JsonDeserializer<Object> mockDeser = mock(JsonDeserializer.class);
        when(ctxt.findContextualValueDeserializer(eq(resolvedType), any(BeanProperty.class))).thenReturn(mockDeser);

        TestableTypeDeserializer td = new TestableTypeDeserializer(null, idResolver, "type", false, null);

        JsonDeserializer<Object> result = td.callFindDeserializer(ctxt, "str");

        assertSame(mockDeser, result);
        verify(ctxt, never()).getTypeFactory();
    }

    @Test
    public void findDeserializer_differentJavaTypeClasses_skipsNarrowing() throws IOException {
        TypeIdResolver idResolver = mock(TypeIdResolver.class);
        JavaType baseType = TypeFactory.defaultInstance().constructType(
                new TypeReference<java.util.Map<String, String>>() {}.getType()); // MapType
        JavaType resolvedType = TypeFactory.defaultInstance().constructType(String.class); // SimpleType
        when(idResolver.typeFromId(any(DeserializationContext.class), eq("str"))).thenReturn(resolvedType);
        DeserializationContext ctxt = mock(DeserializationContext.class);
        JsonDeserializer<Object> mockDeser = mock(JsonDeserializer.class);
        when(ctxt.findContextualValueDeserializer(eq(resolvedType), any(BeanProperty.class))).thenReturn(mockDeser);

        TestableTypeDeserializer td = new TestableTypeDeserializer(baseType, idResolver, "type", false, null);

        JsonDeserializer<Object> result = td.callFindDeserializer(ctxt, "str");

        assertSame(mockDeser, result);
        verify(ctxt, never()).getTypeFactory();
    }

    // ==================================================================
    // _findDefaultImplDeserializer tests
    // ==================================================================

    @Test
    public void findDefaultImplDeserializer_noDefaultImpl_featureDisabled_returnsNullifying() throws IOException {
        TypeIdResolver idResolver = mock(TypeIdResolver.class);
        JavaType baseType = TypeFactory.defaultInstance().constructType(Object.class);
        DeserializationContext ctxt = mock(DeserializationContext.class);
        when(ctxt.isEnabled(DeserializationFeature.FAIL_ON_INVALID_SUBTYPE)).thenReturn(false);

        TestableTypeDeserializer td = new TestableTypeDeserializer(baseType, idResolver, "type", false, null);

        JsonDeserializer<Object> result = td.callFindDefaultImplDeserializer(ctxt);

        assertSame(NullifyingDeserializer.instance, result);
    }

    @Test
    public void findDefaultImplDeserializer_noDefaultImpl_featureEnabled_returnsNull() throws IOException {
        TypeIdResolver idResolver = mock(TypeIdResolver.class);
        JavaType baseType = TypeFactory.defaultInstance().constructType(Object.class);
        DeserializationContext ctxt = mock(DeserializationContext.class);
        when(ctxt.isEnabled(DeserializationFeature.FAIL_ON_INVALID_SUBTYPE)).thenReturn(true);

        TestableTypeDeserializer td = new TestableTypeDeserializer(baseType, idResolver, "type", false, null);

        JsonDeserializer<Object> result = td.callFindDefaultImplDeserializer(ctxt);

        assertNull(result);
    }

    // Assumption (explicitly noted): per the doc comment on _findDefaultImplDeserializer,
    // Void.class is treated as the "bogus"/"serialize as null" marker, matching
    // ClassUtil.isBogusClass(...) == true. This is inferred directly from the source
    // comment provided, not guessed externally.
    @Test
    public void findDefaultImplDeserializer_bogusDefaultImplClass_returnsNullifying() throws IOException {
        TypeIdResolver idResolver = mock(TypeIdResolver.class);
        JavaType baseType = TypeFactory.defaultInstance().constructType(Object.class);
        JavaType bogusDefaultImpl = TypeFactory.defaultInstance().constructType(Void.class);
        DeserializationContext ctxt = mock(DeserializationContext.class);

        TestableTypeDeserializer td = new TestableTypeDeserializer(baseType, idResolver, "type", false, bogusDefaultImpl);

        JsonDeserializer<Object> result = td.callFindDefaultImplDeserializer(ctxt);

        assertSame(NullifyingDeserializer.instance, result);
    }

    @Test
    public void findDefaultImplDeserializer_validDefaultImpl_resolvesAndCaches() throws IOException {
        TypeIdResolver idResolver = mock(TypeIdResolver.class);
        JavaType baseType = TypeFactory.defaultInstance().constructType(Object.class);
        JavaType defaultImpl = TypeFactory.defaultInstance().constructType(String.class);
        DeserializationContext ctxt = mock(DeserializationContext.class);
        JsonDeserializer<Object> mockDeser = mock(JsonDeserializer.class);
        when(ctxt.findContextualValueDeserializer(eq(defaultImpl), any(BeanProperty.class))).thenReturn(mockDeser);

        TestableTypeDeserializer td = new TestableTypeDeserializer(baseType, idResolver, "type", false, defaultImpl);

        JsonDeserializer<Object> first = td.callFindDefaultImplDeserializer(ctxt);
        JsonDeserializer<Object> second = td.callFindDefaultImplDeserializer(ctxt);

        assertSame(mockDeser, first);
        assertSame(mockDeser, second);
        verify(ctxt, times(1)).findContextualValueDeserializer(eq(defaultImpl), any(BeanProperty.class));
    }

    // ==================================================================
    // _deserializeWithNativeTypeId tests
    // ==================================================================

    @Test
    public void deserializeWithNativeTypeId_singleArg_delegatesUsingParserTypeId() throws IOException {
        TypeIdResolver idResolver = mock(TypeIdResolver.class);
        JavaType baseType = TypeFactory.defaultInstance().constructType(Object.class);
        JavaType resolvedType = TypeFactory.defaultInstance().constructType(
                new TypeReference<java.util.List<String>>() {}.getType());
        DeserializationContext ctxt = mock(DeserializationContext.class);
        JsonParser jp = mock(JsonParser.class);
        when(jp.getTypeId()).thenReturn("listType");
        when(idResolver.typeFromId(eq(ctxt), eq("listType"))).thenReturn(resolvedType);
        JsonDeserializer<Object> mockDeser = mock(JsonDeserializer.class);
        when(ctxt.findContextualValueDeserializer(eq(resolvedType), any(BeanProperty.class))).thenReturn(mockDeser);
        Object expected = "ok";
        when(mockDeser.deserialize(jp, ctxt)).thenReturn(expected);

        TestableTypeDeserializer td = new TestableTypeDeserializer(baseType, idResolver, "type", false, null);

        Object result = td.callDeserializeWithNativeTypeId(jp, ctxt);

        assertEquals(expected, result);
        verify(jp, times(1)).getTypeId();
    }

    @Test
    public void deserializeWithNativeTypeId_nullTypeId_noDefaultImpl_reportsAndReturnsNull() throws IOException {
        TypeIdResolver idResolver = mock(TypeIdResolver.class);
        JavaType baseType = TypeFactory.defaultInstance().constructType(Object.class);
        DeserializationContext ctxt = mock(DeserializationContext.class);
        when(ctxt.isEnabled(DeserializationFeature.FAIL_ON_INVALID_SUBTYPE)).thenReturn(true);
        JsonParser jp = mock(JsonParser.class);

        TestableTypeDeserializer td = new TestableTypeDeserializer(baseType, idResolver, "type", false, null);

        Object result = td.callDeserializeWithNativeTypeId(jp, ctxt, null);

        assertNull(result);
    }

    @Test
    public void deserializeWithNativeTypeId_nullTypeId_withDefaultImplDeserializer_deserializes() throws IOException {
        TypeIdResolver idResolver = mock(TypeIdResolver.class);
        JavaType baseType = TypeFactory.defaultInstance().constructType(Object.class);
        JavaType defaultImpl = TypeFactory.defaultInstance().constructType(String.class);
        DeserializationContext ctxt = mock(DeserializationContext.class);
        JsonDeserializer<Object> mockDeser = mock(JsonDeserializer.class);
        when(ctxt.findContextualValueDeserializer(eq(defaultImpl), any(BeanProperty.class))).thenReturn(mockDeser);
        JsonParser jp = mock(JsonParser.class);
        Object expected = "deserializedValue";
        when(mockDeser.deserialize(jp, ctxt)).thenReturn(expected);

        TestableTypeDeserializer td = new TestableTypeDeserializer(baseType, idResolver, "type", false, defaultImpl);

        Object result = td.callDeserializeWithNativeTypeId(jp, ctxt, null);

        assertEquals(expected, result);
    }

    @Test
    public void deserializeWithNativeTypeId_stringTypeId_resolvesAndDeserializes() throws IOException {
        TypeIdResolver idResolver = mock(TypeIdResolver.class);
        JavaType baseType = TypeFactory.defaultInstance().constructType(Object.class);
        JavaType resolvedType = TypeFactory.defaultInstance().constructType(String.class);
        DeserializationContext ctxt = mock(DeserializationContext.class);
        when(ctxt.getTypeFactory()).thenReturn(TypeFactory.defaultInstance()); // narrowing branch may be hit
        when(idResolver.typeFromId(eq(ctxt), eq("str"))).thenReturn(resolvedType);
        JsonDeserializer<Object> mockDeser = mock(JsonDeserializer.class);
        when(ctxt.findContextualValueDeserializer(any(JavaType.class), any(BeanProperty.class))).thenReturn(mockDeser);
        JsonParser jp = mock(JsonParser.class);
        Object expected = "value123";
        when(mockDeser.deserialize(jp, ctxt)).thenReturn(expected);

        TestableTypeDeserializer td = new TestableTypeDeserializer(baseType, idResolver, "type", false, null);

        Object result = td.callDeserializeWithNativeTypeId(jp, ctxt, "str");

        assertEquals(expected, result);
        verify(idResolver).typeFromId(eq(ctxt), eq("str"));
    }

    @Test
    public void deserializeWithNativeTypeId_nonStringTypeId_convertsToStringAndResolves() throws IOException {
        TypeIdResolver idResolver = mock(TypeIdResolver.class);
        JavaType baseType = TypeFactory.defaultInstance().constructType(Object.class);
        JavaType resolvedType = TypeFactory.defaultInstance().constructType(
                new TypeReference<java.util.List<String>>() {}.getType());
        DeserializationContext ctxt = mock(DeserializationContext.class);
        when(idResolver.typeFromId(eq(ctxt), eq("42"))).thenReturn(resolvedType);
        JsonDeserializer<Object> mockDeser = mock(JsonDeserializer.class);
        when(ctxt.findContextualValueDeserializer(eq(resolvedType), any(BeanProperty.class))).thenReturn(mockDeser);
        JsonParser jp = mock(JsonParser.class);
        Object expected = new Object();
        when(mockDeser.deserialize(jp, ctxt)).thenReturn(expected);

        TestableTypeDeserializer td = new TestableTypeDeserializer(baseType, idResolver, "type", false, null);

        Object result = td.callDeserializeWithNativeTypeId(jp, ctxt, Integer.valueOf(42));

        assertSame(expected, result);
        verify(idResolver).typeFromId(eq(ctxt), eq("42"));
    }

    // ==================================================================
    // _handleUnknownTypeId tests
    // ==================================================================

    @Test
    public void handleUnknownTypeId_withTypeIdResolverBase_nullDesc_usesDefaultMessage() throws IOException {
        TypeIdResolverBase idResolverBase = mock(TypeIdResolverBase.class);
        when(idResolverBase.getDescForKnownTypeIds()).thenReturn(null);
        JavaType baseType = TypeFactory.defaultInstance().constructType(Object.class);
        DeserializationContext ctxt = mock(DeserializationContext.class);
        JavaType expected = TypeFactory.defaultInstance().constructType(String.class);
        ArgumentCaptor<String> descCaptor = ArgumentCaptor.forClass(String.class);
        when(ctxt.handleUnknownTypeId(eq(baseType), eq("bad"), eq(idResolverBase), descCaptor.capture()))
                .thenReturn(expected);

        TestableTypeDeserializer td = new TestableTypeDeserializer(baseType, idResolverBase, "type", false, null);
        JavaType result = td.callHandleUnknownTypeId(ctxt, "bad", idResolverBase, baseType);

        assertSame(expected, result);
        assertEquals("known type ids are not statically known", descCaptor.getValue());
    }

    @Test
    public void handleUnknownTypeId_withTypeIdResolverBase_nonNullDesc_prefixesMessage() throws IOException {
        TypeIdResolverBase idResolverBase = mock(TypeIdResolverBase.class);
        when(idResolverBase.getDescForKnownTypeIds()).thenReturn("A, B, C");
        JavaType baseType = TypeFactory.defaultInstance().constructType(Object.class);
        DeserializationContext ctxt = mock(DeserializationContext.class);
        ArgumentCaptor<String> descCaptor = ArgumentCaptor.forClass(String.class);
        when(ctxt.handleUnknownTypeId(eq(baseType), eq("bad"), eq(idResolverBase), descCaptor.capture()))
                .thenReturn(null);

        TestableTypeDeserializer td = new TestableTypeDeserializer(baseType, idResolverBase, "type", false, null);
        JavaType result = td.callHandleUnknownTypeId(ctxt, "bad", idResolverBase, baseType);

        assertNull(result);
        assertEquals("known type ids = A, B, C", descCaptor.getValue());
    }

    @Test
    public void handleUnknownTypeId_withPlainResolver_nullDesc() throws IOException {
        TypeIdResolver plainResolver = mock(TypeIdResolver.class); // not a TypeIdResolverBase
        JavaType baseType = TypeFactory.defaultInstance().constructType(Object.class);
        DeserializationContext ctxt = mock(DeserializationContext.class);
        ArgumentCaptor<String> descCaptor = ArgumentCaptor.forClass(String.class);
        when(ctxt.handleUnknownTypeId(eq(baseType), eq("bad"), eq(plainResolver), descCaptor.capture()))
                .thenReturn(null);

        TestableTypeDeserializer td = new TestableTypeDeserializer(baseType, plainResolver, "type", false, null);
        JavaType result = td.callHandleUnknownTypeId(ctxt, "bad", plainResolver, baseType);

        assertNull(result);
        assertNull(descCaptor.getValue());
    }
}
