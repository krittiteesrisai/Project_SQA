package org.apache.commons.math.ode.nonstiff;

import org.apache.commons.math.ode.DerivativeException;
import org.apache.commons.math.ode.FirstOrderDifferentialEquations;
import org.apache.commons.math.ode.IntegratorException;
import org.apache.commons.math.ode.events.EventHandler;
import org.apache.commons.math.ode.sampling.DummyStepInterpolator;
import org.apache.commons.math.ode.sampling.StepHandler;
import org.apache.commons.math.ode.sampling.StepInterpolator;
import org.junit.Assert;
import org.junit.Test;

public class EmbeddedRungeKuttaIntegratorTest {

    /**
     * Concrete test implementation of EmbeddedRungeKuttaIntegrator to allow fine-grained
     * control over Butcher array, FSAL property, and error estimation.
     */
    private static class TestEmbeddedRkIntegrator extends EmbeddedRungeKuttaIntegrator {
        private double forcedError = 0.0;
        private int errorEvalCount = 0;

        public TestEmbeddedRkIntegrator(String name, boolean fsal, double[] c, double[][] a, double[] b,
                                        RungeKuttaStepInterpolator prototype,
                                        double minStep, double maxStep,
                                        double scalAbsoluteTolerance, double scalRelativeTolerance) {
            super(name, fsal, c, a, b, prototype, minStep, maxStep, scalAbsoluteTolerance, scalRelativeTolerance);
        }

        public TestEmbeddedRkIntegrator(String name, boolean fsal, double[] c, double[][] a, double[] b,
                                        RungeKuttaStepInterpolator prototype,
                                        double minStep, double maxStep,
                                        double[] vecAbsoluteTolerance, double[] vecRelativeTolerance) {
            super(name, fsal, c, a, b, prototype, minStep, maxStep, vecAbsoluteTolerance, vecRelativeTolerance);
        }

        public void setForcedError(double forcedError) {
            this.forcedError = forcedError;
        }

        @Override
        public int getOrder() {
            return 2;
        }

        @Override
        protected double estimateError(double[][] yDotK, double[] y0, double[] y1, double h) {
            errorEvalCount++;
            if (errorEvalCount == 1 && forcedError > 0.0) {
                return forcedError;
            }
            return 0.1; // Default to small error so step is accepted
        }
    }

    /**
     * Dummy prototype interpolator for testing.
     */
    private static class DummyRungeKuttaInterpolator extends RungeKuttaStepInterpolator {
        private static final long serialVersionUID = 1L;

        public DummyRungeKuttaInterpolator() {
            super();
        }

        public DummyRungeKuttaInterpolator(DummyRungeKuttaInterpolator interpolator) {
            super(interpolator);
        }

        @Override
        protected StepInterpolator doCopy() {
            return new DummyRungeKuttaInterpolator(this);
        }

        @Override
        protected void computeInterpolatedStateAndDerivatives(double theta, double oneMinusThetaH) {
            System.arraycopy(currentState, 0, interpolatedState, 0, currentState.length);
            System.arraycopy(yDotK[0], 0, interpolatedDerivatives, 0, yDotK[0].length);
        }
    }

    /**
     * Simple linear differential equation system: y' = -y
     */
    private static class LinearEquations implements FirstOrderDifferentialEquations {
        private final int dimension;

        public LinearEquations(int dimension) {
            this.dimension = dimension;
        }

        public int getDimension() {
            return dimension;
        }

        public void computeDerivatives(double t, double[] y, double[] yDot) {
            for (int i = 0; i < dimension; i++) {
                yDot[i] = -y[i];
            }
        }
    }

    private TestEmbeddedRkIntegrator createStandardIntegrator(boolean fsal) {
        double[] c = new double[]{1.0};
        double[][] a = new double[][]{{1.0}};
        double[] b = new double[]{0.5, 0.5};
        return new TestEmbeddedRkIntegrator(
                "TestRK", fsal, c, a, b, new DummyRungeKuttaInterpolator(),
                1.0e-5, 10.0, 1.0e-6, 1.0e-6
        );
    }

