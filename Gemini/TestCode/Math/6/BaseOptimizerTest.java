package org.apache.commons.math3.optim;

import org.apache.commons.math3.exception.TooManyEvaluationsException;
import org.apache.commons.math3.exception.TooManyIterationsException;
import org.junit.Assert;
import org.junit.Test;

/**
 * Test class for {@link BaseOptimizer}.
 * Targets full branch coverage and edge cases.
 */
public class BaseOptimizerTest {

    /**
     * Concrete test implementation of BaseOptimizer to allow testing of its abstract methods
     * and internal execution flow.
     */
    private static class DummyOptimizer extends BaseOptimizer<String> {
        private final Runnable optimizeAction;

        public DummyOptimizer(ConvergenceChecker<String> checker) {
            this(checker, null);
        }

        public DummyOptimizer(ConvergenceChecker<String> checker, Runnable optimizeAction) {
            super(checker);
            this.optimizeAction = optimizeAction;
        }

        @Override
        protected String doOptimize() {
            if (optimizeAction != null) {
                optimizeAction.run();
            }
            return "optimal_result";
        }

        // Public delegators for protected methods
        public void testIncrementEvaluationCount() {
            super.incrementEvaluationCount();
        }

        public void testIncrementIterationCount() {
            super.incrementIterationCount();
        }
    }

    /**
     * Dummy OptimizationData to test unhandled data branches in parseOptimizationData.
     */
    private static class OtherOptimizationData implements OptimizationData {}

    @Test
    public void testInitialStateAndNullChecker() {
        DummyOptimizer optimizer = new DummyOptimizer(null);

        Assert.assertNull(optimizer.getConvergenceChecker());
        Assert.assertEquals(0, optimizer.getMaxEvaluations());
        Assert.assertEquals(0, optimizer.getEvaluations());
        Assert.assertEquals(0, optimizer.getMaxIterations());
        Assert.assertEquals(0, optimizer.getIterations());
    }

    @Test
    public void testNonNullChecker() {
        ConvergenceChecker<String> checker = new ConvergenceChecker<String>() {
            public boolean converged(int iteration, String previous, String current) {
                return true;
            }
        };
        DummyOptimizer optimizer = new DummyOptimizer(checker);

        Assert.assertSame(checker, optimizer.getConvergenceChecker());
    }

    @Test
    public void testOptimizeWithMaxEvalAndMaxIter() {
        DummyOptimizer optimizer = new DummyOptimizer(null);
        String result = optimizer.optimize(new MaxEval(100), new MaxIter(50));

        Assert.assertEquals("optimal_result", result);
        Assert.assertEquals(100, optimizer.getMaxEvaluations());
        Assert.assertEquals(50, optimizer.getMaxIterations());
        Assert.assertEquals(0, optimizer.getEvaluations());
        Assert.assertEquals(0, optimizer.getIterations());
    }

    @Test
    public void testParseOptimizationDataWithOtherTypesAndNull() {
        DummyOptimizer optimizer = new DummyOptimizer(null);

        // Pass null and unhandled OptimizationData type
        optimizer.optimize(new OptimizationData[] {
            null,
            new OtherOptimizationData(),
            new MaxEval(25),
            new OtherOptimizationData(),
            new MaxIter(15),
            null
        });

        Assert.assertEquals(25, optimizer.getMaxEvaluations());
        Assert.assertEquals(15, optimizer.getMaxIterations());
    }

