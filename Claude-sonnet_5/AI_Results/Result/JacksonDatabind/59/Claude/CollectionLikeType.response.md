# การวิเคราะห์และแผนการทดสอบ

คลาส `CollectionLikeType` มี dependency กับ `JavaType`, `TypeBase`, `TypeBindings` ซึ่งเป็นคลาสภายในโปรเจกต์ (ไม่ได้อยู่ใน source ที่ให้มา) ดังนั้นในการทดสอบจะใช้:
- **Mockito** เพื่อ mock `JavaType` (elementType/superClass) เพื่อควบคุม behavior ได้แน่นอน โดยมี**ข้อสมมติ**ที่คอมเมนต์กำกับไว้ว่าเมธอดที่ stub (เช่น `toCanonical()`, `getGenericSignature()`, `hasHandlers()`) ไม่ใช่ `final` method — หากเป็น final จะต้องปรับวิธี mock
- Static factory `CollectionLikeType.construct(...)` (public ตาม source) เป็นตัวช่วยสร้าง instance แทนการเรียก constructor ที่เป็น protected
- วางคลาสทดสอบไว้ใน package เดียวกัน (`com.fasterxml.jackson.databind.type`) เพื่อเข้าถึง `_narrow()` (protected)

```java
package com.fasterxml.jackson.databind.type;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.junit.Test;
import org.mockito.invocation.InvocationOnMock;
import org.mockito.stubbing.Answer;

import com.fasterxml.jackson.databind.JavaType;

/**
 * Unit test สำหรับ {@link CollectionLikeType}
 *
 * หมายเหตุสำคัญ (ข้อสมมติที่ใช้เนื่องจากไม่มี source ของ JavaType/TypeBase/TypeBindings):
 * 1. สมมติว่า getValueHandler()/getTypeHandler()/toCanonical()/getGenericSignature()/
 *    hasHandlers()/getRawClass() ของ JavaType ไม่เป็น final method จึงสามารถ mock ได้
 * 2. สมมติว่า TypeBase.hasHandlers() (super.hasHandlers()) จะ return true
 *    เมื่อ _valueHandler หรือ _typeHandler ไม่เป็น null (พฤติกรรมมาตรฐานของ Jackson)
 * 3. สมมติว่า JavaType.toCanonical() เป็น public method ที่เรียก buildCanonicalName()
 *    ภายใน (ตามรูปแบบมาตรฐานของ Jackson JavaType)
 */
public class CollectionLikeTypeTest {

    // ---------------------------------------------------------------
    // Helpers
    // ---------------------------------------------------------------

    private JavaType mockJavaType(final String canonicalName) {
        JavaType t = mock(JavaType.class);
        when(t.toCanonical()).thenReturn(canonicalName);
        when(t.getRawClass()).thenReturn(Object.class); // ค่า default ป้องกัน NPE
        when(t.hasHandlers()).thenReturn(false);
        when(t.getGenericSignature(any(StringBuilder.class))).thenAnswer(
                new Answer<StringBuilder>() {
                    @Override
                    public StringBuilder answer(InvocationOnMock invocation) {
                        StringBuilder sb = (StringBuilder) invocation.getArguments()[0];
                        sb.append(canonicalName);
                        return sb;
                    }
                });
        return t;
    }

    private TypeBindings emptyBindings() {
        return TypeBindings.emptyBindings();
    }

    private CollectionLikeType buildType(Class<?> rawType, JavaType elemT) {
        JavaType superClass = mockJavaType("java.lang.Object");
        return CollectionLikeType.construct(rawType, emptyBindings(), superClass, null, elemT);
    }

    // ---------------------------------------------------------------
    // Construction / basic properties
    // ---------------------------------------------------------------

    @Test
    public void testConstructTrueCollectionType() {
        JavaType elem = mockJavaType("java.lang.String");
        CollectionLikeType type = buildType(ArrayList.class, elem);

        assertTrue(type.isContainerType());
        assertTrue(type.isCollectionLikeType());
        assertTrue(type.isTrueCollectionType()); // ArrayList implements Collection
        assertSame(elem, type.getContentType());
    }

    @Test
    public void testConstructNonTrueCollectionType() {
        JavaType elem = mockJavaType("java.lang.String");
        // String ไม่ใช่ Collection จริง แต่ยังถือเป็น collection-like ได้
        CollectionLikeType type = buildType(String.class, elem);

        assertTrue(type.isContainerType());
        assertTrue(type.isCollectionLikeType());
        assertFalse(type.isTrueCollectionType());
    }

    // ---------------------------------------------------------------
    // withContentType
    // ---------------------------------------------------------------

    @Test
    public void testWithContentTypeSameInstanceReturnsSelf() {
        JavaType elem = mockJavaType("java.lang.String");
        CollectionLikeType type = buildType(List.class, elem);

        JavaType result = type.withContentType(elem);
        assertSame(type, result); // branch: _elementType == contentType -> return this
    }

    @Test
    public void testWithContentTypeDifferentInstanceReturnsNewObject() {
        JavaType elem = mockJavaType("java.lang.String");
        JavaType newElem = mockJavaType("java.lang.Integer");
        CollectionLikeType type = buildType(List.class, elem);

        JavaType result = type.withContentType(newElem);
        assertNotSame(type, result);
        assertSame(newElem, result.getContentType());
    }

    // ---------------------------------------------------------------
    // withTypeHandler / withValueHandler
    // ---------------------------------------------------------------

    @Test
    public void testWithTypeHandler() {
        JavaType elem = mockJavaType("java.lang.String");
        CollectionLikeType type = buildType(List.class, elem);

        Object handler = new Object();
        CollectionLikeType result = type.withTypeHandler(handler);

        assertNotSame(type, result);
        assertSame(handler, result.getTypeHandler());
        assertNull(type.getTypeHandler()); // original ไม่ถูกแก้ไข (immutability)
    }

    @Test
    public void testWithValueHandler() {
        JavaType elem = mockJavaType("java.lang.String");
        CollectionLikeType type = buildType(List.class, elem);

        Object handler = new Object();
        CollectionLikeType result = type.withValueHandler(handler);

        assertNotSame(type, result);
        assertSame(handler, result.getValueHandler());
        assertNull(type.getValueHandler());
    }

    // ---------------------------------------------------------------
    // withContentTypeHandler / withContentValueHandler
    // ---------------------------------------------------------------

    @Test
    public void testWithContentTypeHandler() {
        JavaType elem = mockJavaType("java.lang.String");
        JavaType elemWithHandler = mockJavaType("java.lang.String");
        Object handler = new Object();
        when(elem.withTypeHandler(handler)).thenReturn(elemWithHandler);
        when(elemWithHandler.getTypeHandler()).thenReturn(handler);

        CollectionLikeType type = buildType(List.class, elem);
        CollectionLikeType result = type.withContentTypeHandler(handler);

        assertNotSame(type, result);
        assertSame(handler, result.getContentTypeHandler());
    }

    @Test
    public void testWithContentValueHandler() {
        JavaType elem = mockJavaType("java.lang.String");
        JavaType elemWithHandler = mockJavaType("java.lang.String");
        Object handler = new Object();
        when(elem.withValueHandler(handler)).thenReturn(elemWithHandler);
        when(elemWithHandler.getValueHandler()).thenReturn(handler);

        CollectionLikeType type = buildType(List.class, elem);
        CollectionLikeType result = type.withContentValueHandler(handler);

        assertNotSame(type, result);
        assertSame(handler, result.getContentValueHandler());
    }

    // ---------------------------------------------------------------
    // withStaticTyping
    // ---------------------------------------------------------------

    @Test
    public void testWithStaticTypingWhenAlreadyStaticReturnsSelf() {
        JavaType elem = mockJavaType("java.lang.String");
        when(elem.withStaticTyping()).thenReturn(elem);
        CollectionLikeType type = buildType(List.class, elem);

        CollectionLikeType staticOnce = type.withStaticTyping();
        assertNotSame(type, staticOnce); // ครั้งแรก _asStatic=false -> สร้างใหม่

        CollectionLikeType staticTwice = staticOnce.withStaticTyping();
        assertSame(staticOnce, staticTwice); // branch: _asStatic=true -> return this
    }

    @Test
    public void testWithStaticTypingWhenNotStaticCreatesNewInstance() {
        JavaType elem = mockJavaType("java.lang.String");
        JavaType staticElem = mockJavaType("java.lang.String");
        when(elem.withStaticTyping()).thenReturn(staticElem);

        CollectionLikeType type = buildType(List.class, elem);
        CollectionLikeType result = type.withStaticTyping();

        assertNotSame(type, result);
        assertSame(staticElem, result.getContentType());
    }

    // ---------------------------------------------------------------
    // refine
    // ---------------------------------------------------------------

    @Test
    public void testRefine() {
        JavaType elem = mockJavaType("java.lang.String");
        CollectionLikeType type = buildType(List.class, elem);

        JavaType newSuperClass = mockJavaType("java.lang.Object");
        JavaType refined = type.refine(ArrayList.class, emptyBindings(), newSuperClass, null);

        assertTrue(refined instanceof CollectionLikeType);
        assertSame(elem, refined.getContentType());
        assertTrue(((CollectionLikeType) refined).isTrueCollectionType());
    }

    // ---------------------------------------------------------------
    // _narrow (deprecated, protected)
    // ---------------------------------------------------------------

    @Test
    @SuppressWarnings("deprecation")
    public void testNarrow() {
        JavaType elem = mockJavaType("java.lang.String");
        CollectionLikeType type = buildType(List.class, elem);

        JavaType narrowed = type._narrow(ArrayList.class);
        assertTrue(narrowed instanceof CollectionLikeType);
        assertSame(elem, narrowed.getContentType());
    }

    // ---------------------------------------------------------------
    // hasHandlers
    // ---------------------------------------------------------------

    @Test
    public void testHasHandlersFalseByDefault() {
        JavaType elem = mockJavaType("java.lang.String"); // hasHandlers()=false, no handler set
        CollectionLikeType type = buildType(List.class, elem);
        assertFalse(type.hasHandlers());
    }

    @Test
    public void testHasHandlersTrueWhenSelfHandlerSet() {
        JavaType elem = mockJavaType("java.lang.String");
        CollectionLikeType type = buildType(List.class, elem).withValueHandler(new Object());
        // ข้อสมมติ: super.hasHandlers() = true เมื่อ _valueHandler != null
        assertTrue(type.hasHandlers());
    }

    @Test
    public void testHasHandlersTrueWhenElementHasHandlers() {
        JavaType elem = mockJavaType("java.lang.String");
        when(elem.hasHandlers()).thenReturn(true);
        CollectionLikeType type = buildType(List.class, elem);
        assertTrue(type.hasHandlers()); // branch: _elementType.hasHandlers() == true
    }

    // ---------------------------------------------------------------
    // getContentValueHandler / getContentTypeHandler
    // ---------------------------------------------------------------

    @Test
    public void testGetContentHandlersDelegateToElementType() {
        JavaType elem = mockJavaType("java.lang.String");
        when(elem.getValueHandler()).thenReturn("valueHandler");
        when(elem.getTypeHandler()).thenReturn("typeHandler");

        CollectionLikeType type = buildType(List.class, elem);
        assertEquals("valueHandler", type.getContentValueHandler());
        assertEquals("typeHandler", type.getContentTypeHandler());
    }

    // ---------------------------------------------------------------
    // Signatures / Canonical name
    // ---------------------------------------------------------------

    @Test
    public void testGetErasedSignature() {
        JavaType elem = mockJavaType("java.lang.String");
        CollectionLikeType type = buildType(List.class, elem);

        StringBuilder sb = new StringBuilder();
        StringBuilder result = type.getErasedSignature(sb);
        assertNotNull(result);
        // ข้อสมมติ: erased signature ไม่ควรมี generic parameter (ไม่มี '<')
        assertFalse(result.toString().contains("<"));
    }

    @Test
    public void testGetGenericSignature() {
        JavaType elem = mockJavaType("java.lang.String");
        CollectionLikeType type = buildType(List.class, elem);

        StringBuilder sb = new StringBuilder();
        StringBuilder result = type.getGenericSignature(sb);
        String sig = result.toString();
        assertTrue(sig.endsWith(">;"));
        assertTrue(sig.contains("java.lang.String"));
    }

    @Test
    public void testBuildCanonicalNameViaToCanonical() {
        JavaType elem = mockJavaType("java.lang.String");
        CollectionLikeType type = buildType(List.class, elem);

        String canonical = type.toCanonical();
        assertTrue(canonical.startsWith(List.class.getName()));
        assertTrue(canonical.contains("java.lang.String"));
    }

    // ---------------------------------------------------------------
    // equals
    // ---------------------------------------------------------------

    @Test
    public void testEqualsSameInstance() {
        JavaType elem = mockJavaType("java.lang.String");
        CollectionLikeType type = buildType(List.class, elem);
        assertTrue(type.equals(type)); // branch: o == this
    }

    @Test
    public void testEqualsNull() {
        JavaType elem = mockJavaType("java.lang.String");
        CollectionLikeType type = buildType(List.class, elem);
        assertFalse(type.equals(null)); // branch: o == null
    }

    @Test
    public void testEqualsDifferentClass() {
        JavaType elem = mockJavaType("java.lang.String");
        CollectionLikeType type = buildType(List.class, elem);
        assertFalse(type.equals("not a CollectionLikeType")); // branch: getClass() mismatch
    }

    @Test
    public void testEqualsDifferentRawClass() {
        JavaType elem = mockJavaType("java.lang.String");
        CollectionLikeType type1 = buildType(List.class, elem);
        CollectionLikeType type2 = buildType(ArrayList.class, elem);
        assertFalse(type1.equals(type2)); // branch: _class == other._class -> false
    }

    @Test
    public void testEqualsDifferentElementType() {
        JavaType elem1 = mockJavaType("java.lang.String");
        JavaType elem2 = mockJavaType("java.lang.Integer");
        CollectionLikeType type1 = buildType(List.class, elem1);
        CollectionLikeType type2 = buildType(List.class, elem2);
        assertFalse(type1.equals(type2)); // branch: _elementType.equals() -> false
    }

    @Test
    public void testEqualsSameRawClassAndElementType() {
        JavaType elem = mockJavaType("java.lang.String");
        CollectionLikeType type1 = buildType(List.class, elem);
        CollectionLikeType type2 = buildType(List.class, elem);
        assertTrue(type1.equals(type2)); // ทุกเงื่อนไขผ่าน -> true
    }

    // ---------------------------------------------------------------
    // toString
    // ---------------------------------------------------------------

    @Test
    public void testToString() {
        JavaType elem = mockJavaType("java.lang.String");
        when(elem.toString()).thenReturn("STRING_TYPE");
        CollectionLikeType type = buildType(List.class, elem);

        String s = type.toString();
        assertEquals("[collection-like type; class " + List.class.getName()
                + ", contains STRING_TYPE]", s);
    }

    // ---------------------------------------------------------------
    // static factory: construct(rawType, bindings, superClass, superInts, elemT)
    // ---------------------------------------------------------------

    @Test
    public void testStaticConstructFactory() {
        JavaType elem = mockJavaType("java.lang.String");
        JavaType superClass = mockJavaType("java.lang.Object");
        CollectionLikeType type = CollectionLikeType.construct(
                List.class, emptyBindings(), superClass, null, elem);

        assertNotNull(type);
        assertSame(elem, type.getContentType());
    }

    // ---------------------------------------------------------------
    // Deprecated static factory: construct(rawType, elemT)
    // ---------------------------------------------------------------

    @Test
    @SuppressWarnings("deprecation")
    public void testDeprecatedConstructWithSingleTypeParamRawType() {
        // java.util.List มี type parameter เดียว -> ใช้ branch TypeBindings.create(...)
        JavaType elem = mockJavaType("java.lang.String");
        CollectionLikeType type = CollectionLikeType.construct(List.class, elem);

        assertNotNull(type);
        assertSame(elem, type.getContentType());
        assertTrue(type.isTrueCollectionType());
    }

    @Test
    @SuppressWarnings("deprecation")
    public void testDeprecatedConstructWithNoTypeParamRawType() {
        // String ไม่มี type parameter -> vars.length != 1 -> emptyBindings() branch
        JavaType elem = mockJavaType("java.lang.String");
        CollectionLikeType type = CollectionLikeType.construct(String.class, elem);

        assertNotNull(type);
        assertSame(elem, type.getContentType());
        assertFalse(type.isTrueCollectionType());
    }

    @Test
    @SuppressWarnings("deprecation")
    public void testDeprecatedConstructWithTwoTypeParamRawType() {
        // java.util.Map มี 2 type parameters -> vars.length != 1 -> emptyBindings() branch
        JavaType elem = mockJavaType("java.lang.String");
        CollectionLikeType type = CollectionLikeType.construct(Map.class, elem);

        assertNotNull(type);
        assertSame(elem, type.getContentType());
    }

    // ---------------------------------------------------------------
    // upgradeFrom
    // ---------------------------------------------------------------

    @Test
    public void testUpgradeFromTypeBaseInstance() {
        // CollectionLikeType ก็เป็น TypeBase ด้วย จึงใช้เป็น baseType ได้
        JavaType elem = mockJavaType("java.lang.String");
        JavaType newElem = mockJavaType("java.lang.Integer");
        CollectionLikeType base = buildType(List.class, elem);

        CollectionLikeType upgraded = CollectionLikeType.upgradeFrom(base, newElem);
        assertNotNull(upgraded);
        assertSame(newElem, upgraded.getContentType());
    }

    @Test
    public void testUpgradeFromNonTypeBaseThrows() {
        // mock JavaType ธรรมดา ไม่ใช่ instance ของ TypeBase
        JavaType nonTypeBase = mock(JavaType.class);
        JavaType elementType = mockJavaType("java.lang.String");

        try {
            CollectionLikeType.upgradeFrom(nonTypeBase, elementType);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            // branch: baseType instanceof TypeBase == false -> throw
        }
    }
}
```

