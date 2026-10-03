package org.apache.commons.math.ode.nonstiff;

import org.apache.commons.math.ode.DerivativeException;
import org.apache.commons.math.ode.FirstOrderDifferentialEquations;
import org.apache.commons.math.ode.IntegratorException;
import org.apache.commons.math.ode.events.EventHandler;
import org.apache.commons.math.ode.events.EventState;
import org.apache.commons.math.ode.sampling.StepHandler;
import org.apache.commons.math.ode.sampling.StepInterpolator;
import org.junit.Assert;
import org.junit.Test;

public class EmbeddedRungeKuttaIntegratorTest {

    /**
     * คลาสจำลองคอนกรีตของ EmbeddedRungeKuttaIntegrator เพื่อใช้ในการทดสอบ
     */
    private static class DummyEmbeddedRkIntegrator extends EmbeddedRungeKuttaIntegrator {
        private final int order;
        private double customErrorRatio = 0.5;

        public DummyEmbeddedRkIntegrator(String name, boolean fsal, double[] c, double[][] a, double[] b,
                                         RungeKuttaStepInterpolator prototype,
                                         double minStep, double maxStep,
                                         double scalAbsoluteTolerance, double scalRelativeTolerance,
                                         int order) {
            super(name, fsal, c, a, b, prototype, minStep, maxStep, scalAbsoluteTolerance, scalRelativeTolerance);
            this.order = order;
        }

        public DummyEmbeddedRkIntegrator(String name, boolean fsal, double[] c, double[][] a, double[] b,
                                         RungeKuttaStepInterpolator prototype,
                                         double minStep, double maxStep,
                                         double[] vecAbsoluteTolerance, double[] vecRelativeTolerance,
                                         int order) {
            super(name, fsal, c, a, b, prototype, minStep, maxStep, vecAbsoluteTolerance, vecRelativeTolerance);
            this.order = order;
        }

        public void setCustomErrorRatio(double error) {
            this.customErrorRatio = error;
        }

        @Override
        public int getOrder() {
            return order;
        }

        @Override
        protected double estimateError(double[][] yDotK, double[] y0, double[] y1, double h) {
            return customErrorRatio;
        }
    }

    /**
     * คลาสจำลองระบบสมการเชิงอนุพันธ์ y' = -y
     */
    private static class LinearODE implements FirstOrderDifferentialEquations {
        private final int dimension;

        public LinearODE(int dimension) {
            this.dimension = dimension;
        }

        @Override
        public int getDimension() {
            return dimension;
        }

        @Override
        public void computeDerivatives(double t, double[] y, double[] yDot) {
            for (int i = 0; i < dimension; i++) {
                yDot[i] = -y[i];
            }
        }
    }

    private DummyEmbeddedRkIntegrator createStandardIntegrator(boolean fsal) {
        double[] c = new double[]{0.5, 1.0};
        double[][] a = new double[][]{
            {0.5},
            {-1.0, 2.0}
        };
        double[] b = new double[]{1.0 / 6.0, 2.0 / 3.0, 1.0 / 6.0};
        RungeKuttaStepInterpolator prototype = new MidpointStepInterpolator();
        return new DummyEmbeddedRkIntegrator("TestRK", fsal, c, a, b, prototype,
                1.0e-6, 10.0, 1.0e-6, 1.0e-6, 3);
    }

    @Test
    public void testGettersAndSetters() {
        DummyEmbeddedRkIntegrator integrator = createStandardIntegrator(false);

        integrator.setSafety(0.85);
        Assert.assertEquals(0.85, integrator.getSafety(), 1.0e-12);

        integrator.setMinReduction(0.15);
        Assert.assertEquals(0.15, integrator.getMinReduction(), 1.0e-12);

        integrator.setMaxGrowth(12.0);
        Assert.assertEquals(12.0, integrator.getMaxGrowth(), 1.0e-12);

        Assert.assertEquals(3, integrator.getOrder());
    }

