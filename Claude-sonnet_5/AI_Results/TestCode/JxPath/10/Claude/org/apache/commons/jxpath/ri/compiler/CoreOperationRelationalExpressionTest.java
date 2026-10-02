package org.apache.commons.jxpath.ri.compiler;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.apache.commons.jxpath.ri.EvalContext;
import org.junit.Test;

/**
 * Unit tests สำหรับ {@link CoreOperationRelationalExpression}
 *
 * ข้อสมมติสำคัญ (เนื่องจากไม่มีซอร์สของคลาสที่เกี่ยวข้องให้มา):
 * 1) สมมติว่า Expression เป็น abstract class ที่มี abstract method หลักคือ
 *    computeValue(EvalContext) และ isContextDependent() ตามที่ปรากฏการใช้งานใน
 *    source ของ CoreOperationRelationalExpression (args[i].computeValue(context))
 * 2) สมมติว่า CoreOperation(Expression[] args) เป็น constructor ที่ CoreOperationRelationalExpression
 *    เรียกผ่าน super(args) และ "ไม่มี" abstract method อื่นที่ต้อง implement เพิ่ม
 *    นอกจาก evaluateCompare(int) เนื่องจากซอร์สที่ให้มาแสดงเพียงเท่านี้
 * 3) สมมติว่า InfoSetUtil.doubleValue(Object) คืนค่า ((Number) o).doubleValue() โดยตรง
 *    เมื่ออินพุตเป็น Double (รวมถึงกรณี NaN) จึงใช้ java.lang.Double ที่มีค่า NaN ตรง ๆ
 *    เพื่อหลีกเลี่ยงการเดา behavior การแปลง String -> double
 * 4) "ไม่ทดสอบ" branch left/right instanceof InitialContext และ SelfContext ใน compute()/reduce()
 *    เนื่องจากไม่มีซอร์สของ org.apache.commons.jxpath.ri.axes.InitialContext/SelfContext
 *    ให้วิเคราะห์ constructor/behavior จริง การสร้าง instance ปลอมจะเป็นการเดา behavior
 *    ที่ไม่มีอยู่ในซอร์ส จึงข้ามตามข้อกำหนด
 */
public class CoreOperationRelationalExpressionTest {

    /** Expression stub ที่คืนค่าคงที่ที่กำหนดไว้ ไม่ขึ้นกับ context (computeValue ไม่ใช้ context) */
    private static class ValueExpression extends Expression {
        private final Object value;

        ValueExpression(Object value) {
            this.value = value;
        }

        public Object computeValue(EvalContext context) {
            return value;
        }

        public boolean isContextDependent() {
            return false;
        }
    }

    /** จำลองตัวดำเนินการ "<" : evaluateCompare คืน true เมื่อ compare < 0 */
    private static class LessThanExpr extends CoreOperationRelationalExpression {
        LessThanExpr(Expression left, Expression right) {
            super(new Expression[] { left, right });
        }

        protected boolean evaluateCompare(int compare) {
            return compare < 0;
        }
    }

    /** จำลองตัวดำเนินการ ">=" : evaluateCompare คืน true เมื่อ compare >= 0 */
    private static class GreaterOrEqualExpr extends CoreOperationRelationalExpression {
        GreaterOrEqualExpr(Expression left, Expression right) {
            super(new Expression[] { left, right });
        }

        protected boolean evaluateCompare(int compare) {
            return compare >= 0;
        }
    }

    private Object invoke(CoreOperationRelationalExpression expr) {
        return expr.computeValue(null);
    }

    // ---------- Numeric comparison branch (ld==rd / ld<rd / ld>rd) ----------

    @Test
    public void testLessThan_True() {
        LessThanExpr expr = new LessThanExpr(
                new ValueExpression(new Double(1.0)),
                new ValueExpression(new Double(2.0)));
        assertEquals(Boolean.TRUE, invoke(expr));
    }

