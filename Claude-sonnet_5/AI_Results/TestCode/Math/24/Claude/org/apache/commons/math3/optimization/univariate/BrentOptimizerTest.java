package org.apache.commons.math3.optimization.univariate;

import static org.junit.Assert.*;

import java.lang.reflect.Method;

import org.apache.commons.math3.analysis.UnivariateFunction;
import org.apache.commons.math3.exception.NotStrictlyPositiveException;
import org.apache.commons.math3.exception.NumberIsTooSmallException;
import org.apache.commons.math3.exception.TooManyEvaluationsException;
import org.apache.commons.math3.optimization.ConvergenceChecker;
import org.apache.commons.math3.optimization.GoalType;
import org.apache.commons.math3.util.FastMath;

import org.junit.Test;

/**
 * Unit tests for {@link BrentOptimizer}.
 *
 * หมายเหตุ: คลาส BaseAbstractUnivariateOptimizer ไม่ได้แสดงในซอร์สที่ให้มา
 * จึงอนุมาน public API ตามรูปแบบมาตรฐานของ commons-math3
 * (optimize(maxEval, function, goalType, min, max, startValue))
 * จุดที่ไม่แน่ใจจะมีคอมเมนต์กำกับไว้
 */
public class BrentOptimizerTest {

    // ค่าเดียวกับใน source (2 * FastMath.ulp(1d)) ใช้สำหรับทดสอบขอบเขต
    private static final double MIN_RELATIVE_TOLERANCE = 2 * FastMath.ulp(1d);

    // ==================== Constructor tests ====================

    @Test
    public void testConstructorValid_TwoArg() {
        BrentOptimizer optimizer = new BrentOptimizer(1e-10, 1e-12);
        assertNotNull(optimizer);
    }

    @Test
    public void testConstructorValid_WithChecker() {
        ConvergenceChecker<UnivariatePointValuePair> checker =
            new ConvergenceChecker<UnivariatePointValuePair>() {
                @Override
                public boolean converged(int iteration,
                                          UnivariatePointValuePair previous,
                                          UnivariatePointValuePair current) {
                    return false;
                }
            };
        BrentOptimizer optimizer = new BrentOptimizer(1e-10, 1e-12, checker);
        assertNotNull(optimizer);
    }

    @Test
    public void testConstructorValid_NullChecker() {
        // two-arg constructor delegates checker = null
        BrentOptimizer optimizer = new BrentOptimizer(1e-8, 1e-10);
        assertNotNull(optimizer);
    }

    @Test(expected = NumberIsTooSmallException.class)
    public void testConstructorRelTooSmall_ThrowsException() {
        new BrentOptimizer(MIN_RELATIVE_TOLERANCE / 2.0, 1e-12);
    }

    @Test
    public void testConstructorRelAtExactBoundary_NoException() {
        // boundary: rel == MIN_RELATIVE_TOLERANCE -> condition rel < MIN เป็น false -> ไม่ throw
        BrentOptimizer optimizer = new BrentOptimizer(MIN_RELATIVE_TOLERANCE, 1e-12);
        assertNotNull(optimizer);
    }

    @Test(expected = NotStrictlyPositiveException.class)
    public void testConstructorAbsZero_ThrowsException() {
        // boundary: abs == 0
        new BrentOptimizer(1e-8, 0);
    }

    @Test(expected = NotStrictlyPositiveException.class)
    public void testConstructorAbsNegative_ThrowsException() {
        new BrentOptimizer(1e-8, -1e-5);
    }

    // ==================== doOptimize: MINIMIZE / MAXIMIZE ====================

    @Test
    public void testMinimizeParabola_FindsMinimum() {
        BrentOptimizer optimizer = new BrentOptimizer(1e-10, 1e-12);
        UnivariateFunction f = new UnivariateFunction() {
            @Override
            public double value(double x) {
                return (x - 2.0) * (x - 2.0);
            }
        };
        UnivariatePointValuePair result =
            optimizer.optimize(200, f, GoalType.MINIMIZE, 0.0, 5.0, 1.0);
        assertEquals(2.0, result.getPoint(), 1e-6);
        assertEquals(0.0, result.getValue(), 1e-6);
    }

    @Test
    public void testMaximizeParabola_FindsMaximum() {
        // covers !isMinim branch (fx = -fx, fu = -fu)
        BrentOptimizer optimizer = new BrentOptimizer(1e-10, 1e-12);
        UnivariateFunction f = new UnivariateFunction() {
            @Override
            public double value(double x) {
                return -(x - 2.0) * (x - 2.0);
            }
        };
        UnivariatePointValuePair result =
            optimizer.optimize(200, f, GoalType.MAXIMIZE, 0.0, 5.0, 1.0);
        assertEquals(2.0, result.getPoint(), 1e-6);
        assertEquals(0.0, result.getValue(), 1e-6);
    }

