package org.apache.commons.math3.optimization.general;

import static org.junit.Assert.*;

import org.apache.commons.math3.analysis.DifferentiableMultivariateVectorFunction;
import org.apache.commons.math3.analysis.FunctionUtils;
import org.apache.commons.math3.analysis.MultivariateMatrixFunction;
import org.apache.commons.math3.analysis.differentiation.MultivariateDifferentiableVectorFunction;
import org.apache.commons.math3.exception.DimensionMismatchException;
import org.apache.commons.math3.exception.NumberIsTooSmallException;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.SingularMatrixException;
import org.apache.commons.math3.optimization.PointVectorValuePair;
import org.junit.Test;

public class AbstractLeastSquaresOptimizerTest {

    // ===================== Helper: Linear model function =====================
    // model: value_i(params) = sum_j factors[i][j] * params[j]
    // Jacobian เป็นค่าคงที่เท่ากับ factors เสมอ (ง่ายต่อการคำนวณ expected value ด้วยมือ)
    private static class LinearProblem implements DifferentiableMultivariateVectorFunction {
        private final double[][] factors;

        LinearProblem(double[][] factors) {
            this.factors = factors;
        }

        public double[] value(double[] variables) {
            double[] values = new double[factors.length];
            for (int i = 0; i < factors.length; i++) {
                double sum = 0;
                for (int j = 0; j < variables.length; j++) {
                    sum += factors[i][j] * variables[j];
                }
                values[i] = sum;
            }
            return values;
        }

        public MultivariateMatrixFunction jacobian() {
            return new MultivariateMatrixFunction() {
                public double[][] value(double[] point) {
                    return factors;
                }
            };
        }
    }

    // ===================== Helper: Concrete optimizer subclass =====================
    private static class LinearOptimizer extends AbstractLeastSquaresOptimizer {

        LinearOptimizer() {
            // สมมติฐาน: ConvergenceChecker ไม่ถูกเรียกใช้ใน doOptimize() ของเรา
            // (ไม่มีหลักฐานใน source ที่ให้มาว่า base class เรียก checker โดยอัตโนมัติ)
            super(null);
        }

        @Override
        protected PointVectorValuePair doOptimize() {
            point = getStartPoint();
            rows = getTarget().length;
            cols = point.length;

            updateJacobian();
            updateResidualsAndCost();

            return new PointVectorValuePair(point, objective);
        }

        // ---- Public wrappers เพื่อทดสอบ protected method แบบ isolate ----
        public double[] publicComputeResiduals(double[] objectiveValue) {
            return computeResiduals(objectiveValue);
        }

        public RealMatrix publicComputeWeightedJacobian(double[] params) {
            return computeWeightedJacobian(params);
        }

        public double publicComputeCost(double[] residuals) {
            return computeCost(residuals);
        }

        public void publicSetCost(double c) {
            setCost(c);
        }

        public double getCostField() {
            return cost;
        }

        public double[][] getWeightedResidualJacobianField() {
            return weightedResidualJacobian;
        }

        public double[] getWeightedResidualsField() {
            return weightedResiduals;
        }
    }

    // ===================== Tests: ค่าพื้นฐาน / normal path =====================

    @Test
    public void testGetChiSquareAndRMS() {
        double[][] factors = {
            {1, 0},
            {0, 1},
            {1, 1}
        };
        double[] target  = {1.0, 1.0, 2.0};
        double[] weights = {1.0, 1.0, 1.0};
        double[] start   = {0.0, 0.0};

        LinearOptimizer optimizer = new LinearOptimizer();
        LinearProblem problem = new LinearProblem(factors);
        optimizer.optimize(100, problem, target, weights, start);

        // residual = target - objective(start=0,0) = [1,1,2]
        // cost = sqrt(1^2+1^2+2^2) = sqrt(6)
        assertEquals(6.0, optimizer.getChiSquare(), 1e-10);
        assertEquals(Math.sqrt(2.0), optimizer.getRMS(), 1e-10);
    }

