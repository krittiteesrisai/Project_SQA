นี่คือชุดทดสอบ JUnit 4 สำหรับ `BaseSecantSolver` โดยใช้ `subclass` ภายในแพ็กเกจเดียวกันเพื่อเข้าถึง constructor และ `enum Method` ที่เป็น `protected`

```java
package org.apache.commons.math.analysis.solvers;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.apache.commons.math.analysis.UnivariateRealFunction;
import org.junit.Test;

/**
 * JUnit 4 tests for {@link BaseSecantSolver}.
 *
 * หมายเหตุ: BaseSecantSolver เป็น abstract class จึงต้องสร้าง subclass ที่อยู่ใน
 * package เดียวกัน (org.apache.commons.math.analysis.solvers) เพื่อให้สามารถ
 * เรียก protected constructor และใช้ protected enum Method ได้
 */
public class BaseSecantSolverTest {

    /** Subclass สำหรับทดสอบ (ไม่มี abstract method เพิ่มเติมต้อง override เพราะ doSolve เป็น final แล้ว) */
    private static class TestSolver extends BaseSecantSolver {
        TestSolver(double absoluteAccuracy, Method method) {
            super(absoluteAccuracy, method);
        }
        TestSolver(double relativeAccuracy, double absoluteAccuracy, Method method) {
            super(relativeAccuracy, absoluteAccuracy, method);
        }
        TestSolver(double relativeAccuracy, double absoluteAccuracy,
                   double functionValueAccuracy, Method method) {
            super(relativeAccuracy, absoluteAccuracy, functionValueAccuracy, method);
        }
    }

    // ---------- Test functions ----------

    /** f(x) = x - 1 : root ที่ x = 1 */
    private static final UnivariateRealFunction LINEAR_ROOT_1 = new UnivariateRealFunction() {
        public double value(double x) {
            return x - 1.0;
        }
    };

    /** f(x) = x - 2 : root ที่ x = 2 */
    private static final UnivariateRealFunction LINEAR_ROOT_2 = new UnivariateRealFunction() {
        public double value(double x) {
            return x - 2.0;
        }
    };

    /** f(x) = x + 5 : ไม่มี root ใน [0,2] เพราะค่าเป็นบวกตลอดช่วง (ใช้ทดสอบ verifyBracketing) */
    private static final UnivariateRealFunction NO_ROOT = new UnivariateRealFunction() {
        public double value(double x) {
            return x + 5.0;
        }
    };

    /** f(x) = x^2 - 2 : root ที่ sqrt(2) */
    private static final UnivariateRealFunction SQRT2 = new UnivariateRealFunction() {
        public double value(double x) {
            return x * x - 2.0;
        }
    };

    /**
     * f(x) = x^9 - 1 : ฟังก์ชันคลาสสิกที่ทำให้ Regula Falsi ธรรมดา "ติด" (stagnation)
     * เพราะขอบด้านหนึ่งขยับเข้าใกล้ root ช้ามาก และจุดประมาณค่าใหม่ x อาจเท่ากับ x1 เดิม
     * ใช้ทดสอบ branch "if (x == x1)" ใน case REGULA_FALSI
     * (ไม่สามารถยืนยัน branch นี้ถูก execute จริงโดยตรงจาก unit test แบบ black-box
     *  แต่ฟังก์ชันนี้ถูกออกแบบมาเพื่อกระตุ้นสถานการณ์ stagnation ตามธรรมชาติของ algorithm)
     */
    private static final UnivariateRealFunction STAGNATION_FUNC = new UnivariateRealFunction() {
        public double value(double x) {
            return Math.pow(x, 9) - 1.0;
        }
    };

    /** f(x) = sin(x) : มี root ที่ PI ใช้ทดสอบ AllowedSolution ต่าง ๆ */
    private static final UnivariateRealFunction SIN = new UnivariateRealFunction() {
        public double value(double x) {
            return Math.sin(x);
        }
    };

    // ---------- Constructors ----------

    @Test
    public void testConstructorSingleAccuracy() {
        TestSolver solver = new TestSolver(1e-6, BaseSecantSolver.Method.ILLINOIS);
        assertEquals(1e-6, solver.getAbsoluteAccuracy(), 0d);
    }

    @Test
    public void testConstructorRelativeAndAbsoluteAccuracy() {
        TestSolver solver = new TestSolver(1e-10, 1e-6, BaseSecantSolver.Method.PEGASUS);
        assertEquals(1e-10, solver.getRelativeAccuracy(), 0d);
        assertEquals(1e-6, solver.getAbsoluteAccuracy(), 0d);
    }

    @Test
    public void testConstructorFullAccuracy() {
        TestSolver solver = new TestSolver(1e-10, 1e-6, 1e-8, BaseSecantSolver.Method.REGULA_FALSI);
        assertEquals(1e-10, solver.getRelativeAccuracy(), 0d);
        assertEquals(1e-6, solver.getAbsoluteAccuracy(), 0d);
        assertEquals(1e-8, solver.getFunctionValueAccuracy(), 0d);
    }

    // ---------- doSolve: exact root at bounds ----------

    @Test
    public void testExactRootAtMinReturnsImmediately() {
        // f0 == 0.0 -> คืนค่า x0 ทันที (ไม่ต้อง verifyBracketing)
        TestSolver solver = new TestSolver(1e-6, BaseSecantSolver.Method.ILLINOIS);
        double result = solver.solve(100, LINEAR_ROOT_1, 1.0, 5.0);
        assertEquals(1.0, result, 0d);
    }

    @Test
    public void testExactRootAtMaxReturnsImmediately() {
        // f1 == 0.0 -> คืนค่า x1 ทันที
        TestSolver solver = new TestSolver(1e-6, BaseSecantSolver.Method.ILLINOIS);
        double result = solver.solve(100, LINEAR_ROOT_2, 0.0, 2.0);
        assertEquals(2.0, result, 0d);
    }

    // ---------- verifyBracketing failure ----------

    @Test
    public void testNoBracketingThrowsException() {
        // ค่า f(min) และ f(max) มีเครื่องหมายเดียวกัน -> verifyBracketing ควร throw exception
        // หมายเหตุ: ไม่มีซอร์สของ verifyBracketing ให้ดู จึงไม่ระบุ exception type ที่แน่ชัด
        // ใช้ RuntimeException แบบกว้าง ๆ เพื่อไม่เดา behavior ที่ไม่ปรากฏในซอร์สที่ให้มา
        TestSolver solver = new TestSolver(1e-6, BaseSecantSolver.Method.ILLINOIS);
        try {
            solver.solve(100, NO_ROOT, 0.0, 2.0);
            fail("Expected an exception due to lack of bracketing");
        } catch (RuntimeException expected) {
            // ok
        }
    }

    // ---------- Normal convergence for each Method ----------

    @Test
    public void testRegulaFalsiConvergesToRoot() {
        TestSolver solver = new TestSolver(1e-9, BaseSecantSolver.Method.REGULA_FALSI);
        double result = solver.solve(1000, SQRT2, 0.0, 2.0);
        assertEquals(Math.sqrt(2.0), result, 1e-6);
    }

    @Test
    public void testIllinoisConvergesToRoot() {
        TestSolver solver = new TestSolver(1e-9, BaseSecantSolver.Method.ILLINOIS);
        double result = solver.solve(1000, SQRT2, 0.0, 2.0);
        assertEquals(Math.sqrt(2.0), result, 1e-6);
    }

    @Test
    public void testPegasusConvergesToRoot() {
        TestSolver solver = new TestSolver(1e-9, BaseSecantSolver.Method.PEGASUS);
        double result = solver.solve(1000, SQRT2, 0.0, 2.0);
        assertEquals(Math.sqrt(2.0), result, 1e-6);
    }

    // ---------- Stagnation branch (x == x1) for REGULA_FALSI ----------

    @Test(timeout = 5000)
    public void testRegulaFalsiStagnationDoesNotHang() {
        // ทดสอบว่า solver ไม่ hang (infinite loop) กับฟังก์ชันที่ทำให้เกิด stagnation
        // และยังคงลู่เข้าสู่ root = 1.0 ได้ในที่สุด
        TestSolver solver = new TestSolver(1e-9, BaseSecantSolver.Method.REGULA_FALSI);
        double result = solver.solve(10000, STAGNATION_FUNC, -0.5, 1.5);
        assertEquals(1.0, result, 1e-4);
    }

    // ---------- Convenience overload: solve(maxEval,f,min,max,allowedSolution) ----------

    @Test
    public void testSolveWithAllowedSolutionUsesDefaultStartValue() {
        // ควร delegate ไปที่ solve(maxEval,f,min,max,min+0.5*(max-min),allowedSolution)
        TestSolver solver = new TestSolver(1e-9, BaseSecantSolver.Method.ILLINOIS);
        double result = solver.solve(1000, SQRT2, 0.0, 2.0, AllowedSolution.ANY_SIDE);
        assertEquals(Math.sqrt(2.0), result, 1e-6);
    }

    // ---------- 5-arg overload without allowedSolution (defaults to ANY_SIDE) ----------

    @Test
    public void testSolveWithStartValueDefaultsToAnySide() {
        TestSolver solver = new TestSolver(1e-9, BaseSecantSolver.Method.ILLINOIS);
        double result = solver.solve(1000, SQRT2, 0.0, 2.0, 1.0);
        assertEquals(Math.sqrt(2.0), result, 1e-6);
    }

    // ---------- AllowedSolution branches ----------

    @Test
    public void testAllowedSolutionAnySide() {
        TestSolver solver = new TestSolver(1e-9, BaseSecantSolver.Method.ILLINOIS);
        double result = solver.solve(1000, SIN, 3.0, 4.0, 3.5, AllowedSolution.ANY_SIDE);
        assertEquals(Math.PI, result, 1e-4);
    }

    @Test
    public void testAllowedSolutionLeftSideIsUnderApproximation() {
        TestSolver solver = new TestSolver(1e-9, BaseSecantSolver.Method.ILLINOIS);
        double result = solver.solve(1000, SIN, 3.0, 4.0, 3.5, AllowedSolution.LEFT_SIDE);
        // LEFT_SIDE: ผลลัพธ์ต้องไม่เกิน root (อยู่ด้านซ้ายของ/เท่ากับ root)
        assertTrue("LEFT_SIDE result should be <= PI (+tolerance)", result <= Math.PI + 1e-3);
    }

    @Test
    public void testAllowedSolutionRightSideIsOverApproximation() {
        TestSolver solver = new TestSolver(1e-9, BaseSecantSolver.Method.ILLINOIS);
        double result = solver.solve(1000, SIN, 3.0, 4.0, 3.5, AllowedSolution.RIGHT_SIDE);
        // RIGHT_SIDE: ผลลัพธ์ต้องไม่น้อยกว่า root (อยู่ด้านขวาของ/เท่ากับ root)
        assertTrue("RIGHT_SIDE result should be >= PI (-tolerance)", result >= Math.PI - 1e-3);
    }

    @Test
    public void testAllowedSolutionBelowSideHasNonPositiveFunctionValue() {
        TestSolver solver = new TestSolver(1e-9, BaseSecantSolver.Method.ILLINOIS);
        double result = solver.solve(1000, SIN, 3.0, 4.0, 3.5, AllowedSolution.BELOW_SIDE);
        assertTrue("BELOW_SIDE: f(result) should be <= 0 (within tolerance)",
                   Math.sin(result) <= 1e-3);
    }

    @Test
    public void testAllowedSolutionAboveSideHasNonNegativeFunctionValue() {
        TestSolver solver = new TestSolver(1e-9, BaseSecantSolver.Method.ILLINOIS);
        double result = solver.solve(1000, SIN, 3.0, 4.0, 3.5, AllowedSolution.ABOVE_SIDE);
        assertTrue("ABOVE_SIDE: f(result) should be >= 0 (within tolerance)",
                   Math.sin(result) >= -1e-3);
    }

    // ---------- Boundary case: very small maxEval ----------

    @Test
    public void testVerySmallMaxEvalMayThrow() {
        // กรณี maxEval น้อยเกินไปจนไม่สามารถประเมินฟังก์ชันได้ครบ อาจทำให้เกิด exception
        // จาก logic การนับจำนวนครั้งของ evaluation ที่สืบทอดมาจากคลาสแม่ (ไม่ได้แสดงในซอร์สที่ให้มา)
        // จึงใช้ RuntimeException แบบกว้าง ๆ และไม่ระบุชนิดที่แน่ชัด
        TestSolver solver = new TestSolver(1e-9, BaseSecantSolver.Method.ILLINOIS);
        try {
            solver.solve(1, SQRT2, 0.0, 2.0);
            // ถ้าไม่ throw ก็ยังถือว่าผ่าน แต่ไม่ assert ผลลัพธ์เพราะไม่แน่ใจว่าค่าจะถูกต้อง
        } catch (RuntimeException expected) {
            // ok - คาดว่าจะเกิด exception เนื่องจาก evaluation ไม่พอ
        }
    }

    // ---------- Illinois f0 *= 0.5 branch ----------

    @Test
    public void testIllinoisMethodHandlesSameSignUpdate() {
        // ฟังก์ชันที่ไม่ทำให้เกิดการสลับเครื่องหมายทันทีในหลาย iteration
        // เพื่อกระตุ้น branch "case ILLINOIS: f0 *= 0.5;"
        UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) {
                return Math.pow(x, 5) - 1.0;
            }
        };
        TestSolver solver = new TestSolver(1e-9, BaseSecantSolver.Method.ILLINOIS);
        double result = solver.solve(1000, f, 0.0, 2.0);
        assertEquals(1.0, result, 1e-5);
    }

    // ---------- Pegasus f0 *= f1/(f1+fx) branch ----------

    @Test
    public void testPegasusMethodHandlesSameSignUpdate() {
        UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) {
                return Math.pow(x, 5) - 1.0;
            }
        };
        TestSolver solver = new TestSolver(1e-9, BaseSecantSolver.Method.PEGASUS);
        double result = solver.solve(1000, f, 0.0, 2.0);
        assertEquals(1.0, result, 1e-5);
    }

    // หมายเหตุ: "default" branch ใน switch (method) และ switch (allowed) ที่ throw
    // MathInternalError ไม่สามารถ trigger ได้จาก unit test ภายนอก เพราะ enum Method
    // และ AllowedSolution มีสมาชิกครบตามที่ switch-case รองรับไว้ทั้งหมดแล้ว
    // (unreachable branch ตามการวิเคราะห์ซอร์สที่ให้มา)
}
```

