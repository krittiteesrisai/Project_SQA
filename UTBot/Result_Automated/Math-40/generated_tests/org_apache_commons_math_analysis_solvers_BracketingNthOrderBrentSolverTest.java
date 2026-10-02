package org.apache.commons.math.analysis.solvers;

import org.junit.Test;
import org.apache.commons.math.exception.NumberIsTooLargeException;
import org.apache.commons.math.util.Incrementor;
import org.apache.commons.math.analysis.function.Acos;
import org.apache.commons.math.analysis.function.Acosh;
import org.apache.commons.math.exception.NoBracketingException;
import org.apache.commons.math.util.Incrementor.MaxCountExceededCallback;
import org.apache.commons.math.exception.TooManyEvaluationsException;
import org.apache.commons.math.analysis.function.Atan;
import org.apache.commons.math.analysis.function.Asinh;
import org.apache.commons.math.analysis.function.Asin;
import java.lang.reflect.Method;
import org.apache.commons.math.exception.NullArgumentException;
import org.apache.commons.math.analysis.UnivariateFunction;
import org.apache.commons.math.analysis.function.Minus;
import org.apache.commons.math.analysis.function.Logit;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public final class org_apache_commons_math_analysis_solvers_BracketingNthOrderBrentSolverTest {
    ///region Test suites for executable org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver.doSolve
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method doSolve()
    
    /**
    @utbot.classUnderTest {@link BracketingNthOrderBrentSolver}
 * @utbot.methodUnderTest {@link org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver#doSolve()}
 * @utbot.throwsException {@link org.apache.commons.math.exception.NumberIsTooLargeException} in: verifySequence(x[0], x[1], x[2]);
 *  */
    @Test(expected = NumberIsTooLargeException.class)
    public void testDoSolve_ThrowNumberIsTooLargeException() throws Exception  {
        BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver = ((BracketingNthOrderBrentSolver) createInstance("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver"));
        setField(bracketingNthOrderBrentSolver, "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "maximalOrder", 30);
        setField(bracketingNthOrderBrentSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "searchMin", 4.9E-324);
        setField(bracketingNthOrderBrentSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "searchMax", 0.0);
        setField(bracketingNthOrderBrentSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "searchStart", 4.9E-324);
        
        bracketingNthOrderBrentSolver.doSolve();
    }
    
    /**
    @utbot.classUnderTest {@link BracketingNthOrderBrentSolver}
 * @utbot.methodUnderTest {@link org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver#doSolve()}
 * @utbot.throwsException {@link org.apache.commons.math.exception.NumberIsTooLargeException} in: verifySequence(x[0], x[1], x[2]);
 *  */
    @Test(expected = NumberIsTooLargeException.class)
    public void testDoSolve_ThrowNumberIsTooLargeException_1() throws Exception  {
        BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver = ((BracketingNthOrderBrentSolver) createInstance("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver"));
        setField(bracketingNthOrderBrentSolver, "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "maximalOrder", 30);
        setField(bracketingNthOrderBrentSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "searchMin", 1.0361308E-317);
        setField(bracketingNthOrderBrentSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "searchMax", 2.1729236899484E-311);
        setField(bracketingNthOrderBrentSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "searchStart", 2.1729236899484E-311);
        
        bracketingNthOrderBrentSolver.doSolve();
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method doSolve()
    
    /**
    @utbot.classUnderTest {@link BracketingNthOrderBrentSolver}
 * @utbot.methodUnderTest {@link org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver#doSolve()}
 * @utbot.throwsException {@link java.lang.NegativeArraySizeException} in: final double[] x = new double[maximalOrder + 1];
 *  */
    @Test
    public void testDoSolve_ThrowNegativeArraySizeException() throws Exception  {
        BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver = ((BracketingNthOrderBrentSolver) createInstance("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver"));
        setField(bracketingNthOrderBrentSolver, "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "maximalOrder", -3);
        
        /* This test fails because method [org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver.doSolve] produces [java.lang.NegativeArraySizeException: -2]
            org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver.doSolve(BracketingNthOrderBrentSolver.java:146) */
        bracketingNthOrderBrentSolver.doSolve();
    }
    
    /**
    @utbot.classUnderTest {@link BracketingNthOrderBrentSolver}
 * @utbot.methodUnderTest {@link org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver#doSolve()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: x[0] = getMin();
 *  */
    @Test
    public void testDoSolve_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver = ((BracketingNthOrderBrentSolver) createInstance("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver"));
        setField(bracketingNthOrderBrentSolver, "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "maximalOrder", -1);
        setField(bracketingNthOrderBrentSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "searchMin", 0.0);
        
        /* This test fails because method [org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver.doSolve] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver.doSolve(BracketingNthOrderBrentSolver.java:148) */
        bracketingNthOrderBrentSolver.doSolve();
    }
    
    /**
    @utbot.classUnderTest {@link BracketingNthOrderBrentSolver}
 * @utbot.methodUnderTest {@link org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver#doSolve()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: x[1] = getStartValue();
 *  */
    @Test
    public void testDoSolve_ThrowArrayIndexOutOfBoundsException_1() throws Exception  {
        BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver = ((BracketingNthOrderBrentSolver) createInstance("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver"));
        setField(bracketingNthOrderBrentSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "searchMin", 0.0);
        setField(bracketingNthOrderBrentSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "searchStart", 0.0);
        
        /* This test fails because method [org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver.doSolve] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver.doSolve(BracketingNthOrderBrentSolver.java:149) */
        bracketingNthOrderBrentSolver.doSolve();
    }
    
    /**
    @utbot.classUnderTest {@link BracketingNthOrderBrentSolver}
 * @utbot.methodUnderTest {@link org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver#doSolve()}
 * @utbot.invokes {@link org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver#getMax()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: x[2] = getMax();
 *  */
    @Test
    public void testDoSolve_ThrowArrayIndexOutOfBoundsException_2() throws Exception  {
        BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver = ((BracketingNthOrderBrentSolver) createInstance("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver"));
        setField(bracketingNthOrderBrentSolver, "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "maximalOrder", 1);
        setField(bracketingNthOrderBrentSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "searchMin", 0.0);
        setField(bracketingNthOrderBrentSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "searchMax", 0.0);
        setField(bracketingNthOrderBrentSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "searchStart", 0.0);
        
        /* This test fails because method [org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver.doSolve] produces [java.lang.ArrayIndexOutOfBoundsException: Index 2 out of bounds for length 2]
            org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver.doSolve(BracketingNthOrderBrentSolver.java:150) */
        bracketingNthOrderBrentSolver.doSolve();
    }
    ///endregion
    
    ///region FUZZER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method doSolve()
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver}
     * @utbot.methodUnderTest {@link org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver#doSolve()}
     */
    @Test(expected = NumberIsTooLargeException.class)
    public void testDoSolveThrowsNITLE() {
        BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver = new BracketingNthOrderBrentSolver(-1.0, 4);
        
        bracketingNthOrderBrentSolver.doSolve();
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method doSolve()
    
    @Test
    public void testDoSolve1() throws Exception  {
        BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver = ((BracketingNthOrderBrentSolver) createInstance("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver"));
        setField(bracketingNthOrderBrentSolver, "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "maximalOrder", 30);
        Incrementor evaluations = ((Incrementor) createInstance("org.apache.commons.math.util.Incrementor"));
        evaluations.setMaximalCount(Integer.MIN_VALUE);
        setField(evaluations, "org.apache.commons.math.util.Incrementor", "count", Integer.MAX_VALUE);
        setField(bracketingNthOrderBrentSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "evaluations", evaluations);
        setField(bracketingNthOrderBrentSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "searchMin", -8.988465674311582E307);
        setField(bracketingNthOrderBrentSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "searchMax", 8.988465741280867E307);
        setField(bracketingNthOrderBrentSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "searchStart", 1.0);
        Acos function = ((Acos) createInstance("org.apache.commons.math.analysis.function.Acos"));
        setField(bracketingNthOrderBrentSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "function", function);
        
        double actual = bracketingNthOrderBrentSolver.doSolve();
        
        assertEquals(1.0, actual, 1.0E-6);
        
        Incrementor bracketingNthOrderBrentSolverEvaluations = ((Incrementor) getFieldValue(bracketingNthOrderBrentSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "evaluations"));
        int finalBracketingNthOrderBrentSolverEvaluationsCount = ((Integer) getFieldValue(bracketingNthOrderBrentSolverEvaluations, "org.apache.commons.math.util.Incrementor", "count"));
        
        org.junit.Assert.assertEquals(Integer.MIN_VALUE, finalBracketingNthOrderBrentSolverEvaluationsCount);
    }
    
    @Test
    public void testDoSolve2() throws Exception  {
        BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver = ((BracketingNthOrderBrentSolver) createInstance("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver"));
        setField(bracketingNthOrderBrentSolver, "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "maximalOrder", 35);
        Incrementor evaluations = ((Incrementor) createInstance("org.apache.commons.math.util.Incrementor"));
        evaluations.setMaximalCount(1881358997);
        setField(evaluations, "org.apache.commons.math.util.Incrementor", "count", 1881358996);
        setField(bracketingNthOrderBrentSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "evaluations", evaluations);
        setField(bracketingNthOrderBrentSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "searchMin", 1.4693679385278597E-39);
        setField(bracketingNthOrderBrentSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "searchMax", 8.988465674313623E307);
        setField(bracketingNthOrderBrentSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "searchStart", 1.0);
        Acosh function = ((Acosh) createInstance("org.apache.commons.math.analysis.function.Acosh"));
        setField(bracketingNthOrderBrentSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "function", function);
        
        double actual = bracketingNthOrderBrentSolver.doSolve();
        
        assertEquals(1.0, actual, 1.0E-6);
        
        Incrementor bracketingNthOrderBrentSolverEvaluations = ((Incrementor) getFieldValue(bracketingNthOrderBrentSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "evaluations"));
        int finalBracketingNthOrderBrentSolverEvaluationsCount = ((Integer) getFieldValue(bracketingNthOrderBrentSolverEvaluations, "org.apache.commons.math.util.Incrementor", "count"));
        
        org.junit.Assert.assertEquals(1881358997, finalBracketingNthOrderBrentSolverEvaluationsCount);
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method doSolve()
    
    @Test(expected = NoBracketingException.class)
    public void testDoSolve3() throws Exception  {
        BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver = ((BracketingNthOrderBrentSolver) createInstance("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver"));
        setField(bracketingNthOrderBrentSolver, "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "maximalOrder", 31);
        Incrementor evaluations = ((Incrementor) createInstance("org.apache.commons.math.util.Incrementor"));
        setField(evaluations, "org.apache.commons.math.util.Incrementor", "count", -136245318);
        setField(bracketingNthOrderBrentSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "evaluations", evaluations);
        setField(bracketingNthOrderBrentSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "searchMin", 0.7990189530612077);
        setField(bracketingNthOrderBrentSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "searchMax", 1.4363908866342345E308);
        setField(bracketingNthOrderBrentSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "searchStart", 1.5980379061224148);
        Acosh function = ((Acosh) createInstance("org.apache.commons.math.analysis.function.Acosh"));
        setField(bracketingNthOrderBrentSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "function", function);
        
        bracketingNthOrderBrentSolver.doSolve();
    }
    
    @Test(expected = NoBracketingException.class)
    public void testDoSolve4() throws Exception  {
        BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver = ((BracketingNthOrderBrentSolver) createInstance("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver"));
        setField(bracketingNthOrderBrentSolver, "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "maximalOrder", 7);
        Incrementor evaluations = ((Incrementor) createInstance("org.apache.commons.math.util.Incrementor"));
        setField(evaluations, "org.apache.commons.math.util.Incrementor", "count", -1404171093);
        setField(bracketingNthOrderBrentSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "evaluations", evaluations);
        setField(bracketingNthOrderBrentSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "searchMin", 1.5000300409737977);
        setField(bracketingNthOrderBrentSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "searchMax", java.lang.Double.NaN);
        setField(bracketingNthOrderBrentSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "searchStart", java.lang.Double.NaN);
        Acosh function = ((Acosh) createInstance("org.apache.commons.math.analysis.function.Acosh"));
        setField(bracketingNthOrderBrentSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "function", function);
        
        bracketingNthOrderBrentSolver.doSolve();
    }
    
    @Test(expected = NoBracketingException.class)
    public void testDoSolve5() throws Exception  {
        BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver = ((BracketingNthOrderBrentSolver) createInstance("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver"));
        setField(bracketingNthOrderBrentSolver, "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "maximalOrder", 18);
        Incrementor evaluations = ((Incrementor) createInstance("org.apache.commons.math.util.Incrementor"));
        evaluations.setMaximalCount(67108864);
        setField(evaluations, "org.apache.commons.math.util.Incrementor", "count", 37633188);
        setField(bracketingNthOrderBrentSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "evaluations", evaluations);
        setField(bracketingNthOrderBrentSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "searchMin", java.lang.Double.NaN);
        setField(bracketingNthOrderBrentSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "searchMax", java.lang.Double.NaN);
        setField(bracketingNthOrderBrentSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "searchStart", -1.0);
        Acos function = ((Acos) createInstance("org.apache.commons.math.analysis.function.Acos"));
        setField(bracketingNthOrderBrentSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "function", function);
        
        bracketingNthOrderBrentSolver.doSolve();
    }
    
    @Test(expected = TooManyEvaluationsException.class)
    public void testDoSolve6() throws Exception  {
        BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver = ((BracketingNthOrderBrentSolver) createInstance("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver"));
        setField(bracketingNthOrderBrentSolver, "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "maximalOrder", 29);
        Incrementor evaluations = ((Incrementor) createInstance("org.apache.commons.math.util.Incrementor"));
        evaluations.setMaximalCount(2147483390);
        setField(evaluations, "org.apache.commons.math.util.Incrementor", "count", 2147483389);
        Incrementor.MaxCountExceededCallback maxCountCallback = ((Incrementor.MaxCountExceededCallback) createInstance("org.apache.commons.math.util.Incrementor$1"));
        setField(evaluations, "org.apache.commons.math.util.Incrementor", "maxCountCallback", maxCountCallback);
        setField(bracketingNthOrderBrentSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "evaluations", evaluations);
        setField(bracketingNthOrderBrentSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "searchMin", java.lang.Double.NaN);
        setField(bracketingNthOrderBrentSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "searchMax", java.lang.Double.NaN);
        setField(bracketingNthOrderBrentSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "searchStart", -9.920042423855558E115);
        Acos function = ((Acos) createInstance("org.apache.commons.math.analysis.function.Acos"));
        setField(bracketingNthOrderBrentSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "function", function);
        
        bracketingNthOrderBrentSolver.doSolve();
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method doSolve()
    
    @Test
    public void testDoSolve7() throws Exception  {
        BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver = ((BracketingNthOrderBrentSolver) createInstance("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver"));
        setField(bracketingNthOrderBrentSolver, "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "maximalOrder", 30);
        Incrementor evaluations = ((Incrementor) createInstance("org.apache.commons.math.util.Incrementor"));
        evaluations.setMaximalCount(Integer.MIN_VALUE);
        setField(evaluations, "org.apache.commons.math.util.Incrementor", "count", Integer.MAX_VALUE);
        setField(bracketingNthOrderBrentSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "evaluations", evaluations);
        setField(bracketingNthOrderBrentSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "searchMin", java.lang.Double.NaN);
        setField(bracketingNthOrderBrentSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "searchMax", 9.385465550959819E154);
        setField(bracketingNthOrderBrentSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "searchStart", -5.433813323052481E231);
        Atan function = ((Atan) createInstance("org.apache.commons.math.analysis.function.Atan"));
        setField(bracketingNthOrderBrentSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "function", function);
        
        /* This test fails because method [org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver.doSolve] produces [java.lang.NullPointerException]
            org.apache.commons.math.util.Incrementor.incrementCount(Incrementor.java:151)
            org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver.incrementEvaluationCount(BaseAbstractUnivariateRealSolver.java:294)
            org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver.computeObjectiveValue(BaseAbstractUnivariateRealSolver.java:153)
            org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver.doSolve(BracketingNthOrderBrentSolver.java:161) */
        bracketingNthOrderBrentSolver.doSolve();
    }
    
    @Test
    public void testDoSolve8() throws Exception  {
        BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver = ((BracketingNthOrderBrentSolver) createInstance("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver"));
        setField(bracketingNthOrderBrentSolver, "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "maximalOrder", 30);
        Incrementor evaluations = ((Incrementor) createInstance("org.apache.commons.math.util.Incrementor"));
        evaluations.setMaximalCount(Integer.MIN_VALUE);
        setField(evaluations, "org.apache.commons.math.util.Incrementor", "count", Integer.MAX_VALUE);
        setField(bracketingNthOrderBrentSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "evaluations", evaluations);
        setField(bracketingNthOrderBrentSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "searchMin", -3.898125605467603E289);
        setField(bracketingNthOrderBrentSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "searchMax", 3.454520133027495E-77);
        setField(bracketingNthOrderBrentSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "searchStart", -4.22642073816383E270);
        Asinh function = ((Asinh) createInstance("org.apache.commons.math.analysis.function.Asinh"));
        setField(bracketingNthOrderBrentSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "function", function);
        
        /* This test fails because method [org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver.doSolve] produces [java.lang.NullPointerException]
            org.apache.commons.math.util.Incrementor.incrementCount(Incrementor.java:151)
            org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver.incrementEvaluationCount(BaseAbstractUnivariateRealSolver.java:294)
            org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver.computeObjectiveValue(BaseAbstractUnivariateRealSolver.java:153)
            org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver.doSolve(BracketingNthOrderBrentSolver.java:161) */
        bracketingNthOrderBrentSolver.doSolve();
    }
    
    @Test
    public void testDoSolve9() throws Exception  {
        BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver = ((BracketingNthOrderBrentSolver) createInstance("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver"));
        setField(bracketingNthOrderBrentSolver, "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "maximalOrder", 30);
        Incrementor evaluations = ((Incrementor) createInstance("org.apache.commons.math.util.Incrementor"));
        evaluations.setMaximalCount(Integer.MIN_VALUE);
        setField(evaluations, "org.apache.commons.math.util.Incrementor", "count", Integer.MAX_VALUE);
        setField(bracketingNthOrderBrentSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "evaluations", evaluations);
        setField(bracketingNthOrderBrentSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "searchMin", java.lang.Double.NaN);
        setField(bracketingNthOrderBrentSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "searchMax", 4.250000000000001);
        setField(bracketingNthOrderBrentSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "searchStart", -4.519375185668714E37);
        Asin function = ((Asin) createInstance("org.apache.commons.math.analysis.function.Asin"));
        setField(bracketingNthOrderBrentSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "function", function);
        
        /* This test fails because method [org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver.doSolve] produces [java.lang.NullPointerException]
            org.apache.commons.math.util.Incrementor.incrementCount(Incrementor.java:151)
            org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver.incrementEvaluationCount(BaseAbstractUnivariateRealSolver.java:294)
            org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver.computeObjectiveValue(BaseAbstractUnivariateRealSolver.java:153)
            org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver.doSolve(BracketingNthOrderBrentSolver.java:161) */
        bracketingNthOrderBrentSolver.doSolve();
    }
    
    @Test
    public void testDoSolve10() throws Exception  {
        BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver = ((BracketingNthOrderBrentSolver) createInstance("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver"));
        setField(bracketingNthOrderBrentSolver, "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "maximalOrder", 2);
        Incrementor evaluations = ((Incrementor) createInstance("org.apache.commons.math.util.Incrementor"));
        setField(evaluations, "org.apache.commons.math.util.Incrementor", "count", -2);
        setField(bracketingNthOrderBrentSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "evaluations", evaluations);
        setField(bracketingNthOrderBrentSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "searchMin", 4.9E-324);
        setField(bracketingNthOrderBrentSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "searchMax", -2.993246697106023E51);
        setField(bracketingNthOrderBrentSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "searchStart", java.lang.Double.NaN);
        Acos function = ((Acos) createInstance("org.apache.commons.math.analysis.function.Acos"));
        setField(bracketingNthOrderBrentSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "function", function);
        
        /* This test fails because method [org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver.doSolve] produces [java.lang.NullPointerException]
            org.apache.commons.math.util.Incrementor.incrementCount(Incrementor.java:151)
            org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver.incrementEvaluationCount(BaseAbstractUnivariateRealSolver.java:294)
            org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver.computeObjectiveValue(BaseAbstractUnivariateRealSolver.java:153)
            org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver.doSolve(BracketingNthOrderBrentSolver.java:178) */
        bracketingNthOrderBrentSolver.doSolve();
    }
    
    @Test
    public void testDoSolve11() throws Exception  {
        BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver = ((BracketingNthOrderBrentSolver) createInstance("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver"));
        setField(bracketingNthOrderBrentSolver, "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "maximalOrder", 30);
        Incrementor evaluations = ((Incrementor) createInstance("org.apache.commons.math.util.Incrementor"));
        setField(evaluations, "org.apache.commons.math.util.Incrementor", "count", -2);
        setField(bracketingNthOrderBrentSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "evaluations", evaluations);
        setField(bracketingNthOrderBrentSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "searchMin", -8.988465674311582E307);
        setField(bracketingNthOrderBrentSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "searchMax", java.lang.Double.NaN);
        setField(bracketingNthOrderBrentSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "searchStart", -1.0);
        Acos function = ((Acos) createInstance("org.apache.commons.math.analysis.function.Acos"));
        setField(bracketingNthOrderBrentSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "function", function);
        
        /* This test fails because method [org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver.doSolve] produces [java.lang.NullPointerException]
            org.apache.commons.math.util.Incrementor.incrementCount(Incrementor.java:151)
            org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver.incrementEvaluationCount(BaseAbstractUnivariateRealSolver.java:294)
            org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver.computeObjectiveValue(BaseAbstractUnivariateRealSolver.java:153)
            org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver.doSolve(BracketingNthOrderBrentSolver.java:178) */
        bracketingNthOrderBrentSolver.doSolve();
    }
    
    @Test
    public void testDoSolve12() throws Exception  {
        BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver = ((BracketingNthOrderBrentSolver) createInstance("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver"));
        setField(bracketingNthOrderBrentSolver, "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "maximalOrder", 16);
        Incrementor evaluations = ((Incrementor) createInstance("org.apache.commons.math.util.Incrementor"));
        evaluations.setMaximalCount(10488449);
        setField(evaluations, "org.apache.commons.math.util.Incrementor", "count", 10488448);
        setField(bracketingNthOrderBrentSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "evaluations", evaluations);
        setField(bracketingNthOrderBrentSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "searchMin", 3.5916185046655424E-188);
        setField(bracketingNthOrderBrentSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "searchMax", 2.681631933345559E154);
        setField(bracketingNthOrderBrentSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "searchStart", 2.0100000000109195);
        Acosh function = ((Acosh) createInstance("org.apache.commons.math.analysis.function.Acosh"));
        setField(bracketingNthOrderBrentSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "function", function);
        
        /* This test fails because method [org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver.doSolve] produces [java.lang.NullPointerException]
            org.apache.commons.math.util.Incrementor.incrementCount(Incrementor.java:151)
            org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver.incrementEvaluationCount(BaseAbstractUnivariateRealSolver.java:294)
            org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver.computeObjectiveValue(BaseAbstractUnivariateRealSolver.java:153)
            org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver.doSolve(BracketingNthOrderBrentSolver.java:161) */
        bracketingNthOrderBrentSolver.doSolve();
    }
    
    @Test
    public void testDoSolve13() throws Exception  {
        BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver = ((BracketingNthOrderBrentSolver) createInstance("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver"));
        setField(bracketingNthOrderBrentSolver, "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "maximalOrder", 34);
        Incrementor evaluations = ((Incrementor) createInstance("org.apache.commons.math.util.Incrementor"));
        setField(evaluations, "org.apache.commons.math.util.Incrementor", "count", -2);
        setField(bracketingNthOrderBrentSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "evaluations", evaluations);
        setField(bracketingNthOrderBrentSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "searchMin", -2.225073858507202E-308);
        setField(bracketingNthOrderBrentSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "searchMax", java.lang.Double.NaN);
        setField(bracketingNthOrderBrentSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "searchStart", -0.0);
        Acos function = ((Acos) createInstance("org.apache.commons.math.analysis.function.Acos"));
        setField(bracketingNthOrderBrentSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "function", function);
        
        /* This test fails because method [org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver.doSolve] produces [java.lang.NullPointerException]
            org.apache.commons.math.util.Incrementor.incrementCount(Incrementor.java:151)
            org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver.incrementEvaluationCount(BaseAbstractUnivariateRealSolver.java:294)
            org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver.computeObjectiveValue(BaseAbstractUnivariateRealSolver.java:153)
            org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver.doSolve(BracketingNthOrderBrentSolver.java:178) */
        bracketingNthOrderBrentSolver.doSolve();
    }
    
    @Test
    public void testDoSolve14() throws Exception  {
        BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver = ((BracketingNthOrderBrentSolver) createInstance("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver"));
        setField(bracketingNthOrderBrentSolver, "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "maximalOrder", 8);
        Incrementor evaluations = ((Incrementor) createInstance("org.apache.commons.math.util.Incrementor"));
        setField(evaluations, "org.apache.commons.math.util.Incrementor", "count", -2);
        setField(bracketingNthOrderBrentSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "evaluations", evaluations);
        setField(bracketingNthOrderBrentSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "searchMin", -4.49423283741739E307);
        setField(bracketingNthOrderBrentSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "searchMax", java.lang.Double.NaN);
        setField(bracketingNthOrderBrentSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "searchStart", 2.2482136433921646E307);
        Acos function = ((Acos) createInstance("org.apache.commons.math.analysis.function.Acos"));
        setField(bracketingNthOrderBrentSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "function", function);
        
        /* This test fails because method [org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver.doSolve] produces [java.lang.NullPointerException]
            org.apache.commons.math.util.Incrementor.incrementCount(Incrementor.java:151)
            org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver.incrementEvaluationCount(BaseAbstractUnivariateRealSolver.java:294)
            org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver.computeObjectiveValue(BaseAbstractUnivariateRealSolver.java:153)
            org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver.doSolve(BracketingNthOrderBrentSolver.java:178) */
        bracketingNthOrderBrentSolver.doSolve();
    }
    
    @Test
    public void testDoSolve15() throws Exception  {
        BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver = ((BracketingNthOrderBrentSolver) createInstance("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver"));
        setField(bracketingNthOrderBrentSolver, "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "maximalOrder", 7);
        Incrementor evaluations = ((Incrementor) createInstance("org.apache.commons.math.util.Incrementor"));
        evaluations.setMaximalCount(361296197);
        setField(evaluations, "org.apache.commons.math.util.Incrementor", "count", 361296196);
        setField(bracketingNthOrderBrentSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "evaluations", evaluations);
        setField(bracketingNthOrderBrentSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "searchMin", -1.590358051454831E82);
        setField(bracketingNthOrderBrentSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "searchMax", java.lang.Double.NaN);
        setField(bracketingNthOrderBrentSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "searchStart", -0.5000152587891764);
        Acosh function = ((Acosh) createInstance("org.apache.commons.math.analysis.function.Acosh"));
        setField(bracketingNthOrderBrentSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "function", function);
        
        /* This test fails because method [org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver.doSolve] produces [java.lang.NullPointerException]
            org.apache.commons.math.util.Incrementor.incrementCount(Incrementor.java:151)
            org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver.incrementEvaluationCount(BaseAbstractUnivariateRealSolver.java:294)
            org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver.computeObjectiveValue(BaseAbstractUnivariateRealSolver.java:153)
            org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver.doSolve(BracketingNthOrderBrentSolver.java:161) */
        bracketingNthOrderBrentSolver.doSolve();
    }
    
    @Test
    public void testDoSolve16() throws Exception  {
        BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver = ((BracketingNthOrderBrentSolver) createInstance("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver"));
        setField(bracketingNthOrderBrentSolver, "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "maximalOrder", 3);
        Incrementor evaluations = ((Incrementor) createInstance("org.apache.commons.math.util.Incrementor"));
        evaluations.setMaximalCount(805314560);
        setField(evaluations, "org.apache.commons.math.util.Incrementor", "count", 805314559);
        setField(bracketingNthOrderBrentSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "evaluations", evaluations);
        setField(bracketingNthOrderBrentSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "searchMin", -9.1289104504727E307);
        setField(bracketingNthOrderBrentSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "searchMax", java.lang.Double.NaN);
        setField(bracketingNthOrderBrentSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "searchStart", 1.015625);
        Acosh function = ((Acosh) createInstance("org.apache.commons.math.analysis.function.Acosh"));
        setField(bracketingNthOrderBrentSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "function", function);
        
        /* This test fails because method [org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver.doSolve] produces [java.lang.NullPointerException]
            org.apache.commons.math.util.Incrementor.incrementCount(Incrementor.java:151)
            org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver.incrementEvaluationCount(BaseAbstractUnivariateRealSolver.java:294)
            org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver.computeObjectiveValue(BaseAbstractUnivariateRealSolver.java:153)
            org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver.doSolve(BracketingNthOrderBrentSolver.java:161) */
        bracketingNthOrderBrentSolver.doSolve();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver.guessX
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method guessX(double, [D, [D, int, int)
    
    /**
    @utbot.classUnderTest {@link BracketingNthOrderBrentSolver}
 * @utbot.methodUnderTest {@link org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver#guessX(double,double[],double[],int,int)}
 * @utbot.iterates iterate the loop {@code for(int j = end - 1; j >= start; --j)} once
 * @utbot.returnsFrom {@code return x0;}
 *  */
    @Test
    public void testGuessX_IterateForLoop() throws Exception  {
        BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver = ((BracketingNthOrderBrentSolver) createInstance("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver"));
        double[] doubleArray = {0.0, 0.0};
        
        Class bracketingNthOrderBrentSolverClazz = Class.forName("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver");
        Class doubleType = double.class;
        Class doubleArrayType = Class.forName("[D");
        Class intType = int.class;
        Method guessXMethod = bracketingNthOrderBrentSolverClazz.getDeclaredMethod("guessX", doubleType, doubleArrayType, doubleArrayType, intType, intType);
        guessXMethod.setAccessible(true);
        java.lang.Object[] guessXMethodArguments = new java.lang.Object[5];
        guessXMethodArguments[0] = java.lang.Double.NaN;
        guessXMethodArguments[1] = ((Object) doubleArray);
        guessXMethodArguments[2] = ((Object) doubleArray);
        guessXMethodArguments[3] = 1;
        guessXMethodArguments[4] = 2;
        double actual = ((Double) guessXMethod.invoke(bracketingNthOrderBrentSolver, guessXMethodArguments));
        
        assertEquals(java.lang.Double.NaN, actual, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link BracketingNthOrderBrentSolver}
 * @utbot.methodUnderTest {@link org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver#guessX(double,double[],double[],int,int)}
 * @utbot.iterates iterate the loop {@code for(int i = start; i < end - 1; ++i)} once
 * @utbot.iterates iterate the loop {@code for(int j = end - 1; j >= start; --j)} twice
 * @utbot.returnsFrom {@code return x0;}
 *  */
    @Test
    public void testGuessX_IterateForLoop_1() throws Exception  {
        BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver = ((BracketingNthOrderBrentSolver) createInstance("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver"));
        double[] doubleArray = {0.0, 0.0};
        
        Class bracketingNthOrderBrentSolverClazz = Class.forName("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver");
        Class doubleType = double.class;
        Class doubleArrayType = Class.forName("[D");
        Class intType = int.class;
        Method guessXMethod = bracketingNthOrderBrentSolverClazz.getDeclaredMethod("guessX", doubleType, doubleArrayType, doubleArrayType, intType, intType);
        guessXMethod.setAccessible(true);
        java.lang.Object[] guessXMethodArguments = new java.lang.Object[5];
        guessXMethodArguments[0] = java.lang.Double.NaN;
        guessXMethodArguments[1] = ((Object) doubleArray);
        guessXMethodArguments[2] = ((Object) doubleArray);
        guessXMethodArguments[3] = 0;
        guessXMethodArguments[4] = 2;
        double actual = ((Double) guessXMethod.invoke(bracketingNthOrderBrentSolver, guessXMethodArguments));
        
        assertEquals(java.lang.Double.NaN, actual, 1.0E-6);
        
        double finalDoubleArray1 = doubleArray[1];
        
        double finalDoubleArray11 = doubleArray[1];
        
        assertEquals(java.lang.Double.NaN, finalDoubleArray1, 1.0E-6);
        
        assertEquals(java.lang.Double.NaN, finalDoubleArray11, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link BracketingNthOrderBrentSolver}
 * @utbot.methodUnderTest {@link org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver#guessX(double,double[],double[],int,int)}
 * @utbot.returnsFrom {@code return x0;}
 *  */
    @Test
    public void testGuessX_ReturnX0() throws Exception  {
        BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver = ((BracketingNthOrderBrentSolver) createInstance("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver"));
        
        Class bracketingNthOrderBrentSolverClazz = Class.forName("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver");
        Class doubleType = double.class;
        Class doubleArrayType = Class.forName("[D");
        Class intType = int.class;
        Method guessXMethod = bracketingNthOrderBrentSolverClazz.getDeclaredMethod("guessX", doubleType, doubleArrayType, doubleArrayType, intType, intType);
        guessXMethod.setAccessible(true);
        java.lang.Object[] guessXMethodArguments = new java.lang.Object[5];
        guessXMethodArguments[0] = java.lang.Double.NaN;
        guessXMethodArguments[1] = ((Object) null);
        guessXMethodArguments[2] = ((Object) null);
        guessXMethodArguments[3] = -127;
        guessXMethodArguments[4] = -255;
        double actual = ((Double) guessXMethod.invoke(bracketingNthOrderBrentSolver, guessXMethodArguments));
        
        assertEquals(0.0, actual, 1.0E-6);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method guessX(double, [D, [D, int, int)
    
    /**
    @utbot.classUnderTest {@link BracketingNthOrderBrentSolver}
 * @utbot.methodUnderTest {@link org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver#guessX(double,double[],double[],int,int)}
 * @utbot.iterates iterate the loop {@code for(int i = start; i < end - 1; ++i)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: x[j] = (x[j] - x[j - 1]) / (y[j] - y[j - delta]);
 *  */
    @Test
    public void testGuessX_ThrowArrayIndexOutOfBoundsException_2() throws Throwable  {
        BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver = ((BracketingNthOrderBrentSolver) createInstance("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver"));
        double[] doubleArray = {0.0, 0.0};
        double[] doubleArray1 = {0.0};
        
        /* This test fails because method [org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver.guessX] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver.guessX(BracketingNthOrderBrentSolver.java:368) */
        Class bracketingNthOrderBrentSolverClazz = Class.forName("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver");
        Class doubleType = double.class;
        Class doubleArrayType = Class.forName("[D");
        Class intType = int.class;
        Method guessXMethod = bracketingNthOrderBrentSolverClazz.getDeclaredMethod("guessX", doubleType, doubleArrayType, doubleArrayType, intType, intType);
        guessXMethod.setAccessible(true);
        java.lang.Object[] guessXMethodArguments = new java.lang.Object[5];
        guessXMethodArguments[0] = java.lang.Double.NaN;
        guessXMethodArguments[1] = ((Object) doubleArray);
        guessXMethodArguments[2] = ((Object) doubleArray1);
        guessXMethodArguments[3] = 0;
        guessXMethodArguments[4] = 2;
        try {
            guessXMethod.invoke(bracketingNthOrderBrentSolver, guessXMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link BracketingNthOrderBrentSolver}
 * @utbot.methodUnderTest {@link org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver#guessX(double,double[],double[],int,int)}
 * @utbot.iterates iterate the loop {@code for(int j = end - 1; j >= start; --j)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: x0 = x[j] + x0 * (targetY - y[j]);
 *  */
    @Test
    public void testGuessX_ThrowArrayIndexOutOfBoundsException_4() throws Throwable  {
        BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver = ((BracketingNthOrderBrentSolver) createInstance("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver"));
        double[] doubleArray = {0.0};
        double[] doubleArray1 = {};
        
        /* This test fails because method [org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver.guessX] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver.guessX(BracketingNthOrderBrentSolver.java:375) */
        Class bracketingNthOrderBrentSolverClazz = Class.forName("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver");
        Class doubleType = double.class;
        Class doubleArrayType = Class.forName("[D");
        Class intType = int.class;
        Method guessXMethod = bracketingNthOrderBrentSolverClazz.getDeclaredMethod("guessX", doubleType, doubleArrayType, doubleArrayType, intType, intType);
        guessXMethod.setAccessible(true);
        java.lang.Object[] guessXMethodArguments = new java.lang.Object[5];
        guessXMethodArguments[0] = java.lang.Double.NaN;
        guessXMethodArguments[1] = ((Object) doubleArray);
        guessXMethodArguments[2] = ((Object) doubleArray1);
        guessXMethodArguments[3] = 0;
        guessXMethodArguments[4] = 1;
        try {
            guessXMethod.invoke(bracketingNthOrderBrentSolver, guessXMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link BracketingNthOrderBrentSolver}
 * @utbot.methodUnderTest {@link org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver#guessX(double,double[],double[],int,int)}
 * @utbot.iterates iterate the loop {@code for(int i = start; i < end - 1; ++i)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: x[j] = (x[j] - x[j - 1]) / (y[j] - y[j - delta]);
 *  */
    @Test
    public void testGuessX_ThrowArrayIndexOutOfBoundsException_5() throws Throwable  {
        BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver = ((BracketingNthOrderBrentSolver) createInstance("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver"));
        double[] doubleArray = new double[11];
        double[] doubleArray1 = {0.0, 0.0};
        
        /* This test fails because method [org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver.guessX] produces [java.lang.ArrayIndexOutOfBoundsException: Index -1 out of bounds for length 11]
            org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver.guessX(BracketingNthOrderBrentSolver.java:368) */
        Class bracketingNthOrderBrentSolverClazz = Class.forName("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver");
        Class doubleType = double.class;
        Class doubleArrayType = Class.forName("[D");
        Class intType = int.class;
        Method guessXMethod = bracketingNthOrderBrentSolverClazz.getDeclaredMethod("guessX", doubleType, doubleArrayType, doubleArrayType, intType, intType);
        guessXMethod.setAccessible(true);
        java.lang.Object[] guessXMethodArguments = new java.lang.Object[5];
        guessXMethodArguments[0] = java.lang.Double.NaN;
        guessXMethodArguments[1] = ((Object) doubleArray);
        guessXMethodArguments[2] = ((Object) doubleArray1);
        guessXMethodArguments[3] = -255;
        guessXMethodArguments[4] = 2;
        try {
            guessXMethod.invoke(bracketingNthOrderBrentSolver, guessXMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link BracketingNthOrderBrentSolver}
 * @utbot.methodUnderTest {@link org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver#guessX(double,double[],double[],int,int)}
 * @utbot.iterates iterate the loop {@code for(int i = start; i < end - 1; ++i)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: x[j] = (x[j] - x[j - 1]) / (y[j] - y[j - delta]);
 *  */
    @Test
    public void testGuessX_ThrowArrayIndexOutOfBoundsException() throws Throwable  {
        BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver = ((BracketingNthOrderBrentSolver) createInstance("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver"));
        double[] doubleArray = {0.0};
        
        /* This test fails because method [org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver.guessX] produces [java.lang.ArrayIndexOutOfBoundsException: Index -1 out of bounds for length 1]
            org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver.guessX(BracketingNthOrderBrentSolver.java:368) */
        Class bracketingNthOrderBrentSolverClazz = Class.forName("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver");
        Class doubleType = double.class;
        Class doubleArrayType = Class.forName("[D");
        Class intType = int.class;
        Method guessXMethod = bracketingNthOrderBrentSolverClazz.getDeclaredMethod("guessX", doubleType, doubleArrayType, doubleArrayType, intType, intType);
        guessXMethod.setAccessible(true);
        java.lang.Object[] guessXMethodArguments = new java.lang.Object[5];
        guessXMethodArguments[0] = java.lang.Double.NaN;
        guessXMethodArguments[1] = ((Object) doubleArray);
        guessXMethodArguments[2] = ((Object) null);
        guessXMethodArguments[3] = -2;
        guessXMethodArguments[4] = 0;
        try {
            guessXMethod.invoke(bracketingNthOrderBrentSolver, guessXMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link BracketingNthOrderBrentSolver}
 * @utbot.methodUnderTest {@link org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver#guessX(double,double[],double[],int,int)}
 * @utbot.iterates iterate the loop {@code for(int i = start; i < end - 1; ++i)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: x[j] = (x[j] - x[j - 1]) / (y[j] - y[j - delta]);
 *  */
    @Test
    public void testGuessX_ThrowArrayIndexOutOfBoundsException_1() throws Throwable  {
        BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver = ((BracketingNthOrderBrentSolver) createInstance("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver"));
        double[] doubleArray = {0.0};
        
        /* This test fails because method [org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver.guessX] produces [java.lang.ArrayIndexOutOfBoundsException: Index -1 out of bounds for length 1]
            org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver.guessX(BracketingNthOrderBrentSolver.java:368) */
        Class bracketingNthOrderBrentSolverClazz = Class.forName("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver");
        Class doubleType = double.class;
        Class doubleArrayType = Class.forName("[D");
        Class intType = int.class;
        Method guessXMethod = bracketingNthOrderBrentSolverClazz.getDeclaredMethod("guessX", doubleType, doubleArrayType, doubleArrayType, intType, intType);
        guessXMethod.setAccessible(true);
        java.lang.Object[] guessXMethodArguments = new java.lang.Object[5];
        guessXMethodArguments[0] = java.lang.Double.NaN;
        guessXMethodArguments[1] = ((Object) doubleArray);
        guessXMethodArguments[2] = ((Object) null);
        guessXMethodArguments[3] = -1;
        guessXMethodArguments[4] = 1;
        try {
            guessXMethod.invoke(bracketingNthOrderBrentSolver, guessXMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link BracketingNthOrderBrentSolver}
 * @utbot.methodUnderTest {@link org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver#guessX(double,double[],double[],int,int)}
 * @utbot.iterates iterate the loop {@code for(int j = end - 1; j >= start; --j)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: x0 = x[j] + x0 * (targetY - y[j]);
 *  */
    @Test
    public void testGuessX_ThrowArrayIndexOutOfBoundsException_3() throws Throwable  {
        BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver = ((BracketingNthOrderBrentSolver) createInstance("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver"));
        double[] doubleArray = {0.0, 0.0};
        
        /* This test fails because method [org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver.guessX] produces [java.lang.ArrayIndexOutOfBoundsException: Index 129 out of bounds for length 2]
            org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver.guessX(BracketingNthOrderBrentSolver.java:375) */
        Class bracketingNthOrderBrentSolverClazz = Class.forName("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver");
        Class doubleType = double.class;
        Class doubleArrayType = Class.forName("[D");
        Class intType = int.class;
        Method guessXMethod = bracketingNthOrderBrentSolverClazz.getDeclaredMethod("guessX", doubleType, doubleArrayType, doubleArrayType, intType, intType);
        guessXMethod.setAccessible(true);
        java.lang.Object[] guessXMethodArguments = new java.lang.Object[5];
        guessXMethodArguments[0] = java.lang.Double.NaN;
        guessXMethodArguments[1] = ((Object) doubleArray);
        guessXMethodArguments[2] = ((Object) null);
        guessXMethodArguments[3] = 129;
        guessXMethodArguments[4] = 130;
        try {
            guessXMethod.invoke(bracketingNthOrderBrentSolver, guessXMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link BracketingNthOrderBrentSolver}
 * @utbot.methodUnderTest {@link org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver#guessX(double,double[],double[],int,int)}
 * @utbot.iterates iterate the loop {@code for(int i = start; i < end - 1; ++i)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: x[j] = (x[j] - x[j - 1]) / (y[j] - y[j - delta]);
 *  */
    @Test
    public void testGuessX_ThrowNullPointerException_1() throws Throwable  {
        BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver = ((BracketingNthOrderBrentSolver) createInstance("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver"));
        double[] doubleArray = {0.0, 0.0};
        
        /* This test fails because method [org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver.guessX] produces [java.lang.NullPointerException]
            org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver.guessX(BracketingNthOrderBrentSolver.java:368) */
        Class bracketingNthOrderBrentSolverClazz = Class.forName("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver");
        Class doubleType = double.class;
        Class doubleArrayType = Class.forName("[D");
        Class intType = int.class;
        Method guessXMethod = bracketingNthOrderBrentSolverClazz.getDeclaredMethod("guessX", doubleType, doubleArrayType, doubleArrayType, intType, intType);
        guessXMethod.setAccessible(true);
        java.lang.Object[] guessXMethodArguments = new java.lang.Object[5];
        guessXMethodArguments[0] = java.lang.Double.NaN;
        guessXMethodArguments[1] = ((Object) doubleArray);
        guessXMethodArguments[2] = ((Object) null);
        guessXMethodArguments[3] = 0;
        guessXMethodArguments[4] = 2;
        try {
            guessXMethod.invoke(bracketingNthOrderBrentSolver, guessXMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link BracketingNthOrderBrentSolver}
 * @utbot.methodUnderTest {@link org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver#guessX(double,double[],double[],int,int)}
 * @utbot.iterates iterate the loop {@code for(int j = end - 1; j >= start; --j)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: x0 = x[j] + x0 * (targetY - y[j]);
 *  */
    @Test
    public void testGuessX_ThrowNullPointerException_3() throws Throwable  {
        BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver = ((BracketingNthOrderBrentSolver) createInstance("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver"));
        double[] doubleArray = {0.0};
        
        /* This test fails because method [org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver.guessX] produces [java.lang.NullPointerException]
            org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver.guessX(BracketingNthOrderBrentSolver.java:375) */
        Class bracketingNthOrderBrentSolverClazz = Class.forName("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver");
        Class doubleType = double.class;
        Class doubleArrayType = Class.forName("[D");
        Class intType = int.class;
        Method guessXMethod = bracketingNthOrderBrentSolverClazz.getDeclaredMethod("guessX", doubleType, doubleArrayType, doubleArrayType, intType, intType);
        guessXMethod.setAccessible(true);
        java.lang.Object[] guessXMethodArguments = new java.lang.Object[5];
        guessXMethodArguments[0] = java.lang.Double.NaN;
        guessXMethodArguments[1] = ((Object) doubleArray);
        guessXMethodArguments[2] = ((Object) null);
        guessXMethodArguments[3] = 0;
        guessXMethodArguments[4] = 1;
        try {
            guessXMethod.invoke(bracketingNthOrderBrentSolver, guessXMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link BracketingNthOrderBrentSolver}
 * @utbot.methodUnderTest {@link org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver#guessX(double,double[],double[],int,int)}
 * @utbot.iterates iterate the loop {@code for(int i = start; i < end - 1; ++i)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: x[j] = (x[j] - x[j - 1]) / (y[j] - y[j - delta]);
 *  */
    @Test
    public void testGuessX_ThrowNullPointerException() throws Throwable  {
        BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver = ((BracketingNthOrderBrentSolver) createInstance("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver"));
        
        /* This test fails because method [org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver.guessX] produces [java.lang.NullPointerException]
            org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver.guessX(BracketingNthOrderBrentSolver.java:368) */
        Class bracketingNthOrderBrentSolverClazz = Class.forName("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver");
        Class doubleType = double.class;
        Class doubleArrayType = Class.forName("[D");
        Class intType = int.class;
        Method guessXMethod = bracketingNthOrderBrentSolverClazz.getDeclaredMethod("guessX", doubleType, doubleArrayType, doubleArrayType, intType, intType);
        guessXMethod.setAccessible(true);
        java.lang.Object[] guessXMethodArguments = new java.lang.Object[5];
        guessXMethodArguments[0] = java.lang.Double.NaN;
        guessXMethodArguments[1] = ((Object) null);
        guessXMethodArguments[2] = ((Object) null);
        guessXMethodArguments[3] = 254;
        guessXMethodArguments[4] = 256;
        try {
            guessXMethod.invoke(bracketingNthOrderBrentSolver, guessXMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link BracketingNthOrderBrentSolver}
 * @utbot.methodUnderTest {@link org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver#guessX(double,double[],double[],int,int)}
 * @utbot.iterates iterate the loop {@code for(int j = end - 1; j >= start; --j)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: x0 = x[j] + x0 * (targetY - y[j]);
 *  */
    @Test
    public void testGuessX_ThrowNullPointerException_2() throws Throwable  {
        BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver = ((BracketingNthOrderBrentSolver) createInstance("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver"));
        
        /* This test fails because method [org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver.guessX] produces [java.lang.NullPointerException]
            org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver.guessX(BracketingNthOrderBrentSolver.java:375) */
        Class bracketingNthOrderBrentSolverClazz = Class.forName("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver");
        Class doubleType = double.class;
        Class doubleArrayType = Class.forName("[D");
        Class intType = int.class;
        Method guessXMethod = bracketingNthOrderBrentSolverClazz.getDeclaredMethod("guessX", doubleType, doubleArrayType, doubleArrayType, intType, intType);
        guessXMethod.setAccessible(true);
        java.lang.Object[] guessXMethodArguments = new java.lang.Object[5];
        guessXMethodArguments[0] = java.lang.Double.NaN;
        guessXMethodArguments[1] = ((Object) null);
        guessXMethodArguments[2] = ((Object) null);
        guessXMethodArguments[3] = 65;
        guessXMethodArguments[4] = 66;
        try {
            guessXMethod.invoke(bracketingNthOrderBrentSolver, guessXMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver.solve
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method solve(int, org.apache.commons.math.analysis.UnivariateFunction, double, double, org.apache.commons.math.analysis.solvers.AllowedSolution)
    
    /**
    @utbot.classUnderTest {@link BracketingNthOrderBrentSolver}
 * @utbot.methodUnderTest {@link org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver#solve(int,org.apache.commons.math.analysis.UnivariateFunction,double,double,org.apache.commons.math.analysis.solvers.AllowedSolution)}
 * @utbot.invokes {@link org.apache.commons.math.analysis.solvers.AbstractUnivariateRealSolver#solve(int,org.apache.commons.math.analysis.UnivariateFunction,double,double)}
 * @utbot.throwsException {@link org.apache.commons.math.exception.NullArgumentException} in: return super.solve(maxEval, f, min, max);
 *  */
    @Test(expected = NullArgumentException.class)
    public void testSolve_ThrowNullArgumentException() throws Exception  {
        BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver = ((BracketingNthOrderBrentSolver) createInstance("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver"));
        
        bracketingNthOrderBrentSolver.solve(-255, ((UnivariateFunction) null), java.lang.Double.NaN, java.lang.Double.NaN, ((AllowedSolution) null));
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method solve(int, org.apache.commons.math.analysis.UnivariateFunction, double, double, org.apache.commons.math.analysis.solvers.AllowedSolution)
    
    /**
    @utbot.classUnderTest {@link BracketingNthOrderBrentSolver}
 * @utbot.methodUnderTest {@link org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver#solve(int,org.apache.commons.math.analysis.UnivariateFunction,double,double,org.apache.commons.math.analysis.solvers.AllowedSolution)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return super.solve(maxEval, f, min, max);
 *  */
    @Test
    public void testSolve_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver = ((BracketingNthOrderBrentSolver) createInstance("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver"));
        setField(bracketingNthOrderBrentSolver, "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "maximalOrder", -1);
        Incrementor evaluations = ((Incrementor) createInstance("org.apache.commons.math.util.Incrementor"));
        setField(bracketingNthOrderBrentSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "evaluations", evaluations);
        setField(bracketingNthOrderBrentSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "searchMin", 0.0);
        setField(bracketingNthOrderBrentSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "searchMax", 0.0);
        setField(bracketingNthOrderBrentSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "searchStart", 0.0);
        Acos acos = new Acos();
        
        /* This test fails because method [org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver.solve] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver.doSolve(BracketingNthOrderBrentSolver.java:148)
            org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver.solve(BaseAbstractUnivariateRealSolver.java:190)
            org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver.solve(BaseAbstractUnivariateRealSolver.java:195)
            org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver.solve(BracketingNthOrderBrentSolver.java:386) */
        bracketingNthOrderBrentSolver.solve(-255, ((UnivariateFunction) acos), java.lang.Double.NaN, java.lang.Double.NaN, ((AllowedSolution) null));
    }
    
    /**
    @utbot.classUnderTest {@link BracketingNthOrderBrentSolver}
 * @utbot.methodUnderTest {@link org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver#solve(int,org.apache.commons.math.analysis.UnivariateFunction,double,double,org.apache.commons.math.analysis.solvers.AllowedSolution)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return super.solve(maxEval, f, min, max);
 *  */
    @Test
    public void testSolve_ThrowArrayIndexOutOfBoundsException_1() throws Exception  {
        BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver = ((BracketingNthOrderBrentSolver) createInstance("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver"));
        Incrementor evaluations = ((Incrementor) createInstance("org.apache.commons.math.util.Incrementor"));
        setField(bracketingNthOrderBrentSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "evaluations", evaluations);
        setField(bracketingNthOrderBrentSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "searchMin", 0.0);
        setField(bracketingNthOrderBrentSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "searchMax", 0.0);
        setField(bracketingNthOrderBrentSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "searchStart", 0.0);
        Acos acos = new Acos();
        
        /* This test fails because method [org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver.solve] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver.doSolve(BracketingNthOrderBrentSolver.java:149)
            org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver.solve(BaseAbstractUnivariateRealSolver.java:190)
            org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver.solve(BaseAbstractUnivariateRealSolver.java:195)
            org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver.solve(BracketingNthOrderBrentSolver.java:386) */
        bracketingNthOrderBrentSolver.solve(-255, ((UnivariateFunction) acos), java.lang.Double.NaN, java.lang.Double.NaN, ((AllowedSolution) null));
    }
    
    /**
    @utbot.classUnderTest {@link BracketingNthOrderBrentSolver}
 * @utbot.methodUnderTest {@link org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver#solve(int,org.apache.commons.math.analysis.UnivariateFunction,double,double,org.apache.commons.math.analysis.solvers.AllowedSolution)}
 * @utbot.throwsException {@link java.lang.NegativeArraySizeException} in: return super.solve(maxEval, f, min, max);
 *  */
    @Test
    public void testSolve_ThrowNegativeArraySizeException() throws Exception  {
        BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver = ((BracketingNthOrderBrentSolver) createInstance("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver"));
        setField(bracketingNthOrderBrentSolver, "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "maximalOrder", -3);
        Incrementor evaluations = ((Incrementor) createInstance("org.apache.commons.math.util.Incrementor"));
        setField(bracketingNthOrderBrentSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "evaluations", evaluations);
        setField(bracketingNthOrderBrentSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "searchMin", 0.0);
        setField(bracketingNthOrderBrentSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "searchMax", 0.0);
        setField(bracketingNthOrderBrentSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "searchStart", 0.0);
        Acosh acosh = new Acosh();
        
        /* This test fails because method [org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver.solve] produces [java.lang.NegativeArraySizeException: -2]
            org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver.doSolve(BracketingNthOrderBrentSolver.java:146)
            org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver.solve(BaseAbstractUnivariateRealSolver.java:190)
            org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver.solve(BaseAbstractUnivariateRealSolver.java:195)
            org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver.solve(BracketingNthOrderBrentSolver.java:386) */
        bracketingNthOrderBrentSolver.solve(-255, ((UnivariateFunction) acosh), java.lang.Double.NaN, java.lang.Double.NaN, ((AllowedSolution) null));
    }
    
    /**
    @utbot.classUnderTest {@link BracketingNthOrderBrentSolver}
 * @utbot.methodUnderTest {@link org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver#solve(int,org.apache.commons.math.analysis.UnivariateFunction,double,double,org.apache.commons.math.analysis.solvers.AllowedSolution)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return super.solve(maxEval, f, min, max);
 *  */
    @Test
    public void testSolve_ThrowArrayIndexOutOfBoundsException_2() throws Exception  {
        BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver = ((BracketingNthOrderBrentSolver) createInstance("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver"));
        setField(bracketingNthOrderBrentSolver, "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "maximalOrder", 1);
        Incrementor evaluations = ((Incrementor) createInstance("org.apache.commons.math.util.Incrementor"));
        setField(bracketingNthOrderBrentSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "evaluations", evaluations);
        setField(bracketingNthOrderBrentSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "searchMin", 0.0);
        setField(bracketingNthOrderBrentSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "searchMax", 0.0);
        setField(bracketingNthOrderBrentSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "searchStart", 0.0);
        Acos acos = new Acos();
        
        /* This test fails because method [org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver.solve] produces [java.lang.ArrayIndexOutOfBoundsException: Index 2 out of bounds for length 2]
            org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver.doSolve(BracketingNthOrderBrentSolver.java:150)
            org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver.solve(BaseAbstractUnivariateRealSolver.java:190)
            org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver.solve(BaseAbstractUnivariateRealSolver.java:195)
            org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver.solve(BracketingNthOrderBrentSolver.java:386) */
        bracketingNthOrderBrentSolver.solve(-255, ((UnivariateFunction) acos), java.lang.Double.NaN, java.lang.Double.NaN, ((AllowedSolution) null));
    }
    ///endregion
    
    ///region FUZZER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method solve(int, org.apache.commons.math.analysis.UnivariateFunction, double, double, org.apache.commons.math.analysis.solvers.AllowedSolution)
    
    @Test(expected = NoBracketingException.class)
    public void testSolveByFuzzer() {
        BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver = new BracketingNthOrderBrentSolver();
        Minus minus = new Minus();
        AllowedSolution allowedSolution = AllowedSolution.ABOVE_SIDE;
        
        bracketingNthOrderBrentSolver.solve(2147483519, ((UnivariateFunction) minus), java.lang.Double.POSITIVE_INFINITY, java.lang.Double.POSITIVE_INFINITY, allowedSolution);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver.solve
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method solve(int, org.apache.commons.math.analysis.UnivariateFunction, double, double, double, org.apache.commons.math.analysis.solvers.AllowedSolution)
    
    /**
    @utbot.classUnderTest {@link BracketingNthOrderBrentSolver}
 * @utbot.methodUnderTest {@link org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver#solve(int,org.apache.commons.math.analysis.UnivariateFunction,double,double,double,org.apache.commons.math.analysis.solvers.AllowedSolution)}
 * @utbot.throwsException {@link org.apache.commons.math.exception.NullArgumentException} in: return super.solve(maxEval, f, min, max, startValue);
 *  */
    @Test(expected = NullArgumentException.class)
    public void testSolve_ThrowNullArgumentException1() throws Exception  {
        BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver = ((BracketingNthOrderBrentSolver) createInstance("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver"));
        
        bracketingNthOrderBrentSolver.solve(-255, null, java.lang.Double.NaN, java.lang.Double.NaN, java.lang.Double.NaN, null);
    }
    
    /**
    @utbot.classUnderTest {@link BracketingNthOrderBrentSolver}
 * @utbot.methodUnderTest {@link org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver#solve(int,org.apache.commons.math.analysis.UnivariateFunction,double,double,double,org.apache.commons.math.analysis.solvers.AllowedSolution)}
 * @utbot.throwsException {@link org.apache.commons.math.exception.NumberIsTooLargeException} in: return super.solve(maxEval, f, min, max, startValue);
 *  */
    @Test(expected = NumberIsTooLargeException.class)
    public void testSolve_ThrowNumberIsTooLargeException() throws Exception  {
        BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver = ((BracketingNthOrderBrentSolver) createInstance("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver"));
        setField(bracketingNthOrderBrentSolver, "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "maximalOrder", 2);
        Incrementor evaluations = ((Incrementor) createInstance("org.apache.commons.math.util.Incrementor"));
        setField(bracketingNthOrderBrentSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "evaluations", evaluations);
        setField(bracketingNthOrderBrentSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "searchMin", 0.0);
        setField(bracketingNthOrderBrentSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "searchMax", 0.0);
        setField(bracketingNthOrderBrentSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "searchStart", 0.0);
        Acosh acosh = new Acosh();
        
        bracketingNthOrderBrentSolver.solve(-255, acosh, 0.0, java.lang.Double.NaN, -0.0, null);
    }
    
    /**
    @utbot.classUnderTest {@link BracketingNthOrderBrentSolver}
 * @utbot.methodUnderTest {@link org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver#solve(int,org.apache.commons.math.analysis.UnivariateFunction,double,double,double,org.apache.commons.math.analysis.solvers.AllowedSolution)}
 * @utbot.throwsException {@link org.apache.commons.math.exception.NumberIsTooLargeException} in: return super.solve(maxEval, f, min, max, startValue);
 *  */
    @Test(expected = NumberIsTooLargeException.class)
    public void testSolve_ThrowNumberIsTooLargeException_1() throws Exception  {
        BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver = ((BracketingNthOrderBrentSolver) createInstance("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver"));
        setField(bracketingNthOrderBrentSolver, "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "maximalOrder", 2);
        Incrementor evaluations = ((Incrementor) createInstance("org.apache.commons.math.util.Incrementor"));
        setField(bracketingNthOrderBrentSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "evaluations", evaluations);
        setField(bracketingNthOrderBrentSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "searchMin", 0.0);
        setField(bracketingNthOrderBrentSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "searchMax", 0.0);
        setField(bracketingNthOrderBrentSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "searchStart", 0.0);
        Acos acos = new Acos();
        
        bracketingNthOrderBrentSolver.solve(-255, acos, -2.225073858507202E-308, -0.0, 0.0, null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method solve(int, org.apache.commons.math.analysis.UnivariateFunction, double, double, double, org.apache.commons.math.analysis.solvers.AllowedSolution)
    
    /**
    @utbot.classUnderTest {@link BracketingNthOrderBrentSolver}
 * @utbot.methodUnderTest {@link org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver#solve(int,org.apache.commons.math.analysis.UnivariateFunction,double,double,double,org.apache.commons.math.analysis.solvers.AllowedSolution)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return super.solve(maxEval, f, min, max, startValue);
 *  */
    @Test
    public void testSolve_ThrowArrayIndexOutOfBoundsException1() throws Exception  {
        BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver = ((BracketingNthOrderBrentSolver) createInstance("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver"));
        Incrementor evaluations = ((Incrementor) createInstance("org.apache.commons.math.util.Incrementor"));
        setField(bracketingNthOrderBrentSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "evaluations", evaluations);
        setField(bracketingNthOrderBrentSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "searchMin", 0.0);
        setField(bracketingNthOrderBrentSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "searchMax", 0.0);
        setField(bracketingNthOrderBrentSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "searchStart", 0.0);
        Acos acos = new Acos();
        
        /* This test fails because method [org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver.solve] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver.doSolve(BracketingNthOrderBrentSolver.java:149)
            org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver.solve(BaseAbstractUnivariateRealSolver.java:190)
            org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver.solve(BracketingNthOrderBrentSolver.java:394) */
        bracketingNthOrderBrentSolver.solve(-255, acos, java.lang.Double.NaN, java.lang.Double.NaN, java.lang.Double.NaN, null);
    }
    
    /**
    @utbot.classUnderTest {@link BracketingNthOrderBrentSolver}
 * @utbot.methodUnderTest {@link org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver#solve(int,org.apache.commons.math.analysis.UnivariateFunction,double,double,double,org.apache.commons.math.analysis.solvers.AllowedSolution)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return super.solve(maxEval, f, min, max, startValue);
 *  */
    @Test
    public void testSolve_ThrowArrayIndexOutOfBoundsException_11() throws Exception  {
        BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver = ((BracketingNthOrderBrentSolver) createInstance("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver"));
        setField(bracketingNthOrderBrentSolver, "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "maximalOrder", -1);
        Incrementor evaluations = ((Incrementor) createInstance("org.apache.commons.math.util.Incrementor"));
        setField(bracketingNthOrderBrentSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "evaluations", evaluations);
        setField(bracketingNthOrderBrentSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "searchMin", 0.0);
        setField(bracketingNthOrderBrentSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "searchMax", 0.0);
        setField(bracketingNthOrderBrentSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "searchStart", 0.0);
        Acos acos = new Acos();
        
        /* This test fails because method [org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver.solve] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver.doSolve(BracketingNthOrderBrentSolver.java:148)
            org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver.solve(BaseAbstractUnivariateRealSolver.java:190)
            org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver.solve(BracketingNthOrderBrentSolver.java:394) */
        bracketingNthOrderBrentSolver.solve(-255, acos, java.lang.Double.NaN, java.lang.Double.NaN, java.lang.Double.NaN, null);
    }
    
    /**
    @utbot.classUnderTest {@link BracketingNthOrderBrentSolver}
 * @utbot.methodUnderTest {@link org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver#solve(int,org.apache.commons.math.analysis.UnivariateFunction,double,double,double,org.apache.commons.math.analysis.solvers.AllowedSolution)}
 * @utbot.throwsException {@link java.lang.NegativeArraySizeException} in: return super.solve(maxEval, f, min, max, startValue);
 *  */
    @Test
    public void testSolve_ThrowNegativeArraySizeException1() throws Exception  {
        BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver = ((BracketingNthOrderBrentSolver) createInstance("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver"));
        setField(bracketingNthOrderBrentSolver, "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "maximalOrder", -3);
        Incrementor evaluations = ((Incrementor) createInstance("org.apache.commons.math.util.Incrementor"));
        setField(bracketingNthOrderBrentSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "evaluations", evaluations);
        setField(bracketingNthOrderBrentSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "searchMin", 0.0);
        setField(bracketingNthOrderBrentSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "searchMax", 0.0);
        setField(bracketingNthOrderBrentSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "searchStart", 0.0);
        Acos acos = new Acos();
        
        /* This test fails because method [org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver.solve] produces [java.lang.NegativeArraySizeException: -2]
            org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver.doSolve(BracketingNthOrderBrentSolver.java:146)
            org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver.solve(BaseAbstractUnivariateRealSolver.java:190)
            org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver.solve(BracketingNthOrderBrentSolver.java:394) */
        bracketingNthOrderBrentSolver.solve(-255, acos, java.lang.Double.NaN, java.lang.Double.NaN, java.lang.Double.NaN, null);
    }
    
    /**
    @utbot.classUnderTest {@link BracketingNthOrderBrentSolver}
 * @utbot.methodUnderTest {@link org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver#solve(int,org.apache.commons.math.analysis.UnivariateFunction,double,double,double,org.apache.commons.math.analysis.solvers.AllowedSolution)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return super.solve(maxEval, f, min, max, startValue);
 *  */
    @Test
    public void testSolve_ThrowArrayIndexOutOfBoundsException_21() throws Exception  {
        BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver = ((BracketingNthOrderBrentSolver) createInstance("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver"));
        setField(bracketingNthOrderBrentSolver, "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "maximalOrder", 1);
        Incrementor evaluations = ((Incrementor) createInstance("org.apache.commons.math.util.Incrementor"));
        setField(bracketingNthOrderBrentSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "evaluations", evaluations);
        setField(bracketingNthOrderBrentSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "searchMin", 0.0);
        setField(bracketingNthOrderBrentSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "searchMax", 0.0);
        setField(bracketingNthOrderBrentSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "searchStart", 0.0);
        Acos acos = new Acos();
        
        /* This test fails because method [org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver.solve] produces [java.lang.ArrayIndexOutOfBoundsException: Index 2 out of bounds for length 2]
            org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver.doSolve(BracketingNthOrderBrentSolver.java:150)
            org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver.solve(BaseAbstractUnivariateRealSolver.java:190)
            org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver.solve(BracketingNthOrderBrentSolver.java:394) */
        bracketingNthOrderBrentSolver.solve(-255, acos, java.lang.Double.NaN, java.lang.Double.NaN, java.lang.Double.NaN, null);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method solve(int, org.apache.commons.math.analysis.UnivariateFunction, double, double, double, org.apache.commons.math.analysis.solvers.AllowedSolution)
    
    @Test
    public void testSolve1() throws Exception  {
        BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver = ((BracketingNthOrderBrentSolver) createInstance("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver"));
        setField(bracketingNthOrderBrentSolver, "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "maximalOrder", 10);
        AllowedSolution allowed = AllowedSolution.ABOVE_SIDE;
        setField(bracketingNthOrderBrentSolver, "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "allowed", allowed);
        Incrementor evaluations = ((Incrementor) createInstance("org.apache.commons.math.util.Incrementor"));
        setField(bracketingNthOrderBrentSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "evaluations", evaluations);
        setField(bracketingNthOrderBrentSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "searchMin", 0.0);
        setField(bracketingNthOrderBrentSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "searchMax", 0.0);
        setField(bracketingNthOrderBrentSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "searchStart", 0.0);
        Acos acos = new Acos();
        AllowedSolution allowedSolution = AllowedSolution.LEFT_SIDE;
        
        AllowedSolution initialBracketingNthOrderBrentSolverAllowed = ((AllowedSolution) getFieldValue(bracketingNthOrderBrentSolver, "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "allowed"));
        UnivariateFunction initialBracketingNthOrderBrentSolverFunction = ((UnivariateFunction) getFieldValue(bracketingNthOrderBrentSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "function"));
        
        double actual = bracketingNthOrderBrentSolver.solve(1073741824, acos, java.lang.Double.NaN, java.lang.Double.NaN, 1.0, allowedSolution);
        
        assertEquals(1.0, actual, 1.0E-6);
        
        AllowedSolution finalBracketingNthOrderBrentSolverAllowed = ((AllowedSolution) getFieldValue(bracketingNthOrderBrentSolver, "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "allowed"));
        Incrementor bracketingNthOrderBrentSolverEvaluations = ((Incrementor) getFieldValue(bracketingNthOrderBrentSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "evaluations"));
        int finalBracketingNthOrderBrentSolverEvaluationsMaximalCount = ((Integer) getFieldValue(bracketingNthOrderBrentSolverEvaluations, "org.apache.commons.math.util.Incrementor", "maximalCount"));
        Incrementor bracketingNthOrderBrentSolverEvaluations1 = ((Incrementor) getFieldValue(bracketingNthOrderBrentSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "evaluations"));
        int finalBracketingNthOrderBrentSolverEvaluationsCount = ((Integer) getFieldValue(bracketingNthOrderBrentSolverEvaluations1, "org.apache.commons.math.util.Incrementor", "count"));
        double finalBracketingNthOrderBrentSolverSearchMin = ((Double) getFieldValue(bracketingNthOrderBrentSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "searchMin"));
        double finalBracketingNthOrderBrentSolverSearchMax = ((Double) getFieldValue(bracketingNthOrderBrentSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "searchMax"));
        double finalBracketingNthOrderBrentSolverSearchStart = ((Double) getFieldValue(bracketingNthOrderBrentSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "searchStart"));
        UnivariateFunction finalBracketingNthOrderBrentSolverFunction = ((UnivariateFunction) getFieldValue(bracketingNthOrderBrentSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "function"));
        
        assertFalse(initialBracketingNthOrderBrentSolverAllowed == finalBracketingNthOrderBrentSolverAllowed);
        
        assertFalse(initialBracketingNthOrderBrentSolverFunction == finalBracketingNthOrderBrentSolverFunction);
        
        org.junit.Assert.assertEquals(1073741824, finalBracketingNthOrderBrentSolverEvaluationsMaximalCount);
        
        org.junit.Assert.assertEquals(1, finalBracketingNthOrderBrentSolverEvaluationsCount);
        
        assertEquals(java.lang.Double.NaN, finalBracketingNthOrderBrentSolverSearchMin, 1.0E-6);
        
        assertEquals(java.lang.Double.NaN, finalBracketingNthOrderBrentSolverSearchMax, 1.0E-6);
        
        assertEquals(1.0, finalBracketingNthOrderBrentSolverSearchStart, 1.0E-6);
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method solve(int, org.apache.commons.math.analysis.UnivariateFunction, double, double, double, org.apache.commons.math.analysis.solvers.AllowedSolution)
    
    @Test(expected = NoBracketingException.class)
    public void testSolve2() throws Exception  {
        BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver = ((BracketingNthOrderBrentSolver) createInstance("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver"));
        setField(bracketingNthOrderBrentSolver, "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "maximalOrder", 10);
        AllowedSolution allowed = AllowedSolution.ABOVE_SIDE;
        setField(bracketingNthOrderBrentSolver, "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "allowed", allowed);
        Incrementor evaluations = ((Incrementor) createInstance("org.apache.commons.math.util.Incrementor"));
        setField(bracketingNthOrderBrentSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "evaluations", evaluations);
        setField(bracketingNthOrderBrentSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "searchMin", 0.0);
        setField(bracketingNthOrderBrentSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "searchMax", 0.0);
        setField(bracketingNthOrderBrentSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "searchStart", 0.0);
        Acos acos = new Acos();
        AllowedSolution allowedSolution = AllowedSolution.LEFT_SIDE;
        
        bracketingNthOrderBrentSolver.solve(1073741824, acos, java.lang.Double.NaN, java.lang.Double.NaN, -0.0, allowedSolution);
    }
    
    @Test(expected = NoBracketingException.class)
    public void testSolve3() throws Exception  {
        BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver = ((BracketingNthOrderBrentSolver) createInstance("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver"));
        setField(bracketingNthOrderBrentSolver, "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "maximalOrder", 10);
        AllowedSolution allowed = AllowedSolution.ABOVE_SIDE;
        setField(bracketingNthOrderBrentSolver, "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "allowed", allowed);
        Incrementor evaluations = ((Incrementor) createInstance("org.apache.commons.math.util.Incrementor"));
        setField(bracketingNthOrderBrentSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "evaluations", evaluations);
        setField(bracketingNthOrderBrentSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "searchMin", 0.0);
        setField(bracketingNthOrderBrentSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "searchMax", 0.0);
        setField(bracketingNthOrderBrentSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "searchStart", 0.0);
        Acosh acosh = new Acosh();
        AllowedSolution allowedSolution = AllowedSolution.LEFT_SIDE;
        
        bracketingNthOrderBrentSolver.solve(1073741824, acosh, java.lang.Double.NaN, java.lang.Double.NaN, 3.126974105834965, allowedSolution);
    }
    
    @Test(expected = NoBracketingException.class)
    public void testSolve4() throws Exception  {
        BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver = ((BracketingNthOrderBrentSolver) createInstance("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver"));
        setField(bracketingNthOrderBrentSolver, "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "maximalOrder", 10);
        AllowedSolution allowed = AllowedSolution.ABOVE_SIDE;
        setField(bracketingNthOrderBrentSolver, "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "allowed", allowed);
        Incrementor evaluations = ((Incrementor) createInstance("org.apache.commons.math.util.Incrementor"));
        setField(bracketingNthOrderBrentSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "evaluations", evaluations);
        setField(bracketingNthOrderBrentSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "searchMin", 0.0);
        setField(bracketingNthOrderBrentSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "searchMax", 0.0);
        setField(bracketingNthOrderBrentSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "searchStart", 0.0);
        Acosh acosh = new Acosh();
        AllowedSolution allowedSolution = AllowedSolution.LEFT_SIDE;
        
        bracketingNthOrderBrentSolver.solve(1073741824, acosh, java.lang.Double.NaN, java.lang.Double.NaN, -3.437499925494195, allowedSolution);
    }
    
    @Test(expected = NoBracketingException.class)
    public void testSolve5() throws Exception  {
        BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver = ((BracketingNthOrderBrentSolver) createInstance("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver"));
        setField(bracketingNthOrderBrentSolver, "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "maximalOrder", 10);
        AllowedSolution allowed = AllowedSolution.ABOVE_SIDE;
        setField(bracketingNthOrderBrentSolver, "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "allowed", allowed);
        Incrementor evaluations = ((Incrementor) createInstance("org.apache.commons.math.util.Incrementor"));
        setField(bracketingNthOrderBrentSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "evaluations", evaluations);
        setField(bracketingNthOrderBrentSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "searchMin", 0.0);
        setField(bracketingNthOrderBrentSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "searchMax", 0.0);
        setField(bracketingNthOrderBrentSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "searchStart", 0.0);
        Acosh acosh = new Acosh();
        AllowedSolution allowedSolution = AllowedSolution.LEFT_SIDE;
        
        bracketingNthOrderBrentSolver.solve(1073741824, acosh, java.lang.Double.NaN, java.lang.Double.NaN, -1.3408242677138984E154, allowedSolution);
    }
    
    @Test(expected = NoBracketingException.class)
    public void testSolve6() throws Exception  {
        BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver = ((BracketingNthOrderBrentSolver) createInstance("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver"));
        setField(bracketingNthOrderBrentSolver, "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "maximalOrder", 10);
        Incrementor evaluations = ((Incrementor) createInstance("org.apache.commons.math.util.Incrementor"));
        setField(bracketingNthOrderBrentSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "evaluations", evaluations);
        setField(bracketingNthOrderBrentSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "searchMin", 0.0);
        setField(bracketingNthOrderBrentSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "searchMax", 0.0);
        setField(bracketingNthOrderBrentSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "searchStart", 0.0);
        Acos acos = new Acos();
        AllowedSolution allowedSolution = AllowedSolution.LEFT_SIDE;
        
        bracketingNthOrderBrentSolver.solve(1073741824, acos, -8.988465674311582E307, 0.5000000000000001, -1.0, allowedSolution);
    }
    
    @Test(expected = TooManyEvaluationsException.class)
    public void testSolve7() throws Exception  {
        BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver = ((BracketingNthOrderBrentSolver) createInstance("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver"));
        setField(bracketingNthOrderBrentSolver, "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "maximalOrder", 10);
        Incrementor evaluations = ((Incrementor) createInstance("org.apache.commons.math.util.Incrementor"));
        Incrementor.MaxCountExceededCallback maxCountCallback = ((Incrementor.MaxCountExceededCallback) createInstance("org.apache.commons.math.util.Incrementor$1"));
        setField(evaluations, "org.apache.commons.math.util.Incrementor", "maxCountCallback", maxCountCallback);
        setField(bracketingNthOrderBrentSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "evaluations", evaluations);
        setField(bracketingNthOrderBrentSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "searchMin", 0.0);
        setField(bracketingNthOrderBrentSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "searchMax", 0.0);
        setField(bracketingNthOrderBrentSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "searchStart", 0.0);
        Acos acos = new Acos();
        AllowedSolution allowedSolution = AllowedSolution.ANY_SIDE;
        
        bracketingNthOrderBrentSolver.solve(1, acos, java.lang.Double.NaN, java.lang.Double.NaN, 2.247116418577895E307, allowedSolution);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method solve(int, org.apache.commons.math.analysis.UnivariateFunction, double, double, double, org.apache.commons.math.analysis.solvers.AllowedSolution)
    
    @Test
    public void testSolve8() throws Exception  {
        BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver = ((BracketingNthOrderBrentSolver) createInstance("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver"));
        setField(bracketingNthOrderBrentSolver, "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "maximalOrder", 15);
        AllowedSolution allowed = AllowedSolution.LEFT_SIDE;
        setField(bracketingNthOrderBrentSolver, "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "allowed", allowed);
        Incrementor evaluations = ((Incrementor) createInstance("org.apache.commons.math.util.Incrementor"));
        setField(bracketingNthOrderBrentSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "evaluations", evaluations);
        setField(bracketingNthOrderBrentSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "searchMin", 0.0);
        setField(bracketingNthOrderBrentSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "searchMax", 0.0);
        setField(bracketingNthOrderBrentSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "searchStart", 0.0);
        Logit function = ((Logit) createInstance("org.apache.commons.math.analysis.function.Logit"));
        setField(bracketingNthOrderBrentSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "function", function);
        Acosh acosh = new Acosh();
        
        /* This test fails because method [org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver.solve] produces [java.lang.NullPointerException]
            org.apache.commons.math.util.Incrementor.incrementCount(Incrementor.java:151)
            org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver.incrementEvaluationCount(BaseAbstractUnivariateRealSolver.java:294)
            org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver.computeObjectiveValue(BaseAbstractUnivariateRealSolver.java:153)
            org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver.doSolve(BracketingNthOrderBrentSolver.java:161)
            org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver.solve(BaseAbstractUnivariateRealSolver.java:190)
            org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver.solve(BracketingNthOrderBrentSolver.java:394) */
        bracketingNthOrderBrentSolver.solve(1, acosh, java.lang.Double.NaN, java.lang.Double.NaN, 1.0029013061523437, null);
    }
    
    @Test
    public void testSolve9() throws Exception  {
        BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver = ((BracketingNthOrderBrentSolver) createInstance("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver"));
        setField(bracketingNthOrderBrentSolver, "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "maximalOrder", 2);
        AllowedSolution allowed = AllowedSolution.LEFT_SIDE;
        setField(bracketingNthOrderBrentSolver, "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "allowed", allowed);
        Incrementor evaluations = ((Incrementor) createInstance("org.apache.commons.math.util.Incrementor"));
        setField(bracketingNthOrderBrentSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "evaluations", evaluations);
        setField(bracketingNthOrderBrentSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "searchMin", 0.0);
        setField(bracketingNthOrderBrentSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "searchMax", 0.0);
        setField(bracketingNthOrderBrentSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "searchStart", 0.0);
        Atan atan = new Atan();
        
        /* This test fails because method [org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver.solve] produces [java.lang.NullPointerException]
            org.apache.commons.math.util.Incrementor.incrementCount(Incrementor.java:151)
            org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver.incrementEvaluationCount(BaseAbstractUnivariateRealSolver.java:294)
            org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver.computeObjectiveValue(BaseAbstractUnivariateRealSolver.java:153)
            org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver.doSolve(BracketingNthOrderBrentSolver.java:161)
            org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver.solve(BaseAbstractUnivariateRealSolver.java:190)
            org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver.solve(BracketingNthOrderBrentSolver.java:394) */
        bracketingNthOrderBrentSolver.solve(1, atan, -3.0377580431085834E270, 1.1335096997022762E156, -4.795143468093142E193, null);
    }
    
    @Test
    public void testSolve10() throws Exception  {
        BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver = ((BracketingNthOrderBrentSolver) createInstance("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver"));
        setField(bracketingNthOrderBrentSolver, "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "maximalOrder", 2);
        AllowedSolution allowed = AllowedSolution.LEFT_SIDE;
        setField(bracketingNthOrderBrentSolver, "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "allowed", allowed);
        Incrementor evaluations = ((Incrementor) createInstance("org.apache.commons.math.util.Incrementor"));
        setField(bracketingNthOrderBrentSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "evaluations", evaluations);
        setField(bracketingNthOrderBrentSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "searchMin", 0.0);
        setField(bracketingNthOrderBrentSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "searchMax", 0.0);
        setField(bracketingNthOrderBrentSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "searchStart", 0.0);
        Asinh asinh = new Asinh();
        
        /* This test fails because method [org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver.solve] produces [java.lang.NullPointerException]
            org.apache.commons.math.util.Incrementor.incrementCount(Incrementor.java:151)
            org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver.incrementEvaluationCount(BaseAbstractUnivariateRealSolver.java:294)
            org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver.computeObjectiveValue(BaseAbstractUnivariateRealSolver.java:153)
            org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver.doSolve(BracketingNthOrderBrentSolver.java:161)
            org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver.solve(BaseAbstractUnivariateRealSolver.java:190)
            org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver.solve(BracketingNthOrderBrentSolver.java:394) */
        bracketingNthOrderBrentSolver.solve(1, asinh, -3.0377580431085834E270, 1.1335096997022762E156, -4.795143468093142E193, null);
    }
    
    @Test
    public void testSolve11() throws Exception  {
        BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver = ((BracketingNthOrderBrentSolver) createInstance("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver"));
        setField(bracketingNthOrderBrentSolver, "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "maximalOrder", 2);
        AllowedSolution allowed = AllowedSolution.LEFT_SIDE;
        setField(bracketingNthOrderBrentSolver, "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "allowed", allowed);
        Incrementor evaluations = ((Incrementor) createInstance("org.apache.commons.math.util.Incrementor"));
        setField(bracketingNthOrderBrentSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "evaluations", evaluations);
        setField(bracketingNthOrderBrentSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "searchMin", 0.0);
        setField(bracketingNthOrderBrentSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "searchMax", 0.0);
        setField(bracketingNthOrderBrentSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "searchStart", 0.0);
        Asin asin = new Asin();
        
        /* This test fails because method [org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver.solve] produces [java.lang.NullPointerException]
            org.apache.commons.math.util.Incrementor.incrementCount(Incrementor.java:151)
            org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver.incrementEvaluationCount(BaseAbstractUnivariateRealSolver.java:294)
            org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver.computeObjectiveValue(BaseAbstractUnivariateRealSolver.java:153)
            org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver.doSolve(BracketingNthOrderBrentSolver.java:161)
            org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver.solve(BaseAbstractUnivariateRealSolver.java:190)
            org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver.solve(BracketingNthOrderBrentSolver.java:394) */
        bracketingNthOrderBrentSolver.solve(1, asin, -3.0377580431085834E270, 1.1335096997022762E156, -4.795143468093142E193, null);
    }
    
    @Test
    public void testSolve12() throws Exception  {
        BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver = ((BracketingNthOrderBrentSolver) createInstance("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver"));
        setField(bracketingNthOrderBrentSolver, "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "maximalOrder", 2);
        AllowedSolution allowed = AllowedSolution.ABOVE_SIDE;
        setField(bracketingNthOrderBrentSolver, "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "allowed", allowed);
        Incrementor evaluations = ((Incrementor) createInstance("org.apache.commons.math.util.Incrementor"));
        setField(bracketingNthOrderBrentSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "evaluations", evaluations);
        setField(bracketingNthOrderBrentSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "searchMin", 0.0);
        setField(bracketingNthOrderBrentSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "searchMax", 0.0);
        setField(bracketingNthOrderBrentSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "searchStart", 0.0);
        Acos acos = new Acos();
        
        /* This test fails because method [org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver.solve] produces [java.lang.NullPointerException]
            org.apache.commons.math.util.Incrementor.incrementCount(Incrementor.java:151)
            org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver.incrementEvaluationCount(BaseAbstractUnivariateRealSolver.java:294)
            org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver.computeObjectiveValue(BaseAbstractUnivariateRealSolver.java:153)
            org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver.doSolve(BracketingNthOrderBrentSolver.java:161)
            org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver.solve(BaseAbstractUnivariateRealSolver.java:190)
            org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver.solve(BracketingNthOrderBrentSolver.java:394) */
        bracketingNthOrderBrentSolver.solve(1, acos, -8.988465674311582E307, 0.5000000000000001, -1.0, null);
    }
    
    @Test
    public void testSolve13() throws Exception  {
        BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver = ((BracketingNthOrderBrentSolver) createInstance("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver"));
        setField(bracketingNthOrderBrentSolver, "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "maximalOrder", 10);
        AllowedSolution allowed = AllowedSolution.ABOVE_SIDE;
        setField(bracketingNthOrderBrentSolver, "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "allowed", allowed);
        Incrementor evaluations = ((Incrementor) createInstance("org.apache.commons.math.util.Incrementor"));
        setField(bracketingNthOrderBrentSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "evaluations", evaluations);
        setField(bracketingNthOrderBrentSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "searchMin", 0.0);
        setField(bracketingNthOrderBrentSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "searchMax", 0.0);
        setField(bracketingNthOrderBrentSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "searchStart", 0.0);
        Acosh acosh = new Acosh();
        
        /* This test fails because method [org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver.solve] produces [java.lang.NullPointerException]
            org.apache.commons.math.util.Incrementor.incrementCount(Incrementor.java:151)
            org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver.incrementEvaluationCount(BaseAbstractUnivariateRealSolver.java:294)
            org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver.computeObjectiveValue(BaseAbstractUnivariateRealSolver.java:153)
            org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver.doSolve(BracketingNthOrderBrentSolver.java:161)
            org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver.solve(BaseAbstractUnivariateRealSolver.java:190)
            org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver.solve(BracketingNthOrderBrentSolver.java:394) */
        bracketingNthOrderBrentSolver.solve(1, acosh, java.lang.Double.NaN, java.lang.Double.NaN, -9.556619454003155E-299, null);
    }
    
    @Test
    public void testSolve14() throws Exception  {
        BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver = ((BracketingNthOrderBrentSolver) createInstance("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver"));
        setField(bracketingNthOrderBrentSolver, "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "maximalOrder", 10);
        AllowedSolution allowed = AllowedSolution.ABOVE_SIDE;
        setField(bracketingNthOrderBrentSolver, "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "allowed", allowed);
        Incrementor evaluations = ((Incrementor) createInstance("org.apache.commons.math.util.Incrementor"));
        setField(bracketingNthOrderBrentSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "evaluations", evaluations);
        setField(bracketingNthOrderBrentSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "searchMin", 0.0);
        setField(bracketingNthOrderBrentSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "searchMax", 0.0);
        setField(bracketingNthOrderBrentSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "searchStart", 0.0);
        Acosh acosh = new Acosh();
        
        /* This test fails because method [org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver.solve] produces [java.lang.NullPointerException]
            org.apache.commons.math.util.Incrementor.incrementCount(Incrementor.java:151)
            org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver.incrementEvaluationCount(BaseAbstractUnivariateRealSolver.java:294)
            org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver.computeObjectiveValue(BaseAbstractUnivariateRealSolver.java:153)
            org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver.doSolve(BracketingNthOrderBrentSolver.java:161)
            org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver.solve(BaseAbstractUnivariateRealSolver.java:190)
            org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver.solve(BracketingNthOrderBrentSolver.java:394) */
        bracketingNthOrderBrentSolver.solve(1, acosh, java.lang.Double.NaN, java.lang.Double.NaN, 6.216209545775669, null);
    }
    
    @Test
    public void testSolve15() throws Exception  {
        BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver = ((BracketingNthOrderBrentSolver) createInstance("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver"));
        setField(bracketingNthOrderBrentSolver, "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "maximalOrder", 2);
        Incrementor evaluations = ((Incrementor) createInstance("org.apache.commons.math.util.Incrementor"));
        setField(bracketingNthOrderBrentSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "evaluations", evaluations);
        setField(bracketingNthOrderBrentSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "searchMin", 0.0);
        setField(bracketingNthOrderBrentSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "searchMax", 0.0);
        setField(bracketingNthOrderBrentSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "searchStart", 0.0);
        Acos acos = new Acos();
        
        /* This test fails because method [org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver.solve] produces [java.lang.NullPointerException]
            org.apache.commons.math.util.Incrementor.incrementCount(Incrementor.java:151)
            org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver.incrementEvaluationCount(BaseAbstractUnivariateRealSolver.java:294)
            org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver.computeObjectiveValue(BaseAbstractUnivariateRealSolver.java:153)
            org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver.doSolve(BracketingNthOrderBrentSolver.java:161)
            org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver.solve(BaseAbstractUnivariateRealSolver.java:190)
            org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver.solve(BracketingNthOrderBrentSolver.java:394) */
        bracketingNthOrderBrentSolver.solve(1, acos, -2.225073858507202E-308, 4.9E-324, -0.0, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver.getMaximalOrder
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getMaximalOrder()
    
    /**
    @utbot.classUnderTest {@link BracketingNthOrderBrentSolver}
 * @utbot.methodUnderTest {@link org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver#getMaximalOrder()}
 * @utbot.returnsFrom {@code return maximalOrder;}
 *  */
    @Test
    public void testGetMaximalOrder_ReturnMaximalOrder() throws Exception  {
        BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver = ((BracketingNthOrderBrentSolver) createInstance("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver"));
        setField(bracketingNthOrderBrentSolver, "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "maximalOrder", -255);
        
        int actual = bracketingNthOrderBrentSolver.getMaximalOrder();
        
        org.junit.Assert.assertEquals(-255, actual);
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
        
                java.lang.reflect.Method methodForGetDeclaredFields727632336264800 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields727632336264800.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass727632336272200 = (java.lang.reflect.Field[]) methodForGetDeclaredFields727632336264800.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass727632336272200).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields727632336829000 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields727632336829000.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass727632336831600 = (java.lang.reflect.Field[]) methodForGetDeclaredFields727632336829000.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass727632336831600).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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

