# คำตอบ

ด้านล่างนี้คือชุดทดสอบ JUnit 4 สำหรับ `DeserializerCache` (Defects4J: JacksonDatabind-103b)

**หมายเหตุสำคัญเกี่ยวกับแนวทางการทดสอบ:**
- `DeserializerCache` ต้องทำงานร่วมกับ `DeserializationContext`/`DeserializerFactory` จริง เพราะ mock ทั้งหมดจะไม่สามารถยืนยัน behavior ได้ตรงกับซอร์สที่ให้มา จึงใช้ `ObjectMapper` + `DefaultDeserializationContext.Impl` (ของจริงจาก jackson-databind) เพื่อสร้าง `DeserializationContext` ที่ใช้งานได้จริง ตามรูปแบบที่ `ObjectMapper` เองใช้ภายใน (`new DefaultDeserializationContext.Impl(factory).createInstance(config, p, values)`)
- ใช้ Mockito เฉพาะจุดที่ต้องการบังคับให้ `DeserializerFactory` คืน `null` เพื่อทดสอบ error-path (`_handleUnknownValueDeserializer`, `_handleUnknownKeyDeserializer`) โดยไม่พึ่ง matcher ที่อาจขัดแย้งกันระหว่าง Mockito 1.x/2.x (ใช้แค่ `mock()`/`when().thenReturn()` กับ argument ตรง ๆ)
- จุดที่ไม่มั่นใจ behavior แน่ชัด (เช่น default `isCachable()`) ได้ comment กำกับไว้

