package org.apache.commons.lang.time;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StopWatchTest {

    private StopWatch watch;

    @Before
    public void setUp() {
        watch = new StopWatch();
    }

    // ==========================================
    // 1. Initial State & getTime() / toString()
    // ==========================================

    @Test
    public void testInitialState() {
        assertEquals("Initial time should be 0", 0, watch.getTime());
        assertEquals("00:00:00.000", watch.toString());
    }

    // ==========================================
    // 2. start() Branch Coverage & State Errors
    // ==========================================

    @Test
    public void testStartSimple() throws InterruptedException {
        watch.start();
        Thread.sleep(50);
        long time = watch.getTime();
        assertTrue("Time should be >= 40ms", time >= 40);
        assertTrue("Time should be < 500ms", time < 500);
    }

    @Test(expected = IllegalStateException.class)
    public void testStartWhenAlreadyRunningThrowsException() {
        watch.start();
        watch.start();
    }

    @Test(expected = IllegalStateException.class)
    public void testStartWhenStoppedWithoutResetThrowsException() {
        watch.start();
        watch.stop();
        watch.start();
    }

    @Test(expected = IllegalStateException.class)
    public void testStartWhenSuspendedThrowsException() {
        watch.start();
        watch.suspend();
        watch.start();
    }

    // ==========================================
    // 3. stop() Branch Coverage & Lang-55 Fault
    // ==========================================

    @Test(expected = IllegalStateException.class)
    public void testStopWhenUnstartedThrowsException() {
        watch.stop();
    }

    @Test(expected = IllegalStateException.class)
    public void testStopWhenAlreadyStoppedThrowsException() {
        watch.start();
        watch.stop();
        watch.stop();
    }

    @Test
    public void testStopWhenRunning() throws InterruptedException {
        watch.start();
        Thread.sleep(50);
        watch.stop();
        long stoppedTime = watch.getTime();
        Thread.sleep(50);
        assertEquals("Time should freeze after stop", stoppedTime, watch.getTime());
    }

    /**
     * Target Defect (Lang-55):
     * Calling stop() after suspend() should preserve the suspended time
     * and not overwrite stopTime with System.currentTimeMillis().
     */
    @Test
    public void testStopWhenSuspendedDoesNotIncludeSuspendedInterval() throws InterruptedException {
        watch.start();
        Thread.sleep(50);
        watch.suspend();
        long suspendTime = watch.getTime();
        Thread.sleep(100);
        watch.stop();
        long finalTime = watch.getTime();

        assertEquals("Stopping while suspended should retain suspend time", suspendTime, finalTime);
    }

    // ==========================================
    // 4. reset() Coverage
    // ==========================================

    @Test
    public void testResetFromRunning() throws InterruptedException {
        watch.start();
        Thread.sleep(30);
        watch.reset();
        assertEquals("Time should be 0 after reset", 0, watch.getTime());

        // Should allow start again
        watch.start();
        Thread.sleep(30);
        assertTrue("Should run after reset and restart", watch.getTime() >= 20);
    }

    @Test
    public void testResetFromStopped() {
        watch.start();
        watch.stop();
        watch.reset();
        assertEquals(0, watch.getTime());
        watch.start();
        assertTrue(watch.getTime() >= 0);
    }

    // ==========================================
    // 5. split() and unsplit() Branch Coverage
    // ==========================================

    @Test(expected = IllegalStateException.class)
    public void testSplitWhenUnstartedThrowsException() {
        watch.split();
    }

    @Test(expected = IllegalStateException.class)
    public void testSplitWhenStoppedThrowsException() {
        watch.start();
        watch.stop();
        watch.split();
    }

    @Test(expected = IllegalStateException.class)
    public void testSplitWhenSuspendedThrowsException() {
        watch.start();
        watch.suspend();
        watch.split();
    }

    @Test(expected = IllegalStateException.class)
    public void testUnsplitWhenNotSplitThrowsException() {
        watch.start();
        watch.unsplit();
    }

    @Test(expected = IllegalStateException.class)
    public void testGetSplitTimeWhenNotSplitThrowsException() {
        watch.start();
        watch.getSplitTime();
    }

    @Test(expected = IllegalStateException.class)
    public void testToSplitStringWhenNotSplitThrowsException() {
        watch.start();
        watch.toSplitString();
    }

    @Test
    public void testSplitAndUnsplitLifecycle() throws InterruptedException {
        watch.start();
        Thread.sleep(50);
        watch.split();
        long splitTime = watch.getSplitTime();
        String splitStr = watch.toSplitString();
        assertNotNull(splitStr);

        Thread.sleep(50);
        assertEquals("Split time should remain constant", splitTime, watch.getSplitTime());
        assertTrue("Current running time should be greater than split time", watch.getTime() > splitTime);

        watch.unsplit();
        // Unsplit cleared the split state; calling getSplitTime now must throw
        try {
            watch.getSplitTime();
            fail("Expected IllegalStateException after unsplit");
        } catch (IllegalStateException expected) {
            // Success
        }

        watch.stop();
    }

    // ==========================================
    // 6. suspend() and resume() Branch Coverage
    // ==========================================

    @Test(expected = IllegalStateException.class)
    public void testSuspendWhenUnstartedThrowsException() {
        watch.suspend();
    }

    @Test(expected = IllegalStateException.class)
    public void testSuspendWhenStoppedThrowsException() {
        watch.start();
        watch.stop();
        watch.suspend();
    }

    @Test(expected = IllegalStateException.class)
    public void testSuspendWhenAlreadySuspendedThrowsException() {
        watch.start();
        watch.suspend();
        watch.suspend();
    }

    @Test(expected = IllegalStateException.class)
    public void testResumeWhenUnstartedThrowsException() {
        watch.resume();
    }

    @Test(expected = IllegalStateException.class)
    public void testResumeWhenRunningThrowsException() {
        watch.start();
        watch.resume();
    }

    @Test(expected = IllegalStateException.class)
    public void testResumeWhenStoppedThrowsException() {
        watch.start();
        watch.stop();
        watch.resume();
    }

    @Test
    public void testSuspendAndResumeLifecycle() throws InterruptedException {
        watch.start();
        Thread.sleep(50);
        watch.suspend();
        long suspendedTime = watch.getTime();
        Thread.sleep(100);
        assertEquals("Time must not advance while suspended", suspendedTime, watch.getTime());

        watch.resume();
        Thread.sleep(50);
        long resumedTotalTime = watch.getTime();
        assertTrue("Resumed total time should exclude the suspended gap", resumedTotalTime < 140);
        assertTrue("Resumed total time should be >= 80ms", resumedTotalTime >= 80);

        watch.stop();
    }

    // ==========================================
    // 7. toString() Formats
    // ==========================================

    @Test
    public void testToStringFormatting() throws InterruptedException {
        watch.start();
        Thread.sleep(20);
        watch.stop();
        String formatted = watch.toString();
        assertNotNull(formatted);
        assertTrue("Formatted string should match HH:mm:ss.SSS pattern",
                formatted.matches("\\d{2}:\\d{2}:\\d{2}\\.\\d{3}"));
    }
}