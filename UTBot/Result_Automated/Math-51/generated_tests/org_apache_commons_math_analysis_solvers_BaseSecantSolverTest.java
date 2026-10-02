package org.apache.commons.math.analysis.solvers;

import org.junit.Test;
import org.apache.commons.math.exception.NullArgumentException;
import org.apache.commons.math.analysis.UnivariateRealFunction;
import org.apache.commons.math.util.Incrementor;
import org.apache.commons.math.analysis.function.Gaussian;
import org.apache.commons.math.exception.TooManyEvaluationsException;
import org.apache.commons.math.analysis.function.Logit;
import org.apache.commons.math.exception.OutOfRangeException;
import org.apache.commons.math.analysis.function.Sigmoid;
import org.apache.commons.math.analysis.function.Rint;
import org.apache.commons.math.exception.NoBracketingException;
import org.apache.commons.math.analysis.function.Logistic;
import org.apache.commons.math.analysis.polynomials.PolynomialFunctionNewtonForm;
import org.apache.commons.math.analysis.function.Cosh;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public final class org_apache_commons_math_analysis_solvers_BaseSecantSolverTest {
    ///region Test suites for executable org.apache.commons.math.analysis.solvers.BaseSecantSolver.solve
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method solve(int, org.apache.commons.math.analysis.UnivariateRealFunction, double, double, double)
    
    /**
    @utbot.classUnderTest {@link BaseSecantSolver}
 * @utbot.methodUnderTest {@link org.apache.commons.math.analysis.solvers.BaseSecantSolver#solve(int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double,double)}
 * @utbot.throwsException {@link org.apache.commons.math.exception.NullArgumentException} in: return solve(maxEval, f, min, max, startValue, AllowedSolution.ANY_SIDE);
 *  */
    @Test(expected = NullArgumentException.class)
    public void testSolve_ThrowNullArgumentException() throws Exception  {
        RegulaFalsiSolver regulaFalsiSolver = ((RegulaFalsiSolver) createInstance("org.apache.commons.math.analysis.solvers.RegulaFalsiSolver"));
        
        regulaFalsiSolver.solve(-255, ((UnivariateRealFunction) null), java.lang.Double.NaN, java.lang.Double.NaN, java.lang.Double.NaN);
    }
    
    /**
    @utbot.classUnderTest {@link BaseSecantSolver}
 * @utbot.methodUnderTest {@link org.apache.commons.math.analysis.solvers.BaseSecantSolver#solve(int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double,double)}
 * @utbot.throwsException {@link org.apache.commons.math.exception.TooManyEvaluationsException} 
 *  */
    @Test(expected = TooManyEvaluationsException.class)
    public void testSolve_ThrowTooManyEvaluationsException() throws Exception  {
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
    public void testSolve_ThrowOutOfRangeException() throws Exception  {
        IllinoisSolver illinoisSolver = ((IllinoisSolver) createInstance("org.apache.commons.math.analysis.solvers.IllinoisSolver"));
        Incrementor evaluations = ((Incrementor) createInstance("org.apache.commons.math.util.Incrementor"));
        setField(illinoisSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "evaluations", evaluations);
        setField(illinoisSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "searchMin", 0.0);
        setField(illinoisSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "searchMax", 0.0);
        setField(illinoisSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "searchStart", 0.0);
        Logit logit = new Logit(5.363123171977216E154, 0.0);
        
        illinoisSolver.solve(1, ((UnivariateRealFunction) logit), -3.10503618460152E231, java.lang.Double.NaN, java.lang.Double.NaN);
    }
    
    /**
    @utbot.classUnderTest {@link BaseSecantSolver}
 * @utbot.methodUnderTest {@link org.apache.commons.math.analysis.solvers.BaseSecantSolver#solve(int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double,double)}
 * @utbot.throwsException {@link org.apache.commons.math.exception.OutOfRangeException} 
 *  */
    @Test(expected = OutOfRangeException.class)
    public void testSolve_ThrowOutOfRangeException_1() throws Exception  {
        PegasusSolver pegasusSolver = ((PegasusSolver) createInstance("org.apache.commons.math.analysis.solvers.PegasusSolver"));
        Incrementor evaluations = ((Incrementor) createInstance("org.apache.commons.math.util.Incrementor"));
        setField(pegasusSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "evaluations", evaluations);
        setField(pegasusSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "searchMin", 0.0);
        setField(pegasusSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "searchMax", 0.0);
        setField(pegasusSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "searchStart", 0.0);
        Logit logit = new Logit(1.2476176225636118E-211, -5.442661040596007E24);
        
        pegasusSolver.solve(1, ((UnivariateRealFunction) logit), 1.2476176225636118E-211, java.lang.Double.NaN, java.lang.Double.NaN);
    }
    
    /**
    @utbot.classUnderTest {@link BaseSecantSolver}
 * @utbot.methodUnderTest {@link org.apache.commons.math.analysis.solvers.BaseSecantSolver#solve(int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double,double)}
 * @utbot.throwsException {@link org.apache.commons.math.exception.TooManyEvaluationsException} 
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
        
        illinoisSolver.solve(1, ((UnivariateRealFunction) sigmoid), -966.5001984285308, java.lang.Double.NaN, java.lang.Double.NaN);
    }
    ///endregion
    
    ///region FUZZER: TIMEOUTS for method solve(int, org.apache.commons.math.analysis.UnivariateRealFunction, double, double, double)
    
    @Test(timeout = 1000L)
    public void testSolveByFuzzer() {
        IllinoisSolver illinoisSolver = new IllinoisSolver(0.0);
        Rint rint = new Rint();
        
        /* This execution may take longer than the 1000 ms timeout
         and therefore fail due to exceeding the timeout. */
        illinoisSolver.solve(Integer.MAX_VALUE, ((UnivariateRealFunction) rint), java.lang.Double.NEGATIVE_INFINITY, java.lang.Double.POSITIVE_INFINITY, java.lang.Double.NEGATIVE_INFINITY);
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method solve(int, org.apache.commons.math.analysis.UnivariateRealFunction, double, double, double)
    
    @Test(expected = NoBracketingException.class)
    public void testSolve1() throws Exception  {
        PegasusSolver pegasusSolver = ((PegasusSolver) createInstance("org.apache.commons.math.analysis.solvers.PegasusSolver"));
        AllowedSolution allowed = AllowedSolution.ANY_SIDE;
        setField(pegasusSolver, "org.apache.commons.math.analysis.solvers.BaseSecantSolver", "allowed", allowed);
        Incrementor evaluations = ((Incrementor) createInstance("org.apache.commons.math.util.Incrementor"));
        setField(pegasusSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "evaluations", evaluations);
        setField(pegasusSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "searchMin", 0.0);
        setField(pegasusSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "searchMax", 0.0);
        setField(pegasusSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "searchStart", 0.0);
        Sigmoid sigmoid = new Sigmoid(java.lang.Double.NaN, java.lang.Double.NaN);
        
        pegasusSolver.solve(1073741824, ((UnivariateRealFunction) sigmoid), -1.2217016581670397E217, java.lang.Double.NaN, java.lang.Double.NaN);
    }
    
    @Test(expected = TooManyEvaluationsException.class)
    public void testSolve2() throws Exception  {
        RegulaFalsiSolver regulaFalsiSolver = ((RegulaFalsiSolver) createInstance("org.apache.commons.math.analysis.solvers.RegulaFalsiSolver"));
        AllowedSolution allowed = AllowedSolution.ANY_SIDE;
        setField(regulaFalsiSolver, "org.apache.commons.math.analysis.solvers.BaseSecantSolver", "allowed", allowed);
        Incrementor evaluations = ((Incrementor) createInstance("org.apache.commons.math.util.Incrementor"));
        setField(regulaFalsiSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "evaluations", evaluations);
        setField(regulaFalsiSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "searchMin", 0.0);
        setField(regulaFalsiSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "searchMax", 0.0);
        setField(regulaFalsiSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "searchStart", 0.0);
        Sigmoid sigmoid = new Sigmoid(0.0, 0.0);
        
        regulaFalsiSolver.solve(1, ((UnivariateRealFunction) sigmoid), 1.6778072003418937E7, java.lang.Double.NaN, java.lang.Double.NaN);
    }
    
    @Test(expected = NoBracketingException.class)
    public void testSolve3() throws Exception  {
        IllinoisSolver illinoisSolver = ((IllinoisSolver) createInstance("org.apache.commons.math.analysis.solvers.IllinoisSolver"));
        Incrementor evaluations = ((Incrementor) createInstance("org.apache.commons.math.util.Incrementor"));
        setField(illinoisSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "evaluations", evaluations);
        setField(illinoisSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "searchMin", 0.0);
        setField(illinoisSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "searchMax", 0.0);
        setField(illinoisSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "searchStart", 0.0);
        Sigmoid sigmoid = new Sigmoid(java.lang.Double.NaN, java.lang.Double.NaN);
        
        illinoisSolver.solve(1073741824, ((UnivariateRealFunction) sigmoid), 131072.00000000076, java.lang.Double.NaN, java.lang.Double.NaN);
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
    public void testSolve_ThrowNullArgumentException1() throws Exception  {
        IllinoisSolver illinoisSolver = ((IllinoisSolver) createInstance("org.apache.commons.math.analysis.solvers.IllinoisSolver"));
        
        illinoisSolver.solve(-255, null, java.lang.Double.NaN, java.lang.Double.NaN, java.lang.Double.NaN, null);
    }
    
    /**
    @utbot.classUnderTest {@link BaseSecantSolver}
 * @utbot.methodUnderTest {@link org.apache.commons.math.analysis.solvers.BaseSecantSolver#solve(int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double,double,org.apache.commons.math.analysis.solvers.AllowedSolution)}
 * @utbot.throwsException {@link org.apache.commons.math.exception.TooManyEvaluationsException} in: return super.solve(maxEval, f, min, max, startValue);
 *  */
    @Test(expected = TooManyEvaluationsException.class)
    public void testSolve_ThrowTooManyEvaluationsException1() throws Exception  {
        RegulaFalsiSolver regulaFalsiSolver = ((RegulaFalsiSolver) createInstance("org.apache.commons.math.analysis.solvers.RegulaFalsiSolver"));
        Incrementor evaluations = ((Incrementor) createInstance("org.apache.commons.math.util.Incrementor"));
        setField(regulaFalsiSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "evaluations", evaluations);
        setField(regulaFalsiSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "searchMin", 0.0);
        setField(regulaFalsiSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "searchMax", 0.0);
        setField(regulaFalsiSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "searchStart", 0.0);
        Logistic logistic = ((Logistic) createInstance("org.apache.commons.math.analysis.function.Logistic"));
        
        regulaFalsiSolver.solve(0, logistic, java.lang.Double.NaN, java.lang.Double.NaN, java.lang.Double.NaN, null);
    }
    
    /**
    @utbot.classUnderTest {@link BaseSecantSolver}
 * @utbot.methodUnderTest {@link org.apache.commons.math.analysis.solvers.BaseSecantSolver#solve(int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double,double,org.apache.commons.math.analysis.solvers.AllowedSolution)}
 * @utbot.throwsException {@link org.apache.commons.math.exception.OutOfRangeException} in: return super.solve(maxEval, f, min, max, startValue);
 *  */
    @Test(expected = OutOfRangeException.class)
    public void testSolve_ThrowOutOfRangeException1() throws Exception  {
        IllinoisSolver illinoisSolver = ((IllinoisSolver) createInstance("org.apache.commons.math.analysis.solvers.IllinoisSolver"));
        Incrementor evaluations = ((Incrementor) createInstance("org.apache.commons.math.util.Incrementor"));
        setField(illinoisSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "evaluations", evaluations);
        setField(illinoisSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "searchMin", 0.0);
        setField(illinoisSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "searchMax", 0.0);
        setField(illinoisSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "searchStart", 0.0);
        Logit logit = new Logit(3.689865585206965E19, -2.225385526639E-308);
        
        illinoisSolver.solve(1, logit, 3.689865585206965E19, java.lang.Double.NaN, java.lang.Double.NaN, null);
    }
    
    /**
    @utbot.classUnderTest {@link BaseSecantSolver}
 * @utbot.methodUnderTest {@link org.apache.commons.math.analysis.solvers.BaseSecantSolver#solve(int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double,double,org.apache.commons.math.analysis.solvers.AllowedSolution)}
 * @utbot.throwsException {@link org.apache.commons.math.exception.OutOfRangeException} in: return super.solve(maxEval, f, min, max, startValue);
 *  */
    @Test(expected = OutOfRangeException.class)
    public void testSolve_ThrowOutOfRangeException_11() throws Exception  {
        RegulaFalsiSolver regulaFalsiSolver = ((RegulaFalsiSolver) createInstance("org.apache.commons.math.analysis.solvers.RegulaFalsiSolver"));
        Incrementor evaluations = ((Incrementor) createInstance("org.apache.commons.math.util.Incrementor"));
        setField(regulaFalsiSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "evaluations", evaluations);
        setField(regulaFalsiSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "searchMin", 0.0);
        setField(regulaFalsiSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "searchMax", 0.0);
        setField(regulaFalsiSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "searchStart", 0.0);
        Logit logit = new Logit(4.9E-324, 0.0);
        
        regulaFalsiSolver.solve(1, logit, -2.2250738585072014E-308, java.lang.Double.NaN, java.lang.Double.NaN, null);
    }
    
    /**
    @utbot.classUnderTest {@link BaseSecantSolver}
 * @utbot.methodUnderTest {@link org.apache.commons.math.analysis.solvers.BaseSecantSolver#solve(int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double,double,org.apache.commons.math.analysis.solvers.AllowedSolution)}
 * @utbot.throwsException {@link org.apache.commons.math.exception.TooManyEvaluationsException} in: return super.solve(maxEval, f, min, max, startValue);
 *  */
    @Test(expected = TooManyEvaluationsException.class)
    public void testSolve_ThrowTooManyEvaluationsException_11() throws Exception  {
        RegulaFalsiSolver regulaFalsiSolver = ((RegulaFalsiSolver) createInstance("org.apache.commons.math.analysis.solvers.RegulaFalsiSolver"));
        Incrementor evaluations = ((Incrementor) createInstance("org.apache.commons.math.util.Incrementor"));
        setField(regulaFalsiSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "evaluations", evaluations);
        setField(regulaFalsiSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "searchMin", 0.0);
        setField(regulaFalsiSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "searchMax", 0.0);
        setField(regulaFalsiSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "searchStart", 0.0);
        Sigmoid sigmoid = new Sigmoid(0.0, 0.0);
        
        regulaFalsiSolver.solve(1, sigmoid, 747.5731649223026, java.lang.Double.NaN, java.lang.Double.NaN, null);
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
        
        regulaFalsiSolver.solve(1, sigmoid, -525002.5313422084, java.lang.Double.NaN, java.lang.Double.NaN, null);
    }
    ///endregion
    
    ///region FUZZER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method solve(int, org.apache.commons.math.analysis.UnivariateRealFunction, double, double, double, org.apache.commons.math.analysis.solvers.AllowedSolution)
    
    @Test(expected = TooManyEvaluationsException.class)
    public void testSolveByFuzzer1() {
        IllinoisSolver illinoisSolver = new IllinoisSolver(0.0);
        Rint rint = new Rint();
        AllowedSolution allowedSolution = AllowedSolution.LEFT_SIDE;
        
        illinoisSolver.solve(-1, rint, java.lang.Double.NEGATIVE_INFINITY, java.lang.Double.POSITIVE_INFINITY, java.lang.Double.NEGATIVE_INFINITY, allowedSolution);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method solve(int, org.apache.commons.math.analysis.UnivariateRealFunction, double, double, double, org.apache.commons.math.analysis.solvers.AllowedSolution)
    
    @Test
    public void testSolve4() throws Exception  {
        PegasusSolver pegasusSolver = ((PegasusSolver) createInstance("org.apache.commons.math.analysis.solvers.PegasusSolver"));
        Incrementor evaluations = ((Incrementor) createInstance("org.apache.commons.math.util.Incrementor"));
        setField(pegasusSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "evaluations", evaluations);
        setField(pegasusSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "searchMin", 0.0);
        setField(pegasusSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "searchMax", 0.0);
        setField(pegasusSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "searchStart", 0.0);
        PolynomialFunctionNewtonForm function = ((PolynomialFunctionNewtonForm) createInstance("org.apache.commons.math.analysis.polynomials.PolynomialFunctionNewtonForm"));
        setField(pegasusSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "function", function);
        Sigmoid sigmoid = new Sigmoid(0.0, 0.0);
        AllowedSolution allowedSolution = AllowedSolution.LEFT_SIDE;
        
        AllowedSolution initialPegasusSolverAllowed = ((AllowedSolution) getFieldValue(pegasusSolver, "org.apache.commons.math.analysis.solvers.BaseSecantSolver", "allowed"));
        UnivariateRealFunction initialPegasusSolverFunction = ((UnivariateRealFunction) getFieldValue(pegasusSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "function"));
        
        double actual = pegasusSolver.solve(1073741824, sigmoid, -3.705371701882283E78, 709.1198782012802, java.lang.Double.NaN, allowedSolution);
        
        assertEquals(-3.705371701882283E78, actual, 1.0E-6);
        
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
        
        assertEquals(-3.705371701882283E78, finalPegasusSolverSearchMin, 1.0E-6);
        
        assertEquals(709.1198782012802, finalPegasusSolverSearchMax, 1.0E-6);
        
        assertEquals(java.lang.Double.NaN, finalPegasusSolverSearchStart, 1.0E-6);
    }
    
    @Test
    public void testSolve5() throws Exception  {
        IllinoisSolver illinoisSolver = ((IllinoisSolver) createInstance("org.apache.commons.math.analysis.solvers.IllinoisSolver"));
        Incrementor evaluations = ((Incrementor) createInstance("org.apache.commons.math.util.Incrementor"));
        setField(illinoisSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "evaluations", evaluations);
        setField(illinoisSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "searchMin", 0.0);
        setField(illinoisSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "searchMax", 0.0);
        setField(illinoisSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "searchStart", 0.0);
        Cosh function = ((Cosh) createInstance("org.apache.commons.math.analysis.function.Cosh"));
        setField(illinoisSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "function", function);
        Sigmoid sigmoid = new Sigmoid(0.0, 0.0);
        AllowedSolution allowedSolution = AllowedSolution.ANY_SIDE;
        
        AllowedSolution initialIllinoisSolverAllowed = ((AllowedSolution) getFieldValue(illinoisSolver, "org.apache.commons.math.analysis.solvers.BaseSecantSolver", "allowed"));
        UnivariateRealFunction initialIllinoisSolverFunction = ((UnivariateRealFunction) getFieldValue(illinoisSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "function"));
        
        double actual = illinoisSolver.solve(1073741824, sigmoid, -9.17834137600287E9, java.lang.Double.NEGATIVE_INFINITY, java.lang.Double.NaN, allowedSolution);
        
        assertEquals(-9.17834137600287E9, actual, 1.0E-6);
        
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
        
        assertEquals(-9.17834137600287E9, finalIllinoisSolverSearchMin, 1.0E-6);
        
        assertEquals(java.lang.Double.NEGATIVE_INFINITY, finalIllinoisSolverSearchMax, 1.0E-6);
        
        assertEquals(java.lang.Double.NaN, finalIllinoisSolverSearchStart, 1.0E-6);
    }
    
    @Test
    public void testSolve6() throws Exception  {
        PegasusSolver pegasusSolver = ((PegasusSolver) createInstance("org.apache.commons.math.analysis.solvers.PegasusSolver"));
        Incrementor evaluations = ((Incrementor) createInstance("org.apache.commons.math.util.Incrementor"));
        setField(pegasusSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "evaluations", evaluations);
        setField(pegasusSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "searchMin", 0.0);
        setField(pegasusSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "searchMax", 0.0);
        setField(pegasusSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "searchStart", 0.0);
        UnivariateRealFunction function = ((UnivariateRealFunction) createInstance("org.apache.commons.math.analysis.function.Logit$1"));
        setField(pegasusSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "function", function);
        Sigmoid sigmoid = new Sigmoid(0.0, 0.0);
        
        UnivariateRealFunction initialPegasusSolverFunction = ((UnivariateRealFunction) getFieldValue(pegasusSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "function"));
        
        double actual = pegasusSolver.solve(1073741824, sigmoid, java.lang.Double.NEGATIVE_INFINITY, 8.589936892000061E9, java.lang.Double.NaN, null);
        
        assertEquals(java.lang.Double.NEGATIVE_INFINITY, actual, 1.0E-6);
        
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
        
        assertEquals(java.lang.Double.NEGATIVE_INFINITY, finalPegasusSolverSearchMin, 1.0E-6);
        
        assertEquals(8.589936892000061E9, finalPegasusSolverSearchMax, 1.0E-6);
        
        assertEquals(java.lang.Double.NaN, finalPegasusSolverSearchStart, 1.0E-6);
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method solve(int, org.apache.commons.math.analysis.UnivariateRealFunction, double, double, double, org.apache.commons.math.analysis.solvers.AllowedSolution)
    
    @Test(expected = NoBracketingException.class)
    public void testSolve7() throws Exception  {
        IllinoisSolver illinoisSolver = ((IllinoisSolver) createInstance("org.apache.commons.math.analysis.solvers.IllinoisSolver"));
        Incrementor evaluations = ((Incrementor) createInstance("org.apache.commons.math.util.Incrementor"));
        setField(illinoisSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "evaluations", evaluations);
        setField(illinoisSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "searchMin", 0.0);
        setField(illinoisSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "searchMax", 0.0);
        setField(illinoisSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "searchStart", 0.0);
        Sigmoid sigmoid = new Sigmoid(java.lang.Double.NaN, java.lang.Double.NaN);
        AllowedSolution allowedSolution = AllowedSolution.BELOW_SIDE;
        
        illinoisSolver.solve(1073741824, sigmoid, 3.6201932949013306E11, java.lang.Double.NaN, java.lang.Double.NaN, allowedSolution);
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
        Logistic logistic = ((Logistic) createInstance("org.apache.commons.math.analysis.function.Logistic"));
        
        regulaFalsiSolver.solve(0, ((UnivariateRealFunction) logistic), java.lang.Double.NaN, java.lang.Double.NaN, ((AllowedSolution) null));
    }
    
    /**
    @utbot.classUnderTest {@link BaseSecantSolver}
 * @utbot.methodUnderTest {@link org.apache.commons.math.analysis.solvers.BaseSecantSolver#solve(int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double,org.apache.commons.math.analysis.solvers.AllowedSolution)}
 * @utbot.throwsException {@link org.apache.commons.math.exception.TooManyEvaluationsException} 
 *  */
    @Test(expected = TooManyEvaluationsException.class)
    public void testSolve_ThrowTooManyEvaluationsException_21() throws Exception  {
        PegasusSolver pegasusSolver = ((PegasusSolver) createInstance("org.apache.commons.math.analysis.solvers.PegasusSolver"));
        AllowedSolution allowed = AllowedSolution.BELOW_SIDE;
        setField(pegasusSolver, "org.apache.commons.math.analysis.solvers.BaseSecantSolver", "allowed", allowed);
        Incrementor evaluations = ((Incrementor) createInstance("org.apache.commons.math.util.Incrementor"));
        setField(pegasusSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "evaluations", evaluations);
        setField(pegasusSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "searchMin", 0.0);
        setField(pegasusSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "searchMax", 0.0);
        setField(pegasusSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "searchStart", 0.0);
        Sigmoid sigmoid = new Sigmoid(0.0, 0.0);
        
        pegasusSolver.solve(1, ((UnivariateRealFunction) sigmoid), -2.1529909603743286E9, java.lang.Double.NaN, ((AllowedSolution) null));
    }
    
    /**
    @utbot.classUnderTest {@link BaseSecantSolver}
 * @utbot.methodUnderTest {@link org.apache.commons.math.analysis.solvers.BaseSecantSolver#solve(int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double,org.apache.commons.math.analysis.solvers.AllowedSolution)}
 * @utbot.throwsException {@link org.apache.commons.math.exception.OutOfRangeException} 
 *  */
    @Test(expected = OutOfRangeException.class)
    public void testSolve_ThrowOutOfRangeException2() throws Exception  {
        PegasusSolver pegasusSolver = ((PegasusSolver) createInstance("org.apache.commons.math.analysis.solvers.PegasusSolver"));
        Incrementor evaluations = ((Incrementor) createInstance("org.apache.commons.math.util.Incrementor"));
        setField(pegasusSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "evaluations", evaluations);
        setField(pegasusSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "searchMin", 0.0);
        setField(pegasusSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "searchMax", 0.0);
        setField(pegasusSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "searchStart", 0.0);
        Logit logit = new Logit(8.625, -2.259840637546377E-308);
        
        pegasusSolver.solve(1, ((UnivariateRealFunction) logit), 8.625, java.lang.Double.NaN, ((AllowedSolution) null));
    }
    
    /**
    @utbot.classUnderTest {@link BaseSecantSolver}
 * @utbot.methodUnderTest {@link org.apache.commons.math.analysis.solvers.BaseSecantSolver#solve(int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double,org.apache.commons.math.analysis.solvers.AllowedSolution)}
 * @utbot.throwsException {@link org.apache.commons.math.exception.OutOfRangeException} 
 *  */
    @Test(expected = OutOfRangeException.class)
    public void testSolve_ThrowOutOfRangeException_12() throws Exception  {
        RegulaFalsiSolver regulaFalsiSolver = ((RegulaFalsiSolver) createInstance("org.apache.commons.math.analysis.solvers.RegulaFalsiSolver"));
        Incrementor evaluations = ((Incrementor) createInstance("org.apache.commons.math.util.Incrementor"));
        setField(regulaFalsiSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "evaluations", evaluations);
        setField(regulaFalsiSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "searchMin", 0.0);
        setField(regulaFalsiSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "searchMax", 0.0);
        setField(regulaFalsiSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "searchStart", 0.0);
        Logit logit = new Logit(4.9E-324, 0.0);
        
        regulaFalsiSolver.solve(1, ((UnivariateRealFunction) logit), -2.2250738585072014E-308, java.lang.Double.NaN, ((AllowedSolution) null));
    }
    
    /**
    @utbot.classUnderTest {@link BaseSecantSolver}
 * @utbot.methodUnderTest {@link org.apache.commons.math.analysis.solvers.BaseSecantSolver#solve(int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double,org.apache.commons.math.analysis.solvers.AllowedSolution)}
 * @utbot.throwsException {@link org.apache.commons.math.exception.TooManyEvaluationsException} 
 *  */
    @Test(expected = TooManyEvaluationsException.class)
    public void testSolve_ThrowTooManyEvaluationsException_12() throws Exception  {
        IllinoisSolver illinoisSolver = ((IllinoisSolver) createInstance("org.apache.commons.math.analysis.solvers.IllinoisSolver"));
        Incrementor evaluations = ((Incrementor) createInstance("org.apache.commons.math.util.Incrementor"));
        setField(illinoisSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "evaluations", evaluations);
        setField(illinoisSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "searchMin", 0.0);
        setField(illinoisSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "searchMax", 0.0);
        setField(illinoisSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "searchStart", 0.0);
        Sigmoid sigmoid = new Sigmoid(0.0, 0.0);
        
        illinoisSolver.solve(1, ((UnivariateRealFunction) sigmoid), 747.4066957235336, java.lang.Double.NaN, ((AllowedSolution) null));
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method solve(int, org.apache.commons.math.analysis.UnivariateRealFunction, double, double, org.apache.commons.math.analysis.solvers.AllowedSolution)
    
    @Test
    public void testSolve8() throws Exception  {
        PegasusSolver pegasusSolver = ((PegasusSolver) createInstance("org.apache.commons.math.analysis.solvers.PegasusSolver"));
        AllowedSolution allowed = AllowedSolution.BELOW_SIDE;
        setField(pegasusSolver, "org.apache.commons.math.analysis.solvers.BaseSecantSolver", "allowed", allowed);
        Incrementor evaluations = ((Incrementor) createInstance("org.apache.commons.math.util.Incrementor"));
        setField(pegasusSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "evaluations", evaluations);
        setField(pegasusSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "searchMin", 0.0);
        setField(pegasusSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "searchMax", 0.0);
        setField(pegasusSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "searchStart", 0.0);
        Sigmoid sigmoid = new Sigmoid(0.0, 0.0);
        AllowedSolution allowedSolution = AllowedSolution.LEFT_SIDE;
        
        AllowedSolution initialPegasusSolverAllowed = ((AllowedSolution) getFieldValue(pegasusSolver, "org.apache.commons.math.analysis.solvers.BaseSecantSolver", "allowed"));
        UnivariateRealFunction initialPegasusSolverFunction = ((UnivariateRealFunction) getFieldValue(pegasusSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "function"));
        
        double actual = pegasusSolver.solve(1073741824, ((UnivariateRealFunction) sigmoid), 764.0214855077211, 709.0010380745298, allowedSolution);
        
        assertEquals(764.0214855077211, actual, 1.0E-6);
        
        AllowedSolution finalPegasusSolverAllowed = ((AllowedSolution) getFieldValue(pegasusSolver, "org.apache.commons.math.analysis.solvers.BaseSecantSolver", "allowed"));
        Incrementor pegasusSolverEvaluations = ((Incrementor) getFieldValue(pegasusSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "evaluations"));
        int finalPegasusSolverEvaluationsMaximalCount = ((Integer) getFieldValue(pegasusSolverEvaluations, "org.apache.commons.math.util.Incrementor", "maximalCount"));
        Incrementor pegasusSolverEvaluations1 = ((Incrementor) getFieldValue(pegasusSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "evaluations"));
        int finalPegasusSolverEvaluationsCount = ((Integer) getFieldValue(pegasusSolverEvaluations1, "org.apache.commons.math.util.Incrementor", "count"));
        double finalPegasusSolverSearchMin = ((Double) getFieldValue(pegasusSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "searchMin"));
        double finalPegasusSolverSearchMax = ((Double) getFieldValue(pegasusSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "searchMax"));
        double finalPegasusSolverSearchStart = ((Double) getFieldValue(pegasusSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "searchStart"));
        UnivariateRealFunction finalPegasusSolverFunction = ((UnivariateRealFunction) getFieldValue(pegasusSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "function"));
        
        assertFalse(initialPegasusSolverAllowed == finalPegasusSolverAllowed);
        
        assertFalse(initialPegasusSolverFunction == finalPegasusSolverFunction);
        
        org.junit.Assert.assertEquals(1073741824, finalPegasusSolverEvaluationsMaximalCount);
        
        org.junit.Assert.assertEquals(2, finalPegasusSolverEvaluationsCount);
        
        assertEquals(764.0214855077211, finalPegasusSolverSearchMin, 1.0E-6);
        
        assertEquals(709.0010380745298, finalPegasusSolverSearchMax, 1.0E-6);
        
        assertEquals(736.5112617911254, finalPegasusSolverSearchStart, 1.0E-6);
    }
    
    @Test
    public void testSolve9() throws Exception  {
        IllinoisSolver illinoisSolver = ((IllinoisSolver) createInstance("org.apache.commons.math.analysis.solvers.IllinoisSolver"));
        Incrementor evaluations = ((Incrementor) createInstance("org.apache.commons.math.util.Incrementor"));
        setField(illinoisSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "evaluations", evaluations);
        setField(illinoisSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "searchMin", 0.0);
        setField(illinoisSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "searchMax", 0.0);
        setField(illinoisSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "searchStart", 0.0);
        Sigmoid sigmoid = new Sigmoid(0.0, 0.0);
        
        UnivariateRealFunction initialIllinoisSolverFunction = ((UnivariateRealFunction) getFieldValue(illinoisSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "function"));
        
        double actual = illinoisSolver.solve(1073741824, ((UnivariateRealFunction) sigmoid), 1.349834918400147E10, -9.007199254740992E16, ((AllowedSolution) null));
        
        assertEquals(1.349834918400147E10, actual, 1.0E-6);
        
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
        
        assertEquals(1.349834918400147E10, finalIllinoisSolverSearchMin, 1.0E-6);
        
        assertEquals(-9.007199254740992E16, finalIllinoisSolverSearchMax, 1.0E-6);
        
        assertEquals(-4.5035989524530368E16, finalIllinoisSolverSearchStart, 1.0E-6);
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method solve(int, org.apache.commons.math.analysis.UnivariateRealFunction, double, double, org.apache.commons.math.analysis.solvers.AllowedSolution)
    
    @Test(expected = NoBracketingException.class)
    public void testSolve10() throws Exception  {
        PegasusSolver pegasusSolver = ((PegasusSolver) createInstance("org.apache.commons.math.analysis.solvers.PegasusSolver"));
        AllowedSolution allowed = AllowedSolution.ANY_SIDE;
        setField(pegasusSolver, "org.apache.commons.math.analysis.solvers.BaseSecantSolver", "allowed", allowed);
        Incrementor evaluations = ((Incrementor) createInstance("org.apache.commons.math.util.Incrementor"));
        setField(pegasusSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "evaluations", evaluations);
        setField(pegasusSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "searchMin", 0.0);
        setField(pegasusSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "searchMax", 0.0);
        setField(pegasusSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "searchStart", 0.0);
        Sigmoid sigmoid = new Sigmoid(java.lang.Double.NaN, java.lang.Double.NaN);
        AllowedSolution allowedSolution = AllowedSolution.ANY_SIDE;
        
        pegasusSolver.solve(1073741824, ((UnivariateRealFunction) sigmoid), -4.294968452798614E9, java.lang.Double.NaN, allowedSolution);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.analysis.solvers.BaseSecantSolver.doSolve
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method doSolve()
    
    /**
    @utbot.classUnderTest {@link BaseSecantSolver}
 * @utbot.methodUnderTest {@link org.apache.commons.math.analysis.solvers.BaseSecantSolver#doSolve()}
 * @utbot.throwsException {@link org.apache.commons.math.exception.TooManyEvaluationsException} in: double f0 = computeObjectiveValue(x0);
 *  */
    @Test(expected = TooManyEvaluationsException.class)
    public void testDoSolve_ThrowTooManyEvaluationsException() throws Exception  {
        PegasusSolver pegasusSolver = ((PegasusSolver) createInstance("org.apache.commons.math.analysis.solvers.PegasusSolver"));
        Incrementor evaluations = ((Incrementor) createInstance("org.apache.commons.math.util.Incrementor"));
        setField(pegasusSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "evaluations", evaluations);
        setField(pegasusSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "searchMin", 0.0);
        setField(pegasusSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "searchMax", 0.0);
        
        pegasusSolver.doSolve();
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
        setField(pegasusSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "searchMin", 8.063970599323511);
        setField(pegasusSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "searchMax", 0.0);
        Logit function = ((Logit) createInstance("org.apache.commons.math.analysis.function.Logit"));
        setField(function, "org.apache.commons.math.analysis.function.Logit", "lo", 8.063970599323511);
        setField(function, "org.apache.commons.math.analysis.function.Logit", "hi", -2.2296932039979283E-308);
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
        setField(pegasusSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "searchMin", 4.9E-324);
        setField(pegasusSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "searchMax", 0.0);
        Logit function = ((Logit) createInstance("org.apache.commons.math.analysis.function.Logit"));
        setField(function, "org.apache.commons.math.analysis.function.Logit", "lo", 1.0E-323);
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
        PegasusSolver pegasusSolver = ((PegasusSolver) createInstance("org.apache.commons.math.analysis.solvers.PegasusSolver"));
        Incrementor evaluations = ((Incrementor) createInstance("org.apache.commons.math.util.Incrementor"));
        evaluations.setMaximalCount(Integer.MIN_VALUE);
        setField(evaluations, "org.apache.commons.math.util.Incrementor", "count", Integer.MAX_VALUE);
        setField(pegasusSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "evaluations", evaluations);
        setField(pegasusSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "searchMin", 747.1885681152926);
        setField(pegasusSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "searchMax", 0.0);
        Sigmoid function = ((Sigmoid) createInstance("org.apache.commons.math.analysis.function.Sigmoid"));
        setField(function, "org.apache.commons.math.analysis.function.Sigmoid", "lo", 0.0);
        setField(function, "org.apache.commons.math.analysis.function.Sigmoid", "hi", 0.0);
        setField(pegasusSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "function", function);
        
        pegasusSolver.doSolve();
    }
    
    /**
    @utbot.classUnderTest {@link BaseSecantSolver}
 * @utbot.methodUnderTest {@link org.apache.commons.math.analysis.solvers.BaseSecantSolver#doSolve()}
 * @utbot.throwsException {@link org.apache.commons.math.exception.TooManyEvaluationsException} in: double f1 = computeObjectiveValue(x1);
 *  */
    @Test(expected = TooManyEvaluationsException.class)
    public void testDoSolve_ThrowTooManyEvaluationsException_2() throws Exception  {
        RegulaFalsiSolver regulaFalsiSolver = ((RegulaFalsiSolver) createInstance("org.apache.commons.math.analysis.solvers.RegulaFalsiSolver"));
        Incrementor evaluations = ((Incrementor) createInstance("org.apache.commons.math.util.Incrementor"));
        evaluations.setMaximalCount(-2147475456);
        setField(evaluations, "org.apache.commons.math.util.Incrementor", "count", -2147475457);
        setField(regulaFalsiSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "evaluations", evaluations);
        setField(regulaFalsiSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "searchMin", -1.1450449952046877E10);
        setField(regulaFalsiSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "searchMax", 0.0);
        Sigmoid function = ((Sigmoid) createInstance("org.apache.commons.math.analysis.function.Sigmoid"));
        setField(function, "org.apache.commons.math.analysis.function.Sigmoid", "lo", 0.0);
        setField(function, "org.apache.commons.math.analysis.function.Sigmoid", "hi", 0.0);
        setField(regulaFalsiSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "function", function);
        
        regulaFalsiSolver.doSolve();
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method doSolve()
    
    @Test
    public void testDoSolve1() throws Exception  {
        PegasusSolver pegasusSolver = ((PegasusSolver) createInstance("org.apache.commons.math.analysis.solvers.PegasusSolver"));
        Incrementor evaluations = ((Incrementor) createInstance("org.apache.commons.math.util.Incrementor"));
        evaluations.setMaximalCount(905969664);
        setField(evaluations, "org.apache.commons.math.util.Incrementor", "count", 877793274);
        setField(pegasusSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "evaluations", evaluations);
        setField(pegasusSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "searchMin", 1.3560514560001589E10);
        setField(pegasusSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "searchMax", 709.2304085856522);
        Sigmoid function = ((Sigmoid) createInstance("org.apache.commons.math.analysis.function.Sigmoid"));
        setField(function, "org.apache.commons.math.analysis.function.Sigmoid", "lo", 0.0);
        setField(function, "org.apache.commons.math.analysis.function.Sigmoid", "hi", 0.0);
        setField(pegasusSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "function", function);
        
        double actual = pegasusSolver.doSolve();
        
        assertEquals(1.3560514560001589E10, actual, 1.0E-6);
        
        Incrementor pegasusSolverEvaluations = ((Incrementor) getFieldValue(pegasusSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "evaluations"));
        int finalPegasusSolverEvaluationsCount = ((Integer) getFieldValue(pegasusSolverEvaluations, "org.apache.commons.math.util.Incrementor", "count"));
        
        org.junit.Assert.assertEquals(877793276, finalPegasusSolverEvaluationsCount);
    }
    
    @Test
    public void testDoSolve2() throws Exception  {
        RegulaFalsiSolver regulaFalsiSolver = ((RegulaFalsiSolver) createInstance("org.apache.commons.math.analysis.solvers.RegulaFalsiSolver"));
        Incrementor evaluations = ((Incrementor) createInstance("org.apache.commons.math.util.Incrementor"));
        evaluations.setMaximalCount(1879048192);
        setField(evaluations, "org.apache.commons.math.util.Incrementor", "count", 1811890111);
        setField(regulaFalsiSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "evaluations", evaluations);
        setField(regulaFalsiSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "searchMin", java.lang.Double.POSITIVE_INFINITY);
        setField(regulaFalsiSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "searchMax", 710.5050242553015);
        Sigmoid function = ((Sigmoid) createInstance("org.apache.commons.math.analysis.function.Sigmoid"));
        setField(function, "org.apache.commons.math.analysis.function.Sigmoid", "lo", 0.0);
        setField(function, "org.apache.commons.math.analysis.function.Sigmoid", "hi", 0.0);
        setField(regulaFalsiSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "function", function);
        
        double actual = regulaFalsiSolver.doSolve();
        
        assertEquals(java.lang.Double.POSITIVE_INFINITY, actual, 1.0E-6);
        
        Incrementor regulaFalsiSolverEvaluations = ((Incrementor) getFieldValue(regulaFalsiSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "evaluations"));
        int finalRegulaFalsiSolverEvaluationsCount = ((Integer) getFieldValue(regulaFalsiSolverEvaluations, "org.apache.commons.math.util.Incrementor", "count"));
        
        org.junit.Assert.assertEquals(1811890113, finalRegulaFalsiSolverEvaluationsCount);
    }
    
    @Test
    public void testDoSolve3() throws Exception  {
        RegulaFalsiSolver regulaFalsiSolver = ((RegulaFalsiSolver) createInstance("org.apache.commons.math.analysis.solvers.RegulaFalsiSolver"));
        Incrementor evaluations = ((Incrementor) createInstance("org.apache.commons.math.util.Incrementor"));
        evaluations.setMaximalCount(1073741824);
        setField(evaluations, "org.apache.commons.math.util.Incrementor", "count", 655753193);
        setField(regulaFalsiSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "evaluations", evaluations);
        setField(regulaFalsiSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "searchMin", 5886.250310684367);
        setField(regulaFalsiSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "searchMax", -130784.50195503754);
        Sigmoid function = ((Sigmoid) createInstance("org.apache.commons.math.analysis.function.Sigmoid"));
        setField(function, "org.apache.commons.math.analysis.function.Sigmoid", "lo", 0.0);
        setField(function, "org.apache.commons.math.analysis.function.Sigmoid", "hi", 0.0);
        setField(regulaFalsiSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "function", function);
        
        double actual = regulaFalsiSolver.doSolve();
        
        assertEquals(5886.250310684367, actual, 1.0E-6);
        
        Incrementor regulaFalsiSolverEvaluations = ((Incrementor) getFieldValue(regulaFalsiSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "evaluations"));
        int finalRegulaFalsiSolverEvaluationsCount = ((Integer) getFieldValue(regulaFalsiSolverEvaluations, "org.apache.commons.math.util.Incrementor", "count"));
        
        org.junit.Assert.assertEquals(655753195, finalRegulaFalsiSolverEvaluationsCount);
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method doSolve()
    
    @Test(expected = NoBracketingException.class)
    public void testDoSolve4() throws Exception  {
        IllinoisSolver illinoisSolver = ((IllinoisSolver) createInstance("org.apache.commons.math.analysis.solvers.IllinoisSolver"));
        Incrementor evaluations = ((Incrementor) createInstance("org.apache.commons.math.util.Incrementor"));
        evaluations.setMaximalCount(-939524096);
        setField(evaluations, "org.apache.commons.math.util.Incrementor", "count", -945815935);
        setField(illinoisSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "evaluations", evaluations);
        setField(illinoisSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "searchMin", -5.980082166547529E197);
        setField(illinoisSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "searchMax", 0.0);
        Sigmoid function = ((Sigmoid) createInstance("org.apache.commons.math.analysis.function.Sigmoid"));
        setField(function, "org.apache.commons.math.analysis.function.Sigmoid", "lo", java.lang.Double.NaN);
        setField(function, "org.apache.commons.math.analysis.function.Sigmoid", "hi", java.lang.Double.NaN);
        setField(illinoisSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "function", function);
        
        illinoisSolver.doSolve();
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
        
                java.lang.reflect.Method methodForGetDeclaredFields731515898136400 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields731515898136400.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass731515898144900 = (java.lang.reflect.Field[]) methodForGetDeclaredFields731515898136400.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass731515898144900).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields731515898700500 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields731515898700500.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass731515898704800 = (java.lang.reflect.Field[]) methodForGetDeclaredFields731515898700500.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass731515898704800).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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

