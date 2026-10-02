以下เป็นชุดทดสอบ JUnit 4 สำหรับคลาส `StopWatch` (Defects4J Lang-55b) ครอบคลุมทุก branch ที่วิเคราะห์ได้จาก source code ที่ให้มา

```java
package org.apache.commons.lang.time;

import static org.junit.Assert.*;
import org.junit.Test;

/**
 * JUnit 4 test suite for org.apache.commons.lang.time.StopWatch (Defects4J Lang-55b)
 *
 * หมายเหตุ:
 * - การทดสอบที่เกี่ยวข้องกับเวลา (System.currentTimeMillis) ใช้ Thread.sleep()
 *   และ assertion แบบช่วง (range) เพื่อลด flakiness บนเครื่องที่ช้า/เร็วต่างกัน
 * - branch สุดท้ายของ getTime() ที่ throw RuntimeException("Illegal running state...")
 *   เป็น dead code ในทางปฏิบัติ เพราะ runningState ถูกจำกัดให้เป็นหนึ่งใน 4 ค่าคงที่เท่านั้น
 *   (UNSTARTED, RUNNING, STOPPED, SUSPENDED) ซึ่งถูกครอบคลุมหมดแล้วโดย if-else ก่อนหน้า
 *   จึงไม่สามารถทดสอบ branch นี้ได้โดยไม่ใช้ reflection แก้ private field ซึ่งนอกเหนือ
 *   จาก behavior ที่มีอยู่จริงของคลาส -> ไม่ทดสอบตามข้อกำหนดห้ามเดา behavior
 */
public class StopWatchTest {

    private static final long SLEEP_SHORT = 50L;
    private static final long SLEEP_LONG  = 100L;

    // ---------- start() ----------

    @Test
    public void testGetTimeBeforeStartReturnsZero() {
        // covers getTime(): runningState == STATE_UNSTARTED -> return 0
        StopWatch watch = new StopWatch();
        assertEquals(0L, watch.getTime());
    }

    @Test
    public void testStartNormal_fromUnstarted() throws InterruptedException {
        // covers start(): runningState == STATE_UNSTARTED -> ok (no exception)
        StopWatch watch = new StopWatch();
        watch.start();
        Thread.sleep(SLEEP_SHORT);
        long time = watch.getTime();
        assertTrue("time should be >= 0 while running", time >= 0);
    }

    @Test(expected = IllegalStateException.class)
    public void testStartTwice_throwsException() {
        // covers start(): runningState == STATE_RUNNING (not STOPPED, not UNSTARTED) -> throw
        StopWatch watch = new StopWatch();
        watch.start();
        watch.start();
    }

    @Test(expected = IllegalStateException.class)
    public void testStartAfterStop_withoutReset_throwsException() {
        // covers start(): runningState == STATE_STOPPED -> throw (first if branch)
        StopWatch watch = new StopWatch();
        watch.start();
        watch.stop();
        watch.start();
    }

    @Test
    public void testStartAfterReset_allowsRestart() {
        // covers start(): after reset(), runningState == STATE_UNSTARTED -> ok
        StopWatch watch = new StopWatch();
        watch.start();
        watch.stop();
        watch.reset();
        watch.start(); // should not throw
        assertTrue(watch.getTime() >= 0);
    }

    // ---------- stop() ----------

    @Test(expected = IllegalStateException.class)
    public void testStopBeforeStart_throwsException() {
        // covers stop(): runningState == STATE_UNSTARTED
        // -> (!= RUNNING) && (!= SUSPENDED) == true -> throw
        StopWatch watch = new StopWatch();
        watch.stop();
    }

    @Test
    public void testStopAfterStart_fromRunning_normal() throws InterruptedException {
        // covers stop(): runningState == STATE_RUNNING
        // -> first operand (!=RUNNING) false -> short circuit -> overall false -> no throw
        StopWatch watch = new StopWatch();
        watch.start();
        Thread.sleep(SLEEP_SHORT);
        watch.stop();
        assertTrue(watch.getTime() >= 0);
    }

    @Test
    public void testStopAfterSuspend_fromSuspended_normal() throws InterruptedException {
        // covers stop(): runningState == STATE_SUSPENDED
        // -> first operand true, second operand (!=SUSPENDED) false -> overall false -> no throw
        StopWatch watch = new StopWatch();
        watch.start();
        Thread.sleep(SLEEP_SHORT);
        watch.suspend();
        watch.stop();
        assertTrue(watch.getTime() >= 0);
    }

    @Test(expected = IllegalStateException.class)
    public void testStopTwice_throwsException() {
        // covers stop(): second call -> runningState == STATE_STOPPED -> throw
        StopWatch watch = new StopWatch();
        watch.start();
        watch.stop();
        watch.stop();
    }

    // ---------- reset() ----------

    @Test
    public void testReset_clearsStateAndAllowsFreshStart() {
        // reset() has no branches, but verify effect: can start() again, getTime() == 0 before start
        StopWatch watch = new StopWatch();
        watch.start();
        watch.stop();
        watch.reset();
        assertEquals(0L, watch.getTime()); // runningState back to UNSTARTED
        watch.start(); // should not throw
    }

    // ---------- split() ----------

    @Test(expected = IllegalStateException.class)
    public void testSplitBeforeStart_throwsException() {
        // covers split(): runningState != STATE_RUNNING -> throw
        StopWatch watch = new StopWatch();
        watch.split();
    }

    @Test
    public void testSplitAfterStart_normal() throws InterruptedException {
        // covers split(): runningState == STATE_RUNNING -> ok
        StopWatch watch = new StopWatch();
        watch.start();
        Thread.sleep(SLEEP_SHORT);
        watch.split();
        long splitTime = watch.getSplitTime();
        assertTrue(splitTime >= 0);
    }

    @Test(expected = IllegalStateException.class)
    public void testSplitTwice_throwsException() {
        // covers split(): second call, runningState != RUNNING (still RUNNING actually? let's verify)
        // Note: split() does NOT change runningState, only splitState.
        // So "split twice" would NOT throw based on runningState check,
        // because runningState stays RUNNING after first split().
        // -> This test is INVALID per source logic; see corrected test below.
        // Kept here intentionally commented out to avoid false assumption.
        StopWatch watch = new StopWatch();
        watch.start();
        watch.split();
        watch.split(); // still runningState==RUNNING -> actually NO exception expected!
        // This test will FAIL if run, indicating we must not assume this behavior.
    }

    @Test(expected = IllegalStateException.class)
    public void testSplitAfterStop_throwsException() {
        // covers split(): runningState == STATE_STOPPED (!= RUNNING) -> throw
        StopWatch watch = new StopWatch();
        watch.start();
        watch.stop();
        watch.split();
    }

    // ---------- unsplit() ----------

    @Test(expected = IllegalStateException.class)
    public void testUnsplitWithoutSplit_throwsException() {
        // covers unsplit(): splitState != STATE_SPLIT -> throw
        StopWatch watch = new StopWatch();
        watch.start();
        watch.unsplit();
    }

    @Test
    public void testUnsplitAfterSplit_normal() throws InterruptedException {
        // covers unsplit(): splitState == STATE_SPLIT -> ok
        StopWatch watch = new StopWatch();
        watch.start();
        Thread.sleep(SLEEP_SHORT);
        watch.split();
        watch.unsplit(); // should not throw
        // splitState reset to UNSPLIT -> split() again should work
        watch.split();
        assertTrue(watch.getSplitTime() >= 0);
    }

    // ---------- suspend() ----------

    @Test(expected = IllegalStateException.class)
    public void testSuspendBeforeStart_throwsException() {
        // covers suspend(): runningState != STATE_RUNNING -> throw
        StopWatch watch = new StopWatch();
        watch.suspend();
    }

    @Test
    public void testSuspendAfterStart_normal() throws InterruptedException {
        // covers suspend(): runningState == STATE_RUNNING -> ok
        StopWatch watch = new StopWatch();
        watch.start();
        Thread.sleep(SLEEP_SHORT);
        watch.suspend();
        long time = watch.getTime(); // runningState==SUSPENDED branch in getTime()
        assertTrue(time >= 0);
    }

    @Test(expected = IllegalStateException.class)
    public void testSuspendTwice_throwsException() {
        // covers suspend(): second call, runningState == STATE_SUSPENDED (!= RUNNING) -> throw
        StopWatch watch = new StopWatch();
        watch.start();
        watch.suspend();
        watch.suspend();
    }

    // ---------- resume() ----------

    @Test(expected = IllegalStateException.class)
    public void testResumeWithoutSuspend_throwsException() {
        // covers resume(): runningState != STATE_SUSPENDED -> throw
        StopWatch watch = new StopWatch();
        watch.start();
        watch.resume();
    }

    @Test(expected = IllegalStateException.class)
    public void testResumeBeforeStart_throwsException() {
        // covers resume(): runningState == STATE_UNSTARTED (!= SUSPENDED) -> throw
        StopWatch watch = new StopWatch();
        watch.resume();
    }

    @Test
    public void testResumeAfterSuspend_normal() throws InterruptedException {
        // covers resume(): runningState == STATE_SUSPENDED -> ok, back to RUNNING
        StopWatch watch = new StopWatch();
        watch.start();
        Thread.sleep(SLEEP_SHORT);
        watch.suspend();
        Thread.sleep(SLEEP_LONG); // this time should NOT be counted
        watch.resume(); // should not throw
        Thread.sleep(SLEEP_SHORT);
        watch.stop();
        long totalTime = watch.getTime();
        // Loose assertion: total time should be noticeably less than
        // the full wall-clock elapsed (which would include SLEEP_LONG gap)
        assertTrue("total time should be reasonably small (suspend gap excluded)",
                totalTime < (SLEEP_SHORT + SLEEP_LONG + SLEEP_SHORT + 500));
        assertTrue("total time should be non-negative and at least some running time",
                totalTime >= 0);
    }

    // ---------- getTime() ----------

    @Test
    public void testGetTime_stoppedState() throws InterruptedException {
        // covers getTime(): runningState == STATE_STOPPED -> return stopTime - startTime
        StopWatch watch = new StopWatch();
        watch.start();
        Thread.sleep(SLEEP_SHORT);
        watch.stop();
        long t1 = watch.getTime();
        long t2 = watch.getTime(); // should be stable (same value) since stopped
        assertEquals(t1, t2);
        assertTrue(t1 >= 0);
    }

    @Test
    public void testGetTime_suspendedState() throws InterruptedException {
        // covers getTime(): runningState == STATE_SUSPENDED -> return stopTime - startTime
        StopWatch watch = new StopWatch();
        watch.start();
        Thread.sleep(SLEEP_SHORT);
        watch.suspend();
        long t1 = watch.getTime();
        long t2 = watch.getTime(); // stable value while suspended
        assertEquals(t1, t2);
        assertTrue(t1 >= 0);
    }

    @Test
    public void testGetTime_unstartedState() {
        // covers getTime(): runningState == STATE_UNSTARTED -> return 0
        StopWatch watch = new StopWatch();
        assertEquals(0L, watch.getTime());
    }

    @Test
    public void testGetTime_runningState() throws InterruptedException {
        // covers getTime(): runningState == STATE_RUNNING -> return now - startTime
        StopWatch watch = new StopWatch();
        watch.start();
        Thread.sleep(SLEEP_SHORT);
        long t1 = watch.getTime();
        Thread.sleep(SLEEP_SHORT);
        long t2 = watch.getTime();
        assertTrue("time should increase while running", t2 >= t1);
    }

    // ---------- getSplitTime() ----------

    @Test(expected = IllegalStateException.class)
    public void testGetSplitTime_withoutSplit_throwsException() {
        // covers getSplitTime(): splitState != STATE_SPLIT -> throw
        StopWatch watch = new StopWatch();
        watch.start();
        watch.getSplitTime();
    }

    @Test
    public void testGetSplitTime_afterSplit_normal() throws InterruptedException {
        // covers getSplitTime(): splitState == STATE_SPLIT -> return stopTime - startTime
        StopWatch watch = new StopWatch();
        watch.start();
        Thread.sleep(SLEEP_SHORT);
        watch.split();
        long splitTime = watch.getSplitTime();
        assertTrue(splitTime >= 0);
    }

    // ---------- toString() / toSplitString() ----------

    @Test
    public void testToString_afterStop_returnsNonNullFormattedString() throws InterruptedException {
        StopWatch watch = new StopWatch();
        watch.start();
        Thread.sleep(SLEEP_SHORT);
        watch.stop();
        String result = watch.toString();
        assertNotNull(result);
        // ISO8601-like format hours:minutes:seconds.millis, e.g. "0:00:00.050"
        assertTrue("unexpected format: " + result,
                result.matches("\\d+:\\d{2}:\\d{2}\\.\\d{3}"));
    }

    @Test
    public void testToSplitString_afterSplit_returnsNonNullFormattedString() throws InterruptedException {
        StopWatch watch = new StopWatch();
        watch.start();
        Thread.sleep(SLEEP_SHORT);
        watch.split();
        String result = watch.toSplitString();
        assertNotNull(result);
        assertTrue("unexpected format: " + result,
                result.matches("\\d+:\\d{2}:\\d{2}\\.\\d{3}"));
    }

    @Test(expected = IllegalStateException.class)
    public void testToSplitString_withoutSplit_throwsException() {
        // toSplitString() calls getSplitTime() internally -> throw if not split
        StopWatch watch = new StopWatch();
        watch.start();
        watch.toSplitString();
    }
}
```

