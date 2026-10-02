package org.apache.commons.jxpath.ri.compiler;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

import org.apache.commons.jxpath.ri.EvalContext;
import org.junit.Test;

/**
 * Unit test สำหรับ {@link CoreOperationRelationalExpression}
 *
 * หมายเหตุสำคัญ (ข้อสมมติฐานที่จำเป็นต่อการ compile):
 * - {@code Expression} เป็น abstract class ที่มี method หลักคือ
 *   {@code computeValue(EvalContext)} และ {@code compute(EvalContext)}
 *   (อ้างอิงจากการเรียกใช้ {@code args[0].compute(context)} ในซอร์สเป้าหมาย)
 *   เราจึง override ทั้งสอง method ใน stub เพื่อความปลอดภัยในการ compile
 *   โดยไม่ใช้ context จริง (ส่ง null ได้เพราะ stub ไม่ใช้ context)
 * - {@code CoreOperationRelationalExpression} มีเพียง {@code evaluateCompare(int)}
 *   เป็น abstract method ที่เหลือให้ subclass implement (ตามซอร์สที่ให้มา
 *   getPrecedence()/isSymmetric() ถูก override เป็น final ไปแล้ว)
 * - พฤติกรรมของ {@code InfoSetUtil.doubleValue(Object)} สำหรับ String ตัวเลข,
 *   null, หรือ Object ที่ไม่ใช่ตัวเลข ไม่มีซอร์สให้มา จึงเขียนทดสอบแบบระวัง
 *   (กำกับด้วยคอมเมนต์) และไม่ assert ผลลัพธ์ที่ไม่แน่ใจ
 * - Branch ที่เกี่ยวกับ {@code InitialContext}/{@code SelfContext}
 *   (การเรียก reset() และการ reduce SelfContext) ไม่ได้ถูกทดสอบ เนื่องจาก
 *   การสร้าง instance จริงต้องพึ่งพา JXPathContext/DOM ที่ซับซ้อนเกินกว่า
 *   จะสร้างได้โดยไม่มี mocking framework ทั่วไปใน classpath ที่กำหนด
 */
public class CoreOperationRelationalExpressionTest {

    // ---------- Test doubles ----------

    /** Expression ที่คืนค่าคงที่ที่กำหนดไว้ ไม่ขึ้นกับ context */
    private static class ConstantExpression extends Expression {
        private final Object value;

        ConstantExpression(Object value) {
            this.value = value;
        }

        public Object computeValue(EvalContext context) {
            return value;
        }

        // override เผื่อ compute() เป็น method ที่ไม่ได้ delegate ไปที่ computeValue()
        public Object compute(EvalContext context) {
            return value;
        }
    }

    private static class LessThan extends CoreOperationRelationalExpression {
        LessThan(Expression[] args) {
            super(args);
        }

        protected boolean evaluateCompare(int compare) {
            return compare < 0;
        }
    }

    private static class LessOrEqual extends CoreOperationRelationalExpression {
        LessOrEqual(Expression[] args) {
            super(args);
        }

        protected boolean evaluateCompare(int compare) {
            return compare <= 0;
        }
    }

    private static class GreaterThan extends CoreOperationRelationalExpression {
        GreaterThan(Expression[] args) {
            super(args);
        }

        protected boolean evaluateCompare(int compare) {
            return compare > 0;
        }
    }

    private static class GreaterOrEqual extends CoreOperationRelationalExpression {
        GreaterOrEqual(Expression[] args) {
            super(args);
        }

        protected boolean evaluateCompare(int compare) {
            return compare >= 0;
        }
    }

    /** ใช้จำลองการเทียบ "เท่ากัน" สำหรับทดสอบ Iterator/Collection branch */
    private static class EqualsZero extends CoreOperationRelationalExpression {
        EqualsZero(Expression[] args) {
            super(args);
        }

        protected boolean evaluateCompare(int compare) {
            return compare == 0;
        }
    }

    private static Expression[] args(Object left, Object right) {
        return new Expression[] { new ConstantExpression(left), new ConstantExpression(right) };
    }

