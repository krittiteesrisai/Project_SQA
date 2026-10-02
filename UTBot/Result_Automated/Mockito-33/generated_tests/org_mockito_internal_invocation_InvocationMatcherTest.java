package org.mockito.internal.invocation;

import org.junit.Test;
import java.util.List;
import org.mockito.internal.creation.DelegatingMethod;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.LinkedList;
import org.mockito.internal.invocation.realmethod.RealMethod;
import org.mockito.internal.invocation.realmethod.FilteredCGLIBProxyRealMethod;
import org.mockito.exceptions.misusing.NotAMockException;
import org.mockito.internal.debugging.Location;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Objects;
import java.util.Map;
import java.util.Set;
import java.util.HashSet;
import java.util.Arrays;
import java.lang.reflect.Array;
import java.util.Iterator;
import java.util.stream.BaseStream;

import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static java.util.Collections.emptyList;

public final class org_mockito_internal_invocation_InvocationMatcherTest {
    ///region Test suites for executable org.mockito.internal.invocation.InvocationMatcher.getInvocation
    
    ///region Errors report for getInvocation
    
    public void testGetInvocation_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.mockito.internal.invocation.InvocationMatcher.captureArgumentsFrom
    
    ///region Errors report for captureArgumentsFrom
    
    public void testCaptureArgumentsFrom_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 10 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.mockito.internal.invocation.InvocationMatcher.safelyArgumentsMatch
    
    ///region Errors report for safelyArgumentsMatch
    
    public void testSafelyArgumentsMatch_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 15 occurrences of:
        // Concrete execution failed
        
        // 4 occurrences of:
        // Default concrete execution failed
        
        // 1 occurrences of:
        /* Unable to make field static final java.util.regex.Pattern$Node java.util.regex.Pattern.lastAccept accessible: module
        java.base does not "opens java.util.regex" to unnamed module @376b4233 */
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.mockito.internal.invocation.InvocationMatcher.getMatchers
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getMatchers()
    
