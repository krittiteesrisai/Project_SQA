# วิเคราะห์และแนวทางการทดสอบ

เนื่องจาก `EmbeddedRungeKuttaIntegrator` เป็น abstract class ที่ต้องพึ่งพา `RungeKuttaStepInterpolator` (abstract) และ `AdaptiveStepsizeIntegrator` (superclass) ผมจึงสร้าง **concrete subclass ชั่วคราว** (nested class) เพื่อใช้ทดสอบ โดยควบคุม `estimateError()` ผ่าน queue ที่กำหนดได้ เพื่อบังคับให้เกิด branch ทั้ง accept/reject step ได้ตามต้องการ

> **หมายเหตุสำคัญ:** เมธอด `sanityChecks`, `initializeStep`, `acceptStep`, `filterStep` เป็นของคลาสแม่ `AdaptiveStepsizeIntegrator` ซึ่งไม่มี source ให้มา ผมจึง **ไม่เดา exception type ที่แน่นอน** จากเมธอดเหล่านี้ และหลีกเลี่ยงกรณีที่อาจทำให้ test ค้าง (infinite loop) เช่น กรณี duration = 0 พอดี — จะ comment กำกับไว้ทุกจุดที่มีความไม่แน่นอน

```java
package org.apache.commons.math.ode.nonstiff;

import static org.junit.Assert.*;

import java.util.LinkedList;
import java.util.Queue;

import org.junit.Test;

import org.apache.commons.math.ode.ExpandableStatefulODE;
import org.apache.commons.math.ode.FirstOrderDifferentialEquations;
import org.apache.commons.math.ode.sampling.StepInterpolator;

// import เป้าหมายอย่างชัดเจนตามข้อกำหนด (แม้จะอยู่ package เดียวกันก็ตาม)
import org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator;

/**
 * Unit tests for {@link EmbeddedRungeKuttaIntegrator}.
 *
 * หมายเหตุ: หลายเมธอดที่ integrate() เรียกใช้ (sanityChecks, initializeStep,
 * acceptStep, filterStep) อยู่ใน superclass ที่ไม่มี source ให้มา
 * ดังนั้นการทดสอบจะอิงตามพฤติกรรมที่ "สังเกตได้" จาก source ของ
 * EmbeddedRungeKuttaIntegrator เท่านั้น ไม่เดา exception/edge-case
 * ที่ไม่สามารถยืนยันได้จาก source ที่ให้มา
 */
public class EmbeddedRungeKuttaIntegratorTest {

    // ---------- Helper: Butcher tableau แบบ 3-stage ----------
    // sum(b) = 1 -> ด้วย derivative คงที่ ผลลัพธ์ควร "แม่นยำ" (exact)
    // ไม่ว่า order ที่ประกาศจะเป็นเท่าไร (ใช้ตรวจจับ fault ในการสะสม step ได้ดี)
    private static final double[] C = {0.5, 1.0};
    private static final double[][] A = { {0.5}, {-1.0, 2.0} };
    private static final double[] B = {1.0 / 6.0, 2.0 / 3.0, 1.0 / 6.0};

    // ---------- Helper equations: dy/dt = 1 (ทุกมิติ) ----------
    private static class ConstantDerivativeEquations implements FirstOrderDifferentialEquations {
        private final int dim;
        ConstantDerivativeEquations(int dim) { this.dim = dim; }
        public int getDimension() { return dim; }
        public void computeDerivatives(double t, double[] y, double[] yDot) {
            for (int i = 0; i < dim; ++i) {
                yDot[i] = 1.0;
            }
        }
    }

    // ---------- Helper: Minimal concrete StepInterpolator ----------
    private static class SimpleStepInterpolator extends RungeKuttaStepInterpolator {
        public SimpleStepInterpolator() {
            super();
        }
        public SimpleStepInterpolator(SimpleStepInterpolator interpolator) {
            super(interpolator);
        }
        @Override
        protected StepInterpolator doCopy() {
            return new SimpleStepInterpolator(this);
        }
        @Override
        protected void computeInterpolatedStateAndDerivatives(double theta, double oneMinusThetaH) {
            // ไม่ถูกเรียกใช้ในกรณีทดสอบนี้ (ไม่มี step handler ที่ขอ dense output)
        }
    }

    // ---------- Helper: Concrete subclass สำหรับทดสอบ ----------
    private static class TestEmbeddedRK extends EmbeddedRungeKuttaIntegrator {

        private final Queue<Double> forcedErrors = new LinkedList<Double>();
        private final int order;

        TestEmbeddedRK(boolean fsal, double[] c, double[][] a, double[] b,
                       double minStep, double maxStep,
                       double scalAbsTol, double scalRelTol, int order) {
            super("test-rk", fsal, c, a, b, new SimpleStepInterpolator(),
                  minStep, maxStep, scalAbsTol, scalRelTol);
            this.order = order;
        }

        TestEmbeddedRK(boolean fsal, double[] c, double[][] a, double[] b,
                       double minStep, double maxStep,
                       double[] vecAbsTol, double[] vecRelTol, int order) {
            super("test-rk", fsal, c, a, b, new SimpleStepInterpolator(),
                  minStep, maxStep, vecAbsTol, vecRelTol);
            this.order = order;
        }

        // constructor สำหรับทดสอบ null prototype (boundary/null case)
        TestEmbeddedRK(boolean fsal, double[] c, double[][] a, double[] b,
                       RungeKuttaStepInterpolator prototype,
                       double minStep, double maxStep,
                       double scalAbsTol, double scalRelTol, int order) {
            super("test-rk", fsal, c, a, b, prototype,
                  minStep, maxStep, scalAbsTol, scalRelTol);
            this.order = order;
        }

        @Override
        public int getOrder() {
            return order;
        }

        /** กำหนด error ที่ต้องการให้ estimateError คืนค่าตามลำดับ */
        void enqueueError(double e) {
            forcedErrors.add(e);
        }

        @Override
        protected double estimateError(double[][] yDotK, double[] y0, double[] y1, double h) {
            if (!forcedErrors.isEmpty()) {
                return forcedErrors.poll();
            }
            return 0.1; // ค่า default: ยอมรับ step (error < 1)
        }
    }

    // =====================================================================
    // 1. Getter/Setter ของ safety / minReduction / maxGrowth
    // =====================================================================
    @Test
    public void testDefaultControlParameters() {
        TestEmbeddedRK integ = new TestEmbeddedRK(false, C, A, B,
                1.0e-6, 1.0, 1.0e-6, 1.0e-6, 3);
        assertEquals(0.9, integ.getSafety(), 1.0e-15);
        assertEquals(0.2, integ.getMinReduction(), 1.0e-15);
        assertEquals(10.0, integ.getMaxGrowth(), 1.0e-15);
    }

    @Test
    public void testSettersGetters() {
        TestEmbeddedRK integ = new TestEmbeddedRK(false, C, A, B,
                1.0e-6, 1.0, 1.0e-6, 1.0e-6, 3);
        integ.setSafety(0.8);
        integ.setMinReduction(0.3);
        integ.setMaxGrowth(5.0);
        assertEquals(0.8, integ.getSafety(), 1.0e-15);
        assertEquals(0.3, integ.getMinReduction(), 1.0e-15);
        assertEquals(5.0, integ.getMaxGrowth(), 1.0e-15);
    }

    // =====================================================================
    // 2. Forward integration, scalar tolerance, fsal = false, ไม่มี reject
    //    ครอบคลุม: firstTime=true branch, "firstTime || !fsal" = true (fsal false),
    //    stage loop k=1 (inner l-loop ไม่ execute), k=2 (inner l-loop execute 1 ครั้ง)
    // =====================================================================
    @Test(timeout = 5000)
    public void testForwardIntegration_ScalarTolerance_FsalFalse_NoRejection() {
        TestEmbeddedRK integ = new TestEmbeddedRK(false, C, A, B,
                1.0e-6, 1.0, 1.0e-10, 1.0e-10, 3);

        ExpandableStatefulODE ode = new ExpandableStatefulODE(new ConstantDerivativeEquations(1));
        ode.setTime(0.0);
        ode.setCompleteState(new double[]{5.0});

        integ.integrate(ode, 2.0);

        assertEquals(2.0, ode.getTime(), 1.0e-9);
        assertEquals(7.0, ode.getCompleteState()[0], 1.0e-9);
    }

    // =====================================================================
    // 3. fsal = true -> ครอบคลุม branch "firstTime || !fsal" = false
    //    (ไม่ recompute first stage derivative หลัง firstTime)
    // =====================================================================
    @Test(timeout = 5000)
    public void testForwardIntegration_ScalarTolerance_FsalTrue_NoRejection() {
        TestEmbeddedRK integ = new TestEmbeddedRK(true, C, A, B,
                1.0e-6, 1.0, 1.0e-10, 1.0e-10, 3);

        ExpandableStatefulODE ode = new ExpandableStatefulODE(new ConstantDerivativeEquations(1));
        ode.setTime(0.0);
        ode.setCompleteState(new double[]{1.0});

        integ.integrate(ode, 3.0);

        assertEquals(3.0, ode.getTime(), 1.0e-9);
        assertEquals(4.0, ode.getCompleteState()[0], 1.0e-9);
    }

    // =====================================================================
    // 4. Vector tolerance -> ครอบคลุม branch (vecAbsoluteTolerance != null)
    // =====================================================================
    @Test(timeout = 5000)
    public void testForwardIntegration_VectorTolerance() {
        double[] absTol = {1.0e-10};
        double[] relTol = {1.0e-10};
        TestEmbeddedRK integ = new TestEmbeddedRK(false, C, A, B,
                1.0e-6, 1.0, absTol, relTol, 3);

        ExpandableStatefulODE ode = new ExpandableStatefulODE(new ConstantDerivativeEquations(1));
        ode.setTime(0.0);
        ode.setCompleteState(new double[]{0.0});

        integ.integrate(ode, 1.0);

        assertEquals(1.0, ode.getTime(), 1.0e-9);
        assertEquals(1.0, ode.getCompleteState()[0], 1.0e-9);
    }

    // =====================================================================
    // 5. บังคับให้เกิด reject 1 ครั้ง (error >= 1) แล้ว accept
    //    ครอบคลุม: while(error>=1.0) วนซ้ำ, if(error>=1.0) true branch,
    //    การเรียก filterStep กรณี reject
    // =====================================================================
    @Test(timeout = 5000)
    public void testIntegrationWithOneRejectedStep() {
        TestEmbeddedRK integ = new TestEmbeddedRK(false, C, A, B,
                1.0e-9, 1.0, 1.0e-8, 1.0e-8, 3);
        integ.enqueueError(5.0); // บังคับ reject รอบแรก, รอบถัดไปใช้ default (0.1) -> accept

        ExpandableStatefulODE ode = new ExpandableStatefulODE(new ConstantDerivativeEquations(1));
        ode.setTime(0.0);
        ode.setCompleteState(new double[]{0.0});

        integ.integrate(ode, 1.0);

        assertEquals(1.0, ode.getTime(), 1.0e-6);
        assertEquals(1.0, ode.getCompleteState()[0], 1.0e-6);
    }

    // =====================================================================
    // 6. Backward integration -> forward = false
    //    ครอบคลุม: nextIsLast = (nextT <= t), filteredNextIsLast สำหรับ backward
    // =====================================================================
    @Test(timeout = 5000)
    public void testBackwardIntegration() {
        TestEmbeddedRK integ = new TestEmbeddedRK(false, C, A, B,
                1.0e-6, 1.0, 1.0e-10, 1.0e-10, 3);

        ExpandableStatefulODE ode = new ExpandableStatefulODE(new ConstantDerivativeEquations(1));
        ode.setTime(1.0);
        ode.setCompleteState(new double[]{5.0});

        integ.integrate(ode, 0.0); // t < equations.getTime() -> forward=false

        assertEquals(0.0, ode.getTime(), 1.0e-9);
        assertEquals(4.0, ode.getCompleteState()[0], 1.0e-9);
    }

    // =====================================================================
    // 7. Multi-step (maxStep เล็กเทียบกับช่วง integrate) -> หลาย iteration
    //    ของ do-while, ครอบคลุม if(!isLastStep) true หลายครั้ง และ false ครั้งสุดท้าย
    // =====================================================================
    @Test(timeout = 5000)
    public void testMultiStepIntegrationSmallMaxStep() {
        TestEmbeddedRK integ = new TestEmbeddedRK(true, C, A, B,
                1.0e-9, 0.05, 1.0e-10, 1.0e-10, 3);

        ExpandableStatefulODE ode = new ExpandableStatefulODE(new ConstantDerivativeEquations(1));
        ode.setTime(0.0);
        ode.setCompleteState(new double[]{0.0});

        integ.integrate(ode, 2.0);

        assertEquals(2.0, ode.getTime(), 1.0e-6);
        assertEquals(2.0, ode.getCompleteState()[0], 1.0e-6);
    }

    // =====================================================================
    // 8. ขอบเขต: stages = 1 (c, a ว่าง) -> loop "for k=1;k<stages" ไม่ execute เลย
    // =====================================================================
    @Test(timeout = 5000)
    public void testMinimalSingleStageMethod() {
        double[] emptyC = new double[0];
        double[][] emptyA = new double[0][];
        double[] singleB = {1.0};

        TestEmbeddedRK integ = new TestEmbeddedRK(false, emptyC, emptyA, singleB,
                1.0e-6, 1.0, 1.0e-10, 1.0e-10, 1);

        ExpandableStatefulODE ode = new ExpandableStatefulODE(new ConstantDerivativeEquations(1));
        ode.setTime(0.0);
        ode.setCompleteState(new double[]{0.0});

        integ.integrate(ode, 1.0);

        assertEquals(1.0, ode.getTime(), 1.0e-9);
        assertEquals(1.0, ode.getCompleteState()[0], 1.0e-9);
    }

    // =====================================================================
    // 9. หลายมิติ (dimension = 2) -> ตรวจสอบ loop ภายในทำงานถูกต้องกับหลาย y
    // =====================================================================
    @Test(timeout = 5000)
    public void testMultiDimensionalEquations() {
        TestEmbeddedRK integ = new TestEmbeddedRK(false, C, A, B,
                1.0e-6, 1.0, 1.0e-10, 1.0e-10, 3);

        ExpandableStatefulODE ode = new ExpandableStatefulODE(new ConstantDerivativeEquations(2));
        ode.setTime(0.0);
        ode.setCompleteState(new double[]{0.0, 10.0});

        integ.integrate(ode, 1.5);

        double[] finalState = ode.getCompleteState();
        assertEquals(1.5, finalState[0], 1.0e-9);
        assertEquals(11.5, finalState[1], 1.0e-9);
    }

    // =====================================================================
    // 10. ช่วง integrate สั้นมาก (boundary ใกล้ t0 แต่ไม่เท่ากัน)
    //     ครอบคลุม branch "if (filteredNextIsLast) hNew = t - stepStart;"
    // =====================================================================
    @Test(timeout = 5000)
    public void testVeryShortIntegrationInterval() {
        TestEmbeddedRK integ = new TestEmbeddedRK(false, C, A, B,
                1.0e-9, 10.0, 1.0e-8, 1.0e-8, 3);

        ExpandableStatefulODE ode = new ExpandableStatefulODE(new ConstantDerivativeEquations(1));
        ode.setTime(0.0);
        ode.setCompleteState(new double[]{0.0});

        integ.integrate(ode, 1.0e-3);

        assertEquals(1.0e-3, ode.getTime(), 1.0e-9);
        assertEquals(1.0e-3, ode.getCompleteState()[0], 1.0e-9);
    }

    // =====================================================================
    // 11. Null prototype -> NullPointerException จาก prototype.copy()
    //     (พฤติกรรมนี้มาจากการ dereference null ตรง ๆ ใน source ที่ให้มา
    //      จึงเป็นพฤติกรรมที่ยืนยันได้ ไม่ใช่การเดา)
    // =====================================================================
    @Test(expected = NullPointerException.class, timeout = 5000)
    public void testNullPrototypeThrowsNPE() {
        TestEmbeddedRK integ = new TestEmbeddedRK(false, C, A, B,
                (RungeKuttaStepInterpolator) null,
                1.0e-6, 1.0, 1.0e-10, 1.0e-10, 3);

        ExpandableStatefulODE ode = new ExpandableStatefulODE(new ConstantDerivativeEquations(1));
        ode.setTime(0.0);
        ode.setCompleteState(new double[]{0.0});

        integ.integrate(ode, 1.0);
    }

    // =====================================================================
    // 12. Null equations -> คาดหวังว่าจะเกิด exception บางชนิด
    //     (ไม่สามารถยืนยัน exception type ที่แน่นอนได้ เนื่องจาก sanityChecks()
    //      อยู่ใน superclass ที่ไม่มี source ให้มา จึงตรวจแบบ generic)
    // =====================================================================
    @Test(timeout = 5000)
    public void testNullEquationsThrowsSomeException() {
        TestEmbeddedRK integ = new TestEmbeddedRK(false, C, A, B,
                1.0e-6, 1.0, 1.0e-10, 1.0e-10, 3);
        try {
            integ.integrate(null, 1.0);
            fail("Expected an exception when equations is null");
        } catch (RuntimeException ex) {
            // ยอมรับ RuntimeException ทุกชนิด (NPE หรือ custom exception จาก sanityChecks)
            assertNotNull(ex);
        }
    }

    // =====================================================================
    // 13. Empty b array mismatched? -> ใช้ dimension เดียวแต่ equations คืน
    //     derivative เป็น 0 เพื่อตรวจสอบกรณี y ไม่เปลี่ยน (boundary value)
    // =====================================================================
    @Test(timeout = 5000)
    public void testZeroDerivativeKeepsStateConstant() {
        TestEmbeddedRK integ = new TestEmbeddedRK(false, C, A, B,
                1.0e-6, 1.0, 1.0e-10, 1.0e-10, 3);

        FirstOrderDifferentialEquations zeroEq = new FirstOrderDifferentialEquations() {
            public int getDimension() { return 1; }
            public void computeDerivatives(double t, double[] y, double[] yDot) {
                yDot[0] = 0.0;
            }
        };

        ExpandableStatefulODE ode = new ExpandableStatefulODE(zeroEq);
        ode.setTime(0.0);
        ode.setCompleteState(new double[]{42.0});

        integ.integrate(ode, 5.0);

        assertEquals(5.0, ode.getTime(), 1.0e-9);
        assertEquals(42.0, ode.getCompleteState()[0], 1.0e-9);
    }
}
```

