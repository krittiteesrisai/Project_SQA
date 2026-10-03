package org.mockito.exceptions;

import org.junit.Before;
import org.junit.Test;
import org.mockito.exceptions.base.MockitoAssertionError;
import org.mockito.exceptions.base.MockitoException;
import org.mockito.exceptions.misusing.*;
import org.mockito.exceptions.verification.*;
import org.mockito.internal.matchers.LocalizedMatcher;
import org.mockito.internal.reporting.Discrepancy;
import org.mockito.invocation.DescribedInvocation;
import org.mockito.invocation.Invocation;
import org.mockito.invocation.InvocationOnMock;
import org.mockito.invocation.Location;
import org.mockito.listeners.InvocationListener;
import org.mockito.listeners.MethodInvocationReport;
import org.mockito.mock.SerializableMode;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.*;

public class ReporterTest {

    private Reporter reporter;

    @Before
    public void setUp() {
        reporter = new Reporter();
    }

    // --- Dummy Implementations for interfaces ---

    private static class DummyLocation implements Location {
        private final String loc;

        public DummyLocation(String loc) {
            this.loc = loc;
        }

        @Override
        public String toString() {
            return loc;
        }
    }

    private static class DummyDescribedInvocation implements DescribedInvocation {
        private final String description;
        private final Location location;

        public DummyDescribedInvocation(String description, Location location) {
            this.description = description;
            this.location = location;
        }

        @Override
        public String toString() {
            return description;
        }

        @Override
        public Location getLocation() {
            return location;
        }
    }

    private static class SampleTarget {
        public String someField;

        public void noArgMethod() {}
        public void standardMethod(String arg1, int arg2) {}
        public void varargMethod(String arg1, Object... varargs) {}
    }

    private static class DummyInvocationOnMock implements InvocationOnMock {
        private final Object mock;
        private final Method method;
        private final Object[] arguments;

        public DummyInvocationOnMock(Object mock, Method method, Object[] arguments) {
            this.mock = mock;
            this.method = method;
            this.arguments = arguments;
        }

        @Override
        public Object getMock() {
            return mock;
        }

        @Override
        public Method getMethod() {
            return method;
        }

        @Override
        public Object[] getArguments() {
            return arguments;
        }

        @Override
        public <T> T getArgumentAt(int index, Class<T> clazz) {
            return clazz.cast(arguments[index]);
        }

        @Override
        public Object callRealMethod() throws Throwable {
            return null;
        }
    }

    // --- Tests for simple Misuse & Verification exceptions ---

    @Test(expected = MockitoException.class)
    public void testCheckedExceptionInvalid() {
        reporter.checkedExceptionInvalid(new Exception("test checked"));
    }

    @Test(expected = MockitoException.class)
    public void testCannotStubWithNullThrowable() {
        reporter.cannotStubWithNullThrowable();
    }

    @Test(expected = UnfinishedStubbingException.class)
    public void testUnfinishedStubbing() {
        reporter.unfinishedStubbing(new DummyLocation("-> at test.location"));
    }

    @Test(expected = MockitoException.class)
    public void testIncorrectUseOfApi() {
        reporter.incorrectUseOfApi();
    }

    @Test(expected = MissingMethodInvocationException.class)
    public void testMissingMethodInvocation() {
        reporter.missingMethodInvocation();
    }

    @Test(expected = UnfinishedVerificationException.class)
    public void testUnfinishedVerificationException() {
        reporter.unfinishedVerificationException(new DummyLocation("-> at test.verify"));
    }

    @Test(expected = NotAMockException.class)
    public void testNotAMockPassedToVerify() {
        reporter.notAMockPassedToVerify(String.class);
    }

    @Test(expected = NullInsteadOfMockException.class)
    public void testNullPassedToVerify() {
        reporter.nullPassedToVerify();
    }

    @Test(expected = NotAMockException.class)
    public void testNotAMockPassedToWhenMethod() {
        reporter.notAMockPassedToWhenMethod();
    }

    @Test(expected = NullInsteadOfMockException.class)
    public void testNullPassedToWhenMethod() {
        reporter.nullPassedToWhenMethod();
    }

