package org.apache.commons.math.optimization;

import org.junit.Test;
import org.apache.commons.math.optimization.univariate.BrentOptimizer;
import org.apache.commons.math.analysis.polynomials.PolynomialSplineFunction;
import org.apache.commons.math.analysis.polynomials.PolynomialFunction;
import org.apache.commons.math.analysis.UnivariateRealFunction;
import org.apache.commons.math.exception.NoDataException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertArrayEquals;

public final class org_apache_commons_math_optimization_MultiStartUnivariateRealOptimizerTest {
    ///region Test suites for executable org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer.optimize
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method optimize(org.apache.commons.math.analysis.UnivariateRealFunction, org.apache.commons.math.optimization.GoalType, double, double)
    
    /**
    @utbot.classUnderTest {@link MultiStartUnivariateRealOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer#optimize(org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double)}
 * @utbot.throwsException {@link java.lang.NegativeArraySizeException} in: optima = new double[starts];
 *  */
    @Test
    public void testOptimize_ThrowNegativeArraySizeException() throws Exception  {
        MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer = ((MultiStartUnivariateRealOptimizer) createInstance("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer"));
        setField(multiStartUnivariateRealOptimizer, "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "starts", -256);
        
        /* This test fails because method [org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer.optimize] produces [java.lang.NegativeArraySizeException: -256]
            org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer.optimize(MultiStartUnivariateRealOptimizer.java:231) */
        multiStartUnivariateRealOptimizer.optimize(null, null, java.lang.Double.NaN, java.lang.Double.NaN);
    }
    
    /**
    @utbot.classUnderTest {@link MultiStartUnivariateRealOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer#optimize(org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: double currX = optima[0];
 *  */
    @Test
    public void testOptimize_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer = ((MultiStartUnivariateRealOptimizer) createInstance("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer"));
        setField(multiStartUnivariateRealOptimizer, "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "totalIterations", -255);
        setField(multiStartUnivariateRealOptimizer, "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "totalEvaluations", -255);
        
        /* This test fails because method [org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer.optimize] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer.optimize(MultiStartUnivariateRealOptimizer.java:272) */
        multiStartUnivariateRealOptimizer.optimize(null, null, java.lang.Double.NaN, java.lang.Double.NaN);
    }
    
    /**
    @utbot.classUnderTest {@link MultiStartUnivariateRealOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer#optimize(org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < starts; ++i)} once
 * @utbot.throwsException {@link java.lang.NegativeArraySizeException} in: optima[i] = optimizer.optimize(f, goalType, Math.min(bound1, bound2), Math.max(bound1, bound2));
 *  */
    @Test
    public void testOptimize_ThrowNegativeArraySizeException_1() throws Exception  {
        MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer = ((MultiStartUnivariateRealOptimizer) createInstance("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer"));
        MultiStartUnivariateRealOptimizer optimizer = ((MultiStartUnivariateRealOptimizer) createInstance("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer"));
        setField(optimizer, "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "starts", Integer.MIN_VALUE);
        setField(multiStartUnivariateRealOptimizer, "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "optimizer", optimizer);
        setField(multiStartUnivariateRealOptimizer, "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "maxIterations", -255);
        multiStartUnivariateRealOptimizer.setMaxEvaluations(-255);
        setField(multiStartUnivariateRealOptimizer, "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "totalIterations", -255);
        setField(multiStartUnivariateRealOptimizer, "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "totalEvaluations", -255);
        setField(multiStartUnivariateRealOptimizer, "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "starts", 1);
        double[] optimaValues = {0.0};
        setField(multiStartUnivariateRealOptimizer, "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "optimaValues", optimaValues);
        
        /* This test fails because method [org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer.optimize] produces [java.lang.NegativeArraySizeException: -2147483648]
            org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer.optimize(MultiStartUnivariateRealOptimizer.java:231)
            org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer.optimize(MultiStartUnivariateRealOptimizer.java:244) */
        multiStartUnivariateRealOptimizer.optimize(null, null, -2.4915070027561187E87, 6.573752387563842E-287);
    }
    
    /**
    @utbot.classUnderTest {@link MultiStartUnivariateRealOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer#optimize(org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < starts; ++i)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: optima[i] = optimizer.optimize(f, goalType, Math.min(bound1, bound2), Math.max(bound1, bound2));
 *  */
    @Test
    public void testOptimize_ThrowArrayIndexOutOfBoundsException_1() throws Exception  {
        MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer = ((MultiStartUnivariateRealOptimizer) createInstance("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer"));
        MultiStartUnivariateRealOptimizer optimizer = ((MultiStartUnivariateRealOptimizer) createInstance("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer"));
        setField(multiStartUnivariateRealOptimizer, "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "optimizer", optimizer);
        setField(multiStartUnivariateRealOptimizer, "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "maxIterations", -255);
        multiStartUnivariateRealOptimizer.setMaxEvaluations(-255);
        setField(multiStartUnivariateRealOptimizer, "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "totalIterations", -255);
        setField(multiStartUnivariateRealOptimizer, "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "totalEvaluations", -255);
        setField(multiStartUnivariateRealOptimizer, "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "starts", 1);
        double[] optima = {};
        setField(multiStartUnivariateRealOptimizer, "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "optima", optima);
        
        /* This test fails because method [org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer.optimize] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer.optimize(MultiStartUnivariateRealOptimizer.java:272)
            org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer.optimize(MultiStartUnivariateRealOptimizer.java:244) */
        multiStartUnivariateRealOptimizer.optimize(null, null, -1.44604064737172E-296, 1.6251939462536602E-303);
    }
    
    /**
    @utbot.classUnderTest {@link MultiStartUnivariateRealOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer#optimize(org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < starts; ++i)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: optimizer.setMaximalIterationCount(maxIterations - totalIterations);
 *  */
    @Test
    public void testOptimize_ThrowNullPointerException() throws Exception  {
        MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer = ((MultiStartUnivariateRealOptimizer) createInstance("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer"));
        setField(multiStartUnivariateRealOptimizer, "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "maxIterations", -255);
        setField(multiStartUnivariateRealOptimizer, "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "totalIterations", -255);
        setField(multiStartUnivariateRealOptimizer, "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "totalEvaluations", -255);
        setField(multiStartUnivariateRealOptimizer, "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "starts", 1);
        
        /* This test fails because method [org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer.optimize] produces [java.lang.NullPointerException]
            org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer.optimize(MultiStartUnivariateRealOptimizer.java:240) */
        multiStartUnivariateRealOptimizer.optimize(null, null, java.lang.Double.NaN, java.lang.Double.NaN);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method optimize(org.apache.commons.math.analysis.UnivariateRealFunction, org.apache.commons.math.optimization.GoalType, double, double)
    
    @Test
    public void testOptimize1() throws Exception  {
        Class brentOptimizerClazz = Class.forName("org.apache.commons.math.optimization.univariate.BrentOptimizer");
        double prevGOLDEN_SECTION = ((Double) getStaticFieldValue(brentOptimizerClazz, "GOLDEN_SECTION"));
        try {
            setStaticField(brentOptimizerClazz, "GOLDEN_SECTION", 2.125);
            MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer = ((MultiStartUnivariateRealOptimizer) createInstance("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer"));
            BrentOptimizer optimizer = ((BrentOptimizer) createInstance("org.apache.commons.math.optimization.univariate.BrentOptimizer"));
            setField(optimizer, "org.apache.commons.math.optimization.univariate.AbstractUnivariateRealOptimizer", "evaluations", -2);
            optimizer.setAbsoluteAccuracy(0.0);
            optimizer.setRelativeAccuracy(0.0);
            setField(multiStartUnivariateRealOptimizer, "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "optimizer", optimizer);
            setField(multiStartUnivariateRealOptimizer, "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "starts", 8);
            double[] optimaValues = {
                0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
                0.0, 0.0, 0.0, 0.0
            };
            setField(multiStartUnivariateRealOptimizer, "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "optimaValues", optimaValues);
            PolynomialSplineFunction polynomialSplineFunction = ((PolynomialSplineFunction) createInstance("org.apache.commons.math.analysis.polynomials.PolynomialSplineFunction"));
            double[] knots = {};
            setField(polynomialSplineFunction, "org.apache.commons.math.analysis.polynomials.PolynomialSplineFunction", "knots", knots);
            GoalType goalType = GoalType.MINIMIZE;
            
            /* This test fails because method [org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer.optimize] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
                org.apache.commons.math.analysis.polynomials.PolynomialSplineFunction.value(PolynomialSplineFunction.java:137)
                org.apache.commons.math.optimization.univariate.AbstractUnivariateRealOptimizer.computeObjectiveValue(AbstractUnivariateRealOptimizer.java:141)
                org.apache.commons.math.optimization.univariate.BrentOptimizer.localMin(BrentOptimizer.java:92)
                org.apache.commons.math.optimization.univariate.BrentOptimizer.optimize(BrentOptimizer.java:58)
                org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer.optimize(MultiStartUnivariateRealOptimizer.java:244) */
            multiStartUnivariateRealOptimizer.optimize(polynomialSplineFunction, goalType, 6.5322876648879244, 3.1742349408434546E-307);
        } finally {
            setStaticField(BrentOptimizer.class, "GOLDEN_SECTION", prevGOLDEN_SECTION);
        }
    }
    
    @Test
    public void testOptimize2() throws Exception  {
        Class brentOptimizerClazz = Class.forName("org.apache.commons.math.optimization.univariate.BrentOptimizer");
        double prevGOLDEN_SECTION = ((Double) getStaticFieldValue(brentOptimizerClazz, "GOLDEN_SECTION"));
        try {
            setStaticField(brentOptimizerClazz, "GOLDEN_SECTION", java.lang.Double.NaN);
            MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer = ((MultiStartUnivariateRealOptimizer) createInstance("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer"));
            BrentOptimizer optimizer = ((BrentOptimizer) createInstance("org.apache.commons.math.optimization.univariate.BrentOptimizer"));
            setField(optimizer, "org.apache.commons.math.optimization.univariate.AbstractUnivariateRealOptimizer", "evaluations", -2);
            optimizer.setAbsoluteAccuracy(0.0);
            optimizer.setRelativeAccuracy(0.0);
            setField(multiStartUnivariateRealOptimizer, "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "optimizer", optimizer);
            setField(multiStartUnivariateRealOptimizer, "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "maxIterations", 1);
            setField(multiStartUnivariateRealOptimizer, "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "starts", 1);
            PolynomialFunction polynomialFunction = ((PolynomialFunction) createInstance("org.apache.commons.math.analysis.polynomials.PolynomialFunction"));
            double[] coefficients = {0.0, 0.0};
            setField(polynomialFunction, "org.apache.commons.math.analysis.polynomials.PolynomialFunction", "coefficients", coefficients);
            GoalType goalType = GoalType.MAXIMIZE;
            
            /* This test fails because method [org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer.optimize] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
                org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer.optimize(MultiStartUnivariateRealOptimizer.java:266) */
            multiStartUnivariateRealOptimizer.optimize(polynomialFunction, goalType, 1.3773535389064515E161, -2.349435612840891E-152);
        } finally {
            setStaticField(BrentOptimizer.class, "GOLDEN_SECTION", prevGOLDEN_SECTION);
        }
    }
    
    @Test
    public void testOptimize3() throws Exception  {
        Class brentOptimizerClazz = Class.forName("org.apache.commons.math.optimization.univariate.BrentOptimizer");
        double prevGOLDEN_SECTION = ((Double) getStaticFieldValue(brentOptimizerClazz, "GOLDEN_SECTION"));
        try {
            setStaticField(brentOptimizerClazz, "GOLDEN_SECTION", java.lang.Double.NaN);
            MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer = ((MultiStartUnivariateRealOptimizer) createInstance("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer"));
            BrentOptimizer optimizer = ((BrentOptimizer) createInstance("org.apache.commons.math.optimization.univariate.BrentOptimizer"));
            setField(optimizer, "org.apache.commons.math.optimization.univariate.AbstractUnivariateRealOptimizer", "evaluations", 2147483646);
            optimizer.setAbsoluteAccuracy(0.0);
            optimizer.setRelativeAccuracy(0.0);
            setField(multiStartUnivariateRealOptimizer, "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "optimizer", optimizer);
            setField(multiStartUnivariateRealOptimizer, "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "starts", 2);
            double[] optima = {0.0};
            setField(multiStartUnivariateRealOptimizer, "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "optima", optima);
            double[] optimaValues = {};
            setField(multiStartUnivariateRealOptimizer, "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "optimaValues", optimaValues);
            UnivariateRealFunction anonymousUnivariateRealFunction = ((UnivariateRealFunction) createInstance("org.apache.commons.math.distribution.AbstractContinuousDistribution$1"));
            
            /* This test fails because method [org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer.optimize] produces [java.lang.NullPointerException]
                org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer.optimize(MultiStartUnivariateRealOptimizer.java:242) */
            multiStartUnivariateRealOptimizer.optimize(anonymousUnivariateRealFunction, null, 8.167285852549646E126, -1.2229125087607198E127);
        } finally {
            setStaticField(BrentOptimizer.class, "GOLDEN_SECTION", prevGOLDEN_SECTION);
        }
    }
    
    @Test
    public void testOptimize4() throws Exception  {
        Class brentOptimizerClazz = Class.forName("org.apache.commons.math.optimization.univariate.BrentOptimizer");
        double prevGOLDEN_SECTION = ((Double) getStaticFieldValue(brentOptimizerClazz, "GOLDEN_SECTION"));
        try {
            setStaticField(brentOptimizerClazz, "GOLDEN_SECTION", 2.096371964910304E-9);
            MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer = ((MultiStartUnivariateRealOptimizer) createInstance("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer"));
            BrentOptimizer optimizer = ((BrentOptimizer) createInstance("org.apache.commons.math.optimization.univariate.BrentOptimizer"));
            setField(optimizer, "org.apache.commons.math.optimization.univariate.AbstractUnivariateRealOptimizer", "evaluations", -2);
            optimizer.setAbsoluteAccuracy(0.0);
            optimizer.setRelativeAccuracy(0.0);
            setField(multiStartUnivariateRealOptimizer, "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "optimizer", optimizer);
            setField(multiStartUnivariateRealOptimizer, "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "starts", 2);
            double[] optima = {
                0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
                0.0, 0.0, 0.0, 0.0
            };
            setField(multiStartUnivariateRealOptimizer, "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "optima", optima);
            double[] optimaValues = {
                0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
                0.0, 0.0, 0.0
            };
            setField(multiStartUnivariateRealOptimizer, "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "optimaValues", optimaValues);
            PolynomialFunction polynomialFunction = ((PolynomialFunction) createInstance("org.apache.commons.math.analysis.polynomials.PolynomialFunction"));
            double[] coefficients = new double[18];
            setField(polynomialFunction, "org.apache.commons.math.analysis.polynomials.PolynomialFunction", "coefficients", coefficients);
            
            /* This test fails because method [org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer.optimize] produces [java.lang.NullPointerException]
                org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer.optimize(MultiStartUnivariateRealOptimizer.java:242) */
            multiStartUnivariateRealOptimizer.optimize(polynomialFunction, null, 1.9036514691460143E50, java.lang.Double.NaN);
        } finally {
            setStaticField(BrentOptimizer.class, "GOLDEN_SECTION", prevGOLDEN_SECTION);
        }
    }
    
    @Test
    public void testOptimize5() throws Exception  {
        Class brentOptimizerClazz = Class.forName("org.apache.commons.math.optimization.univariate.BrentOptimizer");
        double prevGOLDEN_SECTION = ((Double) getStaticFieldValue(brentOptimizerClazz, "GOLDEN_SECTION"));
        try {
            setStaticField(brentOptimizerClazz, "GOLDEN_SECTION", java.lang.Double.NaN);
            MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer = ((MultiStartUnivariateRealOptimizer) createInstance("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer"));
            BrentOptimizer optimizer = ((BrentOptimizer) createInstance("org.apache.commons.math.optimization.univariate.BrentOptimizer"));
            setField(optimizer, "org.apache.commons.math.optimization.univariate.AbstractUnivariateRealOptimizer", "evaluations", -52428801);
            optimizer.setAbsoluteAccuracy(0.0);
            optimizer.setRelativeAccuracy(0.0);
            setField(multiStartUnivariateRealOptimizer, "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "optimizer", optimizer);
            setField(multiStartUnivariateRealOptimizer, "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "maxIterations", 1);
            setField(multiStartUnivariateRealOptimizer, "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "starts", 9);
            PolynomialFunction polynomialFunction = ((PolynomialFunction) createInstance("org.apache.commons.math.analysis.polynomials.PolynomialFunction"));
            double[] coefficients = {0.0, 0.0};
            setField(polynomialFunction, "org.apache.commons.math.analysis.polynomials.PolynomialFunction", "coefficients", coefficients);
            GoalType goalType = GoalType.MINIMIZE;
            
            /* This test fails because method [org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer.optimize] produces [java.lang.NullPointerException]
                org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer.optimize(MultiStartUnivariateRealOptimizer.java:242) */
            multiStartUnivariateRealOptimizer.optimize(polynomialFunction, goalType, 1.480655979847938E33, 3.7157454840144776E16);
        } finally {
            setStaticField(BrentOptimizer.class, "GOLDEN_SECTION", prevGOLDEN_SECTION);
        }
    }
    
    @Test
    public void testOptimize6() throws Exception  {
        MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer = ((MultiStartUnivariateRealOptimizer) createInstance("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer"));
        MultiStartUnivariateRealOptimizer optimizer = ((MultiStartUnivariateRealOptimizer) createInstance("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer"));
        setField(optimizer, "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "starts", 9);
        setField(multiStartUnivariateRealOptimizer, "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "optimizer", optimizer);
        setField(multiStartUnivariateRealOptimizer, "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "starts", 9);
        double[] optima = {
            0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0
        };
        setField(multiStartUnivariateRealOptimizer, "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "optima", optima);
        GoalType goalType = GoalType.MAXIMIZE;
        
        /* This test fails because method [org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer.optimize] produces [java.lang.NullPointerException]
            org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer.optimize(MultiStartUnivariateRealOptimizer.java:240)
            org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer.optimize(MultiStartUnivariateRealOptimizer.java:244) */
        multiStartUnivariateRealOptimizer.optimize(null, goalType, -4.683673868980037E49, 1.421567075971829E-132);
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method optimize(org.apache.commons.math.analysis.UnivariateRealFunction, org.apache.commons.math.optimization.GoalType, double, double)
    
    @Test(expected = NoDataException.class)
    public void testOptimize7() throws Exception  {
        Class brentOptimizerClazz = Class.forName("org.apache.commons.math.optimization.univariate.BrentOptimizer");
        double prevGOLDEN_SECTION = ((Double) getStaticFieldValue(brentOptimizerClazz, "GOLDEN_SECTION"));
        try {
            setStaticField(brentOptimizerClazz, "GOLDEN_SECTION", 1.49609375);
            MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer = ((MultiStartUnivariateRealOptimizer) createInstance("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer"));
            BrentOptimizer optimizer = ((BrentOptimizer) createInstance("org.apache.commons.math.optimization.univariate.BrentOptimizer"));
            setField(optimizer, "org.apache.commons.math.optimization.univariate.AbstractUnivariateRealOptimizer", "evaluations", -2);
            optimizer.setAbsoluteAccuracy(0.0);
            optimizer.setRelativeAccuracy(0.0);
            setField(multiStartUnivariateRealOptimizer, "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "optimizer", optimizer);
            setField(multiStartUnivariateRealOptimizer, "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "starts", 16);
            PolynomialFunction polynomialFunction = ((PolynomialFunction) createInstance("org.apache.commons.math.analysis.polynomials.PolynomialFunction"));
            double[] coefficients = {};
            setField(polynomialFunction, "org.apache.commons.math.analysis.polynomials.PolynomialFunction", "coefficients", coefficients);
            GoalType goalType = GoalType.MINIMIZE;
            
            multiStartUnivariateRealOptimizer.optimize(polynomialFunction, goalType, 8.244671469420704E-230, -1.0305838185093101E-230);
        } finally {
            setStaticField(BrentOptimizer.class, "GOLDEN_SECTION", prevGOLDEN_SECTION);
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer.optimize
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method optimize(org.apache.commons.math.analysis.UnivariateRealFunction, org.apache.commons.math.optimization.GoalType, double, double, double)
    
    /**
    @utbot.classUnderTest {@link MultiStartUnivariateRealOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer#optimize(org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double,double)}
 * @utbot.throwsException {@link java.lang.NegativeArraySizeException} in: return optimize(f, goalType, min, max);
 *  */
    @Test
    public void testOptimize_ThrowNegativeArraySizeException1() throws Exception  {
        MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer = ((MultiStartUnivariateRealOptimizer) createInstance("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer"));
        setField(multiStartUnivariateRealOptimizer, "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "starts", -256);
        
        /* This test fails because method [org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer.optimize] produces [java.lang.NegativeArraySizeException: -256]
            org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer.optimize(MultiStartUnivariateRealOptimizer.java:231)
            org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer.optimize(MultiStartUnivariateRealOptimizer.java:316) */
        multiStartUnivariateRealOptimizer.optimize(null, null, java.lang.Double.NaN, java.lang.Double.NaN, java.lang.Double.NaN);
    }
    
    /**
    @utbot.classUnderTest {@link MultiStartUnivariateRealOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer#optimize(org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double,double)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return optimize(f, goalType, min, max);
 *  */
    @Test
    public void testOptimize_ThrowArrayIndexOutOfBoundsException1() throws Exception  {
        MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer = ((MultiStartUnivariateRealOptimizer) createInstance("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer"));
        setField(multiStartUnivariateRealOptimizer, "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "totalIterations", -255);
        setField(multiStartUnivariateRealOptimizer, "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "totalEvaluations", -255);
        
        /* This test fails because method [org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer.optimize] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer.optimize(MultiStartUnivariateRealOptimizer.java:272)
            org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer.optimize(MultiStartUnivariateRealOptimizer.java:316) */
        multiStartUnivariateRealOptimizer.optimize(null, null, java.lang.Double.NaN, java.lang.Double.NaN, java.lang.Double.NaN);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method optimize(org.apache.commons.math.analysis.UnivariateRealFunction, org.apache.commons.math.optimization.GoalType, double, double, double)
    
    @Test
    public void testOptimize8() throws Exception  {
        MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer = ((MultiStartUnivariateRealOptimizer) createInstance("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer"));
        MultiStartUnivariateRealOptimizer optimizer = ((MultiStartUnivariateRealOptimizer) createInstance("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer"));
        setField(multiStartUnivariateRealOptimizer, "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "optimizer", optimizer);
        setField(multiStartUnivariateRealOptimizer, "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "starts", 10);
        double[] optima = {
            0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0
        };
        setField(multiStartUnivariateRealOptimizer, "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "optima", optima);
        double[] optimaValues = {
            0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0
        };
        setField(multiStartUnivariateRealOptimizer, "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "optimaValues", optimaValues);
        GoalType goalType = GoalType.MINIMIZE;
        
        /* This test fails because method [org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer.optimize] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer.optimize(MultiStartUnivariateRealOptimizer.java:272)
            org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer.optimize(MultiStartUnivariateRealOptimizer.java:244)
            org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer.optimize(MultiStartUnivariateRealOptimizer.java:316) */
        multiStartUnivariateRealOptimizer.optimize(null, goalType, -0.0, -0.0, java.lang.Double.NaN);
    }
    
    @Test
    public void testOptimize9() throws Exception  {
        MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer = ((MultiStartUnivariateRealOptimizer) createInstance("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer"));
        MultiStartUnivariateRealOptimizer optimizer = ((MultiStartUnivariateRealOptimizer) createInstance("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer"));
        setField(optimizer, "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "starts", Integer.MIN_VALUE);
        setField(multiStartUnivariateRealOptimizer, "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "optimizer", optimizer);
        setField(multiStartUnivariateRealOptimizer, "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "starts", 9);
        double[] optimaValues = {
            0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0
        };
        setField(multiStartUnivariateRealOptimizer, "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "optimaValues", optimaValues);
        GoalType goalType = GoalType.MINIMIZE;
        
        /* This test fails because method [org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer.optimize] produces [java.lang.NegativeArraySizeException: -2147483648]
            org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer.optimize(MultiStartUnivariateRealOptimizer.java:231)
            org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer.optimize(MultiStartUnivariateRealOptimizer.java:244)
            org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer.optimize(MultiStartUnivariateRealOptimizer.java:316) */
        multiStartUnivariateRealOptimizer.optimize(null, goalType, 2.0000000000004547, 2.0000000000004547, java.lang.Double.NaN);
    }
    
    @Test
    public void testOptimize10() throws Exception  {
        Class brentOptimizerClazz = Class.forName("org.apache.commons.math.optimization.univariate.BrentOptimizer");
        double prevGOLDEN_SECTION = ((Double) getStaticFieldValue(brentOptimizerClazz, "GOLDEN_SECTION"));
        try {
            setStaticField(brentOptimizerClazz, "GOLDEN_SECTION", 0.29888916731590776);
            MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer = ((MultiStartUnivariateRealOptimizer) createInstance("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer"));
            BrentOptimizer optimizer = ((BrentOptimizer) createInstance("org.apache.commons.math.optimization.univariate.BrentOptimizer"));
            setField(optimizer, "org.apache.commons.math.optimization.univariate.AbstractUnivariateRealOptimizer", "evaluations", -2);
            optimizer.setAbsoluteAccuracy(0.0);
            optimizer.setRelativeAccuracy(0.0);
            setField(multiStartUnivariateRealOptimizer, "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "optimizer", optimizer);
            setField(multiStartUnivariateRealOptimizer, "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "starts", 12);
            double[] optima = {
                0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
                0.0, 0.0, 0.0, 0.0
            };
            setField(multiStartUnivariateRealOptimizer, "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "optima", optima);
            double[] optimaValues = {
                0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
                0.0, 0.0, 0.0
            };
            setField(multiStartUnivariateRealOptimizer, "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "optimaValues", optimaValues);
            PolynomialSplineFunction polynomialSplineFunction = ((PolynomialSplineFunction) createInstance("org.apache.commons.math.analysis.polynomials.PolynomialSplineFunction"));
            double[] knots = {};
            setField(polynomialSplineFunction, "org.apache.commons.math.analysis.polynomials.PolynomialSplineFunction", "knots", knots);
            
            /* This test fails because method [org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer.optimize] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
                org.apache.commons.math.analysis.polynomials.PolynomialSplineFunction.value(PolynomialSplineFunction.java:137)
                org.apache.commons.math.optimization.univariate.AbstractUnivariateRealOptimizer.computeObjectiveValue(AbstractUnivariateRealOptimizer.java:141)
                org.apache.commons.math.optimization.univariate.BrentOptimizer.localMin(BrentOptimizer.java:92)
                org.apache.commons.math.optimization.univariate.BrentOptimizer.optimize(BrentOptimizer.java:58)
                org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer.optimize(MultiStartUnivariateRealOptimizer.java:244)
                org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer.optimize(MultiStartUnivariateRealOptimizer.java:316) */
            multiStartUnivariateRealOptimizer.optimize(polynomialSplineFunction, null, -0.0, 2.225073858507202E-308, java.lang.Double.NaN);
        } finally {
            setStaticField(BrentOptimizer.class, "GOLDEN_SECTION", prevGOLDEN_SECTION);
        }
    }
    
    @Test
    public void testOptimize11() throws Exception  {
        Class brentOptimizerClazz = Class.forName("org.apache.commons.math.optimization.univariate.BrentOptimizer");
        double prevGOLDEN_SECTION = ((Double) getStaticFieldValue(brentOptimizerClazz, "GOLDEN_SECTION"));
        try {
            setStaticField(brentOptimizerClazz, "GOLDEN_SECTION", java.lang.Double.NaN);
            MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer = ((MultiStartUnivariateRealOptimizer) createInstance("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer"));
            BrentOptimizer optimizer = ((BrentOptimizer) createInstance("org.apache.commons.math.optimization.univariate.BrentOptimizer"));
            setField(optimizer, "org.apache.commons.math.optimization.univariate.AbstractUnivariateRealOptimizer", "evaluations", 2147483646);
            optimizer.setAbsoluteAccuracy(0.0);
            optimizer.setRelativeAccuracy(0.0);
            setField(multiStartUnivariateRealOptimizer, "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "optimizer", optimizer);
            setField(multiStartUnivariateRealOptimizer, "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "starts", 1);
            double[] optimaValues = {
                0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
                0.0, 0.0, 0.0
            };
            setField(multiStartUnivariateRealOptimizer, "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "optimaValues", optimaValues);
            
            /* This test fails because method [org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer.optimize] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
                org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer.optimize(MultiStartUnivariateRealOptimizer.java:266)
                org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer.optimize(MultiStartUnivariateRealOptimizer.java:316) */
            multiStartUnivariateRealOptimizer.optimize(null, null, -0.0, -2.000000000000014, java.lang.Double.NaN);
        } finally {
            setStaticField(BrentOptimizer.class, "GOLDEN_SECTION", prevGOLDEN_SECTION);
        }
    }
    
    @Test
    public void testOptimize12() throws Exception  {
        Class brentOptimizerClazz = Class.forName("org.apache.commons.math.optimization.univariate.BrentOptimizer");
        double prevGOLDEN_SECTION = ((Double) getStaticFieldValue(brentOptimizerClazz, "GOLDEN_SECTION"));
        try {
            setStaticField(brentOptimizerClazz, "GOLDEN_SECTION", java.lang.Double.NaN);
            MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer = ((MultiStartUnivariateRealOptimizer) createInstance("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer"));
            BrentOptimizer optimizer = ((BrentOptimizer) createInstance("org.apache.commons.math.optimization.univariate.BrentOptimizer"));
            setField(optimizer, "org.apache.commons.math.optimization.univariate.AbstractUnivariateRealOptimizer", "evaluations", -2);
            optimizer.setAbsoluteAccuracy(0.0);
            optimizer.setRelativeAccuracy(0.0);
            setField(multiStartUnivariateRealOptimizer, "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "optimizer", optimizer);
            setField(multiStartUnivariateRealOptimizer, "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "starts", 10);
            double[] optima = new double[12];
            setField(multiStartUnivariateRealOptimizer, "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "optima", optima);
            double[] optimaValues = {
                0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
                0.0, 0.0, 0.0
            };
            setField(multiStartUnivariateRealOptimizer, "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "optimaValues", optimaValues);
            PolynomialFunction polynomialFunction = ((PolynomialFunction) createInstance("org.apache.commons.math.analysis.polynomials.PolynomialFunction"));
            double[] coefficients = new double[33];
            setField(polynomialFunction, "org.apache.commons.math.analysis.polynomials.PolynomialFunction", "coefficients", coefficients);
            
            /* This test fails because method [org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer.optimize] produces [java.lang.NullPointerException]
                org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer.optimize(MultiStartUnivariateRealOptimizer.java:242)
                org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer.optimize(MultiStartUnivariateRealOptimizer.java:316) */
            multiStartUnivariateRealOptimizer.optimize(polynomialFunction, null, -0.0, java.lang.Double.NaN, java.lang.Double.NaN);
        } finally {
            setStaticField(BrentOptimizer.class, "GOLDEN_SECTION", prevGOLDEN_SECTION);
        }
    }
    
    @Test
    public void testOptimize13() throws Exception  {
        Class brentOptimizerClazz = Class.forName("org.apache.commons.math.optimization.univariate.BrentOptimizer");
        double prevGOLDEN_SECTION = ((Double) getStaticFieldValue(brentOptimizerClazz, "GOLDEN_SECTION"));
        try {
            setStaticField(brentOptimizerClazz, "GOLDEN_SECTION", java.lang.Double.NaN);
            MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer = ((MultiStartUnivariateRealOptimizer) createInstance("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer"));
            BrentOptimizer optimizer = ((BrentOptimizer) createInstance("org.apache.commons.math.optimization.univariate.BrentOptimizer"));
            setField(optimizer, "org.apache.commons.math.optimization.univariate.AbstractUnivariateRealOptimizer", "evaluations", -2);
            optimizer.setAbsoluteAccuracy(0.0);
            optimizer.setRelativeAccuracy(0.0);
            setField(multiStartUnivariateRealOptimizer, "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "optimizer", optimizer);
            setField(multiStartUnivariateRealOptimizer, "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "starts", 4);
            double[] optimaValues = {};
            setField(multiStartUnivariateRealOptimizer, "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "optimaValues", optimaValues);
            PolynomialFunction polynomialFunction = ((PolynomialFunction) createInstance("org.apache.commons.math.analysis.polynomials.PolynomialFunction"));
            double[] coefficients = {
                0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
                0.0, 0.0, 0.0
            };
            setField(polynomialFunction, "org.apache.commons.math.analysis.polynomials.PolynomialFunction", "coefficients", coefficients);
            GoalType goalType = GoalType.MAXIMIZE;
            
            /* This test fails because method [org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer.optimize] produces [java.lang.NullPointerException]
                org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer.optimize(MultiStartUnivariateRealOptimizer.java:242)
                org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer.optimize(MultiStartUnivariateRealOptimizer.java:316) */
            multiStartUnivariateRealOptimizer.optimize(polynomialFunction, goalType, -0.0, -2.0000000000000004, java.lang.Double.NaN);
        } finally {
            setStaticField(BrentOptimizer.class, "GOLDEN_SECTION", prevGOLDEN_SECTION);
        }
    }
    
    @Test
    public void testOptimize14() throws Exception  {
        Class brentOptimizerClazz = Class.forName("org.apache.commons.math.optimization.univariate.BrentOptimizer");
        double prevGOLDEN_SECTION = ((Double) getStaticFieldValue(brentOptimizerClazz, "GOLDEN_SECTION"));
        try {
            setStaticField(brentOptimizerClazz, "GOLDEN_SECTION", 1.500003382563591);
            MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer = ((MultiStartUnivariateRealOptimizer) createInstance("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer"));
            BrentOptimizer optimizer = ((BrentOptimizer) createInstance("org.apache.commons.math.optimization.univariate.BrentOptimizer"));
            setField(optimizer, "org.apache.commons.math.optimization.univariate.AbstractUnivariateRealOptimizer", "evaluations", -2);
            optimizer.setAbsoluteAccuracy(0.0);
            optimizer.setRelativeAccuracy(0.0);
            setField(multiStartUnivariateRealOptimizer, "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "optimizer", optimizer);
            setField(multiStartUnivariateRealOptimizer, "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "starts", 4);
            double[] optimaValues = {0.0};
            setField(multiStartUnivariateRealOptimizer, "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "optimaValues", optimaValues);
            PolynomialFunction polynomialFunction = ((PolynomialFunction) createInstance("org.apache.commons.math.analysis.polynomials.PolynomialFunction"));
            GoalType goalType = GoalType.MAXIMIZE;
            
            /* This test fails because method [org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer.optimize] produces [java.lang.NullPointerException]
                org.apache.commons.math.analysis.polynomials.PolynomialFunction.evaluate(PolynomialFunction.java:124)
                org.apache.commons.math.analysis.polynomials.PolynomialFunction.value(PolynomialFunction.java:88)
                org.apache.commons.math.optimization.univariate.AbstractUnivariateRealOptimizer.computeObjectiveValue(AbstractUnivariateRealOptimizer.java:141)
                org.apache.commons.math.optimization.univariate.BrentOptimizer.localMin(BrentOptimizer.java:92)
                org.apache.commons.math.optimization.univariate.BrentOptimizer.optimize(BrentOptimizer.java:58)
                org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer.optimize(MultiStartUnivariateRealOptimizer.java:244)
                org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer.optimize(MultiStartUnivariateRealOptimizer.java:316) */
            multiStartUnivariateRealOptimizer.optimize(polynomialFunction, goalType, 0.0, -0.0, java.lang.Double.NaN);
        } finally {
            setStaticField(BrentOptimizer.class, "GOLDEN_SECTION", prevGOLDEN_SECTION);
        }
    }
    
    @Test
    public void testOptimize15() throws Exception  {
        MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer = ((MultiStartUnivariateRealOptimizer) createInstance("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer"));
        MultiStartUnivariateRealOptimizer optimizer = ((MultiStartUnivariateRealOptimizer) createInstance("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer"));
        setField(optimizer, "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "starts", 9);
        setField(multiStartUnivariateRealOptimizer, "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "optimizer", optimizer);
        setField(multiStartUnivariateRealOptimizer, "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "starts", 9);
        double[] optima = new double[12];
        setField(multiStartUnivariateRealOptimizer, "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "optima", optima);
        GoalType goalType = GoalType.MAXIMIZE;
        
        /* This test fails because method [org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer.optimize] produces [java.lang.NullPointerException]
            org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer.optimize(MultiStartUnivariateRealOptimizer.java:240)
            org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer.optimize(MultiStartUnivariateRealOptimizer.java:244)
            org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer.optimize(MultiStartUnivariateRealOptimizer.java:316) */
        multiStartUnivariateRealOptimizer.optimize(null, goalType, 1.2662388077861363E58, 8.63070957998768E96, java.lang.Double.NaN);
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method optimize(org.apache.commons.math.analysis.UnivariateRealFunction, org.apache.commons.math.optimization.GoalType, double, double, double)
    
    @Test(expected = NoDataException.class)
    public void testOptimize16() throws Exception  {
        Class brentOptimizerClazz = Class.forName("org.apache.commons.math.optimization.univariate.BrentOptimizer");
        double prevGOLDEN_SECTION = ((Double) getStaticFieldValue(brentOptimizerClazz, "GOLDEN_SECTION"));
        try {
            setStaticField(brentOptimizerClazz, "GOLDEN_SECTION", 1.4999752044677734);
            MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer = ((MultiStartUnivariateRealOptimizer) createInstance("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer"));
            BrentOptimizer optimizer = ((BrentOptimizer) createInstance("org.apache.commons.math.optimization.univariate.BrentOptimizer"));
            setField(optimizer, "org.apache.commons.math.optimization.univariate.AbstractUnivariateRealOptimizer", "evaluations", -535188789);
            optimizer.setAbsoluteAccuracy(0.0);
            optimizer.setRelativeAccuracy(0.0);
            setField(multiStartUnivariateRealOptimizer, "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "optimizer", optimizer);
            setField(multiStartUnivariateRealOptimizer, "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "starts", 18);
            PolynomialFunction polynomialFunction = ((PolynomialFunction) createInstance("org.apache.commons.math.analysis.polynomials.PolynomialFunction"));
            double[] coefficients = {};
            setField(polynomialFunction, "org.apache.commons.math.analysis.polynomials.PolynomialFunction", "coefficients", coefficients);
            
            multiStartUnivariateRealOptimizer.optimize(polynomialFunction, null, -0.0, 1.0E-323, java.lang.Double.NaN);
        } finally {
            setStaticField(BrentOptimizer.class, "GOLDEN_SECTION", prevGOLDEN_SECTION);
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer.getResult
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getResult()
    
    /**
    @utbot.classUnderTest {@link MultiStartUnivariateRealOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer#getResult()}
 * @utbot.invokes {@link org.apache.commons.math.optimization.UnivariateRealOptimizer#getResult()}
 * @utbot.returnsFrom {@code return optimizer.getResult();}
 *  */
    @Test
    public void testGetResult_UnivariateRealOptimizerGetResult() throws Exception  {
        MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer = ((MultiStartUnivariateRealOptimizer) createInstance("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer"));
        MultiStartUnivariateRealOptimizer optimizer = ((MultiStartUnivariateRealOptimizer) createInstance("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer"));
        BrentOptimizer optimizer1 = ((BrentOptimizer) createInstance("org.apache.commons.math.optimization.univariate.BrentOptimizer"));
        setField(optimizer1, "org.apache.commons.math.optimization.univariate.AbstractUnivariateRealOptimizer", "resultComputed", true);
        setField(optimizer1, "org.apache.commons.math.optimization.univariate.AbstractUnivariateRealOptimizer", "result", 0.0);
        setField(optimizer, "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "optimizer", optimizer1);
        setField(multiStartUnivariateRealOptimizer, "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "optimizer", optimizer);
        
        double actual = multiStartUnivariateRealOptimizer.getResult();
        
        assertEquals(0.0, actual, 1.0E-6);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getResult()
    
    /**
    @utbot.classUnderTest {@link MultiStartUnivariateRealOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer#getResult()}
 * @utbot.invokes {@link org.apache.commons.math.optimization.UnivariateRealOptimizer#getResult()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return optimizer.getResult();
 *  */
    @Test
    public void testGetResult_ThrowNullPointerException() throws Exception  {
        MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer = ((MultiStartUnivariateRealOptimizer) createInstance("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer"));
        
        /* This test fails because method [org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer.getResult] produces [java.lang.NullPointerException]
            org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer.getResult(MultiStartUnivariateRealOptimizer.java:97) */
        multiStartUnivariateRealOptimizer.getResult();
    }
    ///endregion
    
    ///region Errors report for getResult
    
    public void testGetResult_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Exception org.apache.commons.math.MathRuntimeException$5 is not accessible from package org.apache.commons.math.optimization
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer.setMaximalIterationCount
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setMaximalIterationCount(int)
    
    /**
    @utbot.classUnderTest {@link MultiStartUnivariateRealOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer#setMaximalIterationCount(int)}
 *  */
    @Test
    public void testSetMaximalIterationCount() throws Exception  {
        MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer = ((MultiStartUnivariateRealOptimizer) createInstance("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer"));
        setField(multiStartUnivariateRealOptimizer, "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "maxIterations", -255);
        
        multiStartUnivariateRealOptimizer.setMaximalIterationCount(-255);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer.setAbsoluteAccuracy
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setAbsoluteAccuracy(double)
    
    /**
    @utbot.classUnderTest {@link MultiStartUnivariateRealOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer#setAbsoluteAccuracy(double)}
 * @utbot.invokes {@link org.apache.commons.math.optimization.UnivariateRealOptimizer#setAbsoluteAccuracy(double)}
 *  */
    @Test
    public void testSetAbsoluteAccuracy_UnivariateRealOptimizerSetAbsoluteAccuracy() throws Exception  {
        MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer = ((MultiStartUnivariateRealOptimizer) createInstance("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer"));
        MultiStartUnivariateRealOptimizer optimizer = ((MultiStartUnivariateRealOptimizer) createInstance("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer"));
        BrentOptimizer optimizer1 = ((BrentOptimizer) createInstance("org.apache.commons.math.optimization.univariate.BrentOptimizer"));
        optimizer1.setAbsoluteAccuracy(0.0);
        setField(optimizer, "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "optimizer", optimizer1);
        setField(multiStartUnivariateRealOptimizer, "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "optimizer", optimizer);
        
        multiStartUnivariateRealOptimizer.setAbsoluteAccuracy(java.lang.Double.NaN);
        
        UnivariateRealOptimizer multiStartUnivariateRealOptimizerOptimizer = ((UnivariateRealOptimizer) getFieldValue(multiStartUnivariateRealOptimizer, "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "optimizer"));
        UnivariateRealOptimizer multiStartUnivariateRealOptimizerOptimizerOptimizerOptimizer = ((UnivariateRealOptimizer) getFieldValue(multiStartUnivariateRealOptimizerOptimizer, "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "optimizer"));
        double finalMultiStartUnivariateRealOptimizerOptimizerOptimizerAbsoluteAccuracy = ((Double) getFieldValue(multiStartUnivariateRealOptimizerOptimizerOptimizerOptimizer, "org.apache.commons.math.ConvergingAlgorithmImpl", "absoluteAccuracy"));
        
        assertEquals(java.lang.Double.NaN, finalMultiStartUnivariateRealOptimizerOptimizerOptimizerAbsoluteAccuracy, 1.0E-6);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method setAbsoluteAccuracy(double)
    
    /**
    @utbot.classUnderTest {@link MultiStartUnivariateRealOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer#setAbsoluteAccuracy(double)}
 * @utbot.invokes {@link org.apache.commons.math.optimization.UnivariateRealOptimizer#setAbsoluteAccuracy(double)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: optimizer.setAbsoluteAccuracy(accuracy);
 *  */
    @Test
    public void testSetAbsoluteAccuracy_ThrowNullPointerException() throws Exception  {
        MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer = ((MultiStartUnivariateRealOptimizer) createInstance("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer"));
        
        /* This test fails because method [org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer.setAbsoluteAccuracy] produces [java.lang.NullPointerException]
            org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer.setAbsoluteAccuracy(MultiStartUnivariateRealOptimizer.java:147) */
        multiStartUnivariateRealOptimizer.setAbsoluteAccuracy(java.lang.Double.NaN);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer.resetAbsoluteAccuracy
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method resetAbsoluteAccuracy()
    
    /**
    @utbot.classUnderTest {@link MultiStartUnivariateRealOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer#resetAbsoluteAccuracy()}
 * @utbot.invokes {@link org.apache.commons.math.optimization.UnivariateRealOptimizer#resetAbsoluteAccuracy()}
 *  */
    @Test
    public void testResetAbsoluteAccuracy_UnivariateRealOptimizerResetAbsoluteAccuracy() throws Exception  {
        MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer = ((MultiStartUnivariateRealOptimizer) createInstance("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer"));
        MultiStartUnivariateRealOptimizer optimizer = ((MultiStartUnivariateRealOptimizer) createInstance("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer"));
        BrentOptimizer optimizer1 = ((BrentOptimizer) createInstance("org.apache.commons.math.optimization.univariate.BrentOptimizer"));
        optimizer1.setAbsoluteAccuracy(0.0);
        setField(optimizer1, "org.apache.commons.math.ConvergingAlgorithmImpl", "defaultAbsoluteAccuracy", 0.0);
        setField(optimizer, "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "optimizer", optimizer1);
        setField(multiStartUnivariateRealOptimizer, "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "optimizer", optimizer);
        
        multiStartUnivariateRealOptimizer.resetAbsoluteAccuracy();
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method resetAbsoluteAccuracy()
    
    /**
    @utbot.classUnderTest {@link MultiStartUnivariateRealOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer#resetAbsoluteAccuracy()}
 * @utbot.invokes {@link org.apache.commons.math.optimization.UnivariateRealOptimizer#resetAbsoluteAccuracy()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: optimizer.resetAbsoluteAccuracy();
 *  */
    @Test
    public void testResetAbsoluteAccuracy_ThrowNullPointerException() throws Exception  {
        MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer = ((MultiStartUnivariateRealOptimizer) createInstance("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer"));
        
        /* This test fails because method [org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer.resetAbsoluteAccuracy] produces [java.lang.NullPointerException]
            org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer.resetAbsoluteAccuracy(MultiStartUnivariateRealOptimizer.java:132) */
        multiStartUnivariateRealOptimizer.resetAbsoluteAccuracy();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer.getAbsoluteAccuracy
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getAbsoluteAccuracy()
    
    /**
    @utbot.classUnderTest {@link MultiStartUnivariateRealOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer#getAbsoluteAccuracy()}
 * @utbot.invokes {@link org.apache.commons.math.optimization.UnivariateRealOptimizer#getAbsoluteAccuracy()}
 * @utbot.returnsFrom {@code return optimizer.getAbsoluteAccuracy();}
 *  */
    @Test
    public void testGetAbsoluteAccuracy_UnivariateRealOptimizerGetAbsoluteAccuracy() throws Exception  {
        MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer = ((MultiStartUnivariateRealOptimizer) createInstance("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer"));
        MultiStartUnivariateRealOptimizer optimizer = ((MultiStartUnivariateRealOptimizer) createInstance("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer"));
        BrentOptimizer optimizer1 = ((BrentOptimizer) createInstance("org.apache.commons.math.optimization.univariate.BrentOptimizer"));
        optimizer1.setAbsoluteAccuracy(0.0);
        setField(optimizer, "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "optimizer", optimizer1);
        setField(multiStartUnivariateRealOptimizer, "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "optimizer", optimizer);
        
        double actual = multiStartUnivariateRealOptimizer.getAbsoluteAccuracy();
        
        assertEquals(0.0, actual, 1.0E-6);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getAbsoluteAccuracy()
    
    /**
    @utbot.classUnderTest {@link MultiStartUnivariateRealOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer#getAbsoluteAccuracy()}
 * @utbot.invokes {@link org.apache.commons.math.optimization.UnivariateRealOptimizer#getAbsoluteAccuracy()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return optimizer.getAbsoluteAccuracy();
 *  */
    @Test
    public void testGetAbsoluteAccuracy_ThrowNullPointerException() throws Exception  {
        MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer = ((MultiStartUnivariateRealOptimizer) createInstance("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer"));
        
        /* This test fails because method [org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer.getAbsoluteAccuracy] produces [java.lang.NullPointerException]
            org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer.getAbsoluteAccuracy(MultiStartUnivariateRealOptimizer.java:102) */
        multiStartUnivariateRealOptimizer.getAbsoluteAccuracy();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer.getMaximalIterationCount
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getMaximalIterationCount()
    
    /**
    @utbot.classUnderTest {@link MultiStartUnivariateRealOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer#getMaximalIterationCount()}
 * @utbot.returnsFrom {@code return maxIterations;}
 *  */
    @Test
    public void testGetMaximalIterationCount_ReturnMaxIterations() throws Exception  {
        MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer = ((MultiStartUnivariateRealOptimizer) createInstance("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer"));
        setField(multiStartUnivariateRealOptimizer, "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "maxIterations", -255);
        
        int actual = multiStartUnivariateRealOptimizer.getMaximalIterationCount();
        
        org.junit.Assert.assertEquals(-255, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer.resetMaximalIterationCount
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method resetMaximalIterationCount()
    
    /**
    @utbot.classUnderTest {@link MultiStartUnivariateRealOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer#resetMaximalIterationCount()}
 * @utbot.invokes {@link org.apache.commons.math.optimization.UnivariateRealOptimizer#resetMaximalIterationCount()}
 *  */
    @Test
    public void testResetMaximalIterationCount_UnivariateRealOptimizerResetMaximalIterationCount() throws Exception  {
        MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer = ((MultiStartUnivariateRealOptimizer) createInstance("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer"));
        MultiStartUnivariateRealOptimizer optimizer = ((MultiStartUnivariateRealOptimizer) createInstance("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer"));
        BrentOptimizer optimizer1 = ((BrentOptimizer) createInstance("org.apache.commons.math.optimization.univariate.BrentOptimizer"));
        setField(optimizer, "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "optimizer", optimizer1);
        setField(multiStartUnivariateRealOptimizer, "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "optimizer", optimizer);
        
        multiStartUnivariateRealOptimizer.resetMaximalIterationCount();
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method resetMaximalIterationCount()
    
    /**
    @utbot.classUnderTest {@link MultiStartUnivariateRealOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer#resetMaximalIterationCount()}
 * @utbot.invokes {@link org.apache.commons.math.optimization.UnivariateRealOptimizer#resetMaximalIterationCount()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: optimizer.resetMaximalIterationCount();
 *  */
    @Test
    public void testResetMaximalIterationCount_ThrowNullPointerException() throws Exception  {
        MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer = ((MultiStartUnivariateRealOptimizer) createInstance("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer"));
        
        /* This test fails because method [org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer.resetMaximalIterationCount] produces [java.lang.NullPointerException]
            org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer.resetMaximalIterationCount(MultiStartUnivariateRealOptimizer.java:137) */
        multiStartUnivariateRealOptimizer.resetMaximalIterationCount();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer.setRelativeAccuracy
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setRelativeAccuracy(double)
    
    /**
    @utbot.classUnderTest {@link MultiStartUnivariateRealOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer#setRelativeAccuracy(double)}
 * @utbot.invokes {@link org.apache.commons.math.optimization.UnivariateRealOptimizer#setRelativeAccuracy(double)}
 *  */
    @Test
    public void testSetRelativeAccuracy_UnivariateRealOptimizerSetRelativeAccuracy() throws Exception  {
        MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer = ((MultiStartUnivariateRealOptimizer) createInstance("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer"));
        MultiStartUnivariateRealOptimizer optimizer = ((MultiStartUnivariateRealOptimizer) createInstance("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer"));
        BrentOptimizer optimizer1 = ((BrentOptimizer) createInstance("org.apache.commons.math.optimization.univariate.BrentOptimizer"));
        optimizer1.setRelativeAccuracy(0.0);
        setField(optimizer, "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "optimizer", optimizer1);
        setField(multiStartUnivariateRealOptimizer, "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "optimizer", optimizer);
        
        multiStartUnivariateRealOptimizer.setRelativeAccuracy(java.lang.Double.NaN);
        
        UnivariateRealOptimizer multiStartUnivariateRealOptimizerOptimizer = ((UnivariateRealOptimizer) getFieldValue(multiStartUnivariateRealOptimizer, "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "optimizer"));
        UnivariateRealOptimizer multiStartUnivariateRealOptimizerOptimizerOptimizerOptimizer = ((UnivariateRealOptimizer) getFieldValue(multiStartUnivariateRealOptimizerOptimizer, "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "optimizer"));
        double finalMultiStartUnivariateRealOptimizerOptimizerOptimizerRelativeAccuracy = ((Double) getFieldValue(multiStartUnivariateRealOptimizerOptimizerOptimizerOptimizer, "org.apache.commons.math.ConvergingAlgorithmImpl", "relativeAccuracy"));
        
        assertEquals(java.lang.Double.NaN, finalMultiStartUnivariateRealOptimizerOptimizerOptimizerRelativeAccuracy, 1.0E-6);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method setRelativeAccuracy(double)
    
    /**
    @utbot.classUnderTest {@link MultiStartUnivariateRealOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer#setRelativeAccuracy(double)}
 * @utbot.invokes {@link org.apache.commons.math.optimization.UnivariateRealOptimizer#setRelativeAccuracy(double)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: optimizer.setRelativeAccuracy(accuracy);
 *  */
    @Test
    public void testSetRelativeAccuracy_ThrowNullPointerException() throws Exception  {
        MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer = ((MultiStartUnivariateRealOptimizer) createInstance("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer"));
        
        /* This test fails because method [org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer.setRelativeAccuracy] produces [java.lang.NullPointerException]
            org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer.setRelativeAccuracy(MultiStartUnivariateRealOptimizer.java:162) */
        multiStartUnivariateRealOptimizer.setRelativeAccuracy(java.lang.Double.NaN);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer.getRelativeAccuracy
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getRelativeAccuracy()
    
    /**
    @utbot.classUnderTest {@link MultiStartUnivariateRealOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer#getRelativeAccuracy()}
 * @utbot.invokes {@link org.apache.commons.math.optimization.UnivariateRealOptimizer#getRelativeAccuracy()}
 * @utbot.returnsFrom {@code return optimizer.getRelativeAccuracy();}
 *  */
    @Test
    public void testGetRelativeAccuracy_UnivariateRealOptimizerGetRelativeAccuracy() throws Exception  {
        MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer = ((MultiStartUnivariateRealOptimizer) createInstance("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer"));
        MultiStartUnivariateRealOptimizer optimizer = ((MultiStartUnivariateRealOptimizer) createInstance("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer"));
        BrentOptimizer optimizer1 = ((BrentOptimizer) createInstance("org.apache.commons.math.optimization.univariate.BrentOptimizer"));
        optimizer1.setRelativeAccuracy(0.0);
        setField(optimizer, "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "optimizer", optimizer1);
        setField(multiStartUnivariateRealOptimizer, "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "optimizer", optimizer);
        
        double actual = multiStartUnivariateRealOptimizer.getRelativeAccuracy();
        
        assertEquals(0.0, actual, 1.0E-6);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getRelativeAccuracy()
    
    /**
    @utbot.classUnderTest {@link MultiStartUnivariateRealOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer#getRelativeAccuracy()}
 * @utbot.invokes {@link org.apache.commons.math.optimization.UnivariateRealOptimizer#getRelativeAccuracy()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return optimizer.getRelativeAccuracy();
 *  */
    @Test
    public void testGetRelativeAccuracy_ThrowNullPointerException() throws Exception  {
        MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer = ((MultiStartUnivariateRealOptimizer) createInstance("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer"));
        
        /* This test fails because method [org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer.getRelativeAccuracy] produces [java.lang.NullPointerException]
            org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer.getRelativeAccuracy(MultiStartUnivariateRealOptimizer.java:127) */
        multiStartUnivariateRealOptimizer.getRelativeAccuracy();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer.resetRelativeAccuracy
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method resetRelativeAccuracy()
    
    /**
    @utbot.classUnderTest {@link MultiStartUnivariateRealOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer#resetRelativeAccuracy()}
 * @utbot.invokes {@link org.apache.commons.math.optimization.UnivariateRealOptimizer#resetRelativeAccuracy()}
 *  */
    @Test
    public void testResetRelativeAccuracy_UnivariateRealOptimizerResetRelativeAccuracy() throws Exception  {
        MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer = ((MultiStartUnivariateRealOptimizer) createInstance("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer"));
        MultiStartUnivariateRealOptimizer optimizer = ((MultiStartUnivariateRealOptimizer) createInstance("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer"));
        BrentOptimizer optimizer1 = ((BrentOptimizer) createInstance("org.apache.commons.math.optimization.univariate.BrentOptimizer"));
        optimizer1.setRelativeAccuracy(0.0);
        setField(optimizer1, "org.apache.commons.math.ConvergingAlgorithmImpl", "defaultRelativeAccuracy", 0.0);
        setField(optimizer, "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "optimizer", optimizer1);
        setField(multiStartUnivariateRealOptimizer, "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "optimizer", optimizer);
        
        multiStartUnivariateRealOptimizer.resetRelativeAccuracy();
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method resetRelativeAccuracy()
    
    /**
    @utbot.classUnderTest {@link MultiStartUnivariateRealOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer#resetRelativeAccuracy()}
 * @utbot.invokes {@link org.apache.commons.math.optimization.UnivariateRealOptimizer#resetRelativeAccuracy()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: optimizer.resetRelativeAccuracy();
 *  */
    @Test
    public void testResetRelativeAccuracy_ThrowNullPointerException() throws Exception  {
        MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer = ((MultiStartUnivariateRealOptimizer) createInstance("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer"));
        
        /* This test fails because method [org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer.resetRelativeAccuracy] produces [java.lang.NullPointerException]
            org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer.resetRelativeAccuracy(MultiStartUnivariateRealOptimizer.java:142) */
        multiStartUnivariateRealOptimizer.resetRelativeAccuracy();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer.getOptimaValues
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getOptimaValues()
    
    /**
    @utbot.classUnderTest {@link MultiStartUnivariateRealOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer#getOptimaValues()}
 * @utbot.executesCondition {@code (optimaValues == null): False}
 * @utbot.invokes {@link java.lang.Object#clone()}
 * @utbot.returnsFrom {@code return optimaValues.clone();}
 *  */
    @Test
    public void testGetOptimaValues_OptimaValuesNotEqualsNull() throws Exception  {
        MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer = ((MultiStartUnivariateRealOptimizer) createInstance("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer"));
        double[] optimaValues = {};
        setField(multiStartUnivariateRealOptimizer, "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "optimaValues", optimaValues);
        
        double[] actual = multiStartUnivariateRealOptimizer.getOptimaValues();
        
        double[] expected = {};
        
        assertArrayEquals(expected, actual, 1.0E-6);
    }
    ///endregion
    
    ///region Errors report for getOptimaValues
    
    public void testGetOptimaValues_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Exception org.apache.commons.math.MathRuntimeException$5 is not accessible from package org.apache.commons.math.optimization
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer.getMaxEvaluations
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getMaxEvaluations()
    
    /**
    @utbot.classUnderTest {@link MultiStartUnivariateRealOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer#getMaxEvaluations()}
 * @utbot.returnsFrom {@code return maxEvaluations;}
 *  */
    @Test
    public void testGetMaxEvaluations_ReturnMaxEvaluations() throws Exception  {
        MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer = ((MultiStartUnivariateRealOptimizer) createInstance("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer"));
        multiStartUnivariateRealOptimizer.setMaxEvaluations(-255);
        
        int actual = multiStartUnivariateRealOptimizer.getMaxEvaluations();
        
        org.junit.Assert.assertEquals(-255, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer.getIterationCount
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getIterationCount()
    
    /**
    @utbot.classUnderTest {@link MultiStartUnivariateRealOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer#getIterationCount()}
 * @utbot.returnsFrom {@code return totalIterations;}
 *  */
    @Test
    public void testGetIterationCount_ReturnTotalIterations() throws Exception  {
        MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer = ((MultiStartUnivariateRealOptimizer) createInstance("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer"));
        setField(multiStartUnivariateRealOptimizer, "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "totalIterations", -255);
        
        int actual = multiStartUnivariateRealOptimizer.getIterationCount();
        
        org.junit.Assert.assertEquals(-255, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer.getEvaluations
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getEvaluations()
    
    /**
    @utbot.classUnderTest {@link MultiStartUnivariateRealOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer#getEvaluations()}
 * @utbot.returnsFrom {@code return totalEvaluations;}
 *  */
    @Test
    public void testGetEvaluations_ReturnTotalEvaluations() throws Exception  {
        MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer = ((MultiStartUnivariateRealOptimizer) createInstance("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer"));
        setField(multiStartUnivariateRealOptimizer, "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "totalEvaluations", -255);
        
        int actual = multiStartUnivariateRealOptimizer.getEvaluations();
        
        org.junit.Assert.assertEquals(-255, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer.setMaxEvaluations
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setMaxEvaluations(int)
    
    /**
    @utbot.classUnderTest {@link MultiStartUnivariateRealOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer#setMaxEvaluations(int)}
 *  */
    @Test
    public void testSetMaxEvaluations() throws Exception  {
        MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer = ((MultiStartUnivariateRealOptimizer) createInstance("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer"));
        multiStartUnivariateRealOptimizer.setMaxEvaluations(-255);
        
        multiStartUnivariateRealOptimizer.setMaxEvaluations(-255);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer.getFunctionValue
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getFunctionValue()
    
    /**
    @utbot.classUnderTest {@link MultiStartUnivariateRealOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer#getFunctionValue()}
 * @utbot.invokes {@link org.apache.commons.math.optimization.UnivariateRealOptimizer#getFunctionValue()}
 * @utbot.returnsFrom {@code return optimizer.getFunctionValue();}
 *  */
    @Test
    public void testGetFunctionValue_UnivariateRealOptimizerGetFunctionValue() throws Exception  {
        MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer = ((MultiStartUnivariateRealOptimizer) createInstance("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer"));
        MultiStartUnivariateRealOptimizer optimizer = ((MultiStartUnivariateRealOptimizer) createInstance("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer"));
        BrentOptimizer optimizer1 = ((BrentOptimizer) createInstance("org.apache.commons.math.optimization.univariate.BrentOptimizer"));
        setField(optimizer1, "org.apache.commons.math.optimization.univariate.AbstractUnivariateRealOptimizer", "resultComputed", true);
        setField(optimizer1, "org.apache.commons.math.optimization.univariate.AbstractUnivariateRealOptimizer", "functionValue", 0.0);
        setField(optimizer, "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "optimizer", optimizer1);
        setField(multiStartUnivariateRealOptimizer, "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "optimizer", optimizer);
        
        double actual = multiStartUnivariateRealOptimizer.getFunctionValue();
        
        assertEquals(0.0, actual, 1.0E-6);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getFunctionValue()
    
    /**
    @utbot.classUnderTest {@link MultiStartUnivariateRealOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer#getFunctionValue()}
 * @utbot.invokes {@link org.apache.commons.math.optimization.UnivariateRealOptimizer#getFunctionValue()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return optimizer.getFunctionValue();
 *  */
    @Test
    public void testGetFunctionValue_ThrowNullPointerException() throws Exception  {
        MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer = ((MultiStartUnivariateRealOptimizer) createInstance("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer"));
        
        /* This test fails because method [org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer.getFunctionValue] produces [java.lang.NullPointerException]
            org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer.getFunctionValue(MultiStartUnivariateRealOptimizer.java:92) */
        multiStartUnivariateRealOptimizer.getFunctionValue();
    }
    ///endregion
    
    ///region Errors report for getFunctionValue
    
    public void testGetFunctionValue_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Exception org.apache.commons.math.MathRuntimeException$5 is not accessible from package org.apache.commons.math.optimization
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer.getOptima
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getOptima()
    
    /**
    @utbot.classUnderTest {@link MultiStartUnivariateRealOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer#getOptima()}
 * @utbot.executesCondition {@code (optima == null): False}
 * @utbot.invokes {@link java.lang.Object#clone()}
 * @utbot.returnsFrom {@code return optima.clone();}
 *  */
    @Test
    public void testGetOptima_OptimaNotEqualsNull() throws Exception  {
        MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer = ((MultiStartUnivariateRealOptimizer) createInstance("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer"));
        double[] optima = {};
        setField(multiStartUnivariateRealOptimizer, "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", "optima", optima);
        
        double[] actual = multiStartUnivariateRealOptimizer.getOptima();
        
        double[] expected = {};
        
        assertArrayEquals(expected, actual, 1.0E-6);
    }
    ///endregion
    
    ///region Errors report for getOptima
    
    public void testGetOptima_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Exception org.apache.commons.math.MathRuntimeException$5 is not accessible from package org.apache.commons.math.optimization
        
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
        
                java.lang.reflect.Method methodForGetDeclaredFields737999449167700 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields737999449167700.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass737999449186000 = (java.lang.reflect.Field[]) methodForGetDeclaredFields737999449167700.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass737999449186000).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
        modifiersField.setAccessible(true);
        modifiersField.setInt(field, field.getModifiers() & ~java.lang.reflect.Modifier.FINAL);
    
        field.setAccessible(true);
        field.set(object, fieldValue);
    }
    
    private static Object getStaticFieldValue(Class<?> clazz, String fieldName) throws IllegalAccessException, NoSuchFieldException {
        java.lang.reflect.Field field;
        Class<?> originClass = clazz;
        do {
            try {
                field = clazz.getDeclaredField(fieldName);
                field.setAccessible(true);
                
                java.lang.reflect.Field modifiersField;
                
            java.lang.reflect.Method methodForGetDeclaredFields737999449621000 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields737999449621000.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass737999449622500 = (java.lang.reflect.Field[]) methodForGetDeclaredFields737999449621000.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass737999449622500).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
                modifiersField.setAccessible(true);
                modifiersField.setInt(field, field.getModifiers() & ~java.lang.reflect.Modifier.FINAL);
                
                return field.get(null);
            } catch (NoSuchFieldException e) {
                clazz = clazz.getSuperclass();
            } catch (NoSuchMethodException e2) {
                e2.printStackTrace();
            } catch (java.lang.reflect.InvocationTargetException e3) {
                e3.printStackTrace();
            }
        } while (clazz != null);
    
        throw new NoSuchFieldException("Field '" + fieldName + "' not found on class " + originClass);
    }
    
    private static void setStaticField(Class<?> clazz, String fieldName, Object fieldValue) throws NoSuchFieldException, IllegalAccessException {
        java.lang.reflect.Field field;
    
        try {
        do {
            try {
                field = clazz.getDeclaredField(fieldName);
            } catch (Exception e) {
                clazz = clazz.getSuperclass();
                field = null;
            }
        } while (field == null);
        
        java.lang.reflect.Field modifiersField;
        
            java.lang.reflect.Method methodForGetDeclaredFields737999450538400 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields737999450538400.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass737999450540200 = (java.lang.reflect.Field[]) methodForGetDeclaredFields737999450538400.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass737999450540200).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
        modifiersField.setAccessible(true);
        modifiersField.setInt(field, field.getModifiers() & ~java.lang.reflect.Modifier.FINAL);
    
        field.setAccessible(true);
        field.set(null, fieldValue);
        }
        catch(java.lang.reflect.InvocationTargetException e){
            e.printStackTrace();
        }
        catch(NoSuchMethodException e2) {
            e2.printStackTrace();
        }
    }
    
    private static Object getFieldValue(Object obj, String fieldClassName, String fieldName) throws ClassNotFoundException, NoSuchMethodException, java.lang.reflect.InvocationTargetException, IllegalAccessException, NoSuchFieldException {
        Class<?> clazz = Class.forName(fieldClassName);
        java.lang.reflect.Field field = clazz.getDeclaredField(fieldName);
        
        field.setAccessible(true);
        
        java.lang.reflect.Field modifiersField;
        
            java.lang.reflect.Method methodForGetDeclaredFields737999451249100 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields737999451249100.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass737999451250700 = (java.lang.reflect.Field[]) methodForGetDeclaredFields737999451249100.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass737999451250700).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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

