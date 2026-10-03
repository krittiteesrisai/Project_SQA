package org.apache.commons.math.optimization.univariate;

import org.apache.commons.math.FunctionEvaluationException;
import org.apache.commons.math.analysis.SinFunction;
import org.apache.commons.math.analysis.UnivariateRealFunction;
import org.apache.commons.math.exception.ConvergenceException;
import org.apache.commons.math.exception.MathIllegalStateException;
import org.apache.commons.math.optimization.ConvergenceChecker;
import org.apache.commons.math.optimization.GoalType;
import org.apache.commons.math.random.JDKRandomGenerator;
import org.apache.commons.math.random.RandomGenerator;
import org.junit.Assert;
import org.junit.Test;

public class MultiStartUnivariateRealOptimizerTest {

    @Test(expected = MathIllegalStateException.class)
    public void testGetOptimaBeforeOptimizeThrowsException() {
        BrentOptimizer underlying = new BrentOptimizer(1e-10, 1e-14);
        JDKRandomGenerator g = new JDKRandomGenerator();
        MultiStartUnivariateRealOptimizer<UnivariateRealFunction> optimizer =
                new MultiStartUnivariateRealOptimizer<UnivariateRealFunction>(underlying, 5, g);
        optimizer.getOptima();
    }

    @Test
    public void testGetOptimaImmutability() throws Exception {
        UnivariateRealOptimizer underlying = new BrentOptimizer(1e-10, 1e-14);
        JDKRandomGenerator g = new JDKRandomGenerator();
        g.setSeed(42);
        MultiStartUnivariateRealOptimizer<UnivariateRealFunction> optimizer =
                new MultiStartUnivariateRealOptimizer<UnivariateRealFunction>(underlying, 3, g);
        optimizer.setMaxEvaluations(100);

        UnivariateRealFunction f = new SinFunction();
        optimizer.optimize(f, GoalType.MINIMIZE, -100.0, 100.0);

        UnivariateRealPointValuePair[] optima1 = optimizer.getOptima();
        UnivariateRealPointValuePair[] optima2 = optimizer.getOptima();
        Assert.assertNotSame("getOptima should return a cloned array", optima1, optima2);

        // Modifying returned array should not affect next calls
        optima1[0] = null;
        Assert.assertNotNull(optimizer.getOptima()[0]);
    }

    @Test
    public void testOptimizeMinimizeSinFunction() throws Exception {
        UnivariateRealOptimizer underlying = new BrentOptimizer(1e-10, 1e-14);
        JDKRandomGenerator g = new JDKRandomGenerator();
        g.setSeed(12345);
        MultiStartUnivariateRealOptimizer<UnivariateRealFunction> optimizer =
                new MultiStartUnivariateRealOptimizer<UnivariateRealFunction>(underlying, 10, g);
        optimizer.setMaxEvaluations(300);

        UnivariateRealFunction f = new SinFunction();
        UnivariateRealPointValuePair optimum = optimizer.optimize(f, GoalType.MINIMIZE, -100.0, 100.0);

        Assert.assertEquals(-1.0, optimum.getValue(), 1e-6);
        Assert.assertTrue(optimizer.getEvaluations() > 0);
        Assert.assertEquals(10, optimizer.getOptima().length);

        // Check array is sorted in ascending order (minimization)
        UnivariateRealPointValuePair[] optima = optimizer.getOptima();
        for (int i = 1; i < optima.length; ++i) {
            if (optima[i] != null && optima[i - 1] != null) {
                Assert.assertTrue(optima[i - 1].getValue() <= optima[i].getValue());
            }
        }
    }

    @Test
    public void testOptimizeMaximizeSinFunction() throws Exception {
        UnivariateRealOptimizer underlying = new BrentOptimizer(1e-10, 1e-14);
        JDKRandomGenerator g = new JDKRandomGenerator();
        g.setSeed(12345);
        MultiStartUnivariateRealOptimizer<UnivariateRealFunction> optimizer =
                new MultiStartUnivariateRealOptimizer<UnivariateRealFunction>(underlying, 10, g);
        optimizer.setMaxEvaluations(300);

        UnivariateRealFunction f = new SinFunction();
        UnivariateRealPointValuePair optimum = optimizer.optimize(f, GoalType.MAXIMIZE, -100.0, 100.0);

        Assert.assertEquals(1.0, optimum.getValue(), 1e-6);

        // Check array is sorted in descending order (maximization)
        UnivariateRealPointValuePair[] optima = optimizer.getOptima();
        for (int i = 1; i < optima.length; ++i) {
            if (optima[i] != null && optima[i - 1] != null) {
                Assert.assertTrue(optima[i - 1].getValue() >= optima[i].getValue());
            }
        }
    }

    @Test
    public void testOptimizeWithStartValueDelegation() throws Exception {
        UnivariateRealOptimizer underlying = new BrentOptimizer(1e-10, 1e-14);
        JDKRandomGenerator g = new JDKRandomGenerator();
        g.setSeed(999);
        MultiStartUnivariateRealOptimizer<UnivariateRealFunction> optimizer =
                new MultiStartUnivariateRealOptimizer<UnivariateRealFunction>(underlying, 3, g);
        optimizer.setMaxEvaluations(150);

        UnivariateRealFunction f = new SinFunction();
        UnivariateRealPointValuePair optimum = optimizer.optimize(f, GoalType.MINIMIZE, -5.0, 5.0, 1.0);
        Assert.assertNotNull(optimum);
        Assert.assertEquals(-1.0, optimum.getValue(), 1e-6);
    }

