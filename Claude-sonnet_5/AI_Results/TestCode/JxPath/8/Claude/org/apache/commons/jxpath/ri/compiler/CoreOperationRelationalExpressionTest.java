package org.apache.commons.jxpath.ri.compiler;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

import org.apache.commons.jxpath.ri.EvalContext;
import org.junit.Test;

/**
 * Unit tests for {@link CoreOperationRelationalExpression}.
 *
 * หมายเหตุ: บาง branch (instanceof InitialContext / instanceof SelfContext ใน
 * compute()/reduce()) ไม่ได้ถูกทดสอบด้วย instance จริง เนื่องจากไม่มี source
 * ของ InitialContext/SelfContext/EvalContext ให้วิเคราะห์ constructor ที่แท้จริง
 * การสร้าง instance เหล่านี้แบบเดา ๆ จะขัดกับข้อกำหนดห้ามเดา behavior
 * จึงเว้น branch เหล่านี้ไว้พร้อมคอมเมนต์กำกับตามข้อกำหนดที่ 4
 */
public class CoreOperationRelationalExpressionTest {

    // ---------------------------------------------------------------
    // Helper Expression stub: คืนค่าคงที่ตามที่กำหนด (ไม่สนใจ EvalContext)
    // อิงรูปแบบเดียวกับคลาส Constant ที่มีอยู่จริงในแพ็กเกจเดียวกัน
    // ซึ่ง override เฉพาะ computeValue(EvalContext) เท่านั้น
    // ---------------------------------------------------------------
    private static class ValueExpression extends Expression {
        private final Object value;

        ValueExpression(Object value) {
            this.value = value;
        }

        public Object computeValue(EvalContext context) {
            return value;
        }
    }

    private static Expression expr(Object value) {
        return new ValueExpression(value);
    }

    // ---------------------------------------------------------------
    // Concrete operator subclasses ตามที่ JavaDoc ของคลาสเป้าหมายระบุไว้
    // ชัดเจนว่าใช้สำหรับ >, >=, <, <=
    // เพิ่ม getSymbol() เผื่อ CoreOperation มี abstract method นี้
    // (ถ้าไม่มีจริง เมธอดนี้จะเป็นเพียงเมธอดเพิ่มเติมที่ไม่ส่งผลเสีย)
    // ---------------------------------------------------------------
    private static class LessThan extends CoreOperationRelationalExpression {
        LessThan(Expression[] args) { super(args); }
        protected boolean evaluateCompare(int compare) { return compare < 0; }
        public String getSymbol() { return "<"; }
    }

    private static class LessOrEqual extends CoreOperationRelationalExpression {
        LessOrEqual(Expression[] args) { super(args); }
        protected boolean evaluateCompare(int compare) { return compare <= 0; }
        public String getSymbol() { return "<="; }
    }

    private static class GreaterThan extends CoreOperationRelationalExpression {
        GreaterThan(Expression[] args) { super(args); }
        protected boolean evaluateCompare(int compare) { return compare > 0; }
        public String getSymbol() { return ">"; }
    }

    private static class GreaterOrEqual extends CoreOperationRelationalExpression {
        GreaterOrEqual(Expression[] args) { super(args); }
        protected boolean evaluateCompare(int compare) { return compare >= 0; }
        public String getSymbol() { return ">="; }
    }

    // =================================================================
    // 1) Numeric comparisons: ld==rd / ld<rd / else(ld>rd) branch
    // =================================================================

    @Test
    public void testLessThan_NumericLess() {
        LessThan op = new LessThan(new Expression[]{ expr(new Double(1)), expr(new Double(2)) });
        assertSame(Boolean.TRUE, op.computeValue(null));
    }

    @Test
    public void testLessThan_NumericEqual() {
        LessThan op = new LessThan(new Expression[]{ expr(new Double(2)), expr(new Double(2)) });
        assertSame(Boolean.FALSE, op.computeValue(null));
    }

    @Test
    public void testLessThan_NumericGreater() {
        LessThan op = new LessThan(new Expression[]{ expr(new Double(3)), expr(new Double(2)) });
        assertSame(Boolean.FALSE, op.computeValue(null));
    }

    @Test
    public void testLessOrEqual_Equal_BoundaryTrue() {
        LessOrEqual op = new LessOrEqual(new Expression[]{ expr(new Double(2)), expr(new Double(2)) });
        assertSame(Boolean.TRUE, op.computeValue(null));
    }

    @Test
    public void testGreaterThan_Greater() {
        GreaterThan op = new GreaterThan(new Expression[]{ expr(new Double(5)), expr(new Double(2)) });
        assertSame(Boolean.TRUE, op.computeValue(null));
    }

    @Test
    public void testGreaterThan_Equal_BoundaryFalse() {
        GreaterThan op = new GreaterThan(new Expression[]{ expr(new Double(2)), expr(new Double(2)) });
        assertSame(Boolean.FALSE, op.computeValue(null));
    }

