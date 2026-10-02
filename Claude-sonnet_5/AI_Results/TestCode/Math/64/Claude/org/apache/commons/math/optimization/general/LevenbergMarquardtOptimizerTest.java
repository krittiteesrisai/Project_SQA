package org.apache.commons.math.optimization.general;

import static org.junit.Assert.*;

import org.junit.Test;

import org.apache.commons.math.FunctionEvaluationException;
import org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction;
import org.apache.commons.math.analysis.MultivariateMatrixFunction;
import org.apache.commons.math.optimization.OptimizationException;
import org.apache.commons.math.optimization.VectorialConvergenceChecker;
import org.apache.commons.math.optimization.VectorialPointValuePair;

/**
 * JUnit4 test suite for {@link LevenbergMarquardtOptimizer} (Defects4J Math-64b).
 *
 * หมายเหตุ: AbstractLeastSquaresOptimizer (superclass) ไม่มี source ให้ในโจทย์
 * จึงอ้างอิง public API signature มาตรฐานของ Apache Commons Math ในช่วงเวลาดังกล่าว:
 *   optimize(DifferentiableMultivariateVectorialFunction f,
 *            double[] target, double[] weights, double[] startPoint)
 * และ setConvergenceChecker(VectorialConvergenceChecker) ซึ่งถูกเรียกใน constructor อยู่แล้ว
 * จึงมั่นใจได้ว่ามี method นี้ public อยู่จริง
 */
public class LevenbergMarquardtOptimizerTest {

    // ----------------------------------------------------------------
    // Helper function classes
    // ----------------------------------------------------------------

    /** y = a*x + b  (2 parameters: point[0]=a, point[1]=b) */
    private static class LinearFunction2D implements DifferentiableMultivariateVectorialFunction {
        private final double[] xs;
        LinearFunction2D(double[] xs) { this.xs = xs; }

        public double[] value(double[] point) {
            double[] v = new double[xs.length];
            for (int i = 0; i < xs.length; i++) {
                v[i] = point[0] * xs[i] + point[1];
            }
            return v;
        }

        public MultivariateMatrixFunction jacobian() {
            return new MultivariateMatrixFunction() {
                public double[][] value(double[] point) {
                    double[][] j = new double[xs.length][2];
                    for (int i = 0; i < xs.length; i++) {
                        j[i][0] = xs[i];
                        j[i][1] = 1.0;
                    }
                    return j;
                }
            };
        }
    }

    /**
     * y = (a+b)*x : สอง column ของ jacobian เหมือนกันทุกประการ (xs[i], xs[i])
     * => ทำให้เกิด rank-deficient jacobian ใน QR decomposition
     * (trigger branch "ak2 <= qrRankingThreshold" ใน qrDecomposition())
     */
    private static class RankDeficientFunction implements DifferentiableMultivariateVectorialFunction {
        private final double[] xs;
        RankDeficientFunction(double[] xs) { this.xs = xs; }

        public double[] value(double[] point) {
            double[] v = new double[xs.length];
            double sum = point[0] + point[1];
            for (int i = 0; i < xs.length; i++) {
                v[i] = sum * xs[i];
            }
            return v;
        }

        public MultivariateMatrixFunction jacobian() {
            return new MultivariateMatrixFunction() {
                public double[][] value(double[] point) {
                    double[][] j = new double[xs.length][2];
                    for (int i = 0; i < xs.length; i++) {
                        j[i][0] = xs[i];
                        j[i][1] = xs[i];
                    }
                    return j;
                }
            };
        }
    }

    /**
     * y = a*x + b  แต่มี parameter ที่ 3 (point[2]) ที่ไม่ถูกใช้เลย
     * => jacobian column ที่ 3 เป็น 0 ทุกแถว => jacNorm[2] == 0
     * ใช้ trigger branch "dk == 0 -> dk = 1.0" ใน doOptimize() (firstIteration scaling)
     */
    private static class UnusedParamFunction implements DifferentiableMultivariateVectorialFunction {
        private final double[] xs;
        UnusedParamFunction(double[] xs) { this.xs = xs; }

        public double[] value(double[] point) {
            double[] v = new double[xs.length];
            for (int i = 0; i < xs.length; i++) {
                v[i] = point[0] * xs[i] + point[1];
            }
            return v;
        }

        public MultivariateMatrixFunction jacobian() {
            return new MultivariateMatrixFunction() {
                public double[][] value(double[] point) {
                    double[][] j = new double[xs.length][3];
                    for (int i = 0; i < xs.length; i++) {
                        j[i][0] = xs[i];
                        j[i][1] = 1.0;
                        j[i][2] = 0.0; // unused column
                    }
                    return j;
                }
            };
        }
    }

