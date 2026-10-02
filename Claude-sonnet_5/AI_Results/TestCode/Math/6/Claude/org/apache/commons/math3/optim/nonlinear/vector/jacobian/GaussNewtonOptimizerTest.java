package org.apache.commons.math3.optim.nonlinear.vector.jacobian;

import static org.junit.Assert.assertEquals;

import org.apache.commons.math3.analysis.MultivariateMatrixFunction;
import org.apache.commons.math3.analysis.MultivariateVectorFunction;
import org.apache.commons.math3.exception.ConvergenceException;
import org.apache.commons.math3.exception.MathUnsupportedOperationException;
import org.apache.commons.math3.exception.NullArgumentException;
import org.apache.commons.math3.exception.TooManyEvaluationsException;
import org.apache.commons.math3.linear.BlockRealMatrix;
import org.apache.commons.math3.optim.ConvergenceChecker;
import org.apache.commons.math3.optim.InitialGuess;
import org.apache.commons.math3.optim.MaxEval;
import org.apache.commons.math3.optim.PointVectorValuePair;
import org.apache.commons.math3.optim.SimpleBounds; // assumption: ใช้ parse bounds ร่วมกับ vector optimizer (ดูคอมเมนต์ในเทส)
import org.apache.commons.math3.optim.SimpleVectorValueChecker;
import org.apache.commons.math3.optim.nonlinear.vector.ModelFunction;
import org.apache.commons.math3.optim.nonlinear.vector.ModelFunctionJacobian;
import org.apache.commons.math3.optim.nonlinear.vector.Target;
import org.apache.commons.math3.optim.nonlinear.vector.Weight;

import org.junit.Test;

/**
 * Unit tests for {@link GaussNewtonOptimizer}.
 *
 * หมายเหตุ: บาง OptimizationData (เช่น Weight, SimpleBounds) เป็นคลาสของไลบรารี
 * commons-math3 ที่ GaussNewtonOptimizer พึ่งพาอยู่แล้ว (ไม่ได้อยู่ในซอร์สที่ให้มา
 * แต่จำเป็นต่อการเรียกใช้ public API ของคลาสเป้าหมาย)
 */
public class GaussNewtonOptimizerTest {

    // ---------- Helper: linear least-squares problem (model = factors * x) ----------
    private static class LinearProblem {
        private final BlockRealMatrix factors;
        private final double[] target;

        LinearProblem(double[][] factors, double[] target) {
            this.factors = new BlockRealMatrix(factors);
            this.target = target;
        }

        Target getTarget() {
            return new Target(target);
        }

        Weight getWeight() {
            double[] w = new double[target.length];
            for (int i = 0; i < w.length; i++) {
                w[i] = 1.0;
            }
            // assumption: Weight(double[]) สร้าง diagonal weight matrix
            return new Weight(w);
        }

        ModelFunction getModelFunction() {
            return new ModelFunction(new MultivariateVectorFunction() {
                public double[] value(double[] params) {
                    return factors.operate(params);
                }
            });
        }

        ModelFunctionJacobian getModelFunctionJacobian() {
            return new ModelFunctionJacobian(new MultivariateMatrixFunction() {
                public double[][] value(double[] params) {
                    return factors.getData();
                }
            });
        }
    }

    // ===================== Normal path: useLU = true (default ctor) =====================
    @Test
    public void testLinearProblemWithLUDecomposition() {
        LinearProblem problem = new LinearProblem(new double[][] {
                { 1, 0 },
                { 0, 1 }
        }, new double[] { 2, 3 });

        GaussNewtonOptimizer optimizer =
                new GaussNewtonOptimizer(new SimpleVectorValueChecker(1e-6, 1e-6));

        PointVectorValuePair optimum = optimizer.optimize(
                new MaxEval(100),
                problem.getModelFunction(),
                problem.getModelFunctionJacobian(),
                problem.getTarget(),
                problem.getWeight(),
                new InitialGuess(new double[] { 0, 0 }));

        assertEquals(2, optimum.getPoint()[0], 1e-6);
        assertEquals(3, optimum.getPoint()[1], 1e-6);
    }

    // ===================== Normal path: useLU = false (ternary -> QRDecomposition) =====
    @Test
    public void testLinearProblemWithQRDecomposition() {
        LinearProblem problem = new LinearProblem(new double[][] {
                { 1, 0 },
                { 0, 1 }
        }, new double[] { 4, 5 });

        GaussNewtonOptimizer optimizer =
                new GaussNewtonOptimizer(false, new SimpleVectorValueChecker(1e-6, 1e-6));

        PointVectorValuePair optimum = optimizer.optimize(
                new MaxEval(100),
                problem.getModelFunction(),
                problem.getModelFunctionJacobian(),
                problem.getTarget(),
                problem.getWeight(),
                new InitialGuess(new double[] { 0, 0 }));

        assertEquals(4, optimum.getPoint()[0], 1e-6);
        assertEquals(5, optimum.getPoint()[1], 1e-6);
    }

    // ===================== checker == null -> throw NullArgumentException =====================
    @Test(expected = NullArgumentException.class)
    public void testNullConvergenceCheckerThrows() {
        LinearProblem problem = new LinearProblem(new double[][] {
                { 1, 0 },
                { 0, 1 }
        }, new double[] { 1, 1 });

        GaussNewtonOptimizer optimizer = new GaussNewtonOptimizer(null);

        optimizer.optimize(
                new MaxEval(100),
                problem.getModelFunction(),
                problem.getModelFunctionJacobian(),
                problem.getTarget(),
                problem.getWeight(),
                new InitialGuess(new double[] { 0, 0 }));
    }

