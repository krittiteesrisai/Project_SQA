package org.apache.commons.math.optimization.general;

import org.apache.commons.math.FunctionEvaluationException;
import org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction;
import org.apache.commons.math.analysis.MultivariateMatrixFunction;
import org.apache.commons.math.optimization.OptimizationException;
import org.apache.commons.math.optimization.VectorialPointValuePair;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class LevenbergMarquardtOptimizerTest {

    /**
     * ทดสอบ Setter และ Default Configuration
     */
    @Test
    public void testParametersAndSetters() {
        LevenbergMarquardtOptimizer optimizer = new LevenbergMarquardtOptimizer();
        optimizer.setInitialStepBoundFactor(50.0);
        optimizer.setCostRelativeTolerance(1.0e-8);
        optimizer.setParRelativeTolerance(1.0e-8);
        optimizer.setOrthoTolerance(1.0e-8);
        optimizer.setMaxIterations(500);

        Assert.assertEquals(500, optimizer.getMaxIterations());
    }

    /**
     * ทดสอบกรณี Perfect Fit (Cost = 0) และจุดเริ่มต้นเป็นศูนย์ (xNorm = 0)
     * ครอบคลุม: xNorm == 0 -> delta = initialStepBoundFactor, cost == 0 orthogonality check
     */
    @Test
    public void testTrivialZeroResidualAndZeroInitialPoint() throws Exception {
        LevenbergMarquardtOptimizer optimizer = new LevenbergMarquardtOptimizer();

        DifferentiableMultivariateVectorialFunction function = new DifferentiableMultivariateVectorialFunction() {
            public double[] value(double[] point) {
                return new double[] { point[0] - 2.0, point[1] - 3.0 };
            }

            public MultivariateMatrixFunction jacobian() {
                return new MultivariateMatrixFunction() {
                    public double[][] value(double[] point) {
                        return new double[][] {
                            { 1.0, 0.0 },
                            { 0.0, 1.0 }
                        };
                    }
                };
            }
        };

        // จุดเริ่มต้น [0, 0] -> xNorm = 0
        VectorialPointValuePair optimum = optimizer.optimize(
                function,
                new double[] { 0.0, 0.0 },
                new double[] { 1.0, 1.0 },
                new double[] { 0.0, 0.0 }
        );

        Assert.assertEquals(2.0, optimum.getPointRef()[0], 1.0e-6);
        Assert.assertEquals(3.0, optimum.getPointRef()[1], 1.0e-6);
    }

    /**
     * ทดสอบกรณี Jacobian มีคอลัมน์ที่เป็น 0 ทั้งหมด (dk == 0 -> dk = 1.0)
     * และระบบเป็น Rank Deficient (ak2 == 0)
     */
    @Test
    public void testRankDeficientAndZeroJacobianColumn() throws Exception {
        LevenbergMarquardtOptimizer optimizer = new LevenbergMarquardtOptimizer();

        DifferentiableMultivariateVectorialFunction function = new DifferentiableMultivariateVectorialFunction() {
            public double[] value(double[] point) {
                // ตัวแปร point[1] ไม่มีผลต่อระบบ -> jacobian column ที่ 1 จะเป็น 0
                return new double[] { point[0] - 4.0, point[0] * 2.0 - 8.0 };
            }

            public MultivariateMatrixFunction jacobian() {
                return new MultivariateMatrixFunction() {
                    public double[][] value(double[] point) {
                        return new double[][] {
                            { 1.0, 0.0 },
                            { 2.0, 0.0 }
                        };
                    }
                };
            }
        };

        VectorialPointValuePair optimum = optimizer.optimize(
                function,
                new double[] { 0.0, 0.0 },
                new double[] { 1.0, 1.0 },
                new double[] { 1.0, 0.0 }
        );

        Assert.assertEquals(4.0, optimum.getPointRef()[0], 1.0e-5);
    }

    /**
     * ทดสอบกรณี Jacobian ส่งค่า NaN หรือ Infinity -> ต้องโยน OptimizationException ใน qrDecomposition
     */
    @Test(expected = OptimizationException.class)
    public void testJacobianWithNaNThrowsException() throws Exception {
        LevenbergMarquardtOptimizer optimizer = new LevenbergMarquardtOptimizer();

        DifferentiableMultivariateVectorialFunction function = new DifferentiableMultivariateVectorialFunction() {
            public double[] value(double[] point) {
                return new double[] { 1.0, 2.0 };
            }

            public MultivariateMatrixFunction jacobian() {
                return new MultivariateMatrixFunction() {
                    public double[][] value(double[] point) {
                        return new double[][] {
                            { Double.NaN, 0.0 },
                            { 0.0, 1.0 }
                        };
                    }
                };
            }
        };

        optimizer.optimize(function, new double[] { 0.0, 0.0 }, new double[] { 1.0, 1.0 }, new double[] { 1.0, 1.0 });
    }

    @Test(expected = OptimizationException.class)
    public void testJacobianWithInfinityThrowsException() throws Exception {
        LevenbergMarquardtOptimizer optimizer = new LevenbergMarquardtOptimizer();

        DifferentiableMultivariateVectorialFunction function = new DifferentiableMultivariateVectorialFunction() {
            public double[] value(double[] point) {
                return new double[] { 1.0, 2.0 };
            }

            public MultivariateMatrixFunction jacobian() {
                return new MultivariateMatrixFunction() {
                    public double[][] value(double[] point) {
                        return new double[][] {
                            { Double.POSITIVE_INFINITY, 0.0 },
                            { 0.0, 1.0 }
                        };
                    }
                };
            }
        };

        optimizer.optimize(function, new double[] { 0.0, 0.0 }, new double[] { 1.0, 1.0 }, new double[] { 1.0, 1.0 });
    }

    /**
     * ทดสอบปัญหา Non-linear Least Squares (Circle Fitting)
     * ครอบคลุม: Givens rotation (cotan/tan), ratio updates (ratio >= 0.75, ratio <= 0.25),
     * determineLMParameter loop และการบรรลุจุดต่ำสุด
     */
    @Test
    public void testNonLinearCircleFitting() throws Exception {
        LevenbergMarquardtOptimizer optimizer = new LevenbergMarquardtOptimizer();

        final double[][] points = new double[][] {
            { 1.0, 0.0 }, { 0.0, 1.0 }, { -1.0, 0.0 }, { 0.0, -1.0 }
        };

        DifferentiableMultivariateVectorialFunction circleFunction = new DifferentiableMultivariateVectorialFunction() {
            public double[] value(double[] params) {
                double cx = params[0];
                double cy = params[1];
                double r  = params[2];
                double[] res = new double[points.length];
                for (int i = 0; i < points.length; ++i) {
                    double dx = points[i][0] - cx;
                    double dy = points[i][1] - cy;
                    res[i] = Math.sqrt(dx * dx + dy * dy) - r;
                }
                return res;
            }

            public MultivariateMatrixFunction jacobian() {
                return new MultivariateMatrixFunction() {
                    public double[][] value(double[] params) {
                        double cx = params[0];
                        double cy = params[1];
                        double[][] jac = new double[points.length][3];
                        for (int i = 0; i < points.length; ++i) {
                            double dx = points[i][0] - cx;
                            double dy = points[i][1] - cy;
                            double d = Math.max(1e-10, Math.sqrt(dx * dx + dy * dy));
                            jac[i][0] = -dx / d;
                            jac[i][1] = -dy / d;
                            jac[i][2] = -1.0;
                        }
                        return jac;
                    }
                };
            }
        };

        double[] target = new double[points.length];
        double[] weights = new double[points.length];
        Arrays.fill(weights, 1.0);

        VectorialPointValuePair optimum = optimizer.optimize(
                circleFunction, target, weights, new double[] { 0.1, 0.1, 0.5 }
        );

        Assert.assertEquals(0.0, optimum.getPointRef()[0], 1.0e-3);
        Assert.assertEquals(0.0, optimum.getPointRef()[1], 1.0e-3);
        Assert.assertEquals(1.0, optimum.getPointRef()[2], 1.0e-3);
    }

    /**
     * ทดสอบกรณีเกิด Failed Iteration (ratio < 1.0e-4)
     * ทำให้เกิดการย้อนสถานะ (Reset State) และปรับขนาด delta ให้เล็กลง
     */
    @Test
    public void testFailedStepAndRecovery() throws Exception {
        LevenbergMarquardtOptimizer optimizer = new LevenbergMarquardtOptimizer();
        optimizer.setInitialStepBoundFactor(1000.0); // เริ่มต้นด้วย Step ที่ใหญ่มากเพื่อบีบให้เกิด Failed Step

        // ฟังก์ชัน Rosenbrock
        DifferentiableMultivariateVectorialFunction rosenbrock = new DifferentiableMultivariateVectorialFunction() {
            public double[] value(double[] point) {
                double x = point[0];
                double y = point[1];
                return new double[] { 10.0 * (y - x * x), 1.0 - x };
            }

            public MultivariateMatrixFunction jacobian() {
                return new MultivariateMatrixFunction() {
                    public double[][] value(double[] point) {
                        double x = point[0];
                        return new double[][] {
                            { -20.0 * x, 10.0 },
                            { -1.0,       0.0 }
                        };
                    }
                };
            }
        };

        VectorialPointValuePair optimum = optimizer.optimize(
                rosenbrock,
                new double[] { 0.0, 0.0 },
                new double[] { 1.0, 1.0 },
                new double[] { -1.2, 1.0 }
        );

        Assert.assertEquals(1.0, optimum.getPointRef()[0], 1.0e-4);
        Assert.assertEquals(1.0, optimum.getPointRef()[1], 1.0e-4);
    }

    /**
     * ทดสอบกรณี Orthogonality Convergence (ค่า Orthogonality ต่ำกว่าพิกัดความเผื่อแต่แรก)
     */
    @Test
    public void testOrthogonalityConvergence() throws Exception {
        LevenbergMarquardtOptimizer optimizer = new LevenbergMarquardtOptimizer();
        optimizer.setOrthoTolerance(1.0); // ตั้งค่าพิกัดความเผื่อกว้างเป็นพิเศษ

        DifferentiableMultivariateVectorialFunction function = new DifferentiableMultivariateVectorialFunction() {
            public double[] value(double[] point) {
                return new double[] { point[0] + 1.0, point[1] + 1.0 };
            }

            public MultivariateMatrixFunction jacobian() {
                return new MultivariateMatrixFunction() {
                    public double[][] value(double[] point) {
                        return new double[][] {
                            { 1.0, 0.0 },
                            { 0.0, 1.0 }
                        };
                    }
                };
            }
        };

        VectorialPointValuePair optimum = optimizer.optimize(
                function,
                new double[] { 0.0, 0.0 },
                new double[] { 1.0, 1.0 },
                new double[] { 0.0, 0.0 }
        );

        Assert.assertNotNull(optimum);
    }

    /**
     * ทดสอบกรณีเกินขีดจำกัดจำนวนรอบการทำงาน (Max Iterations Exceeded)
     */
    @Test(expected = OptimizationException.class)
    public void testMaxIterationsExceeded() throws Exception {
        LevenbergMarquardtOptimizer optimizer = new LevenbergMarquardtOptimizer();
        optimizer.setMaxIterations(1); // จำกัดให้ทำแค่ 1 รอบ

        DifferentiableMultivariateVectorialFunction rosenbrock = new DifferentiableMultivariateVectorialFunction() {
            public double[] value(double[] point) {
                return new double[] { 10.0 * (point[1] - point[0] * point[0]), 1.0 - point[0] };
            }

            public MultivariateMatrixFunction jacobian() {
                return new MultivariateMatrixFunction() {
                    public double[][] value(double[] point) {
                        return new double[][] {
                            { -20.0 * point[0], 10.0 },
                            { -1.0,             0.0 }
                        };
                    }
                };
            }
        };

        optimizer.optimize(
                rosenbrock,
                new double[] { 0.0, 0.0 },
                new double[] { 1.0, 1.0 },
                new double[] { -10.0, 10.0 }
        );
    }

    /**
     * ทดสอบ Givens Rotation Branch: Math.abs(rkk) < Math.abs(lmDiag[k])
     */
    @Test
    public void testGivensRotationAlternativeBranch() throws Exception {
        LevenbergMarquardtOptimizer optimizer = new LevenbergMarquardtOptimizer();
        optimizer.setCostRelativeTolerance(1e-12);
        optimizer.setParRelativeTolerance(1e-12);

        DifferentiableMultivariateVectorialFunction function = new DifferentiableMultivariateVectorialFunction() {
            public double[] value(double[] point) {
                // บีบให้ค่า Jacobian ในแนวทแยงมีค่าน้อยมาก เพื่อทดสอบ branch cotangent
                return new double[] { 1e-6 * point[0] - 1.0, 2.0 * point[1] - 4.0 };
            }

            public MultivariateMatrixFunction jacobian() {
                return new MultivariateMatrixFunction() {
                    public double[][] value(double[] point) {
                        return new double[][] {
                            { 1e-6, 0.0 },
                            { 0.0,  2.0 }
                        };
                    }
                };
            }
        };

        VectorialPointValuePair optimum = optimizer.optimize(
                function,
                new double[] { 0.0, 0.0 },
                new double[] { 1.0, 1.0 },
                new double[] { 0.0, 0.0 }
        );

        Assert.assertEquals(1.0e6, optimum.getPointRef()[0], 1.0);
        Assert.assertEquals(2.0, optimum.getPointRef()[1], 1e-4);
    }
}