    private static Boolean eval(CoreOperationRelationalExpression op) {
        return (Boolean) op.computeValue(null);
    }

    // ---------- Numeric comparison branches ----------

    @Test
    public void testLessThan_True() {
        assertTrue(eval(new LessThan(args(1.0, 2.0))));
    }

    @Test
    public void testLessThan_FalseWhenEqual() {
        assertFalse(eval(new LessThan(args(2.0, 2.0))));
    }

    @Test
    public void testLessThan_FalseWhenGreater() {
        assertFalse(eval(new LessThan(args(3.0, 2.0))));
    }

    @Test
    public void testLessOrEqual_TrueWhenEqual() {
        assertTrue(eval(new LessOrEqual(args(2.0, 2.0))));
    }

    @Test
    public void testLessOrEqual_TrueWhenLess() {
        assertTrue(eval(new LessOrEqual(args(1.0, 2.0))));
    }

    @Test
    public void testLessOrEqual_FalseWhenGreater() {
        assertFalse(eval(new LessOrEqual(args(3.0, 2.0))));
    }

    @Test
    public void testGreaterThan_True() {
        assertTrue(eval(new GreaterThan(args(5.0, 2.0))));
    }

    @Test
    public void testGreaterThan_FalseWhenEqual() {
        assertFalse(eval(new GreaterThan(args(2.0, 2.0))));
    }

    @Test
    public void testGreaterOrEqual_TrueWhenEqual() {
        assertTrue(eval(new GreaterOrEqual(args(2.0, 2.0))));
    }

    @Test
    public void testGreaterOrEqual_FalseWhenLess() {
        assertFalse(eval(new GreaterOrEqual(args(1.0, 2.0))));
    }

    // ---------- NaN branches ----------

    @Test
    public void testNaNLeftOperand_ReturnsFalse() {
        // "abc" ไม่สามารถแปลงเป็นตัวเลขได้ -> สมมติฐาน: InfoSetUtil.doubleValue คืน NaN
        // (สอดคล้องกับความหมายของฟังก์ชัน number() ใน XPath) -> ผลลัพธ์ต้อง false
        // แม้ operator จะเป็น GreaterThan ซึ่งปรกติ 3 > 2 ควรเป็น true ก็ตาม
        assertFalse(eval(new GreaterThan(args("abc", 2.0))));
    }

    @Test
    public void testNaNRightOperand_ReturnsFalse() {
        assertFalse(eval(new GreaterThan(args(5.0, "xyz"))));
    }

    @Test
    public void testMalformedCustomObjectOperand_ReturnsFalse() {
        // Object ที่ไม่ใช่ตัวเลขและไม่มี toString() เป็นตัวเลข -> คาดว่าได้ NaN เช่นกัน
        Object malformed = new Object() {
            public String toString() {
                return "not-a-number";
            }
        };
        assertFalse(eval(new LessThan(args(malformed, 1.0))));
    }

    // ---------- Iterator branches ----------

    @Test
    public void testBothIteratorsWithIntersection_ReturnsTrue() {
        Iterator left = Arrays.asList(new Double[] { 1.0, 2.0, 3.0 }).iterator();
        Iterator right = Arrays.asList(new Double[] { 5.0, 2.0 }).iterator();
        assertTrue(eval(new EqualsZero(args(left, right))));
    }

    @Test
    public void testBothIteratorsWithoutIntersection_ReturnsFalse() {
        Iterator left = Arrays.asList(new Double[] { 1.0, 3.0 }).iterator();
        Iterator right = Arrays.asList(new Double[] { 5.0, 6.0 }).iterator();
        assertFalse(eval(new EqualsZero(args(left, right))));
    }

    @Test
    public void testBothIteratorsEmpty_ReturnsFalse() {
        Iterator left = new ArrayList().iterator();
        Iterator right = new ArrayList().iterator();
        assertFalse(eval(new EqualsZero(args(left, right))));
    }

    @Test
    public void testLeftIteratorOnly_Match() {
        Iterator left = Arrays.asList(new Double[] { 1.0, 2.0, 3.0 }).iterator();
        assertTrue(eval(new EqualsZero(args(left, 2.0))));
    }

