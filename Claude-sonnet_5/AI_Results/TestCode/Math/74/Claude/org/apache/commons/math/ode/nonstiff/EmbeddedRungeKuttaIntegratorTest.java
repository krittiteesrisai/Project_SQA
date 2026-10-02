package org.apache.commons.math.ode.nonstiff;

import org.apache.commons.math.ode.DerivativeException;
import org.apache.commons.math.ode.FirstOrderDifferentialEquations;
import org.apache.commons.math.ode.IntegratorException;
import org.apache.commons.math.ode.sampling.StepHandler;
import org.apache.commons.math.ode.sampling.StepInterpolator;

import org.junit.Test;
import static org.junit.Assert.*;

public class EmbeddedRungeKuttaIntegratorTest {

    // ---- Butcher tableau อย่างง่าย: 2 stages, order = 2 ----
    private static final double[]   C = {1.0};
    private static final double[][] A = {{1.0}};
    private static final double[]   B = {0.5, 0.5};

    /** ODE แบบง่าย y' = y (ไม่มี dimension mismatch) */
    private static class ExpEquations implements FirstOrderDifferentialEquations {
        public int getDimension() { return 1; }
        public void computeDerivatives(double t, double[] y, double[] yDot)
                throws DerivativeException {
            yDot[0] = y[0];
        }
    }

    /** Concrete integrator ที่ "ยอมรับ step เสมอ" (estimateError คืน 0.0) ใช้ scalar tolerance */
    private static class ScalarAlwaysAccept extends EmbeddedRungeKuttaIntegrator {
        ScalarAlwaysAccept(boolean fsal, double minStep, double maxStep,
                            double absTol, double relTol) {
            super("scalarAlwaysAccept", fsal, C, A, B, new EulerStepInterpolator(),
                  minStep, maxStep, absTol, relTol);
        }
        @Override public int getOrder() { return 2; }
        @Override protected double estimateError(double[][] yDotK, double[] y0,
                                                   double[] y1, double h) {
            return 0.0;
        }
    }

    /** Concrete integrator ใช้ vector tolerance */
    private static class VectorAlwaysAccept extends EmbeddedRungeKuttaIntegrator {
        VectorAlwaysAccept(boolean fsal, double minStep, double maxStep,
                            double[] absTol, double[] relTol) {
            super("vectorAlwaysAccept", fsal, C, A, B, new EulerStepInterpolator(),
                  minStep, maxStep, absTol, relTol);
        }
        @Override public int getOrder() { return 2; }
        @Override protected double estimateError(double[][] yDotK, double[] y0,
                                                   double[] y1, double h) {
            return 0.0;
        }
    }

    /** Integrator ที่ reject step ครั้งแรก (error>1) แล้ว accept ครั้งต่อไป (error=0) */
    private static class RejectOnceIntegrator extends EmbeddedRungeKuttaIntegrator {
        private boolean first = true;
        private int errorCalls = 0;

        RejectOnceIntegrator(double minStep, double maxStep, double absTol, double relTol) {
            super("rejectOnce", false, C, A, B, new EulerStepInterpolator(),
                  minStep, maxStep, absTol, relTol);
        }
        @Override public int getOrder() { return 2; }
        @Override protected double estimateError(double[][] yDotK, double[] y0,
                                                   double[] y1, double h) {
            errorCalls++;
            if (first) {
                first = false;
                return 5.0; // > 1 -> จะถูก reject
            }
            return 0.0; // <=1 -> accept
        }
        int getErrorCalls() { return errorCalls; }
    }

    // ===================== Getter / Setter tests =====================

    @Test
    public void testDefaultSafety() {
        ScalarAlwaysAccept integ = new ScalarAlwaysAccept(false, 1e-6, 1.0, 1e-8, 1e-8);
        assertEquals(0.9, integ.getSafety(), 1e-12);
    }

    @Test
    public void testSetSafetyUpdatesValue() {
        ScalarAlwaysAccept integ = new ScalarAlwaysAccept(false, 1e-6, 1.0, 1e-8, 1e-8);
        integ.setSafety(0.5);
        assertEquals(0.5, integ.getSafety(), 1e-12);
        // boundary: ค่า 0 ไม่ถูก validate ใน source ที่ให้มา
        integ.setSafety(0.0);
        assertEquals(0.0, integ.getSafety(), 1e-12);
    }

    @Test
    public void testDefaultMinReduction() {
        ScalarAlwaysAccept integ = new ScalarAlwaysAccept(false, 1e-6, 1.0, 1e-8, 1e-8);
        assertEquals(0.2, integ.getMinReduction(), 1e-12);
    }

