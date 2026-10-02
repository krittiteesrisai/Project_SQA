package org.mockito.exceptions;

import org.junit.Test;
import org.mockito.internal.verification.checkers.AtLeastDiscrepancy;
import org.mockito.internal.invocation.InvocationImpl;
import org.mockito.internal.debugging.LocationImpl;
import java.awt.IllegalComponentStateException;
import org.mockito.internal.exceptions.stacktrace.StackTraceFilter;
import org.mockito.internal.stubbing.StubbedInvocationMatcher;
import java.lang.reflect.Method;
import org.mockito.internal.reporting.Discrepancy;
import org.mockito.exceptions.base.MockitoSerializationIssue;
import org.mockito.exceptions.base.MockitoException;
import org.mockito.exceptions.misusing.WrongTypeOfReturnValue;
import java.util.ArrayList;
import javax.xml.transform.TransformerConfigurationException;
import java.lang.reflect.InvocationTargetException;
import org.mockito.internal.creation.DelegatingMethod;
import java.util.LinkedList;
import org.mockito.internal.matchers.LocalizedMatcher;
import org.mockito.exceptions.misusing.InvalidUseOfMatchersException;
import org.mockito.internal.invocation.InvocationMatcher;
import javax.crypto.IllegalBlockSizeException;
import org.mockito.exceptions.misusing.MissingMethodInvocationException;
import org.mockito.exceptions.misusing.UnfinishedVerificationException;
import org.mockito.exceptions.misusing.NullInsteadOfMockException;
import org.mockito.exceptions.misusing.NotAMockException;
import java.util.Collection;
import org.mockito.exceptions.misusing.UnfinishedStubbingException;
import org.mockito.exceptions.misusing.CannotVerifyStubOnlyMock;
import java.util.HashSet;
import java.nio.channels.UnresolvedAddressException;
import org.mockito.exceptions.misusing.FriendlyReminderException;
import org.mockito.exceptions.misusing.CannotStubVoidMethodWithReturnValue;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

import static org.junit.Assert.assertNull;
import static java.util.Collections.emptyList;
import static org.junit.Assert.assertEquals;

public final class org_mockito_exceptions_ReporterTest {
    ///region Test suites for executable org.mockito.exceptions.Reporter.serializableWontWorkForObjectsThatDontImplementSerializable
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method serializableWontWorkForObjectsThatDontImplementSerializable(java.lang.Class)
    
