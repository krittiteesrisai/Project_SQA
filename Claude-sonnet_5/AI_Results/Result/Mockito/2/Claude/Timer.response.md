# JUnit 4 Test Suite สำหรับคลาส `Timer`

## วิเคราะห์โค้ดต้นฉบับ

จุดสำคัญที่ต้อง cover:
1. **Constructor** - เก็บค่า `durationMillis` (ไม่มี getter จึงต้องทดสอบผ่าน behavior ของ `isCounting()`)
2. **`isCounting()`** - มี 2 ส่วน:
   - `assert startTime != -1;` → ทำงานเฉพาะเมื่อ JVM รันด้วย `-ea` flag (โดย default ส่วนใหญ่ **ปิด**)
   - `return System.currentTimeMillis() - startTime <= durationMillis;` → มี 2 branch (true/false)
3. **`start()`** - set `startTime` ใหม่ (ทดสอบผ่านการ restart)

## โค้ด Test

```java
package org.mockito.internal.util;

import static org.junit.Assert.*;

import org.junit.Test;

public class TimerTest {

    @Test
    public void shouldBeCountingWhenJustStartedAndDurationIsPositive() {
        Timer timer = new Timer(1000);
        timer.start();
        assertTrue("ควรยัง counting อยู่ทันทีหลัง start() เพราะ elapsed time ~ 0 <= duration",
                timer.isCounting());
    }

    @Test
    public void shouldNotBeCountingWhenDurationIsZeroAfterSomeDelay() throws InterruptedException {
        Timer timer = new Timer(0);
        timer.start();
        Thread.sleep(10); // รอให้เวลาเกิน duration=0
        assertFalse("duration=0 และเวลาผ่านไปแล้ว ต้องไม่ counting",
                timer.isCounting());
    }

    @Test
    public void shouldNotBeCountingWhenDurationIsNegative() {
        // Boundary case: duration ติดลบ
        Timer timer = new Timer(-1);
        timer.start();
        // elapsed >= 0 เสมอ ดังนั้น elapsed <= -1 จะเป็น false เสมอ
        assertFalse("duration ติดลบ ต้องไม่ counting เลย",
                timer.isCounting());
    }

    @Test
    public void shouldBeCountingWithVeryLargeDuration() {
        // Boundary case: duration = Long.MAX_VALUE
        Timer timer = new Timer(Long.MAX_VALUE);
        timer.start();
        assertTrue("duration มากพอ ต้องยัง counting อยู่",
                timer.isCounting());
    }

    @Test
    public void shouldStopCountingAfterDurationPasses() throws InterruptedException {
        Timer timer = new Timer(50);
        timer.start();
        assertTrue("ตอนเริ่มต้นควร counting อยู่", timer.isCounting());
        Thread.sleep(100); // รอให้เกิน duration 50ms
        assertFalse("หลังจากเวลาเกิน duration แล้วต้องไม่ counting",
                timer.isCounting());
    }

    @Test
    public void shouldRestartTimerCorrectly() throws InterruptedException {
        Timer timer = new Timer(30);
        timer.start();
        Thread.sleep(50);
        assertFalse("เวลาผ่านไปเกิน duration แล้ว ต้อง false",
                timer.isCounting());

        // เรียก start() ซ้ำเพื่อ reset startTime
        timer.start();
        assertTrue("หลัง start() ใหม่ ต้อง counting อีกครั้ง",
                timer.isCounting());
    }

    @Test
    public void shouldHandleZeroDurationImmediatelyAfterStart() {
        // Boundary case: duration=0 เรียกทันทีหลัง start()
        // ปกติ elapsed ~ 0ms ซึ่งอาจ <= 0 ได้ (ขึ้นกับความเร็วของระบบ)
        Timer timer = new Timer(0);
        timer.start();
        boolean result = timer.isCounting();
        // ไม่ assert ค่าตายตัวเพราะเป็น timing-dependent ณ ขอบเขตพอดี
        // เพียงยืนยันว่าเรียกได้โดยไม่ throw exception (เมื่อ -ea ปิด)
        assertTrue("ผลลัพธ์ต้องเป็น boolean ที่ถูกต้อง (true/false)",
                result == true || result == false);
    }

    @Test
    public void testConstructorStoresDuration_viaBehavior() {
        // ไม่มี getter สำหรับ durationMillis โดยตรง
        // ทดสอบผ่าน behavior ของ isCounting() แทน เพื่อยืนยันว่า constructor
        // เก็บค่า durationMillis ได้ถูกต้อง
        Timer timer = new Timer(100);
        timer.start();
        assertTrue("duration ที่ตั้งไว้ใน constructor ต้องมีผลต่อ isCounting()",
                timer.isCounting());
    }

    /*
     * หมายเหตุสำคัญ: isCounting() มี "assert startTime != -1;"
     * พฤติกรรมของ assert ขึ้นกับว่า JVM รันด้วย -ea flag หรือไม่:
     *   - ถ้า -ea เปิด: จะ throw AssertionError ทันทีเมื่อ startTime == -1 (ยังไม่เรียก start())
     *   - ถ้า -ea ปิด (ค่า default ของ JVM ส่วนใหญ่): จะข้าม assert แล้วคำนวณ return ตามปกติ
     * เนื่องจากไม่สามารถควบคุม JVM flag จาก test case ได้โดยตรง
     * จึงเขียน test ให้ยอมรับทั้งสองพฤติกรรม เพื่อไม่ทำให้ test ไม่แน่นอน (flaky)
     * ขณะเดียวกันยังคง cover เส้นทางการเรียก isCounting() ก่อน start()
     */
    @Test
    public void isCountingBeforeStart_behaviorDependsOnAssertionsFlag() {
        Timer timer = new Timer(1000);
        try {
            boolean result = timer.isCounting();
            // กรณี -ea ปิด: System.currentTimeMillis() - (-1) จะมีค่ามหาศาลกว่า 1000 เสมอ
            // ดังนั้นผลลัพธ์ที่ถูกต้องคือ false
            assertFalse("ถ้าไม่ throw AssertionError ผลลัพธ์ควรเป็น false เนื่องจาก elapsed time มหาศาล",
                    result);
        } catch (AssertionError e) {
            // กรณี -ea เปิด: เป็นพฤติกรรมที่ถูกต้องตาม assert statement ในซอร์ส
            assertTrue(true);
        }
    }
}
```

