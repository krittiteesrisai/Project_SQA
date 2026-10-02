# วิเคราะห์และแผนการทดสอบ

จากซอร์สโค้ด `ReferenceType` มีจุดสังเกตสำคัญที่ควรทดสอบ:

1. **จุดที่น่าสงสัยว่าเป็น fault**: เมธอด `construct(cls, refType, valueHandler, typeHandler)` เรียก `new ReferenceType(cls, refType, null, null, false)` โดย **ไม่ได้ส่งผ่าน `valueHandler`/`typeHandler` ที่รับมา** เลย (hard-code เป็น `null`) — นี่คือพฤติกรรมที่ขัดกับ signature ของเมธอด จึงเขียนเทสที่คาดหวังพฤติกรรมที่ถูกต้อง (ค่าที่ส่งเข้าไปต้องถูกเก็บไว้) เพื่อดักจับ fault นี้
2. เมธอด `with*Handler` ทุกตัวมี branch แบบ "เหมือนเดิม→คืน this" กับ "ต่างกัน→สร้างใหม่"
3. `containedType`/`containedTypeName` มี branch index==0 กับ else
4. `withStaticTyping` มี branch `_asStatic` true/false
5. `equals` มีหลาย branch: same instance, null, different class, different `_class`, different referencedType, equal case
6. `_narrow`, `buildCanonicalName` เป็น protected — ทดสอบโดยวาง test class ไว้ package เดียวกัน (`com.fasterxml.jackson.databind.type`) ตามธรรมเนียมของโปรเจกต์ (เพื่อเข้าถึง member ที่เป็น protected ได้)
7. `getErasedSignature`/`getGenericSignature` พึ่งพา `_classSignature` ซึ่ง**ไม่ได้อยู่ในซอร์สที่ให้มา** จึงไม่กำหนดค่าคาดหวังตรงตัว (ตามข้อกำหนดห้ามเดา) แต่ทดสอบ "ความสัมพันธ์" ที่ระบุในซอร์ส คือ erased signature ขึ้นกับ `_class` เท่านั้น ส่วน generic signature ต้องขึ้นกับ `_referencedType` ด้วย

