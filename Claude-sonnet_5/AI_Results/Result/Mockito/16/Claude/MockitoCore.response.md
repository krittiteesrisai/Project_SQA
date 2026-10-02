# MockitoCoreTest.java

หมายเหตุสำคัญก่อนเริ่ม:
- `MockitoCore` ใช้ `ThreadSafeMockingProgress` ซึ่งอิงกับ `ThreadLocal` singleton ภายใน ดังนั้น state (เช่น ongoing stubbing / verification mode) จะ**ค้างข้ามเทสในเธรดเดียวกัน** ผมจึงเรียก `reset()`/`resetOngoingStubbing()` ตรงใน `@Before` เพื่อบังคับล้าง state ก่อนทุกเทส (ใช้เมธอดที่ประกาศอยู่ใน interface `MockingProgress` ที่ import อยู่แล้วในซอร์สต้นฉบับ ไม่ใช่การเดา)
- Reporter class ไม่ได้แสดงซอร์สมาให้ จึงสมมติ (ตามโครงสร้างมาตรฐานของ Mockito framework) ว่าทุก exception ที่ reporter โยนจะเป็น subclass ของ `org.mockito.exceptions.base.MockitoException` — คอมเมนต์กำกับไว้ในโค้ด
- `Times` เป็นคลาสมาตรฐานที่ implement `VerificationMode` ใช้แทนการเดา signature ของ interface เอง

```java
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
```

---

# สรุปตาราง Test Case กับ Branch/Condition ที่ครอบคลุม

| Test Method | Branch/Condition ที่ครอบคลุม |
|---|---|
| testMock_basic_createsValidMock | `mock(Class, MockSettings)` - ทำงานปกติ |
| testMock_withBooleanOverload_delegatesCorrectly | `mock(Class, MockSettings, boolean)` ทั้ง true/false (delegation) |
| testWhen_withPriorInvocation_returnsOngoingStubbing_andStubbingWorks | `when()` → `stub()`: branch `stubbing != null` (false ของ if) |
| testStub_withoutPriorInvocation_throwsException | `stub()`: branch `stubbing == null` (true) → reset()+missingMethodInvocation() |
| testDeprecatedStub_withoutPriorInvocation_throwsException | `stub(T)` deprecated → null branch เดียวกัน |
| testDeprecatedStub_withValidInvocation_returnsStubbing | `stub(T)` deprecated → non-null branch |
| testVerify_withNullMock_throwsException | `verify()`: branch `mock == null` (true) |
| testVerify_withNonMockObject_throwsException | `verify()`: branch `mock==null`(false) && `!isMock`(true) |
| testVerify_withValidMock_returnsSameMockInstance | `verify()`: ทั้งสอง condition false → return mock |
| testReset_withValidMock_doesNotThrow | `reset()`: loop body execute 1 ครั้ง |
| testReset_withNoMocks_doesNotThrow | `reset()`: loop ไม่ execute (empty array) |
| testVerifyNoMoreInteractions_withEmptyArray_throwsException | `assertMocksNotEmpty`: `mocks.length==0` (true) |
| testVerifyNoMoreInteractions_withNullArray_throwsException | `assertMocksNotEmpty`: `mocks==null` (true) |
| testVerifyNoMoreInteractions_withNullElement_throwsException | loop: `mock==null` (true) |
| testVerifyNoMoreInteractions_withNonMockElement_throwsException | loop: `catch(NotAMockException)` branch |
| testVerifyNoMoreInteractions_withValidMock_doesNotThrow | loop: ไม่เข้า if และไม่ throw (ปกติ) |
| testInOrder_withEmptyArray_throwsException | `inOrder()`: `mocks.length==0` (true) |
| testInOrder_withNullArray_throwsException | `inOrder()`: `mocks==null` (true) |
| testInOrder_withNullElement_throwsException | loop: `mock==null` (true) |
| testInOrder_withNonMockElement_throwsException | loop: `else if (!isMock)` (true) |
| testInOrder_withValidMocks_returnsInOrderImpl | loop: ทั้งสอง condition false, return `InOrderImpl` |
| testDoAnswer_returnsStubberImpl | `doAnswer()`: flow ปกติ, ตรวจชนิดคืนค่า `StubberImpl` |
| testStubVoid_withValidMock_returnsVoidMethodStubbable | `stubVoid()`: flow ปกติ |
| testValidateMockitoUsage_withCleanState_doesNotThrow | `validateMockitoUsage()`: state สะอาด ไม่ throw |
| testGetLastInvocation_withPriorInvocation_returnsInvocation | `getLastInvocation()`: มี invocation ปกติ |
| testGetLastInvocation_withoutOngoingStubbing_throwsNPE | `getLastInvocation()`: ไม่มี null-check → ตรวจจับ fault (NPE) |

**หมายเหตุเพิ่มเติม:**
- ใช้ `@Before` reset thread-local `MockingProgress` ทุกเทส เพื่อกันปัญหา state รั่วข้ามเทส (เนื่องจาก `ThreadSafeMockingProgress` เป็น ThreadLocal singleton ตามที่เห็นจาก import ในซอร์สต้นฉบับ)
- เคสที่ reporter อาจไม่โยน `MockitoException` ตรงตามชนิดที่คาด (เช่น verification failure ที่อาจเป็น `AssertionError` แทน) **ไม่ได้ทดสอบ** เพราะไม่มีซอร์สของ `Reporter` ยืนยัน behavior ตรงนี้ เพื่อหลีกเลี่ยงการเดา
- `testGetLastInvocation_withoutOngoingStubbing_throwsNPE` เป็นเคสที่ระบุจุดอ่อนจริงของโค้ด (ไม่มี null-check ก่อน cast และเรียก `getRegisteredInvocations()`) ซึ่งเป็นการวิเคราะห์ตรงจากซอร์สที่ให้มา ไม่ใช่การเดา