package org.apache.commons.math.estimation;

import static org.junit.Assert.*;
import org.junit.Test;

/**
 * Unit tests for {@link AbstractEstimator}.
 *
 * หมายเหตุ: คลาสทดสอบอยู่ใน package เดียวกับคลาสเป้าหมาย
 * เพื่อให้สามารถเรียกเมธอด protected (updateJacobian, updateResidualsAndCost,
 * incrementJacobianEvaluationsCounter, initializeEstimate) และเข้าถึง field
 * protected (cols, rows, jacobian, residuals, cost) ได้โดยตรง
 */
public class AbstractEstimatorTest {

    // ---------------------------------------------------------------
    // Test doubles
    // ---------------------------------------------------------------

    /** Concrete subclass เพราะ AbstractEstimator เป็น abstract class */
    private static class TestEstimator extends AbstractEstimator {
        @Override
        public void estimate(EstimationProblem problem) throws EstimationException {
            // ไม่ได้ทดสอบ logic การลู่เข้าของ estimate() เพราะไม่มีใน scope ของคลาสนี้
            initializeEstimate(problem);
        }
    }

    /**
     * Test double ของ WeightedMeasurement
     * สมมติฐาน: constructor คือ (weight, measuredValue) และ getResidual()
     * ในคลาสฐานคำนวณจาก measuredValue - getTheoreticalValue()
     */
    private static class FixedPartialMeasurement extends WeightedMeasurement {
        private final double theoretical;
        private final double partial;

        FixedPartialMeasurement(double weight, double measuredValue,
                                 double theoretical, double partial) {
            super(weight, measuredValue);
            this.theoretical = theoretical;
            this.partial = partial;
        }

        @Override
        public double getTheoreticalValue() {
            return theoretical;
        }

        @Override
        public double getPartial(EstimatedParameter parameter) {
            // ไม่สนใจว่า parameter ตัวไหนถูกส่งมา เพราะ test-case ออกแบบให้มีค่าคงที่
            return partial;
        }
    }

    /** Test double ของ EstimationProblem ตาม method ที่ AbstractEstimator เรียกใช้จริง */
    private static class TestProblem implements EstimationProblem {
        private final WeightedMeasurement[] measurements;
        private final EstimatedParameter[] allParameters;
        private final EstimatedParameter[] unboundParameters;

        TestProblem(WeightedMeasurement[] measurements,
                    EstimatedParameter[] allParameters,
                    EstimatedParameter[] unboundParameters) {
            this.measurements = measurements;
            this.allParameters = allParameters;
            this.unboundParameters = unboundParameters;
        }

        public WeightedMeasurement[] getMeasurements() {
            return measurements;
        }

        public EstimatedParameter[] getAllParameters() {
            return allParameters;
        }

        public EstimatedParameter[] getUnboundParameters() {
            return unboundParameters;
        }
    }

    // ---------------------------------------------------------------
    // Helper builders
    // ---------------------------------------------------------------

    /** 1 unbound parameter, 3 measurements, weight=1, partial=1 (เหมือนประมาณค่าคงที่) */
    private TestProblem buildSimpleProblem() {
        EstimatedParameter p = new EstimatedParameter("p1", 2.0); // สมมติฐาน constructor(name, value)
        EstimatedParameter[] all = new EstimatedParameter[] { p };
        WeightedMeasurement[] ms = new WeightedMeasurement[] {
            new FixedPartialMeasurement(1.0, 3.0, 2.0, 1.0),
            new FixedPartialMeasurement(1.0, 4.0, 2.0, 1.0),
            new FixedPartialMeasurement(1.0, 5.0, 2.0, 1.0)
        };
        return new TestProblem(ms, all, all);
    }

