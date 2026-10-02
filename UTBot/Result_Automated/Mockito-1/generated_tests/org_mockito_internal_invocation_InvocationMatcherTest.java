package org.mockito.internal.invocation;

import org.junit.Test;
import org.mockito.internal.creation.DelegatingMethod;
import java.lang.reflect.Method;
import org.mockito.internal.debugging.LocationImpl;
import org.mockito.internal.exceptions.stacktrace.StackTraceFilter;
import java.util.List;
import org.mockito.internal.matchers.LocalizedMatcher;
import java.util.ArrayList;
import java.util.LinkedList;
import org.mockito.invocation.Invocation;
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

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static java.util.Collections.emptyList;

public final class org_mockito_internal_invocation_InvocationMatcherTest {
    ///region Test suites for executable org.mockito.internal.invocation.InvocationMatcher.toString
    
    ///region OTHER: ERROR SUITE for method toString()
    
    @Test
    public void testToString1() throws Exception  {
        InvocationMatcher invocationMatcher = ((InvocationMatcher) createInstance("org.mockito.internal.invocation.InvocationMatcher"));
        InvocationImpl invocation = ((InvocationImpl) createInstance("org.mockito.internal.invocation.InvocationImpl"));
        Object mock = createInstance("java.lang.Object");
        setField(invocation, "org.mockito.internal.invocation.InvocationImpl", "mock", mock);
        setField(invocationMatcher, "org.mockito.internal.invocation.InvocationMatcher", "invocation", invocation);
        
        /* This test fails because method [org.mockito.internal.invocation.InvocationMatcher.toString] produces [org.mockito.exceptions.misusing.NotAMockException: Argument should be a mock, but is: class java.lang.Object] */
        invocationMatcher.toString();
    }
    
