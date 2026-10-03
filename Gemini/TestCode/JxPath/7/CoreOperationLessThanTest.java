package org.apache.commons.jxpath.ri.compiler;

import org.apache.commons.jxpath.ri.EvalContext;
import org.apache.commons.jxpath.ri.axes.InitialContext;
import org.apache.commons.jxpath.ri.axes.RootContext;
import org.apache.commons.jxpath.JXPathContext;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * JUnit 4 Test class for CoreOperationLessThan to maximize Branch/Condition Coverage.
 */
public class CoreOperationLessThanTest {

    /**
     * Helper expression to return a constant value during computeValue.
     */
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
        public boolean compute(EvalContext context) {
            return value != null && !(Boolean.FALSE.equals(value));
        }
    }

    private EvalContext createDummyContext() {
        JXPathContext jxpathContext = JXPathContext.newContext(null);
        RootContext rootContext = new RootContext(jxpathContext, null);
        return new InitialContext(rootContext);
    }

    @Test
    public void testGetSymbol() {
        ConstantExpression left = new ConstantExpression(1.0);
        ConstantExpression right = new ConstantExpression(2.0);
        CoreOperationLessThan op = new CoreOperationLessThan(left, right);
        
        assertEquals("<", op.getSymbol());
    }

    @Test
    public void testComputeValueLessThanTrue() {
        // Left (5.0) < Right (10.0) -> TRUE
        ConstantExpression left = new ConstantExpression(5.0);
        ConstantExpression right = new ConstantExpression(10.0);
        CoreOperationLessThan op = new CoreOperationLessThan(left, right);

        EvalContext context = createDummyContext();
        Object result = op.computeValue(context);

        assertEquals(Boolean.TRUE, result);
    }

    @Test
    public void testComputeValueEqualFalse() {
        // Left (10.0) < Right (10.0) -> FALSE (Boundary Condition)
        ConstantExpression left = new ConstantExpression(10.0);
        ConstantExpression right = new ConstantExpression(10.0);
        CoreOperationLessThan op = new CoreOperationLessThan(left, right);

        EvalContext context = createDummyContext();
        Object result = op.computeValue(context);

        assertEquals(Boolean.FALSE, result);
    }

    @Test
    public void testComputeValueGreaterThanFalse() {
        // Left (15.0) < Right (10.0) -> FALSE
        ConstantExpression left = new ConstantExpression(15.0);
        ConstantExpression right = new ConstantExpression(10.0);
        CoreOperationLessThan op = new CoreOperationLessThan(left, right);

        EvalContext context = createDummyContext();
        Object result = op.computeValue(context);

        assertEquals(Boolean.FALSE, result);
    }

    @Test
    public void testComputeValueWithNulls() {
        // Edge Case: Null values handled by InfoSetUtil.doubleValue
        ConstantExpression left = new ConstantExpression(null);
        ConstantExpression right = new ConstantExpression(5.0);
        CoreOperationLessThan op = new CoreOperationLessThan(left, right);

        EvalContext context = createDummyContext();
        Object result = op.computeValue(context);

        // null typically converts to 0.0 or NaN, 0.0 < 5.0 is TRUE
        assertEquals(Boolean.TRUE, result);
    }

    @Test
    public void testComputeValueWithStringNumbers() {
        // Edge Case: String representation of numbers
        ConstantExpression left = new ConstantExpression("3.5");
        ConstantExpression right = new ConstantExpression("4.2");
        CoreOperationLessThan op = new CoreOperationLessThan(left, right);

        EvalContext context = createDummyContext();
        Object result = op.computeValue(context);

        assertEquals(Boolean.TRUE, result);
    }
}