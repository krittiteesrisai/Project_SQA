# วิเคราะห์โค้ดเป้าหมายก่อนเขียนเทส

จากซอร์สโค้ด `VerificationOverTimeImpl` มี branch/condition หลักที่ต้องครอบคลุม:

1. `while (timer.isCounting())` — true/false (loop เข้า/ไม่เข้า, loop หลายรอบ)
2. `delegate.verify(data)` — สำเร็จ หรือโยน `MockitoAssertionError` / `ArgumentsAreDifferent`
3. `if (returnOnSuccess)` — true (return ทันที) / false (`error = null`)
4. `catch (MockitoAssertionError e)` และ `catch (ArgumentsAreDifferent e)`
5. `handleVerifyException`: `canRecoverFromFailure` true (sleep แล้ว return error) / false (throw ทันที)
6. `canRecoverFromFailure`: instance เป็น `AtMost` / `NoMoreInteractions` (false) หรือไม่ใช่ (true)
7. `sleep()`: try สำเร็จ / `catch (InterruptedException)`
8. หลัง loop: `if (error != null) throw error;` — true/false
9. Constructor แบบ 4 parameter ที่ delegate ไปสร้าง `Timer` จริง

**หมายเหตุสำคัญ (ข้อจำกัด/สมมติฐานที่ประกาศไว้ตามข้อ 4 ของโจทย์):**
- classpath ที่ให้มาไม่มี `mockito-core` สำหรับสร้าง mock จึงต้องเขียน **fake implementation** ของ `VerificationMode`/`Timer` เอง (subclass จริงเพื่อคุม behavior)
- ไม่พบซอร์สของ `org.mockito.exceptions.verification.junit.ArgumentsAreDifferent` และ `NoMoreInteractions` ในโจทย์ จึงไม่กล้าเดา constructor เต็มรูปแบบ — ใช้วิธี subclass เพื่อ override `verify()` เท่าที่จำเป็น และ **ไม่ทดสอบ catch(ArgumentsAreDifferent) โดยตรง** (คอมเมนต์ไว้ในโค้ด) เพราะไม่มั่นใจ constructor signature
- ใช้ `org.powermock.reflect.Whitebox` (มีใน `powermock-reflect-1.2.5.jar`) เพื่อเรียก private method `handleVerifyException` ตรง ๆ — สมมติว่า Whitebox unwrap exception ที่ถูก throw จาก target method (พฤติกรรมมาตรฐานของ PowerMock Reflect)
- สมมติว่า `Timer`, `AtMost.verify()`, `NoMoreInteractions` ไม่ได้ประกาศเป็น `final` (เพราะไม่มีการระบุใน source ที่ให้มา และถูกใช้งานแบบ polymorphic ได้)

