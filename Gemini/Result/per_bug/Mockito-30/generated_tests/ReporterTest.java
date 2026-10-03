package org.mockito.exceptions;

import static org.junit.Assert.*;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.mockito.exceptions.base.MockitoAssertionError;
import org.mockito.exceptions.base.MockitoException;
import org.mockito.exceptions.misusing.InvalidUseOfMatchersException;
import org.mockito.exceptions.misusing.MissingMethodInvocationException;
import org.mockito.exceptions.misusing.NotAMockException;
import org.mockito.exceptions.misusing.NullInsteadOfMockException;
import org.mockito.exceptions.misusing.UnfinishedStubbingException;
import org.mockito.exceptions.misusing.UnfinishedVerificationException;
import org.mockito.exceptions.misusing.WrongTypeOfReturnValue;
import org.mockito.exceptions.verification.NeverWantedButInvoked;
import org.mockito.exceptions.verification.NoInteractionsWanted;
import org.mockito.exceptions.verification.SmartNullPointerException;
import org.mockito.exceptions.verification.TooLittleActualInvocations;
import org.mockito.exceptions.verification.TooManyActualInvocations;
import org.mockito.exceptions.verification.VerificationInOrderFailure;
import org.mockito.exceptions.verification.WantedButNotInvoked;
import org.mockito.internal.debugging.Location;
import org.mockito.internal.exceptions.VerificationAwareInvocation;
import org.mockito.internal.invocation.Invocation;

public class ReporterTest {

    private Reporter reporter;

    @Before
    public void setUp() {
        reporter = new Reporter();
    }

    private PrintableInvocation createDummyPrintableInvocation(final String toStringValue, final Location location) {
        return new PrintableInvocation() {
            @Override
            public String toString() {
                return toStringValue;
            }

            @Override
            public Location getLocation() {
                return location;
            }
        };
    }

    private VerificationAwareInvocation createDummyVerificationAwareInvocation(final boolean verified, final Location location) {
        return new VerificationAwareInvocation() {
            @Override
            public boolean isVerified() {
                return verified;
            }

            @Override
            public Location getLocation() {
                return location;
            }
        };
    }

    @Test
    public void testCheckedExceptionInvalid() {
        Throwable t = new RuntimeException("Custom checked exception");
        try {
            reporter.checkedExceptionInvalid(t);
            fail("Expected MockitoException");
        } catch (MockitoException e) {
            assertTrue(e.getMessage().contains("Checked exception is invalid for this method!"));
            assertTrue(e.getMessage().contains("Invalid: " + t));
        }
    }

    @Test
    public void testCannotStubWithNullThrowable() {
        try {
            reporter.cannotStubWithNullThrowable();
            fail("Expected MockitoException");
        } catch (MockitoException e) {
            assertTrue(e.getMessage().contains("Cannot stub with null throwable!"));
        }
    }

    @Test
    public void testUnfinishedStubbing() {
        Location location = new Location();
        try {
            reporter.unfinishedStubbing(location);
            fail("Expected UnfinishedStubbingException");
        } catch (UnfinishedStubbingException e) {
            assertTrue(e.getMessage().contains("Unfinished stubbing detected here:"));
            assertTrue(e.getMessage().contains("E.g. thenReturn() may be missing."));
        }
    }

    @Test
    public void testMissingMethodInvocation() {
        try {
            reporter.missingMethodInvocation();
            fail("Expected MissingMethodInvocationException");
        } catch (MissingMethodInvocationException e) {
            assertTrue(e.getMessage().contains("when() requires an argument"));
        }
    }

    @Test
    public void testUnfinishedVerificationException() {
        Location location = new Location();
        try {
            reporter.unfinishedVerificationException(location);
            fail("Expected UnfinishedVerificationException");
        } catch (UnfinishedVerificationException e) {
            assertTrue(e.getMessage().contains("Missing method call for verify(mock) here:"));
        }
    }

