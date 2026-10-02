package org.apache.commons.math3.optim.nonlinear.vector.jacobian;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;

import org.apache.commons.math3.analysis.MultivariateMatrixFunction;
import org.apache.commons.math3.analysis.MultivariateVectorFunction;
import org.apache.commons.math3.exception.DimensionMismatchException;
import org.apache.commons.math3.linear.DiagonalMatrix;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.SingularMatrixException;
import org.apache.commons.math3.optim.InitialGuess;
import org.apache.commons.math3.optim.MaxEval;
import org.apache.commons.math3.optim.PointVectorValuePair;
import org.apache.commons.math3.optim.nonlinear.vector.ModelFunction;
import org.apache.commons.math3.optim.nonlinear.vector.ModelFunctionJacobian;
import org.apache.commons.math3.optim.nonlinear.vector.Target;
import org.apache.commons.math3.optim.nonlinear.vector.Weight;
import org.junit.Test;

/**
 * JUnit4 tests for {@link AbstractLeastSquaresOptimizer} (Defects4J Math-14b).
 *
 * หมายเหตุ: เนื่องจากคลาสเป้าหมายเป็น abstract และหลายเมธอดสำคัญ (computeResiduals,
 * computeWeightedJacobian, computeCost, setCost, parseOptimizationData ฯลฯ)
 * เป็น protected/private เราจึงสร้าง subclass "DummyOptimizer" เพื่อทดสอบผ่าน
 * public API (optimize) และ wrapper method เท่าที่จำเป็น
 * โดยไม่เดา behavior ใด ๆ ที่ไม่มีในซอร์สที่ให้มา
 */
public class AbstractLeastSquaresOptimizerTest {

    /**
     * Subclass สำหรับทดสอบ: ไม่ทำ iterative optimization จริง
     * เพียงคำนวณ objective ที่จุดเริ่มต้น, residual, cost แล้วคืนค่า
     * เพื่อเปิดทางให้ทดสอบ getChiSquare/getRMS/computeCovariances/computeSigma
     */
    private static class DummyOptimizer extends AbstractLeastSquaresOptimizer {
        DummyOptimizer() {
            // ConvergenceChecker ไม่ถูกใช้ เพราะ doOptimize() ถูก override สมบูรณ์
            super(null);
        }

        @Override
        protected PointVectorValuePair doOptimize() {
            final double[] params = getStartPoint();
            final double[] objective = computeObjectiveValue(params);
            final double[] residuals = computeResiduals(objective);
            setCost(computeCost(residuals));
            return new PointVectorValuePair(params, objective);
        }

        /** wrapper เพื่อเข้าถึง protected computeResiduals โดยตรงจาก test */
        public double[] callComputeResiduals(double[] objectiveValue) {
            return computeResiduals(objectiveValue);
        }
    }

    // ---------- Helper model/jacobian used by most tests ----------
    // f(params) = {params[0]*1, params[0]*2}; target = {2,4} -> exact solution param0 = 2
    private static final MultivariateVectorFunction LINEAR_MODEL =
        new MultivariateVectorFunction() {
            public double[] value(double[] params) {
                return new double[] { params[0] * 1.0, params[0] * 2.0 };
            }
        };

    private static final MultivariateMatrixFunction LINEAR_JACOBIAN =
        new MultivariateMatrixFunction() {
            public double[][] value(double[] params) {
                return new double[][] { { 1.0 }, { 2.0 } };
            }
        };

