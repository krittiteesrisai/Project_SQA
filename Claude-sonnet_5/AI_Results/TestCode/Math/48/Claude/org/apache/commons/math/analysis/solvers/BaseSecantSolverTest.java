package org.apache.commons.math.analysis.solvers;

import static org.junit.Assert.*;

import org.apache.commons.math.analysis.UnivariateRealFunction;
import org.junit.Test;

/**
 * JUnit4 test suite for {@link BaseSecantSolver}.
 * ทดสอบผ่าน concrete subclass: RegulaFalsiSolver, IllinoisSolver, PegasusSolver
 */
public class BaseSecantSolverTest {

    // f(x) = x - 2 : ฟังก์ชันเชิงเส้น secant step แรกจะกระโดดตรงไปที่รากพอดี
    private static final UnivariateRealFunction LINEAR = new UnivariateRealFunction() {
        public double value(double x) {
            return x - 2.0;
        }
    };

    // f(x) = x^2 - 2 : ฟังก์ชัน convex ที่ทำให้เกิด "inverted" interval ตั้งแต่รอบแรก
    // และฝั่ง x0 (=2.0) ติดอยู่คงที่ตลอดการวนซ้ำ -> ใช้ตรวจ AllowedSolution ทุกแบบ
    private static final UnivariateRealFunction QUADRATIC = new UnivariateRealFunction() {
        public double value(double x) {
            return x * x - 2.0;
        }
    };

    // f(x) = x^3 - 2x - 5 : ฟังก์ชันคลาสสิกที่ REGULA_FALSI ลู่เข้าช้า (ใช้ตรวจ method branch)
    private static final UnivariateRealFunction CUBIC = new UnivariateRealFunction() {
        public double value(double x) {
            return x * x * x - 2 * x - 5;
        }
    };

    private static final double SQRT2 = Math.sqrt(2.0);
    private static final double CUBIC_ROOT = 2.0945514815423265;

    // ===================== 1. Boundary: f(min)==0 / f(max)==0 =====================

    @Test
    public void testRootExactlyAtMin() {
        RegulaFalsiSolver solver = new RegulaFalsiSolver();
        double result = solver.solve(100, LINEAR, 2.0, 5.0);
        assertEquals(2.0, result, 0.0);
    }

    @Test
    public void testRootExactlyAtMax() {
        RegulaFalsiSolver solver = new RegulaFalsiSolver();
        double result = solver.solve(100, LINEAR, -5.0, 2.0);
        assertEquals(2.0, result, 0.0);
    }

    // ===================== 2. fx == 0.0 ระหว่างวนซ้ำ =====================

    @Test
    public void testExactRootFoundDuringIteration() {
        RegulaFalsiSolver solver = new RegulaFalsiSolver();
        // f(0)=-2, f(5)=3 -> secant แรก x = 5 - 3*(5-0)/(3-(-2)) = 2 ซึ่ง f(2)=0 พอดี
        double result = solver.solve(100, LINEAR, 0.0, 5.0);
        assertEquals(2.0, result, 0.0);
    }

    // ===================== 3. Bracketing violation / malformed input =====================

    @Test
    public void testBracketingViolationThrowsException() {
        // f(3)=1, f(5)=3 สัญญาณเดียวกัน -> ไม่ครอบราก
        // หมายเหตุ: ไม่ทราบชนิด exception ที่แน่ชัด (verifyBracketing อยู่ใน superclass ที่ไม่ได้แสดง source)
        RegulaFalsiSolver solver = new RegulaFalsiSolver();
        boolean thrown = false;
        try {
            solver.solve(100, LINEAR, 3.0, 5.0);
        } catch (Exception e) {
            thrown = true;
        }
        assertTrue("ควร throw exception เมื่อ bracket ไม่ครอบราก", thrown);
    }

    @Test
    public void testDegenerateIntervalMinEqualsMax() {
        // min == max และ f(min) != 0 -> ไม่ใช่ bracket ที่ถูกต้อง
        RegulaFalsiSolver solver = new RegulaFalsiSolver();
        boolean thrown = false;
        try {
            solver.solve(100, LINEAR, 5.0, 5.0);
        } catch (Exception e) {
            thrown = true;
        }
        assertTrue(thrown);
    }

    @Test
    public void testMinGreaterThanMaxThrowsException() {
        // min > max เป็นอินพุตผิดรูปแบบ (คาดว่า validate ใน setup() ของ superclass)
        RegulaFalsiSolver solver = new RegulaFalsiSolver();
        boolean thrown = false;
        try {
            solver.solve(100, LINEAR, 5.0, 0.0);
        } catch (Exception e) {
            thrown = true;
        }
        assertTrue(thrown);
    }

    @Test
    public void testNullFunctionThrowsException() {
        RegulaFalsiSolver solver = new RegulaFalsiSolver();
        boolean thrown = false;
        try {
            solver.solve(100, null, 0.0, 5.0);
        } catch (Exception e) {
            thrown = true;
        }
        assertTrue("ควร throw exception เมื่อ function เป็น null", thrown);
    }

