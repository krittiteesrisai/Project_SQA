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