```java
package org.mockito.internal.verification;

import org.junit.Test;
import org.mockito.exceptions.base.MockitoAssertionError;
import org.mockito.internal.util.Timer;
import org.mockito.internal.verification.api.VerificationData;
import org.mockito.verification.VerificationMode;
import org.powermock.reflect.Whitebox;

import static org.junit.Assert.*;

/**
 * Unit tests for {@link VerificationOverTimeImpl}.
 *
 * หมายเหตุ: ไม่มี mockito-core ใน classpath ที่กำหนด จึงสร้าง fake/stub ของ
 * VerificationMode และ Timer เองแทนการ mock เพื่อควบคุม behavior แบบ deterministic
 */
public class VerificationOverTimeImplTest {

    // ---------- Fake VerificationMode implementations ----------

    /** delegate ที่ผ่านทุกครั้ง (verify สำเร็จ ไม่ throw) */
    private static class PassingMode implements VerificationMode {
        public void verify(VerificationData data) {
            // success - no exception
        }
    }

    /** delegate ที่ fail ทุกครั้งด้วย MockitoAssertionError */
    private static class AlwaysFailMode implements VerificationMode {
        public void verify(VerificationData data) {
            throw new MockitoAssertionError("always fail");
        }
    }

    /** delegate ที่ fail-pass-fail ตามลำดับการเรียก เพื่อทดสอบการ reset error */
    private static class ToggleMode implements VerificationMode {
        int calls = 0;
        public void verify(VerificationData data) {
            calls++;
            if (calls == 2) {
                return; // pass เฉพาะรอบที่ 2
            }
            throw new MockitoAssertionError("fail-" + calls);
        }
    }

    /**
     * subclass ของ AtMost (ยังเป็น instanceof AtMost) แต่ override verify()
     * เพื่อให้ throw ได้แบบควบคุมได้ โดยไม่ต้องพึ่ง real invocation data
     */
    private static class ThrowingAtMost extends AtMost {
        ThrowingAtMost(int max) {
            super(max);
        }
        @Override
        public void verify(VerificationData data) {
            throw new MockitoAssertionError("atmost fail");
        }
    }

    /**
     * subclass ของ NoMoreInteractions เพื่อควบคุม verify()
     * (สมมติว่า NoMoreInteractions มี constructor แบบ no-arg ที่เข้าถึงได้ -
     * ไม่ได้ยืนยันจาก source ที่ให้มา)
     */
    private static class ThrowingNoMoreInteractions extends NoMoreInteractions {
        @Override
        public void verify(VerificationData data) {
            throw new MockitoAssertionError("nomore fail");
        }
    }

    // ---------- Fake Timer ----------

    /**
     * Timer ปลอมที่ควบคุมผลของ isCounting() ตามลำดับ (sequence) ที่กำหนด
     * เพื่อให้ loop ใน verify() ทำงานแบบ deterministic ไม่พึ่งเวลาจริง
     */
    private static class FakeTimer extends Timer {
        private final boolean[] seq;
        private int idx = 0;

        FakeTimer(boolean... seq) {
            super(0);
            this.seq = seq;
        }

        @Override
        public void start() {
            // no-op, ไม่สนใจเวลาจริง
        }

        @Override
        public boolean isCounting() {
            if (idx < seq.length) {
                return seq[idx++];
            }
            return false;
        }
    }

    // ---------- Constructor / Getter tests ----------

    @Test
    public void testGetters_ReturnConstructorValues() {
        VerificationMode delegate = new PassingMode();
        VerificationOverTimeImpl v =
                new VerificationOverTimeImpl(50L, 500L, delegate, true);

        assertEquals(50L, v.getPollingPeriod());
        assertEquals(500L, v.getDuration());
        assertSame(delegate, v.getDelegate());
    }

    @Test
    public void testVerify_UsingFourArgConstructor_SuccessImmediate() {
        // ใช้ constructor 4 args ซึ่งจะสร้าง real Timer(durationMillis) ภายใน
        VerificationOverTimeImpl v =
                new VerificationOverTimeImpl(10L, 1000L, new PassingMode(), true);
        v.verify(null); // ควรสำเร็จโดยไม่ throw (delegate ผ่าน, returnOnSuccess=true)
    }

    // ---------- verify() loop branch tests ----------

    @Test
    public void testVerify_SuccessWithReturnOnSuccessTrue_ReturnsImmediately() {
        PassingMode delegate = new PassingMode();
        FakeTimer timer = new FakeTimer(true);
        VerificationOverTimeImpl v =
                new VerificationOverTimeImpl(0L, 100L, delegate, true, timer);

        v.verify(null); // delegate ผ่าน + returnOnSuccess=true -> return ทันที ไม่ throw
    }

    @Test
    public void testVerify_SuccessWithReturnOnSuccessFalse_CompletesWithoutError() {
        PassingMode delegate = new PassingMode();
        FakeTimer timer = new FakeTimer(true, false);
        VerificationOverTimeImpl v =
                new VerificationOverTimeImpl(0L, 100L, delegate, false, timer);

        v.verify(null); // error ถูก set เป็น null หลัง success, loop จบด้วย timer=false, ไม่ throw
    }

    @Test(expected = MockitoAssertionError.class)
    public void testVerify_RecoverableFailure_ThrowsLastErrorAfterTimeout() {
        AlwaysFailMode delegate = new AlwaysFailMode();
        FakeTimer timer = new FakeTimer(true, false);
        VerificationOverTimeImpl v =
                new VerificationOverTimeImpl(0L, 100L, delegate, true, timer);

        v.verify(null); // fail ทุกครั้ง (recoverable) -> loop จบตาม timer -> throw last error
    }

    @Test(expected = MockitoAssertionError.class)
    public void testVerify_NonRecoverableAtMostFailure_ThrowsImmediately() {
        ThrowingAtMost delegate = new ThrowingAtMost(1);
        // ถ้า loop ยังวนต่อ timer จะยังเป็น true เรื่อย ๆ - แต่ error ต้อง escape ก่อนถึงรอบถัดไป
        FakeTimer timer = new FakeTimer(true, true, true);
        VerificationOverTimeImpl v =
                new VerificationOverTimeImpl(0L, 100L, delegate, true, timer);

        v.verify(null); // canRecoverFromFailure=false (AtMost) -> throw ทันทีใน handleVerifyException
    }

    @Test(expected = MockitoAssertionError.class)
    public void testVerify_NonRecoverableNoMoreInteractionsFailure_ThrowsImmediately() {
        ThrowingNoMoreInteractions delegate = new ThrowingNoMoreInteractions();
        FakeTimer timer = new FakeTimer(true, true, true);
        VerificationOverTimeImpl v =
                new VerificationOverTimeImpl(0L, 100L, delegate, true, timer);

        v.verify(null); // canRecoverFromFailure=false (NoMoreInteractions) -> throw ทันที
    }

    @Test(expected = MockitoAssertionError.class)
    public void testVerify_ToggleFailPassFail_ThrowsLastFailureError() {
        ToggleMode delegate = new ToggleMode();
        FakeTimer timer = new FakeTimer(true, true, true, false);
        VerificationOverTimeImpl v =
                new VerificationOverTimeImpl(0L, 100L, delegate, false, timer);

        v.verify(null); // fail -> pass(error=null) -> fail อีกครั้ง -> loop จบ -> throw error ล่าสุด
    }

    @Test
    public void testVerify_TimerNeverCounts_LoopNeverRunsNoException() {
        AlwaysFailMode delegate = new AlwaysFailMode();
        FakeTimer timer = new FakeTimer(false); // isCounting() false ตั้งแต่แรก
        VerificationOverTimeImpl v =
                new VerificationOverTimeImpl(0L, 0L, delegate, true, timer);

        v.verify(null); // loop ไม่เข้าเลย, delegate ไม่ถูกเรียก, error=null -> ไม่ throw
    }

    @Test
    public void testVerify_SleepInterrupted_HandlesGracefully() {
        AlwaysFailMode delegate = new AlwaysFailMode();
        FakeTimer timer = new FakeTimer(true, false);
        VerificationOverTimeImpl v =
                new VerificationOverTimeImpl(10L, 100L, delegate, true, timer);

        Thread.currentThread().interrupt();
        try {
            v.verify(null);
            fail("คาดว่าจะ throw MockitoAssertionError");
        } catch (MockitoAssertionError expected) {
            // InterruptedException ภายใน sleep() ถูกจับและเพิกเฉยตาม source
        } finally {
            Thread.interrupted(); // เคลียร์ interrupt flag ไม่ให้กระทบเทสอื่น
        }
    }

    @Test(expected = NullPointerException.class)
    public void testVerify_NullDelegate_ThrowsNPEWhenInvoked() {
        // boundary case: delegate=null ไม่มีการ guard ใน constructor/verify()
        // -> NPE เกิดตอนเรียก delegate.verify(data) จริง
        FakeTimer timer = new FakeTimer(true);
        VerificationOverTimeImpl v =
                new VerificationOverTimeImpl(0L, 100L, null, true, timer);

        v.verify(null);
    }

    // ---------- Direct tests of private/protected helper methods ----------

    @Test
    public void testHandleVerifyException_RecoverableDelegate_ReturnsError() throws Exception {
        VerificationMode delegate = new PassingMode(); // ไม่ใช่ AtMost/NoMoreInteractions -> recoverable
        VerificationOverTimeImpl v =
                new VerificationOverTimeImpl(0L, 1000L, delegate, true);

        AssertionError original = new MockitoAssertionError("boom");
        // เรียก private method ตรง ๆ ผ่าน Whitebox (powermock-reflect)
        Object result = Whitebox.invokeMethod(v, "handleVerifyException", original);

        assertSame(original, result); // recoverable -> sleep แล้ว return error เดิม ไม่ throw
    }

    @Test(expected = MockitoAssertionError.class)
    public void testHandleVerifyException_NonRecoverableDelegate_Throws() throws Exception {
        VerificationMode delegate = new AtMost(1); // non-recoverable
        VerificationOverTimeImpl v =
                new VerificationOverTimeImpl(0L, 1000L, delegate, true);

        // สมมติว่า Whitebox.invokeMethod unwrap exception จริงที่ target method throw
        Whitebox.invokeMethod(v, "handleVerifyException", new MockitoAssertionError("boom"));
    }

    @Test
    public void testCanRecoverFromFailure_AtMost_ReturnsFalse() {
        VerificationOverTimeImpl v =
                new VerificationOverTimeImpl(0L, 1000L, new PassingMode(), true);

        assertFalse(v.canRecoverFromFailure(new AtMost(1)));
    }

    @Test
    public void testCanRecoverFromFailure_NoMoreInteractions_ReturnsFalse() {
        VerificationOverTimeImpl v =
                new VerificationOverTimeImpl(0L, 1000L, new PassingMode(), true);

        // สมมติฐาน: NoMoreInteractions มี public/package no-arg constructor
        assertFalse(v.canRecoverFromFailure(new NoMoreInteractions()));
    }

    @Test
    public void testCanRecoverFromFailure_OtherMode_ReturnsTrue() {
        VerificationOverTimeImpl v =
                new VerificationOverTimeImpl(0L, 1000L, new PassingMode(), true);

        assertTrue(v.canRecoverFromFailure(new PassingMode()));
    }
}
```

