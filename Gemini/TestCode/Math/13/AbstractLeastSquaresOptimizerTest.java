package org.apache.commons.math3.optimization.general;

import org.apache.commons.math3.analysis.DifferentiableMultivariateVectorFunction;
import org.apache.commons.math3.analysis.MultivariateMatrixFunction;
import org.apache.commons.math3.analysis.differentiation.DerivativeStructure;
import org.apache.commons.math3.analysis.differentiation.MultivariateDifferentiableVectorFunction;
import org.apache.commons.math3.exception.DimensionMismatchException;
import org.apache.commons.math3.exception.NumberIsTooSmallException;
import org.apache.commons.math3.linear.Array2DRowRealMatrix;
import org.apache.commons.math3.linear.DiagonalMatrix;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.SingularMatrixException;
import org.apache.commons.math3.optimization.ConvergenceChecker;
import org.apache.commons.math3.optimization.InitialGuess;
import org.apache.commons.math3.optimization.PointVectorValuePair;
import org.apache.commons.math3.optimization.SimplePointChecker;
import org.apache.commons.math3.optimization.Target;
import org.apache.commons.math3.optimization.Weight;
import org.junit.Assert;
import org.junit.Test;

public class AbstractLeastSquaresOptimizerTest {

    /**
     * คลาสจำลองแบบ Concrete สำหรับทดสอบ AbstractLeastSquaresOptimizer
     */
    private static class DummyOptimizer extends AbstractLeastSquaresOptimizer {
        public DummyOptimizer() {
            super();
        }

        public DummyOptimizer(ConvergenceChecker<PointVectorValuePair> checker) {
            super(checker);
        }

        @Override
        protected PointVectorValuePair doOptimize() {
            setUp();
            return new PointVectorValuePair(getStartPoint(), computeObjectiveValue(getStartPoint()));
        }

        // เปิด visibility ของ protected methods เพื่อการทดสอบอย่างละเอียด
        @Override
        public void setUp() {
            super.setUp();
        }

        @Override
        public void updateJacobian() {
            super.updateJacobian();
        }

        @Override
        public void updateResidualsAndCost() {
            super.updateResidualsAndCost();
        }

        @Override
        public double computeCost(double[] residuals) {
            return super.computeCost(residuals);
        }

        @Override
        public RealMatrix computeWeightedJacobian(double[] params) {
            return super.computeWeightedJacobian(params);
        }

        @Override
        public double[] computeResiduals(double[] objectiveValue) {
            return super.computeResiduals(objectiveValue);
        }

        @Override
        public void setCost(double cost) {
            super.setCost(cost);
        }

        public double[][] getWeightedResidualJacobian() {
            return weightedResidualJacobian;
        }

        public double[] getWeightedResiduals() {
            return weightedResiduals;
        }

        public double[] getPoint() {
            return point;
        }

        public double[] getObjective() {
            return objective;
        }

        public void setRows(int r) {
            this.rows = r;
        }

        public void setCols(int c) {
            this.cols = c;
        }
    }

    /**
     * Helper Function สำหรับสร้าง Simple Linear Model: f(x, y) = [x + y, x - y, 2*x]
     */
    private MultivariateDifferentiableVectorFunction createLinearModel() {
        return new MultivariateDifferentiableVectorFunction() {
            @Override
            public double[] value(double[] point) {
                return new double[] {
                    point[0] + point[1],
                    point[0] - point[1],
                    2.0 * point[0]
                };
            }

            @Override
            public DerivativeStructure[] value(DerivativeStructure[] point) {
                return new DerivativeStructure[] {
                    point[0].add(point[1]),
                    point[0].subtract(point[1]),
                    point[0].multiply(2.0)
                };
            }
        };
    }

