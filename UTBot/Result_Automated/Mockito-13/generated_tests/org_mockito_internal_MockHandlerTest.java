package org.mockito.internal;

import org.junit.Test;
import jdk.internal.misc.TerminatingThreadLocal;
import org.mockito.internal.stubbing.InvocationContainerImpl;
import java.util.ArrayList;
import org.mockito.internal.progress.ThreadSafeMockingProgress;
import org.mockito.internal.progress.MockingProgressImpl;
import org.mockito.internal.debugging.Localized;
import org.mockito.internal.invocation.MatchersBinder;
import org.mockito.internal.progress.ArgumentMatcherStorageImpl;
import java.util.Stack;
import org.mockito.internal.stubbing.InvocationContainer;
import org.mockito.internal.stubbing.VoidMethodStubbableImpl;
import org.mockito.internal.creation.MockSettingsImpl;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.lang.reflect.InvocationTargetException;

import static org.junit.Assert.assertNull;

public final class org_mockito_internal_MockHandlerTest {
    ///region Test suites for executable org.mockito.internal.MockHandler.handle
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method handle(org.mockito.internal.invocation.Invocation)
    
    /**
    @utbot.classUnderTest {@link MockHandler}
 * @utbot.methodUnderTest {@link org.mockito.internal.MockHandler#handle(org.mockito.internal.invocation.Invocation)}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} 
 *  */
    @Test
    public void testHandle_ThrowIndexOutOfBoundsException() throws Throwable  {
        Class threadSafeMockingProgressClazz = Class.forName("org.mockito.internal.progress.ThreadSafeMockingProgress");
        ThreadLocal prevMockingProgress = ((ThreadLocal) getStaticFieldValue(threadSafeMockingProgressClazz, "mockingProgress"));
        try {
            TerminatingThreadLocal mockingProgress = ((TerminatingThreadLocal) createInstance("jdk.internal.misc.TerminatingThreadLocal"));
            setField(mockingProgress, "java.lang.ThreadLocal", "threadLocalHashCode", Integer.MIN_VALUE);
            setStaticField(threadSafeMockingProgressClazz, "mockingProgress", mockingProgress);
            MockHandler mockHandler = ((MockHandler) createInstance("org.mockito.internal.MockHandler"));
            InvocationContainerImpl invocationContainerImpl = ((InvocationContainerImpl) createInstance("org.mockito.internal.stubbing.InvocationContainerImpl"));
            ArrayList answersForStubbing = new ArrayList();
            invocationContainerImpl.setAnswersForStubbing(answersForStubbing);
            mockHandler.invocationContainerImpl = invocationContainerImpl;
            ThreadSafeMockingProgress mockingProgress1 = ((ThreadSafeMockingProgress) createInstance("org.mockito.internal.progress.ThreadSafeMockingProgress"));
            setField(mockHandler, "org.mockito.internal.MockHandler", "mockingProgress", mockingProgress1);
            
            /* This test fails because method [org.mockito.internal.MockHandler.handle] produces [java.lang.IndexOutOfBoundsException: Less than zero] */
            mockHandler.handle(null);
        } finally {
            setStaticField(ThreadSafeMockingProgress.class, "mockingProgress", prevMockingProgress);
        }
    }
    
    /**
    @utbot.classUnderTest {@link MockHandler}
 * @utbot.methodUnderTest {@link org.mockito.internal.MockHandler#handle(org.mockito.internal.invocation.Invocation)}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} 
 *  */
    @Test
    public void testHandle_ThrowIndexOutOfBoundsException_1() throws Throwable  {
        Class threadSafeMockingProgressClazz = Class.forName("org.mockito.internal.progress.ThreadSafeMockingProgress");
        ThreadLocal prevMockingProgress = ((ThreadLocal) getStaticFieldValue(threadSafeMockingProgressClazz, "mockingProgress"));
        try {
            TerminatingThreadLocal mockingProgress = ((TerminatingThreadLocal) createInstance("jdk.internal.misc.TerminatingThreadLocal"));
            setStaticField(threadSafeMockingProgressClazz, "mockingProgress", mockingProgress);
            MockHandler mockHandler = ((MockHandler) createInstance("org.mockito.internal.MockHandler"));
            InvocationContainerImpl invocationContainerImpl = ((InvocationContainerImpl) createInstance("org.mockito.internal.stubbing.InvocationContainerImpl"));
            ArrayList answersForStubbing = new ArrayList();
            invocationContainerImpl.setAnswersForStubbing(answersForStubbing);
            mockHandler.invocationContainerImpl = invocationContainerImpl;
            ThreadSafeMockingProgress mockingProgress1 = ((ThreadSafeMockingProgress) createInstance("org.mockito.internal.progress.ThreadSafeMockingProgress"));
            setField(mockHandler, "org.mockito.internal.MockHandler", "mockingProgress", mockingProgress1);
            
            /* This test fails because method [org.mockito.internal.MockHandler.handle] produces [java.lang.IndexOutOfBoundsException: Greater or equal than length] */
            mockHandler.handle(null);
        } finally {
            setStaticField(ThreadSafeMockingProgress.class, "mockingProgress", prevMockingProgress);
        }
    }
    
