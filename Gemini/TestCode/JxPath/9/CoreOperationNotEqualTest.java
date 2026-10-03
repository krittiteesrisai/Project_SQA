package org.apache.commons.jxpath.ri.compiler;

import org.junit.Test;
import static org.junit.Assert.*;

import org.apache.commons.jxpath.ri.EvalContext;
import org.apache.commons.jxpath.ri.JXPathContext;
import org.apache.commons.jxpath.ri.axes.InitialContext;
import org.apache.commons.jxpath.ri.axes.RootContext;
import org.apache.commons.jxpath.ri.model.NodePointer;
import org.apache.commons.jxpath.ri.model.beans.BeanPointer;

/**
 * JUnit 4 Test cases for CoreOperationNotEqual to achieve high branch/condition coverage
 * and target potential Defects4J faults in JxPath-9.
 */
public class CoreOperationNotEqualTest {

    private EvalContext createDummyContext() {
        StandardBean bean = new StandardBean("test");
        NodePointer pointer = NodePointer.newChildNodePointer(
                BeanPointer.newNodePointer(null, bean, null), null, bean);
        JXPathContext jxpathContext = JXPathContext.newContext(bean);
        RootContext rootContext = new RootContext(jxpathContext, pointer);
        return new InitialContext(rootContext);
    }

    public static class StandardBean {
        private String name;
        public StandardBean(String name) { this.name = name; }
        public String getName() { return name; }
    }

    @Test
    public void testGetSymbol() {
        Constant arg1 = new Constant("a");
        Constant arg2 = new Constant("b");
        CoreOperationNotEqual op = new CoreOperationNotEqual(arg1, arg2);
        assertEquals("Symbol must be !=", "!=", op.getSymbol());
    }

    @Test
    public void testComputeValueEqualStrings() {
        // arg1 == arg2 ("test" == "test") -> equal returns true -> computeValue returns Boolean.FALSE
        Constant arg1 = new Constant("test");
        Constant arg2 = new Constant("test");
        CoreOperationNotEqual op = new CoreOperationNotEqual(arg1, arg2);
        
        EvalContext context = createDummyContext();
        Object result = op.computeValue(context);
        
        assertEquals(Boolean.FALSE, result);
    }

    @Test
    public void testComputeValueNotEqualStrings() {
        // arg1 != arg2 ("abc" != "xyz") -> equal returns false -> computeValue returns Boolean.TRUE
        Constant arg1 = new Constant("abc");
        Constant arg2 = new Constant("xyz");
        CoreOperationNotEqual op = new CoreOperationNotEqual(arg1, arg2);
        
        EvalContext context = createDummyContext();
        Object result = op.computeValue(context);
        
        assertEquals(Boolean.TRUE, result);
    }

    @Test
    public void testComputeValueWithNumbers() {
        // Numeric comparison: 5 != 10 -> true -> Boolean.TRUE
        Constant arg1 = new Constant(new Double(5));
        Constant arg2 = new Constant(new Double(10));
        CoreOperationNotEqual op = new CoreOperationNotEqual(arg1, arg2);
        
        EvalContext context = createDummyContext();
        Object result = op.computeValue(context);
        
        assertEquals(Boolean.TRUE, result);
    }

    @Test
    public void testComputeValueEqualNumbers() {
        // Numeric comparison: 5 != 5 -> false -> Boolean.FALSE
        Constant arg1 = new Constant(new Double(5));
        Constant arg2 = new Constant(new Double(5));
        CoreOperationNotEqual op = new CoreOperationNotEqual(arg1, arg2);
        
        EvalContext context = createDummyContext();
        Object result = op.computeValue(context);
        
        assertEquals(Boolean.FALSE, result);
    }

    @Test
    public void testComputeValueWithNulls() {
        // Null vs Null -> equal returns true -> Boolean.FALSE
        Constant arg1 = new Constant(null);
        Constant arg2 = new Constant(null);
        CoreOperationNotEqual op = new CoreOperationNotEqual(arg1, arg2);
        
        EvalContext context = createDummyContext();
        Object result = op.computeValue(context);
        
        assertEquals(Boolean.FALSE, result);
    }
}