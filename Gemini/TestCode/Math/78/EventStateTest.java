package org.apache.commons.math.ode.events;

import org.apache.commons.math.ConvergenceException;
import org.apache.commons.math.FunctionEvaluationException;
import org.apache.commons.math.analysis.UnivariateRealFunction;
import org.apache.commons.math.ode.DerivativeException;
import org.apache.commons.math.ode.sampling.StepInterpolator;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * JUnit 4 Test class for EventState (Defects4J Math-78).
 * Focuses on high branch/condition coverage and edge cases.
 */
public class EventStateTest {

    private EventHandler mockHandler;
    private EventState eventState;
    
    @Before
    public void setUp() {
        mockHandler = new DummyEventHandler();
        // maxCheckInterval = 1.0, convergence = 1e-6, maxIterationCount = 100
        eventState = new EventState(mockHandler, 1.0, 1e-6, 100);
    }

    @Test
    public void testConstructorAndGetters() {
        Assert.assertEquals(mockHandler, eventState.getEventHandler());
        Assert.assertEquals(1.0, eventState.getMaxCheckInterval(), 1e-12);
        Assert.assertEquals(1e-6, eventState.getConvergence(), 1e-12);
        Assert.assertEquals(100, eventState.getMaxIterationCount());
    }

    @Test
    public void testReinitializeBeginPositiveAndNegative() throws EventException {
        // g0 >= 0 case
        ((DummyEventHandler) mockHandler).setGValue(1.5);
        eventState.reinitializeBegin(0.0, new double[]{0.0});
        
        // g0 < 0 case
        ((DummyEventHandler) mockHandler).setGValue(-1.5);
        eventState.reinitializeBegin(0.0, new double[]{0.0});
    }

    @Test
    public void testEvaluateStepNoEvent() throws Exception {
        ((DummyEventHandler) mockHandler).setGValue(1.0);
        eventState.reinitializeBegin(0.0, new double[]{0.0});

        DummyStepInterpolator interpolator = new DummyStepInterpolator(0.0, 1.0, true, 1.0);
        boolean hasEvent = eventState.evaluateStep(interpolator);

        Assert.assertFalse(hasEvent);
        Assert.assertFalse(eventState.stop());
    }

    @Test
    public void testEvaluateStepWithSignChangeForward() throws Exception {
        // Start with positive g, end with negative g (Sign change -> Event)
        ((DummyEventHandler) mockHandler).setGValue(1.0);
        eventState.reinitializeBegin(0.0, new double[]{0.0});

        DummyStepInterpolator interpolator = new DummyStepInterpolator(0.0, 1.0, true, -1.0);
        boolean hasEvent = eventState.evaluateStep(interpolator);

        Assert.assertTrue(hasEvent);
        Assert.assertTrue(Double.isNaN(eventState.getEventTime()) == false);
    }

    @Test
    public void testEvaluateStepWithSignChangeBackward() throws Exception {
        ((DummyEventHandler) mockHandler).setGValue(-1.0);
        eventState.reinitializeBegin(1.0, new double[]{0.0});

        DummyStepInterpolator interpolator = new DummyStepInterpolator(1.0, 0.0, false, 1.0);
        boolean hasEvent = eventState.evaluateStep(interpolator);

        Assert.assertTrue(hasEvent);
    }

    @Test
    public void testStepAcceptedWithPendingEvent() throws Exception {
        ((DummyEventHandler) mockHandler).setGValue(1.0);
        eventState.reinitializeBegin(0.0, new double[]{0.0});

        DummyStepInterpolator interpolator = new DummyStepInterpolator(0.0, 1.0, true, -1.0);
        eventState.evaluateStep(interpolator);

        // Accept step where event occurred
        eventState.stepAccepted(0.5, new double[]{0.0});
        Assert.assertFalse(eventState.stop());
    }

    @Test
    public void testStepAcceptedWithoutPendingEvent() throws Exception {
        ((DummyEventHandler) mockHandler).setGValue(1.0);
        eventState.reinitializeBegin(0.0, new double[]{0.0});

        DummyStepInterpolator interpolator = new DummyStepInterpolator(0.0, 1.0, true, 1.0);
        eventState.evaluateStep(interpolator);

        eventState.stepAccepted(1.0, new double[]{0.0});
        Assert.assertFalse(eventState.stop());
    }

    @Test
    public void testResetWithoutPendingEvent() throws Exception {
        boolean resetResult = eventState.reset(1.0, new double[]{0.0});
        Assert.assertFalse(resetResult);
    }