    @Test(expected = MockitoException.class)
    public void testMocksHaveToBePassedToVerifyNoMoreInteractions() {
        reporter.mocksHaveToBePassedToVerifyNoMoreInteractions();
    }

    @Test(expected = NotAMockException.class)
    public void testNotAMockPassedToVerifyNoMoreInteractions() {
        reporter.notAMockPassedToVerifyNoMoreInteractions();
    }

    @Test(expected = NullInsteadOfMockException.class)
    public void testNullPassedToVerifyNoMoreInteractions() {
        reporter.nullPassedToVerifyNoMoreInteractions();
    }

    @Test(expected = NotAMockException.class)
    public void testNotAMockPassedWhenCreatingInOrder() {
        reporter.notAMockPassedWhenCreatingInOrder();
    }

    @Test(expected = NullInsteadOfMockException.class)
    public void testNullPassedWhenCreatingInOrder() {
        reporter.nullPassedWhenCreatingInOrder();
    }

    @Test(expected = MockitoException.class)
    public void testMocksHaveToBePassedWhenCreatingInOrder() {
        reporter.mocksHaveToBePassedWhenCreatingInOrder();
    }

    @Test(expected = MockitoException.class)
    public void testInOrderRequiresFamiliarMock() {
        reporter.inOrderRequiresFamiliarMock();
    }

    @Test(expected = CannotVerifyStubOnlyMock.class)
    public void testStubPassedToVerify() {
        reporter.stubPassedToVerify();
    }

    @Test(expected = InvalidUseOfMatchersException.class)
    public void testReportNoSubMatchersFound() {
        reporter.reportNoSubMatchersFound("and");
    }

    @Test(expected = CannotStubVoidMethodWithReturnValue.class)
    public void testCannotStubVoidMethodWithAReturnValue() {
        reporter.cannotStubVoidMethodWithAReturnValue("voidMethod");
    }

    @Test(expected = MockitoException.class)
    public void testOnlyVoidMethodsCanBeSetToDoNothing() {
        reporter.onlyVoidMethodsCanBeSetToDoNothing();
    }

    @Test(expected = WrongTypeOfReturnValue.class)
    public void testWrongTypeOfReturnValue() {
        reporter.wrongTypeOfReturnValue("String", "Integer", "getName");
    }

    @Test(expected = MockitoAssertionError.class)
    public void testWantedAtMostX() {
        reporter.wantedAtMostX(2, 5);
    }

    @Test(expected = SmartNullPointerException.class)
    public void testSmartNullPointerException() {
        reporter.smartNullPointerException("mock.call()", new DummyLocation("-> at line 1"));
    }

    @Test(expected = MockitoException.class)
    public void testNoArgumentValueWasCaptured() {
        reporter.noArgumentValueWasCaptured();
    }

    @Test(expected = MockitoException.class)
    public void testExtraInterfacesExceptions() {
        try {
            reporter.extraInterfacesDoesNotAcceptNullParameters();
            fail();
        } catch (MockitoException ignored) {}

        try {
            reporter.extraInterfacesAcceptsOnlyInterfaces(String.class);
            fail();
        } catch (MockitoException ignored) {}

        try {
            reporter.extraInterfacesCannotContainMockedType(Comparable.class);
            fail();
        } catch (MockitoException ignored) {}

        reporter.extraInterfacesRequiresAtLeastOneInterface();
    }

    @Test(expected = MockitoException.class)
    public void testMockedTypeIsInconsistentWithSpiedInstanceType() {
        reporter.mockedTypeIsInconsistentWithSpiedInstanceType(List.class, new ArrayList<>());
    }

    @Test(expected = MockitoException.class)
    public void testCannotCallAbstractRealMethod() {
        reporter.cannotCallAbstractRealMethod();
    }

    @Test(expected = MockitoException.class)
    public void testCannotVerifyToString() {
        reporter.cannotVerifyToString();
    }

    @Test(expected = MockitoException.class)
    public void testMoreThanOneAnnotationNotAllowed() {
        reporter.moreThanOneAnnotationNotAllowed("myField");
    }

    @Test(expected = MockitoException.class)
    public void testUnsupportedCombinationOfAnnotations() {
        reporter.unsupportedCombinationOfAnnotations("Mock", "Spy");
    }