    /**
     * Test 1: ตรวจสอบ getChiSquare()/getRMS() หลังจาก optimize()
     * ด้วย Weight = identity, start point = 0 -> residual = target - 0 = {2,4}
     * cost^2 = 1*4 + 1*16 = 20
     */
    @Test
    public void testOptimizeComputesChiSquareAndRMS() {
        DummyOptimizer optimizer = new DummyOptimizer();
        optimizer.optimize(
            new MaxEval(1000),
            new Target(new double[] { 2.0, 4.0 }),
            new Weight(new DiagonalMatrix(new double[] { 1.0, 1.0 })),
            new ModelFunction(LINEAR_MODEL),
            new ModelFunctionJacobian(LINEAR_JACOBIAN),
            new InitialGuess(new double[] { 0.0 })
        );

        assertEquals(20.0, optimizer.getChiSquare(), 1e-9);
        assertEquals(Math.sqrt(10.0), optimizer.getRMS(), 1e-9);
    }

    /**
     * Test 2: computeCovariances และ computeSigma
     * weightedJacobian = J (เพราะ W = I) = [[1],[2]] -> J^T J = [[5]]
     * inverse = [[0.2]] -> sigma = sqrt(0.2)
     */
    @Test
    public void testComputeCovariancesAndSigma() {
        DummyOptimizer optimizer = new DummyOptimizer();
        PointVectorValuePair result = optimizer.optimize(
            new MaxEval(1000),
            new Target(new double[] { 2.0, 4.0 }),
            new Weight(new DiagonalMatrix(new double[] { 1.0, 1.0 })),
            new ModelFunction(LINEAR_MODEL),
            new ModelFunctionJacobian(LINEAR_JACOBIAN),
            new InitialGuess(new double[] { 0.0 })
        );

        double[] params = result.getPoint();
        double[][] cov = optimizer.computeCovariances(params, 1e-11);
        assertEquals(0.2, cov[0][0], 1e-9);

        double[] sigma = optimizer.computeSigma(params, 1e-11);
        assertEquals(Math.sqrt(0.2), sigma[0], 1e-9);
    }

    /**
     * Test 3: getWeightSquareRoot() ต้องคืนค่าที่ถูกต้อง (sqrt ของ identity = identity)
     * และเป็น copy (ไม่ reference เดียวกับ field ภายใน - ไม่สามารถตรวจสอบ reference
     * ได้ตรง ๆ จาก public API แต่ตรวจสอบค่าถูกต้องตามที่คาดหวังได้)
     */
    @Test
    public void testGetWeightSquareRootIdentity() {
        DummyOptimizer optimizer = new DummyOptimizer();
        optimizer.optimize(
            new MaxEval(1000),
            new Target(new double[] { 2.0, 4.0 }),
            new Weight(new DiagonalMatrix(new double[] { 1.0, 1.0 })),
            new ModelFunction(LINEAR_MODEL),
            new ModelFunctionJacobian(LINEAR_JACOBIAN),
            new InitialGuess(new double[] { 0.0 })
        );

        RealMatrix sqrtW = optimizer.getWeightSquareRoot();
        assertEquals(1.0, sqrtW.getEntry(0, 0), 1e-9);
        assertEquals(1.0, sqrtW.getEntry(1, 1), 1e-9);
        assertEquals(0.0, sqrtW.getEntry(0, 1), 1e-9);
        assertEquals(0.0, sqrtW.getEntry(1, 0), 1e-9);
    }

    /**
     * Test 4: parseOptimizationData loop - กรณี Weight ไม่ใช่ element แรกใน varargs
     * (ครอบคลุม branch: data instanceof Weight == false -> continue loop,
     * แล้วเจอ true -> break)
     */
    @Test
    public void testParseOptimizationData_WeightNotFirstElement() {
        DummyOptimizer optimizer = new DummyOptimizer();
        optimizer.optimize(
            new MaxEval(1000),
            new Target(new double[] { 2.0, 4.0 }),       // ไม่ใช่ Weight -> loop ดำเนินต่อ
            new ModelFunction(LINEAR_MODEL),              // ไม่ใช่ Weight
            new Weight(new DiagonalMatrix(new double[] { 4.0, 1.0 })), // พบ Weight -> break
            new ModelFunctionJacobian(LINEAR_JACOBIAN),
            new InitialGuess(new double[] { 0.0 })
        );

        RealMatrix sqrtW = optimizer.getWeightSquareRoot();
        // sqrt(diag(4,1)) = diag(2,1)
        assertEquals(2.0, sqrtW.getEntry(0, 0), 1e-9);
        assertEquals(1.0, sqrtW.getEntry(1, 1), 1e-9);
    }