    @Test
    public void testResetWithResetStateAction() throws Exception {
        ((DummyEventHandler) mockHandler).setGValue(1.0);
        eventState.reinitializeBegin(0.0, new double[]{0.0});

        DummyStepInterpolator interpolator = new DummyStepInterpolator(0.0, 1.0, true, -1.0);
        eventState.evaluateStep(interpolator);
        eventState.stepAccepted(0.5, new double[]{0.0});

        // Set action to RESET_STATE via specific handler behavior
        ((DummyEventHandler) mockHandler).setNextAction(EventHandler.RESET_STATE);
        
        boolean resetResult = eventState.reset(0.5, new double[]{0.0});
        Assert.assertTrue(resetResult);
    }

    @Test
    public void testResetWithResetDerivativesAction() throws Exception {
        ((DummyEventHandler) mockHandler).setGValue(1.0);
        eventState.reinitializeBegin(0.0, new double[]{0.0});

        DummyStepInterpolator interpolator = new DummyStepInterpolator(0.0, 1.0, true, -1.0);
        eventState.evaluateStep(interpolator);
        eventState.stepAccepted(0.5, new double[]{0.0});

        ((DummyEventHandler) mockHandler).setNextAction(EventHandler.RESET_DERIVATIVES);
        
        boolean resetResult = eventState.reset(0.5, new double[]{0.0});
        Assert.assertTrue(resetResult);
    }

    @Test(expected = DerivativeException.class)
    public void testEvaluateStepDerivativeExceptionMapping() throws Exception {
        ((DummyEventHandler) mockHandler).setGValue(1.0);
        eventState.reinitializeBegin(0.0, new double[]{0.0});

        DummyStepInterpolator interpolator = new ThrowingStepInterpolator(0.0, 1.0, true, new DerivativeException("Derivative error"));
        eventState.evaluateStep(interpolator);
    }

    @Test(expected = EventException.class)
    public void testEvaluateStepEventExceptionMapping() throws Exception {
        ((DummyEventHandler) mockHandler).setGValue(1.0);
        eventState.reinitializeBegin(0.0, new double[]{0.0});

        DummyStepInterpolator interpolator = new ThrowingStepInterpolator(0.0, 1.0, true, new EventException("Event error"));
        eventState.evaluateStep(interpolator);
    }

    // --- Helper Dummy Classes to satisfy interfaces without external Mockito ---

    private static class DummyEventHandler implements EventHandler {
        private double gValue = 0.0;
        private int nextAction = EventHandler.CONTINUE;

        public void setGValue(double gValue) {
            this.gValue = gValue;
        }

        public void setNextAction(int nextAction) {
            this.nextAction = nextAction;
        }

        public void resetState(double t, double[] y) throws EventException {}

        public double g(double t, double[] y) throws EventException {
            // Can simulate time-dependent g for root solving
            return gValue + t; 
        }

        public int eventOccurred(double t, double[] y, boolean increasing) throws EventException {
            return nextAction;
        }
    }

    private static class DummyStepInterpolator implements StepInterpolator {
        private final double t0;
        private final double t1;
        private final boolean forward;
        private double currentTime;
        private double currentG;

        public DummyStepInterpolator(double t0, double t1, boolean forward, double currentG) {
            this.t0 = t0;
            this.t1 = t1;
            this.forward = forward;
            this.currentTime = t0;
            this.currentG = currentG;
        }

        public boolean isForward() { return forward; }
        public double getCurrentTime() { return t1; }
        public double getPreviousTime() { return t0; }
        public double getInterpolatedTime() { return currentTime; }
        public void setInterpolatedTime(double time) { this.currentTime = time; }
        public double[] getInterpolatedState() { return new double[]{0.0}; }
        public double[] getInterpolatedDerivatives() { return new double[]{0.0}; }
        public boolean isFinal() { return false; }
        public StepInterpolator copy() throws DerivativeException { return this; }
        public void writeExternal(java.io.ObjectOutput out) {}
        public void readExternal(java.io.ObjectInput in) {}
    }

    private static class ThrowingStepInterpolator extends DummyStepInterpolator {
        private final Exception exceptionToThrow;

        public ThrowingStepInterpolator(double t0, double t1, boolean forward, Exception e) {
            super(t0, t1, forward, -1.0);
            this.exceptionToThrow = e;
        }

        @Override
        public void setInterpolatedTime(double time) {
            // Trigger exception during function evaluation via UnivariateRealFunction
        }

        @Override
        public double[] getInterpolatedState() {
            if (exceptionToThrow instanceof DerivativeException) {
                // Wrapper to be caught as FunctionEvaluationException cause
                throw new RuntimeException(new FunctionEvaluationException((DerivativeException) exceptionToThrow, 0.0));
            } else {
                throw new RuntimeException(new FunctionEvaluationException((EventException) exceptionToThrow, 0.0));
            }
        }
    }
}