    @Test
    public void testZeroMaxEvalThrowsException() {
        // หมายเหตุ: ไม่ทราบชนิด exception ที่แน่ชัด คาดว่าเกี่ยวกับจำนวนรอบสูงสุดไม่ถูกต้อง/evaluation เกิน
        RegulaFalsiSolver solver = new RegulaFalsiSolver();
        boolean thrown = false;
        try {
            solver.solve(0, LINEAR, 0.0, 5.0);
        } catch (Exception e) {
            thrown = true;
        }
        assertTrue(thrown);
    }

    @Test
    public void testExceedingMaxEvaluationsThrowsException() {
        // maxEval น้อยเกินไปสำหรับฟังก์ชันที่ลู่เข้าช้า
        // หมายเหตุ: ไม่ทราบชนิด exception ที่แน่ชัด (คาดว่า TooManyEvaluationsException หรือใกล้เคียง)
        RegulaFalsiSolver solver = new RegulaFalsiSolver();
        boolean thrown = false;
        try {
            solver.solve(2, CUBIC, 2.0, 3.0);
        } catch (Exception e) {
            thrown = true;
        }
        assertTrue(thrown);
    }

    // ===================== 4. Method branch: REGULA_FALSI / ILLINOIS / PEGASUS =====================

    @Test
    public void testRegulaFalsiConvergesOnCubic() {
        RegulaFalsiSolver solver = new RegulaFalsiSolver();
        double result = solver.solve(1000, CUBIC, 2.0, 3.0);
        assertEquals(CUBIC_ROOT, result, 1e-5);
    }

    @Test
    public void testIllinoisConvergesOnCubic() {
        IllinoisSolver solver = new IllinoisSolver();
        double result = solver.solve(1000, CUBIC, 2.0, 3.0);
        assertEquals(CUBIC_ROOT, result, 1e-5);
    }

    @Test
    public void testPegasusConvergesOnCubic() {
        PegasusSolver solver = new PegasusSolver();
        double result = solver.solve(1000, CUBIC, 2.0, 3.0);
        assertEquals(CUBIC_ROOT, result, 1e-5);
    }

    // ทดสอบ branch "inverted" + method-specific scaling (f0*=0.5 ของ ILLINOIS, f0*=f1/(f1+fx) ของ PEGASUS)
    @Test
    public void testRegulaFalsiHandlesStuckInterval() {
        RegulaFalsiSolver solver = new RegulaFalsiSolver();
        double result = solver.solve(1000, QUADRATIC, 0.0, 2.0);
        assertEquals(SQRT2, result, 1e-5);
    }

    @Test
    public void testIllinoisHandlesStuckInterval() {
        IllinoisSolver solver = new IllinoisSolver();
        double result = solver.solve(1000, QUADRATIC, 0.0, 2.0);
        assertEquals(SQRT2, result, 1e-5);
    }

    @Test
    public void testPegasusHandlesStuckInterval() {
        PegasusSolver solver = new PegasusSolver();
        double result = solver.solve(1000, QUADRATIC, 0.0, 2.0);
        assertEquals(SQRT2, result, 1e-5);
    }

    // ===================== 5. AllowedSolution ทุกค่า (QUADRATIC ทำให้ inverted=true ค้างตลอด) =====================

    @Test
    public void testAllowedSolutionAnySide() {
        RegulaFalsiSolver solver = new RegulaFalsiSolver();
        double result = solver.solve(1000, QUADRATIC, 0.0, 2.0, AllowedSolution.ANY_SIDE);
        assertEquals(SQRT2, result, 1e-5);
    }

    @Test
    public void testAllowedSolutionLeftSideReturnsConvergingSide() {
        // วิเคราะห์จาก source: หลัง inversion รอบแรก inverted=true ค้างตลอด (ไม่มี sign flip อีก)
        // -> LEFT_SIDE คืนค่า x1 (ลำดับที่ลู่เข้า sqrt(2) จากด้านล่าง)
        RegulaFalsiSolver solver = new RegulaFalsiSolver();
        double result = solver.solve(1000, QUADRATIC, 0.0, 2.0, AllowedSolution.LEFT_SIDE);
        assertEquals(SQRT2, result, 1e-4);
    }

    @Test
    public void testAllowedSolutionRightSideReturnsFixedBound() {
        // ตาม source: inverted=true ตลอด -> RIGHT_SIDE คืนค่า x0
        // x0 ถูก assign ครั้งเดียวตอน inversion แรก (=ค่า max เดิม=2.0) และไม่เปลี่ยนอีกเลย
        RegulaFalsiSolver solver = new RegulaFalsiSolver();
        double result = solver.solve(1000, QUADRATIC, 0.0, 2.0, AllowedSolution.RIGHT_SIDE);
        assertEquals(2.0, result, 0.0);
    }

