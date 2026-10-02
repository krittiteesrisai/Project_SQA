# การวิเคราะห์และสร้างชุดทดสอบ DeserializerCacheTest

## หมายเหตุสำคัญ (ตามข้อกำหนดที่ 4 - ห้ามเดา behavior)

ต่อไปนี้คือ branch ที่**ไม่ได้ครอบคลุม**พร้อมเหตุผล (ไม่เดา behavior ที่ไม่มีหลักฐานแน่ชัด):
- Branch ใน `_createDeserializer2` ที่ต้อง cast เป็น `ArrayType`, `MapType`, `CollectionType`, `ReferenceType` — คลาสเหล่านี้อาจเป็น `final` ใน jackson-databind ทำให้ Mockito mock ไม่ได้ด้วย mock-maker มาตรฐาน จึงไม่ทดสอบเพื่อเลี่ยงการเดาผลลัพธ์ที่ไม่แน่ใจ
- Branch `isMapLikeType()` ภายใน `modifyTypeByAnnotation` (ต้อง cast เป็น `MapLikeType`) — มีความเสี่ยงเดียวกัน จึงข้ามไป
- พฤติกรรมภายในของ `JsonMappingException.from(...)` และ exact return-type ของ `ctxt.reportMappingException(...)` ไม่มีซอร์สให้ดู จึงทดสอบเฉพาะ**จำนวนครั้งที่ถูกเรียก**และผลลัพธ์ที่ได้จาก `DeserializerCache` เท่านั้น ไม่ได้ทดสอบ behavior ภายใน method เหล่านั้น