    /**
    @utbot.classUnderTest {@link MockHandler}
 * @utbot.methodUnderTest {@link org.mockito.internal.MockHandler#handle(org.mockito.internal.invocation.Invocation)}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} 
 *  */
    @Test
    public void testHandle_ThrowIndexOutOfBoundsException_2() throws Throwable  {
        Class threadSafeMockingProgressClazz = Class.forName("org.mockito.internal.progress.ThreadSafeMockingProgress");
        ThreadLocal prevMockingProgress = ((ThreadLocal) getStaticFieldValue(threadSafeMockingProgressClazz, "mockingProgress"));
        try {
            ThreadLocal mockingProgress = ((ThreadLocal) createInstance("java.lang.ThreadLocal"));
            setStaticField(threadSafeMockingProgressClazz, "mockingProgress", mockingProgress);
            MockHandler mockHandler = ((MockHandler) createInstance("org.mockito.internal.MockHandler"));
            InvocationContainerImpl invocationContainerImpl = ((InvocationContainerImpl) createInstance("org.mockito.internal.stubbing.InvocationContainerImpl"));
            ArrayList answersForStubbing = new ArrayList();
            invocationContainerImpl.setAnswersForStubbing(answersForStubbing);
            mockHandler.invocationContainerImpl = invocationContainerImpl;
            ThreadSafeMockingProgress mockingProgress1 = ((ThreadSafeMockingProgress) createInstance("org.mockito.internal.progress.ThreadSafeMockingProgress"));
            setField(mockHandler, "org.mockito.internal.MockHandler", "mockingProgress", mockingProgress1);
            
            /* This test fails because method [org.mockito.internal.MockHandler.handle] produces [java.lang.IndexOutOfBoundsException: Greater or equal than length] */
            mockHandler.handle(null);
        } finally {
            setStaticField(ThreadSafeMockingProgress.class, "mockingProgress", prevMockingProgress);
        }
    }
    
    /**
    @utbot.classUnderTest {@link MockHandler}
 * @utbot.methodUnderTest {@link org.mockito.internal.MockHandler#handle(org.mockito.internal.invocation.Invocation)}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} 
 *  */
    @Test
    public void testHandle_ThrowIndexOutOfBoundsException_3() throws Throwable  {
        Class threadSafeMockingProgressClazz = Class.forName("org.mockito.internal.progress.ThreadSafeMockingProgress");
        ThreadLocal prevMockingProgress = ((ThreadLocal) getStaticFieldValue(threadSafeMockingProgressClazz, "mockingProgress"));
        try {
            ThreadLocal mockingProgress = ((ThreadLocal) createInstance("java.lang.ThreadLocal"));
            setField(mockingProgress, "java.lang.ThreadLocal", "threadLocalHashCode", Integer.MIN_VALUE);
            setStaticField(threadSafeMockingProgressClazz, "mockingProgress", mockingProgress);
            MockHandler mockHandler = ((MockHandler) createInstance("org.mockito.internal.MockHandler"));
            InvocationContainerImpl invocationContainerImpl = ((InvocationContainerImpl) createInstance("org.mockito.internal.stubbing.InvocationContainerImpl"));
            ArrayList answersForStubbing = new ArrayList();
            invocationContainerImpl.setAnswersForStubbing(answersForStubbing);
            mockHandler.invocationContainerImpl = invocationContainerImpl;
            ThreadSafeMockingProgress mockingProgress1 = ((ThreadSafeMockingProgress) createInstance("org.mockito.internal.progress.ThreadSafeMockingProgress"));
            setField(mockHandler, "org.mockito.internal.MockHandler", "mockingProgress", mockingProgress1);
            
            /* This test fails because method [org.mockito.internal.MockHandler.handle] produces [java.lang.IndexOutOfBoundsException: Less than zero] */
            mockHandler.handle(null);
        } finally {
            setStaticField(ThreadSafeMockingProgress.class, "mockingProgress", prevMockingProgress);
        }
    }
    