    @Test
    public void testGreaterOrEqual_Equal_BoundaryTrue() {
        GreaterOrEqual op = new GreaterOrEqual(new Expression[]{ expr(new Double(2)), expr(new Double(2)) });
        assertSame(Boolean.TRUE, op.computeValue(null));
    }

    @Test
    public void testGreaterOrEqual_Less_False() {
        GreaterOrEqual op = new GreaterOrEqual(new Expression[]{ expr(new Double(1)), expr(new Double(2)) });
        assertSame(Boolean.FALSE, op.computeValue(null));
    }

    @Test
    public void testLessThan_StringNumbers() {
        // ตาม XPath spec string ที่เป็นตัวเลขจะถูกแปลงเป็น number ได้ (พฤติกรรมมาตรฐานของ InfoSetUtil)
        LessThan op = new LessThan(new Expression[]{ expr("1"), expr("2") });
        assertSame(Boolean.TRUE, op.computeValue(null));
    }

    @Test
    public void testNaNComparison_FallsToElseBranch() {
        // อนุมานจาก source ตรง ๆ: NaN==NaN -> false, NaN<rd -> false จึง compare=1 (else branch)
        GreaterThan op = new GreaterThan(new Expression[]{ expr(new Double(Double.NaN)), expr(new Double(5)) });
        assertSame(Boolean.TRUE, op.computeValue(null));
    }

    // ---- Input ผิดรูปแบบ / null : ไม่ assert ค่าผลลัพธ์ที่แน่นอน
    // เพราะพฤติกรรมของ InfoSetUtil.doubleValue สำหรับ non-numeric/null
    // ไม่ได้ให้ source มาวิเคราะห์ -> ตรวจเฉพาะว่าไม่ throw และคืน Boolean ----

    @Test
    public void testNonNumericString_DoesNotThrow() {
        LessThan op = new LessThan(new Expression[]{ expr("abc"), expr("2") });
        Object result = op.computeValue(null);
        assertTrue(result instanceof Boolean);
    }

    @Test
    public void testNullOperand_DoesNotThrowAndReturnsBoolean() {
        LessThan op = new LessThan(new Expression[]{ expr(null), expr(new Double(1)) });
        Object result = op.computeValue(null);
        assertTrue(result instanceof Boolean);
    }

    // =================================================================
    // 2) left && right เป็น Iterator ทั้งคู่ -> findMatch()
    // =================================================================

    @Test
    public void testBothIterators_MatchFoundOnSecondElement() {
        // ครอบคลุม: first while (>=1 รอบ), second while หลายรอบ,
        // if(containsMatch) = false แล้ว continue, และ = true แล้ว return
        List<Double> left = new ArrayList<Double>();
        left.add(new Double(1));
        left.add(new Double(5));
        List<Double> right = new ArrayList<Double>();
        right.add(new Double(10)); // ไม่มี left ใด > 10 -> false, loop ต่อ
        right.add(new Double(3));  // 5 > 3 -> true, return true
        GreaterThan op = new GreaterThan(new Expression[]{ expr(left.iterator()), expr(right.iterator()) });
        assertSame(Boolean.TRUE, op.computeValue(null));
    }

    @Test
    public void testBothIterators_NoMatch() {
        List<Double> left = new ArrayList<Double>();
        left.add(new Double(1));
        List<Double> right = new ArrayList<Double>();
        right.add(new Double(10));
        GreaterThan op = new GreaterThan(new Expression[]{ expr(left.iterator()), expr(right.iterator()) });
        assertSame(Boolean.FALSE, op.computeValue(null));
    }

    @Test
    public void testBothIterators_LeftEmpty() {
        // first while: 0 รอบ (left empty) -> containsMatch จะ false เสมอ
        List<Double> left = new ArrayList<Double>();
        List<Double> right = new ArrayList<Double>();
        right.add(new Double(1));
        GreaterThan op = new GreaterThan(new Expression[]{ expr(left.iterator()), expr(right.iterator()) });
        assertSame(Boolean.FALSE, op.computeValue(null));
    }

    @Test
    public void testBothIterators_RightEmpty() {
        // second while: 0 รอบ (right empty) -> findMatch คืน false ทันที
        List<Double> left = new ArrayList<Double>();
        left.add(new Double(1));
        List<Double> right = new ArrayList<Double>();
        GreaterThan op = new GreaterThan(new Expression[]{ expr(left.iterator()), expr(right.iterator()) });
        assertSame(Boolean.FALSE, op.computeValue(null));
    }

    // =================================================================
    // 3) left เป็น Iterator เท่านั้น -> containsMatch(left, right)
    // =================================================================

    @Test
    public void testLeftIterator_ContainsMatch_Found() {
        List<Double> left = new ArrayList<Double>();
        left.add(new Double(1));
        left.add(new Double(5));
        GreaterThan op = new GreaterThan(new Expression[]{ expr(left.iterator()), expr(new Double(3)) });
        assertSame(Boolean.TRUE, op.computeValue(null)); // 5 > 3
    }

