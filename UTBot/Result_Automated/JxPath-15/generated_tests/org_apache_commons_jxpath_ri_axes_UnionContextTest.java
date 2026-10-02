package org.apache.commons.jxpath.ri.axes;

import org.junit.Test;
import org.apache.commons.jxpath.ri.EvalContext;
import java.lang.reflect.InvocationTargetException;
import org.apache.commons.jxpath.BasicNodeSet;
import java.util.ArrayList;
import org.apache.commons.jxpath.ri.model.container.ContainerPointer;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

import static org.junit.Assert.assertEquals;
import static java.lang.reflect.Array.get;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public final class org_apache_commons_jxpath_ri_axes_UnionContextTest {
    ///region Test suites for executable org.apache.commons.jxpath.ri.axes.UnionContext.getDocumentOrder
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #0 for method getDocumentOrder()
    
    /**
    @utbot.classUnderTest {@link UnionContext}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.axes.UnionContext#getDocumentOrder()}
 * @utbot.executesCondition {@code (contexts.length > 1): True}
 * @utbot.returnsFrom {@code return contexts.length > 1 ? 1 : super.getDocumentOrder();}
 *  */
    @Test
    public void testGetDocumentOrder_ContextsLengthGreaterThan1() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException, InvocationTargetException, NoSuchMethodException  {
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray = {null, null};
        UnionContext unionContext = new UnionContext(null, evalContextArray);
        
        int actual = unionContext.getDocumentOrder();
        
        assertEquals(1, actual);
        
        org.apache.commons.jxpath.ri.EvalContext[] unionContextContexts = ((org.apache.commons.jxpath.ri.EvalContext[]) getFieldValue(unionContext, "org.apache.commons.jxpath.ri.axes.UnionContext", "contexts"));
        EvalContext finalUnionContextContexts0 = ((EvalContext) get(unionContextContexts, 0));
        org.apache.commons.jxpath.ri.EvalContext[] unionContextContexts1 = ((org.apache.commons.jxpath.ri.EvalContext[]) getFieldValue(unionContext, "org.apache.commons.jxpath.ri.axes.UnionContext", "contexts"));
        EvalContext finalUnionContextContexts1 = ((EvalContext) get(unionContextContexts1, 1));
        
        assertNull(finalUnionContextContexts0);
        
        assertNull(finalUnionContextContexts1);
    }
    
    /**
    @utbot.classUnderTest {@link UnionContext}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.axes.UnionContext#getDocumentOrder()}
 * @utbot.executesCondition {@code (contexts.length > 1): False}
 * @utbot.returnsFrom {@code return contexts.length > 1 ? 1 : super.getDocumentOrder();}
 *  */
    @Test
    public void testGetDocumentOrder_ContextsLengthLessOrEqual1_1() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException, InvocationTargetException, NoSuchMethodException  {
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray = {null};
        UnionContext unionContext = new UnionContext(null, evalContextArray);
        
        int actual = unionContext.getDocumentOrder();
        
        assertEquals(0, actual);
        
        org.apache.commons.jxpath.ri.EvalContext[] unionContextContexts = ((org.apache.commons.jxpath.ri.EvalContext[]) getFieldValue(unionContext, "org.apache.commons.jxpath.ri.axes.UnionContext", "contexts"));
        EvalContext finalUnionContextContexts0 = ((EvalContext) get(unionContextContexts, 0));
        
        assertNull(finalUnionContextContexts0);
    }
    
    /**
    @utbot.classUnderTest {@link UnionContext}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.axes.UnionContext#getDocumentOrder()}
 * @utbot.executesCondition {@code (contexts.length > 1): False}
 * @utbot.returnsFrom {@code return contexts.length > 1 ? 1 : super.getDocumentOrder();}
 *  */
    @Test
    public void testGetDocumentOrder_ContextsLengthLessOrEqual1() throws Exception  {
        RootContext rootContext = ((RootContext) createInstance("org.apache.commons.jxpath.ri.axes.RootContext"));
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray = {null};
        UnionContext unionContext = new UnionContext(rootContext, evalContextArray);
        
        int actual = unionContext.getDocumentOrder();
        
        assertEquals(0, actual);
        
        org.apache.commons.jxpath.ri.EvalContext[] unionContextContexts = ((org.apache.commons.jxpath.ri.EvalContext[]) getFieldValue(unionContext, "org.apache.commons.jxpath.ri.axes.UnionContext", "contexts"));
        EvalContext finalUnionContextContexts0 = ((EvalContext) get(unionContextContexts, 0));
        
        assertNull(finalUnionContextContexts0);
    }
    
    /**
    @utbot.classUnderTest {@link UnionContext}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.axes.UnionContext#getDocumentOrder()}
 * @utbot.executesCondition {@code (contexts.length > 1): False}
 * @utbot.returnsFrom {@code return contexts.length > 1 ? 1 : super.getDocumentOrder();}
 *  */
    @Test
    public void testGetDocumentOrder_ContextsLengthLessOrEqual1_2() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException, InvocationTargetException, NoSuchMethodException  {
        DescendantContext descendantContext = new DescendantContext(null, false, null);
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray = {null};
        UnionContext unionContext = new UnionContext(descendantContext, evalContextArray);
        
        int actual = unionContext.getDocumentOrder();
        
        assertEquals(1, actual);
        
        org.apache.commons.jxpath.ri.EvalContext[] unionContextContexts = ((org.apache.commons.jxpath.ri.EvalContext[]) getFieldValue(unionContext, "org.apache.commons.jxpath.ri.axes.UnionContext", "contexts"));
        EvalContext finalUnionContextContexts0 = ((EvalContext) get(unionContextContexts, 0));
        
        assertNull(finalUnionContextContexts0);
    }
    
    /**
    @utbot.classUnderTest {@link UnionContext}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.axes.UnionContext#getDocumentOrder()}
 * @utbot.executesCondition {@code (contexts.length > 1): False}
 * @utbot.returnsFrom {@code return contexts.length > 1 ? 1 : super.getDocumentOrder();}
 *  */
    @Test
    public void testGetDocumentOrder_ContextsLengthLessOrEqual1_3() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException, InvocationTargetException, NoSuchMethodException  {
        PrecedingOrFollowingContext precedingOrFollowingContext = new PrecedingOrFollowingContext(null, null, true);
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray = {null};
        UnionContext unionContext = new UnionContext(precedingOrFollowingContext, evalContextArray);
        
        int actual = unionContext.getDocumentOrder();
        
        assertEquals(1, actual);
        
        org.apache.commons.jxpath.ri.EvalContext[] unionContextContexts = ((org.apache.commons.jxpath.ri.EvalContext[]) getFieldValue(unionContext, "org.apache.commons.jxpath.ri.axes.UnionContext", "contexts"));
        EvalContext finalUnionContextContexts0 = ((EvalContext) get(unionContextContexts, 0));
        
        assertNull(finalUnionContextContexts0);
    }
    
    /**
    @utbot.classUnderTest {@link UnionContext}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.axes.UnionContext#getDocumentOrder()}
 * @utbot.executesCondition {@code (contexts.length > 1): False}
 * @utbot.returnsFrom {@code return contexts.length > 1 ? 1 : super.getDocumentOrder();}
 *  */
    @Test
    public void testGetDocumentOrder_ContextsLengthLessOrEqual1_4() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException, InvocationTargetException, NoSuchMethodException  {
        PrecedingOrFollowingContext precedingOrFollowingContext = new PrecedingOrFollowingContext(null, null, false);
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray = {null};
        UnionContext unionContext = new UnionContext(precedingOrFollowingContext, evalContextArray);
        
        int actual = unionContext.getDocumentOrder();
        
        assertEquals(1, actual);
        
        org.apache.commons.jxpath.ri.EvalContext[] unionContextContexts = ((org.apache.commons.jxpath.ri.EvalContext[]) getFieldValue(unionContext, "org.apache.commons.jxpath.ri.axes.UnionContext", "contexts"));
        EvalContext finalUnionContextContexts0 = ((EvalContext) get(unionContextContexts, 0));
        
        assertNull(finalUnionContextContexts0);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #1 for method getDocumentOrder()
    /// 
    /// Common steps:
    /// <pre>
    /// Tests execute conditions:
    ///     {@code (contexts.length > 1): False}
    /// invoke:
    ///     {@link org.apache.commons.jxpath.ri.axes.NodeSetContext#getDocumentOrder()} once
    /// </pre>
    
    /**
    @utbot.classUnderTest {@link UnionContext}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.axes.UnionContext#getDocumentOrder()}
 * @utbot.returnsFrom {@code return contexts.length > 1 ? 1 : super.getDocumentOrder();}
 *  */
    @Test
    public void testGetDocumentOrder_ReturnContextsLengthLessOrEqual1() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException, InvocationTargetException, NoSuchMethodException  {
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray = {null, null};
        UnionContext unionContext = new UnionContext(null, evalContextArray);
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray1 = {null};
        UnionContext unionContext1 = new UnionContext(unionContext, evalContextArray1);
        
        int actual = unionContext1.getDocumentOrder();
        
        assertEquals(1, actual);
        
        org.apache.commons.jxpath.ri.EvalContext[] unionContext1Contexts = ((org.apache.commons.jxpath.ri.EvalContext[]) getFieldValue(unionContext1, "org.apache.commons.jxpath.ri.axes.UnionContext", "contexts"));
        EvalContext finalUnionContext1Contexts0 = ((EvalContext) get(unionContext1Contexts, 0));
        EvalContext unionContext1ParentContext = ((EvalContext) getFieldValue(unionContext1, "org.apache.commons.jxpath.ri.EvalContext", "parentContext"));
        org.apache.commons.jxpath.ri.EvalContext[] unionContext1ParentContextParentContextContexts = ((org.apache.commons.jxpath.ri.EvalContext[]) getFieldValue(unionContext1ParentContext, "org.apache.commons.jxpath.ri.axes.UnionContext", "contexts"));
        EvalContext finalUnionContext1ParentContextContexts0 = ((EvalContext) get(unionContext1ParentContextParentContextContexts, 0));
        EvalContext unionContext1ParentContext1 = ((EvalContext) getFieldValue(unionContext1, "org.apache.commons.jxpath.ri.EvalContext", "parentContext"));
        org.apache.commons.jxpath.ri.EvalContext[] unionContext1ParentContext1ParentContextContexts = ((org.apache.commons.jxpath.ri.EvalContext[]) getFieldValue(unionContext1ParentContext1, "org.apache.commons.jxpath.ri.axes.UnionContext", "contexts"));
        EvalContext finalUnionContext1ParentContextContexts1 = ((EvalContext) get(unionContext1ParentContext1ParentContextContexts, 1));
        
        assertNull(finalUnionContext1Contexts0);
        
        assertNull(finalUnionContext1ParentContextContexts0);
        
        assertNull(finalUnionContext1ParentContextContexts1);
    }
    
    /**
    @utbot.classUnderTest {@link UnionContext}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.axes.UnionContext#getDocumentOrder()}
 * @utbot.returnsFrom {@code return contexts.length > 1 ? 1 : super.getDocumentOrder();}
 *  */
    @Test
    public void testGetDocumentOrder_ReturnContextsLengthLessOrEqual1_1() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException, InvocationTargetException, NoSuchMethodException  {
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray = {null};
        UnionContext unionContext = new UnionContext(null, evalContextArray);
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray1 = {null};
        UnionContext unionContext1 = new UnionContext(unionContext, evalContextArray1);
        
        int actual = unionContext1.getDocumentOrder();
        
        assertEquals(0, actual);
        
        org.apache.commons.jxpath.ri.EvalContext[] unionContext1Contexts = ((org.apache.commons.jxpath.ri.EvalContext[]) getFieldValue(unionContext1, "org.apache.commons.jxpath.ri.axes.UnionContext", "contexts"));
        EvalContext finalUnionContext1Contexts0 = ((EvalContext) get(unionContext1Contexts, 0));
        EvalContext unionContext1ParentContext = ((EvalContext) getFieldValue(unionContext1, "org.apache.commons.jxpath.ri.EvalContext", "parentContext"));
        org.apache.commons.jxpath.ri.EvalContext[] unionContext1ParentContextParentContextContexts = ((org.apache.commons.jxpath.ri.EvalContext[]) getFieldValue(unionContext1ParentContext, "org.apache.commons.jxpath.ri.axes.UnionContext", "contexts"));
        EvalContext finalUnionContext1ParentContextContexts0 = ((EvalContext) get(unionContext1ParentContextParentContextContexts, 0));
        
        assertNull(finalUnionContext1Contexts0);
        
        assertNull(finalUnionContext1ParentContextContexts0);
    }
    
    /**
    @utbot.classUnderTest {@link UnionContext}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.axes.UnionContext#getDocumentOrder()}
 * @utbot.returnsFrom {@code return contexts.length > 1 ? 1 : super.getDocumentOrder();}
 *  */
    @Test
    public void testGetDocumentOrder_ReturnContextsLengthLessOrEqual1_2() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException, InvocationTargetException, NoSuchMethodException  {
        ParentContext parentContext = new ParentContext(null, null);
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray = {null};
        UnionContext unionContext = new UnionContext(parentContext, evalContextArray);
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray1 = {null};
        UnionContext unionContext1 = new UnionContext(unionContext, evalContextArray1);
        
        int actual = unionContext1.getDocumentOrder();
        
        assertEquals(1, actual);
        
        org.apache.commons.jxpath.ri.EvalContext[] unionContext1Contexts = ((org.apache.commons.jxpath.ri.EvalContext[]) getFieldValue(unionContext1, "org.apache.commons.jxpath.ri.axes.UnionContext", "contexts"));
        EvalContext finalUnionContext1Contexts0 = ((EvalContext) get(unionContext1Contexts, 0));
        EvalContext unionContext1ParentContext = ((EvalContext) getFieldValue(unionContext1, "org.apache.commons.jxpath.ri.EvalContext", "parentContext"));
        org.apache.commons.jxpath.ri.EvalContext[] unionContext1ParentContextParentContextContexts = ((org.apache.commons.jxpath.ri.EvalContext[]) getFieldValue(unionContext1ParentContext, "org.apache.commons.jxpath.ri.axes.UnionContext", "contexts"));
        EvalContext finalUnionContext1ParentContextContexts0 = ((EvalContext) get(unionContext1ParentContextParentContextContexts, 0));
        
        assertNull(finalUnionContext1Contexts0);
        
        assertNull(finalUnionContext1ParentContextContexts0);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #2 for method getDocumentOrder()
    
    /**
    @utbot.classUnderTest {@link UnionContext}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.axes.UnionContext#getDocumentOrder()}
 * @utbot.executesCondition {@code (contexts.length > 1): False}
 * @utbot.invokes {@link org.apache.commons.jxpath.ri.axes.NodeSetContext#getDocumentOrder()}
 * @utbot.returnsFrom {@code return contexts.length > 1 ? 1 : super.getDocumentOrder();}
 *  */
    @Test
    public void testGetDocumentOrder_ContextsLengthLessOrEqual1_5() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException, InvocationTargetException, NoSuchMethodException  {
        AncestorContext ancestorContext = new AncestorContext(null, false, null);
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray = {null};
        UnionContext unionContext = new UnionContext(ancestorContext, evalContextArray);
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray1 = {null};
        UnionContext unionContext1 = new UnionContext(unionContext, evalContextArray1);
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray2 = {null};
        UnionContext unionContext2 = new UnionContext(unionContext1, evalContextArray2);
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray3 = {null};
        UnionContext unionContext3 = new UnionContext(unionContext2, evalContextArray3);
        
        int actual = unionContext3.getDocumentOrder();
        
        assertEquals(1, actual);
        
        org.apache.commons.jxpath.ri.EvalContext[] unionContext3Contexts = ((org.apache.commons.jxpath.ri.EvalContext[]) getFieldValue(unionContext3, "org.apache.commons.jxpath.ri.axes.UnionContext", "contexts"));
        EvalContext finalUnionContext3Contexts0 = ((EvalContext) get(unionContext3Contexts, 0));
        EvalContext unionContext3ParentContext = ((EvalContext) getFieldValue(unionContext3, "org.apache.commons.jxpath.ri.EvalContext", "parentContext"));
        org.apache.commons.jxpath.ri.EvalContext[] unionContext3ParentContextParentContextContexts = ((org.apache.commons.jxpath.ri.EvalContext[]) getFieldValue(unionContext3ParentContext, "org.apache.commons.jxpath.ri.axes.UnionContext", "contexts"));
        EvalContext finalUnionContext3ParentContextContexts0 = ((EvalContext) get(unionContext3ParentContextParentContextContexts, 0));
        EvalContext unionContext3ParentContext1 = ((EvalContext) getFieldValue(unionContext3, "org.apache.commons.jxpath.ri.EvalContext", "parentContext"));
        EvalContext unionContext3ParentContext1ParentContextParentContext = ((EvalContext) getFieldValue(unionContext3ParentContext1, "org.apache.commons.jxpath.ri.EvalContext", "parentContext"));
        org.apache.commons.jxpath.ri.EvalContext[] unionContext3ParentContext1ParentContextParentContextParentContextParentContextContexts = ((org.apache.commons.jxpath.ri.EvalContext[]) getFieldValue(unionContext3ParentContext1ParentContextParentContext, "org.apache.commons.jxpath.ri.axes.UnionContext", "contexts"));
        EvalContext finalUnionContext3ParentContextParentContextContexts0 = ((EvalContext) get(unionContext3ParentContext1ParentContextParentContextParentContextParentContextContexts, 0));
        EvalContext unionContext3ParentContext2 = ((EvalContext) getFieldValue(unionContext3, "org.apache.commons.jxpath.ri.EvalContext", "parentContext"));
        EvalContext unionContext3ParentContext2ParentContextParentContext = ((EvalContext) getFieldValue(unionContext3ParentContext2, "org.apache.commons.jxpath.ri.EvalContext", "parentContext"));
        EvalContext unionContext3ParentContext2ParentContextParentContextParentContextParentContextParentContext = ((EvalContext) getFieldValue(unionContext3ParentContext2ParentContextParentContext, "org.apache.commons.jxpath.ri.EvalContext", "parentContext"));
        org.apache.commons.jxpath.ri.EvalContext[] unionContext3ParentContext2ParentContextParentContextParentContextParentContextParentContextParentContextParentContextParentContextContexts = ((org.apache.commons.jxpath.ri.EvalContext[]) getFieldValue(unionContext3ParentContext2ParentContextParentContextParentContextParentContextParentContext, "org.apache.commons.jxpath.ri.axes.UnionContext", "contexts"));
        EvalContext finalUnionContext3ParentContextParentContextParentContextContexts0 = ((EvalContext) get(unionContext3ParentContext2ParentContextParentContextParentContextParentContextParentContextParentContextParentContextParentContextContexts, 0));
        
        assertNull(finalUnionContext3Contexts0);
        
        assertNull(finalUnionContext3ParentContextContexts0);
        
        assertNull(finalUnionContext3ParentContextParentContextContexts0);
        
        assertNull(finalUnionContext3ParentContextParentContextParentContextContexts0);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getDocumentOrder()
    
    /**
    @utbot.classUnderTest {@link UnionContext}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.axes.UnionContext#getDocumentOrder()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: contexts.length > 1
 *  */
    @Test
    public void testGetDocumentOrder_ThrowNullPointerException() {
        UnionContext unionContext = new UnionContext(null, null);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.axes.UnionContext.getDocumentOrder] produces [java.lang.NullPointerException]
            org.apache.commons.jxpath.ri.axes.UnionContext.getDocumentOrder(UnionContext.java:42) */
        unionContext.getDocumentOrder();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.jxpath.ri.axes.UnionContext.setPosition
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setPosition(int)
    
    /**
    @utbot.classUnderTest {@link UnionContext}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.axes.UnionContext#setPosition(int)}
 * @utbot.executesCondition {@code (!prepared): False}
 * @utbot.returnsFrom {@code return super.setPosition(position);}
 *  */
    @Test
    public void testSetPosition_Prepared() throws Exception  {
        UnionContext unionContext = ((UnionContext) createInstance("org.apache.commons.jxpath.ri.axes.UnionContext"));
        setField(unionContext, "org.apache.commons.jxpath.ri.axes.UnionContext", "prepared", true);
        setField(unionContext, "org.apache.commons.jxpath.ri.EvalContext", "position", -255);
        
        boolean actual = unionContext.setPosition(0);
        
        assertFalse(actual);
        
        int finalUnionContextPosition = ((Integer) getFieldValue(unionContext, "org.apache.commons.jxpath.ri.EvalContext", "position"));
        
        assertEquals(0, finalUnionContextPosition);
    }
    
    /**
    @utbot.classUnderTest {@link UnionContext}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.axes.UnionContext#setPosition(int)}
 * @utbot.executesCondition {@code (!prepared): False}
 * @utbot.returnsFrom {@code return super.setPosition(position);}
 *  */
    @Test
    public void testSetPosition_Prepared_1() throws Exception  {
        UnionContext unionContext = ((UnionContext) createInstance("org.apache.commons.jxpath.ri.axes.UnionContext"));
        setField(unionContext, "org.apache.commons.jxpath.ri.axes.UnionContext", "prepared", true);
        BasicNodeSet nodeSet = ((BasicNodeSet) createInstance("org.apache.commons.jxpath.BasicNodeSet"));
        ArrayList readOnlyPointers = new ArrayList();
        setField(nodeSet, "org.apache.commons.jxpath.BasicNodeSet", "readOnlyPointers", readOnlyPointers);
        setField(unionContext, "org.apache.commons.jxpath.ri.axes.NodeSetContext", "nodeSet", nodeSet);
        setField(unionContext, "org.apache.commons.jxpath.ri.EvalContext", "position", -255);
        
        boolean actual = unionContext.setPosition(1);
        
        assertFalse(actual);
        
        int finalUnionContextPosition = ((Integer) getFieldValue(unionContext, "org.apache.commons.jxpath.ri.EvalContext", "position"));
        
        assertEquals(1, finalUnionContextPosition);
    }
    
    /**
    @utbot.classUnderTest {@link UnionContext}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.axes.UnionContext#setPosition(int)}
 * @utbot.executesCondition {@code (!prepared): True}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < contexts.length; i++)} once
 * @utbot.returnsFrom {@code return super.setPosition(position);}
 *  */
    @Test
    public void testSetPosition_NotPrepared() throws Exception  {
        UnionContext unionContext = ((UnionContext) createInstance("org.apache.commons.jxpath.ri.axes.UnionContext"));
        org.apache.commons.jxpath.ri.EvalContext[] contexts = {};
        setField(unionContext, "org.apache.commons.jxpath.ri.axes.UnionContext", "contexts", contexts);
        
        boolean actual = unionContext.setPosition(0);
        
        assertFalse(actual);
        
        boolean finalUnionContextPrepared = ((Boolean) getFieldValue(unionContext, "org.apache.commons.jxpath.ri.axes.UnionContext", "prepared"));
        
        assertTrue(finalUnionContextPrepared);
    }
    
    /**
    @utbot.classUnderTest {@link UnionContext}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.axes.UnionContext#setPosition(int)}
 * @utbot.executesCondition {@code (!prepared): True}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < contexts.length; i++)} twice
 * @utbot.returnsFrom {@code return super.setPosition(position);}
 *  */
    @Test
    public void testSetPosition_CtxNextSet() throws Exception  {
        UnionContext unionContext = ((UnionContext) createInstance("org.apache.commons.jxpath.ri.axes.UnionContext"));
        org.apache.commons.jxpath.ri.EvalContext[] contexts = new org.apache.commons.jxpath.ri.EvalContext[1];
        UnionContext unionContext1 = ((UnionContext) createInstance("org.apache.commons.jxpath.ri.axes.UnionContext"));
        setField(unionContext1, "org.apache.commons.jxpath.ri.axes.NodeSetContext", "startedSet", true);
        contexts[0] = ((EvalContext) unionContext1);
        setField(unionContext, "org.apache.commons.jxpath.ri.axes.UnionContext", "contexts", contexts);
        
        boolean actual = unionContext.setPosition(0);
        
        assertFalse(actual);
        
        boolean finalUnionContextPrepared = ((Boolean) getFieldValue(unionContext, "org.apache.commons.jxpath.ri.axes.UnionContext", "prepared"));
        
        assertTrue(finalUnionContextPrepared);
    }
    
    /**
    @utbot.classUnderTest {@link UnionContext}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.axes.UnionContext#setPosition(int)}
 * @utbot.executesCondition {@code (!prepared): False}
 * @utbot.returnsFrom {@code return super.setPosition(position);}
 *  */
    @Test
    public void testSetPosition_Prepared_4() throws Exception  {
        UnionContext unionContext = ((UnionContext) createInstance("org.apache.commons.jxpath.ri.axes.UnionContext"));
        setField(unionContext, "org.apache.commons.jxpath.ri.axes.UnionContext", "prepared", true);
        Object nodeSet = createInstance("org.apache.commons.jxpath.util.BasicTypeConverter$ValueNodeSet");
        ArrayList pointers = new ArrayList();
        setField(nodeSet, "org.apache.commons.jxpath.util.BasicTypeConverter$ValueNodeSet", "pointers", pointers);
        setField(unionContext, "org.apache.commons.jxpath.ri.axes.NodeSetContext", "nodeSet", nodeSet);
        setField(unionContext, "org.apache.commons.jxpath.ri.EvalContext", "position", -255);
        
        boolean actual = unionContext.setPosition(1);
        
        assertFalse(actual);
        
        int finalUnionContextPosition = ((Integer) getFieldValue(unionContext, "org.apache.commons.jxpath.ri.EvalContext", "position"));
        
        assertEquals(1, finalUnionContextPosition);
    }
    
    /**
    @utbot.classUnderTest {@link UnionContext}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.axes.UnionContext#setPosition(int)}
 * @utbot.executesCondition {@code (!prepared): False}
 * @utbot.returnsFrom {@code return super.setPosition(position);}
 *  */
    @Test
    public void testSetPosition_Prepared_3() throws Exception  {
        UnionContext unionContext = ((UnionContext) createInstance("org.apache.commons.jxpath.ri.axes.UnionContext"));
        setField(unionContext, "org.apache.commons.jxpath.ri.axes.UnionContext", "prepared", true);
        BasicNodeSet nodeSet = ((BasicNodeSet) createInstance("org.apache.commons.jxpath.BasicNodeSet"));
        ArrayList pointers = new ArrayList();
        setField(nodeSet, "org.apache.commons.jxpath.BasicNodeSet", "pointers", pointers);
        setField(unionContext, "org.apache.commons.jxpath.ri.axes.NodeSetContext", "nodeSet", nodeSet);
        setField(unionContext, "org.apache.commons.jxpath.ri.EvalContext", "position", -255);
        
        boolean actual = unionContext.setPosition(1);
        
        assertFalse(actual);
        
        int finalUnionContextPosition = ((Integer) getFieldValue(unionContext, "org.apache.commons.jxpath.ri.EvalContext", "position"));
        
        assertEquals(1, finalUnionContextPosition);
    }
    
    /**
    @utbot.classUnderTest {@link UnionContext}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.axes.UnionContext#setPosition(int)}
 * @utbot.executesCondition {@code (!prepared): False}
 * @utbot.returnsFrom {@code return super.setPosition(position);}
 *  */
    @Test
    public void testSetPosition_Prepared_5() throws Exception  {
        UnionContext unionContext = ((UnionContext) createInstance("org.apache.commons.jxpath.ri.axes.UnionContext"));
        setField(unionContext, "org.apache.commons.jxpath.ri.axes.UnionContext", "prepared", true);
        Object nodeSet = createInstance("org.apache.commons.jxpath.util.BasicTypeConverter$ValueNodeSet");
        ArrayList values = new ArrayList();
        setField(nodeSet, "org.apache.commons.jxpath.util.BasicTypeConverter$ValueNodeSet", "values", values);
        setField(unionContext, "org.apache.commons.jxpath.ri.axes.NodeSetContext", "nodeSet", nodeSet);
        setField(unionContext, "org.apache.commons.jxpath.ri.EvalContext", "position", -255);
        
        boolean actual = unionContext.setPosition(1);
        
        assertFalse(actual);
        
        int finalUnionContextPosition = ((Integer) getFieldValue(unionContext, "org.apache.commons.jxpath.ri.EvalContext", "position"));
        
        assertEquals(1, finalUnionContextPosition);
    }
    
    /**
    @utbot.classUnderTest {@link UnionContext}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.axes.UnionContext#setPosition(int)}
 * @utbot.executesCondition {@code (!prepared): False}
 * @utbot.returnsFrom {@code return super.setPosition(position);}
 *  */
    @Test
    public void testSetPosition_Prepared_2() throws Exception  {
        UnionContext unionContext = ((UnionContext) createInstance("org.apache.commons.jxpath.ri.axes.UnionContext"));
        setField(unionContext, "org.apache.commons.jxpath.ri.axes.UnionContext", "prepared", true);
        BasicNodeSet nodeSet = ((BasicNodeSet) createInstance("org.apache.commons.jxpath.BasicNodeSet"));
        ArrayList readOnlyPointers = new ArrayList();
        readOnlyPointers.add(null);
        setField(nodeSet, "org.apache.commons.jxpath.BasicNodeSet", "readOnlyPointers", readOnlyPointers);
        setField(unionContext, "org.apache.commons.jxpath.ri.axes.NodeSetContext", "nodeSet", nodeSet);
        setField(unionContext, "org.apache.commons.jxpath.ri.EvalContext", "position", -255);
        
        boolean actual = unionContext.setPosition(1);
        
        assertTrue(actual);
        
        int finalUnionContextPosition = ((Integer) getFieldValue(unionContext, "org.apache.commons.jxpath.ri.EvalContext", "position"));
        
        assertEquals(1, finalUnionContextPosition);
    }
    
    /**
    @utbot.classUnderTest {@link UnionContext}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.axes.UnionContext#setPosition(int)}
 * @utbot.executesCondition {@code (!prepared): True}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < contexts.length; i++)} twice
 * @utbot.returnsFrom {@code return super.setPosition(position);}
 *  */
    @Test
    public void testSetPosition_CtxNextSet_1() throws Exception  {
        UnionContext unionContext = ((UnionContext) createInstance("org.apache.commons.jxpath.ri.axes.UnionContext"));
        org.apache.commons.jxpath.ri.EvalContext[] contexts = new org.apache.commons.jxpath.ri.EvalContext[1];
        UnionContext unionContext1 = ((UnionContext) createInstance("org.apache.commons.jxpath.ri.axes.UnionContext"));
        setField(unionContext1, "org.apache.commons.jxpath.ri.axes.NodeSetContext", "startedSet", true);
        contexts[0] = ((EvalContext) unionContext1);
        setField(unionContext, "org.apache.commons.jxpath.ri.axes.UnionContext", "contexts", contexts);
        BasicNodeSet nodeSet = ((BasicNodeSet) createInstance("org.apache.commons.jxpath.BasicNodeSet"));
        ArrayList pointers = new ArrayList();
        setField(nodeSet, "org.apache.commons.jxpath.BasicNodeSet", "pointers", pointers);
        setField(unionContext, "org.apache.commons.jxpath.ri.axes.NodeSetContext", "nodeSet", nodeSet);
        
        boolean actual = unionContext.setPosition(1);
        
        assertFalse(actual);
        
        boolean finalUnionContextPrepared = ((Boolean) getFieldValue(unionContext, "org.apache.commons.jxpath.ri.axes.UnionContext", "prepared"));
        int finalUnionContextPosition = ((Integer) getFieldValue(unionContext, "org.apache.commons.jxpath.ri.EvalContext", "position"));
        
        assertTrue(finalUnionContextPrepared);
        
        assertEquals(1, finalUnionContextPosition);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method setPosition(int)
    
    /**
    @utbot.classUnderTest {@link UnionContext}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.axes.UnionContext#setPosition(int)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: BasicNodeSet nodeSet = (BasicNodeSet) getNodeSet();
 *  */
    @Test
    public void testSetPosition_ThrowClassCastException() throws Exception  {
        UnionContext unionContext = ((UnionContext) createInstance("org.apache.commons.jxpath.ri.axes.UnionContext"));
        Object nodeSet = createInstance("org.apache.commons.jxpath.util.BasicTypeConverter$ValueNodeSet");
        setField(unionContext, "org.apache.commons.jxpath.ri.axes.NodeSetContext", "nodeSet", nodeSet);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.axes.UnionContext.setPosition] produces [java.lang.ClassCastException: class org.apache.commons.jxpath.util.BasicTypeConverter$ValueNodeSet cannot be cast to class org.apache.commons.jxpath.BasicNodeSet (org.apache.commons.jxpath.util.BasicTypeConverter$ValueNodeSet and org.apache.commons.jxpath.BasicNodeSet are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @60349b9b)]
            org.apache.commons.jxpath.ri.axes.UnionContext.setPosition(UnionContext.java:48) */
        unionContext.setPosition(-255);
    }
    
    /**
    @utbot.classUnderTest {@link UnionContext}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.axes.UnionContext#setPosition(int)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < contexts.length; i++)} once
 * @utbot.throwsException {@link java.lang.ClassCastException} in: NodePointer ptr = ctx.getCurrentNodePointer();
 *  */
    @Test
    public void testSetPosition_ThrowClassCastException_2() throws Exception  {
        UnionContext unionContext = ((UnionContext) createInstance("org.apache.commons.jxpath.ri.axes.UnionContext"));
        org.apache.commons.jxpath.ri.EvalContext[] contexts = new org.apache.commons.jxpath.ri.EvalContext[1];
        NodeSetContext nodeSetContext = ((NodeSetContext) createInstance("org.apache.commons.jxpath.ri.axes.NodeSetContext"));
        Object nodeSet = createInstance("org.apache.commons.jxpath.util.BasicTypeConverter$ValueNodeSet");
        ArrayList pointers = new ArrayList();
        Object object = createInstance("java.lang.Object");
        pointers.add(object);
        setField(nodeSet, "org.apache.commons.jxpath.util.BasicTypeConverter$ValueNodeSet", "pointers", pointers);
        setField(nodeSetContext, "org.apache.commons.jxpath.ri.axes.NodeSetContext", "nodeSet", nodeSet);
        contexts[0] = ((EvalContext) nodeSetContext);
        setField(unionContext, "org.apache.commons.jxpath.ri.axes.UnionContext", "contexts", contexts);
        BasicNodeSet nodeSet1 = ((BasicNodeSet) createInstance("org.apache.commons.jxpath.BasicNodeSet"));
        setField(unionContext, "org.apache.commons.jxpath.ri.axes.NodeSetContext", "nodeSet", nodeSet1);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.axes.UnionContext.setPosition] produces [java.lang.ClassCastException: class java.lang.Object cannot be cast to class org.apache.commons.jxpath.ri.model.NodePointer (java.lang.Object is in module java.base of loader 'bootstrap'; org.apache.commons.jxpath.ri.model.NodePointer is in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @60349b9b)]
            org.apache.commons.jxpath.ri.axes.NodeSetContext.getCurrentNodePointer(NodeSetContext.java:48)
            org.apache.commons.jxpath.ri.axes.UnionContext.setPosition(UnionContext.java:54) */
        unionContext.setPosition(-255);
    }
    
    /**
    @utbot.classUnderTest {@link UnionContext}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.axes.UnionContext#setPosition(int)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < contexts.length; i++)} once
 * @utbot.throwsException {@link java.lang.ClassCastException} in: while(ctx.nextNode())
 *  */
    @Test
    public void testSetPosition_ThrowClassCastException_1() throws Exception  {
        UnionContext unionContext = ((UnionContext) createInstance("org.apache.commons.jxpath.ri.axes.UnionContext"));
        org.apache.commons.jxpath.ri.EvalContext[] contexts = new org.apache.commons.jxpath.ri.EvalContext[1];
        UnionContext unionContext1 = ((UnionContext) createInstance("org.apache.commons.jxpath.ri.axes.UnionContext"));
        Object nodeSet = createInstance("org.apache.commons.jxpath.util.BasicTypeConverter$ValueNodeSet");
        setField(unionContext1, "org.apache.commons.jxpath.ri.axes.NodeSetContext", "nodeSet", nodeSet);
        contexts[0] = ((EvalContext) unionContext1);
        setField(unionContext, "org.apache.commons.jxpath.ri.axes.UnionContext", "contexts", contexts);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.axes.UnionContext.setPosition] produces [java.lang.ClassCastException: class org.apache.commons.jxpath.util.BasicTypeConverter$ValueNodeSet cannot be cast to class org.apache.commons.jxpath.BasicNodeSet (org.apache.commons.jxpath.util.BasicTypeConverter$ValueNodeSet and org.apache.commons.jxpath.BasicNodeSet are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @60349b9b)]
            org.apache.commons.jxpath.ri.axes.UnionContext.setPosition(UnionContext.java:48)
            org.apache.commons.jxpath.ri.axes.NodeSetContext.nextNode(NodeSetContext.java:65)
            org.apache.commons.jxpath.ri.axes.UnionContext.setPosition(UnionContext.java:53) */
        unionContext.setPosition(-255);
    }
    
    /**
    @utbot.classUnderTest {@link UnionContext}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.axes.UnionContext#setPosition(int)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < contexts.length; i++)} once
 * @utbot.throwsException {@link java.lang.ClassCastException} in: NodePointer ptr = ctx.getCurrentNodePointer();
 *  */
    @Test
    public void testSetPosition_ThrowClassCastException_3() throws Exception  {
        UnionContext unionContext = ((UnionContext) createInstance("org.apache.commons.jxpath.ri.axes.UnionContext"));
        org.apache.commons.jxpath.ri.EvalContext[] contexts = new org.apache.commons.jxpath.ri.EvalContext[1];
        UnionContext unionContext1 = ((UnionContext) createInstance("org.apache.commons.jxpath.ri.axes.UnionContext"));
        setField(unionContext1, "org.apache.commons.jxpath.ri.axes.UnionContext", "prepared", true);
        BasicNodeSet nodeSet = ((BasicNodeSet) createInstance("org.apache.commons.jxpath.BasicNodeSet"));
        ArrayList pointers = new ArrayList();
        Object object = createInstance("java.lang.Object");
        pointers.add(object);
        setField(nodeSet, "org.apache.commons.jxpath.BasicNodeSet", "pointers", pointers);
        setField(unionContext1, "org.apache.commons.jxpath.ri.axes.NodeSetContext", "nodeSet", nodeSet);
        contexts[0] = ((EvalContext) unionContext1);
        setField(unionContext, "org.apache.commons.jxpath.ri.axes.UnionContext", "contexts", contexts);
        setField(unionContext, "org.apache.commons.jxpath.ri.axes.NodeSetContext", "nodeSet", nodeSet);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.axes.UnionContext.setPosition] produces [java.lang.ClassCastException: class java.lang.Object cannot be cast to class org.apache.commons.jxpath.ri.model.NodePointer (java.lang.Object is in module java.base of loader 'bootstrap'; org.apache.commons.jxpath.ri.model.NodePointer is in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @60349b9b)]
            org.apache.commons.jxpath.ri.axes.NodeSetContext.getCurrentNodePointer(NodeSetContext.java:48)
            org.apache.commons.jxpath.ri.axes.UnionContext.setPosition(UnionContext.java:54) */
        unionContext.setPosition(-255);
    }
    
    /**
    @utbot.classUnderTest {@link UnionContext}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.axes.UnionContext#setPosition(int)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < contexts.length; i++)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: while(ctx.nextSet())
 *  */
    @Test
    public void testSetPosition_ThrowNullPointerException_1() throws Exception  {
        UnionContext unionContext = ((UnionContext) createInstance("org.apache.commons.jxpath.ri.axes.UnionContext"));
        org.apache.commons.jxpath.ri.EvalContext[] contexts = {null};
        setField(unionContext, "org.apache.commons.jxpath.ri.axes.UnionContext", "contexts", contexts);
        BasicNodeSet nodeSet = ((BasicNodeSet) createInstance("org.apache.commons.jxpath.BasicNodeSet"));
        setField(unionContext, "org.apache.commons.jxpath.ri.axes.NodeSetContext", "nodeSet", nodeSet);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.axes.UnionContext.setPosition] produces [java.lang.NullPointerException]
            org.apache.commons.jxpath.ri.axes.UnionContext.setPosition(UnionContext.java:52) */
        unionContext.setPosition(-255);
    }
    
    /**
    @utbot.classUnderTest {@link UnionContext}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.axes.UnionContext#setPosition(int)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < contexts.length; i++)} 3 times
 * @utbot.throwsException {@link java.lang.NullPointerException} in: while(ctx.nextSet())
 *  */
    @Test
    public void testSetPosition_ThrowNullPointerException_3() throws Exception  {
        UnionContext unionContext = ((UnionContext) createInstance("org.apache.commons.jxpath.ri.axes.UnionContext"));
        org.apache.commons.jxpath.ri.EvalContext[] contexts = new org.apache.commons.jxpath.ri.EvalContext[3];
        UnionContext unionContext1 = ((UnionContext) createInstance("org.apache.commons.jxpath.ri.axes.UnionContext"));
        setField(unionContext1, "org.apache.commons.jxpath.ri.axes.UnionContext", "prepared", true);
        setField(unionContext1, "org.apache.commons.jxpath.ri.EvalContext", "position", -1);
        contexts[0] = ((EvalContext) unionContext1);
        InitialContext initialContext = ((InitialContext) createInstance("org.apache.commons.jxpath.ri.axes.InitialContext"));
        setField(initialContext, "org.apache.commons.jxpath.ri.axes.InitialContext", "started", true);
        contexts[1] = ((EvalContext) initialContext);
        setField(unionContext, "org.apache.commons.jxpath.ri.axes.UnionContext", "contexts", contexts);
        BasicNodeSet nodeSet = ((BasicNodeSet) createInstance("org.apache.commons.jxpath.BasicNodeSet"));
        setField(unionContext, "org.apache.commons.jxpath.ri.axes.NodeSetContext", "nodeSet", nodeSet);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.axes.UnionContext.setPosition] produces [java.lang.NullPointerException]
            org.apache.commons.jxpath.ri.axes.UnionContext.setPosition(UnionContext.java:52) */
        unionContext.setPosition(-255);
    }
    
    /**
    @utbot.classUnderTest {@link UnionContext}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.axes.UnionContext#setPosition(int)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < contexts.length; i++)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(int i = 0; i < contexts.length; i++)
 *  */
    @Test
    public void testSetPosition_ThrowNullPointerException() throws Exception  {
        UnionContext unionContext = ((UnionContext) createInstance("org.apache.commons.jxpath.ri.axes.UnionContext"));
        BasicNodeSet nodeSet = ((BasicNodeSet) createInstance("org.apache.commons.jxpath.BasicNodeSet"));
        setField(unionContext, "org.apache.commons.jxpath.ri.axes.NodeSetContext", "nodeSet", nodeSet);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.axes.UnionContext.setPosition] produces [java.lang.NullPointerException]
            org.apache.commons.jxpath.ri.axes.UnionContext.setPosition(UnionContext.java:50) */
        unionContext.setPosition(-255);
    }
    
    /**
    @utbot.classUnderTest {@link UnionContext}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.axes.UnionContext#setPosition(int)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < contexts.length; i++)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: nodeSet.add(ptr);
 *  */
    @Test
    public void testSetPosition_ThrowNullPointerException_2() throws Exception  {
        UnionContext unionContext = ((UnionContext) createInstance("org.apache.commons.jxpath.ri.axes.UnionContext"));
        org.apache.commons.jxpath.ri.EvalContext[] contexts = new org.apache.commons.jxpath.ri.EvalContext[1];
        UnionContext unionContext1 = ((UnionContext) createInstance("org.apache.commons.jxpath.ri.axes.UnionContext"));
        setField(unionContext1, "org.apache.commons.jxpath.ri.axes.UnionContext", "prepared", true);
        BasicNodeSet nodeSet = ((BasicNodeSet) createInstance("org.apache.commons.jxpath.BasicNodeSet"));
        ArrayList readOnlyPointers = new ArrayList();
        ContainerPointer containerPointer = ((ContainerPointer) createInstance("org.apache.commons.jxpath.ri.model.container.ContainerPointer"));
        readOnlyPointers.add(containerPointer);
        setField(nodeSet, "org.apache.commons.jxpath.BasicNodeSet", "readOnlyPointers", readOnlyPointers);
        setField(unionContext1, "org.apache.commons.jxpath.ri.axes.NodeSetContext", "nodeSet", nodeSet);
        contexts[0] = ((EvalContext) unionContext1);
        setField(unionContext, "org.apache.commons.jxpath.ri.axes.UnionContext", "contexts", contexts);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.axes.UnionContext.setPosition] produces [java.lang.NullPointerException]
            org.apache.commons.jxpath.ri.axes.UnionContext.setPosition(UnionContext.java:56) */
        unionContext.setPosition(-254);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method setPosition(int)
    
    /**
    @utbot.classUnderTest {@link UnionContext}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.axes.UnionContext#setPosition(int)}
 * @utbot.executesCondition {@code (!prepared): True}
 * @utbot.invokes {@link org.apache.commons.jxpath.ri.axes.UnionContext#getNodeSet()}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < contexts.length; i++)} once
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} in: while(ctx.nextSet())
 *  */
    @Test(expected = UnsupportedOperationException.class)
    public void testSetPosition_ThrowUnsupportedOperationException() throws Exception  {
        UnionContext unionContext = ((UnionContext) createInstance("org.apache.commons.jxpath.ri.axes.UnionContext"));
        org.apache.commons.jxpath.ri.EvalContext[] contexts = new org.apache.commons.jxpath.ri.EvalContext[1];
        RootContext rootContext = ((RootContext) createInstance("org.apache.commons.jxpath.ri.axes.RootContext"));
        contexts[0] = ((EvalContext) rootContext);
        setField(unionContext, "org.apache.commons.jxpath.ri.axes.UnionContext", "contexts", contexts);
        
        unionContext.setPosition(-255);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method setPosition(int)
    
    @Test
    public void testSetPosition1() throws Exception  {
        UnionContext unionContext = ((UnionContext) createInstance("org.apache.commons.jxpath.ri.axes.UnionContext"));
        org.apache.commons.jxpath.ri.EvalContext[] contexts = new org.apache.commons.jxpath.ri.EvalContext[10];
        NodeSetContext nodeSetContext = ((NodeSetContext) createInstance("org.apache.commons.jxpath.ri.axes.NodeSetContext"));
        Object nodeSet = createInstance("org.apache.commons.jxpath.util.BasicTypeConverter$ValueNodeSet");
        ArrayList pointers = new ArrayList();
        pointers.add(unionContext);
        java.lang.Object[] objectArray = new java.lang.Object[3];
        objectArray[0] = ((Object) unionContext);
        objectArray[1] = objectArray;
        objectArray[2] = ((Object) unionContext);
        pointers.add(objectArray);
        pointers.add(unionContext);
        setField(nodeSet, "org.apache.commons.jxpath.util.BasicTypeConverter$ValueNodeSet", "pointers", pointers);
        setField(nodeSetContext, "org.apache.commons.jxpath.ri.axes.NodeSetContext", "nodeSet", nodeSet);
        setField(nodeSetContext, "org.apache.commons.jxpath.ri.EvalContext", "position", 8);
        contexts[0] = ((EvalContext) nodeSetContext);
        UnionContext unionContext1 = ((UnionContext) createInstance("org.apache.commons.jxpath.ri.axes.UnionContext"));
        setField(unionContext1, "org.apache.commons.jxpath.ri.axes.UnionContext", "prepared", true);
        BasicNodeSet nodeSet1 = ((BasicNodeSet) createInstance("org.apache.commons.jxpath.BasicNodeSet"));
        ArrayList readOnlyPointers = new ArrayList();
        setField(nodeSet1, "org.apache.commons.jxpath.BasicNodeSet", "readOnlyPointers", readOnlyPointers);
        setField(unionContext1, "org.apache.commons.jxpath.ri.axes.NodeSetContext", "nodeSet", nodeSet1);
        contexts[1] = ((EvalContext) unionContext1);
        contexts[2] = ((EvalContext) unionContext);
        contexts[3] = ((EvalContext) unionContext);
        contexts[4] = ((EvalContext) unionContext);
        contexts[5] = ((EvalContext) unionContext);
        contexts[6] = ((EvalContext) unionContext);
        contexts[7] = ((EvalContext) unionContext);
        contexts[8] = ((EvalContext) unionContext);
        contexts[9] = ((EvalContext) unionContext);
        setField(unionContext, "org.apache.commons.jxpath.ri.axes.UnionContext", "contexts", contexts);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.axes.UnionContext.setPosition] produces [java.lang.NullPointerException]
            org.apache.commons.jxpath.ri.axes.NodeSetContext.setPosition(NodeSetContext.java:53)
            org.apache.commons.jxpath.ri.axes.UnionContext.setPosition(UnionContext.java:63)
            org.apache.commons.jxpath.ri.axes.NodeSetContext.nextNode(NodeSetContext.java:65)
            org.apache.commons.jxpath.ri.axes.UnionContext.setPosition(UnionContext.java:53) */
        unionContext.setPosition(0);
    }
    ///endregion
    
    ///endregion
    
    ///region Util methods
    
    private static Object getFieldValue(Object obj, String fieldClassName, String fieldName) throws ClassNotFoundException, NoSuchMethodException, java.lang.reflect.InvocationTargetException, IllegalAccessException, NoSuchFieldException {
        Class<?> clazz = Class.forName(fieldClassName);
        java.lang.reflect.Field field = clazz.getDeclaredField(fieldName);
        
        field.setAccessible(true);
        
        java.lang.reflect.Field modifiersField;
        
            java.lang.reflect.Method methodForGetDeclaredFields1046818485558800 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields1046818485558800.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass1046818485576400 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1046818485558800.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1046818485576400).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
        modifiersField.setAccessible(true);
        modifiersField.setInt(field, field.getModifiers() & ~java.lang.reflect.Modifier.FINAL);
        
        return field.get(obj);
    }
    
    private static Object createInstance(String className) throws Exception {
        Class<?> clazz = Class.forName(className);
        return Class.forName("sun.misc.Unsafe").getDeclaredMethod("allocateInstance", Class.class)
            .invoke(getUnsafeInstance(), clazz);
    }
    
        private static void setField(Object object, String fieldClassName, String fieldName, Object fieldValue) throws ClassNotFoundException, NoSuchFieldException, NoSuchMethodException, IllegalAccessException, java.lang.reflect.InvocationTargetException {
        Class<?> clazz = Class.forName(fieldClassName);
        java.lang.reflect.Field field = clazz.getDeclaredField(fieldName);
    
        java.lang.reflect.Field modifiersField;
        
                java.lang.reflect.Method methodForGetDeclaredFields1046818490035000 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields1046818490035000.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass1046818490041200 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1046818490035000.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1046818490041200).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
        modifiersField.setAccessible(true);
        modifiersField.setInt(field, field.getModifiers() & ~java.lang.reflect.Modifier.FINAL);
    
        field.setAccessible(true);
        field.set(object, fieldValue);
    }
    
    private static Object getUnsafeInstance() throws ClassNotFoundException, NoSuchFieldException, IllegalAccessException {
        java.lang.reflect.Field f = Class.forName("sun.misc.Unsafe").getDeclaredField("theUnsafe");
        f.setAccessible(true);
        return f.get(null);
    }
    ///endregion
}

