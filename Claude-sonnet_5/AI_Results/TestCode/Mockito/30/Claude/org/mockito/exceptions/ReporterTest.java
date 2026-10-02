package org.mockito.exceptions;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

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
import org.mockito.exceptions.verification.SmartNullPointerException;
import org.mockito.exceptions.verification.TooLittleActualInvocations;
import org.mockito.exceptions.verification.TooManyActualInvocations;
import org.mockito.exceptions.verification.VerificationInOrderFailure;
import org.mockito.exceptions.verification.WantedButNotInvoked;
import org.mockito.internal.debugging.Location;

public class ReporterTest {

    private final Reporter reporter = new Reporter();

    /**
     * Fake implementation of PrintableInvocation.
     * ASSUMPTION: interface requires toString() + getLocation() — not shown in given source,
     * inferred purely from usage inside Reporter.java.
     */
    private static class FakeInvocation implements PrintableInvocation {
        private final String desc;
        private final Location location;

        FakeInvocation(String desc) {
            this.desc = desc;
            this.location = new Location();
        }

        @Override
        public String toString() {
            return desc;
        }

        @Override
        public Location getLocation() {
            return location;
        }
    }

    // ---------- checkedExceptionInvalid ----------

    @Test
    public void checkedExceptionInvalid_withThrowable_throwsMockitoException() {
        try {
            reporter.checkedExceptionInvalid(new RuntimeException("boom"));
            fail("Expected MockitoException");
        } catch (MockitoException e) {
            assertTrue(e.getMessage().contains("Checked exception is invalid for this method!"));
            assertTrue(e.getMessage().contains("Invalid:"));
        }
    }

    @Test
    public void checkedExceptionInvalid_withNullThrowable_doesNotNPE() {
        // boundary: null input -- string concatenation "Invalid: " + null should not NPE
        try {
            reporter.checkedExceptionInvalid(null);
            fail("Expected MockitoException");
        } catch (MockitoException e) {
            assertTrue(e.getMessage().contains("Invalid: null"));
        }
    }

    // ---------- cannotStubWithNullThrowable ----------

    @Test
    public void cannotStubWithNullThrowable_throwsMockitoException() {
        try {
            reporter.cannotStubWithNullThrowable();
            fail("Expected MockitoException");
        } catch (MockitoException e) {
            assertTrue(e.getMessage().contains("Cannot stub with null throwable!"));
        }
    }

    // ---------- unfinishedStubbing ----------

    @Test
    public void unfinishedStubbing_withLocation_throwsUnfinishedStubbingException() {
        try {
            reporter.unfinishedStubbing(new Location());
            fail("Expected UnfinishedStubbingException");
        } catch (UnfinishedStubbingException e) {
            assertTrue(e.getMessage().contains("Unfinished stubbing detected here:"));
        }
    }

    @Test
    public void unfinishedStubbing_withNullLocation_doesNotThrowUnexpectedException() {
        // ASSUMPTION: StringJoiner.join handles null element gracefully (source not provided)
        try {
            reporter.unfinishedStubbing(null);
            fail("Expected UnfinishedStubbingException");
        } catch (UnfinishedStubbingException e) {
            assertNotNull(e.getMessage());
        }
    }

    // ---------- missingMethodInvocation ----------

    @Test
    public void missingMethodInvocation_throwsMissingMethodInvocationException() {
        try {
            reporter.missingMethodInvocation();
            fail("Expected MissingMethodInvocationException");
        } catch (MissingMethodInvocationException e) {
            assertTrue(e.getMessage().contains("when() requires an argument"));
        }
    }

    // ---------- unfinishedVerificationException ----------

    @Test
    public void unfinishedVerificationException_throwsCorrectType() {
        try {
            reporter.unfinishedVerificationException(new Location());
            fail("Expected UnfinishedVerificationException");
        } catch (UnfinishedVerificationException e) {
            assertTrue(e.getMessage().contains("Missing method call for verify(mock) here:"));
        }
    }

    // ---------- notAMockPassedToVerify ----------

    @Test
    public void notAMockPassedToVerify_withValidClass_throwsNotAMockException() {
        try {
            reporter.notAMockPassedToVerify(String.class);
            fail("Expected NotAMockException");
        } catch (NotAMockException e) {
            assertTrue(e.getMessage().contains("String"));
        }
    }

