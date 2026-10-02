package org.apache.commons.math.optimization.direct;

import org.junit.Test;
import org.apache.commons.math.optimization.OptimizationException;
import org.apache.commons.math.optimization.RealPointValuePair;
import org.apache.commons.math.FunctionEvaluationException;
import org.apache.commons.math.optimization.LeastSquaresConverter;
import org.apache.commons.math.optimization.fitting.CurveFitter;
import java.util.ArrayList;
import org.apache.commons.math.linear.BlockRealMatrix;
import java.lang.reflect.Method;
import org.apache.commons.math.linear.Array2DRowRealMatrix;
import org.apache.commons.math.analysis.MultivariateRealFunction;
import org.apache.commons.math.linear.RealMatrix;
import org.apache.commons.math.linear.RealMatrixImpl;
import org.apache.commons.math.optimization.fitting.WeightedObservedPoint;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertFalse;
import static java.lang.reflect.Array.get;
import static org.junit.Assert.assertNull;

public final class org_apache_commons_math_optimization_direct_MultiDirectionalTest {
    ///region Test suites for executable org.apache.commons.math.optimization.direct.MultiDirectional.iterateSimplex
    
    ///region SYMBOLIC EXECUTION: CHECKED EXCEPTIONS for method iterateSimplex(java.util.Comparator)
    
    /**
    @utbot.classUnderTest {@link MultiDirectional}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.direct.MultiDirectional#iterateSimplex(java.util.Comparator)}
 * @utbot.throwsException {@link org.apache.commons.math.optimization.OptimizationException} in: incrementIterationsCounter();
 *  */
    @Test(expected = OptimizationException.class)
    public void testIterateSimplex_ThrowOptimizationException() throws Exception  {
        MultiDirectional multiDirectional = ((MultiDirectional) createInstance("org.apache.commons.math.optimization.direct.MultiDirectional"));
        
        multiDirectional.iterateSimplex(null);
    }
    
    /**
    @utbot.classUnderTest {@link MultiDirectional}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.direct.MultiDirectional#iterateSimplex(java.util.Comparator)}
 * @utbot.iterates iterate the loop {@code while(true)} once
 * @utbot.throwsException {@link org.apache.commons.math.FunctionEvaluationException} in: final RealPointValuePair reflected = evaluateNewSimplex(original, 1.0, comparator);
 *  */
    @Test(expected = FunctionEvaluationException.class)
    public void testIterateSimplex_ThrowFunctionEvaluationException() throws Exception  {
        MultiDirectional multiDirectional = ((MultiDirectional) createInstance("org.apache.commons.math.optimization.direct.MultiDirectional"));
        org.apache.commons.math.optimization.RealPointValuePair[] simplex = new org.apache.commons.math.optimization.RealPointValuePair[1];
        RealPointValuePair realPointValuePair = ((RealPointValuePair) createInstance("org.apache.commons.math.optimization.RealPointValuePair"));
        double[] point = {};
        setField(realPointValuePair, "org.apache.commons.math.optimization.RealPointValuePair", "point", point);
        setField(realPointValuePair, "org.apache.commons.math.optimization.RealPointValuePair", "value", java.lang.Double.NaN);
        simplex[0] = realPointValuePair;
        multiDirectional.simplex = simplex;
        multiDirectional.setMaxIterations(Integer.MIN_VALUE);
        setField(multiDirectional, "org.apache.commons.math.optimization.direct.DirectSearchOptimizer", "iterations", Integer.MAX_VALUE);
        
        multiDirectional.iterateSimplex(null);
    }
    
    /**
    @utbot.classUnderTest {@link MultiDirectional}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.direct.MultiDirectional#iterateSimplex(java.util.Comparator)}
 * @utbot.iterates iterate the loop {@code while(true)} once
 * @utbot.throwsException {@link org.apache.commons.math.FunctionEvaluationException} in: final RealPointValuePair reflected = evaluateNewSimplex(original, 1.0, comparator);
 *  */
    @Test(expected = FunctionEvaluationException.class)
    public void testIterateSimplex_ThrowFunctionEvaluationException_1() throws Exception  {
        MultiDirectional multiDirectional = ((MultiDirectional) createInstance("org.apache.commons.math.optimization.direct.MultiDirectional"));
        org.apache.commons.math.optimization.RealPointValuePair[] simplex = new org.apache.commons.math.optimization.RealPointValuePair[1];
        RealPointValuePair realPointValuePair = ((RealPointValuePair) createInstance("org.apache.commons.math.optimization.RealPointValuePair"));
        double[] point = {};
        setField(realPointValuePair, "org.apache.commons.math.optimization.RealPointValuePair", "point", point);
        setField(realPointValuePair, "org.apache.commons.math.optimization.RealPointValuePair", "value", java.lang.Double.NaN);
        simplex[0] = realPointValuePair;
        multiDirectional.simplex = simplex;
        LeastSquaresConverter f = ((LeastSquaresConverter) createInstance("org.apache.commons.math.optimization.LeastSquaresConverter"));
        Object function = createInstance("org.apache.commons.math.optimization.fitting.CurveFitter$TheoreticalValuesFunction");
        CurveFitter this$0 = ((CurveFitter) createInstance("org.apache.commons.math.optimization.fitting.CurveFitter"));
        ArrayList observations = new ArrayList();
        setField(this$0, "org.apache.commons.math.optimization.fitting.CurveFitter", "observations", observations);
        setField(function, "org.apache.commons.math.optimization.fitting.CurveFitter$TheoreticalValuesFunction", "this$0", this$0);
        setField(f, "org.apache.commons.math.optimization.LeastSquaresConverter", "function", function);
        double[] observations1 = {0.0};
        setField(f, "org.apache.commons.math.optimization.LeastSquaresConverter", "observations", observations1);
        setField(multiDirectional, "org.apache.commons.math.optimization.direct.DirectSearchOptimizer", "f", f);
        multiDirectional.setMaxIterations(Integer.MIN_VALUE);
        setField(multiDirectional, "org.apache.commons.math.optimization.direct.DirectSearchOptimizer", "iterations", Integer.MAX_VALUE);
        multiDirectional.setMaxEvaluations(Integer.MIN_VALUE);
        setField(multiDirectional, "org.apache.commons.math.optimization.direct.DirectSearchOptimizer", "evaluations", Integer.MAX_VALUE);
        
        multiDirectional.iterateSimplex(null);
    }
    ///endregion
    
    ///region Errors report for iterateSimplex
    