    @Test
    public void testNotAMockPassedToVerify() {
        try {
            reporter.notAMockPassedToVerify(String.class);
            fail("Expected NotAMockException");
        } catch (NotAMockException e) {
            assertTrue(e.getMessage().contains("Argument passed to verify() is of type String and is not a mock!"));
        }
    }

    @Test
    public void testNullPassedToVerify() {
        try {
            reporter.nullPassedToVerify();
            fail("Expected NullInsteadOfMockException");
        } catch (NullInsteadOfMockException e) {
            assertTrue(e.getMessage().contains("Argument passed to verify() should be a mock but is null!"));
        }
    }

    @Test
    public void testNotAMockPassedToWhenMethod() {
        try {
            reporter.notAMockPassedToWhenMethod();
            fail("Expected NotAMockException");
        } catch (NotAMockException e) {
            assertTrue(e.getMessage().contains("Argument passed to when() is not a mock!"));
        }
    }

    @Test
    public void testNullPassedToWhenMethod() {
        try {
            reporter.nullPassedToWhenMethod();
            fail("Expected NullInsteadOfMockException");
        } catch (NullInsteadOfMockException e) {
            assertTrue(e.getMessage().contains("Argument passed to when() is null!"));
        }
    }

    @Test
    public void testMocksHaveToBePassedToVerifyNoMoreInteractions() {
        try {
            reporter.mocksHaveToBePassedToVerifyNoMoreInteractions();
            fail("Expected MockitoException");
        } catch (MockitoException e) {
            assertTrue(e.getMessage().contains("Method requires argument(s)!"));
        }
    }

    @Test
    public void testNotAMockPassedToVerifyNoMoreInteractions() {
        try {
            reporter.notAMockPassedToVerifyNoMoreInteractions();
            fail("Expected NotAMockException");
        } catch (NotAMockException e) {
            assertTrue(e.getMessage().contains("Argument(s) passed is not a mock!"));
        }
    }

    @Test
    public void testNullPassedToVerifyNoMoreInteractions() {
        try {
            reporter.nullPassedToVerifyNoMoreInteractions();
            fail("Expected NullInsteadOfMockException");
        } catch (NullInsteadOfMockException e) {
            assertTrue(e.getMessage().contains("Argument(s) passed is null!"));
        }
    }

    @Test
    public void testNotAMockPassedWhenCreatingInOrder() {
        try {
            reporter.notAMockPassedWhenCreatingInOrder();
            fail("Expected NotAMockException");
        } catch (NotAMockException e) {
            assertTrue(e.getMessage().contains("Argument(s) passed is not a mock!"));
        }
    }

    @Test
    public void testNullPassedWhenCreatingInOrder() {
        try {
            reporter.nullPassedWhenCreatingInOrder();
            fail("Expected NullInsteadOfMockException");
        } catch (NullInsteadOfMockException e) {
            assertTrue(e.getMessage().contains("Argument(s) passed is null!"));
        }
    }

    @Test
    public void testMocksHaveToBePassedWhenCreatingInOrder() {
        try {
            reporter.mocksHaveToBePassedWhenCreatingInOrder();
            fail("Expected MockitoException");
        } catch (MockitoException e) {
            assertTrue(e.getMessage().contains("Method requires argument(s)!"));
        }
    }

    @Test
    public void testInOrderRequiresFamiliarMock() {
        try {
            reporter.inOrderRequiresFamiliarMock();
            fail("Expected MockitoException");
        } catch (MockitoException e) {
            assertTrue(e.getMessage().contains("InOrder can only verify mocks that were passed in during creation"));
        }
    }

    @Test
    public void testInvalidUseOfMatchers() {
        try {
            reporter.invalidUseOfMatchers(2, 1);
            fail("Expected InvalidUseOfMatchersException");
        } catch (InvalidUseOfMatchersException e) {
            assertTrue(e.getMessage().contains("2 matchers expected, 1 recorded."));
        }
    }

