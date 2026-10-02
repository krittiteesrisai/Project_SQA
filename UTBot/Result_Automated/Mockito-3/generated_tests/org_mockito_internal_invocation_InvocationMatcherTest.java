package org.mockito.internal.invocation;

import org.junit.Test;
import org.mockito.invocation.Invocation;
import org.mockito.internal.creation.DelegatingMethod;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import org.mockito.internal.debugging.LocationImpl;
import org.mockito.internal.exceptions.stacktrace.StackTraceFilter;
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
import static org.junit.Assert.assertTrue;
import static java.util.Collections.emptyList;
import static org.junit.Assert.assertFalse;

public final class org_mockito_internal_invocation_InvocationMatcherTest {
    ///region Test suites for executable org.mockito.internal.invocation.InvocationMatcher.getInvocation
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getInvocation()
    
    /**
    @utbot.classUnderTest {@link InvocationMatcher}
 * @utbot.methodUnderTest {@link org.mockito.internal.invocation.InvocationMatcher#getInvocation()}
 * @utbot.returnsFrom {@code return this.invocation;}
 *  */
    @Test
    public void testGetInvocation_ReturnThisInvocation() throws Exception  {
        InvocationMatcher invocationMatcher = ((InvocationMatcher) createInstance("org.mockito.internal.invocation.InvocationMatcher"));
        
        Invocation actual = invocationMatcher.getInvocation();
        
        assertNull(actual);
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
 * @utbot.throwsException {@link java.lang.AbstractMethodError} in: return out;
 *  */
    @Test(expected = AbstractMethodError.class)
    public void testCreateFrom_ThrowAbstractMethodError() throws Exception  {
        ArrayList arrayList = new ArrayList();
        Object interceptedInvocation = createInstance("org.mockito.internal.creation.bytebuddy.InterceptedInvocation");
        java.lang.Object[] arguments = {};
        setField(interceptedInvocation, "org.mockito.internal.creation.bytebuddy.InterceptedInvocation", "arguments", arguments);
        arrayList.add(interceptedInvocation);
        
        InvocationMatcher.createFrom(arrayList);
    }
    
    /**
    @utbot.classUnderTest {@link InvocationMatcher}
 * @utbot.methodUnderTest {@link org.mockito.internal.invocation.InvocationMatcher#createFrom(java.util.List)}
 * @utbot.iterates iterate the loop {@code for(Invocation i: invocations)} once
 * @utbot.throwsException {@link java.lang.AbstractMethodError} in: return out;
 *  */
    @Test(expected = AbstractMethodError.class)
    public void testCreateFrom_ThrowAbstractMethodError_1() throws Exception  {
        ArrayList arrayList = new ArrayList();
        InvocationImpl invocationImpl = ((InvocationImpl) createInstance("org.mockito.internal.invocation.InvocationImpl"));
        java.lang.Object[] arguments = {};
        setField(invocationImpl, "org.mockito.internal.invocation.InvocationImpl", "arguments", arguments);
        arrayList.add(invocationImpl);
        
        InvocationMatcher.createFrom(arrayList);
    }
    
    /**
    @utbot.classUnderTest {@link InvocationMatcher}
 * @utbot.methodUnderTest {@link org.mockito.internal.invocation.InvocationMatcher#createFrom(java.util.List)}
 * @utbot.iterates iterate the loop {@code for(Invocation i: invocations)} once
 * @utbot.throwsException {@link java.lang.AbstractMethodError} in: return out;
 *  */
    @Test(expected = AbstractMethodError.class)
    public void testCreateFrom_ThrowAbstractMethodError_2() throws Exception  {
        ArrayList arrayList = new ArrayList();
        InvocationImpl invocationImpl = ((InvocationImpl) createInstance("org.mockito.internal.invocation.InvocationImpl"));
        java.lang.Object[] arguments = new java.lang.Object[1];
        Object object = createInstance("java.lang.Object");
        arguments[0] = object;
        setField(invocationImpl, "org.mockito.internal.invocation.InvocationImpl", "arguments", arguments);
        arrayList.add(invocationImpl);
        
        InvocationMatcher.createFrom(arrayList);
    }
    
    /**
    @utbot.classUnderTest {@link InvocationMatcher}
 * @utbot.methodUnderTest {@link org.mockito.internal.invocation.InvocationMatcher#createFrom(java.util.List)}
 * @utbot.iterates iterate the loop {@code for(Invocation i: invocations)} once
 * @utbot.throwsException {@link java.lang.AbstractMethodError} in: return out;
 *  */
    @Test(expected = AbstractMethodError.class)
    public void testCreateFrom_ThrowAbstractMethodError_3() throws Exception  {
        ArrayList arrayList = new ArrayList();
        Object interceptedInvocation = createInstance("org.mockito.internal.creation.bytebuddy.InterceptedInvocation");
        java.lang.Object[] arguments = new java.lang.Object[1];
        Object object = createInstance("java.lang.Object");
        arguments[0] = object;
        setField(interceptedInvocation, "org.mockito.internal.creation.bytebuddy.InterceptedInvocation", "arguments", arguments);
        arrayList.add(interceptedInvocation);
        
        InvocationMatcher.createFrom(arrayList);
    }
    
    /**
    @utbot.classUnderTest {@link InvocationMatcher}
 * @utbot.methodUnderTest {@link org.mockito.internal.invocation.InvocationMatcher#createFrom(java.util.List)}
 * @utbot.iterates iterate the loop {@code for(Invocation i: invocations)} once
 * @utbot.throwsException {@link java.lang.AbstractMethodError} in: return out;
 *  */
    @Test(expected = AbstractMethodError.class)
    public void testCreateFrom_ThrowAbstractMethodError_4() throws Exception  {
        ArrayList arrayList = new ArrayList();
        InvocationImpl invocationImpl = ((InvocationImpl) createInstance("org.mockito.internal.invocation.InvocationImpl"));
        java.lang.Object[] arguments = {null};
        setField(invocationImpl, "org.mockito.internal.invocation.InvocationImpl", "arguments", arguments);
        arrayList.add(invocationImpl);
        
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
    public void testCreateFrom5() {
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
    public void testCreateFrom6() {
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
    public void testCreateFrom7() {
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
    public void testCreateFrom8() {
        ArrayList arrayList = new ArrayList();
        Object object = new Object();
        java.lang.Object[] objectArray = {null, null, null, null, null};
        InvocationImpl invocationImpl = new InvocationImpl(object, null, objectArray, 1, null);
        arrayList.add(invocationImpl);
        
        LinkedList actual = ((LinkedList) InvocationMatcher.createFrom(arrayList));
        
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
        java.lang.Object[] objectArray = {null, null, null, null, null};
        InvocationImpl invocationImpl = new InvocationImpl(object, null, objectArray, 1, null);
        arrayList.add(invocationImpl);
        
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
    ///endregion
    
    ///region FUZZER: TIMEOUTS for method createFrom(java.util.List)
    
    /**
     * @utbot.classUnderTest {@link org.mockito.internal.invocation.InvocationMatcher}
     * @utbot.methodUnderTest {@link org.mockito.internal.invocation.InvocationMatcher#createFrom(java.util.List)}
     */
    @Test(timeout = 1000L)
    public void testCreateFrom10() {
        ArrayList arrayList = new ArrayList();
        Object object = new Object();
        java.lang.Object[] objectArray = {null, null, null, null, null};
        InvocationImpl invocationImpl = new InvocationImpl(object, null, objectArray, 1, null);
        arrayList.add(invocationImpl);
        
        /* This execution may take longer than the 1000 ms timeout
         and therefore fail due to exceeding the timeout. */
        InvocationMatcher.createFrom(arrayList);
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
    
    ///region Test suites for executable org.mockito.internal.invocation.InvocationMatcher.hasSameMethod
    
    ///region Errors report for hasSameMethod
    
    public void testHasSameMethod_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Field name is not declared in class java.lang.reflect.Method
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.mockito.internal.invocation.InvocationMatcher.captureArgumentsFrom
    
    ///region Errors report for captureArgumentsFrom
    
    public void testCaptureArgumentsFrom_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Field modifiers is not declared in class java.lang.reflect.Method
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.mockito.internal.invocation.InvocationMatcher.safelyArgumentsMatch
    
    ///region Errors report for safelyArgumentsMatch
    
    public void testSafelyArgumentsMatch_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 8 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.mockito.internal.invocation.InvocationMatcher.toString
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method toString()
    
    /**
    @utbot.classUnderTest {@link InvocationMatcher}
 * @utbot.methodUnderTest {@link org.mockito.internal.invocation.InvocationMatcher#toString()}
 * @utbot.throwsException {@link org.mockito.exceptions.misusing.NotAMockException} in: return new PrintSettings().print(matchers, invocation);
 *  */
    @Test
    public void testToString_ThrowNotAMockException() throws Exception  {
        InvocationMatcher invocationMatcher = ((InvocationMatcher) createInstance("org.mockito.internal.invocation.InvocationMatcher"));
        InvocationImpl invocation = ((InvocationImpl) createInstance("org.mockito.internal.invocation.InvocationImpl"));
        setField(invocationMatcher, "org.mockito.internal.invocation.InvocationMatcher", "invocation", invocation);
        ArrayList matchers = new ArrayList();
        setField(invocationMatcher, "org.mockito.internal.invocation.InvocationMatcher", "matchers", matchers);
        
        /* This test fails because method [org.mockito.internal.invocation.InvocationMatcher.toString] produces [org.mockito.exceptions.misusing.NotAMockException: Argument should be a mock, but is null!] */
        invocationMatcher.toString();
    }
    
    /**
    @utbot.classUnderTest {@link InvocationMatcher}
 * @utbot.methodUnderTest {@link org.mockito.internal.invocation.InvocationMatcher#toString()}
 * @utbot.throwsException {@link org.mockito.exceptions.misusing.NotAMockException} in: return new PrintSettings().print(matchers, invocation);
 *  */
    @Test
    public void testToString_ThrowNotAMockException_1() throws Exception  {
        InvocationMatcher invocationMatcher = ((InvocationMatcher) createInstance("org.mockito.internal.invocation.InvocationMatcher"));
        Object invocation = createInstance("org.mockito.internal.creation.bytebuddy.InterceptedInvocation");
        setField(invocationMatcher, "org.mockito.internal.invocation.InvocationMatcher", "invocation", invocation);
        ArrayList matchers = new ArrayList();
        setField(invocationMatcher, "org.mockito.internal.invocation.InvocationMatcher", "matchers", matchers);
        
        /* This test fails because method [org.mockito.internal.invocation.InvocationMatcher.toString] produces [org.mockito.exceptions.misusing.NotAMockException: Argument should be a mock, but is null!] */
        invocationMatcher.toString();
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
        // Field name is not declared in class java.lang.reflect.Method
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.mockito.internal.invocation.InvocationMatcher.getMethod
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getMethod()
    
    /**
    @utbot.classUnderTest {@link InvocationMatcher}
 * @utbot.methodUnderTest {@link org.mockito.internal.invocation.InvocationMatcher#getMethod()}
 * @utbot.returnsFrom {@code return invocation.getMethod();}
 *  */
    @Test
    public void testGetMethod_ReturnInvocationGetMethod() throws Exception  {
        InvocationMatcher invocationMatcher = ((InvocationMatcher) createInstance("org.mockito.internal.invocation.InvocationMatcher"));
        InvocationImpl invocation = ((InvocationImpl) createInstance("org.mockito.internal.invocation.InvocationImpl"));
        DelegatingMethod method = ((DelegatingMethod) createInstance("org.mockito.internal.creation.DelegatingMethod"));
        setField(invocation, "org.mockito.internal.invocation.InvocationImpl", "method", method);
        setField(invocationMatcher, "org.mockito.internal.invocation.InvocationMatcher", "invocation", invocation);
        
        Method actual = invocationMatcher.getMethod();
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link InvocationMatcher}
 * @utbot.methodUnderTest {@link org.mockito.internal.invocation.InvocationMatcher#getMethod()}
 * @utbot.returnsFrom {@code return invocation.getMethod();}
 *  */
    @Test
    public void testGetMethod_ReturnInvocationGetMethod_1() throws Exception  {
        InvocationMatcher invocationMatcher = ((InvocationMatcher) createInstance("org.mockito.internal.invocation.InvocationMatcher"));
        Object invocation = createInstance("org.mockito.internal.creation.bytebuddy.InterceptedInvocation");
        DelegatingMethod mockitoMethod = ((DelegatingMethod) createInstance("org.mockito.internal.creation.DelegatingMethod"));
        setField(invocation, "org.mockito.internal.creation.bytebuddy.InterceptedInvocation", "mockitoMethod", mockitoMethod);
        setField(invocationMatcher, "org.mockito.internal.invocation.InvocationMatcher", "invocation", invocation);
        
        Method actual = invocationMatcher.getMethod();
        
        assertNull(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getMethod()
    
    /**
    @utbot.classUnderTest {@link InvocationMatcher}
 * @utbot.methodUnderTest {@link org.mockito.internal.invocation.InvocationMatcher#getMethod()}
 * @utbot.throwsException {@link org.mockito.exceptions.base.MockitoException} 
 *  */
    @Test
    public void testGetMethod_ThrowMockitoException() throws Exception  {
        InvocationMatcher invocationMatcher = ((InvocationMatcher) createInstance("org.mockito.internal.invocation.InvocationMatcher"));
        InvocationImpl invocation = ((InvocationImpl) createInstance("org.mockito.internal.invocation.InvocationImpl"));
        SerializableMethod method = ((SerializableMethod) createInstance("org.mockito.internal.invocation.SerializableMethod"));
        Class declaringClass = Object.class;
        setField(method, "org.mockito.internal.invocation.SerializableMethod", "declaringClass", declaringClass);
        String methodName = "";
        setField(method, "org.mockito.internal.invocation.SerializableMethod", "methodName", methodName);
        java.lang.Class[] parameterTypes = {null};
        setField(method, "org.mockito.internal.invocation.SerializableMethod", "parameterTypes", parameterTypes);
        setField(invocation, "org.mockito.internal.invocation.InvocationImpl", "method", method);
        setField(invocationMatcher, "org.mockito.internal.invocation.InvocationMatcher", "invocation", invocation);
        
        /* This test fails because method [org.mockito.internal.invocation.InvocationMatcher.getMethod] produces [org.mockito.exceptions.base.MockitoException: The method class java.lang.Object. does not exists and you should not get to this point.
        Please report this as a defect with an example of how to reproduce it.] */
        invocationMatcher.getMethod();
    }
    
    /**
    @utbot.classUnderTest {@link InvocationMatcher}
 * @utbot.methodUnderTest {@link org.mockito.internal.invocation.InvocationMatcher#getMethod()}
 * @utbot.invokes {@link org.mockito.invocation.Invocation#getMethod()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return invocation.getMethod();
 *  */
    @Test
    public void testGetMethod_ThrowNullPointerException_2() throws Exception  {
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
    public void testGetMethod_ThrowNullPointerException() throws Exception  {
        InvocationMatcher invocationMatcher = ((InvocationMatcher) createInstance("org.mockito.internal.invocation.InvocationMatcher"));
        InvocationImpl invocation = ((InvocationImpl) createInstance("org.mockito.internal.invocation.InvocationImpl"));
        SerializableMethod method = ((SerializableMethod) createInstance("org.mockito.internal.invocation.SerializableMethod"));
        Class declaringClass = Object.class;
        setField(method, "org.mockito.internal.invocation.SerializableMethod", "declaringClass", declaringClass);
        setField(invocation, "org.mockito.internal.invocation.InvocationImpl", "method", method);
        setField(invocationMatcher, "org.mockito.internal.invocation.InvocationMatcher", "invocation", invocation);
        
        /* This test fails because method [org.mockito.internal.invocation.InvocationMatcher.getMethod] produces [java.lang.NullPointerException]
            java.base/java.util.Objects.requireNonNull(Objects.java:208)
            java.base/java.lang.Class.getDeclaredMethod(Class.java:2667)
            org.mockito.internal.invocation.SerializableMethod.getJavaMethod(SerializableMethod.java:76)
            org.mockito.internal.invocation.InvocationImpl.getMethod(InvocationImpl.java:58)
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
        Object invocation = createInstance("org.mockito.internal.creation.bytebuddy.InterceptedInvocation");
        SerializableMethod mockitoMethod = ((SerializableMethod) createInstance("org.mockito.internal.invocation.SerializableMethod"));
        Class declaringClass = Object.class;
        setField(mockitoMethod, "org.mockito.internal.invocation.SerializableMethod", "declaringClass", declaringClass);
        setField(invocation, "org.mockito.internal.creation.bytebuddy.InterceptedInvocation", "mockitoMethod", mockitoMethod);
        setField(invocationMatcher, "org.mockito.internal.invocation.InvocationMatcher", "invocation", invocation);
        
        /* This test fails because method [org.mockito.internal.invocation.InvocationMatcher.getMethod] produces [java.lang.NullPointerException]
            java.base/java.util.Objects.requireNonNull(Objects.java:208)
            java.base/java.lang.Class.getDeclaredMethod(Class.java:2667)
            org.mockito.internal.invocation.SerializableMethod.getJavaMethod(SerializableMethod.java:76)
            org.mockito.internal.creation.bytebuddy.InterceptedInvocation.getMethod(InterceptedInvocation.java:107)
            org.mockito.internal.invocation.InvocationMatcher.getMethod(InvocationMatcher.java:58) */
        invocationMatcher.getMethod();
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method getMethod()
    
    @Test
    public void testGetMethod1() throws Exception  {
        InvocationMatcher invocationMatcher = ((InvocationMatcher) createInstance("org.mockito.internal.invocation.InvocationMatcher"));
        InvocationImpl invocation = ((InvocationImpl) createInstance("org.mockito.internal.invocation.InvocationImpl"));
        SerializableMethod method = ((SerializableMethod) createInstance("org.mockito.internal.invocation.SerializableMethod"));
        Class declaringClass = Object.class;
        setField(method, "org.mockito.internal.invocation.SerializableMethod", "declaringClass", declaringClass);
        String methodName = "";
        setField(method, "org.mockito.internal.invocation.SerializableMethod", "methodName", methodName);
        java.lang.Class[] parameterTypes = {};
        setField(method, "org.mockito.internal.invocation.SerializableMethod", "parameterTypes", parameterTypes);
        setField(invocation, "org.mockito.internal.invocation.InvocationImpl", "method", method);
        setField(invocationMatcher, "org.mockito.internal.invocation.InvocationMatcher", "invocation", invocation);
        
        /* This test fails because method [org.mockito.internal.invocation.InvocationMatcher.getMethod] produces [org.mockito.exceptions.base.MockitoException: The method class java.lang.Object. does not exists and you should not get to this point.
        Please report this as a defect with an example of how to reproduce it.] */
        invocationMatcher.getMethod();
    }
    
    @Test
    public void testGetMethod2() throws Exception  {
        InvocationMatcher invocationMatcher = ((InvocationMatcher) createInstance("org.mockito.internal.invocation.InvocationMatcher"));
        Object invocation = createInstance("org.mockito.internal.creation.bytebuddy.InterceptedInvocation");
        SerializableMethod mockitoMethod = ((SerializableMethod) createInstance("org.mockito.internal.invocation.SerializableMethod"));
        Class declaringClass = Object.class;
        setField(mockitoMethod, "org.mockito.internal.invocation.SerializableMethod", "declaringClass", declaringClass);
        String methodName = "";
        setField(mockitoMethod, "org.mockito.internal.invocation.SerializableMethod", "methodName", methodName);
        setField(invocation, "org.mockito.internal.creation.bytebuddy.InterceptedInvocation", "mockitoMethod", mockitoMethod);
        setField(invocationMatcher, "org.mockito.internal.invocation.InvocationMatcher", "invocation", invocation);
        
        /* This test fails because method [org.mockito.internal.invocation.InvocationMatcher.getMethod] produces [org.mockito.exceptions.base.MockitoException: The method class java.lang.Object. does not exists and you should not get to this point.
        Please report this as a defect with an example of how to reproduce it.] */
        invocationMatcher.getMethod();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.mockito.internal.invocation.InvocationMatcher.getLocation
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getLocation()
    
    /**
    @utbot.classUnderTest {@link InvocationMatcher}
 * @utbot.methodUnderTest {@link org.mockito.internal.invocation.InvocationMatcher#getLocation()}
 * @utbot.returnsFrom {@code return invocation.getLocation();}
 *  */
    @Test
    public void testGetLocation_ReturnInvocationGetLocation() throws Exception  {
        InvocationMatcher invocationMatcher = ((InvocationMatcher) createInstance("org.mockito.internal.invocation.InvocationMatcher"));
        InvocationImpl invocation = ((InvocationImpl) createInstance("org.mockito.internal.invocation.InvocationImpl"));
        LocationImpl location = ((LocationImpl) createInstance("org.mockito.internal.debugging.LocationImpl"));
        setField(invocation, "org.mockito.internal.invocation.InvocationImpl", "location", location);
        setField(invocationMatcher, "org.mockito.internal.invocation.InvocationMatcher", "invocation", invocation);
        
        LocationImpl actual = ((LocationImpl) invocationMatcher.getLocation());
        
        Throwable actualStackTraceHolder = ((Throwable) getFieldValue(actual, "org.mockito.internal.debugging.LocationImpl", "stackTraceHolder"));
        assertNull(actualStackTraceHolder);
        
        StackTraceFilter actualStackTraceFilter = ((StackTraceFilter) getFieldValue(actual, "org.mockito.internal.debugging.LocationImpl", "stackTraceFilter"));
        assertNull(actualStackTraceFilter);
        
    }
    
    /**
    @utbot.classUnderTest {@link InvocationMatcher}
 * @utbot.methodUnderTest {@link org.mockito.internal.invocation.InvocationMatcher#getLocation()}
 * @utbot.returnsFrom {@code return invocation.getLocation();}
 *  */
    @Test
    public void testGetLocation_ReturnInvocationGetLocation_1() throws Exception  {
        InvocationMatcher invocationMatcher = ((InvocationMatcher) createInstance("org.mockito.internal.invocation.InvocationMatcher"));
        Object invocation = createInstance("org.mockito.internal.creation.bytebuddy.InterceptedInvocation");
        LocationImpl location = ((LocationImpl) createInstance("org.mockito.internal.debugging.LocationImpl"));
        setField(invocation, "org.mockito.internal.creation.bytebuddy.InterceptedInvocation", "location", location);
        setField(invocationMatcher, "org.mockito.internal.invocation.InvocationMatcher", "invocation", invocation);
        
        LocationImpl actual = ((LocationImpl) invocationMatcher.getLocation());
        
        Throwable actualStackTraceHolder = ((Throwable) getFieldValue(actual, "org.mockito.internal.debugging.LocationImpl", "stackTraceHolder"));
        assertNull(actualStackTraceHolder);
        
        StackTraceFilter actualStackTraceFilter = ((StackTraceFilter) getFieldValue(actual, "org.mockito.internal.debugging.LocationImpl", "stackTraceFilter"));
        assertNull(actualStackTraceFilter);
        
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getLocation()
    
    /**
    @utbot.classUnderTest {@link InvocationMatcher}
 * @utbot.methodUnderTest {@link org.mockito.internal.invocation.InvocationMatcher#getLocation()}
 * @utbot.invokes {@link org.mockito.invocation.Invocation#getLocation()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return invocation.getLocation();
 *  */
    @Test
    public void testGetLocation_ThrowNullPointerException() throws Exception  {
        InvocationMatcher invocationMatcher = ((InvocationMatcher) createInstance("org.mockito.internal.invocation.InvocationMatcher"));
        
        /* This test fails because method [org.mockito.internal.invocation.InvocationMatcher.getLocation] produces [java.lang.NullPointerException]
            org.mockito.internal.invocation.InvocationMatcher.getLocation(InvocationMatcher.java:128) */
        invocationMatcher.getLocation();
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
        
                java.lang.reflect.Method methodForGetDeclaredFields1107470385565399 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields1107470385565399.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass1107470385570500 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1107470385565399.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1107470385570500).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
    
    private static Object getFieldValue(Object obj, String fieldClassName, String fieldName) throws ClassNotFoundException, NoSuchMethodException, java.lang.reflect.InvocationTargetException, IllegalAccessException, NoSuchFieldException {
        Class<?> clazz = Class.forName(fieldClassName);
        java.lang.reflect.Field field = clazz.getDeclaredField(fieldName);
        
        field.setAccessible(true);
        
        java.lang.reflect.Field modifiersField;
        
            java.lang.reflect.Method methodForGetDeclaredFields1107470388875100 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields1107470388875100.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass1107470388878600 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1107470388875100.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1107470388878600).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
        modifiersField.setAccessible(true);
        modifiersField.setInt(field, field.getModifiers() & ~java.lang.reflect.Modifier.FINAL);
        
        return field.get(obj);
    }
    
    private static Object getUnsafeInstance() throws ClassNotFoundException, NoSuchFieldException, IllegalAccessException {
        java.lang.reflect.Field f = Class.forName("sun.misc.Unsafe").getDeclaredField("theUnsafe");
        f.setAccessible(true);
        return f.get(null);
    }
    ///endregion
}

