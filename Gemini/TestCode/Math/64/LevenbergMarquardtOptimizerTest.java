package org.apache.commons.math.optimization.general;

import org.apache.commons.math.FunctionEvaluationException;
import org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction;
import org.apache.commons.math.analysis.MultivariateMatrixFunction;
import org.apache.commons.math.optimization.OptimizationException;
import org.apache.commons.math.optimization.SimpleVectorialValueChecker;
import org.apache.commons.math.optimization.VectorialConvergenceChecker;
import org.apache.commons.math.optimization.VectorialPointValuePair;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.Serializable;
import java.util.Arrays;

/**
 * High-coverage unit tests for LevenbergMarquardtOptimizer targeting boundary limits,
 * rank-deficiency, convergence conditions, and edge cases.
 */
public class LevenbergMarquardtOptimizerTest {

    private LevenbergMarquardtOptimizer optimizer;

    @Before
    public void setUp() {
        optimizer = new LevenbergMarquardtOptimizer();
    }

    /**
     * Test basic optimization with default parameters on a simple linear problem (Over-determined system).
     */
    @Test
    public void testSimpleLinearOptimization() throws OptimizationException, FunctionEvaluationException {
        // Model: f_i(x, y) = x * t_i + y
        final double[] t = {1.0, 2.0, 3.0, 4.0, 5.0};
        final double[] target = {3.0, 5.0, 7.0, 9.0, 11.0}; // x=2, y=1
        final double[] weights = {1.0, 1.0, 1.0, 1.0, 1.0};

        DifferentiableMultivariateVectorialFunction function = new DifferentiableMultivariateVectorialFunction() {
            public double[] value(double[] point) {
                double[] values = new double[t.length];
                for (int i = 0; i < t.length; i++) {
                    values[i] = point[0] * t[i] + point[1];
                }
                return values;
            }

            public MultivariateMatrixFunction jacobian() {
                return new MultivariateMatrixFunction() {
                    public double[][] value(double[] point) {
                        double[][] jac = new double[t.length][2];
                        for (int i = 0; i < t.length; i++) {
                            jac[i][0] = t[i];
                            jac[i][1] = 1.0;
                        }
                        return jac;
                    }
                };
            }
        };

        VectorialPointValuePair optimum = optimizer.optimize(
                function, target, weights, new double[]{0.0, 0.0});

        Assert.assertEquals(2.0, optimum.getPointRef()[0], 1e-6);
        Assert.assertEquals(1.0, optimum.getPointRef()[1], 1e-6);
        Assert.assertEquals(0.0, optimizer.getRMS(), 1e-6);
    }

    /**
     * Test when the initial starting point is already optimal (Zero Cost & Perfect Orthogonality branch).
     */
    @Test
    public void testInitialPointAlreadyOptimal() throws OptimizationException, FunctionEvaluationException {
        DifferentiableMultivariateVectorialFunction function = new DifferentiableMultivariateVectorialFunction() {
            public double[] value(double[] point) {
                return new double[]{point[0] - 5.0, point[1] - 10.0};
            }

            public MultivariateMatrixFunction jacobian() {
                return new MultivariateMatrixFunction() {
                    public double[][] value(double[] point) {
                        return new double[][]{
                                {1.0, 0.0},
                                {0.0, 1.0}
                        };
                    }
                };
            }
        };

        // Starting point is the exact target
        VectorialPointValuePair optimum = optimizer.optimize(
                function, new double[]{0.0, 0.0}, new double[]{1.0, 1.0}, new double[]{5.0, 10.0});

        Assert.assertEquals(5.0, optimum.getPointRef()[0], 1e-10);
        Assert.assertEquals(10.0, optimum.getPointRef()[1], 1e-10);
        Assert.assertEquals(0.0, optimizer.getCost(), 1e-10);
    }

    /**
     * Test rank-deficient Jacobian matrix triggering rank reduction in qrDecomposition.
     */
    @Test
    public void testRankDeficientJacobian() throws OptimizationException, FunctionEvaluationException {
        // 3 equations, 2 parameters, but columns are linearly dependent: col2 = 2 * col1
        DifferentiableMultivariateVectorialFunction function = new DifferentiableMultivariateVectorialFunction() {
            public double[] value(double[] point) {
                double val = point[0] + 2.0 * point[1];
                return new double[]{val, val, val};
            }

            public MultivariateMatrixFunction jacobian() {
                return new MultivariateMatrixFunction() {
                    public double[][] value(double[] point) {
                        return new double[][]{
                                {1.0, 2.0},
                                {1.0, 2.0},
                                {1.0, 2.0}
                        };
                    }
                };
            }
        };

        optimizer.setQRRankingThreshold(1e-14);
        VectorialPointValuePair optimum = optimizer.optimize(
                function, new double[]{3.0, 3.0, 3.0}, new double[]{1.0, 1.0, 1.0}, new double[]{0.0, 0.0});

        // point[0] + 2*point[1] should equal 3.0
        double result = optimum.getPointRef()[0] + 2.0 * optimum.getPointRef()[1];
        Assert.assertEquals(3.0, result, 1e-5);
    }