    /**
    @utbot.classUnderTest {@link MockHandler}
 * @utbot.methodUnderTest {@link org.mockito.internal.MockHandler#handle(org.mockito.internal.invocation.Invocation)}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} 
 *  */
    @Test
    public void testHandle_ThrowIndexOutOfBoundsException_4() throws Throwable  {
        Class threadSafeMockingProgressClazz = Class.forName("org.mockito.internal.progress.ThreadSafeMockingProgress");
        ThreadLocal prevMockingProgress = ((ThreadLocal) getStaticFieldValue(threadSafeMockingProgressClazz, "mockingProgress"));
        try {
            ThreadLocal mockingProgress = ((ThreadLocal) createInstance("java.lang.ThreadLocal"));
            setField(mockingProgress, "java.lang.ThreadLocal", "threadLocalHashCode", Integer.MIN_VALUE);
            setStaticField(threadSafeMockingProgressClazz, "mockingProgress", mockingProgress);
            MockHandler mockHandler = ((MockHandler) createInstance("org.mockito.internal.MockHandler"));
            InvocationContainerImpl invocationContainerImpl = ((InvocationContainerImpl) createInstance("org.mockito.internal.stubbing.InvocationContainerImpl"));
            ArrayList answersForStubbing = new ArrayList();
            invocationContainerImpl.setAnswersForStubbing(answersForStubbing);
            mockHandler.invocationContainerImpl = invocationContainerImpl;
            ThreadSafeMockingProgress mockingProgress1 = ((ThreadSafeMockingProgress) createInstance("org.mockito.internal.progress.ThreadSafeMockingProgress"));
            setField(mockHandler, "org.mockito.internal.MockHandler", "mockingProgress", mockingProgress1);
            
            /* This test fails because method [org.mockito.internal.MockHandler.handle] produces [java.lang.IndexOutOfBoundsException: Less than zero] */
            mockHandler.handle(null);
        } finally {
            setStaticField(ThreadSafeMockingProgress.class, "mockingProgress", prevMockingProgress);
        }
    }
    
    /**
    @utbot.classUnderTest {@link MockHandler}
 * @utbot.methodUnderTest {@link org.mockito.internal.MockHandler#handle(org.mockito.internal.invocation.Invocation)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: VerificationMode verificationMode = mockingProgress.pullVerificationMode();
 *  */
    @Test
    public void testHandle_ThrowClassCastException() throws Throwable  {
        MockHandler mockHandler = ((MockHandler) createInstance("org.mockito.internal.MockHandler"));
        InvocationContainerImpl invocationContainerImpl = ((InvocationContainerImpl) createInstance("org.mockito.internal.stubbing.InvocationContainerImpl"));
        ArrayList answersForStubbing = new ArrayList();
        invocationContainerImpl.setAnswersForStubbing(answersForStubbing);
        mockHandler.invocationContainerImpl = invocationContainerImpl;
        MockingProgressImpl mockingProgress = ((MockingProgressImpl) createInstance("org.mockito.internal.progress.MockingProgressImpl"));
        Localized verificationMode = ((Localized) createInstance("org.mockito.internal.debugging.Localized"));
        byte[] object = {};
        setField(verificationMode, "org.mockito.internal.debugging.Localized", "object", object);
        setField(mockingProgress, "org.mockito.internal.progress.MockingProgressImpl", "verificationMode", verificationMode);
        setField(mockHandler, "org.mockito.internal.MockHandler", "mockingProgress", mockingProgress);
        
        /* This test fails because method [org.mockito.internal.MockHandler.handle] produces [java.lang.ClassCastException: The object with type java.lang.Object can not be casted to org.mockito.verification.VerificationMode] */
        mockHandler.handle(null);
    }
    
