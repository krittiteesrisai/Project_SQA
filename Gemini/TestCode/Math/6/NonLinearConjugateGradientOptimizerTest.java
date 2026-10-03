package org.apache.commons.math3.optim.nonlinear.scalar.gradient;

import org.apache.commons.math3.analysis.MultivariateFunction;
import org.apache.commons.math3.analysis.MultivariateVectorFunction;
import org.apache.commons.math3.analysis.solvers.BrentSolver;
import org.apache.commons.math3.exception.MathIllegalStateException;
import org.apache.commons.math3.exception.MathUnsupportedOperationException;
import org.apache.commons.math3.exception.TooManyEvaluationsException;
import org.apache.commons.math3.optim.InitialGuess;
import org.apache.commons.math3.optim.MaxEval;
import org.apache.commons.math3.optim.MaxIter;
import org.apache.commons.math3.optim.PointValuePair;
import org.apache.commons.math3.optim.SimpleBounds;
import org.apache.commons.math3.optim.SimplePointChecker;
import org.apache.commons.math3.optim.SimpleValueChecker;
import org.apache.commons.math3.optim.nonlinear.scalar.GoalType;
import org.apache.commons.math3.optim.nonlinear.scalar.ObjectiveFunction;
import org.apache.commons.math3.optim.nonlinear.scalar.ObjectiveFunctionGradient;
import org.junit.Assert;
import org.junit.Test;

/**
 * High-coverage unit test suite for NonLinearConjugateGradientOptimizer.
 */
public class NonLinearConjugateGradientOptimizerTest {

    // Target 2D Quadratic Function: f(x, y) = 3*(x - 2)^2 + 4*(y + 3)^2 + 5
    // Minimum at (2, -3) with value 5
    private static class Quadratic2D implements MultivariateFunction {
        public double value(double[] point) {
            double x = point[0] - 2.0;
            double y = point[1] + 3.0;
            return 3.0 * x * x + 4.0 * y * y + 5.0;
        }
    }

    private static class Quadratic2DGradient implements MultivariateVectorFunction {
        public double[] value(double[] point) {
            double[] grad = new double[2];
            grad[0] = 6.0 * (point[0] - 2.0);
            grad[1] = 8.0 * (point[1] + 3.0);
            return grad;
        }
    }

    // Strictly monotonic linear function along positive ray to trigger bracket failure
    private static class MonotonicLinear implements MultivariateFunction {
        public double value(double[] point) {
            return point[0] * 2.0 + 1.0;
        }
    }

    private static class MonotonicLinearGradient implements MultivariateVectorFunction {
        public double[] value(double[] point) {
            return new double[]{ 2.0 };
        }
    }

    @Test
    public void testOptimizeMinimizationFletcherReeves() {
        NonLinearConjugateGradientOptimizer optimizer =
            new NonLinearConjugateGradientOptimizer(
                NonLinearConjugateGradientOptimizer.Formula.FLETCHER_REEVES,
                new SimpleValueChecker(1e-10, 1e-10)
            );

        PointValuePair optimum = optimizer.optimize(
            new MaxEval(200),
            new MaxIter(100),
            GoalType.MINIMIZE,
            new InitialGuess(new double[]{ 10.0, -10.0 }),
            new ObjectiveFunction(new Quadratic2D()),
            new ObjectiveFunctionGradient(new Quadratic2DGradient()),
            new NonLinearConjugateGradientOptimizer.BracketingStep(0.5)
        );

        Assert.assertEquals(2.0, optimum.getPoint()[0], 1e-5);
        Assert.assertEquals(-3.0, optimum.getPoint()[1], 1e-5);
        Assert.assertEquals(5.0, optimum.getValue(), 1e-5);
    }

    @Test
    public void testOptimizeMinimizationPolakRibiere() {
        NonLinearConjugateGradientOptimizer optimizer =
            new NonLinearConjugateGradientOptimizer(
                NonLinearConjugateGradientOptimizer.Formula.POLAK_RIBIERE,
                new SimpleValueChecker(1e-10, 1e-10),
                new BrentSolver(1e-12, 1e-12)
            );

        PointValuePair optimum = optimizer.optimize(
            new MaxEval(200),
            new MaxIter(100),
            GoalType.MINIMIZE,
            new InitialGuess(new double[]{ -5.0, 5.0 }),
            new ObjectiveFunction(new Quadratic2D()),
            new ObjectiveFunctionGradient(new Quadratic2DGradient())
        );

        Assert.assertEquals(2.0, optimum.getPoint()[0], 1e-5);
        Assert.assertEquals(-3.0, optimum.getPoint()[1], 1e-5);
        Assert.assertEquals(5.0, optimum.getValue(), 1e-5);
    }

