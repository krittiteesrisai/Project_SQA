# JUnit 4 Test Suite สำหรับ `MultiDirectional`

## ⚠️ หมายเหตุสำคัญก่อนเริ่ม

ซอร์สโค้ดที่ให้มาเป็นเพียงคลาส `MultiDirectional` ซึ่ง extends `DirectSearchOptimizer` — **ไม่มีซอร์สของคลาสแม่** (`DirectSearchOptimizer`, `RealPointValuePair`, `GoalType`, `MultivariateRealFunction`, `OptimizationException` ฯลฯ) มาให้ด้วย

เนื่องจาก `iterateSimplex` เป็น `protected` และ `evaluateNewSimplex` เป็น `private` จึงไม่สามารถเรียกตรงจาก test ภายนอกได้ ต้องทดสอบผ่าน public entry point คือ `optimize(...)` ที่สืบทอดมาจาก `DirectSearchOptimizer` (ตาม public API ที่เป็นที่รู้จักของ Apache Commons Math ช่วงเวลาเดียวกับ Defects4J Math-84 ได้แก่ `setStartConfiguration(double[])`, `setMaxIterations(int)`, `setMaxEvaluations(int)`, `getIterations()`, `getEvaluations()`)

**จุดที่ไม่แน่ใจ 100%** จะคอมเมนต์กำกับไว้ในโค้ดทุกจุด — หากพฤติกรรมจริงต่างจากที่สมมติ โปรดปรับตาม signature จริงใน classpath

