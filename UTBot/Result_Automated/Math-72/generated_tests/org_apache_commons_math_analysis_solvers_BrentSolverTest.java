package org.apache.commons.math.analysis.solvers;

import org.junit.Test;
import org.apache.commons.math.analysis.polynomials.PolynomialFunction;
import org.apache.commons.math.analysis.polynomials.PolynomialSplineFunction;
import org.apache.commons.math.ArgumentOutsideDomainException;
import java.lang.reflect.Method;
import java.lang.reflect.InvocationTargetException;
import org.apache.commons.math.MaxIterationsExceededException;
import org.apache.commons.math.FunctionEvaluationException;
import org.apache.commons.math.optimization.fitting.HarmonicFunction;
import org.apache.commons.math.analysis.UnivariateRealFunction;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static java.lang.reflect.Array.get;
import static org.junit.Assert.assertNull;

public final class org_apache_commons_math_analysis_solvers_BrentSolverTest {
    ///region Test suites for executable org.apache.commons.math.analysis.solvers.BrentSolver.solve
    
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
        brentSolver.functionValueAccuracy = 1.295163E-318;
        brentSolver.result = 0.0;
        PolynomialFunction polynomialFunction = ((PolynomialFunction) createInstance("org.apache.commons.math.analysis.polynomials.PolynomialFunction"));
        double[] coefficients = {1.295163E-318};
        setField(polynomialFunction, "org.apache.commons.math.analysis.polynomials.PolynomialFunction", "coefficients", coefficients);
        
        double actual = brentSolver.solve(polynomialFunction, -2.228342270878198E-308, 2.2261863314110906E-308, -5.57380663992167E-309);
        
        assertEquals(-5.57380663992167E-309, actual, 1.0E-6);
        
        boolean finalBrentSolverResultComputed = brentSolver.resultComputed;
        double finalBrentSolverResult = brentSolver.result;
        
        assertTrue(finalBrentSolverResultComputed);
        
