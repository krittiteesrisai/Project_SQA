package org.apache.commons.math3.optimization.fitting;

import org.junit.Test;
import org.apache.commons.math3.optimization.DifferentiableMultivariateVectorMultiStartOptimizer;
import java.util.ArrayList;
import org.apache.commons.math3.optimization.PointVectorValuePair;
import org.apache.commons.math3.optimization.BaseMultivariateVectorMultiStartOptimizer;
import org.apache.commons.math3.exception.NumberIsTooSmallException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

public final class org_apache_commons_math3_optimization_fitting_HarmonicFitterTest {
    ///region Test suites for executable org.apache.commons.math3.optimization.fitting.HarmonicFitter.fit
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method fit([D)
    
    /**
    @utbot.classUnderTest {@link HarmonicFitter}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.fitting.HarmonicFitter#fit(double[])}
 * @utbot.throwsException {@link java.lang.NegativeArraySizeException} in: return fit(new HarmonicOscillator.Parametric(), initialGuess);
 *  */
    @Test
    public void testFit_ThrowNegativeArraySizeException() throws Exception  {
        HarmonicFitter harmonicFitter = ((HarmonicFitter) createInstance("org.apache.commons.math3.optimization.fitting.HarmonicFitter"));
        DifferentiableMultivariateVectorMultiStartOptimizer optimizer = ((DifferentiableMultivariateVectorMultiStartOptimizer) createInstance("org.apache.commons.math3.optimization.DifferentiableMultivariateVectorMultiStartOptimizer"));
        setField(optimizer, "org.apache.commons.math3.optimization.BaseMultivariateVectorMultiStartOptimizer", "starts", Integer.MIN_VALUE);
        setField(harmonicFitter, "org.apache.commons.math3.optimization.fitting.CurveFitter", "optimizer", optimizer);
        ArrayList observations = new ArrayList();
        setField(harmonicFitter, "org.apache.commons.math3.optimization.fitting.CurveFitter", "observations", observations);
        
        /* This test fails because method [org.apache.commons.math3.optimization.fitting.HarmonicFitter.fit] produces [java.lang.NegativeArraySizeException: -2147483648]
            org.apache.commons.math3.optimization.BaseMultivariateVectorMultiStartOptimizer.optimize(BaseMultivariateVectorMultiStartOptimizer.java:143)
            org.apache.commons.math3.optimization.fitting.CurveFitter.fit(CurveFitter.java:162)
            org.apache.commons.math3.optimization.fitting.CurveFitter.fit(CurveFitter.java:128)
            org.apache.commons.math3.optimization.fitting.HarmonicFitter.fit(HarmonicFitter.java:62) */
        harmonicFitter.fit(null);
    }
    
    /**
    @utbot.classUnderTest {@link HarmonicFitter}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.fitting.HarmonicFitter#fit(double[])}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return fit(new HarmonicOscillator.Parametric(), initialGuess);
 *  */
    @Test
    public void testFit_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        HarmonicFitter harmonicFitter = ((HarmonicFitter) createInstance("org.apache.commons.math3.optimization.fitting.HarmonicFitter"));
        DifferentiableMultivariateVectorMultiStartOptimizer optimizer = ((DifferentiableMultivariateVectorMultiStartOptimizer) createInstance("org.apache.commons.math3.optimization.DifferentiableMultivariateVectorMultiStartOptimizer"));
        org.apache.commons.math3.optimization.PointVectorValuePair[] optima = {null};
        setField(optimizer, "org.apache.commons.math3.optimization.BaseMultivariateVectorMultiStartOptimizer", "optima", optima);
        setField(harmonicFitter, "org.apache.commons.math3.optimization.fitting.CurveFitter", "optimizer", optimizer);
        ArrayList observations = new ArrayList();
        setField(harmonicFitter, "org.apache.commons.math3.optimization.fitting.CurveFitter", "observations", observations);
        
        /* This test fails because method [org.apache.commons.math3.optimization.fitting.HarmonicFitter.fit] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math3.optimization.BaseMultivariateVectorMultiStartOptimizer.optimize(BaseMultivariateVectorMultiStartOptimizer.java:166)
            org.apache.commons.math3.optimization.fitting.CurveFitter.fit(CurveFitter.java:162)
            org.apache.commons.math3.optimization.fitting.CurveFitter.fit(CurveFitter.java:128)
            org.apache.commons.math3.optimization.fitting.HarmonicFitter.fit(HarmonicFitter.java:62) */
        harmonicFitter.fit(null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method fit([D)
    
    /**
    @utbot.classUnderTest {@link HarmonicFitter}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.fitting.HarmonicFitter#fit(double[])}
 * @utbot.invokes {@link org.apache.commons.math3.optimization.fitting.HarmonicFitter#fit(org.apache.commons.math3.analysis.ParametricUnivariateFunction,double[])}
 * @utbot.throwsException {@link java.lang.NegativeArraySizeException} in: return fit(new HarmonicOscillator.Parametric(), initialGuess);
 *  */
    @Test(expected = NegativeArraySizeException.class)
    public void testFit_ThrowNegativeArraySizeException_1() throws Exception  {
        HarmonicFitter harmonicFitter = ((HarmonicFitter) createInstance("org.apache.commons.math3.optimization.fitting.HarmonicFitter"));
        DifferentiableMultivariateVectorMultiStartOptimizer optimizer = ((DifferentiableMultivariateVectorMultiStartOptimizer) createInstance("org.apache.commons.math3.optimization.DifferentiableMultivariateVectorMultiStartOptimizer"));
        BaseMultivariateVectorMultiStartOptimizer optimizer1 = ((BaseMultivariateVectorMultiStartOptimizer) createInstance("org.apache.commons.math3.optimization.BaseMultivariateVectorMultiStartOptimizer"));
        setField(optimizer1, "org.apache.commons.math3.optimization.BaseMultivariateVectorMultiStartOptimizer", "starts", Integer.MIN_VALUE);
        setField(optimizer, "org.apache.commons.math3.optimization.BaseMultivariateVectorMultiStartOptimizer", "optimizer", optimizer1);
        setField(optimizer, "org.apache.commons.math3.optimization.BaseMultivariateVectorMultiStartOptimizer", "starts", 1);
        org.apache.commons.math3.optimization.PointVectorValuePair[] optima = {null};
        setField(optimizer, "org.apache.commons.math3.optimization.BaseMultivariateVectorMultiStartOptimizer", "optima", optima);
        setField(harmonicFitter, "org.apache.commons.math3.optimization.fitting.CurveFitter", "optimizer", optimizer);
        ArrayList observations = new ArrayList();
        setField(harmonicFitter, "org.apache.commons.math3.optimization.fitting.CurveFitter", "observations", observations);
        
        harmonicFitter.fit(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.optimization.fitting.HarmonicFitter.fit
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method fit()
    
    /**
    @utbot.classUnderTest {@link HarmonicFitter}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.fitting.HarmonicFitter#fit()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return fit((new ParameterGuesser(getObservations())).guess());
 *  */
    @Test
    public void testFit_ThrowNullPointerException_3() throws Exception  {
        HarmonicFitter harmonicFitter = ((HarmonicFitter) createInstance("org.apache.commons.math3.optimization.fitting.HarmonicFitter"));
        ArrayList observations = new ArrayList();
        WeightedObservedPoint weightedObservedPoint = ((WeightedObservedPoint) createInstance("org.apache.commons.math3.optimization.fitting.WeightedObservedPoint"));
        setField(weightedObservedPoint, "org.apache.commons.math3.optimization.fitting.WeightedObservedPoint", "x", -3.940013205640163E-268);
        observations.add(weightedObservedPoint);
        WeightedObservedPoint weightedObservedPoint1 = ((WeightedObservedPoint) createInstance("org.apache.commons.math3.optimization.fitting.WeightedObservedPoint"));
        setField(weightedObservedPoint1, "org.apache.commons.math3.optimization.fitting.WeightedObservedPoint", "x", -6.821419417513465E-269);
        observations.add(weightedObservedPoint1);
        WeightedObservedPoint weightedObservedPoint2 = ((WeightedObservedPoint) createInstance("org.apache.commons.math3.optimization.fitting.WeightedObservedPoint"));
        setField(weightedObservedPoint2, "org.apache.commons.math3.optimization.fitting.WeightedObservedPoint", "x", -2.575666936876333E-268);
        observations.add(weightedObservedPoint2);
        observations.add(null);
        observations.add(null);
        observations.add(null);
        observations.add(null);
        setField(harmonicFitter, "org.apache.commons.math3.optimization.fitting.CurveFitter", "observations", observations);
        
        /* This test fails because method [org.apache.commons.math3.optimization.fitting.HarmonicFitter.fit] produces [java.lang.NullPointerException]
            org.apache.commons.math3.optimization.fitting.HarmonicFitter$ParameterGuesser.sortObservations(HarmonicFitter.java:232)
            org.apache.commons.math3.optimization.fitting.HarmonicFitter$ParameterGuesser.guess(HarmonicFitter.java:215)
            org.apache.commons.math3.optimization.fitting.HarmonicFitter.fit(HarmonicFitter.java:77) */
        harmonicFitter.fit();
    }
    
    /**
    @utbot.classUnderTest {@link HarmonicFitter}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.fitting.HarmonicFitter#fit()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return fit((new ParameterGuesser(getObservations())).guess());
 *  */
    @Test
    public void testFit_ThrowNullPointerException_2() throws Exception  {
        HarmonicFitter harmonicFitter = ((HarmonicFitter) createInstance("org.apache.commons.math3.optimization.fitting.HarmonicFitter"));
        ArrayList observations = new ArrayList();
        WeightedObservedPoint weightedObservedPoint = ((WeightedObservedPoint) createInstance("org.apache.commons.math3.optimization.fitting.WeightedObservedPoint"));
        setField(weightedObservedPoint, "org.apache.commons.math3.optimization.fitting.WeightedObservedPoint", "x", 1.0E-323);
        observations.add(weightedObservedPoint);
        WeightedObservedPoint weightedObservedPoint1 = ((WeightedObservedPoint) createInstance("org.apache.commons.math3.optimization.fitting.WeightedObservedPoint"));
        setField(weightedObservedPoint1, "org.apache.commons.math3.optimization.fitting.WeightedObservedPoint", "x", 4.9E-324);
        observations.add(weightedObservedPoint1);
        observations.add(null);
        observations.add(null);
        observations.add(null);
        observations.add(null);
        observations.add(null);
        setField(harmonicFitter, "org.apache.commons.math3.optimization.fitting.CurveFitter", "observations", observations);
        
        /* This test fails because method [org.apache.commons.math3.optimization.fitting.HarmonicFitter.fit] produces [java.lang.NullPointerException]
            org.apache.commons.math3.optimization.fitting.HarmonicFitter$ParameterGuesser.sortObservations(HarmonicFitter.java:232)
            org.apache.commons.math3.optimization.fitting.HarmonicFitter$ParameterGuesser.guess(HarmonicFitter.java:215)
            org.apache.commons.math3.optimization.fitting.HarmonicFitter.fit(HarmonicFitter.java:77) */
        harmonicFitter.fit();
    }
    
    /**
    @utbot.classUnderTest {@link HarmonicFitter}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.fitting.HarmonicFitter#fit()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return fit((new ParameterGuesser(getObservations())).guess());
 *  */
    @Test
    public void testFit_ThrowNullPointerException_1() throws Exception  {
        HarmonicFitter harmonicFitter = ((HarmonicFitter) createInstance("org.apache.commons.math3.optimization.fitting.HarmonicFitter"));
        ArrayList observations = new ArrayList();
        observations.add(null);
        WeightedObservedPoint weightedObservedPoint = ((WeightedObservedPoint) createInstance("org.apache.commons.math3.optimization.fitting.WeightedObservedPoint"));
        setField(weightedObservedPoint, "org.apache.commons.math3.optimization.fitting.WeightedObservedPoint", "x", 0.0);
        observations.add(weightedObservedPoint);
        observations.add(null);
        observations.add(null);
        observations.add(null);
        observations.add(null);
        observations.add(null);
        setField(harmonicFitter, "org.apache.commons.math3.optimization.fitting.CurveFitter", "observations", observations);
        
        /* This test fails because method [org.apache.commons.math3.optimization.fitting.HarmonicFitter.fit] produces [java.lang.NullPointerException]
            org.apache.commons.math3.optimization.fitting.HarmonicFitter$ParameterGuesser.sortObservations(HarmonicFitter.java:232)
            org.apache.commons.math3.optimization.fitting.HarmonicFitter$ParameterGuesser.guess(HarmonicFitter.java:215)
            org.apache.commons.math3.optimization.fitting.HarmonicFitter.fit(HarmonicFitter.java:77) */
        harmonicFitter.fit();
    }
    
    /**
    @utbot.classUnderTest {@link HarmonicFitter}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.fitting.HarmonicFitter#fit()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return fit((new ParameterGuesser(getObservations())).guess());
 *  */
    @Test
    public void testFit_ThrowNullPointerException() throws Exception  {
        HarmonicFitter harmonicFitter = ((HarmonicFitter) createInstance("org.apache.commons.math3.optimization.fitting.HarmonicFitter"));
        ArrayList observations = new ArrayList();
        observations.add(null);
        observations.add(null);
        observations.add(null);
        observations.add(null);
        observations.add(null);
        observations.add(null);
        observations.add(null);
        setField(harmonicFitter, "org.apache.commons.math3.optimization.fitting.CurveFitter", "observations", observations);
        
        /* This test fails because method [org.apache.commons.math3.optimization.fitting.HarmonicFitter.fit] produces [java.lang.NullPointerException]
            org.apache.commons.math3.optimization.fitting.HarmonicFitter$ParameterGuesser.sortObservations(HarmonicFitter.java:232)
            org.apache.commons.math3.optimization.fitting.HarmonicFitter$ParameterGuesser.guess(HarmonicFitter.java:215)
            org.apache.commons.math3.optimization.fitting.HarmonicFitter.fit(HarmonicFitter.java:77) */
        harmonicFitter.fit();
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method fit()
    
    /**
    @utbot.classUnderTest {@link HarmonicFitter}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.fitting.HarmonicFitter#fit()}
 * @utbot.invokes {@link org.apache.commons.math3.optimization.fitting.HarmonicFitter#getObservations()}
 * @utbot.throwsException {@link org.apache.commons.math3.exception.NumberIsTooSmallException} in: return fit((new ParameterGuesser(getObservations())).guess());
 *  */
    @Test(expected = NumberIsTooSmallException.class)
    public void testFit_ThrowNumberIsTooSmallException() throws Exception  {
        HarmonicFitter harmonicFitter = ((HarmonicFitter) createInstance("org.apache.commons.math3.optimization.fitting.HarmonicFitter"));
        ArrayList observations = new ArrayList();
        observations.add(null);
        observations.add(null);
        observations.add(null);
        setField(harmonicFitter, "org.apache.commons.math3.optimization.fitting.CurveFitter", "observations", observations);
        
        harmonicFitter.fit();
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
        
                java.lang.reflect.Method methodForGetDeclaredFields707505982190800 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields707505982190800.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass707505982228500 = (java.lang.reflect.Field[]) methodForGetDeclaredFields707505982190800.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass707505982228500).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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

