package org.apache.commons.jxpath.ri.compiler;

import org.junit.Test;
import static org.junit.Assert.*;

import org.apache.commons.jxpath.ri.EvalContext;
import org.apache.commons.jxpath.ri.axes.InitialContext;
import org.apache.commons.jxpath.ri.axes.RootContext;
import org.apache.commons.jxpath.ri.JXPathContextReferenceImpl;
import org.apache.commons.jxpath.JXPathContext;

/**
 * JUnit 4 Test class for CoreOperationGreaterThanOrEqual.
 * Achieves high branch/condition coverage and targets potential Defects4J faults.
 */
public class CoreOperationGreaterThanOrEqualTest {

    // Helper Constant Expression class to mock/provide fixed evaluation values
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
        protected int getComputeHierarchy() {
            return 0;
        }
    }

    private EvalContext createDummyContext() {
        JXPathContext jxpathContext = JXPathContext.newContext(null);
        JXPathContextReferenceImpl refContext = (JXPathContextReferenceImpl) jxpathContext;
        RootContext rootContext = new RootContext(refContext, null);
        return new InitialContext(rootContext);
    }

    @Test
    public void testGetSymbol() {
        Expression arg1 = new ConstantExpression(1.0);
        Expression arg2 = new ConstantExpression(1.0);
        CoreOperationGreaterThanOrEqual op = new CoreOperationGreaterThanOrEqual(arg1, arg2);
        
        assertEquals(">=", op.getSymbol());
    }

    @Test
    public void testComputeValueGreaterThan() {
        // Branch: l > r (5.5 >= 2.0 -> TRUE)
        Expression arg1 = new ConstantExpression(5.5);
        Expression arg2 = new ConstantExpression(2.0);
        CoreOperationGreaterThanOrEqual op = new CoreOperationGreaterThanOrEqual(arg1, arg2);
        
        EvalContext context = createDummyContext();
        Object result = op.computeValue(context);
        
        assertEquals(Boolean.TRUE, result);
    }

    @Test
    public void testComputeValueEqual() {
        // Branch: l == r (3.0 >= 3.0 -> TRUE) - Boundary Limit
        Expression arg1 = new ConstantExpression(3.0);
        Expression arg2 = new ConstantExpression(3.0);
        CoreOperationGreaterThanOrEqual op = new CoreOperationGreaterThanOrEqual(arg1, arg2);
        
        EvalContext context = createDummyContext();
        Object result = op.computeValue(context);
        
        assertEquals(Boolean.TRUE, result);
    }

    @Test
    public void testComputeValueLessThan() {
        // Branch: l < r (1.0 >= 4.0 -> FALSE)
        Expression arg1 = new ConstantExpression(1.0);
        Expression arg2 = new ConstantExpression(4.0);
        CoreOperationGreaterThanOrEqual op = new CoreOperationGreaterThanOrEqual(arg1, arg2);
        
        EvalContext context = createDummyContext();
        Object result = op.computeValue(context);
        
        assertEquals(Boolean.FALSE, result);
    }

    @Test
    public void testComputeValueWithNullAndNonNumericEdgeCases() {
        // Edge Case: Null values and String representations handled by InfoSetUtil
        // null typically converts to 0.0 or NaN depending on InfoSetUtil implementation
        Expression arg1 = new ConstantExpression(null);
        Expression arg2 = new ConstantExpression("1");
        CoreOperationGreaterThanOrEqual op = new CoreOperationGreaterThanOrEqual(arg1, arg2);
        
        EvalContext context = createDummyContext();
        Object result = op.computeValue(context);
        
        // null -> 0.0, "1" -> 1.0 => 0.0 >= 1.0 is FALSE
        assertEquals(Boolean.FALSE, result);
    }
    
    @Test
    public void testComputeValueWithNaNAndInfinity() {
        // Boundary Edge Case: Double.NaN and Double.POSITIVE_INFINITY
        Expression arg1 = new ConstantExpression(Double.NaN);
        Expression arg2 = new ConstantExpression(Double.POSITIVE_INFINITY);
        CoreOperationGreaterThanOrEqual op = new CoreOperationGreaterThanOrEqual(arg1, arg2);
        
        EvalContext context = createDummyContext();
        Object result = op.computeValue(context);
        
        // NaN comparisons are generally false in IEEE 754
        assertEquals(Boolean.FALSE, result);
    }
}