    @Test
    public void testLessThan_FalseGreater() {
        LessThanExpr expr = new LessThanExpr(
                new ValueExpression(new Double(5.0)),
                new ValueExpression(new Double(2.0)));
        assertEquals(Boolean.FALSE, invoke(expr));
    }

    @Test
    public void testLessThan_FalseEqual() {
        LessThanExpr expr = new LessThanExpr(
                new ValueExpression(new Double(3.0)),
                new ValueExpression(new Double(3.0)));
        assertEquals(Boolean.FALSE, invoke(expr));
    }

    @Test
    public void testGreaterOrEqual_TrueEqual() {
        GreaterOrEqualExpr expr = new GreaterOrEqualExpr(
                new ValueExpression(new Double(3.0)),
                new ValueExpression(new Double(3.0)));
        assertEquals(Boolean.TRUE, invoke(expr));
    }

    @Test
    public void testGreaterOrEqual_TrueGreater() {
        GreaterOrEqualExpr expr = new GreaterOrEqualExpr(
                new ValueExpression(new Double(5.0)),
                new ValueExpression(new Double(1.0)));
        assertEquals(Boolean.TRUE, invoke(expr));
    }

    @Test
    public void testGreaterOrEqual_FalseLess() {
        GreaterOrEqualExpr expr = new GreaterOrEqualExpr(
                new ValueExpression(new Double(1.0)),
                new ValueExpression(new Double(5.0)));
        assertEquals(Boolean.FALSE, invoke(expr));
    }

    // ---------- NaN branches (Double.isNaN(ld) / Double.isNaN(rd)) ----------

    @Test
    public void testLeftNaN_ReturnsFalse() {
        LessThanExpr expr = new LessThanExpr(
                new ValueExpression(new Double(Double.NaN)),
                new ValueExpression(new Double(5.0)));
        assertEquals(Boolean.FALSE, invoke(expr));
    }

    @Test
    public void testRightNaN_ReturnsFalse() {
        LessThanExpr expr = new LessThanExpr(
                new ValueExpression(new Double(5.0)),
                new ValueExpression(new Double(Double.NaN)));
        assertEquals(Boolean.FALSE, invoke(expr));
    }

    // ---------- left instanceof Iterator only ----------

    @Test
    public void testLeftIteratorOnly_Match() {
        List leftList = new ArrayList();
        leftList.add(new Double(1.0));
        leftList.add(new Double(5.0));
        LessThanExpr expr = new LessThanExpr(
                new ValueExpression(leftList.iterator()),
                new ValueExpression(new Double(3.0)));
        assertEquals(Boolean.TRUE, invoke(expr));
    }

    @Test
    public void testLeftIteratorOnly_NoMatch() {
        List leftList = new ArrayList();
        leftList.add(new Double(10.0));
        leftList.add(new Double(20.0));
        LessThanExpr expr = new LessThanExpr(
                new ValueExpression(leftList.iterator()),
                new ValueExpression(new Double(3.0)));
        assertEquals(Boolean.FALSE, invoke(expr));
    }

    @Test
    public void testLeftIteratorOnly_EmptyIterator() {
        List leftList = new ArrayList();
        LessThanExpr expr = new LessThanExpr(
                new ValueExpression(leftList.iterator()),
                new ValueExpression(new Double(3.0)));
        assertEquals(Boolean.FALSE, invoke(expr));
    }

    // ---------- right instanceof Iterator only ----------

    @Test
    public void testRightIteratorOnly_Match() {
        List rightList = new ArrayList();
        rightList.add(new Double(1.0));
        rightList.add(new Double(5.0));
        LessThanExpr expr = new LessThanExpr(
                new ValueExpression(new Double(3.0)),
                new ValueExpression(rightList.iterator()));
        assertEquals(Boolean.TRUE, invoke(expr));
    }

    @Test
    public void testRightIteratorOnly_NoMatch() {
        List rightList = new ArrayList();
        rightList.add(new Double(10.0));
        rightList.add(new Double(20.0));
        LessThanExpr expr = new LessThanExpr(
                new ValueExpression(new Double(3.0)),
                new ValueExpression(rightList.iterator()));
        assertEquals(Boolean.FALSE, invoke(expr));
    }

