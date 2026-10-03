package org.apache.commons.math.ode.nonstiff;

import org.apache.commons.math.exception.DimensionMismatchException;
import org.apache.commons.math.exception.MathIllegalArgumentException;
import org.apache.commons.math.exception.NumberIsTooSmallException;
import org.apache.commons.math.ode.ExpandableStatefulODE;
import org.apache.commons.math.ode.FirstOrderDifferentialEquations;
import org.apache.commons.math.ode.sampling.StepHandler;
import org.apache.commons.math.ode.sampling.StepInterpolator;
import org.apache.commons.math.util.FastMath;
import org.junit.Assert;
import org.junit.Test;

public class EmbeddedRungeKuttaIntegratorTest {

    // Simple test ODE: y' = y, y(0) = 1 => y(t) = exp(t)
    private static class ExponentialODE implements FirstOrderDifferentialEquations {
        public int getDimension() {
            return 1;
        }

        public void computeDerivatives(double t, double[] y, double[] yDot) {
            yDot[0] = y[0];
        }
    }

    // 2D ODE: y0' = y1, y1' = -y0 (Harmonic Oscillator)
    private static class HarmonicOscillatorODE implements FirstOrderDifferentialEquations {
        public int getDimension() {
            return 2;
        }

        public void computeDerivatives(double t, double[] y, double[] yDot) {
            yDot[0] = y[1];
            yDot[1] = -y[0];
        }
    }

    // Stiff/rapidly changing ODE to trigger error rejection
    private static class StiffODE implements FirstOrderDifferentialEquations {
        public int getDimension() {
            return 1;
        }

        public void computeDerivatives(double t, double[] y, double[] yDot) {
            yDot[0] = -1000.0 * (y[0] - FastMath.sin(t)) + FastMath.cos(t);
        }
    }

    @Test
    public void testGettersAndSetters() {
        EmbeddedRungeKuttaIntegrator integrator =
                new DormandPrince54Integrator(1e-4, 1.0, 1e-6, 1e-6);

        integrator.setSafety(0.85);
        Assert.assertEquals(0.85, integrator.getSafety(), 1e-10);

        integrator.setMinReduction(0.15);
        Assert.assertEquals(0.15, integrator.getMinReduction(), 1e-10);

        integrator.setMaxGrowth(8.0);
        Assert.assertEquals(8.0, integrator.getMaxGrowth(), 1e-10);
    }

    @Test
    public void testForwardIntegrationScalarToleranceFSAL() {
        // Dormand-Prince 5(4) is an FSAL method
        EmbeddedRungeKuttaIntegrator integrator =
                new DormandPrince54Integrator(1e-6, 1.0, 1e-8, 1e-8);

        ExpandableStatefulODE ode = new ExpandableStatefulODE(new ExponentialODE());
        ode.setTime(0.0);
        ode.setPrimaryState(new double[]{1.0});

        integrator.integrate(ode, 2.0);

        Assert.assertEquals(2.0, ode.getTime(), 1e-10);
        Assert.assertEquals(FastMath.exp(2.0), ode.getPrimaryState()[0], 1e-5);
    }

    @Test
    public void testBackwardIntegrationScalarToleranceFSAL() {
        // Backward integration (t < t0)
        EmbeddedRungeKuttaIntegrator integrator =
                new DormandPrince54Integrator(1e-6, 1.0, 1e-8, 1e-8);

        ExpandableStatefulODE ode = new ExpandableStatefulODE(new ExponentialODE());
        ode.setTime(2.0);
        ode.setPrimaryState(new double[]{FastMath.exp(2.0)});

        integrator.integrate(ode, 0.0);

        Assert.assertEquals(0.0, ode.getTime(), 1e-10);
        Assert.assertEquals(1.0, ode.getPrimaryState()[0], 1e-5);
    }

    @Test
    public void testForwardIntegrationNonFSAL() {
        // Higham-Hall 5(4) is a non-FSAL method
        EmbeddedRungeKuttaIntegrator integrator =
                new HighamHall530Integrator(1e-6, 1.0, 1e-8, 1e-8);

        ExpandableStatefulODE ode = new ExpandableStatefulODE(new HarmonicOscillatorODE());
        ode.setTime(0.0);
        ode.setPrimaryState(new double[]{0.0, 1.0});

        integrator.integrate(ode, FastMath.PI);

        Assert.assertEquals(FastMath.PI, ode.getTime(), 1e-10);
        Assert.assertEquals(0.0, ode.getPrimaryState()[0], 1e-4);
        Assert.assertEquals(-1.0, ode.getPrimaryState()[1], 1e-4);
    }