    /** 2 unbound parameters ที่ partial เท่ากันเสมอ -> jTj เป็น singular matrix */
    private TestProblem buildSingularProblem() {
        EstimatedParameter p1 = new EstimatedParameter("p1", 1.0);
        EstimatedParameter p2 = new EstimatedParameter("p2", 1.0);
        EstimatedParameter[] all = new EstimatedParameter[] { p1, p2 };
        WeightedMeasurement[] ms = new WeightedMeasurement[] {
            new FixedPartialMeasurement(1.0, 1.0, 0.0, 2.0),
            new FixedPartialMeasurement(1.0, 1.0, 0.0, 2.0)
        };
        return new TestProblem(ms, all, all);
    }

    /** Empty measurements - สำหรับทดสอบ edge-case ของ loop/การหารด้วยศูนย์ */
    private TestProblem buildEmptyProblem() {
        EstimatedParameter p = new EstimatedParameter("p1", 2.0);
        EstimatedParameter[] all = new EstimatedParameter[] { p };
        WeightedMeasurement[] ms = new WeightedMeasurement[0];
        return new TestProblem(ms, all, all);
    }

    // ---------------------------------------------------------------
    // setMaxCostEval / getCostEvaluations / getJacobianEvaluations
    // ---------------------------------------------------------------

    @Test
    public void testInitialCountersAreZero() {
        TestEstimator est = new TestEstimator();
        assertEquals(0, est.getCostEvaluations());
        assertEquals(0, est.getJacobianEvaluations());
    }

    @Test
    public void testIncrementJacobianEvaluationsCounter() {
        TestEstimator est = new TestEstimator();
        est.incrementJacobianEvaluationsCounter();
        est.incrementJacobianEvaluationsCounter();
        assertEquals(2, est.getJacobianEvaluations());
    }

    @Test
    public void testSetMaxCostEvalAllowsEvaluationUnderLimit() throws Exception {
        TestEstimator est = new TestEstimator();
        est.setMaxCostEval(5);
        est.initializeEstimate(buildSimpleProblem());
        est.updateResidualsAndCost(); // costEvaluations=1 <= 5, ไม่ throw
        assertEquals(1, est.getCostEvaluations());
    }

    @Test(expected = EstimationException.class)
    public void testUpdateResidualsAndCostThrowsWhenExceedMaxCostEval() throws Exception {
        TestEstimator est = new TestEstimator();
        est.setMaxCostEval(0); // boundary: ขีดสุด = 0
        est.initializeEstimate(buildSimpleProblem());
        est.updateResidualsAndCost(); // costEvaluations=1 > 0 -> throw
    }

    @Test
    public void testUpdateResidualsAndCostIncrementsCounterEvenWhenThrowing() {
        TestEstimator est = new TestEstimator();
        est.setMaxCostEval(-1); // boundary ค่าติดลบ
        est.initializeEstimate(buildSimpleProblem());
        try {
            est.updateResidualsAndCost();
            fail("ควร throw EstimationException");
        } catch (EstimationException e) {
            // ตรวจว่า costEvaluations ยังเพิ่มขึ้นก่อน throw (++costEvaluations เกิดก่อนเช็คเงื่อนไข)
            assertEquals(1, est.getCostEvaluations());
        }
    }

    // ---------------------------------------------------------------
    // updateJacobian
    // ---------------------------------------------------------------

    @Test
    public void testUpdateJacobianComputesExpectedValues() {
        TestEstimator est = new TestEstimator();
        est.initializeEstimate(buildSimpleProblem());
        est.updateJacobian();

        // weight=1 -> factor = -sqrt(1) = -1 ; partial = 1 -> jacobian = -1 ทุกตัว
        double[] expected = { -1.0, -1.0, -1.0 };
        assertArrayEquals(expected, est.jacobian, 1e-9);
        assertEquals(1, est.getJacobianEvaluations());
    }