    @Test
    public void testMinimizeStartAtLowerBoundary_GoldenSectionPath() {
        // start == min; x == a เบื้องต้น ทำให้ x < m เป็น true -> golden section (e = b - x)
        BrentOptimizer optimizer = new BrentOptimizer(1e-10, 1e-12);
        UnivariateFunction f = new UnivariateFunction() {
            @Override
            public double value(double x) {
                return (x - 3.0) * (x - 3.0);
            }
        };
        UnivariatePointValuePair result =
            optimizer.optimize(300, f, GoalType.MINIMIZE, 0.0, 10.0, 0.0);
        assertEquals(3.0, result.getPoint(), 1e-5);
    }

    @Test
    public void testMinimizeStartAtUpperBoundary_GoldenSectionPath() {
        // start == max; x == b เบื้องต้น ทำให้ x < m เป็น false -> golden section (e = a - x)
        BrentOptimizer optimizer = new BrentOptimizer(1e-10, 1e-12);
        UnivariateFunction f = new UnivariateFunction() {
            @Override
            public double value(double x) {
                return (x - 3.0) * (x - 3.0);
            }
        };
        UnivariatePointValuePair result =
            optimizer.optimize(300, f, GoalType.MINIMIZE, 0.0, 10.0, 10.0);
        assertEquals(3.0, result.getPoint(), 1e-5);
    }

    @Test
    public void testMinimizeOscillatingFunction_TriggersParabolicAndGoldenMix() {
        // ฟังก์ชันที่ไม่ใช่ parabola แท้ ทำให้เส้นทางการทำงานสลับระหว่าง
        // parabolic interpolation และ golden-section หลายรอบ
        BrentOptimizer optimizer = new BrentOptimizer(1e-10, 1e-12);
        UnivariateFunction f = new UnivariateFunction() {
            @Override
            public double value(double x) {
                return FastMath.sin(x) + 0.1 * x;
            }
        };
        UnivariatePointValuePair result =
            optimizer.optimize(500, f, GoalType.MINIMIZE, -10.0, 10.0, 0.0);
        assertNotNull(result);
        double val = result.getValue();
        assertFalse(Double.isNaN(val));
        assertFalse(Double.isInfinite(val));
    }

    @Test
    public void testMinimizeAsymmetricFunction_CoversUpdateBranches() {
        // ฟังก์ชันไม่สมมาตรเพื่อกระตุ้น fu<=fx / else, u<x / else,
        // และเงื่อนไข Precision.equals สำหรับ v/w/x
        BrentOptimizer optimizer = new BrentOptimizer(1e-9, 1e-11);
        UnivariateFunction f = new UnivariateFunction() {
            @Override
            public double value(double x) {
                return FastMath.abs(x - 1.3) + 0.01 * x * x;
            }
        };
        UnivariatePointValuePair result =
            optimizer.optimize(300, f, GoalType.MINIMIZE, -5.0, 5.0, -4.0);
        assertNotNull(result);
        assertTrue(result.getValue() >= 0);
    }

    // ==================== Convergence checker branch ====================

    @Test
    public void testConvergenceChecker_ForcesEarlyReturn() {
        // checker != null และ converged() คืนค่า true ทันที
        // -> ทดสอบ branch "if (checker != null) { if (checker.converged(...)) return current; }"
        ConvergenceChecker<UnivariatePointValuePair> checker =
            new ConvergenceChecker<UnivariatePointValuePair>() {
                @Override
                public boolean converged(int iteration,
                                          UnivariatePointValuePair previous,
                                          UnivariatePointValuePair current) {
                    return true;
                }
            };
        BrentOptimizer optimizer = new BrentOptimizer(1e-10, 1e-12, checker);
        UnivariateFunction f = new UnivariateFunction() {
            @Override
            public double value(double x) {
                return (x - 2.0) * (x - 2.0);
            }
        };
        UnivariatePointValuePair result =
            optimizer.optimize(100, f, GoalType.MINIMIZE, 0.0, 5.0, 1.0);
        assertNotNull(result);
    }

    @Test
    public void testConvergenceChecker_NeverConverges_FallsBackToDefaultCriterion() {
        // checker != null แต่ converged() คืนค่า false เสมอ
        // -> ต้องพึ่ง default stopping criterion (Brent's) เพื่อจบ loop
        ConvergenceChecker<UnivariatePointValuePair> checker =
            new ConvergenceChecker<UnivariatePointValuePair>() {
                @Override
                public boolean converged(int iteration,
                                          UnivariatePointValuePair previous,
                                          UnivariatePointValuePair current) {
                    return false;
                }
            };
        BrentOptimizer optimizer = new BrentOptimizer(1e-10, 1e-12, checker);
        UnivariateFunction f = new UnivariateFunction() {
            @Override
            public double value(double x) {
                return (x - 2.0) * (x - 2.0);
            }
        };
        UnivariatePointValuePair result =
            optimizer.optimize(200, f, GoalType.MINIMIZE, 0.0, 5.0, 1.0);
        assertEquals(2.0, result.getPoint(), 1e-6);
    }

    // ==================== lo < hi boundary ====================