```java
package com.fasterxml.jackson.databind.deser;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.junit.Before;
import org.junit.Test;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.KeyDeserializer;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer;
import com.fasterxml.jackson.databind.node.TextNode;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.fasterxml.jackson.databind.util.StdConverter;

// import คลาสเป้าหมายตามข้อกำหนด (แม้จะอยู่ package เดียวกันกับ test ก็ตาม)
import com.fasterxml.jackson.databind.deser.DeserializerCache;

/**
 * JUnit4 test suite for {@link DeserializerCache}.
 *
 * Test class ถูกวางไว้ใน package เดียวกับคลาสเป้าหมาย เพื่อให้สามารถเรียก
 * protected method อย่าง _findCachedDeserializer(...) ได้ตรง ๆ โดยไม่ต้องใช้ reflection
 */
public class DeserializerCacheTest {

    private ObjectMapper mapper;
    private DeserializationConfig config;
    private DeserializerFactory factory;
    private DeserializationContext ctxt;
    private DeserializerCache cache;

    @Before
    public void setUp() throws IOException {
        mapper = new ObjectMapper();
        config = mapper.getDeserializationConfig();
        factory = BeanDeserializerFactory.instance;
        JsonParser p = new JsonFactory().createParser("{}");
        // รูปแบบเดียวกับที่ ObjectMapper ใช้สร้าง DeserializationContext จริงภายใน
        ctxt = new DefaultDeserializationContext.Impl(factory)
                .createInstance(config, p, null);
        cache = new DeserializerCache();
    }

    // ---------------------------------------------------------------
    // Fixtures
    // ---------------------------------------------------------------

    public static class SimplePojo {
        public String name;
        public int age;
    }

    public enum SimpleEnum { A, B }

    public interface NoDeserializerInterface { }

    public static class RecursiveNode {
        public String name;
        public RecursiveNode child; // self-reference -> cyclic resolution
    }

    public static class CustomDeserializerImpl extends JsonDeserializer<AnnotatedTarget> {
        @Override
        public AnnotatedTarget deserialize(JsonParser p, DeserializationContext c) throws IOException {
            AnnotatedTarget t = new AnnotatedTarget();
            t.value = p.getValueAsString();
            return t;
        }
        // ไม่ override isCachable() -> ใช้ default ของ JsonDeserializer ซึ่งคืน false
        // (อ้างอิง contract มาตรฐานของ jackson-databind; ถ้าไม่แน่ใจโปรดตรวจสอบ version ที่ใช้จริง)
    }

    @JsonDeserialize(using = CustomDeserializerImpl.class)
    public static class AnnotatedTarget {
        public String value;
    }

    public static class WrappedInt {
        public int value;
        public WrappedInt() { }
        public WrappedInt(int v) { this.value = v; }
    }

    public static class StringToWrappedIntConverter extends StdConverter<String, WrappedInt> {
        @Override
        public WrappedInt convert(String value) {
            return new WrappedInt(Integer.parseInt(value));
        }
    }

    @JsonDeserialize(converter = StringToWrappedIntConverter.class)
    public static class ConvertibleWrappedInt extends WrappedInt { }

    private JsonDeserializer<Object> dummyHandler() {
        return new JsonDeserializer<Object>() {
            @Override
            public Object deserialize(JsonParser p, DeserializationContext c) throws IOException {
                return null;
            }
        };
    }

    // ---------------------------------------------------------------
    // 1) cachedDeserializersCount / flushCachedDeserializers
    // ---------------------------------------------------------------

    @Test
    public void testInitialCacheIsEmpty() {
        assertEquals(0, cache.cachedDeserializersCount());
    }

    @Test
    public void testFlushOnEmptyCacheDoesNotThrow() {
        cache.flushCachedDeserializers();
        assertEquals(0, cache.cachedDeserializersCount());
    }

    @Test
    public void testFlushCachedDeserializersClearsCache() throws Exception {
        JavaType type = TypeFactory.defaultInstance().constructType(SimplePojo.class);
        cache.findValueDeserializer(ctxt, factory, type);
        assertEquals(1, cache.cachedDeserializersCount());

        cache.flushCachedDeserializers();
        assertEquals(0, cache.cachedDeserializersCount());
    }

    // ---------------------------------------------------------------
    // 2) _findCachedDeserializer - null / custom handler
    // ---------------------------------------------------------------

    @Test(expected = IllegalArgumentException.class)
    public void testFindCachedDeserializerNullTypeThrows() {
        cache._findCachedDeserializer(null);
    }

    @Test
    public void testFindCachedDeserializerSkipsCacheForCustomContentHandler() throws Exception {
        JavaType plainType = TypeFactory.defaultInstance()
                .constructCollectionType(List.class, String.class);
        JsonDeserializer<Object> d = cache.findValueDeserializer(ctxt, factory, plainType);
        assertNotNull(d);
        assertTrue(cache.cachedDeserializersCount() > 0);

        // type เดียวกันเชิงโครงสร้าง แต่กำหนด content value handler เอง
        // -> _hasCustomHandlers(type) ต้อง true -> _findCachedDeserializer ต้องคืน null เสมอ
        JavaType withHandler = plainType.withContentValueHandler(dummyHandler());
        assertNull(cache._findCachedDeserializer(withHandler));
    }

    // ---------------------------------------------------------------
    // 3) findValueDeserializer - null type
    // ---------------------------------------------------------------

    @Test(expected = IllegalArgumentException.class)
    public void testFindValueDeserializerNullTypeThrows() throws Exception {
        cache.findValueDeserializer(ctxt, factory, null);
    }

    // ---------------------------------------------------------------
    // 4) findValueDeserializer - caching & reuse (happy path, bean)
    // ---------------------------------------------------------------

    @Test
    public void testFindValueDeserializerForSimpleBean_CachesAndReusesInstance() throws Exception {
        JavaType type = TypeFactory.defaultInstance().constructType(SimplePojo.class);
        JsonDeserializer<Object> d1 = cache.findValueDeserializer(ctxt, factory, type);
        assertNotNull(d1);
        assertEquals(1, cache.cachedDeserializersCount());

        JsonDeserializer<Object> d2 = cache.findValueDeserializer(ctxt, factory, type);
        assertSame("ต้องคืน deserializer ตัวเดิมจาก cache (cache-hit branch)", d1, d2);
        assertEquals(1, cache.cachedDeserializersCount());
    }

    // ---------------------------------------------------------------
    // 5) _createDeserializer2 - container / array / enum / JsonNode branches
    // ---------------------------------------------------------------

    @Test
    public void testFindValueDeserializerForCollectionType() throws Exception {
        JavaType type = TypeFactory.defaultInstance()
                .constructCollectionType(List.class, String.class);
        JsonDeserializer<Object> d = cache.findValueDeserializer(ctxt, factory, type);
        assertNotNull(d);
    }

    @Test
    public void testFindValueDeserializerForMapType() throws Exception {
        JavaType type = TypeFactory.defaultInstance()
                .constructMapType(Map.class, String.class, String.class);
        JsonDeserializer<Object> d = cache.findValueDeserializer(ctxt, factory, type);
        assertNotNull(d);
    }

    @Test
    public void testFindValueDeserializerForArrayType() throws Exception {
        JavaType type = TypeFactory.defaultInstance().constructType(String[].class);
        JsonDeserializer<Object> d = cache.findValueDeserializer(ctxt, factory, type);
        assertNotNull(d);
    }

    @Test
    public void testFindValueDeserializerForEnumType() throws Exception {
        JavaType type = TypeFactory.defaultInstance().constructType(SimpleEnum.class);
        JsonDeserializer<Object> d = cache.findValueDeserializer(ctxt, factory, type);
        assertNotNull(d);
    }

    @Test
    public void testFindValueDeserializerForJsonNodeType() throws Exception {
        JavaType type = TypeFactory.defaultInstance().constructType(TextNode.class);
        JsonDeserializer<Object> d = cache.findValueDeserializer(ctxt, factory, type);
        assertNotNull(d);
    }

    // ---------------------------------------------------------------
    // 6) _createDeserializer - annotation / converter branches
    // ---------------------------------------------------------------

    @Test
    public void testFindValueDeserializerUsesAnnotatedCustomDeserializer() throws Exception {
        JavaType type = TypeFactory.defaultInstance().constructType(AnnotatedTarget.class);
        JsonDeserializer<Object> d = cache.findValueDeserializer(ctxt, factory, type);
        assertNotNull(d);
        assertTrue(d instanceof CustomDeserializerImpl);
        // ดู comment ที่ CustomDeserializerImpl: isCachable() default = false -> ไม่ถูก cache
        assertEquals(0, cache.cachedDeserializersCount());
    }

    @Test
    public void testFindValueDeserializerWithConverterAnnotation() throws Exception {
        JavaType type = TypeFactory.defaultInstance().constructType(ConvertibleWrappedInt.class);
        JsonDeserializer<Object> d = cache.findValueDeserializer(ctxt, factory, type);
        assertNotNull(d);
        assertTrue("ควรถูก wrap ด้วย StdDelegatingDeserializer เมื่อมี converter annotation",
                d instanceof StdDelegatingDeserializer);
    }

    // ---------------------------------------------------------------
    // 7) Recursive / cyclic type -> _incompleteDeserializers path
    // ---------------------------------------------------------------

    @Test
    public void testFindValueDeserializerHandlesRecursiveTypeWithoutStackOverflow() throws Exception {
        JavaType type = TypeFactory.defaultInstance().constructType(RecursiveNode.class);
        JsonDeserializer<Object> d = cache.findValueDeserializer(ctxt, factory, type);
        assertNotNull(d);
        // ต้อง resolve จบสมบูรณ์ และถูก cache ไว้ 1 รายการ ไม่ใช่ค้างอยู่ใน incomplete map
        assertEquals(1, cache.cachedDeserializersCount());
    }

    // ---------------------------------------------------------------
    // 8) hasValueDeserializerFor
    // ---------------------------------------------------------------

    @Test(expected = IllegalArgumentException.class)
    public void testHasValueDeserializerForNullTypeThrows() throws Exception {
        cache.hasValueDeserializerFor(ctxt, factory, null);
    }

    @Test
    public void testHasValueDeserializerForReturnsTrueForKnownType() throws Exception {
        JavaType type = TypeFactory.defaultInstance().constructType(SimplePojo.class);
        assertTrue(cache.hasValueDeserializerFor(ctxt, factory, type));
    }

    @Test
    public void testHasValueDeserializerForReturnsFalseWhenFactoryCannotCreate() throws Exception {
        DeserializerFactory mockFactory = mock(DeserializerFactory.class);
        JavaType type = TypeFactory.defaultInstance().constructType(SimplePojo.class);
        // mock ไม่ถูก stub ใด ๆ -> createBeanDeserializer คืน null ตาม default ของ Mockito
        assertFalse(cache.hasValueDeserializerFor(ctxt, mockFactory, type));
    }

    // ---------------------------------------------------------------
    // 9) findKeyDeserializer
    // ---------------------------------------------------------------

    @Test
    public void testFindKeyDeserializerForStringType() throws Exception {
        JavaType type = TypeFactory.defaultInstance().constructType(String.class);
        KeyDeserializer kd = cache.findKeyDeserializer(ctxt, factory, type);
        assertNotNull(kd);
    }

    @Test(expected = JsonMappingException.class)
    public void testFindKeyDeserializerReportsErrorWhenFactoryReturnsNull() throws Exception {
        DeserializerFactory mockFactory = mock(DeserializerFactory.class);
        JavaType type = TypeFactory.defaultInstance().constructType(String.class);
        // createKeyDeserializer ไม่ stub -> คืน null -> ต้องเข้า _handleUnknownKeyDeserializer
        cache.findKeyDeserializer(ctxt, mockFactory, type);
    }

    // ---------------------------------------------------------------
    // 10) _handleUnknownValueDeserializer (concrete vs abstract message branch)
    // ---------------------------------------------------------------

    @Test(expected = JsonMappingException.class)
    public void testFindValueDeserializerReportsErrorWhenFactoryReturnsNullForConcreteType() throws Exception {
        DeserializerFactory mockFactory = mock(DeserializerFactory.class);
        JavaType type = TypeFactory.defaultInstance().constructType(SimplePojo.class);
        // SimplePojo เป็น concrete class, isAbstract/isMapLikeType/isCollectionLikeType ล้วน false
        // -> ไม่เรียก mapAbstractType, createBeanDeserializer (mock) คืน null
        // -> handleUnknownValueDeserializer (ข้อความ "Cannot find a Value deserializer for type")
        cache.findValueDeserializer(ctxt, mockFactory, type);
    }

    @Test(expected = JsonMappingException.class)
    public void testFindValueDeserializerReportsErrorForAbstractTypeWhenFactoryReturnsNull() throws Exception {
        DeserializerFactory mockFactory = mock(DeserializerFactory.class);
        JavaType type = TypeFactory.defaultInstance().constructType(NoDeserializerInterface.class);
        // interface -> isAbstract() == true -> ต้องเรียก mapAbstractType ก่อน ต้อง stub ให้คืน type เดิม
        when(mockFactory.mapAbstractType(config, type)).thenReturn(type);
        // createBeanDeserializer ไม่ stub -> คืน null
        // -> handleUnknownValueDeserializer (ข้อความ "Cannot find a Value deserializer for abstract type")
        cache.findValueDeserializer(ctxt, mockFactory, type);
    }

    // ---------------------------------------------------------------
    // 11) addToCache == false เมื่อ type มี custom handler (ผ่าน findValueDeserializer จริง)
    // ---------------------------------------------------------------

    @Test
    public void testFindValueDeserializerDoesNotCacheTypeWithCustomContentHandler() throws Exception {
        JavaType base = TypeFactory.defaultInstance()
                .constructCollectionType(List.class, String.class);
        JavaType withHandler = base.withContentValueHandler(dummyHandler());

        // สมมติฐาน: factory ใช้ value handler ที่ตั้งไว้ล่วงหน้าของ content type แทนการสร้างใหม่
        // (เป็น behavior มาตรฐานของ Jackson factory แต่ไม่ได้ระบุไว้ตรง ๆ ใน DeserializerCache เอง)
        JsonDeserializer<Object> d = cache.findValueDeserializer(ctxt, factory, withHandler);
        assertNotNull(d);
        // _hasCustomHandlers(type) == true -> addToCache ต้อง false เสมอ ไม่ว่า isCachable() จะเป็นอย่างไร
        assertEquals(0, cache.cachedDeserializersCount());
    }
}
```