    // ---------- both instanceof Iterator (findMatch) ----------

    @Test
    public void testBothIterators_Match() {
        List leftList = new ArrayList();
        leftList.add(new Double(5.0));
        List rightList = new ArrayList();
        rightList.add(new Double(1.0));
        rightList.add(new Double(10.0));
        LessThanExpr expr = new LessThanExpr(
                new ValueExpression(leftList.iterator()),
                new ValueExpression(rightList.iterator()));
        assertEquals(Boolean.TRUE, invoke(expr));
    }

    @Test
    public void testBothIterators_NoMatch() {
        List leftList = new ArrayList();
        leftList.add(new Double(10.0));
        List rightList = new ArrayList();
        rightList.add(new Double(1.0));
        rightList.add(new Double(2.0));
        LessThanExpr expr = new LessThanExpr(
                new ValueExpression(leftList.iterator()),
                new ValueExpression(rightList.iterator()));
        assertEquals(Boolean.FALSE, invoke(expr));
    }

    @Test
    public void testBothIterators_LeftEmpty() {
        List leftList = new ArrayList();
        List rightList = new ArrayList();
        rightList.add(new Double(1.0));
        LessThanExpr expr = new LessThanExpr(
                new ValueExpression(leftList.iterator()),
                new ValueExpression(rightList.iterator()));
        assertEquals(Boolean.FALSE, invoke(expr));
    }

    @Test
    public void testBothIterators_RightEmpty() {
        List leftList = new ArrayList();
        leftList.add(new Double(1.0));
        List rightList = new ArrayList();
        LessThanExpr expr = new LessThanExpr(
                new ValueExpression(leftList.iterator()),
                new ValueExpression(rightList.iterator()));
        assertEquals(Boolean.FALSE, invoke(expr));
    }

    // ---------- reduce(): instanceof Collection ----------

    @Test
    public void testLeftCollection_ReducedToIteratorThenMatch() {
        List leftList = new ArrayList();
        leftList.add(new Double(1.0));
        LessThanExpr expr = new LessThanExpr(
                new ValueExpression(leftList), // Collection, ไม่ใช่ Iterator
                new ValueExpression(new Double(3.0)));
        assertEquals(Boolean.TRUE, invoke(expr));
    }

    @Test
    public void testRightCollection_ReducedToIteratorThenMatch() {
        List rightList = new ArrayList();
        rightList.add(new Double(1.0));
        LessThanExpr expr = new LessThanExpr(
                new ValueExpression(new Double(3.0)),
                new ValueExpression(rightList));
        assertEquals(Boolean.TRUE, invoke(expr));
    }

    @Test
    public void testBothCollections_ReducedToFindMatch() {
        List leftList = new ArrayList();
        leftList.add(new Double(5.0));
        List rightList = new ArrayList();
        rightList.add(new Double(1.0));
        rightList.add(new Double(10.0));
        LessThanExpr expr = new LessThanExpr(
                new ValueExpression(leftList),
                new ValueExpression(rightList));
        assertEquals(Boolean.TRUE, invoke(expr));
    }

    @Test
    public void testEmptyCollectionLeft() {
        LessThanExpr expr = new LessThanExpr(
                new ValueExpression(Collections.EMPTY_LIST),
                new ValueExpression(new Double(5.0)));
        assertEquals(Boolean.FALSE, invoke(expr));
    }

    // ---------- protected final methods (เข้าถึงได้เพราะอยู่ package เดียวกัน) ----------

    @Test
    public void testGetPrecedence() {
        LessThanExpr expr = new LessThanExpr(
                new ValueExpression(new Double(1.0)),
                new ValueExpression(new Double(2.0)));
        assertEquals(3, expr.getPrecedence());
    }

    @Test
    public void testIsSymmetric() {
        LessThanExpr expr = new LessThanExpr(
                new ValueExpression(new Double(1.0)),
                new ValueExpression(new Double(2.0)));
        assertFalse(expr.isSymmetric());
    }
}