    @Test
    public void testGettersAndSetters() {
        TestEmbeddedRkIntegrator integrator = createStandardIntegrator(false);

        integrator.setSafety(0.85);
        Assert.assertEquals(0.85, integrator.getSafety(), 1.0e-12);

        integrator.setMinReduction(0.15);
        Assert.assertEquals(0.15, integrator.getMinReduction(), 1.0e-12);

        integrator.setMaxGrowth(12.0);
        Assert.assertEquals(12.0, integrator.getMaxGrowth(), 1.0e-12);
    }

    @Test
    public void testIntegrateForwardScalarTolerance() throws DerivativeException, IntegratorException {
        TestEmbeddedRkIntegrator integrator = createStandardIntegrator(false);
        LinearEquations ode = new LinearEquations(1);
        double[] y0 = new double[]{1.0};
        double[] y = new double[1];

        double stopTime = integrator.integrate(ode, 0.0, y0, 1.0, y);

        Assert.assertEquals(1.0, stopTime, 1.0e-10);
        Assert.assertTrue(y[0] < y0[0]);
    }

    @Test
    public void testIntegrateWithSameOutputArray() throws DerivativeException, IntegratorException {
        TestEmbeddedRkIntegrator integrator = createStandardIntegrator(false);
        LinearEquations ode = new LinearEquations(1);
        double[] y = new double[]{2.0};

        // Pass y as both y0 and y (testing y == y0 branch)
        double stopTime = integrator.integrate(ode, 0.0, y, 0.5, y);

        Assert.assertEquals(0.5, stopTime, 1.0e-10);
        Assert.assertTrue(y[0] < 2.0);
    }

    @Test
    public void testIntegrateVectorTolerance() throws DerivativeException, IntegratorException {
        double[] c = new double[]{1.0};
        double[][] a = new double[][]{{1.0}};
        double[] b = new double[]{0.5, 0.5};
        double[] vecAbsTol = new double[]{1.0e-6, 1.0e-6};
        double[] vecRelTol = new double[]{1.0e-6, 1.0e-6};

        TestEmbeddedRkIntegrator integrator = new TestEmbeddedRkIntegrator(
                "TestVectorTol", false, c, a, b, new DummyRungeKuttaInterpolator(),
                1.0e-5, 10.0, vecAbsTol, vecRelTol
        );

        LinearEquations ode = new LinearEquations(2);
        double[] y0 = new double[]{1.0, 2.0};
        double[] y = new double[2];

        double stopTime = integrator.integrate(ode, 0.0, y0, 1.0, y);

        Assert.assertEquals(1.0, stopTime, 1.0e-10);
        Assert.assertTrue(y[0] < 1.0);
        Assert.assertTrue(y[1] < 2.0);
    }

    @Test
    public void testIntegrateBackward() throws DerivativeException, IntegratorException {
        TestEmbeddedRkIntegrator integrator = createStandardIntegrator(false);
        LinearEquations ode = new LinearEquations(1);
        double[] y0 = new double[]{1.0};
        double[] y = new double[1];

        // Backward integration (t < t0)
        double stopTime = integrator.integrate(ode, 1.0, y0, 0.0, y);

        Assert.assertEquals(0.0, stopTime, 1.0e-10);
        Assert.assertTrue(y[0] > y0[0]);
    }

    @Test
    public void testDenseOutputBranchingAndStepHandler() throws DerivativeException, IntegratorException {
        TestEmbeddedRkIntegrator integrator = createStandardIntegrator(false);
        final boolean[] handled = new boolean[]{false};
        final boolean[] resetCalled = new boolean[]{false};

        integrator.addStepHandler(new StepHandler() {
            public boolean isRequiresDenseOutput() {
                return true;
            }

            public void reset() {
                resetCalled[true ? 0 : 0] = true;
            }

            public void handleStep(StepInterpolator interpolator, boolean isLast) {
                handled[0] = true;
            }
        });

        LinearEquations ode = new LinearEquations(1);
        double[] y0 = new double[]{1.0};
        double[] y = new double[1];

        integrator.integrate(ode, 0.0, y0, 1.0, y);

        Assert.assertTrue(resetCalled[0]);
        Assert.assertTrue(handled[0]);
    }