## ตารางสรุป Branch/Condition ที่ครอบคลุม

| Test Method | Branch / Condition ที่ครอบคลุม |
|---|---|
| `testInitialCacheIsEmpty` | boundary: cache เริ่มต้นว่าง |
| `testFlushOnEmptyCacheDoesNotThrow` | `flushCachedDeserializers()` กับ map ว่าง |
| `testFlushCachedDeserializersClearsCache` | flush หลังมี entry → กลับเป็น 0 |
| `testFindCachedDeserializerNullTypeThrows` | `_findCachedDeserializer`: `type==null` → throw |
| `testFindCachedDeserializerSkipsCacheForCustomContentHandler` | `_hasCustomHandlers(type)==true` → คืน `null` ทันที (ไม่ lookup cache) |
| `testFindValueDeserializerNullTypeThrows` | `findValueDeserializer`: null type → IllegalArgumentException |
| `testFindValueDeserializerForSimpleBean_CachesAndReusesInstance` | `deser==null` (first call) → create+cache; second call cache-hit branch (`deser!=null`) |
| `testFindValueDeserializerForCollectionType` | `isContainerType && isCollectionLikeType && isTrueCollectionType` → `createCollectionDeserializer` |
| `testFindValueDeserializerForMapType` | `isMapLikeType && isTrueMapType` → `createMapDeserializer` |
| `testFindValueDeserializerForArrayType` | `isContainerType && isArrayType` → `createArrayDeserializer` |
| `testFindValueDeserializerForEnumType` | `isEnumType()` → `createEnumDeserializer` |
| `testFindValueDeserializerForJsonNodeType` | `JsonNode.isAssignableFrom(rawClass)` → `createTreeDeserializer` |
| `testFindValueDeserializerUsesAnnotatedCustomDeserializer` | `findDeserializerFromAnnotation` คืนค่า non-null → short-circuit ใน `_createDeserializer`; `addToCache=false` (isCachable default) |
| `testFindValueDeserializerWithConverterAnnotation` | `beanDesc.findDeserializationConverter()!=null` → path `StdDelegatingDeserializer` |
| `testFindValueDeserializerHandlesRecursiveTypeWithoutStackOverflow` | `_createAndCacheValueDeserializer`: `count>0` + พบใน `_incompleteDeserializers` (cyclic resolve) |
| `testHasValueDeserializerForNullTypeThrows` | `hasValueDeserializerFor`: null type throw |
| `testHasValueDeserializerForReturnsTrueForKnownType` | `(deser!=null)` → true |
| `testHasValueDeserializerForReturnsFalseWhenFactoryCannotCreate` | `(deser!=null)` → false |
| `testFindKeyDeserializerForStringType` | `findKeyDeserializer`: `kd!=null` happy path |
| `testFindKeyDeserializerReportsErrorWhenFactoryReturnsNull` | `kd==null` → `_handleUnknownKeyDeserializer` |
| `testFindValueDeserializerReportsErrorWhenFactoryReturnsNullForConcreteType` | `deser==null` (final) → `_handleUnknownValueDeserializer`, concrete-type message branch |
| `testFindValueDeserializerReportsErrorForAbstractTypeWhenFactoryReturnsNull` | `type.isAbstract()==true` → `mapAbstractType` called; abstract-type message branch |
| `testFindValueDeserializerDoesNotCacheTypeWithCustomContentHandler` | `_createAndCache2`: `!_hasCustomHandlers(type)` false → `addToCache=false` |

**จุดที่ไม่ได้ครอบคลุม (ระบุเหตุผลตามข้อกำหนดห้ามเดา behavior):**
- Branch `builder != null` (`findPOJOBuilder`) และ `IllegalArgumentException` wrapping ใน `_createAndCache2` — ต้องใช้ setup ที่ซับซ้อน/ไม่สามารถยืนยัน behavior จาก source ที่ให้มาได้แน่ชัด จึงละไว้เพื่อไม่เดา
- Branch `JsonFormat.Shape.OBJECT` สำหรับ map/collection — มีความเสี่ยงสูงที่จะเกิด exception จาก `BeanDeserializerFactory` ซึ่งอยู่นอกเหนือ source ของคลาสเป้าหมาย จึงไม่ทดสอบ