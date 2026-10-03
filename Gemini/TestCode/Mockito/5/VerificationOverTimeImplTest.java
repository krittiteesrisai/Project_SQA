package org.mockito.internal.verification;

import org.junit.Test;
import org.mockito.exceptions.base.MockitoAssertionError;
import org.mockito.exceptions.verification.junit.ArgumentsAreDifferent;
import org.mockito.internal.util.Timer;
import org.mockito.internal.verification.api.VerificationData;
import org.mockito.verification.VerificationMode;

import static org.junit.Assert.*;

public class VerificationOverTimeImplTest {

    // --- Mock Implementation Helpers ---

    private static class DummyTimer extends Timer {
        private final boolean[] counts;
        private int index = 0;
        private boolean started = false;

        public DummyTimer(boolean... counts) {
            super(0);
            this.counts = counts;
        }

        @Override
        public void start() {
            this.started = true;
        }

        @Override
        public boolean isCounting() {
            if (index < counts.length) {
                return counts[index++];
            }
            return false;
        }
    }

    private static class DummyVerificationMode implements VerificationMode {
        private int callCount = 0;
        private AssertionError errorToThrow = null;

        public DummyVerificationMode() {}

        public DummyVerificationMode(AssertionError errorToThrow) {
            this.errorToThrow = errorToThrow;
        }

        @Override
        public void verify(VerificationData data) {
            callCount++;
            if (errorToThrow != null) {
                throw errorToThrow;
            }
        }
    }

    // --- Test Cases ---

    @Test
    public void testGettersAndConstructors() {
        VerificationMode delegate = new DummyVerificationMode();
        VerificationOverTimeImpl impl4 = new VerificationOverTimeImpl(10L, 50L, delegate, true);
        assertEquals(10L, impl4.getPollingPeriod());
        assertEquals(50L, impl4.getDuration());
        assertSame(delegate, impl4.getDelegate());

        Timer customTimer = new DummyTimer(false);
        VerificationOverTimeImpl impl5 = new VerificationOverTimeImpl(20L, 100L, delegate, false, customTimer);
        assertEquals(20L, impl5.getPollingPeriod());
        assertEquals(100L, impl5.getDuration());
        assertSame(delegate, impl5.getDelegate());
    }

    @Test
    public void testVerifyImmediatelyReturnsOnSuccessWhenReturnOnSuccessIsTrue() {
        DummyVerificationMode delegate = new DummyVerificationMode();
        DummyTimer timer = new DummyTimer(true, true);
        VerificationOverTimeImpl impl = new VerificationOverTimeImpl(1L, 10L, delegate, true, timer);

        impl.verify(null);

        assertTrue("Timer should be started", timer.started);
        assertEquals("Delegate should be verified once and return immediately", 1, delegate.callCount);
    }

    @Test
    public void testVerifyLoopsUntilTimerExpiresWhenReturnOnSuccessIsFalse() {
        DummyVerificationMode delegate = new DummyVerificationMode();
        DummyTimer timer = new DummyTimer(true, true, true, false);
        VerificationOverTimeImpl impl = new VerificationOverTimeImpl(1L, 10L, delegate, false, timer);

        impl.verify(null);

        assertTrue("Timer should be started", timer.started);
        assertEquals("Delegate should be verified for every true counting loop", 3, delegate.callCount);
    }

    @Test
    public void testVerifyThrowsMockitoAssertionErrorAfterTimeout() {
        MockitoAssertionError expectedError = new MockitoAssertionError("Defect simulation");
        DummyVerificationMode delegate = new DummyVerificationMode(expectedError);
        DummyTimer timer = new DummyTimer(true, false);
        VerificationOverTimeImpl impl = new VerificationOverTimeImpl(1L, 10L, delegate, true, timer);

        try {
            impl.verify(null);
            fail("Expected MockitoAssertionError to be thrown");
        } catch (MockitoAssertionError e) {
            assertSame(expectedError, e);
        }
        assertEquals(1, delegate.callCount);
    }