```java
package com.fasterxml.jackson.databind.deser;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import org.junit.Before;
import org.junit.Test;

import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.BeanDescription;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.KeyDeserializer;
import com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer;
import com.fasterxml.jackson.databind.introspect.Annotated;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.fasterxml.jackson.databind.util.Converter;

/**
 * Unit tests for {@link DeserializerCache}.
 *
 * หมายเหตุ: คลาสทดสอบนี้อยู่ใน package เดียวกับคลาสเป้าหมาย (com.fasterxml.jackson.databind.deser)
 * เพื่อให้สามารถเรียก protected method และ field ได้โดยตรง (ไม่ใช้ reflection)
 * ส่วน private method (_hasCustomHandlers, _verifyAsClass, modifyTypeByAnnotation)
 * ใช้ reflection ในการเข้าถึง
 */
@SuppressWarnings({"unchecked", "rawtypes"})
public class DeserializerCacheTest {

    private DeserializerCache cache;
    private JavaType type;
    private DeserializationContext ctxt;
    private DeserializationConfig config;
    private BeanDescription beanDesc;
    private AnnotationIntrospector intr;
    private Annotated ann;
    private DeserializerFactory factory;

    @Before
    public void setUp() {
        cache = new DeserializerCache();

        type = mock(JavaType.class);
        ctxt = mock(DeserializationContext.class);
        config = mock(DeserializationConfig.class);
        beanDesc = mock(BeanDescription.class);
        intr = mock(AnnotationIntrospector.class);
        ann = mock(Annotated.class);
        factory = mock(DeserializerFactory.class);

        // Baseline: "plain" type -> ไม่ abstract, ไม่ container, ไม่ enum, ไม่ reference
        // -> เส้นทางจะจบที่ factory.createBeanDeserializer(...)
        when(type.isAbstract()).thenReturn(false);
        when(type.isMapLikeType()).thenReturn(false);
        when(type.isCollectionLikeType()).thenReturn(false);
        when(type.isContainerType()).thenReturn(false);
        when(type.isEnumType()).thenReturn(false);
        when(type.isReferenceType()).thenReturn(false);
        when(type.getContentType()).thenReturn(null);
        when(type.getRawClass()).thenReturn((Class) Object.class);

        when(ctxt.getConfig()).thenReturn(config);
        when(ctxt.getAnnotationIntrospector()).thenReturn(intr);
        when(config.introspect(type)).thenReturn(beanDesc);
        when(beanDesc.getClassInfo()).thenReturn(ann);
        when(beanDesc.findPOJOBuilder()).thenReturn(null);
        when(beanDesc.findDeserializationConverter()).thenReturn(null);
        when(intr.findDeserializer(ann)).thenReturn(null);
        when(intr.refineDeserializationType(eq(config), eq(ann), any(JavaType.class)))
                .thenReturn(type);
    }

    // ---------------------------------------------------------------
    // Reflection helpers for private methods
    // ---------------------------------------------------------------

    private boolean invokeHasCustomHandlers(JavaType t) throws Exception {
        Method m = DeserializerCache.class.getDeclaredMethod("_hasCustomHandlers", JavaType.class);
        m.setAccessible(true);
        return (Boolean) m.invoke(cache, t);
    }

    private Object invokeVerifyAsClass(Object src, String methodName, Class<?> noneClass) throws Exception {
        Method m = DeserializerCache.class.getDeclaredMethod(
                "_verifyAsClass", Object.class, String.class, Class.class);
        m.setAccessible(true);
        try {
            return m.invoke(cache, src, methodName, noneClass);
        } catch (InvocationTargetException e) {
            if (e.getCause() instanceof RuntimeException) {
                throw (RuntimeException) e.getCause();
            }
            throw e;
        }
    }

    private JavaType invokeModifyTypeByAnnotation(DeserializationContext c, Annotated a, JavaType t) throws Exception {
        Method m = DeserializerCache.class.getDeclaredMethod(
                "modifyTypeByAnnotation", DeserializationContext.class, Annotated.class, JavaType.class);
        m.setAccessible(true);
        return (JavaType) m.invoke(cache, c, a, t);
    }

    // =================================================================
    // 1-2: cachedDeserializersCount / flushCachedDeserializers
    // =================================================================

    @Test
    public void testCachedDeserializersCount_InitiallyZero() {
        assertEquals(0, cache.cachedDeserializersCount());
    }

    @Test
    public void testFlushCachedDeserializers_ClearsCache() {
        JavaType t = mock(JavaType.class);
        cache._cachedDeserializers.put(t, mock(JsonDeserializer.class));
        assertEquals(1, cache.cachedDeserializersCount());

        cache.flushCachedDeserializers();

        assertEquals(0, cache.cachedDeserializersCount());
    }

    // =================================================================
    // 3-6: _findCachedDeserializer
    // =================================================================

    @Test(expected = IllegalArgumentException.class)
    public void testFindCachedDeserializer_NullType_ThrowsIllegalArgumentException() {
        cache._findCachedDeserializer(null);
    }

    @Test
    public void testFindCachedDeserializer_HasCustomHandlers_ReturnsNull() {
        JavaType t = mock(JavaType.class);
        JavaType ct = mock(JavaType.class);
        when(t.isContainerType()).thenReturn(true);
        when(t.getContentType()).thenReturn(ct);
        when(ct.getValueHandler()).thenReturn(new Object());

        assertNull(cache._findCachedDeserializer(t));
    }

    @Test
    public void testFindCachedDeserializer_NotCached_ReturnsNull() {
        JavaType t = mock(JavaType.class);
        when(t.isContainerType()).thenReturn(false);

        assertNull(cache._findCachedDeserializer(t));
    }

    @Test
    public void testFindCachedDeserializer_Cached_ReturnsDeserializer() {
        JavaType t = mock(JavaType.class);
        when(t.isContainerType()).thenReturn(false);
        JsonDeserializer<Object> deser = mock(JsonDeserializer.class);
        cache._cachedDeserializers.put(t, deser);

        assertSame(deser, cache._findCachedDeserializer(t));
    }

    // =================================================================
    // 7-11: _hasCustomHandlers (private, via reflection)
    // =================================================================

    @Test
    public void testHasCustomHandlers_NotContainerType_ReturnsFalse() throws Exception {
        JavaType t = mock(JavaType.class);
        when(t.isContainerType()).thenReturn(false);
        assertFalse(invokeHasCustomHandlers(t));
    }

    @Test
    public void testHasCustomHandlers_ContainerType_ContentTypeNull_ReturnsFalse() throws Exception {
        JavaType t = mock(JavaType.class);
        when(t.isContainerType()).thenReturn(true);
        when(t.getContentType()).thenReturn(null);
        assertFalse(invokeHasCustomHandlers(t));
    }

    @Test
    public void testHasCustomHandlers_ContentValueHandlerPresent_ReturnsTrue() throws Exception {
        JavaType t = mock(JavaType.class);
        JavaType ct = mock(JavaType.class);
        when(t.isContainerType()).thenReturn(true);
        when(t.getContentType()).thenReturn(ct);
        when(ct.getValueHandler()).thenReturn(new Object());
        when(ct.getTypeHandler()).thenReturn(null);
        assertTrue(invokeHasCustomHandlers(t));
    }

    @Test
    public void testHasCustomHandlers_ContentTypeHandlerPresent_ReturnsTrue() throws Exception {
        JavaType t = mock(JavaType.class);
        JavaType ct = mock(JavaType.class);
        when(t.isContainerType()).thenReturn(true);
        when(t.getContentType()).thenReturn(ct);
        when(ct.getValueHandler()).thenReturn(null);
        when(ct.getTypeHandler()).thenReturn(new Object());
        assertTrue(invokeHasCustomHandlers(t));
    }

    @Test
    public void testHasCustomHandlers_NoHandlers_ReturnsFalse() throws Exception {
        JavaType t = mock(JavaType.class);
        JavaType ct = mock(JavaType.class);
        when(t.isContainerType()).thenReturn(true);
        when(t.getContentType()).thenReturn(ct);
        when(ct.getValueHandler()).thenReturn(null);
        when(ct.getTypeHandler()).thenReturn(null);
        assertFalse(invokeHasCustomHandlers(t));
    }

    // =================================================================
    // 12-15: _verifyAsClass (private, via reflection)
    // =================================================================

    @Test
    public void testVerifyAsClass_NullSrc_ReturnsNull() throws Exception {
        assertNull(invokeVerifyAsClass(null, "findXxx", JsonDeserializer.None.class));
    }

    @Test(expected = IllegalStateException.class)
    public void testVerifyAsClass_SrcNotClass_ThrowsIllegalStateException() throws Exception {
        invokeVerifyAsClass("notAClassInstance", "findXxx", JsonDeserializer.None.class);
    }

    @Test
    public void testVerifyAsClass_SrcEqualsNoneClass_ReturnsNull() throws Exception {
        assertNull(invokeVerifyAsClass(JsonDeserializer.None.class, "findXxx", JsonDeserializer.None.class));
    }

    @Test
    public void testVerifyAsClass_NormalClass_ReturnsClass() throws Exception {
        assertEquals(String.class, invokeVerifyAsClass(String.class, "findXxx", JsonDeserializer.None.class));
    }

    // =================================================================
    // 16-18: findValueDeserializer
    // =================================================================

    @Test
    public void testFindValueDeserializer_CreatesCachesAndReturnsBeanDeserializer() throws Exception {
        JsonDeserializer<Object> deser = mock(JsonDeserializer.class);
        when(deser.isCachable()).thenReturn(true);
        when(factory.createBeanDeserializer(ctxt, type, beanDesc)).thenReturn(deser);

        JsonDeserializer<Object> result = cache.findValueDeserializer(ctxt, factory, type);

        assertSame(deser, result);
        assertEquals(1, cache.cachedDeserializersCount());
        verify(factory).createBeanDeserializer(ctxt, type, beanDesc);
    }

    @Test
    public void testFindValueDeserializer_ConcreteType_NullResult_HandleUnknownCalledOnce_ReturnsNull() throws Exception {
        when(factory.createBeanDeserializer(ctxt, type, beanDesc)).thenReturn(null);
        when(type.getRawClass()).thenReturn((Class) Object.class); // concrete

        JsonDeserializer<Object> result = cache.findValueDeserializer(ctxt, factory, type);

        assertNull(result);
        verify(ctxt, times(1)).reportMappingException(anyString(), any());
    }

    @Test
    public void testFindValueDeserializer_AbstractType_NullResult_HandleUnknownCalledTwice_ReturnsNull() throws Exception {
        when(factory.createBeanDeserializer(ctxt, type, beanDesc)).thenReturn(null);
        when(type.getRawClass()).thenReturn((Class) java.util.AbstractList.class); // abstract

        JsonDeserializer<Object> result = cache.findValueDeserializer(ctxt, factory, type);

        assertNull(result);
        verify(ctxt, times(2)).reportMappingException(anyString(), any());
    }

    // =================================================================
    // 19-21: hasValueDeserializerFor
    // =================================================================

    @Test
    public void testHasValueDeserializerFor_CachedType_ReturnsTrueWithoutFactoryCall() throws Exception {
        cache._cachedDeserializers.put(type, mock(JsonDeserializer.class));

        boolean result = cache.hasValueDeserializerFor(ctxt, factory, type);

        assertTrue(result);
        verifyZeroInteractions(factory);
    }

    @Test
    public void testHasValueDeserializerFor_CreatedSuccessfully_ReturnsTrue() throws Exception {
        JsonDeserializer<Object> deser = mock(JsonDeserializer.class);
        when(deser.isCachable()).thenReturn(true);
        when(factory.createBeanDeserializer(ctxt, type, beanDesc)).thenReturn(deser);

        assertTrue(cache.hasValueDeserializerFor(ctxt, factory, type));
    }

    @Test
    public void testHasValueDeserializerFor_CreationFails_ReturnsFalseAndNoHandleUnknown() throws Exception {
        when(factory.createBeanDeserializer(ctxt, type, beanDesc)).thenReturn(null);

        boolean result = cache.hasValueDeserializerFor(ctxt, factory, type);

        assertFalse(result);
        // hasValueDeserializerFor ไม่เรียก _handleUnknownValueDeserializer ตาม source
        verify(ctxt, never()).reportMappingException(anyString(), any());
    }

    // =================================================================
    // 22-24: findKeyDeserializer
    // =================================================================

    @Test
    public void testFindKeyDeserializer_FactoryReturnsNull_HandlesUnknownReturnsNull() throws Exception {
        when(factory.createKeyDeserializer(ctxt, type)).thenReturn(null);

        KeyDeserializer result = cache.findKeyDeserializer(ctxt, factory, type);

        assertNull(result);
        verify(ctxt, times(1)).reportMappingException(anyString(), any());
    }

    @Test
    public void testFindKeyDeserializer_NonResolvable_ReturnsDirectly() throws Exception {
        KeyDeserializer kd = mock(KeyDeserializer.class);
        when(factory.createKeyDeserializer(ctxt, type)).thenReturn(kd);

        KeyDeserializer result = cache.findKeyDeserializer(ctxt, factory, type);

        assertSame(kd, result);
    }

    @Test
    public void testFindKeyDeserializer_Resolvable_ResolveCalled() throws Exception {
        KeyDeserializer kd = mock(KeyDeserializer.class,
                withSettings().extraInterfaces(ResolvableDeserializer.class));
        when(factory.createKeyDeserializer(ctxt, type)).thenReturn(kd);

        KeyDeserializer result = cache.findKeyDeserializer(ctxt, factory, type);

        assertSame(kd, result);
        verify((ResolvableDeserializer) kd).resolve(ctxt);
    }

    // =================================================================
    // 25: _createAndCacheValueDeserializer - race condition branch
    // =================================================================

    @Test
    public void testCreateAndCacheValueDeserializer_IncompleteFound_ReturnsWithoutFactoryCall() throws Exception {
        JsonDeserializer<Object> incompleteDeser = mock(JsonDeserializer.class);
        cache._incompleteDeserializers.put(type, incompleteDeser);

        JsonDeserializer<Object> result = cache._createAndCacheValueDeserializer(ctxt, factory, type);

        assertSame(incompleteDeser, result);
        verifyZeroInteractions(factory);
    }

    // =================================================================
    // 26-28: _createAndCache2
    // =================================================================

    @Test(expected = JsonMappingException.class)
    public void testCreateAndCache2_IllegalArgumentException_WrappedAsJsonMappingException() throws Exception {
        // สมมติฐาน (ระบุไว้ชัดเจน): JsonMappingException.from(ctxt, msg, cause) ไม่ throw NPE
        // เมื่อ ctxt เป็น mock ที่ยังไม่ stub ค่าใด ๆ (พฤติกรรมจริงของ Jackson)
        when(type.isAbstract()).thenReturn(true);
        when(factory.mapAbstractType(config, type)).thenThrow(new IllegalArgumentException("bad abstract mapping"));

        cache._createAndCache2(ctxt, factory, type);
    }

    @Test
    public void testCreateAndCache2_NotCachable_NotAddedToCache() throws Exception {
        JsonDeserializer<Object> deser = mock(JsonDeserializer.class);
        when(deser.isCachable()).thenReturn(false);
        when(factory.createBeanDeserializer(ctxt, type, beanDesc)).thenReturn(deser);

        JsonDeserializer<Object> result = cache._createAndCache2(ctxt, factory, type);

        assertSame(deser, result);
        assertEquals(0, cache.cachedDeserializersCount());
    }

    @Test
    public void testCreateAndCache2_ResolvableDeserializer_ResolveCalledAndIncompleteMapCleanedUp() throws Exception {
        JsonDeserializer<Object> deser = mock(JsonDeserializer.class,
                withSettings().extraInterfaces(ResolvableDeserializer.class));
        when(deser.isCachable()).thenReturn(true);
        when(factory.createBeanDeserializer(ctxt, type, beanDesc)).thenReturn(deser);

        JsonDeserializer<Object> result = cache._createAndCache2(ctxt, factory, type);

        assertSame(deser, result);
        verify((ResolvableDeserializer) deser).resolve(ctxt);
        assertTrue(cache._incompleteDeserializers.isEmpty());
        assertEquals(1, cache.cachedDeserializersCount());
    }

    // =================================================================
    // 29-31: _createDeserializer2
    // =================================================================

    @Test
    public void testCreateDeserializer2_EnumType_UsesEnumDeserializer() throws Exception {
        when(type.isEnumType()).thenReturn(true);
        JsonDeserializer<Object> deser = mock(JsonDeserializer.class);
        when(factory.createEnumDeserializer(ctxt, type, beanDesc)).thenReturn((JsonDeserializer) deser);

        JsonDeserializer<?> result = cache._createDeserializer2(ctxt, factory, type, beanDesc);

        assertSame(deser, result);
        verify(factory, never()).createBeanDeserializer(any(), any(), any());
    }

    @Test
    public void testCreateDeserializer2_JsonNodeAssignable_UsesTreeDeserializer() throws Exception {
        when(type.getRawClass()).thenReturn((Class) JsonNode.class);
        JsonDeserializer<Object> deser = mock(JsonDeserializer.class);
        when(factory.createTreeDeserializer(config, type, beanDesc)).thenReturn((JsonDeserializer) deser);

        JsonDeserializer<?> result = cache._createDeserializer2(ctxt, factory, type, beanDesc);

        assertSame(deser, result);
    }

    @Test
    public void testCreateDeserializer2_PlainBean_UsesBeanDeserializer() throws Exception {
        JsonDeserializer<Object> deser = mock(JsonDeserializer.class);
        when(factory.createBeanDeserializer(ctxt, type, beanDesc)).thenReturn(deser);

        JsonDeserializer<?> result = cache._createDeserializer2(ctxt, factory, type, beanDesc);

        assertSame(deser, result);
    }

    // =================================================================
    // 32-34: _createDeserializer (builder / converter / modifyTypeByAnnotation)
    // =================================================================

    @Test
    public void testCreateDeserializer_BuilderFound_UsesBuilderBasedDeserializer() throws Exception {
        Class<?> builderClass = Object.class; // dummy marker class
        when(beanDesc.findPOJOBuilder()).thenReturn((Class) builderClass);
        JsonDeserializer<Object> deser = mock(JsonDeserializer.class);
        when(factory.createBuilderBasedDeserializer(ctxt, type, beanDesc, builderClass))
                .thenReturn((JsonDeserializer) deser);

        JsonDeserializer<Object> result = cache._createDeserializer(ctxt, factory, type);

        assertSame(deser, result);
        verify(factory, never()).createBeanDeserializer(any(), any(), any());
    }

    @Test
    public void testCreateDeserializer_ConverterFound_WrapsWithStdDelegatingDeserializer() throws Exception {
        Converter<Object, Object> conv = mock(Converter.class);
        when(beanDesc.findDeserializationConverter()).thenReturn(conv);

        TypeFactory tf = mock(TypeFactory.class);
        when(ctxt.getTypeFactory()).thenReturn(tf);

        JavaType delegateType = mock(JavaType.class);
        when(conv.getInputType(tf)).thenReturn(delegateType);
        when(delegateType.hasRawClass(Object.class)).thenReturn(true); // ไม่ re-introspect
        when(delegateType.isEnumType()).thenReturn(false);
        when(delegateType.isContainerType()).thenReturn(false);
        when(delegateType.isReferenceType()).thenReturn(false);
        when(delegateType.getRawClass()).thenReturn((Class) Object.class);

        JsonDeserializer<Object> innerDeser = mock(JsonDeserializer.class);
        when(factory.createBeanDeserializer(ctxt, delegateType, beanDesc)).thenReturn(innerDeser);

        JsonDeserializer<Object> result = cache._createDeserializer(ctxt, factory, type);

        assertTrue(result instanceof StdDelegatingDeserializer);
    }

    @Test
    public void testModifyTypeByAnnotation_IntrospectorNull_ReturnsTypeUnchanged() throws Exception {
        when(ctxt.getAnnotationIntrospector()).thenReturn(null);

        JavaType result = invokeModifyTypeByAnnotation(ctxt, ann, type);

        assertSame(type, result);
    }

    // =================================================================
    // 35-37: findDeserializerFromAnnotation / findConvertingDeserializer
    // =================================================================

    @Test
    public void testFindDeserializerFromAnnotation_NoAnnotation_ReturnsNull() throws Exception {
        when(intr.findDeserializer(ann)).thenReturn(null);

        JsonDeserializer<Object> result = cache.findDeserializerFromAnnotation(ctxt, ann);

        assertNull(result);
    }

    @Test
    public void testFindDeserializerFromAnnotation_WithAnnotation_NoConverter_ReturnsDeserializerDirectly() throws Exception {
        Object deserDef = JsonDeserializer.None.class;
        when(intr.findDeserializer(ann)).thenReturn(deserDef);
        JsonDeserializer<Object> deserInstance = mock(JsonDeserializer.class);
        when(ctxt.deserializerInstance(ann, deserDef)).thenReturn(deserInstance);
        when(intr.findDeserializationConverter(ann)).thenReturn(null);

        JsonDeserializer<Object> result = cache.findDeserializerFromAnnotation(ctxt, ann);

        assertSame(deserInstance, result);
    }

    @Test
    public void testFindConvertingDeserializer_WithConverter_WrapsDeserializer() throws Exception {
        JsonDeserializer<Object> baseDeser = mock(JsonDeserializer.class);
        Converter<Object, Object> conv = mock(Converter.class);
        when(intr.findDeserializationConverter(ann)).thenReturn("someConverterDef");
        when(ctxt.converterInstance(ann, "someConverterDef")).thenReturn(conv);
        TypeFactory tf = mock(TypeFactory.class);
        when(ctxt.getTypeFactory()).thenReturn(tf);
        JavaType delegateType = mock(JavaType.class);
        when(conv.getInputType(tf)).thenReturn(delegateType);

        JsonDeserializer<Object> result = cache.findConvertingDeserializer(ctxt, ann, baseDeser);

        assertTrue(result instanceof StdDelegatingDeserializer);
    }

    @Test
    public void testFindConvertingDeserializer_NoConverter_ReturnsOriginalDeserializer() throws Exception {
        JsonDeserializer<Object> baseDeser = mock(JsonDeserializer.class);
        when(intr.findDeserializationConverter(ann)).thenReturn(null);

        JsonDeserializer<Object> result = cache.findConvertingDeserializer(ctxt, ann, baseDeser);

        assertSame(baseDeser, result);
    }

    // =================================================================
    // 38: writeReplace
    // =================================================================

    @Test
    public void testWriteReplace_ClearsIncompleteDeserializersAndReturnsSelf() throws Exception {
        cache._incompleteDeserializers.put(type, mock(JsonDeserializer.class));
        assertFalse(cache._incompleteDeserializers.isEmpty());

        Object result = cache.writeReplace();

        assertSame(cache, result);
        assertTrue(cache._incompleteDeserializers.isEmpty());
    }
}
```