```java
package org.apache.commons.math.optimization.direct;

import static org.junit.Assert.*;

import org.apache.commons.math.FunctionEvaluationException;
import org.apache.commons.math.analysis.MultivariateRealFunction;
import org.apache.commons.math.optimization.GoalType;
import org.apache.commons.math.optimization.OptimizationException;
import org.apache.commons.math.optimization.RealPointValuePair;
import org.apache.commons.math.optimization.direct.MultiDirectional;

import org.junit.Test;

/**
 * Unit test สำหรับ {@link MultiDirectional}
 *
 * สมมติฐานด้าน API ของคลาสแม่ (DirectSearchOptimizer) ที่ใช้ในเทสนี้:
 *  - setStartConfiguration(double[] steps)
 *  - setMaxIterations(int) / setMaxEvaluations(int)
 *  - getIterations() / getEvaluations()
 *  - optimize(MultivariateRealFunction, GoalType, double[])
 *      throws FunctionEvaluationException, OptimizationException, IllegalArgumentException
 *  - incrementIterationsCounter() throws OptimizationException เมื่อเกิน maxIterations
 *  - evaluateSimplex(...) throws OptimizationException เมื่อเกิน maxEvaluations
 *
 * หากพฤติกรรมจริงแตกต่างจากนี้ กรุณาปรับแก้ตามซอร์สจริงที่อยู่ใน classpath
 */
public class MultiDirectionalTest {

    // ---------- Helper test functions ----------

    /**
     * f(x) = sum(x_i^2) : convex, smooth, มี global minimum ที่ origin = 0
     * ใช้ทดสอบ branch "reflected < best" = true (reflect มักช่วยลดค่า function)
     */
    private static class SphereFunction implements MultivariateRealFunction {
        public double value(double[] point) throws FunctionEvaluationException {
            double sum = 0.0;
            for (double v : point) {
                sum += v * v;
            }
            return sum;
        }
    }

    /** f(x) = -sum(x_i^2) : concave, มี global maximum ที่ origin = 0 (ใช้กับ GoalType.MAXIMIZE) */
    private static class NegativeSphereFunction implements MultivariateRealFunction {
        public double value(double[] point) throws FunctionEvaluationException {
            double sum = 0.0;
            for (double v : point) {
                sum += v * v;
            }
            return -sum;
        }
    }

    /**
     * f(x) = sum(|x_i|) : non-smooth, origin = best เสมอ
     * เมื่อ xSmallest = 0: reflect(x) = -x และ contract(x) = -gamma*x
     * ทำให้ f(reflect) = f(original) (ไม่ดีกว่า best) และ f(contract) = gamma*f(original) > 0 = f(best)
     * ดังนั้น "reflected < best" และ "contracted < best" จะเป็น false เสมอ
     * -> ใช้ cover branch "loop ต่อโดยไม่ return" (ไม่มี shrink step ในซอร์ส -> อาจวนไม่สิ้นสุด
     *    จนกว่า maxIterations/maxEvaluations บังคับให้ throw exception)
     */
    private static class AbsSumFunction implements MultivariateRealFunction {
        public double value(double[] point) throws FunctionEvaluationException {
            double sum = 0.0;
            for (double v : point) {
                sum += Math.abs(v);
            }
            return sum;
        }
    }

    private static boolean isFiniteNumber(double d) {
        return !Double.isNaN(d) && !Double.isInfinite(d);
    }

    // ---------- Constructor tests ----------

    @Test
    public void testDefaultConstructorDoesNotThrow() {
        MultiDirectional md = new MultiDirectional();
        assertNotNull(md);
    }

    @Test
    public void testParameterizedConstructorDoesNotThrow() {
        MultiDirectional md = new MultiDirectional(3.0, 0.3);
        assertNotNull(md);
    }

    @Test
    public void testParameterizedConstructorBoundaryValues() {
        // boundary: khi = 1.0 (ไม่มีการขยายจริง), gamma = 0.0 (ไม่มีการหดตัวจริง)
        MultiDirectional md = new MultiDirectional(1.0, 0.0);
        assertNotNull(md);
    }

    // ---------- Normal convergence: reflect accepted branch ----------

    @Test(timeout = 5000)
    public void testOptimizeSphereFunctionConvergesWithDefaultCoefficients()
            throws FunctionEvaluationException, OptimizationException {
        MultiDirectional optimizer = new MultiDirectional();
        optimizer.setMaxIterations(200);
        optimizer.setMaxEvaluations(10000);
        optimizer.setStartConfiguration(new double[] { 1.0, 1.0 });

        RealPointValuePair result = optimizer.optimize(new SphereFunction(),
                GoalType.MINIMIZE, new double[] { 5.0, 5.0 });

        assertNotNull(result);
        // minimum ของ sphere function คือ 0 ที่ origin
        assertEquals(0.0, result.getValue(), 1.0e-2);
        assertTrue(optimizer.getIterations() > 0);
        assertTrue(optimizer.getEvaluations() > 0);
    }

    @Test(timeout = 5000)
    public void testOptimizeSphereFunctionWithLargeExpansionCoefficient()
            throws FunctionEvaluationException, OptimizationException {
        // khi ขนาดใหญ่ -> เพิ่มโอกาสให้ expanded point แย่กว่า reflected
        // (พยายาม cover sub-branch "keep expanded" ของเงื่อนไข
        //  comparator.compare(reflected, expanded) <= 0 เป็น false)
        MultiDirectional optimizer = new MultiDirectional(10.0, 0.5);
        optimizer.setMaxIterations(200);
        optimizer.setMaxEvaluations(10000);
        optimizer.setStartConfiguration(new double[] { 1.0, 1.0 });

        RealPointValuePair result = optimizer.optimize(new SphereFunction(),
                GoalType.MINIMIZE, new double[] { 5.0, 5.0 });

        assertNotNull(result);
        assertTrue(isFiniteNumber(result.getValue()));
    }

    @Test(timeout = 5000)
    public void testOptimizeSphereFunctionWithSmallExpansionCoefficient()
            throws FunctionEvaluationException, OptimizationException {
        // khi ใกล้ 1.0 -> เพิ่มโอกาสให้ reflected <= expanded
        // (พยายาม cover sub-branch "accept reflected")
        MultiDirectional optimizer = new MultiDirectional(1.01, 0.5);
        optimizer.setMaxIterations(200);
        optimizer.setMaxEvaluations(10000);
        optimizer.setStartConfiguration(new double[] { 1.0, 1.0 });

        RealPointValuePair result = optimizer.optimize(new SphereFunction(),
                GoalType.MINIMIZE, new double[] { 5.0, 5.0 });

        assertNotNull(result);
        assertTrue(isFiniteNumber(result.getValue()));
    }

    @Test(timeout = 5000)
    public void testOptimizeMaximizeNegativeSphereFunction()
            throws FunctionEvaluationException, OptimizationException {
        // ทดสอบ GoalType.MAXIMIZE เพื่อให้แน่ใจว่า comparator ที่ถูก invert
        // ยังทำงานถูกต้องกับทุกเงื่อนไข comparator.compare(...) ใน iterateSimplex
        MultiDirectional optimizer = new MultiDirectional();
        optimizer.setMaxIterations(200);
        optimizer.setMaxEvaluations(10000);
        optimizer.setStartConfiguration(new double[] { 1.0, 1.0 });

        RealPointValuePair result = optimizer.optimize(new NegativeSphereFunction(),
                GoalType.MAXIMIZE, new double[] { 5.0, 5.0 });

        assertNotNull(result);
        assertEquals(0.0, result.getValue(), 1.0e-2);
    }

    // ---------- Boundary: dimension size ----------

    @Test(timeout = 5000)
    public void testOptimizeSingleDimensionBoundary()
            throws FunctionEvaluationException, OptimizationException {
        // boundary n=1: ตรวจสอบ loop "for (i=1; i<=n; ++i)" ใน evaluateNewSimplex
        // ทำงานถูกต้องเมื่อมีมิติเดียว (loop รันแค่ 1 รอบ)
        MultiDirectional optimizer = new MultiDirectional();
        optimizer.setMaxIterations(200);
        optimizer.setMaxEvaluations(10000);
        optimizer.setStartConfiguration(new double[] { 1.0 });

        RealPointValuePair result = optimizer.optimize(new SphereFunction(),
                GoalType.MINIMIZE, new double[] { 5.0 });

        assertNotNull(result);
        assertEquals(0.0, result.getValue(), 1.0e-2);
    }

    @Test(timeout = 5000)
    public void testOptimizeHigherDimension()
            throws FunctionEvaluationException, OptimizationException {
        // n=4: ตรวจสอบ loop ทำงานถูกต้องในมิติที่สูงขึ้น
        MultiDirectional optimizer = new MultiDirectional();
        optimizer.setMaxIterations(500);
        optimizer.setMaxEvaluations(20000);
        optimizer.setStartConfiguration(new double[] { 1.0, 1.0, 1.0, 1.0 });

        RealPointValuePair result = optimizer.optimize(new SphereFunction(),
                GoalType.MINIMIZE, new double[] { 3.0, -2.0, 4.0, -1.0 });

        assertNotNull(result);
        assertEquals(0.0, result.getValue(), 1.0e-1);
    }

    // ---------- Loop-continue branch (contracted ไม่ดีกว่า best) + boundary ของ maxIterations ----------

    @Test(timeout = 5000, expected = OptimizationException.class)
    public void testOptimizeNonSmoothFunctionThrowsWhenIterationsExceeded()
            throws FunctionEvaluationException, OptimizationException {
        // AbsSumFunction: reflect และ contracted ไม่ดีกว่า best เสมอ
        // -> branch "contracted < best" = false -> ไม่มี return -> loop วนต่อ (ไม่มี shrink step ในซอร์ส)
        // คาดหวังว่าในที่สุด incrementIterationsCounter() จะ throw OptimizationException
        // เมื่อ iterations เกิน maxIterations ที่กำหนดไว้ต่ำ
        MultiDirectional optimizer = new MultiDirectional();
        optimizer.setMaxIterations(3);
        optimizer.setMaxEvaluations(1000000);
        optimizer.setStartConfiguration(new double[] { 1.0 });

        optimizer.optimize(new AbsSumFunction(), GoalType.MINIMIZE, new double[] { 0.0 });
    }

    @Test(timeout = 5000, expected = OptimizationException.class)
    public void testOptimizeThrowsWhenMaxIterationsIsZeroBoundary()
            throws FunctionEvaluationException, OptimizationException {
        // boundary: maxIterations = 0 -> incrementIterationsCounter() ควร throw
        // ทันทีในรอบแรกของ while(true) ก่อนคำนวณ reflect/expand/contract ใดๆเลย
        MultiDirectional optimizer = new MultiDirectional();
        optimizer.setMaxIterations(0);
        optimizer.setMaxEvaluations(100000);
        optimizer.setStartConfiguration(new double[] { 1.0, 1.0 });

        optimizer.optimize(new SphereFunction(), GoalType.MINIMIZE, new double[] { 5.0, 5.0 });
    }

    @Test(timeout = 5000, expected = OptimizationException.class)
    public void testOptimizeThrowsWhenMaxEvaluationsExceeded()
            throws FunctionEvaluationException, OptimizationException {
        // boundary: maxEvaluations ต่ำมาก -> evaluateSimplex ภายใน evaluateNewSimplex
        // ควร throw OptimizationException เมื่อจำนวนการ evaluate function เกินกำหนด
        MultiDirectional optimizer = new MultiDirectional();
        optimizer.setMaxIterations(100000);
        optimizer.setMaxEvaluations(2);
        optimizer.setStartConfiguration(new double[] { 1.0, 1.0 });

        optimizer.optimize(new SphereFunction(), GoalType.MINIMIZE, new double[] { 5.0, 5.0 });
    }

    // ---------- Malformed / null input ----------

    @Test(timeout = 5000)
    public void testOptimizeWithMismatchedStartPointAndStepsThrows() {
        // รูปแบบผิด: startConfiguration (2 มิติ) ไม่ตรงกับ startPoint (3 มิติ)
        // ไม่แน่ใจ exact exception type เนื่องจากไม่มีซอร์สของ parent class
        // จึงคาดหวังเพียงว่าต้องมี exception ชนิดใดชนิดหนึ่งถูก throw (ไม่ควร silently succeed)
        MultiDirectional optimizer = new MultiDirectional();
        optimizer.setMaxIterations(200);
        optimizer.setMaxEvaluations(10000);
        optimizer.setStartConfiguration(new double[] { 1.0, 1.0 });

        boolean thrown = false;
        try {
            optimizer.optimize(new SphereFunction(), GoalType.MINIMIZE,
                    new double[] { 5.0, 5.0, 5.0 });
        } catch (Exception e) {
            // คาดหวัง exception บางชนิด (IllegalArgumentException เป็นไปได้มากที่สุด
            // ตาม pattern ทั่วไปของ Commons Math แต่ไม่ยืนยัน 100%)
            thrown = true;
        }
        assertTrue("ควรเกิด exception เมื่อ dimension ไม่สอดคล้องกัน", thrown);
    }

    @Test(timeout = 5000)
    public void testOptimizeWithNullStartPointThrows() {
        // null input: ไม่แน่ใจ exact exception type (NullPointerException หรือ
        // IllegalArgumentException) เนื่องจากไม่มีซอร์สของ DirectSearchOptimizer
        // จึงตรวจสอบเพียงว่ามี exception ถูก throw จริง ไม่ silently return ค่า
        MultiDirectional optimizer = new MultiDirectional();
        optimizer.setMaxIterations(200);
        optimizer.setMaxEvaluations(10000);
        optimizer.setStartConfiguration(new double[] { 1.0, 1.0 });

        boolean thrown = false;
        try {
            optimizer.optimize(new SphereFunction(), GoalType.MINIMIZE, null);
        } catch (Exception e) {
            thrown = true;
        }
        assertTrue("ควรเกิด exception เมื่อ startPoint เป็น null", thrown);
    }

    @Test(timeout = 5000)
    public void testOptimizeWithNullFunctionThrows() {
        // null function: คาดหวังว่าจะเกิด exception เมื่อพยายาม evaluate function ที่เป็น null
        MultiDirectional optimizer = new MultiDirectional();
        optimizer.setMaxIterations(200);
        optimizer.setMaxEvaluations(10000);
        optimizer.setStartConfiguration(new double[] { 1.0, 1.0 });

        boolean thrown = false;
        try {
            optimizer.optimize(null, GoalType.MINIMIZE, new double[] { 5.0, 5.0 });
        } catch (Exception e) {
            thrown = true;
        }
        assertTrue("ควรเกิด exception เมื่อ function เป็น null", thrown);
    }

    @Test(timeout = 5000)
    public void testOptimizeWithEmptyStartPointArray() {
        // boundary: startPoint เป็น array ว่าง (n=0)
        // evaluateNewSimplex: xSmallest.length = 0 -> loop for(i=1;i<=0;i++) ไม่รันเลย
        // ไม่แน่ใจว่าพฤติกรรมของ parent class จะ accept กรณีนี้หรือไม่
        MultiDirectional optimizer = new MultiDirectional();
        optimizer.setMaxIterations(50);
        optimizer.setMaxEvaluations(1000);
        optimizer.setStartConfiguration(new double[] { });

        try {
            RealPointValuePair result = optimizer.optimize(new SphereFunction(),
                    GoalType.MINIMIZE, new double[] { });
            // ถ้าไม่ throw exception ก็ยอมรับได้ตราบใดที่ไม่ crash โดยไม่มี assertion ผิดพลาด
            assertNotNull(result);
        } catch (Exception e) {
            // ยอมรับได้ทั้งสองทาง เนื่องจากไม่มีสเปกชัดเจนสำหรับ edge case นี้
            assertTrue(true);
        }
    }
}
```