    @Test
    public void testFSALBranch() throws DerivativeException, IntegratorException {
        TestEmbeddedRkIntegrator integrator = createStandardIntegrator(true);
        LinearEquations ode = new LinearEquations(1);
        double[] y0 = new double[]{1.0};
        double[] y = new double[1];

        // Multi-step run to execute FSAL reuse logic
        double stopTime = integrator.integrate(ode, 0.0, y0, 2.0, y);

        Assert.assertEquals(2.0, stopTime, 1.0e-10);
    }

    @Test
    public void testErrorRejectionAndStepReduction() throws DerivativeException, IntegratorException {
        TestEmbeddedRkIntegrator integrator = createStandardIntegrator(false);
        // Force the first step to fail estimation (> 1.0)
        integrator.setForcedError(2.5);

        LinearEquations ode = new LinearEquations(1);
        double[] y0 = new double[]{1.0};
        double[] y = new double[1];

        double stopTime = integrator.integrate(ode, 0.0, y0, 1.0, y);

        Assert.assertEquals(1.0, stopTime, 1.0e-10);
        Assert.assertTrue(integrator.errorEvalCount > 1);
    }

    @Test
    public void testEventHandlerTruncateStepAndStop() throws DerivativeException, IntegratorException {
        TestEmbeddedRkIntegrator integrator = createStandardIntegrator(false);
        final double eventTime = 0.45;

        integrator.addEventHandler(new EventHandler() {
            public int eventOccurred(double t, double[] y, boolean increasing) {
                return STOP;
            }

            public double g(double t, double[] y) {
                return t - eventTime;
            }

            public void resetState(double t, double[] y) {
            }
        }, 1.0, 1.0e-6, 100);

        LinearEquations ode = new LinearEquations(1);
        double[] y0 = new double[]{1.0};
        double[] y = new double[1];

        double stopTime = integrator.integrate(ode, 0.0, y0, 1.0, y);

        Assert.assertEquals(eventTime, stopTime, 1.0e-5);
    }

    @Test
    public void testEventHandlerResetStateAndDerivatives() throws DerivativeException, IntegratorException {
        TestEmbeddedRkIntegrator integrator = createStandardIntegrator(false);
        final double eventTime = 0.3;

        integrator.addEventHandler(new EventHandler() {
            public int eventOccurred(double t, double[] y, boolean increasing) {
                return RESET_STATE;
            }

            public double g(double t, double[] y) {
                return t - eventTime;
            }

            public void resetState(double t, double[] y) {
                y[0] += 5.0; // Reset state vector
            }
        }, 1.0, 1.0e-6, 100);

        LinearEquations ode = new LinearEquations(1);
        double[] y0 = new double[]{1.0};
        double[] y = new double[1];

        double stopTime = integrator.integrate(ode, 0.0, y0, 1.0, y);

        Assert.assertEquals(1.0, stopTime, 1.0e-10);
        Assert.assertTrue(y[0] > 1.0); // Should be increased due to resetState
    }

    @Test
    public void testImmediateEventAtStart() throws DerivativeException, IntegratorException {
        TestEmbeddedRkIntegrator integrator = createStandardIntegrator(false);

        // Event occurs exactly at start t0 = 0.0
        integrator.addEventHandler(new EventHandler() {
            public int eventOccurred(double t, double[] y, boolean increasing) {
                return CONTINUE;
            }

            public double g(double t, double[] y) {
                return t - 0.0;
            }

            public void resetState(double t, double[] y) {
            }
        }, 1.0, 1.0e-9, 100);

        LinearEquations ode = new LinearEquations(1);
        double[] y0 = new double[]{1.0};
        double[] y = new double[1];

        double stopTime = integrator.integrate(ode, 0.0, y0, 1.0, y);

        Assert.assertEquals(1.0, stopTime, 1.0e-10);
    }

    @Test(expected = IntegratorException.class)
    public void testDimensionMismatchThrowsException() throws DerivativeException, IntegratorException {
        TestEmbeddedRkIntegrator integrator = createStandardIntegrator(false);
        LinearEquations ode = new LinearEquations(2);
        double[] y0 = new double[]{1.0}; // Dimension mismatch (1 != 2)
        double[] y = new double[1];

        integrator.integrate(ode, 0.0, y0, 1.0, y);
    }
}