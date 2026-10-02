# วิเคราะห์คลาส `SimpleType`

จากซอร์สโค้ด มีจุดที่ต้องทดสอบแบ่งตาม branch/condition หลัก ๆ ดังนี้: `construct()` (throw ตามชนิด Map/Collection/array), `_narrow()` (class เดิม vs class ใหม่), `withXxxHandler()` (handler เดิม vs handler ใหม่, และกลุ่มที่ throw เสมอ), `withStaticTyping()` (static แล้ว vs ยังไม่ static), `refine()` (return null เสมอ), `buildCanonicalName()`/`getGenericSignature()` (bindings count = 0 vs > 0), `equals()` (ทุกเงื่อนไข if) และ `isContainerType()`/`toString()`

**หมายเหตุสำคัญ:** ผมวางคลาสทดสอบไว้ใน package เดียวกับคลาสเป้าหมาย (`com.fasterxml.jackson.databind.type`) เพื่อให้เข้าถึงเมธอด `protected` (`_narrow`, `buildCanonicalName`) ได้ตรง ๆ โดยไม่ต้องใช้ reflection และสมมติว่า `JavaType` มีเมธอด public `getRawClass()`, `getTypeHandler()`, `getValueHandler()` ตามธรรมชาติของ Jackson API (คอมเมนต์ไว้ในโค้ดว่าเป็นสมมติฐาน)

