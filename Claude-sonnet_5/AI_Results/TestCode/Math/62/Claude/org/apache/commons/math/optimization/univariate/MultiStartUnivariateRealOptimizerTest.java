package org.apache.commons.math.optimization.univariate;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import org.apache.commons.math.FunctionEvaluationException;
import org.apache.commons.math.analysis.UnivariateRealFunction;
import org.apache.commons.math.exception.ConvergenceException;
import org.apache.commons.math.exception.MathIllegalStateException;
import org.apache.commons.math.exception.util.LocalizedFormats;
import org.apache.commons.math.optimization.ConvergenceChecker;
import org.apache.commons.math.optimization.GoalType;
import org.apache.commons.math.random.RandomGenerator;

public class MultiStartUnivariateRealOptimizerTest {

    // ---------- Stub: UnivariateRealFunction ----------
    private static class StubFunction implements UnivariateRealFunction {
        public double value(double x) throws FunctionEvaluationException {
            return x * x;
        }
    }

    // ---------- Stub: RandomGenerator ----------
    // เฉพาะ nextDouble() เท่านั้นที่ถูกใช้จริงในซอร์ส
    private static class StubRandomGenerator implements RandomGenerator {
        private final List<Double> queue = new ArrayList<Double>();
        private int idx = 0;

        void enqueue(double... values) {
            for (double v : values) {
                queue.add(v);
            }
        }

        public double nextDouble() {
            if (idx >= queue.size()) {
                throw new IllegalStateException("nextDouble() called more times than expected: " + idx);
            }
            return queue.get(idx++);
        }

        int callCount() {
            return idx;
        }

        // ---- methods ที่ไม่ได้ใช้โดยตรงในซอร์สทดสอบ: ทำ minimal stub ----
        public void setSeed(int seed) {}
        public void setSeed(int[] seed) {}
        public void setSeed(long seed) {}
        public void nextBytes(byte[] bytes) {}
        public int nextInt() { return 0; }
        public int nextInt(int n) { return 0; }
        public long nextLong() { return 0L; }
        public boolean nextBoolean() { return false; }
        public float nextFloat() { return 0f; }
        public double nextGaussian() { return 0; }
    }

    // ---------- Stub: BaseUnivariateRealOptimizer ----------
    private static class StubOptimizer implements BaseUnivariateRealOptimizer<UnivariateRealFunction> {
        private int maxEvaluations;
        private int lastEvaluations;
        private int callIndex = 0;
        private ConvergenceChecker<UnivariateRealPointValuePair> checker;

        private final List<Object> results = new ArrayList<Object>(); // pair หรือ Throwable
        private final List<Integer> evaluationsUsedPerCall = new ArrayList<Integer>();
        final List<double[]> recordedBounds = new ArrayList<double[]>();
        final List<Integer> maxEvalsSetHistory = new ArrayList<Integer>();

        void addSuccess(UnivariateRealPointValuePair pair, int evalsUsed) {
            results.add(pair);
            evaluationsUsedPerCall.add(evalsUsed);
        }

        void addFailure(Throwable t, int evalsUsed) {
            results.add(t);
            evaluationsUsedPerCall.add(evalsUsed);
        }

        public void setConvergenceChecker(ConvergenceChecker<UnivariateRealPointValuePair> checker) {
            this.checker = checker;
        }

        public ConvergenceChecker<UnivariateRealPointValuePair> getConvergenceChecker() {
            return checker;
        }

        public int getMaxEvaluations() {
            return maxEvaluations;
        }

        public int getEvaluations() {
            return lastEvaluations;
        }

        public void setMaxEvaluations(int maxEvaluations) {
            this.maxEvaluations = maxEvaluations;
            maxEvalsSetHistory.add(maxEvaluations);
        }

        public UnivariateRealPointValuePair optimize(UnivariateRealFunction f, GoalType goal,
                                                      double min, double max)
            throws FunctionEvaluationException {
            recordedBounds.add(new double[] { min, max });
            int i = callIndex++;
            lastEvaluations = evaluationsUsedPerCall.get(i);
            Object r = results.get(i);
            if (r instanceof FunctionEvaluationException) {
                throw (FunctionEvaluationException) r;
            } else if (r instanceof RuntimeException) {
                throw (RuntimeException) r;
            }
            return (UnivariateRealPointValuePair) r;
        }