    @Test
    public void testGetWeightSquareRootIdentity() {
        double[][] factors = {{1, 0}, {0, 1}, {1, 1}};
        double[] target = {1.0, 1.0, 2.0};
        double[] weights = {1.0, 1.0, 1.0};
        double[] start = {0.0, 0.0};

        LinearOptimizer optimizer = new LinearOptimizer();
        optimizer.optimize(100, new LinearProblem(factors), target, weights, start);

        RealMatrix sqrtW = optimizer.getWeightSquareRoot();
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                double expected = (i == j) ? 1.0 : 0.0;
                assertEquals(expected, sqrtW.getEntry(i, j), 1e-10);
            }
        }
    }

    @Test
    public void testGetWeightSquareRootNonUniformWeights() {
        double[][] factors = {{1, 0}, {0, 1}, {1, 1}};
        double[] target = {1.0, 1.0, 2.0};
        double[] weights = {4.0, 9.0, 1.0}; // diagonal, sqrt = [2,3,1]
        double[] start = {0.0, 0.0};

        LinearOptimizer optimizer = new LinearOptimizer();
        optimizer.optimize(100, new LinearProblem(factors), target, weights, start);

        RealMatrix sqrtW = optimizer.getWeightSquareRoot();
        assertEquals(2.0, sqrtW.getEntry(0, 0), 1e-10);
        assertEquals(3.0, sqrtW.getEntry(1, 1), 1e-10);
        assertEquals(1.0, sqrtW.getEntry(2, 2), 1e-10);
        // off-diagonal ควรเป็น 0 สำหรับ diagonal weight matrix
        assertEquals(0.0, sqrtW.getEntry(0, 1), 1e-10);
        assertEquals(0.0, sqrtW.getEntry(1, 2), 1e-10);
    }

    @Test
    public void testJacobianEvaluationsCount() {
        double[][] factors = {{1, 0}, {0, 1}, {1, 1}};
        double[] target = {1.0, 1.0, 2.0};
        double[] weights = {1.0, 1.0, 1.0};
        double[] start = {0.0, 0.0};

        LinearOptimizer optimizer = new LinearOptimizer();
        optimizer.optimize(100, new LinearProblem(factors), target, weights, start);

        // doOptimize() เรียก updateJacobian() หนึ่งครั้ง -> jacobianEvaluations = 1
        assertEquals(1, optimizer.getJacobianEvaluations());

        // เรียก computeWeightedJacobian เพิ่มอีก 2 ครั้งผ่าน public wrapper
        optimizer.publicComputeWeightedJacobian(start);
        optimizer.publicComputeWeightedJacobian(start);
        assertEquals(3, optimizer.getJacobianEvaluations());
    }

    @Test
    public void testUpdateJacobianAndResidualsValues() {
        double[][] factors = {{1, 0}, {0, 1}, {1, 1}};
        double[] target = {1.0, 1.0, 2.0};
        double[] weights = {1.0, 1.0, 1.0};
        double[] start = {0.0, 0.0};

        LinearOptimizer optimizer = new LinearOptimizer();
        optimizer.optimize(100, new LinearProblem(factors), target, weights, start);

        // weightedResidualJacobian = -1 * weightedJacobian (W=I ดังนั้นเท่ากับ -factors)
        double[][] jac = optimizer.getWeightedResidualJacobianField();
        double[][] expectedJac = {{-1, 0}, {0, -1}, {-1, -1}};
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                assertEquals(expectedJac[i][j], jac[i][j], 1e-10);
            }
        }

        // weightedResiduals = target - objective(start) = target (objective ที่ start=0 คือ [0,0,0])
        double[] wres = optimizer.getWeightedResidualsField();
        assertEquals(1.0, wres[0], 1e-10);
        assertEquals(1.0, wres[1], 1e-10);
        assertEquals(2.0, wres[2], 1e-10);
    }

    // ===================== Tests: Covariance / Sigma / Errors =====================

    @Test
    public void testComputeCovariancesAndSigma() {
        double[][] factors = {{1, 0}, {0, 1}, {1, 1}}; // rows=3, cols=2
        double[] target = {1.0, 1.0, 2.0};
        double[] weights = {1.0, 1.0, 1.0};
        double[] start = {0.0, 0.0};

        LinearOptimizer optimizer = new LinearOptimizer();
        PointVectorValuePair result =
            optimizer.optimize(100, new LinearProblem(factors), target, weights, start);

        double[][] covar = optimizer.computeCovariances(result.getPoint(), 1e-14);
        // J^T J = [[2,1],[1,2]] -> inverse = [[2/3,-1/3],[-1/3,2/3]]
        assertEquals(2.0 / 3.0, covar[0][0], 1e-8);
        assertEquals(2.0 / 3.0, covar[1][1], 1e-8);
        assertEquals(-1.0 / 3.0, covar[0][1], 1e-8);

        double[] sigma = optimizer.computeSigma(result.getPoint(), 1e-14);
        assertEquals(Math.sqrt(2.0 / 3.0), sigma[0], 1e-8);
        assertEquals(Math.sqrt(2.0 / 3.0), sigma[1], 1e-8);
    }

    @Test
    public void testGetCovariancesDefaultThresholdDelegates() {
        double[][] factors = {{1, 0}, {0, 1}, {1, 1}};
        double[] target = {1.0, 1.0, 2.0};
        double[] weights = {1.0, 1.0, 1.0};
        double[] start = {0.0, 0.0};

        LinearOptimizer optimizer = new LinearOptimizer();
        optimizer.optimize(100, new LinearProblem(factors), target, weights, start);

        double[][] viaDefault = optimizer.getCovariances(); // ใช้ DEFAULT_SINGULARITY_THRESHOLD = 1e-14
        double[][] viaExplicit = optimizer.computeCovariances(optimizer.getStartPoint(), 1e-14);

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                assertEquals(viaExplicit[i][j], viaDefault[i][j], 1e-10);
            }
        }
    }

    @Test
    public void testGuessParametersErrorsNormalCase() {
        double[][] factors = {{1, 0}, {0, 1}, {1, 1}}; // rows=3, cols=2 -> rows>cols
        double[] target = {1.0, 1.0, 2.0};
        double[] weights = {1.0, 1.0, 1.0};
        double[] start = {0.0, 0.0};

        LinearOptimizer optimizer = new LinearOptimizer();
        optimizer.optimize(100, new LinearProblem(factors), target, weights, start);

        double[] errors = optimizer.guessParametersErrors();
        // คำนวณได้ errors = [2, 2] (ดูรายละเอียดการคำนวณในคำอธิบาย)
        assertEquals(2.0, errors[0], 1e-6);
        assertEquals(2.0, errors[1], 1e-6);
    }

    @Test(expected = NumberIsTooSmallException.class)
    public void testGuessParametersErrorsThrowsWhenRowsLessOrEqualCols() {
        double[][] factors = {{1, 0}, {0, 1}}; // rows=2, cols=2 -> rows<=cols
        double[] target = {1.0, 1.0};
        double[] weights = {1.0, 1.0};
        double[] start = {0.0, 0.0};

        LinearOptimizer optimizer = new LinearOptimizer();
        optimizer.optimize(100, new LinearProblem(factors), target, weights, start);

        optimizer.guessParametersErrors(); // ต้อง throw เพราะ rows<=cols
    }

    @Test(expected = SingularMatrixException.class)
    public void testComputeCovariancesThrowsOnSingularMatrix() {
        // คอลัมน์ที่สองไม่มีผลต่อ output เลย -> J^T J เป็น singular matrix จริง
        double[][] factors = {{1, 0}, {1, 0}, {1, 0}};
        double[] target = {1.0, 1.0, 1.0};
        double[] weights = {1.0, 1.0, 1.0};
        double[] start = {0.0, 0.0};

        LinearOptimizer optimizer = new LinearOptimizer();
        PointVectorValuePair result =
            optimizer.optimize(100, new LinearProblem(factors), target, weights, start);

        optimizer.computeCovariances(result.getPoint(), 1e-14); // คาดหวัง SingularMatrixException
    }

    // ===================== Tests: Dimension mismatch / null =====================

    @Test(expected = DimensionMismatchException.class)
    public void testComputeWeightedJacobianDimensionMismatch() {
        // function คืนค่า output 3 ตัว แต่ target มีความยาว 2 -> mismatch
        double[][] factors = {{1, 0}, {0, 1}, {1, 1}}; // output length = 3
        double[] target = {1.0, 1.0};   // length 2 != 3
        double[] weights = {1.0, 1.0};
        double[] start = {0.0, 0.0};

        LinearOptimizer optimizer = new LinearOptimizer();
        // doOptimize() -> updateJacobian() -> computeWeightedJacobian() ต้อง throw
        optimizer.optimize(100, new LinearProblem(factors), target, weights, start);
    }

    @Test(expected = DimensionMismatchException.class)
    public void testComputeResidualsDimensionMismatch() {
        double[][] factors = {{1, 0}, {0, 1}, {1, 1}};
        double[] target = {1.0, 1.0, 2.0}; // length 3
        double[] weights = {1.0, 1.0, 1.0};
        double[] start = {0.0, 0.0};

        LinearOptimizer optimizer = new LinearOptimizer();
        optimizer.optimize(100, new LinearProblem(factors), target, weights, start);

        // ทดสอบ branch ตรวจสอบความยาวใน computeResiduals โดยตรง
        optimizer.publicComputeResiduals(new double[] {1.0, 2.0}); // length 2 != target length 3
    }

    @Test(expected = NullPointerException.class)
    public void testComputeResidualsNullInput() {
        double[][] factors = {{1, 0}, {0, 1}, {1, 1}};
        double[] target = {1.0, 1.0, 2.0};
        double[] weights = {1.0, 1.0, 1.0};
        double[] start = {0.0, 0.0};

        LinearOptimizer optimizer = new LinearOptimizer();
        optimizer.optimize(100, new LinearProblem(factors), target, weights, start);

        // objectiveValue.length บน null จะทำให้เกิด NPE (ไม่มี null-check ใน source ที่ให้มา)
        optimizer.publicComputeResiduals(null);
    }

    @Test(expected = NullPointerException.class)
    public void testComputeWeightedJacobianNullParams() {
        double[][] factors = {{1, 0}, {0, 1}, {1, 1}};
        double[] target = {1.0, 1.0, 2.0};
        double[] weights = {1.0, 1.0, 1.0};
        double[] start = {0.0, 0.0};

        LinearOptimizer optimizer = new LinearOptimizer();
        optimizer.optimize(100, new LinearProblem(factors), target, weights, start);

        // params.length บน null จะทำให้เกิด NPE
        optimizer.publicComputeWeightedJacobian(null);
    }

    @Test
    public void testOptimizeWithNullStartPointThrows() {
        // หมายเหตุ: InitialGuess/Target/Weight ไม่ได้อยู่ใน source ที่ให้มา
        // จึงไม่สามารถยืนยัน exception type ที่แน่นอนได้ (คาดว่าเป็น NullArgumentException
        // ตาม pattern ทั่วไปของ commons-math3) — ทดสอบแบบ generic ว่าต้อง throw บางอย่าง
        double[][] factors = {{1, 0}, {0, 1}, {1, 1}};
        double[] target = {1.0, 1.0, 2.0};
        double[] weights = {1.0, 1.0, 1.0};

        LinearOptimizer optimizer = new LinearOptimizer();
        boolean thrown = false;
        try {
            optimizer.optimize(100, new LinearProblem(factors), target, weights, null);
        } catch (RuntimeException e) {
            thrown = true;
        }
        assertTrue("Expected a RuntimeException when startPoint is null", thrown);
    }

    // ===================== Tests: overload ด้วย MultivariateDifferentiableVectorFunction =====================

    @Test
    public void testOptimizeWithMultivariateDifferentiableVectorFunctionOverload() {
        double[][] factors = {{1, 0}, {0, 1}, {1, 1}};
        double[] target = {1.0, 1.0, 2.0};
        double[] weights = {1.0, 1.0, 1.0};
        double[] start = {0.0, 0.0};

        LinearProblem problem = new LinearProblem(factors);
        MultivariateDifferentiableVectorFunction mdvf =
            FunctionUtils.toMultivariateDifferentiableVectorFunction(problem);

        LinearOptimizer optimizer = new LinearOptimizer();
        PointVectorValuePair result = optimizer.optimize(100, mdvf, target, weights, start);

        assertNotNull(result);
        assertEquals(0.0, result.getPoint()[0], 1e-10);
        assertEquals(0.0, result.getPoint()[1], 1e-10);
        assertEquals(6.0, optimizer.getChiSquare(), 1e-10);
    }

    // ===================== Tests: setCost / computeCost (white-box) =====================

    @Test
    public void testSetCostAndComputeCost() {
        double[][] factors = {{1, 0}, {0, 1}, {1, 1}};
        double[] target = {1.0, 1.0, 2.0};
        double[] weights = {1.0, 1.0, 1.0};
        double[] start = {0.0, 0.0};

        LinearOptimizer optimizer = new LinearOptimizer();
        optimizer.optimize(100, new LinearProblem(factors), target, weights, start);

        double computed = optimizer.publicComputeCost(new double[] {1.0, 1.0, 2.0});
        assertEquals(Math.sqrt(6.0), computed, 1e-10);

        optimizer.publicSetCost(42.0);
        assertEquals(42.0, optimizer.getCostField(), 1e-10);
        assertEquals(42.0 * 42.0, optimizer.getChiSquare(), 1e-10);
    }
}