    @Test
    public void testPartialConvergenceAndSortWithNulls() throws Exception {
        // Underlying optimizer that fails on even evaluation start indices
        final int[] callCount = new int[]{0};
        BaseUnivariateRealOptimizer<UnivariateRealFunction> mockOptimizer =
                new BaseUnivariateRealOptimizer<UnivariateRealFunction>() {
                    private int maxEval = 100;
                    private int eval = 0;

                    public int getMaxEvaluations() { return maxEval; }
                    public int getEvaluations() { return eval; }
                    public void setMaxEvaluations(int maxEvaluations) { this.maxEval = maxEvaluations; }
                    public void setConvergenceChecker(ConvergenceChecker<UnivariateRealPointValuePair> checker) {}
                    public ConvergenceChecker<UnivariateRealPointValuePair> getConvergenceChecker() { return null; }

                    public UnivariateRealPointValuePair optimize(UnivariateRealFunction f, GoalType goalType,
                                                                 double min, double max)
                            throws FunctionEvaluationException {
                        eval = 5;
                        callCount[0]++;
                        if (callCount[0] == 1) {
                            throw new ConvergenceException(null);
                        } else if (callCount[0] == 2) {
                            throw new FunctionEvaluationException(0.0);
                        } else if (callCount[0] == 3) {
                            return new UnivariateRealPointValuePair(2.0, 10.0);
                        } else {
                            return new UnivariateRealPointValuePair(1.0, 5.0);
                        }
                    }

                    public UnivariateRealPointValuePair optimize(UnivariateRealFunction f, GoalType goalType,
                                                                 double min, double max, double startValue)
                            throws FunctionEvaluationException {
                        return optimize(f, goalType, min, max);
                    }
                };

        JDKRandomGenerator g = new JDKRandomGenerator();
        MultiStartUnivariateRealOptimizer<UnivariateRealFunction> optimizer =
                new MultiStartUnivariateRealOptimizer<UnivariateRealFunction>(mockOptimizer, 4, g);
        optimizer.setMaxEvaluations(100);

        UnivariateRealFunction dummyFunc = new UnivariateRealFunction() {
            public double value(double x) { return x; }
        };

        UnivariateRealPointValuePair best = optimizer.optimize(dummyFunc, GoalType.MINIMIZE, 0.0, 10.0);
        Assert.assertNotNull(best);
        Assert.assertEquals(5.0, best.getValue(), 1e-9);

        UnivariateRealPointValuePair[] optima = optimizer.getOptima();
        Assert.assertEquals(4, optima.length);
        Assert.assertEquals(5.0, optima[0].getValue(), 1e-9);
        Assert.assertEquals(10.0, optima[1].getValue(), 1e-9);
        Assert.assertNull(optima[2]);
        Assert.assertNull(optima[3]);
        Assert.assertEquals(20, optimizer.getEvaluations());
    }

    @Test(expected = ConvergenceException.class)
    public void testAllStartsFailThrowsConvergenceException() throws Exception {
        BaseUnivariateRealOptimizer<UnivariateRealFunction> failingOptimizer =
                new BaseUnivariateRealOptimizer<UnivariateRealFunction>() {
                    private int maxEval = 100;
                    public int getMaxEvaluations() { return maxEval; }
                    public int getEvaluations() { return 1; }
                    public void setMaxEvaluations(int maxEvaluations) { this.maxEval = maxEvaluations; }
                    public void setConvergenceChecker(ConvergenceChecker<UnivariateRealPointValuePair> checker) {}
                    public ConvergenceChecker<UnivariateRealPointValuePair> getConvergenceChecker() { return null; }

                    public UnivariateRealPointValuePair optimize(UnivariateRealFunction f, GoalType goalType,
                                                                 double min, double max)
                            throws FunctionEvaluationException {
                        throw new ConvergenceException(null);
                    }

                    public UnivariateRealPointValuePair optimize(UnivariateRealFunction f, GoalType goalType,
                                                                 double min, double max, double startValue)
                            throws FunctionEvaluationException {
                        throw new FunctionEvaluationException(startValue);
                    }
                };

        JDKRandomGenerator g = new JDKRandomGenerator();
        MultiStartUnivariateRealOptimizer<UnivariateRealFunction> optimizer =
                new MultiStartUnivariateRealOptimizer<UnivariateRealFunction>(failingOptimizer, 3, g);
        optimizer.setMaxEvaluations(100);

        UnivariateRealFunction dummyFunc = new UnivariateRealFunction() {
            public double value(double x) { return x; }
        };

        optimizer.optimize(dummyFunc, GoalType.MINIMIZE, 0.0, 1.0);
    }

    @Test
    public void testDelegationMethodsAndGettersSetters() {
        BrentOptimizer underlying = new BrentOptimizer(1e-10, 1e-14);
        JDKRandomGenerator g = new JDKRandomGenerator();
        MultiStartUnivariateRealOptimizer<UnivariateRealFunction> optimizer =
                new MultiStartUnivariateRealOptimizer<UnivariateRealFunction>(underlying, 5, g);

        optimizer.setMaxEvaluations(250);
        Assert.assertEquals(250, optimizer.getMaxEvaluations());
        Assert.assertEquals(250, underlying.getMaxEvaluations());

        ConvergenceChecker<UnivariateRealPointValuePair> checker =
                new ConvergenceChecker<UnivariateRealPointValuePair>() {
                    public boolean converged(int iteration, UnivariateRealPointValuePair previous,
                                             UnivariateRealPointValuePair current) {
                        return true;
                    }
                };

        optimizer.setConvergenceChecker(checker);
        Assert.assertSame(checker, optimizer.getConvergenceChecker());
        Assert.assertSame(checker, underlying.getConvergenceChecker());
    }
}