    @Test
    public void testLeftIteratorOnly_NoMatch() {
        Iterator left = Arrays.asList(new Double[] { 1.0, 3.0 }).iterator();
        assertFalse(eval(new EqualsZero(args(left, 2.0))));
    }

    @Test
    public void testRightIteratorOnly_Match() {
        Iterator right = Arrays.asList(new Double[] { 1.0, 2.0, 3.0 }).iterator();
        assertTrue(eval(new EqualsZero(args(2.0, right))));
    }

    @Test
    public void testRightIteratorOnly_NoMatch() {
        Iterator right = Arrays.asList(new Double[] { 1.0, 3.0 }).iterator();
        assertFalse(eval(new EqualsZero(args(2.0, right))));
    }

    // ---------- Collection -> Iterator reduce() branches ----------

    @Test
    public void testLeftCollectionReducedToIterator_Match() {
        HashSet left = new HashSet();
        left.add(2.0);
        left.add(3.0);
        left.add(4.0);
        assertTrue(eval(new EqualsZero(args(left, 3.0))));
    }

    @Test
    public void testRightCollectionReducedToIterator_Match() {
        HashSet right = new HashSet();
        right.add(2.0);
        right.add(3.0);
        assertTrue(eval(new EqualsZero(args(3.0, right))));
    }

    @Test
    public void testEmptyCollectionOperand_ReturnsFalse() {
        // ค่าว่าง (empty collection) -> reduce เป็น iterator ที่ไม่มี element
        // -> containsMatch loop ไม่ทำงานเลย -> false
        List left = new ArrayList();
        assertFalse(eval(new EqualsZero(args(left, 3.0))));
    }

    // ---------- Null operand (defensive, behavior ของ InfoSetUtil ไม่ชัดเจน) ----------

    @Test
    public void testNullOperand_DoesNotThrowUnexpectedException() {
        // หมายเหตุ: พฤติกรรมของ InfoSetUtil.doubleValue(null) ไม่มีอยู่ในซอร์สที่ให้มา
        // จึงไม่ assert ผลลัพธ์ที่แน่นอน เพียงตรวจสอบว่าเส้นทาง reduce()/instanceof
        // ทำงานได้โดยไม่เกิด ClassCastException หรือ error ที่ไม่คาดคิดอื่น ๆ
        // (ยอมรับ NullPointerException หากเกิดขึ้นจริง เนื่องจากไม่ทราบ implementation จริง)
        CoreOperationRelationalExpression op = new LessThan(args(null, 1.0));
        try {
            Object result = op.computeValue(null);
            assertTrue(result instanceof Boolean);
        } catch (NullPointerException acceptablePossibleBehavior) {
            // พฤติกรรมนี้ยอมรับได้เนื่องจากไม่มีซอร์สของ InfoSetUtil ยืนยัน
        }
    }

    // ---------- สมมติฐาน: string ตัวเลขถูกแปลงได้ (เหมือน XPath number()) ----------

    @Test
    public void testStringNumericParsing_Equal() {
        // สมมติฐาน: InfoSetUtil.doubleValue("5") และ ("5.0") แปลงเป็น double ได้ถูกต้อง
        // ซึ่งสอดคล้องกับความหมายทั่วไปของ XPath number(); หากไม่จริงตามนี้
        // test นี้จะ fail และช่วยเผยสมมติฐานที่ผิดพลาด
        assertTrue(eval(new LessOrEqual(args("5", "5.0"))));
    }

    // ---------- Boundary values ----------

    @Test
    public void testBoundaryZeroEquality() {
        // IEEE 754: 0.0 == -0.0 เป็น true
        assertTrue(eval(new LessOrEqual(args(0.0, -0.0))));
        assertFalse(eval(new LessThan(args(0.0, -0.0))));
    }

    @Test
    public void testBoundaryMaxMinDoubleValues() {
        assertTrue(eval(new LessThan(args(Double.MIN_VALUE, Double.MAX_VALUE))));
        assertTrue(eval(new GreaterThan(args(Double.MAX_VALUE, Double.MIN_VALUE))));
    }
}