    @Test
    public void testLeftIterator_ContainsMatch_NotFound() {
        List<Double> left = new ArrayList<Double>();
        left.add(new Double(1));
        left.add(new Double(2));
        GreaterThan op = new GreaterThan(new Expression[]{ expr(left.iterator()), expr(new Double(10)) });
        assertSame(Boolean.FALSE, op.computeValue(null));
    }

    @Test
    public void testLeftIterator_EmptyLoopZeroIterations() {
        List<Double> left = new ArrayList<Double>();
        GreaterThan op = new GreaterThan(new Expression[]{ expr(left.iterator()), expr(new Double(10)) });
        assertSame(Boolean.FALSE, op.computeValue(null));
    }

    // =================================================================
    // 4) right เป็น Iterator เท่านั้น -> containsMatch(right, left)
    // =================================================================

    @Test
    public void testRightIterator_ContainsMatch_Found() {
        List<Double> right = new ArrayList<Double>();
        right.add(new Double(1));
        right.add(new Double(5));
        LessThan op = new LessThan(new Expression[]{ expr(new Double(3)), expr(right.iterator()) });
        assertSame(Boolean.TRUE, op.computeValue(null)); // 3 < 5
    }

    @Test
    public void testRightIterator_ContainsMatch_NotFound() {
        List<Double> right = new ArrayList<Double>();
        right.add(new Double(1));
        LessThan op = new LessThan(new Expression[]{ expr(new Double(10)), expr(right.iterator()) });
        assertSame(Boolean.FALSE, op.computeValue(null));
    }

    @Test
    public void testRightIterator_EmptyLoopZeroIterations() {
        List<Double> right = new ArrayList<Double>();
        LessThan op = new LessThan(new Expression[]{ expr(new Double(1)), expr(right.iterator()) });
        assertSame(Boolean.FALSE, op.computeValue(null));
    }

    // =================================================================
    // 5) reduce(): instanceof Collection -> true branch (แปลงเป็น Iterator)
    // =================================================================

    @Test
    public void testLeftCollection_ReducedToIterator() {
        HashSet<Double> leftSet = new HashSet<Double>();
        leftSet.add(new Double(5));
        GreaterThan op = new GreaterThan(new Expression[]{ expr(leftSet), expr(new Double(1)) });
        assertSame(Boolean.TRUE, op.computeValue(null));
    }

    @Test
    public void testRightCollection_ReducedToIterator() {
        HashSet<Double> rightSet = new HashSet<Double>();
        rightSet.add(new Double(1));
        GreaterThan op = new GreaterThan(new Expression[]{ expr(new Double(5)), expr(rightSet) });
        assertSame(Boolean.TRUE, op.computeValue(null));
    }

    @Test
    public void testBothCollections_ReducedToIterators() {
        HashSet<Double> leftSet = new HashSet<Double>();
        leftSet.add(new Double(5));
        HashSet<Double> rightSet = new HashSet<Double>();
        rightSet.add(new Double(1));
        GreaterThan op = new GreaterThan(new Expression[]{ expr(leftSet), expr(rightSet) });
        assertSame(Boolean.TRUE, op.computeValue(null));
    }

    // =================================================================
    // 6) reduce(): instanceof Collection -> false branch (ค่าปกติ ไม่ใช่ Collection)
    // ถูกครอบคลุมโดยอัตโนมัติจาก test numeric ทั้งหมดข้างบนแล้ว (left/right เป็น Double/String)
    // =================================================================

    // =================================================================
    // 7) Contract methods: getPrecedence() / isSymmetric() (final, protected)
    // เรียกตรงได้เพราะ test class อยู่ package เดียวกัน
    // =================================================================

    @Test
    public void testGetPrecedence_FixedValue() {
        LessThan op = new LessThan(new Expression[]{ expr(new Double(1)), expr(new Double(2)) });
        assertEquals(3, op.getPrecedence());
    }

    @Test
    public void testIsSymmetric_AlwaysFalse() {
        LessThan op = new LessThan(new Expression[]{ expr(new Double(1)), expr(new Double(2)) });
        assertFalse(op.isSymmetric());
    }

    // =================================================================
    // หมายเหตุ: ไม่ได้เขียนเทสสำหรับ
    //   - compute(): left/right instanceof InitialContext
    //   - reduce():  o instanceof SelfContext
    // เนื่องจาก constructor/internal state ของ InitialContext และ SelfContext
    // ไม่ได้ปรากฏอยู่ในซอร์สโค้ดที่ให้มา การสร้าง instance จริงต้องพึ่งพา
    // EvalContext/NodePointer graph ที่สมบูรณ์ ซึ่งไม่สามารถอนุมานได้อย่างปลอดภัย
    // จึงเว้นไว้ตามข้อกำหนดห้ามเดา behavior ที่ไม่มีอยู่ในซอร์ส
    // =================================================================
}
