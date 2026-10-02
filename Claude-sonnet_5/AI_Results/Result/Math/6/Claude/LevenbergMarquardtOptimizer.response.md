# LevenbergMarquardtOptimizerTest

## แนวคิดการทดสอบ

เนื่องจาก `LevenbergMarquardtOptimizer` มีเมธอด public เพียง constructor ทั้ง 5 แบบ และเมธอด `optimize(OptimizationData...)` ที่รับช่วงมาจากคลาสแม่ ส่วนเมธอดหลัก (`doOptimize`, `qrDecomposition`, `determineLMParameter`, `determineLMDirection`, `qTy`, `checkParameters`) เป็น `private` ทั้งหมด จึงต้องทดสอบผ่าน `optimize()` ด้วยโมเดลทางคณิตศาสตร์ที่ออกแบบมาให้ไป "กระตุ้น" เงื่อนไขต่าง ๆ ภายใน branch ที่วิเคราะห์ได้จาก source:

- `currentCost != 0` (true/false)
- `maxCosine <= orthoTolerance` (true → return ทันที)
- `firstIteration` (true ตอนเริ่ม, false รอบถัดไป)
- `xNorm == 0` / `xNorm != 0` (เลือกค่า `delta` เริ่มต้น)
- `rank == solvedCols` (true/false) ใน `determineLMParameter`
- `ak2 <= qrRankingThreshold` → rank-deficient ใน `qrDecomposition`
- `checker != null` และ `checker.converged()` true/false
- `ratio <= 0.25` / `ratio >= 0.75` / `lmPar == 0`
- `getLowerBound()!=null || getUpperBound()!=null` → `MathUnsupportedOperationException`

**หมายเหตุสำคัญ:** บาง branch เช่น การ throw `ConvergenceException` (`TOO_SMALL_COST_RELATIVE_TOLERANCE`, `TOO_SMALL_PARAMETERS_RELATIVE_TOLERANCE`, `TOO_SMALL_ORTHOGONALITY_TOLERANCE`) และ branch ของ `Double.isInfinite(norm2) || Double.isNaN(norm2)` ใน `qrDecomposition` ขึ้นกับสภาวะเชิงตัวเลขที่ละเอียดมาก (machine epsilon) ซึ่ง**ไม่สามารถยืนยันได้แน่นอนจาก source ที่ให้มาว่าจะเกิดขึ้นเมื่อใดโดยไม่พึ่งพาการเดาพฤติกรรมภายในของ FastMath/คำนวณ floating point** จึงไม่ได้สร้าง test case ที่ assert exception เหล่านี้โดยตรง (เป็นไปตามข้อกำหนดที่ 4) — มีการ comment ไว้ในโค้ด

