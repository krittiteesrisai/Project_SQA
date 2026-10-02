# JUnit 4 Test Suite: CoreOperationLessThanOrEqualTest

## การวิเคราะห์ซอร์สโค้ด

จากคลาส `CoreOperationLessThanOrEqual` มี method หลักที่ต้องทดสอบคือ `computeValue()` ซึ่งมี branch เดียวคือ ternary operator `l <= r ? Boolean.TRUE : Boolean.FALSE` — ต้องครอบคลุมทั้งกรณี `true` และ `false` รวมถึงกรณี boundary ที่ `l == r`

เนื่องจากไม่มีซอร์สโค้ดของ `InfoSetUtil.doubleValue()` และ `Constant` ให้ตรวจสอบอย่างละเอียด จึงต้องระมัดระมัดในการ assert ผลลัพธ์กับ input ที่ผิดรูปแบบ (ตามข้อกำหนดห้ามเดา behavior)

```java
package org.apache.commons.jxpath.ri.compiler;

import static org.junit.Assert.*;
import org.junit.Test;

/**
 * JUnit 4 test suite สำหรับ CoreOperationLessThanOrEqual (Defects4J: JxPath-7b)
 *
 * หมายเหตุ: ใช้ org.apache.commons.jxpath.ri.compiler.Constant เป็น Expression
 * concrete class เพื่อป้อนค่าคงที่เข้า computeValue() โดยไม่ต้องพึ่ง EvalContext จริง
 * (Constant.computeValue() ไม่ใช้ context ตามพฤติกรรมที่คาดไว้ของ JxPath)
 */
public class CoreOperationLessThanOrEqualTest {

    // ---------- กรณีปกติ: l < r -> true ----------
    @Test
    public void testLessThan_ReturnsTrue() {
        Expression left = new Constant(1.0);
        Expression right = new Constant(2.0);
        CoreOperationLessThanOrEqual op =
                new CoreOperationLessThanOrEqual(left, right);
        Object result = op.computeValue(null);
        assertEquals(Boolean.TRUE, result);
    }

    // ---------- กรณี boundary: l == r -> true (สำคัญมากสำหรับ "<=") ----------
    @Test
    public void testEqual_BoundaryReturnsTrue() {
        Expression left = new Constant(5.0);
        Expression right = new Constant(5.0);
        CoreOperationLessThanOrEqual op =
                new CoreOperationLessThanOrEqual(left, right);
        Object result = op.computeValue(null);
        assertEquals(Boolean.TRUE, result);
    }

    // ---------- กรณี l > r -> false ----------
    @Test
    public void testGreaterThan_ReturnsFalse() {
        Expression left = new Constant(10.0);
        Expression right = new Constant(2.0);
        CoreOperationLessThanOrEqual op =
                new CoreOperationLessThanOrEqual(left, right);
        Object result = op.computeValue(null);
        assertEquals(Boolean.FALSE, result);
    }

    // ---------- กรณีค่าลบ: l < r (ติดลบทั้งคู่) -> true ----------
    @Test
    public void testNegativeNumbers_LessThanOrEqualTrue() {
        Expression left = new Constant(-5.0);
        Expression right = new Constant(-3.0);
        CoreOperationLessThanOrEqual op =
                new CoreOperationLessThanOrEqual(left, right);
        Object result = op.computeValue(null);
        assertEquals(Boolean.TRUE, result);
    }

    // ---------- กรณีค่าลบ: l > r -> false ----------
    @Test
    public void testNegativeNumbers_GreaterReturnsFalse() {
        Expression left = new Constant(-3.0);
        Expression right = new Constant(-5.0);
        CoreOperationLessThanOrEqual op =
                new CoreOperationLessThanOrEqual(left, right);
        Object result = op.computeValue(null);
        assertEquals(Boolean.FALSE, result);
    }

    // ---------- กรณี boundary ที่ศูนย์ ----------
    @Test
    public void testZeroBoundary_EqualReturnsTrue() {
        Expression left = new Constant(0.0);
        Expression right = new Constant(0.0);
        CoreOperationLessThanOrEqual op =
                new CoreOperationLessThanOrEqual(left, right);
        Object result = op.computeValue(null);
        assertEquals(Boolean.TRUE, result);
    }

    // ---------- กรณี input เป็น String ตัวเลข (ทดสอบ InfoSetUtil.doubleValue แปลง String->double) ----------
    @Test
    public void testStringNumericValues_LessThanReturnsTrue() {
        Expression left = new Constant("3.5");
        Expression right = new Constant("4.5");
        CoreOperationLessThanOrEqual op =
                new CoreOperationLessThanOrEqual(left, right);
        Object result = op.computeValue(null);
        assertEquals(Boolean.TRUE, result);
    }

    @Test
    public void testStringNumericValues_EqualReturnsTrue() {
        Expression left = new Constant("7");
        Expression right = new Constant("7");
        CoreOperationLessThanOrEqual op =
                new CoreOperationLessThanOrEqual(left, right);
        Object result = op.computeValue(null);
        assertEquals(Boolean.TRUE, result);
    }

    // ---------- กรณี input ว่าง (String "") ----------
    @Test
    public void testEmptyStringValue_BehaviorUnknown() {
        // หมายเหตุ: ไม่มีซอร์สของ InfoSetUtil.doubleValue ให้ตรวจสอบ behavior ที่แน่ชัด
        // กับ String ว่าง ("") จึงไม่ assert ผลลัพธ์ที่เฉพาะเจาะจงว่าเป็น TRUE/FALSE
        // เพียงตรวจสอบว่า method ทำงานได้ (คืนค่า หรือ throw exception ก็ยอมรับได้)
        Expression left = new Constant("");
        Expression right = new Constant(1.0);
        CoreOperationLessThanOrEqual op =
                new CoreOperationLessThanOrEqual(left, right);
        try {
            Object result = op.computeValue(null);
            assertNotNull(result);
        } catch (RuntimeException e) {
            // ยอมรับว่าอาจ throw exception ได้ (เช่น NumberFormatException)
            // ไม่ fail test เนื่องจากไม่มีซอร์สยืนยัน behavior ที่แท้จริง
        }
    }

    // ---------- กรณี input ผิดรูปแบบ (String ไม่ใช่ตัวเลข) ----------
    @Test
    public void testMalformedStringValue_BehaviorUnknown() {
        // หมายเหตุ: ค่า String ที่ไม่ใช่ตัวเลข เช่น "abc" ไม่แน่ใจ behavior ของ
        // InfoSetUtil.doubleValue (อาจคืนค่า NaN หรือ throw NumberFormatException)
        // จึงไม่ assert ผลลัพธ์ที่ตายตัว
        Expression left = new Constant("abc");
        Expression right = new Constant(1.0);
        CoreOperationLessThanOrEqual op =
                new CoreOperationLessThanOrEqual(left, right);
        try {
            Object result = op.computeValue(null);
            assertNotNull(result);
        } catch (RuntimeException e) {
            // ยอมรับว่าอาจ throw exception ได้ ไม่ fail test
        }
    }

    // ---------- ทดสอบ getSymbol() ----------
    @Test
    public void testGetSymbol_ReturnsLessThanOrEqualSign() {
        Expression left = new Constant(1.0);
        Expression right = new Constant(2.0);
        CoreOperationLessThanOrEqual op =
                new CoreOperationLessThanOrEqual(left, right);
        assertEquals("<=", op.getSymbol());
    }

    // ---------- ทดสอบค่าทศนิยมที่ใกล้เคียงกันมาก (ความละเอียดของ double) ----------
    @Test
    public void testDecimalBoundaryValues() {
        Expression left = new Constant(1.0000001);
        Expression right = new Constant(1.0000002);
        CoreOperationLessThanOrEqual op =
                new CoreOperationLessThanOrEqual(left, right);
        Object result = op.computeValue(null);
        assertEquals(Boolean.TRUE, result);
    }

    // ---------- ทดสอบค่าสูงสุดของ double (extreme boundary) ----------
    @Test
    public void testLargeNumbers_EqualMaxValue() {
        Expression left = new Constant(Double.MAX_VALUE);
        Expression right = new Constant(Double.MAX_VALUE);
        CoreOperationLessThanOrEqual op =
                new CoreOperationLessThanOrEqual(left, right);
        Object result = op.computeValue(null);
        assertEquals(Boolean.TRUE, result);
    }

    // ---------- ทดสอบค่าต่ำสุดของ double เทียบกับค่าปกติ ----------
    @Test
    public void testSmallestValueLessThanNormal() {
        Expression left = new Constant(-Double.MAX_VALUE);
        Expression right = new Constant(0.0);
        CoreOperationLessThanOrEqual op =
                new CoreOperationLessThanOrEqual(left, right);
        Object result = op.computeValue(null);
        assertEquals(Boolean.TRUE, result);
    }

    // ---------- ทดสอบผลลัพธ์เป็น instance ของ Boolean (ตรวจ type ของผลลัพธ์) ----------
    @Test
    public void testResultIsBooleanInstance() {
        Expression left = new Constant(1.0);
        Expression right = new Constant(2.0);
        CoreOperationLessThanOrEqual op =
                new CoreOperationLessThanOrEqual(left, right);
        Object result = op.computeValue(null);
        assertTrue(result instanceof Boolean);
    }
}
```

