package org.mockito.internal.stubbing.defaultanswers;

import org.junit.Test;
import java.lang.reflect.Method;
import java.lang.reflect.InvocationTargetException;
import org.mockito.internal.stubbing.InvocationContainerImpl;
import org.mockito.internal.progress.ThreadSafeMockingProgress;
import org.mockito.internal.stubbing.StubbedInvocationMatcher;
import org.mockito.internal.invocation.InvocationImpl;
import org.mockito.internal.invocation.InvocationMatcher;
import org.mockito.internal.progress.MockingProgressImpl;
import org.mockito.internal.invocation.SerializableMethod;
import org.mockito.internal.MockitoCore;
import org.mockito.exceptions.Reporter;
import org.mockito.internal.util.MockUtil;
import org.mockito.internal.progress.MockingProgress;
import sun.reflect.generics.reflectiveObjects.TypeVariableImpl;
import org.mockito.exceptions.base.MockitoException;
import java.util.LinkedHashMap;
import java.lang.reflect.Constructor;
import org.mockito.internal.util.ObjectMethodsGuru;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

public final class org_mockito_internal_stubbing_defaultanswers_ReturnsDeepStubsTest {
    ///region Test suites for executable org.mockito.internal.stubbing.defaultanswers.ReturnsDeepStubs.returnsDeepStubsAnswerUsing
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method returnsDeepStubsAnswerUsing(org.mockito.internal.util.reflection.GenericMetadataSupport)
    
