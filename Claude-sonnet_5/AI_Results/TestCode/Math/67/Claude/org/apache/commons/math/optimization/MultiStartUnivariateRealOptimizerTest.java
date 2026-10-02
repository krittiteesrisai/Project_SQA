package org.apache.commons.math.optimization;

import static org.junit.Assert.*;

import org.apache.commons.math.ConvergenceException;
import org.apache.commons.math.FunctionEvaluationException;
import org.apache.commons.math.analysis.UnivariateRealFunction;
import org.apache.commons.math.random.RandomGenerator;
import org.junit.Test;

public class MultiStartUnivariateRealOptimizerTest {

    /** ฟังก์ชัน dummy เนื่องจาก underlying optimizer stub ไม่เรียกใช้จริง */
    private static final UnivariateRealFunction DUMMY_FUNCTION =
            new UnivariateRealFunction() {
                public double value(double x) throws FunctionEvaluationException {
                    return x;
                }
            };

    // =========================================================
    // Stub RandomGenerator: คืนค่า nextDouble() ตามลำดับที่กำหนด
    // (เมธอดอื่น ๆ ไม่ถูกใช้โดยคลาสเป้าหมาย จึงทำเป็น no-op/ค่า default)
    // =========================================================
    private static class StubRandomGenerator implements RandomGenerator {
        private final double[] values;
        private int idx = 0;

        StubRandomGenerator(double... values) { this.values = values; }

        public void setSeed(int seed) {}
        public void setSeed(int[] seed) {}
        public void setSeed(long seed) {}
        public int nextInt() { return 0; }
        public int nextInt(int n) { return 0; }
        public long nextLong() { return 0L; }
        public boolean nextBoolean() { return false; }
        public float nextFloat() { return 0f; }
        public double nextGaussian() { return 0; }

        public double nextDouble() {
            double v = values[idx % values.length];
            idx++;
            return v;
        }
    }

    // =========================================================
    // Stub/Scripted UnivariateRealOptimizer: กำหนดผลลัพธ์/ข้อยกเว้น
    // ของการเรียก optimize() แต่ละครั้งไว้ล่วงหน้าเป็นลำดับ (script)
    // =========================================================
    private static class ScriptedOptimizer implements UnivariateRealOptimizer {
        final double[] resultsToReturn;
        final double[] functionValuesToReturn;
        final boolean[] throwConvergence;
        final boolean[] throwFunctionEval;
        final int[] iterationCounts;
        final int[] evaluationCounts;

        int callCount = 0;
        double lastFunctionValue;
        int lastIterationCount;
        int lastEvaluationCount;

        double lastMin;
        double lastMax;
        GoalType lastGoalType;

        int lastSetMaxIterations;
        int lastSetMaxEvaluations;

        double absoluteAccuracy = 1e-6;
        double relativeAccuracy = 1e-9;
        int maximalIterationCount = 100;
        double resultValue = 0;

        boolean resetAbsCalled = false;
        boolean resetMaxIterCalled = false;
        boolean resetRelCalled = false;

        ScriptedOptimizer(double[] results, double[] fValues, boolean[] throwConv,
                           boolean[] throwFE, int[] iterCounts, int[] evalCounts) {
            this.resultsToReturn = results;
            this.functionValuesToReturn = fValues;
            this.throwConvergence = throwConv;
            this.throwFunctionEval = throwFE;
            this.iterationCounts = iterCounts;
            this.evaluationCounts = evalCounts;
        }

        public double optimize(UnivariateRealFunction f, GoalType goalType, double min, double max)
                throws ConvergenceException, FunctionEvaluationException {
            int idx = callCount++;
            lastGoalType = goalType;
            lastMin = min;
            lastMax = max;
            lastIterationCount = iterationCounts[idx];
            lastEvaluationCount = evaluationCounts[idx];
            if (throwConvergence[idx]) {
                // สมมติฐาน: ConvergenceException มี no-arg constructor (ดูหมายเหตุด้านบน)
                throw new ConvergenceException();
            }
            if (throwFunctionEval[idx]) {
                // สมมติฐาน: FunctionEvaluationException(double) เป็น ctor ที่มีอยู่จริง
                throw new FunctionEvaluationException(min);
            }
            lastFunctionValue = functionValuesToReturn[idx];
            resultValue = resultsToReturn[idx];
            return resultValue;
        }

