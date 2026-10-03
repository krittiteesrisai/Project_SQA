package org.apache.commons.math3.optim.nonlinear.vector.jacobian;

import org.apache.commons.math3.analysis.MultivariateMatrixFunction;
import org.apache.commons.math3.analysis.MultivariateVectorFunction;
import org.apache.commons.math3.exception.DimensionMismatchException;
import org.apache.commons.math3.linear.Array2DRowRealMatrix;
import org.apache.commons.math3.linear.DiagonalMatrix;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.SingularMatrixException;
import org.apache.commons.math3.optim.ConvergenceChecker;
import org.apache.commons.math3.optim.InitialGuess;
import org.apache.commons.math3.optim.MaxEval;
import org.apache.commons.math3.optim.PointVectorValuePair;
import org.apache.commons.math3.optim.SimpleVectorValueChecker;
import org.apache.commons.math3.optim.nonlinear.vector.ModelFunction;
import org.apache.commons.math3.optim.nonlinear.vector.ModelFunctionJacobian;
import org.apache.commons.math3.optim.nonlinear.vector.Target;
import org.apache.commons.math3.optim.nonlinear.vector.Weight;
import org.junit.Assert;
import org.junit.Test;

/**
 * High-coverage unit test suite for {@link AbstractLeastSquaresOptimizer}.
 */
public class AbstractLeastSquaresOptimizerTest {

    /**
     * Concrete implementation of AbstractLeastSquaresOptimizer for testing.
     */
    private static class ConcreteLeastSquaresOptimizer extends AbstractLeastSquaresOptimizer {

        ConcreteLeastSquaresOptimizer() {
            super(null);
        }

        ConcreteLeastSquaresOptimizer(ConvergenceChecker<PointVectorValuePair> checker) {
            super(checker);
        }

        @Override
        protected PointVectorValuePair doOptimize() {
            final double[] params = getStartPoint();
            final double[] objective = computeObjectiveValue(params);
            final double[] residuals = computeResiduals(objective);
            setCost(computeCost(residuals));
            return new PointVectorValuePair(params, objective);
        }

        // Expose protected methods for direct verification
        public RealMatrix testComputeWeightedJacobian(double[] params) {
            return computeWeightedJacobian(params);
        }

        public double testComputeCost(double[] residuals) {
            return computeCost(residuals);
        }

        public double[] testComputeResiduals(double[] objectiveValue) {
            return computeResiduals(objectiveValue);
        }

        public void testSetCost(double cost) {
            setCost(cost);
        }
    }

    private ConcreteLeastSquaresOptimizer setupOptimizer(
            final MultivariateVectorFunction model,
            final MultivariateMatrixFunction jacobian,
            final double[] target,
            final RealMatrix weight,
            final double[] startPoint) {
        final ConcreteLeastSquaresOptimizer optimizer = new ConcreteLeastSquaresOptimizer();
        optimizer.optimize(
                new MaxEval(100),
                new Target(target),
                new Weight(weight),
                new InitialGuess(startPoint),
                new ModelFunction(model),
                new ModelFunctionJacobian(jacobian)
        );
        return optimizer;
    }

    @Test
    public void testOptimizeAndGetWeightSquareRoot() {
        final double[] target = new double[]{2.0, 4.0};
        final double[] start = new double[]{1.0, 1.0};
        final RealMatrix weight = new DiagonalMatrix(new double[]{4.0, 9.0});

        final MultivariateVectorFunction model = new MultivariateVectorFunction() {
            @Override
            public double[] value(double[] point) {
                return new double[]{point[0], 2.0 * point[1]};
            }
        };

        final MultivariateMatrixFunction jacobian = new MultivariateMatrixFunction() {
            @Override
            public double[][] value(double[] point) {
                return new double[][]{
                        {1.0, 0.0},
                        {0.0, 2.0}
                };
            }
        };

        final ConcreteLeastSquaresOptimizer optimizer = setupOptimizer(model, jacobian, target, weight, start);

        final RealMatrix weightSqrt = optimizer.getWeightSquareRoot();
        Assert.assertEquals(2.0, weightSqrt.getEntry(0, 0), 1e-10);
        Assert.assertEquals(0.0, weightSqrt.getEntry(0, 1), 1e-10);
        Assert.assertEquals(0.0, weightSqrt.getEntry(1, 0), 1e-10);
        Assert.assertEquals(3.0, weightSqrt.getEntry(1, 1), 1e-10);
    }

