package org.apache.commons.math3.optim.nonlinear.vector.jacobian;

import org.apache.commons.math3.analysis.MultivariateMatrixFunction;
import org.apache.commons.math3.analysis.MultivariateVectorFunction;
import org.apache.commons.math3.exception.ConvergenceException;
import org.apache.commons.math3.exception.MathUnsupportedOperationException;
import org.apache.commons.math3.optim.ConvergenceChecker;
import org.apache.commons.math3.optim.InitialGuess;
import org.apache.commons.math3.optim.MaxEval;
import org.apache.commons.math3.optim.MaxIter;
import org.apache.commons.math3.optim.PointVectorValuePair;
import org.apache.commons.math3.optim.SimpleBounds;
import org.apache.commons.math3.optim.nonlinear.vector.ModelFunction;
import org.apache.commons.math3.optim.nonlinear.vector.ModelFunctionJacobian;
import org.apache.commons.math3.optim.nonlinear.vector.Target;
import org.apache.commons.math3.optim.nonlinear.vector.Weight;
import org.apache.commons.math3.util.Precision;
import org.junit.Assert;
import org.junit.Test;

/**
 * High-coverage unit tests for LevenbergMarquardtOptimizer focusing on edge cases,
 * boundary limits, and branch coverage.
 */
public class LevenbergMarquardtOptimizerTest {

    @Test
    public void testConstructors() {
        LevenbergMarquardtOptimizer opt1 = new LevenbergMarquardtOptimizer();
        Assert.assertNotNull(opt1);

        LevenbergMarquardtOptimizer opt2 = new LevenbergMarquardtOptimizer(1e-6, 1e-6, 1e-6);
        Assert.assertNotNull(opt2);

        LevenbergMarquardtOptimizer opt3 = new LevenbergMarquardtOptimizer(50.0, 1e-8, 1e-8, 1e-8, 1e-12);
        Assert.assertNotNull(opt3);

        ConvergenceChecker<PointVectorValuePair> customChecker = new ConvergenceChecker<PointVectorValuePair>() {
            @Override
            public boolean converged(int iteration, PointVectorValuePair previous, PointVectorValuePair current) {
                return iteration >= 1;
            }
        };
        LevenbergMarquardtOptimizer opt4 = new LevenbergMarquardtOptimizer(customChecker);
        Assert.assertNotNull(opt4);

        LevenbergMarquardtOptimizer opt5 = new LevenbergMarquardtOptimizer(100.0, customChecker, 1e-6, 1e-6, 1e-6, 1e-10);
        Assert.assertNotNull(opt5);
    }

    @Test(expected = MathUnsupportedOperationException.class)
    public void testBoundsNotSupportedLower() {
        LevenbergMarquardtOptimizer optimizer = new LevenbergMarquardtOptimizer();
        optimizer.optimize(
            new MaxEval(100),
            new MaxIter(100),
            new Target(new double[]{1.0}),
            new Weight(new double[]{1.0}),
            new InitialGuess(new double[]{0.0}),
            new SimpleBounds(new double[]{0.0}, new double[]{Double.POSITIVE_INFINITY}),
            new ModelFunction(new MultivariateVectorFunction() {
                public double[] value(double[] point) { return new double[]{point[0]}; }
            }),
            new ModelFunctionJacobian(new MultivariateMatrixFunction() {
                public double[][] value(double[] point) { return new double[][]{{1.0}}; }
            })
        );
    }

    @Test(expected = ConvergenceException.class)
    public void testQrDecompositionWithNaNJacobian() {
        LevenbergMarquardtOptimizer optimizer = new LevenbergMarquardtOptimizer();
        optimizer.optimize(
            new MaxEval(100),
            new MaxIter(100),
            new Target(new double[]{1.0}),
            new Weight(new double[]{1.0}),
            new InitialGuess(new double[]{0.0}),
            new ModelFunction(new MultivariateVectorFunction() {
                public double[] value(double[] point) { return new double[]{0.0}; }
            }),
            new ModelFunctionJacobian(new MultivariateMatrixFunction() {
                public double[][] value(double[] point) { return new double[][]{{Double.NaN}}; }
            })
        );
    }