        public UnivariateRealPointValuePair optimize(UnivariateRealFunction f, GoalType goal,
                                                      double min, double max, double startValue)
            throws FunctionEvaluationException {
            // ซอร์ส MultiStart ไม่เคยเรียก overload นี้ภายใน แต่เผื่อทดสอบ public contract
            return optimize(f, goal, min, max);
        }
    }

    // ---------- helper ----------
    private UnivariateRealPointValuePair pair(double point, double value) {
        // สมมติ constructor (point, value) ตาม convention ของ commons-math
        return new UnivariateRealPointValuePair(point, value);
    }

    // =========================================================
    // 1) single start: ไม่ควรเรียก generator เลย และ bound = (min,max) เดิม
    // =========================================================
    @Test
    public void optimize_singleStart_usesExactMinMax_andNeverCallsGenerator() throws Exception {
        StubOptimizer stub = new StubOptimizer();
        stub.addSuccess(pair(1.0, 10.0), 5);
        StubRandomGenerator rng = new StubRandomGenerator(); // ไม่ enqueue ค่าใดๆ

        MultiStartUnivariateRealOptimizer<UnivariateRealFunction> ms =
            new MultiStartUnivariateRealOptimizer<UnivariateRealFunction>(stub, 1, rng);

        UnivariateRealPointValuePair result = ms.optimize(new StubFunction(), GoalType.MINIMIZE, 0.0, 5.0);

        assertEquals(1.0, result.getPoint(), 1e-9);
        assertEquals(10.0, result.getValue(), 1e-9);
        assertEquals(0, rng.callCount()); // i==0 ไม่ต้องสุ่ม
        assertEquals(1, stub.recordedBounds.size());
        assertArrayEquals(new double[] { 0.0, 5.0 }, stub.recordedBounds.get(0), 1e-9);
    }

    // =========================================================
    // 2) multi-start, MINIMIZE: เรียง ascending ตาม value, ค่าน้อยสุดมาก่อน
    // =========================================================
    @Test
    public void optimize_multipleStarts_minimize_sortsAscending_bestFirst() throws Exception {
        StubOptimizer stub = new StubOptimizer();
        stub.addSuccess(pair(1.0, 50.0), 5); // i=0
        stub.addSuccess(pair(2.0, 10.0), 5); // i=1 (ดีที่สุด)
        stub.addSuccess(pair(3.0, 30.0), 5); // i=2

        StubRandomGenerator rng = new StubRandomGenerator();
        rng.enqueue(0.5, 0.5, 0.5, 0.5); // สำหรับ i=1 และ i=2

        MultiStartUnivariateRealOptimizer<UnivariateRealFunction> ms =
            new MultiStartUnivariateRealOptimizer<UnivariateRealFunction>(stub, 3, rng);

        UnivariateRealPointValuePair result = ms.optimize(new StubFunction(), GoalType.MINIMIZE, 0.0, 10.0);

        assertEquals(10.0, result.getValue(), 1e-9);
        UnivariateRealPointValuePair[] optima = ms.getOptima();
        assertEquals(3, optima.length);
        assertEquals(10.0, optima[0].getValue(), 1e-9);
        assertEquals(30.0, optima[1].getValue(), 1e-9);
        assertEquals(50.0, optima[2].getValue(), 1e-9);
    }

    // =========================================================
    // 3) multi-start, MAXIMIZE: เรียง descending ตาม value
    // =========================================================
    @Test
    public void optimize_multipleStarts_maximize_sortsDescending_bestFirst() throws Exception {
        StubOptimizer stub = new StubOptimizer();
        stub.addSuccess(pair(1.0, 50.0), 5);
        stub.addSuccess(pair(2.0, 10.0), 5);
        stub.addSuccess(pair(3.0, 90.0), 5); // ดีที่สุดสำหรับ MAXIMIZE

        StubRandomGenerator rng = new StubRandomGenerator();
        rng.enqueue(0.5, 0.5, 0.5, 0.5);

        MultiStartUnivariateRealOptimizer<UnivariateRealFunction> ms =
            new MultiStartUnivariateRealOptimizer<UnivariateRealFunction>(stub, 3, rng);

        UnivariateRealPointValuePair result = ms.optimize(new StubFunction(), GoalType.MAXIMIZE, 0.0, 10.0);

        assertEquals(90.0, result.getValue(), 1e-9);
        UnivariateRealPointValuePair[] optima = ms.getOptima();
        assertEquals(90.0, optima[0].getValue(), 1e-9);
        assertEquals(50.0, optima[1].getValue(), 1e-9);
        assertEquals(10.0, optima[2].getValue(), 1e-9);
    }