    @Test
    public void testToString2() throws Exception  {
        InvocationMatcher invocationMatcher = ((InvocationMatcher) createInstance("org.mockito.internal.invocation.InvocationMatcher"));
        Object invocation = createInstance("org.mockito.internal.creation.bytebuddy.InterceptedInvocation");
        Object mock = createInstance("java.lang.Object");
        setField(invocation, "org.mockito.internal.creation.bytebuddy.InterceptedInvocation", "mock", mock);
        setField(invocationMatcher, "org.mockito.internal.invocation.InvocationMatcher", "invocation", invocation);
        
        /* This test fails because method [org.mockito.internal.invocation.InvocationMatcher.toString] produces [org.mockito.exceptions.misusing.NotAMockException: Argument should be a mock, but is: class java.lang.Object] */
        invocationMatcher.toString();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.mockito.internal.invocation.InvocationMatcher.matches
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method matches(org.mockito.invocation.Invocation)
    
    /**
    @utbot.classUnderTest {@link InvocationMatcher}
 * @utbot.methodUnderTest {@link org.mockito.internal.invocation.InvocationMatcher#matches(org.mockito.invocation.Invocation)}
 * @utbot.returnsFrom {@code return invocation.getMock().equals(actual.getMock()) && hasSameMethod(actual) && new ArgumentsComparator().argumentsMatch(this, actual);}
 *  */
    @Test
    public void testMatches_ReturnInvocationGetMockEqualsAndHasSameMethodAndNewArgumentsComparatorArgumentsMatch() throws Exception  {
        InvocationMatcher invocationMatcher = ((InvocationMatcher) createInstance("org.mockito.internal.invocation.InvocationMatcher"));
        InvocationImpl invocation = ((InvocationImpl) createInstance("org.mockito.internal.invocation.InvocationImpl"));
        Integer mock = 0;
        setField(invocation, "org.mockito.internal.invocation.InvocationImpl", "mock", mock);
        setField(invocationMatcher, "org.mockito.internal.invocation.InvocationMatcher", "invocation", invocation);
        InvocationImpl invocationImpl = ((InvocationImpl) createInstance("org.mockito.internal.invocation.InvocationImpl"));
        
        boolean actual = invocationMatcher.matches(invocationImpl);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link InvocationMatcher}
 * @utbot.methodUnderTest {@link org.mockito.internal.invocation.InvocationMatcher#matches(org.mockito.invocation.Invocation)}
 * @utbot.invokes {@link org.mockito.internal.invocation.InvocationMatcher#hasSameMethod(org.mockito.invocation.Invocation)}
 * @utbot.returnsFrom {@code return invocation.getMock().equals(actual.getMock()) && hasSameMethod(actual) && new ArgumentsComparator().argumentsMatch(this, actual);}
 *  */
    @Test
    public void testMatches_InvocationMatcherHasSameMethod() throws Exception  {
        InvocationMatcher invocationMatcher = ((InvocationMatcher) createInstance("org.mockito.internal.invocation.InvocationMatcher"));
        InvocationImpl invocation = ((InvocationImpl) createInstance("org.mockito.internal.invocation.InvocationImpl"));
        Integer mock = 0;
        setField(invocation, "org.mockito.internal.invocation.InvocationImpl", "mock", mock);
        DelegatingMethod method = ((DelegatingMethod) createInstance("org.mockito.internal.creation.DelegatingMethod"));
        Method method1 = ((Method) createInstance("java.lang.reflect.Method"));
        setField(method, "org.mockito.internal.creation.DelegatingMethod", "method", method1);
        setField(invocation, "org.mockito.internal.invocation.InvocationImpl", "method", method);
        setField(invocationMatcher, "org.mockito.internal.invocation.InvocationMatcher", "invocation", invocation);
        InvocationImpl invocationImpl = ((InvocationImpl) createInstance("org.mockito.internal.invocation.InvocationImpl"));
        setField(invocationImpl, "org.mockito.internal.invocation.InvocationImpl", "mock", mock);
        DelegatingMethod method2 = ((DelegatingMethod) createInstance("org.mockito.internal.creation.DelegatingMethod"));
        setField(invocationImpl, "org.mockito.internal.invocation.InvocationImpl", "method", method2);
        
        boolean actual = invocationMatcher.matches(invocationImpl);
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method matches(org.mockito.invocation.Invocation)
    
    /**
    @utbot.classUnderTest {@link InvocationMatcher}
 * @utbot.methodUnderTest {@link org.mockito.internal.invocation.InvocationMatcher#matches(org.mockito.invocation.Invocation)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return invocation.getMock().equals(actual.getMock()) && hasSameMethod(actual) && new ArgumentsComparator().argumentsMatch(this, actual);
 *  */
    @Test
    public void testMatches_ThrowNullPointerException_2() throws Exception  {
        InvocationMatcher invocationMatcher = ((InvocationMatcher) createInstance("org.mockito.internal.invocation.InvocationMatcher"));
        
        /* This test fails because method [org.mockito.internal.invocation.InvocationMatcher.matches] produces [java.lang.NullPointerException]
            org.mockito.internal.invocation.InvocationMatcher.matches(InvocationMatcher.java:80) */
        invocationMatcher.matches(null);
    }
    
    /**
    @utbot.classUnderTest {@link InvocationMatcher}
 * @utbot.methodUnderTest {@link org.mockito.internal.invocation.InvocationMatcher#matches(org.mockito.invocation.Invocation)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return invocation.getMock().equals(actual.getMock()) && hasSameMethod(actual) && new ArgumentsComparator().argumentsMatch(this, actual);
 *  */
    @Test
    public void testMatches_ThrowNullPointerException() throws Exception  {
        InvocationMatcher invocationMatcher = ((InvocationMatcher) createInstance("org.mockito.internal.invocation.InvocationMatcher"));
        InvocationImpl invocation = ((InvocationImpl) createInstance("org.mockito.internal.invocation.InvocationImpl"));
        setField(invocationMatcher, "org.mockito.internal.invocation.InvocationMatcher", "invocation", invocation);
        
        /* This test fails because method [org.mockito.internal.invocation.InvocationMatcher.matches] produces [java.lang.NullPointerException]
            org.mockito.internal.invocation.InvocationMatcher.matches(InvocationMatcher.java:80) */
        invocationMatcher.matches(null);
    }
    
    /**
    @utbot.classUnderTest {@link InvocationMatcher}
 * @utbot.methodUnderTest {@link org.mockito.internal.invocation.InvocationMatcher#matches(org.mockito.invocation.Invocation)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return invocation.getMock().equals(actual.getMock()) && hasSameMethod(actual) && new ArgumentsComparator().argumentsMatch(this, actual);
 *  */
    @Test
    public void testMatches_ThrowNullPointerException_1() throws Exception  {
        InvocationMatcher invocationMatcher = ((InvocationMatcher) createInstance("org.mockito.internal.invocation.InvocationMatcher"));
        Object invocation = createInstance("org.mockito.internal.creation.bytebuddy.InterceptedInvocation");
        setField(invocationMatcher, "org.mockito.internal.invocation.InvocationMatcher", "invocation", invocation);
        
        /* This test fails because method [org.mockito.internal.invocation.InvocationMatcher.matches] produces [java.lang.NullPointerException]
            org.mockito.internal.invocation.InvocationMatcher.matches(InvocationMatcher.java:80) */
        invocationMatcher.matches(null);
    }
    
    /**
    @utbot.classUnderTest {@link InvocationMatcher}
 * @utbot.methodUnderTest {@link org.mockito.internal.invocation.InvocationMatcher#matches(org.mockito.invocation.Invocation)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return invocation.getMock().equals(actual.getMock()) && hasSameMethod(actual) && new ArgumentsComparator().argumentsMatch(this, actual);
 *  */
    @Test
    public void testMatches_ThrowNullPointerException_3() throws Exception  {
        InvocationMatcher invocationMatcher = ((InvocationMatcher) createInstance("org.mockito.internal.invocation.InvocationMatcher"));
        InvocationImpl invocation = ((InvocationImpl) createInstance("org.mockito.internal.invocation.InvocationImpl"));
        setField(invocationMatcher, "org.mockito.internal.invocation.InvocationMatcher", "invocation", invocation);
        InvocationImpl invocationImpl = ((InvocationImpl) createInstance("org.mockito.internal.invocation.InvocationImpl"));
        
        /* This test fails because method [org.mockito.internal.invocation.InvocationMatcher.matches] produces [java.lang.NullPointerException]
            org.mockito.internal.invocation.InvocationImpl.getMethod(InvocationImpl.java:58)
            org.mockito.internal.invocation.InvocationMatcher.hasSameMethod(InvocationMatcher.java:114)
            org.mockito.internal.invocation.InvocationMatcher.matches(InvocationMatcher.java:81) */
        invocationMatcher.matches(invocationImpl);
    }
    
    /**
    @utbot.classUnderTest {@link InvocationMatcher}
 * @utbot.methodUnderTest {@link org.mockito.internal.invocation.InvocationMatcher#matches(org.mockito.invocation.Invocation)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return invocation.getMock().equals(actual.getMock()) && hasSameMethod(actual) && new ArgumentsComparator().argumentsMatch(this, actual);
 *  */
    @Test
    public void testMatches_ThrowNullPointerException_5() throws Throwable  {
        InvocationMatcher invocationMatcher = ((InvocationMatcher) createInstance("org.mockito.internal.invocation.InvocationMatcher"));
        InvocationImpl invocation = ((InvocationImpl) createInstance("org.mockito.internal.invocation.InvocationImpl"));
        setField(invocationMatcher, "org.mockito.internal.invocation.InvocationMatcher", "invocation", invocation);
        Object interceptedInvocation = createInstance("org.mockito.internal.creation.bytebuddy.InterceptedInvocation");
        
        /* This test fails because method [org.mockito.internal.invocation.InvocationMatcher.matches] produces [java.lang.NullPointerException]
            org.mockito.internal.invocation.InvocationImpl.getMethod(InvocationImpl.java:58)
            org.mockito.internal.invocation.InvocationMatcher.hasSameMethod(InvocationMatcher.java:114)
            org.mockito.internal.invocation.InvocationMatcher.matches(InvocationMatcher.java:81) */
        Class invocationMatcherClazz = Class.forName("org.mockito.internal.invocation.InvocationMatcher");
        Class interceptedInvocationType = Class.forName("org.mockito.invocation.Invocation");
        Method matchesMethod = invocationMatcherClazz.getDeclaredMethod("matches", interceptedInvocationType);
        matchesMethod.setAccessible(true);
        java.lang.Object[] matchesMethodArguments = new java.lang.Object[1];
        matchesMethodArguments[0] = interceptedInvocation;
        try {
            matchesMethod.invoke(invocationMatcher, matchesMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link InvocationMatcher}
 * @utbot.methodUnderTest {@link org.mockito.internal.invocation.InvocationMatcher#matches(org.mockito.invocation.Invocation)}
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test
    public void testMatches_ThrowNullPointerException_4() throws Exception  {
        InvocationMatcher invocationMatcher = ((InvocationMatcher) createInstance("org.mockito.internal.invocation.InvocationMatcher"));
        InvocationImpl invocation = ((InvocationImpl) createInstance("org.mockito.internal.invocation.InvocationImpl"));
        Character mock = '\u0000';
        setField(invocation, "org.mockito.internal.invocation.InvocationImpl", "mock", mock);
        SerializableMethod method = ((SerializableMethod) createInstance("org.mockito.internal.invocation.SerializableMethod"));
        Class declaringClass = Object.class;
        setField(method, "org.mockito.internal.invocation.SerializableMethod", "declaringClass", declaringClass);
        setField(invocation, "org.mockito.internal.invocation.InvocationImpl", "method", method);
        setField(invocationMatcher, "org.mockito.internal.invocation.InvocationMatcher", "invocation", invocation);
        InvocationImpl invocationImpl = ((InvocationImpl) createInstance("org.mockito.internal.invocation.InvocationImpl"));
        setField(invocationImpl, "org.mockito.internal.invocation.InvocationImpl", "mock", mock);
        
        /* This test fails because method [org.mockito.internal.invocation.InvocationMatcher.matches] produces [java.lang.NullPointerException]
            java.base/java.util.Objects.requireNonNull(Objects.java:208)
            java.base/java.lang.Class.getDeclaredMethod(Class.java:2667)
            org.mockito.internal.invocation.SerializableMethod.getJavaMethod(SerializableMethod.java:76)
            org.mockito.internal.invocation.InvocationImpl.getMethod(InvocationImpl.java:58)
            org.mockito.internal.invocation.InvocationMatcher.hasSameMethod(InvocationMatcher.java:114)
            org.mockito.internal.invocation.InvocationMatcher.matches(InvocationMatcher.java:81) */
        invocationMatcher.matches(invocationImpl);
    }
    
    /**
    @utbot.classUnderTest {@link InvocationMatcher}
 * @utbot.methodUnderTest {@link org.mockito.internal.invocation.InvocationMatcher#matches(org.mockito.invocation.Invocation)}
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test
    public void testMatches_ThrowNullPointerException_6() throws Exception  {
        InvocationMatcher invocationMatcher = ((InvocationMatcher) createInstance("org.mockito.internal.invocation.InvocationMatcher"));
        InvocationImpl invocation = ((InvocationImpl) createInstance("org.mockito.internal.invocation.InvocationImpl"));
        Integer mock = 0;
        setField(invocation, "org.mockito.internal.invocation.InvocationImpl", "mock", mock);
        DelegatingMethod method = ((DelegatingMethod) createInstance("org.mockito.internal.creation.DelegatingMethod"));
        setField(invocation, "org.mockito.internal.invocation.InvocationImpl", "method", method);
        setField(invocationMatcher, "org.mockito.internal.invocation.InvocationMatcher", "invocation", invocation);
        InvocationImpl invocationImpl = ((InvocationImpl) createInstance("org.mockito.internal.invocation.InvocationImpl"));
        setField(invocationImpl, "org.mockito.internal.invocation.InvocationImpl", "mock", mock);
        SerializableMethod method1 = ((SerializableMethod) createInstance("org.mockito.internal.invocation.SerializableMethod"));
        Class declaringClass = Object.class;
        setField(method1, "org.mockito.internal.invocation.SerializableMethod", "declaringClass", declaringClass);
        setField(invocationImpl, "org.mockito.internal.invocation.InvocationImpl", "method", method1);
        
        /* This test fails because method [org.mockito.internal.invocation.InvocationMatcher.matches] produces [java.lang.NullPointerException]
            java.base/java.util.Objects.requireNonNull(Objects.java:208)
            java.base/java.lang.Class.getDeclaredMethod(Class.java:2667)
            org.mockito.internal.invocation.SerializableMethod.getJavaMethod(SerializableMethod.java:76)
            org.mockito.internal.invocation.InvocationImpl.getMethod(InvocationImpl.java:58)
            org.mockito.internal.invocation.InvocationMatcher.hasSameMethod(InvocationMatcher.java:115)
            org.mockito.internal.invocation.InvocationMatcher.matches(InvocationMatcher.java:81) */
        invocationMatcher.matches(invocationImpl);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method matches(org.mockito.invocation.Invocation)
    
    @Test
    public void testMatches1() throws Exception  {
        InvocationMatcher invocationMatcher = ((InvocationMatcher) createInstance("org.mockito.internal.invocation.InvocationMatcher"));
        InvocationImpl invocation = ((InvocationImpl) createInstance("org.mockito.internal.invocation.InvocationImpl"));
        Character mock = '\u0000';
        setField(invocation, "org.mockito.internal.invocation.InvocationImpl", "mock", mock);
        SerializableMethod method = ((SerializableMethod) createInstance("org.mockito.internal.invocation.SerializableMethod"));
        Class declaringClass = Object.class;
        setField(method, "org.mockito.internal.invocation.SerializableMethod", "declaringClass", declaringClass);
        String methodName = "";
        setField(method, "org.mockito.internal.invocation.SerializableMethod", "methodName", methodName);
        java.lang.Class[] parameterTypes = {null, null, null, null, null, null, null, null, null};
        setField(method, "org.mockito.internal.invocation.SerializableMethod", "parameterTypes", parameterTypes);
        setField(invocation, "org.mockito.internal.invocation.InvocationImpl", "method", method);
        setField(invocationMatcher, "org.mockito.internal.invocation.InvocationMatcher", "invocation", invocation);
        InvocationImpl invocationImpl = ((InvocationImpl) createInstance("org.mockito.internal.invocation.InvocationImpl"));
        setField(invocationImpl, "org.mockito.internal.invocation.InvocationImpl", "mock", mock);
        
        /* This test fails because method [org.mockito.internal.invocation.InvocationMatcher.matches] produces [org.mockito.exceptions.base.MockitoException: The method class java.lang.Object. does not exists and you should not get to this point.
        Please report this as a defect with an example of how to reproduce it.] */
        invocationMatcher.matches(invocationImpl);
    }
    
    @Test
    public void testMatches2() throws Throwable  {
        InvocationMatcher invocationMatcher = ((InvocationMatcher) createInstance("org.mockito.internal.invocation.InvocationMatcher"));
        InvocationImpl invocation = ((InvocationImpl) createInstance("org.mockito.internal.invocation.InvocationImpl"));
        Integer mock = 0;
        setField(invocation, "org.mockito.internal.invocation.InvocationImpl", "mock", mock);
        SerializableMethod method = ((SerializableMethod) createInstance("org.mockito.internal.invocation.SerializableMethod"));
        Class declaringClass = Object.class;
        setField(method, "org.mockito.internal.invocation.SerializableMethod", "declaringClass", declaringClass);
        String methodName = "";
        setField(method, "org.mockito.internal.invocation.SerializableMethod", "methodName", methodName);
        java.lang.Class[] parameterTypes = {null, null, null, null, null, null, null, null, null};
        setField(method, "org.mockito.internal.invocation.SerializableMethod", "parameterTypes", parameterTypes);
        setField(invocation, "org.mockito.internal.invocation.InvocationImpl", "method", method);
        setField(invocationMatcher, "org.mockito.internal.invocation.InvocationMatcher", "invocation", invocation);
        Object interceptedInvocation = createInstance("org.mockito.internal.creation.bytebuddy.InterceptedInvocation");
        setField(interceptedInvocation, "org.mockito.internal.creation.bytebuddy.InterceptedInvocation", "mock", mock);
        
        /* This test fails because method [org.mockito.internal.invocation.InvocationMatcher.matches] produces [org.mockito.exceptions.base.MockitoException: The method class java.lang.Object. does not exists and you should not get to this point.
        Please report this as a defect with an example of how to reproduce it.] */
        Class invocationMatcherClazz = Class.forName("org.mockito.internal.invocation.InvocationMatcher");
        Class interceptedInvocationType = Class.forName("org.mockito.invocation.Invocation");
        Method matchesMethod = invocationMatcherClazz.getDeclaredMethod("matches", interceptedInvocationType);
        matchesMethod.setAccessible(true);
        java.lang.Object[] matchesMethodArguments = new java.lang.Object[1];
        matchesMethodArguments[0] = interceptedInvocation;
        try {
            matchesMethod.invoke(invocationMatcher, matchesMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testMatches3() throws Exception  {
        InvocationMatcher invocationMatcher = ((InvocationMatcher) createInstance("org.mockito.internal.invocation.InvocationMatcher"));
        InvocationImpl invocation = ((InvocationImpl) createInstance("org.mockito.internal.invocation.InvocationImpl"));
        Character mock = '\u0000';
        setField(invocation, "org.mockito.internal.invocation.InvocationImpl", "mock", mock);
        SerializableMethod method = ((SerializableMethod) createInstance("org.mockito.internal.invocation.SerializableMethod"));
        Class declaringClass = Object.class;
        setField(method, "org.mockito.internal.invocation.SerializableMethod", "declaringClass", declaringClass);
        String methodName = "";
        setField(method, "org.mockito.internal.invocation.SerializableMethod", "methodName", methodName);
        setField(invocation, "org.mockito.internal.invocation.InvocationImpl", "method", method);
        setField(invocationMatcher, "org.mockito.internal.invocation.InvocationMatcher", "invocation", invocation);
        InvocationImpl invocationImpl = ((InvocationImpl) createInstance("org.mockito.internal.invocation.InvocationImpl"));
        setField(invocationImpl, "org.mockito.internal.invocation.InvocationImpl", "mock", mock);
        
        /* This test fails because method [org.mockito.internal.invocation.InvocationMatcher.matches] produces [org.mockito.exceptions.base.MockitoException: The method class java.lang.Object. does not exists and you should not get to this point.
        Please report this as a defect with an example of how to reproduce it.] */
        invocationMatcher.matches(invocationImpl);
    }
    
    @Test
    public void testMatches4() throws Throwable  {
        InvocationMatcher invocationMatcher = ((InvocationMatcher) createInstance("org.mockito.internal.invocation.InvocationMatcher"));
        InvocationImpl invocation = ((InvocationImpl) createInstance("org.mockito.internal.invocation.InvocationImpl"));
        Integer mock = 0;
        setField(invocation, "org.mockito.internal.invocation.InvocationImpl", "mock", mock);
        SerializableMethod method = ((SerializableMethod) createInstance("org.mockito.internal.invocation.SerializableMethod"));
        Class declaringClass = Object.class;
        setField(method, "org.mockito.internal.invocation.SerializableMethod", "declaringClass", declaringClass);
        String methodName = "";
        setField(method, "org.mockito.internal.invocation.SerializableMethod", "methodName", methodName);
        setField(invocation, "org.mockito.internal.invocation.InvocationImpl", "method", method);
        setField(invocationMatcher, "org.mockito.internal.invocation.InvocationMatcher", "invocation", invocation);
        Object interceptedInvocation = createInstance("org.mockito.internal.creation.bytebuddy.InterceptedInvocation");
        setField(interceptedInvocation, "org.mockito.internal.creation.bytebuddy.InterceptedInvocation", "mock", mock);
        
        /* This test fails because method [org.mockito.internal.invocation.InvocationMatcher.matches] produces [org.mockito.exceptions.base.MockitoException: The method class java.lang.Object. does not exists and you should not get to this point.
        Please report this as a defect with an example of how to reproduce it.] */
        Class invocationMatcherClazz = Class.forName("org.mockito.internal.invocation.InvocationMatcher");
        Class interceptedInvocationType = Class.forName("org.mockito.invocation.Invocation");
        Method matchesMethod = invocationMatcherClazz.getDeclaredMethod("matches", interceptedInvocationType);
        matchesMethod.setAccessible(true);
        java.lang.Object[] matchesMethodArguments = new java.lang.Object[1];
        matchesMethodArguments[0] = interceptedInvocation;
        try {
            matchesMethod.invoke(invocationMatcher, matchesMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testMatches5() throws Exception  {
        InvocationMatcher invocationMatcher = ((InvocationMatcher) createInstance("org.mockito.internal.invocation.InvocationMatcher"));
        Object invocation = createInstance("org.mockito.internal.creation.bytebuddy.InterceptedInvocation");
        Integer mock = 0;
        setField(invocation, "org.mockito.internal.creation.bytebuddy.InterceptedInvocation", "mock", mock);
        DelegatingMethod mockitoMethod = ((DelegatingMethod) createInstance("org.mockito.internal.creation.DelegatingMethod"));
        setField(invocation, "org.mockito.internal.creation.bytebuddy.InterceptedInvocation", "mockitoMethod", mockitoMethod);
        setField(invocationMatcher, "org.mockito.internal.invocation.InvocationMatcher", "invocation", invocation);
        InvocationImpl invocationImpl = ((InvocationImpl) createInstance("org.mockito.internal.invocation.InvocationImpl"));
        setField(invocationImpl, "org.mockito.internal.invocation.InvocationImpl", "mock", mock);
        setField(invocationImpl, "org.mockito.internal.invocation.InvocationImpl", "method", mockitoMethod);
        
        /* This test fails because method [org.mockito.internal.invocation.InvocationMatcher.matches] produces [java.lang.NullPointerException]
            org.mockito.internal.invocation.InvocationMatcher.hasSameMethod(InvocationMatcher.java:117)
            org.mockito.internal.invocation.InvocationMatcher.matches(InvocationMatcher.java:81) */
        invocationMatcher.matches(invocationImpl);
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
    public void testGetMethod_ThrowNullPointerException_1() throws Exception  {
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
    
    ///region Test suites for executable org.mockito.internal.invocation.InvocationMatcher.isVarargMatcher
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method isVarargMatcher(org.hamcrest.Matcher)
    
    /**
    @utbot.classUnderTest {@link InvocationMatcher}
 * @utbot.methodUnderTest {@link org.mockito.internal.invocation.InvocationMatcher#isVarargMatcher(org.hamcrest.Matcher)}
 * @utbot.executesCondition {@code (actualMatcher instanceof MatcherDecorator): True}
 * @utbot.invokes {@link org.mockito.internal.matchers.MatcherDecorator#getActualMatcher()}
 * @utbot.returnsFrom {@code return actualMatcher instanceof VarargMatcher;}
 *  */
    @Test
    public void testIsVarargMatcher_ActualMatcherInstanceOfMatcherDecorator() throws Exception  {
        InvocationMatcher invocationMatcher = ((InvocationMatcher) createInstance("org.mockito.internal.invocation.InvocationMatcher"));
        LocalizedMatcher localizedMatcher = ((LocalizedMatcher) createInstance("org.mockito.internal.matchers.LocalizedMatcher"));
        
        Class invocationMatcherClazz = Class.forName("org.mockito.internal.invocation.InvocationMatcher");
        Class localizedMatcherType = Class.forName("org.hamcrest.Matcher");
        Method isVarargMatcherMethod = invocationMatcherClazz.getDeclaredMethod("isVarargMatcher", localizedMatcherType);
        isVarargMatcherMethod.setAccessible(true);
        java.lang.Object[] isVarargMatcherMethodArguments = new java.lang.Object[1];
        isVarargMatcherMethodArguments[0] = localizedMatcher;
        boolean actual = ((Boolean) isVarargMatcherMethod.invoke(invocationMatcher, isVarargMatcherMethodArguments));
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region Errors report for isVarargMatcher
    
    public void testIsVarargMatcher_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.mockito.internal.invocation.InvocationMatcher.isVariableArgument
    
    ///region Errors report for isVariableArgument
    
    public void testIsVariableArgument_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 32 occurrences of:
        // Concrete execution failed
        
        // 12 occurrences of:
        // Default concrete execution failed
        
        // 1 occurrences of:
        // Field modifiers is not declared in class java.lang.reflect.Method
        
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
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.mockito.internal.invocation.InvocationMatcher.captureArgumentsFrom
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method captureArgumentsFrom(org.mockito.invocation.Invocation)
    
    /**
    @utbot.classUnderTest {@link InvocationMatcher}
 * @utbot.methodUnderTest {@link org.mockito.internal.invocation.InvocationMatcher#captureArgumentsFrom(org.mockito.invocation.Invocation)}
 * @utbot.executesCondition {@code (invocation.getMethod().isVarArgs()): False}
 * @utbot.invokes {@link org.mockito.invocation.Invocation#getMethod()}
 * @utbot.invokes {@link java.lang.reflect.Method#isVarArgs()}
 * @utbot.iterates iterate the loop {@code for(int position = 0; position < matchers.size(); position++)} once
 *  */
    @Test
    public void testCaptureArgumentsFrom_NotInvocationGetMethodIsVarArgs() throws Exception  {
        InvocationMatcher invocationMatcher = ((InvocationMatcher) createInstance("org.mockito.internal.invocation.InvocationMatcher"));
        ArrayList matchers = new ArrayList();
        setField(invocationMatcher, "org.mockito.internal.invocation.InvocationMatcher", "matchers", matchers);
        InvocationImpl invocationImpl = ((InvocationImpl) createInstance("org.mockito.internal.invocation.InvocationImpl"));
        DelegatingMethod method = ((DelegatingMethod) createInstance("org.mockito.internal.creation.DelegatingMethod"));
        Method method1 = ((Method) createInstance("java.lang.reflect.Method"));
        setField(method, "org.mockito.internal.creation.DelegatingMethod", "method", method1);
        setField(invocationImpl, "org.mockito.internal.invocation.InvocationImpl", "method", method);
        
        invocationMatcher.captureArgumentsFrom(invocationImpl);
    }
    ///endregion
    
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
        // 38 occurrences of:
        // Concrete execution failed
        
        // 7 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
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
        
                java.lang.reflect.Method methodForGetDeclaredFields1104857694224800 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields1104857694224800.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass1104857694238000 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1104857694224800.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1104857694238000).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
        modifiersField.setAccessible(true);
        modifiersField.setInt(field, field.getModifiers() & ~java.lang.reflect.Modifier.FINAL);
    
        field.setAccessible(true);
        field.set(object, fieldValue);
    }
    
    private static Object getFieldValue(Object obj, String fieldClassName, String fieldName) throws ClassNotFoundException, NoSuchMethodException, java.lang.reflect.InvocationTargetException, IllegalAccessException, NoSuchFieldException {
        Class<?> clazz = Class.forName(fieldClassName);
        java.lang.reflect.Field field = clazz.getDeclaredField(fieldName);
        
        field.setAccessible(true);
        
        java.lang.reflect.Field modifiersField;
        
            java.lang.reflect.Method methodForGetDeclaredFields1104857694810800 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields1104857694810800.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass1104857694815300 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1104857694810800.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1104857694815300).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
        modifiersField.setAccessible(true);
        modifiersField.setInt(field, field.getModifiers() & ~java.lang.reflect.Modifier.FINAL);
        
        return field.get(obj);
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

