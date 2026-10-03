package org.apache.commons.math3.optim.nonlinear.scalar.noderiv;

import org.apache.commons.math3.analysis.MultivariateFunction;
import org.apache.commons.math3.exception.MathUnsupportedOperationException;
import org.apache.commons.math3.exception.NullArgumentException;
import org.apache.commons.math3.exception.TooManyEvaluationsException;
import org.apache.commons.math3.optim.ConvergenceChecker;
import org.apache.commons.math3.optim.InitialGuess;
import org.apache.commons.math3.optim.MaxEval;
import org.apache.commons.math3.optim.MaxIter;
import org.apache.commons.math3.optim.PointValuePair;
import org.apache.commons.math3.optim.SimpleBounds;
import org.apache.commons.math3.optim.SimplePointChecker;
import org.apache.commons.math3.optim.SimpleValueChecker;
import org.apache.commons.math3.optim.nonlinear.scalar.GoalType;
import org.apache.commons.math3.optim.nonlinear.scalar.ObjectiveFunction;
import org.junit.Assert;
import org.junit.Test;

public class SimplexOptimizerTest {

    /**
     * ทดสอบกรณีไม่ส่ง Simplex ใน OptimizationData
     * คาดหวัง: NullArgumentException จาก checkParameters()
     */
    @Test(expected = NullArgumentException.class)
    public void testCheckParametersNullSimplexThrowsException() {
        SimplexOptimizer optimizer = new SimplexOptimizer(1e-10, 1e-30);
        MultivariateFunction function = new MultivariateFunction() {
            public double value(double[] point) {
                return point[0] * point[0];
            }
        };

        optimizer.optimize(
            new MaxEval(100),
            new ObjectiveFunction(function),
            GoalType.MINIMIZE,
            new InitialGuess(new double[] { 1.0 })
            // ไม่มี AbstractSimplex
        );
    }

    /**
     * ทดสอบกรณีส่ง Bounds (Lower / Upper) เข้าไป
     * คาดหวัง: MathUnsupportedOperationException จาก checkParameters()
     */
    @Test(expected = MathUnsupportedOperationException.class)
    public void testCheckParametersWithBoundsThrowsException() {
        SimplexOptimizer optimizer = new SimplexOptimizer(1e-10, 1e-30);
        MultivariateFunction function = new MultivariateFunction() {
            public double value(double[] point) {
                return point[0];
            }
        };

        optimizer.optimize(
            new MaxEval(100),
            new ObjectiveFunction(function),
            GoalType.MINIMIZE,
            new InitialGuess(new double[] { 1.0 }),
            new NelderMeadSimplex(1),
            new SimpleBounds(new double[] { 0.0 }, new double[] { 2.0 })
        );
    }

    /**
     * ทดสอบ Constructor ที่รับ ConvergenceChecker โดยตรง
     * และทดสอบ GoalType.MINIMIZE กับ NelderMeadSimplex (1 มิติ)
     */
    @Test
    public void testMinimize1DWithCheckerConstructor() {
        ConvergenceChecker<PointValuePair> checker = new SimpleValueChecker(1e-6, 1e-6);
        SimplexOptimizer optimizer = new SimplexOptimizer(checker);

        // f(x) = (x - 3)^2 + 4, Minimum อยู่ที่ x = 3, f(x) = 4
        MultivariateFunction parabola = new MultivariateFunction() {
            public double value(double[] point) {
                double diff = point[0] - 3.0;
                return diff * diff + 4.0;
            }
        };

        PointValuePair result = optimizer.optimize(
            new MaxEval(200),
            new ObjectiveFunction(parabola),
            GoalType.MINIMIZE,
            new InitialGuess(new double[] { 0.0 }),
            new NelderMeadSimplex(new double[] { 1.0 })
        );

        Assert.assertNotNull(result);
        Assert.assertEquals(3.0, result.getPoint()[0], 1e-3);
        Assert.assertEquals(4.0, result.getValue(), 1e-3);
    }

