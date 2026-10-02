package org.apache.commons.math.analysis.solvers;

import static org.junit.Assert.*;

import org.apache.commons.math.FunctionEvaluationException;
import org.apache.commons.math.MaxIterationsExceededException;
import org.apache.commons.math.analysis.UnivariateRealFunction;
import org.junit.Test;

public class BisectionSolverTest {

    private static final double DELTA = 1e-4;

    // ---------- Helper function stubs ----------

    /** f(x) = x - root */
    private static class LinearFunction implements UnivariateRealFunction {
        private final double root;
        LinearFunction(double root) { this.root = root; }
        public double value(double x) throws FunctionEvaluationException {
            return x - root;
        }
    }

    /** f(x) = x^2 - 2 , root = sqrt(2) */
    private static class QuadraticFunction implements UnivariateRealFunction {
        public double value(double x) throws FunctionEvaluationException {
            return x * x - 2;
        }
    }

    /** f(x) = x^2 + 1 , ไม่มี root จริง (ใช้ตรวจ branch เมื่อไม่มีการสลับเครื่องหมาย) */
    private static class NoRootFunction implements UnivariateRealFunction {
        public double value(double x) throws FunctionEvaluationException {
            return x * x + 1;
        }
    }

    /** ฟังก์ชันที่โยน FunctionEvaluationException เสมอ */
    private static class ThrowingFunction implements UnivariateRealFunction {
        public double value(double x) throws FunctionEvaluationException {
            throw new FunctionEvaluationException(x);
        }
    }

    // ---------- 1. Basic root finding (เส้นทางปกติ, ทั้งสอง branch ของ if/else ในลูป) ----------

    @Test
    public void testSolveLinearFunctionRootFound() throws Exception {
        BisectionSolver solver = new BisectionSolver();
        UnivariateRealFunction f = new LinearFunction(0.0);
        double result = solver.solve(f, -1.0, 1.0);
        assertEquals(0.0, result, DELTA);
    }

    @Test
    public void testSolveQuadraticFunctionRootFound() throws Exception {
        BisectionSolver solver = new BisectionSolver();
        UnivariateRealFunction f = new QuadraticFunction();
        double result = solver.solve(f, 0.0, 2.0);
        assertEquals(Math.sqrt(2.0), result, DELTA);
    }

    // ---------- 2. Boundary: diff เริ่มต้นน้อยกว่า accuracy ทันที (i = 0, return ทันที) ----------

    @Test
    public void testSolveImmediateConvergence_IfBranch() throws Exception {
        // f(x) = x + 5 เป็นค่าบวกตลอด -> fm*fmin > 0 เสมอ (if branch)
        BisectionSolver solver = new BisectionSolver();
        UnivariateRealFunction f = new LinearFunction(-5.0); // f(x) = x+5
        double min = 1e-7, max = 3e-7; // diff < default accuracy 1e-6
        double result = solver.solve(f, min, max);
        // ควร return ภายใน iteration แรก (i=0)
        assertTrue(result >= min && result <= max);
    }

    @Test
    public void testSolveImmediateConvergence_ElseBranch() throws Exception {
        // f(x) = x : fmin < 0, fm = 0 -> product = 0 (ไม่ > 0) -> else branch
        BisectionSolver solver = new BisectionSolver();
        UnivariateRealFunction f = new LinearFunction(0.0);
        double min = -1e-7, max = 1e-7;
        double result = solver.solve(f, min, max);
        assertTrue(result >= min && result <= max);
    }

    // ---------- 3. ไม่มี sign change แต่ยังลู่เข้า (ตรวจ branch if ซ้ำ ๆ) ----------