    @Test
    public void testArgumentsAreDifferentWithJUnitOnClasspath() {
        Location loc = new Location();
        try {
            reporter.argumentsAreDifferent("wantedMethod()", "actualMethod()", loc);
            fail("Expected AssertionError/ArgumentsAreDifferent");
        } catch (AssertionError e) {
            assertTrue(e.getMessage().contains("Argument(s) are different! Wanted:"));
            assertTrue(e.getMessage().contains("wantedMethod()"));
            assertTrue(e.getMessage().contains("actualMethod()"));
        }
    }

    @Test
    public void testWantedButNotInvokedSimple() {
        PrintableInvocation wanted = createDummyPrintableInvocation("mock.doSomething()", new Location());
        try {
            reporter.wantedButNotInvoked(wanted);
            fail("Expected WantedButNotInvoked");
        } catch (WantedButNotInvoked e) {
            assertTrue(e.getMessage().contains("Wanted but not invoked:"));
            assertTrue(e.getMessage().contains("mock.doSomething()"));
        }
    }

    @Test
    public void testWantedButNotInvokedWithEmptyInvocationsList() {
        PrintableInvocation wanted = createDummyPrintableInvocation("mock.doSomething()", new Location());
        List<PrintableInvocation> emptyInvocations = Collections.emptyList();
        try {
            reporter.wantedButNotInvoked(wanted, emptyInvocations);
            fail("Expected WantedButNotInvoked");
        } catch (WantedButNotInvoked e) {
            assertTrue(e.getMessage().contains("Actually, there were zero interactions with this mock."));
        }
    }

    @Test
    public void testWantedButNotInvokedWithNonEmptyInvocationsList() {
        PrintableInvocation wanted = createDummyPrintableInvocation("mock.doSomething()", new Location());
        List<PrintableInvocation> invocations = new ArrayList<PrintableInvocation>();
        Location otherLoc = new Location();
        invocations.add(createDummyPrintableInvocation("mock.otherMethod()", otherLoc));

        try {
            reporter.wantedButNotInvoked(wanted, invocations);
            fail("Expected WantedButNotInvoked");
        } catch (WantedButNotInvoked e) {
            assertTrue(e.getMessage().contains("However, there were other interactions with this mock:"));
            assertTrue(e.getMessage().contains(otherLoc.toString()));
        }
    }

    @Test
    public void testWantedButNotInvokedInOrder() {
        PrintableInvocation wanted = createDummyPrintableInvocation("mock.wantedMethod()", new Location());
        PrintableInvocation previous = createDummyPrintableInvocation("mock.previousMethod()", new Location());
        try {
            reporter.wantedButNotInvokedInOrder(wanted, previous);
            fail("Expected VerificationInOrderFailure");
        } catch (VerificationInOrderFailure e) {
            assertTrue(e.getMessage().contains("Verification in order failure"));
            assertTrue(e.getMessage().contains("Wanted anywhere AFTER following interaction:"));
        }
    }

    @Test
    public void testTooManyActualInvocations() {
        PrintableInvocation wanted = createDummyPrintableInvocation("mock.action()", new Location());
        Location firstUndesired = new Location();
        try {
            reporter.tooManyActualInvocations(1, 2, wanted, firstUndesired);
            fail("Expected TooManyActualInvocations");
        } catch (TooManyActualInvocations e) {
            assertTrue(e.getMessage().contains("Wanted 1 time:"));
            assertTrue(e.getMessage().contains("But was 2 times. Undesired invocation:"));
        }
    }

    @Test
    public void testTooManyActualInvocationsInOrder() {
        PrintableInvocation wanted = createDummyPrintableInvocation("mock.action()", new Location());
        Location firstUndesired = new Location();
        try {
            reporter.tooManyActualInvocationsInOrder(2, 3, wanted, firstUndesired);
            fail("Expected VerificationInOrderFailure");
        } catch (VerificationInOrderFailure e) {
            assertTrue(e.getMessage().contains("Verification in order failure:"));
            assertTrue(e.getMessage().contains("Wanted 2 times:"));
            assertTrue(e.getMessage().contains("But was 3 times."));
        }
    }

