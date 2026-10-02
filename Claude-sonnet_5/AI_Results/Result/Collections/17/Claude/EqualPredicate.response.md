# EqualPredicateTest — JUnit 4 Test Suite

## หมายเหตุก่อนเริ่ม

จากการวิเคราะห์ซอร์สโค้ด พบจุดที่น่าสนใจสำหรับการดักจับ fault คือ constructor แบบ argument เดียว:

```java
public EqualPredicate(T object) {
    // do not use the DefaultEquator to keep backwards compatibility
    // the DefaultEquator returns also true if the two object references are equal
    this(object, new DefaultEquator<T>());
}
```

**คอมเมนต์บอกว่า "ห้ามใช้ DefaultEquator"** แต่โค้ดจริงกลับเรียก `new DefaultEquator<T>()` — นี่คือความไม่สอดคล้องกันระหว่าง intent กับ implementation (ซึ่งเป็นที่มาของบั๊กจริงใน Defects4J: Collections-17) เนื่องจากไม่มีซอร์สของ `DefaultEquator` ให้มา ผมจะเขียน test โดยอ้างอิงจาก **คำอธิบายในคอมเมนต์เท่านั้น** (ว่า DefaultEquator จะ return true เพิ่มเติมถ้า reference เท่ากัน) และกำกับด้วยคอมเมนต์ชัดเจนว่าเป็นการทดสอบพฤติกรรมตามที่ระบุไว้ในซอร์ส ไม่ใช่การเดา