    /**
     * Test 5: Weight ที่ set ไว้ในครั้งก่อนต้องถูก "reuse" ถ้าไม่ได้ส่งมาในครั้งถัดไป
     * (ตามคอมเมนต์ในซอร์ส: "The existing values ... are reused if not provided")
     */
    @Test
    public void testWeightReusedWhenNotProvidedInSecondCall() {
        DummyOptimizer optimizer = new DummyOptimizer();

        // First call: ตั้ง Weight = diag(4,1)
        optimizer.optimize(
            new MaxEval(1000),
            new Target(new double[] { 2.0, 4.0 }),
            new Weight(new DiagonalMatrix(new double[] { 4.0, 1.0 })),
            new ModelFunction(LINEAR_MODEL),
            new ModelFunctionJacobian(LINEAR_JACOBIAN),
            new InitialGuess(new double[] { 0.0 })
        );
        RealMatrix sqrtWBefore = optimizer.getWeightSquareRoot();

        // Second call: ไม่ส่ง Weight -> ควร reuse ค่าก่อนหน้า
        optimizer.optimize(
            new MaxEval(1000),
            new Target(new double[] { 3.0, 6.0 }),
            new ModelFunction(LINEAR_MODEL),
            new ModelFunctionJacobian(LINEAR_JACOBIAN),
            new InitialGuess(new double[] { 1.0 })
        );
        RealMatrix sqrtWAfter = optimizer.getWeightSquareRoot();

        assertEquals(sqrtWBefore.getEntry(0, 0), sqrtWAfter.getEntry(0, 0), 1e-9);
        assertEquals(sqrtWBefore.getEntry(1, 1), sqrtWAfter.getEntry(1, 1), 1e-9);
    }

    /**
     * Test 6: Edge case - ไม่เคยส่ง Weight เลยตั้งแต่แรก -> weightMatrixSqrt ยังเป็น null
     * -> เรียก optimize() ซึ่งภายในเรียก computeWeightedJacobian (ผ่าน computeCost ไม่เกี่ยว
     * แต่ computeWeightedJacobian ถูกเรียกจาก computeCovariances) ต้องได้ NullPointerException
     * หมายเหตุ: เป็นผลโดยตรงจาก field ที่ไม่ได้ initialize ไม่ใช่การเดา behavior เพิ่มเติม
     */
    @Test(expected = NullPointerException.class)
    public void testWeightNeverSet_NullPointerExceptionOnWeightedJacobian() {
        DummyOptimizer optimizer = new DummyOptimizer();
        PointVectorValuePair result = optimizer.optimize(
            new MaxEval(1000),
            new Target(new double[] { 2.0, 4.0 }),
            new ModelFunction(LINEAR_MODEL),
            new ModelFunctionJacobian(LINEAR_JACOBIAN),
            new InitialGuess(new double[] { 0.0 })
            // ไม่มี Weight เลย
        );
        // doOptimize() เรียก computeCost -> getWeight() ซึ่งเป็นของ parent class (ไม่ null)
        // แต่ computeCovariances เรียก computeWeightedJacobian ที่ใช้ weightMatrixSqrt (private field)
        optimizer.computeCovariances(result.getPoint(), 1e-11);
    }

