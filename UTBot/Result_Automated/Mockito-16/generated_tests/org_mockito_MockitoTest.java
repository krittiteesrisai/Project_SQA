package org.mockito;

import org.junit.Test;
import org.mockito.internal.MockitoCore;
import org.mockito.exceptions.Reporter;
import org.mockito.internal.util.MockUtil;
import org.mockito.internal.util.CreationValidator;
import org.mockito.internal.progress.ThreadSafeMockingProgress;
import org.mockito.exceptions.misusing.NullInsteadOfMockException;
import jdk.internal.misc.TerminatingThreadLocal;
import org.mockito.internal.stubbing.StubberImpl;
import org.mockito.stubbing.Answer;
import org.mockito.internal.stubbing.defaultanswers.GloballyConfiguredAnswer;
import org.mockito.exceptions.base.MockitoException;
import org.mockito.internal.stubbing.answers.CallsRealMethods;
import org.junit.Ignore;
import org.mockito.exceptions.misusing.NotAMockException;
import org.mockito.internal.creation.MockSettingsImpl;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.lang.reflect.InvocationTargetException;

public final class org_mockito_MockitoTest {
    ///region Test suites for executable org.mockito.Mockito.debug
    
    ///region Errors report for debug
    
    public void testDebug_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 4 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.mockito.Mockito.reset
    
    ///region FUZZER: ERROR SUITE for method reset([Ljava.lang.Object;)
    
    /**
     * @utbot.classUnderTest {@link org.mockito.Mockito}
     * @utbot.methodUnderTest {@link org.mockito.Mockito#reset(java.lang.Object[])}
     */
    @Test
    public void testResetThrowsNAMEWithNonEmptyObjectArray() {
        java.lang.Object[] objectArray = new java.lang.Object[3];
        Object object = new Object();
        objectArray[0] = object;
        Object object1 = new Object();
        objectArray[1] = object1;
        Object object2 = new Object();
        objectArray[2] = object2;
        
        /* This test fails because method [org.mockito.Mockito.reset] produces [org.mockito.exceptions.misusing.NotAMockException: Argument should be a mock, but is: class java.lang.Object] */
        Mockito.reset(objectArray);
    }
    
    /**
     * @utbot.classUnderTest {@link org.mockito.Mockito}
     * @utbot.methodUnderTest {@link org.mockito.Mockito#reset(java.lang.Object[])}
     */
    @Test
    public void testResetThrowsUSEWithNonEmptyObjectArray() {
        java.lang.Object[] objectArray = new java.lang.Object[3];
        Object object = new Object();
        objectArray[0] = object;
        Object object1 = new Object();
        objectArray[1] = object1;
        Object object2 = new Object();
        objectArray[2] = object2;
        
        /* This test fails because method [org.mockito.Mockito.reset] produces [org.mockito.exceptions.misusing.UnfinishedStubbingException: 
        Unfinished stubbing detected here:
        -> at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
        
        E.g. thenReturn() may be missing.
        Examples of correct stubbing:
            when(mock.isOk()).thenReturn(true);
            when(mock.isOk()).thenThrow(exception);
            doThrow(exception).when(mock).someVoidMethod();
        Hints:
         1. missing thenReturn()
         2. you are trying to stub a final method, which is not supported
         3. you are stubbing the behaviour of another mock inside before 'thenReturn' instruction is completed
        ] */
        Mockito.reset(objectArray);
    }
    
    /**
     * @utbot.classUnderTest {@link org.mockito.Mockito}
     * @utbot.methodUnderTest {@link org.mockito.Mockito#reset(java.lang.Object[])}
     */
    @Test
    public void testResetThrowsUSEWithNonEmptyObjectArray1() {
        java.lang.Object[] objectArray = new java.lang.Object[2];
        Object object = new Object();
        objectArray[0] = object;
        Object object1 = new Object();
        objectArray[1] = object1;
        
        /* This test fails because method [org.mockito.Mockito.reset] produces [org.mockito.exceptions.misusing.UnfinishedStubbingException: 
        Unfinished stubbing detected here:
        -> at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
        
        E.g. thenReturn() may be missing.
        Examples of correct stubbing:
            when(mock.isOk()).thenReturn(true);
            when(mock.isOk()).thenThrow(exception);
            doThrow(exception).when(mock).someVoidMethod();
        Hints:
         1. missing thenReturn()
         2. you are trying to stub a final method, which is not supported
         3. you are stubbing the behaviour of another mock inside before 'thenReturn' instruction is completed
        ] */
        Mockito.reset(objectArray);
    }
    