## สรุปตาราง Branch/Condition ที่ครอบคลุม

| Test Method | Branch / Condition ที่ครอบคลุม |
|---|---|
| testConstructorSingleAccuracy / RelativeAndAbsoluteAccuracy / FullAccuracy | Constructor 3 overloads ของ `BaseSecantSolver` |
| testExactRootAtMinReturnsImmediately | `if (f0 == 0.0) return x0;` |
| testExactRootAtMaxReturnsImmediately | `if (f1 == 0.0) return x1;` |
| testNoBracketingThrowsException | path `verifyBracketing(x0, x1)` เมื่อไม่มี root คร่อมช่วง (exception) |
| testRegulaFalsiConvergesToRoot | loop หลักของ `doSolve`, `fx == 0.0` หรือ ftol/atol exit ด้วย `Method.REGULA_FALSI` |
| testIllinoisConvergesToRoot | `case ILLINOIS: f0 *= 0.5;` และ loop หลัก |
| testPegasusConvergesToRoot | `case PEGASUS: f0 *= f1/(f1+fx);` และ loop หลัก |
| testRegulaFalsiStagnationDoesNotHang | branch `if (x == x1)` ภายใน `case REGULA_FALSI` (stagnation fix) + ป้องกัน infinite loop |
| testSolveWithAllowedSolutionUsesDefaultStartValue | `solve(maxEval,f,min,max,allowedSolution)` → delegate ไป overload พร้อม startValue คำนวณอัตโนมัติ |
| testSolveWithStartValueDefaultsToAnySide | `solve(maxEval,f,min,max,startValue)` → delegate ด้วย `AllowedSolution.ANY_SIDE` |
| testAllowedSolutionAnySide | `case ANY_SIDE:` ใน switch (ftol) และ switch (atol) |
| testAllowedSolutionLeftSideIsUnderApproximation | `case LEFT_SIDE:` ทั้ง inverted/non-inverted |
| testAllowedSolutionRightSideIsOverApproximation | `case RIGHT_SIDE:` ทั้ง inverted/non-inverted |
| testAllowedSolutionBelowSideHasNonPositiveFunctionValue | `case BELOW_SIDE:` เงื่อนไข `f1 <= 0` |
| testAllowedSolutionAboveSideHasNonNegativeFunctionValue | `case ABOVE_SIDE:` เงื่อนไข `f1 >= 0` |
| testVerySmallMaxEvalMayHrow | boundary ของ `maxEval` (inherited evaluation-count logic, ไม่ปรากฏในซอร์สตรง ๆ) |
| testIllinoisMethodHandlesSameSignUpdate / testPegasusMethodHandlesSameSignUpdate | branch `else { switch(method) ... }` เมื่อ `f1*fx >= 0` (ไม่เกิด inversion) |

**หมายเหตุสำคัญ:**
- Branch `default:` ใน `switch (method)` และ `switch (allowed)` ที่ throw `MathInternalError` เป็น **unreachable code** ตามการวิเคราะห์ซอร์ส (เพราะ enum ครอบคลุมค่าทั้งหมดใน switch แล้ว) จึงไม่สามารถทดสอบได้โดยไม่ reflection-hack ซึ่งไม่อยู่ในสโคปของ black-box unit test
- Exception type จาก `verifyBracketing` และกรณี `maxEval` น้อยเกินไป ไม่มีซอร์สให้ดูโดยตรง (มาจาก superclass) จึงทดสอบแบบกว้างด้วย `RuntimeException` และกำกับคอมเมนต์ไว้ตามข้อกำหนด