    /**
     * Test zero Jacobian column norm (jacNorm[k] == 0 branch where dk falls back to 1.0).
     */
    @Test
    public void testZeroJacobianColumnNorm() throws OptimizationException, FunctionEvaluationException {
        // Equation only depends on x, y has no effect (Jacobian for y is 0)
        DifferentiableMultivariateVectorialFunction function = new DifferentiableMultivariateVectorialFunction() {
            public double[] value(double[] point) {
                return new double[]{point[0] - 4.0, point[0] - 4.0};
            }

            public MultivariateMatrixFunction jacobian() {
                return new MultivariateMatrixFunction() {
                    public double[][] value(double[] point) {
                        return new double[][]{
                                {1.0, 0.0},
                                {1.0, 0.0}
                        };
                    }
                };
            }
        };

        VectorialPointValuePair optimum = optimizer.optimize(
                function, new double[]{0.0, 0.0}, new double[]{1.0, 1.0}, new double[]{0.0, 0.0});

        Assert.assertEquals(4.0, optimum.getPointRef()[0], 1e-6);
        Assert.assertEquals(0.0, optimum.getPointRef()[1], 1e-6);
    }

    /**
     * Test QR Decomposition failure when NaN/Infinity is produced in Jacobian.
     */
    @Test(expected = OptimizationException.class)
    public void testJacobianWithNaNThrowsException() throws OptimizationException, FunctionEvaluationException {
        DifferentiableMultivariateVectorialFunction function = new DifferentiableMultivariateVectorialFunction() {
            public double[] value(double[] point) {
                return new double[]{1.0, 2.0};
            }

            public MultivariateMatrixFunction jacobian() {
                return new MultivariateMatrixFunction() {
                    public double[][] value(double[] point) {
                        return new double[][]{
                                {Double.NaN, 0.0},
                                {0.0, 1.0}
                        };
                    }
                };
            }
        };

        optimizer.optimize(function, new double[]{0.0, 0.0}, new double[]{1.0, 1.0}, new double[]{1.0, 1.0});
    }

    /**
     * Test QR Decomposition failure when Jacobian produces Infinity.
     */
    @Test(expected = OptimizationException.class)
    public void testJacobianWithInfinityThrowsException() throws OptimizationException, FunctionEvaluationException {
        DifferentiableMultivariateVectorialFunction function = new DifferentiableMultivariateVectorialFunction() {
            public double[] value(double[] point) {
                return new double[]{1.0, 2.0};
            }

            public MultivariateMatrixFunction jacobian() {
                return new MultivariateMatrixFunction() {
                    public double[][] value(double[] point) {
                        return new double[][]{
                                {Double.POSITIVE_INFINITY, 0.0},
                                {0.0, 1.0}
                        };
                    }
                };
            }
        };

        optimizer.optimize(function, new double[]{0.0, 0.0}, new double[]{1.0, 1.0}, new double[]{1.0, 1.0});
    }

    /**
     * Test custom VectorialConvergenceChecker integration (non-null checker branch).
     */
    @Test
    public void testCustomConvergenceChecker() throws OptimizationException, FunctionEvaluationException {
        optimizer.setConvergenceChecker(new SimpleVectorialValueChecker(1e-3, 1e-3));

        DifferentiableMultivariateVectorialFunction function = new DifferentiableMultivariateVectorialFunction() {
            public double[] value(double[] point) {
                return new double[]{point[0] * point[0] - 4.0};
            }

            public MultivariateMatrixFunction jacobian() {
                return new MultivariateMatrixFunction() {
                    public double[][] value(double[] point) {
                        return new double[][]{{2.0 * point[0]}};
                    }
                };
            }
        };

        VectorialPointValuePair optimum = optimizer.optimize(
                function, new double[]{0.0}, new double[]{1.0}, new double[]{1.0});

        Assert.assertEquals(2.0, optimum.getPointRef()[0], 1e-2);
    }

