package org.apache.commons.math.optimization;

import org.apache.commons.math.ConvergenceException;
import org.apache.commons.math.FunctionEvaluationException;
import org.apache.commons.math.analysis.SinFunction;
import org.apache.commons.math.analysis.UnivariateRealFunction;
import org.apache.commons.math.optimization.univariate.BrentOptimizer;
import org.apache.commons.math.random.JDKRandomGenerator;
import org.apache.commons.math.random.RandomGenerator;
import org.junit.Assert;
import org.junit.Test;

public class MultiStartUnivariateRealOptimizerTest {

    @Test(expected = IllegalStateException.class)
    public void testGetOptimaBeforeOptimizeThrowsException() {
        UnivariateRealOptimizer underlying = new BrentOptimizer();
        MultiStartUnivariateRealOptimizer optimizer =
                new MultiStartUnivariateRealOptimizer(underlying, 5, new JDKRandomGenerator());
        optimizer.getOptima();
    }

    @Test(expected = IllegalStateException.class)
    public void testGetOptimaValuesBeforeOptimizeThrowsException() {
        UnivariateRealOptimizer underlying = new BrentOptimizer();
        MultiStartUnivariateRealOptimizer optimizer =
                new MultiStartUnivariateRealOptimizer(underlying, 5, new JDKRandomGenerator());
        optimizer.getOptimaValues();
    }

    @Test
    public void testMinimizeSinFunctionSuccess() throws Exception {
        UnivariateRealOptimizer underlying = new BrentOptimizer();
        JDKRandomGenerator g = new JDKRandomGenerator();
        g.setSeed(43927429);
        MultiStartUnivariateRealOptimizer optimizer =
                new MultiStartUnivariateRealOptimizer(underlying, 5, g);

        UnivariateRealFunction f = new SinFunction();
        double result = optimizer.optimize(f, GoalType.MINIMIZE, -100.0, 100.0);

        Assert.assertEquals(-1.0, optimizer.getFunctionValue(), 1e-6);
        Assert.assertEquals(result, optimizer.getResult(), 1e-6);

        double[] optima = optimizer.getOptima();
        double[] optimaValues = optimizer.getOptimaValues();
        Assert.assertEquals(5, optima.length);
        Assert.assertEquals(5, optimaValues.length);

        // Verify sorted in ascending order for minimization
        for (int i = 1; i < optimaValues.length; ++i) {
            if (!Double.isNaN(optimaValues[i])) {
                Assert.assertTrue(optimaValues[i - 1] <= optimaValues[i]);
            }
        }
    }

    @Test
    public void testMaximizeSinFunctionSuccess() throws Exception {
        UnivariateRealOptimizer underlying = new BrentOptimizer();
        JDKRandomGenerator g = new JDKRandomGenerator();
        g.setSeed(98234729);
        MultiStartUnivariateRealOptimizer optimizer =
                new MultiStartUnivariateRealOptimizer(underlying, 5, g);

        UnivariateRealFunction f = new SinFunction();
        double result = optimizer.optimize(f, GoalType.MAXIMIZE, -100.0, 100.0);

        Assert.assertEquals(1.0, optimizer.getFunctionValue(), 1e-6);
        Assert.assertEquals(result, optimizer.getResult(), 1e-6);

        double[] optimaValues = optimizer.getOptimaValues();
        // Verify sorted in descending order for maximization
        for (int i = 1; i < optimaValues.length; ++i) {
            if (!Double.isNaN(optimaValues[i])) {
                Assert.assertTrue(optimaValues[i - 1] >= optimaValues[i]);
            }
        }
    }

    @Test
    public void testOptimizeWithStartValueDelegation() throws Exception {
        UnivariateRealOptimizer underlying = new BrentOptimizer();
        MultiStartUnivariateRealOptimizer optimizer =
                new MultiStartUnivariateRealOptimizer(underlying, 3, new JDKRandomGenerator());

        UnivariateRealFunction f = new SinFunction();
        double result5Args = optimizer.optimize(f, GoalType.MINIMIZE, 4.0, 5.0, 4.5);
        Assert.assertEquals(3 * Math.PI / 2, result5Args, 1e-4);
    }