    @Test
    public void testOptimizeMaximization() {
        // Inverted Quadratic for Maximization: f(x, y) = - (3*(x - 2)^2 + 4*(y + 3)^2) + 10
        MultivariateFunction negQuad = new MultivariateFunction() {
            public double value(double[] point) {
                double x = point[0] - 2.0;
                double y = point[1] + 3.0;
                return -(3.0 * x * x + 4.0 * y * y) + 10.0;
            }
        };

        MultivariateVectorFunction negGrad = new MultivariateVectorFunction() {
            public double[] value(double[] point) {
                return new double[]{
                    -6.0 * (point[0] - 2.0),
                    -8.0 * (point[1] + 3.0)
                };
            }
        };

        NonLinearConjugateGradientOptimizer optimizer =
            new NonLinearConjugateGradientOptimizer(
                NonLinearConjugateGradientOptimizer.Formula.POLAK_RIBIERE,
                new SimplePointChecker<PointValuePair>(1e-10, 1e-10)
            );

        PointValuePair optimum = optimizer.optimize(
            new MaxEval(200),
            new MaxIter(100),
            GoalType.MAXIMIZE,
            new InitialGuess(new double[]{ 0.0, 0.0 }),
            new ObjectiveFunction(negQuad),
            new ObjectiveFunctionGradient(negGrad)
        );

        Assert.assertEquals(2.0, optimum.getPoint()[0], 1e-5);
        Assert.assertEquals(-3.0, optimum.getPoint()[1], 1e-5);
        Assert.assertEquals(10.0, optimum.getValue(), 1e-5);
    }

    @Test
    public void testCustomPreconditionerAndFullConstructor() {
        Preconditioner customPreconditioner = new Preconditioner() {
            public double[] precondition(double[] variables, double[] r) {
                double[] p = new double[r.length];
                for (int i = 0; i < r.length; i++) {
                    p[i] = r[i] * 0.5; // Scale gradient
                }
                return p;
            }
        };

        NonLinearConjugateGradientOptimizer optimizer =
            new NonLinearConjugateGradientOptimizer(
                NonLinearConjugateGradientOptimizer.Formula.POLAK_RIBIERE,
                new SimpleValueChecker(1e-10, 1e-10),
                new BrentSolver(),
                customPreconditioner
            );

        PointValuePair optimum = optimizer.optimize(
            new MaxEval(300),
            new MaxIter(150),
            GoalType.MINIMIZE,
            new InitialGuess(new double[]{ 4.0, -1.0 }),
            new ObjectiveFunction(new Quadratic2D()),
            new ObjectiveFunctionGradient(new Quadratic2DGradient())
        );

        Assert.assertEquals(2.0, optimum.getPoint()[0], 1e-5);
        Assert.assertEquals(-3.0, optimum.getPoint()[1], 1e-5);
    }

    @Test
    public void testIdentityPreconditionerDirectly() {
        NonLinearConjugateGradientOptimizer.IdentityPreconditioner identity =
            new NonLinearConjugateGradientOptimizer.IdentityPreconditioner();
        double[] r = new double[]{ 1.5, -2.5, 3.0 };
        double[] result = identity.precondition(new double[]{ 0.0, 0.0, 0.0 }, r);

        Assert.assertArrayEquals(r, result, 1e-15);
        Assert.assertNotSame(r, result); // Ensure clone is created
    }

    @Test
    public void testBracketingStepGetter() {
        NonLinearConjugateGradientOptimizer.BracketingStep step =
            new NonLinearConjugateGradientOptimizer.BracketingStep(2.75);
        Assert.assertEquals(2.75, step.getBracketingStep(), 1e-15);
    }

    @Test(expected = MathUnsupportedOperationException.class)
    public void testBoundsNotSupportedThrowsException() {
        NonLinearConjugateGradientOptimizer optimizer =
            new NonLinearConjugateGradientOptimizer(
                NonLinearConjugateGradientOptimizer.Formula.FLETCHER_REEVES,
                new SimpleValueChecker(1e-6, 1e-6)
            );

        optimizer.optimize(
            new MaxEval(100),
            GoalType.MINIMIZE,
            new InitialGuess(new double[]{ 0.0, 0.0 }),
            new ObjectiveFunction(new Quadratic2D()),
            new ObjectiveFunctionGradient(new Quadratic2DGradient()),
            new SimpleBounds(new double[]{ -1.0, -1.0 }, new double[]{ 1.0, 1.0 })
        );
    }

    @Test(expected = MathIllegalStateException.class)
    public void testLineSearchBracketFailureThrowsException() {
        NonLinearConjugateGradientOptimizer optimizer =
            new NonLinearConjugateGradientOptimizer(
                NonLinearConjugateGradientOptimizer.Formula.FLETCHER_REEVES,
                new SimpleValueChecker(1e-10, 1e-10)
            );

        // Constant positive gradient along positive search step -> cannot bracket root
        optimizer.optimize(
            new MaxEval(100),
            GoalType.MINIMIZE,
            new InitialGuess(new double[]{ 0.0 }),
            new ObjectiveFunction(new MonotonicLinear()),
            new ObjectiveFunctionGradient(new MonotonicLinearGradient())
        );
    }

    @Test(expected = TooManyEvaluationsException.class)
    public void testTooManyEvaluationsThrowsException() {
        NonLinearConjugateGradientOptimizer optimizer =
            new NonLinearConjugateGradientOptimizer(
                NonLinearConjugateGradientOptimizer.Formula.FLETCHER_REEVES,
                new SimpleValueChecker(1e-15, 1e-15)
            );

        optimizer.optimize(
            new MaxEval(1), // Allow only 1 evaluation to force exception
            GoalType.MINIMIZE,
            new InitialGuess(new double[]{ 100.0, 100.0 }),
            new ObjectiveFunction(new Quadratic2D()),
            new ObjectiveFunctionGradient(new Quadratic2DGradient())
        );
    }
}