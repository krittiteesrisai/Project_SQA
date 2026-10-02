# JUnit 4 Test Suite สำหรับ `AbstractLeastSquaresOptimizer`

## หมายเหตุสำคัญก่อนเริ่ม
- คลาสเป้าหมายเป็น `abstract class` จึงต้องสร้าง **concrete subclass** (`TestOptimizer`) เพื่อ instantiate และเข้าถึง protected method ผ่าน wrapper methods
- เนื่องจาก test class อยู่ใน package เดียวกัน (`org.apache.commons.math.optimization.general`) จึงสามารถเข้าถึง protected fields (`jacobian`, `residuals`, `cost`) ได้โดยตรง
- ไม่มีการเดา behavior ใดๆ ที่ไม่มีในซอร์ส เช่น การตรวจสอบ null ของ `setConvergenceChecker` — คอมเมนต์ไว้ชัดเจนว่าไม่มี null-check ในซอร์ส

```java
package org.apache.commons.math.optimization.general;

import static org.junit.Assert.*;

import org.apache.commons.math.FunctionEvaluationException;
import org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction;
import org.apache.commons.math.analysis.MultivariateMatrixFunction;
import org.apache.commons.math.optimization.OptimizationException;
import org.apache.commons.math.optimization.SimpleVectorialValueChecker;
import org.apache.commons.math.optimization.VectorialConvergenceChecker;
import org.apache.commons.math.optimization.VectorialPointValuePair;

import org.junit.Before;
import org.junit.Test;

public class AbstractLeastSquaresOptimizerTest {

    /** Concrete subclass to allow instantiation and access protected methods for testing. */
    private static class TestOptimizer extends AbstractLeastSquaresOptimizer {
        private VectorialPointValuePair fixedResult;

        protected VectorialPointValuePair doOptimize()
            throws FunctionEvaluationException, OptimizationException, IllegalArgumentException {
            if (fixedResult != null) {
                return fixedResult;
            }
            updateResidualsAndCost();
            updateJacobian();
            return new VectorialPointValuePair(point, objective);
        }

        void setFixedResult(VectorialPointValuePair result) {
            this.fixedResult = result;
        }

        // Expose protected methods for direct unit testing.
        void callUpdateJacobian() throws FunctionEvaluationException {
            updateJacobian();
        }

        void callUpdateResidualsAndCost() throws FunctionEvaluationException {
            updateResidualsAndCost();
        }

        void callIncrementIterationsCounter() throws OptimizationException {
            incrementIterationsCounter();
        }
    }

    /** Simple linear differentiable function with a fixed (constant) jacobian. */
    private static class LinearFunction implements DifferentiableMultivariateVectorialFunction {
        private final double[][] jacobianMatrix;

        LinearFunction(double[][] jacobianMatrix) {
            this.jacobianMatrix = jacobianMatrix;
        }

        public double[] value(double[] point) throws FunctionEvaluationException {
            int rows = jacobianMatrix.length;
            double[] result = new double[rows];
            for (int i = 0; i < rows; i++) {
                double sum = 0;
                for (int j = 0; j < point.length; j++) {
                    sum += jacobianMatrix[i][j] * point[j];
                }
                result[i] = sum;
            }
            return result;
        }

        public MultivariateMatrixFunction jacobian() {
            return new MultivariateMatrixFunction() {
                public double[][] value(double[] point) throws FunctionEvaluationException {
                    // Clone each call so in-place scaling in updateJacobian() does not
                    // corrupt the original matrix between successive optimize() calls.
                    double[][] clone = new double[jacobianMatrix.length][];
                    for (int i = 0; i < jacobianMatrix.length; i++) {
                        clone[i] = jacobianMatrix[i].clone();
                    }
                    return clone;
                }
            };
        }
    }

    /** Function whose value() returns a wrong-sized array (for dimension-mismatch tests). */
    private static class WrongSizeValueFunction implements DifferentiableMultivariateVectorialFunction {
        private final int wrongSize;

        WrongSizeValueFunction(int wrongSize) {
            this.wrongSize = wrongSize;
        }

        public double[] value(double[] point) throws FunctionEvaluationException {
            return new double[wrongSize];
        }

        public MultivariateMatrixFunction jacobian() {
            return new MultivariateMatrixFunction() {
                public double[][] value(double[] point) throws FunctionEvaluationException {
                    return new double[point.length][point.length];
                }
            };
        }
    }

    /** Function whose jacobian() returns a wrong-sized matrix (for dimension-mismatch tests). */
    private static class WrongSizeJacobianFunction implements DifferentiableMultivariateVectorialFunction {
        private final int wrongRows;

        WrongSizeJacobianFunction(int wrongRows) {
            this.wrongRows = wrongRows;
        }

        public double[] value(double[] point) throws FunctionEvaluationException {
            return point.clone();
        }

        public MultivariateMatrixFunction jacobian() {
            return new MultivariateMatrixFunction() {
                public double[][] value(double[] point) throws FunctionEvaluationException {
                    return new double[wrongRows][point.length];
                }
            };
        }
    }

    private TestOptimizer optimizer;

    @Before
    public void setUp() {
        optimizer = new TestOptimizer();
    }

    // ---------------------------------------------------------------
    // Constructor / default settings
    // ---------------------------------------------------------------

    @Test
    public void testDefaultConstructorSettings() {
        assertEquals(AbstractLeastSquaresOptimizer.DEFAULT_MAX_ITERATIONS,
                     optimizer.getMaxIterations());
        assertEquals(Integer.MAX_VALUE, optimizer.getMaxEvaluations());
        assertTrue(optimizer.getConvergenceChecker() instanceof SimpleVectorialValueChecker);
        assertEquals(0, optimizer.getIterations());
        assertEquals(0, optimizer.getEvaluations());
        assertEquals(0, optimizer.getJacobianEvaluations());
    }

    // ---------------------------------------------------------------
    // Getter / setter pairs
    // ---------------------------------------------------------------

    @Test
    public void testSetGetMaxIterations() {
        optimizer.setMaxIterations(50);
        assertEquals(50, optimizer.getMaxIterations());
    }

    @Test
    public void testSetGetMaxEvaluations() {
        optimizer.setMaxEvaluations(500);
        assertEquals(500, optimizer.getMaxEvaluations());
    }

    @Test
    public void testSetGetConvergenceChecker() {
        VectorialConvergenceChecker customChecker = new SimpleVectorialValueChecker();
        optimizer.setConvergenceChecker(customChecker);
        assertSame(customChecker, optimizer.getConvergenceChecker());
    }

    @Test
    public void testSetConvergenceCheckerNull() {
        // ไม่มี null-check ในซอร์สโค้ด: ทดสอบว่าค่า null ถูกเก็บตามพฤติกรรมจริง
        optimizer.setConvergenceChecker(null);
        assertNull(optimizer.getConvergenceChecker());
    }

    // ---------------------------------------------------------------
    // incrementIterationsCounter()
    // ---------------------------------------------------------------

    @Test
    public void testIncrementIterationsCounterWithinLimit() throws OptimizationException {
        optimizer.setMaxIterations(3);
        optimizer.callIncrementIterationsCounter();
        optimizer.callIncrementIterationsCounter();
        optimizer.callIncrementIterationsCounter();
        assertEquals(3, optimizer.getIterations());
    }

    @Test(expected = OptimizationException.class)
    public void testIncrementIterationsCounterExceedsLimit() throws OptimizationException {
        optimizer.setMaxIterations(1);
        optimizer.callIncrementIterationsCounter();
        optimizer.callIncrementIterationsCounter(); // iterations=2 > 1 -> throw
    }

    @Test
    public void testIncrementIterationsCounterBoundaryExactlyAtLimit() throws OptimizationException {
        optimizer.setMaxIterations(2);
        optimizer.callIncrementIterationsCounter(); // iterations=1, OK
        optimizer.callIncrementIterationsCounter(); // iterations=2, not > max, OK
        assertEquals(2, optimizer.getIterations());
    }

    // ---------------------------------------------------------------
    // optimize() - dimension mismatch between target and weights
    // ---------------------------------------------------------------

    @Test(expected = OptimizationException.class)
    public void testOptimizeThrowsWhenTargetWeightsLengthMismatch()
        throws FunctionEvaluationException, OptimizationException {
        DifferentiableMultivariateVectorialFunction f =
            new LinearFunction(new double[][] { {1.0}, {1.0} });
        double[] target = {1.0, 2.0};
        double[] weights = {1.0}; // mismatched length
        double[] start = {1.0};
        optimizer.optimize(f, target, weights, start);
    }

    @Test
    public void testOptimizeSetsUpProblemAndCallsDoOptimize()
        throws FunctionEvaluationException, OptimizationException {
        double[][] jac = { {1.0, 0.0}, {0.0, 1.0} };
        DifferentiableMultivariateVectorialFunction f = new LinearFunction(jac);
        double[] target = {3.0, 4.0};
        double[] weights = {1.0, 1.0};
        double[] start = {1.0, 1.0};

        VectorialPointValuePair expected =
            new VectorialPointValuePair(start, new double[] {3.0, 4.0});
        optimizer.setFixedResult(expected);

        VectorialPointValuePair result = optimizer.optimize(f, target, weights, start);

        assertSame(expected, result);
        assertEquals(0, optimizer.getIterations());
        assertEquals(0, optimizer.getEvaluations());        // fixedResult path skips updateResidualsAndCost
        assertEquals(0, optimizer.getJacobianEvaluations()); // fixedResult path skips updateJacobian
    }

    // ---------------------------------------------------------------
    // updateJacobian()
    // ---------------------------------------------------------------

    @Test
    public void testUpdateJacobianComputesScaledValuesCorrectly()
        throws FunctionEvaluationException, OptimizationException {
        double[][] jac = { {2.0, 3.0}, {4.0, 5.0} };
        DifferentiableMultivariateVectorialFunction f = new LinearFunction(jac);
        double[] target = {0.0, 0.0};
        double[] weights = {4.0, 9.0}; // sqrt(4)=2, sqrt(9)=3
        double[] start = {1.0, 1.0};

        optimizer.setFixedResult(new VectorialPointValuePair(start, new double[] {0, 0}));
        optimizer.optimize(f, target, weights, start);

        optimizer.callUpdateJacobian();

        double[][] result = optimizer.jacobian;
        assertEquals(-4.0, result[0][0], 1e-9);
        assertEquals(-6.0, result[0][1], 1e-9);
        assertEquals(-12.0, result[1][0], 1e-9);
        assertEquals(-15.0, result[1][1], 1e-9);
        assertEquals(1, optimizer.getJacobianEvaluations());
    }

    @Test(expected = FunctionEvaluationException.class)
    public void testUpdateJacobianThrowsOnDimensionMismatch()
        throws FunctionEvaluationException, OptimizationException {
        DifferentiableMultivariateVectorialFunction f = new WrongSizeJacobianFunction(5);
        double[] target = {1.0, 2.0};
        double[] weights = {1.0, 1.0};
        double[] start = {1.0, 1.0};

        optimizer.setFixedResult(new VectorialPointValuePair(start, target));
        optimizer.optimize(f, target, weights, start);

        optimizer.callUpdateJacobian();
    }

    // ---------------------------------------------------------------
    // updateResidualsAndCost()
    // ---------------------------------------------------------------

    @Test
    public void testUpdateResidualsAndCostComputesCorrectly()
        throws FunctionEvaluationException, OptimizationException {
        double[][] jac = { {1.0, 0.0}, {0.0, 1.0} };
        DifferentiableMultivariateVectorialFunction f = new LinearFunction(jac);
        double[] target = {5.0, 5.0};
        double[] weights = {1.0, 1.0};
        double[] start = {2.0, 3.0};

        optimizer.setFixedResult(new VectorialPointValuePair(start, new double[] {2.0, 3.0}));
        optimizer.optimize(f, target, weights, start);

        optimizer.callUpdateResidualsAndCost();

        assertEquals(3.0, optimizer.residuals[0], 1e-9);
        assertEquals(2.0, optimizer.residuals[1], 1e-9);
        double expectedCost = Math.sqrt(1.0 * 9 + 1.0 * 4);
        assertEquals(expectedCost, optimizer.cost, 1e-9);
        assertEquals(1, optimizer.getEvaluations());
    }

    @Test(expected = FunctionEvaluationException.class)
    public void testUpdateResidualsAndCostThrowsOnDimensionMismatch()
        throws FunctionEvaluationException, OptimizationException {
        DifferentiableMultivariateVectorialFunction f = new WrongSizeValueFunction(1);
        double[] target = {1.0, 2.0};
        double[] weights = {1.0, 1.0};
        double[] start = {1.0, 1.0};

        optimizer.setFixedResult(new VectorialPointValuePair(start, target));
        optimizer.optimize(f, target, weights, start);

        optimizer.callUpdateResidualsAndCost();
    }

    @Test(expected = FunctionEvaluationException.class)
    public void testUpdateResidualsAndCostThrowsWhenMaxEvaluationsExceeded()
        throws FunctionEvaluationException, OptimizationException {
        double[][] jac = { {1.0} };
        DifferentiableMultivariateVectorialFunction f = new LinearFunction(jac);
        double[] target = {1.0};
        double[] weights = {1.0};
        double[] start = {1.0};

        optimizer.setMaxEvaluations(1);
        optimizer.setFixedResult(new VectorialPointValuePair(start, target));
        optimizer.optimize(f, target, weights, start);

        optimizer.callUpdateResidualsAndCost(); // evaluations=1, OK
        optimizer.callUpdateResidualsAndCost(); // evaluations=2 > 1 -> throw
    }

    // ---------------------------------------------------------------
    // getRMS()
    // ---------------------------------------------------------------

    @Test
    public void testGetRMS() throws FunctionEvaluationException, OptimizationException {
        double[][] jac = { {1.0, 0.0}, {0.0, 1.0} };
        DifferentiableMultivariateVectorialFunction f = new LinearFunction(jac);
        double[] target = {5.0, 5.0};
        double[] weights = {1.0, 1.0};
        double[] start = {2.0, 3.0};

        optimizer.setFixedResult(new VectorialPointValuePair(start, new double[] {2.0, 3.0}));
        optimizer.optimize(f, target, weights, start);
        optimizer.callUpdateResidualsAndCost();

        double expectedRMS = Math.sqrt((9.0 + 4.0) / 2);
        assertEquals(expectedRMS, optimizer.getRMS(), 1e-9);
    }

    // ---------------------------------------------------------------
    // getChiSquare()
    // ---------------------------------------------------------------

    @Test
    public void testGetChiSquare() throws FunctionEvaluationException, OptimizationException {
        double[][] jac = { {1.0, 0.0}, {0.0, 1.0} };
        DifferentiableMultivariateVectorialFunction f = new LinearFunction(jac);
        double[] target = {5.0, 5.0};
        double[] weights = {2.0, 4.0};
        double[] start = {2.0, 3.0};

        optimizer.setFixedResult(new VectorialPointValuePair(start, new double[] {2.0, 3.0}));
        optimizer.optimize(f, target, weights, start);
        optimizer.callUpdateResidualsAndCost();

        // residual0=3, residual1=2 -> chiSquare = 9/2 + 4/4 = 5.5
        assertEquals(5.5, optimizer.getChiSquare(), 1e-9);
    }

    // ---------------------------------------------------------------
    // getCovariances()
    // ---------------------------------------------------------------

    @Test
    public void testGetCovariancesNormalCase()
        throws FunctionEvaluationException, OptimizationException {
        double[][] jac = { {1.0, 0.0}, {0.0, 1.0} };
        DifferentiableMultivariateVectorialFunction f = new LinearFunction(jac);
        double[] target = {0.0, 0.0};
        double[] weights = {1.0, 1.0};
        double[] start = {1.0, 1.0};

        optimizer.setFixedResult(new VectorialPointValuePair(start, new double[] {0, 0}));
        optimizer.optimize(f, target, weights, start);

        double[][] covar = optimizer.getCovariances();
        assertEquals(2, covar.length);
        assertEquals(2, covar[0].length);
        assertEquals(1.0, covar[0][0], 1e-6);
        assertEquals(1.0, covar[1][1], 1e-6);
        assertEquals(0.0, covar[0][1], 1e-6);
        assertEquals(0.0, covar[1][0], 1e-6);
    }

    @Test(expected = OptimizationException.class)
    public void testGetCovariancesThrowsWhenSingular()
        throws FunctionEvaluationException, OptimizationException {
        // Zero column -> J^T J singular
        double[][] jac = { {1.0, 0.0}, {1.0, 0.0} };
        DifferentiableMultivariateVectorialFunction f = new LinearFunction(jac);
        double[] target = {0.0, 0.0};
        double[] weights = {1.0, 1.0};
        double[] start = {1.0, 1.0};

        optimizer.setFixedResult(new VectorialPointValuePair(start, new double[] {0, 0}));
        optimizer.optimize(f, target, weights, start);

        optimizer.getCovariances();
    }

    // ---------------------------------------------------------------
    // guessParametersErrors()
    // ---------------------------------------------------------------

    @Test(expected = OptimizationException.class)
    public void testGuessParametersErrorsThrowsWhenRowsLessOrEqualCols()
        throws FunctionEvaluationException, OptimizationException {
        // rows == cols -> no degrees of freedom
        double[][] jac = { {1.0, 0.0}, {0.0, 1.0} };
        DifferentiableMultivariateVectorialFunction f = new LinearFunction(jac);
        double[] target = {1.0, 1.0};
        double[] weights = {1.0, 1.0};
        double[] start = {0.5, 0.5};

        optimizer.setFixedResult(new VectorialPointValuePair(start, new double[] {0.5, 0.5}));
        optimizer.optimize(f, target, weights, start);
        optimizer.callUpdateResidualsAndCost();

        optimizer.guessParametersErrors();
    }

    @Test
    public void testGuessParametersErrorsNormalCase()
        throws FunctionEvaluationException, OptimizationException {
        // rows(3) > cols(1): over-determined simple linear problem
        double[][] jac = { {1.0}, {1.0}, {1.0} };
        DifferentiableMultivariateVectorialFunction f = new LinearFunction(jac);
        double[] target = {1.0, 2.0, 3.0};
        double[] weights = {1.0, 1.0, 1.0};
        double[] start = {2.0};

        optimizer.setFixedResult(new VectorialPointValuePair(start, new double[] {2.0, 2.0, 2.0}));
        optimizer.optimize(f, target, weights, start);
        optimizer.callUpdateResidualsAndCost();

        double[] errors = optimizer.guessParametersErrors();
        assertEquals(1, errors.length);
        // chiSquare = 1+0+1 = 2 ; c = sqrt(2/2)=1 ; jTj = 3 -> covar=1/3
        double expectedError = Math.sqrt(1.0 / 3.0);
        assertEquals(expectedError, errors[0], 1e-6);
    }
}
```