    @Test(expected = NullPointerException.class)
    public void notAMockPassedToVerify_withNullClass_throwsNPE() {
        // fault-finding: code calls type.getSimpleName() without null-check
        reporter.notAMockPassedToVerify(null);
    }

    // ---------- nullPassedToVerify ----------

    @Test
    public void nullPassedToVerify_throwsNullInsteadOfMockException() {
        try {
            reporter.nullPassedToVerify();
            fail("Expected NullInsteadOfMockException");
        } catch (NullInsteadOfMockException e) {
            assertTrue(e.getMessage().contains("should be a mock but is null"));
        }
    }

    // ---------- notAMockPassedToWhenMethod ----------

    @Test
    public void notAMockPassedToWhenMethod_throwsNotAMockException() {
        try {
            reporter.notAMockPassedToWhenMethod();
            fail("Expected NotAMockException");
        } catch (NotAMockException e) {
            assertTrue(e.getMessage().contains("Argument passed to when() is not a mock!"));
        }
    }

    // ---------- nullPassedToWhenMethod ----------

    @Test
    public void nullPassedToWhenMethod_throwsNullInsteadOfMockException() {
        try {
            reporter.nullPassedToWhenMethod();
            fail("Expected NullInsteadOfMockException");
        } catch (NullInsteadOfMockException e) {
            assertTrue(e.getMessage().contains("Argument passed to when() is null!"));
        }
    }

    // ---------- mocksHaveToBePassedToVerifyNoMoreInteractions ----------

    @Test
    public void mocksHaveToBePassedToVerifyNoMoreInteractions_throwsMockitoException() {
        try {
            reporter.mocksHaveToBePassedToVerifyNoMoreInteractions();
            fail("Expected MockitoException");
        } catch (MockitoException e) {
            assertTrue(e.getMessage().contains("Method requires argument(s)!"));
        }
    }

    // ---------- notAMockPassedToVerifyNoMoreInteractions ----------

    @Test
    public void notAMockPassedToVerifyNoMoreInteractions_throwsNotAMockException() {
        try {
            reporter.notAMockPassedToVerifyNoMoreInteractions();
            fail("Expected NotAMockException");
        } catch (NotAMockException e) {
            assertTrue(e.getMessage().contains("Argument(s) passed is not a mock!"));
        }
    }

    // ---------- nullPassedToVerifyNoMoreInteractions ----------

    @Test
    public void nullPassedToVerifyNoMoreInteractions_throwsNullInsteadOfMockException() {
        try {
            reporter.nullPassedToVerifyNoMoreInteractions();
            fail("Expected NullInsteadOfMockException");
        } catch (NullInsteadOfMockException e) {
            assertTrue(e.getMessage().contains("Argument(s) passed is null!"));
        }
    }

    // ---------- notAMockPassedWhenCreatingInOrder ----------

    @Test
    public void notAMockPassedWhenCreatingInOrder_throwsNotAMockException() {
        try {
            reporter.notAMockPassedWhenCreatingInOrder();
            fail("Expected NotAMockException");
        } catch (NotAMockException e) {
            assertTrue(e.getMessage().contains("InOrder inOrder = inOrder(mockOne, mockTwo);"));
        }
    }

    // ---------- nullPassedWhenCreatingInOrder ----------

    @Test
    public void nullPassedWhenCreatingInOrder_throwsNullInsteadOfMockException() {
        try {
            reporter.nullPassedWhenCreatingInOrder();
            fail("Expected NullInsteadOfMockException");
        } catch (NullInsteadOfMockException e) {
            assertTrue(e.getMessage().contains("Argument(s) passed is null!"));
        }
    }

    // ---------- mocksHaveToBePassedWhenCreatingInOrder ----------

    @Test
    public void mocksHaveToBePassedWhenCreatingInOrder_throwsMockitoException() {
        try {
            reporter.mocksHaveToBePassedWhenCreatingInOrder();
            fail("Expected MockitoException");
        } catch (MockitoException e) {
            assertTrue(e.getMessage().contains("Method requires argument(s)!"));
        }
    }

    // ---------- inOrderRequiresFamiliarMock ----------

