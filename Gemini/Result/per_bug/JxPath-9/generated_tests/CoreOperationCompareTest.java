package org.apache.commons.jxpath.ri.compiler;

import org.junit.Test;
import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

import org.apache.commons.jxpath.Pointer;
import org.apache.commons.jxpath.ri.EvalContext;
import org.apache.commons.jxpath.ri.axes.InitialContext;
import org.apache.commons.jxpath.ri.axes.SelfContext;
import org.apache.commons.jxpath.ri.axes.RootContext;
import org.apache.commons.jxpath.JXPathContext;
import org.apache.commons.jxpath.ri.QName;

public class CoreOperationCompareTest {

    // Concrete implementation สำหรับทดสอบ CoreOperationCompare
    private static class TestCompareOperation extends CoreOperationCompare {
        public TestCompareOperation(Expression arg1, Expression arg2) {
            super(arg1, arg2);
        }

        public boolean publicEqual(EvalContext context, Expression left, Expression right) {
            return super.equal(context, left, right);
        }

        public boolean publicEqualObjects(Object l, Object r) {
            return super.equal(l, r);
        }
    }

    // Mock Expression ที่คืนค่าคงที่
    private static class ConstantExpression extends Expression {
        private final Object value;
        public ConstantExpression(Object value) {
            this.value = value;
        }
        public Object compute(EvalContext context) {
            return value;
        }
        public Object computeValue(EvalContext context) {
            return value;
        }
        public boolean computeContextDependent() {
            return false;
        }
    }

    @Test
    public void testInitialAndSelfContextBranches() {
        JXPathContext jpathContext = JXPathContext.newContext(new Object());
        RootContext rootContext = new RootContext(jpathContext, null);
        
        InitialContext initContext = new InitialContext(rootContext);
        SelfContext selfContext = new SelfContext(initContext, null);

        TestCompareOperation op = new TestCompareOperation(
            new ConstantExpression(initContext),
            new ConstantExpression(selfContext)
        );

        // ทดสอบเคสที่ l เป็น InitialContext และ r เป็น SelfContext
        boolean result = op.publicEqual(rootContext, op.args[0], op.args[1]);
        assertFalse(result);
    }

    @Test
    public void testCollectionsAndIteratorsBranches() {
        List<String> leftList = Arrays.asList("a", "b");
        List<String> rightList = Arrays.asList("b", "c");

        TestCompareOperation op = new TestCompareOperation(
            new ConstantExpression(leftList),
            new ConstantExpression(rightList)
        );

        // ทั้งคู่เป็น Collection -> แปลงเป็น Iterator และเรียก findMatch (มี "b" ตรงกัน)
        assertTrue(op.publicEqual(null, op.args[0], op.args[1]));

        // ซ้ายเป็น Iterator เดี่ยว, ขวาเป็นค่าปกติ
        TestCompareOperation opIterLeft = new TestCompareOperation(
            new ConstantExpression(leftList.iterator()),
            new ConstantExpression("b")
        );
        assertTrue(opIterLeft.publicEqual(null, opIterLeft.args[0], opIterLeft.args[1]));

        // ขวาเป็น Iterator เดี่ยว, ซ้ายเป็นค่าปกติ
        TestCompareOperation opIterRight = new TestCompareOperation(
            new ConstantExpression("a"),
            new ConstantExpression(leftList.iterator())
        );
        assertTrue(opIterRight.publicEqual(null, opIterRight.args[0], opIterRight.args[1]));
    }

    @Test
    public void testObjectEqualNullAndReferences() {
        TestCompareOperation op = new TestCompareOperation(null, null);

        // l == r (ทั้งคู่เป็น null)
        assertTrue(op.publicEqualObjects(null, null));

        // l == r (Reference เดียวกัน)
        String s = "test";
        assertTrue(op.publicEqualObjects(s, s));
    }

    @Test
    public void testBooleanComparisons() {
        TestCompareOperation op = new TestCompareOperation(null, null);

        assertTrue(op.publicEqualObjects(Boolean.TRUE, Boolean.TRUE));
        assertFalse(op.publicEqualObjects(Boolean.TRUE, Boolean.FALSE));
        // เปรียบเทียบ Boolean กับ Non-Boolean ผ่าน InfoSetUtil
        assertTrue(op.publicEqualObjects(Boolean.TRUE, "true"));
    }

    @Test
    public void testNumberComparisonsAndNaN() {
        TestCompareOperation op = new TestCompareOperation(null, null);

        assertTrue(op.publicEqualObjects(10, 10.0));
        assertFalse(op.publicEqualObjects(10, 20));

        // Edge case: NaN จะต้องไม่เป็นจริงแม้เทียบกับตัวเอง (ตาม IEEE 754 และตรรกะใน JxPath)
        assertFalse(op.publicEqualObjects(Double.NaN, Double.NaN));
        assertFalse(op.publicEqualObjects(Double.NaN, 5.0));
    }

    @Test
    public void testStringComparisons() {
        TestCompareOperation op = new TestCompareOperation(null, null);

        assertTrue(op.publicEqualObjects("hello", "hello"));
        assertFalse(op.publicEqualObjects("hello", "world"));
        // เปรียบเทียบ String กับ Number/อื่นๆ ผ่าน InfoSetUtil
        assertTrue(op.publicEqualObjects("123", 123));
    }

    @Test
    public void testPointerComparisons() {
        JXPathContext jpathContext = JXPathContext.newContext(new Object());
        RootContext rootContext = new RootContext(jpathContext, null);
        InitialContext ptrContext1 = new InitialContext(rootContext);
        InitialContext ptrContext2 = new InitialContext(rootContext);

        TestCompareOperation op = new TestCompareOperation(null, null);

        // ทดสอบ Pointer ทั้งคู่ (ใช้ Pointer จริงจาก JxPath หากเป็นไปได้ หรือทดสอบผ่าน Object fallback)
        assertFalse(op.publicEqualObjects(ptrContext1, ptrContext2));
    }

    @Test
    public void testFallbackEquals() {
        TestCompareOperation op = new TestCompareOperation(null, null);

        Object obj1 = new Object();
        Object obj2 = new Object();

        assertFalse(op.publicEqualObjects(obj1, obj2));
        assertTrue(op.publicEqualObjects(obj1, obj1));
        assertFalse(op.publicEqualObjects(obj1, null));
    }
}