    /**
     * Test Non-linear problem (Rosenbrock-like / Circle fitting) exercising Givens rotations and LM parameter loop.
     */
    @Test
    public void testNonlinearCircleFitting() throws OptimizationException, FunctionEvaluationException {
        // Points on circle centered at (2, 3) with radius 5
        final double[][] points = {
                {7.0, 3.0},
                {2.0, 8.0},
                {-3.0, 3.0},
                {2.0, -2.0}
        };

        DifferentiableMultivariateVectorialFunction function = new DifferentiableMultivariateVectorialFunction() {
            public double[] value(double[] params) {
                double cx = params[0];
                double cy = params[1];
                double r = params[2];
                double[] res = new double[points.length];
                for (int i = 0; i < points.length; i++) {
                    double dx = points[i][0] - cx;
                    double dy = points[i][1] - cy;
                    res[i] = Math.sqrt(dx * dx + dy * dy) - r;
                }
                return res;
            }

            public MultivariateMatrixFunction jacobian() {
                return new MultivariateMatrixFunction() {
                    public double[][] value(double[] params) {
                        double cx = params[0];
                        double cy = params[1];
                        double[][] jac = new double[points.length][3];
                        for (int i = 0; i < points.length; i++) {
                            double dx = points[i][0] - cx;
                            double dy = points[i][1] - cy;
                            double d = Math.sqrt(dx * dx + dy * dy);
                            jac[i][0] = -dx / d;
                            jac[i][1] = -dy / d;
                            jac[i][2] = -1.0;
                        }
                        return jac;
                    }
                };
            }
        };

        optimizer.setInitialStepBoundFactor(10.0);
        optimizer.setCostRelativeTolerance(1e-12);
        optimizer.setParRelativeTolerance(1e-12);
        optimizer.setOrthoTolerance(1e-12);

        VectorialPointValuePair optimum = optimizer.optimize(
                function, new double[]{0, 0, 0, 0}, new double[]{1, 1, 1, 1}, new double[]{0.0, 0.0, 1.0});

        Assert.assertEquals(2.0, optimum.getPointRef()[0], 1e-5);
        Assert.assertEquals(3.0, optimum.getPointRef()[1], 1e-5);
        Assert.assertEquals(5.0, optimum.getPointRef()[2], 1e-5);
    }

    /**
     * Test parameter configuration and setter coverage.
     */
    @Test
    public void testSettersConfiguration() {
        optimizer.setInitialStepBoundFactor(50.0);
        optimizer.setCostRelativeTolerance(1e-8);
        optimizer.setParRelativeTolerance(1e-8);
        optimizer.setOrthoTolerance(1e-8);
        optimizer.setQRRankingThreshold(1e-10);
        optimizer.setMaxIterations(500);

        Assert.assertEquals(500, optimizer.getMaxIterations());
    }

    /**
     * Test max iterations limit reached throwing OptimizationException.
     */
    @Test(expected = OptimizationException.class)
    public void testMaxIterationsExceededThrowsException() throws OptimizationException, FunctionEvaluationException {
        optimizer.setMaxIterations(1);
        optimizer.setCostRelativeTolerance(1e-20);
        optimizer.setParRelativeTolerance(1e-20);
        optimizer.setOrthoTolerance(1e-20);

        DifferentiableMultivariateVectorialFunction function = new DifferentiableMultivariateVectorialFunction() {
            public double[] value(double[] point) {
                return new double[]{Math.pow(point[0], 4) - 16.0, Math.pow(point[1], 4) - 81.0};
            }

            public MultivariateMatrixFunction jacobian() {
                return new MultivariateMatrixFunction() {
                    public double[][] value(double[] point) {
                        return new double[][]{
                                {4.0 * Math.pow(point[0], 3), 0.0},
                                {0.0, 4.0 * Math.pow(point[1], 3)}
                        };
                    }
                };
            }
        };

        optimizer.optimize(function, new double[]{0.0, 0.0}, new double[]{1.0, 1.0}, new double[]{0.1, 0.1});
    }

    /**
     * Test dimension mismatch between target and weights throwing IllegalArgumentException.
     */
    @Test(expected = IllegalArgumentException.class)
    public void testTargetAndWeightsDimensionMismatch() throws OptimizationException, FunctionEvaluationException {
        DifferentiableMultivariateVectorialFunction function = new DifferentiableMultivariateVectorialFunction() {
            public double[] value(double[] point) {
                return new double[]{point[0]};
            }

            public MultivariateMatrixFunction jacobian() {
                return new MultivariateMatrixFunction() {
                    public double[][] value(double[] point) {
                        return new double[][]{{1.0}};
                    }
                };
            }
        };

        optimizer.optimize(function, new double[]{1.0, 2.0}, new double[]{1.0}, new double[]{0.0});
    }
}