# วิเคราะห์และออกแบบ Test Suite

**หมายเหตุสำคัญก่อนเขียนโค้ด:**
- `converter(...)` เป็น package-private static method และ `JavaUtilCollectionsConverter` เป็น `private static` nested class ที่ไม่สามารถอ้างชื่อ type ได้จากนอกคลาส แม้อยู่ package เดียวกัน ผมจึงใช้ **reflection** เรียก `converter(...)` แล้ว cast ผลลัพธ์ที่ได้ (type `Object`) ไปเป็น interface สาธารณะ `Converter<Object,Object>` เพื่อทดสอบ branch ภายใน `convert()` โดยตรง โดยไม่ต้องอ้างชื่อ private class
- ค่าคงที่ `TYPE_SINGLETON_SET(1)`, `TYPE_SINGLETON_LIST(2)`, `TYPE_SINGLETON_MAP(3)`, `TYPE_UNMODIFIABLE_SET(4)`, `TYPE_UNMODIFIABLE_LIST(5)`, `TYPE_UNMODIFIABLE_MAP(6)` เป็น `private` เข้าถึงไม่ได้ จึงประกาศ local constant ที่มีค่าตรงกับ source (คอมเมนต์กำกับไว้ว่าเป็นสมมติฐานจาก source)
- `ctxt` (DeserializationContext) ไม่ถูกใช้งานจริงใน logic ของ `findForCollection`/`findForMap` จึงส่ง `null` ได้อย่างปลอดภัย
- กรณี `type == null` ไม่มีการจัดการพิเศษใน source (ไม่มี null-check) จึงคาดว่าจะ throw `NullPointerException` — เป็นการทดสอบ edge-case ตาม behavior จริงของโค้ด ไม่ใช่การเดา behavior ใหม่

