package org.apache.commons.jxpath.ri.compiler;

import org.junit.Test;
import static org.junit.Assert.*;

import org.apache.commons.jxpath.ri.EvalContext;
import org.apache.commons.jxpath.ri.JXPathContextReferenceImpl;
import org.apache.commons.jxpath.JXPathContext;
import org.apache.commons.jxpath.ri.axes.InitialContext;
import org.apache.commons.jxpath.ri.axes.RootContext;
import org.apache.commons.jxpath.ri.model.NodePointer;
import org.apache.commons.jxpath.ri.model.beans.BeanPointer;

public class CoreOperationEqualTest {

    private EvalContext createDummyContext() {
        StandardTestBean bean = new StandardTestBean();
        NodePointer ptr = NodePointer.newNodePointer(null, bean, null);
        JXPathContextPointerFactory.init(); // ensure factory
        JXPathContext context = JXPathContext.newContext(bean);
        RootContext rootContext = new RootContext((JXPathContextReferenceImpl) context, ptr);
        return new InitialContext(rootContext);
    }

    @Test
    public void testGetSymbol() {
        Constant c1 = new Constant("a");
        Constant c2 = new Constant("a");
        CoreOperationEqual op = new CoreOperationEqual(c1, c2);
        assertEquals("=", op.getSymbol());
    }

    @Test
    public void testEqualConstantsStringMatch() {
        EvalContext context = createDummyContext();
        Constant c1 = new Constant("testValue");
        Constant c2 = new Constant("testValue");
        CoreOperationEqual op = new CoreOperationEqual(c1, c2);
        
        Object result = op.computeValue(context);
        assertEquals(Boolean.TRUE, result);
    }

    @Test
    public void testEqualConstantsStringNoMatch() {
        EvalContext context = createDummyContext();
        Constant c1 = new Constant("testValue1");
        Constant c2 = new Constant("testValue2");
        CoreOperationEqual op = new CoreOperationEqual(c1, c2);
        
        Object result = op.computeValue(context);
        assertEquals(Boolean.FALSE, result);
    }

    @Test
    public void testEqualConstantsNumberMatch() {
        EvalContext context = createDummyContext();
        Constant c1 = new Constant(new Double(123.45));
        Constant c2 = new Constant(new Double(123.45));
        CoreOperationEqual op = new CoreOperationEqual(c1, c2);
        
        Object result = op.computeValue(context);
        assertEquals(Boolean.TRUE, result);
    }

    @Test
    public void testEqualConstantsNumberNoMatch() {
        EvalContext context = createDummyContext();
        Constant c1 = new Constant(new Double(123.45));
        Constant c2 = new Constant(new Double(543.21));
        CoreOperationEqual op = new CoreOperationEqual(c1, c2);
        
        Object result = op.computeValue(context);
        assertEquals(Boolean.FALSE, result);
    }

    @Test
    public void testEqualBooleanMatch() {
        EvalContext context = createDummyContext();
        Constant c1 = new Constant(Boolean.TRUE);
        Constant c2 = new Constant(Boolean.TRUE);
        CoreOperationEqual op = new CoreOperationEqual(c1, c2);
        
        Object result = op.computeValue(context);
        assertEquals(Boolean.TRUE, result);
    }

    @Test
    public void testEqualBooleanNoMatch() {
        EvalContext context = createDummyContext();
        Constant c1 = new Constant(Boolean.TRUE);
        Constant c2 = new Constant(Boolean.FALSE);
        CoreOperationEqual op = new CoreOperationEqual(c1, c2);
        
        Object result = op.computeValue(context);
        assertEquals(Boolean.FALSE, result);
    }

    @Test
    public void testEqualNullAndNull() {
        EvalContext context = createDummyContext();
        // Variable reference or expression evaluating to null
        VariableReference v1 = new VariableReference("nonExistentVar1");
        VariableReference v2 = new VariableReference("nonExistentVar2");
        CoreOperationEqual op = new CoreOperationEqual(v1, v2);
        
        Object result = op.computeValue(context);
        assertEquals(Boolean.TRUE, result);
    }
}