package com.fasterxml.jackson.databind.jsontype.impl;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import java.io.IOException;

import org.junit.Before;
import org.junit.Test;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.jsontype.TypeIdResolver;
import com.fasterxml.jackson.databind.type.TypeFactory;

/**
 * Unit tests for {@link TypeDeserializerBase}.
 *
 * หมายเหตุ: TypeDeserializer (superclass), DeserializationContext, JavaType, TypeIdResolver,
 * TypeIdResolverBase, NullifyingDeserializer ไม่มี source ให้มาโดยตรงในโจทย์
 * จึงอนุมาน signature จาก jackson-databind API มาตรฐานช่วง 2.5-2.6 (ตรงกับ comment ใน source
 * เช่น "@since 2.3", "@since 2.4", "@since 2.5", "09-Aug-2015").
 */
public class TypeDeserializerBaseTest {

    private TypeIdResolver idResolver;
    private DeserializationContext ctxt;
    private JsonParser jsonParser;

    @Before
    public void setUp() {
        idResolver = mock(TypeIdResolver.class);
        ctxt = mock(DeserializationContext.class);
        jsonParser = mock(JsonParser.class);
    }

    @SuppressWarnings("unchecked")
    private JsonDeserializer<Object> mockDeserializer() {
        return mock(JsonDeserializer.class);
    }

    // ---------------------------------------------------------------
    // Concrete subclass to allow instantiation + expose protected API
    // ---------------------------------------------------------------
    static class TestTypeDeserializer extends TypeDeserializerBase {

        TestTypeDeserializer(JavaType baseType, TypeIdResolver idRes,
                String typePropertyName, boolean typeIdVisible, Class<?> defaultImpl) {
            super(baseType, idRes, typePropertyName, typeIdVisible, defaultImpl);
        }

        TestTypeDeserializer(TestTypeDeserializer src, BeanProperty property) {
            super(src, property);
        }

        @Override
        public TypeDeserializer forProperty(BeanProperty prop) {
            return new TestTypeDeserializer(this, prop);
        }

        @Override
        public JsonTypeInfo.As getTypeInclusion() {
            return JsonTypeInfo.As.PROPERTY;
        }

        // ต่อไปนี้เป็น abstract methods ที่อนุมานว่ามาจาก TypeDeserializer (superclass)
        // ไม่ได้ใช้ในการทดสอบ TypeDeserializerBase โดยตรง จึง return null เฉย ๆ
        @Override
        public Object deserializeTypedFromObject(JsonParser p, DeserializationContext ctxt) throws IOException {
            return null;
        }

        @Override
        public Object deserializeTypedFromArray(JsonParser p, DeserializationContext ctxt) throws IOException {
            return null;
        }

        @Override
        public Object deserializeTypedFromScalar(JsonParser p, DeserializationContext ctxt) throws IOException {
            return null;
        }

        @Override
        public Object deserializeTypedFromAny(JsonParser p, DeserializationContext ctxt) throws IOException {
            return null;
        }

        // ---------------- Exposers for protected members ----------------
        JsonDeserializer<Object> callFindDeserializer(DeserializationContext ctxt, String typeId) throws IOException {
            return _findDeserializer(ctxt, typeId);
        }

        JsonDeserializer<Object> callFindDefaultImplDeserializer(DeserializationContext ctxt) throws IOException {
            return _findDefaultImplDeserializer(ctxt);
        }

        Object callDeserializeWithNativeTypeId(JsonParser jp, DeserializationContext ctxt) throws IOException {
            return _deserializeWithNativeTypeId(jp, ctxt);
        }

        Object callDeserializeWithNativeTypeId(JsonParser jp, DeserializationContext ctxt, Object typeId) throws IOException {
            return _deserializeWithNativeTypeId(jp, ctxt, typeId);
        }

        JsonDeserializer<Object> callHandleUnknownTypeId(DeserializationContext ctxt, String typeId,
                TypeIdResolver idResolver, JavaType baseType) throws IOException {
            return _handleUnknownTypeId(ctxt, typeId, idResolver, baseType);
        }
    }

    // =================================================================
    // Constructor tests
    // =================================================================

    @Test
    public void testConstructor_defaultImplNull_getDefaultImplReturnsNull() {
        JavaType baseType = TypeFactory.defaultInstance().constructType(Object.class);
        TestTypeDeserializer td = new TestTypeDeserializer(baseType, idResolver, "@type", true, null);

        assertNull(td.getDefaultImpl());
        assertEquals("@type", td.getPropertyName());
        assertEquals(Object.class.getName(), td.baseTypeName());
        assertSame(idResolver, td.getTypeIdResolver());
    }

