package org.apache.commons.math.ode.events;

import static org.junit.Assert.*;

import org.junit.Test;

import org.apache.commons.math.ConvergenceException;
import org.apache.commons.math.ode.DerivativeException;
import org.apache.commons.math.ode.sampling.StepInterpolator;

/**
 * JUnit 4 tests for {@link EventState} (Defects4J Math-78b).
 *
 * หมายเหตุสมมติฐาน (assumptions, ตามข้อกำหนดที่ 4):
 * 1) {@code EventHandler} สันนิษฐาน signature จากการเรียกใช้จริงใน EventState:
 *      double g(double t, double[] y) throws EventException
 *      int eventOccurred(double t, double[] y, boolean increasing) throws EventException
 *      void resetState(double t, double[] y) throws EventException
 *    และใช้ constant EventHandler.CONTINUE / STOP / RESET_STATE / RESET_DERIVATIVES
 *    ตรงตามที่ปรากฏใน source ของ EventState
 *
 * 2) {@code StepInterpolator} ใช้งานจริงใน EventState เพียง 4 เมธอด:
 *      isForward(), getCurrentTime(), setInterpolatedTime(double), getInterpolatedState()
 *    เมธอดอื่น ๆ ที่ interface อาจกำหนด (เช่น copy(), getPreviousTime(),
 *    getInterpolatedDerivatives(), getInterpolatedTime()) ไม่ได้ถูกใช้โดย EventState
 *    จึง implement แบบ dummy ไว้เผื่อ compile — เป็นการ "เดาโครงสร้าง interface"
 *    ที่ไม่มีอยู่ในซอร์สที่ให้มา หากไม่ตรงกับของจริงต้องปรับ signature
 */
public class EventStateTest {

    // ---- Test doubles -----------------------------------------------------

    /** ฟังก์ชัน g(t) อย่างง่ายสำหรับ handler (ไม่สนใจ y) */
    private interface Func {
        double value(double t);
    }

    private static class TestHandler implements EventHandler {
        Func func;
        int eventOccurredReturn = EventHandler.CONTINUE;
        boolean resetStateCalled = false;
        Boolean lastIncreasingArg = null;

        TestHandler(Func func) {
            this.func = func;
        }

        public double g(double t, double[] y) throws EventException {
            return func.value(t);
        }

        public int eventOccurred(double t, double[] y, boolean increasing) throws EventException {
            lastIncreasingArg = Boolean.valueOf(increasing);
            return eventOccurredReturn;
        }

        public void resetState(double t, double[] y) throws EventException {
            resetStateCalled = true;
        }
    }

    /**
     * Minimal test double สำหรับ StepInterpolator
     * (ดูหมายเหตุสมมติฐานด้านบนของคลาส)
     */
    private static class TestInterpolator implements StepInterpolator {
        private final boolean forward;
        private final double currentTime;
        private double interpolatedTime;

        TestInterpolator(boolean forward, double currentTime) {
            this.forward = forward;
            this.currentTime = currentTime;
        }

        public void setInterpolatedTime(double time) throws DerivativeException {
            this.interpolatedTime = time;
        }

        public double getInterpolatedTime() {
            return interpolatedTime;
        }

        public double[] getInterpolatedState() throws DerivativeException {
            return new double[] { 0.0 };
        }

        public double[] getInterpolatedDerivatives() throws DerivativeException {
            return new double[] { 0.0 };
        }

        public boolean isForward() {
            return forward;
        }

        public double getPreviousTime() {
            return 0.0;
        }

        public double getCurrentTime() {
            return currentTime;
        }

        public StepInterpolator copy() throws DerivativeException {
            return this;
        }
    }

    private static final double CONV = 1.0e-6;
    private static final int MAX_ITER = 100;

    // ---- Constructor / getters --------------------------------------------

    @Test
    public void testGettersBasic() {
        TestHandler handler = new TestHandler(new Func() {
            public double value(double t) { return -1; }
        });
        EventState es = new EventState(handler, 10.0, 0.001, 50);
        assertSame(handler, es.getEventHandler());
        assertEquals(10.0, es.getMaxCheckInterval(), 0.0);
        assertEquals(0.001, es.getConvergence(), 0.0);
        assertEquals(50, es.getMaxIterationCount());
    }

