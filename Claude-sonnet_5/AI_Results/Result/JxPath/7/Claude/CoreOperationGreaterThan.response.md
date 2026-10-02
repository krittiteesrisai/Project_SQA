# JUnit 4 Test Suite: CoreOperationGreaterThanTest

## การวิเคราะห์ซอร์สโค้ด

จากซอร์สโค้ดที่ให้มา `CoreOperationGreaterThan.computeValue()` มี logic หลักเพียงเส้นทางเดียวที่แตกแขนง (branch) คือ:

```java
return l > r ? Boolean.TRUE : Boolean.FALSE;
```

**หมายเหตุสำคัญ (ตามข้อกำหนดห้ามเดา behavior):**
- ผมไม่มีซอร์สโค้ดของ `Expression`, `CoreOperationRelationalExpression`, และ `InfoSetUtil.doubleValue()` ให้ตรวจสอบจริง
- เพื่อหลีกเลี่ยงการเดา API ของ abstract class `Expression` (ซึ่งเสี่ยงคอมไพล์ไม่ผ่านหรือสมมติ behavior ที่ไม่มีจริง) ผมเลือกใช้คลาส **`Constant`** ซึ่งเป็นคลาสที่มีอยู่แล้วจริงใน package เดียวกัน (`org.apache.commons.jxpath.ri.compiler.Constant`) ตาม JXPath source — เป็น subclass ของ `Expression` ที่ implement ไว้สมบูรณ์แล้วในโปรเจกต์ ทำให้ไม่ต้องเดา behavior ของ abstract method
- พฤติกรรมของ `InfoSetUtil.doubleValue()` กับ string ที่ไม่ใช่ตัวเลข (คาดว่าจะคืน `NaN`) เป็น**สมมติฐานที่มีคอมเมนต์กำกับไว้ชัดเจน** เนื่องจากไม่มีซอร์สให้ยืนยัน 100%

```java
package org.apache.commons.jxpath.ri.compiler;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Unit test สำหรับ CoreOperationGreaterThan (JxPath-7b)
 *
 * ใช้คลาส Constant (มีอยู่แล้วใน org.apache.commons.jxpath.ri.compiler)
 * เป็น Expression ที่คืนค่าคงที่เมื่อถูกเรียก computeValue()
 * เพื่อหลีกเลี่ยงการเดา behavior ของ abstract class Expression เอง
 *
 * EvalContext ส่งเป็น null ได้ เนื่องจาก Constant.computeValue()
 * ไม่มีการใช้งาน context (ไม่ได้ depend on context)
 */
public class CoreOperationGreaterThanTest {

    @Test
    public void testGetSymbol() {
        CoreOperationGreaterThan op =
            new CoreOperationGreaterThan(new Constant(1), new Constant(2));
        assertEquals(">", op.getSymbol());
    }

    // ---------- กรณีปกติ: l > r (branch TRUE) ----------

    @Test
    public void testLeftGreaterThanRight_ReturnsTrue() {
        CoreOperationGreaterThan op =
            new CoreOperationGreaterThan(new Constant(5), new Constant(3));
        assertEquals(Boolean.TRUE, op.computeValue(null));
    }

    @Test
    public void testNegativeNumbers_LeftGreater_ReturnsTrue() {
        CoreOperationGreaterThan op =
            new CoreOperationGreaterThan(new Constant(-1), new Constant(-5));
        assertEquals(Boolean.TRUE, op.computeValue(null));
    }

    @Test
    public void testDecimalValues_LeftGreater_ReturnsTrue() {
        CoreOperationGreaterThan op =
            new CoreOperationGreaterThan(new Constant(3.14), new Constant(3.13));
        assertEquals(Boolean.TRUE, op.computeValue(null));
    }

    @Test
    public void testStringNumericValues_LeftGreater_ReturnsTrue() {
        // คาดว่า InfoSetUtil.doubleValue จะแปลงสตริงตัวเลขเป็น double ได้
        CoreOperationGreaterThan op =
            new CoreOperationGreaterThan(new Constant("10"), new Constant("5"));
        assertEquals(Boolean.TRUE, op.computeValue(null));
    }

    // ---------- กรณี l <= r (branch FALSE) ----------

    @Test
    public void testLeftLessThanRight_ReturnsFalse() {
        CoreOperationGreaterThan op =
            new CoreOperationGreaterThan(new Constant(3), new Constant(5));
        assertEquals(Boolean.FALSE, op.computeValue(null));
    }

    @Test
    public void testNegativeNumbers_LeftLess_ReturnsFalse() {
        CoreOperationGreaterThan op =
            new CoreOperationGreaterThan(new Constant(-5), new Constant(-1));
        assertEquals(Boolean.FALSE, op.computeValue(null));
    }

    @Test
    public void testDecimalValues_LeftLess_ReturnsFalse() {
        CoreOperationGreaterThan op =
            new CoreOperationGreaterThan(new Constant(3.13), new Constant(3.14));
        assertEquals(Boolean.FALSE, op.computeValue(null));
    }

    // ---------- กรณีขอบเขต (boundary): ค่าเท่ากัน ----------

    @Test
    public void testEqualValues_BoundaryReturnsFalse() {
        CoreOperationGreaterThan op =
            new CoreOperationGreaterThan(new Constant(5), new Constant(5));
        assertEquals(Boolean.FALSE, op.computeValue(null));
    }

    @Test
    public void testZeroBoundary_ReturnsFalse() {
        CoreOperationGreaterThan op =
            new CoreOperationGreaterThan(new Constant(0), new Constant(0));
        assertEquals(Boolean.FALSE, op.computeValue(null));
    }

    // ---------- กรณีอินพุตผิดรูปแบบ / ว่าง (เดาจาก behavior ที่น่าเป็นไปได้ของ NaN) ----------

    @Test
    public void testInvalidStringInput_LeftIsNaN_ReturnsFalse() {
        // สมมติฐาน: InfoSetUtil.doubleValue("abc") คืนค่า NaN
        // NaN > x จะเป็น false เสมอ ไม่ว่า x จะเป็นค่าใด
        CoreOperationGreaterThan op =
            new CoreOperationGreaterThan(new Constant("abc"), new Constant("5"));
        assertEquals(Boolean.FALSE, op.computeValue(null));
    }

    @Test
    public void testInvalidStringInput_RightIsNaN_ReturnsFalse() {
        // สมมติฐาน: x > NaN เป็น false เสมอ
        CoreOperationGreaterThan op =
            new CoreOperationGreaterThan(new Constant("5"), new Constant("abc"));
        assertEquals(Boolean.FALSE, op.computeValue(null));
    }

    @Test
    public void testEmptyStringInput_ReturnsFalse() {
        // สมมติฐาน: สตริงว่าง -> doubleValue คืน NaN เช่นเดียวกับ string ผิดรูปแบบ
        CoreOperationGreaterThan op =
            new CoreOperationGreaterThan(new Constant(""), new Constant("1"));
        assertEquals(Boolean.FALSE, op.computeValue(null));
    }

    @Test
    public void testBothInvalidStrings_ReturnsFalse() {
        // NaN > NaN ก็ควรเป็น false เสมอตามกฎ IEEE 754
        CoreOperationGreaterThan op =
            new CoreOperationGreaterThan(new Constant("abc"), new Constant("xyz"));
        assertEquals(Boolean.FALSE, op.computeValue(null));
    }
}
```

