package org.apache.commons.math.optimization.fitting;

import org.junit.Test;
import org.apache.commons.math.optimization.MultiStartDifferentiableMultivariateVectorialOptimizer;
import java.util.ArrayList;
import org.apache.commons.math.optimization.VectorialPointValuePair;
import org.apache.commons.math.optimization.BaseMultiStartMultivariateVectorialOptimizer;
import org.apache.commons.math.exception.NumberIsTooSmallException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

public final class org_apache_commons_math_optimization_fitting_GaussianFitterTest {
    ///region Test suites for executable org.apache.commons.math.optimization.fitting.GaussianFitter.fit
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method fit([D)
    
    /**
    @utbot.classUnderTest {@link GaussianFitter}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.fitting.GaussianFitter#fit(double[])}
 * @utbot.throwsException {@link java.lang.NegativeArraySizeException} in: return fit(f, initialGuess);
 *  */
    @Test
    public void testFit_ThrowNegativeArraySizeException() throws Exception  {
        GaussianFitter gaussianFitter = ((GaussianFitter) createInstance("org.apache.commons.math.optimization.fitting.GaussianFitter"));
        MultiStartDifferentiableMultivariateVectorialOptimizer optimizer = ((MultiStartDifferentiableMultivariateVectorialOptimizer) createInstance("org.apache.commons.math.optimization.MultiStartDifferentiableMultivariateVectorialOptimizer"));
        setField(optimizer, "org.apache.commons.math.optimization.BaseMultiStartMultivariateVectorialOptimizer", "starts", Integer.MIN_VALUE);
        setField(gaussianFitter, "org.apache.commons.math.optimization.fitting.CurveFitter", "optimizer", optimizer);
        ArrayList observations = new ArrayList();
        setField(gaussianFitter, "org.apache.commons.math.optimization.fitting.CurveFitter", "observations", observations);
        
        /* This test fails because method [org.apache.commons.math.optimization.fitting.GaussianFitter.fit] produces [java.lang.NegativeArraySizeException: -2147483648]
            org.apache.commons.math.optimization.BaseMultiStartMultivariateVectorialOptimizer.optimize(BaseMultiStartMultivariateVectorialOptimizer.java:149)
            org.apache.commons.math.optimization.fitting.CurveFitter.fit(CurveFitter.java:161)
            org.apache.commons.math.optimization.fitting.CurveFitter.fit(CurveFitter.java:126)
            org.apache.commons.math.optimization.fitting.GaussianFitter.fit(GaussianFitter.java:110) */
        gaussianFitter.fit(null);
    }
    
    /**
    @utbot.classUnderTest {@link GaussianFitter}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.fitting.GaussianFitter#fit(double[])}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return fit(f, initialGuess);
 *  */
    @Test
    public void testFit_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        GaussianFitter gaussianFitter = ((GaussianFitter) createInstance("org.apache.commons.math.optimization.fitting.GaussianFitter"));
        MultiStartDifferentiableMultivariateVectorialOptimizer optimizer = ((MultiStartDifferentiableMultivariateVectorialOptimizer) createInstance("org.apache.commons.math.optimization.MultiStartDifferentiableMultivariateVectorialOptimizer"));
        org.apache.commons.math.optimization.VectorialPointValuePair[] optima = {null};
        setField(optimizer, "org.apache.commons.math.optimization.BaseMultiStartMultivariateVectorialOptimizer", "optima", optima);
        setField(gaussianFitter, "org.apache.commons.math.optimization.fitting.CurveFitter", "optimizer", optimizer);
        ArrayList observations = new ArrayList();
        setField(gaussianFitter, "org.apache.commons.math.optimization.fitting.CurveFitter", "observations", observations);
        
        /* This test fails because method [org.apache.commons.math.optimization.fitting.GaussianFitter.fit] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.optimization.BaseMultiStartMultivariateVectorialOptimizer.optimize(BaseMultiStartMultivariateVectorialOptimizer.java:170)
            org.apache.commons.math.optimization.fitting.CurveFitter.fit(CurveFitter.java:161)
            org.apache.commons.math.optimization.fitting.CurveFitter.fit(CurveFitter.java:126)
            org.apache.commons.math.optimization.fitting.GaussianFitter.fit(GaussianFitter.java:110) */
        gaussianFitter.fit(null);
    }
    
    /**
    @utbot.classUnderTest {@link GaussianFitter}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.fitting.GaussianFitter#fit(double[])}
 * @utbot.throwsException {@link java.lang.NegativeArraySizeException} in: return fit(f, initialGuess);
 *  */
    @Test
    public void testFit_ThrowNegativeArraySizeException_1() throws Exception  {
        GaussianFitter gaussianFitter = ((GaussianFitter) createInstance("org.apache.commons.math.optimization.fitting.GaussianFitter"));
        MultiStartDifferentiableMultivariateVectorialOptimizer optimizer = ((MultiStartDifferentiableMultivariateVectorialOptimizer) createInstance("org.apache.commons.math.optimization.MultiStartDifferentiableMultivariateVectorialOptimizer"));
        BaseMultiStartMultivariateVectorialOptimizer optimizer1 = ((BaseMultiStartMultivariateVectorialOptimizer) createInstance("org.apache.commons.math.optimization.BaseMultiStartMultivariateVectorialOptimizer"));
        setField(optimizer1, "org.apache.commons.math.optimization.BaseMultiStartMultivariateVectorialOptimizer", "starts", Integer.MIN_VALUE);
        setField(optimizer, "org.apache.commons.math.optimization.BaseMultiStartMultivariateVectorialOptimizer", "optimizer", optimizer1);
        setField(optimizer, "org.apache.commons.math.optimization.BaseMultiStartMultivariateVectorialOptimizer", "starts", 1);
        org.apache.commons.math.optimization.VectorialPointValuePair[] optima = {null};
        setField(optimizer, "org.apache.commons.math.optimization.BaseMultiStartMultivariateVectorialOptimizer", "optima", optima);
        setField(gaussianFitter, "org.apache.commons.math.optimization.fitting.CurveFitter", "optimizer", optimizer);
        ArrayList observations = new ArrayList();
        setField(gaussianFitter, "org.apache.commons.math.optimization.fitting.CurveFitter", "observations", observations);
        
        /* This test fails because method [org.apache.commons.math.optimization.fitting.GaussianFitter.fit] produces [java.lang.NegativeArraySizeException: -2147483648]
            org.apache.commons.math.optimization.BaseMultiStartMultivariateVectorialOptimizer.optimize(BaseMultiStartMultivariateVectorialOptimizer.java:149)
            org.apache.commons.math.optimization.BaseMultiStartMultivariateVectorialOptimizer.optimize(BaseMultiStartMultivariateVectorialOptimizer.java:156)
            org.apache.commons.math.optimization.fitting.CurveFitter.fit(CurveFitter.java:161)
            org.apache.commons.math.optimization.fitting.CurveFitter.fit(CurveFitter.java:126)
            org.apache.commons.math.optimization.fitting.GaussianFitter.fit(GaussianFitter.java:110) */
        gaussianFitter.fit(null);
    }
    
