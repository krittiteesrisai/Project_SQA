package org.apache.commons.math.ode.nonstiff;

import org.apache.commons.math.ode.DerivativeException;
import org.apache.commons.math.ode.FirstOrderDifferentialEquations;
import org.apache.commons.math.ode.IntegratorException;
import org.apache.commons.math.ode.events.EventHandler;
import org.apache.commons.math.ode.sampling.StepHandler;
import org.apache.commons.math.ode.sampling.StepInterpolator;
import org.junit.Assert;
import org.junit.Test;

public class RungeKuttaIntegratorTest {

    // Helper ODE: y' = y (Solution: y(t) = y0 * e^t)
    private static class ExponentialODE implements FirstOrderDifferentialEquations {
        private final int dimension;

        public ExponentialODE(int dimension) {
            this.dimension = dimension;
        }

        public int getDimension() {
            return dimension;
        }

        public void computeDerivatives(double t, double[] y, double[] yDot) {
            for (int i = 0; i < dimension; i++) {
                yDot[i] = y[i];
            }
        }
    }

    // Helper ODE that throws DerivativeException
    private static class FaultyODE implements FirstOrderDifferentialEquations {
        public int getDimension() {
            return 1;
        }

        public void computeDerivatives(double t, double[] y, double[] yDot) throws DerivativeException {
            throw new DerivativeException("Simulated derivative calculation failure at t = {0}", t);
        }
    }

    @Test
    public void testForwardIntegrationDifferentArrays() throws DerivativeException, IntegratorException {
        // Branch: forward == true, y != y0, no handlers (DummyStepInterpolator used)
        RungeKuttaIntegrator integrator = new EulerIntegrator(0.1);
        FirstOrderDifferentialEquations ode = new ExponentialODE(1);

        double[] y0 = new double[]{1.0};
        double[] y = new double[1];

        double stopTime = integrator.integrate(ode, 0.0, y0, 1.0, y);

        Assert.assertEquals(1.0, stopTime, 1e-10);
        Assert.assertTrue(y[0] > y0[0]);
        Assert.assertNotSame(y0, y);
    }

    @Test
    public void testBackwardIntegrationSameArray() throws DerivativeException, IntegratorException {
        // Branch: forward == false, y == y0
        RungeKuttaIntegrator integrator = new ClassicalRungeKuttaIntegrator(0.1);
        FirstOrderDifferentialEquations ode = new ExponentialODE(2);

        double[] y = new double[]{2.0, 3.0};

        double stopTime = integrator.integrate(ode, 1.0, y, 0.0, y);

        Assert.assertEquals(0.0, stopTime, 1e-10);
        Assert.assertTrue(y[0] < 2.0);
        Assert.assertTrue(y[1] < 3.0);
    }

    @Test
    public void testDenseOutputWithStepHandler() throws DerivativeException, IntegratorException {
        // Branch: requiresDenseOutput() == true (uses RungeKuttaStepInterpolator)
        RungeKuttaIntegrator integrator = new GillIntegrator(0.1);
        FirstOrderDifferentialEquations ode = new ExponentialODE(1);

        final int[] stepCount = new int[]{0};
        integrator.addStepHandler(new StepHandler() {
            public boolean isRequiresDenseOutput() {
                return true; // Force dense output
            }

            public void reset() {
                stepCount[0] = 0;
            }

            public void handleStep(StepInterpolator interpolator, boolean isLast) {
                stepCount[0]++;
                double[] interpolatedY = interpolator.getInterpolatedState();
                Assert.assertNotNull(interpolatedY);
            }
        });

        double[] y0 = new double[]{1.0};
        double[] y = new double[1];
        integrator.integrate(ode, 0.0, y0, 1.0, y);

        Assert.assertTrue(stepCount[0] > 0);
    }

    @Test
    public void testDiscreteEventHandlerStepTruncation() throws DerivativeException, IntegratorException {
        // Branch: manager.evaluateStep == true, Math.abs(dt) > Math.ulp(stepStart) -> step truncated & loop
        RungeKuttaIntegrator integrator = new MidpointIntegrator(0.2);
        FirstOrderDifferentialEquations ode = new ExponentialODE(1);

        final double targetEventTime = 0.35; // Falls in the middle of a 0.2 step
        final boolean[] eventTriggered = new boolean[]{false};

        integrator.addEventHandler(new EventHandler() {
            public int eventOccurred(double t, double[] y, boolean increasing) {
                eventTriggered[0] = true;
                return EventHandler.CONTINUE;
            }

            public double g(double t, double[] y) {
                return t - targetEventTime;
            }

            public void resetState(double t, double[] y) {}
        }, 1.0, 1.0e-6, 100);

        double[] y0 = new double[]{1.0};
        double[] y = new double[1];
        integrator.integrate(ode, 0.0, y0, 1.0, y);

        Assert.assertTrue(eventTriggered[0]);
    }