    @Test
    public void testNeverWantedButInvoked() {
        PrintableInvocation wanted = createDummyPrintableInvocation("mock.never()", new Location());
        Location firstUndesired = new Location();
        try {
            reporter.neverWantedButInvoked(wanted, firstUndesired);
            fail("Expected NeverWantedButInvoked");
        } catch (NeverWantedButInvoked e) {
            assertTrue(e.getMessage().contains("Never wanted here:"));
            assertTrue(e.getMessage().contains("But invoked here:"));
        }
    }

    @Test
    public void testTooLittleActualInvocationsWithNonNullLocation() {
        Discrepancy discrepancy = new Discrepancy(2, 1);
        PrintableInvocation wanted = createDummyPrintableInvocation("mock.action()", new Location());
        Location lastActualLocation = new Location();
        try {
            reporter.tooLittleActualInvocations(discrepancy, wanted, lastActualLocation);
            fail("Expected TooLittleActualInvocations");
        } catch (TooLittleActualInvocations e) {
            assertTrue(e.getMessage().contains("Wanted 2 times:"));
            assertTrue(e.getMessage().contains("But was 1 time:"));
            assertTrue(e.getMessage().contains(lastActualLocation.toString()));
        }
    }

    @Test
    public void testTooLittleActualInvocationsWithNullLocation() {
        Discrepancy discrepancy = new Discrepancy(1, 0);
        PrintableInvocation wanted = createDummyPrintableInvocation("mock.action()", new Location());
        try {
            reporter.tooLittleActualInvocations(discrepancy, wanted, null);
            fail("Expected TooLittleActualInvocations");
        } catch (TooLittleActualInvocations e) {
            assertTrue(e.getMessage().contains("Wanted 1 time:"));
            assertTrue(e.getMessage().contains("But was 0 times:"));
        }
    }

    @Test
    public void testTooLittleActualInvocationsInOrderWithNonNullLocation() {
        Discrepancy discrepancy = new Discrepancy(3, 1);
        PrintableInvocation wanted = createDummyPrintableInvocation("mock.inOrderAction()", new Location());
        Location lastActualLocation = new Location();
        try {
            reporter.tooLittleActualInvocationsInOrder(discrepancy, wanted, lastActualLocation);
            fail("Expected VerificationInOrderFailure");
        } catch (VerificationInOrderFailure e) {
            assertTrue(e.getMessage().contains("Verification in order failure:"));
            assertTrue(e.getMessage().contains("Wanted 3 times:"));
            assertTrue(e.getMessage().contains("But was 1 time:"));
            assertTrue(e.getMessage().contains(lastActualLocation.toString()));
        }
    }

    @Test
    public void testTooLittleActualInvocationsInOrderWithNullLocation() {
        Discrepancy discrepancy = new Discrepancy(2, 0);
        PrintableInvocation wanted = createDummyPrintableInvocation("mock.inOrderAction()", new Location());
        try {
            reporter.tooLittleActualInvocationsInOrder(discrepancy, wanted, null);
            fail("Expected VerificationInOrderFailure");
        } catch (VerificationInOrderFailure e) {
            assertTrue(e.getMessage().contains("Verification in order failure:"));
            assertTrue(e.getMessage().contains("Wanted 2 times:"));
            assertTrue(e.getMessage().contains("But was 0 times:"));
        }
    }

    @Test
    public void testNoMoreInteractionsWanted() {
        final Location loc = new Location();
        Invocation undesired = new Invocation(new Object(), null, new Object[0], 1, null) {
            @Override
            public Location getLocation() {
                return loc;
            }
        };

        List<VerificationAwareInvocation> invocations = new ArrayList<VerificationAwareInvocation>();
        invocations.add(createDummyVerificationAwareInvocation(false, new Location()));

        try {
            reporter.noMoreInteractionsWanted(undesired, invocations);
            fail("Expected NoInteractionsWanted");
        } catch (NoInteractionsWanted e) {
            assertTrue(e.getMessage().contains("No interactions wanted here:"));
            assertTrue(e.getMessage().contains("But found this interaction:"));
        }
    }