    /**
    @utbot.classUnderTest {@link GaussianFitter}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.fitting.GaussianFitter#fit(double[])}
 * @utbot.throwsException {@link java.lang.NegativeArraySizeException} in: return fit(f, initialGuess);
 *  */
    @Test
    public void testFit_ThrowNegativeArraySizeException_2() throws Exception  {
        GaussianFitter gaussianFitter = ((GaussianFitter) createInstance("org.apache.commons.math.optimization.fitting.GaussianFitter"));
        MultiStartDifferentiableMultivariateVectorialOptimizer optimizer = ((MultiStartDifferentiableMultivariateVectorialOptimizer) createInstance("org.apache.commons.math.optimization.MultiStartDifferentiableMultivariateVectorialOptimizer"));
        setField(optimizer, "org.apache.commons.math.optimization.BaseMultiStartMultivariateVectorialOptimizer", "starts", Integer.MIN_VALUE);
        setField(gaussianFitter, "org.apache.commons.math.optimization.fitting.CurveFitter", "optimizer", optimizer);
        ArrayList observations = new ArrayList();
        WeightedObservedPoint weightedObservedPoint = ((WeightedObservedPoint) createInstance("org.apache.commons.math.optimization.fitting.WeightedObservedPoint"));
        setField(weightedObservedPoint, "org.apache.commons.math.optimization.fitting.WeightedObservedPoint", "weight", 0.0);
        setField(weightedObservedPoint, "org.apache.commons.math.optimization.fitting.WeightedObservedPoint", "y", 0.0);
        observations.add(weightedObservedPoint);
        setField(gaussianFitter, "org.apache.commons.math.optimization.fitting.CurveFitter", "observations", observations);
        
        /* This test fails because method [org.apache.commons.math.optimization.fitting.GaussianFitter.fit] produces [java.lang.NegativeArraySizeException: -2147483648]
            org.apache.commons.math.optimization.BaseMultiStartMultivariateVectorialOptimizer.optimize(BaseMultiStartMultivariateVectorialOptimizer.java:149)
            org.apache.commons.math.optimization.fitting.CurveFitter.fit(CurveFitter.java:161)
            org.apache.commons.math.optimization.fitting.CurveFitter.fit(CurveFitter.java:126)
            org.apache.commons.math.optimization.fitting.GaussianFitter.fit(GaussianFitter.java:110) */
        gaussianFitter.fit(null);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method fit([D)
    
    @Test
    public void testFit1() throws Exception  {
        GaussianFitter gaussianFitter = ((GaussianFitter) createInstance("org.apache.commons.math.optimization.fitting.GaussianFitter"));
        MultiStartDifferentiableMultivariateVectorialOptimizer optimizer = ((MultiStartDifferentiableMultivariateVectorialOptimizer) createInstance("org.apache.commons.math.optimization.MultiStartDifferentiableMultivariateVectorialOptimizer"));
        BaseMultiStartMultivariateVectorialOptimizer optimizer1 = ((BaseMultiStartMultivariateVectorialOptimizer) createInstance("org.apache.commons.math.optimization.BaseMultiStartMultivariateVectorialOptimizer"));
        setField(optimizer, "org.apache.commons.math.optimization.BaseMultiStartMultivariateVectorialOptimizer", "optimizer", optimizer1);
        setField(optimizer, "org.apache.commons.math.optimization.BaseMultiStartMultivariateVectorialOptimizer", "starts", 9);
        setField(gaussianFitter, "org.apache.commons.math.optimization.fitting.CurveFitter", "optimizer", optimizer);
        ArrayList observations = new ArrayList();
        WeightedObservedPoint weightedObservedPoint = ((WeightedObservedPoint) createInstance("org.apache.commons.math.optimization.fitting.WeightedObservedPoint"));
        setField(weightedObservedPoint, "org.apache.commons.math.optimization.fitting.WeightedObservedPoint", "weight", 0.0);
        setField(weightedObservedPoint, "org.apache.commons.math.optimization.fitting.WeightedObservedPoint", "y", 0.0);
        observations.add(weightedObservedPoint);
        observations.add(weightedObservedPoint);
        observations.add(weightedObservedPoint);
        observations.add(weightedObservedPoint);
        setField(gaussianFitter, "org.apache.commons.math.optimization.fitting.CurveFitter", "observations", observations);
        
        /* This test fails because method [org.apache.commons.math.optimization.fitting.GaussianFitter.fit] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.optimization.BaseMultiStartMultivariateVectorialOptimizer.optimize(BaseMultiStartMultivariateVectorialOptimizer.java:170)
            org.apache.commons.math.optimization.BaseMultiStartMultivariateVectorialOptimizer.optimize(BaseMultiStartMultivariateVectorialOptimizer.java:156)
            org.apache.commons.math.optimization.fitting.CurveFitter.fit(CurveFitter.java:161)
            org.apache.commons.math.optimization.fitting.CurveFitter.fit(CurveFitter.java:126)
            org.apache.commons.math.optimization.fitting.GaussianFitter.fit(GaussianFitter.java:110) */
        gaussianFitter.fit(null);
    }
    
    @Test
    public void testFit2() throws Exception  {
        GaussianFitter gaussianFitter = ((GaussianFitter) createInstance("org.apache.commons.math.optimization.fitting.GaussianFitter"));
        MultiStartDifferentiableMultivariateVectorialOptimizer optimizer = ((MultiStartDifferentiableMultivariateVectorialOptimizer) createInstance("org.apache.commons.math.optimization.MultiStartDifferentiableMultivariateVectorialOptimizer"));
        BaseMultiStartMultivariateVectorialOptimizer optimizer1 = ((BaseMultiStartMultivariateVectorialOptimizer) createInstance("org.apache.commons.math.optimization.BaseMultiStartMultivariateVectorialOptimizer"));
        BaseMultiStartMultivariateVectorialOptimizer optimizer2 = ((BaseMultiStartMultivariateVectorialOptimizer) createInstance("org.apache.commons.math.optimization.BaseMultiStartMultivariateVectorialOptimizer"));
        setField(optimizer1, "org.apache.commons.math.optimization.BaseMultiStartMultivariateVectorialOptimizer", "optimizer", optimizer2);
        setField(optimizer1, "org.apache.commons.math.optimization.BaseMultiStartMultivariateVectorialOptimizer", "starts", 9);
        setField(optimizer, "org.apache.commons.math.optimization.BaseMultiStartMultivariateVectorialOptimizer", "optimizer", optimizer1);
        setField(optimizer, "org.apache.commons.math.optimization.BaseMultiStartMultivariateVectorialOptimizer", "starts", 9);
        setField(gaussianFitter, "org.apache.commons.math.optimization.fitting.CurveFitter", "optimizer", optimizer);
        ArrayList observations = new ArrayList();
        WeightedObservedPoint weightedObservedPoint = ((WeightedObservedPoint) createInstance("org.apache.commons.math.optimization.fitting.WeightedObservedPoint"));
        setField(weightedObservedPoint, "org.apache.commons.math.optimization.fitting.WeightedObservedPoint", "weight", 0.0);
        setField(weightedObservedPoint, "org.apache.commons.math.optimization.fitting.WeightedObservedPoint", "y", 0.0);
        observations.add(weightedObservedPoint);
        observations.add(weightedObservedPoint);
        setField(gaussianFitter, "org.apache.commons.math.optimization.fitting.CurveFitter", "observations", observations);
        double[] doubleArray = new double[12];
        
        /* This test fails because method [org.apache.commons.math.optimization.fitting.GaussianFitter.fit] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.optimization.BaseMultiStartMultivariateVectorialOptimizer.optimize(BaseMultiStartMultivariateVectorialOptimizer.java:170)
            org.apache.commons.math.optimization.BaseMultiStartMultivariateVectorialOptimizer.optimize(BaseMultiStartMultivariateVectorialOptimizer.java:156)
            org.apache.commons.math.optimization.BaseMultiStartMultivariateVectorialOptimizer.optimize(BaseMultiStartMultivariateVectorialOptimizer.java:156)
            org.apache.commons.math.optimization.fitting.CurveFitter.fit(CurveFitter.java:161)
            org.apache.commons.math.optimization.fitting.CurveFitter.fit(CurveFitter.java:126)
            org.apache.commons.math.optimization.fitting.GaussianFitter.fit(GaussianFitter.java:110) */
        gaussianFitter.fit(doubleArray);
    }
    
    @Test
    public void testFit3() throws Exception  {
        GaussianFitter gaussianFitter = ((GaussianFitter) createInstance("org.apache.commons.math.optimization.fitting.GaussianFitter"));
        MultiStartDifferentiableMultivariateVectorialOptimizer optimizer = ((MultiStartDifferentiableMultivariateVectorialOptimizer) createInstance("org.apache.commons.math.optimization.MultiStartDifferentiableMultivariateVectorialOptimizer"));
        BaseMultiStartMultivariateVectorialOptimizer optimizer1 = ((BaseMultiStartMultivariateVectorialOptimizer) createInstance("org.apache.commons.math.optimization.BaseMultiStartMultivariateVectorialOptimizer"));
        BaseMultiStartMultivariateVectorialOptimizer optimizer2 = ((BaseMultiStartMultivariateVectorialOptimizer) createInstance("org.apache.commons.math.optimization.BaseMultiStartMultivariateVectorialOptimizer"));
        BaseMultiStartMultivariateVectorialOptimizer optimizer3 = ((BaseMultiStartMultivariateVectorialOptimizer) createInstance("org.apache.commons.math.optimization.BaseMultiStartMultivariateVectorialOptimizer"));
        setField(optimizer2, "org.apache.commons.math.optimization.BaseMultiStartMultivariateVectorialOptimizer", "optimizer", optimizer3);
        setField(optimizer2, "org.apache.commons.math.optimization.BaseMultiStartMultivariateVectorialOptimizer", "starts", 9);
        org.apache.commons.math.optimization.VectorialPointValuePair[] optima = {null, null, null, null, null, null, null, null, null};
        setField(optimizer2, "org.apache.commons.math.optimization.BaseMultiStartMultivariateVectorialOptimizer", "optima", optima);
        setField(optimizer1, "org.apache.commons.math.optimization.BaseMultiStartMultivariateVectorialOptimizer", "optimizer", optimizer2);
        setField(optimizer1, "org.apache.commons.math.optimization.BaseMultiStartMultivariateVectorialOptimizer", "starts", 9);
        org.apache.commons.math.optimization.VectorialPointValuePair[] optima1 = {null, null, null, null, null, null, null, null, null};
        setField(optimizer1, "org.apache.commons.math.optimization.BaseMultiStartMultivariateVectorialOptimizer", "optima", optima1);
        setField(optimizer, "org.apache.commons.math.optimization.BaseMultiStartMultivariateVectorialOptimizer", "optimizer", optimizer1);
        setField(optimizer, "org.apache.commons.math.optimization.BaseMultiStartMultivariateVectorialOptimizer", "starts", 9);
        org.apache.commons.math.optimization.VectorialPointValuePair[] optima2 = {null, null, null, null, null, null, null, null, null};
        setField(optimizer, "org.apache.commons.math.optimization.BaseMultiStartMultivariateVectorialOptimizer", "optima", optima2);
        setField(gaussianFitter, "org.apache.commons.math.optimization.fitting.CurveFitter", "optimizer", optimizer);
        ArrayList observations = new ArrayList();
        WeightedObservedPoint weightedObservedPoint = ((WeightedObservedPoint) createInstance("org.apache.commons.math.optimization.fitting.WeightedObservedPoint"));
        setField(weightedObservedPoint, "org.apache.commons.math.optimization.fitting.WeightedObservedPoint", "weight", 0.0);
        setField(weightedObservedPoint, "org.apache.commons.math.optimization.fitting.WeightedObservedPoint", "y", 0.0);
        observations.add(weightedObservedPoint);
        setField(gaussianFitter, "org.apache.commons.math.optimization.fitting.CurveFitter", "observations", observations);
        
        /* This test fails because method [org.apache.commons.math.optimization.fitting.GaussianFitter.fit] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.optimization.BaseMultiStartMultivariateVectorialOptimizer.optimize(BaseMultiStartMultivariateVectorialOptimizer.java:170)
            org.apache.commons.math.optimization.BaseMultiStartMultivariateVectorialOptimizer.optimize(BaseMultiStartMultivariateVectorialOptimizer.java:156)
            org.apache.commons.math.optimization.BaseMultiStartMultivariateVectorialOptimizer.optimize(BaseMultiStartMultivariateVectorialOptimizer.java:156)
            org.apache.commons.math.optimization.BaseMultiStartMultivariateVectorialOptimizer.optimize(BaseMultiStartMultivariateVectorialOptimizer.java:156)
            org.apache.commons.math.optimization.fitting.CurveFitter.fit(CurveFitter.java:161)
            org.apache.commons.math.optimization.fitting.CurveFitter.fit(CurveFitter.java:126)
            org.apache.commons.math.optimization.fitting.GaussianFitter.fit(GaussianFitter.java:110) */
        gaussianFitter.fit(null);
    }
    
    @Test
    public void testFit4() throws Exception  {
        GaussianFitter gaussianFitter = ((GaussianFitter) createInstance("org.apache.commons.math.optimization.fitting.GaussianFitter"));
        MultiStartDifferentiableMultivariateVectorialOptimizer optimizer = ((MultiStartDifferentiableMultivariateVectorialOptimizer) createInstance("org.apache.commons.math.optimization.MultiStartDifferentiableMultivariateVectorialOptimizer"));
        MultiStartDifferentiableMultivariateVectorialOptimizer optimizer1 = ((MultiStartDifferentiableMultivariateVectorialOptimizer) createInstance("org.apache.commons.math.optimization.MultiStartDifferentiableMultivariateVectorialOptimizer"));
        BaseMultiStartMultivariateVectorialOptimizer optimizer2 = ((BaseMultiStartMultivariateVectorialOptimizer) createInstance("org.apache.commons.math.optimization.BaseMultiStartMultivariateVectorialOptimizer"));
        BaseMultiStartMultivariateVectorialOptimizer optimizer3 = ((BaseMultiStartMultivariateVectorialOptimizer) createInstance("org.apache.commons.math.optimization.BaseMultiStartMultivariateVectorialOptimizer"));
        BaseMultiStartMultivariateVectorialOptimizer optimizer4 = ((BaseMultiStartMultivariateVectorialOptimizer) createInstance("org.apache.commons.math.optimization.BaseMultiStartMultivariateVectorialOptimizer"));
        setField(optimizer3, "org.apache.commons.math.optimization.BaseMultiStartMultivariateVectorialOptimizer", "optimizer", optimizer4);
        setField(optimizer3, "org.apache.commons.math.optimization.BaseMultiStartMultivariateVectorialOptimizer", "starts", 9);
        setField(optimizer2, "org.apache.commons.math.optimization.BaseMultiStartMultivariateVectorialOptimizer", "optimizer", optimizer3);
        setField(optimizer2, "org.apache.commons.math.optimization.BaseMultiStartMultivariateVectorialOptimizer", "starts", 9);
        setField(optimizer1, "org.apache.commons.math.optimization.BaseMultiStartMultivariateVectorialOptimizer", "optimizer", optimizer2);
        setField(optimizer1, "org.apache.commons.math.optimization.BaseMultiStartMultivariateVectorialOptimizer", "starts", 9);
        setField(optimizer, "org.apache.commons.math.optimization.BaseMultiStartMultivariateVectorialOptimizer", "optimizer", optimizer1);
        setField(optimizer, "org.apache.commons.math.optimization.BaseMultiStartMultivariateVectorialOptimizer", "starts", 9);
        setField(gaussianFitter, "org.apache.commons.math.optimization.fitting.CurveFitter", "optimizer", optimizer);
        ArrayList observations = new ArrayList();
        setField(gaussianFitter, "org.apache.commons.math.optimization.fitting.CurveFitter", "observations", observations);
        double[] doubleArray = new double[17];
        
        /* This test fails because method [org.apache.commons.math.optimization.fitting.GaussianFitter.fit] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.optimization.BaseMultiStartMultivariateVectorialOptimizer.optimize(BaseMultiStartMultivariateVectorialOptimizer.java:170)
            org.apache.commons.math.optimization.BaseMultiStartMultivariateVectorialOptimizer.optimize(BaseMultiStartMultivariateVectorialOptimizer.java:156)
            org.apache.commons.math.optimization.BaseMultiStartMultivariateVectorialOptimizer.optimize(BaseMultiStartMultivariateVectorialOptimizer.java:156)
            org.apache.commons.math.optimization.BaseMultiStartMultivariateVectorialOptimizer.optimize(BaseMultiStartMultivariateVectorialOptimizer.java:156)
            org.apache.commons.math.optimization.BaseMultiStartMultivariateVectorialOptimizer.optimize(BaseMultiStartMultivariateVectorialOptimizer.java:156)
            org.apache.commons.math.optimization.fitting.CurveFitter.fit(CurveFitter.java:161)
            org.apache.commons.math.optimization.fitting.CurveFitter.fit(CurveFitter.java:126)
            org.apache.commons.math.optimization.fitting.GaussianFitter.fit(GaussianFitter.java:110) */
        gaussianFitter.fit(doubleArray);
    }
    
    @Test
    public void testFit5() throws Exception  {
        GaussianFitter gaussianFitter = ((GaussianFitter) createInstance("org.apache.commons.math.optimization.fitting.GaussianFitter"));
        MultiStartDifferentiableMultivariateVectorialOptimizer optimizer = ((MultiStartDifferentiableMultivariateVectorialOptimizer) createInstance("org.apache.commons.math.optimization.MultiStartDifferentiableMultivariateVectorialOptimizer"));
        BaseMultiStartMultivariateVectorialOptimizer optimizer1 = ((BaseMultiStartMultivariateVectorialOptimizer) createInstance("org.apache.commons.math.optimization.BaseMultiStartMultivariateVectorialOptimizer"));
        BaseMultiStartMultivariateVectorialOptimizer optimizer2 = ((BaseMultiStartMultivariateVectorialOptimizer) createInstance("org.apache.commons.math.optimization.BaseMultiStartMultivariateVectorialOptimizer"));
        MultiStartDifferentiableMultivariateVectorialOptimizer optimizer3 = ((MultiStartDifferentiableMultivariateVectorialOptimizer) createInstance("org.apache.commons.math.optimization.MultiStartDifferentiableMultivariateVectorialOptimizer"));
        setField(optimizer2, "org.apache.commons.math.optimization.BaseMultiStartMultivariateVectorialOptimizer", "optimizer", optimizer3);
        setField(optimizer2, "org.apache.commons.math.optimization.BaseMultiStartMultivariateVectorialOptimizer", "starts", 9);
        setField(optimizer1, "org.apache.commons.math.optimization.BaseMultiStartMultivariateVectorialOptimizer", "optimizer", optimizer2);
        setField(optimizer1, "org.apache.commons.math.optimization.BaseMultiStartMultivariateVectorialOptimizer", "starts", 9);
        setField(optimizer, "org.apache.commons.math.optimization.BaseMultiStartMultivariateVectorialOptimizer", "optimizer", optimizer1);
        setField(optimizer, "org.apache.commons.math.optimization.BaseMultiStartMultivariateVectorialOptimizer", "starts", 9);
        setField(gaussianFitter, "org.apache.commons.math.optimization.fitting.CurveFitter", "optimizer", optimizer);
        ArrayList observations = new ArrayList();
        WeightedObservedPoint weightedObservedPoint = ((WeightedObservedPoint) createInstance("org.apache.commons.math.optimization.fitting.WeightedObservedPoint"));
        setField(weightedObservedPoint, "org.apache.commons.math.optimization.fitting.WeightedObservedPoint", "weight", 0.0);
        setField(weightedObservedPoint, "org.apache.commons.math.optimization.fitting.WeightedObservedPoint", "y", 0.0);
        observations.add(weightedObservedPoint);
        observations.add(weightedObservedPoint);
        observations.add(weightedObservedPoint);
        setField(gaussianFitter, "org.apache.commons.math.optimization.fitting.CurveFitter", "observations", observations);
        
        /* This test fails because method [org.apache.commons.math.optimization.fitting.GaussianFitter.fit] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.optimization.BaseMultiStartMultivariateVectorialOptimizer.optimize(BaseMultiStartMultivariateVectorialOptimizer.java:170)
            org.apache.commons.math.optimization.BaseMultiStartMultivariateVectorialOptimizer.optimize(BaseMultiStartMultivariateVectorialOptimizer.java:156)
            org.apache.commons.math.optimization.BaseMultiStartMultivariateVectorialOptimizer.optimize(BaseMultiStartMultivariateVectorialOptimizer.java:156)
            org.apache.commons.math.optimization.BaseMultiStartMultivariateVectorialOptimizer.optimize(BaseMultiStartMultivariateVectorialOptimizer.java:156)
            org.apache.commons.math.optimization.fitting.CurveFitter.fit(CurveFitter.java:161)
            org.apache.commons.math.optimization.fitting.CurveFitter.fit(CurveFitter.java:126)
            org.apache.commons.math.optimization.fitting.GaussianFitter.fit(GaussianFitter.java:110) */
        gaussianFitter.fit(null);
    }
    
    @Test
    public void testFit6() throws Exception  {
        GaussianFitter gaussianFitter = ((GaussianFitter) createInstance("org.apache.commons.math.optimization.fitting.GaussianFitter"));
        ArrayList observations = new ArrayList();
        WeightedObservedPoint weightedObservedPoint = ((WeightedObservedPoint) createInstance("org.apache.commons.math.optimization.fitting.WeightedObservedPoint"));
        setField(weightedObservedPoint, "org.apache.commons.math.optimization.fitting.WeightedObservedPoint", "weight", 0.0);
        setField(weightedObservedPoint, "org.apache.commons.math.optimization.fitting.WeightedObservedPoint", "y", 0.0);
        observations.add(weightedObservedPoint);
        observations.add(weightedObservedPoint);
        observations.add(weightedObservedPoint);
        observations.add(weightedObservedPoint);
        WeightedObservedPoint weightedObservedPoint1 = ((WeightedObservedPoint) createInstance("org.apache.commons.math.optimization.fitting.WeightedObservedPoint"));
        observations.add(weightedObservedPoint1);
        observations.add(weightedObservedPoint1);
        observations.add(weightedObservedPoint1);
        setField(gaussianFitter, "org.apache.commons.math.optimization.fitting.CurveFitter", "observations", observations);
        double[] doubleArray = new double[18];
        
        /* This test fails because method [org.apache.commons.math.optimization.fitting.GaussianFitter.fit] produces [java.lang.NullPointerException]
            org.apache.commons.math.optimization.fitting.CurveFitter.fit(CurveFitter.java:161)
            org.apache.commons.math.optimization.fitting.CurveFitter.fit(CurveFitter.java:126)
            org.apache.commons.math.optimization.fitting.GaussianFitter.fit(GaussianFitter.java:110) */
        gaussianFitter.fit(doubleArray);
    }
    
    @Test
    public void testFit7() throws Exception  {
        GaussianFitter gaussianFitter = ((GaussianFitter) createInstance("org.apache.commons.math.optimization.fitting.GaussianFitter"));
        MultiStartDifferentiableMultivariateVectorialOptimizer optimizer = ((MultiStartDifferentiableMultivariateVectorialOptimizer) createInstance("org.apache.commons.math.optimization.MultiStartDifferentiableMultivariateVectorialOptimizer"));
        BaseMultiStartMultivariateVectorialOptimizer optimizer1 = ((BaseMultiStartMultivariateVectorialOptimizer) createInstance("org.apache.commons.math.optimization.BaseMultiStartMultivariateVectorialOptimizer"));
        BaseMultiStartMultivariateVectorialOptimizer optimizer2 = ((BaseMultiStartMultivariateVectorialOptimizer) createInstance("org.apache.commons.math.optimization.BaseMultiStartMultivariateVectorialOptimizer"));
        BaseMultiStartMultivariateVectorialOptimizer optimizer3 = ((BaseMultiStartMultivariateVectorialOptimizer) createInstance("org.apache.commons.math.optimization.BaseMultiStartMultivariateVectorialOptimizer"));
        BaseMultiStartMultivariateVectorialOptimizer optimizer4 = ((BaseMultiStartMultivariateVectorialOptimizer) createInstance("org.apache.commons.math.optimization.BaseMultiStartMultivariateVectorialOptimizer"));
        setField(optimizer4, "org.apache.commons.math.optimization.BaseMultiStartMultivariateVectorialOptimizer", "starts", 9);
        setField(optimizer3, "org.apache.commons.math.optimization.BaseMultiStartMultivariateVectorialOptimizer", "optimizer", optimizer4);
        setField(optimizer3, "org.apache.commons.math.optimization.BaseMultiStartMultivariateVectorialOptimizer", "starts", 9);
        setField(optimizer2, "org.apache.commons.math.optimization.BaseMultiStartMultivariateVectorialOptimizer", "optimizer", optimizer3);
        setField(optimizer2, "org.apache.commons.math.optimization.BaseMultiStartMultivariateVectorialOptimizer", "starts", 9);
        setField(optimizer1, "org.apache.commons.math.optimization.BaseMultiStartMultivariateVectorialOptimizer", "optimizer", optimizer2);
        setField(optimizer1, "org.apache.commons.math.optimization.BaseMultiStartMultivariateVectorialOptimizer", "starts", 9);
        setField(optimizer, "org.apache.commons.math.optimization.BaseMultiStartMultivariateVectorialOptimizer", "optimizer", optimizer1);
        setField(optimizer, "org.apache.commons.math.optimization.BaseMultiStartMultivariateVectorialOptimizer", "starts", 9);
        setField(gaussianFitter, "org.apache.commons.math.optimization.fitting.CurveFitter", "optimizer", optimizer);
        ArrayList observations = new ArrayList();
        setField(gaussianFitter, "org.apache.commons.math.optimization.fitting.CurveFitter", "observations", observations);
        double[] doubleArray = {
            0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0, 0.0
        };
        
        /* This test fails because method [org.apache.commons.math.optimization.fitting.GaussianFitter.fit] produces [java.lang.NullPointerException]
            org.apache.commons.math.optimization.BaseMultiStartMultivariateVectorialOptimizer.optimize(BaseMultiStartMultivariateVectorialOptimizer.java:156)
            org.apache.commons.math.optimization.BaseMultiStartMultivariateVectorialOptimizer.optimize(BaseMultiStartMultivariateVectorialOptimizer.java:156)
            org.apache.commons.math.optimization.BaseMultiStartMultivariateVectorialOptimizer.optimize(BaseMultiStartMultivariateVectorialOptimizer.java:156)
            org.apache.commons.math.optimization.BaseMultiStartMultivariateVectorialOptimizer.optimize(BaseMultiStartMultivariateVectorialOptimizer.java:156)
            org.apache.commons.math.optimization.BaseMultiStartMultivariateVectorialOptimizer.optimize(BaseMultiStartMultivariateVectorialOptimizer.java:156)
            org.apache.commons.math.optimization.fitting.CurveFitter.fit(CurveFitter.java:161)
            org.apache.commons.math.optimization.fitting.CurveFitter.fit(CurveFitter.java:126)
            org.apache.commons.math.optimization.fitting.GaussianFitter.fit(GaussianFitter.java:110) */
        gaussianFitter.fit(doubleArray);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.optimization.fitting.GaussianFitter.fit
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method fit()
    
    /**
    @utbot.classUnderTest {@link GaussianFitter}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.fitting.GaussianFitter#fit()}
 * @utbot.invokes {@link org.apache.commons.math.optimization.fitting.GaussianFitter#getObservations()}
 * @utbot.throwsException {@link org.apache.commons.math.exception.NumberIsTooSmallException} in: final double[] guess = (new ParameterGuesser(getObservations())).guess();
 *  */
    @Test(expected = NumberIsTooSmallException.class)
    public void testFit_ThrowNumberIsTooSmallException() throws Exception  {
        GaussianFitter gaussianFitter = ((GaussianFitter) createInstance("org.apache.commons.math.optimization.fitting.GaussianFitter"));
        ArrayList observations = new ArrayList();
        observations.add(null);
        observations.add(null);
        setField(gaussianFitter, "org.apache.commons.math.optimization.fitting.CurveFitter", "observations", observations);
        
        gaussianFitter.fit();
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method fit()
    
    /**
    @utbot.classUnderTest {@link GaussianFitter}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.fitting.GaussianFitter#fit()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: final double[] guess = (new ParameterGuesser(getObservations())).guess();
 *  */
    @Test
    public void testFit_ThrowNullPointerException() throws Exception  {
        GaussianFitter gaussianFitter = ((GaussianFitter) createInstance("org.apache.commons.math.optimization.fitting.GaussianFitter"));
        ArrayList observations = new ArrayList();
        observations.add(null);
        WeightedObservedPoint weightedObservedPoint = ((WeightedObservedPoint) createInstance("org.apache.commons.math.optimization.fitting.WeightedObservedPoint"));
        setField(weightedObservedPoint, "org.apache.commons.math.optimization.fitting.WeightedObservedPoint", "x", -3.3376107877608026E-308);
        setField(weightedObservedPoint, "org.apache.commons.math.optimization.fitting.WeightedObservedPoint", "y", 0.0);
        observations.add(weightedObservedPoint);
        WeightedObservedPoint weightedObservedPoint1 = ((WeightedObservedPoint) createInstance("org.apache.commons.math.optimization.fitting.WeightedObservedPoint"));
        setField(weightedObservedPoint1, "org.apache.commons.math.optimization.fitting.WeightedObservedPoint", "x", 3.0);
        observations.add(weightedObservedPoint1);
        setField(gaussianFitter, "org.apache.commons.math.optimization.fitting.CurveFitter", "observations", observations);
        
        /* This test fails because method [org.apache.commons.math.optimization.fitting.GaussianFitter.fit] produces [java.lang.NullPointerException]
            org.apache.commons.math.optimization.fitting.GaussianFitter$ParameterGuesser.findMaxY(GaussianFitter.java:199)
            org.apache.commons.math.optimization.fitting.GaussianFitter$ParameterGuesser.basicGuess(GaussianFitter.java:172)
            org.apache.commons.math.optimization.fitting.GaussianFitter$ParameterGuesser.guess(GaussianFitter.java:157)
            org.apache.commons.math.optimization.fitting.GaussianFitter.fit(GaussianFitter.java:120) */
        gaussianFitter.fit();
    }
    
    /**
    @utbot.classUnderTest {@link GaussianFitter}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.fitting.GaussianFitter#fit()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: final double[] guess = (new ParameterGuesser(getObservations())).guess();
 *  */
    @Test
    public void testFit_ThrowNullPointerException_1() throws Exception  {
        GaussianFitter gaussianFitter = ((GaussianFitter) createInstance("org.apache.commons.math.optimization.fitting.GaussianFitter"));
        ArrayList observations = new ArrayList();
        WeightedObservedPoint weightedObservedPoint = ((WeightedObservedPoint) createInstance("org.apache.commons.math.optimization.fitting.WeightedObservedPoint"));
        setField(weightedObservedPoint, "org.apache.commons.math.optimization.fitting.WeightedObservedPoint", "x", -2.225075980502993E-308);
        setField(weightedObservedPoint, "org.apache.commons.math.optimization.fitting.WeightedObservedPoint", "y", 0.0);
        observations.add(weightedObservedPoint);
        observations.add(null);
        WeightedObservedPoint weightedObservedPoint1 = ((WeightedObservedPoint) createInstance("org.apache.commons.math.optimization.fitting.WeightedObservedPoint"));
        setField(weightedObservedPoint1, "org.apache.commons.math.optimization.fitting.WeightedObservedPoint", "x", 8.000007629394531);
        observations.add(weightedObservedPoint1);
        setField(gaussianFitter, "org.apache.commons.math.optimization.fitting.CurveFitter", "observations", observations);
        
        /* This test fails because method [org.apache.commons.math.optimization.fitting.GaussianFitter.fit] produces [java.lang.NullPointerException]
            org.apache.commons.math.optimization.fitting.GaussianFitter$ParameterGuesser.findMaxY(GaussianFitter.java:199)
            org.apache.commons.math.optimization.fitting.GaussianFitter$ParameterGuesser.basicGuess(GaussianFitter.java:172)
            org.apache.commons.math.optimization.fitting.GaussianFitter$ParameterGuesser.guess(GaussianFitter.java:157)
            org.apache.commons.math.optimization.fitting.GaussianFitter.fit(GaussianFitter.java:120) */
        gaussianFitter.fit();
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method fit()
    
    @Test
    public void testFit8() throws Exception  {
        GaussianFitter gaussianFitter = ((GaussianFitter) createInstance("org.apache.commons.math.optimization.fitting.GaussianFitter"));
        ArrayList observations = new ArrayList();
        WeightedObservedPoint weightedObservedPoint = ((WeightedObservedPoint) createInstance("org.apache.commons.math.optimization.fitting.WeightedObservedPoint"));
        setField(weightedObservedPoint, "org.apache.commons.math.optimization.fitting.WeightedObservedPoint", "x", -6.582271963178093E91);
        observations.add(weightedObservedPoint);
        WeightedObservedPoint weightedObservedPoint1 = ((WeightedObservedPoint) createInstance("org.apache.commons.math.optimization.fitting.WeightedObservedPoint"));
        setField(weightedObservedPoint1, "org.apache.commons.math.optimization.fitting.WeightedObservedPoint", "x", 9.681853003889552E-94);
        setField(weightedObservedPoint1, "org.apache.commons.math.optimization.fitting.WeightedObservedPoint", "y", 8.706695274506476E155);
        observations.add(weightedObservedPoint1);
        WeightedObservedPoint weightedObservedPoint2 = ((WeightedObservedPoint) createInstance("org.apache.commons.math.optimization.fitting.WeightedObservedPoint"));
        setField(weightedObservedPoint2, "org.apache.commons.math.optimization.fitting.WeightedObservedPoint", "x", java.lang.Double.NaN);
        setField(weightedObservedPoint2, "org.apache.commons.math.optimization.fitting.WeightedObservedPoint", "y", -2.3559984226557764E251);
        observations.add(weightedObservedPoint2);
        observations.add(gaussianFitter);
        observations.add(gaussianFitter);
        observations.add(gaussianFitter);
        setField(gaussianFitter, "org.apache.commons.math.optimization.fitting.CurveFitter", "observations", observations);
        
        /* This test fails because method [org.apache.commons.math.optimization.fitting.GaussianFitter.fit] produces [java.lang.ArrayStoreException: arraycopy: element type mismatch: can not cast one of the elements of java.lang.Object[] to the type of the destination array, org.apache.commons.math.optimization.fitting.WeightedObservedPoint]
            java.base/java.lang.System.arraycopy(Native Method)
            java.base/java.util.ArrayList.toArray(ArrayList.java:401)
            org.apache.commons.math.optimization.fitting.CurveFitter.getObservations(CurveFitter.java:100)
            org.apache.commons.math.optimization.fitting.GaussianFitter.fit(GaussianFitter.java:120) */
        gaussianFitter.fit();
    }
    
    @Test
    public void testFit9() throws Exception  {
        GaussianFitter gaussianFitter = ((GaussianFitter) createInstance("org.apache.commons.math.optimization.fitting.GaussianFitter"));
        ArrayList observations = new ArrayList();
        WeightedObservedPoint weightedObservedPoint = ((WeightedObservedPoint) createInstance("org.apache.commons.math.optimization.fitting.WeightedObservedPoint"));
        setField(weightedObservedPoint, "org.apache.commons.math.optimization.fitting.WeightedObservedPoint", "weight", -4.450147717014405E-308);
        setField(weightedObservedPoint, "org.apache.commons.math.optimization.fitting.WeightedObservedPoint", "x", 4.9E-324);
        setField(weightedObservedPoint, "org.apache.commons.math.optimization.fitting.WeightedObservedPoint", "y", java.lang.Double.NaN);
        observations.add(weightedObservedPoint);
        WeightedObservedPoint weightedObservedPoint1 = ((WeightedObservedPoint) createInstance("org.apache.commons.math.optimization.fitting.WeightedObservedPoint"));
        setField(weightedObservedPoint1, "org.apache.commons.math.optimization.fitting.WeightedObservedPoint", "weight", 4.9E-324);
        setField(weightedObservedPoint1, "org.apache.commons.math.optimization.fitting.WeightedObservedPoint", "x", 4.9E-324);
        setField(weightedObservedPoint1, "org.apache.commons.math.optimization.fitting.WeightedObservedPoint", "y", 4.9E-324);
        observations.add(weightedObservedPoint1);
        WeightedObservedPoint weightedObservedPoint2 = ((WeightedObservedPoint) createInstance("org.apache.commons.math.optimization.fitting.WeightedObservedPoint"));
        setField(weightedObservedPoint2, "org.apache.commons.math.optimization.fitting.WeightedObservedPoint", "x", 0.0);
        observations.add(weightedObservedPoint2);
        setField(gaussianFitter, "org.apache.commons.math.optimization.fitting.CurveFitter", "observations", observations);
        
        /* This test fails because method [org.apache.commons.math.optimization.fitting.GaussianFitter.fit] produces [java.lang.NullPointerException]
            org.apache.commons.math.optimization.fitting.CurveFitter.fit(CurveFitter.java:161)
            org.apache.commons.math.optimization.fitting.CurveFitter.fit(CurveFitter.java:126)
            org.apache.commons.math.optimization.fitting.GaussianFitter.fit(GaussianFitter.java:121) */
        gaussianFitter.fit();
    }
    
    @Test
    public void testFit10() throws Exception  {
        GaussianFitter gaussianFitter = ((GaussianFitter) createInstance("org.apache.commons.math.optimization.fitting.GaussianFitter"));
        ArrayList observations = new ArrayList();
        WeightedObservedPoint weightedObservedPoint = ((WeightedObservedPoint) createInstance("org.apache.commons.math.optimization.fitting.WeightedObservedPoint"));
        setField(weightedObservedPoint, "org.apache.commons.math.optimization.fitting.WeightedObservedPoint", "x", 6.339326410507435E-235);
        observations.add(weightedObservedPoint);
        WeightedObservedPoint weightedObservedPoint1 = ((WeightedObservedPoint) createInstance("org.apache.commons.math.optimization.fitting.WeightedObservedPoint"));
        setField(weightedObservedPoint1, "org.apache.commons.math.optimization.fitting.WeightedObservedPoint", "x", -4.249823545864806E-81);
        setField(weightedObservedPoint1, "org.apache.commons.math.optimization.fitting.WeightedObservedPoint", "y", 1.6750496949193285E299);
        observations.add(weightedObservedPoint1);
        WeightedObservedPoint weightedObservedPoint2 = ((WeightedObservedPoint) createInstance("org.apache.commons.math.optimization.fitting.WeightedObservedPoint"));
        setField(weightedObservedPoint2, "org.apache.commons.math.optimization.fitting.WeightedObservedPoint", "x", java.lang.Double.NaN);
        setField(weightedObservedPoint2, "org.apache.commons.math.optimization.fitting.WeightedObservedPoint", "y", -5.488802840311654E303);
        observations.add(weightedObservedPoint2);
        setField(gaussianFitter, "org.apache.commons.math.optimization.fitting.CurveFitter", "observations", observations);
        
        /* This test fails because method [org.apache.commons.math.optimization.fitting.GaussianFitter.fit] produces [java.lang.NullPointerException]
            org.apache.commons.math.optimization.fitting.CurveFitter.fit(CurveFitter.java:161)
            org.apache.commons.math.optimization.fitting.CurveFitter.fit(CurveFitter.java:126)
            org.apache.commons.math.optimization.fitting.GaussianFitter.fit(GaussianFitter.java:121) */
        gaussianFitter.fit();
    }
    
    @Test
    public void testFit11() throws Exception  {
        GaussianFitter gaussianFitter = ((GaussianFitter) createInstance("org.apache.commons.math.optimization.fitting.GaussianFitter"));
        ArrayList observations = new ArrayList();
        WeightedObservedPoint weightedObservedPoint = ((WeightedObservedPoint) createInstance("org.apache.commons.math.optimization.fitting.WeightedObservedPoint"));
        setField(weightedObservedPoint, "org.apache.commons.math.optimization.fitting.WeightedObservedPoint", "x", java.lang.Double.NaN);
        setField(weightedObservedPoint, "org.apache.commons.math.optimization.fitting.WeightedObservedPoint", "y", 2.2250741237566757E-308);
        observations.add(weightedObservedPoint);
        observations.add(null);
        WeightedObservedPoint weightedObservedPoint1 = ((WeightedObservedPoint) createInstance("org.apache.commons.math.optimization.fitting.WeightedObservedPoint"));
        setField(weightedObservedPoint1, "org.apache.commons.math.optimization.fitting.WeightedObservedPoint", "x", 4.9E-324);
        setField(weightedObservedPoint1, "org.apache.commons.math.optimization.fitting.WeightedObservedPoint", "y", 8.000000953674316);
        observations.add(weightedObservedPoint1);
        setField(gaussianFitter, "org.apache.commons.math.optimization.fitting.CurveFitter", "observations", observations);
        
        /* This test fails because method [org.apache.commons.math.optimization.fitting.GaussianFitter.fit] produces [java.lang.NullPointerException]
            org.apache.commons.math.optimization.fitting.GaussianFitter$ParameterGuesser.findMaxY(GaussianFitter.java:199)
            org.apache.commons.math.optimization.fitting.GaussianFitter$ParameterGuesser.basicGuess(GaussianFitter.java:172)
            org.apache.commons.math.optimization.fitting.GaussianFitter$ParameterGuesser.guess(GaussianFitter.java:157)
            org.apache.commons.math.optimization.fitting.GaussianFitter.fit(GaussianFitter.java:120) */
        gaussianFitter.fit();
    }
    
    @Test
    public void testFit12() throws Exception  {
        GaussianFitter gaussianFitter = ((GaussianFitter) createInstance("org.apache.commons.math.optimization.fitting.GaussianFitter"));
        ArrayList observations = new ArrayList();
        observations.add(null);
        observations.add(null);
        WeightedObservedPoint weightedObservedPoint = ((WeightedObservedPoint) createInstance("org.apache.commons.math.optimization.fitting.WeightedObservedPoint"));
        setField(weightedObservedPoint, "org.apache.commons.math.optimization.fitting.WeightedObservedPoint", "x", java.lang.Double.NaN);
        setField(weightedObservedPoint, "org.apache.commons.math.optimization.fitting.WeightedObservedPoint", "y", 1.6526556827781004E122);
        observations.add(weightedObservedPoint);
        WeightedObservedPoint weightedObservedPoint1 = ((WeightedObservedPoint) createInstance("org.apache.commons.math.optimization.fitting.WeightedObservedPoint"));
        setField(weightedObservedPoint1, "org.apache.commons.math.optimization.fitting.WeightedObservedPoint", "x", java.lang.Double.NaN);
        setField(weightedObservedPoint1, "org.apache.commons.math.optimization.fitting.WeightedObservedPoint", "y", -3.465870170449458E128);
        observations.add(weightedObservedPoint1);
        setField(gaussianFitter, "org.apache.commons.math.optimization.fitting.CurveFitter", "observations", observations);
        
        /* This test fails because method [org.apache.commons.math.optimization.fitting.GaussianFitter.fit] produces [java.lang.NullPointerException]
            org.apache.commons.math.optimization.fitting.GaussianFitter$ParameterGuesser.findMaxY(GaussianFitter.java:199)
            org.apache.commons.math.optimization.fitting.GaussianFitter$ParameterGuesser.basicGuess(GaussianFitter.java:172)
            org.apache.commons.math.optimization.fitting.GaussianFitter$ParameterGuesser.guess(GaussianFitter.java:157)
            org.apache.commons.math.optimization.fitting.GaussianFitter.fit(GaussianFitter.java:120) */
        gaussianFitter.fit();
    }
    
    @Test
    public void testFit13() throws Exception  {
        GaussianFitter gaussianFitter = ((GaussianFitter) createInstance("org.apache.commons.math.optimization.fitting.GaussianFitter"));
        ArrayList observations = new ArrayList();
        WeightedObservedPoint weightedObservedPoint = ((WeightedObservedPoint) createInstance("org.apache.commons.math.optimization.fitting.WeightedObservedPoint"));
        setField(weightedObservedPoint, "org.apache.commons.math.optimization.fitting.WeightedObservedPoint", "weight", 4.9E-324);
        setField(weightedObservedPoint, "org.apache.commons.math.optimization.fitting.WeightedObservedPoint", "x", -0.7500000000000001);
        setField(weightedObservedPoint, "org.apache.commons.math.optimization.fitting.WeightedObservedPoint", "y", 2.26906091485307E307);
        observations.add(weightedObservedPoint);
        WeightedObservedPoint weightedObservedPoint1 = ((WeightedObservedPoint) createInstance("org.apache.commons.math.optimization.fitting.WeightedObservedPoint"));
        setField(weightedObservedPoint1, "org.apache.commons.math.optimization.fitting.WeightedObservedPoint", "weight", -3.78576699573368E-270);
        setField(weightedObservedPoint1, "org.apache.commons.math.optimization.fitting.WeightedObservedPoint", "x", java.lang.Double.NaN);
        setField(weightedObservedPoint1, "org.apache.commons.math.optimization.fitting.WeightedObservedPoint", "y", java.lang.Double.NaN);
        observations.add(weightedObservedPoint1);
        observations.add(null);
        observations.add(weightedObservedPoint1);
        WeightedObservedPoint weightedObservedPoint2 = ((WeightedObservedPoint) createInstance("org.apache.commons.math.optimization.fitting.WeightedObservedPoint"));
        observations.add(weightedObservedPoint2);
        observations.add(weightedObservedPoint2);
        observations.add(weightedObservedPoint2);
        setField(gaussianFitter, "org.apache.commons.math.optimization.fitting.CurveFitter", "observations", observations);
        
        /* This test fails because method [org.apache.commons.math.optimization.fitting.GaussianFitter.fit] produces [java.lang.NullPointerException]
            org.apache.commons.math.optimization.fitting.GaussianFitter$ParameterGuesser.findMaxY(GaussianFitter.java:199)
            org.apache.commons.math.optimization.fitting.GaussianFitter$ParameterGuesser.basicGuess(GaussianFitter.java:172)
            org.apache.commons.math.optimization.fitting.GaussianFitter$ParameterGuesser.guess(GaussianFitter.java:157)
            org.apache.commons.math.optimization.fitting.GaussianFitter.fit(GaussianFitter.java:120) */
        gaussianFitter.fit();
    }
    
    @Test
    public void testFit14() throws Exception  {
        GaussianFitter gaussianFitter = ((GaussianFitter) createInstance("org.apache.commons.math.optimization.fitting.GaussianFitter"));
        ArrayList observations = new ArrayList();
        observations.add(null);
        WeightedObservedPoint weightedObservedPoint = ((WeightedObservedPoint) createInstance("org.apache.commons.math.optimization.fitting.WeightedObservedPoint"));
        setField(weightedObservedPoint, "org.apache.commons.math.optimization.fitting.WeightedObservedPoint", "weight", -2.2250738585072024E-308);
        setField(weightedObservedPoint, "org.apache.commons.math.optimization.fitting.WeightedObservedPoint", "x", java.lang.Double.NaN);
        setField(weightedObservedPoint, "org.apache.commons.math.optimization.fitting.WeightedObservedPoint", "y", java.lang.Double.NaN);
        observations.add(weightedObservedPoint);
        WeightedObservedPoint weightedObservedPoint1 = ((WeightedObservedPoint) createInstance("org.apache.commons.math.optimization.fitting.WeightedObservedPoint"));
        setField(weightedObservedPoint1, "org.apache.commons.math.optimization.fitting.WeightedObservedPoint", "weight", 4.9E-324);
        setField(weightedObservedPoint1, "org.apache.commons.math.optimization.fitting.WeightedObservedPoint", "x", java.lang.Double.NaN);
        setField(weightedObservedPoint1, "org.apache.commons.math.optimization.fitting.WeightedObservedPoint", "y", java.lang.Double.NaN);
        observations.add(weightedObservedPoint1);
        WeightedObservedPoint weightedObservedPoint2 = ((WeightedObservedPoint) createInstance("org.apache.commons.math.optimization.fitting.WeightedObservedPoint"));
        setField(weightedObservedPoint2, "org.apache.commons.math.optimization.fitting.WeightedObservedPoint", "x", 0.0);
        observations.add(weightedObservedPoint2);
        WeightedObservedPoint weightedObservedPoint3 = ((WeightedObservedPoint) createInstance("org.apache.commons.math.optimization.fitting.WeightedObservedPoint"));
        observations.add(weightedObservedPoint3);
        observations.add(weightedObservedPoint3);
        observations.add(weightedObservedPoint3);
        setField(gaussianFitter, "org.apache.commons.math.optimization.fitting.CurveFitter", "observations", observations);
        
        /* This test fails because method [org.apache.commons.math.optimization.fitting.GaussianFitter.fit] produces [java.lang.NullPointerException]
            org.apache.commons.math.optimization.fitting.GaussianFitter$ParameterGuesser.findMaxY(GaussianFitter.java:199)
            org.apache.commons.math.optimization.fitting.GaussianFitter$ParameterGuesser.basicGuess(GaussianFitter.java:172)
            org.apache.commons.math.optimization.fitting.GaussianFitter$ParameterGuesser.guess(GaussianFitter.java:157)
            org.apache.commons.math.optimization.fitting.GaussianFitter.fit(GaussianFitter.java:120) */
        gaussianFitter.fit();
    }
    
    @Test
    public void testFit15() throws Exception  {
        GaussianFitter gaussianFitter = ((GaussianFitter) createInstance("org.apache.commons.math.optimization.fitting.GaussianFitter"));
        ArrayList observations = new ArrayList();
        WeightedObservedPoint weightedObservedPoint = ((WeightedObservedPoint) createInstance("org.apache.commons.math.optimization.fitting.WeightedObservedPoint"));
        setField(weightedObservedPoint, "org.apache.commons.math.optimization.fitting.WeightedObservedPoint", "weight", java.lang.Double.NaN);
        setField(weightedObservedPoint, "org.apache.commons.math.optimization.fitting.WeightedObservedPoint", "x", 8.988465674311582E307);
        setField(weightedObservedPoint, "org.apache.commons.math.optimization.fitting.WeightedObservedPoint", "y", java.lang.Double.NaN);
        observations.add(weightedObservedPoint);
        observations.add(null);
        WeightedObservedPoint weightedObservedPoint1 = ((WeightedObservedPoint) createInstance("org.apache.commons.math.optimization.fitting.WeightedObservedPoint"));
        setField(weightedObservedPoint1, "org.apache.commons.math.optimization.fitting.WeightedObservedPoint", "weight", java.lang.Double.NaN);
        setField(weightedObservedPoint1, "org.apache.commons.math.optimization.fitting.WeightedObservedPoint", "x", 8.988465674311582E307);
        setField(weightedObservedPoint1, "org.apache.commons.math.optimization.fitting.WeightedObservedPoint", "y", 1.390671161567E-309);
        observations.add(weightedObservedPoint1);
        WeightedObservedPoint weightedObservedPoint2 = ((WeightedObservedPoint) createInstance("org.apache.commons.math.optimization.fitting.WeightedObservedPoint"));
        setField(weightedObservedPoint2, "org.apache.commons.math.optimization.fitting.WeightedObservedPoint", "x", java.lang.Double.NaN);
        observations.add(weightedObservedPoint2);
        WeightedObservedPoint weightedObservedPoint3 = ((WeightedObservedPoint) createInstance("org.apache.commons.math.optimization.fitting.WeightedObservedPoint"));
        observations.add(weightedObservedPoint3);
        observations.add(weightedObservedPoint3);
        observations.add(weightedObservedPoint3);
        setField(gaussianFitter, "org.apache.commons.math.optimization.fitting.CurveFitter", "observations", observations);
        
        /* This test fails because method [org.apache.commons.math.optimization.fitting.GaussianFitter.fit] produces [java.lang.NullPointerException]
            org.apache.commons.math.optimization.fitting.GaussianFitter$ParameterGuesser.findMaxY(GaussianFitter.java:199)
            org.apache.commons.math.optimization.fitting.GaussianFitter$ParameterGuesser.basicGuess(GaussianFitter.java:172)
            org.apache.commons.math.optimization.fitting.GaussianFitter$ParameterGuesser.guess(GaussianFitter.java:157)
            org.apache.commons.math.optimization.fitting.GaussianFitter.fit(GaussianFitter.java:120) */
        gaussianFitter.fit();
    }
    
    @Test
    public void testFit16() throws Exception  {
        GaussianFitter gaussianFitter = ((GaussianFitter) createInstance("org.apache.commons.math.optimization.fitting.GaussianFitter"));
        ArrayList observations = new ArrayList();
        WeightedObservedPoint weightedObservedPoint = ((WeightedObservedPoint) createInstance("org.apache.commons.math.optimization.fitting.WeightedObservedPoint"));
        setField(weightedObservedPoint, "org.apache.commons.math.optimization.fitting.WeightedObservedPoint", "weight", 4.9E-324);
        setField(weightedObservedPoint, "org.apache.commons.math.optimization.fitting.WeightedObservedPoint", "x", 1.6157307605296582E-39);
        setField(weightedObservedPoint, "org.apache.commons.math.optimization.fitting.WeightedObservedPoint", "y", 1.935461105874223E39);
        observations.add(weightedObservedPoint);
        WeightedObservedPoint weightedObservedPoint1 = ((WeightedObservedPoint) createInstance("org.apache.commons.math.optimization.fitting.WeightedObservedPoint"));
        setField(weightedObservedPoint1, "org.apache.commons.math.optimization.fitting.WeightedObservedPoint", "weight", 0.0);
        setField(weightedObservedPoint1, "org.apache.commons.math.optimization.fitting.WeightedObservedPoint", "x", 1.6157307605296582E-39);
        setField(weightedObservedPoint1, "org.apache.commons.math.optimization.fitting.WeightedObservedPoint", "y", 1.935461105874223E39);
        observations.add(weightedObservedPoint1);
        WeightedObservedPoint weightedObservedPoint2 = ((WeightedObservedPoint) createInstance("org.apache.commons.math.optimization.fitting.WeightedObservedPoint"));
        setField(weightedObservedPoint2, "org.apache.commons.math.optimization.fitting.WeightedObservedPoint", "x", java.lang.Double.NaN);
        setField(weightedObservedPoint2, "org.apache.commons.math.optimization.fitting.WeightedObservedPoint", "y", -7.880416269951426E115);
        observations.add(weightedObservedPoint2);
        WeightedObservedPoint weightedObservedPoint3 = ((WeightedObservedPoint) createInstance("org.apache.commons.math.optimization.fitting.WeightedObservedPoint"));
        observations.add(weightedObservedPoint3);
        observations.add(weightedObservedPoint3);
        observations.add(weightedObservedPoint3);
        observations.add(weightedObservedPoint3);
        observations.add(weightedObservedPoint3);
        observations.add(weightedObservedPoint3);
        observations.add(weightedObservedPoint3);
        setField(gaussianFitter, "org.apache.commons.math.optimization.fitting.CurveFitter", "observations", observations);
        
        /* This test fails because method [org.apache.commons.math.optimization.fitting.GaussianFitter.fit] produces [java.lang.NullPointerException]
            org.apache.commons.math.optimization.fitting.CurveFitter.fit(CurveFitter.java:161)
            org.apache.commons.math.optimization.fitting.CurveFitter.fit(CurveFitter.java:126)
            org.apache.commons.math.optimization.fitting.GaussianFitter.fit(GaussianFitter.java:121) */
        gaussianFitter.fit();
    }
    
    @Test
    public void testFit17() throws Exception  {
        GaussianFitter gaussianFitter = ((GaussianFitter) createInstance("org.apache.commons.math.optimization.fitting.GaussianFitter"));
        ArrayList observations = new ArrayList();
        WeightedObservedPoint weightedObservedPoint = ((WeightedObservedPoint) createInstance("org.apache.commons.math.optimization.fitting.WeightedObservedPoint"));
        setField(weightedObservedPoint, "org.apache.commons.math.optimization.fitting.WeightedObservedPoint", "x", 0.5000000000000002);
        setField(weightedObservedPoint, "org.apache.commons.math.optimization.fitting.WeightedObservedPoint", "y", -2.294609406021356E-308);
        observations.add(weightedObservedPoint);
        WeightedObservedPoint weightedObservedPoint1 = ((WeightedObservedPoint) createInstance("org.apache.commons.math.optimization.fitting.WeightedObservedPoint"));
        setField(weightedObservedPoint1, "org.apache.commons.math.optimization.fitting.WeightedObservedPoint", "weight", java.lang.Double.NaN);
        setField(weightedObservedPoint1, "org.apache.commons.math.optimization.fitting.WeightedObservedPoint", "x", java.lang.Double.NaN);
        setField(weightedObservedPoint1, "org.apache.commons.math.optimization.fitting.WeightedObservedPoint", "y", -6.95355475141543E-310);
        observations.add(weightedObservedPoint1);
        WeightedObservedPoint weightedObservedPoint2 = ((WeightedObservedPoint) createInstance("org.apache.commons.math.optimization.fitting.WeightedObservedPoint"));
        setField(weightedObservedPoint2, "org.apache.commons.math.optimization.fitting.WeightedObservedPoint", "weight", java.lang.Double.NaN);
        setField(weightedObservedPoint2, "org.apache.commons.math.optimization.fitting.WeightedObservedPoint", "x", java.lang.Double.POSITIVE_INFINITY);
        setField(weightedObservedPoint2, "org.apache.commons.math.optimization.fitting.WeightedObservedPoint", "y", -6.95355475141543E-310);
        observations.add(weightedObservedPoint2);
        WeightedObservedPoint weightedObservedPoint3 = ((WeightedObservedPoint) createInstance("org.apache.commons.math.optimization.fitting.WeightedObservedPoint"));
        observations.add(weightedObservedPoint3);
        observations.add(weightedObservedPoint3);
        observations.add(weightedObservedPoint3);
        observations.add(weightedObservedPoint3);
        observations.add(weightedObservedPoint3);
        observations.add(weightedObservedPoint3);
        observations.add(weightedObservedPoint3);
        setField(gaussianFitter, "org.apache.commons.math.optimization.fitting.CurveFitter", "observations", observations);
        
        /* This test fails because method [org.apache.commons.math.optimization.fitting.GaussianFitter.fit] produces [java.lang.NullPointerException]
            org.apache.commons.math.optimization.fitting.CurveFitter.fit(CurveFitter.java:161)
            org.apache.commons.math.optimization.fitting.CurveFitter.fit(CurveFitter.java:126)
            org.apache.commons.math.optimization.fitting.GaussianFitter.fit(GaussianFitter.java:121) */
        gaussianFitter.fit();
    }
    
    @Test
    public void testFit18() throws Exception  {
        GaussianFitter gaussianFitter = ((GaussianFitter) createInstance("org.apache.commons.math.optimization.fitting.GaussianFitter"));
        ArrayList observations = new ArrayList();
        observations.add(null);
        WeightedObservedPoint weightedObservedPoint = ((WeightedObservedPoint) createInstance("org.apache.commons.math.optimization.fitting.WeightedObservedPoint"));
        setField(weightedObservedPoint, "org.apache.commons.math.optimization.fitting.WeightedObservedPoint", "x", 6.703904764138929E153);
        setField(weightedObservedPoint, "org.apache.commons.math.optimization.fitting.WeightedObservedPoint", "y", -2.59916968414089E-113);
        observations.add(weightedObservedPoint);
        WeightedObservedPoint weightedObservedPoint1 = ((WeightedObservedPoint) createInstance("org.apache.commons.math.optimization.fitting.WeightedObservedPoint"));
        setField(weightedObservedPoint1, "org.apache.commons.math.optimization.fitting.WeightedObservedPoint", "x", java.lang.Double.NaN);
        setField(weightedObservedPoint1, "org.apache.commons.math.optimization.fitting.WeightedObservedPoint", "y", 2.397310898374574E-94);
        observations.add(weightedObservedPoint1);
        observations.add(null);
        WeightedObservedPoint weightedObservedPoint2 = ((WeightedObservedPoint) createInstance("org.apache.commons.math.optimization.fitting.WeightedObservedPoint"));
        observations.add(weightedObservedPoint2);
        observations.add(weightedObservedPoint2);
        observations.add(weightedObservedPoint2);
        setField(gaussianFitter, "org.apache.commons.math.optimization.fitting.CurveFitter", "observations", observations);
        
        /* This test fails because method [org.apache.commons.math.optimization.fitting.GaussianFitter.fit] produces [java.lang.NullPointerException]
            org.apache.commons.math.optimization.fitting.GaussianFitter$ParameterGuesser.findMaxY(GaussianFitter.java:199)
            org.apache.commons.math.optimization.fitting.GaussianFitter$ParameterGuesser.basicGuess(GaussianFitter.java:172)
            org.apache.commons.math.optimization.fitting.GaussianFitter$ParameterGuesser.guess(GaussianFitter.java:157)
            org.apache.commons.math.optimization.fitting.GaussianFitter.fit(GaussianFitter.java:120) */
        gaussianFitter.fit();
    }
    
    @Test
    public void testFit19() throws Exception  {
        GaussianFitter gaussianFitter = ((GaussianFitter) createInstance("org.apache.commons.math.optimization.fitting.GaussianFitter"));
        ArrayList observations = new ArrayList();
        WeightedObservedPoint weightedObservedPoint = ((WeightedObservedPoint) createInstance("org.apache.commons.math.optimization.fitting.WeightedObservedPoint"));
        setField(weightedObservedPoint, "org.apache.commons.math.optimization.fitting.WeightedObservedPoint", "weight", 3.83126808219747E53);
        setField(weightedObservedPoint, "org.apache.commons.math.optimization.fitting.WeightedObservedPoint", "x", java.lang.Double.NaN);
        setField(weightedObservedPoint, "org.apache.commons.math.optimization.fitting.WeightedObservedPoint", "y", java.lang.Double.NaN);
        observations.add(weightedObservedPoint);
        observations.add(null);
        WeightedObservedPoint weightedObservedPoint1 = ((WeightedObservedPoint) createInstance("org.apache.commons.math.optimization.fitting.WeightedObservedPoint"));
        setField(weightedObservedPoint1, "org.apache.commons.math.optimization.fitting.WeightedObservedPoint", "weight", 4.90402314521276E55);
        setField(weightedObservedPoint1, "org.apache.commons.math.optimization.fitting.WeightedObservedPoint", "x", java.lang.Double.POSITIVE_INFINITY);
        setField(weightedObservedPoint1, "org.apache.commons.math.optimization.fitting.WeightedObservedPoint", "y", java.lang.Double.POSITIVE_INFINITY);
        observations.add(weightedObservedPoint1);
        observations.add(null);
        WeightedObservedPoint weightedObservedPoint2 = ((WeightedObservedPoint) createInstance("org.apache.commons.math.optimization.fitting.WeightedObservedPoint"));
        observations.add(weightedObservedPoint2);
        observations.add(weightedObservedPoint2);
        observations.add(weightedObservedPoint2);
        setField(gaussianFitter, "org.apache.commons.math.optimization.fitting.CurveFitter", "observations", observations);
        
        /* This test fails because method [org.apache.commons.math.optimization.fitting.GaussianFitter.fit] produces [java.lang.NullPointerException]
            org.apache.commons.math.optimization.fitting.GaussianFitter$ParameterGuesser.findMaxY(GaussianFitter.java:199)
            org.apache.commons.math.optimization.fitting.GaussianFitter$ParameterGuesser.basicGuess(GaussianFitter.java:172)
            org.apache.commons.math.optimization.fitting.GaussianFitter$ParameterGuesser.guess(GaussianFitter.java:157)
            org.apache.commons.math.optimization.fitting.GaussianFitter.fit(GaussianFitter.java:120) */
        gaussianFitter.fit();
    }
    
    @Test
    public void testFit20() throws Exception  {
        GaussianFitter gaussianFitter = ((GaussianFitter) createInstance("org.apache.commons.math.optimization.fitting.GaussianFitter"));
        ArrayList observations = new ArrayList();
        observations.add(null);
        observations.add(null);
        observations.add(null);
        WeightedObservedPoint weightedObservedPoint = ((WeightedObservedPoint) createInstance("org.apache.commons.math.optimization.fitting.WeightedObservedPoint"));
        setField(weightedObservedPoint, "org.apache.commons.math.optimization.fitting.WeightedObservedPoint", "x", 7.378697629498938E19);
        observations.add(weightedObservedPoint);
        WeightedObservedPoint weightedObservedPoint1 = ((WeightedObservedPoint) createInstance("org.apache.commons.math.optimization.fitting.WeightedObservedPoint"));
        setField(weightedObservedPoint1, "org.apache.commons.math.optimization.fitting.WeightedObservedPoint", "x", -1.255420347079908E58);
        observations.add(weightedObservedPoint1);
        WeightedObservedPoint weightedObservedPoint2 = ((WeightedObservedPoint) createInstance("org.apache.commons.math.optimization.fitting.WeightedObservedPoint"));
        observations.add(weightedObservedPoint2);
        observations.add(weightedObservedPoint2);
        setField(gaussianFitter, "org.apache.commons.math.optimization.fitting.CurveFitter", "observations", observations);
        
        /* This test fails because method [org.apache.commons.math.optimization.fitting.GaussianFitter.fit] produces [java.lang.NullPointerException]
            org.apache.commons.math.optimization.fitting.GaussianFitter$ParameterGuesser.findMaxY(GaussianFitter.java:199)
            org.apache.commons.math.optimization.fitting.GaussianFitter$ParameterGuesser.basicGuess(GaussianFitter.java:172)
            org.apache.commons.math.optimization.fitting.GaussianFitter$ParameterGuesser.guess(GaussianFitter.java:157)
            org.apache.commons.math.optimization.fitting.GaussianFitter.fit(GaussianFitter.java:120) */
        gaussianFitter.fit();
    }
    
    @Test
    public void testFit21() throws Exception  {
        GaussianFitter gaussianFitter = ((GaussianFitter) createInstance("org.apache.commons.math.optimization.fitting.GaussianFitter"));
        ArrayList observations = new ArrayList();
        WeightedObservedPoint weightedObservedPoint = ((WeightedObservedPoint) createInstance("org.apache.commons.math.optimization.fitting.WeightedObservedPoint"));
        setField(weightedObservedPoint, "org.apache.commons.math.optimization.fitting.WeightedObservedPoint", "x", java.lang.Double.NaN);
        setField(weightedObservedPoint, "org.apache.commons.math.optimization.fitting.WeightedObservedPoint", "y", 2.2250738585072024E-308);
        observations.add(weightedObservedPoint);
        WeightedObservedPoint weightedObservedPoint1 = ((WeightedObservedPoint) createInstance("org.apache.commons.math.optimization.fitting.WeightedObservedPoint"));
        setField(weightedObservedPoint1, "org.apache.commons.math.optimization.fitting.WeightedObservedPoint", "x", 4.9E-324);
        setField(weightedObservedPoint1, "org.apache.commons.math.optimization.fitting.WeightedObservedPoint", "y", 4.9E-324);
        observations.add(weightedObservedPoint1);
        observations.add(null);
        observations.add(null);
        observations.add(null);
        observations.add(null);
        observations.add(null);
        setField(gaussianFitter, "org.apache.commons.math.optimization.fitting.CurveFitter", "observations", observations);
        
        /* This test fails because method [org.apache.commons.math.optimization.fitting.GaussianFitter.fit] produces [java.lang.NullPointerException]
            org.apache.commons.math.optimization.fitting.GaussianFitter$ParameterGuesser.findMaxY(GaussianFitter.java:199)
            org.apache.commons.math.optimization.fitting.GaussianFitter$ParameterGuesser.basicGuess(GaussianFitter.java:172)
            org.apache.commons.math.optimization.fitting.GaussianFitter$ParameterGuesser.guess(GaussianFitter.java:157)
            org.apache.commons.math.optimization.fitting.GaussianFitter.fit(GaussianFitter.java:120) */
        gaussianFitter.fit();
    }
    
    @Test
    public void testFit22() throws Exception  {
        GaussianFitter gaussianFitter = ((GaussianFitter) createInstance("org.apache.commons.math.optimization.fitting.GaussianFitter"));
        ArrayList observations = new ArrayList();
        observations.add(null);
        observations.add(null);
        observations.add(null);
        WeightedObservedPoint weightedObservedPoint = ((WeightedObservedPoint) createInstance("org.apache.commons.math.optimization.fitting.WeightedObservedPoint"));
        observations.add(weightedObservedPoint);
        observations.add(null);
        observations.add(null);
        observations.add(null);
        setField(gaussianFitter, "org.apache.commons.math.optimization.fitting.CurveFitter", "observations", observations);
        
        /* This test fails because method [org.apache.commons.math.optimization.fitting.GaussianFitter.fit] produces [java.lang.NullPointerException]
            org.apache.commons.math.optimization.fitting.GaussianFitter$ParameterGuesser.findMaxY(GaussianFitter.java:199)
            org.apache.commons.math.optimization.fitting.GaussianFitter$ParameterGuesser.basicGuess(GaussianFitter.java:172)
            org.apache.commons.math.optimization.fitting.GaussianFitter$ParameterGuesser.guess(GaussianFitter.java:157)
            org.apache.commons.math.optimization.fitting.GaussianFitter.fit(GaussianFitter.java:120) */
        gaussianFitter.fit();
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
        
                java.lang.reflect.Method methodForGetDeclaredFields734532306454400 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields734532306454400.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass734532306460400 = (java.lang.reflect.Field[]) methodForGetDeclaredFields734532306454400.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass734532306460400).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
        modifiersField.setAccessible(true);
        modifiersField.setInt(field, field.getModifiers() & ~java.lang.reflect.Modifier.FINAL);
    
        field.setAccessible(true);
        field.set(object, fieldValue);
    }
    
    private static Object getUnsafeInstance() throws ClassNotFoundException, NoSuchFieldException, IllegalAccessException {
        java.lang.reflect.Field f = Class.forName("sun.misc.Unsafe").getDeclaredField("theUnsafe");
        f.setAccessible(true);
        return f.get(null);
    }
    ///endregion
}

