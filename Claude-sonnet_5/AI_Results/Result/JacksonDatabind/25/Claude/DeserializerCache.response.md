# วิเคราะห์และแนวทางการทดสอบ

`DeserializerCache` เป็น `final class` จึงไม่สามารถ subclass เพื่อ override protected method ได้ แต่เนื่องจากเมธอด/ฟิลด์ส่วนใหญ่เป็น `protected` (ซึ่งเทียบเท่า package-private ในแง่การเข้าถึงจากไฟล์อื่นใน package เดียวกัน) จึงสร้างคลาสทดสอบไว้ใน **package เดียวกัน** (`com.fasterxml.jackson.databind.deser`) เพื่อเรียกใช้เมธอดภายใน (`_findCachedDeserializer`, `_handleUnknownValueDeserializer`, `_handleUnknownKeyDeserializer`, `writeReplace`) และเข้าถึงฟิลด์ `_cachedDeserializers` / `_incompleteDeserializers` ได้ตรง ๆ โดยไม่ต้องใช้ reflection

สำหรับ path ที่ต้องพึ่ง `DeserializationContext`/`DeserializerFactory` จริง ใช้ของจริงจาก `ObjectMapper` + `BeanDeserializerFactory.instance` + `DefaultDeserializationContext.Impl` (เป็น API มาตรฐานของ jackson-databind สำหรับ bootstrap context ในการทดสอบภายใน — **หมายเหตุ**: signature เหล่านี้ไม่ได้แสดงในซอร์สที่ให้มา แต่เป็น public API ของไลบรารีที่ทดสอบจริง จึงจำเป็นต้องใช้เพื่อสร้าง integration path แทนการเดา behavior ของ `DeserializerCache` เอง)

จุดที่ **ไม่สามารถทดสอบได้** โดยไม่เดา behavior/สร้าง mock ของ `DeserializerFactory` ทั้งชุด (abstract class ที่มี method จำนวนมากซึ่งไม่ได้แสดงใน source) จะกำกับด้วยคอมเมนต์ในโค้ด