```java
package com.fasterxml.jackson.databind.type;

// หมายเหตุ: วางไว้ package เดียวกับคลาสเป้าหมาย เพื่อเข้าถึงเมธอด/ฟิลด์ระดับ protected
// (buildCanonicalName, _narrow) ได้โดยตรงตามข้อกำหนด "ห้ามเดา behavior"
// -> import คลาสเป้าหมายอย่างชัดแจ้ง (ถึงแม้ import จาก package เดียวกันจะซ้ำซ้อนแต่ compile ได้)
import com.fasterxml.jackson.databind.type.ReferenceType;
import com.fasterxml.jackson.databind.JavaType;

import org.junit.Before;
import org.junit.Test;

import java.util.List;
import java.util.Optional;

import static org.junit.Assert.*;

public class ReferenceTypeTest {

    private JavaType stringType;
    private JavaType integerType;

    @Before
    public void setUp() {
        TypeFactory tf = TypeFactory.defaultInstance();
        stringType = tf.constructType(String.class);
        integerType = tf.constructType(Integer.class);
    }

    // ---------------------------------------------------------------
    // construct() - basic properties
    // ---------------------------------------------------------------

    @Test
    public void testConstruct_basicProperties() {
        ReferenceType rt = ReferenceType.construct(Optional.class, stringType, null, null);

        assertNotNull(rt);
        assertSame(stringType, rt.getReferencedType());
        assertTrue(rt.isReferenceType());
        assertEquals(Optional.class, rt.getRawClass());
    }

    /**
     * FAULT-DETECTING TEST:
     * ตามซอร์สโค้ดปัจจุบัน ReferenceType.construct(...) เรียก
     *   new ReferenceType(cls, refType, null, null, false)
     * ซึ่ง "ทิ้ง" ค่า valueHandler/typeHandler ที่ผู้เรียกส่งเข้ามา แล้วบังคับเป็น null เสมอ
     * พฤติกรรมที่ถูกต้อง (ตาม signature ของเมธอด) ควรเก็บค่าที่ส่งเข้ามาไว้จริง
     * เทสนี้จะ "fail" บนโค้ดที่มี defect นี้ และ "pass" เมื่อโค้ดถูกแก้ไข
     */
    @Test
    public void testConstruct_shouldPreserveValueAndTypeHandlers() {
        Object valueHandler = "customValueHandler";
        Object typeHandler = "customTypeHandler";

        ReferenceType rt = ReferenceType.construct(Optional.class, stringType, valueHandler, typeHandler);

        assertEquals(valueHandler, rt.<Object>getValueHandler());
        assertEquals(typeHandler, rt.<Object>getTypeHandler());
    }

    // ---------------------------------------------------------------
    // isReferenceType / containedTypeCount / containedType / containedTypeName
    // ---------------------------------------------------------------

    @Test
    public void testIsReferenceType_alwaysTrue() {
        ReferenceType rt = ReferenceType.construct(Optional.class, stringType, null, null);
        assertTrue(rt.isReferenceType());
    }

    @Test
    public void testContainedTypeCount_isOne() {
        ReferenceType rt = ReferenceType.construct(Optional.class, stringType, null, null);
        assertEquals(1, rt.containedTypeCount());
    }

    @Test
    public void testContainedType_indexZero_returnsReferencedType() {
        ReferenceType rt = ReferenceType.construct(Optional.class, stringType, null, null);
        assertSame(stringType, rt.containedType(0));
    }

    @Test
    public void testContainedType_nonZeroIndex_returnsNull() {
        ReferenceType rt = ReferenceType.construct(Optional.class, stringType, null, null);
        assertNull(rt.containedType(1));
        assertNull(rt.containedType(-1));
    }

    @Test
    public void testContainedTypeName_indexZero_returnsT() {
        ReferenceType rt = ReferenceType.construct(Optional.class, stringType, null, null);
        assertEquals("T", rt.containedTypeName(0));
    }

    @Test
    public void testContainedTypeName_nonZeroIndex_returnsNull() {
        ReferenceType rt = ReferenceType.construct(Optional.class, stringType, null, null);
        assertNull(rt.containedTypeName(1));
        assertNull(rt.containedTypeName(-5));
    }

    @Test
    public void testGetParameterSource_returnsRawClass() {
        ReferenceType rt = ReferenceType.construct(Optional.class, stringType, null, null);
        assertEquals(Optional.class, rt.getParameterSource());
        assertEquals(rt.getRawClass(), rt.getParameterSource());
    }

    // ---------------------------------------------------------------
    // withTypeHandler
    // ---------------------------------------------------------------

    @Test
    public void testWithTypeHandler_sameNullHandler_returnsSelf() {
        ReferenceType rt = ReferenceType.construct(Optional.class, stringType, null, null);
        // _typeHandler เริ่มต้นเป็น null (จาก construct()); ส่ง null เข้าไปอีก -> h == _typeHandler (null==null)
        ReferenceType result = rt.withTypeHandler(null);
        assertSame(rt, result);
    }

    @Test
    public void testWithTypeHandler_newHandler_createsNewInstance() {
        ReferenceType rt = ReferenceType.construct(Optional.class, stringType, null, null);
        Object th = new Object();

        ReferenceType result = rt.withTypeHandler(th);

        assertNotSame(rt, result);
        assertSame(th, result.<Object>getTypeHandler());
        // ค่าอื่น ๆ ยังคงเดิม
        assertSame(stringType, result.getReferencedType());
        assertEquals(Optional.class, result.getRawClass());
    }

    @Test
    public void testWithTypeHandler_sameNonNullHandler_returnsSelf() {
        ReferenceType rt = ReferenceType.construct(Optional.class, stringType, null, null);
        Object th = new Object();
        ReferenceType withHandler = rt.withTypeHandler(th);

        ReferenceType result = withHandler.withTypeHandler(th); // handler เดิม (reference เดียวกัน)

        assertSame(withHandler, result);
    }

    // ---------------------------------------------------------------
    // withValueHandler
    // ---------------------------------------------------------------

    @Test
    public void testWithValueHandler_sameNullHandler_returnsSelf() {
        ReferenceType rt = ReferenceType.construct(Optional.class, stringType, null, null);
        ReferenceType result = rt.withValueHandler(null);
        assertSame(rt, result);
    }

    @Test
    public void testWithValueHandler_newHandler_createsNewInstance() {
        ReferenceType rt = ReferenceType.construct(Optional.class, stringType, null, null);
        Object vh = new Object();

        ReferenceType result = rt.withValueHandler(vh);

        assertNotSame(rt, result);
        assertSame(vh, result.<Object>getValueHandler());
    }

    @Test
    public void testWithValueHandler_sameNonNullHandler_returnsSelf() {
        ReferenceType rt = ReferenceType.construct(Optional.class, stringType, null, null);
        Object vh = new Object();
        ReferenceType withHandler = rt.withValueHandler(vh);

        ReferenceType result = withHandler.withValueHandler(vh);

        assertSame(withHandler, result);
    }

    // ---------------------------------------------------------------
    // withContentTypeHandler
    // ---------------------------------------------------------------

    @Test
    public void testWithContentTypeHandler_sameNullHandler_returnsSelf() {
        ReferenceType rt = ReferenceType.construct(Optional.class, stringType, null, null);
        // สมมติฐานพื้นฐาน: JavaType ที่สร้างใหม่จาก TypeFactory มี typeHandler เริ่มต้นเป็น null
        ReferenceType result = rt.withContentTypeHandler(null);
        assertSame(rt, result);
    }

    @Test
    public void testWithContentTypeHandler_newHandler_createsNewInstanceWithUpdatedReferencedType() {
        ReferenceType rt = ReferenceType.construct(Optional.class, stringType, null, null);
        Object th = new Object();

        ReferenceType result = rt.withContentTypeHandler(th);

        assertNotSame(rt, result);
        assertSame(th, result.getReferencedType().<Object>getTypeHandler());
        // outer handler ไม่เปลี่ยน
        assertEquals(rt.<Object>getTypeHandler(), result.<Object>getTypeHandler());
    }

    @Test
    public void testWithContentTypeHandler_sameNonNullHandler_returnsSelf() {
        ReferenceType rt = ReferenceType.construct(Optional.class, stringType, null, null);
        Object th = new Object();
        ReferenceType withHandler = rt.withContentTypeHandler(th);

        ReferenceType result = withHandler.withContentTypeHandler(th);

        assertSame(withHandler, result);
    }

    // ---------------------------------------------------------------
    // withContentValueHandler
    // ---------------------------------------------------------------

    @Test
    public void testWithContentValueHandler_sameNullHandler_returnsSelf() {
        ReferenceType rt = ReferenceType.construct(Optional.class, stringType, null, null);
        ReferenceType result = rt.withContentValueHandler(null);
        assertSame(rt, result);
    }

    @Test
    public void testWithContentValueHandler_newHandler_createsNewInstanceWithUpdatedReferencedType() {
        ReferenceType rt = ReferenceType.construct(Optional.class, stringType, null, null);
        Object vh = new Object();

        ReferenceType result = rt.withContentValueHandler(vh);

        assertNotSame(rt, result);
        assertSame(vh, result.getReferencedType().<Object>getValueHandler());
    }

    @Test
    public void testWithContentValueHandler_sameNonNullHandler_returnsSelf() {
        ReferenceType rt = ReferenceType.construct(Optional.class, stringType, null, null);
        Object vh = new Object();
        ReferenceType withHandler = rt.withContentValueHandler(vh);

        ReferenceType result = withHandler.withContentValueHandler(vh);

        assertSame(withHandler, result);
    }

    // ---------------------------------------------------------------
    // withStaticTyping
    // ---------------------------------------------------------------

    @Test
    public void testWithStaticTyping_fromNonStatic_createsNewInstance() {
        ReferenceType rt = ReferenceType.construct(Optional.class, stringType, null, null); // asStatic=false

        ReferenceType result = rt.withStaticTyping();

        assertNotSame(rt, result);
        assertNotSame(stringType, result.getReferencedType());
    }

    @Test
    public void testWithStaticTyping_alreadyStatic_returnsSelf() {
        ReferenceType rt = ReferenceType.construct(Optional.class, stringType, null, null);
        ReferenceType staticRt = rt.withStaticTyping(); // asStatic=true ตอนนี้

        ReferenceType result = staticRt.withStaticTyping();

        assertSame(staticRt, result);
    }

    // ---------------------------------------------------------------
    // buildCanonicalName / toString
    // ---------------------------------------------------------------

    @Test
    public void testBuildCanonicalName() {
        ReferenceType rt = ReferenceType.construct(Optional.class, stringType, null, null);
        String expected = Optional.class.getName() + "<" + stringType.toCanonical();
        assertEquals(expected, rt.buildCanonicalName());
    }

    @Test
    public void testToString() {
        ReferenceType rt = ReferenceType.construct(Optional.class, stringType, null, null);
        String expected = "[reference type, class " + rt.buildCanonicalName()
                + "<" + stringType.toString() + ">]";
        assertEquals(expected, rt.toString());
    }

    // ---------------------------------------------------------------
    // _narrow (protected)
    // ---------------------------------------------------------------

    @Test
    public void testNarrow_createsNewInstanceWithSubclass() {
        ReferenceType rt = ReferenceType.construct(Number.class, stringType, null, null);

        JavaType narrowed = rt._narrow(Integer.class);

        assertTrue(narrowed instanceof ReferenceType);
        ReferenceType narrowedRt = (ReferenceType) narrowed;
        assertEquals(Integer.class, narrowedRt.getRawClass());
        assertSame(stringType, narrowedRt.getReferencedType());
    }

    // ---------------------------------------------------------------
    // getErasedSignature / getGenericSignature
    // หมายเหตุ: ไม่ทราบ implementation ของ _classSignature จากซอร์สที่ให้มา
    // จึงทดสอบเฉพาะ "ความสัมพันธ์" ที่ระบุชัดในซอร์สโค้ด ReferenceType เท่านั้น
    // ---------------------------------------------------------------

    @Test
    public void testGetErasedSignature_dependsOnlyOnClass() {
        ReferenceType rtWithString = ReferenceType.construct(Optional.class, stringType, null, null);
        ReferenceType rtWithInteger = ReferenceType.construct(Optional.class, integerType, null, null);

        String sigString = rtWithString.getErasedSignature(new StringBuilder()).toString();
        String sigInteger = rtWithInteger.getErasedSignature(new StringBuilder()).toString();

        assertNotNull(sigString);
        assertFalse(sigString.isEmpty());
        // erased signature ไม่ควรขึ้นกับ referencedType เพราะ getErasedSignature
        // เรียก _classSignature(_class, ...) เท่านั้น (ไม่แตะ _referencedType)
        assertEquals(sigString, sigInteger);
    }

    @Test
    public void testGetGenericSignature_dependsOnReferencedType() {
        ReferenceType rtWithString = ReferenceType.construct(Optional.class, stringType, null, null);
        ReferenceType rtWithInteger = ReferenceType.construct(Optional.class, integerType, null, null);

        String sigString = rtWithString.getGenericSignature(new StringBuilder()).toString();
        String sigInteger = rtWithInteger.getGenericSignature(new StringBuilder()).toString();

        assertNotNull(sigString);
        assertFalse(sigString.isEmpty());
        // generic signature ต้อง "แตกต่างกัน" เมื่อ referencedType ต่างกัน
        // เพราะมีการเรียก _referencedType.getGenericSignature(sb) แทรกอยู่กลาง string
        assertNotEquals(sigString, sigInteger);
        assertTrue(sigString.endsWith(";"));
        assertTrue(sigString.contains("<"));
    }

    // ---------------------------------------------------------------
    // equals
    // ---------------------------------------------------------------

    @Test
    public void testEquals_sameInstance_true() {
        ReferenceType rt = ReferenceType.construct(Optional.class, stringType, null, null);
        assertTrue(rt.equals(rt));
    }

    @Test
    public void testEquals_null_false() {
        ReferenceType rt = ReferenceType.construct(Optional.class, stringType, null, null);
        assertFalse(rt.equals(null));
    }

    @Test
    public void testEquals_differentRuntimeType_false() {
        ReferenceType rt = ReferenceType.construct(Optional.class, stringType, null, null);
        assertFalse(rt.equals("not a ReferenceType"));
    }

    @Test
    public void testEquals_differentClass_false() {
        ReferenceType rtA = ReferenceType.construct(Optional.class, stringType, null, null);
        ReferenceType rtB = ReferenceType.construct(List.class, stringType, null, null);
        assertFalse(rtA.equals(rtB));
    }

    @Test
    public void testEquals_differentReferencedType_false() {
        ReferenceType rtA = ReferenceType.construct(Optional.class, stringType, null, null);
        ReferenceType rtB = ReferenceType.construct(Optional.class, integerType, null, null);
        assertFalse(rtA.equals(rtB));
    }

    @Test
    public void testEquals_equalClassAndReferencedType_true() {
        JavaType anotherStringType = TypeFactory.defaultInstance().constructType(String.class);
        ReferenceType rtA = ReferenceType.construct(Optional.class, stringType, null, null);
        ReferenceType rtB = ReferenceType.construct(Optional.class, anotherStringType, null, null);
        assertTrue(rtA.equals(rtB));
    }
}
```