    @Test
    public void testConstructor_defaultImplNotNull_forcedNarrowByApplied() {
        JavaType baseType = TypeFactory.defaultInstance().constructType(Object.class);
        TestTypeDeserializer td = new TestTypeDeserializer(baseType, idResolver, "@type", false, String.class);

        assertEquals(String.class, td.getDefaultImpl());
    }

    @Test
    public void testForProperty_copiesFieldsAndSetsProperty() {
        JavaType baseType = TypeFactory.defaultInstance().constructType(Object.class);
        TestTypeDeserializer original = new TestTypeDeserializer(baseType, idResolver, "@type", true, null);
        BeanProperty prop = mock(BeanProperty.class);

        TypeDeserializer copy = original.forProperty(prop);

        assertNotSame(original, copy);
        assertTrue(copy instanceof TestTypeDeserializer);
        assertEquals(original.getPropertyName(), copy.getPropertyName());
        assertSame(original.getTypeIdResolver(), copy.getTypeIdResolver());
    }

    @Test
    public void testForProperty_sharesDeserializerCacheMap() throws IOException {
        JavaType baseType = TypeFactory.defaultInstance().constructType(Object.class);
        TestTypeDeserializer original = new TestTypeDeserializer(baseType, idResolver, "@type", true, null);

        JavaType resolvedType = TypeFactory.defaultInstance().constructType(String.class);
        when(idResolver.typeFromId(eq(ctxt), eq("shared"))).thenReturn(resolvedType);
        JsonDeserializer<Object> mockDeser = mockDeserializer();
        when(ctxt.findContextualValueDeserializer(any(JavaType.class), any())).thenReturn(mockDeser);

        original.callFindDeserializer(ctxt, "shared");

        BeanProperty prop = mock(BeanProperty.class);
        TestTypeDeserializer copy = (TestTypeDeserializer) original.forProperty(prop);

        JsonDeserializer<Object> result = copy.callFindDeserializer(ctxt, "shared");

        assertSame(mockDeser, result);
        // idResolver ต้องไม่ถูกเรียกซ้ำเพราะแคชถูกแชร์ผ่าน copy constructor
        verify(idResolver, times(1)).typeFromId(eq(ctxt), eq("shared"));
    }

    @Test
    public void testToString_containsExpectedParts() {
        JavaType baseType = TypeFactory.defaultInstance().constructType(String.class);
        TestTypeDeserializer td = new TestTypeDeserializer(baseType, idResolver, "@type", true, null);

        String s = td.toString();

        assertTrue(s.startsWith("["));
        assertTrue(s.endsWith("]"));
        assertTrue(s.contains(td.getClass().getName()));
        assertTrue(s.contains("base-type:"));
        assertTrue(s.contains("id-resolver:"));
    }

    // =================================================================
    // _findDeserializer tests
    // =================================================================

    @Test
    public void testFindDeserializer_typeFound_sameJavaTypeClass_narrowsAndCaches() throws IOException {
        JavaType baseType = TypeFactory.defaultInstance().constructType(Object.class); // SimpleType
        JavaType resolvedType = TypeFactory.defaultInstance().constructType(String.class); // SimpleType too
        TestTypeDeserializer td = new TestTypeDeserializer(baseType, idResolver, "@type", true, null);

        when(idResolver.typeFromId(eq(ctxt), eq("str"))).thenReturn(resolvedType);
        JsonDeserializer<Object> mockDeser = mockDeserializer();
        when(ctxt.findContextualValueDeserializer(any(JavaType.class), any())).thenReturn(mockDeser);

        JsonDeserializer<Object> result1 = td.callFindDeserializer(ctxt, "str");
        JsonDeserializer<Object> result2 = td.callFindDeserializer(ctxt, "str"); // hit cache

        assertSame(mockDeser, result1);
        assertSame(mockDeser, result2);
        verify(idResolver, times(1)).typeFromId(eq(ctxt), eq("str"));
    }

    @Test
    public void testFindDeserializer_typeFound_differentJavaTypeClass_noNarrow() throws IOException {
        JavaType baseType = TypeFactory.defaultInstance().constructType(Object.class); // SimpleType
        JavaType resolvedType = TypeFactory.defaultInstance().constructType(java.util.List.class); // CollectionType
        TestTypeDeserializer td = new TestTypeDeserializer(baseType, idResolver, "@type", true, null);

        when(idResolver.typeFromId(eq(ctxt), eq("list"))).thenReturn(resolvedType);
        JsonDeserializer<Object> mockDeser = mockDeserializer();
        when(ctxt.findContextualValueDeserializer(any(JavaType.class), any())).thenReturn(mockDeser);

        JsonDeserializer<Object> result = td.callFindDeserializer(ctxt, "list");

        assertSame(mockDeser, result);
    }

