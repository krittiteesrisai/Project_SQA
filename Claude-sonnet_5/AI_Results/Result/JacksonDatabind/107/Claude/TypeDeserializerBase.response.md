# การวิเคราะห์และแผนการทดสอบ

`TypeDeserializerBase` เป็น abstract class จึงต้องสร้าง concrete subclass (`ConcreteTypeDeserializer`) เพื่อทดสอบ และ expose protected helper methods ผ่าน public wrapper methods สำหรับหน่วยทดสอบ

ประเด็นสำคัญที่ไม่สามารถยืนยัน behavior ได้ 100% จาก source ที่ให้มา (เพราะ implementation อยู่ในคลาสอื่น เช่น `ClassUtil`, `TypeFactory`) จะระบุเป็นคอมเมนต์ `// ASSUMPTION:` ในโค้ด

```java
package com.fasterxml.jackson.databind.jsontype.impl;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import java.io.IOException;

import org.junit.Test;
import org.mockito.ArgumentCaptor;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.jsontype.TypeIdResolver;
import com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase; // target class (same package)
import com.fasterxml.jackson.databind.type.CollectionType;
import com.fasterxml.jackson.databind.type.SimpleType;
import com.fasterxml.jackson.databind.type.TypeFactory;

/**
 * Unit tests for {@link TypeDeserializerBase}.
 *
 * หมายเหตุ: คลาสเป้าหมายเป็น abstract จึงสร้าง subclass ทดสอบภายใน
 * (ConcreteTypeDeserializer) เพื่อให้สามารถ instantiate และเรียก protected
 * helper methods ได้ผ่าน public wrapper methods
 */
public class TypeDeserializerBaseTest {

    // ------------------------------------------------------------------
    // Concrete subclass used purely for testing purposes
    // ------------------------------------------------------------------
    static class ConcreteTypeDeserializer extends TypeDeserializerBase {

        ConcreteTypeDeserializer(JavaType baseType, TypeIdResolver idRes,
                String typePropertyName, boolean typeIdVisible, JavaType defaultImpl) {
            super(baseType, idRes, typePropertyName, typeIdVisible, defaultImpl);
        }

        ConcreteTypeDeserializer(TypeDeserializerBase src, BeanProperty property) {
            super(src, property);
        }

        @Override
        public TypeDeserializer forProperty(BeanProperty prop) {
            return new ConcreteTypeDeserializer(this, prop);
        }

        @Override
        public JsonTypeInfo.As getTypeInclusion() {
            return JsonTypeInfo.As.PROPERTY;
        }

        // ---- wrappers exposing protected helper methods ----
        public JsonDeserializer<Object> callFindDeserializer(DeserializationContext ctxt, String typeId) throws IOException {
            return _findDeserializer(ctxt, typeId);
        }

        public JsonDeserializer<Object> callFindDefaultImplDeserializer(DeserializationContext ctxt) throws IOException {
            return _findDefaultImplDeserializer(ctxt);
        }

        public Object callDeserializeWithNativeTypeIdNoArg(JsonParser jp, DeserializationContext ctxt) throws IOException {
            return _deserializeWithNativeTypeId(jp, ctxt);
        }

        public Object callDeserializeWithNativeTypeId(JsonParser jp, DeserializationContext ctxt, Object typeId) throws IOException {
            return _deserializeWithNativeTypeId(jp, ctxt, typeId);
        }

        public JavaType callHandleUnknownTypeId(DeserializationContext ctxt, String typeId) throws IOException {
            return _handleUnknownTypeId(ctxt, typeId);
        }

        public JavaType callHandleMissingTypeId(DeserializationContext ctxt, String extraDesc) throws IOException {
            return _handleMissingTypeId(ctxt, extraDesc);
        }
    }

    // ==================================================================
    // Constructor / Accessor tests
    // ==================================================================

    @Test
    public void testConstructor_basicAccessors() {
        JavaType baseType = mock(JavaType.class);
        doReturn(String.class).when(baseType).getRawClass();
        TypeIdResolver idRes = mock(TypeIdResolver.class);
        JavaType defaultImpl = mock(JavaType.class);
        doReturn(Object.class).when(defaultImpl).getRawClass();

        ConcreteTypeDeserializer td = new ConcreteTypeDeserializer(
                baseType, idRes, "@type", true, defaultImpl);

        assertEquals("@type", td.getPropertyName());
        assertSame(idRes, td.getTypeIdResolver());
        assertSame(baseType, td.baseType());
        assertEquals("java.lang.String", td.baseTypeName());
        assertEquals(Object.class, td.getDefaultImpl());
    }

    @Test
    public void testConstructor_nullTypePropertyName_becomesEmptyString() {
        // ASSUMPTION: ClassUtil.nonNullString(null) returns "" (standard Jackson util behavior)
        JavaType baseType = mock(JavaType.class);
        TypeIdResolver idRes = mock(TypeIdResolver.class);
        ConcreteTypeDeserializer td = new ConcreteTypeDeserializer(baseType, idRes, null, false, null);
        assertEquals("", td.getPropertyName());
    }

    @Test
    public void testCopyConstructor_forProperty_preservesFieldsAndSetsProperty() {
        JavaType baseType = mock(JavaType.class);
        TypeIdResolver idRes = mock(TypeIdResolver.class);
        ConcreteTypeDeserializer td1 = new ConcreteTypeDeserializer(baseType, idRes, "@type", true, null);
        BeanProperty property = mock(BeanProperty.class);
        when(property.getName()).thenReturn("myProp");

        ConcreteTypeDeserializer td2 = (ConcreteTypeDeserializer) td1.forProperty(property);

        assertNotSame(td1, td2);
        assertEquals(td1.getPropertyName(), td2.getPropertyName());
        assertSame(td1.getTypeIdResolver(), td2.getTypeIdResolver());
        assertSame(td1.baseType(), td2.baseType());
    }

    @Test
    public void testGetDefaultImpl_withType() {
        JavaType defaultImpl = mock(JavaType.class);
        doReturn(String.class).when(defaultImpl).getRawClass();
        ConcreteTypeDeserializer td = new ConcreteTypeDeserializer(
                mock(JavaType.class), mock(TypeIdResolver.class), "type", false, defaultImpl);
        assertEquals(String.class, td.getDefaultImpl());
    }

    @Test
    public void testGetDefaultImpl_nullDefaultImpl() {
        // ASSUMPTION: ClassUtil.rawClass(null) returns null
        ConcreteTypeDeserializer td = new ConcreteTypeDeserializer(
                mock(JavaType.class), mock(TypeIdResolver.class), "type", false, null);
        assertNull(td.getDefaultImpl());
    }

    @Test
    public void testToString_containsExpectedParts() {
        JavaType baseType = mock(JavaType.class);
        TypeIdResolver idRes = mock(TypeIdResolver.class);
        ConcreteTypeDeserializer td = new ConcreteTypeDeserializer(baseType, idRes, "type", false, null);
        String s = td.toString();
        assertTrue(s.contains(ConcreteTypeDeserializer.class.getName()));
        assertTrue(s.contains("base-type:"));
        assertTrue(s.contains("id-resolver:"));
    }

    // ==================================================================
    // _findDefaultImplDeserializer tests
    // ==================================================================

    @Test
    public void testFindDefaultImplDeserializer_nullDefaultImpl_failOnInvalidSubtypeDisabled_returnsNullifying() throws IOException {
        DeserializationContext ctxt = mock(DeserializationContext.class);
        when(ctxt.isEnabled(DeserializationFeature.FAIL_ON_INVALID_SUBTYPE)).thenReturn(false);
        ConcreteTypeDeserializer td = new ConcreteTypeDeserializer(
                mock(JavaType.class), mock(TypeIdResolver.class), "type", false, null);

        JsonDeserializer<Object> result = td.callFindDefaultImplDeserializer(ctxt);
        assertSame(NullifyingDeserializer.instance, result);
    }

    @Test
    public void testFindDefaultImplDeserializer_nullDefaultImpl_failOnInvalidSubtypeEnabled_returnsNull() throws IOException {
        DeserializationContext ctxt = mock(DeserializationContext.class);
        when(ctxt.isEnabled(DeserializationFeature.FAIL_ON_INVALID_SUBTYPE)).thenReturn(true);
        ConcreteTypeDeserializer td = new ConcreteTypeDeserializer(
                mock(JavaType.class), mock(TypeIdResolver.class), "type", false, null);

        JsonDeserializer<Object> result = td.callFindDefaultImplDeserializer(ctxt);
        assertNull(result);
    }

    @Test
    public void testFindDefaultImplDeserializer_bogusClass_returnsNullifying() throws IOException {
        // ASSUMPTION: ClassUtil.isBogusClass(Void.class) == true (known Jackson behavior)
        JavaType defaultImpl = mock(JavaType.class);
        doReturn(Void.class).when(defaultImpl).getRawClass();
        DeserializationContext ctxt = mock(DeserializationContext.class);
        ConcreteTypeDeserializer td = new ConcreteTypeDeserializer(
                mock(JavaType.class), mock(TypeIdResolver.class), "type", false, defaultImpl);

        JsonDeserializer<Object> result = td.callFindDefaultImplDeserializer(ctxt);
        assertSame(NullifyingDeserializer.instance, result);
    }

    @SuppressWarnings("unchecked")
    @Test
    public void testFindDefaultImplDeserializer_normalClass_cachesDeserializer() throws IOException {
        JavaType defaultImpl = mock(JavaType.class);
        doReturn(String.class).when(defaultImpl).getRawClass();
        DeserializationContext ctxt = mock(DeserializationContext.class);
        JsonDeserializer<Object> deser = mock(JsonDeserializer.class);
        when(ctxt.findContextualValueDeserializer(eq(defaultImpl), any())).thenReturn(deser);

        ConcreteTypeDeserializer td = new ConcreteTypeDeserializer(
                mock(JavaType.class), mock(TypeIdResolver.class), "type", false, defaultImpl);

        JsonDeserializer<Object> r1 = td.callFindDefaultImplDeserializer(ctxt);
        JsonDeserializer<Object> r2 = td.callFindDefaultImplDeserializer(ctxt);

        assertSame(deser, r1);
        assertSame(r1, r2);
        // Should only compute once because of _defaultImplDeserializer caching
        verify(ctxt, times(1)).findContextualValueDeserializer(eq(defaultImpl), any());
    }

    // ==================================================================
    // _findDeserializer tests
    // ==================================================================

    @SuppressWarnings("unchecked")
    @Test
    public void testFindDeserializer_cachesResultAcrossCalls() throws IOException {
        TypeIdResolver idRes = mock(TypeIdResolver.class);
        DeserializationContext ctxt = mock(DeserializationContext.class);
        JavaType typeFromId = mock(JavaType.class);
        JsonDeserializer<Object> deser = mock(JsonDeserializer.class);

        when(idRes.typeFromId(ctxt, "tid")).thenReturn(typeFromId);
        when(ctxt.findContextualValueDeserializer(any(JavaType.class), any())).thenReturn(deser);

        // baseType == null -> skips narrowing branch complexities
        ConcreteTypeDeserializer td = new ConcreteTypeDeserializer(null, idRes, "type", false, null);

        JsonDeserializer<Object> r1 = td.callFindDeserializer(ctxt, "tid");
        JsonDeserializer<Object> r2 = td.callFindDeserializer(ctxt, "tid");

        assertSame(deser, r1);
        assertSame(r1, r2);
        verify(idRes, times(1)).typeFromId(ctxt, "tid"); // second call served from cache
    }

    @SuppressWarnings("unchecked")
    @Test
    public void testFindDeserializer_typeFromIdNull_defaultImplFound_returnsDefaultDeserializer() throws IOException {
        TypeIdResolver idRes = mock(TypeIdResolver.class);
        DeserializationContext ctxt = mock(DeserializationContext.class);
        JavaType defaultImpl = mock(JavaType.class);
        doReturn(String.class).when(defaultImpl).getRawClass();
        JsonDeserializer<Object> deser = mock(JsonDeserializer.class);

        when(idRes.typeFromId(ctxt, "tid")).thenReturn(null);
        when(ctxt.findContextualValueDeserializer(eq(defaultImpl), any())).thenReturn(deser);

        ConcreteTypeDeserializer td = new ConcreteTypeDeserializer(null, idRes, "type", false, defaultImpl);
        JsonDeserializer<Object> result = td.callFindDeserializer(ctxt, "tid");

        assertSame(deser, result);
    }

    @SuppressWarnings("unchecked")
    @Test
    public void testFindDeserializer_typeFromIdNull_defaultImplNotFound_unknownTypeHandled_returnsDeserializer() throws IOException {
        TypeIdResolver idRes = mock(TypeIdResolver.class);
        DeserializationContext ctxt = mock(DeserializationContext.class);
        JavaType actualType = mock(JavaType.class);
        JsonDeserializer<Object> deser = mock(JsonDeserializer.class);

        when(idRes.typeFromId(ctxt, "tid")).thenReturn(null);
        when(ctxt.isEnabled(DeserializationFeature.FAIL_ON_INVALID_SUBTYPE)).thenReturn(true); // -> default impl deser null
        when(idRes.getDescForKnownTypeIds()).thenReturn(null);
        when(ctxt.handleUnknownTypeId(any(JavaType.class), eq("tid"), eq(idRes), any(String.class)))
                .thenReturn(actualType);
        when(ctxt.findContextualValueDeserializer(eq(actualType), any())).thenReturn(deser);

        ConcreteTypeDeserializer td = new ConcreteTypeDeserializer(
                mock(JavaType.class), idRes, "type", false, null);
        JsonDeserializer<Object> result = td.callFindDeserializer(ctxt, "tid");

        assertSame(deser, result);
    }

    @Test
    public void testFindDeserializer_typeFromIdNull_defaultImplNotFound_unknownTypeUnresolved_returnsNull() throws IOException {
        TypeIdResolver idRes = mock(TypeIdResolver.class);
        DeserializationContext ctxt = mock(DeserializationContext.class);

        when(idRes.typeFromId(ctxt, "tid")).thenReturn(null);
        when(ctxt.isEnabled(DeserializationFeature.FAIL_ON_INVALID_SUBTYPE)).thenReturn(true);
        when(idRes.getDescForKnownTypeIds()).thenReturn("A,B");
        when(ctxt.handleUnknownTypeId(any(JavaType.class), eq("tid"), eq(idRes), any(String.class)))
                .thenReturn(null);

        ConcreteTypeDeserializer td = new ConcreteTypeDeserializer(
                mock(JavaType.class), idRes, "type", false, null);
        JsonDeserializer<Object> result = td.callFindDeserializer(ctxt, "tid");

        assertNull(result);
    }

    @SuppressWarnings("unchecked")
    @Test
    public void testFindDeserializer_baseTypeNull_skipsNarrowing() throws IOException {
        TypeIdResolver idRes = mock(TypeIdResolver.class);
        DeserializationContext ctxt = mock(DeserializationContext.class);
        JavaType typeFromId = mock(JavaType.class);
        JsonDeserializer<Object> deser = mock(JsonDeserializer.class);

        when(idRes.typeFromId(ctxt, "tid")).thenReturn(typeFromId);
        when(ctxt.findContextualValueDeserializer(same(typeFromId), any())).thenReturn(deser);

        ConcreteTypeDeserializer td = new ConcreteTypeDeserializer(null, idRes, "type", false, null);
        JsonDeserializer<Object> result = td.callFindDeserializer(ctxt, "tid");

        assertSame(deser, result);
        verify(ctxt, never()).getTypeFactory();
    }

    @SuppressWarnings("unchecked")
    @Test
    public void testFindDeserializer_differentRuntimeClass_skipsNarrowing() throws IOException {
        TypeIdResolver idRes = mock(TypeIdResolver.class);
        DeserializationContext ctxt = mock(DeserializationContext.class);
        SimpleType baseType = mock(SimpleType.class);
        CollectionType typeFromId = mock(CollectionType.class); // different runtime class than SimpleType
        JsonDeserializer<Object> deser = mock(JsonDeserializer.class);

        when(idRes.typeFromId(ctxt, "tid")).thenReturn(typeFromId);
        when(ctxt.findContextualValueDeserializer(same(typeFromId), any())).thenReturn(deser);

        ConcreteTypeDeserializer td = new ConcreteTypeDeserializer(baseType, idRes, "type", false, null);
        JsonDeserializer<Object> result = td.callFindDeserializer(ctxt, "tid");

        assertSame(deser, result);
        verify(ctxt, never()).getTypeFactory();
    }

    @SuppressWarnings("unchecked")
    @Test
    public void testFindDeserializer_sameClass_hasGenericTypes_skipsNarrowingCall() throws IOException {
        TypeIdResolver idRes = mock(TypeIdResolver.class);
        DeserializationContext ctxt = mock(DeserializationContext.class);
        SimpleType baseType = mock(SimpleType.class);
        SimpleType typeFromId = mock(SimpleType.class); // same runtime class as baseType
        when(typeFromId.hasGenericTypes()).thenReturn(true); // -> skip constructSpecializedType
        JsonDeserializer<Object> deser = mock(JsonDeserializer.class);

        when(idRes.typeFromId(ctxt, "tid")).thenReturn(typeFromId);
        when(ctxt.findContextualValueDeserializer(same(typeFromId), any())).thenReturn(deser);

        ConcreteTypeDeserializer td = new ConcreteTypeDeserializer(baseType, idRes, "type", false, null);
        JsonDeserializer<Object> result = td.callFindDeserializer(ctxt, "tid");

        assertSame(deser, result);
        verify(ctxt, never()).getTypeFactory(); // narrowing call is skipped
    }

    @SuppressWarnings("unchecked")
    @Test
    public void testFindDeserializer_sameClass_noGenericTypes_narrowsViaTypeFactory() throws IOException {
        // ASSUMPTION: for simple non-parameterized classes, JavaType.hasGenericTypes() == false,
        // and TypeFactory.constructSpecializedType(Number, Integer.class) works to narrow type.
        TypeIdResolver idRes = mock(TypeIdResolver.class);
        DeserializationContext ctxt = mock(DeserializationContext.class);
        JavaType baseType = TypeFactory.defaultInstance().constructType(Number.class);
        JavaType typeFromId = TypeFactory.defaultInstance().constructType(Integer.class);
        @SuppressWarnings("rawtypes")
        JsonDeserializer deser = mock(JsonDeserializer.class);

        when(idRes.typeFromId(ctxt, "tid")).thenReturn(typeFromId);
        when(ctxt.getTypeFactory()).thenReturn(TypeFactory.defaultInstance());
        ArgumentCaptor<JavaType> captor = ArgumentCaptor.forClass(JavaType.class);
        when(ctxt.findContextualValueDeserializer(captor.capture(), any())).thenReturn(deser);

        ConcreteTypeDeserializer td = new ConcreteTypeDeserializer(baseType, idRes, "type", false, null);
        JsonDeserializer<Object> result = td.callFindDeserializer(ctxt, "tid");

        assertSame(deser, result);
        verify(ctxt, times(1)).getTypeFactory(); // confirms narrowing branch executed
        assertEquals(Integer.class, captor.getValue().getRawClass());
    }

    // ==================================================================
    // _deserializeWithNativeTypeId tests
    // ==================================================================

    @SuppressWarnings("unchecked")
    @Test
    public void testDeserializeWithNativeTypeId_noArgOverload_delegatesToParserTypeId() throws IOException {
        TypeIdResolver idRes = mock(TypeIdResolver.class);
        DeserializationContext ctxt = mock(DeserializationContext.class);
        JsonParser jp = mock(JsonParser.class);
        JavaType typeFromId = mock(JavaType.class);
        JsonDeserializer<Object> deser = mock(JsonDeserializer.class);

        when(jp.getTypeId()).thenReturn("tidX");
        when(idRes.typeFromId(ctxt, "tidX")).thenReturn(typeFromId);
        when(ctxt.findContextualValueDeserializer(same(typeFromId), any())).thenReturn(deser);
        when(deser.deserialize(jp, ctxt)).thenReturn("OUT");

        ConcreteTypeDeserializer td = new ConcreteTypeDeserializer(null, idRes, "type", false, null);
        Object result = td.callDeserializeWithNativeTypeIdNoArg(jp, ctxt);

        assertEquals("OUT", result);
        verify(jp).getTypeId();
    }

    @SuppressWarnings("unchecked")
    @Test
    public void testDeserializeWithNativeTypeId_typeIdIsString() throws IOException {
        TypeIdResolver idRes = mock(TypeIdResolver.class);
        DeserializationContext ctxt = mock(DeserializationContext.class);
        JsonParser jp = mock(JsonParser.class);
        JavaType typeFromId = mock(JavaType.class);
        JsonDeserializer<Object> deser = mock(JsonDeserializer.class);

        when(idRes.typeFromId(ctxt, "strTid")).thenReturn(typeFromId);
        when(ctxt.findContextualValueDeserializer(same(typeFromId), any())).thenReturn(deser);
        when(deser.deserialize(jp, ctxt)).thenReturn("RESULT");

        ConcreteTypeDeserializer td = new ConcreteTypeDeserializer(null, idRes, "type", false, null);
        Object result = td.callDeserializeWithNativeTypeId(jp, ctxt, "strTid");

        assertEquals("RESULT", result);
    }

    @SuppressWarnings("unchecked")
    @Test
    public void testDeserializeWithNativeTypeId_typeIdIsNonString_convertsToString() throws IOException {
        TypeIdResolver idRes = mock(TypeIdResolver.class);
        DeserializationContext ctxt = mock(DeserializationContext.class);
        JsonParser jp = mock(JsonParser.class);
        JavaType typeFromId = mock(JavaType.class);
        JsonDeserializer<Object> deser = mock(JsonDeserializer.class);

        when(idRes.typeFromId(ctxt, "123")).thenReturn(typeFromId);
        when(ctxt.findContextualValueDeserializer(same(typeFromId), any())).thenReturn(deser);
        when(deser.deserialize(jp, ctxt)).thenReturn("RESULT123");

        ConcreteTypeDeserializer td = new ConcreteTypeDeserializer(null, idRes, "type", false, null);
        Object result = td.callDeserializeWithNativeTypeId(jp, ctxt, Integer.valueOf(123));

        assertEquals("RESULT123", result);
        verify(idRes).typeFromId(ctxt, "123"); // confirms String.valueOf conversion
    }

    @SuppressWarnings("unchecked")
    @Test
    public void testDeserializeWithNativeTypeId_typeIdNull_defaultDeserializerFound() throws IOException {
        DeserializationContext ctxt = mock(DeserializationContext.class);
        JsonParser jp = mock(JsonParser.class);
        JavaType defaultImpl = mock(JavaType.class);
        doReturn(String.class).when(defaultImpl).getRawClass();
        JsonDeserializer<Object> deser = mock(JsonDeserializer.class);

        when(ctxt.findContextualValueDeserializer(eq(defaultImpl), any())).thenReturn(deser);
        when(deser.deserialize(jp, ctxt)).thenReturn("DEFAULT_OUT");

        ConcreteTypeDeserializer td = new ConcreteTypeDeserializer(
                mock(JavaType.class), mock(TypeIdResolver.class), "type", false, defaultImpl);
        Object result = td.callDeserializeWithNativeTypeId(jp, ctxt, null);

        assertEquals("DEFAULT_OUT", result);
    }

    @Test(expected = RuntimeException.class)
    public void testDeserializeWithNativeTypeId_typeIdNull_noDefaultDeserializer_throws() throws IOException {
        DeserializationContext ctxt = mock(DeserializationContext.class);
        JsonParser jp = mock(JsonParser.class);

        when(ctxt.isEnabled(DeserializationFeature.FAIL_ON_INVALID_SUBTYPE)).thenReturn(true); // -> default impl deser == null
        // reportInputMismatch always throws in real implementation; simulate via unchecked exception
        when(ctxt.reportInputMismatch(any(JavaType.class), anyString()))
                .thenThrow(new RuntimeException("no type id"));

        ConcreteTypeDeserializer td = new ConcreteTypeDeserializer(
                mock(JavaType.class), mock(TypeIdResolver.class), "type", false, null);

        td.callDeserializeWithNativeTypeId(jp, ctxt, null); // expect RuntimeException propagates
    }

    // ==================================================================
    // _handleUnknownTypeId / _handleMissingTypeId tests
    // ==================================================================

    @Test
    public void testHandleUnknownTypeId_noDescNoProperty() throws IOException {
        TypeIdResolver idRes = mock(TypeIdResolver.class);
        DeserializationContext ctxt = mock(DeserializationContext.class);
        JavaType baseType = mock(JavaType.class);
        JavaType expected = mock(JavaType.class);

        when(idRes.getDescForKnownTypeIds()).thenReturn(null);
        ArgumentCaptor<String> descCaptor = ArgumentCaptor.forClass(String.class);
        when(ctxt.handleUnknownTypeId(eq(baseType), eq("tid"), eq(idRes), descCaptor.capture()))
                .thenReturn(expected);

        ConcreteTypeDeserializer td = new ConcreteTypeDeserializer(baseType, idRes, "type", false, null);
        JavaType result = td.callHandleUnknownTypeId(ctxt, "tid");

        assertSame(expected, result);
        assertEquals("type ids are not statically known", descCaptor.getValue());
    }

    @Test
    public void testHandleUnknownTypeId_withDescAndProperty() throws IOException {
        TypeIdResolver idRes = mock(TypeIdResolver.class);
        DeserializationContext ctxt = mock(DeserializationContext.class);
        JavaType baseType = mock(JavaType.class);
        JavaType expected = mock(JavaType.class);
        BeanProperty property = mock(BeanProperty.class);
        when(property.getName()).thenReturn("propX");
        when(idRes.getDescForKnownTypeIds()).thenReturn("A, B");

        ArgumentCaptor<String> descCaptor = ArgumentCaptor.forClass(String.class);
        when(ctxt.handleUnknownTypeId(eq(baseType), eq("tid"), eq(idRes), descCaptor.capture()))
                .thenReturn(expected);

        ConcreteTypeDeserializer base = new ConcreteTypeDeserializer(baseType, idRes, "type", false, null);
        ConcreteTypeDeserializer td = (ConcreteTypeDeserializer) base.forProperty(property);

        JavaType result = td.callHandleUnknownTypeId(ctxt, "tid");

        assertSame(expected, result);
        assertEquals("known type ids = A, B (for POJO property 'propX')", descCaptor.getValue());
    }

    @Test
    public void testHandleMissingTypeId_delegatesToContext() throws IOException {
        TypeIdResolver idRes = mock(TypeIdResolver.class);
        DeserializationContext ctxt = mock(DeserializationContext.class);
        JavaType baseType = mock(JavaType.class);
        JavaType expected = mock(JavaType.class);

        when(ctxt.handleMissingTypeId(eq(baseType), eq(idRes), eq("extraInfo"))).thenReturn(expected);

        ConcreteTypeDeserializer td = new ConcreteTypeDeserializer(baseType, idRes, "type", false, null);
        JavaType result = td.callHandleMissingTypeId(ctxt, "extraInfo");

        assertSame(expected, result);
        verify(ctxt).handleMissingTypeId(baseType, idRes, "extraInfo");
    }
}
```