    /**
    @utbot.classUnderTest {@link MockHandler}
 * @utbot.methodUnderTest {@link org.mockito.internal.MockHandler#handle(org.mockito.internal.invocation.Invocation)}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} 
 *  */
    @Test
    public void testHandle_ThrowIndexOutOfBoundsException_5() throws Throwable  {
        MockHandler mockHandler = ((MockHandler) createInstance("org.mockito.internal.MockHandler"));
        InvocationContainerImpl invocationContainerImpl = ((InvocationContainerImpl) createInstance("org.mockito.internal.stubbing.InvocationContainerImpl"));
        ArrayList answersForStubbing = new ArrayList();
        invocationContainerImpl.setAnswersForStubbing(answersForStubbing);
        mockHandler.invocationContainerImpl = invocationContainerImpl;
        MatchersBinder matchersBinder = ((MatchersBinder) createInstance("org.mockito.internal.invocation.MatchersBinder"));
        mockHandler.matchersBinder = matchersBinder;
        MockingProgressImpl mockingProgress = ((MockingProgressImpl) createInstance("org.mockito.internal.progress.MockingProgressImpl"));
        ArgumentMatcherStorageImpl argumentMatcherStorage = ((ArgumentMatcherStorageImpl) createInstance("org.mockito.internal.progress.ArgumentMatcherStorageImpl"));
        Stack matcherStack = ((Stack) createInstance("java.util.Stack"));
        java.lang.Object[] elementData = {};
        setField(matcherStack, "java.util.Vector", "elementData", elementData);
        setField(matcherStack, "java.util.Vector", "elementCount", 1);
        setField(argumentMatcherStorage, "org.mockito.internal.progress.ArgumentMatcherStorageImpl", "matcherStack", matcherStack);
        setField(mockingProgress, "org.mockito.internal.progress.MockingProgressImpl", "argumentMatcherStorage", argumentMatcherStorage);
        setField(mockHandler, "org.mockito.internal.MockHandler", "mockingProgress", mockingProgress);
        
        /* This test fails because method [org.mockito.internal.MockHandler.handle] produces [java.lang.IndexOutOfBoundsException: Greater or equal than length] */
        mockHandler.handle(null);
    }
    
    /**
    @utbot.classUnderTest {@link MockHandler}
 * @utbot.methodUnderTest {@link org.mockito.internal.MockHandler#handle(org.mockito.internal.invocation.Invocation)}
 * @utbot.throwsException {@link java.lang.NegativeArraySizeException} 
 *  */
    @Test
    public void testHandle_ThrowNegativeArraySizeException() throws Throwable  {
        MockHandler mockHandler = ((MockHandler) createInstance("org.mockito.internal.MockHandler"));
        InvocationContainerImpl invocationContainerImpl = ((InvocationContainerImpl) createInstance("org.mockito.internal.stubbing.InvocationContainerImpl"));
        ArrayList answersForStubbing = new ArrayList();
        invocationContainerImpl.setAnswersForStubbing(answersForStubbing);
        mockHandler.invocationContainerImpl = invocationContainerImpl;
        MatchersBinder matchersBinder = ((MatchersBinder) createInstance("org.mockito.internal.invocation.MatchersBinder"));
        mockHandler.matchersBinder = matchersBinder;
        MockingProgressImpl mockingProgress = ((MockingProgressImpl) createInstance("org.mockito.internal.progress.MockingProgressImpl"));
        ArgumentMatcherStorageImpl argumentMatcherStorage = ((ArgumentMatcherStorageImpl) createInstance("org.mockito.internal.progress.ArgumentMatcherStorageImpl"));
        Stack matcherStack = ((Stack) createInstance("java.util.Stack"));
        java.lang.Object[] elementData = {null};
        setField(matcherStack, "java.util.Vector", "elementData", elementData);
        setField(matcherStack, "java.util.Vector", "elementCount", Integer.MIN_VALUE);
        setField(argumentMatcherStorage, "org.mockito.internal.progress.ArgumentMatcherStorageImpl", "matcherStack", matcherStack);
        setField(mockingProgress, "org.mockito.internal.progress.MockingProgressImpl", "argumentMatcherStorage", argumentMatcherStorage);
        setField(mockHandler, "org.mockito.internal.MockHandler", "mockingProgress", mockingProgress);
        
        /* This test fails because method [org.mockito.internal.MockHandler.handle] produces [java.lang.NegativeArraySizeException: Length is less than zero] */
        mockHandler.handle(null);
    }
    