    @Test
    public void testUpdateJacobianWithEmptyMeasurementsDoesNothingButIncrementsCounter() {
        TestEstimator est = new TestEstimator();
        est.initializeEstimate(buildEmptyProblem());
        est.updateJacobian();
        assertEquals(0, est.jacobian.length); // loop ไม่ execute เพราะ rows=0
        assertEquals(1, est.getJacobianEvaluations());
    }

    // ---------------------------------------------------------------
    // updateResidualsAndCost
    // ---------------------------------------------------------------

    @Test
    public void testUpdateResidualsAndCostNormalCase() throws Exception {
        TestEstimator est = new TestEstimator();
        est.setMaxCostEval(100);
        est.initializeEstimate(buildSimpleProblem());
        est.updateResidualsAndCost();

        // residual = measured - theoretical = 1,2,3 ; weight=1
        double[] expectedResiduals = { 1.0, 2.0, 3.0 };
        assertArrayEquals(expectedResiduals, est.residuals, 1e-9);

        // cost = sqrt(sum(weight*residual^2)) = sqrt(1+4+9) = sqrt(14)
        assertEquals(Math.sqrt(14.0), est.cost, 1e-9);
    }

    @Test
    public void testUpdateResidualsAndCostWithEmptyMeasurements() throws Exception {
        TestEstimator est = new TestEstimator();
        est.setMaxCostEval(10);
        est.initializeEstimate(buildEmptyProblem());
        est.updateResidualsAndCost();
        // loop ไม่ execute -> cost เริ่มที่ 0 แล้ว sqrt(0)=0
        assertEquals(0.0, est.cost, 1e-9);
        assertEquals(1, est.getCostEvaluations());
    }

    // ---------------------------------------------------------------
    // getRMS
    // ---------------------------------------------------------------

    @Test
    public void testGetRMSNormalCase() {
        TestEstimator est = new TestEstimator();
        double rms = est.getRMS(buildSimpleProblem());
        // criterion = (1+4+9)/3 = 14/3 ; rms = sqrt(14/3)
        assertEquals(Math.sqrt(14.0 / 3.0), rms, 1e-9);
    }

    @Test
    public void testGetRMSWithEmptyMeasurementsIsNaN() {
        // edge case: หารด้วย 0 -> NaN (ไม่มีการป้องกันใน source)
        TestEstimator est = new TestEstimator();
        double rms = est.getRMS(buildEmptyProblem());
        assertTrue(Double.isNaN(rms));
    }

    // ---------------------------------------------------------------
    // getChiSquare
    // ---------------------------------------------------------------

    @Test
    public void testGetChiSquareNormalCase() {
        TestEstimator est = new TestEstimator();
        double chi = est.getChiSquare(buildSimpleProblem());
        // chiSquare = sum(residual^2/weight) = 1+4+9 = 14
        assertEquals(14.0, chi, 1e-9);
    }

    @Test
    public void testGetChiSquareWithZeroWeightProducesInfinity() {
        // edge case: หารด้วยศูนย์ของ weight -> Infinity (ไม่มีการป้องกันใน source)
        EstimatedParameter p = new EstimatedParameter("p1", 2.0);
        EstimatedParameter[] all = new EstimatedParameter[] { p };
        WeightedMeasurement[] ms = new WeightedMeasurement[] {
            new FixedPartialMeasurement(0.0, 3.0, 2.0, 1.0)
        };
        TestProblem problem = new TestProblem(ms, all, all);

        TestEstimator est = new TestEstimator();
        double chi = est.getChiSquare(problem);
        assertTrue(Double.isInfinite(chi));
    }

    // ---------------------------------------------------------------
    // getCovariances
    // ---------------------------------------------------------------

    @Test
    public void testGetCovariancesNormalCase() throws Exception {
        TestEstimator est = new TestEstimator();
        TestProblem problem = buildSimpleProblem();
        est.initializeEstimate(problem);
        double[][] covar = est.getCovariances(problem);

        // jTj = [[3]] (jacobian = [-1,-1,-1]) -> inverse = [[1/3]]
        assertEquals(1, covar.length);
        assertEquals(1.0 / 3.0, covar[0][0], 1e-9);
    }