## สรุปตาราง Test Method ↔ Branch/Condition ที่ครอบคลุม

| Test Method | Branch/Condition ที่ครอบคลุม |
|---|---|
| testCachedDeserializersCount_InitiallyZero | `cachedDeserializersCount()` กรณี cache ว่าง |
| testFlushCachedDeserializers_ClearsCache | `flushCachedDeserializers()` clear map |
| testFindCachedDeserializer_NullType_Throws... | `type == null` → throw IllegalArgumentException |
| testFindCachedDeserializer_HasCustomHandlers_ReturnsNull | `_hasCustomHandlers(type)==true` → return null |
| testFindCachedDeserializer_NotCached_ReturnsNull | ไม่มีใน cache → return null |
| testFindCachedDeserializer_Cached_ReturnsDeserializer | มีใน cache → return ค่า |
| testHasCustomHandlers_NotContainerType... | `isContainerType()==false` |
| testHasCustomHandlers_ContentTypeNull... | container=true, contentType=null |
| testHasCustomHandlers_ContentValueHandlerPresent... | contentType.getValueHandler()!=null → true |
| testHasCustomHandlers_ContentTypeHandlerPresent... | contentType.getTypeHandler()!=null → true |
| testHasCustomHandlers_NoHandlers_ReturnsFalse | ทั้งสอง handler เป็น null |
| testVerifyAsClass_NullSrc... | `src==null` |
| testVerifyAsClass_SrcNotClass_Throws... | `!(src instanceof Class)` |
| testVerifyAsClass_SrcEqualsNoneClass... | `cls==noneClass` |
| testVerifyAsClass_NormalClass_ReturnsClass | grant path ปกติ |
| testFindValueDeserializer_CreatesCaches... | deser!=null, ต่อเข้า cache |
| testFindValueDeserializer_ConcreteType_... | `_handleUnknownValueDeserializer` concrete branch (เรียก 1 ครั้ง) |
| testFindValueDeserializer_AbstractType_... | abstract branch (เรียก 2 ครั้ง) |
| testHasValueDeserializerFor_CachedType... | ใช้ cache ไม่เรียก factory |
| testHasValueDeserializerFor_CreatedSuccessfully... | สร้างสำเร็จ → true |
| testHasValueDeserializerFor_CreationFails... | สร้างไม่สำเร็จ → false, ไม่เรียก handleUnknown |
| testFindKeyDeserializer_FactoryReturnsNull... | `kd==null` → handleUnknownKeyDeserializer |
| testFindKeyDeserializer_NonResolvable... | kd ไม่ implement ResolvableDeserializer |
| testFindKeyDeserializer_Resolvable_ResolveCalled | kd instanceof ResolvableDeserializer → resolve() ถูกเรียก |
| testCreateAndCacheValueDeserializer_IncompleteFound... | race-condition branch: พบใน `_incompleteDeserializers` |
| testCreateAndCache2_IllegalArgumentException... | catch IllegalArgumentException → wrap JsonMappingException |
| testCreateAndCache2_NotCachable... | `deser.isCachable()==false` → ไม่ cache |
| testCreateAndCache2_ResolvableDeserializer... | instanceof ResolvableDeserializer → put/resolve/remove |
| testCreateDeserializer2_EnumType... | `type.isEnumType()==true` |
| testCreateDeserializer2_JsonNodeAssignable... | `JsonNode.class.isAssignableFrom(...)==true` |
| testCreateDeserializer2_PlainBean... | fallback ไปที่ `createBeanDeserializer` |
| testCreateDeserializer_BuilderFound... | `beanDesc.findPOJOBuilder()!=null` |
| testCreateDeserializer_ConverterFound... | `beanDesc.findDeserializationConverter()!=null` |
| testModifyTypeByAnnotation_IntrospectorNull... | `intr==null` → return type เดิม |
| testFindDeserializerFromAnnotation_NoAnnotation... | `deserDef==null` |
| testFindDeserializerFromAnnotation_WithAnnotation... | `deserDef!=null`, conv=null |
| testFindConvertingDeserializer_WithConverter... | `conv!=null` → wrap StdDelegatingDeserializer |
| testFindConvertingDeserializer_NoConverter... | `conv==null` → return deser เดิม |
| testWriteReplace_Clears... | `writeReplace()` clear `_incompleteDeserializers`, return `this` |