    @Test
    public void inOrderRequiresFamiliarMock_throwsMockitoException() {
        try {
            reporter.inOrderRequiresFamiliarMock();
            fail("Expected MockitoException");
        } catch (MockitoException e) {
            assertTrue(e.getMessage().contains("InOrder can only verify mocks"));
        }
    }

    // ---------- invalidUseOfMatchers ----------

    @Test
    public void invalidUseOfMatchers_normalValues() {
        try {
            reporter.invalidUseOfMatchers(2, 1);
            fail("Expected InvalidUseOfMatchersException");
        } catch (InvalidUseOfMatchersException e) {
            assertTrue(e.getMessage().contains("2 matchers expected, 1 recorded."));
        }
    }

    @Test
    public void invalidUseOfMatchers_boundaryZeroValues() {
        try {
            reporter.invalidUseOfMatchers(0, 0);
            fail("Expected InvalidUseOfMatchersException");
        } catch (InvalidUseOfMatchersException e) {
            assertTrue(e.getMessage().contains("0 matchers expected, 0 recorded."));
        }
    }

    // ---------- argumentsAreDifferent (branch: JUnitTool.hasJUnit()) ----------

    @Test
    public void argumentsAreDifferent_whenJUnitPresent_throwsAssertionErrorDerivedException() {
        // JUnit is guaranteed present in this test's own classpath => hasJUnit() == true branch.
        // The "false" branch cannot be exercised without removing JUnit from classpath.
        try {
            reporter.argumentsAreDifferent("wanted-args", "actual-args", new Location());
            fail("Expected AssertionError-derived exception");
        } catch (AssertionError e) {
            assertNotNull(e.getMessage());
            assertTrue(e.getMessage().contains("Argument(s) are different! Wanted:"));
        }
    }

    // ---------- wantedButNotInvoked (single-arg overload) ----------

    @Test
    public void wantedButNotInvoked_singleArg_throwsWantedButNotInvoked() {
        try {
            reporter.wantedButNotInvoked(new FakeInvocation("mock.foo()"));
            fail("Expected WantedButNotInvoked");
        } catch (WantedButNotInvoked e) {
            assertTrue(e.getMessage().contains("Wanted but not invoked:"));
            assertTrue(e.getMessage().contains("mock.foo()"));
        }
    }

    // ---------- wantedButNotInvoked (two-arg overload, branch: list empty/non-empty + loop) ----------

    @Test
    public void wantedButNotInvoked_withEmptyInvocationsList_branchEmpty() {
        List<PrintableInvocation> invocations = new ArrayList<PrintableInvocation>();
        try {
            reporter.wantedButNotInvoked(new FakeInvocation("mock.foo()"), invocations);
            fail("Expected WantedButNotInvoked");
        } catch (WantedButNotInvoked e) {
            assertTrue(e.getMessage().contains("Actually, there were zero interactions with this mock."));
        }
    }

    @Test
    public void wantedButNotInvoked_withNonEmptyInvocationsList_branchNonEmptyAndLoopMultiple() {
        List<PrintableInvocation> invocations = new ArrayList<PrintableInvocation>();
        invocations.add(new FakeInvocation("mock.bar()"));
        invocations.add(new FakeInvocation("mock.baz()"));
        try {
            reporter.wantedButNotInvoked(new FakeInvocation("mock.foo()"), invocations);
            fail("Expected WantedButNotInvoked");
        } catch (WantedButNotInvoked e) {
            assertTrue(e.getMessage().contains("However, there were other interactions with this mock:"));
        }
    }

    // ---------- wantedButNotInvokedInOrder ----------

    @Test
    public void wantedButNotInvokedInOrder_throwsVerificationInOrderFailure() {
        try {
            reporter.wantedButNotInvokedInOrder(
                    new FakeInvocation("mock.foo()"),
                    new FakeInvocation("mock.bar()"));
            fail("Expected VerificationInOrderFailure");
        } catch (VerificationInOrderFailure e) {
            assertTrue(e.getMessage().contains("Verification in order failure"));
        }
    }

    // ---------- tooManyActualInvocations ----------

    @Test
    public void tooManyActualInvocations_throwsTooManyActualInvocations() {
        try {
            reporter.tooManyActualInvocations(1, 3, new FakeInvocation("mock.foo()"), new Location());
            fail("Expected TooManyActualInvocations");
        } catch (TooManyActualInvocations e) {
            assertTrue(e.getMessage().contains("But was"));
        }
    }