    @Test
    public void testSolveNoRootFunctionStillConverges() throws Exception {
        // f(x) = x^2+1 > 0 ตลอดช่วง -> fm*fmin > 0 เสมอ -> min=m ทุกครั้ง
        // พฤติกรรมนี้ "ลู่เข้า" สู่ max โดยไม่มีการตรวจสอบว่ามี root จริง
        // (ไม่มีการ verify sign change ในซอร์ส จึงไม่ throw exception)
        BisectionSolver solver = new BisectionSolver();
        UnivariateRealFunction f = new NoRootFunction();
        double result = solver.solve(f, -1.0, 1.0);
        // ผลลัพธ์ควรลู่เข้าใกล้ max (1.0) ตาม logic ของโค้ด
        assertEquals(1.0, result, 1e-4);
    }

    // ---------- 4. MaxIterationsExceededException (loop ไม่ทำงานเลยเมื่อ maximalIterationCount=0) ----------

    @Test(expected = MaxIterationsExceededException.class)
    public void testMaxIterationsExceeded() throws Exception {
        BisectionSolver solver = new BisectionSolver();
        solver.setMaximalIterationCount(0); // สมมติว่ามี setter นี้ตาม API มาตรฐานของ UnivariateRealSolverImpl
        UnivariateRealFunction f = new LinearFunction(0.0);
        solver.solve(f, -1.0, 1.0);
    }

    // ---------- 5. FunctionEvaluationException ต้องถูก propagate ออกมา ----------

    @Test(expected = FunctionEvaluationException.class)
    public void testFunctionEvaluationExceptionPropagated() throws Exception {
        BisectionSolver solver = new BisectionSolver();
        UnivariateRealFunction f = new ThrowingFunction();
        solver.solve(f, -1.0, 1.0);
    }

    // ---------- 6. verifyInterval: boundary ผิดรูปแบบ (min >= max) ----------
    // หมายเหตุ: ซอร์สของ verifyInterval ไม่ได้แสดงในคลาสที่ให้มา (inherited จาก UnivariateRealSolverImpl)
    // จึงสมมติ behavior มาตรฐานว่าจะ throw Exception เมื่อ min >= max
    // (ไม่ assert ชนิด exception ที่เฉพาะเจาะจงเพื่อไม่เดา behavior เกินซอร์สที่ให้มา)
    @Test
    public void testSolveInvalidInterval_MinGreaterThanMax() {
        BisectionSolver solver = new BisectionSolver();
        UnivariateRealFunction f = new LinearFunction(0.0);
        boolean thrown = false;
        try {
            solver.solve(f, 2.0, -2.0);
        } catch (Exception e) {
            thrown = true;
        }
        assertTrue("คาดหวังว่า verifyInterval จะ throw exception เมื่อ min > max", thrown);
    }

    @Test
    public void testSolveInvalidInterval_MinEqualsMax() {
        BisectionSolver solver = new BisectionSolver();
        UnivariateRealFunction f = new LinearFunction(0.0);
        boolean thrown = false;
        try {
            solver.solve(f, 1.0, 1.0);
        } catch (Exception e) {
            thrown = true;
        }
        assertTrue("คาดหวังว่า verifyInterval จะ throw exception เมื่อ min == max", thrown);
    }

    // ---------- 7. Null function -> ควร throw NullPointerException เมื่อเรียก f.value() ----------

    @Test(expected = NullPointerException.class)
    public void testSolveNullFunctionThrowsNPE() throws Exception {
        BisectionSolver solver = new BisectionSolver();
        solver.solve(null, -1.0, 1.0);
    }

    // ---------- 8. Deprecated solve(min, max) ใช้ field f จาก deprecated constructor ----------

    @Test
    public void testDeprecatedSolveTwoArg_UsesInternalField() throws Exception {
        UnivariateRealFunction fieldFunction = new LinearFunction(3.0); // root = 3
        @SuppressWarnings("deprecation")
        BisectionSolver solver = new BisectionSolver(fieldFunction);
        @SuppressWarnings("deprecation")
        double result = solver.solve(-5.0, 10.0);
        assertEquals(3.0, result, DELTA);
    }