## สรุปตาราง Test coverage

| เมธอดทดสอบ | Branch/Condition ที่ครอบคลุม |
|---|---|
| testConstructTrueCollectionType | `isContainerType`, `isCollectionLikeType`, `isTrueCollectionType()`=true, `getContentType()` |
| testConstructNonTrueCollectionType | `isTrueCollectionType()`=false |
| testWithContentTypeSameInstanceReturnsSelf | `withContentType`: `_elementType==contentType` → true |
| testWithContentTypeDifferentInstanceReturnsNewObject | `withContentType`: เงื่อนไข false → สร้างใหม่ |
| testWithTypeHandler | `withTypeHandler` สร้าง instance ใหม่ |
| testWithValueHandler | `withValueHandler` สร้าง instance ใหม่ |
| testWithContentTypeHandler | `withContentTypeHandler` + delegate ไป `_elementType.withTypeHandler` |
| testWithContentValueHandler | `withContentValueHandler` + delegate ไป `_elementType.withValueHandler` |
| testWithStaticTypingWhenAlreadyStaticReturnsSelf | `withStaticTyping`: `_asStatic==true` → return this |
| testWithStaticTypingWhenNotStaticCreatesNewInstance | `withStaticTyping`: `_asStatic==false` → สร้างใหม่ |
| testRefine | `refine()` สร้าง instance ใหม่ตาม rawType |
| testNarrow | `_narrow()` (deprecated) |
| testHasHandlersFalseByDefault | `hasHandlers`: both false |
| testHasHandlersTrueWhenSelfHandlerSet | `hasHandlers`: `super.hasHandlers()==true` |
| testHasHandlersTrueWhenElementHasHandlers | `hasHandlers`: `_elementType.hasHandlers()==true` |
| testGetContentHandlersDelegateToElementType | `getContentValueHandler`, `getContentTypeHandler` |
| testGetErasedSignature | `getErasedSignature()` |
| testGetGenericSignature | `getGenericSignature()` (loop/append ของ generic) |
| testBuildCanonicalNameViaToCanonical | `buildCanonicalName()`: `_elementType != null` branch |
| testEqualsSameInstance | `equals`: `o==this` |
| testEqualsNull | `equals`: `o==null` |
| testEqualsDifferentClass | `equals`: `getClass()` mismatch |
| testEqualsDifferentRawClass | `equals`: `_class==other._class` false |
| testEqualsDifferentElementType | `equals`: `_elementType.equals` false |
| testEqualsSameRawClassAndElementType | `equals`: ทุกเงื่อนไขผ่าน → true |
| testToString | `toString()` format |
| testStaticConstructFactory | static `construct(rawType,bindings,superClass,superInts,elemT)` |
| testDeprecatedConstructWithSingleTypeParamRawType | deprecated `construct`: `vars.length==1` branch |
| testDeprecatedConstructWithNoTypeParamRawType | deprecated `construct`: `vars==null/length!=1` (0 params) |
| testDeprecatedConstructWithTwoTypeParamRawType | deprecated `construct`: `vars.length!=1` (2 params) |
| testUpgradeFromTypeBaseInstance | `upgradeFrom`: `instanceof TypeBase` true |
| testUpgradeFromNonTypeBaseThrows | `upgradeFrom`: `instanceof TypeBase` false → throw |

**หมายเหตุสำคัญ**: บางส่วนของโค้ด (เช่น `TypeBase.hasHandlers()`, `JavaType.toCanonical()`, `_classSignature()`) ไม่มี source ให้ตรวจสอบตรง ๆ จึงใช้ mock/ข้อสมมติที่สมเหตุสมผลตามรูปแบบมาตรฐานของ Jackson และกำกับด้วยคอมเมนต์ในโค้ดทุกจุดที่มีความไม่แน่นอน