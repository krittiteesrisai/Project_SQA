package org.apache.commons.math3.optim.nonlinear.scalar.noderiv;

import java.util.List;
import org.apache.commons.math3.analysis.MultivariateFunction;
import org.apache.commons.math3.exception.DimensionMismatchException;
import org.apache.commons.math3.exception.NotPositiveException;
import org.apache.commons.math3.exception.NotStrictlyPositiveException;
import org.apache.commons.math3.exception.OutOfRangeException;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.optim.InitialGuess;
import org.apache.commons.math3.optim.MaxEval;
import org.apache.commons.math3.optim.PointValuePair;
import org.apache.commons.math3.optim.SimpleBounds;
import org.apache.commons.math3.optim.SimplePointChecker;
import org.apache.commons.math3.optim.SimpleValueChecker;
import org.apache.commons.math3.optim.nonlinear.scalar.GoalType;
import org.apache.commons.math3.optim.nonlinear.scalar.ObjectiveFunction;
import org.apache.commons.math3.random.MersenneTwister;
import org.apache.commons.math3.random.RandomGenerator;
import org.junit.Assert;
import org.junit.Test;

public class CMAESOptimizerTest {

    private final MultivariateFunction sphere = new MultivariateFunction() {
        public double value(double[] point) {
            double sum = 0;
            for (double x : point) {
                sum += x * x;
            }
            return sum;
        }
    };

    private final MultivariateFunction rosenbrock = new MultivariateFunction() {
        public double value(double[] x) {
            double f = 0;
            for (int i = 0; i < x.length - 1; i++) {
                f += 100 * Math.pow(x[i + 1] - x[i] * x[i], 2) + Math.pow(1 - x[i], 2);
            }
            return f;
        }
    };

    @Test(expected = NotPositiveException.class)
    public void testSigmaNegativeValueThrowsException() {
        new CMAESOptimizer.Sigma(new double[] { 1.0, -0.5, 2.0 });
    }

    @Test
    public void testSigmaValid() {
        double[] s = new double[] { 0.5, 1.5 };
        CMAESOptimizer.Sigma sigma = new CMAESOptimizer.Sigma(s);
        Assert.assertArrayEquals(s, sigma.getSigma(), 1e-9);
    }

    @Test(expected = NotStrictlyPositiveException.class)
    public void testPopulationSizeZeroThrowsException() {
        new CMAESOptimizer.PopulationSize(0);
    }

    @Test(expected = NotStrictlyPositiveException.class)
    public void testPopulationSizeNegativeThrowsException() {
        new CMAESOptimizer.PopulationSize(-5);
    }

    @Test
    public void testPopulationSizeValid() {
        CMAESOptimizer.PopulationSize pop = new CMAESOptimizer.PopulationSize(10);
        Assert.assertEquals(10, pop.getPopulationSize());
    }

    @Test(expected = DimensionMismatchException.class)
    public void testInputSigmaDimensionMismatch() {
        RandomGenerator rng = new MersenneTwister(42);
        CMAESOptimizer optimizer = new CMAESOptimizer(100, 1e-6, true, 0, 0, rng, false, null);
        optimizer.optimize(
            new MaxEval(1000),
            new ObjectiveFunction(sphere),
            GoalType.MINIMIZE,
            new InitialGuess(new double[] { 1.0, 2.0 }),
            new CMAESOptimizer.Sigma(new double[] { 0.5 }), // Dim 1 vs Dim 2
            new CMAESOptimizer.PopulationSize(10)
        );
    }

    @Test(expected = OutOfRangeException.class)
    public void testInputSigmaExceedsBoundsRange() {
        RandomGenerator rng = new MersenneTwister(42);
        CMAESOptimizer optimizer = new CMAESOptimizer(100, 1e-6, true, 0, 0, rng, false, null);
        optimizer.optimize(
            new MaxEval(1000),
            new ObjectiveFunction(sphere),
            GoalType.MINIMIZE,
            new InitialGuess(new double[] { 0.5 }),
            new SimpleBounds(new double[] { 0.0 }, new double[] { 1.0 }),
            new CMAESOptimizer.Sigma(new double[] { 1.5 }), // Sigma > (1.0 - 0.0)
            new CMAESOptimizer.PopulationSize(5)
        );
    }

