package org.apache.commons.math.ode;

import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver;
import org.apache.commons.math.exception.DimensionMismatchException;
import org.apache.commons.math.exception.MaxCountExceededException;
import org.apache.commons.math.exception.NumberIsTooSmallException;
import org.apache.commons.math.ode.events.EventHandler;
import org.apache.commons.math.ode.sampling.AbstractStepInterpolator;
import org.apache.commons.math.ode.sampling.StepHandler;
import org.apache.commons.math.ode.sampling.StepInterpolator;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class AbstractIntegratorTest {

    private TestIntegrator integrator;

    /**
     * Concrete sub-class เพื่อใช้ทดสอบ AbstractIntegrator
     */
    private static class TestIntegrator extends AbstractIntegrator {
        public TestIntegrator(String name) {
            super(name);
        }

        public TestIntegrator() {
            super();
        }

        @Override
        public void integrate(ExpandableStatefulODE equations, double t) {
            setEquations(equations);
            sanityChecks(equations, t);
            final double[] y = equations.getPrimaryState();
            final double[] yDot = new double[y.length];
            computeDerivatives(equations.getTime(), y, yDot);
            equations.setTime(t);
        }

        public void callSanityChecks(ExpandableStatefulODE equations, double t) {
            super.sanityChecks(equations, t);
        }

        public double callAcceptStep(AbstractStepInterpolator interpolator, double[] y, double[] yDot, double tEnd) {
            return super.acceptStep(interpolator, y, yDot, tEnd);
        }

        public void callSetStateInitialized(boolean initialized) {
            super.setStateInitialized(initialized);
        }

        public void callSetEquations(ExpandableStatefulODE ode) {
            super.setEquations(ode);
        }

        public boolean isResetOccurred() {
            return resetOccurred;
        }
    }

    /**
     * Mock StepInterpolator เพื่อใช้ทดสอบ acceptStep
     */
    private static class DummyStepInterpolator extends AbstractStepInterpolator {
        private double[] state;

        public DummyStepInterpolator() {
            super();
            this.state = new double[]{0.0};
        }

        public DummyStepInterpolator(double previousTime, double currentTime, double[] state, boolean forward) {
            this.previousTime = previousTime;
            this.currentTime = currentTime;
            this.h = currentTime - previousTime;
            this.forward = forward;
            this.state = state.clone();
            this.softPreviousTime = previousTime;
            this.softCurrentTime = currentTime;
            this.interpolatedTime = currentTime;
            this.interpolatedState = state.clone();
            this.interpolatedDerivatives = new double[state.length];
        }

        @Override
        protected StepInterpolator doCopy() {
            return new DummyStepInterpolator(previousTime, currentTime, state, forward);
        }

        @Override
        protected void computeInterpolatedStateAndDerivatives(double theta, double oneMinusThetaH) {
            System.arraycopy(state, 0, interpolatedState, 0, state.length);
        }

        @Override
        public void writeExternal(ObjectOutput out) {}

        @Override
        public void readExternal(ObjectInput in) {}
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

    @Before
    public void setUp() {
        integrator = new TestIntegrator("TestMethod");
    }

    @Test
    public void testConstructorsAndGetters() {
        TestIntegrator defaultInt = new TestIntegrator();
        Assert.assertNull(defaultInt.getName());
        Assert.assertEquals("TestMethod", integrator.getName());
        Assert.assertTrue(Double.isNaN(integrator.getCurrentStepStart()));
        Assert.assertTrue(Double.isNaN(integrator.getCurrentSignedStepsize()));
        Assert.assertEquals(0, integrator.getEvaluations());
    }

    @Test
    public void testMaxEvaluationsBranching() {
        integrator.setMaxEvaluations(-10);
        Assert.assertEquals(Integer.MAX_VALUE, integrator.getMaxEvaluations());

        integrator.setMaxEvaluations(50);
        Assert.assertEquals(50, integrator.getMaxEvaluations());
    }

    @Test
    public void testComputeDerivativesMaxCountExceeded() {
        integrator.setMaxEvaluations(2);
        ExpandableStatefulODE ode = new ExpandableStatefulODE(new SimpleODE(1));
        integrator.callSetEquations(ode);

        double[] y = new double[]{0.0};
        double[] yDot = new double[1];

        integrator.computeDerivatives(0.0, y, yDot);
        integrator.computeDerivatives(0.1, y, yDot);

        try {
            integrator.computeDerivatives(0.2, y, yDot);
            Assert.fail("Expected MaxCountExceededException");
        } catch (MaxCountExceededException e) {
            Assert.assertEquals(2, e.getMax());
        }
    }

    @Test
    public void testIntegrateDimensionMismatchY0() {
        FirstOrderDifferentialEquations ode = new SimpleODE(2);
        double[] y0 = new double[1]; // wrong size
        double[] y = new double[2];

        try {
            integrator.integrate(ode, 0.0, y0, 1.0, y);
            Assert.fail("Expected DimensionMismatchException for y0");
        } catch (DimensionMismatchException e) {
            Assert.assertEquals(1, e.getArgument());
            Assert.assertEquals(2, e.getDimension());
        }
    }

    @Test
    public void testIntegrateDimensionMismatchY() {
        FirstOrderDifferentialEquations ode = new SimpleODE(2);
        double[] y0 = new double[2];
        double[] y = new double[3]; // wrong size

        try {
            integrator.integrate(ode, 0.0, y0, 1.0, y);
            Assert.fail("Expected DimensionMismatchException for y");
        } catch (DimensionMismatchException e) {
            Assert.assertEquals(3, e.getArgument());
            Assert.assertEquals(2, e.getDimension());
        }
    }

    @Test
    public void testIntegrateSuccess() {
        FirstOrderDifferentialEquations ode = new SimpleODE(1);
        double[] y0 = new double[]{5.0};
        double[] y = new double[1];

        double finalT = integrator.integrate(ode, 0.0, y0, 2.5, y);
        Assert.assertEquals(2.5, finalT, 1e-12);
        Assert.assertEquals(1, integrator.getEvaluations());
    }

    @Test
    public void testSanityChecksTooSmallSpan() {
        ExpandableStatefulODE ode = new ExpandableStatefulODE(new SimpleODE(1));
        ode.setTime(1.0);

        try {
            integrator.callSanityChecks(ode, 1.0); // dt = 0 <= threshold
            Assert.fail("Expected NumberIsTooSmallException");
        } catch (NumberIsTooSmallException e) {
            Assert.assertTrue(e.getMessage().length() > 0);
        }
    }

    @Test
    public void testSanityChecksValidSpan() {
        ExpandableStatefulODE ode = new ExpandableStatefulODE(new SimpleODE(1));
        ode.setTime(0.0);
        integrator.callSanityChecks(ode, 1.0); // should pass without exception
    }

    @Test
    public void testStepHandlersManagement() {
        final List<Double> steps = new ArrayList<Double>();
        StepHandler handler = new StepHandler() {
            public void init(double t0, double[] y0, double t) {}
            public void handleStep(StepInterpolator interpolator, boolean isLast) {
                steps.add(interpolator.getCurrentTime());
            }
        };

        integrator.addStepHandler(handler);
        Assert.assertEquals(1, integrator.getStepHandlers().size());

        integrator.clearStepHandlers();
        Assert.assertEquals(0, integrator.getStepHandlers().size());
    }

    @Test
    public void testEventHandlersManagement() {
        EventHandler handler = new EventHandler() {
            public void init(double t0, double[] y0, double t) {}
            public double g(double t, double[] y) { return 0; }
            public Action eventOccurred(double t, double[] y, boolean increasing) { return Action.CONTINUE; }
            public void resetState(double t, double[] y) {}
        };

        integrator.addEventHandler(handler, 1.0, 1e-3, 10);
        integrator.addEventHandler(handler, 0.5, 1e-4, 20, new BracketingNthOrderBrentSolver(1e-4, 3));
        Assert.assertEquals(2, integrator.getEventHandlers().size());

        integrator.clearEventHandlers();
        Assert.assertEquals(0, integrator.getEventHandlers().size());
    }

    @Test
    public void testAcceptStepStandardNoEvents() {
        final boolean[] handlerCalled = new boolean[]{false};
        integrator.addStepHandler(new StepHandler() {
            public void init(double t0, double[] y0, double t) {}
            public void handleStep(StepInterpolator interpolator, boolean isLast) {
                handlerCalled[0] = true;
                Assert.assertTrue(isLast);
            }
        });

        DummyStepInterpolator interpolator = new DummyStepInterpolator(0.0, 1.0, new double[]{1.0}, true);
        double[] y = new double[]{1.0};
        double[] yDot = new double[]{1.0};

        double tEnd = integrator.callAcceptStep(interpolator, y, yDot, 1.0);
        Assert.assertEquals(1.0, tEnd, 1e-12);
        Assert.assertTrue(handlerCalled[0]);
    }

    @Test
    public void testAcceptStepWithEventStop() {
        EventHandler event = new EventHandler() {
            public void init(double t0, double[] y0, double t) {}
            public double g(double t, double[] y) {
                return t - 0.5; // Event triggers at t = 0.5
            }
            public Action eventOccurred(double t, double[] y, boolean increasing) {
                return Action.STOP;
            }
            public void resetState(double t, double[] y) {}
        };

        integrator.addEventHandler(event, 0.1, 1e-6, 100);
        integrator.callSetStateInitialized(false);

        DummyStepInterpolator interpolator = new DummyStepInterpolator(0.0, 1.0, new double[]{2.0}, true);
        double[] y = new double[]{0.0};
        double[] yDot = new double[]{0.0};

        double eventT = integrator.callAcceptStep(interpolator, y, yDot, 1.0);
        Assert.assertEquals(0.5, eventT, 1e-5);
        Assert.assertEquals(2.0, y[0], 1e-9);
    }

    @Test
    public void testAcceptStepWithEventResetState() {
        ExpandableStatefulODE ode = new ExpandableStatefulODE(new SimpleODE(1));
        integrator.callSetEquations(ode);

        EventHandler event = new EventHandler() {
            public void init(double t0, double[] y0, double t) {}
            public double g(double t, double[] y) {
                return t - 0.4;
            }
            public Action eventOccurred(double t, double[] y, boolean increasing) {
                return Action.RESET_STATE;
            }
            public void resetState(double t, double[] y) {
                y[0] = 99.0;
            }
        };

        integrator.addEventHandler(event, 0.1, 1e-6, 100);
        DummyStepInterpolator interpolator = new DummyStepInterpolator(0.0, 1.0, new double[]{5.0}, true);
        double[] y = new double[]{0.0};
        double[] yDot = new double[]{0.0};

        double eventT = integrator.callAcceptStep(interpolator, y, yDot, 1.0);
        Assert.assertEquals(0.4, eventT, 1e-5);
        Assert.assertTrue(integrator.isResetOccurred());
        Assert.assertEquals(1, integrator.getEvaluations());
    }

    @Test
    public void testAcceptStepBackwardIntegration() {
        EventHandler event = new EventHandler() {
            public void init(double t0, double[] y0, double t) {}
            public double g(double t, double[] y) {
                return t - (-0.5); // Event triggers at t = -0.5
            }
            public Action eventOccurred(double t, double[] y, boolean increasing) {
                return Action.STOP;
            }
            public void resetState(double t, double[] y) {}
        };

        integrator.addEventHandler(event, 0.1, 1e-6, 100);

        // Backward integration from 0.0 to -1.0
        DummyStepInterpolator interpolator = new DummyStepInterpolator(0.0, -1.0, new double[]{3.0}, false);
        double[] y = new double[]{0.0};
        double[] yDot = new double[]{0.0};

        double eventT = integrator.callAcceptStep(interpolator, y, yDot, -1.0);
        Assert.assertEquals(-0.5, eventT, 1e-5);
    }
}