    /**
     * @utbot.classUnderTest {@link org.mockito.Mockito}
     * @utbot.methodUnderTest {@link org.mockito.Mockito#reset(java.lang.Object[])}
     */
    @Test
    public void testResetThrowsUSEWithNonEmptyObjectArray2() {
        java.lang.Object[] objectArray = new java.lang.Object[3];
        Object object = new Object();
        objectArray[0] = object;
        Object object1 = new Object();
        objectArray[1] = object1;
        Object object2 = new Object();
        objectArray[2] = object2;
        
        /* This test fails because method [org.mockito.Mockito.reset] produces [org.mockito.exceptions.misusing.UnfinishedStubbingException: 
        Unfinished stubbing detected here:
        -> at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
        
        E.g. thenReturn() may be missing.
        Examples of correct stubbing:
            when(mock.isOk()).thenReturn(true);
            when(mock.isOk()).thenThrow(exception);
            doThrow(exception).when(mock).someVoidMethod();
        Hints:
         1. missing thenReturn()
         2. you are trying to stub a final method, which is not supported
         3. you are stubbing the behaviour of another mock inside before 'thenReturn' instruction is completed
        ] */
        Mockito.reset(objectArray);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.mockito.Mockito.verify
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method verify(java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link Mockito}
 * @utbot.methodUnderTest {@link org.mockito.Mockito#verify(java.lang.Object)}
 * @utbot.invokes {@link org.mockito.Mockito#times(int)}
 * @utbot.invokes {@link org.mockito.internal.MockitoCore#verify(java.lang.Object,org.mockito.internal.verification.api.VerificationMode)}
 * @utbot.throwsException {@link org.mockito.exceptions.misusing.NullInsteadOfMockException} in: return MOCKITO_CORE.verify(mock, times(1));
 *  */
    @Test(expected = NullInsteadOfMockException.class)
    public void testVerify_ThrowNullInsteadOfMockException() throws Exception  {
        Class mockitoClazz = Class.forName("org.mockito.Mockito");
        MockitoCore prevMOCKITO_CORE = ((MockitoCore) getStaticFieldValue(mockitoClazz, "MOCKITO_CORE"));
        try {
            MockitoCore mockitoCore = ((MockitoCore) createInstance("org.mockito.internal.MockitoCore"));
            Reporter reporter = ((Reporter) createInstance("org.mockito.exceptions.Reporter"));
            setField(mockitoCore, "org.mockito.internal.MockitoCore", "reporter", reporter);
            MockUtil mockUtil = ((MockUtil) createInstance("org.mockito.internal.util.MockUtil"));
            CreationValidator creationValidator = ((CreationValidator) createInstance("org.mockito.internal.util.CreationValidator"));
            setField(mockUtil, "org.mockito.internal.util.MockUtil", "creationValidator", creationValidator);
            setField(mockitoCore, "org.mockito.internal.MockitoCore", "mockUtil", mockUtil);
            ThreadSafeMockingProgress mockingProgress = ((ThreadSafeMockingProgress) createInstance("org.mockito.internal.progress.ThreadSafeMockingProgress"));
            setField(mockitoCore, "org.mockito.internal.MockitoCore", "mockingProgress", mockingProgress);
            setStaticField(mockitoClazz, "MOCKITO_CORE", mockitoCore);
            
            Mockito.verify(null);
        } finally {
            setStaticField(Mockito.class, "MOCKITO_CORE", prevMOCKITO_CORE);
        }
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method verify(java.lang.Object)
    
    /**
     * @utbot.classUnderTest {@link org.mockito.Mockito}
     * @utbot.methodUnderTest {@link org.mockito.Mockito#verify(java.lang.Object)}
     */
    @Test
    public void testVerifyThrowsNIOME() {
        /* This test fails because method [org.mockito.Mockito.verify] produces [org.mockito.exceptions.misusing.NullInsteadOfMockException: 
        Argument passed to verify() should be a mock but is null!
        Examples of correct verifications:
            verify(mock).someMethod();
            verify(mock, times(10)).someMethod();
            verify(mock, atLeastOnce()).someMethod();
            not: verify(mock.someMethod());
        Also, if you use @Mock annotation don't miss openMocks()] */
        Mockito.verify(null);
    }
    
    /**
     * @utbot.classUnderTest {@link org.mockito.Mockito}
     * @utbot.methodUnderTest {@link org.mockito.Mockito#verify(java.lang.Object)}
     */
    @Test
    public void testVerifyThrowsNIOME1() {
        /* This test fails because method [org.mockito.Mockito.verify] produces [org.mockito.exceptions.misusing.NullInsteadOfMockException: 
        Argument passed to verify() should be a mock but is null!
        Examples of correct verifications:
            verify(mock).someMethod();
            verify(mock, times(10)).someMethod();
            verify(mock, atLeastOnce()).someMethod();
            not: verify(mock.someMethod());
        Also, if you use @Mock annotation don't miss openMocks()] */
        Mockito.verify(null);
    }
    
    /**
     * @utbot.classUnderTest {@link org.mockito.Mockito}
     * @utbot.methodUnderTest {@link org.mockito.Mockito#verify(java.lang.Object)}
     */
    @Test
    public void testVerifyThrowsNIOME2() {
        /* This test fails because method [org.mockito.Mockito.verify] produces [org.mockito.exceptions.misusing.NullInsteadOfMockException: 
        Argument passed to verify() should be a mock but is null!
        Examples of correct verifications:
            verify(mock).someMethod();
            verify(mock, times(10)).someMethod();
            verify(mock, atLeastOnce()).someMethod();
            not: verify(mock.someMethod());
        Also, if you use @Mock annotation don't miss openMocks()] */
        Mockito.verify(null);
    }
    
    /**
     * @utbot.classUnderTest {@link org.mockito.Mockito}
     * @utbot.methodUnderTest {@link org.mockito.Mockito#verify(java.lang.Object)}
     */
    @Test
    public void testVerifyThrowsNAME() {
        Object object = new Object();
        
        /* This test fails because method [org.mockito.Mockito.verify] produces [org.mockito.exceptions.misusing.NotAMockException: 
        Argument passed to verify() is of type Object and is not a mock!
        Make sure you place the parenthesis correctly!
        See the examples of correct verifications:
            verify(mock).someMethod();
            verify(mock, times(10)).someMethod();
            verify(mock, atLeastOnce()).someMethod();] */
        Mockito.verify(object);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.mockito.Mockito.verify
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method verify(java.lang.Object, org.mockito.internal.verification.api.VerificationMode)
    
    /**
    @utbot.classUnderTest {@link Mockito}
 * @utbot.methodUnderTest {@link org.mockito.Mockito#verify(java.lang.Object,org.mockito.internal.verification.api.VerificationMode)}
 * @utbot.invokes {@link org.mockito.internal.MockitoCore#verify(java.lang.Object,org.mockito.internal.verification.api.VerificationMode)}
 * @utbot.throwsException {@link org.mockito.exceptions.misusing.NullInsteadOfMockException} in: return MOCKITO_CORE.verify(mock, mode);
 *  */
    @Test(expected = NullInsteadOfMockException.class)
    public void testVerify_ThrowNullInsteadOfMockException1() throws Exception  {
        Class mockitoClazz = Class.forName("org.mockito.Mockito");
        MockitoCore prevMOCKITO_CORE = ((MockitoCore) getStaticFieldValue(mockitoClazz, "MOCKITO_CORE"));
        try {
            MockitoCore mockitoCore = ((MockitoCore) createInstance("org.mockito.internal.MockitoCore"));
            Reporter reporter = ((Reporter) createInstance("org.mockito.exceptions.Reporter"));
            setField(mockitoCore, "org.mockito.internal.MockitoCore", "reporter", reporter);
            MockUtil mockUtil = ((MockUtil) createInstance("org.mockito.internal.util.MockUtil"));
            CreationValidator creationValidator = ((CreationValidator) createInstance("org.mockito.internal.util.CreationValidator"));
            setField(mockUtil, "org.mockito.internal.util.MockUtil", "creationValidator", creationValidator);
            setField(mockitoCore, "org.mockito.internal.MockitoCore", "mockUtil", mockUtil);
            ThreadSafeMockingProgress mockingProgress = ((ThreadSafeMockingProgress) createInstance("org.mockito.internal.progress.ThreadSafeMockingProgress"));
            setField(mockitoCore, "org.mockito.internal.MockitoCore", "mockingProgress", mockingProgress);
            setStaticField(mockitoClazz, "MOCKITO_CORE", mockitoCore);
            
            Mockito.verify(null, null);
        } finally {
            setStaticField(Mockito.class, "MOCKITO_CORE", prevMOCKITO_CORE);
        }
    }
    ///endregion
    
    ///region Errors report for verify
    
    public void testVerify_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 4 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.mockito.Mockito.when
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method when(java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link Mockito}
 * @utbot.methodUnderTest {@link org.mockito.Mockito#when(java.lang.Object)}
 * @utbot.invokes {@link org.mockito.internal.MockitoCore#when(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: return MOCKITO_CORE.when(methodCall);
 *  */
    @Test
    public void testWhen_ThrowIndexOutOfBoundsException() throws Exception  {
        Class mockitoClazz = Class.forName("org.mockito.Mockito");
        MockitoCore prevMOCKITO_CORE = ((MockitoCore) getStaticFieldValue(mockitoClazz, "MOCKITO_CORE"));
        Class threadSafeMockingProgressClazz = Class.forName("org.mockito.internal.progress.ThreadSafeMockingProgress");
        ThreadLocal prevMockingProgress = ((ThreadLocal) getStaticFieldValue(threadSafeMockingProgressClazz, "mockingProgress"));
        try {
            MockitoCore mockitoCore = ((MockitoCore) createInstance("org.mockito.internal.MockitoCore"));
            Reporter reporter = ((Reporter) createInstance("org.mockito.exceptions.Reporter"));
            setField(mockitoCore, "org.mockito.internal.MockitoCore", "reporter", reporter);
            MockUtil mockUtil = ((MockUtil) createInstance("org.mockito.internal.util.MockUtil"));
            CreationValidator creationValidator = ((CreationValidator) createInstance("org.mockito.internal.util.CreationValidator"));
            setField(mockUtil, "org.mockito.internal.util.MockUtil", "creationValidator", creationValidator);
            setField(mockitoCore, "org.mockito.internal.MockitoCore", "mockUtil", mockUtil);
            ThreadSafeMockingProgress mockingProgress = ((ThreadSafeMockingProgress) createInstance("org.mockito.internal.progress.ThreadSafeMockingProgress"));
            setField(mockitoCore, "org.mockito.internal.MockitoCore", "mockingProgress", mockingProgress);
            setStaticField(mockitoClazz, "MOCKITO_CORE", mockitoCore);
            TerminatingThreadLocal mockingProgress1 = ((TerminatingThreadLocal) createInstance("jdk.internal.misc.TerminatingThreadLocal"));
            setField(mockingProgress1, "java.lang.ThreadLocal", "threadLocalHashCode", Integer.MIN_VALUE);
            setStaticField(threadSafeMockingProgressClazz, "mockingProgress", mockingProgress1);
            
            /* This test fails because method [org.mockito.Mockito.when] produces [java.lang.IndexOutOfBoundsException: Less than zero] */
            Mockito.when(null);
        } finally {
            setStaticField(Mockito.class, "MOCKITO_CORE", prevMOCKITO_CORE);
            setStaticField(ThreadSafeMockingProgress.class, "mockingProgress", prevMockingProgress);
        }
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method when(java.lang.Object)
    
    /**
     * @utbot.classUnderTest {@link org.mockito.Mockito}
     * @utbot.methodUnderTest {@link org.mockito.Mockito#when(java.lang.Object)}
     */
    @Test
    public void testWhenThrowsMMIE() {
        /* This test fails because method [org.mockito.Mockito.when] produces [org.mockito.exceptions.misusing.MissingMethodInvocationException: 
        when() requires an argument which has to be 'a method call on a mock'.
        For example:
            when(mock.getArticles()).thenReturn(articles);
        
        Also, this error might show up because:
        1. you stub either of: final/private/equals()/hashCode() methods.
           Those methods *cannot* be stubbed/verified.
           Mocking methods declared on non-public parent classes is not supported.
        2. inside when() you don't call method on mock but on some other object.
        ] */
        Mockito.when(null);
    }
    
    /**
     * @utbot.classUnderTest {@link org.mockito.Mockito}
     * @utbot.methodUnderTest {@link org.mockito.Mockito#when(java.lang.Object)}
     */
    @Test
    public void testWhenThrowsMMIE1() {
        /* This test fails because method [org.mockito.Mockito.when] produces [org.mockito.exceptions.misusing.MissingMethodInvocationException: 
        when() requires an argument which has to be 'a method call on a mock'.
        For example:
            when(mock.getArticles()).thenReturn(articles);
        
        Also, this error might show up because:
        1. you stub either of: final/private/equals()/hashCode() methods.
           Those methods *cannot* be stubbed/verified.
           Mocking methods declared on non-public parent classes is not supported.
        2. inside when() you don't call method on mock but on some other object.
        ] */
        Mockito.when(null);
    }
    
    /**
     * @utbot.classUnderTest {@link org.mockito.Mockito}
     * @utbot.methodUnderTest {@link org.mockito.Mockito#when(java.lang.Object)}
     */
    @Test
    public void testWhenThrowsMMIE2() {
        /* This test fails because method [org.mockito.Mockito.when] produces [org.mockito.exceptions.misusing.MissingMethodInvocationException: 
        when() requires an argument which has to be 'a method call on a mock'.
        For example:
            when(mock.getArticles()).thenReturn(articles);
        
        Also, this error might show up because:
        1. you stub either of: final/private/equals()/hashCode() methods.
           Those methods *cannot* be stubbed/verified.
           Mocking methods declared on non-public parent classes is not supported.
        2. inside when() you don't call method on mock but on some other object.
        ] */
        Mockito.when(null);
    }
    
    /**
     * @utbot.classUnderTest {@link org.mockito.Mockito}
     * @utbot.methodUnderTest {@link org.mockito.Mockito#when(java.lang.Object)}
     */
    @Test
    public void testWhenThrowsMMIE3() {
        Object object = new Object();
        
        /* This test fails because method [org.mockito.Mockito.when] produces [org.mockito.exceptions.misusing.MissingMethodInvocationException: 
        when() requires an argument which has to be 'a method call on a mock'.
        For example:
            when(mock.getArticles()).thenReturn(articles);
        
        Also, this error might show up because:
        1. you stub either of: final/private/equals()/hashCode() methods.
           Those methods *cannot* be stubbed/verified.
           Mocking methods declared on non-public parent classes is not supported.
        2. inside when() you don't call method on mock but on some other object.
        ] */
        Mockito.when(object);
    }
    ///endregion
    
    ///region Errors report for when
    
    public void testWhen_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Field reflectionFactory is not declared in class java.lang.reflect.AccessibleObject
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.mockito.Mockito.times
    
    ///region Errors report for times
    
    public void testTimes_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 6 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.mockito.Mockito.doNothing
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method doNothing()
    
    /**
    @utbot.classUnderTest {@link Mockito}
 * @utbot.methodUnderTest {@link org.mockito.Mockito#doNothing()}
 * @utbot.invokes {@link org.mockito.internal.MockitoCore#doAnswer(org.mockito.stubbing.Answer)}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: return MOCKITO_CORE.doAnswer(new DoesNothing());
 *  */
    @Test
    public void testDoNothing_ThrowIndexOutOfBoundsException() throws Exception  {
        Class mockitoClazz = Class.forName("org.mockito.Mockito");
        MockitoCore prevMOCKITO_CORE = ((MockitoCore) getStaticFieldValue(mockitoClazz, "MOCKITO_CORE"));
        Class threadSafeMockingProgressClazz = Class.forName("org.mockito.internal.progress.ThreadSafeMockingProgress");
        ThreadLocal prevMockingProgress = ((ThreadLocal) getStaticFieldValue(threadSafeMockingProgressClazz, "mockingProgress"));
        try {
            MockitoCore mockitoCore = ((MockitoCore) createInstance("org.mockito.internal.MockitoCore"));
            Reporter reporter = ((Reporter) createInstance("org.mockito.exceptions.Reporter"));
            setField(mockitoCore, "org.mockito.internal.MockitoCore", "reporter", reporter);
            MockUtil mockUtil = ((MockUtil) createInstance("org.mockito.internal.util.MockUtil"));
            CreationValidator creationValidator = ((CreationValidator) createInstance("org.mockito.internal.util.CreationValidator"));
            setField(mockUtil, "org.mockito.internal.util.MockUtil", "creationValidator", creationValidator);
            setField(mockitoCore, "org.mockito.internal.MockitoCore", "mockUtil", mockUtil);
            ThreadSafeMockingProgress mockingProgress = ((ThreadSafeMockingProgress) createInstance("org.mockito.internal.progress.ThreadSafeMockingProgress"));
            setField(mockitoCore, "org.mockito.internal.MockitoCore", "mockingProgress", mockingProgress);
            setStaticField(mockitoClazz, "MOCKITO_CORE", mockitoCore);
            TerminatingThreadLocal mockingProgress1 = ((TerminatingThreadLocal) createInstance("jdk.internal.misc.TerminatingThreadLocal"));
            setField(mockingProgress1, "java.lang.ThreadLocal", "threadLocalHashCode", Integer.MIN_VALUE);
            setStaticField(threadSafeMockingProgressClazz, "mockingProgress", mockingProgress1);
            
            /* This test fails because method [org.mockito.Mockito.doNothing] produces [java.lang.IndexOutOfBoundsException: Less than zero] */
            Mockito.doNothing();
        } finally {
            setStaticField(Mockito.class, "MOCKITO_CORE", prevMOCKITO_CORE);
            setStaticField(ThreadSafeMockingProgress.class, "mockingProgress", prevMockingProgress);
        }
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method doNothing()
    
    /**
     * @utbot.classUnderTest {@link org.mockito.Mockito}
     * @utbot.methodUnderTest {@link org.mockito.Mockito#doNothing()}
     */
    @Test
    public void testDoNothing() {
        StubberImpl actual = ((StubberImpl) Mockito.doNothing());
        
        StubberImpl expected = new StubberImpl();
        
    }
    
    /**
     * @utbot.classUnderTest {@link org.mockito.Mockito}
     * @utbot.methodUnderTest {@link org.mockito.Mockito#doNothing()}
     */
    @Test
    public void testDoNothing1() {
        StubberImpl actual = ((StubberImpl) Mockito.doNothing());
        
        StubberImpl expected = new StubberImpl();
        
    }
    
    /**
     * @utbot.classUnderTest {@link org.mockito.Mockito}
     * @utbot.methodUnderTest {@link org.mockito.Mockito#doNothing()}
     */
    @Test
    public void testDoNothing2() {
        StubberImpl actual = ((StubberImpl) Mockito.doNothing());
        
        StubberImpl expected = new StubberImpl();
        
    }
    
    /**
     * @utbot.classUnderTest {@link org.mockito.Mockito}
     * @utbot.methodUnderTest {@link org.mockito.Mockito#doNothing()}
     */
    @Test
    public void testDoNothing3() {
        StubberImpl actual = ((StubberImpl) Mockito.doNothing());
        
        StubberImpl expected = new StubberImpl();
        
    }
    ///endregion
    
    ///region Errors report for doNothing
    
    public void testDoNothing_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 3 occurrences of:
        // Field reflectionFactory is not declared in class java.lang.reflect.AccessibleObject
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.mockito.Mockito.mock
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method mock(java.lang.Class)
    
    /**
    @utbot.classUnderTest {@link Mockito}
 * @utbot.methodUnderTest {@link org.mockito.Mockito#mock(java.lang.Class)}
 * @utbot.invokes {@link org.mockito.Mockito#withSettings()}
 * @utbot.invokes {@link org.mockito.MockSettings#defaultAnswer(org.mockito.stubbing.Answer)}
 * @utbot.invokes {@link org.mockito.Mockito#mock(java.lang.Class,org.mockito.MockSettings)}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: return mock(classToMock, withSettings().defaultAnswer(RETURNS_DEFAULTS));
 *  */
    @Test
    public void testMock_ThrowIndexOutOfBoundsException() throws Exception  {
        Answer prevRETURNS_DEFAULTS = Mockito.RETURNS_DEFAULTS;
        Class mockitoClazz = Class.forName("org.mockito.Mockito");
        MockitoCore prevMOCKITO_CORE = ((MockitoCore) getStaticFieldValue(mockitoClazz, "MOCKITO_CORE"));
        Class threadSafeMockingProgressClazz = Class.forName("org.mockito.internal.progress.ThreadSafeMockingProgress");
        ThreadLocal prevMockingProgress = ((ThreadLocal) getStaticFieldValue(threadSafeMockingProgressClazz, "mockingProgress"));
        try {
            GloballyConfiguredAnswer returnsDefaults = new GloballyConfiguredAnswer();
            setStaticField(mockitoClazz, "RETURNS_DEFAULTS", returnsDefaults);
            MockitoCore mockitoCore = ((MockitoCore) createInstance("org.mockito.internal.MockitoCore"));
            Reporter reporter = ((Reporter) createInstance("org.mockito.exceptions.Reporter"));
            setField(mockitoCore, "org.mockito.internal.MockitoCore", "reporter", reporter);
            MockUtil mockUtil = ((MockUtil) createInstance("org.mockito.internal.util.MockUtil"));
            CreationValidator creationValidator = ((CreationValidator) createInstance("org.mockito.internal.util.CreationValidator"));
            setField(mockUtil, "org.mockito.internal.util.MockUtil", "creationValidator", creationValidator);
            setField(mockitoCore, "org.mockito.internal.MockitoCore", "mockUtil", mockUtil);
            ThreadSafeMockingProgress mockingProgress = ((ThreadSafeMockingProgress) createInstance("org.mockito.internal.progress.ThreadSafeMockingProgress"));
            setField(mockitoCore, "org.mockito.internal.MockitoCore", "mockingProgress", mockingProgress);
            setStaticField(mockitoClazz, "MOCKITO_CORE", mockitoCore);
            TerminatingThreadLocal mockingProgress1 = ((TerminatingThreadLocal) createInstance("jdk.internal.misc.TerminatingThreadLocal"));
            setStaticField(threadSafeMockingProgressClazz, "mockingProgress", mockingProgress1);
            
            /* This test fails because method [org.mockito.Mockito.mock] produces [java.lang.IndexOutOfBoundsException: Greater or equal than length] */
            Mockito.mock(null);
        } finally {
            setStaticField(Mockito.class, "RETURNS_DEFAULTS", prevRETURNS_DEFAULTS);
            setStaticField(Mockito.class, "MOCKITO_CORE", prevMOCKITO_CORE);
            setStaticField(ThreadSafeMockingProgress.class, "mockingProgress", prevMockingProgress);
        }
    }
    ///endregion
    
    ///region Errors report for mock
    
    public void testMock_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Field reflectionFactory is not declared in class java.lang.reflect.AccessibleObject
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.mockito.Mockito.mock
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method mock(java.lang.Class, org.mockito.ReturnValues)
    
    /**
    @utbot.classUnderTest {@link Mockito}
 * @utbot.methodUnderTest {@link org.mockito.Mockito#mock(java.lang.Class,org.mockito.ReturnValues)}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: return mock(classToMock, withSettings().defaultAnswer(new AnswerReturnValuesAdapter(returnValues)));
 *  */
    @Test
    public void testMock_ThrowIndexOutOfBoundsException1() throws Exception  {
        Answer prevRETURNS_DEFAULTS = Mockito.RETURNS_DEFAULTS;
        Class mockitoClazz = Class.forName("org.mockito.Mockito");
        MockitoCore prevMOCKITO_CORE = ((MockitoCore) getStaticFieldValue(mockitoClazz, "MOCKITO_CORE"));
        Class threadSafeMockingProgressClazz = Class.forName("org.mockito.internal.progress.ThreadSafeMockingProgress");
        ThreadLocal prevMockingProgress = ((ThreadLocal) getStaticFieldValue(threadSafeMockingProgressClazz, "mockingProgress"));
        try {
            GloballyConfiguredAnswer returnsDefaults = new GloballyConfiguredAnswer();
            setStaticField(mockitoClazz, "RETURNS_DEFAULTS", returnsDefaults);
            MockitoCore mockitoCore = ((MockitoCore) createInstance("org.mockito.internal.MockitoCore"));
            Reporter reporter = ((Reporter) createInstance("org.mockito.exceptions.Reporter"));
            setField(mockitoCore, "org.mockito.internal.MockitoCore", "reporter", reporter);
            MockUtil mockUtil = ((MockUtil) createInstance("org.mockito.internal.util.MockUtil"));
            CreationValidator creationValidator = ((CreationValidator) createInstance("org.mockito.internal.util.CreationValidator"));
            setField(mockUtil, "org.mockito.internal.util.MockUtil", "creationValidator", creationValidator);
            setField(mockitoCore, "org.mockito.internal.MockitoCore", "mockUtil", mockUtil);
            ThreadSafeMockingProgress mockingProgress = ((ThreadSafeMockingProgress) createInstance("org.mockito.internal.progress.ThreadSafeMockingProgress"));
            setField(mockitoCore, "org.mockito.internal.MockitoCore", "mockingProgress", mockingProgress);
            setStaticField(mockitoClazz, "MOCKITO_CORE", mockitoCore);
            TerminatingThreadLocal mockingProgress1 = ((TerminatingThreadLocal) createInstance("jdk.internal.misc.TerminatingThreadLocal"));
            setField(mockingProgress1, "java.lang.ThreadLocal", "threadLocalHashCode", Integer.MIN_VALUE);
            setStaticField(threadSafeMockingProgressClazz, "mockingProgress", mockingProgress1);
            
            /* This test fails because method [org.mockito.Mockito.mock] produces [java.lang.IndexOutOfBoundsException: Less than zero] */
            Mockito.mock(((Class) null), ((ReturnValues) null));
        } finally {
            setStaticField(Mockito.class, "RETURNS_DEFAULTS", prevRETURNS_DEFAULTS);
            setStaticField(Mockito.class, "MOCKITO_CORE", prevMOCKITO_CORE);
            setStaticField(ThreadSafeMockingProgress.class, "mockingProgress", prevMockingProgress);
        }
    }
    
    /**
    @utbot.classUnderTest {@link Mockito}
 * @utbot.methodUnderTest {@link org.mockito.Mockito#mock(java.lang.Class,org.mockito.ReturnValues)}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: return mock(classToMock, withSettings().defaultAnswer(new AnswerReturnValuesAdapter(returnValues)));
 *  */
    @Test
    public void testMock_ThrowIndexOutOfBoundsException_1() throws Exception  {
        Answer prevRETURNS_DEFAULTS = Mockito.RETURNS_DEFAULTS;
        Class mockitoClazz = Class.forName("org.mockito.Mockito");
        MockitoCore prevMOCKITO_CORE = ((MockitoCore) getStaticFieldValue(mockitoClazz, "MOCKITO_CORE"));
        Class threadSafeMockingProgressClazz = Class.forName("org.mockito.internal.progress.ThreadSafeMockingProgress");
        ThreadLocal prevMockingProgress = ((ThreadLocal) getStaticFieldValue(threadSafeMockingProgressClazz, "mockingProgress"));
        try {
            GloballyConfiguredAnswer returnsDefaults = new GloballyConfiguredAnswer();
            setStaticField(mockitoClazz, "RETURNS_DEFAULTS", returnsDefaults);
            MockitoCore mockitoCore = ((MockitoCore) createInstance("org.mockito.internal.MockitoCore"));
            Reporter reporter = ((Reporter) createInstance("org.mockito.exceptions.Reporter"));
            setField(mockitoCore, "org.mockito.internal.MockitoCore", "reporter", reporter);
            MockUtil mockUtil = ((MockUtil) createInstance("org.mockito.internal.util.MockUtil"));
            CreationValidator creationValidator = ((CreationValidator) createInstance("org.mockito.internal.util.CreationValidator"));
            setField(mockUtil, "org.mockito.internal.util.MockUtil", "creationValidator", creationValidator);
            setField(mockitoCore, "org.mockito.internal.MockitoCore", "mockUtil", mockUtil);
            ThreadSafeMockingProgress mockingProgress = ((ThreadSafeMockingProgress) createInstance("org.mockito.internal.progress.ThreadSafeMockingProgress"));
            setField(mockitoCore, "org.mockito.internal.MockitoCore", "mockingProgress", mockingProgress);
            setStaticField(mockitoClazz, "MOCKITO_CORE", mockitoCore);
            TerminatingThreadLocal mockingProgress1 = ((TerminatingThreadLocal) createInstance("jdk.internal.misc.TerminatingThreadLocal"));
            setStaticField(threadSafeMockingProgressClazz, "mockingProgress", mockingProgress1);
            
            /* This test fails because method [org.mockito.Mockito.mock] produces [java.lang.IndexOutOfBoundsException: Greater or equal than length] */
            Mockito.mock(((Class) null), ((ReturnValues) null));
        } finally {
            setStaticField(Mockito.class, "RETURNS_DEFAULTS", prevRETURNS_DEFAULTS);
            setStaticField(Mockito.class, "MOCKITO_CORE", prevMOCKITO_CORE);
            setStaticField(ThreadSafeMockingProgress.class, "mockingProgress", prevMockingProgress);
        }
    }
    ///endregion
    
    ///region Errors report for mock
    
    public void testMock_errors1()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 4 occurrences of:
        // Field reflectionFactory is not declared in class java.lang.reflect.AccessibleObject
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.mockito.Mockito.mock
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method mock(java.lang.Class, org.mockito.stubbing.Answer)
    
    /**
    @utbot.classUnderTest {@link Mockito}
 * @utbot.methodUnderTest {@link org.mockito.Mockito#mock(java.lang.Class,org.mockito.stubbing.Answer)}
 * @utbot.invokes {@link org.mockito.Mockito#withSettings()}
 * @utbot.invokes {@link org.mockito.MockSettings#defaultAnswer(org.mockito.stubbing.Answer)}
 * @utbot.invokes {@link org.mockito.Mockito#mock(java.lang.Class,org.mockito.MockSettings)}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: return mock(classToMock, withSettings().defaultAnswer(defaultAnswer));
 *  */
    @Test
    public void testMock_ThrowIndexOutOfBoundsException2() throws Exception  {
        Answer prevRETURNS_DEFAULTS = Mockito.RETURNS_DEFAULTS;
        Class mockitoClazz = Class.forName("org.mockito.Mockito");
        MockitoCore prevMOCKITO_CORE = ((MockitoCore) getStaticFieldValue(mockitoClazz, "MOCKITO_CORE"));
        Class threadSafeMockingProgressClazz = Class.forName("org.mockito.internal.progress.ThreadSafeMockingProgress");
        ThreadLocal prevMockingProgress = ((ThreadLocal) getStaticFieldValue(threadSafeMockingProgressClazz, "mockingProgress"));
        try {
            GloballyConfiguredAnswer returnsDefaults = new GloballyConfiguredAnswer();
            setStaticField(mockitoClazz, "RETURNS_DEFAULTS", returnsDefaults);
            MockitoCore mockitoCore = ((MockitoCore) createInstance("org.mockito.internal.MockitoCore"));
            Reporter reporter = ((Reporter) createInstance("org.mockito.exceptions.Reporter"));
            setField(mockitoCore, "org.mockito.internal.MockitoCore", "reporter", reporter);
            MockUtil mockUtil = ((MockUtil) createInstance("org.mockito.internal.util.MockUtil"));
            CreationValidator creationValidator = ((CreationValidator) createInstance("org.mockito.internal.util.CreationValidator"));
            setField(mockUtil, "org.mockito.internal.util.MockUtil", "creationValidator", creationValidator);
            setField(mockitoCore, "org.mockito.internal.MockitoCore", "mockUtil", mockUtil);
            ThreadSafeMockingProgress mockingProgress = ((ThreadSafeMockingProgress) createInstance("org.mockito.internal.progress.ThreadSafeMockingProgress"));
            setField(mockitoCore, "org.mockito.internal.MockitoCore", "mockingProgress", mockingProgress);
            setStaticField(mockitoClazz, "MOCKITO_CORE", mockitoCore);
            TerminatingThreadLocal mockingProgress1 = ((TerminatingThreadLocal) createInstance("jdk.internal.misc.TerminatingThreadLocal"));
            setStaticField(threadSafeMockingProgressClazz, "mockingProgress", mockingProgress1);
            
            /* This test fails because method [org.mockito.Mockito.mock] produces [java.lang.IndexOutOfBoundsException: Greater or equal than length] */
            Mockito.mock(((Class) null), ((Answer) null));
        } finally {
            setStaticField(Mockito.class, "RETURNS_DEFAULTS", prevRETURNS_DEFAULTS);
            setStaticField(Mockito.class, "MOCKITO_CORE", prevMOCKITO_CORE);
            setStaticField(ThreadSafeMockingProgress.class, "mockingProgress", prevMockingProgress);
        }
    }
    ///endregion
    
    ///region Errors report for mock
    
    public void testMock_errors2()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Field reflectionFactory is not declared in class java.lang.reflect.AccessibleObject
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.mockito.Mockito.mock
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method mock(java.lang.Class, org.mockito.MockSettings)
    
    /**
    @utbot.classUnderTest {@link Mockito}
 * @utbot.methodUnderTest {@link org.mockito.Mockito#mock(java.lang.Class,org.mockito.MockSettings)}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: return MOCKITO_CORE.mock(classToMock, mockSettings);
 *  */
    @Test
    public void testMock_ThrowIndexOutOfBoundsException3() throws Exception  {
        Class mockitoClazz = Class.forName("org.mockito.Mockito");
        MockitoCore prevMOCKITO_CORE = ((MockitoCore) getStaticFieldValue(mockitoClazz, "MOCKITO_CORE"));
        Class threadSafeMockingProgressClazz = Class.forName("org.mockito.internal.progress.ThreadSafeMockingProgress");
        ThreadLocal prevMockingProgress = ((ThreadLocal) getStaticFieldValue(threadSafeMockingProgressClazz, "mockingProgress"));
        try {
            MockitoCore mockitoCore = ((MockitoCore) createInstance("org.mockito.internal.MockitoCore"));
            Reporter reporter = ((Reporter) createInstance("org.mockito.exceptions.Reporter"));
            setField(mockitoCore, "org.mockito.internal.MockitoCore", "reporter", reporter);
            MockUtil mockUtil = ((MockUtil) createInstance("org.mockito.internal.util.MockUtil"));
            CreationValidator creationValidator = ((CreationValidator) createInstance("org.mockito.internal.util.CreationValidator"));
            setField(mockUtil, "org.mockito.internal.util.MockUtil", "creationValidator", creationValidator);
            setField(mockitoCore, "org.mockito.internal.MockitoCore", "mockUtil", mockUtil);
            ThreadSafeMockingProgress mockingProgress = ((ThreadSafeMockingProgress) createInstance("org.mockito.internal.progress.ThreadSafeMockingProgress"));
            setField(mockitoCore, "org.mockito.internal.MockitoCore", "mockingProgress", mockingProgress);
            setStaticField(mockitoClazz, "MOCKITO_CORE", mockitoCore);
            TerminatingThreadLocal mockingProgress1 = ((TerminatingThreadLocal) createInstance("jdk.internal.misc.TerminatingThreadLocal"));
            setStaticField(threadSafeMockingProgressClazz, "mockingProgress", mockingProgress1);
            
            /* This test fails because method [org.mockito.Mockito.mock] produces [java.lang.IndexOutOfBoundsException: Greater or equal than length] */
            Mockito.mock(((Class) null), ((MockSettings) null));
        } finally {
            setStaticField(Mockito.class, "MOCKITO_CORE", prevMOCKITO_CORE);
            setStaticField(ThreadSafeMockingProgress.class, "mockingProgress", prevMockingProgress);
        }
    }
    
    /**
    @utbot.classUnderTest {@link Mockito}
 * @utbot.methodUnderTest {@link org.mockito.Mockito#mock(java.lang.Class,org.mockito.MockSettings)}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: return MOCKITO_CORE.mock(classToMock, mockSettings);
 *  */
    @Test
    public void testMock_ThrowIndexOutOfBoundsException_11() throws Exception  {
        Class mockitoClazz = Class.forName("org.mockito.Mockito");
        MockitoCore prevMOCKITO_CORE = ((MockitoCore) getStaticFieldValue(mockitoClazz, "MOCKITO_CORE"));
        Class threadSafeMockingProgressClazz = Class.forName("org.mockito.internal.progress.ThreadSafeMockingProgress");
        ThreadLocal prevMockingProgress = ((ThreadLocal) getStaticFieldValue(threadSafeMockingProgressClazz, "mockingProgress"));
        try {
            MockitoCore mockitoCore = ((MockitoCore) createInstance("org.mockito.internal.MockitoCore"));
            Reporter reporter = ((Reporter) createInstance("org.mockito.exceptions.Reporter"));
            setField(mockitoCore, "org.mockito.internal.MockitoCore", "reporter", reporter);
            MockUtil mockUtil = ((MockUtil) createInstance("org.mockito.internal.util.MockUtil"));
            CreationValidator creationValidator = ((CreationValidator) createInstance("org.mockito.internal.util.CreationValidator"));
            setField(mockUtil, "org.mockito.internal.util.MockUtil", "creationValidator", creationValidator);
            setField(mockitoCore, "org.mockito.internal.MockitoCore", "mockUtil", mockUtil);
            ThreadSafeMockingProgress mockingProgress = ((ThreadSafeMockingProgress) createInstance("org.mockito.internal.progress.ThreadSafeMockingProgress"));
            setField(mockitoCore, "org.mockito.internal.MockitoCore", "mockingProgress", mockingProgress);
            setStaticField(mockitoClazz, "MOCKITO_CORE", mockitoCore);
            TerminatingThreadLocal mockingProgress1 = ((TerminatingThreadLocal) createInstance("jdk.internal.misc.TerminatingThreadLocal"));
            setField(mockingProgress1, "java.lang.ThreadLocal", "threadLocalHashCode", Integer.MIN_VALUE);
            setStaticField(threadSafeMockingProgressClazz, "mockingProgress", mockingProgress1);
            
            /* This test fails because method [org.mockito.Mockito.mock] produces [java.lang.IndexOutOfBoundsException: Less than zero] */
            Mockito.mock(((Class) null), ((MockSettings) null));
        } finally {
            setStaticField(Mockito.class, "MOCKITO_CORE", prevMOCKITO_CORE);
            setStaticField(ThreadSafeMockingProgress.class, "mockingProgress", prevMockingProgress);
        }
    }
    ///endregion
    
    ///region Errors report for mock
    
    public void testMock_errors3()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 4 occurrences of:
        // Field reflectionFactory is not declared in class java.lang.reflect.AccessibleObject
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.mockito.Mockito.mock
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method mock(java.lang.Class, java.lang.String)
    
    /**
    @utbot.classUnderTest {@link Mockito}
 * @utbot.methodUnderTest {@link org.mockito.Mockito#mock(java.lang.Class,java.lang.String)}
 * @utbot.invokes {@link org.mockito.Mockito#withSettings()}
 * @utbot.invokes {@link org.mockito.MockSettings#name(java.lang.String)}
 * @utbot.invokes {@link org.mockito.MockSettings#defaultAnswer(org.mockito.stubbing.Answer)}
 * @utbot.invokes {@link org.mockito.Mockito#mock(java.lang.Class,org.mockito.MockSettings)}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: return mock(classToMock, withSettings().name(name).defaultAnswer(RETURNS_DEFAULTS));
 *  */
    @Test
    public void testMock_ThrowIndexOutOfBoundsException4() throws Exception  {
        Answer prevRETURNS_DEFAULTS = Mockito.RETURNS_DEFAULTS;
        Class mockitoClazz = Class.forName("org.mockito.Mockito");
        MockitoCore prevMOCKITO_CORE = ((MockitoCore) getStaticFieldValue(mockitoClazz, "MOCKITO_CORE"));
        Class threadSafeMockingProgressClazz = Class.forName("org.mockito.internal.progress.ThreadSafeMockingProgress");
        ThreadLocal prevMockingProgress = ((ThreadLocal) getStaticFieldValue(threadSafeMockingProgressClazz, "mockingProgress"));
        try {
            GloballyConfiguredAnswer returnsDefaults = new GloballyConfiguredAnswer();
            setStaticField(mockitoClazz, "RETURNS_DEFAULTS", returnsDefaults);
            MockitoCore mockitoCore = ((MockitoCore) createInstance("org.mockito.internal.MockitoCore"));
            Reporter reporter = ((Reporter) createInstance("org.mockito.exceptions.Reporter"));
            setField(mockitoCore, "org.mockito.internal.MockitoCore", "reporter", reporter);
            MockUtil mockUtil = ((MockUtil) createInstance("org.mockito.internal.util.MockUtil"));
            CreationValidator creationValidator = ((CreationValidator) createInstance("org.mockito.internal.util.CreationValidator"));
            setField(mockUtil, "org.mockito.internal.util.MockUtil", "creationValidator", creationValidator);
            setField(mockitoCore, "org.mockito.internal.MockitoCore", "mockUtil", mockUtil);
            ThreadSafeMockingProgress mockingProgress = ((ThreadSafeMockingProgress) createInstance("org.mockito.internal.progress.ThreadSafeMockingProgress"));
            setField(mockitoCore, "org.mockito.internal.MockitoCore", "mockingProgress", mockingProgress);
            setStaticField(mockitoClazz, "MOCKITO_CORE", mockitoCore);
            ThreadLocal mockingProgress1 = ((ThreadLocal) createInstance("java.lang.ThreadLocal"));
            setField(mockingProgress1, "java.lang.ThreadLocal", "threadLocalHashCode", Integer.MIN_VALUE);
            setStaticField(threadSafeMockingProgressClazz, "mockingProgress", mockingProgress1);
            
            /* This test fails because method [org.mockito.Mockito.mock] produces [java.lang.IndexOutOfBoundsException: Less than zero] */
            Mockito.mock(((Class) null), ((String) null));
        } finally {
            setStaticField(Mockito.class, "RETURNS_DEFAULTS", prevRETURNS_DEFAULTS);
            setStaticField(Mockito.class, "MOCKITO_CORE", prevMOCKITO_CORE);
            setStaticField(ThreadSafeMockingProgress.class, "mockingProgress", prevMockingProgress);
        }
    }
    ///endregion
    
    ///region Errors report for mock
    
    public void testMock_errors4()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 4 occurrences of:
        // Field reflectionFactory is not declared in class java.lang.reflect.AccessibleObject
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.mockito.Mockito.verifyNoMoreInteractions
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method verifyNoMoreInteractions([Ljava.lang.Object;)
    
    /**
    @utbot.classUnderTest {@link Mockito}
 * @utbot.methodUnderTest {@link org.mockito.Mockito#verifyNoMoreInteractions(java.lang.Object[])}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} 
 *  */
    @Test
    public void testVerifyNoMoreInteractions_ThrowIndexOutOfBoundsException() throws Exception  {
        Class mockitoClazz = Class.forName("org.mockito.Mockito");
        MockitoCore prevMOCKITO_CORE = ((MockitoCore) getStaticFieldValue(mockitoClazz, "MOCKITO_CORE"));
        Class threadSafeMockingProgressClazz = Class.forName("org.mockito.internal.progress.ThreadSafeMockingProgress");
        ThreadLocal prevMockingProgress = ((ThreadLocal) getStaticFieldValue(threadSafeMockingProgressClazz, "mockingProgress"));
        try {
            MockitoCore mockitoCore = ((MockitoCore) createInstance("org.mockito.internal.MockitoCore"));
            Reporter reporter = ((Reporter) createInstance("org.mockito.exceptions.Reporter"));
            setField(mockitoCore, "org.mockito.internal.MockitoCore", "reporter", reporter);
            MockUtil mockUtil = ((MockUtil) createInstance("org.mockito.internal.util.MockUtil"));
            CreationValidator creationValidator = ((CreationValidator) createInstance("org.mockito.internal.util.CreationValidator"));
            setField(mockUtil, "org.mockito.internal.util.MockUtil", "creationValidator", creationValidator);
            setField(mockitoCore, "org.mockito.internal.MockitoCore", "mockUtil", mockUtil);
            ThreadSafeMockingProgress mockingProgress = ((ThreadSafeMockingProgress) createInstance("org.mockito.internal.progress.ThreadSafeMockingProgress"));
            setField(mockitoCore, "org.mockito.internal.MockitoCore", "mockingProgress", mockingProgress);
            setStaticField(mockitoClazz, "MOCKITO_CORE", mockitoCore);
            ThreadLocal mockingProgress1 = ((ThreadLocal) createInstance("java.lang.ThreadLocal"));
            setStaticField(threadSafeMockingProgressClazz, "mockingProgress", mockingProgress1);
            java.lang.Object[] objectArray = {null};
            
            /* This test fails because method [org.mockito.Mockito.verifyNoMoreInteractions] produces [java.lang.IndexOutOfBoundsException: Greater or equal than length] */
            Mockito.verifyNoMoreInteractions(objectArray);
        } finally {
            setStaticField(Mockito.class, "MOCKITO_CORE", prevMOCKITO_CORE);
            setStaticField(ThreadSafeMockingProgress.class, "mockingProgress", prevMockingProgress);
        }
    }
    
    /**
    @utbot.classUnderTest {@link Mockito}
 * @utbot.methodUnderTest {@link org.mockito.Mockito#verifyNoMoreInteractions(java.lang.Object[])}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} 
 *  */
    @Test
    public void testVerifyNoMoreInteractions_ThrowIndexOutOfBoundsException_1() throws Exception  {
        Class mockitoClazz = Class.forName("org.mockito.Mockito");
        MockitoCore prevMOCKITO_CORE = ((MockitoCore) getStaticFieldValue(mockitoClazz, "MOCKITO_CORE"));
        Class threadSafeMockingProgressClazz = Class.forName("org.mockito.internal.progress.ThreadSafeMockingProgress");
        ThreadLocal prevMockingProgress = ((ThreadLocal) getStaticFieldValue(threadSafeMockingProgressClazz, "mockingProgress"));
        try {
            MockitoCore mockitoCore = ((MockitoCore) createInstance("org.mockito.internal.MockitoCore"));
            Reporter reporter = ((Reporter) createInstance("org.mockito.exceptions.Reporter"));
            setField(mockitoCore, "org.mockito.internal.MockitoCore", "reporter", reporter);
            MockUtil mockUtil = ((MockUtil) createInstance("org.mockito.internal.util.MockUtil"));
            CreationValidator creationValidator = ((CreationValidator) createInstance("org.mockito.internal.util.CreationValidator"));
            setField(mockUtil, "org.mockito.internal.util.MockUtil", "creationValidator", creationValidator);
            setField(mockitoCore, "org.mockito.internal.MockitoCore", "mockUtil", mockUtil);
            ThreadSafeMockingProgress mockingProgress = ((ThreadSafeMockingProgress) createInstance("org.mockito.internal.progress.ThreadSafeMockingProgress"));
            setField(mockitoCore, "org.mockito.internal.MockitoCore", "mockingProgress", mockingProgress);
            setStaticField(mockitoClazz, "MOCKITO_CORE", mockitoCore);
            ThreadLocal mockingProgress1 = ((ThreadLocal) createInstance("java.lang.ThreadLocal"));
            setField(mockingProgress1, "java.lang.ThreadLocal", "threadLocalHashCode", Integer.MIN_VALUE);
            setStaticField(threadSafeMockingProgressClazz, "mockingProgress", mockingProgress1);
            java.lang.Object[] objectArray = {null};
            
            /* This test fails because method [org.mockito.Mockito.verifyNoMoreInteractions] produces [java.lang.IndexOutOfBoundsException: Less than zero] */
            Mockito.verifyNoMoreInteractions(objectArray);
        } finally {
            setStaticField(Mockito.class, "MOCKITO_CORE", prevMOCKITO_CORE);
            setStaticField(ThreadSafeMockingProgress.class, "mockingProgress", prevMockingProgress);
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method verifyNoMoreInteractions([Ljava.lang.Object;)
    
    /**
    @utbot.classUnderTest {@link Mockito}
 * @utbot.methodUnderTest {@link org.mockito.Mockito#verifyNoMoreInteractions(java.lang.Object[])}
 * @utbot.throwsException {@link org.mockito.exceptions.base.MockitoException} in: MOCKITO_CORE.verifyNoMoreInteractions(mocks);
 *  */
    @Test(expected = MockitoException.class)
    public void testVerifyNoMoreInteractions_ThrowMockitoException() throws Exception  {
        Class mockitoClazz = Class.forName("org.mockito.Mockito");
        MockitoCore prevMOCKITO_CORE = ((MockitoCore) getStaticFieldValue(mockitoClazz, "MOCKITO_CORE"));
        try {
            MockitoCore mockitoCore = ((MockitoCore) createInstance("org.mockito.internal.MockitoCore"));
            Reporter reporter = ((Reporter) createInstance("org.mockito.exceptions.Reporter"));
            setField(mockitoCore, "org.mockito.internal.MockitoCore", "reporter", reporter);
            MockUtil mockUtil = ((MockUtil) createInstance("org.mockito.internal.util.MockUtil"));
            CreationValidator creationValidator = ((CreationValidator) createInstance("org.mockito.internal.util.CreationValidator"));
            setField(mockUtil, "org.mockito.internal.util.MockUtil", "creationValidator", creationValidator);
            setField(mockitoCore, "org.mockito.internal.MockitoCore", "mockUtil", mockUtil);
            ThreadSafeMockingProgress mockingProgress = ((ThreadSafeMockingProgress) createInstance("org.mockito.internal.progress.ThreadSafeMockingProgress"));
            setField(mockitoCore, "org.mockito.internal.MockitoCore", "mockingProgress", mockingProgress);
            setStaticField(mockitoClazz, "MOCKITO_CORE", mockitoCore);
            java.lang.Object[] objectArray = {};
            
            Mockito.verifyNoMoreInteractions(objectArray);
        } finally {
            setStaticField(Mockito.class, "MOCKITO_CORE", prevMOCKITO_CORE);
        }
    }
    
    /**
    @utbot.classUnderTest {@link Mockito}
 * @utbot.methodUnderTest {@link org.mockito.Mockito#verifyNoMoreInteractions(java.lang.Object[])}
 * @utbot.throwsException {@link org.mockito.exceptions.base.MockitoException} in: MOCKITO_CORE.verifyNoMoreInteractions(mocks);
 *  */
    @Test(expected = MockitoException.class)
    public void testVerifyNoMoreInteractions_ThrowMockitoException_1() throws Exception  {
        Class mockitoClazz = Class.forName("org.mockito.Mockito");
        MockitoCore prevMOCKITO_CORE = ((MockitoCore) getStaticFieldValue(mockitoClazz, "MOCKITO_CORE"));
        try {
            MockitoCore mockitoCore = ((MockitoCore) createInstance("org.mockito.internal.MockitoCore"));
            Reporter reporter = ((Reporter) createInstance("org.mockito.exceptions.Reporter"));
            setField(mockitoCore, "org.mockito.internal.MockitoCore", "reporter", reporter);
            MockUtil mockUtil = ((MockUtil) createInstance("org.mockito.internal.util.MockUtil"));
            CreationValidator creationValidator = ((CreationValidator) createInstance("org.mockito.internal.util.CreationValidator"));
            setField(mockUtil, "org.mockito.internal.util.MockUtil", "creationValidator", creationValidator);
            setField(mockitoCore, "org.mockito.internal.MockitoCore", "mockUtil", mockUtil);
            ThreadSafeMockingProgress mockingProgress = ((ThreadSafeMockingProgress) createInstance("org.mockito.internal.progress.ThreadSafeMockingProgress"));
            setField(mockitoCore, "org.mockito.internal.MockitoCore", "mockingProgress", mockingProgress);
            setStaticField(mockitoClazz, "MOCKITO_CORE", mockitoCore);
            
            Mockito.verifyNoMoreInteractions(null);
        } finally {
            setStaticField(Mockito.class, "MOCKITO_CORE", prevMOCKITO_CORE);
        }
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method verifyNoMoreInteractions([Ljava.lang.Object;)
    
    /**
     * @utbot.classUnderTest {@link org.mockito.Mockito}
     * @utbot.methodUnderTest {@link org.mockito.Mockito#verifyNoMoreInteractions(java.lang.Object[])}
     */
    @Test
    public void testVerifyNoMoreInteractionsThrowsUSEWithNonEmptyObjectArray() {
        java.lang.Object[] objectArray = new java.lang.Object[3];
        Object object = new Object();
        objectArray[0] = object;
        Object object1 = new Object();
        objectArray[1] = object1;
        Object object2 = new Object();
        objectArray[2] = object2;
        
        /* This test fails because method [org.mockito.Mockito.verifyNoMoreInteractions] produces [org.mockito.exceptions.misusing.UnfinishedStubbingException: 
        Unfinished stubbing detected here:
        -> at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
        
        E.g. thenReturn() may be missing.
        Examples of correct stubbing:
            when(mock.isOk()).thenReturn(true);
            when(mock.isOk()).thenThrow(exception);
            doThrow(exception).when(mock).someVoidMethod();
        Hints:
         1. missing thenReturn()
         2. you are trying to stub a final method, which is not supported
         3. you are stubbing the behaviour of another mock inside before 'thenReturn' instruction is completed
        ] */
        Mockito.verifyNoMoreInteractions(objectArray);
    }
    
    /**
     * @utbot.classUnderTest {@link org.mockito.Mockito}
     * @utbot.methodUnderTest {@link org.mockito.Mockito#verifyNoMoreInteractions(java.lang.Object[])}
     */
    @Test
    public void testVerifyNoMoreInteractionsThrowsUSEWithNonEmptyObjectArray1() {
        java.lang.Object[] objectArray = new java.lang.Object[3];
        Object object = new Object();
        objectArray[0] = object;
        Object object1 = new Object();
        objectArray[1] = object1;
        Object object2 = new Object();
        objectArray[2] = object2;
        
        /* This test fails because method [org.mockito.Mockito.verifyNoMoreInteractions] produces [org.mockito.exceptions.misusing.UnfinishedStubbingException: 
        Unfinished stubbing detected here:
        -> at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
        
        E.g. thenReturn() may be missing.
        Examples of correct stubbing:
            when(mock.isOk()).thenReturn(true);
            when(mock.isOk()).thenThrow(exception);
            doThrow(exception).when(mock).someVoidMethod();
        Hints:
         1. missing thenReturn()
         2. you are trying to stub a final method, which is not supported
         3. you are stubbing the behaviour of another mock inside before 'thenReturn' instruction is completed
        ] */
        Mockito.verifyNoMoreInteractions(objectArray);
    }
    
    /**
     * @utbot.classUnderTest {@link org.mockito.Mockito}
     * @utbot.methodUnderTest {@link org.mockito.Mockito#verifyNoMoreInteractions(java.lang.Object[])}
     */
    @Test
    public void testVerifyNoMoreInteractionsThrowsUSEWithNonEmptyObjectArray2() {
        java.lang.Object[] objectArray = new java.lang.Object[2];
        Object object = new Object();
        objectArray[0] = object;
        Object object1 = new Object();
        objectArray[1] = object1;
        
        /* This test fails because method [org.mockito.Mockito.verifyNoMoreInteractions] produces [org.mockito.exceptions.misusing.UnfinishedStubbingException: 
        Unfinished stubbing detected here:
        -> at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
        
        E.g. thenReturn() may be missing.
        Examples of correct stubbing:
            when(mock.isOk()).thenReturn(true);
            when(mock.isOk()).thenThrow(exception);
            doThrow(exception).when(mock).someVoidMethod();
        Hints:
         1. missing thenReturn()
         2. you are trying to stub a final method, which is not supported
         3. you are stubbing the behaviour of another mock inside before 'thenReturn' instruction is completed
        ] */
        Mockito.verifyNoMoreInteractions(objectArray);
    }
    
    /**
     * @utbot.classUnderTest {@link org.mockito.Mockito}
     * @utbot.methodUnderTest {@link org.mockito.Mockito#verifyNoMoreInteractions(java.lang.Object[])}
     */
    @Test
    public void testVerifyNoMoreInteractionsThrowsUSEWithNonEmptyObjectArray3() {
        java.lang.Object[] objectArray = new java.lang.Object[3];
        Object object = new Object();
        objectArray[0] = object;
        Object object1 = new Object();
        objectArray[1] = object1;
        Object object2 = new Object();
        objectArray[2] = object2;
        
        /* This test fails because method [org.mockito.Mockito.verifyNoMoreInteractions] produces [org.mockito.exceptions.misusing.UnfinishedStubbingException: 
        Unfinished stubbing detected here:
        -> at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
        
        E.g. thenReturn() may be missing.
        Examples of correct stubbing:
            when(mock.isOk()).thenReturn(true);
            when(mock.isOk()).thenThrow(exception);
            doThrow(exception).when(mock).someVoidMethod();
        Hints:
         1. missing thenReturn()
         2. you are trying to stub a final method, which is not supported
         3. you are stubbing the behaviour of another mock inside before 'thenReturn' instruction is completed
        ] */
        Mockito.verifyNoMoreInteractions(objectArray);
    }
    ///endregion
    
    ///region Errors report for verifyNoMoreInteractions
    
    public void testVerifyNoMoreInteractions_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 2 occurrences of:
        // Field reflectionFactory is not declared in class java.lang.reflect.AccessibleObject
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.mockito.Mockito.verifyZeroInteractions
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method verifyZeroInteractions([Ljava.lang.Object;)
    
    /**
    @utbot.classUnderTest {@link Mockito}
 * @utbot.methodUnderTest {@link org.mockito.Mockito#verifyZeroInteractions(java.lang.Object[])}
 * @utbot.throwsException {@link org.mockito.exceptions.base.MockitoException} in: MOCKITO_CORE.verifyNoMoreInteractions(mocks);
 *  */
    @Test(expected = MockitoException.class)
    public void testVerifyZeroInteractions_ThrowMockitoException() throws Exception  {
        Class mockitoClazz = Class.forName("org.mockito.Mockito");
        MockitoCore prevMOCKITO_CORE = ((MockitoCore) getStaticFieldValue(mockitoClazz, "MOCKITO_CORE"));
        try {
            MockitoCore mockitoCore = ((MockitoCore) createInstance("org.mockito.internal.MockitoCore"));
            Reporter reporter = ((Reporter) createInstance("org.mockito.exceptions.Reporter"));
            setField(mockitoCore, "org.mockito.internal.MockitoCore", "reporter", reporter);
            MockUtil mockUtil = ((MockUtil) createInstance("org.mockito.internal.util.MockUtil"));
            CreationValidator creationValidator = ((CreationValidator) createInstance("org.mockito.internal.util.CreationValidator"));
            setField(mockUtil, "org.mockito.internal.util.MockUtil", "creationValidator", creationValidator);
            setField(mockitoCore, "org.mockito.internal.MockitoCore", "mockUtil", mockUtil);
            ThreadSafeMockingProgress mockingProgress = ((ThreadSafeMockingProgress) createInstance("org.mockito.internal.progress.ThreadSafeMockingProgress"));
            setField(mockitoCore, "org.mockito.internal.MockitoCore", "mockingProgress", mockingProgress);
            setStaticField(mockitoClazz, "MOCKITO_CORE", mockitoCore);
            java.lang.Object[] objectArray = {};
            
            Mockito.verifyZeroInteractions(objectArray);
        } finally {
            setStaticField(Mockito.class, "MOCKITO_CORE", prevMOCKITO_CORE);
        }
    }
    
    /**
    @utbot.classUnderTest {@link Mockito}
 * @utbot.methodUnderTest {@link org.mockito.Mockito#verifyZeroInteractions(java.lang.Object[])}
 * @utbot.throwsException {@link org.mockito.exceptions.base.MockitoException} in: MOCKITO_CORE.verifyNoMoreInteractions(mocks);
 *  */
    @Test(expected = MockitoException.class)
    public void testVerifyZeroInteractions_ThrowMockitoException_1() throws Exception  {
        Class mockitoClazz = Class.forName("org.mockito.Mockito");
        MockitoCore prevMOCKITO_CORE = ((MockitoCore) getStaticFieldValue(mockitoClazz, "MOCKITO_CORE"));
        try {
            MockitoCore mockitoCore = ((MockitoCore) createInstance("org.mockito.internal.MockitoCore"));
            Reporter reporter = ((Reporter) createInstance("org.mockito.exceptions.Reporter"));
            setField(mockitoCore, "org.mockito.internal.MockitoCore", "reporter", reporter);
            MockUtil mockUtil = ((MockUtil) createInstance("org.mockito.internal.util.MockUtil"));
            CreationValidator creationValidator = ((CreationValidator) createInstance("org.mockito.internal.util.CreationValidator"));
            setField(mockUtil, "org.mockito.internal.util.MockUtil", "creationValidator", creationValidator);
            setField(mockitoCore, "org.mockito.internal.MockitoCore", "mockUtil", mockUtil);
            ThreadSafeMockingProgress mockingProgress = ((ThreadSafeMockingProgress) createInstance("org.mockito.internal.progress.ThreadSafeMockingProgress"));
            setField(mockitoCore, "org.mockito.internal.MockitoCore", "mockingProgress", mockingProgress);
            setStaticField(mockitoClazz, "MOCKITO_CORE", mockitoCore);
            
            Mockito.verifyZeroInteractions(null);
        } finally {
            setStaticField(Mockito.class, "MOCKITO_CORE", prevMOCKITO_CORE);
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method verifyZeroInteractions([Ljava.lang.Object;)
    
    /**
    @utbot.classUnderTest {@link Mockito}
 * @utbot.methodUnderTest {@link org.mockito.Mockito#verifyZeroInteractions(java.lang.Object[])}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} 
 *  */
    @Test
    public void testVerifyZeroInteractions_ThrowIndexOutOfBoundsException() throws Exception  {
        Class mockitoClazz = Class.forName("org.mockito.Mockito");
        MockitoCore prevMOCKITO_CORE = ((MockitoCore) getStaticFieldValue(mockitoClazz, "MOCKITO_CORE"));
        Class threadSafeMockingProgressClazz = Class.forName("org.mockito.internal.progress.ThreadSafeMockingProgress");
        ThreadLocal prevMockingProgress = ((ThreadLocal) getStaticFieldValue(threadSafeMockingProgressClazz, "mockingProgress"));
        try {
            MockitoCore mockitoCore = ((MockitoCore) createInstance("org.mockito.internal.MockitoCore"));
            Reporter reporter = ((Reporter) createInstance("org.mockito.exceptions.Reporter"));
            setField(mockitoCore, "org.mockito.internal.MockitoCore", "reporter", reporter);
            MockUtil mockUtil = ((MockUtil) createInstance("org.mockito.internal.util.MockUtil"));
            CreationValidator creationValidator = ((CreationValidator) createInstance("org.mockito.internal.util.CreationValidator"));
            setField(mockUtil, "org.mockito.internal.util.MockUtil", "creationValidator", creationValidator);
            setField(mockitoCore, "org.mockito.internal.MockitoCore", "mockUtil", mockUtil);
            ThreadSafeMockingProgress mockingProgress = ((ThreadSafeMockingProgress) createInstance("org.mockito.internal.progress.ThreadSafeMockingProgress"));
            setField(mockitoCore, "org.mockito.internal.MockitoCore", "mockingProgress", mockingProgress);
            setStaticField(mockitoClazz, "MOCKITO_CORE", mockitoCore);
            TerminatingThreadLocal mockingProgress1 = ((TerminatingThreadLocal) createInstance("jdk.internal.misc.TerminatingThreadLocal"));
            setStaticField(threadSafeMockingProgressClazz, "mockingProgress", mockingProgress1);
            java.lang.Object[] objectArray = {null, null};
            
            /* This test fails because method [org.mockito.Mockito.verifyZeroInteractions] produces [java.lang.IndexOutOfBoundsException: Greater or equal than length] */
            Mockito.verifyZeroInteractions(objectArray);
        } finally {
            setStaticField(Mockito.class, "MOCKITO_CORE", prevMOCKITO_CORE);
            setStaticField(ThreadSafeMockingProgress.class, "mockingProgress", prevMockingProgress);
        }
    }
    
    /**
    @utbot.classUnderTest {@link Mockito}
 * @utbot.methodUnderTest {@link org.mockito.Mockito#verifyZeroInteractions(java.lang.Object[])}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} 
 *  */
    @Test
    public void testVerifyZeroInteractions_ThrowIndexOutOfBoundsException_1() throws Exception  {
        Class mockitoClazz = Class.forName("org.mockito.Mockito");
        MockitoCore prevMOCKITO_CORE = ((MockitoCore) getStaticFieldValue(mockitoClazz, "MOCKITO_CORE"));
        Class threadSafeMockingProgressClazz = Class.forName("org.mockito.internal.progress.ThreadSafeMockingProgress");
        ThreadLocal prevMockingProgress = ((ThreadLocal) getStaticFieldValue(threadSafeMockingProgressClazz, "mockingProgress"));
        try {
            MockitoCore mockitoCore = ((MockitoCore) createInstance("org.mockito.internal.MockitoCore"));
            Reporter reporter = ((Reporter) createInstance("org.mockito.exceptions.Reporter"));
            setField(mockitoCore, "org.mockito.internal.MockitoCore", "reporter", reporter);
            MockUtil mockUtil = ((MockUtil) createInstance("org.mockito.internal.util.MockUtil"));
            CreationValidator creationValidator = ((CreationValidator) createInstance("org.mockito.internal.util.CreationValidator"));
            setField(mockUtil, "org.mockito.internal.util.MockUtil", "creationValidator", creationValidator);
            setField(mockitoCore, "org.mockito.internal.MockitoCore", "mockUtil", mockUtil);
            ThreadSafeMockingProgress mockingProgress = ((ThreadSafeMockingProgress) createInstance("org.mockito.internal.progress.ThreadSafeMockingProgress"));
            setField(mockitoCore, "org.mockito.internal.MockitoCore", "mockingProgress", mockingProgress);
            setStaticField(mockitoClazz, "MOCKITO_CORE", mockitoCore);
            TerminatingThreadLocal mockingProgress1 = ((TerminatingThreadLocal) createInstance("jdk.internal.misc.TerminatingThreadLocal"));
            setField(mockingProgress1, "java.lang.ThreadLocal", "threadLocalHashCode", Integer.MIN_VALUE);
            setStaticField(threadSafeMockingProgressClazz, "mockingProgress", mockingProgress1);
            java.lang.Object[] objectArray = {null, null};
            
            /* This test fails because method [org.mockito.Mockito.verifyZeroInteractions] produces [java.lang.IndexOutOfBoundsException: Less than zero] */
            Mockito.verifyZeroInteractions(objectArray);
        } finally {
            setStaticField(Mockito.class, "MOCKITO_CORE", prevMOCKITO_CORE);
            setStaticField(ThreadSafeMockingProgress.class, "mockingProgress", prevMockingProgress);
        }
    }
    ///endregion
    
    ///region Errors report for verifyZeroInteractions
    
    public void testVerifyZeroInteractions_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 4 occurrences of:
        // Default concrete execution failed
        
        // 1 occurrences of:
        // Field reflectionFactory is not declared in class java.lang.reflect.AccessibleObject
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.mockito.Mockito.validateMockitoUsage
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method validateMockitoUsage()
    
    /**
    @utbot.classUnderTest {@link Mockito}
 * @utbot.methodUnderTest {@link org.mockito.Mockito#validateMockitoUsage()}
 * @utbot.invokes {@link org.mockito.internal.MockitoCore#validateMockitoUsage()}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: MOCKITO_CORE.validateMockitoUsage();
 *  */
    @Test
    public void testValidateMockitoUsage_ThrowIndexOutOfBoundsException() throws Exception  {
        Class mockitoClazz = Class.forName("org.mockito.Mockito");
        MockitoCore prevMOCKITO_CORE = ((MockitoCore) getStaticFieldValue(mockitoClazz, "MOCKITO_CORE"));
        Class threadSafeMockingProgressClazz = Class.forName("org.mockito.internal.progress.ThreadSafeMockingProgress");
        ThreadLocal prevMockingProgress = ((ThreadLocal) getStaticFieldValue(threadSafeMockingProgressClazz, "mockingProgress"));
        try {
            MockitoCore mockitoCore = ((MockitoCore) createInstance("org.mockito.internal.MockitoCore"));
            Reporter reporter = ((Reporter) createInstance("org.mockito.exceptions.Reporter"));
            setField(mockitoCore, "org.mockito.internal.MockitoCore", "reporter", reporter);
            MockUtil mockUtil = ((MockUtil) createInstance("org.mockito.internal.util.MockUtil"));
            CreationValidator creationValidator = ((CreationValidator) createInstance("org.mockito.internal.util.CreationValidator"));
            setField(mockUtil, "org.mockito.internal.util.MockUtil", "creationValidator", creationValidator);
            setField(mockitoCore, "org.mockito.internal.MockitoCore", "mockUtil", mockUtil);
            ThreadSafeMockingProgress mockingProgress = ((ThreadSafeMockingProgress) createInstance("org.mockito.internal.progress.ThreadSafeMockingProgress"));
            setField(mockitoCore, "org.mockito.internal.MockitoCore", "mockingProgress", mockingProgress);
            setStaticField(mockitoClazz, "MOCKITO_CORE", mockitoCore);
            TerminatingThreadLocal mockingProgress1 = ((TerminatingThreadLocal) createInstance("jdk.internal.misc.TerminatingThreadLocal"));
            setField(mockingProgress1, "java.lang.ThreadLocal", "threadLocalHashCode", Integer.MIN_VALUE);
            setStaticField(threadSafeMockingProgressClazz, "mockingProgress", mockingProgress1);
            
            /* This test fails because method [org.mockito.Mockito.validateMockitoUsage] produces [java.lang.IndexOutOfBoundsException: Less than zero] */
            Mockito.validateMockitoUsage();
        } finally {
            setStaticField(Mockito.class, "MOCKITO_CORE", prevMOCKITO_CORE);
            setStaticField(ThreadSafeMockingProgress.class, "mockingProgress", prevMockingProgress);
        }
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method validateMockitoUsage()
    
    /**
     * @utbot.classUnderTest {@link org.mockito.Mockito}
     * @utbot.methodUnderTest {@link org.mockito.Mockito#validateMockitoUsage()}
     */
    @Test
    public void testValidateMockitoUsage() {
        Mockito.validateMockitoUsage();
    }
    
    /**
     * @utbot.classUnderTest {@link org.mockito.Mockito}
     * @utbot.methodUnderTest {@link org.mockito.Mockito#validateMockitoUsage()}
     */
    @Test
    public void testValidateMockitoUsage1() {
        Mockito.validateMockitoUsage();
    }
    
    /**
     * @utbot.classUnderTest {@link org.mockito.Mockito}
     * @utbot.methodUnderTest {@link org.mockito.Mockito#validateMockitoUsage()}
     */
    @Test
    public void testValidateMockitoUsage2() {
        Mockito.validateMockitoUsage();
    }
    
    /**
     * @utbot.classUnderTest {@link org.mockito.Mockito}
     * @utbot.methodUnderTest {@link org.mockito.Mockito#validateMockitoUsage()}
     */
    @Test
    public void testValidateMockitoUsage3() {
        Mockito.validateMockitoUsage();
    }
    ///endregion
    
    ///region Errors report for validateMockitoUsage
    
    public void testValidateMockitoUsage_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 4 occurrences of:
        // Field reflectionFactory is not declared in class java.lang.reflect.AccessibleObject
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.mockito.Mockito.doAnswer
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method doAnswer(org.mockito.stubbing.Answer)
    
    /**
    @utbot.classUnderTest {@link Mockito}
 * @utbot.methodUnderTest {@link org.mockito.Mockito#doAnswer(org.mockito.stubbing.Answer)}
 * @utbot.invokes {@link org.mockito.internal.MockitoCore#doAnswer(org.mockito.stubbing.Answer)}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: return MOCKITO_CORE.doAnswer(answer);
 *  */
    @Test
    public void testDoAnswer_ThrowIndexOutOfBoundsException() throws Exception  {
        Class mockitoClazz = Class.forName("org.mockito.Mockito");
        MockitoCore prevMOCKITO_CORE = ((MockitoCore) getStaticFieldValue(mockitoClazz, "MOCKITO_CORE"));
        Class threadSafeMockingProgressClazz = Class.forName("org.mockito.internal.progress.ThreadSafeMockingProgress");
        ThreadLocal prevMockingProgress = ((ThreadLocal) getStaticFieldValue(threadSafeMockingProgressClazz, "mockingProgress"));
        try {
            MockitoCore mockitoCore = ((MockitoCore) createInstance("org.mockito.internal.MockitoCore"));
            Reporter reporter = ((Reporter) createInstance("org.mockito.exceptions.Reporter"));
            setField(mockitoCore, "org.mockito.internal.MockitoCore", "reporter", reporter);
            MockUtil mockUtil = ((MockUtil) createInstance("org.mockito.internal.util.MockUtil"));
            CreationValidator creationValidator = ((CreationValidator) createInstance("org.mockito.internal.util.CreationValidator"));
            setField(mockUtil, "org.mockito.internal.util.MockUtil", "creationValidator", creationValidator);
            setField(mockitoCore, "org.mockito.internal.MockitoCore", "mockUtil", mockUtil);
            ThreadSafeMockingProgress mockingProgress = ((ThreadSafeMockingProgress) createInstance("org.mockito.internal.progress.ThreadSafeMockingProgress"));
            setField(mockitoCore, "org.mockito.internal.MockitoCore", "mockingProgress", mockingProgress);
            setStaticField(mockitoClazz, "MOCKITO_CORE", mockitoCore);
            TerminatingThreadLocal mockingProgress1 = ((TerminatingThreadLocal) createInstance("jdk.internal.misc.TerminatingThreadLocal"));
            setField(mockingProgress1, "java.lang.ThreadLocal", "threadLocalHashCode", Integer.MIN_VALUE);
            setStaticField(threadSafeMockingProgressClazz, "mockingProgress", mockingProgress1);
            
            /* This test fails because method [org.mockito.Mockito.doAnswer] produces [java.lang.IndexOutOfBoundsException: Less than zero] */
            Mockito.doAnswer(null);
        } finally {
            setStaticField(Mockito.class, "MOCKITO_CORE", prevMOCKITO_CORE);
            setStaticField(ThreadSafeMockingProgress.class, "mockingProgress", prevMockingProgress);
        }
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method doAnswer(org.mockito.stubbing.Answer)
    
    /**
     * @utbot.classUnderTest {@link org.mockito.Mockito}
     * @utbot.methodUnderTest {@link org.mockito.Mockito#doAnswer(org.mockito.stubbing.Answer)}
     */
    @Test
    public void testDoAnswer() {
        StubberImpl actual = ((StubberImpl) Mockito.doAnswer(null));
        
        StubberImpl expected = new StubberImpl();
        
    }
    
    /**
     * @utbot.classUnderTest {@link org.mockito.Mockito}
     * @utbot.methodUnderTest {@link org.mockito.Mockito#doAnswer(org.mockito.stubbing.Answer)}
     */
    @Test
    public void testDoAnswer1() {
        StubberImpl actual = ((StubberImpl) Mockito.doAnswer(null));
        
        StubberImpl expected = new StubberImpl();
        
    }
    
    /**
     * @utbot.classUnderTest {@link org.mockito.Mockito}
     * @utbot.methodUnderTest {@link org.mockito.Mockito#doAnswer(org.mockito.stubbing.Answer)}
     */
    @Test
    public void testDoAnswer2() {
        StubberImpl actual = ((StubberImpl) Mockito.doAnswer(null));
        
        StubberImpl expected = new StubberImpl();
        
    }
    ///endregion
    
    ///region Errors report for doAnswer
    
    public void testDoAnswer_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 3 occurrences of:
        // Field reflectionFactory is not declared in class java.lang.reflect.AccessibleObject
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.mockito.Mockito.spy
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method spy(java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link Mockito}
 * @utbot.methodUnderTest {@link org.mockito.Mockito#spy(java.lang.Object)}
 * @utbot.invokes {@link org.mockito.Mockito#withSettings()}
 * @utbot.invokes {@link org.mockito.MockSettings#spiedInstance(java.lang.Object)}
 * @utbot.invokes {@link org.mockito.MockSettings#defaultAnswer(org.mockito.stubbing.Answer)}
 * @utbot.invokes {@link org.mockito.internal.MockitoCore#mock(java.lang.Class,org.mockito.MockSettings)}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: return MOCKITO_CORE.mock((Class<T>) object.getClass(), withSettings().spiedInstance(object).defaultAnswer(CALLS_REAL_METHODS));
 *  */
    @Test
    public void testSpy_ThrowIndexOutOfBoundsException() throws Exception  {
        Answer prevCALLS_REAL_METHODS = Mockito.CALLS_REAL_METHODS;
        Class mockitoClazz = Class.forName("org.mockito.Mockito");
        MockitoCore prevMOCKITO_CORE = ((MockitoCore) getStaticFieldValue(mockitoClazz, "MOCKITO_CORE"));
        Answer prevRETURNS_DEFAULTS = Mockito.RETURNS_DEFAULTS;
        Class threadSafeMockingProgressClazz = Class.forName("org.mockito.internal.progress.ThreadSafeMockingProgress");
        ThreadLocal prevMockingProgress = ((ThreadLocal) getStaticFieldValue(threadSafeMockingProgressClazz, "mockingProgress"));
        try {
            CallsRealMethods callsRealMethods = new CallsRealMethods();
            setStaticField(mockitoClazz, "CALLS_REAL_METHODS", callsRealMethods);
            MockitoCore mockitoCore = ((MockitoCore) createInstance("org.mockito.internal.MockitoCore"));
            Reporter reporter = ((Reporter) createInstance("org.mockito.exceptions.Reporter"));
            setField(mockitoCore, "org.mockito.internal.MockitoCore", "reporter", reporter);
            MockUtil mockUtil = ((MockUtil) createInstance("org.mockito.internal.util.MockUtil"));
            CreationValidator creationValidator = ((CreationValidator) createInstance("org.mockito.internal.util.CreationValidator"));
            setField(mockUtil, "org.mockito.internal.util.MockUtil", "creationValidator", creationValidator);
            setField(mockitoCore, "org.mockito.internal.MockitoCore", "mockUtil", mockUtil);
            ThreadSafeMockingProgress mockingProgress = ((ThreadSafeMockingProgress) createInstance("org.mockito.internal.progress.ThreadSafeMockingProgress"));
            setField(mockitoCore, "org.mockito.internal.MockitoCore", "mockingProgress", mockingProgress);
            setStaticField(mockitoClazz, "MOCKITO_CORE", mockitoCore);
            GloballyConfiguredAnswer returnsDefaults = new GloballyConfiguredAnswer();
            setStaticField(mockitoClazz, "RETURNS_DEFAULTS", returnsDefaults);
            ThreadLocal mockingProgress1 = ((ThreadLocal) createInstance("java.lang.ThreadLocal"));
            setStaticField(threadSafeMockingProgressClazz, "mockingProgress", mockingProgress1);
            int[][] intArray = {};
            
            /* This test fails because method [org.mockito.Mockito.spy] produces [java.lang.IndexOutOfBoundsException: Greater or equal than length] */
            Mockito.spy(intArray);
        } finally {
            setStaticField(Mockito.class, "CALLS_REAL_METHODS", prevCALLS_REAL_METHODS);
            setStaticField(Mockito.class, "MOCKITO_CORE", prevMOCKITO_CORE);
            setStaticField(Mockito.class, "RETURNS_DEFAULTS", prevRETURNS_DEFAULTS);
            setStaticField(ThreadSafeMockingProgress.class, "mockingProgress", prevMockingProgress);
        }
    }
    
    /**
    @utbot.classUnderTest {@link Mockito}
 * @utbot.methodUnderTest {@link org.mockito.Mockito#spy(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return MOCKITO_CORE.mock((Class<T>) object.getClass(), withSettings().spiedInstance(object).defaultAnswer(CALLS_REAL_METHODS));
 *  */
    @Test
    public void testSpy_ThrowNullPointerException() throws Exception  {
        Class mockitoClazz = Class.forName("org.mockito.Mockito");
        MockitoCore prevMOCKITO_CORE = ((MockitoCore) getStaticFieldValue(mockitoClazz, "MOCKITO_CORE"));
        try {
            MockitoCore mockitoCore = ((MockitoCore) createInstance("org.mockito.internal.MockitoCore"));
            Reporter reporter = ((Reporter) createInstance("org.mockito.exceptions.Reporter"));
            setField(mockitoCore, "org.mockito.internal.MockitoCore", "reporter", reporter);
            MockUtil mockUtil = ((MockUtil) createInstance("org.mockito.internal.util.MockUtil"));
            CreationValidator creationValidator = ((CreationValidator) createInstance("org.mockito.internal.util.CreationValidator"));
            setField(mockUtil, "org.mockito.internal.util.MockUtil", "creationValidator", creationValidator);
            setField(mockitoCore, "org.mockito.internal.MockitoCore", "mockUtil", mockUtil);
            ThreadSafeMockingProgress mockingProgress = ((ThreadSafeMockingProgress) createInstance("org.mockito.internal.progress.ThreadSafeMockingProgress"));
            setField(mockitoCore, "org.mockito.internal.MockitoCore", "mockingProgress", mockingProgress);
            setStaticField(mockitoClazz, "MOCKITO_CORE", mockitoCore);
            
            /* This test fails because method [org.mockito.Mockito.spy] produces [java.lang.NullPointerException] */
            Mockito.spy(null);
        } finally {
            setStaticField(Mockito.class, "MOCKITO_CORE", prevMOCKITO_CORE);
        }
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method spy(java.lang.Object)
    
    /**
     * @utbot.classUnderTest {@link org.mockito.Mockito}
     * @utbot.methodUnderTest {@link org.mockito.Mockito#spy(java.lang.Object)}
     */
    @Test
    public void testSpyThrowsNPE() {
        /* This test fails because method [org.mockito.Mockito.spy] produces [java.lang.NullPointerException]
            org.mockito.Mockito.spy(Mockito.java:2121) */
        Mockito.spy(null);
    }
    
    /**
     * @utbot.classUnderTest {@link org.mockito.Mockito}
     * @utbot.methodUnderTest {@link org.mockito.Mockito#spy(java.lang.Object)}
     */
    @Test
    public void testSpyThrowsNPE1() {
        /* This test fails because method [org.mockito.Mockito.spy] produces [java.lang.NullPointerException]
            org.mockito.Mockito.spy(Mockito.java:2121) */
        Mockito.spy(null);
    }
    
    /**
     * @utbot.classUnderTest {@link org.mockito.Mockito}
     * @utbot.methodUnderTest {@link org.mockito.Mockito#spy(java.lang.Object)}
     */
    @Test
    public void testSpyThrowsNPE2() {
        /* This test fails because method [org.mockito.Mockito.spy] produces [java.lang.NullPointerException]
            org.mockito.Mockito.spy(Mockito.java:2121) */
        Mockito.spy(null);
    }
    ///endregion
    
    ///region FUZZER: SECURITY for method spy(java.lang.Object)
    
    /**
     * @utbot.classUnderTest {@link org.mockito.Mockito}
     * @utbot.methodUnderTest {@link org.mockito.Mockito#spy(java.lang.Object)}
     */
    @Test(expected = ExceptionInInitializerError.class)
    @Ignore(value = "Disabled due to sandbox")
    public void testSpy() {
        Object object = new Object();
        
        Mockito.spy(object);
    }
    ///endregion
    
    ///region Errors report for spy
    
    public void testSpy_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 4 occurrences of:
        // Field reflectionFactory is not declared in class java.lang.reflect.AccessibleObject
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.mockito.Mockito.never
    
    ///region Errors report for never
    
    public void testNever_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 5 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.mockito.Mockito.stubVoid
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method stubVoid(java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link Mockito}
 * @utbot.methodUnderTest {@link org.mockito.Mockito#stubVoid(java.lang.Object)}
 * @utbot.invokes {@link org.mockito.internal.MockitoCore#stubVoid(java.lang.Object)}
 * @utbot.throwsException {@link org.mockito.exceptions.misusing.NotAMockException} in: return MOCKITO_CORE.stubVoid(mock);
 *  */
    @Test(expected = NotAMockException.class)
    public void testStubVoid_ThrowNotAMockException() throws Exception  {
        Class mockitoClazz = Class.forName("org.mockito.Mockito");
        MockitoCore prevMOCKITO_CORE = ((MockitoCore) getStaticFieldValue(mockitoClazz, "MOCKITO_CORE"));
        try {
            MockitoCore mockitoCore = ((MockitoCore) createInstance("org.mockito.internal.MockitoCore"));
            Reporter reporter = ((Reporter) createInstance("org.mockito.exceptions.Reporter"));
            setField(mockitoCore, "org.mockito.internal.MockitoCore", "reporter", reporter);
            MockUtil mockUtil = ((MockUtil) createInstance("org.mockito.internal.util.MockUtil"));
            CreationValidator creationValidator = ((CreationValidator) createInstance("org.mockito.internal.util.CreationValidator"));
            setField(mockUtil, "org.mockito.internal.util.MockUtil", "creationValidator", creationValidator);
            setField(mockitoCore, "org.mockito.internal.MockitoCore", "mockUtil", mockUtil);
            ThreadSafeMockingProgress mockingProgress = ((ThreadSafeMockingProgress) createInstance("org.mockito.internal.progress.ThreadSafeMockingProgress"));
            setField(mockitoCore, "org.mockito.internal.MockitoCore", "mockingProgress", mockingProgress);
            setStaticField(mockitoClazz, "MOCKITO_CORE", mockitoCore);
            
            Mockito.stubVoid(null);
        } finally {
            setStaticField(Mockito.class, "MOCKITO_CORE", prevMOCKITO_CORE);
        }
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
    
    ///region Test suites for executable org.mockito.Mockito.stub
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method stub(java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link Mockito}
 * @utbot.methodUnderTest {@link org.mockito.Mockito#stub(java.lang.Object)}
 * @utbot.invokes {@link org.mockito.internal.MockitoCore#stub(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: return MOCKITO_CORE.stub(methodCall);
 *  */
    @Test
    public void testStub_ThrowIndexOutOfBoundsException() throws Exception  {
        Class mockitoClazz = Class.forName("org.mockito.Mockito");
        MockitoCore prevMOCKITO_CORE = ((MockitoCore) getStaticFieldValue(mockitoClazz, "MOCKITO_CORE"));
        Class threadSafeMockingProgressClazz = Class.forName("org.mockito.internal.progress.ThreadSafeMockingProgress");
        ThreadLocal prevMockingProgress = ((ThreadLocal) getStaticFieldValue(threadSafeMockingProgressClazz, "mockingProgress"));
        try {
            MockitoCore mockitoCore = ((MockitoCore) createInstance("org.mockito.internal.MockitoCore"));
            Reporter reporter = ((Reporter) createInstance("org.mockito.exceptions.Reporter"));
            setField(mockitoCore, "org.mockito.internal.MockitoCore", "reporter", reporter);
            MockUtil mockUtil = ((MockUtil) createInstance("org.mockito.internal.util.MockUtil"));
            CreationValidator creationValidator = ((CreationValidator) createInstance("org.mockito.internal.util.CreationValidator"));
            setField(mockUtil, "org.mockito.internal.util.MockUtil", "creationValidator", creationValidator);
            setField(mockitoCore, "org.mockito.internal.MockitoCore", "mockUtil", mockUtil);
            ThreadSafeMockingProgress mockingProgress = ((ThreadSafeMockingProgress) createInstance("org.mockito.internal.progress.ThreadSafeMockingProgress"));
            setField(mockitoCore, "org.mockito.internal.MockitoCore", "mockingProgress", mockingProgress);
            setStaticField(mockitoClazz, "MOCKITO_CORE", mockitoCore);
            TerminatingThreadLocal mockingProgress1 = ((TerminatingThreadLocal) createInstance("jdk.internal.misc.TerminatingThreadLocal"));
            setField(mockingProgress1, "java.lang.ThreadLocal", "threadLocalHashCode", Integer.MIN_VALUE);
            setStaticField(threadSafeMockingProgressClazz, "mockingProgress", mockingProgress1);
            
            /* This test fails because method [org.mockito.Mockito.stub] produces [java.lang.IndexOutOfBoundsException: Less than zero] */
            Mockito.stub(null);
        } finally {
            setStaticField(Mockito.class, "MOCKITO_CORE", prevMOCKITO_CORE);
            setStaticField(ThreadSafeMockingProgress.class, "mockingProgress", prevMockingProgress);
        }
    }
    ///endregion
    
    ///region Errors report for stub
    
    public void testStub_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 4 occurrences of:
        // Default concrete execution failed
        
        // 2 occurrences of:
        // Field reflectionFactory is not declared in class java.lang.reflect.AccessibleObject
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.mockito.Mockito.doReturn
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method doReturn(java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link Mockito}
 * @utbot.methodUnderTest {@link org.mockito.Mockito#doReturn(java.lang.Object)}
 * @utbot.invokes {@link org.mockito.internal.MockitoCore#doAnswer(org.mockito.stubbing.Answer)}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: return MOCKITO_CORE.doAnswer(new Returns(toBeReturned));
 *  */
    @Test
    public void testDoReturn_ThrowIndexOutOfBoundsException() throws Exception  {
        Class mockitoClazz = Class.forName("org.mockito.Mockito");
        MockitoCore prevMOCKITO_CORE = ((MockitoCore) getStaticFieldValue(mockitoClazz, "MOCKITO_CORE"));
        Class threadSafeMockingProgressClazz = Class.forName("org.mockito.internal.progress.ThreadSafeMockingProgress");
        ThreadLocal prevMockingProgress = ((ThreadLocal) getStaticFieldValue(threadSafeMockingProgressClazz, "mockingProgress"));
        try {
            MockitoCore mockitoCore = ((MockitoCore) createInstance("org.mockito.internal.MockitoCore"));
            Reporter reporter = ((Reporter) createInstance("org.mockito.exceptions.Reporter"));
            setField(mockitoCore, "org.mockito.internal.MockitoCore", "reporter", reporter);
            MockUtil mockUtil = ((MockUtil) createInstance("org.mockito.internal.util.MockUtil"));
            CreationValidator creationValidator = ((CreationValidator) createInstance("org.mockito.internal.util.CreationValidator"));
            setField(mockUtil, "org.mockito.internal.util.MockUtil", "creationValidator", creationValidator);
            setField(mockitoCore, "org.mockito.internal.MockitoCore", "mockUtil", mockUtil);
            ThreadSafeMockingProgress mockingProgress = ((ThreadSafeMockingProgress) createInstance("org.mockito.internal.progress.ThreadSafeMockingProgress"));
            setField(mockitoCore, "org.mockito.internal.MockitoCore", "mockingProgress", mockingProgress);
            setStaticField(mockitoClazz, "MOCKITO_CORE", mockitoCore);
            TerminatingThreadLocal mockingProgress1 = ((TerminatingThreadLocal) createInstance("jdk.internal.misc.TerminatingThreadLocal"));
            setStaticField(threadSafeMockingProgressClazz, "mockingProgress", mockingProgress1);
            
            /* This test fails because method [org.mockito.Mockito.doReturn] produces [java.lang.IndexOutOfBoundsException: Greater or equal than length] */
            Mockito.doReturn(null);
        } finally {
            setStaticField(Mockito.class, "MOCKITO_CORE", prevMOCKITO_CORE);
            setStaticField(ThreadSafeMockingProgress.class, "mockingProgress", prevMockingProgress);
        }
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method doReturn(java.lang.Object)
    
    /**
     * @utbot.classUnderTest {@link org.mockito.Mockito}
     * @utbot.methodUnderTest {@link org.mockito.Mockito#doReturn(java.lang.Object)}
     */
    @Test
    public void testDoReturn() {
        Object object = new Object();
        
        StubberImpl actual = ((StubberImpl) Mockito.doReturn(object));
        
        StubberImpl expected = new StubberImpl();
        
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method doReturn(java.lang.Object)
    
    /**
     * @utbot.classUnderTest {@link org.mockito.Mockito}
     * @utbot.methodUnderTest {@link org.mockito.Mockito#doReturn(java.lang.Object)}
     */
    @Test
    public void testDoReturnThrowsUSE() {
        /* This test fails because method [org.mockito.Mockito.doReturn] produces [org.mockito.exceptions.misusing.UnfinishedStubbingException: 
        Unfinished stubbing detected here:
        -> at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
        
        E.g. thenReturn() may be missing.
        Examples of correct stubbing:
            when(mock.isOk()).thenReturn(true);
            when(mock.isOk()).thenThrow(exception);
            doThrow(exception).when(mock).someVoidMethod();
        Hints:
         1. missing thenReturn()
         2. you are trying to stub a final method, which is not supported
         3. you are stubbing the behaviour of another mock inside before 'thenReturn' instruction is completed
        ] */
        Mockito.doReturn(null);
    }
    
    /**
     * @utbot.classUnderTest {@link org.mockito.Mockito}
     * @utbot.methodUnderTest {@link org.mockito.Mockito#doReturn(java.lang.Object)}
     */
    @Test
    public void testDoReturnThrowsUSE1() {
        /* This test fails because method [org.mockito.Mockito.doReturn] produces [org.mockito.exceptions.misusing.UnfinishedStubbingException: 
        Unfinished stubbing detected here:
        -> at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
        
        E.g. thenReturn() may be missing.
        Examples of correct stubbing:
            when(mock.isOk()).thenReturn(true);
            when(mock.isOk()).thenThrow(exception);
            doThrow(exception).when(mock).someVoidMethod();
        Hints:
         1. missing thenReturn()
         2. you are trying to stub a final method, which is not supported
         3. you are stubbing the behaviour of another mock inside before 'thenReturn' instruction is completed
        ] */
        Mockito.doReturn(null);
    }
    
    /**
     * @utbot.classUnderTest {@link org.mockito.Mockito}
     * @utbot.methodUnderTest {@link org.mockito.Mockito#doReturn(java.lang.Object)}
     */
    @Test
    public void testDoReturnThrowsUSE2() {
        /* This test fails because method [org.mockito.Mockito.doReturn] produces [org.mockito.exceptions.misusing.UnfinishedStubbingException: 
        Unfinished stubbing detected here:
        -> at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
        
        E.g. thenReturn() may be missing.
        Examples of correct stubbing:
            when(mock.isOk()).thenReturn(true);
            when(mock.isOk()).thenThrow(exception);
            doThrow(exception).when(mock).someVoidMethod();
        Hints:
         1. missing thenReturn()
         2. you are trying to stub a final method, which is not supported
         3. you are stubbing the behaviour of another mock inside before 'thenReturn' instruction is completed
        ] */
        Mockito.doReturn(null);
    }
    ///endregion
    
    ///region Errors report for doReturn
    
    public void testDoReturn_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Field reflectionFactory is not declared in class java.lang.reflect.AccessibleObject
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.mockito.Mockito.doThrow
    
    ///region Errors report for doThrow
    
    public void testDoThrow_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 4 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.mockito.Mockito.inOrder
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method inOrder([Ljava.lang.Object;)
    
    /**
    @utbot.classUnderTest {@link Mockito}
 * @utbot.methodUnderTest {@link org.mockito.Mockito#inOrder(java.lang.Object[])}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.throwsException {@link org.mockito.exceptions.base.MockitoException} in: return MOCKITO_CORE.inOrder(mocks);
 *  */
    @Test(expected = MockitoException.class)
    public void testInOrder_ThrowMockitoException() throws Exception  {
        Class mockitoClazz = Class.forName("org.mockito.Mockito");
        MockitoCore prevMOCKITO_CORE = ((MockitoCore) getStaticFieldValue(mockitoClazz, "MOCKITO_CORE"));
        try {
            MockitoCore mockitoCore = ((MockitoCore) createInstance("org.mockito.internal.MockitoCore"));
            Reporter reporter = ((Reporter) createInstance("org.mockito.exceptions.Reporter"));
            setField(mockitoCore, "org.mockito.internal.MockitoCore", "reporter", reporter);
            MockUtil mockUtil = ((MockUtil) createInstance("org.mockito.internal.util.MockUtil"));
            CreationValidator creationValidator = ((CreationValidator) createInstance("org.mockito.internal.util.CreationValidator"));
            setField(mockUtil, "org.mockito.internal.util.MockUtil", "creationValidator", creationValidator);
            setField(mockitoCore, "org.mockito.internal.MockitoCore", "mockUtil", mockUtil);
            ThreadSafeMockingProgress mockingProgress = ((ThreadSafeMockingProgress) createInstance("org.mockito.internal.progress.ThreadSafeMockingProgress"));
            setField(mockitoCore, "org.mockito.internal.MockitoCore", "mockingProgress", mockingProgress);
            setStaticField(mockitoClazz, "MOCKITO_CORE", mockitoCore);
            java.lang.Object[] objectArray = {};
            
            Mockito.inOrder(objectArray);
        } finally {
            setStaticField(Mockito.class, "MOCKITO_CORE", prevMOCKITO_CORE);
        }
    }
    
    /**
    @utbot.classUnderTest {@link Mockito}
 * @utbot.methodUnderTest {@link org.mockito.Mockito#inOrder(java.lang.Object[])}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.invokes {@link org.mockito.exceptions.Reporter#nullPassedWhenCreatingInOrder()}
 * @utbot.invokes {@link org.mockito.exceptions.Reporter#nullPassedWhenCreatingInOrder()}
 * @utbot.throwsException {@link org.mockito.exceptions.misusing.NullInsteadOfMockException} in: return MOCKITO_CORE.inOrder(mocks);
 *  */
    @Test(expected = NullInsteadOfMockException.class)
    public void testInOrder_ThrowNullInsteadOfMockException() throws Exception  {
        Class mockitoClazz = Class.forName("org.mockito.Mockito");
        MockitoCore prevMOCKITO_CORE = ((MockitoCore) getStaticFieldValue(mockitoClazz, "MOCKITO_CORE"));
        try {
            MockitoCore mockitoCore = ((MockitoCore) createInstance("org.mockito.internal.MockitoCore"));
            Reporter reporter = ((Reporter) createInstance("org.mockito.exceptions.Reporter"));
            setField(mockitoCore, "org.mockito.internal.MockitoCore", "reporter", reporter);
            MockUtil mockUtil = ((MockUtil) createInstance("org.mockito.internal.util.MockUtil"));
            CreationValidator creationValidator = ((CreationValidator) createInstance("org.mockito.internal.util.CreationValidator"));
            setField(mockUtil, "org.mockito.internal.util.MockUtil", "creationValidator", creationValidator);
            setField(mockitoCore, "org.mockito.internal.MockitoCore", "mockUtil", mockUtil);
            ThreadSafeMockingProgress mockingProgress = ((ThreadSafeMockingProgress) createInstance("org.mockito.internal.progress.ThreadSafeMockingProgress"));
            setField(mockitoCore, "org.mockito.internal.MockitoCore", "mockingProgress", mockingProgress);
            setStaticField(mockitoClazz, "MOCKITO_CORE", mockitoCore);
            java.lang.Object[] objectArray = {null};
            
            Mockito.inOrder(objectArray);
        } finally {
            setStaticField(Mockito.class, "MOCKITO_CORE", prevMOCKITO_CORE);
        }
    }
    
    /**
    @utbot.classUnderTest {@link Mockito}
 * @utbot.methodUnderTest {@link org.mockito.Mockito#inOrder(java.lang.Object[])}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.throwsException {@link org.mockito.exceptions.base.MockitoException} in: return MOCKITO_CORE.inOrder(mocks);
 *  */
    @Test(expected = MockitoException.class)
    public void testInOrder_ThrowMockitoException_1() throws Exception  {
        Class mockitoClazz = Class.forName("org.mockito.Mockito");
        MockitoCore prevMOCKITO_CORE = ((MockitoCore) getStaticFieldValue(mockitoClazz, "MOCKITO_CORE"));
        try {
            MockitoCore mockitoCore = ((MockitoCore) createInstance("org.mockito.internal.MockitoCore"));
            Reporter reporter = ((Reporter) createInstance("org.mockito.exceptions.Reporter"));
            setField(mockitoCore, "org.mockito.internal.MockitoCore", "reporter", reporter);
            MockUtil mockUtil = ((MockUtil) createInstance("org.mockito.internal.util.MockUtil"));
            CreationValidator creationValidator = ((CreationValidator) createInstance("org.mockito.internal.util.CreationValidator"));
            setField(mockUtil, "org.mockito.internal.util.MockUtil", "creationValidator", creationValidator);
            setField(mockitoCore, "org.mockito.internal.MockitoCore", "mockUtil", mockUtil);
            ThreadSafeMockingProgress mockingProgress = ((ThreadSafeMockingProgress) createInstance("org.mockito.internal.progress.ThreadSafeMockingProgress"));
            setField(mockitoCore, "org.mockito.internal.MockitoCore", "mockingProgress", mockingProgress);
            setStaticField(mockitoClazz, "MOCKITO_CORE", mockitoCore);
            
            Mockito.inOrder(null);
        } finally {
            setStaticField(Mockito.class, "MOCKITO_CORE", prevMOCKITO_CORE);
        }
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method inOrder([Ljava.lang.Object;)
    
    /**
     * @utbot.classUnderTest {@link org.mockito.Mockito}
     * @utbot.methodUnderTest {@link org.mockito.Mockito#inOrder(java.lang.Object[])}
     */
    @Test
    public void testInOrderThrowsNAMEWithNonEmptyObjectArray() {
        java.lang.Object[] objectArray = new java.lang.Object[3];
        Object object = new Object();
        objectArray[0] = object;
        Object object1 = new Object();
        objectArray[1] = object1;
        Object object2 = new Object();
        objectArray[2] = object2;
        
        /* This test fails because method [org.mockito.Mockito.inOrder] produces [org.mockito.exceptions.misusing.NotAMockException: 
        Argument(s) passed is not a mock!
        Pass mocks that require verification in order.
        For example:
            InOrder inOrder = inOrder(mockOne, mockTwo);] */
        Mockito.inOrder(objectArray);
    }
    
    /**
     * @utbot.classUnderTest {@link org.mockito.Mockito}
     * @utbot.methodUnderTest {@link org.mockito.Mockito#inOrder(java.lang.Object[])}
     */
    @Test
    public void testInOrderThrowsNAMEWithNonEmptyObjectArray1() {
        java.lang.Object[] objectArray = new java.lang.Object[3];
        Object object = new Object();
        objectArray[0] = object;
        Object object1 = new Object();
        objectArray[1] = object1;
        Object object2 = new Object();
        objectArray[2] = object2;
        
        /* This test fails because method [org.mockito.Mockito.inOrder] produces [org.mockito.exceptions.misusing.NotAMockException: 
        Argument(s) passed is not a mock!
        Pass mocks that require verification in order.
        For example:
            InOrder inOrder = inOrder(mockOne, mockTwo);] */
        Mockito.inOrder(objectArray);
    }
    
    /**
     * @utbot.classUnderTest {@link org.mockito.Mockito}
     * @utbot.methodUnderTest {@link org.mockito.Mockito#inOrder(java.lang.Object[])}
     */
    @Test
    public void testInOrderThrowsNAMEWithNonEmptyObjectArray2() {
        java.lang.Object[] objectArray = new java.lang.Object[2];
        Object object = new Object();
        objectArray[0] = object;
        Object object1 = new Object();
        objectArray[1] = object1;
        
        /* This test fails because method [org.mockito.Mockito.inOrder] produces [org.mockito.exceptions.misusing.NotAMockException: 
        Argument(s) passed is not a mock!
        Pass mocks that require verification in order.
        For example:
            InOrder inOrder = inOrder(mockOne, mockTwo);] */
        Mockito.inOrder(objectArray);
    }
    
    /**
     * @utbot.classUnderTest {@link org.mockito.Mockito}
     * @utbot.methodUnderTest {@link org.mockito.Mockito#inOrder(java.lang.Object[])}
     */
    @Test
    public void testInOrderThrowsNAMEWithNonEmptyObjectArray3() {
        java.lang.Object[] objectArray = new java.lang.Object[3];
        Object object = new Object();
        objectArray[0] = object;
        Object object1 = new Object();
        objectArray[1] = object1;
        Object object2 = new Object();
        objectArray[2] = object2;
        
        /* This test fails because method [org.mockito.Mockito.inOrder] produces [org.mockito.exceptions.misusing.NotAMockException: 
        Argument(s) passed is not a mock!
        Pass mocks that require verification in order.
        For example:
            InOrder inOrder = inOrder(mockOne, mockTwo);] */
        Mockito.inOrder(objectArray);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.mockito.Mockito.doCallRealMethod
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method doCallRealMethod()
    
    /**
    @utbot.classUnderTest {@link Mockito}
 * @utbot.methodUnderTest {@link org.mockito.Mockito#doCallRealMethod()}
 * @utbot.invokes {@link org.mockito.internal.MockitoCore#doAnswer(org.mockito.stubbing.Answer)}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: return MOCKITO_CORE.doAnswer(new CallsRealMethods());
 *  */
    @Test
    public void testDoCallRealMethod_ThrowIndexOutOfBoundsException() throws Exception  {
        Class mockitoClazz = Class.forName("org.mockito.Mockito");
        MockitoCore prevMOCKITO_CORE = ((MockitoCore) getStaticFieldValue(mockitoClazz, "MOCKITO_CORE"));
        Class threadSafeMockingProgressClazz = Class.forName("org.mockito.internal.progress.ThreadSafeMockingProgress");
        ThreadLocal prevMockingProgress = ((ThreadLocal) getStaticFieldValue(threadSafeMockingProgressClazz, "mockingProgress"));
        try {
            MockitoCore mockitoCore = ((MockitoCore) createInstance("org.mockito.internal.MockitoCore"));
            Reporter reporter = ((Reporter) createInstance("org.mockito.exceptions.Reporter"));
            setField(mockitoCore, "org.mockito.internal.MockitoCore", "reporter", reporter);
            MockUtil mockUtil = ((MockUtil) createInstance("org.mockito.internal.util.MockUtil"));
            CreationValidator creationValidator = ((CreationValidator) createInstance("org.mockito.internal.util.CreationValidator"));
            setField(mockUtil, "org.mockito.internal.util.MockUtil", "creationValidator", creationValidator);
            setField(mockitoCore, "org.mockito.internal.MockitoCore", "mockUtil", mockUtil);
            ThreadSafeMockingProgress mockingProgress = ((ThreadSafeMockingProgress) createInstance("org.mockito.internal.progress.ThreadSafeMockingProgress"));
            setField(mockitoCore, "org.mockito.internal.MockitoCore", "mockingProgress", mockingProgress);
            setStaticField(mockitoClazz, "MOCKITO_CORE", mockitoCore);
            Object mockingProgress1 = createInstance("java.lang.ThreadLocal$SuppliedThreadLocal");
            setField(mockingProgress1, "java.lang.ThreadLocal", "threadLocalHashCode", Integer.MIN_VALUE);
            setStaticField(threadSafeMockingProgressClazz, "mockingProgress", mockingProgress1);
            
            /* This test fails because method [org.mockito.Mockito.doCallRealMethod] produces [java.lang.IndexOutOfBoundsException: Less than zero] */
            Mockito.doCallRealMethod();
        } finally {
            setStaticField(Mockito.class, "MOCKITO_CORE", prevMOCKITO_CORE);
            setStaticField(ThreadSafeMockingProgress.class, "mockingProgress", prevMockingProgress);
        }
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method doCallRealMethod()
    
    /**
     * @utbot.classUnderTest {@link org.mockito.Mockito}
     * @utbot.methodUnderTest {@link org.mockito.Mockito#doCallRealMethod()}
     */
    @Test
    public void testDoCallRealMethod() {
        StubberImpl actual = ((StubberImpl) Mockito.doCallRealMethod());
        
        StubberImpl expected = new StubberImpl();
        
    }
    
    /**
     * @utbot.classUnderTest {@link org.mockito.Mockito}
     * @utbot.methodUnderTest {@link org.mockito.Mockito#doCallRealMethod()}
     */
    @Test
    public void testDoCallRealMethod1() {
        StubberImpl actual = ((StubberImpl) Mockito.doCallRealMethod());
        
        StubberImpl expected = new StubberImpl();
        
    }
    
    /**
     * @utbot.classUnderTest {@link org.mockito.Mockito}
     * @utbot.methodUnderTest {@link org.mockito.Mockito#doCallRealMethod()}
     */
    @Test
    public void testDoCallRealMethod2() {
        StubberImpl actual = ((StubberImpl) Mockito.doCallRealMethod());
        
        StubberImpl expected = new StubberImpl();
        
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method doCallRealMethod()
    
    /**
     * @utbot.classUnderTest {@link org.mockito.Mockito}
     * @utbot.methodUnderTest {@link org.mockito.Mockito#doCallRealMethod()}
     */
    @Test
    public void testDoCallRealMethodThrowsUSE() {
        /* This test fails because method [org.mockito.Mockito.doCallRealMethod] produces [org.mockito.exceptions.misusing.UnfinishedStubbingException: 
        Unfinished stubbing detected here:
        -> at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
        
        E.g. thenReturn() may be missing.
        Examples of correct stubbing:
            when(mock.isOk()).thenReturn(true);
            when(mock.isOk()).thenThrow(exception);
            doThrow(exception).when(mock).someVoidMethod();
        Hints:
         1. missing thenReturn()
         2. you are trying to stub a final method, which is not supported
         3. you are stubbing the behaviour of another mock inside before 'thenReturn' instruction is completed
        ] */
        Mockito.doCallRealMethod();
    }
    ///endregion
    
    ///region Errors report for doCallRealMethod
    
    public void testDoCallRealMethod_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Field reflectionFactory is not declared in class java.lang.reflect.AccessibleObject
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.mockito.Mockito.only
    
    ///region Errors report for only
    
    public void testOnly_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 5 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.mockito.Mockito.atLeast
    
    ///region Errors report for atLeast
    
    public void testAtLeast_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 6 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.mockito.Mockito.withSettings
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method withSettings()
    
    /**
    @utbot.classUnderTest {@link Mockito}
 * @utbot.methodUnderTest {@link org.mockito.Mockito#withSettings()}
 * @utbot.invokes {@link org.mockito.internal.creation.MockSettingsImpl#defaultAnswer(org.mockito.stubbing.Answer)}
 * @utbot.returnsFrom {@code return new MockSettingsImpl().defaultAnswer(RETURNS_DEFAULTS);}
 *  */
    @Test
    public void testWithSettings_MockSettingsImplDefaultAnswer() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        Answer prevRETURNS_DEFAULTS = Mockito.RETURNS_DEFAULTS;
        try {
            GloballyConfiguredAnswer returnsDefaults = new GloballyConfiguredAnswer();
            Class mockitoClazz = Class.forName("org.mockito.Mockito");
            setStaticField(mockitoClazz, "RETURNS_DEFAULTS", returnsDefaults);
            
            MockSettingsImpl actual = ((MockSettingsImpl) Mockito.withSettings());
            
            MockSettingsImpl expected = new MockSettingsImpl();
            
        } finally {
            setStaticField(Mockito.class, "RETURNS_DEFAULTS", prevRETURNS_DEFAULTS);
        }
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method withSettings()
    
    /**
     * @utbot.classUnderTest {@link org.mockito.Mockito}
     * @utbot.methodUnderTest {@link org.mockito.Mockito#withSettings()}
     */
    @Test
    public void testWithSettings() {
        MockSettingsImpl actual = ((MockSettingsImpl) Mockito.withSettings());
        
        MockSettingsImpl expected = new MockSettingsImpl();
        
    }
    
    /**
     * @utbot.classUnderTest {@link org.mockito.Mockito}
     * @utbot.methodUnderTest {@link org.mockito.Mockito#withSettings()}
     */
    @Test
    public void testWithSettings1() {
        MockSettingsImpl actual = ((MockSettingsImpl) Mockito.withSettings());
        
        MockSettingsImpl expected = new MockSettingsImpl();
        
    }
    
    /**
     * @utbot.classUnderTest {@link org.mockito.Mockito}
     * @utbot.methodUnderTest {@link org.mockito.Mockito#withSettings()}
     */
    @Test
    public void testWithSettings2() {
        MockSettingsImpl actual = ((MockSettingsImpl) Mockito.withSettings());
        
        MockSettingsImpl expected = new MockSettingsImpl();
        
    }
    
    /**
     * @utbot.classUnderTest {@link org.mockito.Mockito}
     * @utbot.methodUnderTest {@link org.mockito.Mockito#withSettings()}
     */
    @Test
    public void testWithSettings3() {
        MockSettingsImpl actual = ((MockSettingsImpl) Mockito.withSettings());
        
        MockSettingsImpl expected = new MockSettingsImpl();
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.mockito.Mockito.atLeastOnce
    
    ///region Errors report for atLeastOnce
    
    public void testAtLeastOnce_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 5 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.mockito.Mockito.atMost
    
    ///region Errors report for atMost
    
    public void testAtMost_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 6 occurrences of:
        // Default concrete execution failed
        
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
                
            java.lang.reflect.Method methodForGetDeclaredFields1122303213749300 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields1122303213749300.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass1122303213825100 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1122303213749300.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1122303213825100).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
                java.lang.reflect.Method methodForGetDeclaredFields1122303217045100 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields1122303217045100.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass1122303217051300 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1122303217045100.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1122303217051300).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields1122303217477100 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields1122303217477100.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass1122303217482900 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1122303217477100.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1122303217482900).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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

