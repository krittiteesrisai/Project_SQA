# วิเคราะห์และออกแบบ Test

เนื่องจาก `EmbeddedRungeKuttaIntegrator` เป็น **abstract class** ที่ constructor เป็น `protected` และมี abstract method 2 ตัว (`getOrder()`, `estimateError(...)`) การทดสอบจึงต้องสร้าง **concrete subclass ภายใน test class** ที่ควบคุม Butcher tableau และค่า error ได้เอง เพื่อบังคับให้ branch ต่าง ๆ ใน `integrate(...)` ทำงานตามที่ต้องการ โดยไม่ต้องพึ่งพา API ที่ไม่ได้แสดงในซอร์ส (เช่น `addStepHandler`, event handler API, `RungeKuttaStepInterpolator` concrete implementation) — จุดเหล่านี้จะถูกคอมเมนต์กำกับว่า "ไม่ครอบคลุม" ตามข้อกำหนดที่ 4

ใช้สมการ ODE ที่มี derivative คงที่ (`dy/dt = slope`) เพื่อให้สามารถคำนวณคำตอบที่แน่นอนได้ ไม่ว่าขนาดก้าวจะเป็นอย่างไร (เพราะ `b` รวมกันได้ 1 พอดี) ทำให้ assertion แม่นยำและไม่ flaky

