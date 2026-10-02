package org.mockito;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.junit.Test;

import org.mockito.exceptions.verification.WantedButNotInvoked;
import org.mockito.exceptions.verification.TooLittleActualInvocations;
import org.mockito.exceptions.verification.NoInteractionsWanted;
import org.mockito.exceptions.verification.VerificationInOrderFailure;
import org.mockito.invocation.InvocationOnMock;
import org.mockito.stubbing.Answer;

/**
 * JUnit4 test suite for org.mockito.Mockito facade class.
 * หมายเหตุ: Mockito class เป็น facade ที่ delegate เกือบทั้งหมดไปยัง MockitoCore/Factory
 * ดังนั้น branch ที่ทดสอบได้ส่วนใหญ่คือ "เส้นทาง behavior" ที่ document ไว้ใน Javadoc
 * สำหรับ exception type ภายในที่ไม่ปรากฏในซอร์สที่ให้มา จะ catch แบบ generic (RuntimeException)
 * และคอมเมนต์กำกับไว้ว่าไม่ได้ assert exact behavior ที่ไม่มีหลักฐานในซอร์ส
 */
public class MockitoTest {

    // ใช้ interface ภายในสำหรับทดสอบ RETURNS_SMART_NULLS / RETURNS_MOCKS
    interface Foo {
        Bar getBar();
    }

    interface Bar {
        void doSomething();
    }

    // ---------- 1. mock(Class) ----------

    @Test
    public void testMock_basicCreation_notNull_andDefaultAnswer() {
        List<String> mockList = mock(List.class);
        assertNotNull(mockList);
        // unstubbed get() ควรคืนค่า default (null) ตาม RETURNS_DEFAULTS
        assertNull(mockList.get(0));
        // unstubbed size() ควรคืน 0 (primitive default)
        assertEquals(0, mockList.size());
    }

    @Test
    public void testMock_nullClass_throwsSomeException() {
        // พฤติกรรมภายในไม่ได้ระบุ exact exception type ในซอร์สที่ให้มา
        // จึง assert แบบ generic ว่าต้องมี exception เกิดขึ้น
        try {
            mock((Class<?>) null);
            fail("expected an exception when classToMock is null");
        } catch (RuntimeException e) {
            assertNotNull(e);
        }
    }

    // ---------- 2. mock(Class, String) ----------

    @Test
    public void testMock_withName_usedInFailureMessage() {
        List<String> namedMock = mock(List.class, "myNamedMock");
        try {
            verify(namedMock).add("x");
            fail("expected WantedButNotInvoked");
        } catch (WantedButNotInvoked e) {
            assertTrue(e.getMessage().contains("myNamedMock"));
        }
    }

    // ---------- 3. mock(Class, Answer) - RETURNS_SMART_NULLS ----------

    @Test
    public void testMock_withAnswer_returnsSmartNulls_notPlainNull() {
        Foo foo = mock(Foo.class, Mockito.RETURNS_SMART_NULLS);
        Bar bar = foo.getBar();
        // ตาม Javadoc: ReturnsSmartNulls คืน SmartNull แทน null สำหรับ object ที่ mock ได้
        assertNotNull(bar);
        // เรียกใช้ bar ต่อ ควร throw exception (ไม่ใช่ NPE ปกติ) ตาม Javadoc
        // ไม่ทราบชื่อ exception class แน่ชัดจากซอร์สที่ให้มา จึง catch แบบกว้าง
        try {
            bar.doSomething();
            fail("expected an exception when using SmartNull");
        } catch (RuntimeException e) {
            assertNotNull(e.getMessage());
        }
    }

    // ---------- 4. mock(Class, Answer) - RETURNS_MOCKS ----------

    @Test
    public void testMock_withAnswer_returnsMocks_notNull() {
        Foo foo = mock(Foo.class, Mockito.RETURNS_MOCKS);
        Bar bar = foo.getBar();
        assertNotNull(bar);
        // bar เป็น mock เอง เรียก method ที่ไม่ได้ stub ไม่ควร throw
        bar.doSomething();
    }

    // ---------- 5. mock(Class, Answer) - CALLS_REAL_METHODS ----------

    @Test
    public void testMock_withAnswer_callsRealMethods() {
        @SuppressWarnings("unchecked")
        ArrayList<String> realList = mock(ArrayList.class, Mockito.CALLS_REAL_METHODS);
        realList.add("foo");
        assertEquals(1, realList.size());
        assertEquals("foo", realList.get(0));
    }