    /**
    @utbot.classUnderTest {@link MockHandler}
 * @utbot.methodUnderTest {@link org.mockito.internal.MockHandler#handle(org.mockito.internal.invocation.Invocation)}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} 
 *  */
    @Test
    public void testHandle_ThrowIndexOutOfBoundsException_6() throws Throwable  {
        Class threadSafeMockingProgressClazz = Class.forName("org.mockito.internal.progress.ThreadSafeMockingProgress");
        ThreadLocal prevMockingProgress = ((ThreadLocal) getStaticFieldValue(threadSafeMockingProgressClazz, "mockingProgress"));
        try {
            TerminatingThreadLocal mockingProgress = ((TerminatingThreadLocal) createInstance("jdk.internal.misc.TerminatingThreadLocal"));
            setStaticField(threadSafeMockingProgressClazz, "mockingProgress", mockingProgress);
            MockHandler mockHandler = ((MockHandler) createInstance("org.mockito.internal.MockHandler"));
            InvocationContainerImpl invocationContainerImpl = ((InvocationContainerImpl) createInstance("org.mockito.internal.stubbing.InvocationContainerImpl"));
            ArrayList answersForStubbing = new ArrayList();
            answersForStubbing.add(null);
            answersForStubbing.add(null);
            answersForStubbing.add(null);
            answersForStubbing.add(null);
            answersForStubbing.add(null);
            answersForStubbing.add(null);
            answersForStubbing.add(null);
            answersForStubbing.add(null);
            answersForStubbing.add(null);
            answersForStubbing.add(null);
            invocationContainerImpl.setAnswersForStubbing(answersForStubbing);
            mockHandler.invocationContainerImpl = invocationContainerImpl;
            ThreadSafeMockingProgress mockingProgress1 = ((ThreadSafeMockingProgress) createInstance("org.mockito.internal.progress.ThreadSafeMockingProgress"));
            setField(mockHandler, "org.mockito.internal.MockHandler", "mockingProgress", mockingProgress1);
            
            /* This test fails because method [org.mockito.internal.MockHandler.handle] produces [java.lang.IndexOutOfBoundsException: Greater or equal than length] */
            mockHandler.handle(null);
        } finally {
            setStaticField(ThreadSafeMockingProgress.class, "mockingProgress", prevMockingProgress);
        }
    }
    
    /**
    @utbot.classUnderTest {@link MockHandler}
 * @utbot.methodUnderTest {@link org.mockito.internal.MockHandler#handle(org.mockito.internal.invocation.Invocation)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: invocationContainerImpl.hasAnswersForStubbing()
 *  */
    @Test
    public void testHandle_ThrowNullPointerException() throws Throwable  {
        MockHandler mockHandler = ((MockHandler) createInstance("org.mockito.internal.MockHandler"));
        
        /* This test fails because method [org.mockito.internal.MockHandler.handle] produces [java.lang.NullPointerException]
            org.mockito.internal.MockHandler.handle(MockHandler.java:59) */
        mockHandler.handle(null);
    }
    
    /**
    @utbot.classUnderTest {@link MockHandler}
 * @utbot.methodUnderTest {@link org.mockito.internal.MockHandler#handle(org.mockito.internal.invocation.Invocation)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: VerificationMode verificationMode = mockingProgress.pullVerificationMode();
 *  */
    @Test
    public void testHandle_ThrowNullPointerException_1() throws Throwable  {
        MockHandler mockHandler = ((MockHandler) createInstance("org.mockito.internal.MockHandler"));
        InvocationContainerImpl invocationContainerImpl = ((InvocationContainerImpl) createInstance("org.mockito.internal.stubbing.InvocationContainerImpl"));
        ArrayList answersForStubbing = new ArrayList();
        invocationContainerImpl.setAnswersForStubbing(answersForStubbing);
        mockHandler.invocationContainerImpl = invocationContainerImpl;
        
        /* This test fails because method [org.mockito.internal.MockHandler.handle] produces [java.lang.NullPointerException] */
        mockHandler.handle(null);
    }
    