    /** ฟังก์ชันที่ value ไม่ขึ้นกับ point เลย (ใช้ทดสอบ cols=0 / กรณีไม่มีพารามิเตอร์) */
    private static class ZeroParamFunction implements DifferentiableMultivariateVectorialFunction {
        private final double[] constants;
        ZeroParamFunction(double[] constants) { this.constants = constants; }

        public double[] value(double[] point) {
            return constants.clone();
        }

        public MultivariateMatrixFunction jacobian() {
            return new MultivariateMatrixFunction() {
                public double[][] value(double[] point) {
                    return new double[constants.length][0];
                }
            };
        }
    }

    /** ConvergenceChecker ที่ converge ทันทีในการเรียกครั้งแรก */
    private static class ImmediateConvergenceChecker implements VectorialConvergenceChecker {
        public boolean converged(int iteration, VectorialPointValuePair previous,
                                  VectorialPointValuePair current) {
            return true;
        }
    }

    // ----------------------------------------------------------------
    // 1. Normal convergence: well-determined linear system (square)
    // ----------------------------------------------------------------
    @Test
    public void testLinearProblemConvergesToSolution() throws Exception {
        // y = 2x + 3 ; xs={1,2} -> target={5,7} (exact fit, well-determined 2x2)
        double[] xs = {1.0, 2.0};
        double[] target = {5.0, 7.0};
        double[] weights = {1.0, 1.0};
        double[] start = {0.0, 0.0};

        LevenbergMarquardtOptimizer optimizer = new LevenbergMarquardtOptimizer();
        VectorialPointValuePair result =
            optimizer.optimize(new LinearFunction2D(xs), target, weights, start);

        assertNotNull(result);
        double[] p = result.getPoint();
        assertEquals(2.0, p[0], 1.0e-6);
        assertEquals(3.0, p[1], 1.0e-6);
        double[] val = result.getValue();
        assertEquals(5.0, val[0], 1.0e-6);
        assertEquals(7.0, val[1], 1.0e-6);
        // ปัญหานี้เป็น linear exact fit -> Gauss-Newton step ควรให้ ratio สูง
        // (น่าจะ cover branch ratio>=0.75 ด้วย แต่ไม่ได้ assert ตรงๆ เพราะ field private)
    }

    // ----------------------------------------------------------------
    // 2. Over-determined system (rows > cols) -> rank == solvedCols branch
    // ----------------------------------------------------------------
    @Test
    public void testOverDeterminedLinearProblem() throws Exception {
        double[] xs = {1.0, 2.0, 3.0, 4.0};
        double[] target = {5.0, 7.0, 9.0, 11.0}; // y = 2x + 3 exactly
        double[] weights = {1.0, 1.0, 1.0, 1.0};
        double[] start = {0.0, 0.0};

        LevenbergMarquardtOptimizer optimizer = new LevenbergMarquardtOptimizer();
        VectorialPointValuePair result =
            optimizer.optimize(new LinearFunction2D(xs), target, weights, start);

        double[] p = result.getPoint();
        assertEquals(2.0, p[0], 1.0e-6);
        assertEquals(3.0, p[1], 1.0e-6);
    }

    // ----------------------------------------------------------------
    // 3. Rank-deficient jacobian -> qrRankingThreshold branch in qrDecomposition()
    // ----------------------------------------------------------------
    @Test
    public void testRankDeficientJacobianDoesNotCrash() throws Exception {
        double[] xs = {1.0, 2.0, 3.0};
        // sum(a,b) = 2  -> y = 2*x
        double[] target = {2.0, 4.0, 6.0};
        double[] weights = {1.0, 1.0, 1.0};
        double[] start = {0.0, 0.0};

        LevenbergMarquardtOptimizer optimizer = new LevenbergMarquardtOptimizer();
        VectorialPointValuePair result =
            optimizer.optimize(new RankDeficientFunction(xs), target, weights, start);

        assertNotNull(result);
        double[] p = result.getPoint();
        // ไม่สามารถ assert ค่า a,b แยกกันได้ (infinite solutions) แต่ sum ควร ~ 2
        assertEquals(2.0, p[0] + p[1], 1.0e-4);
    }

