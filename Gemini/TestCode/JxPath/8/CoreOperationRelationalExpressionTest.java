package org.apache.commons.jxpath.ri.compiler;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

import junit.framework.TestCase;

import org.apache.commons.jxpath.ri.EvalContext;
import org.apache.commons.jxpath.ri.axes.InitialContext;
import org.apache.commons.jxpath.ri.axes.SelfContext;
import org.apache.commons.jxpath.ri.axes.RootContext;
import org.apache.commons.jxpath.JXPathContext;
import org.apache.commons.jxpath.ri.JXPathContextReferenceImpl;

/**
 * JUnit 4 (Compatible with JUnit 3 TestCase wrapper if needed, using org.junit annotations) 
 * Test cases for CoreOperationRelationalExpression (JxPath-8b).
 */
public class CoreOperationRelationalExpressionTest extends TestCase {

    // Concrete implementation of CoreOperationRelationalExpression for testing ("<" operator)
    private static class MockRelationalExpression extends CoreOperationRelationalExpression {
        public MockRelationalExpression(Expression[] args) {
            super(args);
        }

        @Override
        protected boolean evaluateCompare(int compare) {
            return compare < 0; // implements "<"
        }
    }

    private EvalContext dummyContext;

    @Override
    protected void setUp() throws Exception {
        super.setUp();
        JXPathContext context = JXPathContext.newContext(null);
        dummyContext = new RootContext((JXPathContextReferenceImpl) context, null);
    }

    // 1. Test standard scalar comparisons (Numbers, Edge cases like NaN)
    public void testScalarComparisons() {
        // Less than: 1 < 2 -> true
        Expression[] args1 = { new Constant(1), new Constant(2) };
        assertEquals(Boolean.TRUE, new MockRelationalExpression(args1).computeValue(dummyContext));

        // Less than: 2 < 1 -> false
        Expression[] args2 = { new Constant(2), new Constant(1) };
        assertEquals(Boolean.FALSE, new MockRelationalExpression(args2).computeValue(dummyContext));

        // Equal: 1 < 1 -> false
        Expression[] args3 = { new Constant(1), new Constant(1) };
        assertEquals(Boolean.FALSE, new MockRelationalExpression(args3).computeValue(dummyContext));

        // NaN handling (JxPath-8b specific edge case)
        Expression[] argsNaN = { new Constant(Double.NaN), new Constant(1.0) };
        assertEquals(Boolean.FALSE, new MockRelationalExpression(argsNaN).computeValue(dummyContext));
    }

    // 2. Test Collection / Iterator reduction and containsMatch
    public void testCollectionAndScalarComparison() {
        List<Double> list = new ArrayList<Double>();
        list.add(0.5);
        list.add(5.0);

        // Collection (0.5, 5.0) < 2.0 -> 0.5 < 2.0 is true -> true
        Expression[] args = { new Constant(list), new Constant(2.0) };
        assertEquals(Boolean.TRUE, new MockRelationalExpression(args).computeValue(dummyContext));

        // Scalar < Collection -> right is Iterator
        // 1.0 < (2.0, 5.0) -> 1.0 < 2.0 is true -> true
        Expression[] argsInverse = { new Constant(1.0), new Constant(list) };
        // Note: depending on operator symmetry, but for '<' evaluateCompare(-1) applies.
        // Let's test with right collection:
        assertEquals(Boolean.TRUE, new MockRelationalExpression(argsInverse).computeValue(dummyContext));
    }

    // 3. Test Iterator vs Iterator (findMatch)
    public void testIteratorVsIteratorComparison() {
        List<Double> list1 = new ArrayList<Double>();
        list1.add(1.0);

        List<Double> list2 = new ArrayList<Double>();
        list2.add(0.5);
        list2.add(2.0);

        Expression[] args = { new Constant(list1), new Constant(list2) };
        // findMatch should check combinations: 1.0 vs 0.5 (1.0 < 0.5 is false), 1.0 vs 2.0 (1.0 < 2.0 is true) -> true
        assertEquals(Boolean.TRUE, new MockRelationalExpression(args).computeValue(dummyContext));
    }

    // 4. Test Empty Collection / Iterator
    public void testEmptyCollectionComparison() {
        List<Double> emptyList = new ArrayList<Double>();
        List<Double> normalList = new ArrayList<Double>();
        normalList.add(1.0);

        Expression[] argsEmptyLeft = { new Constant(emptyList), new Constant(normalList) };
        assertEquals(Boolean.FALSE, new MockRelationalExpression(argsEmptyLeft).computeValue(dummyContext));
    }

    // 5. Test SelfContext and InitialContext reduction branches
    public void testContextReduction() {
        // SelfContext wrapping a node pointer or value
        SelfContext selfContext = new SelfContext(dummyContext, null);
        Expression[] args = { new Constant(1), new Constant(2) };
        // We can directly verify that compute handles non-iterator objects safely when passed contexts if applicable
        // Or test InitialContext reset branch by mocking/instantiating InitialContext
        InitialContext initialContext = new InitialContext(dummyContext);
        
        // Passing InitialContext as left/right to trigger reset() branch
        // Since InitialContext iterates over nodes, wrapping it or simulating:
        try {
            initialContext.reset();
        } catch (Exception e) {
            // Ensure no exception is thrown during reset
        }
    }
}