    @Test
    public void testComputeWeightedJacobian() {
        final double[] target = new double[]{1.0, 2.0};
        final double[] start = new double[]{1.0, 2.0};
        final RealMatrix weight = new DiagonalMatrix(new double[]{4.0, 16.0});

        final MultivariateVectorFunction model = new MultivariateVectorFunction() {
            @Override
            public double[] value(double[] point) {
                return new double[]{point[0], point[1]};
            }
        };

        final MultivariateMatrixFunction jacobian = new MultivariateMatrixFunction() {
            @Override
            public double[][] value(double[] point) {
                return new double[][]{
                        {2.0, 3.0},
                        {4.0, 5.0}
                };
            }
        };

        final ConcreteLeastSquaresOptimizer optimizer = setupOptimizer(model, jacobian, target, weight, start);

        final RealMatrix weightedJ = optimizer.testComputeWeightedJacobian(start);
        // W^1/2 = diag(2, 4)
        // weightedJ = [[2*2, 2*3], [4*4, 4*5]] = [[4, 6], [16, 20]]
        Assert.assertEquals(4.0, weightedJ.getEntry(0, 0), 1e-10);
        Assert.assertEquals(6.0, weightedJ.getEntry(0, 1), 1e-10);
        Assert.assertEquals(16.0, weightedJ.getEntry(1, 0), 1e-10);
        Assert.assertEquals(20.0, weightedJ.getEntry(1, 1), 1e-10);
    }

    @Test
    public void testComputeCostAndResiduals() {
        final double[] target = new double[]{10.0, 20.0};
        final double[] start = new double[]{0.0, 0.0};
        final RealMatrix weight = new DiagonalMatrix(new double[]{1.0, 1.0});

        final MultivariateVectorFunction model = new MultivariateVectorFunction() {
            @Override
            public double[] value(double[] point) {
                return point;
            }
        };

        final MultivariateMatrixFunction jacobian = new MultivariateMatrixFunction() {
            @Override
            public double[][] value(double[] point) {
                return new double[][]{{1.0, 0.0}, {0.0, 1.0}};
            }
        };

        final ConcreteLeastSquaresOptimizer optimizer = setupOptimizer(model, jacobian, target, weight, start);

        final double[] residuals = optimizer.testComputeResiduals(new double[]{7.0, 16.0});
        Assert.assertArrayEquals(new double[]{3.0, 4.0}, residuals, 1e-10);

        final double cost = optimizer.testComputeCost(residuals);
        // cost = sqrt(3^2 * 1 + 4^2 * 1) = sqrt(25) = 5.0
        Assert.assertEquals(5.0, cost, 1e-10);
    }

    @Test(expected = DimensionMismatchException.class)
    public void testComputeResidualsDimensionMismatch() {
        final double[] target = new double[]{1.0, 2.0};
        final double[] start = new double[]{1.0, 2.0};
        final RealMatrix weight = new DiagonalMatrix(new double[]{1.0, 1.0});

        final MultivariateVectorFunction model = new MultivariateVectorFunction() {
            @Override
            public double[] value(double[] point) {
                return point;
            }
        };

        final MultivariateMatrixFunction jacobian = new MultivariateMatrixFunction() {
            @Override
            public double[][] value(double[] point) {
                return new double[][]{{1.0, 0.0}, {0.0, 1.0}};
            }
        };

        final ConcreteLeastSquaresOptimizer optimizer = setupOptimizer(model, jacobian, target, weight, start);
        optimizer.testComputeResiduals(new double[]{1.0, 2.0, 3.0});
    }

