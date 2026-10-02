package org.apache.commons.math3.optim.nonlinear.vector.jacobian;

import org.junit.Test;
import org.apache.commons.math3.exception.MathUnsupportedOperationException;
import org.apache.commons.math3.exception.NullArgumentException;
import org.apache.commons.math3.linear.BlockRealMatrix;
import org.apache.commons.math3.optim.SimpleValueChecker;
import org.apache.commons.math3.exception.NotStrictlyPositiveException;
import org.apache.commons.math3.optim.univariate.SimpleUnivariateValueChecker;
import org.apache.commons.math3.linear.Array2DRowRealMatrix;
import org.apache.commons.math3.exception.NoDataException;
import org.apache.commons.math3.util.Incrementor;
import org.apache.commons.math3.exception.TooManyEvaluationsException;
import org.apache.commons.math3.exception.TooManyIterationsException;
import org.apache.commons.math3.analysis.differentiation.GradientFunction;
import org.apache.commons.math3.analysis.differentiation.MultivariateDifferentiableFunction;
import java.util.concurrent.atomic.AtomicReference;
import org.apache.commons.math3.analysis.differentiation.DSCompiler;
import org.apache.commons.math3.optim.SimpleVectorValueChecker;
import org.apache.commons.math3.linear.OpenMapRealMatrix;
import org.apache.commons.math3.util.OpenIntToDoubleHashMap;
import org.apache.commons.math3.optim.SimplePointChecker;
import org.apache.commons.math3.optimization.fitting.PolynomialFitter;
import java.util.ArrayList;
import java.lang.reflect.Method;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

public final class org_apache_commons_math3_optim_nonlinear_vector_jacobian_GaussNewtonOptimizerTest {
    ///region Test suites for executable org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer.doOptimize
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method doOptimize()
    