    @Test(expected = EstimationException.class)
    public void testGetCovariancesSingularProblemThrowsEstimationException() throws Exception {
        TestEstimator est = new TestEstimator();
        TestProblem problem = buildSingularProblem();
        est.initializeEstimate(problem);
        est.getCovariances(problem); // jTj singular -> InvalidMatrixException -> ถูกครอบเป็น EstimationException
    }

    /**
     * ทดสอบเชิงวิเคราะห์หาบั๊กที่เป็นไปได้: getCovariances() ใช้
     * problem.getAllParameters().length เป็น cols แต่ jacobian ถูกสร้างใน
     * initializeEstimate() ด้วยจำนวน unboundParameters เท่านั้น
     * ถ้ามีพารามิเตอร์ที่ถูก bind ไว้ (allParameters.length != unboundParameters.length)
     * ขนาด jacobian จะไม่สัมพันธ์กับ cols ที่ใช้ใน getCovariances() ทำให้เกิด
     * ArrayIndexOutOfBoundsException ได้ (ข้อสมมติฐาน: พฤติกรรมนี้ไม่ได้ถูกยืนยันจาก
     * เอกสาร เพียงแต่วิเคราะห์จาก source code ที่ให้มา)
     */
    @Test
    public void testGetCovariancesWithBoundParameterMismatch() {
        EstimatedParameter unbound = new EstimatedParameter("p1", 1.0);
        EstimatedParameter bound   = new EstimatedParameter("p2", 1.0);
        EstimatedParameter[] all      = new EstimatedParameter[] { unbound, bound };
        EstimatedParameter[] unboundOnly = new EstimatedParameter[] { unbound };

        WeightedMeasurement[] ms = new WeightedMeasurement[] {
            new FixedPartialMeasurement(1.0, 1.0, 0.0, 1.0),
            new FixedPartialMeasurement(1.0, 1.0, 0.0, 1.0),
            new FixedPartialMeasurement(1.0, 1.0, 0.0, 1.0)
        };
        TestProblem problem = new TestProblem(ms, all, unboundOnly);

        TestEstimator est = new TestEstimator();
        est.initializeEstimate(problem); // cols ภายใน = unboundOnly.length = 1

        try {
            est.getCovariances(problem); // cols ภายนอก (ใน method) = all.length = 2
            fail("คาดว่าจะเกิด ArrayIndexOutOfBoundsException จาก size mismatch (ตามการวิเคราะห์ซอร์ส)");
        } catch (ArrayIndexOutOfBoundsException expectedPossibleBug) {
            // พบ fault ที่ต้องสงสัย: ไม่มีการตรวจสอบขนาด jacobian ให้สอดคล้องกับ
            // problem.getAllParameters().length
            assertTrue(true);
        } catch (EstimationException otherAcceptablePath) {
            // ถ้า implementation จริงจัดการ error เป็น EstimationException ก็ยอมรับได้
            assertTrue(true);
        }
    }

    // ---------------------------------------------------------------
    // guessParametersErrors
    // ---------------------------------------------------------------

    @Test(expected = EstimationException.class)
    public void testGuessParametersErrorsThrowsWhenMEqualsP() throws Exception {
        // m == p -> ไม่มี degree of freedom -> throw
        EstimatedParameter p = new EstimatedParameter("p1", 2.0);
        EstimatedParameter[] all = new EstimatedParameter[] { p };
        WeightedMeasurement[] ms = new WeightedMeasurement[] {
            new FixedPartialMeasurement(1.0, 3.0, 2.0, 1.0)
        };
        TestProblem problem = new TestProblem(ms, all, all);

        TestEstimator est = new TestEstimator();
        est.guessParametersErrors(problem);
    }