    @Test
    public void testNoMoreInteractionsWantedInOrder() {
        final Location loc = new Location();
        Invocation undesired = new Invocation(new Object(), null, new Object[0], 1, null) {
            @Override
            public Location getLocation() {
                return loc;
            }
        };

        try {
            reporter.noMoreInteractionsWantedInOrder(undesired);
            fail("Expected VerificationInOrderFailure");
        } catch (VerificationInOrderFailure e) {
            assertTrue(e.getMessage().contains("No interactions wanted here:"));
            assertTrue(e.getMessage().contains("But found this interaction:"));
        }
    }

    @Test
    public void testCannotMockFinalClass() {
        try {
            reporter.cannotMockFinalClass(String.class);
            fail("Expected MockitoException");
        } catch (MockitoException e) {
            assertTrue(e.getMessage().contains("Cannot mock/spy class java.lang.String"));
            assertTrue(e.getMessage().contains("  - final classes"));
        }
    }

    @Test
    public void testCannotStubVoidMethodWithAReturnValue() {
        try {
            reporter.cannotStubVoidMethodWithAReturnValue("setFoo");
            fail("Expected MockitoException");
        } catch (MockitoException e) {
            assertTrue(e.getMessage().contains("'setFoo' is a *void method* and it *cannot* be stubbed with a *return value*!"));
        }
    }

    @Test
    public void testOnlyVoidMethodsCanBeSetToDoNothing() {
        try {
            reporter.onlyVoidMethodsCanBeSetToDoNothing();
            fail("Expected MockitoException");
        } catch (MockitoException e) {
            assertTrue(e.getMessage().contains("Only void methods can doNothing()!"));
        }
    }

    @Test
    public void testWrongTypeOfReturnValue() {
        try {
            reporter.wrongTypeOfReturnValue("Integer", "String", "getCount");
            fail("Expected WrongTypeOfReturnValue");
        } catch (WrongTypeOfReturnValue e) {
            assertTrue(e.getMessage().contains("String cannot be returned by getCount()"));
            assertTrue(e.getMessage().contains("getCount() should return Integer"));
        }
    }

    @Test
    public void testWantedAtMostX() {
        try {
            reporter.wantedAtMostX(1, 3);
            fail("Expected MockitoAssertionError");
        } catch (MockitoAssertionError e) {
            assertTrue(e.getMessage().contains("Wanted at most 1 time but was 3"));
        }
    }

    @Test
    public void testMisplacedArgumentMatcher() {
        Location loc = new Location();
        try {
            reporter.misplacedArgumentMatcher(loc);
            fail("Expected InvalidUseOfMatchersException");
        } catch (InvalidUseOfMatchersException e) {
            assertTrue(e.getMessage().contains("Misplaced argument matcher detected here:"));
        }
    }

    @Test
    public void testSmartNullPointerException() {
        Location loc = new Location();
        try {
            reporter.smartNullPointerException(loc);
            fail("Expected SmartNullPointerException");
        } catch (SmartNullPointerException e) {
            assertTrue(e.getMessage().contains("You have a NullPointerException here:"));
            assertTrue(e.getMessage().contains("Because this method was *not* stubbed correctly:"));
        }
    }

    @Test
    public void testNoArgumentValueWasCaptured() {
        try {
            reporter.noArgumentValueWasCaptured();
            fail("Expected MockitoException");
        } catch (MockitoException e) {
            assertTrue(e.getMessage().contains("No argument value was captured!"));
        }
    }

    @Test
    public void testExtraInterfacesDoesNotAcceptNullParameters() {
        try {
            reporter.extraInterfacesDoesNotAcceptNullParameters();
            fail("Expected MockitoException");
        } catch (MockitoException e) {
            assertTrue(e.getMessage().contains("extraInterfaces() does not accept null parameters."));
        }
    }

