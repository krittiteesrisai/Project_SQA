package org.apache.commons.math.optimization.univariate;

import org.junit.Test;
import java.lang.reflect.Constructor;
import org.apache.commons.math.optimization.ConvergenceChecker;
import org.apache.commons.math.exception.MathIllegalStateException;
import org.apache.commons.math.optimization.GoalType;
import java.lang.reflect.Method;
import org.apache.commons.math.util.Incrementor;
import org.apache.commons.math.FunctionEvaluationException;
import org.apache.commons.math.analysis.polynomials.PolynomialSplineFunction;
import org.apache.commons.math.analysis.polynomials.PolynomialFunction;
import org.apache.commons.math.exception.NullArgumentException;
import org.apache.commons.math.exception.TooManyEvaluationsException;
import org.apache.commons.math.optimization.fitting.GaussianFunction;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Objects;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import java.util.HashSet;
import java.util.Arrays;
import java.lang.reflect.Array;
import java.util.Iterator;
import java.util.stream.BaseStream;

import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static java.lang.reflect.Array.get;
import static org.junit.Assert.assertFalse;

public final class org_apache_commons_math_optimization_univariate_MultiStartUnivariateRealOptimizerTest {
    ///region Test suites for executable org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer.getConvergenceChecker
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getConvergenceChecker()
    
