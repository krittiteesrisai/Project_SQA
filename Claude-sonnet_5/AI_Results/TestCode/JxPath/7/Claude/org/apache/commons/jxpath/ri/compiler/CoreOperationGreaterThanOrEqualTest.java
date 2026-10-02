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
