package org.apache.commons.math.analysis.solvers;

import org.junit.Test;
import org.apache.commons.math.analysis.polynomials.PolynomialSplineFunction;
import org.apache.commons.math.analysis.UnivariateRealFunction;
import org.apache.commons.math.ArgumentOutsideDomainException;
import org.apache.commons.math.analysis.polynomials.PolynomialFunction;
import java.lang.reflect.Method;
import java.lang.reflect.InvocationTargetException;
import org.apache.commons.math.MaxIterationsExceededException;
import org.apache.commons.math.FunctionEvaluationException;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static java.lang.reflect.Array.get;
import static org.junit.Assert.assertNull;

public final class org_apache_commons_math_analysis_solvers_BrentSolverTest {
    ///region Test suites for executable org.apache.commons.math.analysis.solvers.BrentSolver.solve
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method solve(org.apache.commons.math.analysis.UnivariateRealFunction, double, double)
    
    /**
    @utbot.classUnderTest {@link BrentSolver}
 * @utbot.methodUnderTest {@link org.apache.commons.math.analysis.solvers.BrentSolver#solve(org.apache.commons.math.analysis.UnivariateRealFunction,double,double)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: double yMin = f.value(min);
 *  */
    @Test
    public void testSolve_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        BrentSolver brentSolver = ((BrentSolver) createInstance("org.apache.commons.math.analysis.solvers.BrentSolver"));
        PolynomialSplineFunction polynomialSplineFunction = ((PolynomialSplineFunction) createInstance("org.apache.commons.math.analysis.polynomials.PolynomialSplineFunction"));
        double[] knots = {1.0E-323};
        setField(polynomialSplineFunction, "org.apache.commons.math.analysis.polynomials.PolynomialSplineFunction", "knots", knots);
        setField(polynomialSplineFunction, "org.apache.commons.math.analysis.polynomials.PolynomialSplineFunction", "n", 1073741824);
        
