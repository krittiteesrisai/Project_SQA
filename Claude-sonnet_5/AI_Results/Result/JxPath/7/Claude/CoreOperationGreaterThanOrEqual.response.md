# CoreOperationGreaterThanOrEqualTest

## การวิเคราะห์โค้ดเป้าหมาย

จากซอร์สโค้ด `CoreOperationGreaterThanOrEqual.computeValue()`:
```java
double l = InfoSetUtil.doubleValue(args[0].computeValue(context));
double r = InfoSetUtil.doubleValue(args[1].computeValue(context));
return l >= r ? Boolean.TRUE : Boolean.FALSE;
```
มี **branch เดียว** ในรูป ternary (`l >= r` → true/false) ที่ต้องครอบคลุมทั้งสองทาง และ `getSymbol()` ที่ต้อง assert ค่าคงที่

เนื่องจากไม่มีซอร์สของ `InfoSetUtil.doubleValue(...)` และ `CoreOperationRelationalExpression` ให้มา จึงใช้คลาส `Constant` (อยู่ใน package เดียวกัน `org.apache.commons.jxpath.ri.compiler`) ซึ่งทราบจาก constructor ที่ parent class เรียกใช้ (`Expression[]`) ว่าเป็น `Expression` ที่คืนค่าคงที่โดยไม่สนใจ `context` — จึงสามารถส่ง `null` เป็น `EvalContext` ได้อย่างปลอดภัยโดยไม่ต้องเดา behavior ของ library อื่น

> **หมายเหตุสำคัญ**: พฤติกรรมของ `InfoSetUtil.doubleValue(...)` เมื่อรับสตริงที่แปลงเป็นตัวเลขไม่ได้ (malformed) **ไม่มีซอร์สโค้ดยืนยันในโจทย์นี้** จึงกำกับคอมเมนต์ไว้ในแต่ละเทสว่าเป็นการอ้างอิงพฤติกรรมทั่วไปของ JXPath (คืน `NaN`) ซึ่งอาจไม่ตรง 100% หากมี fault อยู่ในจุดนี้ — ถือเป็นจุดที่ test อาจช่วย "ดักจับ fault" ได้ตามเป้าหมาย

```java
package org.apache.commons.jxpath.ri.compiler;

import static org.junit.Assert.*;
import org.junit.Test;

/**
 * Unit test สำหรับ CoreOperationGreaterThanOrEqual (JXPath-7b)
 *
 * ใช้คลาส Constant (package เดียวกัน) เป็น Expression สำหรับทดสอบ
 * เนื่องจาก Constant.computeValue(context) คืนค่าคงที่โดยไม่ใช้ context
 * จึงสามารถส่ง null เป็น EvalContext ได้โดยไม่กระทบผลลัพธ์
 */
public class CoreOperationGreaterThanOrEqualTest {

    private CoreOperationGreaterThanOrEqual createOp(Expression a, Expression b) {
        return new CoreOperationGreaterThanOrEqual(a, b);
    }

    /** helper: คำนวณผลลัพธ์ และยืนยันว่าเป็น Boolean */
    private boolean evaluate(Expression a, Expression b) {
        CoreOperationGreaterThanOrEqual op = createOp(a, b);
        Object result = op.computeValue(null);
        assertTrue("ผลลัพธ์ต้องเป็น Boolean", result instanceof Boolean);
        return ((Boolean) result).booleanValue();
    }

    // ---------- Boundary: ค่าเท่ากันพอดี ----------
    @Test
    public void testEqualValues_ReturnsTrue() {
        // l == r -> branch true ของ l >= r
        assertTrue(evaluate(new Constant(5.0), new Constant(5.0)));
    }

    @Test
    public void testZeroBoundary_EqualZero() {
        assertTrue(evaluate(new Constant(0.0), new Constant(0.0)));
    }

    @Test
    public void testPositiveAndNegativeZero_StillEqual() {
        // ใน Java primitive double: 0.0 >= -0.0 เป็น true เสมอ (IEEE754 semantics)
        // นี่คือพฤติกรรมมาตรฐานของภาษา ไม่ใช่การเดา behavior ของ library
        assertTrue(evaluate(new Constant(0.0), new Constant(-0.0)));
    }

    // ---------- l > r ----------
    @Test
    public void testGreaterThan_ReturnsTrue() {
        assertTrue(evaluate(new Constant(10.0), new Constant(3.0)));
    }

    @Test
    public void testNegativeNumbers_GreaterOrEqual() {
        assertTrue(evaluate(new Constant(-5.0), new Constant(-10.0)));
    }

    // ---------- l < r ----------
    @Test
    public void testLessThan_ReturnsFalse() {
        // branch false ของ l >= r
        assertFalse(evaluate(new Constant(3.0), new Constant(10.0)));
    }

    @Test
    public void testNegativeNumbers_Less() {
        assertFalse(evaluate(new Constant(-10.0), new Constant(-5.0)));
    }

    // ---------- String numeric (ค่า valid แต่เป็นสตริง) ----------
    @Test
    public void testStringNumericGreater_ReturnsTrue() {
        assertTrue(evaluate(new Constant("5"), new Constant("3")));
    }

    @Test
    public void testStringNumericEqual_ReturnsTrue() {
        assertTrue(evaluate(new Constant("5.5"), new Constant("5.5")));
    }

    @Test
    public void testStringNumericLess_ReturnsFalse() {
        assertFalse(evaluate(new Constant("2"), new Constant("8")));
    }

    // ---------- อินพุตผิดรูปแบบ (malformed) / ค่าว่าง ----------
    // หมายเหตุ: ไม่มีซอร์ส InfoSetUtil ยืนยันในโจทย์นี้ สันนิษฐานตามพฤติกรรม
    // ทั่วไปของ JXPath ว่าจะคืน Double.NaN เมื่อแปลงสตริงเป็นตัวเลขไม่ได้
    // ซึ่งทำให้ (NaN >= x) เป็น false เสมอ หากพฤติกรรมจริงต่างจากนี้
    // แสดงว่าอาจพบ fault ที่จุดนี้
    @Test
    public void testMalformedStringBothSides_ReturnsFalse() {
        assertFalse(evaluate(new Constant("abc"), new Constant("xyz")));
    }

    @Test
    public void testMalformedStringOneSide_ReturnsFalse() {
        assertFalse(evaluate(new Constant("abc"), new Constant("1")));
    }

    @Test
    public void testEmptyStringArgument_ReturnsFalse() {
        // สตริงว่างไม่สามารถแปลงเป็นตัวเลขได้ คาดว่าเกิด NaN เช่นเดียวกับ malformed string
        assertFalse(evaluate(new Constant(""), new Constant("1")));
    }

    // ---------- getSymbol() ----------
    @Test
    public void testGetSymbol_ReturnsCorrectSymbol() {
        CoreOperationGreaterThanOrEqual op =
                createOp(new Constant(1.0), new Constant(1.0));
        assertEquals(">=", op.getSymbol());
    }

    // ---------- ยืนยันว่าใช้ Boolean.TRUE / Boolean.FALSE singleton ----------
    @Test
    public void testResultIsBooleanTrueSingleton() {
        CoreOperationGreaterThanOrEqual op =
                createOp(new Constant(5.0), new Constant(1.0));
        Object result = op.computeValue(null);
        assertSame(Boolean.TRUE, result);
    }

    @Test
    public void testResultIsBooleanFalseSingleton() {
        CoreOperationGreaterThanOrEqual op =
                createOp(new Constant(1.0), new Constant(5.0));
        Object result = op.computeValue(null);
        assertSame(Boolean.FALSE, result);
    }

    // ---------- Constructor: ตรวจสอบว่า args ถูกเก็บถูกตำแหน่ง ----------
    @Test
    public void testConstructorArgumentOrderAffectsResult() {
        // สลับตำแหน่ง arg1/arg2 ต้องให้ผลต่างกันเมื่อ l != r
        boolean resultAB = evaluate(new Constant(2.0), new Constant(9.0)); // 2>=9 false
        boolean resultBA = evaluate(new Constant(9.0), new Constant(2.0)); // 9>=2 true
        assertFalse(resultAB);
        assertTrue(resultBA);
    }
}
```