    // ---------- 6. mock(Class, MockSettings) ----------

    @Test
    public void testMock_withMockSettings_nameAndDefaultAnswer() {
        List<String> settingsMock = mock(List.class, withSettings()
                .name("settingsMock")
                .defaultAnswer(Mockito.RETURNS_SMART_NULLS));
        assertNotNull(settingsMock);
        try {
            verify(settingsMock).add("x");
            fail("expected WantedButNotInvoked");
        } catch (WantedButNotInvoked e) {
            assertTrue(e.getMessage().contains("settingsMock"));
        }
    }

    // ---------- 7. spy(Object) ----------

    @Test
    public void testSpy_realMethodsCalled_unlessStubbed() {
        List<String> list = new LinkedList<String>();
        List<String> spy = spy(list);

        spy.add("one");
        spy.add("two");

        assertEquals("one", spy.get(0));
        verify(spy).add("one");
        verify(spy).add("two");
    }

    @Test
    public void testSpy_doReturn_forStubbingIndexOutOfBoundsCase() {
        List<String> list = new LinkedList<String>();
        List<String> spy = spy(list);

        // when(spy.get(0)) จะ throw IndexOutOfBoundsException เพราะ list ว่าง (ตาม Javadoc)
        // จึงต้องใช้ doReturn() แทน
        doReturn("foo").when(spy).get(0);
        assertEquals("foo", spy.get(0));
    }

    // ---------- 8. when(...) + thenReturn / thenThrow ----------

    @Test
    public void testWhen_thenReturn_basicStubbing() {
        List<String> mockList = mock(List.class);
        when(mockList.get(0)).thenReturn("first");
        assertEquals("first", mockList.get(0));
        // ไม่ได้ stub -> คืนค่า default
        assertNull(mockList.get(999));
    }

    @Test
    public void testWhen_thenThrow_stubbing() {
        List<String> mockList = mock(List.class);
        when(mockList.get(1)).thenThrow(new RuntimeException("boom"));
        try {
            mockList.get(1);
            fail("expected RuntimeException");
        } catch (RuntimeException e) {
            assertEquals("boom", e.getMessage());
        }
    }

    @Test
    public void testWhen_consecutiveStubbing_lastWins() {
        List<String> mockList = mock(List.class);
        when(mockList.get(0))
                .thenReturn("one", "two", "three");

        assertEquals("one", mockList.get(0));
        assertEquals("two", mockList.get(0));
        assertEquals("three", mockList.get(0));
        // call ต่อไปควรคงค่าสุดท้าย
        assertEquals("three", mockList.get(0));
    }

    // ---------- 9. verify(mock) : success / failure ----------

    @Test
    public void testVerify_singleArg_success() {
        List<String> mockList = mock(List.class);
        mockList.add("once");
        verify(mockList).add("once");
    }

    @Test
    public void testVerify_singleArg_failure_whenNeverCalled() {
        List<String> mockList = mock(List.class);
        try {
            verify(mockList).add("never happened");
            fail("expected WantedButNotInvoked");
        } catch (WantedButNotInvoked e) {
            assertNotNull(e.getMessage());
        }
    }

    // ---------- 10. verify(mock, mode) : times / never / atLeastOnce / atLeast / atMost ----------

    @Test
    public void testVerify_times_exactCount() {
        List<String> mockList = mock(List.class);
        mockList.add("twice");
        mockList.add("twice");
        verify(mockList, times(2)).add("twice");
    }

    @Test
    public void testVerify_times_boundary_zeroEqualsNever() {
        List<String> mockList = mock(List.class);
        // ไม่เรียกเลย
        verify(mockList, times(0)).add("x");
        verify(mockList, never()).add("x"); // never() เป็น alias ของ times(0)
    }

    @Test
    public void testVerify_times_failure_tooFewInvocations() {
        List<String> mockList = mock(List.class);
        mockList.add("x");
        mockList.add("x");
        try {
            verify(mockList, times(5)).add("x");
            fail("expected TooLittleActualInvocations");
        } catch (TooLittleActualInvocations e) {
            assertNotNull(e.getMessage());
        }
    }

    @Test
    public void testVerify_atLeastOnce_success() {
        List<String> mockList = mock(List.class);
        mockList.add("three times");
        mockList.add("three times");
        mockList.add("three times");
        verify(mockList, atLeastOnce()).add("three times");
    }

