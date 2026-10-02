package org.mockito.internal.stubbing.defaultanswers;

import org.junit.Test;
import org.mockito.internal.invocation.InvocationImpl;
import java.lang.reflect.Method;
import java.lang.reflect.InvocationTargetException;
import sun.reflect.generics.reflectiveObjects.TypeVariableImpl;
import org.mockito.internal.MockitoCore;
import org.mockito.exceptions.base.MockitoException;
import java.util.LinkedHashMap;
import java.lang.reflect.Constructor;
import org.mockito.internal.stubbing.InvocationContainerImpl;
import org.mockito.internal.progress.ThreadSafeMockingProgress;
import org.mockito.internal.invocation.InvocationMatcher;
import jdk.internal.misc.TerminatingThreadLocal;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

public final class org_mockito_internal_stubbing_defaultanswers_ReturnsDeepStubsTest {
    ///region Test suites for executable org.mockito.internal.stubbing.defaultanswers.ReturnsDeepStubs.answer
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method answer(org.mockito.invocation.InvocationOnMock)
    
    /**
    @utbot.classUnderTest {@link ReturnsDeepStubs}
 * @utbot.methodUnderTest {@link org.mockito.internal.stubbing.defaultanswers.ReturnsDeepStubs#answer(org.mockito.invocation.InvocationOnMock)}
 * @utbot.invokes {@link org.mockito.invocation.InvocationOnMock#getMock()}
 * @utbot.invokes {@link org.mockito.internal.stubbing.defaultanswers.ReturnsDeepStubs#actualParameterizedType(java.lang.Object)}
 * @utbot.throwsException {@link org.mockito.exceptions.misusing.NotAMockException} in: actualParameterizedType(invocation.getMock()).resolveGenericReturnType(invocation.getMethod())
 *  */
    @Test
    public void testAnswer_ThrowNotAMockException() throws Throwable  {
        ReturnsDeepStubs returnsDeepStubs = new ReturnsDeepStubs();
        InvocationImpl invocationImpl = ((InvocationImpl) createInstance("org.mockito.internal.invocation.InvocationImpl"));
        
        /* This test fails because method [org.mockito.internal.stubbing.defaultanswers.ReturnsDeepStubs.answer] produces [org.mockito.exceptions.misusing.NotAMockException: Argument should be a mock, but is null!] */
        returnsDeepStubs.answer(invocationImpl);
    }
    
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
    
    ///endregion
    
    ///region Test suites for executable org.mockito.internal.stubbing.defaultanswers.ReturnsDeepStubs.returnsDeepStubsAnswerUsing
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method returnsDeepStubsAnswerUsing(org.mockito.internal.util.reflection.GenericMetadataSupport)
    