    // ---------- neverWantedButInvoked ----------

    @Test
    public void neverWantedButInvoked_throwsNeverWantedButInvoked() {
        try {
            reporter.neverWantedButInvoked(new FakeInvocation("mock.foo()"), new Location());
            fail("Expected NeverWantedButInvoked");
        } catch (NeverWantedButInvoked e) {
            assertTrue(e.getMessage().contains("Never wanted here:"));
        }
    }

    // ---------- tooManyActualInvocationsInOrder ----------

    @Test
    public void tooManyActualInvocationsInOrder_throwsVerificationInOrderFailure() {
        try {
            reporter.tooManyActualInvocationsInOrder(1, 2, new FakeInvocation("mock.foo()"), new Location());
            fail("Expected VerificationInOrderFailure");
        } catch (VerificationInOrderFailure e) {
            assertTrue(e.getMessage().contains("Verification in order failure:"));
        }
    }

    // ---------- tooLittleActualInvocations (branch: lastActualLocation null / not-null) ----------

    @Test
    public void tooLittleActualInvocations_withNonNullLocation_branchNotNull() {
        Discrepancy discrepancy = new Discrepancy(3, 1); // ASSUMPTION on constructor, see class header note
        try {
            reporter.tooLittleActualInvocations(discrepancy, new FakeInvocation("mock.foo()"), new Location());
            fail("Expected TooLittleActualInvocations");
        } catch (TooLittleActualInvocations e) {
            assertNotNull(e.getMessage());
        }
    }

    @Test
    public void tooLittleActualInvocations_withNullLocation_branchNull() {
        Discrepancy discrepancy = new Discrepancy(3, 1);
        try {
            reporter.tooLittleActualInvocations(discrepancy, new FakeInvocation("mock.foo()"), null);
            fail("Expected TooLittleActualInvocations");
        } catch (TooLittleActualInvocations e) {
            assertNotNull(e.getMessage());
        }
    }

    // ---------- tooLittleActualInvocationsInOrder ----------

    @Test
    public void tooLittleActualInvocationsInOrder_withNonNullLocation() {
        Discrepancy discrepancy = new Discrepancy(5, 2);
        try {
            reporter.tooLittleActualInvocationsInOrder(discrepancy, new FakeInvocation("mock.foo()"), new Location());
            fail("Expected VerificationInOrderFailure");
        } catch (VerificationInOrderFailure e) {
            assertTrue(e.getMessage().contains("Verification in order failure:"));
        }
    }

    @Test
    public void tooLittleActualInvocationsInOrder_withNullLocation() {
        Discrepancy discrepancy = new Discrepancy(5, 2);
        try {
            reporter.tooLittleActualInvocationsInOrder(discrepancy, new FakeInvocation("mock.foo()"), null);
            fail("Expected VerificationInOrderFailure");
        } catch (VerificationInOrderFailure e) {
            assertTrue(e.getMessage().contains("Verification in order failure:"));
        }
    }

    // ---------- noMoreInteractionsWanted / noMoreInteractionsWantedInOrder ----------
    // SKIPPED: require org.mockito.internal.invocation.Invocation and
    // org.mockito.internal.exceptions.VerificationAwareInvocation instances whose constructors
    // are not shown in the provided source. Constructing them would require guessing internal
    // Mockito framework behavior, which violates requirement #4.

    // ---------- cannotMockFinalClass ----------

    @Test
    public void cannotMockFinalClass_throwsMockitoException() {
        try {
            reporter.cannotMockFinalClass(String.class);
            fail("Expected MockitoException");
        } catch (MockitoException e) {
            assertTrue(e.getMessage().contains("Cannot mock/spy"));
        }
    }

    // ---------- cannotStubVoidMethodWithAReturnValue ----------

    @Test
    public void cannotStubVoidMethodWithAReturnValue_throwsMockitoException() {
        try {
            reporter.cannotStubVoidMethodWithAReturnValue("someMethod");
            fail("Expected MockitoException");
        } catch (MockitoException e) {
            assertTrue(e.getMessage().contains("'someMethod' is a *void method*"));
        }
    }

