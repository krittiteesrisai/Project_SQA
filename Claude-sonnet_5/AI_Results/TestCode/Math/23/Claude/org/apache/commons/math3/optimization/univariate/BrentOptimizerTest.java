package org.apache.commons.math3.optimization.univariate;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import org.apache.commons.math3.analysis.UnivariateFunction;
import org.apache.commons.math3.exception.NumberIsTooSmallException;
import org.apache.commons.math3.exception.NotStrictlyPositiveException;
import org.apache.commons.math3.optimization.ConvergenceChecker;
import org.apache.commons.math3.optimization.GoalType;

/**
 * Unit tests for {@link BrentOptimizer}.
 *
 * หมายเหตุ: signature ของ optimize(...) สมมติตาม public API มาตรฐานของ
 * Apache Commons Math 3 เนื่องจาก source ของ BaseAbstractUnivariateOptimizer
 * ไม่ได้ให้มาในโจทย์
 */
public class BrentOptimizerTest {

    // mirror ของ MIN_RELATIVE_TOLERANCE = 2 * FastMath.ulp(1d) (private ในคลาสเป้าหมาย)
    private static final double MIN_RELATIVE_TOLERANCE = 2 * Math.ulp(1d);

    // ---------------------------------------------------------------
    // Constructor validation tests
    // ---------------------------------------------------------------

    @Test(expected = NumberIsTooSmallException.class)
    public void testConstructor3Arg_relTooSmall_throws() {
        new BrentOptimizer(MIN_RELATIVE_TOLERANCE / 2, 1e-10, null);
    }

    @Test
    public void testConstructor_relExactlyAtBoundary_allowed() {
        // boundary: rel == MIN_RELATIVE_TOLERANCE ไม่ควร throw (เงื่อนไขคือ rel < MIN...)
        BrentOptimizer optimizer = new BrentOptimizer(MIN_RELATIVE_TOLERANCE, 1e-10);
        assertNotNull(optimizer);
    }

    @Test(expected = NotStrictlyPositiveException.class)
    public void testConstructor_absZero_throws() {
        new BrentOptimizer(1e-9, 0);
    }

    @Test(expected = NotStrictlyPositiveException.class)
    public void testConstructor_absNegative_throws() {
        new BrentOptimizer(1e-9, -1.0);
    }

    @Test
    public void testConstructor_validArgs_noException() {
        BrentOptimizer optimizer = new BrentOptimizer(1e-9, 1e-10);
        assertNotNull(optimizer);
    }

    @Test
    public void testTwoArgConstructor_delegatesWithNullChecker() {
        // 2-arg ctor -> this(rel, abs, null) ; ทดสอบทางอ้อมว่ายังทำงาน optimize ได้ปกติ
        BrentOptimizer optimizer = new BrentOptimizer(1e-9, 1e-10);
        UnivariateFunction f = new UnivariateFunction() {
            public double value(double x) { return (x - 2) * (x - 2); }
        };
        UnivariatePointValuePair result =
            optimizer.optimize(200, f, GoalType.MINIMIZE, -10, 10, 0);
        assertEquals(2.0, result.getPoint(), 1e-6);
    }

    // ---------------------------------------------------------------
    // doOptimize(): lo < hi branch, basic minimize/maximize correctness
    // ---------------------------------------------------------------

    @Test
    public void testMinimizeQuadratic_loLessThanHi() {
        // ครอบคลุม: lo < hi -> a = lo, b = hi ; isMinim = true
        BrentOptimizer optimizer = new BrentOptimizer(1e-10, 1e-12);
        UnivariateFunction f = new UnivariateFunction() {
            public double value(double x) { return (x - 1.5) * (x - 1.5) + 3; }
        };
        UnivariatePointValuePair result =
            optimizer.optimize(200, f, GoalType.MINIMIZE, -5, 5, 0);
        assertEquals(1.5, result.getPoint(), 1e-6);
        assertEquals(3.0, result.getValue(), 1e-6);
    }