    @Test
    public void testSetMinReductionUpdatesValue() {
        ScalarAlwaysAccept integ = new ScalarAlwaysAccept(false, 1e-6, 1.0, 1e-8, 1e-8);
        integ.setMinReduction(0.05);
        assertEquals(0.05, integ.getMinReduction(), 1e-12);
    }

    @Test
    public void testDefaultMaxGrowth() {
        ScalarAlwaysAccept integ = new ScalarAlwaysAccept(false, 1e-6, 1.0, 1e-8, 1e-8);
        assertEquals(10.0, integ.getMaxGrowth(), 1e-12);
    }

    @Test
    public void testSetMaxGrowthUpdatesValue() {
        ScalarAlwaysAccept integ = new ScalarAlwaysAccept(false, 1e-6, 1.0, 1e-8, 1e-8);
        integ.setMaxGrowth(2.0);
        assertEquals(2.0, integ.getMaxGrowth(), 1e-12);
    }

    @Test
    public void testGetOrderFromSubclass() {
        ScalarAlwaysAccept integ = new ScalarAlwaysAccept(false, 1e-6, 1.0, 1e-8, 1e-8);
        assertEquals(2, integ.getOrder());
    }

    // ===================== integrate(...) tests =====================

    @Test
    public void testIntegrateForwardScalarToleranceReturnsEndTime() throws Exception {
        ScalarAlwaysAccept integ = new ScalarAlwaysAccept(false, 1e-6, 1.0, 1e-8, 1e-8);
        double[] y0 = {1.0};
        double[] y  = new double[1];
        double tEnd = integ.integrate(new ExpEquations(), 0.0, y0, 1.0, y);
        assertEquals(1.0, tEnd, 1e-9);
        assertTrue("y[0] ควรเป็นค่าจำกัด (finite)", Double.isFinite(y[0]));
        assertTrue("y[0] ควรโตขึ้นจากค่าเริ่มต้นเพราะ y'=y>0", y[0] > y0[0]);
    }

    @Test
    public void testIntegrateForwardVectorToleranceReturnsEndTime() throws Exception {
        VectorAlwaysAccept integ = new VectorAlwaysAccept(
                false, 1e-6, 1.0, new double[]{1e-8}, new double[]{1e-8});
        double[] y0 = {1.0};
        double[] y  = new double[1];
        double tEnd = integ.integrate(new ExpEquations(), 0.0, y0, 1.0, y);
        assertEquals(1.0, tEnd, 1e-9);
        assertTrue(Double.isFinite(y[0]));
    }

    @Test
    public void testIntegrateBackwardReturnsEndTime() throws Exception {
        ScalarAlwaysAccept integ = new ScalarAlwaysAccept(false, 1e-6, 1.0, 1e-8, 1e-8);
        double[] y0 = {1.0};
        double[] y  = new double[1];
        // t < t0 -> forward = false
        double tEnd = integ.integrate(new ExpEquations(), 1.0, y0, 0.0, y);
        assertEquals(0.0, tEnd, 1e-9);
        assertTrue(Double.isFinite(y[0]));
    }

    @Test
    public void testIntegrateWithSameArrayReferenceForYAndY0() throws Exception {
        // ครอบคลุม branch: if (y != y0) == false (ข้าม System.arraycopy)
        ScalarAlwaysAccept integ = new ScalarAlwaysAccept(false, 1e-6, 1.0, 1e-8, 1e-8);
        double[] y0 = {1.0};
        double tEnd = integ.integrate(new ExpEquations(), 0.0, y0, 1.0, y0);
        assertEquals(1.0, tEnd, 1e-9);
        assertTrue(Double.isFinite(y0[0]));
    }

    @Test
    public void testIntegrateWithDifferentArrayReferenceCopiesInitialState() throws Exception {
        // ครอบคลุม branch: if (y != y0) == true
        ScalarAlwaysAccept integ = new ScalarAlwaysAccept(false, 1e-6, 1.0, 1e-8, 1e-8);
        double[] y0 = {1.0};
        double[] y  = new double[1];
        integ.integrate(new ExpEquations(), 0.0, y0, 1.0, y);
        assertNotSame(y0, y);
        // y0 ไม่ควรถูกแก้ไขโดยการเรียก integrate (เฉพาะ y เท่านั้นที่ถูกอัปเดต)
        assertEquals(1.0, y0[0], 1e-12);
    }

    @Test
    public void testIntegrateFsalTrueCompletesSuccessfully() throws Exception {
        // ครอบคลุม branch: fsal == true
        // (firstTime || !fsal) จะเป็น false หลัง step แรก, และ fsal-copy หลัง accept step
        ScalarAlwaysAccept integ = new ScalarAlwaysAccept(true, 1e-6, 1.0, 1e-8, 1e-8);
        double[] y0 = {1.0};
        double[] y  = new double[1];
        double tEnd = integ.integrate(new ExpEquations(), 0.0, y0, 1.0, y);
        assertEquals(1.0, tEnd, 1e-9);
        assertTrue(Double.isFinite(y[0]));
    }

