package org.apache.commons.jxpath.ri.compiler;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

/**
 * Unit tests for {@link CoreOperationRelationalExpression}.
 *
 * หมายเหตุสมมติฐาน (ไม่ได้อยู่ในซอร์สที่ให้มา แต่จำเป็นต่อการ instantiate abstract class):
 * - CoreOperationLessThan / CoreOperationLessThanOrEqual /
 *   CoreOperationGreaterThan / CoreOperationGreaterThanOrEqual
 *   เป็น concrete subclass ของ CoreOperationRelationalExpression ที่มีอยู่จริงในโปรเจกต์
 *   และมี constructor รูปแบบ (Expression arg1, Expression arg2)
 * - Constant เป็น concrete Expression ที่มี constructor รับ double และ String
 *
 * เราทดสอบเฉพาะ 3 พฤติกรรมที่ "ปรากฏจริง" ในซอร์สของ CoreOperationRelationalExpression:
 *   1) constructor ไม่ throw โดยไม่มีเหตุผล (ไม่มี validation logic ในคลาสนี้)
 *   2) getPrecedence() ต้องคืน 3 เสมอ ไม่ว่า operand จะเป็นอะไร
 *   3) isSymmetric() ต้องคืน false เสมอ ไม่ว่า operand จะเป็นอะไร
 *
 * จะไม่ทดสอบผลลัพธ์ของ computeValue()/compute() เพราะ behavior นั้นไม่ได้แสดงในซอร์สที่ให้มา
 */
public class CoreOperationRelationalExpressionTest {

    private Expression numLeft;
    private Expression numRight;

    @Before
    public void setUp() {
        numLeft = new Constant(1.0);
        numRight = new Constant(2.0);
    }

    // ---------- Helper เพื่อลดโค้ดซ้ำ และบังคับ "contract" ร่วมของทุก subclass ----------
    private void assertRelationalContract(CoreOperationRelationalExpression expr) {
        // getPrecedence() ต้องคงที่ = 3 (ตรงกับ literal ในซอร์ส)
        assertEquals(3, expr.getPrecedence());
        // isSymmetric() ต้องคงที่ = false (ตรงกับ literal ในซอร์ส)
        assertFalse(expr.isSymmetric());
    }

    // ===================== getPrecedence() : ต้องเป็น 3 เสมอ =====================

    @Test
    public void testPrecedence_LessThan() {
        CoreOperationLessThan expr = new CoreOperationLessThan(numLeft, numRight);
        assertEquals(3, expr.getPrecedence());
    }

    @Test
    public void testPrecedence_LessThanOrEqual() {
        CoreOperationLessThanOrEqual expr =
                new CoreOperationLessThanOrEqual(numLeft, numRight);
        assertEquals(3, expr.getPrecedence());
    }

    @Test
    public void testPrecedence_GreaterThan() {
        CoreOperationGreaterThan expr = new CoreOperationGreaterThan(numLeft, numRight);
        assertEquals(3, expr.getPrecedence());
    }

    @Test
    public void testPrecedence_GreaterThanOrEqual() {
        CoreOperationGreaterThanOrEqual expr =
                new CoreOperationGreaterThanOrEqual(numLeft, numRight);
        assertEquals(3, expr.getPrecedence());
    }

    // ===================== isSymmetric() : ต้องเป็น false เสมอ =====================

    @Test
    public void testIsSymmetric_LessThan() {
        CoreOperationLessThan expr = new CoreOperationLessThan(numLeft, numRight);
        assertFalse(expr.isSymmetric());
    }

    @Test
    public void testIsSymmetric_LessThanOrEqual() {
        CoreOperationLessThanOrEqual expr =
                new CoreOperationLessThanOrEqual(numLeft, numRight);
        assertFalse(expr.isSymmetric());
    }

    @Test
    public void testIsSymmetric_GreaterThan() {
        CoreOperationGreaterThan expr = new CoreOperationGreaterThan(numLeft, numRight);
        assertFalse(expr.isSymmetric());
    }

