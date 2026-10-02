package org.apache.commons.math.analysis.solvers;

import static org.junit.Assert.*;

import org.apache.commons.math.FunctionEvaluationException;
import org.apache.commons.math.MaxIterationsExceededException;
import org.apache.commons.math.analysis.UnivariateRealFunction;

import org.junit.Test;

/**
 * JUnit 4 test suite for {@link BrentSolver} (Defects4J Math-73b).
 *
 * หมายเหตุสำคัญ:
 * - โค้ดต้นฉบับมี fault ที่รู้จัก (Defects4J Math-73) ในเมธอด
 *   solve(f, min, max, initial): บรรทัด setResult(yMin, 0) และ
 *   setResult(yMax, 0) ควรจะเป็น setResult(min, 0) / setResult(max, 0)
 *   ตามลำดับ (คืนค่า "จุด" ที่ทำให้ฟังก์ชันเป็นศูนย์ ไม่ใช่ "ค่าฟังก์ชัน"
 *   ณ จุดนั้น) — ทดสอบนี้เขียน assertion ตาม contract ที่ถูกต้องตาม Javadoc
 *   ("return the value where the function is zero") เพื่อให้ดักจับ fault
 *   ได้จริงหากรันกับ source ที่ให้มา
 * - เมธอด/ฟิลด์ protected เช่น setMaximalIterationCount, setAbsoluteAccuracy,
 *   verifyInterval, verifySequence สมมติว่ามาจาก UnivariateRealSolverImpl
 *   ตาม API มาตรฐานของ Apache Commons Math ช่วงเวลานั้น (ไม่มี source
 *   ของคลาสนี้ให้ จึงอ้างอิงจาก Javadoc/การเรียกใช้ใน BrentSolver เท่านั้น)
 */
@SuppressWarnings("deprecation")
public class BrentSolverTest {

    private static final double DELTA = 1e-6;

    // ---------- Helper function implementations ----------

    /** f(x) = x - root */
    private static UnivariateRealFunction linear(final double root) {
        return new UnivariateRealFunction() {
            public double value(double x) throws FunctionEvaluationException {
                return x - root;
            }
        };
    }

    /** f(x) = x^2 - c */
    private static UnivariateRealFunction quadratic(final double c) {
        return new UnivariateRealFunction() {
            public double value(double x) throws FunctionEvaluationException {
                return x * x - c;
            }
        };
    }

    /** f(x) = x^3 - c */
    private static UnivariateRealFunction cubic(final double c) {
        return new UnivariateRealFunction() {
            public double value(double x) throws FunctionEvaluationException {
                return x * x * x - c;
            }
        };
    }

    /** f(x) = (x-2)^2  -- always >=0, double root at 2, no sign change */
    private static UnivariateRealFunction squareNoBracket() {
        return new UnivariateRealFunction() {
            public double value(double x) throws FunctionEvaluationException {
                return (x - 2.0) * (x - 2.0);
            }
        };
    }

    /** ฟังก์ชันคงที่ ไม่มี root เลย (เพื่อ non-bracketing) */
    private static UnivariateRealFunction alwaysPositive() {
        return new UnivariateRealFunction() {
            public double value(double x) throws FunctionEvaluationException {
                return x * x + 1.0; // >0 เสมอ
            }
        };
    }

    // =========================================================
    // solve(f, min, max, initial)
    // =========================================================

    @Test
    public void testSolveWithInitial_InitialIsRoot() throws Exception {
        BrentSolver solver = new BrentSolver();
        UnivariateRealFunction f = linear(2.0);
        // yInitial = f(2) = 0  -> branch: setResult(initial,0)  (ถูกต้องใน source)
        double result = solver.solve(f, 0.0, 5.0, 2.0);
        assertEquals(2.0, result, DELTA);
    }

    @Test
    public void testSolveWithInitial_MinIsRootBug() throws Exception {
        // f(x) = x - 5 ; min=5 เป็น root, initial=7 ไม่ใกล้ root
        BrentSolver solver = new BrentSolver();
        UnivariateRealFunction f = linear(5.0);
        double result = solver.solve(f, 5.0, 10.0, 7.0);
        // ตาม Javadoc: "return the value where the function is zero"
        // ค่าที่ถูกต้องคือ min = 5.0
        // Source ที่ให้มามี fault: setResult(yMin, 0) แทน setResult(min, 0)
        // ดังนั้น assertion นี้คาดหวังค่าที่ถูกต้องเพื่อดักจับ fault จริง
        assertEquals(5.0, result, DELTA);
    }