    @Test
    public void testConvergenceAbsoluteValue() {
        // ค่า convergence ลบ ต้องถูกเก็บเป็นค่า absolute (Math.abs(convergence))
        TestHandler handler = new TestHandler(new Func() {
            public double value(double t) { return -1; }
        });
        EventState es = new EventState(handler, 10.0, -0.005, 50);
        assertEquals(0.005, es.getConvergence(), 0.0);
    }

    // ---- reinitializeBegin -------------------------------------------------

    @Test
    public void testReinitializeBeginPositiveG0() throws Exception {
        TestHandler handler = new TestHandler(new Func() {
            public double value(double t) { return 2.0; }
        });
        EventState es = new EventState(handler, 10.0, CONV, MAX_ITER);
        es.reinitializeBegin(0.0, new double[] { 0.0 });
        TestInterpolator interp = new TestInterpolator(true, 1.0);
        assertFalse(es.evaluateStep(interp)); // g0Positive=true, gb>=0 -> no sign change
    }

    @Test
    public void testReinitializeBeginNegativeG0() throws Exception {
        TestHandler handler = new TestHandler(new Func() {
            public double value(double t) { return -2.0; }
        });
        EventState es = new EventState(handler, 10.0, CONV, MAX_ITER);
        es.reinitializeBegin(0.0, new double[] { 0.0 });
        TestInterpolator interp = new TestInterpolator(true, 1.0);
        assertFalse(es.evaluateStep(interp)); // g0Positive=false, gb<0 -> no sign change
    }

    @Test
    public void testReinitializeBeginZeroG0Boundary() throws Exception {
        // ขอบเขต g0 == 0 -> g0Positive ต้องเป็น true (0 >= 0)
        TestHandler handler = new TestHandler(new Func() {
            public double value(double t) { return 0.0; }
        });
        EventState es = new EventState(handler, 10.0, CONV, MAX_ITER);
        es.reinitializeBegin(0.0, new double[] { 0.0 });
        TestInterpolator interp = new TestInterpolator(true, 1.0);
        // ถ้า g0Positive ผิด (false) จะเกิด sign-change เท็จ และพยายามหา root ของฟังก์ชันศูนย์คงที่
        assertFalse(es.evaluateStep(interp));
    }

    // ---- evaluateStep: ไม่มี event -----------------------------------------

    @Test
    public void testEvaluateStepNoEventSingleSubstep() throws Exception {
        TestHandler handler = new TestHandler(new Func() {
            public double value(double t) { return 1.0; }
        });
        EventState es = new EventState(handler, 100.0, CONV, MAX_ITER);
        es.reinitializeBegin(0.0, new double[] { 0.0 });
        TestInterpolator interp = new TestInterpolator(true, 5.0);
        assertFalse(es.evaluateStep(interp));
        assertTrue(Double.isNaN(es.getEventTime()));
    }

    @Test
    public void testEvaluateStepNoEventMultipleSubsteps() throws Exception {
        // maxCheckInterval เล็ก -> n > 1 (วน loop หลายรอบ, ไม่มีสาขาใดเป็น event)
        TestHandler handler = new TestHandler(new Func() {
            public double value(double t) { return 1.0; }
        });
        EventState es = new EventState(handler, 1.0, CONV, MAX_ITER);
        es.reinitializeBegin(0.0, new double[] { 0.0 });
        TestInterpolator interp = new TestInterpolator(true, 10.0); // n = ceil(10/1) = 10
        assertFalse(es.evaluateStep(interp));
        assertTrue(Double.isNaN(es.getEventTime()));
    }

    @Test
    public void testEvaluateStepZeroLengthStep() throws Exception {
        // t1 == t0 -> ceil(0/maxCheck)=0 แต่ Math.max(1,...) บังคับให้ n=1
        TestHandler handler = new TestHandler(new Func() {
            public double value(double t) { return -1.0; }
        });
        EventState es = new EventState(handler, 10.0, CONV, MAX_ITER);
        es.reinitializeBegin(5.0, new double[] { 0.0 });
        TestInterpolator interp = new TestInterpolator(true, 5.0);
        assertFalse(es.evaluateStep(interp));
    }

