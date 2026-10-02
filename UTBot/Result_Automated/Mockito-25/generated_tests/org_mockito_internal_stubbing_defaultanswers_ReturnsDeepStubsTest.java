package org.mockito.internal.stubbing.defaultanswers;

import org.junit.Test;
import org.mockito.internal.invocation.InvocationImpl;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

public final class org_mockito_internal_stubbing_defaultanswers_ReturnsDeepStubsTest {
    ///region Test suites for executable org.mockito.internal.stubbing.defaultanswers.ReturnsDeepStubs.getMock
    
    ///region Errors report for getMock
    
    public void testGetMock_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 68 occurrences of:
        // Concrete execution failed
        
        // 8 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.mockito.internal.stubbing.defaultanswers.ReturnsDeepStubs.recordDeepStubMock
    
    ///region Errors report for recordDeepStubMock
    
    public void testRecordDeepStubMock_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 74 occurrences of:
        // Concrete execution failed
        
        // 11 occurrences of:
        // Default concrete execution failed
        
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
    
    /**
     * @utbot.classUnderTest {@link org.mockito.internal.stubbing.defaultanswers.ReturnsDeepStubs}
     * @utbot.methodUnderTest {@link org.mockito.internal.stubbing.defaultanswers.ReturnsDeepStubs#actualParameterizedType(java.lang.Object)}
     */
    @Test
    public void testActualParameterizedTypeThrowsNAME2() {
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
    public void testActualParameterizedTypeThrowsNAME3() {
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
    public void testActualParameterizedTypeThrowsNAME4() {
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
    public void testActualParameterizedTypeThrowsNAME5() {
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
    public void testActualParameterizedTypeThrowsNAME6() {
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
    public void testActualParameterizedTypeThrowsNAME7() {
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
    public void testActualParameterizedTypeThrowsNAME8() {
        ReturnsDeepStubs returnsDeepStubs = new ReturnsDeepStubs();
        
        /* This test fails because method [org.mockito.internal.stubbing.defaultanswers.ReturnsDeepStubs.actualParameterizedType] produces [org.mockito.exceptions.misusing.NotAMockException: Argument should be a mock, but is null!] */
        returnsDeepStubs.actualParameterizedType(null);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method actualParameterizedType(java.lang.Object)
    
    @Test
    public void testActualParameterizedType1() throws Exception  {
        ReturnsDeepStubs returnsDeepStubs = new ReturnsDeepStubs();
        Object innocuousForkJoinWorkerThread = createInstance("java.util.concurrent.ForkJoinWorkerThread$InnocuousForkJoinWorkerThread");
        
        /* This test fails because method [org.mockito.internal.stubbing.defaultanswers.ReturnsDeepStubs.actualParameterizedType] produces [org.mockito.exceptions.misusing.NotAMockException: Argument should be a mock, but is: class java.util.concurrent.ForkJoinWorkerThread$InnocuousForkJoinWorkerThread] */
        returnsDeepStubs.actualParameterizedType(innocuousForkJoinWorkerThread);
    }
    
    @Test
    public void testActualParameterizedType2() {
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
        // 8 occurrences of:
        // Concrete execution failed
        
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
    
    ///region FUZZER: ERROR SUITE for method answer(org.mockito.invocation.InvocationOnMock)
    
    /**
     * @utbot.classUnderTest {@link org.mockito.internal.stubbing.defaultanswers.ReturnsDeepStubs}
     * @utbot.methodUnderTest {@link org.mockito.internal.stubbing.defaultanswers.ReturnsDeepStubs#answer(org.mockito.invocation.InvocationOnMock)}
     */
    @Test
    public void testAnswerThrowsNPE() throws Throwable  {
        ReturnsDeepStubs returnsDeepStubs = new ReturnsDeepStubs();
        
        /* This test fails because method [org.mockito.internal.stubbing.defaultanswers.ReturnsDeepStubs.answer] produces [java.lang.NullPointerException]
            org.mockito.internal.stubbing.defaultanswers.ReturnsDeepStubs.answer(ReturnsDeepStubs.java:52) */
        returnsDeepStubs.answer(null);
    }
    
    /**
     * @utbot.classUnderTest {@link org.mockito.internal.stubbing.defaultanswers.ReturnsDeepStubs}
     * @utbot.methodUnderTest {@link org.mockito.internal.stubbing.defaultanswers.ReturnsDeepStubs#answer(org.mockito.invocation.InvocationOnMock)}
     */
    @Test
    public void testAnswerThrowsNPE1() throws Throwable  {
        ReturnsDeepStubs returnsDeepStubs = new ReturnsDeepStubs();
        
        /* This test fails because method [org.mockito.internal.stubbing.defaultanswers.ReturnsDeepStubs.answer] produces [java.lang.NullPointerException]
            org.mockito.internal.stubbing.defaultanswers.ReturnsDeepStubs.answer(ReturnsDeepStubs.java:52) */
        returnsDeepStubs.answer(null);
    }
    
    /**
     * @utbot.classUnderTest {@link org.mockito.internal.stubbing.defaultanswers.ReturnsDeepStubs}
     * @utbot.methodUnderTest {@link org.mockito.internal.stubbing.defaultanswers.ReturnsDeepStubs#answer(org.mockito.invocation.InvocationOnMock)}
     */
    @Test
    public void testAnswerThrowsNPE2() throws Throwable  {
        ReturnsDeepStubs returnsDeepStubs = new ReturnsDeepStubs();
        
        /* This test fails because method [org.mockito.internal.stubbing.defaultanswers.ReturnsDeepStubs.answer] produces [java.lang.NullPointerException]
            org.mockito.internal.stubbing.defaultanswers.ReturnsDeepStubs.answer(ReturnsDeepStubs.java:52) */
        returnsDeepStubs.answer(null);
    }
    
    /**
     * @utbot.classUnderTest {@link org.mockito.internal.stubbing.defaultanswers.ReturnsDeepStubs}
     * @utbot.methodUnderTest {@link org.mockito.internal.stubbing.defaultanswers.ReturnsDeepStubs#answer(org.mockito.invocation.InvocationOnMock)}
     */
    @Test
    public void testAnswerThrowsNPE3() throws Throwable  {
        ReturnsDeepStubs returnsDeepStubs = new ReturnsDeepStubs();
        
        /* This test fails because method [org.mockito.internal.stubbing.defaultanswers.ReturnsDeepStubs.answer] produces [java.lang.NullPointerException]
            org.mockito.internal.stubbing.defaultanswers.ReturnsDeepStubs.answer(ReturnsDeepStubs.java:52) */
        returnsDeepStubs.answer(null);
    }
    
    /**
     * @utbot.classUnderTest {@link org.mockito.internal.stubbing.defaultanswers.ReturnsDeepStubs}
     * @utbot.methodUnderTest {@link org.mockito.internal.stubbing.defaultanswers.ReturnsDeepStubs#answer(org.mockito.invocation.InvocationOnMock)}
     */
    @Test
    public void testAnswerThrowsNPE4() throws Throwable  {
        ReturnsDeepStubs returnsDeepStubs = new ReturnsDeepStubs();
        
        /* This test fails because method [org.mockito.internal.stubbing.defaultanswers.ReturnsDeepStubs.answer] produces [java.lang.NullPointerException]
            org.mockito.internal.stubbing.defaultanswers.ReturnsDeepStubs.answer(ReturnsDeepStubs.java:52) */
        returnsDeepStubs.answer(null);
    }
    
    /**
     * @utbot.classUnderTest {@link org.mockito.internal.stubbing.defaultanswers.ReturnsDeepStubs}
     * @utbot.methodUnderTest {@link org.mockito.internal.stubbing.defaultanswers.ReturnsDeepStubs#answer(org.mockito.invocation.InvocationOnMock)}
     */
    @Test
    public void testAnswerThrowsNPE5() throws Throwable  {
        ReturnsDeepStubs returnsDeepStubs = new ReturnsDeepStubs();
        
        /* This test fails because method [org.mockito.internal.stubbing.defaultanswers.ReturnsDeepStubs.answer] produces [java.lang.NullPointerException]
            org.mockito.internal.stubbing.defaultanswers.ReturnsDeepStubs.answer(ReturnsDeepStubs.java:52) */
        returnsDeepStubs.answer(null);
    }
    
    /**
     * @utbot.classUnderTest {@link org.mockito.internal.stubbing.defaultanswers.ReturnsDeepStubs}
     * @utbot.methodUnderTest {@link org.mockito.internal.stubbing.defaultanswers.ReturnsDeepStubs#answer(org.mockito.invocation.InvocationOnMock)}
     */
    @Test
    public void testAnswerThrowsNPE6() throws Throwable  {
        ReturnsDeepStubs returnsDeepStubs = new ReturnsDeepStubs();
        
        /* This test fails because method [org.mockito.internal.stubbing.defaultanswers.ReturnsDeepStubs.answer] produces [java.lang.NullPointerException]
            org.mockito.internal.stubbing.defaultanswers.ReturnsDeepStubs.answer(ReturnsDeepStubs.java:52) */
        returnsDeepStubs.answer(null);
    }
    
    /**
     * @utbot.classUnderTest {@link org.mockito.internal.stubbing.defaultanswers.ReturnsDeepStubs}
     * @utbot.methodUnderTest {@link org.mockito.internal.stubbing.defaultanswers.ReturnsDeepStubs#answer(org.mockito.invocation.InvocationOnMock)}
     */
    @Test
    public void testAnswerThrowsNPE7() throws Throwable  {
        ReturnsDeepStubs returnsDeepStubs = new ReturnsDeepStubs();
        
        /* This test fails because method [org.mockito.internal.stubbing.defaultanswers.ReturnsDeepStubs.answer] produces [java.lang.NullPointerException]
            org.mockito.internal.stubbing.defaultanswers.ReturnsDeepStubs.answer(ReturnsDeepStubs.java:52) */
        returnsDeepStubs.answer(null);
    }
    
    /**
     * @utbot.classUnderTest {@link org.mockito.internal.stubbing.defaultanswers.ReturnsDeepStubs}
     * @utbot.methodUnderTest {@link org.mockito.internal.stubbing.defaultanswers.ReturnsDeepStubs#answer(org.mockito.invocation.InvocationOnMock)}
     */
    @Test
    public void testAnswerThrowsNPE8() throws Throwable  {
        ReturnsDeepStubs returnsDeepStubs = new ReturnsDeepStubs();
        
        /* This test fails because method [org.mockito.internal.stubbing.defaultanswers.ReturnsDeepStubs.answer] produces [java.lang.NullPointerException]
            org.mockito.internal.stubbing.defaultanswers.ReturnsDeepStubs.answer(ReturnsDeepStubs.java:52) */
        returnsDeepStubs.answer(null);
    }
    
    /**
     * @utbot.classUnderTest {@link org.mockito.internal.stubbing.defaultanswers.ReturnsDeepStubs}
     * @utbot.methodUnderTest {@link org.mockito.internal.stubbing.defaultanswers.ReturnsDeepStubs#answer(org.mockito.invocation.InvocationOnMock)}
     */
    @Test
    public void testAnswerThrowsNPE9() throws Throwable  {
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
        // 5 occurrences of:
        // Concrete execution failed
        
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
        
                java.lang.reflect.Method methodForGetDeclaredFields1126821292558700 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields1126821292558700.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass1126821292563100 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1126821292558700.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1126821292563100).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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