```java
package com.fasterxml.jackson.databind.type;

import static org.junit.Assert.*;

import java.util.*;

import org.junit.Test;

import com.fasterxml.jackson.databind.JavaType;

/**
 * Unit tests for {@link SimpleType}.
 * หมายเหตุ: วางไว้ package เดียวกับคลาสเป้าหมายเพื่อเข้าถึง protected members
 * (_narrow, buildCanonicalName) ได้โดยตรง
 */
@SuppressWarnings("deprecation")
public class SimpleTypeTest {

    // ใช้คลาส generic เล็ก ๆ ของเราเอง เพื่อหลีกเลี่ยงพฤติกรรมพิเศษ
    // ที่อาจเกิดกับคลาสมาตรฐานบางตัว (เช่น AtomicReference ที่อาจถูกจัดการโดย ReferenceType)
    static class Box<T> {
    }

    // ---------------------------------------------------------
    // construct(Class<?>) : ตรวจ boundary/exception ทุก branch
    // ---------------------------------------------------------

    @Test
    public void construct_withSimpleClass_returnsSimpleType() {
        SimpleType type = SimpleType.construct(String.class);
        assertNotNull(type);
        assertEquals(String.class, type.getRawClass());
        assertFalse(type.isContainerType());
    }

    @Test
    public void construct_withPrimitiveClass_returnsSimpleType() {
        // boundary case: primitive type ก็ถือเป็น simple type
        SimpleType type = SimpleType.construct(int.class);
        assertEquals(int.class, type.getRawClass());
    }

    @Test(expected = IllegalArgumentException.class)
    public void construct_withMapClass_throwsIllegalArgumentException() {
        SimpleType.construct(Map.class);
    }

    @Test(expected = IllegalArgumentException.class)
    public void construct_withCollectionClass_throwsIllegalArgumentException() {
        SimpleType.construct(ArrayList.class);
    }

    @Test(expected = IllegalArgumentException.class)
    public void construct_withArrayClass_throwsIllegalArgumentException() {
        SimpleType.construct(String[].class);
    }

    // ---------------------------------------------------------
    // constructUnsafe(Class<?>)
    // ---------------------------------------------------------

    @Test
    public void constructUnsafe_returnsSimpleTypeWithRawClass() {
        SimpleType type = SimpleType.constructUnsafe(Integer.class);
        assertNotNull(type);
        assertEquals(Integer.class, type.getRawClass());
    }

    // ---------------------------------------------------------
    // _narrow(Class<?>) : same-class branch / different-class branch
    // ---------------------------------------------------------

    @Test
    public void narrow_sameClass_returnsSameInstance() {
        SimpleType type = SimpleType.construct(String.class);
        JavaType narrowed = type._narrow(String.class);
        assertSame(type, narrowed);
    }

    @Test
    public void narrow_differentClass_returnsNewInstanceWithSubclass() {
        SimpleType type = SimpleType.construct(Number.class);
        JavaType narrowed = type._narrow(Integer.class);
        assertNotSame(type, narrowed);
        assertEquals(Integer.class, narrowed.getRawClass());
    }

    // ---------------------------------------------------------
    // withContentType / withContentTypeHandler / withContentValueHandler
    // : ทุกตัวต้อง throw เสมอ (ไม่มี branch)
    // ---------------------------------------------------------

    @Test(expected = IllegalArgumentException.class)
    public void withContentType_alwaysThrows() {
        SimpleType type = SimpleType.construct(String.class);
        JavaType content = SimpleType.construct(String.class);
        type.withContentType(content);
    }

    @Test(expected = IllegalArgumentException.class)
    public void withContentTypeHandler_alwaysThrows() {
        SimpleType type = SimpleType.construct(String.class);
        type.withContentTypeHandler(new Object());
    }

    @Test(expected = IllegalArgumentException.class)
    public void withContentValueHandler_alwaysThrows() {
        SimpleType type = SimpleType.construct(String.class);
        type.withContentValueHandler(new Object());
    }

    // ---------------------------------------------------------
    // withTypeHandler : handler เดิม (same ref) vs handler ใหม่
    // ---------------------------------------------------------

    @Test
    public void withTypeHandler_sameHandler_returnsSameInstance() {
        SimpleType type = SimpleType.construct(String.class); // typeHandler เริ่มเป็น null
        SimpleType result = type.withTypeHandler(null);
        assertSame(type, result);
    }

    @Test
    public void withTypeHandler_differentHandler_returnsNewInstance() {
        SimpleType type = SimpleType.construct(String.class);
        Object handler = new Object();
        SimpleType result = type.withTypeHandler(handler);
        assertNotSame(type, result);
        // สมมติฐาน: JavaType มีเมธอด public getTypeHandler()
        assertSame(handler, result.getTypeHandler());
    }

    // ---------------------------------------------------------
    // withValueHandler : handler เดิม vs handler ใหม่
    // ---------------------------------------------------------

    @Test
    public void withValueHandler_sameHandler_returnsSameInstance() {
        SimpleType type = SimpleType.construct(String.class); // valueHandler เริ่มเป็น null
        SimpleType result = type.withValueHandler(null);
        assertSame(type, result);
    }

    @Test
    public void withValueHandler_differentHandler_returnsNewInstance() {
        SimpleType type = SimpleType.construct(String.class);
        Object handler = new Object();
        SimpleType result = type.withValueHandler(handler);
        assertNotSame(type, result);
        // สมมติฐาน: JavaType มีเมธอด public getValueHandler()
        assertSame(handler, result.getValueHandler());
    }

    // ---------------------------------------------------------
    // withStaticTyping : ยังไม่ static vs static แล้ว
    // ---------------------------------------------------------

    @Test
    public void withStaticTyping_notStaticYet_returnsNewInstance() {
        SimpleType type = SimpleType.construct(String.class); // asStatic = false
        SimpleType result = type.withStaticTyping();
        assertNotSame(type, result);
    }

    @Test
    public void withStaticTyping_alreadyStatic_returnsSameInstance() {
        SimpleType type = SimpleType.construct(String.class);
        SimpleType onceStatic = type.withStaticTyping();
        SimpleType twiceStatic = onceStatic.withStaticTyping();
        assertSame(onceStatic, twiceStatic);
    }

    // ---------------------------------------------------------
    // refine(...) : ต้อง return null เสมอ
    // ---------------------------------------------------------

    @Test
    public void refine_alwaysReturnsNull() {
        SimpleType type = SimpleType.construct(String.class);
        JavaType result = type.refine(Integer.class, TypeBindings.emptyBindings(), null, null);
        assertNull(result);
    }

    // ---------------------------------------------------------
    // buildCanonicalName() : bindings count == 0 vs > 0
    // ---------------------------------------------------------

    @Test
    public void buildCanonicalName_noBindings_returnsClassName() {
        SimpleType type = SimpleType.construct(String.class);
        assertEquals(String.class.getName(), type.buildCanonicalName());
    }

    @Test
    public void buildCanonicalName_withBindings_includesTypeParameters() {
        JavaType parametric = TypeFactory.defaultInstance()
                .constructParametricType(Box.class, String.class);
        // สมมติฐาน: TypeFactory จะสร้าง SimpleType สำหรับ generic type ที่ไม่ใช่ container
        assertTrue("Expected a SimpleType for non-container generic type",
                parametric instanceof SimpleType);
        SimpleType type = (SimpleType) parametric;
        String canonical = type.buildCanonicalName();
        assertTrue(canonical.startsWith(Box.class.getName()));
        assertTrue(canonical.contains("<"));
        assertTrue(canonical.contains(String.class.getName()));
        assertTrue(canonical.endsWith(">"));
    }

    // ---------------------------------------------------------
    // isContainerType() : always false
    // ---------------------------------------------------------

    @Test
    public void isContainerType_alwaysFalse() {
        SimpleType type = SimpleType.construct(Object.class);
        assertFalse(type.isContainerType());
    }

    // ---------------------------------------------------------
    // getErasedSignature() : ไม่มี generic bracket
    // (ไม่ทดสอบ format ภายในของ _classSignature เพราะไม่มีซอร์สให้ดู)
    // ---------------------------------------------------------

    @Test
    public void getErasedSignature_doesNotContainGenericBrackets() {
        JavaType parametric = TypeFactory.defaultInstance()
                .constructParametricType(Box.class, String.class);
        SimpleType type = (SimpleType) parametric;
        StringBuilder sb = new StringBuilder();
        StringBuilder result = type.getErasedSignature(sb);
        assertNotNull(result);
        assertFalse(result.toString().contains("<"));
    }

    // ---------------------------------------------------------
    // getGenericSignature() : bindings count == 0 vs > 0
    // ---------------------------------------------------------

    @Test
    public void getGenericSignature_noBindings_endsWithSemicolonNoBrackets() {
        SimpleType type = SimpleType.construct(String.class);
        StringBuilder sb = new StringBuilder();
        StringBuilder result = type.getGenericSignature(sb);
        String s = result.toString();
        assertTrue(s.endsWith(";"));
        assertFalse(s.contains("<"));
        assertFalse(s.contains(">"));
    }

    @Test
    public void getGenericSignature_withBindings_containsBrackets() {
        JavaType parametric = TypeFactory.defaultInstance()
                .constructParametricType(Box.class, String.class);
        SimpleType type = (SimpleType) parametric;
        StringBuilder sb = new StringBuilder();
        StringBuilder result = type.getGenericSignature(sb);
        String s = result.toString();
        assertTrue(s.contains("<"));
        assertTrue(s.contains(">"));
        assertTrue(s.endsWith(";"));
    }

    // ---------------------------------------------------------
    // toString()
    // ---------------------------------------------------------

    @Test
    public void toString_matchesExpectedFormat() {
        SimpleType type = SimpleType.construct(String.class);
        String s = type.toString();
        assertEquals("[simple type, class " + type.buildCanonicalName() + "]", s);
    }

    // ---------------------------------------------------------
    // equals() : ทุก branch (this, null, wrong class, diff raw class,
    // same raw class+bindings, same raw class diff bindings)
    // ---------------------------------------------------------

    @Test
    public void equals_sameInstance_returnsTrue() {
        SimpleType type = SimpleType.construct(String.class);
        assertTrue(type.equals(type));
    }

    @Test
    public void equals_null_returnsFalse() {
        SimpleType type = SimpleType.construct(String.class);
        assertFalse(type.equals(null));
    }

    @Test
    public void equals_differentRuntimeClass_returnsFalse() {
        SimpleType type = SimpleType.construct(String.class);
        assertFalse(type.equals("not a SimpleType"));
    }

    @Test
    public void equals_differentRawClass_returnsFalse() {
        SimpleType type1 = SimpleType.construct(String.class);
        SimpleType type2 = SimpleType.construct(Integer.class);
        assertFalse(type1.equals(type2));
    }

    @Test
    public void equals_sameRawClassSameBindings_returnsTrue() {
        SimpleType type1 = SimpleType.construct(String.class);
        SimpleType type2 = SimpleType.construct(String.class);
        assertTrue(type1.equals(type2));
    }

    @Test
    public void equals_sameRawClassDifferentBindings_returnsFalse() {
        JavaType type1 = TypeFactory.defaultInstance()
                .constructParametricType(Box.class, String.class);
        JavaType type2 = TypeFactory.defaultInstance()
                .constructParametricType(Box.class, Integer.class);
        assertFalse(type1.equals(type2));
    }
}
```