## ตารางสรุปความครอบคลุม (Branch/Condition)

| เมธอดทดสอบ | Branch/Condition ที่ครอบคลุม |
|---|---|
| `testConstruct_basicProperties` | ค่าพื้นฐานหลังสร้างด้วย `construct()` |
| `testConstruct_shouldPreserveValueAndTypeHandlers` | **Fault-detecting**: ตรวจว่า `valueHandler`/`typeHandler` ที่ส่งให้ `construct()` ถูกเก็บจริง (ดัก defect ที่ hard-code เป็น null) |
| `testIsReferenceType_alwaysTrue` | `isReferenceType()` == true |
| `testContainedTypeCount_isOne` | `containedTypeCount()` == 1 |
| `testContainedType_indexZero_returnsReferencedType` | `containedType(int)` branch `index==0` |
| `testContainedType_nonZeroIndex_returnsNull` | `containedType(int)` branch else (1, -1) |
| `testContainedTypeName_indexZero_returnsT` | `containedTypeName(int)` branch `index==0` |
| `testContainedTypeName_nonZeroIndex_returnsNull` | `containedTypeName(int)` branch else |
| `testGetParameterSource_returnsRawClass` | `getParameterSource()` คืนค่า `_class` |
| `testWithTypeHandler_sameNullHandler_returnsSelf` | `withTypeHandler` branch `h==_typeHandler` (true, null) |
| `testWithTypeHandler_newHandler_createsNewInstance` | `withTypeHandler` branch false (สร้างใหม่) |
| `testWithTypeHandler_sameNonNullHandler_returnsSelf` | `withTypeHandler` branch true (non-null handler) |
| `testWithValueHandler_*` (3 เมธอด) | `withValueHandler` ทั้ง 2 branch (null/non-null) |
| `testWithContentTypeHandler_sameNullHandler_returnsSelf` | `withContentTypeHandler` branch true (null) |
| `testWithContentTypeHandler_newHandler_createsNewInstanceWithUpdatedReferencedType` | `withContentTypeHandler` branch false |
| `testWithContentTypeHandler_sameNonNullHandler_returnsSelf` | `withContentTypeHandler` branch true (non-null) |
| `testWithContentValueHandler_*` (3 เมธอด) | `withContentValueHandler` ทั้ง 2 branch |
| `testWithStaticTyping_fromNonStatic_createsNewInstance` | `withStaticTyping` branch `_asStatic==false` |
| `testWithStaticTyping_alreadyStatic_returnsSelf` | `withStaticTyping` branch `_asStatic==true` |
| `testBuildCanonicalName` | `buildCanonicalName()` string ที่ถูกสร้าง |
| `testToString` | `toString()` ครบทุกส่วนของ format string |
| `testNarrow_createsNewInstanceWithSubclass` | `_narrow(Class)` การสร้าง instance ใหม่พร้อม subclass |
| `testGetErasedSignature_dependsOnlyOnClass` | `getErasedSignature` ไม่พึ่ง `_referencedType` |
| `testGetGenericSignature_dependsOnReferencedType` | `getGenericSignature` ต้องรวม signature ของ `_referencedType` |
| `testEquals_sameInstance_true` | `equals` branch `o==this` |
| `testEquals_null_false` | `equals` branch `o==null` |
| `testEquals_differentRuntimeType_false` | `equals` branch `o.getClass()!=getClass()` |
| `testEquals_differentClass_false` | `equals` branch `other._class != _class` |
| `testEquals_differentReferencedType_false` | `equals` branch `_referencedType.equals(...)` == false |
| `testEquals_equalClassAndReferencedType_true` | `equals` เส้นทางที่คืน true (ทุกเงื่อนไขผ่าน) |

**หมายเหตุสำคัญ**: ทดสอบ `testConstruct_shouldPreserveValueAndTypeHandlers` ถูกออกแบบให้ล้มเหลว (fail) บนซอร์สโค้ดที่ให้มา เนื่องจากพบว่า `construct()` ไม่ได้ส่งผ่านพารามิเตอร์ `valueHandler`/`typeHandler` ไปยัง constructor จริง (hard-code เป็น `null`) — ซึ่งสอดคล้องกับ defect ของ Defects4J `JacksonDatabind-46`