    // ===================== SingularMatrixException -> ConvergenceException =====================
    @Test(expected = ConvergenceException.class)
    public void testSingularNormalMatrixThrowsConvergenceException() {
        // Jacobian เป็น 0 ทั้งแถว -> normal-equation matrix "a" เป็น singular
        LinearProblem problem = new LinearProblem(new double[][] {
                { 0, 0 },
                { 0, 0 }
        }, new double[] { 1, 1 });

        GaussNewtonOptimizer optimizer =
                new GaussNewtonOptimizer(new SimpleVectorValueChecker(1e-6, 1e-6));

        optimizer.optimize(
                new MaxEval(100),
                problem.getModelFunction(),
                problem.getModelFunctionJacobian(),
                problem.getTarget(),
                problem.getWeight(),
                new InitialGuess(new double[] { 0, 0 }));
    }

    // ===================== checkParameters(): bounds set -> MathUnsupportedOperationException ===
    @Test(expected = MathUnsupportedOperationException.class)
    public void testBoundsNotSupported() {
        // ส่ง SimpleBounds (ทั้ง lower/upper ถูกกำหนด) -> เงื่อนไข
        // getLowerBound()!=null || getUpperBound()!=null เป็น true -> throw
        // หมายเหตุ: SimpleBounds เซ็ตทั้งสองค่าพร้อมกันผ่าน constructor เดียว
        // จึงไม่สามารถแยกทดสอบ sub-branch (เฉพาะ lower หรือเฉพาะ upper) ได้
        // ด้วย public API นี้ - การทดสอบนี้ครอบคลุม branch "true" ของเงื่อนไข OR
        LinearProblem problem = new LinearProblem(new double[][] {
                { 1, 0 },
                { 0, 1 }
        }, new double[] { 1, 1 });

        GaussNewtonOptimizer optimizer =
                new GaussNewtonOptimizer(new SimpleVectorValueChecker(1e-6, 1e-6));

        optimizer.optimize(
                new MaxEval(100),
                problem.getModelFunction(),
                problem.getModelFunctionJacobian(),
                problem.getTarget(),
                problem.getWeight(),
                new InitialGuess(new double[] { 0, 0 }),
                new SimpleBounds(new double[] { -1, -1 }, new double[] { 1, 1 }));
    }

    // ===================== Loop: previous != null branch, converged after several iterations ===
    @Test
    public void testConvergesAfterMultipleIterations() {
        // ตรวจสอบว่า loop ทำงานมากกว่า 1 รอบก่อน converge (ครอบคลุม "previous != null"
        // และ "converged == false" ในหลายรอบ) ก่อนจบที่ "converged == true"
        LinearProblem problem = new LinearProblem(new double[][] {
                { 2, 0 },
                { 0, 2 }
        }, new double[] { 6, 8 });

        GaussNewtonOptimizer optimizer =
                new GaussNewtonOptimizer(new SimpleVectorValueChecker(1e-10, 1e-10));

        PointVectorValuePair optimum = optimizer.optimize(
                new MaxEval(100),
                problem.getModelFunction(),
                problem.getModelFunctionJacobian(),
                problem.getTarget(),
                problem.getWeight(),
                new InitialGuess(new double[] { 0, 0 }));

        assertEquals(3, optimum.getPoint()[0], 1e-6);
        assertEquals(4, optimum.getPoint()[1], 1e-6);
    }

    // ===================== Evaluation budget exceeded (loop never converges) =====================
    @Test(expected = TooManyEvaluationsException.class)
    public void testMaxEvaluationsExceededWhenNeverConverges() {
        // checker ที่คืนค่า false เสมอ -> for-loop (!converged) จะวนไม่สิ้นสุด
        // จนกว่า MaxEval หมด -> ตรวจพฤติกรรมจากคลาสแม่ (inherited) ซึ่งถูกเรียกใช้งาน
        // ผ่าน computeObjectiveValue() ภายใน doOptimize()
        LinearProblem problem = new LinearProblem(new double[][] {
                { 1, 0 },
                { 0, 1 }
        }, new double[] { 1, 1 });

        ConvergenceChecker<PointVectorValuePair> neverConverge =
                new ConvergenceChecker<PointVectorValuePair>() {
                    public boolean converged(int iteration,
                                              PointVectorValuePair previous,
                                              PointVectorValuePair current) {
                        return false;
                    }
                };

        GaussNewtonOptimizer optimizer = new GaussNewtonOptimizer(neverConverge);

        optimizer.optimize(
                new MaxEval(3),
                problem.getModelFunction(),
                problem.getModelFunctionJacobian(),
                problem.getTarget(),
                problem.getWeight(),
                new InitialGuess(new double[] { 10, 10 }));
    }

    // ===================== Non-square-ish / multi-dimension smoke test (3 unknowns) ============
    @Test
    public void testLinearProblemThreeUnknowns() {
        // ตรวจ loop ด้านใน (j/k/l) สำหรับ nC = 3 เพื่อเพิ่ม coverage ของ nested loop
        LinearProblem problem = new LinearProblem(new double[][] {
                { 1, 0, 0 },
                { 0, 1, 0 },
                { 0, 0, 1 }
        }, new double[] { 1, 2, 3 });

        GaussNewtonOptimizer optimizer =
                new GaussNewtonOptimizer(new SimpleVectorValueChecker(1e-8, 1e-8));

        PointVectorValuePair optimum = optimizer.optimize(
                new MaxEval(100),
                problem.getModelFunction(),
                problem.getModelFunctionJacobian(),
                problem.getTarget(),
                problem.getWeight(),
                new InitialGuess(new double[] { 0, 0, 0 }));

        assertEquals(1, optimum.getPoint()[0], 1e-6);
        assertEquals(2, optimum.getPoint()[1], 1e-6);
        assertEquals(3, optimum.getPoint()[2], 1e-6);
    }
}
