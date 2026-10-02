package org.mockito.internal;

import org.junit.Test;
import org.mockito.internal.progress.ThreadSafeMockingProgress;
import org.mockito.internal.util.MockUtil;
import org.mockito.exceptions.Reporter;
import org.mockito.exceptions.misusing.NullInsteadOfMockException;
import org.mockito.exceptions.misusing.NotAMockException;
import org.mockito.internal.verification.NoMoreInteractions;
import org.mockito.internal.verification.AtLeast;
import java.util.LinkedList;
import org.mockito.internal.verification.InOrderWrapper;
import java.lang.reflect.Method;
import java.lang.reflect.InvocationTargetException;
import org.mockito.exceptions.base.MockitoException;
import org.mockito.internal.progress.MockingProgressImpl;
import org.mockito.internal.debugging.Location;
import org.mockito.exceptions.misusing.UnfinishedStubbingException;
import java.util.List;
import java.util.ArrayList;
import org.mockito.internal.stubbing.ConsecutiveStubbing;
import org.mockito.internal.progress.MockingProgress;
import org.mockito.internal.progress.IOngoingStubbing;
import org.mockito.internal.creation.jmock.ClassImposterizer;
import org.objenesis.ObjenesisStd;
import org.objenesis.strategy.StdInstantiatorStrategy;
import java.util.HashMap;
import org.mockito.internal.util.MockCreationValidator;
import org.mockito.internal.creation.MockSettingsImpl;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

import static java.util.Collections.emptyList;
import static org.junit.Assert.assertNull;