    // ---- evaluateStep: มี event (sign change) ------------------------------

    @Test
    public void testEvaluateStepEventDetectedFirstTime() throws Exception {
        final double root = 5.0;
        TestHandler handler = new TestHandler(new Func() {
            public double value(double t) { return t - root; }
        });
        EventState es = new EventState(handler, 100.0, CONV, MAX_ITER);
        es.reinitializeBegin(0.0, new double[] { 0.0 }); // g0=-5 -> g0Positive=false
        TestInterpolator interp = new TestInterpolator(true, 10.0);
        assertTrue(es.evaluateStep(interp));
        assertEquals(root, es.getEventTime(), 1.0e-3);
    }

    @Test
    public void testEvaluateStepAlreadyWaitingAcceptStep() throws Exception {
        // สาขา: pendingEvent ถูกตั้งไว้แล้วจากรอบก่อน และ step ใหม่จบที่เวลา event เดิม
        // -> ต้อง accept step (return false)
        final double root = 5.0;
        TestHandler handler = new TestHandler(new Func() {
            public double value(double t) { return t - root; }
        });
        EventState es = new EventState(handler, 100.0, CONV, MAX_ITER);
        es.reinitializeBegin(0.0, new double[] { 0.0 });

        TestInterpolator interp1 = new TestInterpolator(true, 10.0);
        assertTrue(es.evaluateStep(interp1));
        double firstEventTime = es.getEventTime();

        TestInterpolator interp2 = new TestInterpolator(true, firstEventTime);
        assertFalse(es.evaluateStep(interp2));
    }

    @Test
    public void testEvaluateStepBackwardNoEvent() throws Exception {
        TestHandler handler = new TestHandler(new Func() {
            public double value(double t) { return -1.0; }
        });
        EventState es = new EventState(handler, 100.0, CONV, MAX_ITER);
        es.reinitializeBegin(10.0, new double[] { 0.0 });
        TestInterpolator interp = new TestInterpolator(false, 0.0); // backward: t1 < t0
        assertFalse(es.evaluateStep(interp));
    }

    @Test
    public void testEvaluateStepBackwardEventDetected() throws Exception {
        final double root = 5.0;
        TestHandler handler = new TestHandler(new Func() {
            public double value(double t) { return root - t; }
        });
        EventState es = new EventState(handler, 100.0, CONV, MAX_ITER);
        es.reinitializeBegin(10.0, new double[] { 0.0 }); // g0=-5 -> g0Positive=false
        TestInterpolator interp = new TestInterpolator(false, 0.0);
        assertTrue(es.evaluateStep(interp));
        assertEquals(root, es.getEventTime(), 1.0e-3);
    }

    @Test
    public void testEvaluateStepSecondDistinctEventAfterReset() throws Exception {
        // Lifecycle: ตรวจพบ event แรก -> stepAccepted (CONTINUE) -> reset() (คืน false, ล้าง pendingEvent)
        // -> reinitializeBegin ใหม่ด้วยฟังก์ชันที่มี root ห่างจาก previousEventTime มาก
        // -> ครอบคลุม branch previousEventTime != NaN แต่ diff > convergence (OR เงื่อนไขที่สอง)
        TestHandler handler = new TestHandler(new Func() {
            public double value(double t) { return t - 2.0; }
        });
        EventState es = new EventState(handler, 100.0, CONV, MAX_ITER);
        es.reinitializeBegin(0.0, new double[] { 0.0 });
        TestInterpolator interp1 = new TestInterpolator(true, 4.0);
        assertTrue(es.evaluateStep(interp1));
        assertEquals(2.0, es.getEventTime(), 1.0e-3);

        handler.eventOccurredReturn = EventHandler.CONTINUE;
        es.stepAccepted(2.0, new double[] { 0.0 }); // previousEventTime = 2.0
        assertFalse(es.reset(2.0, new double[] { 0.0 })); // CONTINUE -> reset() = false, pendingEvent ล้าง

        // เปลี่ยนฟังก์ชันสำหรับช่วงถัดไป ให้มี root ที่ 8 (ห่างจาก previousEventTime=2 เกิน convergence)
        handler.func = new Func() {
            public double value(double t) { return t - 8.0; }
        };
        es.reinitializeBegin(2.0, new double[] { 0.0 }); // g0Positive สอดคล้องจริงอีกครั้ง
        TestInterpolator interp2 = new TestInterpolator(true, 12.0);
        assertTrue(es.evaluateStep(interp2));
        assertEquals(8.0, es.getEventTime(), 1.0e-3);
    }