    @Test(expected = MockitoException.class)
    public void testCannotInitializeForSpyAnnotation() {
        reporter.cannotInitializeForSpyAnnotation("spyField", new RuntimeException("no constructor"));
    }

    @Test(expected = MockitoException.class)
    public void testCannotInitializeForInjectMocksAnnotation() {
        reporter.cannotInitializeForInjectMocksAnnotation("serviceField", new RuntimeException("failed"));
    }

    @Test(expected = FriendlyReminderException.class)
    public void testAtMostAndNeverShouldNotBeUsedWithTimeout() {
        reporter.atMostAndNeverShouldNotBeUsedWithTimeout();
    }

    @Test(expected = MockitoException.class)
    public void testFieldInitialisationThrewException() throws Exception {
        Field field = SampleTarget.class.getField("someField");
        reporter.fieldInitialisationThrewException(field, new RuntimeException("Init err"));
    }

    @Test(expected = MockitoException.class)
    public void testInvocationListenerExceptions() {
        try {
            reporter.invocationListenerDoesNotAcceptNullParameters();
            fail();
        } catch (MockitoException ignored) {}

        try {
            reporter.invocationListenersRequiresAtLeastOneListener();
            fail();
        } catch (MockitoException ignored) {}

        InvocationListener listener = new InvocationListener() {
            @Override
            public void reportInvocation(MethodInvocationReport methodInvocationReport) {}
        };
        reporter.invocationListenerThrewException(listener, new RuntimeException("Listener boom"));
    }

    @Test(expected = MockitoException.class)
    public void testMockedTypeIsInconsistentWithDelegatedInstanceType() {
        reporter.mockedTypeIsInconsistentWithDelegatedInstanceType(List.class, new ArrayList<>());
    }

    @Test(expected = MockitoException.class)
    public void testSpyAndDelegateAreMutuallyExclusive() {
        reporter.spyAndDelegateAreMutuallyExclusive();
    }

    @Test(expected = MockitoException.class)
    public void testInvalidArgumentRangeAtIdentityAnswerCreationTime() {
        reporter.invalidArgumentRangeAtIdentityAnswerCreationTime();
    }

    @Test(expected = MockitoException.class)
    public void testDefaultAnswerDoesNotAcceptNullParameter() {
        reporter.defaultAnswerDoesNotAcceptNullParameter();
    }

    @Test(expected = MockitoException.class)
    public void testSerializableWontWorkForObjectsThatDontImplementSerializable() {
        reporter.serializableWontWorkForObjectsThatDontImplementSerializable(SampleTarget.class);
    }

    @Test(expected = MockitoException.class)
    public void testDelegatedMethodHasWrongReturnType() throws Exception {
        Method m1 = SampleTarget.class.getMethod("noArgMethod");
        Method m2 = SampleTarget.class.getMethod("standardMethod", String.class, int.class);
        reporter.delegatedMethodHasWrongReturnType(m1, m2, new SampleTarget(), new SampleTarget());
    }

    @Test(expected = MockitoException.class)
    public void testDelegatedMethodDoesNotExistOnDelegate() throws Exception {
        Method m1 = SampleTarget.class.getMethod("noArgMethod");
        reporter.delegatedMethodDoesNotExistOnDelegate(m1, new SampleTarget(), new SampleTarget());
    }

    @Test(expected = MockitoException.class)
    public void testUsingConstructorWithFancySerializable() {
        reporter.usingConstructorWithFancySerializable(SerializableMode.BASIC);
    }

    @Test(expected = MockitoException.class)
    public void testCannotMockFinalClass() {
        reporter.cannotMockFinalClass(String.class);
    }

    // --- Branch Coverage: wantedButNotInvoked ---

    @Test
    public void testWantedButNotInvokedSingleArg() {
        DescribedInvocation wanted = new DummyDescribedInvocation("mock.doSomething()", new DummyLocation("-> line 10"));
        try {
            reporter.wantedButNotInvoked(wanted);
            fail();
        } catch (WantedButNotInvoked e) {
            assertTrue(e.getMessage().contains("Wanted but not invoked:"));
            assertTrue(e.getMessage().contains("mock.doSomething()"));
        }
    }