        public double optimize(UnivariateRealFunction f, GoalType goalType,
                                double min, double max, double startValue)
                throws ConvergenceException, FunctionEvaluationException {
            return optimize(f, goalType, min, max);
        }

        public double getFunctionValue() { return lastFunctionValue; }
        public double getResult() { return resultValue; }
        public double getAbsoluteAccuracy() { return absoluteAccuracy; }
        public int getIterationCount() { return lastIterationCount; }
        public int getMaximalIterationCount() { return maximalIterationCount; }
        public int getMaxEvaluations() { return lastSetMaxEvaluations; }
        public int getEvaluations() { return lastEvaluationCount; }
        public double getRelativeAccuracy() { return relativeAccuracy; }
        public void resetAbsoluteAccuracy() { resetAbsCalled = true; }
        public void resetMaximalIterationCount() { resetMaxIterCalled = true; }
        public void resetRelativeAccuracy() { resetRelCalled = true; }
        public void setAbsoluteAccuracy(double accuracy) { this.absoluteAccuracy = accuracy; }
        public void setMaximalIterationCount(int count) {
            this.lastSetMaxIterations = count;
            this.maximalIterationCount = count;
        }
        public void setMaxEvaluations(int maxEvaluations) {
            this.lastSetMaxEvaluations = maxEvaluations;
        }
        public void setRelativeAccuracy(double accuracy) { this.relativeAccuracy = accuracy; }
    }

    private static ScriptedOptimizer singleSuccess(double result, double fValue) {
        return new ScriptedOptimizer(
                new double[]{result}, new double[]{fValue},
                new boolean[]{false}, new boolean[]{false},
                new int[]{1}, new int[]{1});
    }

    // =========================================================
    // 1. Constructor
    // =========================================================
    @Test
    public void testConstructorSetsDefaultMaxIterationsAndEvaluations() {
        ScriptedOptimizer stub = singleSuccess(1.0, 1.0);
        MultiStartUnivariateRealOptimizer multi =
                new MultiStartUnivariateRealOptimizer(stub, 1, new StubRandomGenerator(0.5));
        assertEquals(Integer.MAX_VALUE, multi.getMaximalIterationCount());
        assertEquals(Integer.MAX_VALUE, multi.getMaxEvaluations());
    }

    // =========================================================
    // 2-3. getOptima()/getOptimaValues() ก่อนเรียก optimize()
    // =========================================================
    @Test
    public void testGetOptimaThrowsIllegalStateBeforeOptimize() {
        ScriptedOptimizer stub = singleSuccess(1.0, 1.0);
        MultiStartUnivariateRealOptimizer multi =
                new MultiStartUnivariateRealOptimizer(stub, 1, new StubRandomGenerator(0.5));
        try {
            multi.getOptima();
            fail("ควรโยน IllegalStateException");
        } catch (IllegalStateException ex) {
            // expected
        }
    }

    @Test
    public void testGetOptimaValuesThrowsIllegalStateBeforeOptimize() {
        ScriptedOptimizer stub = singleSuccess(1.0, 1.0);
        MultiStartUnivariateRealOptimizer multi =
                new MultiStartUnivariateRealOptimizer(stub, 1, new StubRandomGenerator(0.5));
        try {
            multi.getOptimaValues();
            fail("ควรโยน IllegalStateException");
        } catch (IllegalStateException ex) {
            // expected
        }
    }

