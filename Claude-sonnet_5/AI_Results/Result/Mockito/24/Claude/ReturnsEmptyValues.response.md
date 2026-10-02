# ReturnsEmptyValuesTest.java

```java
package org.mockito.internal.stubbing.defaultanswers;

import org.junit.Test;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;

import static org.junit.Assert.*;
import static org.mockito.Mockito.withSettings;

/**
 * Unit tests for {@link ReturnsEmptyValues}.
 *
 * หมายเหตุ: เนื่องจาก ReturnsEmptyValues เป็นคลาสภายในของ Mockito เอง
 * (อยู่ใน source tree เดียวกันกับที่ถูกทดสอบ - Defects4J Mockito-24b)
 * เราจึงสามารถใช้ org.mockito.Mockito (ซึ่งเป็น source-under-test เดียวกัน)
 * เพื่อสร้าง mock จริง สำหรับทดสอบเส้นทาง answer() ที่ต้องพึ่ง MockUtil/MockName
 * โดยไม่ถือว่าเป็นการเพิ่ม library ภายนอกนอกเหนือจาก classpath ที่กำหนด
 */
public class ReturnsEmptyValuesTest {

    private final ReturnsEmptyValues rev = new ReturnsEmptyValues();

    // ---------- Interface สำหรับทดสอบ answer() ผ่าน mock จริง ----------
    interface SampleInterface extends Comparable<SampleInterface> {
        int returnPrimitiveInt();
        Integer returnWrapperInteger();
        boolean returnPrimitiveBoolean();
        Boolean returnWrapperBoolean();
        List<Object> returnList();
        Set<Object> returnSet();
        Map<Object, Object> returnMap();
        String returnString();      // ไม่รองรับ -> คาดหวัง null
        Object returnObject();      // ไม่รองรับ -> คาดหวัง null
    }

    // =========================================================
    // 1) returnValueFor(Class<?>) - primitive & wrapper branch
    // =========================================================
    @Test
    public void returnValueFor_primitives_returnDefaultValues() {
        assertEquals(0, rev.returnValueFor(int.class));
        assertEquals(0L, rev.returnValueFor(long.class));
        assertEquals((short) 0, rev.returnValueFor(short.class));
        assertEquals((byte) 0, rev.returnValueFor(byte.class));
        assertEquals(0.0f, rev.returnValueFor(float.class));
        assertEquals(0.0d, rev.returnValueFor(double.class));
        assertEquals(Boolean.FALSE, rev.returnValueFor(boolean.class));
        assertEquals('\u0000', rev.returnValueFor(char.class));
    }

    @Test
    public void returnValueFor_wrapperClasses_returnDefaultValues() {
        assertEquals(Integer.valueOf(0), rev.returnValueFor(Integer.class));
        assertEquals(Long.valueOf(0L), rev.returnValueFor(Long.class));
        assertEquals(Short.valueOf((short) 0), rev.returnValueFor(Short.class));
        assertEquals(Byte.valueOf((byte) 0), rev.returnValueFor(Byte.class));
        assertEquals(Float.valueOf(0.0f), rev.returnValueFor(Float.class));
        assertEquals(Double.valueOf(0.0d), rev.returnValueFor(Double.class));
        assertEquals(Boolean.FALSE, rev.returnValueFor(Boolean.class));
        assertEquals(Character.valueOf('\u0000'), rev.returnValueFor(Character.class));
    }

    // =========================================================
    // 2) returnValueFor(Class<?>) - collection/map branches
    // =========================================================
    @Test
    public void returnValueFor_collectionBranch_isLinkedListAndMutable() {
        Object result = rev.returnValueFor(Collection.class);
        assertTrue(result instanceof LinkedList);
        assertTrue(((Collection<?>) result).isEmpty());
        // ต้องแก้ไขได้ (ไม่ใช่ immutable) ตาม comment ในซอร์ส
        @SuppressWarnings("unchecked")
        Collection<Object> c = (Collection<Object>) result;
        c.add("x");
        assertEquals(1, c.size());
    }

    @Test
    public void returnValueFor_setBranch_isHashSet() {
        Object result = rev.returnValueFor(Set.class);
        assertTrue(result instanceof HashSet);
        assertTrue(((Set<?>) result).isEmpty());
    }

    @Test
    public void returnValueFor_hashSetBranch_isHashSet() {
        assertTrue(rev.returnValueFor(HashSet.class) instanceof HashSet);
    }

    @Test
    public void returnValueFor_sortedSetBranch_isTreeSet() {
        assertTrue(rev.returnValueFor(SortedSet.class) instanceof TreeSet);
    }

    @Test
    public void returnValueFor_treeSetBranch_isTreeSet() {
        assertTrue(rev.returnValueFor(TreeSet.class) instanceof TreeSet);
    }

    @Test
    public void returnValueFor_linkedHashSetBranch_isLinkedHashSet() {
        assertTrue(rev.returnValueFor(LinkedHashSet.class) instanceof LinkedHashSet);
    }

    @Test
    public void returnValueFor_listBranch_isLinkedList() {
        assertTrue(rev.returnValueFor(List.class) instanceof LinkedList);
    }

    @Test
    public void returnValueFor_linkedListBranch_isLinkedList() {
        assertTrue(rev.returnValueFor(LinkedList.class) instanceof LinkedList);
    }

    @Test
    public void returnValueFor_arrayListBranch_isArrayList() {
        assertTrue(rev.returnValueFor(ArrayList.class) instanceof ArrayList);
    }

    @Test
    public void returnValueFor_mapBranch_isHashMapAndMutable() {
        Object result = rev.returnValueFor(Map.class);
        assertTrue(result instanceof HashMap);
        @SuppressWarnings("unchecked")
        Map<Object, Object> m = (Map<Object, Object>) result;
        m.put("k", "v");
        assertEquals(1, m.size());
    }

    @Test
    public void returnValueFor_hashMapBranch_isHashMap() {
        assertTrue(rev.returnValueFor(HashMap.class) instanceof HashMap);
    }

    @Test
    public void returnValueFor_sortedMapBranch_isTreeMap() {
        assertTrue(rev.returnValueFor(SortedMap.class) instanceof TreeMap);
    }

    @Test
    public void returnValueFor_treeMapBranch_isTreeMap() {
        assertTrue(rev.returnValueFor(TreeMap.class) instanceof TreeMap);
    }

    @Test
    public void returnValueFor_linkedHashMapBranch_isLinkedHashMap() {
        assertTrue(rev.returnValueFor(LinkedHashMap.class) instanceof LinkedHashMap);
    }

    // =========================================================
    // 3) returnValueFor(Class<?>) - fallback (else) branch -> null
    // =========================================================
    @Test
    public void returnValueFor_unsupportedType_returnsNull() {
        assertNull(rev.returnValueFor(String.class));
        assertNull(rev.returnValueFor(Object.class));
        // Iterable ไม่ถูกจัดการ ตาม TODO comment ในซอร์ส (issue 175)
        assertNull(rev.returnValueFor(Iterable.class));
    }

    @Test
    public void returnValueFor_nullType_returnsNull() {
        // boundary case: type = null -> ทุก condition false -> fallback คืน null
        assertNull(rev.returnValueFor(null));
    }

    // =========================================================
    // 4) answer(InvocationOnMock) - isToString branch
    // =========================================================
    @Test
    public void answer_toString_defaultMockName_returnsGeneratedDescription() {
        SampleInterface mock = Mockito.mock(SampleInterface.class, new ReturnsEmptyValues());
        String result = mock.toString();
        assertNotNull(result);
        assertTrue(result.startsWith("Mock for SampleInterface"));
        assertTrue(result.contains("hashCode"));
    }

    @Test
    public void answer_toString_customMockName_returnsNameDirectly() {
        SampleInterface mock = Mockito.mock(SampleInterface.class,
                withSettings().name("myCustomMock").defaultAnswer(new ReturnsEmptyValues()));
        assertEquals("myCustomMock", mock.toString());
    }

    // =========================================================
    // 5) answer(InvocationOnMock) - isCompareToMethod branch
    // =========================================================
    @Test
    public void answer_compareTo_alwaysReturnsOne_evenForSameReference() {
        SampleInterface mock = Mockito.mock(SampleInterface.class, new ReturnsEmptyValues());
        // ตาม comment ในซอร์ส: คืน 1 เสมอ (ไม่ใช่ 0) แม้จะเป็น reference เดียวกันก็ตาม
        // นี่คือ behavior ที่ตั้งใจ (see issue 184) - ทดสอบไว้เพื่อดักจับ regression
        assertEquals(1, mock.compareTo(mock));
    }

    // =========================================================
    // 6) answer(InvocationOnMock) - default returnValueFor branch (ผ่าน mock จริง)
    // =========================================================
    @Test
    public void answer_primitiveReturningMethod_viaMock_returnsDefaultPrimitive() {
        SampleInterface mock = Mockito.mock(SampleInterface.class, new ReturnsEmptyValues());
        assertEquals(0, mock.returnPrimitiveInt());
        assertEquals(Integer.valueOf(0), mock.returnWrapperInteger());
        assertFalse(mock.returnPrimitiveBoolean());
        assertFalse(mock.returnWrapperBoolean());
    }

    @Test
    public void answer_collectionReturningMethod_viaMock_returnsEmptyMutableCollection() {
        SampleInterface mock = Mockito.mock(SampleInterface.class, new ReturnsEmptyValues());
        List<Object> list = mock.returnList();
        Set<Object> set = mock.returnSet();
        Map<Object, Object> map = mock.returnMap();

        assertNotNull(list);
        assertTrue(list.isEmpty());
        assertNotNull(set);
        assertTrue(set.isEmpty());
        assertNotNull(map);
        assertTrue(map.isEmpty());
    }

    @Test
    public void answer_unsupportedReturnType_viaMock_returnsNull() {
        SampleInterface mock = Mockito.mock(SampleInterface.class, new ReturnsEmptyValues());
        assertNull(mock.returnString());
        assertNull(mock.returnObject());
    }
}
```

