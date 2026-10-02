# SimpleTypeTest - JUnit 4 Test Suite

**หมายเหตุสำคัญ:** เนื่องจาก `SimpleType` มี field/method หลายตัวเป็น `protected` (เช่น `_class`, `_superClass`, `_bindings`, `_valueHandler`, `_typeHandler`, `_asStatic`, `_narrow()`, `buildCanonicalName()`) จึงวาง test class ไว้ใน **package เดียวกัน** (`com.fasterxml.jackson.databind.type`) เพื่อให้เข้าถึงได้โดยไม่ต้องใช้ reflection ซึ่งจะทำให้ตรวจสอบ branch ภายในได้ตรงและแม่นยำกว่า

```java
package com.fasterxml.jackson.databind.type;

import static org.junit.Assert.*;

import java.util.*;

import org.junit.Test;

import com.fasterxml.jackson.databind.JavaType;

public class SimpleTypeTest {

    // ---- helper classes สำหรับทดสอบ hierarchy / generic binding ----
    static class Base {}
    static class Derived extends Base {}
    static class Pair<A, B> {}

    // =====================================================
    // constructUnsafe()
    // =====================================================

    @Test
    public void constructUnsafe_basicClass_createsSimpleType() {
        SimpleType t = SimpleType.constructUnsafe(String.class);
        assertNotNull(t);
        assertEquals(String.class, t._class);
        assertFalse(t.isContainerType());
        assertEquals("[simple type, class java.lang.String]", t.toString());
    }

    @Test
    public void constructUnsafe_arrayClass_doesNotThrow() {
        // constructUnsafe ไม่มี sanity check เหมือน construct() จึงต้องไม่ throw
        SimpleType t = SimpleType.constructUnsafe(int[].class);
        assertNotNull(t);
        assertEquals(int[].class, t._class);
    }

    @Test
    public void constructUnsafe_mapClass_doesNotThrow() {
        SimpleType t = SimpleType.constructUnsafe(HashMap.class);
        assertNotNull(t);
        assertEquals(HashMap.class, t._class);
    }

    @Test
    public void constructUnsafe_primitiveInt_createsSimpleType() {
        SimpleType t = SimpleType.constructUnsafe(int.class);
        assertNotNull(t);
        assertEquals(int.class, t._class);
    }

    @Test
    public void constructUnsafe_voidClass_boundaryEdgeCase() {
        // boundary: primitive-like special class
        SimpleType t = SimpleType.constructUnsafe(void.class);
        assertNotNull(t);
        assertEquals(void.class, t._class);
    }

    // =====================================================
    // construct() -- deprecated, มี sanity check 3 เงื่อนไข
    // =====================================================

    @Test(expected = IllegalArgumentException.class)
    public void construct_mapClass_throwsIAE() {
        SimpleType.construct(HashMap.class);
    }

    @Test(expected = IllegalArgumentException.class)
    public void construct_collectionClass_throwsIAE() {
        SimpleType.construct(ArrayList.class);
    }

    @Test(expected = IllegalArgumentException.class)
    public void construct_arrayClass_throwsIAE() {
        SimpleType.construct(String[].class);
    }

    @Test(expected = NullPointerException.class)
    public void construct_null_throwsNPE() {
        // Class.isAssignableFrom(null) ระบุใน Java spec ว่า throw NPE
        SimpleType.construct(null);
    }

    @Test
    public void construct_objectClass_superClassIsNull() {
        // Object.class.getSuperclass() == null -> _buildSuperClass คืน null ทันที (branch แรก)
        SimpleType t = SimpleType.construct(Object.class);
        assertNull(t._superClass);
    }

    @Test
    public void construct_directSubclassOfObject_superClassIsUnknownType() {
        // superclass == Object.class -> return TypeFactory.unknownType() (branch ที่สอง)
        SimpleType t = SimpleType.construct(Base.class);
        assertNotNull(t._superClass);
        assertEquals(TypeFactory.unknownType(), t._superClass);
    }

    @Test
    public void construct_twoLevelHierarchy_buildsRecursiveSuperClassChain() {
        // Derived -> Base -> Object : ครอบคลุม branch recursion (else) ของ _buildSuperClass
        SimpleType t = SimpleType.construct(Derived.class);
        assertNotNull(t._superClass);
        assertTrue(t._superClass instanceof SimpleType);
        SimpleType superOfDerived = (SimpleType) t._superClass;
        assertEquals(Base.class, superOfDerived._class);
        assertEquals(TypeFactory.unknownType(), superOfDerived._superClass);
    }

    // =====================================================
    // copy constructor SimpleType(TypeBase)
    // =====================================================

    @Test
    public void copyConstructor_copiesUnderlyingClass() {
        SimpleType original = SimpleType.constructUnsafe(String.class);
        SimpleType copy = new SimpleType(original);
        assertEquals(original._class, copy._class);
        assertTrue(original.equals(copy));
    }

    // =====================================================
    // _narrow()
    // =====================================================

    @Test
    public void narrow_sameClass_returnsThis() {
        SimpleType t = SimpleType.constructUnsafe(String.class);
        JavaType narrowed = t._narrow(String.class);
        assertSame(t, narrowed);
    }

    @Test
    public void narrow_differentClass_returnsNewInstanceLinkedToOriginal() {
        SimpleType t = SimpleType.constructUnsafe(Number.class);
        JavaType narrowed = t._narrow(Integer.class);
        assertNotSame(t, narrowed);
        assertTrue(narrowed instanceof SimpleType);
        SimpleType n = (SimpleType) narrowed;
        assertEquals(Integer.class, n._class);
        assertSame(t, n._superClass);
    }

    // =====================================================
    // withTypeHandler()
    // =====================================================

    @Test
    public void withTypeHandler_sameHandler_returnsThis() {
        Object handler = new Object();
        SimpleType t = new SimpleType(String.class, TypeBindings.emptyBindings(),
                null, null, null, handler, false);
        SimpleType result = t.withTypeHandler(handler);
        assertSame(t, result);
    }

    @Test
    public void withTypeHandler_differentHandler_returnsNewInstance() {
        Object handler1 = new Object();
        Object handler2 = new Object();
        SimpleType t = new SimpleType(String.class, TypeBindings.emptyBindings(),
                null, null, null, handler1, false);
        SimpleType result = t.withTypeHandler(handler2);
        assertNotSame(t, result);
        assertEquals(handler2, result._typeHandler);
        assertEquals(String.class, result._class);
    }

    // =====================================================
    // withValueHandler()
    // =====================================================

    @Test
    public void withValueHandler_sameHandler_returnsThis() {
        Object handler = new Object();
        SimpleType t = new SimpleType(String.class, TypeBindings.emptyBindings(),
                null, null, handler, null, false);
        SimpleType result = t.withValueHandler(handler);
        assertSame(t, result);
    }

    @Test
    public void withValueHandler_differentHandler_returnsNewInstance() {
        Object handler1 = new Object();
        Object handler2 = new Object();
        SimpleType t = new SimpleType(String.class, TypeBindings.emptyBindings(),
                null, null, handler1, null, false);
        SimpleType result = t.withValueHandler(handler2);
        assertNotSame(t, result);
        assertEquals(handler2, result._valueHandler);
    }

    // =====================================================
    // withStaticTyping()
    // =====================================================

    @Test
    public void withStaticTyping_alreadyStatic_returnsThis() {
        SimpleType t = new SimpleType(String.class, TypeBindings.emptyBindings(),
                null, null, null, null, true);
        SimpleType result = t.withStaticTyping();
        assertSame(t, result);
    }

    @Test
    public void withStaticTyping_notStatic_returnsNewInstance() {
        SimpleType t = SimpleType.constructUnsafe(String.class);
        SimpleType result = t.withStaticTyping();
        assertNotSame(t, result);
        assertTrue(result._asStatic);
    }

    // =====================================================
    // withContentType / withContentTypeHandler / withContentValueHandler
    // (ทุกกรณี throw IllegalArgumentException เสมอ ไม่มี branch)
    // =====================================================

    @Test(expected = IllegalArgumentException.class)
    public void withContentType_alwaysThrows() {
        SimpleType t = SimpleType.constructUnsafe(String.class);
        t.withContentType(SimpleType.constructUnsafe(Integer.class));
    }

    @Test(expected = IllegalArgumentException.class)
    public void withContentTypeHandler_alwaysThrows() {
        SimpleType t = SimpleType.constructUnsafe(String.class);
        t.withContentTypeHandler(new Object());
    }

    @Test(expected = IllegalArgumentException.class)
    public void withContentValueHandler_alwaysThrows() {
        SimpleType t = SimpleType.constructUnsafe(String.class);
        t.withContentValueHandler(new Object());
    }

    // =====================================================
    // refine() -- คืน null เสมอ
    // =====================================================

    @Test
    public void refine_alwaysReturnsNull() {
        SimpleType t = SimpleType.constructUnsafe(String.class);
        JavaType result = t.refine(Integer.class, TypeBindings.emptyBindings(), null, null);
        assertNull(result);
    }

    // =====================================================
    // buildCanonicalName()
    // =====================================================

    @Test
    public void buildCanonicalName_noBindings_justClassName() {
        SimpleType t = SimpleType.constructUnsafe(String.class);
        assertEquals("java.lang.String", t.buildCanonicalName());
    }

    @Test
    public void buildCanonicalName_withBindings_appendsGenericParamsWithComma() {
        JavaType strType = SimpleType.constructUnsafe(String.class);
        JavaType intType = SimpleType.constructUnsafe(Integer.class);
        TypeBindings bindings = TypeBindings.create(Pair.class, new JavaType[] { strType, intType });
        SimpleType t = new SimpleType(Pair.class, bindings, null, null);

        String canonical = t.buildCanonicalName();
        assertTrue(canonical.startsWith(Pair.class.getName() + "<"));
        assertTrue(canonical.endsWith(">"));
        assertTrue(canonical.contains("java.lang.String"));
        assertTrue(canonical.contains(","));   // แสดงว่า loop วนมากกว่า 1 ตัวและ append comma ที่ i>0
        assertTrue(canonical.contains("java.lang.Integer"));
    }

    // =====================================================
    // isContainerType()
    // =====================================================

    @Test
    public void isContainerType_alwaysFalse() {
        assertFalse(SimpleType.constructUnsafe(String.class).isContainerType());
        assertFalse(SimpleType.constructUnsafe(HashMap.class).isContainerType());
    }

    // =====================================================
    // getErasedSignature() / getGenericSignature()
    // =====================================================

    @Test
    public void getErasedSignature_returnsNonEmptyBuilder() {
        SimpleType t = SimpleType.constructUnsafe(String.class);
        StringBuilder sb = t.getErasedSignature(new StringBuilder());
        assertNotNull(sb);
        assertTrue(sb.length() > 0);
    }

    @Test
    public void getGenericSignature_noBindings_endsWithSemicolon() {
        SimpleType t = SimpleType.constructUnsafe(String.class);
        StringBuilder sb = t.getGenericSignature(new StringBuilder());
        assertNotNull(sb);
        assertEquals(';', sb.charAt(sb.length() - 1));
    }

    @Test
    public void getGenericSignature_withBindings_loopsOverEachTypeAndAppendsAngleBrackets() {
        JavaType strType = SimpleType.constructUnsafe(String.class);
        JavaType intType = SimpleType.constructUnsafe(Integer.class);
        TypeBindings bindings = TypeBindings.create(Pair.class, new JavaType[] { strType, intType });
        SimpleType t = new SimpleType(Pair.class, bindings, null, null);

        StringBuilder sb = t.getGenericSignature(new StringBuilder());
        assertNotNull(sb);
        assertEquals(';', sb.charAt(sb.length() - 1));
        assertTrue(sb.toString().contains("<"));
        assertTrue(sb.toString().contains(">"));
    }

    // =====================================================
    // toString()
    // =====================================================

    @Test
    public void toString_formatCheck() {
        SimpleType t = SimpleType.constructUnsafe(Integer.class);
        assertEquals("[simple type, class java.lang.Integer]", t.toString());
    }

    // =====================================================
    // equals()
    // =====================================================

    @Test
    public void equals_sameInstance_true() {
        SimpleType t = SimpleType.constructUnsafe(String.class);
        assertTrue(t.equals(t));
    }

    @Test
    public void equals_null_false() {
        SimpleType t = SimpleType.constructUnsafe(String.class);
        assertFalse(t.equals(null));
    }

    @Test
    public void equals_differentRuntimeClass_false() {
        SimpleType t = SimpleType.constructUnsafe(String.class);
        assertFalse(t.equals("not a SimpleType"));
    }

    @Test
    public void equals_differentUnderlyingClass_false() {
        SimpleType t1 = SimpleType.constructUnsafe(String.class);
        SimpleType t2 = SimpleType.constructUnsafe(Integer.class);
        assertFalse(t1.equals(t2));
    }

    @Test
    public void equals_sameClassSameBindings_true() {
        SimpleType t1 = SimpleType.constructUnsafe(String.class);
        SimpleType t2 = SimpleType.constructUnsafe(String.class);
        assertNotSame(t1, t2);
        assertTrue(t1.equals(t2));
    }

    @Test
    public void equals_sameClassDifferentBindings_false() {
        JavaType strType = SimpleType.constructUnsafe(String.class);
        JavaType intType = SimpleType.constructUnsafe(Integer.class);

        TypeBindings b1 = TypeBindings.create(Pair.class, new JavaType[] { strType, intType });
        TypeBindings b2 = TypeBindings.create(Pair.class, new JavaType[] { intType, strType });

        SimpleType t1 = new SimpleType(Pair.class, b1, null, null);
        SimpleType t2 = new SimpleType(Pair.class, b2, null, null);

        assertFalse(t1.equals(t2));
    }
}
```

