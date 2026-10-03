package org.apache.commons.jxpath.ri.compiler;

import org.apache.commons.jxpath.ri.EvalContext;
import org.apache.commons.jxpath.ri.axes.InitialContext;
import org.apache.commons.jxpath.ri.axes.RootContext;
import org.apache.commons.jxpath.JXPathContext;
import org.junit.Test;
import static org.junit.Assert.*;

public class CoreOperationLessThanOrEqualTest {

    private EvalContext createDummyContext() {
        JXPathContext context = JXPathContext.newContext(new Object());
        return new InitialContext(new RootContext(context, null));
    }

    @Test
    public void testLessThan() {
        // Test case: l < r (5.0 <= 10.0) -> TRUE
        EvalContext context = createDummyContext();
        Constant arg1 = new Constant(Double.valueOf(5.0));
        Constant arg2 = new Constant(Double.valueOf(10.0));
        CoreOperationLessThanOrEqual op = new CoreOperationLessThanOrEqual(arg1, arg2);

        Object result = op.computeValue(context);
        assertEquals(Boolean.TRUE, result);
    }

    @Test
    public void testEqual() {
        // Test case: l == r (7.5 <= 7.5) -> TRUE (Boundary limit)
        EvalContext context = createDummyContext();
        Constant arg1 = new Constant(Double.valueOf(7.5));
        Constant arg2 = new Constant(Double.valueOf(7.5));
        CoreOperationLessThanOrEqual op = new CoreOperationLessThanOrEqual(arg1, arg2);

        Object result = op.computeValue(context);
        assertEquals(Boolean.TRUE, result);
    }

    @Test
    public void testGreaterThan() {
        // Test case: l > r (12.0 <= 4.0) -> FALSE
        EvalContext context = createDummyContext();
        Constant arg1 = new Constant(Double.valueOf(12.0));
        Constant arg2 = new Constant(Double.valueOf(4.0));
        CoreOperationLessThanOrEqual op = new CoreOperationLessThanOrEqual(arg1, arg2);

        Object result = op.computeValue(context);
        assertEquals(Boolean.FALSE, result);
    }

    @Test
    public void testNegativeNumbers() {
        // Test case: Negative boundaries (-10.0 <= -5.0) -> TRUE
        EvalContext context = createDummyContext();
        Constant arg1 = new Constant(Double.valueOf(-10.0));
        Constant arg2 = new Constant(Double.valueOf(-5.0));
        CoreOperationLessThanOrEqual op = new CoreOperationLessThanOrEqual(arg1, arg2);

        Object result = op.computeValue(context);
        assertEquals(Boolean.TRUE, result);
    }

    @Test
    public void testGetSymbol() {
        // Test case: Verify symbol representation
        Constant arg1 = new Constant(Double.valueOf(1.0));
        Constant arg2 = new Constant(Double.valueOf(2.0));
        CoreOperationLessThanOrEqual op = new CoreOperationLessThanOrEqual(arg1, arg2);

        assertEquals("<=", op.getSymbol());
    }
}