    @Test(expected = OptimizationException.class)
    public void testAllStartsThrowConvergenceException() throws Exception {
        UnivariateRealOptimizer alwaysFailOptimizer = new UnivariateRealOptimizer() {
            private int maxIter = 100;
            private int maxEval = 100;

            public double optimize(UnivariateRealFunction f, GoalType goalType, double min, double max)
                    throws ConvergenceException {
                throw new ConvergenceException("Convergence failed intentionally");
            }

            public double optimize(UnivariateRealFunction f, GoalType goalType, double min, double max, double startValue)
                    throws ConvergenceException {
                return optimize(f, goalType, min, max);
            }

            public double getFunctionValue() { return Double.NaN; }
            public double getResult() { return Double.NaN; }
            public double getAbsoluteAccuracy() { return 1e-6; }
            public int getIterationCount() { return 10; }
            public int getMaximalIterationCount() { return maxIter; }
            public int getMaxEvaluations() { return maxEval; }
            public int getEvaluations() { return 10; }
            public double getRelativeAccuracy() { return 1e-6; }
            public void resetAbsoluteAccuracy() {}
            public void resetMaximalIterationCount() {}
            public void resetRelativeAccuracy() {}
            public void setAbsoluteAccuracy(double accuracy) {}
            public void setMaximalIterationCount(int count) { this.maxIter = count; }
            public void setMaxEvaluations(int maxEvaluations) { this.maxEval = maxEvaluations; }
            public void setRelativeAccuracy(double accuracy) {}
        };

        MultiStartUnivariateRealOptimizer optimizer =
                new MultiStartUnivariateRealOptimizer(alwaysFailOptimizer, 3, new JDKRandomGenerator());
        UnivariateRealFunction f = new SinFunction();
        optimizer.optimize(f, GoalType.MINIMIZE, 0, 1);
    }

    @Test(expected = OptimizationException.class)
    public void testAllStartsThrowFunctionEvaluationException() throws Exception {
        UnivariateRealOptimizer alwaysFailEvalOptimizer = new UnivariateRealOptimizer() {
            public double optimize(UnivariateRealFunction f, GoalType goalType, double min, double max)
                    throws FunctionEvaluationException {
                throw new FunctionEvaluationException(0.0);
            }

            public double optimize(UnivariateRealFunction f, GoalType goalType, double min, double max, double startValue)
                    throws FunctionEvaluationException {
                return optimize(f, goalType, min, max);
            }

            public double getFunctionValue() { return Double.NaN; }
            public double getResult() { return Double.NaN; }
            public double getAbsoluteAccuracy() { return 1e-6; }
            public int getIterationCount() { return 5; }
            public int getMaximalIterationCount() { return 100; }
            public int getMaxEvaluations() { return 100; }
            public int getEvaluations() { return 5; }
            public double getRelativeAccuracy() { return 1e-6; }
            public void resetAbsoluteAccuracy() {}
            public void resetMaximalIterationCount() {}
            public void resetRelativeAccuracy() {}
            public void setAbsoluteAccuracy(double accuracy) {}
            public void setMaximalIterationCount(int count) {}
            public void setMaxEvaluations(int maxEvaluations) {}
            public void setRelativeAccuracy(double accuracy) {}
        };

        MultiStartUnivariateRealOptimizer optimizer =
                new MultiStartUnivariateRealOptimizer(alwaysFailEvalOptimizer, 2, new JDKRandomGenerator());
        UnivariateRealFunction f = new SinFunction();
        optimizer.optimize(f, GoalType.MAXIMIZE, 0, 1);
    }