## สรุปการครอบคลุม Branch/Condition

| Test Method | Branch/Condition ที่ครอบคลุม |
|---|---|
| `constructUnsafe_basicClass_createsSimpleType` | constructUnsafe() path ปกติ, isContainerType()=false, toString() format |
| `constructUnsafe_arrayClass_doesNotThrow` | ยืนยันว่า constructUnsafe ไม่มี array check (ต่างจาก construct()) |
| `constructUnsafe_mapClass_doesNotThrow` | ยืนยันว่า constructUnsafe ไม่มี Map check |
| `constructUnsafe_primitiveInt_createsSimpleType` | boundary: primitive type |
| `constructUnsafe_voidClass_boundaryEdgeCase` | boundary: void.class |
| `construct_mapClass_throwsIAE` | if (Map.isAssignableFrom) = true |
| `construct_collectionClass_throwsIAE` | if (Collection.isAssignableFrom) = true |
| `construct_arrayClass_throwsIAE` | if (cls.isArray()) = true |
| `construct_null_throwsNPE` | null input, NPE จาก isAssignableFrom(null) |
| `construct_objectClass_superClassIsNull` | `_buildSuperClass`: superClass==null branch |
| `construct_directSubclassOfObject_superClassIsUnknownType` | `_buildSuperClass`: superClass==Object.class branch |
| `construct_twoLevelHierarchy_buildsRecursiveSuperClassChain` | `_buildSuperClass`: recursive/else branch |
| `copyConstructor_copiesUnderlyingClass` | constructor `SimpleType(TypeBase)` |
| `narrow_sameClass_returnsThis` | `_narrow`: `_class == subclass` = true |
| `narrow_differentClass_returnsNewInstanceLinkedToOriginal` | `_narrow`: else branch (new instance) |
| `withTypeHandler_sameHandler_returnsThis` | `withTypeHandler`: `_typeHandler==h` true |
| `withTypeHandler_differentHandler_returnsNewInstance` | `withTypeHandler`: false branch |
| `withValueHandler_sameHandler_returnsThis` | `withValueHandler`: `h==_valueHandler` true |
| `withValueHandler_differentHandler_returnsNewInstance` | `withValueHandler`: false branch |
| `withStaticTyping_alreadyStatic_returnsThis` | `withStaticTyping`: `_asStatic` true |
| `withStaticTyping_notStatic_returnsNewInstance` | `withStaticTyping`: false branch |
| `withContentType_alwaysThrows` | exception path (ไม่มี branch) |
| `withContentTypeHandler_alwaysThrows` | exception path |
| `withContentValueHandler_alwaysThrows` | exception path |
| `refine_alwaysReturnsNull` | ตรวจ return null เสมอ |
| `buildCanonicalName_noBindings_justClassName` | `count > 0` = false |
| `buildCanonicalName_withBindings_appendsGenericParamsWithComma` | `count > 0` = true, loop + `i>0` comma branch |
| `isContainerType_alwaysFalse` | ค่าคงที่ false เสมอ |
| `getErasedSignature_returnsNonEmptyBuilder` | เมธอด erased signature |
| `getGenericSignature_noBindings_endsWithSemicolon` | `count > 0` = false (generic signature) |
| `getGenericSignature_withBindings_loopsOverEachTypeAndAppendsAngleBrackets` | `count > 0` = true, loop ทำงาน |
| `toString_formatCheck` | format string ผ่าน buildCanonicalName |
| `equals_sameInstance_true` | `o == this` true |
| `equals_null_false` | `o == null` true |
| `equals_differentRuntimeClass_false` | `o.getClass() != getClass()` true |
| `equals_differentUnderlyingClass_false` | `other._class != this._class` true |
| `equals_sameClassSameBindings_true` | ผ่านทุก guard, `b1.equals(b2)` true |
| `equals_sameClassDifferentBindings_false` | ผ่านทุก guard, `b1.equals(b2)` false |

**หมายเหตุ:** `TypeBindings.create(Class<?>, JavaType[])` และ field/method ที่สืบทอดจาก `TypeBase` (`_class`, `_superClass`, `_bindings`, `_valueHandler`, `_typeHandler`, `_asStatic`, `containedType(i)`) อ้างอิงจาก public/protected API ของโมดูล jackson-databind เอง (คอมไพล์ร่วมกับซอร์สเป้าหมาย) ไม่ใช่การเดา behavior ที่ไม่มีอยู่ในซอร์ส — ใช้เพื่อเข้าถึง state ภายในสำหรับตรวจสอบ branch เท่านั้น