```java
import org.apache.commons.math.ode.DerivativeException;
import org.apache.commons.math.ode.FirstOrderDifferentialEquations;
import org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Unit tests for {@link EmbeddedRungeKuttaIntegrator}.
 *
 * หมายเหตุสำคัญ (assumption ที่ประกาศไว้ตามข้อกำหนดที่ 4):
 * - ไม่มีการเรียก addStepHandler/addEventHandler เพราะ signature ของเมธอดเหล่านี้ไม่ได้
 *   แสดงอยู่ในซอร์สโค้ดที่ให้มา (ประกาศอยู่ใน superclass ที่ไม่ได้ให้มา) ดังนั้น branch
 *   ที่เกี่ยวกับ dense-output interpolator (RungeKuttaStepInterpolator) และ event-handling
 *   (CombinedEventsManager.evaluateStep/reset ที่ return true) จะไม่ถูกทดสอบในชุดนี้
 *   เพราะจะเป็นการเดา behavior ของคลาสอื่นที่ไม่มีซอร์สให้
 * - prototype interpolator ส่งเป็น null เพราะใน flow ที่ไม่มี event handler และไม่ต้องการ
 *   dense output มันจะไม่ถูก dereference เลย (ดูจาก source: ใช้เฉพาะเมื่อ
 *   requiresDenseOutput() || !eventsHandlersManager.isEmpty())
 */
public class EmbeddedRungeKuttaIntegratorTest {

    // ---------- ODE คงที่ (dy/dt = slope) เพื่อให้คำตอบแม่นยำไม่ขึ้นกับขนาดก้าว ----------
    private static class ConstantSlopeEquations implements FirstOrderDifferentialEquations {
        private final int dimension;
        private final double slope;

        ConstantSlopeEquations(int dimension, double slope) {
            this.dimension = dimension;
            this.slope = slope;
        }

        public int getDimension() {
            return dimension;
        }

        public void computeDerivatives(double t, double[] y, double[] yDot)
            throws DerivativeException {
            for (int i = 0; i < dimension; ++i) {
                yDot[i] = slope;
            }
        }
    }

    // ---------- base class ที่กำหนด Butcher tableau 2 stage (order 2, trapezoidal b) ----------
    private abstract static class BaseTestRK extends EmbeddedRungeKuttaIntegrator {

        private double[] errorSequence; // null => accept ทันทีทุกครั้ง (0.1)
        private int callIndex = 0;

        BaseTestRK(boolean fsal, double minStep, double maxStep,
                   double scalAbsTol, double scalRelTol) {
            super("test-rk2", fsal,
                  new double[] { 1.0 },
                  new double[][] { { 1.0 } },
                  new double[] { 0.5, 0.5 },
                  null,
                  minStep, maxStep, scalAbsTol, scalRelTol);
        }

        BaseTestRK(boolean fsal, double minStep, double maxStep,
                   double[] vecAbsTol, double[] vecRelTol) {
            super("test-rk2", fsal,
                  new double[] { 1.0 },
                  new double[][] { { 1.0 } },
                  new double[] { 0.5, 0.5 },
                  null,
                  minStep, maxStep, vecAbsTol, vecRelTol);
        }

        /** กำหนดลำดับค่า error ที่จะคืนในแต่ละครั้งที่ estimateError ถูกเรียก
         *  (ค่าสุดท้ายใน array จะถูกใช้ซ้ำไปเรื่อย ๆ) */
        void setErrorSequence(double[] errorSequence) {
            this.errorSequence = errorSequence;
            this.callIndex = 0;
        }

        int getErrorCallCount() {
            return callIndex;
        }

        @Override
        protected double estimateError(double[][] yDotK, double[] y0, double[] y1, double h) {
            double e;
            if (errorSequence == null) {
                e = 0.1; // ค่าเริ่มต้น: <=1.0 เสมอ -> step ถูก accept ทุกครั้ง
            } else {
                e = errorSequence[Math.min(callIndex, errorSequence.length - 1)];
            }
            callIndex++;
            return e;
        }
    }

    /** order = 2 (ปกติ ไม่ทำให้ exp ผิดปกติ) */
    private static class RK2Integrator extends BaseTestRK {
        RK2Integrator(boolean fsal, double minStep, double maxStep,
                      double absTol, double relTol) {
            super(fsal, minStep, maxStep, absTol, relTol);
        }

        RK2Integrator(boolean fsal, double minStep, double maxStep,
                      double[] vecAbsTol, double[] vecRelTol) {
            super(fsal, minStep, maxStep, vecAbsTol, vecRelTol);
        }

        @Override
        public int getOrder() {
            return 2;
        }
    }

    /** order = 0 -> exp = -1/0 = -Infinity (boundary/fault-finding case) */
    private static class RK0Integrator extends BaseTestRK {
        RK0Integrator(boolean fsal, double minStep, double maxStep,
                      double absTol, double relTol) {
            super(fsal, minStep, maxStep, absTol, relTol);
        }

        @Override
        public int getOrder() {
            return 0;
        }
    }

    private static final double DELTA = 1.0e-6;

    // =========================== getOrder() ===========================

    @Test
    public void testGetOrderNormal() {
        RK2Integrator integ = new RK2Integrator(true, 1e-6, 1.0, 1e-8, 1e-8);
        assertEquals(2, integ.getOrder());
    }

    @Test
    public void testGetOrderZeroBoundary() {
        RK0Integrator integ = new RK0Integrator(true, 1e-6, 1.0, 1e-8, 1e-8);
        assertEquals(0, integ.getOrder());
    }

    // ============== safety / minReduction / maxGrowth default + setter ==============

    @Test
    public void testDefaultControlParameters() {
        RK2Integrator integ = new RK2Integrator(true, 1e-6, 1.0, 1e-8, 1e-8);
        assertEquals(0.9, integ.getSafety(), DELTA);
        assertEquals(0.2, integ.getMinReduction(), DELTA);
        assertEquals(10.0, integ.getMaxGrowth(), DELTA);
    }

    @Test
    public void testSetSafety() {
        RK2Integrator integ = new RK2Integrator(true, 1e-6, 1.0, 1e-8, 1e-8);
        integ.setSafety(0.5);
        assertEquals(0.5, integ.getSafety(), DELTA);
        // boundary: source ไม่มีการ validate ค่า จึงยอมรับค่าติดลบได้ (behavior ปัจจุบัน)
        integ.setSafety(-1.0);
        assertEquals(-1.0, integ.getSafety(), DELTA);
    }

    @Test
    public void testSetMinReduction() {
        RK2Integrator integ = new RK2Integrator(true, 1e-6, 1.0, 1e-8, 1e-8);
        integ.setMinReduction(0.9);
        assertEquals(0.9, integ.getMinReduction(), DELTA);
        // boundary: ไม่มี validate ว่า minReduction ต้อง <= maxGrowth
        integ.setMinReduction(50.0);
        assertEquals(50.0, integ.getMinReduction(), DELTA);
    }

    @Test
    public void testSetMaxGrowth() {
        RK2Integrator integ = new RK2Integrator(true, 1e-6, 1.0, 1e-8, 1e-8);
        integ.setMaxGrowth(2.5);
        assertEquals(2.5, integ.getMaxGrowth(), DELTA);
        integ.setMaxGrowth(0.0);
        assertEquals(0.0, integ.getMaxGrowth(), DELTA);
    }

    // ===================== integrate(): forward, scalar tolerance =====================

    @Test
    public void testIntegrateForward_FsalTrue_ScalarTolerance() throws Exception {
        RK2Integrator integ = new RK2Integrator(true, 1e-6, 1.0, 1e-8, 1e-8);
        ConstantSlopeEquations eq = new ConstantSlopeEquations(1, 2.0);
        double[] y0 = { 1.0 };
        double[] y = new double[1];

        double stopTime = integ.integrate(eq, 0.0, y0, 5.0, y);

        assertEquals(5.0, stopTime, DELTA);
        assertEquals(11.0, y[0], DELTA); // 1 + 2*5
    }

    @Test
    public void testIntegrateForward_FsalFalse_ScalarTolerance() throws Exception {
        RK2Integrator integ = new RK2Integrator(false, 1e-6, 1.0, 1e-8, 1e-8);
        ConstantSlopeEquations eq = new ConstantSlopeEquations(1, 2.0);
        double[] y0 = { 1.0 };
        double[] y = new double[1];

        double stopTime = integ.integrate(eq, 0.0, y0, 5.0, y);

        assertEquals(5.0, stopTime, DELTA);
        assertEquals(11.0, y[0], DELTA);
    }

    // ===================== integrate(): backward (forward == false branch) =====================

    @Test
    public void testIntegrateBackward() throws Exception {
        RK2Integrator integ = new RK2Integrator(true, 1e-6, 1.0, 1e-8, 1e-8);
        ConstantSlopeEquations eq = new ConstantSlopeEquations(1, 2.0);
        double[] y0 = { 11.0 };
        double[] y = new double[1];

        // t (=0.0) < t0 (=5.0) -> forward = false
        double stopTime = integ.integrate(eq, 5.0, y0, 0.0, y);

        assertEquals(0.0, stopTime, DELTA);
        assertEquals(1.0, y[0], DELTA); // 11 + 2*(0-5)
    }

    // ===================== integrate(): vector tolerance branch =====================

    @Test
    public void testIntegrateVectorTolerance() throws Exception {
        double[] absTol = { 1e-8, 1e-8 };
        double[] relTol = { 1e-8, 1e-8 };
        RK2Integrator integ = new RK2Integrator(true, 1e-6, 1.0, absTol, relTol);
        ConstantSlopeEquations eq = new ConstantSlopeEquations(2, 3.0);
        double[] y0 = { 0.0, 0.0 };
        double[] y = new double[2];

        double stopTime = integ.integrate(eq, 0.0, y0, 2.0, y);

        assertEquals(2.0, stopTime, DELTA);
        assertEquals(6.0, y[0], DELTA);
        assertEquals(6.0, y[1], DELTA);
    }

    // ===================== integrate(): reject-then-accept loop branch =====================

    @Test
    public void testIntegrateRejectThenAccept() throws Exception {
        RK2Integrator integ = new RK2Integrator(true, 1e-6, 1.0, 1e-8, 1e-8);
        // ครั้งแรก error=2.0 (>1 -> reject), ครั้งต่อไป error=0.1 (<=1 -> accept)
        integ.setErrorSequence(new double[] { 2.0, 0.1 });
        ConstantSlopeEquations eq = new ConstantSlopeEquations(1, 2.0);
        double[] y0 = { 1.0 };
        double[] y = new double[1];

        double stopTime = integ.integrate(eq, 0.0, y0, 5.0, y);

        assertEquals(5.0, stopTime, DELTA);
        assertEquals(11.0, y[0], DELTA);
        // ยืนยันว่า loop reject ถูก execute จริง (estimateError ถูกเรียกมากกว่า 1 ครั้ง)
        assertTrue("estimateError ควรถูกเรียกมากกว่า 1 ครั้งจาก reject-loop",
                   integ.getErrorCallCount() > 1);
    }

    // ===================== integrate(): y == y0 (ข้าม System.arraycopy branch) =====================

    @Test
    public void testIntegrateSameArrayReference() throws Exception {
        RK2Integrator integ = new RK2Integrator(true, 1e-6, 1.0, 1e-8, 1e-8);
        ConstantSlopeEquations eq = new ConstantSlopeEquations(1, 2.0);
        double[] y0 = { 1.0 };

        // ส่ง array เดียวกันเป็นทั้ง y0 และ y -> เข้า branch "if (y != y0)" เป็น false
        double stopTime = integ.integrate(eq, 0.0, y0, 5.0, y0);

        assertEquals(5.0, stopTime, DELTA);
        assertEquals(11.0, y0[0], DELTA);
    }

    // ===================== integrate(): y != y0 (เข้า System.arraycopy branch) =====================

    @Test
    public void testIntegrateDifferentArrayReference() throws Exception {
        RK2Integrator integ = new RK2Integrator(true, 1e-6, 1.0, 1e-8, 1e-8);
        ConstantSlopeEquations eq = new ConstantSlopeEquations(1, 2.0);
        double[] y0 = { 1.0 };
        double[] y = new double[1];

        double stopTime = integ.integrate(eq, 0.0, y0, 5.0, y);

        assertEquals(5.0, stopTime, DELTA);
        // y0 ต้องไม่ถูกแก้ไข เพราะ integrate ทำงานบน array y (คัดลอกค่ามาแล้ว)
        assertEquals(1.0, y0[0], DELTA);
        assertEquals(11.0, y[0], DELTA);
    }

    // ===================== boundary: getOrder() == 0 -> exp = -Infinity =====================

    @Test(timeout = 3000)
    public void testIntegrateWithOrderZeroBoundary() throws Exception {
        RK0Integrator integ = new RK0Integrator(true, 1e-6, 0.5, 1e-6, 1e-6);
        ConstantSlopeEquations eq = new ConstantSlopeEquations(1, 1.0);
        double[] y0 = { 1.0 };
        double[] y = new double[1];

        // ODE มี derivative คงที่ ดังนั้นคำตอบต้องถูกต้องเสมอไม่ว่า step-size control
        // จะผิดปกติเพียงใด (exp = -1/0 = -Infinity) ถ้าเกิด infinite loop/hang test
        // จะ fail ด้วย timeout ซึ่งถือเป็นการดักจับ fault ที่อาจเกิดขึ้นได้
        double stopTime = integ.integrate(eq, 0.0, y0, 1.0, y);

        assertEquals(1.0, stopTime, DELTA);
        assertEquals(2.0, y[0], DELTA);
    }

    // ===================== sanity check: dimension mismatch =====================

    @Test
    public void testIntegrateDimensionMismatchThrowsException() {
        RK2Integrator integ = new RK2Integrator(true, 1e-6, 1.0, 1e-8, 1e-8);
        // equations บอก dimension = 2 แต่ y0/y length = 1 -> คาดว่า sanityChecks() จะ throw
        // หมายเหตุ: ไม่แน่ใจ exception type ที่แน่นอน (ไม่มีซอร์สของ sanityChecks ให้มา)
        // จึงตรวจสอบเพียงว่ามี Exception ใด ๆ ถูก throw ออกมา
        ConstantSlopeEquations eq = new ConstantSlopeEquations(2, 1.0);
        double[] y0 = { 1.0 };
        double[] y = new double[1];

        boolean thrown = false;
        try {
            integ.integrate(eq, 0.0, y0, 1.0, y);
        } catch (Exception e) {
            thrown = true;
        }
        assertTrue("ควรมี Exception ถูก throw เมื่อ dimension ของ y0 ไม่ตรงกับ equations",
                   thrown);
    }

    // ===================== boundary: ค่า null สำหรับ equations =====================

    @Test
    public void testIntegrateNullEquationsThrows() {
        RK2Integrator integ = new RK2Integrator(true, 1e-6, 1.0, 1e-8, 1e-8);
        double[] y0 = { 1.0 };
        double[] y = new double[1];

        boolean thrown = false;
        try {
            // คาดว่าจะเกิด NullPointerException หรือ Exception อื่นจาก sanityChecks/
            // setEquations เนื่องจากไม่มีการตรวจสอบ null ที่เห็นได้ในซอร์สของ integrate()
            integ.integrate(null, 0.0, y0, 1.0, y);
        } catch (Exception e) {
            thrown = true;
        }
        assertTrue("การส่ง equations เป็น null ควรทำให้เกิด Exception", thrown);
    }
}
```

