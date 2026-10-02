package org.apache.commons.math3.optim;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

import org.apache.commons.math3.exception.TooManyEvaluationsException;
import org.apache.commons.math3.exception.TooManyIterationsException;

public class BaseOptimizerTest {

    /**
     * Concrete subclass สำหรับทดสอบ (เนื่องจาก BaseOptimizer เป็น abstract)
     * doOptimize() ไม่ทำอะไร คืนค่าคงที่ เพื่อแยก concern การทดสอบ
     * logic ของ BaseOptimizer เอง
     */
    private static class DummyOptimizer extends BaseOptimizer<Double> {
        protected DummyOptimizer(ConvergenceChecker<Double> checker) {
            super(checker);
        }

        @Override
        protected Double doOptimize() {
            return 0.0;
        }

        // เปิด (expose) protected method เพื่อทดสอบตรง ๆ
        public void callIncrementEvaluationCount() {
            incrementEvaluationCount();
        }

        public void callIncrementIterationCount() {
            incrementIterationCount();
        }

        public void callParseOptimizationData(OptimizationData... optData) {
            parseOptimizationData(optData);
        }
    }

    private ConvergenceChecker<Double> checker;
    private DummyOptimizer optimizer;

    @Before
    public void setUp() {
        checker = new ConvergenceChecker<Double>() {
            @Override
            public boolean converged(int iteration, Double previous, Double current) {
                return true;
            }
        };
        optimizer = new DummyOptimizer(checker);
    }

    // ---------- Constructor / Getter ----------

    @Test
    public void testGetConvergenceChecker() {
        assertSame(checker, optimizer.getConvergenceChecker());
    }

    @Test
    public void testConstructorAllowsNullChecker() {
        // ซอร์สโค้ดไม่ validate checker จึงต้องยอมรับ null ได้ (ไม่มี NPE check ใน constructor)
        DummyOptimizer opt = new DummyOptimizer(null);
        assertNull(opt.getConvergenceChecker());
    }

    @Test
    public void testInitialCountsAreZero() {
        assertEquals(0, optimizer.getEvaluations());
        assertEquals(0, optimizer.getIterations());
        assertEquals(0, optimizer.getMaxEvaluations());
        assertEquals(0, optimizer.getMaxIterations());
    }

    // ---------- parseOptimizationData: loop branches ----------

    @Test
    public void testParseOptimizationDataEmptyArray() {
        // 0 รอบ loop -> ไม่มีอะไรเปลี่ยน
        optimizer.callParseOptimizationData();
        assertEquals(0, optimizer.getMaxEvaluations());
        assertEquals(0, optimizer.getMaxIterations());
    }

    @Test
    public void testParseOptimizationDataNoArgsVarargsNull() {
        // เรียก optimize โดยไม่มี args เลย ก็ต้องไม่พัง (varargs ว่าง)
        optimizer.callParseOptimizationData(new OptimizationData[0]);
        assertEquals(0, optimizer.getMaxEvaluations());
    }

    @Test
    public void testParseOptimizationDataMaxEvalOnly() {
        optimizer.callParseOptimizationData(new MaxEval(100));
        assertEquals(100, optimizer.getMaxEvaluations());
        assertEquals(0, optimizer.getMaxIterations()); // ไม่ถูกตั้งค่า ยังเป็น default
    }

    @Test
    public void testParseOptimizationDataMaxIterOnly() {
        optimizer.callParseOptimizationData(new MaxIter(50));
        assertEquals(50, optimizer.getMaxIterations());
        assertEquals(0, optimizer.getMaxEvaluations());
    }

    @Test
    public void testParseOptimizationDataBothMaxEvalAndMaxIter() {
        optimizer.callParseOptimizationData(new MaxEval(100), new MaxIter(50));
        assertEquals(100, optimizer.getMaxEvaluations());
        assertEquals(50, optimizer.getMaxIterations());
    }

    @Test
    public void testParseOptimizationDataUnknownTypeIsIgnored() {
        // ชนิดข้อมูลที่ไม่ใช่ MaxEval/MaxIter -> ไม่เข้า if ใดเลย (falls through)
        OptimizationData unknown = new OptimizationData() { };
        optimizer.callParseOptimizationData(unknown);
        assertEquals(0, optimizer.getMaxEvaluations());
        assertEquals(0, optimizer.getMaxIterations());
    }