public final class org_mockito_internal_MockitoCoreTest {
    ///region Test suites for executable org.mockito.internal.MockitoCore.reset
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method reset([Ljava.lang.Object;)
    
    /**
    @utbot.classUnderTest {@link MockitoCore}
 * @utbot.methodUnderTest {@link org.mockito.internal.MockitoCore#reset(java.lang.Object[])}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: mockingProgress.validateState();
 *  */
    @Test
    public void testReset_ThrowIndexOutOfBoundsException() throws Exception  {
        Class threadSafeMockingProgressClazz = Class.forName("org.mockito.internal.progress.ThreadSafeMockingProgress");
        ThreadLocal prevMockingProgress = ((ThreadLocal) getStaticFieldValue(threadSafeMockingProgressClazz, "mockingProgress"));
        try {
            ThreadLocal mockingProgress = ((ThreadLocal) createInstance("java.lang.ThreadLocal"));
            setStaticField(threadSafeMockingProgressClazz, "mockingProgress", mockingProgress);
            MockitoCore mockitoCore = ((MockitoCore) createInstance("org.mockito.internal.MockitoCore"));
            ThreadSafeMockingProgress mockingProgress1 = ((ThreadSafeMockingProgress) createInstance("org.mockito.internal.progress.ThreadSafeMockingProgress"));
            setField(mockitoCore, "org.mockito.internal.MockitoCore", "mockingProgress", mockingProgress1);
            
            /* This test fails because method [org.mockito.internal.MockitoCore.reset] produces [java.lang.IndexOutOfBoundsException: Greater or equal than length] */
            mockitoCore.reset(null);
        } finally {
            setStaticField(ThreadSafeMockingProgress.class, "mockingProgress", prevMockingProgress);
        }
    }
    
    /**
    @utbot.classUnderTest {@link MockitoCore}
 * @utbot.methodUnderTest {@link org.mockito.internal.MockitoCore#reset(java.lang.Object[])}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: mockingProgress.validateState();
 *  */
    @Test
    public void testReset_ThrowIndexOutOfBoundsException_1() throws Exception  {
        Class threadSafeMockingProgressClazz = Class.forName("org.mockito.internal.progress.ThreadSafeMockingProgress");
        ThreadLocal prevMockingProgress = ((ThreadLocal) getStaticFieldValue(threadSafeMockingProgressClazz, "mockingProgress"));
        try {
            ThreadLocal mockingProgress = ((ThreadLocal) createInstance("java.lang.ThreadLocal"));
            setField(mockingProgress, "java.lang.ThreadLocal", "threadLocalHashCode", Integer.MIN_VALUE);
            setStaticField(threadSafeMockingProgressClazz, "mockingProgress", mockingProgress);
            MockitoCore mockitoCore = ((MockitoCore) createInstance("org.mockito.internal.MockitoCore"));
            ThreadSafeMockingProgress mockingProgress1 = ((ThreadSafeMockingProgress) createInstance("org.mockito.internal.progress.ThreadSafeMockingProgress"));
            setField(mockitoCore, "org.mockito.internal.MockitoCore", "mockingProgress", mockingProgress1);
            
            /* This test fails because method [org.mockito.internal.MockitoCore.reset] produces [java.lang.IndexOutOfBoundsException: Less than zero] */
            mockitoCore.reset(null);
        } finally {
            setStaticField(ThreadSafeMockingProgress.class, "mockingProgress", prevMockingProgress);
        }
    }
    
    /**
    @utbot.classUnderTest {@link MockitoCore}
 * @utbot.methodUnderTest {@link org.mockito.internal.MockitoCore#reset(java.lang.Object[])}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} 
 *  */
    @Test
    public void testReset_ThrowIndexOutOfBoundsException_2() throws Exception  {
        Class threadSafeMockingProgressClazz = Class.forName("org.mockito.internal.progress.ThreadSafeMockingProgress");
        ThreadLocal prevMockingProgress = ((ThreadLocal) getStaticFieldValue(threadSafeMockingProgressClazz, "mockingProgress"));
        try {
            ThreadLocal mockingProgress = ((ThreadLocal) createInstance("java.lang.ThreadLocal"));
            setStaticField(threadSafeMockingProgressClazz, "mockingProgress", mockingProgress);
            MockitoCore mockitoCore = ((MockitoCore) createInstance("org.mockito.internal.MockitoCore"));
            ThreadSafeMockingProgress mockingProgress1 = ((ThreadSafeMockingProgress) createInstance("org.mockito.internal.progress.ThreadSafeMockingProgress"));
            setField(mockitoCore, "org.mockito.internal.MockitoCore", "mockingProgress", mockingProgress1);
            
            /* This test fails because method [org.mockito.internal.MockitoCore.reset] produces [java.lang.IndexOutOfBoundsException: Greater or equal than length] */
            mockitoCore.reset(null);
        } finally {
            setStaticField(ThreadSafeMockingProgress.class, "mockingProgress", prevMockingProgress);
        }
    }
    
    /**
    @utbot.classUnderTest {@link MockitoCore}
 * @utbot.methodUnderTest {@link org.mockito.internal.MockitoCore#reset(java.lang.Object[])}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} 
 *  */
    @Test
    public void testReset_ThrowIndexOutOfBoundsException_3() throws Exception  {
        Class threadSafeMockingProgressClazz = Class.forName("org.mockito.internal.progress.ThreadSafeMockingProgress");
        ThreadLocal prevMockingProgress = ((ThreadLocal) getStaticFieldValue(threadSafeMockingProgressClazz, "mockingProgress"));
        try {
            ThreadLocal mockingProgress = ((ThreadLocal) createInstance("java.lang.ThreadLocal"));
            setStaticField(threadSafeMockingProgressClazz, "mockingProgress", mockingProgress);
            MockitoCore mockitoCore = ((MockitoCore) createInstance("org.mockito.internal.MockitoCore"));
            ThreadSafeMockingProgress mockingProgress1 = ((ThreadSafeMockingProgress) createInstance("org.mockito.internal.progress.ThreadSafeMockingProgress"));
            setField(mockitoCore, "org.mockito.internal.MockitoCore", "mockingProgress", mockingProgress1);
            
            /* This test fails because method [org.mockito.internal.MockitoCore.reset] produces [java.lang.IndexOutOfBoundsException: Greater or equal than length] */
            mockitoCore.reset(null);
        } finally {
            setStaticField(ThreadSafeMockingProgress.class, "mockingProgress", prevMockingProgress);
        }
    }
    
    /**
    @utbot.classUnderTest {@link MockitoCore}
 * @utbot.methodUnderTest {@link org.mockito.internal.MockitoCore#reset(java.lang.Object[])}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} 
 *  */
    @Test
    public void testReset_ThrowIndexOutOfBoundsException_4() throws Exception  {
        Class threadSafeMockingProgressClazz = Class.forName("org.mockito.internal.progress.ThreadSafeMockingProgress");
        ThreadLocal prevMockingProgress = ((ThreadLocal) getStaticFieldValue(threadSafeMockingProgressClazz, "mockingProgress"));
        try {
            ThreadLocal mockingProgress = ((ThreadLocal) createInstance("java.lang.ThreadLocal"));
            setField(mockingProgress, "java.lang.ThreadLocal", "threadLocalHashCode", Integer.MIN_VALUE);
            setStaticField(threadSafeMockingProgressClazz, "mockingProgress", mockingProgress);
            MockitoCore mockitoCore = ((MockitoCore) createInstance("org.mockito.internal.MockitoCore"));
            ThreadSafeMockingProgress mockingProgress1 = ((ThreadSafeMockingProgress) createInstance("org.mockito.internal.progress.ThreadSafeMockingProgress"));
            setField(mockitoCore, "org.mockito.internal.MockitoCore", "mockingProgress", mockingProgress1);
            
            /* This test fails because method [org.mockito.internal.MockitoCore.reset] produces [java.lang.IndexOutOfBoundsException: Less than zero] */
            mockitoCore.reset(null);
        } finally {
            setStaticField(ThreadSafeMockingProgress.class, "mockingProgress", prevMockingProgress);
        }
    }
    
    /**
    @utbot.classUnderTest {@link MockitoCore}
 * @utbot.methodUnderTest {@link org.mockito.internal.MockitoCore#reset(java.lang.Object[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: mockingProgress.validateState();
 *  */
    @Test
    public void testReset_ThrowNullPointerException() throws Exception  {
        MockitoCore mockitoCore = ((MockitoCore) createInstance("org.mockito.internal.MockitoCore"));
        
        /* This test fails because method [org.mockito.internal.MockitoCore.reset] produces [java.lang.NullPointerException] */
        mockitoCore.reset(null);
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method reset([Ljava.lang.Object;)
    
    /**
     * @utbot.classUnderTest {@link org.mockito.internal.MockitoCore}
     * @utbot.methodUnderTest {@link org.mockito.internal.MockitoCore#reset(java.lang.Object[])}
     */
    @Test
    public void testResetThrowsNAMEWithNonEmptyObjectArray() {
        MockitoCore mockitoCore = new MockitoCore();
        java.lang.Object[] objectArray = new java.lang.Object[3];
        Object object = new Object();
        objectArray[0] = object;
        Object object1 = new Object();
        objectArray[1] = object1;
        Object object2 = new Object();
        objectArray[2] = object2;
        
        /* This test fails because method [org.mockito.internal.MockitoCore.reset] produces [org.mockito.exceptions.misusing.NotAMockException: Argument should be a mock, but is: class java.lang.Object] */
        mockitoCore.reset(objectArray);
    }
    
    /**
     * @utbot.classUnderTest {@link org.mockito.internal.MockitoCore}
     * @utbot.methodUnderTest {@link org.mockito.internal.MockitoCore#reset(java.lang.Object[])}
     */
    @Test
    public void testResetThrowsNAMEWithNonEmptyObjectArray1() {
        MockitoCore mockitoCore = new MockitoCore();
        java.lang.Object[] objectArray = new java.lang.Object[3];
        Object object = new Object();
        objectArray[0] = object;
        Object object1 = new Object();
        objectArray[1] = object1;
        Object object2 = new Object();
        objectArray[2] = object2;
        
        /* This test fails because method [org.mockito.internal.MockitoCore.reset] produces [org.mockito.exceptions.misusing.NotAMockException: Argument should be a mock, but is: class java.lang.Object] */
        mockitoCore.reset(objectArray);
    }
    
    /**
     * @utbot.classUnderTest {@link org.mockito.internal.MockitoCore}
     * @utbot.methodUnderTest {@link org.mockito.internal.MockitoCore#reset(java.lang.Object[])}
     */
    @Test
    public void testResetThrowsNAMEWithNonEmptyObjectArray2() {
        MockitoCore mockitoCore = new MockitoCore();
        java.lang.Object[] objectArray = new java.lang.Object[3];
        Object object = new Object();
        objectArray[0] = object;
        Object object1 = new Object();
        objectArray[1] = object1;
        Object object2 = new Object();
        objectArray[2] = object2;
        
        /* This test fails because method [org.mockito.internal.MockitoCore.reset] produces [org.mockito.exceptions.misusing.NotAMockException: Argument should be a mock, but is: class java.lang.Object] */
        mockitoCore.reset(objectArray);
    }
    
    /**
     * @utbot.classUnderTest {@link org.mockito.internal.MockitoCore}
     * @utbot.methodUnderTest {@link org.mockito.internal.MockitoCore#reset(java.lang.Object[])}
     */
    @Test
    public void testResetThrowsNAMEWithNonEmptyObjectArray3() {
        MockitoCore mockitoCore = new MockitoCore();
        java.lang.Object[] objectArray = new java.lang.Object[3];
        Object object = new Object();
        objectArray[0] = object;
        Object object1 = new Object();
        objectArray[1] = object1;
        Object object2 = new Object();
        objectArray[2] = object2;
        
        /* This test fails because method [org.mockito.internal.MockitoCore.reset] produces [org.mockito.exceptions.misusing.NotAMockException: Argument should be a mock, but is: class java.lang.Object] */
        mockitoCore.reset(objectArray);
    }
    ///endregion
    
    ///region Errors report for reset
    
    public void testReset_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 9 occurrences of:
        // Field reflectionFactory is not declared in class java.lang.reflect.AccessibleObject
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.mockito.internal.MockitoCore.verify
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method verify(java.lang.Object, org.mockito.verification.VerificationMode)
    
    /**
    @utbot.classUnderTest {@link MockitoCore}
 * @utbot.methodUnderTest {@link org.mockito.internal.MockitoCore#verify(java.lang.Object,org.mockito.verification.VerificationMode)}
 * @utbot.executesCondition {@code (mock == null): False}
 * @utbot.invokes {@link org.mockito.internal.util.MockUtil#isMock(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.ClassCastException} when: !mockUtil.isMock(mock)
 *  */
    @Test
    public void testVerify_ThrowClassCastException() throws Exception  {
        MockitoCore mockitoCore = ((MockitoCore) createInstance("org.mockito.internal.MockitoCore"));
        MockUtil mockUtil = ((MockUtil) createInstance("org.mockito.internal.util.MockUtil"));
        setField(mockitoCore, "org.mockito.internal.MockitoCore", "mockUtil", mockUtil);
        byte[][] byteArray = {};
        
        /* This test fails because method [org.mockito.internal.MockitoCore.verify] produces [java.lang.ClassCastException: The object with type java.lang.Object can not be casted to java.lang.Class$ReflectionData] */
        mockitoCore.verify(byteArray, null);
    }
    
    /**
    @utbot.classUnderTest {@link MockitoCore}
 * @utbot.methodUnderTest {@link org.mockito.internal.MockitoCore#verify(java.lang.Object,org.mockito.verification.VerificationMode)}
 * @utbot.executesCondition {@code (mock == null): False}
 * @utbot.invokes {@link org.mockito.internal.util.MockUtil#isMock(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: !mockUtil.isMock(mock)
 *  */
    @Test
    public void testVerify_ThrowNullPointerException() throws Exception  {
        MockitoCore mockitoCore = ((MockitoCore) createInstance("org.mockito.internal.MockitoCore"));
        byte[] byteArray = {};
        
        /* This test fails because method [org.mockito.internal.MockitoCore.verify] produces [java.lang.NullPointerException] */
        mockitoCore.verify(byteArray, null);
    }
    
    /**
    @utbot.classUnderTest {@link MockitoCore}
 * @utbot.methodUnderTest {@link org.mockito.internal.MockitoCore#verify(java.lang.Object,org.mockito.verification.VerificationMode)}
 * @utbot.executesCondition {@code (mock == null): True}
 * @utbot.invokes {@link org.mockito.exceptions.Reporter#nullPassedToVerify()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: reporter.nullPassedToVerify();
 *  */
    @Test
    public void testVerify_ThrowNullPointerException_1() throws Exception  {
        MockitoCore mockitoCore = ((MockitoCore) createInstance("org.mockito.internal.MockitoCore"));
        
        /* This test fails because method [org.mockito.internal.MockitoCore.verify] produces [java.lang.NullPointerException] */
        mockitoCore.verify(null, null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method verify(java.lang.Object, org.mockito.verification.VerificationMode)
    
    /**
    @utbot.classUnderTest {@link MockitoCore}
 * @utbot.methodUnderTest {@link org.mockito.internal.MockitoCore#verify(java.lang.Object,org.mockito.verification.VerificationMode)}
 * @utbot.executesCondition {@code (mock == null): True}
 * @utbot.invokes {@link org.mockito.exceptions.Reporter#nullPassedToVerify()}
 * @utbot.throwsException {@link org.mockito.exceptions.misusing.NullInsteadOfMockException} in: reporter.nullPassedToVerify();
 *  */
    @Test(expected = NullInsteadOfMockException.class)
    public void testVerify_ThrowNullInsteadOfMockException() throws Exception  {
        MockitoCore mockitoCore = ((MockitoCore) createInstance("org.mockito.internal.MockitoCore"));
        Reporter reporter = ((Reporter) createInstance("org.mockito.exceptions.Reporter"));
        setField(mockitoCore, "org.mockito.internal.MockitoCore", "reporter", reporter);
        
        mockitoCore.verify(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link MockitoCore}
 * @utbot.methodUnderTest {@link org.mockito.internal.MockitoCore#verify(java.lang.Object,org.mockito.verification.VerificationMode)}
 * @utbot.executesCondition {@code (mock == null): False}
 * @utbot.invokes {@link org.mockito.internal.util.MockUtil#isMock(java.lang.Object)}
 * @utbot.throwsException {@link org.mockito.exceptions.misusing.NotAMockException} in: reporter.notAMockPassedToVerify();
 *  */
    @Test(expected = NotAMockException.class)
    public void testVerify_ThrowNotAMockException() throws Exception  {
        MockitoCore mockitoCore = ((MockitoCore) createInstance("org.mockito.internal.MockitoCore"));
        Reporter reporter = ((Reporter) createInstance("org.mockito.exceptions.Reporter"));
        setField(mockitoCore, "org.mockito.internal.MockitoCore", "reporter", reporter);
        MockUtil mockUtil = ((MockUtil) createInstance("org.mockito.internal.util.MockUtil"));
        setField(mockitoCore, "org.mockito.internal.MockitoCore", "mockUtil", mockUtil);
        int[] intArray = {};
        
        mockitoCore.verify(intArray, null);
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method verify(java.lang.Object, org.mockito.verification.VerificationMode)
    
    /**
     * @utbot.classUnderTest {@link org.mockito.internal.MockitoCore}
     * @utbot.methodUnderTest {@link org.mockito.internal.MockitoCore#verify(java.lang.Object,org.mockito.verification.VerificationMode)}
     */
    @Test
    public void testVerifyThrowsNAME() {
        MockitoCore mockitoCore = new MockitoCore();
        Object object = new Object();
        NoMoreInteractions noMoreInteractions = new NoMoreInteractions();
        
        /* This test fails because method [org.mockito.internal.MockitoCore.verify] produces [org.mockito.exceptions.misusing.NotAMockException: 
        Argument passed to verify() is of type Object and is not a mock!
        Make sure you place the parenthesis correctly!
        See the examples of correct verifications:
            verify(mock).someMethod();
            verify(mock, times(10)).someMethod();
            verify(mock, atLeastOnce()).someMethod();] */
        mockitoCore.verify(object, noMoreInteractions);
    }
    
    /**
     * @utbot.classUnderTest {@link org.mockito.internal.MockitoCore}
     * @utbot.methodUnderTest {@link org.mockito.internal.MockitoCore#verify(java.lang.Object,org.mockito.verification.VerificationMode)}
     */
    @Test
    public void testVerifyThrowsNAME1() {
        MockitoCore mockitoCore = new MockitoCore();
        Object object = new Object();
        AtLeast atLeast = new AtLeast(1);
        LinkedList linkedList = new LinkedList();
        linkedList.add(null);
        InOrderImpl inOrderImpl = new InOrderImpl(linkedList);
        InOrderWrapper inOrderWrapper = new InOrderWrapper(atLeast, inOrderImpl);
        
        /* This test fails because method [org.mockito.internal.MockitoCore.verify] produces [org.mockito.exceptions.misusing.NotAMockException: 
        Argument passed to verify() is of type Object and is not a mock!
        Make sure you place the parenthesis correctly!
        See the examples of correct verifications:
            verify(mock).someMethod();
            verify(mock, times(10)).someMethod();
            verify(mock, atLeastOnce()).someMethod();] */
        mockitoCore.verify(object, inOrderWrapper);
    }
    
    /**
     * @utbot.classUnderTest {@link org.mockito.internal.MockitoCore}
     * @utbot.methodUnderTest {@link org.mockito.internal.MockitoCore#verify(java.lang.Object,org.mockito.verification.VerificationMode)}
     */
    @Test
    public void testVerifyThrowsNAME2() {
        MockitoCore mockitoCore = new MockitoCore();
        Object object = new Object();
        AtLeast atLeast = new AtLeast(1);
        LinkedList linkedList = new LinkedList();
        linkedList.add(null);
        InOrderImpl inOrderImpl = new InOrderImpl(linkedList);
        InOrderWrapper inOrderWrapper = new InOrderWrapper(atLeast, inOrderImpl);
        
        /* This test fails because method [org.mockito.internal.MockitoCore.verify] produces [org.mockito.exceptions.misusing.NotAMockException: 
        Argument passed to verify() is of type Object and is not a mock!
        Make sure you place the parenthesis correctly!
        See the examples of correct verifications:
            verify(mock).someMethod();
            verify(mock, times(10)).someMethod();
            verify(mock, atLeastOnce()).someMethod();] */
        mockitoCore.verify(object, inOrderWrapper);
    }
    
    /**
     * @utbot.classUnderTest {@link org.mockito.internal.MockitoCore}
     * @utbot.methodUnderTest {@link org.mockito.internal.MockitoCore#verify(java.lang.Object,org.mockito.verification.VerificationMode)}
     */
    @Test
    public void testVerifyThrowsNAME3() {
        MockitoCore mockitoCore = new MockitoCore();
        Object object = new Object();
        AtLeast atLeast = new AtLeast(1);
        LinkedList linkedList = new LinkedList();
        linkedList.add(null);
        InOrderImpl inOrderImpl = new InOrderImpl(linkedList);
        InOrderWrapper inOrderWrapper = new InOrderWrapper(atLeast, inOrderImpl);
        
        /* This test fails because method [org.mockito.internal.MockitoCore.verify] produces [org.mockito.exceptions.misusing.NotAMockException: 
        Argument passed to verify() is of type Object and is not a mock!
        Make sure you place the parenthesis correctly!
        See the examples of correct verifications:
            verify(mock).someMethod();
            verify(mock, times(10)).someMethod();
            verify(mock, atLeastOnce()).someMethod();] */
        mockitoCore.verify(object, inOrderWrapper);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.mockito.internal.MockitoCore.when
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method when(java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link MockitoCore}
 * @utbot.methodUnderTest {@link org.mockito.internal.MockitoCore#when(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: mockingProgress.stubbingStarted();
 *  */
    @Test
    public void testWhen_ThrowIndexOutOfBoundsException() throws Exception  {
        Class threadSafeMockingProgressClazz = Class.forName("org.mockito.internal.progress.ThreadSafeMockingProgress");
        ThreadLocal prevMockingProgress = ((ThreadLocal) getStaticFieldValue(threadSafeMockingProgressClazz, "mockingProgress"));
        try {
            ThreadLocal mockingProgress = ((ThreadLocal) createInstance("java.lang.ThreadLocal"));
            setField(mockingProgress, "java.lang.ThreadLocal", "threadLocalHashCode", Integer.MIN_VALUE);
            setStaticField(threadSafeMockingProgressClazz, "mockingProgress", mockingProgress);
            MockitoCore mockitoCore = ((MockitoCore) createInstance("org.mockito.internal.MockitoCore"));
            ThreadSafeMockingProgress mockingProgress1 = ((ThreadSafeMockingProgress) createInstance("org.mockito.internal.progress.ThreadSafeMockingProgress"));
            setField(mockitoCore, "org.mockito.internal.MockitoCore", "mockingProgress", mockingProgress1);
            
            /* This test fails because method [org.mockito.internal.MockitoCore.when] produces [java.lang.IndexOutOfBoundsException: Less than zero] */
            mockitoCore.when(null);
        } finally {
            setStaticField(ThreadSafeMockingProgress.class, "mockingProgress", prevMockingProgress);
        }
    }
    
    /**
    @utbot.classUnderTest {@link MockitoCore}
 * @utbot.methodUnderTest {@link org.mockito.internal.MockitoCore#when(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: mockingProgress.stubbingStarted();
 *  */
    @Test
    public void testWhen_ThrowIndexOutOfBoundsException_1() throws Exception  {
        Class threadSafeMockingProgressClazz = Class.forName("org.mockito.internal.progress.ThreadSafeMockingProgress");
        ThreadLocal prevMockingProgress = ((ThreadLocal) getStaticFieldValue(threadSafeMockingProgressClazz, "mockingProgress"));
        try {
            ThreadLocal mockingProgress = ((ThreadLocal) createInstance("java.lang.ThreadLocal"));
            setStaticField(threadSafeMockingProgressClazz, "mockingProgress", mockingProgress);
            MockitoCore mockitoCore = ((MockitoCore) createInstance("org.mockito.internal.MockitoCore"));
            ThreadSafeMockingProgress mockingProgress1 = ((ThreadSafeMockingProgress) createInstance("org.mockito.internal.progress.ThreadSafeMockingProgress"));
            setField(mockitoCore, "org.mockito.internal.MockitoCore", "mockingProgress", mockingProgress1);
            
            /* This test fails because method [org.mockito.internal.MockitoCore.when] produces [java.lang.IndexOutOfBoundsException: Greater or equal than length] */
            mockitoCore.when(null);
        } finally {
            setStaticField(ThreadSafeMockingProgress.class, "mockingProgress", prevMockingProgress);
        }
    }
    
    /**
    @utbot.classUnderTest {@link MockitoCore}
 * @utbot.methodUnderTest {@link org.mockito.internal.MockitoCore#when(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} 
 *  */
    @Test
    public void testWhen_ThrowIndexOutOfBoundsException_2() throws Exception  {
        Class threadSafeMockingProgressClazz = Class.forName("org.mockito.internal.progress.ThreadSafeMockingProgress");
        ThreadLocal prevMockingProgress = ((ThreadLocal) getStaticFieldValue(threadSafeMockingProgressClazz, "mockingProgress"));
        try {
            ThreadLocal mockingProgress = ((ThreadLocal) createInstance("java.lang.ThreadLocal"));
            setField(mockingProgress, "java.lang.ThreadLocal", "threadLocalHashCode", Integer.MIN_VALUE);
            setStaticField(threadSafeMockingProgressClazz, "mockingProgress", mockingProgress);
            MockitoCore mockitoCore = ((MockitoCore) createInstance("org.mockito.internal.MockitoCore"));
            ThreadSafeMockingProgress mockingProgress1 = ((ThreadSafeMockingProgress) createInstance("org.mockito.internal.progress.ThreadSafeMockingProgress"));
            setField(mockitoCore, "org.mockito.internal.MockitoCore", "mockingProgress", mockingProgress1);
            
            /* This test fails because method [org.mockito.internal.MockitoCore.when] produces [java.lang.IndexOutOfBoundsException: Less than zero] */
            mockitoCore.when(null);
        } finally {
            setStaticField(ThreadSafeMockingProgress.class, "mockingProgress", prevMockingProgress);
        }
    }
    
    /**
    @utbot.classUnderTest {@link MockitoCore}
 * @utbot.methodUnderTest {@link org.mockito.internal.MockitoCore#when(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} 
 *  */
    @Test
    public void testWhen_ThrowIndexOutOfBoundsException_3() throws Exception  {
        Class threadSafeMockingProgressClazz = Class.forName("org.mockito.internal.progress.ThreadSafeMockingProgress");
        ThreadLocal prevMockingProgress = ((ThreadLocal) getStaticFieldValue(threadSafeMockingProgressClazz, "mockingProgress"));
        try {
            ThreadLocal mockingProgress = ((ThreadLocal) createInstance("java.lang.ThreadLocal"));
            setStaticField(threadSafeMockingProgressClazz, "mockingProgress", mockingProgress);
            MockitoCore mockitoCore = ((MockitoCore) createInstance("org.mockito.internal.MockitoCore"));
            ThreadSafeMockingProgress mockingProgress1 = ((ThreadSafeMockingProgress) createInstance("org.mockito.internal.progress.ThreadSafeMockingProgress"));
            setField(mockitoCore, "org.mockito.internal.MockitoCore", "mockingProgress", mockingProgress1);
            
            /* This test fails because method [org.mockito.internal.MockitoCore.when] produces [java.lang.IndexOutOfBoundsException: Greater or equal than length] */
            mockitoCore.when(null);
        } finally {
            setStaticField(ThreadSafeMockingProgress.class, "mockingProgress", prevMockingProgress);
        }
    }
    
    /**
    @utbot.classUnderTest {@link MockitoCore}
 * @utbot.methodUnderTest {@link org.mockito.internal.MockitoCore#when(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} 
 *  */
    @Test
    public void testWhen_ThrowIndexOutOfBoundsException_4() throws Exception  {
        Class threadSafeMockingProgressClazz = Class.forName("org.mockito.internal.progress.ThreadSafeMockingProgress");
        ThreadLocal prevMockingProgress = ((ThreadLocal) getStaticFieldValue(threadSafeMockingProgressClazz, "mockingProgress"));
        try {
            ThreadLocal mockingProgress = ((ThreadLocal) createInstance("java.lang.ThreadLocal"));
            setStaticField(threadSafeMockingProgressClazz, "mockingProgress", mockingProgress);
            MockitoCore mockitoCore = ((MockitoCore) createInstance("org.mockito.internal.MockitoCore"));
            ThreadSafeMockingProgress mockingProgress1 = ((ThreadSafeMockingProgress) createInstance("org.mockito.internal.progress.ThreadSafeMockingProgress"));
            setField(mockitoCore, "org.mockito.internal.MockitoCore", "mockingProgress", mockingProgress1);
            
            /* This test fails because method [org.mockito.internal.MockitoCore.when] produces [java.lang.IndexOutOfBoundsException: Greater or equal than length] */
            mockitoCore.when(null);
        } finally {
            setStaticField(ThreadSafeMockingProgress.class, "mockingProgress", prevMockingProgress);
        }
    }
    
    /**
    @utbot.classUnderTest {@link MockitoCore}
 * @utbot.methodUnderTest {@link org.mockito.internal.MockitoCore#when(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: mockingProgress.stubbingStarted();
 *  */
    @Test
    public void testWhen_ThrowNullPointerException() throws Exception  {
        MockitoCore mockitoCore = ((MockitoCore) createInstance("org.mockito.internal.MockitoCore"));
        
        /* This test fails because method [org.mockito.internal.MockitoCore.when] produces [java.lang.NullPointerException] */
        mockitoCore.when(null);
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method when(java.lang.Object)
    
    /**
     * @utbot.classUnderTest {@link org.mockito.internal.MockitoCore}
     * @utbot.methodUnderTest {@link org.mockito.internal.MockitoCore#when(java.lang.Object)}
     */
    @Test
    public void testWhenThrowsMMIE() {
        MockitoCore mockitoCore = new MockitoCore();
        Object object = new Object();
        
        /* This test fails because method [org.mockito.internal.MockitoCore.when] produces [org.mockito.exceptions.misusing.MissingMethodInvocationException: 
        when() requires an argument which has to be 'a method call on a mock'.
        For example:
            when(mock.getArticles()).thenReturn(articles);
        
        Also, this error might show up because:
        1. you stub either of: final/private/equals()/hashCode() methods.
           Those methods *cannot* be stubbed/verified.
           Mocking methods declared on non-public parent classes is not supported.
        2. inside when() you don't call method on mock but on some other object.
        ] */
        mockitoCore.when(object);
    }
    
    /**
     * @utbot.classUnderTest {@link org.mockito.internal.MockitoCore}
     * @utbot.methodUnderTest {@link org.mockito.internal.MockitoCore#when(java.lang.Object)}
     */
    @Test
    public void testWhenThrowsMMIE1() {
        MockitoCore mockitoCore = new MockitoCore();
        Object object = new Object();
        
        /* This test fails because method [org.mockito.internal.MockitoCore.when] produces [org.mockito.exceptions.misusing.MissingMethodInvocationException: 
        when() requires an argument which has to be 'a method call on a mock'.
        For example:
            when(mock.getArticles()).thenReturn(articles);
        
        Also, this error might show up because:
        1. you stub either of: final/private/equals()/hashCode() methods.
           Those methods *cannot* be stubbed/verified.
           Mocking methods declared on non-public parent classes is not supported.
        2. inside when() you don't call method on mock but on some other object.
        ] */
        mockitoCore.when(object);
    }
    
    /**
     * @utbot.classUnderTest {@link org.mockito.internal.MockitoCore}
     * @utbot.methodUnderTest {@link org.mockito.internal.MockitoCore#when(java.lang.Object)}
     */
    @Test
    public void testWhenThrowsMMIE2() {
        MockitoCore mockitoCore = new MockitoCore();
        Object object = new Object();
        
        /* This test fails because method [org.mockito.internal.MockitoCore.when] produces [org.mockito.exceptions.misusing.MissingMethodInvocationException: 
        when() requires an argument which has to be 'a method call on a mock'.
        For example:
            when(mock.getArticles()).thenReturn(articles);
        
        Also, this error might show up because:
        1. you stub either of: final/private/equals()/hashCode() methods.
           Those methods *cannot* be stubbed/verified.
           Mocking methods declared on non-public parent classes is not supported.
        2. inside when() you don't call method on mock but on some other object.
        ] */
        mockitoCore.when(object);
    }
    
    /**
     * @utbot.classUnderTest {@link org.mockito.internal.MockitoCore}
     * @utbot.methodUnderTest {@link org.mockito.internal.MockitoCore#when(java.lang.Object)}
     */
    @Test
    public void testWhenThrowsMMIE3() {
        MockitoCore mockitoCore = new MockitoCore();
        Object object = new Object();
        
        /* This test fails because method [org.mockito.internal.MockitoCore.when] produces [org.mockito.exceptions.misusing.MissingMethodInvocationException: 
        when() requires an argument which has to be 'a method call on a mock'.
        For example:
            when(mock.getArticles()).thenReturn(articles);
        
        Also, this error might show up because:
        1. you stub either of: final/private/equals()/hashCode() methods.
           Those methods *cannot* be stubbed/verified.
           Mocking methods declared on non-public parent classes is not supported.
        2. inside when() you don't call method on mock but on some other object.
        ] */
        mockitoCore.when(object);
    }
    ///endregion
    
    ///region Errors report for when
    
    public void testWhen_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 12 occurrences of:
        // Field reflectionFactory is not declared in class java.lang.reflect.AccessibleObject
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.mockito.internal.MockitoCore.validateMockitoUsage
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method validateMockitoUsage()
    
    /**
    @utbot.classUnderTest {@link MockitoCore}
 * @utbot.methodUnderTest {@link org.mockito.internal.MockitoCore#validateMockitoUsage()}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: mockingProgress.validateState();
 *  */
    @Test
    public void testValidateMockitoUsage_ThrowIndexOutOfBoundsException() throws Exception  {
        Class threadSafeMockingProgressClazz = Class.forName("org.mockito.internal.progress.ThreadSafeMockingProgress");
        ThreadLocal prevMockingProgress = ((ThreadLocal) getStaticFieldValue(threadSafeMockingProgressClazz, "mockingProgress"));
        try {
            ThreadLocal mockingProgress = ((ThreadLocal) createInstance("java.lang.ThreadLocal"));
            setField(mockingProgress, "java.lang.ThreadLocal", "threadLocalHashCode", Integer.MIN_VALUE);
            setStaticField(threadSafeMockingProgressClazz, "mockingProgress", mockingProgress);
            MockitoCore mockitoCore = ((MockitoCore) createInstance("org.mockito.internal.MockitoCore"));
            ThreadSafeMockingProgress mockingProgress1 = ((ThreadSafeMockingProgress) createInstance("org.mockito.internal.progress.ThreadSafeMockingProgress"));
            setField(mockitoCore, "org.mockito.internal.MockitoCore", "mockingProgress", mockingProgress1);
            
            /* This test fails because method [org.mockito.internal.MockitoCore.validateMockitoUsage] produces [java.lang.IndexOutOfBoundsException: Less than zero] */
            mockitoCore.validateMockitoUsage();
        } finally {
            setStaticField(ThreadSafeMockingProgress.class, "mockingProgress", prevMockingProgress);
        }
    }
    
    /**
    @utbot.classUnderTest {@link MockitoCore}
 * @utbot.methodUnderTest {@link org.mockito.internal.MockitoCore#validateMockitoUsage()}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: mockingProgress.validateState();
 *  */
    @Test
    public void testValidateMockitoUsage_ThrowIndexOutOfBoundsException_1() throws Exception  {
        Class threadSafeMockingProgressClazz = Class.forName("org.mockito.internal.progress.ThreadSafeMockingProgress");
        ThreadLocal prevMockingProgress = ((ThreadLocal) getStaticFieldValue(threadSafeMockingProgressClazz, "mockingProgress"));
        try {
            ThreadLocal mockingProgress = ((ThreadLocal) createInstance("java.lang.ThreadLocal"));
            setStaticField(threadSafeMockingProgressClazz, "mockingProgress", mockingProgress);
            MockitoCore mockitoCore = ((MockitoCore) createInstance("org.mockito.internal.MockitoCore"));
            ThreadSafeMockingProgress mockingProgress1 = ((ThreadSafeMockingProgress) createInstance("org.mockito.internal.progress.ThreadSafeMockingProgress"));
            setField(mockitoCore, "org.mockito.internal.MockitoCore", "mockingProgress", mockingProgress1);
            
            /* This test fails because method [org.mockito.internal.MockitoCore.validateMockitoUsage] produces [java.lang.IndexOutOfBoundsException: Greater or equal than length] */
            mockitoCore.validateMockitoUsage();
        } finally {
            setStaticField(ThreadSafeMockingProgress.class, "mockingProgress", prevMockingProgress);
        }
    }
    
    /**
    @utbot.classUnderTest {@link MockitoCore}
 * @utbot.methodUnderTest {@link org.mockito.internal.MockitoCore#validateMockitoUsage()}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} 
 *  */
    @Test
    public void testValidateMockitoUsage_ThrowIndexOutOfBoundsException_2() throws Exception  {
        Class threadSafeMockingProgressClazz = Class.forName("org.mockito.internal.progress.ThreadSafeMockingProgress");
        ThreadLocal prevMockingProgress = ((ThreadLocal) getStaticFieldValue(threadSafeMockingProgressClazz, "mockingProgress"));
        try {
            ThreadLocal mockingProgress = ((ThreadLocal) createInstance("java.lang.ThreadLocal"));
            setField(mockingProgress, "java.lang.ThreadLocal", "threadLocalHashCode", Integer.MIN_VALUE);
            setStaticField(threadSafeMockingProgressClazz, "mockingProgress", mockingProgress);
            MockitoCore mockitoCore = ((MockitoCore) createInstance("org.mockito.internal.MockitoCore"));
            ThreadSafeMockingProgress mockingProgress1 = ((ThreadSafeMockingProgress) createInstance("org.mockito.internal.progress.ThreadSafeMockingProgress"));
            setField(mockitoCore, "org.mockito.internal.MockitoCore", "mockingProgress", mockingProgress1);
            
            /* This test fails because method [org.mockito.internal.MockitoCore.validateMockitoUsage] produces [java.lang.IndexOutOfBoundsException: Less than zero] */
            mockitoCore.validateMockitoUsage();
        } finally {
            setStaticField(ThreadSafeMockingProgress.class, "mockingProgress", prevMockingProgress);
        }
    }
    
    /**
    @utbot.classUnderTest {@link MockitoCore}
 * @utbot.methodUnderTest {@link org.mockito.internal.MockitoCore#validateMockitoUsage()}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} 
 *  */
    @Test
    public void testValidateMockitoUsage_ThrowIndexOutOfBoundsException_3() throws Exception  {
        Class threadSafeMockingProgressClazz = Class.forName("org.mockito.internal.progress.ThreadSafeMockingProgress");
        ThreadLocal prevMockingProgress = ((ThreadLocal) getStaticFieldValue(threadSafeMockingProgressClazz, "mockingProgress"));
        try {
            ThreadLocal mockingProgress = ((ThreadLocal) createInstance("java.lang.ThreadLocal"));
            setStaticField(threadSafeMockingProgressClazz, "mockingProgress", mockingProgress);
            MockitoCore mockitoCore = ((MockitoCore) createInstance("org.mockito.internal.MockitoCore"));
            ThreadSafeMockingProgress mockingProgress1 = ((ThreadSafeMockingProgress) createInstance("org.mockito.internal.progress.ThreadSafeMockingProgress"));
            setField(mockitoCore, "org.mockito.internal.MockitoCore", "mockingProgress", mockingProgress1);
            
            /* This test fails because method [org.mockito.internal.MockitoCore.validateMockitoUsage] produces [java.lang.IndexOutOfBoundsException: Greater or equal than length] */
            mockitoCore.validateMockitoUsage();
        } finally {
            setStaticField(ThreadSafeMockingProgress.class, "mockingProgress", prevMockingProgress);
        }
    }
    
    /**
    @utbot.classUnderTest {@link MockitoCore}
 * @utbot.methodUnderTest {@link org.mockito.internal.MockitoCore#validateMockitoUsage()}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} 
 *  */
    @Test
    public void testValidateMockitoUsage_ThrowIndexOutOfBoundsException_4() throws Exception  {
        Class threadSafeMockingProgressClazz = Class.forName("org.mockito.internal.progress.ThreadSafeMockingProgress");
        ThreadLocal prevMockingProgress = ((ThreadLocal) getStaticFieldValue(threadSafeMockingProgressClazz, "mockingProgress"));
        try {
            ThreadLocal mockingProgress = ((ThreadLocal) createInstance("java.lang.ThreadLocal"));
            setField(mockingProgress, "java.lang.ThreadLocal", "threadLocalHashCode", Integer.MIN_VALUE);
            setStaticField(threadSafeMockingProgressClazz, "mockingProgress", mockingProgress);
            MockitoCore mockitoCore = ((MockitoCore) createInstance("org.mockito.internal.MockitoCore"));
            ThreadSafeMockingProgress mockingProgress1 = ((ThreadSafeMockingProgress) createInstance("org.mockito.internal.progress.ThreadSafeMockingProgress"));
            setField(mockitoCore, "org.mockito.internal.MockitoCore", "mockingProgress", mockingProgress1);
            
            /* This test fails because method [org.mockito.internal.MockitoCore.validateMockitoUsage] produces [java.lang.IndexOutOfBoundsException: Less than zero] */
            mockitoCore.validateMockitoUsage();
        } finally {
            setStaticField(ThreadSafeMockingProgress.class, "mockingProgress", prevMockingProgress);
        }
    }
    
    /**
    @utbot.classUnderTest {@link MockitoCore}
 * @utbot.methodUnderTest {@link org.mockito.internal.MockitoCore#validateMockitoUsage()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: mockingProgress.validateState();
 *  */
    @Test
    public void testValidateMockitoUsage_ThrowNullPointerException() throws Exception  {
        MockitoCore mockitoCore = ((MockitoCore) createInstance("org.mockito.internal.MockitoCore"));
        
        /* This test fails because method [org.mockito.internal.MockitoCore.validateMockitoUsage] produces [java.lang.NullPointerException] */
        mockitoCore.validateMockitoUsage();
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method validateMockitoUsage()
    
    /**
     * @utbot.classUnderTest {@link org.mockito.internal.MockitoCore}
     * @utbot.methodUnderTest {@link org.mockito.internal.MockitoCore#validateMockitoUsage()}
     */
    @Test
    public void testValidateMockitoUsage() {
        MockitoCore mockitoCore = new MockitoCore();
        
        mockitoCore.validateMockitoUsage();
    }
    
    /**
     * @utbot.classUnderTest {@link org.mockito.internal.MockitoCore}
     * @utbot.methodUnderTest {@link org.mockito.internal.MockitoCore#validateMockitoUsage()}
     */
    @Test
    public void testValidateMockitoUsage1() {
        MockitoCore mockitoCore = new MockitoCore();
        
        mockitoCore.validateMockitoUsage();
    }
    
    /**
     * @utbot.classUnderTest {@link org.mockito.internal.MockitoCore}
     * @utbot.methodUnderTest {@link org.mockito.internal.MockitoCore#validateMockitoUsage()}
     */
    @Test
    public void testValidateMockitoUsage2() {
        MockitoCore mockitoCore = new MockitoCore();
        
        mockitoCore.validateMockitoUsage();
    }
    
    /**
     * @utbot.classUnderTest {@link org.mockito.internal.MockitoCore}
     * @utbot.methodUnderTest {@link org.mockito.internal.MockitoCore#validateMockitoUsage()}
     */
    @Test
    public void testValidateMockitoUsage3() {
        MockitoCore mockitoCore = new MockitoCore();
        
        mockitoCore.validateMockitoUsage();
    }
    ///endregion
    
    ///region Errors report for validateMockitoUsage
    
    public void testValidateMockitoUsage_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 13 occurrences of:
        // Field reflectionFactory is not declared in class java.lang.reflect.AccessibleObject
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.mockito.internal.MockitoCore.assertMocksNotEmpty
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method assertMocksNotEmpty([Ljava.lang.Object;)
    
    /**
    @utbot.classUnderTest {@link MockitoCore}
 * @utbot.methodUnderTest {@link org.mockito.internal.MockitoCore#assertMocksNotEmpty(java.lang.Object[])}
 * @utbot.executesCondition {@code (mocks == null): False}
 * @utbot.executesCondition {@code (mocks.length == 0): False}
 *  */
    @Test
    public void testAssertMocksNotEmpty_MocksLengthNotEqualsZero() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        MockitoCore mockitoCore = new MockitoCore();
        java.lang.Object[] objectArray = {null};
        
        Class mockitoCoreClazz = Class.forName("org.mockito.internal.MockitoCore");
        Class objectArrayType = Class.forName("[Ljava.lang.Object;");
        Method assertMocksNotEmptyMethod = mockitoCoreClazz.getDeclaredMethod("assertMocksNotEmpty", objectArrayType);
        assertMocksNotEmptyMethod.setAccessible(true);
        java.lang.Object[] assertMocksNotEmptyMethodArguments = new java.lang.Object[1];
        assertMocksNotEmptyMethodArguments[0] = ((Object) objectArray);
        assertMocksNotEmptyMethod.invoke(mockitoCore, assertMocksNotEmptyMethodArguments);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method assertMocksNotEmpty([Ljava.lang.Object;)
    
    /**
    @utbot.classUnderTest {@link MockitoCore}
 * @utbot.methodUnderTest {@link org.mockito.internal.MockitoCore#assertMocksNotEmpty(java.lang.Object[])}
 * @utbot.executesCondition {@code (mocks == null): False}
 * @utbot.executesCondition {@code (mocks.length == 0): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: reporter.mocksHaveToBePassedToVerifyNoMoreInteractions();
 *  */
    @Test
    public void testAssertMocksNotEmpty_ThrowNullPointerException() throws Throwable  {
        MockitoCore mockitoCore = ((MockitoCore) createInstance("org.mockito.internal.MockitoCore"));
        java.lang.Object[] objectArray = {};
        
        /* This test fails because method [org.mockito.internal.MockitoCore.assertMocksNotEmpty] produces [java.lang.NullPointerException] */
        Class mockitoCoreClazz = Class.forName("org.mockito.internal.MockitoCore");
        Class objectArrayType = Class.forName("[Ljava.lang.Object;");
        Method assertMocksNotEmptyMethod = mockitoCoreClazz.getDeclaredMethod("assertMocksNotEmpty", objectArrayType);
        assertMocksNotEmptyMethod.setAccessible(true);
        java.lang.Object[] assertMocksNotEmptyMethodArguments = new java.lang.Object[1];
        assertMocksNotEmptyMethodArguments[0] = ((Object) objectArray);
        try {
            assertMocksNotEmptyMethod.invoke(mockitoCore, assertMocksNotEmptyMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link MockitoCore}
 * @utbot.methodUnderTest {@link org.mockito.internal.MockitoCore#assertMocksNotEmpty(java.lang.Object[])}
 * @utbot.executesCondition {@code (mocks == null): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: reporter.mocksHaveToBePassedToVerifyNoMoreInteractions();
 *  */
    @Test
    public void testAssertMocksNotEmpty_ThrowNullPointerException_1() throws Throwable  {
        MockitoCore mockitoCore = ((MockitoCore) createInstance("org.mockito.internal.MockitoCore"));
        
        /* This test fails because method [org.mockito.internal.MockitoCore.assertMocksNotEmpty] produces [java.lang.NullPointerException] */
        Class mockitoCoreClazz = Class.forName("org.mockito.internal.MockitoCore");
        Class objectArrayType = Class.forName("[Ljava.lang.Object;");
        Method assertMocksNotEmptyMethod = mockitoCoreClazz.getDeclaredMethod("assertMocksNotEmpty", objectArrayType);
        assertMocksNotEmptyMethod.setAccessible(true);
        java.lang.Object[] assertMocksNotEmptyMethodArguments = new java.lang.Object[1];
        assertMocksNotEmptyMethodArguments[0] = ((Object) null);
        try {
            assertMocksNotEmptyMethod.invoke(mockitoCore, assertMocksNotEmptyMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method assertMocksNotEmpty([Ljava.lang.Object;)
    
    /**
    @utbot.classUnderTest {@link MockitoCore}
 * @utbot.methodUnderTest {@link org.mockito.internal.MockitoCore#assertMocksNotEmpty(java.lang.Object[])}
 * @utbot.executesCondition {@code (mocks == null): False}
 * @utbot.executesCondition {@code (mocks.length == 0): True}
 * @utbot.invokes {@link org.mockito.exceptions.Reporter#mocksHaveToBePassedToVerifyNoMoreInteractions()}
 * @utbot.throwsException {@link org.mockito.exceptions.base.MockitoException} in: reporter.mocksHaveToBePassedToVerifyNoMoreInteractions();
 *  */
    @Test(expected = MockitoException.class)
    public void testAssertMocksNotEmpty_ThrowMockitoException() throws Throwable  {
        MockitoCore mockitoCore = ((MockitoCore) createInstance("org.mockito.internal.MockitoCore"));
        Reporter reporter = ((Reporter) createInstance("org.mockito.exceptions.Reporter"));
        setField(mockitoCore, "org.mockito.internal.MockitoCore", "reporter", reporter);
        java.lang.Object[] objectArray = {};
        
        Class mockitoCoreClazz = Class.forName("org.mockito.internal.MockitoCore");
        Class objectArrayType = Class.forName("[Ljava.lang.Object;");
        Method assertMocksNotEmptyMethod = mockitoCoreClazz.getDeclaredMethod("assertMocksNotEmpty", objectArrayType);
        assertMocksNotEmptyMethod.setAccessible(true);
        java.lang.Object[] assertMocksNotEmptyMethodArguments = new java.lang.Object[1];
        assertMocksNotEmptyMethodArguments[0] = ((Object) objectArray);
        try {
            assertMocksNotEmptyMethod.invoke(mockitoCore, assertMocksNotEmptyMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method assertMocksNotEmpty([Ljava.lang.Object;)
    
    /**
     * @utbot.classUnderTest {@link org.mockito.internal.MockitoCore}
     * @utbot.methodUnderTest {@link org.mockito.internal.MockitoCore#assertMocksNotEmpty(java.lang.Object[])}
     */
    @Test
    public void testAssertMocksNotEmptyWithNonEmptyObjectArray() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        MockitoCore mockitoCore = new MockitoCore();
        java.lang.Object[] objectArray = new java.lang.Object[3];
        Object object = new Object();
        objectArray[0] = object;
        Object object1 = new Object();
        objectArray[1] = object1;
        Object object2 = new Object();
        objectArray[2] = object2;
        
        Class mockitoCoreClazz = Class.forName("org.mockito.internal.MockitoCore");
        Class objectArrayType = Class.forName("[Ljava.lang.Object;");
        Method assertMocksNotEmptyMethod = mockitoCoreClazz.getDeclaredMethod("assertMocksNotEmpty", objectArrayType);
        assertMocksNotEmptyMethod.setAccessible(true);
        java.lang.Object[] assertMocksNotEmptyMethodArguments = new java.lang.Object[1];
        assertMocksNotEmptyMethodArguments[0] = ((Object) objectArray);
        assertMocksNotEmptyMethod.invoke(mockitoCore, assertMocksNotEmptyMethodArguments);
    }
    
    /**
     * @utbot.classUnderTest {@link org.mockito.internal.MockitoCore}
     * @utbot.methodUnderTest {@link org.mockito.internal.MockitoCore#assertMocksNotEmpty(java.lang.Object[])}
     */
    @Test
    public void testAssertMocksNotEmptyWithNonEmptyObjectArray1() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        MockitoCore mockitoCore = new MockitoCore();
        java.lang.Object[] objectArray = new java.lang.Object[3];
        Object object = new Object();
        objectArray[0] = object;
        Object object1 = new Object();
        objectArray[1] = object1;
        Object object2 = new Object();
        objectArray[2] = object2;
        
        Class mockitoCoreClazz = Class.forName("org.mockito.internal.MockitoCore");
        Class objectArrayType = Class.forName("[Ljava.lang.Object;");
        Method assertMocksNotEmptyMethod = mockitoCoreClazz.getDeclaredMethod("assertMocksNotEmpty", objectArrayType);
        assertMocksNotEmptyMethod.setAccessible(true);
        java.lang.Object[] assertMocksNotEmptyMethodArguments = new java.lang.Object[1];
        assertMocksNotEmptyMethodArguments[0] = ((Object) objectArray);
        assertMocksNotEmptyMethod.invoke(mockitoCore, assertMocksNotEmptyMethodArguments);
    }
    
    /**
     * @utbot.classUnderTest {@link org.mockito.internal.MockitoCore}
     * @utbot.methodUnderTest {@link org.mockito.internal.MockitoCore#assertMocksNotEmpty(java.lang.Object[])}
     */
    @Test
    public void testAssertMocksNotEmptyWithNonEmptyObjectArray2() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        MockitoCore mockitoCore = new MockitoCore();
        java.lang.Object[] objectArray = new java.lang.Object[3];
        Object object = new Object();
        objectArray[0] = object;
        Object object1 = new Object();
        objectArray[1] = object1;
        Object object2 = new Object();
        objectArray[2] = object2;
        
        Class mockitoCoreClazz = Class.forName("org.mockito.internal.MockitoCore");
        Class objectArrayType = Class.forName("[Ljava.lang.Object;");
        Method assertMocksNotEmptyMethod = mockitoCoreClazz.getDeclaredMethod("assertMocksNotEmpty", objectArrayType);
        assertMocksNotEmptyMethod.setAccessible(true);
        java.lang.Object[] assertMocksNotEmptyMethodArguments = new java.lang.Object[1];
        assertMocksNotEmptyMethodArguments[0] = ((Object) objectArray);
        assertMocksNotEmptyMethod.invoke(mockitoCore, assertMocksNotEmptyMethodArguments);
    }
    
    /**
     * @utbot.classUnderTest {@link org.mockito.internal.MockitoCore}
     * @utbot.methodUnderTest {@link org.mockito.internal.MockitoCore#assertMocksNotEmpty(java.lang.Object[])}
     */
    @Test
    public void testAssertMocksNotEmptyWithNonEmptyObjectArray3() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        MockitoCore mockitoCore = new MockitoCore();
        java.lang.Object[] objectArray = new java.lang.Object[3];
        Object object = new Object();
        objectArray[0] = object;
        Object object1 = new Object();
        objectArray[1] = object1;
        Object object2 = new Object();
        objectArray[2] = object2;
        
        Class mockitoCoreClazz = Class.forName("org.mockito.internal.MockitoCore");
        Class objectArrayType = Class.forName("[Ljava.lang.Object;");
        Method assertMocksNotEmptyMethod = mockitoCoreClazz.getDeclaredMethod("assertMocksNotEmpty", objectArrayType);
        assertMocksNotEmptyMethod.setAccessible(true);
        java.lang.Object[] assertMocksNotEmptyMethodArguments = new java.lang.Object[1];
        assertMocksNotEmptyMethodArguments[0] = ((Object) objectArray);
        assertMocksNotEmptyMethod.invoke(mockitoCore, assertMocksNotEmptyMethodArguments);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.mockito.internal.MockitoCore.verifyNoMoreInteractions
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method verifyNoMoreInteractions([Ljava.lang.Object;)
    
    /**
    @utbot.classUnderTest {@link MockitoCore}
 * @utbot.methodUnderTest {@link org.mockito.internal.MockitoCore#verifyNoMoreInteractions(java.lang.Object[])}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} 
 *  */
    @Test
    public void testVerifyNoMoreInteractions_ThrowIndexOutOfBoundsException() throws Exception  {
        Class threadSafeMockingProgressClazz = Class.forName("org.mockito.internal.progress.ThreadSafeMockingProgress");
        ThreadLocal prevMockingProgress = ((ThreadLocal) getStaticFieldValue(threadSafeMockingProgressClazz, "mockingProgress"));
        try {
            ThreadLocal mockingProgress = ((ThreadLocal) createInstance("java.lang.ThreadLocal"));
            setField(mockingProgress, "java.lang.ThreadLocal", "threadLocalHashCode", Integer.MIN_VALUE);
            setStaticField(threadSafeMockingProgressClazz, "mockingProgress", mockingProgress);
            MockitoCore mockitoCore = ((MockitoCore) createInstance("org.mockito.internal.MockitoCore"));
            ThreadSafeMockingProgress mockingProgress1 = ((ThreadSafeMockingProgress) createInstance("org.mockito.internal.progress.ThreadSafeMockingProgress"));
            setField(mockitoCore, "org.mockito.internal.MockitoCore", "mockingProgress", mockingProgress1);
            java.lang.Object[] objectArray = {null};
            
            /* This test fails because method [org.mockito.internal.MockitoCore.verifyNoMoreInteractions] produces [java.lang.IndexOutOfBoundsException: Less than zero] */
            mockitoCore.verifyNoMoreInteractions(objectArray);
        } finally {
            setStaticField(ThreadSafeMockingProgress.class, "mockingProgress", prevMockingProgress);
        }
    }
    
    /**
    @utbot.classUnderTest {@link MockitoCore}
 * @utbot.methodUnderTest {@link org.mockito.internal.MockitoCore#verifyNoMoreInteractions(java.lang.Object[])}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} 
 *  */
    @Test
    public void testVerifyNoMoreInteractions_ThrowIndexOutOfBoundsException_1() throws Exception  {
        Class threadSafeMockingProgressClazz = Class.forName("org.mockito.internal.progress.ThreadSafeMockingProgress");
        ThreadLocal prevMockingProgress = ((ThreadLocal) getStaticFieldValue(threadSafeMockingProgressClazz, "mockingProgress"));
        try {
            ThreadLocal mockingProgress = ((ThreadLocal) createInstance("java.lang.ThreadLocal"));
            setStaticField(threadSafeMockingProgressClazz, "mockingProgress", mockingProgress);
            MockitoCore mockitoCore = ((MockitoCore) createInstance("org.mockito.internal.MockitoCore"));
            ThreadSafeMockingProgress mockingProgress1 = ((ThreadSafeMockingProgress) createInstance("org.mockito.internal.progress.ThreadSafeMockingProgress"));
            setField(mockitoCore, "org.mockito.internal.MockitoCore", "mockingProgress", mockingProgress1);
            java.lang.Object[] objectArray = {null, null};
            
            /* This test fails because method [org.mockito.internal.MockitoCore.verifyNoMoreInteractions] produces [java.lang.IndexOutOfBoundsException: Greater or equal than length] */
            mockitoCore.verifyNoMoreInteractions(objectArray);
        } finally {
            setStaticField(ThreadSafeMockingProgress.class, "mockingProgress", prevMockingProgress);
        }
    }
    
    /**
    @utbot.classUnderTest {@link MockitoCore}
 * @utbot.methodUnderTest {@link org.mockito.internal.MockitoCore#verifyNoMoreInteractions(java.lang.Object[])}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} 
 *  */
    @Test
    public void testVerifyNoMoreInteractions_ThrowIndexOutOfBoundsException_2() throws Exception  {
        Class threadSafeMockingProgressClazz = Class.forName("org.mockito.internal.progress.ThreadSafeMockingProgress");
        ThreadLocal prevMockingProgress = ((ThreadLocal) getStaticFieldValue(threadSafeMockingProgressClazz, "mockingProgress"));
        try {
            ThreadLocal mockingProgress = ((ThreadLocal) createInstance("java.lang.ThreadLocal"));
            setField(mockingProgress, "java.lang.ThreadLocal", "threadLocalHashCode", Integer.MIN_VALUE);
            setStaticField(threadSafeMockingProgressClazz, "mockingProgress", mockingProgress);
            MockitoCore mockitoCore = ((MockitoCore) createInstance("org.mockito.internal.MockitoCore"));
            ThreadSafeMockingProgress mockingProgress1 = ((ThreadSafeMockingProgress) createInstance("org.mockito.internal.progress.ThreadSafeMockingProgress"));
            setField(mockitoCore, "org.mockito.internal.MockitoCore", "mockingProgress", mockingProgress1);
            java.lang.Object[] objectArray = {null};
            
            /* This test fails because method [org.mockito.internal.MockitoCore.verifyNoMoreInteractions] produces [java.lang.IndexOutOfBoundsException: Less than zero] */
            mockitoCore.verifyNoMoreInteractions(objectArray);
        } finally {
            setStaticField(ThreadSafeMockingProgress.class, "mockingProgress", prevMockingProgress);
        }
    }
    
    /**
    @utbot.classUnderTest {@link MockitoCore}
 * @utbot.methodUnderTest {@link org.mockito.internal.MockitoCore#verifyNoMoreInteractions(java.lang.Object[])}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} 
 *  */
    @Test
    public void testVerifyNoMoreInteractions_ThrowIndexOutOfBoundsException_3() throws Exception  {
        Class threadSafeMockingProgressClazz = Class.forName("org.mockito.internal.progress.ThreadSafeMockingProgress");
        ThreadLocal prevMockingProgress = ((ThreadLocal) getStaticFieldValue(threadSafeMockingProgressClazz, "mockingProgress"));
        try {
            ThreadLocal mockingProgress = ((ThreadLocal) createInstance("java.lang.ThreadLocal"));
            setStaticField(threadSafeMockingProgressClazz, "mockingProgress", mockingProgress);
            MockitoCore mockitoCore = ((MockitoCore) createInstance("org.mockito.internal.MockitoCore"));
            ThreadSafeMockingProgress mockingProgress1 = ((ThreadSafeMockingProgress) createInstance("org.mockito.internal.progress.ThreadSafeMockingProgress"));
            setField(mockitoCore, "org.mockito.internal.MockitoCore", "mockingProgress", mockingProgress1);
            java.lang.Object[] objectArray = {null};
            
            /* This test fails because method [org.mockito.internal.MockitoCore.verifyNoMoreInteractions] produces [java.lang.IndexOutOfBoundsException: Greater or equal than length] */
            mockitoCore.verifyNoMoreInteractions(objectArray);
        } finally {
            setStaticField(ThreadSafeMockingProgress.class, "mockingProgress", prevMockingProgress);
        }
    }
    
    /**
    @utbot.classUnderTest {@link MockitoCore}
 * @utbot.methodUnderTest {@link org.mockito.internal.MockitoCore#verifyNoMoreInteractions(java.lang.Object[])}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} 
 *  */
    @Test
    public void testVerifyNoMoreInteractions_ThrowIndexOutOfBoundsException_4() throws Exception  {
        Class globalConfigurationClazz = Class.forName("org.mockito.internal.configuration.GlobalConfiguration");
        ThreadLocal prevGlobalConfiguration = ((ThreadLocal) getStaticFieldValue(globalConfigurationClazz, "globalConfiguration"));
        try {
            ThreadLocal globalConfiguration = ((ThreadLocal) createInstance("java.lang.ThreadLocal"));
            setField(globalConfiguration, "java.lang.ThreadLocal", "threadLocalHashCode", Integer.MIN_VALUE);
            setStaticField(globalConfigurationClazz, "globalConfiguration", globalConfiguration);
            MockitoCore mockitoCore = ((MockitoCore) createInstance("org.mockito.internal.MockitoCore"));
            MockingProgressImpl mockingProgress = ((MockingProgressImpl) createInstance("org.mockito.internal.progress.MockingProgressImpl"));
            setField(mockitoCore, "org.mockito.internal.MockitoCore", "mockingProgress", mockingProgress);
            java.lang.Object[] objectArray = {null};
            
            /* This test fails because method [org.mockito.internal.MockitoCore.verifyNoMoreInteractions] produces [java.lang.IndexOutOfBoundsException: Less than zero] */
            mockitoCore.verifyNoMoreInteractions(objectArray);
        } finally {
            setStaticField(org.mockito.internal.configuration.GlobalConfiguration.class, "globalConfiguration", prevGlobalConfiguration);
        }
    }
    
    /**
    @utbot.classUnderTest {@link MockitoCore}
 * @utbot.methodUnderTest {@link org.mockito.internal.MockitoCore#verifyNoMoreInteractions(java.lang.Object[])}
 * @utbot.invokes {@link org.mockito.internal.progress.MockingProgress#validateState()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: mockingProgress.validateState();
 *  */
    @Test
    public void testVerifyNoMoreInteractions_ThrowNullPointerException() throws Exception  {
        MockitoCore mockitoCore = ((MockitoCore) createInstance("org.mockito.internal.MockitoCore"));
        java.lang.Object[] objectArray = {null};
        
        /* This test fails because method [org.mockito.internal.MockitoCore.verifyNoMoreInteractions] produces [java.lang.NullPointerException] */
        mockitoCore.verifyNoMoreInteractions(objectArray);
    }
    
    /**
    @utbot.classUnderTest {@link MockitoCore}
 * @utbot.methodUnderTest {@link org.mockito.internal.MockitoCore#verifyNoMoreInteractions(java.lang.Object[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: assertMocksNotEmpty(mocks);
 *  */
    @Test
    public void testVerifyNoMoreInteractions_ThrowNullPointerException_1() throws Exception  {
        MockitoCore mockitoCore = ((MockitoCore) createInstance("org.mockito.internal.MockitoCore"));
        java.lang.Object[] objectArray = {};
        
        /* This test fails because method [org.mockito.internal.MockitoCore.verifyNoMoreInteractions] produces [java.lang.NullPointerException] */
        mockitoCore.verifyNoMoreInteractions(objectArray);
    }
    
    /**
    @utbot.classUnderTest {@link MockitoCore}
 * @utbot.methodUnderTest {@link org.mockito.internal.MockitoCore#verifyNoMoreInteractions(java.lang.Object[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: assertMocksNotEmpty(mocks);
 *  */
    @Test
    public void testVerifyNoMoreInteractions_ThrowNullPointerException_2() throws Exception  {
        MockitoCore mockitoCore = ((MockitoCore) createInstance("org.mockito.internal.MockitoCore"));
        
        /* This test fails because method [org.mockito.internal.MockitoCore.verifyNoMoreInteractions] produces [java.lang.NullPointerException] */
        mockitoCore.verifyNoMoreInteractions(null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method verifyNoMoreInteractions([Ljava.lang.Object;)
    
    /**
    @utbot.classUnderTest {@link MockitoCore}
 * @utbot.methodUnderTest {@link org.mockito.internal.MockitoCore#verifyNoMoreInteractions(java.lang.Object[])}
 * @utbot.throwsException {@link org.mockito.exceptions.base.MockitoException} in: assertMocksNotEmpty(mocks);
 *  */
    @Test(expected = MockitoException.class)
    public void testVerifyNoMoreInteractions_ThrowMockitoException() throws Exception  {
        MockitoCore mockitoCore = ((MockitoCore) createInstance("org.mockito.internal.MockitoCore"));
        Reporter reporter = ((Reporter) createInstance("org.mockito.exceptions.Reporter"));
        setField(mockitoCore, "org.mockito.internal.MockitoCore", "reporter", reporter);
        
        mockitoCore.verifyNoMoreInteractions(null);
    }
    
    /**
    @utbot.classUnderTest {@link MockitoCore}
 * @utbot.methodUnderTest {@link org.mockito.internal.MockitoCore#verifyNoMoreInteractions(java.lang.Object[])}
 * @utbot.invokes {@link org.mockito.internal.progress.MockingProgress#validateState()}
 * @utbot.throwsException {@link org.mockito.exceptions.misusing.UnfinishedStubbingException} in: mockingProgress.validateState();
 *  */
    @Test(expected = UnfinishedStubbingException.class)
    public void testVerifyNoMoreInteractions_ThrowUnfinishedStubbingException() throws Exception  {
        Class globalConfigurationClazz = Class.forName("org.mockito.internal.configuration.GlobalConfiguration");
        ThreadLocal prevGlobalConfiguration = ((ThreadLocal) getStaticFieldValue(globalConfigurationClazz, "globalConfiguration"));
        try {
            ThreadLocal globalConfiguration = ((ThreadLocal) createInstance("java.lang.ThreadLocal"));
            setField(globalConfiguration, "java.lang.ThreadLocal", "threadLocalHashCode", 1);
            setStaticField(globalConfigurationClazz, "globalConfiguration", globalConfiguration);
            MockitoCore mockitoCore = ((MockitoCore) createInstance("org.mockito.internal.MockitoCore"));
            MockingProgressImpl mockingProgress = ((MockingProgressImpl) createInstance("org.mockito.internal.progress.MockingProgressImpl"));
            Reporter reporter = ((Reporter) createInstance("org.mockito.exceptions.Reporter"));
            setField(mockingProgress, "org.mockito.internal.progress.MockingProgressImpl", "reporter", reporter);
            Location stubbingInProgress = ((Location) createInstance("org.mockito.internal.debugging.Location"));
            setField(mockingProgress, "org.mockito.internal.progress.MockingProgressImpl", "stubbingInProgress", stubbingInProgress);
            setField(mockitoCore, "org.mockito.internal.MockitoCore", "mockingProgress", mockingProgress);
            java.lang.Object[] objectArray = {null};
            
            mockitoCore.verifyNoMoreInteractions(objectArray);
        } finally {
            setStaticField(org.mockito.internal.configuration.GlobalConfiguration.class, "globalConfiguration", prevGlobalConfiguration);
        }
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method verifyNoMoreInteractions([Ljava.lang.Object;)
    
    /**
     * @utbot.classUnderTest {@link org.mockito.internal.MockitoCore}
     * @utbot.methodUnderTest {@link org.mockito.internal.MockitoCore#verifyNoMoreInteractions(java.lang.Object[])}
     */
    @Test
    public void testVerifyNoMoreInteractionsThrowsNAMEWithNonEmptyObjectArray() {
        MockitoCore mockitoCore = new MockitoCore();
        java.lang.Object[] objectArray = new java.lang.Object[3];
        Object object = new Object();
        objectArray[0] = object;
        Object object1 = new Object();
        objectArray[1] = object1;
        Object object2 = new Object();
        objectArray[2] = object2;
        
        /* This test fails because method [org.mockito.internal.MockitoCore.verifyNoMoreInteractions] produces [org.mockito.exceptions.misusing.NotAMockException: 
        Argument(s) passed is not a mock!
        Examples of correct verifications:
            verifyNoMoreInteractions(mockOne, mockTwo);
            verifyNoInteractions(mockOne, mockTwo);
        ] */
        mockitoCore.verifyNoMoreInteractions(objectArray);
    }
    
    /**
     * @utbot.classUnderTest {@link org.mockito.internal.MockitoCore}
     * @utbot.methodUnderTest {@link org.mockito.internal.MockitoCore#verifyNoMoreInteractions(java.lang.Object[])}
     */
    @Test
    public void testVerifyNoMoreInteractionsThrowsNAMEWithNonEmptyObjectArray1() {
        MockitoCore mockitoCore = new MockitoCore();
        java.lang.Object[] objectArray = new java.lang.Object[3];
        Object object = new Object();
        objectArray[0] = object;
        Object object1 = new Object();
        objectArray[1] = object1;
        Object object2 = new Object();
        objectArray[2] = object2;
        
        /* This test fails because method [org.mockito.internal.MockitoCore.verifyNoMoreInteractions] produces [org.mockito.exceptions.misusing.NotAMockException: 
        Argument(s) passed is not a mock!
        Examples of correct verifications:
            verifyNoMoreInteractions(mockOne, mockTwo);
            verifyNoInteractions(mockOne, mockTwo);
        ] */
        mockitoCore.verifyNoMoreInteractions(objectArray);
    }
    
    /**
     * @utbot.classUnderTest {@link org.mockito.internal.MockitoCore}
     * @utbot.methodUnderTest {@link org.mockito.internal.MockitoCore#verifyNoMoreInteractions(java.lang.Object[])}
     */
    @Test
    public void testVerifyNoMoreInteractionsThrowsNAMEWithNonEmptyObjectArray2() {
        MockitoCore mockitoCore = new MockitoCore();
        java.lang.Object[] objectArray = new java.lang.Object[3];
        Object object = new Object();
        objectArray[0] = object;
        Object object1 = new Object();
        objectArray[1] = object1;
        Object object2 = new Object();
        objectArray[2] = object2;
        
        /* This test fails because method [org.mockito.internal.MockitoCore.verifyNoMoreInteractions] produces [org.mockito.exceptions.misusing.NotAMockException: 
        Argument(s) passed is not a mock!
        Examples of correct verifications:
            verifyNoMoreInteractions(mockOne, mockTwo);
            verifyNoInteractions(mockOne, mockTwo);
        ] */
        mockitoCore.verifyNoMoreInteractions(objectArray);
    }
    
    /**
     * @utbot.classUnderTest {@link org.mockito.internal.MockitoCore}
     * @utbot.methodUnderTest {@link org.mockito.internal.MockitoCore#verifyNoMoreInteractions(java.lang.Object[])}
     */
    @Test
    public void testVerifyNoMoreInteractionsThrowsNAMEWithNonEmptyObjectArray3() {
        MockitoCore mockitoCore = new MockitoCore();
        java.lang.Object[] objectArray = new java.lang.Object[3];
        Object object = new Object();
        objectArray[0] = object;
        Object object1 = new Object();
        objectArray[1] = object1;
        Object object2 = new Object();
        objectArray[2] = object2;
        
        /* This test fails because method [org.mockito.internal.MockitoCore.verifyNoMoreInteractions] produces [org.mockito.exceptions.misusing.NotAMockException: 
        Argument(s) passed is not a mock!
        Examples of correct verifications:
            verifyNoMoreInteractions(mockOne, mockTwo);
            verifyNoInteractions(mockOne, mockTwo);
        ] */
        mockitoCore.verifyNoMoreInteractions(objectArray);
    }
    ///endregion
    
    ///region Errors report for verifyNoMoreInteractions
    
    public void testVerifyNoMoreInteractions_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 14 occurrences of:
        // Field reflectionFactory is not declared in class java.lang.reflect.AccessibleObject
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.mockito.internal.MockitoCore.verifyNoMoreInteractionsInOrder
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method verifyNoMoreInteractionsInOrder(java.util.List, org.mockito.internal.verification.api.InOrderContext)
    
    /**
    @utbot.classUnderTest {@link MockitoCore}
 * @utbot.methodUnderTest {@link org.mockito.internal.MockitoCore#verifyNoMoreInteractionsInOrder(java.util.List,org.mockito.internal.verification.api.InOrderContext)}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: mockingProgress.validateState();
 *  */
    @Test
    public void testVerifyNoMoreInteractionsInOrder_ThrowIndexOutOfBoundsException() throws Exception  {
        Class threadSafeMockingProgressClazz = Class.forName("org.mockito.internal.progress.ThreadSafeMockingProgress");
        ThreadLocal prevMockingProgress = ((ThreadLocal) getStaticFieldValue(threadSafeMockingProgressClazz, "mockingProgress"));
        try {
            ThreadLocal mockingProgress = ((ThreadLocal) createInstance("java.lang.ThreadLocal"));
            setStaticField(threadSafeMockingProgressClazz, "mockingProgress", mockingProgress);
            MockitoCore mockitoCore = ((MockitoCore) createInstance("org.mockito.internal.MockitoCore"));
            ThreadSafeMockingProgress mockingProgress1 = ((ThreadSafeMockingProgress) createInstance("org.mockito.internal.progress.ThreadSafeMockingProgress"));
            setField(mockitoCore, "org.mockito.internal.MockitoCore", "mockingProgress", mockingProgress1);
            
            /* This test fails because method [org.mockito.internal.MockitoCore.verifyNoMoreInteractionsInOrder] produces [java.lang.IndexOutOfBoundsException: Greater or equal than length] */
            mockitoCore.verifyNoMoreInteractionsInOrder(null, null);
        } finally {
            setStaticField(ThreadSafeMockingProgress.class, "mockingProgress", prevMockingProgress);
        }
    }
    
    /**
    @utbot.classUnderTest {@link MockitoCore}
 * @utbot.methodUnderTest {@link org.mockito.internal.MockitoCore#verifyNoMoreInteractionsInOrder(java.util.List,org.mockito.internal.verification.api.InOrderContext)}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: mockingProgress.validateState();
 *  */
    @Test
    public void testVerifyNoMoreInteractionsInOrder_ThrowIndexOutOfBoundsException_1() throws Exception  {
        Class threadSafeMockingProgressClazz = Class.forName("org.mockito.internal.progress.ThreadSafeMockingProgress");
        ThreadLocal prevMockingProgress = ((ThreadLocal) getStaticFieldValue(threadSafeMockingProgressClazz, "mockingProgress"));
        try {
            ThreadLocal mockingProgress = ((ThreadLocal) createInstance("java.lang.ThreadLocal"));
            setField(mockingProgress, "java.lang.ThreadLocal", "threadLocalHashCode", Integer.MIN_VALUE);
            setStaticField(threadSafeMockingProgressClazz, "mockingProgress", mockingProgress);
            MockitoCore mockitoCore = ((MockitoCore) createInstance("org.mockito.internal.MockitoCore"));
            ThreadSafeMockingProgress mockingProgress1 = ((ThreadSafeMockingProgress) createInstance("org.mockito.internal.progress.ThreadSafeMockingProgress"));
            setField(mockitoCore, "org.mockito.internal.MockitoCore", "mockingProgress", mockingProgress1);
            
            /* This test fails because method [org.mockito.internal.MockitoCore.verifyNoMoreInteractionsInOrder] produces [java.lang.IndexOutOfBoundsException: Less than zero] */
            mockitoCore.verifyNoMoreInteractionsInOrder(null, null);
        } finally {
            setStaticField(ThreadSafeMockingProgress.class, "mockingProgress", prevMockingProgress);
        }
    }
    
    /**
    @utbot.classUnderTest {@link MockitoCore}
 * @utbot.methodUnderTest {@link org.mockito.internal.MockitoCore#verifyNoMoreInteractionsInOrder(java.util.List,org.mockito.internal.verification.api.InOrderContext)}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} 
 *  */
    @Test
    public void testVerifyNoMoreInteractionsInOrder_ThrowIndexOutOfBoundsException_2() throws Exception  {
        Class threadSafeMockingProgressClazz = Class.forName("org.mockito.internal.progress.ThreadSafeMockingProgress");
        ThreadLocal prevMockingProgress = ((ThreadLocal) getStaticFieldValue(threadSafeMockingProgressClazz, "mockingProgress"));
        try {
            ThreadLocal mockingProgress = ((ThreadLocal) createInstance("java.lang.ThreadLocal"));
            setField(mockingProgress, "java.lang.ThreadLocal", "threadLocalHashCode", Integer.MIN_VALUE);
            setStaticField(threadSafeMockingProgressClazz, "mockingProgress", mockingProgress);
            MockitoCore mockitoCore = ((MockitoCore) createInstance("org.mockito.internal.MockitoCore"));
            ThreadSafeMockingProgress mockingProgress1 = ((ThreadSafeMockingProgress) createInstance("org.mockito.internal.progress.ThreadSafeMockingProgress"));
            setField(mockitoCore, "org.mockito.internal.MockitoCore", "mockingProgress", mockingProgress1);
            
            /* This test fails because method [org.mockito.internal.MockitoCore.verifyNoMoreInteractionsInOrder] produces [java.lang.IndexOutOfBoundsException: Less than zero] */
            mockitoCore.verifyNoMoreInteractionsInOrder(null, null);
        } finally {
            setStaticField(ThreadSafeMockingProgress.class, "mockingProgress", prevMockingProgress);
        }
    }
    
    /**
    @utbot.classUnderTest {@link MockitoCore}
 * @utbot.methodUnderTest {@link org.mockito.internal.MockitoCore#verifyNoMoreInteractionsInOrder(java.util.List,org.mockito.internal.verification.api.InOrderContext)}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} 
 *  */
    @Test
    public void testVerifyNoMoreInteractionsInOrder_ThrowIndexOutOfBoundsException_3() throws Exception  {
        Class threadSafeMockingProgressClazz = Class.forName("org.mockito.internal.progress.ThreadSafeMockingProgress");
        ThreadLocal prevMockingProgress = ((ThreadLocal) getStaticFieldValue(threadSafeMockingProgressClazz, "mockingProgress"));
        try {
            ThreadLocal mockingProgress = ((ThreadLocal) createInstance("java.lang.ThreadLocal"));
            setStaticField(threadSafeMockingProgressClazz, "mockingProgress", mockingProgress);
            MockitoCore mockitoCore = ((MockitoCore) createInstance("org.mockito.internal.MockitoCore"));
            ThreadSafeMockingProgress mockingProgress1 = ((ThreadSafeMockingProgress) createInstance("org.mockito.internal.progress.ThreadSafeMockingProgress"));
            setField(mockitoCore, "org.mockito.internal.MockitoCore", "mockingProgress", mockingProgress1);
            
            /* This test fails because method [org.mockito.internal.MockitoCore.verifyNoMoreInteractionsInOrder] produces [java.lang.IndexOutOfBoundsException: Greater or equal than length] */
            mockitoCore.verifyNoMoreInteractionsInOrder(null, null);
        } finally {
            setStaticField(ThreadSafeMockingProgress.class, "mockingProgress", prevMockingProgress);
        }
    }
    
    /**
    @utbot.classUnderTest {@link MockitoCore}
 * @utbot.methodUnderTest {@link org.mockito.internal.MockitoCore#verifyNoMoreInteractionsInOrder(java.util.List,org.mockito.internal.verification.api.InOrderContext)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: mockingProgress.validateState();
 *  */
    @Test
    public void testVerifyNoMoreInteractionsInOrder_ThrowNullPointerException() throws Exception  {
        MockitoCore mockitoCore = ((MockitoCore) createInstance("org.mockito.internal.MockitoCore"));
        
        /* This test fails because method [org.mockito.internal.MockitoCore.verifyNoMoreInteractionsInOrder] produces [java.lang.NullPointerException] */
        mockitoCore.verifyNoMoreInteractionsInOrder(null, null);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method verifyNoMoreInteractionsInOrder(java.util.List, org.mockito.internal.verification.api.InOrderContext)
    
    /**
     * @utbot.classUnderTest {@link org.mockito.internal.MockitoCore}
     * @utbot.methodUnderTest {@link org.mockito.internal.MockitoCore#verifyNoMoreInteractionsInOrder(java.util.List,org.mockito.internal.verification.api.InOrderContext)}
     */
    @Test
    public void testVerifyNoMoreInteractionsInOrder() {
        MockitoCore mockitoCore = new MockitoCore();
        List list = emptyList();
        List list1 = emptyList();
        InOrderImpl inOrderImpl = new InOrderImpl(list1);
        
        mockitoCore.verifyNoMoreInteractionsInOrder(list, inOrderImpl);
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method verifyNoMoreInteractionsInOrder(java.util.List, org.mockito.internal.verification.api.InOrderContext)
    
    /**
     * @utbot.classUnderTest {@link org.mockito.internal.MockitoCore}
     * @utbot.methodUnderTest {@link org.mockito.internal.MockitoCore#verifyNoMoreInteractionsInOrder(java.util.List,org.mockito.internal.verification.api.InOrderContext)}
     */
    @Test
    public void testVerifyNoMoreInteractionsInOrderThrowsNAME() {
        MockitoCore mockitoCore = new MockitoCore();
        ArrayList arrayList = new ArrayList();
        Object object = new Object();
        arrayList.add(object);
        
        /* This test fails because method [org.mockito.internal.MockitoCore.verifyNoMoreInteractionsInOrder] produces [org.mockito.exceptions.misusing.NotAMockException: Argument passed to Mockito.mockingDetails() should be a mock, but is an instance of class java.lang.Object!] */
        mockitoCore.verifyNoMoreInteractionsInOrder(arrayList, null);
    }
    
    /**
     * @utbot.classUnderTest {@link org.mockito.internal.MockitoCore}
     * @utbot.methodUnderTest {@link org.mockito.internal.MockitoCore#verifyNoMoreInteractionsInOrder(java.util.List,org.mockito.internal.verification.api.InOrderContext)}
     */
    @Test
    public void testVerifyNoMoreInteractionsInOrderThrowsNAME1() {
        MockitoCore mockitoCore = new MockitoCore();
        LinkedList linkedList = new LinkedList();
        Object object = new Object();
        linkedList.add(object);
        Object object1 = new Object();
        linkedList.add(object1);
        Object object2 = new Object();
        linkedList.add(object2);
        
        /* This test fails because method [org.mockito.internal.MockitoCore.verifyNoMoreInteractionsInOrder] produces [org.mockito.exceptions.misusing.NotAMockException: Argument passed to Mockito.mockingDetails() should be a mock, but is an instance of class java.lang.Object!] */
        mockitoCore.verifyNoMoreInteractionsInOrder(linkedList, null);
    }
    
    /**
     * @utbot.classUnderTest {@link org.mockito.internal.MockitoCore}
     * @utbot.methodUnderTest {@link org.mockito.internal.MockitoCore#verifyNoMoreInteractionsInOrder(java.util.List,org.mockito.internal.verification.api.InOrderContext)}
     */
    @Test
    public void testVerifyNoMoreInteractionsInOrderThrowsNAME2() {
        MockitoCore mockitoCore = new MockitoCore();
        LinkedList linkedList = new LinkedList();
        Object object = new Object();
        linkedList.add(object);
        Object object1 = new Object();
        linkedList.add(object1);
        Object object2 = new Object();
        linkedList.add(object2);
        
        /* This test fails because method [org.mockito.internal.MockitoCore.verifyNoMoreInteractionsInOrder] produces [org.mockito.exceptions.misusing.NotAMockException: Argument passed to Mockito.mockingDetails() should be a mock, but is an instance of class java.lang.Object!] */
        mockitoCore.verifyNoMoreInteractionsInOrder(linkedList, null);
    }
    ///endregion
    
    ///region Errors report for verifyNoMoreInteractionsInOrder
    
    public void testVerifyNoMoreInteractionsInOrder_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 14 occurrences of:
        // Field reflectionFactory is not declared in class java.lang.reflect.AccessibleObject
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.mockito.internal.MockitoCore.stub
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method stub()
    
    /**
    @utbot.classUnderTest {@link MockitoCore}
 * @utbot.methodUnderTest {@link org.mockito.internal.MockitoCore#stub()}
 * @utbot.invokes {@link org.mockito.internal.progress.MockingProgress#pullOngoingStubbing()}
 * @utbot.returnsFrom {@code return stubbing;}
 *  */
    @Test
    public void testStub_MockingProgressPullOngoingStubbing() throws Exception  {
        MockitoCore mockitoCore = ((MockitoCore) createInstance("org.mockito.internal.MockitoCore"));
        MockingProgressImpl mockingProgress = ((MockingProgressImpl) createInstance("org.mockito.internal.progress.MockingProgressImpl"));
        ConsecutiveStubbing iOngoingStubbing = ((ConsecutiveStubbing) createInstance("org.mockito.internal.stubbing.ConsecutiveStubbing"));
        setField(mockingProgress, "org.mockito.internal.progress.MockingProgressImpl", "iOngoingStubbing", iOngoingStubbing);
        setField(mockitoCore, "org.mockito.internal.MockitoCore", "mockingProgress", mockingProgress);
        
        ConsecutiveStubbing actual = ((ConsecutiveStubbing) mockitoCore.stub());
        
        ConsecutiveStubbing expected = new ConsecutiveStubbing(null);
        
        MockingProgress mockitoCoreMockingProgress = ((MockingProgress) getFieldValue(mockitoCore, "org.mockito.internal.MockitoCore", "mockingProgress"));
        IOngoingStubbing finalMockitoCoreMockingProgressIOngoingStubbing = ((IOngoingStubbing) getFieldValue(mockitoCoreMockingProgress, "org.mockito.internal.progress.MockingProgressImpl", "iOngoingStubbing"));
        
        assertNull(finalMockitoCoreMockingProgressIOngoingStubbing);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method stub()
    
    /**
    @utbot.classUnderTest {@link MockitoCore}
 * @utbot.methodUnderTest {@link org.mockito.internal.MockitoCore#stub()}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: IOngoingStubbing stubbing = mockingProgress.pullOngoingStubbing();
 *  */
    @Test
    public void testStub_ThrowIndexOutOfBoundsException() throws Exception  {
        Class threadSafeMockingProgressClazz = Class.forName("org.mockito.internal.progress.ThreadSafeMockingProgress");
        ThreadLocal prevMockingProgress = ((ThreadLocal) getStaticFieldValue(threadSafeMockingProgressClazz, "mockingProgress"));
        try {
            ThreadLocal mockingProgress = ((ThreadLocal) createInstance("java.lang.ThreadLocal"));
            setStaticField(threadSafeMockingProgressClazz, "mockingProgress", mockingProgress);
            MockitoCore mockitoCore = ((MockitoCore) createInstance("org.mockito.internal.MockitoCore"));
            ThreadSafeMockingProgress mockingProgress1 = ((ThreadSafeMockingProgress) createInstance("org.mockito.internal.progress.ThreadSafeMockingProgress"));
            setField(mockitoCore, "org.mockito.internal.MockitoCore", "mockingProgress", mockingProgress1);
            
            /* This test fails because method [org.mockito.internal.MockitoCore.stub] produces [java.lang.IndexOutOfBoundsException: Greater or equal than length] */
            mockitoCore.stub();
        } finally {
            setStaticField(ThreadSafeMockingProgress.class, "mockingProgress", prevMockingProgress);
        }
    }
    
    /**
    @utbot.classUnderTest {@link MockitoCore}
 * @utbot.methodUnderTest {@link org.mockito.internal.MockitoCore#stub()}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: IOngoingStubbing stubbing = mockingProgress.pullOngoingStubbing();
 *  */
    @Test
    public void testStub_ThrowIndexOutOfBoundsException_1() throws Exception  {
        Class threadSafeMockingProgressClazz = Class.forName("org.mockito.internal.progress.ThreadSafeMockingProgress");
        ThreadLocal prevMockingProgress = ((ThreadLocal) getStaticFieldValue(threadSafeMockingProgressClazz, "mockingProgress"));
        try {
            ThreadLocal mockingProgress = ((ThreadLocal) createInstance("java.lang.ThreadLocal"));
            setField(mockingProgress, "java.lang.ThreadLocal", "threadLocalHashCode", Integer.MIN_VALUE);
            setStaticField(threadSafeMockingProgressClazz, "mockingProgress", mockingProgress);
            MockitoCore mockitoCore = ((MockitoCore) createInstance("org.mockito.internal.MockitoCore"));
            ThreadSafeMockingProgress mockingProgress1 = ((ThreadSafeMockingProgress) createInstance("org.mockito.internal.progress.ThreadSafeMockingProgress"));
            setField(mockitoCore, "org.mockito.internal.MockitoCore", "mockingProgress", mockingProgress1);
            
            /* This test fails because method [org.mockito.internal.MockitoCore.stub] produces [java.lang.IndexOutOfBoundsException: Less than zero] */
            mockitoCore.stub();
        } finally {
            setStaticField(ThreadSafeMockingProgress.class, "mockingProgress", prevMockingProgress);
        }
    }
    
    /**
    @utbot.classUnderTest {@link MockitoCore}
 * @utbot.methodUnderTest {@link org.mockito.internal.MockitoCore#stub()}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} 
 *  */
    @Test
    public void testStub_ThrowIndexOutOfBoundsException_2() throws Exception  {
        Class threadSafeMockingProgressClazz = Class.forName("org.mockito.internal.progress.ThreadSafeMockingProgress");
        ThreadLocal prevMockingProgress = ((ThreadLocal) getStaticFieldValue(threadSafeMockingProgressClazz, "mockingProgress"));
        try {
            ThreadLocal mockingProgress = ((ThreadLocal) createInstance("java.lang.ThreadLocal"));
            setStaticField(threadSafeMockingProgressClazz, "mockingProgress", mockingProgress);
            MockitoCore mockitoCore = ((MockitoCore) createInstance("org.mockito.internal.MockitoCore"));
            ThreadSafeMockingProgress mockingProgress1 = ((ThreadSafeMockingProgress) createInstance("org.mockito.internal.progress.ThreadSafeMockingProgress"));
            setField(mockitoCore, "org.mockito.internal.MockitoCore", "mockingProgress", mockingProgress1);
            
            /* This test fails because method [org.mockito.internal.MockitoCore.stub] produces [java.lang.IndexOutOfBoundsException: Greater or equal than length] */
            mockitoCore.stub();
        } finally {
            setStaticField(ThreadSafeMockingProgress.class, "mockingProgress", prevMockingProgress);
        }
    }
    
    /**
    @utbot.classUnderTest {@link MockitoCore}
 * @utbot.methodUnderTest {@link org.mockito.internal.MockitoCore#stub()}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} 
 *  */
    @Test
    public void testStub_ThrowIndexOutOfBoundsException_3() throws Exception  {
        Class threadSafeMockingProgressClazz = Class.forName("org.mockito.internal.progress.ThreadSafeMockingProgress");
        ThreadLocal prevMockingProgress = ((ThreadLocal) getStaticFieldValue(threadSafeMockingProgressClazz, "mockingProgress"));
        try {
            ThreadLocal mockingProgress = ((ThreadLocal) createInstance("java.lang.ThreadLocal"));
            setField(mockingProgress, "java.lang.ThreadLocal", "threadLocalHashCode", Integer.MIN_VALUE);
            setStaticField(threadSafeMockingProgressClazz, "mockingProgress", mockingProgress);
            MockitoCore mockitoCore = ((MockitoCore) createInstance("org.mockito.internal.MockitoCore"));
            ThreadSafeMockingProgress mockingProgress1 = ((ThreadSafeMockingProgress) createInstance("org.mockito.internal.progress.ThreadSafeMockingProgress"));
            setField(mockitoCore, "org.mockito.internal.MockitoCore", "mockingProgress", mockingProgress1);
            
            /* This test fails because method [org.mockito.internal.MockitoCore.stub] produces [java.lang.IndexOutOfBoundsException: Less than zero] */
            mockitoCore.stub();
        } finally {
            setStaticField(ThreadSafeMockingProgress.class, "mockingProgress", prevMockingProgress);
        }
    }
    
    /**
    @utbot.classUnderTest {@link MockitoCore}
 * @utbot.methodUnderTest {@link org.mockito.internal.MockitoCore#stub()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: IOngoingStubbing stubbing = mockingProgress.pullOngoingStubbing();
 *  */
    @Test
    public void testStub_ThrowNullPointerException() throws Exception  {
        MockitoCore mockitoCore = ((MockitoCore) createInstance("org.mockito.internal.MockitoCore"));
        
        /* This test fails because method [org.mockito.internal.MockitoCore.stub] produces [java.lang.NullPointerException] */
        mockitoCore.stub();
    }
    ///endregion
    
    ///region Errors report for stub
    
    public void testStub_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 16 occurrences of:
        // Field reflectionFactory is not declared in class java.lang.reflect.AccessibleObject
        
        // 4 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.mockito.internal.MockitoCore.stub
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method stub(java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link MockitoCore}
 * @utbot.methodUnderTest {@link org.mockito.internal.MockitoCore#stub(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: mockingProgress.stubbingStarted();
 *  */
    @Test
    public void testStub_ThrowIndexOutOfBoundsException1() throws Exception  {
        Class threadSafeMockingProgressClazz = Class.forName("org.mockito.internal.progress.ThreadSafeMockingProgress");
        ThreadLocal prevMockingProgress = ((ThreadLocal) getStaticFieldValue(threadSafeMockingProgressClazz, "mockingProgress"));
        try {
            ThreadLocal mockingProgress = ((ThreadLocal) createInstance("java.lang.ThreadLocal"));
            setField(mockingProgress, "java.lang.ThreadLocal", "threadLocalHashCode", Integer.MIN_VALUE);
            setStaticField(threadSafeMockingProgressClazz, "mockingProgress", mockingProgress);
            MockitoCore mockitoCore = ((MockitoCore) createInstance("org.mockito.internal.MockitoCore"));
            ThreadSafeMockingProgress mockingProgress1 = ((ThreadSafeMockingProgress) createInstance("org.mockito.internal.progress.ThreadSafeMockingProgress"));
            setField(mockitoCore, "org.mockito.internal.MockitoCore", "mockingProgress", mockingProgress1);
            
            /* This test fails because method [org.mockito.internal.MockitoCore.stub] produces [java.lang.IndexOutOfBoundsException: Less than zero] */
            mockitoCore.stub(null);
        } finally {
            setStaticField(ThreadSafeMockingProgress.class, "mockingProgress", prevMockingProgress);
        }
    }
    
    /**
    @utbot.classUnderTest {@link MockitoCore}
 * @utbot.methodUnderTest {@link org.mockito.internal.MockitoCore#stub(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: mockingProgress.stubbingStarted();
 *  */
    @Test
    public void testStub_ThrowIndexOutOfBoundsException_11() throws Exception  {
        Class threadSafeMockingProgressClazz = Class.forName("org.mockito.internal.progress.ThreadSafeMockingProgress");
        ThreadLocal prevMockingProgress = ((ThreadLocal) getStaticFieldValue(threadSafeMockingProgressClazz, "mockingProgress"));
        try {
            ThreadLocal mockingProgress = ((ThreadLocal) createInstance("java.lang.ThreadLocal"));
            setStaticField(threadSafeMockingProgressClazz, "mockingProgress", mockingProgress);
            MockitoCore mockitoCore = ((MockitoCore) createInstance("org.mockito.internal.MockitoCore"));
            ThreadSafeMockingProgress mockingProgress1 = ((ThreadSafeMockingProgress) createInstance("org.mockito.internal.progress.ThreadSafeMockingProgress"));
            setField(mockitoCore, "org.mockito.internal.MockitoCore", "mockingProgress", mockingProgress1);
            
            /* This test fails because method [org.mockito.internal.MockitoCore.stub] produces [java.lang.IndexOutOfBoundsException: Greater or equal than length] */
            mockitoCore.stub(null);
        } finally {
            setStaticField(ThreadSafeMockingProgress.class, "mockingProgress", prevMockingProgress);
        }
    }
    
    /**
    @utbot.classUnderTest {@link MockitoCore}
 * @utbot.methodUnderTest {@link org.mockito.internal.MockitoCore#stub(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} 
 *  */
    @Test
    public void testStub_ThrowIndexOutOfBoundsException_21() throws Exception  {
        Class threadSafeMockingProgressClazz = Class.forName("org.mockito.internal.progress.ThreadSafeMockingProgress");
        ThreadLocal prevMockingProgress = ((ThreadLocal) getStaticFieldValue(threadSafeMockingProgressClazz, "mockingProgress"));
        try {
            ThreadLocal mockingProgress = ((ThreadLocal) createInstance("java.lang.ThreadLocal"));
            setField(mockingProgress, "java.lang.ThreadLocal", "threadLocalHashCode", Integer.MIN_VALUE);
            setStaticField(threadSafeMockingProgressClazz, "mockingProgress", mockingProgress);
            MockitoCore mockitoCore = ((MockitoCore) createInstance("org.mockito.internal.MockitoCore"));
            ThreadSafeMockingProgress mockingProgress1 = ((ThreadSafeMockingProgress) createInstance("org.mockito.internal.progress.ThreadSafeMockingProgress"));
            setField(mockitoCore, "org.mockito.internal.MockitoCore", "mockingProgress", mockingProgress1);
            
            /* This test fails because method [org.mockito.internal.MockitoCore.stub] produces [java.lang.IndexOutOfBoundsException: Less than zero] */
            mockitoCore.stub(null);
        } finally {
            setStaticField(ThreadSafeMockingProgress.class, "mockingProgress", prevMockingProgress);
        }
    }
    
    /**
    @utbot.classUnderTest {@link MockitoCore}
 * @utbot.methodUnderTest {@link org.mockito.internal.MockitoCore#stub(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} 
 *  */
    @Test
    public void testStub_ThrowIndexOutOfBoundsException_31() throws Exception  {
        Class threadSafeMockingProgressClazz = Class.forName("org.mockito.internal.progress.ThreadSafeMockingProgress");
        ThreadLocal prevMockingProgress = ((ThreadLocal) getStaticFieldValue(threadSafeMockingProgressClazz, "mockingProgress"));
        try {
            ThreadLocal mockingProgress = ((ThreadLocal) createInstance("java.lang.ThreadLocal"));
            setStaticField(threadSafeMockingProgressClazz, "mockingProgress", mockingProgress);
            MockitoCore mockitoCore = ((MockitoCore) createInstance("org.mockito.internal.MockitoCore"));
            ThreadSafeMockingProgress mockingProgress1 = ((ThreadSafeMockingProgress) createInstance("org.mockito.internal.progress.ThreadSafeMockingProgress"));
            setField(mockitoCore, "org.mockito.internal.MockitoCore", "mockingProgress", mockingProgress1);
            
            /* This test fails because method [org.mockito.internal.MockitoCore.stub] produces [java.lang.IndexOutOfBoundsException: Greater or equal than length] */
            mockitoCore.stub(null);
        } finally {
            setStaticField(ThreadSafeMockingProgress.class, "mockingProgress", prevMockingProgress);
        }
    }
    
    /**
    @utbot.classUnderTest {@link MockitoCore}
 * @utbot.methodUnderTest {@link org.mockito.internal.MockitoCore#stub(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} 
 *  */
    @Test
    public void testStub_ThrowIndexOutOfBoundsException_4() throws Exception  {
        Class threadSafeMockingProgressClazz = Class.forName("org.mockito.internal.progress.ThreadSafeMockingProgress");
        ThreadLocal prevMockingProgress = ((ThreadLocal) getStaticFieldValue(threadSafeMockingProgressClazz, "mockingProgress"));
        try {
            ThreadLocal mockingProgress = ((ThreadLocal) createInstance("java.lang.ThreadLocal"));
            setStaticField(threadSafeMockingProgressClazz, "mockingProgress", mockingProgress);
            MockitoCore mockitoCore = ((MockitoCore) createInstance("org.mockito.internal.MockitoCore"));
            ThreadSafeMockingProgress mockingProgress1 = ((ThreadSafeMockingProgress) createInstance("org.mockito.internal.progress.ThreadSafeMockingProgress"));
            setField(mockitoCore, "org.mockito.internal.MockitoCore", "mockingProgress", mockingProgress1);
            
            /* This test fails because method [org.mockito.internal.MockitoCore.stub] produces [java.lang.IndexOutOfBoundsException: Greater or equal than length] */
            mockitoCore.stub(null);
        } finally {
            setStaticField(ThreadSafeMockingProgress.class, "mockingProgress", prevMockingProgress);
        }
    }
    
    /**
    @utbot.classUnderTest {@link MockitoCore}
 * @utbot.methodUnderTest {@link org.mockito.internal.MockitoCore#stub(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: mockingProgress.stubbingStarted();
 *  */
    @Test
    public void testStub_ThrowNullPointerException1() throws Exception  {
        MockitoCore mockitoCore = ((MockitoCore) createInstance("org.mockito.internal.MockitoCore"));
        
        /* This test fails because method [org.mockito.internal.MockitoCore.stub] produces [java.lang.NullPointerException] */
        mockitoCore.stub(null);
    }
    ///endregion
    
    ///region Errors report for stub
    
    public void testStub_errors1()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 12 occurrences of:
        // Field reflectionFactory is not declared in class java.lang.reflect.AccessibleObject
        
        // 4 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.mockito.internal.MockitoCore.inOrder
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method inOrder([Ljava.lang.Object;)
    
    /**
    @utbot.classUnderTest {@link MockitoCore}
 * @utbot.methodUnderTest {@link org.mockito.internal.MockitoCore#inOrder(java.lang.Object[])}
 * @utbot.executesCondition {@code (mocks == null): False}
 * @utbot.executesCondition {@code (mocks.length == 0): False}
 * @utbot.iterates iterate the loop {@code for(Object mock: mocks)} once
 * @utbot.throwsException {@link java.lang.ClassCastException} when: !mockUtil.isMock(mock)
 *  */
    @Test
    public void testInOrder_ThrowClassCastException() throws Exception  {
        MockitoCore mockitoCore = ((MockitoCore) createInstance("org.mockito.internal.MockitoCore"));
        MockUtil mockUtil = ((MockUtil) createInstance("org.mockito.internal.util.MockUtil"));
        setField(mockitoCore, "org.mockito.internal.MockitoCore", "mockUtil", mockUtil);
        java.lang.Object[] objectArray = new java.lang.Object[1];
        Object object = new Object();
        objectArray[0] = object;
        
        /* This test fails because method [org.mockito.internal.MockitoCore.inOrder] produces [java.lang.ClassCastException: The object with type java.lang.Object can not be casted to java.lang.Class$ReflectionData] */
        mockitoCore.inOrder(objectArray);
    }
    
    /**
    @utbot.classUnderTest {@link MockitoCore}
 * @utbot.methodUnderTest {@link org.mockito.internal.MockitoCore#inOrder(java.lang.Object[])}
 * @utbot.executesCondition {@code (mocks == null): False}
 * @utbot.executesCondition {@code (mocks.length == 0): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: reporter.mocksHaveToBePassedWhenCreatingInOrder();
 *  */
    @Test
    public void testInOrder_ThrowNullPointerException() throws Exception  {
        MockitoCore mockitoCore = ((MockitoCore) createInstance("org.mockito.internal.MockitoCore"));
        java.lang.Object[] objectArray = {};
        
        /* This test fails because method [org.mockito.internal.MockitoCore.inOrder] produces [java.lang.NullPointerException] */
        mockitoCore.inOrder(objectArray);
    }
    
    /**
    @utbot.classUnderTest {@link MockitoCore}
 * @utbot.methodUnderTest {@link org.mockito.internal.MockitoCore#inOrder(java.lang.Object[])}
 * @utbot.executesCondition {@code (mocks == null): False}
 * @utbot.executesCondition {@code (mocks.length == 0): False}
 * @utbot.iterates iterate the loop {@code for(Object mock: mocks)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} when: !mockUtil.isMock(mock)
 *  */
    @Test
    public void testInOrder_ThrowNullPointerException_1() throws Exception  {
        MockitoCore mockitoCore = ((MockitoCore) createInstance("org.mockito.internal.MockitoCore"));
        java.lang.Object[] objectArray = new java.lang.Object[1];
        Object object = new Object();
        objectArray[0] = object;
        
        /* This test fails because method [org.mockito.internal.MockitoCore.inOrder] produces [java.lang.NullPointerException] */
        mockitoCore.inOrder(objectArray);
    }
    
    /**
    @utbot.classUnderTest {@link MockitoCore}
 * @utbot.methodUnderTest {@link org.mockito.internal.MockitoCore#inOrder(java.lang.Object[])}
 * @utbot.executesCondition {@code (mocks == null): False}
 * @utbot.executesCondition {@code (mocks.length == 0): False}
 * @utbot.iterates iterate the loop {@code for(Object mock: mocks)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: reporter.nullPassedWhenCreatingInOrder();
 *  */
    @Test
    public void testInOrder_ThrowNullPointerException_2() throws Exception  {
        MockitoCore mockitoCore = ((MockitoCore) createInstance("org.mockito.internal.MockitoCore"));
        java.lang.Object[] objectArray = {null};
        
        /* This test fails because method [org.mockito.internal.MockitoCore.inOrder] produces [java.lang.NullPointerException] */
        mockitoCore.inOrder(objectArray);
    }
    
    /**
    @utbot.classUnderTest {@link MockitoCore}
 * @utbot.methodUnderTest {@link org.mockito.internal.MockitoCore#inOrder(java.lang.Object[])}
 * @utbot.executesCondition {@code (mocks == null): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: reporter.mocksHaveToBePassedWhenCreatingInOrder();
 *  */
    @Test
    public void testInOrder_ThrowNullPointerException_3() throws Exception  {
        MockitoCore mockitoCore = ((MockitoCore) createInstance("org.mockito.internal.MockitoCore"));
        
        /* This test fails because method [org.mockito.internal.MockitoCore.inOrder] produces [java.lang.NullPointerException] */
        mockitoCore.inOrder(null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method inOrder([Ljava.lang.Object;)
    
    /**
    @utbot.classUnderTest {@link MockitoCore}
 * @utbot.methodUnderTest {@link org.mockito.internal.MockitoCore#inOrder(java.lang.Object[])}
 * @utbot.executesCondition {@code (mocks == null): False}
 * @utbot.executesCondition {@code (mocks.length == 0): False}
 * @utbot.iterates iterate the loop {@code for(Object mock: mocks)} once
 * @utbot.throwsException {@link org.mockito.exceptions.misusing.NullInsteadOfMockException} in: reporter.nullPassedWhenCreatingInOrder();
 *  */
    @Test(expected = NullInsteadOfMockException.class)
    public void testInOrder_ThrowNullInsteadOfMockException() throws Exception  {
        MockitoCore mockitoCore = ((MockitoCore) createInstance("org.mockito.internal.MockitoCore"));
        Reporter reporter = ((Reporter) createInstance("org.mockito.exceptions.Reporter"));
        setField(mockitoCore, "org.mockito.internal.MockitoCore", "reporter", reporter);
        java.lang.Object[] objectArray = {null};
        
        mockitoCore.inOrder(objectArray);
    }
    
    /**
    @utbot.classUnderTest {@link MockitoCore}
 * @utbot.methodUnderTest {@link org.mockito.internal.MockitoCore#inOrder(java.lang.Object[])}
 * @utbot.executesCondition {@code (mocks == null): True}
 * @utbot.invokes {@link org.mockito.exceptions.Reporter#mocksHaveToBePassedWhenCreatingInOrder()}
 * @utbot.throwsException {@link org.mockito.exceptions.base.MockitoException} in: reporter.mocksHaveToBePassedWhenCreatingInOrder();
 *  */
    @Test(expected = MockitoException.class)
    public void testInOrder_ThrowMockitoException() throws Exception  {
        MockitoCore mockitoCore = ((MockitoCore) createInstance("org.mockito.internal.MockitoCore"));
        Reporter reporter = ((Reporter) createInstance("org.mockito.exceptions.Reporter"));
        setField(mockitoCore, "org.mockito.internal.MockitoCore", "reporter", reporter);
        
        mockitoCore.inOrder(null);
    }
    
    /**
    @utbot.classUnderTest {@link MockitoCore}
 * @utbot.methodUnderTest {@link org.mockito.internal.MockitoCore#inOrder(java.lang.Object[])}
 * @utbot.executesCondition {@code (mocks == null): False}
 * @utbot.executesCondition {@code (mocks.length == 0): False}
 * @utbot.iterates iterate the loop {@code for(Object mock: mocks)} once
 * @utbot.throwsException {@link org.mockito.exceptions.misusing.NotAMockException} in: reporter.notAMockPassedWhenCreatingInOrder();
 *  */
    @Test(expected = NotAMockException.class)
    public void testInOrder_ThrowNotAMockException() throws Exception  {
        MockitoCore mockitoCore = ((MockitoCore) createInstance("org.mockito.internal.MockitoCore"));
        Reporter reporter = ((Reporter) createInstance("org.mockito.exceptions.Reporter"));
        setField(mockitoCore, "org.mockito.internal.MockitoCore", "reporter", reporter);
        MockUtil mockUtil = ((MockUtil) createInstance("org.mockito.internal.util.MockUtil"));
        setField(mockitoCore, "org.mockito.internal.MockitoCore", "mockUtil", mockUtil);
        java.lang.Object[] objectArray = new java.lang.Object[1];
        Object object = new Object();
        objectArray[0] = object;
        
        mockitoCore.inOrder(objectArray);
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method inOrder([Ljava.lang.Object;)
    
    /**
     * @utbot.classUnderTest {@link org.mockito.internal.MockitoCore}
     * @utbot.methodUnderTest {@link org.mockito.internal.MockitoCore#inOrder(java.lang.Object[])}
     */
    @Test
    public void testInOrderThrowsNAMEWithNonEmptyObjectArray() {
        MockitoCore mockitoCore = new MockitoCore();
        java.lang.Object[] objectArray = new java.lang.Object[3];
        Object object = new Object();
        objectArray[0] = object;
        Object object1 = new Object();
        objectArray[1] = object1;
        Object object2 = new Object();
        objectArray[2] = object2;
        
        /* This test fails because method [org.mockito.internal.MockitoCore.inOrder] produces [org.mockito.exceptions.misusing.NotAMockException: 
        Argument(s) passed is not a mock!
        Pass mocks that require verification in order.
        For example:
            InOrder inOrder = inOrder(mockOne, mockTwo);] */
        mockitoCore.inOrder(objectArray);
    }
    
    /**
     * @utbot.classUnderTest {@link org.mockito.internal.MockitoCore}
     * @utbot.methodUnderTest {@link org.mockito.internal.MockitoCore#inOrder(java.lang.Object[])}
     */
    @Test
    public void testInOrderThrowsNAMEWithNonEmptyObjectArray1() {
        MockitoCore mockitoCore = new MockitoCore();
        java.lang.Object[] objectArray = new java.lang.Object[3];
        Object object = new Object();
        objectArray[0] = object;
        Object object1 = new Object();
        objectArray[1] = object1;
        Object object2 = new Object();
        objectArray[2] = object2;
        
        /* This test fails because method [org.mockito.internal.MockitoCore.inOrder] produces [org.mockito.exceptions.misusing.NotAMockException: 
        Argument(s) passed is not a mock!
        Pass mocks that require verification in order.
        For example:
            InOrder inOrder = inOrder(mockOne, mockTwo);] */
        mockitoCore.inOrder(objectArray);
    }
    
    /**
     * @utbot.classUnderTest {@link org.mockito.internal.MockitoCore}
     * @utbot.methodUnderTest {@link org.mockito.internal.MockitoCore#inOrder(java.lang.Object[])}
     */
    @Test
    public void testInOrderThrowsNAMEWithNonEmptyObjectArray2() {
        MockitoCore mockitoCore = new MockitoCore();
        java.lang.Object[] objectArray = new java.lang.Object[3];
        Object object = new Object();
        objectArray[0] = object;
        Object object1 = new Object();
        objectArray[1] = object1;
        Object object2 = new Object();
        objectArray[2] = object2;
        
        /* This test fails because method [org.mockito.internal.MockitoCore.inOrder] produces [org.mockito.exceptions.misusing.NotAMockException: 
        Argument(s) passed is not a mock!
        Pass mocks that require verification in order.
        For example:
            InOrder inOrder = inOrder(mockOne, mockTwo);] */
        mockitoCore.inOrder(objectArray);
    }
    
    /**
     * @utbot.classUnderTest {@link org.mockito.internal.MockitoCore}
     * @utbot.methodUnderTest {@link org.mockito.internal.MockitoCore#inOrder(java.lang.Object[])}
     */
    @Test
    public void testInOrderThrowsNAMEWithNonEmptyObjectArray3() {
        MockitoCore mockitoCore = new MockitoCore();
        java.lang.Object[] objectArray = new java.lang.Object[3];
        Object object = new Object();
        objectArray[0] = object;
        Object object1 = new Object();
        objectArray[1] = object1;
        Object object2 = new Object();
        objectArray[2] = object2;
        
        /* This test fails because method [org.mockito.internal.MockitoCore.inOrder] produces [org.mockito.exceptions.misusing.NotAMockException: 
        Argument(s) passed is not a mock!
        Pass mocks that require verification in order.
        For example:
            InOrder inOrder = inOrder(mockOne, mockTwo);] */
        mockitoCore.inOrder(objectArray);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.mockito.internal.MockitoCore.stubVoid
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method stubVoid(java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link MockitoCore}
 * @utbot.methodUnderTest {@link org.mockito.internal.MockitoCore#stubVoid(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.ClassCastException} 
 *  */
    @Test
    public void testStubVoid_ThrowClassCastException() throws Exception  {
        MockitoCore mockitoCore = ((MockitoCore) createInstance("org.mockito.internal.MockitoCore"));
        MockUtil mockUtil = ((MockUtil) createInstance("org.mockito.internal.util.MockUtil"));
        setField(mockitoCore, "org.mockito.internal.MockitoCore", "mockUtil", mockUtil);
        short[] shortArray = {};
        
        /* This test fails because method [org.mockito.internal.MockitoCore.stubVoid] produces [java.lang.ClassCastException: The object with type java.lang.Object can not be casted to java.lang.Class$ReflectionData] */
        mockitoCore.stubVoid(shortArray);
    }
    
    /**
    @utbot.classUnderTest {@link MockitoCore}
 * @utbot.methodUnderTest {@link org.mockito.internal.MockitoCore#stubVoid(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test
    public void testStubVoid_ThrowNullPointerException() throws Exception  {
        MockitoCore mockitoCore = ((MockitoCore) createInstance("org.mockito.internal.MockitoCore"));
        MockUtil mockUtil = ((MockUtil) createInstance("org.mockito.internal.util.MockUtil"));
        setField(mockitoCore, "org.mockito.internal.MockitoCore", "mockUtil", mockUtil);
        short[] shortArray = {};
        
        /* This test fails because method [org.mockito.internal.MockitoCore.stubVoid] produces [java.lang.NullPointerException] */
        mockitoCore.stubVoid(shortArray);
    }
    
    /**
    @utbot.classUnderTest {@link MockitoCore}
 * @utbot.methodUnderTest {@link org.mockito.internal.MockitoCore#stubVoid(java.lang.Object)}
 * @utbot.invokes {@link org.mockito.internal.util.MockUtil#getMockHandler(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: MockHandlerInterface<T> handler = mockUtil.getMockHandler(mock);
 *  */
    @Test
    public void testStubVoid_ThrowNullPointerException_1() throws Exception  {
        MockitoCore mockitoCore = ((MockitoCore) createInstance("org.mockito.internal.MockitoCore"));
        
        /* This test fails because method [org.mockito.internal.MockitoCore.stubVoid] produces [java.lang.NullPointerException] */
        mockitoCore.stubVoid(null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method stubVoid(java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link MockitoCore}
 * @utbot.methodUnderTest {@link org.mockito.internal.MockitoCore#stubVoid(java.lang.Object)}
 * @utbot.throwsException {@link org.mockito.exceptions.misusing.NotAMockException} 
 *  */
    @Test(expected = NotAMockException.class)
    public void testStubVoid_ThrowNotAMockException() throws Exception  {
        MockitoCore mockitoCore = ((MockitoCore) createInstance("org.mockito.internal.MockitoCore"));
        MockUtil mockUtil = ((MockUtil) createInstance("org.mockito.internal.util.MockUtil"));
        setField(mockitoCore, "org.mockito.internal.MockitoCore", "mockUtil", mockUtil);
        byte[] byteArray = {};
        
        mockitoCore.stubVoid(byteArray);
    }
    
    /**
    @utbot.classUnderTest {@link MockitoCore}
 * @utbot.methodUnderTest {@link org.mockito.internal.MockitoCore#stubVoid(java.lang.Object)}
 * @utbot.throwsException {@link org.mockito.exceptions.misusing.NotAMockException} in: MockHandlerInterface<T> handler = mockUtil.getMockHandler(mock);
 *  */
    @Test(expected = NotAMockException.class)
    public void testStubVoid_ThrowNotAMockException_1() throws Exception  {
        MockitoCore mockitoCore = ((MockitoCore) createInstance("org.mockito.internal.MockitoCore"));
        MockUtil mockUtil = ((MockUtil) createInstance("org.mockito.internal.util.MockUtil"));
        setField(mockitoCore, "org.mockito.internal.MockitoCore", "mockUtil", mockUtil);
        
        mockitoCore.stubVoid(null);
    }
    ///endregion
    
    ///region Errors report for stubVoid
    
    public void testStubVoid_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 4 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.mockito.internal.MockitoCore.doAnswer
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method doAnswer(org.mockito.stubbing.Answer)
    
    /**
    @utbot.classUnderTest {@link MockitoCore}
 * @utbot.methodUnderTest {@link org.mockito.internal.MockitoCore#doAnswer(org.mockito.stubbing.Answer)}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: mockingProgress.stubbingStarted();
 *  */
    @Test
    public void testDoAnswer_ThrowIndexOutOfBoundsException() throws Exception  {
        Class threadSafeMockingProgressClazz = Class.forName("org.mockito.internal.progress.ThreadSafeMockingProgress");
        ThreadLocal prevMockingProgress = ((ThreadLocal) getStaticFieldValue(threadSafeMockingProgressClazz, "mockingProgress"));
        try {
            ThreadLocal mockingProgress = ((ThreadLocal) createInstance("java.lang.ThreadLocal"));
            setField(mockingProgress, "java.lang.ThreadLocal", "threadLocalHashCode", Integer.MIN_VALUE);
            setStaticField(threadSafeMockingProgressClazz, "mockingProgress", mockingProgress);
            MockitoCore mockitoCore = ((MockitoCore) createInstance("org.mockito.internal.MockitoCore"));
            ThreadSafeMockingProgress mockingProgress1 = ((ThreadSafeMockingProgress) createInstance("org.mockito.internal.progress.ThreadSafeMockingProgress"));
            setField(mockitoCore, "org.mockito.internal.MockitoCore", "mockingProgress", mockingProgress1);
            
            /* This test fails because method [org.mockito.internal.MockitoCore.doAnswer] produces [java.lang.IndexOutOfBoundsException: Less than zero] */
            mockitoCore.doAnswer(null);
        } finally {
            setStaticField(ThreadSafeMockingProgress.class, "mockingProgress", prevMockingProgress);
        }
    }
    
    /**
    @utbot.classUnderTest {@link MockitoCore}
 * @utbot.methodUnderTest {@link org.mockito.internal.MockitoCore#doAnswer(org.mockito.stubbing.Answer)}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: mockingProgress.stubbingStarted();
 *  */
    @Test
    public void testDoAnswer_ThrowIndexOutOfBoundsException_1() throws Exception  {
        Class threadSafeMockingProgressClazz = Class.forName("org.mockito.internal.progress.ThreadSafeMockingProgress");
        ThreadLocal prevMockingProgress = ((ThreadLocal) getStaticFieldValue(threadSafeMockingProgressClazz, "mockingProgress"));
        try {
            ThreadLocal mockingProgress = ((ThreadLocal) createInstance("java.lang.ThreadLocal"));
            setStaticField(threadSafeMockingProgressClazz, "mockingProgress", mockingProgress);
            MockitoCore mockitoCore = ((MockitoCore) createInstance("org.mockito.internal.MockitoCore"));
            ThreadSafeMockingProgress mockingProgress1 = ((ThreadSafeMockingProgress) createInstance("org.mockito.internal.progress.ThreadSafeMockingProgress"));
            setField(mockitoCore, "org.mockito.internal.MockitoCore", "mockingProgress", mockingProgress1);
            
            /* This test fails because method [org.mockito.internal.MockitoCore.doAnswer] produces [java.lang.IndexOutOfBoundsException: Greater or equal than length] */
            mockitoCore.doAnswer(null);
        } finally {
            setStaticField(ThreadSafeMockingProgress.class, "mockingProgress", prevMockingProgress);
        }
    }
    
    /**
    @utbot.classUnderTest {@link MockitoCore}
 * @utbot.methodUnderTest {@link org.mockito.internal.MockitoCore#doAnswer(org.mockito.stubbing.Answer)}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} 
 *  */
    @Test
    public void testDoAnswer_ThrowIndexOutOfBoundsException_2() throws Exception  {
        Class threadSafeMockingProgressClazz = Class.forName("org.mockito.internal.progress.ThreadSafeMockingProgress");
        ThreadLocal prevMockingProgress = ((ThreadLocal) getStaticFieldValue(threadSafeMockingProgressClazz, "mockingProgress"));
        try {
            ThreadLocal mockingProgress = ((ThreadLocal) createInstance("java.lang.ThreadLocal"));
            setField(mockingProgress, "java.lang.ThreadLocal", "threadLocalHashCode", Integer.MIN_VALUE);
            setStaticField(threadSafeMockingProgressClazz, "mockingProgress", mockingProgress);
            MockitoCore mockitoCore = ((MockitoCore) createInstance("org.mockito.internal.MockitoCore"));
            ThreadSafeMockingProgress mockingProgress1 = ((ThreadSafeMockingProgress) createInstance("org.mockito.internal.progress.ThreadSafeMockingProgress"));
            setField(mockitoCore, "org.mockito.internal.MockitoCore", "mockingProgress", mockingProgress1);
            
            /* This test fails because method [org.mockito.internal.MockitoCore.doAnswer] produces [java.lang.IndexOutOfBoundsException: Less than zero] */
            mockitoCore.doAnswer(null);
        } finally {
            setStaticField(ThreadSafeMockingProgress.class, "mockingProgress", prevMockingProgress);
        }
    }
    
    /**
    @utbot.classUnderTest {@link MockitoCore}
 * @utbot.methodUnderTest {@link org.mockito.internal.MockitoCore#doAnswer(org.mockito.stubbing.Answer)}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} 
 *  */
    @Test
    public void testDoAnswer_ThrowIndexOutOfBoundsException_3() throws Exception  {
        Class threadSafeMockingProgressClazz = Class.forName("org.mockito.internal.progress.ThreadSafeMockingProgress");
        ThreadLocal prevMockingProgress = ((ThreadLocal) getStaticFieldValue(threadSafeMockingProgressClazz, "mockingProgress"));
        try {
            ThreadLocal mockingProgress = ((ThreadLocal) createInstance("java.lang.ThreadLocal"));
            setStaticField(threadSafeMockingProgressClazz, "mockingProgress", mockingProgress);
            MockitoCore mockitoCore = ((MockitoCore) createInstance("org.mockito.internal.MockitoCore"));
            ThreadSafeMockingProgress mockingProgress1 = ((ThreadSafeMockingProgress) createInstance("org.mockito.internal.progress.ThreadSafeMockingProgress"));
            setField(mockitoCore, "org.mockito.internal.MockitoCore", "mockingProgress", mockingProgress1);
            
            /* This test fails because method [org.mockito.internal.MockitoCore.doAnswer] produces [java.lang.IndexOutOfBoundsException: Greater or equal than length] */
            mockitoCore.doAnswer(null);
        } finally {
            setStaticField(ThreadSafeMockingProgress.class, "mockingProgress", prevMockingProgress);
        }
    }
    
    /**
    @utbot.classUnderTest {@link MockitoCore}
 * @utbot.methodUnderTest {@link org.mockito.internal.MockitoCore#doAnswer(org.mockito.stubbing.Answer)}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} 
 *  */
    @Test
    public void testDoAnswer_ThrowIndexOutOfBoundsException_4() throws Exception  {
        Class threadSafeMockingProgressClazz = Class.forName("org.mockito.internal.progress.ThreadSafeMockingProgress");
        ThreadLocal prevMockingProgress = ((ThreadLocal) getStaticFieldValue(threadSafeMockingProgressClazz, "mockingProgress"));
        try {
            ThreadLocal mockingProgress = ((ThreadLocal) createInstance("java.lang.ThreadLocal"));
            setStaticField(threadSafeMockingProgressClazz, "mockingProgress", mockingProgress);
            MockitoCore mockitoCore = ((MockitoCore) createInstance("org.mockito.internal.MockitoCore"));
            ThreadSafeMockingProgress mockingProgress1 = ((ThreadSafeMockingProgress) createInstance("org.mockito.internal.progress.ThreadSafeMockingProgress"));
            setField(mockitoCore, "org.mockito.internal.MockitoCore", "mockingProgress", mockingProgress1);
            
            /* This test fails because method [org.mockito.internal.MockitoCore.doAnswer] produces [java.lang.IndexOutOfBoundsException: Greater or equal than length] */
            mockitoCore.doAnswer(null);
        } finally {
            setStaticField(ThreadSafeMockingProgress.class, "mockingProgress", prevMockingProgress);
        }
    }
    
    /**
    @utbot.classUnderTest {@link MockitoCore}
 * @utbot.methodUnderTest {@link org.mockito.internal.MockitoCore#doAnswer(org.mockito.stubbing.Answer)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: mockingProgress.stubbingStarted();
 *  */
    @Test
    public void testDoAnswer_ThrowNullPointerException() throws Exception  {
        MockitoCore mockitoCore = ((MockitoCore) createInstance("org.mockito.internal.MockitoCore"));
        
        /* This test fails because method [org.mockito.internal.MockitoCore.doAnswer] produces [java.lang.NullPointerException] */
        mockitoCore.doAnswer(null);
    }
    ///endregion
    
    ///region Errors report for doAnswer
    
    public void testDoAnswer_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 12 occurrences of:
        // Field reflectionFactory is not declared in class java.lang.reflect.AccessibleObject
        
        // 2 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.mockito.internal.MockitoCore.getLastInvocation
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getLastInvocation()
    
    /**
    @utbot.classUnderTest {@link MockitoCore}
 * @utbot.methodUnderTest {@link org.mockito.internal.MockitoCore#getLastInvocation()}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: OngoingStubbingImpl ongoingStubbing = ((OngoingStubbingImpl) mockingProgress.pullOngoingStubbing());
 *  */
    @Test
    public void testGetLastInvocation_ThrowClassCastException() throws Exception  {
        MockitoCore mockitoCore = ((MockitoCore) createInstance("org.mockito.internal.MockitoCore"));
        MockingProgressImpl mockingProgress = ((MockingProgressImpl) createInstance("org.mockito.internal.progress.MockingProgressImpl"));
        ConsecutiveStubbing iOngoingStubbing = ((ConsecutiveStubbing) createInstance("org.mockito.internal.stubbing.ConsecutiveStubbing"));
        setField(mockingProgress, "org.mockito.internal.progress.MockingProgressImpl", "iOngoingStubbing", iOngoingStubbing);
        setField(mockitoCore, "org.mockito.internal.MockitoCore", "mockingProgress", mockingProgress);
        
        /* This test fails because method [org.mockito.internal.MockitoCore.getLastInvocation] produces [java.lang.ClassCastException: The object with type org.mockito.internal.progress.IOngoingStubbing can not be casted to org.mockito.internal.stubbing.OngoingStubbingImpl] */
        mockitoCore.getLastInvocation();
    }
    
    /**
    @utbot.classUnderTest {@link MockitoCore}
 * @utbot.methodUnderTest {@link org.mockito.internal.MockitoCore#getLastInvocation()}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: OngoingStubbingImpl ongoingStubbing = ((OngoingStubbingImpl) mockingProgress.pullOngoingStubbing());
 *  */
    @Test
    public void testGetLastInvocation_ThrowIndexOutOfBoundsException() throws Exception  {
        Class threadSafeMockingProgressClazz = Class.forName("org.mockito.internal.progress.ThreadSafeMockingProgress");
        ThreadLocal prevMockingProgress = ((ThreadLocal) getStaticFieldValue(threadSafeMockingProgressClazz, "mockingProgress"));
        try {
            ThreadLocal mockingProgress = ((ThreadLocal) createInstance("java.lang.ThreadLocal"));
            setField(mockingProgress, "java.lang.ThreadLocal", "threadLocalHashCode", Integer.MIN_VALUE);
            setStaticField(threadSafeMockingProgressClazz, "mockingProgress", mockingProgress);
            MockitoCore mockitoCore = ((MockitoCore) createInstance("org.mockito.internal.MockitoCore"));
            ThreadSafeMockingProgress mockingProgress1 = ((ThreadSafeMockingProgress) createInstance("org.mockito.internal.progress.ThreadSafeMockingProgress"));
            setField(mockitoCore, "org.mockito.internal.MockitoCore", "mockingProgress", mockingProgress1);
            
            /* This test fails because method [org.mockito.internal.MockitoCore.getLastInvocation] produces [java.lang.IndexOutOfBoundsException: Less than zero] */
            mockitoCore.getLastInvocation();
        } finally {
            setStaticField(ThreadSafeMockingProgress.class, "mockingProgress", prevMockingProgress);
        }
    }
    
    /**
    @utbot.classUnderTest {@link MockitoCore}
 * @utbot.methodUnderTest {@link org.mockito.internal.MockitoCore#getLastInvocation()}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: OngoingStubbingImpl ongoingStubbing = ((OngoingStubbingImpl) mockingProgress.pullOngoingStubbing());
 *  */
    @Test
    public void testGetLastInvocation_ThrowIndexOutOfBoundsException_1() throws Exception  {
        Class threadSafeMockingProgressClazz = Class.forName("org.mockito.internal.progress.ThreadSafeMockingProgress");
        ThreadLocal prevMockingProgress = ((ThreadLocal) getStaticFieldValue(threadSafeMockingProgressClazz, "mockingProgress"));
        try {
            ThreadLocal mockingProgress = ((ThreadLocal) createInstance("java.lang.ThreadLocal"));
            setStaticField(threadSafeMockingProgressClazz, "mockingProgress", mockingProgress);
            MockitoCore mockitoCore = ((MockitoCore) createInstance("org.mockito.internal.MockitoCore"));
            ThreadSafeMockingProgress mockingProgress1 = ((ThreadSafeMockingProgress) createInstance("org.mockito.internal.progress.ThreadSafeMockingProgress"));
            setField(mockitoCore, "org.mockito.internal.MockitoCore", "mockingProgress", mockingProgress1);
            
            /* This test fails because method [org.mockito.internal.MockitoCore.getLastInvocation] produces [java.lang.IndexOutOfBoundsException: Greater or equal than length] */
            mockitoCore.getLastInvocation();
        } finally {
            setStaticField(ThreadSafeMockingProgress.class, "mockingProgress", prevMockingProgress);
        }
    }
    
    /**
    @utbot.classUnderTest {@link MockitoCore}
 * @utbot.methodUnderTest {@link org.mockito.internal.MockitoCore#getLastInvocation()}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} 
 *  */
    @Test
    public void testGetLastInvocation_ThrowIndexOutOfBoundsException_2() throws Exception  {
        Class threadSafeMockingProgressClazz = Class.forName("org.mockito.internal.progress.ThreadSafeMockingProgress");
        ThreadLocal prevMockingProgress = ((ThreadLocal) getStaticFieldValue(threadSafeMockingProgressClazz, "mockingProgress"));
        try {
            ThreadLocal mockingProgress = ((ThreadLocal) createInstance("java.lang.ThreadLocal"));
            setStaticField(threadSafeMockingProgressClazz, "mockingProgress", mockingProgress);
            MockitoCore mockitoCore = ((MockitoCore) createInstance("org.mockito.internal.MockitoCore"));
            ThreadSafeMockingProgress mockingProgress1 = ((ThreadSafeMockingProgress) createInstance("org.mockito.internal.progress.ThreadSafeMockingProgress"));
            setField(mockitoCore, "org.mockito.internal.MockitoCore", "mockingProgress", mockingProgress1);
            
            /* This test fails because method [org.mockito.internal.MockitoCore.getLastInvocation] produces [java.lang.IndexOutOfBoundsException: Greater or equal than length] */
            mockitoCore.getLastInvocation();
        } finally {
            setStaticField(ThreadSafeMockingProgress.class, "mockingProgress", prevMockingProgress);
        }
    }
    
    /**
    @utbot.classUnderTest {@link MockitoCore}
 * @utbot.methodUnderTest {@link org.mockito.internal.MockitoCore#getLastInvocation()}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} 
 *  */
    @Test
    public void testGetLastInvocation_ThrowIndexOutOfBoundsException_3() throws Exception  {
        Class threadSafeMockingProgressClazz = Class.forName("org.mockito.internal.progress.ThreadSafeMockingProgress");
        ThreadLocal prevMockingProgress = ((ThreadLocal) getStaticFieldValue(threadSafeMockingProgressClazz, "mockingProgress"));
        try {
            ThreadLocal mockingProgress = ((ThreadLocal) createInstance("java.lang.ThreadLocal"));
            setField(mockingProgress, "java.lang.ThreadLocal", "threadLocalHashCode", Integer.MIN_VALUE);
            setStaticField(threadSafeMockingProgressClazz, "mockingProgress", mockingProgress);
            MockitoCore mockitoCore = ((MockitoCore) createInstance("org.mockito.internal.MockitoCore"));
            ThreadSafeMockingProgress mockingProgress1 = ((ThreadSafeMockingProgress) createInstance("org.mockito.internal.progress.ThreadSafeMockingProgress"));
            setField(mockitoCore, "org.mockito.internal.MockitoCore", "mockingProgress", mockingProgress1);
            
            /* This test fails because method [org.mockito.internal.MockitoCore.getLastInvocation] produces [java.lang.IndexOutOfBoundsException: Less than zero] */
            mockitoCore.getLastInvocation();
        } finally {
            setStaticField(ThreadSafeMockingProgress.class, "mockingProgress", prevMockingProgress);
        }
    }
    
    /**
    @utbot.classUnderTest {@link MockitoCore}
 * @utbot.methodUnderTest {@link org.mockito.internal.MockitoCore#getLastInvocation()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: OngoingStubbingImpl ongoingStubbing = ((OngoingStubbingImpl) mockingProgress.pullOngoingStubbing());
 *  */
    @Test
    public void testGetLastInvocation_ThrowNullPointerException() throws Exception  {
        MockitoCore mockitoCore = ((MockitoCore) createInstance("org.mockito.internal.MockitoCore"));
        
        /* This test fails because method [org.mockito.internal.MockitoCore.getLastInvocation] produces [java.lang.NullPointerException] */
        mockitoCore.getLastInvocation();
    }
    
    /**
    @utbot.classUnderTest {@link MockitoCore}
 * @utbot.methodUnderTest {@link org.mockito.internal.MockitoCore#getLastInvocation()}
 * @utbot.invokes {@link org.mockito.internal.stubbing.OngoingStubbingImpl#getRegisteredInvocations()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: List<Invocation> allInvocations = ongoingStubbing.getRegisteredInvocations();
 *  */
    @Test
    public void testGetLastInvocation_ThrowNullPointerException_1() throws Exception  {
        MockitoCore mockitoCore = ((MockitoCore) createInstance("org.mockito.internal.MockitoCore"));
        MockingProgressImpl mockingProgress = ((MockingProgressImpl) createInstance("org.mockito.internal.progress.MockingProgressImpl"));
        setField(mockitoCore, "org.mockito.internal.MockitoCore", "mockingProgress", mockingProgress);
        
        /* This test fails because method [org.mockito.internal.MockitoCore.getLastInvocation] produces [java.lang.NullPointerException] */
        mockitoCore.getLastInvocation();
    }
    ///endregion
    
    ///region Errors report for getLastInvocation
    
    public void testGetLastInvocation_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 12 occurrences of:
        // Field reflectionFactory is not declared in class java.lang.reflect.AccessibleObject
        
        // 4 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.mockito.internal.MockitoCore.mock
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method mock(java.lang.Class, org.mockito.MockSettings)
    
    /**
    @utbot.classUnderTest {@link MockitoCore}
 * @utbot.methodUnderTest {@link org.mockito.internal.MockitoCore#mock(java.lang.Class,org.mockito.MockSettings)}
 * @utbot.invokes {@link org.mockito.internal.util.MockUtil#createMock(java.lang.Class,org.mockito.internal.creation.MockSettingsImpl)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: T mock = mockUtil.createMock(classToMock, (MockSettingsImpl) mockSettings);
 *  */
    @Test
    public void testMock_ThrowNullPointerException() throws Exception  {
        MockitoCore mockitoCore = ((MockitoCore) createInstance("org.mockito.internal.MockitoCore"));
        
        /* This test fails because method [org.mockito.internal.MockitoCore.mock] produces [java.lang.NullPointerException] */
        mockitoCore.mock(null, null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method mock(java.lang.Class, org.mockito.MockSettings)
    
    /**
    @utbot.classUnderTest {@link MockitoCore}
 * @utbot.methodUnderTest {@link org.mockito.internal.MockitoCore#mock(java.lang.Class,org.mockito.MockSettings)}
 * @utbot.invokes {@link org.mockito.internal.util.MockCreationValidator#validateExtraInterfaces(java.lang.Class,java.lang.Class[])}
 * @utbot.throwsException {@link org.mockito.exceptions.base.MockitoException} in: T mock = mockUtil.createMock(classToMock, (MockSettingsImpl) mockSettings);
 *  */
    @Test(expected = MockitoException.class)
    public void testMock_ThrowMockitoException() throws Exception  {
        ClassImposterizer prevINSTANCE = ClassImposterizer.INSTANCE;
        try {
            ClassImposterizer instance = ((ClassImposterizer) createInstance("org.mockito.internal.creation.jmock.ClassImposterizer"));
            ObjenesisStd objenesis = ((ObjenesisStd) createInstance("org.objenesis.ObjenesisStd"));
            StdInstantiatorStrategy strategy = ((StdInstantiatorStrategy) createInstance("org.objenesis.strategy.StdInstantiatorStrategy"));
            setField(objenesis, "org.objenesis.ObjenesisBase", "strategy", strategy);
            HashMap cache = new HashMap();
            setField(objenesis, "org.objenesis.ObjenesisBase", "cache", cache);
            setField(instance, "org.mockito.internal.creation.jmock.ClassImposterizer", "objenesis", objenesis);
            Class classImposterizerClazz = Class.forName("org.mockito.internal.creation.jmock.ClassImposterizer");
            setStaticField(classImposterizerClazz, "INSTANCE", instance);
            MockitoCore mockitoCore = ((MockitoCore) createInstance("org.mockito.internal.MockitoCore"));
            MockUtil mockUtil = ((MockUtil) createInstance("org.mockito.internal.util.MockUtil"));
            MockCreationValidator creationValidator = ((MockCreationValidator) createInstance("org.mockito.internal.util.MockCreationValidator"));
            setField(mockUtil, "org.mockito.internal.util.MockUtil", "creationValidator", creationValidator);
            setField(mockitoCore, "org.mockito.internal.MockitoCore", "mockUtil", mockUtil);
            Class class1 = Object.class;
            MockSettingsImpl mockSettingsImpl = ((MockSettingsImpl) createInstance("org.mockito.internal.creation.MockSettingsImpl"));
            java.lang.Class[] extraInterfaces = new java.lang.Class[1];
            extraInterfaces[0] = class1;
            setField(mockSettingsImpl, "org.mockito.internal.creation.MockSettingsImpl", "extraInterfaces", extraInterfaces);
            
            mockitoCore.mock(class1, mockSettingsImpl);
        } finally {
            setStaticField(ClassImposterizer.class, "INSTANCE", prevINSTANCE);
        }
    }
    
    /**
    @utbot.classUnderTest {@link MockitoCore}
 * @utbot.methodUnderTest {@link org.mockito.internal.MockitoCore#mock(java.lang.Class,org.mockito.MockSettings)}
 * @utbot.throwsException {@link org.mockito.exceptions.base.MockitoException} in: T mock = mockUtil.createMock(classToMock, (MockSettingsImpl) mockSettings);
 *  */
    @Test(expected = MockitoException.class)
    public void testMock_ThrowMockitoException_1() throws Exception  {
        ClassImposterizer prevINSTANCE = ClassImposterizer.INSTANCE;
        try {
            ClassImposterizer instance = ((ClassImposterizer) createInstance("org.mockito.internal.creation.jmock.ClassImposterizer"));
            ObjenesisStd objenesis = ((ObjenesisStd) createInstance("org.objenesis.ObjenesisStd"));
            StdInstantiatorStrategy strategy = ((StdInstantiatorStrategy) createInstance("org.objenesis.strategy.StdInstantiatorStrategy"));
            setField(objenesis, "org.objenesis.ObjenesisBase", "strategy", strategy);
            HashMap cache = new HashMap();
            setField(objenesis, "org.objenesis.ObjenesisBase", "cache", cache);
            setField(instance, "org.mockito.internal.creation.jmock.ClassImposterizer", "objenesis", objenesis);
            Class classImposterizerClazz = Class.forName("org.mockito.internal.creation.jmock.ClassImposterizer");
            setStaticField(classImposterizerClazz, "INSTANCE", instance);
            MockitoCore mockitoCore = ((MockitoCore) createInstance("org.mockito.internal.MockitoCore"));
            MockUtil mockUtil = ((MockUtil) createInstance("org.mockito.internal.util.MockUtil"));
            MockCreationValidator creationValidator = ((MockCreationValidator) createInstance("org.mockito.internal.util.MockCreationValidator"));
            setField(mockUtil, "org.mockito.internal.util.MockUtil", "creationValidator", creationValidator);
            setField(mockitoCore, "org.mockito.internal.MockitoCore", "mockUtil", mockUtil);
            Class class1 = Object.class;
            
            mockitoCore.mock(class1, null);
        } finally {
            setStaticField(ClassImposterizer.class, "INSTANCE", prevINSTANCE);
        }
    }
    
    /**
    @utbot.classUnderTest {@link MockitoCore}
 * @utbot.methodUnderTest {@link org.mockito.internal.MockitoCore#mock(java.lang.Class,org.mockito.MockSettings)}
 * @utbot.throwsException {@link org.mockito.exceptions.base.MockitoException} in: T mock = mockUtil.createMock(classToMock, (MockSettingsImpl) mockSettings);
 *  */
    @Test(expected = MockitoException.class)
    public void testMock_ThrowMockitoException_2() throws Exception  {
        ClassImposterizer prevINSTANCE = ClassImposterizer.INSTANCE;
        try {
            ClassImposterizer instance = ((ClassImposterizer) createInstance("org.mockito.internal.creation.jmock.ClassImposterizer"));
            ObjenesisStd objenesis = ((ObjenesisStd) createInstance("org.objenesis.ObjenesisStd"));
            StdInstantiatorStrategy strategy = ((StdInstantiatorStrategy) createInstance("org.objenesis.strategy.StdInstantiatorStrategy"));
            setField(objenesis, "org.objenesis.ObjenesisBase", "strategy", strategy);
            HashMap cache = new HashMap();
            setField(objenesis, "org.objenesis.ObjenesisBase", "cache", cache);
            setField(instance, "org.mockito.internal.creation.jmock.ClassImposterizer", "objenesis", objenesis);
            Class classImposterizerClazz = Class.forName("org.mockito.internal.creation.jmock.ClassImposterizer");
            setStaticField(classImposterizerClazz, "INSTANCE", instance);
            MockitoCore mockitoCore = ((MockitoCore) createInstance("org.mockito.internal.MockitoCore"));
            MockUtil mockUtil = ((MockUtil) createInstance("org.mockito.internal.util.MockUtil"));
            MockCreationValidator creationValidator = ((MockCreationValidator) createInstance("org.mockito.internal.util.MockCreationValidator"));
            setField(mockUtil, "org.mockito.internal.util.MockUtil", "creationValidator", creationValidator);
            setField(mockitoCore, "org.mockito.internal.MockitoCore", "mockUtil", mockUtil);
            Class class1 = Object.class;
            
            mockitoCore.mock(class1, null);
        } finally {
            setStaticField(ClassImposterizer.class, "INSTANCE", prevINSTANCE);
        }
    }
    
    /**
    @utbot.classUnderTest {@link MockitoCore}
 * @utbot.methodUnderTest {@link org.mockito.internal.MockitoCore#mock(java.lang.Class,org.mockito.MockSettings)}
 * @utbot.throwsException {@link org.mockito.exceptions.base.MockitoException} in: T mock = mockUtil.createMock(classToMock, (MockSettingsImpl) mockSettings);
 *  */
    @Test(expected = MockitoException.class)
    public void testMock_ThrowMockitoException_3() throws Exception  {
        ClassImposterizer prevINSTANCE = ClassImposterizer.INSTANCE;
        try {
            ClassImposterizer instance = ((ClassImposterizer) createInstance("org.mockito.internal.creation.jmock.ClassImposterizer"));
            ObjenesisStd objenesis = ((ObjenesisStd) createInstance("org.objenesis.ObjenesisStd"));
            StdInstantiatorStrategy strategy = ((StdInstantiatorStrategy) createInstance("org.objenesis.strategy.StdInstantiatorStrategy"));
            setField(objenesis, "org.objenesis.ObjenesisBase", "strategy", strategy);
            HashMap cache = new HashMap();
            setField(objenesis, "org.objenesis.ObjenesisBase", "cache", cache);
            setField(instance, "org.mockito.internal.creation.jmock.ClassImposterizer", "objenesis", objenesis);
            Class classImposterizerClazz = Class.forName("org.mockito.internal.creation.jmock.ClassImposterizer");
            setStaticField(classImposterizerClazz, "INSTANCE", instance);
            MockitoCore mockitoCore = ((MockitoCore) createInstance("org.mockito.internal.MockitoCore"));
            MockUtil mockUtil = ((MockUtil) createInstance("org.mockito.internal.util.MockUtil"));
            MockCreationValidator creationValidator = ((MockCreationValidator) createInstance("org.mockito.internal.util.MockCreationValidator"));
            setField(mockUtil, "org.mockito.internal.util.MockUtil", "creationValidator", creationValidator);
            setField(mockitoCore, "org.mockito.internal.MockitoCore", "mockUtil", mockUtil);
            Class class1 = Object.class;
            MockSettingsImpl mockSettingsImpl = ((MockSettingsImpl) createInstance("org.mockito.internal.creation.MockSettingsImpl"));
            java.lang.Class[] extraInterfaces = {null, null};
            setField(mockSettingsImpl, "org.mockito.internal.creation.MockSettingsImpl", "extraInterfaces", extraInterfaces);
            byte[] spiedInstance = {};
            setField(mockSettingsImpl, "org.mockito.internal.creation.MockSettingsImpl", "spiedInstance", spiedInstance);
            
            mockitoCore.mock(class1, mockSettingsImpl);
        } finally {
            setStaticField(ClassImposterizer.class, "INSTANCE", prevINSTANCE);
        }
    }
    
    /**
    @utbot.classUnderTest {@link MockitoCore}
 * @utbot.methodUnderTest {@link org.mockito.internal.MockitoCore#mock(java.lang.Class,org.mockito.MockSettings)}
 * @utbot.throwsException {@link org.mockito.exceptions.base.MockitoException} in: T mock = mockUtil.createMock(classToMock, (MockSettingsImpl) mockSettings);
 *  */
    @Test(expected = MockitoException.class)
    public void testMock_ThrowMockitoException_4() throws Exception  {
        ClassImposterizer prevINSTANCE = ClassImposterizer.INSTANCE;
        try {
            ClassImposterizer instance = ((ClassImposterizer) createInstance("org.mockito.internal.creation.jmock.ClassImposterizer"));
            ObjenesisStd objenesis = ((ObjenesisStd) createInstance("org.objenesis.ObjenesisStd"));
            StdInstantiatorStrategy strategy = ((StdInstantiatorStrategy) createInstance("org.objenesis.strategy.StdInstantiatorStrategy"));
            setField(objenesis, "org.objenesis.ObjenesisBase", "strategy", strategy);
            HashMap cache = new HashMap();
            setField(objenesis, "org.objenesis.ObjenesisBase", "cache", cache);
            setField(instance, "org.mockito.internal.creation.jmock.ClassImposterizer", "objenesis", objenesis);
            Class classImposterizerClazz = Class.forName("org.mockito.internal.creation.jmock.ClassImposterizer");
            setStaticField(classImposterizerClazz, "INSTANCE", instance);
            MockitoCore mockitoCore = ((MockitoCore) createInstance("org.mockito.internal.MockitoCore"));
            MockUtil mockUtil = ((MockUtil) createInstance("org.mockito.internal.util.MockUtil"));
            MockCreationValidator creationValidator = ((MockCreationValidator) createInstance("org.mockito.internal.util.MockCreationValidator"));
            setField(mockUtil, "org.mockito.internal.util.MockUtil", "creationValidator", creationValidator);
            setField(mockitoCore, "org.mockito.internal.MockitoCore", "mockUtil", mockUtil);
            Class class1 = Object.class;
            MockSettingsImpl mockSettingsImpl = ((MockSettingsImpl) createInstance("org.mockito.internal.creation.MockSettingsImpl"));
            short[] spiedInstance = {};
            setField(mockSettingsImpl, "org.mockito.internal.creation.MockSettingsImpl", "spiedInstance", spiedInstance);
            
            mockitoCore.mock(class1, mockSettingsImpl);
        } finally {
            setStaticField(ClassImposterizer.class, "INSTANCE", prevINSTANCE);
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Util methods
    
    private static Object getStaticFieldValue(Class<?> clazz, String fieldName) throws IllegalAccessException, NoSuchFieldException {
        java.lang.reflect.Field field;
        Class<?> originClass = clazz;
        do {
            try {
                field = clazz.getDeclaredField(fieldName);
                field.setAccessible(true);
                
                java.lang.reflect.Field modifiersField;
                
            java.lang.reflect.Method methodForGetDeclaredFields1110816611584900 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields1110816611584900.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass1110816611592599 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1110816611584900.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1110816611592599).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
                modifiersField.setAccessible(true);
                modifiersField.setInt(field, field.getModifiers() & ~java.lang.reflect.Modifier.FINAL);
                
                return field.get(null);
            } catch (NoSuchFieldException e) {
                clazz = clazz.getSuperclass();
            } catch (NoSuchMethodException e2) {
                e2.printStackTrace();
            } catch (java.lang.reflect.InvocationTargetException e3) {
                e3.printStackTrace();
            }
        } while (clazz != null);
    
        throw new NoSuchFieldException("Field '" + fieldName + "' not found on class " + originClass);
    }
    
    private static Object createInstance(String className) throws Exception {
        Class<?> clazz = Class.forName(className);
        return Class.forName("sun.misc.Unsafe").getDeclaredMethod("allocateInstance", Class.class)
            .invoke(getUnsafeInstance(), clazz);
    }
    
    private static void setStaticField(Class<?> clazz, String fieldName, Object fieldValue) throws NoSuchFieldException, IllegalAccessException {
        java.lang.reflect.Field field;
    
        try {
        do {
            try {
                field = clazz.getDeclaredField(fieldName);
            } catch (Exception e) {
                clazz = clazz.getSuperclass();
                field = null;
            }
        } while (field == null);
        
        java.lang.reflect.Field modifiersField;
        
            java.lang.reflect.Method methodForGetDeclaredFields1110816614215500 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields1110816614215500.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass1110816614217600 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1110816614215500.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1110816614217600).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
        modifiersField.setAccessible(true);
        modifiersField.setInt(field, field.getModifiers() & ~java.lang.reflect.Modifier.FINAL);
    
        field.setAccessible(true);
        field.set(null, fieldValue);
        }
        catch(java.lang.reflect.InvocationTargetException e){
            e.printStackTrace();
        }
        catch(NoSuchMethodException e2) {
            e2.printStackTrace();
        }
    }
    
        private static void setField(Object object, String fieldClassName, String fieldName, Object fieldValue) throws ClassNotFoundException, NoSuchFieldException, NoSuchMethodException, IllegalAccessException, java.lang.reflect.InvocationTargetException {
        Class<?> clazz = Class.forName(fieldClassName);
        java.lang.reflect.Field field = clazz.getDeclaredField(fieldName);
    
        java.lang.reflect.Field modifiersField;
        
                java.lang.reflect.Method methodForGetDeclaredFields1110816614642800 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields1110816614642800.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass1110816614644200 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1110816614642800.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1110816614644200).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields1110816614907600 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields1110816614907600.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass1110816614909100 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1110816614907600.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1110816614909100).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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