    @Test
    public void testRMSAndChiSquare() {
        final ConcreteLeastSquaresOptimizer optimizer = new ConcreteLeastSquaresOptimizer(
                new SimpleVectorValueChecker(1e-6, 1e-6)
        );

        final double[] target = new double[]{1.0, 2.0, 3.0, 4.0};
        final double[] start = new double[]{0.0, 0.0, 0.0, 0.0};
        final RealMatrix weight = new DiagonalMatrix(new double[]{1.0, 1.0, 1.0, 1.0});

        final MultivariateVectorFunction model = new MultivariateVectorFunction() {
            @Override
            public double[] value(double[] point) {
                return point;
            }
        };

        final MultivariateMatrixFunction jacobian = new MultivariateMatrixFunction() {
            @Override
            public double[][] value(double[] point) {
                return MatrixUtilsSquareIdentity(4);
            }
        };

        optimizer.optimize(
                new MaxEval(100),
                new Target(target),
                new Weight(weight),
                new InitialGuess(start),
                new ModelFunction(model),
                new ModelFunctionJacobian(jacobian)
        );

        optimizer.testSetCost(4.0);
        // ChiSquare = 4^2 = 16.0
        Assert.assertEquals(16.0, optimizer.getChiSquare(), 1e-10);
        // RMS = sqrt(16.0 / 4) = 2.0
        Assert.assertEquals(2.0, optimizer.getRMS(), 1e-10);
    }

    @Test
    public void testComputeCovariancesAndSigma() {
        final double[] target = new double[]{1.0, 2.0};
        final double[] start = new double[]{1.0, 1.0};
        final RealMatrix weight = new DiagonalMatrix(new double[]{1.0, 1.0});

        final MultivariateVectorFunction model = new MultivariateVectorFunction() {
            @Override
            public double[] value(double[] point) {
                return point;
            }
        };

        // J = [[2, 0], [0, 2]] -> J^T J = [[4, 0], [0, 4]] -> Covariance = [[0.25, 0], [0, 0.25]]
        final MultivariateMatrixFunction jacobian = new MultivariateMatrixFunction() {
            @Override
            public double[][] value(double[] point) {
                return new double[][]{
                        {2.0, 0.0},
                        {0.0, 2.0}
                };
            }
        };

        final ConcreteLeastSquaresOptimizer optimizer = setupOptimizer(model, jacobian, target, weight, start);

        final double[][] cov = optimizer.computeCovariances(start, 1e-10);
        Assert.assertEquals(0.25, cov[0][0], 1e-10);
        Assert.assertEquals(0.0, cov[0][1], 1e-10);
        Assert.assertEquals(0.0, cov[1][0], 1e-10);
        Assert.assertEquals(0.25, cov[1][1], 1e-10);

        final double[] sigmas = optimizer.computeSigma(start, 1e-10);
        Assert.assertEquals(2, sigmas.length);
        Assert.assertEquals(0.5, sigmas[0], 1e-10);
        Assert.assertEquals(0.5, sigmas[1], 1e-10);
    }

    @Test(expected = SingularMatrixException.class)
    public void testComputeCovariancesSingularMatrix() {
        final double[] target = new double[]{1.0, 2.0};
        final double[] start = new double[]{1.0, 1.0};
        final RealMatrix weight = new DiagonalMatrix(new double[]{1.0, 1.0});

        final MultivariateVectorFunction model = new MultivariateVectorFunction() {
            @Override
            public double[] value(double[] point) {
                return point;
            }
        };

        // Rank-deficient Jacobian (2nd row is multiple of 1st row)
        final MultivariateMatrixFunction jacobian = new MultivariateMatrixFunction() {
            @Override
            public double[][] value(double[] point) {
                return new double[][]{
                        {1.0, 2.0},
                        {2.0, 4.0}
                };
            }
        };

        final ConcreteLeastSquaresOptimizer optimizer = setupOptimizer(model, jacobian, target, weight, start);
        optimizer.computeCovariances(start, 1e-10);
    }