    // หมายเหตุ (requirement #4): สาขา "ignore ghost root" คือ
    //   if ((Math.abs(root - ta) <= convergence) && (Math.abs(root - previousEventTime) <= convergence))
    // เกี่ยวพันกับ numeric coincidence ของ BrentSolver ที่ไม่สามารถสร้างแบบ deterministic
    // ได้อย่างน่าเชื่อถือโดยไม่รันจริง และสอดคล้องกับ comment ในซอร์สที่ระบุว่า
    // "this should never happen" (จุดที่เกี่ยวข้องกับ defect ของ Math-78)
    // -> งดเขียนเทสสำหรับ branch นี้เพื่อไม่ guess พฤติกรรมที่ไม่ยืนยันได้

    @Test(expected = ConvergenceException.class)
    public void testEvaluateStepConvergenceExceptionWhenIterationsTooLow() throws Exception {
        // best-effort: maxIterationCount ต่ำเกินไปสำหรับ BrentSolver ในการลู่เข้า
        // หาก BrentSolver เวอร์ชันที่ใช้จริง ไม่ throw ConvergenceException ตามที่คาด
        // (เช่น ลู่เข้าได้ภายใน 1 iteration เพราะฟังก์ชันเชิงเส้น) อาจต้องปรับค่าหรือ assertion นี้
        final double root = 5.0;
        TestHandler handler = new TestHandler(new Func() {
            public double value(double t) { return t - root; }
        });
        EventState es = new EventState(handler, 100.0, CONV, 0); // maxIterationCount = 0
        es.reinitializeBegin(0.0, new double[] { 0.0 });
        TestInterpolator interp = new TestInterpolator(true, 10.0);
        es.evaluateStep(interp);
    }

    // ---- stepAccepted -------------------------------------------------------

    @Test
    public void testStepAcceptedNoPendingEventPositiveG() throws Exception {
        TestHandler handler = new TestHandler(new Func() {
            public double value(double t) { return 3.0; }
        });
        EventState es = new EventState(handler, 10.0, CONV, MAX_ITER);
        es.stepAccepted(1.0, new double[] { 0.0 });
        assertFalse(es.stop()); // nextAction == CONTINUE
    }

    @Test
    public void testStepAcceptedNoPendingEventNegativeG() throws Exception {
        TestHandler handler = new TestHandler(new Func() {
            public double value(double t) { return -3.0; }
        });
        EventState es = new EventState(handler, 10.0, CONV, MAX_ITER);
        es.stepAccepted(1.0, new double[] { 0.0 });
        assertFalse(es.stop());
    }

    @Test
    public void testStepAcceptedWithPendingEventForwardIncreasing() throws Exception {
        final double root = 5.0;
        TestHandler handler = new TestHandler(new Func() {
            public double value(double t) { return t - root; }
        });
        handler.eventOccurredReturn = EventHandler.STOP;
        EventState es = new EventState(handler, 100.0, CONV, MAX_ITER);
        es.reinitializeBegin(0.0, new double[] { 0.0 });
        TestInterpolator interp = new TestInterpolator(true, 10.0);
        assertTrue(es.evaluateStep(interp)); // increasing=true, forward=true

        es.stepAccepted(es.getEventTime(), new double[] { 0.0 });
        // !(increasing ^ forward) = !(true ^ true) = true
        assertEquals(Boolean.TRUE, handler.lastIncreasingArg);
        assertTrue(es.stop()); // nextAction == STOP
    }

