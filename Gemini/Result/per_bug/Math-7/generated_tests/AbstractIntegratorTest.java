package org.apache.commons.math3.ode;

import java.util.Collection;
import org.apache.commons.math3.analysis.solvers.BracketingNthOrderBrentSolver;
import org.apache.commons.math3.exception.DimensionMismatchException;
import org.apache.commons.math3.exception.MaxCountExceededException;
import org.apache.commons.math3.exception.NumberIsTooSmallException;
import org.apache.commons.math3.ode.events.EventHandler;
import org.apache.commons.math3.ode.sampling.AbstractStepInterpolator;
import org.apache.commons.math3.ode.sampling.StepHandler;
import org.apache.commons.math3.ode.sampling.StepInterpolator;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class AbstractIntegratorTest {

    private ConcreteTestIntegrator integrator;

    @Before
    public void setUp() {
        integrator = new ConcreteTestIntegrator("TestIntegrator");
    }

    // ==========================================
    // 1. Constructor & Basic Properties Tests
    // ==========================================

    @Test
    public void testDefaultConstructorAndName() {
        ConcreteTestIntegrator defaultIntegrator = new ConcreteTestIntegrator();
        Assert.assertNull(defaultIntegrator.getName());
        Assert.assertEquals("TestIntegrator", integrator.getName());
        Assert.assertTrue(Double.isNaN(integrator.getCurrentStepStart()));
        Assert.assertTrue(Double.isNaN(integrator.getCurrentSignedStepsize()));
    }

    @Test
    public void testMaxEvaluationsBranches() {
        // Branch: maxEvaluations < 0 -> Integer.MAX_VALUE
        integrator.setMaxEvaluations(-1);
        Assert.assertEquals(Integer.MAX_VALUE, integrator.getMaxEvaluations());

        integrator.setMaxEvaluations(-100);
        Assert.assertEquals(Integer.MAX_VALUE, integrator.getMaxEvaluations());

        // Branch: maxEvaluations >= 0
        integrator.setMaxEvaluations(0);
        Assert.assertEquals(0, integrator.getMaxEvaluations());

        integrator.setMaxEvaluations(50);
        Assert.assertEquals(50, integrator.getMaxEvaluations());
    }

    @Test
    public void testStepHandlerManagement() {
        Assert.assertEquals(0, integrator.getStepHandlers().size());

        StepHandler handler1 = new DummyStepHandler();
        StepHandler handler2 = new DummyStepHandler();

        integrator.addStepHandler(handler1);
        integrator.addStepHandler(handler2);
        Assert.assertEquals(2, integrator.getStepHandlers().size());

        integrator.clearStepHandlers();
        Assert.assertEquals(0, integrator.getStepHandlers().size());
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testStepHandlersUnmodifiable() {
        integrator.getStepHandlers().add(new DummyStepHandler());
    }

    @Test
    public void testEventHandlerManagement() {
        Assert.assertEquals(0, integrator.getEventHandlers().size());

        EventHandler eh1 = new DummyEventHandler(10.0, EventHandler.Action.CONTINUE);
        EventHandler eh2 = new DummyEventHandler(20.0, EventHandler.Action.STOP);

        // Add with default solver
        integrator.addEventHandler(eh1, 1.0, 1e-6, 100);
        // Add with explicit solver
        integrator.addEventHandler(eh2, 1.0, 1e-6, 100, new BracketingNthOrderBrentSolver(1e-6, 5));

        Collection<EventHandler> handlers = integrator.getEventHandlers();
        Assert.assertEquals(2, handlers.size());
        Assert.assertTrue(handlers.contains(eh1));
        Assert.assertTrue(handlers.contains(eh2));

        integrator.clearEventHandlers();
        Assert.assertEquals(0, integrator.getEventHandlers().size());
    }

    // ==========================================
    // 2. Integration Dimension & Execution Tests
    // ==========================================

    @Test(expected = DimensionMismatchException.class)
    public void testIntegrateDimensionMismatchY0() {
        FirstOrderDifferentialEquations ode = new SimpleODE(2);
        double[] y0 = new double[1]; // Expected 2
        double[] y = new double[2];
        integrator.integrate(ode, 0.0, y0, 1.0, y);
    }

    @Test(expected = DimensionMismatchException.class)
    public void testIntegrateDimensionMismatchY() {
        FirstOrderDifferentialEquations ode = new SimpleODE(2);
        double[] y0 = new double[2];
        double[] y = new double[3]; // Expected 2
        integrator.integrate(ode, 0.0, y0, 1.0, y);
    }

    @Test
    public void testIntegrateSuccessfulRun() {
        FirstOrderDifferentialEquations ode = new SimpleODE(1);
        double[] y0 = new double[] { 2.0 };
        double[] y = new double[1];

        double finalTime = integrator.integrate(ode, 0.0, y0, 5.0, y);
        Assert.assertEquals(5.0, finalTime, 1e-12);
        Assert.assertEquals(2.0, y[0], 1e-12);
    }

    // ==========================================
    // 3. Evaluation Counter & Derivative Tests
    // ==========================================

    @Test
    public void testComputeDerivativesIncrementsEvaluations() {
        SimpleODE ode = new SimpleODE(1);
        ExpandableStatefulODE expandable = new ExpandableStatefulODE(ode);
        integrator.setEquations(expandable);

        integrator.setMaxEvaluations(2);
        Assert.assertEquals(0, integrator.getEvaluations());

        double[] y = new double[] { 1.0 };
        double[] yDot = new double[1];

        integrator.computeDerivatives(0.0, y, yDot);
        Assert.assertEquals(1, integrator.getEvaluations());

        integrator.computeDerivatives(0.5, y, yDot);
        Assert.assertEquals(2, integrator.getEvaluations());
    }

    @Test(expected = MaxCountExceededException.class)
    public void testComputeDerivativesExceedsMaxEvaluations() {
        SimpleODE ode = new SimpleODE(1);
        ExpandableStatefulODE expandable = new ExpandableStatefulODE(ode);
        integrator.setEquations(expandable);

        integrator.setMaxEvaluations(1);
        double[] y = new double[] { 1.0 };
        double[] yDot = new double[1];

        integrator.computeDerivatives(0.0, y, yDot); // 1st: OK
        integrator.computeDerivatives(0.1, y, yDot); // 2nd: Exceeds
    }

    // ==========================================
    // 4. Sanity Checks Tests (Boundary / Interval)
    // ==========================================

    @Test(expected = NumberIsTooSmallException.class)
    public void testSanityChecksTooSmallIntegrationInterval() {
        SimpleODE ode = new SimpleODE(1);
        ExpandableStatefulODE expandable = new ExpandableStatefulODE(ode);
        expandable.setTime(1.0);

        // dt is 0.0, which is <= threshold
        integrator.sanityChecks(expandable, 1.0);
    }

    @Test
    public void testSanityChecksValidInterval() {
        SimpleODE ode = new SimpleODE(1);
        ExpandableStatefulODE expandable = new ExpandableStatefulODE(ode);
        expandable.setTime(1.0);

        // Valid interval dt = 0.5 > threshold
        integrator.sanityChecks(expandable, 1.5);
    }

    // ==========================================
    // 5. InitIntegration Tests
    // ==========================================

    @Test
    public void testInitIntegrationInitializesHandlers() {
        DummyStepHandler stepHandler = new DummyStepHandler();
        DummyEventHandler eventHandler = new DummyEventHandler(2.5, EventHandler.Action.CONTINUE);

        integrator.addStepHandler(stepHandler);
        integrator.addEventHandler(eventHandler, 1.0, 1e-6, 100);

        double[] y0 = new double[] { 1.0 };
        integrator.initIntegration(0.0, y0, 5.0);

        Assert.assertTrue(stepHandler.initCalled);
        Assert.assertTrue(eventHandler.initCalled);
        Assert.assertEquals(0, integrator.getEvaluations());
    }

    // ==========================================
    // 6. AcceptStep Tests (Events & Step Flow)
    // ==========================================

    @Test
    public void testAcceptStepWithoutEventsForwardAndLastStep() {
        DummyStepInterpolator interpolator = new DummyStepInterpolator(0.0, 1.0, new double[] { 0.0 });
        DummyStepHandler handler = new DummyStepHandler();
        integrator.addStepHandler(handler);

        double[] y = new double[1];
        double[] yDot = new double[1];

        double returnTime = integrator.acceptStep(interpolator, y, yDot, 1.0);

        Assert.assertEquals(1.0, returnTime, 1e-12);
        Assert.assertTrue(handler.lastStepSeen);
    }

    @Test
    public void testAcceptStepForwardWithStoppingEvent() {
        // Event triggers at t = 0.5 with STOP action
        DummyEventHandler stoppingEvent = new DummyEventHandler(0.5, EventHandler.Action.STOP);
        integrator.addEventHandler(stoppingEvent, 0.1, 1e-6, 100);

        DummyStepInterpolator interpolator = new DummyStepInterpolator(0.0, 1.0, new double[] { 0.0 });
        double[] y = new double[1];
        double[] yDot = new double[1];

        double returnTime = integrator.acceptStep(interpolator, y, yDot, 1.0);

        Assert.assertEquals(0.5, returnTime, 1e-4);
        Assert.assertEquals(0.5, y[0], 1e-4);
    }

    @Test
    public void testAcceptStepBackwardWithStoppingEvent() {
        // Backward integration from 1.0 down to 0.0, event at t = 0.5
        DummyEventHandler stoppingEvent = new DummyEventHandler(0.5, EventHandler.Action.STOP);
        integrator.addEventHandler(stoppingEvent, 0.1, 1e-6, 100);

        DummyStepInterpolator interpolator = new DummyStepInterpolator(1.0, 0.0, new double[] { 1.0 });
        double[] y = new double[1];
        double[] yDot = new double[1];

        double returnTime = integrator.acceptStep(interpolator, y, yDot, 0.0);

        Assert.assertEquals(0.5, returnTime, 1e-4);
        Assert.assertEquals(0.5, y[0], 1e-4);
    }

    @Test
    public void testAcceptStepWithResetStateEvent() {
        SimpleODE ode = new SimpleODE(1);
        ExpandableStatefulODE expandable = new ExpandableStatefulODE(ode);
        integrator.setEquations(expandable);

        DummyEventHandler resetEvent = new DummyEventHandler(0.4, EventHandler.Action.RESET_STATE);
        integrator.addEventHandler(resetEvent, 0.1, 1e-6, 100);

        DummyStepInterpolator interpolator = new DummyStepInterpolator(0.0, 1.0, new double[] { 0.0 });
        double[] y = new double[1];
        double[] yDot = new double[1];

        double returnTime = integrator.acceptStep(interpolator, y, yDot, 1.0);

        Assert.assertEquals(0.4, returnTime, 1e-4);
        Assert.assertTrue(integrator.isResetOccurred());
        Assert.assertEquals(1, integrator.getEvaluations()); // Recomputed derivatives
    }

    @Test
    public void testAcceptStepMultipleEventsOrdering() {
        // Two events at t = 0.3 and t = 0.7
        DummyEventHandler firstEvent = new DummyEventHandler(0.3, EventHandler.Action.CONTINUE);
        DummyEventHandler secondEvent = new DummyEventHandler(0.7, EventHandler.Action.STOP);

        // Add them in reverse order to ensure TreeSet ordering is exercised
        integrator.addEventHandler(secondEvent, 0.1, 1e-6, 100);
        integrator.addEventHandler(firstEvent, 0.1, 1e-6, 100);

        DummyStepInterpolator interpolator = new DummyStepInterpolator(0.0, 1.0, new double[] { 0.0 });
        double[] y = new double[1];
        double[] yDot = new double[1];

        double returnTime = integrator.acceptStep(interpolator, y, yDot, 1.0);

        // Second event stops at 0.7
        Assert.assertEquals(0.7, returnTime, 1e-4);
        Assert.assertEquals(0.7, y[0], 1e-4);
    }

    // ==========================================
    // Helper Test Classes
    // ==========================================

    private static class ConcreteTestIntegrator extends AbstractIntegrator {
        public ConcreteTestIntegrator(String name) {
            super(name);
        }

        public ConcreteTestIntegrator() {
            super();
        }

        public boolean isResetOccurred() {
            return resetOccurred;
        }

        @Override
        public void integrate(ExpandableStatefulODE equations, double t) {
            this.stepStart = equations.getTime();
            this.stepSize = t - equations.getTime();
            equations.setTime(t);
        }

        @Override
        public void sanityChecks(ExpandableStatefulODE equations, double t) {
            super.sanityChecks(equations, t);
        }

        @Override
        public double acceptStep(AbstractStepInterpolator interpolator, double[] y, double[] yDot, double tEnd) {
            return super.acceptStep(interpolator, y, yDot, tEnd);
        }

        @Override
        public void initIntegration(double t0, double[] y0, double t) {
            super.initIntegration(t0, y0, t);
        }

        @Override
        public void setEquations(ExpandableStatefulODE equations) {
            super.setEquations(equations);
        }
    }

    private static class SimpleODE implements FirstOrderDifferentialEquations {
        private final int dimension;

        public SimpleODE(int dimension) {
            this.dimension = dimension;
        }

        public int getDimension() {
            return dimension;
        }

        public void computeDerivatives(double t, double[] y, double[] yDot) {
            for (int i = 0; i < dimension; i++) {
                yDot[i] = 1.0;
            }
        }
    }

    private static class DummyStepHandler implements StepHandler {
        boolean initCalled = false;
        boolean lastStepSeen = false;

        public void init(double t0, double[] y0, double t) {
            initCalled = true;
        }

        public void handleStep(StepInterpolator interpolator, boolean isLast) {
            lastStepSeen = isLast;
        }
    }

    private static class DummyEventHandler implements EventHandler {
        private final double targetTime;
        private final Action actionOnEvent;
        boolean initCalled = false;

        public DummyEventHandler(double targetTime, Action actionOnEvent) {
            this.targetTime = targetTime;
            this.actionOnEvent = actionOnEvent;
        }

        public void init(double t0, double[] y0, double t) {
            initCalled = true;
        }

        public double g(double t, double[] y) {
            return t - targetTime;
        }

        public Action eventOccurred(double t, double[] y, boolean increasing) {
            return actionOnEvent;
        }

        public void resetState(double t, double[] y) {
            y[0] = targetTime + 10.0;
        }
    }

    private static class DummyStepInterpolator extends AbstractStepInterpolator {
        private final double[] state;

        public DummyStepInterpolator(double previousTime, double currentTime, double[] initialState) {
            super();
            this.state = initialState.clone();
            this.previousTime = previousTime;
            this.currentTime = currentTime;
            this.h = currentTime - previousTime;
            this.interpolatedTime = currentTime;
            this.interpolatedState = state.clone();
            this.interpolatedDerivatives = new double[initialState.length];
            setForward(currentTime >= previousTime);
        }

        public DummyStepInterpolator(DummyStepInterpolator interpolator) {
            super(interpolator);
            this.state = interpolator.state.clone();
        }

        @Override
        protected StepInterpolator doCopy() {
            return new DummyStepInterpolator(this);
        }

        @Override
        protected void computeInterpolatedStateAndDerivatives(double theta, double oneMinusThetaH) {
            // Linear state model: y(t) = t
            for (int i = 0; i < interpolatedState.length; i++) {
                interpolatedState[i] = interpolatedTime;
                interpolatedDerivatives[i] = 1.0;
            }
        }
    }
}