## สรุปความครอบคลุม (Coverage Mapping)

| Test Method | Branch / Condition ที่ครอบคลุม |
|---|---|
| `testEqualValues_ReturnsTrue` | `l >= r` เมื่อ `l == r` → branch **true** (boundary) |
| `testZeroBoundary_EqualZero` | boundary ที่ค่า 0.0 == 0.0 → branch **true** |
| `testPositiveAndNegativeZero_StillEqual` | boundary IEEE754 (0.0 vs -0.0) → branch **true** |
| `testGreaterThan_ReturnsTrue` | `l > r` → branch **true** |
| `testNegativeNumbers_GreaterOrEqual` | ค่าลบ, `l > r` → branch **true** |
| `testLessThan_ReturnsFalse` | `l < r` → branch **false** |
| `testNegativeNumbers_Less` | ค่าลบ, `l < r` → branch **false** |
| `testStringNumericGreater_ReturnsTrue` | อินพุตเป็น String ที่แปลงได้, branch **true** |
| `testStringNumericEqual_ReturnsTrue` | String ค่าเท่ากัน (boundary) → branch **true** |
| `testStringNumericLess_ReturnsFalse` | String, branch **false** |
| `testMalformedStringBothSides_ReturnsFalse` | อินพุตผิดรูปแบบทั้งสองฝั่ง (NaN >= NaN) → branch **false** (ไม่ยืนยัน 100% จากซอร์ส) |
| `testMalformedStringOneSide_ReturnsFalse` | อินพุตผิดรูปแบบฝั่งเดียว → branch **false** |
| `testEmptyStringArgument_ReturnsFalse` | ค่าว่าง (edge case ของ malformed) → branch **false** |
| `testGetSymbol_ReturnsCorrectSymbol` | ครอบคลุม method `getSymbol()` (statement coverage) |
| `testResultIsBooleanTrueSingleton` | ยืนยันค่าที่คืนเป็น `Boolean.TRUE` singleton ตามซอร์ส |
| `testResultIsBooleanFalseSingleton` | ยืนยันค่าที่คืนเป็น `Boolean.FALSE` singleton ตามซอร์ส |
| `testConstructorArgumentOrderAffectsResult` | ยืนยัน constructor เก็บ `args[0]`/`args[1]` ถูกตำแหน่ง ครอบคลุมทั้งสอง branch ในชุดเดียว |

**หมายเหตุรวม**: ทุก branch ของ ternary operator (`l >= r ? TRUE : FALSE`) ถูกครอบคลุมทั้งสองทาง (true/false) ผ่านหลาย test cases ข้างต้น ส่วนกรณี malformed/empty string มีคอมเมนต์กำกับชัดเจนว่าอ้างอิงพฤติกรรมทั่วไปที่คาดการณ์ได้ ไม่ใช่ข้อยืนยันจากซอร์สที่ให้มาโดยตรง เพื่อให้สามารถ "ดักจับ fault" ได้หากพฤติกรรมจริงต่างไป