---

## ตารางสรุป Branch/Condition Coverage

| เมธอดทดสอบ | Branch/Condition ที่ครอบคลุม |
|---|---|
| `returnValueFor_primitives_returnDefaultValues` | `Primitives.isPrimitiveOrWrapper(type)` = true สำหรับ primitive ทุกชนิด (int, long, short, byte, float, double, boolean, char) |
| `returnValueFor_wrapperClasses_returnDefaultValues` | branch เดียวกัน แต่ด้วย wrapper class (Integer, Long, Short, Byte, Float, Double, Boolean, Character) — ยืนยัน "consistent value" ตาม javadoc |
| `returnValueFor_collectionBranch_isLinkedListAndMutable` | `type == Collection.class` + ตรวจว่าเป็น mutable instance (ไม่ใช่ immutable emptyList) |
| `returnValueFor_setBranch_isHashSet` | `type == Set.class` |
| `returnValueFor_hashSetBranch_isHashSet` | `type == HashSet.class` |
| `returnValueFor_sortedSetBranch_isTreeSet` | `type == SortedSet.class` |
| `returnValueFor_treeSetBranch_isTreeSet` | `type == TreeSet.class` |
| `returnValueFor_linkedHashSetBranch_isLinkedHashSet` | `type == LinkedHashSet.class` |
| `returnValueFor_listBranch_isLinkedList` | `type == List.class` |
| `returnValueFor_linkedListBranch_isLinkedList` | `type == LinkedList.class` |
| `returnValueFor_arrayListBranch_isArrayList` | `type == ArrayList.class` |
| `returnValueFor_mapBranch_isHashMapAndMutable` | `type == Map.class` + mutability check |
| `returnValueFor_hashMapBranch_isHashMap` | `type == HashMap.class` |
| `returnValueFor_sortedMapBranch_isTreeMap` | `type == SortedMap.class` |
| `returnValueFor_treeMapBranch_isTreeMap` | `type == TreeMap.class` |
| `returnValueFor_linkedHashMapBranch_isLinkedHashMap` | `type == LinkedHashMap.class` |
| `returnValueFor_unsupportedType_returnsNull` | fallback `return null` (ไม่ตรง condition ใดเลย) — ตรวจกรณี String, Object, Iterable (ตาม TODO comment issue 175) |
| `returnValueFor_nullType_returnsNull` | boundary case: `type == null` → ทุก `==` comparison false → fallback null |
| `answer_toString_defaultMockName_returnsGeneratedDescription` | `methodsGuru.isToString(...)` = true, `name.isDefault()` = true branch |
| `answer_toString_customMockName_returnsNameDirectly` | `isToString` = true, `name.isDefault()` = false branch (else) |
| `answer_compareTo_alwaysReturnsOne_evenForSameReference` | `isToString` = false, `isCompareToMethod(...)` = true branch (คืนค่า 1 เสมอ) |
| `answer_primitiveReturningMethod_viaMock_returnsDefaultPrimitive` | `isToString`=false, `isCompareToMethod`=false → fallthrough ไปเรียก `returnValueFor` กับ primitive type ผ่าน mock จริง |
| `answer_collectionReturningMethod_viaMock_returnsEmptyMutableCollection` | เส้นทางเดียวกัน แต่ return type เป็น Collection/Set/Map ผ่าน mock จริง |
| `answer_unsupportedReturnType_viaMock_returnsNull` | เส้นทางเดียวกัน แต่ return type ไม่รองรับ (String/Object) → ยืนยันผล null ที่ส่งกลับจาก `answer()` ทั้งระบบ (ไม่ใช่แค่ `returnValueFor` โดด ๆ) |

**หมายเหตุ/ข้อจำกัดที่ระบุไว้ตามข้อกำหนด:**
- ไม่ได้เดา behavior เพิ่มเติมนอกจาก source เช่น ไม่ทดสอบ `Iterable` ว่าควรคืนอะไรเกินกว่า "null" เพราะมี TODO comment ชัดเจนว่ายังไม่ implement
- การทดสอบ `compareTo` ยืนยันพฤติกรรมตาม comment ในซอร์ส (คืน 1 เสมอแม้ reference เดียวกัน) ไม่ได้ตีความว่าเป็น "ถูก" หรือ "ผิด" เชิง logic เอง เพียงยึดตามโค้ดจริง
- ไม่ได้ทดสอบ `void` return type เนื่องจากไม่มีหลักฐานชัดเจนใน `Primitives` ว่าถูกจัดการอย่างไร (หลีกเลี่ยงการเดา)