package org.apache.commons.math.estimation;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class AbstractEstimatorTest {

    // Concrete class สำหรับทดสอบ AbstractEstimator
    private static class TestEstimator extends AbstractEstimator implements Serializable {
        private static final long serialVersionUID = 1L;

        @Override
        public void estimate(EstimationProblem problem) throws EstimationException {
            initializeEstimate(problem);
        }

        // Expose protected methods สำหรับการทดสอบ Unit Level
        public void testInitializeEstimate(EstimationProblem problem) {
            initializeEstimate(problem);
        }

        public void testUpdateJacobian() {
            updateJacobian();
        }

        public void testUpdateResidualsAndCost() throws EstimationException {
            updateResidualsAndCost();
        }

        public double getCost() {
            return cost;
        }

        public double[] getResiduals() {
            return residuals;
        }

        public double[] getJacobian() {
            return jacobian;
        }
    }

    // Concrete class สำหรับ SimpleMeasurement
    private static class SimpleMeasurement extends WeightedMeasurement {
        private static final long serialVersionUID = 1L;
        private final SimpleProblem problemRef;

        public SimpleMeasurement(double weight, double measuredValue, SimpleProblem problem) {
            super(weight, measuredValue);
            this.problemRef = problem;
        }

        @Override
        public double getTheoreticalValue() {
            double theoretical = 0;
            for (EstimatedParameter p : problemRef.getAllParameters()) {
                theoretical += p.getEstimate();
            }
            return theoretical;
        }

        @Override
        public double getPartial(EstimatedParameter parameter) {
            // Partial derivative ต่อ parameter แต่ละตัว
            return 1.0;
        }
    }

    // Concrete class สำหรับ SimpleEstimationProblem
    private static class SimpleProblem implements EstimationProblem {
        private final List<EstimatedParameter> allParams = new ArrayList<EstimatedParameter>();
        private final List<WeightedMeasurement> measurements = new ArrayList<WeightedMeasurement>();

        public void addParameter(EstimatedParameter p) {
            allParams.add(p);
        }

        public void addMeasurement(WeightedMeasurement m) {
            measurements.add(m);
        }

        @Override
        public EstimatedParameter[] getAllParameters() {
            return allParams.toArray(new EstimatedParameter[0]);
        }

        @Override
        public EstimatedParameter[] getUnboundParameters() {
            List<EstimatedParameter> unbounds = new ArrayList<EstimatedParameter>();
            for (EstimatedParameter p : allParams) {
                if (!p.isBound()) {
                    unbounds.add(p);
                }
            }
            return unbounds.toArray(new EstimatedParameter[0]);
        }

        @Override
        public WeightedMeasurement[] getMeasurements() {
            return measurements.toArray(new WeightedMeasurement[0]);
        }
    }

    private TestEstimator estimator;
    private SimpleProblem problem;

    @Before
    public void setUp() {
        estimator = new TestEstimator();
        problem = new SimpleProblem();
    }

    @Test
    public void testInitializationAndCounters() {
        EstimatedParameter p1 = new EstimatedParameter("p1", 1.0);
        problem.addParameter(p1);
        problem.addMeasurement(new SimpleMeasurement(1.0, 2.0, problem));

        estimator.setMaxCostEval(10);
        estimator.testInitializeEstimate(problem);

        assertEquals(0, estimator.getCostEvaluations());
        assertEquals(0, estimator.getJacobianEvaluations());
        assertEquals(Double.POSITIVE_INFINITY, estimator.getCost(), 1e-15);
    }

    @Test
    public void testUpdateJacobian() {
        EstimatedParameter p1 = new EstimatedParameter("p1", 1.0);
        EstimatedParameter p2 = new EstimatedParameter("p2", 2.0);
        problem.addParameter(p1);
        problem.addParameter(p2);

        problem.addMeasurement(new SimpleMeasurement(4.0, 3.0, problem)); // sqrt(4) = 2.0

        estimator.testInitializeEstimate(problem);
        estimator.testUpdateJacobian();

        assertEquals(1, estimator.getJacobianEvaluations());
        double[] jacobian = estimator.getJacobian();
        assertNotNull(jacobian);
        assertEquals(2, jacobian.length); // 1 measurement x 2 parameters
        // factor = -sqrt(4.0) = -2.0, partial = 1.0 -> jacobian value = -2.0
        assertEquals(-2.0, jacobian[0], 1e-10);
        assertEquals(-2.0, jacobian[1], 1e-10);
    }

    @Test
    public void testUpdateResidualsAndCostSuccess() throws EstimationException {
        EstimatedParameter p1 = new EstimatedParameter("p1", 1.0);
        problem.addParameter(p1);
        // theoretical = 1.0, measured = 3.0, weight = 4.0
        // residual = measured - theoretical = 3.0 - 1.0 = 2.0
        problem.addMeasurement(new SimpleMeasurement(4.0, 3.0, problem));

        estimator.setMaxCostEval(2);
        estimator.testInitializeEstimate(problem);

        estimator.testUpdateResidualsAndCost();

        assertEquals(1, estimator.getCostEvaluations());
        // weighted residual = sqrt(4.0) * 2.0 = 4.0
        assertEquals(4.0, estimator.getResiduals()[0], 1e-10);
        // cost = sqrt(4.0 * 2.0^2) = sqrt(16.0) = 4.0
        assertEquals(4.0, estimator.getCost(), 1e-10);
    }

    @Test(expected = EstimationException.class)
    public void testUpdateResidualsAndCostMaxEvaluationExceeded() throws EstimationException {
        EstimatedParameter p1 = new EstimatedParameter("p1", 1.0);
        problem.addParameter(p1);
        problem.addMeasurement(new SimpleMeasurement(1.0, 1.0, problem));

        estimator.setMaxCostEval(1);
        estimator.testInitializeEstimate(problem);

        // Evaluation 1: Pass
        estimator.testUpdateResidualsAndCost();
        // Evaluation 2: Should exceed maxCostEval (1) and throw EstimationException
        estimator.testUpdateResidualsAndCost();
    }

    @Test
    public void testGetRMSAndChiSquare() {
        EstimatedParameter p1 = new EstimatedParameter("p1", 2.0);
        problem.addParameter(p1);
        // Measurement 1: weight = 1.0, measured = 5.0 -> residual = 5 - 2 = 3.0
        problem.addMeasurement(new SimpleMeasurement(1.0, 5.0, problem));
        // Measurement 2: weight = 4.0, measured = 4.0 -> residual = 4 - 2 = 2.0
        problem.addMeasurement(new SimpleMeasurement(4.0, 4.0, problem));

        // RMS = sqrt( (1.0 * 3^2 + 4.0 * 2^2) / 2 ) = sqrt( (9 + 16) / 2 ) = sqrt(12.5)
        double expectedRMS = Math.sqrt(12.5);
        assertEquals(expectedRMS, estimator.getRMS(problem), 1e-10);

        // ChiSquare = (3^2 / 1.0) + (2^2 / 4.0) = 9 + 1 = 10.0
        double expectedChiSquare = 10.0;
        assertEquals(expectedChiSquare, estimator.getChiSquare(problem), 1e-10);
    }

    @Test
    public void testGetCovariancesSuccess() throws EstimationException {
        EstimatedParameter p1 = new EstimatedParameter("p1", 1.0);
        problem.addParameter(p1);

        WeightedMeasurement m1 = new WeightedMeasurement(1.0, 1.0) {
            private static final long serialVersionUID = 1L;
            @Override public double getTheoreticalValue() { return 1.0; }
            @Override public double getPartial(EstimatedParameter parameter) { return 2.0; }
        };
        problem.addMeasurement(m1);

        estimator.testInitializeEstimate(problem);
        double[][] covar = estimator.getCovariances(problem);

        assertNotNull(covar);
        assertEquals(1, covar.length);
        assertEquals(1, covar[0].length);
        // jacobian[0] = -sqrt(1) * 2 = -2.0
        // JtJ = (-2) * (-2) = 4.0
        // inverse = 1 / 4.0 = 0.25
        assertEquals(0.25, covar[0][0], 1e-10);
    }

    @Test(expected = EstimationException.class)
    public void testGetCovariancesSingularMatrix() throws EstimationException {
        EstimatedParameter p1 = new EstimatedParameter("p1", 1.0);
        EstimatedParameter p2 = new EstimatedParameter("p2", 2.0);
        problem.addParameter(p1);
        problem.addParameter(p2);

        // Both parameters produce identical derivatives -> Singular J^T * J
        WeightedMeasurement m1 = new WeightedMeasurement(1.0, 1.0) {
            private static final long serialVersionUID = 1L;
            @Override public double getTheoreticalValue() { return 1.0; }
            @Override public double getPartial(EstimatedParameter parameter) { return 1.0; }
        };
        problem.addMeasurement(m1);

        estimator.testInitializeEstimate(problem);
        // Inverting singular matrix will trigger InvalidMatrixException and rethrow EstimationException
        estimator.getCovariances(problem);
    }

    @Test(expected = EstimationException.class)
    public void testGuessParametersErrorsZeroDegreesOfFreedom() throws EstimationException {
        // m == p (1 measurement, 1 parameter) -> m <= p boundary limit
        EstimatedParameter p1 = new EstimatedParameter("p1", 1.0);
        problem.addParameter(p1);
        problem.addMeasurement(new SimpleMeasurement(1.0, 2.0, problem));

        estimator.testInitializeEstimate(problem);
        estimator.guessParametersErrors(problem);
    }

    @Test(expected = EstimationException.class)
    public void testGuessParametersErrorsNegativeDegreesOfFreedom() throws EstimationException {
        // m < p (1 measurement, 2 parameters)
        EstimatedParameter p1 = new EstimatedParameter("p1", 1.0);
        EstimatedParameter p2 = new EstimatedParameter("p2", 2.0);
        problem.addParameter(p1);
        problem.addParameter(p2);
        problem.addMeasurement(new SimpleMeasurement(1.0, 2.0, problem));

        estimator.testInitializeEstimate(problem);
        estimator.guessParametersErrors(problem);
    }

    @Test
    public void testGuessParametersErrorsSuccess() throws EstimationException {
        // m > p (2 measurements, 1 parameter)
        EstimatedParameter p1 = new EstimatedParameter("p1", 1.0);
        problem.addParameter(p1);

        WeightedMeasurement m1 = new WeightedMeasurement(1.0, 2.0) {
            private static final long serialVersionUID = 1L;
            @Override public double getTheoreticalValue() { return 1.0; } // residual = 1.0
            @Override public double getPartial(EstimatedParameter parameter) { return 1.0; }
        };
        WeightedMeasurement m2 = new WeightedMeasurement(1.0, 3.0) {
            private static final long serialVersionUID = 1L;
            @Override public double getTheoreticalValue() { return 1.0; } // residual = 2.0
            @Override public double getPartial(EstimatedParameter parameter) { return 2.0; }
        };

        problem.addMeasurement(m1);
        problem.addMeasurement(m2);

        estimator.testInitializeEstimate(problem);
        double[] errors = estimator.guessParametersErrors(problem);

        assertNotNull(errors);
        assertEquals(1, errors.length);
        assertTrue(errors[0] > 0);
    }

    @Test
    public void testBoundAndUnboundParametersHandling() throws EstimationException {
        // Test edge-case regarding bound/unbound parameters
        EstimatedParameter p1 = new EstimatedParameter("p1", 1.0, false); // unbound
        EstimatedParameter p2 = new EstimatedParameter("p2", 2.0, true);  // bound
        problem.addParameter(p1);
        problem.addParameter(p2);

        WeightedMeasurement m1 = new WeightedMeasurement(1.0, 2.0) {
            private static final long serialVersionUID = 1L;
            @Override public double getTheoreticalValue() { return 1.0; }
            @Override public double getPartial(EstimatedParameter parameter) { return 1.0; }
        };
        WeightedMeasurement m2 = new WeightedMeasurement(1.0, 3.0) {
            private static final long serialVersionUID = 1L;
            @Override public double getTheoreticalValue() { return 1.0; }
            @Override public double getPartial(EstimatedParameter parameter) { return 2.0; }
        };
        WeightedMeasurement m3 = new WeightedMeasurement(1.0, 4.0) {
            private static final long serialVersionUID = 1L;
            @Override public double getTheoreticalValue() { return 1.0; }
            @Override public double getPartial(EstimatedParameter parameter) { return 3.0; }
        };

        problem.addMeasurement(m1);
        problem.addMeasurement(m2);
        problem.addMeasurement(m3);

        estimator.testInitializeEstimate(problem);
        // Verify unbound parameters setup
        assertEquals(1, problem.getUnboundParameters().length);
        assertEquals(2, problem.getAllParameters().length);
    }
}