    // =========================================================
    // 4) ทุก start ล้มเหลว (FunctionEvaluationException) -> ConvergenceException
    // =========================================================
    @Test(expected = ConvergenceException.class)
    public void optimize_allStartsFail_functionEvaluationException_throwsConvergenceException() throws Exception {
        StubOptimizer stub = new StubOptimizer();
        // สมมติว่ามี constructor (double argument) อยู่จริงตามรูปแบบทั่วไปของ commons-math
        stub.addFailure(new FunctionEvaluationException(0.0), 1);
        stub.addFailure(new FunctionEvaluationException(0.0), 1);

        StubRandomGenerator rng = new StubRandomGenerator();
        rng.enqueue(0.5, 0.5);

        MultiStartUnivariateRealOptimizer<UnivariateRealFunction> ms =
            new MultiStartUnivariateRealOptimizer<UnivariateRealFunction>(stub, 2, rng);

        ms.optimize(new StubFunction(), GoalType.MINIMIZE, 0.0, 10.0);
    }

    // =========================================================
    // 5) ทุก start ล้มเหลวแบบ ConvergenceException จาก underlying optimizer
    // =========================================================
    @Test(expected = ConvergenceException.class)
    public void optimize_allStartsFail_convergenceException_throwsConvergenceException() throws Exception {
        StubOptimizer stub = new StubOptimizer();
        stub.addFailure(new ConvergenceException(LocalizedFormats.NO_CONVERGENCE_WITH_ANY_START_POINT, 1), 1);

        StubRandomGenerator rng = new StubRandomGenerator();

        MultiStartUnivariateRealOptimizer<UnivariateRealFunction> ms =
            new MultiStartUnivariateRealOptimizer<UnivariateRealFunction>(stub, 1, rng);

        ms.optimize(new StubFunction(), GoalType.MINIMIZE, 0.0, 10.0);
    }

    // =========================================================
    // 6) บาง start ล้มเหลว บาง start สำเร็จ -> null ถูกเรียงไปด้านหลัง
    // =========================================================
    @Test
    public void optimize_mixedFailuresAndSuccesses_nullsSortedLast() throws Exception {
        StubOptimizer stub = new StubOptimizer();
        stub.addSuccess(pair(1.0, 20.0), 3);                                   // i=0 success
        stub.addFailure(new FunctionEvaluationException(0.0), 2);              // i=1 fail
        stub.addSuccess(pair(3.0, 5.0), 4);                                    // i=2 success (ดีที่สุด)

        StubRandomGenerator rng = new StubRandomGenerator();
        rng.enqueue(0.1, 0.9, 0.2, 0.8);

        MultiStartUnivariateRealOptimizer<UnivariateRealFunction> ms =
            new MultiStartUnivariateRealOptimizer<UnivariateRealFunction>(stub, 3, rng);

        UnivariateRealPointValuePair result = ms.optimize(new StubFunction(), GoalType.MINIMIZE, 0.0, 10.0);

        assertEquals(5.0, result.getValue(), 1e-9);

        UnivariateRealPointValuePair[] optima = ms.getOptima();
        assertEquals(3, optima.length);
        assertNotNull(optima[0]);
        assertNotNull(optima[1]);
        assertNull(optima[2]); // null element ต้องอยู่ท้ายสุด
        assertEquals(5.0, optima[0].getValue(), 1e-9);
        assertEquals(20.0, optima[1].getValue(), 1e-9);
    }

    // =========================================================
    // 7) boundary: starts = 0
    // หมายเหตุ: โค้ดไม่ได้ป้องกันกรณีนี้ -> array length 0 -> optima[0] throw AIOOBE
    // ทดสอบนี้ "ดักจับ fault" ของการไม่ guard ค่า starts<=0 ตาม Javadoc ที่ระบุว่า
    // "multi-start is disabled if value is less than or equal to 1" แต่โค้ดจริงไม่ได้ทำเช่นนั้น
    // =========================================================
    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void optimize_startsZero_currentImplementationThrowsArrayIndexOutOfBounds() throws Exception {
        StubOptimizer stub = new StubOptimizer();
        StubRandomGenerator rng = new StubRandomGenerator();

        MultiStartUnivariateRealOptimizer<UnivariateRealFunction> ms =
            new MultiStartUnivariateRealOptimizer<UnivariateRealFunction>(stub, 0, rng);

        ms.optimize(new StubFunction(), GoalType.MINIMIZE, 0.0, 10.0);
    }