    @Test
    public void testPartialFailuresAndSorting() throws Exception {
        // Simulates an optimizer returning a sequence of successes and failures to test NaN handling & sorting
        UnivariateRealOptimizer sequencedOptimizer = new UnivariateRealOptimizer() {
            private int callCount = 0;
            private double[] results = { 5.0, 2.0, 8.0, 1.0 };
            private double[] values  = { 25.0, 4.0, 64.0, 1.0 };

            public double optimize(UnivariateRealFunction f, GoalType goalType, double min, double max)
                    throws ConvergenceException, FunctionEvaluationException {
                int index = callCount++;
                if (index == 1) {
                    throw new ConvergenceException("Start 1 failed");
                }
                if (index == 2) {
                    throw new FunctionEvaluationException(0.0);
                }
                return results[index];
            }

            public double optimize(UnivariateRealFunction f, GoalType goalType, double min, double max, double startValue)
                    throws ConvergenceException, FunctionEvaluationException {
                return optimize(f, goalType, min, max);
            }

            public double getFunctionValue() {
                return values[callCount - 1];
            }

            public double getResult() {
                return results[callCount - 1];
            }

            public double getAbsoluteAccuracy() { return 1e-6; }
            public int getIterationCount() { return 3; }
            public int getMaximalIterationCount() { return 100; }
            public int getMaxEvaluations() { return 100; }
            public int getEvaluations() { return 4; }
            public double getRelativeAccuracy() { return 1e-6; }
            public void resetAbsoluteAccuracy() {}
            public void resetMaximalIterationCount() {}
            public void resetRelativeAccuracy() {}
            public void setAbsoluteAccuracy(double accuracy) {}
            public void setMaximalIterationCount(int count) {}
            public void setMaxEvaluations(int maxEvaluations) {}
            public void setRelativeAccuracy(double accuracy) {}
        };

        MultiStartUnivariateRealOptimizer optimizer =
                new MultiStartUnivariateRealOptimizer(sequencedOptimizer, 4, new JDKRandomGenerator());

        double bestX = optimizer.optimize(new SinFunction(), GoalType.MINIMIZE, 0.0, 10.0);
        Assert.assertEquals(1.0, bestX, 1e-9);

        double[] optima = optimizer.getOptima();
        double[] optimaValues = optimizer.getOptimaValues();

        Assert.assertEquals(4, optima.length);
        Assert.assertEquals(1.0, optima[0], 1e-9);
        Assert.assertEquals(1.0, optimaValues[0], 1e-9);
        Assert.assertEquals(5.0, optima[1], 1e-9);
        Assert.assertEquals(25.0, optimaValues[1], 1e-9);
        Assert.assertTrue(Double.isNaN(optima[2]));
        Assert.assertTrue(Double.isNaN(optima[3]));

        Assert.assertEquals(12, optimizer.getIterationCount());
        Assert.assertEquals(16, optimizer.getEvaluations());
    }

    @Test
    public void testGettersSettersAndDelegation() {
        BrentOptimizer underlying = new BrentOptimizer();
        MultiStartUnivariateRealOptimizer optimizer =
                new MultiStartUnivariateRealOptimizer(underlying, 3, new JDKRandomGenerator());

        optimizer.setMaximalIterationCount(500);
        Assert.assertEquals(500, optimizer.getMaximalIterationCount());

        optimizer.setMaxEvaluations(1000);
        Assert.assertEquals(1000, optimizer.getMaxEvaluations());

        optimizer.setAbsoluteAccuracy(1e-5);
        Assert.assertEquals(1e-5, optimizer.getAbsoluteAccuracy(), 1e-12);

        optimizer.setRelativeAccuracy(1e-7);
        Assert.assertEquals(1e-7, optimizer.getRelativeAccuracy(), 1e-12);

        optimizer.resetAbsoluteAccuracy();
        optimizer.resetRelativeAccuracy();
        optimizer.resetMaximalIterationCount();
    }
}