## สรุป Branch/Condition ที่แต่ละ Test ครอบคลุม

| # | เมธอดทดสอบ | Branch / Condition ที่ครอบคลุม |
|---|---|---|
| 1 | `testDefaultControlParameters` | ค่า default ของ `safety/minReduction/maxGrowth` จาก constructor |
| 2 | `testSettersGetters` | setter/getter ของ safety, minReduction, maxGrowth |
| 3 | `testForwardIntegration_ScalarTolerance_FsalFalse_NoRejection` | `forward=true`, `vecAbsoluteTolerance==null` (scalar branch), `firstTime||!fsal`=true, stage loop k=1 (inner l-loop skip) และ k=2 (inner l-loop execute), `error<1` (accept ทันที) |
| 4 | `testForwardIntegration_ScalarTolerance_FsalTrue_NoRejection` | `fsal=true` → branch `firstTime||!fsal`=false หลัง firstTime, fsal copy yDotK[0] branch (`if(fsal)`) |
| 5 | `testForwardIntegration_VectorTolerance` | branch `vecAbsoluteTolerance!=null` (vector tolerance loop) |
| 6 | `testIntegrationWithOneRejectedStep` | `while(error>=1.0)` วนซ้ำ, `if(error>=1.0)` true branch, `filterStep` เมื่อ reject |
| 7 | `testBackwardIntegration` | `forward=false`, `nextIsLast = (nextT<=t)` สำหรับ backward |
| 8 | `testMultiStepIntegrationSmallMaxStep` | do-while วนหลายรอบ, `if(!isLastStep)` true ซ้ำหลายครั้งและ false ครั้งสุดท้าย, fsal copy derivative branch |
| 9 | `testMinimalSingleStageMethod` | boundary: `stages=1` → for-loop stage (`k<stages`) ไม่ execute เลย |
| 10 | `testMultiDimensionalEquations` | loop ภายใน (`for j<y0.length`) กับหลายมิติ |
| 11 | `testVeryShortIntegrationInterval` | boundary ช่วงเวลาสั้น → branch `if(filteredNextIsLast) hNew=t-stepStart` |
| 12 | `testNullPrototypeThrowsNPE` | null input → NPE จาก `prototype.copy()` |
| 13 | `testNullEquationsThrowsSomeException` | null equations → exception (generic, ไม่ยืนยัน type เนื่องจากไม่มี source ของ `sanityChecks`) |
| 14 | `testZeroDerivativeKeepsStateConstant` | boundary derivative=0 → ตรวจสอบว่า error-estimation/step logic ไม่ทำให้ state เปลี่ยนผิดพลาด |

**ข้อจำกัดที่ยอมรับ (ตามข้อกำหนดห้ามเดา):**
- ไม่ทดสอบ exception เฉพาะเจาะจงจาก `sanityChecks`, `initializeStep`, `acceptStep`, `filterStep` เนื่องจากไม่มี source ของ `AdaptiveStepsizeIntegrator` ให้มา
- ไม่ทดสอบกรณี duration = 0 พอดี (t == equations.getTime()) เพราะมีความเสี่ยงให้เกิด infinite loop ที่ไม่สามารถยืนยัน behavior ได้จาก source ที่ให้มา