    @Test
    public void testVerify_atLeast_boundary() {
        List<String> mockList = mock(List.class);
        mockList.add("x");
        mockList.add("x");
        verify(mockList, atLeast(2)).add("x"); // boundary: exactly minimum
    }

    @Test
    public void testVerify_atMost_boundary() {
        List<String> mockList = mock(List.class);
        mockList.add("x");
        mockList.add("x");
        mockList.add("x");
        verify(mockList, atMost(3)).add("x"); // boundary: exactly maximum, ไม่ควร throw
        verify(mockList, atMost(5)).add("x"); // ยังผ่านเมื่อ limit สูงกว่าจำนวนจริง
    }

    @Test
    public void testVerify_only_success() {
        List<String> mockList = mock(List.class);
        mockList.add("only");
        verify(mockList, only()).add("only");
    }

    @Test
    public void testVerify_only_failure_whenOtherInteractionExists() {
        List<String> mockList = mock(List.class);
        mockList.add("only");
        mockList.clear(); // interaction อื่นที่ไม่เกี่ยว

        // ไม่ทราบ exact exception class จาก only() เมื่อ fail (ซอร์สไม่ระบุรายละเอียด)
        // จึง catch แบบกว้างและยืนยันว่ามี exception เกิดขึ้นจริง
        try {
            verify(mockList, only()).add("only");
            fail("expected a verification failure exception");
        } catch (RuntimeException e) {
            assertNotNull(e.getMessage());
        }
    }

    // ---------- 11. reset(mocks) ----------

    @Test
    public void testReset_forgetsStubbingAndInteractions() {
        List<String> mockList = mock(List.class);
        when(mockList.size()).thenReturn(10);
        mockList.add("x");

        assertEquals(10, mockList.size());

        reset(mockList);

        // หลัง reset ควรกลับไปเป็น default behavior
        assertEquals(0, mockList.size());
        // และไม่มี interaction ก่อนหน้าที่ verify ได้แล้ว
        try {
            verify(mockList).add("x");
            fail("expected WantedButNotInvoked after reset");
        } catch (WantedButNotInvoked e) {
            assertNotNull(e.getMessage());
        }
    }

    @Test
    public void testReset_emptyVarargs_noException() {
        // boundary: varargs ว่าง ไม่ควร throw
        reset();
    }

    // ---------- 12. verifyNoMoreInteractions / verifyZeroInteractions ----------

    @Test
    public void testVerifyNoMoreInteractions_failsWithUnexpectedInteraction() {
        List<String> mockList = mock(List.class);
        mockList.add("one");
        mockList.add("two"); // ยังไม่ verify

        verify(mockList).add("one");
        try {
            verifyNoMoreInteractions(mockList);
            fail("expected NoInteractionsWanted");
        } catch (NoInteractionsWanted e) {
            assertNotNull(e.getMessage());
        }
    }

    @Test
    public void testVerifyNoMoreInteractions_passesWhenAllVerified() {
        List<String> mockList = mock(List.class);
        mockList.add("one");
        verify(mockList).add("one");
        verifyNoMoreInteractions(mockList); // ไม่ควร throw
    }

    @Test
    public void testVerifyZeroInteractions_passesWhenNoInteraction() {
        List<String> mockOne = mock(List.class);
        List<String> mockTwo = mock(List.class);
        verifyZeroInteractions(mockOne, mockTwo); // ไม่มี interaction ใด ๆ ควรผ่าน
    }

    @Test
    public void testVerifyZeroInteractions_failsWhenInteractionExists() {
        List<String> mockOne = mock(List.class);
        mockOne.add("one");
        try {
            verifyZeroInteractions(mockOne);
            fail("expected NoInteractionsWanted");
        } catch (NoInteractionsWanted e) {
            assertNotNull(e.getMessage());
        }
    }

    @Test
    public void testVerifyZeroInteractions_emptyVarargs_noException() {
        // boundary: varargs ว่าง
        verifyZeroInteractions();
    }

    // ---------- 13. doThrow / doAnswer / doNothing / doReturn / doCallRealMethod ----------

    @Test
    public void testDoThrow_voidMethodStubbing() {
        List<String> mockList = mock(List.class);
        doThrow(new RuntimeException("boom")).when(mockList).clear();
        try {
            mockList.clear();
            fail("expected RuntimeException");
        } catch (RuntimeException e) {
            assertEquals("boom", e.getMessage());
        }
    }

