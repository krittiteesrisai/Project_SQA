package org.mockito.exceptions;

import org.junit.Test;
import org.mockito.exceptions.misusing.NullInsteadOfMockException;
import org.mockito.exceptions.misusing.NotAMockException;
import org.mockito.exceptions.base.MockitoException;
import org.mockito.exceptions.misusing.MissingMethodInvocationException;
import org.mockito.internal.debugging.Location;
import org.mockito.internal.invocation.Invocation;
import java.util.ArrayList;
import org.mockito.internal.stubbing.StubbedInvocationMatcher;
import java.lang.reflect.Method;
import java.lang.reflect.InvocationTargetException;
import org.mockito.exceptions.misusing.UnfinishedVerificationException;
import org.mockito.exceptions.misusing.InvalidUseOfMatchersException;
import org.mockito.internal.exceptions.base.StackTraceFilter;
import java.io.StreamCorruptedException;
import org.mockito.exceptions.misusing.WrongTypeOfReturnValue;
import org.mockito.exceptions.verification.SmartNullPointerException;
import java.nio.file.ProviderNotFoundException;
import org.mockito.exceptions.misusing.UnfinishedStubbingException;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

public final class org_mockito_exceptions_ReporterTest {
    ///region Test suites for executable org.mockito.exceptions.Reporter.nullPassedToVerifyNoMoreInteractions
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method nullPassedToVerifyNoMoreInteractions()
    