## ตารางสรุป Test Case และ Branch/Condition ที่ครอบคลุม

| เมธอดทดสอบ | Branch/Condition ที่ครอบคลุม | หมายเหตุ |
|---|---|---|
| `testLessThan_ReturnsTrue` | `l <= r` → true (กรณี l < r) | ครอบคลุม branch TRUE ของ ternary |
| `testEqual_BoundaryReturnsTrue` | `l <= r` → true (กรณี l == r, boundary) | จุดสำคัญของ operator "<=" ที่ต่างจาก "<" |
| `testGreaterThan_ReturnsFalse` | `l <= r` → false (กรณี l > r) | ครอบคลุม branch FALSE ของ ternary |
| `testNegativeNumbers_LessThanOrEqualTrue` | `l <= r` → true ด้วยค่าลบ | ทดสอบความถูกต้องของ double comparison กับค่าลบ |
| `testNegativeNumbers_GreaterReturnsFalse` | `l <= r` → false ด้วยค่าลบ | เสริม branch FALSE ด้วยค่าลบ |
| `testZeroBoundary_EqualReturnsTrue` | `l <= r` → true ที่ l=r=0 | boundary case พิเศษที่ค่าเป็นศูนย์ |
| `testStringNumericValues_LessThanReturnsTrue` | `l <= r` → true ผ่าน `InfoSetUtil.doubleValue` จาก String | ทดสอบ path การแปลง String→double |
| `testStringNumericValues_EqualReturnsTrue` | `l <= r` → true (String ค่าเท่ากัน) | boundary + string conversion |
| `testEmptyStringValue_BehaviorUnknown` | Input ว่าง (String "") | **ไม่แน่ใจ behavior ของ `InfoSetUtil`** จึงไม่ assert ผลลัพธ์ตายตัว |
| `testMalformedStringValue_BehaviorUnknown` | Input ผิดรูปแบบ ("abc") | **ไม่แน่ใจ behavior** อาจ throw/คืน NaN — ครอบ try/catch |
| `testGetSymbol_ReturnsLessThanOrEqualSign` | `getSymbol()` คืนค่า `"<="` | ทดสอบ method ตรง ๆ ของคลาส |
| `testDecimalBoundaryValues` | `l <= r` → true ด้วยค่าทศนิยมใกล้เคียงกันมาก | ตรวจความละเอียดของการเทียบ double |
| `testLargeNumbers_EqualMaxValue` | `l <= r` → true ที่ Double.MAX_VALUE | extreme boundary case |
| `testSmallestValueLessThanNormal` | `l <= r` → true จากค่าต่ำสุดเทียบค่าปกติ | extreme boundary case (ฝั่งลบ) |
| `testResultIsBooleanInstance` | ตรวจ type ผลลัพธ์เป็น `Boolean` | ตรวจสอบ return type ของ `computeValue()` |

**ข้อสังเกตเพิ่มเติม:** เนื่องจาก source code ของ `InfoSetUtil.doubleValue()`, `Constant`, และ `CoreOperationRelationalExpression` ไม่ได้ถูกให้มาในโจทย์ จึงอนุมาน behavior จากสัญญาการทำงานพื้นฐานของ JxPath เท่าที่จำเป็นในการสร้าง Expression ทดสอบ (ใช้ `Constant` เป็น concrete `Expression`) และระมัดระมัดไม่ assert ผลลัพธ์ที่ไม่มีหลักฐานยืนยันชัดเจน (เช่น string ว่าง/ผิดรูปแบบ) ตามข้อกำหนด