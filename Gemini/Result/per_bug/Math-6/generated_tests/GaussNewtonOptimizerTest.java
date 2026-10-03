package org.apache.commons.math3.optim.nonlinear.vector.jacobian;

import org.apache.commons.math3.analysis.MultivariateMatrixFunction;
import org.apache.commons.math3.analysis.MultivariateVectorFunction;
import org.apache.commons.math3.exception.ConvergenceException;
import org.apache.commons.math3.exception.MathUnsupportedOperationException;
import org.apache.commons.math3.exception.NullArgumentException;
import org.apache.commons.math3.optim.InitialGuess;
import org.apache.commons.math3.optim.MaxEval;
import org.apache.commons.math3.optim.MaxIter;
import org.apache.commons.math3.optim.PointVectorValuePair;
import org.apache.commons.math3.optim.SimpleBounds;
import org.apache.commons.math3.optim.SimplePointChecker;
import org.apache.commons.math3.optim.SimpleVectorValueChecker;
import org.apache.commons.math3.optim.nonlinear.vector.ModelFunction;
import org.apache.commons.math3.optim.nonlinear.vector.ModelFunctionJacobian;
import org.apache.commons.math3.optim.nonlinear.vector.Target;
import org.apache.commons.math3.optim.nonlinear.vector.Weight;
import org.junit.Assert;
import org.junit.Test;

public class GaussNewtonOptimizerTest {

    /**
     * Helper สำหรับสร้าง Linear Model Problem: y = a * x + b
     */
    private static class LinearProblem {
        final double[] x = new double[] { 1.0, 2.0, 3.0, 4.0 };
        final double[] y = new double[] { 3.0, 5.0, 7.0, 9.0 }; // True params: a = 2.0, b = 1.0

        public Target getTarget() {
            return new Target(y);
        }

        public Weight getWeight() {
            return new Weight(new double[] { 1.0, 1.0, 1.0, 1.0 });
        }

        public ModelFunction getModelFunction() {
            return new ModelFunction(new MultivariateVectorFunction() {
                public double[] value(double[] point) {
                    double a = point[0];
                    double b = point[1];
                    double[] values = new double[x.length];
                    for (int i = 0; i < x.length; i++) {
                        values[i] = a * x[i] + b;
                    }
                    return values;
                }
            });
        }

        public ModelFunctionJacobian getModelFunctionJacobian() {
            return new ModelFunctionJacobian(new MultivariateMatrixFunction() {
                public double[][] value(double[] point) {
                    double[][] jacobian = new double[x.length][2];
                    for (int i = 0; i < x.length; i++) {
                        jacobian[i][0] = x[i]; // df/da
                        jacobian[i][1] = 1.0;  // df/db
                    }
                    return jacobian;
                }
            });
        }
    }

    @Test(expected = NullArgumentException.class)
    public void testOptimizeNullCheckerThrowsException() {
        // ทดสอบกรณี checker เป็น null
        GaussNewtonOptimizer optimizer = new GaussNewtonOptimizer(null);
        LinearProblem problem = new LinearProblem();

        optimizer.optimize(
            new MaxEval(100),
            new MaxIter(100),
            problem.getTarget(),
            problem.getWeight(),
            new InitialGuess(new double[] { 0.0, 0.0 }),
            problem.getModelFunction(),
            problem.getModelFunctionJacobian()
        );
    }

    @Test(expected = MathUnsupportedOperationException.class)
    public void testOptimizeWithBoundsThrowsException() {
        // ทดสอบการส่ง SimpleBounds เข้าไป ซึ่ง GaussNewton ไม่รองรับ
        GaussNewtonOptimizer optimizer = new GaussNewtonOptimizer(new SimplePointChecker<PointVectorValuePair>(1e-6, 1e-6));
        LinearProblem problem = new LinearProblem();

        optimizer.optimize(
            new MaxEval(100),
            new MaxIter(100),
            problem.getTarget(),
            problem.getWeight(),
            new InitialGuess(new double[] { 0.0, 0.0 }),
            new SimpleBounds(new double[] { -10.0, -10.0 }, new double[] { 10.0, 10.0 }),
            problem.getModelFunction(),
            problem.getModelFunctionJacobian()
        );
    }

    @Test(expected = ConvergenceException.class)
    public void testSingularMatrixThrowsConvergenceExceptionWithLU() {
        // ทดสอบกรณี Jacobian เป็นเมทริกซ์ศูนย์ ทำให้เกิด Singular Matrix เมื่อใช้ LU
        GaussNewtonOptimizer optimizer = new GaussNewtonOptimizer(true, new SimpleVectorValueChecker(1e-6, 1e-6));

        ModelFunction model = new ModelFunction(new MultivariateVectorFunction() {
            public double[] value(double[] point) {
                return new double[] { 0.0, 0.0 };
            }
        });

        ModelFunctionJacobian jacobian = new ModelFunctionJacobian(new MultivariateMatrixFunction() {
            public double[][] value(double[] point) {
                // Return Zero Jacobian ทำให้ Matrix A เป็น Singular
                return new double[][] { { 0.0, 0.0 }, { 0.0, 0.0 } };
            }
        });

        optimizer.optimize(
            new MaxEval(50),
            new MaxIter(50),
            new Target(new double[] { 1.0, 2.0 }),
            new Weight(new double[] { 1.0, 1.0 }),
            new InitialGuess(new double[] { 0.0, 0.0 }),
            model,
            jacobian
        );
    }

