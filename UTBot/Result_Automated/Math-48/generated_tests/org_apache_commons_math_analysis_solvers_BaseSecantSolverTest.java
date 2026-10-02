package org.apache.commons.math.analysis.solvers;

import org.junit.Test;
import org.apache.commons.math.util.Incrementor;
import org.apache.commons.math.exception.TooManyEvaluationsException;
import org.apache.commons.math.analysis.function.Logit;
import org.apache.commons.math.exception.OutOfRangeException;
import org.apache.commons.math.analysis.function.Sigmoid;
import org.apache.commons.math.exception.NumberIsTooLargeException;
import org.apache.commons.math.exception.NullArgumentException;
import org.apache.commons.math.analysis.function.HarmonicOscillator;
import org.apache.commons.math.analysis.UnivariateRealFunction;
import org.apache.commons.math.exception.NoBracketingException;
import org.apache.commons.math.analysis.function.Gaussian;
import org.apache.commons.math.analysis.function.Exp;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public final class org_apache_commons_math_analysis_solvers_BaseSecantSolverTest {
    ///region Test suites for executable org.apache.commons.math.analysis.solvers.BaseSecantSolver.doSolve
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method doSolve()
    
    /**
    @utbot.classUnderTest {@link BaseSecantSolver}
 * @utbot.methodUnderTest {@link org.apache.commons.math.analysis.solvers.BaseSecantSolver#doSolve()}
 * @utbot.throwsException {@link org.apache.commons.math.exception.TooManyEvaluationsException} in: double f0 = computeObjectiveValue(x0);
 *  */
    @Test(expected = TooManyEvaluationsException.class)
    public void testDoSolve_ThrowTooManyEvaluationsException() throws Exception  {
        IllinoisSolver illinoisSolver = ((IllinoisSolver) createInstance("org.apache.commons.math.analysis.solvers.IllinoisSolver"));
        Incrementor evaluations = ((Incrementor) createInstance("org.apache.commons.math.util.Incrementor"));
        setField(illinoisSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "evaluations", evaluations);
        setField(illinoisSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "searchMin", 0.0);
        setField(illinoisSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "searchMax", 0.0);
        
        illinoisSolver.doSolve();
    }
    
    /**
    @utbot.classUnderTest {@link BaseSecantSolver}
 * @utbot.methodUnderTest {@link org.apache.commons.math.analysis.solvers.BaseSecantSolver#doSolve()}
 * @utbot.throwsException {@link org.apache.commons.math.exception.OutOfRangeException} in: double f0 = computeObjectiveValue(x0);
 *  */
    @Test(expected = OutOfRangeException.class)
    public void testDoSolve_ThrowOutOfRangeException() throws Exception  {
        PegasusSolver pegasusSolver = ((PegasusSolver) createInstance("org.apache.commons.math.analysis.solvers.PegasusSolver"));
        Incrementor evaluations = ((Incrementor) createInstance("org.apache.commons.math.util.Incrementor"));
        evaluations.setMaximalCount(Integer.MIN_VALUE);
        setField(evaluations, "org.apache.commons.math.util.Incrementor", "count", Integer.MAX_VALUE);
        setField(pegasusSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "evaluations", evaluations);
        setField(pegasusSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "searchMin", 2.4390258807688956);
        setField(pegasusSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "searchMax", 0.0);
        Logit function = ((Logit) createInstance("org.apache.commons.math.analysis.function.Logit"));
        setField(function, "org.apache.commons.math.analysis.function.Logit", "lo", 2.4390258807688956);
        setField(function, "org.apache.commons.math.analysis.function.Logit", "hi", 2.225073860579464E-308);
        setField(pegasusSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "function", function);
        
        pegasusSolver.doSolve();
    }
    
    /**
    @utbot.classUnderTest {@link BaseSecantSolver}
 * @utbot.methodUnderTest {@link org.apache.commons.math.analysis.solvers.BaseSecantSolver#doSolve()}
 * @utbot.throwsException {@link org.apache.commons.math.exception.OutOfRangeException} in: double f0 = computeObjectiveValue(x0);
 *  */
    @Test(expected = OutOfRangeException.class)
    public void testDoSolve_ThrowOutOfRangeException_1() throws Exception  {
        PegasusSolver pegasusSolver = ((PegasusSolver) createInstance("org.apache.commons.math.analysis.solvers.PegasusSolver"));
        Incrementor evaluations = ((Incrementor) createInstance("org.apache.commons.math.util.Incrementor"));
        evaluations.setMaximalCount(Integer.MIN_VALUE);
        setField(evaluations, "org.apache.commons.math.util.Incrementor", "count", Integer.MAX_VALUE);
        setField(pegasusSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "evaluations", evaluations);
        setField(pegasusSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "searchMin", -3.97907155850135E87);
        setField(pegasusSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "searchMax", 0.0);
        Logit function = ((Logit) createInstance("org.apache.commons.math.analysis.function.Logit"));
        setField(function, "org.apache.commons.math.analysis.function.Logit", "lo", 1.7181966336000004E10);
        setField(function, "org.apache.commons.math.analysis.function.Logit", "hi", 0.0);
        setField(pegasusSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "function", function);
        
        pegasusSolver.doSolve();
    }
    
    /**
    @utbot.classUnderTest {@link BaseSecantSolver}
 * @utbot.methodUnderTest {@link org.apache.commons.math.analysis.solvers.BaseSecantSolver#doSolve()}
 * @utbot.throwsException {@link org.apache.commons.math.exception.TooManyEvaluationsException} in: double f1 = computeObjectiveValue(x1);
 *  */
    @Test(expected = TooManyEvaluationsException.class)
    public void testDoSolve_ThrowTooManyEvaluationsException_1() throws Exception  {
        IllinoisSolver illinoisSolver = ((IllinoisSolver) createInstance("org.apache.commons.math.analysis.solvers.IllinoisSolver"));
        Incrementor evaluations = ((Incrementor) createInstance("org.apache.commons.math.util.Incrementor"));
        evaluations.setMaximalCount(-2147475456);
        setField(evaluations, "org.apache.commons.math.util.Incrementor", "count", -2147475457);
        setField(illinoisSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "evaluations", evaluations);
        setField(illinoisSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "searchMin", -32768.00000000001);
        setField(illinoisSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "searchMax", 0.0);
        Sigmoid function = ((Sigmoid) createInstance("org.apache.commons.math.analysis.function.Sigmoid"));
        setField(function, "org.apache.commons.math.analysis.function.Sigmoid", "lo", 0.0);
        setField(function, "org.apache.commons.math.analysis.function.Sigmoid", "hi", 0.0);
        setField(illinoisSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "function", function);
        
        illinoisSolver.doSolve();
    }
    
    /**
    @utbot.classUnderTest {@link BaseSecantSolver}
 * @utbot.methodUnderTest {@link org.apache.commons.math.analysis.solvers.BaseSecantSolver#doSolve()}
 * @utbot.throwsException {@link org.apache.commons.math.exception.TooManyEvaluationsException} in: double f1 = computeObjectiveValue(x1);
 *  */
    @Test(expected = TooManyEvaluationsException.class)
    public void testDoSolve_ThrowTooManyEvaluationsException_2() throws Exception  {
        IllinoisSolver illinoisSolver = ((IllinoisSolver) createInstance("org.apache.commons.math.analysis.solvers.IllinoisSolver"));
        Incrementor evaluations = ((Incrementor) createInstance("org.apache.commons.math.util.Incrementor"));
        evaluations.setMaximalCount(Integer.MIN_VALUE);
        setField(evaluations, "org.apache.commons.math.util.Incrementor", "count", Integer.MAX_VALUE);
        setField(illinoisSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "evaluations", evaluations);
        setField(illinoisSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "searchMin", 747.3593750000582);
        setField(illinoisSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "searchMax", 0.0);
        Sigmoid function = ((Sigmoid) createInstance("org.apache.commons.math.analysis.function.Sigmoid"));
        setField(function, "org.apache.commons.math.analysis.function.Sigmoid", "lo", 0.0);
        setField(function, "org.apache.commons.math.analysis.function.Sigmoid", "hi", 0.0);
        setField(illinoisSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "function", function);
        
        illinoisSolver.doSolve();
    }
    ///endregion
    
    ///region FUZZER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method doSolve()
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.math.analysis.solvers.BaseSecantSolver}
     * @utbot.methodUnderTest {@link org.apache.commons.math.analysis.solvers.BaseSecantSolver#doSolve()}
     */
    @Test(expected = TooManyEvaluationsException.class)
    public void testDoSolveThrowsTMEE() {
        RegulaFalsiSolver regulaFalsiSolver = new RegulaFalsiSolver(-1.000030517578125);
        
        regulaFalsiSolver.doSolve();
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method doSolve()
    
    @Test
    public void testDoSolve1() throws Exception  {
        IllinoisSolver illinoisSolver = ((IllinoisSolver) createInstance("org.apache.commons.math.analysis.solvers.IllinoisSolver"));
        Incrementor evaluations = ((Incrementor) createInstance("org.apache.commons.math.util.Incrementor"));
        setField(evaluations, "org.apache.commons.math.util.Incrementor", "count", -3);
        setField(illinoisSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "evaluations", evaluations);
        setField(illinoisSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "searchMin", -17109.0585937961);
        setField(illinoisSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "searchMax", 0.0);
        Sigmoid function = ((Sigmoid) createInstance("org.apache.commons.math.analysis.function.Sigmoid"));
        setField(function, "org.apache.commons.math.analysis.function.Sigmoid", "lo", 0.0);
        setField(function, "org.apache.commons.math.analysis.function.Sigmoid", "hi", 0.0);
        setField(illinoisSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "function", function);
        
        double actual = illinoisSolver.doSolve();
        
        assertEquals(-17109.0585937961, actual, 1.0E-6);
        
        Incrementor illinoisSolverEvaluations = ((Incrementor) getFieldValue(illinoisSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "evaluations"));
        int finalIllinoisSolverEvaluationsCount = ((Integer) getFieldValue(illinoisSolverEvaluations, "org.apache.commons.math.util.Incrementor", "count"));
        
        org.junit.Assert.assertEquals(-1, finalIllinoisSolverEvaluationsCount);
    }
    
    @Test
    public void testDoSolve2() throws Exception  {
        IllinoisSolver illinoisSolver = ((IllinoisSolver) createInstance("org.apache.commons.math.analysis.solvers.IllinoisSolver"));
        Incrementor evaluations = ((Incrementor) createInstance("org.apache.commons.math.util.Incrementor"));
        setField(evaluations, "org.apache.commons.math.util.Incrementor", "count", -3);
        setField(illinoisSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "evaluations", evaluations);
        setField(illinoisSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "searchMin", -17109.0585937961);
        setField(illinoisSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "searchMax", 265997.0);
        Sigmoid function = ((Sigmoid) createInstance("org.apache.commons.math.analysis.function.Sigmoid"));
        setField(function, "org.apache.commons.math.analysis.function.Sigmoid", "lo", 0.0);
        setField(function, "org.apache.commons.math.analysis.function.Sigmoid", "hi", 0.0);
        setField(illinoisSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "function", function);
        
        double actual = illinoisSolver.doSolve();
        
        assertEquals(-17109.0585937961, actual, 1.0E-6);
        
        Incrementor illinoisSolverEvaluations = ((Incrementor) getFieldValue(illinoisSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "evaluations"));
        int finalIllinoisSolverEvaluationsCount = ((Integer) getFieldValue(illinoisSolverEvaluations, "org.apache.commons.math.util.Incrementor", "count"));
        
        org.junit.Assert.assertEquals(-1, finalIllinoisSolverEvaluationsCount);
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method doSolve()
    
    @Test(expected = NumberIsTooLargeException.class)
    public void testDoSolve3() throws Exception  {
        IllinoisSolver illinoisSolver = ((IllinoisSolver) createInstance("org.apache.commons.math.analysis.solvers.IllinoisSolver"));
        Incrementor evaluations = ((Incrementor) createInstance("org.apache.commons.math.util.Incrementor"));
        setField(evaluations, "org.apache.commons.math.util.Incrementor", "count", -2);
        setField(illinoisSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "evaluations", evaluations);
        setField(illinoisSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "searchMin", 4.328521728E9);
        setField(illinoisSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "searchMax", 0.0);
        Sigmoid function = ((Sigmoid) createInstance("org.apache.commons.math.analysis.function.Sigmoid"));
        setField(function, "org.apache.commons.math.analysis.function.Sigmoid", "lo", java.lang.Double.NaN);
        setField(function, "org.apache.commons.math.analysis.function.Sigmoid", "hi", java.lang.Double.NaN);
        setField(illinoisSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "function", function);
        
        illinoisSolver.doSolve();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.analysis.solvers.BaseSecantSolver.solve
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method solve(int, org.apache.commons.math.analysis.UnivariateRealFunction, double, double, double, org.apache.commons.math.analysis.solvers.AllowedSolution)
    
    /**
    @utbot.classUnderTest {@link BaseSecantSolver}
 * @utbot.methodUnderTest {@link org.apache.commons.math.analysis.solvers.BaseSecantSolver#solve(int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double,double,org.apache.commons.math.analysis.solvers.AllowedSolution)}
 * @utbot.throwsException {@link org.apache.commons.math.exception.NullArgumentException} in: return super.solve(maxEval, f, min, max, startValue);
 *  */
    @Test(expected = NullArgumentException.class)
    public void testSolve_ThrowNullArgumentException() throws Exception  {
        IllinoisSolver illinoisSolver = ((IllinoisSolver) createInstance("org.apache.commons.math.analysis.solvers.IllinoisSolver"));
        
        illinoisSolver.solve(-255, null, java.lang.Double.NaN, java.lang.Double.NaN, java.lang.Double.NaN, null);
    }
    
    /**
    @utbot.classUnderTest {@link BaseSecantSolver}
 * @utbot.methodUnderTest {@link org.apache.commons.math.analysis.solvers.BaseSecantSolver#solve(int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double,double,org.apache.commons.math.analysis.solvers.AllowedSolution)}
 * @utbot.throwsException {@link org.apache.commons.math.exception.TooManyEvaluationsException} in: return super.solve(maxEval, f, min, max, startValue);
 *  */
    @Test(expected = TooManyEvaluationsException.class)
    public void testSolve_ThrowTooManyEvaluationsException() throws Exception  {
        RegulaFalsiSolver regulaFalsiSolver = ((RegulaFalsiSolver) createInstance("org.apache.commons.math.analysis.solvers.RegulaFalsiSolver"));
        Incrementor evaluations = ((Incrementor) createInstance("org.apache.commons.math.util.Incrementor"));
        setField(regulaFalsiSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "evaluations", evaluations);
        setField(regulaFalsiSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "searchMin", 0.0);
        setField(regulaFalsiSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "searchMax", 0.0);
        setField(regulaFalsiSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "searchStart", 0.0);
        HarmonicOscillator harmonicOscillator = new HarmonicOscillator(0.0, 0.0, 0.0);
        
        regulaFalsiSolver.solve(0, harmonicOscillator, java.lang.Double.NaN, java.lang.Double.NaN, java.lang.Double.NaN, null);
    }
    
    /**
    @utbot.classUnderTest {@link BaseSecantSolver}
 * @utbot.methodUnderTest {@link org.apache.commons.math.analysis.solvers.BaseSecantSolver#solve(int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double,double,org.apache.commons.math.analysis.solvers.AllowedSolution)}
 * @utbot.throwsException {@link org.apache.commons.math.exception.OutOfRangeException} in: return super.solve(maxEval, f, min, max, startValue);
 *  */
    @Test(expected = OutOfRangeException.class)
    public void testSolve_ThrowOutOfRangeException() throws Exception  {
        RegulaFalsiSolver regulaFalsiSolver = ((RegulaFalsiSolver) createInstance("org.apache.commons.math.analysis.solvers.RegulaFalsiSolver"));
        Incrementor evaluations = ((Incrementor) createInstance("org.apache.commons.math.util.Incrementor"));
        setField(regulaFalsiSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "evaluations", evaluations);
        setField(regulaFalsiSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "searchMin", 0.0);
        setField(regulaFalsiSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "searchMax", 0.0);
        setField(regulaFalsiSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "searchStart", 0.0);
        Logit logit = new Logit(3.584018545230482E-212, -1.534344490884476E39);
        
        regulaFalsiSolver.solve(1, logit, 3.584018545230482E-212, java.lang.Double.NaN, java.lang.Double.NaN, null);
    }
    
    /**
    @utbot.classUnderTest {@link BaseSecantSolver}
 * @utbot.methodUnderTest {@link org.apache.commons.math.analysis.solvers.BaseSecantSolver#solve(int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double,double,org.apache.commons.math.analysis.solvers.AllowedSolution)}
 * @utbot.throwsException {@link org.apache.commons.math.exception.OutOfRangeException} in: return super.solve(maxEval, f, min, max, startValue);
 *  */
    @Test(expected = OutOfRangeException.class)
    public void testSolve_ThrowOutOfRangeException_1() throws Exception  {
        IllinoisSolver illinoisSolver = ((IllinoisSolver) createInstance("org.apache.commons.math.analysis.solvers.IllinoisSolver"));
        Incrementor evaluations = ((Incrementor) createInstance("org.apache.commons.math.util.Incrementor"));
        setField(illinoisSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "evaluations", evaluations);
        setField(illinoisSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "searchMin", 0.0);
        setField(illinoisSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "searchMax", 0.0);
        setField(illinoisSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "searchStart", 0.0);
        Logit logit = new Logit(-1.57968760926292E116, 0.0);
        
        illinoisSolver.solve(1, logit, -5.817282831840999E135, java.lang.Double.NaN, java.lang.Double.NaN, null);
    }
    
    /**
    @utbot.classUnderTest {@link BaseSecantSolver}
 * @utbot.methodUnderTest {@link org.apache.commons.math.analysis.solvers.BaseSecantSolver#solve(int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double,double,org.apache.commons.math.analysis.solvers.AllowedSolution)}
 * @utbot.throwsException {@link org.apache.commons.math.exception.TooManyEvaluationsException} in: return super.solve(maxEval, f, min, max, startValue);
 *  */
    @Test(expected = TooManyEvaluationsException.class)
    public void testSolve_ThrowTooManyEvaluationsException_1() throws Exception  {
        IllinoisSolver illinoisSolver = ((IllinoisSolver) createInstance("org.apache.commons.math.analysis.solvers.IllinoisSolver"));
        Incrementor evaluations = ((Incrementor) createInstance("org.apache.commons.math.util.Incrementor"));
        setField(illinoisSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "evaluations", evaluations);
        setField(illinoisSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "searchMin", 0.0);
        setField(illinoisSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "searchMax", 0.0);
        setField(illinoisSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "searchStart", 0.0);
        Sigmoid sigmoid = new Sigmoid(0.0, 0.0);
        
        illinoisSolver.solve(1, sigmoid, 747.0, java.lang.Double.NaN, java.lang.Double.NaN, null);
    }
    
    /**
    @utbot.classUnderTest {@link BaseSecantSolver}
 * @utbot.methodUnderTest {@link org.apache.commons.math.analysis.solvers.BaseSecantSolver#solve(int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double,double,org.apache.commons.math.analysis.solvers.AllowedSolution)}
 * @utbot.throwsException {@link org.apache.commons.math.exception.TooManyEvaluationsException} in: return super.solve(maxEval, f, min, max, startValue);
 *  */
    @Test(expected = TooManyEvaluationsException.class)
    public void testSolve_ThrowTooManyEvaluationsException_2() throws Exception  {
        RegulaFalsiSolver regulaFalsiSolver = ((RegulaFalsiSolver) createInstance("org.apache.commons.math.analysis.solvers.RegulaFalsiSolver"));
        Incrementor evaluations = ((Incrementor) createInstance("org.apache.commons.math.util.Incrementor"));
        setField(regulaFalsiSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "evaluations", evaluations);
        setField(regulaFalsiSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "searchMin", 0.0);
        setField(regulaFalsiSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "searchMax", 0.0);
        setField(regulaFalsiSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "searchStart", 0.0);
        Sigmoid sigmoid = new Sigmoid(0.0, 0.0);
        
        regulaFalsiSolver.solve(1, sigmoid, -8.589934594056396E9, java.lang.Double.NaN, java.lang.Double.NaN, null);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method solve(int, org.apache.commons.math.analysis.UnivariateRealFunction, double, double, double, org.apache.commons.math.analysis.solvers.AllowedSolution)
    
    @Test
    public void testSolve1() throws Exception  {
        IllinoisSolver illinoisSolver = ((IllinoisSolver) createInstance("org.apache.commons.math.analysis.solvers.IllinoisSolver"));
        Incrementor evaluations = ((Incrementor) createInstance("org.apache.commons.math.util.Incrementor"));
        setField(illinoisSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "evaluations", evaluations);
        setField(illinoisSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "searchMin", 0.0);
        setField(illinoisSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "searchMax", 0.0);
        setField(illinoisSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "searchStart", 0.0);
        Sigmoid sigmoid = new Sigmoid(0.0, 0.0);
        AllowedSolution allowedSolution = AllowedSolution.LEFT_SIDE;
        
        AllowedSolution initialIllinoisSolverAllowed = ((AllowedSolution) getFieldValue(illinoisSolver, "org.apache.commons.math.analysis.solvers.BaseSecantSolver", "allowed"));
        UnivariateRealFunction initialIllinoisSolverFunction = ((UnivariateRealFunction) getFieldValue(illinoisSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "function"));
        
        double actual = illinoisSolver.solve(1073741824, sigmoid, 1.6777963506427925E7, 70016.5000085831, java.lang.Double.NaN, allowedSolution);
        
        assertEquals(1.6777963506427925E7, actual, 1.0E-6);
        
        AllowedSolution finalIllinoisSolverAllowed = ((AllowedSolution) getFieldValue(illinoisSolver, "org.apache.commons.math.analysis.solvers.BaseSecantSolver", "allowed"));
        Incrementor illinoisSolverEvaluations = ((Incrementor) getFieldValue(illinoisSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "evaluations"));
        int finalIllinoisSolverEvaluationsMaximalCount = ((Integer) getFieldValue(illinoisSolverEvaluations, "org.apache.commons.math.util.Incrementor", "maximalCount"));
        Incrementor illinoisSolverEvaluations1 = ((Incrementor) getFieldValue(illinoisSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "evaluations"));
        int finalIllinoisSolverEvaluationsCount = ((Integer) getFieldValue(illinoisSolverEvaluations1, "org.apache.commons.math.util.Incrementor", "count"));
        double finalIllinoisSolverSearchMin = ((Double) getFieldValue(illinoisSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "searchMin"));
        double finalIllinoisSolverSearchMax = ((Double) getFieldValue(illinoisSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "searchMax"));
        double finalIllinoisSolverSearchStart = ((Double) getFieldValue(illinoisSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "searchStart"));
        UnivariateRealFunction finalIllinoisSolverFunction = ((UnivariateRealFunction) getFieldValue(illinoisSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "function"));
        
        assertFalse(initialIllinoisSolverFunction == finalIllinoisSolverFunction);
        
        org.junit.Assert.assertEquals(1073741824, finalIllinoisSolverEvaluationsMaximalCount);
        
        org.junit.Assert.assertEquals(2, finalIllinoisSolverEvaluationsCount);
        
        assertEquals(1.6777963506427925E7, finalIllinoisSolverSearchMin, 1.0E-6);
        
        assertEquals(70016.5000085831, finalIllinoisSolverSearchMax, 1.0E-6);
        
        assertEquals(java.lang.Double.NaN, finalIllinoisSolverSearchStart, 1.0E-6);
    }
    
    @Test
    public void testSolve2() throws Exception  {
        IllinoisSolver illinoisSolver = ((IllinoisSolver) createInstance("org.apache.commons.math.analysis.solvers.IllinoisSolver"));
        Incrementor evaluations = ((Incrementor) createInstance("org.apache.commons.math.util.Incrementor"));
        setField(illinoisSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "evaluations", evaluations);
        setField(illinoisSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "searchMin", 0.0);
        setField(illinoisSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "searchMax", 0.0);
        setField(illinoisSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "searchStart", 0.0);
        Sigmoid sigmoid = new Sigmoid(0.0, 0.0);
        
        UnivariateRealFunction initialIllinoisSolverFunction = ((UnivariateRealFunction) getFieldValue(illinoisSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "function"));
        
        double actual = illinoisSolver.solve(1073741824, sigmoid, 1.1485435977343944E8, -3.970374421178095E19, java.lang.Double.NaN, null);
        
        assertEquals(1.1485435977343944E8, actual, 1.0E-6);
        
        Incrementor illinoisSolverEvaluations = ((Incrementor) getFieldValue(illinoisSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "evaluations"));
        int finalIllinoisSolverEvaluationsMaximalCount = ((Integer) getFieldValue(illinoisSolverEvaluations, "org.apache.commons.math.util.Incrementor", "maximalCount"));
        Incrementor illinoisSolverEvaluations1 = ((Incrementor) getFieldValue(illinoisSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "evaluations"));
        int finalIllinoisSolverEvaluationsCount = ((Integer) getFieldValue(illinoisSolverEvaluations1, "org.apache.commons.math.util.Incrementor", "count"));
        double finalIllinoisSolverSearchMin = ((Double) getFieldValue(illinoisSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "searchMin"));
        double finalIllinoisSolverSearchMax = ((Double) getFieldValue(illinoisSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "searchMax"));
        double finalIllinoisSolverSearchStart = ((Double) getFieldValue(illinoisSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "searchStart"));
        UnivariateRealFunction finalIllinoisSolverFunction = ((UnivariateRealFunction) getFieldValue(illinoisSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "function"));
        
        assertFalse(initialIllinoisSolverFunction == finalIllinoisSolverFunction);
        
        org.junit.Assert.assertEquals(1073741824, finalIllinoisSolverEvaluationsMaximalCount);
        
        org.junit.Assert.assertEquals(2, finalIllinoisSolverEvaluationsCount);
        
        assertEquals(1.1485435977343944E8, finalIllinoisSolverSearchMin, 1.0E-6);
        
        assertEquals(-3.970374421178095E19, finalIllinoisSolverSearchMax, 1.0E-6);
        
        assertEquals(java.lang.Double.NaN, finalIllinoisSolverSearchStart, 1.0E-6);
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method solve(int, org.apache.commons.math.analysis.UnivariateRealFunction, double, double, double, org.apache.commons.math.analysis.solvers.AllowedSolution)
    
    @Test(expected = NoBracketingException.class)
    public void testSolve3() throws Exception  {
        RegulaFalsiSolver regulaFalsiSolver = ((RegulaFalsiSolver) createInstance("org.apache.commons.math.analysis.solvers.RegulaFalsiSolver"));
        Incrementor evaluations = ((Incrementor) createInstance("org.apache.commons.math.util.Incrementor"));
        setField(regulaFalsiSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "evaluations", evaluations);
        setField(regulaFalsiSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "searchMin", 0.0);
        setField(regulaFalsiSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "searchMax", 0.0);
        setField(regulaFalsiSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "searchStart", 0.0);
        Sigmoid sigmoid = new Sigmoid(java.lang.Double.NaN, java.lang.Double.NaN);
        AllowedSolution allowedSolution = AllowedSolution.ANY_SIDE;
        
        regulaFalsiSolver.solve(1073741824, sigmoid, -525416.4368911088, java.lang.Double.NaN, java.lang.Double.NaN, allowedSolution);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.analysis.solvers.BaseSecantSolver.solve
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method solve(int, org.apache.commons.math.analysis.UnivariateRealFunction, double, double, double)
    
    /**
    @utbot.classUnderTest {@link BaseSecantSolver}
 * @utbot.methodUnderTest {@link org.apache.commons.math.analysis.solvers.BaseSecantSolver#solve(int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double,double)}
 * @utbot.throwsException {@link org.apache.commons.math.exception.NullArgumentException} in: return solve(maxEval, f, min, max, startValue, AllowedSolution.ANY_SIDE);
 *  */
    @Test(expected = NullArgumentException.class)
    public void testSolve_ThrowNullArgumentException1() throws Exception  {
        RegulaFalsiSolver regulaFalsiSolver = ((RegulaFalsiSolver) createInstance("org.apache.commons.math.analysis.solvers.RegulaFalsiSolver"));
        
        regulaFalsiSolver.solve(-255, ((UnivariateRealFunction) null), java.lang.Double.NaN, java.lang.Double.NaN, java.lang.Double.NaN);
    }
    
    /**
    @utbot.classUnderTest {@link BaseSecantSolver}
 * @utbot.methodUnderTest {@link org.apache.commons.math.analysis.solvers.BaseSecantSolver#solve(int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double,double)}
 * @utbot.throwsException {@link org.apache.commons.math.exception.TooManyEvaluationsException} 
 *  */
    @Test(expected = TooManyEvaluationsException.class)
    public void testSolve_ThrowTooManyEvaluationsException1() throws Exception  {
        PegasusSolver pegasusSolver = ((PegasusSolver) createInstance("org.apache.commons.math.analysis.solvers.PegasusSolver"));
        Incrementor evaluations = ((Incrementor) createInstance("org.apache.commons.math.util.Incrementor"));
        setField(pegasusSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "evaluations", evaluations);
        setField(pegasusSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "searchMin", 0.0);
        setField(pegasusSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "searchMax", 0.0);
        setField(pegasusSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "searchStart", 0.0);
        Gaussian gaussian = ((Gaussian) createInstance("org.apache.commons.math.analysis.function.Gaussian"));
        
        pegasusSolver.solve(0, ((UnivariateRealFunction) gaussian), java.lang.Double.NaN, java.lang.Double.NaN, java.lang.Double.NaN);
    }
    
    /**
    @utbot.classUnderTest {@link BaseSecantSolver}
 * @utbot.methodUnderTest {@link org.apache.commons.math.analysis.solvers.BaseSecantSolver#solve(int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double,double)}
 * @utbot.throwsException {@link org.apache.commons.math.exception.OutOfRangeException} 
 *  */
    @Test(expected = OutOfRangeException.class)
    public void testSolve_ThrowOutOfRangeException1() throws Exception  {
        IllinoisSolver illinoisSolver = ((IllinoisSolver) createInstance("org.apache.commons.math.analysis.solvers.IllinoisSolver"));
        Incrementor evaluations = ((Incrementor) createInstance("org.apache.commons.math.util.Incrementor"));
        setField(illinoisSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "evaluations", evaluations);
        setField(illinoisSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "searchMin", 0.0);
        setField(illinoisSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "searchMax", 0.0);
        setField(illinoisSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "searchStart", 0.0);
        Logit logit = new Logit(4.9E-324, 0.0);
        
        illinoisSolver.solve(1, ((UnivariateRealFunction) logit), -2.2250738585072014E-308, java.lang.Double.NaN, java.lang.Double.NaN);
    }
    
    /**
    @utbot.classUnderTest {@link BaseSecantSolver}
 * @utbot.methodUnderTest {@link org.apache.commons.math.analysis.solvers.BaseSecantSolver#solve(int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double,double)}
 * @utbot.throwsException {@link org.apache.commons.math.exception.OutOfRangeException} 
 *  */
    @Test(expected = OutOfRangeException.class)
    public void testSolve_ThrowOutOfRangeException_11() throws Exception  {
        PegasusSolver pegasusSolver = ((PegasusSolver) createInstance("org.apache.commons.math.analysis.solvers.PegasusSolver"));
        Incrementor evaluations = ((Incrementor) createInstance("org.apache.commons.math.util.Incrementor"));
        setField(pegasusSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "evaluations", evaluations);
        setField(pegasusSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "searchMin", 0.0);
        setField(pegasusSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "searchMax", 0.0);
        setField(pegasusSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "searchStart", 0.0);
        Logit logit = new Logit(1.4916681462400417E-154, -2.2250738586731447E-308);
        
        pegasusSolver.solve(1, ((UnivariateRealFunction) logit), 1.4916681462400417E-154, java.lang.Double.NaN, java.lang.Double.NaN);
    }
    
    /**
    @utbot.classUnderTest {@link BaseSecantSolver}
 * @utbot.methodUnderTest {@link org.apache.commons.math.analysis.solvers.BaseSecantSolver#solve(int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double,double)}
 * @utbot.throwsException {@link org.apache.commons.math.exception.TooManyEvaluationsException} 
 *  */
    @Test(expected = TooManyEvaluationsException.class)
    public void testSolve_ThrowTooManyEvaluationsException_11() throws Exception  {
        PegasusSolver pegasusSolver = ((PegasusSolver) createInstance("org.apache.commons.math.analysis.solvers.PegasusSolver"));
        Incrementor evaluations = ((Incrementor) createInstance("org.apache.commons.math.util.Incrementor"));
        setField(pegasusSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "evaluations", evaluations);
        setField(pegasusSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "searchMin", 0.0);
        setField(pegasusSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "searchMax", 0.0);
        setField(pegasusSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "searchStart", 0.0);
        Sigmoid sigmoid = new Sigmoid(0.0, 0.0);
        
        pegasusSolver.solve(1, ((UnivariateRealFunction) sigmoid), -16582.000124245882, java.lang.Double.NaN, java.lang.Double.NaN);
    }
    
    /**
    @utbot.classUnderTest {@link BaseSecantSolver}
 * @utbot.methodUnderTest {@link org.apache.commons.math.analysis.solvers.BaseSecantSolver#solve(int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double,double)}
 * @utbot.throwsException {@link org.apache.commons.math.exception.TooManyEvaluationsException} 
 *  */
    @Test(expected = TooManyEvaluationsException.class)
    public void testSolve_ThrowTooManyEvaluationsException_21() throws Exception  {
        RegulaFalsiSolver regulaFalsiSolver = ((RegulaFalsiSolver) createInstance("org.apache.commons.math.analysis.solvers.RegulaFalsiSolver"));
        Incrementor evaluations = ((Incrementor) createInstance("org.apache.commons.math.util.Incrementor"));
        setField(regulaFalsiSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "evaluations", evaluations);
        setField(regulaFalsiSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "searchMin", 0.0);
        setField(regulaFalsiSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "searchMax", 0.0);
        setField(regulaFalsiSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "searchStart", 0.0);
        Sigmoid sigmoid = new Sigmoid(0.0, 0.0);
        
        regulaFalsiSolver.solve(1, ((UnivariateRealFunction) sigmoid), 747.0000000005639, java.lang.Double.NaN, java.lang.Double.NaN);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method solve(int, org.apache.commons.math.analysis.UnivariateRealFunction, double, double, double)
    
    @Test
    public void testSolveByFuzzer() {
        RegulaFalsiSolver regulaFalsiSolver = new RegulaFalsiSolver(0.0);
        Exp exp = new Exp();
        
        double actual = regulaFalsiSolver.solve(Integer.MAX_VALUE, ((UnivariateRealFunction) exp), java.lang.Double.NEGATIVE_INFINITY, java.lang.Double.POSITIVE_INFINITY, java.lang.Double.NEGATIVE_INFINITY);
        
        assertEquals(java.lang.Double.NEGATIVE_INFINITY, actual, 1.0E-6);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method solve(int, org.apache.commons.math.analysis.UnivariateRealFunction, double, double, double)
    
    @Test
    public void testSolve4() throws Exception  {
        PegasusSolver pegasusSolver = ((PegasusSolver) createInstance("org.apache.commons.math.analysis.solvers.PegasusSolver"));
        Incrementor evaluations = ((Incrementor) createInstance("org.apache.commons.math.util.Incrementor"));
        setField(pegasusSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "evaluations", evaluations);
        setField(pegasusSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "searchMin", 0.0);
        setField(pegasusSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "searchMax", 0.0);
        setField(pegasusSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "searchStart", 0.0);
        Sigmoid sigmoid = new Sigmoid(0.0, 0.0);
        
        AllowedSolution initialPegasusSolverAllowed = ((AllowedSolution) getFieldValue(pegasusSolver, "org.apache.commons.math.analysis.solvers.BaseSecantSolver", "allowed"));
        UnivariateRealFunction initialPegasusSolverFunction = ((UnivariateRealFunction) getFieldValue(pegasusSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "function"));
        
        double actual = pegasusSolver.solve(1073741824, ((UnivariateRealFunction) sigmoid), 7.221158701937412E214, -2.11386706263995E87, java.lang.Double.NaN);
        
        assertEquals(7.221158701937412E214, actual, 1.0E-6);
        
        AllowedSolution finalPegasusSolverAllowed = ((AllowedSolution) getFieldValue(pegasusSolver, "org.apache.commons.math.analysis.solvers.BaseSecantSolver", "allowed"));
        Incrementor pegasusSolverEvaluations = ((Incrementor) getFieldValue(pegasusSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "evaluations"));
        int finalPegasusSolverEvaluationsMaximalCount = ((Integer) getFieldValue(pegasusSolverEvaluations, "org.apache.commons.math.util.Incrementor", "maximalCount"));
        Incrementor pegasusSolverEvaluations1 = ((Incrementor) getFieldValue(pegasusSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "evaluations"));
        int finalPegasusSolverEvaluationsCount = ((Integer) getFieldValue(pegasusSolverEvaluations1, "org.apache.commons.math.util.Incrementor", "count"));
        double finalPegasusSolverSearchMin = ((Double) getFieldValue(pegasusSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "searchMin"));
        double finalPegasusSolverSearchMax = ((Double) getFieldValue(pegasusSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "searchMax"));
        double finalPegasusSolverSearchStart = ((Double) getFieldValue(pegasusSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "searchStart"));
        UnivariateRealFunction finalPegasusSolverFunction = ((UnivariateRealFunction) getFieldValue(pegasusSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "function"));
        
        assertFalse(initialPegasusSolverFunction == finalPegasusSolverFunction);
        
        org.junit.Assert.assertEquals(1073741824, finalPegasusSolverEvaluationsMaximalCount);
        
        org.junit.Assert.assertEquals(2, finalPegasusSolverEvaluationsCount);
        
        assertEquals(7.221158701937412E214, finalPegasusSolverSearchMin, 1.0E-6);
        
        assertEquals(-2.11386706263995E87, finalPegasusSolverSearchMax, 1.0E-6);
        
        assertEquals(java.lang.Double.NaN, finalPegasusSolverSearchStart, 1.0E-6);
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method solve(int, org.apache.commons.math.analysis.UnivariateRealFunction, double, double, double)
    
    @Test(expected = NoBracketingException.class)
    public void testSolve5() throws Exception  {
        IllinoisSolver illinoisSolver = ((IllinoisSolver) createInstance("org.apache.commons.math.analysis.solvers.IllinoisSolver"));
        Incrementor evaluations = ((Incrementor) createInstance("org.apache.commons.math.util.Incrementor"));
        setField(illinoisSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "evaluations", evaluations);
        setField(illinoisSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "searchMin", 0.0);
        setField(illinoisSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "searchMax", 0.0);
        setField(illinoisSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "searchStart", 0.0);
        Sigmoid sigmoid = new Sigmoid(java.lang.Double.NaN, java.lang.Double.NaN);
        
        illinoisSolver.solve(1073741824, ((UnivariateRealFunction) sigmoid), -803.5040970035056, java.lang.Double.NaN, java.lang.Double.NaN);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.analysis.solvers.BaseSecantSolver.solve
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method solve(int, org.apache.commons.math.analysis.UnivariateRealFunction, double, double, org.apache.commons.math.analysis.solvers.AllowedSolution)
    
    /**
    @utbot.classUnderTest {@link BaseSecantSolver}
 * @utbot.methodUnderTest {@link org.apache.commons.math.analysis.solvers.BaseSecantSolver#solve(int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double,org.apache.commons.math.analysis.solvers.AllowedSolution)}
 * @utbot.throwsException {@link org.apache.commons.math.exception.NullArgumentException} in: return solve(maxEval, f, min, max, min + 0.5 * (max - min), allowedSolution);
 *  */
    @Test(expected = NullArgumentException.class)
    public void testSolve_ThrowNullArgumentException2() throws Exception  {
        IllinoisSolver illinoisSolver = ((IllinoisSolver) createInstance("org.apache.commons.math.analysis.solvers.IllinoisSolver"));
        
        illinoisSolver.solve(-255, ((UnivariateRealFunction) null), java.lang.Double.NaN, java.lang.Double.NaN, ((AllowedSolution) null));
    }
    
    /**
    @utbot.classUnderTest {@link BaseSecantSolver}
 * @utbot.methodUnderTest {@link org.apache.commons.math.analysis.solvers.BaseSecantSolver#solve(int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double,org.apache.commons.math.analysis.solvers.AllowedSolution)}
 * @utbot.throwsException {@link org.apache.commons.math.exception.OutOfRangeException} 
 *  */
    @Test(expected = OutOfRangeException.class)
    public void testSolve_ThrowOutOfRangeException2() throws Exception  {
        RegulaFalsiSolver regulaFalsiSolver = ((RegulaFalsiSolver) createInstance("org.apache.commons.math.analysis.solvers.RegulaFalsiSolver"));
        Incrementor evaluations = ((Incrementor) createInstance("org.apache.commons.math.util.Incrementor"));
        setField(regulaFalsiSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "evaluations", evaluations);
        setField(regulaFalsiSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "searchMin", 0.0);
        setField(regulaFalsiSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "searchMax", 0.0);
        setField(regulaFalsiSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "searchStart", 0.0);
        UnivariateRealFunction function = ((UnivariateRealFunction) createInstance("org.apache.commons.math.ode.events.EventState$1"));
        setField(regulaFalsiSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "function", function);
        Logit logit = new Logit(6.26321725741711E-294, -7.29134452694225E-304);
        
        regulaFalsiSolver.solve(1, ((UnivariateRealFunction) logit), 6.26321725741711E-294, java.lang.Double.NaN, ((AllowedSolution) null));
    }
    
    /**
    @utbot.classUnderTest {@link BaseSecantSolver}
 * @utbot.methodUnderTest {@link org.apache.commons.math.analysis.solvers.BaseSecantSolver#solve(int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double,org.apache.commons.math.analysis.solvers.AllowedSolution)}
 * @utbot.throwsException {@link org.apache.commons.math.exception.TooManyEvaluationsException} 
 *  */
    @Test(expected = TooManyEvaluationsException.class)
    public void testSolve_ThrowTooManyEvaluationsException_12() throws Exception  {
        PegasusSolver pegasusSolver = ((PegasusSolver) createInstance("org.apache.commons.math.analysis.solvers.PegasusSolver"));
        AllowedSolution allowed = AllowedSolution.RIGHT_SIDE;
        setField(pegasusSolver, "org.apache.commons.math.analysis.solvers.BaseSecantSolver", "allowed", allowed);
        Incrementor evaluations = ((Incrementor) createInstance("org.apache.commons.math.util.Incrementor"));
        setField(pegasusSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "evaluations", evaluations);
        setField(pegasusSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "searchMin", 0.0);
        setField(pegasusSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "searchMax", 0.0);
        setField(pegasusSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "searchStart", 0.0);
        Sigmoid sigmoid = new Sigmoid(0.0, 0.0);
        
        pegasusSolver.solve(1, ((UnivariateRealFunction) sigmoid), 747.0000081136878, java.lang.Double.NaN, ((AllowedSolution) null));
    }
    
    /**
    @utbot.classUnderTest {@link BaseSecantSolver}
 * @utbot.methodUnderTest {@link org.apache.commons.math.analysis.solvers.BaseSecantSolver#solve(int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double,org.apache.commons.math.analysis.solvers.AllowedSolution)}
 * @utbot.throwsException {@link org.apache.commons.math.exception.TooManyEvaluationsException} 
 *  */
    @Test(expected = TooManyEvaluationsException.class)
    public void testSolve_ThrowTooManyEvaluationsException_22() throws Exception  {
        PegasusSolver pegasusSolver = ((PegasusSolver) createInstance("org.apache.commons.math.analysis.solvers.PegasusSolver"));
        Incrementor evaluations = ((Incrementor) createInstance("org.apache.commons.math.util.Incrementor"));
        setField(pegasusSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "evaluations", evaluations);
        setField(pegasusSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "searchMin", 0.0);
        setField(pegasusSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "searchMax", 0.0);
        setField(pegasusSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "searchStart", 0.0);
        UnivariateRealFunction function = ((UnivariateRealFunction) createInstance("org.apache.commons.math.optimization.direct.PowellOptimizer$LineSearch$1"));
        setField(pegasusSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "function", function);
        Sigmoid sigmoid = new Sigmoid(0.0, 0.0);
        
        pegasusSolver.solve(1, ((UnivariateRealFunction) sigmoid), -2.28471603407428E9, java.lang.Double.NaN, ((AllowedSolution) null));
    }
    
    /**
    @utbot.classUnderTest {@link BaseSecantSolver}
 * @utbot.methodUnderTest {@link org.apache.commons.math.analysis.solvers.BaseSecantSolver#solve(int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double,org.apache.commons.math.analysis.solvers.AllowedSolution)}
 * @utbot.throwsException {@link org.apache.commons.math.exception.TooManyEvaluationsException} 
 *  */
    @Test(expected = TooManyEvaluationsException.class)
    public void testSolve_ThrowTooManyEvaluationsException2() throws Exception  {
        RegulaFalsiSolver regulaFalsiSolver = ((RegulaFalsiSolver) createInstance("org.apache.commons.math.analysis.solvers.RegulaFalsiSolver"));
        Incrementor evaluations = ((Incrementor) createInstance("org.apache.commons.math.util.Incrementor"));
        setField(regulaFalsiSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "evaluations", evaluations);
        setField(regulaFalsiSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "searchMin", 0.0);
        setField(regulaFalsiSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "searchMax", 0.0);
        setField(regulaFalsiSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "searchStart", 0.0);
        HarmonicOscillator harmonicOscillator = new HarmonicOscillator(0.0, 0.0, 0.0);
        
        regulaFalsiSolver.solve(0, ((UnivariateRealFunction) harmonicOscillator), java.lang.Double.NaN, java.lang.Double.NaN, ((AllowedSolution) null));
    }
    
    /**
    @utbot.classUnderTest {@link BaseSecantSolver}
 * @utbot.methodUnderTest {@link org.apache.commons.math.analysis.solvers.BaseSecantSolver#solve(int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double,org.apache.commons.math.analysis.solvers.AllowedSolution)}
 * @utbot.throwsException {@link org.apache.commons.math.exception.OutOfRangeException} 
 *  */
    @Test(expected = OutOfRangeException.class)
    public void testSolve_ThrowOutOfRangeException_12() throws Exception  {
        PegasusSolver pegasusSolver = ((PegasusSolver) createInstance("org.apache.commons.math.analysis.solvers.PegasusSolver"));
        Incrementor evaluations = ((Incrementor) createInstance("org.apache.commons.math.util.Incrementor"));
        setField(pegasusSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "evaluations", evaluations);
        setField(pegasusSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "searchMin", 0.0);
        setField(pegasusSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "searchMax", 0.0);
        setField(pegasusSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "searchStart", 0.0);
        Logit logit = new Logit(2.98333700376541E-154, 0.0);
        
        pegasusSolver.solve(1, ((UnivariateRealFunction) logit), -3.689349694354337E19, java.lang.Double.NaN, ((AllowedSolution) null));
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method solve(int, org.apache.commons.math.analysis.UnivariateRealFunction, double, double, org.apache.commons.math.analysis.solvers.AllowedSolution)
    
    @Test
    public void testSolve6() throws Exception  {
        RegulaFalsiSolver regulaFalsiSolver = ((RegulaFalsiSolver) createInstance("org.apache.commons.math.analysis.solvers.RegulaFalsiSolver"));
        AllowedSolution allowed = AllowedSolution.LEFT_SIDE;
        setField(regulaFalsiSolver, "org.apache.commons.math.analysis.solvers.BaseSecantSolver", "allowed", allowed);
        Incrementor evaluations = ((Incrementor) createInstance("org.apache.commons.math.util.Incrementor"));
        setField(regulaFalsiSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "evaluations", evaluations);
        setField(regulaFalsiSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "searchMin", 0.0);
        setField(regulaFalsiSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "searchMax", 0.0);
        setField(regulaFalsiSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "searchStart", 0.0);
        Sigmoid sigmoid = new Sigmoid(0.0, 0.0);
        AllowedSolution allowedSolution = AllowedSolution.RIGHT_SIDE;
        
        AllowedSolution initialRegulaFalsiSolverAllowed = ((AllowedSolution) getFieldValue(regulaFalsiSolver, "org.apache.commons.math.analysis.solvers.BaseSecantSolver", "allowed"));
        UnivariateRealFunction initialRegulaFalsiSolverFunction = ((UnivariateRealFunction) getFieldValue(regulaFalsiSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "function"));
        
        double actual = regulaFalsiSolver.solve(1073741824, ((UnivariateRealFunction) sigmoid), 1.4063544948752596E154, 709.9999369750768, allowedSolution);
        
        assertEquals(1.4063544948752596E154, actual, 1.0E-6);
        
        AllowedSolution finalRegulaFalsiSolverAllowed = ((AllowedSolution) getFieldValue(regulaFalsiSolver, "org.apache.commons.math.analysis.solvers.BaseSecantSolver", "allowed"));
        Incrementor regulaFalsiSolverEvaluations = ((Incrementor) getFieldValue(regulaFalsiSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "evaluations"));
        int finalRegulaFalsiSolverEvaluationsMaximalCount = ((Integer) getFieldValue(regulaFalsiSolverEvaluations, "org.apache.commons.math.util.Incrementor", "maximalCount"));
        Incrementor regulaFalsiSolverEvaluations1 = ((Incrementor) getFieldValue(regulaFalsiSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "evaluations"));
        int finalRegulaFalsiSolverEvaluationsCount = ((Integer) getFieldValue(regulaFalsiSolverEvaluations1, "org.apache.commons.math.util.Incrementor", "count"));
        double finalRegulaFalsiSolverSearchMin = ((Double) getFieldValue(regulaFalsiSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "searchMin"));
        double finalRegulaFalsiSolverSearchMax = ((Double) getFieldValue(regulaFalsiSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "searchMax"));
        double finalRegulaFalsiSolverSearchStart = ((Double) getFieldValue(regulaFalsiSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "searchStart"));
        UnivariateRealFunction finalRegulaFalsiSolverFunction = ((UnivariateRealFunction) getFieldValue(regulaFalsiSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "function"));
        
        assertFalse(initialRegulaFalsiSolverAllowed == finalRegulaFalsiSolverAllowed);
        
        assertFalse(initialRegulaFalsiSolverFunction == finalRegulaFalsiSolverFunction);
        
        org.junit.Assert.assertEquals(1073741824, finalRegulaFalsiSolverEvaluationsMaximalCount);
        
        org.junit.Assert.assertEquals(2, finalRegulaFalsiSolverEvaluationsCount);
        
        assertEquals(1.4063544948752596E154, finalRegulaFalsiSolverSearchMin, 1.0E-6);
        
        assertEquals(709.9999369750768, finalRegulaFalsiSolverSearchMax, 1.0E-6);
        
        assertEquals(7.031772474376298E153, finalRegulaFalsiSolverSearchStart, 1.0E-6);
    }
    
    @Test
    public void testSolve7() throws Exception  {
        RegulaFalsiSolver regulaFalsiSolver = ((RegulaFalsiSolver) createInstance("org.apache.commons.math.analysis.solvers.RegulaFalsiSolver"));
        Incrementor evaluations = ((Incrementor) createInstance("org.apache.commons.math.util.Incrementor"));
        setField(regulaFalsiSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "evaluations", evaluations);
        setField(regulaFalsiSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "searchMin", 0.0);
        setField(regulaFalsiSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "searchMax", 0.0);
        setField(regulaFalsiSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "searchStart", 0.0);
        Sigmoid sigmoid = new Sigmoid(0.0, 0.0);
        AllowedSolution allowedSolution = AllowedSolution.LEFT_SIDE;
        
        AllowedSolution initialRegulaFalsiSolverAllowed = ((AllowedSolution) getFieldValue(regulaFalsiSolver, "org.apache.commons.math.analysis.solvers.BaseSecantSolver", "allowed"));
        UnivariateRealFunction initialRegulaFalsiSolverFunction = ((UnivariateRealFunction) getFieldValue(regulaFalsiSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "function"));
        
        double actual = regulaFalsiSolver.solve(1073741824, ((UnivariateRealFunction) sigmoid), 525321.2363282192, 720.0633582818505, allowedSolution);
        
        assertEquals(525321.2363282192, actual, 1.0E-6);
        
        AllowedSolution finalRegulaFalsiSolverAllowed = ((AllowedSolution) getFieldValue(regulaFalsiSolver, "org.apache.commons.math.analysis.solvers.BaseSecantSolver", "allowed"));
        Incrementor regulaFalsiSolverEvaluations = ((Incrementor) getFieldValue(regulaFalsiSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "evaluations"));
        int finalRegulaFalsiSolverEvaluationsMaximalCount = ((Integer) getFieldValue(regulaFalsiSolverEvaluations, "org.apache.commons.math.util.Incrementor", "maximalCount"));
        Incrementor regulaFalsiSolverEvaluations1 = ((Incrementor) getFieldValue(regulaFalsiSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "evaluations"));
        int finalRegulaFalsiSolverEvaluationsCount = ((Integer) getFieldValue(regulaFalsiSolverEvaluations1, "org.apache.commons.math.util.Incrementor", "count"));
        double finalRegulaFalsiSolverSearchMin = ((Double) getFieldValue(regulaFalsiSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "searchMin"));
        double finalRegulaFalsiSolverSearchMax = ((Double) getFieldValue(regulaFalsiSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "searchMax"));
        double finalRegulaFalsiSolverSearchStart = ((Double) getFieldValue(regulaFalsiSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "searchStart"));
        UnivariateRealFunction finalRegulaFalsiSolverFunction = ((UnivariateRealFunction) getFieldValue(regulaFalsiSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "function"));
        
        assertFalse(initialRegulaFalsiSolverFunction == finalRegulaFalsiSolverFunction);
        
        org.junit.Assert.assertEquals(1073741824, finalRegulaFalsiSolverEvaluationsMaximalCount);
        
        org.junit.Assert.assertEquals(2, finalRegulaFalsiSolverEvaluationsCount);
        
        assertEquals(525321.2363282192, finalRegulaFalsiSolverSearchMin, 1.0E-6);
        
        assertEquals(720.0633582818505, finalRegulaFalsiSolverSearchMax, 1.0E-6);
        
        assertEquals(263020.6498432505, finalRegulaFalsiSolverSearchStart, 1.0E-6);
    }
    
    @Test
    public void testSolve8() throws Exception  {
        PegasusSolver pegasusSolver = ((PegasusSolver) createInstance("org.apache.commons.math.analysis.solvers.PegasusSolver"));
        Incrementor evaluations = ((Incrementor) createInstance("org.apache.commons.math.util.Incrementor"));
        setField(pegasusSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "evaluations", evaluations);
        setField(pegasusSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "searchMin", 0.0);
        setField(pegasusSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "searchMax", 0.0);
        setField(pegasusSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "searchStart", 0.0);
        Sigmoid sigmoid = new Sigmoid(0.0, 0.0);
        
        UnivariateRealFunction initialPegasusSolverFunction = ((UnivariateRealFunction) getFieldValue(pegasusSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "function"));
        
        double actual = pegasusSolver.solve(536870912, ((UnivariateRealFunction) sigmoid), 2064.504150868864, -777.0314941499629, ((AllowedSolution) null));
        
        assertEquals(2064.504150868864, actual, 1.0E-6);
        
        Incrementor pegasusSolverEvaluations = ((Incrementor) getFieldValue(pegasusSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "evaluations"));
        int finalPegasusSolverEvaluationsMaximalCount = ((Integer) getFieldValue(pegasusSolverEvaluations, "org.apache.commons.math.util.Incrementor", "maximalCount"));
        Incrementor pegasusSolverEvaluations1 = ((Incrementor) getFieldValue(pegasusSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "evaluations"));
        int finalPegasusSolverEvaluationsCount = ((Integer) getFieldValue(pegasusSolverEvaluations1, "org.apache.commons.math.util.Incrementor", "count"));
        double finalPegasusSolverSearchMin = ((Double) getFieldValue(pegasusSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "searchMin"));
        double finalPegasusSolverSearchMax = ((Double) getFieldValue(pegasusSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "searchMax"));
        double finalPegasusSolverSearchStart = ((Double) getFieldValue(pegasusSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "searchStart"));
        UnivariateRealFunction finalPegasusSolverFunction = ((UnivariateRealFunction) getFieldValue(pegasusSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "function"));
        
        assertFalse(initialPegasusSolverFunction == finalPegasusSolverFunction);
        
        org.junit.Assert.assertEquals(536870912, finalPegasusSolverEvaluationsMaximalCount);
        
        org.junit.Assert.assertEquals(2, finalPegasusSolverEvaluationsCount);
        
        assertEquals(2064.504150868864, finalPegasusSolverSearchMin, 1.0E-6);
        
        assertEquals(-777.0314941499629, finalPegasusSolverSearchMax, 1.0E-6);
        
        assertEquals(643.7363283594507, finalPegasusSolverSearchStart, 1.0E-6);
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method solve(int, org.apache.commons.math.analysis.UnivariateRealFunction, double, double, org.apache.commons.math.analysis.solvers.AllowedSolution)
    
    @Test(expected = NoBracketingException.class)
    public void testSolve9() throws Exception  {
        RegulaFalsiSolver regulaFalsiSolver = ((RegulaFalsiSolver) createInstance("org.apache.commons.math.analysis.solvers.RegulaFalsiSolver"));
        Incrementor evaluations = ((Incrementor) createInstance("org.apache.commons.math.util.Incrementor"));
        setField(regulaFalsiSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "evaluations", evaluations);
        setField(regulaFalsiSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "searchMin", 0.0);
        setField(regulaFalsiSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "searchMax", 0.0);
        setField(regulaFalsiSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "searchStart", 0.0);
        UnivariateRealFunction function = ((UnivariateRealFunction) createInstance("org.apache.commons.math.ode.events.EventState$1"));
        setField(regulaFalsiSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "function", function);
        Sigmoid sigmoid = new Sigmoid(java.lang.Double.NaN, java.lang.Double.NaN);
        AllowedSolution allowedSolution = AllowedSolution.LEFT_SIDE;
        
        regulaFalsiSolver.solve(1073741824, ((UnivariateRealFunction) sigmoid), java.lang.Double.NEGATIVE_INFINITY, java.lang.Double.NaN, allowedSolution);
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
        
                java.lang.reflect.Method methodForGetDeclaredFields730368574336200 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields730368574336200.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass730368574344100 = (java.lang.reflect.Field[]) methodForGetDeclaredFields730368574336200.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass730368574344100).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields730368575272000 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields730368575272000.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass730368575276100 = (java.lang.reflect.Field[]) methodForGetDeclaredFields730368575272000.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass730368575276100).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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