    @Test
    public void testAllowedSolutionBelowSide() {
        RegulaFalsiSolver solver = new RegulaFalsiSolver();
        double result = solver.solve(1000, QUADRATIC, 0.0, 2.0, AllowedSolution.BELOW_SIDE);
        // ตามเงื่อนไข source: ต้องคืนค่าที่ f(result) <= 0
        assertTrue("f(result) ต้อง <= 0 สำหรับ BELOW_SIDE", QUADRATIC.value(result) <= 1e-6);
        assertEquals(SQRT2, result, 1e-4);
    }

    @Test
    public void testAllowedSolutionAboveSide() {
        RegulaFalsiSolver solver = new RegulaFalsiSolver();
        double result = solver.solve(1000, QUADRATIC, 0.0, 2.0, AllowedSolution.ABOVE_SIDE);
        // f1 ติดลบตลอด (ลู่เข้าจากด้านล่าง) -> (f1>=0) เป็น false -> คืนค่า x0 = 2.0
        assertTrue("f(result) ต้อง >= 0 สำหรับ ABOVE_SIDE", QUADRATIC.value(result) >= -1e-6);
        assertEquals(2.0, result, 0.0);
    }

    // ทดสอบว่า method ต่างกัน (ILLINOIS/PEGASUS) ก็ยังให้ผล RIGHT_SIDE/ABOVE_SIDE ตรงกับ REGULA_FALSI
    // เพราะตำแหน่ง x0 (ไม่ใช่ค่า f0) ไม่ถูก method-specific scaling แก้ไข
    @Test
    public void testIllinoisRightSideReturnsExactBound() {
        IllinoisSolver solver = new IllinoisSolver();
        double result = solver.solve(1000, QUADRATIC, 0.0, 2.0, AllowedSolution.RIGHT_SIDE);
        assertEquals(2.0, result, 0.0);
    }

    @Test
    public void testPegasusAboveSideReturnsExactBound() {
        PegasusSolver solver = new PegasusSolver();
        double result = solver.solve(1000, QUADRATIC, 0.0, 2.0, AllowedSolution.ABOVE_SIDE);
        assertEquals(2.0, result, 0.0);
    }

    // ===================== 6. Overload ต่าง ๆ ของ solve() =====================

    @Test
    public void testSolveWithoutStartValueUsesMidpoint() {
        // solve(maxEval,f,min,max,allowedSolution) -> เรียก solve(...,min+0.5*(max-min),allowedSolution)
        RegulaFalsiSolver solver = new RegulaFalsiSolver();
        double result = solver.solve(1000, QUADRATIC, 0.0, 2.0, AllowedSolution.ANY_SIDE);
        assertEquals(SQRT2, result, 1e-5);
    }

    @Test
    public void testSolveWithStartValueAndAllowedSolution() {
        RegulaFalsiSolver solver = new RegulaFalsiSolver();
        double result = solver.solve(1000, QUADRATIC, 0.0, 2.0, 1.0, AllowedSolution.ANY_SIDE);
        assertEquals(SQRT2, result, 1e-5);
    }

    @Test
    public void testSolveWithStartValueNoAllowedSolutionDefaultsAnySide() {
        // solve(maxEval,f,min,max,startValue) -> delegate ไป ANY_SIDE
        RegulaFalsiSolver solver = new RegulaFalsiSolver();
        double result = solver.solve(1000, QUADRATIC, 0.0, 2.0, 1.0);
        assertEquals(SQRT2, result, 1e-5);
    }

    // ===================== 7. Constructors (ครบทั้ง 3 รูปแบบของ BaseSecantSolver) =====================

    @Test
    public void testDefaultConstructorUsesDefaultAccuracy() {
        RegulaFalsiSolver solver = new RegulaFalsiSolver();
        assertEquals(1e-6, solver.getAbsoluteAccuracy(), 0.0);
    }

    @Test
    public void testConstructorWithAbsoluteAccuracyOnly() {
        RegulaFalsiSolver solver = new RegulaFalsiSolver(1e-9);
        assertEquals(1e-9, solver.getAbsoluteAccuracy(), 0.0);
        double result = solver.solve(1000, LINEAR, 0.0, 5.0);
        assertEquals(2.0, result, 0.0);
    }

    @Test
    public void testConstructorWithRelativeAndAbsoluteAccuracy() {
        RegulaFalsiSolver solver = new RegulaFalsiSolver(1e-10, 1e-9);
        double result = solver.solve(1000, LINEAR, 0.0, 5.0);
        assertEquals(2.0, result, 0.0);
    }

    @Test
    public void testConstructorWithFunctionValueAccuracy() {
        RegulaFalsiSolver solver = new RegulaFalsiSolver(1e-10, 1e-9, 1e-8);
        double result = solver.solve(1000, QUADRATIC, 0.0, 2.0);
        assertEquals(SQRT2, result, 1e-5);
    }
}