    /**
     * Test 7: computeResiduals ต้อง throw DimensionMismatchException
     * เมื่อ objectiveValue.length != target.length (malformed input)
     */
    @Test(expected = DimensionMismatchException.class)
    public void testComputeResiduals_DimensionMismatchThrows() {
        DummyOptimizer optimizer = new DummyOptimizer();
        // เรียก optimize ปกติก่อนเพื่อ set target (length = 2)
        optimizer.optimize(
            new MaxEval(1000),
            new Target(new double[] { 2.0, 4.0 }),
            new Weight(new DiagonalMatrix(new double[] { 1.0, 1.0 })),
            new ModelFunction(LINEAR_MODEL),
            new ModelFunctionJacobian(LINEAR_JACOBIAN),
            new InitialGuess(new double[] { 0.0 })
        );

        // objectiveValue length = 1 != target length = 2 -> ต้อง throw
        optimizer.callComputeResiduals(new double[] { 1.0 });
    }

    /**
     * Test 8: computeResiduals กรณี length ตรงกัน (boundary: เท่ากันพอดี) ต้องไม่ throw
     * และค่าที่คำนวณต้องถูกต้อง (target[i] - objectiveValue[i])
     */
    @Test
    public void testComputeResiduals_MatchingLengths_NoException() {
        DummyOptimizer optimizer = new DummyOptimizer();
        optimizer.optimize(
            new MaxEval(1000),
            new Target(new double[] { 2.0, 4.0 }),
            new Weight(new DiagonalMatrix(new double[] { 1.0, 1.0 })),
            new ModelFunction(LINEAR_MODEL),
            new ModelFunctionJacobian(LINEAR_JACOBIAN),
            new InitialGuess(new double[] { 0.0 })
        );

        double[] residuals = optimizer.callComputeResiduals(new double[] { 1.0, 1.0 });
        assertEquals(1.0, residuals[0], 1e-9);
        assertEquals(3.0, residuals[1], 1e-9);
    }

    /**
     * Test 9: computeCovariances ต้อง throw SingularMatrixException
     * เมื่อ Jacobian ทำให้ J^T J เป็น singular matrix (กรณี Jacobian = 0 ทั้งหมด)
     */
    @Test(expected = SingularMatrixException.class)
    public void testComputeCovariances_SingularMatrixThrows() {
        MultivariateVectorFunction zeroModel = new MultivariateVectorFunction() {
            public double[] value(double[] params) {
                return new double[] { 0.0, 0.0 };
            }
        };
        MultivariateMatrixFunction zeroJacobian = new MultivariateMatrixFunction() {
            public double[][] value(double[] params) {
                return new double[][] { { 0.0 }, { 0.0 } };
            }
        };

        DummyOptimizer optimizer = new DummyOptimizer();
        PointVectorValuePair result = optimizer.optimize(
            new MaxEval(1000),
            new Target(new double[] { 5.0, 5.0 }),
            new Weight(new DiagonalMatrix(new double[] { 1.0, 1.0 })),
            new ModelFunction(zeroModel),
            new ModelFunctionJacobian(zeroJacobian),
            new InitialGuess(new double[] { 0.0 })
        );

        optimizer.computeCovariances(result.getPoint(), 1e-11);
    }

    /**
     * Test 10: กรณี perfect fit (residual = 0 พอดี) -> chiSquare และ RMS ต้องเป็น 0
     * (boundary case: cost = 0)
     */
    @Test
    public void testPerfectFit_ChiSquareAndRMSAreZero() {
        DummyOptimizer optimizer = new DummyOptimizer();
        // start point = 2 -> model output = {2,4} = target -> residual = 0
        optimizer.optimize(
            new MaxEval(1000),
            new Target(new double[] { 2.0, 4.0 }),
            new Weight(new DiagonalMatrix(new double[] { 1.0, 1.0 })),
            new ModelFunction(LINEAR_MODEL),
            new ModelFunctionJacobian(LINEAR_JACOBIAN),
            new InitialGuess(new double[] { 2.0 })
        );

        assertEquals(0.0, optimizer.getChiSquare(), 1e-9);
        assertEquals(0.0, optimizer.getRMS(), 1e-9);
    }
}