    @Test
    public void testFindDeserializer_baseTypeNull_skipsNarrowing() throws IOException {
        // Boundary case: _baseType == null -> short-circuit ที่ (_baseType != null) เป็น false
        TestTypeDeserializer td = new TestTypeDeserializer(null, idResolver, "@type", true, null);

        JavaType resolvedType = TypeFactory.defaultInstance().constructType(String.class);
        when(idResolver.typeFromId(eq(ctxt), eq("x"))).thenReturn(resolvedType);
        JsonDeserializer<Object> mockDeser = mockDeserializer();
        when(ctxt.findContextualValueDeserializer(any(JavaType.class), any())).thenReturn(mockDeser);

        JsonDeserializer<Object> result = td.callFindDeserializer(ctxt, "x");

        assertSame(mockDeser, result);
    }

    @Test
    public void testFindDeserializer_typeNotFound_defaultImplNull_failDisabled_returnsNullifying() throws IOException {
        JavaType baseType = TypeFactory.defaultInstance().constructType(Object.class);
        TestTypeDeserializer td = new TestTypeDeserializer(baseType, idResolver, "@type", true, null);

        when(idResolver.typeFromId(eq(ctxt), eq("unknown"))).thenReturn(null);
        when(ctxt.isEnabled(DeserializationFeature.FAIL_ON_INVALID_SUBTYPE)).thenReturn(false);

        JsonDeserializer<Object> result = td.callFindDeserializer(ctxt, "unknown");

        assertSame(NullifyingDeserializer.instance, result);
    }

    @Test(expected = JsonMappingException.class)
    public void testFindDeserializer_typeNotFound_defaultImplNull_failEnabled_throwsViaHandleUnknown() throws IOException {
        JavaType baseType = TypeFactory.defaultInstance().constructType(Object.class);
        TestTypeDeserializer td = new TestTypeDeserializer(baseType, idResolver, "@type", true, null);

        when(idResolver.typeFromId(eq(ctxt), eq("unknown"))).thenReturn(null);
        when(ctxt.isEnabled(DeserializationFeature.FAIL_ON_INVALID_SUBTYPE)).thenReturn(true);
        when(ctxt.unknownTypeException(any(JavaType.class), anyString(), any()))
                .thenReturn(new JsonMappingException("dummy"));

        td.callFindDeserializer(ctxt, "unknown");
    }

    @Test
    public void testFindDeserializer_typeNotFound_defaultImplPresent_used() throws IOException {
        JavaType baseType = TypeFactory.defaultInstance().constructType(Object.class);
        TestTypeDeserializer td = new TestTypeDeserializer(baseType, idResolver, "@type", true, String.class);

        when(idResolver.typeFromId(eq(ctxt), eq("unknown"))).thenReturn(null);
        JsonDeserializer<Object> mockDeser = mockDeserializer();
        when(ctxt.findContextualValueDeserializer(any(JavaType.class), any())).thenReturn(mockDeser);

        JsonDeserializer<Object> result = td.callFindDeserializer(ctxt, "unknown");

        assertSame(mockDeser, result);
    }

    @Test
    public void testFindDeserializer_emptyTypeId_treatedAsUnresolved() throws IOException {
        JavaType baseType = TypeFactory.defaultInstance().constructType(Object.class);
        TestTypeDeserializer td = new TestTypeDeserializer(baseType, idResolver, "@type", true, null);

        when(idResolver.typeFromId(eq(ctxt), eq(""))).thenReturn(null);
        when(ctxt.isEnabled(DeserializationFeature.FAIL_ON_INVALID_SUBTYPE)).thenReturn(false);

        JsonDeserializer<Object> result = td.callFindDeserializer(ctxt, "");

        assertSame(NullifyingDeserializer.instance, result);
    }

    // =================================================================
    // _findDefaultImplDeserializer tests
    // =================================================================

    @Test
    public void testFindDefaultImplDeserializer_nullDefaultImpl_failDisabled_returnsNullifying() throws IOException {
        JavaType baseType = TypeFactory.defaultInstance().constructType(Object.class);
        TestTypeDeserializer td = new TestTypeDeserializer(baseType, idResolver, "@type", true, null);
        when(ctxt.isEnabled(DeserializationFeature.FAIL_ON_INVALID_SUBTYPE)).thenReturn(false);

        assertSame(NullifyingDeserializer.instance, td.callFindDefaultImplDeserializer(ctxt));
    }