## สรุปการครอบคลุม Branch/Condition

| Test Method | Branch/Condition ที่ครอบคลุม |
|---|---|
| `testGetters_ReturnConstructorValues` | sanity check ของ constructor 5-arg และ getters (ไม่มี branch แต่จำเป็นสำหรับ regression) |
| `testVerify_UsingFourArgConstructor_SuccessImmediate` | constructor 4-arg → สร้าง `Timer` จริง + delegate success + `returnOnSuccess=true` |
| `testVerify_SuccessWithReturnOnSuccessTrue_ReturnsImmediately` | `timer.isCounting()=true`, delegate success, `if(returnOnSuccess) return` (true branch) |
| `testVerify_SuccessWithReturnOnSuccessFalse_CompletesWithoutError` | delegate success, `returnOnSuccess=false` (`error=null`), loop exit จาก timer=false, `error!=null` เป็น false ท้ายสุด |
| `testVerify_RecoverableFailure_ThrowsLastErrorAfterTimeout` | `catch(MockitoAssertionError)`, `canRecoverFromFailure=true`, `sleep()`, loop จบจาก timer, `error!=null → throw` |
| `testVerify_NonRecoverableAtMostFailure_ThrowsImmediately` | `canRecoverFromFailure` → `instanceof AtMost` = false → throw ทันทีจาก `handleVerifyException` |
| `testVerify_NonRecoverableNoMoreInteractionsFailure_ThrowsImmediately` | `canRecoverFromFailure` → `instanceof NoMoreInteractions` = false → throw ทันที |
| `testVerify_ToggleFailPassFail_ThrowsLastFailureError` | loop หลายรอบ: fail→pass(`error=null`)→fail อีกครั้ง, ทดสอบ reassignment ของ `error` |
| `testVerify_TimerNeverCounts_LoopNeverRunsNoException` | `while(timer.isCounting())` false ตั้งแต่ต้น → loop ไม่ execute, `error==null` ไม่ throw |
| `testVerify_SleepInterrupted_HandlesGracefully` | `catch(InterruptedException)` ภายใน private `sleep()` |
| `testVerify_NullDelegate_ThrowsNPEWhenInvoked` | boundary/null input: delegate=null ไม่ถูก guard |
| `testHandleVerifyException_RecoverableDelegate_ReturnsError` | private method `handleVerifyException` branch recoverable=true (ตรง ๆ ผ่าน Whitebox) |
| `testHandleVerifyException_NonRecoverableDelegate_Throws` | private method `handleVerifyException` branch recoverable=false (throw) |
| `testCanRecoverFromFailure_AtMost_ReturnsFalse` | `canRecoverFromFailure` condition `instanceof AtMost` |
| `testCanRecoverFromFailure_NoMoreInteractions_ReturnsFalse` | `canRecoverFromFailure` condition `instanceof NoMoreInteractions` |
| `testCanRecoverFromFailure_OtherMode_ReturnsTrue` | `canRecoverFromFailure` กรณี else (ไม่ใช่ทั้งสอง type) |

**ข้อจำกัดที่เปิดเผยตามโจทย์:** ไม่ได้เขียนเทสสำหรับ `catch (ArgumentsAreDifferent e)` โดยตรง เนื่องจากไม่มี source/constructor signature ของ `org.mockito.exceptions.verification.junit.ArgumentsAreDifferent` ให้ในโจทย์ จึงไม่กล้าเดา — เส้นทาง logic หลัง catch (เรียก `handleVerifyException`) ถูกครอบคลุมแล้วผ่านเส้นทางของ `MockitoAssertionError` ซึ่งใช้ logic เดียวกัน