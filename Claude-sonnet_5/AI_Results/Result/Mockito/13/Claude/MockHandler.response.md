# การวิเคราะห์และข้อจำกัดที่ต้องระบุก่อน (ตามข้อกำหนดที่ 4)

ซอร์สโค้ดของ `MockHandler` ที่ให้มา**อ้างอิง**คลาสหลายตัวที่ไม่ได้แสดง source (เช่น `Invocation`, `MockAwareVerificationMode`, `MockingProgress`, `InvocationContainerImpl`) แต่สามารถอนุมาน **signature ของเมธอดที่ถูกเรียกใช้จริง** ได้จากโค้ดที่ให้มา (เช่น `pullVerificationMode()`, `hasAnswersForStubbing()`, `getArgumentMatcherStorage()`, `setMethodForStubbing(...)`, `findAnswerFor(...)`, `resetInvocationForPotentialStubbing(...)`) — สิ่งเหล่านี้ใช้ได้โดยไม่ต้องเดา

สิ่งที่ **ต้องสมมติ** (ไม่มีอยู่ในซอร์สที่ให้มา) และกำกับด้วยคอมเมนต์ในโค้ด:
- `org.mockito.internal.invocation.InvocationBuilder` — test-utility ที่มีอยู่จริงในชุด source ของโปรเจกต์ Mockito (เวอร์ชันนี้) สำหรับสร้าง `Invocation` โดยไม่ต้องรู้ constructor ภายใน
- `MockAwareVerificationMode(Object mock, VerificationMode mode)` constructor
- `MockingProgress.verificationStarted(VerificationMode)`
- `InvocationContainerImpl.hasAnswersForStubbing()` กับ list ว่าง → ไม่ assert ค่าตายตัว
- branch `stubbedInvocation != null` (เส้นทาง "คำตอบที่ stub ไว้แล้ว") **ไม่ถูกทดสอบ** เพราะต้องพึ่ง API ภายใน (`pullOngoingStubbing()` ฯลฯ) ที่ไม่มีใน source ให้ตรวจสอบ การเดา API ซ้อนกันหลายชั้นมีความเสี่ยงสูงเกินไปที่จะยืนยันถูกต้อง จึงงดเขียน test ให้ guess