    @Test
    public void testIsSymmetric_GreaterThanOrEqual() {
        CoreOperationGreaterThanOrEqual expr =
                new CoreOperationGreaterThanOrEqual(numLeft, numRight);
        assertFalse(expr.isSymmetric());
    }

    // ===================== Boundary / ค่าพิเศษของ operand =====================

    @Test
    public void testBoundary_NaNOperand() {
        // operand เป็นค่าพิเศษ NaN -> precedence/isSymmetric ต้องไม่ถูกกระทบ
        Expression nan = new Constant(Double.NaN);
        CoreOperationLessThan expr = new CoreOperationLessThan(nan, numRight);
        assertRelationalContract(expr);
    }

    @Test
    public void testBoundary_ZeroOperands() {
        Expression zero1 = new Constant(0.0);
        Expression zero2 = new Constant(0.0);
        CoreOperationGreaterThanOrEqual expr =
                new CoreOperationGreaterThanOrEqual(zero1, zero2);
        assertRelationalContract(expr);
    }

    @Test
    public void testBoundary_EmptyStringOperand() {
        // malformed/edge input: string ว่าง
        Expression empty = new Constant("");
        CoreOperationGreaterThan expr = new CoreOperationGreaterThan(empty, numRight);
        assertRelationalContract(expr);
    }

    @Test
    public void testSameOperandReference() {
        // boundary: arg1 และ arg2 เป็น object เดียวกัน (self comparison)
        CoreOperationLessThanOrEqual expr =
                new CoreOperationLessThanOrEqual(numLeft, numLeft);
        assertRelationalContract(expr);
    }

    // ===================== Null operand (ไม่มี validation logic ในซอร์สที่ให้มา) =====================

    @Test
    public void testNullOperand_FirstArg() {
        // ซอร์สของ constructor ไม่มีการตรวจ null จึงคาดว่าไม่ throw จากคลาสนี้เอง
        CoreOperationLessThan expr = new CoreOperationLessThan(null, numRight);
        assertRelationalContract(expr);
    }

    @Test
    public void testNullOperand_SecondArg() {
        CoreOperationGreaterThan expr = new CoreOperationGreaterThan(numLeft, null);
        assertRelationalContract(expr);
    }

    @Test
    public void testNullOperand_BothArgs() {
        CoreOperationGreaterThanOrEqual expr =
                new CoreOperationGreaterThanOrEqual(null, null);
        assertRelationalContract(expr);
    }

    // ===================== Idempotency (เรียกซ้ำต้องได้ผลเดิม - ดัก mutant ที่มี side-effect) =====================

    @Test
    public void testGetPrecedenceIdempotent() {
        CoreOperationGreaterThan expr = new CoreOperationGreaterThan(numLeft, numRight);
        int first = expr.getPrecedence();
        int second = expr.getPrecedence();
        assertEquals(first, second);
        assertEquals(3, first);
    }

    @Test
    public void testIsSymmetricIdempotent() {
        CoreOperationGreaterThanOrEqual expr =
                new CoreOperationGreaterThanOrEqual(numLeft, numRight);
        boolean first = expr.isSymmetric();
        boolean second = expr.isSymmetric();
        assertEquals(first, second);
        assertFalse(first);
    }

    // ===================== ตรวจ contract ร่วมของทุก subclass แบบวนลูป =====================

    @Test
    public void testContractAcrossAllConcreteSubclasses() {
        CoreOperationRelationalExpression[] exprs = new CoreOperationRelationalExpression[] {
            new CoreOperationLessThan(numLeft, numRight),
            new CoreOperationLessThanOrEqual(numLeft, numRight),
            new CoreOperationGreaterThan(numLeft, numRight),
            new CoreOperationGreaterThanOrEqual(numLeft, numRight)
        };

        for (int i = 0; i < exprs.length; i++) {
            assertRelationalContract(exprs[i]);
            // ตรวจเพิ่มว่าค่า boolean ที่ได้คือ false จริง ๆ (ไม่ใช่ default ของ primitive ที่บังเอิญตรง)
            assertTrue("isSymmetric should strictly be false", exprs[i].isSymmetric() == false);
        }
    }
}
