package org.apache.commons.math.analysis.solvers;

import org.junit.Test;
import org.apache.commons.math.util.Incrementor;
import org.apache.commons.math.exception.TooManyEvaluationsException;
import org.apache.commons.math.analysis.function.Logit;
import org.apache.commons.math.exception.OutOfRangeException;
import org.apache.commons.math.analysis.function.Sigmoid;
import org.apache.commons.math.exception.NumberIsTooLargeException;
import org.apache.commons.math.exception.NullArgumentException;
import org.apache.commons.math.analysis.function.Logistic;
import org.apache.commons.math.analysis.UnivariateRealFunction;
import org.apache.commons.math.exception.NoBracketingException;
import org.apache.commons.math.analysis.function.Gaussian;
import org.apache.commons.math.analysis.polynomials.PolynomialFunctionNewtonForm;
import org.apache.commons.math.analysis.function.Rint;
import org.apache.commons.math.analysis.function.Identity;
import org.apache.commons.math.analysis.function.Cosh;
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
        setField(pegasusSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "searchMin", -3.337610787760802E-308);
        setField(pegasusSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "searchMax", 0.0);
        Logit function = ((Logit) createInstance("org.apache.commons.math.analysis.function.Logit"));
        setField(function, "org.apache.commons.math.analysis.function.Logit", "lo", 4.9E-324);
        setField(function, "org.apache.commons.math.analysis.function.Logit", "hi", 0.0);
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
        RegulaFalsiSolver regulaFalsiSolver = ((RegulaFalsiSolver) createInstance("org.apache.commons.math.analysis.solvers.RegulaFalsiSolver"));
        Incrementor evaluations = ((Incrementor) createInstance("org.apache.commons.math.util.Incrementor"));
        evaluations.setMaximalCount(Integer.MIN_VALUE);
        setField(evaluations, "org.apache.commons.math.util.Incrementor", "count", Integer.MAX_VALUE);
        setField(regulaFalsiSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "evaluations", evaluations);
        setField(regulaFalsiSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "searchMin", 9.263367174572425E77);
        setField(regulaFalsiSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "searchMax", 0.0);
        Logit function = ((Logit) createInstance("org.apache.commons.math.analysis.function.Logit"));
        setField(function, "org.apache.commons.math.analysis.function.Logit", "lo", 9.263367174572425E77);
        setField(function, "org.apache.commons.math.analysis.function.Logit", "hi", -7.571534020554965E-270);
        setField(regulaFalsiSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "function", function);
        
        regulaFalsiSolver.doSolve();
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
        evaluations.setMaximalCount(Integer.MIN_VALUE);
        setField(evaluations, "org.apache.commons.math.util.Incrementor", "count", Integer.MAX_VALUE);
        setField(illinoisSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "evaluations", evaluations);
        setField(illinoisSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "searchMin", 747.6889648438082);
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
        PegasusSolver pegasusSolver = ((PegasusSolver) createInstance("org.apache.commons.math.analysis.solvers.PegasusSolver"));
        Incrementor evaluations = ((Incrementor) createInstance("org.apache.commons.math.util.Incrementor"));
        evaluations.setMaximalCount(Integer.MIN_VALUE);
        setField(evaluations, "org.apache.commons.math.util.Incrementor", "count", Integer.MAX_VALUE);
        setField(pegasusSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "evaluations", evaluations);
        setField(pegasusSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "searchMin", -4.403625984E9);
        setField(pegasusSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "searchMax", 0.0);
        Sigmoid function = ((Sigmoid) createInstance("org.apache.commons.math.analysis.function.Sigmoid"));
        setField(function, "org.apache.commons.math.analysis.function.Sigmoid", "lo", 0.0);
        setField(function, "org.apache.commons.math.analysis.function.Sigmoid", "hi", 0.0);
        setField(pegasusSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "function", function);
        
        pegasusSolver.doSolve();
    }
    ///endregion
    
    ///region FUZZER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method doSolve()
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.math.analysis.solvers.BaseSecantSolver}
     * @utbot.methodUnderTest {@link org.apache.commons.math.analysis.solvers.BaseSecantSolver#doSolve()}
     */
    @Test(expected = TooManyEvaluationsException.class)
    public void testDoSolveThrowsTMEE() {
        IllinoisSolver illinoisSolver = new IllinoisSolver(-1.000030517578125);
        
        illinoisSolver.doSolve();
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method doSolve()
    
    @Test
    public void testDoSolve1() throws Exception  {
        PegasusSolver pegasusSolver = ((PegasusSolver) createInstance("org.apache.commons.math.analysis.solvers.PegasusSolver"));
        Incrementor evaluations = ((Incrementor) createInstance("org.apache.commons.math.util.Incrementor"));
        evaluations.setMaximalCount(536870912);
        setField(evaluations, "org.apache.commons.math.util.Incrementor", "count", 277885170);
        setField(pegasusSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "evaluations", evaluations);
        setField(pegasusSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "searchMin", -7.398569982742934E19);
        setField(pegasusSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "searchMax", 712.0000000122164);
        Sigmoid function = ((Sigmoid) createInstance("org.apache.commons.math.analysis.function.Sigmoid"));
        setField(function, "org.apache.commons.math.analysis.function.Sigmoid", "lo", 0.0);
        setField(function, "org.apache.commons.math.analysis.function.Sigmoid", "hi", 0.0);
        setField(pegasusSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "function", function);
        
        double actual = pegasusSolver.doSolve();
        
        assertEquals(-7.398569982742934E19, actual, 1.0E-6);
        
        Incrementor pegasusSolverEvaluations = ((Incrementor) getFieldValue(pegasusSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "evaluations"));
        int finalPegasusSolverEvaluationsCount = ((Integer) getFieldValue(pegasusSolverEvaluations, "org.apache.commons.math.util.Incrementor", "count"));
        
        org.junit.Assert.assertEquals(277885172, finalPegasusSolverEvaluationsCount);
    }
    
    @Test
    public void testDoSolve2() throws Exception  {
        IllinoisSolver illinoisSolver = ((IllinoisSolver) createInstance("org.apache.commons.math.analysis.solvers.IllinoisSolver"));
        Incrementor evaluations = ((Incrementor) createInstance("org.apache.commons.math.util.Incrementor"));
        setField(evaluations, "org.apache.commons.math.util.Incrementor", "count", -704645123);
        setField(illinoisSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "evaluations", evaluations);
        setField(illinoisSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "searchMin", -4.294967296001957E9);
        setField(illinoisSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "searchMax", 709.2779689787036);
        Sigmoid function = ((Sigmoid) createInstance("org.apache.commons.math.analysis.function.Sigmoid"));
        setField(function, "org.apache.commons.math.analysis.function.Sigmoid", "lo", 0.0);
        setField(function, "org.apache.commons.math.analysis.function.Sigmoid", "hi", 0.0);
        setField(illinoisSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "function", function);
        
        double actual = illinoisSolver.doSolve();
        
        assertEquals(-4.294967296001957E9, actual, 1.0E-6);
        
        Incrementor illinoisSolverEvaluations = ((Incrementor) getFieldValue(illinoisSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "evaluations"));
        int finalIllinoisSolverEvaluationsCount = ((Integer) getFieldValue(illinoisSolverEvaluations, "org.apache.commons.math.util.Incrementor", "count"));
        
        org.junit.Assert.assertEquals(-704645121, finalIllinoisSolverEvaluationsCount);
    }
    
    @Test
    public void testDoSolve3() throws Exception  {
        IllinoisSolver illinoisSolver = ((IllinoisSolver) createInstance("org.apache.commons.math.analysis.solvers.IllinoisSolver"));
        Incrementor evaluations = ((Incrementor) createInstance("org.apache.commons.math.util.Incrementor"));
        setField(evaluations, "org.apache.commons.math.util.Incrementor", "count", -37765454);
        setField(illinoisSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "evaluations", evaluations);
        setField(illinoisSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "searchMin", -4.295229956039679E9);
        setField(illinoisSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "searchMax", 4510.039063483492);
        Sigmoid function = ((Sigmoid) createInstance("org.apache.commons.math.analysis.function.Sigmoid"));
        setField(function, "org.apache.commons.math.analysis.function.Sigmoid", "lo", 0.0);
        setField(function, "org.apache.commons.math.analysis.function.Sigmoid", "hi", 0.0);
        setField(illinoisSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "function", function);
        
        double actual = illinoisSolver.doSolve();
        
        assertEquals(-4.295229956039679E9, actual, 1.0E-6);
        
        Incrementor illinoisSolverEvaluations = ((Incrementor) getFieldValue(illinoisSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "evaluations"));
        int finalIllinoisSolverEvaluationsCount = ((Integer) getFieldValue(illinoisSolverEvaluations, "org.apache.commons.math.util.Incrementor", "count"));
        
        org.junit.Assert.assertEquals(-37765452, finalIllinoisSolverEvaluationsCount);
    }
    
    @Test
    public void testDoSolve4() throws Exception  {
        RegulaFalsiSolver regulaFalsiSolver = ((RegulaFalsiSolver) createInstance("org.apache.commons.math.analysis.solvers.RegulaFalsiSolver"));
        Incrementor evaluations = ((Incrementor) createInstance("org.apache.commons.math.util.Incrementor"));
        evaluations.setMaximalCount(134217728);
        setField(evaluations, "org.apache.commons.math.util.Incrementor", "count", 133942382);
        setField(regulaFalsiSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "evaluations", evaluations);
        setField(regulaFalsiSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "searchMin", -6.798426050059433E8);
        setField(regulaFalsiSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "searchMax", -785.5337394299099);
        Sigmoid function = ((Sigmoid) createInstance("org.apache.commons.math.analysis.function.Sigmoid"));
        setField(function, "org.apache.commons.math.analysis.function.Sigmoid", "lo", 0.0);
        setField(function, "org.apache.commons.math.analysis.function.Sigmoid", "hi", 0.0);
        setField(regulaFalsiSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "function", function);
        
        double actual = regulaFalsiSolver.doSolve();
        
        assertEquals(-6.798426050059433E8, actual, 1.0E-6);
        
        Incrementor regulaFalsiSolverEvaluations = ((Incrementor) getFieldValue(regulaFalsiSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "evaluations"));
        int finalRegulaFalsiSolverEvaluationsCount = ((Integer) getFieldValue(regulaFalsiSolverEvaluations, "org.apache.commons.math.util.Incrementor", "count"));
        
        org.junit.Assert.assertEquals(133942384, finalRegulaFalsiSolverEvaluationsCount);
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method doSolve()
    
    @Test(expected = NumberIsTooLargeException.class)
    public void testDoSolve5() throws Exception  {
        PegasusSolver pegasusSolver = ((PegasusSolver) createInstance("org.apache.commons.math.analysis.solvers.PegasusSolver"));
        Incrementor evaluations = ((Incrementor) createInstance("org.apache.commons.math.util.Incrementor"));
        setField(evaluations, "org.apache.commons.math.util.Incrementor", "count", -2);
        setField(pegasusSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "evaluations", evaluations);
        setField(pegasusSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "searchMin", 8.5983232E9);
        setField(pegasusSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "searchMax", 0.0);
        Sigmoid function = ((Sigmoid) createInstance("org.apache.commons.math.analysis.function.Sigmoid"));
        setField(function, "org.apache.commons.math.analysis.function.Sigmoid", "lo", java.lang.Double.NaN);
        setField(function, "org.apache.commons.math.analysis.function.Sigmoid", "hi", java.lang.Double.NaN);
        setField(pegasusSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "function", function);
        
        pegasusSolver.doSolve();
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
        Logistic logistic = ((Logistic) createInstance("org.apache.commons.math.analysis.function.Logistic"));
        
        regulaFalsiSolver.solve(0, logistic, java.lang.Double.NaN, java.lang.Double.NaN, java.lang.Double.NaN, null);
    }
    
    /**
    @utbot.classUnderTest {@link BaseSecantSolver}
 * @utbot.methodUnderTest {@link org.apache.commons.math.analysis.solvers.BaseSecantSolver#solve(int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double,double,org.apache.commons.math.analysis.solvers.AllowedSolution)}
 * @utbot.throwsException {@link org.apache.commons.math.exception.OutOfRangeException} in: return super.solve(maxEval, f, min, max, startValue);
 *  */
    @Test(expected = OutOfRangeException.class)
    public void testSolve_ThrowOutOfRangeException() throws Exception  {
        PegasusSolver pegasusSolver = ((PegasusSolver) createInstance("org.apache.commons.math.analysis.solvers.PegasusSolver"));
        Incrementor evaluations = ((Incrementor) createInstance("org.apache.commons.math.util.Incrementor"));
        setField(pegasusSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "evaluations", evaluations);
        setField(pegasusSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "searchMin", 0.0);
        setField(pegasusSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "searchMax", 0.0);
        setField(pegasusSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "searchStart", 0.0);
        Logit logit = new Logit(2.484029229919867E232, -1.4821389106402585E79);
        
        pegasusSolver.solve(1, logit, 2.484029229919867E232, java.lang.Double.NaN, java.lang.Double.NaN, null);
    }
    
    /**
    @utbot.classUnderTest {@link BaseSecantSolver}
 * @utbot.methodUnderTest {@link org.apache.commons.math.analysis.solvers.BaseSecantSolver#solve(int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double,double,org.apache.commons.math.analysis.solvers.AllowedSolution)}
 * @utbot.throwsException {@link org.apache.commons.math.exception.OutOfRangeException} in: return super.solve(maxEval, f, min, max, startValue);
 *  */
    @Test(expected = OutOfRangeException.class)
    public void testSolve_ThrowOutOfRangeException_1() throws Exception  {
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
    public void testSolve_ThrowTooManyEvaluationsException_1() throws Exception  {
        PegasusSolver pegasusSolver = ((PegasusSolver) createInstance("org.apache.commons.math.analysis.solvers.PegasusSolver"));
        Incrementor evaluations = ((Incrementor) createInstance("org.apache.commons.math.util.Incrementor"));
        setField(pegasusSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "evaluations", evaluations);
        setField(pegasusSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "searchMin", 0.0);
        setField(pegasusSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "searchMax", 0.0);
        setField(pegasusSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "searchStart", 0.0);
        Sigmoid sigmoid = new Sigmoid(0.0, 0.0);
        
        pegasusSolver.solve(1, sigmoid, -8.589934600082031E9, java.lang.Double.NaN, java.lang.Double.NaN, null);
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
        
        regulaFalsiSolver.solve(1, sigmoid, 747.0, java.lang.Double.NaN, java.lang.Double.NaN, null);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method solve(int, org.apache.commons.math.analysis.UnivariateRealFunction, double, double, double, org.apache.commons.math.analysis.solvers.AllowedSolution)
    
    @Test
    public void testSolve1() throws Exception  {
        RegulaFalsiSolver regulaFalsiSolver = ((RegulaFalsiSolver) createInstance("org.apache.commons.math.analysis.solvers.RegulaFalsiSolver"));
        AllowedSolution allowed = AllowedSolution.LEFT_SIDE;
        setField(regulaFalsiSolver, "org.apache.commons.math.analysis.solvers.BaseSecantSolver", "allowed", allowed);
        Incrementor evaluations = ((Incrementor) createInstance("org.apache.commons.math.util.Incrementor"));
        setField(regulaFalsiSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "evaluations", evaluations);
        setField(regulaFalsiSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "searchMin", 0.0);
        setField(regulaFalsiSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "searchMax", 0.0);
        setField(regulaFalsiSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "searchStart", 0.0);
        Sigmoid sigmoid = new Sigmoid(0.0, 0.0);
        AllowedSolution allowedSolution = AllowedSolution.ABOVE_SIDE;
        
        AllowedSolution initialRegulaFalsiSolverAllowed = ((AllowedSolution) getFieldValue(regulaFalsiSolver, "org.apache.commons.math.analysis.solvers.BaseSecantSolver", "allowed"));
        UnivariateRealFunction initialRegulaFalsiSolverFunction = ((UnivariateRealFunction) getFieldValue(regulaFalsiSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "function"));
        
        double actual = regulaFalsiSolver.solve(1073741824, sigmoid, 2.6133695644892662E41, 722.0313262939453, java.lang.Double.NaN, allowedSolution);
        
        assertEquals(2.6133695644892662E41, actual, 1.0E-6);
        
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
        
        assertEquals(2.6133695644892662E41, finalRegulaFalsiSolverSearchMin, 1.0E-6);
        
        assertEquals(722.0313262939453, finalRegulaFalsiSolverSearchMax, 1.0E-6);
        
        assertEquals(java.lang.Double.NaN, finalRegulaFalsiSolverSearchStart, 1.0E-6);
    }
    
    @Test
    public void testSolve2() throws Exception  {
        RegulaFalsiSolver regulaFalsiSolver = ((RegulaFalsiSolver) createInstance("org.apache.commons.math.analysis.solvers.RegulaFalsiSolver"));
        AllowedSolution allowed = AllowedSolution.LEFT_SIDE;
        setField(regulaFalsiSolver, "org.apache.commons.math.analysis.solvers.BaseSecantSolver", "allowed", allowed);
        Incrementor evaluations = ((Incrementor) createInstance("org.apache.commons.math.util.Incrementor"));
        setField(regulaFalsiSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "evaluations", evaluations);
        setField(regulaFalsiSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "searchMin", 0.0);
        setField(regulaFalsiSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "searchMax", 0.0);
        setField(regulaFalsiSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "searchStart", 0.0);
        Sigmoid sigmoid = new Sigmoid(0.0, 0.0);
        AllowedSolution allowedSolution = AllowedSolution.ABOVE_SIDE;
        
        AllowedSolution initialRegulaFalsiSolverAllowed = ((AllowedSolution) getFieldValue(regulaFalsiSolver, "org.apache.commons.math.analysis.solvers.BaseSecantSolver", "allowed"));
        UnivariateRealFunction initialRegulaFalsiSolverFunction = ((UnivariateRealFunction) getFieldValue(regulaFalsiSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "function"));
        
        double actual = regulaFalsiSolver.solve(1073741824, sigmoid, 6.443500118054686E9, -1.5623989385839787E144, java.lang.Double.NaN, allowedSolution);
        
        assertEquals(6.443500118054686E9, actual, 1.0E-6);
        
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
        
        assertEquals(6.443500118054686E9, finalRegulaFalsiSolverSearchMin, 1.0E-6);
        
        assertEquals(-1.5623989385839787E144, finalRegulaFalsiSolverSearchMax, 1.0E-6);
        
        assertEquals(java.lang.Double.NaN, finalRegulaFalsiSolverSearchStart, 1.0E-6);
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method solve(int, org.apache.commons.math.analysis.UnivariateRealFunction, double, double, double, org.apache.commons.math.analysis.solvers.AllowedSolution)
    
    @Test(expected = NoBracketingException.class)
    public void testSolve3() throws Exception  {
        IllinoisSolver illinoisSolver = ((IllinoisSolver) createInstance("org.apache.commons.math.analysis.solvers.IllinoisSolver"));
        Incrementor evaluations = ((Incrementor) createInstance("org.apache.commons.math.util.Incrementor"));
        setField(illinoisSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "evaluations", evaluations);
        setField(illinoisSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "searchMin", 0.0);
        setField(illinoisSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "searchMax", 0.0);
        setField(illinoisSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "searchStart", 0.0);
        Sigmoid sigmoid = new Sigmoid(java.lang.Double.NaN, java.lang.Double.NaN);
        AllowedSolution allowedSolution = AllowedSolution.ABOVE_SIDE;
        
        illinoisSolver.solve(1073741824, sigmoid, java.lang.Double.NEGATIVE_INFINITY, java.lang.Double.NaN, java.lang.Double.NaN, allowedSolution);
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
 * @utbot.throwsException {@link org.apache.commons.math.exception.TooManyEvaluationsException} 
 *  */
    @Test(expected = TooManyEvaluationsException.class)
    public void testSolve_ThrowTooManyEvaluationsException_11() throws Exception  {
        IllinoisSolver illinoisSolver = ((IllinoisSolver) createInstance("org.apache.commons.math.analysis.solvers.IllinoisSolver"));
        Incrementor evaluations = ((Incrementor) createInstance("org.apache.commons.math.util.Incrementor"));
        setField(illinoisSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "evaluations", evaluations);
        setField(illinoisSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "searchMin", 0.0);
        setField(illinoisSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "searchMax", 0.0);
        setField(illinoisSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "searchStart", 0.0);
        PolynomialFunctionNewtonForm function = ((PolynomialFunctionNewtonForm) createInstance("org.apache.commons.math.analysis.polynomials.PolynomialFunctionNewtonForm"));
        setField(illinoisSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "function", function);
        Sigmoid sigmoid = new Sigmoid(0.0, 0.0);
        
        illinoisSolver.solve(1, ((UnivariateRealFunction) sigmoid), -8.589934594949219E9, java.lang.Double.NaN, java.lang.Double.NaN);
    }
    
    /**
    @utbot.classUnderTest {@link BaseSecantSolver}
 * @utbot.methodUnderTest {@link org.apache.commons.math.analysis.solvers.BaseSecantSolver#solve(int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double,double)}
 * @utbot.throwsException {@link org.apache.commons.math.exception.OutOfRangeException} 
 *  */
    @Test(expected = OutOfRangeException.class)
    public void testSolve_ThrowOutOfRangeException1() throws Exception  {
        RegulaFalsiSolver regulaFalsiSolver = ((RegulaFalsiSolver) createInstance("org.apache.commons.math.analysis.solvers.RegulaFalsiSolver"));
        Incrementor evaluations = ((Incrementor) createInstance("org.apache.commons.math.util.Incrementor"));
        setField(regulaFalsiSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "evaluations", evaluations);
        setField(regulaFalsiSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "searchMin", 0.0);
        setField(regulaFalsiSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "searchMax", 0.0);
        setField(regulaFalsiSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "searchStart", 0.0);
        Logit logit = new Logit(1.872784840616008E-96, 0.0);
        
        regulaFalsiSolver.solve(1, ((UnivariateRealFunction) logit), -4.0217748214451625E-87, java.lang.Double.NaN, java.lang.Double.NaN);
    }
    
    /**
    @utbot.classUnderTest {@link BaseSecantSolver}
 * @utbot.methodUnderTest {@link org.apache.commons.math.analysis.solvers.BaseSecantSolver#solve(int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double,double)}
 * @utbot.throwsException {@link org.apache.commons.math.exception.OutOfRangeException} 
 *  */
    @Test(expected = OutOfRangeException.class)
    public void testSolve_ThrowOutOfRangeException_11() throws Exception  {
        RegulaFalsiSolver regulaFalsiSolver = ((RegulaFalsiSolver) createInstance("org.apache.commons.math.analysis.solvers.RegulaFalsiSolver"));
        Incrementor evaluations = ((Incrementor) createInstance("org.apache.commons.math.util.Incrementor"));
        setField(regulaFalsiSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "evaluations", evaluations);
        setField(regulaFalsiSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "searchMin", 0.0);
        setField(regulaFalsiSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "searchMax", 0.0);
        setField(regulaFalsiSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "searchStart", 0.0);
        Logit logit = new Logit(5.03215287515629E-234, -3.931369433715853E-236);
        
        regulaFalsiSolver.solve(1, ((UnivariateRealFunction) logit), 5.03215287515629E-234, java.lang.Double.NaN, java.lang.Double.NaN);
    }
    
    /**
    @utbot.classUnderTest {@link BaseSecantSolver}
 * @utbot.methodUnderTest {@link org.apache.commons.math.analysis.solvers.BaseSecantSolver#solve(int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double,double)}
 * @utbot.throwsException {@link org.apache.commons.math.exception.TooManyEvaluationsException} 
 *  */
    @Test(expected = TooManyEvaluationsException.class)
    public void testSolve_ThrowTooManyEvaluationsException_21() throws Exception  {
        PegasusSolver pegasusSolver = ((PegasusSolver) createInstance("org.apache.commons.math.analysis.solvers.PegasusSolver"));
        Incrementor evaluations = ((Incrementor) createInstance("org.apache.commons.math.util.Incrementor"));
        setField(pegasusSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "evaluations", evaluations);
        setField(pegasusSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "searchMin", 0.0);
        setField(pegasusSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "searchMax", 0.0);
        setField(pegasusSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "searchStart", 0.0);
        Sigmoid sigmoid = new Sigmoid(0.0, 0.0);
        
        pegasusSolver.solve(1, ((UnivariateRealFunction) sigmoid), 747.0, java.lang.Double.NaN, java.lang.Double.NaN);
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
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method solve(int, org.apache.commons.math.analysis.UnivariateRealFunction, double, double, double)
    
    @Test
    public void testSolve4() throws Exception  {
        RegulaFalsiSolver regulaFalsiSolver = ((RegulaFalsiSolver) createInstance("org.apache.commons.math.analysis.solvers.RegulaFalsiSolver"));
        AllowedSolution allowed = AllowedSolution.BELOW_SIDE;
        setField(regulaFalsiSolver, "org.apache.commons.math.analysis.solvers.BaseSecantSolver", "allowed", allowed);
        Incrementor evaluations = ((Incrementor) createInstance("org.apache.commons.math.util.Incrementor"));
        setField(regulaFalsiSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "evaluations", evaluations);
        setField(regulaFalsiSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "searchMin", 0.0);
        setField(regulaFalsiSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "searchMax", 0.0);
        setField(regulaFalsiSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "searchStart", 0.0);
        Sigmoid sigmoid = new Sigmoid(0.0, 0.0);
        
        AllowedSolution initialRegulaFalsiSolverAllowed = ((AllowedSolution) getFieldValue(regulaFalsiSolver, "org.apache.commons.math.analysis.solvers.BaseSecantSolver", "allowed"));
        UnivariateRealFunction initialRegulaFalsiSolverFunction = ((UnivariateRealFunction) getFieldValue(regulaFalsiSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "function"));
        
        double actual = regulaFalsiSolver.solve(1073741824, ((UnivariateRealFunction) sigmoid), 1.3720080636062565E10, 709.753940600204, java.lang.Double.NaN);
        
        assertEquals(1.3720080636062565E10, actual, 1.0E-6);
        
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
        
        assertEquals(1.3720080636062565E10, finalRegulaFalsiSolverSearchMin, 1.0E-6);
        
        assertEquals(709.753940600204, finalRegulaFalsiSolverSearchMax, 1.0E-6);
        
        assertEquals(java.lang.Double.NaN, finalRegulaFalsiSolverSearchStart, 1.0E-6);
    }
    
    @Test
    public void testSolve5() throws Exception  {
        IllinoisSolver illinoisSolver = ((IllinoisSolver) createInstance("org.apache.commons.math.analysis.solvers.IllinoisSolver"));
        AllowedSolution allowed = AllowedSolution.LEFT_SIDE;
        setField(illinoisSolver, "org.apache.commons.math.analysis.solvers.BaseSecantSolver", "allowed", allowed);
        Incrementor evaluations = ((Incrementor) createInstance("org.apache.commons.math.util.Incrementor"));
        setField(illinoisSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "evaluations", evaluations);
        setField(illinoisSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "searchMin", 0.0);
        setField(illinoisSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "searchMax", 0.0);
        setField(illinoisSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "searchStart", 0.0);
        Sigmoid sigmoid = new Sigmoid(0.0, 0.0);
        
        AllowedSolution initialIllinoisSolverAllowed = ((AllowedSolution) getFieldValue(illinoisSolver, "org.apache.commons.math.analysis.solvers.BaseSecantSolver", "allowed"));
        UnivariateRealFunction initialIllinoisSolverFunction = ((UnivariateRealFunction) getFieldValue(illinoisSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "function"));
        
        double actual = illinoisSolver.solve(1073741824, ((UnivariateRealFunction) sigmoid), 7.033259434375429E156, -262856.87514949683, java.lang.Double.NaN);
        
        assertEquals(7.033259434375429E156, actual, 1.0E-6);
        
        AllowedSolution finalIllinoisSolverAllowed = ((AllowedSolution) getFieldValue(illinoisSolver, "org.apache.commons.math.analysis.solvers.BaseSecantSolver", "allowed"));
        Incrementor illinoisSolverEvaluations = ((Incrementor) getFieldValue(illinoisSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "evaluations"));
        int finalIllinoisSolverEvaluationsMaximalCount = ((Integer) getFieldValue(illinoisSolverEvaluations, "org.apache.commons.math.util.Incrementor", "maximalCount"));
        Incrementor illinoisSolverEvaluations1 = ((Incrementor) getFieldValue(illinoisSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "evaluations"));
        int finalIllinoisSolverEvaluationsCount = ((Integer) getFieldValue(illinoisSolverEvaluations1, "org.apache.commons.math.util.Incrementor", "count"));
        double finalIllinoisSolverSearchMin = ((Double) getFieldValue(illinoisSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "searchMin"));
        double finalIllinoisSolverSearchMax = ((Double) getFieldValue(illinoisSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "searchMax"));
        double finalIllinoisSolverSearchStart = ((Double) getFieldValue(illinoisSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "searchStart"));
        UnivariateRealFunction finalIllinoisSolverFunction = ((UnivariateRealFunction) getFieldValue(illinoisSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "function"));
        
        assertFalse(initialIllinoisSolverAllowed == finalIllinoisSolverAllowed);
        
        assertFalse(initialIllinoisSolverFunction == finalIllinoisSolverFunction);
        
        org.junit.Assert.assertEquals(1073741824, finalIllinoisSolverEvaluationsMaximalCount);
        
        org.junit.Assert.assertEquals(2, finalIllinoisSolverEvaluationsCount);
        
        assertEquals(7.033259434375429E156, finalIllinoisSolverSearchMin, 1.0E-6);
        
        assertEquals(-262856.87514949683, finalIllinoisSolverSearchMax, 1.0E-6);
        
        assertEquals(java.lang.Double.NaN, finalIllinoisSolverSearchStart, 1.0E-6);
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method solve(int, org.apache.commons.math.analysis.UnivariateRealFunction, double, double, double)
    
    @Test(expected = NoBracketingException.class)
    public void testSolve6() throws Exception  {
        IllinoisSolver illinoisSolver = ((IllinoisSolver) createInstance("org.apache.commons.math.analysis.solvers.IllinoisSolver"));
        Incrementor evaluations = ((Incrementor) createInstance("org.apache.commons.math.util.Incrementor"));
        setField(illinoisSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "evaluations", evaluations);
        setField(illinoisSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "searchMin", 0.0);
        setField(illinoisSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "searchMax", 0.0);
        setField(illinoisSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "searchStart", 0.0);
        Sigmoid sigmoid = new Sigmoid(java.lang.Double.NaN, java.lang.Double.NaN);
        
        illinoisSolver.solve(1073741824, ((UnivariateRealFunction) sigmoid), -1048576.0004022128, java.lang.Double.NaN, java.lang.Double.NaN);
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
    public void testSolve_ThrowTooManyEvaluationsException_22() throws Exception  {
        IllinoisSolver illinoisSolver = ((IllinoisSolver) createInstance("org.apache.commons.math.analysis.solvers.IllinoisSolver"));
        AllowedSolution allowed = AllowedSolution.ANY_SIDE;
        setField(illinoisSolver, "org.apache.commons.math.analysis.solvers.BaseSecantSolver", "allowed", allowed);
        Incrementor evaluations = ((Incrementor) createInstance("org.apache.commons.math.util.Incrementor"));
        setField(illinoisSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "evaluations", evaluations);
        setField(illinoisSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "searchMin", 0.0);
        setField(illinoisSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "searchMax", 0.0);
        setField(illinoisSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "searchStart", 0.0);
        Identity function = ((Identity) createInstance("org.apache.commons.math.analysis.function.Identity"));
        setField(illinoisSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "function", function);
        Sigmoid sigmoid = new Sigmoid(0.0, 0.0);
        
        illinoisSolver.solve(1, ((UnivariateRealFunction) sigmoid), -2.282836001196793E9, java.lang.Double.NaN, ((AllowedSolution) null));
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
        UnivariateRealFunction function = ((UnivariateRealFunction) createInstance("org.apache.commons.math.ode.events.EventState$1"));
        setField(pegasusSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "function", function);
        Logit logit = new Logit(1.344225465142985E-51, -6.813284506590117E-52);
        
        pegasusSolver.solve(1, ((UnivariateRealFunction) logit), 1.344225465142985E-51, java.lang.Double.NaN, ((AllowedSolution) null));
    }
    
    /**
    @utbot.classUnderTest {@link BaseSecantSolver}
 * @utbot.methodUnderTest {@link org.apache.commons.math.analysis.solvers.BaseSecantSolver#solve(int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double,org.apache.commons.math.analysis.solvers.AllowedSolution)}
 * @utbot.throwsException {@link org.apache.commons.math.exception.TooManyEvaluationsException} 
 *  */
    @Test(expected = TooManyEvaluationsException.class)
    public void testSolve_ThrowTooManyEvaluationsException_12() throws Exception  {
        RegulaFalsiSolver regulaFalsiSolver = ((RegulaFalsiSolver) createInstance("org.apache.commons.math.analysis.solvers.RegulaFalsiSolver"));
        AllowedSolution allowed = AllowedSolution.BELOW_SIDE;
        setField(regulaFalsiSolver, "org.apache.commons.math.analysis.solvers.BaseSecantSolver", "allowed", allowed);
        Incrementor evaluations = ((Incrementor) createInstance("org.apache.commons.math.util.Incrementor"));
        setField(regulaFalsiSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "evaluations", evaluations);
        setField(regulaFalsiSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "searchMin", 0.0);
        setField(regulaFalsiSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "searchMax", 0.0);
        setField(regulaFalsiSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "searchStart", 0.0);
        Sigmoid sigmoid = new Sigmoid(0.0, 0.0);
        
        regulaFalsiSolver.solve(1, ((UnivariateRealFunction) sigmoid), 747.2500000000467, java.lang.Double.NaN, ((AllowedSolution) null));
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
        Logit logit = new Logit(-3.454467422037852E-77, 0.0);
        
        pegasusSolver.solve(1, ((UnivariateRealFunction) logit), -5.877471754111563E-39, java.lang.Double.NaN, ((AllowedSolution) null));
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method solve(int, org.apache.commons.math.analysis.UnivariateRealFunction, double, double, org.apache.commons.math.analysis.solvers.AllowedSolution)
    
    @Test
    public void testSolve7() throws Exception  {
        PegasusSolver pegasusSolver = ((PegasusSolver) createInstance("org.apache.commons.math.analysis.solvers.PegasusSolver"));
        AllowedSolution allowed = AllowedSolution.RIGHT_SIDE;
        setField(pegasusSolver, "org.apache.commons.math.analysis.solvers.BaseSecantSolver", "allowed", allowed);
        Incrementor evaluations = ((Incrementor) createInstance("org.apache.commons.math.util.Incrementor"));
        setField(pegasusSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "evaluations", evaluations);
        setField(pegasusSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "searchMin", 0.0);
        setField(pegasusSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "searchMax", 0.0);
        setField(pegasusSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "searchStart", 0.0);
        Sigmoid sigmoid = new Sigmoid(0.0, 0.0);
        AllowedSolution allowedSolution = AllowedSolution.ANY_SIDE;
        
        AllowedSolution initialPegasusSolverAllowed = ((AllowedSolution) getFieldValue(pegasusSolver, "org.apache.commons.math.analysis.solvers.BaseSecantSolver", "allowed"));
        UnivariateRealFunction initialPegasusSolverFunction = ((UnivariateRealFunction) getFieldValue(pegasusSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "function"));
        
        double actual = pegasusSolver.solve(1073741824, ((UnivariateRealFunction) sigmoid), 790569.0019772631, 709.0155940060522, allowedSolution);
        
        assertEquals(790569.0019772631, actual, 1.0E-6);
        
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
        
        assertEquals(790569.0019772631, finalPegasusSolverSearchMin, 1.0E-6);
        
        assertEquals(709.0155940060522, finalPegasusSolverSearchMax, 1.0E-6);
        
        assertEquals(395639.0087856346, finalPegasusSolverSearchStart, 1.0E-6);
    }
    
    @Test
    public void testSolve8() throws Exception  {
        IllinoisSolver illinoisSolver = ((IllinoisSolver) createInstance("org.apache.commons.math.analysis.solvers.IllinoisSolver"));
        Incrementor evaluations = ((Incrementor) createInstance("org.apache.commons.math.util.Incrementor"));
        setField(illinoisSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "evaluations", evaluations);
        setField(illinoisSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "searchMin", 0.0);
        setField(illinoisSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "searchMax", 0.0);
        setField(illinoisSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "searchStart", 0.0);
        Sigmoid sigmoid = new Sigmoid(0.0, 0.0);
        AllowedSolution allowedSolution = AllowedSolution.ANY_SIDE;
        
        AllowedSolution initialIllinoisSolverAllowed = ((AllowedSolution) getFieldValue(illinoisSolver, "org.apache.commons.math.analysis.solvers.BaseSecantSolver", "allowed"));
        UnivariateRealFunction initialIllinoisSolverFunction = ((UnivariateRealFunction) getFieldValue(illinoisSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "function"));
        
        double actual = illinoisSolver.solve(1073741824, ((UnivariateRealFunction) sigmoid), 4.899219332878625E9, -4840.001102448387, allowedSolution);
        
        assertEquals(4.899219332878625E9, actual, 1.0E-6);
        
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
        
        assertEquals(4.899219332878625E9, finalIllinoisSolverSearchMin, 1.0E-6);
        
        assertEquals(-4840.001102448387, finalIllinoisSolverSearchMax, 1.0E-6);
        
        assertEquals(2.449607246438761E9, finalIllinoisSolverSearchStart, 1.0E-6);
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method solve(int, org.apache.commons.math.analysis.UnivariateRealFunction, double, double, org.apache.commons.math.analysis.solvers.AllowedSolution)
    
    @Test(expected = NoBracketingException.class)
    public void testSolve9() throws Exception  {
        PegasusSolver pegasusSolver = ((PegasusSolver) createInstance("org.apache.commons.math.analysis.solvers.PegasusSolver"));
        Incrementor evaluations = ((Incrementor) createInstance("org.apache.commons.math.util.Incrementor"));
        setField(pegasusSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "evaluations", evaluations);
        setField(pegasusSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "searchMin", 0.0);
        setField(pegasusSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "searchMax", 0.0);
        setField(pegasusSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "searchStart", 0.0);
        Cosh function = ((Cosh) createInstance("org.apache.commons.math.analysis.function.Cosh"));
        setField(pegasusSolver, "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "function", function);
        Sigmoid sigmoid = new Sigmoid(java.lang.Double.NaN, java.lang.Double.NaN);
        AllowedSolution allowedSolution = AllowedSolution.LEFT_SIDE;
        
        pegasusSolver.solve(1073741824, ((UnivariateRealFunction) sigmoid), -4.1231738842205414E11, java.lang.Double.NaN, allowedSolution);
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
        
                java.lang.reflect.Method methodForGetDeclaredFields707882533607000 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields707882533607000.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass707882533614500 = (java.lang.reflect.Field[]) methodForGetDeclaredFields707882533607000.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass707882533614500).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields707882533986000 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields707882533986000.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass707882533988400 = (java.lang.reflect.Field[]) methodForGetDeclaredFields707882533986000.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass707882533988400).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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