```java
package org.mockito.internal;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import org.mockito.internal.creation.MockSettingsImpl;
import org.mockito.internal.invocation.Invocation;
import org.mockito.internal.invocation.InvocationBuilder; // สมมติฐาน: test-util ที่มีอยู่จริงในซอร์สของ Mockito-13b
import org.mockito.internal.stubbing.VoidMethodStubbableImpl;
import org.mockito.internal.verification.MockAwareVerificationMode;
import org.mockito.invocation.InvocationOnMock;
import org.mockito.stubbing.Answer;
import org.mockito.stubbing.VoidMethodStubbable;
import org.mockito.verification.VerificationData;
import org.mockito.verification.VerificationMode;

public class MockHandlerTest {

    private MockHandler<Object> handler;

    @Before
    public void setUp() {
        handler = new MockHandler<Object>();
    }

    // ---------------------------------------------------------
    // Constructors
    // ---------------------------------------------------------

    @Test
    public void shouldCreateHandlerWithDefaultConstructor() {
        assertNotNull(handler.getMockSettings());
        assertNotNull(handler.invocationContainerImpl);
        assertNotNull(handler.matchersBinder);
        assertNotNull(handler.mockingProgress);
    }

    @Test
    public void shouldCreateHandlerWithGivenMockSettings() {
        MockSettingsImpl settings = new MockSettingsImpl();
        MockHandler<Object> h = new MockHandler<Object>(settings);
        assertSame(settings, h.getMockSettings());
        assertNotNull(h.invocationContainerImpl);
    }

    @Test
    public void shouldCreateHandlerFromOldMockHandler_copyingMockSettingsOnly() {
        MockHandler<Object> old = new MockHandler<Object>();
        MockHandler<Object> fresh = new MockHandler<Object>(old);

        assertSame(old.getMockSettings(), fresh.getMockSettings());
        // ตาม source: constructor นี้เรียก this(oldMockHandler.getMockSettings())
        // ซึ่งจะสร้าง InvocationContainerImpl ใหม่เสมอ -> ต้องไม่ใช่ตัวเดียวกัน
        assertNotSame(old.invocationContainerImpl, fresh.invocationContainerImpl);
    }

    // ---------------------------------------------------------
    // Simple getters / delegation
    // ---------------------------------------------------------

    @Test
    public void shouldReturnSameInvocationContainerAsField() {
        assertSame(handler.invocationContainerImpl, handler.getInvocationContainer());
    }

    @Test
    public void shouldReturnVoidMethodStubbableImplInstance() {
        Object mock = new Object();
        VoidMethodStubbable<Object> stubbable = handler.voidMethodStubbable(mock);
        assertNotNull(stubbable);
        assertTrue(stubbable instanceof VoidMethodStubbableImpl);
    }

    @Test
    public void shouldAcceptNullMockForVoidMethodStubbable_noValidationInSource() {
        // source ไม่มีการ validate mock เป็น null จึงคาดว่าไม่ throw exception
        VoidMethodStubbable<Object> stubbable = handler.voidMethodStubbable(null);
        assertNotNull(stubbable);
    }

    // ---------------------------------------------------------
    // setAnswersForStubbing / hasAnswersForStubbing (boundary: empty / non-empty)
    // ---------------------------------------------------------

    @Test
    public void shouldMarkHasAnswersForStubbingTrue_whenNonEmptyListGiven() {
        List<Answer> answers = new ArrayList<Answer>();
        answers.add(dummyAnswer("x"));
        handler.setAnswersForStubbing(answers);
        assertTrue(handler.invocationContainerImpl.hasAnswersForStubbing());
    }

    @Test
    public void shouldNotThrow_whenSetAnswersForStubbingWithEmptyList() {
        // สมมติฐาน: ไม่มี source ของ InvocationContainerImpl ยืนยันค่า boolean ที่แน่นอน
        // จึงตรวจสอบเพียงว่าไม่ throw exception เท่านั้น (boundary case: empty list)
        List<Answer> emptyAnswers = Collections.emptyList();
        handler.setAnswersForStubbing(emptyAnswers);
        handler.invocationContainerImpl.hasAnswersForStubbing(); // ไม่ assert ค่าตายตัว
    }

    // ---------------------------------------------------------
    // handle(): branch 1 -> hasAnswersForStubbing() == true
    // ---------------------------------------------------------

    @Test
    public void shouldSetMethodForStubbingAndReturnNull_whenHasAnswersForStubbing() throws Throwable {
        List<Answer> answers = new ArrayList<Answer>();
        answers.add(dummyAnswer("stub-void"));
        handler.setAnswersForStubbing(answers);
        assertTrue(handler.invocationContainerImpl.hasAnswersForStubbing());

        Invocation invocation = new InvocationBuilder().toInvocation();
        Object result = handler.handle(invocation);

        assertNull(result);
    }

    // ---------------------------------------------------------
    // handle(): branch 2 -> verificationMode == null, ไม่มี stub -> default answer
    // ---------------------------------------------------------

    @Test
    public void shouldReturnDefaultAnswer_whenNoStubAndNoVerification() throws Throwable {
        Invocation invocation = new InvocationBuilder().toInvocation();
        Object result = handler.handle(invocation);
        // default answer (ReturnsEmptyValues) สำหรับเมธอด default ของ InvocationBuilder
        // ที่คืนค่าเป็น Object ทั่วไปควรเป็น null (สมมติฐานอ้างอิงพฤติกรรมมาตรฐานของ Mockito)
        assertNull(result);
    }

    // ---------------------------------------------------------
    // handle(): branch 3 -> verificationMode instanceof MockAwareVerificationMode
    //            และ mock ตรงกับ invocation.getMock()
    // ---------------------------------------------------------

    @Test
    public void shouldCallVerifyAndReturnNull_whenVerificationModeMatchesMock() throws Throwable {
        final boolean[] verifyCalled = {false};
        final Object mock = new Object();

        VerificationMode innerMode = new VerificationMode() {
            public void verify(VerificationData data) {
                verifyCalled[0] = true;
            }
        };
        MockAwareVerificationMode mode = new MockAwareVerificationMode(mock, innerMode);

        // จำลองสถานะเหมือนเพิ่งเรียก Mockito.verify(mock, ...)
        handler.mockingProgress.verificationStarted(mode);

        Invocation invocationOnSameMock = new InvocationBuilder().mock(mock).toInvocation();
        Object result = handler.handle(invocationOnSameMock);

        assertNull(result);
        assertTrue("verify() ของ VerificationMode ควรถูกเรียก", verifyCalled[0]);
    }

    // ---------------------------------------------------------
    // handle(): branch 4 -> verificationMode ไม่ตรงกับ mock (เคส bug 138)
    // ---------------------------------------------------------

    @Test
    public void shouldFallThroughToStubbing_whenVerificationModeMockDoesNotMatch() throws Throwable {
        final boolean[] verifyCalled = {false};
        final Object mockA = new Object();
        final Object mockB = new Object();

        VerificationMode innerMode = new VerificationMode() {
            public void verify(VerificationData data) {
                verifyCalled[0] = true;
            }
        };
        MockAwareVerificationMode mode = new MockAwareVerificationMode(mockA, innerMode);
        handler.mockingProgress.verificationStarted(mode);

        Invocation invocationOnDifferentMock = new InvocationBuilder().mock(mockB).toInvocation();
        Object result = handler.handle(invocationOnDifferentMock);

        assertFalse("verify() ไม่ควรถูกเรียกเพราะ mock ไม่ตรงกัน", verifyCalled[0]);
        assertNull(result); // ตกไปใช้ default answer (ไม่ใช่ null จาก verify)

        // ---- ทดสอบดักจับข้อบกพร่องจริง (Defects4J Mockito-13b, bug 138) ----
        // คอมเมนต์ในซอร์สระบุว่า "Re-adding verification mode" แต่โค้ดจริงไม่มีการเรียก
        // มาตรฐานพฤติกรรมที่ถูกต้องคือ verificationMode ที่ไม่ตรง mock ต้องถูกคืนกลับเข้า
        // mockingProgress เพื่อให้ verify() บน mockA ยังใช้งานได้ในภายหลัง
        // คาดว่า assert นี้จะ "ล้มเหลว" บนโค้ดฉบับที่ให้มา (พิสูจน์ fault จริง)
        assertNotNull(
            "ควร re-add verification mode กลับเข้า mockingProgress (bug 138) แต่โค้ดจริงไม่ได้ทำ",
            handler.mockingProgress.pullVerificationMode()
        );
    }

    // ---------------------------------------------------------
    // handle(): invalid / null input
    // ---------------------------------------------------------

    @Test
    public void shouldThrowSomeException_whenInvocationIsNull() {
        Throwable thrown = null;
        try {
            handler.handle(null);
        } catch (Throwable t) {
            thrown = t;
        }
        // ไม่สามารถยืนยัน exception type ที่แน่นอนได้ (ไม่มี source ของ MatchersBinder/Invocation)
        // จึง assert เพียงว่ามี exception เกิดขึ้นจริง ไม่ควร silent-return
        assertNotNull("ควรเกิด exception เมื่อ invocation เป็น null", thrown);
    }

    // ---------------------------------------------------------
    // helper
    // ---------------------------------------------------------
    @SuppressWarnings("unchecked")
    private Answer dummyAnswer(final String tag) {
        return new Answer() {
            public Object answer(InvocationOnMock invocation) throws Throwable {
                return tag;
            }
        };
    }
}
```