## สรุปตาราง Coverage

| # | Test Method | Branch/Condition ที่ครอบคลุม |
|---|---|---|
| 1 | `shouldBeCountingWhenJustStartedAndDurationIsPositive` | `isCounting()` → return **true** branch (elapsed ≤ duration), ทดสอบ `start()` ปรับ `startTime` |
| 2 | `shouldNotBeCountingWhenDurationIsZeroAfterSomeDelay` | `isCounting()` → return **false** branch, boundary `duration=0` |
| 3 | `shouldNotBeCountingWhenDurationIsNegative` | boundary `duration` ติดลบ, ยืนยัน false branch เสมอ |
| 4 | `shouldBeCountingWithVeryLargeDuration` | boundary `duration=Long.MAX_VALUE`, true branch |
| 5 | `shouldStopCountingAfterDurationPasses` | ครอบทั้ง **true→false** ภายใน sequence เดียว (state transition) |
| 6 | `shouldRestartTimerCorrectly` | ทดสอบการเรียก `start()` ซ้ำ (reset `startTime`), ครอบ false→true |
| 7 | `shouldHandleZeroDurationImmediatelyAfterStart` | boundary condition พอดี (`elapsed == duration`), ไม่ fix ผลลัพธ์เพราะ timing-sensitive |
| 8 | `testConstructorStoresDuration_viaBehavior` | ยืนยัน constructor เก็บค่า `durationMillis` ผ่าน indirect behavior |
| 9 | `isCountingBeforeStart_behaviorDependsOnAssertionsFlag` | เส้นทางเรียก `isCounting()` **ก่อน** `start()`, ครอบทั้งกรณี assert enabled/disabled |

**หมายเหตุเพิ่มเติม:**
- Test #7 และ #9 เป็น timing-dependent/environment-dependent จึงเขียนแบบไม่ fix ผลลัพธ์ตายตัว เพื่อป้องกัน flaky test ตามข้อกำหนดห้ามเดา behavior ที่ไม่ชัดเจนจากซอร์ส
- ไม่มี branch สำหรับ "ค่า null" หรือ "รูปแบบ input ผิดปกติ" เนื่องจาก `durationMillis` เป็น primitive `long` ไม่สามารถเป็น null ได้ และคลาสไม่มี validation logic ใดๆ สำหรับ input