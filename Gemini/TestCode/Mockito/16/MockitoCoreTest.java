package org.mockito.internal;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InOrder;
import org.mockito.exceptions.base.MockitoException;
import org.mockito.exceptions.misusing.NotAMockException;
import org.mockito.exceptions.misusing.NullInsteadOfMockException;
import org.mockito.internal.creation.MockSettingsImpl;
import org.mockito.internal.invocation.Invocation;
import org.mockito.internal.verification.VerificationModeFactory;
import org.mockito.stubbing.Answer;
import org.mockito.stubbing.VoidMethodStubbable;

import java.util.List;

import static org.junit.Assert.*;

public class MockitoCoreTest {

    private MockitoCore mockitoCore;

    @Before
    public void setUp() {
        mockitoCore = new MockitoCore();
    }

    @After
    public void tearDown() {
        // ทำความสะอาด Mocking Progress เพื่อไม่ให้ State ค้างไปกระทบ Test อื่น
        try {
            mockitoCore.validateMockitoUsage();
        } catch (MockitoException ignored) {
            new MockitoCore().reset();
        }
    }

    // --- mock() tests ---

    @Test
    public void testMock_SuccessfulCreation() {
        List<?> mockList = mockitoCore.mock(List.class, new MockSettingsImpl());
        assertNotNull(mockList);
        assertTrue(new org.mockito.internal.util.MockUtil().isMock(mockList));
    }

    @Test
    public void testMock_WithThreeArguments() {
        List<?> mockList = mockitoCore.mock(List.class, new MockSettingsImpl(), true);
        assertNotNull(mockList);
        assertTrue(new org.mockito.internal.util.MockUtil().isMock(mockList));
    }

    // --- stub() / when() tests ---

    @Test(expected = MockitoException.class)
    public void testStub_NullOngoingStubbing_ThrowsException() {
        // เมื่อไม่ได้เรียก method บน mock ก่อน การเรียก stub() ต้องโยน Exception
        mockitoCore.stub();
    }

    @Test(expected = MockitoException.class)
    public void testWhen_WithoutMethodCall_ThrowsException() {
        mockitoCore.when("dummy");
    }

    @Test(expected = MockitoException.class)
    @SuppressWarnings("deprecation")
    public void testDeprecatedStub_WithoutMethodCall_ThrowsException() {
        mockitoCore.stub("dummy");
    }

    @Test
    public void testWhen_WithMethodCall_Success() {
        List mockList = mockitoCore.mock(List.class, new MockSettingsImpl());
        mockList.get(0); // สร้าง OngoingStubbing
        assertNotNull(mockitoCore.when(mockList.get(0)));
    }

    // --- verify() tests ---

    @Test(expected = NullInsteadOfMockException.class)
    public void testVerify_NullMock_ThrowsException() {
        mockitoCore.verify(null, VerificationModeFactory.times(1));
    }

    @Test(expected = NotAMockException.class)
    public void testVerify_NotAMock_ThrowsException() {
        mockitoCore.verify("not a mock object", VerificationModeFactory.times(1));
    }

    @Test
    public void testVerify_ValidMock_ReturnsMock() {
        List<?> mockList = mockitoCore.mock(List.class, new MockSettingsImpl());
        List<?> returnedMock = mockitoCore.verify(mockList, VerificationModeFactory.times(1));
        assertSame(mockList, returnedMock);
    }

    // --- reset() tests ---

    @Test
    public void testReset_ValidMocksAndEmpty() {
        List<?> mockList1 = mockitoCore.mock(List.class, new MockSettingsImpl());
        List<?> mockList2 = mockitoCore.mock(List.class, new MockSettingsImpl());
        
        mockitoCore.reset(); // empty varargs
        mockitoCore.reset(mockList1, mockList2);
    }

    @Test(expected = NotAMockException.class)
    public void testReset_NonMock_ThrowsException() {
        mockitoCore.reset("non mock");
    }

    // --- verifyNoMoreInteractions() tests ---

    @Test(expected = MockitoException.class)
    public void testVerifyNoMoreInteractions_NullArray_ThrowsException() {
        mockitoCore.verifyNoMoreInteractions((Object[]) null);
    }

    @Test(expected = MockitoException.class)
    public void testVerifyNoMoreInteractions_EmptyArray_ThrowsException() {
        mockitoCore.verifyNoMoreInteractions(new Object[0]);
    }

    @Test(expected = NullInsteadOfMockException.class)
    public void testVerifyNoMoreInteractions_ContainsNull_ThrowsException() {
        mockitoCore.verifyNoMoreInteractions(new Object[]{null});
    }

    @Test(expected = NotAMockException.class)
    public void testVerifyNoMoreInteractions_NotAMock_ThrowsException() {
        mockitoCore.verifyNoMoreInteractions("string object");
    }

    @Test
    public void testVerifyNoMoreInteractions_ValidMock_Success() {
        List<?> mockList = mockitoCore.mock(List.class, new MockSettingsImpl());
        mockitoCore.verifyNoMoreInteractions(mockList);
    }

    // --- inOrder() tests ---

    @Test(expected = MockitoException.class)
    public void testInOrder_NullArray_ThrowsException() {
        mockitoCore.inOrder((Object[]) null);
    }

    @Test(expected = MockitoException.class)
    public void testInOrder_EmptyArray_ThrowsException() {
        mockitoCore.inOrder(new Object[0]);
    }

    @Test(expected = NullInsteadOfMockException.class)
    public void testInOrder_ContainsNull_ThrowsException() {
        mockitoCore.inOrder(new Object[]{null});
    }

    @Test(expected = NotAMockException.class)
    public void testInOrder_NotAMock_ThrowsException() {
        mockitoCore.inOrder("not a mock");
    }

    @Test
    public void testInOrder_ValidMock_Success() {
        List<?> mockList = mockitoCore.mock(List.class, new MockSettingsImpl());
        InOrder inOrder = mockitoCore.inOrder(mockList);
        assertNotNull(inOrder);
    }

    // --- doAnswer() / stubVoid() / validateMockitoUsage() / getLastInvocation() ---

    @Test
    public void testDoAnswer_Success() {
        Answer<String> answer = invocation -> "answer";
        assertNotNull(mockitoCore.doAnswer(answer));
    }

    @Test
    public void testStubVoid_ValidMock_Success() {
        List<?> mockList = mockitoCore.mock(List.class, new MockSettingsImpl());
        VoidMethodStubbable<?> stubbable = mockitoCore.stubVoid(mockList);
        assertNotNull(stubbable);
    }

    @Test(expected = NotAMockException.class)
    public void testStubVoid_NonMock_ThrowsException() {
        mockitoCore.stubVoid("non mock string");
    }

    @Test
    public void testValidateMockitoUsage_NormalState() {
        mockitoCore.validateMockitoUsage();
    }

    @Test
    public void testGetLastInvocation_AfterInvocation() {
        List mockList = mockitoCore.mock(List.class, new MockSettingsImpl());
        mockList.add("test");
        Invocation lastInvocation = mockitoCore.getLastInvocation();
        assertNotNull(lastInvocation);
        assertEquals("add", lastInvocation.getMethod().getName());
    }
}