    /**
    @utbot.classUnderTest {@link InvocationMatcher}
 * @utbot.methodUnderTest {@link org.mockito.internal.invocation.InvocationMatcher#getMatchers()}
 * @utbot.returnsFrom {@code return this.matchers;}
 *  */
    @Test
    public void testGetMatchers_ReturnThisMatchers() throws Exception  {
        InvocationMatcher invocationMatcher = ((InvocationMatcher) createInstance("org.mockito.internal.invocation.InvocationMatcher"));
        
        List actual = invocationMatcher.getMatchers();
        
        assertNull(actual);
        
        List finalInvocationMatcherMatchers = ((List) getFieldValue(invocationMatcher, "org.mockito.internal.invocation.InvocationMatcher", "matchers"));
        
        assertNull(finalInvocationMatcherMatchers);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.mockito.internal.invocation.InvocationMatcher.hasSimilarMethod
    
    ///region Errors report for hasSimilarMethod
    
    public void testHasSimilarMethod_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Field name is not declared in class java.lang.reflect.Method
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.mockito.internal.invocation.InvocationMatcher.hasSameMethod
    
    ///region Errors report for hasSameMethod
    
    public void testHasSameMethod_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Default concrete execution failed
        
        // 1 occurrences of:
        // Field clazz is not declared in class java.lang.reflect.Method
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.mockito.internal.invocation.InvocationMatcher.createFrom
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method createFrom(java.util.List)
    
    /**
    @utbot.classUnderTest {@link InvocationMatcher}
 * @utbot.methodUnderTest {@link org.mockito.internal.invocation.InvocationMatcher#createFrom(java.util.List)}
 * @utbot.invokes {@link java.util.List#iterator()}
 * @utbot.returnsFrom {@code return out;}
 *  */
    @Test
    public void testCreateFrom_ListIterator() {
        ArrayList arrayList = new ArrayList();
        
        LinkedList actual = ((LinkedList) InvocationMatcher.createFrom(arrayList));
        
        LinkedList expected = new LinkedList();
        
        assertTrue(deepEquals(expected, actual));
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method createFrom(java.util.List)
    
    /**
    @utbot.classUnderTest {@link InvocationMatcher}
 * @utbot.methodUnderTest {@link org.mockito.internal.invocation.InvocationMatcher#createFrom(java.util.List)}
 * @utbot.iterates iterate the loop {@code for(Invocation i: invocations)} once
 * @utbot.throwsException {@link java.lang.ClassCastException} in: return out;
 *  */
    @Test
    public void testCreateFrom_ThrowClassCastException() throws Exception  {
        ArrayList arrayList = new ArrayList();
        Invocation invocation = ((Invocation) createInstance("org.mockito.internal.invocation.Invocation"));
        java.lang.Object[] arguments = {};
        setField(invocation, "org.mockito.internal.invocation.Invocation", "arguments", arguments);
        arrayList.add(invocation);
        
        /* This test fails because method [org.mockito.internal.invocation.InvocationMatcher.createFrom] produces [java.lang.ClassCastException: class org.mockito.internal.invocation.Invocation cannot be cast to class org.mockito.invocation.Invocation (org.mockito.internal.invocation.Invocation is in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @341346d0; org.mockito.invocation.Invocation is in unnamed module of loader 'app')]
            org.mockito.internal.invocation.InvocationMatcher.createFrom(InvocationMatcher.java:51) */
        InvocationMatcher.createFrom(arrayList);
    }
    
    /**
    @utbot.classUnderTest {@link InvocationMatcher}
 * @utbot.methodUnderTest {@link org.mockito.internal.invocation.InvocationMatcher#createFrom(java.util.List)}
 * @utbot.iterates iterate the loop {@code for(Invocation i: invocations)} once
 * @utbot.throwsException {@link java.lang.ClassCastException} in: return out;
 *  */
    @Test
    public void testCreateFrom_ThrowClassCastException_1() throws Exception  {
        ArrayList arrayList = new ArrayList();
        Invocation invocation = ((Invocation) createInstance("org.mockito.internal.invocation.Invocation"));
        java.lang.Object[] arguments = new java.lang.Object[1];
        Object object = createInstance("java.lang.Object");
        arguments[0] = object;
        setField(invocation, "org.mockito.internal.invocation.Invocation", "arguments", arguments);
        arrayList.add(invocation);
        
        /* This test fails because method [org.mockito.internal.invocation.InvocationMatcher.createFrom] produces [java.lang.ClassCastException: class org.mockito.internal.invocation.Invocation cannot be cast to class org.mockito.invocation.Invocation (org.mockito.internal.invocation.Invocation is in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @341346d0; org.mockito.invocation.Invocation is in unnamed module of loader 'app')]
            org.mockito.internal.invocation.InvocationMatcher.createFrom(InvocationMatcher.java:51) */
        InvocationMatcher.createFrom(arrayList);
    }
    
    /**
    @utbot.classUnderTest {@link InvocationMatcher}
 * @utbot.methodUnderTest {@link org.mockito.internal.invocation.InvocationMatcher#createFrom(java.util.List)}
 * @utbot.iterates iterate the loop {@code for(Invocation i: invocations)} once
 * @utbot.throwsException {@link java.lang.ClassCastException} in: return out;
 *  */
    @Test
    public void testCreateFrom_ThrowClassCastException_2() throws Exception  {
        ArrayList arrayList = new ArrayList();
        Invocation invocation = ((Invocation) createInstance("org.mockito.internal.invocation.Invocation"));
        java.lang.Object[] arguments = new java.lang.Object[1];
        Object object = createInstance("java.lang.Object");
        arguments[0] = object;
        setField(invocation, "org.mockito.internal.invocation.Invocation", "arguments", arguments);
        arrayList.add(invocation);
        
        /* This test fails because method [org.mockito.internal.invocation.InvocationMatcher.createFrom] produces [java.lang.ClassCastException: class org.mockito.internal.invocation.Invocation cannot be cast to class org.mockito.invocation.Invocation (org.mockito.internal.invocation.Invocation is in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @341346d0; org.mockito.invocation.Invocation is in unnamed module of loader 'app')]
            org.mockito.internal.invocation.InvocationMatcher.createFrom(InvocationMatcher.java:51) */
        InvocationMatcher.createFrom(arrayList);
    }
    
    /**
    @utbot.classUnderTest {@link InvocationMatcher}
 * @utbot.methodUnderTest {@link org.mockito.internal.invocation.InvocationMatcher#createFrom(java.util.List)}
 * @utbot.iterates iterate the loop {@code for(Invocation i: invocations)} once
 * @utbot.throwsException {@link java.lang.ClassCastException} in: return out;
 *  */
    @Test
    public void testCreateFrom_ThrowClassCastException_3() throws Exception  {
        ArrayList arrayList = new ArrayList();
        Invocation invocation = ((Invocation) createInstance("org.mockito.internal.invocation.Invocation"));
        java.lang.Object[] arguments = {null};
        setField(invocation, "org.mockito.internal.invocation.Invocation", "arguments", arguments);
        arrayList.add(invocation);
        
        /* This test fails because method [org.mockito.internal.invocation.InvocationMatcher.createFrom] produces [java.lang.ClassCastException: class org.mockito.internal.invocation.Invocation cannot be cast to class org.mockito.invocation.Invocation (org.mockito.internal.invocation.Invocation is in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @341346d0; org.mockito.invocation.Invocation is in unnamed module of loader 'app')]
            org.mockito.internal.invocation.InvocationMatcher.createFrom(InvocationMatcher.java:51) */
        InvocationMatcher.createFrom(arrayList);
    }
    
    /**
    @utbot.classUnderTest {@link InvocationMatcher}
 * @utbot.methodUnderTest {@link org.mockito.internal.invocation.InvocationMatcher#createFrom(java.util.List)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(Invocation i: invocations)
 *  */
    @Test
    public void testCreateFrom_ThrowNullPointerException() {
        /* This test fails because method [org.mockito.internal.invocation.InvocationMatcher.createFrom] produces [java.lang.NullPointerException]
            org.mockito.internal.invocation.InvocationMatcher.createFrom(InvocationMatcher.java:51) */
        InvocationMatcher.createFrom(null);
    }
    
    /**
    @utbot.classUnderTest {@link InvocationMatcher}
 * @utbot.methodUnderTest {@link org.mockito.internal.invocation.InvocationMatcher#createFrom(java.util.List)}
 * @utbot.iterates iterate the loop {@code for(Invocation i: invocations)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return out;
 *  */
    @Test
    public void testCreateFrom_ThrowNullPointerException_1() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(null);
        
        /* This test fails because method [org.mockito.internal.invocation.InvocationMatcher.createFrom] produces [java.lang.NullPointerException]
            org.mockito.internal.invocation.InvocationMatcher.<init>(InvocationMatcher.java:38)
            org.mockito.internal.invocation.InvocationMatcher.<init>(InvocationMatcher.java:46)
            org.mockito.internal.invocation.InvocationMatcher.createFrom(InvocationMatcher.java:52) */
        InvocationMatcher.createFrom(arrayList);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method createFrom(java.util.List)
    
    /**
     * @utbot.classUnderTest {@link org.mockito.internal.invocation.InvocationMatcher}
     * @utbot.methodUnderTest {@link org.mockito.internal.invocation.InvocationMatcher#createFrom(java.util.List)}
     */
    @Test
    public void testCreateFrom() {
        List list = emptyList();
        
        LinkedList actual = ((LinkedList) InvocationMatcher.createFrom(list));
        
        LinkedList expected = new LinkedList();
        
        assertTrue(deepEquals(expected, actual));
    }
    
    /**
     * @utbot.classUnderTest {@link org.mockito.internal.invocation.InvocationMatcher}
     * @utbot.methodUnderTest {@link org.mockito.internal.invocation.InvocationMatcher#createFrom(java.util.List)}
     */
    @Test
    public void testCreateFrom1() {
        List list = emptyList();
        
        LinkedList actual = ((LinkedList) InvocationMatcher.createFrom(list));
        
        LinkedList expected = new LinkedList();
        
        assertTrue(deepEquals(expected, actual));
    }
    
    /**
     * @utbot.classUnderTest {@link org.mockito.internal.invocation.InvocationMatcher}
     * @utbot.methodUnderTest {@link org.mockito.internal.invocation.InvocationMatcher#createFrom(java.util.List)}
     */
    @Test
    public void testCreateFrom2() {
        List list = emptyList();
        
        LinkedList actual = ((LinkedList) InvocationMatcher.createFrom(list));
        
        LinkedList expected = new LinkedList();
        
        assertTrue(deepEquals(expected, actual));
    }
    
    /**
     * @utbot.classUnderTest {@link org.mockito.internal.invocation.InvocationMatcher}
     * @utbot.methodUnderTest {@link org.mockito.internal.invocation.InvocationMatcher#createFrom(java.util.List)}
     */
    @Test
    public void testCreateFrom3() {
        List list = emptyList();
        
        LinkedList actual = ((LinkedList) InvocationMatcher.createFrom(list));
        
        LinkedList expected = new LinkedList();
        
        assertTrue(deepEquals(expected, actual));
    }
    
    /**
     * @utbot.classUnderTest {@link org.mockito.internal.invocation.InvocationMatcher}
     * @utbot.methodUnderTest {@link org.mockito.internal.invocation.InvocationMatcher#createFrom(java.util.List)}
     */
    @Test
    public void testCreateFrom4() {
        LinkedList linkedList = new LinkedList();
        Object object = new Object();
        java.lang.Object[] objectArray = new java.lang.Object[3];
        Object object1 = new Object();
        objectArray[0] = object1;
        Object object2 = new Object();
        objectArray[1] = object2;
        Object object3 = new Object();
        objectArray[2] = object3;
        Invocation invocation = new Invocation(object, null, objectArray, 0, null);
        linkedList.add(invocation);
        
        LinkedList actual = ((LinkedList) InvocationMatcher.createFrom(linkedList));
        
        LinkedList expected = new LinkedList();
        
        assertTrue(deepEquals(expected, actual));
    }
    
    /**
     * @utbot.classUnderTest {@link org.mockito.internal.invocation.InvocationMatcher}
     * @utbot.methodUnderTest {@link org.mockito.internal.invocation.InvocationMatcher#createFrom(java.util.List)}
     */
    @Test
    public void testCreateFrom5() {
        LinkedList linkedList = new LinkedList();
        Object object = new Object();
        java.lang.Object[] objectArray = new java.lang.Object[1];
        Object object1 = new Object();
        objectArray[0] = object1;
        Invocation invocation = new Invocation(object, null, objectArray, 1, null);
        linkedList.add(invocation);
        Object object2 = new Object();
        java.lang.Object[] objectArray1 = new java.lang.Object[3];
        Object object3 = new Object();
        objectArray1[0] = object3;
        Object object4 = new Object();
        objectArray1[1] = object4;
        Object object5 = new Object();
        objectArray1[2] = object5;
        Invocation invocation1 = new Invocation(object2, null, objectArray1, 1, null);
        linkedList.add(invocation1);
        Object object6 = new Object();
        java.lang.Object[] objectArray2 = new java.lang.Object[1];
        Object object7 = new Object();
        objectArray2[0] = object7;
        Invocation invocation2 = new Invocation(object6, null, objectArray2, 1, null);
        linkedList.add(invocation2);
        
        LinkedList actual = ((LinkedList) InvocationMatcher.createFrom(linkedList));
        
        LinkedList expected = new LinkedList();
        
        assertTrue(deepEquals(expected, actual));
    }
    
    /**
     * @utbot.classUnderTest {@link org.mockito.internal.invocation.InvocationMatcher}
     * @utbot.methodUnderTest {@link org.mockito.internal.invocation.InvocationMatcher#createFrom(java.util.List)}
     */
    @Test
    public void testCreateFrom6() {
        LinkedList linkedList = new LinkedList();
        Object object = new Object();
        java.lang.Object[] objectArray = new java.lang.Object[1];
        Object object1 = new Object();
        objectArray[0] = object1;
        Invocation invocation = new Invocation(object, null, objectArray, 1, null);
        linkedList.add(invocation);
        Object object2 = new Object();
        java.lang.Object[] objectArray1 = new java.lang.Object[1];
        Object object3 = new Object();
        objectArray1[0] = object3;
        Invocation invocation1 = new Invocation(object2, null, objectArray1, 1, null);
        linkedList.add(invocation1);
        Object object4 = new Object();
        java.lang.Object[] objectArray2 = new java.lang.Object[3];
        Object object5 = new Object();
        objectArray2[0] = object5;
        Object object6 = new Object();
        objectArray2[1] = object6;
        Object object7 = new Object();
        objectArray2[2] = object7;
        Invocation invocation2 = new Invocation(object4, null, objectArray2, 1, null);
        linkedList.add(invocation2);
        
        LinkedList actual = ((LinkedList) InvocationMatcher.createFrom(linkedList));
        
        LinkedList expected = new LinkedList();
        
        assertTrue(deepEquals(expected, actual));
    }
    
    /**
     * @utbot.classUnderTest {@link org.mockito.internal.invocation.InvocationMatcher}
     * @utbot.methodUnderTest {@link org.mockito.internal.invocation.InvocationMatcher#createFrom(java.util.List)}
     */
    @Test
    public void testCreateFrom7() {
        LinkedList linkedList = new LinkedList();
        Object object = new Object();
        java.lang.Object[] objectArray = new java.lang.Object[4];
        Object object1 = new Object();
        objectArray[0] = object1;
        Object object2 = new Object();
        objectArray[1] = object2;
        Object object3 = new Object();
        objectArray[2] = object3;
        Object object4 = new Object();
        objectArray[3] = object4;
        Invocation invocation = new Invocation(object, null, objectArray, 0, null);
        linkedList.add(invocation);
        Object object5 = new Object();
        java.lang.Object[] objectArray1 = {};
        Invocation invocation1 = new Invocation(object5, null, objectArray1, -1, null);
        linkedList.add(invocation1);
        Object object6 = new Object();
        java.lang.Object[] objectArray2 = new java.lang.Object[3];
        Object object7 = new Object();
        objectArray2[0] = object7;
        Object object8 = new Object();
        objectArray2[1] = object8;
        Object object9 = new Object();
        objectArray2[2] = object9;
        Invocation invocation2 = new Invocation(object6, null, objectArray2, Integer.MAX_VALUE, null);
        linkedList.add(invocation2);
        Object object10 = new Object();
        java.lang.Object[] objectArray3 = new java.lang.Object[5];
        Object object11 = new Object();
        objectArray3[0] = object11;
        Object object12 = new Object();
        objectArray3[1] = object12;
        Object object13 = new Object();
        objectArray3[2] = object13;
        Object object14 = new Object();
        objectArray3[3] = object14;
        Object object15 = new Object();
        objectArray3[4] = object15;
        Invocation invocation3 = new Invocation(object10, null, objectArray3, 0, null);
        linkedList.add(invocation3);
        
        LinkedList actual = ((LinkedList) InvocationMatcher.createFrom(linkedList));
        
        LinkedList expected = new LinkedList();
        
        assertTrue(deepEquals(expected, actual));
    }
    
    /**
     * @utbot.classUnderTest {@link org.mockito.internal.invocation.InvocationMatcher}
     * @utbot.methodUnderTest {@link org.mockito.internal.invocation.InvocationMatcher#createFrom(java.util.List)}
     */
    @Test
    public void testCreateFrom8() {
        LinkedList linkedList = new LinkedList();
        Object object = new Object();
        java.lang.Object[] objectArray = new java.lang.Object[3];
        Object object1 = new Object();
        objectArray[0] = object1;
        Object object2 = new Object();
        objectArray[1] = object2;
        Object object3 = new Object();
        objectArray[2] = object3;
        Invocation invocation = new Invocation(object, null, objectArray, Integer.MAX_VALUE, null);
        linkedList.add(invocation);
        Object object4 = new Object();
        java.lang.Object[] objectArray1 = new java.lang.Object[1];
        Object object5 = new Object();
        objectArray1[0] = object5;
        Invocation invocation1 = new Invocation(object4, null, objectArray1, Integer.MIN_VALUE, null);
        linkedList.add(invocation1);
        Object object6 = new Object();
        java.lang.Object[] objectArray2 = new java.lang.Object[3];
        Object object7 = new Object();
        objectArray2[0] = object7;
        Object object8 = new Object();
        objectArray2[1] = object8;
        Object object9 = new Object();
        objectArray2[2] = object9;
        FilteredCGLIBProxyRealMethod filteredCGLIBProxyRealMethod = new FilteredCGLIBProxyRealMethod(((RealMethod) null));
        Invocation invocation2 = new Invocation(object6, null, objectArray2, -1, filteredCGLIBProxyRealMethod);
        linkedList.add(invocation2);
        Object object10 = new Object();
        java.lang.Object[] objectArray3 = new java.lang.Object[5];
        Object object11 = new Object();
        objectArray3[0] = object11;
        Object object12 = new Object();
        objectArray3[1] = object12;
        Object object13 = new Object();
        objectArray3[2] = object13;
        Object object14 = new Object();
        objectArray3[3] = object14;
        Object object15 = new Object();
        objectArray3[4] = object15;
        FilteredCGLIBProxyRealMethod filteredCGLIBProxyRealMethod1 = new FilteredCGLIBProxyRealMethod(((RealMethod) null));
        Invocation invocation3 = new Invocation(object10, null, objectArray3, -1, filteredCGLIBProxyRealMethod1);
        linkedList.add(invocation3);
        
        LinkedList actual = ((LinkedList) InvocationMatcher.createFrom(linkedList));
        
        LinkedList expected = new LinkedList();
        
        assertTrue(deepEquals(expected, actual));
    }
    
    /**
     * @utbot.classUnderTest {@link org.mockito.internal.invocation.InvocationMatcher}
     * @utbot.methodUnderTest {@link org.mockito.internal.invocation.InvocationMatcher#createFrom(java.util.List)}
     */
    @Test
    public void testCreateFrom9() {
        ArrayList arrayList = new ArrayList();
        Object object = new Object();
        java.lang.Object[] objectArray = new java.lang.Object[3];
        Object object1 = new Object();
        objectArray[0] = object1;
        Object object2 = new Object();
        objectArray[1] = object2;
        Object object3 = new Object();
        objectArray[2] = object3;
        Invocation invocation = new Invocation(object, null, objectArray, -1, null);
        arrayList.add(invocation);
        Object object4 = new Object();
        java.lang.Object[] objectArray1 = new java.lang.Object[2];
        Object object5 = new Object();
        objectArray1[0] = object5;
        Object object6 = new Object();
        objectArray1[1] = object6;
        Invocation invocation1 = new Invocation(object4, null, objectArray1, 1, null);
        arrayList.add(invocation1);
        Object object7 = new Object();
        java.lang.Object[] objectArray2 = new java.lang.Object[3];
        Object object8 = new Object();
        objectArray2[0] = object8;
        Object object9 = new Object();
        objectArray2[1] = object9;
        Object object10 = new Object();
        objectArray2[2] = object10;
        FilteredCGLIBProxyRealMethod filteredCGLIBProxyRealMethod = new FilteredCGLIBProxyRealMethod(((RealMethod) null));
        Invocation invocation2 = new Invocation(object7, null, objectArray2, Integer.MIN_VALUE, filteredCGLIBProxyRealMethod);
        arrayList.add(invocation2);
        Object object11 = new Object();
        java.lang.Object[] objectArray3 = new java.lang.Object[1];
        Object object12 = new Object();
        objectArray3[0] = object12;
        Invocation invocation3 = new Invocation(object11, null, objectArray3, Integer.MIN_VALUE, null);
        arrayList.add(invocation3);
        Object object13 = new Object();
        java.lang.Object[] objectArray4 = new java.lang.Object[3];
        Object object14 = new Object();
        objectArray4[0] = object14;
        Object object15 = new Object();
        objectArray4[1] = object15;
        Object object16 = new Object();
        objectArray4[2] = object16;
        Invocation invocation4 = new Invocation(object13, null, objectArray4, Integer.MAX_VALUE, null);
        arrayList.add(invocation4);
        
        LinkedList actual = ((LinkedList) InvocationMatcher.createFrom(arrayList));
        
        LinkedList expected = new LinkedList();
        
        assertTrue(deepEquals(expected, actual));
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method createFrom(java.util.List)
    
    /**
     * @utbot.classUnderTest {@link org.mockito.internal.invocation.InvocationMatcher}
     * @utbot.methodUnderTest {@link org.mockito.internal.invocation.InvocationMatcher#createFrom(java.util.List)}
     */
    @Test
    public void testCreateFromThrowsNPE() {
        /* This test fails because method [org.mockito.internal.invocation.InvocationMatcher.createFrom] produces [java.lang.NullPointerException]
            org.mockito.internal.invocation.InvocationMatcher.createFrom(InvocationMatcher.java:51) */
        InvocationMatcher.createFrom(null);
    }
    
    /**
     * @utbot.classUnderTest {@link org.mockito.internal.invocation.InvocationMatcher}
     * @utbot.methodUnderTest {@link org.mockito.internal.invocation.InvocationMatcher#createFrom(java.util.List)}
     */
    @Test
    public void testCreateFromThrowsNPE1() {
        /* This test fails because method [org.mockito.internal.invocation.InvocationMatcher.createFrom] produces [java.lang.NullPointerException]
            org.mockito.internal.invocation.InvocationMatcher.createFrom(InvocationMatcher.java:51) */
        InvocationMatcher.createFrom(null);
    }
    
    /**
     * @utbot.classUnderTest {@link org.mockito.internal.invocation.InvocationMatcher}
     * @utbot.methodUnderTest {@link org.mockito.internal.invocation.InvocationMatcher#createFrom(java.util.List)}
     */
    @Test
    public void testCreateFromThrowsNPE2() {
        /* This test fails because method [org.mockito.internal.invocation.InvocationMatcher.createFrom] produces [java.lang.NullPointerException]
            org.mockito.internal.invocation.InvocationMatcher.createFrom(InvocationMatcher.java:51) */
        InvocationMatcher.createFrom(null);
    }
    
    /**
     * @utbot.classUnderTest {@link org.mockito.internal.invocation.InvocationMatcher}
     * @utbot.methodUnderTest {@link org.mockito.internal.invocation.InvocationMatcher#createFrom(java.util.List)}
     */
    @Test
    public void testCreateFromThrowsNPE3() {
        /* This test fails because method [org.mockito.internal.invocation.InvocationMatcher.createFrom] produces [java.lang.NullPointerException]
            org.mockito.internal.invocation.InvocationMatcher.createFrom(InvocationMatcher.java:51) */
        InvocationMatcher.createFrom(null);
    }
    
    /**
     * @utbot.classUnderTest {@link org.mockito.internal.invocation.InvocationMatcher}
     * @utbot.methodUnderTest {@link org.mockito.internal.invocation.InvocationMatcher#createFrom(java.util.List)}
     */
    @Test
    public void testCreateFromThrowsNPE4() {
        /* This test fails because method [org.mockito.internal.invocation.InvocationMatcher.createFrom] produces [java.lang.NullPointerException]
            org.mockito.internal.invocation.InvocationMatcher.createFrom(InvocationMatcher.java:51) */
        InvocationMatcher.createFrom(null);
    }
    
    /**
     * @utbot.classUnderTest {@link org.mockito.internal.invocation.InvocationMatcher}
     * @utbot.methodUnderTest {@link org.mockito.internal.invocation.InvocationMatcher#createFrom(java.util.List)}
     */
    @Test
    public void testCreateFromThrowsNPE5() {
        /* This test fails because method [org.mockito.internal.invocation.InvocationMatcher.createFrom] produces [java.lang.NullPointerException]
            org.mockito.internal.invocation.InvocationMatcher.createFrom(InvocationMatcher.java:51) */
        InvocationMatcher.createFrom(null);
    }
    
    /**
     * @utbot.classUnderTest {@link org.mockito.internal.invocation.InvocationMatcher}
     * @utbot.methodUnderTest {@link org.mockito.internal.invocation.InvocationMatcher#createFrom(java.util.List)}
     */
    @Test
    public void testCreateFromThrowsNPE6() {
        /* This test fails because method [org.mockito.internal.invocation.InvocationMatcher.createFrom] produces [java.lang.NullPointerException]
            org.mockito.internal.invocation.InvocationMatcher.createFrom(InvocationMatcher.java:51) */
        InvocationMatcher.createFrom(null);
    }
    
    /**
     * @utbot.classUnderTest {@link org.mockito.internal.invocation.InvocationMatcher}
     * @utbot.methodUnderTest {@link org.mockito.internal.invocation.InvocationMatcher#createFrom(java.util.List)}
     */
    @Test
    public void testCreateFromThrowsNPE7() {
        /* This test fails because method [org.mockito.internal.invocation.InvocationMatcher.createFrom] produces [java.lang.NullPointerException]
            org.mockito.internal.invocation.InvocationMatcher.createFrom(InvocationMatcher.java:51) */
        InvocationMatcher.createFrom(null);
    }
    
    /**
     * @utbot.classUnderTest {@link org.mockito.internal.invocation.InvocationMatcher}
     * @utbot.methodUnderTest {@link org.mockito.internal.invocation.InvocationMatcher#createFrom(java.util.List)}
     */
    @Test
    public void testCreateFromThrowsNPE8() {
        /* This test fails because method [org.mockito.internal.invocation.InvocationMatcher.createFrom] produces [java.lang.NullPointerException]
            org.mockito.internal.invocation.InvocationMatcher.createFrom(InvocationMatcher.java:51) */
        InvocationMatcher.createFrom(null);
    }
    
    /**
     * @utbot.classUnderTest {@link org.mockito.internal.invocation.InvocationMatcher}
     * @utbot.methodUnderTest {@link org.mockito.internal.invocation.InvocationMatcher#createFrom(java.util.List)}
     */
    @Test
    public void testCreateFromThrowsNPE9() {
        /* This test fails because method [org.mockito.internal.invocation.InvocationMatcher.createFrom] produces [java.lang.NullPointerException]
            org.mockito.internal.invocation.InvocationMatcher.createFrom(InvocationMatcher.java:51) */
        InvocationMatcher.createFrom(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.mockito.internal.invocation.InvocationMatcher.toString
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method toString()
    
    /**
    @utbot.classUnderTest {@link InvocationMatcher}
 * @utbot.methodUnderTest {@link org.mockito.internal.invocation.InvocationMatcher#toString()}
 * @utbot.invokes {@link org.mockito.internal.invocation.Invocation#toString(java.util.List,org.mockito.internal.reporting.PrintSettings)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return invocation.toString(matchers, new PrintSettings());
 *  */
    @Test
    public void testToString_ThrowNullPointerException() throws Exception  {
        InvocationMatcher invocationMatcher = ((InvocationMatcher) createInstance("org.mockito.internal.invocation.InvocationMatcher"));
        
        /* This test fails because method [org.mockito.internal.invocation.InvocationMatcher.toString] produces [java.lang.NullPointerException]
            org.mockito.internal.reporting.PrintSettings.print(PrintSettings.java:59)
            org.mockito.internal.invocation.InvocationMatcher.toString(InvocationMatcher.java:75) */
        invocationMatcher.toString();
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method toString()
    
    /**
    @utbot.classUnderTest {@link InvocationMatcher}
 * @utbot.methodUnderTest {@link org.mockito.internal.invocation.InvocationMatcher#toString()}
 * @utbot.throwsException {@link org.mockito.exceptions.misusing.NotAMockException} in: return invocation.toString(matchers, new PrintSettings());
 *  */
    @Test(expected = NotAMockException.class)
    public void testToString_ThrowNotAMockException() throws Exception  {
        InvocationMatcher invocationMatcher = ((InvocationMatcher) createInstance("org.mockito.internal.invocation.InvocationMatcher"));
        Invocation invocation = ((Invocation) createInstance("org.mockito.internal.invocation.Invocation"));
        byte[] mock = {};
        setField(invocation, "org.mockito.internal.invocation.Invocation", "mock", mock);
        setField(invocationMatcher, "org.mockito.internal.invocation.InvocationMatcher", "invocation", invocation);
        ArrayList matchers = new ArrayList();
        setField(invocationMatcher, "org.mockito.internal.invocation.InvocationMatcher", "matchers", matchers);
        
        invocationMatcher.toString();
    }
    
    /**
    @utbot.classUnderTest {@link InvocationMatcher}
 * @utbot.methodUnderTest {@link org.mockito.internal.invocation.InvocationMatcher#toString()}
 * @utbot.throwsException {@link org.mockito.exceptions.misusing.NotAMockException} in: return invocation.toString(matchers, new PrintSettings());
 *  */
    @Test(expected = NotAMockException.class)
    public void testToString_ThrowNotAMockException_1() throws Exception  {
        InvocationMatcher invocationMatcher = ((InvocationMatcher) createInstance("org.mockito.internal.invocation.InvocationMatcher"));
        Invocation invocation = ((Invocation) createInstance("org.mockito.internal.invocation.Invocation"));
        setField(invocationMatcher, "org.mockito.internal.invocation.InvocationMatcher", "invocation", invocation);
        ArrayList matchers = new ArrayList();
        setField(invocationMatcher, "org.mockito.internal.invocation.InvocationMatcher", "matchers", matchers);
        
        invocationMatcher.toString();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.mockito.internal.invocation.InvocationMatcher.toString
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method toString(org.mockito.internal.reporting.PrintSettings)
    
    /**
    @utbot.classUnderTest {@link InvocationMatcher}
 * @utbot.methodUnderTest {@link org.mockito.internal.invocation.InvocationMatcher#toString(org.mockito.internal.reporting.PrintSettings)}
 * @utbot.throwsException {@link org.mockito.exceptions.misusing.NotAMockException} in: return invocation.toString(matchers, printSettings);
 *  */
    @Test(expected = NotAMockException.class)
    public void testToString_ThrowNotAMockException1() throws Exception  {
        InvocationMatcher invocationMatcher = ((InvocationMatcher) createInstance("org.mockito.internal.invocation.InvocationMatcher"));
        Invocation invocation = ((Invocation) createInstance("org.mockito.internal.invocation.Invocation"));
        short[] mock = {};
        setField(invocation, "org.mockito.internal.invocation.Invocation", "mock", mock);
        setField(invocationMatcher, "org.mockito.internal.invocation.InvocationMatcher", "invocation", invocation);
        ArrayList matchers = new ArrayList();
        setField(invocationMatcher, "org.mockito.internal.invocation.InvocationMatcher", "matchers", matchers);
        
        invocationMatcher.toString(null);
    }
    
    /**
    @utbot.classUnderTest {@link InvocationMatcher}
 * @utbot.methodUnderTest {@link org.mockito.internal.invocation.InvocationMatcher#toString(org.mockito.internal.reporting.PrintSettings)}
 * @utbot.throwsException {@link org.mockito.exceptions.misusing.NotAMockException} in: return invocation.toString(matchers, printSettings);
 *  */
    @Test(expected = NotAMockException.class)
    public void testToString_ThrowNotAMockException_11() throws Exception  {
        InvocationMatcher invocationMatcher = ((InvocationMatcher) createInstance("org.mockito.internal.invocation.InvocationMatcher"));
        Invocation invocation = ((Invocation) createInstance("org.mockito.internal.invocation.Invocation"));
        setField(invocationMatcher, "org.mockito.internal.invocation.InvocationMatcher", "invocation", invocation);
        ArrayList matchers = new ArrayList();
        setField(invocationMatcher, "org.mockito.internal.invocation.InvocationMatcher", "matchers", matchers);
        
        invocationMatcher.toString(null);
    }
    ///endregion
    
    ///region Errors report for toString
    
    public void testToString_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.mockito.internal.invocation.InvocationMatcher.matches
    
    ///region Errors report for matches
    
    public void testMatches_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Default concrete execution failed
        
        // 1 occurrences of:
        // Field clazz is not declared in class java.lang.reflect.Method
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.mockito.internal.invocation.InvocationMatcher.getMethod
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getMethod()
    
    /**
    @utbot.classUnderTest {@link InvocationMatcher}
 * @utbot.methodUnderTest {@link org.mockito.internal.invocation.InvocationMatcher#getMethod()}
 * @utbot.invokes {@link org.mockito.internal.invocation.Invocation#getMethod()}
 * @utbot.returnsFrom {@code return invocation.getMethod();}
 *  */
    @Test
    public void testGetMethod_InvocationGetMethod() throws Exception  {
        InvocationMatcher invocationMatcher = ((InvocationMatcher) createInstance("org.mockito.internal.invocation.InvocationMatcher"));
        Invocation invocation = ((Invocation) createInstance("org.mockito.internal.invocation.Invocation"));
        DelegatingMethod method = ((DelegatingMethod) createInstance("org.mockito.internal.creation.DelegatingMethod"));
        setField(invocation, "org.mockito.internal.invocation.Invocation", "method", method);
        setField(invocationMatcher, "org.mockito.internal.invocation.InvocationMatcher", "invocation", invocation);
        
        Method actual = invocationMatcher.getMethod();
        
        assertNull(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getMethod()
    
    /**
    @utbot.classUnderTest {@link InvocationMatcher}
 * @utbot.methodUnderTest {@link org.mockito.internal.invocation.InvocationMatcher#getMethod()}
 * @utbot.throwsException {@link java.lang.ClassCastException} 
 *  */
    @Test
    public void testGetMethod_ThrowClassCastException() throws Exception  {
        InvocationMatcher invocationMatcher = ((InvocationMatcher) createInstance("org.mockito.internal.invocation.InvocationMatcher"));
        Invocation invocation = ((Invocation) createInstance("org.mockito.internal.invocation.Invocation"));
        SerializableMethod method = ((SerializableMethod) createInstance("org.mockito.internal.invocation.SerializableMethod"));
        Class declaringClass = Object.class;
        setField(method, "org.mockito.internal.invocation.SerializableMethod", "declaringClass", declaringClass);
        String methodName = "";
        setField(method, "org.mockito.internal.invocation.SerializableMethod", "methodName", methodName);
        setField(invocation, "org.mockito.internal.invocation.Invocation", "method", method);
        setField(invocationMatcher, "org.mockito.internal.invocation.InvocationMatcher", "invocation", invocation);
        
        /* This test fails because method [org.mockito.internal.invocation.InvocationMatcher.getMethod] produces [java.lang.ClassCastException: The object with type java.lang.Object can not be casted to java.lang.Class$ReflectionData] */
        invocationMatcher.getMethod();
    }
    
    /**
    @utbot.classUnderTest {@link InvocationMatcher}
 * @utbot.methodUnderTest {@link org.mockito.internal.invocation.InvocationMatcher#getMethod()}
 * @utbot.throwsException {@link java.lang.ClassCastException} 
 *  */
    @Test
    public void testGetMethod_ThrowClassCastException_1() throws Exception  {
        InvocationMatcher invocationMatcher = ((InvocationMatcher) createInstance("org.mockito.internal.invocation.InvocationMatcher"));
        Invocation invocation = ((Invocation) createInstance("org.mockito.internal.invocation.Invocation"));
        SerializableMethod method = ((SerializableMethod) createInstance("org.mockito.internal.invocation.SerializableMethod"));
        Class declaringClass = Object.class;
        setField(method, "org.mockito.internal.invocation.SerializableMethod", "declaringClass", declaringClass);
        String methodName = "";
        setField(method, "org.mockito.internal.invocation.SerializableMethod", "methodName", methodName);
        setField(invocation, "org.mockito.internal.invocation.Invocation", "method", method);
        setField(invocationMatcher, "org.mockito.internal.invocation.InvocationMatcher", "invocation", invocation);
        
        /* This test fails because method [org.mockito.internal.invocation.InvocationMatcher.getMethod] produces [java.lang.ClassCastException: The object with type java.lang.Object can not be casted to java.lang.Class$ReflectionData] */
        invocationMatcher.getMethod();
    }
    
    /**
    @utbot.classUnderTest {@link InvocationMatcher}
 * @utbot.methodUnderTest {@link org.mockito.internal.invocation.InvocationMatcher#getMethod()}
 * @utbot.invokes {@link org.mockito.internal.invocation.Invocation#getMethod()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return invocation.getMethod();
 *  */
    @Test
    public void testGetMethod_ThrowNullPointerException() throws Exception  {
        InvocationMatcher invocationMatcher = ((InvocationMatcher) createInstance("org.mockito.internal.invocation.InvocationMatcher"));
        
        /* This test fails because method [org.mockito.internal.invocation.InvocationMatcher.getMethod] produces [java.lang.NullPointerException]
            org.mockito.internal.invocation.InvocationMatcher.getMethod(InvocationMatcher.java:58) */
        invocationMatcher.getMethod();
    }
    
    /**
    @utbot.classUnderTest {@link InvocationMatcher}
 * @utbot.methodUnderTest {@link org.mockito.internal.invocation.InvocationMatcher#getMethod()}
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test
    public void testGetMethod_ThrowNullPointerException_1() throws Exception  {
        InvocationMatcher invocationMatcher = ((InvocationMatcher) createInstance("org.mockito.internal.invocation.InvocationMatcher"));
        Invocation invocation = ((Invocation) createInstance("org.mockito.internal.invocation.Invocation"));
        SerializableMethod method = ((SerializableMethod) createInstance("org.mockito.internal.invocation.SerializableMethod"));
        Class declaringClass = Object.class;
        setField(method, "org.mockito.internal.invocation.SerializableMethod", "declaringClass", declaringClass);
        String methodName = "";
        setField(method, "org.mockito.internal.invocation.SerializableMethod", "methodName", methodName);
        setField(invocation, "org.mockito.internal.invocation.Invocation", "method", method);
        setField(invocationMatcher, "org.mockito.internal.invocation.InvocationMatcher", "invocation", invocation);
        
        /* This test fails because method [org.mockito.internal.invocation.InvocationMatcher.getMethod] produces [java.lang.NullPointerException] */
        invocationMatcher.getMethod();
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method getMethod()
    
    /**
    @utbot.classUnderTest {@link InvocationMatcher}
 * @utbot.methodUnderTest {@link org.mockito.internal.invocation.InvocationMatcher#getMethod()}
 * @utbot.invokes {@link org.mockito.internal.invocation.Invocation#getMethod()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return invocation.getMethod();
 *  */
    @Test(expected = NullPointerException.class)
    public void testGetMethod_ThrowNullPointerException_2() throws Exception  {
        InvocationMatcher invocationMatcher = ((InvocationMatcher) createInstance("org.mockito.internal.invocation.InvocationMatcher"));
        Invocation invocation = ((Invocation) createInstance("org.mockito.internal.invocation.Invocation"));
        SerializableMethod method = ((SerializableMethod) createInstance("org.mockito.internal.invocation.SerializableMethod"));
        Class declaringClass = Object.class;
        setField(method, "org.mockito.internal.invocation.SerializableMethod", "declaringClass", declaringClass);
        setField(invocation, "org.mockito.internal.invocation.Invocation", "method", method);
        setField(invocationMatcher, "org.mockito.internal.invocation.InvocationMatcher", "invocation", invocation);
        
        invocationMatcher.getMethod();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.mockito.internal.invocation.InvocationMatcher.getLocation
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getLocation()
    
    /**
    @utbot.classUnderTest {@link InvocationMatcher}
 * @utbot.methodUnderTest {@link org.mockito.internal.invocation.InvocationMatcher#getLocation()}
 * @utbot.invokes {@link org.mockito.internal.invocation.Invocation#getLocation()}
 * @utbot.returnsFrom {@code return invocation.getLocation();}
 *  */
    @Test
    public void testGetLocation_InvocationGetLocation() throws Exception  {
        InvocationMatcher invocationMatcher = ((InvocationMatcher) createInstance("org.mockito.internal.invocation.InvocationMatcher"));
        Invocation invocation = ((Invocation) createInstance("org.mockito.internal.invocation.Invocation"));
        setField(invocationMatcher, "org.mockito.internal.invocation.InvocationMatcher", "invocation", invocation);
        
        Location actual = invocationMatcher.getLocation();
        
        assertNull(actual);
    }
    ///endregion
    
    ///region Errors report for getLocation
    
    public void testGetLocation_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Default concrete execution failed
        
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
        
            java.lang.reflect.Method methodForGetDeclaredFields1128672899854700 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields1128672899854700.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass1128672899865800 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1128672899854700.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1128672899865800).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
        modifiersField.setAccessible(true);
        modifiersField.setInt(field, field.getModifiers() & ~java.lang.reflect.Modifier.FINAL);
        
        return field.get(obj);
    }
    
        private static void setField(Object object, String fieldClassName, String fieldName, Object fieldValue) throws ClassNotFoundException, NoSuchFieldException, NoSuchMethodException, IllegalAccessException, java.lang.reflect.InvocationTargetException {
        Class<?> clazz = Class.forName(fieldClassName);
        java.lang.reflect.Field field = clazz.getDeclaredField(fieldName);
    
        java.lang.reflect.Field modifiersField;
        
                java.lang.reflect.Method methodForGetDeclaredFields1128672900297500 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields1128672900297500.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass1128672900299500 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1128672900297500.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1128672900299500).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
        modifiersField.setAccessible(true);
        modifiersField.setInt(field, field.getModifiers() & ~java.lang.reflect.Modifier.FINAL);
    
        field.setAccessible(true);
        field.set(object, fieldValue);
    }
    
    static class FieldsPair {
        final Object o1;
        final Object o2;
    
        public FieldsPair(Object o1, Object o2) {
            this.o1 = o1;
            this.o2 = o2;
        }
    
        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            FieldsPair that = (FieldsPair) o;
            return java.util.Objects.equals(o1, that.o1) && java.util.Objects.equals(o2, that.o2);
        }
    
        @Override
        public int hashCode() {
            return java.util.Objects.hash(o1, o2);
        }
    }
    
    private static boolean deepEquals(Object o1, Object o2) {
        return deepEquals(o1, o2, new java.util.HashSet<>());
    }
    
    private static boolean deepEquals(Object o1, Object o2, java.util.Set<FieldsPair> visited) {
        visited.add(new FieldsPair(o1, o2));
    
        if (o1 == o2) {
            return true;
        }
    
        if (o1 == null || o2 == null) {
            return false;
        }
    
        if (o1 instanceof Iterable) {
            if (!(o2 instanceof Iterable)) {
                return false;
            }
    
            return iterablesDeepEquals((Iterable<?>) o1, (Iterable<?>) o2, visited);
        }
        
        if (o2 instanceof Iterable) {
            return false;
        }
        
        if (o1 instanceof java.util.stream.BaseStream) {
            if (!(o2 instanceof java.util.stream.BaseStream)) {
                return false;
            }
    
            return streamsDeepEquals((java.util.stream.BaseStream<?, ?>) o1, (java.util.stream.BaseStream<?, ?>) o2, visited);
        }
    
        if (o2 instanceof java.util.stream.BaseStream) {
            return false;
        }
    
        if (o1 instanceof java.util.Map) {
            if (!(o2 instanceof java.util.Map)) {
                return false;
            }
    
            return mapsDeepEquals((java.util.Map<?, ?>) o1, (java.util.Map<?, ?>) o2, visited);
        }
        
        if (o2 instanceof java.util.Map) {
            return false;
        }
    
        Class<?> firstClass = o1.getClass();
        if (firstClass.isArray()) {
            if (!o2.getClass().isArray()) {
                return false;
            }
    
            // Primitive arrays should not appear here
            return arraysDeepEquals(o1, o2, visited);
        }
    
        // common classes
    
        // check if class has custom equals method (including wrappers and strings)
        // It is very important to check it here but not earlier because iterables and maps also have custom equals 
        // based on elements equals 
        if (hasCustomEquals(firstClass)) {
            return o1.equals(o2);
        }
    
        // common classes without custom equals, use comparison by fields
        final java.util.List<java.lang.reflect.Field> fields = new java.util.ArrayList<>();
        while (firstClass != Object.class) {
            fields.addAll(java.util.Arrays.asList(firstClass.getDeclaredFields()));
            // Interface should not appear here
            firstClass = firstClass.getSuperclass();
        }
    
        for (java.lang.reflect.Field field : fields) {
            field.setAccessible(true);
            try {
                final Object field1 = field.get(o1);
                final Object field2 = field.get(o2);
                if (!visited.contains(new FieldsPair(field1, field2)) && !deepEquals(field1, field2, visited)) {
                    return false;
                }
            } catch (IllegalArgumentException e) {
                return false;
            } catch (IllegalAccessException e) {
                // should never occur because field was set accessible
                return false;
            }
        }
    
        return true;
    }
    
    private static boolean arraysDeepEquals(Object arr1, Object arr2, java.util.Set<FieldsPair> visited) {
        final int length = java.lang.reflect.Array.getLength(arr1);
        if (length != java.lang.reflect.Array.getLength(arr2)) {
            return false;
        }
    
        for (int i = 0; i < length; i++) {
            if (!deepEquals(java.lang.reflect.Array.get(arr1, i), java.lang.reflect.Array.get(arr2, i), visited)) {
                return false;
            }
        }
    
        return true;
    }
    
    private static boolean iterablesDeepEquals(Iterable<?> i1, Iterable<?> i2, java.util.Set<FieldsPair> visited) {
        final java.util.Iterator<?> firstIterator = i1.iterator();
        final java.util.Iterator<?> secondIterator = i2.iterator();
        while (firstIterator.hasNext() && secondIterator.hasNext()) {
            if (!deepEquals(firstIterator.next(), secondIterator.next(), visited)) {
                return false;
            }
        }
    
        if (firstIterator.hasNext()) {
            return false;
        }
    
        return !secondIterator.hasNext();
    }
    
    private static boolean streamsDeepEquals(
        java.util.stream.BaseStream<?, ?> s1, 
        java.util.stream.BaseStream<?, ?> s2, 
        java.util.Set<FieldsPair> visited
    ) {
        final java.util.Iterator<?> firstIterator = s1.iterator();
        final java.util.Iterator<?> secondIterator = s2.iterator();
        while (firstIterator.hasNext() && secondIterator.hasNext()) {
            if (!deepEquals(firstIterator.next(), secondIterator.next(), visited)) {
                return false;
            }
        }
    
        if (firstIterator.hasNext()) {
            return false;
        }
    
        return !secondIterator.hasNext();
    }
    
    private static boolean mapsDeepEquals(
        java.util.Map<?, ?> m1, 
        java.util.Map<?, ?> m2, 
        java.util.Set<FieldsPair> visited
    ) {
        final java.util.Iterator<? extends java.util.Map.Entry<?, ?>> firstIterator = m1.entrySet().iterator();
        final java.util.Iterator<? extends java.util.Map.Entry<?, ?>> secondIterator = m2.entrySet().iterator();
        while (firstIterator.hasNext() && secondIterator.hasNext()) {
            final java.util.Map.Entry<?, ?> firstEntry = firstIterator.next();
            final java.util.Map.Entry<?, ?> secondEntry = secondIterator.next();
    
            if (!deepEquals(firstEntry.getKey(), secondEntry.getKey(), visited)) {
                return false;
            }
    
            if (!deepEquals(firstEntry.getValue(), secondEntry.getValue(), visited)) {
                return false;
            }
        }
    
        if (firstIterator.hasNext()) {
            return false;
        }
    
        return !secondIterator.hasNext();
    }
    
    private static boolean hasCustomEquals(Class<?> clazz) {
        while (!Object.class.equals(clazz)) {
            try {
                clazz.getDeclaredMethod("equals", Object.class);
                return true;
            } catch (Exception e) { 
                // Interface should not appear here
                clazz = clazz.getSuperclass();
            }
        }
    
        return false;
    }
    
    private static Object getUnsafeInstance() throws ClassNotFoundException, NoSuchFieldException, IllegalAccessException {
        java.lang.reflect.Field f = Class.forName("sun.misc.Unsafe").getDeclaredField("theUnsafe");
        f.setAccessible(true);
        return f.get(null);
    }
    ///endregion
}