    /**
    @utbot.classUnderTest {@link MockHandler}
 * @utbot.methodUnderTest {@link org.mockito.internal.MockHandler#handle(org.mockito.internal.invocation.Invocation)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: InvocationMatcher invocationMatcher = matchersBinder.bindMatchers(mockingProgress.getArgumentMatcherStorage(), invocation);
 *  */
    @Test
    public void testHandle_ThrowNullPointerException_2() throws Throwable  {
        MockHandler mockHandler = ((MockHandler) createInstance("org.mockito.internal.MockHandler"));
        InvocationContainerImpl invocationContainerImpl = ((InvocationContainerImpl) createInstance("org.mockito.internal.stubbing.InvocationContainerImpl"));
        ArrayList answersForStubbing = new ArrayList();
        invocationContainerImpl.setAnswersForStubbing(answersForStubbing);
        mockHandler.invocationContainerImpl = invocationContainerImpl;
        MockingProgressImpl mockingProgress = ((MockingProgressImpl) createInstance("org.mockito.internal.progress.MockingProgressImpl"));
        ArgumentMatcherStorageImpl argumentMatcherStorage = ((ArgumentMatcherStorageImpl) createInstance("org.mockito.internal.progress.ArgumentMatcherStorageImpl"));
        setField(mockingProgress, "org.mockito.internal.progress.MockingProgressImpl", "argumentMatcherStorage", argumentMatcherStorage);
        setField(mockHandler, "org.mockito.internal.MockHandler", "mockingProgress", mockingProgress);
        
        /* This test fails because method [org.mockito.internal.MockHandler.handle] produces [java.lang.NullPointerException] */
        mockHandler.handle(null);
    }
    
    /**
    @utbot.classUnderTest {@link MockHandler}
 * @utbot.methodUnderTest {@link org.mockito.internal.MockHandler#handle(org.mockito.internal.invocation.Invocation)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: InvocationMatcher invocationMatcher = matchersBinder.bindMatchers(mockingProgress.getArgumentMatcherStorage(), invocation);
 *  */
    @Test
    public void testHandle_ThrowNullPointerException_3() throws Throwable  {
        MockHandler mockHandler = ((MockHandler) createInstance("org.mockito.internal.MockHandler"));
        InvocationContainerImpl invocationContainerImpl = ((InvocationContainerImpl) createInstance("org.mockito.internal.stubbing.InvocationContainerImpl"));
        ArrayList answersForStubbing = new ArrayList();
        invocationContainerImpl.setAnswersForStubbing(answersForStubbing);
        mockHandler.invocationContainerImpl = invocationContainerImpl;
        MockingProgressImpl mockingProgress = ((MockingProgressImpl) createInstance("org.mockito.internal.progress.MockingProgressImpl"));
        ArgumentMatcherStorageImpl argumentMatcherStorage = ((ArgumentMatcherStorageImpl) createInstance("org.mockito.internal.progress.ArgumentMatcherStorageImpl"));
        setField(mockingProgress, "org.mockito.internal.progress.MockingProgressImpl", "argumentMatcherStorage", argumentMatcherStorage);
        Localized verificationMode = ((Localized) createInstance("org.mockito.internal.debugging.Localized"));
        setField(mockingProgress, "org.mockito.internal.progress.MockingProgressImpl", "verificationMode", verificationMode);
        setField(mockHandler, "org.mockito.internal.MockHandler", "mockingProgress", mockingProgress);
        
        /* This test fails because method [org.mockito.internal.MockHandler.handle] produces [java.lang.NullPointerException] */
        mockHandler.handle(null);
    }
    
    /**
    @utbot.classUnderTest {@link MockHandler}
 * @utbot.methodUnderTest {@link org.mockito.internal.MockHandler#handle(org.mockito.internal.invocation.Invocation)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: getArgumentMatcherStorage
 *  */
    @Test
    public void testHandle_ThrowNullPointerException_4() throws Throwable  {
        MockHandler mockHandler = ((MockHandler) createInstance("org.mockito.internal.MockHandler"));
        InvocationContainerImpl invocationContainerImpl = ((InvocationContainerImpl) createInstance("org.mockito.internal.stubbing.InvocationContainerImpl"));
        ArrayList answersForStubbing = new ArrayList();
        answersForStubbing.add(null);
        answersForStubbing.add(null);
        answersForStubbing.add(null);
        answersForStubbing.add(null);
        answersForStubbing.add(null);
        answersForStubbing.add(null);
        answersForStubbing.add(null);
        answersForStubbing.add(null);
        answersForStubbing.add(null);
        answersForStubbing.add(null);
        invocationContainerImpl.setAnswersForStubbing(answersForStubbing);
        mockHandler.invocationContainerImpl = invocationContainerImpl;
        MatchersBinder matchersBinder = ((MatchersBinder) createInstance("org.mockito.internal.invocation.MatchersBinder"));
        mockHandler.matchersBinder = matchersBinder;
        
        /* This test fails because method [org.mockito.internal.MockHandler.handle] produces [java.lang.NullPointerException] */
        mockHandler.handle(null);
    }
    