```java
package org.apache.commons.collections.functors;

import static org.easymock.EasyMock.createMock;
import static org.easymock.EasyMock.expect;
import static org.easymock.EasyMock.replay;
import static org.easymock.EasyMock.verify;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import org.apache.commons.collections.Predicate;
import org.apache.commons.collections.functors.EqualPredicate;
import org.junit.Test;

/**
 * JUnit4 test suite for {@link EqualPredicate} (Defects4J: Collections-17b).
 *
 * หมายเหตุ: ไม่มีซอร์สของ {@link Equator} และ {@link DefaultEquator} ให้มาโดยตรงในโจทย์นี้
 * จึงใช้ mock ของ {@code Equator} (ผ่าน EasyMock) ในกรณีที่ต้องการทดสอบการ delegate ของ
 * {@link EqualPredicate#evaluate(Object)} อย่างเคร่งครัด และใช้คอมเมนต์ในซอร์สโค้ดต้นทาง
 * (constructor แบบ argument เดียว) เป็นข้อมูลอ้างอิงเดียวสำหรับพฤติกรรมของ DefaultEquator
 */
public class EqualPredicateTest {

    /** Helper class ที่ override equals() ให้ return false เสมอ เพื่อตรวจจับผลจาก
     *  reference-equality fallback ของ DefaultEquator ตามที่ระบุในคอมเมนต์ของซอร์สโค้ด */
    private static class NeverEqualObject {
        @Override
        public boolean equals(Object obj) {
            return false;
        }

        @Override
        public int hashCode() {
            return 0;
        }
    }

    // ---------------------------------------------------------------
    // Factory: equalPredicate(T object)  -> if (object == null) branch
    // ---------------------------------------------------------------

    @Test
    public void testEqualPredicateFactory_NonNullObject_ReturnsEqualPredicateInstance() {
        Predicate<String> predicate = EqualPredicate.equalPredicate("test");
        assertNotNull(predicate);
        assertTrue(predicate instanceof EqualPredicate);
        assertEquals("test", ((EqualPredicate<String>) predicate).getValue());
    }

    @Test
    public void testEqualPredicateFactory_NullObject_ReturnsNonEqualPredicateInstance() {
        Predicate<String> predicate = EqualPredicate.<String>equalPredicate(null);
        assertNotNull(predicate);
        assertFalse("เมื่อ object เป็น null ต้องไม่ได้ instance ของ EqualPredicate กลับมา",
                predicate instanceof EqualPredicate);

        // สมมติฐาน (ไม่มีซอร์สของ NullPredicate ให้มาในโจทย์นี้):
        // อ้างอิงจากพฤติกรรมมาตรฐานที่รู้จักกันทั่วไปของ NullPredicate ใน commons-collections
        // ว่าจะ evaluate ได้ true เฉพาะเมื่ออินพุตเป็น null เท่านั้น
        assertTrue(predicate.evaluate(null));
        assertFalse(predicate.evaluate("anything"));
    }

    // ---------------------------------------------------------------
    // Factory: equalPredicate(T object, Equator<T> equator) -> if (object == null) branch
    // ---------------------------------------------------------------

    @Test
    public void testEqualPredicateFactoryWithEquator_NonNullObject_ReturnsEqualPredicateInstance() {
        @SuppressWarnings("unchecked")
        Equator<String> equator = createMock(Equator.class);
        replay(equator);

        Predicate<String> predicate = EqualPredicate.<String>equalPredicate("value", equator);
        assertNotNull(predicate);
        assertTrue(predicate instanceof EqualPredicate);
        assertEquals("value", ((EqualPredicate<String>) predicate).getValue());

        verify(equator);
    }

    @Test
    public void testEqualPredicateFactoryWithEquator_NullObject_ReturnsNonEqualPredicateInstance() {
        @SuppressWarnings("unchecked")
        Equator<String> equator = createMock(Equator.class);
        replay(equator);

        Predicate<String> predicate = EqualPredicate.<String>equalPredicate(null, equator);
        assertNotNull(predicate);
        assertFalse("เมื่อ object เป็น null ต้องไม่ได้ instance ของ EqualPredicate กลับมา แม้จะส่ง equator เข้ามาก็ตาม",
                predicate instanceof EqualPredicate);
        assertTrue(predicate.evaluate(null));
        assertFalse(predicate.evaluate("anything"));

        verify(equator);
    }

    // ---------------------------------------------------------------
    // Constructor(T object) - single-arg, uses DefaultEquator internally
    // ---------------------------------------------------------------

    @Test
    public void testSingleArgConstructor_EvaluateEqualObjects_ReturnsTrue() {
        EqualPredicate<String> predicate = new EqualPredicate<String>("abc");
        assertTrue(predicate.evaluate("abc"));
    }

    @Test
    public void testSingleArgConstructor_EvaluateDifferentObjects_ReturnsFalse() {
        EqualPredicate<String> predicate = new EqualPredicate<String>("abc");
        assertFalse(predicate.evaluate("xyz"));
    }

    @Test
    public void testSingleArgConstructor_EvaluateWithNullInput_ReturnsFalse() {
        EqualPredicate<String> predicate = new EqualPredicate<String>("abc");
        assertFalse(predicate.evaluate(null));
    }

    @Test
    public void testSingleArgConstructor_BothValueAndInputNull_DoesNotThrow() {
        // ไม่มีซอร์สของ DefaultEquator ให้มา จึงไม่ระบุ assertion ของผลลัพธ์ที่แน่ชัด
        // เพียงตรวจสอบว่าไม่ throw exception เมื่อทั้งค่าที่เก็บและอินพุตเป็น null
        EqualPredicate<String> predicate = new EqualPredicate<String>(null);
        predicate.evaluate(null);
    }

    @Test
    public void testSingleArgConstructor_EqualValuesDifferentReferences_ReturnsTrue() {
        // Boundary: ใช้ Integer ค่าที่อยู่นอกช่วง cache (-128..127) เพื่อการันตีว่าเป็น reference คนละตัว
        Integer a = new Integer(100000);
        Integer b = new Integer(100000);
        EqualPredicate<Integer> predicate = new EqualPredicate<Integer>(a);
        assertTrue(predicate.evaluate(b));
    }

    /**
     * Fault-detecting test: อ้างอิงจากคอมเมนต์ในซอร์สโค้ดต้นทางโดยตรง
     * ("the DefaultEquator returns also true if the two object references are equal")
     * ทดสอบว่าเมื่อ equals() ของ object ถูก override ให้ return false เสมอ (broken equals)
     * แต่ reference เดียวกันถูกส่งเข้ามาเทียบ ผลลัพธ์จะเป็น true เนื่องจาก DefaultEquator
     * ตรวจสอบ reference-equality เพิ่มเติมจาก equals() ตามที่ระบุไว้ในคอมเมนต์
     *
     * หากพฤติกรรมนี้ถูกแก้ไข (bug fix) ในเวอร์ชันถัดไป test นี้ควร fail และช่วยดักจับการเปลี่ยนแปลง
     */
    @Test
    public void testSingleArgConstructor_SameReference_BrokenEquals_ExposesDocumentedDefaultEquatorBehavior() {
        NeverEqualObject obj = new NeverEqualObject();
        EqualPredicate<NeverEqualObject> predicate = new EqualPredicate<NeverEqualObject>(obj);
        assertTrue(predicate.evaluate(obj));
    }

    @Test
    public void testSingleArgConstructor_DifferentReferences_BrokenEquals_ReturnsFalse() {
        NeverEqualObject obj1 = new NeverEqualObject();
        NeverEqualObject obj2 = new NeverEqualObject();
        EqualPredicate<NeverEqualObject> predicate = new EqualPredicate<NeverEqualObject>(obj1);
        assertFalse(predicate.evaluate(obj2));
    }

    // ---------------------------------------------------------------
    // Constructor(T object, Equator<T> equator) - explicit equator, delegate ตรงไปตรงมา
    // ---------------------------------------------------------------

    @Test
    public void testConstructorWithEquator_DelegatesToEquator_ReturnsTrue() {
        @SuppressWarnings("unchecked")
        Equator<String> equator = createMock(Equator.class);
        expect(equator.equate("abc", "abc")).andReturn(true);
        replay(equator);

        EqualPredicate<String> predicate = new EqualPredicate<String>("abc", equator);
        assertTrue(predicate.evaluate("abc"));

        verify(equator);
    }

    @Test
    public void testConstructorWithEquator_DelegatesToEquator_ReturnsFalse() {
        @SuppressWarnings("unchecked")
        Equator<String> equator = createMock(Equator.class);
        expect(equator.equate("abc", "xyz")).andReturn(false);
        replay(equator);

        EqualPredicate<String> predicate = new EqualPredicate<String>("abc", equator);
        assertFalse(predicate.evaluate("xyz"));

        verify(equator);
    }

    @Test
    public void testConstructorWithEquator_NullValueAndInput_DelegatesToEquator() {
        @SuppressWarnings("unchecked")
        Equator<String> equator = createMock(Equator.class);
        expect(equator.equate(null, null)).andReturn(true);
        replay(equator);

        EqualPredicate<String> predicate = new EqualPredicate<String>(null, equator);
        assertTrue(predicate.evaluate(null));

        verify(equator);
    }

    // ---------------------------------------------------------------
    // getValue()
    // ---------------------------------------------------------------

    @Test
    public void testGetValue_ReturnsStoredValue() {
        EqualPredicate<String> predicate = new EqualPredicate<String>("myValue");
        assertEquals("myValue", predicate.getValue());
    }

    @Test
    public void testGetValue_ReturnsNullWhenStoredValueIsNull() {
        EqualPredicate<String> predicate = new EqualPredicate<String>(null);
        assertNull(predicate.getValue());
    }
}
```