    @Test(expected = EstimationException.class)
    public void testGuessParametersErrorsThrowsWhenMLessThanP() throws Exception {
        // m < p -> ไม่มี degree of freedom -> throw
        EstimatedParameter p1 = new EstimatedParameter("p1", 1.0);
        EstimatedParameter p2 = new EstimatedParameter("p2", 1.0);
        EstimatedParameter[] all = new EstimatedParameter[] { p1, p2 };
        WeightedMeasurement[] ms = new WeightedMeasurement[] {
            new FixedPartialMeasurement(1.0, 1.0, 0.0, 1.0)
        };
        TestProblem problem = new TestProblem(ms, all, all);

        TestEstimator est = new TestEstimator();
        est.guessParametersErrors(problem);
    }

    @Test
    public void testGuessParametersErrorsNormalCase() throws Exception {
        TestEstimator est = new TestEstimator();
        TestProblem problem = buildSimpleProblem(); // m=3, p=1 -> m>p OK
        est.initializeEstimate(problem);
        double[] errors = est.guessParametersErrors(problem);

        // chiSquare = 14 ; m-p = 2 ; c = sqrt(14/2) = sqrt(7)
        // covar[0][0] = 1/3 (จาก jTj=[[3]])
        // error = sqrt(1/3) * sqrt(7) = sqrt(7/3)
        assertEquals(1, errors.length);
        assertEquals(Math.sqrt(7.0 / 3.0), errors[0], 1e-9);
    }

    // ---------------------------------------------------------------
    // initializeEstimate
    // ---------------------------------------------------------------

    @Test
    public void testInitializeEstimateSetsFieldsCorrectly() {
        TestEstimator est = new TestEstimator();
        TestProblem problem = buildSimpleProblem();
        est.initializeEstimate(problem);

        assertEquals(3, est.rows);
        assertEquals(1, est.cols);
        assertEquals(3, est.jacobian.length); // rows*cols
        assertEquals(3, est.residuals.length);
        assertEquals(Double.POSITIVE_INFINITY, est.cost, 0.0);
        assertEquals(0, est.getCostEvaluations());
        assertEquals(0, est.getJacobianEvaluations());
    }

    @Test
    public void testInitializeEstimateResetsCountersFromPreviousState() throws Exception {
        TestEstimator est = new TestEstimator();
        TestProblem problem = buildSimpleProblem();

        est.initializeEstimate(problem);
        est.setMaxCostEval(100);
        est.updateResidualsAndCost();          // costEvaluations = 1
        est.incrementJacobianEvaluationsCounter(); // jacobianEvaluations = 1

        assertEquals(1, est.getCostEvaluations());
        assertEquals(1, est.getJacobianEvaluations());

        // initializeEstimate ครั้งใหม่ ต้อง reset ทั้งสอง counters เป็น 0
        est.initializeEstimate(problem);
        assertEquals(0, est.getCostEvaluations());
        assertEquals(0, est.getJacobianEvaluations());
    }

    @Test
    public void testInitializeEstimateUsesUnboundParametersNotAllParameters() {
        // ตรวจว่า cols ถูกตั้งจาก getUnboundParameters() ไม่ใช่ getAllParameters()
        EstimatedParameter unbound = new EstimatedParameter("p1", 1.0);
        EstimatedParameter bound   = new EstimatedParameter("p2", 1.0);
        EstimatedParameter[] all   = new EstimatedParameter[] { unbound, bound };
        EstimatedParameter[] unboundOnly = new EstimatedParameter[] { unbound };

        WeightedMeasurement[] ms = new WeightedMeasurement[] {
            new FixedPartialMeasurement(1.0, 1.0, 0.0, 1.0)
        };
        TestProblem problem = new TestProblem(ms, all, unboundOnly);

        TestEstimator est = new TestEstimator();
        est.initializeEstimate(problem);

        assertEquals(1, est.cols); // ต้องเป็น unboundOnly.length (1) ไม่ใช่ all.length (2)
    }
}