    @Test(expected = ConvergenceException.class)
    public void testSingularMatrixThrowsConvergenceExceptionWithQR() {
        // ทดสอบกรณี Singular Matrix เมื่อใช้ QR Decomposition
        GaussNewtonOptimizer optimizer = new GaussNewtonOptimizer(false, new SimpleVectorValueChecker(1e-6, 1e-6));

        ModelFunction model = new ModelFunction(new MultivariateVectorFunction() {
            public double[] value(double[] point) {
                return new double[] { 0.0, 0.0 };
            }
        });

        ModelFunctionJacobian jacobian = new ModelFunctionJacobian(new MultivariateMatrixFunction() {
            public double[][] value(double[] point) {
                return new double[][] { { 0.0, 0.0 }, { 0.0, 0.0 } };
            }
        });

        optimizer.optimize(
            new MaxEval(50),
            new MaxIter(50),
            new Target(new double[] { 1.0, 2.0 }),
            new Weight(new double[] { 1.0, 1.0 }),
            new InitialGuess(new double[] { 0.0, 0.0 }),
            model,
            jacobian
        );
    }

    @Test
    public void testSuccessfulOptimizationWithDefaultConstructorLU() {
        // ทดสอบการใช้งาน Default Constructor (useLU = true) และการหาค่าคำตอบที่ถูกต้อง
        GaussNewtonOptimizer optimizer = new GaussNewtonOptimizer(
            new SimplePointChecker<PointVectorValuePair>(1e-6, 1e-6)
        );
        LinearProblem problem = new LinearProblem();

        PointVectorValuePair optimum = optimizer.optimize(
            new MaxEval(100),
            new MaxIter(100),
            problem.getTarget(),
            problem.getWeight(),
            new InitialGuess(new double[] { 0.5, 0.5 }),
            problem.getModelFunction(),
            problem.getModelFunctionJacobian()
        );

        double[] foundPoint = optimum.getPoint();
        Assert.assertEquals(2.0, foundPoint[0], 1e-5);
        Assert.assertEquals(1.0, foundPoint[1], 1e-5);
        Assert.assertTrue(optimizer.getCost() < 1e-5);
    }

    @Test
    public void testSuccessfulOptimizationWithQRDecomposition() {
        // ทดสอบกรณี Explicit useLU = false (QR Decomposition)
        GaussNewtonOptimizer optimizer = new GaussNewtonOptimizer(
            false,
            new SimplePointChecker<PointVectorValuePair>(1e-6, 1e-6)
        );
        LinearProblem problem = new LinearProblem();

        PointVectorValuePair optimum = optimizer.optimize(
            new MaxEval(100),
            new MaxIter(100),
            problem.getTarget(),
            problem.getWeight(),
            new InitialGuess(new double[] { 10.0, -5.0 }),
            problem.getModelFunction(),
            problem.getModelFunctionJacobian()
        );

        double[] foundPoint = optimum.getPoint();
        Assert.assertEquals(2.0, foundPoint[0], 1e-5);
        Assert.assertEquals(1.0, foundPoint[1], 1e-5);
        Assert.assertTrue(optimizer.getCost() < 1e-5);
    }

    @Test
    public void testNonLinearConvergenceMultipleIterations() {
        // ทดสอบฟังก์ชัน Non-linear: f(x) = x^2, target = 4 เพื่อบังคับให้เกิด > 1 iterations
        // ทดสอบเงื่อนไข previous != null และการลู่เข้าหลายรอบ
        GaussNewtonOptimizer optimizer = new GaussNewtonOptimizer(
            new SimpleVectorValueChecker(1e-8, 1e-8)
        );

        ModelFunction model = new ModelFunction(new MultivariateVectorFunction() {
            public double[] value(double[] point) {
                return new double[] { point[0] * point[0] };
            }
        });

        ModelFunctionJacobian jacobian = new ModelFunctionJacobian(new MultivariateMatrixFunction() {
            public double[][] value(double[] point) {
                return new double[][] { { 2.0 * point[0] } };
            }
        });

        PointVectorValuePair optimum = optimizer.optimize(
            new MaxEval(100),
            new MaxIter(100),
            new Target(new double[] { 4.0 }),
            new Weight(new double[] { 1.0 }),
            new InitialGuess(new double[] { 1.0 }), // Start far from 2.0
            model,
            jacobian
        );

        Assert.assertEquals(2.0, optimum.getPoint()[0], 1e-4);
        Assert.assertEquals(4.0, optimum.getValue()[0], 1e-4);
    }
}