## ตารางสรุปการครอบคลุม Branch/Condition

| เมธอดทดสอบ | Branch/Condition ที่ครอบคลุม |
|---|---|
| `testEqualPredicateFactory_NonNullObject_ReturnsEqualPredicateInstance` | `equalPredicate(T)`: `object == null` → **false** branch |
| `testEqualPredicateFactory_NullObject_ReturnsNonEqualPredicateInstance` | `equalPredicate(T)`: `object == null` → **true** branch (return `nullPredicate()`) |
| `testEqualPredicateFactoryWithEquator_NonNullObject_ReturnsEqualPredicateInstance` | `equalPredicate(T, Equator)`: `object == null` → **false** branch |
| `testEqualPredicateFactoryWithEquator_NullObject_ReturnsNonEqualPredicateInstance` | `equalPredicate(T, Equator)`: `object == null` → **true** branch |
| `testSingleArgConstructor_EvaluateEqualObjects_ReturnsTrue` | Constructor(T) → `evaluate()` กรณีค่าเท่ากัน (true path) |
| `testSingleArgConstructor_EvaluateDifferentObjects_ReturnsFalse` | Constructor(T) → `evaluate()` กรณีค่าไม่เท่ากัน (false path) |
| `testSingleArgConstructor_EvaluateWithNullInput_ReturnsFalse` | Boundary: input = null, value ≠ null |
| `testSingleArgConstructor_BothValueAndInputNull_DoesNotThrow` | Boundary: value = null และ input = null (ไม่ assert ผลลัพธ์เชิงพฤติกรรมที่ไม่มีในซอร์ส) |
| `testSingleArgConstructor_EqualValuesDifferentReferences_ReturnsTrue` | Boundary: ค่าเท่ากันแต่ reference ต่างกัน (equals-based) |
| `testSingleArgConstructor_SameReference_BrokenEquals_ExposesDocumentedDefaultEquatorBehavior` | **Fault-detecting**: reference เดียวกัน + equals() คืน false เสมอ — ทดสอบ defect ที่ระบุในคอมเมนต์ต้นฉบับ |
| `testSingleArgConstructor_DifferentReferences_BrokenEquals_ReturnsFalse` | Reference ต่างกัน + equals() คืน false เสมอ → ควรได้ false |
| `testConstructorWithEquator_DelegatesToEquator_ReturnsTrue` | Constructor(T, Equator) → `evaluate()` delegate ไปยัง equator (true) |
| `testConstructorWithEquator_DelegatesToEquator_ReturnsFalse` | Constructor(T, Equator) → `evaluate()` delegate ไปยัง equator (false) |
| `testConstructorWithEquator_NullValueAndInput_DelegatesToEquator` | Boundary: value/input = null ผ่าน custom equator |
| `testGetValue_ReturnsStoredValue` | `getValue()` กรณีค่าไม่เป็น null |
| `testGetValue_ReturnsNullWhenStoredValueIsNull` | `getValue()` กรณีค่าเป็น null (boundary) |

**หมายเหตุสำคัญ:** คลาส `EqualPredicate` มีเพียง 2 if-statement (ใน factory methods) รวม 4 branch ซึ่งถูกครอบคลุมครบทั้งหมดแล้ว ส่วน `evaluate()` และ `getValue()` ไม่มี branch ภายในตัวเอง (เป็น delegate ตรง) แต่ยังคงทดสอบด้วยหลาย input เพื่อเพิ่มโอกาสตรวจจับ fault โดยเฉพาะ test ที่เกี่ยวกับ **known defect** (คอมเมนต์ vs. implementation ไม่ตรงกันของ constructor แบบ argument เดียว) ซึ่งตรงกับบั๊กจริงของ Defects4J Collections-17