    @Test
    public void testStateRetentionAndCounterResetAcrossCalls() {
        final DummyOptimizer[] optHolder = new DummyOptimizer[1];
        Runnable action = new Runnable() {
            public void run() {
                optHolder[0].testIncrementEvaluationCount();
                optHolder[0].testIncrementEvaluationCount();
                optHolder[0].testIncrementIterationCount();
            }
        };

        DummyOptimizer optimizer = new DummyOptimizer(null, action);
        optHolder[0] = optimizer;

        // First run: configure limits
        optimizer.optimize(new MaxEval(10), new MaxIter(10));
        Assert.assertEquals(2, optimizer.getEvaluations());
        Assert.assertEquals(1, optimizer.getIterations());
        Assert.assertEquals(10, optimizer.getMaxEvaluations());
        Assert.assertEquals(10, optimizer.getMaxIterations());

        // Second run: no options passed -> existing limits must be retained, counts reset
        optimizer.optimize();
        Assert.assertEquals(2, optimizer.getEvaluations());
        Assert.assertEquals(1, optimizer.getIterations());
        Assert.assertEquals(10, optimizer.getMaxEvaluations());
        Assert.assertEquals(10, optimizer.getMaxIterations());
    }

    @Test
    public void testEvaluationCountWithinBoundary() {
        DummyOptimizer optimizer = new DummyOptimizer(null);
        optimizer.optimize(new MaxEval(3));

        optimizer.testIncrementEvaluationCount();
        optimizer.testIncrementEvaluationCount();
        optimizer.testIncrementEvaluationCount();

        Assert.assertEquals(3, optimizer.getEvaluations());
    }

    @Test
    public void testEvaluationCountExceededThrowsException() {
        DummyOptimizer optimizer = new DummyOptimizer(null);
        optimizer.optimize(new MaxEval(2));

        optimizer.testIncrementEvaluationCount();
        optimizer.testIncrementEvaluationCount();

        try {
            optimizer.testIncrementEvaluationCount();
            Assert.fail("Expected TooManyEvaluationsException was not thrown");
        } catch (TooManyEvaluationsException e) {
            Assert.assertEquals(2, e.getMax().intValue());
        }
    }

    @Test
    public void testEvaluationCountZeroLimitThrowsImmediately() {
        DummyOptimizer optimizer = new DummyOptimizer(null);
        optimizer.optimize(new MaxEval(0));

        try {
            optimizer.testIncrementEvaluationCount();
            Assert.fail("Expected TooManyEvaluationsException was not thrown");
        } catch (TooManyEvaluationsException e) {
            Assert.assertEquals(0, e.getMax().intValue());
        }
    }

    @Test
    public void testIterationCountWithinBoundary() {
        DummyOptimizer optimizer = new DummyOptimizer(null);
        optimizer.optimize(new MaxIter(2));

        optimizer.testIncrementIterationCount();
        optimizer.testIncrementIterationCount();

        Assert.assertEquals(2, optimizer.getIterations());
    }

    @Test
    public void testIterationCountExceededThrowsException() {
        DummyOptimizer optimizer = new DummyOptimizer(null);
        optimizer.optimize(new MaxIter(1));

        optimizer.testIncrementIterationCount();

        try {
            optimizer.testIncrementIterationCount();
            Assert.fail("Expected TooManyIterationsException was not thrown");
        } catch (TooManyIterationsException e) {
            Assert.assertEquals(1, e.getMax().intValue());
        }
    }

    @Test
    public void testIterationCountZeroLimitThrowsImmediately() {
        DummyOptimizer optimizer = new DummyOptimizer(null);
        optimizer.optimize(new MaxIter(0));

        try {
            optimizer.testIncrementIterationCount();
            Assert.fail("Expected TooManyIterationsException was not thrown");
        } catch (TooManyIterationsException e) {
            Assert.assertEquals(0, e.getMax().intValue());
        }
    }

    @Test
    public void testParseOptimizationDataOverwriteSequence() {
        DummyOptimizer optimizer = new DummyOptimizer(null);

        // Multiple values in the same array -> last one should take precedence
        optimizer.optimize(
            new MaxEval(10),
            new MaxEval(20),
            new MaxIter(5),
            new MaxIter(15)
        );

        Assert.assertEquals(20, optimizer.getMaxEvaluations());
        Assert.assertEquals(15, optimizer.getMaxIterations());
    }
}