```java
package com.fasterxml.jackson.databind.deser;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.KeyDeserializer;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.type.CollectionType;
import com.fasterxml.jackson.databind.type.TypeFactory;

/**
 * Unit test สำหรับ {@link DeserializerCache}
 *
 * หมายเหตุสำคัญ:
 * - คลาสทดสอบอยู่ package เดียวกับ SUT เพื่อเข้าถึง protected method/field ได้ตรง ๆ
 *   (ไม่ใช้ reflection, ไม่ mock final class)
 * - ใช้ ObjectMapper / BeanDeserializerFactory.instance / DefaultDeserializationContext.Impl
 *   (public API จริงของ jackson-databind) เพื่อสร้าง DeserializationContext ที่ใช้งานได้จริง
 *   สำหรับทดสอบ path ที่ต้องพึ่ง factory การสร้าง deserializer จริง
 * - บาง branch ที่ต้องพึ่งการ implement DeserializerFactory เองทั้งหมด (abstract class ขนาดใหญ่
 *   ที่ไม่มี signature แสดงในซอร์สที่ให้มา) จะไม่ทดสอบ เพื่อไม่เดา behavior/ API ที่ไม่ปรากฏในซอร์ส
 */
public class DeserializerCacheTest
{
    private ObjectMapper mapper;
    private TypeFactory typeFactory;
    private DeserializerFactory factory;
    private DeserializerCache cache;
    private DeserializationContext ctxt;

    // ---- helper JavaBean สำหรับทดสอบ construct/cache deserializer จริง ----
    public static class SimpleBean {
        public String name;
        public int value;
    }

    // Bean ที่อ้างอิงตัวเอง (cyclic) เพื่อทดสอบ _incompleteDeserializers logic
    public static class SelfRefBean {
        public String label;
        public SelfRefBean child;
    }

    // Dummy JsonDeserializer เพื่อใช้ยัดเข้า cache map ตรง ๆ สำหรับทดสอบ boundary/branch
    private static class DummyDeserializer extends JsonDeserializer<Object> {
        @Override
        public Object deserialize(com.fasterxml.jackson.core.JsonParser p,
                DeserializationContext ctxt) {
            return null;
        }
    }

    @Before
    public void setUp() throws Exception {
        mapper = new ObjectMapper();
        typeFactory = mapper.getTypeFactory();
        factory = BeanDeserializerFactory.instance;
        cache = new DeserializerCache();
        ctxt = newContext();
    }

    private DeserializationContext newContext() throws Exception {
        com.fasterxml.jackson.core.JsonParser p = mapper.getFactory().createParser("{}");
        DefaultDeserializationContext.Impl impl = new DefaultDeserializationContext.Impl(factory);
        return impl.createInstance(mapper.getDeserializationConfig(), p, null);
    }

    // ------------------------------------------------------------------
    // cachedDeserializersCount() / flushCachedDeserializers()
    // ------------------------------------------------------------------

    @Test
    public void testInitialCacheCountIsZero() {
        assertEquals(0, cache.cachedDeserializersCount());
    }

    @Test
    public void testFlushCachedDeserializers_ClearsCache() {
        JavaType t1 = typeFactory.constructType(String.class);
        cache._cachedDeserializers.put(t1, new DummyDeserializer());
        assertEquals(1, cache.cachedDeserializersCount());

        cache.flushCachedDeserializers();

        assertEquals(0, cache.cachedDeserializersCount());
    }

    // ------------------------------------------------------------------
    // _findCachedDeserializer(JavaType)
    // ------------------------------------------------------------------

    @Test
    public void testFindCachedDeserializer_NullType_ThrowsIllegalArgumentException() {
        try {
            cache._findCachedDeserializer(null);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertTrue(e.getMessage().contains("Null JavaType"));
        }
    }

    @Test
    public void testFindCachedDeserializer_NotInCache_ReturnsNull() {
        JavaType type = typeFactory.constructType(String.class);
        assertNull(cache._findCachedDeserializer(type));
    }

    @Test
    public void testFindCachedDeserializer_ReturnsCachedInstanceWhenPresent() {
        JavaType type = typeFactory.constructType(String.class);
        DummyDeserializer dummy = new DummyDeserializer();
        cache._cachedDeserializers.put(type, dummy);

        assertSame(dummy, cache._findCachedDeserializer(type));
    }

    /**
     * ครอบคลุม branch: _hasCustomValueHandler(type) == true (ct.getValueHandler() != null)
     * -> ต้อง bypass cache แม้ว่าจะมี entry อยู่ใน map จริง ๆ ก็ตาม
     * (ใช้ type.withContentValueHandler(...) ตามที่ปรากฏใช้งานจริงใน source ของ SUT)
     */
    @Test
    public void testFindCachedDeserializer_SkipsCacheWhenContentValueHandlerPresent() {
        JavaType baseListType = typeFactory.constructCollectionType(List.class, String.class);
        JavaType listTypeWithHandler = baseListType.withContentValueHandler(new DummyDeserializer());

        // ยัด entry ลง cache ตรง ๆ เพื่อพิสูจน์ว่า null ที่ได้มาจากการ "ข้าม cache" จริง ๆ
        cache._cachedDeserializers.put(listTypeWithHandler, new DummyDeserializer());

        assertNull(cache._findCachedDeserializer(listTypeWithHandler));
        // NOTE: branch ct.getTypeHandler() != null ไม่ได้ทดสอบเพราะไม่มี public setter
        // สำหรับ typeHandler ปรากฏในซอร์สที่ให้มา (มีแค่ getter ct.getTypeHandler())
    }

    // ------------------------------------------------------------------
    // _handleUnknownValueDeserializer(JavaType) / _handleUnknownKeyDeserializer(JavaType)
    // ------------------------------------------------------------------

    @Test
    public void testHandleUnknownValueDeserializer_AbstractType_MessageContainsAbstract() {
        // List เป็น interface -> ClassUtil.isConcrete(rawClass) ควรเป็น false
        JavaType type = typeFactory.constructType(List.class);
        try {
            cache._handleUnknownValueDeserializer(type);
            fail("Expected JsonMappingException");
        } catch (JsonMappingException e) {
            assertTrue(e.getMessage().contains("abstract type"));
        }
    }

    @Test
    public void testHandleUnknownValueDeserializer_ConcreteType_MessageWithoutAbstract() {
        JavaType type = typeFactory.constructType(String.class); // concrete class
        try {
            cache._handleUnknownValueDeserializer(type);
            fail("Expected JsonMappingException");
        } catch (JsonMappingException e) {
            assertFalse(e.getMessage().contains("abstract type"));
            assertTrue(e.getMessage().contains("Can not find a Value deserializer"));
        }
    }

    @Test
    public void testHandleUnknownKeyDeserializer_ThrowsWithExpectedMessage() {
        JavaType type = typeFactory.constructType(String.class);
        try {
            cache._handleUnknownKeyDeserializer(type);
            fail("Expected JsonMappingException");
        } catch (JsonMappingException e) {
            assertTrue(e.getMessage().contains("Key deserializer"));
        }
    }

    // ------------------------------------------------------------------
    // writeReplace()
    // ------------------------------------------------------------------

    @Test
    public void testWriteReplace_ClearsIncompleteDeserializers() {
        JavaType t1 = typeFactory.constructType(String.class);
        cache._incompleteDeserializers.put(t1, new DummyDeserializer());
        assertFalse(cache._incompleteDeserializers.isEmpty());

        Object result = cache.writeReplace();

        assertSame(cache, result);
        assertTrue(cache._incompleteDeserializers.isEmpty());
    }

    // ------------------------------------------------------------------
    // findValueDeserializer(...)
    // ------------------------------------------------------------------

    @Test
    public void testFindValueDeserializer_NullType_ThrowsIllegalArgumentException() throws Exception {
        try {
            cache.findValueDeserializer(ctxt, factory, null);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // มาจาก _findCachedDeserializer(null) ที่ถูกเรียกก่อน
        }
    }

    @Test
    public void testFindValueDeserializer_SimpleBean_CreatesAndCachesDeserializer() throws Exception {
        JavaType beanType = typeFactory.constructType(SimpleBean.class);

        JsonDeserializer<Object> deser = cache.findValueDeserializer(ctxt, factory, beanType);

        assertNotNull(deser);
        // BeanDeserializer.isCachable() == true เป็นพฤติกรรมมาตรฐานของ jackson-databind
        // (ไม่ได้ระบุใน source ของ DeserializerCache แต่เป็นผลจากการรันจริงของไลบรารีที่ทดสอบ)
        assertEquals(1, cache.cachedDeserializersCount());
    }

    @Test
    public void testFindValueDeserializer_CacheHit_ReturnsSameInstance() throws Exception {
        JavaType beanType = typeFactory.constructType(SimpleBean.class);

        JsonDeserializer<Object> first = cache.findValueDeserializer(ctxt, factory, beanType);
        JsonDeserializer<Object> second = cache.findValueDeserializer(ctxt, factory, beanType);

        // เรียกครั้งที่สอง ต้องได้ instance เดิมจาก cache (deser != null -> ข้ามการสร้างใหม่)
        assertSame(first, second);
    }

    /**
     * ทดสอบ path cyclic reference: SelfRefBean อ้างอิงตัวเอง
     * ครอบคลุม branch ใน _createAndCacheValueDeserializer:
     *   count > 0 -> deser = _incompleteDeserializers.get(type) -> deser != null -> return
     * และ finally-block ที่ clear _incompleteDeserializers หลัง resolve เสร็จ
     */
    @Test
    public void testFindValueDeserializer_SelfReferencingBean_HandlesCyclicIncompleteMap() throws Exception {
        JavaType selfRefType = typeFactory.constructType(SelfRefBean.class);

        JsonDeserializer<Object> deser = cache.findValueDeserializer(ctxt, factory, selfRefType);

        assertNotNull(deser);
        assertTrue(cache._incompleteDeserializers.isEmpty());
        assertEquals(1, cache.cachedDeserializersCount());
    }

    // ------------------------------------------------------------------
    // hasValueDeserializerFor(...)
    // ------------------------------------------------------------------

    @Test
    public void testHasValueDeserializerFor_TrueWhenAlreadyCached() throws Exception {
        JavaType beanType = typeFactory.constructType(SimpleBean.class);
        cache.findValueDeserializer(ctxt, factory, beanType); // populate cache ก่อน

        boolean has = cache.hasValueDeserializerFor(ctxt, factory, beanType);

        assertTrue(has); // deser != null จาก _findCachedDeserializer -> ข้าม _createAndCacheValueDeserializer
    }

    @Test
    public void testHasValueDeserializerFor_TrueWhenNotCachedButCreatable() throws Exception {
        JavaType type = typeFactory.constructType(String.class);

        boolean has = cache.hasValueDeserializerFor(ctxt, factory, type);

        assertTrue(has); // deser == null จาก cache -> ต้องสร้างใหม่ -> ได้ deser ไม่เป็น null
        // NOTE: branch "return false" (deser สร้างไม่ได้/เป็น null) ไม่ได้ทดสอบ เพราะต้อง custom
        // DeserializerFactory ที่ implement abstract method จำนวนมากซึ่งไม่ปรากฏใน source ที่ให้มา
    }

    // ------------------------------------------------------------------
    // findKeyDeserializer(...)
    // ------------------------------------------------------------------

    @Test
    public void testFindKeyDeserializer_ForStringType_ReturnsNonNull() throws Exception {
        JavaType strType = typeFactory.constructType(String.class);

        KeyDeserializer kd = cache.findKeyDeserializer(ctxt, factory, strType);

        assertNotNull(kd);
        // NOTE: branch "kd == null -> _handleUnknownKeyDeserializer" และ
        // "kd instanceof ResolvableDeserializer -> resolve()" ไม่ได้ทดสอบผ่าน path นี้
        // เพราะต้องพึ่ง custom DeserializerFactory/KeyDeserializer ที่ implement ตาม API
        // ซึ่งไม่ได้แสดงไว้ใน source ที่ให้มา (ทดสอบ error-message branch แยกผ่าน
        // testHandleUnknownKeyDeserializer_ThrowsWithExpectedMessage แทน)
    }
}
```