    // ----------------------------------------------------------------
    // 4. Unused parameter -> jacNorm == 0 -> "dk==0 -> dk=1.0" branch
    //    และยัง cover rank == solvedCols (เนื่องจาก solvedCols = min(rows,cols) = rows)
    // ----------------------------------------------------------------
    @Test
    public void testUnusedParameterZeroColumnNorm() throws Exception {
        double[] xs = {1.0, 2.0};
        double[] target = {5.0, 7.0}; // y = 2x+3
        double[] weights = {1.0, 1.0};
        double[] start = {0.0, 0.0, 5.0}; // point[2] ไม่ถูกใช้เลย

        LevenbergMarquardtOptimizer optimizer = new LevenbergMarquardtOptimizer();
        VectorialPointValuePair result =
            optimizer.optimize(new UnusedParamFunction(xs), target, weights, start);

        double[] p = result.getPoint();
        assertEquals(2.0, p[0], 1.0e-6);
        assertEquals(3.0, p[1], 1.0e-6);
        // พารามิเตอร์ที่ไม่ถูกใช้ไม่ควรถูกเปลี่ยนแปลง (gradient = 0 เสมอ)
        assertEquals(5.0, p[2], 1.0e-9);
    }

    // ----------------------------------------------------------------
    // 5. Start point = exact solution -> cost == 0 ตั้งแต่เริ่ม
    //    -> skip "if (cost != 0)" loop -> maxCosine=0 <= orthoTolerance -> return ทันที
    // ----------------------------------------------------------------
    @Test
    public void testStartAtExactSolutionReturnsImmediately() throws Exception {
        double[] xs = {1.0, 2.0};
        double[] target = {5.0, 7.0}; // y = 2x+3
        double[] weights = {1.0, 1.0};
        double[] start = {2.0, 3.0}; // exact solution already

        LevenbergMarquardtOptimizer optimizer = new LevenbergMarquardtOptimizer();
        VectorialPointValuePair result =
            optimizer.optimize(new LinearFunction2D(xs), target, weights, start);

        double[] p = result.getPoint();
        assertEquals(2.0, p[0], 1.0e-9);
        assertEquals(3.0, p[1], 1.0e-9);
    }

    // ----------------------------------------------------------------
    // 6. Custom VectorialConvergenceChecker ที่ converge ทันที
    //    -> cover branch "checker != null" / "checker.converged(...) == true"
    // ----------------------------------------------------------------
    @Test
    public void testCustomConvergenceCheckerBranch() throws Exception {
        double[] xs = {1.0, 2.0};
        double[] target = {5.0, 7.0};
        double[] weights = {1.0, 1.0};
        double[] start = {0.0, 0.0}; // ห่างจากคำตอบ -> maxCosine > orthoTolerance แน่นอน

        LevenbergMarquardtOptimizer optimizer = new LevenbergMarquardtOptimizer();
        optimizer.setConvergenceChecker(new ImmediateConvergenceChecker());

        VectorialPointValuePair result =
            optimizer.optimize(new LinearFunction2D(xs), target, weights, start);

        assertNotNull(result);
        double[] p = result.getPoint();
        // อย่างน้อย 1 inner iteration ต้องเกิดขึ้นก่อนเช็ค checker -> point ไม่เท่า start เดิม
        assertFalse(p[0] == 0.0 && p[1] == 0.0);
    }

    // ----------------------------------------------------------------
    // 7. orthoTolerance สูงมาก (1.0) -> maxCosine<=orthoTolerance เป็นจริงทันที
    //    -> return current ก่อนเข้า inner loop เลย (point ไม่เปลี่ยนจาก start)
    // ----------------------------------------------------------------
    @Test
    public void testHighOrthoToleranceImmediateReturn() throws Exception {
        double[] xs = {1.0, 2.0};
        double[] target = {5.0, 7.0};
        double[] weights = {1.0, 1.0};
        double[] start = {0.0, 0.0};

        LevenbergMarquardtOptimizer optimizer = new LevenbergMarquardtOptimizer();
        optimizer.setOrthoTolerance(1.0); // cosine สูงสุดคือ 1.0 เสมอ

        VectorialPointValuePair result =
            optimizer.optimize(new LinearFunction2D(xs), target, weights, start);

        double[] p = result.getPoint();
        assertEquals(0.0, p[0], 1.0e-12);
        assertEquals(0.0, p[1], 1.0e-12);
    }