    @Test
    public void testStepAcceptedWithPendingEventBackward() throws Exception {
        final double root = 5.0;
        TestHandler handler = new TestHandler(new Func() {
            public double value(double t) { return root - t; }
        });
        handler.eventOccurredReturn = EventHandler.CONTINUE;
        EventState es = new EventState(handler, 100.0, CONV, MAX_ITER);
        es.reinitializeBegin(10.0, new double[] { 0.0 });
        TestInterpolator interp = new TestInterpolator(false, 0.0);
        assertTrue(es.evaluateStep(interp)); // increasing=true, forward=false

        es.stepAccepted(es.getEventTime(), new double[] { 0.0 });
        // !(increasing ^ forward) = !(true ^ false) = false
        assertEquals(Boolean.FALSE, handler.lastIncreasingArg);
        assertFalse(es.stop()); // nextAction == CONTINUE
    }

    // ---- stop() ---------------------------------------------------------------

    @Test
    public void testStopDefaultFalse() {
        TestHandler handler = new TestHandler(new Func() {
            public double value(double t) { return 1.0; }
        });
        EventState es = new EventState(handler, 10.0, CONV, MAX_ITER);
        assertFalse(es.stop()); // ค่าเริ่มต้น nextAction = CONTINUE
    }

    // ---- reset() ----------------------------------------------------------------

    @Test
    public void testResetNoPendingEvent() throws Exception {
        TestHandler handler = new TestHandler(new Func() {
            public double value(double t) { return 1.0; }
        });
        EventState es = new EventState(handler, 10.0, CONV, MAX_ITER);
        assertFalse(es.reset(1.0, new double[] { 0.0 }));
        assertFalse(handler.resetStateCalled);
    }

    @Test
    public void testResetPendingEventResetState() throws Exception {
        final double root = 5.0;
        TestHandler handler = new TestHandler(new Func() {
            public double value(double t) { return t - root; }
        });
        handler.eventOccurredReturn = EventHandler.RESET_STATE;
        EventState es = new EventState(handler, 100.0, CONV, MAX_ITER);
        es.reinitializeBegin(0.0, new double[] { 0.0 });
        TestInterpolator interp = new TestInterpolator(true, 10.0);
        assertTrue(es.evaluateStep(interp));
        es.stepAccepted(es.getEventTime(), new double[] { 0.0 });

        boolean result = es.reset(es.getEventTime(), new double[] { 0.0 });
        assertTrue(result);
        assertTrue(handler.resetStateCalled);
        assertTrue(Double.isNaN(es.getEventTime()));
    }

    @Test
    public void testResetPendingEventResetDerivatives() throws Exception {
        final double root = 5.0;
        TestHandler handler = new TestHandler(new Func() {
            public double value(double t) { return t - root; }
        });
        handler.eventOccurredReturn = EventHandler.RESET_DERIVATIVES;
        EventState es = new EventState(handler, 100.0, CONV, MAX_ITER);
        es.reinitializeBegin(0.0, new double[] { 0.0 });
        TestInterpolator interp = new TestInterpolator(true, 10.0);
        assertTrue(es.evaluateStep(interp));
        es.stepAccepted(es.getEventTime(), new double[] { 0.0 });

        boolean result = es.reset(es.getEventTime(), new double[] { 0.0 });
        assertTrue(result);
        assertFalse(handler.resetStateCalled); // resetState ไม่ควรถูกเรียกสำหรับ RESET_DERIVATIVES
    }

    @Test
    public void testResetPendingEventContinueReturnsFalse() throws Exception {
        final double root = 5.0;
        TestHandler handler = new TestHandler(new Func() {
            public double value(double t) { return t - root; }
        });
        handler.eventOccurredReturn = EventHandler.CONTINUE;
        EventState es = new EventState(handler, 100.0, CONV, MAX_ITER);
        es.reinitializeBegin(0.0, new double[] { 0.0 });
        TestInterpolator interp = new TestInterpolator(true, 10.0);
        assertTrue(es.evaluateStep(interp));
        es.stepAccepted(es.getEventTime(), new double[] { 0.0 });

        boolean result = es.reset(es.getEventTime(), new double[] { 0.0 });
        assertFalse(result);
        assertFalse(handler.resetStateCalled);
    }
}
