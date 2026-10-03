package org.apache.commons.jxpath.ri.compiler;

import org.junit.Test;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

import org.apache.commons.jxpath.ri.EvalContext;
import org.apache.commons.jxpath.ri.axes.InitialContext;
import org.apache.commons.jxpath.ri.axes.SelfContext;
import org.apache.commons.jxpath.ri.RootContext;
import org.apache.commons.jxpath.JXPathContext;
import org.apache.commons.jxpath.Pointer;

public class CoreOperationCompareTest {

    // Concrete subclass for testing protected methods of CoreOperationCompare
    private static class TestableCoreOperationCompare extends CoreOperationCompare {
        public TestableCoreOperationCompare(Expression arg1, Expression arg2) {
            super(arg1, arg2);
        }

        public boolean publicEqual(EvalContext context, Expression left, Expression right) {
            return equal(context, left, right);
        }

        public boolean publicEqualObjects(Object l, Object r) {
            return equal(l, r);
        }

        public boolean publicContains(Iterator it, Object value) {
            return contains(it, value);
        }

        public boolean publicFindMatch(Iterator lit, Iterator rit) {
            return findMatch(lit, rit);
        }
    }

    // Stub Expression for compute mocking
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

    private EvalContext createDummyContext() {
        JXPathContext jxpathContext = JXPathContext.newContext(new Object());
        RootContext rootContext = new RootContext(jxpathContext, null);
        return new InitialContext(rootContext);
    }

    @Test
    public void testInitialAndSelfContextUnwrapping() {
        EvalContext context = createDummyContext();
        InitialContext initCtx = new InitialContext(context);
        SelfContext selfCtx = new SelfContext(initCtx, null);

        TestableCoreOperationCompare comp = new TestableCoreOperationCompare(
            new ConstantExpression(initCtx),
            new ConstantExpression(selfCtx)
        );

        // Should unwrap InitialContext and SelfContext to node pointers / values safely
        boolean result = comp.publicEqual(context, comp.getArgument(0), comp.getArgument(1));
        assertFalse(result); // Pointers/values will likely be null or unequal
    }

    @Test
    public void testCollectionAndIteratorLeftOnly() {
        EvalContext context = createDummyContext();
        List<String> list = new ArrayList<String>();
        list.add("test");

        TestableCoreOperationCompare comp = new TestableCoreOperationCompare(
            new ConstantExpression(list),
            new ConstantExpression("test")
        );

        assertTrue(comp.publicEqual(context, comp.getArgument(0), comp.getArgument(1)));
    }

    @Test
    public void testCollectionAndIteratorRightOnly() {
        EvalContext context = createDummyContext();
        List<String> list = new ArrayList<String>();
        list.add("test");

        TestableCoreOperationCompare comp = new TestableCoreOperationCompare(
            new ConstantExpression("test"),
            new ConstantExpression(list)
        );

        assertTrue(comp.publicEqual(context, comp.getArgument(0), comp.getArgument(1)));
    }

    @Test
    public void testBothIteratorsMatch() {
        EvalContext context = createDummyContext();
        List<String> list1 = new ArrayList<String>();
        list1.add("a");
        list1.add("b");

        List<String> list2 = new ArrayList<String>();
        list2.add("b");
        list2.add("c");

        TestableCoreOperationCompare comp = new TestableCoreOperationCompare(
            new ConstantExpression(list1),
            new ConstantExpression(list2)
        );

        assertTrue(comp.publicEqual(context, comp.getArgument(0), comp.getArgument(1)));
    }

    @Test
    public void testBothIteratorsNoMatch() {
        EvalContext context = createDummyContext();
        List<String> list1 = new ArrayList<String>();
        list1.add("a");

        List<String> list2 = new ArrayList<String>();
        list2.add("b");

        TestableCoreOperationCompare comp = new TestableCoreOperationCompare(
            new ConstantExpression(list1),
            new ConstantExpression(list2)
        );

        assertFalse(comp.publicEqual(context, comp.getArgument(0), comp.getArgument(1)));
    }

    @Test
    public void testObjectEqualReferenceAndNull() {
        TestableCoreOperationCompare comp = new TestableCoreOperationCompare(null, null);

        // Same reference
        String str = "hello";
        assertTrue(comp.publicEqualObjects(str, str));

        // Both null
        assertTrue(comp.publicEqualObjects(null, null));

        // Left null, Right not null
        assertFalse(comp.publicEqualObjects(null, "hello"));

        // Left not null, Right null
        assertFalse(comp.publicEqualObjects("hello", null));
    }

    @Test
    public void testBooleanComparison() {
        TestableCoreOperationCompare comp = new TestableCoreOperationCompare(null, null);

        assertTrue(comp.publicEqualObjects(Boolean.TRUE, Boolean.TRUE));
        assertFalse(comp.publicEqualObjects(Boolean.TRUE, Boolean.FALSE));
        assertTrue(comp.publicEqualObjects(Boolean.TRUE, "true")); // InfoSetUtil conversion
    }

    @Test
    public void testNumberComparison() {
        TestableCoreOperationCompare comp = new TestableCoreOperationCompare(null, null);

        assertTrue(comp.publicEqualObjects(Integer.valueOf(5), Double.valueOf(5.0)));
        assertFalse(comp.publicEqualObjects(Integer.valueOf(5), Double.valueOf(6.0)));
        assertTrue(comp.publicEqualObjects(Integer.valueOf(10), "10")); // InfoSetUtil conversion
    }

    @Test
    public void testStringComparison() {
        TestableCoreOperationCompare comp = new TestableCoreOperationCompare(null, null);

        assertTrue(comp.publicEqualObjects("abc", "abc"));
        assertFalse(comp.publicEqualObjects("abc", "def"));
        assertTrue(comp.publicEqualObjects("123", Integer.valueOf(123))); // InfoSetUtil conversion
    }

    @Test
    public void testContainsAndFindMatchDirectly() {
        TestableCoreOperationCompare comp = new TestableCoreOperationCompare(null, null);

        List<String> list = new ArrayList<String>();
        list.add("item1");
        list.add("item2");

        assertTrue(comp.publicContains(list.iterator(), "item2"));
        assertFalse(comp.publicContains(list.iterator(), "item3"));

        List<String> list2 = new ArrayList<String>();
        list2.add("item2");
        list2.add("item4");

        assertTrue(comp.publicFindMatch(list.iterator(), list2.iterator()));
        
        List<String> list3 = new ArrayList<String>();
        list3.add("item9");
        assertFalse(comp.publicFindMatch(list.iterator(), list3.iterator()));
    }
}