    @Test
    public void testWantedButNotInvokedWithEmptyInvocations() {
        DescribedInvocation wanted = new DummyDescribedInvocation("mock.doSomething()", new DummyLocation("-> line 10"));
        try {
            reporter.wantedButNotInvoked(wanted, Collections.<DescribedInvocation>emptyList());
            fail();
        } catch (WantedButNotInvoked e) {
            assertTrue(e.getMessage().contains("Actually, there were zero interactions with this mock."));
        }
    }

    @Test
    public void testWantedButNotInvokedWithNonEmptyInvocations() {
        DescribedInvocation wanted = new DummyDescribedInvocation("mock.doSomething()", new DummyLocation("-> line 10"));
        List<DescribedInvocation> actuals = new ArrayList<DescribedInvocation>();
        actuals.add(new DummyDescribedInvocation("mock.otherMethod()", new DummyLocation("-> line 20")));

        try {
            reporter.wantedButNotInvoked(wanted, actuals);
            fail();
        } catch (WantedButNotInvoked e) {
            assertTrue(e.getMessage().contains("However, there were other interactions with this mock:"));
            assertTrue(e.getMessage().contains("mock.otherMethod()"));
        }
    }

    // --- Branch Coverage: ArgumentsAreDifferent & InOrder ---

    @Test(expected = AssertionError.class)
    public void testArgumentsAreDifferent() {
        reporter.argumentsAreDifferent("wanted(1)", "actual(2)", new DummyLocation("-> line 30"));
    }

    @Test(expected = VerificationInOrderFailure.class)
    public void testWantedButNotInvokedInOrder() {
        DescribedInvocation wanted = new DummyDescribedInvocation("mock.first()", new DummyLocation("-> line 1"));
        DescribedInvocation previous = new DummyDescribedInvocation("mock.previous()", new DummyLocation("-> line 2"));
        reporter.wantedButNotInvokedInOrder(wanted, previous);
    }

    @Test(expected = TooManyActualInvocations.class)
    public void testTooManyActualInvocations() {
        DescribedInvocation wanted = new DummyDescribedInvocation("mock.call()", new DummyLocation("-> line 1"));
        reporter.tooManyActualInvocations(1, 2, wanted, new DummyLocation("-> line 2"));
    }

    @Test(expected = NeverWantedButInvoked.class)
    public void testNeverWantedButInvoked() {
        DescribedInvocation wanted = new DummyDescribedInvocation("mock.call()", new DummyLocation("-> line 1"));
        reporter.neverWantedButInvoked(wanted, new DummyLocation("-> line 2"));
    }

    @Test(expected = VerificationInOrderFailure.class)
    public void testTooManyActualInvocationsInOrder() {
        DescribedInvocation wanted = new DummyDescribedInvocation("mock.call()", new DummyLocation("-> line 1"));
        reporter.tooManyActualInvocationsInOrder(1, 3, wanted, new DummyLocation("-> line 2"));
    }

    // --- Branch Coverage: tooLittleActualInvocations (lastActualLocation null vs non-null) ---

    @Test
    public void testTooLittleActualInvocationsWithNonNullLocation() {
        Discrepancy discrepancy = new Discrepancy(2, 1);
        DescribedInvocation wanted = new DummyDescribedInvocation("mock.call()", new DummyLocation("-> line 1"));
        try {
            reporter.tooLittleActualInvocations(discrepancy, wanted, new DummyLocation("-> line 50"));
            fail();
        } catch (TooLittleActualInvocations e) {
            assertTrue(e.getMessage().contains("-> line 50"));
        }
    }

    @Test
    public void testTooLittleActualInvocationsWithNullLocation() {
        Discrepancy discrepancy = new Discrepancy(2, 0);
        DescribedInvocation wanted = new DummyDescribedInvocation("mock.call()", new DummyLocation("-> line 1"));
        try {
            reporter.tooLittleActualInvocations(discrepancy, wanted, null);
            fail();
        } catch (TooLittleActualInvocations e) {
            assertNotNull(e.getMessage());
            assertFalse(e.getMessage().contains("null"));
        }
    }

