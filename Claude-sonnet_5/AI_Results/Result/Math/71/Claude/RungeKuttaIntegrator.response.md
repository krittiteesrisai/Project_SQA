## การวิเคราะห์ Branch ที่สำคัญในคลาส `RungeKuttaIntegrator.integrate()`

1. `y != y0` → copy array หรือไม่
2. `requiresDenseOutput() || !eventsHandlersManager.isEmpty()` → เลือก `RungeKuttaStepInterpolator` หรือ `DummyStepInterpolator`
3. `forward = t > t0` → true/false
4. loop `while(!lastStep)` → หลาย iteration
5. loop `for (boolean loop = true; loop;)` → inner retry loop
6. `if (manager.evaluateStep(interpolator))` → true/false
7. `Math.abs(dt) <= Math.ulp(stepStart)` → true/false (สำคัญ เพราะเป็นจุดที่เกี่ยวกับบั๊ก Math-71)
8. `manager.reset(stepStart, y) && !lastStep` → true/false
9. loop `for (StepHandler handler : stepHandlers)` → ว่าง/ไม่ว่าง/หลายตัว
10. stages loop (`k`, `l`) ขึ้นกับจำนวน stage ของ Butcher array (Euler=1 stage, RK4=4 stages)

> **หมายเหตุสำคัญ:** โค้ดต้นฉบับที่ให้มาไม่มี source ของ `AbstractIntegrator`, `CombinedEventsManager`, `EventHandler`, `sanityChecks()` ฯลฯ ผมจึงอ้างอิง public API ที่ทราบจากไลบรารี commons-math ณ เวอร์ชันนี้ (จำเป็นต่อการ compile อยู่แล้วเพราะเป็น dependency ของคลาสเป้าหมาย) แต่จะ**ไม่เดา behavior ภายใน** ของ method เหล่านั้น — จุดใดที่ไม่แน่ใจ exact behavior จะเขียนคอมเมนต์กำกับไว้ในโค้ด