## ตาราง สรุป Test Method → Branch/Condition ที่ครอบคลุม

| Test Method | Branch / Condition ที่ครอบคลุม |
|---|---|
| testConstructor_basicAccessors | primary constructor, getPropertyName/getTypeIdResolver/baseType/baseTypeName/getDefaultImpl (non-null path) |
| testConstructor_nullTypePropertyName_becomesEmptyString | `ClassUtil.nonNullString(null)` path |
| testCopyConstructor_forProperty_preservesFieldsAndSetsProperty | copy-constructor, `forProperty()` |
| testGetDefaultImpl_withType / _nullDefaultImpl | `getDefaultImpl()` ทั้ง non-null/null |
| testToString_containsExpectedParts | `toString()` |
| testFindDefaultImplDeserializer_nullDefaultImpl_failOnInvalidSubtypeDisabled | `_defaultImpl==null && !isEnabled(FAIL_ON_INVALID_SUBTYPE)` → NullifyingDeserializer |
| testFindDefaultImplDeserializer_nullDefaultImpl_failOnInvalidSubtypeEnabled | `_defaultImpl==null && isEnabled(...)` → null |
| testFindDefaultImplDeserializer_bogusClass | `isBogusClass(raw)==true` → NullifyingDeserializer |
| testFindDefaultImplDeserializer_normalClass_cachesDeserializer | normal path + caching (`_defaultImplDeserializer==null` once) |
| testFindDeserializer_cachesResultAcrossCalls | cache hit (`deser != null` จาก map) |
| testFindDeserializer_typeFromIdNull_defaultImplFound | `type==null` → default impl deser found |
| testFindDeserializer_typeFromIdNull_defaultImplNotFound_unknownTypeHandled | `type==null`, default null, `_handleUnknownTypeId` resolved |
| testFindDeserializer_typeFromIdNull_defaultImplNotFound_unknownTypeUnresolved | `actual==null` → return null |
| testFindDeserializer_baseTypeNull_skipsNarrowing | `_baseType==null` short-circuit |
| testFindDeserializer_differentRuntimeClass_skipsNarrowing | `_baseType.getClass()!=type.getClass()` |
| testFindDeserializer_sameClass_hasGenericTypes_skipsNarrowingCall | classes equal, `hasGenericTypes()==true` skip narrow |
| testFindDeserializer_sameClass_noGenericTypes_narrowsViaTypeFactory | classes equal, `hasGenericTypes()==false` → `constructSpecializedType` |
| testDeserializeWithNativeTypeId_noArgOverload_* | 1-arg overload → `jp.getTypeId()` |
| testDeserializeWithNativeTypeId_typeIdIsString | `typeId instanceof String` true |
| testDeserializeWithNativeTypeId_typeIdIsNonString_convertsToString | `typeId instanceof String` false → `String.valueOf` |
| testDeserializeWithNativeTypeId_typeIdNull_defaultDeserializerFound | `typeId==null`, deser != null |
| testDeserializeWithNativeTypeId_typeIdNull_noDefaultDeserializer_throws | `typeId==null`, deser==null → reportInputMismatch throws |
| testHandleUnknownTypeId_noDescNoProperty | `extraDesc==null`, `_property==null` |
| testHandleUnknownTypeId_withDescAndProperty | `extraDesc!=null`, `_property!=null` |
| testHandleMissingTypeId_delegatesToContext | `_handleMissingTypeId` pass-through |

**หมายเหตุสำคัญ (Assumptions ที่ทำเครื่องหมายในโค้ด):**
- `ClassUtil.nonNullString(null)` → `""`
- `ClassUtil.rawClass(null)` → `null`
- `ClassUtil.isBogusClass(Void.class)` → `true`
- `JavaType.hasGenericTypes()` เป็น `false` สำหรับ simple non-parameterized type จาก `TypeFactory`

เนื่องจาก implementation จริงของ helper classes เหล่านี้ไม่ได้อยู่ใน source ที่ให้มา จึงไม่สามารถยืนยัน behavior ได้ 100% — หากพบว่า assumption ผิด ให้ปรับ stub/assert ตาม behavior จริงของเวอร์ชันที่ใช้ทดสอบ