## สรุป Branch/Condition ที่ครอบคลุม

| เมธอดทดสอบ | Branch / Condition ที่ครอบคลุม |
|---|---|
| `shouldCreateHandlerWithDefaultConstructor` | constructor `MockHandler()` → สร้าง field ครบ (ไม่มี if/else แต่ครอบคลุม path เริ่มต้น) |
| `shouldCreateHandlerWithGivenMockSettings` | constructor `MockHandler(MockSettingsImpl)` — path หลัก |
| `shouldCreateHandlerFromOldMockHandler_copyingMockSettingsOnly` | constructor `MockHandler(MockHandlerInterface)` — delegate ไปยัง constructor หลัก |
| `shouldReturnSameInvocationContainerAsField` | `getInvocationContainer()` |
| `shouldReturnVoidMethodStubbableImplInstance` | `voidMethodStubbable(mock)` — ค่าปกติ |
| `shouldAcceptNullMockForVoidMethodStubbable_noValidationInSource` | `voidMethodStubbable(null)` — boundary/null |
| `shouldMarkHasAnswersForStubbingTrue_whenNonEmptyListGiven` | `setAnswersForStubbing()` ลิสต์ไม่ว่าง |
| `shouldNotThrow_whenSetAnswersForStubbingWithEmptyList` | `setAnswersForStubbing()` ลิสต์ว่าง (boundary) |
| `shouldSetMethodForStubbingAndReturnNull_whenHasAnswersForStubbing` | `handle()` branch: `if (hasAnswersForStubbing())` == **true** |
| `shouldReturnDefaultAnswer_whenNoStubAndNoVerification` | `handle()` branch: `verificationMode == null` → `stubbedInvocation == null` → default answer (`else` ของ if-stub) |
| `shouldCallVerifyAndReturnNull_whenVerificationModeMatchesMock` | `handle()` branch: `verificationMode != null` **และ** `instanceof MockAwareVerificationMode` **และ** mock ตรงกัน → `verify()` ถูกเรียก, `return null` |
| `shouldFallThroughToStubbing_whenVerificationModeMockDoesNotMatch` | `handle()` branch: `verificationMode != null` แต่ mock **ไม่ตรง** → ตกผ่าน if ไปสู่ stubbing path (และทดสอบ fault ของ bug 138) |
| `shouldThrowSomeException_whenInvocationIsNull` | `handle(null)` — malformed/null input |

**หมายเหตุ:** branch `stubbedInvocation != null` (เส้นทาง `captureArgumentsFrom` + `answer`) ไม่ได้ครอบคลุมในชุดทดสอบนี้ เนื่องจากต้องพึ่งพา API ภายใน (`InvocationContainerImpl`/`OngoingStubbingImpl`) ที่ไม่ได้ให้ source มายืนยัน การเขียน test โดยเดา API หลายชั้นซ้อนกันมีความเสี่ยงสูงต่อความถูกต้อง จึงงดเว้นตามข้อกำหนดที่ 4