    @Test
    public void cannotStubVoidMethodWithAReturnValue_withEmptyMethodName() {
        // boundary: empty string input
        try {
            reporter.cannotStubVoidMethodWithAReturnValue("");
            fail("Expected MockitoException");
        } catch (MockitoException e) {
            assertTrue(e.getMessage().contains("'' is a *void method*"));
        }
    }

    // ---------- onlyVoidMethodsCanBeSetToDoNothing ----------

    @Test
    public void onlyVoidMethodsCanBeSetToDoNothing_throwsMockitoException() {
        try {
            reporter.onlyVoidMethodsCanBeSetToDoNothing();
            fail("Expected MockitoException");
        } catch (MockitoException e) {
            assertTrue(e.getMessage().contains("Only void methods can doNothing()!"));
        }
    }

    // ---------- wrongTypeOfReturnValue ----------

    @Test
    public void wrongTypeOfReturnValue_throwsWrongTypeOfReturnValue() {
        try {
            reporter.wrongTypeOfReturnValue("String", "Integer", "getName");
            fail("Expected WrongTypeOfReturnValue");
        } catch (WrongTypeOfReturnValue e) {
            assertTrue(e.getMessage().contains("Integer cannot be returned by getName()"));
        }
    }

    // ---------- wantedAtMostX ----------

    @Test
    public void wantedAtMostX_normalValues() {
        try {
            reporter.wantedAtMostX(5, 7);
            fail("Expected MockitoAssertionError");
        } catch (MockitoAssertionError e) {
            assertTrue(e.getMessage().contains("Wanted at most"));
        }
    }

    @Test
    public void wantedAtMostX_boundaryZero() {
        try {
            reporter.wantedAtMostX(0, 0);
            fail("Expected MockitoAssertionError");
        } catch (MockitoAssertionError e) {
            assertTrue(e.getMessage().contains("but was 0"));
        }
    }

    // ---------- misplacedArgumentMatcher ----------

    @Test
    public void misplacedArgumentMatcher_throwsInvalidUseOfMatchersException() {
        try {
            reporter.misplacedArgumentMatcher(new Location());
            fail("Expected InvalidUseOfMatchersException");
        } catch (InvalidUseOfMatchersException e) {
            assertTrue(e.getMessage().contains("Misplaced argument matcher detected here:"));
        }
    }

    // ---------- smartNullPointerException ----------

    @Test
    public void smartNullPointerException_throwsSmartNullPointerException() {
        try {
            reporter.smartNullPointerException(new Location());
            fail("Expected SmartNullPointerException");
        } catch (SmartNullPointerException e) {
            assertTrue(e.getMessage().contains("You have a NullPointerException here:"));
        }
    }

    // ---------- noArgumentValueWasCaptured ----------

    @Test
    public void noArgumentValueWasCaptured_throwsMockitoException() {
        try {
            reporter.noArgumentValueWasCaptured();
            fail("Expected MockitoException");
        } catch (MockitoException e) {
            assertTrue(e.getMessage().contains("No argument value was captured!"));
        }
    }

    // ---------- extraInterfacesDoesNotAcceptNullParameters ----------

    @Test
    public void extraInterfacesDoesNotAcceptNullParameters_throwsMockitoException() {
        try {
            reporter.extraInterfacesDoesNotAcceptNullParameters();
            fail("Expected MockitoException");
        } catch (MockitoException e) {
            assertTrue(e.getMessage().contains("extraInterfaces() does not accept null parameters."));
        }
    }

    // ---------- extraInterfacesAcceptsOnlyInterfaces ----------

    @Test
    public void extraInterfacesAcceptsOnlyInterfaces_throwsMockitoException() {
        try {
            reporter.extraInterfacesAcceptsOnlyInterfaces(String.class);
            fail("Expected MockitoException");
        } catch (MockitoException e) {
            assertTrue(e.getMessage().contains("String which is not an interface."));
        }
    }

    // ---------- extraInterfacesCannotContainMockedType ----------

    @Test
    public void extraInterfacesCannotContainMockedType_throwsMockitoException() {
        try {
            reporter.extraInterfacesCannotContainMockedType(List.class);
            fail("Expected MockitoException");
        } catch (MockitoException e) {
            assertTrue(e.getMessage().contains("You mocked following type: List"));
        }
    }

    // ---------- extraInterfacesRequiresAtLeastOneInterface ----------