    /**
    @utbot.classUnderTest {@link MultiStartUnivariateRealOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer#getConvergenceChecker()}
 * @utbot.invokes {@link org.apache.commons.math.optimization.univariate.BaseUnivariateRealOptimizer#getConvergenceChecker()}
 * @utbot.returnsFrom {@code return optimizer.getConvergenceChecker();}
 *  */
    @Test
    public void testGetConvergenceChecker_BaseUnivariateRealOptimizerGetConvergenceChecker() throws Exception  {
        BrentOptimizer brentOptimizer = ((BrentOptimizer) createInstance("org.apache.commons.math.optimization.univariate.BrentOptimizer"));
        Class multiStartUnivariateRealOptimizerClazz = Class.forName("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer");
        Class brentOptimizerType = Class.forName("org.apache.commons.math.optimization.univariate.BaseUnivariateRealOptimizer");
        Class intType = int.class;
        Class randomGeneratorType = Class.forName("org.apache.commons.math.random.RandomGenerator");
        Constructor multiStartUnivariateRealOptimizerConstructor = multiStartUnivariateRealOptimizerClazz.getDeclaredConstructor(brentOptimizerType, intType, randomGeneratorType);
        multiStartUnivariateRealOptimizerConstructor.setAccessible(true);
        java.lang.Object[] multiStartUnivariateRealOptimizerConstructorArguments = new java.lang.Object[3];
        multiStartUnivariateRealOptimizerConstructorArguments[0] = brentOptimizer;
        multiStartUnivariateRealOptimizerConstructorArguments[1] = 0;
        multiStartUnivariateRealOptimizerConstructorArguments[2] = ((Object) null);
        MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer = ((MultiStartUnivariateRealOptimizer) multiStartUnivariateRealOptimizerConstructor.newInstance(multiStartUnivariateRealOptimizerConstructorArguments));
        MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer1 = new MultiStartUnivariateRealOptimizer(multiStartUnivariateRealOptimizer, 0, null);
        
        ConvergenceChecker actual = multiStartUnivariateRealOptimizer1.getConvergenceChecker();
        
        assertNull(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getConvergenceChecker()
    
    /**
    @utbot.classUnderTest {@link MultiStartUnivariateRealOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer#getConvergenceChecker()}
 * @utbot.invokes {@link org.apache.commons.math.optimization.univariate.BaseUnivariateRealOptimizer#getConvergenceChecker()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return optimizer.getConvergenceChecker();
 *  */
    @Test
    public void testGetConvergenceChecker_ThrowNullPointerException() {
        MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer = new MultiStartUnivariateRealOptimizer(null, 0, null);
        
        /* This test fails because method [org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer.getConvergenceChecker] produces [java.lang.NullPointerException]
            org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer.getConvergenceChecker(MultiStartUnivariateRealOptimizer.java:89) */
        multiStartUnivariateRealOptimizer.getConvergenceChecker();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer.setConvergenceChecker
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setConvergenceChecker(org.apache.commons.math.optimization.ConvergenceChecker)
    
    /**
    @utbot.classUnderTest {@link MultiStartUnivariateRealOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer#setConvergenceChecker(org.apache.commons.math.optimization.ConvergenceChecker)}
 * @utbot.invokes {@link org.apache.commons.math.optimization.univariate.BaseUnivariateRealOptimizer#setConvergenceChecker(org.apache.commons.math.optimization.ConvergenceChecker)}
 *  */
    @Test
    public void testSetConvergenceChecker_BaseUnivariateRealOptimizerSetConvergenceChecker() throws Exception  {
        BrentOptimizer brentOptimizer = ((BrentOptimizer) createInstance("org.apache.commons.math.optimization.univariate.BrentOptimizer"));
        Class multiStartUnivariateRealOptimizerClazz = Class.forName("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer");
        Class brentOptimizerType = Class.forName("org.apache.commons.math.optimization.univariate.BaseUnivariateRealOptimizer");
        Class intType = int.class;
        Class randomGeneratorType = Class.forName("org.apache.commons.math.random.RandomGenerator");
        Constructor multiStartUnivariateRealOptimizerConstructor = multiStartUnivariateRealOptimizerClazz.getDeclaredConstructor(brentOptimizerType, intType, randomGeneratorType);
        multiStartUnivariateRealOptimizerConstructor.setAccessible(true);
        java.lang.Object[] multiStartUnivariateRealOptimizerConstructorArguments = new java.lang.Object[3];
        multiStartUnivariateRealOptimizerConstructorArguments[0] = brentOptimizer;
        multiStartUnivariateRealOptimizerConstructorArguments[1] = 0;
        multiStartUnivariateRealOptimizerConstructorArguments[2] = ((Object) null);
        MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer = ((MultiStartUnivariateRealOptimizer) multiStartUnivariateRealOptimizerConstructor.newInstance(multiStartUnivariateRealOptimizerConstructorArguments));
        MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer1 = new MultiStartUnivariateRealOptimizer(multiStartUnivariateRealOptimizer, 0, null);
        
        multiStartUnivariateRealOptimizer1.setConvergenceChecker(null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method setConvergenceChecker(org.apache.commons.math.optimization.ConvergenceChecker)
    
    /**
    @utbot.classUnderTest {@link MultiStartUnivariateRealOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer#setConvergenceChecker(org.apache.commons.math.optimization.ConvergenceChecker)}
 * @utbot.invokes {@link org.apache.commons.math.optimization.univariate.BaseUnivariateRealOptimizer#setConvergenceChecker(org.apache.commons.math.optimization.ConvergenceChecker)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: optimizer.setConvergenceChecker(checker);
 *  */
    @Test
    public void testSetConvergenceChecker_ThrowNullPointerException() {
        MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer = new MultiStartUnivariateRealOptimizer(null, 0, null);
        
        /* This test fails because method [org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer.setConvergenceChecker] produces [java.lang.NullPointerException]
            org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer.setConvergenceChecker(MultiStartUnivariateRealOptimizer.java:82) */
        multiStartUnivariateRealOptimizer.setConvergenceChecker(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer.getMaxEvaluations
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getMaxEvaluations()
    
    /**
    @utbot.classUnderTest {@link MultiStartUnivariateRealOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer#getMaxEvaluations()}
 * @utbot.returnsFrom {@code return maxEvaluations;}
 *  */
    @Test
    public void testGetMaxEvaluations_ReturnMaxEvaluations() {
        MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer = new MultiStartUnivariateRealOptimizer(null, 0, null);
        multiStartUnivariateRealOptimizer.setMaxEvaluations(-255);
        
        int actual = multiStartUnivariateRealOptimizer.getMaxEvaluations();
        
        assertEquals(-255, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer.getOptima
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getOptima()
    
    /**
    @utbot.classUnderTest {@link MultiStartUnivariateRealOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer#getOptima()}
 * @utbot.executesCondition {@code (optima == null): False}
 * @utbot.invokes {@link java.lang.Object#clone()}
 * @utbot.returnsFrom {@code return optima.clone();}
 *  */
    @Test
    public void testGetOptima_OptimaNotEqualsNull() throws Exception  {
        MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer = ((MultiStartUnivariateRealOptimizer) createInstance("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer"));
        org.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair[] optima = {};
        setField(multiStartUnivariateRealOptimizer, "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optima", optima);
        
        org.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair[] actual = multiStartUnivariateRealOptimizer.getOptima();
        
        org.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair[] expected = {};
        
        int expectedSize = expected.length;
        assertEquals(expectedSize, actual.length);
        assertTrue(deepEquals(expected, actual));
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method getOptima()
    
    /**
    @utbot.classUnderTest {@link MultiStartUnivariateRealOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer#getOptima()}
 * @utbot.executesCondition {@code (optima == null): True}
 * @utbot.throwsException {@link org.apache.commons.math.exception.MathIllegalStateException} when: optima == null
 *  */
    @Test(expected = MathIllegalStateException.class)
    public void testGetOptima_ThrowMathIllegalStateException() {
        MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer = new MultiStartUnivariateRealOptimizer(null, 0, null);
        
        multiStartUnivariateRealOptimizer.getOptima();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer.sortPairs
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method sortPairs(org.apache.commons.math.optimization.GoalType)
    
    /**
    @utbot.classUnderTest {@link MultiStartUnivariateRealOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer#sortPairs(org.apache.commons.math.optimization.GoalType)}
 *  */
    @Test
    public void testSortPairs_3() throws Exception  {
        MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer = ((MultiStartUnivariateRealOptimizer) createInstance("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer"));
        org.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair[] optima = new org.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair[2];
        UnivariateRealPointValuePair univariateRealPointValuePair = ((UnivariateRealPointValuePair) createInstance("org.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair"));
        setField(univariateRealPointValuePair, "org.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair", "value", -2.225188446279914E-308);
        optima[0] = univariateRealPointValuePair;
        UnivariateRealPointValuePair univariateRealPointValuePair1 = ((UnivariateRealPointValuePair) createInstance("org.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair"));
        setField(univariateRealPointValuePair1, "org.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair", "value", 8.59037696E9);
        optima[1] = univariateRealPointValuePair1;
        setField(multiStartUnivariateRealOptimizer, "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optima", optima);
        GoalType goalType = GoalType.MINIMIZE;
        
        Class multiStartUnivariateRealOptimizerClazz = Class.forName("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer");
        Class goalTypeType = Class.forName("org.apache.commons.math.optimization.GoalType");
        Method sortPairsMethod = multiStartUnivariateRealOptimizerClazz.getDeclaredMethod("sortPairs", goalTypeType);
        sortPairsMethod.setAccessible(true);
        java.lang.Object[] sortPairsMethodArguments = new java.lang.Object[1];
        sortPairsMethodArguments[0] = goalType;
        sortPairsMethod.invoke(multiStartUnivariateRealOptimizer, sortPairsMethodArguments);
    }
    
    /**
    @utbot.classUnderTest {@link MultiStartUnivariateRealOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer#sortPairs(org.apache.commons.math.optimization.GoalType)}
 *  */
    @Test
    public void testSortPairs() throws Exception  {
        MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer = ((MultiStartUnivariateRealOptimizer) createInstance("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer"));
        org.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair[] optima = {null};
        setField(multiStartUnivariateRealOptimizer, "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optima", optima);
        
        Class multiStartUnivariateRealOptimizerClazz = Class.forName("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer");
        Class goalTypeType = Class.forName("org.apache.commons.math.optimization.GoalType");
        Method sortPairsMethod = multiStartUnivariateRealOptimizerClazz.getDeclaredMethod("sortPairs", goalTypeType);
        sortPairsMethod.setAccessible(true);
        java.lang.Object[] sortPairsMethodArguments = new java.lang.Object[1];
        sortPairsMethodArguments[0] = ((Object) null);
        sortPairsMethod.invoke(multiStartUnivariateRealOptimizer, sortPairsMethodArguments);
        
        org.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair[] multiStartUnivariateRealOptimizerOptima = ((org.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair[]) getFieldValue(multiStartUnivariateRealOptimizer, "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optima"));
        UnivariateRealPointValuePair finalMultiStartUnivariateRealOptimizerOptima0 = ((UnivariateRealPointValuePair) get(multiStartUnivariateRealOptimizerOptima, 0));
        
        assertNull(finalMultiStartUnivariateRealOptimizerOptima0);
    }
    
    /**
    @utbot.classUnderTest {@link MultiStartUnivariateRealOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer#sortPairs(org.apache.commons.math.optimization.GoalType)}
 *  */
    @Test
    public void testSortPairs_1() throws Exception  {
        MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer = ((MultiStartUnivariateRealOptimizer) createInstance("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer"));
        org.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair[] optima = new org.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair[2];
        UnivariateRealPointValuePair univariateRealPointValuePair = ((UnivariateRealPointValuePair) createInstance("org.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair"));
        optima[0] = univariateRealPointValuePair;
        setField(multiStartUnivariateRealOptimizer, "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optima", optima);
        
        Class multiStartUnivariateRealOptimizerClazz = Class.forName("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer");
        Class goalTypeType = Class.forName("org.apache.commons.math.optimization.GoalType");
        Method sortPairsMethod = multiStartUnivariateRealOptimizerClazz.getDeclaredMethod("sortPairs", goalTypeType);
        sortPairsMethod.setAccessible(true);
        java.lang.Object[] sortPairsMethodArguments = new java.lang.Object[1];
        sortPairsMethodArguments[0] = ((Object) null);
        sortPairsMethod.invoke(multiStartUnivariateRealOptimizer, sortPairsMethodArguments);
        
        org.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair[] multiStartUnivariateRealOptimizerOptima = ((org.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair[]) getFieldValue(multiStartUnivariateRealOptimizer, "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optima"));
        UnivariateRealPointValuePair finalMultiStartUnivariateRealOptimizerOptima1 = ((UnivariateRealPointValuePair) get(multiStartUnivariateRealOptimizerOptima, 1));
        
        assertNull(finalMultiStartUnivariateRealOptimizerOptima1);
    }
    
    /**
    @utbot.classUnderTest {@link MultiStartUnivariateRealOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer#sortPairs(org.apache.commons.math.optimization.GoalType)}
 *  */
    @Test
    public void testSortPairs_2() throws Exception  {
        MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer = ((MultiStartUnivariateRealOptimizer) createInstance("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer"));
        org.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair[] optima = {null, null};
        setField(multiStartUnivariateRealOptimizer, "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optima", optima);
        
        Class multiStartUnivariateRealOptimizerClazz = Class.forName("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer");
        Class goalTypeType = Class.forName("org.apache.commons.math.optimization.GoalType");
        Method sortPairsMethod = multiStartUnivariateRealOptimizerClazz.getDeclaredMethod("sortPairs", goalTypeType);
        sortPairsMethod.setAccessible(true);
        java.lang.Object[] sortPairsMethodArguments = new java.lang.Object[1];
        sortPairsMethodArguments[0] = ((Object) null);
        sortPairsMethod.invoke(multiStartUnivariateRealOptimizer, sortPairsMethodArguments);
        
        org.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair[] multiStartUnivariateRealOptimizerOptima = ((org.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair[]) getFieldValue(multiStartUnivariateRealOptimizer, "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optima"));
        UnivariateRealPointValuePair finalMultiStartUnivariateRealOptimizerOptima0 = ((UnivariateRealPointValuePair) get(multiStartUnivariateRealOptimizerOptima, 0));
        org.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair[] multiStartUnivariateRealOptimizerOptima1 = ((org.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair[]) getFieldValue(multiStartUnivariateRealOptimizer, "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optima"));
        UnivariateRealPointValuePair finalMultiStartUnivariateRealOptimizerOptima1 = ((UnivariateRealPointValuePair) get(multiStartUnivariateRealOptimizerOptima1, 1));
        
        assertNull(finalMultiStartUnivariateRealOptimizerOptima0);
        
        assertNull(finalMultiStartUnivariateRealOptimizerOptima1);
    }
    
    /**
    @utbot.classUnderTest {@link MultiStartUnivariateRealOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer#sortPairs(org.apache.commons.math.optimization.GoalType)}
 *  */
    @Test
    public void testSortPairs_4() throws Exception  {
        MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer = ((MultiStartUnivariateRealOptimizer) createInstance("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer"));
        org.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair[] optima = new org.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair[2];
        UnivariateRealPointValuePair univariateRealPointValuePair = ((UnivariateRealPointValuePair) createInstance("org.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair"));
        optima[1] = univariateRealPointValuePair;
        setField(multiStartUnivariateRealOptimizer, "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optima", optima);
        
        org.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair[] multiStartUnivariateRealOptimizerOptima = ((org.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair[]) getFieldValue(multiStartUnivariateRealOptimizer, "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optima"));
        UnivariateRealPointValuePair initialMultiStartUnivariateRealOptimizerOptima0 = ((UnivariateRealPointValuePair) get(multiStartUnivariateRealOptimizerOptima, 0));
        
        Class multiStartUnivariateRealOptimizerClazz = Class.forName("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer");
        Class goalTypeType = Class.forName("org.apache.commons.math.optimization.GoalType");
        Method sortPairsMethod = multiStartUnivariateRealOptimizerClazz.getDeclaredMethod("sortPairs", goalTypeType);
        sortPairsMethod.setAccessible(true);
        java.lang.Object[] sortPairsMethodArguments = new java.lang.Object[1];
        sortPairsMethodArguments[0] = ((Object) null);
        sortPairsMethod.invoke(multiStartUnivariateRealOptimizer, sortPairsMethodArguments);
        
        org.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair[] multiStartUnivariateRealOptimizerOptima1 = ((org.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair[]) getFieldValue(multiStartUnivariateRealOptimizer, "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optima"));
        UnivariateRealPointValuePair finalMultiStartUnivariateRealOptimizerOptima0 = ((UnivariateRealPointValuePair) get(multiStartUnivariateRealOptimizerOptima1, 0));
        org.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair[] multiStartUnivariateRealOptimizerOptima2 = ((org.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair[]) getFieldValue(multiStartUnivariateRealOptimizer, "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optima"));
        UnivariateRealPointValuePair finalMultiStartUnivariateRealOptimizerOptima1 = ((UnivariateRealPointValuePair) get(multiStartUnivariateRealOptimizerOptima2, 1));
        
        assertFalse(initialMultiStartUnivariateRealOptimizerOptima0 == finalMultiStartUnivariateRealOptimizerOptima0);
        
        assertNull(finalMultiStartUnivariateRealOptimizerOptima1);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method sortPairs(org.apache.commons.math.optimization.GoalType)
    
    @Test
    public void testSortPairs1() throws Exception  {
        MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer = ((MultiStartUnivariateRealOptimizer) createInstance("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer"));
        org.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair[] optima = new org.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair[3];
        UnivariateRealPointValuePair univariateRealPointValuePair = ((UnivariateRealPointValuePair) createInstance("org.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair"));
        setField(univariateRealPointValuePair, "org.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair", "value", 2.225073858507202E-308);
        optima[1] = univariateRealPointValuePair;
        UnivariateRealPointValuePair univariateRealPointValuePair1 = ((UnivariateRealPointValuePair) createInstance("org.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair"));
        setField(univariateRealPointValuePair1, "org.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair", "value", 0.0);
        optima[2] = univariateRealPointValuePair1;
        setField(multiStartUnivariateRealOptimizer, "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optima", optima);
        GoalType goalType = GoalType.MAXIMIZE;
        
        org.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair[] multiStartUnivariateRealOptimizerOptima = ((org.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair[]) getFieldValue(multiStartUnivariateRealOptimizer, "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optima"));
        UnivariateRealPointValuePair initialMultiStartUnivariateRealOptimizerOptima0 = ((UnivariateRealPointValuePair) get(multiStartUnivariateRealOptimizerOptima, 0));
        org.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair[] multiStartUnivariateRealOptimizerOptima1 = ((org.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair[]) getFieldValue(multiStartUnivariateRealOptimizer, "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optima"));
        UnivariateRealPointValuePair initialMultiStartUnivariateRealOptimizerOptima1 = ((UnivariateRealPointValuePair) get(multiStartUnivariateRealOptimizerOptima1, 1));
        
        Class multiStartUnivariateRealOptimizerClazz = Class.forName("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer");
        Class goalTypeType = Class.forName("org.apache.commons.math.optimization.GoalType");
        Method sortPairsMethod = multiStartUnivariateRealOptimizerClazz.getDeclaredMethod("sortPairs", goalTypeType);
        sortPairsMethod.setAccessible(true);
        java.lang.Object[] sortPairsMethodArguments = new java.lang.Object[1];
        sortPairsMethodArguments[0] = goalType;
        sortPairsMethod.invoke(multiStartUnivariateRealOptimizer, sortPairsMethodArguments);
        
        org.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair[] multiStartUnivariateRealOptimizerOptima2 = ((org.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair[]) getFieldValue(multiStartUnivariateRealOptimizer, "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optima"));
        UnivariateRealPointValuePair finalMultiStartUnivariateRealOptimizerOptima0 = ((UnivariateRealPointValuePair) get(multiStartUnivariateRealOptimizerOptima2, 0));
        org.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair[] multiStartUnivariateRealOptimizerOptima3 = ((org.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair[]) getFieldValue(multiStartUnivariateRealOptimizer, "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optima"));
        UnivariateRealPointValuePair finalMultiStartUnivariateRealOptimizerOptima1 = ((UnivariateRealPointValuePair) get(multiStartUnivariateRealOptimizerOptima3, 1));
        org.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair[] multiStartUnivariateRealOptimizerOptima4 = ((org.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair[]) getFieldValue(multiStartUnivariateRealOptimizer, "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optima"));
        UnivariateRealPointValuePair finalMultiStartUnivariateRealOptimizerOptima2 = ((UnivariateRealPointValuePair) get(multiStartUnivariateRealOptimizerOptima4, 2));
        
        assertFalse(initialMultiStartUnivariateRealOptimizerOptima0 == finalMultiStartUnivariateRealOptimizerOptima0);
        
        assertFalse(initialMultiStartUnivariateRealOptimizerOptima1 == finalMultiStartUnivariateRealOptimizerOptima1);
        
        assertNull(finalMultiStartUnivariateRealOptimizerOptima2);
    }
    
    @Test
    public void testSortPairs2() throws Exception  {
        MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer = ((MultiStartUnivariateRealOptimizer) createInstance("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer"));
        org.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair[] optima = new org.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair[7];
        UnivariateRealPointValuePair univariateRealPointValuePair = ((UnivariateRealPointValuePair) createInstance("org.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair"));
        setField(univariateRealPointValuePair, "org.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair", "value", 1.780519984291559E-307);
        optima[1] = univariateRealPointValuePair;
        UnivariateRealPointValuePair univariateRealPointValuePair1 = ((UnivariateRealPointValuePair) createInstance("org.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair"));
        setField(univariateRealPointValuePair1, "org.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair", "value", -3.007808949781703E-303);
        optima[2] = univariateRealPointValuePair1;
        setField(multiStartUnivariateRealOptimizer, "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optima", optima);
        GoalType goalType = GoalType.MINIMIZE;
        
        org.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair[] multiStartUnivariateRealOptimizerOptima = ((org.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair[]) getFieldValue(multiStartUnivariateRealOptimizer, "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optima"));
        UnivariateRealPointValuePair initialMultiStartUnivariateRealOptimizerOptima0 = ((UnivariateRealPointValuePair) get(multiStartUnivariateRealOptimizerOptima, 0));
        
        Class multiStartUnivariateRealOptimizerClazz = Class.forName("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer");
        Class goalTypeType = Class.forName("org.apache.commons.math.optimization.GoalType");
        Method sortPairsMethod = multiStartUnivariateRealOptimizerClazz.getDeclaredMethod("sortPairs", goalTypeType);
        sortPairsMethod.setAccessible(true);
        java.lang.Object[] sortPairsMethodArguments = new java.lang.Object[1];
        sortPairsMethodArguments[0] = goalType;
        sortPairsMethod.invoke(multiStartUnivariateRealOptimizer, sortPairsMethodArguments);
        
        org.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair[] multiStartUnivariateRealOptimizerOptima1 = ((org.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair[]) getFieldValue(multiStartUnivariateRealOptimizer, "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optima"));
        UnivariateRealPointValuePair finalMultiStartUnivariateRealOptimizerOptima0 = ((UnivariateRealPointValuePair) get(multiStartUnivariateRealOptimizerOptima1, 0));
        org.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair[] multiStartUnivariateRealOptimizerOptima2 = ((org.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair[]) getFieldValue(multiStartUnivariateRealOptimizer, "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optima"));
        UnivariateRealPointValuePair finalMultiStartUnivariateRealOptimizerOptima2 = ((UnivariateRealPointValuePair) get(multiStartUnivariateRealOptimizerOptima2, 2));
        org.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair[] multiStartUnivariateRealOptimizerOptima3 = ((org.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair[]) getFieldValue(multiStartUnivariateRealOptimizer, "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optima"));
        UnivariateRealPointValuePair finalMultiStartUnivariateRealOptimizerOptima3 = ((UnivariateRealPointValuePair) get(multiStartUnivariateRealOptimizerOptima3, 3));
        org.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair[] multiStartUnivariateRealOptimizerOptima4 = ((org.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair[]) getFieldValue(multiStartUnivariateRealOptimizer, "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optima"));
        UnivariateRealPointValuePair finalMultiStartUnivariateRealOptimizerOptima4 = ((UnivariateRealPointValuePair) get(multiStartUnivariateRealOptimizerOptima4, 4));
        org.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair[] multiStartUnivariateRealOptimizerOptima5 = ((org.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair[]) getFieldValue(multiStartUnivariateRealOptimizer, "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optima"));
        UnivariateRealPointValuePair finalMultiStartUnivariateRealOptimizerOptima5 = ((UnivariateRealPointValuePair) get(multiStartUnivariateRealOptimizerOptima5, 5));
        org.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair[] multiStartUnivariateRealOptimizerOptima6 = ((org.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair[]) getFieldValue(multiStartUnivariateRealOptimizer, "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optima"));
        UnivariateRealPointValuePair finalMultiStartUnivariateRealOptimizerOptima6 = ((UnivariateRealPointValuePair) get(multiStartUnivariateRealOptimizerOptima6, 6));
        
        assertFalse(initialMultiStartUnivariateRealOptimizerOptima0 == finalMultiStartUnivariateRealOptimizerOptima0);
        
        assertNull(finalMultiStartUnivariateRealOptimizerOptima2);
        
        assertNull(finalMultiStartUnivariateRealOptimizerOptima3);
        
        assertNull(finalMultiStartUnivariateRealOptimizerOptima4);
        
        assertNull(finalMultiStartUnivariateRealOptimizerOptima5);
        
        assertNull(finalMultiStartUnivariateRealOptimizerOptima6);
    }
    
    @Test
    public void testSortPairs3() throws Exception  {
        MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer = ((MultiStartUnivariateRealOptimizer) createInstance("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer"));
        org.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair[] optima = new org.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair[39];
        UnivariateRealPointValuePair univariateRealPointValuePair = ((UnivariateRealPointValuePair) createInstance("org.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair"));
        setField(univariateRealPointValuePair, "org.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair", "value", java.lang.Double.NaN);
        optima[0] = univariateRealPointValuePair;
        UnivariateRealPointValuePair univariateRealPointValuePair1 = ((UnivariateRealPointValuePair) createInstance("org.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair"));
        setField(univariateRealPointValuePair1, "org.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair", "value", 2.0000000000000004);
        optima[1] = univariateRealPointValuePair1;
        UnivariateRealPointValuePair univariateRealPointValuePair2 = ((UnivariateRealPointValuePair) createInstance("org.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair"));
        optima[3] = univariateRealPointValuePair2;
        setField(multiStartUnivariateRealOptimizer, "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optima", optima);
        
        org.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair[] multiStartUnivariateRealOptimizerOptima = ((org.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair[]) getFieldValue(multiStartUnivariateRealOptimizer, "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optima"));
        UnivariateRealPointValuePair initialMultiStartUnivariateRealOptimizerOptima2 = ((UnivariateRealPointValuePair) get(multiStartUnivariateRealOptimizerOptima, 2));
        
        Class multiStartUnivariateRealOptimizerClazz = Class.forName("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer");
        Class goalTypeType = Class.forName("org.apache.commons.math.optimization.GoalType");
        Method sortPairsMethod = multiStartUnivariateRealOptimizerClazz.getDeclaredMethod("sortPairs", goalTypeType);
        sortPairsMethod.setAccessible(true);
        java.lang.Object[] sortPairsMethodArguments = new java.lang.Object[1];
        sortPairsMethodArguments[0] = ((Object) null);
        sortPairsMethod.invoke(multiStartUnivariateRealOptimizer, sortPairsMethodArguments);
        
        org.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair[] multiStartUnivariateRealOptimizerOptima1 = ((org.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair[]) getFieldValue(multiStartUnivariateRealOptimizer, "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optima"));
        UnivariateRealPointValuePair finalMultiStartUnivariateRealOptimizerOptima2 = ((UnivariateRealPointValuePair) get(multiStartUnivariateRealOptimizerOptima1, 2));
        org.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair[] multiStartUnivariateRealOptimizerOptima2 = ((org.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair[]) getFieldValue(multiStartUnivariateRealOptimizer, "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optima"));
        UnivariateRealPointValuePair finalMultiStartUnivariateRealOptimizerOptima3 = ((UnivariateRealPointValuePair) get(multiStartUnivariateRealOptimizerOptima2, 3));
        org.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair[] multiStartUnivariateRealOptimizerOptima3 = ((org.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair[]) getFieldValue(multiStartUnivariateRealOptimizer, "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optima"));
        UnivariateRealPointValuePair finalMultiStartUnivariateRealOptimizerOptima4 = ((UnivariateRealPointValuePair) get(multiStartUnivariateRealOptimizerOptima3, 4));
        org.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair[] multiStartUnivariateRealOptimizerOptima4 = ((org.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair[]) getFieldValue(multiStartUnivariateRealOptimizer, "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optima"));
        UnivariateRealPointValuePair finalMultiStartUnivariateRealOptimizerOptima5 = ((UnivariateRealPointValuePair) get(multiStartUnivariateRealOptimizerOptima4, 5));
        org.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair[] multiStartUnivariateRealOptimizerOptima5 = ((org.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair[]) getFieldValue(multiStartUnivariateRealOptimizer, "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optima"));
        UnivariateRealPointValuePair finalMultiStartUnivariateRealOptimizerOptima6 = ((UnivariateRealPointValuePair) get(multiStartUnivariateRealOptimizerOptima5, 6));
        org.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair[] multiStartUnivariateRealOptimizerOptima6 = ((org.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair[]) getFieldValue(multiStartUnivariateRealOptimizer, "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optima"));
        UnivariateRealPointValuePair finalMultiStartUnivariateRealOptimizerOptima7 = ((UnivariateRealPointValuePair) get(multiStartUnivariateRealOptimizerOptima6, 7));
        org.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair[] multiStartUnivariateRealOptimizerOptima7 = ((org.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair[]) getFieldValue(multiStartUnivariateRealOptimizer, "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optima"));
        UnivariateRealPointValuePair finalMultiStartUnivariateRealOptimizerOptima8 = ((UnivariateRealPointValuePair) get(multiStartUnivariateRealOptimizerOptima7, 8));
        org.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair[] multiStartUnivariateRealOptimizerOptima8 = ((org.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair[]) getFieldValue(multiStartUnivariateRealOptimizer, "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optima"));
        UnivariateRealPointValuePair finalMultiStartUnivariateRealOptimizerOptima9 = ((UnivariateRealPointValuePair) get(multiStartUnivariateRealOptimizerOptima8, 9));
        org.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair[] multiStartUnivariateRealOptimizerOptima9 = ((org.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair[]) getFieldValue(multiStartUnivariateRealOptimizer, "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optima"));
        UnivariateRealPointValuePair finalMultiStartUnivariateRealOptimizerOptima10 = ((UnivariateRealPointValuePair) get(multiStartUnivariateRealOptimizerOptima9, 10));
        org.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair[] multiStartUnivariateRealOptimizerOptima10 = ((org.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair[]) getFieldValue(multiStartUnivariateRealOptimizer, "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optima"));
        UnivariateRealPointValuePair finalMultiStartUnivariateRealOptimizerOptima11 = ((UnivariateRealPointValuePair) get(multiStartUnivariateRealOptimizerOptima10, 11));
        org.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair[] multiStartUnivariateRealOptimizerOptima11 = ((org.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair[]) getFieldValue(multiStartUnivariateRealOptimizer, "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optima"));
        UnivariateRealPointValuePair finalMultiStartUnivariateRealOptimizerOptima12 = ((UnivariateRealPointValuePair) get(multiStartUnivariateRealOptimizerOptima11, 12));
        org.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair[] multiStartUnivariateRealOptimizerOptima12 = ((org.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair[]) getFieldValue(multiStartUnivariateRealOptimizer, "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optima"));
        UnivariateRealPointValuePair finalMultiStartUnivariateRealOptimizerOptima13 = ((UnivariateRealPointValuePair) get(multiStartUnivariateRealOptimizerOptima12, 13));
        org.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair[] multiStartUnivariateRealOptimizerOptima13 = ((org.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair[]) getFieldValue(multiStartUnivariateRealOptimizer, "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optima"));
        UnivariateRealPointValuePair finalMultiStartUnivariateRealOptimizerOptima14 = ((UnivariateRealPointValuePair) get(multiStartUnivariateRealOptimizerOptima13, 14));
        org.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair[] multiStartUnivariateRealOptimizerOptima14 = ((org.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair[]) getFieldValue(multiStartUnivariateRealOptimizer, "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optima"));
        UnivariateRealPointValuePair finalMultiStartUnivariateRealOptimizerOptima15 = ((UnivariateRealPointValuePair) get(multiStartUnivariateRealOptimizerOptima14, 15));
        org.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair[] multiStartUnivariateRealOptimizerOptima15 = ((org.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair[]) getFieldValue(multiStartUnivariateRealOptimizer, "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optima"));
        UnivariateRealPointValuePair finalMultiStartUnivariateRealOptimizerOptima16 = ((UnivariateRealPointValuePair) get(multiStartUnivariateRealOptimizerOptima15, 16));
        org.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair[] multiStartUnivariateRealOptimizerOptima16 = ((org.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair[]) getFieldValue(multiStartUnivariateRealOptimizer, "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optima"));
        UnivariateRealPointValuePair finalMultiStartUnivariateRealOptimizerOptima17 = ((UnivariateRealPointValuePair) get(multiStartUnivariateRealOptimizerOptima16, 17));
        org.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair[] multiStartUnivariateRealOptimizerOptima17 = ((org.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair[]) getFieldValue(multiStartUnivariateRealOptimizer, "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optima"));
        UnivariateRealPointValuePair finalMultiStartUnivariateRealOptimizerOptima18 = ((UnivariateRealPointValuePair) get(multiStartUnivariateRealOptimizerOptima17, 18));
        org.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair[] multiStartUnivariateRealOptimizerOptima18 = ((org.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair[]) getFieldValue(multiStartUnivariateRealOptimizer, "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optima"));
        UnivariateRealPointValuePair finalMultiStartUnivariateRealOptimizerOptima19 = ((UnivariateRealPointValuePair) get(multiStartUnivariateRealOptimizerOptima18, 19));
        org.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair[] multiStartUnivariateRealOptimizerOptima19 = ((org.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair[]) getFieldValue(multiStartUnivariateRealOptimizer, "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optima"));
        UnivariateRealPointValuePair finalMultiStartUnivariateRealOptimizerOptima20 = ((UnivariateRealPointValuePair) get(multiStartUnivariateRealOptimizerOptima19, 20));
        org.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair[] multiStartUnivariateRealOptimizerOptima20 = ((org.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair[]) getFieldValue(multiStartUnivariateRealOptimizer, "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optima"));
        UnivariateRealPointValuePair finalMultiStartUnivariateRealOptimizerOptima21 = ((UnivariateRealPointValuePair) get(multiStartUnivariateRealOptimizerOptima20, 21));
        org.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair[] multiStartUnivariateRealOptimizerOptima21 = ((org.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair[]) getFieldValue(multiStartUnivariateRealOptimizer, "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optima"));
        UnivariateRealPointValuePair finalMultiStartUnivariateRealOptimizerOptima22 = ((UnivariateRealPointValuePair) get(multiStartUnivariateRealOptimizerOptima21, 22));
        org.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair[] multiStartUnivariateRealOptimizerOptima22 = ((org.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair[]) getFieldValue(multiStartUnivariateRealOptimizer, "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optima"));
        UnivariateRealPointValuePair finalMultiStartUnivariateRealOptimizerOptima23 = ((UnivariateRealPointValuePair) get(multiStartUnivariateRealOptimizerOptima22, 23));
        org.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair[] multiStartUnivariateRealOptimizerOptima23 = ((org.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair[]) getFieldValue(multiStartUnivariateRealOptimizer, "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optima"));
        UnivariateRealPointValuePair finalMultiStartUnivariateRealOptimizerOptima24 = ((UnivariateRealPointValuePair) get(multiStartUnivariateRealOptimizerOptima23, 24));
        org.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair[] multiStartUnivariateRealOptimizerOptima24 = ((org.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair[]) getFieldValue(multiStartUnivariateRealOptimizer, "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optima"));
        UnivariateRealPointValuePair finalMultiStartUnivariateRealOptimizerOptima25 = ((UnivariateRealPointValuePair) get(multiStartUnivariateRealOptimizerOptima24, 25));
        org.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair[] multiStartUnivariateRealOptimizerOptima25 = ((org.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair[]) getFieldValue(multiStartUnivariateRealOptimizer, "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optima"));
        UnivariateRealPointValuePair finalMultiStartUnivariateRealOptimizerOptima26 = ((UnivariateRealPointValuePair) get(multiStartUnivariateRealOptimizerOptima25, 26));
        org.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair[] multiStartUnivariateRealOptimizerOptima26 = ((org.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair[]) getFieldValue(multiStartUnivariateRealOptimizer, "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optima"));
        UnivariateRealPointValuePair finalMultiStartUnivariateRealOptimizerOptima27 = ((UnivariateRealPointValuePair) get(multiStartUnivariateRealOptimizerOptima26, 27));
        org.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair[] multiStartUnivariateRealOptimizerOptima27 = ((org.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair[]) getFieldValue(multiStartUnivariateRealOptimizer, "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optima"));
        UnivariateRealPointValuePair finalMultiStartUnivariateRealOptimizerOptima28 = ((UnivariateRealPointValuePair) get(multiStartUnivariateRealOptimizerOptima27, 28));
        org.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair[] multiStartUnivariateRealOptimizerOptima28 = ((org.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair[]) getFieldValue(multiStartUnivariateRealOptimizer, "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optima"));
        UnivariateRealPointValuePair finalMultiStartUnivariateRealOptimizerOptima29 = ((UnivariateRealPointValuePair) get(multiStartUnivariateRealOptimizerOptima28, 29));
        org.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair[] multiStartUnivariateRealOptimizerOptima29 = ((org.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair[]) getFieldValue(multiStartUnivariateRealOptimizer, "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optima"));
        UnivariateRealPointValuePair finalMultiStartUnivariateRealOptimizerOptima30 = ((UnivariateRealPointValuePair) get(multiStartUnivariateRealOptimizerOptima29, 30));
        org.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair[] multiStartUnivariateRealOptimizerOptima30 = ((org.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair[]) getFieldValue(multiStartUnivariateRealOptimizer, "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optima"));
        UnivariateRealPointValuePair finalMultiStartUnivariateRealOptimizerOptima31 = ((UnivariateRealPointValuePair) get(multiStartUnivariateRealOptimizerOptima30, 31));
        org.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair[] multiStartUnivariateRealOptimizerOptima31 = ((org.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair[]) getFieldValue(multiStartUnivariateRealOptimizer, "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optima"));
        UnivariateRealPointValuePair finalMultiStartUnivariateRealOptimizerOptima32 = ((UnivariateRealPointValuePair) get(multiStartUnivariateRealOptimizerOptima31, 32));
        org.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair[] multiStartUnivariateRealOptimizerOptima32 = ((org.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair[]) getFieldValue(multiStartUnivariateRealOptimizer, "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optima"));
        UnivariateRealPointValuePair finalMultiStartUnivariateRealOptimizerOptima33 = ((UnivariateRealPointValuePair) get(multiStartUnivariateRealOptimizerOptima32, 33));
        org.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair[] multiStartUnivariateRealOptimizerOptima33 = ((org.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair[]) getFieldValue(multiStartUnivariateRealOptimizer, "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optima"));
        UnivariateRealPointValuePair finalMultiStartUnivariateRealOptimizerOptima34 = ((UnivariateRealPointValuePair) get(multiStartUnivariateRealOptimizerOptima33, 34));
        org.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair[] multiStartUnivariateRealOptimizerOptima34 = ((org.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair[]) getFieldValue(multiStartUnivariateRealOptimizer, "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optima"));
        UnivariateRealPointValuePair finalMultiStartUnivariateRealOptimizerOptima35 = ((UnivariateRealPointValuePair) get(multiStartUnivariateRealOptimizerOptima34, 35));
        org.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair[] multiStartUnivariateRealOptimizerOptima35 = ((org.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair[]) getFieldValue(multiStartUnivariateRealOptimizer, "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optima"));
        UnivariateRealPointValuePair finalMultiStartUnivariateRealOptimizerOptima36 = ((UnivariateRealPointValuePair) get(multiStartUnivariateRealOptimizerOptima35, 36));
        org.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair[] multiStartUnivariateRealOptimizerOptima36 = ((org.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair[]) getFieldValue(multiStartUnivariateRealOptimizer, "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optima"));
        UnivariateRealPointValuePair finalMultiStartUnivariateRealOptimizerOptima37 = ((UnivariateRealPointValuePair) get(multiStartUnivariateRealOptimizerOptima36, 37));
        org.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair[] multiStartUnivariateRealOptimizerOptima37 = ((org.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair[]) getFieldValue(multiStartUnivariateRealOptimizer, "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optima"));
        UnivariateRealPointValuePair finalMultiStartUnivariateRealOptimizerOptima38 = ((UnivariateRealPointValuePair) get(multiStartUnivariateRealOptimizerOptima37, 38));
        
        assertFalse(initialMultiStartUnivariateRealOptimizerOptima2 == finalMultiStartUnivariateRealOptimizerOptima2);
        
        assertNull(finalMultiStartUnivariateRealOptimizerOptima3);
        
        assertNull(finalMultiStartUnivariateRealOptimizerOptima4);
        
        assertNull(finalMultiStartUnivariateRealOptimizerOptima5);
        
        assertNull(finalMultiStartUnivariateRealOptimizerOptima6);
        
        assertNull(finalMultiStartUnivariateRealOptimizerOptima7);
        
        assertNull(finalMultiStartUnivariateRealOptimizerOptima8);
        
        assertNull(finalMultiStartUnivariateRealOptimizerOptima9);
        
        assertNull(finalMultiStartUnivariateRealOptimizerOptima10);
        
        assertNull(finalMultiStartUnivariateRealOptimizerOptima11);
        
        assertNull(finalMultiStartUnivariateRealOptimizerOptima12);
        
        assertNull(finalMultiStartUnivariateRealOptimizerOptima13);
        
        assertNull(finalMultiStartUnivariateRealOptimizerOptima14);
        
        assertNull(finalMultiStartUnivariateRealOptimizerOptima15);
        
        assertNull(finalMultiStartUnivariateRealOptimizerOptima16);
        
        assertNull(finalMultiStartUnivariateRealOptimizerOptima17);
        
        assertNull(finalMultiStartUnivariateRealOptimizerOptima18);
        
        assertNull(finalMultiStartUnivariateRealOptimizerOptima19);
        
        assertNull(finalMultiStartUnivariateRealOptimizerOptima20);
        
        assertNull(finalMultiStartUnivariateRealOptimizerOptima21);
        
        assertNull(finalMultiStartUnivariateRealOptimizerOptima22);
        
        assertNull(finalMultiStartUnivariateRealOptimizerOptima23);
        
        assertNull(finalMultiStartUnivariateRealOptimizerOptima24);
        
        assertNull(finalMultiStartUnivariateRealOptimizerOptima25);
        
        assertNull(finalMultiStartUnivariateRealOptimizerOptima26);
        
        assertNull(finalMultiStartUnivariateRealOptimizerOptima27);
        
        assertNull(finalMultiStartUnivariateRealOptimizerOptima28);
        
        assertNull(finalMultiStartUnivariateRealOptimizerOptima29);
        
        assertNull(finalMultiStartUnivariateRealOptimizerOptima30);
        
        assertNull(finalMultiStartUnivariateRealOptimizerOptima31);
        
        assertNull(finalMultiStartUnivariateRealOptimizerOptima32);
        
        assertNull(finalMultiStartUnivariateRealOptimizerOptima33);
        
        assertNull(finalMultiStartUnivariateRealOptimizerOptima34);
        
        assertNull(finalMultiStartUnivariateRealOptimizerOptima35);
        
        assertNull(finalMultiStartUnivariateRealOptimizerOptima36);
        
        assertNull(finalMultiStartUnivariateRealOptimizerOptima37);
        
        assertNull(finalMultiStartUnivariateRealOptimizerOptima38);
    }
    
    @Test
    public void testSortPairs4() throws Exception  {
        MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer = ((MultiStartUnivariateRealOptimizer) createInstance("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer"));
        org.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair[] optima = new org.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair[7];
        UnivariateRealPointValuePair univariateRealPointValuePair = ((UnivariateRealPointValuePair) createInstance("org.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair"));
        optima[0] = univariateRealPointValuePair;
        optima[3] = univariateRealPointValuePair;
        optima[4] = univariateRealPointValuePair;
        optima[5] = univariateRealPointValuePair;
        optima[6] = univariateRealPointValuePair;
        setField(multiStartUnivariateRealOptimizer, "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optima", optima);
        
        Class multiStartUnivariateRealOptimizerClazz = Class.forName("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer");
        Class goalTypeType = Class.forName("org.apache.commons.math.optimization.GoalType");
        Method sortPairsMethod = multiStartUnivariateRealOptimizerClazz.getDeclaredMethod("sortPairs", goalTypeType);
        sortPairsMethod.setAccessible(true);
        java.lang.Object[] sortPairsMethodArguments = new java.lang.Object[1];
        sortPairsMethodArguments[0] = ((Object) null);
        sortPairsMethod.invoke(multiStartUnivariateRealOptimizer, sortPairsMethodArguments);
    }
    
    @Test
    public void testSortPairs5() throws Exception  {
        MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer = ((MultiStartUnivariateRealOptimizer) createInstance("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer"));
        org.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair[] optima = new org.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair[35];
        UnivariateRealPointValuePair univariateRealPointValuePair = ((UnivariateRealPointValuePair) createInstance("org.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair"));
        optima[2] = univariateRealPointValuePair;
        setField(multiStartUnivariateRealOptimizer, "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optima", optima);
        
        org.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair[] multiStartUnivariateRealOptimizerOptima = ((org.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair[]) getFieldValue(multiStartUnivariateRealOptimizer, "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optima"));
        UnivariateRealPointValuePair initialMultiStartUnivariateRealOptimizerOptima0 = ((UnivariateRealPointValuePair) get(multiStartUnivariateRealOptimizerOptima, 0));
        
        Class multiStartUnivariateRealOptimizerClazz = Class.forName("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer");
        Class goalTypeType = Class.forName("org.apache.commons.math.optimization.GoalType");
        Method sortPairsMethod = multiStartUnivariateRealOptimizerClazz.getDeclaredMethod("sortPairs", goalTypeType);
        sortPairsMethod.setAccessible(true);
        java.lang.Object[] sortPairsMethodArguments = new java.lang.Object[1];
        sortPairsMethodArguments[0] = ((Object) null);
        sortPairsMethod.invoke(multiStartUnivariateRealOptimizer, sortPairsMethodArguments);
        
        org.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair[] multiStartUnivariateRealOptimizerOptima1 = ((org.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair[]) getFieldValue(multiStartUnivariateRealOptimizer, "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optima"));
        UnivariateRealPointValuePair finalMultiStartUnivariateRealOptimizerOptima0 = ((UnivariateRealPointValuePair) get(multiStartUnivariateRealOptimizerOptima1, 0));
        org.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair[] multiStartUnivariateRealOptimizerOptima2 = ((org.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair[]) getFieldValue(multiStartUnivariateRealOptimizer, "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optima"));
        UnivariateRealPointValuePair finalMultiStartUnivariateRealOptimizerOptima1 = ((UnivariateRealPointValuePair) get(multiStartUnivariateRealOptimizerOptima2, 1));
        org.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair[] multiStartUnivariateRealOptimizerOptima3 = ((org.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair[]) getFieldValue(multiStartUnivariateRealOptimizer, "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optima"));
        UnivariateRealPointValuePair finalMultiStartUnivariateRealOptimizerOptima2 = ((UnivariateRealPointValuePair) get(multiStartUnivariateRealOptimizerOptima3, 2));
        org.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair[] multiStartUnivariateRealOptimizerOptima4 = ((org.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair[]) getFieldValue(multiStartUnivariateRealOptimizer, "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optima"));
        UnivariateRealPointValuePair finalMultiStartUnivariateRealOptimizerOptima3 = ((UnivariateRealPointValuePair) get(multiStartUnivariateRealOptimizerOptima4, 3));
        org.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair[] multiStartUnivariateRealOptimizerOptima5 = ((org.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair[]) getFieldValue(multiStartUnivariateRealOptimizer, "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optima"));
        UnivariateRealPointValuePair finalMultiStartUnivariateRealOptimizerOptima4 = ((UnivariateRealPointValuePair) get(multiStartUnivariateRealOptimizerOptima5, 4));
        org.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair[] multiStartUnivariateRealOptimizerOptima6 = ((org.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair[]) getFieldValue(multiStartUnivariateRealOptimizer, "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optima"));
        UnivariateRealPointValuePair finalMultiStartUnivariateRealOptimizerOptima5 = ((UnivariateRealPointValuePair) get(multiStartUnivariateRealOptimizerOptima6, 5));
        org.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair[] multiStartUnivariateRealOptimizerOptima7 = ((org.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair[]) getFieldValue(multiStartUnivariateRealOptimizer, "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optima"));
        UnivariateRealPointValuePair finalMultiStartUnivariateRealOptimizerOptima6 = ((UnivariateRealPointValuePair) get(multiStartUnivariateRealOptimizerOptima7, 6));
        org.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair[] multiStartUnivariateRealOptimizerOptima8 = ((org.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair[]) getFieldValue(multiStartUnivariateRealOptimizer, "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optima"));
        UnivariateRealPointValuePair finalMultiStartUnivariateRealOptimizerOptima7 = ((UnivariateRealPointValuePair) get(multiStartUnivariateRealOptimizerOptima8, 7));
        org.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair[] multiStartUnivariateRealOptimizerOptima9 = ((org.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair[]) getFieldValue(multiStartUnivariateRealOptimizer, "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optima"));
        UnivariateRealPointValuePair finalMultiStartUnivariateRealOptimizerOptima8 = ((UnivariateRealPointValuePair) get(multiStartUnivariateRealOptimizerOptima9, 8));
        org.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair[] multiStartUnivariateRealOptimizerOptima10 = ((org.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair[]) getFieldValue(multiStartUnivariateRealOptimizer, "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optima"));
        UnivariateRealPointValuePair finalMultiStartUnivariateRealOptimizerOptima9 = ((UnivariateRealPointValuePair) get(multiStartUnivariateRealOptimizerOptima10, 9));
        org.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair[] multiStartUnivariateRealOptimizerOptima11 = ((org.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair[]) getFieldValue(multiStartUnivariateRealOptimizer, "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optima"));
        UnivariateRealPointValuePair finalMultiStartUnivariateRealOptimizerOptima10 = ((UnivariateRealPointValuePair) get(multiStartUnivariateRealOptimizerOptima11, 10));
        org.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair[] multiStartUnivariateRealOptimizerOptima12 = ((org.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair[]) getFieldValue(multiStartUnivariateRealOptimizer, "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optima"));
        UnivariateRealPointValuePair finalMultiStartUnivariateRealOptimizerOptima11 = ((UnivariateRealPointValuePair) get(multiStartUnivariateRealOptimizerOptima12, 11));
        org.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair[] multiStartUnivariateRealOptimizerOptima13 = ((org.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair[]) getFieldValue(multiStartUnivariateRealOptimizer, "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optima"));
        UnivariateRealPointValuePair finalMultiStartUnivariateRealOptimizerOptima12 = ((UnivariateRealPointValuePair) get(multiStartUnivariateRealOptimizerOptima13, 12));
        org.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair[] multiStartUnivariateRealOptimizerOptima14 = ((org.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair[]) getFieldValue(multiStartUnivariateRealOptimizer, "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optima"));
        UnivariateRealPointValuePair finalMultiStartUnivariateRealOptimizerOptima13 = ((UnivariateRealPointValuePair) get(multiStartUnivariateRealOptimizerOptima14, 13));
        org.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair[] multiStartUnivariateRealOptimizerOptima15 = ((org.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair[]) getFieldValue(multiStartUnivariateRealOptimizer, "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optima"));
        UnivariateRealPointValuePair finalMultiStartUnivariateRealOptimizerOptima14 = ((UnivariateRealPointValuePair) get(multiStartUnivariateRealOptimizerOptima15, 14));
        org.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair[] multiStartUnivariateRealOptimizerOptima16 = ((org.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair[]) getFieldValue(multiStartUnivariateRealOptimizer, "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optima"));
        UnivariateRealPointValuePair finalMultiStartUnivariateRealOptimizerOptima15 = ((UnivariateRealPointValuePair) get(multiStartUnivariateRealOptimizerOptima16, 15));
        org.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair[] multiStartUnivariateRealOptimizerOptima17 = ((org.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair[]) getFieldValue(multiStartUnivariateRealOptimizer, "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optima"));
        UnivariateRealPointValuePair finalMultiStartUnivariateRealOptimizerOptima16 = ((UnivariateRealPointValuePair) get(multiStartUnivariateRealOptimizerOptima17, 16));
        org.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair[] multiStartUnivariateRealOptimizerOptima18 = ((org.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair[]) getFieldValue(multiStartUnivariateRealOptimizer, "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optima"));
        UnivariateRealPointValuePair finalMultiStartUnivariateRealOptimizerOptima17 = ((UnivariateRealPointValuePair) get(multiStartUnivariateRealOptimizerOptima18, 17));
        org.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair[] multiStartUnivariateRealOptimizerOptima19 = ((org.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair[]) getFieldValue(multiStartUnivariateRealOptimizer, "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optima"));
        UnivariateRealPointValuePair finalMultiStartUnivariateRealOptimizerOptima18 = ((UnivariateRealPointValuePair) get(multiStartUnivariateRealOptimizerOptima19, 18));
        org.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair[] multiStartUnivariateRealOptimizerOptima20 = ((org.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair[]) getFieldValue(multiStartUnivariateRealOptimizer, "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optima"));
        UnivariateRealPointValuePair finalMultiStartUnivariateRealOptimizerOptima19 = ((UnivariateRealPointValuePair) get(multiStartUnivariateRealOptimizerOptima20, 19));
        org.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair[] multiStartUnivariateRealOptimizerOptima21 = ((org.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair[]) getFieldValue(multiStartUnivariateRealOptimizer, "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optima"));
        UnivariateRealPointValuePair finalMultiStartUnivariateRealOptimizerOptima20 = ((UnivariateRealPointValuePair) get(multiStartUnivariateRealOptimizerOptima21, 20));
        org.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair[] multiStartUnivariateRealOptimizerOptima22 = ((org.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair[]) getFieldValue(multiStartUnivariateRealOptimizer, "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optima"));
        UnivariateRealPointValuePair finalMultiStartUnivariateRealOptimizerOptima21 = ((UnivariateRealPointValuePair) get(multiStartUnivariateRealOptimizerOptima22, 21));
        org.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair[] multiStartUnivariateRealOptimizerOptima23 = ((org.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair[]) getFieldValue(multiStartUnivariateRealOptimizer, "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optima"));
        UnivariateRealPointValuePair finalMultiStartUnivariateRealOptimizerOptima22 = ((UnivariateRealPointValuePair) get(multiStartUnivariateRealOptimizerOptima23, 22));
        org.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair[] multiStartUnivariateRealOptimizerOptima24 = ((org.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair[]) getFieldValue(multiStartUnivariateRealOptimizer, "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optima"));
        UnivariateRealPointValuePair finalMultiStartUnivariateRealOptimizerOptima23 = ((UnivariateRealPointValuePair) get(multiStartUnivariateRealOptimizerOptima24, 23));
        org.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair[] multiStartUnivariateRealOptimizerOptima25 = ((org.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair[]) getFieldValue(multiStartUnivariateRealOptimizer, "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optima"));
        UnivariateRealPointValuePair finalMultiStartUnivariateRealOptimizerOptima24 = ((UnivariateRealPointValuePair) get(multiStartUnivariateRealOptimizerOptima25, 24));
        org.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair[] multiStartUnivariateRealOptimizerOptima26 = ((org.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair[]) getFieldValue(multiStartUnivariateRealOptimizer, "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optima"));
        UnivariateRealPointValuePair finalMultiStartUnivariateRealOptimizerOptima25 = ((UnivariateRealPointValuePair) get(multiStartUnivariateRealOptimizerOptima26, 25));
        org.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair[] multiStartUnivariateRealOptimizerOptima27 = ((org.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair[]) getFieldValue(multiStartUnivariateRealOptimizer, "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optima"));
        UnivariateRealPointValuePair finalMultiStartUnivariateRealOptimizerOptima26 = ((UnivariateRealPointValuePair) get(multiStartUnivariateRealOptimizerOptima27, 26));
        org.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair[] multiStartUnivariateRealOptimizerOptima28 = ((org.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair[]) getFieldValue(multiStartUnivariateRealOptimizer, "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optima"));
        UnivariateRealPointValuePair finalMultiStartUnivariateRealOptimizerOptima27 = ((UnivariateRealPointValuePair) get(multiStartUnivariateRealOptimizerOptima28, 27));
        org.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair[] multiStartUnivariateRealOptimizerOptima29 = ((org.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair[]) getFieldValue(multiStartUnivariateRealOptimizer, "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optima"));
        UnivariateRealPointValuePair finalMultiStartUnivariateRealOptimizerOptima28 = ((UnivariateRealPointValuePair) get(multiStartUnivariateRealOptimizerOptima29, 28));
        org.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair[] multiStartUnivariateRealOptimizerOptima30 = ((org.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair[]) getFieldValue(multiStartUnivariateRealOptimizer, "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optima"));
        UnivariateRealPointValuePair finalMultiStartUnivariateRealOptimizerOptima29 = ((UnivariateRealPointValuePair) get(multiStartUnivariateRealOptimizerOptima30, 29));
        org.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair[] multiStartUnivariateRealOptimizerOptima31 = ((org.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair[]) getFieldValue(multiStartUnivariateRealOptimizer, "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optima"));
        UnivariateRealPointValuePair finalMultiStartUnivariateRealOptimizerOptima30 = ((UnivariateRealPointValuePair) get(multiStartUnivariateRealOptimizerOptima31, 30));
        org.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair[] multiStartUnivariateRealOptimizerOptima32 = ((org.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair[]) getFieldValue(multiStartUnivariateRealOptimizer, "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optima"));
        UnivariateRealPointValuePair finalMultiStartUnivariateRealOptimizerOptima31 = ((UnivariateRealPointValuePair) get(multiStartUnivariateRealOptimizerOptima32, 31));
        org.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair[] multiStartUnivariateRealOptimizerOptima33 = ((org.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair[]) getFieldValue(multiStartUnivariateRealOptimizer, "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optima"));
        UnivariateRealPointValuePair finalMultiStartUnivariateRealOptimizerOptima32 = ((UnivariateRealPointValuePair) get(multiStartUnivariateRealOptimizerOptima33, 32));
        org.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair[] multiStartUnivariateRealOptimizerOptima34 = ((org.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair[]) getFieldValue(multiStartUnivariateRealOptimizer, "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optima"));
        UnivariateRealPointValuePair finalMultiStartUnivariateRealOptimizerOptima33 = ((UnivariateRealPointValuePair) get(multiStartUnivariateRealOptimizerOptima34, 33));
        org.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair[] multiStartUnivariateRealOptimizerOptima35 = ((org.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair[]) getFieldValue(multiStartUnivariateRealOptimizer, "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optima"));
        UnivariateRealPointValuePair finalMultiStartUnivariateRealOptimizerOptima34 = ((UnivariateRealPointValuePair) get(multiStartUnivariateRealOptimizerOptima35, 34));
        
        assertFalse(initialMultiStartUnivariateRealOptimizerOptima0 == finalMultiStartUnivariateRealOptimizerOptima0);
        
        assertNull(finalMultiStartUnivariateRealOptimizerOptima1);
        
        assertNull(finalMultiStartUnivariateRealOptimizerOptima2);
        
        assertNull(finalMultiStartUnivariateRealOptimizerOptima3);
        
        assertNull(finalMultiStartUnivariateRealOptimizerOptima4);
        
        assertNull(finalMultiStartUnivariateRealOptimizerOptima5);
        
        assertNull(finalMultiStartUnivariateRealOptimizerOptima6);
        
        assertNull(finalMultiStartUnivariateRealOptimizerOptima7);
        
        assertNull(finalMultiStartUnivariateRealOptimizerOptima8);
        
        assertNull(finalMultiStartUnivariateRealOptimizerOptima9);
        
        assertNull(finalMultiStartUnivariateRealOptimizerOptima10);
        
        assertNull(finalMultiStartUnivariateRealOptimizerOptima11);
        
        assertNull(finalMultiStartUnivariateRealOptimizerOptima12);
        
        assertNull(finalMultiStartUnivariateRealOptimizerOptima13);
        
        assertNull(finalMultiStartUnivariateRealOptimizerOptima14);
        
        assertNull(finalMultiStartUnivariateRealOptimizerOptima15);
        
        assertNull(finalMultiStartUnivariateRealOptimizerOptima16);
        
        assertNull(finalMultiStartUnivariateRealOptimizerOptima17);
        
        assertNull(finalMultiStartUnivariateRealOptimizerOptima18);
        
        assertNull(finalMultiStartUnivariateRealOptimizerOptima19);
        
        assertNull(finalMultiStartUnivariateRealOptimizerOptima20);
        
        assertNull(finalMultiStartUnivariateRealOptimizerOptima21);
        
        assertNull(finalMultiStartUnivariateRealOptimizerOptima22);
        
        assertNull(finalMultiStartUnivariateRealOptimizerOptima23);
        
        assertNull(finalMultiStartUnivariateRealOptimizerOptima24);
        
        assertNull(finalMultiStartUnivariateRealOptimizerOptima25);
        
        assertNull(finalMultiStartUnivariateRealOptimizerOptima26);
        
        assertNull(finalMultiStartUnivariateRealOptimizerOptima27);
        
        assertNull(finalMultiStartUnivariateRealOptimizerOptima28);
        
        assertNull(finalMultiStartUnivariateRealOptimizerOptima29);
        
        assertNull(finalMultiStartUnivariateRealOptimizerOptima30);
        
        assertNull(finalMultiStartUnivariateRealOptimizerOptima31);
        
        assertNull(finalMultiStartUnivariateRealOptimizerOptima32);
        
        assertNull(finalMultiStartUnivariateRealOptimizerOptima33);
        
        assertNull(finalMultiStartUnivariateRealOptimizerOptima34);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer.setMaxEvaluations
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setMaxEvaluations(int)
    
    /**
    @utbot.classUnderTest {@link MultiStartUnivariateRealOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer#setMaxEvaluations(int)}
 *  */
    @Test
    public void testSetMaxEvaluations() throws Exception  {
        BrentOptimizer brentOptimizer = ((BrentOptimizer) createInstance("org.apache.commons.math.optimization.univariate.BrentOptimizer"));
        Incrementor evaluations = ((Incrementor) createInstance("org.apache.commons.math.util.Incrementor"));
        setField(brentOptimizer, "org.apache.commons.math.optimization.univariate.AbstractUnivariateRealOptimizer", "evaluations", evaluations);
        Class multiStartUnivariateRealOptimizerClazz = Class.forName("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer");
        Class brentOptimizerType = Class.forName("org.apache.commons.math.optimization.univariate.BaseUnivariateRealOptimizer");
        Class intType = int.class;
        Class randomGeneratorType = Class.forName("org.apache.commons.math.random.RandomGenerator");
        Constructor multiStartUnivariateRealOptimizerConstructor = multiStartUnivariateRealOptimizerClazz.getDeclaredConstructor(brentOptimizerType, intType, randomGeneratorType);
        multiStartUnivariateRealOptimizerConstructor.setAccessible(true);
        java.lang.Object[] multiStartUnivariateRealOptimizerConstructorArguments = new java.lang.Object[3];
        multiStartUnivariateRealOptimizerConstructorArguments[0] = brentOptimizer;
        multiStartUnivariateRealOptimizerConstructorArguments[1] = 0;
        multiStartUnivariateRealOptimizerConstructorArguments[2] = ((Object) null);
        MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer = ((MultiStartUnivariateRealOptimizer) multiStartUnivariateRealOptimizerConstructor.newInstance(multiStartUnivariateRealOptimizerConstructorArguments));
        multiStartUnivariateRealOptimizer.setMaxEvaluations(-255);
        
        multiStartUnivariateRealOptimizer.setMaxEvaluations(-255);
        
        BaseUnivariateRealOptimizer multiStartUnivariateRealOptimizerOptimizer = ((BaseUnivariateRealOptimizer) getFieldValue(multiStartUnivariateRealOptimizer, "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimizer"));
        Incrementor multiStartUnivariateRealOptimizerOptimizerOptimizerEvaluations = ((Incrementor) getFieldValue(multiStartUnivariateRealOptimizerOptimizer, "org.apache.commons.math.optimization.univariate.AbstractUnivariateRealOptimizer", "evaluations"));
        int finalMultiStartUnivariateRealOptimizerOptimizerEvaluationsMaximalCount = ((Integer) getFieldValue(multiStartUnivariateRealOptimizerOptimizerOptimizerEvaluations, "org.apache.commons.math.util.Incrementor", "maximalCount"));
        
        assertEquals(-255, finalMultiStartUnivariateRealOptimizerOptimizerEvaluationsMaximalCount);
    }
    
    /**
    @utbot.classUnderTest {@link MultiStartUnivariateRealOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer#setMaxEvaluations(int)}
 *  */
    @Test
    public void testSetMaxEvaluations_1() throws Exception  {
        BrentOptimizer brentOptimizer = ((BrentOptimizer) createInstance("org.apache.commons.math.optimization.univariate.BrentOptimizer"));
        Incrementor evaluations = ((Incrementor) createInstance("org.apache.commons.math.util.Incrementor"));
        setField(brentOptimizer, "org.apache.commons.math.optimization.univariate.AbstractUnivariateRealOptimizer", "evaluations", evaluations);
        Class multiStartUnivariateRealOptimizerClazz = Class.forName("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer");
        Class brentOptimizerType = Class.forName("org.apache.commons.math.optimization.univariate.BaseUnivariateRealOptimizer");
        Class intType = int.class;
        Class randomGeneratorType = Class.forName("org.apache.commons.math.random.RandomGenerator");
        Constructor multiStartUnivariateRealOptimizerConstructor = multiStartUnivariateRealOptimizerClazz.getDeclaredConstructor(brentOptimizerType, intType, randomGeneratorType);
        multiStartUnivariateRealOptimizerConstructor.setAccessible(true);
        java.lang.Object[] multiStartUnivariateRealOptimizerConstructorArguments = new java.lang.Object[3];
        multiStartUnivariateRealOptimizerConstructorArguments[0] = brentOptimizer;
        multiStartUnivariateRealOptimizerConstructorArguments[1] = 0;
        multiStartUnivariateRealOptimizerConstructorArguments[2] = ((Object) null);
        MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer = ((MultiStartUnivariateRealOptimizer) multiStartUnivariateRealOptimizerConstructor.newInstance(multiStartUnivariateRealOptimizerConstructorArguments));
        MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer1 = new MultiStartUnivariateRealOptimizer(multiStartUnivariateRealOptimizer, 0, null);
        multiStartUnivariateRealOptimizer1.setMaxEvaluations(-255);
        
        multiStartUnivariateRealOptimizer1.setMaxEvaluations(-255);
        
        BaseUnivariateRealOptimizer multiStartUnivariateRealOptimizer1Optimizer = ((BaseUnivariateRealOptimizer) getFieldValue(multiStartUnivariateRealOptimizer1, "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimizer"));
        BaseUnivariateRealOptimizer multiStartUnivariateRealOptimizer1OptimizerOptimizerOptimizer = ((BaseUnivariateRealOptimizer) getFieldValue(multiStartUnivariateRealOptimizer1Optimizer, "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimizer"));
        Incrementor multiStartUnivariateRealOptimizer1OptimizerOptimizerOptimizerOptimizerOptimizerEvaluations = ((Incrementor) getFieldValue(multiStartUnivariateRealOptimizer1OptimizerOptimizerOptimizer, "org.apache.commons.math.optimization.univariate.AbstractUnivariateRealOptimizer", "evaluations"));
        int finalMultiStartUnivariateRealOptimizer1OptimizerOptimizerEvaluationsMaximalCount = ((Integer) getFieldValue(multiStartUnivariateRealOptimizer1OptimizerOptimizerOptimizerOptimizerOptimizerEvaluations, "org.apache.commons.math.util.Incrementor", "maximalCount"));
        BaseUnivariateRealOptimizer multiStartUnivariateRealOptimizer1Optimizer1 = ((BaseUnivariateRealOptimizer) getFieldValue(multiStartUnivariateRealOptimizer1, "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimizer"));
        int finalMultiStartUnivariateRealOptimizer1OptimizerMaxEvaluations = ((Integer) getFieldValue(multiStartUnivariateRealOptimizer1Optimizer1, "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "maxEvaluations"));
        
        assertEquals(-255, finalMultiStartUnivariateRealOptimizer1OptimizerOptimizerEvaluationsMaximalCount);
        
        assertEquals(-255, finalMultiStartUnivariateRealOptimizer1OptimizerMaxEvaluations);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method setMaxEvaluations(int)
    
    /**
    @utbot.classUnderTest {@link MultiStartUnivariateRealOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer#setMaxEvaluations(int)}
 * @utbot.invokes {@link org.apache.commons.math.optimization.univariate.BaseUnivariateRealOptimizer#setMaxEvaluations(int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: optimizer.setMaxEvaluations(maxEvaluations);
 *  */
    @Test
    public void testSetMaxEvaluations_ThrowNullPointerException() {
        MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer = new MultiStartUnivariateRealOptimizer(null, 0, null);
        multiStartUnivariateRealOptimizer.setMaxEvaluations(-255);
        
        /* This test fails because method [org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer.setMaxEvaluations] produces [java.lang.NullPointerException]
            org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer.setMaxEvaluations(MultiStartUnivariateRealOptimizer.java:105) */
        multiStartUnivariateRealOptimizer.setMaxEvaluations(-255);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer.getEvaluations
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getEvaluations()
    
    /**
    @utbot.classUnderTest {@link MultiStartUnivariateRealOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer#getEvaluations()}
 * @utbot.returnsFrom {@code return totalEvaluations;}
 *  */
    @Test
    public void testGetEvaluations_ReturnTotalEvaluations() throws Exception  {
        MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer = ((MultiStartUnivariateRealOptimizer) createInstance("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer"));
        setField(multiStartUnivariateRealOptimizer, "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "totalEvaluations", -255);
        
        int actual = multiStartUnivariateRealOptimizer.getEvaluations();
        
        assertEquals(-255, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer.optimize
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method optimize(org.apache.commons.math.analysis.UnivariateRealFunction, org.apache.commons.math.optimization.GoalType, double, double)
    
    /**
    @utbot.classUnderTest {@link MultiStartUnivariateRealOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer#optimize(org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return optimize(f, goal, min, max, 0);
 *  */
    @Test
    public void testOptimize_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer = ((MultiStartUnivariateRealOptimizer) createInstance("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer"));
        setField(multiStartUnivariateRealOptimizer, "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "totalEvaluations", -255);
        
        /* This test fails because method [org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer.optimize] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer.optimize(MultiStartUnivariateRealOptimizer.java:176)
            org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer.optimize(MultiStartUnivariateRealOptimizer.java:146) */
        multiStartUnivariateRealOptimizer.optimize(null, null, java.lang.Double.NaN, java.lang.Double.NaN);
    }
    
    /**
    @utbot.classUnderTest {@link MultiStartUnivariateRealOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer#optimize(org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double)}
 * @utbot.throwsException {@link java.lang.NegativeArraySizeException} in: return optimize(f, goal, min, max, 0);
 *  */
    @Test
    public void testOptimize_ThrowNegativeArraySizeException_1() throws Exception  {
        MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer = ((MultiStartUnivariateRealOptimizer) createInstance("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer"));
        MultiStartUnivariateRealOptimizer optimizer = ((MultiStartUnivariateRealOptimizer) createInstance("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer"));
        setField(optimizer, "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "starts", Integer.MIN_VALUE);
        setField(multiStartUnivariateRealOptimizer, "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimizer", optimizer);
        setField(multiStartUnivariateRealOptimizer, "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "totalEvaluations", -255);
        setField(multiStartUnivariateRealOptimizer, "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "starts", 1);
        
        /* This test fails because method [org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer.optimize] produces [java.lang.NegativeArraySizeException: -2147483648]
            org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer.optimize(MultiStartUnivariateRealOptimizer.java:154)
            org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer.optimize(MultiStartUnivariateRealOptimizer.java:146)
            org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer.optimize(MultiStartUnivariateRealOptimizer.java:162)
            org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer.optimize(MultiStartUnivariateRealOptimizer.java:146) */
        multiStartUnivariateRealOptimizer.optimize(null, null, 0.0, -0.0);
    }
    
    /**
    @utbot.classUnderTest {@link MultiStartUnivariateRealOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer#optimize(org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double)}
 * @utbot.throwsException {@link java.lang.NegativeArraySizeException} in: return optimize(f, goal, min, max, 0);
 *  */
    @Test
    public void testOptimize_ThrowNegativeArraySizeException() throws FunctionEvaluationException  {
        MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer = new MultiStartUnivariateRealOptimizer(null, -256, null);
        
        /* This test fails because method [org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer.optimize] produces [java.lang.NegativeArraySizeException: -256]
            org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer.optimize(MultiStartUnivariateRealOptimizer.java:154)
            org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer.optimize(MultiStartUnivariateRealOptimizer.java:146) */
        multiStartUnivariateRealOptimizer.optimize(null, null, java.lang.Double.NaN, java.lang.Double.NaN);
    }
    
    /**
    @utbot.classUnderTest {@link MultiStartUnivariateRealOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer#optimize(org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return optimize(f, goal, min, max, 0);
 *  */
    @Test
    public void testOptimize_ThrowArrayIndexOutOfBoundsException_1() throws Exception  {
        MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer = ((MultiStartUnivariateRealOptimizer) createInstance("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer"));
        BrentOptimizer optimizer = ((BrentOptimizer) createInstance("org.apache.commons.math.optimization.univariate.BrentOptimizer"));
        Incrementor evaluations = ((Incrementor) createInstance("org.apache.commons.math.util.Incrementor"));
        evaluations.setMaximalCount(1);
        setField(optimizer, "org.apache.commons.math.optimization.univariate.AbstractUnivariateRealOptimizer", "evaluations", evaluations);
        setField(optimizer, "org.apache.commons.math.optimization.univariate.AbstractUnivariateRealOptimizer", "searchMin", 0.0);
        setField(optimizer, "org.apache.commons.math.optimization.univariate.AbstractUnivariateRealOptimizer", "searchMax", 0.0);
        setField(optimizer, "org.apache.commons.math.optimization.univariate.AbstractUnivariateRealOptimizer", "searchStart", 0.0);
        setField(multiStartUnivariateRealOptimizer, "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimizer", optimizer);
        setField(multiStartUnivariateRealOptimizer, "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "totalEvaluations", -255);
        setField(multiStartUnivariateRealOptimizer, "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "starts", 1);
        org.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair[] optima = {null};
        setField(multiStartUnivariateRealOptimizer, "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optima", optima);
        PolynomialSplineFunction polynomialSplineFunction = ((PolynomialSplineFunction) createInstance("org.apache.commons.math.analysis.polynomials.PolynomialSplineFunction"));
        double[] knots = {};
        setField(polynomialSplineFunction, "org.apache.commons.math.analysis.polynomials.PolynomialSplineFunction", "knots", knots);
        GoalType goalType = GoalType.MINIMIZE;
        
        /* This test fails because method [org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer.optimize] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.analysis.polynomials.PolynomialSplineFunction.value(PolynomialSplineFunction.java:137)
            org.apache.commons.math.optimization.univariate.AbstractUnivariateRealOptimizer.computeObjectiveValue(AbstractUnivariateRealOptimizer.java:110)
            org.apache.commons.math.optimization.univariate.BrentOptimizer.doOptimize(BrentOptimizer.java:114)
            org.apache.commons.math.optimization.univariate.AbstractUnivariateRealOptimizer.optimize(AbstractUnivariateRealOptimizer.java:136)
            org.apache.commons.math.optimization.univariate.AbstractUnivariateRealOptimizer.optimize(AbstractUnivariateRealOptimizer.java:144)
            org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer.optimize(MultiStartUnivariateRealOptimizer.java:162)
            org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer.optimize(MultiStartUnivariateRealOptimizer.java:146) */
        multiStartUnivariateRealOptimizer.optimize(polynomialSplineFunction, goalType, -7.786964273736647E84, 9.340283318923431E-301);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method optimize(org.apache.commons.math.analysis.UnivariateRealFunction, org.apache.commons.math.optimization.GoalType, double, double)
    
    /**
    @utbot.classUnderTest {@link MultiStartUnivariateRealOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer#optimize(org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double)}
 * @utbot.throwsException {@link org.apache.commons.math.exception.NullArgumentException} in: return optimize(f, goal, min, max, 0);
 *  */
    @Test(expected = NullArgumentException.class)
    public void testOptimize_ThrowNullArgumentException() throws Exception  {
        MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer = ((MultiStartUnivariateRealOptimizer) createInstance("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer"));
        BrentOptimizer optimizer = ((BrentOptimizer) createInstance("org.apache.commons.math.optimization.univariate.BrentOptimizer"));
        setField(multiStartUnivariateRealOptimizer, "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimizer", optimizer);
        setField(multiStartUnivariateRealOptimizer, "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "totalEvaluations", -255);
        setField(multiStartUnivariateRealOptimizer, "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "starts", 1);
        PolynomialFunction polynomialFunction = ((PolynomialFunction) createInstance("org.apache.commons.math.analysis.polynomials.PolynomialFunction"));
        
        multiStartUnivariateRealOptimizer.optimize(polynomialFunction, null, 0.0, -0.0);
    }
    
    /**
    @utbot.classUnderTest {@link MultiStartUnivariateRealOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer#optimize(org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double)}
 * @utbot.throwsException {@link org.apache.commons.math.exception.NullArgumentException} in: return optimize(f, goal, min, max, 0);
 *  */
    @Test(expected = NullArgumentException.class)
    public void testOptimize_ThrowNullArgumentException_2() throws Exception  {
        MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer = ((MultiStartUnivariateRealOptimizer) createInstance("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer"));
        Object optimizer = createInstance("org.apache.commons.math.optimization.direct.PowellOptimizer$LineSearch");
        setField(multiStartUnivariateRealOptimizer, "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimizer", optimizer);
        setField(multiStartUnivariateRealOptimizer, "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "totalEvaluations", -255);
        setField(multiStartUnivariateRealOptimizer, "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "starts", 1);
        org.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair[] optima = {};
        setField(multiStartUnivariateRealOptimizer, "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optima", optima);
        
        multiStartUnivariateRealOptimizer.optimize(null, null, java.lang.Double.NaN, 0.0);
    }
    
    /**
    @utbot.classUnderTest {@link MultiStartUnivariateRealOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer#optimize(org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double)}
 * @utbot.throwsException {@link org.apache.commons.math.exception.NullArgumentException} in: return optimize(f, goal, min, max, 0);
 *  */
    @Test(expected = NullArgumentException.class)
    public void testOptimize_ThrowNullArgumentException_3() throws Exception  {
        MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer = ((MultiStartUnivariateRealOptimizer) createInstance("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer"));
        BrentOptimizer optimizer = ((BrentOptimizer) createInstance("org.apache.commons.math.optimization.univariate.BrentOptimizer"));
        setField(multiStartUnivariateRealOptimizer, "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimizer", optimizer);
        setField(multiStartUnivariateRealOptimizer, "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "totalEvaluations", -255);
        setField(multiStartUnivariateRealOptimizer, "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "starts", 1);
        PolynomialSplineFunction polynomialSplineFunction = ((PolynomialSplineFunction) createInstance("org.apache.commons.math.analysis.polynomials.PolynomialSplineFunction"));
        
        multiStartUnivariateRealOptimizer.optimize(polynomialSplineFunction, null, 3.47305889039043E-164, -1.4276413137300738E-154);
    }
    
    /**
    @utbot.classUnderTest {@link MultiStartUnivariateRealOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer#optimize(org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double)}
 * @utbot.throwsException {@link org.apache.commons.math.exception.NullArgumentException} in: return optimize(f, goal, min, max, 0);
 *  */
    @Test(expected = NullArgumentException.class)
    public void testOptimize_ThrowNullArgumentException_1() throws Exception  {
        MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer = ((MultiStartUnivariateRealOptimizer) createInstance("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer"));
        BrentOptimizer optimizer = ((BrentOptimizer) createInstance("org.apache.commons.math.optimization.univariate.BrentOptimizer"));
        setField(multiStartUnivariateRealOptimizer, "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimizer", optimizer);
        setField(multiStartUnivariateRealOptimizer, "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "totalEvaluations", -255);
        setField(multiStartUnivariateRealOptimizer, "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "starts", 1);
        
        multiStartUnivariateRealOptimizer.optimize(null, null, 0.0, -0.0);
    }
    
    /**
    @utbot.classUnderTest {@link MultiStartUnivariateRealOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer#optimize(org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double)}
 * @utbot.throwsException {@link org.apache.commons.math.exception.TooManyEvaluationsException} in: return optimize(f, goal, min, max, 0);
 *  */
    @Test(expected = TooManyEvaluationsException.class)
    public void testOptimize_ThrowTooManyEvaluationsException() throws Exception  {
        MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer = ((MultiStartUnivariateRealOptimizer) createInstance("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer"));
        BrentOptimizer optimizer = ((BrentOptimizer) createInstance("org.apache.commons.math.optimization.univariate.BrentOptimizer"));
        Incrementor evaluations = ((Incrementor) createInstance("org.apache.commons.math.util.Incrementor"));
        setField(optimizer, "org.apache.commons.math.optimization.univariate.AbstractUnivariateRealOptimizer", "evaluations", evaluations);
        setField(optimizer, "org.apache.commons.math.optimization.univariate.AbstractUnivariateRealOptimizer", "searchMin", 0.0);
        setField(optimizer, "org.apache.commons.math.optimization.univariate.AbstractUnivariateRealOptimizer", "searchMax", 0.0);
        setField(optimizer, "org.apache.commons.math.optimization.univariate.AbstractUnivariateRealOptimizer", "searchStart", 0.0);
        setField(multiStartUnivariateRealOptimizer, "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimizer", optimizer);
        setField(multiStartUnivariateRealOptimizer, "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "totalEvaluations", -255);
        setField(multiStartUnivariateRealOptimizer, "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "starts", 1);
        PolynomialFunction polynomialFunction = ((PolynomialFunction) createInstance("org.apache.commons.math.analysis.polynomials.PolynomialFunction"));
        GoalType goalType = GoalType.MAXIMIZE;
        
        multiStartUnivariateRealOptimizer.optimize(polynomialFunction, goalType, 4.9E-324, 4.9E-324);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method optimize(org.apache.commons.math.analysis.UnivariateRealFunction, org.apache.commons.math.optimization.GoalType, double, double)
    
    @Test
    public void testOptimize1() throws Exception  {
        BrentOptimizer brentOptimizer = ((BrentOptimizer) createInstance("org.apache.commons.math.optimization.univariate.BrentOptimizer"));
        Incrementor evaluations = ((Incrementor) createInstance("org.apache.commons.math.util.Incrementor"));
        evaluations.setMaximalCount(1073741824);
        setField(brentOptimizer, "org.apache.commons.math.optimization.univariate.AbstractUnivariateRealOptimizer", "evaluations", evaluations);
        setField(brentOptimizer, "org.apache.commons.math.optimization.univariate.AbstractUnivariateRealOptimizer", "searchMin", 0.0);
        setField(brentOptimizer, "org.apache.commons.math.optimization.univariate.AbstractUnivariateRealOptimizer", "searchMax", 0.0);
        setField(brentOptimizer, "org.apache.commons.math.optimization.univariate.AbstractUnivariateRealOptimizer", "searchStart", 0.0);
        Class multiStartUnivariateRealOptimizerClazz = Class.forName("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer");
        Class brentOptimizerType = Class.forName("org.apache.commons.math.optimization.univariate.BaseUnivariateRealOptimizer");
        Class intType = int.class;
        Class randomGeneratorType = Class.forName("org.apache.commons.math.random.RandomGenerator");
        Constructor multiStartUnivariateRealOptimizerConstructor = multiStartUnivariateRealOptimizerClazz.getDeclaredConstructor(brentOptimizerType, intType, randomGeneratorType);
        multiStartUnivariateRealOptimizerConstructor.setAccessible(true);
        java.lang.Object[] multiStartUnivariateRealOptimizerConstructorArguments = new java.lang.Object[3];
        multiStartUnivariateRealOptimizerConstructorArguments[0] = brentOptimizer;
        multiStartUnivariateRealOptimizerConstructorArguments[1] = 2;
        multiStartUnivariateRealOptimizerConstructorArguments[2] = ((Object) null);
        MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer = ((MultiStartUnivariateRealOptimizer) multiStartUnivariateRealOptimizerConstructor.newInstance(multiStartUnivariateRealOptimizerConstructorArguments));
        PolynomialFunction polynomialFunction = ((PolynomialFunction) createInstance("org.apache.commons.math.analysis.polynomials.PolynomialFunction"));
        double[] coefficients = {0.0};
        setField(polynomialFunction, "org.apache.commons.math.analysis.polynomials.PolynomialFunction", "coefficients", coefficients);
        GoalType goalType = GoalType.MAXIMIZE;
        
        /* This test fails because method [org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer.optimize] produces [java.lang.NullPointerException]
            org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer.optimize(MultiStartUnivariateRealOptimizer.java:160)
            org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer.optimize(MultiStartUnivariateRealOptimizer.java:146) */
        multiStartUnivariateRealOptimizer.optimize(polynomialFunction, goalType, 4.9E-324, 4.9E-324);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer.optimize
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method optimize(org.apache.commons.math.analysis.UnivariateRealFunction, org.apache.commons.math.optimization.GoalType, double, double, double)
    
    /**
    @utbot.classUnderTest {@link MultiStartUnivariateRealOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer#optimize(org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double,double)}
 * @utbot.invokes org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer#sortPairs(org.apache.commons.math.optimization.GoalType)
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} when: optima[0] == null
 *  */
    @Test
    public void testOptimize_ThrowArrayIndexOutOfBoundsException1() throws Exception  {
        MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer = ((MultiStartUnivariateRealOptimizer) createInstance("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer"));
        setField(multiStartUnivariateRealOptimizer, "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "totalEvaluations", -255);
        
        /* This test fails because method [org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer.optimize] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer.optimize(MultiStartUnivariateRealOptimizer.java:176) */
        multiStartUnivariateRealOptimizer.optimize(null, null, java.lang.Double.NaN, java.lang.Double.NaN, java.lang.Double.NaN);
    }
    
    /**
    @utbot.classUnderTest {@link MultiStartUnivariateRealOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer#optimize(org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double,double)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < starts; ++i)} once
 * @utbot.throwsException {@link java.lang.NegativeArraySizeException} in: optima[i] = optimizer.optimize(f, goal, FastMath.min(bound1, bound2), FastMath.max(bound1, bound2));
 *  */
    @Test
    public void testOptimize_ThrowNegativeArraySizeException_11() throws Exception  {
        MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer = ((MultiStartUnivariateRealOptimizer) createInstance("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer"));
        MultiStartUnivariateRealOptimizer optimizer = ((MultiStartUnivariateRealOptimizer) createInstance("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer"));
        setField(optimizer, "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "starts", Integer.MIN_VALUE);
        setField(multiStartUnivariateRealOptimizer, "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimizer", optimizer);
        setField(multiStartUnivariateRealOptimizer, "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "totalEvaluations", -255);
        setField(multiStartUnivariateRealOptimizer, "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "starts", 1);
        
        /* This test fails because method [org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer.optimize] produces [java.lang.NegativeArraySizeException: -2147483648]
            org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer.optimize(MultiStartUnivariateRealOptimizer.java:154)
            org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer.optimize(MultiStartUnivariateRealOptimizer.java:146)
            org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer.optimize(MultiStartUnivariateRealOptimizer.java:162) */
        multiStartUnivariateRealOptimizer.optimize(null, null, 0.0, -0.0, java.lang.Double.NaN);
    }
    
    /**
    @utbot.classUnderTest {@link MultiStartUnivariateRealOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer#optimize(org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double,double)}
 * @utbot.throwsException {@link java.lang.NegativeArraySizeException} in: optima = new UnivariateRealPointValuePair[starts];
 *  */
    @Test
    public void testOptimize_ThrowNegativeArraySizeException1() throws FunctionEvaluationException  {
        MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer = new MultiStartUnivariateRealOptimizer(null, -256, null);
        
        /* This test fails because method [org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer.optimize] produces [java.lang.NegativeArraySizeException: -256]
            org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer.optimize(MultiStartUnivariateRealOptimizer.java:154) */
        multiStartUnivariateRealOptimizer.optimize(null, null, java.lang.Double.NaN, java.lang.Double.NaN, java.lang.Double.NaN);
    }
    
    /**
    @utbot.classUnderTest {@link MultiStartUnivariateRealOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer#optimize(org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double,double)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < starts; ++i)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: optima[i] = optimizer.optimize(f, goal, FastMath.min(bound1, bound2), FastMath.max(bound1, bound2));
 *  */
    @Test
    public void testOptimize_ThrowArrayIndexOutOfBoundsException_11() throws Exception  {
        MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer = ((MultiStartUnivariateRealOptimizer) createInstance("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer"));
        Object optimizer = createInstance("org.apache.commons.math.optimization.direct.PowellOptimizer$LineSearch");
        Incrementor evaluations = ((Incrementor) createInstance("org.apache.commons.math.util.Incrementor"));
        evaluations.setMaximalCount(1);
        setField(optimizer, "org.apache.commons.math.optimization.univariate.AbstractUnivariateRealOptimizer", "evaluations", evaluations);
        setField(optimizer, "org.apache.commons.math.optimization.univariate.AbstractUnivariateRealOptimizer", "searchMin", 0.0);
        setField(optimizer, "org.apache.commons.math.optimization.univariate.AbstractUnivariateRealOptimizer", "searchMax", 0.0);
        setField(optimizer, "org.apache.commons.math.optimization.univariate.AbstractUnivariateRealOptimizer", "searchStart", 0.0);
        setField(multiStartUnivariateRealOptimizer, "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimizer", optimizer);
        setField(multiStartUnivariateRealOptimizer, "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "totalEvaluations", -255);
        setField(multiStartUnivariateRealOptimizer, "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "starts", 1);
        org.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair[] optima = {null};
        setField(multiStartUnivariateRealOptimizer, "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optima", optima);
        PolynomialSplineFunction polynomialSplineFunction = ((PolynomialSplineFunction) createInstance("org.apache.commons.math.analysis.polynomials.PolynomialSplineFunction"));
        double[] knots = {};
        setField(polynomialSplineFunction, "org.apache.commons.math.analysis.polynomials.PolynomialSplineFunction", "knots", knots);
        GoalType goalType = GoalType.MINIMIZE;
        
        /* This test fails because method [org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer.optimize] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.analysis.polynomials.PolynomialSplineFunction.value(PolynomialSplineFunction.java:137)
            org.apache.commons.math.optimization.univariate.AbstractUnivariateRealOptimizer.computeObjectiveValue(AbstractUnivariateRealOptimizer.java:110)
            org.apache.commons.math.optimization.univariate.BrentOptimizer.doOptimize(BrentOptimizer.java:114)
            org.apache.commons.math.optimization.univariate.AbstractUnivariateRealOptimizer.optimize(AbstractUnivariateRealOptimizer.java:136)
            org.apache.commons.math.optimization.univariate.AbstractUnivariateRealOptimizer.optimize(AbstractUnivariateRealOptimizer.java:144)
            org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer.optimize(MultiStartUnivariateRealOptimizer.java:162) */
        multiStartUnivariateRealOptimizer.optimize(polynomialSplineFunction, goalType, 1.2500000000000029, -18.750000000000004, java.lang.Double.NaN);
    }
    
    /**
    @utbot.classUnderTest {@link MultiStartUnivariateRealOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer#optimize(org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double,double)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < starts; ++i)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: optima[i] = optimizer.optimize(f, goal, FastMath.min(bound1, bound2), FastMath.max(bound1, bound2));
 *  */
    @Test
    public void testOptimize_ThrowNullPointerException_2() throws Exception  {
        MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer = ((MultiStartUnivariateRealOptimizer) createInstance("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer"));
        setField(multiStartUnivariateRealOptimizer, "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "totalEvaluations", -255);
        setField(multiStartUnivariateRealOptimizer, "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "starts", 1);
        org.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair[] optima = {null, null};
        setField(multiStartUnivariateRealOptimizer, "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optima", optima);
        
        /* This test fails because method [org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer.optimize] produces [java.lang.NullPointerException]
            org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer.optimize(MultiStartUnivariateRealOptimizer.java:162) */
        multiStartUnivariateRealOptimizer.optimize(null, null, 2.916448822008101E-303, -2.224992906599707E-308, java.lang.Double.NaN);
    }
    
    /**
    @utbot.classUnderTest {@link MultiStartUnivariateRealOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer#optimize(org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double,double)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < starts; ++i)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: optima[i] = optimizer.optimize(f, goal, FastMath.min(bound1, bound2), FastMath.max(bound1, bound2));
 *  */
    @Test
    public void testOptimize_ThrowNullPointerException() throws Exception  {
        MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer = ((MultiStartUnivariateRealOptimizer) createInstance("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer"));
        setField(multiStartUnivariateRealOptimizer, "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "totalEvaluations", -255);
        setField(multiStartUnivariateRealOptimizer, "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "starts", 1);
        
        /* This test fails because method [org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer.optimize] produces [java.lang.NullPointerException]
            org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer.optimize(MultiStartUnivariateRealOptimizer.java:162) */
        multiStartUnivariateRealOptimizer.optimize(null, null, 0.0, -0.0, java.lang.Double.NaN);
    }
    
    /**
    @utbot.classUnderTest {@link MultiStartUnivariateRealOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer#optimize(org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double,double)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < starts; ++i)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: optima[i] = optimizer.optimize(f, goal, FastMath.min(bound1, bound2), FastMath.max(bound1, bound2));
 *  */
    @Test
    public void testOptimize_ThrowNullPointerException_1() throws Exception  {
        MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer = ((MultiStartUnivariateRealOptimizer) createInstance("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer"));
        setField(multiStartUnivariateRealOptimizer, "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "totalEvaluations", -255);
        setField(multiStartUnivariateRealOptimizer, "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "starts", 1);
        
        /* This test fails because method [org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer.optimize] produces [java.lang.NullPointerException]
            org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer.optimize(MultiStartUnivariateRealOptimizer.java:162) */
        multiStartUnivariateRealOptimizer.optimize(null, null, java.lang.Double.POSITIVE_INFINITY, java.lang.Double.NEGATIVE_INFINITY, java.lang.Double.NaN);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method optimize(org.apache.commons.math.analysis.UnivariateRealFunction, org.apache.commons.math.optimization.GoalType, double, double, double)
    
    /**
    @utbot.classUnderTest {@link MultiStartUnivariateRealOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer#optimize(org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double,double)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < starts; ++i)} once
 * @utbot.throwsException {@link org.apache.commons.math.exception.NullArgumentException} in: optima[i] = optimizer.optimize(f, goal, FastMath.min(bound1, bound2), FastMath.max(bound1, bound2));
 *  */
    @Test(expected = NullArgumentException.class)
    public void testOptimize_ThrowNullArgumentException1() throws Exception  {
        MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer = ((MultiStartUnivariateRealOptimizer) createInstance("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer"));
        BrentOptimizer optimizer = ((BrentOptimizer) createInstance("org.apache.commons.math.optimization.univariate.BrentOptimizer"));
        setField(multiStartUnivariateRealOptimizer, "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimizer", optimizer);
        setField(multiStartUnivariateRealOptimizer, "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "totalEvaluations", -255);
        setField(multiStartUnivariateRealOptimizer, "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "starts", 1);
        org.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair[] optima = {null, null};
        setField(multiStartUnivariateRealOptimizer, "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optima", optima);
        PolynomialFunction polynomialFunction = ((PolynomialFunction) createInstance("org.apache.commons.math.analysis.polynomials.PolynomialFunction"));
        
        multiStartUnivariateRealOptimizer.optimize(polynomialFunction, null, 1.0864618451323E-311, -5.696199942396927E-306, java.lang.Double.NaN);
    }
    
    /**
    @utbot.classUnderTest {@link MultiStartUnivariateRealOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer#optimize(org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double,double)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < starts; ++i)} once
 * @utbot.throwsException {@link org.apache.commons.math.exception.NullArgumentException} in: optima[i] = optimizer.optimize(f, goal, FastMath.min(bound1, bound2), FastMath.max(bound1, bound2));
 *  */
    @Test(expected = NullArgumentException.class)
    public void testOptimize_ThrowNullArgumentException_11() throws Exception  {
        MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer = ((MultiStartUnivariateRealOptimizer) createInstance("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer"));
        BrentOptimizer optimizer = ((BrentOptimizer) createInstance("org.apache.commons.math.optimization.univariate.BrentOptimizer"));
        setField(multiStartUnivariateRealOptimizer, "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimizer", optimizer);
        setField(multiStartUnivariateRealOptimizer, "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "totalEvaluations", -255);
        setField(multiStartUnivariateRealOptimizer, "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "starts", 1);
        org.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair[] optima = {null};
        setField(multiStartUnivariateRealOptimizer, "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optima", optima);
        
        multiStartUnivariateRealOptimizer.optimize(null, null, 1.717986918400006E10, -1.3745573069600012E11, java.lang.Double.NaN);
    }
    
    /**
    @utbot.classUnderTest {@link MultiStartUnivariateRealOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer#optimize(org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double,double)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < starts; ++i)} once
 * @utbot.throwsException {@link org.apache.commons.math.exception.TooManyEvaluationsException} in: optima[i] = optimizer.optimize(f, goal, FastMath.min(bound1, bound2), FastMath.max(bound1, bound2));
 *  */
    @Test(expected = TooManyEvaluationsException.class)
    public void testOptimize_ThrowTooManyEvaluationsException_2() throws Exception  {
        MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer = ((MultiStartUnivariateRealOptimizer) createInstance("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer"));
        BrentOptimizer optimizer = ((BrentOptimizer) createInstance("org.apache.commons.math.optimization.univariate.BrentOptimizer"));
        Incrementor evaluations = ((Incrementor) createInstance("org.apache.commons.math.util.Incrementor"));
        setField(optimizer, "org.apache.commons.math.optimization.univariate.AbstractUnivariateRealOptimizer", "evaluations", evaluations);
        GoalType goal = GoalType.MINIMIZE;
        setField(optimizer, "org.apache.commons.math.optimization.univariate.AbstractUnivariateRealOptimizer", "goal", goal);
        setField(optimizer, "org.apache.commons.math.optimization.univariate.AbstractUnivariateRealOptimizer", "searchMin", 0.0);
        setField(optimizer, "org.apache.commons.math.optimization.univariate.AbstractUnivariateRealOptimizer", "searchMax", 0.0);
        setField(optimizer, "org.apache.commons.math.optimization.univariate.AbstractUnivariateRealOptimizer", "searchStart", 0.0);
        setField(multiStartUnivariateRealOptimizer, "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimizer", optimizer);
        setField(multiStartUnivariateRealOptimizer, "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "totalEvaluations", -255);
        setField(multiStartUnivariateRealOptimizer, "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "starts", 1);
        org.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair[] optima = {null};
        setField(multiStartUnivariateRealOptimizer, "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optima", optima);
        PolynomialSplineFunction polynomialSplineFunction = ((PolynomialSplineFunction) createInstance("org.apache.commons.math.analysis.polynomials.PolynomialSplineFunction"));
        GoalType goalType = GoalType.MAXIMIZE;
        
        multiStartUnivariateRealOptimizer.optimize(polynomialSplineFunction, goalType, 4.9E-324, 4.9E-324, java.lang.Double.NaN);
    }
    
    /**
    @utbot.classUnderTest {@link MultiStartUnivariateRealOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer#optimize(org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double,double)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < starts; ++i)} once
 * @utbot.throwsException {@link org.apache.commons.math.exception.TooManyEvaluationsException} in: optima[i] = optimizer.optimize(f, goal, FastMath.min(bound1, bound2), FastMath.max(bound1, bound2));
 *  */
    @Test(expected = TooManyEvaluationsException.class)
    public void testOptimize_ThrowTooManyEvaluationsException1() throws Exception  {
        MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer = ((MultiStartUnivariateRealOptimizer) createInstance("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer"));
        BrentOptimizer optimizer = ((BrentOptimizer) createInstance("org.apache.commons.math.optimization.univariate.BrentOptimizer"));
        Incrementor evaluations = ((Incrementor) createInstance("org.apache.commons.math.util.Incrementor"));
        setField(optimizer, "org.apache.commons.math.optimization.univariate.AbstractUnivariateRealOptimizer", "evaluations", evaluations);
        setField(optimizer, "org.apache.commons.math.optimization.univariate.AbstractUnivariateRealOptimizer", "searchMin", 0.0);
        setField(optimizer, "org.apache.commons.math.optimization.univariate.AbstractUnivariateRealOptimizer", "searchMax", 0.0);
        setField(optimizer, "org.apache.commons.math.optimization.univariate.AbstractUnivariateRealOptimizer", "searchStart", 0.0);
        setField(multiStartUnivariateRealOptimizer, "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimizer", optimizer);
        setField(multiStartUnivariateRealOptimizer, "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "totalEvaluations", -255);
        setField(multiStartUnivariateRealOptimizer, "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "starts", 1);
        org.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair[] optima = {null};
        setField(multiStartUnivariateRealOptimizer, "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optima", optima);
        GaussianFunction gaussianFunction = ((GaussianFunction) createInstance("org.apache.commons.math.optimization.fitting.GaussianFunction"));
        GoalType goalType = GoalType.MAXIMIZE;
        
        multiStartUnivariateRealOptimizer.optimize(gaussianFunction, goalType, 0.0, -9.066144E-318, java.lang.Double.NaN);
    }
    
    /**
    @utbot.classUnderTest {@link MultiStartUnivariateRealOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer#optimize(org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double,double)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < starts; ++i)} once
 * @utbot.throwsException {@link org.apache.commons.math.exception.TooManyEvaluationsException} in: optima[i] = optimizer.optimize(f, goal, FastMath.min(bound1, bound2), FastMath.max(bound1, bound2));
 *  */
    @Test(expected = TooManyEvaluationsException.class)
    public void testOptimize_ThrowTooManyEvaluationsException_1() throws Exception  {
        MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer = ((MultiStartUnivariateRealOptimizer) createInstance("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer"));
        Object optimizer = createInstance("org.apache.commons.math.optimization.direct.PowellOptimizer$LineSearch");
        Incrementor evaluations = ((Incrementor) createInstance("org.apache.commons.math.util.Incrementor"));
        setField(optimizer, "org.apache.commons.math.optimization.univariate.AbstractUnivariateRealOptimizer", "evaluations", evaluations);
        setField(optimizer, "org.apache.commons.math.optimization.univariate.AbstractUnivariateRealOptimizer", "searchMin", 0.0);
        setField(optimizer, "org.apache.commons.math.optimization.univariate.AbstractUnivariateRealOptimizer", "searchMax", 0.0);
        setField(optimizer, "org.apache.commons.math.optimization.univariate.AbstractUnivariateRealOptimizer", "searchStart", 0.0);
        setField(multiStartUnivariateRealOptimizer, "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimizer", optimizer);
        setField(multiStartUnivariateRealOptimizer, "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "totalEvaluations", -255);
        setField(multiStartUnivariateRealOptimizer, "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "starts", 1);
        org.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair[] optima = {null};
        setField(multiStartUnivariateRealOptimizer, "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optima", optima);
        PolynomialFunction polynomialFunction = ((PolynomialFunction) createInstance("org.apache.commons.math.analysis.polynomials.PolynomialFunction"));
        GoalType goalType = GoalType.MINIMIZE;
        
        multiStartUnivariateRealOptimizer.optimize(polynomialFunction, goalType, 0.0, -1.7800726675788233E-307, java.lang.Double.NaN);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method optimize(org.apache.commons.math.analysis.UnivariateRealFunction, org.apache.commons.math.optimization.GoalType, double, double, double)
    
    @Test
    public void testOptimize2() throws Exception  {
        BrentOptimizer brentOptimizer = ((BrentOptimizer) createInstance("org.apache.commons.math.optimization.univariate.BrentOptimizer"));
        Incrementor evaluations = ((Incrementor) createInstance("org.apache.commons.math.util.Incrementor"));
        evaluations.setMaximalCount(1073741824);
        setField(brentOptimizer, "org.apache.commons.math.optimization.univariate.AbstractUnivariateRealOptimizer", "evaluations", evaluations);
        setField(brentOptimizer, "org.apache.commons.math.optimization.univariate.AbstractUnivariateRealOptimizer", "searchMin", 0.0);
        setField(brentOptimizer, "org.apache.commons.math.optimization.univariate.AbstractUnivariateRealOptimizer", "searchMax", 0.0);
        setField(brentOptimizer, "org.apache.commons.math.optimization.univariate.AbstractUnivariateRealOptimizer", "searchStart", 0.0);
        Class multiStartUnivariateRealOptimizerClazz = Class.forName("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer");
        Class brentOptimizerType = Class.forName("org.apache.commons.math.optimization.univariate.BaseUnivariateRealOptimizer");
        Class intType = int.class;
        Class randomGeneratorType = Class.forName("org.apache.commons.math.random.RandomGenerator");
        Constructor multiStartUnivariateRealOptimizerConstructor = multiStartUnivariateRealOptimizerClazz.getDeclaredConstructor(brentOptimizerType, intType, randomGeneratorType);
        multiStartUnivariateRealOptimizerConstructor.setAccessible(true);
        java.lang.Object[] multiStartUnivariateRealOptimizerConstructorArguments = new java.lang.Object[3];
        multiStartUnivariateRealOptimizerConstructorArguments[0] = brentOptimizer;
        multiStartUnivariateRealOptimizerConstructorArguments[1] = 1;
        multiStartUnivariateRealOptimizerConstructorArguments[2] = ((Object) null);
        MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer = ((MultiStartUnivariateRealOptimizer) multiStartUnivariateRealOptimizerConstructor.newInstance(multiStartUnivariateRealOptimizerConstructorArguments));
        PolynomialSplineFunction polynomialSplineFunction = ((PolynomialSplineFunction) createInstance("org.apache.commons.math.analysis.polynomials.PolynomialSplineFunction"));
        double[] knots = {};
        setField(polynomialSplineFunction, "org.apache.commons.math.analysis.polynomials.PolynomialSplineFunction", "knots", knots);
        GoalType goalType = GoalType.MINIMIZE;
        
        /* This test fails because method [org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer.optimize] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.analysis.polynomials.PolynomialSplineFunction.value(PolynomialSplineFunction.java:137)
            org.apache.commons.math.optimization.univariate.AbstractUnivariateRealOptimizer.computeObjectiveValue(AbstractUnivariateRealOptimizer.java:110)
            org.apache.commons.math.optimization.univariate.BrentOptimizer.doOptimize(BrentOptimizer.java:114)
            org.apache.commons.math.optimization.univariate.AbstractUnivariateRealOptimizer.optimize(AbstractUnivariateRealOptimizer.java:136)
            org.apache.commons.math.optimization.univariate.AbstractUnivariateRealOptimizer.optimize(AbstractUnivariateRealOptimizer.java:144)
            org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer.optimize(MultiStartUnivariateRealOptimizer.java:162) */
        multiStartUnivariateRealOptimizer.optimize(polynomialSplineFunction, goalType, 0.0, -0.0, java.lang.Double.NaN);
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method optimize(org.apache.commons.math.analysis.UnivariateRealFunction, org.apache.commons.math.optimization.GoalType, double, double, double)
    
    @Test(expected = NullArgumentException.class)
    public void testOptimize3() throws Exception  {
        MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer = ((MultiStartUnivariateRealOptimizer) createInstance("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer"));
        BrentOptimizer optimizer = ((BrentOptimizer) createInstance("org.apache.commons.math.optimization.univariate.BrentOptimizer"));
        setField(multiStartUnivariateRealOptimizer, "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optimizer", optimizer);
        setField(multiStartUnivariateRealOptimizer, "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "starts", 1);
        org.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair[] optima = {null, null, null, null, null, null, null, null, null, null};
        setField(multiStartUnivariateRealOptimizer, "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer", "optima", optima);
        
        multiStartUnivariateRealOptimizer.optimize(null, null, 6.905116901918149E-307, java.lang.Double.NaN, java.lang.Double.NaN);
    }
    ///endregion
    
    ///region OTHER: TIMEOUTS for method optimize(org.apache.commons.math.analysis.UnivariateRealFunction, org.apache.commons.math.optimization.GoalType, double, double, double)
    
    @Test(timeout = 1000L)
    public void testOptimize4() throws Exception  {
        BrentOptimizer brentOptimizer = ((BrentOptimizer) createInstance("org.apache.commons.math.optimization.univariate.BrentOptimizer"));
        Incrementor evaluations = ((Incrementor) createInstance("org.apache.commons.math.util.Incrementor"));
        evaluations.setMaximalCount(1073741824);
        setField(brentOptimizer, "org.apache.commons.math.optimization.univariate.AbstractUnivariateRealOptimizer", "evaluations", evaluations);
        setField(brentOptimizer, "org.apache.commons.math.optimization.univariate.AbstractUnivariateRealOptimizer", "searchMin", 0.0);
        setField(brentOptimizer, "org.apache.commons.math.optimization.univariate.AbstractUnivariateRealOptimizer", "searchMax", 0.0);
        setField(brentOptimizer, "org.apache.commons.math.optimization.univariate.AbstractUnivariateRealOptimizer", "searchStart", 0.0);
        Class multiStartUnivariateRealOptimizerClazz = Class.forName("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer");
        Class brentOptimizerType = Class.forName("org.apache.commons.math.optimization.univariate.BaseUnivariateRealOptimizer");
        Class intType = int.class;
        Class randomGeneratorType = Class.forName("org.apache.commons.math.random.RandomGenerator");
        Constructor multiStartUnivariateRealOptimizerConstructor = multiStartUnivariateRealOptimizerClazz.getDeclaredConstructor(brentOptimizerType, intType, randomGeneratorType);
        multiStartUnivariateRealOptimizerConstructor.setAccessible(true);
        java.lang.Object[] multiStartUnivariateRealOptimizerConstructorArguments = new java.lang.Object[3];
        multiStartUnivariateRealOptimizerConstructorArguments[0] = brentOptimizer;
        multiStartUnivariateRealOptimizerConstructorArguments[1] = 1;
        multiStartUnivariateRealOptimizerConstructorArguments[2] = ((Object) null);
        MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer = ((MultiStartUnivariateRealOptimizer) multiStartUnivariateRealOptimizerConstructor.newInstance(multiStartUnivariateRealOptimizerConstructorArguments));
        PolynomialFunction polynomialFunction = ((PolynomialFunction) createInstance("org.apache.commons.math.analysis.polynomials.PolynomialFunction"));
        double[] coefficients = {
            java.lang.Double.NaN, java.lang.Double.NaN, java.lang.Double.NaN, java.lang.Double.NaN, java.lang.Double.NaN, java.lang.Double.NaN,
            java.lang.Double.NaN, java.lang.Double.NaN, java.lang.Double.NaN
        };
        setField(polynomialFunction, "org.apache.commons.math.analysis.polynomials.PolynomialFunction", "coefficients", coefficients);
        GoalType goalType = GoalType.MAXIMIZE;
        
        /* This execution may take longer than the 1000 ms timeout
         and therefore fail due to exceeding the timeout. */
        multiStartUnivariateRealOptimizer.optimize(polynomialFunction, goalType, -4.2731881452837155E96, 7.573671341608384E-270, java.lang.Double.NaN);
    }
    
    @Test(timeout = 1000L)
    public void testOptimize5() throws Exception  {
        Object lineSearch = createInstance("org.apache.commons.math.optimization.direct.PowellOptimizer$LineSearch");
        Incrementor evaluations = ((Incrementor) createInstance("org.apache.commons.math.util.Incrementor"));
        evaluations.setMaximalCount(1073741824);
        setField(lineSearch, "org.apache.commons.math.optimization.univariate.AbstractUnivariateRealOptimizer", "evaluations", evaluations);
        setField(lineSearch, "org.apache.commons.math.optimization.univariate.AbstractUnivariateRealOptimizer", "searchMin", 0.0);
        setField(lineSearch, "org.apache.commons.math.optimization.univariate.AbstractUnivariateRealOptimizer", "searchMax", 0.0);
        setField(lineSearch, "org.apache.commons.math.optimization.univariate.AbstractUnivariateRealOptimizer", "searchStart", 0.0);
        Class multiStartUnivariateRealOptimizerClazz = Class.forName("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer");
        Class lineSearchType = Class.forName("org.apache.commons.math.optimization.univariate.BaseUnivariateRealOptimizer");
        Class intType = int.class;
        Class randomGeneratorType = Class.forName("org.apache.commons.math.random.RandomGenerator");
        Constructor multiStartUnivariateRealOptimizerConstructor = multiStartUnivariateRealOptimizerClazz.getDeclaredConstructor(lineSearchType, intType, randomGeneratorType);
        multiStartUnivariateRealOptimizerConstructor.setAccessible(true);
        java.lang.Object[] multiStartUnivariateRealOptimizerConstructorArguments = new java.lang.Object[3];
        multiStartUnivariateRealOptimizerConstructorArguments[0] = lineSearch;
        multiStartUnivariateRealOptimizerConstructorArguments[1] = 9;
        multiStartUnivariateRealOptimizerConstructorArguments[2] = ((Object) null);
        MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer = ((MultiStartUnivariateRealOptimizer) multiStartUnivariateRealOptimizerConstructor.newInstance(multiStartUnivariateRealOptimizerConstructorArguments));
        PolynomialFunction polynomialFunction = ((PolynomialFunction) createInstance("org.apache.commons.math.analysis.polynomials.PolynomialFunction"));
        double[] coefficients = {java.lang.Double.NaN, java.lang.Double.NaN, java.lang.Double.NaN};
        setField(polynomialFunction, "org.apache.commons.math.analysis.polynomials.PolynomialFunction", "coefficients", coefficients);
        GoalType goalType = GoalType.MINIMIZE;
        
        /* This execution may take longer than the 1000 ms timeout
         and therefore fail due to exceeding the timeout. */
        multiStartUnivariateRealOptimizer.optimize(polynomialFunction, goalType, 2.000000983593113, -2.3603031857778213E-5, java.lang.Double.NaN);
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
        
                java.lang.reflect.Method methodForGetDeclaredFields736609334392100 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields736609334392100.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass736609334395600 = (java.lang.reflect.Field[]) methodForGetDeclaredFields736609334392100.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass736609334395600).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
        modifiersField.setAccessible(true);
        modifiersField.setInt(field, field.getModifiers() & ~java.lang.reflect.Modifier.FINAL);
    
        field.setAccessible(true);
        field.set(object, fieldValue);
    }
    
    static class FieldsPair {
        final Object o1;
        final Object o2;
    
        public FieldsPair(Object o1, Object o2) {
            this.o1 = o1;
            this.o2 = o2;
        }
    
        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            FieldsPair that = (FieldsPair) o;
            return java.util.Objects.equals(o1, that.o1) && java.util.Objects.equals(o2, that.o2);
        }
    
        @Override
        public int hashCode() {
            return java.util.Objects.hash(o1, o2);
        }
    }
    
    private static boolean deepEquals(Object o1, Object o2) {
        return deepEquals(o1, o2, new java.util.HashSet<>());
    }
    
    private static boolean deepEquals(Object o1, Object o2, java.util.Set<FieldsPair> visited) {
        visited.add(new FieldsPair(o1, o2));
    
        if (o1 == o2) {
            return true;
        }
    
        if (o1 == null || o2 == null) {
            return false;
        }
    
        if (o1 instanceof Iterable) {
            if (!(o2 instanceof Iterable)) {
                return false;
            }
    
            return iterablesDeepEquals((Iterable<?>) o1, (Iterable<?>) o2, visited);
        }
        
        if (o2 instanceof Iterable) {
            return false;
        }
        
        if (o1 instanceof java.util.stream.BaseStream) {
            if (!(o2 instanceof java.util.stream.BaseStream)) {
                return false;
            }
    
            return streamsDeepEquals((java.util.stream.BaseStream<?, ?>) o1, (java.util.stream.BaseStream<?, ?>) o2, visited);
        }
    
        if (o2 instanceof java.util.stream.BaseStream) {
            return false;
        }
    
        if (o1 instanceof java.util.Map) {
            if (!(o2 instanceof java.util.Map)) {
                return false;
            }
    
            return mapsDeepEquals((java.util.Map<?, ?>) o1, (java.util.Map<?, ?>) o2, visited);
        }
        
        if (o2 instanceof java.util.Map) {
            return false;
        }
    
        Class<?> firstClass = o1.getClass();
        if (firstClass.isArray()) {
            if (!o2.getClass().isArray()) {
                return false;
            }
    
            // Primitive arrays should not appear here
            return arraysDeepEquals(o1, o2, visited);
        }
    
        // common classes
    
        // check if class has custom equals method (including wrappers and strings)
        // It is very important to check it here but not earlier because iterables and maps also have custom equals 
        // based on elements equals 
        if (hasCustomEquals(firstClass)) {
            return o1.equals(o2);
        }
    
        // common classes without custom equals, use comparison by fields
        final java.util.List<java.lang.reflect.Field> fields = new java.util.ArrayList<>();
        while (firstClass != Object.class) {
            fields.addAll(java.util.Arrays.asList(firstClass.getDeclaredFields()));
            // Interface should not appear here
            firstClass = firstClass.getSuperclass();
        }
    
        for (java.lang.reflect.Field field : fields) {
            field.setAccessible(true);
            try {
                final Object field1 = field.get(o1);
                final Object field2 = field.get(o2);
                if (!visited.contains(new FieldsPair(field1, field2)) && !deepEquals(field1, field2, visited)) {
                    return false;
                }
            } catch (IllegalArgumentException e) {
                return false;
            } catch (IllegalAccessException e) {
                // should never occur because field was set accessible
                return false;
            }
        }
    
        return true;
    }
    
    private static boolean arraysDeepEquals(Object arr1, Object arr2, java.util.Set<FieldsPair> visited) {
        final int length = java.lang.reflect.Array.getLength(arr1);
        if (length != java.lang.reflect.Array.getLength(arr2)) {
            return false;
        }
    
        for (int i = 0; i < length; i++) {
            if (!deepEquals(java.lang.reflect.Array.get(arr1, i), java.lang.reflect.Array.get(arr2, i), visited)) {
                return false;
            }
        }
    
        return true;
    }
    
    private static boolean iterablesDeepEquals(Iterable<?> i1, Iterable<?> i2, java.util.Set<FieldsPair> visited) {
        final java.util.Iterator<?> firstIterator = i1.iterator();
        final java.util.Iterator<?> secondIterator = i2.iterator();
        while (firstIterator.hasNext() && secondIterator.hasNext()) {
            if (!deepEquals(firstIterator.next(), secondIterator.next(), visited)) {
                return false;
            }
        }
    
        if (firstIterator.hasNext()) {
            return false;
        }
    
        return !secondIterator.hasNext();
    }
    
    private static boolean streamsDeepEquals(
        java.util.stream.BaseStream<?, ?> s1, 
        java.util.stream.BaseStream<?, ?> s2, 
        java.util.Set<FieldsPair> visited
    ) {
        final java.util.Iterator<?> firstIterator = s1.iterator();
        final java.util.Iterator<?> secondIterator = s2.iterator();
        while (firstIterator.hasNext() && secondIterator.hasNext()) {
            if (!deepEquals(firstIterator.next(), secondIterator.next(), visited)) {
                return false;
            }
        }
    
        if (firstIterator.hasNext()) {
            return false;
        }
    
        return !secondIterator.hasNext();
    }
    
    private static boolean mapsDeepEquals(
        java.util.Map<?, ?> m1, 
        java.util.Map<?, ?> m2, 
        java.util.Set<FieldsPair> visited
    ) {
        final java.util.Iterator<? extends java.util.Map.Entry<?, ?>> firstIterator = m1.entrySet().iterator();
        final java.util.Iterator<? extends java.util.Map.Entry<?, ?>> secondIterator = m2.entrySet().iterator();
        while (firstIterator.hasNext() && secondIterator.hasNext()) {
            final java.util.Map.Entry<?, ?> firstEntry = firstIterator.next();
            final java.util.Map.Entry<?, ?> secondEntry = secondIterator.next();
    
            if (!deepEquals(firstEntry.getKey(), secondEntry.getKey(), visited)) {
                return false;
            }
    
            if (!deepEquals(firstEntry.getValue(), secondEntry.getValue(), visited)) {
                return false;
            }
        }
    
        if (firstIterator.hasNext()) {
            return false;
        }
    
        return !secondIterator.hasNext();
    }
    
    private static boolean hasCustomEquals(Class<?> clazz) {
        while (!Object.class.equals(clazz)) {
            try {
                clazz.getDeclaredMethod("equals", Object.class);
                return true;
            } catch (Exception e) { 
                // Interface should not appear here
                clazz = clazz.getSuperclass();
            }
        }
    
        return false;
    }
    
    private static Object getFieldValue(Object obj, String fieldClassName, String fieldName) throws ClassNotFoundException, NoSuchMethodException, java.lang.reflect.InvocationTargetException, IllegalAccessException, NoSuchFieldException {
        Class<?> clazz = Class.forName(fieldClassName);
        java.lang.reflect.Field field = clazz.getDeclaredField(fieldName);
        
        field.setAccessible(true);
        
        java.lang.reflect.Field modifiersField;
        
            java.lang.reflect.Method methodForGetDeclaredFields736609338489000 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields736609338489000.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass736609338490300 = (java.lang.reflect.Field[]) methodForGetDeclaredFields736609338489000.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass736609338490300).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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