## ตารางสรุป Branch/Condition Coverage

| Test Method | Branch/Condition ที่ครอบคลุม |
|---|---|
| `testDefaultConstructorSettings` | Constructor: `setConvergenceChecker`, `setMaxIterations(100)`, `setMaxEvaluations(MAX_VALUE)` |
| `testSetGetMaxIterations` | setter/getter `maxIterations` |
| `testSetGetMaxEvaluations` | setter/getter `maxEvaluations` |
| `testSetGetConvergenceChecker` | setter/getter `checker` (non-null) |
| `testSetConvergenceCheckerNull` | setter กับ null (ไม่มี null-check ในซอร์ส) |
| `testIncrementIterationsCounterWithinLimit` | `if(++iterations > maxIterations)` → **false** หลายครั้ง |
| `testIncrementIterationsCounterExceedsLimit` | `if(++iterations > maxIterations)` → **true** → throw `OptimizationException` |
| `testIncrementIterationsCounterBoundaryExactlyAtLimit` | boundary: `iterations == maxIterations` (ไม่ throw) |
| `testOptimizeThrowsWhenTargetWeightsLengthMismatch` | `if(target.length != weights.length)` → **true** |
| `testOptimizeSetsUpProblemAndCallsDoOptimize` | `if(target.length != weights.length)` → **false**; field setup (`rows`,`cols`,`cost=∞`) |
| `testUpdateJacobianComputesScaledValuesCorrectly` | `if(jacobian.length != rows)` → **false**; loop `i,j` scaling factor `-sqrt(weight)` |
| `testUpdateJacobianThrowsOnDimensionMismatch` | `if(jacobian.length != rows)` → **true** → throw |
| `testUpdateResidualsAndCostComputesCorrectly` | `if(++objectiveEvaluations > maxEvaluations)` → **false**; `if(objective.length != rows)` → **false**; loop คำนวณ `residual`,`cost` |
| `testUpdateResidualsAndCostThrowsOnDimensionMismatch` | `if(objective.length != rows)` → **true** |
| `testUpdateResidualsAndCostThrowsWhenMaxEvaluationsExceeded` | `if(++objectiveEvaluations > maxEvaluations)` → **true** |
| `testGetRMS` | loop `for i<rows` ใน `getRMS()` |
| `testGetChiSquare` | loop `for i<rows` ใน `getChiSquare()` |
| `testGetCovariancesNormalCase` | `try` branch success ใน `getCovariances()` |
| `testGetCovariancesThrowsWhenSingular` | `catch(InvalidMatrixException)` → throw `OptimizationException` |
| `testGuessParametersErrorsThrowsWhenRowsLessOrEqualCols` | `if(rows <= cols)` → **true** |
| `testGuessParametersErrorsNormalCase` | `if(rows <= cols)` → **false**; loop คำนวณ `errors[i]` |

**หมายเหตุ:** บางกรณี (เช่น `MaxIterationsExceededException`, `MaxEvaluationsExceededException` เป็น cause ภายใน exception) ไม่ได้ assert รายละเอียด cause เพราะไม่ปรากฏ getter ใน public API ของคลาสเป้าหมายที่ให้มา — ทดสอบเฉพาะ exception type ที่ throw ออกมาตามซอร์สจริง