    // =========================================================
    // 4-5. Getter ที่ delegate ไปยัง underlying optimizer (สด ไม่ cache)
    // =========================================================
    @Test
    public void testSimpleGettersDelegateToUnderlyingOptimizer() {
        ScriptedOptimizer stub = singleSuccess(1.0, 42.0);
        MultiStartUnivariateRealOptimizer multi =
                new MultiStartUnivariateRealOptimizer(stub, 1, new StubRandomGenerator(0.5));

        stub.absoluteAccuracy = 0.01;
        stub.relativeAccuracy = 0.02;

        assertEquals(0.01, multi.getAbsoluteAccuracy(), 0.0);
        assertEquals(0.02, multi.getRelativeAccuracy(), 0.0);
    }

    @Test
    public void testFunctionValueAndResultDelegateLiveNotCached() throws Exception {
        ScriptedOptimizer stub = singleSuccess(5.0, 7.0);
        MultiStartUnivariateRealOptimizer multi =
                new MultiStartUnivariateRealOptimizer(stub, 1, new StubRandomGenerator(0.5));
        multi.optimize(DUMMY_FUNCTION, GoalType.MINIMIZE, 0.0, 10.0);

        assertEquals(7.0, multi.getFunctionValue(), 0.0);
        assertEquals(5.0, multi.getResult(), 0.0);

        // เปลี่ยนค่า stub ตรง ๆ โดยไม่เรียก optimize() อีก -> ต้องสะท้อนทันที (ไม่ cache)
        stub.lastFunctionValue = 999.0;
        stub.resultValue = 888.0;
        assertEquals(999.0, multi.getFunctionValue(), 0.0);
        assertEquals(888.0, multi.getResult(), 0.0);
    }

    // =========================================================
    // 6-7. reset*/set* ที่ delegate ไปยัง underlying optimizer
    // =========================================================
    @Test
    public void testResetMethodsDelegateToUnderlyingOptimizer() {
        ScriptedOptimizer stub = singleSuccess(1.0, 1.0);
        MultiStartUnivariateRealOptimizer multi =
                new MultiStartUnivariateRealOptimizer(stub, 1, new StubRandomGenerator(0.5));

        multi.resetAbsoluteAccuracy();
        multi.resetMaximalIterationCount();
        multi.resetRelativeAccuracy();

        assertTrue(stub.resetAbsCalled);
        assertTrue(stub.resetMaxIterCalled);
        assertTrue(stub.resetRelCalled);
    }

    @Test
    public void testSetAccuracyMethodsDelegateToUnderlyingOptimizer() {
        ScriptedOptimizer stub = singleSuccess(1.0, 1.0);
        MultiStartUnivariateRealOptimizer multi =
                new MultiStartUnivariateRealOptimizer(stub, 1, new StubRandomGenerator(0.5));

        multi.setAbsoluteAccuracy(0.123);
        multi.setRelativeAccuracy(0.456);

        assertEquals(0.123, stub.absoluteAccuracy, 0.0);
        assertEquals(0.456, stub.relativeAccuracy, 0.0);
    }

    // =========================================================
    // 8. setMaximalIterationCount/setMaxEvaluations เก็บไว้ที่ wrapper เอง
    //    (ไม่ delegate ทันที — delegate เฉพาะตอนเรียก optimize())
    // =========================================================
    @Test
    public void testSetMaximalIterationCountAndMaxEvaluationsAreLocalOnly() {
        ScriptedOptimizer stub = singleSuccess(1.0, 1.0);
        MultiStartUnivariateRealOptimizer multi =
                new MultiStartUnivariateRealOptimizer(stub, 1, new StubRandomGenerator(0.5));

        multi.setMaximalIterationCount(777);
        multi.setMaxEvaluations(888);

        assertEquals(777, multi.getMaximalIterationCount());
        assertEquals(888, multi.getMaxEvaluations());
        // underlying optimizer ยังไม่ถูกแก้ไข เพราะยังไม่เรียก optimize()
        assertEquals(0, stub.lastSetMaxIterations);
        assertEquals(0, stub.lastSetMaxEvaluations);
    }