    /**
    @utbot.classUnderTest {@link ReturnsDeepStubs}
 * @utbot.methodUnderTest {@link org.mockito.internal.stubbing.defaultanswers.ReturnsDeepStubs#returnsDeepStubsAnswerUsing(org.mockito.internal.util.reflection.GenericMetadataSupport)}
 * @utbot.returnsFrom {@code return new ReturnsDeepStubsSerializationFallback(returnTypeGenericMetadata);}
 *  */
    @Test
    public void testReturnsDeepStubsAnswerUsing_Return() throws Exception  {
        ReturnsDeepStubs returnsDeepStubs = new ReturnsDeepStubs();
        
        Class returnsDeepStubsClazz = Class.forName("org.mockito.internal.stubbing.defaultanswers.ReturnsDeepStubs");
        Class genericMetadataSupportType = Class.forName("org.mockito.internal.util.reflection.GenericMetadataSupport");
        Method returnsDeepStubsAnswerUsingMethod = returnsDeepStubsClazz.getDeclaredMethod("returnsDeepStubsAnswerUsing", genericMetadataSupportType);
        returnsDeepStubsAnswerUsingMethod.setAccessible(true);
        java.lang.Object[] returnsDeepStubsAnswerUsingMethodArguments = new java.lang.Object[1];
        returnsDeepStubsAnswerUsingMethodArguments[0] = ((Object) null);
        Object actual = returnsDeepStubsAnswerUsingMethod.invoke(returnsDeepStubs, returnsDeepStubsAnswerUsingMethodArguments);
        
        Object expected = createInstance("org.mockito.internal.stubbing.defaultanswers.ReturnsDeepStubs$ReturnsDeepStubsSerializationFallback");
        
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method returnsDeepStubsAnswerUsing(org.mockito.internal.util.reflection.GenericMetadataSupport)
    
    /**
     * @utbot.classUnderTest {@link org.mockito.internal.stubbing.defaultanswers.ReturnsDeepStubs}
     * @utbot.methodUnderTest {@link org.mockito.internal.stubbing.defaultanswers.ReturnsDeepStubs#returnsDeepStubsAnswerUsing(org.mockito.internal.util.reflection.GenericMetadataSupport)}
     */
    @Test
    public void testReturnsDeepStubsAnswerUsing() throws Exception  {
        ReturnsDeepStubs returnsDeepStubs = new ReturnsDeepStubs();
        
        Class returnsDeepStubsClazz = Class.forName("org.mockito.internal.stubbing.defaultanswers.ReturnsDeepStubs");
        Class genericMetadataSupportType = Class.forName("org.mockito.internal.util.reflection.GenericMetadataSupport");
        Method returnsDeepStubsAnswerUsingMethod = returnsDeepStubsClazz.getDeclaredMethod("returnsDeepStubsAnswerUsing", genericMetadataSupportType);
        returnsDeepStubsAnswerUsingMethod.setAccessible(true);
        java.lang.Object[] returnsDeepStubsAnswerUsingMethodArguments = new java.lang.Object[1];
        returnsDeepStubsAnswerUsingMethodArguments[0] = ((Object) null);
        Object actual = returnsDeepStubsAnswerUsingMethod.invoke(returnsDeepStubs, returnsDeepStubsAnswerUsingMethodArguments);
        
        Object expected = createInstance("org.mockito.internal.stubbing.defaultanswers.ReturnsDeepStubs$ReturnsDeepStubsSerializationFallback");
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.mockito.internal.stubbing.defaultanswers.ReturnsDeepStubs.recordDeepStubAnswer
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method recordDeepStubAnswer(java.lang.Object, org.mockito.internal.stubbing.InvocationContainerImpl)
    
    /**
    @utbot.classUnderTest {@link ReturnsDeepStubs}
 * @utbot.methodUnderTest {@link org.mockito.internal.stubbing.defaultanswers.ReturnsDeepStubs#recordDeepStubAnswer(java.lang.Object,org.mockito.internal.stubbing.InvocationContainerImpl)}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} 
 *  */
    @Test
    public void testRecordDeepStubAnswer_ThrowIndexOutOfBoundsException() throws Throwable  {
        Class threadSafeMockingProgressClazz = Class.forName("org.mockito.internal.progress.ThreadSafeMockingProgress");
        ThreadLocal prevMockingProgress = ((ThreadLocal) getStaticFieldValue(threadSafeMockingProgressClazz, "mockingProgress"));
        try {
            ThreadLocal mockingProgress = ((ThreadLocal) createInstance("java.lang.ThreadLocal"));
            setField(mockingProgress, "java.lang.ThreadLocal", "threadLocalHashCode", 83292032);
            setStaticField(threadSafeMockingProgressClazz, "mockingProgress", mockingProgress);
            ReturnsDeepStubs returnsDeepStubs = new ReturnsDeepStubs();
            InvocationContainerImpl invocationContainerImpl = ((InvocationContainerImpl) createInstance("org.mockito.internal.stubbing.InvocationContainerImpl"));
            ThreadSafeMockingProgress mockingProgress1 = ((ThreadSafeMockingProgress) createInstance("org.mockito.internal.progress.ThreadSafeMockingProgress"));
            setField(invocationContainerImpl, "org.mockito.internal.stubbing.InvocationContainerImpl", "mockingProgress", mockingProgress1);
            StubbedInvocationMatcher invocationForStubbing = ((StubbedInvocationMatcher) createInstance("org.mockito.internal.stubbing.StubbedInvocationMatcher"));
            InvocationImpl invocation = ((InvocationImpl) createInstance("org.mockito.internal.invocation.InvocationImpl"));
            setField(invocationForStubbing, "org.mockito.internal.invocation.InvocationMatcher", "invocation", invocation);
            setField(invocationContainerImpl, "org.mockito.internal.stubbing.InvocationContainerImpl", "invocationForStubbing", invocationForStubbing);
            
            /* This test fails because method [org.mockito.internal.stubbing.defaultanswers.ReturnsDeepStubs.recordDeepStubAnswer] produces [java.lang.IndexOutOfBoundsException: Greater or equal than length] */
            Class returnsDeepStubsClazz = Class.forName("org.mockito.internal.stubbing.defaultanswers.ReturnsDeepStubs");
            Class objectType = Class.forName("java.lang.Object");
            Class invocationContainerImplType = Class.forName("org.mockito.internal.stubbing.InvocationContainerImpl");
            Method recordDeepStubAnswerMethod = returnsDeepStubsClazz.getDeclaredMethod("recordDeepStubAnswer", objectType, invocationContainerImplType);
            recordDeepStubAnswerMethod.setAccessible(true);
            java.lang.Object[] recordDeepStubAnswerMethodArguments = new java.lang.Object[2];
            recordDeepStubAnswerMethodArguments[0] = ((Object) null);
            recordDeepStubAnswerMethodArguments[1] = invocationContainerImpl;
            try {
                recordDeepStubAnswerMethod.invoke(returnsDeepStubs, recordDeepStubAnswerMethodArguments);
            } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
        } finally {
            setStaticField(ThreadSafeMockingProgress.class, "mockingProgress", prevMockingProgress);
        }
    }
    
    /**
    @utbot.classUnderTest {@link ReturnsDeepStubs}
 * @utbot.methodUnderTest {@link org.mockito.internal.stubbing.defaultanswers.ReturnsDeepStubs#recordDeepStubAnswer(java.lang.Object,org.mockito.internal.stubbing.InvocationContainerImpl)}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} 
 *  */
    @Test
    public void testRecordDeepStubAnswer_ThrowIndexOutOfBoundsException_1() throws Throwable  {
        Class threadSafeMockingProgressClazz = Class.forName("org.mockito.internal.progress.ThreadSafeMockingProgress");
        ThreadLocal prevMockingProgress = ((ThreadLocal) getStaticFieldValue(threadSafeMockingProgressClazz, "mockingProgress"));
        try {
            ThreadLocal mockingProgress = ((ThreadLocal) createInstance("java.lang.ThreadLocal"));
            setField(mockingProgress, "java.lang.ThreadLocal", "threadLocalHashCode", -1);
            setStaticField(threadSafeMockingProgressClazz, "mockingProgress", mockingProgress);
            ReturnsDeepStubs returnsDeepStubs = new ReturnsDeepStubs();
            InvocationContainerImpl invocationContainerImpl = ((InvocationContainerImpl) createInstance("org.mockito.internal.stubbing.InvocationContainerImpl"));
            ThreadSafeMockingProgress mockingProgress1 = ((ThreadSafeMockingProgress) createInstance("org.mockito.internal.progress.ThreadSafeMockingProgress"));
            setField(invocationContainerImpl, "org.mockito.internal.stubbing.InvocationContainerImpl", "mockingProgress", mockingProgress1);
            StubbedInvocationMatcher invocationForStubbing = ((StubbedInvocationMatcher) createInstance("org.mockito.internal.stubbing.StubbedInvocationMatcher"));
            InvocationImpl invocation = ((InvocationImpl) createInstance("org.mockito.internal.invocation.InvocationImpl"));
            setField(invocationForStubbing, "org.mockito.internal.invocation.InvocationMatcher", "invocation", invocation);
            setField(invocationContainerImpl, "org.mockito.internal.stubbing.InvocationContainerImpl", "invocationForStubbing", invocationForStubbing);
            
            /* This test fails because method [org.mockito.internal.stubbing.defaultanswers.ReturnsDeepStubs.recordDeepStubAnswer] produces [java.lang.IndexOutOfBoundsException: Less than zero] */
            Class returnsDeepStubsClazz = Class.forName("org.mockito.internal.stubbing.defaultanswers.ReturnsDeepStubs");
            Class objectType = Class.forName("java.lang.Object");
            Class invocationContainerImplType = Class.forName("org.mockito.internal.stubbing.InvocationContainerImpl");
            Method recordDeepStubAnswerMethod = returnsDeepStubsClazz.getDeclaredMethod("recordDeepStubAnswer", objectType, invocationContainerImplType);
            recordDeepStubAnswerMethod.setAccessible(true);
            java.lang.Object[] recordDeepStubAnswerMethodArguments = new java.lang.Object[2];
            recordDeepStubAnswerMethodArguments[0] = ((Object) null);
            recordDeepStubAnswerMethodArguments[1] = invocationContainerImpl;
            try {
                recordDeepStubAnswerMethod.invoke(returnsDeepStubs, recordDeepStubAnswerMethodArguments);
            } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
        } finally {
            setStaticField(ThreadSafeMockingProgress.class, "mockingProgress", prevMockingProgress);
        }
    }
    
    /**
    @utbot.classUnderTest {@link ReturnsDeepStubs}
 * @utbot.methodUnderTest {@link org.mockito.internal.stubbing.defaultanswers.ReturnsDeepStubs#recordDeepStubAnswer(java.lang.Object,org.mockito.internal.stubbing.InvocationContainerImpl)}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} 
 *  */
    @Test
    public void testRecordDeepStubAnswer_ThrowIndexOutOfBoundsException_2() throws Throwable  {
        Class threadSafeMockingProgressClazz = Class.forName("org.mockito.internal.progress.ThreadSafeMockingProgress");
        ThreadLocal prevMockingProgress = ((ThreadLocal) getStaticFieldValue(threadSafeMockingProgressClazz, "mockingProgress"));
        try {
            ThreadLocal mockingProgress = ((ThreadLocal) createInstance("java.lang.ThreadLocal"));
            setField(mockingProgress, "java.lang.ThreadLocal", "threadLocalHashCode", 33275776);
            setStaticField(threadSafeMockingProgressClazz, "mockingProgress", mockingProgress);
            ReturnsDeepStubs returnsDeepStubs = new ReturnsDeepStubs();
            InvocationContainerImpl invocationContainerImpl = ((InvocationContainerImpl) createInstance("org.mockito.internal.stubbing.InvocationContainerImpl"));
            ThreadSafeMockingProgress mockingProgress1 = ((ThreadSafeMockingProgress) createInstance("org.mockito.internal.progress.ThreadSafeMockingProgress"));
            setField(invocationContainerImpl, "org.mockito.internal.stubbing.InvocationContainerImpl", "mockingProgress", mockingProgress1);
            StubbedInvocationMatcher invocationForStubbing = ((StubbedInvocationMatcher) createInstance("org.mockito.internal.stubbing.StubbedInvocationMatcher"));
            InvocationImpl invocation = ((InvocationImpl) createInstance("org.mockito.internal.invocation.InvocationImpl"));
            setField(invocationForStubbing, "org.mockito.internal.invocation.InvocationMatcher", "invocation", invocation);
            setField(invocationContainerImpl, "org.mockito.internal.stubbing.InvocationContainerImpl", "invocationForStubbing", invocationForStubbing);
            
            /* This test fails because method [org.mockito.internal.stubbing.defaultanswers.ReturnsDeepStubs.recordDeepStubAnswer] produces [java.lang.IndexOutOfBoundsException: Greater or equal than length] */
            Class returnsDeepStubsClazz = Class.forName("org.mockito.internal.stubbing.defaultanswers.ReturnsDeepStubs");
            Class objectType = Class.forName("java.lang.Object");
            Class invocationContainerImplType = Class.forName("org.mockito.internal.stubbing.InvocationContainerImpl");
            Method recordDeepStubAnswerMethod = returnsDeepStubsClazz.getDeclaredMethod("recordDeepStubAnswer", objectType, invocationContainerImplType);
            recordDeepStubAnswerMethod.setAccessible(true);
            java.lang.Object[] recordDeepStubAnswerMethodArguments = new java.lang.Object[2];
            recordDeepStubAnswerMethodArguments[0] = ((Object) null);
            recordDeepStubAnswerMethodArguments[1] = invocationContainerImpl;
            try {
                recordDeepStubAnswerMethod.invoke(returnsDeepStubs, recordDeepStubAnswerMethodArguments);
            } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
        } finally {
            setStaticField(ThreadSafeMockingProgress.class, "mockingProgress", prevMockingProgress);
        }
    }
    
    /**
    @utbot.classUnderTest {@link ReturnsDeepStubs}
 * @utbot.methodUnderTest {@link org.mockito.internal.stubbing.defaultanswers.ReturnsDeepStubs#recordDeepStubAnswer(java.lang.Object,org.mockito.internal.stubbing.InvocationContainerImpl)}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} 
 *  */
    @Test
    public void testRecordDeepStubAnswer_ThrowIndexOutOfBoundsException_3() throws Throwable  {
        Class threadSafeMockingProgressClazz = Class.forName("org.mockito.internal.progress.ThreadSafeMockingProgress");
        ThreadLocal prevMockingProgress = ((ThreadLocal) getStaticFieldValue(threadSafeMockingProgressClazz, "mockingProgress"));
        try {
            ThreadLocal mockingProgress = ((ThreadLocal) createInstance("java.lang.ThreadLocal"));
            setField(mockingProgress, "java.lang.ThreadLocal", "threadLocalHashCode", -1);
            setStaticField(threadSafeMockingProgressClazz, "mockingProgress", mockingProgress);
            ReturnsDeepStubs returnsDeepStubs = new ReturnsDeepStubs();
            InvocationContainerImpl invocationContainerImpl = ((InvocationContainerImpl) createInstance("org.mockito.internal.stubbing.InvocationContainerImpl"));
            ThreadSafeMockingProgress mockingProgress1 = ((ThreadSafeMockingProgress) createInstance("org.mockito.internal.progress.ThreadSafeMockingProgress"));
            setField(invocationContainerImpl, "org.mockito.internal.stubbing.InvocationContainerImpl", "mockingProgress", mockingProgress1);
            StubbedInvocationMatcher invocationForStubbing = ((StubbedInvocationMatcher) createInstance("org.mockito.internal.stubbing.StubbedInvocationMatcher"));
            InvocationImpl invocation = ((InvocationImpl) createInstance("org.mockito.internal.invocation.InvocationImpl"));
            setField(invocationForStubbing, "org.mockito.internal.invocation.InvocationMatcher", "invocation", invocation);
            setField(invocationContainerImpl, "org.mockito.internal.stubbing.InvocationContainerImpl", "invocationForStubbing", invocationForStubbing);
            
            /* This test fails because method [org.mockito.internal.stubbing.defaultanswers.ReturnsDeepStubs.recordDeepStubAnswer] produces [java.lang.IndexOutOfBoundsException: Less than zero] */
            Class returnsDeepStubsClazz = Class.forName("org.mockito.internal.stubbing.defaultanswers.ReturnsDeepStubs");
            Class objectType = Class.forName("java.lang.Object");
            Class invocationContainerImplType = Class.forName("org.mockito.internal.stubbing.InvocationContainerImpl");
            Method recordDeepStubAnswerMethod = returnsDeepStubsClazz.getDeclaredMethod("recordDeepStubAnswer", objectType, invocationContainerImplType);
            recordDeepStubAnswerMethod.setAccessible(true);
            java.lang.Object[] recordDeepStubAnswerMethodArguments = new java.lang.Object[2];
            recordDeepStubAnswerMethodArguments[0] = ((Object) null);
            recordDeepStubAnswerMethodArguments[1] = invocationContainerImpl;
            try {
                recordDeepStubAnswerMethod.invoke(returnsDeepStubs, recordDeepStubAnswerMethodArguments);
            } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
        } finally {
            setStaticField(ThreadSafeMockingProgress.class, "mockingProgress", prevMockingProgress);
        }
    }
    
    /**
    @utbot.classUnderTest {@link ReturnsDeepStubs}
 * @utbot.methodUnderTest {@link org.mockito.internal.stubbing.defaultanswers.ReturnsDeepStubs#recordDeepStubAnswer(java.lang.Object,org.mockito.internal.stubbing.InvocationContainerImpl)}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} 
 *  */
    @Test
    public void testRecordDeepStubAnswer_ThrowIndexOutOfBoundsException_4() throws Throwable  {
        Class threadSafeMockingProgressClazz = Class.forName("org.mockito.internal.progress.ThreadSafeMockingProgress");
        ThreadLocal prevMockingProgress = ((ThreadLocal) getStaticFieldValue(threadSafeMockingProgressClazz, "mockingProgress"));
        try {
            ThreadLocal mockingProgress = ((ThreadLocal) createInstance("java.lang.ThreadLocal"));
            setField(mockingProgress, "java.lang.ThreadLocal", "threadLocalHashCode", -1);
            setStaticField(threadSafeMockingProgressClazz, "mockingProgress", mockingProgress);
            ReturnsDeepStubs returnsDeepStubs = new ReturnsDeepStubs();
            InvocationContainerImpl invocationContainerImpl = ((InvocationContainerImpl) createInstance("org.mockito.internal.stubbing.InvocationContainerImpl"));
            ThreadSafeMockingProgress mockingProgress1 = ((ThreadSafeMockingProgress) createInstance("org.mockito.internal.progress.ThreadSafeMockingProgress"));
            setField(invocationContainerImpl, "org.mockito.internal.stubbing.InvocationContainerImpl", "mockingProgress", mockingProgress1);
            InvocationMatcher invocationForStubbing = ((InvocationMatcher) createInstance("org.mockito.internal.invocation.InvocationMatcher"));
            InvocationImpl invocation = ((InvocationImpl) createInstance("org.mockito.internal.invocation.InvocationImpl"));
            setField(invocationForStubbing, "org.mockito.internal.invocation.InvocationMatcher", "invocation", invocation);
            setField(invocationContainerImpl, "org.mockito.internal.stubbing.InvocationContainerImpl", "invocationForStubbing", invocationForStubbing);
            
            /* This test fails because method [org.mockito.internal.stubbing.defaultanswers.ReturnsDeepStubs.recordDeepStubAnswer] produces [java.lang.IndexOutOfBoundsException: Less than zero] */
            Class returnsDeepStubsClazz = Class.forName("org.mockito.internal.stubbing.defaultanswers.ReturnsDeepStubs");
            Class objectType = Class.forName("java.lang.Object");
            Class invocationContainerImplType = Class.forName("org.mockito.internal.stubbing.InvocationContainerImpl");
            Method recordDeepStubAnswerMethod = returnsDeepStubsClazz.getDeclaredMethod("recordDeepStubAnswer", objectType, invocationContainerImplType);
            recordDeepStubAnswerMethod.setAccessible(true);
            java.lang.Object[] recordDeepStubAnswerMethodArguments = new java.lang.Object[2];
            recordDeepStubAnswerMethodArguments[0] = ((Object) null);
            recordDeepStubAnswerMethodArguments[1] = invocationContainerImpl;
            try {
                recordDeepStubAnswerMethod.invoke(returnsDeepStubs, recordDeepStubAnswerMethodArguments);
            } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
        } finally {
            setStaticField(ThreadSafeMockingProgress.class, "mockingProgress", prevMockingProgress);
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method recordDeepStubAnswer(java.lang.Object, org.mockito.internal.stubbing.InvocationContainerImpl)
    
    /**
    @utbot.classUnderTest {@link ReturnsDeepStubs}
 * @utbot.methodUnderTest {@link org.mockito.internal.stubbing.defaultanswers.ReturnsDeepStubs#recordDeepStubAnswer(java.lang.Object,org.mockito.internal.stubbing.InvocationContainerImpl)}
 * @utbot.invokes {@link org.mockito.internal.stubbing.InvocationContainerImpl#addAnswer(org.mockito.stubbing.Answer,boolean)}
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test(expected = NullPointerException.class)
    public void testRecordDeepStubAnswer_ThrowNullPointerException() throws Throwable  {
        ReturnsDeepStubs returnsDeepStubs = new ReturnsDeepStubs();
        InvocationContainerImpl invocationContainerImpl = ((InvocationContainerImpl) createInstance("org.mockito.internal.stubbing.InvocationContainerImpl"));
        MockingProgressImpl mockingProgress = ((MockingProgressImpl) createInstance("org.mockito.internal.progress.MockingProgressImpl"));
        setField(invocationContainerImpl, "org.mockito.internal.stubbing.InvocationContainerImpl", "mockingProgress", mockingProgress);
        StubbedInvocationMatcher invocationForStubbing = ((StubbedInvocationMatcher) createInstance("org.mockito.internal.stubbing.StubbedInvocationMatcher"));
        InvocationImpl invocation = ((InvocationImpl) createInstance("org.mockito.internal.invocation.InvocationImpl"));
        SerializableMethod method = ((SerializableMethod) createInstance("org.mockito.internal.invocation.SerializableMethod"));
        Class declaringClass = Object.class;
        setField(method, "org.mockito.internal.invocation.SerializableMethod", "declaringClass", declaringClass);
        setField(invocation, "org.mockito.internal.invocation.InvocationImpl", "method", method);
        setField(invocationForStubbing, "org.mockito.internal.invocation.InvocationMatcher", "invocation", invocation);
        setField(invocationContainerImpl, "org.mockito.internal.stubbing.InvocationContainerImpl", "invocationForStubbing", invocationForStubbing);
        
        Class returnsDeepStubsClazz = Class.forName("org.mockito.internal.stubbing.defaultanswers.ReturnsDeepStubs");
        Class invocationContainerImplType = Class.forName("org.mockito.internal.stubbing.InvocationContainerImpl");
        Method recordDeepStubAnswerMethod = returnsDeepStubsClazz.getDeclaredMethod("recordDeepStubAnswer", declaringClass, invocationContainerImplType);
        recordDeepStubAnswerMethod.setAccessible(true);
        java.lang.Object[] recordDeepStubAnswerMethodArguments = new java.lang.Object[2];
        recordDeepStubAnswerMethodArguments[0] = ((Object) null);
        recordDeepStubAnswerMethodArguments[1] = invocationContainerImpl;
        try {
            recordDeepStubAnswerMethod.invoke(returnsDeepStubs, recordDeepStubAnswerMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region Errors report for recordDeepStubAnswer
    
    public void testRecordDeepStubAnswer_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 3 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.mockito.internal.stubbing.defaultanswers.ReturnsDeepStubs.withSettingsUsing
    
    ///region Errors report for withSettingsUsing
    
    public void testWithSettingsUsing_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 12 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.mockito.internal.stubbing.defaultanswers.ReturnsDeepStubs.mockitoCore
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method mockitoCore()
    
    /**
    @utbot.classUnderTest {@link ReturnsDeepStubs}
 * @utbot.methodUnderTest {@link org.mockito.internal.stubbing.defaultanswers.ReturnsDeepStubs#mockitoCore()}
 * @utbot.invokes {@link org.mockito.internal.stubbing.defaultanswers.ReturnsDeepStubs.LazyHolder#access$000()}
 * @utbot.returnsFrom {@code return LazyHolder.MOCKITO_CORE;}
 *  */
    @Test
    public void testMockitoCore_ReturnsDeepStubsAccess$000() throws Exception  {
        Class lazyHolderClazz = Class.forName("org.mockito.internal.stubbing.defaultanswers.ReturnsDeepStubs$LazyHolder");
        MockitoCore prevMOCKITO_CORE = ((MockitoCore) getStaticFieldValue(lazyHolderClazz, "MOCKITO_CORE"));
        try {
            MockitoCore mockitoCore = ((MockitoCore) createInstance("org.mockito.internal.MockitoCore"));
            Reporter reporter = ((Reporter) createInstance("org.mockito.exceptions.Reporter"));
            setField(mockitoCore, "org.mockito.internal.MockitoCore", "reporter", reporter);
            MockUtil mockUtil = ((MockUtil) createInstance("org.mockito.internal.util.MockUtil"));
            setField(mockitoCore, "org.mockito.internal.MockitoCore", "mockUtil", mockUtil);
            ThreadSafeMockingProgress mockingProgress = ((ThreadSafeMockingProgress) createInstance("org.mockito.internal.progress.ThreadSafeMockingProgress"));
            setField(mockitoCore, "org.mockito.internal.MockitoCore", "mockingProgress", mockingProgress);
            setStaticField(lazyHolderClazz, "MOCKITO_CORE", mockitoCore);
            
            Class returnsDeepStubsClazz = Class.forName("org.mockito.internal.stubbing.defaultanswers.ReturnsDeepStubs");
            Method mockitoCoreMethod = returnsDeepStubsClazz.getDeclaredMethod("mockitoCore");
            mockitoCoreMethod.setAccessible(true);
            java.lang.Object[] mockitoCoreMethodArguments = new java.lang.Object[0];
            MockitoCore actual = ((MockitoCore) mockitoCoreMethod.invoke(null, mockitoCoreMethodArguments));
            
            Reporter mockitoCoreReporter = ((Reporter) getFieldValue(mockitoCore, "org.mockito.internal.MockitoCore", "reporter"));
            Reporter actualReporter = ((Reporter) getFieldValue(actual, "org.mockito.internal.MockitoCore", "reporter"));
            
            MockUtil mockitoCoreMockUtil = ((MockUtil) getFieldValue(mockitoCore, "org.mockito.internal.MockitoCore", "mockUtil"));
            MockUtil actualMockUtil = ((MockUtil) getFieldValue(actual, "org.mockito.internal.MockitoCore", "mockUtil"));
            
            MockingProgress mockitoCoreMockingProgress = ((MockingProgress) getFieldValue(mockitoCore, "org.mockito.internal.MockitoCore", "mockingProgress"));
            MockingProgress actualMockingProgress = ((MockingProgress) getFieldValue(actual, "org.mockito.internal.MockitoCore", "mockingProgress"));
            
        } finally {
            setStaticField(lazyHolderClazz, "MOCKITO_CORE", prevMOCKITO_CORE);
        }
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method mockitoCore()
    
    /**
     * @utbot.classUnderTest {@link org.mockito.internal.stubbing.defaultanswers.ReturnsDeepStubs}
     * @utbot.methodUnderTest {@link org.mockito.internal.stubbing.defaultanswers.ReturnsDeepStubs#mockitoCore()}
     */
    @Test
    public void testMockitoCore() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        Class returnsDeepStubsClazz = Class.forName("org.mockito.internal.stubbing.defaultanswers.ReturnsDeepStubs");
        Method mockitoCoreMethod = returnsDeepStubsClazz.getDeclaredMethod("mockitoCore");
        mockitoCoreMethod.setAccessible(true);
        java.lang.Object[] mockitoCoreMethodArguments = new java.lang.Object[0];
        MockitoCore actual = ((MockitoCore) mockitoCoreMethod.invoke(null, mockitoCoreMethodArguments));
        
        MockitoCore expected = new MockitoCore();
        
    }
    
    /**
     * @utbot.classUnderTest {@link org.mockito.internal.stubbing.defaultanswers.ReturnsDeepStubs}
     * @utbot.methodUnderTest {@link org.mockito.internal.stubbing.defaultanswers.ReturnsDeepStubs#mockitoCore()}
     */
    @Test
    public void testMockitoCore1() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        Class returnsDeepStubsClazz = Class.forName("org.mockito.internal.stubbing.defaultanswers.ReturnsDeepStubs");
        Method mockitoCoreMethod = returnsDeepStubsClazz.getDeclaredMethod("mockitoCore");
        mockitoCoreMethod.setAccessible(true);
        java.lang.Object[] mockitoCoreMethodArguments = new java.lang.Object[0];
        MockitoCore actual = ((MockitoCore) mockitoCoreMethod.invoke(null, mockitoCoreMethodArguments));
        
        MockitoCore expected = new MockitoCore();
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.mockito.internal.stubbing.defaultanswers.ReturnsDeepStubs.newDeepStubMock
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method newDeepStubMock(org.mockito.internal.util.reflection.GenericMetadataSupport)
    
    /**
    @utbot.classUnderTest {@link ReturnsDeepStubs}
 * @utbot.methodUnderTest {@link org.mockito.internal.stubbing.defaultanswers.ReturnsDeepStubs#newDeepStubMock(org.mockito.internal.util.reflection.GenericMetadataSupport)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: returnTypeGenericMetadata.rawType()
 *  */
    @Test
    public void testNewDeepStubMock_ThrowNullPointerException() throws Throwable  {
        Class lazyHolderClazz = Class.forName("org.mockito.internal.stubbing.defaultanswers.ReturnsDeepStubs$LazyHolder");
        MockitoCore prevMOCKITO_CORE = ((MockitoCore) getStaticFieldValue(lazyHolderClazz, "MOCKITO_CORE"));
        try {
            MockitoCore mockitoCore = ((MockitoCore) createInstance("org.mockito.internal.MockitoCore"));
            Reporter reporter = ((Reporter) createInstance("org.mockito.exceptions.Reporter"));
            setField(mockitoCore, "org.mockito.internal.MockitoCore", "reporter", reporter);
            MockUtil mockUtil = ((MockUtil) createInstance("org.mockito.internal.util.MockUtil"));
            setField(mockitoCore, "org.mockito.internal.MockitoCore", "mockUtil", mockUtil);
            ThreadSafeMockingProgress mockingProgress = ((ThreadSafeMockingProgress) createInstance("org.mockito.internal.progress.ThreadSafeMockingProgress"));
            setField(mockitoCore, "org.mockito.internal.MockitoCore", "mockingProgress", mockingProgress);
            setStaticField(lazyHolderClazz, "MOCKITO_CORE", mockitoCore);
            ReturnsDeepStubs returnsDeepStubs = new ReturnsDeepStubs();
            
            /* This test fails because method [org.mockito.internal.stubbing.defaultanswers.ReturnsDeepStubs.newDeepStubMock] produces [java.lang.NullPointerException] */
            Class returnsDeepStubsClazz = Class.forName("org.mockito.internal.stubbing.defaultanswers.ReturnsDeepStubs");
            Class genericMetadataSupportType = Class.forName("org.mockito.internal.util.reflection.GenericMetadataSupport");
            Method newDeepStubMockMethod = returnsDeepStubsClazz.getDeclaredMethod("newDeepStubMock", genericMetadataSupportType);
            newDeepStubMockMethod.setAccessible(true);
            java.lang.Object[] newDeepStubMockMethodArguments = new java.lang.Object[1];
            newDeepStubMockMethodArguments[0] = ((Object) null);
            try {
                newDeepStubMockMethod.invoke(returnsDeepStubs, newDeepStubMockMethodArguments);
            } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
        } finally {
            setStaticField(lazyHolderClazz, "MOCKITO_CORE", prevMOCKITO_CORE);
        }
    }
    
    /**
    @utbot.classUnderTest {@link ReturnsDeepStubs}
 * @utbot.methodUnderTest {@link org.mockito.internal.stubbing.defaultanswers.ReturnsDeepStubs#newDeepStubMock(org.mockito.internal.util.reflection.GenericMetadataSupport)}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.invokes org.mockito.internal.stubbing.defaultanswers.ReturnsDeepStubs#withSettingsUsing(org.mockito.internal.util.reflection.GenericMetadataSupport)
 * @utbot.invokes {@link org.mockito.internal.util.reflection.GenericMetadataSupport#hasRawExtraInterfaces()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: withSettingsUsing(returnTypeGenericMetadata)
 *  */
    @Test
    public void testNewDeepStubMock_ThrowNullPointerException_1() throws Throwable  {
        Class lazyHolderClazz = Class.forName("org.mockito.internal.stubbing.defaultanswers.ReturnsDeepStubs$LazyHolder");
        MockitoCore prevMOCKITO_CORE = ((MockitoCore) getStaticFieldValue(lazyHolderClazz, "MOCKITO_CORE"));
        try {
            MockitoCore mockitoCore = ((MockitoCore) createInstance("org.mockito.internal.MockitoCore"));
            Reporter reporter = ((Reporter) createInstance("org.mockito.exceptions.Reporter"));
            setField(mockitoCore, "org.mockito.internal.MockitoCore", "reporter", reporter);
            MockUtil mockUtil = ((MockUtil) createInstance("org.mockito.internal.util.MockUtil"));
            setField(mockitoCore, "org.mockito.internal.MockitoCore", "mockUtil", mockUtil);
            ThreadSafeMockingProgress mockingProgress = ((ThreadSafeMockingProgress) createInstance("org.mockito.internal.progress.ThreadSafeMockingProgress"));
            setField(mockitoCore, "org.mockito.internal.MockitoCore", "mockingProgress", mockingProgress);
            setStaticField(lazyHolderClazz, "MOCKITO_CORE", mockitoCore);
            ReturnsDeepStubs returnsDeepStubs = new ReturnsDeepStubs();
            Object typeVariableReturnType = createInstance("org.mockito.internal.util.reflection.GenericMetadataSupport$TypeVariableReturnType");
            TypeVariableImpl typeVariable = ((TypeVariableImpl) createInstance("sun.reflect.generics.reflectiveObjects.TypeVariableImpl"));
            setField(typeVariableReturnType, "org.mockito.internal.util.reflection.GenericMetadataSupport$TypeVariableReturnType", "typeVariable", typeVariable);
            Class rawType = Object.class;
            setField(typeVariableReturnType, "org.mockito.internal.util.reflection.GenericMetadataSupport$TypeVariableReturnType", "rawType", rawType);
            
            /* This test fails because method [org.mockito.internal.stubbing.defaultanswers.ReturnsDeepStubs.newDeepStubMock] produces [java.lang.NullPointerException] */
            Class returnsDeepStubsClazz = Class.forName("org.mockito.internal.stubbing.defaultanswers.ReturnsDeepStubs");
            Class typeVariableReturnTypeType = Class.forName("org.mockito.internal.util.reflection.GenericMetadataSupport");
            Method newDeepStubMockMethod = returnsDeepStubsClazz.getDeclaredMethod("newDeepStubMock", typeVariableReturnTypeType);
            newDeepStubMockMethod.setAccessible(true);
            java.lang.Object[] newDeepStubMockMethodArguments = new java.lang.Object[1];
            newDeepStubMockMethodArguments[0] = typeVariableReturnType;
            try {
                newDeepStubMockMethod.invoke(returnsDeepStubs, newDeepStubMockMethodArguments);
            } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
        } finally {
            setStaticField(lazyHolderClazz, "MOCKITO_CORE", prevMOCKITO_CORE);
        }
    }
    
    /**
    @utbot.classUnderTest {@link ReturnsDeepStubs}
 * @utbot.methodUnderTest {@link org.mockito.internal.stubbing.defaultanswers.ReturnsDeepStubs#newDeepStubMock(org.mockito.internal.util.reflection.GenericMetadataSupport)}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.invokes org.mockito.internal.util.reflection.GenericMetadataSupport.TypeVariableReturnType#extractRawTypeOf(java.lang.reflect.Type)
 * @utbot.invokes org.mockito.internal.util.reflection.GenericMetadataSupport.TypeVariableReturnType#extractRawTypeOf(java.lang.reflect.Type)
 * @utbot.throwsException {@link java.lang.NullPointerException} in: returnTypeGenericMetadata.rawType()
 *  */
    @Test
    public void testNewDeepStubMock_ThrowNullPointerException_2() throws Throwable  {
        Class lazyHolderClazz = Class.forName("org.mockito.internal.stubbing.defaultanswers.ReturnsDeepStubs$LazyHolder");
        MockitoCore prevMOCKITO_CORE = ((MockitoCore) getStaticFieldValue(lazyHolderClazz, "MOCKITO_CORE"));
        try {
            MockitoCore mockitoCore = ((MockitoCore) createInstance("org.mockito.internal.MockitoCore"));
            Reporter reporter = ((Reporter) createInstance("org.mockito.exceptions.Reporter"));
            setField(mockitoCore, "org.mockito.internal.MockitoCore", "reporter", reporter);
            MockUtil mockUtil = ((MockUtil) createInstance("org.mockito.internal.util.MockUtil"));
            setField(mockitoCore, "org.mockito.internal.MockitoCore", "mockUtil", mockUtil);
            ThreadSafeMockingProgress mockingProgress = ((ThreadSafeMockingProgress) createInstance("org.mockito.internal.progress.ThreadSafeMockingProgress"));
            setField(mockitoCore, "org.mockito.internal.MockitoCore", "mockingProgress", mockingProgress);
            setStaticField(lazyHolderClazz, "MOCKITO_CORE", mockitoCore);
            ReturnsDeepStubs returnsDeepStubs = new ReturnsDeepStubs();
            Object typeVariableReturnType = createInstance("org.mockito.internal.util.reflection.GenericMetadataSupport$TypeVariableReturnType");
            TypeVariableImpl typeVariable = ((TypeVariableImpl) createInstance("sun.reflect.generics.reflectiveObjects.TypeVariableImpl"));
            setField(typeVariableReturnType, "org.mockito.internal.util.reflection.GenericMetadataSupport$TypeVariableReturnType", "typeVariable", typeVariable);
            
            /* This test fails because method [org.mockito.internal.stubbing.defaultanswers.ReturnsDeepStubs.newDeepStubMock] produces [java.lang.NullPointerException] */
            Class returnsDeepStubsClazz = Class.forName("org.mockito.internal.stubbing.defaultanswers.ReturnsDeepStubs");
            Class typeVariableReturnTypeType = Class.forName("org.mockito.internal.util.reflection.GenericMetadataSupport");
            Method newDeepStubMockMethod = returnsDeepStubsClazz.getDeclaredMethod("newDeepStubMock", typeVariableReturnTypeType);
            newDeepStubMockMethod.setAccessible(true);
            java.lang.Object[] newDeepStubMockMethodArguments = new java.lang.Object[1];
            newDeepStubMockMethodArguments[0] = typeVariableReturnType;
            try {
                newDeepStubMockMethod.invoke(returnsDeepStubs, newDeepStubMockMethodArguments);
            } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
        } finally {
            setStaticField(lazyHolderClazz, "MOCKITO_CORE", prevMOCKITO_CORE);
        }
    }
    ///endregion
    
    ///region Errors report for newDeepStubMock
    
    public void testNewDeepStubMock_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 2 occurrences of:
        // Default concrete execution failed
        
        // 1 occurrences of:
        // <Throwable with empty message>
        
        // 1 occurrences of:
        // Could not initialize class org.mockito.Answers
        
        // 1 occurrences of:
        // Field clazz is not declared in class java.lang.reflect.Constructor
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.mockito.internal.stubbing.defaultanswers.ReturnsDeepStubs.deepStub
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method deepStub(org.mockito.invocation.InvocationOnMock, org.mockito.internal.util.reflection.GenericMetadataSupport)
    
    /**
    @utbot.classUnderTest {@link ReturnsDeepStubs}
 * @utbot.methodUnderTest {@link org.mockito.internal.stubbing.defaultanswers.ReturnsDeepStubs#deepStub(org.mockito.invocation.InvocationOnMock,org.mockito.internal.util.reflection.GenericMetadataSupport)}
 * @utbot.invokes {@link org.mockito.invocation.InvocationOnMock#getMock()}
 * @utbot.invokes {@link org.mockito.internal.util.MockUtil#getMockHandler(java.lang.Object)}
 * @utbot.throwsException {@link org.mockito.exceptions.misusing.NotAMockException} in: InternalMockHandler<Object> handler = new MockUtil().getMockHandler(invocation.getMock());
 *  */
    @Test
    public void testDeepStub_ThrowNotAMockException() throws Throwable  {
        ReturnsDeepStubs returnsDeepStubs = new ReturnsDeepStubs();
        InvocationImpl invocationImpl = ((InvocationImpl) createInstance("org.mockito.internal.invocation.InvocationImpl"));
        
        /* This test fails because method [org.mockito.internal.stubbing.defaultanswers.ReturnsDeepStubs.deepStub] produces [org.mockito.exceptions.misusing.NotAMockException: Argument should be a mock, but is null!] */
        Class returnsDeepStubsClazz = Class.forName("org.mockito.internal.stubbing.defaultanswers.ReturnsDeepStubs");
        Class invocationImplType = Class.forName("org.mockito.invocation.InvocationOnMock");
        Class genericMetadataSupportType = Class.forName("org.mockito.internal.util.reflection.GenericMetadataSupport");
        Method deepStubMethod = returnsDeepStubsClazz.getDeclaredMethod("deepStub", invocationImplType, genericMetadataSupportType);
        deepStubMethod.setAccessible(true);
        java.lang.Object[] deepStubMethodArguments = new java.lang.Object[2];
        deepStubMethodArguments[0] = invocationImpl;
        deepStubMethodArguments[1] = ((Object) null);
        try {
            deepStubMethod.invoke(returnsDeepStubs, deepStubMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link ReturnsDeepStubs}
 * @utbot.methodUnderTest {@link org.mockito.internal.stubbing.defaultanswers.ReturnsDeepStubs#deepStub(org.mockito.invocation.InvocationOnMock,org.mockito.internal.util.reflection.GenericMetadataSupport)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: InternalMockHandler<Object> handler = new MockUtil().getMockHandler(invocation.getMock());
 *  */
    @Test
    public void testDeepStub_ThrowNullPointerException() throws Throwable  {
        ReturnsDeepStubs returnsDeepStubs = new ReturnsDeepStubs();
        
        /* This test fails because method [org.mockito.internal.stubbing.defaultanswers.ReturnsDeepStubs.deepStub] produces [java.lang.NullPointerException]
            org.mockito.internal.stubbing.defaultanswers.ReturnsDeepStubs.deepStub(ReturnsDeepStubs.java:82) */
        Class returnsDeepStubsClazz = Class.forName("org.mockito.internal.stubbing.defaultanswers.ReturnsDeepStubs");
        Class invocationOnMockType = Class.forName("org.mockito.invocation.InvocationOnMock");
        Class genericMetadataSupportType = Class.forName("org.mockito.internal.util.reflection.GenericMetadataSupport");
        Method deepStubMethod = returnsDeepStubsClazz.getDeclaredMethod("deepStub", invocationOnMockType, genericMetadataSupportType);
        deepStubMethod.setAccessible(true);
        java.lang.Object[] deepStubMethodArguments = new java.lang.Object[2];
        deepStubMethodArguments[0] = ((Object) null);
        deepStubMethodArguments[1] = ((Object) null);
        try {
            deepStubMethod.invoke(returnsDeepStubs, deepStubMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.mockito.internal.stubbing.defaultanswers.ReturnsDeepStubs.actualParameterizedType
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method actualParameterizedType(java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link ReturnsDeepStubs}
 * @utbot.methodUnderTest {@link org.mockito.internal.stubbing.defaultanswers.ReturnsDeepStubs#actualParameterizedType(java.lang.Object)}
 * @utbot.invokes {@link org.mockito.internal.util.MockUtil#getMockHandler(java.lang.Object)}
 * @utbot.throwsException {@link org.mockito.exceptions.misusing.NotAMockException} in: CreationSettings mockSettings = (CreationSettings) new MockUtil().getMockHandler(mock).getMockSettings();
 *  */
    @Test
    public void testActualParameterizedType_ThrowNotAMockException() {
        ReturnsDeepStubs returnsDeepStubs = new ReturnsDeepStubs();
        
        /* This test fails because method [org.mockito.internal.stubbing.defaultanswers.ReturnsDeepStubs.actualParameterizedType] produces [org.mockito.exceptions.misusing.NotAMockException: Argument should be a mock, but is null!] */
        returnsDeepStubs.actualParameterizedType(null);
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method actualParameterizedType(java.lang.Object)
    
    /**
     * @utbot.classUnderTest {@link org.mockito.internal.stubbing.defaultanswers.ReturnsDeepStubs}
     * @utbot.methodUnderTest {@link org.mockito.internal.stubbing.defaultanswers.ReturnsDeepStubs#actualParameterizedType(java.lang.Object)}
     */
    @Test
    public void testActualParameterizedTypeThrowsNAME() {
        ReturnsDeepStubs returnsDeepStubs = new ReturnsDeepStubs();
        Object object = new Object();
        
        /* This test fails because method [org.mockito.internal.stubbing.defaultanswers.ReturnsDeepStubs.actualParameterizedType] produces [org.mockito.exceptions.misusing.NotAMockException: Argument should be a mock, but is: class java.lang.Object] */
        returnsDeepStubs.actualParameterizedType(object);
    }
    
    /**
     * @utbot.classUnderTest {@link org.mockito.internal.stubbing.defaultanswers.ReturnsDeepStubs}
     * @utbot.methodUnderTest {@link org.mockito.internal.stubbing.defaultanswers.ReturnsDeepStubs#actualParameterizedType(java.lang.Object)}
     */
    @Test
    public void testActualParameterizedTypeThrowsNAME1() {
        ReturnsDeepStubs returnsDeepStubs = new ReturnsDeepStubs();
        Object object = new Object();
        
        /* This test fails because method [org.mockito.internal.stubbing.defaultanswers.ReturnsDeepStubs.actualParameterizedType] produces [org.mockito.exceptions.misusing.NotAMockException: Argument should be a mock, but is: class java.lang.Object] */
        returnsDeepStubs.actualParameterizedType(object);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.mockito.internal.stubbing.defaultanswers.ReturnsDeepStubs.answer
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method answer(org.mockito.invocation.InvocationOnMock)
    
    /**
    @utbot.classUnderTest {@link ReturnsDeepStubs}
 * @utbot.methodUnderTest {@link org.mockito.internal.stubbing.defaultanswers.ReturnsDeepStubs#answer(org.mockito.invocation.InvocationOnMock)}
 * @utbot.invokes {@link org.mockito.invocation.InvocationOnMock#getMock()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: actualParameterizedType(invocation.getMock()).resolveGenericReturnType(invocation.getMethod())
 *  */
    @Test
    public void testAnswer_ThrowNullPointerException() throws Throwable  {
        ReturnsDeepStubs returnsDeepStubs = new ReturnsDeepStubs();
        
        /* This test fails because method [org.mockito.internal.stubbing.defaultanswers.ReturnsDeepStubs.answer] produces [java.lang.NullPointerException]
            org.mockito.internal.stubbing.defaultanswers.ReturnsDeepStubs.answer(ReturnsDeepStubs.java:52) */
        returnsDeepStubs.answer(null);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method answer(org.mockito.invocation.InvocationOnMock)
    
    @Test
    public void testAnswer1() throws Throwable  {
        ReturnsDeepStubs returnsDeepStubs = new ReturnsDeepStubs();
        InvocationImpl invocationImpl = ((InvocationImpl) createInstance("org.mockito.internal.invocation.InvocationImpl"));
        Object mock = createInstance("java.lang.Object");
        setField(invocationImpl, "org.mockito.internal.invocation.InvocationImpl", "mock", mock);
        
        /* This test fails because method [org.mockito.internal.stubbing.defaultanswers.ReturnsDeepStubs.answer] produces [org.mockito.exceptions.misusing.NotAMockException: Argument should be a mock, but is: class java.lang.Object] */
        returnsDeepStubs.answer(invocationImpl);
    }
    
    @Test
    public void testAnswer2() throws Throwable  {
        ReturnsDeepStubs returnsDeepStubs = new ReturnsDeepStubs();
        InvocationImpl invocationImpl = ((InvocationImpl) createInstance("org.mockito.internal.invocation.InvocationImpl"));
        Object mock = createInstance("java.lang.Object");
        setField(invocationImpl, "org.mockito.internal.invocation.InvocationImpl", "mock", mock);
        
        /* This test fails because method [org.mockito.internal.stubbing.defaultanswers.ReturnsDeepStubs.answer] produces [org.mockito.exceptions.misusing.NotAMockException: Argument should be a mock, but is: class java.lang.Object] */
        returnsDeepStubs.answer(invocationImpl);
    }
    ///endregion
    
    ///region Errors report for answer
    
    public void testAnswer_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 2 occurrences of:
        // Concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.mockito.internal.stubbing.defaultanswers.ReturnsDeepStubs.delegate
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method delegate()
    
    /**
    @utbot.classUnderTest {@link ReturnsDeepStubs}
 * @utbot.methodUnderTest {@link org.mockito.internal.stubbing.defaultanswers.ReturnsDeepStubs#delegate()}
 * @utbot.invokes {@link org.mockito.internal.stubbing.defaultanswers.ReturnsDeepStubs.LazyHolder#access$100()}
 * @utbot.returnsFrom {@code return LazyHolder.DELEGATE;}
 *  */
    @Test
    public void testDelegate_ReturnsDeepStubsAccess$100() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException, NoSuchMethodException, InvocationTargetException  {
        Class lazyHolderClazz = Class.forName("org.mockito.internal.stubbing.defaultanswers.ReturnsDeepStubs$LazyHolder");
        ReturnsEmptyValues prevDELEGATE = ((ReturnsEmptyValues) getStaticFieldValue(lazyHolderClazz, "DELEGATE"));
        try {
            ReturnsEmptyValues delegate = new ReturnsEmptyValues();
            ObjectMethodsGuru methodsGuru = new ObjectMethodsGuru();
            delegate.methodsGuru = methodsGuru;
            MockUtil mockUtil = new MockUtil();
            delegate.mockUtil = mockUtil;
            setStaticField(lazyHolderClazz, "DELEGATE", delegate);
            
            Class returnsDeepStubsClazz = Class.forName("org.mockito.internal.stubbing.defaultanswers.ReturnsDeepStubs");
            Method delegateMethod = returnsDeepStubsClazz.getDeclaredMethod("delegate");
            delegateMethod.setAccessible(true);
            java.lang.Object[] delegateMethodArguments = new java.lang.Object[0];
            ReturnsEmptyValues actual = ((ReturnsEmptyValues) delegateMethod.invoke(null, delegateMethodArguments));
            
            ObjectMethodsGuru delegateMethodsGuru = delegate.methodsGuru;
            ObjectMethodsGuru actualMethodsGuru = actual.methodsGuru;
            
            MockUtil delegateMockUtil = delegate.mockUtil;
            MockUtil actualMockUtil = actual.mockUtil;
            
        } finally {
            setStaticField(lazyHolderClazz, "DELEGATE", prevDELEGATE);
        }
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method delegate()
    
    /**
     * @utbot.classUnderTest {@link org.mockito.internal.stubbing.defaultanswers.ReturnsDeepStubs}
     * @utbot.methodUnderTest {@link org.mockito.internal.stubbing.defaultanswers.ReturnsDeepStubs#delegate()}
     */
    @Test
    public void testDelegate() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        Class returnsDeepStubsClazz = Class.forName("org.mockito.internal.stubbing.defaultanswers.ReturnsDeepStubs");
        Method delegateMethod = returnsDeepStubsClazz.getDeclaredMethod("delegate");
        delegateMethod.setAccessible(true);
        java.lang.Object[] delegateMethodArguments = new java.lang.Object[0];
        ReturnsEmptyValues actual = ((ReturnsEmptyValues) delegateMethod.invoke(null, delegateMethodArguments));
        
        ReturnsEmptyValues expected = new ReturnsEmptyValues();
        
    }
    
    /**
     * @utbot.classUnderTest {@link org.mockito.internal.stubbing.defaultanswers.ReturnsDeepStubs}
     * @utbot.methodUnderTest {@link org.mockito.internal.stubbing.defaultanswers.ReturnsDeepStubs#delegate()}
     */
    @Test
    public void testDelegate1() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        Class returnsDeepStubsClazz = Class.forName("org.mockito.internal.stubbing.defaultanswers.ReturnsDeepStubs");
        Method delegateMethod = returnsDeepStubsClazz.getDeclaredMethod("delegate");
        delegateMethod.setAccessible(true);
        java.lang.Object[] delegateMethodArguments = new java.lang.Object[0];
        ReturnsEmptyValues actual = ((ReturnsEmptyValues) delegateMethod.invoke(null, delegateMethodArguments));
        
        ReturnsEmptyValues expected = new ReturnsEmptyValues();
        
    }
    ///endregion
    
    ///endregion
    
    ///region Util methods
    
    private static Object createInstance(String className) throws Exception {
        Class<?> clazz = Class.forName(className);
        return Class.forName("sun.misc.Unsafe").getDeclaredMethod("allocateInstance", Class.class)
            .invoke(getUnsafeInstance(), clazz);
    }
    
    private static Object getStaticFieldValue(Class<?> clazz, String fieldName) throws IllegalAccessException, NoSuchFieldException {
        java.lang.reflect.Field field;
        Class<?> originClass = clazz;
        do {
            try {
                field = clazz.getDeclaredField(fieldName);
                field.setAccessible(true);
                
                java.lang.reflect.Field modifiersField;
                
            java.lang.reflect.Method methodForGetDeclaredFields1137580390678100 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields1137580390678100.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass1137580390685800 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1137580390678100.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1137580390685800).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
    
        private static void setField(Object object, String fieldClassName, String fieldName, Object fieldValue) throws ClassNotFoundException, NoSuchFieldException, NoSuchMethodException, IllegalAccessException, java.lang.reflect.InvocationTargetException {
        Class<?> clazz = Class.forName(fieldClassName);
        java.lang.reflect.Field field = clazz.getDeclaredField(fieldName);
    
        java.lang.reflect.Field modifiersField;
        
                java.lang.reflect.Method methodForGetDeclaredFields1137580391666600 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields1137580391666600.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass1137580391669700 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1137580391666600.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1137580391669700).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields1137580392102800 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields1137580392102800.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass1137580392106300 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1137580392102800.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1137580392106300).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields1137580392693400 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields1137580392693400.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass1137580392696000 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1137580392693400.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1137580392696000).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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