    @Test
    public void testFindDefaultImplDeserializer_nullDefaultImpl_failEnabled_returnsNull() throws IOException {
        JavaType baseType = TypeFactory.defaultInstance().constructType(Object.class);
        TestTypeDeserializer td = new TestTypeDeserializer(baseType, idResolver, "@type", true, null);
        when(ctxt.isEnabled(DeserializationFeature.FAIL_ON_INVALID_SUBTYPE)).thenReturn(true);

        assertNull(td.callFindDefaultImplDeserializer(ctxt));
    }

    @Test
    public void testFindDefaultImplDeserializer_bogusVoidClass_returnsNullifying() throws IOException {
        // Void.class ถูกยืนยันในคอมเมนต์ของ source ว่าเป็น "bogus" class -> NullifyingDeserializer
        JavaType baseType = TypeFactory.defaultInstance().constructType(Object.class);
        TestTypeDeserializer td = new TestTypeDeserializer(baseType, idResolver, "@type", true, Void.class);

        JsonDeserializer<Object> result = td.callFindDefaultImplDeserializer(ctxt);

        assertSame(NullifyingDeserializer.instance, result);
    }

    @Test
    public void testFindDefaultImplDeserializer_nonBogusDefaultImpl_computesAndCaches() throws IOException {
        JavaType baseType = TypeFactory.defaultInstance().constructType(Object.class);
        TestTypeDeserializer td = new TestTypeDeserializer(baseType, idResolver, "@type", true, String.class);

        JsonDeserializer<Object> mockDeser = mockDeserializer();
        when(ctxt.findContextualValueDeserializer(any(JavaType.class), any())).thenReturn(mockDeser);

        JsonDeserializer<Object> r1 = td.callFindDefaultImplDeserializer(ctxt);
        JsonDeserializer<Object> r2 = td.callFindDefaultImplDeserializer(ctxt); // cached branch

        assertSame(mockDeser, r1);
        assertSame(mockDeser, r2);
        verify(ctxt, times(1)).findContextualValueDeserializer(any(JavaType.class), any());
    }

    // =================================================================
    // _deserializeWithNativeTypeId (3-arg) tests
    // =================================================================

    @Test
    public void testDeserializeWithNativeTypeId_nullTypeId_defaultFound() throws IOException {
        JavaType baseType = TypeFactory.defaultInstance().constructType(Object.class);
        TestTypeDeserializer td = new TestTypeDeserializer(baseType, idResolver, "@type", true, String.class);

        JsonDeserializer<Object> mockDeser = mockDeserializer();
        Object expected = new Object();
        when(ctxt.findContextualValueDeserializer(any(JavaType.class), any())).thenReturn(mockDeser);
        when(mockDeser.deserialize(jsonParser, ctxt)).thenReturn(expected);

        Object result = td.callDeserializeWithNativeTypeId(jsonParser, ctxt, null);

        assertSame(expected, result);
    }

    @Test(expected = JsonMappingException.class)
    public void testDeserializeWithNativeTypeId_nullTypeId_defaultNotFound_throwsMappingException() throws IOException {
        JavaType baseType = TypeFactory.defaultInstance().constructType(Object.class);
        TestTypeDeserializer td = new TestTypeDeserializer(baseType, idResolver, "@type", true, null);
        when(ctxt.isEnabled(DeserializationFeature.FAIL_ON_INVALID_SUBTYPE)).thenReturn(true); // deser == null
        when(ctxt.mappingException(anyString())).thenReturn(new JsonMappingException("no type id"));

        td.callDeserializeWithNativeTypeId(jsonParser, ctxt, null);
    }

    @Test
    public void testDeserializeWithNativeTypeId_stringTypeId_usedDirectly() throws IOException {
        JavaType baseType = TypeFactory.defaultInstance().constructType(Object.class);
        TestTypeDeserializer td = new TestTypeDeserializer(baseType, idResolver, "@type", true, null);

        JavaType resolvedType = TypeFactory.defaultInstance().constructType(String.class);
        when(idResolver.typeFromId(eq(ctxt), eq("myType"))).thenReturn(resolvedType);
        JsonDeserializer<Object> mockDeser = mockDeserializer();
        Object expected = new Object();
        when(ctxt.findContextualValueDeserializer(any(JavaType.class), any())).thenReturn(mockDeser);
        when(mockDeser.deserialize(jsonParser, ctxt)).thenReturn(expected);

        Object result = td.callDeserializeWithNativeTypeId(jsonParser, ctxt, "myType");

        assertSame(expected, result);
        verify(idResolver).typeFromId(eq(ctxt), eq("myType"));
    }

