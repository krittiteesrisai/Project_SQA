package org.apache.commons.math.analysis;

import org.apache.commons.math.FunctionEvaluationException;
import org.apache.commons.math.MaxIterationsExceededException;
import org.junit.Assert;
import org.junit.Test;

/**
 * Test suite targeting high branch coverage and edge cases for BrentSolver.
 */
public class BrentSolverTest {

    private static final double EPSILON = 1E-6;

    /**
     * ทดสอบ Default Constructor และความแม่นยำเริ่มต้น
     */
    @Test
    public void testConstructorAndDefaults() {
        UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) {
                return x;
            }
        };
        BrentSolver solver = new BrentSolver(f);
        Assert.assertEquals(100, solver.getMaximalIterationCount());
        Assert.assertEquals(1E-6, solver.getAbsoluteAccuracy(), 1E-15);
        Assert.assertEquals(1E-14, solver.getRelativeAccuracy(), 1E-15);
        Assert.assertEquals(1E-15, solver.getFunctionValueAccuracy(), 1E-15);
    }

    /**
     * Branch 1: initial ไม่อยู่ในช่วง [min, max]
     */
    @Test(expected = IllegalArgumentException.class)
    public void testSolveWithInitialOutOfRangeLow() throws Exception {
        UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) {
                return x * x - 4.0;
            }
        };
        BrentSolver solver = new BrentSolver(f);
        solver.solve(1.0, 3.0, 0.5); // 0.5 < 1.0
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSolveWithInitialOutOfRangeHigh() throws Exception {
        UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) {
                return x * x - 4.0;
            }
        };
        BrentSolver solver = new BrentSolver(f);
        solver.solve(1.0, 3.0, 3.5); // 3.5 > 3.0
    }

    /**
     * Branch 2: initial guess เป็น root พอดี (|yInitial| <= functionValueAccuracy)
     */
    @Test
    public void testSolveWithInitialIsRoot() throws Exception {
        UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) {
                return x - 2.0;
            }
        };
        BrentSolver solver = new BrentSolver(f);
        double result = solver.solve(0.0, 4.0, 2.0);
        Assert.assertEquals(2.0, result, EPSILON);
        Assert.assertEquals(0, solver.getIterationCount());
    }

    /**
     * Branch 3: min endpoint เป็น root (|yMin| <= functionValueAccuracy)
     */
    @Test
    public void testSolveWithMinIsRoot() throws Exception {
        UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) {
                return (x == 1.0) ? 0.0 : (x - 1.0);
            }
        };
        BrentSolver solver = new BrentSolver(f);
        double result = solver.solve(1.0, 3.0, 2.5);
        Assert.assertEquals(0.0, f.value(result), EPSILON);
    }

    /**
     * Branch 4: min และ initial คร่อม root (yInitial * yMin < 0)
     */
    @Test
    public void testSolveWithMinAndInitialBracketRoot() throws Exception {
        UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) {
                return x - 1.5;
            }
        };
        BrentSolver solver = new BrentSolver(f);
        // min=1.0 (f=-0.5), initial=2.0 (f=0.5), max=4.0 (f=2.5) -> yInitial * yMin < 0
        double result = solver.solve(1.0, 4.0, 2.0);
        Assert.assertEquals(1.5, result, EPSILON);
    }

    /**
     * Branch 5: max endpoint เป็น root (|yMax| <= functionValueAccuracy)
     */
    @Test
    public void testSolveWithMaxIsRoot() throws Exception {
        UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) {
                return (x == 3.0) ? 0.0 : (x - 3.0);
            }
        };
        BrentSolver solver = new BrentSolver(f);
        double result = solver.solve(1.0, 3.0, 1.5);
        Assert.assertEquals(0.0, f.value(result), EPSILON);
    }

    /**
     * Branch 6: initial และ max คร่อม root (yInitial * yMax < 0)
     */
    @Test
    public void testSolveWithInitialAndMaxBracketRoot() throws Exception {
        UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) {
                return x - 2.5;
            }
        };
        BrentSolver solver = new BrentSolver(f);
        // min=1.0 (f=-1.5), initial=2.0 (f=-0.5), max=3.0 (f=0.5) -> yInitial * yMax < 0
        double result = solver.solve(1.0, 3.0, 2.0);
        Assert.assertEquals(2.5, result, EPSILON);
    }

    /**
     * Branch 7: Full Brent algorithm starting with initial guess
     */
    @Test
    public void testSolveFullBrentAlgorithm() throws Exception {
        UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) {
                return Math.sin(x);
            }
        };
        BrentSolver solver = new BrentSolver(f);
        double result = solver.solve(3.0, 4.0, 3.05);
        Assert.assertEquals(Math.PI, result, EPSILON);
    }

    /**
     * Branch 8: Invalid interval min >= max
     */
    @Test(expected = IllegalArgumentException.class)
    public void testSolveInvalidIntervalMinGreaterThanMax() throws Exception {
        UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) {
                return x;
            }
        };
        BrentSolver solver = new BrentSolver(f);
        solver.solve(3.0, 1.0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSolveInvalidIntervalMinEqualToMax() throws Exception {
        UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) {
                return x;
            }
        };
        BrentSolver solver = new BrentSolver(f);
        solver.solve(2.0, 2.0);
    }

    /**
     * Branch 9: จุดปลายทั้งสองมีเครื่องหมายเดียวกัน (sign >= 0)
     */
    @Test(expected = IllegalArgumentException.class)
    public void testSolveEndpointsSameSign() throws Exception {
        UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) {
                return x * x + 1.0; // always positive
            }
        };
        BrentSolver solver = new BrentSolver(f);
        solver.solve(1.0, 5.0);
    }

    /**
     * Branch 10: จุดปลายคร่อมราก (sign < 0) คำนวณรากฟังก์ชันพหุนาม
     */
    @Test
    public void testSolveValidBracketingStandard() throws Exception {
        // f(x) = x^3 - 2x - 5, root ~ 2.0945514815423265
        UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) {
                return x * x * x - 2.0 * x - 5.0;
            }
        };
        BrentSolver solver = new BrentSolver(f);
        double result = solver.solve(2.0, 3.0);
        Assert.assertEquals(2.09455148, result, EPSILON);
    }

    /**
     * Branch 11-15: ทดสอบการทำงานของ Inverse Quadratic Interpolation และการตัดแบ่ง Bisection
     */
    @Test
    public void testSolveInverseQuadraticInterpolation() throws Exception {
        // Quintic function f(x) = (x-1)(x-2)(x-3)(x-4)(x-5) - 1
        UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) {
                return (x - 1.0) * (x - 2.0) * (x - 3.0) * (x - 4.0) * (x - 5.0) - 1.0;
            }
        };
        BrentSolver solver = new BrentSolver(f);
        double result = solver.solve(0.0, 1.5);
        Assert.assertEquals(0.0, f.value(result), EPSILON);
    }

    /**
     * Branch 15: Step adjustment dx <= 0 และ dx > 0
     */
    @Test
    public void testSolveStepAdjustments() throws Exception {
        UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) {
                return Math.cos(x);
            }
        };
        BrentSolver solver = new BrentSolver(f);
        double result = solver.solve(0.0, Math.PI);
        Assert.assertEquals(Math.PI / 2.0, result, EPSILON);
    }

    /**
     * Branch 16: กรณีที่จำนวนรอบเกินขีดจำกัด (MaxIterationsExceededException)
     */
    @Test(expected = MaxIterationsExceededException.class)
    public void testMaxIterationsExceeded() throws Exception {
        UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) {
                return Math.sin(x);
            }
        };
        BrentSolver solver = new BrentSolver(f);
        solver.setMaximalIterationCount(1);
        solver.setAbsoluteAccuracy(1E-15);
        solver.setRelativeAccuracy(1E-15);
        solver.solve(1.0, 4.0);
    }

    /**
     * กรณี FunctionEvaluationException ถูกโยนออกมาจากฟังก์ชันเป้าหมาย
     */
    @Test(expected = FunctionEvaluationException.class)
    public void testFunctionEvaluationException() throws Exception {
        UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) throws FunctionEvaluationException {
                throw new FunctionEvaluationException(x, "Evaluation error test");
            }
        };
        BrentSolver solver = new BrentSolver(f);
        solver.solve(1.0, 2.0);
    }

    /**
     * Boundary Limit: ค่าที่ใกล้เคียงกับ 0 เล็กน้อย (Subnormal / Zero boundary)
     */
    @Test
    public void testSolveRootAtZeroBoundary() throws Exception {
        UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) {
                return x;
            }
        };
        BrentSolver solver = new BrentSolver(f);
        double result = solver.solve(-1.0, 1.0);
        Assert.assertEquals(0.0, result, EPSILON);
    }

    /**
     * Invalid State: ฟังก์ชันเป็น Null
     */
    @Test(expected = NullPointerException.class)
    public void testSolveWithNullFunction() throws Exception {
        BrentSolver solver = new BrentSolver(null);
        solver.solve(1.0, 2.0);
    }
}