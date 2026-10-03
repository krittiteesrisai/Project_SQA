package org.apache.commons.math3.optim.nonlinear.scalar.noderiv;

import org.apache.commons.math3.analysis.MultivariateFunction;
import org.apache.commons.math3.exception.MathUnsupportedOperationException;
import org.apache.commons.math3.exception.NotStrictlyPositiveException;
import org.apache.commons.math3.exception.NumberIsTooSmallException;
import org.apache.commons.math3.exception.TooManyEvaluationsException;
import org.apache.commons.math3.optim.ConvergenceChecker;
import org.apache.commons.math3.optim.InitialGuess;
import org.apache.commons.math3.optim.MaxEval;
import org.apache.commons.math3.optim.MaxIter;
import org.apache.commons.math3.optim.PointValuePair;
import org.apache.commons.math3.optim.SimpleBounds;
import org.apache.commons.math3.optim.SimplePointChecker;
import org.apache.commons.math3.optim.SimpleValueChecker;
import org.apache.commons.math3.optim.nonlinear.scalar.GoalType;
import org.apache.commons.math3.optim.nonlinear.scalar.ObjectiveFunction;
import org.apache.commons.math3.util.FastMath;
import org.junit.Assert;
import org.junit.Test;

public class PowellOptimizerTest {

    private static final double MIN_REL_TOL = 2 * FastMath.ulp(1d);

    // ==========================================
    // 1. Constructor Validation Tests
    // ==========================================

    @Test(expected = NumberIsTooSmallException.class)
    public void testConstructorRelTooSmall2Args() {
        new PowellOptimizer(MIN_REL_TOL - 1e-20, 1e-6);
    }

    @Test(expected = NumberIsTooSmallException.class)
    public void testConstructorRelTooSmall3Args() {
        new PowellOptimizer(MIN_REL_TOL - 1e-20, 1e-6, new SimplePointChecker<PointValuePair>(1e-3, 1e-3));
    }

    @Test(expected = NumberIsTooSmallException.class)
    public void testConstructorRelTooSmall4Args() {
        new PowellOptimizer(MIN_REL_TOL - 1e-20, 1e-6, 1e-6, 1e-6);
    }

    @Test(expected = NumberIsTooSmallException.class)
    public void testConstructorRelTooSmall5Args() {
        new PowellOptimizer(0.0, 1e-6, 1e-6, 1e-6, null);
    }

    @Test(expected = NotStrictlyPositiveException.class)
    public void testConstructorAbsZero() {
        new PowellOptimizer(1e-6, 0.0);
    }

    @Test(expected = NotStrictlyPositiveException.class)
    public void testConstructorAbsNegative() {
        new PowellOptimizer(1e-6, -1.0, 1e-6, 1e-6, null);
    }

    @Test
    public void testConstructorValidBoundary() {
        PowellOptimizer optimizer = new PowellOptimizer(MIN_REL_TOL, 1e-15);
        Assert.assertNotNull(optimizer);
    }

    // ==========================================
    // 2. Unsupported Bounds Parameter Tests
    // ==========================================

    @Test(expected = MathUnsupportedOperationException.class)
    public void testBoundsNotSupported() {
        PowellOptimizer optimizer = new PowellOptimizer(1e-6, 1e-6);
        MultivariateFunction f = new MultivariateFunction() {
            public double value(double[] point) {
                return point[0] * point[0];
            }
        };

        optimizer.optimize(
            new MaxEval(100),
            new ObjectiveFunction(f),
            GoalType.MINIMIZE,
            new InitialGuess(new double[] { 3.0 }),
            new SimpleBounds(new double[] { -10.0 }, new double[] { 10.0 })
        );
    }

    // ==========================================
    // 3. Optimization Logic & Branch Coverage Tests
    // ==========================================

    @Test
    public void test1DQuadraticMinimization() {
        PowellOptimizer optimizer = new PowellOptimizer(1e-8, 1e-8);
        MultivariateFunction f = new MultivariateFunction() {
            public double value(double[] point) {
                final double x = point[0];
                return (x - 4.0) * (x - 4.0) + 2.0;
            }
        };

        PointValuePair result = optimizer.optimize(
            new MaxEval(1000),
            new ObjectiveFunction(f),
            GoalType.MINIMIZE,
            new InitialGuess(new double[] { 10.0 })
        );

        Assert.assertEquals(4.0, result.getPoint()[0], 1e-4);
        Assert.assertEquals(2.0, result.getValue(), 1e-4);
        Assert.assertTrue(optimizer.getEvaluations() > 0);
        Assert.assertTrue(optimizer.getIterations() > 0);
    }