```java
package org.apache.commons.math3.optim.nonlinear.vector.jacobian;

import static org.junit.Assert.*;

import org.junit.Test;

import org.apache.commons.math3.analysis.MultivariateMatrixFunction;
import org.apache.commons.math3.analysis.MultivariateVectorFunction;
import org.apache.commons.math3.exception.MathUnsupportedOperationException;
import org.apache.commons.math3.optim.ConvergenceChecker;
import org.apache.commons.math3.optim.InitialGuess;
import org.apache.commons.math3.optim.MaxEval;
import org.apache.commons.math3.optim.MaxIter;
import org.apache.commons.math3.optim.PointVectorValuePair;
import org.apache.commons.math3.optim.SimpleBounds;
import org.apache.commons.math3.optim.nonlinear.vector.ModelFunction;
import org.apache.commons.math3.optim.nonlinear.vector.ModelFunctionJacobian;
import org.apache.commons.math3.optim.nonlinear.vector.Target;
import org.apache.commons.math3.optim.nonlinear.vector.Weight;

/**
 * Unit tests for {@link LevenbergMarquardtOptimizer}.
 *
 * หมายเหตุ: คลาสเป้าหมายมีเมธอดภายใน (private) ทั้งหมดสำหรับอัลกอริทึม LM/QR
 * จึงทดสอบผ่าน public API: constructors + optimize(OptimizationData...)
 * โดยออกแบบโมเดลทางคณิตศาสตร์ให้ครอบคลุม branch ต่าง ๆ ที่วิเคราะห์ได้จาก source.
 */
public class LevenbergMarquardtOptimizerTest {

    // ---------------------------------------------------------------
    // Helper: linear model y_i = coeff_i * p0  (1 parameter, N equations)
    // ---------------------------------------------------------------
    private MultivariateVectorFunction linearModel(final double[] coeffs) {
        return new MultivariateVectorFunction() {
            @Override
            public double[] value(double[] point) {
                double[] v = new double[coeffs.length];
                for (int i = 0; i < coeffs.length; i++) {
                    v[i] = coeffs[i] * point[0];
                }
                return v;
            }
        };
    }

    private MultivariateMatrixFunction linearJacobian(final double[] coeffs) {
        return new MultivariateMatrixFunction() {
            @Override
            public double[][] value(double[] point) {
                double[][] j = new double[coeffs.length][1];
                for (int i = 0; i < coeffs.length; i++) {
                    j[i][0] = coeffs[i];
                }
                return j;
            }
        };
    }

    // ---------------------------------------------------------------
    // Helper: rank-deficient model: y_i = p0 + p1 for every row
    // (2 parameters contribute identically -> jacobian columns identical)
    // ---------------------------------------------------------------
    private MultivariateVectorFunction sumModel(final int rows) {
        return new MultivariateVectorFunction() {
            @Override
            public double[] value(double[] point) {
                double sum = point[0] + point[1];
                double[] v = new double[rows];
                for (int i = 0; i < rows; i++) {
                    v[i] = sum;
                }
                return v;
            }
        };
    }

    private MultivariateMatrixFunction sumJacobian(final int rows) {
        return new MultivariateMatrixFunction() {
            @Override
            public double[][] value(double[] point) {
                double[][] j = new double[rows][2];
                for (int i = 0; i < rows; i++) {
                    j[i][0] = 1.0;
                    j[i][1] = 1.0;
                }
                return j;
            }
        };
    }

    // ---------------------------------------------------------------
    // Helper: nonlinear scalar model y = p0^2 (requires several iterations)
    // ---------------------------------------------------------------
    private MultivariateVectorFunction squareModel() {
        return new MultivariateVectorFunction() {
            @Override
            public double[] value(double[] point) {
                return new double[] { point[0] * point[0] };
            }
        };
    }

    private MultivariateMatrixFunction squareJacobian() {
        return new MultivariateMatrixFunction() {
            @Override
            public double[][] value(double[] point) {
                return new double[][] { { 2.0 * point[0] } };
            }
        };
    }

    // =================================================================
    // 1. Default constructor + simple linear fit, initial guess = 0
    //    -> covers xNorm == 0 branch, currentCost != 0 (true) at start,
    //       checker == null path, default convergence-criteria return.
    // =================================================================
    @Test
    public void testDefaultConstructor_LinearFit_ZeroInitialGuess() {
        double[] coeffs = { 1, 2, 3 };
        double[] target = { 2, 4, 6 }; // exact solution p0 = 2

        LevenbergMarquardtOptimizer optimizer = new LevenbergMarquardtOptimizer();
        PointVectorValuePair result = optimizer.optimize(
                new MaxEval(1000),
                new MaxIter(1000),
                new Target(target),
                new Weight(new double[] { 1, 1, 1 }),
                new ModelFunction(linearModel(coeffs)),
                new ModelFunctionJacobian(linearJacobian(coeffs)),
                new InitialGuess(new double[] { 0.0 }));

        assertNotNull(result);
        assertEquals(2.0, result.getPoint()[0], 1e-6);
    }

    // =================================================================
    // 2. Five-arg constructor (no checker) + non-zero initial guess
    //    -> covers xNorm != 0 branch (delta = factor * xNorm),
    //       firstIteration=true path with non-trivial xk.
    // =================================================================
    @Test
    public void testFiveArgConstructor_NonZeroInitialGuess() {
        double[] coeffs = { 1, 2, 3 };
        double[] target = { 2, 4, 6 };

        LevenbergMarquardtOptimizer optimizer =
                new LevenbergMarquardtOptimizer(100, 1e-10, 1e-10, 1e-10, 1e-15);

        PointVectorValuePair result = optimizer.optimize(
                new MaxEval(1000),
                new MaxIter(1000),
                new Target(target),
                new Weight(new double[] { 1, 1, 1 }),
                new ModelFunction(linearModel(coeffs)),
                new ModelFunctionJacobian(linearJacobian(coeffs)),
                new InitialGuess(new double[] { 5.0 })); // non-zero -> xNorm != 0

        assertNotNull(result);
        assertEquals(2.0, result.getPoint()[0], 1e-6);
    }

    // =================================================================
    // 3. Three-arg constructor (costTol, parTol, orthoTol) delegates to
    //    five-arg constructor with default factor=100, threshold=SAFE_MIN
    //    -> just verifies delegation works correctly end-to-end.
    // =================================================================
    @Test
    public void testThreeArgConstructor_DelegatesCorrectly() {
        double[] coeffs = { 1, 2, 3 };
        double[] target = { 2, 4, 6 };

        LevenbergMarquardtOptimizer optimizer =
                new LevenbergMarquardtOptimizer(1e-10, 1e-10, 1e-10);

        PointVectorValuePair result = optimizer.optimize(
                new MaxEval(1000),
                new MaxIter(1000),
                new Target(target),
                new Weight(new double[] { 1, 1, 1 }),
                new ModelFunction(linearModel(coeffs)),
                new ModelFunctionJacobian(linearJacobian(coeffs)),
                new InitialGuess(new double[] { 0.0 }));

        assertNotNull(result);
        assertEquals(2.0, result.getPoint()[0], 1e-6);
    }

    // =================================================================
    // 4. Constructor with checker (checker != null) and checker always
    //    returns true -> covers "if (checker != null)" true branch and
    //    "checker.converged()==true" branch causing early return inside
    //    the inner loop (successful-iteration path).
    // =================================================================
    @Test
    public void testConstructorWithChecker_AlwaysConvergedChecker() {
        double[] coeffs = { 1, 2, 3 };
        double[] target = { 2, 4, 6 };

        ConvergenceChecker<PointVectorValuePair> alwaysTrueChecker =
                new ConvergenceChecker<PointVectorValuePair>() {
                    @Override
                    public boolean converged(int iteration,
                                              PointVectorValuePair previous,
                                              PointVectorValuePair current) {
                        return true;
                    }
                };

        LevenbergMarquardtOptimizer optimizer =
                new LevenbergMarquardtOptimizer(alwaysTrueChecker);

        PointVectorValuePair result = optimizer.optimize(
                new MaxEval(1000),
                new MaxIter(1000),
                new Target(target),
                new Weight(new double[] { 1, 1, 1 }),
                new ModelFunction(linearModel(coeffs)),
                new ModelFunctionJacobian(linearJacobian(coeffs)),
                new InitialGuess(new double[] { 0.0 }));

        assertNotNull(result);
        // สำหรับโมเดล linear แท้จริง หนึ่ง Gauss-Newton step ก็แก้ปัญหาได้พอดี
        // จึง checker.converged() == true ตั้งแต่ iteration แรกที่ ratio สำเร็จ
        assertEquals(2.0, result.getPoint()[0], 1e-6);
    }

    // =================================================================
    // 5. Six-arg constructor with explicit checker + custom tolerances
    //    -> covers the (factor, checker, costTol, parTol, orthoTol, threshold)
    //       constructor branch, checker != null but never converges early
    //       (returns false) so flow must rely on default criteria too.
    // =================================================================
    @Test
    public void testSixArgConstructor_CheckerNeverConverges() {
        double[] coeffs = { 1, 2, 3 };
        double[] target = { 2, 4, 6 };

        ConvergenceChecker<PointVectorValuePair> neverConvergedChecker =
                new ConvergenceChecker<PointVectorValuePair>() {
                    @Override
                    public boolean converged(int iteration,
                                              PointVectorValuePair previous,
                                              PointVectorValuePair current) {
                        return false; // covers checker!=null but converged()==false branch
                    }
                };

        LevenbergMarquardtOptimizer optimizer = new LevenbergMarquardtOptimizer(
                100, neverConvergedChecker, 1e-10, 1e-10, 1e-10, 1e-15);

        PointVectorValuePair result = optimizer.optimize(
                new MaxEval(1000),
                new MaxIter(1000),
                new Target(target),
                new Weight(new double[] { 1, 1, 1 }),
                new ModelFunction(linearModel(coeffs)),
                new ModelFunctionJacobian(linearJacobian(coeffs)),
                new InitialGuess(new double[] { 0.0 }));

        assertNotNull(result);
        // แม้ checker ไม่ยอม converge แต่ default convergence criteria
        // (ตรวจ actRed/preRed/delta) ยังทำงานและ optimizer จะ return ในที่สุด
        assertEquals(2.0, result.getPoint()[0], 1e-6);
    }

    // =================================================================
    // 6. Initial guess ตรงกับคำตอบจริง -> currentCost == 0 ตั้งแต่เริ่ม
    //    -> covers "if (currentCost != 0)" FALSE branch, และ
    //       maxCosine (=0) <= orthoTolerance => return ทันทีใน outer loop
    //       รอบแรก (ไม่เข้า inner loop เลย)
    // =================================================================
    @Test
    public void testOptimize_AlreadyAtSolution_ZeroCostImmediateReturn() {
        double[] coeffs = { 1, 2, 3 };
        double[] target = { 2, 4, 6 };

        LevenbergMarquardtOptimizer optimizer = new LevenbergMarquardtOptimizer();

        PointVectorValuePair result = optimizer.optimize(
                new MaxEval(1000),
                new MaxIter(1000),
                new Target(target),
                new Weight(new double[] { 1, 1, 1 }),
                new ModelFunction(linearModel(coeffs)),
                new ModelFunctionJacobian(linearJacobian(coeffs)),
                new InitialGuess(new double[] { 2.0 })); // ตรงกับคำตอบจริง

        assertNotNull(result);
        assertEquals(2.0, result.getPoint()[0], 1e-9);
    }

    // =================================================================
    // 7. Rank-deficient jacobian: p0 + p1 ให้ผลลัพธ์เดียวกันทุกแถว
    //    -> covers "ak2 <= qrRankingThreshold" TRUE branch ใน qrDecomposition
    //       (rank < solvedCols), และ "if (rank == solvedCols)" FALSE branch
    //       ใน determineLMParameter (parl คงเป็น 0)
    // =================================================================
    @Test
    public void testOptimize_RankDeficientJacobian_SumModel() {
        int rows = 2;
        double[] target = { 3, 3 };

        LevenbergMarquardtOptimizer optimizer = new LevenbergMarquardtOptimizer();

        PointVectorValuePair result = optimizer.optimize(
                new MaxEval(1000),
                new MaxIter(1000),
                new Target(target),
                new Weight(new double[] { 1, 1 }),
                new ModelFunction(sumModel(rows)),
                new ModelFunctionJacobian(sumJacobian(rows)),
                new InitialGuess(new double[] { 0.0, 0.0 }));

        assertNotNull(result);
        double sum = result.getPoint()[0] + result.getPoint()[1];
        assertEquals(3.0, sum, 1e-6);
    }

    // =================================================================
    // 8. Underdetermined system: nR(1) < nC(2)
    //    -> covers solvedCols = min(nR, nC) = nR branch (ต่างจาก test อื่น
    //       ที่ solvedCols = nC)
    // =================================================================
    @Test
    public void testOptimize_UnderdeterminedSystem_MoreParamsThanEquations() {
        int rows = 1;
        double[] target = { 3 };

        LevenbergMarquardtOptimizer optimizer = new LevenbergMarquardtOptimizer();

        PointVectorValuePair result = optimizer.optimize(
                new MaxEval(1000),
                new MaxIter(1000),
                new Target(target),
                new Weight(new double[] { 1 }),
                new ModelFunction(sumModel(rows)),
                new ModelFunctionJacobian(sumJacobian(rows)),
                new InitialGuess(new double[] { 0.0, 0.0 }));

        assertNotNull(result);
        double sum = result.getPoint()[0] + result.getPoint()[1];
        assertEquals(3.0, sum, 1e-6);
    }

    // =================================================================
    // 9. Nonlinear problem (p0^2 = 4) ต้องใช้หลาย outer-loop iteration
    //    -> covers "if (firstIteration)" FALSE branch รอบถัดไป,
    //       ratio <= 0.25 / ratio >= 0.75 adjustment branches,
    //       lmPar == 0 initial branch กับการปรับค่า lmPar *= 0.5 หรือ /= tmp
    // =================================================================
    @Test
    public void testOptimize_NonlinearProblem_MultipleIterations() {
        double[] target = { 4.0 };

        LevenbergMarquardtOptimizer optimizer = new LevenbergMarquardtOptimizer();

        PointVectorValuePair result = optimizer.optimize(
                new MaxEval(1000),
                new MaxIter(1000),
                new Target(target),
                new Weight(new double[] { 1 }),
                new ModelFunction(squareModel()),
                new ModelFunctionJacobian(squareJacobian()),
                new InitialGuess(new double[] { 1.0 })); // ห่างจากคำตอบ -> ต้องวนหลายรอบ

        assertNotNull(result);
        // คำตอบที่เป็นไปได้คือ +2 หรือ -2 (p0^2 = 4); เริ่มจากค่าบวกมักลู่เข้า +2
        assertEquals(4.0, result.getPoint()[0] * result.getPoint()[0], 1e-4);
    }

    // =================================================================
    // 10. Bounds supplied -> checkParameters() ต้อง throw
    //     MathUnsupportedOperationException
    //     -> covers "getLowerBound()!=null || getUpperBound()!=null" TRUE branch
    // =================================================================
    @Test(expected = MathUnsupportedOperationException.class)
    public void testOptimize_WithBounds_ThrowsMathUnsupportedOperationException() {
        double[] coeffs = { 1, 2, 3 };
        double[] target = { 2, 4, 6 };

        LevenbergMarquardtOptimizer optimizer = new LevenbergMarquardtOptimizer();

        optimizer.optimize(
                new MaxEval(10),
                new MaxIter(10),
                new Target(target),
                new Weight(new double[] { 1, 1, 1 }),
                new ModelFunction(linearModel(coeffs)),
                new ModelFunctionJacobian(linearJacobian(coeffs)),
                new InitialGuess(new double[] { 0.0 }),
                new SimpleBounds(new double[] { -10 }, new double[] { 10 }));
    }

    // =================================================================
    // 11. Boundary: โมเดลที่คำตอบเริ่มต้นทำให้ currentCost != 0 แต่
    //     jacNorm ของบางคอลัมน์ = 0 (dk==0 branch ใน scale-point step)
    //     -> covers "if (dk == 0) dk = 1.0" TRUE branch ของ firstIteration block
    //     หมายเหตุ: ใช้ jacobian ที่คอลัมน์แรกเป็น 0 เสมอ (พารามิเตอร์ที่ไม่มีผลต่อโมเดล)
    // =================================================================
    @Test
    public void testOptimize_ZeroJacobianColumnNorm_DkZeroBranch() {
        // พารามิเตอร์ p0 ไม่มีผลต่อโมเดลเลย (จาโคเบียนคอลัมน์ 0 เสมอ) ส่วน p1 คือค่าจริง
        final double[] target = { 5.0, 5.0 };

        MultivariateVectorFunction model = new MultivariateVectorFunction() {
            @Override
            public double[] value(double[] point) {
                // p0 ไม่มีผลกระทบ (coefficient 0), p1 มีผลเต็มที่
                return new double[] { point[1], point[1] };
            }
        };
        MultivariateMatrixFunction jacobian = new MultivariateMatrixFunction() {
            @Override
            public double[][] value(double[] point) {
                return new double[][] { { 0.0, 1.0 }, { 0.0, 1.0 } };
            }
        };

        LevenbergMarquardtOptimizer optimizer = new LevenbergMarquardtOptimizer();

        PointVectorValuePair result = optimizer.optimize(
                new MaxEval(1000),
                new MaxIter(1000),
                new Target(target),
                new Weight(new double[] { 1, 1 }),
                new ModelFunction(model),
                new ModelFunctionJacobian(jacobian),
                new InitialGuess(new double[] { 0.0, 0.0 }));

        assertNotNull(result);
        assertEquals(5.0, result.getPoint()[1], 1e-6);
    }

    /*
     * ไม่ได้ครอบคลุม (เขียนกำกับไว้ตามข้อกำหนดที่ 4):
     * - ConvergenceException: TOO_SMALL_COST_RELATIVE_TOLERANCE,
     *   TOO_SMALL_PARAMETERS_RELATIVE_TOLERANCE, TOO_SMALL_ORTHOGONALITY_TOLERANCE
     *   เนื่องจากต้องพึ่งพาพฤติกรรม floating-point ที่ละเอียดมาก (เทียบกับ machine
     *   epsilon 2.2204e-16) ซึ่งไม่สามารถยืนยัน input ที่แน่นอนจาก source ที่ให้มา
     *   โดยไม่เดาพฤติกรรมภายใน FastMath/คำนวณเชิงตัวเลข
     * - ConvergenceException: UNABLE_TO_PERFORM_QR_DECOMPOSITION_ON_JACOBIAN
     *   (เมื่อ norm2 เป็น Infinite/NaN) เนื่องจากต้องสร้าง jacobian ที่ให้ค่า NaN/Infinity
     *   ซึ่งไม่มีตัวอย่างพฤติกรรมที่ยืนยันได้จาก source ว่าโมเดลแบบใดจะ trigger ได้แน่นอน
     *   โดยไม่ทำให้ขั้นตอนก่อนหน้า (computeObjectiveValue) throw exception อื่นก่อน
     */
}
```

