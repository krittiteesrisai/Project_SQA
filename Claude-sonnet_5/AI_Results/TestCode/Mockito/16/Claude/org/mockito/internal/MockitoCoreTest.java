package org.mockito.internal;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

import org.mockito.InOrder;
import org.mockito.MockSettings;
import org.mockito.exceptions.base.MockitoException; // assumption: base class for all reporter-thrown exceptions
import org.mockito.internal.creation.MockSettingsImpl;
import org.mockito.internal.invocation.Invocation;
import org.mockito.internal.progress.MockingProgress;
import org.mockito.internal.progress.ThreadSafeMockingProgress;
import org.mockito.internal.util.MockUtil;
import org.mockito.internal.verification.Times; // standard concrete VerificationMode impl in codebase
import org.mockito.internal.verification.api.VerificationMode;
import org.mockito.invocation.InvocationOnMock;
import org.mockito.stubbing.Answer;
import org.mockito.stubbing.DeprecatedOngoingStubbing;
import org.mockito.stubbing.OngoingStubbing;
import org.mockito.stubbing.Stubber;
import org.mockito.stubbing.VoidMethodStubbable;

import java.util.List;

public class MockitoCoreTest {

    private MockitoCore core;
    private MockUtil mockUtil;
    private MockingProgress progress;

    @Before
    public void setUp() {
        core = new MockitoCore();
        mockUtil = new MockUtil();
        progress = new ThreadSafeMockingProgress();
        // Force-clean thread-local mocking state leaked from previous tests
        progress.reset();
        progress.resetOngoingStubbing();
    }

    // ---------- mock() ----------

    @Test
    public void testMock_basic_createsValidMock() {
        List<String> mock = core.mock(List.class, new MockSettingsImpl());
        assertNotNull(mock);
        assertTrue(mockUtil.isMock(mock));
    }

    @Test
    public void testMock_withBooleanOverload_delegatesCorrectly() {
        Object mockTrue = core.mock(List.class, new MockSettingsImpl(), true);
        Object mockFalse = core.mock(List.class, new MockSettingsImpl(), false);
        assertNotNull(mockTrue);
        assertNotNull(mockFalse);
        assertTrue(mockUtil.isMock(mockTrue));
        assertTrue(mockUtil.isMock(mockFalse));
    }

    // ---------- when()/stub() ----------

    @Test
    public void testWhen_withPriorInvocation_returnsOngoingStubbing_andStubbingWorks() {
        List<String> mock = core.mock(List.class, new MockSettingsImpl());
        OngoingStubbing<String> stubbing = core.when(mock.get(0));
        assertNotNull(stubbing);
        stubbing.thenReturn("foo");
        assertEquals("foo", mock.get(0));
    }

    @Test
    public void testStub_withoutPriorInvocation_throwsException() {
        try {
            core.stub();
            fail("Expected exception due to missing method invocation");
        } catch (MockitoException e) {
            // expected - see note on Reporter assumption
        }
    }

    @Test
    public void testDeprecatedStub_withoutPriorInvocation_throwsException() {
        try {
            core.stub("dummy");
            fail("Expected exception due to missing method invocation");
        } catch (MockitoException e) {
            // expected
        }
    }

    @Test
    public void testDeprecatedStub_withValidInvocation_returnsStubbing() {
        List<String> mock = core.mock(List.class, new MockSettingsImpl());
        DeprecatedOngoingStubbing<String> stubbing = core.stub(mock.get(0));
        assertNotNull(stubbing);
        stubbing.thenReturn("x");
        assertEquals("x", mock.get(0));
    }

    // ---------- verify() ----------

    @Test
    public void testVerify_withNullMock_throwsException() {
        try {
            core.verify(null, new Times(1));
            fail("Expected exception for null mock");
        } catch (MockitoException e) {
            // expected
        }
    }

    @Test
    public void testVerify_withNonMockObject_throwsException() {
        try {
            core.verify(new Object(), new Times(1));
            fail("Expected exception for non-mock object");
        } catch (MockitoException e) {
            // expected
        }
    }

    @Test
    public void testVerify_withValidMock_returnsSameMockInstance() {
        List<String> mock = core.mock(List.class, new MockSettingsImpl());
        Object result = core.verify(mock, new Times(1));
        assertSame(mock, result);
    }

    // ---------- reset() ----------

    @Test
    public void testReset_withValidMock_doesNotThrow() {
        List<String> mock = core.mock(List.class, new MockSettingsImpl());
        core.reset(mock);
        assertTrue(mockUtil.isMock(mock)); // still a mock after reset
    }