## ตารางสรุป Branch/Condition Coverage

| เมธอดทดสอบ | Branch/Condition ที่ครอบคลุม |
|---|---|
| `testGetSymbol` | ตรวจสอบค่า return ของ `getSymbol()` = ">" |
| `testLeftGreaterThanRight_ReturnsTrue` | `l > r` = true (ค่าบวกปกติ) |
| `testNegativeNumbers_LeftGreater_ReturnsTrue` | `l > r` = true (ค่าลบทั้งสองฝั่ง) |
| `testDecimalValues_LeftGreater_ReturnsTrue` | `l > r` = true (ค่าทศนิยม) |
| `testStringNumericValues_LeftGreater_ReturnsTrue` | `l > r` = true (อินพุตเป็น String ตัวเลข ผ่าน `InfoSetUtil.doubleValue`) |
| `testLeftLessThanRight_ReturnsFalse` | `l > r` = false (ค่าบวกปกติ) |
| `testNegativeNumbers_LeftLess_ReturnsFalse` | `l > r` = false (ค่าลบทั้งสองฝั่ง) |
| `testDecimalValues_LeftLess_ReturnsFalse` | `l > r` = false (ค่าทศนิยม) |
| `testEqualValues_BoundaryReturnsFalse` | boundary: `l == r` → false (ขอบเขตของ `>`) |
| `testZeroBoundary_ReturnsFalse` | boundary: `l == r == 0` → false |
| `testInvalidStringInput_LeftIsNaN_ReturnsFalse` | อินพุตผิดรูปแบบฝั่งซ้าย → NaN comparison → false |
| `testInvalidStringInput_RightIsNaN_ReturnsFalse` | อินพุตผิดรูปแบบฝั่งขวา → NaN comparison → false |
| `testEmptyStringInput_ReturnsFalse` | ค่าว่าง (empty string) → false |
| `testBothInvalidStrings_ReturnsFalse` | ทั้งสองฝั่งผิดรูปแบบ (NaN > NaN) → false |

### ข้อจำกัดที่ควรทราบ
- ไม่ได้ทดสอบกรณี `computeValue(context)` ที่ context เป็น `null` และ argument expression ต้องใช้ context จริง เพราะ `Constant` ไม่ depend on context (จึงไม่ throw NPE) — เป็นข้อจำกัดของวิธีทดสอบที่เลือกใช้
- ไม่ได้สร้าง custom `Expression` subclass เพื่อ return `null` จาก `computeValue()` เนื่องจากไม่มีซอร์สของ `InfoSetUtil.doubleValue(null)` และ abstract method signature ของ `Expression` มายืนยัน ป้องกันการเดา behavior ที่ไม่มีอยู่จริง
- Branch coverage ของ `l > r` ternary ครอบคลุมครบทั้ง 2 ทาง (true/false) รวมถึง boundary (equal) และกรณี NaN ซึ่งเป็นจุดที่มักพบ fault ในโค้ดเปรียบเทียบตัวเลข