    /**
    @utbot.classUnderTest {@link MockHandler}
 * @utbot.methodUnderTest {@link org.mockito.internal.MockHandler#handle(org.mockito.internal.invocation.Invocation)}
 * @utbot.invokes {@link org.mockito.internal.invocation.MatchersBinder#bindMatchers(org.mockito.internal.progress.ArgumentMatcherStorage,org.mockito.internal.invocation.Invocation)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: InvocationMatcher invocationMatcher = matchersBinder.bindMatchers(mockingProgress.getArgumentMatcherStorage(), invocation);
 *  */
    @Test
    public void testHandle_ThrowNullPointerException_5() throws Throwable  {
        MockHandler mockHandler = ((MockHandler) createInstance("org.mockito.internal.MockHandler"));
        InvocationContainerImpl invocationContainerImpl = ((InvocationContainerImpl) createInstance("org.mockito.internal.stubbing.InvocationContainerImpl"));
        ArrayList answersForStubbing = new ArrayList();
        answersForStubbing.add(null);
        answersForStubbing.add(null);
        answersForStubbing.add(null);
        answersForStubbing.add(null);
        answersForStubbing.add(null);
        answersForStubbing.add(null);
        answersForStubbing.add(null);
        answersForStubbing.add(null);
        answersForStubbing.add(null);
        answersForStubbing.add(null);
        invocationContainerImpl.setAnswersForStubbing(answersForStubbing);
        mockHandler.invocationContainerImpl = invocationContainerImpl;
        MockingProgressImpl mockingProgress = ((MockingProgressImpl) createInstance("org.mockito.internal.progress.MockingProgressImpl"));
        ArgumentMatcherStorageImpl argumentMatcherStorage = ((ArgumentMatcherStorageImpl) createInstance("org.mockito.internal.progress.ArgumentMatcherStorageImpl"));
        setField(mockingProgress, "org.mockito.internal.progress.MockingProgressImpl", "argumentMatcherStorage", argumentMatcherStorage);
        setField(mockHandler, "org.mockito.internal.MockHandler", "mockingProgress", mockingProgress);
        
        /* This test fails because method [org.mockito.internal.MockHandler.handle] produces [java.lang.NullPointerException] */
        mockHandler.handle(null);
    }
    ///endregion
    
    ///region Errors report for handle
    
    public void testHandle_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 49 occurrences of:
        // Field reflectionFactory is not declared in class java.lang.reflect.AccessibleObject
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.mockito.internal.MockHandler.getInvocationContainer
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getInvocationContainer()
    