    /**
    @utbot.classUnderTest {@link ReturnsDeepStubs}
 * @utbot.methodUnderTest {@link org.mockito.internal.stubbing.defaultanswers.ReturnsDeepStubs#returnsDeepStubsAnswerUsing(org.mockito.internal.util.reflection.GenericMetadataSupport)}
 * @utbot.returnsFrom {@code return new ReturnsDeepStubs() {
 * 
 *     @Override
 *     protected GenericMetadataSupport actualParameterizedType(Object mock) {
 *         return returnTypeGenericMetadata;
 *     }
 * };}
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
    
    /**
     * @utbot.classUnderTest {@link org.mockito.internal.stubbing.defaultanswers.ReturnsDeepStubs}
     * @utbot.methodUnderTest {@link org.mockito.internal.stubbing.defaultanswers.ReturnsDeepStubs#returnsDeepStubsAnswerUsing(org.mockito.internal.util.reflection.GenericMetadataSupport)}
     */
    @Test
    public void testReturnsDeepStubsAnswerUsing1() throws Exception  {
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
    
    ///region Test suites for executable org.mockito.internal.stubbing.defaultanswers.ReturnsDeepStubs.createNewDeepStubMock
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method createNewDeepStubMock(org.mockito.internal.util.reflection.GenericMetadataSupport)
    
    /**
    @utbot.classUnderTest {@link ReturnsDeepStubs}
 * @utbot.methodUnderTest {@link org.mockito.internal.stubbing.defaultanswers.ReturnsDeepStubs#createNewDeepStubMock(org.mockito.internal.util.reflection.GenericMetadataSupport)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: returnTypeGenericMetadata.rawType()
 *  */
    @Test
    public void testCreateNewDeepStubMock_ThrowNullPointerException() throws Throwable  {
        ReturnsDeepStubs returnsDeepStubs = ((ReturnsDeepStubs) createInstance("org.mockito.internal.stubbing.defaultanswers.ReturnsDeepStubs"));
        
        /* This test fails because method [org.mockito.internal.stubbing.defaultanswers.ReturnsDeepStubs.createNewDeepStubMock] produces [java.lang.NullPointerException] */
        Class returnsDeepStubsClazz = Class.forName("org.mockito.internal.stubbing.defaultanswers.ReturnsDeepStubs");
        Class genericMetadataSupportType = Class.forName("org.mockito.internal.util.reflection.GenericMetadataSupport");
        Method createNewDeepStubMockMethod = returnsDeepStubsClazz.getDeclaredMethod("createNewDeepStubMock", genericMetadataSupportType);
        createNewDeepStubMockMethod.setAccessible(true);
        java.lang.Object[] createNewDeepStubMockMethodArguments = new java.lang.Object[1];
        createNewDeepStubMockMethodArguments[0] = ((Object) null);
        try {
            createNewDeepStubMockMethod.invoke(returnsDeepStubs, createNewDeepStubMockMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link ReturnsDeepStubs}
 * @utbot.methodUnderTest {@link org.mockito.internal.stubbing.defaultanswers.ReturnsDeepStubs#createNewDeepStubMock(org.mockito.internal.util.reflection.GenericMetadataSupport)}
 * @utbot.invokes org.mockito.internal.stubbing.defaultanswers.ReturnsDeepStubs#withSettingsUsing(org.mockito.internal.util.reflection.GenericMetadataSupport)
 * @utbot.throwsException {@link java.lang.NullPointerException} in: withSettingsUsing(returnTypeGenericMetadata)
 *  */
    @Test
    public void testCreateNewDeepStubMock_ThrowNullPointerException_1() throws Throwable  {
        ReturnsDeepStubs returnsDeepStubs = ((ReturnsDeepStubs) createInstance("org.mockito.internal.stubbing.defaultanswers.ReturnsDeepStubs"));
        Object typeVariableReturnType = createInstance("org.mockito.internal.util.reflection.GenericMetadataSupport$TypeVariableReturnType");
        TypeVariableImpl typeVariable = ((TypeVariableImpl) createInstance("sun.reflect.generics.reflectiveObjects.TypeVariableImpl"));
        setField(typeVariableReturnType, "org.mockito.internal.util.reflection.GenericMetadataSupport$TypeVariableReturnType", "typeVariable", typeVariable);
        Class rawType = Object.class;
        setField(typeVariableReturnType, "org.mockito.internal.util.reflection.GenericMetadataSupport$TypeVariableReturnType", "rawType", rawType);
        
        /* This test fails because method [org.mockito.internal.stubbing.defaultanswers.ReturnsDeepStubs.createNewDeepStubMock] produces [java.lang.NullPointerException] */
        Class returnsDeepStubsClazz = Class.forName("org.mockito.internal.stubbing.defaultanswers.ReturnsDeepStubs");
        Class typeVariableReturnTypeType = Class.forName("org.mockito.internal.util.reflection.GenericMetadataSupport");
        Method createNewDeepStubMockMethod = returnsDeepStubsClazz.getDeclaredMethod("createNewDeepStubMock", typeVariableReturnTypeType);
        createNewDeepStubMockMethod.setAccessible(true);
        java.lang.Object[] createNewDeepStubMockMethodArguments = new java.lang.Object[1];
        createNewDeepStubMockMethodArguments[0] = typeVariableReturnType;
        try {
            createNewDeepStubMockMethod.invoke(returnsDeepStubs, createNewDeepStubMockMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link ReturnsDeepStubs}
 * @utbot.methodUnderTest {@link org.mockito.internal.stubbing.defaultanswers.ReturnsDeepStubs#createNewDeepStubMock(org.mockito.internal.util.reflection.GenericMetadataSupport)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: returnTypeGenericMetadata.rawType()
 *  */
    @Test
    public void testCreateNewDeepStubMock_ThrowNullPointerException_2() throws Throwable  {
        ReturnsDeepStubs returnsDeepStubs = ((ReturnsDeepStubs) createInstance("org.mockito.internal.stubbing.defaultanswers.ReturnsDeepStubs"));
        Object typeVariableReturnType = createInstance("org.mockito.internal.util.reflection.GenericMetadataSupport$TypeVariableReturnType");
        TypeVariableImpl typeVariable = ((TypeVariableImpl) createInstance("sun.reflect.generics.reflectiveObjects.TypeVariableImpl"));
        setField(typeVariableReturnType, "org.mockito.internal.util.reflection.GenericMetadataSupport$TypeVariableReturnType", "typeVariable", typeVariable);
        
        /* This test fails because method [org.mockito.internal.stubbing.defaultanswers.ReturnsDeepStubs.createNewDeepStubMock] produces [java.lang.NullPointerException] */
        Class returnsDeepStubsClazz = Class.forName("org.mockito.internal.stubbing.defaultanswers.ReturnsDeepStubs");
        Class typeVariableReturnTypeType = Class.forName("org.mockito.internal.util.reflection.GenericMetadataSupport");
        Method createNewDeepStubMockMethod = returnsDeepStubsClazz.getDeclaredMethod("createNewDeepStubMock", typeVariableReturnTypeType);
        createNewDeepStubMockMethod.setAccessible(true);
        java.lang.Object[] createNewDeepStubMockMethodArguments = new java.lang.Object[1];
        createNewDeepStubMockMethodArguments[0] = typeVariableReturnType;
        try {
            createNewDeepStubMockMethod.invoke(returnsDeepStubs, createNewDeepStubMockMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region Errors report for createNewDeepStubMock
    
    public void testCreateNewDeepStubMock_errors()
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
    
    ///region OTHER: ERROR SUITE for method actualParameterizedType(java.lang.Object)
    
    @Test
    public void testActualParameterizedType1() {
        ReturnsDeepStubs returnsDeepStubs = new ReturnsDeepStubs();
        Object object = new Object();
        
        /* This test fails because method [org.mockito.internal.stubbing.defaultanswers.ReturnsDeepStubs.actualParameterizedType] produces [org.mockito.exceptions.misusing.NotAMockException: Argument should be a mock, but is: class java.lang.Object] */
        returnsDeepStubs.actualParameterizedType(object);
    }
    
    @Test
    public void testActualParameterizedType2() {
        ReturnsDeepStubs returnsDeepStubs = new ReturnsDeepStubs();
        Object object = new Object();
        
        /* This test fails because method [org.mockito.internal.stubbing.defaultanswers.ReturnsDeepStubs.actualParameterizedType] produces [org.mockito.exceptions.misusing.NotAMockException: Argument should be a mock, but is: class java.lang.Object] */
        returnsDeepStubs.actualParameterizedType(object);
    }
    
    @Test
    public void testActualParameterizedType3() {
        ReturnsDeepStubs returnsDeepStubs = new ReturnsDeepStubs();
        Object object = new Object();
        
        /* This test fails because method [org.mockito.internal.stubbing.defaultanswers.ReturnsDeepStubs.actualParameterizedType] produces [org.mockito.exceptions.misusing.NotAMockException: Argument should be a mock, but is: class java.lang.Object] */
        returnsDeepStubs.actualParameterizedType(object);
    }
    
    @Test
    public void testActualParameterizedType4() {
        ReturnsDeepStubs returnsDeepStubs = new ReturnsDeepStubs();
        Object object = new Object();
        
        /* This test fails because method [org.mockito.internal.stubbing.defaultanswers.ReturnsDeepStubs.actualParameterizedType] produces [org.mockito.exceptions.misusing.NotAMockException: Argument should be a mock, but is: class java.lang.Object] */
        returnsDeepStubs.actualParameterizedType(object);
    }
    
    @Test
    public void testActualParameterizedType5() {
        ReturnsDeepStubs returnsDeepStubs = new ReturnsDeepStubs();
        Object object = new Object();
        
        /* This test fails because method [org.mockito.internal.stubbing.defaultanswers.ReturnsDeepStubs.actualParameterizedType] produces [org.mockito.exceptions.misusing.NotAMockException: Argument should be a mock, but is: class java.lang.Object] */
        returnsDeepStubs.actualParameterizedType(object);
    }
    
    @Test
    public void testActualParameterizedType6() {
        ReturnsDeepStubs returnsDeepStubs = new ReturnsDeepStubs();
        Object object = new Object();
        
        /* This test fails because method [org.mockito.internal.stubbing.defaultanswers.ReturnsDeepStubs.actualParameterizedType] produces [org.mockito.exceptions.misusing.NotAMockException: Argument should be a mock, but is: class java.lang.Object] */
        returnsDeepStubs.actualParameterizedType(object);
    }
    
    @Test
    public void testActualParameterizedType7() {
        ReturnsDeepStubs returnsDeepStubs = new ReturnsDeepStubs();
        Object object = new Object();
        
        /* This test fails because method [org.mockito.internal.stubbing.defaultanswers.ReturnsDeepStubs.actualParameterizedType] produces [org.mockito.exceptions.misusing.NotAMockException: Argument should be a mock, but is: class java.lang.Object] */
        returnsDeepStubs.actualParameterizedType(object);
    }
    
    @Test
    public void testActualParameterizedType8() {
        ReturnsDeepStubs returnsDeepStubs = new ReturnsDeepStubs();
        Object object = new Object();
        
        /* This test fails because method [org.mockito.internal.stubbing.defaultanswers.ReturnsDeepStubs.actualParameterizedType] produces [org.mockito.exceptions.misusing.NotAMockException: Argument should be a mock, but is: class java.lang.Object] */
        returnsDeepStubs.actualParameterizedType(object);
    }
    
    @Test
    public void testActualParameterizedType9() {
        ReturnsDeepStubs returnsDeepStubs = new ReturnsDeepStubs();
        Object object = new Object();
        
        /* This test fails because method [org.mockito.internal.stubbing.defaultanswers.ReturnsDeepStubs.actualParameterizedType] produces [org.mockito.exceptions.misusing.NotAMockException: Argument should be a mock, but is: class java.lang.Object] */
        returnsDeepStubs.actualParameterizedType(object);
    }
    ///endregion
    
    ///region Errors report for actualParameterizedType
    
    public void testActualParameterizedType_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 2 occurrences of:
        // Concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.mockito.internal.stubbing.defaultanswers.ReturnsDeepStubs.getMock
    
    ///region Errors report for getMock
    
    public void testGetMock_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 18 occurrences of:
        // Concrete execution failed
        
        // 2 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.mockito.internal.stubbing.defaultanswers.ReturnsDeepStubs.recordDeepStubMock
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method recordDeepStubMock(java.lang.Object, org.mockito.internal.stubbing.InvocationContainerImpl)
    
    /**
    @utbot.classUnderTest {@link ReturnsDeepStubs}
 * @utbot.methodUnderTest {@link org.mockito.internal.stubbing.defaultanswers.ReturnsDeepStubs#recordDeepStubMock(java.lang.Object,org.mockito.internal.stubbing.InvocationContainerImpl)}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} 
 *  */
    @Test
    public void testRecordDeepStubMock_ThrowIndexOutOfBoundsException() throws Throwable  {
        Class threadSafeMockingProgressClazz = Class.forName("org.mockito.internal.progress.ThreadSafeMockingProgress");
        ThreadLocal prevMockingProgress = ((ThreadLocal) getStaticFieldValue(threadSafeMockingProgressClazz, "mockingProgress"));
        try {
            Object mockingProgress = createInstance("java.lang.ThreadLocal$SuppliedThreadLocal");
            setField(mockingProgress, "java.lang.ThreadLocal", "threadLocalHashCode", Integer.MIN_VALUE);
            setStaticField(threadSafeMockingProgressClazz, "mockingProgress", mockingProgress);
            ReturnsDeepStubs returnsDeepStubs = new ReturnsDeepStubs();
            InvocationContainerImpl invocationContainerImpl = ((InvocationContainerImpl) createInstance("org.mockito.internal.stubbing.InvocationContainerImpl"));
            ThreadSafeMockingProgress mockingProgress1 = ((ThreadSafeMockingProgress) createInstance("org.mockito.internal.progress.ThreadSafeMockingProgress"));
            setField(invocationContainerImpl, "org.mockito.internal.stubbing.InvocationContainerImpl", "mockingProgress", mockingProgress1);
            InvocationMatcher invocationForStubbing = ((InvocationMatcher) createInstance("org.mockito.internal.invocation.InvocationMatcher"));
            InvocationImpl invocation = ((InvocationImpl) createInstance("org.mockito.internal.invocation.InvocationImpl"));
            setField(invocationForStubbing, "org.mockito.internal.invocation.InvocationMatcher", "invocation", invocation);
            setField(invocationContainerImpl, "org.mockito.internal.stubbing.InvocationContainerImpl", "invocationForStubbing", invocationForStubbing);
            
            /* This test fails because method [org.mockito.internal.stubbing.defaultanswers.ReturnsDeepStubs.recordDeepStubMock] produces [java.lang.IndexOutOfBoundsException: Less than zero] */
            Class returnsDeepStubsClazz = Class.forName("org.mockito.internal.stubbing.defaultanswers.ReturnsDeepStubs");
            Class objectType = Class.forName("java.lang.Object");
            Class invocationContainerImplType = Class.forName("org.mockito.internal.stubbing.InvocationContainerImpl");
            Method recordDeepStubMockMethod = returnsDeepStubsClazz.getDeclaredMethod("recordDeepStubMock", objectType, invocationContainerImplType);
            recordDeepStubMockMethod.setAccessible(true);
            java.lang.Object[] recordDeepStubMockMethodArguments = new java.lang.Object[2];
            recordDeepStubMockMethodArguments[0] = ((Object) null);
            recordDeepStubMockMethodArguments[1] = invocationContainerImpl;
            try {
                recordDeepStubMockMethod.invoke(returnsDeepStubs, recordDeepStubMockMethodArguments);
            } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
        } finally {
            setStaticField(ThreadSafeMockingProgress.class, "mockingProgress", prevMockingProgress);
        }
    }
    
    /**
    @utbot.classUnderTest {@link ReturnsDeepStubs}
 * @utbot.methodUnderTest {@link org.mockito.internal.stubbing.defaultanswers.ReturnsDeepStubs#recordDeepStubMock(java.lang.Object,org.mockito.internal.stubbing.InvocationContainerImpl)}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} 
 *  */
    @Test
    public void testRecordDeepStubMock_ThrowIndexOutOfBoundsException_1() throws Throwable  {
        Class threadSafeMockingProgressClazz = Class.forName("org.mockito.internal.progress.ThreadSafeMockingProgress");
        ThreadLocal prevMockingProgress = ((ThreadLocal) getStaticFieldValue(threadSafeMockingProgressClazz, "mockingProgress"));
        try {
            Object mockingProgress = createInstance("java.lang.ThreadLocal$SuppliedThreadLocal");
            setStaticField(threadSafeMockingProgressClazz, "mockingProgress", mockingProgress);
            ReturnsDeepStubs returnsDeepStubs = new ReturnsDeepStubs();
            InvocationContainerImpl invocationContainerImpl = ((InvocationContainerImpl) createInstance("org.mockito.internal.stubbing.InvocationContainerImpl"));
            ThreadSafeMockingProgress mockingProgress1 = ((ThreadSafeMockingProgress) createInstance("org.mockito.internal.progress.ThreadSafeMockingProgress"));
            setField(invocationContainerImpl, "org.mockito.internal.stubbing.InvocationContainerImpl", "mockingProgress", mockingProgress1);
            InvocationMatcher invocationForStubbing = ((InvocationMatcher) createInstance("org.mockito.internal.invocation.InvocationMatcher"));
            InvocationImpl invocation = ((InvocationImpl) createInstance("org.mockito.internal.invocation.InvocationImpl"));
            setField(invocationForStubbing, "org.mockito.internal.invocation.InvocationMatcher", "invocation", invocation);
            setField(invocationContainerImpl, "org.mockito.internal.stubbing.InvocationContainerImpl", "invocationForStubbing", invocationForStubbing);
            
            /* This test fails because method [org.mockito.internal.stubbing.defaultanswers.ReturnsDeepStubs.recordDeepStubMock] produces [java.lang.IndexOutOfBoundsException: Greater or equal than length] */
            Class returnsDeepStubsClazz = Class.forName("org.mockito.internal.stubbing.defaultanswers.ReturnsDeepStubs");
            Class objectType = Class.forName("java.lang.Object");
            Class invocationContainerImplType = Class.forName("org.mockito.internal.stubbing.InvocationContainerImpl");
            Method recordDeepStubMockMethod = returnsDeepStubsClazz.getDeclaredMethod("recordDeepStubMock", objectType, invocationContainerImplType);
            recordDeepStubMockMethod.setAccessible(true);
            java.lang.Object[] recordDeepStubMockMethodArguments = new java.lang.Object[2];
            recordDeepStubMockMethodArguments[0] = ((Object) null);
            recordDeepStubMockMethodArguments[1] = invocationContainerImpl;
            try {
                recordDeepStubMockMethod.invoke(returnsDeepStubs, recordDeepStubMockMethodArguments);
            } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
        } finally {
            setStaticField(ThreadSafeMockingProgress.class, "mockingProgress", prevMockingProgress);
        }
    }
    
    /**
    @utbot.classUnderTest {@link ReturnsDeepStubs}
 * @utbot.methodUnderTest {@link org.mockito.internal.stubbing.defaultanswers.ReturnsDeepStubs#recordDeepStubMock(java.lang.Object,org.mockito.internal.stubbing.InvocationContainerImpl)}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} 
 *  */
    @Test
    public void testRecordDeepStubMock_ThrowIndexOutOfBoundsException_2() throws Throwable  {
        Class threadSafeMockingProgressClazz = Class.forName("org.mockito.internal.progress.ThreadSafeMockingProgress");
        ThreadLocal prevMockingProgress = ((ThreadLocal) getStaticFieldValue(threadSafeMockingProgressClazz, "mockingProgress"));
        try {
            TerminatingThreadLocal mockingProgress = ((TerminatingThreadLocal) createInstance("jdk.internal.misc.TerminatingThreadLocal"));
            setField(mockingProgress, "java.lang.ThreadLocal", "threadLocalHashCode", Integer.MIN_VALUE);
            setStaticField(threadSafeMockingProgressClazz, "mockingProgress", mockingProgress);
            ReturnsDeepStubs returnsDeepStubs = new ReturnsDeepStubs();
            InvocationContainerImpl invocationContainerImpl = ((InvocationContainerImpl) createInstance("org.mockito.internal.stubbing.InvocationContainerImpl"));
            ThreadSafeMockingProgress mockingProgress1 = ((ThreadSafeMockingProgress) createInstance("org.mockito.internal.progress.ThreadSafeMockingProgress"));
            setField(invocationContainerImpl, "org.mockito.internal.stubbing.InvocationContainerImpl", "mockingProgress", mockingProgress1);
            InvocationMatcher invocationForStubbing = ((InvocationMatcher) createInstance("org.mockito.internal.invocation.InvocationMatcher"));
            InvocationImpl invocation = ((InvocationImpl) createInstance("org.mockito.internal.invocation.InvocationImpl"));
            setField(invocationForStubbing, "org.mockito.internal.invocation.InvocationMatcher", "invocation", invocation);
            setField(invocationContainerImpl, "org.mockito.internal.stubbing.InvocationContainerImpl", "invocationForStubbing", invocationForStubbing);
            
            /* This test fails because method [org.mockito.internal.stubbing.defaultanswers.ReturnsDeepStubs.recordDeepStubMock] produces [java.lang.IndexOutOfBoundsException: Less than zero] */
            Class returnsDeepStubsClazz = Class.forName("org.mockito.internal.stubbing.defaultanswers.ReturnsDeepStubs");
            Class objectType = Class.forName("java.lang.Object");
            Class invocationContainerImplType = Class.forName("org.mockito.internal.stubbing.InvocationContainerImpl");
            Method recordDeepStubMockMethod = returnsDeepStubsClazz.getDeclaredMethod("recordDeepStubMock", objectType, invocationContainerImplType);
            recordDeepStubMockMethod.setAccessible(true);
            java.lang.Object[] recordDeepStubMockMethodArguments = new java.lang.Object[2];
            recordDeepStubMockMethodArguments[0] = ((Object) null);
            recordDeepStubMockMethodArguments[1] = invocationContainerImpl;
            try {
                recordDeepStubMockMethod.invoke(returnsDeepStubs, recordDeepStubMockMethodArguments);
            } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
        } finally {
            setStaticField(ThreadSafeMockingProgress.class, "mockingProgress", prevMockingProgress);
        }
    }
    
    /**
    @utbot.classUnderTest {@link ReturnsDeepStubs}
 * @utbot.methodUnderTest {@link org.mockito.internal.stubbing.defaultanswers.ReturnsDeepStubs#recordDeepStubMock(java.lang.Object,org.mockito.internal.stubbing.InvocationContainerImpl)}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} 
 *  */
    @Test
    public void testRecordDeepStubMock_ThrowIndexOutOfBoundsException_3() throws Throwable  {
        Class threadSafeMockingProgressClazz = Class.forName("org.mockito.internal.progress.ThreadSafeMockingProgress");
        ThreadLocal prevMockingProgress = ((ThreadLocal) getStaticFieldValue(threadSafeMockingProgressClazz, "mockingProgress"));
        try {
            TerminatingThreadLocal mockingProgress = ((TerminatingThreadLocal) createInstance("jdk.internal.misc.TerminatingThreadLocal"));
            setStaticField(threadSafeMockingProgressClazz, "mockingProgress", mockingProgress);
            ReturnsDeepStubs returnsDeepStubs = new ReturnsDeepStubs();
            InvocationContainerImpl invocationContainerImpl = ((InvocationContainerImpl) createInstance("org.mockito.internal.stubbing.InvocationContainerImpl"));
            ThreadSafeMockingProgress mockingProgress1 = ((ThreadSafeMockingProgress) createInstance("org.mockito.internal.progress.ThreadSafeMockingProgress"));
            setField(invocationContainerImpl, "org.mockito.internal.stubbing.InvocationContainerImpl", "mockingProgress", mockingProgress1);
            InvocationMatcher invocationForStubbing = ((InvocationMatcher) createInstance("org.mockito.internal.invocation.InvocationMatcher"));
            InvocationImpl invocation = ((InvocationImpl) createInstance("org.mockito.internal.invocation.InvocationImpl"));
            setField(invocationForStubbing, "org.mockito.internal.invocation.InvocationMatcher", "invocation", invocation);
            setField(invocationContainerImpl, "org.mockito.internal.stubbing.InvocationContainerImpl", "invocationForStubbing", invocationForStubbing);
            
            /* This test fails because method [org.mockito.internal.stubbing.defaultanswers.ReturnsDeepStubs.recordDeepStubMock] produces [java.lang.IndexOutOfBoundsException: Greater or equal than length] */
            Class returnsDeepStubsClazz = Class.forName("org.mockito.internal.stubbing.defaultanswers.ReturnsDeepStubs");
            Class objectType = Class.forName("java.lang.Object");
            Class invocationContainerImplType = Class.forName("org.mockito.internal.stubbing.InvocationContainerImpl");
            Method recordDeepStubMockMethod = returnsDeepStubsClazz.getDeclaredMethod("recordDeepStubMock", objectType, invocationContainerImplType);
            recordDeepStubMockMethod.setAccessible(true);
            java.lang.Object[] recordDeepStubMockMethodArguments = new java.lang.Object[2];
            recordDeepStubMockMethodArguments[0] = ((Object) null);
            recordDeepStubMockMethodArguments[1] = invocationContainerImpl;
            try {
                recordDeepStubMockMethod.invoke(returnsDeepStubs, recordDeepStubMockMethodArguments);
            } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
        } finally {
            setStaticField(ThreadSafeMockingProgress.class, "mockingProgress", prevMockingProgress);
        }
    }
    
    /**
    @utbot.classUnderTest {@link ReturnsDeepStubs}
 * @utbot.methodUnderTest {@link org.mockito.internal.stubbing.defaultanswers.ReturnsDeepStubs#recordDeepStubMock(java.lang.Object,org.mockito.internal.stubbing.InvocationContainerImpl)}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} 
 *  */
    @Test
    public void testRecordDeepStubMock_ThrowIndexOutOfBoundsException_4() throws Throwable  {
        Class threadSafeMockingProgressClazz = Class.forName("org.mockito.internal.progress.ThreadSafeMockingProgress");
        ThreadLocal prevMockingProgress = ((ThreadLocal) getStaticFieldValue(threadSafeMockingProgressClazz, "mockingProgress"));
        try {
            TerminatingThreadLocal mockingProgress = ((TerminatingThreadLocal) createInstance("jdk.internal.misc.TerminatingThreadLocal"));
            setStaticField(threadSafeMockingProgressClazz, "mockingProgress", mockingProgress);
            ReturnsDeepStubs returnsDeepStubs = new ReturnsDeepStubs();
            InvocationContainerImpl invocationContainerImpl = ((InvocationContainerImpl) createInstance("org.mockito.internal.stubbing.InvocationContainerImpl"));
            ThreadSafeMockingProgress mockingProgress1 = ((ThreadSafeMockingProgress) createInstance("org.mockito.internal.progress.ThreadSafeMockingProgress"));
            setField(invocationContainerImpl, "org.mockito.internal.stubbing.InvocationContainerImpl", "mockingProgress", mockingProgress1);
            InvocationMatcher invocationForStubbing = ((InvocationMatcher) createInstance("org.mockito.internal.invocation.InvocationMatcher"));
            InvocationImpl invocation = ((InvocationImpl) createInstance("org.mockito.internal.invocation.InvocationImpl"));
            setField(invocationForStubbing, "org.mockito.internal.invocation.InvocationMatcher", "invocation", invocation);
            setField(invocationContainerImpl, "org.mockito.internal.stubbing.InvocationContainerImpl", "invocationForStubbing", invocationForStubbing);
            
            /* This test fails because method [org.mockito.internal.stubbing.defaultanswers.ReturnsDeepStubs.recordDeepStubMock] produces [java.lang.IndexOutOfBoundsException: Greater or equal than length] */
            Class returnsDeepStubsClazz = Class.forName("org.mockito.internal.stubbing.defaultanswers.ReturnsDeepStubs");
            Class objectType = Class.forName("java.lang.Object");
            Class invocationContainerImplType = Class.forName("org.mockito.internal.stubbing.InvocationContainerImpl");
            Method recordDeepStubMockMethod = returnsDeepStubsClazz.getDeclaredMethod("recordDeepStubMock", objectType, invocationContainerImplType);
            recordDeepStubMockMethod.setAccessible(true);
            java.lang.Object[] recordDeepStubMockMethodArguments = new java.lang.Object[2];
            recordDeepStubMockMethodArguments[0] = ((Object) null);
            recordDeepStubMockMethodArguments[1] = invocationContainerImpl;
            try {
                recordDeepStubMockMethod.invoke(returnsDeepStubs, recordDeepStubMockMethodArguments);
            } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
        } finally {
            setStaticField(ThreadSafeMockingProgress.class, "mockingProgress", prevMockingProgress);
        }
    }
    ///endregion
    
    ///region Errors report for recordDeepStubMock
    
    public void testRecordDeepStubMock_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 14 occurrences of:
        // Field reflectionFactory is not declared in class java.lang.reflect.AccessibleObject
        
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
        // 10 occurrences of:
        // Default concrete execution failed
        
        // 1 occurrences of:
        // Could not initialize class org.mockito.Answers
        
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
        
                java.lang.reflect.Method methodForGetDeclaredFields1126318970828300 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields1126318970828300.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass1126318970843700 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1126318970828300.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1126318970843700).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
        modifiersField.setAccessible(true);
        modifiersField.setInt(field, field.getModifiers() & ~java.lang.reflect.Modifier.FINAL);
    
        field.setAccessible(true);
        field.set(object, fieldValue);
    }
    
    private static Object getStaticFieldValue(Class<?> clazz, String fieldName) throws IllegalAccessException, NoSuchFieldException {
        java.lang.reflect.Field field;
        Class<?> originClass = clazz;
        do {
            try {
                field = clazz.getDeclaredField(fieldName);
                field.setAccessible(true);
                
                java.lang.reflect.Field modifiersField;
                
            java.lang.reflect.Method methodForGetDeclaredFields1126318971876400 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields1126318971876400.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass1126318971885500 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1126318971876400.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1126318971885500).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields1126318973391100 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields1126318973391100.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass1126318973397600 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1126318973391100.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1126318973397600).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
    
    private static Object getUnsafeInstance() throws ClassNotFoundException, NoSuchFieldException, IllegalAccessException {
        java.lang.reflect.Field f = Class.forName("sun.misc.Unsafe").getDeclaredField("theUnsafe");
        f.setAccessible(true);
        return f.get(null);
    }
    ///endregion
}