    @Test
    public void testSolveWithInitial_BracketMinInitial() throws Exception {
        // f(x) = x - 3 ; min=0(y=-3), initial=5(y=2) -> ตรงข้ามเครื่องหมาย
        BrentSolver solver = new BrentSolver();
        UnivariateRealFunction f = linear(3.0);
        double result = solver.solve(f, 0.0, 10.0, 5.0);
        assertEquals(3.0, result, DELTA);
    }

    @Test
    public void testSolveWithInitial_MaxIsRootBug() throws Exception {
        // f(x) = x - 8 ; min=0(y=-8), initial=4(y=-4) เครื่องหมายเดียวกัน,
        // max=8 เป็น root
        BrentSolver solver = new BrentSolver();
        UnivariateRealFunction f = linear(8.0);
        double result = solver.solve(f, 0.0, 8.0, 4.0);
        // เช่นเดียวกับกรณี min, source มี fault setResult(yMax,0)
        // ค่าที่ถูกต้องคือ max = 8.0
        assertEquals(8.0, result, DELTA);
    }

    @Test
    public void testSolveWithInitial_BracketInitialMax() throws Exception {
        // f(x) = x - 6 ; min=0(y=-6), initial=3(y=-3) เครื่องหมายเดียวกัน,
        // max=10(y=4) ตรงข้ามกับ initial
        BrentSolver solver = new BrentSolver();
        UnivariateRealFunction f = linear(6.0);
        double result = solver.solve(f, 0.0, 10.0, 3.0);
        assertEquals(6.0, result, DELTA);
    }