    @Test
    public void extraInterfacesRequiresAtLeastOneInterface_throwsMockitoException() {
        try {
            reporter.extraInterfacesRequiresAtLeastOneInterface();
            fail("Expected MockitoException");
        } catch (MockitoException e) {
            assertTrue(e.getMessage().contains("extraInterfaces() requires at least one interface."));
        }
    }

    // ---------- mockedTypeIsInconsistentWithSpiedInstanceType ----------

    @Test
    public void mockedTypeIsInconsistentWithSpiedInstanceType_normalCase() {
        try {
            reporter.mockedTypeIsInconsistentWithSpiedInstanceType(List.class, new ArrayList<Object>());
            fail("Expected MockitoException");
        } catch (MockitoException e) {
            assertTrue(e.getMessage().contains("Mocked type must be: ArrayList, but is: List"));
        }
    }

    @Test(expected = NullPointerException.class)
    public void mockedTypeIsInconsistentWithSpiedInstanceType_nullSpiedInstance_throwsNPE() {
        // fault-finding: code calls spiedInstance.getClass() without null-check
        reporter.mockedTypeIsInconsistentWithSpiedInstanceType(List.class, null);
    }

    @Test(expected = NullPointerException.class)
    public void mockedTypeIsInconsistentWithSpiedInstanceType_nullMockedType_throwsNPE() {
        // fault-finding: code calls mockedType.getSimpleName() without null-check
        reporter.mockedTypeIsInconsistentWithSpiedInstanceType(null, new ArrayList<Object>());
    }

    // ---------- cannotCallRealMethodOnInterface ----------

    @Test
    public void cannotCallRealMethodOnInterface_throwsMockitoException() {
        try {
            reporter.cannotCallRealMethodOnInterface();
            fail("Expected MockitoException");
        } catch (MockitoException e) {
            assertTrue(e.getMessage().contains("Cannot call real method on java interface."));
        }
    }

    // ---------- cannotVerifyToString ----------

    @Test
    public void cannotVerifyToString_throwsMockitoException() {
        try {
            reporter.cannotVerifyToString();
            fail("Expected MockitoException");
        } catch (MockitoException e) {
            assertTrue(e.getMessage().contains("Mockito cannot verify toString()"));
        }
    }

    // ---------- moreThanOneAnnotationNotAllowed ----------

    @Test
    public void moreThanOneAnnotationNotAllowed_throwsMockitoException() {
        try {
            reporter.moreThanOneAnnotationNotAllowed("myField");
            fail("Expected MockitoException");
        } catch (MockitoException e) {
            assertTrue(e.getMessage().contains("The field 'myField' has multiple Mockito annotations."));
        }
    }

    // ---------- unsupportedCombinationOfAnnotations ----------

    @Test
    public void unsupportedCombinationOfAnnotations_throwsMockitoException() {
        try {
            reporter.unsupportedCombinationOfAnnotations("Mock", "Spy");
            fail("Expected MockitoException");
        } catch (MockitoException e) {
            assertTrue(e.getMessage().contains("@Mock and @Spy"));
        }
    }

    // ---------- cannotInitializeForSpyAnnotation ----------

    @Test
    public void cannotInitializeForSpyAnnotation_throwsMockitoExceptionWithCause() {
        Exception details = new Exception("construction failed");
        try {
            reporter.cannotInitializeForSpyAnnotation("myField", details);
            fail("Expected MockitoException");
        } catch (MockitoException e) {
            assertTrue(e.getMessage().contains("Cannot instianate a @Spy for 'myField' field."));
            assertTrue(e.getMessage().contains("construction failed"));
            assertSame(details, e.getCause());
        }
    }

    // ---------- cannotInitializeForInjectMocksAnnotation ----------

    @Test
    public void cannotInitializeForInjectMocksAnnotation_throwsMockitoExceptionWithCause() {
        Exception details = new Exception("injection failed");
        try {
            reporter.cannotInitializeForInjectMocksAnnotation("myField", details);
            fail("Expected MockitoException");
        } catch (MockitoException e) {
            assertTrue(e.getMessage().contains("Cannot instianate @InjectMocks field named 'myField'."));
            assertTrue(e.getMessage().contains("injection failed"));
            assertSame(details, e.getCause());
        }
    }
}