    public void testIterateSimplex_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Exception org.apache.commons.math.MathRuntimeException$4 is not accessible from package org.apache.commons.math.optimization.direct
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.optimization.direct.MultiDirectional.evaluateNewSimplex
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method evaluateNewSimplex([Lorg.apache.commons.math.optimization.RealPointValuePair;, double, java.util.Comparator)
    
    /**
    @utbot.classUnderTest {@link MultiDirectional}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.direct.MultiDirectional#evaluateNewSimplex(org.apache.commons.math.optimization.RealPointValuePair[],double,java.util.Comparator)}
 * @utbot.returnsFrom {@code return simplex[0];}
 *  */
    @Test
    public void testEvaluateNewSimplex_Return0OfSimplex() throws Exception  {
        MultiDirectional multiDirectional = ((MultiDirectional) createInstance("org.apache.commons.math.optimization.direct.MultiDirectional"));
        org.apache.commons.math.optimization.RealPointValuePair[] realPointValuePairArray = new org.apache.commons.math.optimization.RealPointValuePair[1];
        RealPointValuePair realPointValuePair = ((RealPointValuePair) createInstance("org.apache.commons.math.optimization.RealPointValuePair"));
        double[] point = {};
        setField(realPointValuePair, "org.apache.commons.math.optimization.RealPointValuePair", "point", point);
        setField(realPointValuePair, "org.apache.commons.math.optimization.RealPointValuePair", "value", -2.0000000000000004);
        realPointValuePairArray[0] = realPointValuePair;
        
        org.apache.commons.math.optimization.RealPointValuePair[] initialMultiDirectionalSimplex = multiDirectional.simplex;
        
        Class multiDirectionalClazz = Class.forName("org.apache.commons.math.optimization.direct.MultiDirectional");
        Class realPointValuePairArrayType = Class.forName("[Lorg.apache.commons.math.optimization.RealPointValuePair;");
        Class doubleType = double.class;
        Class comparatorType = Class.forName("java.util.Comparator");
        Method evaluateNewSimplexMethod = multiDirectionalClazz.getDeclaredMethod("evaluateNewSimplex", realPointValuePairArrayType, doubleType, comparatorType);
        evaluateNewSimplexMethod.setAccessible(true);
        java.lang.Object[] evaluateNewSimplexMethodArguments = new java.lang.Object[3];
        evaluateNewSimplexMethodArguments[0] = ((Object) realPointValuePairArray);
        evaluateNewSimplexMethodArguments[1] = java.lang.Double.NaN;
        evaluateNewSimplexMethodArguments[2] = ((Object) null);
        RealPointValuePair actual = ((RealPointValuePair) evaluateNewSimplexMethod.invoke(multiDirectional, evaluateNewSimplexMethodArguments));
        
        double[] realPointValuePairPoint = realPointValuePair.getPoint();
        double[] actualPoint = actual.getPoint();
        int realPointValuePairPointSize = realPointValuePairPoint.length;
        assertEquals(realPointValuePairPointSize, actualPoint.length);
        assertArrayEquals(realPointValuePairPoint, actualPoint, 1.0E-6);
        
        double realPointValuePairValue = realPointValuePair.getValue();
        double actualValue = actual.getValue();
        org.junit.Assert.assertEquals(realPointValuePairValue, actualValue, 1.0E-6);
        
        org.apache.commons.math.optimization.RealPointValuePair[] finalMultiDirectionalSimplex = multiDirectional.simplex;
        
        assertFalse(initialMultiDirectionalSimplex == finalMultiDirectionalSimplex);
    }
    
    /**
    @utbot.classUnderTest {@link MultiDirectional}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.direct.MultiDirectional#evaluateNewSimplex(org.apache.commons.math.optimization.RealPointValuePair[],double,java.util.Comparator)}
 * @utbot.returnsFrom {@code return simplex[0];}
 *  */
    @Test
    public void testEvaluateNewSimplex_Return0OfSimplex_1() throws Exception  {
        MultiDirectional multiDirectional = ((MultiDirectional) createInstance("org.apache.commons.math.optimization.direct.MultiDirectional"));
        org.apache.commons.math.optimization.RealPointValuePair[] simplex = {};
        multiDirectional.simplex = simplex;
        LeastSquaresConverter f = ((LeastSquaresConverter) createInstance("org.apache.commons.math.optimization.LeastSquaresConverter"));
        Object function = createInstance("org.apache.commons.math.optimization.fitting.CurveFitter$TheoreticalValuesFunction");
        CurveFitter this$0 = ((CurveFitter) createInstance("org.apache.commons.math.optimization.fitting.CurveFitter"));
        ArrayList observations = new ArrayList();
        setField(this$0, "org.apache.commons.math.optimization.fitting.CurveFitter", "observations", observations);
        setField(function, "org.apache.commons.math.optimization.fitting.CurveFitter$TheoreticalValuesFunction", "this$0", this$0);
        setField(f, "org.apache.commons.math.optimization.LeastSquaresConverter", "function", function);
        double[] observations1 = {};
        setField(f, "org.apache.commons.math.optimization.LeastSquaresConverter", "observations", observations1);
        Array2DRowRealMatrix scale = ((Array2DRowRealMatrix) createInstance("org.apache.commons.math.linear.Array2DRowRealMatrix"));
        double[][] data = {null};
        setField(scale, "org.apache.commons.math.linear.Array2DRowRealMatrix", "data", data);
        setField(f, "org.apache.commons.math.optimization.LeastSquaresConverter", "scale", scale);
        setField(multiDirectional, "org.apache.commons.math.optimization.direct.DirectSearchOptimizer", "f", f);
        multiDirectional.setMaxEvaluations(Integer.MIN_VALUE);
        setField(multiDirectional, "org.apache.commons.math.optimization.direct.DirectSearchOptimizer", "evaluations", Integer.MAX_VALUE);
        org.apache.commons.math.optimization.RealPointValuePair[] realPointValuePairArray = new org.apache.commons.math.optimization.RealPointValuePair[1];
        RealPointValuePair realPointValuePair = ((RealPointValuePair) createInstance("org.apache.commons.math.optimization.RealPointValuePair"));
        setField(realPointValuePair, "org.apache.commons.math.optimization.RealPointValuePair", "point", observations1);
        setField(realPointValuePair, "org.apache.commons.math.optimization.RealPointValuePair", "value", java.lang.Double.NaN);
        realPointValuePairArray[0] = realPointValuePair;
        
        org.apache.commons.math.optimization.RealPointValuePair[] initialMultiDirectionalSimplex = multiDirectional.simplex;
        
        Class multiDirectionalClazz = Class.forName("org.apache.commons.math.optimization.direct.MultiDirectional");
        Class realPointValuePairArrayType = Class.forName("[Lorg.apache.commons.math.optimization.RealPointValuePair;");
        Class doubleType = double.class;
        Class comparatorType = Class.forName("java.util.Comparator");
        Method evaluateNewSimplexMethod = multiDirectionalClazz.getDeclaredMethod("evaluateNewSimplex", realPointValuePairArrayType, doubleType, comparatorType);
        evaluateNewSimplexMethod.setAccessible(true);
        java.lang.Object[] evaluateNewSimplexMethodArguments = new java.lang.Object[3];
        evaluateNewSimplexMethodArguments[0] = ((Object) realPointValuePairArray);
        evaluateNewSimplexMethodArguments[1] = java.lang.Double.NaN;
        evaluateNewSimplexMethodArguments[2] = ((Object) null);
        RealPointValuePair actual = ((RealPointValuePair) evaluateNewSimplexMethod.invoke(multiDirectional, evaluateNewSimplexMethodArguments));
        
        RealPointValuePair expected = ((RealPointValuePair) createInstance("org.apache.commons.math.optimization.RealPointValuePair"));
        setField(expected, "org.apache.commons.math.optimization.RealPointValuePair", "point", observations1);
        setField(expected, "org.apache.commons.math.optimization.RealPointValuePair", "value", 0.0);
        
        double[] expectedPoint = expected.getPoint();
        double[] actualPoint = actual.getPoint();
        int expectedPointSize = expectedPoint.length;
        assertEquals(expectedPointSize, actualPoint.length);
        assertArrayEquals(expectedPoint, actualPoint, 1.0E-6);
        
        double expectedValue = expected.getValue();
        double actualValue = actual.getValue();
        org.junit.Assert.assertEquals(expectedValue, actualValue, 1.0E-6);
        
        org.apache.commons.math.optimization.RealPointValuePair[] finalMultiDirectionalSimplex = multiDirectional.simplex;
        MultivariateRealFunction multiDirectionalF = ((MultivariateRealFunction) getFieldValue(multiDirectional, "org.apache.commons.math.optimization.direct.DirectSearchOptimizer", "f"));
        RealMatrix multiDirectionalFFScale = ((RealMatrix) getFieldValue(multiDirectionalF, "org.apache.commons.math.optimization.LeastSquaresConverter", "scale"));
        double[][] multiDirectionalFFScaleFScaleData = ((double[][]) getFieldValue(multiDirectionalFFScale, "org.apache.commons.math.linear.Array2DRowRealMatrix", "data"));
        double[] finalMultiDirectionalFScaleData0 = ((double[]) get(multiDirectionalFFScaleFScaleData, 0));
        int finalMultiDirectionalEvaluations = ((Integer) getFieldValue(multiDirectional, "org.apache.commons.math.optimization.direct.DirectSearchOptimizer", "evaluations"));
        
        assertFalse(initialMultiDirectionalSimplex == finalMultiDirectionalSimplex);
        
        assertNull(finalMultiDirectionalFScaleData0);
        
        assertEquals(Integer.MIN_VALUE, finalMultiDirectionalEvaluations);
    }
    
    /**
    @utbot.classUnderTest {@link MultiDirectional}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.direct.MultiDirectional#evaluateNewSimplex(org.apache.commons.math.optimization.RealPointValuePair[],double,java.util.Comparator)}
 * @utbot.returnsFrom {@code return simplex[0];}
 *  */
    @Test
    public void testEvaluateNewSimplex_Return0OfSimplex_2() throws Exception  {
        MultiDirectional multiDirectional = ((MultiDirectional) createInstance("org.apache.commons.math.optimization.direct.MultiDirectional"));
        org.apache.commons.math.optimization.RealPointValuePair[] simplex = {null};
        multiDirectional.simplex = simplex;
        LeastSquaresConverter f = ((LeastSquaresConverter) createInstance("org.apache.commons.math.optimization.LeastSquaresConverter"));
        Object function = createInstance("org.apache.commons.math.optimization.fitting.CurveFitter$TheoreticalValuesFunction");
        CurveFitter this$0 = ((CurveFitter) createInstance("org.apache.commons.math.optimization.fitting.CurveFitter"));
        ArrayList observations = new ArrayList();
        setField(this$0, "org.apache.commons.math.optimization.fitting.CurveFitter", "observations", observations);
        setField(function, "org.apache.commons.math.optimization.fitting.CurveFitter$TheoreticalValuesFunction", "this$0", this$0);
        setField(f, "org.apache.commons.math.optimization.LeastSquaresConverter", "function", function);
        double[] observations1 = {};
        setField(f, "org.apache.commons.math.optimization.LeastSquaresConverter", "observations", observations1);
        Array2DRowRealMatrix scale = ((Array2DRowRealMatrix) createInstance("org.apache.commons.math.linear.Array2DRowRealMatrix"));
        setField(f, "org.apache.commons.math.optimization.LeastSquaresConverter", "scale", scale);
        setField(multiDirectional, "org.apache.commons.math.optimization.direct.DirectSearchOptimizer", "f", f);
        multiDirectional.setMaxEvaluations(Integer.MIN_VALUE);
        setField(multiDirectional, "org.apache.commons.math.optimization.direct.DirectSearchOptimizer", "evaluations", Integer.MAX_VALUE);
        org.apache.commons.math.optimization.RealPointValuePair[] realPointValuePairArray = new org.apache.commons.math.optimization.RealPointValuePair[1];
        RealPointValuePair realPointValuePair = ((RealPointValuePair) createInstance("org.apache.commons.math.optimization.RealPointValuePair"));
        setField(realPointValuePair, "org.apache.commons.math.optimization.RealPointValuePair", "point", observations1);
        setField(realPointValuePair, "org.apache.commons.math.optimization.RealPointValuePair", "value", java.lang.Double.NaN);
        realPointValuePairArray[0] = realPointValuePair;
        
        org.apache.commons.math.optimization.RealPointValuePair[] initialMultiDirectionalSimplex = multiDirectional.simplex;
        
        Class multiDirectionalClazz = Class.forName("org.apache.commons.math.optimization.direct.MultiDirectional");
        Class realPointValuePairArrayType = Class.forName("[Lorg.apache.commons.math.optimization.RealPointValuePair;");
        Class doubleType = double.class;
        Class comparatorType = Class.forName("java.util.Comparator");
        Method evaluateNewSimplexMethod = multiDirectionalClazz.getDeclaredMethod("evaluateNewSimplex", realPointValuePairArrayType, doubleType, comparatorType);
        evaluateNewSimplexMethod.setAccessible(true);
        java.lang.Object[] evaluateNewSimplexMethodArguments = new java.lang.Object[3];
        evaluateNewSimplexMethodArguments[0] = ((Object) realPointValuePairArray);
        evaluateNewSimplexMethodArguments[1] = java.lang.Double.NaN;
        evaluateNewSimplexMethodArguments[2] = ((Object) null);
        RealPointValuePair actual = ((RealPointValuePair) evaluateNewSimplexMethod.invoke(multiDirectional, evaluateNewSimplexMethodArguments));
        
        RealPointValuePair expected = ((RealPointValuePair) createInstance("org.apache.commons.math.optimization.RealPointValuePair"));
        setField(expected, "org.apache.commons.math.optimization.RealPointValuePair", "point", observations1);
        setField(expected, "org.apache.commons.math.optimization.RealPointValuePair", "value", 0.0);
        
        double[] expectedPoint = expected.getPoint();
        double[] actualPoint = actual.getPoint();
        int expectedPointSize = expectedPoint.length;
        assertEquals(expectedPointSize, actualPoint.length);
        assertArrayEquals(expectedPoint, actualPoint, 1.0E-6);
        
        double expectedValue = expected.getValue();
        double actualValue = actual.getValue();
        org.junit.Assert.assertEquals(expectedValue, actualValue, 1.0E-6);
        
        org.apache.commons.math.optimization.RealPointValuePair[] finalMultiDirectionalSimplex = multiDirectional.simplex;
        int finalMultiDirectionalEvaluations = ((Integer) getFieldValue(multiDirectional, "org.apache.commons.math.optimization.direct.DirectSearchOptimizer", "evaluations"));
        
        assertFalse(initialMultiDirectionalSimplex == finalMultiDirectionalSimplex);
        
        assertEquals(Integer.MIN_VALUE, finalMultiDirectionalEvaluations);
    }
    
    /**
    @utbot.classUnderTest {@link MultiDirectional}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.direct.MultiDirectional#evaluateNewSimplex(org.apache.commons.math.optimization.RealPointValuePair[],double,java.util.Comparator)}
 * @utbot.returnsFrom {@code return simplex[0];}
 *  */
    @Test
    public void testEvaluateNewSimplex_Return0OfSimplex_3() throws Exception  {
        MultiDirectional multiDirectional = ((MultiDirectional) createInstance("org.apache.commons.math.optimization.direct.MultiDirectional"));
        LeastSquaresConverter f = ((LeastSquaresConverter) createInstance("org.apache.commons.math.optimization.LeastSquaresConverter"));
        Object function = createInstance("org.apache.commons.math.optimization.fitting.CurveFitter$TheoreticalValuesFunction");
        CurveFitter this$0 = ((CurveFitter) createInstance("org.apache.commons.math.optimization.fitting.CurveFitter"));
        ArrayList observations = new ArrayList();
        setField(this$0, "org.apache.commons.math.optimization.fitting.CurveFitter", "observations", observations);
        setField(function, "org.apache.commons.math.optimization.fitting.CurveFitter$TheoreticalValuesFunction", "this$0", this$0);
        setField(f, "org.apache.commons.math.optimization.LeastSquaresConverter", "function", function);
        double[] observations1 = {};
        setField(f, "org.apache.commons.math.optimization.LeastSquaresConverter", "observations", observations1);
        RealMatrixImpl scale = ((RealMatrixImpl) createInstance("org.apache.commons.math.linear.RealMatrixImpl"));
        double[][] data = {null};
        setField(scale, "org.apache.commons.math.linear.RealMatrixImpl", "data", data);
        setField(f, "org.apache.commons.math.optimization.LeastSquaresConverter", "scale", scale);
        setField(multiDirectional, "org.apache.commons.math.optimization.direct.DirectSearchOptimizer", "f", f);
        multiDirectional.setMaxEvaluations(Integer.MIN_VALUE);
        setField(multiDirectional, "org.apache.commons.math.optimization.direct.DirectSearchOptimizer", "evaluations", Integer.MAX_VALUE);
        org.apache.commons.math.optimization.RealPointValuePair[] realPointValuePairArray = new org.apache.commons.math.optimization.RealPointValuePair[1];
        RealPointValuePair realPointValuePair = ((RealPointValuePair) createInstance("org.apache.commons.math.optimization.RealPointValuePair"));
        setField(realPointValuePair, "org.apache.commons.math.optimization.RealPointValuePair", "point", observations1);
        setField(realPointValuePair, "org.apache.commons.math.optimization.RealPointValuePair", "value", java.lang.Double.NaN);
        realPointValuePairArray[0] = realPointValuePair;
        
        org.apache.commons.math.optimization.RealPointValuePair[] initialMultiDirectionalSimplex = multiDirectional.simplex;
        
        Class multiDirectionalClazz = Class.forName("org.apache.commons.math.optimization.direct.MultiDirectional");
        Class realPointValuePairArrayType = Class.forName("[Lorg.apache.commons.math.optimization.RealPointValuePair;");
        Class doubleType = double.class;
        Class comparatorType = Class.forName("java.util.Comparator");
        Method evaluateNewSimplexMethod = multiDirectionalClazz.getDeclaredMethod("evaluateNewSimplex", realPointValuePairArrayType, doubleType, comparatorType);
        evaluateNewSimplexMethod.setAccessible(true);
        java.lang.Object[] evaluateNewSimplexMethodArguments = new java.lang.Object[3];
        evaluateNewSimplexMethodArguments[0] = ((Object) realPointValuePairArray);
        evaluateNewSimplexMethodArguments[1] = java.lang.Double.NaN;
        evaluateNewSimplexMethodArguments[2] = ((Object) null);
        RealPointValuePair actual = ((RealPointValuePair) evaluateNewSimplexMethod.invoke(multiDirectional, evaluateNewSimplexMethodArguments));
        
        RealPointValuePair expected = ((RealPointValuePair) createInstance("org.apache.commons.math.optimization.RealPointValuePair"));
        setField(expected, "org.apache.commons.math.optimization.RealPointValuePair", "point", observations1);
        setField(expected, "org.apache.commons.math.optimization.RealPointValuePair", "value", 0.0);
        
        double[] expectedPoint = expected.getPoint();
        double[] actualPoint = actual.getPoint();
        int expectedPointSize = expectedPoint.length;
        assertEquals(expectedPointSize, actualPoint.length);
        assertArrayEquals(expectedPoint, actualPoint, 1.0E-6);
        
        double expectedValue = expected.getValue();
        double actualValue = actual.getValue();
        org.junit.Assert.assertEquals(expectedValue, actualValue, 1.0E-6);
        
        org.apache.commons.math.optimization.RealPointValuePair[] finalMultiDirectionalSimplex = multiDirectional.simplex;
        MultivariateRealFunction multiDirectionalF = ((MultivariateRealFunction) getFieldValue(multiDirectional, "org.apache.commons.math.optimization.direct.DirectSearchOptimizer", "f"));
        RealMatrix multiDirectionalFFScale = ((RealMatrix) getFieldValue(multiDirectionalF, "org.apache.commons.math.optimization.LeastSquaresConverter", "scale"));
        double[][] multiDirectionalFFScaleFScaleData = ((double[][]) getFieldValue(multiDirectionalFFScale, "org.apache.commons.math.linear.RealMatrixImpl", "data"));
        double[] finalMultiDirectionalFScaleData0 = ((double[]) get(multiDirectionalFFScaleFScaleData, 0));
        int finalMultiDirectionalEvaluations = ((Integer) getFieldValue(multiDirectional, "org.apache.commons.math.optimization.direct.DirectSearchOptimizer", "evaluations"));
        
        assertFalse(initialMultiDirectionalSimplex == finalMultiDirectionalSimplex);
        
        assertNull(finalMultiDirectionalFScaleData0);
        
        assertEquals(Integer.MIN_VALUE, finalMultiDirectionalEvaluations);
    }
    
    /**
    @utbot.classUnderTest {@link MultiDirectional}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.direct.MultiDirectional#evaluateNewSimplex(org.apache.commons.math.optimization.RealPointValuePair[],double,java.util.Comparator)}
 * @utbot.returnsFrom {@code return simplex[0];}
 *  */
    @Test
    public void testEvaluateNewSimplex_Return0OfSimplex_4() throws Exception  {
        MultiDirectional multiDirectional = ((MultiDirectional) createInstance("org.apache.commons.math.optimization.direct.MultiDirectional"));
        org.apache.commons.math.optimization.RealPointValuePair[] simplex = {null};
        multiDirectional.simplex = simplex;
        LeastSquaresConverter f = ((LeastSquaresConverter) createInstance("org.apache.commons.math.optimization.LeastSquaresConverter"));
        Object function = createInstance("org.apache.commons.math.optimization.fitting.CurveFitter$TheoreticalValuesFunction");
        CurveFitter this$0 = ((CurveFitter) createInstance("org.apache.commons.math.optimization.fitting.CurveFitter"));
        ArrayList observations = new ArrayList();
        setField(this$0, "org.apache.commons.math.optimization.fitting.CurveFitter", "observations", observations);
        setField(function, "org.apache.commons.math.optimization.fitting.CurveFitter$TheoreticalValuesFunction", "this$0", this$0);
        setField(f, "org.apache.commons.math.optimization.LeastSquaresConverter", "function", function);
        double[] observations1 = {};
        setField(f, "org.apache.commons.math.optimization.LeastSquaresConverter", "observations", observations1);
        RealMatrixImpl scale = ((RealMatrixImpl) createInstance("org.apache.commons.math.linear.RealMatrixImpl"));
        setField(f, "org.apache.commons.math.optimization.LeastSquaresConverter", "scale", scale);
        setField(multiDirectional, "org.apache.commons.math.optimization.direct.DirectSearchOptimizer", "f", f);
        multiDirectional.setMaxEvaluations(Integer.MIN_VALUE);
        setField(multiDirectional, "org.apache.commons.math.optimization.direct.DirectSearchOptimizer", "evaluations", Integer.MAX_VALUE);
        org.apache.commons.math.optimization.RealPointValuePair[] realPointValuePairArray = new org.apache.commons.math.optimization.RealPointValuePair[1];
        RealPointValuePair realPointValuePair = ((RealPointValuePair) createInstance("org.apache.commons.math.optimization.RealPointValuePair"));
        setField(realPointValuePair, "org.apache.commons.math.optimization.RealPointValuePair", "point", observations1);
        setField(realPointValuePair, "org.apache.commons.math.optimization.RealPointValuePair", "value", java.lang.Double.NaN);
        realPointValuePairArray[0] = realPointValuePair;
        
        org.apache.commons.math.optimization.RealPointValuePair[] initialMultiDirectionalSimplex = multiDirectional.simplex;
        
        Class multiDirectionalClazz = Class.forName("org.apache.commons.math.optimization.direct.MultiDirectional");
        Class realPointValuePairArrayType = Class.forName("[Lorg.apache.commons.math.optimization.RealPointValuePair;");
        Class doubleType = double.class;
        Class comparatorType = Class.forName("java.util.Comparator");
        Method evaluateNewSimplexMethod = multiDirectionalClazz.getDeclaredMethod("evaluateNewSimplex", realPointValuePairArrayType, doubleType, comparatorType);
        evaluateNewSimplexMethod.setAccessible(true);
        java.lang.Object[] evaluateNewSimplexMethodArguments = new java.lang.Object[3];
        evaluateNewSimplexMethodArguments[0] = ((Object) realPointValuePairArray);
        evaluateNewSimplexMethodArguments[1] = java.lang.Double.NaN;
        evaluateNewSimplexMethodArguments[2] = ((Object) null);
        RealPointValuePair actual = ((RealPointValuePair) evaluateNewSimplexMethod.invoke(multiDirectional, evaluateNewSimplexMethodArguments));
        
        RealPointValuePair expected = ((RealPointValuePair) createInstance("org.apache.commons.math.optimization.RealPointValuePair"));
        setField(expected, "org.apache.commons.math.optimization.RealPointValuePair", "point", observations1);
        setField(expected, "org.apache.commons.math.optimization.RealPointValuePair", "value", 0.0);
        
        double[] expectedPoint = expected.getPoint();
        double[] actualPoint = actual.getPoint();
        int expectedPointSize = expectedPoint.length;
        assertEquals(expectedPointSize, actualPoint.length);
        assertArrayEquals(expectedPoint, actualPoint, 1.0E-6);
        
        double expectedValue = expected.getValue();
        double actualValue = actual.getValue();
        org.junit.Assert.assertEquals(expectedValue, actualValue, 1.0E-6);
        
        org.apache.commons.math.optimization.RealPointValuePair[] finalMultiDirectionalSimplex = multiDirectional.simplex;
        int finalMultiDirectionalEvaluations = ((Integer) getFieldValue(multiDirectional, "org.apache.commons.math.optimization.direct.DirectSearchOptimizer", "evaluations"));
        
        assertFalse(initialMultiDirectionalSimplex == finalMultiDirectionalSimplex);
        
        assertEquals(Integer.MIN_VALUE, finalMultiDirectionalEvaluations);
    }
    
    /**
    @utbot.classUnderTest {@link MultiDirectional}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.direct.MultiDirectional#evaluateNewSimplex(org.apache.commons.math.optimization.RealPointValuePair[],double,java.util.Comparator)}
 * @utbot.returnsFrom {@code return simplex[0];}
 *  */
    @Test
    public void testEvaluateNewSimplex_Return0OfSimplex_5() throws Exception  {
        MultiDirectional multiDirectional = ((MultiDirectional) createInstance("org.apache.commons.math.optimization.direct.MultiDirectional"));
        LeastSquaresConverter f = ((LeastSquaresConverter) createInstance("org.apache.commons.math.optimization.LeastSquaresConverter"));
        Object function = createInstance("org.apache.commons.math.optimization.fitting.CurveFitter$TheoreticalValuesFunction");
        Object f1 = createInstance("org.apache.commons.math.optimization.fitting.PolynomialFitter$ParametricPolynomial");
        setField(function, "org.apache.commons.math.optimization.fitting.CurveFitter$TheoreticalValuesFunction", "f", f1);
        CurveFitter this$0 = ((CurveFitter) createInstance("org.apache.commons.math.optimization.fitting.CurveFitter"));
        ArrayList observations = new ArrayList();
        WeightedObservedPoint weightedObservedPoint = ((WeightedObservedPoint) createInstance("org.apache.commons.math.optimization.fitting.WeightedObservedPoint"));
        setField(weightedObservedPoint, "org.apache.commons.math.optimization.fitting.WeightedObservedPoint", "x", 0.0);
        observations.add(weightedObservedPoint);
        setField(this$0, "org.apache.commons.math.optimization.fitting.CurveFitter", "observations", observations);
        setField(function, "org.apache.commons.math.optimization.fitting.CurveFitter$TheoreticalValuesFunction", "this$0", this$0);
        setField(f, "org.apache.commons.math.optimization.LeastSquaresConverter", "function", function);
        double[] observations1 = {java.lang.Double.NaN};
        setField(f, "org.apache.commons.math.optimization.LeastSquaresConverter", "observations", observations1);
        setField(multiDirectional, "org.apache.commons.math.optimization.direct.DirectSearchOptimizer", "f", f);
        multiDirectional.setMaxEvaluations(Integer.MIN_VALUE);
        setField(multiDirectional, "org.apache.commons.math.optimization.direct.DirectSearchOptimizer", "evaluations", Integer.MAX_VALUE);
        org.apache.commons.math.optimization.RealPointValuePair[] realPointValuePairArray = new org.apache.commons.math.optimization.RealPointValuePair[1];
        RealPointValuePair realPointValuePair = ((RealPointValuePair) createInstance("org.apache.commons.math.optimization.RealPointValuePair"));
        double[] point = {};
        setField(realPointValuePair, "org.apache.commons.math.optimization.RealPointValuePair", "point", point);
        setField(realPointValuePair, "org.apache.commons.math.optimization.RealPointValuePair", "value", java.lang.Double.NaN);
        realPointValuePairArray[0] = realPointValuePair;
        
        org.apache.commons.math.optimization.RealPointValuePair[] initialMultiDirectionalSimplex = multiDirectional.simplex;
        
        Class multiDirectionalClazz = Class.forName("org.apache.commons.math.optimization.direct.MultiDirectional");
        Class realPointValuePairArrayType = Class.forName("[Lorg.apache.commons.math.optimization.RealPointValuePair;");
        Class doubleType = double.class;
        Class comparatorType = Class.forName("java.util.Comparator");
        Method evaluateNewSimplexMethod = multiDirectionalClazz.getDeclaredMethod("evaluateNewSimplex", realPointValuePairArrayType, doubleType, comparatorType);
        evaluateNewSimplexMethod.setAccessible(true);
        java.lang.Object[] evaluateNewSimplexMethodArguments = new java.lang.Object[3];
        evaluateNewSimplexMethodArguments[0] = ((Object) realPointValuePairArray);
        evaluateNewSimplexMethodArguments[1] = java.lang.Double.NaN;
        evaluateNewSimplexMethodArguments[2] = ((Object) null);
        RealPointValuePair actual = ((RealPointValuePair) evaluateNewSimplexMethod.invoke(multiDirectional, evaluateNewSimplexMethodArguments));
        
        RealPointValuePair expected = ((RealPointValuePair) createInstance("org.apache.commons.math.optimization.RealPointValuePair"));
        setField(expected, "org.apache.commons.math.optimization.RealPointValuePair", "point", point);
        setField(expected, "org.apache.commons.math.optimization.RealPointValuePair", "value", java.lang.Double.NaN);
        
        double[] expectedPoint = expected.getPoint();
        double[] actualPoint = actual.getPoint();
        int expectedPointSize = expectedPoint.length;
        assertEquals(expectedPointSize, actualPoint.length);
        assertArrayEquals(expectedPoint, actualPoint, 1.0E-6);
        
        double expectedValue = expected.getValue();
        double actualValue = actual.getValue();
        org.junit.Assert.assertEquals(expectedValue, actualValue, 1.0E-6);
        
        org.apache.commons.math.optimization.RealPointValuePair[] finalMultiDirectionalSimplex = multiDirectional.simplex;
        int finalMultiDirectionalEvaluations = ((Integer) getFieldValue(multiDirectional, "org.apache.commons.math.optimization.direct.DirectSearchOptimizer", "evaluations"));
        
        assertFalse(initialMultiDirectionalSimplex == finalMultiDirectionalSimplex);
        
        assertEquals(Integer.MIN_VALUE, finalMultiDirectionalEvaluations);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method evaluateNewSimplex([Lorg.apache.commons.math.optimization.RealPointValuePair;, double, java.util.Comparator)
    
    /**
    @utbot.classUnderTest {@link MultiDirectional}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.direct.MultiDirectional#evaluateNewSimplex(org.apache.commons.math.optimization.RealPointValuePair[],double,java.util.Comparator)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: final double[] xSmallest = original[0].getPointRef();
 *  */
    @Test
    public void testEvaluateNewSimplex_ThrowArrayIndexOutOfBoundsException_11() throws Throwable  {
        MultiDirectional multiDirectional = ((MultiDirectional) createInstance("org.apache.commons.math.optimization.direct.MultiDirectional"));
        org.apache.commons.math.optimization.RealPointValuePair[] realPointValuePairArray = {};
        
        /* This test fails because method [org.apache.commons.math.optimization.direct.MultiDirectional.evaluateNewSimplex] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.optimization.direct.MultiDirectional.evaluateNewSimplex(MultiDirectional.java:115) */
        Class multiDirectionalClazz = Class.forName("org.apache.commons.math.optimization.direct.MultiDirectional");
        Class realPointValuePairArrayType = Class.forName("[Lorg.apache.commons.math.optimization.RealPointValuePair;");
        Class doubleType = double.class;
        Class comparatorType = Class.forName("java.util.Comparator");
        Method evaluateNewSimplexMethod = multiDirectionalClazz.getDeclaredMethod("evaluateNewSimplex", realPointValuePairArrayType, doubleType, comparatorType);
        evaluateNewSimplexMethod.setAccessible(true);
        java.lang.Object[] evaluateNewSimplexMethodArguments = new java.lang.Object[3];
        evaluateNewSimplexMethodArguments[0] = ((Object) realPointValuePairArray);
        evaluateNewSimplexMethodArguments[1] = java.lang.Double.NaN;
        evaluateNewSimplexMethodArguments[2] = ((Object) null);
        try {
            evaluateNewSimplexMethod.invoke(multiDirectional, evaluateNewSimplexMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link MultiDirectional}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.direct.MultiDirectional#evaluateNewSimplex(org.apache.commons.math.optimization.RealPointValuePair[],double,java.util.Comparator)}
 * @utbot.iterates iterate the loop {@code for(int i = 1; i <= n; ++i)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: final double[] xOriginal = original[i].getPointRef();
 *  */
    @Test
    public void testEvaluateNewSimplex_ThrowArrayIndexOutOfBoundsException() throws Throwable  {
        MultiDirectional multiDirectional = ((MultiDirectional) createInstance("org.apache.commons.math.optimization.direct.MultiDirectional"));
        org.apache.commons.math.optimization.RealPointValuePair[] realPointValuePairArray = new org.apache.commons.math.optimization.RealPointValuePair[1];
        RealPointValuePair realPointValuePair = ((RealPointValuePair) createInstance("org.apache.commons.math.optimization.RealPointValuePair"));
        double[] point = {0.0};
        setField(realPointValuePair, "org.apache.commons.math.optimization.RealPointValuePair", "point", point);
        realPointValuePairArray[0] = realPointValuePair;
        
        /* This test fails because method [org.apache.commons.math.optimization.direct.MultiDirectional.evaluateNewSimplex] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math.optimization.direct.MultiDirectional.evaluateNewSimplex(MultiDirectional.java:122) */
        Class multiDirectionalClazz = Class.forName("org.apache.commons.math.optimization.direct.MultiDirectional");
        Class realPointValuePairArrayType = Class.forName("[Lorg.apache.commons.math.optimization.RealPointValuePair;");
        Class doubleType = double.class;
        Class comparatorType = Class.forName("java.util.Comparator");
        Method evaluateNewSimplexMethod = multiDirectionalClazz.getDeclaredMethod("evaluateNewSimplex", realPointValuePairArrayType, doubleType, comparatorType);
        evaluateNewSimplexMethod.setAccessible(true);
        java.lang.Object[] evaluateNewSimplexMethodArguments = new java.lang.Object[3];
        evaluateNewSimplexMethodArguments[0] = ((Object) realPointValuePairArray);
        evaluateNewSimplexMethodArguments[1] = java.lang.Double.NaN;
        evaluateNewSimplexMethodArguments[2] = ((Object) null);
        try {
            evaluateNewSimplexMethod.invoke(multiDirectional, evaluateNewSimplexMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link MultiDirectional}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.direct.MultiDirectional#evaluateNewSimplex(org.apache.commons.math.optimization.RealPointValuePair[],double,java.util.Comparator)}
 * @utbot.iterates iterate the loop {@code for(int i = 1; i <= n; ++i)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: xTransformed[j] = xSmallest[j] + coeff * (xSmallest[j] - xOriginal[j]);
 *  */
    @Test
    public void testEvaluateNewSimplex_ThrowArrayIndexOutOfBoundsException_1() throws Throwable  {
        MultiDirectional multiDirectional = ((MultiDirectional) createInstance("org.apache.commons.math.optimization.direct.MultiDirectional"));
        org.apache.commons.math.optimization.RealPointValuePair[] realPointValuePairArray = new org.apache.commons.math.optimization.RealPointValuePair[2];
        RealPointValuePair realPointValuePair = ((RealPointValuePair) createInstance("org.apache.commons.math.optimization.RealPointValuePair"));
        double[] point = {0.0};
        setField(realPointValuePair, "org.apache.commons.math.optimization.RealPointValuePair", "point", point);
        realPointValuePairArray[0] = realPointValuePair;
        RealPointValuePair realPointValuePair1 = ((RealPointValuePair) createInstance("org.apache.commons.math.optimization.RealPointValuePair"));
        double[] point1 = {};
        setField(realPointValuePair1, "org.apache.commons.math.optimization.RealPointValuePair", "point", point1);
        realPointValuePairArray[1] = realPointValuePair1;
        
        /* This test fails because method [org.apache.commons.math.optimization.direct.MultiDirectional.evaluateNewSimplex] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.optimization.direct.MultiDirectional.evaluateNewSimplex(MultiDirectional.java:125) */
        Class multiDirectionalClazz = Class.forName("org.apache.commons.math.optimization.direct.MultiDirectional");
        Class realPointValuePairArrayType = Class.forName("[Lorg.apache.commons.math.optimization.RealPointValuePair;");
        Class doubleType = double.class;
        Class comparatorType = Class.forName("java.util.Comparator");
        Method evaluateNewSimplexMethod = multiDirectionalClazz.getDeclaredMethod("evaluateNewSimplex", realPointValuePairArrayType, doubleType, comparatorType);
        evaluateNewSimplexMethod.setAccessible(true);
        java.lang.Object[] evaluateNewSimplexMethodArguments = new java.lang.Object[3];
        evaluateNewSimplexMethodArguments[0] = ((Object) realPointValuePairArray);
        evaluateNewSimplexMethodArguments[1] = java.lang.Double.NaN;
        evaluateNewSimplexMethodArguments[2] = ((Object) null);
        try {
            evaluateNewSimplexMethod.invoke(multiDirectional, evaluateNewSimplexMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link MultiDirectional}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.direct.MultiDirectional#evaluateNewSimplex(org.apache.commons.math.optimization.RealPointValuePair[],double,java.util.Comparator)}
 * @utbot.throwsException {@link java.lang.NegativeArraySizeException} in: evaluateSimplex(comparator);
 *  */
    @Test
    public void testEvaluateNewSimplex_ThrowNegativeArraySizeException() throws Throwable  {
        MultiDirectional multiDirectional = ((MultiDirectional) createInstance("org.apache.commons.math.optimization.direct.MultiDirectional"));
        LeastSquaresConverter f = ((LeastSquaresConverter) createInstance("org.apache.commons.math.optimization.LeastSquaresConverter"));
        Object function = createInstance("org.apache.commons.math.optimization.fitting.CurveFitter$TheoreticalValuesFunction");
        CurveFitter this$0 = ((CurveFitter) createInstance("org.apache.commons.math.optimization.fitting.CurveFitter"));
        ArrayList observations = new ArrayList();
        setField(this$0, "org.apache.commons.math.optimization.fitting.CurveFitter", "observations", observations);
        setField(function, "org.apache.commons.math.optimization.fitting.CurveFitter$TheoreticalValuesFunction", "this$0", this$0);
        setField(f, "org.apache.commons.math.optimization.LeastSquaresConverter", "function", function);
        double[] observations1 = {};
        setField(f, "org.apache.commons.math.optimization.LeastSquaresConverter", "observations", observations1);
        BlockRealMatrix scale = ((BlockRealMatrix) createInstance("org.apache.commons.math.linear.BlockRealMatrix"));
        setField(scale, "org.apache.commons.math.linear.BlockRealMatrix", "rows", Integer.MIN_VALUE);
        setField(f, "org.apache.commons.math.optimization.LeastSquaresConverter", "scale", scale);
        setField(multiDirectional, "org.apache.commons.math.optimization.direct.DirectSearchOptimizer", "f", f);
        multiDirectional.setMaxEvaluations(Integer.MIN_VALUE);
        setField(multiDirectional, "org.apache.commons.math.optimization.direct.DirectSearchOptimizer", "evaluations", Integer.MAX_VALUE);
        org.apache.commons.math.optimization.RealPointValuePair[] realPointValuePairArray = new org.apache.commons.math.optimization.RealPointValuePair[1];
        RealPointValuePair realPointValuePair = ((RealPointValuePair) createInstance("org.apache.commons.math.optimization.RealPointValuePair"));
        setField(realPointValuePair, "org.apache.commons.math.optimization.RealPointValuePair", "point", observations1);
        setField(realPointValuePair, "org.apache.commons.math.optimization.RealPointValuePair", "value", java.lang.Double.NaN);
        realPointValuePairArray[0] = realPointValuePair;
        
        /* This test fails because method [org.apache.commons.math.optimization.direct.MultiDirectional.evaluateNewSimplex] produces [java.lang.NegativeArraySizeException: -2147483648]
            org.apache.commons.math.linear.BlockRealMatrix.operate(BlockRealMatrix.java:1336)
            org.apache.commons.math.optimization.LeastSquaresConverter.value(LeastSquaresConverter.java:179)
            org.apache.commons.math.optimization.direct.DirectSearchOptimizer.evaluate(DirectSearchOptimizer.java:349)
            org.apache.commons.math.optimization.direct.DirectSearchOptimizer.evaluateSimplex(DirectSearchOptimizer.java:396)
            org.apache.commons.math.optimization.direct.MultiDirectional.evaluateNewSimplex(MultiDirectional.java:131) */
        Class multiDirectionalClazz = Class.forName("org.apache.commons.math.optimization.direct.MultiDirectional");
        Class realPointValuePairArrayType = Class.forName("[Lorg.apache.commons.math.optimization.RealPointValuePair;");
        Class doubleType = double.class;
        Class comparatorType = Class.forName("java.util.Comparator");
        Method evaluateNewSimplexMethod = multiDirectionalClazz.getDeclaredMethod("evaluateNewSimplex", realPointValuePairArrayType, doubleType, comparatorType);
        evaluateNewSimplexMethod.setAccessible(true);
        java.lang.Object[] evaluateNewSimplexMethodArguments = new java.lang.Object[3];
        evaluateNewSimplexMethodArguments[0] = ((Object) realPointValuePairArray);
        evaluateNewSimplexMethodArguments[1] = java.lang.Double.NaN;
        evaluateNewSimplexMethodArguments[2] = ((Object) null);
        try {
            evaluateNewSimplexMethod.invoke(multiDirectional, evaluateNewSimplexMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link MultiDirectional}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.direct.MultiDirectional#evaluateNewSimplex(org.apache.commons.math.optimization.RealPointValuePair[],double,java.util.Comparator)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} 
 *  */
    @Test
    public void testEvaluateNewSimplex_ThrowArrayIndexOutOfBoundsException_2() throws Throwable  {
        MultiDirectional multiDirectional = ((MultiDirectional) createInstance("org.apache.commons.math.optimization.direct.MultiDirectional"));
        LeastSquaresConverter f = ((LeastSquaresConverter) createInstance("org.apache.commons.math.optimization.LeastSquaresConverter"));
        Object function = createInstance("org.apache.commons.math.optimization.fitting.CurveFitter$TheoreticalValuesFunction");
        CurveFitter this$0 = ((CurveFitter) createInstance("org.apache.commons.math.optimization.fitting.CurveFitter"));
        ArrayList observations = new ArrayList();
        setField(this$0, "org.apache.commons.math.optimization.fitting.CurveFitter", "observations", observations);
        setField(function, "org.apache.commons.math.optimization.fitting.CurveFitter$TheoreticalValuesFunction", "this$0", this$0);
        setField(f, "org.apache.commons.math.optimization.LeastSquaresConverter", "function", function);
        double[] observations1 = {};
        setField(f, "org.apache.commons.math.optimization.LeastSquaresConverter", "observations", observations1);
        Array2DRowRealMatrix scale = ((Array2DRowRealMatrix) createInstance("org.apache.commons.math.linear.Array2DRowRealMatrix"));
        double[][] data = {};
        setField(scale, "org.apache.commons.math.linear.Array2DRowRealMatrix", "data", data);
        setField(f, "org.apache.commons.math.optimization.LeastSquaresConverter", "scale", scale);
        setField(multiDirectional, "org.apache.commons.math.optimization.direct.DirectSearchOptimizer", "f", f);
        multiDirectional.setMaxEvaluations(Integer.MIN_VALUE);
        setField(multiDirectional, "org.apache.commons.math.optimization.direct.DirectSearchOptimizer", "evaluations", Integer.MAX_VALUE);
        org.apache.commons.math.optimization.RealPointValuePair[] realPointValuePairArray = new org.apache.commons.math.optimization.RealPointValuePair[1];
        RealPointValuePair realPointValuePair = ((RealPointValuePair) createInstance("org.apache.commons.math.optimization.RealPointValuePair"));
        setField(realPointValuePair, "org.apache.commons.math.optimization.RealPointValuePair", "point", observations1);
        setField(realPointValuePair, "org.apache.commons.math.optimization.RealPointValuePair", "value", java.lang.Double.NaN);
        realPointValuePairArray[0] = realPointValuePair;
        
        /* This test fails because method [org.apache.commons.math.optimization.direct.MultiDirectional.evaluateNewSimplex] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.linear.Array2DRowRealMatrix.getColumnDimension(Array2DRowRealMatrix.java:410)
            org.apache.commons.math.linear.Array2DRowRealMatrix.operate(Array2DRowRealMatrix.java:418)
            org.apache.commons.math.optimization.LeastSquaresConverter.value(LeastSquaresConverter.java:179)
            org.apache.commons.math.optimization.direct.DirectSearchOptimizer.evaluate(DirectSearchOptimizer.java:349)
            org.apache.commons.math.optimization.direct.DirectSearchOptimizer.evaluateSimplex(DirectSearchOptimizer.java:396)
            org.apache.commons.math.optimization.direct.MultiDirectional.evaluateNewSimplex(MultiDirectional.java:131) */
        Class multiDirectionalClazz = Class.forName("org.apache.commons.math.optimization.direct.MultiDirectional");
        Class realPointValuePairArrayType = Class.forName("[Lorg.apache.commons.math.optimization.RealPointValuePair;");
        Class doubleType = double.class;
        Class comparatorType = Class.forName("java.util.Comparator");
        Method evaluateNewSimplexMethod = multiDirectionalClazz.getDeclaredMethod("evaluateNewSimplex", realPointValuePairArrayType, doubleType, comparatorType);
        evaluateNewSimplexMethod.setAccessible(true);
        java.lang.Object[] evaluateNewSimplexMethodArguments = new java.lang.Object[3];
        evaluateNewSimplexMethodArguments[0] = ((Object) realPointValuePairArray);
        evaluateNewSimplexMethodArguments[1] = java.lang.Double.NaN;
        evaluateNewSimplexMethodArguments[2] = ((Object) null);
        try {
            evaluateNewSimplexMethod.invoke(multiDirectional, evaluateNewSimplexMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link MultiDirectional}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.direct.MultiDirectional#evaluateNewSimplex(org.apache.commons.math.optimization.RealPointValuePair[],double,java.util.Comparator)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: evaluateSimplex(comparator);
 *  */
    @Test
    public void testEvaluateNewSimplex_ThrowArrayIndexOutOfBoundsException_3() throws Throwable  {
        MultiDirectional multiDirectional = ((MultiDirectional) createInstance("org.apache.commons.math.optimization.direct.MultiDirectional"));
        LeastSquaresConverter f = ((LeastSquaresConverter) createInstance("org.apache.commons.math.optimization.LeastSquaresConverter"));
        Object function = createInstance("org.apache.commons.math.optimization.fitting.CurveFitter$TheoreticalValuesFunction");
        CurveFitter this$0 = ((CurveFitter) createInstance("org.apache.commons.math.optimization.fitting.CurveFitter"));
        ArrayList observations = new ArrayList();
        setField(this$0, "org.apache.commons.math.optimization.fitting.CurveFitter", "observations", observations);
        setField(function, "org.apache.commons.math.optimization.fitting.CurveFitter$TheoreticalValuesFunction", "this$0", this$0);
        setField(f, "org.apache.commons.math.optimization.LeastSquaresConverter", "function", function);
        double[] observations1 = {};
        setField(f, "org.apache.commons.math.optimization.LeastSquaresConverter", "observations", observations1);
        BlockRealMatrix scale = ((BlockRealMatrix) createInstance("org.apache.commons.math.linear.BlockRealMatrix"));
        double[][] blocks = {};
        setField(scale, "org.apache.commons.math.linear.BlockRealMatrix", "blocks", blocks);
        setField(scale, "org.apache.commons.math.linear.BlockRealMatrix", "rows", 17);
        setField(scale, "org.apache.commons.math.linear.BlockRealMatrix", "blockRows", 1);
        setField(scale, "org.apache.commons.math.linear.BlockRealMatrix", "blockColumns", 1);
        setField(f, "org.apache.commons.math.optimization.LeastSquaresConverter", "scale", scale);
        setField(multiDirectional, "org.apache.commons.math.optimization.direct.DirectSearchOptimizer", "f", f);
        multiDirectional.setMaxEvaluations(Integer.MIN_VALUE);
        setField(multiDirectional, "org.apache.commons.math.optimization.direct.DirectSearchOptimizer", "evaluations", Integer.MAX_VALUE);
        org.apache.commons.math.optimization.RealPointValuePair[] realPointValuePairArray = new org.apache.commons.math.optimization.RealPointValuePair[1];
        RealPointValuePair realPointValuePair = ((RealPointValuePair) createInstance("org.apache.commons.math.optimization.RealPointValuePair"));
        setField(realPointValuePair, "org.apache.commons.math.optimization.RealPointValuePair", "point", observations1);
        setField(realPointValuePair, "org.apache.commons.math.optimization.RealPointValuePair", "value", java.lang.Double.NaN);
        realPointValuePairArray[0] = realPointValuePair;
        
        /* This test fails because method [org.apache.commons.math.optimization.direct.MultiDirectional.evaluateNewSimplex] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.linear.BlockRealMatrix.operate(BlockRealMatrix.java:1343)
            org.apache.commons.math.optimization.LeastSquaresConverter.value(LeastSquaresConverter.java:179)
            org.apache.commons.math.optimization.direct.DirectSearchOptimizer.evaluate(DirectSearchOptimizer.java:349)
            org.apache.commons.math.optimization.direct.DirectSearchOptimizer.evaluateSimplex(DirectSearchOptimizer.java:396)
            org.apache.commons.math.optimization.direct.MultiDirectional.evaluateNewSimplex(MultiDirectional.java:131) */
        Class multiDirectionalClazz = Class.forName("org.apache.commons.math.optimization.direct.MultiDirectional");
        Class realPointValuePairArrayType = Class.forName("[Lorg.apache.commons.math.optimization.RealPointValuePair;");
        Class doubleType = double.class;
        Class comparatorType = Class.forName("java.util.Comparator");
        Method evaluateNewSimplexMethod = multiDirectionalClazz.getDeclaredMethod("evaluateNewSimplex", realPointValuePairArrayType, doubleType, comparatorType);
        evaluateNewSimplexMethod.setAccessible(true);
        java.lang.Object[] evaluateNewSimplexMethodArguments = new java.lang.Object[3];
        evaluateNewSimplexMethodArguments[0] = ((Object) realPointValuePairArray);
        evaluateNewSimplexMethodArguments[1] = java.lang.Double.NaN;
        evaluateNewSimplexMethodArguments[2] = ((Object) null);
        try {
            evaluateNewSimplexMethod.invoke(multiDirectional, evaluateNewSimplexMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link MultiDirectional}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.direct.MultiDirectional#evaluateNewSimplex(org.apache.commons.math.optimization.RealPointValuePair[],double,java.util.Comparator)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} 
 *  */
    @Test
    public void testEvaluateNewSimplex_ThrowArrayIndexOutOfBoundsException_5() throws Throwable  {
        MultiDirectional multiDirectional = ((MultiDirectional) createInstance("org.apache.commons.math.optimization.direct.MultiDirectional"));
        LeastSquaresConverter f = ((LeastSquaresConverter) createInstance("org.apache.commons.math.optimization.LeastSquaresConverter"));
        Object function = createInstance("org.apache.commons.math.optimization.fitting.CurveFitter$TheoreticalValuesFunction");
        CurveFitter this$0 = ((CurveFitter) createInstance("org.apache.commons.math.optimization.fitting.CurveFitter"));
        ArrayList observations = new ArrayList();
        setField(this$0, "org.apache.commons.math.optimization.fitting.CurveFitter", "observations", observations);
        setField(function, "org.apache.commons.math.optimization.fitting.CurveFitter$TheoreticalValuesFunction", "this$0", this$0);
        setField(f, "org.apache.commons.math.optimization.LeastSquaresConverter", "function", function);
        double[] observations1 = {};
        setField(f, "org.apache.commons.math.optimization.LeastSquaresConverter", "observations", observations1);
        RealMatrixImpl scale = ((RealMatrixImpl) createInstance("org.apache.commons.math.linear.RealMatrixImpl"));
        double[][] data = {};
        setField(scale, "org.apache.commons.math.linear.RealMatrixImpl", "data", data);
        setField(f, "org.apache.commons.math.optimization.LeastSquaresConverter", "scale", scale);
        setField(multiDirectional, "org.apache.commons.math.optimization.direct.DirectSearchOptimizer", "f", f);
        multiDirectional.setMaxEvaluations(Integer.MIN_VALUE);
        setField(multiDirectional, "org.apache.commons.math.optimization.direct.DirectSearchOptimizer", "evaluations", Integer.MAX_VALUE);
        org.apache.commons.math.optimization.RealPointValuePair[] realPointValuePairArray = new org.apache.commons.math.optimization.RealPointValuePair[1];
        RealPointValuePair realPointValuePair = ((RealPointValuePair) createInstance("org.apache.commons.math.optimization.RealPointValuePair"));
        setField(realPointValuePair, "org.apache.commons.math.optimization.RealPointValuePair", "point", observations1);
        setField(realPointValuePair, "org.apache.commons.math.optimization.RealPointValuePair", "value", java.lang.Double.NaN);
        realPointValuePairArray[0] = realPointValuePair;
        
        /* This test fails because method [org.apache.commons.math.optimization.direct.MultiDirectional.evaluateNewSimplex] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.linear.RealMatrixImpl.getColumnDimension(RealMatrixImpl.java:412)
            org.apache.commons.math.linear.RealMatrixImpl.operate(RealMatrixImpl.java:420)
            org.apache.commons.math.optimization.LeastSquaresConverter.value(LeastSquaresConverter.java:179)
            org.apache.commons.math.optimization.direct.DirectSearchOptimizer.evaluate(DirectSearchOptimizer.java:349)
            org.apache.commons.math.optimization.direct.DirectSearchOptimizer.evaluateSimplex(DirectSearchOptimizer.java:396)
            org.apache.commons.math.optimization.direct.MultiDirectional.evaluateNewSimplex(MultiDirectional.java:131) */
        Class multiDirectionalClazz = Class.forName("org.apache.commons.math.optimization.direct.MultiDirectional");
        Class realPointValuePairArrayType = Class.forName("[Lorg.apache.commons.math.optimization.RealPointValuePair;");
        Class doubleType = double.class;
        Class comparatorType = Class.forName("java.util.Comparator");
        Method evaluateNewSimplexMethod = multiDirectionalClazz.getDeclaredMethod("evaluateNewSimplex", realPointValuePairArrayType, doubleType, comparatorType);
        evaluateNewSimplexMethod.setAccessible(true);
        java.lang.Object[] evaluateNewSimplexMethodArguments = new java.lang.Object[3];
        evaluateNewSimplexMethodArguments[0] = ((Object) realPointValuePairArray);
        evaluateNewSimplexMethodArguments[1] = java.lang.Double.NaN;
        evaluateNewSimplexMethodArguments[2] = ((Object) null);
        try {
            evaluateNewSimplexMethod.invoke(multiDirectional, evaluateNewSimplexMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link MultiDirectional}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.direct.MultiDirectional#evaluateNewSimplex(org.apache.commons.math.optimization.RealPointValuePair[],double,java.util.Comparator)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: evaluateSimplex(comparator);
 *  */
    @Test
    public void testEvaluateNewSimplex_ThrowArrayIndexOutOfBoundsException_9() throws Throwable  {
        MultiDirectional multiDirectional = ((MultiDirectional) createInstance("org.apache.commons.math.optimization.direct.MultiDirectional"));
        LeastSquaresConverter f = ((LeastSquaresConverter) createInstance("org.apache.commons.math.optimization.LeastSquaresConverter"));
        Object function = createInstance("org.apache.commons.math.optimization.fitting.CurveFitter$TheoreticalValuesFunction");
        Object f1 = createInstance("org.apache.commons.math.optimization.fitting.PolynomialFitter$ParametricPolynomial");
        setField(function, "org.apache.commons.math.optimization.fitting.CurveFitter$TheoreticalValuesFunction", "f", f1);
        CurveFitter this$0 = ((CurveFitter) createInstance("org.apache.commons.math.optimization.fitting.CurveFitter"));
        ArrayList observations = new ArrayList();
        WeightedObservedPoint weightedObservedPoint = ((WeightedObservedPoint) createInstance("org.apache.commons.math.optimization.fitting.WeightedObservedPoint"));
        setField(weightedObservedPoint, "org.apache.commons.math.optimization.fitting.WeightedObservedPoint", "x", 0.0);
        observations.add(weightedObservedPoint);
        observations.add(weightedObservedPoint);
        setField(this$0, "org.apache.commons.math.optimization.fitting.CurveFitter", "observations", observations);
        setField(function, "org.apache.commons.math.optimization.fitting.CurveFitter$TheoreticalValuesFunction", "this$0", this$0);
        setField(f, "org.apache.commons.math.optimization.LeastSquaresConverter", "function", function);
        double[] observations1 = {0.0, 0.0};
        setField(f, "org.apache.commons.math.optimization.LeastSquaresConverter", "observations", observations1);
        double[] weights = {0.0};
        setField(f, "org.apache.commons.math.optimization.LeastSquaresConverter", "weights", weights);
        setField(multiDirectional, "org.apache.commons.math.optimization.direct.DirectSearchOptimizer", "f", f);
        multiDirectional.setMaxEvaluations(Integer.MIN_VALUE);
        setField(multiDirectional, "org.apache.commons.math.optimization.direct.DirectSearchOptimizer", "evaluations", Integer.MAX_VALUE);
        org.apache.commons.math.optimization.RealPointValuePair[] realPointValuePairArray = new org.apache.commons.math.optimization.RealPointValuePair[1];
        RealPointValuePair realPointValuePair = ((RealPointValuePair) createInstance("org.apache.commons.math.optimization.RealPointValuePair"));
        double[] point = {};
        setField(realPointValuePair, "org.apache.commons.math.optimization.RealPointValuePair", "point", point);
        setField(realPointValuePair, "org.apache.commons.math.optimization.RealPointValuePair", "value", java.lang.Double.NaN);
        realPointValuePairArray[0] = realPointValuePair;
        
        /* This test fails because method [org.apache.commons.math.optimization.direct.MultiDirectional.evaluateNewSimplex] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math.optimization.LeastSquaresConverter.value(LeastSquaresConverter.java:176)
            org.apache.commons.math.optimization.direct.DirectSearchOptimizer.evaluate(DirectSearchOptimizer.java:349)
            org.apache.commons.math.optimization.direct.DirectSearchOptimizer.evaluateSimplex(DirectSearchOptimizer.java:396)
            org.apache.commons.math.optimization.direct.MultiDirectional.evaluateNewSimplex(MultiDirectional.java:131) */
        Class multiDirectionalClazz = Class.forName("org.apache.commons.math.optimization.direct.MultiDirectional");
        Class realPointValuePairArrayType = Class.forName("[Lorg.apache.commons.math.optimization.RealPointValuePair;");
        Class doubleType = double.class;
        Class comparatorType = Class.forName("java.util.Comparator");
        Method evaluateNewSimplexMethod = multiDirectionalClazz.getDeclaredMethod("evaluateNewSimplex", realPointValuePairArrayType, doubleType, comparatorType);
        evaluateNewSimplexMethod.setAccessible(true);
        java.lang.Object[] evaluateNewSimplexMethodArguments = new java.lang.Object[3];
        evaluateNewSimplexMethodArguments[0] = ((Object) realPointValuePairArray);
        evaluateNewSimplexMethodArguments[1] = java.lang.Double.NaN;
        evaluateNewSimplexMethodArguments[2] = ((Object) null);
        try {
            evaluateNewSimplexMethod.invoke(multiDirectional, evaluateNewSimplexMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link MultiDirectional}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.direct.MultiDirectional#evaluateNewSimplex(org.apache.commons.math.optimization.RealPointValuePair[],double,java.util.Comparator)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: evaluateSimplex(comparator);
 *  */
    @Test
    public void testEvaluateNewSimplex_ThrowArrayIndexOutOfBoundsException_6() throws Throwable  {
        MultiDirectional multiDirectional = ((MultiDirectional) createInstance("org.apache.commons.math.optimization.direct.MultiDirectional"));
        LeastSquaresConverter f = ((LeastSquaresConverter) createInstance("org.apache.commons.math.optimization.LeastSquaresConverter"));
        Object function = createInstance("org.apache.commons.math.optimization.fitting.CurveFitter$TheoreticalValuesFunction");
        Object f1 = createInstance("org.apache.commons.math.optimization.fitting.PolynomialFitter$ParametricPolynomial");
        setField(function, "org.apache.commons.math.optimization.fitting.CurveFitter$TheoreticalValuesFunction", "f", f1);
        CurveFitter this$0 = ((CurveFitter) createInstance("org.apache.commons.math.optimization.fitting.CurveFitter"));
        ArrayList observations = new ArrayList();
        WeightedObservedPoint weightedObservedPoint = ((WeightedObservedPoint) createInstance("org.apache.commons.math.optimization.fitting.WeightedObservedPoint"));
        setField(weightedObservedPoint, "org.apache.commons.math.optimization.fitting.WeightedObservedPoint", "x", 0.0);
        observations.add(weightedObservedPoint);
        setField(this$0, "org.apache.commons.math.optimization.fitting.CurveFitter", "observations", observations);
        setField(function, "org.apache.commons.math.optimization.fitting.CurveFitter$TheoreticalValuesFunction", "this$0", this$0);
        setField(f, "org.apache.commons.math.optimization.LeastSquaresConverter", "function", function);
        double[] observations1 = {0.0};
        setField(f, "org.apache.commons.math.optimization.LeastSquaresConverter", "observations", observations1);
        Array2DRowRealMatrix scale = ((Array2DRowRealMatrix) createInstance("org.apache.commons.math.linear.Array2DRowRealMatrix"));
        double[][] data = new double[2][];
        data[0] = observations1;
        double[] doubleArray = {};
        data[1] = doubleArray;
        setField(scale, "org.apache.commons.math.linear.Array2DRowRealMatrix", "data", data);
        setField(f, "org.apache.commons.math.optimization.LeastSquaresConverter", "scale", scale);
        setField(multiDirectional, "org.apache.commons.math.optimization.direct.DirectSearchOptimizer", "f", f);
        multiDirectional.setMaxEvaluations(Integer.MIN_VALUE);
        setField(multiDirectional, "org.apache.commons.math.optimization.direct.DirectSearchOptimizer", "evaluations", Integer.MAX_VALUE);
        org.apache.commons.math.optimization.RealPointValuePair[] realPointValuePairArray = new org.apache.commons.math.optimization.RealPointValuePair[1];
        RealPointValuePair realPointValuePair = ((RealPointValuePair) createInstance("org.apache.commons.math.optimization.RealPointValuePair"));
        setField(realPointValuePair, "org.apache.commons.math.optimization.RealPointValuePair", "point", doubleArray);
        setField(realPointValuePair, "org.apache.commons.math.optimization.RealPointValuePair", "value", java.lang.Double.NaN);
        realPointValuePairArray[0] = realPointValuePair;
        
        /* This test fails because method [org.apache.commons.math.optimization.direct.MultiDirectional.evaluateNewSimplex] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.linear.Array2DRowRealMatrix.operate(Array2DRowRealMatrix.java:429)
            org.apache.commons.math.optimization.LeastSquaresConverter.value(LeastSquaresConverter.java:179)
            org.apache.commons.math.optimization.direct.DirectSearchOptimizer.evaluate(DirectSearchOptimizer.java:349)
            org.apache.commons.math.optimization.direct.DirectSearchOptimizer.evaluateSimplex(DirectSearchOptimizer.java:396)
            org.apache.commons.math.optimization.direct.MultiDirectional.evaluateNewSimplex(MultiDirectional.java:131) */
        Class multiDirectionalClazz = Class.forName("org.apache.commons.math.optimization.direct.MultiDirectional");
        Class realPointValuePairArrayType = Class.forName("[Lorg.apache.commons.math.optimization.RealPointValuePair;");
        Class doubleType = double.class;
        Class comparatorType = Class.forName("java.util.Comparator");
        Method evaluateNewSimplexMethod = multiDirectionalClazz.getDeclaredMethod("evaluateNewSimplex", realPointValuePairArrayType, doubleType, comparatorType);
        evaluateNewSimplexMethod.setAccessible(true);
        java.lang.Object[] evaluateNewSimplexMethodArguments = new java.lang.Object[3];
        evaluateNewSimplexMethodArguments[0] = ((Object) realPointValuePairArray);
        evaluateNewSimplexMethodArguments[1] = java.lang.Double.NaN;
        evaluateNewSimplexMethodArguments[2] = ((Object) null);
        try {
            evaluateNewSimplexMethod.invoke(multiDirectional, evaluateNewSimplexMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link MultiDirectional}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.direct.MultiDirectional#evaluateNewSimplex(org.apache.commons.math.optimization.RealPointValuePair[],double,java.util.Comparator)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: evaluateSimplex(comparator);
 *  */
    @Test
    public void testEvaluateNewSimplex_ThrowArrayIndexOutOfBoundsException_7() throws Throwable  {
        MultiDirectional multiDirectional = ((MultiDirectional) createInstance("org.apache.commons.math.optimization.direct.MultiDirectional"));
        LeastSquaresConverter f = ((LeastSquaresConverter) createInstance("org.apache.commons.math.optimization.LeastSquaresConverter"));
        Object function = createInstance("org.apache.commons.math.optimization.fitting.CurveFitter$TheoreticalValuesFunction");
        Object f1 = createInstance("org.apache.commons.math.optimization.fitting.PolynomialFitter$ParametricPolynomial");
        setField(function, "org.apache.commons.math.optimization.fitting.CurveFitter$TheoreticalValuesFunction", "f", f1);
        CurveFitter this$0 = ((CurveFitter) createInstance("org.apache.commons.math.optimization.fitting.CurveFitter"));
        ArrayList observations = new ArrayList();
        WeightedObservedPoint weightedObservedPoint = ((WeightedObservedPoint) createInstance("org.apache.commons.math.optimization.fitting.WeightedObservedPoint"));
        setField(weightedObservedPoint, "org.apache.commons.math.optimization.fitting.WeightedObservedPoint", "x", 0.0);
        observations.add(weightedObservedPoint);
        setField(this$0, "org.apache.commons.math.optimization.fitting.CurveFitter", "observations", observations);
        setField(function, "org.apache.commons.math.optimization.fitting.CurveFitter$TheoreticalValuesFunction", "this$0", this$0);
        setField(f, "org.apache.commons.math.optimization.LeastSquaresConverter", "function", function);
        double[] observations1 = {0.0};
        setField(f, "org.apache.commons.math.optimization.LeastSquaresConverter", "observations", observations1);
        BlockRealMatrix scale = ((BlockRealMatrix) createInstance("org.apache.commons.math.linear.BlockRealMatrix"));
        double[][] blocks = new double[1][];
        double[] doubleArray = {};
        blocks[0] = doubleArray;
        setField(scale, "org.apache.commons.math.linear.BlockRealMatrix", "blocks", blocks);
        setField(scale, "org.apache.commons.math.linear.BlockRealMatrix", "rows", 1);
        setField(scale, "org.apache.commons.math.linear.BlockRealMatrix", "columns", 1);
        setField(scale, "org.apache.commons.math.linear.BlockRealMatrix", "blockRows", 1);
        setField(scale, "org.apache.commons.math.linear.BlockRealMatrix", "blockColumns", 1);
        setField(f, "org.apache.commons.math.optimization.LeastSquaresConverter", "scale", scale);
        setField(multiDirectional, "org.apache.commons.math.optimization.direct.DirectSearchOptimizer", "f", f);
        multiDirectional.setMaxEvaluations(Integer.MIN_VALUE);
        setField(multiDirectional, "org.apache.commons.math.optimization.direct.DirectSearchOptimizer", "evaluations", Integer.MAX_VALUE);
        org.apache.commons.math.optimization.RealPointValuePair[] realPointValuePairArray = new org.apache.commons.math.optimization.RealPointValuePair[1];
        RealPointValuePair realPointValuePair = ((RealPointValuePair) createInstance("org.apache.commons.math.optimization.RealPointValuePair"));
        setField(realPointValuePair, "org.apache.commons.math.optimization.RealPointValuePair", "point", doubleArray);
        setField(realPointValuePair, "org.apache.commons.math.optimization.RealPointValuePair", "value", java.lang.Double.NaN);
        realPointValuePairArray[0] = realPointValuePair;
        
        /* This test fails because method [org.apache.commons.math.optimization.direct.MultiDirectional.evaluateNewSimplex] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.linear.BlockRealMatrix.operate(BlockRealMatrix.java:1358)
            org.apache.commons.math.optimization.LeastSquaresConverter.value(LeastSquaresConverter.java:179)
            org.apache.commons.math.optimization.direct.DirectSearchOptimizer.evaluate(DirectSearchOptimizer.java:349)
            org.apache.commons.math.optimization.direct.DirectSearchOptimizer.evaluateSimplex(DirectSearchOptimizer.java:396)
            org.apache.commons.math.optimization.direct.MultiDirectional.evaluateNewSimplex(MultiDirectional.java:131) */
        Class multiDirectionalClazz = Class.forName("org.apache.commons.math.optimization.direct.MultiDirectional");
        Class realPointValuePairArrayType = Class.forName("[Lorg.apache.commons.math.optimization.RealPointValuePair;");
        Class doubleType = double.class;
        Class comparatorType = Class.forName("java.util.Comparator");
        Method evaluateNewSimplexMethod = multiDirectionalClazz.getDeclaredMethod("evaluateNewSimplex", realPointValuePairArrayType, doubleType, comparatorType);
        evaluateNewSimplexMethod.setAccessible(true);
        java.lang.Object[] evaluateNewSimplexMethodArguments = new java.lang.Object[3];
        evaluateNewSimplexMethodArguments[0] = ((Object) realPointValuePairArray);
        evaluateNewSimplexMethodArguments[1] = java.lang.Double.NaN;
        evaluateNewSimplexMethodArguments[2] = ((Object) null);
        try {
            evaluateNewSimplexMethod.invoke(multiDirectional, evaluateNewSimplexMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link MultiDirectional}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.direct.MultiDirectional#evaluateNewSimplex(org.apache.commons.math.optimization.RealPointValuePair[],double,java.util.Comparator)}
 * @utbot.iterates iterate the loop {@code for(int i = 1; i <= n; ++i)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} 
 *  */
    @Test
    public void testEvaluateNewSimplex_ThrowArrayIndexOutOfBoundsException_8() throws Throwable  {
        MultiDirectional multiDirectional = ((MultiDirectional) createInstance("org.apache.commons.math.optimization.direct.MultiDirectional"));
        org.apache.commons.math.optimization.RealPointValuePair[] simplex = {null};
        multiDirectional.simplex = simplex;
        LeastSquaresConverter f = ((LeastSquaresConverter) createInstance("org.apache.commons.math.optimization.LeastSquaresConverter"));
        Object function = createInstance("org.apache.commons.math.optimization.fitting.CurveFitter$TheoreticalValuesFunction");
        Object f1 = createInstance("org.apache.commons.math.optimization.fitting.HarmonicFitter$ParametricHarmonicFunction");
        setField(function, "org.apache.commons.math.optimization.fitting.CurveFitter$TheoreticalValuesFunction", "f", f1);
        CurveFitter this$0 = ((CurveFitter) createInstance("org.apache.commons.math.optimization.fitting.CurveFitter"));
        ArrayList observations = new ArrayList();
        WeightedObservedPoint weightedObservedPoint = ((WeightedObservedPoint) createInstance("org.apache.commons.math.optimization.fitting.WeightedObservedPoint"));
        setField(weightedObservedPoint, "org.apache.commons.math.optimization.fitting.WeightedObservedPoint", "x", 0.0);
        observations.add(weightedObservedPoint);
        observations.add(null);
        observations.add(null);
        setField(this$0, "org.apache.commons.math.optimization.fitting.CurveFitter", "observations", observations);
        setField(function, "org.apache.commons.math.optimization.fitting.CurveFitter$TheoreticalValuesFunction", "this$0", this$0);
        setField(f, "org.apache.commons.math.optimization.LeastSquaresConverter", "function", function);
        setField(multiDirectional, "org.apache.commons.math.optimization.direct.DirectSearchOptimizer", "f", f);
        multiDirectional.setMaxEvaluations(Integer.MIN_VALUE);
        setField(multiDirectional, "org.apache.commons.math.optimization.direct.DirectSearchOptimizer", "evaluations", Integer.MAX_VALUE);
        org.apache.commons.math.optimization.RealPointValuePair[] realPointValuePairArray = new org.apache.commons.math.optimization.RealPointValuePair[2];
        RealPointValuePair realPointValuePair = ((RealPointValuePair) createInstance("org.apache.commons.math.optimization.RealPointValuePair"));
        double[] point = {0.0};
        setField(realPointValuePair, "org.apache.commons.math.optimization.RealPointValuePair", "point", point);
        setField(realPointValuePair, "org.apache.commons.math.optimization.RealPointValuePair", "value", java.lang.Double.NaN);
        realPointValuePairArray[0] = realPointValuePair;
        RealPointValuePair realPointValuePair1 = ((RealPointValuePair) createInstance("org.apache.commons.math.optimization.RealPointValuePair"));
        double[] point1 = {0.0};
        setField(realPointValuePair1, "org.apache.commons.math.optimization.RealPointValuePair", "point", point1);
        realPointValuePairArray[1] = realPointValuePair1;
        
        /* This test fails because method [org.apache.commons.math.optimization.direct.MultiDirectional.evaluateNewSimplex] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math.optimization.fitting.HarmonicFitter$ParametricHarmonicFunction.value(HarmonicFitter.java:114)
            org.apache.commons.math.optimization.fitting.CurveFitter$TheoreticalValuesFunction.value(CurveFitter.java:183)
            org.apache.commons.math.optimization.LeastSquaresConverter.value(LeastSquaresConverter.java:162)
            org.apache.commons.math.optimization.direct.DirectSearchOptimizer.evaluate(DirectSearchOptimizer.java:349)
            org.apache.commons.math.optimization.direct.DirectSearchOptimizer.evaluateSimplex(DirectSearchOptimizer.java:396)
            org.apache.commons.math.optimization.direct.MultiDirectional.evaluateNewSimplex(MultiDirectional.java:131) */
        Class multiDirectionalClazz = Class.forName("org.apache.commons.math.optimization.direct.MultiDirectional");
        Class realPointValuePairArrayType = Class.forName("[Lorg.apache.commons.math.optimization.RealPointValuePair;");
        Class doubleType = double.class;
        Class comparatorType = Class.forName("java.util.Comparator");
        Method evaluateNewSimplexMethod = multiDirectionalClazz.getDeclaredMethod("evaluateNewSimplex", realPointValuePairArrayType, doubleType, comparatorType);
        evaluateNewSimplexMethod.setAccessible(true);
        java.lang.Object[] evaluateNewSimplexMethodArguments = new java.lang.Object[3];
        evaluateNewSimplexMethodArguments[0] = ((Object) realPointValuePairArray);
        evaluateNewSimplexMethodArguments[1] = java.lang.Double.NaN;
        evaluateNewSimplexMethodArguments[2] = ((Object) null);
        try {
            evaluateNewSimplexMethod.invoke(multiDirectional, evaluateNewSimplexMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link MultiDirectional}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.direct.MultiDirectional#evaluateNewSimplex(org.apache.commons.math.optimization.RealPointValuePair[],double,java.util.Comparator)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: evaluateSimplex(comparator);
 *  */
    @Test
    public void testEvaluateNewSimplex_ThrowArrayIndexOutOfBoundsException_10() throws Throwable  {
        MultiDirectional multiDirectional = ((MultiDirectional) createInstance("org.apache.commons.math.optimization.direct.MultiDirectional"));
        LeastSquaresConverter f = ((LeastSquaresConverter) createInstance("org.apache.commons.math.optimization.LeastSquaresConverter"));
        Object function = createInstance("org.apache.commons.math.optimization.fitting.CurveFitter$TheoreticalValuesFunction");
        Object f1 = createInstance("org.apache.commons.math.optimization.fitting.PolynomialFitter$ParametricPolynomial");
        setField(function, "org.apache.commons.math.optimization.fitting.CurveFitter$TheoreticalValuesFunction", "f", f1);
        CurveFitter this$0 = ((CurveFitter) createInstance("org.apache.commons.math.optimization.fitting.CurveFitter"));
        ArrayList observations = new ArrayList();
        WeightedObservedPoint weightedObservedPoint = ((WeightedObservedPoint) createInstance("org.apache.commons.math.optimization.fitting.WeightedObservedPoint"));
        setField(weightedObservedPoint, "org.apache.commons.math.optimization.fitting.WeightedObservedPoint", "x", 0.0);
        observations.add(weightedObservedPoint);
        setField(this$0, "org.apache.commons.math.optimization.fitting.CurveFitter", "observations", observations);
        setField(function, "org.apache.commons.math.optimization.fitting.CurveFitter$TheoreticalValuesFunction", "this$0", this$0);
        setField(f, "org.apache.commons.math.optimization.LeastSquaresConverter", "function", function);
        double[] observations1 = {0.0};
        setField(f, "org.apache.commons.math.optimization.LeastSquaresConverter", "observations", observations1);
        RealMatrixImpl scale = ((RealMatrixImpl) createInstance("org.apache.commons.math.linear.RealMatrixImpl"));
        double[][] data = new double[2][];
        data[0] = observations1;
        double[] doubleArray = {};
        data[1] = doubleArray;
        setField(scale, "org.apache.commons.math.linear.RealMatrixImpl", "data", data);
        setField(f, "org.apache.commons.math.optimization.LeastSquaresConverter", "scale", scale);
        setField(multiDirectional, "org.apache.commons.math.optimization.direct.DirectSearchOptimizer", "f", f);
        multiDirectional.setMaxEvaluations(Integer.MIN_VALUE);
        setField(multiDirectional, "org.apache.commons.math.optimization.direct.DirectSearchOptimizer", "evaluations", Integer.MAX_VALUE);
        org.apache.commons.math.optimization.RealPointValuePair[] realPointValuePairArray = new org.apache.commons.math.optimization.RealPointValuePair[1];
        RealPointValuePair realPointValuePair = ((RealPointValuePair) createInstance("org.apache.commons.math.optimization.RealPointValuePair"));
        setField(realPointValuePair, "org.apache.commons.math.optimization.RealPointValuePair", "point", doubleArray);
        setField(realPointValuePair, "org.apache.commons.math.optimization.RealPointValuePair", "value", java.lang.Double.NaN);
        realPointValuePairArray[0] = realPointValuePair;
        
        /* This test fails because method [org.apache.commons.math.optimization.direct.MultiDirectional.evaluateNewSimplex] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.linear.RealMatrixImpl.operate(RealMatrixImpl.java:431)
            org.apache.commons.math.optimization.LeastSquaresConverter.value(LeastSquaresConverter.java:179)
            org.apache.commons.math.optimization.direct.DirectSearchOptimizer.evaluate(DirectSearchOptimizer.java:349)
            org.apache.commons.math.optimization.direct.DirectSearchOptimizer.evaluateSimplex(DirectSearchOptimizer.java:396)
            org.apache.commons.math.optimization.direct.MultiDirectional.evaluateNewSimplex(MultiDirectional.java:131) */
        Class multiDirectionalClazz = Class.forName("org.apache.commons.math.optimization.direct.MultiDirectional");
        Class realPointValuePairArrayType = Class.forName("[Lorg.apache.commons.math.optimization.RealPointValuePair;");
        Class doubleType = double.class;
        Class comparatorType = Class.forName("java.util.Comparator");
        Method evaluateNewSimplexMethod = multiDirectionalClazz.getDeclaredMethod("evaluateNewSimplex", realPointValuePairArrayType, doubleType, comparatorType);
        evaluateNewSimplexMethod.setAccessible(true);
        java.lang.Object[] evaluateNewSimplexMethodArguments = new java.lang.Object[3];
        evaluateNewSimplexMethodArguments[0] = ((Object) realPointValuePairArray);
        evaluateNewSimplexMethodArguments[1] = java.lang.Double.NaN;
        evaluateNewSimplexMethodArguments[2] = ((Object) null);
        try {
            evaluateNewSimplexMethod.invoke(multiDirectional, evaluateNewSimplexMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link MultiDirectional}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.direct.MultiDirectional#evaluateNewSimplex(org.apache.commons.math.optimization.RealPointValuePair[],double,java.util.Comparator)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} 
 *  */
    @Test
    public void testEvaluateNewSimplex_ThrowArrayIndexOutOfBoundsException_4() throws Throwable  {
        MultiDirectional multiDirectional = ((MultiDirectional) createInstance("org.apache.commons.math.optimization.direct.MultiDirectional"));
        LeastSquaresConverter f = ((LeastSquaresConverter) createInstance("org.apache.commons.math.optimization.LeastSquaresConverter"));
        Object function = createInstance("org.apache.commons.math.optimization.fitting.CurveFitter$TheoreticalValuesFunction");
        Object f1 = createInstance("org.apache.commons.math.optimization.fitting.HarmonicFitter$ParametricHarmonicFunction");
        setField(function, "org.apache.commons.math.optimization.fitting.CurveFitter$TheoreticalValuesFunction", "f", f1);
        CurveFitter this$0 = ((CurveFitter) createInstance("org.apache.commons.math.optimization.fitting.CurveFitter"));
        ArrayList observations = new ArrayList();
        WeightedObservedPoint weightedObservedPoint = ((WeightedObservedPoint) createInstance("org.apache.commons.math.optimization.fitting.WeightedObservedPoint"));
        setField(weightedObservedPoint, "org.apache.commons.math.optimization.fitting.WeightedObservedPoint", "x", 0.0);
        observations.add(weightedObservedPoint);
        observations.add(null);
        observations.add(null);
        setField(this$0, "org.apache.commons.math.optimization.fitting.CurveFitter", "observations", observations);
        setField(function, "org.apache.commons.math.optimization.fitting.CurveFitter$TheoreticalValuesFunction", "this$0", this$0);
        setField(f, "org.apache.commons.math.optimization.LeastSquaresConverter", "function", function);
        setField(multiDirectional, "org.apache.commons.math.optimization.direct.DirectSearchOptimizer", "f", f);
        multiDirectional.setMaxEvaluations(Integer.MIN_VALUE);
        setField(multiDirectional, "org.apache.commons.math.optimization.direct.DirectSearchOptimizer", "evaluations", Integer.MAX_VALUE);
        org.apache.commons.math.optimization.RealPointValuePair[] realPointValuePairArray = new org.apache.commons.math.optimization.RealPointValuePair[1];
        RealPointValuePair realPointValuePair = ((RealPointValuePair) createInstance("org.apache.commons.math.optimization.RealPointValuePair"));
        double[] point = {};
        setField(realPointValuePair, "org.apache.commons.math.optimization.RealPointValuePair", "point", point);
        setField(realPointValuePair, "org.apache.commons.math.optimization.RealPointValuePair", "value", java.lang.Double.NaN);
        realPointValuePairArray[0] = realPointValuePair;
        
        /* This test fails because method [org.apache.commons.math.optimization.direct.MultiDirectional.evaluateNewSimplex] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.optimization.fitting.HarmonicFitter$ParametricHarmonicFunction.value(HarmonicFitter.java:113)
            org.apache.commons.math.optimization.fitting.CurveFitter$TheoreticalValuesFunction.value(CurveFitter.java:183)
            org.apache.commons.math.optimization.LeastSquaresConverter.value(LeastSquaresConverter.java:162)
            org.apache.commons.math.optimization.direct.DirectSearchOptimizer.evaluate(DirectSearchOptimizer.java:349)
            org.apache.commons.math.optimization.direct.DirectSearchOptimizer.evaluateSimplex(DirectSearchOptimizer.java:396)
            org.apache.commons.math.optimization.direct.MultiDirectional.evaluateNewSimplex(MultiDirectional.java:131) */
        Class multiDirectionalClazz = Class.forName("org.apache.commons.math.optimization.direct.MultiDirectional");
        Class realPointValuePairArrayType = Class.forName("[Lorg.apache.commons.math.optimization.RealPointValuePair;");
        Class doubleType = double.class;
        Class comparatorType = Class.forName("java.util.Comparator");
        Method evaluateNewSimplexMethod = multiDirectionalClazz.getDeclaredMethod("evaluateNewSimplex", realPointValuePairArrayType, doubleType, comparatorType);
        evaluateNewSimplexMethod.setAccessible(true);
        java.lang.Object[] evaluateNewSimplexMethodArguments = new java.lang.Object[3];
        evaluateNewSimplexMethodArguments[0] = ((Object) realPointValuePairArray);
        evaluateNewSimplexMethodArguments[1] = java.lang.Double.NaN;
        evaluateNewSimplexMethodArguments[2] = ((Object) null);
        try {
            evaluateNewSimplexMethod.invoke(multiDirectional, evaluateNewSimplexMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link MultiDirectional}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.direct.MultiDirectional#evaluateNewSimplex(org.apache.commons.math.optimization.RealPointValuePair[],double,java.util.Comparator)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: final double[] xSmallest = original[0].getPointRef();
 *  */
    @Test
    public void testEvaluateNewSimplex_ThrowNullPointerException_3() throws Throwable  {
        MultiDirectional multiDirectional = ((MultiDirectional) createInstance("org.apache.commons.math.optimization.direct.MultiDirectional"));
        org.apache.commons.math.optimization.RealPointValuePair[] realPointValuePairArray = {null};
        
        /* This test fails because method [org.apache.commons.math.optimization.direct.MultiDirectional.evaluateNewSimplex] produces [java.lang.NullPointerException]
            org.apache.commons.math.optimization.direct.MultiDirectional.evaluateNewSimplex(MultiDirectional.java:115) */
        Class multiDirectionalClazz = Class.forName("org.apache.commons.math.optimization.direct.MultiDirectional");
        Class realPointValuePairArrayType = Class.forName("[Lorg.apache.commons.math.optimization.RealPointValuePair;");
        Class doubleType = double.class;
        Class comparatorType = Class.forName("java.util.Comparator");
        Method evaluateNewSimplexMethod = multiDirectionalClazz.getDeclaredMethod("evaluateNewSimplex", realPointValuePairArrayType, doubleType, comparatorType);
        evaluateNewSimplexMethod.setAccessible(true);
        java.lang.Object[] evaluateNewSimplexMethodArguments = new java.lang.Object[3];
        evaluateNewSimplexMethodArguments[0] = ((Object) realPointValuePairArray);
        evaluateNewSimplexMethodArguments[1] = java.lang.Double.NaN;
        evaluateNewSimplexMethodArguments[2] = ((Object) null);
        try {
            evaluateNewSimplexMethod.invoke(multiDirectional, evaluateNewSimplexMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link MultiDirectional}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.direct.MultiDirectional#evaluateNewSimplex(org.apache.commons.math.optimization.RealPointValuePair[],double,java.util.Comparator)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: final int n = xSmallest.length;
 *  */
    @Test
    public void testEvaluateNewSimplex_ThrowNullPointerException_4() throws Throwable  {
        MultiDirectional multiDirectional = ((MultiDirectional) createInstance("org.apache.commons.math.optimization.direct.MultiDirectional"));
        org.apache.commons.math.optimization.RealPointValuePair[] realPointValuePairArray = new org.apache.commons.math.optimization.RealPointValuePair[1];
        RealPointValuePair realPointValuePair = ((RealPointValuePair) createInstance("org.apache.commons.math.optimization.RealPointValuePair"));
        realPointValuePairArray[0] = realPointValuePair;
        
        /* This test fails because method [org.apache.commons.math.optimization.direct.MultiDirectional.evaluateNewSimplex] produces [java.lang.NullPointerException]
            org.apache.commons.math.optimization.direct.MultiDirectional.evaluateNewSimplex(MultiDirectional.java:116) */
        Class multiDirectionalClazz = Class.forName("org.apache.commons.math.optimization.direct.MultiDirectional");
        Class realPointValuePairArrayType = Class.forName("[Lorg.apache.commons.math.optimization.RealPointValuePair;");
        Class doubleType = double.class;
        Class comparatorType = Class.forName("java.util.Comparator");
        Method evaluateNewSimplexMethod = multiDirectionalClazz.getDeclaredMethod("evaluateNewSimplex", realPointValuePairArrayType, doubleType, comparatorType);
        evaluateNewSimplexMethod.setAccessible(true);
        java.lang.Object[] evaluateNewSimplexMethodArguments = new java.lang.Object[3];
        evaluateNewSimplexMethodArguments[0] = ((Object) realPointValuePairArray);
        evaluateNewSimplexMethodArguments[1] = java.lang.Double.NaN;
        evaluateNewSimplexMethodArguments[2] = ((Object) null);
        try {
            evaluateNewSimplexMethod.invoke(multiDirectional, evaluateNewSimplexMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link MultiDirectional}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.direct.MultiDirectional#evaluateNewSimplex(org.apache.commons.math.optimization.RealPointValuePair[],double,java.util.Comparator)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: final double[] xSmallest = original[0].getPointRef();
 *  */
    @Test
    public void testEvaluateNewSimplex_ThrowNullPointerException_2() throws Throwable  {
        MultiDirectional multiDirectional = ((MultiDirectional) createInstance("org.apache.commons.math.optimization.direct.MultiDirectional"));
        
        /* This test fails because method [org.apache.commons.math.optimization.direct.MultiDirectional.evaluateNewSimplex] produces [java.lang.NullPointerException]
            org.apache.commons.math.optimization.direct.MultiDirectional.evaluateNewSimplex(MultiDirectional.java:115) */
        Class multiDirectionalClazz = Class.forName("org.apache.commons.math.optimization.direct.MultiDirectional");
        Class realPointValuePairArrayType = Class.forName("[Lorg.apache.commons.math.optimization.RealPointValuePair;");
        Class doubleType = double.class;
        Class comparatorType = Class.forName("java.util.Comparator");
        Method evaluateNewSimplexMethod = multiDirectionalClazz.getDeclaredMethod("evaluateNewSimplex", realPointValuePairArrayType, doubleType, comparatorType);
        evaluateNewSimplexMethod.setAccessible(true);
        java.lang.Object[] evaluateNewSimplexMethodArguments = new java.lang.Object[3];
        evaluateNewSimplexMethodArguments[0] = ((Object) null);
        evaluateNewSimplexMethodArguments[1] = java.lang.Double.NaN;
        evaluateNewSimplexMethodArguments[2] = ((Object) null);
        try {
            evaluateNewSimplexMethod.invoke(multiDirectional, evaluateNewSimplexMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link MultiDirectional}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.direct.MultiDirectional#evaluateNewSimplex(org.apache.commons.math.optimization.RealPointValuePair[],double,java.util.Comparator)}
 * @utbot.iterates iterate the loop {@code for(int i = 1; i <= n; ++i)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: final double[] xOriginal = original[i].getPointRef();
 *  */
    @Test
    public void testEvaluateNewSimplex_ThrowNullPointerException() throws Throwable  {
        MultiDirectional multiDirectional = ((MultiDirectional) createInstance("org.apache.commons.math.optimization.direct.MultiDirectional"));
        org.apache.commons.math.optimization.RealPointValuePair[] realPointValuePairArray = new org.apache.commons.math.optimization.RealPointValuePair[2];
        RealPointValuePair realPointValuePair = ((RealPointValuePair) createInstance("org.apache.commons.math.optimization.RealPointValuePair"));
        double[] point = {0.0};
        setField(realPointValuePair, "org.apache.commons.math.optimization.RealPointValuePair", "point", point);
        realPointValuePairArray[0] = realPointValuePair;
        
        /* This test fails because method [org.apache.commons.math.optimization.direct.MultiDirectional.evaluateNewSimplex] produces [java.lang.NullPointerException]
            org.apache.commons.math.optimization.direct.MultiDirectional.evaluateNewSimplex(MultiDirectional.java:122) */
        Class multiDirectionalClazz = Class.forName("org.apache.commons.math.optimization.direct.MultiDirectional");
        Class realPointValuePairArrayType = Class.forName("[Lorg.apache.commons.math.optimization.RealPointValuePair;");
        Class doubleType = double.class;
        Class comparatorType = Class.forName("java.util.Comparator");
        Method evaluateNewSimplexMethod = multiDirectionalClazz.getDeclaredMethod("evaluateNewSimplex", realPointValuePairArrayType, doubleType, comparatorType);
        evaluateNewSimplexMethod.setAccessible(true);
        java.lang.Object[] evaluateNewSimplexMethodArguments = new java.lang.Object[3];
        evaluateNewSimplexMethodArguments[0] = ((Object) realPointValuePairArray);
        evaluateNewSimplexMethodArguments[1] = java.lang.Double.NaN;
        evaluateNewSimplexMethodArguments[2] = ((Object) null);
        try {
            evaluateNewSimplexMethod.invoke(multiDirectional, evaluateNewSimplexMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link MultiDirectional}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.direct.MultiDirectional#evaluateNewSimplex(org.apache.commons.math.optimization.RealPointValuePair[],double,java.util.Comparator)}
 * @utbot.iterates iterate the loop {@code for(int i = 1; i <= n; ++i)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: xTransformed[j] = xSmallest[j] + coeff * (xSmallest[j] - xOriginal[j]);
 *  */
    @Test
    public void testEvaluateNewSimplex_ThrowNullPointerException_1() throws Throwable  {
        MultiDirectional multiDirectional = ((MultiDirectional) createInstance("org.apache.commons.math.optimization.direct.MultiDirectional"));
        org.apache.commons.math.optimization.RealPointValuePair[] realPointValuePairArray = new org.apache.commons.math.optimization.RealPointValuePair[2];
        RealPointValuePair realPointValuePair = ((RealPointValuePair) createInstance("org.apache.commons.math.optimization.RealPointValuePair"));
        double[] point = {0.0};
        setField(realPointValuePair, "org.apache.commons.math.optimization.RealPointValuePair", "point", point);
        realPointValuePairArray[0] = realPointValuePair;
        RealPointValuePair realPointValuePair1 = ((RealPointValuePair) createInstance("org.apache.commons.math.optimization.RealPointValuePair"));
        realPointValuePairArray[1] = realPointValuePair1;
        
        /* This test fails because method [org.apache.commons.math.optimization.direct.MultiDirectional.evaluateNewSimplex] produces [java.lang.NullPointerException]
            org.apache.commons.math.optimization.direct.MultiDirectional.evaluateNewSimplex(MultiDirectional.java:125) */
        Class multiDirectionalClazz = Class.forName("org.apache.commons.math.optimization.direct.MultiDirectional");
        Class realPointValuePairArrayType = Class.forName("[Lorg.apache.commons.math.optimization.RealPointValuePair;");
        Class doubleType = double.class;
        Class comparatorType = Class.forName("java.util.Comparator");
        Method evaluateNewSimplexMethod = multiDirectionalClazz.getDeclaredMethod("evaluateNewSimplex", realPointValuePairArrayType, doubleType, comparatorType);
        evaluateNewSimplexMethod.setAccessible(true);
        java.lang.Object[] evaluateNewSimplexMethodArguments = new java.lang.Object[3];
        evaluateNewSimplexMethodArguments[0] = ((Object) realPointValuePairArray);
        evaluateNewSimplexMethodArguments[1] = java.lang.Double.NaN;
        evaluateNewSimplexMethodArguments[2] = ((Object) null);
        try {
            evaluateNewSimplexMethod.invoke(multiDirectional, evaluateNewSimplexMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: CHECKED EXCEPTIONS for method evaluateNewSimplex([Lorg.apache.commons.math.optimization.RealPointValuePair;, double, java.util.Comparator)
    
    /**
    @utbot.classUnderTest {@link MultiDirectional}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.direct.MultiDirectional#evaluateNewSimplex(org.apache.commons.math.optimization.RealPointValuePair[],double,java.util.Comparator)}
 * @utbot.throwsException {@link org.apache.commons.math.FunctionEvaluationException} in: evaluateSimplex(comparator);
 *  */
    @Test(expected = FunctionEvaluationException.class)
    public void testEvaluateNewSimplex_ThrowFunctionEvaluationException_1() throws Throwable  {
        MultiDirectional multiDirectional = ((MultiDirectional) createInstance("org.apache.commons.math.optimization.direct.MultiDirectional"));
        org.apache.commons.math.optimization.RealPointValuePair[] realPointValuePairArray = new org.apache.commons.math.optimization.RealPointValuePair[1];
        RealPointValuePair realPointValuePair = ((RealPointValuePair) createInstance("org.apache.commons.math.optimization.RealPointValuePair"));
        double[] point = {};
        setField(realPointValuePair, "org.apache.commons.math.optimization.RealPointValuePair", "point", point);
        setField(realPointValuePair, "org.apache.commons.math.optimization.RealPointValuePair", "value", java.lang.Double.NaN);
        realPointValuePairArray[0] = realPointValuePair;
        
        Class multiDirectionalClazz = Class.forName("org.apache.commons.math.optimization.direct.MultiDirectional");
        Class realPointValuePairArrayType = Class.forName("[Lorg.apache.commons.math.optimization.RealPointValuePair;");
        Class doubleType = double.class;
        Class comparatorType = Class.forName("java.util.Comparator");
        Method evaluateNewSimplexMethod = multiDirectionalClazz.getDeclaredMethod("evaluateNewSimplex", realPointValuePairArrayType, doubleType, comparatorType);
        evaluateNewSimplexMethod.setAccessible(true);
        java.lang.Object[] evaluateNewSimplexMethodArguments = new java.lang.Object[3];
        evaluateNewSimplexMethodArguments[0] = ((Object) realPointValuePairArray);
        evaluateNewSimplexMethodArguments[1] = java.lang.Double.NaN;
        evaluateNewSimplexMethodArguments[2] = ((Object) null);
        try {
            evaluateNewSimplexMethod.invoke(multiDirectional, evaluateNewSimplexMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link MultiDirectional}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.direct.MultiDirectional#evaluateNewSimplex(org.apache.commons.math.optimization.RealPointValuePair[],double,java.util.Comparator)}
 * @utbot.throwsException {@link org.apache.commons.math.FunctionEvaluationException} in: evaluateSimplex(comparator);
 *  */
    @Test(expected = FunctionEvaluationException.class)
    public void testEvaluateNewSimplex_ThrowFunctionEvaluationException_2() throws Throwable  {
        MultiDirectional multiDirectional = ((MultiDirectional) createInstance("org.apache.commons.math.optimization.direct.MultiDirectional"));
        LeastSquaresConverter f = ((LeastSquaresConverter) createInstance("org.apache.commons.math.optimization.LeastSquaresConverter"));
        Object function = createInstance("org.apache.commons.math.optimization.fitting.CurveFitter$TheoreticalValuesFunction");
        CurveFitter this$0 = ((CurveFitter) createInstance("org.apache.commons.math.optimization.fitting.CurveFitter"));
        ArrayList observations = new ArrayList();
        setField(this$0, "org.apache.commons.math.optimization.fitting.CurveFitter", "observations", observations);
        setField(function, "org.apache.commons.math.optimization.fitting.CurveFitter$TheoreticalValuesFunction", "this$0", this$0);
        setField(f, "org.apache.commons.math.optimization.LeastSquaresConverter", "function", function);
        double[] observations1 = {0.0};
        setField(f, "org.apache.commons.math.optimization.LeastSquaresConverter", "observations", observations1);
        setField(multiDirectional, "org.apache.commons.math.optimization.direct.DirectSearchOptimizer", "f", f);
        multiDirectional.setMaxEvaluations(Integer.MIN_VALUE);
        setField(multiDirectional, "org.apache.commons.math.optimization.direct.DirectSearchOptimizer", "evaluations", Integer.MAX_VALUE);
        org.apache.commons.math.optimization.RealPointValuePair[] realPointValuePairArray = new org.apache.commons.math.optimization.RealPointValuePair[1];
        RealPointValuePair realPointValuePair = ((RealPointValuePair) createInstance("org.apache.commons.math.optimization.RealPointValuePair"));
        double[] point = {};
        setField(realPointValuePair, "org.apache.commons.math.optimization.RealPointValuePair", "point", point);
        setField(realPointValuePair, "org.apache.commons.math.optimization.RealPointValuePair", "value", java.lang.Double.NaN);
        realPointValuePairArray[0] = realPointValuePair;
        
        Class multiDirectionalClazz = Class.forName("org.apache.commons.math.optimization.direct.MultiDirectional");
        Class realPointValuePairArrayType = Class.forName("[Lorg.apache.commons.math.optimization.RealPointValuePair;");
        Class doubleType = double.class;
        Class comparatorType = Class.forName("java.util.Comparator");
        Method evaluateNewSimplexMethod = multiDirectionalClazz.getDeclaredMethod("evaluateNewSimplex", realPointValuePairArrayType, doubleType, comparatorType);
        evaluateNewSimplexMethod.setAccessible(true);
        java.lang.Object[] evaluateNewSimplexMethodArguments = new java.lang.Object[3];
        evaluateNewSimplexMethodArguments[0] = ((Object) realPointValuePairArray);
        evaluateNewSimplexMethodArguments[1] = java.lang.Double.NaN;
        evaluateNewSimplexMethodArguments[2] = ((Object) null);
        try {
            evaluateNewSimplexMethod.invoke(multiDirectional, evaluateNewSimplexMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link MultiDirectional}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.direct.MultiDirectional#evaluateNewSimplex(org.apache.commons.math.optimization.RealPointValuePair[],double,java.util.Comparator)}
 * @utbot.iterates iterate the loop {@code for(int i = 1; i <= n; ++i)} once
 * @utbot.throwsException {@link org.apache.commons.math.FunctionEvaluationException} in: evaluateSimplex(comparator);
 *  */
    @Test(expected = FunctionEvaluationException.class)
    public void testEvaluateNewSimplex_ThrowFunctionEvaluationException() throws Throwable  {
        MultiDirectional multiDirectional = ((MultiDirectional) createInstance("org.apache.commons.math.optimization.direct.MultiDirectional"));
        org.apache.commons.math.optimization.RealPointValuePair[] simplex = {null, null};
        multiDirectional.simplex = simplex;
        LeastSquaresConverter f = ((LeastSquaresConverter) createInstance("org.apache.commons.math.optimization.LeastSquaresConverter"));
        Object function = createInstance("org.apache.commons.math.optimization.fitting.CurveFitter$TheoreticalValuesFunction");
        Object f1 = createInstance("org.apache.commons.math.optimization.fitting.PolynomialFitter$ParametricPolynomial");
        setField(function, "org.apache.commons.math.optimization.fitting.CurveFitter$TheoreticalValuesFunction", "f", f1);
        CurveFitter this$0 = ((CurveFitter) createInstance("org.apache.commons.math.optimization.fitting.CurveFitter"));
        ArrayList observations = new ArrayList();
        WeightedObservedPoint weightedObservedPoint = ((WeightedObservedPoint) createInstance("org.apache.commons.math.optimization.fitting.WeightedObservedPoint"));
        setField(weightedObservedPoint, "org.apache.commons.math.optimization.fitting.WeightedObservedPoint", "x", 0.0);
        observations.add(weightedObservedPoint);
        setField(this$0, "org.apache.commons.math.optimization.fitting.CurveFitter", "observations", observations);
        setField(function, "org.apache.commons.math.optimization.fitting.CurveFitter$TheoreticalValuesFunction", "this$0", this$0);
        setField(f, "org.apache.commons.math.optimization.LeastSquaresConverter", "function", function);
        double[] observations1 = {0.0, 0.0};
        setField(f, "org.apache.commons.math.optimization.LeastSquaresConverter", "observations", observations1);
        setField(multiDirectional, "org.apache.commons.math.optimization.direct.DirectSearchOptimizer", "f", f);
        multiDirectional.setMaxEvaluations(Integer.MIN_VALUE);
        setField(multiDirectional, "org.apache.commons.math.optimization.direct.DirectSearchOptimizer", "evaluations", Integer.MAX_VALUE);
        org.apache.commons.math.optimization.RealPointValuePair[] realPointValuePairArray = new org.apache.commons.math.optimization.RealPointValuePair[2];
        RealPointValuePair realPointValuePair = ((RealPointValuePair) createInstance("org.apache.commons.math.optimization.RealPointValuePair"));
        double[] point = {0.0};
        setField(realPointValuePair, "org.apache.commons.math.optimization.RealPointValuePair", "point", point);
        setField(realPointValuePair, "org.apache.commons.math.optimization.RealPointValuePair", "value", java.lang.Double.NaN);
        realPointValuePairArray[0] = realPointValuePair;
        RealPointValuePair realPointValuePair1 = ((RealPointValuePair) createInstance("org.apache.commons.math.optimization.RealPointValuePair"));
        double[] point1 = {0.0};
        setField(realPointValuePair1, "org.apache.commons.math.optimization.RealPointValuePair", "point", point1);
        realPointValuePairArray[1] = realPointValuePair1;
        
        Class multiDirectionalClazz = Class.forName("org.apache.commons.math.optimization.direct.MultiDirectional");
        Class realPointValuePairArrayType = Class.forName("[Lorg.apache.commons.math.optimization.RealPointValuePair;");
        Class doubleType = double.class;
        Class comparatorType = Class.forName("java.util.Comparator");
        Method evaluateNewSimplexMethod = multiDirectionalClazz.getDeclaredMethod("evaluateNewSimplex", realPointValuePairArrayType, doubleType, comparatorType);
        evaluateNewSimplexMethod.setAccessible(true);
        java.lang.Object[] evaluateNewSimplexMethodArguments = new java.lang.Object[3];
        evaluateNewSimplexMethodArguments[0] = ((Object) realPointValuePairArray);
        evaluateNewSimplexMethodArguments[1] = java.lang.Double.NaN;
        evaluateNewSimplexMethodArguments[2] = ((Object) null);
        try {
            evaluateNewSimplexMethod.invoke(multiDirectional, evaluateNewSimplexMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region Errors report for evaluateNewSimplex
    
    public void testEvaluateNewSimplex_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Exception org.apache.commons.math.MathRuntimeException$4 is not accessible from package org.apache.commons.math.optimization.direct
        
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
        
                java.lang.reflect.Method methodForGetDeclaredFields742320052367600 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields742320052367600.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass742320052372200 = (java.lang.reflect.Field[]) methodForGetDeclaredFields742320052367600.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass742320052372200).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
        modifiersField.setAccessible(true);
        modifiersField.setInt(field, field.getModifiers() & ~java.lang.reflect.Modifier.FINAL);
    
        field.setAccessible(true);
        field.set(object, fieldValue);
    }
    
    private static Object getFieldValue(Object obj, String fieldClassName, String fieldName) throws ClassNotFoundException, NoSuchMethodException, java.lang.reflect.InvocationTargetException, IllegalAccessException, NoSuchFieldException {
        Class<?> clazz = Class.forName(fieldClassName);
        java.lang.reflect.Field field = clazz.getDeclaredField(fieldName);
        
        field.setAccessible(true);
        
        java.lang.reflect.Field modifiersField;
        
            java.lang.reflect.Method methodForGetDeclaredFields742320053183900 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields742320053183900.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass742320053185600 = (java.lang.reflect.Field[]) methodForGetDeclaredFields742320053183900.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass742320053185600).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
        modifiersField.setAccessible(true);
        modifiersField.setInt(field, field.getModifiers() & ~java.lang.reflect.Modifier.FINAL);
        
        return field.get(obj);
    }
    
    private static Object getUnsafeInstance() throws ClassNotFoundException, NoSuchFieldException, IllegalAccessException {
        java.lang.reflect.Field f = Class.forName("sun.misc.Unsafe").getDeclaredField("theUnsafe");
        f.setAccessible(true);
        return f.get(null);
    }
    ///endregion
}