    @Test
    public void testForwardIntegrationScalarTolerance() throws DerivativeException, IntegratorException {
        DummyEmbeddedRkIntegrator integrator = createStandardIntegrator(false);
        LinearODE ode = new LinearODE(1);
        double[] y0 = new double[]{1.0};
        double[] y = new double[1];

        double stopTime = integrator.integrate(ode, 0.0, y0, 1.0, y);
        Assert.assertEquals(1.0, stopTime, 1.0e-10);
        Assert.assertEquals(Math.exp(-1.0), y[0], 0.1);
    }

    @Test
    public void testBackwardIntegrationVectorTolerance() throws DerivativeException, IntegratorException {
        double[] c = new double[]{0.5, 1.0};
        double[][] a = new double[][]{{0.5}, {-1.0, 2.0}};
        double[] b = new double[]{1.0 / 6.0, 2.0 / 3.0, 1.0 / 6.0};
        RungeKuttaStepInterpolator prototype = new MidpointStepInterpolator();

        double[] vecAbsTol = new double[]{1.0e-6, 1.0e-6};
        double[] vecRelTol = new double[]{1.0e-6, 1.0e-6};

        DummyEmbeddedRkIntegrator integrator = new DummyEmbeddedRkIntegrator(
                "VecRK", false, c, a, b, prototype, 1.0e-6, 10.0, vecAbsTol, vecRelTol, 3);

        LinearODE ode = new LinearODE(2);
        double[] y0 = new double[]{1.0, 2.0};
        double[] y = new double[2];

        // Backward: t0 = 1.0 > t = 0.0
        double stopTime = integrator.integrate(ode, 1.0, y0, 0.0, y);
        Assert.assertEquals(0.0, stopTime, 1.0e-10);
        Assert.assertEquals(Math.exp(1.0) * 1.0, y[0], 0.1);
        Assert.assertEquals(Math.exp(1.0) * 2.0, y[1], 0.2);
    }

    @Test
    public void testSameArrayForY0AndY() throws DerivativeException, IntegratorException {
        DummyEmbeddedRkIntegrator integrator = createStandardIntegrator(true);
        LinearODE ode = new LinearODE(1);
        double[] y = new double[]{2.0};

        // y และ y0 เป็น instance เดียวกัน
        double stopTime = integrator.integrate(ode, 0.0, y, 0.5, y);
        Assert.assertEquals(0.5, stopTime, 1.0e-10);
        Assert.assertTrue(y[0] < 2.0);
    }

    @Test
    public void testStepRejectionDueToHighError() throws DerivativeException, IntegratorException {
        final DummyEmbeddedRkIntegrator integrator = createStandardIntegrator(false);
        LinearODE ode = new LinearODE(1);
        double[] y0 = new double[]{1.0};
        double[] y = new double[1];

        // เริ่มต้นให้ Error > 1.0 เพื่อบังคับเข้า Branch Reject Step แล้วค่อยลด Error ลงเพื่อให้ผ่าน
        integrator.setCustomErrorRatio(2.5);

        // ใช้ StepHandler ในการปรับเปลี่ยน Error หลังจากเริ่มไปแล้ว
        integrator.addStepHandler(new StepHandler() {
            @Override
            public boolean isRequiresDenseOutput() {
                return false;
            }
            @Override
            public void reset() {}
            @Override
            public void handleStep(StepInterpolator interpolator, boolean isLast) {
                integrator.setCustomErrorRatio(0.5);
            }
        });

        // จำลองให้รอบแรก Reject แล้วรอบถัดไป Accept
        new Thread(() -> {
            try {
                Thread.sleep(20);
                integrator.setCustomErrorRatio(0.5);
            } catch (InterruptedException ignored) {}
        }).start();

        double stopTime = integrator.integrate(ode, 0.0, y0, 0.2, y);
        Assert.assertEquals(0.2, stopTime, 1.0e-10);
    }