    @Test
    public void testEventHandlerStopIntegration() throws DerivativeException, IntegratorException {
        // Branch: lastStep = manager.stop() becomes true before reaching t
        RungeKuttaIntegrator integrator = new ClassicalRungeKuttaIntegrator(0.1);
        FirstOrderDifferentialEquations ode = new ExponentialODE(1);

        final double stopEventTime = 0.45;

        integrator.addEventHandler(new EventHandler() {
            public int eventOccurred(double t, double[] y, boolean increasing) {
                return EventHandler.STOP;
            }

            public double g(double t, double[] y) {
                return t - stopEventTime;
            }

            public void resetState(double t, double[] y) {}
        }, 1.0, 1.0e-6, 100);

        double[] y0 = new double[]{1.0};
        double[] y = new double[1];
        double stopTime = integrator.integrate(ode, 0.0, y0, 1.0, y);

        Assert.assertEquals(stopEventTime, stopTime, 1.0e-5);
    }

    @Test
    public void testEventHandlerResetStateAndDerivatives() throws DerivativeException, IntegratorException {
        // Branch: manager.reset(...) && !lastStep -> triggers computeDerivatives
        RungeKuttaIntegrator integrator = new EulerIntegrator(0.2);
        FirstOrderDifferentialEquations ode = new ExponentialODE(1);

        integrator.addEventHandler(new EventHandler() {
            public int eventOccurred(double t, double[] y, boolean increasing) {
                return EventHandler.RESET_STATE;
            }

            public double g(double t, double[] y) {
                return t - 0.5;
            }

            public void resetState(double t, double[] y) {
                y[0] = 10.0; // Perturb state
            }
        }, 1.0, 1.0e-6, 100);

        double[] y0 = new double[]{1.0};
        double[] y = new double[1];
        integrator.integrate(ode, 0.0, y0, 1.0, y);

        Assert.assertTrue(y[0] > 10.0);
    }

    @Test
    public void testEventAtUlpBoundary() throws DerivativeException, IntegratorException {
        // Branch: Math.abs(dt) <= Math.ulp(stepStart) -> loop = false
        RungeKuttaIntegrator integrator = new EulerIntegrator(0.1);
        FirstOrderDifferentialEquations ode = new ExponentialODE(1);

        // Event placed exactly at stepStart
        integrator.addEventHandler(new EventHandler() {
            public int eventOccurred(double t, double[] y, boolean increasing) {
                return EventHandler.CONTINUE;
            }

            public double g(double t, double[] y) {
                return t - 0.0;
            }

            public void resetState(double t, double[] y) {}
        }, 1.0, 1.0e-15, 100);

        double[] y0 = new double[]{1.0};
        double[] y = new double[1];
        double stopTime = integrator.integrate(ode, 0.0, y0, 0.3, y);

        Assert.assertEquals(0.3, stopTime, 1e-10);
    }

    @Test(expected = IntegratorException.class)
    public void testSanityCheckDimensionMismatch() throws DerivativeException, IntegratorException {
        // Edge Case / Invalid State: Array dimension does not match ODE dimension
        RungeKuttaIntegrator integrator = new EulerIntegrator(0.1);
        FirstOrderDifferentialEquations ode = new ExponentialODE(2);

        double[] y0 = new double[]{1.0}; // Only 1 element instead of 2
        double[] y = new double[1];

        integrator.integrate(ode, 0.0, y0, 1.0, y);
    }

    @Test(expected = IntegratorException.class)
    public void testSanityCheckSameStartAndEndTime() throws DerivativeException, IntegratorException {
        // Edge Case / Boundary limit: t0 == t
        RungeKuttaIntegrator integrator = new ClassicalRungeKuttaIntegrator(0.1);
        FirstOrderDifferentialEquations ode = new ExponentialODE(1);

        double[] y0 = new double[]{1.0};
        double[] y = new double[1];

        integrator.integrate(ode, 1.0, y0, 1.0, y);
    }

    @Test(expected = DerivativeException.class)
    public void testDerivativeExceptionPropagation() throws DerivativeException, IntegratorException {
        // Edge Case: Handling exception thrown from user differential equations
        RungeKuttaIntegrator integrator = new EulerIntegrator(0.1);
        FirstOrderDifferentialEquations faultyOde = new FaultyODE();

        double[] y0 = new double[]{1.0};
        double[] y = new double[1];

        integrator.integrate(faultyOde, 0.0, y0, 1.0, y);
    }
}