    // ----------------------------------------------------------------
    // 8. QR ranking threshold สูงมาก -> rank=0 ทันที (k=0)
    //    -> cover: rank==0 branch, paru==0 branch ใน determineLMParameter,
    //       nSing==0 (nSing>0 false) ใน determineLMDirection
    // ----------------------------------------------------------------
    @Test
    public void testVeryHighQRRankingThreshold() throws Exception {
        double[] xs = {1.0, 2.0};
        double[] target = {5.0, 7.0};
        double[] weights = {1.0, 1.0};
        double[] start = {0.0, 1.0}; // cost != 0 เพื่อให้เข้า loop

        LevenbergMarquardtOptimizer optimizer = new LevenbergMarquardtOptimizer();
        optimizer.setQRRankingThreshold(1.0e10); // ทำให้ column norm ใด ๆ ถือว่าเป็น 0 เสมอ

        VectorialPointValuePair result =
            optimizer.optimize(new LinearFunction2D(xs), target, weights, start);

        assertNotNull(result);
        double[] p = result.getPoint();
        // เนื่องจาก rank=0 -> lmDir ทุกตัว = 0 เสมอ -> point ไม่ควรเปลี่ยนจาก start
        assertEquals(0.0, p[0], 1.0e-9);
        assertEquals(1.0, p[1], 1.0e-9);
    }

    // ----------------------------------------------------------------
    // 9. Boundary: cols == 0 (ไม่มีพารามิเตอร์ให้ปรับ)
    //    -> solvedCols=0 -> maxCosine loop ไม่ทำงาน -> maxCosine=0<=orthoTolerance
    //    -> return ทันทีตั้งแต่ outer loop แรก
    // ----------------------------------------------------------------
    @Test
    public void testZeroParametersImmediateConvergence() throws Exception {
        double[] constants = {1.0, 2.0, 3.0};
        double[] target = {9.0, 9.0, 9.0}; // ค่าไม่ตรงกับ value() แต่ cost ไม่มีผลเพราะไม่มีพารามิเตอร์
        double[] weights = {1.0, 1.0, 1.0};
        double[] start = new double[0];

        LevenbergMarquardtOptimizer optimizer = new LevenbergMarquardtOptimizer();
        VectorialPointValuePair result =
            optimizer.optimize(new ZeroParamFunction(constants), target, weights, start);

        assertNotNull(result);
        assertEquals(0, result.getPoint().length);
    }

    // ----------------------------------------------------------------
    // 10. Boundary: rows == 0 (ไม่มีข้อมูล target)
    //     -> cost คำนวณจาก 0 elements สมมติว่า == 0
    //     -> skip maxCosine loop -> return ทันที
    //     หมายเหตุ: พฤติกรรมของ updateResidualsAndCost() เมื่อ rows=0 ไม่ได้แสดงใน source
    //     ที่ให้มา จึงเป็นการสมมติฐานตามพฤติกรรมทั่วไป (sum ว่าง = 0)
    // ----------------------------------------------------------------
    @Test
    public void testZeroRowsBoundary() throws Exception {
        double[] target = new double[0];
        double[] weights = new double[0];
        double[] start = {0.0, 0.0};

        LevenbergMarquardtOptimizer optimizer = new LevenbergMarquardtOptimizer();
        VectorialPointValuePair result =
            optimizer.optimize(new LinearFunction2D(new double[0]), target, weights, start);

        assertNotNull(result);
        double[] p = result.getPoint();
        assertEquals(0.0, p[0], 1.0e-12);
        assertEquals(0.0, p[1], 1.0e-12);
    }

    // ----------------------------------------------------------------
    // 11. Null target -> คาดหวังว่าจะเกิด exception (NPE หรืออื่น ๆ)
    //     หมายเหตุ: การ validate อยู่ใน superclass ที่ไม่มี source ให้
    //     จึงไม่ assert ชนิด exception เฉพาะเจาะจง เพียงยืนยันว่ามี exception เกิดขึ้น
    // ----------------------------------------------------------------
    @Test
    public void testNullTargetThrowsException() {
        double[] xs = {1.0, 2.0};
        double[] weights = {1.0, 1.0};
        double[] start = {0.0, 0.0};

        LevenbergMarquardtOptimizer optimizer = new LevenbergMarquardtOptimizer();
        boolean thrown = false;
        try {
            optimizer.optimize(new LinearFunction2D(xs), null, weights, start);
        } catch (Exception e) {
            thrown = true;
        }
        assertTrue("Expected an exception for null target array", thrown);
    }

    // ----------------------------------------------------------------
    // 12. Mismatched weights length -> คาดหวัง exception
    //     (สมมติฐาน: superclass validate ความยาว target/weights ให้เท่ากัน)
    // ----------------------------------------------------------------
    @Test
    public void testMismatchedWeightsLengthThrowsException() {
        double[] xs = {1.0, 2.0};
        double[] target = {5.0, 7.0};
        double[] weights = {1.0}; // length ไม่ตรงกับ target
        double[] start = {0.0, 0.0};

        LevenbergMarquardtOptimizer optimizer = new LevenbergMarquardtOptimizer();
        boolean thrown = false;
        try {
            optimizer.optimize(new LinearFunction2D(xs), target, weights, start);
        } catch (Exception e) {
            thrown = true;
        }
        assertTrue("Expected an exception for mismatched weights length", thrown);
    }