    @Test(expected = VerificationInOrderFailure.class)
    public void testTooLittleActualInvocationsInOrder() {
        Discrepancy discrepancy = new Discrepancy(3, 1);
        DescribedInvocation wanted = new DummyDescribedInvocation("mock.call()", new DummyLocation("-> line 1"));
        reporter.tooLittleActualInvocationsInOrder(discrepancy, wanted, new DummyLocation("-> line 60"));
    }

    // --- Branch Coverage: Matchers / LocalizedMatcher descriptions ---

    @Test(expected = InvalidUseOfMatchersException.class)
    public void testInvalidUseOfMatchers() {
        reporter.invalidUseOfMatchers(2, Collections.<LocalizedMatcher>emptyList());
    }

    @Test(expected = InvalidUseOfMatchersException.class)
    public void testIncorrectUseOfAdditionalMatchers() {
        reporter.incorrectUseOfAdditionalMatchers("and", 2, Collections.<LocalizedMatcher>emptyList());
    }

    @Test(expected = InvalidUseOfMatchersException.class)
    public void testMisplacedArgumentMatcher() {
        reporter.misplacedArgumentMatcher(Collections.<LocalizedMatcher>emptyList());
    }

    // --- Branch Coverage: invalidArgumentPositionRangeAtInvocationTime & possibleArgumentTypesOf ---

    @Test
    public void testInvalidArgumentPositionRange_willReturnLastParameterTrue_noArgs() throws Exception {
        Method method = SampleTarget.class.getMethod("noArgMethod");
        DummyInvocationOnMock invocation = new DummyInvocationOnMock("mockObj", method, new Object[0]);
        try {
            reporter.invalidArgumentPositionRangeAtInvocationTime(invocation, true, 0);
            fail();
        } catch (MockitoException e) {
            assertTrue(e.getMessage().contains("Last parameter wanted"));
            assertTrue(e.getMessage().contains("the method has no arguments."));
        }
    }

    @Test
    public void testInvalidArgumentPositionRange_willReturnLastParameterFalse_standardArgs() throws Exception {
        Method method = SampleTarget.class.getMethod("standardMethod", String.class, int.class);
        DummyInvocationOnMock invocation = new DummyInvocationOnMock("mockObj", method, new Object[]{"hello", 123});
        try {
            reporter.invalidArgumentPositionRangeAtInvocationTime(invocation, false, 5);
            fail();
        } catch (MockitoException e) {
            assertTrue(e.getMessage().contains("Wanted parameter at position 5"));
            assertTrue(e.getMessage().contains("[0] String"));
            assertTrue(e.getMessage().contains("[1] int"));
        }
    }

    @Test
    public void testInvalidArgumentPositionRange_varArgs() throws Exception {
        Method method = SampleTarget.class.getMethod("varargMethod", String.class, Object[].class);
        DummyInvocationOnMock invocation = new DummyInvocationOnMock("mockObj", method, new Object[]{"hello"});
        try {
            reporter.invalidArgumentPositionRangeAtInvocationTime(invocation, false, 2);
            fail();
        } catch (MockitoException e) {
            assertTrue(e.getMessage().contains("<- Vararg"));
            assertTrue(e.getMessage().contains("[1+] Object"));
        }
    }

    @Test
    public void testWrongTypeOfArgumentToReturn() throws Exception {
        Method method = SampleTarget.class.getMethod("standardMethod", String.class, int.class);
        DummyInvocationOnMock invocation = new DummyInvocationOnMock("mockObj", method, new Object[]{"hello", 123});
        try {
            reporter.wrongTypeOfArgumentToReturn(invocation, "String", Integer.class, 1);
            fail();
        } catch (WrongTypeOfReturnValue e) {
            assertTrue(e.getMessage().contains("Integer cannot be returned"));
            assertTrue(e.getMessage().contains("should return the type 'String'"));
        }
    }

    // --- Edge Cases: cannotInjectDependency with cause ---

    @Test
    public void testCannotInjectDependencyWithCause() throws Exception {
        Field field = SampleTarget.class.getField("someField");
        Exception cause = new IllegalStateException("Underlying injection failed");
        Exception details = new Exception("Container exception", cause);

        try {
            reporter.cannotInjectDependency(field, "matchingMockObject", details);
            fail();
        } catch (MockitoException e) {
            assertTrue(e.getMessage().contains("Underlying injection failed"));
        }
    }
}