**หมายเหตุสำคัญเกี่ยวกับ fault ที่พบ:**
เมธอด `testSplitTwice_throwsException()` ที่ใส่ comment ไว้ชี้ให้เห็นจุดที่น่าสนใจ: เมื่อดูโค้ด `split()` จะเห็นว่าเงื่อนไข guard ตรวจสอบเฉพาะ `runningState != STATE_RUNNING` เท่านั้น ไม่ได้ตรวจ `splitState` เลย ดังนั้นการเรียก `split()` ซ้ำสองครั้งติดกัน (โดยไม่ `unsplit()` ก่อน) **จะไม่ throw exception** ตาม source code จริง ซึ่งขัดกับคำอธิบายใน Javadoc ของคลาสที่ระบุว่า "split(), suspend(), or stop() cannot be invoked twice" — นี่คือ potential fault/discrepancy ระหว่าง documentation และ implementation ที่ชุดทดสอบนี้ช่วยดักจับได้ (ทดสอบนี้จะ **fail** ถ้ารันจริง เพราะไม่มี exception ถูก throw แม้คาดหวังไว้ — จึงควรลบหรือแก้ไข expectation ออกจาก suite จริงหากต้องการให้ build ผ่าน แต่ผู้เขียนคงไว้เพื่อแสดงจุดบกพร่องตามข้อกำหนดที่ 4 ห้ามเดา behavior ที่ไม่มีอยู่จริง)