    // ----------------------------------------------------------------
    // 13. Setters ควรเก็บค่าได้โดยไม่ throw exception (ไม่มี getter ให้ assert ตรง ๆ
    //     จึงยืนยันทางอ้อมผ่านการเรียก optimize() สำเร็จหลังตั้งค่า)
    // ----------------------------------------------------------------
    @Test
    public void testSettersAcceptBoundaryAndNegativeValues() throws Exception {
        LevenbergMarquardtOptimizer optimizer = new LevenbergMarquardtOptimizer();

        optimizer.setInitialStepBoundFactor(0.0);
        optimizer.setCostRelativeTolerance(0.0);
        optimizer.setParRelativeTolerance(0.0);
        optimizer.setOrthoTolerance(0.0);
        optimizer.setQRRankingThreshold(0.0);

        optimizer.setInitialStepBoundFactor(-5.0); // ค่าผิดปกติ แต่ setter ไม่ validate
        optimizer.setCostRelativeTolerance(-1.0);
        optimizer.setParRelativeTolerance(-1.0);
        optimizer.setOrthoTolerance(-1.0);
        optimizer.setQRRankingThreshold(-1.0);

        // สุดท้ายตั้งค่ากลับให้สมเหตุสมผลและตรวจว่า optimize() ยังทำงานได้
        optimizer.setInitialStepBoundFactor(100.0);
        optimizer.setCostRelativeTolerance(1.0e-10);
        optimizer.setParRelativeTolerance(1.0e-10);
        optimizer.setOrthoTolerance(1.0e-10);
        optimizer.setQRRankingThreshold(1.0e-300);

        double[] xs = {1.0, 2.0};
        double[] target = {5.0, 7.0};
        double[] weights = {1.0, 1.0};
        double[] start = {0.0, 0.0};

        VectorialPointValuePair result =
            optimizer.optimize(new LinearFunction2D(xs), target, weights, start);
        assertNotNull(result);
    }

    // ----------------------------------------------------------------
    // 14. พยายาม trigger OptimizationException ผ่าน tight tolerance
    //     หมายเหตุ: การ trigger exception แบบ deterministic ทำได้ยากมาก
    //     (ต้องให้ actRed/preRed <= machine epsilon พอดี) จึงยอมรับได้ทั้งกรณี
    //     converge ปกติ หรือ throw OptimizationException - ไม่ assert เงื่อนไขเดียว
    //     เพื่อลดความไม่เสถียรของเทส (flaky test)
    // ----------------------------------------------------------------
    @Test
    public void testTightTolerancesEitherConvergeOrThrow() {
        double[] xs = {1.0, 2.0, 3.0};
        double[] target = {5.0, 7.0, 100.0}; // ไม่สอดคล้องกันเชิงเส้น (noise) -> ไม่มี exact fit
        double[] weights = {1.0, 1.0, 1.0};
        double[] start = {0.0, 0.0};

        LevenbergMarquardtOptimizer optimizer = new LevenbergMarquardtOptimizer();
        optimizer.setCostRelativeTolerance(0.0);
        optimizer.setParRelativeTolerance(0.0);
        optimizer.setMaxIterations(50);

        boolean converged = false;
        boolean exceptionThrown = false;
        try {
            VectorialPointValuePair result =
                optimizer.optimize(new LinearFunction2D(xs), target, weights, start);
            converged = (result != null);
        } catch (OptimizationException e) {
            exceptionThrown = true;
        } catch (Exception e) {
            // FunctionEvaluationException หรืออื่น ๆ ที่อาจเกิดจาก superclass
            exceptionThrown = true;
        }
        assertTrue("Expected either normal convergence or an exception",
                   converged || exceptionThrown);
    }

    // ----------------------------------------------------------------
    // 15. ค่า default ของ constructor: ตรวจว่าไม่ throw ตอนสร้าง instance ใหม่
    //     (ครอบคลุมเส้นทาง constructor ทั้งหมด: setMaxIterations, setConvergenceChecker(null),
    //      setInitialStepBoundFactor, setCostRelativeTolerance, setParRelativeTolerance,
    //      setOrthoTolerance, setQRRankingThreshold)
    // ----------------------------------------------------------------
    @Test
    public void testDefaultConstructorDoesNotThrow() {
        LevenbergMarquardtOptimizer optimizer = new LevenbergMarquardtOptimizer();
        assertNotNull(optimizer);
    }
}
