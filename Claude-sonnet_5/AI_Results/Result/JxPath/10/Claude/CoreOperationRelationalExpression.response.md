# วิเคราะห์และข้อจำกัดสำคัญ

คลาส `CoreOperationRelationalExpression` เป็น `abstract class` ที่ต้องพึ่งพาคลาสร่วมแพ็กเกจหลายตัวที่**ไม่มีซอร์สโค้ดให้มา** ได้แก่ `Expression`, `CoreOperation`, `InfoSetUtil`, `InitialContext`, `SelfContext` ผมจึงต้องตั้งข้อสมมติบางอย่างเพื่อให้ compile ได้ โดยยึดตาม API ที่ปรากฏการใช้งานจริงใน source ที่ให้มาเท่านั้น (ระบุไว้เป็นคอมเมนต์ในโค้ด) และ **งดเว้นการทดสอบ branch ของ `InitialContext`/`SelfContext`** เพราะไม่มีซอร์สให้วิเคราะห์ constructor/behavior ที่แท้จริง (ตามข้อกำหนดข้อ 4)

```java
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
```

## ตารางสรุป Test Method ↔ Branch/Condition ที่ครอบคลุม

| Test Method | Branch / Condition ที่ครอบคลุม |
|---|---|
| testLessThan_True / FalseGreater / FalseEqual | ternary `ld==rd?0:ld<rd?-1:1` ทั้ง 3 กรณี + evaluateCompare(-1) ที่คืน true |
| testGreaterOrEqual_TrueEqual / TrueGreater / FalseLess | evaluateCompare ที่ implement ต่างกัน (>=) ยืนยันว่า compute ส่ง compare value ถูกต้อง |
| testLeftNaN_ReturnsFalse | `if (Double.isNaN(ld)) return false;` = true |
| testRightNaN_ReturnsFalse | `if (Double.isNaN(rd)) return false;` = true (ld ไม่ NaN) |
| testLeftIteratorOnly_Match/NoMatch/EmptyIterator | branch `left instanceof Iterator` (right ไม่ใช่) + containsMatch loop: match/no-match/0 iteration |
| testRightIteratorOnly_Match/NoMatch | branch `right instanceof Iterator` (left ไม่ใช่) + containsMatch loop |
| testBothIterators_Match/NoMatch/LeftEmpty/RightEmpty | branch `left&&right instanceof Iterator` → findMatch, ทั้ง while-loop (lit, rit) กรณี match/no-match/0-iteration ทั้งสองฝั่ง |
| testLeftCollection.../testRightCollection.../testBothCollections... | reduce(): `o instanceof Collection` = true แปลงเป็น Iterator แล้วไหลต่อไปยัง branch Iterator ข้างต้น |
| testEmptyCollectionLeft | reduce() Collection→empty Iterator + containsMatch loop 0 iteration |
| testGetPrecedence | ค่าคงที่ `return 3;` (ช่วยดักจับ mutation) |
| testIsSymmetric | ค่าคงที่ `return false;` (ช่วยดักจับ mutation) |

**หมายเหตุ:** branch `left/right instanceof InitialContext` และ `o instanceof SelfContext` ใน `reduce()`/`compute()` **ไม่ได้ถูกทดสอบ** เนื่องจากไม่มีซอร์สของ `InitialContext`/`SelfContext` ให้วิเคราะห์ constructor และพฤติกรรมจริง การสร้าง stub ปลอมจะเป็นการเดา behavior ที่ไม่มีอยู่ในซอร์ส จึงข้ามตามข้อกำหนดและคอมเมนต์กำกับไว้ในไฟล์โค้ด