    @Test
    public void test1DQuadraticMaximization() {
        PowellOptimizer optimizer = new PowellOptimizer(1e-8, 1e-8);
        MultivariateFunction f = new MultivariateFunction() {
            public double value(double[] point) {
                final double x = point[0];
                return -(x + 5.0) * (x + 5.0) + 10.0;
            }
        };

        PointValuePair result = optimizer.optimize(
            new MaxEval(1000),
            new ObjectiveFunction(f),
            GoalType.MAXIMIZE,
            new InitialGuess(new double[] { 0.0 })
        );

        Assert.assertEquals(-5.0, result.getPoint()[0], 1e-4);
        Assert.assertEquals(10.0, result.getValue(), 1e-4);
    }

    @Test
    public void testRosenbrock2DMinimizationWithDirectionUpdates() {
        // Rosenbrock function: f(x, y) = (1 - x)^2 + 100 * (y - x^2)^2
        // Tests multidirectional line searches and direction replacements (fX > fX2 && t < 0)
        PowellOptimizer optimizer = new PowellOptimizer(1e-9, 1e-9, 1e-9, 1e-9);
        MultivariateFunction rosenbrock = new MultivariateFunction() {
            public double value(double[] x) {
                double a = 1.0 - x[0];
                double b = x[1] - x[0] * x[0];
                return a * a + 100.0 * b * b;
            }
        };

        PointValuePair optimum = optimizer.optimize(
            new MaxEval(5000),
            new ObjectiveFunction(rosenbrock),
            GoalType.MINIMIZE,
            new InitialGuess(new double[] { -1.2, 1.0 })
        );

        Assert.assertEquals(1.0, optimum.getPoint()[0], 1e-3);
        Assert.assertEquals(1.0, optimum.getPoint()[1], 1e-3);
        Assert.assertEquals(0.0, optimum.getValue(), 1e-4);
    }

    @Test
    public void testCustomConvergenceCheckerStopsEarly() {
        // Force the custom checker to stop early on the 2nd iteration
        ConvergenceChecker<PointValuePair> customChecker = new ConvergenceChecker<PointValuePair>() {
            public boolean converged(int iteration, PointValuePair previous, PointValuePair current) {
                return iteration >= 2;
            }
        };

        PowellOptimizer optimizer = new PowellOptimizer(1e-13, 1e-13, customChecker);
        MultivariateFunction f = new MultivariateFunction() {
            public double value(double[] x) {
                return x[0] * x[0] + x[1] * x[1] + x[2] * x[2];
            }
        };

        PointValuePair optimum = optimizer.optimize(
            new MaxEval(2000),
            new ObjectiveFunction(f),
            GoalType.MINIMIZE,
            new InitialGuess(new double[] { 50.0, -30.0, 20.0 })
        );

        Assert.assertNotNull(optimum);
        // Iterations should have stopped early via custom checker
        Assert.assertTrue(optimizer.getIterations() <= 5);
    }

    @Test
    public void testPowell4DFunction() {
        // Powell 4D Singular Function:
        // f(x) = (x0 + 10*x1)^2 + 5*(x2 - x3)^2 + (x1 - 2*x2)^4 + 10*(x0 - x3)^4
        PowellOptimizer optimizer = new PowellOptimizer(1e-8, 1e-8, new SimpleValueChecker(1e-7, 1e-7));
        MultivariateFunction f = new MultivariateFunction() {
            public double value(double[] x) {
                double t1 = x[0] + 10.0 * x[1];
                double t2 = x[2] - x[3];
                double t3 = x[1] - 2.0 * x[2];
                double t4 = x[0] - x[3];
                return t1 * t1 + 5.0 * t2 * t2 + t3 * t3 * t3 * t3 + 10.0 * t4 * t4 * t4 * t4;
            }
        };

        PointValuePair optimum = optimizer.optimize(
            new MaxEval(10000),
            new MaxIter(2000),
            new ObjectiveFunction(f),
            GoalType.MINIMIZE,
            new InitialGuess(new double[] { 3.0, -1.0, 0.0, 1.0 })
        );

        Assert.assertEquals(0.0, optimum.getValue(), 1e-3);
        for (int i = 0; i < 4; i++) {
            Assert.assertEquals(0.0, optimum.getPoint()[i], 0.1);
        }
    }

    @Test(expected = TooManyEvaluationsException.class)
    public void testMaxEvaluationsExceeded() {
        PowellOptimizer optimizer = new PowellOptimizer(1e-9, 1e-9);
        MultivariateFunction f = new MultivariateFunction() {
            public double value(double[] x) {
                return (x[0] - 100.0) * (x[0] - 100.0) + (x[1] - 100.0) * (x[1] - 100.0);
            }
        };

        // Strict limit of 5 evaluations to ensure TooManyEvaluationsException is thrown
        optimizer.optimize(
            new MaxEval(5),
            new ObjectiveFunction(f),
            GoalType.MINIMIZE,
            new InitialGuess(new double[] { 0.0, 0.0 })
        );
    }
}