    @Test
    public void testIntegrateRejectsStepThenAccepts() throws Exception {
        // ครอบคลุม branch: error > 1 (reject) -> คำนวณ factor ด้วย Math.min/Math.max
        // แล้วค่อย error <= 1 (accept) ในรอบถัดไป
        RejectOnceIntegrator integ = new RejectOnceIntegrator(1e-6, 1.0, 1e-8, 1e-8);
        double[] y0 = {1.0};
        double[] y  = new double[1];
        double tEnd = integ.integrate(new ExpEquations(), 0.0, y0, 1.0, y);
        assertEquals(1.0, tEnd, 1e-9);
        assertTrue("estimateError ควรถูกเรียกอย่างน้อย 2 ครั้ง (reject แล้ว accept)",
                   integ.getErrorCalls() >= 2);
    }

    @Test
    public void testIntegrateWithDenseOutputStepHandlerInvoked() throws Exception {
        // ครอบคลุม branch: requiresDenseOutput() == true -> ใช้ RungeKuttaStepInterpolator (prototype.copy())
        // และ loop "for (StepHandler handler : stepHandlers)" ที่ไม่ว่าง
        ScalarAlwaysAccept integ = new ScalarAlwaysAccept(false, 1e-6, 1.0, 1e-8, 1e-8);

        final boolean[] resetCalled   = {false};
        final boolean[] lastStepSeen  = {false};
        final int[]     handleCount   = {0};

        StepHandler handler = new StepHandler() {
            public boolean requiresDenseOutput() { return true; }
            public void reset() { resetCalled[0] = true; }
            public void handleStep(StepInterpolator interpolator, boolean isLast)
                    throws DerivativeException {
                handleCount[0]++;
                if (isLast) {
                    lastStepSeen[0] = true;
                }
            }
        };
        // สมมติฐาน: addStepHandler เป็น public API ที่สืบทอดมาจาก AbstractIntegrator
        integ.addStepHandler(handler);

        double[] y0 = {1.0};
        double[] y  = new double[1];
        double tEnd = integ.integrate(new ExpEquations(), 0.0, y0, 1.0, y);

        assertEquals(1.0, tEnd, 1e-9);
        assertTrue("reset() ของ StepHandler ควรถูกเรียก", resetCalled[0]);
        assertTrue("handleStep ควรถูกเรียกอย่างน้อยหนึ่งครั้ง", handleCount[0] >= 1);
        assertTrue("step สุดท้ายควรมี isLast == true", lastStepSeen[0]);
    }

    @Test
    public void testIntegrateDimensionMismatchThrowsException() {
        // ครอบคลุม branch sanityChecks (inherited) กรณี dimension ไม่ตรงกัน
        // หมายเหตุ: sanityChecks ไม่ได้แสดงใน source ที่ให้มา จึงไม่ยืนยัน exception type ที่แน่นอน
        // เพียงยืนยันว่ามี exception เกิดขึ้นจริงตาม throws clause ของ integrate(...)
        ScalarAlwaysAccept integ = new ScalarAlwaysAccept(false, 1e-6, 1.0, 1e-8, 1e-8);
        double[] y0 = {1.0, 2.0};   // dimension = 2
        double[] y  = new double[2];
        try {
            integ.integrate(new ExpEquations(), 0.0, y0, 1.0, y); // equations dimension = 1
            fail("คาดหวัง exception เมื่อ dimension ของ equations และ y0 ไม่ตรงกัน");
        } catch (DerivativeException | IntegratorException e) {
            assertNotNull(e);
        } catch (RuntimeException e) {
            // อาจเป็น ArrayIndexOutOfBoundsException หรืออื่น ๆ ขึ้นกับ sanityChecks ที่ไม่ได้แสดงใน source
            assertNotNull(e);
        }
    }

    @Test
    public void testIntegrateWithNullInitialStateThrowsException() {
        // ค่า null/ว่าง - สมมติฐาน: ควร throw exception บางชนิดก่อนเข้าสู่ loop หลัก
        ScalarAlwaysAccept integ = new ScalarAlwaysAccept(false, 1e-6, 1.0, 1e-8, 1e-8);
        try {
            integ.integrate(new ExpEquations(), 0.0, null, 1.0, new double[1]);
            fail("คาดหวัง exception เมื่อ y0 เป็น null");
        } catch (Exception e) {
            // ไม่ยืนยัน exception type ที่แน่ชัดเนื่องจาก sanityChecks ไม่ได้แสดงใน source
            assertNotNull(e);
        }
    }
}
