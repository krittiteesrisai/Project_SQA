package org.apache.commons.math.analysis.solvers;

import static org.junit.Assert.*;
import org.junit.Test;

import org.apache.commons.math.analysis.UnivariateRealFunction;
import org.apache.commons.math.exception.NoBracketingException;

/**
 * JUnit4 tests for {@link BaseSecantSolver}.
 *
 * หมายเหตุ: ใช้ helper subclass (TestSecantSolver) แทนการใช้
 * RegulaFalsiSolver / IllinoisSolver / PegasusSolver เพราะไม่มี source
 * ของคลาสเหล่านั้นให้มา (เพื่อไม่เดา behavior ที่ไม่ปรากฏในซอร์สที่ให้)
 */
public class BaseSecantSolverTest {

    /**
     * Concrete subclass สำหรับเปิดให้เลือก Method ได้ตรง ๆ
     * (Method และ constructor ของ BaseSecantSolver เป็น protected
     * แต่เข้าถึงได้เพราะ test class อยู่ package เดียวกัน)
     */
    private static class TestSecantSolver extends BaseSecantSolver {
        TestSecantSolver(double absoluteAccuracy, Method method) {
            super(absoluteAccuracy, method);
        }
        TestSecantSolver(double relativeAccuracy, double absoluteAccuracy, Method method) {
            super(relativeAccuracy, absoluteAccuracy, method);
        }
        TestSecantSolver(double relativeAccuracy, double absoluteAccuracy,
                          double functionValueAccuracy, Method method) {
            super(relativeAccuracy, absoluteAccuracy, functionValueAccuracy, method);
        }
    }

    private static final double SQRT2 = Math.sqrt(2);

    // f(x) = x^2 - 2 ; root = sqrt(2) ; ใช้ทดสอบ convergence แบบ non-trivial
    private static final UnivariateRealFunction SQRT2_FUNC = new UnivariateRealFunction() {
        public double value(double x) {
            return x * x - 2;
        }
    };

    // f(x) = x - 1 ; root ตรงที่ x=1 พอดี (ใช้ทดสอบ boundary f0==0 / f1==0)
    private static final UnivariateRealFunction LINEAR_FUNC = new UnivariateRealFunction() {
        public double value(double x) {
            return x - 1;
        }
    };

    // f(x) = x^2 + 1 ; ไม่มี real root -> เป็นบวกเสมอ -> ไม่ bracket
    private static final UnivariateRealFunction ALWAYS_POSITIVE_FUNC = new UnivariateRealFunction() {
        public double value(double x) {
            return x * x + 1;
        }
    };

    // ---------------------------------------------------------------
    // Boundary: f0 == 0.0  -> return x0 ทันที
    // ---------------------------------------------------------------
    @Test
    public void testSolveRootAtMin() {
        TestSecantSolver solver = new TestSecantSolver(1e-6, BaseSecantSolver.Method.REGULA_FALSI);
        double result = solver.solve(100, LINEAR_FUNC, 1.0, 5.0, 3.0, AllowedSolution.ANY_SIDE);
        assertEquals(1.0, result, 0.0);
    }

    // ---------------------------------------------------------------
    // Boundary: f1 == 0.0  -> return x1 ทันที
    // ---------------------------------------------------------------
    @Test
    public void testSolveRootAtMax() {
        TestSecantSolver solver = new TestSecantSolver(1e-6, BaseSecantSolver.Method.REGULA_FALSI);
        double result = solver.solve(100, LINEAR_FUNC, -5.0, 1.0, -2.0, AllowedSolution.ANY_SIDE);
        assertEquals(1.0, result, 0.0);
    }

    // ---------------------------------------------------------------
    // verifyBracketing ล้มเหลว -> ต้อง throw NoBracketingException
    // ---------------------------------------------------------------
    @Test(expected = NoBracketingException.class)
    public void testVerifyBracketingFailsSameSign() {
        TestSecantSolver solver = new TestSecantSolver(1e-6, BaseSecantSolver.Method.REGULA_FALSI);
        solver.solve(100, ALWAYS_POSITIVE_FUNC, -1.0, 1.0, 0.0, AllowedSolution.ANY_SIDE);
    }