    @Test(expected = SingularMatrixException.class)
    public void testComputeSigmaSingularMatrix() {
        final double[] target = new double[]{1.0, 2.0};
        final double[] start = new double[]{1.0, 1.0};
        final RealMatrix weight = new DiagonalMatrix(new double[]{1.0, 1.0});

        final MultivariateVectorFunction model = new MultivariateVectorFunction() {
            @Override
            public double[] value(double[] point) {
                return point;
            }
        };

        final MultivariateMatrixFunction jacobian = new MultivariateMatrixFunction() {
            @Override
            public double[][] value(double[] point) {
                return new double[][]{
                        {0.0, 0.0},
                        {0.0, 0.0}
                };
            }
        };

        final ConcreteLeastSquaresOptimizer optimizer = setupOptimizer(model, jacobian, target, weight, start);
        optimizer.computeSigma(start, 1e-10);
    }

    @Test
    public void testParseOptimizationDataWithDenseWeightMatrix() {
        final double[] target = new double[]{1.0, 1.0};
        final double[] start = new double[]{1.0, 1.0};
        // Symmetric positive-definite 2x2 matrix
        final RealMatrix denseWeight = new Array2DRowRealMatrix(new double[][]{
                {2.0, 1.0},
                {1.0, 2.0}
        });

        final MultivariateVectorFunction model = new MultivariateVectorFunction() {
            @Override
            public double[] value(double[] point) {
                return point;
            }
        };

        final MultivariateMatrixFunction jacobian = new MultivariateMatrixFunction() {
            @Override
            public double[][] value(double[] point) {
                return new double[][]{{1.0, 0.0}, {0.0, 1.0}};
            }
        };

        final ConcreteLeastSquaresOptimizer optimizer = setupOptimizer(model, jacobian, target, denseWeight, start);

        final RealMatrix sqrtW = optimizer.getWeightSquareRoot();
        // Sqrt * Sqrt should equal original weight matrix
        final RealMatrix reconstructedWeight = sqrtW.multiply(sqrtW);
        Assert.assertEquals(2.0, reconstructedWeight.getEntry(0, 0), 1e-10);
        Assert.assertEquals(1.0, reconstructedWeight.getEntry(0, 1), 1e-10);
        Assert.assertEquals(1.0, reconstructedWeight.getEntry(1, 0), 1e-10);
        Assert.assertEquals(2.0, reconstructedWeight.getEntry(1, 1), 1e-10);
    }

    @Test
    public void testParseOptimizationDataWithoutWeightMatrix() {
        final ConcreteLeastSquaresOptimizer optimizer = new ConcreteLeastSquaresOptimizer();
        // Calling optimize with no Weight passed in
        final PointVectorValuePair result = optimizer.optimize(
                new MaxEval(10),
                new Target(new double[]{1.0}),
                new InitialGuess(new double[]{0.0}),
                new ModelFunction(new MultivariateVectorFunction() {
                    @Override
                    public double[] value(double[] point) {
                        return point;
                    }
                }),
                new ModelFunctionJacobian(new MultivariateMatrixFunction() {
                    @Override
                    public double[][] value(double[] point) {
                        return new double[][]{{1.0}};
                    }
                })
        );
        Assert.assertNotNull(result);
    }

    private static double[][] MatrixUtilsSquareIdentity(int dim) {
        final double[][] identity = new double[dim][dim];
        for (int i = 0; i < dim; i++) {
            identity[i][i] = 1.0;
        }
        return identity;
    }
}