```java
package com.fasterxml.jackson.databind.deser.impl;

import java.lang.reflect.Method;
import java.util.*;

import org.junit.Test;
import static org.junit.Assert.*;

import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.fasterxml.jackson.databind.util.Converter;
// import คลาสเป้าหมายตามข้อกำหนด (อยู่ package เดียวกัน แต่ import ชัดเจนตามที่กำหนด)
import com.fasterxml.jackson.databind.deser.impl.JavaUtilCollectionsDeserializers;

public class JavaUtilCollectionsDeserializersTest {

    private final TypeFactory TF = TypeFactory.defaultInstance();

    // ค่านี้ mirror จาก private constant ใน source (TYPE_SINGLETON_SET=1 ... TYPE_UNMODIFIABLE_MAP=6)
    // สมมติฐาน: ค่า int ตรงตาม source ที่ให้มา
    private static final int TYPE_SINGLETON_SET = 1;
    private static final int TYPE_SINGLETON_LIST = 2;
    private static final int TYPE_SINGLETON_MAP = 3;
    private static final int TYPE_UNMODIFIABLE_SET = 4;
    private static final int TYPE_UNMODIFIABLE_LIST = 5;
    private static final int TYPE_UNMODIFIABLE_MAP = 6;
    // TYPE_AS_LIST = 7 เป็น public constant ใช้ JavaUtilCollectionsDeserializers.TYPE_AS_LIST ได้ตรงๆ

    /**
     * เรียก package-private static method converter(...) ผ่าน reflection
     * แล้ว cast ผลลัพธ์ (Object) ไปเป็น public interface Converter<Object,Object>
     * เพื่อเลี่ยงปัญหาการอ้างชื่อ private nested class JavaUtilCollectionsConverter
     */
    @SuppressWarnings("unchecked")
    private Converter<Object,Object> invokeConverter(int kind, JavaType concreteType, Class<?> rawSuper)
            throws Exception {
        Method m = JavaUtilCollectionsDeserializers.class.getDeclaredMethod(
                "converter", int.class, JavaType.class, Class.class);
        m.setAccessible(true);
        Object result = m.invoke(null, kind, concreteType, rawSuper);
        return (Converter<Object,Object>) result;
    }

    // ==================== findForCollection ====================

    @Test
    public void testFindForCollection_ArraysAsList() throws JsonMappingException {
        JavaType type = TF.constructType(Arrays.asList(1, 2).getClass());
        JsonDeserializer<?> d = JavaUtilCollectionsDeserializers.findForCollection(null, type);
        assertNotNull(d);
        assertTrue(d instanceof StdDelegatingDeserializer);
    }

    @Test
    public void testFindForCollection_SingletonList() throws JsonMappingException {
        JavaType type = TF.constructType(Collections.singletonList("x").getClass());
        JsonDeserializer<?> d = JavaUtilCollectionsDeserializers.findForCollection(null, type);
        assertNotNull(d);
        assertTrue(d instanceof StdDelegatingDeserializer);
    }

    @Test
    public void testFindForCollection_SingletonSet() throws JsonMappingException {
        JavaType type = TF.constructType(Collections.singleton("x").getClass());
        JsonDeserializer<?> d = JavaUtilCollectionsDeserializers.findForCollection(null, type);
        assertNotNull(d);
        assertTrue(d instanceof StdDelegatingDeserializer);
    }

    @Test
    public void testFindForCollection_UnmodifiableList() throws JsonMappingException {
        // ArrayList implements RandomAccess เหมือน Collections.singletonList
        // จึงได้ class ตรงกับ CLASS_UNMODIFIABLE_LIST ใน source
        JavaType type = TF.constructType(Collections.unmodifiableList(new ArrayList<Object>()).getClass());
        JsonDeserializer<?> d = JavaUtilCollectionsDeserializers.findForCollection(null, type);
        assertNotNull(d);
        assertTrue(d instanceof StdDelegatingDeserializer);
    }

    @Test
    public void testFindForCollection_UnmodifiableSet() throws JsonMappingException {
        JavaType type = TF.constructType(Collections.unmodifiableSet(new HashSet<Object>()).getClass());
        JsonDeserializer<?> d = JavaUtilCollectionsDeserializers.findForCollection(null, type);
        assertNotNull(d);
        assertTrue(d instanceof StdDelegatingDeserializer);
    }

    @Test
    public void testFindForCollection_NoMatch_ReturnsNull() throws JsonMappingException {
        JavaType type = TF.constructType(ArrayList.class);
        JsonDeserializer<?> d = JavaUtilCollectionsDeserializers.findForCollection(null, type);
        assertNull(d);
    }

    @Test(expected = NullPointerException.class)
    public void testFindForCollection_NullType_ThrowsNPE() throws JsonMappingException {
        // Edge case: source ไม่มี null-check สำหรับ 'type' -> คาดว่า NPE จาก type.hasRawClass(...)
        JavaUtilCollectionsDeserializers.findForCollection(null, null);
    }

    // ==================== findForMap ====================

    @Test
    public void testFindForMap_SingletonMap() throws JsonMappingException {
        JavaType type = TF.constructType(Collections.singletonMap("a", "b").getClass());
        JsonDeserializer<?> d = JavaUtilCollectionsDeserializers.findForMap(null, type);
        assertNotNull(d);
        assertTrue(d instanceof StdDelegatingDeserializer);
    }

    @Test
    public void testFindForMap_UnmodifiableMap() throws JsonMappingException {
        JavaType type = TF.constructType(Collections.unmodifiableMap(new HashMap<Object,Object>()).getClass());
        JsonDeserializer<?> d = JavaUtilCollectionsDeserializers.findForMap(null, type);
        assertNotNull(d);
        assertTrue(d instanceof StdDelegatingDeserializer);
    }

    @Test
    public void testFindForMap_NoMatch_ReturnsNull() throws JsonMappingException {
        JavaType type = TF.constructType(HashMap.class);
        JsonDeserializer<?> d = JavaUtilCollectionsDeserializers.findForMap(null, type);
        assertNull(d);
    }

    @Test(expected = NullPointerException.class)
    public void testFindForMap_NullType_ThrowsNPE() throws JsonMappingException {
        JavaUtilCollectionsDeserializers.findForMap(null, null);
    }

    // ==================== converter() + Converter#convert branches ====================

    @Test
    public void testConverter_SingletonSet_ValidSize() throws Exception {
        JavaType concrete = TF.constructType(HashSet.class);
        Converter<Object,Object> conv = invokeConverter(TYPE_SINGLETON_SET, concrete, Set.class);
        Set<String> input = new HashSet<String>(Arrays.asList("only"));
        Object result = conv.convert(input);
        assertEquals(Collections.singleton("only"), result);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConverter_SingletonSet_InvalidSize_Empty() throws Exception {
        JavaType concrete = TF.constructType(HashSet.class);
        Converter<Object,Object> conv = invokeConverter(TYPE_SINGLETON_SET, concrete, Set.class);
        conv.convert(new HashSet<String>());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConverter_SingletonSet_InvalidSize_Multiple() throws Exception {
        JavaType concrete = TF.constructType(HashSet.class);
        Converter<Object,Object> conv = invokeConverter(TYPE_SINGLETON_SET, concrete, Set.class);
        conv.convert(new HashSet<String>(Arrays.asList("a", "b")));
    }

    @Test
    public void testConverter_SingletonList_ValidSize() throws Exception {
        JavaType concrete = TF.constructType(ArrayList.class);
        Converter<Object,Object> conv = invokeConverter(TYPE_SINGLETON_LIST, concrete, List.class);
        List<String> input = new ArrayList<String>(Arrays.asList("only"));
        Object result = conv.convert(input);
        assertEquals(Collections.singletonList("only"), result);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConverter_SingletonList_InvalidSize() throws Exception {
        JavaType concrete = TF.constructType(ArrayList.class);
        Converter<Object,Object> conv = invokeConverter(TYPE_SINGLETON_LIST, concrete, List.class);
        conv.convert(new ArrayList<String>());
    }

    @Test
    public void testConverter_SingletonMap_ValidSize() throws Exception {
        JavaType concrete = TF.constructType(HashMap.class);
        Converter<Object,Object> conv = invokeConverter(TYPE_SINGLETON_MAP, concrete, Map.class);
        Map<String,String> input = new HashMap<String,String>();
        input.put("k", "v");
        Object result = conv.convert(input);
        assertEquals(Collections.singletonMap("k", "v"), result);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConverter_SingletonMap_InvalidSize() throws Exception {
        JavaType concrete = TF.constructType(HashMap.class);
        Converter<Object,Object> conv = invokeConverter(TYPE_SINGLETON_MAP, concrete, Map.class);
        conv.convert(new HashMap<String,String>());
    }

    @Test
    public void testConverter_UnmodifiableSet() throws Exception {
        JavaType concrete = TF.constructType(HashSet.class);
        Converter<Object,Object> conv = invokeConverter(TYPE_UNMODIFIABLE_SET, concrete, Set.class);
        Set<String> input = new HashSet<String>(Arrays.asList("a", "b"));
        Object result = conv.convert(input);
        assertTrue(result instanceof Set);
        assertEquals(input, result);
        try {
            ((Set<String>) result).add("c");
            fail("Expected UnsupportedOperationException for unmodifiable set");
        } catch (UnsupportedOperationException expected) {
            // expected
        }
    }

    @Test
    public void testConverter_UnmodifiableList() throws Exception {
        JavaType concrete = TF.constructType(ArrayList.class);
        Converter<Object,Object> conv = invokeConverter(TYPE_UNMODIFIABLE_LIST, concrete, List.class);
        List<String> input = new ArrayList<String>(Arrays.asList("a", "b"));
        Object result = conv.convert(input);
        assertTrue(result instanceof List);
        assertEquals(input, result);
        try {
            ((List<String>) result).add("c");
            fail("Expected UnsupportedOperationException for unmodifiable list");
        } catch (UnsupportedOperationException expected) {
            // expected
        }
    }

    @Test
    public void testConverter_UnmodifiableMap() throws Exception {
        JavaType concrete = TF.constructType(HashMap.class);
        Converter<Object,Object> conv = invokeConverter(TYPE_UNMODIFIABLE_MAP, concrete, Map.class);
        Map<String,String> input = new HashMap<String,String>();
        input.put("k", "v");
        Object result = conv.convert(input);
        assertTrue(result instanceof Map);
        assertEquals(input, result);
        try {
            ((Map<String,String>) result).put("k2", "v2");
            fail("Expected UnsupportedOperationException for unmodifiable map");
        } catch (UnsupportedOperationException expected) {
            // expected
        }
    }

    @Test
    public void testConverter_AsList_ReturnsSameInstance() throws Exception {
        JavaType concrete = TF.constructType(ArrayList.class);
        Converter<Object,Object> conv = invokeConverter(
                JavaUtilCollectionsDeserializers.TYPE_AS_LIST, concrete, List.class);
        List<String> input = new ArrayList<String>(Arrays.asList("a", "b"));
        Object result = conv.convert(input);
        assertSame(input, result);
    }

    @Test
    public void testConverter_DefaultCase_UnknownKind_ReturnsSameInstance() throws Exception {
        // ค่า kind ที่ไม่ตรงกับ case ใดๆ ต้องเข้า branch 'default' ใน switch
        JavaType concrete = TF.constructType(ArrayList.class);
        Converter<Object,Object> conv = invokeConverter(999, concrete, List.class);
        List<String> input = new ArrayList<String>(Arrays.asList("x"));
        Object result = conv.convert(input);
        assertSame(input, result);
    }

    @Test
    public void testConverter_ConvertNull_ReturnsNull() throws Exception {
        JavaType concrete = TF.constructType(HashSet.class);
        Converter<Object,Object> conv = invokeConverter(TYPE_SINGLETON_SET, concrete, Set.class);
        assertNull(conv.convert(null));
    }

    @Test
    public void testConverter_InputOutputType_SameFieldValue() throws Exception {
        JavaType concrete = TF.constructType(HashSet.class);
        Converter<Object,Object> conv = invokeConverter(TYPE_UNMODIFIABLE_SET, concrete, Set.class);
        TypeFactory tf = TypeFactory.defaultInstance();
        JavaType in = conv.getInputType(tf);
        JavaType out = conv.getOutputType(tf);
        assertNotNull(in);
        // getInputType/getOutputType คืนค่า field เดียวกัน (_inputType) ตาม source
        assertSame(in, out);
    }
}
```