```java
package org.apache.commons.math.ode.nonstiff;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.math.ode.DerivativeException;
import org.apache.commons.math.ode.FirstOrderDifferentialEquations;
import org.apache.commons.math.ode.IntegratorException;
import org.apache.commons.math.ode.events.EventHandler;
import org.apache.commons.math.ode.sampling.DummyStepInterpolator;
import org.apache.commons.math.ode.sampling.StepHandler;
import org.apache.commons.math.ode.sampling.StepInterpolator;

import org.junit.Before;
import org.junit.Test;

/**
 * Unit tests for {@link RungeKuttaIntegrator} (ทดสอบผ่าน concrete subclass
 * เนื่องจาก RungeKuttaIntegrator เป็น abstract class).
 *
 * หมายเหตุ: EventHandler interface, AbstractIntegrator.sanityChecks(),
 * CombinedEventsManager ฯลฯ ไม่ได้อยู่ใน source ที่ให้มา
 * ค่าคงที่/พฤติกรรมของ method เหล่านี้อ้างอิงจาก public API ปกติของ commons-math
 * ในช่วงเวลาที่สอดคล้องกับบั๊ก Math-71 เท่านั้น จุดที่ไม่แน่ใจจะมีคอมเมนต์กำกับไว้
 */
public class RungeKuttaIntegratorTest {

    private static final double EPS = 1e-9;

    /** สมการ dy/dt = -y (exponential decay), analytic: y(t) = y0 * exp(-(t-t0)) */
    private static class DecayEquation implements FirstOrderDifferentialEquations {
        private final int dim;
        DecayEquation(int dim) { this.dim = dim; }
        public int getDimension() { return dim; }
        public void computeDerivatives(double t, double[] y, double[] yDot)
                throws DerivativeException {
            for (int i = 0; i < dim; i++) {
                yDot[i] = -y[i];
            }
        }
    }

    /** สมการที่มี dimension ไม่ตรงกับ y0/y สำหรับทดสอบ sanity check */
    private static class FixedDimensionEquation implements FirstOrderDifferentialEquations {
        private final int dim;
        FixedDimensionEquation(int dim) { this.dim = dim; }
        public int getDimension() { return dim; }
        public void computeDerivatives(double t, double[] y, double[] yDot) {
            // ไม่ถูกเรียกจริงถ้า sanity check ดักไว้ก่อน
            for (int i = 0; i < yDot.length && i < y.length; i++) {
                yDot[i] = 0.0;
            }
        }
    }

    /** StepHandler สำหรับตรวจสอบว่า interpolator ที่ได้รับคือชนิดใด และถูกเรียกจริงหรือไม่ */
    private static class RecordingStepHandler implements StepHandler {
        private final boolean denseRequired;
        boolean resetCalled = false;
        int handleStepCount = 0;
        boolean lastWasFinal = false;
        List<Class<?>> interpolatorTypes = new ArrayList<Class<?>>();

        RecordingStepHandler(boolean denseRequired) {
            this.denseRequired = denseRequired;
        }

        public boolean requiresDenseOutput() {
            return denseRequired;
        }

        public void reset() {
            resetCalled = true;
        }

        public void handleStep(StepInterpolator interpolator, boolean isLast)
                throws DerivativeException {
            handleStepCount++;
            lastWasFinal = isLast;
            interpolatorTypes.add(interpolator.getClass());
        }
    }

    /** EventHandler ที่ไม่มี zero-crossing เลย (g เป็นค่าบวกคงที่) */
    private static class NeverTriggerEventHandler implements EventHandler {
        public double g(double t, double[] y) { return 1.0; }
        public int eventOccurred(double t, double[] y) { return CONTINUE; }
        public void resetState(double t, double[] y) { /* no-op */ }
    }

    /** EventHandler ที่ตัดผ่านค่า threshold กึ่งกลางช่วง และให้ไปต่อ (CONTINUE) */
    private static class CrossingContinueEventHandler implements EventHandler {
        private final double threshold;
        boolean triggered = false;
        CrossingContinueEventHandler(double threshold) { this.threshold = threshold; }
        public double g(double t, double[] y) { return y[0] - threshold; }
        public int eventOccurred(double t, double[] y) {
            triggered = true;
            return CONTINUE;
        }
        public void resetState(double t, double[] y) { /* no-op */ }
    }

    /** EventHandler ที่ตัดผ่านค่า threshold แล้วสั่งหยุด (STOP) ก่อนถึง t ปลายทาง */
    private static class CrossingStopEventHandler implements EventHandler {
        private final double threshold;
        CrossingStopEventHandler(double threshold) { this.threshold = threshold; }
        public double g(double t, double[] y) { return y[0] - threshold; }
        public int eventOccurred(double t, double[] y) {
            return STOP;
        }
        public void resetState(double t, double[] y) { /* no-op */ }
    }

    // ------------------------------------------------------------------
    // 1) Forward integration ด้วยอาร์เรย์ y และ y0 คนละตัว (ครอบคลุม y != y0 = true)
    //    และครอบคลุม main loop หลาย iteration + end-time checker (manager.evaluateStep
    //    true ในสเต็ปสุดท้าย, false ในสเต็ปกลาง ๆ)
    // ------------------------------------------------------------------
    @Test
    public void testIntegrateForward_SeparateArraysAndAccuracy() throws Exception {
        EulerIntegrator integrator = new EulerIntegrator(0.001);
        FirstOrderDifferentialEquations eq = new DecayEquation(1);
        double[] y0 = {1.0};
        double[] y = new double[1];

        double tEnd = integrator.integrate(eq, 0.0, y0, 1.0, y);

        assertEquals(1.0, tEnd, EPS);
        // Euler มีความแม่นยำต่ำ จึงใช้ tolerance ผ่อนปรน
        assertEquals(Math.exp(-1.0), y[0], 0.01);
        // y0 ต้องไม่ถูกแก้ไข เพราะ y0 != y
        assertEquals(1.0, y0[0], EPS);
    }

    // ------------------------------------------------------------------
    // 2) y0 และ y เป็นอาร์เรย์เดียวกัน (ครอบคลุม y != y0 = false, ไม่มี arraycopy)
    // ------------------------------------------------------------------
    @Test
    public void testIntegrateSameArrayReference() throws Exception {
        EulerIntegrator integrator = new EulerIntegrator(0.01);
        FirstOrderDifferentialEquations eq = new DecayEquation(1);
        double[] y = {1.0};

        double tEnd = integrator.integrate(eq, 0.0, y, 1.0, y);

        assertEquals(1.0, tEnd, EPS);
        assertEquals(Math.exp(-1.0), y[0], 0.05);
    }

    // ------------------------------------------------------------------
    // 3) Backward integration (t < t0) ครอบคลุม forward = false
    // ------------------------------------------------------------------
    @Test
    public void testIntegrateBackward() throws Exception {
        EulerIntegrator integrator = new EulerIntegrator(0.01);
        FirstOrderDifferentialEquations eq = new DecayEquation(1);
        double[] y0 = {1.0};
        double[] y = new double[1];

        double tEnd = integrator.integrate(eq, 1.0, y0, 0.0, y);

        assertEquals(0.0, tEnd, EPS);
        // ตรวจเพียงว่าค่าอยู่ในช่วงสมเหตุสมผล (ไม่ assert ความถูกต้องทางฟิสิกส์แบบเข้มเพราะไม่ใช่โฟกัสของ test นี้)
        assertFalse(Double.isNaN(y[0]));
    }

    // ------------------------------------------------------------------
    // 4) step ที่ส่งเข้า constructor เป็นค่าลบ ต้องถูกแปลงเป็น Math.abs(step)
    //    (ทดสอบ fault ในบรรทัด this.step = Math.abs(step))
    // ------------------------------------------------------------------
    @Test
    public void testNegativeStepNormalizedToAbsoluteValue() throws Exception {
        EulerIntegrator posStep = new EulerIntegrator(0.1);
        EulerIntegrator negStep = new EulerIntegrator(-0.1);
        FirstOrderDifferentialEquations eq = new DecayEquation(1);

        double[] yPos = new double[1];
        double[] yNeg = new double[1];

        posStep.integrate(eq, 0.0, new double[]{1.0}, 1.0, yPos);
        negStep.integrate(eq, 0.0, new double[]{1.0}, 1.0, yNeg);

        // ผลลัพธ์ต้องเหมือนกัน เพราะ step ควรถูกแปลงเป็นค่าสัมบูรณ์ภายใน
        assertEquals(yPos[0], yNeg[0], EPS);
    }

    // ------------------------------------------------------------------
    // 5) Boundary: dimension = 0 (y0 เป็น array ว่าง) → inner for-loop (j) ไม่วิ่งเลย
    // ------------------------------------------------------------------
    @Test
    public void testIntegrateEmptyStateVector() throws Exception {
        EulerIntegrator integrator = new EulerIntegrator(0.1);
        FirstOrderDifferentialEquations eq = new DecayEquation(0);
        double[] y0 = new double[0];
        double[] y = new double[0];

        double tEnd = integrator.integrate(eq, 0.0, y0, 1.0, y);

        assertEquals(1.0, tEnd, EPS);
        assertEquals(0, y.length);
    }

    // ------------------------------------------------------------------
    // 6) StepHandler ที่ requiresDenseOutput() = true และไม่มี event handler
    //    → เลือก RungeKuttaStepInterpolator (ไม่ใช่ DummyStepInterpolator)
    // ------------------------------------------------------------------
    @Test
    public void testStepHandlerRequiringDenseOutput_UsesRungeKuttaInterpolator() throws Exception {
        EulerIntegrator integrator = new EulerIntegrator(0.2);
        RecordingStepHandler handler = new RecordingStepHandler(true);
        integrator.addStepHandler(handler);

        FirstOrderDifferentialEquations eq = new DecayEquation(1);
        double[] y0 = {1.0};
        double[] y = new double[1];

        integrator.integrate(eq, 0.0, y0, 1.0, y);

        assertTrue(handler.resetCalled);
        assertTrue(handler.handleStepCount > 0);
        assertTrue(handler.lastWasFinal);
        for (Class<?> c : handler.interpolatorTypes) {
            assertFalse("ไม่ควรใช้ DummyStepInterpolator เมื่อ requiresDenseOutput()=true",
                    DummyStepInterpolator.class.isAssignableFrom(c));
        }
    }

    // ------------------------------------------------------------------
    // 7) StepHandler ที่ requiresDenseOutput() = false และไม่มี event handler
    //    → เลือก DummyStepInterpolator
    // ------------------------------------------------------------------
    @Test
    public void testStepHandlerNotRequiringDenseOutput_NoEvents_UsesDummyInterpolator()
            throws Exception {
        EulerIntegrator integrator = new EulerIntegrator(0.2);
        RecordingStepHandler handler = new RecordingStepHandler(false);
        integrator.addStepHandler(handler);

        FirstOrderDifferentialEquations eq = new DecayEquation(1);
        double[] y0 = {1.0};
        double[] y = new double[1];

        integrator.integrate(eq, 0.0, y0, 1.0, y);

        assertTrue(handler.handleStepCount > 0);
        for (Class<?> c : handler.interpolatorTypes) {
            assertTrue("ควรใช้ DummyStepInterpolator เมื่อไม่ต้องใช้ dense output และไม่มี event handler",
                    DummyStepInterpolator.class.isAssignableFrom(c));
        }
    }

    // ------------------------------------------------------------------
    // 8) EventHandler ที่ไม่มี zero-crossing เลยตลอดการอินทิเกรต
    //    → ครอบคลุม branch `else { loop = false; }` อย่างชัดเจนในทุกสเต็ปกลาง ๆ
    //    (end-time checker ภายในยังคงทำให้ lastStep กลายเป็น true ที่ตอนจบ)
    // ------------------------------------------------------------------
    @Test
    public void testEventHandler_NoCrossing_IntegratesNormally() throws Exception {
        EulerIntegrator integrator = new EulerIntegrator(0.1);
        // สมมติ signature นี้ตาม public API ทั่วไปของ commons-math รุ่นนี้
        integrator.addEventHandler(new NeverTriggerEventHandler(), 1.0, 1e-10, 1000);

        FirstOrderDifferentialEquations eq = new DecayEquation(1);
        double[] y0 = {1.0};
        double[] y = new double[1];

        double tEnd = integrator.integrate(eq, 0.0, y0, 1.0, y);

        assertEquals(1.0, tEnd, EPS);
    }

    // ------------------------------------------------------------------
    // 9) EventHandler ที่มี zero-crossing กลางช่วงและสั่ง CONTINUE
    //    → ครอบคลุม branch `if (manager.evaluateStep(...))` = true
    //      และ branch การลด stepSize ให้ตรงกับ event time (else ของเงื่อนไข ulp)
    //      รวมถึง eventsHandlersManager.isEmpty() = false (บังคับ dense interpolator)
    // ------------------------------------------------------------------
    @Test
    public void testEventHandler_CrossingWithContinue_TriggersAndFinishes() throws Exception {
        EulerIntegrator integrator = new EulerIntegrator(0.2);
        // threshold อยู่ระหว่าง y(0)=1.0 และ y(1)=exp(-1)~0.3679
        CrossingContinueEventHandler eventHandler = new CrossingContinueEventHandler(0.6);
        integrator.addEventHandler(eventHandler, 1.0, 1e-12, 1000);

        FirstOrderDifferentialEquations eq = new DecayEquation(1);
        double[] y0 = {1.0};
        double[] y = new double[1];

        double tEnd = integrator.integrate(eq, 0.0, y0, 1.0, y);

        assertEquals(1.0, tEnd, EPS);
        assertTrue("event ควรถูกเรียกเนื่องจากมี zero-crossing อยู่ในช่วง", eventHandler.triggered);
    }

    // ------------------------------------------------------------------
    // 10) EventHandler ที่สั่ง STOP เมื่อเจอ crossing
    //     → ครอบคลุม manager.stop() = true ก่อนถึง t ปลายทาง (lastStep เร็วกว่ากำหนด)
    // ------------------------------------------------------------------
    @Test
    public void testEventHandler_CrossingWithStop_EndsBeforeFinalTime() throws Exception {
        EulerIntegrator integrator = new EulerIntegrator(0.05);
        CrossingStopEventHandler eventHandler = new CrossingStopEventHandler(0.6);
        integrator.addEventHandler(eventHandler, 1.0, 1e-12, 1000);

        FirstOrderDifferentialEquations eq = new DecayEquation(1);
        double[] y0 = {1.0};
        double[] y = new double[1];

        double tEnd = integrator.integrate(eq, 0.0, y0, 1.0, y);

        assertTrue("เมื่อสั่ง STOP เวลาสิ้นสุดที่ได้ต้องน้อยกว่า t ปลายทางที่ขอ", tEnd < 1.0);
        assertTrue(tEnd > 0.0);
    }

    // ------------------------------------------------------------------
    // 11) Multi-stage integrator (ClassicalRungeKuttaIntegrator, stages=4)
    //     → ครอบคลุม inner loop k=1..stages-1 และ l=1..k-1 (sum สะสมหลายพจน์)
    // ------------------------------------------------------------------
    @Test
    public void testMultiStageIntegrator_ClassicalRungeKutta() throws Exception {
        ClassicalRungeKuttaIntegrator integrator = new ClassicalRungeKuttaIntegrator(0.1);
        FirstOrderDifferentialEquations eq = new DecayEquation(1);
        double[] y0 = {1.0};
        double[] y = new double[1];

        double tEnd = integrator.integrate(eq, 0.0, y0, 1.0, y);

        assertEquals(1.0, tEnd, EPS);
        // RK4 แม่นยำสูง ใช้ tolerance แคบกว่า Euler มาก
        assertEquals(Math.exp(-1.0), y[0], 1e-5);
    }

    // ------------------------------------------------------------------
    // 12) หลาย StepHandler ในคอลเลกชันเดียวกัน → ครอบคลุม loop ที่มีมากกว่า 1 รอบ
    // ------------------------------------------------------------------
    @Test
    public void testMultipleStepHandlers_AllInvoked() throws Exception {
        EulerIntegrator integrator = new EulerIntegrator(0.25);
        RecordingStepHandler h1 = new RecordingStepHandler(false);
        RecordingStepHandler h2 = new RecordingStepHandler(false);
        integrator.addStepHandler(h1);
        integrator.addStepHandler(h2);

        FirstOrderDifferentialEquations eq = new DecayEquation(1);
        double[] y0 = {1.0};
        double[] y = new double[1];

        integrator.integrate(eq, 0.0, y0, 1.0, y);

        assertTrue(h1.handleStepCount > 0);
        assertTrue(h2.handleStepCount > 0);
        assertEquals(h1.handleStepCount, h2.handleStepCount);
    }

    // ------------------------------------------------------------------
    // 13) Dimension mismatch ระหว่าง y0 กับ equations.getDimension()
    //     คาดว่า sanityChecks() (ซึ่งไม่มี source ให้มา) จะโยน exception
    //     *** ไม่แน่ใจชนิด exception ที่แน่ชัด จึงดักแบบกว้างและคอมเมนต์กำกับ ***
    // ------------------------------------------------------------------
    @Test
    public void testDimensionMismatch_ThrowsException() {
        EulerIntegrator integrator = new EulerIntegrator(0.1);
        FirstOrderDifferentialEquations eq = new FixedDimensionEquation(2);
        double[] y0 = {1.0}; // length ไม่ตรงกับ dimension=2
        double[] y = new double[1];

        try {
            integrator.integrate(eq, 0.0, y0, 1.0, y);
            fail("คาดหวังว่า sanityChecks() จะโยน exception เมื่อ dimension ไม่ตรงกัน");
        } catch (DerivativeException e) {
            // ยอมรับได้ตาม signature ของ integrate()
            assertNotNull(e);
        } catch (IntegratorException e) {
            // ยอมรับได้ตาม signature ของ integrate()
            assertNotNull(e);
        }
    }

    // ------------------------------------------------------------------
    // 14) Boundary: step size ใหญ่กว่าช่วงอินทิเกรตทั้งหมด (1 สเต็ปจบ)
    //     → ครอบคลุม main while-loop ที่มี iteration เดียว, lastStep=true ทันที
    // ------------------------------------------------------------------
    @Test
    public void testIntegrateSingleStepLargerThanInterval() throws Exception {
        EulerIntegrator integrator = new EulerIntegrator(10.0); // step >> (1.0 - 0.0)
        FirstOrderDifferentialEquations eq = new DecayEquation(1);
        double[] y0 = {1.0};
        double[] y = new double[1];

        double tEnd = integrator.integrate(eq, 0.0, y0, 1.0, y);

        assertEquals(1.0, tEnd, EPS);
    }
}
```