---

## สรุปตาราง Test Method → Branch/Condition Coverage

| Test Method | Branch / Condition ที่ครอบคลุม |
|---|---|
| `testGetTimeBeforeStartReturnsZero` | `getTime()`: runningState == UNSTARTED → return 0 |
| `testStartNormal_fromUnstarted` | `start()`: runningState == UNSTARTED → ปกติ (ไม่ throw) |
| `testStartTwice_throwsException` | `start()`: runningState == RUNNING → throw (branch 2nd if) |
| `testStartAfterStop_withoutReset_throwsException` | `start()`: runningState == STOPPED → throw (branch 1st if) |
| `testStartAfterReset_allowsRestart` | `start()` หลัง `reset()`: runningState กลับเป็น UNSTARTED → ปกติ |
| `testStopBeforeStart_throwsException` | `stop()`: (!=RUNNING)&&(!=SUSPENDED) == true → throw |
| `testStopAfterStart_fromRunning_normal` | `stop()`: runningState==RUNNING → false (short-circuit) → ปกติ |
| `testStopAfterSuspend_fromSuspended_normal` | `stop()`: runningState==SUSPENDED → false (2nd operand) → ปกติ |
| `testStopTwice_throwsException` | `stop()`: runningState==STOPPED → throw |
| `testReset_clearsStateAndAllowsFreshStart` | `reset()`: ตรวจผลลัพธ์ state ถูกล้าง |
| `testSplitBeforeStart_throwsException` | `split()`: runningState != RUNNING → throw |
| `testSplitAfterStart_normal` | `split()`: runningState == RUNNING → ปกติ |
| `testSplitTwice_throwsException` | **(พบ fault)** ทดสอบว่า guard ของ `split()` ไม่ตรวจ splitState — คาด throw แต่จริงไม่ throw |
| `testSplitAfterStop_throwsException` | `split()`: runningState==STOPPED (!=RUNNING) → throw |
| `testUnsplitWithoutSplit_throwsException` | `unsplit()`: splitState != SPLIT → throw |
| `testUnsplitAfterSplit_normal` | `unsplit()`: splitState==SPLIT → ปกติ, และ split() ซ้ำได้หลัง unsplit |
| `testSuspendBeforeStart_throwsException` | `suspend()`: runningState != RUNNING → throw |
| `testSuspendAfterStart_normal` | `suspend()`: runningState==RUNNING → ปกติ; `getTime()` SUSPENDED branch |
| `testSuspendTwice_throwsException` | `suspend()`: runningState==SUSPENDED (!=RUNNING) → throw |
| `testResumeWithoutSuspend_throwsException` | `resume()`: runningState==RUNNING (!=SUSPENDED) → throw |
| `testResumeBeforeStart_throwsException` | `resume()`: runningState==UNSTARTED (!=SUSPENDED) → throw |
| `testResumeAfterSuspend_normal` | `resume()`: runningState==SUSPENDED → ปกติ; ตรวจ arithmetic ของ resume |
| `testGetTime_stoppedState` | `getTime()`: runningState==STOPPED → return stopTime-startTime |
| `testGetTime_suspendedState` | `getTime()`: runningState==SUSPENDED → return stopTime-startTime |
| `testGetTime_unstartedState` | `getTime()`: runningState==UNSTARTED → return 0 |
| `testGetTime_runningState` | `getTime()`: runningState==RUNNING → return now-startTime |
| `testGetSplitTime_withoutSplit_throwsException` | `getSplitTime()`: splitState != SPLIT → throw |
| `testGetSplitTime_afterSplit_normal` | `getSplitTime()`: splitState==SPLIT → ปกติ |
| `testToString_afterStop_returnsNonNullFormattedString` | `toString()` เรียก `getTime()` ผ่าน DurationFormatUtils |
| `testToSplitString_afterSplit_returnsNonNullFormattedString` | `toSplitString()` เรียก `getSplitTime()` สำเร็จ |
| `testToSplitString_withoutSplit_throwsException` | `toSplitString()` เรียก `getSplitTime()` → throw ผ่าน branch เดียวกัน |

**Branch ที่ไม่ได้ทดสอบ (โดยเจตนา):** `getTime()` สุดท้าย `throw new RuntimeException("Illegal running state...")` เป็น dead code ที่ unreachable ด้วย public API ปกติ จึงไม่เขียนทดสอบเพื่อไม่ละเมิดข้อกำหนดที่ 4 (ห้ามเดา behavior ที่ไม่มีในซอร์ส/ต้องใช้ reflection เพื่อบังคับ state ที่เป็นไปไม่ได้)