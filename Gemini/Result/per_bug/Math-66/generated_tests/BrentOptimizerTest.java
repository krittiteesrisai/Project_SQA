package org.apache.commons.math.optimization.univariate;

import org.apache.commons.math.FunctionEvaluationException;
import org.apache.commons.math.MaxIterationsExceededException;
import org.apache.commons.math.analysis.SinFunction;
import org.apache.commons.math.analysis.QuinticFunction;
import org.apache.commons.math.analysis.UnivariateRealFunction;
import org.apache.commons.math.exception.NotStrictlyPositiveException;
import org.apache.commons.math.optimization.GoalType;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * High-coverage test suite for BrentOptimizer targeting branch/condition coverage
 * and edge cases for Apache Commons Math.
 */
public class BrentOptimizerTest {

    private BrentOptimizer optimizer;

    @Before
    public void setUp() {
        optimizer = new BrentOptimizer();
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testDoOptimizeThrowsUnsupportedOperationException() throws Exception {
        optimizer.doOptimize();
    }

    @Test
    public void testDefaultConstructorSettings() {
        Assert.assertEquals(100, optimizer.getMaximalIterationCount());
        Assert.assertEquals(Integer.MAX_VALUE, optimizer.getMaxEvaluations());
        Assert.assertEquals(1E-10, optimizer.getAbsoluteAccuracy(), 1e-15);
        Assert.assertEquals(1.0e-14, optimizer.getRelativeAccuracy(), 1e-15);
    }

    @Test(expected = NotStrictlyPositiveException.class)
    public void testNonPositiveRelativeAccuracyZero() throws Exception {
        optimizer.setRelativeAccuracy(0.0);
        UnivariateRealFunction f = new QuinticFunction();
        optimizer.optimize(f, GoalType.MINIMIZE, -1.0, 1.0);
    }

    @Test(expected = NotStrictlyPositiveException.class)
    public void testNonPositiveRelativeAccuracyNegative() throws Exception {
        optimizer.setRelativeAccuracy(-1.0e-5);
        UnivariateRealFunction f = new QuinticFunction();
        optimizer.optimize(f, GoalType.MINIMIZE, -1.0, 1.0);
    }

    @Test(expected = NotStrictlyPositiveException.class)
    public void testNonPositiveAbsoluteAccuracyZero() throws Exception {
        optimizer.setAbsoluteAccuracy(0.0);
        UnivariateRealFunction f = new QuinticFunction();
        optimizer.optimize(f, GoalType.MINIMIZE, -1.0, 1.0);
    }

    @Test(expected = NotStrictlyPositiveException.class)
    public void testNonPositiveAbsoluteAccuracyNegative() throws Exception {
        optimizer.setAbsoluteAccuracy(-1.0e-5);
        UnivariateRealFunction f = new QuinticFunction();
        optimizer.optimize(f, GoalType.MINIMIZE, -1.0, 1.0);
    }

    @Test
    public void testInvertedIntervalBounds() throws Exception {
        // lo > hi branch
        UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) {
                return (x - 2.0) * (x - 2.0);
            }
        };
        // Passing max as lower bound and min as upper bound
        double result = optimizer.optimize(f, GoalType.MINIMIZE, 5.0, -1.0);
        Assert.assertEquals(2.0, result, 1e-8);
        Assert.assertEquals(0.0, optimizer.getFunctionValue(), 1e-8);
    }

    @Test
    public void testSinMinimizationStandard() throws Exception {
        UnivariateRealFunction f = new SinFunction();
        // Minimum of sin(x) in [3, 5] is at 3 * pi / 2 ~ 4.71238898
        double result = optimizer.optimize(f, GoalType.MINIMIZE, 3.0, 5.0);
        Assert.assertEquals(3.0 * Math.PI / 2.0, result, 1e-8);
        Assert.assertEquals(-1.0, optimizer.getFunctionValue(), 1e-8);
        Assert.assertTrue(optimizer.getIterationCount() > 0);
        Assert.assertTrue(optimizer.getEvaluations() > 0);
    }

    @Test
    public void testSinMaximizationWithStartValue() throws Exception {
        UnivariateRealFunction f = new SinFunction();
        // Maximum of sin(x) in [0, 3] is at pi / 2 ~ 1.57079632
        double result = optimizer.optimize(f, GoalType.MAXIMIZE, 0.0, 3.0, 1.2);
        Assert.assertEquals(Math.PI / 2.0, result, 1e-8);
        Assert.assertEquals(1.0, optimizer.getFunctionValue(), 1e-8);
    }

    @Test
    public void testParabolicStepNearBoundaries() throws Exception {
        // Function with minimum very close to boundary to force (u - a < tol2 || b - u < tol2)
        UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) {
                return (x - 0.0000001) * (x - 0.0000001);
            }
        };
        double result = optimizer.optimize(f, GoalType.MINIMIZE, 0.0, 1.0, 0.5);
        Assert.assertEquals(0.0000001, result, 1e-6);
    }

    @Test
    public void testParabolicStepAlternativeBranches() throws Exception {
        // Asymmetric cubic/quartic function to hit alternative condition branches for w, v, and parabolic fit
        UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) {
                return (x - 1.0) * (x - 1.0) * (x + 2.0) * (x - 3.0);
            }
        };
        double result = optimizer.optimize(f, GoalType.MINIMIZE, 0.0, 4.0, 0.5);
        Assert.assertTrue(result >= 0.0 && result <= 4.0);
    }

    @Test
    public void testMaximizationConcaveFunction() throws Exception {
        UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) {
                return -(x - 4.0) * (x - 4.0) + 10.0;
            }
        };
        double result = optimizer.optimize(f, GoalType.MAXIMIZE, 0.0, 10.0, 8.0);
        Assert.assertEquals(4.0, result, 1e-8);
        Assert.assertEquals(10.0, optimizer.getFunctionValue(), 1e-8);
    }

    @Test(expected = MaxIterationsExceededException.class)
    public void testMaxIterationsExceeded() throws Exception {
        optimizer.setMaximalIterationCount(1);
        UnivariateRealFunction f = new SinFunction();
        optimizer.optimize(f, GoalType.MINIMIZE, 0.0, 5.0);
    }

    @Test(expected = FunctionEvaluationException.class)
    public void testFunctionEvaluationExceptionPropagates() throws Exception {
        UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) throws FunctionEvaluationException {
                throw new FunctionEvaluationException(x, "Forced Evaluation Exception");
            }
        };
        optimizer.optimize(f, GoalType.MINIMIZE, 0.0, 1.0);
    }

    @Test
    public void testStepSmallerThanTol1Branch() throws Exception {
        // Sharp valley function forcing small step adjustments (|d| < tol1)
        UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) {
                return Math.abs(x - 1.0);
            }
        };
        double result = optimizer.optimize(f, GoalType.MINIMIZE, 0.0, 2.0, 1.0000000001);
        Assert.assertEquals(1.0, result, 1e-5);
    }

    @Test
    public void testStepTriggeringGoldenSectionAndVariousUpdates() throws Exception {
        // Quintic polynomial has multiple inflection points testing fu > fx, fu <= fw, fu <= fv branches
        UnivariateRealFunction f = new QuinticFunction();
        double result = optimizer.optimize(f, GoalType.MINIMIZE, -0.5, 0.5, 0.1);
        Assert.assertTrue(result >= -0.5 && result <= 0.5);
    }
}