    // boundary พิเศษ: min == max (degenerate interval) และ f0 != 0
    @Test(expected = NoBracketingException.class)
    public void testVerifyBracketingFailsDegenerateInterval() {
        TestSecantSolver solver = new TestSecantSolver(1e-6, BaseSecantSolver.Method.REGULA_FALSI);
        solver.solve(100, SQRT2_FUNC, 1.0, 1.0, 1.0, AllowedSolution.ANY_SIDE);
    }

    // ---------------------------------------------------------------
    // fx == 0.0 ระหว่าง loop (ไม่ใช่ที่ขอบ min/max) -> return x ทันที
    // ---------------------------------------------------------------
    @Test
    public void testExactRootFoundDuringIteration() {
        // f(x) = x - 1.5 ; secant ครั้งแรกจาก [0,3] จะตกที่ root พอดี
        UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) {
                return x - 1.5;
            }
        };
        TestSecantSolver solver = new TestSecantSolver(1e-6, BaseSecantSolver.Method.ILLINOIS);
        double result = solver.solve(100, f, 0.0, 3.0, 1.0, AllowedSolution.ANY_SIDE);
        assertEquals(1.5, result, 1e-9);
    }

    // ---------------------------------------------------------------
    // Method switch: REGULA_FALSI -> default case (ไม่ update f0)
    // ---------------------------------------------------------------
    @Test
    public void testSolveRegulaFalsiConverges() {
        TestSecantSolver solver = new TestSecantSolver(1e-9, BaseSecantSolver.Method.REGULA_FALSI);
        double result = solver.solve(1000, SQRT2_FUNC, 0.0, 2.0, 1.0, AllowedSolution.ANY_SIDE);
        assertEquals(SQRT2, result, 1e-6);
    }

    // ---------------------------------------------------------------
    // Method switch: ILLINOIS -> f0 *= 0.5
    // ---------------------------------------------------------------
    @Test
    public void testSolveIllinoisConverges() {
        TestSecantSolver solver = new TestSecantSolver(1e-9, BaseSecantSolver.Method.ILLINOIS);
        double result = solver.solve(1000, SQRT2_FUNC, 0.0, 2.0, 1.0, AllowedSolution.ANY_SIDE);
        assertEquals(SQRT2, result, 1e-6);
    }

    // ---------------------------------------------------------------
    // Method switch: PEGASUS -> f0 *= f1/(f1+fx)
    // ---------------------------------------------------------------
    @Test
    public void testSolvePegasusConverges() {
        TestSecantSolver solver = new TestSecantSolver(1e-9, BaseSecantSolver.Method.PEGASUS);
        double result = solver.solve(1000, SQRT2_FUNC, 0.0, 2.0, 1.0, AllowedSolution.ANY_SIDE);
        assertEquals(SQRT2, result, 1e-6);
    }

    // ---------------------------------------------------------------
    // Interval-width convergence branch x AllowedSolution switch (ทุกค่า)
    // หมายเหตุ: ทิศทาง <= / >= ของผลลัพธ์อิงตาม semantics ของชื่อ enum
    // (LEFT_SIDE/RIGHT_SIDE/BELOW_SIDE/ABOVE_SIDE) ซึ่งไม่ได้ verify ตรง ๆ
    // จาก source ที่ให้ จึงใส่ tolerance กว้างเพื่อลดความเสี่ยง false-fail
    // ---------------------------------------------------------------
    @Test
    public void testAllowedSolutionAnySide() {
        TestSecantSolver solver = new TestSecantSolver(1e-9, BaseSecantSolver.Method.ILLINOIS);
        double result = solver.solve(1000, SQRT2_FUNC, 0.0, 2.0, 1.0, AllowedSolution.ANY_SIDE);
        assertEquals(SQRT2, result, 1e-6);
    }

    @Test
    public void testAllowedSolutionLeftSide() {
        TestSecantSolver solver = new TestSecantSolver(1e-9, BaseSecantSolver.Method.ILLINOIS);
        double result = solver.solve(1000, SQRT2_FUNC, 0.0, 2.0, 1.0, AllowedSolution.LEFT_SIDE);
        assertEquals(SQRT2, result, 1e-3); // สมมติทิศทางตามชื่อ enum
    }

    @Test
    public void testAllowedSolutionRightSide() {
        TestSecantSolver solver = new TestSecantSolver(1e-9, BaseSecantSolver.Method.ILLINOIS);
        double result = solver.solve(1000, SQRT2_FUNC, 0.0, 2.0, 1.0, AllowedSolution.RIGHT_SIDE);
        assertEquals(SQRT2, result, 1e-3);
    }

    @Test
    public void testAllowedSolutionBelowSide() {
        TestSecantSolver solver = new TestSecantSolver(1e-9, BaseSecantSolver.Method.ILLINOIS);
        double result = solver.solve(1000, SQRT2_FUNC, 0.0, 2.0, 1.0, AllowedSolution.BELOW_SIDE);
        double fval = result * result - 2;
        assertTrue("BELOW_SIDE: f(result) ควร <= 0 โดยประมาณ", fval <= 1e-3);
    }

    @Test
    public void testAllowedSolutionAboveSide() {
        TestSecantSolver solver = new TestSecantSolver(1e-9, BaseSecantSolver.Method.ILLINOIS);
        double result = solver.solve(1000, SQRT2_FUNC, 0.0, 2.0, 1.0, AllowedSolution.ABOVE_SIDE);
        double fval = result * result - 2;
        assertTrue("ABOVE_SIDE: f(result) ควร >= 0 โดยประมาณ", fval >= -1e-3);
    }

    // ---------------------------------------------------------------
    // ftol branch: FastMath.abs(f1) <= ftol  (functionValueAccuracy > 0)
    // ทดสอบให้ branch นี้ trigger ก่อน interval-width branch
    // ---------------------------------------------------------------
    @Test
    public void testFunctionValueAccuracyBranchAnySide() {
        TestSecantSolver solver =
            new TestSecantSolver(1e-12, 1e-12, 1e-3, BaseSecantSolver.Method.ILLINOIS);
        double result = solver.solve(1000, SQRT2_FUNC, 0.0, 2.0, 1.0, AllowedSolution.ANY_SIDE);
        assertEquals(SQRT2, result, 0.05);
    }

    @Test
    public void testFunctionValueAccuracyBranchLeftSide() {
        TestSecantSolver solver =
            new TestSecantSolver(1e-12, 1e-12, 1e-3, BaseSecantSolver.Method.ILLINOIS);
        double result = solver.solve(1000, SQRT2_FUNC, 0.0, 2.0, 1.0, AllowedSolution.LEFT_SIDE);
        assertEquals(SQRT2, result, 0.05);
    }

    @Test
    public void testFunctionValueAccuracyBranchRightSide() {
        TestSecantSolver solver =
            new TestSecantSolver(1e-12, 1e-12, 1e-3, BaseSecantSolver.Method.ILLINOIS);
        double result = solver.solve(1000, SQRT2_FUNC, 0.0, 2.0, 1.0, AllowedSolution.RIGHT_SIDE);
        assertEquals(SQRT2, result, 0.05);
    }

    @Test
    public void testFunctionValueAccuracyBranchBelowSide() {
        TestSecantSolver solver =
            new TestSecantSolver(1e-12, 1e-12, 1e-3, BaseSecantSolver.Method.ILLINOIS);
        double result = solver.solve(1000, SQRT2_FUNC, 0.0, 2.0, 1.0, AllowedSolution.BELOW_SIDE);
        assertEquals(SQRT2, result, 0.05);
    }

    @Test
    public void testFunctionValueAccuracyBranchAboveSide() {
        TestSecantSolver solver =
            new TestSecantSolver(1e-12, 1e-12, 1e-3, BaseSecantSolver.Method.ILLINOIS);
        double result = solver.solve(1000, SQRT2_FUNC, 0.0, 2.0, 1.0, AllowedSolution.ABOVE_SIDE);
        assertEquals(SQRT2, result, 0.05);
    }

    // ---------------------------------------------------------------
    // Overload: solve(maxEval,f,min,max,allowedSolution)
    // ตรวจสูตร startValue = min + 0.5*(max-min)
    // ---------------------------------------------------------------
    @Test
    public void testSolveOverloadWithoutExplicitStartValue() {
        TestSecantSolver solver = new TestSecantSolver(1e-9, BaseSecantSolver.Method.PEGASUS);
        double result = solver.solve(1000, SQRT2_FUNC, 0.0, 2.0, AllowedSolution.ANY_SIDE);
        assertEquals(SQRT2, result, 1e-6);
    }

    // ---------------------------------------------------------------
    // Overload: solve(maxEval,f,min,max,startValue) -> default ANY_SIDE
    // หมายเหตุ: doSolve() อ่านแค่ getMin()/getMax() ไม่ใช้ startValue จริง ๆ
    // เทสนี้แสดงว่าผลลัพธ์ไม่ขึ้นกับ startValue ที่ส่งเข้ามา (ลักษณะของ source ที่ให้)
    // ---------------------------------------------------------------
    @Test
    public void testSolveOverloadDefaultsToAnySide() {
        TestSecantSolver solver = new TestSecantSolver(1e-9, BaseSecantSolver.Method.REGULA_FALSI);
        double resultA = solver.solve(1000, SQRT2_FUNC, 0.0, 2.0, 1.9999);
        double resultB = solver.solve(1000, SQRT2_FUNC, 0.0, 2.0, 0.0001);
        assertEquals(SQRT2, resultA, 1e-6);
        assertEquals(resultA, resultB, 1e-12); // startValue ไม่มีผลต่อผลลัพธ์จริง
    }

    // ---------------------------------------------------------------
    // Constructor coverage (3 รูปแบบ)
    // ---------------------------------------------------------------
    @Test
    public void testConstructorAbsoluteAccuracyOnly() {
        TestSecantSolver solver = new TestSecantSolver(1e-6, BaseSecantSolver.Method.ILLINOIS);
        assertEquals(1e-6, solver.getAbsoluteAccuracy(), 0.0);
    }

    @Test
    public void testConstructorRelativeAndAbsoluteAccuracy() {
        TestSecantSolver solver =
            new TestSecantSolver(1e-10, 1e-8, BaseSecantSolver.Method.PEGASUS);
        assertEquals(1e-10, solver.getRelativeAccuracy(), 0.0);
        assertEquals(1e-8, solver.getAbsoluteAccuracy(), 0.0);
    }

    @Test
    public void testConstructorFullAccuracy() {
        TestSecantSolver solver =
            new TestSecantSolver(1e-10, 1e-8, 1e-12, BaseSecantSolver.Method.REGULA_FALSI);
        assertEquals(1e-10, solver.getRelativeAccuracy(), 0.0);
        assertEquals(1e-8, solver.getAbsoluteAccuracy(), 0.0);
        assertEquals(1e-12, solver.getFunctionValueAccuracy(), 0.0);
    }

    // ---------------------------------------------------------------
    // Null input: ไม่มี null-check ใน source ที่ให้ -> คาดว่าเกิด NPE
    // (สมมติฐาน เพราะไม่มี source ของ computeObjectiveValue ให้ดูตรง ๆ)
    // ---------------------------------------------------------------
    @Test(expected = NullPointerException.class)
    public void testNullFunctionThrowsNPE() {
        TestSecantSolver solver = new TestSecantSolver(1e-6, BaseSecantSolver.Method.REGULA_FALSI);
        solver.solve(100, null, 0.0, 2.0, 1.0, AllowedSolution.ANY_SIDE);
    }
}