    /**
     * Helper Function สำหรับสร้าง DifferentiableMultivariateVectorFunction แบบดั้งเดิม
     */
    private DifferentiableMultivariateVectorFunction createLegacyLinearModel() {
        return new DifferentiableMultivariateVectorFunction() {
            @Override
            public double[] value(double[] point) {
                return new double[] {
                    point[0] + point[1],
                    point[0] - point[1],
                    2.0 * point[0]
                };
            }

            @Override
            public MultivariateMatrixFunction jacobian() {
                return new MultivariateMatrixFunction() {
                    @Override
                    public double[][] value(double[] point) {
                        return new double[][] {
                            { 1.0,  1.0 },
                            { 1.0, -1.0 },
                            { 2.0,  0.0 }
                        };
                    }
                };
            }
        };
    }

    @Test
    public void testOptimizeAndSetUp() {
        DummyOptimizer optimizer = new DummyOptimizer(new SimplePointChecker<PointVectorValuePair>(1e-6, 1e-6));
        MultivariateDifferentiableVectorFunction f = createLinearModel();

        double[] target = new double[] { 3.0, 1.0, 4.0 };
        double[] weights = new double[] { 1.0, 1.0, 1.0 };
        double[] startPoint = new double[] { 2.0, 1.0 };

        PointVectorValuePair result = optimizer.optimize(100, f, target, weights, startPoint);

        Assert.assertNotNull(result);
        Assert.assertEquals(0, optimizer.getJacobianEvaluations());

        // ตรวจสอบ Weight Square Root
        RealMatrix weightSqrt = optimizer.getWeightSquareRoot();
        Assert.assertEquals(3, weightSqrt.getRowDimension());
        Assert.assertEquals(3, weightSqrt.getColumnDimension());
        Assert.assertEquals(1.0, weightSqrt.getEntry(0, 0), 1e-10);
    }

    @Test
    public void testOptimizeWithLegacyFunction() {
        DummyOptimizer optimizer = new DummyOptimizer();
        DifferentiableMultivariateVectorFunction f = createLegacyLinearModel();

        double[] target = new double[] { 3.0, 1.0, 4.0 };
        double[] weights = new double[] { 1.0, 1.0, 1.0 };
        double[] startPoint = new double[] { 2.0, 1.0 };

        PointVectorValuePair result = optimizer.optimize(100, f, target, weights, startPoint);
        Assert.assertNotNull(result);
        Assert.assertArrayEquals(startPoint, result.getPoint(), 1e-10);
    }

    @Test
    public void testComputeWeightedJacobianAndCounters() {
        DummyOptimizer optimizer = new DummyOptimizer();
        optimizer.optimize(100, createLinearModel(),
                new Target(new double[] { 3.0, 1.0, 4.0 }),
                new Weight(new double[] { 4.0, 1.0, 9.0 }), // sqrt: 2, 1, 3
                new InitialGuess(new double[] { 2.0, 1.0 }));

        optimizer.setUp();
        double[] point = new double[] { 2.0, 1.0 };
        RealMatrix weightedJ = optimizer.computeWeightedJacobian(point);

        Assert.assertEquals(1, optimizer.getJacobianEvaluations());
        // J = [[1, 1], [1, -1], [2, 0]]
        // Weighted J = diag(2, 1, 3) * J = [[2, 2], [1, -1], [6, 0]]
        Assert.assertEquals(2.0, weightedJ.getEntry(0, 0), 1e-10);
        Assert.assertEquals(2.0, weightedJ.getEntry(0, 1), 1e-10);
        Assert.assertEquals(1.0, weightedJ.getEntry(1, 0), 1e-10);
        Assert.assertEquals(-1.0, weightedJ.getEntry(1, 1), 1e-10);
        Assert.assertEquals(6.0, weightedJ.getEntry(2, 0), 1e-10);
        Assert.assertEquals(0.0, weightedJ.getEntry(2, 1), 1e-10);
    }

    @Test(expected = DimensionMismatchException.class)
    public void testComputeWeightedJacobianDimensionMismatch() {
        DummyOptimizer optimizer = new DummyOptimizer();
        // Model ส่งออก 3 มิติ แต่ Target กำหนด 2 มิติ
        optimizer.optimize(100, createLinearModel(),
                new Target(new double[] { 1.0, 2.0 }),
                new Weight(new double[] { 1.0, 1.0 }),
                new InitialGuess(new double[] { 1.0, 1.0 }));

        optimizer.setUp();
        optimizer.computeWeightedJacobian(new double[] { 1.0, 1.0 });
    }

