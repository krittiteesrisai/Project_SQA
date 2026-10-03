package org.apache.commons.math.analysis.solvers;

import org.apache.commons.math.FunctionEvaluationException;
import org.apache.commons.math.MaxIterationsExceededException;
import org.apache.commons.math.analysis.UnivariateRealFunction;
import org.junit.Assert;
import org.junit.Test;

/**
 * High-coverage JUnit 4 test suite for BisectionSolver targeting edge cases,
 * conditions, and the known defects in Defects4J (Math-70).
 */
public class BisectionSolverTest {

    /**
     * ทดสอบ Math-70 Fault:
     * การเรียก solve(f, min, max, initial) เมื่อสร้าง solver ด้วย Default Constructor
     */
    @Test
    public void testSolveWithFunctionAndInitialGuessUsingDefaultConstructor() throws Exception {
        UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) {
                return Math.sin(x);
            }
        };

        BisectionSolver solver = new BisectionSolver();
        // ในโค้ด Math-70 เมธอดนี้จะเรียก solve(min, max) ซึ่งใช้ this.f (ที่เป็น null)
        double result = solver.solve(f, 3.0, 4.0, 3.5);
        Assert.assertEquals(Math.PI, result, 1E-6);
    }

    /**
     * ทดสอบการทำงานปกติของ solve(f, min, max)
     */
    @Test
    public void testSolveFunctionMinMax() throws Exception {
        UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) {
                return (x * x) - 4.0; // roots at -2 and 2
            }
        };

        BisectionSolver solver = new BisectionSolver();
        double result = solver.solve(f, 0.0, 3.0);
        Assert.assertEquals(2.0, result, 1E-6);
        Assert.assertTrue(solver.getIterationCount() > 0);
    }

    /**
     * ทดสอบ Branch: fm * fmin > 0.0 (ทำให้ min = m)
     * ตัวอย่าง: f(x) = x - 3 บนช่วง [0, 4], midpoint m = 2, f(0)=-3, f(2)=-1 => f(2)*f(0) > 0
     */
    @Test
    public void testSolveBranchMinBecomesMidpoint() throws Exception {
        UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) {
                return x - 3.0; // root at 3.0
            }
        };

        BisectionSolver solver = new BisectionSolver();
        double result = solver.solve(f, 0.0, 4.0);
        Assert.assertEquals(3.0, result, 1E-6);
    }

    /**
     * ทดสอบ Branch: fm * fmin <= 0.0 (ทำให้ max = m)
     * ตัวอย่าง: f(x) = x - 1 บนช่วง [0, 4], midpoint m = 2, f(0)=-1, f(2)=1 => f(2)*f(0) < 0
     */
    @Test
    public void testSolveBranchMaxBecomesMidpoint() throws Exception {
        UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) {
                return x - 1.0; // root at 1.0
            }
        };

        BisectionSolver solver = new BisectionSolver();
        double result = solver.solve(f, 0.0, 4.0);
        Assert.assertEquals(1.0, result, 1E-6);
    }

    /**
     * ทดสอบ Deprecated constructor และ Deprecated solve methods
     */
    @Test
    @SuppressWarnings("deprecation")
    public void testDeprecatedConstructorAndSolveMethods() throws Exception {
        UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) {
                return 2.0 * x - 6.0; // root at 3.0
            }
        };

        BisectionSolver solver = new BisectionSolver(f);

        double result1 = solver.solve(1.0, 5.0);
        Assert.assertEquals(3.0, result1, 1E-6);

        double result2 = solver.solve(1.0, 5.0, 2.0);
        Assert.assertEquals(3.0, result2, 1E-6);
    }

    /**
     * ทดสอบ Invalid State: ช่วงไม่ถูกต้อง min >= max (min > max)
     */
    @Test(expected = IllegalArgumentException.class)
    public void testInvalidIntervalMinGreaterThanMax() throws Exception {
        UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) {
                return x;
            }
        };

        BisectionSolver solver = new BisectionSolver();
        solver.solve(f, 5.0, 2.0);
    }

    /**
     * ทดสอบ Boundary Limit: min == max
     */
    @Test(expected = IllegalArgumentException.class)
    public void testInvalidIntervalMinEqualToMax() throws Exception {
        UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) {
                return x;
            }
        };

        BisectionSolver solver = new BisectionSolver();
        solver.solve(f, 2.0, 2.0);
    }

    /**
     * ทดสอบ MaxIterationsExceededException เมื่อจำกัดจำนวนรอบให้ต่ำกว่าที่ต้องใช้
     */
    @Test(expected = MaxIterationsExceededException.class)
    public void testMaxIterationsExceeded() throws Exception {
        UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) {
                return (x * x) - 2.0;
            }
        };

        BisectionSolver solver = new BisectionSolver();
        solver.setMaximalIterationCount(1); // บังคับให้วนลูปได้แค่ 1 รอบ
        solver.setAbsoluteAccuracy(1E-12);
        solver.solve(f, 1.0, 2.0);
    }

    /**
     * ทดสอบ Null function evaluation
     */
    @Test(expected = NullPointerException.class)
    public void testNullFunctionThrowsException() throws Exception {
        BisectionSolver solver = new BisectionSolver();
        solver.solve((UnivariateRealFunction) null, 1.0, 2.0);
    }

    /**
     * ทดสอบกรณีที่ฟังก์ชันโยน FunctionEvaluationException ระหว่างการหาคำตอบ
     */
    @Test(expected = FunctionEvaluationException.class)
    public void testFunctionEvaluationExceptionPropagated() throws Exception {
        UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) throws FunctionEvaluationException {
                throw new FunctionEvaluationException(x, "Evaluation error simulation");
            }
        };

        BisectionSolver solver = new BisectionSolver();
        solver.solve(f, 1.0, 2.0);
    }

    /**
     * ทดสอบการกำหนด Absolute Accuracy แบบเฉพาะเจาะจง
     */
    @Test
    public void testCustomAbsoluteAccuracy() throws Exception {
        UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) {
                return Math.cos(x);
            }
        };

        BisectionSolver solver = new BisectionSolver();
        double accuracy = 1E-4;
        solver.setAbsoluteAccuracy(accuracy);
        double result = solver.solve(f, 0.0, Math.PI);

        Assert.assertEquals(Math.PI / 2.0, result, accuracy);
        Assert.assertEquals(result, solver.getResult(), 1E-9);
    }
}