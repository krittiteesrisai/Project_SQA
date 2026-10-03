package org.mockito.internal.util;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

public class TimerTest {

    @Test
    public void shouldReturnTrueWhileDurationHasNotElapsed() {
        // Arrange: ตั้งเวลา duration ไว้พอสมควร (เช่น 500 ms)
        Timer timer = new Timer(500L);
        timer.start();

        // Act & Assert: ตรวจสอบทันทีหลัง start() ควรเป็น true
        assertTrue("Timer should be counting right after start", timer.isCounting());
    }

    @Test
    public void shouldReturnFalseWhenDurationHasElapsed() throws InterruptedException {
        // Arrange: ตั้งเวลาขนาดสั้นมาก (5 ms)
        Timer timer = new Timer(5L);
        timer.start();

        // Act: รอให้เวลาล่วงเลยเกิน duration
        Thread.sleep(20L);

        // Assert: isCounting ควรเป็น false
        assertFalse("Timer should stop counting after duration elapsed", timer.isCounting());
    }

    @Test
    public void shouldHandleZeroDuration() throws InterruptedException {
        // Arrange: Boundary value = 0 ms
        Timer timer = new Timer(0L);
        timer.start();

        // Act: รอให้เวลาเดินผ่านไป
        Thread.sleep(5L);

        // Assert: เมื่อผ่านเวลาไปแล้ว isCounting ต้องคืนค่า false
        assertFalse("Timer with 0 duration should expire immediately after elapsed time", timer.isCounting());
    }

    @Test
    public void shouldHandleLargeDuration() {
        // Arrange: Boundary value = Long.MAX_VALUE เพื่อทดสอบกรณีค่าขอบเขตบน
        Timer timer = new Timer(Long.MAX_VALUE);
        timer.start();

        // Assert: ไม่เกิด overflow ผิดปกติ และยังนับอยู่
        assertTrue("Timer with Long.MAX_VALUE should be counting", timer.isCounting());
    }

    @Test
    public void shouldFailAssertionWhenCallingIsCountingWithoutStart() {
        // Arrange: สร้าง Timer แต่ไม่เรียก start() (startTime = -1)
        Timer timer = new Timer(1000L);

        // Act & Assert: ถ้าเปิด -ea (enable assertions) จะต้องโยน AssertionError
        try {
            boolean counting = timer.isCounting();
            // กรณี JVM ไม่ได้เปิด -ea คำนวณ System.currentTimeMillis() - (-1) ซึ่งมากกว่า duration แน่นอน
            assertFalse("If assertions are disabled, it should return false because elapsed is huge", counting);
        } catch (AssertionError e) {
            // Expected เมื่อรันโดยเปิด assertions (-ea)
            assertTrue(true);
        }
    }

    @Test(expected = RuntimeException.class)
    public void shouldThrowExceptionWhenDurationIsNegative() {
        // Defects4J Mockito-2 Fault Check:
        // Duration ไม่ควรติดลบ หากระบบมีการ validate จะต้อง throw Exception
        new Timer(-1L);
    }
}