    @Test
    public void testReset_withNoMocks_doesNotThrow() {
        core.reset(); // empty varargs -> loop body never executes
    }

    // ---------- verifyNoMoreInteractions() ----------

    @Test
    public void testVerifyNoMoreInteractions_withEmptyArray_throwsException() {
        try {
            core.verifyNoMoreInteractions();
            fail("Expected exception for empty mocks array");
        } catch (MockitoException e) {
            // expected
        }
    }

    @Test
    public void testVerifyNoMoreInteractions_withNullArray_throwsException() {
        try {
            core.verifyNoMoreInteractions((Object[]) null);
            fail("Expected exception for null mocks array");
        } catch (MockitoException e) {
            // expected
        }
    }

    @Test
    public void testVerifyNoMoreInteractions_withNullElement_throwsException() {
        try {
            core.verifyNoMoreInteractions(new Object[]{null});
            fail("Expected exception for null element in mocks array");
        } catch (MockitoException e) {
            // expected
        }
    }

    @Test
    public void testVerifyNoMoreInteractions_withNonMockElement_throwsException() {
        try {
            core.verifyNoMoreInteractions(new Object());
            fail("Expected exception for non-mock element");
        } catch (MockitoException e) {
            // expected
        }
    }

    @Test
    public void testVerifyNoMoreInteractions_withValidMock_doesNotThrow() {
        List<String> mock = core.mock(List.class, new MockSettingsImpl());
        core.verifyNoMoreInteractions(mock); // zero interactions -> should pass
    }

    // ---------- inOrder() ----------

    @Test
    public void testInOrder_withEmptyArray_throwsException() {
        try {
            core.inOrder();
            fail("Expected exception for empty mocks array");
        } catch (MockitoException e) {
            // expected
        }
    }

    @Test
    public void testInOrder_withNullArray_throwsException() {
        try {
            core.inOrder((Object[]) null);
            fail("Expected exception for null mocks array");
        } catch (MockitoException e) {
            // expected
        }
    }

    @Test
    public void testInOrder_withNullElement_throwsException() {
        try {
            core.inOrder(new Object[]{null});
            fail("Expected exception for null element");
        } catch (MockitoException e) {
            // expected
        }
    }

    @Test
    public void testInOrder_withNonMockElement_throwsException() {
        try {
            core.inOrder(new Object());
            fail("Expected exception for non-mock element");
        } catch (MockitoException e) {
            // expected
        }
    }

    @Test
    public void testInOrder_withValidMocks_returnsInOrderImpl() {
        List<String> mock1 = core.mock(List.class, new MockSettingsImpl());
        List<String> mock2 = core.mock(List.class, new MockSettingsImpl());
        InOrder inOrder = core.inOrder(mock1, mock2);
        assertNotNull(inOrder);
        assertTrue(inOrder instanceof InOrderImpl);
    }

    // ---------- doAnswer() ----------

    @Test
    public void testDoAnswer_returnsStubberImpl() {
        Answer<Object> answer = new Answer<Object>() {
            public Object answer(InvocationOnMock invocation) {
                return null;
            }
        };
        Stubber stubber = core.doAnswer(answer);
        assertNotNull(stubber);
        assertTrue(stubber instanceof StubberImpl);
    }

    // ---------- stubVoid() ----------

    @Test
    public void testStubVoid_withValidMock_returnsVoidMethodStubbable() {
        List<String> mock = core.mock(List.class, new MockSettingsImpl());
        VoidMethodStubbable<List<String>> stubbable = core.stubVoid(mock);
        assertNotNull(stubbable);
    }

    // ---------- validateMockitoUsage() ----------

    @Test
    public void testValidateMockitoUsage_withCleanState_doesNotThrow() {
        core.validateMockitoUsage(); // state cleaned in @Before, should not throw
    }

    // ---------- getLastInvocation() ----------

    @Test
    public void testGetLastInvocation_withPriorInvocation_returnsInvocation() {
        List<String> mock = core.mock(List.class, new MockSettingsImpl());
        mock.get(5);
        Invocation invocation = core.getLastInvocation();
        assertNotNull(invocation);
        assertEquals("get", invocation.getMethod().getName());
        assertArrayEquals(new Object[]{5}, invocation.getArguments());
    }

    @Test(expected = NullPointerException.class)
    public void testGetLastInvocation_withoutOngoingStubbing_throwsNPE() {
        // Fault-detection case: source code casts pullOngoingStubbing() result
        // without null-check, so calling getLastInvocation() with no pending
        // ongoing stubbing will throw NPE when calling getRegisteredInvocations()
        // on a null reference. This follows directly from the given source logic.
        core.getLastInvocation();
    }
}