    // ---------- 9. Deprecated solve(min, max, initial) ----------

    @Test
    public void testDeprecatedSolveThreeArg_UsesInternalField() throws Exception {
        UnivariateRealFunction fieldFunction = new LinearFunction(-2.0); // root = -2
        @SuppressWarnings("deprecation")
        BisectionSolver solver = new BisectionSolver(fieldFunction);
        @SuppressWarnings("deprecation")
        double result = solver.solve(-5.0, 5.0, 0.0); // initial ไม่ถูกใช้งานจริงในซอร์ส
        assertEquals(-2.0, result, DELTA);
    }

    // ---------- 10. FAULT: solve(f, min, max, initial) ละเลย parameter f และใช้ field นี้ ----------
    // นี่คือจุดสำคัญที่อาจเป็น Defects4J Math-70 fault:
    // เมธอด public double solve(final UnivariateRealFunction f, double min, double max, double initial)
    // เรียก solve(min, max) (deprecated 2-arg) ซึ่งใช้ this.f (field) แทนที่จะใช้ parameter f ที่รับเข้ามา

    @Test
    public void testFourArgSolve_IgnoresPassedFunction_UsesFieldInstead() throws Exception {
        UnivariateRealFunction fieldFunction = new LinearFunction(1.0);   // root = 1 (field)
        UnivariateRealFunction passedFunction = new LinearFunction(-1.0); // root = -1 (parameter, ควรถูกใช้แต่กลับไม่ถูกใช้)

        @SuppressWarnings("deprecation")
        BisectionSolver solver = new BisectionSolver(fieldFunction);

        double result = solver.solve(passedFunction, -2.0, 2.0, 0.0);

        // ถ้าโค้ดทำงานถูกต้องตามสัญญาของ interface ผลลัพธ์ควรเป็น root ของ passedFunction (-1)
        // แต่จากซอร์สโค้ดจริง ผลลัพธ์จะเป็น root ของ fieldFunction (1) เพราะเมธอดเรียก solve(min,max)
        // ซึ่งใช้ this.f ภายใน -> นี่คือ fault ที่ต้องดักจับ
        assertEquals(1.0, result, DELTA); // สะท้อนพฤติกรรมจริงของซอร์สโค้ด (fault-capturing test)
    }

    @Test
    public void testFourArgSolve_NoArgConstructor_FieldIsNull_NPE() throws Exception {
        // ใช้ no-arg constructor -> field f = null
        // เมื่อเรียก solve(f, min, max, initial) เมธอดจะไปเรียก solve(min,max) ที่ใช้ this.f (null)
        // จึงคาดว่าจะเกิด NullPointerException แม้ parameter f ที่ส่งมาไม่เป็น null
        BisectionSolver solver = new BisectionSolver();
        UnivariateRealFunction passedFunction = new LinearFunction(0.0);

        try {
            solver.solve(passedFunction, -1.0, 1.0, 0.0);
            fail("คาดหวัง NullPointerException เนื่องจาก field f เป็น null และไม่ได้ใช้ parameter f ที่ส่งเข้ามา");
        } catch (NullPointerException expected) {
            // ตรงตามพฤติกรรมที่วิเคราะห์จากซอร์สโค้ด
        }
    }

    // ---------- 11. Deprecated 3-arg solve(min,max,initial) ของ UnivariateRealSolver interface ----------
    // (solve(double,double,double) ที่ override ใน BisectionSolver เรียก solve(f,min,max) โดยใช้ field f)

    @Test
    public void testDeprecatedThreeArgInterfaceSolve() throws Exception {
        UnivariateRealFunction fieldFunction = new QuadraticFunction();
        @SuppressWarnings("deprecation")
        BisectionSolver solver = new BisectionSolver(fieldFunction);
        @SuppressWarnings("deprecation")
        double result = solver.solve(0.0, 2.0, 1.0);
        assertEquals(Math.sqrt(2.0), result, DELTA);
    }
}