    @Test(expected = NotStrictlyPositiveException.class)
    public void testInitializeCMAZeroLambdaWithoutPopulationSize() {
        RandomGenerator rng = new MersenneTwister(42);
        // Default lambda becomes 0 if not provided
        CMAESOptimizer optimizer = new CMAESOptimizer(100, 1e-6, true, 0, 0, rng, false, null);
        optimizer.optimize(
            new MaxEval(1000),
            new ObjectiveFunction(sphere),
            GoalType.MINIMIZE,
            new InitialGuess(new double[] { 1.0, 2.0 }),
            new CMAESOptimizer.Sigma(new double[] { 0.5, 0.5 })
        );
    }

    @Test
    public void testOptimizeMinimizeWithFullCovariance() {
        RandomGenerator rng = new MersenneTwister(123456);
        CMAESOptimizer optimizer = new CMAESOptimizer(300, 1e-10, true, 0, 0, rng, true,
                new SimplePointChecker<PointValuePair>(1e-6, 1e-6));

        PointValuePair result = optimizer.optimize(
            new MaxEval(10000),
            new ObjectiveFunction(sphere),
            GoalType.MINIMIZE,
            new InitialGuess(new double[] { 2.0, -3.0 }),
            new CMAESOptimizer.Sigma(new double[] { 1.0, 1.0 }),
            new CMAESOptimizer.PopulationSize(10)
        );

        Assert.assertEquals(0.0, result.getValue(), 1e-2);
        Assert.assertEquals(0.0, result.getPoint()[0], 1e-1);
        Assert.assertEquals(0.0, result.getPoint()[1], 1e-1);

        // Verify statistics histories
        List<Double> sigmaHist = optimizer.getStatisticsSigmaHistory();
        List<Double> fitHist = optimizer.getStatisticsFitnessHistory();
        List<RealMatrix> meanHist = optimizer.getStatisticsMeanHistory();
        List<RealMatrix> dHist = optimizer.getStatisticsDHistory();

        Assert.assertNotNull(sigmaHist);
        Assert.assertNotNull(fitHist);
        Assert.assertNotNull(meanHist);
        Assert.assertNotNull(dHist);
        Assert.assertTrue(!sigmaHist.isEmpty());
    }

    @Test
    public void testOptimizeMaximizeNonActiveCMA() {
        RandomGenerator rng = new MersenneTwister(654321);
        MultivariateFunction invertedSphere = new MultivariateFunction() {
            public double value(double[] point) {
                return -(point[0] * point[0] + point[1] * point[1]);
            }
        };

        // isActiveCMA = false, Checker = null
        CMAESOptimizer optimizer = new CMAESOptimizer(200, 0.0, false, 0, 0, rng, false, null);

        PointValuePair result = optimizer.optimize(
            new MaxEval(10000),
            new ObjectiveFunction(invertedSphere),
            GoalType.MAXIMIZE,
            new InitialGuess(new double[] { 1.0, 1.0 }),
            new CMAESOptimizer.Sigma(new double[] { 0.5, 0.5 }),
            new CMAESOptimizer.PopulationSize(10)
        );

        Assert.assertEquals(0.0, result.getValue(), 1e-2);
    }