## สรุปการครอบคลุม Branch/Condition ของแต่ละเทส

| เมธอดเทส | Branch/Condition ที่ครอบคลุม |
|---|---|
| `testIntegrateForward_SeparateArraysAndAccuracy` | `y != y0` = true (arraycopy), `forward` = true, main loop หลาย iteration, `evaluateStep` false→true สลับกัน (end-time checker), ความถูกต้องของผลลัพธ์ |
| `testIntegrateSameArrayReference` | `y != y0` = false (ข้าม arraycopy) |
| `testIntegrateBackward` | `forward = t > t0` = false, `stepSize = -step` |
| `testNegativeStepNormalizedToAbsoluteValue` | ตรวจ fault ใน `step = Math.abs(step)` ของ constructor |
| `testIntegrateEmptyStateVector` | boundary: `y0.length == 0` → inner `for(j...)` ไม่วิ่งเลย |
| `testStepHandlerRequiringDenseOutput_UsesRungeKuttaInterpolator` | `requiresDenseOutput() == true` → เลือก `RungeKuttaStepInterpolator`, stepHandlers loop ไม่ว่าง |
| `testStepHandlerNotRequiringDenseOutput_NoEvents_UsesDummyInterpolator` | `requiresDenseOutput()==false && eventsHandlersManager.isEmpty()==true` → เลือก `DummyStepInterpolator` |
| `testEventHandler_NoCrossing_IntegratesNormally` | `evaluateStep(...)==false` → `else { loop=false; }` ในทุกสเต็ปกลาง |
| `testEventHandler_CrossingWithContinue_TriggersAndFinishes` | `evaluateStep(...)==true`, branch ลด `stepSize=dt` (else ของ ulp check), `eventsHandlersManager.isEmpty()==false` |
| `testEventHandler_CrossingWithStop_EndsBeforeFinalTime` | `manager.stop()==true` ก่อนถึง t ปลายทาง → `lastStep` เร็วกว่ากำหนด |
| `testMultiStageIntegrator_ClassicalRungeKutta` | loop `k=1..stages-1` และ `l=1..k-1` (multi-stage Butcher array) |
| `testMultipleStepHandlers_AllInvoked` | `for (StepHandler handler : stepHandlers)` วนมากกว่า 1 รอบ |
| `testDimensionMismatch_ThrowsException` | เส้นทาง exception จาก `sanityChecks()` (ชนิด exception ไม่ยืนยันแน่ชัด — คอมเมนต์กำกับ) |
| `testIntegrateSingleStepLargerThanInterval` | main `while(!lastStep)` มี iteration เดียว, `lastStep=true` ทันทีในสเต็ปแรก |

**หมายเหตุปิดท้าย:** branch ที่เกี่ยวกับ `Math.abs(dt) <= Math.ulp(stepStart)` (บั๊ก Math-71 จริง ๆ) ถูกกระตุ้นโดยอ้อมผ่านเทสที่ 1, 9, และ 10 แต่เนื่องจากพฤติกรรมการ converge ของ root-finder ภายใน `CombinedEventsManager` ไม่ได้อยู่ใน source ที่ให้มา จึงไม่สามารถยืนยัน 100% ว่า branch ที่เป็น `true` ของเงื่อนไขนี้ถูก exercise แน่นอนในทุกรัน — ควรตรวจสอบด้วย coverage tool (เช่น JaCoCo) อีกครั้งเพื่อยืนยัน