        assertEquals(-5.57380663992167E-309, finalBrentSolverResult, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link BrentSolver}
 * @utbot.methodUnderTest {@link org.apache.commons.math.analysis.solvers.BrentSolver#solve(org.apache.commons.math.analysis.UnivariateRealFunction,double,double,double)}
 * @utbot.returnsFrom {@code return result;}
 *  */
    @Test
    public void testSolve_ReturnResult_1() throws Exception  {
        BrentSolver brentSolver = ((BrentSolver) createInstance("org.apache.commons.math.analysis.solvers.BrentSolver"));
        brentSolver.functionValueAccuracy = 4.450147717014404E-308;
        brentSolver.result = 0.0;
        PolynomialSplineFunction polynomialSplineFunction = ((PolynomialSplineFunction) createInstance("org.apache.commons.math.analysis.polynomials.PolynomialSplineFunction"));
        double[] knots = {-1.6781267534303965E-154, 0.0, -1.7272345346281063E-77, 3.689349034644236E19, 0.0};
        setField(polynomialSplineFunction, "org.apache.commons.math.analysis.polynomials.PolynomialSplineFunction", "knots", knots);
        org.apache.commons.math.analysis.polynomials.PolynomialFunction[] polynomials = new org.apache.commons.math.analysis.polynomials.PolynomialFunction[2];
        PolynomialFunction polynomialFunction = ((PolynomialFunction) createInstance("org.apache.commons.math.analysis.polynomials.PolynomialFunction"));
        double[] coefficients = {4.450147717014404E-308};
        setField(polynomialFunction, "org.apache.commons.math.analysis.polynomials.PolynomialFunction", "coefficients", coefficients);
        polynomials[1] = polynomialFunction;
        setField(polynomialSplineFunction, "org.apache.commons.math.analysis.polynomials.PolynomialSplineFunction", "polynomials", polynomials);
        
        double actual = brentSolver.solve(polynomialSplineFunction, -2.9833365147559576E-154, 1.0997771199940012E-149, -1.6781267534303965E-154);
        
        assertEquals(-1.6781267534303965E-154, actual, 1.0E-6);
        
        boolean finalBrentSolverResultComputed = brentSolver.resultComputed;
        double finalBrentSolverResult = brentSolver.result;
        
        org.apache.commons.math.analysis.polynomials.PolynomialFunction[] polynomialSplineFunctionPolynomials = ((org.apache.commons.math.analysis.polynomials.PolynomialFunction[]) getFieldValue(polynomialSplineFunction, "org.apache.commons.math.analysis.polynomials.PolynomialSplineFunction", "polynomials"));
        PolynomialFunction finalPolynomialSplineFunctionPolynomials0 = ((PolynomialFunction) get(polynomialSplineFunctionPolynomials, 0));
        
        assertTrue(finalBrentSolverResultComputed);
        
        assertEquals(-1.6781267534303965E-154, finalBrentSolverResult, 1.0E-6);
        
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
        brentSolver.functionValueAccuracy = 4.9E-324;
        brentSolver.result = 0.0;
        PolynomialSplineFunction polynomialSplineFunction = ((PolynomialSplineFunction) createInstance("org.apache.commons.math.analysis.polynomials.PolynomialSplineFunction"));
        double[] knots = {-75264.00000000093, 1312769.0000000596, 1.5772246291730325E-299};
        setField(polynomialSplineFunction, "org.apache.commons.math.analysis.polynomials.PolynomialSplineFunction", "knots", knots);
        org.apache.commons.math.analysis.polynomials.PolynomialFunction[] polynomials = new org.apache.commons.math.analysis.polynomials.PolynomialFunction[32];
        PolynomialFunction polynomialFunction = ((PolynomialFunction) createInstance("org.apache.commons.math.analysis.polynomials.PolynomialFunction"));
        double[] coefficients = {4.9E-324};
        setField(polynomialFunction, "org.apache.commons.math.analysis.polynomials.PolynomialFunction", "coefficients", coefficients);
        polynomials[0] = polynomialFunction;
        setField(polynomialSplineFunction, "org.apache.commons.math.analysis.polynomials.PolynomialSplineFunction", "polynomials", polynomials);
        setField(polynomialSplineFunction, "org.apache.commons.math.analysis.polynomials.PolynomialSplineFunction", "n", 2);
        
        double actual = brentSolver.solve(polynomialSplineFunction, -4.0376717190925014E-297, 1.2526052343383154E-293, 1.5772246291730325E-299);
        
        assertEquals(1.5772246291730325E-299, actual, 1.0E-6);
        
        boolean finalBrentSolverResultComputed = brentSolver.resultComputed;
        double finalBrentSolverResult = brentSolver.result;
        
        org.apache.commons.math.analysis.polynomials.PolynomialFunction[] polynomialSplineFunctionPolynomials = ((org.apache.commons.math.analysis.polynomials.PolynomialFunction[]) getFieldValue(polynomialSplineFunction, "org.apache.commons.math.analysis.polynomials.PolynomialSplineFunction", "polynomials"));
        PolynomialFunction finalPolynomialSplineFunctionPolynomials1 = ((PolynomialFunction) get(polynomialSplineFunctionPolynomials, 1));
        org.apache.commons.math.analysis.polynomials.PolynomialFunction[] polynomialSplineFunctionPolynomials1 = ((org.apache.commons.math.analysis.polynomials.PolynomialFunction[]) getFieldValue(polynomialSplineFunction, "org.apache.commons.math.analysis.polynomials.PolynomialSplineFunction", "polynomials"));
        PolynomialFunction finalPolynomialSplineFunctionPolynomials2 = ((PolynomialFunction) get(polynomialSplineFunctionPolynomials1, 2));
        org.apache.commons.math.analysis.polynomials.PolynomialFunction[] polynomialSplineFunctionPolynomials2 = ((org.apache.commons.math.analysis.polynomials.PolynomialFunction[]) getFieldValue(polynomialSplineFunction, "org.apache.commons.math.analysis.polynomials.PolynomialSplineFunction", "polynomials"));
        PolynomialFunction finalPolynomialSplineFunctionPolynomials3 = ((PolynomialFunction) get(polynomialSplineFunctionPolynomials2, 3));
        org.apache.commons.math.analysis.polynomials.PolynomialFunction[] polynomialSplineFunctionPolynomials3 = ((org.apache.commons.math.analysis.polynomials.PolynomialFunction[]) getFieldValue(polynomialSplineFunction, "org.apache.commons.math.analysis.polynomials.PolynomialSplineFunction", "polynomials"));
        PolynomialFunction finalPolynomialSplineFunctionPolynomials4 = ((PolynomialFunction) get(polynomialSplineFunctionPolynomials3, 4));
        org.apache.commons.math.analysis.polynomials.PolynomialFunction[] polynomialSplineFunctionPolynomials4 = ((org.apache.commons.math.analysis.polynomials.PolynomialFunction[]) getFieldValue(polynomialSplineFunction, "org.apache.commons.math.analysis.polynomials.PolynomialSplineFunction", "polynomials"));
        PolynomialFunction finalPolynomialSplineFunctionPolynomials5 = ((PolynomialFunction) get(polynomialSplineFunctionPolynomials4, 5));
        org.apache.commons.math.analysis.polynomials.PolynomialFunction[] polynomialSplineFunctionPolynomials5 = ((org.apache.commons.math.analysis.polynomials.PolynomialFunction[]) getFieldValue(polynomialSplineFunction, "org.apache.commons.math.analysis.polynomials.PolynomialSplineFunction", "polynomials"));
        PolynomialFunction finalPolynomialSplineFunctionPolynomials6 = ((PolynomialFunction) get(polynomialSplineFunctionPolynomials5, 6));
        org.apache.commons.math.analysis.polynomials.PolynomialFunction[] polynomialSplineFunctionPolynomials6 = ((org.apache.commons.math.analysis.polynomials.PolynomialFunction[]) getFieldValue(polynomialSplineFunction, "org.apache.commons.math.analysis.polynomials.PolynomialSplineFunction", "polynomials"));
        PolynomialFunction finalPolynomialSplineFunctionPolynomials7 = ((PolynomialFunction) get(polynomialSplineFunctionPolynomials6, 7));
        org.apache.commons.math.analysis.polynomials.PolynomialFunction[] polynomialSplineFunctionPolynomials7 = ((org.apache.commons.math.analysis.polynomials.PolynomialFunction[]) getFieldValue(polynomialSplineFunction, "org.apache.commons.math.analysis.polynomials.PolynomialSplineFunction", "polynomials"));
        PolynomialFunction finalPolynomialSplineFunctionPolynomials8 = ((PolynomialFunction) get(polynomialSplineFunctionPolynomials7, 8));
        org.apache.commons.math.analysis.polynomials.PolynomialFunction[] polynomialSplineFunctionPolynomials8 = ((org.apache.commons.math.analysis.polynomials.PolynomialFunction[]) getFieldValue(polynomialSplineFunction, "org.apache.commons.math.analysis.polynomials.PolynomialSplineFunction", "polynomials"));
        PolynomialFunction finalPolynomialSplineFunctionPolynomials9 = ((PolynomialFunction) get(polynomialSplineFunctionPolynomials8, 9));
        org.apache.commons.math.analysis.polynomials.PolynomialFunction[] polynomialSplineFunctionPolynomials9 = ((org.apache.commons.math.analysis.polynomials.PolynomialFunction[]) getFieldValue(polynomialSplineFunction, "org.apache.commons.math.analysis.polynomials.PolynomialSplineFunction", "polynomials"));
        PolynomialFunction finalPolynomialSplineFunctionPolynomials10 = ((PolynomialFunction) get(polynomialSplineFunctionPolynomials9, 10));
        org.apache.commons.math.analysis.polynomials.PolynomialFunction[] polynomialSplineFunctionPolynomials10 = ((org.apache.commons.math.analysis.polynomials.PolynomialFunction[]) getFieldValue(polynomialSplineFunction, "org.apache.commons.math.analysis.polynomials.PolynomialSplineFunction", "polynomials"));
        PolynomialFunction finalPolynomialSplineFunctionPolynomials11 = ((PolynomialFunction) get(polynomialSplineFunctionPolynomials10, 11));
        org.apache.commons.math.analysis.polynomials.PolynomialFunction[] polynomialSplineFunctionPolynomials11 = ((org.apache.commons.math.analysis.polynomials.PolynomialFunction[]) getFieldValue(polynomialSplineFunction, "org.apache.commons.math.analysis.polynomials.PolynomialSplineFunction", "polynomials"));
        PolynomialFunction finalPolynomialSplineFunctionPolynomials12 = ((PolynomialFunction) get(polynomialSplineFunctionPolynomials11, 12));
        org.apache.commons.math.analysis.polynomials.PolynomialFunction[] polynomialSplineFunctionPolynomials12 = ((org.apache.commons.math.analysis.polynomials.PolynomialFunction[]) getFieldValue(polynomialSplineFunction, "org.apache.commons.math.analysis.polynomials.PolynomialSplineFunction", "polynomials"));
        PolynomialFunction finalPolynomialSplineFunctionPolynomials13 = ((PolynomialFunction) get(polynomialSplineFunctionPolynomials12, 13));
        org.apache.commons.math.analysis.polynomials.PolynomialFunction[] polynomialSplineFunctionPolynomials13 = ((org.apache.commons.math.analysis.polynomials.PolynomialFunction[]) getFieldValue(polynomialSplineFunction, "org.apache.commons.math.analysis.polynomials.PolynomialSplineFunction", "polynomials"));
        PolynomialFunction finalPolynomialSplineFunctionPolynomials14 = ((PolynomialFunction) get(polynomialSplineFunctionPolynomials13, 14));
        org.apache.commons.math.analysis.polynomials.PolynomialFunction[] polynomialSplineFunctionPolynomials14 = ((org.apache.commons.math.analysis.polynomials.PolynomialFunction[]) getFieldValue(polynomialSplineFunction, "org.apache.commons.math.analysis.polynomials.PolynomialSplineFunction", "polynomials"));
        PolynomialFunction finalPolynomialSplineFunctionPolynomials15 = ((PolynomialFunction) get(polynomialSplineFunctionPolynomials14, 15));
        org.apache.commons.math.analysis.polynomials.PolynomialFunction[] polynomialSplineFunctionPolynomials15 = ((org.apache.commons.math.analysis.polynomials.PolynomialFunction[]) getFieldValue(polynomialSplineFunction, "org.apache.commons.math.analysis.polynomials.PolynomialSplineFunction", "polynomials"));
        PolynomialFunction finalPolynomialSplineFunctionPolynomials16 = ((PolynomialFunction) get(polynomialSplineFunctionPolynomials15, 16));
        org.apache.commons.math.analysis.polynomials.PolynomialFunction[] polynomialSplineFunctionPolynomials16 = ((org.apache.commons.math.analysis.polynomials.PolynomialFunction[]) getFieldValue(polynomialSplineFunction, "org.apache.commons.math.analysis.polynomials.PolynomialSplineFunction", "polynomials"));
        PolynomialFunction finalPolynomialSplineFunctionPolynomials17 = ((PolynomialFunction) get(polynomialSplineFunctionPolynomials16, 17));
        org.apache.commons.math.analysis.polynomials.PolynomialFunction[] polynomialSplineFunctionPolynomials17 = ((org.apache.commons.math.analysis.polynomials.PolynomialFunction[]) getFieldValue(polynomialSplineFunction, "org.apache.commons.math.analysis.polynomials.PolynomialSplineFunction", "polynomials"));
        PolynomialFunction finalPolynomialSplineFunctionPolynomials18 = ((PolynomialFunction) get(polynomialSplineFunctionPolynomials17, 18));
        org.apache.commons.math.analysis.polynomials.PolynomialFunction[] polynomialSplineFunctionPolynomials18 = ((org.apache.commons.math.analysis.polynomials.PolynomialFunction[]) getFieldValue(polynomialSplineFunction, "org.apache.commons.math.analysis.polynomials.PolynomialSplineFunction", "polynomials"));
        PolynomialFunction finalPolynomialSplineFunctionPolynomials19 = ((PolynomialFunction) get(polynomialSplineFunctionPolynomials18, 19));
        org.apache.commons.math.analysis.polynomials.PolynomialFunction[] polynomialSplineFunctionPolynomials19 = ((org.apache.commons.math.analysis.polynomials.PolynomialFunction[]) getFieldValue(polynomialSplineFunction, "org.apache.commons.math.analysis.polynomials.PolynomialSplineFunction", "polynomials"));
        PolynomialFunction finalPolynomialSplineFunctionPolynomials20 = ((PolynomialFunction) get(polynomialSplineFunctionPolynomials19, 20));
        org.apache.commons.math.analysis.polynomials.PolynomialFunction[] polynomialSplineFunctionPolynomials20 = ((org.apache.commons.math.analysis.polynomials.PolynomialFunction[]) getFieldValue(polynomialSplineFunction, "org.apache.commons.math.analysis.polynomials.PolynomialSplineFunction", "polynomials"));
        PolynomialFunction finalPolynomialSplineFunctionPolynomials21 = ((PolynomialFunction) get(polynomialSplineFunctionPolynomials20, 21));
        org.apache.commons.math.analysis.polynomials.PolynomialFunction[] polynomialSplineFunctionPolynomials21 = ((org.apache.commons.math.analysis.polynomials.PolynomialFunction[]) getFieldValue(polynomialSplineFunction, "org.apache.commons.math.analysis.polynomials.PolynomialSplineFunction", "polynomials"));
        PolynomialFunction finalPolynomialSplineFunctionPolynomials22 = ((PolynomialFunction) get(polynomialSplineFunctionPolynomials21, 22));
        org.apache.commons.math.analysis.polynomials.PolynomialFunction[] polynomialSplineFunctionPolynomials22 = ((org.apache.commons.math.analysis.polynomials.PolynomialFunction[]) getFieldValue(polynomialSplineFunction, "org.apache.commons.math.analysis.polynomials.PolynomialSplineFunction", "polynomials"));
        PolynomialFunction finalPolynomialSplineFunctionPolynomials23 = ((PolynomialFunction) get(polynomialSplineFunctionPolynomials22, 23));
        org.apache.commons.math.analysis.polynomials.PolynomialFunction[] polynomialSplineFunctionPolynomials23 = ((org.apache.commons.math.analysis.polynomials.PolynomialFunction[]) getFieldValue(polynomialSplineFunction, "org.apache.commons.math.analysis.polynomials.PolynomialSplineFunction", "polynomials"));
        PolynomialFunction finalPolynomialSplineFunctionPolynomials24 = ((PolynomialFunction) get(polynomialSplineFunctionPolynomials23, 24));
        org.apache.commons.math.analysis.polynomials.PolynomialFunction[] polynomialSplineFunctionPolynomials24 = ((org.apache.commons.math.analysis.polynomials.PolynomialFunction[]) getFieldValue(polynomialSplineFunction, "org.apache.commons.math.analysis.polynomials.PolynomialSplineFunction", "polynomials"));
        PolynomialFunction finalPolynomialSplineFunctionPolynomials25 = ((PolynomialFunction) get(polynomialSplineFunctionPolynomials24, 25));
        org.apache.commons.math.analysis.polynomials.PolynomialFunction[] polynomialSplineFunctionPolynomials25 = ((org.apache.commons.math.analysis.polynomials.PolynomialFunction[]) getFieldValue(polynomialSplineFunction, "org.apache.commons.math.analysis.polynomials.PolynomialSplineFunction", "polynomials"));
        PolynomialFunction finalPolynomialSplineFunctionPolynomials26 = ((PolynomialFunction) get(polynomialSplineFunctionPolynomials25, 26));
        org.apache.commons.math.analysis.polynomials.PolynomialFunction[] polynomialSplineFunctionPolynomials26 = ((org.apache.commons.math.analysis.polynomials.PolynomialFunction[]) getFieldValue(polynomialSplineFunction, "org.apache.commons.math.analysis.polynomials.PolynomialSplineFunction", "polynomials"));
        PolynomialFunction finalPolynomialSplineFunctionPolynomials27 = ((PolynomialFunction) get(polynomialSplineFunctionPolynomials26, 27));
        org.apache.commons.math.analysis.polynomials.PolynomialFunction[] polynomialSplineFunctionPolynomials27 = ((org.apache.commons.math.analysis.polynomials.PolynomialFunction[]) getFieldValue(polynomialSplineFunction, "org.apache.commons.math.analysis.polynomials.PolynomialSplineFunction", "polynomials"));
        PolynomialFunction finalPolynomialSplineFunctionPolynomials28 = ((PolynomialFunction) get(polynomialSplineFunctionPolynomials27, 28));
        org.apache.commons.math.analysis.polynomials.PolynomialFunction[] polynomialSplineFunctionPolynomials28 = ((org.apache.commons.math.analysis.polynomials.PolynomialFunction[]) getFieldValue(polynomialSplineFunction, "org.apache.commons.math.analysis.polynomials.PolynomialSplineFunction", "polynomials"));
        PolynomialFunction finalPolynomialSplineFunctionPolynomials29 = ((PolynomialFunction) get(polynomialSplineFunctionPolynomials28, 29));
        org.apache.commons.math.analysis.polynomials.PolynomialFunction[] polynomialSplineFunctionPolynomials29 = ((org.apache.commons.math.analysis.polynomials.PolynomialFunction[]) getFieldValue(polynomialSplineFunction, "org.apache.commons.math.analysis.polynomials.PolynomialSplineFunction", "polynomials"));
        PolynomialFunction finalPolynomialSplineFunctionPolynomials30 = ((PolynomialFunction) get(polynomialSplineFunctionPolynomials29, 30));
        org.apache.commons.math.analysis.polynomials.PolynomialFunction[] polynomialSplineFunctionPolynomials30 = ((org.apache.commons.math.analysis.polynomials.PolynomialFunction[]) getFieldValue(polynomialSplineFunction, "org.apache.commons.math.analysis.polynomials.PolynomialSplineFunction", "polynomials"));
        PolynomialFunction finalPolynomialSplineFunctionPolynomials31 = ((PolynomialFunction) get(polynomialSplineFunctionPolynomials30, 31));
        
        assertTrue(finalBrentSolverResultComputed);
        
        assertEquals(1.5772246291730325E-299, finalBrentSolverResult, 1.0E-6);
        
        assertNull(finalPolynomialSplineFunctionPolynomials1);
        
        assertNull(finalPolynomialSplineFunctionPolynomials2);
        
        assertNull(finalPolynomialSplineFunctionPolynomials3);
        
        assertNull(finalPolynomialSplineFunctionPolynomials4);
        
        assertNull(finalPolynomialSplineFunctionPolynomials5);
        
        assertNull(finalPolynomialSplineFunctionPolynomials6);
        
        assertNull(finalPolynomialSplineFunctionPolynomials7);
        
        assertNull(finalPolynomialSplineFunctionPolynomials8);
        
        assertNull(finalPolynomialSplineFunctionPolynomials9);
        
        assertNull(finalPolynomialSplineFunctionPolynomials10);
        
        assertNull(finalPolynomialSplineFunctionPolynomials11);
        
        assertNull(finalPolynomialSplineFunctionPolynomials12);
        
        assertNull(finalPolynomialSplineFunctionPolynomials13);
        
        assertNull(finalPolynomialSplineFunctionPolynomials14);
        
        assertNull(finalPolynomialSplineFunctionPolynomials15);
        
        assertNull(finalPolynomialSplineFunctionPolynomials16);
        
        assertNull(finalPolynomialSplineFunctionPolynomials17);
        
        assertNull(finalPolynomialSplineFunctionPolynomials18);
        
        assertNull(finalPolynomialSplineFunctionPolynomials19);
        
        assertNull(finalPolynomialSplineFunctionPolynomials20);
        
        assertNull(finalPolynomialSplineFunctionPolynomials21);
        
        assertNull(finalPolynomialSplineFunctionPolynomials22);
        
        assertNull(finalPolynomialSplineFunctionPolynomials23);
        
        assertNull(finalPolynomialSplineFunctionPolynomials24);
        
        assertNull(finalPolynomialSplineFunctionPolynomials25);
        
        assertNull(finalPolynomialSplineFunctionPolynomials26);
        
        assertNull(finalPolynomialSplineFunctionPolynomials27);
        
        assertNull(finalPolynomialSplineFunctionPolynomials28);
        
        assertNull(finalPolynomialSplineFunctionPolynomials29);
        
        assertNull(finalPolynomialSplineFunctionPolynomials30);
        
        assertNull(finalPolynomialSplineFunctionPolynomials31);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: CHECKED EXCEPTIONS for method solve(org.apache.commons.math.analysis.UnivariateRealFunction, double, double, double)
    
    /**
    @utbot.classUnderTest {@link BrentSolver}
 * @utbot.methodUnderTest {@link org.apache.commons.math.analysis.solvers.BrentSolver#solve(org.apache.commons.math.analysis.UnivariateRealFunction,double,double,double)}
 * @utbot.throwsException {@link org.apache.commons.math.ArgumentOutsideDomainException} in: double yInitial = f.value(initial);
 *  */
    @Test(expected = ArgumentOutsideDomainException.class)
    public void testSolve_ThrowArgumentOutsideDomainException() throws Exception  {
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
    public void testSolve_ThrowArgumentOutsideDomainException_1() throws Exception  {
        BrentSolver brentSolver = ((BrentSolver) createInstance("org.apache.commons.math.analysis.solvers.BrentSolver"));
        PolynomialSplineFunction polynomialSplineFunction = ((PolynomialSplineFunction) createInstance("org.apache.commons.math.analysis.polynomials.PolynomialSplineFunction"));
        double[] knots = {2.7250835448585507E39, -1.28266268922258E-144};
        setField(polynomialSplineFunction, "org.apache.commons.math.analysis.polynomials.PolynomialSplineFunction", "knots", knots);
        setField(polynomialSplineFunction, "org.apache.commons.math.analysis.polynomials.PolynomialSplineFunction", "n", 1);
        
        brentSolver.solve(polynomialSplineFunction, -5.450167089717103E39, 5.444517870735017E39, 2.7250835448585507E39);
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
        double[] knots = {5.1038985221341395E-289, 0.0, -6.159322286550636E-154, 3.7524009687437025E19, 0.0};
        setField(polynomialSplineFunction, "org.apache.commons.math.analysis.polynomials.PolynomialSplineFunction", "knots", knots);
        org.apache.commons.math.analysis.polynomials.PolynomialFunction[] polynomials = new org.apache.commons.math.analysis.polynomials.PolynomialFunction[2];
        PolynomialFunction polynomialFunction = ((PolynomialFunction) createInstance("org.apache.commons.math.analysis.polynomials.PolynomialFunction"));
        double[] coefficients = {2.20687562260393E-310};
        setField(polynomialFunction, "org.apache.commons.math.analysis.polynomials.PolynomialFunction", "coefficients", coefficients);
        polynomials[1] = polynomialFunction;
        setField(polynomialSplineFunction, "org.apache.commons.math.analysis.polynomials.PolynomialSplineFunction", "polynomials", polynomials);
        
        brentSolver.solve(polynomialSplineFunction, -6.012186320110453E173, 1.1809123649524122E-288, 5.1038985221341395E-289);
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
    public void testSolve_ThrowNullPointerException() throws Throwable  {
        BrentSolver brentSolver = new BrentSolver();
        
        /* This test fails because method [org.apache.commons.math.analysis.solvers.BrentSolver.solve] produces [java.lang.NullPointerException]
            org.apache.commons.math.analysis.solvers.BrentSolver.solve(BrentSolver.java:308) */
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
    
    ///region FUZZER: CHECKED EXCEPTIONS for method solve(org.apache.commons.math.analysis.UnivariateRealFunction, double, double, double, double, double, double)
    
    @Test(expected = MaxIterationsExceededException.class)
    public void testSolveByFuzzer() throws Throwable  {
        BrentSolver brentSolver = new BrentSolver();
        brentSolver.setRelativeAccuracy(1.0);
        brentSolver.setMaximalIterationCount(Integer.MIN_VALUE);
        brentSolver.setFunctionValueAccuracy(0.0);
        brentSolver.setAbsoluteAccuracy(1.0);
        HarmonicFunction harmonicFunction = new HarmonicFunction(java.lang.Double.POSITIVE_INFINITY, java.lang.Double.NEGATIVE_INFINITY, -1.0);
        
        Class brentSolverClazz = Class.forName("org.apache.commons.math.analysis.solvers.BrentSolver");
        Class harmonicFunctionType = Class.forName("org.apache.commons.math.analysis.UnivariateRealFunction");
        Class doubleType = double.class;
        Method solveMethod = brentSolverClazz.getDeclaredMethod("solve", harmonicFunctionType, doubleType, doubleType, doubleType, doubleType, doubleType, doubleType);
        solveMethod.setAccessible(true);
        java.lang.Object[] solveMethodArguments = new java.lang.Object[7];
        solveMethodArguments[0] = harmonicFunction;
        solveMethodArguments[1] = -2.7430620343968443E303;
        solveMethodArguments[2] = 1.5;
        solveMethodArguments[3] = java.lang.Double.POSITIVE_INFINITY;
        solveMethodArguments[4] = -1.0;
        solveMethodArguments[5] = 1.0;
        solveMethodArguments[6] = 1.5;
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
        brentSolver.functionValueAccuracy = -0.0;
        brentSolver.result = 0.0;
        PolynomialFunction f = ((PolynomialFunction) createInstance("org.apache.commons.math.analysis.polynomials.PolynomialFunction"));
        double[] coefficients = {-0.0};
        setField(f, "org.apache.commons.math.analysis.polynomials.PolynomialFunction", "coefficients", coefficients);
        setField(brentSolver, "org.apache.commons.math.analysis.solvers.UnivariateRealSolverImpl", "f", f);
        
        double actual = brentSolver.solve(1.74243444536149E-309, 1.2420346099637778E232, 6.695713986377645E231);
        
        assertEquals(6.695713986377645E231, actual, 1.0E-6);
        
        boolean finalBrentSolverResultComputed = brentSolver.resultComputed;
        double finalBrentSolverResult = brentSolver.result;
        
        assertTrue(finalBrentSolverResultComputed);
        
        assertEquals(6.695713986377645E231, finalBrentSolverResult, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link BrentSolver}
 * @utbot.methodUnderTest {@link org.apache.commons.math.analysis.solvers.BrentSolver#solve(double,double,double)}
 * @utbot.returnsFrom {@code return solve(f, min, max, initial);}
 *  */
    @Test
    public void testSolve_ReturnSolve_1() throws Exception  {
        BrentSolver brentSolver = ((BrentSolver) createInstance("org.apache.commons.math.analysis.solvers.BrentSolver"));
        brentSolver.functionValueAccuracy = 0.0;
        brentSolver.result = 0.0;
        PolynomialSplineFunction f = ((PolynomialSplineFunction) createInstance("org.apache.commons.math.analysis.polynomials.PolynomialSplineFunction"));
        double[] knots = {-1.7835357647096786E-307, 131072.00000001493, 1.469616782067002E-303};
        setField(f, "org.apache.commons.math.analysis.polynomials.PolynomialSplineFunction", "knots", knots);
        org.apache.commons.math.analysis.polynomials.PolynomialFunction[] polynomials = new org.apache.commons.math.analysis.polynomials.PolynomialFunction[2];
        PolynomialFunction polynomialFunction = ((PolynomialFunction) createInstance("org.apache.commons.math.analysis.polynomials.PolynomialFunction"));
        double[] coefficients = {-0.0};
        setField(polynomialFunction, "org.apache.commons.math.analysis.polynomials.PolynomialFunction", "coefficients", coefficients);
        polynomials[0] = polynomialFunction;
        setField(f, "org.apache.commons.math.analysis.polynomials.PolynomialSplineFunction", "polynomials", polynomials);
        setField(f, "org.apache.commons.math.analysis.polynomials.PolynomialSplineFunction", "n", 2);
        setField(brentSolver, "org.apache.commons.math.analysis.solvers.UnivariateRealSolverImpl", "f", f);
        
        double actual = brentSolver.solve(7.746817145779503E-304, 2.940657611403118E-303, 1.469616782067002E-303);
        
        assertEquals(1.469616782067002E-303, actual, 1.0E-6);
        
        boolean finalBrentSolverResultComputed = brentSolver.resultComputed;
        double finalBrentSolverResult = brentSolver.result;
        UnivariateRealFunction univariateRealFunction = brentSolver.f;
        org.apache.commons.math.analysis.polynomials.PolynomialFunction[] univariateRealFunctionFPolynomials = ((org.apache.commons.math.analysis.polynomials.PolynomialFunction[]) getFieldValue(univariateRealFunction, "org.apache.commons.math.analysis.polynomials.PolynomialSplineFunction", "polynomials"));
        PolynomialFunction finalBrentSolverFPolynomials1 = ((PolynomialFunction) get(univariateRealFunctionFPolynomials, 1));
        
        assertTrue(finalBrentSolverResultComputed);
        
        assertEquals(1.469616782067002E-303, finalBrentSolverResult, 1.0E-6);
        
        assertNull(finalBrentSolverFPolynomials1);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: CHECKED EXCEPTIONS for method solve(double, double, double)
    
    /**
    @utbot.classUnderTest {@link BrentSolver}
 * @utbot.methodUnderTest {@link org.apache.commons.math.analysis.solvers.BrentSolver#solve(double,double,double)}
 * @utbot.throwsException {@link org.apache.commons.math.ArgumentOutsideDomainException} in: return solve(f, min, max, initial);
 *  */
    @Test(expected = ArgumentOutsideDomainException.class)
    public void testSolve_ThrowArgumentOutsideDomainException1() throws Exception  {
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
    public void testSolve_ThrowArgumentOutsideDomainException_11() throws Exception  {
        BrentSolver brentSolver = ((BrentSolver) createInstance("org.apache.commons.math.analysis.solvers.BrentSolver"));
        PolynomialSplineFunction f = ((PolynomialSplineFunction) createInstance("org.apache.commons.math.analysis.polynomials.PolynomialSplineFunction"));
        double[] knots = {1.4568531165184E14, -2.6555234592766676E-290};
        setField(f, "org.apache.commons.math.analysis.polynomials.PolynomialSplineFunction", "knots", knots);
        setField(f, "org.apache.commons.math.analysis.polynomials.PolynomialSplineFunction", "n", 1);
        setField(brentSolver, "org.apache.commons.math.analysis.solvers.UnivariateRealSolverImpl", "f", f);
        
        brentSolver.solve(-2.845416243200001E11, 2.9137064846950406E14, 1.4568531165184E14);
    }
    
    /**
    @utbot.classUnderTest {@link BrentSolver}
 * @utbot.methodUnderTest {@link org.apache.commons.math.analysis.solvers.BrentSolver#solve(double,double,double)}
 * @utbot.throwsException {@link org.apache.commons.math.ArgumentOutsideDomainException} in: return solve(f, min, max, initial);
 *  */
    @Test(expected = ArgumentOutsideDomainException.class)
    public void testSolve_ThrowArgumentOutsideDomainException_21() throws Exception  {
        BrentSolver brentSolver = ((BrentSolver) createInstance("org.apache.commons.math.analysis.solvers.BrentSolver"));
        brentSolver.functionValueAccuracy = java.lang.Double.NaN;
        PolynomialSplineFunction f = ((PolynomialSplineFunction) createInstance("org.apache.commons.math.analysis.polynomials.PolynomialSplineFunction"));
        double[] knots = {-4.9E-324, 1.0E-323, -0.0};
        setField(f, "org.apache.commons.math.analysis.polynomials.PolynomialSplineFunction", "knots", knots);
        org.apache.commons.math.analysis.polynomials.PolynomialFunction[] polynomials = new org.apache.commons.math.analysis.polynomials.PolynomialFunction[8];
        PolynomialFunction polynomialFunction = ((PolynomialFunction) createInstance("org.apache.commons.math.analysis.polynomials.PolynomialFunction"));
        double[] coefficients = {-0.0};
        setField(polynomialFunction, "org.apache.commons.math.analysis.polynomials.PolynomialFunction", "coefficients", coefficients);
        polynomials[0] = polynomialFunction;
        setField(f, "org.apache.commons.math.analysis.polynomials.PolynomialSplineFunction", "polynomials", polynomials);
        setField(f, "org.apache.commons.math.analysis.polynomials.PolynomialSplineFunction", "n", 2);
        setField(brentSolver, "org.apache.commons.math.analysis.solvers.UnivariateRealSolverImpl", "f", f);
        
        brentSolver.solve(-2.225073858507202E-308, 5.06E-321, 0.0);
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
        double[] coefficients = {1.1895312193364296E-231};
        setField(f, "org.apache.commons.math.analysis.polynomials.PolynomialFunction", "coefficients", coefficients);
        setField(brentSolver, "org.apache.commons.math.analysis.solvers.UnivariateRealSolverImpl", "f", f);
        
        double actual = brentSolver.solve(-3.714427421447059E-260, 8.962569995660784E20);
        
        assertEquals(8.962569995660784E20, actual, 1.0E-6);
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
        
        double actual = brentSolver.solve(-4.631683569492739E77, 1.2882297539197344E-231);
        
        assertEquals(-4.631683569492739E77, actual, 1.0E-6);
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
        
                java.lang.reflect.Method methodForGetDeclaredFields739400841012000 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields739400841012000.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass739400841019900 = (java.lang.reflect.Field[]) methodForGetDeclaredFields739400841012000.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass739400841019900).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields739400841534100 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields739400841534100.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass739400841538500 = (java.lang.reflect.Field[]) methodForGetDeclaredFields739400841534100.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass739400841538500).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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