    /**
    @utbot.classUnderTest {@link MockHandler}
 * @utbot.methodUnderTest {@link org.mockito.internal.MockHandler#getInvocationContainer()}
 * @utbot.returnsFrom {@code return invocationContainerImpl;}
 *  */
    @Test
    public void testGetInvocationContainer_ReturnInvocationContainerImpl() throws Exception  {
        MockHandler mockHandler = ((MockHandler) createInstance("org.mockito.internal.MockHandler"));
        
        InvocationContainer actual = mockHandler.getInvocationContainer();
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.mockito.internal.MockHandler.voidMethodStubbable
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method voidMethodStubbable(java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link MockHandler}
 * @utbot.methodUnderTest {@link org.mockito.internal.MockHandler#voidMethodStubbable(java.lang.Object)}
 * @utbot.returnsFrom {@code return new VoidMethodStubbableImpl<T>(mock, invocationContainerImpl);}
 *  */
    @Test
    public void testVoidMethodStubbable_Return() throws Exception  {
        MockHandler mockHandler = ((MockHandler) createInstance("org.mockito.internal.MockHandler"));
        
        VoidMethodStubbableImpl actual = ((VoidMethodStubbableImpl) mockHandler.voidMethodStubbable(null));
        
        VoidMethodStubbableImpl expected = new VoidMethodStubbableImpl(null, null);
        
        Object actualMock = getFieldValue(actual, "org.mockito.internal.stubbing.VoidMethodStubbableImpl", "mock");
        assertNull(actualMock);
        
        InvocationContainerImpl actualInvocationContainerImpl = ((InvocationContainerImpl) getFieldValue(actual, "org.mockito.internal.stubbing.VoidMethodStubbableImpl", "invocationContainerImpl"));
        assertNull(actualInvocationContainerImpl);
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.mockito.internal.MockHandler.setAnswersForStubbing
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setAnswersForStubbing(java.util.List)
    
    /**
    @utbot.classUnderTest {@link MockHandler}
 * @utbot.methodUnderTest {@link org.mockito.internal.MockHandler#setAnswersForStubbing(java.util.List)}
 * @utbot.invokes {@link org.mockito.internal.stubbing.InvocationContainerImpl#setAnswersForStubbing(java.util.List)}
 *  */
    @Test
    public void testSetAnswersForStubbing_InvocationContainerImplSetAnswersForStubbing() throws Exception  {
        MockHandler mockHandler = ((MockHandler) createInstance("org.mockito.internal.MockHandler"));
        InvocationContainerImpl invocationContainerImpl = ((InvocationContainerImpl) createInstance("org.mockito.internal.stubbing.InvocationContainerImpl"));
        ArrayList answersForStubbing = new ArrayList();
        answersForStubbing.add(null);
        answersForStubbing.add(null);
        answersForStubbing.add(null);
        invocationContainerImpl.setAnswersForStubbing(answersForStubbing);
        mockHandler.invocationContainerImpl = invocationContainerImpl;
        
        mockHandler.setAnswersForStubbing(answersForStubbing);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method setAnswersForStubbing(java.util.List)
    
    /**
    @utbot.classUnderTest {@link MockHandler}
 * @utbot.methodUnderTest {@link org.mockito.internal.MockHandler#setAnswersForStubbing(java.util.List)}
 * @utbot.invokes {@link org.mockito.internal.stubbing.InvocationContainerImpl#setAnswersForStubbing(java.util.List)}
 * @utbot.throwsException {@link java.lang.NoSuchMethodError} in: invocationContainerImpl.setAnswersForStubbing(answers);
 *  */
    @Test(expected = NoSuchMethodError.class)
    public void testSetAnswersForStubbing_ThrowNoSuchMethodError() throws Exception  {
        MockHandler mockHandler = ((MockHandler) createInstance("org.mockito.internal.MockHandler"));
        
        mockHandler.setAnswersForStubbing(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.mockito.internal.MockHandler.getMockSettings
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getMockSettings()
    
    /**
    @utbot.classUnderTest {@link MockHandler}
 * @utbot.methodUnderTest {@link org.mockito.internal.MockHandler#getMockSettings()}
 * @utbot.returnsFrom {@code return mockSettings;}
 *  */
    @Test
    public void testGetMockSettings_ReturnMockSettings() throws Exception  {
        MockHandler mockHandler = ((MockHandler) createInstance("org.mockito.internal.MockHandler"));
        
        MockSettingsImpl actual = mockHandler.getMockSettings();
        
        assertNull(actual);
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
                
            java.lang.reflect.Method methodForGetDeclaredFields1110488490263999 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields1110488490263999.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass1110488490268800 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1110488490263999.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1110488490268800).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
    
        private static void setField(Object object, String fieldClassName, String fieldName, Object fieldValue) throws ClassNotFoundException, NoSuchFieldException, NoSuchMethodException, IllegalAccessException, java.lang.reflect.InvocationTargetException {
        Class<?> clazz = Class.forName(fieldClassName);
        java.lang.reflect.Field field = clazz.getDeclaredField(fieldName);
    
        java.lang.reflect.Field modifiersField;
        
                java.lang.reflect.Method methodForGetDeclaredFields1110488493772400 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields1110488493772400.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass1110488493774600 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1110488493772400.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1110488493774600).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
        modifiersField.setAccessible(true);
        modifiersField.setInt(field, field.getModifiers() & ~java.lang.reflect.Modifier.FINAL);
    
        field.setAccessible(true);
        field.set(object, fieldValue);
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
        
            java.lang.reflect.Method methodForGetDeclaredFields1110488494209300 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields1110488494209300.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass1110488494210599 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1110488494209300.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1110488494210599).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
    
    private static Object getFieldValue(Object obj, String fieldClassName, String fieldName) throws ClassNotFoundException, NoSuchMethodException, java.lang.reflect.InvocationTargetException, IllegalAccessException, NoSuchFieldException {
        Class<?> clazz = Class.forName(fieldClassName);
        java.lang.reflect.Field field = clazz.getDeclaredField(fieldName);
        
        field.setAccessible(true);
        
        java.lang.reflect.Field modifiersField;
        
            java.lang.reflect.Method methodForGetDeclaredFields1110488494597500 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields1110488494597500.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass1110488494598400 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1110488494597500.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1110488494598400).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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