    @Test
    public void testVerifyThrowsArgumentsAreDifferentAfterTimeout() {
        ArgumentsAreDifferent expectedError = new ArgumentsAreDifferent("diff", "expected", "actual");
        DummyVerificationMode delegate = new DummyVerificationMode(expectedError);
        DummyTimer timer = new DummyTimer(true, false);
        VerificationOverTimeImpl impl = new VerificationOverTimeImpl(1L, 10L, delegate, true, timer);

        try {
            impl.verify(null);
            fail("Expected ArgumentsAreDifferent to be thrown");
        } catch (ArgumentsAreDifferent e) {
            assertSame(expectedError, e);
        }
        assertEquals(1, delegate.callCount);
    }

    @Test
    public void testCanRecoverFromFailureReturnsFalseForAtMost() {
        AtMost atMost = new AtMost(1);
        VerificationOverTimeImpl impl = new VerificationOverTimeImpl(1L, 10L, atMost, true);

        assertFalse("AtMost should not be recoverable", impl.canRecoverFromFailure(atMost));
    }

    @Test
    public void testCanRecoverFromFailureReturnsFalseForNoMoreInteractions() {
        NoMoreInteractions noMoreInteractions = new NoMoreInteractions();
        VerificationOverTimeImpl impl = new VerificationOverTimeImpl(1L, 10L, noMoreInteractions, true);

        assertFalse("NoMoreInteractions should not be recoverable", impl.canRecoverFromFailure(noMoreInteractions));
    }

    @Test
    public void testCanRecoverFromFailureReturnsTrueForGeneralMode() {
        VerificationMode customMode = new DummyVerificationMode();
        VerificationOverTimeImpl impl = new VerificationOverTimeImpl(1L, 10L, customMode, true);

        assertTrue("General VerificationMode should be recoverable", impl.canRecoverFromFailure(customMode));
    }

    @Test
    public void testVerifyThrowsImmediatelyWhenUnrecoverableAtMost() {
        MockitoAssertionError expectedError = new MockitoAssertionError("AtMost failure");
        AtMost atMost = new AtMost(1) {
            @Override
            public void verify(VerificationData data) {
                throw expectedError;
            }
        };
        DummyTimer timer = new DummyTimer(true, true, true);
        VerificationOverTimeImpl impl = new VerificationOverTimeImpl(1L, 10L, atMost, true, timer);

        try {
            impl.verify(null);
            fail("Expected immediate failure for AtMost");
        } catch (MockitoAssertionError e) {
            assertSame(expectedError, e);
        }
        // Should terminate immediately on the first iteration without exhausting the timer
        assertEquals(1, timer.index);
    }

    @Test
    public void testVerifyThrowsImmediatelyWhenUnrecoverableNoMoreInteractions() {
        MockitoAssertionError expectedError = new MockitoAssertionError("NoMoreInteractions failure");
        NoMoreInteractions noMoreInteractions = new NoMoreInteractions() {
            @Override
            public void verify(VerificationData data) {
                throw expectedError;
            }
        };
        DummyTimer timer = new DummyTimer(true, true, true);
        VerificationOverTimeImpl impl = new VerificationOverTimeImpl(1L, 10L, noMoreInteractions, true, timer);

        try {
            impl.verify(null);
            fail("Expected immediate failure for NoMoreInteractions");
        } catch (MockitoAssertionError e) {
            assertSame(expectedError, e);
        }
        assertEquals(1, timer.index);
    }

    @Test
    public void testSleepInterruptedHandlesExceptionQuietly() {
        MockitoAssertionError expectedError = new MockitoAssertionError("Interrupt test");
        DummyVerificationMode delegate = new DummyVerificationMode(expectedError);
        DummyTimer timer = new DummyTimer(true, false);
        VerificationOverTimeImpl impl = new VerificationOverTimeImpl(100L, 100L, delegate, true, timer);

        // Interrupt current thread before calling verify to trigger InterruptedException in sleep()
        Thread.currentThread().interrupt();

        try {
            impl.verify(null);
            fail("Expected MockitoAssertionError");
        } catch (MockitoAssertionError e) {
            assertSame(expectedError, e);
        } finally {
            // Clear interrupt status if still set
            Thread.interrupted();
        }
    }

    @Test
    public void testTimerInitiallyNotCountingDoesNotVerify() {
        DummyVerificationMode delegate = new DummyVerificationMode();
        DummyTimer timer = new DummyTimer(false);
        VerificationOverTimeImpl impl = new VerificationOverTimeImpl(1L, 10L, delegate, true, timer);

        impl.verify(null);

        assertEquals("Delegate should not be called if timer is not counting", 0, delegate.callCount);
    }
}