    @Test
    public void testSolveWithInitial_FullBrentPath() throws Exception {
        // f(x) = (x-2)^2 ; min=0(y=4) initial=1(y=1) max=5(y=9)
        // ไม่มีคู่ใดมีเครื่องหมายต่างกัน -> ตกไปที่ branch สุดท้าย (full Brent)
        // พฤติกรรมการลู่เข้า/ไม่ลู่เข้าของ private solve ในกรณีไม่มี bracket
        // จริงไม่ได้ระบุไว้ชัดใน Javadoc จึงไม่ฟันธง exact ผลลัพธ์ตัวเลข
        // (คอมเมนต์กำกับตามข้อกำหนดที่ 4) แต่ยืนยันว่า branch ถูก execute
        // และผลลัพธ์ (ถ้าไม่ throw) ต้องเป็นตัวเลขจริง (ไม่ NaN)
        BrentSolver solver = new BrentSolver();
        UnivariateRealFunction f = squareNoBracket();
        try {
            double result = solver.solve(f, 0.0, 5.0, 1.0);
            assertFalse("ผลลัพธ์ไม่ควรเป็น NaN", Double.isNaN(result));
        } catch (MaxIterationsExceededException e) {
            // เป็นไปได้ที่ไม่ลู่เข้าภายใน iteration ที่กำหนด - ยอมรับได้
            assertTrue(true);
        }
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSolveWithInitial_InitialOutOfRangeThrows() throws Exception {
        BrentSolver solver = new BrentSolver();
        UnivariateRealFunction f = linear(3.0);
        // initial = 20 อยู่นอกช่วง [0,10] -> verifySequence ควร throw
        solver.solve(f, 0.0, 10.0, 20.0);
    }

    // =========================================================
    // solve(f, min, max)
    // =========================================================

    @Test(expected = IllegalArgumentException.class)
    public void testSolveTwoArg_IntervalInvalidThrows() throws Exception {
        BrentSolver solver = new BrentSolver();
        UnivariateRealFunction f = linear(3.0);
        // min > max -> verifyInterval ควร throw
        solver.solve(f, 10.0, 1.0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSolveTwoArg_NonBracketingThrows() throws Exception {
        BrentSolver solver = new BrentSolver();
        UnivariateRealFunction f = alwaysPositive();
        // yMin, yMax ทั้งคู่ > 0 และไม่ใกล้ 0 -> non-bracketing exception
        solver.solve(f, -5.0, 5.0);
    }

    @Test
    public void testSolveTwoArg_SignPositiveMinNearZero() throws Exception {
        BrentSolver solver = new BrentSolver();
        UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) throws FunctionEvaluationException {
                if (x == 0.0) {
                    return 1e-9; // ใกล้ 0 มาก (<= functionValueAccuracy)
                }
                return 100.0; // เครื่องหมายเดียวกัน (บวก)
            }
        };
        double result = solver.solve(f, 0.0, 1.0);
        assertEquals(0.0, result, DELTA);
    }

    @Test
    public void testSolveTwoArg_SignPositiveMaxNearZero() throws Exception {
        BrentSolver solver = new BrentSolver();
        UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) throws FunctionEvaluationException {
                if (x == 1.0) {
                    return 1e-9; // ใกล้ 0
                }
                return 100.0; // เครื่องหมายเดียวกัน (บวก) ที่ min
            }
        };
        double result = solver.solve(f, 0.0, 1.0);
        assertEquals(1.0, result, DELTA);
    }

    @Test
    public void testSolveTwoArg_ExactZeroAtMin() throws Exception {
        BrentSolver solver = new BrentSolver();
        // f(min)=0 พอดี, f(max) != 0  -> sign == 0, yMin==0.0 -> return min
        UnivariateRealFunction f = linear(2.0);
        double result = solver.solve(f, 2.0, 10.0);
        assertEquals(2.0, result, DELTA);
    }

    @Test
    public void testSolveTwoArg_ExactZeroAtMax() throws Exception {
        BrentSolver solver = new BrentSolver();
        // f(max)=0 พอดี, f(min) != 0 -> sign == 0, yMin!=0.0 -> return max
        UnivariateRealFunction f = linear(5.0);
        double result = solver.solve(f, 0.0, 5.0);
        assertEquals(5.0, result, DELTA);
    }

    @Test
    public void testSolveTwoArg_NormalBracket() throws Exception {
        BrentSolver solver = new BrentSolver();
        UnivariateRealFunction f = linear(3.0);
        double result = solver.solve(f, 0.0, 10.0);
        assertEquals(3.0, result, DELTA);
    }

    @Test
    public void testSolveTwoArg_QuadraticBracket() throws Exception {
        // ทดสอบ inverse-quadratic-interpolation path (x0 != x2) โดยอ้อม
        BrentSolver solver = new BrentSolver();
        UnivariateRealFunction f = quadratic(2.0); // root = sqrt(2)
        double result = solver.solve(f, 0.0, 2.0);
        assertEquals(Math.sqrt(2.0), result, 1e-5);
    }

    // =========================================================
    // Deprecated APIs (ต้องใช้ constructor ที่ฝังฟังก์ชันไว้)
    // =========================================================

    @Test
    public void testDeprecatedSolveMinMax() throws Exception {
        UnivariateRealFunction f = linear(4.0);
        BrentSolver solver = new BrentSolver(f); // deprecated constructor
        double result = solver.solve(0.0, 10.0);
        assertEquals(4.0, result, DELTA);
    }

    @Test
    public void testDeprecatedSolveMinMaxInitial() throws Exception {
        UnivariateRealFunction f = linear(4.0);
        BrentSolver solver = new BrentSolver(f); // deprecated constructor
        double result = solver.solve(0.0, 10.0, 4.0);
        assertEquals(4.0, result, DELTA);
    }

    // =========================================================
    // private solve(...) : MaxIterationsExceededException
    // =========================================================

    @Test(expected = MaxIterationsExceededException.class)
    public void testPrivateSolve_MaxIterationsExceeded() throws Exception {
        BrentSolver solver = new BrentSolver();
        // บีบ iteration ให้น้อยมาก และตั้ง accuracy ให้ละเอียดมาก
        // เพื่อบังคับให้ loop ไม่ลู่เข้าภายใน iteration ที่กำหนด
        // (สมมติว่า setMaximalIterationCount / setAbsoluteAccuracy
        //  มีอยู่ใน UnivariateRealSolverImpl ตาม API มาตรฐาน)
        solver.setMaximalIterationCount(2);
        solver.setAbsoluteAccuracy(1e-15);
        UnivariateRealFunction f = cubic(2.0); // root = 2^(1/3)
        solver.solve(f, 0.0, 2.0);
    }
}
