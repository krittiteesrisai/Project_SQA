package org.apache.commons.jxpath.ri.compiler;

import org.apache.commons.jxpath.Pointer;
import org.apache.commons.jxpath.ri.EvalContext;
import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.ri.axes.InitialContext;
import org.apache.commons.jxpath.ri.axes.RootContext;
import org.apache.commons.jxpath.ri.model.NodePointer;
import org.apache.commons.jxpath.ri.model.beans.BeanPointer;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

import static org.junit.Assert.*;

/**
 * High-coverage JUnit 4 test suite for Expression and its inner iterator classes.
 */
public class ExpressionTest {

    /**
     * Helper concrete implementation of Expression for testing abstract methods.
     */
    private static class DummyExpression extends Expression {
        private final boolean dependentResult;
        private final Object computeResult;
        int computeContextDependentCalls = 0;

        public DummyExpression(boolean dependentResult, Object computeResult) {
            this.dependentResult = dependentResult;
            this.computeResult = computeResult;
        }

        @Override
        public boolean computeContextDependent() {
            computeContextDependentCalls++;
            return dependentResult;
        }

        @Override
        public Object computeValue(EvalContext context) {
            return computeResult;
        }

        @Override
        public Object compute(EvalContext context) {
            return computeResult;
        }
    }

    @Test
    public void testIsContextDependentCaching() {
        DummyExpression expr = new DummyExpression(true, "test");
        
        // First call: evaluates and caches
        assertTrue("First call should evaluate to true", expr.isContextDependent());
        assertEquals(1, expr.computeContextDependentCalls);

        // Second call: uses cache, computeContextDependent should not be called again
        assertTrue("Second call should use cached value", expr.isContextDependent());
        assertEquals("Should not recompute", 1, expr.computeContextDependentCalls);
    }

    @Test
    public void testIterateWithEvalContextResult() {
        // Create a dummy EvalContext to trigger EvalContext branch in iterate()
        EvalContext dummyContext = new InitialContext(new RootContext(null, null));
        DummyExpression expr = new DummyExpression(false, dummyContext);

        Iterator it = expr.iterate(null);
        assertNotNull(it);
        assertTrue(it instanceof Expression.ValueIterator);
    }

    @Test
    public void testIterateWithStandardObjectResult() {
        List<String> list = new ArrayList<String>();
        list.add("item1");
        DummyExpression expr = new DummyExpression(false, list);

        Iterator it = expr.iterate(null);
        assertNotNull(it);
        assertTrue(it.hasNext());
        assertEquals("item1", it.next());
    }

    @Test
    public void testIteratePointersWithNullResult() {
        DummyExpression expr = new DummyExpression(false, null);

        Iterator it = expr.iteratePointers(null);
        assertNotNull(it);
        assertFalse("Null result should return empty list iterator", it.hasNext());
    }

    @Test
    public void testIteratePointersWithEvalContextResult() {
        EvalContext dummyContext = new InitialContext(new RootContext(null, null));
        DummyExpression expr = new DummyExpression(false, dummyContext);

        Iterator it = expr.iteratePointers(null);
        assertNotNull(it);
        // Should return the EvalContext directly since it implements Iterator
        assertSame(dummyContext, it);
    }

    @Test
    public void testIteratePointersWithStandardObjectResult() {
        // Setup root context and locale to prevent NPE when creating NodePointer
        Object rootBean = new Object();
        Locale locale = Locale.US;
        NodePointer rootPointer = NodePointer.newNodePointer(new QName("root"), rootBean, locale);
        RootContext rootContext = new RootContext(null, rootPointer);
        EvalContext evalContext = new InitialContext(rootContext);

        DummyExpression expr = new DummyExpression(false, "stringValue");

        Iterator it = expr.iteratePointers(evalContext);
        assertNotNull(it);
        assertTrue(it instanceof Expression.PointerIterator);
        
        assertTrue(it.hasNext());
        Object nextObj = it.next();
        assertTrue("Should wrap non-Pointer objects into NodePointer", nextObj instanceof Pointer);
    }

    @Test
    public void testPointerIteratorWithExistingPointer() {
        List<Pointer> pointers = new ArrayList<Pointer>();
        Locale locale = Locale.US;
        NodePointer ptr = NodePointer.newNodePointer(new QName("test"), "val", locale);
        pointers.add(ptr);

        Expression.PointerIterator pointerIterator = new Expression.PointerIterator(
                pointers.iterator(), new QName("q"), locale);

        assertTrue(pointerIterator.hasNext());
        Object next = pointerIterator.next();
        // If it's already a Pointer, it should return it as-is without re-wrapping
        assertSame(ptr, next);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testPointerIteratorRemoveThrowsException() {
        Expression.PointerIterator pointerIterator = new Expression.PointerIterator(
                Collections.emptyIterator(), new QName("q"), Locale.US);
        pointerIterator.remove();
    }

    @Test
    public void testValueIteratorWithPointerObject() {
        Locale locale = Locale.US;
        NodePointer ptr = NodePointer.newNodePointer(new QName("test"), "unwrappedValue", locale);
        List<Pointer> pointers = new ArrayList<Pointer>();
        pointers.add(ptr);

        Expression.ValueIterator valueIterator = new Expression.ValueIterator(pointers.iterator());

        assertTrue(valueIterator.hasNext());
        Object val = valueIterator.next();
        assertEquals("unwrappedValue", val);
    }

    @Test
    public void testValueIteratorWithStandardObject() {
        List<String> values = new ArrayList<String>();
        values.add("plainObject");

        Expression.ValueIterator valueIterator = new Expression.ValueIterator(values.iterator());

        assertTrue(valueIterator.hasNext());
        Object val = valueIterator.next();
        assertEquals("plainObject", val);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testValueIteratorRemoveThrowsException() {
        Expression.ValueIterator valueIterator = new Expression.ValueIterator(Collections.emptyIterator());
        valueIterator.remove();
    }
}