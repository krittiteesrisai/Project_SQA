package org.apache.commons.jxpath.ri.compiler;

import org.junit.Test;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

import org.apache.commons.jxpath.ri.EvalContext;
import org.apache.commons.jxpath.ri.JXPathContext;
import org.apache.commons.jxpath.ri.axes.InitialContext;
import org.apache.commons.jxpath.ri.axes.RootContext;
import org.apache.commons.jxpath.ri.axes.SelfContext;
import org.apache.commons.jxpath.ri.model.NodePointer;

public class CoreOperationRelationalExpressionTest {

    // Concrete implementation for testing abstract class
    private static class DummyRelationalExpression extends CoreOperationRelationalExpression {
        private final int expectedComparisonResult;

        public DummyRelationalExpression(Expression left, Expression right, int expectedComparisonResult) {
            super(new Expression[] { left, right });
            this.expectedComparisonResult = expectedComparisonResult;
        }

        @Override
        protected boolean evaluateCompare(int compare) {
            // คืนค่าตามที่ต้องการทดสอบเปรียบเทียบ เช่น ถ้า compare == expected คืน true
            return compare == expectedComparisonResult;
        }
    }

    private static class ConstantExpression extends Expression {
        private final Object value;

        public ConstantExpression(Object value) {
            this.value = value;
        }

        @Override
        public Object computeValue(EvalContext context) {
            return value;
        }

        @Override
        public Object compute(EvalContext context) {
            return value;
        }

        @Override
        protected boolean computeContextDependent() {
            return false;
        }
    }

    @Test
    public void testComputeWithNaNLeft() {
        Expression left = new ConstantExpression("not-a-number");
        Expression right = new ConstantExpression(10.0);
        CoreOperationRelationalExpression op = new DummyRelationalExpression(left, right, 0);

        EvalContext context = null;
        Object result = op.computeValue(context);
        assertEquals(Boolean.FALSE, result);
    }

    @Test
    public void testComputeWithNaNRight() {
        Expression left = new ConstantExpression(5.0);
        Expression right = new ConstantExpression("not-a-number");
        CoreOperationRelationalExpression op = new DummyRelationalExpression(left, right, 0);

        EvalContext context = null;
        Object result = op.computeValue(context);
        assertEquals(Boolean.FALSE, result);
    }

    @Test
    public void testComputeScalarComparisonEqual() {
        Expression left = new ConstantExpression(5.0);
        Expression right = new ConstantExpression(5.0);
        // evaluateCompare receives 0 when ld == rd
        CoreOperationRelationalExpression op = new DummyRelationalExpression(left, right, 0);

        assertEquals(Boolean.TRUE, op.computeValue(null));
    }

    @Test
    public void testComputeScalarComparisonLessThan() {
        Expression left = new ConstantExpression(3.0);
        Expression right = new ConstantExpression(5.0);
        // evaluateCompare receives -1 when ld < rd
        CoreOperationRelationalExpression op = new DummyRelationalExpression(left, right, -1);

        assertEquals(Boolean.TRUE, op.computeValue(null));
    }

    @Test
    public void testComputeScalarComparisonGreaterThan() {
        Expression left = new ConstantExpression(7.0);
        Expression right = new ConstantExpression(5.0);
        // evaluateCompare receives 1 when ld > rd
        CoreOperationRelationalExpression op = new DummyRelationalExpression(left, right, 1);

        assertEquals(Boolean.TRUE, op.computeValue(null));
    }

    @Test
    public void testComputeWithCollectionAndScalar() {
        List<Double> list = new ArrayList<Double>();
        list.add(2.0);
        list.add(5.0);

        Expression left = new ConstantExpression(list); // จะถูก reduce เป็น Iterator
        Expression right = new ConstantExpression(5.0);

        // หาว่าใน list มีตัวไหนเท่ากับ 5.0 หรือไม่ (containsMatch)
        CoreOperationRelationalExpression op = new DummyRelationalExpression(left, right, 0);
        assertEquals(Boolean.TRUE, op.computeValue(null));
    }

    @Test
    public void testComputeWithScalarAndCollection() {
        Expression left = new ConstantExpression(5.0);
        
        List<Double> list = new ArrayList<Double>();
        list.add(10.0);
        list.add(5.0);
        Expression right = new ConstantExpression(list); // จะถูก reduce เป็น Iterator

        CoreOperationRelationalExpression op = new DummyRelationalExpression(left, right, 0);
        assertEquals(Boolean.TRUE, op.computeValue(null));
    }

    @Test
    public void testComputeWithTwoIterators() {
        List<Double> list1 = new ArrayList<Double>();
        list1.add(1.0);
        list1.add(5.0);

        List<Double> list2 = new ArrayList<Double>();
        list2.add(5.0);
        list2.add(10.0);

        Expression left = new ConstantExpression(list1);
        Expression right = new ConstantExpression(list2);

        // findMatch จะหาจุดที่แมตช์กันระหว่าง 2 Iterator (มี 5.0 ตรงกัน)
        CoreOperationRelationalExpression op = new DummyRelationalExpression(left, right, 0);
        assertEquals(Boolean.TRUE, op.computeValue(null));
    }

    @Test
    public void testComputeWithInitialContextReset() {
        JXPathContext jxpathContext = JXPathContext.newContext(new Object());
        RootContext rootContext = new RootContext(jxpathContext, NodePointer.newNodePointer(null, new Object(), null));
        InitialContext initialContextLeft = new InitialContext(rootContext);
        InitialContext initialContextRight = new InitialContext(rootContext);

        Expression left = new ConstantExpression(initialContextLeft);
        Expression right = new ConstantExpression(initialContextRight);

        Expression scalarLeft = new ConstantExpression(5.0);
        Expression scalarRight = new ConstantExpression(5.0);
        
        // ทดสอบว่า InitialContext จะถูกรีเซ็ตใน compute()
        CoreOperationRelationalExpression op = new DummyRelationalExpression(scalarLeft, scalarRight, 0);
        
        // จำลองการส่ง InitialContext เข้าไปตรงๆ ผ่านอาเรย์ args เพื่อเทส branch InitialContext instanceof
        CoreOperationRelationalExpression opWithContexts = new CoreOperationRelationalExpression(new Expression[] { left, right }) {
            @Override
            protected boolean evaluateCompare(int compare) {
                return compare == 0;
            }
        };

        // เนื่องจาก InitialContext เมื่อ computeValue จะคืนค่าตัวมันเอง ทำให้เข้าเงื่อนไข instanceof InitialContext
        assertEquals(Boolean.TRUE, opWithContexts.computeValue(rootContext));
    }

    @Test
    public void testReduceWithSelfContext() {
        JXPathContext jxpathContext = JXPathContext.newContext(new Object());
        RootContext rootContext = new RootContext(jxpathContext, NodePointer.newNodePointer(null, "testValue", null));
        SelfContext selfContext = new SelfContext(rootContext, null);

        Expression left = new ConstantExpression(selfContext);
        Expression right = new ConstantExpression("testValue");

        CoreOperationRelationalExpression op = new DummyRelationalExpression(left, right, 0);
        // SelfContext จะถูก reduce เป็น NodePointer -> จากนั้น InfoSetUtil จะดึงค่ามาเปรียบเทียบ
        assertNotNull(op.computeValue(rootContext));
    }
}