    // =========================================================
    // 9. starts == 1 : ใช้ min/max ตรง ๆ ไม่สุ่ม (i == 0 branch)
    // =========================================================
    @Test
    public void testOptimizeSingleStartUsesExactMinMaxBounds() throws Exception {
        ScriptedOptimizer stub = new ScriptedOptimizer(
                new double[]{5.0}, new double[]{2.0},
                new boolean[]{false}, new boolean[]{false},
                new int[]{3}, new int[]{4});
        MultiStartUnivariateRealOptimizer multi =
                new MultiStartUnivariateRealOptimizer(stub, 1, new StubRandomGenerator(0.5));

        double result = multi.optimize(DUMMY_FUNCTION, GoalType.MINIMIZE, 1.0, 10.0);

        assertEquals(5.0, result, 0.0);
        assertEquals(1.0, stub.lastMin, 0.0);
        assertEquals(10.0, stub.lastMax, 0.0);
        assertEquals(3, multi.getIterationCount());
        assertEquals(4, multi.getEvaluations());

        double[] optima = multi.getOptima();
        double[] values = multi.getOptimaValues();
        assertEquals(1, optima.length);
        assertEquals(5.0, optima[0], 0.0);
        assertEquals(2.0, values[0], 0.0);
    }

    // =========================================================
    // 10. starts > 1 : สำหรับ i != 0 ขอบเขตต้องสุ่มจาก generator.nextDouble()
    // =========================================================
    @Test
    public void testOptimizeMultipleStartsRandomBoundsUsedForSubsequentStarts() throws Exception {
        ScriptedOptimizer stub = new ScriptedOptimizer(
                new double[]{1.0, 2.0}, new double[]{1.0, 2.0},
                new boolean[]{false, false}, new boolean[]{false, false},
                new int[]{1, 1}, new int[]{1, 1});
        // start i=0 ไม่เรียก nextDouble(); start i=1 เรียก nextDouble() 2 ครั้ง (bound1, bound2)
        StubRandomGenerator generator = new StubRandomGenerator(0.2, 0.8);
        MultiStartUnivariateRealOptimizer multi =
                new MultiStartUnivariateRealOptimizer(stub, 2, generator);

        multi.optimize(DUMMY_FUNCTION, GoalType.MINIMIZE, 0.0, 10.0);

        // start สุดท้าย (i=1): bound1 = 0 + 0.2*10 = 2.0, bound2 = 0 + 0.8*10 = 8.0
        // min(bound1,bound2)=2.0, max(bound1,bound2)=8.0
        assertEquals(2.0, stub.lastMin, 1e-9);
        assertEquals(8.0, stub.lastMax, 1e-9);
    }

    // =========================================================
    // 11-12. Insertion sort: MINIMIZE (ascending) / MAXIMIZE (descending)
    //        - ครอบคลุม XOR branch และ while loop ของ insertion sort
    //        - เฉพาะกรณี "ไม่มี NaN" เนื่องจากกรณีมี NaN จะชน AIOOBE (ดูข้อ 13-15)
    // =========================================================
    @Test
    public void testOptimizeSortsAscendingForMinimize() throws Exception {
        ScriptedOptimizer stub = new ScriptedOptimizer(
                new double[]{5.0, 1.0, 3.0}, new double[]{5.0, 1.0, 3.0},
                new boolean[]{false, false, false}, new boolean[]{false, false, false},
                new int[]{1, 1, 1}, new int[]{1, 1, 1});
        MultiStartUnivariateRealOptimizer multi =
                new MultiStartUnivariateRealOptimizer(stub, 3,
                        new StubRandomGenerator(0.1, 0.2, 0.3, 0.4));

        double result = multi.optimize(DUMMY_FUNCTION, GoalType.MINIMIZE, 0.0, 10.0);

        assertEquals(1.0, result, 0.0);
        assertArrayEquals(new double[]{1.0, 3.0, 5.0}, multi.getOptima(), 0.0);
        assertArrayEquals(new double[]{1.0, 3.0, 5.0}, multi.getOptimaValues(), 0.0);
    }