    /**
    @utbot.classUnderTest {@link GaussNewtonOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer#doOptimize()}
 * @utbot.throwsException {@link org.apache.commons.math3.exception.MathUnsupportedOperationException} in: checkParameters();
 *  */
    @Test(expected = MathUnsupportedOperationException.class)
    public void testDoOptimize_ThrowMathUnsupportedOperationException() throws Exception  {
        GaussNewtonOptimizer gaussNewtonOptimizer = ((GaussNewtonOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer"));
        double[] lowerBound = {};
        setField(gaussNewtonOptimizer, "org.apache.commons.math3.optim.BaseMultivariateOptimizer", "lowerBound", lowerBound);
        
        gaussNewtonOptimizer.doOptimize();
    }
    
    /**
    @utbot.classUnderTest {@link GaussNewtonOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer#doOptimize()}
 * @utbot.throwsException {@link org.apache.commons.math3.exception.MathUnsupportedOperationException} in: checkParameters();
 *  */
    @Test(expected = MathUnsupportedOperationException.class)
    public void testDoOptimize_ThrowMathUnsupportedOperationException_1() throws Exception  {
        GaussNewtonOptimizer gaussNewtonOptimizer = ((GaussNewtonOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer"));
        double[] upperBound = {};
        setField(gaussNewtonOptimizer, "org.apache.commons.math3.optim.BaseMultivariateOptimizer", "upperBound", upperBound);
        
        gaussNewtonOptimizer.doOptimize();
    }
    
    /**
    @utbot.classUnderTest {@link GaussNewtonOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer#doOptimize()}
 * @utbot.throwsException {@link org.apache.commons.math3.exception.NullArgumentException} when: checker == null
 *  */
    @Test(expected = NullArgumentException.class)
    public void testDoOptimize_ThrowNullArgumentException() throws Exception  {
        GaussNewtonOptimizer gaussNewtonOptimizer = ((GaussNewtonOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer"));
        
        gaussNewtonOptimizer.doOptimize();
    }
    
    /**
    @utbot.classUnderTest {@link GaussNewtonOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer#doOptimize()}
 * @utbot.throwsException {@link org.apache.commons.math3.exception.NotStrictlyPositiveException} in: final RealMatrix weightMatrix = getWeight();
 *  */
    @Test(expected = NotStrictlyPositiveException.class)
    public void testDoOptimize_ThrowNotStrictlyPositiveException() throws Exception  {
        GaussNewtonOptimizer gaussNewtonOptimizer = ((GaussNewtonOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer"));
        double[] target = {1.61895E-319};
        setField(gaussNewtonOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.MultivariateVectorOptimizer", "target", target);
        BlockRealMatrix weightMatrix = ((BlockRealMatrix) createInstance("org.apache.commons.math3.linear.BlockRealMatrix"));
        setField(weightMatrix, "org.apache.commons.math3.linear.BlockRealMatrix", "rows", 1);
        setField(gaussNewtonOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.MultivariateVectorOptimizer", "weightMatrix", weightMatrix);
        SimpleValueChecker checker = ((SimpleValueChecker) createInstance("org.apache.commons.math3.optim.SimpleValueChecker"));
        setField(gaussNewtonOptimizer, "org.apache.commons.math3.optim.BaseOptimizer", "checker", checker);
        
        gaussNewtonOptimizer.doOptimize();
    }
    
    /**
    @utbot.classUnderTest {@link GaussNewtonOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer#doOptimize()}
 * @utbot.throwsException {@link org.apache.commons.math3.exception.NotStrictlyPositiveException} in: final RealMatrix weightMatrix = getWeight();
 *  */
    @Test(expected = NotStrictlyPositiveException.class)
    public void testDoOptimize_ThrowNotStrictlyPositiveException_1() throws Exception  {
        GaussNewtonOptimizer gaussNewtonOptimizer = ((GaussNewtonOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer"));
        double[] target = {2.2251417623725123E-308};
        setField(gaussNewtonOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.MultivariateVectorOptimizer", "target", target);
        BlockRealMatrix weightMatrix = ((BlockRealMatrix) createInstance("org.apache.commons.math3.linear.BlockRealMatrix"));
        setField(gaussNewtonOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.MultivariateVectorOptimizer", "weightMatrix", weightMatrix);
        SimpleUnivariateValueChecker checker = ((SimpleUnivariateValueChecker) createInstance("org.apache.commons.math3.optim.univariate.SimpleUnivariateValueChecker"));
        setField(gaussNewtonOptimizer, "org.apache.commons.math3.optim.BaseOptimizer", "checker", checker);
        
        gaussNewtonOptimizer.doOptimize();
    }
    
    /**
    @utbot.classUnderTest {@link GaussNewtonOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer#doOptimize()}
 * @utbot.throwsException {@link org.apache.commons.math3.exception.NoDataException} in: final RealMatrix weightMatrix = getWeight();
 *  */
    @Test(expected = NoDataException.class)
    public void testDoOptimize_ThrowNoDataException_1() throws Exception  {
        GaussNewtonOptimizer gaussNewtonOptimizer = ((GaussNewtonOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer"));
        double[] target = {};
        setField(gaussNewtonOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.MultivariateVectorOptimizer", "target", target);
        Array2DRowRealMatrix weightMatrix = ((Array2DRowRealMatrix) createInstance("org.apache.commons.math3.linear.Array2DRowRealMatrix"));
        double[][] data = new double[1][];
        double[] doubleArray = {};
        data[0] = doubleArray;
        setField(weightMatrix, "org.apache.commons.math3.linear.Array2DRowRealMatrix", "data", data);
        setField(gaussNewtonOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.MultivariateVectorOptimizer", "weightMatrix", weightMatrix);
        SimpleUnivariateValueChecker checker = ((SimpleUnivariateValueChecker) createInstance("org.apache.commons.math3.optim.univariate.SimpleUnivariateValueChecker"));
        setField(gaussNewtonOptimizer, "org.apache.commons.math3.optim.BaseOptimizer", "checker", checker);
        
        gaussNewtonOptimizer.doOptimize();
    }
    
    /**
    @utbot.classUnderTest {@link GaussNewtonOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer#doOptimize()}
 * @utbot.throwsException {@link org.apache.commons.math3.exception.NoDataException} in: final RealMatrix weightMatrix = getWeight();
 *  */
    @Test(expected = NoDataException.class)
    public void testDoOptimize_ThrowNoDataException() throws Exception  {
        GaussNewtonOptimizer gaussNewtonOptimizer = ((GaussNewtonOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer"));
        double[] target = {-0.0, 1.4916681476292656E-154};
        setField(gaussNewtonOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.MultivariateVectorOptimizer", "target", target);
        Array2DRowRealMatrix weightMatrix = ((Array2DRowRealMatrix) createInstance("org.apache.commons.math3.linear.Array2DRowRealMatrix"));
        setField(gaussNewtonOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.MultivariateVectorOptimizer", "weightMatrix", weightMatrix);
        SimpleUnivariateValueChecker checker = ((SimpleUnivariateValueChecker) createInstance("org.apache.commons.math3.optim.univariate.SimpleUnivariateValueChecker"));
        setField(gaussNewtonOptimizer, "org.apache.commons.math3.optim.BaseOptimizer", "checker", checker);
        
        gaussNewtonOptimizer.doOptimize();
    }
    
    /**
    @utbot.classUnderTest {@link GaussNewtonOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer#doOptimize()}
 * @utbot.iterates iterate the loop {@code for(boolean converged = false; !converged; )} once
 * @utbot.throwsException {@link org.apache.commons.math3.exception.TooManyEvaluationsException} in: final double[] currentObjective = computeObjectiveValue(currentPoint);
 *  */
    @Test(expected = TooManyEvaluationsException.class)
    public void testDoOptimize_ThrowTooManyEvaluationsException() throws Exception  {
        GaussNewtonOptimizer gaussNewtonOptimizer = ((GaussNewtonOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer"));
        double[] target = {};
        setField(gaussNewtonOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.MultivariateVectorOptimizer", "target", target);
        Array2DRowRealMatrix weightMatrix = ((Array2DRowRealMatrix) createInstance("org.apache.commons.math3.linear.Array2DRowRealMatrix"));
        double[][] data = new double[1][];
        double[] doubleArray = {0.0};
        data[0] = doubleArray;
        setField(weightMatrix, "org.apache.commons.math3.linear.Array2DRowRealMatrix", "data", data);
        setField(gaussNewtonOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.MultivariateVectorOptimizer", "weightMatrix", weightMatrix);
        double[] start = {};
        setField(gaussNewtonOptimizer, "org.apache.commons.math3.optim.BaseMultivariateOptimizer", "start", start);
        Incrementor evaluations = ((Incrementor) createInstance("org.apache.commons.math3.util.Incrementor"));
        Object maxCountCallback = createInstance("org.apache.commons.math3.optim.BaseOptimizer$MaxEvalCallback");
        setField(evaluations, "org.apache.commons.math3.util.Incrementor", "maxCountCallback", maxCountCallback);
        setField(gaussNewtonOptimizer, "org.apache.commons.math3.optim.BaseOptimizer", "evaluations", evaluations);
        SimpleUnivariateValueChecker checker = ((SimpleUnivariateValueChecker) createInstance("org.apache.commons.math3.optim.univariate.SimpleUnivariateValueChecker"));
        setField(gaussNewtonOptimizer, "org.apache.commons.math3.optim.BaseOptimizer", "checker", checker);
        
        gaussNewtonOptimizer.doOptimize();
    }
    
    /**
    @utbot.classUnderTest {@link GaussNewtonOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer#doOptimize()}
 * @utbot.iterates iterate the loop {@code for(boolean converged = false; !converged; )} once
 * @utbot.throwsException {@link org.apache.commons.math3.exception.TooManyIterationsException} in: final double[] currentObjective = computeObjectiveValue(currentPoint);
 *  */
    @Test(expected = TooManyIterationsException.class)
    public void testDoOptimize_ThrowTooManyIterationsException() throws Exception  {
        GaussNewtonOptimizer gaussNewtonOptimizer = ((GaussNewtonOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer"));
        double[] target = {};
        setField(gaussNewtonOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.MultivariateVectorOptimizer", "target", target);
        Array2DRowRealMatrix weightMatrix = ((Array2DRowRealMatrix) createInstance("org.apache.commons.math3.linear.Array2DRowRealMatrix"));
        double[][] data = new double[1][];
        double[] doubleArray = {0.0};
        data[0] = doubleArray;
        setField(weightMatrix, "org.apache.commons.math3.linear.Array2DRowRealMatrix", "data", data);
        setField(gaussNewtonOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.MultivariateVectorOptimizer", "weightMatrix", weightMatrix);
        double[] start = {5.180654E-318, 4.9E-324};
        setField(gaussNewtonOptimizer, "org.apache.commons.math3.optim.BaseMultivariateOptimizer", "start", start);
        Incrementor evaluations = ((Incrementor) createInstance("org.apache.commons.math3.util.Incrementor"));
        Object maxCountCallback = createInstance("org.apache.commons.math3.optim.BaseOptimizer$MaxIterCallback");
        setField(evaluations, "org.apache.commons.math3.util.Incrementor", "maxCountCallback", maxCountCallback);
        setField(gaussNewtonOptimizer, "org.apache.commons.math3.optim.BaseOptimizer", "evaluations", evaluations);
        SimpleValueChecker checker = ((SimpleValueChecker) createInstance("org.apache.commons.math3.optim.SimpleValueChecker"));
        setField(gaussNewtonOptimizer, "org.apache.commons.math3.optim.BaseOptimizer", "checker", checker);
        
        gaussNewtonOptimizer.doOptimize();
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method doOptimize()
    
    /**
    @utbot.classUnderTest {@link GaussNewtonOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer#doOptimize()}
 * @utbot.throwsException {@link java.lang.NegativeArraySizeException} 
 *  */
    @Test
    public void testDoOptimize_ThrowNegativeArraySizeException_1() throws Exception  {
        GaussNewtonOptimizer gaussNewtonOptimizer = ((GaussNewtonOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer"));
        double[] target = {5.43230922487E-312};
        setField(gaussNewtonOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.MultivariateVectorOptimizer", "target", target);
        BlockRealMatrix weightMatrix = ((BlockRealMatrix) createInstance("org.apache.commons.math3.linear.BlockRealMatrix"));
        setField(weightMatrix, "org.apache.commons.math3.linear.BlockRealMatrix", "rows", 1871563310);
        setField(weightMatrix, "org.apache.commons.math3.linear.BlockRealMatrix", "columns", 603729614);
        setField(gaussNewtonOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.MultivariateVectorOptimizer", "weightMatrix", weightMatrix);
        SimpleUnivariateValueChecker checker = ((SimpleUnivariateValueChecker) createInstance("org.apache.commons.math3.optim.univariate.SimpleUnivariateValueChecker"));
        setField(gaussNewtonOptimizer, "org.apache.commons.math3.optim.BaseOptimizer", "checker", checker);
        
        /* This test fails because method [org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer.doOptimize] produces [java.lang.NegativeArraySizeException: -1083853173]
            org.apache.commons.math3.linear.BlockRealMatrix.createBlocksLayout(BlockRealMatrix.java:261)
            org.apache.commons.math3.linear.BlockRealMatrix.<init>(BlockRealMatrix.java:107)
            org.apache.commons.math3.linear.BlockRealMatrix.copy(BlockRealMatrix.java:291)
            org.apache.commons.math3.linear.BlockRealMatrix.copy(BlockRealMatrix.java:72)
            org.apache.commons.math3.optim.nonlinear.vector.MultivariateVectorOptimizer.getWeight(MultivariateVectorOptimizer.java:96)
            org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer.doOptimize(GaussNewtonOptimizer.java:94) */
        gaussNewtonOptimizer.doOptimize();
    }
    
    /**
    @utbot.classUnderTest {@link GaussNewtonOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer#doOptimize()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: final RealMatrix weightMatrix = getWeight();
 *  */
    @Test
    public void testDoOptimize_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        GaussNewtonOptimizer gaussNewtonOptimizer = ((GaussNewtonOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer"));
        double[] target = {};
        setField(gaussNewtonOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.MultivariateVectorOptimizer", "target", target);
        Array2DRowRealMatrix weightMatrix = ((Array2DRowRealMatrix) createInstance("org.apache.commons.math3.linear.Array2DRowRealMatrix"));
        double[][] data = {};
        setField(weightMatrix, "org.apache.commons.math3.linear.Array2DRowRealMatrix", "data", data);
        setField(gaussNewtonOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.MultivariateVectorOptimizer", "weightMatrix", weightMatrix);
        SimpleValueChecker checker = ((SimpleValueChecker) createInstance("org.apache.commons.math3.optim.SimpleValueChecker"));
        setField(gaussNewtonOptimizer, "org.apache.commons.math3.optim.BaseOptimizer", "checker", checker);
        
        /* This test fails because method [org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer.doOptimize] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math3.linear.Array2DRowRealMatrix.getColumnDimension(Array2DRowRealMatrix.java:345)
            org.apache.commons.math3.linear.Array2DRowRealMatrix.copyOut(Array2DRowRealMatrix.java:529)
            org.apache.commons.math3.linear.Array2DRowRealMatrix.copy(Array2DRowRealMatrix.java:151)
            org.apache.commons.math3.optim.nonlinear.vector.MultivariateVectorOptimizer.getWeight(MultivariateVectorOptimizer.java:96)
            org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer.doOptimize(GaussNewtonOptimizer.java:94) */
        gaussNewtonOptimizer.doOptimize();
    }
    
    /**
    @utbot.classUnderTest {@link GaussNewtonOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer#doOptimize()}
 * @utbot.iterates iterate the loop {@code for(boolean converged = false; !converged; )} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: final double[] currentObjective = computeObjectiveValue(currentPoint);
 *  */
    @Test
    public void testDoOptimize_ThrowArrayIndexOutOfBoundsException_1() throws Exception  {
        GaussNewtonOptimizer gaussNewtonOptimizer = ((GaussNewtonOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer"));
        double[] target = {};
        setField(gaussNewtonOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.MultivariateVectorOptimizer", "target", target);
        Array2DRowRealMatrix weightMatrix = ((Array2DRowRealMatrix) createInstance("org.apache.commons.math3.linear.Array2DRowRealMatrix"));
        double[][] data = new double[1][];
        double[] doubleArray = {0.0};
        data[0] = doubleArray;
        setField(weightMatrix, "org.apache.commons.math3.linear.Array2DRowRealMatrix", "data", data);
        setField(gaussNewtonOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.MultivariateVectorOptimizer", "weightMatrix", weightMatrix);
        GradientFunction model = ((GradientFunction) createInstance("org.apache.commons.math3.analysis.differentiation.GradientFunction"));
        MultivariateDifferentiableFunction f = ((MultivariateDifferentiableFunction) createInstance("org.apache.commons.math3.analysis.FunctionUtils$17"));
        setField(model, "org.apache.commons.math3.analysis.differentiation.GradientFunction", "f", f);
        setField(gaussNewtonOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.MultivariateVectorOptimizer", "model", model);
        double[] start = {};
        setField(gaussNewtonOptimizer, "org.apache.commons.math3.optim.BaseMultivariateOptimizer", "start", start);
        Incrementor evaluations = ((Incrementor) createInstance("org.apache.commons.math3.util.Incrementor"));
        evaluations.setMaximalCount(Integer.MIN_VALUE);
        setField(evaluations, "org.apache.commons.math3.util.Incrementor", "count", Integer.MAX_VALUE);
        setField(gaussNewtonOptimizer, "org.apache.commons.math3.optim.BaseOptimizer", "evaluations", evaluations);
        SimpleValueChecker checker = ((SimpleValueChecker) createInstance("org.apache.commons.math3.optim.SimpleValueChecker"));
        setField(gaussNewtonOptimizer, "org.apache.commons.math3.optim.BaseOptimizer", "checker", checker);
        
        /* This test fails because method [org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer.doOptimize] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math3.analysis.FunctionUtils$17.value(FunctionUtils.java:622)
            org.apache.commons.math3.analysis.differentiation.GradientFunction.value(GradientFunction.java:51)
            org.apache.commons.math3.optim.nonlinear.vector.MultivariateVectorOptimizer.computeObjectiveValue(MultivariateVectorOptimizer.java:63)
            org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer.doOptimize(GaussNewtonOptimizer.java:113) */
        gaussNewtonOptimizer.doOptimize();
    }
    
    /**
    @utbot.classUnderTest {@link GaussNewtonOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer#doOptimize()}
 * @utbot.iterates iterate the loop {@code for(boolean converged = false; !converged; )} once
 * @utbot.throwsException {@link java.lang.ClassCastException} in: final double[] currentObjective = computeObjectiveValue(currentPoint);
 *  */
    @Test
    public void testDoOptimize_ThrowClassCastException() throws Exception  {
        Class dSCompilerClazz = Class.forName("org.apache.commons.math3.analysis.differentiation.DSCompiler");
        AtomicReference prevCompilers = ((AtomicReference) getStaticFieldValue(dSCompilerClazz, "compilers"));
        try {
            byte[] byteArray = {};
            AtomicReference compilers = new AtomicReference(byteArray);
            setStaticField(dSCompilerClazz, "compilers", compilers);
            GaussNewtonOptimizer gaussNewtonOptimizer = ((GaussNewtonOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer"));
            double[] target = {};
            setField(gaussNewtonOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.MultivariateVectorOptimizer", "target", target);
            Array2DRowRealMatrix weightMatrix = ((Array2DRowRealMatrix) createInstance("org.apache.commons.math3.linear.Array2DRowRealMatrix"));
            double[][] data = new double[1][];
            double[] doubleArray = {0.0};
            data[0] = doubleArray;
            setField(weightMatrix, "org.apache.commons.math3.linear.Array2DRowRealMatrix", "data", data);
            setField(gaussNewtonOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.MultivariateVectorOptimizer", "weightMatrix", weightMatrix);
            GradientFunction model = ((GradientFunction) createInstance("org.apache.commons.math3.analysis.differentiation.GradientFunction"));
            setField(gaussNewtonOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.MultivariateVectorOptimizer", "model", model);
            double[] start = {2.242457248026789E-308};
            setField(gaussNewtonOptimizer, "org.apache.commons.math3.optim.BaseMultivariateOptimizer", "start", start);
            Incrementor evaluations = ((Incrementor) createInstance("org.apache.commons.math3.util.Incrementor"));
            evaluations.setMaximalCount(Integer.MIN_VALUE);
            setField(evaluations, "org.apache.commons.math3.util.Incrementor", "count", Integer.MAX_VALUE);
            setField(gaussNewtonOptimizer, "org.apache.commons.math3.optim.BaseOptimizer", "evaluations", evaluations);
            SimpleUnivariateValueChecker checker = ((SimpleUnivariateValueChecker) createInstance("org.apache.commons.math3.optim.univariate.SimpleUnivariateValueChecker"));
            setField(gaussNewtonOptimizer, "org.apache.commons.math3.optim.BaseOptimizer", "checker", checker);
            
            /* This test fails because method [org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer.doOptimize] produces [java.lang.ClassCastException: class [B cannot be cast to class [[Lorg.apache.commons.math3.analysis.differentiation.DSCompiler; ([B is in module java.base of loader 'bootstrap'; [[Lorg.apache.commons.math3.analysis.differentiation.DSCompiler; is in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @60349b9b)]
                org.apache.commons.math3.analysis.differentiation.DSCompiler.getCompiler(DSCompiler.java:195)
                org.apache.commons.math3.analysis.differentiation.DerivativeStructure.<init>(DerivativeStructure.java:88)
                org.apache.commons.math3.analysis.differentiation.DerivativeStructure.<init>(DerivativeStructure.java:100)
                org.apache.commons.math3.analysis.differentiation.DerivativeStructure.<init>(DerivativeStructure.java:119)
                org.apache.commons.math3.analysis.differentiation.GradientFunction.value(GradientFunction.java:47)
                org.apache.commons.math3.optim.nonlinear.vector.MultivariateVectorOptimizer.computeObjectiveValue(MultivariateVectorOptimizer.java:63)
                org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer.doOptimize(GaussNewtonOptimizer.java:113) */
            gaussNewtonOptimizer.doOptimize();
        } finally {
            setStaticField(DSCompiler.class, "compilers", prevCompilers);
        }
    }
    
    /**
    @utbot.classUnderTest {@link GaussNewtonOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer#doOptimize()}
 * @utbot.iterates iterate the loop {@code for(boolean converged = false; !converged; )} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: final double[] currentObjective = computeObjectiveValue(currentPoint);
 *  */
    @Test
    public void testDoOptimize_ThrowArrayIndexOutOfBoundsException_2() throws Exception  {
        Class dSCompilerClazz = Class.forName("org.apache.commons.math3.analysis.differentiation.DSCompiler");
        AtomicReference prevCompilers = ((AtomicReference) getStaticFieldValue(dSCompilerClazz, "compilers"));
        try {
            org.apache.commons.math3.analysis.differentiation.DSCompiler[][] dSCompilerArray = {};
            AtomicReference compilers = new AtomicReference(dSCompilerArray);
            setStaticField(dSCompilerClazz, "compilers", compilers);
            GaussNewtonOptimizer gaussNewtonOptimizer = ((GaussNewtonOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer"));
            double[] target = {};
            setField(gaussNewtonOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.MultivariateVectorOptimizer", "target", target);
            Array2DRowRealMatrix weightMatrix = ((Array2DRowRealMatrix) createInstance("org.apache.commons.math3.linear.Array2DRowRealMatrix"));
            double[][] data = new double[1][];
            double[] doubleArray = {0.0};
            data[0] = doubleArray;
            setField(weightMatrix, "org.apache.commons.math3.linear.Array2DRowRealMatrix", "data", data);
            setField(gaussNewtonOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.MultivariateVectorOptimizer", "weightMatrix", weightMatrix);
            GradientFunction model = ((GradientFunction) createInstance("org.apache.commons.math3.analysis.differentiation.GradientFunction"));
            setField(gaussNewtonOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.MultivariateVectorOptimizer", "model", model);
            double[] start = {4.7783097267364807E-299};
            setField(gaussNewtonOptimizer, "org.apache.commons.math3.optim.BaseMultivariateOptimizer", "start", start);
            Incrementor evaluations = ((Incrementor) createInstance("org.apache.commons.math3.util.Incrementor"));
            evaluations.setMaximalCount(Integer.MIN_VALUE);
            setField(evaluations, "org.apache.commons.math3.util.Incrementor", "count", Integer.MAX_VALUE);
            setField(gaussNewtonOptimizer, "org.apache.commons.math3.optim.BaseOptimizer", "evaluations", evaluations);
            SimpleUnivariateValueChecker checker = ((SimpleUnivariateValueChecker) createInstance("org.apache.commons.math3.optim.univariate.SimpleUnivariateValueChecker"));
            setField(gaussNewtonOptimizer, "org.apache.commons.math3.optim.BaseOptimizer", "checker", checker);
            
            /* This test fails because method [org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer.doOptimize] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
                org.apache.commons.math3.analysis.differentiation.DSCompiler.getCompiler(DSCompiler.java:205)
                org.apache.commons.math3.analysis.differentiation.DerivativeStructure.<init>(DerivativeStructure.java:88)
                org.apache.commons.math3.analysis.differentiation.DerivativeStructure.<init>(DerivativeStructure.java:100)
                org.apache.commons.math3.analysis.differentiation.DerivativeStructure.<init>(DerivativeStructure.java:119)
                org.apache.commons.math3.analysis.differentiation.GradientFunction.value(GradientFunction.java:47)
                org.apache.commons.math3.optim.nonlinear.vector.MultivariateVectorOptimizer.computeObjectiveValue(MultivariateVectorOptimizer.java:63)
                org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer.doOptimize(GaussNewtonOptimizer.java:113) */
            gaussNewtonOptimizer.doOptimize();
        } finally {
            setStaticField(DSCompiler.class, "compilers", prevCompilers);
        }
    }
    
    /**
    @utbot.classUnderTest {@link GaussNewtonOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer#doOptimize()}
 * @utbot.iterates iterate the loop {@code for(boolean converged = false; !converged; )} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} 
 *  */
    @Test
    public void testDoOptimize_ThrowArrayIndexOutOfBoundsException_3() throws Exception  {
        Class dSCompilerClazz = Class.forName("org.apache.commons.math3.analysis.differentiation.DSCompiler");
        AtomicReference prevCompilers = ((AtomicReference) getStaticFieldValue(dSCompilerClazz, "compilers"));
        try {
            org.apache.commons.math3.analysis.differentiation.DSCompiler[][] dSCompilerArray = new org.apache.commons.math3.analysis.differentiation.DSCompiler[2][];
            dSCompilerArray[0] = ((org.apache.commons.math3.analysis.differentiation.DSCompiler[]) null);
            org.apache.commons.math3.analysis.differentiation.DSCompiler[] dSCompilerArray1 = new org.apache.commons.math3.analysis.differentiation.DSCompiler[2];
            DSCompiler dSCompiler = ((DSCompiler) createInstance("org.apache.commons.math3.analysis.differentiation.DSCompiler"));
            setField(dSCompiler, "org.apache.commons.math3.analysis.differentiation.DSCompiler", "parameters", 536870912);
            int[][] sizes = {null};
            setField(dSCompiler, "org.apache.commons.math3.analysis.differentiation.DSCompiler", "sizes", sizes);
            dSCompilerArray1[1] = dSCompiler;
            dSCompilerArray[1] = dSCompilerArray1;
            AtomicReference compilers = new AtomicReference(dSCompilerArray);
            setStaticField(dSCompilerClazz, "compilers", compilers);
            GaussNewtonOptimizer gaussNewtonOptimizer = ((GaussNewtonOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer"));
            double[] target = {};
            setField(gaussNewtonOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.MultivariateVectorOptimizer", "target", target);
            Array2DRowRealMatrix weightMatrix = ((Array2DRowRealMatrix) createInstance("org.apache.commons.math3.linear.Array2DRowRealMatrix"));
            double[][] data = new double[1][];
            double[] doubleArray = {1.27E-321};
            data[0] = doubleArray;
            setField(weightMatrix, "org.apache.commons.math3.linear.Array2DRowRealMatrix", "data", data);
            setField(gaussNewtonOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.MultivariateVectorOptimizer", "weightMatrix", weightMatrix);
            GradientFunction model = ((GradientFunction) createInstance("org.apache.commons.math3.analysis.differentiation.GradientFunction"));
            setField(gaussNewtonOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.MultivariateVectorOptimizer", "model", model);
            double[] start = {4.9E-324};
            setField(gaussNewtonOptimizer, "org.apache.commons.math3.optim.BaseMultivariateOptimizer", "start", start);
            Incrementor evaluations = ((Incrementor) createInstance("org.apache.commons.math3.util.Incrementor"));
            evaluations.setMaximalCount(Integer.MIN_VALUE);
            setField(evaluations, "org.apache.commons.math3.util.Incrementor", "count", Integer.MAX_VALUE);
            setField(gaussNewtonOptimizer, "org.apache.commons.math3.optim.BaseOptimizer", "evaluations", evaluations);
            SimpleUnivariateValueChecker checker = ((SimpleUnivariateValueChecker) createInstance("org.apache.commons.math3.optim.univariate.SimpleUnivariateValueChecker"));
            setField(gaussNewtonOptimizer, "org.apache.commons.math3.optim.BaseOptimizer", "checker", checker);
            
            /* This test fails because method [org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer.doOptimize] produces [java.lang.ArrayIndexOutOfBoundsException: Index 536870912 out of bounds for length 1]
                org.apache.commons.math3.analysis.differentiation.DSCompiler.getSize(DSCompiler.java:653)
                org.apache.commons.math3.analysis.differentiation.DerivativeStructure.<init>(DerivativeStructure.java:78)
                org.apache.commons.math3.analysis.differentiation.DerivativeStructure.<init>(DerivativeStructure.java:88)
                org.apache.commons.math3.analysis.differentiation.DerivativeStructure.<init>(DerivativeStructure.java:100)
                org.apache.commons.math3.analysis.differentiation.DerivativeStructure.<init>(DerivativeStructure.java:119)
                org.apache.commons.math3.analysis.differentiation.GradientFunction.value(GradientFunction.java:47)
                org.apache.commons.math3.optim.nonlinear.vector.MultivariateVectorOptimizer.computeObjectiveValue(MultivariateVectorOptimizer.java:63)
                org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer.doOptimize(GaussNewtonOptimizer.java:113) */
            gaussNewtonOptimizer.doOptimize();
        } finally {
            setStaticField(DSCompiler.class, "compilers", prevCompilers);
        }
    }
    
    /**
    @utbot.classUnderTest {@link GaussNewtonOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer#doOptimize()}
 * @utbot.iterates iterate the loop {@code for(boolean converged = false; !converged; )} once
 * @utbot.throwsException {@link java.lang.NegativeArraySizeException} in: final double[] currentObjective = computeObjectiveValue(currentPoint);
 *  */
    @Test
    public void testDoOptimize_ThrowNegativeArraySizeException() throws Exception  {
        Class dSCompilerClazz = Class.forName("org.apache.commons.math3.analysis.differentiation.DSCompiler");
        AtomicReference prevCompilers = ((AtomicReference) getStaticFieldValue(dSCompilerClazz, "compilers"));
        try {
            org.apache.commons.math3.analysis.differentiation.DSCompiler[][] dSCompilerArray = new org.apache.commons.math3.analysis.differentiation.DSCompiler[2][];
            dSCompilerArray[0] = ((org.apache.commons.math3.analysis.differentiation.DSCompiler[]) null);
            org.apache.commons.math3.analysis.differentiation.DSCompiler[] dSCompilerArray1 = new org.apache.commons.math3.analysis.differentiation.DSCompiler[2];
            DSCompiler dSCompiler = ((DSCompiler) createInstance("org.apache.commons.math3.analysis.differentiation.DSCompiler"));
            int[][] sizes = new int[1][];
            int[] intArray = {Integer.MIN_VALUE};
            sizes[0] = intArray;
            setField(dSCompiler, "org.apache.commons.math3.analysis.differentiation.DSCompiler", "sizes", sizes);
            dSCompilerArray1[1] = dSCompiler;
            dSCompilerArray[1] = dSCompilerArray1;
            AtomicReference compilers = new AtomicReference(dSCompilerArray);
            setStaticField(dSCompilerClazz, "compilers", compilers);
            GaussNewtonOptimizer gaussNewtonOptimizer = ((GaussNewtonOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer"));
            double[] target = {};
            setField(gaussNewtonOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.MultivariateVectorOptimizer", "target", target);
            Array2DRowRealMatrix weightMatrix = ((Array2DRowRealMatrix) createInstance("org.apache.commons.math3.linear.Array2DRowRealMatrix"));
            double[][] data = new double[1][];
            double[] doubleArray = {1.58E-322, 0.0};
            data[0] = doubleArray;
            setField(weightMatrix, "org.apache.commons.math3.linear.Array2DRowRealMatrix", "data", data);
            setField(gaussNewtonOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.MultivariateVectorOptimizer", "weightMatrix", weightMatrix);
            GradientFunction model = ((GradientFunction) createInstance("org.apache.commons.math3.analysis.differentiation.GradientFunction"));
            setField(gaussNewtonOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.MultivariateVectorOptimizer", "model", model);
            double[] start = {0.0};
            setField(gaussNewtonOptimizer, "org.apache.commons.math3.optim.BaseMultivariateOptimizer", "start", start);
            Incrementor evaluations = ((Incrementor) createInstance("org.apache.commons.math3.util.Incrementor"));
            evaluations.setMaximalCount(Integer.MIN_VALUE);
            setField(evaluations, "org.apache.commons.math3.util.Incrementor", "count", Integer.MAX_VALUE);
            setField(gaussNewtonOptimizer, "org.apache.commons.math3.optim.BaseOptimizer", "evaluations", evaluations);
            SimpleVectorValueChecker checker = ((SimpleVectorValueChecker) createInstance("org.apache.commons.math3.optim.SimpleVectorValueChecker"));
            setField(gaussNewtonOptimizer, "org.apache.commons.math3.optim.BaseOptimizer", "checker", checker);
            
            /* This test fails because method [org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer.doOptimize] produces [java.lang.NegativeArraySizeException: -2147483648]
                org.apache.commons.math3.analysis.differentiation.DerivativeStructure.<init>(DerivativeStructure.java:78)
                org.apache.commons.math3.analysis.differentiation.DerivativeStructure.<init>(DerivativeStructure.java:88)
                org.apache.commons.math3.analysis.differentiation.DerivativeStructure.<init>(DerivativeStructure.java:100)
                org.apache.commons.math3.analysis.differentiation.DerivativeStructure.<init>(DerivativeStructure.java:119)
                org.apache.commons.math3.analysis.differentiation.GradientFunction.value(GradientFunction.java:47)
                org.apache.commons.math3.optim.nonlinear.vector.MultivariateVectorOptimizer.computeObjectiveValue(MultivariateVectorOptimizer.java:63)
                org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer.doOptimize(GaussNewtonOptimizer.java:113) */
            gaussNewtonOptimizer.doOptimize();
        } finally {
            setStaticField(DSCompiler.class, "compilers", prevCompilers);
        }
    }
    
    /**
    @utbot.classUnderTest {@link GaussNewtonOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer#doOptimize()}
 * @utbot.iterates iterate the loop {@code for(boolean converged = false; !converged; )} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} 
 *  */
    @Test
    public void testDoOptimize_ThrowArrayIndexOutOfBoundsException_4() throws Exception  {
        Class dSCompilerClazz = Class.forName("org.apache.commons.math3.analysis.differentiation.DSCompiler");
        AtomicReference prevCompilers = ((AtomicReference) getStaticFieldValue(dSCompilerClazz, "compilers"));
        try {
            org.apache.commons.math3.analysis.differentiation.DSCompiler[][] dSCompilerArray = new org.apache.commons.math3.analysis.differentiation.DSCompiler[2][];
            dSCompilerArray[0] = ((org.apache.commons.math3.analysis.differentiation.DSCompiler[]) null);
            org.apache.commons.math3.analysis.differentiation.DSCompiler[] dSCompilerArray1 = new org.apache.commons.math3.analysis.differentiation.DSCompiler[2];
            DSCompiler dSCompiler = ((DSCompiler) createInstance("org.apache.commons.math3.analysis.differentiation.DSCompiler"));
            setField(dSCompiler, "org.apache.commons.math3.analysis.differentiation.DSCompiler", "order", 1073741824);
            int[][] sizes = new int[1][];
            int[] intArray = {0};
            sizes[0] = intArray;
            setField(dSCompiler, "org.apache.commons.math3.analysis.differentiation.DSCompiler", "sizes", sizes);
            dSCompilerArray1[1] = dSCompiler;
            dSCompilerArray[1] = dSCompilerArray1;
            AtomicReference compilers = new AtomicReference(dSCompilerArray);
            setStaticField(dSCompilerClazz, "compilers", compilers);
            GaussNewtonOptimizer gaussNewtonOptimizer = ((GaussNewtonOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer"));
            double[] target = {};
            setField(gaussNewtonOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.MultivariateVectorOptimizer", "target", target);
            Array2DRowRealMatrix weightMatrix = ((Array2DRowRealMatrix) createInstance("org.apache.commons.math3.linear.Array2DRowRealMatrix"));
            double[][] data = new double[1][];
            double[] doubleArray = {4.9E-324, 0.0};
            data[0] = doubleArray;
            setField(weightMatrix, "org.apache.commons.math3.linear.Array2DRowRealMatrix", "data", data);
            setField(gaussNewtonOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.MultivariateVectorOptimizer", "weightMatrix", weightMatrix);
            GradientFunction model = ((GradientFunction) createInstance("org.apache.commons.math3.analysis.differentiation.GradientFunction"));
            setField(gaussNewtonOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.MultivariateVectorOptimizer", "model", model);
            double[] start = {4.9E-324};
            setField(gaussNewtonOptimizer, "org.apache.commons.math3.optim.BaseMultivariateOptimizer", "start", start);
            Incrementor evaluations = ((Incrementor) createInstance("org.apache.commons.math3.util.Incrementor"));
            evaluations.setMaximalCount(Integer.MIN_VALUE);
            setField(evaluations, "org.apache.commons.math3.util.Incrementor", "count", Integer.MAX_VALUE);
            setField(gaussNewtonOptimizer, "org.apache.commons.math3.optim.BaseOptimizer", "evaluations", evaluations);
            SimpleVectorValueChecker checker = ((SimpleVectorValueChecker) createInstance("org.apache.commons.math3.optim.SimpleVectorValueChecker"));
            setField(gaussNewtonOptimizer, "org.apache.commons.math3.optim.BaseOptimizer", "checker", checker);
            
            /* This test fails because method [org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer.doOptimize] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1073741824 out of bounds for length 1]
                org.apache.commons.math3.analysis.differentiation.DSCompiler.getSize(DSCompiler.java:653)
                org.apache.commons.math3.analysis.differentiation.DerivativeStructure.<init>(DerivativeStructure.java:78)
                org.apache.commons.math3.analysis.differentiation.DerivativeStructure.<init>(DerivativeStructure.java:88)
                org.apache.commons.math3.analysis.differentiation.DerivativeStructure.<init>(DerivativeStructure.java:100)
                org.apache.commons.math3.analysis.differentiation.DerivativeStructure.<init>(DerivativeStructure.java:119)
                org.apache.commons.math3.analysis.differentiation.GradientFunction.value(GradientFunction.java:47)
                org.apache.commons.math3.optim.nonlinear.vector.MultivariateVectorOptimizer.computeObjectiveValue(MultivariateVectorOptimizer.java:63)
                org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer.doOptimize(GaussNewtonOptimizer.java:113) */
            gaussNewtonOptimizer.doOptimize();
        } finally {
            setStaticField(DSCompiler.class, "compilers", prevCompilers);
        }
    }
    
    /**
    @utbot.classUnderTest {@link GaussNewtonOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer#doOptimize()}
 * @utbot.iterates iterate the loop {@code for(boolean converged = false; !converged; )} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: final double[] currentObjective = computeObjectiveValue(currentPoint);
 *  */
    @Test
    public void testDoOptimize_ThrowArrayIndexOutOfBoundsException_5() throws Exception  {
        Class dSCompilerClazz = Class.forName("org.apache.commons.math3.analysis.differentiation.DSCompiler");
        AtomicReference prevCompilers = ((AtomicReference) getStaticFieldValue(dSCompilerClazz, "compilers"));
        try {
            org.apache.commons.math3.analysis.differentiation.DSCompiler[][] dSCompilerArray = new org.apache.commons.math3.analysis.differentiation.DSCompiler[2][];
            dSCompilerArray[0] = ((org.apache.commons.math3.analysis.differentiation.DSCompiler[]) null);
            org.apache.commons.math3.analysis.differentiation.DSCompiler[] dSCompilerArray1 = new org.apache.commons.math3.analysis.differentiation.DSCompiler[2];
            DSCompiler dSCompiler = ((DSCompiler) createInstance("org.apache.commons.math3.analysis.differentiation.DSCompiler"));
            int[][] sizes = new int[1][];
            int[] intArray = {0};
            sizes[0] = intArray;
            setField(dSCompiler, "org.apache.commons.math3.analysis.differentiation.DSCompiler", "sizes", sizes);
            dSCompilerArray1[1] = dSCompiler;
            dSCompilerArray[1] = dSCompilerArray1;
            AtomicReference compilers = new AtomicReference(dSCompilerArray);
            setStaticField(dSCompilerClazz, "compilers", compilers);
            GaussNewtonOptimizer gaussNewtonOptimizer = ((GaussNewtonOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer"));
            double[] target = {};
            setField(gaussNewtonOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.MultivariateVectorOptimizer", "target", target);
            Array2DRowRealMatrix weightMatrix = ((Array2DRowRealMatrix) createInstance("org.apache.commons.math3.linear.Array2DRowRealMatrix"));
            double[][] data = new double[1][];
            double[] doubleArray = {4.9E-324};
            data[0] = doubleArray;
            setField(weightMatrix, "org.apache.commons.math3.linear.Array2DRowRealMatrix", "data", data);
            setField(gaussNewtonOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.MultivariateVectorOptimizer", "weightMatrix", weightMatrix);
            GradientFunction model = ((GradientFunction) createInstance("org.apache.commons.math3.analysis.differentiation.GradientFunction"));
            setField(gaussNewtonOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.MultivariateVectorOptimizer", "model", model);
            setField(gaussNewtonOptimizer, "org.apache.commons.math3.optim.BaseMultivariateOptimizer", "start", doubleArray);
            Incrementor evaluations = ((Incrementor) createInstance("org.apache.commons.math3.util.Incrementor"));
            evaluations.setMaximalCount(Integer.MIN_VALUE);
            setField(evaluations, "org.apache.commons.math3.util.Incrementor", "count", Integer.MAX_VALUE);
            setField(gaussNewtonOptimizer, "org.apache.commons.math3.optim.BaseOptimizer", "evaluations", evaluations);
            SimpleUnivariateValueChecker checker = ((SimpleUnivariateValueChecker) createInstance("org.apache.commons.math3.optim.univariate.SimpleUnivariateValueChecker"));
            setField(gaussNewtonOptimizer, "org.apache.commons.math3.optim.BaseOptimizer", "checker", checker);
            
            /* This test fails because method [org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer.doOptimize] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
                org.apache.commons.math3.analysis.differentiation.DerivativeStructure.<init>(DerivativeStructure.java:101)
                org.apache.commons.math3.analysis.differentiation.DerivativeStructure.<init>(DerivativeStructure.java:119)
                org.apache.commons.math3.analysis.differentiation.GradientFunction.value(GradientFunction.java:47)
                org.apache.commons.math3.optim.nonlinear.vector.MultivariateVectorOptimizer.computeObjectiveValue(MultivariateVectorOptimizer.java:63)
                org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer.doOptimize(GaussNewtonOptimizer.java:113) */
            gaussNewtonOptimizer.doOptimize();
        } finally {
            setStaticField(DSCompiler.class, "compilers", prevCompilers);
        }
    }
    
    /**
    @utbot.classUnderTest {@link GaussNewtonOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer#doOptimize()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: final RealMatrix weightMatrix = getWeight();
 *  */
    @Test
    public void testDoOptimize_ThrowNullPointerException() throws Exception  {
        GaussNewtonOptimizer gaussNewtonOptimizer = ((GaussNewtonOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer"));
        double[] target = {2.2250738585072014E-308};
        setField(gaussNewtonOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.MultivariateVectorOptimizer", "target", target);
        Array2DRowRealMatrix weightMatrix = ((Array2DRowRealMatrix) createInstance("org.apache.commons.math3.linear.Array2DRowRealMatrix"));
        double[][] data = {null};
        setField(weightMatrix, "org.apache.commons.math3.linear.Array2DRowRealMatrix", "data", data);
        setField(gaussNewtonOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.MultivariateVectorOptimizer", "weightMatrix", weightMatrix);
        SimpleVectorValueChecker checker = ((SimpleVectorValueChecker) createInstance("org.apache.commons.math3.optim.SimpleVectorValueChecker"));
        setField(gaussNewtonOptimizer, "org.apache.commons.math3.optim.BaseOptimizer", "checker", checker);
        
        /* This test fails because method [org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer.doOptimize] produces [java.lang.NullPointerException]
            org.apache.commons.math3.linear.Array2DRowRealMatrix.copyOut(Array2DRowRealMatrix.java:532)
            org.apache.commons.math3.linear.Array2DRowRealMatrix.copy(Array2DRowRealMatrix.java:151)
            org.apache.commons.math3.optim.nonlinear.vector.MultivariateVectorOptimizer.getWeight(MultivariateVectorOptimizer.java:96)
            org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer.doOptimize(GaussNewtonOptimizer.java:94) */
        gaussNewtonOptimizer.doOptimize();
    }
    
    /**
    @utbot.classUnderTest {@link GaussNewtonOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer#doOptimize()}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < nR; i++)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: final int nC = currentPoint.length;
 *  */
    @Test
    public void testDoOptimize_ThrowNullPointerException_2() throws Exception  {
        GaussNewtonOptimizer gaussNewtonOptimizer = ((GaussNewtonOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer"));
        double[] target = {4.450147717014419E-308};
        setField(gaussNewtonOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.MultivariateVectorOptimizer", "target", target);
        Array2DRowRealMatrix weightMatrix = ((Array2DRowRealMatrix) createInstance("org.apache.commons.math3.linear.Array2DRowRealMatrix"));
        double[][] data = new double[1][];
        double[] doubleArray = {0.0, 0.0};
        data[0] = doubleArray;
        setField(weightMatrix, "org.apache.commons.math3.linear.Array2DRowRealMatrix", "data", data);
        setField(gaussNewtonOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.MultivariateVectorOptimizer", "weightMatrix", weightMatrix);
        SimpleValueChecker checker = ((SimpleValueChecker) createInstance("org.apache.commons.math3.optim.SimpleValueChecker"));
        setField(gaussNewtonOptimizer, "org.apache.commons.math3.optim.BaseOptimizer", "checker", checker);
        
        /* This test fails because method [org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer.doOptimize] produces [java.lang.NullPointerException]
            org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer.doOptimize(GaussNewtonOptimizer.java:102) */
        gaussNewtonOptimizer.doOptimize();
    }
    
    /**
    @utbot.classUnderTest {@link GaussNewtonOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer#doOptimize()}
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test
    public void testDoOptimize_ThrowNullPointerException_1() throws Exception  {
        GaussNewtonOptimizer gaussNewtonOptimizer = ((GaussNewtonOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer"));
        double[] target = {};
        setField(gaussNewtonOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.MultivariateVectorOptimizer", "target", target);
        OpenMapRealMatrix weightMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math3.linear.OpenMapRealMatrix"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        int[] keys = {};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "keys", keys);
        setField(weightMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "entries", entries);
        setField(gaussNewtonOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.MultivariateVectorOptimizer", "weightMatrix", weightMatrix);
        SimpleVectorValueChecker checker = ((SimpleVectorValueChecker) createInstance("org.apache.commons.math3.optim.SimpleVectorValueChecker"));
        setField(gaussNewtonOptimizer, "org.apache.commons.math3.optim.BaseOptimizer", "checker", checker);
        
        /* This test fails because method [org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer.doOptimize] produces [java.lang.NullPointerException]
            java.base/java.lang.System.arraycopy(Native Method)
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.<init>(OpenIntToDoubleHashMap.java:135)
            org.apache.commons.math3.linear.OpenMapRealMatrix.<init>(OpenMapRealMatrix.java:82)
            org.apache.commons.math3.linear.OpenMapRealMatrix.copy(OpenMapRealMatrix.java:88)
            org.apache.commons.math3.linear.OpenMapRealMatrix.copy(OpenMapRealMatrix.java:39)
            org.apache.commons.math3.optim.nonlinear.vector.MultivariateVectorOptimizer.getWeight(MultivariateVectorOptimizer.java:96)
            org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer.doOptimize(GaussNewtonOptimizer.java:94) */
        gaussNewtonOptimizer.doOptimize();
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method doOptimize()
    
    @Test
    public void testDoOptimize1() throws Exception  {
        GaussNewtonOptimizer gaussNewtonOptimizer = ((GaussNewtonOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer"));
        double[] target = {
            7.9E-323, -0.0, 4.450147717014466E-308, 3.39519326554E-313, -0.0, 0.0,
            4.7783097267364807E-299, 2.0, 1.787012442613596E-307
        };
        setField(gaussNewtonOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.MultivariateVectorOptimizer", "target", target);
        BlockRealMatrix weightMatrix = ((BlockRealMatrix) createInstance("org.apache.commons.math3.linear.BlockRealMatrix"));
        setField(weightMatrix, "org.apache.commons.math3.linear.BlockRealMatrix", "rows", 20983624);
        setField(weightMatrix, "org.apache.commons.math3.linear.BlockRealMatrix", "columns", 1888401064);
        setField(gaussNewtonOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.MultivariateVectorOptimizer", "weightMatrix", weightMatrix);
        SimpleValueChecker checker = ((SimpleValueChecker) createInstance("org.apache.commons.math3.optim.SimpleValueChecker"));
        setField(gaussNewtonOptimizer, "org.apache.commons.math3.optim.BaseOptimizer", "checker", checker);
        
        /* This test fails because method [org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer.doOptimize] produces [java.lang.ArrayIndexOutOfBoundsException: Index 40 out of bounds for length 40]
            org.apache.commons.math3.linear.BlockRealMatrix.createBlocksLayout(BlockRealMatrix.java:271)
            org.apache.commons.math3.linear.BlockRealMatrix.<init>(BlockRealMatrix.java:107)
            org.apache.commons.math3.linear.BlockRealMatrix.copy(BlockRealMatrix.java:291)
            org.apache.commons.math3.linear.BlockRealMatrix.copy(BlockRealMatrix.java:72)
            org.apache.commons.math3.optim.nonlinear.vector.MultivariateVectorOptimizer.getWeight(MultivariateVectorOptimizer.java:96)
            org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer.doOptimize(GaussNewtonOptimizer.java:94) */
        gaussNewtonOptimizer.doOptimize();
    }
    
    @Test
    public void testDoOptimize2() throws Exception  {
        Class dSCompilerClazz = Class.forName("org.apache.commons.math3.analysis.differentiation.DSCompiler");
        AtomicReference prevCompilers = ((AtomicReference) getStaticFieldValue(dSCompilerClazz, "compilers"));
        try {
            org.apache.commons.math3.analysis.differentiation.DSCompiler[][] dSCompilerArray = new org.apache.commons.math3.analysis.differentiation.DSCompiler[3][];
            org.apache.commons.math3.analysis.differentiation.DSCompiler[] dSCompilerArray1 = {};
            dSCompilerArray[0] = dSCompilerArray1;
            org.apache.commons.math3.analysis.differentiation.DSCompiler[] dSCompilerArray2 = {null, null, null, null, null, null, null, null, null, null};
            dSCompilerArray[1] = dSCompilerArray2;
            dSCompilerArray[2] = ((org.apache.commons.math3.analysis.differentiation.DSCompiler[]) null);
            AtomicReference compilers = new AtomicReference(dSCompilerArray);
            setStaticField(dSCompilerClazz, "compilers", compilers);
            GaussNewtonOptimizer gaussNewtonOptimizer = ((GaussNewtonOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer"));
            double[] target = {};
            setField(gaussNewtonOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.MultivariateVectorOptimizer", "target", target);
            Array2DRowRealMatrix weightMatrix = ((Array2DRowRealMatrix) createInstance("org.apache.commons.math3.linear.Array2DRowRealMatrix"));
            double[][] data = new double[1][];
            double[] doubleArray = {0.0, 0.0, 0.0, 0.0};
            data[0] = doubleArray;
            setField(weightMatrix, "org.apache.commons.math3.linear.Array2DRowRealMatrix", "data", data);
            setField(gaussNewtonOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.MultivariateVectorOptimizer", "weightMatrix", weightMatrix);
            GradientFunction model = ((GradientFunction) createInstance("org.apache.commons.math3.analysis.differentiation.GradientFunction"));
            setField(gaussNewtonOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.MultivariateVectorOptimizer", "model", model);
            double[] start = {0.0};
            setField(gaussNewtonOptimizer, "org.apache.commons.math3.optim.BaseMultivariateOptimizer", "start", start);
            Incrementor evaluations = ((Incrementor) createInstance("org.apache.commons.math3.util.Incrementor"));
            setField(evaluations, "org.apache.commons.math3.util.Incrementor", "count", -2);
            setField(gaussNewtonOptimizer, "org.apache.commons.math3.optim.BaseOptimizer", "evaluations", evaluations);
            SimpleValueChecker checker = ((SimpleValueChecker) createInstance("org.apache.commons.math3.optim.SimpleValueChecker"));
            setField(gaussNewtonOptimizer, "org.apache.commons.math3.optim.BaseOptimizer", "checker", checker);
            
            /* This test fails because method [org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer.doOptimize] produces [java.lang.ArrayIndexOutOfBoundsException: arraycopy: last destination index 10 out of bounds for object array[2]]
                java.base/java.lang.System.arraycopy(Native Method)
                org.apache.commons.math3.analysis.differentiation.DSCompiler.getCompiler(DSCompiler.java:211)
                org.apache.commons.math3.analysis.differentiation.DerivativeStructure.<init>(DerivativeStructure.java:88)
                org.apache.commons.math3.analysis.differentiation.DerivativeStructure.<init>(DerivativeStructure.java:100)
                org.apache.commons.math3.analysis.differentiation.DerivativeStructure.<init>(DerivativeStructure.java:119)
                org.apache.commons.math3.analysis.differentiation.GradientFunction.value(GradientFunction.java:47)
                org.apache.commons.math3.optim.nonlinear.vector.MultivariateVectorOptimizer.computeObjectiveValue(MultivariateVectorOptimizer.java:63)
                org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer.doOptimize(GaussNewtonOptimizer.java:113) */
            gaussNewtonOptimizer.doOptimize();
        } finally {
            setStaticField(DSCompiler.class, "compilers", prevCompilers);
        }
    }
    
    @Test
    public void testDoOptimize3() throws Exception  {
        GaussNewtonOptimizer gaussNewtonOptimizer = ((GaussNewtonOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer"));
        double[] target = {};
        setField(gaussNewtonOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.MultivariateVectorOptimizer", "target", target);
        BlockRealMatrix weightMatrix = ((BlockRealMatrix) createInstance("org.apache.commons.math3.linear.BlockRealMatrix"));
        setField(weightMatrix, "org.apache.commons.math3.linear.BlockRealMatrix", "rows", 5);
        setField(weightMatrix, "org.apache.commons.math3.linear.BlockRealMatrix", "columns", 8);
        setField(gaussNewtonOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.MultivariateVectorOptimizer", "weightMatrix", weightMatrix);
        SimpleUnivariateValueChecker checker = ((SimpleUnivariateValueChecker) createInstance("org.apache.commons.math3.optim.univariate.SimpleUnivariateValueChecker"));
        setField(gaussNewtonOptimizer, "org.apache.commons.math3.optim.BaseOptimizer", "checker", checker);
        
        /* This test fails because method [org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer.doOptimize] produces [java.lang.NullPointerException]
            org.apache.commons.math3.linear.BlockRealMatrix.copy(BlockRealMatrix.java:294)
            org.apache.commons.math3.linear.BlockRealMatrix.copy(BlockRealMatrix.java:72)
            org.apache.commons.math3.optim.nonlinear.vector.MultivariateVectorOptimizer.getWeight(MultivariateVectorOptimizer.java:96)
            org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer.doOptimize(GaussNewtonOptimizer.java:94) */
        gaussNewtonOptimizer.doOptimize();
    }
    
    @Test
    public void testDoOptimize4() throws Exception  {
        GaussNewtonOptimizer gaussNewtonOptimizer = ((GaussNewtonOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer"));
        double[] target = {};
        setField(gaussNewtonOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.MultivariateVectorOptimizer", "target", target);
        BlockRealMatrix weightMatrix = ((BlockRealMatrix) createInstance("org.apache.commons.math3.linear.BlockRealMatrix"));
        double[][] blocks = {};
        setField(weightMatrix, "org.apache.commons.math3.linear.BlockRealMatrix", "blocks", blocks);
        setField(weightMatrix, "org.apache.commons.math3.linear.BlockRealMatrix", "rows", 2147483630);
        setField(weightMatrix, "org.apache.commons.math3.linear.BlockRealMatrix", "columns", 1469332012);
        setField(gaussNewtonOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.MultivariateVectorOptimizer", "weightMatrix", weightMatrix);
        SimpleVectorValueChecker checker = ((SimpleVectorValueChecker) createInstance("org.apache.commons.math3.optim.SimpleVectorValueChecker"));
        setField(gaussNewtonOptimizer, "org.apache.commons.math3.optim.BaseOptimizer", "checker", checker);
        
        /* This test fails because method [org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer.doOptimize] produces [java.lang.NullPointerException]
            org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer.doOptimize(GaussNewtonOptimizer.java:102) */
        gaussNewtonOptimizer.doOptimize();
    }
    
    @Test
    public void testDoOptimize5() throws Exception  {
        Class dSCompilerClazz = Class.forName("org.apache.commons.math3.analysis.differentiation.DSCompiler");
        AtomicReference prevCompilers = ((AtomicReference) getStaticFieldValue(dSCompilerClazz, "compilers"));
        try {
            org.apache.commons.math3.analysis.differentiation.DSCompiler[][] dSCompilerArray = new org.apache.commons.math3.analysis.differentiation.DSCompiler[1][];
            org.apache.commons.math3.analysis.differentiation.DSCompiler[] dSCompilerArray1 = {};
            dSCompilerArray[0] = dSCompilerArray1;
            AtomicReference compilers = new AtomicReference(dSCompilerArray);
            setStaticField(dSCompilerClazz, "compilers", compilers);
            GaussNewtonOptimizer gaussNewtonOptimizer = ((GaussNewtonOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer"));
            double[] target = {};
            setField(gaussNewtonOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.MultivariateVectorOptimizer", "target", target);
            Array2DRowRealMatrix weightMatrix = ((Array2DRowRealMatrix) createInstance("org.apache.commons.math3.linear.Array2DRowRealMatrix"));
            double[][] data = new double[1][];
            double[] doubleArray = {0.0, 0.0, 0.0, 0.0};
            data[0] = doubleArray;
            setField(weightMatrix, "org.apache.commons.math3.linear.Array2DRowRealMatrix", "data", data);
            setField(gaussNewtonOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.MultivariateVectorOptimizer", "weightMatrix", weightMatrix);
            GradientFunction model = ((GradientFunction) createInstance("org.apache.commons.math3.analysis.differentiation.GradientFunction"));
            setField(gaussNewtonOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.MultivariateVectorOptimizer", "model", model);
            double[] start = {0.0, 0.0, 0.0};
            setField(gaussNewtonOptimizer, "org.apache.commons.math3.optim.BaseMultivariateOptimizer", "start", start);
            Incrementor evaluations = ((Incrementor) createInstance("org.apache.commons.math3.util.Incrementor"));
            setField(evaluations, "org.apache.commons.math3.util.Incrementor", "count", -2);
            setField(gaussNewtonOptimizer, "org.apache.commons.math3.optim.BaseOptimizer", "evaluations", evaluations);
            SimplePointChecker checker = ((SimplePointChecker) createInstance("org.apache.commons.math3.optim.SimplePointChecker"));
            setField(gaussNewtonOptimizer, "org.apache.commons.math3.optim.BaseOptimizer", "checker", checker);
            
            /* This test fails because method [org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer.doOptimize] produces [java.lang.NullPointerException]
                org.apache.commons.math3.analysis.differentiation.GradientFunction.value(GradientFunction.java:51)
                org.apache.commons.math3.optim.nonlinear.vector.MultivariateVectorOptimizer.computeObjectiveValue(MultivariateVectorOptimizer.java:63)
                org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer.doOptimize(GaussNewtonOptimizer.java:113) */
            gaussNewtonOptimizer.doOptimize();
        } finally {
            setStaticField(DSCompiler.class, "compilers", prevCompilers);
        }
    }
    
    @Test
    public void testDoOptimize6() throws Exception  {
        Class dSCompilerClazz = Class.forName("org.apache.commons.math3.analysis.differentiation.DSCompiler");
        AtomicReference prevCompilers = ((AtomicReference) getStaticFieldValue(dSCompilerClazz, "compilers"));
        try {
            org.apache.commons.math3.analysis.differentiation.DSCompiler[][] dSCompilerArray = new org.apache.commons.math3.analysis.differentiation.DSCompiler[2][];
            org.apache.commons.math3.analysis.differentiation.DSCompiler[] dSCompilerArray1 = {};
            dSCompilerArray[0] = dSCompilerArray1;
            dSCompilerArray[1] = ((org.apache.commons.math3.analysis.differentiation.DSCompiler[]) null);
            AtomicReference compilers = new AtomicReference(dSCompilerArray);
            setStaticField(dSCompilerClazz, "compilers", compilers);
            GaussNewtonOptimizer gaussNewtonOptimizer = ((GaussNewtonOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer"));
            double[] target = {};
            setField(gaussNewtonOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.MultivariateVectorOptimizer", "target", target);
            Array2DRowRealMatrix weightMatrix = ((Array2DRowRealMatrix) createInstance("org.apache.commons.math3.linear.Array2DRowRealMatrix"));
            double[][] data = new double[1][];
            double[] doubleArray = new double[16];
            data[0] = doubleArray;
            setField(weightMatrix, "org.apache.commons.math3.linear.Array2DRowRealMatrix", "data", data);
            setField(gaussNewtonOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.MultivariateVectorOptimizer", "weightMatrix", weightMatrix);
            GradientFunction model = ((GradientFunction) createInstance("org.apache.commons.math3.analysis.differentiation.GradientFunction"));
            setField(gaussNewtonOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.MultivariateVectorOptimizer", "model", model);
            double[] start = {0.0, 0.0};
            setField(gaussNewtonOptimizer, "org.apache.commons.math3.optim.BaseMultivariateOptimizer", "start", start);
            Incrementor evaluations = ((Incrementor) createInstance("org.apache.commons.math3.util.Incrementor"));
            setField(evaluations, "org.apache.commons.math3.util.Incrementor", "count", -2);
            setField(gaussNewtonOptimizer, "org.apache.commons.math3.optim.BaseOptimizer", "evaluations", evaluations);
            SimpleValueChecker checker = ((SimpleValueChecker) createInstance("org.apache.commons.math3.optim.SimpleValueChecker"));
            setField(gaussNewtonOptimizer, "org.apache.commons.math3.optim.BaseOptimizer", "checker", checker);
            
            /* This test fails because method [org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer.doOptimize] produces [java.lang.NullPointerException]
                org.apache.commons.math3.analysis.differentiation.DSCompiler.getCompiler(DSCompiler.java:211)
                org.apache.commons.math3.analysis.differentiation.DerivativeStructure.<init>(DerivativeStructure.java:88)
                org.apache.commons.math3.analysis.differentiation.DerivativeStructure.<init>(DerivativeStructure.java:100)
                org.apache.commons.math3.analysis.differentiation.DerivativeStructure.<init>(DerivativeStructure.java:119)
                org.apache.commons.math3.analysis.differentiation.GradientFunction.value(GradientFunction.java:47)
                org.apache.commons.math3.optim.nonlinear.vector.MultivariateVectorOptimizer.computeObjectiveValue(MultivariateVectorOptimizer.java:63)
                org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer.doOptimize(GaussNewtonOptimizer.java:113) */
            gaussNewtonOptimizer.doOptimize();
        } finally {
            setStaticField(DSCompiler.class, "compilers", prevCompilers);
        }
    }
    
    @Test
    public void testDoOptimize7() throws Exception  {
        Class dSCompilerClazz = Class.forName("org.apache.commons.math3.analysis.differentiation.DSCompiler");
        AtomicReference prevCompilers = ((AtomicReference) getStaticFieldValue(dSCompilerClazz, "compilers"));
        try {
            AtomicReference compilers = new AtomicReference(null);
            setStaticField(dSCompilerClazz, "compilers", compilers);
            GaussNewtonOptimizer gaussNewtonOptimizer = ((GaussNewtonOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer"));
            double[] target = {};
            setField(gaussNewtonOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.MultivariateVectorOptimizer", "target", target);
            Array2DRowRealMatrix weightMatrix = ((Array2DRowRealMatrix) createInstance("org.apache.commons.math3.linear.Array2DRowRealMatrix"));
            double[][] data = new double[1][];
            double[] doubleArray = {0.0};
            data[0] = doubleArray;
            setField(weightMatrix, "org.apache.commons.math3.linear.Array2DRowRealMatrix", "data", data);
            setField(gaussNewtonOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.MultivariateVectorOptimizer", "weightMatrix", weightMatrix);
            GradientFunction model = ((GradientFunction) createInstance("org.apache.commons.math3.analysis.differentiation.GradientFunction"));
            setField(gaussNewtonOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.MultivariateVectorOptimizer", "model", model);
            double[] start = {0.0, 0.0, 0.0};
            setField(gaussNewtonOptimizer, "org.apache.commons.math3.optim.BaseMultivariateOptimizer", "start", start);
            Incrementor evaluations = ((Incrementor) createInstance("org.apache.commons.math3.util.Incrementor"));
            setField(evaluations, "org.apache.commons.math3.util.Incrementor", "count", -2);
            setField(gaussNewtonOptimizer, "org.apache.commons.math3.optim.BaseOptimizer", "evaluations", evaluations);
            SimpleVectorValueChecker checker = ((SimpleVectorValueChecker) createInstance("org.apache.commons.math3.optim.SimpleVectorValueChecker"));
            setField(gaussNewtonOptimizer, "org.apache.commons.math3.optim.BaseOptimizer", "checker", checker);
            
            /* This test fails because method [org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer.doOptimize] produces [java.lang.NullPointerException]
                org.apache.commons.math3.analysis.differentiation.GradientFunction.value(GradientFunction.java:51)
                org.apache.commons.math3.optim.nonlinear.vector.MultivariateVectorOptimizer.computeObjectiveValue(MultivariateVectorOptimizer.java:63)
                org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer.doOptimize(GaussNewtonOptimizer.java:113) */
            gaussNewtonOptimizer.doOptimize();
        } finally {
            setStaticField(DSCompiler.class, "compilers", prevCompilers);
        }
    }
    
    @Test
    public void testDoOptimize8() throws Exception  {
        GaussNewtonOptimizer gaussNewtonOptimizer = ((GaussNewtonOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer"));
        double[] target = {1.2882494107455058E-231};
        setField(gaussNewtonOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.MultivariateVectorOptimizer", "target", target);
        Array2DRowRealMatrix weightMatrix = ((Array2DRowRealMatrix) createInstance("org.apache.commons.math3.linear.Array2DRowRealMatrix"));
        double[][] data = new double[1][];
        double[] doubleArray = {
            java.lang.Double.NaN, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0
        };
        data[0] = doubleArray;
        setField(weightMatrix, "org.apache.commons.math3.linear.Array2DRowRealMatrix", "data", data);
        setField(gaussNewtonOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.MultivariateVectorOptimizer", "weightMatrix", weightMatrix);
        Object model = createInstance("org.apache.commons.math3.optimization.fitting.CurveFitter$OldTheoreticalValuesFunction");
        PolynomialFitter this$0 = ((PolynomialFitter) createInstance("org.apache.commons.math3.optimization.fitting.PolynomialFitter"));
        ArrayList observations = new ArrayList();
        observations.add(null);
        observations.add(null);
        observations.add(null);
        setField(this$0, "org.apache.commons.math3.optimization.fitting.CurveFitter", "observations", observations);
        setField(model, "org.apache.commons.math3.optimization.fitting.CurveFitter$OldTheoreticalValuesFunction", "this$0", this$0);
        setField(gaussNewtonOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.MultivariateVectorOptimizer", "model", model);
        double[] start = {1.1125369292536007E-308, 1.780059086812237E-307};
        setField(gaussNewtonOptimizer, "org.apache.commons.math3.optim.BaseMultivariateOptimizer", "start", start);
        Incrementor evaluations = ((Incrementor) createInstance("org.apache.commons.math3.util.Incrementor"));
        setField(evaluations, "org.apache.commons.math3.util.Incrementor", "count", -2);
        setField(gaussNewtonOptimizer, "org.apache.commons.math3.optim.BaseOptimizer", "evaluations", evaluations);
        SimpleVectorValueChecker checker = ((SimpleVectorValueChecker) createInstance("org.apache.commons.math3.optim.SimpleVectorValueChecker"));
        setField(gaussNewtonOptimizer, "org.apache.commons.math3.optim.BaseOptimizer", "checker", checker);
        
        /* This test fails because method [org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer.doOptimize] produces [java.lang.NullPointerException]
            org.apache.commons.math3.optimization.fitting.CurveFitter$OldTheoreticalValuesFunction.value(CurveFitter.java:236)
            org.apache.commons.math3.optim.nonlinear.vector.MultivariateVectorOptimizer.computeObjectiveValue(MultivariateVectorOptimizer.java:63)
            org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer.doOptimize(GaussNewtonOptimizer.java:113) */
        gaussNewtonOptimizer.doOptimize();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer.checkParameters
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method checkParameters()
    
    /**
    @utbot.classUnderTest {@link GaussNewtonOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer#checkParameters()}
 * @utbot.executesCondition {@code (getLowerBound() != null): False}
 * @utbot.executesCondition {@code (getUpperBound() != null): False}
 * @utbot.invokes {@link org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer#getLowerBound()}
 * @utbot.invokes {@link org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer#getUpperBound()}
 *  */
    @Test
    public void testCheckParameters_GetUpperBoundEqualsNull() throws Exception  {
        GaussNewtonOptimizer gaussNewtonOptimizer = ((GaussNewtonOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer"));
        
        Class gaussNewtonOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer");
        Method checkParametersMethod = gaussNewtonOptimizerClazz.getDeclaredMethod("checkParameters");
        checkParametersMethod.setAccessible(true);
        java.lang.Object[] checkParametersMethodArguments = new java.lang.Object[0];
        checkParametersMethod.invoke(gaussNewtonOptimizer, checkParametersMethodArguments);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method checkParameters()
    
    /**
    @utbot.classUnderTest {@link GaussNewtonOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer#checkParameters()}
 * @utbot.executesCondition {@code (getLowerBound() != null): True}
 * @utbot.throwsException {@link org.apache.commons.math3.exception.MathUnsupportedOperationException} when: getLowerBound() != null || getUpperBound() != null
 *  */
    @Test(expected = MathUnsupportedOperationException.class)
    public void testCheckParameters_ThrowMathUnsupportedOperationException() throws Throwable  {
        GaussNewtonOptimizer gaussNewtonOptimizer = ((GaussNewtonOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer"));
        double[] lowerBound = {};
        setField(gaussNewtonOptimizer, "org.apache.commons.math3.optim.BaseMultivariateOptimizer", "lowerBound", lowerBound);
        
        Class gaussNewtonOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer");
        Method checkParametersMethod = gaussNewtonOptimizerClazz.getDeclaredMethod("checkParameters");
        checkParametersMethod.setAccessible(true);
        java.lang.Object[] checkParametersMethodArguments = new java.lang.Object[0];
        try {
            checkParametersMethod.invoke(gaussNewtonOptimizer, checkParametersMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link GaussNewtonOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer#checkParameters()}
 * @utbot.executesCondition {@code (getLowerBound() != null): False}
 * @utbot.executesCondition {@code (getUpperBound() != null): True}
 * @utbot.invokes {@link org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer#getUpperBound()}
 * @utbot.throwsException {@link org.apache.commons.math3.exception.MathUnsupportedOperationException} when: getLowerBound() != null || getUpperBound() != null
 *  */
    @Test(expected = MathUnsupportedOperationException.class)
    public void testCheckParameters_ThrowMathUnsupportedOperationException_1() throws Throwable  {
        GaussNewtonOptimizer gaussNewtonOptimizer = ((GaussNewtonOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer"));
        double[] upperBound = {};
        setField(gaussNewtonOptimizer, "org.apache.commons.math3.optim.BaseMultivariateOptimizer", "upperBound", upperBound);
        
        Class gaussNewtonOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer");
        Method checkParametersMethod = gaussNewtonOptimizerClazz.getDeclaredMethod("checkParameters");
        checkParametersMethod.setAccessible(true);
        java.lang.Object[] checkParametersMethodArguments = new java.lang.Object[0];
        try {
            checkParametersMethod.invoke(gaussNewtonOptimizer, checkParametersMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Util methods
    
    private static Object createInstance(String className) throws Exception {
        Class<?> clazz = Class.forName(className);
        return Class.forName("sun.misc.Unsafe").getDeclaredMethod("allocateInstance", Class.class)
            .invoke(getUnsafeInstance(), clazz);
    }
    
        private static void setField(Object object, String fieldClassName, String fieldName, Object fieldValue) throws ClassNotFoundException, NoSuchFieldException, NoSuchMethodException, IllegalAccessException, java.lang.reflect.InvocationTargetException {
        Class<?> clazz = Class.forName(fieldClassName);
        java.lang.reflect.Field field = clazz.getDeclaredField(fieldName);
    
        java.lang.reflect.Field modifiersField;
        
                java.lang.reflect.Method methodForGetDeclaredFields716042956380600 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields716042956380600.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass716042956386500 = (java.lang.reflect.Field[]) methodForGetDeclaredFields716042956380600.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass716042956386500).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
        modifiersField.setAccessible(true);
        modifiersField.setInt(field, field.getModifiers() & ~java.lang.reflect.Modifier.FINAL);
    
        field.setAccessible(true);
        field.set(object, fieldValue);
    }
    
    private static Object getStaticFieldValue(Class<?> clazz, String fieldName) throws IllegalAccessException, NoSuchFieldException {
        java.lang.reflect.Field field;
        Class<?> originClass = clazz;
        do {
            try {
                field = clazz.getDeclaredField(fieldName);
                field.setAccessible(true);
                
                java.lang.reflect.Field modifiersField;
                
            java.lang.reflect.Method methodForGetDeclaredFields716042957232000 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields716042957232000.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass716042957235700 = (java.lang.reflect.Field[]) methodForGetDeclaredFields716042957232000.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass716042957235700).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
                modifiersField.setAccessible(true);
                modifiersField.setInt(field, field.getModifiers() & ~java.lang.reflect.Modifier.FINAL);
                
                return field.get(null);
            } catch (NoSuchFieldException e) {
                clazz = clazz.getSuperclass();
            } catch (NoSuchMethodException e2) {
                e2.printStackTrace();
            } catch (java.lang.reflect.InvocationTargetException e3) {
                e3.printStackTrace();
            }
        } while (clazz != null);
    
        throw new NoSuchFieldException("Field '" + fieldName + "' not found on class " + originClass);
    }
    
    private static void setStaticField(Class<?> clazz, String fieldName, Object fieldValue) throws NoSuchFieldException, IllegalAccessException {
        java.lang.reflect.Field field;
    
        try {
        do {
            try {
                field = clazz.getDeclaredField(fieldName);
            } catch (Exception e) {
                clazz = clazz.getSuperclass();
                field = null;
            }
        } while (field == null);
        
        java.lang.reflect.Field modifiersField;
        
            java.lang.reflect.Method methodForGetDeclaredFields716042958566300 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields716042958566300.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass716042958569800 = (java.lang.reflect.Field[]) methodForGetDeclaredFields716042958566300.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass716042958569800).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
        modifiersField.setAccessible(true);
        modifiersField.setInt(field, field.getModifiers() & ~java.lang.reflect.Modifier.FINAL);
    
        field.setAccessible(true);
        field.set(null, fieldValue);
        }
        catch(java.lang.reflect.InvocationTargetException e){
            e.printStackTrace();
        }
        catch(NoSuchMethodException e2) {
            e2.printStackTrace();
        }
    }
    
    private static Object getUnsafeInstance() throws ClassNotFoundException, NoSuchFieldException, IllegalAccessException {
        java.lang.reflect.Field f = Class.forName("sun.misc.Unsafe").getDeclaredField("theUnsafe");
        f.setAccessible(true);
        return f.get(null);
    }
    ///endregion
}