## สรุป Branch/Condition Coverage

| เมธอดเทส | Branch / Condition ที่ครอบคลุม |
|---|---|
| `testDefaultConstructorDoesNotThrow` | Constructor `MultiDirectional()` → khi=2.0, gamma=0.5 |
| `testParameterizedConstructorDoesNotThrow` | Constructor `MultiDirectional(khi, gamma)` ค่าทั่วไป |
| `testParameterizedConstructorBoundaryValues` | Constructor ค่าขอบเขต khi=1.0, gamma=0.0 |
| `testOptimizeSphereFunctionConvergesWithDefaultCoefficients` | `while(true)` loop, `comparator.compare(reflected,best)<0` = **true**, convergence path ปกติ |
| `testOptimizeSphereFunctionWithLargeExpansionCoefficient` | sub-branch expand: `compare(reflected,expanded)<=0` = **false** (keep expanded) — พยายาม trigger |
| `testOptimizeSphereFunctionWithSmallExpansionCoefficient` | sub-branch expand: `compare(reflected,expanded)<=0` = **true** (accept reflected) — พยายาม trigger |
| `testOptimizeMaximizeNegativeSphereFunction` | comparator แบบ inverted (GoalType.MAXIMIZE) กับทุก branch comparison |
| `testOptimizeSingleDimensionBoundary` | boundary: `for (i=1;i<=n;++i)` ใน `evaluateNewSimplex` เมื่อ n=1 |
| `testOptimizeHigherDimension` | loop `for (i=1;i<=n;++i)` เมื่อ n=4 |
| `testOptimizeNonSmoothFunctionThrowsWhenIterationsExceeded` | `compare(reflected,best)<0` = **false**, `compare(contracted,best)<0` = **false** → loop ต่อ (ไม่มี return) จนเกิน maxIterations |
| `testOptimizeThrowsWhenMaxIterationsIsZeroBoundary` | boundary: `incrementIterationsCounter()` throw ทันทีในรอบแรกของ loop |
| `testOptimizeThrowsWhenMaxEvaluationsExceeded` | boundary: exception จาก `evaluateSimplex` เมื่อ evaluations เกิน |
| `testOptimizeWithMismatchedStartPointAndStepsThrows` | อินพุตผิดรูปแบบ: dimension ไม่สอดคล้องกัน |
| `testOptimizeWithNullStartPointThrows` | ค่า null: startPoint = null |
| `testOptimizeWithNullFunctionThrows` | ค่า null: function = null |
| `testOptimizeWithEmptyStartPointArray` | ค่าว่าง/ขอบเขต: n=0 |

**จุดที่ยังไม่สามารถยืนยัน branch coverage ได้ 100% ด้วยมือ** (ต้องรันจริงเพื่อตรวจสอบ): sub-branch ของ expand step (`accept reflected` vs `keep expanded`) และ branch `contracted < best = true` (accept contracted, return) ใน sphere function test — ได้พยายาม design พารามิเตอร์ (khi ต่างกัน) เพื่อเพิ่มโอกาส cover แต่ไม่สามารถยืนยันผลลัพธ์เชิงตัวเลขที่แน่นอนโดยไม่ execute code จริง