    @Test(expected = ConvergenceException.class)
    public void testQrDecompositionWithInfiniteJacobian() {
        LevenbergMarquardtOptimizer optimizer = new LevenbergMarquardtOptimizer();
        optimizer.optimize(
            new MaxEval(100),
            new MaxIter(100),
            new Target(new double[]{1.0}),
            new Weight(new double[]{1.0}),
            new InitialGuess(new double[]{0.0}),
            new ModelFunction(new MultivariateVectorFunction() {
                public double[] value(double[] point) { return new double[]{0.0}; }
            }),
            new ModelFunctionJacobian(new MultivariateMatrixFunction() {
                public double[][] value(double[] point) { return new double[][]{{Double.POSITIVE_INFINITY}}; }
            })
        );
    }

    @Test
    public void testImmediateConvergenceZeroCost() {
        LevenbergMarquardtOptimizer optimizer = new LevenbergMarquardtOptimizer();
        PointVectorValuePair optimum = optimizer.optimize(
            new MaxEval(100),
            new MaxIter(100),
            new Target(new double[]{2.0, 3.0}),
            new Weight(new double[]{1.0, 1.0}),
            new InitialGuess(new double[]{2.0, 3.0}),
            new ModelFunction(new MultivariateVectorFunction() {
                public double[] value(double[] point) {
                    return new double[]{point[0], point[1]};
                }
            }),
            new ModelFunctionJacobian(new MultivariateMatrixFunction() {
                public double[][] value(double[] point) {
                    return new double[][]{
                        {1.0, 0.0},
                        {0.0, 1.0}
                    };
                }
            })
        );
        Assert.assertEquals(0.0, optimizer.getCost(), 1e-12);
        Assert.assertEquals(2.0, optimum.getPoint()[0], 1e-12);
        Assert.assertEquals(3.0, optimum.getPoint()[1], 1e-12);
    }

    @Test
    public void testCustomConvergenceChecker() {
        ConvergenceChecker<PointVectorValuePair> earlyStopChecker = new ConvergenceChecker<PointVectorValuePair>() {
            @Override
            public boolean converged(int iteration, PointVectorValuePair previous, PointVectorValuePair current) {
                return iteration >= 1;
            }
        };

        LevenbergMarquardtOptimizer optimizer = new LevenbergMarquardtOptimizer(earlyStopChecker);
        PointVectorValuePair optimum = optimizer.optimize(
            new MaxEval(100),
            new MaxIter(100),
            new Target(new double[]{10.0, 20.0}),
            new Weight(new double[]{1.0, 1.0}),
            new InitialGuess(new double[]{0.0, 0.0}),
            new ModelFunction(new MultivariateVectorFunction() {
                public double[] value(double[] point) {
                    return new double[]{point[0], point[1]};
                }
            }),
            new ModelFunctionJacobian(new MultivariateMatrixFunction() {
                public double[][] value(double[] point) {
                    return new double[][]{
                        {1.0, 0.0},
                        {0.0, 1.0}
                    };
                }
            })
        );
        Assert.assertNotNull(optimum);
        Assert.assertEquals(10.0, optimum.getPoint()[0], 1e-6);
        Assert.assertEquals(20.0, optimum.getPoint()[1], 1e-6);
    }