    /**
    @utbot.classUnderTest {@link Reporter}
 * @utbot.methodUnderTest {@link org.mockito.exceptions.Reporter#serializableWontWorkForObjectsThatDontImplementSerializable(java.lang.Class)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.Class#getSimpleName()}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#toString()}
 * @utbot.invokes {@link org.mockito.internal.util.StringJoiner#join(java.lang.Object[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: throw new MockitoException(join("You are using the setting 'withSettings().serializable()' however the type you are trying to mock '" + classToMock.getSimpleName() + "'", "do not implement Serializable AND do not have a no-arg constructor.", "This combination is requested, otherwise you will get an 'java.io.InvalidClassException' when the mock will be serialized", "", "Also note that as requested by the Java serialization specification, the whole hierarchy need to implements Serializable,", "i.e. the top-most superclass has to implements Serializable.", ""));
 *  */
    @Test
    public void testSerializableWontWorkForObjectsThatDontImplementSerializable_ThrowNullPointerException() {
        Reporter reporter = new Reporter();
        
        /* This test fails because method [org.mockito.exceptions.Reporter.serializableWontWorkForObjectsThatDontImplementSerializable] produces [java.lang.NullPointerException]
            org.mockito.exceptions.Reporter.serializableWontWorkForObjectsThatDontImplementSerializable(Reporter.java:764) */
        reporter.serializableWontWorkForObjectsThatDontImplementSerializable(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.mockito.exceptions.Reporter.tooLittleActualInvocationsInOrder
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method tooLittleActualInvocationsInOrder(org.mockito.internal.reporting.Discrepancy, org.mockito.invocation.DescribedInvocation, org.mockito.invocation.Location)
    
    /**
    @utbot.classUnderTest {@link Reporter}
 * @utbot.methodUnderTest {@link org.mockito.exceptions.Reporter#tooLittleActualInvocationsInOrder(org.mockito.internal.reporting.Discrepancy,org.mockito.invocation.DescribedInvocation,org.mockito.invocation.Location)}
 * @utbot.invokes org.mockito.exceptions.Reporter#createTooLittleInvocationsMessage(org.mockito.internal.reporting.Discrepancy,org.mockito.invocation.DescribedInvocation,org.mockito.invocation.Location)
 * @utbot.throwsException {@link java.lang.NullPointerException} in: String message = createTooLittleInvocationsMessage(discrepancy, wanted, lastActualLocation);
 *  */
    @Test
    public void testTooLittleActualInvocationsInOrder_ThrowNullPointerException() {
        Reporter reporter = new Reporter();
        
        /* This test fails because method [org.mockito.exceptions.Reporter.tooLittleActualInvocationsInOrder] produces [java.lang.NullPointerException]
            org.mockito.exceptions.Reporter.createTooLittleInvocationsMessage(Reporter.java:394)
            org.mockito.exceptions.Reporter.tooLittleActualInvocationsInOrder(Reporter.java:410) */
        reporter.tooLittleActualInvocationsInOrder(null, null, null);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method tooLittleActualInvocationsInOrder(org.mockito.internal.reporting.Discrepancy, org.mockito.invocation.DescribedInvocation, org.mockito.invocation.Location)
    
    @Test
    public void testTooLittleActualInvocationsInOrder1() throws Exception  {
        Reporter reporter = new Reporter();
        AtLeastDiscrepancy atLeastDiscrepancy = new AtLeastDiscrepancy(0, 0);
        InvocationImpl invocationImpl = ((InvocationImpl) createInstance("org.mockito.internal.invocation.InvocationImpl"));
        java.lang.Object[] arguments = new java.lang.Object[1];
        Object object = createInstance("java.lang.Object");
        arguments[0] = object;
        setField(invocationImpl, "org.mockito.internal.invocation.InvocationImpl", "arguments", arguments);
        
        /* This test fails because method [org.mockito.exceptions.Reporter.tooLittleActualInvocationsInOrder] produces [org.mockito.exceptions.misusing.NotAMockException: Argument should be a mock, but is null!] */
        reporter.tooLittleActualInvocationsInOrder(atLeastDiscrepancy, invocationImpl, null);
    }
    
    @Test
    public void testTooLittleActualInvocationsInOrder2() throws Exception  {
        Reporter reporter = new Reporter();
        InvocationImpl invocationImpl = ((InvocationImpl) createInstance("org.mockito.internal.invocation.InvocationImpl"));
        java.lang.Object[] arguments = {};
        setField(invocationImpl, "org.mockito.internal.invocation.InvocationImpl", "arguments", arguments);
        
        /* This test fails because method [org.mockito.exceptions.Reporter.tooLittleActualInvocationsInOrder] produces [org.mockito.exceptions.misusing.NotAMockException: Argument should be a mock, but is null!] */
        reporter.tooLittleActualInvocationsInOrder(null, invocationImpl, null);
    }
    
    @Test
    public void testTooLittleActualInvocationsInOrder3() throws Exception  {
        Reporter reporter = new Reporter();
        LocationImpl locationImpl = ((LocationImpl) createInstance("org.mockito.internal.debugging.LocationImpl"));
        IllegalComponentStateException stackTraceHolder = ((IllegalComponentStateException) createInstance("java.awt.IllegalComponentStateException"));
        setField(locationImpl, "org.mockito.internal.debugging.LocationImpl", "stackTraceHolder", stackTraceHolder);
        StackTraceFilter stackTraceFilter = ((StackTraceFilter) createInstance("org.mockito.internal.exceptions.stacktrace.StackTraceFilter"));
        setField(locationImpl, "org.mockito.internal.debugging.LocationImpl", "stackTraceFilter", stackTraceFilter);
        
        /* This test fails because method [org.mockito.exceptions.Reporter.tooLittleActualInvocationsInOrder] produces [java.lang.NullPointerException]
            org.mockito.exceptions.Reporter.createTooLittleInvocationsMessage(Reporter.java:394)
            org.mockito.exceptions.Reporter.tooLittleActualInvocationsInOrder(Reporter.java:410) */
        reporter.tooLittleActualInvocationsInOrder(null, null, locationImpl);
    }
    
    @Test
    public void testTooLittleActualInvocationsInOrder4() throws Throwable  {
        Reporter reporter = new Reporter();
        StubbedInvocationMatcher stubbedInvocationMatcher = ((StubbedInvocationMatcher) createInstance("org.mockito.internal.stubbing.StubbedInvocationMatcher"));
        
        /* This test fails because method [org.mockito.exceptions.Reporter.tooLittleActualInvocationsInOrder] produces [java.lang.NullPointerException]
            org.mockito.internal.reporting.PrintSettings.print(PrintSettings.java:59)
            org.mockito.internal.invocation.InvocationMatcher.toString(InvocationMatcher.java:75)
            org.mockito.internal.stubbing.StubbedInvocationMatcher.toString(StubbedInvocationMatcher.java:64)
            org.mockito.exceptions.Reporter.createTooLittleInvocationsMessage(Reporter.java:394)
            org.mockito.exceptions.Reporter.tooLittleActualInvocationsInOrder(Reporter.java:410) */
        Class reporterClazz = Class.forName("org.mockito.exceptions.Reporter");
        Class discrepancyType = Class.forName("org.mockito.internal.reporting.Discrepancy");
        Class stubbedInvocationMatcherType = Class.forName("org.mockito.invocation.DescribedInvocation");
        Class locationType = Class.forName("org.mockito.invocation.Location");
        Method tooLittleActualInvocationsInOrderMethod = reporterClazz.getDeclaredMethod("tooLittleActualInvocationsInOrder", discrepancyType, stubbedInvocationMatcherType, locationType);
        tooLittleActualInvocationsInOrderMethod.setAccessible(true);
        java.lang.Object[] tooLittleActualInvocationsInOrderMethodArguments = new java.lang.Object[3];
        tooLittleActualInvocationsInOrderMethodArguments[0] = ((Object) null);
        tooLittleActualInvocationsInOrderMethodArguments[1] = stubbedInvocationMatcher;
        tooLittleActualInvocationsInOrderMethodArguments[2] = ((Object) null);
        try {
            tooLittleActualInvocationsInOrderMethod.invoke(reporter, tooLittleActualInvocationsInOrderMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTooLittleActualInvocationsInOrder5() throws Throwable  {
        Class globalConfigurationClazz = Class.forName("org.mockito.internal.configuration.GlobalConfiguration");
        ThreadLocal prevGLOBAL_CONFIGURATION = ((ThreadLocal) getStaticFieldValue(globalConfigurationClazz, "GLOBAL_CONFIGURATION"));
        try {
            ThreadLocal globalConfiguration = ((ThreadLocal) createInstance("java.lang.ThreadLocal"));
            setField(globalConfiguration, "java.lang.ThreadLocal", "threadLocalHashCode", 38);
            setStaticField(globalConfigurationClazz, "GLOBAL_CONFIGURATION", globalConfiguration);
            Reporter reporter = new Reporter();
            Discrepancy discrepancy = new Discrepancy(0, 0);
            StubbedInvocationMatcher stubbedInvocationMatcher = ((StubbedInvocationMatcher) createInstance("org.mockito.internal.stubbing.StubbedInvocationMatcher"));
            LocationImpl locationImpl = ((LocationImpl) createInstance("org.mockito.internal.debugging.LocationImpl"));
            MockitoSerializationIssue stackTraceHolder = ((MockitoSerializationIssue) createInstance("org.mockito.exceptions.base.MockitoSerializationIssue"));
            setField(locationImpl, "org.mockito.internal.debugging.LocationImpl", "stackTraceHolder", stackTraceHolder);
            
            /* This test fails because method [org.mockito.exceptions.Reporter.tooLittleActualInvocationsInOrder] produces [java.lang.NullPointerException]
                org.mockito.internal.debugging.LocationImpl.toString(LocationImpl.java:29)
                java.base/java.lang.String.valueOf(String.java:4222)
                java.base/java.lang.StringBuilder.append(StringBuilder.java:173)
                org.mockito.exceptions.Reporter.createTooLittleInvocationsMessage(Reporter.java:391)
                org.mockito.exceptions.Reporter.tooLittleActualInvocationsInOrder(Reporter.java:410) */
            Class reporterClazz = Class.forName("org.mockito.exceptions.Reporter");
            Class discrepancyType = Class.forName("org.mockito.internal.reporting.Discrepancy");
            Class stubbedInvocationMatcherType = Class.forName("org.mockito.invocation.DescribedInvocation");
            Class locationImplType = Class.forName("org.mockito.invocation.Location");
            Method tooLittleActualInvocationsInOrderMethod = reporterClazz.getDeclaredMethod("tooLittleActualInvocationsInOrder", discrepancyType, stubbedInvocationMatcherType, locationImplType);
            tooLittleActualInvocationsInOrderMethod.setAccessible(true);
            java.lang.Object[] tooLittleActualInvocationsInOrderMethodArguments = new java.lang.Object[3];
            tooLittleActualInvocationsInOrderMethodArguments[0] = discrepancy;
            tooLittleActualInvocationsInOrderMethodArguments[1] = stubbedInvocationMatcher;
            tooLittleActualInvocationsInOrderMethodArguments[2] = locationImpl;
            try {
                tooLittleActualInvocationsInOrderMethod.invoke(reporter, tooLittleActualInvocationsInOrderMethodArguments);
            } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
        } finally {
            setStaticField(org.mockito.internal.configuration.GlobalConfiguration.class, "GLOBAL_CONFIGURATION", prevGLOBAL_CONFIGURATION);
        }
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
 * @utbot.throwsException {@link org.mockito.exceptions.misusing.WrongTypeOfReturnValue} in: throw new WrongTypeOfReturnValue(join(actualType + " cannot be returned by " + methodName + "()", methodName + "() should return " + expectedType, "***", "If you're unsure why you're getting above error read on.", "Due to the nature of the syntax above problem might occur because:", "1. This exception *might* occur in wrongly written multi-threaded tests.", "   Please refer to Mockito FAQ on limitations of concurrency testing.", "2. A spy is stubbed using when(spy.foo()).then() syntax. It is safer to stub spies - ", "   - with doReturn|Throw() family of methods. More in javadocs for Mockito.spy() method.", ""));
 *  */
    @Test(expected = WrongTypeOfReturnValue.class)
    public void testWrongTypeOfReturnValue_ThrowWrongTypeOfReturnValue() {
        Reporter reporter = new Reporter();
        
        reporter.wrongTypeOfReturnValue(null, null, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.mockito.exceptions.Reporter.noMoreInteractionsWanted
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method noMoreInteractionsWanted(org.mockito.invocation.Invocation, java.util.List)
    
    /**
    @utbot.classUnderTest {@link Reporter}
 * @utbot.methodUnderTest {@link org.mockito.exceptions.Reporter#noMoreInteractionsWanted(org.mockito.invocation.Invocation,java.util.List)}
 * @utbot.invokes {@link org.mockito.internal.exceptions.util.ScenarioPrinter#print(java.util.List)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link org.mockito.invocation.Invocation#getMock()}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.Object)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#toString()}
 * @utbot.invokes {@link org.mockito.invocation.Invocation#getLocation()}
 * @utbot.invokes {@link org.mockito.internal.util.StringJoiner#join(java.lang.Object[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: throw new NoInteractionsWanted(join("No interactions wanted here:", new LocationImpl(), "But found this interaction on mock '" + undesired.getMock() + "':", undesired.getLocation(), scenario));
 *  */
    @Test
    public void testNoMoreInteractionsWanted_ThrowNullPointerException() {
        Reporter reporter = new Reporter();
        ArrayList arrayList = new ArrayList();
        arrayList.add(null);
        
        /* This test fails because method [org.mockito.exceptions.Reporter.noMoreInteractionsWanted] produces [java.lang.NullPointerException]
            org.mockito.exceptions.Reporter.noMoreInteractionsWanted(Reporter.java:424) */
        reporter.noMoreInteractionsWanted(null, arrayList);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.mockito.exceptions.Reporter.noMoreInteractionsWantedInOrder
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method noMoreInteractionsWantedInOrder(org.mockito.invocation.Invocation)
    
    /**
    @utbot.classUnderTest {@link Reporter}
 * @utbot.methodUnderTest {@link org.mockito.exceptions.Reporter#noMoreInteractionsWantedInOrder(org.mockito.invocation.Invocation)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link org.mockito.invocation.Invocation#getMock()}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.Object)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#toString()}
 * @utbot.invokes {@link org.mockito.invocation.Invocation#getLocation()}
 * @utbot.invokes {@link org.mockito.internal.util.StringJoiner#join(java.lang.Object[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: throw new VerificationInOrderFailure(join("No interactions wanted here:", new LocationImpl(), "But found this interaction on mock '" + undesired.getMock() + "':", undesired.getLocation()));
 *  */
    @Test
    public void testNoMoreInteractionsWantedInOrder_ThrowNullPointerException() {
        Reporter reporter = new Reporter();
        
        /* This test fails because method [org.mockito.exceptions.Reporter.noMoreInteractionsWantedInOrder] produces [java.lang.NullPointerException]
            org.mockito.exceptions.Reporter.noMoreInteractionsWantedInOrder(Reporter.java:434) */
        reporter.noMoreInteractionsWantedInOrder(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.mockito.exceptions.Reporter.exceptionCauseMessageIfAvailable
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method exceptionCauseMessageIfAvailable(java.lang.Exception)
    
    /**
    @utbot.classUnderTest {@link Reporter}
 * @utbot.methodUnderTest {@link org.mockito.exceptions.Reporter#exceptionCauseMessageIfAvailable(java.lang.Exception)}
 * @utbot.invokes {@link java.lang.Exception#getCause()}
 * @utbot.invokes {@link java.lang.Throwable#getMessage()}
 * @utbot.returnsFrom {@code return details.getCause().getMessage();}
 *  */
    @Test
    public void testExceptionCauseMessageIfAvailable_ThrowableGetMessage() throws Exception  {
        Reporter reporter = new Reporter();
        CloneNotSupportedException cloneNotSupportedException = ((CloneNotSupportedException) createInstance("java.lang.CloneNotSupportedException"));
        CloneNotSupportedException cause = ((CloneNotSupportedException) createInstance("java.lang.CloneNotSupportedException"));
        setField(cloneNotSupportedException, "java.lang.Throwable", "cause", cause);
        
        Class reporterClazz = Class.forName("org.mockito.exceptions.Reporter");
        Class cloneNotSupportedExceptionType = Class.forName("java.lang.Exception");
        Method exceptionCauseMessageIfAvailableMethod = reporterClazz.getDeclaredMethod("exceptionCauseMessageIfAvailable", cloneNotSupportedExceptionType);
        exceptionCauseMessageIfAvailableMethod.setAccessible(true);
        java.lang.Object[] exceptionCauseMessageIfAvailableMethodArguments = new java.lang.Object[1];
        exceptionCauseMessageIfAvailableMethodArguments[0] = cloneNotSupportedException;
        String actual = ((String) exceptionCauseMessageIfAvailableMethod.invoke(reporter, exceptionCauseMessageIfAvailableMethodArguments));
        
        assertNull(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method exceptionCauseMessageIfAvailable(java.lang.Exception)
    
    /**
    @utbot.classUnderTest {@link Reporter}
 * @utbot.methodUnderTest {@link org.mockito.exceptions.Reporter#exceptionCauseMessageIfAvailable(java.lang.Exception)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return details.getCause().getMessage();
 *  */
    @Test
    public void testExceptionCauseMessageIfAvailable_ThrowNullPointerException() throws Throwable  {
        Reporter reporter = new Reporter();
        CloneNotSupportedException cloneNotSupportedException = ((CloneNotSupportedException) createInstance("java.lang.CloneNotSupportedException"));
        setField(cloneNotSupportedException, "java.lang.Throwable", "cause", cloneNotSupportedException);
        
        /* This test fails because method [org.mockito.exceptions.Reporter.exceptionCauseMessageIfAvailable] produces [java.lang.NullPointerException]
            org.mockito.exceptions.Reporter.exceptionCauseMessageIfAvailable(Reporter.java:677) */
        Class reporterClazz = Class.forName("org.mockito.exceptions.Reporter");
        Class cloneNotSupportedExceptionType = Class.forName("java.lang.Exception");
        Method exceptionCauseMessageIfAvailableMethod = reporterClazz.getDeclaredMethod("exceptionCauseMessageIfAvailable", cloneNotSupportedExceptionType);
        exceptionCauseMessageIfAvailableMethod.setAccessible(true);
        java.lang.Object[] exceptionCauseMessageIfAvailableMethodArguments = new java.lang.Object[1];
        exceptionCauseMessageIfAvailableMethodArguments[0] = cloneNotSupportedException;
        try {
            exceptionCauseMessageIfAvailableMethod.invoke(reporter, exceptionCauseMessageIfAvailableMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link Reporter}
 * @utbot.methodUnderTest {@link org.mockito.exceptions.Reporter#exceptionCauseMessageIfAvailable(java.lang.Exception)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return details.getCause().getMessage();
 *  */
    @Test
    public void testExceptionCauseMessageIfAvailable_ThrowNullPointerException_2() throws Throwable  {
        Reporter reporter = new Reporter();
        TransformerConfigurationException transformerConfigurationException = ((TransformerConfigurationException) createInstance("javax.xml.transform.TransformerConfigurationException"));
        setField(transformerConfigurationException, "javax.xml.transform.TransformerException", "containedException", transformerConfigurationException);
        
        /* This test fails because method [org.mockito.exceptions.Reporter.exceptionCauseMessageIfAvailable] produces [java.lang.NullPointerException] */
        Class reporterClazz = Class.forName("org.mockito.exceptions.Reporter");
        Class transformerConfigurationExceptionType = Class.forName("java.lang.Exception");
        Method exceptionCauseMessageIfAvailableMethod = reporterClazz.getDeclaredMethod("exceptionCauseMessageIfAvailable", transformerConfigurationExceptionType);
        exceptionCauseMessageIfAvailableMethod.setAccessible(true);
        java.lang.Object[] exceptionCauseMessageIfAvailableMethodArguments = new java.lang.Object[1];
        exceptionCauseMessageIfAvailableMethodArguments[0] = transformerConfigurationException;
        try {
            exceptionCauseMessageIfAvailableMethod.invoke(reporter, exceptionCauseMessageIfAvailableMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link Reporter}
 * @utbot.methodUnderTest {@link org.mockito.exceptions.Reporter#exceptionCauseMessageIfAvailable(java.lang.Exception)}
 * @utbot.invokes {@link java.lang.Exception#getCause()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return details.getCause().getMessage();
 *  */
    @Test
    public void testExceptionCauseMessageIfAvailable_ThrowNullPointerException_1() throws Throwable  {
        Reporter reporter = new Reporter();
        
        /* This test fails because method [org.mockito.exceptions.Reporter.exceptionCauseMessageIfAvailable] produces [java.lang.NullPointerException]
            org.mockito.exceptions.Reporter.exceptionCauseMessageIfAvailable(Reporter.java:677) */
        Class reporterClazz = Class.forName("org.mockito.exceptions.Reporter");
        Class exceptionType = Class.forName("java.lang.Exception");
        Method exceptionCauseMessageIfAvailableMethod = reporterClazz.getDeclaredMethod("exceptionCauseMessageIfAvailable", exceptionType);
        exceptionCauseMessageIfAvailableMethod.setAccessible(true);
        java.lang.Object[] exceptionCauseMessageIfAvailableMethodArguments = new java.lang.Object[1];
        exceptionCauseMessageIfAvailableMethodArguments[0] = ((Object) null);
        try {
            exceptionCauseMessageIfAvailableMethod.invoke(reporter, exceptionCauseMessageIfAvailableMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.mockito.exceptions.Reporter.spyAndDelegateAreMutuallyExclusive
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method spyAndDelegateAreMutuallyExclusive()
    
    /**
    @utbot.classUnderTest {@link Reporter}
 * @utbot.methodUnderTest {@link org.mockito.exceptions.Reporter#spyAndDelegateAreMutuallyExclusive()}
 * @utbot.invokes {@link org.mockito.internal.util.StringJoiner#join(java.lang.Object[])}
 * @utbot.throwsException {@link org.mockito.exceptions.base.MockitoException} in: throw new MockitoException(join("Settings should not define a spy instance and a delegated instance at the same time."));
 *  */
    @Test(expected = MockitoException.class)
    public void testSpyAndDelegateAreMutuallyExclusive_ThrowMockitoException() {
        Reporter reporter = new Reporter();
        
        reporter.spyAndDelegateAreMutuallyExclusive();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.mockito.exceptions.Reporter.invocationListenerThrewException
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method invocationListenerThrewException(org.mockito.listeners.InvocationListener, java.lang.Throwable)
    
    /**
    @utbot.classUnderTest {@link Reporter}
 * @utbot.methodUnderTest {@link org.mockito.exceptions.Reporter#invocationListenerThrewException(org.mockito.listeners.InvocationListener,java.lang.Throwable)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.Class#getName()}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#toString()}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.Class#getName()}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.Throwable#getMessage()}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#toString()}
 * @utbot.invokes {@link org.mockito.internal.util.StringJoiner#join(java.lang.Object[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: throw new MockitoException(StringJoiner.join("The invocation listener with type " + listener.getClass().getName(), "threw an exception : " + listenerThrowable.getClass().getName() + listenerThrowable.getMessage()), listenerThrowable);
 *  */
    @Test
    public void testInvocationListenerThrewException_ThrowNullPointerException() {
        Reporter reporter = new Reporter();
        
        /* This test fails because method [org.mockito.exceptions.Reporter.invocationListenerThrewException] produces [java.lang.NullPointerException]
            org.mockito.exceptions.Reporter.invocationListenerThrewException(Reporter.java:662) */
        reporter.invocationListenerThrewException(null, null);
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
    
    ///region Test suites for executable org.mockito.exceptions.Reporter.tooManyActualInvocationsInOrder
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method tooManyActualInvocationsInOrder(int, int, org.mockito.invocation.DescribedInvocation, org.mockito.invocation.Location)
    
    /**
    @utbot.classUnderTest {@link Reporter}
 * @utbot.methodUnderTest {@link org.mockito.exceptions.Reporter#tooManyActualInvocationsInOrder(int,int,org.mockito.invocation.DescribedInvocation,org.mockito.invocation.Location)}
 * @utbot.invokes org.mockito.exceptions.Reporter#createTooManyInvocationsMessage(int,int,org.mockito.invocation.DescribedInvocation,org.mockito.invocation.Location)
 * @utbot.throwsException {@link java.lang.NullPointerException} in: String message = createTooManyInvocationsMessage(wantedCount, actualCount, wanted, firstUndesired);
 *  */
    @Test
    public void testTooManyActualInvocationsInOrder_ThrowNullPointerException() {
        Reporter reporter = new Reporter();
        
        /* This test fails because method [org.mockito.exceptions.Reporter.tooManyActualInvocationsInOrder] produces [java.lang.NullPointerException]
            org.mockito.exceptions.Reporter.createTooManyInvocationsMessage(Reporter.java:361)
            org.mockito.exceptions.Reporter.tooManyActualInvocationsInOrder(Reporter.java:382) */
        reporter.tooManyActualInvocationsInOrder(-255, -255, null, null);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method tooManyActualInvocationsInOrder(int, int, org.mockito.invocation.DescribedInvocation, org.mockito.invocation.Location)
    
    @Test
    public void testTooManyActualInvocationsInOrder1() throws Exception  {
        Reporter reporter = new Reporter();
        InvocationImpl invocationImpl = ((InvocationImpl) createInstance("org.mockito.internal.invocation.InvocationImpl"));
        java.lang.Object[] arguments = new java.lang.Object[10];
        Object object = createInstance("java.lang.Object");
        arguments[0] = object;
        arguments[1] = object;
        Class class1 = Object.class;
        arguments[2] = ((Object) class1);
        arguments[3] = ((Object) class1);
        arguments[4] = ((Object) class1);
        arguments[5] = ((Object) class1);
        arguments[6] = ((Object) class1);
        arguments[7] = ((Object) class1);
        arguments[8] = ((Object) class1);
        arguments[9] = ((Object) class1);
        setField(invocationImpl, "org.mockito.internal.invocation.InvocationImpl", "arguments", arguments);
        LocationImpl locationImpl = ((LocationImpl) createInstance("org.mockito.internal.debugging.LocationImpl"));
        
        /* This test fails because method [org.mockito.exceptions.Reporter.tooManyActualInvocationsInOrder] produces [org.mockito.exceptions.misusing.NotAMockException: Argument should be a mock, but is null!] */
        reporter.tooManyActualInvocationsInOrder(0, 0, invocationImpl, locationImpl);
    }
    
    @Test
    public void testTooManyActualInvocationsInOrder2() throws Exception  {
        Reporter reporter = new Reporter();
        InvocationImpl invocationImpl = ((InvocationImpl) createInstance("org.mockito.internal.invocation.InvocationImpl"));
        java.lang.Object[] arguments = new java.lang.Object[10];
        Object object = createInstance("java.lang.Object");
        arguments[0] = object;
        arguments[1] = object;
        Class class1 = Object.class;
        arguments[2] = ((Object) class1);
        arguments[3] = ((Object) class1);
        arguments[4] = ((Object) class1);
        arguments[5] = ((Object) class1);
        arguments[6] = ((Object) class1);
        arguments[7] = ((Object) class1);
        arguments[8] = ((Object) class1);
        arguments[9] = ((Object) class1);
        setField(invocationImpl, "org.mockito.internal.invocation.InvocationImpl", "arguments", arguments);
        LocationImpl locationImpl = ((LocationImpl) createInstance("org.mockito.internal.debugging.LocationImpl"));
        
        /* This test fails because method [org.mockito.exceptions.Reporter.tooManyActualInvocationsInOrder] produces [org.mockito.exceptions.misusing.NotAMockException: Argument should be a mock, but is null!] */
        reporter.tooManyActualInvocationsInOrder(0, 0, invocationImpl, locationImpl);
    }
    
    @Test
    public void testTooManyActualInvocationsInOrder3() throws Throwable  {
        Reporter reporter = new Reporter();
        StubbedInvocationMatcher stubbedInvocationMatcher = ((StubbedInvocationMatcher) createInstance("org.mockito.internal.stubbing.StubbedInvocationMatcher"));
        InvocationImpl invocation = ((InvocationImpl) createInstance("org.mockito.internal.invocation.InvocationImpl"));
        Object mock = createInstance("java.lang.Object");
        setField(invocation, "org.mockito.internal.invocation.InvocationImpl", "mock", mock);
        setField(stubbedInvocationMatcher, "org.mockito.internal.invocation.InvocationMatcher", "invocation", invocation);
        LocationImpl locationImpl = ((LocationImpl) createInstance("org.mockito.internal.debugging.LocationImpl"));
        
        /* This test fails because method [org.mockito.exceptions.Reporter.tooManyActualInvocationsInOrder] produces [org.mockito.exceptions.misusing.NotAMockException: Argument should be a mock, but is: class java.lang.Object] */
        Class reporterClazz = Class.forName("org.mockito.exceptions.Reporter");
        Class intType = int.class;
        Class stubbedInvocationMatcherType = Class.forName("org.mockito.invocation.DescribedInvocation");
        Class locationImplType = Class.forName("org.mockito.invocation.Location");
        Method tooManyActualInvocationsInOrderMethod = reporterClazz.getDeclaredMethod("tooManyActualInvocationsInOrder", intType, intType, stubbedInvocationMatcherType, locationImplType);
        tooManyActualInvocationsInOrderMethod.setAccessible(true);
        java.lang.Object[] tooManyActualInvocationsInOrderMethodArguments = new java.lang.Object[4];
        tooManyActualInvocationsInOrderMethodArguments[0] = 0;
        tooManyActualInvocationsInOrderMethodArguments[1] = 0;
        tooManyActualInvocationsInOrderMethodArguments[2] = stubbedInvocationMatcher;
        tooManyActualInvocationsInOrderMethodArguments[3] = locationImpl;
        try {
            tooManyActualInvocationsInOrderMethod.invoke(reporter, tooManyActualInvocationsInOrderMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.mockito.exceptions.Reporter.tooLittleActualInvocations
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method tooLittleActualInvocations(org.mockito.internal.reporting.Discrepancy, org.mockito.invocation.DescribedInvocation, org.mockito.invocation.Location)
    
    /**
    @utbot.classUnderTest {@link Reporter}
 * @utbot.methodUnderTest {@link org.mockito.exceptions.Reporter#tooLittleActualInvocations(org.mockito.internal.reporting.Discrepancy,org.mockito.invocation.DescribedInvocation,org.mockito.invocation.Location)}
 * @utbot.invokes org.mockito.exceptions.Reporter#createTooLittleInvocationsMessage(org.mockito.internal.reporting.Discrepancy,org.mockito.invocation.DescribedInvocation,org.mockito.invocation.Location)
 * @utbot.throwsException {@link java.lang.NullPointerException} in: String message = createTooLittleInvocationsMessage(discrepancy, wanted, lastActualLocation);
 *  */
    @Test
    public void testTooLittleActualInvocations_ThrowNullPointerException() {
        Reporter reporter = new Reporter();
        
        /* This test fails because method [org.mockito.exceptions.Reporter.tooLittleActualInvocations] produces [java.lang.NullPointerException]
            org.mockito.exceptions.Reporter.createTooLittleInvocationsMessage(Reporter.java:394)
            org.mockito.exceptions.Reporter.tooLittleActualInvocations(Reporter.java:404) */
        reporter.tooLittleActualInvocations(null, null, null);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method tooLittleActualInvocations(org.mockito.internal.reporting.Discrepancy, org.mockito.invocation.DescribedInvocation, org.mockito.invocation.Location)
    
    @Test
    public void testTooLittleActualInvocations1() throws Exception  {
        Reporter reporter = new Reporter();
        AtLeastDiscrepancy atLeastDiscrepancy = new AtLeastDiscrepancy(0, 0);
        InvocationImpl invocationImpl = ((InvocationImpl) createInstance("org.mockito.internal.invocation.InvocationImpl"));
        java.lang.Object[] arguments = new java.lang.Object[1];
        Object object = createInstance("java.lang.Object");
        arguments[0] = object;
        setField(invocationImpl, "org.mockito.internal.invocation.InvocationImpl", "arguments", arguments);
        
        /* This test fails because method [org.mockito.exceptions.Reporter.tooLittleActualInvocations] produces [org.mockito.exceptions.misusing.NotAMockException: Argument should be a mock, but is null!] */
        reporter.tooLittleActualInvocations(atLeastDiscrepancy, invocationImpl, null);
    }
    
    @Test
    public void testTooLittleActualInvocations2() throws Exception  {
        Reporter reporter = new Reporter();
        InvocationImpl invocationImpl = ((InvocationImpl) createInstance("org.mockito.internal.invocation.InvocationImpl"));
        java.lang.Object[] arguments = {};
        setField(invocationImpl, "org.mockito.internal.invocation.InvocationImpl", "arguments", arguments);
        
        /* This test fails because method [org.mockito.exceptions.Reporter.tooLittleActualInvocations] produces [org.mockito.exceptions.misusing.NotAMockException: Argument should be a mock, but is null!] */
        reporter.tooLittleActualInvocations(null, invocationImpl, null);
    }
    
    @Test
    public void testTooLittleActualInvocations3() throws Throwable  {
        Reporter reporter = new Reporter();
        AtLeastDiscrepancy atLeastDiscrepancy = new AtLeastDiscrepancy(0, 0);
        StubbedInvocationMatcher stubbedInvocationMatcher = ((StubbedInvocationMatcher) createInstance("org.mockito.internal.stubbing.StubbedInvocationMatcher"));
        LocationImpl locationImpl = ((LocationImpl) createInstance("org.mockito.internal.debugging.LocationImpl"));
        IllegalComponentStateException stackTraceHolder = ((IllegalComponentStateException) createInstance("java.awt.IllegalComponentStateException"));
        setField(locationImpl, "org.mockito.internal.debugging.LocationImpl", "stackTraceHolder", stackTraceHolder);
        StackTraceFilter stackTraceFilter = ((StackTraceFilter) createInstance("org.mockito.internal.exceptions.stacktrace.StackTraceFilter"));
        setField(locationImpl, "org.mockito.internal.debugging.LocationImpl", "stackTraceFilter", stackTraceFilter);
        
        /* This test fails because method [org.mockito.exceptions.Reporter.tooLittleActualInvocations] produces [java.lang.NullPointerException]
            org.mockito.internal.reporting.PrintSettings.print(PrintSettings.java:59)
            org.mockito.internal.invocation.InvocationMatcher.toString(InvocationMatcher.java:75)
            org.mockito.internal.stubbing.StubbedInvocationMatcher.toString(StubbedInvocationMatcher.java:64)
            org.mockito.exceptions.Reporter.createTooLittleInvocationsMessage(Reporter.java:394)
            org.mockito.exceptions.Reporter.tooLittleActualInvocations(Reporter.java:404) */
        Class reporterClazz = Class.forName("org.mockito.exceptions.Reporter");
        Class atLeastDiscrepancyType = Class.forName("org.mockito.internal.reporting.Discrepancy");
        Class stubbedInvocationMatcherType = Class.forName("org.mockito.invocation.DescribedInvocation");
        Class locationImplType = Class.forName("org.mockito.invocation.Location");
        Method tooLittleActualInvocationsMethod = reporterClazz.getDeclaredMethod("tooLittleActualInvocations", atLeastDiscrepancyType, stubbedInvocationMatcherType, locationImplType);
        tooLittleActualInvocationsMethod.setAccessible(true);
        java.lang.Object[] tooLittleActualInvocationsMethodArguments = new java.lang.Object[3];
        tooLittleActualInvocationsMethodArguments[0] = atLeastDiscrepancy;
        tooLittleActualInvocationsMethodArguments[1] = stubbedInvocationMatcher;
        tooLittleActualInvocationsMethodArguments[2] = locationImpl;
        try {
            tooLittleActualInvocationsMethod.invoke(reporter, tooLittleActualInvocationsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTooLittleActualInvocations4() throws Exception  {
        Reporter reporter = new Reporter();
        LocationImpl locationImpl = ((LocationImpl) createInstance("org.mockito.internal.debugging.LocationImpl"));
        IllegalComponentStateException stackTraceHolder = ((IllegalComponentStateException) createInstance("java.awt.IllegalComponentStateException"));
        setField(locationImpl, "org.mockito.internal.debugging.LocationImpl", "stackTraceHolder", stackTraceHolder);
        StackTraceFilter stackTraceFilter = ((StackTraceFilter) createInstance("org.mockito.internal.exceptions.stacktrace.StackTraceFilter"));
        setField(locationImpl, "org.mockito.internal.debugging.LocationImpl", "stackTraceFilter", stackTraceFilter);
        
        /* This test fails because method [org.mockito.exceptions.Reporter.tooLittleActualInvocations] produces [java.lang.NullPointerException]
            org.mockito.exceptions.Reporter.createTooLittleInvocationsMessage(Reporter.java:394)
            org.mockito.exceptions.Reporter.tooLittleActualInvocations(Reporter.java:404) */
        reporter.tooLittleActualInvocations(null, null, locationImpl);
    }
    
    @Test
    public void testTooLittleActualInvocations5() throws Throwable  {
        Reporter reporter = new Reporter();
        org.mockito.exceptions.Discrepancy discrepancy = new org.mockito.exceptions.Discrepancy(0, 0);
        StubbedInvocationMatcher stubbedInvocationMatcher = ((StubbedInvocationMatcher) createInstance("org.mockito.internal.stubbing.StubbedInvocationMatcher"));
        
        /* This test fails because method [org.mockito.exceptions.Reporter.tooLittleActualInvocations] produces [java.lang.NullPointerException]
            org.mockito.internal.reporting.PrintSettings.print(PrintSettings.java:59)
            org.mockito.internal.invocation.InvocationMatcher.toString(InvocationMatcher.java:75)
            org.mockito.internal.stubbing.StubbedInvocationMatcher.toString(StubbedInvocationMatcher.java:64)
            org.mockito.exceptions.Reporter.createTooLittleInvocationsMessage(Reporter.java:394)
            org.mockito.exceptions.Reporter.tooLittleActualInvocations(Reporter.java:404) */
        Class reporterClazz = Class.forName("org.mockito.exceptions.Reporter");
        Class discrepancyType = Class.forName("org.mockito.internal.reporting.Discrepancy");
        Class stubbedInvocationMatcherType = Class.forName("org.mockito.invocation.DescribedInvocation");
        Class locationType = Class.forName("org.mockito.invocation.Location");
        Method tooLittleActualInvocationsMethod = reporterClazz.getDeclaredMethod("tooLittleActualInvocations", discrepancyType, stubbedInvocationMatcherType, locationType);
        tooLittleActualInvocationsMethod.setAccessible(true);
        java.lang.Object[] tooLittleActualInvocationsMethodArguments = new java.lang.Object[3];
        tooLittleActualInvocationsMethodArguments[0] = discrepancy;
        tooLittleActualInvocationsMethodArguments[1] = stubbedInvocationMatcher;
        tooLittleActualInvocationsMethodArguments[2] = ((Object) null);
        try {
            tooLittleActualInvocationsMethod.invoke(reporter, tooLittleActualInvocationsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTooLittleActualInvocations6() throws Throwable  {
        Class globalConfigurationClazz = Class.forName("org.mockito.internal.configuration.GlobalConfiguration");
        ThreadLocal prevGLOBAL_CONFIGURATION = ((ThreadLocal) getStaticFieldValue(globalConfigurationClazz, "GLOBAL_CONFIGURATION"));
        try {
            ThreadLocal globalConfiguration = ((ThreadLocal) createInstance("java.lang.ThreadLocal"));
            setField(globalConfiguration, "java.lang.ThreadLocal", "threadLocalHashCode", 38);
            setStaticField(globalConfigurationClazz, "GLOBAL_CONFIGURATION", globalConfiguration);
            Reporter reporter = new Reporter();
            Discrepancy discrepancy = new Discrepancy(0, 0);
            StubbedInvocationMatcher stubbedInvocationMatcher = ((StubbedInvocationMatcher) createInstance("org.mockito.internal.stubbing.StubbedInvocationMatcher"));
            LocationImpl locationImpl = ((LocationImpl) createInstance("org.mockito.internal.debugging.LocationImpl"));
            MockitoSerializationIssue stackTraceHolder = ((MockitoSerializationIssue) createInstance("org.mockito.exceptions.base.MockitoSerializationIssue"));
            java.lang.StackTraceElement[] unfilteredStackTrace = {null, null, null, null, null, null, null, null, null};
            setField(stackTraceHolder, "org.mockito.exceptions.base.MockitoSerializationIssue", "unfilteredStackTrace", unfilteredStackTrace);
            setField(locationImpl, "org.mockito.internal.debugging.LocationImpl", "stackTraceHolder", stackTraceHolder);
            
            /* This test fails because method [org.mockito.exceptions.Reporter.tooLittleActualInvocations] produces [java.lang.NullPointerException]
                org.mockito.internal.debugging.LocationImpl.toString(LocationImpl.java:29)
                java.base/java.lang.String.valueOf(String.java:4222)
                java.base/java.lang.StringBuilder.append(StringBuilder.java:173)
                org.mockito.exceptions.Reporter.createTooLittleInvocationsMessage(Reporter.java:391)
                org.mockito.exceptions.Reporter.tooLittleActualInvocations(Reporter.java:404) */
            Class reporterClazz = Class.forName("org.mockito.exceptions.Reporter");
            Class discrepancyType = Class.forName("org.mockito.internal.reporting.Discrepancy");
            Class stubbedInvocationMatcherType = Class.forName("org.mockito.invocation.DescribedInvocation");
            Class locationImplType = Class.forName("org.mockito.invocation.Location");
            Method tooLittleActualInvocationsMethod = reporterClazz.getDeclaredMethod("tooLittleActualInvocations", discrepancyType, stubbedInvocationMatcherType, locationImplType);
            tooLittleActualInvocationsMethod.setAccessible(true);
            java.lang.Object[] tooLittleActualInvocationsMethodArguments = new java.lang.Object[3];
            tooLittleActualInvocationsMethodArguments[0] = discrepancy;
            tooLittleActualInvocationsMethodArguments[1] = stubbedInvocationMatcher;
            tooLittleActualInvocationsMethodArguments[2] = locationImpl;
            try {
                tooLittleActualInvocationsMethod.invoke(reporter, tooLittleActualInvocationsMethodArguments);
            } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
        } finally {
            setStaticField(org.mockito.internal.configuration.GlobalConfiguration.class, "GLOBAL_CONFIGURATION", prevGLOBAL_CONFIGURATION);
        }
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
            org.mockito.exceptions.Reporter.cannotMockFinalClass(Reporter.java:441) */
        reporter.cannotMockFinalClass(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.mockito.exceptions.Reporter.cannotCallAbstractRealMethod
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method cannotCallAbstractRealMethod()
    
    /**
    @utbot.classUnderTest {@link Reporter}
 * @utbot.methodUnderTest {@link org.mockito.exceptions.Reporter#cannotCallAbstractRealMethod()}
 * @utbot.invokes {@link org.mockito.internal.util.StringJoiner#join(java.lang.Object[])}
 * @utbot.throwsException {@link org.mockito.exceptions.base.MockitoException} in: throw new MockitoException(join("Cannot call abstract real method on java object!", "Calling real methods is only possible when mocking non abstract method.", "  //correct example:", "  when(mockOfConcreteClass.nonAbstractMethod()).thenCallRealMethod();"));
 *  */
    @Test(expected = MockitoException.class)
    public void testCannotCallAbstractRealMethod_ThrowMockitoException() {
        Reporter reporter = new Reporter();
        
        reporter.cannotCallAbstractRealMethod();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.mockito.exceptions.Reporter.cannotInjectDependency
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method cannotInjectDependency(java.lang.reflect.Field, java.lang.Object, java.lang.Exception)
    
    /**
    @utbot.classUnderTest {@link Reporter}
 * @utbot.methodUnderTest {@link org.mockito.exceptions.Reporter#cannotInjectDependency(java.lang.reflect.Field,java.lang.Object,java.lang.Exception)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes org.mockito.exceptions.Reporter#safelyGetMockName(java.lang.Object)
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.Object)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#toString()}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.Object)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#toString()}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.reflect.Field#getDeclaringClass()}
 * @utbot.invokes {@link java.lang.Class#getCanonicalName()}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#toString()}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes org.mockito.exceptions.Reporter#exceptionCauseMessageIfAvailable(java.lang.Exception)
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#toString()}
 * @utbot.invokes {@link org.mockito.internal.util.StringJoiner#join(java.lang.Object[])}
 * @utbot.throwsException {@link java.lang.IllegalAccessError} in: throw new MockitoException(join("Mockito couldn't inject mock dependency '" + safelyGetMockName(matchingMock) + "' on field ", "'" + field + "'", "whose type '" + field.getDeclaringClass().getCanonicalName() + "' was annotated by @InjectMocks in your test.", "Also I failed because: " + exceptionCauseMessageIfAvailable(details), ""), details);
 *  */
    @Test(expected = IllegalAccessError.class)
    public void testCannotInjectDependency_ThrowIllegalAccessError() {
        Reporter reporter = new Reporter();
        
        reporter.cannotInjectDependency(null, null, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.mockito.exceptions.Reporter.possibleArgumentTypesOf
    
    ///region Errors report for possibleArgumentTypesOf
    
    public void testPossibleArgumentTypesOf_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Field parameterTypes is not declared in class java.lang.reflect.Method
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.mockito.exceptions.Reporter.misplacedArgumentMatcher
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method misplacedArgumentMatcher(java.util.List)
    
    /**
    @utbot.classUnderTest {@link Reporter}
 * @utbot.methodUnderTest {@link org.mockito.exceptions.Reporter#misplacedArgumentMatcher(java.util.List)}
 * @utbot.invokes org.mockito.exceptions.Reporter#locationsOf(java.util.Collection)
 * @utbot.invokes {@link org.mockito.internal.util.StringJoiner#join(java.lang.Object[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: throw new InvalidUseOfMatchersException(join("Misplaced argument matcher detected here:", locationsOf(lastMatchers), "", "You cannot use argument matchers outside of verification or stubbing.", "Examples of correct usage of argument matchers:", "    when(mock.get(anyInt())).thenReturn(null);", "    doThrow(new RuntimeException()).when(mock).someVoidMethod(anyObject());", "    verify(mock).someMethod(contains(\"foo\"))", "", "Also, this error might show up because you use argument matchers with methods that cannot be mocked.", "Following methods *cannot* be stubbed/verified: final/private/equals()/hashCode().", MockitoLimitations.NON_PUBLIC_PARENT, ""));
 *  */
    @Test
    public void testMisplacedArgumentMatcher_ThrowNullPointerException() {
        Reporter reporter = new Reporter();
        
        /* This test fails because method [org.mockito.exceptions.Reporter.misplacedArgumentMatcher] produces [java.lang.NullPointerException]
            org.mockito.exceptions.Reporter.locationsOf(Reporter.java:290)
            org.mockito.exceptions.Reporter.misplacedArgumentMatcher(Reporter.java:500) */
        reporter.misplacedArgumentMatcher(null);
    }
    ///endregion
    
    ///region FUZZER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method misplacedArgumentMatcher(java.util.List)
    
    /**
     * @utbot.classUnderTest {@link org.mockito.exceptions.Reporter}
     * @utbot.methodUnderTest {@link org.mockito.exceptions.Reporter#misplacedArgumentMatcher(java.util.List)}
     */
    @Test(expected = InvalidUseOfMatchersException.class)
    public void testMisplacedArgumentMatcherThrowsIUOME() {
        Reporter reporter = new Reporter();
        LinkedList linkedList = new LinkedList();
        LocalizedMatcher localizedMatcher = new LocalizedMatcher(null);
        LocalizedMatcher localizedMatcher1 = new LocalizedMatcher(localizedMatcher);
        linkedList.add(localizedMatcher1);
        LocalizedMatcher localizedMatcher2 = new LocalizedMatcher(null);
        LocalizedMatcher localizedMatcher3 = new LocalizedMatcher(localizedMatcher2);
        linkedList.add(localizedMatcher3);
        LocalizedMatcher localizedMatcher4 = new LocalizedMatcher(null);
        LocalizedMatcher localizedMatcher5 = new LocalizedMatcher(localizedMatcher4);
        linkedList.add(localizedMatcher5);
        
        reporter.misplacedArgumentMatcher(linkedList);
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
 * @utbot.throwsException {@link java.lang.NullPointerException} in: throw new MockitoException(join("Cannot instantiate a @Spy for '" + fieldName + "' field.", "You haven't provided the instance for spying at field declaration so I tried to construct the instance.", "However, I failed because: " + details.getMessage(), "Examples of correct usage of @Spy:", "   @Spy List mock = new LinkedList();", "   @Spy Foo foo; //only if Foo has parameterless constructor", "   //also, don't forget about MockitoAnnotations.initMocks();", ""), details);
 *  */
    @Test
    public void testCannotInitializeForSpyAnnotation_ThrowNullPointerException() {
        Reporter reporter = new Reporter();
        
        /* This test fails because method [org.mockito.exceptions.Reporter.cannotInitializeForSpyAnnotation] produces [java.lang.NullPointerException]
            org.mockito.exceptions.Reporter.cannotInitializeForSpyAnnotation(Reporter.java:612) */
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
    
    ///region Test suites for executable org.mockito.exceptions.Reporter.delegatedMethodHasWrongReturnType
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method delegatedMethodHasWrongReturnType(java.lang.reflect.Method, java.lang.reflect.Method, java.lang.Object, java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link Reporter}
 * @utbot.methodUnderTest {@link org.mockito.exceptions.Reporter#delegatedMethodHasWrongReturnType(java.lang.reflect.Method,java.lang.reflect.Method,java.lang.Object,java.lang.Object)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.Object)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes org.mockito.exceptions.Reporter#safelyGetMockName(java.lang.Object)
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.Object)}
 * @utbot.invokes {@link java.lang.StringBuilder#toString()}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.reflect.Method#getReturnType()}
 * @utbot.invokes {@link java.lang.Class#getSimpleName()}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.reflect.Method#getReturnType()}
 * @utbot.invokes {@link java.lang.Class#getSimpleName()}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#toString()}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.Class#getSimpleName()}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#toString()}
 * @utbot.invokes {@link org.mockito.internal.util.StringJoiner#join(java.lang.Object[])}
 * @utbot.throwsException {@link java.lang.IllegalAccessError} in: throw new MockitoException(join("Methods called on delegated instance must have compatible return types with the mock.", "When calling: " + mockMethod + " on mock: " + safelyGetMockName(mock), "return type should be: " + mockMethod.getReturnType().getSimpleName() + ", but was: " + delegateMethod.getReturnType().getSimpleName(), "Check that the instance passed to delegatesTo() is of the correct type or contains compatible methods", "(delegate instance had type: " + delegate.getClass().getSimpleName() + ")"));
 *  */
    @Test(expected = IllegalAccessError.class)
    public void testDelegatedMethodHasWrongReturnType_ThrowIllegalAccessError() {
        Reporter reporter = new Reporter();
        
        reporter.delegatedMethodHasWrongReturnType(null, null, null, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.mockito.exceptions.Reporter.fieldInitialisationThrewException
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method fieldInitialisationThrewException(java.lang.reflect.Field, java.lang.Throwable)
    
    /**
    @utbot.classUnderTest {@link Reporter}
 * @utbot.methodUnderTest {@link org.mockito.exceptions.Reporter#fieldInitialisationThrewException(java.lang.reflect.Field,java.lang.Throwable)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.reflect.Field#getName()}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.reflect.Field#getType()}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.Object)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#toString()}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.Throwable#getMessage()}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#toString()}
 * @utbot.invokes {@link org.mockito.internal.util.StringJoiner#join(java.lang.Object[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: throw new MockitoException(join("Cannot instantiate @InjectMocks field named '" + field.getName() + "' of type '" + field.getType() + "'.", "You haven't provided the instance at field declaration so I tried to construct the instance.", "However the constructor or the initialization block threw an exception : " + details.getMessage(), ""), details);
 *  */
    @Test
    public void testFieldInitialisationThrewException_ThrowNullPointerException() {
        Reporter reporter = new Reporter();
        
        /* This test fails because method [org.mockito.exceptions.Reporter.fieldInitialisationThrewException] produces [java.lang.NullPointerException]
            org.mockito.exceptions.Reporter.fieldInitialisationThrewException(Reporter.java:645) */
        reporter.fieldInitialisationThrewException(null, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.mockito.exceptions.Reporter.createTooLittleInvocationsMessage
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method createTooLittleInvocationsMessage(org.mockito.internal.reporting.Discrepancy, org.mockito.invocation.DescribedInvocation, org.mockito.invocation.Location)
    
    /**
    @utbot.classUnderTest {@link Reporter}
 * @utbot.methodUnderTest {@link org.mockito.exceptions.Reporter#createTooLittleInvocationsMessage(org.mockito.internal.reporting.Discrepancy,org.mockito.invocation.DescribedInvocation,org.mockito.invocation.Location)}
 * @utbot.executesCondition {@code ((lastActualInvocation != null)): False}
 * @utbot.invokes {@link org.mockito.invocation.DescribedInvocation#toString()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: wanted.toString()
 *  */
    @Test
    public void testCreateTooLittleInvocationsMessage_ThrowNullPointerException() throws Throwable  {
        Reporter reporter = new Reporter();
        
        /* This test fails because method [org.mockito.exceptions.Reporter.createTooLittleInvocationsMessage] produces [java.lang.NullPointerException]
            org.mockito.exceptions.Reporter.createTooLittleInvocationsMessage(Reporter.java:394) */
        Class reporterClazz = Class.forName("org.mockito.exceptions.Reporter");
        Class discrepancyType = Class.forName("org.mockito.internal.reporting.Discrepancy");
        Class describedInvocationType = Class.forName("org.mockito.invocation.DescribedInvocation");
        Class locationType = Class.forName("org.mockito.invocation.Location");
        Method createTooLittleInvocationsMessageMethod = reporterClazz.getDeclaredMethod("createTooLittleInvocationsMessage", discrepancyType, describedInvocationType, locationType);
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
    ///endregion
    
    ///region OTHER: ERROR SUITE for method createTooLittleInvocationsMessage(org.mockito.internal.reporting.Discrepancy, org.mockito.invocation.DescribedInvocation, org.mockito.invocation.Location)
    
    @Test
    public void testCreateTooLittleInvocationsMessage1() throws Throwable  {
        Reporter reporter = new Reporter();
        AtLeastDiscrepancy atLeastDiscrepancy = new AtLeastDiscrepancy(0, 0);
        InvocationImpl invocationImpl = ((InvocationImpl) createInstance("org.mockito.internal.invocation.InvocationImpl"));
        java.lang.Object[] arguments = {};
        setField(invocationImpl, "org.mockito.internal.invocation.InvocationImpl", "arguments", arguments);
        
        /* This test fails because method [org.mockito.exceptions.Reporter.createTooLittleInvocationsMessage] produces [org.mockito.exceptions.misusing.NotAMockException: Argument should be a mock, but is null!] */
        Class reporterClazz = Class.forName("org.mockito.exceptions.Reporter");
        Class atLeastDiscrepancyType = Class.forName("org.mockito.internal.reporting.Discrepancy");
        Class invocationImplType = Class.forName("org.mockito.invocation.DescribedInvocation");
        Class locationType = Class.forName("org.mockito.invocation.Location");
        Method createTooLittleInvocationsMessageMethod = reporterClazz.getDeclaredMethod("createTooLittleInvocationsMessage", atLeastDiscrepancyType, invocationImplType, locationType);
        createTooLittleInvocationsMessageMethod.setAccessible(true);
        java.lang.Object[] createTooLittleInvocationsMessageMethodArguments = new java.lang.Object[3];
        createTooLittleInvocationsMessageMethodArguments[0] = atLeastDiscrepancy;
        createTooLittleInvocationsMessageMethodArguments[1] = invocationImpl;
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
        InvocationMatcher invocationMatcher = ((InvocationMatcher) createInstance("org.mockito.internal.invocation.InvocationMatcher"));
        LocationImpl locationImpl = ((LocationImpl) createInstance("org.mockito.internal.debugging.LocationImpl"));
        IllegalBlockSizeException stackTraceHolder = ((IllegalBlockSizeException) createInstance("javax.crypto.IllegalBlockSizeException"));
        setField(locationImpl, "org.mockito.internal.debugging.LocationImpl", "stackTraceHolder", stackTraceHolder);
        StackTraceFilter stackTraceFilter = ((StackTraceFilter) createInstance("org.mockito.internal.exceptions.stacktrace.StackTraceFilter"));
        setField(locationImpl, "org.mockito.internal.debugging.LocationImpl", "stackTraceFilter", stackTraceFilter);
        
        /* This test fails because method [org.mockito.exceptions.Reporter.createTooLittleInvocationsMessage] produces [java.lang.NullPointerException]
            org.mockito.internal.reporting.PrintSettings.print(PrintSettings.java:59)
            org.mockito.internal.invocation.InvocationMatcher.toString(InvocationMatcher.java:75)
            org.mockito.exceptions.Reporter.createTooLittleInvocationsMessage(Reporter.java:394) */
        Class reporterClazz = Class.forName("org.mockito.exceptions.Reporter");
        Class discrepancyType = Class.forName("org.mockito.internal.reporting.Discrepancy");
        Class invocationMatcherType = Class.forName("org.mockito.invocation.DescribedInvocation");
        Class locationImplType = Class.forName("org.mockito.invocation.Location");
        Method createTooLittleInvocationsMessageMethod = reporterClazz.getDeclaredMethod("createTooLittleInvocationsMessage", discrepancyType, invocationMatcherType, locationImplType);
        createTooLittleInvocationsMessageMethod.setAccessible(true);
        java.lang.Object[] createTooLittleInvocationsMessageMethodArguments = new java.lang.Object[3];
        createTooLittleInvocationsMessageMethodArguments[0] = ((Object) null);
        createTooLittleInvocationsMessageMethodArguments[1] = invocationMatcher;
        createTooLittleInvocationsMessageMethodArguments[2] = locationImpl;
        try {
            createTooLittleInvocationsMessageMethod.invoke(reporter, createTooLittleInvocationsMessageMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testCreateTooLittleInvocationsMessage3() throws Throwable  {
        Class globalConfigurationClazz = Class.forName("org.mockito.internal.configuration.GlobalConfiguration");
        ThreadLocal prevGLOBAL_CONFIGURATION = ((ThreadLocal) getStaticFieldValue(globalConfigurationClazz, "GLOBAL_CONFIGURATION"));
        try {
            ThreadLocal globalConfiguration = ((ThreadLocal) createInstance("java.lang.ThreadLocal"));
            setField(globalConfiguration, "java.lang.ThreadLocal", "threadLocalHashCode", 38);
            setStaticField(globalConfigurationClazz, "GLOBAL_CONFIGURATION", globalConfiguration);
            Reporter reporter = new Reporter();
            StubbedInvocationMatcher stubbedInvocationMatcher = ((StubbedInvocationMatcher) createInstance("org.mockito.internal.stubbing.StubbedInvocationMatcher"));
            LocationImpl locationImpl = ((LocationImpl) createInstance("org.mockito.internal.debugging.LocationImpl"));
            MockitoSerializationIssue stackTraceHolder = ((MockitoSerializationIssue) createInstance("org.mockito.exceptions.base.MockitoSerializationIssue"));
            setField(locationImpl, "org.mockito.internal.debugging.LocationImpl", "stackTraceHolder", stackTraceHolder);
            
            /* This test fails because method [org.mockito.exceptions.Reporter.createTooLittleInvocationsMessage] produces [java.lang.NullPointerException]
                org.mockito.internal.debugging.LocationImpl.toString(LocationImpl.java:29)
                java.base/java.lang.String.valueOf(String.java:4222)
                java.base/java.lang.StringBuilder.append(StringBuilder.java:173)
                org.mockito.exceptions.Reporter.createTooLittleInvocationsMessage(Reporter.java:391) */
            Class reporterClazz = Class.forName("org.mockito.exceptions.Reporter");
            Class discrepancyType = Class.forName("org.mockito.internal.reporting.Discrepancy");
            Class stubbedInvocationMatcherType = Class.forName("org.mockito.invocation.DescribedInvocation");
            Class locationImplType = Class.forName("org.mockito.invocation.Location");
            Method createTooLittleInvocationsMessageMethod = reporterClazz.getDeclaredMethod("createTooLittleInvocationsMessage", discrepancyType, stubbedInvocationMatcherType, locationImplType);
            createTooLittleInvocationsMessageMethod.setAccessible(true);
            java.lang.Object[] createTooLittleInvocationsMessageMethodArguments = new java.lang.Object[3];
            createTooLittleInvocationsMessageMethodArguments[0] = ((Object) null);
            createTooLittleInvocationsMessageMethodArguments[1] = stubbedInvocationMatcher;
            createTooLittleInvocationsMessageMethodArguments[2] = locationImpl;
            try {
                createTooLittleInvocationsMessageMethod.invoke(reporter, createTooLittleInvocationsMessageMethodArguments);
            } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
        } finally {
            setStaticField(org.mockito.internal.configuration.GlobalConfiguration.class, "GLOBAL_CONFIGURATION", prevGLOBAL_CONFIGURATION);
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.mockito.exceptions.Reporter.wrongTypeOfArgumentToReturn
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method wrongTypeOfArgumentToReturn(org.mockito.invocation.InvocationOnMock, java.lang.String, java.lang.Class, int)
    
    /**
    @utbot.classUnderTest {@link Reporter}
 * @utbot.methodUnderTest {@link org.mockito.exceptions.Reporter#wrongTypeOfArgumentToReturn(org.mockito.invocation.InvocationOnMock,java.lang.String,java.lang.Class,int)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.Class#getSimpleName()}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#toString()}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#toString()}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link org.mockito.invocation.InvocationOnMock#getMock()}
 * @utbot.invokes org.mockito.exceptions.Reporter#safelyGetMockName(java.lang.Object)
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.Object)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link org.mockito.invocation.InvocationOnMock#getMethod()}
 * @utbot.invokes {@link java.lang.reflect.Method#getName()}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#toString()}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(int)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes org.mockito.exceptions.Reporter#possibleArgumentTypesOf(org.mockito.invocation.InvocationOnMock)
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.Object)}
 * @utbot.invokes {@link java.lang.StringBuilder#toString()}
 * @utbot.invokes {@link org.mockito.internal.util.StringJoiner#join(java.lang.Object[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: throw new WrongTypeOfReturnValue(join("The argument of type '" + actualType.getSimpleName() + "' cannot be returned because the following ", "method should return the type '" + expectedType + "'", " -> " + safelyGetMockName(invocation.getMock()) + "." + invocation.getMethod().getName() + "()", "", "The reason for this error can be :", "1. The wanted argument position is incorrect.", "2. The answer is used on the wrong interaction.", "", "Position of the wanted argument is " + argumentIndex + " and " + possibleArgumentTypesOf(invocation), "***", "However if you're still unsure why you're getting above error read on.", "Due to the nature of the syntax above problem might occur because:", "1. This exception *might* occur in wrongly written multi-threaded tests.", "   Please refer to Mockito FAQ on limitations of concurrency testing.", "2. A spy is stubbed using when(spy.foo()).then() syntax. It is safer to stub spies - ", "   - with doReturn|Throw() family of methods. More in javadocs for Mockito.spy() method.", ""));
 *  */
    @Test
    public void testWrongTypeOfArgumentToReturn_ThrowNullPointerException() {
        Reporter reporter = new Reporter();
        
        /* This test fails because method [org.mockito.exceptions.Reporter.wrongTypeOfArgumentToReturn] produces [java.lang.NullPointerException]
            org.mockito.exceptions.Reporter.wrongTypeOfArgumentToReturn(Reporter.java:738) */
        reporter.wrongTypeOfArgumentToReturn(null, null, null, -255);
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
    
    ///region Test suites for executable org.mockito.exceptions.Reporter.smartNullPointerException
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method smartNullPointerException(java.lang.String, org.mockito.invocation.Location)
    
    /**
    @utbot.classUnderTest {@link Reporter}
 * @utbot.methodUnderTest {@link org.mockito.exceptions.Reporter#smartNullPointerException(java.lang.String,org.mockito.invocation.Location)}
 * @utbot.invokes {@link org.mockito.internal.util.StringJoiner#join(java.lang.Object[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: throw new SmartNullPointerException(join("You have a NullPointerException here:", new LocationImpl(), "because this method call was *not* stubbed correctly:", location, invocation, ""));
 *  */
    @Test
    public void testSmartNullPointerException_ThrowNullPointerException() {
        Reporter reporter = new Reporter();
        
        /* This test fails because method [org.mockito.exceptions.Reporter.smartNullPointerException] produces [java.lang.NullPointerException]
            org.mockito.internal.util.StringJoiner.join(StringJoiner.java:17)
            org.mockito.internal.util.StringJoiner.join(StringJoiner.java:12)
            org.mockito.exceptions.Reporter.smartNullPointerException(Reporter.java:516) */
        reporter.smartNullPointerException(null, null);
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
    
    ///region Test suites for executable org.mockito.exceptions.Reporter.missingMethodInvocation
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method missingMethodInvocation()
    
    /**
    @utbot.classUnderTest {@link Reporter}
 * @utbot.methodUnderTest {@link org.mockito.exceptions.Reporter#missingMethodInvocation()}
 * @utbot.invokes {@link org.mockito.internal.util.StringJoiner#join(java.lang.Object[])}
 * @utbot.throwsException {@link org.mockito.exceptions.misusing.MissingMethodInvocationException} in: throw new MissingMethodInvocationException(join("when() requires an argument which has to be 'a method call on a mock'.", "For example:", "    when(mock.getArticles()).thenReturn(articles);", "", "Also, this error might show up because:", "1. you stub either of: final/private/equals()/hashCode() methods.", "   Those methods *cannot* be stubbed/verified.", "   " + MockitoLimitations.NON_PUBLIC_PARENT, "2. inside when() you don't call method on mock but on some other object.", ""));
 *  */
    @Test(expected = MissingMethodInvocationException.class)
    public void testMissingMethodInvocation_ThrowMissingMethodInvocationException() {
        Reporter reporter = new Reporter();
        
        reporter.missingMethodInvocation();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.mockito.exceptions.Reporter.unfinishedVerificationException
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method unfinishedVerificationException(org.mockito.invocation.Location)
    
    /**
    @utbot.classUnderTest {@link Reporter}
 * @utbot.methodUnderTest {@link org.mockito.exceptions.Reporter#unfinishedVerificationException(org.mockito.invocation.Location)}
 * @utbot.invokes {@link org.mockito.internal.util.StringJoiner#join(java.lang.Object[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: throw exception;
 *  */
    @Test
    public void testUnfinishedVerificationException_ThrowNullPointerException() {
        Reporter reporter = new Reporter();
        
        /* This test fails because method [org.mockito.exceptions.Reporter.unfinishedVerificationException] produces [java.lang.NullPointerException]
            org.mockito.internal.util.StringJoiner.join(StringJoiner.java:17)
            org.mockito.internal.util.StringJoiner.join(StringJoiner.java:12)
            org.mockito.exceptions.Reporter.unfinishedVerificationException(Reporter.java:111) */
        reporter.unfinishedVerificationException(null);
    }
    ///endregion
    
    ///region FUZZER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method unfinishedVerificationException(org.mockito.invocation.Location)
    
    /**
     * @utbot.classUnderTest {@link org.mockito.exceptions.Reporter}
     * @utbot.methodUnderTest {@link org.mockito.exceptions.Reporter#unfinishedVerificationException(org.mockito.invocation.Location)}
     */
    @Test(expected = UnfinishedVerificationException.class)
    public void testUnfinishedVerificationExceptionThrowsUVE() {
        Reporter reporter = new Reporter();
        StackTraceFilter stackTraceFilter = new StackTraceFilter();
        LocationImpl locationImpl = new LocationImpl(stackTraceFilter);
        
        reporter.unfinishedVerificationException(locationImpl);
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
            org.mockito.exceptions.Reporter.notAMockPassedToVerify(Reporter.java:129) */
        reporter.notAMockPassedToVerify(null);
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
    
    ///region Test suites for executable org.mockito.exceptions.Reporter.neverWantedButInvoked
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method neverWantedButInvoked(org.mockito.invocation.DescribedInvocation, org.mockito.invocation.Location)
    
    /**
    @utbot.classUnderTest {@link Reporter}
 * @utbot.methodUnderTest {@link org.mockito.exceptions.Reporter#neverWantedButInvoked(org.mockito.invocation.DescribedInvocation,org.mockito.invocation.Location)}
 * @utbot.invokes {@link org.mockito.invocation.DescribedInvocation#toString()}
 * @utbot.invokes {@link org.mockito.internal.util.StringJoiner#join(java.lang.Object[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: throw new NeverWantedButInvoked(join(wanted.toString(), "Never wanted here:", new LocationImpl(), "But invoked here:", firstUndesired, ""));
 *  */
    @Test
    public void testNeverWantedButInvoked_ThrowNullPointerException() {
        Reporter reporter = new Reporter();
        
        /* This test fails because method [org.mockito.exceptions.Reporter.neverWantedButInvoked] produces [java.lang.NullPointerException]
            org.mockito.exceptions.Reporter.neverWantedButInvoked(Reporter.java:372) */
        reporter.neverWantedButInvoked(null, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.mockito.exceptions.Reporter.reportNoSubMatchersFound
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method reportNoSubMatchersFound(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link Reporter}
 * @utbot.methodUnderTest {@link org.mockito.exceptions.Reporter#reportNoSubMatchersFound(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#toString()}
 * @utbot.invokes {@link org.mockito.internal.util.StringJoiner#join(java.lang.Object[])}
 * @utbot.throwsException {@link org.mockito.exceptions.misusing.InvalidUseOfMatchersException} in: throw new InvalidUseOfMatchersException(join("No matchers found for additional matcher " + additionalMatcherName, new LocationImpl(), ""));
 *  */
    @Test(expected = InvalidUseOfMatchersException.class)
    public void testReportNoSubMatchersFound_ThrowInvalidUseOfMatchersException() {
        Reporter reporter = new Reporter();
        
        reporter.reportNoSubMatchersFound(null);
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
    
    ///region Test suites for executable org.mockito.exceptions.Reporter.incorrectUseOfAdditionalMatchers
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method incorrectUseOfAdditionalMatchers(java.lang.String, int, java.util.Collection)
    
    /**
    @utbot.classUnderTest {@link Reporter}
 * @utbot.methodUnderTest {@link org.mockito.exceptions.Reporter#incorrectUseOfAdditionalMatchers(java.lang.String,int,java.util.Collection)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#toString()}
 * @utbot.invokes {@link java.lang.StringBuilder#append(int)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.util.Collection#size()}
 * @utbot.invokes {@link java.lang.StringBuilder#append(int)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#toString()}
 * @utbot.invokes org.mockito.exceptions.Reporter#locationsOf(java.util.Collection)
 * @utbot.invokes {@link org.mockito.internal.util.StringJoiner#join(java.lang.Object[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: throw new InvalidUseOfMatchersException(join("Invalid use of argument matchers inside additional matcher " + additionalMatcherName + " !", new LocationImpl(), "", expectedSubMatchersCount + " sub matchers expected, " + matcherStack.size() + " recorded:", locationsOf(matcherStack), "", "This exception may occur if matchers are combined with raw values:", "    //incorrect:", "    someMethod(AdditionalMatchers.and(isNotNull(), \"raw String\");", "When using matchers, all arguments have to be provided by matchers.", "For example:", "    //correct:", "    someMethod(AdditionalMatchers.and(isNotNull(), eq(\"raw String\"));", "", "For more info see javadoc for Matchers and AdditionalMatchers classes.", ""));
 *  */
    @Test
    public void testIncorrectUseOfAdditionalMatchers_ThrowNullPointerException() {
        Reporter reporter = new Reporter();
        
        /* This test fails because method [org.mockito.exceptions.Reporter.incorrectUseOfAdditionalMatchers] produces [java.lang.NullPointerException]
            org.mockito.exceptions.Reporter.incorrectUseOfAdditionalMatchers(Reporter.java:256) */
        reporter.incorrectUseOfAdditionalMatchers(null, -255, null);
    }
    ///endregion
    
    ///region FUZZER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method incorrectUseOfAdditionalMatchers(java.lang.String, int, java.util.Collection)
    
    /**
     * @utbot.classUnderTest {@link org.mockito.exceptions.Reporter}
     * @utbot.methodUnderTest {@link org.mockito.exceptions.Reporter#incorrectUseOfAdditionalMatchers(java.lang.String,int,java.util.Collection)}
     */
    @Test(expected = InvalidUseOfMatchersException.class)
    public void testIncorrectUseOfAdditionalMatchersThrowsIUOMEWithNonEmptyStringAndCornerCase() {
        Reporter reporter = new Reporter();
        Collection collection = emptyList();
        
        reporter.incorrectUseOfAdditionalMatchers("X", Integer.MAX_VALUE, collection);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.mockito.exceptions.Reporter.argumentsAreDifferent
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method argumentsAreDifferent(java.lang.String, java.lang.String, org.mockito.invocation.Location)
    
    /**
    @utbot.classUnderTest {@link Reporter}
 * @utbot.methodUnderTest {@link org.mockito.exceptions.Reporter#argumentsAreDifferent(java.lang.String,java.lang.String,org.mockito.invocation.Location)}
 * @utbot.invokes {@link org.mockito.internal.util.StringJoiner#join(java.lang.Object[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: String message = join("Argument(s) are different! Wanted:", wanted, new LocationImpl(), "Actual invocation has different arguments:", actual, actualLocation, "");
 *  */
    @Test
    public void testArgumentsAreDifferent_ThrowNullPointerException() {
        Reporter reporter = new Reporter();
        
        /* This test fails because method [org.mockito.exceptions.Reporter.argumentsAreDifferent] produces [java.lang.NullPointerException]
            org.mockito.internal.util.StringJoiner.join(StringJoiner.java:17)
            org.mockito.internal.util.StringJoiner.join(StringJoiner.java:12)
            org.mockito.exceptions.Reporter.argumentsAreDifferent(Reporter.java:296) */
        reporter.argumentsAreDifferent(null, null, null);
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method argumentsAreDifferent(java.lang.String, java.lang.String, org.mockito.invocation.Location)
    
    /**
     * @utbot.classUnderTest {@link org.mockito.exceptions.Reporter}
     * @utbot.methodUnderTest {@link org.mockito.exceptions.Reporter#argumentsAreDifferent(java.lang.String,java.lang.String,org.mockito.invocation.Location)}
     */
    @Test
    public void testArgumentsAreDifferentThrowsNPEWithNonEmptyStringAndEmptyString() {
        Reporter reporter = new Reporter();
        
        /* This test fails because method [org.mockito.exceptions.Reporter.argumentsAreDifferent] produces [java.lang.NullPointerException]
            org.mockito.internal.util.StringJoiner.join(StringJoiner.java:17)
            org.mockito.internal.util.StringJoiner.join(StringJoiner.java:12)
            org.mockito.exceptions.Reporter.argumentsAreDifferent(Reporter.java:296) */
        reporter.argumentsAreDifferent("\n\t\r?", "", null);
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
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method invalidUseOfMatchers(int, java.util.List)
    
    /**
    @utbot.classUnderTest {@link Reporter}
 * @utbot.methodUnderTest {@link org.mockito.exceptions.Reporter#invalidUseOfMatchers(int,java.util.List)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(int)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.util.List#size()}
 * @utbot.invokes {@link java.lang.StringBuilder#append(int)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes org.mockito.exceptions.Reporter#locationsOf(java.util.Collection)
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.Object)}
 * @utbot.invokes {@link java.lang.StringBuilder#toString()}
 * @utbot.invokes {@link org.mockito.internal.util.StringJoiner#join(java.lang.Object[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: throw new InvalidUseOfMatchersException(join("Invalid use of argument matchers!", expectedMatchersCount + " matchers expected, " + recordedMatchers.size() + " recorded:" + locationsOf(recordedMatchers), "", "This exception may occur if matchers are combined with raw values:", "    //incorrect:", "    someMethod(anyObject(), \"raw String\");", "When using matchers, all arguments have to be provided by matchers.", "For example:", "    //correct:", "    someMethod(anyObject(), eq(\"String by matcher\"));", "", "For more info see javadoc for Matchers class.", ""));
 *  */
    @Test
    public void testInvalidUseOfMatchers_ThrowNullPointerException() {
        Reporter reporter = new Reporter();
        
        /* This test fails because method [org.mockito.exceptions.Reporter.invalidUseOfMatchers] produces [java.lang.NullPointerException]
            org.mockito.exceptions.Reporter.invalidUseOfMatchers(Reporter.java:235) */
        reporter.invalidUseOfMatchers(-255, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.mockito.exceptions.Reporter.wantedButNotInvoked
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method wantedButNotInvoked(org.mockito.invocation.DescribedInvocation, java.util.List)
    
    /**
    @utbot.classUnderTest {@link Reporter}
 * @utbot.methodUnderTest {@link org.mockito.exceptions.Reporter#wantedButNotInvoked(org.mockito.invocation.DescribedInvocation,java.util.List)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: invocations.isEmpty()
 *  */
    @Test
    public void testWantedButNotInvoked_ThrowNullPointerException() {
        Reporter reporter = new Reporter();
        
        /* This test fails because method [org.mockito.exceptions.Reporter.wantedButNotInvoked] produces [java.lang.NullPointerException]
            org.mockito.exceptions.Reporter.wantedButNotInvoked(Reporter.java:314) */
        reporter.wantedButNotInvoked(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link Reporter}
 * @utbot.methodUnderTest {@link org.mockito.exceptions.Reporter#wantedButNotInvoked(org.mockito.invocation.DescribedInvocation,java.util.List)}
 * @utbot.invokes {@link java.util.List#isEmpty()}
 * @utbot.invokes org.mockito.exceptions.Reporter#createWantedButNotInvokedMessage(org.mockito.invocation.DescribedInvocation)
 * @utbot.throwsException {@link java.lang.NullPointerException} in: String message = createWantedButNotInvokedMessage(wanted);
 *  */
    @Test
    public void testWantedButNotInvoked_ThrowNullPointerException_1() {
        Reporter reporter = new Reporter();
        ArrayList arrayList = new ArrayList();
        
        /* This test fails because method [org.mockito.exceptions.Reporter.wantedButNotInvoked] produces [java.lang.NullPointerException]
            org.mockito.exceptions.Reporter.createWantedButNotInvokedMessage(Reporter.java:334)
            org.mockito.exceptions.Reporter.wantedButNotInvoked(Reporter.java:327) */
        reporter.wantedButNotInvoked(null, arrayList);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method wantedButNotInvoked(org.mockito.invocation.DescribedInvocation, java.util.List)
    
    @Test
    public void testWantedButNotInvoked1() throws Exception  {
        Reporter reporter = new Reporter();
        InvocationImpl invocationImpl = ((InvocationImpl) createInstance("org.mockito.internal.invocation.InvocationImpl"));
        java.lang.Object[] arguments = new java.lang.Object[2];
        Object object = createInstance("java.lang.Object");
        arguments[1] = object;
        setField(invocationImpl, "org.mockito.internal.invocation.InvocationImpl", "arguments", arguments);
        ArrayList arrayList = new ArrayList();
        
        /* This test fails because method [org.mockito.exceptions.Reporter.wantedButNotInvoked] produces [org.mockito.exceptions.misusing.NotAMockException: Argument should be a mock, but is null!] */
        reporter.wantedButNotInvoked(invocationImpl, arrayList);
    }
    
    @Test
    public void testWantedButNotInvoked2() throws Exception  {
        Reporter reporter = new Reporter();
        InvocationImpl invocationImpl = ((InvocationImpl) createInstance("org.mockito.internal.invocation.InvocationImpl"));
        java.lang.Object[] arguments = new java.lang.Object[27];
        Object object = createInstance("java.lang.Object");
        arguments[1] = object;
        setField(invocationImpl, "org.mockito.internal.invocation.InvocationImpl", "arguments", arguments);
        ArrayList arrayList = new ArrayList();
        
        /* This test fails because method [org.mockito.exceptions.Reporter.wantedButNotInvoked] produces [org.mockito.exceptions.misusing.NotAMockException: Argument should be a mock, but is null!] */
        reporter.wantedButNotInvoked(invocationImpl, arrayList);
    }
    
    @Test
    public void testWantedButNotInvoked3() throws Throwable  {
        Reporter reporter = new Reporter();
        StubbedInvocationMatcher stubbedInvocationMatcher = ((StubbedInvocationMatcher) createInstance("org.mockito.internal.stubbing.StubbedInvocationMatcher"));
        InvocationImpl invocation = ((InvocationImpl) createInstance("org.mockito.internal.invocation.InvocationImpl"));
        Object mock = createInstance("java.lang.Object");
        setField(invocation, "org.mockito.internal.invocation.InvocationImpl", "mock", mock);
        setField(stubbedInvocationMatcher, "org.mockito.internal.invocation.InvocationMatcher", "invocation", invocation);
        ArrayList arrayList = new ArrayList();
        
        /* This test fails because method [org.mockito.exceptions.Reporter.wantedButNotInvoked] produces [org.mockito.exceptions.misusing.NotAMockException: Argument should be a mock, but is: class java.lang.Object] */
        Class reporterClazz = Class.forName("org.mockito.exceptions.Reporter");
        Class stubbedInvocationMatcherType = Class.forName("org.mockito.invocation.DescribedInvocation");
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
    
    @Test
    public void testWantedButNotInvoked4() throws Throwable  {
        Reporter reporter = new Reporter();
        StubbedInvocationMatcher stubbedInvocationMatcher = ((StubbedInvocationMatcher) createInstance("org.mockito.internal.stubbing.StubbedInvocationMatcher"));
        InvocationImpl invocation = ((InvocationImpl) createInstance("org.mockito.internal.invocation.InvocationImpl"));
        setField(stubbedInvocationMatcher, "org.mockito.internal.invocation.InvocationMatcher", "invocation", invocation);
        ArrayList arrayList = new ArrayList();
        
        /* This test fails because method [org.mockito.exceptions.Reporter.wantedButNotInvoked] produces [org.mockito.exceptions.misusing.NotAMockException: Argument should be a mock, but is null!] */
        Class reporterClazz = Class.forName("org.mockito.exceptions.Reporter");
        Class stubbedInvocationMatcherType = Class.forName("org.mockito.invocation.DescribedInvocation");
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
    
    ///endregion
    
    ///region Test suites for executable org.mockito.exceptions.Reporter.wantedButNotInvoked
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method wantedButNotInvoked(org.mockito.invocation.DescribedInvocation)
    
    /**
    @utbot.classUnderTest {@link Reporter}
 * @utbot.methodUnderTest {@link org.mockito.exceptions.Reporter#wantedButNotInvoked(org.mockito.invocation.DescribedInvocation)}
 * @utbot.invokes org.mockito.exceptions.Reporter#createWantedButNotInvokedMessage(org.mockito.invocation.DescribedInvocation)
 * @utbot.throwsException {@link java.lang.NullPointerException} in: throw new WantedButNotInvoked(createWantedButNotInvokedMessage(wanted));
 *  */
    @Test
    public void testWantedButNotInvoked_ThrowNullPointerException1() {
        Reporter reporter = new Reporter();
        
        /* This test fails because method [org.mockito.exceptions.Reporter.wantedButNotInvoked] produces [java.lang.NullPointerException]
            org.mockito.exceptions.Reporter.createWantedButNotInvokedMessage(Reporter.java:334)
            org.mockito.exceptions.Reporter.wantedButNotInvoked(Reporter.java:309) */
        reporter.wantedButNotInvoked(null);
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
    
    ///region Test suites for executable org.mockito.exceptions.Reporter.createWantedButNotInvokedMessage
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method createWantedButNotInvokedMessage(org.mockito.invocation.DescribedInvocation)
    
    /**
    @utbot.classUnderTest {@link Reporter}
 * @utbot.methodUnderTest {@link org.mockito.exceptions.Reporter#createWantedButNotInvokedMessage(org.mockito.invocation.DescribedInvocation)}
 * @utbot.invokes {@link org.mockito.invocation.DescribedInvocation#toString()}
 * @utbot.throwsException {@link org.mockito.exceptions.misusing.NotAMockException} in: wanted.toString()
 *  */
    @Test
    public void testCreateWantedButNotInvokedMessage_ThrowNotAMockException() throws Throwable  {
        Reporter reporter = new Reporter();
        StubbedInvocationMatcher stubbedInvocationMatcher = ((StubbedInvocationMatcher) createInstance("org.mockito.internal.stubbing.StubbedInvocationMatcher"));
        InvocationImpl invocation = ((InvocationImpl) createInstance("org.mockito.internal.invocation.InvocationImpl"));
        setField(stubbedInvocationMatcher, "org.mockito.internal.invocation.InvocationMatcher", "invocation", invocation);
        ArrayList matchers = new ArrayList();
        setField(stubbedInvocationMatcher, "org.mockito.internal.invocation.InvocationMatcher", "matchers", matchers);
        
        /* This test fails because method [org.mockito.exceptions.Reporter.createWantedButNotInvokedMessage] produces [org.mockito.exceptions.misusing.NotAMockException: Argument should be a mock, but is null!] */
        Class reporterClazz = Class.forName("org.mockito.exceptions.Reporter");
        Class stubbedInvocationMatcherType = Class.forName("org.mockito.invocation.DescribedInvocation");
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
    
    /**
    @utbot.classUnderTest {@link Reporter}
 * @utbot.methodUnderTest {@link org.mockito.exceptions.Reporter#createWantedButNotInvokedMessage(org.mockito.invocation.DescribedInvocation)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: wanted.toString()
 *  */
    @Test
    public void testCreateWantedButNotInvokedMessage_ThrowNullPointerException() throws Throwable  {
        Reporter reporter = new Reporter();
        
        /* This test fails because method [org.mockito.exceptions.Reporter.createWantedButNotInvokedMessage] produces [java.lang.NullPointerException]
            org.mockito.exceptions.Reporter.createWantedButNotInvokedMessage(Reporter.java:334) */
        Class reporterClazz = Class.forName("org.mockito.exceptions.Reporter");
        Class describedInvocationType = Class.forName("org.mockito.invocation.DescribedInvocation");
        Method createWantedButNotInvokedMessageMethod = reporterClazz.getDeclaredMethod("createWantedButNotInvokedMessage", describedInvocationType);
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
    
    ///region OTHER: ERROR SUITE for method createWantedButNotInvokedMessage(org.mockito.invocation.DescribedInvocation)
    
    @Test
    public void testCreateWantedButNotInvokedMessage1() throws Throwable  {
        Reporter reporter = new Reporter();
        InvocationImpl invocationImpl = ((InvocationImpl) createInstance("org.mockito.internal.invocation.InvocationImpl"));
        java.lang.Object[] arguments = new java.lang.Object[2];
        Object object = createInstance("java.lang.Object");
        arguments[0] = object;
        arguments[1] = object;
        setField(invocationImpl, "org.mockito.internal.invocation.InvocationImpl", "arguments", arguments);
        
        /* This test fails because method [org.mockito.exceptions.Reporter.createWantedButNotInvokedMessage] produces [org.mockito.exceptions.misusing.NotAMockException: Argument should be a mock, but is null!] */
        Class reporterClazz = Class.forName("org.mockito.exceptions.Reporter");
        Class invocationImplType = Class.forName("org.mockito.invocation.DescribedInvocation");
        Method createWantedButNotInvokedMessageMethod = reporterClazz.getDeclaredMethod("createWantedButNotInvokedMessage", invocationImplType);
        createWantedButNotInvokedMessageMethod.setAccessible(true);
        java.lang.Object[] createWantedButNotInvokedMessageMethodArguments = new java.lang.Object[1];
        createWantedButNotInvokedMessageMethodArguments[0] = invocationImpl;
        try {
            createWantedButNotInvokedMessageMethod.invoke(reporter, createWantedButNotInvokedMessageMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testCreateWantedButNotInvokedMessage2() throws Throwable  {
        Reporter reporter = new Reporter();
        InvocationImpl invocationImpl = ((InvocationImpl) createInstance("org.mockito.internal.invocation.InvocationImpl"));
        java.lang.Object[] arguments = new java.lang.Object[10];
        Object object = createInstance("java.lang.Object");
        arguments[0] = object;
        String string = "";
        arguments[2] = ((Object) string);
        arguments[3] = ((Object) string);
        arguments[4] = ((Object) string);
        arguments[5] = ((Object) string);
        arguments[6] = ((Object) string);
        arguments[7] = ((Object) string);
        arguments[8] = ((Object) string);
        arguments[9] = ((Object) string);
        setField(invocationImpl, "org.mockito.internal.invocation.InvocationImpl", "arguments", arguments);
        
        /* This test fails because method [org.mockito.exceptions.Reporter.createWantedButNotInvokedMessage] produces [org.mockito.exceptions.misusing.NotAMockException: Argument should be a mock, but is null!] */
        Class reporterClazz = Class.forName("org.mockito.exceptions.Reporter");
        Class invocationImplType = Class.forName("org.mockito.invocation.DescribedInvocation");
        Method createWantedButNotInvokedMessageMethod = reporterClazz.getDeclaredMethod("createWantedButNotInvokedMessage", invocationImplType);
        createWantedButNotInvokedMessageMethod.setAccessible(true);
        java.lang.Object[] createWantedButNotInvokedMessageMethodArguments = new java.lang.Object[1];
        createWantedButNotInvokedMessageMethodArguments[0] = invocationImpl;
        try {
            createWantedButNotInvokedMessageMethod.invoke(reporter, createWantedButNotInvokedMessageMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testCreateWantedButNotInvokedMessage3() throws Throwable  {
        Reporter reporter = new Reporter();
        StubbedInvocationMatcher stubbedInvocationMatcher = ((StubbedInvocationMatcher) createInstance("org.mockito.internal.stubbing.StubbedInvocationMatcher"));
        InvocationImpl invocation = ((InvocationImpl) createInstance("org.mockito.internal.invocation.InvocationImpl"));
        Object mock = createInstance("java.lang.Object");
        setField(invocation, "org.mockito.internal.invocation.InvocationImpl", "mock", mock);
        setField(stubbedInvocationMatcher, "org.mockito.internal.invocation.InvocationMatcher", "invocation", invocation);
        
        /* This test fails because method [org.mockito.exceptions.Reporter.createWantedButNotInvokedMessage] produces [org.mockito.exceptions.misusing.NotAMockException: Argument should be a mock, but is: class java.lang.Object] */
        Class reporterClazz = Class.forName("org.mockito.exceptions.Reporter");
        Class stubbedInvocationMatcherType = Class.forName("org.mockito.invocation.DescribedInvocation");
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
    
    ///endregion
    
    ///region Test suites for executable org.mockito.exceptions.Reporter.wantedButNotInvokedInOrder
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method wantedButNotInvokedInOrder(org.mockito.invocation.DescribedInvocation, org.mockito.invocation.DescribedInvocation)
    
    /**
    @utbot.classUnderTest {@link Reporter}
 * @utbot.methodUnderTest {@link org.mockito.exceptions.Reporter#wantedButNotInvokedInOrder(org.mockito.invocation.DescribedInvocation,org.mockito.invocation.DescribedInvocation)}
 * @utbot.invokes {@link org.mockito.invocation.DescribedInvocation#toString()}
 * @utbot.invokes {@link org.mockito.invocation.DescribedInvocation#toString()}
 * @utbot.invokes {@link org.mockito.invocation.DescribedInvocation#getLocation()}
 * @utbot.invokes {@link org.mockito.internal.util.StringJoiner#join(java.lang.Object[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: throw new VerificationInOrderFailure(join("Verification in order failure", "Wanted but not invoked:", wanted.toString(), new LocationImpl(), "Wanted anywhere AFTER following interaction:", previous.toString(), previous.getLocation(), ""));
 *  */
    @Test
    public void testWantedButNotInvokedInOrder_ThrowNullPointerException() {
        Reporter reporter = new Reporter();
        
        /* This test fails because method [org.mockito.exceptions.Reporter.wantedButNotInvokedInOrder] produces [java.lang.NullPointerException]
            org.mockito.exceptions.Reporter.wantedButNotInvokedInOrder(Reporter.java:344) */
        reporter.wantedButNotInvokedInOrder(null, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.mockito.exceptions.Reporter.tooManyActualInvocations
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method tooManyActualInvocations(int, int, org.mockito.invocation.DescribedInvocation, org.mockito.invocation.Location)
    
    /**
    @utbot.classUnderTest {@link Reporter}
 * @utbot.methodUnderTest {@link org.mockito.exceptions.Reporter#tooManyActualInvocations(int,int,org.mockito.invocation.DescribedInvocation,org.mockito.invocation.Location)}
 * @utbot.throwsException {@link org.mockito.exceptions.misusing.NotAMockException} 
 *  */
    @Test
    public void testTooManyActualInvocations_ThrowNotAMockException() throws Throwable  {
        Reporter reporter = new Reporter();
        StubbedInvocationMatcher stubbedInvocationMatcher = ((StubbedInvocationMatcher) createInstance("org.mockito.internal.stubbing.StubbedInvocationMatcher"));
        InvocationImpl invocation = ((InvocationImpl) createInstance("org.mockito.internal.invocation.InvocationImpl"));
        setField(stubbedInvocationMatcher, "org.mockito.internal.invocation.InvocationMatcher", "invocation", invocation);
        ArrayList matchers = new ArrayList();
        setField(stubbedInvocationMatcher, "org.mockito.internal.invocation.InvocationMatcher", "matchers", matchers);
        
        /* This test fails because method [org.mockito.exceptions.Reporter.tooManyActualInvocations] produces [org.mockito.exceptions.misusing.NotAMockException: Argument should be a mock, but is null!] */
        Class reporterClazz = Class.forName("org.mockito.exceptions.Reporter");
        Class intType = int.class;
        Class stubbedInvocationMatcherType = Class.forName("org.mockito.invocation.DescribedInvocation");
        Class locationType = Class.forName("org.mockito.invocation.Location");
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
    
    /**
    @utbot.classUnderTest {@link Reporter}
 * @utbot.methodUnderTest {@link org.mockito.exceptions.Reporter#tooManyActualInvocations(int,int,org.mockito.invocation.DescribedInvocation,org.mockito.invocation.Location)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: String message = createTooManyInvocationsMessage(wantedCount, actualCount, wanted, firstUndesired);
 *  */
    @Test
    public void testTooManyActualInvocations_ThrowNullPointerException() {
        Reporter reporter = new Reporter();
        
        /* This test fails because method [org.mockito.exceptions.Reporter.tooManyActualInvocations] produces [java.lang.NullPointerException]
            org.mockito.exceptions.Reporter.createTooManyInvocationsMessage(Reporter.java:361)
            org.mockito.exceptions.Reporter.tooManyActualInvocations(Reporter.java:354) */
        reporter.tooManyActualInvocations(-255, -255, null, null);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method tooManyActualInvocations(int, int, org.mockito.invocation.DescribedInvocation, org.mockito.invocation.Location)
    
    @Test
    public void testTooManyActualInvocations1() throws Exception  {
        Reporter reporter = new Reporter();
        InvocationImpl invocationImpl = ((InvocationImpl) createInstance("org.mockito.internal.invocation.InvocationImpl"));
        java.lang.Object[] arguments = new java.lang.Object[10];
        Object object = createInstance("java.lang.Object");
        arguments[0] = object;
        arguments[1] = object;
        Class class1 = Object.class;
        arguments[2] = ((Object) class1);
        arguments[3] = ((Object) class1);
        arguments[4] = ((Object) class1);
        arguments[5] = ((Object) class1);
        arguments[6] = ((Object) class1);
        arguments[7] = ((Object) class1);
        arguments[8] = ((Object) class1);
        arguments[9] = ((Object) class1);
        setField(invocationImpl, "org.mockito.internal.invocation.InvocationImpl", "arguments", arguments);
        LocationImpl locationImpl = ((LocationImpl) createInstance("org.mockito.internal.debugging.LocationImpl"));
        
        /* This test fails because method [org.mockito.exceptions.Reporter.tooManyActualInvocations] produces [org.mockito.exceptions.misusing.NotAMockException: Argument should be a mock, but is null!] */
        reporter.tooManyActualInvocations(0, 0, invocationImpl, locationImpl);
    }
    
    @Test
    public void testTooManyActualInvocations2() throws Exception  {
        Reporter reporter = new Reporter();
        InvocationImpl invocationImpl = ((InvocationImpl) createInstance("org.mockito.internal.invocation.InvocationImpl"));
        java.lang.Object[] arguments = new java.lang.Object[2];
        Object object = createInstance("java.lang.Object");
        arguments[1] = object;
        setField(invocationImpl, "org.mockito.internal.invocation.InvocationImpl", "arguments", arguments);
        LocationImpl locationImpl = ((LocationImpl) createInstance("org.mockito.internal.debugging.LocationImpl"));
        
        /* This test fails because method [org.mockito.exceptions.Reporter.tooManyActualInvocations] produces [org.mockito.exceptions.misusing.NotAMockException: Argument should be a mock, but is null!] */
        reporter.tooManyActualInvocations(0, 0, invocationImpl, locationImpl);
    }
    
    @Test
    public void testTooManyActualInvocations3() throws Throwable  {
        Reporter reporter = new Reporter();
        StubbedInvocationMatcher stubbedInvocationMatcher = ((StubbedInvocationMatcher) createInstance("org.mockito.internal.stubbing.StubbedInvocationMatcher"));
        InvocationImpl invocation = ((InvocationImpl) createInstance("org.mockito.internal.invocation.InvocationImpl"));
        Object mock = createInstance("java.lang.Object");
        setField(invocation, "org.mockito.internal.invocation.InvocationImpl", "mock", mock);
        setField(stubbedInvocationMatcher, "org.mockito.internal.invocation.InvocationMatcher", "invocation", invocation);
        
        /* This test fails because method [org.mockito.exceptions.Reporter.tooManyActualInvocations] produces [org.mockito.exceptions.misusing.NotAMockException: Argument should be a mock, but is: class java.lang.Object] */
        Class reporterClazz = Class.forName("org.mockito.exceptions.Reporter");
        Class intType = int.class;
        Class stubbedInvocationMatcherType = Class.forName("org.mockito.invocation.DescribedInvocation");
        Class locationType = Class.forName("org.mockito.invocation.Location");
        Method tooManyActualInvocationsMethod = reporterClazz.getDeclaredMethod("tooManyActualInvocations", intType, intType, stubbedInvocationMatcherType, locationType);
        tooManyActualInvocationsMethod.setAccessible(true);
        java.lang.Object[] tooManyActualInvocationsMethodArguments = new java.lang.Object[4];
        tooManyActualInvocationsMethodArguments[0] = 0;
        tooManyActualInvocationsMethodArguments[1] = 0;
        tooManyActualInvocationsMethodArguments[2] = stubbedInvocationMatcher;
        tooManyActualInvocationsMethodArguments[3] = ((Object) null);
        try {
            tooManyActualInvocationsMethod.invoke(reporter, tooManyActualInvocationsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.mockito.exceptions.Reporter.createTooManyInvocationsMessage
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method createTooManyInvocationsMessage(int, int, org.mockito.invocation.DescribedInvocation, org.mockito.invocation.Location)
    
    /**
    @utbot.classUnderTest {@link Reporter}
 * @utbot.methodUnderTest {@link org.mockito.exceptions.Reporter#createTooManyInvocationsMessage(int,int,org.mockito.invocation.DescribedInvocation,org.mockito.invocation.Location)}
 * @utbot.invokes {@link org.mockito.invocation.DescribedInvocation#toString()}
 * @utbot.throwsException {@link org.mockito.exceptions.misusing.NotAMockException} in: wanted.toString()
 *  */
    @Test
    public void testCreateTooManyInvocationsMessage_ThrowNotAMockException() throws Throwable  {
        Reporter reporter = new Reporter();
        StubbedInvocationMatcher stubbedInvocationMatcher = ((StubbedInvocationMatcher) createInstance("org.mockito.internal.stubbing.StubbedInvocationMatcher"));
        InvocationImpl invocation = ((InvocationImpl) createInstance("org.mockito.internal.invocation.InvocationImpl"));
        setField(stubbedInvocationMatcher, "org.mockito.internal.invocation.InvocationMatcher", "invocation", invocation);
        ArrayList matchers = new ArrayList();
        setField(stubbedInvocationMatcher, "org.mockito.internal.invocation.InvocationMatcher", "matchers", matchers);
        
        /* This test fails because method [org.mockito.exceptions.Reporter.createTooManyInvocationsMessage] produces [org.mockito.exceptions.misusing.NotAMockException: Argument should be a mock, but is null!] */
        Class reporterClazz = Class.forName("org.mockito.exceptions.Reporter");
        Class intType = int.class;
        Class stubbedInvocationMatcherType = Class.forName("org.mockito.invocation.DescribedInvocation");
        Class locationType = Class.forName("org.mockito.invocation.Location");
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
    
    /**
    @utbot.classUnderTest {@link Reporter}
 * @utbot.methodUnderTest {@link org.mockito.exceptions.Reporter#createTooManyInvocationsMessage(int,int,org.mockito.invocation.DescribedInvocation,org.mockito.invocation.Location)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: wanted.toString()
 *  */
    @Test
    public void testCreateTooManyInvocationsMessage_ThrowNullPointerException() throws Throwable  {
        Reporter reporter = new Reporter();
        
        /* This test fails because method [org.mockito.exceptions.Reporter.createTooManyInvocationsMessage] produces [java.lang.NullPointerException]
            org.mockito.exceptions.Reporter.createTooManyInvocationsMessage(Reporter.java:361) */
        Class reporterClazz = Class.forName("org.mockito.exceptions.Reporter");
        Class intType = int.class;
        Class describedInvocationType = Class.forName("org.mockito.invocation.DescribedInvocation");
        Class locationType = Class.forName("org.mockito.invocation.Location");
        Method createTooManyInvocationsMessageMethod = reporterClazz.getDeclaredMethod("createTooManyInvocationsMessage", intType, intType, describedInvocationType, locationType);
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
    
    ///region OTHER: ERROR SUITE for method createTooManyInvocationsMessage(int, int, org.mockito.invocation.DescribedInvocation, org.mockito.invocation.Location)
    
    @Test
    public void testCreateTooManyInvocationsMessage1() throws Throwable  {
        Reporter reporter = new Reporter();
        InvocationImpl invocationImpl = ((InvocationImpl) createInstance("org.mockito.internal.invocation.InvocationImpl"));
        java.lang.Object[] arguments = new java.lang.Object[10];
        Object object = createInstance("java.lang.Object");
        arguments[0] = object;
        arguments[1] = object;
        Object object1 = createInstance("java.lang.Object");
        arguments[2] = object1;
        arguments[3] = object1;
        arguments[4] = object1;
        arguments[5] = object1;
        arguments[6] = object1;
        arguments[7] = object1;
        arguments[8] = object1;
        arguments[9] = object1;
        setField(invocationImpl, "org.mockito.internal.invocation.InvocationImpl", "arguments", arguments);
        LocationImpl locationImpl = ((LocationImpl) createInstance("org.mockito.internal.debugging.LocationImpl"));
        
        /* This test fails because method [org.mockito.exceptions.Reporter.createTooManyInvocationsMessage] produces [org.mockito.exceptions.misusing.NotAMockException: Argument should be a mock, but is null!] */
        Class reporterClazz = Class.forName("org.mockito.exceptions.Reporter");
        Class intType = int.class;
        Class invocationImplType = Class.forName("org.mockito.invocation.DescribedInvocation");
        Class locationImplType = Class.forName("org.mockito.invocation.Location");
        Method createTooManyInvocationsMessageMethod = reporterClazz.getDeclaredMethod("createTooManyInvocationsMessage", intType, intType, invocationImplType, locationImplType);
        createTooManyInvocationsMessageMethod.setAccessible(true);
        java.lang.Object[] createTooManyInvocationsMessageMethodArguments = new java.lang.Object[4];
        createTooManyInvocationsMessageMethodArguments[0] = 0;
        createTooManyInvocationsMessageMethodArguments[1] = 0;
        createTooManyInvocationsMessageMethodArguments[2] = invocationImpl;
        createTooManyInvocationsMessageMethodArguments[3] = locationImpl;
        try {
            createTooManyInvocationsMessageMethod.invoke(reporter, createTooManyInvocationsMessageMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testCreateTooManyInvocationsMessage2() throws Throwable  {
        Reporter reporter = new Reporter();
        InvocationImpl invocationImpl = ((InvocationImpl) createInstance("org.mockito.internal.invocation.InvocationImpl"));
        java.lang.Object[] arguments = new java.lang.Object[10];
        Object object = createInstance("java.lang.Object");
        arguments[0] = object;
        arguments[1] = object;
        Object object1 = createInstance("java.lang.Object");
        arguments[2] = object1;
        arguments[3] = object1;
        arguments[4] = object1;
        arguments[5] = object1;
        arguments[6] = object1;
        arguments[7] = object1;
        arguments[8] = object1;
        arguments[9] = object1;
        setField(invocationImpl, "org.mockito.internal.invocation.InvocationImpl", "arguments", arguments);
        LocationImpl locationImpl = ((LocationImpl) createInstance("org.mockito.internal.debugging.LocationImpl"));
        
        /* This test fails because method [org.mockito.exceptions.Reporter.createTooManyInvocationsMessage] produces [org.mockito.exceptions.misusing.NotAMockException: Argument should be a mock, but is null!] */
        Class reporterClazz = Class.forName("org.mockito.exceptions.Reporter");
        Class intType = int.class;
        Class invocationImplType = Class.forName("org.mockito.invocation.DescribedInvocation");
        Class locationImplType = Class.forName("org.mockito.invocation.Location");
        Method createTooManyInvocationsMessageMethod = reporterClazz.getDeclaredMethod("createTooManyInvocationsMessage", intType, intType, invocationImplType, locationImplType);
        createTooManyInvocationsMessageMethod.setAccessible(true);
        java.lang.Object[] createTooManyInvocationsMessageMethodArguments = new java.lang.Object[4];
        createTooManyInvocationsMessageMethodArguments[0] = 0;
        createTooManyInvocationsMessageMethodArguments[1] = 0;
        createTooManyInvocationsMessageMethodArguments[2] = invocationImpl;
        createTooManyInvocationsMessageMethodArguments[3] = locationImpl;
        try {
            createTooManyInvocationsMessageMethod.invoke(reporter, createTooManyInvocationsMessageMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testCreateTooManyInvocationsMessage3() throws Throwable  {
        Reporter reporter = new Reporter();
        StubbedInvocationMatcher stubbedInvocationMatcher = ((StubbedInvocationMatcher) createInstance("org.mockito.internal.stubbing.StubbedInvocationMatcher"));
        InvocationImpl invocation = ((InvocationImpl) createInstance("org.mockito.internal.invocation.InvocationImpl"));
        Object mock = createInstance("java.lang.Object");
        setField(invocation, "org.mockito.internal.invocation.InvocationImpl", "mock", mock);
        setField(stubbedInvocationMatcher, "org.mockito.internal.invocation.InvocationMatcher", "invocation", invocation);
        
        /* This test fails because method [org.mockito.exceptions.Reporter.createTooManyInvocationsMessage] produces [org.mockito.exceptions.misusing.NotAMockException: Argument should be a mock, but is: class java.lang.Object] */
        Class reporterClazz = Class.forName("org.mockito.exceptions.Reporter");
        Class intType = int.class;
        Class stubbedInvocationMatcherType = Class.forName("org.mockito.invocation.DescribedInvocation");
        Class locationType = Class.forName("org.mockito.invocation.Location");
        Method createTooManyInvocationsMessageMethod = reporterClazz.getDeclaredMethod("createTooManyInvocationsMessage", intType, intType, stubbedInvocationMatcherType, locationType);
        createTooManyInvocationsMessageMethod.setAccessible(true);
        java.lang.Object[] createTooManyInvocationsMessageMethodArguments = new java.lang.Object[4];
        createTooManyInvocationsMessageMethodArguments[0] = 0;
        createTooManyInvocationsMessageMethodArguments[1] = 0;
        createTooManyInvocationsMessageMethodArguments[2] = stubbedInvocationMatcher;
        createTooManyInvocationsMessageMethodArguments[3] = ((Object) null);
        try {
            createTooManyInvocationsMessageMethod.invoke(reporter, createTooManyInvocationsMessageMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.mockito.exceptions.Reporter.incorrectUseOfApi
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method incorrectUseOfApi()
    
    /**
    @utbot.classUnderTest {@link Reporter}
 * @utbot.methodUnderTest {@link org.mockito.exceptions.Reporter#incorrectUseOfApi()}
 * @utbot.invokes {@link org.mockito.internal.util.StringJoiner#join(java.lang.Object[])}
 * @utbot.throwsException {@link org.mockito.exceptions.base.MockitoException} in: throw new MockitoException(join("Incorrect use of API detected here:", new LocationImpl(), "", "You probably stored a reference to OngoingStubbing returned by when() and called stubbing methods like thenReturn() on this reference more than once.", "Examples of correct usage:", "    when(mock.isOk()).thenReturn(true).thenReturn(false).thenThrow(exception);", "    when(mock.isOk()).thenReturn(true, false).thenThrow(exception);", ""));
 *  */
    @Test(expected = MockitoException.class)
    public void testIncorrectUseOfApi_ThrowMockitoException() {
        Reporter reporter = new Reporter();
        
        reporter.incorrectUseOfApi();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.mockito.exceptions.Reporter.unfinishedStubbing
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method unfinishedStubbing(org.mockito.invocation.Location)
    
    /**
    @utbot.classUnderTest {@link Reporter}
 * @utbot.methodUnderTest {@link org.mockito.exceptions.Reporter#unfinishedStubbing(org.mockito.invocation.Location)}
 * @utbot.invokes {@link org.mockito.internal.util.StringJoiner#join(java.lang.Object[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: throw new UnfinishedStubbingException(join("Unfinished stubbing detected here:", location, "", "E.g. thenReturn() may be missing.", "Examples of correct stubbing:", "    when(mock.isOk()).thenReturn(true);", "    when(mock.isOk()).thenThrow(exception);", "    doThrow(exception).when(mock).someVoidMethod();", "Hints:", " 1. missing thenReturn()", " 2. you are trying to stub a final method, you naughty developer!", " 3: you are stubbing the behaviour of another mock inside before 'thenReturn' instruction if completed", ""));
 *  */
    @Test
    public void testUnfinishedStubbing_ThrowNullPointerException() {
        Reporter reporter = new Reporter();
        
        /* This test fails because method [org.mockito.exceptions.Reporter.unfinishedStubbing] produces [java.lang.NullPointerException]
            org.mockito.internal.util.StringJoiner.join(StringJoiner.java:17)
            org.mockito.internal.util.StringJoiner.join(StringJoiner.java:12)
            org.mockito.exceptions.Reporter.unfinishedStubbing(Reporter.java:65) */
        reporter.unfinishedStubbing(null);
    }
    ///endregion
    
    ///region FUZZER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method unfinishedStubbing(org.mockito.invocation.Location)
    
    /**
     * @utbot.classUnderTest {@link org.mockito.exceptions.Reporter}
     * @utbot.methodUnderTest {@link org.mockito.exceptions.Reporter#unfinishedStubbing(org.mockito.invocation.Location)}
     */
    @Test(expected = UnfinishedStubbingException.class)
    public void testUnfinishedStubbingThrowsUSE() {
        Reporter reporter = new Reporter();
        StackTraceFilter stackTraceFilter = new StackTraceFilter();
        LocationImpl locationImpl = new LocationImpl(stackTraceFilter);
        
        reporter.unfinishedStubbing(locationImpl);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.mockito.exceptions.Reporter.nullPassedToVerify
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method nullPassedToVerify()
    
    /**
    @utbot.classUnderTest {@link Reporter}
 * @utbot.methodUnderTest {@link org.mockito.exceptions.Reporter#nullPassedToVerify()}
 * @utbot.invokes {@link org.mockito.internal.util.StringJoiner#join(java.lang.Object[])}
 * @utbot.throwsException {@link org.mockito.exceptions.misusing.NullInsteadOfMockException} in: throw new NullInsteadOfMockException(join("Argument passed to verify() should be a mock but is null!", "Examples of correct verifications:", "    verify(mock).someMethod();", "    verify(mock, times(10)).someMethod();", "    verify(mock, atLeastOnce()).someMethod();", "    not: verify(mock.someMethod());", "Also, if you use @Mock annotation don't miss initMocks()"));
 *  */
    @Test(expected = NullInsteadOfMockException.class)
    public void testNullPassedToVerify_ThrowNullInsteadOfMockException() {
        Reporter reporter = new Reporter();
        
        reporter.nullPassedToVerify();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.mockito.exceptions.Reporter.stubPassedToVerify
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method stubPassedToVerify()
    
    /**
    @utbot.classUnderTest {@link Reporter}
 * @utbot.methodUnderTest {@link org.mockito.exceptions.Reporter#stubPassedToVerify()}
 * @utbot.invokes {@link org.mockito.internal.util.StringJoiner#join(java.lang.Object[])}
 * @utbot.throwsException {@link org.mockito.exceptions.misusing.CannotVerifyStubOnlyMock} in: throw new CannotVerifyStubOnlyMock(join("Argument passed to verify() is a stubOnly() mock, not a full blown mock!", "If you intend to verify invocations on a mock, don't use stubOnly() in its MockSettings."));
 *  */
    @Test(expected = CannotVerifyStubOnlyMock.class)
    public void testStubPassedToVerify_ThrowCannotVerifyStubOnlyMock() {
        Reporter reporter = new Reporter();
        
        reporter.stubPassedToVerify();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.mockito.exceptions.Reporter.locationsOf
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method locationsOf(java.util.Collection)
    
    /**
    @utbot.classUnderTest {@link Reporter}
 * @utbot.methodUnderTest {@link org.mockito.exceptions.Reporter#locationsOf(java.util.Collection)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(LocalizedMatcher matcher: matchers)
 *  */
    @Test
    public void testLocationsOf_ThrowNullPointerException() throws Throwable  {
        Reporter reporter = new Reporter();
        
        /* This test fails because method [org.mockito.exceptions.Reporter.locationsOf] produces [java.lang.NullPointerException]
            org.mockito.exceptions.Reporter.locationsOf(Reporter.java:290) */
        Class reporterClazz = Class.forName("org.mockito.exceptions.Reporter");
        Class collectionType = Class.forName("java.util.Collection");
        Method locationsOfMethod = reporterClazz.getDeclaredMethod("locationsOf", collectionType);
        locationsOfMethod.setAccessible(true);
        java.lang.Object[] locationsOfMethodArguments = new java.lang.Object[1];
        locationsOfMethodArguments[0] = ((Object) null);
        try {
            locationsOfMethod.invoke(reporter, locationsOfMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link Reporter}
 * @utbot.methodUnderTest {@link org.mockito.exceptions.Reporter#locationsOf(java.util.Collection)}
 * @utbot.invokes {@link java.util.Collection#iterator()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: description.add(matcher.getLocation().toString());
 *  */
    @Test
    public void testLocationsOf_ThrowNullPointerException_1() throws Throwable  {
        Reporter reporter = new Reporter();
        HashSet hashSet = new HashSet();
        LocalizedMatcher localizedMatcher = ((LocalizedMatcher) createInstance("org.mockito.internal.matchers.LocalizedMatcher"));
        hashSet.add(localizedMatcher);
        
        /* This test fails because method [org.mockito.exceptions.Reporter.locationsOf] produces [java.lang.NullPointerException]
            org.mockito.exceptions.Reporter.locationsOf(Reporter.java:291) */
        Class reporterClazz = Class.forName("org.mockito.exceptions.Reporter");
        Class hashSetType = Class.forName("java.util.Collection");
        Method locationsOfMethod = reporterClazz.getDeclaredMethod("locationsOf", hashSetType);
        locationsOfMethod.setAccessible(true);
        java.lang.Object[] locationsOfMethodArguments = new java.lang.Object[1];
        locationsOfMethodArguments[0] = hashSet;
        try {
            locationsOfMethod.invoke(reporter, locationsOfMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method locationsOf(java.util.Collection)
    
    @Test
    public void testLocationsOf1() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        Reporter reporter = new Reporter();
        HashSet hashSet = new HashSet();
        
        Class reporterClazz = Class.forName("org.mockito.exceptions.Reporter");
        Class hashSetType = Class.forName("java.util.Collection");
        Method locationsOfMethod = reporterClazz.getDeclaredMethod("locationsOf", hashSetType);
        locationsOfMethod.setAccessible(true);
        java.lang.Object[] locationsOfMethodArguments = new java.lang.Object[1];
        locationsOfMethodArguments[0] = hashSet;
        String actual = ((String) locationsOfMethod.invoke(reporter, locationsOfMethodArguments));
        
        String expected = "";
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method locationsOf(java.util.Collection)
    
    @Test
    public void testLocationsOf2() throws Throwable  {
        Reporter reporter = new Reporter();
        HashSet hashSet = new HashSet();
        hashSet.add(null);
        
        /* This test fails because method [org.mockito.exceptions.Reporter.locationsOf] produces [java.lang.NullPointerException]
            org.mockito.exceptions.Reporter.locationsOf(Reporter.java:291) */
        Class reporterClazz = Class.forName("org.mockito.exceptions.Reporter");
        Class hashSetType = Class.forName("java.util.Collection");
        Method locationsOfMethod = reporterClazz.getDeclaredMethod("locationsOf", hashSetType);
        locationsOfMethod.setAccessible(true);
        java.lang.Object[] locationsOfMethodArguments = new java.lang.Object[1];
        locationsOfMethodArguments[0] = hashSet;
        try {
            locationsOfMethod.invoke(reporter, locationsOfMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testLocationsOf3() throws Throwable  {
        Reporter reporter = new Reporter();
        ArrayList arrayList = new ArrayList();
        LocalizedMatcher localizedMatcher = ((LocalizedMatcher) createInstance("org.mockito.internal.matchers.LocalizedMatcher"));
        LocationImpl location = ((LocationImpl) createInstance("org.mockito.internal.debugging.LocationImpl"));
        UnresolvedAddressException stackTraceHolder = ((UnresolvedAddressException) createInstance("java.nio.channels.UnresolvedAddressException"));
        setField(location, "org.mockito.internal.debugging.LocationImpl", "stackTraceHolder", stackTraceHolder);
        StackTraceFilter stackTraceFilter = ((StackTraceFilter) createInstance("org.mockito.internal.exceptions.stacktrace.StackTraceFilter"));
        setField(location, "org.mockito.internal.debugging.LocationImpl", "stackTraceFilter", stackTraceFilter);
        setField(localizedMatcher, "org.mockito.internal.matchers.LocalizedMatcher", "location", location);
        arrayList.add(localizedMatcher);
        arrayList.add(null);
        arrayList.add(null);
        
        /* This test fails because method [org.mockito.exceptions.Reporter.locationsOf] produces [java.lang.NullPointerException]
            org.mockito.exceptions.Reporter.locationsOf(Reporter.java:291) */
        Class reporterClazz = Class.forName("org.mockito.exceptions.Reporter");
        Class arrayListType = Class.forName("java.util.Collection");
        Method locationsOfMethod = reporterClazz.getDeclaredMethod("locationsOf", arrayListType);
        locationsOfMethod.setAccessible(true);
        java.lang.Object[] locationsOfMethodArguments = new java.lang.Object[1];
        locationsOfMethodArguments[0] = arrayList;
        try {
            locationsOfMethod.invoke(reporter, locationsOfMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testLocationsOf4() throws Throwable  {
        Reporter reporter = new Reporter();
        ArrayList arrayList = new ArrayList();
        LocalizedMatcher localizedMatcher = ((LocalizedMatcher) createInstance("org.mockito.internal.matchers.LocalizedMatcher"));
        LocationImpl location = ((LocationImpl) createInstance("org.mockito.internal.debugging.LocationImpl"));
        MockitoSerializationIssue stackTraceHolder = ((MockitoSerializationIssue) createInstance("org.mockito.exceptions.base.MockitoSerializationIssue"));
        setField(location, "org.mockito.internal.debugging.LocationImpl", "stackTraceHolder", stackTraceHolder);
        setField(localizedMatcher, "org.mockito.internal.matchers.LocalizedMatcher", "location", location);
        arrayList.add(localizedMatcher);
        arrayList.add(null);
        arrayList.add(null);
        
        /* This test fails because method [org.mockito.exceptions.Reporter.locationsOf] produces [java.lang.NullPointerException]
            org.mockito.internal.debugging.LocationImpl.toString(LocationImpl.java:29)
            org.mockito.exceptions.Reporter.locationsOf(Reporter.java:291) */
        Class reporterClazz = Class.forName("org.mockito.exceptions.Reporter");
        Class arrayListType = Class.forName("java.util.Collection");
        Method locationsOfMethod = reporterClazz.getDeclaredMethod("locationsOf", arrayListType);
        locationsOfMethod.setAccessible(true);
        java.lang.Object[] locationsOfMethodArguments = new java.lang.Object[1];
        locationsOfMethodArguments[0] = arrayList;
        try {
            locationsOfMethod.invoke(reporter, locationsOfMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.mockito.exceptions.Reporter.wantedAtMostX
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method wantedAtMostX(int, int)
    
    /**
    @utbot.classUnderTest {@link Reporter}
 * @utbot.methodUnderTest {@link org.mockito.exceptions.Reporter#wantedAtMostX(int,int)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link org.mockito.internal.reporting.Pluralizer#pluralize(int)}
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
    
    ///endregion
    
    ///region Test suites for executable org.mockito.exceptions.Reporter.safelyGetMockName
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method safelyGetMockName(java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link Reporter}
 * @utbot.methodUnderTest {@link org.mockito.exceptions.Reporter#safelyGetMockName(java.lang.Object)}
 * @utbot.invokes {@link org.mockito.internal.util.MockUtil#getMockName(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.IllegalAccessError} in: return new MockUtil().getMockName(mock);
 *  */
    @Test(expected = IllegalAccessError.class)
    public void testSafelyGetMockName_ThrowIllegalAccessError() throws Throwable  {
        Reporter reporter = new Reporter();
        
        Class reporterClazz = Class.forName("org.mockito.exceptions.Reporter");
        Class objectType = Class.forName("java.lang.Object");
        Method safelyGetMockNameMethod = reporterClazz.getDeclaredMethod("safelyGetMockName", objectType);
        safelyGetMockNameMethod.setAccessible(true);
        java.lang.Object[] safelyGetMockNameMethodArguments = new java.lang.Object[1];
        safelyGetMockNameMethodArguments[0] = ((Object) null);
        try {
            safelyGetMockNameMethod.invoke(reporter, safelyGetMockNameMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region Errors report for safelyGetMockName
    
    public void testSafelyGetMockName_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.mockito.exceptions.Reporter.notAMockPassedToVerifyNoMoreInteractions
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method notAMockPassedToVerifyNoMoreInteractions()
    
    /**
    @utbot.classUnderTest {@link Reporter}
 * @utbot.methodUnderTest {@link org.mockito.exceptions.Reporter#notAMockPassedToVerifyNoMoreInteractions()}
 * @utbot.invokes {@link org.mockito.internal.util.StringJoiner#join(java.lang.Object[])}
 * @utbot.throwsException {@link org.mockito.exceptions.misusing.NotAMockException} in: throw new NotAMockException(join("Argument(s) passed is not a mock!", "Examples of correct verifications:", "    verifyNoMoreInteractions(mockOne, mockTwo);", "    verifyZeroInteractions(mockOne, mockTwo);", ""));
 *  */
    @Test(expected = NotAMockException.class)
    public void testNotAMockPassedToVerifyNoMoreInteractions_ThrowNotAMockException() {
        Reporter reporter = new Reporter();
        
        reporter.notAMockPassedToVerifyNoMoreInteractions();
    }
    ///endregion
    
    ///endregion
    
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
 * @utbot.throwsException {@link java.lang.NullPointerException} in: throw new MockitoException(join("Cannot instantiate @InjectMocks field named '" + fieldName + "'.", "You haven't provided the instance at field declaration so I tried to construct the instance.", "However, I failed because: " + details.getMessage(), "Examples of correct usage of @InjectMocks:", "   @InjectMocks Service service = new Service();", "   @InjectMocks Service service;", "   //also, don't forget about MockitoAnnotations.initMocks();", "   //and... don't forget about some @Mocks for injection :)", ""), details);
 *  */
    @Test
    public void testCannotInitializeForInjectMocksAnnotation_ThrowNullPointerException() {
        Reporter reporter = new Reporter();
        
        /* This test fails because method [org.mockito.exceptions.Reporter.cannotInitializeForInjectMocksAnnotation] produces [java.lang.NullPointerException]
            org.mockito.exceptions.Reporter.cannotInitializeForInjectMocksAnnotation(Reporter.java:623) */
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
        StackTraceElement stackTraceElement = new StackTraceElement("   @InjectMocks Service service;", "   @InjectMocks Service service;", "You haven't provided the instance at field declaration so I tried to construct the instance.", "-3", "   @InjectMocks Service service = new Service();", "", Integer.MAX_VALUE);
        stackTraceElementArray[0] = stackTraceElement;
        StackTraceElement stackTraceElement1 = new StackTraceElement("\n\t\r", "'.", "\n\t\r", -1);
        stackTraceElementArray[1] = stackTraceElement1;
        exception.setStackTrace(stackTraceElementArray);
        
        reporter.cannotInitializeForInjectMocksAnnotation("\u00A8", exception);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.mockito.exceptions.Reporter.mocksHaveToBePassedToVerifyNoMoreInteractions
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method mocksHaveToBePassedToVerifyNoMoreInteractions()
    
    /**
    @utbot.classUnderTest {@link Reporter}
 * @utbot.methodUnderTest {@link org.mockito.exceptions.Reporter#mocksHaveToBePassedToVerifyNoMoreInteractions()}
 * @utbot.invokes {@link org.mockito.internal.util.StringJoiner#join(java.lang.Object[])}
 * @utbot.throwsException {@link org.mockito.exceptions.base.MockitoException} in: throw new MockitoException(join("Method requires argument(s)!", "Pass mocks that should be verified, e.g:", "    verifyNoMoreInteractions(mockOne, mockTwo);", "    verifyZeroInteractions(mockOne, mockTwo);", ""));
 *  */
    @Test(expected = MockitoException.class)
    public void testMocksHaveToBePassedToVerifyNoMoreInteractions_ThrowMockitoException() {
        Reporter reporter = new Reporter();
        
        reporter.mocksHaveToBePassedToVerifyNoMoreInteractions();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.mockito.exceptions.Reporter.atMostAndNeverShouldNotBeUsedWithTimeout
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method atMostAndNeverShouldNotBeUsedWithTimeout()
    
    /**
    @utbot.classUnderTest {@link Reporter}
 * @utbot.methodUnderTest {@link org.mockito.exceptions.Reporter#atMostAndNeverShouldNotBeUsedWithTimeout()}
 * @utbot.invokes {@link org.mockito.internal.util.StringJoiner#join(java.lang.Object[])}
 * @utbot.throwsException {@link org.mockito.exceptions.misusing.FriendlyReminderException} in: throw new FriendlyReminderException(join("", "Don't panic! I'm just a friendly reminder!", "timeout() should not be used with atMost() or never() because...", "...it does not make much sense - the test would have passed immediately in concurency", "We kept this method only to avoid compilation errors when upgrading Mockito.", "In future release we will remove timeout(x).atMost(y) from the API.", "If you want to find out more please refer to issue 235", ""));
 *  */
    @Test(expected = FriendlyReminderException.class)
    public void testAtMostAndNeverShouldNotBeUsedWithTimeout_ThrowFriendlyReminderException() {
        Reporter reporter = new Reporter();
        
        reporter.atMostAndNeverShouldNotBeUsedWithTimeout();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.mockito.exceptions.Reporter.invalidArgumentRangeAtIdentityAnswerCreationTime
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method invalidArgumentRangeAtIdentityAnswerCreationTime()
    
    /**
    @utbot.classUnderTest {@link Reporter}
 * @utbot.methodUnderTest {@link org.mockito.exceptions.Reporter#invalidArgumentRangeAtIdentityAnswerCreationTime()}
 * @utbot.invokes {@link org.mockito.internal.util.StringJoiner#join(java.lang.Object[])}
 * @utbot.throwsException {@link org.mockito.exceptions.base.MockitoException} in: throw new MockitoException(join("Invalid argument index.", "The index need to be a positive number that indicates the position of the argument to return.", "However it is possible to use the -1 value to indicates that the last argument should be", "returned."));
 *  */
    @Test(expected = MockitoException.class)
    public void testInvalidArgumentRangeAtIdentityAnswerCreationTime_ThrowMockitoException() {
        Reporter reporter = new Reporter();
        
        reporter.invalidArgumentRangeAtIdentityAnswerCreationTime();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.mockito.exceptions.Reporter.delegatedMethodDoesNotExistOnDelegate
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method delegatedMethodDoesNotExistOnDelegate(java.lang.reflect.Method, java.lang.Object, java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link Reporter}
 * @utbot.methodUnderTest {@link org.mockito.exceptions.Reporter#delegatedMethodDoesNotExistOnDelegate(java.lang.reflect.Method,java.lang.Object,java.lang.Object)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.Object)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes org.mockito.exceptions.Reporter#safelyGetMockName(java.lang.Object)
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.Object)}
 * @utbot.invokes {@link java.lang.StringBuilder#toString()}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.Class#getSimpleName()}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#toString()}
 * @utbot.invokes {@link org.mockito.internal.util.StringJoiner#join(java.lang.Object[])}
 * @utbot.throwsException {@link java.lang.IllegalAccessError} in: throw new MockitoException(join("Methods called on mock must exist in delegated instance.", "When calling: " + mockMethod + " on mock: " + safelyGetMockName(mock), "no such method was found.", "Check that the instance passed to delegatesTo() is of the correct type or contains compatible methods", "(delegate instance had type: " + delegate.getClass().getSimpleName() + ")"));
 *  */
    @Test(expected = IllegalAccessError.class)
    public void testDelegatedMethodDoesNotExistOnDelegate_ThrowIllegalAccessError() {
        Reporter reporter = new Reporter();
        
        reporter.delegatedMethodDoesNotExistOnDelegate(null, null, null);
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
    
    ///region Test suites for executable org.mockito.exceptions.Reporter.mockedTypeIsInconsistentWithDelegatedInstanceType
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method mockedTypeIsInconsistentWithDelegatedInstanceType(java.lang.Class, java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link Reporter}
 * @utbot.methodUnderTest {@link org.mockito.exceptions.Reporter#mockedTypeIsInconsistentWithDelegatedInstanceType(java.lang.Class,java.lang.Object)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.Class#getSimpleName()}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.Class#getSimpleName()}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#toString()}
 * @utbot.invokes {@link org.mockito.internal.util.StringJoiner#join(java.lang.Object[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: throw new MockitoException(join("Mocked type must be the same as the type of your delegated instance.", "Mocked type must be: " + delegatedInstance.getClass().getSimpleName() + ", but is: " + mockedType.getSimpleName(), "  //correct delegate:", "  spy = mock( ->List.class<- , withSettings().delegatedInstance( ->new ArrayList()<- );", "  //incorrect - types don't match:", "  spy = mock( ->List.class<- , withSettings().delegatedInstance( ->new HashSet()<- );"));
 *  */
    @Test
    public void testMockedTypeIsInconsistentWithDelegatedInstanceType_ThrowNullPointerException() {
        Reporter reporter = new Reporter();
        
        /* This test fails because method [org.mockito.exceptions.Reporter.mockedTypeIsInconsistentWithDelegatedInstanceType] produces [java.lang.NullPointerException]
            org.mockito.exceptions.Reporter.mockedTypeIsInconsistentWithDelegatedInstanceType(Reporter.java:683) */
        reporter.mockedTypeIsInconsistentWithDelegatedInstanceType(null, null);
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
            org.mockito.exceptions.Reporter.mockedTypeIsInconsistentWithSpiedInstanceType(Reporter.java:571) */
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
            org.mockito.exceptions.Reporter.extraInterfacesCannotContainMockedType(Reporter.java:557) */
        reporter.extraInterfacesCannotContainMockedType(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.mockito.exceptions.Reporter.invocationListenerDoesNotAcceptNullParameters
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method invocationListenerDoesNotAcceptNullParameters()
    
    /**
    @utbot.classUnderTest {@link Reporter}
 * @utbot.methodUnderTest {@link org.mockito.exceptions.Reporter#invocationListenerDoesNotAcceptNullParameters()}
 * @utbot.throwsException {@link org.mockito.exceptions.base.MockitoException} in: throw new MockitoException("invocationListeners() does not accept null parameters");
 *  */
    @Test(expected = MockitoException.class)
    public void testInvocationListenerDoesNotAcceptNullParameters_ThrowMockitoException() {
        Reporter reporter = new Reporter();
        
        reporter.invocationListenerDoesNotAcceptNullParameters();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.mockito.exceptions.Reporter.invocationListenersRequiresAtLeastOneListener
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method invocationListenersRequiresAtLeastOneListener()
    
    /**
    @utbot.classUnderTest {@link Reporter}
 * @utbot.methodUnderTest {@link org.mockito.exceptions.Reporter#invocationListenersRequiresAtLeastOneListener()}
 * @utbot.throwsException {@link org.mockito.exceptions.base.MockitoException} in: throw new MockitoException("invocationListeners() requires at least one listener");
 *  */
    @Test(expected = MockitoException.class)
    public void testInvocationListenersRequiresAtLeastOneListener_ThrowMockitoException() {
        Reporter reporter = new Reporter();
        
        reporter.invocationListenersRequiresAtLeastOneListener();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.mockito.exceptions.Reporter.invalidArgumentPositionRangeAtInvocationTime
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method invalidArgumentPositionRangeAtInvocationTime(org.mockito.invocation.InvocationOnMock, boolean, int)
    
    /**
    @utbot.classUnderTest {@link Reporter}
 * @utbot.methodUnderTest {@link org.mockito.exceptions.Reporter#invalidArgumentPositionRangeAtInvocationTime(org.mockito.invocation.InvocationOnMock,boolean,int)}
 * @utbot.executesCondition {@code (willReturnLastParameter): True}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link org.mockito.invocation.InvocationOnMock#getMock()}
 * @utbot.invokes org.mockito.exceptions.Reporter#safelyGetMockName(java.lang.Object)
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.Object)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link org.mockito.invocation.InvocationOnMock#getMethod()}
 * @utbot.invokes {@link java.lang.reflect.Method#getName()}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#toString()}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes org.mockito.exceptions.Reporter#possibleArgumentTypesOf(org.mockito.invocation.InvocationOnMock)
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.Object)}
 * @utbot.invokes {@link java.lang.StringBuilder#toString()}
 * @utbot.invokes {@link org.mockito.internal.util.StringJoiner#join(java.lang.Object[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: join("Invalid argument index for the current invocation of method : ", " -> " + safelyGetMockName(invocation.getMock()) + "." + invocation.getMethod().getName() + "()", "", (willReturnLastParameter ? "Last parameter wanted" : "Wanted parameter at position " + argumentIndex) + " but " + possibleArgumentTypesOf(invocation), "The index need to be a positive number that indicates a valid position of the argument in the invocation.", "However it is possible to use the -1 value to indicates that the last argument should be returned.", "")
 *  */
    @Test
    public void testInvalidArgumentPositionRangeAtInvocationTime_ThrowNullPointerException() {
        Reporter reporter = new Reporter();
        
        /* This test fails because method [org.mockito.exceptions.Reporter.invalidArgumentPositionRangeAtInvocationTime] produces [java.lang.NullPointerException]
            org.mockito.exceptions.Reporter.invalidArgumentPositionRangeAtInvocationTime(Reporter.java:707) */
        reporter.invalidArgumentPositionRangeAtInvocationTime(null, false, -255);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.mockito.exceptions.Reporter.defaultAnswerDoesNotAcceptNullParameter
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method defaultAnswerDoesNotAcceptNullParameter()
    
    /**
    @utbot.classUnderTest {@link Reporter}
 * @utbot.methodUnderTest {@link org.mockito.exceptions.Reporter#defaultAnswerDoesNotAcceptNullParameter()}
 * @utbot.throwsException {@link org.mockito.exceptions.base.MockitoException} in: throw new MockitoException("defaultAnswer() does not accept null parameter");
 *  */
    @Test(expected = MockitoException.class)
    public void testDefaultAnswerDoesNotAcceptNullParameter_ThrowMockitoException() {
        Reporter reporter = new Reporter();
        
        reporter.defaultAnswerDoesNotAcceptNullParameter();
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
            org.mockito.exceptions.Reporter.extraInterfacesAcceptsOnlyInterfaces(Reporter.java:550) */
        reporter.extraInterfacesAcceptsOnlyInterfaces(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.mockito.exceptions.Reporter.usingConstructorWithFancySerializable
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method usingConstructorWithFancySerializable(org.mockito.mock.SerializableMode)
    
    /**
    @utbot.classUnderTest {@link Reporter}
 * @utbot.methodUnderTest {@link org.mockito.exceptions.Reporter#usingConstructorWithFancySerializable(org.mockito.mock.SerializableMode)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.Object)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#toString()}
 * @utbot.throwsException {@link org.mockito.exceptions.base.MockitoException} in: throw new MockitoException("Mocks instantiated with constructor cannot be combined with " + mode + " serialization mode.");
 *  */
    @Test(expected = MockitoException.class)
    public void testUsingConstructorWithFancySerializable_ThrowMockitoException() {
        Reporter reporter = new Reporter();
        
        reporter.usingConstructorWithFancySerializable(null);
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
 * @utbot.throwsException {@link org.mockito.exceptions.misusing.CannotStubVoidMethodWithReturnValue} in: throw new CannotStubVoidMethodWithReturnValue(join("'" + methodName + "' is a *void method* and it *cannot* be stubbed with a *return value*!", "Voids are usually stubbed with Throwables:", "    doThrow(exception).when(mock).someVoidMethod();", "***", "If you're unsure why you're getting above error read on.", "Due to the nature of the syntax above problem might occur because:", "1. The method you are trying to stub is *overloaded*. Make sure you are calling the right overloaded version.", "2. Somewhere in your test you are stubbing *final methods*. Sorry, Mockito does not verify/stub final methods.", "3. A spy is stubbed using when(spy.foo()).then() syntax. It is safer to stub spies - ", "   - with doReturn|Throw() family of methods. More in javadocs for Mockito.spy() method.", "4. " + MockitoLimitations.NON_PUBLIC_PARENT, ""));
 *  */
    @Test(expected = CannotStubVoidMethodWithReturnValue.class)
    public void testCannotStubVoidMethodWithAReturnValue_ThrowCannotStubVoidMethodWithReturnValue() {
        Reporter reporter = new Reporter();
        
        reporter.cannotStubVoidMethodWithAReturnValue(null);
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
        
                java.lang.reflect.Method methodForGetDeclaredFields1107904614084800 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields1107904614084800.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass1107904614091400 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1107904614084800.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1107904614091400).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
                
            java.lang.reflect.Method methodForGetDeclaredFields1107904614470399 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields1107904614470399.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass1107904614472399 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1107904614470399.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1107904614472399).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields1107904615161800 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields1107904615161800.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass1107904615163400 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1107904615161800.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1107904615163400).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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