        /* This test fails because method [org.apache.commons.math.analysis.solvers.BrentSolver.solve] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1073741824 out of bounds for length 1]
            org.apache.commons.math.analysis.polynomials.PolynomialSplineFunction.value(PolynomialSplineFunction.java:136)
            org.apache.commons.math.analysis.solvers.BrentSolver.solve(BrentSolver.java:169) */
        brentSolver.solve(polynomialSplineFunction, 1.0E-323, 2.225073858507203E-308);
    }
    
    /**
    @utbot.classUnderTest {@link BrentSolver}
 * @utbot.methodUnderTest {@link org.apache.commons.math.analysis.solvers.BrentSolver#solve(org.apache.commons.math.analysis.UnivariateRealFunction,double,double)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: double yMin = f.value(min);
 *  */
    @Test
    public void testSolve_ThrowArrayIndexOutOfBoundsException_1() throws Exception  {
        BrentSolver brentSolver = ((BrentSolver) createInstance("org.apache.commons.math.analysis.solvers.BrentSolver"));
        PolynomialSplineFunction polynomialSplineFunction = ((PolynomialSplineFunction) createInstance("org.apache.commons.math.analysis.polynomials.PolynomialSplineFunction"));
        double[] knots = {};
        setField(polynomialSplineFunction, "org.apache.commons.math.analysis.polynomials.PolynomialSplineFunction", "knots", knots);
        
        /* This test fails because method [org.apache.commons.math.analysis.solvers.BrentSolver.solve] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.analysis.polynomials.PolynomialSplineFunction.value(PolynomialSplineFunction.java:136)
            org.apache.commons.math.analysis.solvers.BrentSolver.solve(BrentSolver.java:169) */
        brentSolver.solve(polynomialSplineFunction, -131234.125, -1.0761185722323876E-298);
    }
    
    /**
    @utbot.classUnderTest {@link BrentSolver}
 * @utbot.methodUnderTest {@link org.apache.commons.math.analysis.solvers.BrentSolver#solve(org.apache.commons.math.analysis.UnivariateRealFunction,double,double)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: double yMin = f.value(min);
 *  */
    @Test
    public void testSolve_ThrowNullPointerException() throws Exception  {
        BrentSolver brentSolver = ((BrentSolver) createInstance("org.apache.commons.math.analysis.solvers.BrentSolver"));
        
        /* This test fails because method [org.apache.commons.math.analysis.solvers.BrentSolver.solve] produces [java.lang.NullPointerException]
            org.apache.commons.math.analysis.solvers.BrentSolver.solve(BrentSolver.java:169) */
        brentSolver.solve(((UnivariateRealFunction) null), -546.1416625976562, 2.2360933826496845E-308);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: CHECKED EXCEPTIONS for method solve(org.apache.commons.math.analysis.UnivariateRealFunction, double, double)
    
    /**
    @utbot.classUnderTest {@link BrentSolver}
 * @utbot.methodUnderTest {@link org.apache.commons.math.analysis.solvers.BrentSolver#solve(org.apache.commons.math.analysis.UnivariateRealFunction,double,double)}
 * @utbot.throwsException {@link org.apache.commons.math.ArgumentOutsideDomainException} in: double yMin = f.value(min);
 *  */
    @Test(expected = ArgumentOutsideDomainException.class)
    public void testSolve_ThrowArgumentOutsideDomainException() throws Exception  {
        BrentSolver brentSolver = ((BrentSolver) createInstance("org.apache.commons.math.analysis.solvers.BrentSolver"));
        PolynomialSplineFunction polynomialSplineFunction = ((PolynomialSplineFunction) createInstance("org.apache.commons.math.analysis.polynomials.PolynomialSplineFunction"));
        double[] knots = {8.814425907654495E-280, -9.556619718291524E-299};
        setField(polynomialSplineFunction, "org.apache.commons.math.analysis.polynomials.PolynomialSplineFunction", "knots", knots);
        setField(polynomialSplineFunction, "org.apache.commons.math.analysis.polynomials.PolynomialSplineFunction", "n", 1);
        
        brentSolver.solve(polynomialSplineFunction, 8.814425907654495E-280, 1.762885181530902E-279);
    }
    
    /**
    @utbot.classUnderTest {@link BrentSolver}
 * @utbot.methodUnderTest {@link org.apache.commons.math.analysis.solvers.BrentSolver#solve(org.apache.commons.math.analysis.UnivariateRealFunction,double,double)}
 * @utbot.throwsException {@link org.apache.commons.math.ArgumentOutsideDomainException} in: double yMin = f.value(min);
 *  */
    @Test(expected = ArgumentOutsideDomainException.class)
    public void testSolve_ThrowArgumentOutsideDomainException_1() throws Exception  {
        BrentSolver brentSolver = ((BrentSolver) createInstance("org.apache.commons.math.analysis.solvers.BrentSolver"));
        PolynomialSplineFunction polynomialSplineFunction = ((PolynomialSplineFunction) createInstance("org.apache.commons.math.analysis.polynomials.PolynomialSplineFunction"));
        double[] knots = {9.998252045322853E-306};
        setField(polynomialSplineFunction, "org.apache.commons.math.analysis.polynomials.PolynomialSplineFunction", "knots", knots);
        
        brentSolver.solve(polynomialSplineFunction, -42.16607666015625, 5.136139725931126E-307);
    }
    ///endregion
    
    ///region Errors report for solve
    
    public void testSolve_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Exception org.apache.commons.math.MathRuntimeException$4 is not accessible from package org.apache.commons.math.analysis.solvers
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.analysis.solvers.BrentSolver.solve
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method solve(org.apache.commons.math.analysis.UnivariateRealFunction, double, double, double)
    
    /**
    @utbot.classUnderTest {@link BrentSolver}
 * @utbot.methodUnderTest {@link org.apache.commons.math.analysis.solvers.BrentSolver#solve(org.apache.commons.math.analysis.UnivariateRealFunction,double,double,double)}
 * @utbot.returnsFrom {@code return result;}
 *  */
    @Test
    public void testSolve_ReturnResult() throws Exception  {
        BrentSolver brentSolver = ((BrentSolver) createInstance("org.apache.commons.math.analysis.solvers.BrentSolver"));
        brentSolver.functionValueAccuracy = 2.225073858507202E-308;
        brentSolver.result = 0.0;
        PolynomialFunction polynomialFunction = ((PolynomialFunction) createInstance("org.apache.commons.math.analysis.polynomials.PolynomialFunction"));
        double[] coefficients = {2.225073858507202E-308};
        setField(polynomialFunction, "org.apache.commons.math.analysis.polynomials.PolynomialFunction", "coefficients", coefficients);
        
        double actual = brentSolver.solve(polynomialFunction, -8.517975883360175E-270, 2.2275367092296706E-308, -3.786754480275528E-270);
        
        assertEquals(-3.786754480275528E-270, actual, 1.0E-6);
        
        boolean finalBrentSolverResultComputed = brentSolver.resultComputed;
        double finalBrentSolverResult = brentSolver.result;
        
        assertTrue(finalBrentSolverResultComputed);
        
        assertEquals(-3.786754480275528E-270, finalBrentSolverResult, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link BrentSolver}
 * @utbot.methodUnderTest {@link org.apache.commons.math.analysis.solvers.BrentSolver#solve(org.apache.commons.math.analysis.UnivariateRealFunction,double,double,double)}
 * @utbot.returnsFrom {@code return result;}
 *  */
    @Test
    public void testSolve_ReturnResult_1() throws Exception  {
        BrentSolver brentSolver = ((BrentSolver) createInstance("org.apache.commons.math.analysis.solvers.BrentSolver"));
        brentSolver.functionValueAccuracy = 4.9E-324;
        brentSolver.result = 0.0;
        PolynomialSplineFunction polynomialSplineFunction = ((PolynomialSplineFunction) createInstance("org.apache.commons.math.analysis.polynomials.PolynomialSplineFunction"));
        double[] knots = {-8.910737377857198E-307, 0.0, -32.12506198883102, 3.3549941773130216E-308, 0.0};
        setField(polynomialSplineFunction, "org.apache.commons.math.analysis.polynomials.PolynomialSplineFunction", "knots", knots);
        org.apache.commons.math.analysis.polynomials.PolynomialFunction[] polynomials = new org.apache.commons.math.analysis.polynomials.PolynomialFunction[2];
        PolynomialFunction polynomialFunction = ((PolynomialFunction) createInstance("org.apache.commons.math.analysis.polynomials.PolynomialFunction"));
        double[] coefficients = {4.9E-324};
        setField(polynomialFunction, "org.apache.commons.math.analysis.polynomials.PolynomialFunction", "coefficients", coefficients);
        polynomials[1] = polynomialFunction;
        setField(polynomialSplineFunction, "org.apache.commons.math.analysis.polynomials.PolynomialSplineFunction", "polynomials", polynomials);
        
        double actual = brentSolver.solve(polynomialSplineFunction, -1.7821464575936935E-306, 2.492083751027829E-306, -8.910737377857198E-307);
        
        assertEquals(-8.910737377857198E-307, actual, 1.0E-6);
        
        boolean finalBrentSolverResultComputed = brentSolver.resultComputed;
        double finalBrentSolverResult = brentSolver.result;
        
        org.apache.commons.math.analysis.polynomials.PolynomialFunction[] polynomialSplineFunctionPolynomials = ((org.apache.commons.math.analysis.polynomials.PolynomialFunction[]) getFieldValue(polynomialSplineFunction, "org.apache.commons.math.analysis.polynomials.PolynomialSplineFunction", "polynomials"));
        PolynomialFunction finalPolynomialSplineFunctionPolynomials0 = ((PolynomialFunction) get(polynomialSplineFunctionPolynomials, 0));
        
        assertTrue(finalBrentSolverResultComputed);
        
        assertEquals(-8.910737377857198E-307, finalBrentSolverResult, 1.0E-6);
        
        assertNull(finalPolynomialSplineFunctionPolynomials0);
    }
    
    /**
    @utbot.classUnderTest {@link BrentSolver}
 * @utbot.methodUnderTest {@link org.apache.commons.math.analysis.solvers.BrentSolver#solve(org.apache.commons.math.analysis.UnivariateRealFunction,double,double,double)}
 * @utbot.returnsFrom {@code return result;}
 *  */
    @Test
    public void testSolve_ReturnResult_2() throws Exception  {
        BrentSolver brentSolver = ((BrentSolver) createInstance("org.apache.commons.math.analysis.solvers.BrentSolver"));
        brentSolver.functionValueAccuracy = 1.1125369292536007E-308;
        brentSolver.result = 0.0;
        PolynomialSplineFunction polynomialSplineFunction = ((PolynomialSplineFunction) createInstance("org.apache.commons.math.analysis.polynomials.PolynomialSplineFunction"));
        double[] knots = {-2.0522684006491886E-289, -4.9E-324, -1.1125369292536007E-308};
        setField(polynomialSplineFunction, "org.apache.commons.math.analysis.polynomials.PolynomialSplineFunction", "knots", knots);
        org.apache.commons.math.analysis.polynomials.PolynomialFunction[] polynomials = new org.apache.commons.math.analysis.polynomials.PolynomialFunction[1];
        PolynomialFunction polynomialFunction = ((PolynomialFunction) createInstance("org.apache.commons.math.analysis.polynomials.PolynomialFunction"));
        double[] coefficients = {1.1125369292536007E-308};
        setField(polynomialFunction, "org.apache.commons.math.analysis.polynomials.PolynomialFunction", "coefficients", coefficients);
        polynomials[0] = polynomialFunction;
        setField(polynomialSplineFunction, "org.apache.commons.math.analysis.polynomials.PolynomialSplineFunction", "polynomials", polynomials);
        setField(polynomialSplineFunction, "org.apache.commons.math.analysis.polynomials.PolynomialSplineFunction", "n", 2);
        
        double actual = brentSolver.solve(polynomialSplineFunction, -3.3376107877608026E-308, 2.225073858507328E-308, -1.1125369292536007E-308);
        
        assertEquals(-1.1125369292536007E-308, actual, 1.0E-6);
        
        boolean finalBrentSolverResultComputed = brentSolver.resultComputed;
        double finalBrentSolverResult = brentSolver.result;
        
        assertTrue(finalBrentSolverResultComputed);
        
        assertEquals(-1.1125369292536007E-308, finalBrentSolverResult, 1.0E-6);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method solve(org.apache.commons.math.analysis.UnivariateRealFunction, double, double, double)
    
    /**
    @utbot.classUnderTest {@link BrentSolver}
 * @utbot.methodUnderTest {@link org.apache.commons.math.analysis.solvers.BrentSolver#solve(org.apache.commons.math.analysis.UnivariateRealFunction,double,double,double)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: double yInitial = f.value(initial);
 *  */
    @Test
    public void testSolve_ThrowArrayIndexOutOfBoundsException1() throws Exception  {
        BrentSolver brentSolver = ((BrentSolver) createInstance("org.apache.commons.math.analysis.solvers.BrentSolver"));
        PolynomialSplineFunction polynomialSplineFunction = ((PolynomialSplineFunction) createInstance("org.apache.commons.math.analysis.polynomials.PolynomialSplineFunction"));
        double[] knots = {4.450147717014404E-308};
        setField(polynomialSplineFunction, "org.apache.commons.math.analysis.polynomials.PolynomialSplineFunction", "knots", knots);
        setField(polynomialSplineFunction, "org.apache.commons.math.analysis.polynomials.PolynomialSplineFunction", "n", 1073741824);
        
        /* This test fails because method [org.apache.commons.math.analysis.solvers.BrentSolver.solve] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1073741824 out of bounds for length 1]
            org.apache.commons.math.analysis.polynomials.PolynomialSplineFunction.value(PolynomialSplineFunction.java:136)
            org.apache.commons.math.analysis.solvers.BrentSolver.solve(BrentSolver.java:106) */
        brentSolver.solve(polynomialSplineFunction, 4.450147717014403E-308, 2.000000000000057, 4.450147717014404E-308);
    }
    
    /**
    @utbot.classUnderTest {@link BrentSolver}
 * @utbot.methodUnderTest {@link org.apache.commons.math.analysis.solvers.BrentSolver#solve(org.apache.commons.math.analysis.UnivariateRealFunction,double,double,double)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: double yInitial = f.value(initial);
 *  */
    @Test
    public void testSolve_ThrowArrayIndexOutOfBoundsException_11() throws Exception  {
        BrentSolver brentSolver = ((BrentSolver) createInstance("org.apache.commons.math.analysis.solvers.BrentSolver"));
        PolynomialSplineFunction polynomialSplineFunction = ((PolynomialSplineFunction) createInstance("org.apache.commons.math.analysis.polynomials.PolynomialSplineFunction"));
        double[] knots = {};
        setField(polynomialSplineFunction, "org.apache.commons.math.analysis.polynomials.PolynomialSplineFunction", "knots", knots);
        
        /* This test fails because method [org.apache.commons.math.analysis.solvers.BrentSolver.solve] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.analysis.polynomials.PolynomialSplineFunction.value(PolynomialSplineFunction.java:136)
            org.apache.commons.math.analysis.solvers.BrentSolver.solve(BrentSolver.java:106) */
        brentSolver.solve(polynomialSplineFunction, -1.202659719010993E-153, 3.782903965310018E-307, -1.609052064071862E-269);
    }
    
    /**
    @utbot.classUnderTest {@link BrentSolver}
 * @utbot.methodUnderTest {@link org.apache.commons.math.analysis.solvers.BrentSolver#solve(org.apache.commons.math.analysis.UnivariateRealFunction,double,double,double)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: double yInitial = f.value(initial);
 *  */
    @Test
    public void testSolve_ThrowArrayIndexOutOfBoundsException_2() throws Exception  {
        BrentSolver brentSolver = ((BrentSolver) createInstance("org.apache.commons.math.analysis.solvers.BrentSolver"));
        PolynomialSplineFunction polynomialSplineFunction = ((PolynomialSplineFunction) createInstance("org.apache.commons.math.analysis.polynomials.PolynomialSplineFunction"));
        double[] knots = {-3.1524334509642234E-76, 0.0, -7.083837587043709E231, 9.790122097907939E155, 0.0};
        setField(polynomialSplineFunction, "org.apache.commons.math.analysis.polynomials.PolynomialSplineFunction", "knots", knots);
        org.apache.commons.math.analysis.polynomials.PolynomialFunction[] polynomials = {};
        setField(polynomialSplineFunction, "org.apache.commons.math.analysis.polynomials.PolynomialSplineFunction", "polynomials", polynomials);
        
        /* This test fails because method [org.apache.commons.math.analysis.solvers.BrentSolver.solve] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 0]
            org.apache.commons.math.analysis.polynomials.PolynomialSplineFunction.value(PolynomialSplineFunction.java:149)
            org.apache.commons.math.analysis.solvers.BrentSolver.solve(BrentSolver.java:106) */
        brentSolver.solve(polynomialSplineFunction, -1.1232416726969714E-75, 1.7812492977305167E-77, -3.1524334509642234E-76);
    }
    
    /**
    @utbot.classUnderTest {@link BrentSolver}
 * @utbot.methodUnderTest {@link org.apache.commons.math.analysis.solvers.BrentSolver#solve(org.apache.commons.math.analysis.UnivariateRealFunction,double,double,double)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: double yInitial = f.value(initial);
 *  */
    @Test
    public void testSolve_ThrowArrayIndexOutOfBoundsException_3() throws Exception  {
        BrentSolver brentSolver = ((BrentSolver) createInstance("org.apache.commons.math.analysis.solvers.BrentSolver"));
        PolynomialSplineFunction polynomialSplineFunction = ((PolynomialSplineFunction) createInstance("org.apache.commons.math.analysis.polynomials.PolynomialSplineFunction"));
        double[] knots = {-1.0E-323};
        setField(polynomialSplineFunction, "org.apache.commons.math.analysis.polynomials.PolynomialSplineFunction", "knots", knots);
        org.apache.commons.math.analysis.polynomials.PolynomialFunction[] polynomials = {};
        setField(polynomialSplineFunction, "org.apache.commons.math.analysis.polynomials.PolynomialSplineFunction", "polynomials", polynomials);
        
        /* This test fails because method [org.apache.commons.math.analysis.solvers.BrentSolver.solve] produces [java.lang.ArrayIndexOutOfBoundsException: Index -1 out of bounds for length 0]
            org.apache.commons.math.analysis.polynomials.PolynomialSplineFunction.value(PolynomialSplineFunction.java:149)
            org.apache.commons.math.analysis.solvers.BrentSolver.solve(BrentSolver.java:106) */
        brentSolver.solve(polynomialSplineFunction, -2.225073858507202E-308, 1.5E-323, -1.0E-323);
    }
    
    /**
    @utbot.classUnderTest {@link BrentSolver}
 * @utbot.methodUnderTest {@link org.apache.commons.math.analysis.solvers.BrentSolver#solve(org.apache.commons.math.analysis.UnivariateRealFunction,double,double,double)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: double yInitial = f.value(initial);
 *  */
    @Test
    public void testSolve_ThrowNullPointerException1() throws Exception  {
        BrentSolver brentSolver = ((BrentSolver) createInstance("org.apache.commons.math.analysis.solvers.BrentSolver"));
        
        /* This test fails because method [org.apache.commons.math.analysis.solvers.BrentSolver.solve] produces [java.lang.NullPointerException]
            org.apache.commons.math.analysis.solvers.BrentSolver.solve(BrentSolver.java:106) */
        brentSolver.solve(null, -5.463628582366414E61, 1.0422913120382035E-263, -1.3673587253679114E61);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: CHECKED EXCEPTIONS for method solve(org.apache.commons.math.analysis.UnivariateRealFunction, double, double, double)
    
    /**
    @utbot.classUnderTest {@link BrentSolver}
 * @utbot.methodUnderTest {@link org.apache.commons.math.analysis.solvers.BrentSolver#solve(org.apache.commons.math.analysis.UnivariateRealFunction,double,double,double)}
 * @utbot.throwsException {@link org.apache.commons.math.ArgumentOutsideDomainException} in: double yInitial = f.value(initial);
 *  */
    @Test(expected = ArgumentOutsideDomainException.class)
    public void testSolve_ThrowArgumentOutsideDomainException1() throws Exception  {
        BrentSolver brentSolver = ((BrentSolver) createInstance("org.apache.commons.math.analysis.solvers.BrentSolver"));
        PolynomialSplineFunction polynomialSplineFunction = ((PolynomialSplineFunction) createInstance("org.apache.commons.math.analysis.polynomials.PolynomialSplineFunction"));
        double[] knots = {5.785192881124267E-307};
        setField(polynomialSplineFunction, "org.apache.commons.math.analysis.polynomials.PolynomialSplineFunction", "knots", knots);
        
        brentSolver.solve(polynomialSplineFunction, -2.0000000000000004, -7.291128973251727E-303, -4.221273270698736E-226);
    }
    
    /**
    @utbot.classUnderTest {@link BrentSolver}
 * @utbot.methodUnderTest {@link org.apache.commons.math.analysis.solvers.BrentSolver#solve(org.apache.commons.math.analysis.UnivariateRealFunction,double,double,double)}
 * @utbot.throwsException {@link org.apache.commons.math.ArgumentOutsideDomainException} in: double yInitial = f.value(initial);
 *  */
    @Test(expected = ArgumentOutsideDomainException.class)
    public void testSolve_ThrowArgumentOutsideDomainException_11() throws Exception  {
        BrentSolver brentSolver = ((BrentSolver) createInstance("org.apache.commons.math.analysis.solvers.BrentSolver"));
        PolynomialSplineFunction polynomialSplineFunction = ((PolynomialSplineFunction) createInstance("org.apache.commons.math.analysis.polynomials.PolynomialSplineFunction"));
        double[] knots = {2.7275758473506474E39, -9.575284725843028E-299};
        setField(polynomialSplineFunction, "org.apache.commons.math.analysis.polynomials.PolynomialSplineFunction", "knots", knots);
        setField(polynomialSplineFunction, "org.apache.commons.math.analysis.polynomials.PolynomialSplineFunction", "n", 1);
        
        brentSolver.solve(polynomialSplineFunction, -5.455193233076164E39, 5.444517870735017E39, 2.7275758473506474E39);
    }
    
    /**
    @utbot.classUnderTest {@link BrentSolver}
 * @utbot.methodUnderTest {@link org.apache.commons.math.analysis.solvers.BrentSolver#solve(org.apache.commons.math.analysis.UnivariateRealFunction,double,double,double)}
 * @utbot.executesCondition {@code (Math.abs(yInitial) <= functionValueAccuracy): False}
 * @utbot.invokes {@link java.lang.Math#abs(double)}
 * @utbot.invokes {@link org.apache.commons.math.analysis.UnivariateRealFunction#value(double)}
 * @utbot.throwsException {@link org.apache.commons.math.ArgumentOutsideDomainException} in: double yMin = f.value(min);
 *  */
    @Test(expected = ArgumentOutsideDomainException.class)
    public void testSolve_ThrowArgumentOutsideDomainException_2() throws Exception  {
        BrentSolver brentSolver = ((BrentSolver) createInstance("org.apache.commons.math.analysis.solvers.BrentSolver"));
        brentSolver.functionValueAccuracy = java.lang.Double.NaN;
        PolynomialSplineFunction polynomialSplineFunction = ((PolynomialSplineFunction) createInstance("org.apache.commons.math.analysis.polynomials.PolynomialSplineFunction"));
        double[] knots = {-4.000038623809815, 0.0, -512.0010986328163, 2.6815619069042704E154, 0.0};
        setField(polynomialSplineFunction, "org.apache.commons.math.analysis.polynomials.PolynomialSplineFunction", "knots", knots);
        org.apache.commons.math.analysis.polynomials.PolynomialFunction[] polynomials = new org.apache.commons.math.analysis.polynomials.PolynomialFunction[2];
        PolynomialFunction polynomialFunction = ((PolynomialFunction) createInstance("org.apache.commons.math.analysis.polynomials.PolynomialFunction"));
        double[] coefficients = {java.lang.Double.NaN};
        setField(polynomialFunction, "org.apache.commons.math.analysis.polynomials.PolynomialFunction", "coefficients", coefficients);
        polynomials[1] = polynomialFunction;
        setField(polynomialSplineFunction, "org.apache.commons.math.analysis.polynomials.PolynomialSplineFunction", "polynomials", polynomials);
        
        brentSolver.solve(polynomialSplineFunction, -32.008121490478516, 4.778347891203302E-299, -4.000038623809815);
    }
    ///endregion
    
    ///region Errors report for solve
    
    public void testSolve_errors1()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Exception org.apache.commons.math.MathRuntimeException$4 is not accessible from package org.apache.commons.math.analysis.solvers
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.analysis.solvers.BrentSolver.solve
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method solve(org.apache.commons.math.analysis.UnivariateRealFunction, double, double, double, double, double, double)
    
    /**
    @utbot.classUnderTest {@link BrentSolver}
 * @utbot.methodUnderTest {@link org.apache.commons.math.analysis.solvers.BrentSolver#solve(org.apache.commons.math.analysis.UnivariateRealFunction,double,double,double,double,double,double)}
 * @utbot.iterates iterate the loop {@code while(i < maximalIterationCount)} once
 *  */
    @Test
    public void testSolve_MathAbsLessThanMathAbs() throws Exception  {
        BrentSolver brentSolver = ((BrentSolver) createInstance("org.apache.commons.math.analysis.solvers.BrentSolver"));
        brentSolver.functionValueAccuracy = 0.0;
        brentSolver.result = 0.0;
        brentSolver.setMaximalIterationCount(1);
        
        Class brentSolverClazz = Class.forName("org.apache.commons.math.analysis.solvers.BrentSolver");
        Class univariateRealFunctionType = Class.forName("org.apache.commons.math.analysis.UnivariateRealFunction");
        Class doubleType = double.class;
        Method solveMethod = brentSolverClazz.getDeclaredMethod("solve", univariateRealFunctionType, doubleType, doubleType, doubleType, doubleType, doubleType, doubleType);
        solveMethod.setAccessible(true);
        java.lang.Object[] solveMethodArguments = new java.lang.Object[7];
        solveMethodArguments[0] = ((Object) null);
        solveMethodArguments[1] = java.lang.Double.NaN;
        solveMethodArguments[2] = java.lang.Double.NaN;
        solveMethodArguments[3] = java.lang.Double.NaN;
        solveMethodArguments[4] = 2.225073858507202E-308;
        solveMethodArguments[5] = java.lang.Double.NaN;
        solveMethodArguments[6] = -0.0;
        double actual = ((Double) solveMethod.invoke(brentSolver, solveMethodArguments));
        
        assertEquals(java.lang.Double.NaN, actual, 1.0E-6);
        
        boolean finalBrentSolverResultComputed = brentSolver.resultComputed;
        double finalBrentSolverResult = brentSolver.result;
        
        assertTrue(finalBrentSolverResultComputed);
        
        assertEquals(java.lang.Double.NaN, finalBrentSolverResult, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link BrentSolver}
 * @utbot.methodUnderTest {@link org.apache.commons.math.analysis.solvers.BrentSolver#solve(org.apache.commons.math.analysis.UnivariateRealFunction,double,double,double,double,double,double)}
 * @utbot.iterates iterate the loop {@code while(i < maximalIterationCount)} once
 *  */
    @Test
    public void testSolve_MathAbsGreaterOrEqualMathAbs() throws Exception  {
        BrentSolver brentSolver = ((BrentSolver) createInstance("org.apache.commons.math.analysis.solvers.BrentSolver"));
        brentSolver.functionValueAccuracy = 0.0;
        brentSolver.result = 0.0;
        brentSolver.setMaximalIterationCount(1);
        
        Class brentSolverClazz = Class.forName("org.apache.commons.math.analysis.solvers.BrentSolver");
        Class univariateRealFunctionType = Class.forName("org.apache.commons.math.analysis.UnivariateRealFunction");
        Class doubleType = double.class;
        Method solveMethod = brentSolverClazz.getDeclaredMethod("solve", univariateRealFunctionType, doubleType, doubleType, doubleType, doubleType, doubleType, doubleType);
        solveMethod.setAccessible(true);
        java.lang.Object[] solveMethodArguments = new java.lang.Object[7];
        solveMethodArguments[0] = ((Object) null);
        solveMethodArguments[1] = java.lang.Double.NaN;
        solveMethodArguments[2] = java.lang.Double.NaN;
        solveMethodArguments[3] = java.lang.Double.NaN;
        solveMethodArguments[4] = -0.0;
        solveMethodArguments[5] = java.lang.Double.NaN;
        solveMethodArguments[6] = -0.0;
        double actual = ((Double) solveMethod.invoke(brentSolver, solveMethodArguments));
        
        assertEquals(java.lang.Double.NaN, actual, 1.0E-6);
        
        boolean finalBrentSolverResultComputed = brentSolver.resultComputed;
        double finalBrentSolverResult = brentSolver.result;
        
        assertTrue(finalBrentSolverResultComputed);
        
        assertEquals(java.lang.Double.NaN, finalBrentSolverResult, 1.0E-6);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method solve(org.apache.commons.math.analysis.UnivariateRealFunction, double, double, double, double, double, double)
    
    /**
    @utbot.classUnderTest {@link BrentSolver}
 * @utbot.methodUnderTest {@link org.apache.commons.math.analysis.solvers.BrentSolver#solve(org.apache.commons.math.analysis.UnivariateRealFunction,double,double,double,double,double,double)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: throw new MaxIterationsExceededException(maximalIterationCount);
 *  */
    @Test
    public void testSolve_ThrowNullPointerException2() throws Throwable  {
        BrentSolver brentSolver = new BrentSolver();
        
        /* This test fails because method [org.apache.commons.math.analysis.solvers.BrentSolver.solve] produces [java.lang.NullPointerException]
            org.apache.commons.math.analysis.solvers.BrentSolver.solve(BrentSolver.java:304) */
        Class brentSolverClazz = Class.forName("org.apache.commons.math.analysis.solvers.BrentSolver");
        Class univariateRealFunctionType = Class.forName("org.apache.commons.math.analysis.UnivariateRealFunction");
        Class doubleType = double.class;
        Method solveMethod = brentSolverClazz.getDeclaredMethod("solve", univariateRealFunctionType, doubleType, doubleType, doubleType, doubleType, doubleType, doubleType);
        solveMethod.setAccessible(true);
        java.lang.Object[] solveMethodArguments = new java.lang.Object[7];
        solveMethodArguments[0] = ((Object) null);
        solveMethodArguments[1] = java.lang.Double.NaN;
        solveMethodArguments[2] = java.lang.Double.NaN;
        solveMethodArguments[3] = java.lang.Double.NaN;
        solveMethodArguments[4] = java.lang.Double.NaN;
        solveMethodArguments[5] = java.lang.Double.NaN;
        solveMethodArguments[6] = java.lang.Double.NaN;
        try {
            solveMethod.invoke(brentSolver, solveMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.analysis.solvers.BrentSolver.solve
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method solve(double, double, double)
    
    /**
    @utbot.classUnderTest {@link BrentSolver}
 * @utbot.methodUnderTest {@link org.apache.commons.math.analysis.solvers.BrentSolver#solve(double,double,double)}
 * @utbot.returnsFrom {@code return solve(f, min, max, initial);}
 *  */
    @Test
    public void testSolve_ReturnSolve() throws Exception  {
        BrentSolver brentSolver = ((BrentSolver) createInstance("org.apache.commons.math.analysis.solvers.BrentSolver"));
        brentSolver.functionValueAccuracy = 0.0;
        brentSolver.result = 0.0;
        PolynomialFunction f = ((PolynomialFunction) createInstance("org.apache.commons.math.analysis.polynomials.PolynomialFunction"));
        double[] coefficients = {-0.0};
        setField(f, "org.apache.commons.math.analysis.polynomials.PolynomialFunction", "coefficients", coefficients);
        setField(brentSolver, "org.apache.commons.math.analysis.solvers.UnivariateRealSolverImpl", "f", f);
        
        double actual = brentSolver.solve(-2.4888805760184883E232, -2.2251078104803327E-308, -3.653516914493799E193);
        
        assertEquals(-3.653516914493799E193, actual, 1.0E-6);
        
        boolean finalBrentSolverResultComputed = brentSolver.resultComputed;
        double finalBrentSolverResult = brentSolver.result;
        
        assertTrue(finalBrentSolverResultComputed);
        
        assertEquals(-3.653516914493799E193, finalBrentSolverResult, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link BrentSolver}
 * @utbot.methodUnderTest {@link org.apache.commons.math.analysis.solvers.BrentSolver#solve(double,double,double)}
 * @utbot.returnsFrom {@code return solve(f, min, max, initial);}
 *  */
    @Test
    public void testSolve_ReturnSolve_1() throws Exception  {
        BrentSolver brentSolver = ((BrentSolver) createInstance("org.apache.commons.math.analysis.solvers.BrentSolver"));
        brentSolver.functionValueAccuracy = 4.9E-324;
        brentSolver.result = 0.0;
        PolynomialSplineFunction f = ((PolynomialSplineFunction) createInstance("org.apache.commons.math.analysis.polynomials.PolynomialSplineFunction"));
        double[] knots = {-2.2250738585072014E-308, 4.9E-324, -0.0};
        setField(f, "org.apache.commons.math.analysis.polynomials.PolynomialSplineFunction", "knots", knots);
        org.apache.commons.math.analysis.polynomials.PolynomialFunction[] polynomials = new org.apache.commons.math.analysis.polynomials.PolynomialFunction[4];
        PolynomialFunction polynomialFunction = ((PolynomialFunction) createInstance("org.apache.commons.math.analysis.polynomials.PolynomialFunction"));
        double[] coefficients = {4.9E-324};
        setField(polynomialFunction, "org.apache.commons.math.analysis.polynomials.PolynomialFunction", "coefficients", coefficients);
        polynomials[0] = polynomialFunction;
        setField(f, "org.apache.commons.math.analysis.polynomials.PolynomialSplineFunction", "polynomials", polynomials);
        setField(f, "org.apache.commons.math.analysis.polynomials.PolynomialSplineFunction", "n", 2);
        setField(brentSolver, "org.apache.commons.math.analysis.solvers.UnivariateRealSolverImpl", "f", f);
        
        double actual = brentSolver.solve(-2.225073858507202E-308, 2.2250738585072024E-308, 0.0);
        
        assertEquals(0.0, actual, 1.0E-6);
        
        boolean finalBrentSolverResultComputed = brentSolver.resultComputed;
        UnivariateRealFunction univariateRealFunction = brentSolver.f;
        org.apache.commons.math.analysis.polynomials.PolynomialFunction[] univariateRealFunctionFPolynomials = ((org.apache.commons.math.analysis.polynomials.PolynomialFunction[]) getFieldValue(univariateRealFunction, "org.apache.commons.math.analysis.polynomials.PolynomialSplineFunction", "polynomials"));
        PolynomialFunction finalBrentSolverFPolynomials1 = ((PolynomialFunction) get(univariateRealFunctionFPolynomials, 1));
        UnivariateRealFunction univariateRealFunction1 = brentSolver.f;
        org.apache.commons.math.analysis.polynomials.PolynomialFunction[] univariateRealFunction1FPolynomials = ((org.apache.commons.math.analysis.polynomials.PolynomialFunction[]) getFieldValue(univariateRealFunction1, "org.apache.commons.math.analysis.polynomials.PolynomialSplineFunction", "polynomials"));
        PolynomialFunction finalBrentSolverFPolynomials2 = ((PolynomialFunction) get(univariateRealFunction1FPolynomials, 2));
        UnivariateRealFunction univariateRealFunction2 = brentSolver.f;
        org.apache.commons.math.analysis.polynomials.PolynomialFunction[] univariateRealFunction2FPolynomials = ((org.apache.commons.math.analysis.polynomials.PolynomialFunction[]) getFieldValue(univariateRealFunction2, "org.apache.commons.math.analysis.polynomials.PolynomialSplineFunction", "polynomials"));
        PolynomialFunction finalBrentSolverFPolynomials3 = ((PolynomialFunction) get(univariateRealFunction2FPolynomials, 3));
        
        assertTrue(finalBrentSolverResultComputed);
        
        assertNull(finalBrentSolverFPolynomials1);
        
        assertNull(finalBrentSolverFPolynomials2);
        
        assertNull(finalBrentSolverFPolynomials3);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method solve(double, double, double)
    
    /**
    @utbot.classUnderTest {@link BrentSolver}
 * @utbot.methodUnderTest {@link org.apache.commons.math.analysis.solvers.BrentSolver#solve(double,double,double)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return solve(f, min, max, initial);
 *  */
    @Test
    public void testSolve_ThrowArrayIndexOutOfBoundsException2() throws Exception  {
        BrentSolver brentSolver = ((BrentSolver) createInstance("org.apache.commons.math.analysis.solvers.BrentSolver"));
        PolynomialSplineFunction f = ((PolynomialSplineFunction) createInstance("org.apache.commons.math.analysis.polynomials.PolynomialSplineFunction"));
        double[] knots = {};
        setField(f, "org.apache.commons.math.analysis.polynomials.PolynomialSplineFunction", "knots", knots);
        setField(brentSolver, "org.apache.commons.math.analysis.solvers.UnivariateRealSolverImpl", "f", f);
        
        /* This test fails because method [org.apache.commons.math.analysis.solvers.BrentSolver.solve] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.analysis.polynomials.PolynomialSplineFunction.value(PolynomialSplineFunction.java:136)
            org.apache.commons.math.analysis.solvers.BrentSolver.solve(BrentSolver.java:106)
            org.apache.commons.math.analysis.solvers.BrentSolver.solve(BrentSolver.java:75) */
        brentSolver.solve(-22.26214599609378, 4.243346495210094E-307, -11.035713195800783);
    }
    
    /**
    @utbot.classUnderTest {@link BrentSolver}
 * @utbot.methodUnderTest {@link org.apache.commons.math.analysis.solvers.BrentSolver#solve(double,double,double)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return solve(f, min, max, initial);
 *  */
    @Test
    public void testSolve_ThrowArrayIndexOutOfBoundsException_12() throws Exception  {
        BrentSolver brentSolver = ((BrentSolver) createInstance("org.apache.commons.math.analysis.solvers.BrentSolver"));
        PolynomialSplineFunction f = ((PolynomialSplineFunction) createInstance("org.apache.commons.math.analysis.polynomials.PolynomialSplineFunction"));
        double[] knots = {-2.681725255538425E154};
        setField(f, "org.apache.commons.math.analysis.polynomials.PolynomialSplineFunction", "knots", knots);
        setField(f, "org.apache.commons.math.analysis.polynomials.PolynomialSplineFunction", "n", 1073741824);
        setField(brentSolver, "org.apache.commons.math.analysis.solvers.UnivariateRealSolverImpl", "f", f);
        
        /* This test fails because method [org.apache.commons.math.analysis.solvers.BrentSolver.solve] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1073741824 out of bounds for length 1]
            org.apache.commons.math.analysis.polynomials.PolynomialSplineFunction.value(PolynomialSplineFunction.java:136)
            org.apache.commons.math.analysis.solvers.BrentSolver.solve(BrentSolver.java:106)
            org.apache.commons.math.analysis.solvers.BrentSolver.solve(BrentSolver.java:75) */
        brentSolver.solve(-5.363123172016062E154, 2.503208356070076E-308, -2.681725255538425E154);
    }
    
    /**
    @utbot.classUnderTest {@link BrentSolver}
 * @utbot.methodUnderTest {@link org.apache.commons.math.analysis.solvers.BrentSolver#solve(double,double,double)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return solve(f, min, max, initial);
 *  */
    @Test
    public void testSolve_ThrowArrayIndexOutOfBoundsException_21() throws Exception  {
        BrentSolver brentSolver = ((BrentSolver) createInstance("org.apache.commons.math.analysis.solvers.BrentSolver"));
        PolynomialSplineFunction f = ((PolynomialSplineFunction) createInstance("org.apache.commons.math.analysis.polynomials.PolynomialSplineFunction"));
        double[] knots = {3.337610787760802E-308, 5.562684646268003E-308, 4.450147717014404E-308};
        setField(f, "org.apache.commons.math.analysis.polynomials.PolynomialSplineFunction", "knots", knots);
        org.apache.commons.math.analysis.polynomials.PolynomialFunction[] polynomials = {};
        setField(f, "org.apache.commons.math.analysis.polynomials.PolynomialSplineFunction", "polynomials", polynomials);
        setField(f, "org.apache.commons.math.analysis.polynomials.PolynomialSplineFunction", "n", 2);
        setField(brentSolver, "org.apache.commons.math.analysis.solvers.UnivariateRealSolverImpl", "f", f);
        
        /* This test fails because method [org.apache.commons.math.analysis.solvers.BrentSolver.solve] produces [java.lang.ArrayIndexOutOfBoundsException: Index -1 out of bounds for length 0]
            org.apache.commons.math.analysis.polynomials.PolynomialSplineFunction.value(PolynomialSplineFunction.java:149)
            org.apache.commons.math.analysis.solvers.BrentSolver.solve(BrentSolver.java:106)
            org.apache.commons.math.analysis.solvers.BrentSolver.solve(BrentSolver.java:75) */
        brentSolver.solve(-2.983336292480084E-154, 1.1125369292536007E-307, 4.450147717014404E-308);
    }
    
    /**
    @utbot.classUnderTest {@link BrentSolver}
 * @utbot.methodUnderTest {@link org.apache.commons.math.analysis.solvers.BrentSolver#solve(double,double,double)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return solve(f, min, max, initial);
 *  */
    @Test
    public void testSolve_ThrowArrayIndexOutOfBoundsException_31() throws Exception  {
        BrentSolver brentSolver = ((BrentSolver) createInstance("org.apache.commons.math.analysis.solvers.BrentSolver"));
        PolynomialSplineFunction f = ((PolynomialSplineFunction) createInstance("org.apache.commons.math.analysis.polynomials.PolynomialSplineFunction"));
        double[] knots = {4.9E-324};
        setField(f, "org.apache.commons.math.analysis.polynomials.PolynomialSplineFunction", "knots", knots);
        org.apache.commons.math.analysis.polynomials.PolynomialFunction[] polynomials = {};
        setField(f, "org.apache.commons.math.analysis.polynomials.PolynomialSplineFunction", "polynomials", polynomials);
        setField(brentSolver, "org.apache.commons.math.analysis.solvers.UnivariateRealSolverImpl", "f", f);
        
        /* This test fails because method [org.apache.commons.math.analysis.solvers.BrentSolver.solve] produces [java.lang.ArrayIndexOutOfBoundsException: Index -1 out of bounds for length 0]
            org.apache.commons.math.analysis.polynomials.PolynomialSplineFunction.value(PolynomialSplineFunction.java:149)
            org.apache.commons.math.analysis.solvers.BrentSolver.solve(BrentSolver.java:106)
            org.apache.commons.math.analysis.solvers.BrentSolver.solve(BrentSolver.java:75) */
        brentSolver.solve(-4.450147717014405E-308, 2.2250738585072024E-308, 4.9E-324);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: CHECKED EXCEPTIONS for method solve(double, double, double)
    
    /**
    @utbot.classUnderTest {@link BrentSolver}
 * @utbot.methodUnderTest {@link org.apache.commons.math.analysis.solvers.BrentSolver#solve(double,double,double)}
 * @utbot.throwsException {@link org.apache.commons.math.ArgumentOutsideDomainException} in: return solve(f, min, max, initial);
 *  */
    @Test(expected = ArgumentOutsideDomainException.class)
    public void testSolve_ThrowArgumentOutsideDomainException2() throws Exception  {
        BrentSolver brentSolver = ((BrentSolver) createInstance("org.apache.commons.math.analysis.solvers.BrentSolver"));
        PolynomialSplineFunction f = ((PolynomialSplineFunction) createInstance("org.apache.commons.math.analysis.polynomials.PolynomialSplineFunction"));
        double[] knots = {5.655342709789981E-259};
        setField(f, "org.apache.commons.math.analysis.polynomials.PolynomialSplineFunction", "knots", knots);
        setField(brentSolver, "org.apache.commons.math.analysis.solvers.UnivariateRealSolverImpl", "f", f);
        
        brentSolver.solve(-1.1696158079935543E23, 2.1113281250009095, -5.8517683887825125E22);
    }
    
    /**
    @utbot.classUnderTest {@link BrentSolver}
 * @utbot.methodUnderTest {@link org.apache.commons.math.analysis.solvers.BrentSolver#solve(double,double,double)}
 * @utbot.throwsException {@link org.apache.commons.math.ArgumentOutsideDomainException} in: return solve(f, min, max, initial);
 *  */
    @Test(expected = ArgumentOutsideDomainException.class)
    public void testSolve_ThrowArgumentOutsideDomainException_12() throws Exception  {
        BrentSolver brentSolver = ((BrentSolver) createInstance("org.apache.commons.math.analysis.solvers.BrentSolver"));
        PolynomialSplineFunction f = ((PolynomialSplineFunction) createInstance("org.apache.commons.math.analysis.polynomials.PolynomialSplineFunction"));
        double[] knots = {1.7802492176286316E-307, -2.22531152203579E-308};
        setField(f, "org.apache.commons.math.analysis.polynomials.PolynomialSplineFunction", "knots", knots);
        setField(f, "org.apache.commons.math.analysis.polynomials.PolynomialSplineFunction", "n", 1);
        setField(brentSolver, "org.apache.commons.math.analysis.solvers.UnivariateRealSolverImpl", "f", f);
        
        brentSolver.solve(-2.225549185564378E-308, 3.567071529419358E-307, 1.7802492176286316E-307);
    }
    ///endregion
    
    ///region Errors report for solve
    
    public void testSolve_errors2()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Exception org.apache.commons.math.MathRuntimeException$4 is not accessible from package org.apache.commons.math.analysis.solvers
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.analysis.solvers.BrentSolver.solve
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method solve(double, double)
    
    /**
    @utbot.classUnderTest {@link BrentSolver}
 * @utbot.methodUnderTest {@link org.apache.commons.math.analysis.solvers.BrentSolver#solve(double,double)}
 * @utbot.returnsFrom {@code return solve(f, min, max);}
 *  */
    @Test
    public void testSolve_ReturnSolve1() throws Exception  {
        BrentSolver brentSolver = ((BrentSolver) createInstance("org.apache.commons.math.analysis.solvers.BrentSolver"));
        PolynomialFunction f = ((PolynomialFunction) createInstance("org.apache.commons.math.analysis.polynomials.PolynomialFunction"));
        double[] coefficients = {-4.280820457966224E-308};
        setField(f, "org.apache.commons.math.analysis.polynomials.PolynomialFunction", "coefficients", coefficients);
        setField(brentSolver, "org.apache.commons.math.analysis.solvers.UnivariateRealSolverImpl", "f", f);
        
        double actual = brentSolver.solve(8.187083662642199E174, 2.598232963439044E251);
        
        assertEquals(2.598232963439044E251, actual, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link BrentSolver}
 * @utbot.methodUnderTest {@link org.apache.commons.math.analysis.solvers.BrentSolver#solve(double,double)}
 * @utbot.returnsFrom {@code return solve(f, min, max);}
 *  */
    @Test
    public void testSolve_ReturnSolve_11() throws Exception  {
        BrentSolver brentSolver = ((BrentSolver) createInstance("org.apache.commons.math.analysis.solvers.BrentSolver"));
        PolynomialFunction f = ((PolynomialFunction) createInstance("org.apache.commons.math.analysis.polynomials.PolynomialFunction"));
        double[] coefficients = {-0.0};
        setField(f, "org.apache.commons.math.analysis.polynomials.PolynomialFunction", "coefficients", coefficients);
        setField(brentSolver, "org.apache.commons.math.analysis.solvers.UnivariateRealSolverImpl", "f", f);
        
        double actual = brentSolver.solve(-1.1896135267827297E285, -1.1429873912832435E-100);
        
        assertEquals(-1.1896135267827297E285, actual, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link BrentSolver}
 * @utbot.methodUnderTest {@link org.apache.commons.math.analysis.solvers.BrentSolver#solve(double,double)}
 * @utbot.returnsFrom {@code return solve(f, min, max);}
 *  */
    @Test
    public void testSolve_ReturnSolve_2() throws Exception  {
        BrentSolver brentSolver = ((BrentSolver) createInstance("org.apache.commons.math.analysis.solvers.BrentSolver"));
        brentSolver.functionValueAccuracy = 2.505069747802134;
        brentSolver.result = 0.0;
        PolynomialFunction f = ((PolynomialFunction) createInstance("org.apache.commons.math.analysis.polynomials.PolynomialFunction"));
        double[] coefficients = {2.505069747802134};
        setField(f, "org.apache.commons.math.analysis.polynomials.PolynomialFunction", "coefficients", coefficients);
        setField(brentSolver, "org.apache.commons.math.analysis.solvers.UnivariateRealSolverImpl", "f", f);
        
        double actual = brentSolver.solve(1.5346575412881947E39, 1.643034342755364E40);
        
        assertEquals(1.5346575412881947E39, actual, 1.0E-6);
        
        boolean finalBrentSolverResultComputed = brentSolver.resultComputed;
        double finalBrentSolverResult = brentSolver.result;
        
        assertTrue(finalBrentSolverResultComputed);
        
        assertEquals(1.5346575412881947E39, finalBrentSolverResult, 1.0E-6);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: CHECKED EXCEPTIONS for method solve(double, double)
    
    /**
    @utbot.classUnderTest {@link BrentSolver}
 * @utbot.methodUnderTest {@link org.apache.commons.math.analysis.solvers.BrentSolver#solve(double,double)}
 * @utbot.throwsException {@link org.apache.commons.math.ArgumentOutsideDomainException} in: return solve(f, min, max);
 *  */
    @Test(expected = ArgumentOutsideDomainException.class)
    public void testSolve_ThrowArgumentOutsideDomainException3() throws Exception  {
        BrentSolver brentSolver = ((BrentSolver) createInstance("org.apache.commons.math.analysis.solvers.BrentSolver"));
        PolynomialSplineFunction f = ((PolynomialSplineFunction) createInstance("org.apache.commons.math.analysis.polynomials.PolynomialSplineFunction"));
        double[] knots = {9.946467099635809E86, 1.7179873280031246E10};
        setField(f, "org.apache.commons.math.analysis.polynomials.PolynomialSplineFunction", "knots", knots);
        setField(f, "org.apache.commons.math.analysis.polynomials.PolynomialSplineFunction", "n", 1);
        setField(brentSolver, "org.apache.commons.math.analysis.solvers.UnivariateRealSolverImpl", "f", f);
        
        brentSolver.solve(9.946467099635809E86, 2.681562225332376E154);
    }
    
    /**
    @utbot.classUnderTest {@link BrentSolver}
 * @utbot.methodUnderTest {@link org.apache.commons.math.analysis.solvers.BrentSolver#solve(double,double)}
 * @utbot.throwsException {@link org.apache.commons.math.ArgumentOutsideDomainException} in: return solve(f, min, max);
 *  */
    @Test(expected = ArgumentOutsideDomainException.class)
    public void testSolve_ThrowArgumentOutsideDomainException_13() throws Exception  {
        BrentSolver brentSolver = ((BrentSolver) createInstance("org.apache.commons.math.analysis.solvers.BrentSolver"));
        PolynomialSplineFunction f = ((PolynomialSplineFunction) createInstance("org.apache.commons.math.analysis.polynomials.PolynomialSplineFunction"));
        double[] knots = {1.140352525408631E-305};
        setField(f, "org.apache.commons.math.analysis.polynomials.PolynomialSplineFunction", "knots", knots);
        setField(brentSolver, "org.apache.commons.math.analysis.solvers.UnivariateRealSolverImpl", "f", f);
        
        brentSolver.solve(-1310850.0, 1.0486800000000002E7);
    }
    
    /**
    @utbot.classUnderTest {@link BrentSolver}
 * @utbot.methodUnderTest {@link org.apache.commons.math.analysis.solvers.BrentSolver#solve(double,double)}
 * @utbot.throwsException {@link org.apache.commons.math.ArgumentOutsideDomainException} in: return solve(f, min, max);
 *  */
    @Test(expected = ArgumentOutsideDomainException.class)
    public void testSolve_ThrowArgumentOutsideDomainException_21() throws Exception  {
        BrentSolver brentSolver = ((BrentSolver) createInstance("org.apache.commons.math.analysis.solvers.BrentSolver"));
        PolynomialSplineFunction f = ((PolynomialSplineFunction) createInstance("org.apache.commons.math.analysis.polynomials.PolynomialSplineFunction"));
        double[] knots = {java.lang.Double.NaN, 0.0, -4.0, 2.0000000000000004, 1024.0000000000002};
        setField(f, "org.apache.commons.math.analysis.polynomials.PolynomialSplineFunction", "knots", knots);
        org.apache.commons.math.analysis.polynomials.PolynomialFunction[] polynomials = new org.apache.commons.math.analysis.polynomials.PolynomialFunction[2];
        PolynomialFunction polynomialFunction = ((PolynomialFunction) createInstance("org.apache.commons.math.analysis.polynomials.PolynomialFunction"));
        double[] coefficients = {0.0, 0.0};
        setField(polynomialFunction, "org.apache.commons.math.analysis.polynomials.PolynomialFunction", "coefficients", coefficients);
        polynomials[1] = polynomialFunction;
        setField(f, "org.apache.commons.math.analysis.polynomials.PolynomialSplineFunction", "polynomials", polynomials);
        setField(f, "org.apache.commons.math.analysis.polynomials.PolynomialSplineFunction", "n", 4);
        setField(brentSolver, "org.apache.commons.math.analysis.solvers.UnivariateRealSolverImpl", "f", f);
        
        brentSolver.solve(4.450215620879714E-308, 1.978884745380025E174);
    }
    ///endregion
    
    ///region Errors report for solve
    
    public void testSolve_errors3()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Exception org.apache.commons.math.MathRuntimeException$4 is not accessible from package org.apache.commons.math.analysis.solvers
        
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
        
                java.lang.reflect.Method methodForGetDeclaredFields739653672160400 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields739653672160400.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass739653672168000 = (java.lang.reflect.Field[]) methodForGetDeclaredFields739653672160400.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass739653672168000).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields739653672749900 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields739653672749900.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass739653672753800 = (java.lang.reflect.Field[]) methodForGetDeclaredFields739653672749900.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass739653672753800).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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