    // =========================================================
    // 8) boundary: starts ติดลบ -> NegativeArraySizeException ทันทีจาก new array[-1]
    // =========================================================
    @Test(expected = NegativeArraySizeException.class)
    public void optimize_negativeStarts_throwsNegativeArraySizeException() throws Exception {
        StubOptimizer stub = new StubOptimizer();
        StubRandomGenerator rng = new StubRandomGenerator();

        MultiStartUnivariateRealOptimizer<UnivariateRealFunction> ms =
            new MultiStartUnivariateRealOptimizer<UnivariateRealFunction>(stub, -1, rng);

        ms.optimize(new StubFunction(), GoalType.MINIMIZE, 0.0, 10.0);
    }

    // =========================================================
    // 9) getOptima() ก่อนเรียก optimize() -> MathIllegalStateException
    // =========================================================
    @Test(expected = MathIllegalStateException.class)
    public void getOptima_beforeOptimizeCalled_throwsMathIllegalStateException() {
        StubOptimizer stub = new StubOptimizer();
        StubRandomGenerator rng = new StubRandomGenerator();

        MultiStartUnivariateRealOptimizer<UnivariateRealFunction> ms =
            new MultiStartUnivariateRealOptimizer<UnivariateRealFunction>(stub, 3, rng);

        ms.getOptima(); // ยังไม่เคย optimize()
    }

    // =========================================================
    // 10) getOptima() คืนค่าเป็น clone ไม่ใช่ reference เดียวกัน
    // =========================================================
    @Test
    public void getOptima_afterOptimize_returnsClonedArrayEachTime() throws Exception {
        StubOptimizer stub = new StubOptimizer();
        stub.addSuccess(pair(1.0, 1.0), 1);
        StubRandomGenerator rng = new StubRandomGenerator();

        MultiStartUnivariateRealOptimizer<UnivariateRealFunction> ms =
            new MultiStartUnivariateRealOptimizer<UnivariateRealFunction>(stub, 1, rng);
        ms.optimize(new StubFunction(), GoalType.MINIMIZE, 0.0, 10.0);

        UnivariateRealPointValuePair[] a1 = ms.getOptima();
        UnivariateRealPointValuePair[] a2 = ms.getOptima();

        assertNotSame(a1, a2); // เป็น clone คนละ array
        assertEquals(a1.length, a2.length);
        assertSame(a1[0], a2[0]); // แต่สมาชิกภายในยังเป็น object เดียวกัน (shallow clone)
    }

    // =========================================================
    // 11) setMaxEvaluations / getMaxEvaluations ต้อง delegate ไปยัง underlying optimizer
    // =========================================================
    @Test
    public void setGetMaxEvaluations_delegatesToUnderlyingOptimizer() {
        StubOptimizer stub = new StubOptimizer();
        StubRandomGenerator rng = new StubRandomGenerator();

        MultiStartUnivariateRealOptimizer<UnivariateRealFunction> ms =
            new MultiStartUnivariateRealOptimizer<UnivariateRealFunction>(stub, 1, rng);

        ms.setMaxEvaluations(123);

        assertEquals(123, ms.getMaxEvaluations());
        assertEquals(123, stub.getMaxEvaluations());
    }

    // =========================================================
    // 12) getEvaluations() ต้องสะสมผลรวมจากทุก start
    //     และ setMaxEvaluations ของ underlying optimizer ต้องถูกลดตาม usedEvaluations ทุกรอบ
    // =========================================================
    @Test
    public void getEvaluations_accumulatesAcrossStarts_andDecrementsMaxEvaluationsEachIteration() throws Exception {
        StubOptimizer stub = new StubOptimizer();
        stub.addSuccess(pair(1.0, 1.0), 30);
        stub.addSuccess(pair(2.0, 2.0), 20);

        StubRandomGenerator rng = new StubRandomGenerator();
        rng.enqueue(0.5, 0.5);

        MultiStartUnivariateRealOptimizer<UnivariateRealFunction> ms =
            new MultiStartUnivariateRealOptimizer<UnivariateRealFunction>(stub, 2, rng);
        ms.setMaxEvaluations(100);

        ms.optimize(new StubFunction(), GoalType.MINIMIZE, 0.0, 10.0);

        assertEquals(50, ms.getEvaluations()); // 30+20
        assertEquals(50, stub.getMaxEvaluations()); // 100-30-20
        assertEquals(java.util.Arrays.asList(100, 70, 50), stub.maxEvalsSetHistory);
    }