## ตารางสรุป Branch/Condition ที่แต่ละเทสครอบคลุม

| Test Method | Branch / Condition ที่ครอบคลุม |
|---|---|
| `testDefaultConstructor_LinearFit_ZeroInitialGuess` | Default constructor; `xNorm==0` → `delta=initialStepBoundFactor`; `currentCost!=0` true; `checker==null`; default convergence criteria return |
| `testFiveArgConstructor_NonZeroInitialGuess` | 5-arg constructor (no checker); `xNorm!=0` → `delta=factor*xNorm`; `firstIteration` true-path กับ `xk!=0` |
| `testThreeArgConstructor_DelegatesCorrectly` | 3-arg constructor delegation ไปยัง 5-arg constructor (`checker=null`) |
| `testConstructorWithChecker_AlwaysConvergedChecker` | Constructor(checker); `checker!=null` true; `checker.converged()==true` → return ใน inner loop success branch |
| `testSixArgConstructor_CheckerNeverConverges` | 6-arg constructor (factor, checker, costTol, parTol, orthoTol, threshold); `checker!=null` แต่ `converged()==false`; fallback ไป default convergence criteria |
| `testOptimize_AlreadyAtSolution_ZeroCostImmediateReturn` | `currentCost!=0` **false** branch; `maxCosine<=orthoTolerance` true ตั้งแต่รอบแรก (ไม่เข้า inner loop) |
| `testOptimize_RankDeficientJacobian_SumModel` | `ak2<=qrRankingThreshold` true (`qrDecomposition` rank-deficient, `rank<nC`); `rank==solvedCols` **false** branch ใน `determineLMParameter` |
| `testOptimize_UnderdeterminedSystem_MoreParamsThanEquations` | `solvedCols = min(nR,nC)` กรณี `nR<nC` (ต่างจาก test อื่นที่ `nC<nR`) |
| `testOptimize_NonlinearProblem_MultipleIterations` | `firstIteration` **false** branch (outer loop รอบ ≥2); `ratio<=0.25` / `ratio>=0.75`; `lmPar==0` initial → `lmPar*=0.5` หรือ `lmPar/=tmp` adjustments |
| `testOptimize_WithBounds_ThrowsMathUnsupportedOperationException` | `checkParameters()`: `getLowerBound()!=null \|\| getUpperBound()!=null` true → throw `MathUnsupportedOperationException` |
| `testOptimize_ZeroJacobianColumnNorm_DkZeroBranch` | `if (dk==0) dk=1.0` true branch ใน scale-point step ของ `firstIteration` block |

**หมายเหตุปิดท้าย:** ยังมี branch เชิงตัวเลขละเอียดบางส่วน (`ConvergenceException` ทั้ง 3 ประเภท และ `Double.isInfinite/isNaN` branch ใน `qrDecomposition`) ที่ไม่สามารถยืนยัน input ที่ trigger ได้แน่นอนจาก source ที่ให้มา จึงไม่ได้สร้าง test case สำหรับ branch เหล่านี้ตามข้อกำหนดที่ 4 (ห้ามเดา behavior)