    @Test
    public void testUpdateJacobian() {
        DummyOptimizer optimizer = new DummyOptimizer();
        optimizer.optimize(100, createLinearModel(),
                new Target(new double[] { 3.0, 1.0, 4.0 }),
                new Weight(new double[] { 1.0, 1.0, 1.0 }),
                new InitialGuess(new double[] { 2.0, 1.0 }));

        optimizer.setUp();
        optimizer.updateJacobian();

        double[][] weightedResidualJacobian = optimizer.getWeightedResidualJacobian();
        Assert.assertNotNull(weightedResidualJacobian);
        // weightedResidualJacobian = -1 * J
        Assert.assertEquals(-1.0, weightedResidualJacobian[0][0], 1e-10);
        Assert.assertEquals(-1.0, weightedResidualJacobian[0][1], 1e-10);
    }

    @Test
    public void testUpdateResidualsAndCostAndRMS() {
        DummyOptimizer optimizer = new DummyOptimizer();
        optimizer.optimize(100, createLinearModel(),
                new Target(new double[] { 4.0, 0.0, 5.0 }),
                new Weight(new double[] { 1.0, 1.0, 1.0 }),
                new InitialGuess(new double[] { 2.0, 1.0 }));

        // f([2, 1]) = [3, 1, 4]
        // Target = [4, 0, 5]
        // residuals = [4-3, 0-1, 5-4] = [1, -1, 1]
        // cost = sqrt(1^2 + (-1)^2 + 1^2) = sqrt(3)
        optimizer.setUp();
        optimizer.updateResidualsAndCost();

        double expectedCost = Math.sqrt(3.0);
        Assert.assertEquals(expectedCost, optimizer.cost, 1e-10);
        Assert.assertEquals(3.0, optimizer.getChiSquare(), 1e-10);
        Assert.assertEquals(Math.sqrt(3.0 / 3.0), optimizer.getRMS(), 1e-10);

        optimizer.setCost(2.0);
        Assert.assertEquals(4.0, optimizer.getChiSquare(), 1e-10);
    }

    @Test(expected = DimensionMismatchException.class)
    public void testComputeResidualsDimensionMismatch() {
        DummyOptimizer optimizer = new DummyOptimizer();
        optimizer.optimize(100, createLinearModel(),
                new Target(new double[] { 1.0, 2.0, 3.0 }),
                new Weight(new double[] { 1.0, 1.0, 1.0 }),
                new InitialGuess(new double[] { 1.0, 1.0 }));

        optimizer.setUp();
        // ส่ง objectiveValue ที่มี dimension ไม่ตรงกับ target (ส่ง 2 แทนที่จะเป็น 3)
        optimizer.computeResiduals(new double[] { 1.0, 2.0 });
    }

    @Test
    public void testComputeResidualsSuccess() {
        DummyOptimizer optimizer = new DummyOptimizer();
        optimizer.optimize(100, createLinearModel(),
                new Target(new double[] { 5.0, 2.0, 8.0 }),
                new Weight(new double[] { 1.0, 1.0, 1.0 }),
                new InitialGuess(new double[] { 1.0, 1.0 }));

        optimizer.setUp();
        double[] residuals = optimizer.computeResiduals(new double[] { 3.0, 1.0, 4.0 });
        Assert.assertArrayEquals(new double[] { 2.0, 1.0, 4.0 }, residuals, 1e-10);
    }