## สรุปตาราง Test Method กับ Branch/Condition ที่ครอบคลุม

| Test Method | Branch/Condition ที่ครอบคลุม |
|---|---|
| `testInitialCacheCountIsZero` | ค่าเริ่มต้น `_cachedDeserializers` เป็น empty |
| `testFlushCachedDeserializers_ClearsCache` | `flushCachedDeserializers()` เคลียร์ map จริง |
| `testFindCachedDeserializer_NullType_ThrowsIllegalArgumentException` | `_findCachedDeserializer`: `type == null` → throw |
| `testFindCachedDeserializer_NotInCache_ReturnsNull` | `_findCachedDeserializer`: type ไม่มี custom handler, ไม่อยู่ใน cache → null |
| `testFindCachedDeserializer_ReturnsCachedInstanceWhenPresent` | `_findCachedDeserializer`: type ไม่มี custom handler, อยู่ใน cache → คืนค่า cache |
| `testFindCachedDeserializer_SkipsCacheWhenContentValueHandlerPresent` | `_hasCustomValueHandler`: container type, `ct.getValueHandler() != null` → true → bypass cache |
| `testHandleUnknownValueDeserializer_AbstractType_MessageContainsAbstract` | `_handleUnknownValueDeserializer`: `!ClassUtil.isConcrete(rawClass)` → throw "abstract type" |
| `testHandleUnknownValueDeserializer_ConcreteType_MessageWithoutAbstract` | `_handleUnknownValueDeserializer`: rawClass concrete → throw ข้อความปกติ |
| `testHandleUnknownKeyDeserializer_ThrowsWithExpectedMessage` | `_handleUnknownKeyDeserializer` → throw JsonMappingException |
| `testWriteReplace_ClearsIncompleteDeserializers` | `writeReplace()`: เคลียร์ `_incompleteDeserializers` |
| `testFindValueDeserializer_NullType_ThrowsIllegalArgumentException` | `findValueDeserializer`: propagate IllegalArgumentException จาก `_findCachedDeserializer(null)` |
| `testFindValueDeserializer_SimpleBean_CreatesAndCachesDeserializer` | `findValueDeserializer`: `deser == null` (cache miss) → `_createAndCacheValueDeserializer` → `_createAndCache2` → `addToCache == true` → put cache |
| `testFindValueDeserializer_CacheHit_ReturnsSameInstance` | `findValueDeserializer`: `deser != null` (cache hit) → return โดยไม่สร้างใหม่ |
| `testFindValueDeserializer_SelfReferencingBean_HandlesCyclicIncompleteMap` | `_createAndCacheValueDeserializer`: `count > 0` และพบใน `_incompleteDeserializers` → return early; finally-block clear map |
| `testHasValueDeserializerFor_TrueWhenAlreadyCached` | `hasValueDeserializerFor`: `deser != null` จาก cache → true |
| `testHasValueDeserializerFor_TrueWhenNotCachedButCreatable` | `hasValueDeserializerFor`: `deser == null` (cache miss) → สร้างใหม่สำเร็จ → true |
| `testFindKeyDeserializer_ForStringType_ReturnsNonNull` | `findKeyDeserializer`: `kd != null`, ไม่ throw |

**Branch ที่ไม่ได้ครอบคลุม (พร้อมเหตุผลกำกับในโค้ด):**
- `_hasCustomValueHandler`: กรณี `ct.getTypeHandler() != null` (ไม่มี public setter ปรากฏใน source)
- `hasValueDeserializerFor` กรณีคืนค่า `false` (deser สร้างไม่สำเร็จ)
- `findKeyDeserializer` กรณี `kd == null` และกรณี `kd instanceof ResolvableDeserializer`
- catch `IllegalArgumentException` ใน `_createAndCache2` ที่ห่อเป็น `JsonMappingException` (path จาก `factory.*` โยน IAE ตรง ๆ)

ทั้งหมดนี้ต้องพึ่งการ implement/mocking `DeserializerFactory` (abstract class ขนาดใหญ่ที่ไม่ได้แสดง signature ทั้งหมดใน source ที่ให้มา) จึงข้ามไปตามข้อกำหนดห้ามเดา behavior