    @Test
    public void testOptimizeDiagonalOnlyMode() {
        RandomGenerator rng = new MersenneTwister(98765);
        // diagonalOnly = 1 keeps diagonal covariance matrix
        CMAESOptimizer optimizer = new CMAESOptimizer(200, 1e-8, true, 1, 0, rng, false,
                new SimpleValueChecker(1e-5, 1e-5));

        PointValuePair result = optimizer.optimize(
            new MaxEval(10000),
            new ObjectiveFunction(sphere),
            GoalType.MINIMIZE,
            new InitialGuess(new double[] { 1.5, 2.5 }),
            new CMAESOptimizer.Sigma(new double[] { 0.8, 0.8 }),
            new CMAESOptimizer.PopulationSize(10)
        );

        Assert.assertTrue(result.getValue() < 1e-2);
    }

    @Test
    public void testOptimizeDiagonalOnlyTransition() {
        RandomGenerator rng = new MersenneTwister(777);
        // diagonalOnly = 2 (transitions to full covariance after 2 iterations)
        CMAESOptimizer optimizer = new CMAESOptimizer(200, 1e-8, true, 2, 0, rng, false, null);

        PointValuePair result = optimizer.optimize(
            new MaxEval(10000),
            new ObjectiveFunction(sphere),
            GoalType.MINIMIZE,
            new InitialGuess(new double[] { 1.0, -1.0 }),
            new CMAESOptimizer.Sigma(new double[] { 0.5, 0.5 }),
            new CMAESOptimizer.PopulationSize(10)
        );

        Assert.assertTrue(result.getValue() < 1e-2);
    }

    @Test
    public void testOptimizeBoundedWithFeasibleRetry() {
        RandomGenerator rng = new MersenneTwister(42);
        // checkFeasableCount = 5 allows retrying sampling within boundaries
        CMAESOptimizer optimizer = new CMAESOptimizer(250, 1e-8, true, 0, 5, rng, false, null);

        PointValuePair result = optimizer.optimize(
            new MaxEval(10000),
            new ObjectiveFunction(rosenbrock),
            GoalType.MINIMIZE,
            new InitialGuess(new double[] { -1.2, 1.0 }),
            new SimpleBounds(new double[] { -2.0, -2.0 }, new double[] { 2.0, 2.0 }),
            new CMAESOptimizer.Sigma(new double[] { 0.5, 0.5 }),
            new CMAESOptimizer.PopulationSize(12)
        );

        Assert.assertTrue(result.getPoint()[0] >= -2.0 && result.getPoint()[0] <= 2.0);
        Assert.assertTrue(result.getPoint()[1] >= -2.0 && result.getPoint()[1] <= 2.0);
    }

    @Test
    public void testOptimizeStopFitnessReached() {
        RandomGenerator rng = new MersenneTwister(42);
        // stopFitness = 0.5 (stops immediately once value <= 0.5)
        CMAESOptimizer optimizer = new CMAESOptimizer(500, 0.5, true, 0, 0, rng, false, null);

        PointValuePair result = optimizer.optimize(
            new MaxEval(10000),
            new ObjectiveFunction(sphere),
            GoalType.MINIMIZE,
            new InitialGuess(new double[] { 2.0, 2.0 }),
            new CMAESOptimizer.Sigma(new double[] { 0.5, 0.5 }),
            new CMAESOptimizer.PopulationSize(10)
        );

        Assert.assertTrue(result.getValue() <= 0.5);
    }

    @Test
    public void testOptimizeMaxEvalExceeded() {
        RandomGenerator rng = new MersenneTwister(42);
        // Small MaxEval to test graceful/early loop exit via TooManyEvaluationsException
        CMAESOptimizer optimizer = new CMAESOptimizer(500, 1e-12, true, 0, 0, rng, false, null);

        PointValuePair result = optimizer.optimize(
            new MaxEval(15),
            new ObjectiveFunction(rosenbrock),
            GoalType.MINIMIZE,
            new InitialGuess(new double[] { 5.0, 5.0 }),
            new CMAESOptimizer.Sigma(new double[] { 1.0, 1.0 }),
            new CMAESOptimizer.PopulationSize(10)
        );

        Assert.assertNotNull(result);
    }
}