    @Test
    public void testRankDeficientJacobian() {
        // High threshold forces columns to be considered zero -> rank deficiency
        LevenbergMarquardtOptimizer optimizer = new LevenbergMarquardtOptimizer(100.0, 1e-10, 1e-10, 1e-10, 10.0);
        PointVectorValuePair optimum = optimizer.optimize(
            new MaxEval(100),
            new MaxIter(100),
            new Target(new double[]{1.0, 2.0}),
            new Weight(new double[]{1.0, 1.0}),
            new InitialGuess(new double[]{1.0, 1.0}),
            new ModelFunction(new MultivariateVectorFunction() {
                public double[] value(double[] point) {
                    return new double[]{point[0] + point[1], point[0] + point[1]};
                }
            }),
            new ModelFunctionJacobian(new MultivariateMatrixFunction() {
                public double[][] value(double[] point) {
                    return new double[][]{
                        {1.0, 1.0},
                        {1.0, 1.0}
                    };
                }
            })
        );
        Assert.assertNotNull(optimum);
    }

    @Test
    public void testNonLinearOptimizationWithFailedSteps() {
        // Rosenbrock function simulation to trigger both successful and failed iterations
        LevenbergMarquardtOptimizer optimizer = new LevenbergMarquardtOptimizer(100.0, 1e-10, 1e-10, 1e-10, Precision.SAFE_MIN);
        
        PointVectorValuePair optimum = optimizer.optimize(
            new MaxEval(500),
            new MaxIter(500),
            new Target(new double[]{0.0, 0.0}),
            new Weight(new double[]{1.0, 1.0}),
            new InitialGuess(new double[]{-1.2, 1.0}),
            new ModelFunction(new MultivariateVectorFunction() {
                public double[] value(double[] point) {
                    double x = point[0];
                    double y = point[1];
                    return new double[]{10.0 * (y - x * x), 1.0 - x};
                }
            }),
            new ModelFunctionJacobian(new MultivariateMatrixFunction() {
                public double[][] value(double[] point) {
                    double x = point[0];
                    return new double[][]{
                        {-20.0 * x, 10.0},
                        {-1.0, 0.0}
                    };
                }
            })
        );
        Assert.assertEquals(1.0, optimum.getPoint()[0], 1e-4);
        Assert.assertEquals(1.0, optimum.getPoint()[1], 1e-4);
    }

    @Test
    public void testOverDeterminedSystem() {
        // More observations (3) than parameters (2)
        LevenbergMarquardtOptimizer optimizer = new LevenbergMarquardtOptimizer();
        PointVectorValuePair optimum = optimizer.optimize(
            new MaxEval(100),
            new MaxIter(100),
            new Target(new double[]{2.0, 4.0, 6.0}),
            new Weight(new double[]{1.0, 1.0, 1.0}),
            new InitialGuess(new double[]{0.0, 0.0}),
            new ModelFunction(new MultivariateVectorFunction() {
                public double[] value(double[] p) {
                    return new double[]{
                        p[0] + p[1],
                        2.0 * p[0] + p[1],
                        3.0 * p[0] + p[1]
                    };
                }
            }),
            new ModelFunctionJacobian(new MultivariateMatrixFunction() {
                public double[][] value(double[] p) {
                    return new double[][]{
                        {1.0, 1.0},
                        {2.0, 1.0},
                        {3.0, 1.0}
                    };
                }
            })
        );
        Assert.assertEquals(2.0, optimum.getPoint()[0], 1e-6);
        Assert.assertEquals(0.0, optimum.getPoint()[1], 1e-6);
    }

    @Test(expected = ConvergenceException.class)
    public void testTooSmallCostRelativeTolerance() {
        // Zero tolerance triggers ConvergenceException for machine precision boundary
        LevenbergMarquardtOptimizer optimizer = new LevenbergMarquardtOptimizer(100.0, 0.0, 0.0, 0.0, Precision.SAFE_MIN);
        optimizer.optimize(
            new MaxEval(100),
            new MaxIter(100),
            new Target(new double[]{1.0}),
            new Weight(new double[]{1.0}),
            new InitialGuess(new double[]{1.0}),
            new ModelFunction(new MultivariateVectorFunction() {
                public double[] value(double[] point) { return new double[]{point[0]}; }
            }),
            new ModelFunctionJacobian(new MultivariateMatrixFunction() {
                public double[][] value(double[] point) { return new double[][]{{1.0}}; }
            })
        );
    }
}