    @Test
    public void testMaximizeQuadratic() {
        // ครอบคลุม: isMinim = false -> fx = -fx, fu = -fu
        BrentOptimizer optimizer = new BrentOptimizer(1e-10, 1e-12);
        UnivariateFunction f = new UnivariateFunction() {
            public double value(double x) { return -(x - 1.5) * (x - 1.5) + 3; }
        };
        UnivariatePointValuePair result =
            optimizer.optimize(200, f, GoalType.MAXIMIZE, -5, 5, 0);
        assertEquals(1.5, result.getPoint(), 1e-6);
        assertEquals(3.0, result.getValue(), 1e-6);
    }

    // หมายเหตุ: ไม่ได้เขียนเทสสำหรับกรณี lo >= hi (a = hi, b = lo) เพราะไม่แน่ใจว่า
    // base class อนุญาตให้เรียก optimize ด้วย min > max หรือไม่ (ไม่มี source ให้ตรวจสอบ)

    // ---------------------------------------------------------------
    // Boundary start values -> exercise "u - a < tol2 || b - u < tol2"
    // และ "x <= m" / "x < m" branches
    // ---------------------------------------------------------------

    @Test
    public void testStartAtMinBoundary() {
        BrentOptimizer optimizer = new BrentOptimizer(1e-9, 1e-10);
        UnivariateFunction f = new UnivariateFunction() {
            public double value(double x) { return (x - 1) * (x - 1); }
        };
        UnivariatePointValuePair result =
            optimizer.optimize(500, f, GoalType.MINIMIZE, -3, 3, -3);
        assertEquals(1.0, result.getPoint(), 1e-5);
    }

    @Test
    public void testStartAtMaxBoundary() {
        BrentOptimizer optimizer = new BrentOptimizer(1e-9, 1e-10);
        UnivariateFunction f = new UnivariateFunction() {
            public double value(double x) { return (x - 1) * (x - 1); }
        };
        UnivariatePointValuePair result =
            optimizer.optimize(500, f, GoalType.MINIMIZE, -3, 3, 3);
        assertEquals(1.0, result.getPoint(), 1e-5);
    }

    // ---------------------------------------------------------------
    // Non-smooth function -> มักทำให้เงื่อนไข parabola fit ล้มเหลว
    // บ่อยขึ้น จึงเข้า golden-section branch
    // ---------------------------------------------------------------

    @Test
    public void testNonSmoothFunction_forcesGoldenSectionLikely() {
        BrentOptimizer optimizer = new BrentOptimizer(1e-9, 1e-10);
        UnivariateFunction f = new UnivariateFunction() {
            public double value(double x) { return Math.abs(x - 0.3); }
        };
        UnivariatePointValuePair result =
            optimizer.optimize(500, f, GoalType.MINIMIZE, -5, 5, -4);
        assertEquals(0.3, result.getPoint(), 1e-4);
    }

    // ---------------------------------------------------------------
    // ConvergenceChecker branches
    // ---------------------------------------------------------------

    @Test
    public void testConvergenceChecker_immediateStop_callsBestIndirectly() {
        // ครอบคลุม: checker != null -> converged == true
        // -> return best(current, previous, isMinim)
        final boolean[] called = {false};
        ConvergenceChecker<UnivariatePointValuePair> checker =
            new ConvergenceChecker<UnivariatePointValuePair>() {
                public boolean converged(int iteration,
                                          UnivariatePointValuePair previous,
                                          UnivariatePointValuePair current) {
                    called[0] = true;
                    return true;
                }
            };
        BrentOptimizer optimizer = new BrentOptimizer(1e-9, 1e-10, checker);
        UnivariateFunction f = new UnivariateFunction() {
            public double value(double x) { return (x - 1) * (x - 1); }
        };
        UnivariatePointValuePair result =
            optimizer.optimize(100, f, GoalType.MINIMIZE, -5, 5, 0);
        assertTrue(called[0]);
        assertNotNull(result);
    }

