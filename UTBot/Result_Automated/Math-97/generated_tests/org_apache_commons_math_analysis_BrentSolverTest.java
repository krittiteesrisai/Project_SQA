package org.apache.commons.math.analysis;

import org.junit.Test;
import java.lang.reflect.Method;
import org.apache.commons.math.MaxIterationsExceededException;
import org.apache.commons.math.ArgumentOutsideDomainException;
import org.apache.commons.math.FunctionEvaluationException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public final class org_apache_commons_math_analysis_BrentSolverTest {
    ///region Test suites for executable org.apache.commons.math.analysis.BrentSolver.solve
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method solve(double, double, double, double, double, double)
    
    /**
    @utbot.classUnderTest {@link BrentSolver}
 * @utbot.methodUnderTest {@link org.apache.commons.math.analysis.BrentSolver#solve(double,double,double,double,double,double)}
 * @utbot.iterates iterate the loop {@code while(i < maximalIterationCount)} once
 *  */
    @Test
    public void testSolve_MathAbsLessThanMathAbs() throws Exception  {
        BrentSolver brentSolver = ((BrentSolver) createInstance("org.apache.commons.math.analysis.BrentSolver"));
        brentSolver.functionValueAccuracy = 5.696189077778437E-306;
        brentSolver.maximalIterationCount = 1;
        brentSolver.result = 0.0;
        
        Class brentSolverClazz = Class.forName("org.apache.commons.math.analysis.BrentSolver");
        Class doubleType = double.class;
        Method solveMethod = brentSolverClazz.getDeclaredMethod("solve", doubleType, doubleType, doubleType, doubleType, doubleType, doubleType);
        solveMethod.setAccessible(true);
        java.lang.Object[] solveMethodArguments = new java.lang.Object[6];
        solveMethodArguments[0] = java.lang.Double.NaN;
        solveMethodArguments[1] = java.lang.Double.NaN;
        solveMethodArguments[2] = java.lang.Double.NaN;
        solveMethodArguments[3] = -1.139237817677685E-305;
        solveMethodArguments[4] = java.lang.Double.NaN;
        solveMethodArguments[5] = 2.8480945395523415E-306;
        double actual = ((Double) solveMethod.invoke(brentSolver, solveMethodArguments));
        
        assertEquals(java.lang.Double.NaN, actual, 1.0E-6);
        
        boolean finalBrentSolverResultComputed = brentSolver.resultComputed;
        double finalBrentSolverResult = brentSolver.result;
        
        assertTrue(finalBrentSolverResultComputed);
        
        assertEquals(java.lang.Double.NaN, finalBrentSolverResult, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link BrentSolver}
 * @utbot.methodUnderTest {@link org.apache.commons.math.analysis.BrentSolver#solve(double,double,double,double,double,double)}
 * @utbot.iterates iterate the loop {@code while(i < maximalIterationCount)} once
 *  */
    @Test
    public void testSolve_MathAbsGreaterOrEqualMathAbs() throws Exception  {
        BrentSolver brentSolver = ((BrentSolver) createInstance("org.apache.commons.math.analysis.BrentSolver"));
        brentSolver.functionValueAccuracy = 0.0;
        brentSolver.maximalIterationCount = 1;
        brentSolver.result = 0.0;
        
        Class brentSolverClazz = Class.forName("org.apache.commons.math.analysis.BrentSolver");
        Class doubleType = double.class;
        Method solveMethod = brentSolverClazz.getDeclaredMethod("solve", doubleType, doubleType, doubleType, doubleType, doubleType, doubleType);
        solveMethod.setAccessible(true);
        java.lang.Object[] solveMethodArguments = new java.lang.Object[6];
        solveMethodArguments[0] = java.lang.Double.NaN;
        solveMethodArguments[1] = java.lang.Double.NaN;
        solveMethodArguments[2] = java.lang.Double.NaN;
        solveMethodArguments[3] = -0.0;
        solveMethodArguments[4] = java.lang.Double.NaN;
        solveMethodArguments[5] = -0.0;
        double actual = ((Double) solveMethod.invoke(brentSolver, solveMethodArguments));
        
        assertEquals(java.lang.Double.NaN, actual, 1.0E-6);
        
        boolean finalBrentSolverResultComputed = brentSolver.resultComputed;
        double finalBrentSolverResult = brentSolver.result;
        
        assertTrue(finalBrentSolverResultComputed);
        
        assertEquals(java.lang.Double.NaN, finalBrentSolverResult, 1.0E-6);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: CHECKED EXCEPTIONS for method solve(double, double, double, double, double, double)
    
    /**
    @utbot.classUnderTest {@link BrentSolver}
 * @utbot.methodUnderTest {@link org.apache.commons.math.analysis.BrentSolver#solve(double,double,double,double,double,double)}
 * @utbot.throwsException {@link org.apache.commons.math.MaxIterationsExceededException} in: throw new MaxIterationsExceededException(maximalIterationCount);
 *  */
    @Test(expected = MaxIterationsExceededException.class)
    public void testSolve_ThrowMaxIterationsExceededException() throws Throwable  {
        BrentSolver brentSolver = ((BrentSolver) createInstance("org.apache.commons.math.analysis.BrentSolver"));
        
        Class brentSolverClazz = Class.forName("org.apache.commons.math.analysis.BrentSolver");
        Class doubleType = double.class;
        Method solveMethod = brentSolverClazz.getDeclaredMethod("solve", doubleType, doubleType, doubleType, doubleType, doubleType, doubleType);
        solveMethod.setAccessible(true);
        java.lang.Object[] solveMethodArguments = new java.lang.Object[6];
        solveMethodArguments[0] = java.lang.Double.NaN;
        solveMethodArguments[1] = java.lang.Double.NaN;
        solveMethodArguments[2] = java.lang.Double.NaN;
        solveMethodArguments[3] = java.lang.Double.NaN;
        solveMethodArguments[4] = java.lang.Double.NaN;
        solveMethodArguments[5] = java.lang.Double.NaN;
        try {
            solveMethod.invoke(brentSolver, solveMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.analysis.BrentSolver.solve
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method solve(double, double)
    
    /**
    @utbot.classUnderTest {@link BrentSolver}
 * @utbot.methodUnderTest {@link org.apache.commons.math.analysis.BrentSolver#solve(double,double)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: verifyInterval(min, max);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testSolve_ThrowIllegalArgumentException() throws Exception  {
        BrentSolver brentSolver = ((BrentSolver) createInstance("org.apache.commons.math.analysis.BrentSolver"));
        
        brentSolver.solve(0.0, -0.0);
    }
    
    /**
    @utbot.classUnderTest {@link BrentSolver}
 * @utbot.methodUnderTest {@link org.apache.commons.math.analysis.BrentSolver#solve(double,double)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: double yMin = f.value(min);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testSolve_ThrowIllegalArgumentException_1() throws Exception  {
        BrentSolver brentSolver = ((BrentSolver) createInstance("org.apache.commons.math.analysis.BrentSolver"));
        PolynomialFunction f = ((PolynomialFunction) createInstance("org.apache.commons.math.analysis.PolynomialFunction"));
        double[] coefficients = {};
        setField(f, "org.apache.commons.math.analysis.PolynomialFunction", "coefficients", coefficients);
        setField(brentSolver, "org.apache.commons.math.analysis.UnivariateRealSolverImpl", "f", f);
        
        brentSolver.solve(-3.062564969062805, 2.8161451761016237E-308);
    }
    
    /**
    @utbot.classUnderTest {@link BrentSolver}
 * @utbot.methodUnderTest {@link org.apache.commons.math.analysis.BrentSolver#solve(double,double)}
 * @utbot.executesCondition {@code (sign >= 0): True}
 * @utbot.invokes {@link org.apache.commons.math.analysis.UnivariateRealFunction#value(double)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(double)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(double)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(double)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(double)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#toString()}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: sign >= 0
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testSolve_ThrowIllegalArgumentException_2() throws Exception  {
        BrentSolver brentSolver = ((BrentSolver) createInstance("org.apache.commons.math.analysis.BrentSolver"));
        PolynomialFunction f = ((PolynomialFunction) createInstance("org.apache.commons.math.analysis.PolynomialFunction"));
        double[] coefficients = {5.148711055350885E-289};
        setField(f, "org.apache.commons.math.analysis.PolynomialFunction", "coefficients", coefficients);
        setField(brentSolver, "org.apache.commons.math.analysis.UnivariateRealSolverImpl", "f", f);
        
        brentSolver.solve(1.9047437952640054E49, 1.6758347233187765E99);
    }
    
    /**
    @utbot.classUnderTest {@link BrentSolver}
 * @utbot.methodUnderTest {@link org.apache.commons.math.analysis.BrentSolver#solve(double,double)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: double yMin = f.value(min);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testSolve_ThrowIllegalArgumentException_3() throws Exception  {
        BrentSolver brentSolver = ((BrentSolver) createInstance("org.apache.commons.math.analysis.BrentSolver"));
        PolynomialSplineFunction f = ((PolynomialSplineFunction) createInstance("org.apache.commons.math.analysis.PolynomialSplineFunction"));
        double[] knots = {2.2268328987302706E-308, -2.0010454813018446, 3.3376128341190517E-308, 0.0};
        setField(f, "org.apache.commons.math.analysis.PolynomialSplineFunction", "knots", knots);
        org.apache.commons.math.analysis.PolynomialFunction[] polynomials = new org.apache.commons.math.analysis.PolynomialFunction[2];
        PolynomialFunction polynomialFunction = ((PolynomialFunction) createInstance("org.apache.commons.math.analysis.PolynomialFunction"));
        double[] coefficients = {};
        setField(polynomialFunction, "org.apache.commons.math.analysis.PolynomialFunction", "coefficients", coefficients);
        polynomials[1] = polynomialFunction;
        setField(f, "org.apache.commons.math.analysis.PolynomialSplineFunction", "polynomials", polynomials);
        setField(brentSolver, "org.apache.commons.math.analysis.UnivariateRealSolverImpl", "f", f);
        
        brentSolver.solve(2.2268328987302706E-308, 4.462357152368943E-308);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: CHECKED EXCEPTIONS for method solve(double, double)
    
    /**
    @utbot.classUnderTest {@link BrentSolver}
 * @utbot.methodUnderTest {@link org.apache.commons.math.analysis.BrentSolver#solve(double,double)}
 * @utbot.throwsException {@link org.apache.commons.math.ArgumentOutsideDomainException} in: double yMin = f.value(min);
 *  */
    @Test(expected = ArgumentOutsideDomainException.class)
    public void testSolve_ThrowArgumentOutsideDomainException() throws Exception  {
        BrentSolver brentSolver = ((BrentSolver) createInstance("org.apache.commons.math.analysis.BrentSolver"));
        PolynomialSplineFunction f = ((PolynomialSplineFunction) createInstance("org.apache.commons.math.analysis.PolynomialSplineFunction"));
        double[] knots = {6.970913031249789E-306};
        setField(f, "org.apache.commons.math.analysis.PolynomialSplineFunction", "knots", knots);
        setField(brentSolver, "org.apache.commons.math.analysis.UnivariateRealSolverImpl", "f", f);
        
        brentSolver.solve(-9.141575562352177E-289, 3.1716211470856415E-306);
    }
    
    /**
    @utbot.classUnderTest {@link BrentSolver}
 * @utbot.methodUnderTest {@link org.apache.commons.math.analysis.BrentSolver#solve(double,double)}
 * @utbot.executesCondition {@code (sign >= 0): False}
 * @utbot.invokes org.apache.commons.math.analysis.BrentSolver#solve(double,double,double,double,double,double)
 * @utbot.throwsException {@link org.apache.commons.math.MaxIterationsExceededException} in: ret = solve(min, yMin, max, yMax, min, yMin);
 *  */
    @Test(expected = MaxIterationsExceededException.class)
    public void testSolve_ThrowMaxIterationsExceededException1() throws Exception  {
        BrentSolver brentSolver = ((BrentSolver) createInstance("org.apache.commons.math.analysis.BrentSolver"));
        PolynomialFunction f = ((PolynomialFunction) createInstance("org.apache.commons.math.analysis.PolynomialFunction"));
        double[] coefficients = {java.lang.Double.NaN};
        setField(f, "org.apache.commons.math.analysis.PolynomialFunction", "coefficients", coefficients);
        setField(brentSolver, "org.apache.commons.math.analysis.UnivariateRealSolverImpl", "f", f);
        
        brentSolver.solve(-2.6803731877431394E58, 4.668942883780594E78);
    }
    
    /**
    @utbot.classUnderTest {@link BrentSolver}
 * @utbot.methodUnderTest {@link org.apache.commons.math.analysis.BrentSolver#solve(double,double)}
 * @utbot.throwsException {@link org.apache.commons.math.ArgumentOutsideDomainException} in: double yMin = f.value(min);
 *  */
    @Test(expected = ArgumentOutsideDomainException.class)
    public void testSolve_ThrowArgumentOutsideDomainException_1() throws Exception  {
        BrentSolver brentSolver = ((BrentSolver) createInstance("org.apache.commons.math.analysis.BrentSolver"));
        PolynomialSplineFunction f = ((PolynomialSplineFunction) createInstance("org.apache.commons.math.analysis.PolynomialSplineFunction"));
        double[] knots = {2.1266848941885057E-289, -2.2697588458733486E-308};
        setField(f, "org.apache.commons.math.analysis.PolynomialSplineFunction", "knots", knots);
        setField(f, "org.apache.commons.math.analysis.PolynomialSplineFunction", "n", 1);
        setField(brentSolver, "org.apache.commons.math.analysis.UnivariateRealSolverImpl", "f", f);
        
        brentSolver.solve(2.1266848941885057E-289, 4.48957151046075E-154);
    }
    
    /**
    @utbot.classUnderTest {@link BrentSolver}
 * @utbot.methodUnderTest {@link org.apache.commons.math.analysis.BrentSolver#solve(double,double)}
 * @utbot.throwsException {@link org.apache.commons.math.ArgumentOutsideDomainException} in: double yMax = f.value(max);
 *  */
    @Test(expected = ArgumentOutsideDomainException.class)
    public void testSolve_ThrowArgumentOutsideDomainException_2() throws Exception  {
        BrentSolver brentSolver = ((BrentSolver) createInstance("org.apache.commons.math.analysis.BrentSolver"));
        PolynomialSplineFunction f = ((PolynomialSplineFunction) createInstance("org.apache.commons.math.analysis.PolynomialSplineFunction"));
        double[] knots = {-1.0098969036904325E-226, -1.0487370102928233E-192, -1.9399214224969727E10};
        setField(f, "org.apache.commons.math.analysis.PolynomialSplineFunction", "knots", knots);
        org.apache.commons.math.analysis.PolynomialFunction[] polynomials = new org.apache.commons.math.analysis.PolynomialFunction[2];
        PolynomialFunction polynomialFunction = ((PolynomialFunction) createInstance("org.apache.commons.math.analysis.PolynomialFunction"));
        double[] coefficients = {0.0, 0.0, 0.0};
        setField(polynomialFunction, "org.apache.commons.math.analysis.PolynomialFunction", "coefficients", coefficients);
        polynomials[1] = polynomialFunction;
        setField(f, "org.apache.commons.math.analysis.PolynomialSplineFunction", "polynomials", polynomials);
        setField(brentSolver, "org.apache.commons.math.analysis.UnivariateRealSolverImpl", "f", f);
        
        brentSolver.solve(-1.0098969036904325E-226, 1.4582299665959258E-303);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method solve(double, double)
    
    /**
    @utbot.classUnderTest {@link BrentSolver}
 * @utbot.methodUnderTest {@link org.apache.commons.math.analysis.BrentSolver#solve(double,double)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: double yMin = f.value(min);
 *  */
    @Test
    public void testSolve_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        BrentSolver brentSolver = ((BrentSolver) createInstance("org.apache.commons.math.analysis.BrentSolver"));
        PolynomialSplineFunction f = ((PolynomialSplineFunction) createInstance("org.apache.commons.math.analysis.PolynomialSplineFunction"));
        double[] knots = {2.225073858507202E-308};
        setField(f, "org.apache.commons.math.analysis.PolynomialSplineFunction", "knots", knots);
        setField(f, "org.apache.commons.math.analysis.PolynomialSplineFunction", "n", 1073741824);
        setField(brentSolver, "org.apache.commons.math.analysis.UnivariateRealSolverImpl", "f", f);
        
        /* This test fails because method [org.apache.commons.math.analysis.BrentSolver.solve] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1073741824 out of bounds for length 1]
            org.apache.commons.math.analysis.PolynomialSplineFunction.value(PolynomialSplineFunction.java:135)
            org.apache.commons.math.analysis.BrentSolver.solve(BrentSolver.java:133) */
        brentSolver.solve(2.225073858507202E-308, 1.2883870085280594E-231);
    }
    
    /**
    @utbot.classUnderTest {@link BrentSolver}
 * @utbot.methodUnderTest {@link org.apache.commons.math.analysis.BrentSolver#solve(double,double)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: double yMin = f.value(min);
 *  */
    @Test
    public void testSolve_ThrowArrayIndexOutOfBoundsException_1() throws Exception  {
        BrentSolver brentSolver = ((BrentSolver) createInstance("org.apache.commons.math.analysis.BrentSolver"));
        PolynomialSplineFunction f = ((PolynomialSplineFunction) createInstance("org.apache.commons.math.analysis.PolynomialSplineFunction"));
        double[] knots = {};
        setField(f, "org.apache.commons.math.analysis.PolynomialSplineFunction", "knots", knots);
        setField(brentSolver, "org.apache.commons.math.analysis.UnivariateRealSolverImpl", "f", f);
        
        /* This test fails because method [org.apache.commons.math.analysis.BrentSolver.solve] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.analysis.PolynomialSplineFunction.value(PolynomialSplineFunction.java:135)
            org.apache.commons.math.analysis.BrentSolver.solve(BrentSolver.java:133) */
        brentSolver.solve(-4.886639094465674E-103, 2.599194941055856E-103);
    }
    
    /**
    @utbot.classUnderTest {@link BrentSolver}
 * @utbot.methodUnderTest {@link org.apache.commons.math.analysis.BrentSolver#solve(double,double)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: double yMin = f.value(min);
 *  */
    @Test
    public void testSolve_ThrowNullPointerException() throws Exception  {
        BrentSolver brentSolver = ((BrentSolver) createInstance("org.apache.commons.math.analysis.BrentSolver"));
        
        /* This test fails because method [org.apache.commons.math.analysis.BrentSolver.solve] produces [java.lang.NullPointerException]
            org.apache.commons.math.analysis.BrentSolver.solve(BrentSolver.java:133) */
        brentSolver.solve(-3.450667008E10, 6.594615780191526E-288);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method solve(double, double)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.math.analysis.BrentSolver}
     * @utbot.methodUnderTest {@link org.apache.commons.math.analysis.BrentSolver#solve(double,double)}
     */
    @Test
    public void testSolveReturnsInfinityWithCornerCase() throws MaxIterationsExceededException, FunctionEvaluationException  {
        double[] doubleArray = {java.lang.Double.NaN, 0.0, java.lang.Double.NaN};
        double[] doubleArray1 = {1.0, 0.0};
        PolynomialFunctionNewtonForm polynomialFunctionNewtonForm = new PolynomialFunctionNewtonForm(doubleArray, doubleArray1);
        BrentSolver brentSolver = new BrentSolver(polynomialFunctionNewtonForm);
        brentSolver.setFunctionValueAccuracy(java.lang.Double.NEGATIVE_INFINITY);
        brentSolver.setMaximalIterationCount(1);
        brentSolver.setAbsoluteAccuracy(java.lang.Double.NEGATIVE_INFINITY);
        
        double actual = brentSolver.solve(1.0, java.lang.Double.POSITIVE_INFINITY);
        
        assertEquals(java.lang.Double.POSITIVE_INFINITY, actual, 1.0E-6);
    }
    ///endregion
    
    ///region FUZZER: CHECKED EXCEPTIONS for method solve(double, double)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.math.analysis.BrentSolver}
     * @utbot.methodUnderTest {@link org.apache.commons.math.analysis.BrentSolver#solve(double,double)}
     */
    @Test(expected = MaxIterationsExceededException.class)
    public void testSolveThrowsMIEEWithCornerCase() throws MaxIterationsExceededException, FunctionEvaluationException  {
        double[] doubleArray = {java.lang.Double.NaN, 0.0, java.lang.Double.NaN};
        double[] doubleArray1 = {1.0, 0.0};
        PolynomialFunctionNewtonForm polynomialFunctionNewtonForm = new PolynomialFunctionNewtonForm(doubleArray, doubleArray1);
        BrentSolver brentSolver = new BrentSolver(polynomialFunctionNewtonForm);
        brentSolver.setAbsoluteAccuracy(java.lang.Double.NEGATIVE_INFINITY);
        brentSolver.setFunctionValueAccuracy(java.lang.Double.NEGATIVE_INFINITY);
        brentSolver.setMaximalIterationCount(1);
        brentSolver.setRelativeAccuracy(-1.0);
        
        brentSolver.solve(1.0, java.lang.Double.POSITIVE_INFINITY);
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method solve(double, double)
    
    @Test(expected = IllegalArgumentException.class)
    public void testSolve1() throws Exception  {
        BrentSolver brentSolver = ((BrentSolver) createInstance("org.apache.commons.math.analysis.BrentSolver"));
        PolynomialSplineFunction f = ((PolynomialSplineFunction) createInstance("org.apache.commons.math.analysis.PolynomialSplineFunction"));
        double[] knots = {0.0, 2.0, java.lang.Double.NaN};
        setField(f, "org.apache.commons.math.analysis.PolynomialSplineFunction", "knots", knots);
        org.apache.commons.math.analysis.PolynomialFunction[] polynomials = new org.apache.commons.math.analysis.PolynomialFunction[9];
        PolynomialFunction polynomialFunction = ((PolynomialFunction) createInstance("org.apache.commons.math.analysis.PolynomialFunction"));
        double[] coefficients = {0.0, 0.0};
        setField(polynomialFunction, "org.apache.commons.math.analysis.PolynomialFunction", "coefficients", coefficients);
        polynomials[0] = polynomialFunction;
        setField(f, "org.apache.commons.math.analysis.PolynomialSplineFunction", "polynomials", polynomials);
        setField(f, "org.apache.commons.math.analysis.PolynomialSplineFunction", "n", 2);
        setField(brentSolver, "org.apache.commons.math.analysis.UnivariateRealSolverImpl", "f", f);
        
        brentSolver.solve(2.225073858507202E-308, 4.450147717014403E-308);
    }
    ///endregion
    
    ///region OTHER: CHECKED EXCEPTIONS for method solve(double, double)
    
    @Test(expected = MaxIterationsExceededException.class)
    public void testSolve2() throws Exception  {
        BrentSolver brentSolver = ((BrentSolver) createInstance("org.apache.commons.math.analysis.BrentSolver"));
        PolynomialSplineFunction f = ((PolynomialSplineFunction) createInstance("org.apache.commons.math.analysis.PolynomialSplineFunction"));
        double[] knots = {7.291567034328099E-304, java.lang.Double.NaN, -1.10343781131E-312, 8.0948E-320, -6.832569397630275E38};
        setField(f, "org.apache.commons.math.analysis.PolynomialSplineFunction", "knots", knots);
        org.apache.commons.math.analysis.PolynomialFunction[] polynomials = new org.apache.commons.math.analysis.PolynomialFunction[4];
        PolynomialFunction polynomialFunction = ((PolynomialFunction) createInstance("org.apache.commons.math.analysis.PolynomialFunction"));
        double[] coefficients = new double[16];
        setField(polynomialFunction, "org.apache.commons.math.analysis.PolynomialFunction", "coefficients", coefficients);
        polynomials[3] = polynomialFunction;
        setField(f, "org.apache.commons.math.analysis.PolynomialSplineFunction", "polynomials", polynomials);
        setField(f, "org.apache.commons.math.analysis.PolynomialSplineFunction", "n", 1);
        setField(brentSolver, "org.apache.commons.math.analysis.UnivariateRealSolverImpl", "f", f);
        
        brentSolver.solve(2.576587277208369E-231, java.lang.Double.NaN);
    }
    
    @Test(expected = ArgumentOutsideDomainException.class)
    public void testSolve3() throws Exception  {
        BrentSolver brentSolver = ((BrentSolver) createInstance("org.apache.commons.math.analysis.BrentSolver"));
        PolynomialSplineFunction f = ((PolynomialSplineFunction) createInstance("org.apache.commons.math.analysis.PolynomialSplineFunction"));
        double[] knots = {1.0343988589595455E116, java.lang.Double.NaN, 1.179845842234771E308};
        setField(f, "org.apache.commons.math.analysis.PolynomialSplineFunction", "knots", knots);
        org.apache.commons.math.analysis.PolynomialFunction[] polynomials = new org.apache.commons.math.analysis.PolynomialFunction[1];
        PolynomialFunction polynomialFunction = ((PolynomialFunction) createInstance("org.apache.commons.math.analysis.PolynomialFunction"));
        double[] coefficients = new double[32];
        setField(polynomialFunction, "org.apache.commons.math.analysis.PolynomialFunction", "coefficients", coefficients);
        polynomials[0] = polynomialFunction;
        setField(f, "org.apache.commons.math.analysis.PolynomialSplineFunction", "polynomials", polynomials);
        setField(f, "org.apache.commons.math.analysis.PolynomialSplineFunction", "n", 2);
        setField(brentSolver, "org.apache.commons.math.analysis.UnivariateRealSolverImpl", "f", f);
        
        brentSolver.solve(java.lang.Double.NaN, -8.537839157272044E59);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method solve(double, double)
    
    @Test
    public void testSolve4() throws Exception  {
        BrentSolver brentSolver = ((BrentSolver) createInstance("org.apache.commons.math.analysis.BrentSolver"));
        PolynomialSplineFunction f = ((PolynomialSplineFunction) createInstance("org.apache.commons.math.analysis.PolynomialSplineFunction"));
        double[] knots = {-2.000976562500001, -2.2718299012483846E-269, -3.7862291254939005E-270};
        setField(f, "org.apache.commons.math.analysis.PolynomialSplineFunction", "knots", knots);
        org.apache.commons.math.analysis.PolynomialFunction[] polynomials = new org.apache.commons.math.analysis.PolynomialFunction[1];
        PolynomialFunction polynomialFunction = ((PolynomialFunction) createInstance("org.apache.commons.math.analysis.PolynomialFunction"));
        double[] coefficients = {0.0, 0.0, 0.0};
        setField(polynomialFunction, "org.apache.commons.math.analysis.PolynomialFunction", "coefficients", coefficients);
        polynomials[0] = polynomialFunction;
        setField(f, "org.apache.commons.math.analysis.PolynomialSplineFunction", "polynomials", polynomials);
        setField(f, "org.apache.commons.math.analysis.PolynomialSplineFunction", "n", 2);
        setField(brentSolver, "org.apache.commons.math.analysis.UnivariateRealSolverImpl", "f", f);
        
        /* This test fails because method [org.apache.commons.math.analysis.BrentSolver.solve] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math.analysis.PolynomialSplineFunction.value(PolynomialSplineFunction.java:148)
            org.apache.commons.math.analysis.BrentSolver.solve(BrentSolver.java:134) */
        brentSolver.solve(-7.575231029549131E-270, java.lang.Double.NaN);
    }
    
    @Test
    public void testSolve5() throws Exception  {
        BrentSolver brentSolver = ((BrentSolver) createInstance("org.apache.commons.math.analysis.BrentSolver"));
        PolynomialSplineFunction f = ((PolynomialSplineFunction) createInstance("org.apache.commons.math.analysis.PolynomialSplineFunction"));
        double[] knots = new double[21];
        knots[0] = -2.8480945388892178E-306;
        knots[4] = -4.9E-324;
        knots[10] = 2.2250738585072014E-308;
        knots[16] = java.lang.Double.NaN;
        setField(f, "org.apache.commons.math.analysis.PolynomialSplineFunction", "knots", knots);
        org.apache.commons.math.analysis.PolynomialFunction[] polynomials = new org.apache.commons.math.analysis.PolynomialFunction[13];
        PolynomialFunction polynomialFunction = ((PolynomialFunction) createInstance("org.apache.commons.math.analysis.PolynomialFunction"));
        double[] coefficients = {
            0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0, 0.0
        };
        setField(polynomialFunction, "org.apache.commons.math.analysis.PolynomialFunction", "coefficients", coefficients);
        polynomials[4] = polynomialFunction;
        setField(f, "org.apache.commons.math.analysis.PolynomialSplineFunction", "polynomials", polynomials);
        setField(f, "org.apache.commons.math.analysis.PolynomialSplineFunction", "n", 16);
        setField(brentSolver, "org.apache.commons.math.analysis.UnivariateRealSolverImpl", "f", f);
        
        /* This test fails because method [org.apache.commons.math.analysis.BrentSolver.solve] produces [java.lang.ArrayIndexOutOfBoundsException: Index 19 out of bounds for length 13]
            org.apache.commons.math.analysis.PolynomialSplineFunction.value(PolynomialSplineFunction.java:148)
            org.apache.commons.math.analysis.BrentSolver.solve(BrentSolver.java:134) */
        brentSolver.solve(-4.9E-324, 2.225073859543332E-308);
    }
    
    @Test
    public void testSolve6() throws Exception  {
        BrentSolver brentSolver = ((BrentSolver) createInstance("org.apache.commons.math.analysis.BrentSolver"));
        PolynomialSplineFunction f = ((PolynomialSplineFunction) createInstance("org.apache.commons.math.analysis.PolynomialSplineFunction"));
        double[] knots = {
            -1.4919306095931805E-154, -2.82724109209258E-309, java.lang.Double.NaN, 2.5077979677164594E-308, java.lang.Double.NaN, 0.0,
            0.0
        };
        setField(f, "org.apache.commons.math.analysis.PolynomialSplineFunction", "knots", knots);
        setField(f, "org.apache.commons.math.analysis.PolynomialSplineFunction", "n", 4);
        setField(brentSolver, "org.apache.commons.math.analysis.UnivariateRealSolverImpl", "f", f);
        
        /* This test fails because method [org.apache.commons.math.analysis.BrentSolver.solve] produces [java.lang.NullPointerException]
            org.apache.commons.math.analysis.PolynomialSplineFunction.value(PolynomialSplineFunction.java:145)
            org.apache.commons.math.analysis.BrentSolver.solve(BrentSolver.java:133) */
        brentSolver.solve(2.827241092092586E-309, 2.2541255950927734);
    }
    
    @Test
    public void testSolve7() throws Exception  {
        BrentSolver brentSolver = ((BrentSolver) createInstance("org.apache.commons.math.analysis.BrentSolver"));
        PolynomialSplineFunction f = ((PolynomialSplineFunction) createInstance("org.apache.commons.math.analysis.PolynomialSplineFunction"));
        double[] knots = {-1.326248644E-315, -2.0000000000001137, java.lang.Double.NaN};
        setField(f, "org.apache.commons.math.analysis.PolynomialSplineFunction", "knots", knots);
        setField(brentSolver, "org.apache.commons.math.analysis.UnivariateRealSolverImpl", "f", f);
        
        /* This test fails because method [org.apache.commons.math.analysis.BrentSolver.solve] produces [java.lang.NullPointerException]
            org.apache.commons.math.analysis.PolynomialSplineFunction.value(PolynomialSplineFunction.java:145)
            org.apache.commons.math.analysis.BrentSolver.solve(BrentSolver.java:133) */
        brentSolver.solve(java.lang.Double.NaN, 7.847963431540118E297);
    }
    
    @Test
    public void testSolve8() throws Exception  {
        BrentSolver brentSolver = ((BrentSolver) createInstance("org.apache.commons.math.analysis.BrentSolver"));
        PolynomialSplineFunction f = ((PolynomialSplineFunction) createInstance("org.apache.commons.math.analysis.PolynomialSplineFunction"));
        double[] knots = {-1.3394266337923743E300, 0.0, -1.3408012516855594E154, 0.0, 0.5000076293945314};
        setField(f, "org.apache.commons.math.analysis.PolynomialSplineFunction", "knots", knots);
        org.apache.commons.math.analysis.PolynomialFunction[] polynomials = new org.apache.commons.math.analysis.PolynomialFunction[11];
        PolynomialFunction polynomialFunction = ((PolynomialFunction) createInstance("org.apache.commons.math.analysis.PolynomialFunction"));
        double[] coefficients = {0.0, 0.0};
        setField(polynomialFunction, "org.apache.commons.math.analysis.PolynomialFunction", "coefficients", coefficients);
        polynomials[2] = polynomialFunction;
        setField(f, "org.apache.commons.math.analysis.PolynomialSplineFunction", "polynomials", polynomials);
        setField(f, "org.apache.commons.math.analysis.PolynomialSplineFunction", "n", 4);
        setField(brentSolver, "org.apache.commons.math.analysis.UnivariateRealSolverImpl", "f", f);
        
        /* This test fails because method [org.apache.commons.math.analysis.BrentSolver.solve] produces [java.lang.NullPointerException]
            org.apache.commons.math.analysis.PolynomialSplineFunction.value(PolynomialSplineFunction.java:148)
            org.apache.commons.math.analysis.BrentSolver.solve(BrentSolver.java:134) */
        brentSolver.solve(-7.458454536448184E-155, java.lang.Double.NaN);
    }
    
    @Test
    public void testSolve9() throws Exception  {
        BrentSolver brentSolver = ((BrentSolver) createInstance("org.apache.commons.math.analysis.BrentSolver"));
        PolynomialSplineFunction f = ((PolynomialSplineFunction) createInstance("org.apache.commons.math.analysis.PolynomialSplineFunction"));
        double[] knots = {-1.0E-323, -1.0E-323, java.lang.Double.NaN};
        setField(f, "org.apache.commons.math.analysis.PolynomialSplineFunction", "knots", knots);
        org.apache.commons.math.analysis.PolynomialFunction[] polynomials = new org.apache.commons.math.analysis.PolynomialFunction[11];
        PolynomialFunction polynomialFunction = ((PolynomialFunction) createInstance("org.apache.commons.math.analysis.PolynomialFunction"));
        double[] coefficients = {0.0, 0.0};
        setField(polynomialFunction, "org.apache.commons.math.analysis.PolynomialFunction", "coefficients", coefficients);
        polynomials[1] = polynomialFunction;
        setField(f, "org.apache.commons.math.analysis.PolynomialSplineFunction", "polynomials", polynomials);
        setField(f, "org.apache.commons.math.analysis.PolynomialSplineFunction", "n", 2);
        setField(brentSolver, "org.apache.commons.math.analysis.UnivariateRealSolverImpl", "f", f);
        
        /* This test fails because method [org.apache.commons.math.analysis.BrentSolver.solve] produces [java.lang.NullPointerException]
            org.apache.commons.math.analysis.PolynomialSplineFunction.value(PolynomialSplineFunction.java:148)
            org.apache.commons.math.analysis.BrentSolver.solve(BrentSolver.java:134) */
        brentSolver.solve(-1.0E-323, java.lang.Double.NaN);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.analysis.BrentSolver.solve
    
    ///region FUZZER: TIMEOUTS for method solve(double, double, double)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.math.analysis.BrentSolver}
     * @utbot.methodUnderTest {@link org.apache.commons.math.analysis.BrentSolver#solve(double,double,double)}
     */
    @Test(timeout = 1000L)
    public void testSolveWithCornerCases() throws MaxIterationsExceededException, FunctionEvaluationException  {
        double[] doubleArray = {java.lang.Double.NEGATIVE_INFINITY, 0.0, java.lang.Double.NEGATIVE_INFINITY, java.lang.Double.NEGATIVE_INFINITY, 0.0};
        PolynomialFunction polynomialFunction = new PolynomialFunction(doubleArray);
        BrentSolver brentSolver = new BrentSolver(polynomialFunction);
        brentSolver.setRelativeAccuracy(0.0);
        brentSolver.setFunctionValueAccuracy(java.lang.Double.NaN);
        brentSolver.setAbsoluteAccuracy(java.lang.Double.NaN);
        brentSolver.setMaximalIterationCount(Integer.MAX_VALUE);
        
        /* This execution may take longer than the 1000 ms timeout
         and therefore fail due to exceeding the timeout. */
        brentSolver.solve(java.lang.Double.NaN, java.lang.Double.NEGATIVE_INFINITY, 0.0);
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
        
                java.lang.reflect.Method methodForGetDeclaredFields788023023159500 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields788023023159500.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass788023023167700 = (java.lang.reflect.Field[]) methodForGetDeclaredFields788023023159500.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass788023023167700).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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