    @Test
    public void testVectorTolerancesBranch() {
        double[] absTol = new double[]{1e-8, 1e-8};
        double[] relTol = new double[]{1e-8, 1e-8};

        EmbeddedRungeKuttaIntegrator integrator =
                new DormandPrince54Integrator(1e-6, 1.0, absTol, relTol);

        ExpandableStatefulODE ode = new ExpandableStatefulODE(new HarmonicOscillatorODE());
        ode.setTime(0.0);
        ode.setPrimaryState(new double[]{1.0, 0.0});

        integrator.integrate(ode, FastMath.PI / 2.0);

        Assert.assertEquals(FastMath.PI / 2.0, ode.getTime(), 1e-10);
        Assert.assertEquals(0.0, ode.getPrimaryState()[0], 1e-4);
        Assert.assertEquals(-1.0, ode.getPrimaryState()[1], 1e-4);
    }

    @Test
    public void testStepRejectionTriggered() {
        // Using strict tolerances on stiff equation to force error >= 1.0 and trigger step rejection
        EmbeddedRungeKuttaIntegrator integrator =
                new DormandPrince54Integrator(1e-10, 1.0, 1e-12, 1e-12);

        ExpandableStatefulODE ode = new ExpandableStatefulODE(new StiffODE());
        ode.setTime(0.0);
        ode.setPrimaryState(new double[]{0.0});

        integrator.integrate(ode, 0.5);

        Assert.assertEquals(0.5, ode.getTime(), 1e-10);
        Assert.assertEquals(FastMath.sin(0.5), ode.getPrimaryState()[0], 1e-2);
    }

    @Test
    public void testVerySmallIntegrationInterval() {
        // Triggers the initial step bound condition (Edge case of Math-39)
        EmbeddedRungeKuttaIntegrator integrator =
                new DormandPrince54Integrator(0.0, 100.0, 1e-10, 1e-10);

        ExpandableStatefulODE ode = new ExpandableStatefulODE(new ExponentialODE());
        ode.setTime(0.0);
        ode.setPrimaryState(new double[]{1.0});

        double tEnd = 1e-12;
        integrator.integrate(ode, tEnd);

        Assert.assertEquals(tEnd, ode.getTime(), 1e-20);
        Assert.assertEquals(FastMath.exp(tEnd), ode.getPrimaryState()[0], 1e-10);
    }

    @Test
    public void testBackwardVerySmallIntegrationInterval() {
        // Backward edge case with very small interval
        EmbeddedRungeKuttaIntegrator integrator =
                new DormandPrince54Integrator(0.0, 100.0, 1e-10, 1e-10);

        ExpandableStatefulODE ode = new ExpandableStatefulODE(new ExponentialODE());
        ode.setTime(1.0);
        ode.setPrimaryState(new double[]{FastMath.exp(1.0)});

        double tEnd = 1.0 - 1e-12;
        integrator.integrate(ode, tEnd);

        Assert.assertEquals(tEnd, ode.getTime(), 1e-20);
        Assert.assertEquals(FastMath.exp(tEnd), ode.getPrimaryState()[0], 1e-10);
    }

    @Test
    public void testStepHandlerInvocation() {
        EmbeddedRungeKuttaIntegrator integrator =
                new DormandPrince853Integrator(1e-5, 1.0, 1e-7, 1e-7);

        final int[] stepCount = new int[]{0};
        integrator.addStepHandler(new StepHandler() {
            public void init(double t0, double[] y0, double t) {}

            public void handleStep(StepInterpolator interpolator, boolean isLast) {
                stepCount[0]++;
                if (isLast) {
                    Assert.assertTrue(interpolator.getCurrentTime() >= 1.0 - 1e-10);
                }
            }
        });

        ExpandableStatefulODE ode = new ExpandableStatefulODE(new ExponentialODE());
        ode.setTime(0.0);
        ode.setPrimaryState(new double[]{1.0});

        integrator.integrate(ode, 1.0);
        Assert.assertTrue(stepCount[0] > 0);
    }

    @Test(expected = NumberIsTooSmallException.class)
    public void testSanityCheckSameStartAndEndTime() {
        EmbeddedRungeKuttaIntegrator integrator =
                new DormandPrince54Integrator(1e-4, 1.0, 1e-6, 1e-6);

        ExpandableStatefulODE ode = new ExpandableStatefulODE(new ExponentialODE());
        ode.setTime(1.0);
        ode.setPrimaryState(new double[]{1.0});

        // Target time equals start time -> must fail
        integrator.integrate(ode, 1.0);
    }

    @Test(expected = DimensionMismatchException.class)
    public void testVectorTolerancesDimensionMismatch() {
        double[] absTol = new double[]{1e-8}; // size 1
        double[] relTol = new double[]{1e-8}; // size 1

        // Target ODE has dimension 2 -> should throw DimensionMismatchException
        EmbeddedRungeKuttaIntegrator integrator =
                new DormandPrince54Integrator(1e-6, 1.0, absTol, relTol);

        ExpandableStatefulODE ode = new ExpandableStatefulODE(new HarmonicOscillatorODE());
        ode.setTime(0.0);
        ode.setPrimaryState(new double[]{1.0, 0.0});

        integrator.integrate(ode, 1.0);
    }
}