    @Test
    public void testDoAnswer_customAnswer() {
        List<String> mockList = mock(List.class);
        doAnswer(new Answer<Object>() {
            public Object answer(InvocationOnMock invocation) {
                return "answered";
            }
        }).when(mockList).get(0);

        assertEquals("answered", mockList.get(0));
    }

    @Test
    public void testDoNothing_onSpy_voidMethodDoesNothing() {
        List<String> list = new LinkedList<String>();
        list.add("one");
        List<String> spy = spy(list);

        doNothing().when(spy).clear();
        spy.clear();

        // clear() ถูก stub ให้ไม่ทำอะไร -> list ยังมี "one" อยู่
        assertEquals(1, spy.size());
    }

    @Test
    public void testDoReturn_stubbing() {
        List<String> mockList = mock(List.class);
        doReturn("bar").when(mockList).get(0);
        assertEquals("bar", mockList.get(0));
    }

    @Test
    public void testDoCallRealMethod_onConcreteClassMock() {
        @SuppressWarnings("unchecked")
        ArrayList<String> mockArr = mock(ArrayList.class);
        doCallRealMethod().when(mockArr).add("real");

        boolean added = mockArr.add("real");
        // real ArrayList.add() คืนค่า true เมื่อสำเร็จ
        assertTrue(added);
    }

    // ---------- 14. inOrder(mocks) ----------

    @Test
    public void testInOrder_verifyCorrectOrder_success() {
        List<String> firstMock = mock(List.class);
        List<String> secondMock = mock(List.class);

        firstMock.add("was called first");
        secondMock.add("was called second");

        InOrder inOrder = inOrder(firstMock, secondMock);
        inOrder.verify(firstMock).add("was called first");
        inOrder.verify(secondMock).add("was called second");
    }

    @Test
    public void testInOrder_verifyWrongOrder_failure() {
        List<String> firstMock = mock(List.class);
        List<String> secondMock = mock(List.class);

        firstMock.add("first");
        secondMock.add("second");

        InOrder inOrder = inOrder(firstMock, secondMock);
        try {
            inOrder.verify(secondMock).add("second");
            inOrder.verify(firstMock).add("first");
            fail("expected VerificationInOrderFailure");
        } catch (VerificationInOrderFailure e) {
            assertNotNull(e.getMessage());
        }
    }

    // ---------- 15. times / never / atLeastOnce / atLeast / atMost / only (return type sanity) ----------

    @Test
    public void testVerificationModeFactoryMethods_returnNonNull() {
        assertNotNull(times(1));
        assertNotNull(never());
        assertNotNull(atLeastOnce());
        assertNotNull(atLeast(1));
        assertNotNull(atMost(1));
        assertNotNull(only());
    }

    // ---------- 16. withSettings() ----------

    @Test
    public void testWithSettings_notNull_andUsableForMock() {
        MockSettings settings = withSettings();
        assertNotNull(settings);
        List<String> mockList = mock(List.class, settings);
        assertNotNull(mockList);
    }

    // ---------- 17. validateMockitoUsage() ----------

    @Test
    public void testValidateMockitoUsage_noExceptionOnCorrectUsage() {
        List<String> mockList = mock(List.class);
        mockList.add("x");
        verify(mockList).add("x");
        // เมื่อใช้งานถูกต้อง ไม่ควร throw
        validateMockitoUsage();
    }

    // ---------- 18. debug() ----------

    @Test
    public void testDebug_returnsNonNullDebugger() {
        MockitoDebugger debugger = debug();
        assertNotNull(debugger);
    }

    // ---------- 19. Deprecated stub(T) ----------

    @SuppressWarnings("deprecation")
    @Test
    public void testDeprecatedStub_basicUsage() {
        List<String> mockList = mock(List.class);
        stub(mockList.size()).toReturn(5);
        assertEquals(5, mockList.size());
    }

    // ---------- 20. Deprecated stubVoid(T) ----------

    @SuppressWarnings("deprecation")
    @Test
    public void testDeprecatedStubVoid_throwsException() {
        List<String> mockList = mock(List.class);
        stubVoid(mockList).toThrow(new RuntimeException("legacy")).on().clear();
        try {
            mockList.clear();
            fail("expected RuntimeException");
        } catch (RuntimeException e) {
            assertEquals("legacy", e.getMessage());
        }
    }
}