## ตารางสรุป Branch/Condition ที่ครอบคลุม

| Test method | Branch / Condition ที่ครอบคลุม |
|---|---|
| `testGetOrderNormal` | `getOrder()` คืนค่าปกติ (ใช้คำนวณ `exp` ใน constructor) |
| `testGetOrderZeroBoundary` | boundary: `getOrder()==0` → `exp = -1/0 = -Infinity` |
| `testDefaultControlParameters` | ค่า default ของ `safety/minReduction/maxGrowth` ที่ set ใน constructor |
| `testSetSafety` | setter/getter `safety`, boundary ค่าติดลบ (ไม่มี validation) |
| `testSetMinReduction` | setter/getter `minReduction`, boundary ค่า > 1 |
| `testSetMaxGrowth` | setter/getter `maxGrowth`, boundary 0.0 |
| `testIntegrateForward_FsalTrue_ScalarTolerance` | `forward=true`, branch `firstTime||!fsal` เมื่อ `fsal=true`, scalar tolerance (`vecAbsoluteTolerance==null`), accept-step branch (`error<=1.0`), loop สิ้นสุดปกติ |
| `testIntegrateForward_FsalFalse_ScalarTolerance` | เหมือนด้านบนแต่ `fsal=false` → recompute stage-0 ทุกครั้ง |
| `testIntegrateBackward` | `forward=false` (t<t0), ตรวจการคำนวณ `nextIsLast` ทิศทางย้อน |
| `testIntegrateVectorTolerance` | branch `vecAbsoluteTolerance != null` ในการคำนวณ `scale[]` |
| `testIntegrateRejectThenAccept` | branch `else` (error>1.0 → reject, `filterStep`), วนซ้ำ inner `for(loop)` หลายครั้ง |
| `testIntegrateSameArrayReference` | branch `if (y != y0)` เป็น **false** (ข้าม arraycopy) |
| `testIntegrateDifferentArrayReference` | branch `if (y != y0)` เป็น **true** (ทำ arraycopy) |
| `testIntegrateWithOrderZeroBoundary` | boundary/fault-detection: `exp=-Infinity` ส่งผลต่อ `Math.pow(error, exp)` ใน step-size control, ป้องกัน infinite loop ด้วย timeout |
| `testIntegrateDimensionMismatchThrowsException` | branch ของ `sanityChecks(...)` เมื่อ dimension ไม่ตรง (ไม่แน่ใจ exception type แน่ชัด — คอมเมนต์กำกับ) |
| `testIntegrateNullEquationsThrows` | ค่า null ของ `equations` (ไม่มีการตรวจสอบ null ที่เห็นได้ในซอร์ส — คอมเมนต์กำกับ) |

**หมายเหตุ branch ที่ไม่ได้ครอบคลุม (ตามข้อกำหนดที่ 4 ห้ามเดา):**
- branch `requiresDenseOutput() || !eventsHandlersManager.isEmpty()` ฝั่ง **true** (ต้องใช้ `RungeKuttaStepInterpolator` concrete + StepHandler API ที่ไม่มีซอร์สให้)
- branch ภายใน `manager.evaluateStep(...)` ที่ return true (event ชนกับ step) และ branch `Math.abs(dt) <= Math.ulp(...)`
- branch `manager.reset(stepStart, y) && !lastStep` ที่ทำให้มีการ recompute derivative ใหม่