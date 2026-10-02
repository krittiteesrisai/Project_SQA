package org.apache.commons.jxpath.ri.compiler;

import static org.junit.Assert.*;
import org.junit.Test;
import org.apache.commons.jxpath.ri.EvalContext;

/**
 * Unit tests for {@link CoreOperationLessThan}.
 *
 * หมายเหตุสมมติฐานที่จำเป็น (เนื่องจากไม่มีซอร์สของ InfoSetUtil และ Constant ให้ตรวจสอบโดยตรง):
 * 1. สมมติว่า Constant(double) เก็บค่าเป็น Double object และ computeValue(context)
 *    คืนค่านั้นโดยไม่ยุ่งกับ context (พฤติกรรมมาตรฐานของ literal constant ใน JXPath)
 * 2. สมมติว่า InfoSetUtil.doubleValue(Number) คืนค่า double ตรงจาก Number.doubleValue()
 *    ซึ่งเป็นพฤติกรรมพื้นฐานที่คาดหวังได้จากชื่อเมธอด และจำเป็นต่อการทดสอบตรรกะ "<"
 *    ของคลาสเป้าหมายโดยตรง (ไม่มีทางเลี่ยงได้หากต้องการทดสอบ class นี้)
 * 3. ไม่ทดสอบกรณี String ผิดรูปแบบ หรือ args คืนค่า null เนื่องจากไม่มีซอร์สของ
 *    InfoSetUtil ยืนยันพฤติกรรมที่แน่นอน (อาจ throw exception หรือคืน NaN ก็ได้
 *    ไม่สามารถเดาได้ตามข้อกำหนด)
 */
public class CoreOperationLessThanTest {

    // context ไม่ถูกใช้งานจริงภายใน Constant.computeValue ตามสมมติฐานข้อ 1
    // จึงส่ง null ได้โดยไม่เกิด NullPointerException
    private static final EvalContext DUMMY_CONTEXT = null;

    private CoreOperationLessThan createOp(double left, double right) {
        Constant arg1 = new Constant(left);
        Constant arg2 = new Constant(right);
        return new CoreOperationLessThan(arg1, arg2);
    }

    // ---------- Basic TRUE / FALSE branch ----------

    @Test
    public void testLessThan_LeftLessThanRight_ReturnsTrue() {
        CoreOperationLessThan op = createOp(1.0, 2.0);
        Object result = op.computeValue(DUMMY_CONTEXT);
        assertEquals(Boolean.TRUE, result);
        assertSame(Boolean.TRUE, result); // ตรวจว่าอ้างอิง Boolean.TRUE จริง
    }

    @Test
    public void testLessThan_LeftGreaterThanRight_ReturnsFalse() {
        CoreOperationLessThan op = createOp(5.0, 3.0);
        Object result = op.computeValue(DUMMY_CONTEXT);
        assertEquals(Boolean.FALSE, result);
        assertSame(Boolean.FALSE, result);
    }

    // ---------- Boundary: equal values ----------

    @Test
    public void testLessThan_EqualValues_ReturnsFalse_BoundaryCase() {
        CoreOperationLessThan op = createOp(3.0, 3.0);
        assertEquals(Boolean.FALSE, op.computeValue(DUMMY_CONTEXT));
    }

    // ---------- Negative numbers ----------

    @Test
    public void testLessThan_NegativeNumbers_LeftLessThanRight() {
        CoreOperationLessThan op = createOp(-5.0, -1.0);
        assertEquals(Boolean.TRUE, op.computeValue(DUMMY_CONTEXT));
    }

    @Test
    public void testLessThan_NegativeVsPositive() {
        CoreOperationLessThan op = createOp(-1.0, 1.0);
        assertEquals(Boolean.TRUE, op.computeValue(DUMMY_CONTEXT));
    }

    // ---------- Zero boundary ----------

    @Test
    public void testLessThan_ZeroBoundary_EqualZero_ReturnsFalse() {
        CoreOperationLessThan op = createOp(0.0, 0.0);
        assertEquals(Boolean.FALSE, op.computeValue(DUMMY_CONTEXT));
    }

    @Test
    public void testLessThan_NegativeZeroVsPositiveZero_ReturnsFalse() {
        // primitive double: -0.0 < 0.0 เป็น false ตาม IEEE754 (เท่ากันในการเปรียบเทียบ <)
        CoreOperationLessThan op = createOp(-0.0, 0.0);
        assertEquals(Boolean.FALSE, op.computeValue(DUMMY_CONTEXT));
    }

    // ---------- Infinity boundary ----------

    @Test
    public void testLessThan_PositiveInfinityVsFinite_ReturnsFalse() {
        CoreOperationLessThan op = createOp(Double.POSITIVE_INFINITY, 100.0);
        assertEquals(Boolean.FALSE, op.computeValue(DUMMY_CONTEXT));
    }

    @Test
    public void testLessThan_NegativeInfinityVsFinite_ReturnsTrue() {
        CoreOperationLessThan op = createOp(Double.NEGATIVE_INFINITY, 100.0);
        assertEquals(Boolean.TRUE, op.computeValue(DUMMY_CONTEXT));
    }

    @Test
    public void testLessThan_NegativeInfinityVsPositiveInfinity_ReturnsTrue() {
        CoreOperationLessThan op = createOp(Double.NEGATIVE_INFINITY, Double.POSITIVE_INFINITY);
        assertEquals(Boolean.TRUE, op.computeValue(DUMMY_CONTEXT));
    }

    @Test
    public void testLessThan_SameInfinity_ReturnsFalse() {
        CoreOperationLessThan op = createOp(Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY);
        assertEquals(Boolean.FALSE, op.computeValue(DUMMY_CONTEXT));
    }

    // ---------- NaN (ค่าผิดรูปแบบทางคณิตศาสตร์) ----------
    // ตาม IEEE754 การเปรียบเทียบ < กับ NaN ต้องเป็น false เสมอ ไม่ว่าค่าอีกฝั่งเป็นอะไร
    // นี่คือกฎของภาษา Java เอง ไม่เกี่ยวกับ InfoSetUtil จึงไม่ถือเป็นการเดา behavior

    @Test
    public void testLessThan_LeftIsNaN_ReturnsFalse() {
        CoreOperationLessThan op = createOp(Double.NaN, 5.0);
        assertEquals(Boolean.FALSE, op.computeValue(DUMMY_CONTEXT));
    }

    @Test
    public void testLessThan_RightIsNaN_ReturnsFalse() {
        CoreOperationLessThan op = createOp(5.0, Double.NaN);
        assertEquals(Boolean.FALSE, op.computeValue(DUMMY_CONTEXT));
    }

    @Test
    public void testLessThan_BothNaN_ReturnsFalse() {
        CoreOperationLessThan op = createOp(Double.NaN, Double.NaN);
        assertEquals(Boolean.FALSE, op.computeValue(DUMMY_CONTEXT));
    }

    // ---------- getSymbol() ----------

    @Test
    public void testGetSymbol_ReturnsLessThanSign() {
        CoreOperationLessThan op = createOp(1.0, 2.0);
        assertEquals("<", op.getSymbol());
    }

    // ---------- Constructor ----------

    @Test
    public void testConstructor_CreatesInstanceSuccessfully() {
        Constant arg1 = new Constant(1.0);
        Constant arg2 = new Constant(2.0);
        CoreOperationLessThan op = new CoreOperationLessThan(arg1, arg2);
        assertNotNull(op);
        assertTrue(op instanceof Expression);
    }
}
