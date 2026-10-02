package org.apache.commons.jxpath.ri.compiler;

import org.junit.Test;
import java.lang.reflect.Method;
import java.lang.reflect.InvocationTargetException;
import org.apache.commons.jxpath.ri.axes.InitialContext;
import org.apache.commons.jxpath.ri.axes.AttributeContext;
import java.util.Vector;
import java.util.concurrent.ConcurrentSkipListSet;
import java.util.concurrent.ConcurrentSkipListMap;
import org.apache.commons.jxpath.ri.axes.AncestorContext;
import java.util.ArrayList;
import java.util.Iterator;
import org.apache.commons.jxpath.ri.axes.SelfContext;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static java.util.Collections.emptyIterator;

public final class org_apache_commons_jxpath_ri_compiler_CoreOperationRelationalExpressionTest {
    ///region Test suites for executable org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression.compute
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method compute(java.lang.Object, java.lang.Object)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression}
     * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression#compute(java.lang.Object,java.lang.Object)}
     */
    @Test
    public void testComputeReturnsFalse() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        Constant constant = new Constant(((Number) null));
        Constant constant1 = new Constant(((Number) null));
        CoreOperationLessThanOrEqual coreOperationLessThanOrEqual = new CoreOperationLessThanOrEqual(constant, constant1);
        Object object = new Object();
        Object object1 = new Object();
        
        Class coreOperationRelationalExpressionClazz = Class.forName("org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression");
        Class objectType = Class.forName("java.lang.Object");
        Method computeMethod = coreOperationRelationalExpressionClazz.getDeclaredMethod("compute", objectType, objectType);
        computeMethod.setAccessible(true);
        java.lang.Object[] computeMethodArguments = new java.lang.Object[2];
        computeMethodArguments[0] = object;
        computeMethodArguments[1] = object1;
        boolean actual = ((Boolean) computeMethod.invoke(coreOperationLessThanOrEqual, computeMethodArguments));
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method compute(java.lang.Object, java.lang.Object)
    
    @Test
    public void testCompute1() throws Exception  {
        CoreOperationLessThan coreOperationLessThan = new CoreOperationLessThan(null, null);
        short[] shortArray = {};
        InitialContext initialContext = ((InitialContext) createInstance("org.apache.commons.jxpath.ri.axes.InitialContext"));
        
        Class coreOperationRelationalExpressionClazz = Class.forName("org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression");
        Class shortArrayType = Class.forName("java.lang.Object");
        Method computeMethod = coreOperationRelationalExpressionClazz.getDeclaredMethod("compute", shortArrayType, shortArrayType);
        computeMethod.setAccessible(true);
        java.lang.Object[] computeMethodArguments = new java.lang.Object[2];
        computeMethodArguments[0] = ((Object) shortArray);
        computeMethodArguments[1] = initialContext;
        boolean actual = ((Boolean) computeMethod.invoke(coreOperationLessThan, computeMethodArguments));
        
        assertFalse(actual);
        
        int finalInitialContextPosition = ((Integer) getFieldValue(initialContext, "org.apache.commons.jxpath.ri.EvalContext", "position"));
        
        assertEquals(2, finalInitialContextPosition);
    }
    
    @Test
    public void testCompute2() throws Exception  {
        CoreOperationGreaterThan coreOperationGreaterThan = new CoreOperationGreaterThan(null, null);
        InitialContext initialContext = ((InitialContext) createInstance("org.apache.commons.jxpath.ri.axes.InitialContext"));
        
        Class coreOperationRelationalExpressionClazz = Class.forName("org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression");
        Class initialContextType = Class.forName("java.lang.Object");
        Method computeMethod = coreOperationRelationalExpressionClazz.getDeclaredMethod("compute", initialContextType, initialContextType);
        computeMethod.setAccessible(true);
        java.lang.Object[] computeMethodArguments = new java.lang.Object[2];
        computeMethodArguments[0] = initialContext;
        computeMethodArguments[1] = initialContext;
        boolean actual = ((Boolean) computeMethod.invoke(coreOperationGreaterThan, computeMethodArguments));
        
        assertFalse(actual);
        
        int finalInitialContextPosition = ((Integer) getFieldValue(initialContext, "org.apache.commons.jxpath.ri.EvalContext", "position"));
        
        int finalInitialContextPosition1 = ((Integer) getFieldValue(initialContext, "org.apache.commons.jxpath.ri.EvalContext", "position"));
        
        assertEquals(2, finalInitialContextPosition);
        
        assertEquals(2, finalInitialContextPosition1);
    }
    
    @Test
    public void testCompute3() throws Exception  {
        CoreOperationGreaterThan coreOperationGreaterThan = new CoreOperationGreaterThan(null, null);
        org.apache.commons.jxpath.ri.axes.AttributeContext[] attributeContextArray = {};
        Vector vector = ((Vector) createInstance("java.util.Vector"));
        
        Class coreOperationRelationalExpressionClazz = Class.forName("org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression");
        Class attributeContextArrayType = Class.forName("java.lang.Object");
        Method computeMethod = coreOperationRelationalExpressionClazz.getDeclaredMethod("compute", attributeContextArrayType, attributeContextArrayType);
        computeMethod.setAccessible(true);
        java.lang.Object[] computeMethodArguments = new java.lang.Object[2];
        computeMethodArguments[0] = ((Object) attributeContextArray);
        computeMethodArguments[1] = vector;
        boolean actual = ((Boolean) computeMethod.invoke(coreOperationGreaterThan, computeMethodArguments));
        
        assertFalse(actual);
    }
    
    @Test
    public void testCompute4() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        CoreOperationGreaterThan coreOperationGreaterThan = new CoreOperationGreaterThan(null, null);
        Boolean boolean1 = false;
        org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan[] coreOperationGreaterThanArray = {};
        
        Class coreOperationRelationalExpressionClazz = Class.forName("org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression");
        Class boolean1Type = Class.forName("java.lang.Object");
        Method computeMethod = coreOperationRelationalExpressionClazz.getDeclaredMethod("compute", boolean1Type, boolean1Type);
        computeMethod.setAccessible(true);
        java.lang.Object[] computeMethodArguments = new java.lang.Object[2];
        computeMethodArguments[0] = boolean1;
        computeMethodArguments[1] = ((Object) coreOperationGreaterThanArray);
        boolean actual = ((Boolean) computeMethod.invoke(coreOperationGreaterThan, computeMethodArguments));
        
        assertFalse(actual);
    }
    
    @Test
    public void testCompute5() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        CoreOperationLessThan coreOperationLessThan = new CoreOperationLessThan(null, null);
        Integer integer = 0;
        int[] intArray = {};
        
        Class coreOperationRelationalExpressionClazz = Class.forName("org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression");
        Class integerType = Class.forName("java.lang.Object");
        Method computeMethod = coreOperationRelationalExpressionClazz.getDeclaredMethod("compute", integerType, integerType);
        computeMethod.setAccessible(true);
        java.lang.Object[] computeMethodArguments = new java.lang.Object[2];
        computeMethodArguments[0] = integer;
        computeMethodArguments[1] = ((Object) intArray);
        boolean actual = ((Boolean) computeMethod.invoke(coreOperationLessThan, computeMethodArguments));
        
        assertFalse(actual);
    }
    
    @Test
    public void testCompute6() throws Exception  {
        CoreOperationGreaterThan coreOperationGreaterThan = new CoreOperationGreaterThan(null, null);
        Vector vector = ((Vector) createInstance("java.util.Vector"));
        Object object = new Object();
        
        Class coreOperationRelationalExpressionClazz = Class.forName("org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression");
        Class vectorType = Class.forName("java.lang.Object");
        Method computeMethod = coreOperationRelationalExpressionClazz.getDeclaredMethod("compute", vectorType, vectorType);
        computeMethod.setAccessible(true);
        java.lang.Object[] computeMethodArguments = new java.lang.Object[2];
        computeMethodArguments[0] = vector;
        computeMethodArguments[1] = object;
        boolean actual = ((Boolean) computeMethod.invoke(coreOperationGreaterThan, computeMethodArguments));
        
        assertFalse(actual);
    }
    
    @Test
    public void testCompute7() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        CoreOperationGreaterThan coreOperationGreaterThan = new CoreOperationGreaterThan(null, null);
        Boolean boolean1 = true;
        Object object = new Object();
        
        Class coreOperationRelationalExpressionClazz = Class.forName("org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression");
        Class boolean1Type = Class.forName("java.lang.Object");
        Method computeMethod = coreOperationRelationalExpressionClazz.getDeclaredMethod("compute", boolean1Type, boolean1Type);
        computeMethod.setAccessible(true);
        java.lang.Object[] computeMethodArguments = new java.lang.Object[2];
        computeMethodArguments[0] = boolean1;
        computeMethodArguments[1] = object;
        boolean actual = ((Boolean) computeMethod.invoke(coreOperationGreaterThan, computeMethodArguments));
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method compute(java.lang.Object, java.lang.Object)
    
    @Test
    public void testCompute8() throws Throwable  {
        CoreOperationGreaterThan coreOperationGreaterThan = new CoreOperationGreaterThan(null, null);
        ConcurrentSkipListSet concurrentSkipListSet = ((ConcurrentSkipListSet) createInstance("java.util.concurrent.ConcurrentSkipListSet"));
        ConcurrentSkipListMap m = ((ConcurrentSkipListMap) createInstance("java.util.concurrent.ConcurrentSkipListMap"));
        Object keySet = createInstance("java.util.concurrent.ConcurrentSkipListMap$KeySet");
        setField(m, "java.util.concurrent.ConcurrentSkipListMap", "keySet", keySet);
        setField(concurrentSkipListSet, "java.util.concurrent.ConcurrentSkipListSet", "m", m);
        Object object = new Object();
        
        /* This test fails because method [org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression.compute] produces [java.lang.NullPointerException]
            java.base/java.util.Objects.requireNonNull(Objects.java:208)
            java.base/java.util.concurrent.ConcurrentSkipListMap$KeySet.iterator(ConcurrentSkipListMap.java:2196)
            java.base/java.util.concurrent.ConcurrentSkipListSet.iterator(ConcurrentSkipListSet.java:277)
            org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression.reduce(CoreOperationRelationalExpression.java:111)
            org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression.compute(CoreOperationRelationalExpression.java:72) */
        Class coreOperationRelationalExpressionClazz = Class.forName("org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression");
        Class concurrentSkipListSetType = Class.forName("java.lang.Object");
        Method computeMethod = coreOperationRelationalExpressionClazz.getDeclaredMethod("compute", concurrentSkipListSetType, concurrentSkipListSetType);
        computeMethod.setAccessible(true);
        java.lang.Object[] computeMethodArguments = new java.lang.Object[2];
        computeMethodArguments[0] = concurrentSkipListSet;
        computeMethodArguments[1] = object;
        try {
            computeMethod.invoke(coreOperationGreaterThan, computeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression.reduce
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method reduce(java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link CoreOperationRelationalExpression}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression#reduce(java.lang.Object)}
 * @utbot.executesCondition {@code (o instanceof SelfContext): False}
 * @utbot.executesCondition {@code (o instanceof Collection): False}
 * @utbot.returnsFrom {@code return o;}
 *  */
    @Test
    public void testReduce_NotONotInstanceOfCollection() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        CoreOperationLessThanOrEqual coreOperationLessThanOrEqual = new CoreOperationLessThanOrEqual(null, null);
        
        Class coreOperationRelationalExpressionClazz = Class.forName("org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression");
        Class objectType = Class.forName("java.lang.Object");
        Method reduceMethod = coreOperationRelationalExpressionClazz.getDeclaredMethod("reduce", objectType);
        reduceMethod.setAccessible(true);
        java.lang.Object[] reduceMethodArguments = new java.lang.Object[1];
        reduceMethodArguments[0] = ((Object) null);
        Object actual = reduceMethod.invoke(coreOperationLessThanOrEqual, reduceMethodArguments);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method reduce(java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link CoreOperationRelationalExpression}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression#reduce(java.lang.Object)}
 * @utbot.executesCondition {@code (o instanceof SelfContext): False}
 * @utbot.executesCondition {@code (o instanceof Collection): True}
 * @utbot.invokes {@link java.util.Collection#iterator()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: o = ((Collection) o).iterator();
 *  */
    @Test
    public void testReduce_ThrowNullPointerException() throws Throwable  {
        CoreOperationLessThanOrEqual coreOperationLessThanOrEqual = new CoreOperationLessThanOrEqual(null, null);
        ConcurrentSkipListSet concurrentSkipListSet = ((ConcurrentSkipListSet) createInstance("java.util.concurrent.ConcurrentSkipListSet"));
        ConcurrentSkipListMap m = ((ConcurrentSkipListMap) createInstance("java.util.concurrent.ConcurrentSkipListMap"));
        Object keySet = createInstance("java.util.concurrent.ConcurrentSkipListMap$KeySet");
        setField(m, "java.util.concurrent.ConcurrentSkipListMap", "keySet", keySet);
        setField(concurrentSkipListSet, "java.util.concurrent.ConcurrentSkipListSet", "m", m);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression.reduce] produces [java.lang.NullPointerException]
            java.base/java.util.Objects.requireNonNull(Objects.java:208)
            java.base/java.util.concurrent.ConcurrentSkipListMap$KeySet.iterator(ConcurrentSkipListMap.java:2196)
            java.base/java.util.concurrent.ConcurrentSkipListSet.iterator(ConcurrentSkipListSet.java:277)
            org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression.reduce(CoreOperationRelationalExpression.java:111) */
        Class coreOperationRelationalExpressionClazz = Class.forName("org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression");
        Class concurrentSkipListSetType = Class.forName("java.lang.Object");
        Method reduceMethod = coreOperationRelationalExpressionClazz.getDeclaredMethod("reduce", concurrentSkipListSetType);
        reduceMethod.setAccessible(true);
        java.lang.Object[] reduceMethodArguments = new java.lang.Object[1];
        reduceMethodArguments[0] = concurrentSkipListSet;
        try {
            reduceMethod.invoke(coreOperationLessThanOrEqual, reduceMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region Errors report for reduce
    
    public void testReduce_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression.computeValue
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method computeValue(org.apache.commons.jxpath.ri.EvalContext)
    
    /**
    @utbot.classUnderTest {@link CoreOperationRelationalExpression}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression#computeValue(org.apache.commons.jxpath.ri.EvalContext)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: compute(args[0].compute(context), args[1].compute(context))
 *  */
    @Test
    public void testComputeValue_ThrowNullPointerException() {
        CoreOperationLessThanOrEqual coreOperationLessThanOrEqual = new CoreOperationLessThanOrEqual(null, null);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression.computeValue] produces [java.lang.NullPointerException]
            org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression.computeValue(CoreOperationRelationalExpression.java:46) */
        coreOperationLessThanOrEqual.computeValue(null);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method computeValue(org.apache.commons.jxpath.ri.EvalContext)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression}
     * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression#computeValue(org.apache.commons.jxpath.ri.EvalContext)}
     */
    @Test
    public void testComputeValue() {
        Constant constant = new Constant(((Number) null));
        Constant constant1 = new Constant(((Number) null));
        CoreOperationLessThanOrEqual coreOperationLessThanOrEqual = new CoreOperationLessThanOrEqual(constant, constant1);
        AncestorContext ancestorContext = new AncestorContext(null, false, null);
        ancestorContext.setPosition(Integer.MIN_VALUE);
        ProcessingInstructionTest processingInstructionTest = new ProcessingInstructionTest("XZ");
        AttributeContext attributeContext = new AttributeContext(ancestorContext, processingInstructionTest);
        attributeContext.setPosition(1);
        
        Boolean actual = ((Boolean) coreOperationLessThanOrEqual.computeValue(attributeContext));
        
        Boolean expected = true;
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression.isSymmetric
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method isSymmetric()
    
    /**
    @utbot.classUnderTest {@link CoreOperationRelationalExpression}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression#isSymmetric()}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testIsSymmetric_ReturnFalse() {
        CoreOperationLessThan coreOperationLessThan = new CoreOperationLessThan(null, null);
        
        boolean actual = coreOperationLessThan.isSymmetric();
        
        assertFalse(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression.getPrecedence
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getPrecedence()
    
    /**
    @utbot.classUnderTest {@link CoreOperationRelationalExpression}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression#getPrecedence()}
 * @utbot.returnsFrom {@code return RELATIONAL_EXPR_PRECEDENCE;}
 *  */
    @Test
    public void testGetPrecedence_ReturnRELATIONAL_EXPR_PRECEDENCE() {
        CoreOperationLessThan coreOperationLessThan = new CoreOperationLessThan(null, null);
        
        int actual = coreOperationLessThan.getPrecedence();
        
        assertEquals(3, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression.findMatch
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method findMatch(java.util.Iterator, java.util.Iterator)
    
    /**
    @utbot.classUnderTest {@link CoreOperationRelationalExpression}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression#findMatch(java.util.Iterator,java.util.Iterator)}
 * @utbot.executesCondition {@code (containsMatch(left.iterator(), rit.next())): False}
 * @utbot.invokes {@link java.util.HashSet#iterator()}
 * @utbot.invokes {@link java.util.Iterator#next()}
 * @utbot.invokes org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression#containsMatch(java.util.Iterator,java.lang.Object)
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testFindMatch_NotContainsMatch() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        CoreOperationGreaterThanOrEqual coreOperationGreaterThanOrEqual = new CoreOperationGreaterThanOrEqual(null, null);
        ArrayList arrayList = new ArrayList();
        Iterator iterator = arrayList.iterator();
        Iterator iterator1 = arrayList.iterator();
        
        Class coreOperationRelationalExpressionClazz = Class.forName("org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression");
        Class iteratorType = Class.forName("java.util.Iterator");
        Method findMatchMethod = coreOperationRelationalExpressionClazz.getDeclaredMethod("findMatch", iteratorType, iteratorType);
        findMatchMethod.setAccessible(true);
        java.lang.Object[] findMatchMethodArguments = new java.lang.Object[2];
        findMatchMethodArguments[0] = iterator;
        findMatchMethodArguments[1] = iterator1;
        boolean actual = ((Boolean) findMatchMethod.invoke(coreOperationGreaterThanOrEqual, findMatchMethodArguments));
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link CoreOperationRelationalExpression}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression#findMatch(java.util.Iterator,java.util.Iterator)}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testFindMatch_ReturnFalse() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        CoreOperationGreaterThanOrEqual coreOperationGreaterThanOrEqual = new CoreOperationGreaterThanOrEqual(null, null);
        ArrayList arrayList = new ArrayList();
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        Iterator iterator = arrayList.iterator();
        Iterator iterator1 = arrayList.iterator();
        
        Class coreOperationRelationalExpressionClazz = Class.forName("org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression");
        Class iteratorType = Class.forName("java.util.Iterator");
        Method findMatchMethod = coreOperationRelationalExpressionClazz.getDeclaredMethod("findMatch", iteratorType, iteratorType);
        findMatchMethod.setAccessible(true);
        java.lang.Object[] findMatchMethodArguments = new java.lang.Object[2];
        findMatchMethodArguments[0] = iterator;
        findMatchMethodArguments[1] = iterator1;
        boolean actual = ((Boolean) findMatchMethod.invoke(coreOperationGreaterThanOrEqual, findMatchMethodArguments));
        
        assertTrue(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method findMatch(java.util.Iterator, java.util.Iterator)
    
    /**
    @utbot.classUnderTest {@link CoreOperationRelationalExpression}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression#findMatch(java.util.Iterator,java.util.Iterator)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: while(lit.hasNext())
 *  */
    @Test
    public void testFindMatch_ThrowNullPointerException() throws Throwable  {
        CoreOperationLessThanOrEqual coreOperationLessThanOrEqual = new CoreOperationLessThanOrEqual(null, null);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression.findMatch] produces [java.lang.NullPointerException]
            org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression.findMatch(CoreOperationRelationalExpression.java:147) */
        Class coreOperationRelationalExpressionClazz = Class.forName("org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression");
        Class iteratorType = Class.forName("java.util.Iterator");
        Method findMatchMethod = coreOperationRelationalExpressionClazz.getDeclaredMethod("findMatch", iteratorType, iteratorType);
        findMatchMethod.setAccessible(true);
        java.lang.Object[] findMatchMethodArguments = new java.lang.Object[2];
        findMatchMethodArguments[0] = ((Object) null);
        findMatchMethodArguments[1] = ((Object) null);
        try {
            findMatchMethod.invoke(coreOperationLessThanOrEqual, findMatchMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CoreOperationRelationalExpression}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression#findMatch(java.util.Iterator,java.util.Iterator)}
 * @utbot.invokes {@link java.util.Iterator#hasNext()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: while(rit.hasNext())
 *  */
    @Test
    public void testFindMatch_ThrowNullPointerException_1() throws Throwable  {
        CoreOperationLessThanOrEqual coreOperationLessThanOrEqual = new CoreOperationLessThanOrEqual(null, null);
        ArrayList arrayList = new ArrayList();
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        Iterator iterator = arrayList.iterator();
        
        /* This test fails because method [org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression.findMatch] produces [java.lang.NullPointerException]
            org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression.findMatch(CoreOperationRelationalExpression.java:150) */
        Class coreOperationRelationalExpressionClazz = Class.forName("org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression");
        Class iteratorType = Class.forName("java.util.Iterator");
        Method findMatchMethod = coreOperationRelationalExpressionClazz.getDeclaredMethod("findMatch", iteratorType, iteratorType);
        findMatchMethod.setAccessible(true);
        java.lang.Object[] findMatchMethodArguments = new java.lang.Object[2];
        findMatchMethodArguments[0] = iterator;
        findMatchMethodArguments[1] = ((Object) null);
        try {
            findMatchMethod.invoke(coreOperationLessThanOrEqual, findMatchMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method findMatch(java.util.Iterator, java.util.Iterator)
    
    @Test
    public void testFindMatch1() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        CoreOperationGreaterThan coreOperationGreaterThan = new CoreOperationGreaterThan(null, null);
        ArrayList arrayList = new ArrayList();
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        Iterator iterator = arrayList.iterator();
        Iterator iterator1 = arrayList.iterator();
        
        Class coreOperationRelationalExpressionClazz = Class.forName("org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression");
        Class iteratorType = Class.forName("java.util.Iterator");
        Method findMatchMethod = coreOperationRelationalExpressionClazz.getDeclaredMethod("findMatch", iteratorType, iteratorType);
        findMatchMethod.setAccessible(true);
        java.lang.Object[] findMatchMethodArguments = new java.lang.Object[2];
        findMatchMethodArguments[0] = iterator;
        findMatchMethodArguments[1] = iterator1;
        boolean actual = ((Boolean) findMatchMethod.invoke(coreOperationGreaterThan, findMatchMethodArguments));
        
        assertFalse(actual);
    }
    
    @Test
    public void testFindMatch2() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        CoreOperationLessThan coreOperationLessThan = new CoreOperationLessThan(null, null);
        ArrayList arrayList = new ArrayList();
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        Iterator iterator = arrayList.iterator();
        ArrayList arrayList1 = new ArrayList();
        arrayList1.add(null);
        arrayList1.add(null);
        arrayList1.add(null);
        arrayList1.add(null);
        arrayList1.add(null);
        arrayList1.add(null);
        arrayList1.add(null);
        Iterator iterator1 = arrayList1.iterator();
        
        Class coreOperationRelationalExpressionClazz = Class.forName("org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression");
        Class iteratorType = Class.forName("java.util.Iterator");
        Method findMatchMethod = coreOperationRelationalExpressionClazz.getDeclaredMethod("findMatch", iteratorType, iteratorType);
        findMatchMethod.setAccessible(true);
        java.lang.Object[] findMatchMethodArguments = new java.lang.Object[2];
        findMatchMethodArguments[0] = iterator;
        findMatchMethodArguments[1] = iterator1;
        boolean actual = ((Boolean) findMatchMethod.invoke(coreOperationLessThan, findMatchMethodArguments));
        
        assertFalse(actual);
    }
    
    @Test
    public void testFindMatch3() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        CoreOperationLessThan coreOperationLessThan = new CoreOperationLessThan(null, null);
        ArrayList arrayList = new ArrayList();
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        Object object = new Object();
        arrayList.add(object);
        Iterator iterator = arrayList.iterator();
        Iterator iterator1 = arrayList.iterator();
        
        Class coreOperationRelationalExpressionClazz = Class.forName("org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression");
        Class iteratorType = Class.forName("java.util.Iterator");
        Method findMatchMethod = coreOperationRelationalExpressionClazz.getDeclaredMethod("findMatch", iteratorType, iteratorType);
        findMatchMethod.setAccessible(true);
        java.lang.Object[] findMatchMethodArguments = new java.lang.Object[2];
        findMatchMethodArguments[0] = iterator;
        findMatchMethodArguments[1] = iterator1;
        boolean actual = ((Boolean) findMatchMethod.invoke(coreOperationLessThan, findMatchMethodArguments));
        
        assertFalse(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression.containsMatch
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method containsMatch(java.util.Iterator, java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link CoreOperationRelationalExpression}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression#containsMatch(java.util.Iterator,java.lang.Object)}
 * @utbot.iterates iterate the loop {@code while(it.hasNext())} once
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testContainsMatch_IteratorHasNext() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        CoreOperationGreaterThanOrEqual coreOperationGreaterThanOrEqual = new CoreOperationGreaterThanOrEqual(null, null);
        ArrayList arrayList = new ArrayList();
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        Iterator iterator = arrayList.iterator();
        
        Class coreOperationRelationalExpressionClazz = Class.forName("org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression");
        Class iteratorType = Class.forName("java.util.Iterator");
        Class objectType = Class.forName("java.lang.Object");
        Method containsMatchMethod = coreOperationRelationalExpressionClazz.getDeclaredMethod("containsMatch", iteratorType, objectType);
        containsMatchMethod.setAccessible(true);
        java.lang.Object[] containsMatchMethodArguments = new java.lang.Object[2];
        containsMatchMethodArguments[0] = iterator;
        containsMatchMethodArguments[1] = ((Object) null);
        boolean actual = ((Boolean) containsMatchMethod.invoke(coreOperationGreaterThanOrEqual, containsMatchMethodArguments));
        
        assertTrue(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method containsMatch(java.util.Iterator, java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link CoreOperationRelationalExpression}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression#containsMatch(java.util.Iterator,java.lang.Object)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: while(it.hasNext())
 *  */
    @Test
    public void testContainsMatch_ThrowNullPointerException() throws Throwable  {
        CoreOperationLessThanOrEqual coreOperationLessThanOrEqual = new CoreOperationLessThanOrEqual(null, null);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression.containsMatch] produces [java.lang.NullPointerException]
            org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression.containsMatch(CoreOperationRelationalExpression.java:123) */
        Class coreOperationRelationalExpressionClazz = Class.forName("org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression");
        Class iteratorType = Class.forName("java.util.Iterator");
        Class objectType = Class.forName("java.lang.Object");
        Method containsMatchMethod = coreOperationRelationalExpressionClazz.getDeclaredMethod("containsMatch", iteratorType, objectType);
        containsMatchMethod.setAccessible(true);
        java.lang.Object[] containsMatchMethodArguments = new java.lang.Object[2];
        containsMatchMethodArguments[0] = ((Object) null);
        containsMatchMethodArguments[1] = ((Object) null);
        try {
            containsMatchMethod.invoke(coreOperationLessThanOrEqual, containsMatchMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method containsMatch(java.util.Iterator, java.lang.Object)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression}
     * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression#containsMatch(java.util.Iterator,java.lang.Object)}
     */
    @Test
    public void testContainsMatchReturnsFalse() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        Constant constant = new Constant(((Number) null));
        Constant constant1 = new Constant(((Number) null));
        CoreOperationLessThanOrEqual coreOperationLessThanOrEqual = new CoreOperationLessThanOrEqual(constant, constant1);
        Iterator iterator = emptyIterator();
        Object object = new Object();
        
        Class coreOperationRelationalExpressionClazz = Class.forName("org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression");
        Class iteratorType = Class.forName("java.util.Iterator");
        Class objectType = Class.forName("java.lang.Object");
        Method containsMatchMethod = coreOperationRelationalExpressionClazz.getDeclaredMethod("containsMatch", iteratorType, objectType);
        containsMatchMethod.setAccessible(true);
        java.lang.Object[] containsMatchMethodArguments = new java.lang.Object[2];
        containsMatchMethodArguments[0] = iterator;
        containsMatchMethodArguments[1] = object;
        boolean actual = ((Boolean) containsMatchMethod.invoke(coreOperationLessThanOrEqual, containsMatchMethodArguments));
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method containsMatch(java.util.Iterator, java.lang.Object)
    
    @Test
    public void testContainsMatch1() throws Exception  {
        CoreOperationLessThanOrEqual coreOperationLessThanOrEqual = new CoreOperationLessThanOrEqual(null, null);
        ArrayList arrayList = new ArrayList();
        arrayList.add(coreOperationLessThanOrEqual);
        arrayList.add(coreOperationLessThanOrEqual);
        arrayList.add(coreOperationLessThanOrEqual);
        arrayList.add(coreOperationLessThanOrEqual);
        arrayList.add(coreOperationLessThanOrEqual);
        arrayList.add(coreOperationLessThanOrEqual);
        arrayList.add(coreOperationLessThanOrEqual);
        Iterator iterator = arrayList.iterator();
        Vector vector = ((Vector) createInstance("java.util.Vector"));
        
        Class coreOperationRelationalExpressionClazz = Class.forName("org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression");
        Class iteratorType = Class.forName("java.util.Iterator");
        Class vectorType = Class.forName("java.lang.Object");
        Method containsMatchMethod = coreOperationRelationalExpressionClazz.getDeclaredMethod("containsMatch", iteratorType, vectorType);
        containsMatchMethod.setAccessible(true);
        java.lang.Object[] containsMatchMethodArguments = new java.lang.Object[2];
        containsMatchMethodArguments[0] = iterator;
        containsMatchMethodArguments[1] = vector;
        boolean actual = ((Boolean) containsMatchMethod.invoke(coreOperationLessThanOrEqual, containsMatchMethodArguments));
        
        assertFalse(actual);
    }
    
    @Test
    public void testContainsMatch2() throws Exception  {
        CoreOperationLessThanOrEqual coreOperationLessThanOrEqual = new CoreOperationLessThanOrEqual(null, null);
        ArrayList arrayList = new ArrayList();
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        Iterator iterator = arrayList.iterator();
        InitialContext initialContext = ((InitialContext) createInstance("org.apache.commons.jxpath.ri.axes.InitialContext"));
        
        Class coreOperationRelationalExpressionClazz = Class.forName("org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression");
        Class iteratorType = Class.forName("java.util.Iterator");
        Class initialContextType = Class.forName("java.lang.Object");
        Method containsMatchMethod = coreOperationRelationalExpressionClazz.getDeclaredMethod("containsMatch", iteratorType, initialContextType);
        containsMatchMethod.setAccessible(true);
        java.lang.Object[] containsMatchMethodArguments = new java.lang.Object[2];
        containsMatchMethodArguments[0] = iterator;
        containsMatchMethodArguments[1] = initialContext;
        boolean actual = ((Boolean) containsMatchMethod.invoke(coreOperationLessThanOrEqual, containsMatchMethodArguments));
        
        assertTrue(actual);
    }
    
    @Test
    public void testContainsMatch3() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        CoreOperationGreaterThanOrEqual coreOperationGreaterThanOrEqual = new CoreOperationGreaterThanOrEqual(null, null);
        ArrayList arrayList = new ArrayList();
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        Iterator iterator = arrayList.iterator();
        Object object = new Object();
        
        Class coreOperationRelationalExpressionClazz = Class.forName("org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression");
        Class iteratorType = Class.forName("java.util.Iterator");
        Class objectType = Class.forName("java.lang.Object");
        Method containsMatchMethod = coreOperationRelationalExpressionClazz.getDeclaredMethod("containsMatch", iteratorType, objectType);
        containsMatchMethod.setAccessible(true);
        java.lang.Object[] containsMatchMethodArguments = new java.lang.Object[2];
        containsMatchMethodArguments[0] = iterator;
        containsMatchMethodArguments[1] = object;
        boolean actual = ((Boolean) containsMatchMethod.invoke(coreOperationGreaterThanOrEqual, containsMatchMethodArguments));
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method containsMatch(java.util.Iterator, java.lang.Object)
    
    @Test(expected = StackOverflowError.class)
    public void testContainsMatch4() throws Throwable  {
        CoreOperationGreaterThanOrEqual coreOperationGreaterThanOrEqual = new CoreOperationGreaterThanOrEqual(null, null);
        ArrayList arrayList = new ArrayList();
        arrayList.add(arrayList);
        arrayList.add(arrayList);
        arrayList.add(arrayList);
        arrayList.add(arrayList);
        arrayList.add(arrayList);
        arrayList.add(arrayList);
        arrayList.add(arrayList);
        Iterator iterator = arrayList.iterator();
        org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan[][][][] coreOperationGreaterThanArray = {};
        
        Class coreOperationRelationalExpressionClazz = Class.forName("org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression");
        Class iteratorType = Class.forName("java.util.Iterator");
        Class coreOperationGreaterThanArrayType = Class.forName("java.lang.Object");
        Method containsMatchMethod = coreOperationRelationalExpressionClazz.getDeclaredMethod("containsMatch", iteratorType, coreOperationGreaterThanArrayType);
        containsMatchMethod.setAccessible(true);
        java.lang.Object[] containsMatchMethodArguments = new java.lang.Object[2];
        containsMatchMethodArguments[0] = iterator;
        containsMatchMethodArguments[1] = ((Object) coreOperationGreaterThanArray);
        try {
            containsMatchMethod.invoke(coreOperationGreaterThanOrEqual, containsMatchMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testContainsMatch5() throws Throwable  {
        CoreOperationLessThan coreOperationLessThan = new CoreOperationLessThan(null, null);
        ArrayList arrayList = new ArrayList();
        Object keyIterator = createInstance("java.util.EnumMap$KeyIterator");
        arrayList.add(keyIterator);
        arrayList.add(keyIterator);
        arrayList.add(keyIterator);
        Iterator iterator = arrayList.iterator();
        org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan[][] coreOperationGreaterThanArray = {};
        
        /* This test fails because method [org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression.containsMatch] produces [java.lang.NullPointerException]
            java.base/java.util.EnumMap$EnumMapIterator.hasNext(EnumMap.java:519)
            org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression.containsMatch(CoreOperationRelationalExpression.java:123)
            org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression.compute(CoreOperationRelationalExpression.java:85)
            org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression.containsMatch(CoreOperationRelationalExpression.java:125) */
        Class coreOperationRelationalExpressionClazz = Class.forName("org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression");
        Class iteratorType = Class.forName("java.util.Iterator");
        Class coreOperationGreaterThanArrayType = Class.forName("java.lang.Object");
        Method containsMatchMethod = coreOperationRelationalExpressionClazz.getDeclaredMethod("containsMatch", iteratorType, coreOperationGreaterThanArrayType);
        containsMatchMethod.setAccessible(true);
        java.lang.Object[] containsMatchMethodArguments = new java.lang.Object[2];
        containsMatchMethodArguments[0] = iterator;
        containsMatchMethodArguments[1] = ((Object) coreOperationGreaterThanArray);
        try {
            containsMatchMethod.invoke(coreOperationLessThan, containsMatchMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testContainsMatch6() throws Throwable  {
        CoreOperationLessThanOrEqual coreOperationLessThanOrEqual = new CoreOperationLessThanOrEqual(null, null);
        ArrayList arrayList = new ArrayList();
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        Iterator iterator = arrayList.iterator();
        SelfContext selfContext = new SelfContext(null, null);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression.containsMatch] produces [java.lang.NullPointerException]
            org.apache.commons.jxpath.ri.axes.SelfContext.getSingleNodePointer(SelfContext.java:47)
            org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression.reduce(CoreOperationRelationalExpression.java:108)
            org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression.compute(CoreOperationRelationalExpression.java:73)
            org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression.containsMatch(CoreOperationRelationalExpression.java:125) */
        Class coreOperationRelationalExpressionClazz = Class.forName("org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression");
        Class iteratorType = Class.forName("java.util.Iterator");
        Class selfContextType = Class.forName("java.lang.Object");
        Method containsMatchMethod = coreOperationRelationalExpressionClazz.getDeclaredMethod("containsMatch", iteratorType, selfContextType);
        containsMatchMethod.setAccessible(true);
        java.lang.Object[] containsMatchMethodArguments = new java.lang.Object[2];
        containsMatchMethodArguments[0] = iterator;
        containsMatchMethodArguments[1] = selfContext;
        try {
            containsMatchMethod.invoke(coreOperationLessThanOrEqual, containsMatchMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Util methods
    
    private static Object createInstance(String className) throws Exception {
        Class<?> clazz = Class.forName(className);
        return Class.forName("sun.misc.Unsafe").getDeclaredMethod("allocateInstance", Class.class)
            .invoke(getUnsafeInstance(), clazz);
    }
    
    private static Object getFieldValue(Object obj, String fieldClassName, String fieldName) throws ClassNotFoundException, NoSuchMethodException, java.lang.reflect.InvocationTargetException, IllegalAccessException, NoSuchFieldException {
        Class<?> clazz = Class.forName(fieldClassName);
        java.lang.reflect.Field field = clazz.getDeclaredField(fieldName);
        
        field.setAccessible(true);
        
        java.lang.reflect.Field modifiersField;
        
            java.lang.reflect.Method methodForGetDeclaredFields1048122037260700 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields1048122037260700.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass1048122037276500 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1048122037260700.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1048122037276500).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
        modifiersField.setAccessible(true);
        modifiersField.setInt(field, field.getModifiers() & ~java.lang.reflect.Modifier.FINAL);
        
        return field.get(obj);
    }
    
        private static void setField(Object object, String fieldClassName, String fieldName, Object fieldValue) throws ClassNotFoundException, NoSuchFieldException, NoSuchMethodException, IllegalAccessException, java.lang.reflect.InvocationTargetException {
        Class<?> clazz = Class.forName(fieldClassName);
        java.lang.reflect.Field field = clazz.getDeclaredField(fieldName);
    
        java.lang.reflect.Field modifiersField;
        
                java.lang.reflect.Method methodForGetDeclaredFields1048122039728000 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields1048122039728000.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass1048122039734300 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1048122039728000.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1048122039734300).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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