    @Test
    public void testCovariancesAndSigma() {
        DummyOptimizer optimizer = new DummyOptimizer();
        optimizer.optimize(100, createLinearModel(),
                new Target(new double[] { 3.0, 1.0, 4.0 }),
                new Weight(new double[] { 1.0, 1.0, 1.0 }),
                new InitialGuess(new double[] { 2.0, 1.0 }));

        optimizer.setUp();
        double[][] cov1 = optimizer.getCovariances();
        double[][] cov2 = optimizer.getCovariances(1e-10);
        double[][] cov3 = optimizer.computeCovariances(new double[] { 2.0, 1.0 }, 1e-10);

        Assert.assertEquals(cov1.length, 2);
        Assert.assertEquals(cov1[0][0], cov2[0][0], 1e-10);
        Assert.assertEquals(cov2[0][0], cov3[0][0], 1e-10);

        double[] sigmas = optimizer.computeSigma(new double[] { 2.0, 1.0 }, 1e-10);
        Assert.assertEquals(2, sigmas.length);
        Assert.assertEquals(Math.sqrt(cov1[0][0]), sigmas[0], 1e-10);
        Assert.assertEquals(Math.sqrt(cov1[1][1]), sigmas[1], 1e-10);
    }

    @Test(expected = SingularMatrixException.class)
    public void testComputeCovariancesSingularException() {
        // สร้าง Optimizer ด้วย Threshold ที่สูงมากเพื่อบีบให้เกิด SingularMatrixException
        DummyOptimizer optimizer = new DummyOptimizer();
        optimizer.optimize(100, createLinearModel(),
                new Target(new double[] { 3.0, 1.0, 4.0 }),
                new Weight(new double[] { 1.0, 1.0, 1.0 }),
                new InitialGuess(new double[] { 2.0, 1.0 }));

        optimizer.setUp();
        optimizer.computeCovariances(new double[] { 2.0, 1.0 }, 1e10);
    }

    @Test
    public void testGuessParametersErrorsSuccess() {
        DummyOptimizer optimizer = new DummyOptimizer();
        optimizer.optimize(100, createLinearModel(),
                new Target(new double[] { 3.0, 1.0, 4.0 }),
                new Weight(new double[] { 1.0, 1.0, 1.0 }),
                new InitialGuess(new double[] { 2.0, 1.0 }));

        optimizer.setUp();
        optimizer.setCost(2.0); // chiSquare = 4.0, rows = 3, cols = 2 -> rows - cols = 1

        double[] errors = optimizer.guessParametersErrors();
        Assert.assertEquals(2, errors.length);
        Assert.assertTrue(errors[0] > 0);
        Assert.assertTrue(errors[1] > 0);
    }

    @Test(expected = NumberIsTooSmallException.class)
    public void testGuessParametersErrorsInsufficientDegreesOfFreedom() {
        DummyOptimizer optimizer = new DummyOptimizer();
        optimizer.optimize(100, createLinearModel(),
                new Target(new double[] { 3.0, 1.0 }),
                new Weight(new double[] { 1.0, 1.0 }),
                new InitialGuess(new double[] { 2.0, 1.0 }));

        optimizer.setUp();
        // จำลอง rows <= cols (2 <= 2)
        optimizer.setRows(2);
        optimizer.setCols(2);

        optimizer.guessParametersErrors();
    }

    @Test
    public void testSquareRootWithDiagonalWeightMatrix() {
        DummyOptimizer optimizer = new DummyOptimizer();
        // ทดสอบการป้อน Matrix ที่ไม่ใช่ Identity ทั่วไป (เช่น Diagonal Matrix ขนาด 3x3)
        DiagonalMatrix diagonalMatrix = new DiagonalMatrix(new double[] { 4.0, 9.0, 16.0 });
        optimizer.optimize(100, createLinearModel(),
                new Target(new double[] { 1.0, 2.0, 3.0 }),
                new Weight(diagonalMatrix),
                new InitialGuess(new double[] { 0.0, 0.0 }));

        optimizer.setUp();
        RealMatrix sqrtW = optimizer.getWeightSquareRoot();
        Assert.assertEquals(2.0, sqrtW.getEntry(0, 0), 1e-10);
        Assert.assertEquals(3.0, sqrtW.getEntry(1, 1), 1e-10);
        Assert.assertEquals(4.0, sqrtW.getEntry(2, 2), 1e-10);
    }
}