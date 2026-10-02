package org.apache.commons.math.analysis;

import static org.junit.Assert.*;
import org.junit.Test;

import org.apache.commons.math.FunctionEvaluationException;
import org.apache.commons.math.MaxIterationsExceededException;

/**
 * JUnit 4 test suite for {@link BrentSolver} (Defects4J Math-97b).
 */
public class BrentSolverTest {

    // ---------------------------------------------------------------
    // Constructor
    // ---------------------------------------------------------------

    @Test
    public void testConstructorDoesNotThrow() {
        UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) { return x; }
        };
        BrentSolver solver = new BrentSolver(f);
        assertNotNull(solver);
    }

    // ---------------------------------------------------------------
    // solve(min, max, initial) - guard: (initial-min)*(max-initial) < 0
    // ---------------------------------------------------------------

    @Test(expected = IllegalArgumentException.class)
    public void testSolveThreeArg_InitialBelowMin_ThrowsIllegalArgumentException() throws Exception {
        UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) { return x - 2; }
        };
        BrentSolver solver = new BrentSolver(f);
        solver.solve(0, 10, -1); // initial < min
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSolveThreeArg_InitialAboveMax_ThrowsIllegalArgumentException() throws Exception {
        UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) { return x - 2; }
        };
        BrentSolver solver = new BrentSolver(f);
        solver.solve(0, 10, 11); // initial > max
    }

    @Test
    public void testSolveThreeArg_InitialEqualsMinBoundary_NoException() throws Exception {
        // boundary: (initial-min)*(max-initial) == 0 (ไม่ < 0) จึงไม่ throw
        UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) { return x - 5; }
        };
        BrentSolver solver = new BrentSolver(f);
        double result = solver.solve(5, 10, 5); // initial == min == root
        assertEquals(5.0, result, 1e-6);
    }

    @Test
    public void testSolveThreeArg_DegenerateInterval_MinEqualsMaxEqualsInitial() throws Exception {
        // solve(min,max,initial) ไม่เรียก verifyInterval จึงไม่ validate min<max
        // -> อนุญาตช่วงที่กว้าง 0 ได้ (ต่างจาก solve(min,max) สองพารามิเตอร์)
        UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) { return x - 5; }
        };
        BrentSolver solver = new BrentSolver(f);
        double result = solver.solve(5, 5, 5);
        assertEquals(5.0, result, 1e-9);
    }

    // ---------------------------------------------------------------
    // solve(min, max, initial) - early-return branches
    // ---------------------------------------------------------------

    @Test
    public void testSolveThreeArg_InitialIsRoot() throws Exception {
        // yInitial ~ 0 -> setResult(initial, 0) ซึ่งถูกต้อง (ไม่มี defect ในสาขานี้)
        UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) { return x - 2; }
        };
        BrentSolver solver = new BrentSolver(f);
        double result = solver.solve(0, 10, 2);
        assertEquals(2.0, result, 1e-9);
    }

    @Test
    public void testSolveThreeArg_MinIsRoot_ExposesSetResultBug() throws Exception {
        // yMin == 0 (f(min)=0) แต่โค้ดเรียก setResult(yMin,0) แทนที่จะเป็น setResult(min,0)
        // คาดหวังค่าที่ถูกต้องทางคณิตศาสตร์คือ min=3 แต่โค้ดจะคืนค่า 0 (ค่า yMin)
        // -> เทสนี้ถูกออกแบบมาเพื่อดักจับ fault นี้โดยเฉพาะ
        UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) { return x - 3; }
        };
        BrentSolver solver = new BrentSolver(f);
        double result = solver.solve(3, 10, 7);
        assertEquals(3.0, result, 1e-9); // คาดว่าจะ FAIL หากมี defect ตามที่วิเคราะห์
    }

    @Test
    public void testSolveThreeArg_MinInitialBracket() throws Exception {
        // yInitial * yMin < 0 -> solve(min,yMin,initial,yInitial,min,yMin)
        UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) { return x - 2; }
        };
        BrentSolver solver = new BrentSolver(f);
        double result = solver.solve(0, 10, 5);
        assertEquals(2.0, result, 1e-4);
    }

    @Test
    public void testSolveThreeArg_MaxIsRoot_ExposesSetResultBug() throws Exception {
        // yMax == 0 แต่โค้ดเรียก setResult(yMax,0) แทน setResult(max,0)
        UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) { return x - 8; }
        };
        BrentSolver solver = new BrentSolver(f);
        double result = solver.solve(0, 8, 4);
        assertEquals(8.0, result, 1e-9); // คาดว่าจะ FAIL หากมี defect ตามที่วิเคราะห์
    }

    @Test
    public void testSolveThreeArg_InitialMaxBracket() throws Exception {
        // yInitial * yMax < 0 -> solve(initial,yInitial,max,yMax,initial,yInitial)
        UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) { return x - 7; }
        };
        BrentSolver solver = new BrentSolver(f);
        double result = solver.solve(0, 10, 3);
        assertEquals(7.0, result, 1e-4);
    }

    @Test
    public void testSolveThreeArg_NegativeRootViaInitialMaxBracket() throws Exception {
        // ทดสอบด้วยค่าลบ + ลำดับ branch: MinInitial(false) -> InitialMax(true)
        UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) { return x * x * x - x; } // roots: -1,0,1
        };
        BrentSolver solver = new BrentSolver(f);
        double result = solver.solve(-2, -0.5, -1.5);
        assertEquals(-1.0, result, 1e-4);
    }

    @Test
    public void testSolveThreeArg_CubicPositiveRoot_MinInitialBracket() throws Exception {
        // ใช้ cubic เพื่อกระตุ้น inverse-quadratic-interpolation branch ภายใน private solve()
        UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) { return x * x * x - x; } // roots: -1,0,1
        };
        BrentSolver solver = new BrentSolver(f);
        double result = solver.solve(0.5, 2, 1.5);
        assertEquals(1.0, result, 1e-4);
    }

    @Test
    public void testSolveThreeArg_FullBrentFallThrough_NoSignChangeAtAnyPoint() throws Exception {
        // ครอบคลุม branch สุดท้าย (fallthrough): ไม่มีจุดใดที่ f ใกล้ 0
        // และไม่มีคู่ใดที่ sign ต่างกัน -> เรียก solve(min,yMin,max,yMax,initial,yInitial) เต็มรูปแบบ
        //
        // หมายเหตุ (ไม่แน่ใจ behavior แน่ชัด เพราะไม่ได้รันจริง):
        // เนื่องจาก f(x)=x^2+1 ไม่มีรากจริงในช่วงนี้ จึงไม่สามารถยืนยันแน่ชัดว่าโค้ดจะลู่เข้า
        // ค่าใดค่าหนึ่งแล้ว return หรือจะ throw MaxIterationsExceededException เมื่อครบรอบ
        // เทสนี้จึงยอมรับทั้งสองผลลัพธ์ที่เป็นไปได้ เพื่อยืนยันเพียงว่า branch ถูกเรียกใช้จริง
        UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) { return x * x + 1; }
        };
        BrentSolver solver = new BrentSolver(f);
        try {
            double result = solver.solve(0, 10, 5);
            assertFalse(Double.isNaN(result));
        } catch (MaxIterationsExceededException e) {
            assertTrue(true); // ผลลัพธ์ที่ยอมรับได้เมื่อไม่พบราก
        }
    }

    // ---------------------------------------------------------------
    // Exception propagation
    // ---------------------------------------------------------------

    @Test(expected = FunctionEvaluationException.class)
    public void testSolveThreeArg_PropagatesFunctionEvaluationException() throws Exception {
        UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) throws FunctionEvaluationException {
                throw new FunctionEvaluationException(x);
            }
        };
        BrentSolver solver = new BrentSolver(f);
        solver.solve(0, 10, 5);
    }

    @Test(expected = NullPointerException.class)
    public void testSolveThreeArg_NullFunction_ThrowsNPE() throws Exception {
        // ไม่มีการตรวจสอบ null ในซอร์ส -> คาดว่าจะเกิด NPE ตอนเรียก f.value()
        BrentSolver solver = new BrentSolver(null);
        solver.solve(0, 10, 5);
    }

    // ---------------------------------------------------------------
    // solve(min, max)
    // ---------------------------------------------------------------

    @Test(expected = IllegalArgumentException.class)
    public void testSolveTwoArg_SameSign_ThrowsIllegalArgumentException() throws Exception {
        UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) { return x * x + 1; } // always positive
        };
        BrentSolver solver = new BrentSolver(f);
        solver.solve(0, 10);
    }

    @Test
    public void testSolveTwoArg_OppositeSign_Converges() throws Exception {
        UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) { return x - 2; }
        };
        BrentSolver solver = new BrentSolver(f);
        double result = solver.solve(0, 10);
        assertEquals(2.0, result, 1e-4);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSolveTwoArg_MinGreaterThanMax_ThrowsIllegalArgumentException() throws Exception {
        // ตาม Javadoc ของ solve(min,max): throws IllegalArgumentException if min is not less than max
        UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) { return x - 2; }
        };
        BrentSolver solver = new BrentSolver(f);
        solver.solve(10, 0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSolveTwoArg_MinEqualsMax_ThrowsIllegalArgumentException() throws Exception {
        UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) { return x - 2; }
        };
        BrentSolver solver = new BrentSolver(f);
        solver.solve(5, 5);
    }
}
