package org.apache.commons.jxpath.ri.compiler;

import org.junit.Test;
import java.lang.reflect.Method;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.ConcurrentSkipListSet;
import java.util.concurrent.ConcurrentSkipListMap;
import org.apache.commons.jxpath.ri.axes.ParentContext;
import org.apache.commons.jxpath.ri.axes.AttributeContext;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Vector;
import org.apache.commons.jxpath.ri.axes.InitialContext;
import org.apache.commons.jxpath.ri.axes.SelfContext;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.lang.reflect.Array;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertEquals;
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
        CoreOperationGreaterThanOrEqual coreOperationGreaterThanOrEqual = new CoreOperationGreaterThanOrEqual(null, null);
        
        Class coreOperationRelationalExpressionClazz = Class.forName("org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression");
        Class objectType = Class.forName("java.lang.Object");
        Method reduceMethod = coreOperationRelationalExpressionClazz.getDeclaredMethod("reduce", objectType);
        reduceMethod.setAccessible(true);
        java.lang.Object[] reduceMethodArguments = new java.lang.Object[1];
        reduceMethodArguments[0] = ((Object) null);
        Object actual = reduceMethod.invoke(coreOperationGreaterThanOrEqual, reduceMethodArguments);
        
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
            org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression.reduce(CoreOperationRelationalExpression.java:91) */
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
 * @utbot.throwsException {@link java.lang.NullPointerException} in: compute(args[0].computeValue(context), args[1].computeValue(context))
 *  */
    @Test
    public void testComputeValue_ThrowNullPointerException() {
        CoreOperationLessThan coreOperationLessThan = new CoreOperationLessThan(null, null);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression.computeValue] produces [java.lang.NullPointerException]
            org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression.computeValue(CoreOperationRelationalExpression.java:42) */
        coreOperationLessThan.computeValue(null);
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
        ParentContext parentContext = new ParentContext(null, null);
        parentContext.setPosition(-1);
        NodeTypeTest nodeTypeTest = new NodeTypeTest(1);
        AttributeContext attributeContext = new AttributeContext(parentContext, nodeTypeTest);
        attributeContext.setPosition(0);
        
        Boolean actual = ((Boolean) coreOperationLessThanOrEqual.computeValue(attributeContext));
        
        Boolean expected = true;
        
        assertEquals(expected, actual);
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
            org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression.findMatch(CoreOperationRelationalExpression.java:108) */
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
            org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression.findMatch(CoreOperationRelationalExpression.java:111) */
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
        CoreOperationLessThanOrEqual coreOperationLessThanOrEqual = new CoreOperationLessThanOrEqual(null, null);
        ArrayList arrayList = new ArrayList();
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
        boolean actual = ((Boolean) findMatchMethod.invoke(coreOperationLessThanOrEqual, findMatchMethodArguments));
        
        assertTrue(actual);
    }
    
    @Test
    public void testFindMatch2() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        CoreOperationLessThanOrEqual coreOperationLessThanOrEqual = new CoreOperationLessThanOrEqual(null, null);
        ArrayList arrayList = new ArrayList();
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        Iterator iterator = arrayList.iterator();
        ArrayList arrayList1 = new ArrayList();
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
        boolean actual = ((Boolean) findMatchMethod.invoke(coreOperationLessThanOrEqual, findMatchMethodArguments));
        
        assertTrue(actual);
    }
    
    @Test
    public void testFindMatch3() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        CoreOperationLessThan coreOperationLessThan = new CoreOperationLessThan(null, null);
        ArrayList arrayList = new ArrayList();
        arrayList.add(null);
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
        boolean actual = ((Boolean) findMatchMethod.invoke(coreOperationLessThan, findMatchMethodArguments));
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method findMatch(java.util.Iterator, java.util.Iterator)
    
    @Test
    public void testFindMatch4() throws Throwable  {
        CoreOperationGreaterThan coreOperationGreaterThan = new CoreOperationGreaterThan(null, null);
        ArrayList arrayList = new ArrayList();
        arrayList.add(coreOperationGreaterThan);
        arrayList.add(coreOperationGreaterThan);
        arrayList.add(coreOperationGreaterThan);
        Object object = new Object();
        arrayList.add(object);
        Iterator iterator = arrayList.iterator();
        Iterator iterator1 = arrayList.iterator();
        
        /* This test fails because method [org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression.findMatch] produces [java.lang.NullPointerException]
            org.apache.commons.jxpath.ri.compiler.CoreOperation.parenthesize(CoreOperation.java:73)
            org.apache.commons.jxpath.ri.compiler.CoreOperation.toString(CoreOperation.java:67)
            java.base/java.lang.String.valueOf(String.java:4222)
            org.apache.commons.jxpath.ri.InfoSetUtil.stringValue(InfoSetUtil.java:62)
            org.apache.commons.jxpath.ri.InfoSetUtil.doubleValue(InfoSetUtil.java:123)
            org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression.compute(CoreOperationRelationalExpression.java:75)
            org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression.containsMatch(CoreOperationRelationalExpression.java:99)
            org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression.findMatch(CoreOperationRelationalExpression.java:112) */
        Class coreOperationRelationalExpressionClazz = Class.forName("org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression");
        Class iteratorType = Class.forName("java.util.Iterator");
        Method findMatchMethod = coreOperationRelationalExpressionClazz.getDeclaredMethod("findMatch", iteratorType, iteratorType);
        findMatchMethod.setAccessible(true);
        java.lang.Object[] findMatchMethodArguments = new java.lang.Object[2];
        findMatchMethodArguments[0] = iterator;
        findMatchMethodArguments[1] = iterator1;
        try {
            findMatchMethod.invoke(coreOperationGreaterThan, findMatchMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
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
        CoreOperationLessThan coreOperationLessThan = new CoreOperationLessThan(null, null);
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
        boolean actual = ((Boolean) containsMatchMethod.invoke(coreOperationLessThan, containsMatchMethodArguments));
        
        assertFalse(actual);
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
        CoreOperationLessThan coreOperationLessThan = new CoreOperationLessThan(null, null);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression.containsMatch] produces [java.lang.NullPointerException]
            org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression.containsMatch(CoreOperationRelationalExpression.java:97) */
        Class coreOperationRelationalExpressionClazz = Class.forName("org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression");
        Class iteratorType = Class.forName("java.util.Iterator");
        Class objectType = Class.forName("java.lang.Object");
        Method containsMatchMethod = coreOperationRelationalExpressionClazz.getDeclaredMethod("containsMatch", iteratorType, objectType);
        containsMatchMethod.setAccessible(true);
        java.lang.Object[] containsMatchMethodArguments = new java.lang.Object[2];
        containsMatchMethodArguments[0] = ((Object) null);
        containsMatchMethodArguments[1] = ((Object) null);
        try {
            containsMatchMethod.invoke(coreOperationLessThan, containsMatchMethodArguments);
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
    public void testContainsMatch1() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        CoreOperationGreaterThanOrEqual coreOperationGreaterThanOrEqual = new CoreOperationGreaterThanOrEqual(null, null);
        ArrayList arrayList = new ArrayList();
        Object object = new Object();
        arrayList.add(object);
        arrayList.add(object);
        arrayList.add(object);
        Iterator iterator = arrayList.iterator();
        org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan[] coreOperationGreaterThanArray = {};
        
        Class coreOperationRelationalExpressionClazz = Class.forName("org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression");
        Class iteratorType = Class.forName("java.util.Iterator");
        Class coreOperationGreaterThanArrayType = Class.forName("java.lang.Object");
        Method containsMatchMethod = coreOperationRelationalExpressionClazz.getDeclaredMethod("containsMatch", iteratorType, coreOperationGreaterThanArrayType);
        containsMatchMethod.setAccessible(true);
        java.lang.Object[] containsMatchMethodArguments = new java.lang.Object[2];
        containsMatchMethodArguments[0] = iterator;
        containsMatchMethodArguments[1] = ((Object) coreOperationGreaterThanArray);
        boolean actual = ((Boolean) containsMatchMethod.invoke(coreOperationGreaterThanOrEqual, containsMatchMethodArguments));
        
        assertFalse(actual);
    }
    
    @Test
    public void testContainsMatch2() throws Exception  {
        CoreOperationLessThan coreOperationLessThan = new CoreOperationLessThan(null, null);
        ArrayList arrayList = new ArrayList();
        java.lang.Object[] objectArray = new java.lang.Object[7];
        objectArray[0] = objectArray;
        objectArray[1] = objectArray;
        objectArray[2] = objectArray;
        objectArray[3] = objectArray;
        objectArray[4] = objectArray;
        objectArray[5] = objectArray;
        objectArray[6] = objectArray;
        arrayList.add(objectArray);
        arrayList.add(objectArray);
        arrayList.add(objectArray);
        arrayList.add(objectArray);
        arrayList.add(objectArray);
        arrayList.add(objectArray);
        arrayList.add(objectArray);
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
        boolean actual = ((Boolean) containsMatchMethod.invoke(coreOperationLessThan, containsMatchMethodArguments));
        
        assertFalse(actual);
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
        org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan[] coreOperationGreaterThanArray = {};
        
        Class coreOperationRelationalExpressionClazz = Class.forName("org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression");
        Class iteratorType = Class.forName("java.util.Iterator");
        Class coreOperationGreaterThanArrayType = Class.forName("java.lang.Object");
        Method containsMatchMethod = coreOperationRelationalExpressionClazz.getDeclaredMethod("containsMatch", iteratorType, coreOperationGreaterThanArrayType);
        containsMatchMethod.setAccessible(true);
        java.lang.Object[] containsMatchMethodArguments = new java.lang.Object[2];
        containsMatchMethodArguments[0] = iterator;
        containsMatchMethodArguments[1] = ((Object) coreOperationGreaterThanArray);
        boolean actual = ((Boolean) containsMatchMethod.invoke(coreOperationGreaterThanOrEqual, containsMatchMethodArguments));
        
        assertFalse(actual);
    }
    
    @Test
    public void testContainsMatch4() throws Exception  {
        CoreOperationGreaterThan coreOperationGreaterThan = new CoreOperationGreaterThan(null, null);
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
        boolean actual = ((Boolean) containsMatchMethod.invoke(coreOperationGreaterThan, containsMatchMethodArguments));
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method containsMatch(java.util.Iterator, java.lang.Object)
    
    @Test(expected = StackOverflowError.class)
    public void testContainsMatch5() throws Throwable  {
        CoreOperationGreaterThan coreOperationGreaterThan = new CoreOperationGreaterThan(null, null);
        ArrayList arrayList = new ArrayList();
        arrayList.add(arrayList);
        arrayList.add(arrayList);
        arrayList.add(arrayList);
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
        try {
            containsMatchMethod.invoke(coreOperationGreaterThan, containsMatchMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testContainsMatch6() throws Throwable  {
        CoreOperationLessThan coreOperationLessThan = new CoreOperationLessThan(null, null);
        ArrayList arrayList = new ArrayList();
        arrayList.add(coreOperationLessThan);
        arrayList.add(coreOperationLessThan);
        arrayList.add(coreOperationLessThan);
        Iterator iterator = arrayList.iterator();
        java.lang.Object[] filterListArray = createArray("[Lorg.jdom.ContentList$FilterList;", 0);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression.containsMatch] produces [java.lang.NullPointerException]
            org.apache.commons.jxpath.ri.compiler.CoreOperation.parenthesize(CoreOperation.java:73)
            org.apache.commons.jxpath.ri.compiler.CoreOperation.toString(CoreOperation.java:67)
            java.base/java.lang.String.valueOf(String.java:4222)
            org.apache.commons.jxpath.ri.InfoSetUtil.stringValue(InfoSetUtil.java:62)
            org.apache.commons.jxpath.ri.InfoSetUtil.doubleValue(InfoSetUtil.java:123)
            org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression.compute(CoreOperationRelationalExpression.java:75)
            org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression.containsMatch(CoreOperationRelationalExpression.java:99) */
        Class coreOperationRelationalExpressionClazz = Class.forName("org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression");
        Class iteratorType = Class.forName("java.util.Iterator");
        Class filterListArrayType = Class.forName("java.lang.Object");
        Method containsMatchMethod = coreOperationRelationalExpressionClazz.getDeclaredMethod("containsMatch", iteratorType, filterListArrayType);
        containsMatchMethod.setAccessible(true);
        java.lang.Object[] containsMatchMethodArguments = new java.lang.Object[2];
        containsMatchMethodArguments[0] = iterator;
        containsMatchMethodArguments[1] = ((Object) filterListArray);
        try {
            containsMatchMethod.invoke(coreOperationLessThan, containsMatchMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testContainsMatch7() throws Throwable  {
        CoreOperationLessThan coreOperationLessThan = new CoreOperationLessThan(null, null);
        ArrayList arrayList = new ArrayList();
        Object object = new Object();
        arrayList.add(object);
        arrayList.add(object);
        arrayList.add(object);
        Iterator iterator = arrayList.iterator();
        SelfContext selfContext = new SelfContext(null, null);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression.containsMatch] produces [java.lang.NullPointerException]
            org.apache.commons.jxpath.ri.axes.SelfContext.getSingleNodePointer(SelfContext.java:42)
            org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression.reduce(CoreOperationRelationalExpression.java:88)
            org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression.compute(CoreOperationRelationalExpression.java:58)
            org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression.containsMatch(CoreOperationRelationalExpression.java:99) */
        Class coreOperationRelationalExpressionClazz = Class.forName("org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression");
        Class iteratorType = Class.forName("java.util.Iterator");
        Class selfContextType = Class.forName("java.lang.Object");
        Method containsMatchMethod = coreOperationRelationalExpressionClazz.getDeclaredMethod("containsMatch", iteratorType, selfContextType);
        containsMatchMethod.setAccessible(true);
        java.lang.Object[] containsMatchMethodArguments = new java.lang.Object[2];
        containsMatchMethodArguments[0] = iterator;
        containsMatchMethodArguments[1] = selfContext;
        try {
            containsMatchMethod.invoke(coreOperationLessThan, containsMatchMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression.getPrecedence
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getPrecedence()
    
    /**
    @utbot.classUnderTest {@link CoreOperationRelationalExpression}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression#getPrecedence()}
 * @utbot.returnsFrom {@code return 3;}
 *  */
    @Test
    public void testGetPrecedence_Return3() {
        CoreOperationLessThan coreOperationLessThan = new CoreOperationLessThan(null, null);
        
        int actual = coreOperationLessThan.getPrecedence();
        
        assertEquals(3, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Util methods
    
    private static Object createInstance(String className) throws Exception {
        Class<?> clazz = Class.forName(className);
        return Class.forName("sun.misc.Unsafe").getDeclaredMethod("allocateInstance", Class.class)
            .invoke(getUnsafeInstance(), clazz);
    }
    
        private static void setField(Object object, String fieldClassName, String fieldName, Object fieldValue) throws ClassNotFoundException, NoSuchFieldException, NoSuchMethodException, IllegalAccessException, java.lang.reflect.InvocationTargetException {
        Class<?> clazz = Class.forName(fieldClassName);
        java.lang.reflect.Field field = clazz.getDeclaredField(fieldName);
    
        java.lang.reflect.Field modifiersField;
        
                java.lang.reflect.Method methodForGetDeclaredFields1045725917282000 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields1045725917282000.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass1045725917295700 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1045725917282000.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1045725917295700).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
        modifiersField.setAccessible(true);
        modifiersField.setInt(field, field.getModifiers() & ~java.lang.reflect.Modifier.FINAL);
    
        field.setAccessible(true);
        field.set(object, fieldValue);
    }
    
    private static Object[] createArray(String className, int length, Object... values) throws ClassNotFoundException {
        Object array = java.lang.reflect.Array.newInstance(Class.forName(className), length);
    
        for (int i = 0; i < values.length; i++) {
            java.lang.reflect.Array.set(array, i, values[i]);
        }
        
        return (Object[]) array;
    }
    
    private static Object getUnsafeInstance() throws ClassNotFoundException, NoSuchFieldException, IllegalAccessException {
        java.lang.reflect.Field f = Class.forName("sun.misc.Unsafe").getDeclaredField("theUnsafe");
        f.setAccessible(true);
        return f.get(null);
    }
    ///endregion
}