    @Test
    public void testMinEqualsMax_TriggersElseBranchAndImmediateStop() {
        // boundary: lo == hi -> เงื่อนไข "lo < hi" เป็น false -> a=hi, b=lo (ค่าเท่ากัน)
        // และ stop condition จะเป็น true ตั้งแต่รอบแรก (b-a = 0)
        // NOTE: สมมติว่า base class ยอมรับ min == max == startValue
        // (ไม่มีซอร์สของ BaseAbstractUnivariateOptimizer ยืนยัน)
        BrentOptimizer optimizer = new BrentOptimizer(1e-10, 1e-12);
        UnivariateFunction f = new UnivariateFunction() {
            @Override
            public double value(double x) {
                return x * x;
            }
        };
        UnivariatePointValuePair result =
            optimizer.optimize(100, f, GoalType.MINIMIZE, 1.0, 1.0, 1.0);
        assertEquals(1.0, result.getPoint(), 1e-9);
        assertEquals(1.0, result.getValue(), 1e-9);
    }

    // ==================== Too many evaluations ====================

    @Test(expected = TooManyEvaluationsException.class)
    public void testMaxEvalExceeded_ThrowsException() {
        // NOTE: สมมติ behavior ว่าหาก maxEval ต่ำเกินไป base class
        // จะ throw TooManyEvaluationsException (ไม่มีซอร์สของ base class ยืนยันตรงนี้)
        BrentOptimizer optimizer = new BrentOptimizer(1e-10, 1e-12);
        UnivariateFunction f = new UnivariateFunction() {
            @Override
            public double value(double x) {
                return (x - 2.0) * (x - 2.0);
            }
        };
        optimizer.optimize(1, f, GoalType.MINIMIZE, 0.0, 5.0, 1.0);
    }

    // ==================== Reflection tests for private best() ====================
    // best() ไม่ถูกเรียกใช้จริงในโค้ดที่ให้มา (อาจเป็น dead code ในไฟล์นี้)
    // แต่ทดสอบผ่าน reflection เพื่อให้ได้ branch coverage ของ logic ที่มีอยู่

    private Method getBestMethod() throws Exception {
        Method best = BrentOptimizer.class.getDeclaredMethod(
            "best", UnivariatePointValuePair.class,
            UnivariatePointValuePair.class, boolean.class);
        best.setAccessible(true);
        return best;
    }

    @Test
    public void testBest_BothNull_ReturnsNull() throws Exception {
        BrentOptimizer optimizer = new BrentOptimizer(1e-10, 1e-12);
        Object result = getBestMethod().invoke(optimizer, null, null, true);
        assertNull(result);
    }

    @Test
    public void testBest_AIsNull_ReturnsB() throws Exception {
        BrentOptimizer optimizer = new BrentOptimizer(1e-10, 1e-12);
        UnivariatePointValuePair b = new UnivariatePointValuePair(1.0, 2.0);
        Object result = getBestMethod().invoke(optimizer, null, b, true);
        assertSame(b, result);
    }

    @Test
    public void testBest_BIsNull_ReturnsA() throws Exception {
        BrentOptimizer optimizer = new BrentOptimizer(1e-10, 1e-12);
        UnivariatePointValuePair a = new UnivariatePointValuePair(1.0, 2.0);
        Object result = getBestMethod().invoke(optimizer, a, null, true);
        assertSame(a, result);
    }

    @Test
    public void testBest_Minimize_AIsBetter() throws Exception {
        BrentOptimizer optimizer = new BrentOptimizer(1e-10, 1e-12);
        UnivariatePointValuePair a = new UnivariatePointValuePair(1.0, 1.0);
        UnivariatePointValuePair b = new UnivariatePointValuePair(2.0, 5.0);
        Object result = getBestMethod().invoke(optimizer, a, b, true);
        assertSame(a, result);
    }

    @Test
    public void testBest_Minimize_BIsBetter() throws Exception {
        BrentOptimizer optimizer = new BrentOptimizer(1e-10, 1e-12);
        UnivariatePointValuePair a = new UnivariatePointValuePair(1.0, 5.0);
        UnivariatePointValuePair b = new UnivariatePointValuePair(2.0, 1.0);
        Object result = getBestMethod().invoke(optimizer, a, b, true);
        assertSame(b, result);
    }

    @Test
    public void testBest_Maximize_AIsBetter() throws Exception {
        BrentOptimizer optimizer = new BrentOptimizer(1e-10, 1e-12);
        UnivariatePointValuePair a = new UnivariatePointValuePair(1.0, 5.0);
        UnivariatePointValuePair b = new UnivariatePointValuePair(2.0, 1.0);
        Object result = getBestMethod().invoke(optimizer, a, b, false);
        assertSame(a, result);
    }

    @Test
    public void testBest_Maximize_BIsBetter() throws Exception {
        BrentOptimizer optimizer = new BrentOptimizer(1e-10, 1e-12);
        UnivariatePointValuePair a = new UnivariatePointValuePair(1.0, 1.0);
        UnivariatePointValuePair b = new UnivariatePointValuePair(2.0, 5.0);
        Object result = getBestMethod().invoke(optimizer, a, b, false);
        assertSame(b, result);
    }
}