    // =========================================================
    // 13) setConvergenceChecker / getConvergenceChecker ต้อง delegate
    // =========================================================
    @Test
    public void setGetConvergenceChecker_delegatesToUnderlyingOptimizer() {
        StubOptimizer stub = new StubOptimizer();
        StubRandomGenerator rng = new StubRandomGenerator();

        MultiStartUnivariateRealOptimizer<UnivariateRealFunction> ms =
            new MultiStartUnivariateRealOptimizer<UnivariateRealFunction>(stub, 1, rng);

        ConvergenceChecker<UnivariateRealPointValuePair> checker =
            new ConvergenceChecker<UnivariateRealPointValuePair>() {
                public boolean converged(int iteration, UnivariateRealPointValuePair previous,
                                         UnivariateRealPointValuePair current) {
                    return true;
                }
            };

        ms.setConvergenceChecker(checker);
        assertSame(checker, ms.getConvergenceChecker());
        assertSame(checker, stub.getConvergenceChecker());
    }

    // =========================================================
    // 14) overload 5-arg (มี startValue) ใช้ bound เดียวกับ 4-arg เพราะ internal loop
    //     ไม่ได้ใช้ startValue ไปกำหนด bound เลย (เรียก optimize(f,goal,min,max,0) เท่านั้น)
    // =========================================================
    @Test
    public void optimize_fiveArgOverload_behavesSameAsDefaultStartValueZero() throws Exception {
        StubOptimizer stub = new StubOptimizer();
        stub.addSuccess(pair(1.0, 1.0), 1);
        StubRandomGenerator rng = new StubRandomGenerator();

        MultiStartUnivariateRealOptimizer<UnivariateRealFunction> ms =
            new MultiStartUnivariateRealOptimizer<UnivariateRealFunction>(stub, 1, rng);

        // startValue (999.0) ไม่ควรมีผลต่อ bound ที่ถูกส่งไปยัง underlying optimizer
        UnivariateRealPointValuePair result =
            ms.optimize(new StubFunction(), GoalType.MINIMIZE, 0.0, 10.0, 999.0);

        assertEquals(1.0, result.getValue(), 1e-9);
        assertArrayEquals(new double[] { 0.0, 10.0 }, stub.recordedBounds.get(0), 1e-9);
    }

    // =========================================================
    // 15) ตรวจสอบการคำนวณ bound จาก generator สำหรับ i>0 รวมถึงการสลับ min/max (FastMath.min/max)
    // =========================================================
    @Test
    public void optimize_boundsComputation_usesGeneratorAndSwapsMinMaxCorrectly() throws Exception {
        StubOptimizer stub = new StubOptimizer();
        stub.addSuccess(pair(1.0, 1.0), 1); // i=0
        stub.addSuccess(pair(2.0, 2.0), 1); // i=1 (bound1 > bound2 -> ต้องสลับ)
        stub.addSuccess(pair(3.0, 3.0), 1); // i=2 (bound1 < bound2 -> ไม่ต้องสลับ)

        StubRandomGenerator rng = new StubRandomGenerator();
        // i=1: bound1=0+0.9*10=9, bound2=0+0.2*10=2  -> หลังสลับ (2,9)
        // i=2: bound1=0+0.3*10=3, bound2=0+0.9*10=9  -> ไม่ต้องสลับ (3,9)
        rng.enqueue(0.9, 0.2, 0.3, 0.9);

        MultiStartUnivariateRealOptimizer<UnivariateRealFunction> ms =
            new MultiStartUnivariateRealOptimizer<UnivariateRealFunction>(stub, 3, rng);

        ms.optimize(new StubFunction(), GoalType.MINIMIZE, 0.0, 10.0);

        assertEquals(3, stub.recordedBounds.size());
        assertArrayEquals(new double[] { 0.0, 10.0 }, stub.recordedBounds.get(0), 1e-9); // i=0
        assertArrayEquals(new double[] { 2.0, 9.0 }, stub.recordedBounds.get(1), 1e-9);  // i=1 swapped
        assertArrayEquals(new double[] { 3.0, 9.0 }, stub.recordedBounds.get(2), 1e-9);  // i=2 not swapped
        assertEquals(4, rng.callCount());
    }
}
