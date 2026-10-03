package org.mockito.internal;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InOrder;
import org.mockito.exceptions.misusing.MissingMethodInvocationException;
import org.mockito.exceptions.misusing.NotAMockException;
import org.mockito.exceptions.misusing.NullPassedToVerifyException;
import org.mockito.exceptions.misusing.UnfinishedVerificationException;
import org.mockito.exceptions.base.MockitoException;
import org.mockito.internal.creation.MockSettingsImpl;
import org.mockito.internal.progress.ThreadSafeMockingProgress;
import org.mockito.internal.verification.VerificationModeFactory;
import org.mockito.internal.verification.api.InOrderContext;
import org.mockito.stubbing.Answer;
import org.mockito.stubbing.Stubber;
import org.mockito.stubbing.VoidMethodStubbable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.*;

public class MockitoCoreTest {

    private MockitoCore mockitoCore;

    @Before
    public void setUp() {
        mockitoCore = new MockitoCore();
        new ThreadSafeMockingProgress().reset();
    }

    @After
    public void tearDown() {
        new ThreadSafeMockingProgress().reset();
    }

    @Test
    public void testMockCreationSuccessful() {
        List<?> mockList = mockitoCore.mock(List.class, new MockSettingsImpl());
        assertNotNull(mockList);
    }

    @Test(expected = MissingMethodInvocationException.class)
    public void testStubThrowsExceptionWhenNoMethodCall() {
        mockitoCore.stub();
    }

    @Test(expected = MissingMethodInvocationException.class)
    public void testWhenThrowsExceptionWhenNoMethodCall() {
        mockitoCore.when("nonMockString");
    }

    @Test(expected = MissingMethodInvocationException.class)
    public void testDeprecatedStubThrowsExceptionWhenNoMethodCall() {
        mockitoCore.stub("nonMockString");
    }

    @Test(expected = NullPassedToVerifyException.class)
    public void testVerifyWithNullMock() {
        mockitoCore.verify(null, VerificationModeFactory.times(1));
    }

    @Test(expected = NotAMockException.class)
    public void testVerifyWithNonMockObject() {
        mockitoCore.verify("notAMock", VerificationModeFactory.times(1));
    }

    @Test
    public void testVerifyWithValidMock() {
        List<?> mockList = mockitoCore.mock(List.class, new MockSettingsImpl());
        List<?> returned = mockitoCore.verify(mockList, VerificationModeFactory.times(1));
        assertSame(mockList, returned);
    }

    @Test
    public void testResetWithMocks() {
        List<?> mock1 = mockitoCore.mock(List.class, new MockSettingsImpl());
        List<?> mock2 = mockitoCore.mock(List.class, new MockSettingsImpl());
        mockitoCore.reset(mock1, mock2);
    }

    @Test(expected = MockitoException.class)
    public void testVerifyNoMoreInteractionsWithNullArray() {
        mockitoCore.verifyNoMoreInteractions((Object[]) null);
    }

    @Test(expected = MockitoException.class)
    public void testVerifyNoMoreInteractionsWithEmptyArray() {
        mockitoCore.verifyNoMoreInteractions(new Object[0]);
    }

    @Test(expected = NullPassedToVerifyException.class)
    public void testVerifyNoMoreInteractionsWithNullElement() {
        mockitoCore.verifyNoMoreInteractions(new Object[]{null});
    }

    @Test(expected = NotAMockException.class)
    public void testVerifyNoMoreInteractionsWithNonMock() {
        mockitoCore.verifyNoMoreInteractions("notAMock");
    }

    @Test
    public void testVerifyNoMoreInteractionsWithValidMock() {
        List<?> mockList = mockitoCore.mock(List.class, new MockSettingsImpl());
        mockitoCore.verifyNoMoreInteractions(mockList);
    }

    @Test
    public void testVerifyNoMoreInteractionsInOrder() {
        List<?> mockList = mockitoCore.mock(List.class, new MockSettingsImpl());
        InOrderContext context = new InOrderContext() {
            @Override
            public boolean isVerified(org.mockito.internal.invocation.Invocation invocation) {
                return false;
            }
            @Override
            public void markVerified(org.mockito.internal.invocation.Invocation invocation) {
            }
        };
        mockitoCore.verifyNoMoreInteractionsInOrder(Collections.<Object>singletonList(mockList), context);
    }

    @Test(expected = MockitoException.class)
    public void testInOrderWithNullArray() {
        mockitoCore.inOrder((Object[]) null);
    }

    @Test(expected = MockitoException.class)
    public void testInOrderWithEmptyArray() {
        mockitoCore.inOrder(new Object[0]);
    }

    @Test(expected = NullPassedToVerifyException.class)
    public void testInOrderWithNullElement() {
        mockitoCore.inOrder(new Object[]{null});
    }

    @Test(expected = NotAMockException.class)
    public void testInOrderWithNonMockElement() {
        mockitoCore.inOrder("notAMock");
    }

    @Test
    public void testInOrderWithValidMocks() {
        List<?> mock1 = mockitoCore.mock(List.class, new MockSettingsImpl());
        List<?> mock2 = mockitoCore.mock(List.class, new MockSettingsImpl());
        InOrder inOrder = mockitoCore.inOrder(mock1, mock2);
        assertNotNull(inOrder);
    }

    @Test
    public void testDoAnswerReturnsStubber() {
        Answer<?> dummyAnswer = new Answer<Object>() {
            @Override
            public Object answer(org.mockito.invocation.InvocationOnMock invocation) {
                return null;
            }
        };
        Stubber stubber = mockitoCore.doAnswer(dummyAnswer);
        assertNotNull(stubber);
    }

    @Test
    public void testStubVoid() {
        List<?> mockList = mockitoCore.mock(List.class, new MockSettingsImpl());
        VoidMethodStubbable<?> voidStubbable = mockitoCore.stubVoid(mockList);
        assertNotNull(voidStubbable);
    }

    @Test(expected = NotAMockException.class)
    public void testStubVoidWithNonMock() {
        mockitoCore.stubVoid("notAMock");
    }

    @Test
    public void testValidateMockitoUsageWhenClean() {
        mockitoCore.validateMockitoUsage();
    }

    @Test(expected = UnfinishedVerificationException.class)
    public void testValidateMockitoUsageWhenUnfinishedVerification() {
        List<?> mockList = mockitoCore.mock(List.class, new MockSettingsImpl());
        mockitoCore.verify(mockList, VerificationModeFactory.times(1));
        // State remains in verification mode without actually invoking method on mock
        mockitoCore.validateMockitoUsage();
    }
}