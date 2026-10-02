# MockitoCoreTest.java

```java
package org.mockito.internal;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import java.lang.reflect.Field;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InOrder;
import org.mockito.Mockito;
import org.mockito.exceptions.base.MockitoException;
import org.mockito.exceptions.misusing.MissingMethodInvocationException;
import org.mockito.exceptions.misusing.NotAMockException;
import org.mockito.exceptions.misusing.NullInsteadOfMockException;
import org.mockito.internal.creation.MockSettingsImpl;
import org.mockito.internal.invocation.Invocation;
import org.mockito.internal.progress.MockingProgress;
import org.mockito.internal.util.MockUtil;
import org.mockito.invocation.InvocationOnMock;
import org.mockito.stubbing.Answer;
import org.mockito.stubbing.DeprecatedOngoingStubbing;
import org.mockito.stubbing.OngoingStubbing;
import org.mockito.stubbing.Stubber;
import org.mockito.stubbing.VoidMethodStubbable;

/**
 * JUnit 4 test suite for {@link MockitoCore} (Defects4J Mockito-14b).
 *
 * หมายเหตุทั่วไป:
 * - ใช้ org.mockito.Mockito (public API ของโปรเจกต์เดียวกัน) เพื่อสร้าง mock จริง
 *   สำหรับทดสอบ method ของ MockitoCore โดยตรง เนื่องจาก ThreadSafeMockingProgress
 *   อ้างอิง state เดียวกันผ่าน ThreadLocal ไม่ว่าจะสร้าง instance ของ MockitoCore กี่ตัวก็ตาม
 * - สำหรับ exception บางตัว (เช่น ที่มาจาก Reporter.mocksHaveToBePassedXxx,
 *   nullPassedWhenCreatingInOrder, notAMockPassedToVerifyNoMoreInteractions ฯลฯ)
 *   ไม่มี import ของ exception class ที่แน่นอนอยู่ในซอร์สที่ให้มา จึงใช้ class แม่
 *   {@link MockitoException} เป็น expected type เพื่อไม่เดา subtype ที่ไม่แน่ใจ
 */
@SuppressWarnings({"unchecked", "rawtypes"})
public class MockitoCoreTest {

    private MockitoCore core;

    @Before
    public void setUp() {
        core = new MockitoCore();
    }

    /**
     * ล้าง state ของ MockingProgress (ThreadLocal) หลังจบทุกเทส เพื่อไม่ให้เทสหนึ่ง
     * รบกวน state ของเทสถัดไป (ongoing stubbing / verification ที่ยังไม่เสร็จ)
     * ใช้ reflection เพื่อเรียก reset()/resetOngoingStubbing() ตรง ๆ
     * โดยไม่ผ่าน validateState() ซึ่งอาจ throw ถ้า state ค้างอยู่
     */
    @After
    public void tearDown() throws Exception {
        Field progressField = MockitoCore.class.getDeclaredField("mockingProgress");
        progressField.setAccessible(true);
        MockingProgress progress = (MockingProgress) progressField.get(core);
        progress.reset();
        progress.resetOngoingStubbing();
    }

    // ---------------------------------------------------------------
    // mock(Class, MockSettings)
    // ---------------------------------------------------------------

    @Test
    public void mock_withValidClassAndSettings_createsWorkingMock() {
        MockSettingsImpl settings = new MockSettingsImpl();
        settings.defaultAnswer(Mockito.RETURNS_DEFAULTS);

        List mock = core.mock(List.class, settings);

        assertNotNull(mock);
        assertTrue(new MockUtil().isMock(mock));
        // RETURNS_DEFAULTS -> primitive/empty defaults
        assertEquals(0, mock.size());
    }

    // ---------------------------------------------------------------
    // stub() / stub(T) / when(T)
    // ---------------------------------------------------------------

    @Test(expected = MissingMethodInvocationException.class)
    public void stub_withoutOngoingStubbing_throwsMissingMethodInvocationException() {
        core.stub();
    }

    @Test
    public void stubDeprecated_withOngoingStubbing_returnsNonNullStubbing() {
        List mock = Mockito.mock(List.class);
        Object result = mock.get(0); // ลงทะเบียน ongoing stubbing ผ่าน handler ของ mock จริง

        DeprecatedOngoingStubbing stubbing = core.stub(result);

        assertNotNull(stubbing);
    }

    @Test
    public void when_withOngoingStubbing_returnsWorkingOngoingStubbing() {
        List mock = Mockito.mock(List.class);

        OngoingStubbing<Object> stubbing = core.when(mock.get(0));

        assertNotNull(stubbing);
        stubbing.thenReturn("configured");
        assertEquals("configured", mock.get(0));
    }

    @Test(expected = MissingMethodInvocationException.class)
    public void when_withoutOngoingStubbing_throwsMissingMethodInvocationException() {
        core.when("not a real mock invocation");
    }

    // ---------------------------------------------------------------
    // verify(T, VerificationMode)
    // ---------------------------------------------------------------

    @Test(expected = NullInsteadOfMockException.class)
    public void verify_withNullMock_throwsNullInsteadOfMockException() {
        core.verify(null, Mockito.times(1));
    }

    @Test(expected = NotAMockException.class)
    public void verify_withNonMockObject_throwsNotAMockException() {
        core.verify(new Object(), Mockito.times(1));
    }

    @Test
    public void verify_withValidMock_returnsSameMockReference() {
        List mock = Mockito.mock(List.class);

        Object returned = core.verify(mock, Mockito.times(0));

        assertSame(mock, returned);
    }

    // ---------------------------------------------------------------
    // reset(T...)
    // ---------------------------------------------------------------

    @Test
    public void reset_withMultipleMocks_resetsEachMock() {
        List mockA = Mockito.mock(List.class);
        List mockB = Mockito.mock(List.class);
        Mockito.when(mockA.size()).thenReturn(5);
        Mockito.when(mockB.size()).thenReturn(7);

        core.reset(mockA, mockB);

        assertEquals(0, mockA.size());
        assertEquals(0, mockB.size());
    }

    @Test
    public void reset_withNoMocksProvided_doesNotThrowAndLoopIsSkipped() {
        core.reset(); // mocks.length == 0 -> for-loop ไม่ทำงานเลย
    }

    // ---------------------------------------------------------------
    // verifyNoMoreInteractions(Object...)
    // ---------------------------------------------------------------

    @Test(expected = MockitoException.class)
    public void verifyNoMoreInteractions_withNullArray_throwsException() {
        core.verifyNoMoreInteractions((Object[]) null);
    }

    @Test(expected = MockitoException.class)
    public void verifyNoMoreInteractions_withEmptyArray_throwsException() {
        core.verifyNoMoreInteractions();
    }

    @Test(expected = MockitoException.class)
    public void verifyNoMoreInteractions_withNullElement_throwsException() {
        core.verifyNoMoreInteractions(new Object[]{null});
    }

    @Test(expected = NotAMockException.class)
    public void verifyNoMoreInteractions_withNonMockElement_throwsNotAMockException() {
        core.verifyNoMoreInteractions(new Object());
    }

    @Test
    public void verifyNoMoreInteractions_withMockHavingNoInteractions_doesNotThrow() {
        List mock = Mockito.mock(List.class);
        core.verifyNoMoreInteractions(mock);
    }

    // ---------------------------------------------------------------
    // inOrder(Object...)
    // ---------------------------------------------------------------

    @Test(expected = MockitoException.class)
    public void inOrder_withNullArray_throwsException() {
        core.inOrder((Object[]) null);
    }

    @Test(expected = MockitoException.class)
    public void inOrder_withEmptyArray_throwsException() {
        core.inOrder(new Object[0]);
    }

    @Test(expected = MockitoException.class)
    public void inOrder_withNullElement_throwsException() {
        core.inOrder(new Object[]{null});
    }

    @Test(expected = NotAMockException.class)
    public void inOrder_withNonMockElement_throwsNotAMockException() {
        core.inOrder(new Object());
    }

    @Test
    public void inOrder_withValidMocks_returnsInOrderInstance() {
        List mockA = Mockito.mock(List.class);
        List mockB = Mockito.mock(List.class);

        InOrder inOrder = core.inOrder(mockA, mockB);

        assertNotNull(inOrder);
    }

    // ---------------------------------------------------------------
    // doAnswer(Answer)
    // ---------------------------------------------------------------

    @Test
    public void doAnswer_withAnswer_configuresCustomBehavior() {
        final String expected = "answered!";
        Answer answer = new Answer() {
            public Object answer(InvocationOnMock invocation) throws Throwable {
                return expected;
            }
        };
        List mock = Mockito.mock(List.class);

        Stubber stubber = core.doAnswer(answer);
        assertNotNull(stubber);

        stubber.when(mock).get(0); // สมบูรณ์ chain doAnswer(...).when(mock).method()
        assertEquals(expected, mock.get(0));
    }

    // ---------------------------------------------------------------
    // stubVoid(T)
    // ---------------------------------------------------------------

    @Test
    public void stubVoid_withValidMock_returnsStubbable() {
        Runnable mock = Mockito.mock(Runnable.class);

        VoidMethodStubbable stubbable = core.stubVoid(mock);

        assertNotNull(stubbable);
    }

    @Test(expected = NotAMockException.class)
    public void stubVoid_withNonMockObject_throwsNotAMockException() {
        core.stubVoid(new Object());
    }

    // ---------------------------------------------------------------
    // validateMockitoUsage()
    // ---------------------------------------------------------------

    @Test
    public void validateMockitoUsage_withCleanState_doesNotThrow() {
        core.validateMockitoUsage();
    }

    /**
     * หมายเหตุ: พฤติกรรมของ validateState() ที่ detect "unfinished stubbing"
     * ไม่ได้ถูกแสดงในซอร์สโค้ดของ MockitoCore ที่ให้มา (อยู่ใน MockingProgress)
     * แต่เป็นพฤติกรรมมาตรฐานที่ทราบกันว่าเกิดขึ้นเมื่อเรียก method บน mock
     * โดยไม่ตามด้วย when()/thenReturn() จึงใช้ MockitoException (class แม่) เพื่อความปลอดภัย
     */
    @Test(expected = MockitoException.class)
    public void validateMockitoUsage_withUnfinishedStubbing_throwsException() {
        List mock = Mockito.mock(List.class);
        mock.get(0); // เริ่ม ongoing stubbing แต่ไม่ปิดจบด้วย thenReturn()
        core.validateMockitoUsage();
    }

    // ---------------------------------------------------------------
    // getLastInvocation()
    // ---------------------------------------------------------------

    @Test
    public void getLastInvocation_withPendingInvocation_returnsLastInvocation() {
        List mock = Mockito.mock(List.class);
        mock.size(); // ลงทะเบียน ongoing stubbing/invocation ไว้

        Invocation invocation = core.getLastInvocation();

        assertNotNull(invocation);
    }

    @Test(expected = NullPointerException.class)
    public void getLastInvocation_withoutPendingInvocation_throwsNullPointerException() {
        // pullOngoingStubbing() จะ return null -> cast เป็น OngoingStubbingImpl ได้ (null)
        // แต่เรียก .getRegisteredInvocations() บน null -> NPE (fault-detection case)
        core.getLastInvocation();
    }

    // ---------------------------------------------------------------
    // ตัวช่วย (ไม่ใช่ test) สำหรับยืนยัน assertNull ใช้งานได้ (กันไม่ให้ unused import)
    // ---------------------------------------------------------------
    @Test
    public void sanityCheck_assertNullUsed() {
        List mock = Mockito.mock(List.class);
        assertNull(mock.get(0));
    }
}
```