    /**
    @utbot.classUnderTest {@link Reporter}
 * @utbot.methodUnderTest {@link org.mockito.exceptions.Reporter#nullPassedToVerifyNoMoreInteractions()}
 * @utbot.invokes {@link org.mockito.internal.util.StringJoiner#join(java.lang.Object[])}
 * @utbot.throwsException {@link org.mockito.exceptions.misusing.NullInsteadOfMockException} in: throw new NullInsteadOfMockException(join("Argument(s) passed is null!", "Examples of correct verifications:", "    verifyNoMoreInteractions(mockOne, mockTwo);", "    verifyZeroInteractions(mockOne, mockTwo);"));
 *  */
    @Test(expected = NullInsteadOfMockException.class)
    public void testNullPassedToVerifyNoMoreInteractions_ThrowNullInsteadOfMockException() {
        Reporter reporter = new Reporter();
        
        reporter.nullPassedToVerifyNoMoreInteractions();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.mockito.exceptions.Reporter.notAMockPassedToVerifyNoMoreInteractions
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method notAMockPassedToVerifyNoMoreInteractions()
    
    /**
    @utbot.classUnderTest {@link Reporter}
 * @utbot.methodUnderTest {@link org.mockito.exceptions.Reporter#notAMockPassedToVerifyNoMoreInteractions()}
 * @utbot.invokes {@link org.mockito.internal.util.StringJoiner#join(java.lang.Object[])}
 * @utbot.throwsException {@link org.mockito.exceptions.misusing.NotAMockException} in: throw new NotAMockException(join("Argument(s) passed is not a mock!", "Examples of correct verifications:", "    verifyNoMoreInteractions(mockOne, mockTwo);", "    verifyZeroInteractions(mockOne, mockTwo);"));
 *  */
    @Test(expected = NotAMockException.class)
    public void testNotAMockPassedToVerifyNoMoreInteractions_ThrowNotAMockException() {
        Reporter reporter = new Reporter();
        
        reporter.notAMockPassedToVerifyNoMoreInteractions();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.mockito.exceptions.Reporter.extraInterfacesAcceptsOnlyInterfaces
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method extraInterfacesAcceptsOnlyInterfaces(java.lang.Class)
    
    /**
    @utbot.classUnderTest {@link Reporter}
 * @utbot.methodUnderTest {@link org.mockito.exceptions.Reporter#extraInterfacesAcceptsOnlyInterfaces(java.lang.Class)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.Class#getSimpleName()}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#toString()}
 * @utbot.invokes {@link org.mockito.internal.util.StringJoiner#join(java.lang.Object[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: throw new MockitoException(join("extraInterfaces() accepts only interfaces.", "You passed following type: " + wrongType.getSimpleName() + " which is not an interface."));
 *  */
    @Test
    public void testExtraInterfacesAcceptsOnlyInterfaces_ThrowNullPointerException() {
        Reporter reporter = new Reporter();
        
        /* This test fails because method [org.mockito.exceptions.Reporter.extraInterfacesAcceptsOnlyInterfaces] produces [java.lang.NullPointerException]
            org.mockito.exceptions.Reporter.extraInterfacesAcceptsOnlyInterfaces(Reporter.java:472) */
        reporter.extraInterfacesAcceptsOnlyInterfaces(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.mockito.exceptions.Reporter.unsupportedCombinationOfAnnotations
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method unsupportedCombinationOfAnnotations(java.lang.String, java.lang.String)
    
    /**
    @utbot.classUnderTest {@link Reporter}
 * @utbot.methodUnderTest {@link org.mockito.exceptions.Reporter#unsupportedCombinationOfAnnotations(java.lang.String,java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#toString()}
 * @utbot.throwsException {@link org.mockito.exceptions.base.MockitoException} in: throw new MockitoException("This combination of annotations is not permitted on a single field:\n" + "@" + undesiredAnnotationOne + " and @" + undesiredAnnotationTwo);
 *  */
    @Test(expected = MockitoException.class)
    public void testUnsupportedCombinationOfAnnotations_ThrowMockitoException() {
        Reporter reporter = new Reporter();
        
        reporter.unsupportedCombinationOfAnnotations(null, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.mockito.exceptions.Reporter.extraInterfacesDoesNotAcceptNullParameters
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method extraInterfacesDoesNotAcceptNullParameters()
    
    /**
    @utbot.classUnderTest {@link Reporter}
 * @utbot.methodUnderTest {@link org.mockito.exceptions.Reporter#extraInterfacesDoesNotAcceptNullParameters()}
 * @utbot.invokes {@link org.mockito.internal.util.StringJoiner#join(java.lang.Object[])}
 * @utbot.throwsException {@link org.mockito.exceptions.base.MockitoException} in: throw new MockitoException(join("extraInterfaces() does not accept null parameters."));
 *  */
    @Test(expected = MockitoException.class)
    public void testExtraInterfacesDoesNotAcceptNullParameters_ThrowMockitoException() {
        Reporter reporter = new Reporter();
        
        reporter.extraInterfacesDoesNotAcceptNullParameters();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.mockito.exceptions.Reporter.cannotInitializeForInjectMocksAnnotation
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method cannotInitializeForInjectMocksAnnotation(java.lang.String, java.lang.Exception)
    
    /**
    @utbot.classUnderTest {@link Reporter}
 * @utbot.methodUnderTest {@link org.mockito.exceptions.Reporter#cannotInitializeForInjectMocksAnnotation(java.lang.String,java.lang.Exception)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#toString()}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.Exception#getMessage()}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#toString()}
 * @utbot.invokes {@link org.mockito.internal.util.StringJoiner#join(java.lang.Object[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: throw new MockitoException(join("Cannot instianate @InjectMocks field named '" + fieldName + "'.", "You haven't provided the instance for spying at field declaration so I tried to construct the instance.", "However, I failed because: " + details.getMessage(), "Examples of correct usage of @InjectMocks:", "   @InjectMocks Service service = new Service();", "   @InjectMocks Service service; //only if Service has parameterless constructor", "   //also, don't forget about MockitoAnnotations.initMocks();", "   //and... don't forget about some @Mocks for injection :)", ""), details);
 *  */
    @Test
    public void testCannotInitializeForInjectMocksAnnotation_ThrowNullPointerException() {
        Reporter reporter = new Reporter();
        
        /* This test fails because method [org.mockito.exceptions.Reporter.cannotInitializeForInjectMocksAnnotation] produces [java.lang.NullPointerException]
            org.mockito.exceptions.Reporter.cannotInitializeForInjectMocksAnnotation(Reporter.java:545) */
        reporter.cannotInitializeForInjectMocksAnnotation(null, null);
    }
    ///endregion
    
    ///region FUZZER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method cannotInitializeForInjectMocksAnnotation(java.lang.String, java.lang.Exception)
    
    /**
     * @utbot.classUnderTest {@link org.mockito.exceptions.Reporter}
     * @utbot.methodUnderTest {@link org.mockito.exceptions.Reporter#cannotInitializeForInjectMocksAnnotation(java.lang.String,java.lang.Exception)}
     */
    @Test(expected = MockitoException.class)
    public void testCannotInitializeForInjectMocksAnnotationThrowsMEWithNonEmptyString() {
        Reporter reporter = new Reporter();
        Exception exception = new Exception("Examples of correct usage of @InjectMocks:");
        java.lang.StackTraceElement[] stackTraceElementArray = new java.lang.StackTraceElement[2];
        StackTraceElement stackTraceElement = new StackTraceElement("   @InjectMocks Service service; //only if Service has parameterless constructor", "   @InjectMocks Service service; //only if Service has parameterless constructor", "You haven't provided the instance for spying at field declaration so I tried to construct the instance.", "-3", "   @InjectMocks Service service = new Service();", "", Integer.MAX_VALUE);
        stackTraceElementArray[0] = stackTraceElement;
        StackTraceElement stackTraceElement1 = new StackTraceElement("\n\t\r", "'.", "\n\t\r", -1);
        stackTraceElementArray[1] = stackTraceElement1;
        exception.setStackTrace(stackTraceElementArray);
        
        reporter.cannotInitializeForInjectMocksAnnotation("\u00A8", exception);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.mockito.exceptions.Reporter.extraInterfacesRequiresAtLeastOneInterface
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method extraInterfacesRequiresAtLeastOneInterface()
    
    /**
    @utbot.classUnderTest {@link Reporter}
 * @utbot.methodUnderTest {@link org.mockito.exceptions.Reporter#extraInterfacesRequiresAtLeastOneInterface()}
 * @utbot.invokes {@link org.mockito.internal.util.StringJoiner#join(java.lang.Object[])}
 * @utbot.throwsException {@link org.mockito.exceptions.base.MockitoException} in: throw new MockitoException(join("extraInterfaces() requires at least one interface."));
 *  */
    @Test(expected = MockitoException.class)
    public void testExtraInterfacesRequiresAtLeastOneInterface_ThrowMockitoException() {
        Reporter reporter = new Reporter();
        
        reporter.extraInterfacesRequiresAtLeastOneInterface();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.mockito.exceptions.Reporter.mocksHaveToBePassedToVerifyNoMoreInteractions
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method mocksHaveToBePassedToVerifyNoMoreInteractions()
    
    /**
    @utbot.classUnderTest {@link Reporter}
 * @utbot.methodUnderTest {@link org.mockito.exceptions.Reporter#mocksHaveToBePassedToVerifyNoMoreInteractions()}
 * @utbot.invokes {@link org.mockito.internal.util.StringJoiner#join(java.lang.Object[])}
 * @utbot.throwsException {@link org.mockito.exceptions.base.MockitoException} in: throw new MockitoException(join("Method requires argument(s)!", "Pass mocks that should be verified, e.g:", "    verifyNoMoreInteractions(mockOne, mockTwo);", "    verifyZeroInteractions(mockOne, mockTwo);"));
 *  */
    @Test(expected = MockitoException.class)
    public void testMocksHaveToBePassedToVerifyNoMoreInteractions_ThrowMockitoException() {
        Reporter reporter = new Reporter();
        
        reporter.mocksHaveToBePassedToVerifyNoMoreInteractions();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.mockito.exceptions.Reporter.mocksHaveToBePassedWhenCreatingInOrder
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method mocksHaveToBePassedWhenCreatingInOrder()
    
    /**
    @utbot.classUnderTest {@link Reporter}
 * @utbot.methodUnderTest {@link org.mockito.exceptions.Reporter#mocksHaveToBePassedWhenCreatingInOrder()}
 * @utbot.invokes {@link org.mockito.internal.util.StringJoiner#join(java.lang.Object[])}
 * @utbot.throwsException {@link org.mockito.exceptions.base.MockitoException} in: throw new MockitoException(join("Method requires argument(s)!", "Pass mocks that require verification in order.", "For example:", "    InOrder inOrder = inOrder(mockOne, mockTwo);"));
 *  */
    @Test(expected = MockitoException.class)
    public void testMocksHaveToBePassedWhenCreatingInOrder_ThrowMockitoException() {
        Reporter reporter = new Reporter();
        
        reporter.mocksHaveToBePassedWhenCreatingInOrder();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.mockito.exceptions.Reporter.cannotStubVoidMethodWithAReturnValue
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method cannotStubVoidMethodWithAReturnValue(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link Reporter}
 * @utbot.methodUnderTest {@link org.mockito.exceptions.Reporter#cannotStubVoidMethodWithAReturnValue(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#toString()}
 * @utbot.invokes {@link org.mockito.internal.util.StringJoiner#join(java.lang.Object[])}
 * @utbot.throwsException {@link org.mockito.exceptions.base.MockitoException} in: throw new MockitoException(join("'" + methodName + "' is a *void method* and it *cannot* be stubbed with a *return value*!", "Voids are usually stubbed with Throwables:", "    doThrow(exception).when(mock).someVoidMethod();", "If the method you are trying to stub is *overloaded* then make sure you are calling the right overloaded version.", "This exception might also occur when somewhere in your test you are stubbing *final methods*."));
 *  */
    @Test(expected = MockitoException.class)
    public void testCannotStubVoidMethodWithAReturnValue_ThrowMockitoException() {
        Reporter reporter = new Reporter();
        
        reporter.cannotStubVoidMethodWithAReturnValue(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.mockito.exceptions.Reporter.mockedTypeIsInconsistentWithSpiedInstanceType
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method mockedTypeIsInconsistentWithSpiedInstanceType(java.lang.Class, java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link Reporter}
 * @utbot.methodUnderTest {@link org.mockito.exceptions.Reporter#mockedTypeIsInconsistentWithSpiedInstanceType(java.lang.Class,java.lang.Object)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.Class#getSimpleName()}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.Class#getSimpleName()}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#toString()}
 * @utbot.invokes {@link org.mockito.internal.util.StringJoiner#join(java.lang.Object[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: throw new MockitoException(join("Mocked type must be the same as the type of your spied instance.", "Mocked type must be: " + spiedInstance.getClass().getSimpleName() + ", but is: " + mockedType.getSimpleName(), "  //correct spying:", "  spy = mock( ->ArrayList.class<- , withSettings().spiedInstance( ->new ArrayList()<- );", "  //incorrect - types don't match:", "  spy = mock( ->List.class<- , withSettings().spiedInstance( ->new ArrayList()<- );"));
 *  */
    @Test
    public void testMockedTypeIsInconsistentWithSpiedInstanceType_ThrowNullPointerException() {
        Reporter reporter = new Reporter();
        
        /* This test fails because method [org.mockito.exceptions.Reporter.mockedTypeIsInconsistentWithSpiedInstanceType] produces [java.lang.NullPointerException]
            org.mockito.exceptions.Reporter.mockedTypeIsInconsistentWithSpiedInstanceType(Reporter.java:493) */
        reporter.mockedTypeIsInconsistentWithSpiedInstanceType(null, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.mockito.exceptions.Reporter.extraInterfacesCannotContainMockedType
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method extraInterfacesCannotContainMockedType(java.lang.Class)
    
    /**
    @utbot.classUnderTest {@link Reporter}
 * @utbot.methodUnderTest {@link org.mockito.exceptions.Reporter#extraInterfacesCannotContainMockedType(java.lang.Class)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.Class#getSimpleName()}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#toString()}
 * @utbot.invokes {@link org.mockito.internal.util.StringJoiner#join(java.lang.Object[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: throw new MockitoException(join("extraInterfaces() does not accept the same type as the mocked type.", "You mocked following type: " + wrongType.getSimpleName(), "and you passed the same very interface to the extraInterfaces()"));
 *  */
    @Test
    public void testExtraInterfacesCannotContainMockedType_ThrowNullPointerException() {
        Reporter reporter = new Reporter();
        
        /* This test fails because method [org.mockito.exceptions.Reporter.extraInterfacesCannotContainMockedType] produces [java.lang.NullPointerException]
            org.mockito.exceptions.Reporter.extraInterfacesCannotContainMockedType(Reporter.java:479) */
        reporter.extraInterfacesCannotContainMockedType(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.mockito.exceptions.Reporter.notAMockPassedToWhenMethod
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method notAMockPassedToWhenMethod()
    
    /**
    @utbot.classUnderTest {@link Reporter}
 * @utbot.methodUnderTest {@link org.mockito.exceptions.Reporter#notAMockPassedToWhenMethod()}
 * @utbot.invokes {@link org.mockito.internal.util.StringJoiner#join(java.lang.Object[])}
 * @utbot.throwsException {@link org.mockito.exceptions.misusing.NotAMockException} in: throw new NotAMockException(join("Argument passed to when() is not a mock!", "Example of correct stubbing:", "    doThrow(new RuntimeException()).when(mock).someMethod();"));
 *  */
    @Test(expected = NotAMockException.class)
    public void testNotAMockPassedToWhenMethod_ThrowNotAMockException() {
        Reporter reporter = new Reporter();
        
        reporter.notAMockPassedToWhenMethod();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.mockito.exceptions.Reporter.missingMethodInvocation
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method missingMethodInvocation()
    
    /**
    @utbot.classUnderTest {@link Reporter}
 * @utbot.methodUnderTest {@link org.mockito.exceptions.Reporter#missingMethodInvocation()}
 * @utbot.invokes {@link org.mockito.internal.util.StringJoiner#join(java.lang.Object[])}
 * @utbot.throwsException {@link org.mockito.exceptions.misusing.MissingMethodInvocationException} in: throw new MissingMethodInvocationException(join("when() requires an argument which has to be 'a method call on a mock'.", "For example:", "    when(mock.getArticles()).thenReturn(articles);", "", "Also, this error might show up because:", "1. you stub either of: final/private/equals()/hashCode() methods.", "   Those methods *cannot* be stubbed/verified.", "2. inside when() you don't call method on mock but on some other object."));
 *  */
    @Test(expected = MissingMethodInvocationException.class)
    public void testMissingMethodInvocation_ThrowMissingMethodInvocationException() {
        Reporter reporter = new Reporter();
        
        reporter.missingMethodInvocation();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.mockito.exceptions.Reporter.notAMockPassedWhenCreatingInOrder
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method notAMockPassedWhenCreatingInOrder()
    
    /**
    @utbot.classUnderTest {@link Reporter}
 * @utbot.methodUnderTest {@link org.mockito.exceptions.Reporter#notAMockPassedWhenCreatingInOrder()}
 * @utbot.invokes {@link org.mockito.internal.util.StringJoiner#join(java.lang.Object[])}
 * @utbot.throwsException {@link org.mockito.exceptions.misusing.NotAMockException} in: throw new NotAMockException(join("Argument(s) passed is not a mock!", "Pass mocks that require verification in order.", "For example:", "    InOrder inOrder = inOrder(mockOne, mockTwo);"));
 *  */
    @Test(expected = NotAMockException.class)
    public void testNotAMockPassedWhenCreatingInOrder_ThrowNotAMockException() {
        Reporter reporter = new Reporter();
        
        reporter.notAMockPassedWhenCreatingInOrder();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.mockito.exceptions.Reporter.nullPassedWhenCreatingInOrder
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method nullPassedWhenCreatingInOrder()
    
    /**
    @utbot.classUnderTest {@link Reporter}
 * @utbot.methodUnderTest {@link org.mockito.exceptions.Reporter#nullPassedWhenCreatingInOrder()}
 * @utbot.invokes {@link org.mockito.internal.util.StringJoiner#join(java.lang.Object[])}
 * @utbot.throwsException {@link org.mockito.exceptions.misusing.NullInsteadOfMockException} in: throw new NullInsteadOfMockException(join("Argument(s) passed is null!", "Pass mocks that require verification in order.", "For example:", "    InOrder inOrder = inOrder(mockOne, mockTwo);"));
 *  */
    @Test(expected = NullInsteadOfMockException.class)
    public void testNullPassedWhenCreatingInOrder_ThrowNullInsteadOfMockException() {
        Reporter reporter = new Reporter();
        
        reporter.nullPassedWhenCreatingInOrder();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.mockito.exceptions.Reporter.notAMockPassedToVerify
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method notAMockPassedToVerify(java.lang.Class)
    
    /**
    @utbot.classUnderTest {@link Reporter}
 * @utbot.methodUnderTest {@link org.mockito.exceptions.Reporter#notAMockPassedToVerify(java.lang.Class)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.Class#getSimpleName()}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#toString()}
 * @utbot.invokes {@link org.mockito.internal.util.StringJoiner#join(java.lang.Object[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: throw new NotAMockException(join("Argument passed to verify() is of type " + type.getSimpleName() + " and is not a mock!", "Make sure you place the parenthesis correctly!", "See the examples of correct verifications:", "    verify(mock).someMethod();", "    verify(mock, times(10)).someMethod();", "    verify(mock, atLeastOnce()).someMethod();"));
 *  */
    @Test
    public void testNotAMockPassedToVerify_ThrowNullPointerException() {
        Reporter reporter = new Reporter();
        
        /* This test fails because method [org.mockito.exceptions.Reporter.notAMockPassedToVerify] produces [java.lang.NullPointerException]
            org.mockito.exceptions.Reporter.notAMockPassedToVerify(Reporter.java:110) */
        reporter.notAMockPassedToVerify(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.mockito.exceptions.Reporter.checkedExceptionInvalid
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method checkedExceptionInvalid(java.lang.Throwable)
    
    /**
    @utbot.classUnderTest {@link Reporter}
 * @utbot.methodUnderTest {@link org.mockito.exceptions.Reporter#checkedExceptionInvalid(java.lang.Throwable)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.Object)}
 * @utbot.invokes {@link java.lang.StringBuilder#toString()}
 * @utbot.invokes {@link org.mockito.internal.util.StringJoiner#join(java.lang.Object[])}
 * @utbot.throwsException {@link org.mockito.exceptions.base.MockitoException} in: throw new MockitoException(join("Checked exception is invalid for this method!", "Invalid: " + t));
 *  */
    @Test(expected = MockitoException.class)
    public void testCheckedExceptionInvalid_ThrowMockitoException() {
        Reporter reporter = new Reporter();
        
        reporter.checkedExceptionInvalid(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.mockito.exceptions.Reporter.argumentsAreDifferent
    
    ///region FUZZER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method argumentsAreDifferent(java.lang.String, java.lang.String, org.mockito.internal.debugging.Location)
    
    /**
     * @utbot.classUnderTest {@link org.mockito.exceptions.Reporter}
     * @utbot.methodUnderTest {@link org.mockito.exceptions.Reporter#argumentsAreDifferent(java.lang.String,java.lang.String,org.mockito.internal.debugging.Location)}
     */
    @Test
    public void testArgumentsAreDifferentThrowsAADWithNonEmptyStringAndEmptyString() {
        Reporter reporter = new Reporter();
        Location location = new Location();
        
        /* This test fails because method [org.mockito.exceptions.Reporter.argumentsAreDifferent] produces [Argument(s) are different! Wanted:
        
            
        ?
        -> at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
        Actual invocation has different arguments:
        
        -> at java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)
        ] */
        reporter.argumentsAreDifferent("\n\t\r?", "", location);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.mockito.exceptions.Reporter.wantedButNotInvoked
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method wantedButNotInvoked(org.mockito.exceptions.PrintableInvocation, java.util.List)
    
    /**
    @utbot.classUnderTest {@link Reporter}
 * @utbot.methodUnderTest {@link org.mockito.exceptions.Reporter#wantedButNotInvoked(org.mockito.exceptions.PrintableInvocation,java.util.List)}
 * @utbot.throwsException {@link java.lang.IllegalAccessError} 
 *  */
    @Test(expected = IllegalAccessError.class)
    public void testWantedButNotInvoked_ThrowIllegalAccessError() throws Exception  {
        Reporter reporter = new Reporter();
        Invocation invocation = ((Invocation) createInstance("org.mockito.internal.invocation.Invocation"));
        byte[] mock = {};
        setField(invocation, "org.mockito.internal.invocation.Invocation", "mock", mock);
        java.lang.Object[] arguments = {};
        setField(invocation, "org.mockito.internal.invocation.Invocation", "arguments", arguments);
        ArrayList arrayList = new ArrayList();
        
        reporter.wantedButNotInvoked(invocation, arrayList);
    }
    
    /**
    @utbot.classUnderTest {@link Reporter}
 * @utbot.methodUnderTest {@link org.mockito.exceptions.Reporter#wantedButNotInvoked(org.mockito.exceptions.PrintableInvocation,java.util.List)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: invocations.isEmpty()
 *  */
    @Test
    public void testWantedButNotInvoked_ThrowNullPointerException() {
        Reporter reporter = new Reporter();
        
        /* This test fails because method [org.mockito.exceptions.Reporter.wantedButNotInvoked] produces [java.lang.NullPointerException]
            org.mockito.exceptions.Reporter.wantedButNotInvoked(Reporter.java:249) */
        reporter.wantedButNotInvoked(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link Reporter}
 * @utbot.methodUnderTest {@link org.mockito.exceptions.Reporter#wantedButNotInvoked(org.mockito.exceptions.PrintableInvocation,java.util.List)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: String message = createWantedButNotInvokedMessage(wanted);
 *  */
    @Test
    public void testWantedButNotInvoked_ThrowNullPointerException_1() {
        Reporter reporter = new Reporter();
        ArrayList arrayList = new ArrayList();
        
        /* This test fails because method [org.mockito.exceptions.Reporter.wantedButNotInvoked] produces [java.lang.NullPointerException]
            org.mockito.exceptions.Reporter.createWantedButNotInvokedMessage(Reporter.java:267)
            org.mockito.exceptions.Reporter.wantedButNotInvoked(Reporter.java:260) */
        reporter.wantedButNotInvoked(null, arrayList);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method wantedButNotInvoked(org.mockito.exceptions.PrintableInvocation, java.util.List)
    
    /**
    @utbot.classUnderTest {@link Reporter}
 * @utbot.methodUnderTest {@link org.mockito.exceptions.Reporter#wantedButNotInvoked(org.mockito.exceptions.PrintableInvocation,java.util.List)}
 * @utbot.invokes {@link java.util.List#isEmpty()}
 * @utbot.invokes org.mockito.exceptions.Reporter#createWantedButNotInvokedMessage(org.mockito.exceptions.PrintableInvocation)
 * @utbot.throwsException {@link org.mockito.exceptions.misusing.NotAMockException} 
 *  */
    @Test(expected = NotAMockException.class)
    public void testWantedButNotInvoked_ThrowNotAMockException() throws Throwable  {
        Reporter reporter = new Reporter();
        StubbedInvocationMatcher stubbedInvocationMatcher = ((StubbedInvocationMatcher) createInstance("org.mockito.internal.stubbing.StubbedInvocationMatcher"));
        Invocation invocation = ((Invocation) createInstance("org.mockito.internal.invocation.Invocation"));
        setField(stubbedInvocationMatcher, "org.mockito.internal.invocation.InvocationMatcher", "invocation", invocation);
        ArrayList matchers = new ArrayList();
        setField(stubbedInvocationMatcher, "org.mockito.internal.invocation.InvocationMatcher", "matchers", matchers);
        ArrayList arrayList = new ArrayList();
        
        Class reporterClazz = Class.forName("org.mockito.exceptions.Reporter");
        Class stubbedInvocationMatcherType = Class.forName("org.mockito.exceptions.PrintableInvocation");
        Class arrayListType = Class.forName("java.util.List");
        Method wantedButNotInvokedMethod = reporterClazz.getDeclaredMethod("wantedButNotInvoked", stubbedInvocationMatcherType, arrayListType);
        wantedButNotInvokedMethod.setAccessible(true);
        java.lang.Object[] wantedButNotInvokedMethodArguments = new java.lang.Object[2];
        wantedButNotInvokedMethodArguments[0] = stubbedInvocationMatcher;
        wantedButNotInvokedMethodArguments[1] = arrayList;
        try {
            wantedButNotInvokedMethod.invoke(reporter, wantedButNotInvokedMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method wantedButNotInvoked(org.mockito.exceptions.PrintableInvocation, java.util.List)
    
    @Test(expected = IllegalAccessError.class)
    public void testWantedButNotInvoked1() throws Exception  {
        Reporter reporter = new Reporter();
        Invocation invocation = ((Invocation) createInstance("org.mockito.internal.invocation.Invocation"));
        java.lang.Object[] arguments = new java.lang.Object[27];
        Object object = createInstance("java.lang.Object");
        arguments[0] = object;
        arguments[1] = object;
        setField(invocation, "org.mockito.internal.invocation.Invocation", "arguments", arguments);
        ArrayList arrayList = new ArrayList();
        
        reporter.wantedButNotInvoked(invocation, arrayList);
    }
    
    @Test(expected = IllegalAccessError.class)
    public void testWantedButNotInvoked2() throws Exception  {
        Reporter reporter = new Reporter();
        Invocation invocation = ((Invocation) createInstance("org.mockito.internal.invocation.Invocation"));
        java.lang.Object[] arguments = new java.lang.Object[3];
        Object object = createInstance("java.lang.Object");
        arguments[2] = object;
        setField(invocation, "org.mockito.internal.invocation.Invocation", "arguments", arguments);
        ArrayList arrayList = new ArrayList();
        
        reporter.wantedButNotInvoked(invocation, arrayList);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.mockito.exceptions.Reporter.wantedButNotInvoked
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method wantedButNotInvoked(org.mockito.exceptions.PrintableInvocation)
    
    /**
    @utbot.classUnderTest {@link Reporter}
 * @utbot.methodUnderTest {@link org.mockito.exceptions.Reporter#wantedButNotInvoked(org.mockito.exceptions.PrintableInvocation)}
 * @utbot.invokes org.mockito.exceptions.Reporter#createWantedButNotInvokedMessage(org.mockito.exceptions.PrintableInvocation)
 * @utbot.throwsException {@link java.lang.NullPointerException} in: throw new WantedButNotInvoked(createWantedButNotInvokedMessage(wanted));
 *  */
    @Test
    public void testWantedButNotInvoked_ThrowNullPointerException1() {
        Reporter reporter = new Reporter();
        
        /* This test fails because method [org.mockito.exceptions.Reporter.wantedButNotInvoked] produces [java.lang.NullPointerException]
            org.mockito.exceptions.Reporter.createWantedButNotInvokedMessage(Reporter.java:267)
            org.mockito.exceptions.Reporter.wantedButNotInvoked(Reporter.java:244) */
        reporter.wantedButNotInvoked(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.mockito.exceptions.Reporter.createWantedButNotInvokedMessage
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method createWantedButNotInvokedMessage(org.mockito.exceptions.PrintableInvocation)
    
    /**
    @utbot.classUnderTest {@link Reporter}
 * @utbot.methodUnderTest {@link org.mockito.exceptions.Reporter#createWantedButNotInvokedMessage(org.mockito.exceptions.PrintableInvocation)}
 * @utbot.throwsException {@link java.lang.IllegalAccessError} in: wanted.toString()
 *  */
    @Test(expected = IllegalAccessError.class)
    public void testCreateWantedButNotInvokedMessage_ThrowIllegalAccessError() throws Throwable  {
        Reporter reporter = new Reporter();
        Invocation invocation = ((Invocation) createInstance("org.mockito.internal.invocation.Invocation"));
        java.lang.Object[] arguments = {};
        setField(invocation, "org.mockito.internal.invocation.Invocation", "arguments", arguments);
        
        Class reporterClazz = Class.forName("org.mockito.exceptions.Reporter");
        Class invocationType = Class.forName("org.mockito.exceptions.PrintableInvocation");
        Method createWantedButNotInvokedMessageMethod = reporterClazz.getDeclaredMethod("createWantedButNotInvokedMessage", invocationType);
        createWantedButNotInvokedMessageMethod.setAccessible(true);
        java.lang.Object[] createWantedButNotInvokedMessageMethodArguments = new java.lang.Object[1];
        createWantedButNotInvokedMessageMethodArguments[0] = invocation;
        try {
            createWantedButNotInvokedMessageMethod.invoke(reporter, createWantedButNotInvokedMessageMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link Reporter}
 * @utbot.methodUnderTest {@link org.mockito.exceptions.Reporter#createWantedButNotInvokedMessage(org.mockito.exceptions.PrintableInvocation)}
 * @utbot.throwsException {@link java.lang.IllegalAccessError} in: wanted.toString()
 *  */
    @Test(expected = IllegalAccessError.class)
    public void testCreateWantedButNotInvokedMessage_ThrowIllegalAccessError_1() throws Throwable  {
        Reporter reporter = new Reporter();
        Invocation invocation = ((Invocation) createInstance("org.mockito.internal.invocation.Invocation"));
        java.lang.Object[] arguments = {null};
        setField(invocation, "org.mockito.internal.invocation.Invocation", "arguments", arguments);
        
        Class reporterClazz = Class.forName("org.mockito.exceptions.Reporter");
        Class invocationType = Class.forName("org.mockito.exceptions.PrintableInvocation");
        Method createWantedButNotInvokedMessageMethod = reporterClazz.getDeclaredMethod("createWantedButNotInvokedMessage", invocationType);
        createWantedButNotInvokedMessageMethod.setAccessible(true);
        java.lang.Object[] createWantedButNotInvokedMessageMethodArguments = new java.lang.Object[1];
        createWantedButNotInvokedMessageMethodArguments[0] = invocation;
        try {
            createWantedButNotInvokedMessageMethod.invoke(reporter, createWantedButNotInvokedMessageMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link Reporter}
 * @utbot.methodUnderTest {@link org.mockito.exceptions.Reporter#createWantedButNotInvokedMessage(org.mockito.exceptions.PrintableInvocation)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: wanted.toString()
 *  */
    @Test
    public void testCreateWantedButNotInvokedMessage_ThrowNullPointerException() throws Throwable  {
        Reporter reporter = new Reporter();
        
        /* This test fails because method [org.mockito.exceptions.Reporter.createWantedButNotInvokedMessage] produces [java.lang.NullPointerException]
            org.mockito.exceptions.Reporter.createWantedButNotInvokedMessage(Reporter.java:267) */
        Class reporterClazz = Class.forName("org.mockito.exceptions.Reporter");
        Class printableInvocationType = Class.forName("org.mockito.exceptions.PrintableInvocation");
        Method createWantedButNotInvokedMessageMethod = reporterClazz.getDeclaredMethod("createWantedButNotInvokedMessage", printableInvocationType);
        createWantedButNotInvokedMessageMethod.setAccessible(true);
        java.lang.Object[] createWantedButNotInvokedMessageMethodArguments = new java.lang.Object[1];
        createWantedButNotInvokedMessageMethodArguments[0] = ((Object) null);
        try {
            createWantedButNotInvokedMessageMethod.invoke(reporter, createWantedButNotInvokedMessageMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method createWantedButNotInvokedMessage(org.mockito.exceptions.PrintableInvocation)
    
    /**
    @utbot.classUnderTest {@link Reporter}
 * @utbot.methodUnderTest {@link org.mockito.exceptions.Reporter#createWantedButNotInvokedMessage(org.mockito.exceptions.PrintableInvocation)}
 * @utbot.invokes {@link org.mockito.exceptions.PrintableInvocation#toString()}
 * @utbot.throwsException {@link org.mockito.exceptions.misusing.NotAMockException} 
 *  */
    @Test(expected = NotAMockException.class)
    public void testCreateWantedButNotInvokedMessage_ThrowNotAMockException() throws Throwable  {
        Reporter reporter = new Reporter();
        StubbedInvocationMatcher stubbedInvocationMatcher = ((StubbedInvocationMatcher) createInstance("org.mockito.internal.stubbing.StubbedInvocationMatcher"));
        Invocation invocation = ((Invocation) createInstance("org.mockito.internal.invocation.Invocation"));
        byte[] mock = {};
        setField(invocation, "org.mockito.internal.invocation.Invocation", "mock", mock);
        setField(stubbedInvocationMatcher, "org.mockito.internal.invocation.InvocationMatcher", "invocation", invocation);
        ArrayList matchers = new ArrayList();
        setField(stubbedInvocationMatcher, "org.mockito.internal.invocation.InvocationMatcher", "matchers", matchers);
        
        Class reporterClazz = Class.forName("org.mockito.exceptions.Reporter");
        Class stubbedInvocationMatcherType = Class.forName("org.mockito.exceptions.PrintableInvocation");
        Method createWantedButNotInvokedMessageMethod = reporterClazz.getDeclaredMethod("createWantedButNotInvokedMessage", stubbedInvocationMatcherType);
        createWantedButNotInvokedMessageMethod.setAccessible(true);
        java.lang.Object[] createWantedButNotInvokedMessageMethodArguments = new java.lang.Object[1];
        createWantedButNotInvokedMessageMethodArguments[0] = stubbedInvocationMatcher;
        try {
            createWantedButNotInvokedMessageMethod.invoke(reporter, createWantedButNotInvokedMessageMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method createWantedButNotInvokedMessage(org.mockito.exceptions.PrintableInvocation)
    
    @Test(expected = IllegalAccessError.class)
    public void testCreateWantedButNotInvokedMessage1() throws Throwable  {
        Reporter reporter = new Reporter();
        Invocation invocation = ((Invocation) createInstance("org.mockito.internal.invocation.Invocation"));
        java.lang.Object[] arguments = new java.lang.Object[9];
        Object object = createInstance("java.lang.Object");
        arguments[2] = object;
        arguments[3] = object;
        Class class1 = Object.class;
        arguments[4] = ((Object) class1);
        arguments[5] = ((Object) class1);
        arguments[6] = ((Object) class1);
        arguments[7] = ((Object) class1);
        arguments[8] = ((Object) class1);
        setField(invocation, "org.mockito.internal.invocation.Invocation", "arguments", arguments);
        
        Class reporterClazz = Class.forName("org.mockito.exceptions.Reporter");
        Class invocationType = Class.forName("org.mockito.exceptions.PrintableInvocation");
        Method createWantedButNotInvokedMessageMethod = reporterClazz.getDeclaredMethod("createWantedButNotInvokedMessage", invocationType);
        createWantedButNotInvokedMessageMethod.setAccessible(true);
        java.lang.Object[] createWantedButNotInvokedMessageMethodArguments = new java.lang.Object[1];
        createWantedButNotInvokedMessageMethodArguments[0] = invocation;
        try {
            createWantedButNotInvokedMessageMethod.invoke(reporter, createWantedButNotInvokedMessageMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = IllegalAccessError.class)
    public void testCreateWantedButNotInvokedMessage2() throws Throwable  {
        Reporter reporter = new Reporter();
        Invocation invocation = ((Invocation) createInstance("org.mockito.internal.invocation.Invocation"));
        java.lang.Object[] arguments = new java.lang.Object[3];
        Object object = createInstance("java.lang.Object");
        arguments[0] = object;
        arguments[2] = object;
        setField(invocation, "org.mockito.internal.invocation.Invocation", "arguments", arguments);
        
        Class reporterClazz = Class.forName("org.mockito.exceptions.Reporter");
        Class invocationType = Class.forName("org.mockito.exceptions.PrintableInvocation");
        Method createWantedButNotInvokedMessageMethod = reporterClazz.getDeclaredMethod("createWantedButNotInvokedMessage", invocationType);
        createWantedButNotInvokedMessageMethod.setAccessible(true);
        java.lang.Object[] createWantedButNotInvokedMessageMethodArguments = new java.lang.Object[1];
        createWantedButNotInvokedMessageMethodArguments[0] = invocation;
        try {
            createWantedButNotInvokedMessageMethod.invoke(reporter, createWantedButNotInvokedMessageMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = IllegalAccessError.class)
    public void testCreateWantedButNotInvokedMessage3() throws Throwable  {
        Reporter reporter = new Reporter();
        Invocation invocation = ((Invocation) createInstance("org.mockito.internal.invocation.Invocation"));
        Object mock = createInstance("java.lang.Object");
        setField(invocation, "org.mockito.internal.invocation.Invocation", "mock", mock);
        java.lang.Object[] arguments = new java.lang.Object[1];
        arguments[0] = mock;
        setField(invocation, "org.mockito.internal.invocation.Invocation", "arguments", arguments);
        
        Class reporterClazz = Class.forName("org.mockito.exceptions.Reporter");
        Class invocationType = Class.forName("org.mockito.exceptions.PrintableInvocation");
        Method createWantedButNotInvokedMessageMethod = reporterClazz.getDeclaredMethod("createWantedButNotInvokedMessage", invocationType);
        createWantedButNotInvokedMessageMethod.setAccessible(true);
        java.lang.Object[] createWantedButNotInvokedMessageMethodArguments = new java.lang.Object[1];
        createWantedButNotInvokedMessageMethodArguments[0] = invocation;
        try {
            createWantedButNotInvokedMessageMethod.invoke(reporter, createWantedButNotInvokedMessageMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.mockito.exceptions.Reporter.createTooManyInvocationsMessage
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method createTooManyInvocationsMessage(int, int, org.mockito.exceptions.PrintableInvocation, org.mockito.internal.debugging.Location)
    
    /**
    @utbot.classUnderTest {@link Reporter}
 * @utbot.methodUnderTest {@link org.mockito.exceptions.Reporter#createTooManyInvocationsMessage(int,int,org.mockito.exceptions.PrintableInvocation,org.mockito.internal.debugging.Location)}
 * @utbot.invokes {@link org.mockito.exceptions.PrintableInvocation#toString()}
 * @utbot.throwsException {@link java.lang.IllegalAccessError} in: wanted.toString()
 *  */
    @Test(expected = IllegalAccessError.class)
    public void testCreateTooManyInvocationsMessage_ThrowIllegalAccessError() throws Throwable  {
        Reporter reporter = new Reporter();
        Invocation invocation = ((Invocation) createInstance("org.mockito.internal.invocation.Invocation"));
        byte[] mock = {};
        setField(invocation, "org.mockito.internal.invocation.Invocation", "mock", mock);
        java.lang.Object[] arguments = new java.lang.Object[1];
        Object object = createInstance("java.lang.Object");
        arguments[0] = object;
        setField(invocation, "org.mockito.internal.invocation.Invocation", "arguments", arguments);
        
        Class reporterClazz = Class.forName("org.mockito.exceptions.Reporter");
        Class intType = int.class;
        Class invocationType = Class.forName("org.mockito.exceptions.PrintableInvocation");
        Class locationType = Class.forName("org.mockito.internal.debugging.Location");
        Method createTooManyInvocationsMessageMethod = reporterClazz.getDeclaredMethod("createTooManyInvocationsMessage", intType, intType, invocationType, locationType);
        createTooManyInvocationsMessageMethod.setAccessible(true);
        java.lang.Object[] createTooManyInvocationsMessageMethodArguments = new java.lang.Object[4];
        createTooManyInvocationsMessageMethodArguments[0] = -255;
        createTooManyInvocationsMessageMethodArguments[1] = -255;
        createTooManyInvocationsMessageMethodArguments[2] = invocation;
        createTooManyInvocationsMessageMethodArguments[3] = ((Object) null);
        try {
            createTooManyInvocationsMessageMethod.invoke(reporter, createTooManyInvocationsMessageMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link Reporter}
 * @utbot.methodUnderTest {@link org.mockito.exceptions.Reporter#createTooManyInvocationsMessage(int,int,org.mockito.exceptions.PrintableInvocation,org.mockito.internal.debugging.Location)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: wanted.toString()
 *  */
    @Test
    public void testCreateTooManyInvocationsMessage_ThrowNullPointerException() throws Throwable  {
        Reporter reporter = new Reporter();
        
        /* This test fails because method [org.mockito.exceptions.Reporter.createTooManyInvocationsMessage] produces [java.lang.NullPointerException]
            org.mockito.exceptions.Reporter.createTooManyInvocationsMessage(Reporter.java:294) */
        Class reporterClazz = Class.forName("org.mockito.exceptions.Reporter");
        Class intType = int.class;
        Class printableInvocationType = Class.forName("org.mockito.exceptions.PrintableInvocation");
        Class locationType = Class.forName("org.mockito.internal.debugging.Location");
        Method createTooManyInvocationsMessageMethod = reporterClazz.getDeclaredMethod("createTooManyInvocationsMessage", intType, intType, printableInvocationType, locationType);
        createTooManyInvocationsMessageMethod.setAccessible(true);
        java.lang.Object[] createTooManyInvocationsMessageMethodArguments = new java.lang.Object[4];
        createTooManyInvocationsMessageMethodArguments[0] = -255;
        createTooManyInvocationsMessageMethodArguments[1] = -255;
        createTooManyInvocationsMessageMethodArguments[2] = ((Object) null);
        createTooManyInvocationsMessageMethodArguments[3] = ((Object) null);
        try {
            createTooManyInvocationsMessageMethod.invoke(reporter, createTooManyInvocationsMessageMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method createTooManyInvocationsMessage(int, int, org.mockito.exceptions.PrintableInvocation, org.mockito.internal.debugging.Location)
    
    /**
    @utbot.classUnderTest {@link Reporter}
 * @utbot.methodUnderTest {@link org.mockito.exceptions.Reporter#createTooManyInvocationsMessage(int,int,org.mockito.exceptions.PrintableInvocation,org.mockito.internal.debugging.Location)}
 * @utbot.invokes {@link org.mockito.exceptions.PrintableInvocation#toString()}
 * @utbot.throwsException {@link org.mockito.exceptions.misusing.NotAMockException} 
 *  */
    @Test(expected = NotAMockException.class)
    public void testCreateTooManyInvocationsMessage_ThrowNotAMockException() throws Throwable  {
        Reporter reporter = new Reporter();
        StubbedInvocationMatcher stubbedInvocationMatcher = ((StubbedInvocationMatcher) createInstance("org.mockito.internal.stubbing.StubbedInvocationMatcher"));
        Invocation invocation = ((Invocation) createInstance("org.mockito.internal.invocation.Invocation"));
        setField(stubbedInvocationMatcher, "org.mockito.internal.invocation.InvocationMatcher", "invocation", invocation);
        ArrayList matchers = new ArrayList();
        setField(stubbedInvocationMatcher, "org.mockito.internal.invocation.InvocationMatcher", "matchers", matchers);
        
        Class reporterClazz = Class.forName("org.mockito.exceptions.Reporter");
        Class intType = int.class;
        Class stubbedInvocationMatcherType = Class.forName("org.mockito.exceptions.PrintableInvocation");
        Class locationType = Class.forName("org.mockito.internal.debugging.Location");
        Method createTooManyInvocationsMessageMethod = reporterClazz.getDeclaredMethod("createTooManyInvocationsMessage", intType, intType, stubbedInvocationMatcherType, locationType);
        createTooManyInvocationsMessageMethod.setAccessible(true);
        java.lang.Object[] createTooManyInvocationsMessageMethodArguments = new java.lang.Object[4];
        createTooManyInvocationsMessageMethodArguments[0] = -255;
        createTooManyInvocationsMessageMethodArguments[1] = -255;
        createTooManyInvocationsMessageMethodArguments[2] = stubbedInvocationMatcher;
        createTooManyInvocationsMessageMethodArguments[3] = ((Object) null);
        try {
            createTooManyInvocationsMessageMethod.invoke(reporter, createTooManyInvocationsMessageMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method createTooManyInvocationsMessage(int, int, org.mockito.exceptions.PrintableInvocation, org.mockito.internal.debugging.Location)
    
    @Test(expected = IllegalAccessError.class)
    public void testCreateTooManyInvocationsMessage1() throws Throwable  {
        Reporter reporter = new Reporter();
        Invocation invocation = ((Invocation) createInstance("org.mockito.internal.invocation.Invocation"));
        java.lang.Object[] arguments = new java.lang.Object[9];
        Object object = createInstance("java.lang.Object");
        arguments[0] = object;
        arguments[1] = object;
        arguments[3] = object;
        setField(invocation, "org.mockito.internal.invocation.Invocation", "arguments", arguments);
        
        Class reporterClazz = Class.forName("org.mockito.exceptions.Reporter");
        Class intType = int.class;
        Class invocationType = Class.forName("org.mockito.exceptions.PrintableInvocation");
        Class locationType = Class.forName("org.mockito.internal.debugging.Location");
        Method createTooManyInvocationsMessageMethod = reporterClazz.getDeclaredMethod("createTooManyInvocationsMessage", intType, intType, invocationType, locationType);
        createTooManyInvocationsMessageMethod.setAccessible(true);
        java.lang.Object[] createTooManyInvocationsMessageMethodArguments = new java.lang.Object[4];
        createTooManyInvocationsMessageMethodArguments[0] = 0;
        createTooManyInvocationsMessageMethodArguments[1] = 0;
        createTooManyInvocationsMessageMethodArguments[2] = invocation;
        createTooManyInvocationsMessageMethodArguments[3] = ((Object) null);
        try {
            createTooManyInvocationsMessageMethod.invoke(reporter, createTooManyInvocationsMessageMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = IllegalAccessError.class)
    public void testCreateTooManyInvocationsMessage2() throws Throwable  {
        Reporter reporter = new Reporter();
        Invocation invocation = ((Invocation) createInstance("org.mockito.internal.invocation.Invocation"));
        java.lang.Object[] arguments = new java.lang.Object[3];
        Object object = createInstance("java.lang.Object");
        arguments[1] = object;
        setField(invocation, "org.mockito.internal.invocation.Invocation", "arguments", arguments);
        
        Class reporterClazz = Class.forName("org.mockito.exceptions.Reporter");
        Class intType = int.class;
        Class invocationType = Class.forName("org.mockito.exceptions.PrintableInvocation");
        Class locationType = Class.forName("org.mockito.internal.debugging.Location");
        Method createTooManyInvocationsMessageMethod = reporterClazz.getDeclaredMethod("createTooManyInvocationsMessage", intType, intType, invocationType, locationType);
        createTooManyInvocationsMessageMethod.setAccessible(true);
        java.lang.Object[] createTooManyInvocationsMessageMethodArguments = new java.lang.Object[4];
        createTooManyInvocationsMessageMethodArguments[0] = 0;
        createTooManyInvocationsMessageMethodArguments[1] = 0;
        createTooManyInvocationsMessageMethodArguments[2] = invocation;
        createTooManyInvocationsMessageMethodArguments[3] = ((Object) null);
        try {
            createTooManyInvocationsMessageMethod.invoke(reporter, createTooManyInvocationsMessageMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = IllegalAccessError.class)
    public void testCreateTooManyInvocationsMessage3() throws Throwable  {
        Reporter reporter = new Reporter();
        Invocation invocation = ((Invocation) createInstance("org.mockito.internal.invocation.Invocation"));
        Object mock = createInstance("java.lang.Object");
        setField(invocation, "org.mockito.internal.invocation.Invocation", "mock", mock);
        java.lang.Object[] arguments = {null};
        setField(invocation, "org.mockito.internal.invocation.Invocation", "arguments", arguments);
        
        Class reporterClazz = Class.forName("org.mockito.exceptions.Reporter");
        Class intType = int.class;
        Class invocationType = Class.forName("org.mockito.exceptions.PrintableInvocation");
        Class locationType = Class.forName("org.mockito.internal.debugging.Location");
        Method createTooManyInvocationsMessageMethod = reporterClazz.getDeclaredMethod("createTooManyInvocationsMessage", intType, intType, invocationType, locationType);
        createTooManyInvocationsMessageMethod.setAccessible(true);
        java.lang.Object[] createTooManyInvocationsMessageMethodArguments = new java.lang.Object[4];
        createTooManyInvocationsMessageMethodArguments[0] = 0;
        createTooManyInvocationsMessageMethodArguments[1] = 0;
        createTooManyInvocationsMessageMethodArguments[2] = invocation;
        createTooManyInvocationsMessageMethodArguments[3] = ((Object) null);
        try {
            createTooManyInvocationsMessageMethod.invoke(reporter, createTooManyInvocationsMessageMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = IllegalAccessError.class)
    public void testCreateTooManyInvocationsMessage4() throws Throwable  {
        Reporter reporter = new Reporter();
        Invocation invocation = ((Invocation) createInstance("org.mockito.internal.invocation.Invocation"));
        Object mock = createInstance("java.lang.Object");
        setField(invocation, "org.mockito.internal.invocation.Invocation", "mock", mock);
        java.lang.Object[] arguments = {};
        setField(invocation, "org.mockito.internal.invocation.Invocation", "arguments", arguments);
        
        Class reporterClazz = Class.forName("org.mockito.exceptions.Reporter");
        Class intType = int.class;
        Class invocationType = Class.forName("org.mockito.exceptions.PrintableInvocation");
        Class locationType = Class.forName("org.mockito.internal.debugging.Location");
        Method createTooManyInvocationsMessageMethod = reporterClazz.getDeclaredMethod("createTooManyInvocationsMessage", intType, intType, invocationType, locationType);
        createTooManyInvocationsMessageMethod.setAccessible(true);
        java.lang.Object[] createTooManyInvocationsMessageMethodArguments = new java.lang.Object[4];
        createTooManyInvocationsMessageMethodArguments[0] = 0;
        createTooManyInvocationsMessageMethodArguments[1] = 0;
        createTooManyInvocationsMessageMethodArguments[2] = invocation;
        createTooManyInvocationsMessageMethodArguments[3] = ((Object) null);
        try {
            createTooManyInvocationsMessageMethod.invoke(reporter, createTooManyInvocationsMessageMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.mockito.exceptions.Reporter.neverWantedButInvoked
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method neverWantedButInvoked(org.mockito.exceptions.PrintableInvocation, org.mockito.internal.debugging.Location)
    
    /**
    @utbot.classUnderTest {@link Reporter}
 * @utbot.methodUnderTest {@link org.mockito.exceptions.Reporter#neverWantedButInvoked(org.mockito.exceptions.PrintableInvocation,org.mockito.internal.debugging.Location)}
 * @utbot.invokes {@link org.mockito.exceptions.PrintableInvocation#toString()}
 * @utbot.invokes {@link org.mockito.internal.util.StringJoiner#join(java.lang.Object[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: throw new NeverWantedButInvoked(join(wanted.toString(), "Never wanted here:", new Location(), "But invoked here:", firstUndesired, ""));
 *  */
    @Test
    public void testNeverWantedButInvoked_ThrowNullPointerException() {
        Reporter reporter = new Reporter();
        
        /* This test fails because method [org.mockito.exceptions.Reporter.neverWantedButInvoked] produces [java.lang.NullPointerException]
            org.mockito.exceptions.Reporter.neverWantedButInvoked(Reporter.java:305) */
        reporter.neverWantedButInvoked(null, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.mockito.exceptions.Reporter.tooManyActualInvocationsInOrder
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method tooManyActualInvocationsInOrder(int, int, org.mockito.exceptions.PrintableInvocation, org.mockito.internal.debugging.Location)
    
    /**
    @utbot.classUnderTest {@link Reporter}
 * @utbot.methodUnderTest {@link org.mockito.exceptions.Reporter#tooManyActualInvocationsInOrder(int,int,org.mockito.exceptions.PrintableInvocation,org.mockito.internal.debugging.Location)}
 * @utbot.throwsException {@link java.lang.IllegalAccessError} 
 *  */
    @Test(expected = IllegalAccessError.class)
    public void testTooManyActualInvocationsInOrder_ThrowIllegalAccessError_1() throws Exception  {
        Reporter reporter = new Reporter();
        Invocation invocation = ((Invocation) createInstance("org.mockito.internal.invocation.Invocation"));
        byte[] mock = {};
        setField(invocation, "org.mockito.internal.invocation.Invocation", "mock", mock);
        java.lang.Object[] arguments = {};
        setField(invocation, "org.mockito.internal.invocation.Invocation", "arguments", arguments);
        
        reporter.tooManyActualInvocationsInOrder(-255, -255, invocation, null);
    }
    
    /**
    @utbot.classUnderTest {@link Reporter}
 * @utbot.methodUnderTest {@link org.mockito.exceptions.Reporter#tooManyActualInvocationsInOrder(int,int,org.mockito.exceptions.PrintableInvocation,org.mockito.internal.debugging.Location)}
 * @utbot.throwsException {@link java.lang.IllegalAccessError} 
 *  */
    @Test(expected = IllegalAccessError.class)
    public void testTooManyActualInvocationsInOrder_ThrowIllegalAccessError() throws Exception  {
        Reporter reporter = new Reporter();
        Invocation invocation = ((Invocation) createInstance("org.mockito.internal.invocation.Invocation"));
        java.lang.Object[] arguments = {null};
        setField(invocation, "org.mockito.internal.invocation.Invocation", "arguments", arguments);
        
        reporter.tooManyActualInvocationsInOrder(-255, -255, invocation, null);
    }
    
    /**
    @utbot.classUnderTest {@link Reporter}
 * @utbot.methodUnderTest {@link org.mockito.exceptions.Reporter#tooManyActualInvocationsInOrder(int,int,org.mockito.exceptions.PrintableInvocation,org.mockito.internal.debugging.Location)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: String message = createTooManyInvocationsMessage(wantedCount, actualCount, wanted, firstUndesired);
 *  */
    @Test
    public void testTooManyActualInvocationsInOrder_ThrowNullPointerException() {
        Reporter reporter = new Reporter();
        
        /* This test fails because method [org.mockito.exceptions.Reporter.tooManyActualInvocationsInOrder] produces [java.lang.NullPointerException]
            org.mockito.exceptions.Reporter.createTooManyInvocationsMessage(Reporter.java:294)
            org.mockito.exceptions.Reporter.tooManyActualInvocationsInOrder(Reporter.java:315) */
        reporter.tooManyActualInvocationsInOrder(-255, -255, null, null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method tooManyActualInvocationsInOrder(int, int, org.mockito.exceptions.PrintableInvocation, org.mockito.internal.debugging.Location)
    
    /**
    @utbot.classUnderTest {@link Reporter}
 * @utbot.methodUnderTest {@link org.mockito.exceptions.Reporter#tooManyActualInvocationsInOrder(int,int,org.mockito.exceptions.PrintableInvocation,org.mockito.internal.debugging.Location)}
 * @utbot.invokes org.mockito.exceptions.Reporter#createTooManyInvocationsMessage(int,int,org.mockito.exceptions.PrintableInvocation,org.mockito.internal.debugging.Location)
 * @utbot.throwsException {@link org.mockito.exceptions.misusing.NotAMockException} 
 *  */
    @Test(expected = NotAMockException.class)
    public void testTooManyActualInvocationsInOrder_ThrowNotAMockException() throws Throwable  {
        Reporter reporter = new Reporter();
        StubbedInvocationMatcher stubbedInvocationMatcher = ((StubbedInvocationMatcher) createInstance("org.mockito.internal.stubbing.StubbedInvocationMatcher"));
        Invocation invocation = ((Invocation) createInstance("org.mockito.internal.invocation.Invocation"));
        setField(stubbedInvocationMatcher, "org.mockito.internal.invocation.InvocationMatcher", "invocation", invocation);
        ArrayList matchers = new ArrayList();
        setField(stubbedInvocationMatcher, "org.mockito.internal.invocation.InvocationMatcher", "matchers", matchers);
        
        Class reporterClazz = Class.forName("org.mockito.exceptions.Reporter");
        Class intType = int.class;
        Class stubbedInvocationMatcherType = Class.forName("org.mockito.exceptions.PrintableInvocation");
        Class locationType = Class.forName("org.mockito.internal.debugging.Location");
        Method tooManyActualInvocationsInOrderMethod = reporterClazz.getDeclaredMethod("tooManyActualInvocationsInOrder", intType, intType, stubbedInvocationMatcherType, locationType);
        tooManyActualInvocationsInOrderMethod.setAccessible(true);
        java.lang.Object[] tooManyActualInvocationsInOrderMethodArguments = new java.lang.Object[4];
        tooManyActualInvocationsInOrderMethodArguments[0] = -255;
        tooManyActualInvocationsInOrderMethodArguments[1] = -255;
        tooManyActualInvocationsInOrderMethodArguments[2] = stubbedInvocationMatcher;
        tooManyActualInvocationsInOrderMethodArguments[3] = ((Object) null);
        try {
            tooManyActualInvocationsInOrderMethod.invoke(reporter, tooManyActualInvocationsInOrderMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method tooManyActualInvocationsInOrder(int, int, org.mockito.exceptions.PrintableInvocation, org.mockito.internal.debugging.Location)
    
    @Test(expected = IllegalAccessError.class)
    public void testTooManyActualInvocationsInOrder1() throws Exception  {
        Reporter reporter = new Reporter();
        Invocation invocation = ((Invocation) createInstance("org.mockito.internal.invocation.Invocation"));
        java.lang.Object[] arguments = new java.lang.Object[9];
        Object object = createInstance("java.lang.Object");
        arguments[0] = object;
        arguments[1] = object;
        arguments[2] = object;
        java.lang.Object[] objectArray = {null, null, null, null, null, null};
        arguments[4] = objectArray;
        arguments[5] = objectArray;
        arguments[6] = objectArray;
        arguments[7] = objectArray;
        arguments[8] = objectArray;
        setField(invocation, "org.mockito.internal.invocation.Invocation", "arguments", arguments);
        
        reporter.tooManyActualInvocationsInOrder(0, 0, invocation, null);
    }
    
    @Test(expected = IllegalAccessError.class)
    public void testTooManyActualInvocationsInOrder2() throws Exception  {
        Reporter reporter = new Reporter();
        Invocation invocation = ((Invocation) createInstance("org.mockito.internal.invocation.Invocation"));
        java.lang.Object[] arguments = new java.lang.Object[9];
        Object object = createInstance("java.lang.Object");
        arguments[1] = object;
        arguments[2] = object;
        arguments[3] = object;
        java.lang.Object[] objectArray = {null, null, null, null, null, null};
        arguments[4] = objectArray;
        arguments[5] = objectArray;
        arguments[6] = objectArray;
        arguments[7] = objectArray;
        arguments[8] = objectArray;
        setField(invocation, "org.mockito.internal.invocation.Invocation", "arguments", arguments);
        
        reporter.tooManyActualInvocationsInOrder(0, 0, invocation, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.mockito.exceptions.Reporter.cannotStubWithNullThrowable
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method cannotStubWithNullThrowable()
    
    /**
    @utbot.classUnderTest {@link Reporter}
 * @utbot.methodUnderTest {@link org.mockito.exceptions.Reporter#cannotStubWithNullThrowable()}
 * @utbot.invokes {@link org.mockito.internal.util.StringJoiner#join(java.lang.Object[])}
 * @utbot.throwsException {@link org.mockito.exceptions.base.MockitoException} in: throw new MockitoException(join("Cannot stub with null throwable!"));
 *  */
    @Test(expected = MockitoException.class)
    public void testCannotStubWithNullThrowable_ThrowMockitoException() {
        Reporter reporter = new Reporter();
        
        reporter.cannotStubWithNullThrowable();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.mockito.exceptions.Reporter.unfinishedVerificationException
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method unfinishedVerificationException(org.mockito.internal.debugging.Location)
    
    /**
    @utbot.classUnderTest {@link Reporter}
 * @utbot.methodUnderTest {@link org.mockito.exceptions.Reporter#unfinishedVerificationException(org.mockito.internal.debugging.Location)}
 * @utbot.invokes {@link org.mockito.internal.util.StringJoiner#join(java.lang.Object[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: throw exception;
 *  */
    @Test
    public void testUnfinishedVerificationException_ThrowNullPointerException() {
        Reporter reporter = new Reporter();
        
        /* This test fails because method [org.mockito.exceptions.Reporter.unfinishedVerificationException] produces [java.lang.NullPointerException]
            org.mockito.internal.util.StringJoiner.join(StringJoiner.java:12)
            org.mockito.exceptions.Reporter.unfinishedVerificationException(Reporter.java:93) */
        reporter.unfinishedVerificationException(null);
    }
    ///endregion
    
    ///region FUZZER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method unfinishedVerificationException(org.mockito.internal.debugging.Location)
    
    /**
     * @utbot.classUnderTest {@link org.mockito.exceptions.Reporter}
     * @utbot.methodUnderTest {@link org.mockito.exceptions.Reporter#unfinishedVerificationException(org.mockito.internal.debugging.Location)}
     */
    @Test(expected = UnfinishedVerificationException.class)
    public void testUnfinishedVerificationExceptionThrowsUVE() {
        Reporter reporter = new Reporter();
        Location location = new Location();
        
        reporter.unfinishedVerificationException(location);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.mockito.exceptions.Reporter.nullPassedToWhenMethod
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method nullPassedToWhenMethod()
    
    /**
    @utbot.classUnderTest {@link Reporter}
 * @utbot.methodUnderTest {@link org.mockito.exceptions.Reporter#nullPassedToWhenMethod()}
 * @utbot.invokes {@link org.mockito.internal.util.StringJoiner#join(java.lang.Object[])}
 * @utbot.throwsException {@link org.mockito.exceptions.misusing.NullInsteadOfMockException} in: throw new NullInsteadOfMockException(join("Argument passed to when() is null!", "Example of correct stubbing:", "    doThrow(new RuntimeException()).when(mock).someMethod();", "Also, if you use @Mock annotation don't miss initMocks()"));
 *  */
    @Test(expected = NullInsteadOfMockException.class)
    public void testNullPassedToWhenMethod_ThrowNullInsteadOfMockException() {
        Reporter reporter = new Reporter();
        
        reporter.nullPassedToWhenMethod();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.mockito.exceptions.Reporter.inOrderRequiresFamiliarMock
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method inOrderRequiresFamiliarMock()
    
    /**
    @utbot.classUnderTest {@link Reporter}
 * @utbot.methodUnderTest {@link org.mockito.exceptions.Reporter#inOrderRequiresFamiliarMock()}
 * @utbot.invokes {@link org.mockito.internal.util.StringJoiner#join(java.lang.Object[])}
 * @utbot.throwsException {@link org.mockito.exceptions.base.MockitoException} in: throw new MockitoException(join("InOrder can only verify mocks that were passed in during creation of InOrder.", "For example:", "    InOrder inOrder = inOrder(mockOne);", "    inOrder.verify(mockOne).doStuff();"));
 *  */
    @Test(expected = MockitoException.class)
    public void testInOrderRequiresFamiliarMock_ThrowMockitoException() {
        Reporter reporter = new Reporter();
        
        reporter.inOrderRequiresFamiliarMock();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.mockito.exceptions.Reporter.invalidUseOfMatchers
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method invalidUseOfMatchers(int, int)
    
    /**
    @utbot.classUnderTest {@link Reporter}
 * @utbot.methodUnderTest {@link org.mockito.exceptions.Reporter#invalidUseOfMatchers(int,int)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(int)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(int)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#toString()}
 * @utbot.invokes {@link org.mockito.internal.util.StringJoiner#join(java.lang.Object[])}
 * @utbot.throwsException {@link org.mockito.exceptions.misusing.InvalidUseOfMatchersException} in: throw new InvalidUseOfMatchersException(join("Invalid use of argument matchers!", expectedMatchersCount + " matchers expected, " + recordedMatchersCount + " recorded.", "This exception may occur if matchers are combined with raw values:", "    //incorrect:", "    someMethod(anyObject(), \"raw String\");", "When using matchers, all arguments have to be provided by matchers.", "For example:", "    //correct:", "    someMethod(anyObject(), eq(\"String by matcher\"));", "", "For more info see javadoc for Matchers class."));
 *  */
    @Test(expected = InvalidUseOfMatchersException.class)
    public void testInvalidUseOfMatchers_ThrowInvalidUseOfMatchersException() {
        Reporter reporter = new Reporter();
        
        reporter.invalidUseOfMatchers(1, -255);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.mockito.exceptions.Reporter.wantedButNotInvokedInOrder
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method wantedButNotInvokedInOrder(org.mockito.exceptions.PrintableInvocation, org.mockito.exceptions.PrintableInvocation)
    
    /**
    @utbot.classUnderTest {@link Reporter}
 * @utbot.methodUnderTest {@link org.mockito.exceptions.Reporter#wantedButNotInvokedInOrder(org.mockito.exceptions.PrintableInvocation,org.mockito.exceptions.PrintableInvocation)}
 * @utbot.invokes {@link org.mockito.exceptions.PrintableInvocation#toString()}
 * @utbot.invokes {@link org.mockito.exceptions.PrintableInvocation#toString()}
 * @utbot.invokes {@link org.mockito.exceptions.PrintableInvocation#getLocation()}
 * @utbot.invokes {@link org.mockito.internal.util.StringJoiner#join(java.lang.Object[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: throw new VerificationInOrderFailure(join("Verification in order failure", "Wanted but not invoked:", wanted.toString(), new Location(), "Wanted anywhere AFTER following interaction:", previous.toString(), previous.getLocation(), ""));
 *  */
    @Test
    public void testWantedButNotInvokedInOrder_ThrowNullPointerException() {
        Reporter reporter = new Reporter();
        
        /* This test fails because method [org.mockito.exceptions.Reporter.wantedButNotInvokedInOrder] produces [java.lang.NullPointerException]
            org.mockito.exceptions.Reporter.wantedButNotInvokedInOrder(Reporter.java:277) */
        reporter.wantedButNotInvokedInOrder(null, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.mockito.exceptions.Reporter.tooManyActualInvocations
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method tooManyActualInvocations(int, int, org.mockito.exceptions.PrintableInvocation, org.mockito.internal.debugging.Location)
    
    /**
    @utbot.classUnderTest {@link Reporter}
 * @utbot.methodUnderTest {@link org.mockito.exceptions.Reporter#tooManyActualInvocations(int,int,org.mockito.exceptions.PrintableInvocation,org.mockito.internal.debugging.Location)}
 * @utbot.throwsException {@link java.lang.IllegalAccessError} 
 *  */
    @Test(expected = IllegalAccessError.class)
    public void testTooManyActualInvocations_ThrowIllegalAccessError() throws Exception  {
        Reporter reporter = new Reporter();
        Invocation invocation = ((Invocation) createInstance("org.mockito.internal.invocation.Invocation"));
        byte[] mock = {};
        setField(invocation, "org.mockito.internal.invocation.Invocation", "mock", mock);
        java.lang.Object[] arguments = {};
        setField(invocation, "org.mockito.internal.invocation.Invocation", "arguments", arguments);
        
        reporter.tooManyActualInvocations(-255, -255, invocation, null);
    }
    
    /**
    @utbot.classUnderTest {@link Reporter}
 * @utbot.methodUnderTest {@link org.mockito.exceptions.Reporter#tooManyActualInvocations(int,int,org.mockito.exceptions.PrintableInvocation,org.mockito.internal.debugging.Location)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: String message = createTooManyInvocationsMessage(wantedCount, actualCount, wanted, firstUndesired);
 *  */
    @Test
    public void testTooManyActualInvocations_ThrowNullPointerException() {
        Reporter reporter = new Reporter();
        
        /* This test fails because method [org.mockito.exceptions.Reporter.tooManyActualInvocations] produces [java.lang.NullPointerException]
            org.mockito.exceptions.Reporter.createTooManyInvocationsMessage(Reporter.java:294)
            org.mockito.exceptions.Reporter.tooManyActualInvocations(Reporter.java:287) */
        reporter.tooManyActualInvocations(-255, -255, null, null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method tooManyActualInvocations(int, int, org.mockito.exceptions.PrintableInvocation, org.mockito.internal.debugging.Location)
    
    /**
    @utbot.classUnderTest {@link Reporter}
 * @utbot.methodUnderTest {@link org.mockito.exceptions.Reporter#tooManyActualInvocations(int,int,org.mockito.exceptions.PrintableInvocation,org.mockito.internal.debugging.Location)}
 * @utbot.invokes org.mockito.exceptions.Reporter#createTooManyInvocationsMessage(int,int,org.mockito.exceptions.PrintableInvocation,org.mockito.internal.debugging.Location)
 * @utbot.throwsException {@link org.mockito.exceptions.misusing.NotAMockException} 
 *  */
    @Test(expected = NotAMockException.class)
    public void testTooManyActualInvocations_ThrowNotAMockException() throws Throwable  {
        Reporter reporter = new Reporter();
        StubbedInvocationMatcher stubbedInvocationMatcher = ((StubbedInvocationMatcher) createInstance("org.mockito.internal.stubbing.StubbedInvocationMatcher"));
        Invocation invocation = ((Invocation) createInstance("org.mockito.internal.invocation.Invocation"));
        setField(stubbedInvocationMatcher, "org.mockito.internal.invocation.InvocationMatcher", "invocation", invocation);
        ArrayList matchers = new ArrayList();
        setField(stubbedInvocationMatcher, "org.mockito.internal.invocation.InvocationMatcher", "matchers", matchers);
        
        Class reporterClazz = Class.forName("org.mockito.exceptions.Reporter");
        Class intType = int.class;
        Class stubbedInvocationMatcherType = Class.forName("org.mockito.exceptions.PrintableInvocation");
        Class locationType = Class.forName("org.mockito.internal.debugging.Location");
        Method tooManyActualInvocationsMethod = reporterClazz.getDeclaredMethod("tooManyActualInvocations", intType, intType, stubbedInvocationMatcherType, locationType);
        tooManyActualInvocationsMethod.setAccessible(true);
        java.lang.Object[] tooManyActualInvocationsMethodArguments = new java.lang.Object[4];
        tooManyActualInvocationsMethodArguments[0] = -255;
        tooManyActualInvocationsMethodArguments[1] = -255;
        tooManyActualInvocationsMethodArguments[2] = stubbedInvocationMatcher;
        tooManyActualInvocationsMethodArguments[3] = ((Object) null);
        try {
            tooManyActualInvocationsMethod.invoke(reporter, tooManyActualInvocationsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method tooManyActualInvocations(int, int, org.mockito.exceptions.PrintableInvocation, org.mockito.internal.debugging.Location)
    
    @Test(expected = IllegalAccessError.class)
    public void testTooManyActualInvocations1() throws Exception  {
        Reporter reporter = new Reporter();
        Invocation invocation = ((Invocation) createInstance("org.mockito.internal.invocation.Invocation"));
        java.lang.Object[] arguments = new java.lang.Object[9];
        Object object = createInstance("java.lang.Object");
        arguments[0] = object;
        arguments[2] = object;
        arguments[3] = object;
        java.lang.Object[] objectArray = {null, null, null, null, null, null};
        arguments[4] = objectArray;
        arguments[5] = objectArray;
        arguments[6] = objectArray;
        arguments[7] = objectArray;
        arguments[8] = objectArray;
        setField(invocation, "org.mockito.internal.invocation.Invocation", "arguments", arguments);
        
        reporter.tooManyActualInvocations(0, 0, invocation, null);
    }
    
    @Test(expected = IllegalAccessError.class)
    public void testTooManyActualInvocations2() throws Exception  {
        Reporter reporter = new Reporter();
        Invocation invocation = ((Invocation) createInstance("org.mockito.internal.invocation.Invocation"));
        java.lang.Object[] arguments = new java.lang.Object[9];
        Object object = createInstance("java.lang.Object");
        arguments[1] = object;
        arguments[2] = object;
        arguments[3] = object;
        java.lang.Object[] objectArray = {null, null, null, null, null, null};
        arguments[4] = objectArray;
        arguments[5] = objectArray;
        arguments[6] = objectArray;
        arguments[7] = objectArray;
        arguments[8] = objectArray;
        setField(invocation, "org.mockito.internal.invocation.Invocation", "arguments", arguments);
        
        reporter.tooManyActualInvocations(0, 0, invocation, null);
    }
    
    @Test(expected = IllegalAccessError.class)
    public void testTooManyActualInvocations3() throws Exception  {
        Reporter reporter = new Reporter();
        Invocation invocation = ((Invocation) createInstance("org.mockito.internal.invocation.Invocation"));
        Object mock = createInstance("java.lang.Object");
        setField(invocation, "org.mockito.internal.invocation.Invocation", "mock", mock);
        java.lang.Object[] arguments = {null};
        setField(invocation, "org.mockito.internal.invocation.Invocation", "arguments", arguments);
        
        reporter.tooManyActualInvocations(0, 0, invocation, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.mockito.exceptions.Reporter.noMoreInteractionsWantedInOrder
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method noMoreInteractionsWantedInOrder(org.mockito.internal.invocation.Invocation)
    
    /**
    @utbot.classUnderTest {@link Reporter}
 * @utbot.methodUnderTest {@link org.mockito.exceptions.Reporter#noMoreInteractionsWantedInOrder(org.mockito.internal.invocation.Invocation)}
 * @utbot.invokes {@link org.mockito.internal.invocation.Invocation#getLocation()}
 * @utbot.invokes {@link org.mockito.internal.util.StringJoiner#join(java.lang.Object[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: throw new VerificationInOrderFailure(join("No interactions wanted here:", new Location(), "But found this interaction:", undesired.getLocation(), ""));
 *  */
    @Test
    public void testNoMoreInteractionsWantedInOrder_ThrowNullPointerException() {
        Reporter reporter = new Reporter();
        
        /* This test fails because method [org.mockito.exceptions.Reporter.noMoreInteractionsWantedInOrder] produces [java.lang.NullPointerException]
            org.mockito.exceptions.Reporter.noMoreInteractionsWantedInOrder(Reporter.java:369) */
        reporter.noMoreInteractionsWantedInOrder(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.mockito.exceptions.Reporter.cannotVerifyToString
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method cannotVerifyToString()
    
    /**
    @utbot.classUnderTest {@link Reporter}
 * @utbot.methodUnderTest {@link org.mockito.exceptions.Reporter#cannotVerifyToString()}
 * @utbot.invokes {@link org.mockito.internal.util.StringJoiner#join(java.lang.Object[])}
 * @utbot.throwsException {@link org.mockito.exceptions.base.MockitoException} in: throw new MockitoException(join("Mockito cannot verify toString()", "toString() is too often used behind of scenes  (i.e. during String concatenation, in IDE debugging views). " + "Verifying it may give inconsistent or hard to understand results. " + "Not to mention that verifying toString() most likely hints awkward design (hard to explain in a short exception message. Trust me...)", "However, it is possible to stub toString(). Stubbing toString() smells a bit funny but there are rare, legitimate use cases."));
 *  */
    @Test(expected = MockitoException.class)
    public void testCannotVerifyToString_ThrowMockitoException() {
        Reporter reporter = new Reporter();
        
        reporter.cannotVerifyToString();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.mockito.exceptions.Reporter.cannotInitializeForSpyAnnotation
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method cannotInitializeForSpyAnnotation(java.lang.String, java.lang.Exception)
    
    /**
    @utbot.classUnderTest {@link Reporter}
 * @utbot.methodUnderTest {@link org.mockito.exceptions.Reporter#cannotInitializeForSpyAnnotation(java.lang.String,java.lang.Exception)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#toString()}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.Exception#getMessage()}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#toString()}
 * @utbot.invokes {@link org.mockito.internal.util.StringJoiner#join(java.lang.Object[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: throw new MockitoException(join("Cannot instianate a @Spy for '" + fieldName + "' field.", "You haven't provided the instance for spying at field declaration so I tried to construct the instance.", "However, I failed because: " + details.getMessage(), "Examples of correct usage of @Spy:", "   @Spy List mock = new LinkedList();", "   @Spy Foo foo; //only if Foo has parameterless constructor", "   //also, don't forget about MockitoAnnotations.initMocks();", ""), details);
 *  */
    @Test
    public void testCannotInitializeForSpyAnnotation_ThrowNullPointerException() {
        Reporter reporter = new Reporter();
        
        /* This test fails because method [org.mockito.exceptions.Reporter.cannotInitializeForSpyAnnotation] produces [java.lang.NullPointerException]
            org.mockito.exceptions.Reporter.cannotInitializeForSpyAnnotation(Reporter.java:534) */
        reporter.cannotInitializeForSpyAnnotation(null, null);
    }
    ///endregion
    
    ///region FUZZER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method cannotInitializeForSpyAnnotation(java.lang.String, java.lang.Exception)
    
    /**
     * @utbot.classUnderTest {@link org.mockito.exceptions.Reporter}
     * @utbot.methodUnderTest {@link org.mockito.exceptions.Reporter#cannotInitializeForSpyAnnotation(java.lang.String,java.lang.Exception)}
     */
    @Test(expected = MockitoException.class)
    public void testCannotInitializeForSpyAnnotationThrowsMEWithNonEmptyString() {
        Reporter reporter = new Reporter();
        Exception exception = new Exception("abc");
        java.lang.StackTraceElement[] stackTraceElementArray = new java.lang.StackTraceElement[2];
        StackTraceElement stackTraceElement = new StackTraceElement("\n\t\r", "   //also, don't forget about MockitoAnnotations.initMocks();", "   @Spy List mock = new LinkedList();", "However, I failed because: ", "", "", Integer.MAX_VALUE);
        stackTraceElementArray[0] = stackTraceElement;
        StackTraceElement stackTraceElement1 = new StackTraceElement("' field.", "' field.", "Examples of correct usage of @Spy:", 7);
        stackTraceElementArray[1] = stackTraceElement1;
        exception.setStackTrace(stackTraceElementArray);
        
        reporter.cannotInitializeForSpyAnnotation("-3c", exception);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.mockito.exceptions.Reporter.cannotCallRealMethodOnInterface
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method cannotCallRealMethodOnInterface()
    
    /**
    @utbot.classUnderTest {@link Reporter}
 * @utbot.methodUnderTest {@link org.mockito.exceptions.Reporter#cannotCallRealMethodOnInterface()}
 * @utbot.invokes {@link org.mockito.internal.util.StringJoiner#join(java.lang.Object[])}
 * @utbot.throwsException {@link org.mockito.exceptions.base.MockitoException} in: throw new MockitoException(join("Cannot call real method on java interface. Interface does not have any implementation!", "Calling real methods is only possible when mocking concrete classes.", "  //correct example:", "  when(mockOfConcreteClass.doStuff()).thenCallRealMethod();"));
 *  */
    @Test(expected = MockitoException.class)
    public void testCannotCallRealMethodOnInterface_ThrowMockitoException() {
        Reporter reporter = new Reporter();
        
        reporter.cannotCallRealMethodOnInterface();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.mockito.exceptions.Reporter.createTooLittleInvocationsMessage
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method createTooLittleInvocationsMessage(org.mockito.exceptions.Discrepancy, org.mockito.exceptions.PrintableInvocation, org.mockito.internal.debugging.Location)
    
    /**
    @utbot.classUnderTest {@link Reporter}
 * @utbot.methodUnderTest {@link org.mockito.exceptions.Reporter#createTooLittleInvocationsMessage(org.mockito.exceptions.Discrepancy,org.mockito.exceptions.PrintableInvocation,org.mockito.internal.debugging.Location)}
 * @utbot.executesCondition {@code ((lastActualInvocation != null)): False}
 * @utbot.invokes {@link org.mockito.exceptions.PrintableInvocation#toString()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: wanted.toString()
 *  */
    @Test
    public void testCreateTooLittleInvocationsMessage_ThrowNullPointerException() throws Throwable  {
        Reporter reporter = new Reporter();
        
        /* This test fails because method [org.mockito.exceptions.Reporter.createTooLittleInvocationsMessage] produces [java.lang.NullPointerException]
            org.mockito.exceptions.Reporter.createTooLittleInvocationsMessage(Reporter.java:327) */
        Class reporterClazz = Class.forName("org.mockito.exceptions.Reporter");
        Class discrepancyType = Class.forName("org.mockito.exceptions.Discrepancy");
        Class printableInvocationType = Class.forName("org.mockito.exceptions.PrintableInvocation");
        Class locationType = Class.forName("org.mockito.internal.debugging.Location");
        Method createTooLittleInvocationsMessageMethod = reporterClazz.getDeclaredMethod("createTooLittleInvocationsMessage", discrepancyType, printableInvocationType, locationType);
        createTooLittleInvocationsMessageMethod.setAccessible(true);
        java.lang.Object[] createTooLittleInvocationsMessageMethodArguments = new java.lang.Object[3];
        createTooLittleInvocationsMessageMethodArguments[0] = ((Object) null);
        createTooLittleInvocationsMessageMethodArguments[1] = ((Object) null);
        createTooLittleInvocationsMessageMethodArguments[2] = ((Object) null);
        try {
            createTooLittleInvocationsMessageMethod.invoke(reporter, createTooLittleInvocationsMessageMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link Reporter}
 * @utbot.methodUnderTest {@link org.mockito.exceptions.Reporter#createTooLittleInvocationsMessage(org.mockito.exceptions.Discrepancy,org.mockito.exceptions.PrintableInvocation,org.mockito.internal.debugging.Location)}
 * @utbot.executesCondition {@code ((lastActualInvocation != null)): True}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: lastActualInvocation + "\n"
 *  */
    @Test
    public void testCreateTooLittleInvocationsMessage_ThrowNullPointerException_1() throws Throwable  {
        Reporter reporter = new Reporter();
        Location location = ((Location) createInstance("org.mockito.internal.debugging.Location"));
        InterruptedException stackTraceHolder = ((InterruptedException) createInstance("java.lang.InterruptedException"));
        setField(location, "org.mockito.internal.debugging.Location", "stackTraceHolder", stackTraceHolder);
        StackTraceFilter stackTraceFilter = ((StackTraceFilter) createInstance("org.mockito.internal.exceptions.base.StackTraceFilter"));
        setField(location, "org.mockito.internal.debugging.Location", "stackTraceFilter", stackTraceFilter);
        
        /* This test fails because method [org.mockito.exceptions.Reporter.createTooLittleInvocationsMessage] produces [java.lang.NullPointerException]
            org.mockito.exceptions.Reporter.createTooLittleInvocationsMessage(Reporter.java:327) */
        Class reporterClazz = Class.forName("org.mockito.exceptions.Reporter");
        Class discrepancyType = Class.forName("org.mockito.exceptions.Discrepancy");
        Class printableInvocationType = Class.forName("org.mockito.exceptions.PrintableInvocation");
        Class locationType = Class.forName("org.mockito.internal.debugging.Location");
        Method createTooLittleInvocationsMessageMethod = reporterClazz.getDeclaredMethod("createTooLittleInvocationsMessage", discrepancyType, printableInvocationType, locationType);
        createTooLittleInvocationsMessageMethod.setAccessible(true);
        java.lang.Object[] createTooLittleInvocationsMessageMethodArguments = new java.lang.Object[3];
        createTooLittleInvocationsMessageMethodArguments[0] = ((Object) null);
        createTooLittleInvocationsMessageMethodArguments[1] = ((Object) null);
        createTooLittleInvocationsMessageMethodArguments[2] = location;
        try {
            createTooLittleInvocationsMessageMethod.invoke(reporter, createTooLittleInvocationsMessageMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method createTooLittleInvocationsMessage(org.mockito.exceptions.Discrepancy, org.mockito.exceptions.PrintableInvocation, org.mockito.internal.debugging.Location)
    
    @Test(expected = IllegalAccessError.class)
    public void testCreateTooLittleInvocationsMessage1() throws Throwable  {
        Reporter reporter = new Reporter();
        Invocation invocation = ((Invocation) createInstance("org.mockito.internal.invocation.Invocation"));
        java.lang.Object[] arguments = new java.lang.Object[10];
        String string = "";
        arguments[0] = ((Object) string);
        Object object = createInstance("java.lang.Object");
        arguments[2] = object;
        arguments[3] = object;
        arguments[4] = object;
        arguments[5] = object;
        arguments[6] = object;
        arguments[7] = object;
        arguments[8] = object;
        arguments[9] = object;
        setField(invocation, "org.mockito.internal.invocation.Invocation", "arguments", arguments);
        
        Class reporterClazz = Class.forName("org.mockito.exceptions.Reporter");
        Class discrepancyType = Class.forName("org.mockito.exceptions.Discrepancy");
        Class invocationType = Class.forName("org.mockito.exceptions.PrintableInvocation");
        Class locationType = Class.forName("org.mockito.internal.debugging.Location");
        Method createTooLittleInvocationsMessageMethod = reporterClazz.getDeclaredMethod("createTooLittleInvocationsMessage", discrepancyType, invocationType, locationType);
        createTooLittleInvocationsMessageMethod.setAccessible(true);
        java.lang.Object[] createTooLittleInvocationsMessageMethodArguments = new java.lang.Object[3];
        createTooLittleInvocationsMessageMethodArguments[0] = ((Object) null);
        createTooLittleInvocationsMessageMethodArguments[1] = invocation;
        createTooLittleInvocationsMessageMethodArguments[2] = ((Object) null);
        try {
            createTooLittleInvocationsMessageMethod.invoke(reporter, createTooLittleInvocationsMessageMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testCreateTooLittleInvocationsMessage2() throws Throwable  {
        Reporter reporter = new Reporter();
        Invocation invocation = ((Invocation) createInstance("org.mockito.internal.invocation.Invocation"));
        Location location = ((Location) createInstance("org.mockito.internal.debugging.Location"));
        StreamCorruptedException stackTraceHolder = ((StreamCorruptedException) createInstance("java.io.StreamCorruptedException"));
        setField(location, "org.mockito.internal.debugging.Location", "stackTraceHolder", stackTraceHolder);
        StackTraceFilter stackTraceFilter = ((StackTraceFilter) createInstance("org.mockito.internal.exceptions.base.StackTraceFilter"));
        setField(location, "org.mockito.internal.debugging.Location", "stackTraceFilter", stackTraceFilter);
        
        /* This test fails because method [org.mockito.exceptions.Reporter.createTooLittleInvocationsMessage] produces [java.lang.NullPointerException]
            org.mockito.internal.invocation.Invocation.argumentsToMatchers(Invocation.java:144)
            org.mockito.internal.invocation.Invocation.toString(Invocation.java:125)
            org.mockito.exceptions.Reporter.createTooLittleInvocationsMessage(Reporter.java:327) */
        Class reporterClazz = Class.forName("org.mockito.exceptions.Reporter");
        Class discrepancyType = Class.forName("org.mockito.exceptions.Discrepancy");
        Class invocationType = Class.forName("org.mockito.exceptions.PrintableInvocation");
        Class locationType = Class.forName("org.mockito.internal.debugging.Location");
        Method createTooLittleInvocationsMessageMethod = reporterClazz.getDeclaredMethod("createTooLittleInvocationsMessage", discrepancyType, invocationType, locationType);
        createTooLittleInvocationsMessageMethod.setAccessible(true);
        java.lang.Object[] createTooLittleInvocationsMessageMethodArguments = new java.lang.Object[3];
        createTooLittleInvocationsMessageMethodArguments[0] = ((Object) null);
        createTooLittleInvocationsMessageMethodArguments[1] = invocation;
        createTooLittleInvocationsMessageMethodArguments[2] = location;
        try {
            createTooLittleInvocationsMessageMethod.invoke(reporter, createTooLittleInvocationsMessageMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region Errors report for createTooLittleInvocationsMessage
    
    public void testCreateTooLittleInvocationsMessage_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 3 occurrences of:
        // Concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.mockito.exceptions.Reporter.tooLittleActualInvocationsInOrder
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method tooLittleActualInvocationsInOrder(org.mockito.exceptions.Discrepancy, org.mockito.exceptions.PrintableInvocation, org.mockito.internal.debugging.Location)
    
    /**
    @utbot.classUnderTest {@link Reporter}
 * @utbot.methodUnderTest {@link org.mockito.exceptions.Reporter#tooLittleActualInvocationsInOrder(org.mockito.exceptions.Discrepancy,org.mockito.exceptions.PrintableInvocation,org.mockito.internal.debugging.Location)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: String message = createTooLittleInvocationsMessage(discrepancy, wanted, lastActualLocation);
 *  */
    @Test
    public void testTooLittleActualInvocationsInOrder_ThrowNullPointerException() {
        Reporter reporter = new Reporter();
        
        /* This test fails because method [org.mockito.exceptions.Reporter.tooLittleActualInvocationsInOrder] produces [java.lang.NullPointerException]
            org.mockito.exceptions.Reporter.createTooLittleInvocationsMessage(Reporter.java:327)
            org.mockito.exceptions.Reporter.tooLittleActualInvocationsInOrder(Reporter.java:343) */
        reporter.tooLittleActualInvocationsInOrder(null, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link Reporter}
 * @utbot.methodUnderTest {@link org.mockito.exceptions.Reporter#tooLittleActualInvocationsInOrder(org.mockito.exceptions.Discrepancy,org.mockito.exceptions.PrintableInvocation,org.mockito.internal.debugging.Location)}
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test
    public void testTooLittleActualInvocationsInOrder_ThrowNullPointerException_1() throws Exception  {
        Reporter reporter = new Reporter();
        Location location = ((Location) createInstance("org.mockito.internal.debugging.Location"));
        InterruptedException stackTraceHolder = ((InterruptedException) createInstance("java.lang.InterruptedException"));
        setField(location, "org.mockito.internal.debugging.Location", "stackTraceHolder", stackTraceHolder);
        StackTraceFilter stackTraceFilter = ((StackTraceFilter) createInstance("org.mockito.internal.exceptions.base.StackTraceFilter"));
        setField(location, "org.mockito.internal.debugging.Location", "stackTraceFilter", stackTraceFilter);
        
        /* This test fails because method [org.mockito.exceptions.Reporter.tooLittleActualInvocationsInOrder] produces [java.lang.NullPointerException]
            org.mockito.exceptions.Reporter.createTooLittleInvocationsMessage(Reporter.java:327)
            org.mockito.exceptions.Reporter.tooLittleActualInvocationsInOrder(Reporter.java:343) */
        reporter.tooLittleActualInvocationsInOrder(null, null, location);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method tooLittleActualInvocationsInOrder(org.mockito.exceptions.Discrepancy, org.mockito.exceptions.PrintableInvocation, org.mockito.internal.debugging.Location)
    
    @Test(expected = IllegalAccessError.class)
    public void testTooLittleActualInvocationsInOrder1() throws Exception  {
        Reporter reporter = new Reporter();
        Invocation invocation = ((Invocation) createInstance("org.mockito.internal.invocation.Invocation"));
        java.lang.Object[] arguments = new java.lang.Object[10];
        Object object = createInstance("java.lang.Object");
        arguments[0] = object;
        char[] charArray = {'\u0000'};
        arguments[2] = ((Object) charArray);
        arguments[3] = ((Object) charArray);
        arguments[4] = ((Object) charArray);
        arguments[5] = ((Object) charArray);
        arguments[6] = ((Object) charArray);
        arguments[7] = ((Object) charArray);
        arguments[8] = ((Object) charArray);
        arguments[9] = ((Object) charArray);
        setField(invocation, "org.mockito.internal.invocation.Invocation", "arguments", arguments);
        
        reporter.tooLittleActualInvocationsInOrder(null, invocation, null);
    }
    
    @Test(expected = IllegalAccessError.class)
    public void testTooLittleActualInvocationsInOrder2() throws Exception  {
        Reporter reporter = new Reporter();
        Invocation invocation = ((Invocation) createInstance("org.mockito.internal.invocation.Invocation"));
        java.lang.Object[] arguments = {};
        setField(invocation, "org.mockito.internal.invocation.Invocation", "arguments", arguments);
        
        reporter.tooLittleActualInvocationsInOrder(null, invocation, null);
    }
    
    @Test
    public void testTooLittleActualInvocationsInOrder3() throws Exception  {
        Reporter reporter = new Reporter();
        Invocation invocation = ((Invocation) createInstance("org.mockito.internal.invocation.Invocation"));
        Location location = ((Location) createInstance("org.mockito.internal.debugging.Location"));
        Object stackTraceHolder = createInstance("java.lang.invoke.InvokerBytecodeGenerator$BytecodeGenerationException");
        setField(location, "org.mockito.internal.debugging.Location", "stackTraceHolder", stackTraceHolder);
        StackTraceFilter stackTraceFilter = ((StackTraceFilter) createInstance("org.mockito.internal.exceptions.base.StackTraceFilter"));
        setField(location, "org.mockito.internal.debugging.Location", "stackTraceFilter", stackTraceFilter);
        
        /* This test fails because method [org.mockito.exceptions.Reporter.tooLittleActualInvocationsInOrder] produces [java.lang.NullPointerException]
            org.mockito.internal.invocation.Invocation.argumentsToMatchers(Invocation.java:144)
            org.mockito.internal.invocation.Invocation.toString(Invocation.java:125)
            org.mockito.exceptions.Reporter.createTooLittleInvocationsMessage(Reporter.java:327)
            org.mockito.exceptions.Reporter.tooLittleActualInvocationsInOrder(Reporter.java:343) */
        reporter.tooLittleActualInvocationsInOrder(null, invocation, location);
    }
    ///endregion
    
    ///region Errors report for tooLittleActualInvocationsInOrder
    
    public void testTooLittleActualInvocationsInOrder_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 3 occurrences of:
        // Concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.mockito.exceptions.Reporter.misplacedArgumentMatcher
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method misplacedArgumentMatcher(org.mockito.internal.debugging.Location)
    
    /**
    @utbot.classUnderTest {@link Reporter}
 * @utbot.methodUnderTest {@link org.mockito.exceptions.Reporter#misplacedArgumentMatcher(org.mockito.internal.debugging.Location)}
 * @utbot.invokes {@link org.mockito.internal.util.StringJoiner#join(java.lang.Object[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: throw new InvalidUseOfMatchersException(join("Misplaced argument matcher detected here:", location, "", "You cannot use argument matchers outside of verification or stubbing.", "Examples of correct usage of argument matchers:", "    when(mock.get(anyInt())).thenReturn(null);", "    doThrow(new RuntimeException()).when(mock).someVoidMethod(anyObject());", "    verify(mock).someMethod(contains(\"foo\"))", "", "Also, this error might show up because you use argument matchers with methods that cannot be mocked.", "Following methods *cannot* be stubbed/verified: final/private/equals()/hashCode().", ""));
 *  */
    @Test
    public void testMisplacedArgumentMatcher_ThrowNullPointerException() {
        Reporter reporter = new Reporter();
        
        /* This test fails because method [org.mockito.exceptions.Reporter.misplacedArgumentMatcher] produces [java.lang.NullPointerException]
            org.mockito.internal.util.StringJoiner.join(StringJoiner.java:12)
            org.mockito.exceptions.Reporter.misplacedArgumentMatcher(Reporter.java:422) */
        reporter.misplacedArgumentMatcher(null);
    }
    ///endregion
    
    ///region FUZZER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method misplacedArgumentMatcher(org.mockito.internal.debugging.Location)
    
    /**
     * @utbot.classUnderTest {@link org.mockito.exceptions.Reporter}
     * @utbot.methodUnderTest {@link org.mockito.exceptions.Reporter#misplacedArgumentMatcher(org.mockito.internal.debugging.Location)}
     */
    @Test(expected = InvalidUseOfMatchersException.class)
    public void testMisplacedArgumentMatcherThrowsIUOME() {
        Reporter reporter = new Reporter();
        Location location = new Location();
        
        reporter.misplacedArgumentMatcher(location);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.mockito.exceptions.Reporter.onlyVoidMethodsCanBeSetToDoNothing
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method onlyVoidMethodsCanBeSetToDoNothing()
    
    /**
    @utbot.classUnderTest {@link Reporter}
 * @utbot.methodUnderTest {@link org.mockito.exceptions.Reporter#onlyVoidMethodsCanBeSetToDoNothing()}
 * @utbot.invokes {@link org.mockito.internal.util.StringJoiner#join(java.lang.Object[])}
 * @utbot.throwsException {@link org.mockito.exceptions.base.MockitoException} in: throw new MockitoException(join("Only void methods can doNothing()!", "Example of correct use of doNothing():", "    doNothing().", "    doThrow(new RuntimeException())", "    .when(mock).someVoidMethod();", "Above means:", "someVoidMethod() does nothing the 1st time but throws an exception the 2nd time is called"));
 *  */
    @Test(expected = MockitoException.class)
    public void testOnlyVoidMethodsCanBeSetToDoNothing_ThrowMockitoException() {
        Reporter reporter = new Reporter();
        
        reporter.onlyVoidMethodsCanBeSetToDoNothing();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.mockito.exceptions.Reporter.wrongTypeOfReturnValue
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method wrongTypeOfReturnValue(java.lang.String, java.lang.String, java.lang.String)
    
    /**
    @utbot.classUnderTest {@link Reporter}
 * @utbot.methodUnderTest {@link org.mockito.exceptions.Reporter#wrongTypeOfReturnValue(java.lang.String,java.lang.String,java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#toString()}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#toString()}
 * @utbot.invokes {@link org.mockito.internal.util.StringJoiner#join(java.lang.Object[])}
 * @utbot.throwsException {@link org.mockito.exceptions.misusing.WrongTypeOfReturnValue} in: throw new WrongTypeOfReturnValue(join(actualType + " cannot be returned by " + methodName + "()", methodName + "() should return " + expectedType, "***", "This exception *might* occur in wrongly written multi-threaded tests.", "Please refer to Mockito FAQ on limitations of concurrency testing.", ""));
 *  */
    @Test(expected = WrongTypeOfReturnValue.class)
    public void testWrongTypeOfReturnValue_ThrowWrongTypeOfReturnValue() {
        Reporter reporter = new Reporter();
        
        reporter.wrongTypeOfReturnValue(null, null, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.mockito.exceptions.Reporter.moreThanOneAnnotationNotAllowed
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method moreThanOneAnnotationNotAllowed(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link Reporter}
 * @utbot.methodUnderTest {@link org.mockito.exceptions.Reporter#moreThanOneAnnotationNotAllowed(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#toString()}
 * @utbot.throwsException {@link org.mockito.exceptions.base.MockitoException} in: throw new MockitoException("You cannot have more than one Mockito annotation on a field!\n" + "The field '" + fieldName + "' has multiple Mockito annotations.\n" + "For info how to use annotations see examples in javadoc for MockitoAnnotations class.");
 *  */
    @Test(expected = MockitoException.class)
    public void testMoreThanOneAnnotationNotAllowed_ThrowMockitoException() {
        Reporter reporter = new Reporter();
        
        reporter.moreThanOneAnnotationNotAllowed(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.mockito.exceptions.Reporter.noMoreInteractionsWanted
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method noMoreInteractionsWanted(org.mockito.internal.invocation.Invocation, java.util.List)
    
    /**
    @utbot.classUnderTest {@link Reporter}
 * @utbot.methodUnderTest {@link org.mockito.exceptions.Reporter#noMoreInteractionsWanted(org.mockito.internal.invocation.Invocation,java.util.List)}
 * @utbot.invokes {@link org.mockito.internal.exceptions.util.ScenarioPrinter#print(java.util.List)}
 * @utbot.invokes {@link org.mockito.internal.invocation.Invocation#getLocation()}
 * @utbot.invokes {@link org.mockito.internal.util.StringJoiner#join(java.lang.Object[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: throw new NoInteractionsWanted(join("No interactions wanted here:", new Location(), "But found this interaction:", undesired.getLocation(), scenario, ""));
 *  */
    @Test
    public void testNoMoreInteractionsWanted_ThrowNullPointerException() {
        Reporter reporter = new Reporter();
        ArrayList arrayList = new ArrayList();
        arrayList.add(null);
        
        /* This test fails because method [org.mockito.exceptions.Reporter.noMoreInteractionsWanted] produces [java.lang.NullPointerException]
            org.mockito.exceptions.Reporter.noMoreInteractionsWanted(Reporter.java:358) */
        reporter.noMoreInteractionsWanted(null, arrayList);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.mockito.exceptions.Reporter.smartNullPointerException
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method smartNullPointerException(org.mockito.internal.debugging.Location)
    
    /**
    @utbot.classUnderTest {@link Reporter}
 * @utbot.methodUnderTest {@link org.mockito.exceptions.Reporter#smartNullPointerException(org.mockito.internal.debugging.Location)}
 * @utbot.invokes {@link org.mockito.internal.util.StringJoiner#join(java.lang.Object[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: throw new SmartNullPointerException(join("You have a NullPointerException here:", new Location(), "Because this method was *not* stubbed correctly:", location, ""));
 *  */
    @Test
    public void testSmartNullPointerException_ThrowNullPointerException() {
        Reporter reporter = new Reporter();
        
        /* This test fails because method [org.mockito.exceptions.Reporter.smartNullPointerException] produces [java.lang.NullPointerException]
            org.mockito.internal.util.StringJoiner.join(StringJoiner.java:12)
            org.mockito.exceptions.Reporter.smartNullPointerException(Reporter.java:439) */
        reporter.smartNullPointerException(null);
    }
    ///endregion
    
    ///region FUZZER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method smartNullPointerException(org.mockito.internal.debugging.Location)
    
    /**
     * @utbot.classUnderTest {@link org.mockito.exceptions.Reporter}
     * @utbot.methodUnderTest {@link org.mockito.exceptions.Reporter#smartNullPointerException(org.mockito.internal.debugging.Location)}
     */
    @Test(expected = SmartNullPointerException.class)
    public void testSmartNullPointerExceptionThrowsSNPE() {
        Reporter reporter = new Reporter();
        Location location = new Location();
        
        reporter.smartNullPointerException(location);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.mockito.exceptions.Reporter.cannotMockFinalClass
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method cannotMockFinalClass(java.lang.Class)
    
    /**
    @utbot.classUnderTest {@link Reporter}
 * @utbot.methodUnderTest {@link org.mockito.exceptions.Reporter#cannotMockFinalClass(java.lang.Class)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.Class#toString()}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#toString()}
 * @utbot.invokes {@link org.mockito.internal.util.StringJoiner#join(java.lang.Object[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: throw new MockitoException(join("Cannot mock/spy " + clazz.toString(), "Mockito cannot mock/spy following:", "  - final classes", "  - anonymous classes", "  - primitive types"));
 *  */
    @Test
    public void testCannotMockFinalClass_ThrowNullPointerException() {
        Reporter reporter = new Reporter();
        
        /* This test fails because method [org.mockito.exceptions.Reporter.cannotMockFinalClass] produces [java.lang.NullPointerException]
            org.mockito.exceptions.Reporter.cannotMockFinalClass(Reporter.java:376) */
        reporter.cannotMockFinalClass(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.mockito.exceptions.Reporter.noArgumentValueWasCaptured
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method noArgumentValueWasCaptured()
    
    /**
    @utbot.classUnderTest {@link Reporter}
 * @utbot.methodUnderTest {@link org.mockito.exceptions.Reporter#noArgumentValueWasCaptured()}
 * @utbot.invokes {@link org.mockito.internal.util.StringJoiner#join(java.lang.Object[])}
 * @utbot.throwsException {@link org.mockito.exceptions.base.MockitoException} in: throw new MockitoException(join("No argument value was captured!", "You might have forgotten to use argument.capture() in verify()...", "...or you used capture() in stubbing but stubbed method was not called.", "Be aware that it is recommended to use capture() only with verify()", "", "Examples of correct argument capturing:", "    ArgumentCaptor<Person> argument = ArgumentCaptor.forClass(Person.class);", "    verify(mock).doSomething(argument.capture());", "    assertEquals(\"John\", argument.getValue().getName());", ""));
 *  */
    @Test(expected = MockitoException.class)
    public void testNoArgumentValueWasCaptured_ThrowMockitoException() {
        Reporter reporter = new Reporter();
        
        reporter.noArgumentValueWasCaptured();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.mockito.exceptions.Reporter.tooLittleActualInvocations
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method tooLittleActualInvocations(org.mockito.exceptions.Discrepancy, org.mockito.exceptions.PrintableInvocation, org.mockito.internal.debugging.Location)
    
    /**
    @utbot.classUnderTest {@link Reporter}
 * @utbot.methodUnderTest {@link org.mockito.exceptions.Reporter#tooLittleActualInvocations(org.mockito.exceptions.Discrepancy,org.mockito.exceptions.PrintableInvocation,org.mockito.internal.debugging.Location)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: String message = createTooLittleInvocationsMessage(discrepancy, wanted, lastActualLocation);
 *  */
    @Test
    public void testTooLittleActualInvocations_ThrowNullPointerException() {
        Reporter reporter = new Reporter();
        
        /* This test fails because method [org.mockito.exceptions.Reporter.tooLittleActualInvocations] produces [java.lang.NullPointerException]
            org.mockito.exceptions.Reporter.createTooLittleInvocationsMessage(Reporter.java:327)
            org.mockito.exceptions.Reporter.tooLittleActualInvocations(Reporter.java:337) */
        reporter.tooLittleActualInvocations(null, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link Reporter}
 * @utbot.methodUnderTest {@link org.mockito.exceptions.Reporter#tooLittleActualInvocations(org.mockito.exceptions.Discrepancy,org.mockito.exceptions.PrintableInvocation,org.mockito.internal.debugging.Location)}
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test
    public void testTooLittleActualInvocations_ThrowNullPointerException_1() throws Exception  {
        Reporter reporter = new Reporter();
        Location location = ((Location) createInstance("org.mockito.internal.debugging.Location"));
        InterruptedException stackTraceHolder = ((InterruptedException) createInstance("java.lang.InterruptedException"));
        setField(location, "org.mockito.internal.debugging.Location", "stackTraceHolder", stackTraceHolder);
        StackTraceFilter stackTraceFilter = ((StackTraceFilter) createInstance("org.mockito.internal.exceptions.base.StackTraceFilter"));
        setField(location, "org.mockito.internal.debugging.Location", "stackTraceFilter", stackTraceFilter);
        
        /* This test fails because method [org.mockito.exceptions.Reporter.tooLittleActualInvocations] produces [java.lang.NullPointerException]
            org.mockito.exceptions.Reporter.createTooLittleInvocationsMessage(Reporter.java:327)
            org.mockito.exceptions.Reporter.tooLittleActualInvocations(Reporter.java:337) */
        reporter.tooLittleActualInvocations(null, null, location);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method tooLittleActualInvocations(org.mockito.exceptions.Discrepancy, org.mockito.exceptions.PrintableInvocation, org.mockito.internal.debugging.Location)
    
    @Test(expected = IllegalAccessError.class)
    public void testTooLittleActualInvocations1() throws Exception  {
        Reporter reporter = new Reporter();
        Invocation invocation = ((Invocation) createInstance("org.mockito.internal.invocation.Invocation"));
        java.lang.Object[] arguments = new java.lang.Object[11];
        Object object = createInstance("java.lang.Object");
        arguments[0] = object;
        arguments[2] = object;
        char[] charArray = {'\u0000'};
        arguments[3] = ((Object) charArray);
        arguments[4] = ((Object) charArray);
        arguments[5] = ((Object) charArray);
        arguments[6] = ((Object) charArray);
        arguments[7] = ((Object) charArray);
        arguments[8] = ((Object) charArray);
        arguments[9] = ((Object) charArray);
        arguments[10] = ((Object) charArray);
        setField(invocation, "org.mockito.internal.invocation.Invocation", "arguments", arguments);
        
        reporter.tooLittleActualInvocations(null, invocation, null);
    }
    
    @Test(expected = IllegalAccessError.class)
    public void testTooLittleActualInvocations2() throws Exception  {
        Reporter reporter = new Reporter();
        Invocation invocation = ((Invocation) createInstance("org.mockito.internal.invocation.Invocation"));
        java.lang.Object[] arguments = {};
        setField(invocation, "org.mockito.internal.invocation.Invocation", "arguments", arguments);
        
        reporter.tooLittleActualInvocations(null, invocation, null);
    }
    
    @Test
    public void testTooLittleActualInvocations3() throws Exception  {
        Reporter reporter = new Reporter();
        Discrepancy discrepancy = new Discrepancy(0, 0);
        Invocation invocation = ((Invocation) createInstance("org.mockito.internal.invocation.Invocation"));
        Location location = ((Location) createInstance("org.mockito.internal.debugging.Location"));
        ProviderNotFoundException stackTraceHolder = ((ProviderNotFoundException) createInstance("java.nio.file.ProviderNotFoundException"));
        setField(location, "org.mockito.internal.debugging.Location", "stackTraceHolder", stackTraceHolder);
        StackTraceFilter stackTraceFilter = ((StackTraceFilter) createInstance("org.mockito.internal.exceptions.base.StackTraceFilter"));
        setField(location, "org.mockito.internal.debugging.Location", "stackTraceFilter", stackTraceFilter);
        
        /* This test fails because method [org.mockito.exceptions.Reporter.tooLittleActualInvocations] produces [java.lang.NullPointerException]
            org.mockito.internal.invocation.Invocation.argumentsToMatchers(Invocation.java:144)
            org.mockito.internal.invocation.Invocation.toString(Invocation.java:125)
            org.mockito.exceptions.Reporter.createTooLittleInvocationsMessage(Reporter.java:327)
            org.mockito.exceptions.Reporter.tooLittleActualInvocations(Reporter.java:337) */
        reporter.tooLittleActualInvocations(discrepancy, invocation, location);
    }
    ///endregion
    
    ///region Errors report for tooLittleActualInvocations
    
    public void testTooLittleActualInvocations_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 5 occurrences of:
        // Concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.mockito.exceptions.Reporter.unfinishedStubbing
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method unfinishedStubbing(org.mockito.internal.debugging.Location)
    
    /**
    @utbot.classUnderTest {@link Reporter}
 * @utbot.methodUnderTest {@link org.mockito.exceptions.Reporter#unfinishedStubbing(org.mockito.internal.debugging.Location)}
 * @utbot.invokes {@link org.mockito.internal.util.StringJoiner#join(java.lang.Object[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: throw new UnfinishedStubbingException(join("Unfinished stubbing detected here:", location, "", "E.g. thenReturn() may be missing.", "Examples of correct stubbing:", "    when(mock.isOk()).thenReturn(true);", "    when(mock.isOk()).thenThrow(exception);", "    doThrow(exception).when(mock).someVoidMethod();", "Hints:", " 1. missing thenReturn()", " 2. you are trying to stub a final method, you naughty developer!", ""));
 *  */
    @Test
    public void testUnfinishedStubbing_ThrowNullPointerException() {
        Reporter reporter = new Reporter();
        
        /* This test fails because method [org.mockito.exceptions.Reporter.unfinishedStubbing] produces [java.lang.NullPointerException]
            org.mockito.internal.util.StringJoiner.join(StringJoiner.java:12)
            org.mockito.exceptions.Reporter.unfinishedStubbing(Reporter.java:63) */
        reporter.unfinishedStubbing(null);
    }
    ///endregion
    
    ///region FUZZER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method unfinishedStubbing(org.mockito.internal.debugging.Location)
    
    /**
     * @utbot.classUnderTest {@link org.mockito.exceptions.Reporter}
     * @utbot.methodUnderTest {@link org.mockito.exceptions.Reporter#unfinishedStubbing(org.mockito.internal.debugging.Location)}
     */
    @Test(expected = UnfinishedStubbingException.class)
    public void testUnfinishedStubbingThrowsUSE() {
        Reporter reporter = new Reporter();
        Location location = new Location();
        
        reporter.unfinishedStubbing(location);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.mockito.exceptions.Reporter.nullPassedToVerify
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method nullPassedToVerify()
    
    /**
    @utbot.classUnderTest {@link Reporter}
 * @utbot.methodUnderTest {@link org.mockito.exceptions.Reporter#nullPassedToVerify()}
 * @utbot.invokes {@link org.mockito.internal.util.StringJoiner#join(java.lang.Object[])}
 * @utbot.throwsException {@link org.mockito.exceptions.misusing.NullInsteadOfMockException} in: throw new NullInsteadOfMockException(join("Argument passed to verify() should be a mock but is null!", "Examples of correct verifications:", "    verify(mock).someMethod();", "    verify(mock, times(10)).someMethod();", "    verify(mock, atLeastOnce()).someMethod();", "Also, if you use @Mock annotation don't miss initMocks()"));
 *  */
    @Test(expected = NullInsteadOfMockException.class)
    public void testNullPassedToVerify_ThrowNullInsteadOfMockException() {
        Reporter reporter = new Reporter();
        
        reporter.nullPassedToVerify();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.mockito.exceptions.Reporter.wantedAtMostX
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method wantedAtMostX(int, int)
    
    /**
    @utbot.classUnderTest {@link Reporter}
 * @utbot.methodUnderTest {@link org.mockito.exceptions.Reporter#wantedAtMostX(int,int)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link org.mockito.exceptions.Pluralizer#pluralize(int)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(int)}
 * @utbot.invokes {@link java.lang.StringBuilder#toString()}
 * @utbot.invokes {@link org.mockito.internal.util.StringJoiner#join(java.lang.Object[])}
 * @utbot.throwsException {@link org.mockito.exceptions.base.MockitoAssertionError} in: throw new MockitoAssertionError(join("Wanted at most " + pluralize(maxNumberOfInvocations) + " but was " + foundSize));
 *  */
    @Test
    public void testWantedAtMostX_ThrowMockitoAssertionError() {
        Reporter reporter = new Reporter();
        
        /* This test fails because method [org.mockito.exceptions.Reporter.wantedAtMostX] produces [org.mockito.exceptions.base.MockitoAssertionError: 
        Wanted at most 1 time but was -255] */
        reporter.wantedAtMostX(1, -255);
    }
    ///endregion
    
    ///region FUZZER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method wantedAtMostX(int, int)
    
    /**
     * @utbot.classUnderTest {@link org.mockito.exceptions.Reporter}
     * @utbot.methodUnderTest {@link org.mockito.exceptions.Reporter#wantedAtMostX(int,int)}
     */
    @Test
    public void testWantedAtMostXThrowsMAEWithCornerCase() {
        Reporter reporter = new Reporter();
        
        /* This test fails because method [org.mockito.exceptions.Reporter.wantedAtMostX] produces [org.mockito.exceptions.base.MockitoAssertionError: 
        Wanted at most 16385 times but was -2147483648] */
        reporter.wantedAtMostX(16385, Integer.MIN_VALUE);
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
        
                java.lang.reflect.Method methodForGetDeclaredFields1127907448266000 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields1127907448266000.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass1127907448276900 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1127907448266000.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1127907448276900).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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