    @Test
    public void testEventHandlerStopAndDenseOutput() throws DerivativeException, IntegratorException {
        DummyEmbeddedRkIntegrator integrator = createStandardIntegrator(false);
        LinearODE ode = new LinearODE(1);
        double[] y0 = new double[]{1.0};
        double[] y = new double[1];

        // EventHandler สั่งหยุดเมื่อ t >= 0.3
        integrator.addEventHandler(new EventHandler() {
            @Override
            public void resetState(double t, double[] y) {}
            @Override
            public double g(double t, double[] y) {
                return t - 0.3;
            }
            @Override
            public int eventOccurred(double t, double[] y, boolean increasing) {
                return STOP;
            }
        }, 0.1, 1.0e-6, 100);

        double stopTime = integrator.integrate(ode, 0.0, y0, 1.0, y);
        Assert.assertEquals(0.3, stopTime, 1.0e-5);
    }

    @Test
    public void testEventHandlerResetStateAndDerivatives() throws DerivativeException, IntegratorException {
        DummyEmbeddedRkIntegrator integrator = createStandardIntegrator(true);
        LinearODE ode = new LinearODE(1);
        double[] y0 = new double[]{1.0};
        double[] y = new double[1];

        // EventHandler ขอ Reset State และอนุพันธ์
        integrator.addEventHandler(new EventHandler() {
            private boolean triggered = false;

            @Override
            public void resetState(double t, double[] y) {
                y[0] += 1.0;
            }
            @Override
            public double g(double t, double[] y) {
                return triggered ? 1.0 : (t - 0.2);
            }
            @Override
            public int eventOccurred(double t, double[] y, boolean increasing) {
                triggered = true;
                return RESET_STATE;
            }
        }, 0.05, 1.0e-6, 100);

        double stopTime = integrator.integrate(ode, 0.0, y0, 0.5, y);
        Assert.assertEquals(0.5, stopTime, 1.0e-5);
    }

    @Test
    public void testEventAtBoundaryUlpCondition() throws DerivativeException, IntegratorException {
        DummyEmbeddedRkIntegrator integrator = createStandardIntegrator(false);
        LinearODE ode = new LinearODE(1);
        double[] y0 = new double[]{1.0};
        double[] y = new double[1];

        // Trigger Event ที่ใกล้ t0 มากจน |dt| <= Math.ulp(t0)
        integrator.addEventHandler(new EventHandler() {
            @Override
            public void resetState(double t, double[] y) {}
            @Override
            public double g(double t, double[] y) {
                return t - 0.0;
            }
            @Override
            public int eventOccurred(double t, double[] y, boolean increasing) {
                return CONTINUE;
            }
        }, 0.1, 1.0e-15, 100);

        double stopTime = integrator.integrate(ode, 0.0, y0, 0.5, y);
        Assert.assertEquals(0.5, stopTime, 1.0e-10);
    }

    @Test(expected = IntegratorException.class)
    public void testSanityCheckDimensionMismatch() throws DerivativeException, IntegratorException {
        DummyEmbeddedRkIntegrator integrator = createStandardIntegrator(false);
        LinearODE ode = new LinearODE(2);
        double[] y0 = new double[]{1.0}; // ขนาดไม่ตรงกับ ODE
        double[] y = new double[1];
        integrator.integrate(ode, 0.0, y0, 1.0, y);
    }

    @Test(expected = IntegratorException.class)
    public void testSanityCheckZeroIntegrationTime() throws DerivativeException, IntegratorException {
        DummyEmbeddedRkIntegrator integrator = createStandardIntegrator(false);
        LinearODE ode = new LinearODE(1);
        double[] y0 = new double[]{1.0};
        double[] y = new double[1];
        // t0 == t
        integrator.integrate(ode, 1.0, y0, 1.0, y);
    }
}