    @Test
    public void testOptimizeSortsDescendingForMaximize() throws Exception {
        ScriptedOptimizer stub = new ScriptedOptimizer(
                new double[]{1.0, 5.0, 3.0}, new double[]{1.0, 5.0, 3.0},
                new boolean[]{false, false, false}, new boolean[]{false, false, false},
                new int[]{1, 1, 1}, new int[]{1, 1, 1});
        MultiStartUnivariateRealOptimizer multi =
                new MultiStartUnivariateRealOptimizer(stub, 3,
                        new StubRandomGenerator(0.1, 0.2, 0.3, 0.4));

        double result = multi.optimize(DUMMY_FUNCTION, GoalType.MAXIMIZE, 0.0, 10.0);

        assertEquals(5.0, result, 0.0);
        assertArrayEquals(new double[]{5.0, 3.0, 1.0}, multi.getOptima(), 0.0);
    }

    // =========================================================
    // 13-15. **FAULT DETECTION**: มีผลลัพธ์ NaN ตั้งแต่ 1 ตัว
    //         -> โค้ดบั๊ก (Math-67b) จะโยน ArrayIndexOutOfBoundsException
    //            ก่อนไปถึง insertion sort / OptimizationException check เสมอ
    //         (ดูวิเคราะห์ด้านบน: optima[lastNaN+1] เกินขอบเขตเสมอ)
    // =========================================================
    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void testOptimizeWithConvergenceExceptionTriggersArrayIndexOutOfBoundsBug() throws Exception {
        ScriptedOptimizer stub = new ScriptedOptimizer(
                new double[]{3.0, Double.NaN, 1.0}, new double[]{3.0, Double.NaN, 1.0},
                new boolean[]{false, true, false}, new boolean[]{false, false, false},
                new int[]{1, 1, 1}, new int[]{1, 1, 1});
        MultiStartUnivariateRealOptimizer multi =
                new MultiStartUnivariateRealOptimizer(stub, 3,
                        new StubRandomGenerator(0.1, 0.2, 0.3, 0.4));

        multi.optimize(DUMMY_FUNCTION, GoalType.MINIMIZE, 0.0, 10.0);
    }

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void testOptimizeWithFunctionEvaluationExceptionTriggersArrayIndexOutOfBoundsBug() throws Exception {
        ScriptedOptimizer stub = new ScriptedOptimizer(
                new double[]{3.0, Double.NaN}, new double[]{3.0, Double.NaN},
                new boolean[]{false, false}, new boolean[]{false, true},
                new int[]{1, 1}, new int[]{1, 1});
        MultiStartUnivariateRealOptimizer multi =
                new MultiStartUnivariateRealOptimizer(stub, 2,
                        new StubRandomGenerator(0.5, 0.5));

        multi.optimize(DUMMY_FUNCTION, GoalType.MINIMIZE, 0.0, 10.0);
    }

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void testOptimizeAllStartsNonConvergentTriggersArrayIndexOutOfBoundsNotOptimizationException()
            throws Exception {
        // ตาม javadoc ควรโยน OptimizationException เมื่อทุก start fail
        // แต่จากบั๊กในโค้ด จะโยน ArrayIndexOutOfBoundsException ก่อนเสมอ
        // -> เส้นทางโยน OptimizationException เป็น dead code ใน revision นี้
        ScriptedOptimizer stub = new ScriptedOptimizer(
                new double[]{Double.NaN, Double.NaN}, new double[]{Double.NaN, Double.NaN},
                new boolean[]{true, true}, new boolean[]{false, false},
                new int[]{1, 1}, new int[]{1, 1});
        MultiStartUnivariateRealOptimizer multi =
                new MultiStartUnivariateRealOptimizer(stub, 2,
                        new StubRandomGenerator(0.5, 0.5));

        multi.optimize(DUMMY_FUNCTION, GoalType.MINIMIZE, 0.0, 10.0);
    }