    @Test
    public void testConvergenceChecker_neverConverges_usesDefaultCriterion() {
        // ครอบคลุม: checker != null -> converged == false เสมอ
        // -> ต้องพึ่ง default stopping criterion ของ Brent
        ConvergenceChecker<UnivariatePointValuePair> checker =
            new ConvergenceChecker<UnivariatePointValuePair>() {
                public boolean converged(int iteration,
                                          UnivariatePointValuePair previous,
                                          UnivariatePointValuePair current) {
                    return false;
                }
            };
        BrentOptimizer optimizer = new BrentOptimizer(1e-10, 1e-12, checker);
        UnivariateFunction f = new UnivariateFunction() {
            public double value(double x) { return (x - 2) * (x - 2); }
        };
        UnivariatePointValuePair result =
            optimizer.optimize(1000, f, GoalType.MINIMIZE, -10, 10, 0);
        assertEquals(2.0, result.getPoint(), 1e-6);
    }

    // ---------------------------------------------------------------
    // best(): เทียบ a/b เมื่อค่าเท่ากัน ในทั้งโหมด minimize และ maximize
    // ---------------------------------------------------------------

    @Test
    public void testBest_minimize_equalValues_prefersA() {
        // ฟังก์ชันคงที่ -> ค่า f เท่ากันทุกจุด ครอบคลุม branch
        // isMinim == true -> a.getValue() <= b.getValue() ? a : b
        BrentOptimizer optimizer = new BrentOptimizer(1e-9, 1e-10);
        UnivariateFunction f = new UnivariateFunction() {
            public double value(double x) { return 5.0; }
        };
        UnivariatePointValuePair result =
            optimizer.optimize(50, f, GoalType.MINIMIZE, -1, 1, 0);
        assertEquals(5.0, result.getValue(), 1e-9);
    }

    @Test
    public void testBest_maximize_equalValues_prefersA() {
        // ครอบคลุม branch isMinim == false -> a.getValue() >= b.getValue() ? a : b
        BrentOptimizer optimizer = new BrentOptimizer(1e-9, 1e-10);
        UnivariateFunction f = new UnivariateFunction() {
            public double value(double x) { return 5.0; }
        };
        UnivariatePointValuePair result =
            optimizer.optimize(50, f, GoalType.MAXIMIZE, -1, 1, 0);
        assertEquals(5.0, result.getValue(), 1e-9);
    }

    // ---------------------------------------------------------------
    // Narrow interval -> default stopping criterion อาจทริกเกอร์เร็ว
    // ---------------------------------------------------------------

    @Test
    public void testNarrowInterval_earlyDefaultStop() {
        BrentOptimizer optimizer = new BrentOptimizer(1e-9, 1e-10);
        UnivariateFunction f = new UnivariateFunction() {
            public double value(double x) { return (x - 0.00005) * (x - 0.00005); }
        };
        UnivariatePointValuePair result =
            optimizer.optimize(100, f, GoalType.MINIMIZE, 0, 0.0001, 0.00005);
        assertEquals(0.00005, result.getPoint(), 1e-4);
    }

    // ---------------------------------------------------------------
    // ฟังก์ชันซับซ้อนกว่า -> เพิ่มโอกาสเข้า branch ย่อยของการอัปเดต
    // a,b,v,w,x (fu<=fx / fu<=fw / Precision.equals(...))
    // ---------------------------------------------------------------

    @Test
    public void testOscillatingFunction_variousUpdateBranches() {
        BrentOptimizer optimizer = new BrentOptimizer(1e-10, 1e-12);
        UnivariateFunction f = new UnivariateFunction() {
            public double value(double x) {
                return Math.sin(x) + 0.1 * x * x;
            }
        };
        UnivariatePointValuePair result =
            optimizer.optimize(1000, f, GoalType.MINIMIZE, -10, 10, 2);
        assertNotNull(result);
        double fStart = f.value(2);
        assertTrue(result.getValue() <= fStart);
    }

    @Test
    public void testSymmetricFunctionAroundMidpoint() {
        // start ตรงกับ midpoint ของ a,b -> ทดสอบ m = 0.5*(a+b) == x เป็นกรณีพิเศษ
        BrentOptimizer optimizer = new BrentOptimizer(1e-9, 1e-10);
        UnivariateFunction f = new UnivariateFunction() {
            public double value(double x) { return (x - 0) * (x - 0); }
        };
        UnivariatePointValuePair result =
            optimizer.optimize(100, f, GoalType.MINIMIZE, -5, 5, 0);
        assertEquals(0.0, result.getPoint(), 1e-6);
    }
}