---

## ตารางสรุปการครอบคลุม Branch/Condition

| Test Method | Branch / Condition ที่ครอบคลุม |
|---|---|
| `mock_withValidClassAndSettings_createsWorkingMock` | `mock()` – path ปกติ สร้าง mock สำเร็จ + `mockingStarted` |
| `stub_withoutOngoingStubbing_throwsMissingMethodInvocationException` | `stub()` – `stubbing == null` (true) |
| `stubDeprecated_withOngoingStubbing_returnsNonNullStubbing` | `stub(T)` – `stubbing == null` (false, มี ongoing stubbing) |
| `when_withOngoingStubbing_returnsWorkingOngoingStubbing` | `when(T)` – path ปกติ, `stub()` คืนค่าไม่ null |
| `when_withoutOngoingStubbing_throwsMissingMethodInvocationException` | `when(T)` → `stub()` – `stubbing == null` (true) |
| `verify_withNullMock_throwsNullInsteadOfMockException` | `verify()` – `mock == null` (true) |
| `verify_withNonMockObject_throwsNotAMockException` | `verify()` – `mock == null` (false), `!isMock(mock)` (true) |
| `verify_withValidMock_returnsSameMockReference` | `verify()` – ทั้งสอง condition เป็น false, คืนค่า `mock` |
| `reset_withMultipleMocks_resetsEachMock` | `reset()` – for-loop วน 2 ครั้ง |
| `reset_withNoMocksProvided_doesNotThrowAndLoopIsSkipped` | `reset()` – for-loop วน 0 ครั้ง (`mocks.length == 0`) |
| `verifyNoMoreInteractions_withNullArray_throwsException` | `assertMocksNotEmpty` – `mocks == null` (true) |
| `verifyNoMoreInteractions_withEmptyArray_throwsException` | `assertMocksNotEmpty` – `mocks == null` false, `length==0` true |
| `verifyNoMoreInteractions_withNullElement_throwsException` | loop body – `mock == null` (true) |
| `verifyNoMoreInteractions_withNonMockElement_throwsNotAMockException` | loop body – `catch (NotAMockException e)` branch |
| `verifyNoMoreInteractions_withMockHavingNoInteractions_doesNotThrow` | loop body – path ปกติ ไม่มี exception |
| `inOrder_withNullArray_throwsException` | `inOrder()` – `mocks == null` (true) |
| `inOrder_withEmptyArray_throwsException` | `inOrder()` – `mocks == null` false, `length==0` true |
| `inOrder_withNullElement_throwsException` | loop – `mock == null` (true) |
| `inOrder_withNonMockElement_throwsNotAMockException` | loop – `mock == null` false, `!isMock(mock)` true |
| `inOrder_withValidMocks_returnsInOrderInstance` | loop – ทุก condition false, คืนค่า `InOrderImpl` |
| `doAnswer_withAnswer_configuresCustomBehavior` | `doAnswer()` – path ปกติเต็ม flow |
| `stubVoid_withValidMock_returnsStubbable` | `stubVoid()` – path ปกติ |
| `stubVoid_withNonMockObject_throwsNotAMockException` | `stubVoid()` – `getMockHandler` throw `NotAMockException` (ไม่ถูก catch) |
| `validateMockitoUsage_withCleanState_doesNotThrow` | `validateMockitoUsage()` – state สะอาด |
| `validateMockitoUsage_withUnfinishedStubbing_throwsException` | `validateMockitoUsage()` – state มีปัญหา (สมมติฐาน, มีคอมเมนต์กำกับ) |
| `getLastInvocation_withPendingInvocation_returnsLastInvocation` | `getLastInvocation()` – มี ongoing stubbing |
| `getLastInvocation_withoutPendingInvocation_throwsNullPointerException` | `getLastInvocation()` – ไม่มี ongoing stubbing → NPE (fault case) |

**หมายเหตุสำคัญ:**
- ไม่ได้เขียนเทสสำหรับ `verifyNoMoreInteractionsInOrder(...)` เพราะต้องใช้ instance ของ `InOrderContext` ซึ่ง interface/implementation ไม่ได้แสดงอยู่ในซอร์สที่ให้มา การเดา constructor/implementation จะเสี่ยงต่อการเดา behavior ที่ไม่มีหลักฐาน (ตามข้อกำหนดที่ 4)
- การใช้ `MockitoException` (class แม่) เป็น expected exception ในหลายเทส เนื่องจากไม่สามารถยืนยัน exact subclass ที่ `Reporter` แต่ละเมธอด throw ได้จากซอร์สที่ให้มา