    @Test
    public void testParseOptimizationDataRetainsPreviousValueWhenNotProvided() {
        // เรียกครั้งแรก กำหนดทั้งคู่
        optimizer.callParseOptimizationData(new MaxEval(200), new MaxIter(20));
        assertEquals(200, optimizer.getMaxEvaluations());
        assertEquals(20, optimizer.getMaxIterations());

        // เรียกครั้งที่สอง ไม่ส่ง MaxEval -> ค่าเดิมต้องถูกเก็บไว้ (ตาม javadoc ของ optimize())
        optimizer.callParseOptimizationData(new MaxIter(99));
        assertEquals(200, optimizer.getMaxEvaluations());
        assertEquals(99, optimizer.getMaxIterations());
    }

    // ---------- incrementEvaluationCount branches ----------

    @Test
    public void testIncrementEvaluationCountWithinLimit() {
        optimizer.callParseOptimizationData(new MaxEval(2));
        optimizer.callIncrementEvaluationCount();
        assertEquals(1, optimizer.getEvaluations());
        optimizer.callIncrementEvaluationCount();
        assertEquals(2, optimizer.getEvaluations());
    }

    @Test(expected = TooManyEvaluationsException.class)
    public void testIncrementEvaluationCountExceedsLimitThrows() {
        optimizer.callParseOptimizationData(new MaxEval(1));
        optimizer.callIncrementEvaluationCount(); // count=1 (== max, ok)
        optimizer.callIncrementEvaluationCount(); // count=2 > max=1 -> throw
    }

    @Test
    public void testIncrementEvaluationCountZeroMaxThrowsImmediately() {
        // boundary: max=0 -> increment แรกต้อง throw ทันที
        optimizer.callParseOptimizationData(new MaxEval(0));
        try {
            optimizer.callIncrementEvaluationCount();
            fail("Expected TooManyEvaluationsException");
        } catch (TooManyEvaluationsException e) {
            // expected
        }
    }

    // ---------- incrementIterationCount branches ----------

    @Test
    public void testIncrementIterationCountWithinLimit() {
        optimizer.callParseOptimizationData(new MaxIter(2));
        optimizer.callIncrementIterationCount();
        assertEquals(1, optimizer.getIterations());
        optimizer.callIncrementIterationCount();
        assertEquals(2, optimizer.getIterations());
    }

    @Test(expected = TooManyIterationsException.class)
    public void testIncrementIterationCountExceedsLimitThrows() {
        optimizer.callParseOptimizationData(new MaxIter(1));
        optimizer.callIncrementIterationCount();
        optimizer.callIncrementIterationCount(); // throw
    }

    @Test
    public void testIncrementIterationCountZeroMaxThrowsImmediately() {
        optimizer.callParseOptimizationData(new MaxIter(0));
        try {
            optimizer.callIncrementIterationCount();
            fail("Expected TooManyIterationsException");
        } catch (TooManyIterationsException e) {
            // expected
        }
    }

    // ---------- optimize(...) integration ----------

    @Test
    public void testOptimizeResetsCountersBeforeDoOptimize() {
        optimizer.callParseOptimizationData(new MaxEval(10), new MaxIter(10));
        optimizer.callIncrementEvaluationCount();
        optimizer.callIncrementIterationCount();
        assertEquals(1, optimizer.getEvaluations());
        assertEquals(1, optimizer.getIterations());

        Double result = optimizer.optimize(new MaxEval(10), new MaxIter(10));

        assertEquals(0.0, result, 0.0);
        // optimize() ต้อง reset count เป็น 0 ก่อนเรียก doOptimize()
        assertEquals(0, optimizer.getEvaluations());
        assertEquals(0, optimizer.getIterations());
    }

    @Test
    public void testOptimizeWithNoArguments() {
        // varargs ว่าง -> parseOptimizationData loop ไม่ทำงาน แต่ reset/doOptimize ยังรันตามปกติ
        Double result = optimizer.optimize();
        assertEquals(0.0, result, 0.0);
        assertEquals(0, optimizer.getEvaluations());
        assertEquals(0, optimizer.getIterations());
        assertEquals(0, optimizer.getMaxEvaluations());
        assertEquals(0, optimizer.getMaxIterations());
    }

    @Test
    public void testOptimizeUpdatesMaxValues() {
        Double result = optimizer.optimize(new MaxEval(5), new MaxIter(3));
        assertEquals(0.0, result, 0.0);
        assertEquals(5, optimizer.getMaxEvaluations());
        assertEquals(3, optimizer.getMaxIterations());
    }

    // ---------- Getter boundary ----------

    @Test
    public void testGetMaxEvaluationsDefaultIsZero() {
        assertEquals(0, optimizer.getMaxEvaluations());
    }

    @Test
    public void testGetMaxIterationsDefaultIsZero() {
        assertEquals(0, optimizer.getMaxIterations());
    }
}
