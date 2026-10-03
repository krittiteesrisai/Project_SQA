package org.apache.commons.jxpath.ri.compiler;

import org.apache.commons.jxpath.ri.EvalContext;
import org.apache.commons.jxpath.ri.JXPathContextReferenceImpl;
import org.apache.commons.jxpath.ri.axes.InitialContext;
import org.apache.commons.jxpath.ri.axes.RootContext;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

/**
 * High-coverage JUnit 4 test suite for CoreOperationGreaterThan (Defects4J JxPath-7b).
 * Written by Senior Java Test Automation Engineer.
 */
public class CoreOperationGreaterThanTest {

    private EvalContext createDummyContext() {
        JXPathContextReferenceImpl jxpathContext = new JXPathContextReferenceImpl(null, null, null);
        RootContext rootContext = new RootContext(jxpathContext, null);
        return new InitialContext(rootContext);
    }

    @Test
    public void testGreaterThan_True() {
        // l > r (5 > 2) -> Boolean.TRUE
        Expression arg1 = new Constant(5.0);
        Expression arg2 = new Constant(2.0);
        CoreOperationGreaterThan op = new CoreOperationGreaterThan(arg1, arg2);

        EvalContext context = createDummyContext();
        Object result = op.computeValue(context);

        assertEquals(Boolean.TRUE, result);
    }

    @Test
    public void testGreaterThan_False_LessThan() {
        // l < r (2 > 5) -> Boolean.FALSE
        Expression arg1 = new Constant(2.0);
        Expression arg2 = new Constant(5.0);
        CoreOperationGreaterThan op = new CoreOperationGreaterThan(arg1, arg2);

        EvalContext context = createDummyContext();
        Object result = op.computeValue(context);

        assertEquals(Boolean.FALSE, result);
    }

    @Test
    public void testGreaterThan_False_Equal() {
        // l == r (3 > 3) -> Boolean.FALSE (Boundary Condition)
        Expression arg1 = new Constant(3.0);
        Expression arg2 = new Constant(3.0);
        CoreOperationGreaterThan op = new CoreOperationGreaterThan(arg1, arg2);

        EvalContext context = createDummyContext();
        Object result = op.computeValue(context);

        assertEquals(Boolean.FALSE, result);
    }

    @Test
    public void testGreaterThan_WithNumericStrings() {
        // Testing InfoSetUtil.doubleValue conversion with string representations ("10.5" > "5.5") -> Boolean.TRUE
        Expression arg1 = new Constant("10.5");
        Expression arg2 = new Constant("5.5");
        CoreOperationGreaterThan op = new CoreOperationGreaterThan(arg1, arg2);

        EvalContext context = createDummyContext();
        Object result = op.computeValue(context);

        assertEquals(Boolean.TRUE, result);
    }

    @Test
    public void testGetSymbol() {
        Expression arg1 = new Constant(1.0);
        Expression arg2 = new Constant(1.0);
        CoreOperationGreaterThan op = new CoreOperationGreaterThan(arg1, arg2);

        assertEquals(">", op.getSymbol());
        assertNotNull(op.getArgs());
        assertEquals(2, op.getArgs().length);
    }
}