## ตารางสรุปการครอบคลุม Branch/Condition

| Test Method | Branch / Condition ที่ครอบคลุม |
|---|---|
| `testFindForCollection_ArraysAsList` | `findForCollection`: if-branch `hasRawClass(CLASS_AS_ARRAYS_LIST)==true` |
| `testFindForCollection_SingletonList` | else-if `hasRawClass(CLASS_SINGLETON_LIST)==true` |
| `testFindForCollection_SingletonSet` | else-if `hasRawClass(CLASS_SINGLETON_SET)==true` |
| `testFindForCollection_UnmodifiableList` | else-if `hasRawClass(CLASS_UNMODIFIABLE_LIST)==true` |
| `testFindForCollection_UnmodifiableSet` | else-if `hasRawClass(CLASS_UNMODIFIABLE_SET)==true` |
| `testFindForCollection_NoMatch_ReturnsNull` | else branch → return null (ทุก condition false) |
| `testFindForCollection_NullType_ThrowsNPE` | edge-case: null input (ไม่ใช่ branch ใน source แต่ทดสอบ exception path) |
| `testFindForMap_SingletonMap` | `findForMap`: if-branch `hasRawClass(CLASS_SINGLETON_MAP)==true` |
| `testFindForMap_UnmodifiableMap` | else-if `hasRawClass(CLASS_UNMODIFIABLE_MAP)==true` |
| `testFindForMap_NoMatch_ReturnsNull` | else branch → return null |
| `testFindForMap_NullType_ThrowsNPE` | edge-case: null input |
| `testConverter_SingletonSet_ValidSize` | switch case `TYPE_SINGLETON_SET`, `_checkSingleton` size==1 (no throw) |
| `testConverter_SingletonSet_InvalidSize_Empty` | `_checkSingleton` size==0 (throw, boundary) |
| `testConverter_SingletonSet_InvalidSize_Multiple` | `_checkSingleton` size>1 (throw) |
| `testConverter_SingletonList_ValidSize` | case `TYPE_SINGLETON_LIST`, size==1 |
| `testConverter_SingletonList_InvalidSize` | case `TYPE_SINGLETON_LIST`, size!=1 (throw) |
| `testConverter_SingletonMap_ValidSize` | case `TYPE_SINGLETON_MAP`, size==1 |
| `testConverter_SingletonMap_InvalidSize` | case `TYPE_SINGLETON_MAP`, size!=1 (throw) |
| `testConverter_UnmodifiableSet` | case `TYPE_UNMODIFIABLE_SET` |
| `testConverter_UnmodifiableList` | case `TYPE_UNMODIFIABLE_LIST` |
| `testConverter_UnmodifiableMap` | case `TYPE_UNMODIFIABLE_MAP` |
| `testConverter_AsList_ReturnsSameInstance` | case `TYPE_AS_LIST` (7) |
| `testConverter_DefaultCase_UnknownKind_ReturnsSameInstance` | `default` case ของ switch (kind ไม่ตรงค่าใดเลย) |
| `testConverter_ConvertNull_ReturnsNull` | top-level `if (value == null) return null;` branch |
| `testConverter_InputOutputType_SameFieldValue` | `getInputType`/`getOutputType` คืนค่า field เดียวกัน |

**ข้อจำกัดที่ยอมรับ:** ไม่ได้ทดสอบ `_checkSingleton` ผ่าน public API ตรงๆ เพราะเป็น private method — ครอบคลุมผ่าน `convert()` ของ `TYPE_SINGLETON_*` แทน ซึ่งเป็นเส้นทางเดียวที่ source เรียกใช้จริง