    @Test
    public void testDeserializeWithNativeTypeId_nonStringTypeId_convertedViaStringValueOf() throws IOException {
        JavaType baseType = TypeFactory.defaultInstance().constructType(Object.class);
        TestTypeDeserializer td = new TestTypeDeserializer(baseType, idResolver, "@type", true, null);

        Integer typeIdObj = 123;
        JavaType resolvedType = TypeFactory.defaultInstance().constructType(String.class);
        when(idResolver.typeFromId(eq(ctxt), eq("123"))).thenReturn(resolvedType);
        JsonDeserializer<Object> mockDeser = mockDeserializer();
        Object expected = new Object();
        when(ctxt.findContextualValueDeserializer(any(JavaType.class), any())).thenReturn(mockDeser);
        when(mockDeser.deserialize(jsonParser, ctxt)).thenReturn(expected);

        Object result = td.callDeserializeWithNativeTypeId(jsonParser, ctxt, typeIdObj);

        assertSame(expected, result);
        verify(idResolver).typeFromId(eq(ctxt), eq("123"));
    }

    // =================================================================
    // _deserializeWithNativeTypeId (deprecated 2-arg) test
    // =================================================================

    @Test
    public void testDeserializeWithNativeTypeId_deprecatedTwoArg_usesParserGetTypeId() throws IOException {
        JavaType baseType = TypeFactory.defaultInstance().constructType(Object.class);
        TestTypeDeserializer td = new TestTypeDeserializer(baseType, idResolver, "@type", true, null);

        when(jsonParser.getTypeId()).thenReturn("fromParser");
        JavaType resolvedType = TypeFactory.defaultInstance().constructType(String.class);
        when(idResolver.typeFromId(eq(ctxt), eq("fromParser"))).thenReturn(resolvedType);
        JsonDeserializer<Object> mockDeser = mockDeserializer();
        Object expected = new Object();
        when(ctxt.findContextualValueDeserializer(any(JavaType.class), any())).thenReturn(mockDeser);
        when(mockDeser.deserialize(jsonParser, ctxt)).thenReturn(expected);

        Object result = td.callDeserializeWithNativeTypeId(jsonParser, ctxt);

        assertSame(expected, result);
        verify(jsonParser).getTypeId();
    }

    // =================================================================
    // _handleUnknownTypeId tests
    // =================================================================

    @Test(expected = JsonMappingException.class)
    public void testHandleUnknownTypeId_typeIdResolverBase_descNull() throws IOException {
        JavaType baseType = TypeFactory.defaultInstance().constructType(Object.class);
        TestTypeDeserializer td = new TestTypeDeserializer(baseType, idResolver, "@type", true, null);

        TypeIdResolverBase baseResolver = mock(TypeIdResolverBase.class);
        when(baseResolver.getDescForKnownTypeIds()).thenReturn(null);
        when(ctxt.unknownTypeException(any(JavaType.class), anyString(), any()))
                .thenReturn(new JsonMappingException("dummy"));

        td.callHandleUnknownTypeId(ctxt, "unk", baseResolver, baseType);
    }

    @Test(expected = JsonMappingException.class)
    public void testHandleUnknownTypeId_typeIdResolverBase_descNotNull() throws IOException {
        JavaType baseType = TypeFactory.defaultInstance().constructType(Object.class);
        TestTypeDeserializer td = new TestTypeDeserializer(baseType, idResolver, "@type", true, null);

        TypeIdResolverBase baseResolver = mock(TypeIdResolverBase.class);
        when(baseResolver.getDescForKnownTypeIds()).thenReturn("A, B, C");
        when(ctxt.unknownTypeException(any(JavaType.class), anyString(), any()))
                .thenReturn(new JsonMappingException("dummy"));

        td.callHandleUnknownTypeId(ctxt, "unk", baseResolver, baseType);
    }

    @Test(expected = JsonMappingException.class)
    public void testHandleUnknownTypeId_notTypeIdResolverBase_extraDescNull() throws IOException {
        JavaType baseType = TypeFactory.defaultInstance().constructType(Object.class);
        TestTypeDeserializer td = new TestTypeDeserializer(baseType, idResolver, "@type", true, null);

        // idResolver เป็น plain mock ของ TypeIdResolver interface ไม่ใช่ TypeIdResolverBase
        when(ctxt.unknownTypeException(any(JavaType.class), anyString(), any()))
                .thenReturn(new JsonMappingException("dummy"));

        td.callHandleUnknownTypeId(ctxt, "unk", idResolver, baseType);
    }
}