    // =========================================================
    // 16-17. Boundary: starts == 0 / starts < 0
    //         loop ไม่ execute เลย -> optima[0] บน empty array -> AIOOBE
    // =========================================================
    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void testOptimizeWithZeroStartsThrowsArrayIndexOutOfBounds() throws Exception {
        ScriptedOptimizer stub = new ScriptedOptimizer(
                new double[]{}, new double[]{}, new boolean[]{}, new boolean[]{},
                new int[]{}, new int[]{});
        MultiStartUnivariateRealOptimizer multi =
                new MultiStartUnivariateRealOptimizer(stub, 0, new StubRandomGenerator(0.5));

        multi.optimize(DUMMY_FUNCTION, GoalType.MINIMIZE, 0.0, 10.0);
    }

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void testOptimizeWithNegativeStartsThrowsArrayIndexOutOfBounds() throws Exception {
        ScriptedOptimizer stub = new ScriptedOptimizer(
                new double[]{}, new double[]{}, new boolean[]{}, new boolean[]{},
                new int[]{}, new int[]{});
        MultiStartUnivariateRealOptimizer multi =
                new MultiStartUnivariateRealOptimizer(stub, -1, new StubRandomGenerator(0.5));

        multi.optimize(DUMMY_FUNCTION, GoalType.MINIMIZE, 0.0, 10.0);
    }

    // =========================================================
    // 18. totalIterations/totalEvaluations ต้องสะสมข้าม start (loop)
    // =========================================================
    @Test
    public void testOptimizeAccumulatesIterationsAndEvaluationsAcrossStarts() throws Exception {
        ScriptedOptimizer stub = new ScriptedOptimizer(
                new double[]{1.0, 2.0}, new double[]{1.0, 2.0},
                new boolean[]{false, false}, new boolean[]{false, false},
                new int[]{3, 4}, new int[]{5, 6});
        MultiStartUnivariateRealOptimizer multi =
                new MultiStartUnivariateRealOptimizer(stub, 2,
                        new StubRandomGenerator(0.5, 0.5));

        multi.optimize(DUMMY_FUNCTION, GoalType.MINIMIZE, 0.0, 10.0);

        assertEquals(3 + 4, multi.getIterationCount());
        assertEquals(5 + 6, multi.getEvaluations());
    }

    // =========================================================
    // 19. overload 5-arg optimize() ต้อง delegate ไปยัง 4-arg เสมอ
    // =========================================================
    @Test
    public void testFiveArgOptimizeDelegatesToFourArgOptimize() throws Exception {
        ScriptedOptimizer stub = singleSuccess(7.0, 7.0);
        MultiStartUnivariateRealOptimizer multi =
                new MultiStartUnivariateRealOptimizer(stub, 1, new StubRandomGenerator(0.5));

        double result = multi.optimize(DUMMY_FUNCTION, GoalType.MINIMIZE, 1.0, 5.0, 3.0);

        assertEquals(7.0, result, 0.0);
    }

    // =========================================================
    // 20-21. getOptima()/getOptimaValues() ต้องคืน defensive copy (.clone())
    // =========================================================
    @Test
    public void testGetOptimaReturnsDefensiveCopy() throws Exception {
        ScriptedOptimizer stub = singleSuccess(1.0, 1.0);
        MultiStartUnivariateRealOptimizer multi =
                new MultiStartUnivariateRealOptimizer(stub, 1, new StubRandomGenerator(0.5));
        multi.optimize(DUMMY_FUNCTION, GoalType.MINIMIZE, 0.0, 10.0);

        double[] optima1 = multi.getOptima();
        optima1[0] = -999.0;
        double[] optima2 = multi.getOptima();
        assertEquals(1.0, optima2[0], 0.0);
    }

    @Test
    public void testGetOptimaValuesReturnsDefensiveCopy() throws Exception {
        ScriptedOptimizer stub = singleSuccess(1.0, 9.0);
        MultiStartUnivariateRealOptimizer multi =
                new MultiStartUnivariateRealOptimizer(stub, 1, new StubRandomGenerator(0.5));
        multi.optimize(DUMMY_FUNCTION, GoalType.MINIMIZE, 0.0, 10.0);

        double[] values1 = multi.getOptimaValues();
        values1[0] = -999.0;
        double[] values2 = multi.getOptimaValues();
        assertEquals(9.0, values2[0], 0.0);
    }
}