    @Test
    public void testExtraInterfacesAcceptsOnlyInterfaces() {
        try {
            reporter.extraInterfacesAcceptsOnlyInterfaces(String.class);
            fail("Expected MockitoException");
        } catch (MockitoException e) {
            assertTrue(e.getMessage().contains("extraInterfaces() accepts only interfaces."));
            assertTrue(e.getMessage().contains("String which is not an interface."));
        }
    }

    @Test
    public void testExtraInterfacesCannotContainMockedType() {
        try {
            reporter.extraInterfacesCannotContainMockedType(List.class);
            fail("Expected MockitoException");
        } catch (MockitoException e) {
            assertTrue(e.getMessage().contains("extraInterfaces() does not accept the same type as the mocked type."));
        }
    }

    @Test
    public void testExtraInterfacesRequiresAtLeastOneInterface() {
        try {
            reporter.extraInterfacesRequiresAtLeastOneInterface();
            fail("Expected MockitoException");
        } catch (MockitoException e) {
            assertTrue(e.getMessage().contains("extraInterfaces() requires at least one interface."));
        }
    }

    @Test
    public void testMockedTypeIsInconsistentWithSpiedInstanceType() {
        try {
            reporter.mockedTypeIsInconsistentWithSpiedInstanceType(List.class, new ArrayList<Object>());
            fail("Expected MockitoException");
        } catch (MockitoException e) {
            assertTrue(e.getMessage().contains("Mocked type must be: ArrayList, but is: List"));
        }
    }

    @Test
    public void testCannotCallRealMethodOnInterface() {
        try {
            reporter.cannotCallRealMethodOnInterface();
            fail("Expected MockitoException");
        } catch (MockitoException e) {
            assertTrue(e.getMessage().contains("Cannot call real method on java interface."));
        }
    }

    @Test
    public void testCannotVerifyToString() {
        try {
            reporter.cannotVerifyToString();
            fail("Expected MockitoException");
        } catch (MockitoException e) {
            assertTrue(e.getMessage().contains("Mockito cannot verify toString()"));
        }
    }

    @Test
    public void testMoreThanOneAnnotationNotAllowed() {
        try {
            reporter.moreThanOneAnnotationNotAllowed("myField");
            fail("Expected MockitoException");
        } catch (MockitoException e) {
            assertTrue(e.getMessage().contains("The field 'myField' has multiple Mockito annotations."));
        }
    }

    @Test
    public void testUnsupportedCombinationOfAnnotations() {
        try {
            reporter.unsupportedCombinationOfAnnotations("Mock", "Spy");
            fail("Expected MockitoException");
        } catch (MockitoException e) {
            assertTrue(e.getMessage().contains("This combination of annotations is not permitted on a single field:"));
            assertTrue(e.getMessage().contains("@Mock and @Spy"));
        }
    }

    @Test
    public void testCannotInitializeForSpyAnnotation() {
        Exception cause = new IllegalAccessException("No access");
        try {
            reporter.cannotInitializeForSpyAnnotation("serviceSpy", cause);
            fail("Expected MockitoException");
        } catch (MockitoException e) {
            assertTrue(e.getMessage().contains("Cannot instianate a @Spy for 'serviceSpy' field."));
            assertTrue(e.getMessage().contains("No access"));
            assertSame(cause, e.getCause());
        }
    }

    @Test
    public void testCannotInitializeForInjectMocksAnnotation() {
        Exception cause = new InstantiationException("Abstract class");
        try {
            reporter.cannotInitializeForInjectMocksAnnotation("orderService", cause);
            fail("Expected MockitoException");
        } catch (MockitoException e) {
            assertTrue(e.getMessage().contains("Cannot instianate @InjectMocks field named 'orderService'."));
            assertTrue(e.getMessage().contains("Abstract class"));
            assertSame(cause, e.getCause());
        }
    }
}