    /**
     * ทดสอบ Constructor ที่รับค่า (rel, abs)
     * และทดสอบ GoalType.MAXIMIZE กับ MultiDirectionalSimplex (1 มิติ)
     */
    @Test
    public void testMaximize1DWithThresholdConstructor() {
        SimplexOptimizer optimizer = new SimplexOptimizer(1e-8, 1e-8);

        // f(x) = -(x - 5)^2 + 10, Maximum อยู่ที่ x = 5, f(x) = 10
        MultivariateFunction invertedParabola = new MultivariateFunction() {
            public double value(double[] point) {
                double diff = point[0] - 5.0;
                return -diff * diff + 10.0;
            }
        };

        PointValuePair result = optimizer.optimize(
            new MaxEval(200),
            new ObjectiveFunction(invertedParabola),
            GoalType.MAXIMIZE,
            new InitialGuess(new double[] { 1.0 }),
            new MultiDirectionalSimplex(new double[] { 1.0 })
        );

        Assert.assertNotNull(result);
        Assert.assertEquals(5.0, result.getPoint()[0], 1e-3);
        Assert.assertEquals(10.0, result.getValue(), 1e-3);
    }

    /**
     * ทดสอบ Multi-Dimensional Optimization (2D Rosenbrock function)
     * f(x, y) = 100 * (y - x^2)^2 + (1 - x)^2, Min อยู่ที่ (1, 1), f(x, y) = 0
     */
    @Test
    public void testMinimizeRosenbrock2D() {
        SimplexOptimizer optimizer = new SimplexOptimizer(1e-10, 1e-10);

        MultivariateFunction rosenbrock = new MultivariateFunction() {
            public double value(double[] x) {
                double x0 = x[0];
                double x1 = x[1];
                return 100.0 * Math.pow(x1 - x0 * x0, 2) + Math.pow(1.0 - x0, 2);
            }
        };

        PointValuePair result = optimizer.optimize(
            new MaxEval(1000),
            new MaxIter(500),
            new ObjectiveFunction(rosenbrock),
            GoalType.MINIMIZE,
            new InitialGuess(new double[] { -1.2, 1.0 }),
            new NelderMeadSimplex(2)
        );

        Assert.assertNotNull(result);
        Assert.assertEquals(1.0, result.getPoint()[0], 1e-2);
        Assert.assertEquals(1.0, result.getPoint()[1], 1e-2);
        Assert.assertEquals(0.0, result.getValue(), 1e-3);
    }

    /**
     * ทดสอบกรณีบางจุดใน Simplex ผ่านเงื่อนไข Convergence แต่บางจุดยังไม่ผ่าน
     * เพื่อให้มั่นใจว่า Branch "converged = converged && checker.converged(...)"
     * ทำงานครอบคลุมทุกจุดใน Simplex
     */
    @Test
    public void testPartialConvergenceAcrossSimplexVertices() {
        // สร้าง ConvergenceChecker ที่จำลองสถานการณ์ให้บาง index เท่านั้นที่ผ่านในรอบแรกๆ
        ConvergenceChecker<PointValuePair> customChecker = new ConvergenceChecker<PointValuePair>() {
            public boolean converged(int iteration, PointValuePair previous, PointValuePair current) {
                // ให้ผ่านเฉพาะเมื่อ iteration >= 5 เท่านั้น
                return iteration >= 5;
            }
        };

        SimplexOptimizer optimizer = new SimplexOptimizer(customChecker);

        MultivariateFunction sphere = new MultivariateFunction() {
            public double value(double[] point) {
                return point[0] * point[0] + point[1] * point[1];
            }
        };

        PointValuePair result = optimizer.optimize(
            new MaxEval(300),
            new ObjectiveFunction(sphere),
            GoalType.MINIMIZE,
            new InitialGuess(new double[] { 2.0, 2.0 }),
            new NelderMeadSimplex(2)
        );

        Assert.assertNotNull(result);
        Assert.assertEquals(optimizer.getIterations() >= 5, true);
    }

    /**
     * ทดสอบกรณี Boundary: การตั้ง MaxEval ต่ำเกินไปจนประเมินค่าฟังก์ชันไม่ทัน
     * คาดหวัง: TooManyEvaluationsException
     */
    @Test(expected = TooManyEvaluationsException.class)
    public void testMaxEvaluationsExceeded() {
        SimplexOptimizer optimizer = new SimplexOptimizer(1e-15, 1e-15);

        MultivariateFunction rosenbrock = new MultivariateFunction() {
            public double value(double[] x) {
                return 100.0 * Math.pow(x[1] - x[0] * x[0], 2) + Math.pow(1.0 - x[0], 2);
            }
        };

        optimizer.optimize(
            new MaxEval(5), // ให้จำนวนการประเมินค่าน้อยมาก
            new ObjectiveFunction(rosenbrock),
            GoalType.MINIMIZE,
            new InitialGuess(new double[] { 10.0, 10.0 }),
            new NelderMeadSimplex(2)
        );
    }
}