## ตารางสรุป Branch/Condition Coverage

| Test method | Method ที่ทดสอบ | Branch/Condition ที่ครอบคลุม |
|---|---|---|
| `construct_withSimpleClass_returnsSimpleType` | `construct()` | ผ่านทุกเงื่อนไข ไม่ throw, path ปกติ |
| `construct_withPrimitiveClass_returnsSimpleType` | `construct()` | boundary: primitive class |
| `construct_withMapClass_throwsIllegalArgumentException` | `construct()` | `Map.class.isAssignableFrom` = true |
| `construct_withCollectionClass_throwsIllegalArgumentException` | `construct()` | `Collection.class.isAssignableFrom` = true |
| `construct_withArrayClass_throwsIllegalArgumentException` | `construct()` | `cls.isArray()` = true |
| `constructUnsafe_returnsSimpleTypeWithRawClass` | `constructUnsafe()` | path การสร้างแบบ unsafe |
| `narrow_sameClass_returnsSameInstance` | `_narrow()` | `_class == subclass` = true |
| `narrow_differentClass_returnsNewInstanceWithSubclass` | `_narrow()` | `_class == subclass` = false |
| `withContentType_alwaysThrows` | `withContentType()` | throw เสมอ |
| `withContentTypeHandler_alwaysThrows` | `withContentTypeHandler()` | throw เสมอ |
| `withContentValueHandler_alwaysThrows` | `withContentValueHandler()` | throw เสมอ |
| `withTypeHandler_sameHandler_returnsSameInstance` | `withTypeHandler()` | `_typeHandler == h` = true |
| `withTypeHandler_differentHandler_returnsNewInstance` | `withTypeHandler()` | `_typeHandler == h` = false |
| `withValueHandler_sameHandler_returnsSameInstance` | `withValueHandler()` | `h == _valueHandler` = true |
| `withValueHandler_differentHandler_returnsNewInstance` | `withValueHandler()` | `h == _valueHandler` = false |
| `withStaticTyping_notStaticYet_returnsNewInstance` | `withStaticTyping()` | `_asStatic` = false |
| `withStaticTyping_alreadyStatic_returnsSameInstance` | `withStaticTyping()` | `_asStatic` = true |
| `refine_alwaysReturnsNull` | `refine()` | return null (single path) |
| `buildCanonicalName_noBindings_returnsClassName` | `buildCanonicalName()` | `count > 0` = false |
| `buildCanonicalName_withBindings_includesTypeParameters` | `buildCanonicalName()` | `count > 0` = true, loop ทำงาน |
| `isContainerType_alwaysFalse` | `isContainerType()` | ค่าคงที่ false |
| `getErasedSignature_doesNotContainGenericBrackets` | `getErasedSignature()` | เรียก `_classSignature(..., true)` |
| `getGenericSignature_noBindings_endsWithSemicolonNoBrackets` | `getGenericSignature()` | `count > 0` = false |
| `getGenericSignature_withBindings_containsBrackets` | `getGenericSignature()` | `count > 0` = true, loop ทำงาน |
| `toString_matchesExpectedFormat` | `toString()` | format string ทั้งหมด |
| `equals_sameInstance_returnsTrue` | `equals()` | `o == this` = true |
| `equals_null_returnsFalse` | `equals()` | `o == null` = true |
| `equals_differentRuntimeClass_returnsFalse` | `equals()` | `o.getClass() != getClass()` = true |
| `equals_differentRawClass_returnsFalse` | `equals()` | `other._class != this._class` = true |
| `equals_sameRawClassSameBindings_returnsTrue` | `equals()` | ผ่านทุกเงื่อนไข, `b1.equals(b2)` = true |
| `equals_sameRawClassDifferentBindings_returnsFalse` | `equals()` | `b1.equals(b2)` = false |

**ข้อควรระวัง/สมมติฐานที่ระบุในโค้ด:**
- สมมติว่า `JavaType` มี public method `getRawClass()`, `getTypeHandler()`, `getValueHandler()`
- สมมติว่า `TypeFactory.defaultInstance().constructParametricType(Class, Class...)` สร้าง `SimpleType` จริงสำหรับ generic class ที่ไม่ใช่ container (ตรวจสอบด้วย `instanceof` ในเทสต์)
- ไม่ทดสอบ format ภายในที่แน่นอนของ `_classSignature(...)` เนื่องจากไม่มีซอร์สโค้ดให้ตรวจสอบ ทดสอบเฉพาะ behavior ที่ปรากฏในซอร์สของ `SimpleType` เอง (การเติม `<`, `>`, `;`)