package org.apache.commons.math.optimization.univariate;

import org.junit.Test;
import org.apache.commons.math.optimization.GoalType;
import org.apache.commons.math.exception.NotStrictlyPositiveException;
import org.apache.commons.math.analysis.polynomials.PolynomialFunction;
import org.apache.commons.math.exception.NoDataException;
import org.apache.commons.math.MaxIterationsExceededException;
import org.apache.commons.math.FunctionEvaluationException;
import org.apache.commons.math.analysis.polynomials.PolynomialSplineFunction;
import org.apache.commons.math.optimization.fitting.HarmonicFunction;
import org.apache.commons.math.ArgumentOutsideDomainException;
import java.lang.reflect.Method;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.lang.reflect.InvocationTargetException;

public final class org_apache_commons_math_optimization_univariate_BrentOptimizerTest {
    ///region Test suites for executable org.apache.commons.math.optimization.univariate.BrentOptimizer.optimize
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method optimize(org.apache.commons.math.analysis.UnivariateRealFunction, org.apache.commons.math.optimization.GoalType, double, double)
    
    /**
    @utbot.classUnderTest {@link BrentOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.univariate.BrentOptimizer#optimize(org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double)}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.throwsException {@link org.apache.commons.math.exception.NotStrictlyPositiveException} in: return optimize(f, goalType, min, max, min + GOLDEN_SECTION * (max - min));
 *  */
    @Test(expected = NotStrictlyPositiveException.class)
    public void testOptimize_ThrowNotStrictlyPositiveException_1() throws Exception  {
        Class brentOptimizerClazz = Class.forName("org.apache.commons.math.optimization.univariate.BrentOptimizer");
        double prevGOLDEN_SECTION = ((Double) getStaticFieldValue(brentOptimizerClazz, "GOLDEN_SECTION"));
        try {
            setStaticField(brentOptimizerClazz, "GOLDEN_SECTION", java.lang.Double.NaN);
            BrentOptimizer brentOptimizer = ((BrentOptimizer) createInstance("org.apache.commons.math.optimization.univariate.BrentOptimizer"));
            GoalType goal = GoalType.MINIMIZE;
            setField(brentOptimizer, "org.apache.commons.math.optimization.univariate.AbstractUnivariateRealOptimizer", "goal", goal);
            brentOptimizer.setAbsoluteAccuracy(-0.0);
            brentOptimizer.setRelativeAccuracy(2.2250738585072024E-308);
            
            brentOptimizer.optimize(null, null, java.lang.Double.NaN, java.lang.Double.NaN);
        } finally {
            setStaticField(BrentOptimizer.class, "GOLDEN_SECTION", prevGOLDEN_SECTION);
        }
    }
    
    /**
    @utbot.classUnderTest {@link BrentOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.univariate.BrentOptimizer#optimize(org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double)}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.throwsException {@link org.apache.commons.math.exception.NoDataException} in: return optimize(f, goalType, min, max, min + GOLDEN_SECTION * (max - min));
 *  */
    @Test(expected = NoDataException.class)
    public void testOptimize_ThrowNoDataException() throws Exception  {
        Class brentOptimizerClazz = Class.forName("org.apache.commons.math.optimization.univariate.BrentOptimizer");
        double prevGOLDEN_SECTION = ((Double) getStaticFieldValue(brentOptimizerClazz, "GOLDEN_SECTION"));
        try {
            setStaticField(brentOptimizerClazz, "GOLDEN_SECTION", java.lang.Double.NaN);
            BrentOptimizer brentOptimizer = ((BrentOptimizer) createInstance("org.apache.commons.math.optimization.univariate.BrentOptimizer"));
            brentOptimizer.setMaxEvaluations(Integer.MIN_VALUE);
            setField(brentOptimizer, "org.apache.commons.math.optimization.univariate.AbstractUnivariateRealOptimizer", "evaluations", Integer.MAX_VALUE);
            GoalType goal = GoalType.MINIMIZE;
            setField(brentOptimizer, "org.apache.commons.math.optimization.univariate.AbstractUnivariateRealOptimizer", "goal", goal);
            brentOptimizer.setAbsoluteAccuracy(1.1125369292536007E-308);
            brentOptimizer.setRelativeAccuracy(java.lang.Double.POSITIVE_INFINITY);
            PolynomialFunction polynomialFunction = ((PolynomialFunction) createInstance("org.apache.commons.math.analysis.polynomials.PolynomialFunction"));
            double[] coefficients = {};
            setField(polynomialFunction, "org.apache.commons.math.analysis.polynomials.PolynomialFunction", "coefficients", coefficients);
            
            brentOptimizer.optimize(polynomialFunction, null, 2.0611676064135575E-230, 2.0611676064135575E-230);
        } finally {
            setStaticField(BrentOptimizer.class, "GOLDEN_SECTION", prevGOLDEN_SECTION);
        }
    }
    
    /**
    @utbot.classUnderTest {@link BrentOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.univariate.BrentOptimizer#optimize(org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double)}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.throwsException {@link org.apache.commons.math.exception.NotStrictlyPositiveException} in: return optimize(f, goalType, min, max, min + GOLDEN_SECTION * (max - min));
 *  */
    @Test(expected = NotStrictlyPositiveException.class)
    public void testOptimize_ThrowNotStrictlyPositiveException() throws Exception  {
        Class brentOptimizerClazz = Class.forName("org.apache.commons.math.optimization.univariate.BrentOptimizer");
        double prevGOLDEN_SECTION = ((Double) getStaticFieldValue(brentOptimizerClazz, "GOLDEN_SECTION"));
        try {
            setStaticField(brentOptimizerClazz, "GOLDEN_SECTION", java.lang.Double.NaN);
            BrentOptimizer brentOptimizer = ((BrentOptimizer) createInstance("org.apache.commons.math.optimization.univariate.BrentOptimizer"));
            brentOptimizer.setAbsoluteAccuracy(-0.0);
            brentOptimizer.setRelativeAccuracy(2.2250738585072024E-308);
            
            brentOptimizer.optimize(null, null, java.lang.Double.NaN, java.lang.Double.NaN);
        } finally {
            setStaticField(BrentOptimizer.class, "GOLDEN_SECTION", prevGOLDEN_SECTION);
        }
    }
    
    /**
    @utbot.classUnderTest {@link BrentOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.univariate.BrentOptimizer#optimize(org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double)}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.throwsException {@link org.apache.commons.math.exception.NotStrictlyPositiveException} in: return optimize(f, goalType, min, max, min + GOLDEN_SECTION * (max - min));
 *  */
    @Test(expected = NotStrictlyPositiveException.class)
    public void testOptimize_ThrowNotStrictlyPositiveException_2() throws Exception  {
        Class brentOptimizerClazz = Class.forName("org.apache.commons.math.optimization.univariate.BrentOptimizer");
        double prevGOLDEN_SECTION = ((Double) getStaticFieldValue(brentOptimizerClazz, "GOLDEN_SECTION"));
        try {
            setStaticField(brentOptimizerClazz, "GOLDEN_SECTION", -1.224979098644775E19);
            BrentOptimizer brentOptimizer = ((BrentOptimizer) createInstance("org.apache.commons.math.optimization.univariate.BrentOptimizer"));
            brentOptimizer.setAbsoluteAccuracy(0.0);
            brentOptimizer.setRelativeAccuracy(-0.0);
            
            brentOptimizer.optimize(null, null, java.lang.Double.NaN, java.lang.Double.NaN);
        } finally {
            setStaticField(BrentOptimizer.class, "GOLDEN_SECTION", prevGOLDEN_SECTION);
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: CHECKED EXCEPTIONS for method optimize(org.apache.commons.math.analysis.UnivariateRealFunction, org.apache.commons.math.optimization.GoalType, double, double)
    
    /**
    @utbot.classUnderTest {@link BrentOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.univariate.BrentOptimizer#optimize(org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double)}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.invokes org.apache.commons.math.optimization.univariate.BrentOptimizer#localMin(boolean,org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double,double,double,double)
 * @utbot.throwsException {@link org.apache.commons.math.MaxIterationsExceededException} in: return optimize(f, goalType, min, max, min + GOLDEN_SECTION * (max - min));
 *  */
    @Test(expected = MaxIterationsExceededException.class)
    public void testOptimize_ThrowMaxIterationsExceededException() throws Exception  {
        Class brentOptimizerClazz = Class.forName("org.apache.commons.math.optimization.univariate.BrentOptimizer");
        double prevGOLDEN_SECTION = ((Double) getStaticFieldValue(brentOptimizerClazz, "GOLDEN_SECTION"));
        try {
            setStaticField(brentOptimizerClazz, "GOLDEN_SECTION", java.lang.Double.NaN);
            BrentOptimizer brentOptimizer = ((BrentOptimizer) createInstance("org.apache.commons.math.optimization.univariate.BrentOptimizer"));
            brentOptimizer.setMaxEvaluations(Integer.MIN_VALUE);
            setField(brentOptimizer, "org.apache.commons.math.optimization.univariate.AbstractUnivariateRealOptimizer", "evaluations", Integer.MAX_VALUE);
            GoalType goal = GoalType.MINIMIZE;
            setField(brentOptimizer, "org.apache.commons.math.optimization.univariate.AbstractUnivariateRealOptimizer", "goal", goal);
            brentOptimizer.setAbsoluteAccuracy(java.lang.Double.NaN);
            brentOptimizer.setRelativeAccuracy(java.lang.Double.NaN);
            PolynomialFunction polynomialFunction = ((PolynomialFunction) createInstance("org.apache.commons.math.analysis.polynomials.PolynomialFunction"));
            double[] coefficients = {0.0};
            setField(polynomialFunction, "org.apache.commons.math.analysis.polynomials.PolynomialFunction", "coefficients", coefficients);
            GoalType goalType = GoalType.MAXIMIZE;
            
            brentOptimizer.optimize(polynomialFunction, goalType, 0.0, -0.0);
        } finally {
            setStaticField(BrentOptimizer.class, "GOLDEN_SECTION", prevGOLDEN_SECTION);
        }
    }
    
    /**
    @utbot.classUnderTest {@link BrentOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.univariate.BrentOptimizer#optimize(org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double)}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.throwsException {@link org.apache.commons.math.FunctionEvaluationException} in: return optimize(f, goalType, min, max, min + GOLDEN_SECTION * (max - min));
 *  */
    @Test(expected = FunctionEvaluationException.class)
    public void testOptimize_ThrowFunctionEvaluationException() throws Exception  {
        Class brentOptimizerClazz = Class.forName("org.apache.commons.math.optimization.univariate.BrentOptimizer");
        double prevGOLDEN_SECTION = ((Double) getStaticFieldValue(brentOptimizerClazz, "GOLDEN_SECTION"));
        try {
            setStaticField(brentOptimizerClazz, "GOLDEN_SECTION", java.lang.Double.NaN);
            BrentOptimizer brentOptimizer = ((BrentOptimizer) createInstance("org.apache.commons.math.optimization.univariate.BrentOptimizer"));
            brentOptimizer.setMaxEvaluations(16384);
            setField(brentOptimizer, "org.apache.commons.math.optimization.univariate.AbstractUnivariateRealOptimizer", "evaluations", 16384);
            GoalType goal = GoalType.MINIMIZE;
            setField(brentOptimizer, "org.apache.commons.math.optimization.univariate.AbstractUnivariateRealOptimizer", "goal", goal);
            brentOptimizer.setAbsoluteAccuracy(1.0);
            brentOptimizer.setRelativeAccuracy(3.0);
            
            brentOptimizer.optimize(null, null, 1.69759663277E-313, 1.69759663277E-313);
        } finally {
            setStaticField(BrentOptimizer.class, "GOLDEN_SECTION", prevGOLDEN_SECTION);
        }
    }
    
    /**
    @utbot.classUnderTest {@link BrentOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.univariate.BrentOptimizer#optimize(org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double)}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.throwsException {@link org.apache.commons.math.FunctionEvaluationException} in: return optimize(f, goalType, min, max, min + GOLDEN_SECTION * (max - min));
 *  */
    @Test(expected = FunctionEvaluationException.class)
    public void testOptimize_ThrowFunctionEvaluationException_1() throws Exception  {
        Class brentOptimizerClazz = Class.forName("org.apache.commons.math.optimization.univariate.BrentOptimizer");
        double prevGOLDEN_SECTION = ((Double) getStaticFieldValue(brentOptimizerClazz, "GOLDEN_SECTION"));
        try {
            setStaticField(brentOptimizerClazz, "GOLDEN_SECTION", -0.18750010430812836);
            BrentOptimizer brentOptimizer = ((BrentOptimizer) createInstance("org.apache.commons.math.optimization.univariate.BrentOptimizer"));
            brentOptimizer.setAbsoluteAccuracy(java.lang.Double.NaN);
            brentOptimizer.setRelativeAccuracy(3.0);
            
            brentOptimizer.optimize(null, null, -8.4293248731214E50, 1.4315632756198897E-132);
        } finally {
            setStaticField(BrentOptimizer.class, "GOLDEN_SECTION", prevGOLDEN_SECTION);
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method optimize(org.apache.commons.math.analysis.UnivariateRealFunction, org.apache.commons.math.optimization.GoalType, double, double)
    
    /**
    @utbot.classUnderTest {@link BrentOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.univariate.BrentOptimizer#optimize(org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double)}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.invokes {@link org.apache.commons.math.optimization.univariate.BrentOptimizer#optimize(org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double,double)}
 * @utbot.invokes {@link org.apache.commons.math.optimization.univariate.BrentOptimizer#clearResult()}
 * @utbot.invokes {@link org.apache.commons.math.optimization.univariate.BrentOptimizer#getGoalType()}
 * @utbot.invokes {@link org.apache.commons.math.optimization.univariate.BrentOptimizer#getRelativeAccuracy()}
 * @utbot.invokes {@link org.apache.commons.math.optimization.univariate.BrentOptimizer#getAbsoluteAccuracy()}
 * @utbot.invokes org.apache.commons.math.optimization.univariate.BrentOptimizer#localMin(boolean,org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double,double,double,double)
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return optimize(f, goalType, min, max, min + GOLDEN_SECTION * (max - min));
 *  */
    @Test
    public void testOptimize_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        Class brentOptimizerClazz = Class.forName("org.apache.commons.math.optimization.univariate.BrentOptimizer");
        double prevGOLDEN_SECTION = ((Double) getStaticFieldValue(brentOptimizerClazz, "GOLDEN_SECTION"));
        try {
            setStaticField(brentOptimizerClazz, "GOLDEN_SECTION", java.lang.Double.NaN);
            BrentOptimizer brentOptimizer = ((BrentOptimizer) createInstance("org.apache.commons.math.optimization.univariate.BrentOptimizer"));
            brentOptimizer.setMaxEvaluations(Integer.MIN_VALUE);
            setField(brentOptimizer, "org.apache.commons.math.optimization.univariate.AbstractUnivariateRealOptimizer", "evaluations", Integer.MAX_VALUE);
            GoalType goal = GoalType.MINIMIZE;
            setField(brentOptimizer, "org.apache.commons.math.optimization.univariate.AbstractUnivariateRealOptimizer", "goal", goal);
            brentOptimizer.setAbsoluteAccuracy(java.lang.Double.NaN);
            brentOptimizer.setRelativeAccuracy(3.337610787760802E-308);
            PolynomialSplineFunction polynomialSplineFunction = ((PolynomialSplineFunction) createInstance("org.apache.commons.math.analysis.polynomials.PolynomialSplineFunction"));
            double[] knots = {};
            setField(polynomialSplineFunction, "org.apache.commons.math.analysis.polynomials.PolynomialSplineFunction", "knots", knots);
            
            /* This test fails because method [org.apache.commons.math.optimization.univariate.BrentOptimizer.optimize] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
                org.apache.commons.math.analysis.polynomials.PolynomialSplineFunction.value(PolynomialSplineFunction.java:137)
                org.apache.commons.math.optimization.univariate.AbstractUnivariateRealOptimizer.computeObjectiveValue(AbstractUnivariateRealOptimizer.java:197)
                org.apache.commons.math.optimization.univariate.BrentOptimizer.localMin(BrentOptimizer.java:119)
                org.apache.commons.math.optimization.univariate.BrentOptimizer.optimize(BrentOptimizer.java:61)
                org.apache.commons.math.optimization.univariate.BrentOptimizer.optimize(BrentOptimizer.java:66) */
            brentOptimizer.optimize(polynomialSplineFunction, null, -9.307643773504362E251, 2.680066580205326E-113);
        } finally {
            setStaticField(BrentOptimizer.class, "GOLDEN_SECTION", prevGOLDEN_SECTION);
        }
    }
    ///endregion
    
    ///region FUZZER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method optimize(org.apache.commons.math.analysis.UnivariateRealFunction, org.apache.commons.math.optimization.GoalType, double, double)
    
    @Test(expected = NotStrictlyPositiveException.class)
    public void testOptimizeByFuzzer() throws MaxIterationsExceededException, FunctionEvaluationException  {
        BrentOptimizer brentOptimizer = new BrentOptimizer();
        brentOptimizer.setRelativeAccuracy(0.0);
        brentOptimizer.setMaximalIterationCount(-1);
        brentOptimizer.setMaxEvaluations(Integer.MIN_VALUE);
        brentOptimizer.setAbsoluteAccuracy(java.lang.Double.NaN);
        HarmonicFunction harmonicFunction = new HarmonicFunction(java.lang.Double.NEGATIVE_INFINITY, java.lang.Double.POSITIVE_INFINITY, java.lang.Double.NaN);
        GoalType goalType = GoalType.MINIMIZE;
        
        brentOptimizer.optimize(harmonicFunction, goalType, -7.0222388080559215E305, 1.0);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.optimization.univariate.BrentOptimizer.optimize
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method optimize(org.apache.commons.math.analysis.UnivariateRealFunction, org.apache.commons.math.optimization.GoalType, double, double, double)
    
    /**
    @utbot.classUnderTest {@link BrentOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.univariate.BrentOptimizer#optimize(org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double,double)}
 * @utbot.throwsException {@link org.apache.commons.math.exception.NotStrictlyPositiveException} in: return localMin(getGoalType() == GoalType.MINIMIZE, f, goalType, min, startValue, max, getRelativeAccuracy(), getAbsoluteAccuracy());
 *  */
    @Test(expected = NotStrictlyPositiveException.class)
    public void testOptimize_ThrowNotStrictlyPositiveException_11() throws Exception  {
        BrentOptimizer brentOptimizer = ((BrentOptimizer) createInstance("org.apache.commons.math.optimization.univariate.BrentOptimizer"));
        GoalType goal = GoalType.MAXIMIZE;
        setField(brentOptimizer, "org.apache.commons.math.optimization.univariate.AbstractUnivariateRealOptimizer", "goal", goal);
        brentOptimizer.setAbsoluteAccuracy(-0.0);
        brentOptimizer.setRelativeAccuracy(3.337610787760802E-308);
        
        brentOptimizer.optimize(null, null, java.lang.Double.NaN, java.lang.Double.NaN, java.lang.Double.NaN);
    }
    
    /**
    @utbot.classUnderTest {@link BrentOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.univariate.BrentOptimizer#optimize(org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double,double)}
 * @utbot.throwsException {@link org.apache.commons.math.exception.NotStrictlyPositiveException} in: return localMin(getGoalType() == GoalType.MINIMIZE, f, goalType, min, startValue, max, getRelativeAccuracy(), getAbsoluteAccuracy());
 *  */
    @Test(expected = NotStrictlyPositiveException.class)
    public void testOptimize_ThrowNotStrictlyPositiveException_21() throws Exception  {
        BrentOptimizer brentOptimizer = ((BrentOptimizer) createInstance("org.apache.commons.math.optimization.univariate.BrentOptimizer"));
        GoalType goal = GoalType.MINIMIZE;
        setField(brentOptimizer, "org.apache.commons.math.optimization.univariate.AbstractUnivariateRealOptimizer", "goal", goal);
        brentOptimizer.setAbsoluteAccuracy(0.0);
        brentOptimizer.setRelativeAccuracy(-0.0);
        
        brentOptimizer.optimize(null, null, java.lang.Double.NaN, java.lang.Double.NaN, java.lang.Double.NaN);
    }
    
    /**
    @utbot.classUnderTest {@link BrentOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.univariate.BrentOptimizer#optimize(org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double,double)}
 * @utbot.throwsException {@link org.apache.commons.math.exception.NoDataException} 
 *  */
    @Test(expected = NoDataException.class)
    public void testOptimize_ThrowNoDataException1() throws Exception  {
        BrentOptimizer brentOptimizer = ((BrentOptimizer) createInstance("org.apache.commons.math.optimization.univariate.BrentOptimizer"));
        brentOptimizer.setMaxEvaluations(Integer.MIN_VALUE);
        setField(brentOptimizer, "org.apache.commons.math.optimization.univariate.AbstractUnivariateRealOptimizer", "evaluations", Integer.MAX_VALUE);
        GoalType goal = GoalType.MINIMIZE;
        setField(brentOptimizer, "org.apache.commons.math.optimization.univariate.AbstractUnivariateRealOptimizer", "goal", goal);
        brentOptimizer.setAbsoluteAccuracy(java.lang.Double.NaN);
        brentOptimizer.setRelativeAccuracy(java.lang.Double.NaN);
        PolynomialFunction polynomialFunction = ((PolynomialFunction) createInstance("org.apache.commons.math.analysis.polynomials.PolynomialFunction"));
        double[] coefficients = {};
        setField(polynomialFunction, "org.apache.commons.math.analysis.polynomials.PolynomialFunction", "coefficients", coefficients);
        
        brentOptimizer.optimize(polynomialFunction, null, 0.0, -0.0, java.lang.Double.NaN);
    }
    
    /**
    @utbot.classUnderTest {@link BrentOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.univariate.BrentOptimizer#optimize(org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double,double)}
 * @utbot.throwsException {@link org.apache.commons.math.exception.NotStrictlyPositiveException} in: return localMin(getGoalType() == GoalType.MINIMIZE, f, goalType, min, startValue, max, getRelativeAccuracy(), getAbsoluteAccuracy());
 *  */
    @Test(expected = NotStrictlyPositiveException.class)
    public void testOptimize_ThrowNotStrictlyPositiveException1() throws Exception  {
        BrentOptimizer brentOptimizer = ((BrentOptimizer) createInstance("org.apache.commons.math.optimization.univariate.BrentOptimizer"));
        brentOptimizer.setAbsoluteAccuracy(0.0);
        brentOptimizer.setRelativeAccuracy(-0.0);
        
        brentOptimizer.optimize(null, null, java.lang.Double.NaN, java.lang.Double.NaN, java.lang.Double.NaN);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: CHECKED EXCEPTIONS for method optimize(org.apache.commons.math.analysis.UnivariateRealFunction, org.apache.commons.math.optimization.GoalType, double, double, double)
    
    /**
    @utbot.classUnderTest {@link BrentOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.univariate.BrentOptimizer#optimize(org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double,double)}
 * @utbot.throwsException {@link org.apache.commons.math.ArgumentOutsideDomainException} in: return localMin(getGoalType() == GoalType.MINIMIZE, f, goalType, min, startValue, max, getRelativeAccuracy(), getAbsoluteAccuracy());
 *  */
    @Test(expected = ArgumentOutsideDomainException.class)
    public void testOptimize_ThrowArgumentOutsideDomainException() throws Exception  {
        BrentOptimizer brentOptimizer = ((BrentOptimizer) createInstance("org.apache.commons.math.optimization.univariate.BrentOptimizer"));
        brentOptimizer.setMaxEvaluations(Integer.MIN_VALUE);
        setField(brentOptimizer, "org.apache.commons.math.optimization.univariate.AbstractUnivariateRealOptimizer", "evaluations", Integer.MAX_VALUE);
        GoalType goal = GoalType.MINIMIZE;
        setField(brentOptimizer, "org.apache.commons.math.optimization.univariate.AbstractUnivariateRealOptimizer", "goal", goal);
        brentOptimizer.setAbsoluteAccuracy(2.225073858507202E-308);
        brentOptimizer.setRelativeAccuracy(java.lang.Double.NaN);
        PolynomialSplineFunction polynomialSplineFunction = ((PolynomialSplineFunction) createInstance("org.apache.commons.math.analysis.polynomials.PolynomialSplineFunction"));
        double[] knots = {1.6482210157431495E234, -1.2575660686074605E232};
        setField(polynomialSplineFunction, "org.apache.commons.math.analysis.polynomials.PolynomialSplineFunction", "knots", knots);
        setField(polynomialSplineFunction, "org.apache.commons.math.analysis.polynomials.PolynomialSplineFunction", "n", 1);
        
        brentOptimizer.optimize(polynomialSplineFunction, null, 2.1729236899485E-310, 2.29895326396548E-308, 1.6482210157431495E234);
    }
    
    /**
    @utbot.classUnderTest {@link BrentOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.univariate.BrentOptimizer#optimize(org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double,double)}
 * @utbot.throwsException {@link org.apache.commons.math.MaxIterationsExceededException} in: return localMin(getGoalType() == GoalType.MINIMIZE, f, goalType, min, startValue, max, getRelativeAccuracy(), getAbsoluteAccuracy());
 *  */
    @Test(expected = MaxIterationsExceededException.class)
    public void testOptimize_ThrowMaxIterationsExceededException_1() throws Exception  {
        BrentOptimizer brentOptimizer = ((BrentOptimizer) createInstance("org.apache.commons.math.optimization.univariate.BrentOptimizer"));
        brentOptimizer.setMaxEvaluations(Integer.MIN_VALUE);
        setField(brentOptimizer, "org.apache.commons.math.optimization.univariate.AbstractUnivariateRealOptimizer", "evaluations", Integer.MAX_VALUE);
        GoalType goal = GoalType.MAXIMIZE;
        setField(brentOptimizer, "org.apache.commons.math.optimization.univariate.AbstractUnivariateRealOptimizer", "goal", goal);
        brentOptimizer.setAbsoluteAccuracy(2.225073858507202E-308);
        brentOptimizer.setRelativeAccuracy(3.337610787760802E-308);
        PolynomialFunction polynomialFunction = ((PolynomialFunction) createInstance("org.apache.commons.math.analysis.polynomials.PolynomialFunction"));
        double[] coefficients = {0.0, 0.0};
        setField(polynomialFunction, "org.apache.commons.math.analysis.polynomials.PolynomialFunction", "coefficients", coefficients);
        
        brentOptimizer.optimize(polynomialFunction, null, -9.239930003501986E96, 1.3003505175764888E40, java.lang.Double.NaN);
    }
    
    /**
    @utbot.classUnderTest {@link BrentOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.univariate.BrentOptimizer#optimize(org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double,double)}
 * @utbot.throwsException {@link org.apache.commons.math.MaxIterationsExceededException} in: return localMin(getGoalType() == GoalType.MINIMIZE, f, goalType, min, startValue, max, getRelativeAccuracy(), getAbsoluteAccuracy());
 *  */
    @Test(expected = MaxIterationsExceededException.class)
    public void testOptimize_ThrowMaxIterationsExceededException_2() throws Exception  {
        BrentOptimizer brentOptimizer = ((BrentOptimizer) createInstance("org.apache.commons.math.optimization.univariate.BrentOptimizer"));
        brentOptimizer.setMaxEvaluations(Integer.MIN_VALUE);
        setField(brentOptimizer, "org.apache.commons.math.optimization.univariate.AbstractUnivariateRealOptimizer", "evaluations", Integer.MAX_VALUE);
        brentOptimizer.setAbsoluteAccuracy(3.337610787760802E-308);
        brentOptimizer.setRelativeAccuracy(3.337610787760802E-308);
        PolynomialFunction polynomialFunction = ((PolynomialFunction) createInstance("org.apache.commons.math.analysis.polynomials.PolynomialFunction"));
        double[] coefficients = {0.0, 0.0};
        setField(polynomialFunction, "org.apache.commons.math.analysis.polynomials.PolynomialFunction", "coefficients", coefficients);
        GoalType goalType = GoalType.MAXIMIZE;
        
        brentOptimizer.optimize(polynomialFunction, goalType, -3.8846804518764544E16, 3.540138035536098E-281, java.lang.Double.NaN);
    }
    
    /**
    @utbot.classUnderTest {@link BrentOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.univariate.BrentOptimizer#optimize(org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double,double)}
 * @utbot.throwsException {@link org.apache.commons.math.ArgumentOutsideDomainException} in: return localMin(getGoalType() == GoalType.MINIMIZE, f, goalType, min, startValue, max, getRelativeAccuracy(), getAbsoluteAccuracy());
 *  */
    @Test(expected = ArgumentOutsideDomainException.class)
    public void testOptimize_ThrowArgumentOutsideDomainException_1() throws Exception  {
        BrentOptimizer brentOptimizer = ((BrentOptimizer) createInstance("org.apache.commons.math.optimization.univariate.BrentOptimizer"));
        brentOptimizer.setMaxEvaluations(Integer.MIN_VALUE);
        setField(brentOptimizer, "org.apache.commons.math.optimization.univariate.AbstractUnivariateRealOptimizer", "evaluations", Integer.MAX_VALUE);
        GoalType goal = GoalType.MAXIMIZE;
        setField(brentOptimizer, "org.apache.commons.math.optimization.univariate.AbstractUnivariateRealOptimizer", "goal", goal);
        brentOptimizer.setAbsoluteAccuracy(3.337610787760802E-308);
        brentOptimizer.setRelativeAccuracy(3.337610787760802E-308);
        PolynomialSplineFunction polynomialSplineFunction = ((PolynomialSplineFunction) createInstance("org.apache.commons.math.analysis.polynomials.PolynomialSplineFunction"));
        double[] knots = {4.9E-324};
        setField(polynomialSplineFunction, "org.apache.commons.math.analysis.polynomials.PolynomialSplineFunction", "knots", knots);
        
        brentOptimizer.optimize(polynomialSplineFunction, null, 0.0, -0.0, -2.2250738585072014E-308);
    }
    
    /**
    @utbot.classUnderTest {@link BrentOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.univariate.BrentOptimizer#optimize(org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double,double)}
 * @utbot.throwsException {@link org.apache.commons.math.MaxIterationsExceededException} in: return localMin(getGoalType() == GoalType.MINIMIZE, f, goalType, min, startValue, max, getRelativeAccuracy(), getAbsoluteAccuracy());
 *  */
    @Test(expected = MaxIterationsExceededException.class)
    public void testOptimize_ThrowMaxIterationsExceededException1() throws Exception  {
        BrentOptimizer brentOptimizer = ((BrentOptimizer) createInstance("org.apache.commons.math.optimization.univariate.BrentOptimizer"));
        brentOptimizer.setMaxEvaluations(Integer.MIN_VALUE);
        setField(brentOptimizer, "org.apache.commons.math.optimization.univariate.AbstractUnivariateRealOptimizer", "evaluations", Integer.MAX_VALUE);
        GoalType goal = GoalType.MINIMIZE;
        setField(brentOptimizer, "org.apache.commons.math.optimization.univariate.AbstractUnivariateRealOptimizer", "goal", goal);
        brentOptimizer.setAbsoluteAccuracy(2.0E-323);
        brentOptimizer.setRelativeAccuracy(java.lang.Double.NaN);
        PolynomialSplineFunction polynomialSplineFunction = ((PolynomialSplineFunction) createInstance("org.apache.commons.math.analysis.polynomials.PolynomialSplineFunction"));
        double[] knots = {-4.450147717014404E-308, 8.90029543402881E-308, 8.900295434028806E-308};
        setField(polynomialSplineFunction, "org.apache.commons.math.analysis.polynomials.PolynomialSplineFunction", "knots", knots);
        org.apache.commons.math.analysis.polynomials.PolynomialFunction[] polynomials = new org.apache.commons.math.analysis.polynomials.PolynomialFunction[32];
        PolynomialFunction polynomialFunction = ((PolynomialFunction) createInstance("org.apache.commons.math.analysis.polynomials.PolynomialFunction"));
        double[] coefficients = {0.0};
        setField(polynomialFunction, "org.apache.commons.math.analysis.polynomials.PolynomialFunction", "coefficients", coefficients);
        polynomials[0] = polynomialFunction;
        setField(polynomialSplineFunction, "org.apache.commons.math.analysis.polynomials.PolynomialSplineFunction", "polynomials", polynomials);
        setField(polynomialSplineFunction, "org.apache.commons.math.analysis.polynomials.PolynomialSplineFunction", "n", 2);
        
        brentOptimizer.optimize(polynomialSplineFunction, null, -1.664997932744675E-257, 1.8909140490993337E-124, 8.900295434028806E-308);
    }
    
    /**
    @utbot.classUnderTest {@link BrentOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.univariate.BrentOptimizer#optimize(org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double,double)}
 * @utbot.throwsException {@link org.apache.commons.math.FunctionEvaluationException} in: return localMin(getGoalType() == GoalType.MINIMIZE, f, goalType, min, startValue, max, getRelativeAccuracy(), getAbsoluteAccuracy());
 *  */
    @Test(expected = FunctionEvaluationException.class)
    public void testOptimize_ThrowFunctionEvaluationException1() throws Exception  {
        BrentOptimizer brentOptimizer = ((BrentOptimizer) createInstance("org.apache.commons.math.optimization.univariate.BrentOptimizer"));
        brentOptimizer.setAbsoluteAccuracy(3.337610787760802E-308);
        brentOptimizer.setRelativeAccuracy(2.225073858507202E-308);
        
        brentOptimizer.optimize(null, null, -5.001734959250991E87, 1.1063938876596543E-133, java.lang.Double.NaN);
    }
    
    /**
    @utbot.classUnderTest {@link BrentOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.univariate.BrentOptimizer#optimize(org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double,double)}
 * @utbot.throwsException {@link org.apache.commons.math.MaxIterationsExceededException} in: return localMin(getGoalType() == GoalType.MINIMIZE, f, goalType, min, startValue, max, getRelativeAccuracy(), getAbsoluteAccuracy());
 *  */
    @Test(expected = MaxIterationsExceededException.class)
    public void testOptimize_ThrowMaxIterationsExceededException_3() throws Exception  {
        BrentOptimizer brentOptimizer = ((BrentOptimizer) createInstance("org.apache.commons.math.optimization.univariate.BrentOptimizer"));
        brentOptimizer.setMaxEvaluations(Integer.MIN_VALUE);
        setField(brentOptimizer, "org.apache.commons.math.optimization.univariate.AbstractUnivariateRealOptimizer", "evaluations", Integer.MAX_VALUE);
        GoalType goal = GoalType.MINIMIZE;
        setField(brentOptimizer, "org.apache.commons.math.optimization.univariate.AbstractUnivariateRealOptimizer", "goal", goal);
        brentOptimizer.setAbsoluteAccuracy(1.78179742575772E-307);
        brentOptimizer.setRelativeAccuracy(2.848094538899579E-306);
        PolynomialSplineFunction polynomialSplineFunction = ((PolynomialSplineFunction) createInstance("org.apache.commons.math.analysis.polynomials.PolynomialSplineFunction"));
        double[] knots = {0.0, 0.0, -4.9E-324, 4.9E-324, -0.0};
        setField(polynomialSplineFunction, "org.apache.commons.math.analysis.polynomials.PolynomialSplineFunction", "knots", knots);
        org.apache.commons.math.analysis.polynomials.PolynomialFunction[] polynomials = new org.apache.commons.math.analysis.polynomials.PolynomialFunction[2];
        PolynomialFunction polynomialFunction = ((PolynomialFunction) createInstance("org.apache.commons.math.analysis.polynomials.PolynomialFunction"));
        double[] coefficients = {0.0};
        setField(polynomialFunction, "org.apache.commons.math.analysis.polynomials.PolynomialFunction", "coefficients", coefficients);
        polynomials[1] = polynomialFunction;
        setField(polynomialSplineFunction, "org.apache.commons.math.analysis.polynomials.PolynomialSplineFunction", "polynomials", polynomials);
        setField(polynomialSplineFunction, "org.apache.commons.math.analysis.polynomials.PolynomialSplineFunction", "n", 4);
        
        brentOptimizer.optimize(polynomialSplineFunction, null, 1.4753643890586533E-231, 1.4753643890586533E-231, -0.0);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method optimize(org.apache.commons.math.analysis.UnivariateRealFunction, org.apache.commons.math.optimization.GoalType, double, double, double)
    
    /**
    @utbot.classUnderTest {@link BrentOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.univariate.BrentOptimizer#optimize(org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double,double)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} 
 *  */
    @Test
    public void testOptimize_ThrowArrayIndexOutOfBoundsException1() throws Exception  {
        BrentOptimizer brentOptimizer = ((BrentOptimizer) createInstance("org.apache.commons.math.optimization.univariate.BrentOptimizer"));
        brentOptimizer.setMaxEvaluations(Integer.MIN_VALUE);
        setField(brentOptimizer, "org.apache.commons.math.optimization.univariate.AbstractUnivariateRealOptimizer", "evaluations", Integer.MAX_VALUE);
        GoalType goal = GoalType.MAXIMIZE;
        setField(brentOptimizer, "org.apache.commons.math.optimization.univariate.AbstractUnivariateRealOptimizer", "goal", goal);
        brentOptimizer.setAbsoluteAccuracy(3.337610787760802E-308);
        brentOptimizer.setRelativeAccuracy(3.337610787760802E-308);
        PolynomialSplineFunction polynomialSplineFunction = ((PolynomialSplineFunction) createInstance("org.apache.commons.math.analysis.polynomials.PolynomialSplineFunction"));
        double[] knots = {4.9E-324};
        setField(polynomialSplineFunction, "org.apache.commons.math.analysis.polynomials.PolynomialSplineFunction", "knots", knots);
        setField(polynomialSplineFunction, "org.apache.commons.math.analysis.polynomials.PolynomialSplineFunction", "n", Integer.MIN_VALUE);
        
        /* This test fails because method [org.apache.commons.math.optimization.univariate.BrentOptimizer.optimize] produces [java.lang.ArrayIndexOutOfBoundsException: Index -2147483648 out of bounds for length 1]
            org.apache.commons.math.analysis.polynomials.PolynomialSplineFunction.value(PolynomialSplineFunction.java:137)
            org.apache.commons.math.optimization.univariate.AbstractUnivariateRealOptimizer.computeObjectiveValue(AbstractUnivariateRealOptimizer.java:197)
            org.apache.commons.math.optimization.univariate.BrentOptimizer.localMin(BrentOptimizer.java:119)
            org.apache.commons.math.optimization.univariate.BrentOptimizer.optimize(BrentOptimizer.java:61) */
        brentOptimizer.optimize(polynomialSplineFunction, null, -2.201520016081608E-129, 2.7009273408439566E-210, 4.9E-324);
    }
    
    /**
    @utbot.classUnderTest {@link BrentOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.univariate.BrentOptimizer#optimize(org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double,double)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} 
 *  */
    @Test
    public void testOptimize_ThrowArrayIndexOutOfBoundsException_1() throws Exception  {
        BrentOptimizer brentOptimizer = ((BrentOptimizer) createInstance("org.apache.commons.math.optimization.univariate.BrentOptimizer"));
        brentOptimizer.setMaxEvaluations(Integer.MIN_VALUE);
        setField(brentOptimizer, "org.apache.commons.math.optimization.univariate.AbstractUnivariateRealOptimizer", "evaluations", Integer.MAX_VALUE);
        GoalType goal = GoalType.MINIMIZE;
        setField(brentOptimizer, "org.apache.commons.math.optimization.univariate.AbstractUnivariateRealOptimizer", "goal", goal);
        brentOptimizer.setAbsoluteAccuracy(3.337610787760802E-308);
        brentOptimizer.setRelativeAccuracy(3.337610787760802E-308);
        PolynomialSplineFunction polynomialSplineFunction = ((PolynomialSplineFunction) createInstance("org.apache.commons.math.analysis.polynomials.PolynomialSplineFunction"));
        double[] knots = {};
        setField(polynomialSplineFunction, "org.apache.commons.math.analysis.polynomials.PolynomialSplineFunction", "knots", knots);
        
        /* This test fails because method [org.apache.commons.math.optimization.univariate.BrentOptimizer.optimize] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.analysis.polynomials.PolynomialSplineFunction.value(PolynomialSplineFunction.java:137)
            org.apache.commons.math.optimization.univariate.AbstractUnivariateRealOptimizer.computeObjectiveValue(AbstractUnivariateRealOptimizer.java:197)
            org.apache.commons.math.optimization.univariate.BrentOptimizer.localMin(BrentOptimizer.java:119)
            org.apache.commons.math.optimization.univariate.BrentOptimizer.optimize(BrentOptimizer.java:61) */
        brentOptimizer.optimize(polynomialSplineFunction, null, -4.0691070556640625, 4.63090780647199E-308, java.lang.Double.NaN);
    }
    
    /**
    @utbot.classUnderTest {@link BrentOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.univariate.BrentOptimizer#optimize(org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double,double)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} 
 *  */
    @Test
    public void testOptimize_ThrowArrayIndexOutOfBoundsException_2() throws Exception  {
        BrentOptimizer brentOptimizer = ((BrentOptimizer) createInstance("org.apache.commons.math.optimization.univariate.BrentOptimizer"));
        brentOptimizer.setMaxEvaluations(Integer.MIN_VALUE);
        setField(brentOptimizer, "org.apache.commons.math.optimization.univariate.AbstractUnivariateRealOptimizer", "evaluations", Integer.MAX_VALUE);
        GoalType goal = GoalType.MAXIMIZE;
        setField(brentOptimizer, "org.apache.commons.math.optimization.univariate.AbstractUnivariateRealOptimizer", "goal", goal);
        brentOptimizer.setAbsoluteAccuracy(java.lang.Double.NaN);
        brentOptimizer.setRelativeAccuracy(3.337610787760802E-308);
        PolynomialSplineFunction polynomialSplineFunction = ((PolynomialSplineFunction) createInstance("org.apache.commons.math.analysis.polynomials.PolynomialSplineFunction"));
        double[] knots = {4.9E-324};
        setField(polynomialSplineFunction, "org.apache.commons.math.analysis.polynomials.PolynomialSplineFunction", "knots", knots);
        setField(polynomialSplineFunction, "org.apache.commons.math.analysis.polynomials.PolynomialSplineFunction", "n", Integer.MIN_VALUE);
        
        /* This test fails because method [org.apache.commons.math.optimization.univariate.BrentOptimizer.optimize] produces [java.lang.ArrayIndexOutOfBoundsException: Index -2147483648 out of bounds for length 1]
            org.apache.commons.math.analysis.polynomials.PolynomialSplineFunction.value(PolynomialSplineFunction.java:137)
            org.apache.commons.math.optimization.univariate.AbstractUnivariateRealOptimizer.computeObjectiveValue(AbstractUnivariateRealOptimizer.java:197)
            org.apache.commons.math.optimization.univariate.BrentOptimizer.localMin(BrentOptimizer.java:119)
            org.apache.commons.math.optimization.univariate.BrentOptimizer.optimize(BrentOptimizer.java:61) */
        brentOptimizer.optimize(polynomialSplineFunction, null, 0.0, -0.0, 4.9E-324);
    }
    
    /**
    @utbot.classUnderTest {@link BrentOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.univariate.BrentOptimizer#optimize(org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double,double)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} 
 *  */
    @Test
    public void testOptimize_ThrowArrayIndexOutOfBoundsException_3() throws Exception  {
        BrentOptimizer brentOptimizer = ((BrentOptimizer) createInstance("org.apache.commons.math.optimization.univariate.BrentOptimizer"));
        brentOptimizer.setMaxEvaluations(Integer.MIN_VALUE);
        setField(brentOptimizer, "org.apache.commons.math.optimization.univariate.AbstractUnivariateRealOptimizer", "evaluations", Integer.MAX_VALUE);
        brentOptimizer.setAbsoluteAccuracy(6.32E-322);
        brentOptimizer.setRelativeAccuracy(2.2250738750852935E-308);
        PolynomialSplineFunction polynomialSplineFunction = ((PolynomialSplineFunction) createInstance("org.apache.commons.math.analysis.polynomials.PolynomialSplineFunction"));
        double[] knots = {4.458839420064721E-308, 8.917678840129446E-308, 8.917678840129444E-308, 0.0};
        setField(polynomialSplineFunction, "org.apache.commons.math.analysis.polynomials.PolynomialSplineFunction", "knots", knots);
        org.apache.commons.math.analysis.polynomials.PolynomialFunction[] polynomials = {};
        setField(polynomialSplineFunction, "org.apache.commons.math.analysis.polynomials.PolynomialSplineFunction", "polynomials", polynomials);
        setField(polynomialSplineFunction, "org.apache.commons.math.analysis.polynomials.PolynomialSplineFunction", "n", 2);
        
        /* This test fails because method [org.apache.commons.math.optimization.univariate.BrentOptimizer.optimize] produces [java.lang.ArrayIndexOutOfBoundsException: Index -1 out of bounds for length 0]
            org.apache.commons.math.analysis.polynomials.PolynomialSplineFunction.value(PolynomialSplineFunction.java:150)
            org.apache.commons.math.optimization.univariate.AbstractUnivariateRealOptimizer.computeObjectiveValue(AbstractUnivariateRealOptimizer.java:197)
            org.apache.commons.math.optimization.univariate.BrentOptimizer.localMin(BrentOptimizer.java:119)
            org.apache.commons.math.optimization.univariate.BrentOptimizer.optimize(BrentOptimizer.java:61) */
        brentOptimizer.optimize(polynomialSplineFunction, null, -1.0931393251292467E-143, -1.9628562802743495E-149, 8.917678840129444E-308);
    }
    
    /**
    @utbot.classUnderTest {@link BrentOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.univariate.BrentOptimizer#optimize(org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double,double)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} 
 *  */
    @Test
    public void testOptimize_ThrowArrayIndexOutOfBoundsException_4() throws Exception  {
        BrentOptimizer brentOptimizer = ((BrentOptimizer) createInstance("org.apache.commons.math.optimization.univariate.BrentOptimizer"));
        brentOptimizer.setMaxEvaluations(1342177280);
        setField(brentOptimizer, "org.apache.commons.math.optimization.univariate.AbstractUnivariateRealOptimizer", "evaluations", 1342177279);
        brentOptimizer.setAbsoluteAccuracy(java.lang.Double.NaN);
        brentOptimizer.setRelativeAccuracy(3.337610787760802E-308);
        PolynomialSplineFunction polynomialSplineFunction = ((PolynomialSplineFunction) createInstance("org.apache.commons.math.analysis.polynomials.PolynomialSplineFunction"));
        double[] knots = {java.lang.Double.NaN};
        setField(polynomialSplineFunction, "org.apache.commons.math.analysis.polynomials.PolynomialSplineFunction", "knots", knots);
        org.apache.commons.math.analysis.polynomials.PolynomialFunction[] polynomials = {};
        setField(polynomialSplineFunction, "org.apache.commons.math.analysis.polynomials.PolynomialSplineFunction", "polynomials", polynomials);
        
        /* This test fails because method [org.apache.commons.math.optimization.univariate.BrentOptimizer.optimize] produces [java.lang.ArrayIndexOutOfBoundsException: Index -1 out of bounds for length 0]
            org.apache.commons.math.analysis.polynomials.PolynomialSplineFunction.value(PolynomialSplineFunction.java:150)
            org.apache.commons.math.optimization.univariate.AbstractUnivariateRealOptimizer.computeObjectiveValue(AbstractUnivariateRealOptimizer.java:197)
            org.apache.commons.math.optimization.univariate.BrentOptimizer.localMin(BrentOptimizer.java:119)
            org.apache.commons.math.optimization.univariate.BrentOptimizer.optimize(BrentOptimizer.java:61) */
        brentOptimizer.optimize(polynomialSplineFunction, null, 2.225209666237823E-308, 2.225209666237823E-308, java.lang.Double.NaN);
    }
    
    /**
    @utbot.classUnderTest {@link BrentOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.univariate.BrentOptimizer#optimize(org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double,double)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} 
 *  */
    @Test
    public void testOptimize_ThrowArrayIndexOutOfBoundsException_5() throws Exception  {
        BrentOptimizer brentOptimizer = ((BrentOptimizer) createInstance("org.apache.commons.math.optimization.univariate.BrentOptimizer"));
        brentOptimizer.setMaxEvaluations(Integer.MIN_VALUE);
        setField(brentOptimizer, "org.apache.commons.math.optimization.univariate.AbstractUnivariateRealOptimizer", "evaluations", Integer.MAX_VALUE);
        brentOptimizer.setAbsoluteAccuracy(2.2250738585072014E-308);
        brentOptimizer.setRelativeAccuracy(java.lang.Double.NaN);
        PolynomialSplineFunction polynomialSplineFunction = ((PolynomialSplineFunction) createInstance("org.apache.commons.math.analysis.polynomials.PolynomialSplineFunction"));
        double[] knots = {1.780059086805762E-307, 0.0, 4.9E-324, 2.0000000000000004, 0.0};
        setField(polynomialSplineFunction, "org.apache.commons.math.analysis.polynomials.PolynomialSplineFunction", "knots", knots);
        org.apache.commons.math.analysis.polynomials.PolynomialFunction[] polynomials = {};
        setField(polynomialSplineFunction, "org.apache.commons.math.analysis.polynomials.PolynomialSplineFunction", "polynomials", polynomials);
        
        /* This test fails because method [org.apache.commons.math.optimization.univariate.BrentOptimizer.optimize] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 0]
            org.apache.commons.math.analysis.polynomials.PolynomialSplineFunction.value(PolynomialSplineFunction.java:150)
            org.apache.commons.math.optimization.univariate.AbstractUnivariateRealOptimizer.computeObjectiveValue(AbstractUnivariateRealOptimizer.java:197)
            org.apache.commons.math.optimization.univariate.BrentOptimizer.localMin(BrentOptimizer.java:119)
            org.apache.commons.math.optimization.univariate.BrentOptimizer.optimize(BrentOptimizer.java:61) */
        brentOptimizer.optimize(polynomialSplineFunction, null, 0.0, -0.0, 1.780059086805762E-307);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.optimization.univariate.BrentOptimizer.doOptimize
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method doOptimize()
    
    /**
    @utbot.classUnderTest {@link BrentOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.univariate.BrentOptimizer#doOptimize()}
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} in: throw new UnsupportedOperationException();
 *  */
    @Test(expected = UnsupportedOperationException.class)
    public void testDoOptimize_ThrowUnsupportedOperationException() throws Exception  {
        BrentOptimizer brentOptimizer = ((BrentOptimizer) createInstance("org.apache.commons.math.optimization.univariate.BrentOptimizer"));
        
        brentOptimizer.doOptimize();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.optimization.univariate.BrentOptimizer.localMin
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method localMin(boolean, org.apache.commons.math.analysis.UnivariateRealFunction, org.apache.commons.math.optimization.GoalType, double, double, double, double, double)
    
    /**
    @utbot.classUnderTest {@link BrentOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.univariate.BrentOptimizer#localMin(boolean,org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double,double,double,double)}
 * @utbot.executesCondition {@code (eps <= 0): True}
 * @utbot.throwsException {@link org.apache.commons.math.exception.NotStrictlyPositiveException} when: eps <= 0
 *  */
    @Test(expected = NotStrictlyPositiveException.class)
    public void testLocalMin_ThrowNotStrictlyPositiveException() throws Throwable  {
        BrentOptimizer brentOptimizer = ((BrentOptimizer) createInstance("org.apache.commons.math.optimization.univariate.BrentOptimizer"));
        
        Class brentOptimizerClazz = Class.forName("org.apache.commons.math.optimization.univariate.BrentOptimizer");
        Class booleanType = boolean.class;
        Class univariateRealFunctionType = Class.forName("org.apache.commons.math.analysis.UnivariateRealFunction");
        Class goalTypeType = Class.forName("org.apache.commons.math.optimization.GoalType");
        Class doubleType = double.class;
        Method localMinMethod = brentOptimizerClazz.getDeclaredMethod("localMin", booleanType, univariateRealFunctionType, goalTypeType, doubleType, doubleType, doubleType, doubleType, doubleType);
        localMinMethod.setAccessible(true);
        java.lang.Object[] localMinMethodArguments = new java.lang.Object[8];
        localMinMethodArguments[0] = false;
        localMinMethodArguments[1] = ((Object) null);
        localMinMethodArguments[2] = ((Object) null);
        localMinMethodArguments[3] = java.lang.Double.NaN;
        localMinMethodArguments[4] = java.lang.Double.NaN;
        localMinMethodArguments[5] = java.lang.Double.NaN;
        localMinMethodArguments[6] = -0.0;
        localMinMethodArguments[7] = java.lang.Double.NaN;
        try {
            localMinMethod.invoke(brentOptimizer, localMinMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link BrentOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.univariate.BrentOptimizer#localMin(boolean,org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double,double,double,double)}
 * @utbot.executesCondition {@code (eps <= 0): False}
 * @utbot.executesCondition {@code (t <= 0): True}
 * @utbot.throwsException {@link org.apache.commons.math.exception.NotStrictlyPositiveException} when: t <= 0
 *  */
    @Test(expected = NotStrictlyPositiveException.class)
    public void testLocalMin_ThrowNotStrictlyPositiveException_1() throws Throwable  {
        BrentOptimizer brentOptimizer = ((BrentOptimizer) createInstance("org.apache.commons.math.optimization.univariate.BrentOptimizer"));
        
        Class brentOptimizerClazz = Class.forName("org.apache.commons.math.optimization.univariate.BrentOptimizer");
        Class booleanType = boolean.class;
        Class univariateRealFunctionType = Class.forName("org.apache.commons.math.analysis.UnivariateRealFunction");
        Class goalTypeType = Class.forName("org.apache.commons.math.optimization.GoalType");
        Class doubleType = double.class;
        Method localMinMethod = brentOptimizerClazz.getDeclaredMethod("localMin", booleanType, univariateRealFunctionType, goalTypeType, doubleType, doubleType, doubleType, doubleType, doubleType);
        localMinMethod.setAccessible(true);
        java.lang.Object[] localMinMethodArguments = new java.lang.Object[8];
        localMinMethodArguments[0] = false;
        localMinMethodArguments[1] = ((Object) null);
        localMinMethodArguments[2] = ((Object) null);
        localMinMethodArguments[3] = java.lang.Double.NaN;
        localMinMethodArguments[4] = java.lang.Double.NaN;
        localMinMethodArguments[5] = java.lang.Double.NaN;
        localMinMethodArguments[6] = 2.225073858507202E-308;
        localMinMethodArguments[7] = -0.0;
        try {
            localMinMethod.invoke(brentOptimizer, localMinMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link BrentOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.univariate.BrentOptimizer#localMin(boolean,org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double,double,double,double)}
 * @utbot.executesCondition {@code (eps <= 0): False}
 * @utbot.executesCondition {@code (t <= 0): False}
 * @utbot.executesCondition {@code (lo < hi): True}
 * @utbot.throwsException {@link org.apache.commons.math.exception.NoDataException} in: double fx = computeObjectiveValue(f, x);
 *  */
    @Test(expected = NoDataException.class)
    public void testLocalMin_ThrowNoDataException_1() throws Throwable  {
        BrentOptimizer brentOptimizer = ((BrentOptimizer) createInstance("org.apache.commons.math.optimization.univariate.BrentOptimizer"));
        brentOptimizer.setMaxEvaluations(Integer.MIN_VALUE);
        setField(brentOptimizer, "org.apache.commons.math.optimization.univariate.AbstractUnivariateRealOptimizer", "evaluations", Integer.MAX_VALUE);
        PolynomialFunction polynomialFunction = ((PolynomialFunction) createInstance("org.apache.commons.math.analysis.polynomials.PolynomialFunction"));
        double[] coefficients = {};
        setField(polynomialFunction, "org.apache.commons.math.analysis.polynomials.PolynomialFunction", "coefficients", coefficients);
        
        Class brentOptimizerClazz = Class.forName("org.apache.commons.math.optimization.univariate.BrentOptimizer");
        Class booleanType = boolean.class;
        Class polynomialFunctionType = Class.forName("org.apache.commons.math.analysis.UnivariateRealFunction");
        Class goalTypeType = Class.forName("org.apache.commons.math.optimization.GoalType");
        Class doubleType = double.class;
        Method localMinMethod = brentOptimizerClazz.getDeclaredMethod("localMin", booleanType, polynomialFunctionType, goalTypeType, doubleType, doubleType, doubleType, doubleType, doubleType);
        localMinMethod.setAccessible(true);
        java.lang.Object[] localMinMethodArguments = new java.lang.Object[8];
        localMinMethodArguments[0] = false;
        localMinMethodArguments[1] = polynomialFunction;
        localMinMethodArguments[2] = ((Object) null);
        localMinMethodArguments[3] = -2.281654654873758E174;
        localMinMethodArguments[4] = java.lang.Double.NaN;
        localMinMethodArguments[5] = 1.3799564344019075E-268;
        localMinMethodArguments[6] = 2.225073858523391E-308;
        localMinMethodArguments[7] = 2.5032080908206016E-308;
        try {
            localMinMethod.invoke(brentOptimizer, localMinMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link BrentOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.univariate.BrentOptimizer#localMin(boolean,org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double,double,double,double)}
 * @utbot.executesCondition {@code (eps <= 0): False}
 * @utbot.executesCondition {@code (t <= 0): False}
 * @utbot.executesCondition {@code (lo < hi): False}
 * @utbot.throwsException {@link org.apache.commons.math.exception.NoDataException} in: double fx = computeObjectiveValue(f, x);
 *  */
    @Test(expected = NoDataException.class)
    public void testLocalMin_ThrowNoDataException() throws Throwable  {
        BrentOptimizer brentOptimizer = ((BrentOptimizer) createInstance("org.apache.commons.math.optimization.univariate.BrentOptimizer"));
        brentOptimizer.setMaxEvaluations(Integer.MIN_VALUE);
        setField(brentOptimizer, "org.apache.commons.math.optimization.univariate.AbstractUnivariateRealOptimizer", "evaluations", Integer.MAX_VALUE);
        PolynomialSplineFunction polynomialSplineFunction = ((PolynomialSplineFunction) createInstance("org.apache.commons.math.analysis.polynomials.PolynomialSplineFunction"));
        double[] knots = {1.251797322806464E-308};
        setField(polynomialSplineFunction, "org.apache.commons.math.analysis.polynomials.PolynomialSplineFunction", "knots", knots);
        org.apache.commons.math.analysis.polynomials.PolynomialFunction[] polynomials = new org.apache.commons.math.analysis.polynomials.PolynomialFunction[1];
        PolynomialFunction polynomialFunction = ((PolynomialFunction) createInstance("org.apache.commons.math.analysis.polynomials.PolynomialFunction"));
        double[] coefficients = {};
        setField(polynomialFunction, "org.apache.commons.math.analysis.polynomials.PolynomialFunction", "coefficients", coefficients);
        polynomials[0] = polynomialFunction;
        setField(polynomialSplineFunction, "org.apache.commons.math.analysis.polynomials.PolynomialSplineFunction", "polynomials", polynomials);
        
        Class brentOptimizerClazz = Class.forName("org.apache.commons.math.optimization.univariate.BrentOptimizer");
        Class booleanType = boolean.class;
        Class polynomialSplineFunctionType = Class.forName("org.apache.commons.math.analysis.UnivariateRealFunction");
        Class goalTypeType = Class.forName("org.apache.commons.math.optimization.GoalType");
        Class doubleType = double.class;
        Method localMinMethod = brentOptimizerClazz.getDeclaredMethod("localMin", booleanType, polynomialSplineFunctionType, goalTypeType, doubleType, doubleType, doubleType, doubleType, doubleType);
        localMinMethod.setAccessible(true);
        java.lang.Object[] localMinMethodArguments = new java.lang.Object[8];
        localMinMethodArguments[0] = false;
        localMinMethodArguments[1] = polynomialSplineFunction;
        localMinMethodArguments[2] = ((Object) null);
        localMinMethodArguments[3] = 4.7783097267364807E-299;
        localMinMethodArguments[4] = 1.251797322806464E-308;
        localMinMethodArguments[5] = 4.7783097267364807E-299;
        localMinMethodArguments[6] = 1.7800862483518855E-307;
        localMinMethodArguments[7] = 2.2250738585072646E-308;
        try {
            localMinMethod.invoke(brentOptimizer, localMinMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: CHECKED EXCEPTIONS for method localMin(boolean, org.apache.commons.math.analysis.UnivariateRealFunction, org.apache.commons.math.optimization.GoalType, double, double, double, double, double)
    
    /**
    @utbot.classUnderTest {@link BrentOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.univariate.BrentOptimizer#localMin(boolean,org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double,double,double,double)}
 * @utbot.executesCondition {@code (lo < hi): True}
 * @utbot.executesCondition {@code (goalType == GoalType.MAXIMIZE): True}
 * @utbot.throwsException {@link org.apache.commons.math.MaxIterationsExceededException} in: throw new MaxIterationsExceededException(maximalIterationCount);
 *  */
    @Test(expected = MaxIterationsExceededException.class)
    public void testLocalMin_ThrowMaxIterationsExceededException() throws Throwable  {
        BrentOptimizer brentOptimizer = ((BrentOptimizer) createInstance("org.apache.commons.math.optimization.univariate.BrentOptimizer"));
        brentOptimizer.setMaxEvaluations(Integer.MIN_VALUE);
        setField(brentOptimizer, "org.apache.commons.math.optimization.univariate.AbstractUnivariateRealOptimizer", "evaluations", Integer.MAX_VALUE);
        PolynomialFunction polynomialFunction = ((PolynomialFunction) createInstance("org.apache.commons.math.analysis.polynomials.PolynomialFunction"));
        double[] coefficients = {0.0};
        setField(polynomialFunction, "org.apache.commons.math.analysis.polynomials.PolynomialFunction", "coefficients", coefficients);
        GoalType goalType = GoalType.MAXIMIZE;
        
        Class brentOptimizerClazz = Class.forName("org.apache.commons.math.optimization.univariate.BrentOptimizer");
        Class booleanType = boolean.class;
        Class polynomialFunctionType = Class.forName("org.apache.commons.math.analysis.UnivariateRealFunction");
        Class goalTypeType = Class.forName("org.apache.commons.math.optimization.GoalType");
        Class doubleType = double.class;
        Method localMinMethod = brentOptimizerClazz.getDeclaredMethod("localMin", booleanType, polynomialFunctionType, goalTypeType, doubleType, doubleType, doubleType, doubleType, doubleType);
        localMinMethod.setAccessible(true);
        java.lang.Object[] localMinMethodArguments = new java.lang.Object[8];
        localMinMethodArguments[0] = false;
        localMinMethodArguments[1] = polynomialFunction;
        localMinMethodArguments[2] = goalType;
        localMinMethodArguments[3] = -6.519094624060902E79;
        localMinMethodArguments[4] = java.lang.Double.NaN;
        localMinMethodArguments[5] = 304640.00000000006;
        localMinMethodArguments[6] = 7.291122019556399E-304;
        localMinMethodArguments[7] = 2.225073858507202E-308;
        try {
            localMinMethod.invoke(brentOptimizer, localMinMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link BrentOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.univariate.BrentOptimizer#localMin(boolean,org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double,double,double,double)}
 * @utbot.executesCondition {@code (lo < hi): False}
 * @utbot.throwsException {@link org.apache.commons.math.FunctionEvaluationException} in: double fx = computeObjectiveValue(f, x);
 *  */
    @Test(expected = FunctionEvaluationException.class)
    public void testLocalMin_ThrowFunctionEvaluationException() throws Throwable  {
        BrentOptimizer brentOptimizer = ((BrentOptimizer) createInstance("org.apache.commons.math.optimization.univariate.BrentOptimizer"));
        
        Class brentOptimizerClazz = Class.forName("org.apache.commons.math.optimization.univariate.BrentOptimizer");
        Class booleanType = boolean.class;
        Class univariateRealFunctionType = Class.forName("org.apache.commons.math.analysis.UnivariateRealFunction");
        Class goalTypeType = Class.forName("org.apache.commons.math.optimization.GoalType");
        Class doubleType = double.class;
        Method localMinMethod = brentOptimizerClazz.getDeclaredMethod("localMin", booleanType, univariateRealFunctionType, goalTypeType, doubleType, doubleType, doubleType, doubleType, doubleType);
        localMinMethod.setAccessible(true);
        java.lang.Object[] localMinMethodArguments = new java.lang.Object[8];
        localMinMethodArguments[0] = false;
        localMinMethodArguments[1] = ((Object) null);
        localMinMethodArguments[2] = ((Object) null);
        localMinMethodArguments[3] = 0.0;
        localMinMethodArguments[4] = java.lang.Double.NaN;
        localMinMethodArguments[5] = -0.0;
        localMinMethodArguments[6] = 2.225073858507202E-308;
        localMinMethodArguments[7] = 2.225073858507202E-308;
        try {
            localMinMethod.invoke(brentOptimizer, localMinMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link BrentOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.univariate.BrentOptimizer#localMin(boolean,org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double,double,double,double)}
 * @utbot.executesCondition {@code (lo < hi): True}
 * @utbot.throwsException {@link org.apache.commons.math.FunctionEvaluationException} in: double fx = computeObjectiveValue(f, x);
 *  */
    @Test(expected = FunctionEvaluationException.class)
    public void testLocalMin_ThrowFunctionEvaluationException_1() throws Throwable  {
        BrentOptimizer brentOptimizer = ((BrentOptimizer) createInstance("org.apache.commons.math.optimization.univariate.BrentOptimizer"));
        
        Class brentOptimizerClazz = Class.forName("org.apache.commons.math.optimization.univariate.BrentOptimizer");
        Class booleanType = boolean.class;
        Class univariateRealFunctionType = Class.forName("org.apache.commons.math.analysis.UnivariateRealFunction");
        Class goalTypeType = Class.forName("org.apache.commons.math.optimization.GoalType");
        Class doubleType = double.class;
        Method localMinMethod = brentOptimizerClazz.getDeclaredMethod("localMin", booleanType, univariateRealFunctionType, goalTypeType, doubleType, doubleType, doubleType, doubleType, doubleType);
        localMinMethod.setAccessible(true);
        java.lang.Object[] localMinMethodArguments = new java.lang.Object[8];
        localMinMethodArguments[0] = false;
        localMinMethodArguments[1] = ((Object) null);
        localMinMethodArguments[2] = ((Object) null);
        localMinMethodArguments[3] = -5.424738273153593E176;
        localMinMethodArguments[4] = java.lang.Double.NaN;
        localMinMethodArguments[5] = 1.2470149910198928E-263;
        localMinMethodArguments[6] = 2.225073858507202E-308;
        localMinMethodArguments[7] = 2.225073859543332E-308;
        try {
            localMinMethod.invoke(brentOptimizer, localMinMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link BrentOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.univariate.BrentOptimizer#localMin(boolean,org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double,double,double,double)}
 * @utbot.executesCondition {@code (lo < hi): False}
 * @utbot.throwsException {@link org.apache.commons.math.ArgumentOutsideDomainException} in: double fx = computeObjectiveValue(f, x);
 *  */
    @Test(expected = ArgumentOutsideDomainException.class)
    public void testLocalMin_ThrowArgumentOutsideDomainException() throws Throwable  {
        BrentOptimizer brentOptimizer = ((BrentOptimizer) createInstance("org.apache.commons.math.optimization.univariate.BrentOptimizer"));
        brentOptimizer.setMaxEvaluations(Integer.MIN_VALUE);
        setField(brentOptimizer, "org.apache.commons.math.optimization.univariate.AbstractUnivariateRealOptimizer", "evaluations", Integer.MAX_VALUE);
        PolynomialSplineFunction polynomialSplineFunction = ((PolynomialSplineFunction) createInstance("org.apache.commons.math.analysis.polynomials.PolynomialSplineFunction"));
        double[] knots = {4.104540715689704E-289, -4.450151961005986E-308};
        setField(polynomialSplineFunction, "org.apache.commons.math.analysis.polynomials.PolynomialSplineFunction", "knots", knots);
        setField(polynomialSplineFunction, "org.apache.commons.math.analysis.polynomials.PolynomialSplineFunction", "n", 1);
        
        Class brentOptimizerClazz = Class.forName("org.apache.commons.math.optimization.univariate.BrentOptimizer");
        Class booleanType = boolean.class;
        Class polynomialSplineFunctionType = Class.forName("org.apache.commons.math.analysis.UnivariateRealFunction");
        Class goalTypeType = Class.forName("org.apache.commons.math.optimization.GoalType");
        Class doubleType = double.class;
        Method localMinMethod = brentOptimizerClazz.getDeclaredMethod("localMin", booleanType, polynomialSplineFunctionType, goalTypeType, doubleType, doubleType, doubleType, doubleType, doubleType);
        localMinMethod.setAccessible(true);
        java.lang.Object[] localMinMethodArguments = new java.lang.Object[8];
        localMinMethodArguments[0] = false;
        localMinMethodArguments[1] = polynomialSplineFunction;
        localMinMethodArguments[2] = ((Object) null);
        localMinMethodArguments[3] = -0.0;
        localMinMethodArguments[4] = 4.104540715689704E-289;
        localMinMethodArguments[5] = 0.0;
        localMinMethodArguments[6] = 2.225073858523391E-308;
        localMinMethodArguments[7] = 2.2250739911319383E-308;
        try {
            localMinMethod.invoke(brentOptimizer, localMinMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link BrentOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.univariate.BrentOptimizer#localMin(boolean,org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double,double,double,double)}
 * @utbot.executesCondition {@code (lo < hi): False}
 * @utbot.throwsException {@link org.apache.commons.math.ArgumentOutsideDomainException} in: double fx = computeObjectiveValue(f, x);
 *  */
    @Test(expected = ArgumentOutsideDomainException.class)
    public void testLocalMin_ThrowArgumentOutsideDomainException_1() throws Throwable  {
        BrentOptimizer brentOptimizer = ((BrentOptimizer) createInstance("org.apache.commons.math.optimization.univariate.BrentOptimizer"));
        brentOptimizer.setMaxEvaluations(Integer.MIN_VALUE);
        setField(brentOptimizer, "org.apache.commons.math.optimization.univariate.AbstractUnivariateRealOptimizer", "evaluations", Integer.MAX_VALUE);
        PolynomialSplineFunction polynomialSplineFunction = ((PolynomialSplineFunction) createInstance("org.apache.commons.math.analysis.polynomials.PolynomialSplineFunction"));
        double[] knots = {-5.373598021922308E154};
        setField(polynomialSplineFunction, "org.apache.commons.math.analysis.polynomials.PolynomialSplineFunction", "knots", knots);
        
        Class brentOptimizerClazz = Class.forName("org.apache.commons.math.optimization.univariate.BrentOptimizer");
        Class booleanType = boolean.class;
        Class polynomialSplineFunctionType = Class.forName("org.apache.commons.math.analysis.UnivariateRealFunction");
        Class goalTypeType = Class.forName("org.apache.commons.math.optimization.GoalType");
        Class doubleType = double.class;
        Method localMinMethod = brentOptimizerClazz.getDeclaredMethod("localMin", booleanType, polynomialSplineFunctionType, goalTypeType, doubleType, doubleType, doubleType, doubleType, doubleType);
        localMinMethod.setAccessible(true);
        java.lang.Object[] localMinMethodArguments = new java.lang.Object[8];
        localMinMethodArguments[0] = false;
        localMinMethodArguments[1] = polynomialSplineFunction;
        localMinMethodArguments[2] = ((Object) null);
        localMinMethodArguments[3] = -1.246573259652818E-308;
        localMinMethodArguments[4] = -9.142703268906977E192;
        localMinMethodArguments[5] = -1.246573259652818E-308;
        localMinMethodArguments[6] = 1.835685933268441E-307;
        localMinMethodArguments[7] = java.lang.Double.NaN;
        try {
            localMinMethod.invoke(brentOptimizer, localMinMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method localMin(boolean, org.apache.commons.math.analysis.UnivariateRealFunction, org.apache.commons.math.optimization.GoalType, double, double, double, double, double)
    
    /**
    @utbot.classUnderTest {@link BrentOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.univariate.BrentOptimizer#localMin(boolean,org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double,double,double,double)}
 * @utbot.executesCondition {@code (lo < hi): False}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: double fx = computeObjectiveValue(f, x);
 *  */
    @Test
    public void testLocalMin_ThrowArrayIndexOutOfBoundsException() throws Throwable  {
        BrentOptimizer brentOptimizer = ((BrentOptimizer) createInstance("org.apache.commons.math.optimization.univariate.BrentOptimizer"));
        brentOptimizer.setMaxEvaluations(Integer.MIN_VALUE);
        setField(brentOptimizer, "org.apache.commons.math.optimization.univariate.AbstractUnivariateRealOptimizer", "evaluations", Integer.MAX_VALUE);
        PolynomialSplineFunction polynomialSplineFunction = ((PolynomialSplineFunction) createInstance("org.apache.commons.math.analysis.polynomials.PolynomialSplineFunction"));
        double[] knots = {};
        setField(polynomialSplineFunction, "org.apache.commons.math.analysis.polynomials.PolynomialSplineFunction", "knots", knots);
        
        /* This test fails because method [org.apache.commons.math.optimization.univariate.BrentOptimizer.localMin] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.analysis.polynomials.PolynomialSplineFunction.value(PolynomialSplineFunction.java:137)
            org.apache.commons.math.optimization.univariate.AbstractUnivariateRealOptimizer.computeObjectiveValue(AbstractUnivariateRealOptimizer.java:197)
            org.apache.commons.math.optimization.univariate.BrentOptimizer.localMin(BrentOptimizer.java:119) */
        Class brentOptimizerClazz = Class.forName("org.apache.commons.math.optimization.univariate.BrentOptimizer");
        Class booleanType = boolean.class;
        Class polynomialSplineFunctionType = Class.forName("org.apache.commons.math.analysis.UnivariateRealFunction");
        Class goalTypeType = Class.forName("org.apache.commons.math.optimization.GoalType");
        Class doubleType = double.class;
        Method localMinMethod = brentOptimizerClazz.getDeclaredMethod("localMin", booleanType, polynomialSplineFunctionType, goalTypeType, doubleType, doubleType, doubleType, doubleType, doubleType);
        localMinMethod.setAccessible(true);
        java.lang.Object[] localMinMethodArguments = new java.lang.Object[8];
        localMinMethodArguments[0] = false;
        localMinMethodArguments[1] = polynomialSplineFunction;
        localMinMethodArguments[2] = ((Object) null);
        localMinMethodArguments[3] = 0.0;
        localMinMethodArguments[4] = java.lang.Double.NaN;
        localMinMethodArguments[5] = -0.0;
        localMinMethodArguments[6] = 2.225073858523391E-308;
        localMinMethodArguments[7] = 2.225073858507202E-308;
        try {
            localMinMethod.invoke(brentOptimizer, localMinMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link BrentOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.univariate.BrentOptimizer#localMin(boolean,org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double,double,double,double)}
 * @utbot.executesCondition {@code (lo < hi): True}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: double fx = computeObjectiveValue(f, x);
 *  */
    @Test
    public void testLocalMin_ThrowArrayIndexOutOfBoundsException_1() throws Throwable  {
        BrentOptimizer brentOptimizer = ((BrentOptimizer) createInstance("org.apache.commons.math.optimization.univariate.BrentOptimizer"));
        brentOptimizer.setMaxEvaluations(Integer.MIN_VALUE);
        setField(brentOptimizer, "org.apache.commons.math.optimization.univariate.AbstractUnivariateRealOptimizer", "evaluations", Integer.MAX_VALUE);
        PolynomialSplineFunction polynomialSplineFunction = ((PolynomialSplineFunction) createInstance("org.apache.commons.math.analysis.polynomials.PolynomialSplineFunction"));
        double[] knots = {4.9E-324};
        setField(polynomialSplineFunction, "org.apache.commons.math.analysis.polynomials.PolynomialSplineFunction", "knots", knots);
        setField(polynomialSplineFunction, "org.apache.commons.math.analysis.polynomials.PolynomialSplineFunction", "n", 1073741824);
        
        /* This test fails because method [org.apache.commons.math.optimization.univariate.BrentOptimizer.localMin] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1073741824 out of bounds for length 1]
            org.apache.commons.math.analysis.polynomials.PolynomialSplineFunction.value(PolynomialSplineFunction.java:137)
            org.apache.commons.math.optimization.univariate.AbstractUnivariateRealOptimizer.computeObjectiveValue(AbstractUnivariateRealOptimizer.java:197)
            org.apache.commons.math.optimization.univariate.BrentOptimizer.localMin(BrentOptimizer.java:119) */
        Class brentOptimizerClazz = Class.forName("org.apache.commons.math.optimization.univariate.BrentOptimizer");
        Class booleanType = boolean.class;
        Class polynomialSplineFunctionType = Class.forName("org.apache.commons.math.analysis.UnivariateRealFunction");
        Class goalTypeType = Class.forName("org.apache.commons.math.optimization.GoalType");
        Class doubleType = double.class;
        Method localMinMethod = brentOptimizerClazz.getDeclaredMethod("localMin", booleanType, polynomialSplineFunctionType, goalTypeType, doubleType, doubleType, doubleType, doubleType, doubleType);
        localMinMethod.setAccessible(true);
        java.lang.Object[] localMinMethodArguments = new java.lang.Object[8];
        localMinMethodArguments[0] = false;
        localMinMethodArguments[1] = polynomialSplineFunction;
        localMinMethodArguments[2] = ((Object) null);
        localMinMethodArguments[3] = 2.225073858507202E-308;
        localMinMethodArguments[4] = 4.9E-324;
        localMinMethodArguments[5] = 4.450147717014407E-308;
        localMinMethodArguments[6] = 2.225073858523391E-308;
        localMinMethodArguments[7] = 2.225073860579463E-308;
        try {
            localMinMethod.invoke(brentOptimizer, localMinMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link BrentOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.univariate.BrentOptimizer#localMin(boolean,org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double,double,double,double)}
 * @utbot.executesCondition {@code (lo < hi): False}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: double fx = computeObjectiveValue(f, x);
 *  */
    @Test
    public void testLocalMin_ThrowArrayIndexOutOfBoundsException_2() throws Throwable  {
        BrentOptimizer brentOptimizer = ((BrentOptimizer) createInstance("org.apache.commons.math.optimization.univariate.BrentOptimizer"));
        brentOptimizer.setMaxEvaluations(Integer.MIN_VALUE);
        setField(brentOptimizer, "org.apache.commons.math.optimization.univariate.AbstractUnivariateRealOptimizer", "evaluations", Integer.MAX_VALUE);
        PolynomialSplineFunction polynomialSplineFunction = ((PolynomialSplineFunction) createInstance("org.apache.commons.math.analysis.polynomials.PolynomialSplineFunction"));
        double[] knots = {2.83227555819057E-309};
        setField(polynomialSplineFunction, "org.apache.commons.math.analysis.polynomials.PolynomialSplineFunction", "knots", knots);
        setField(polynomialSplineFunction, "org.apache.commons.math.analysis.polynomials.PolynomialSplineFunction", "n", Integer.MIN_VALUE);
        
        /* This test fails because method [org.apache.commons.math.optimization.univariate.BrentOptimizer.localMin] produces [java.lang.ArrayIndexOutOfBoundsException: Index -2147483648 out of bounds for length 1]
            org.apache.commons.math.analysis.polynomials.PolynomialSplineFunction.value(PolynomialSplineFunction.java:137)
            org.apache.commons.math.optimization.univariate.AbstractUnivariateRealOptimizer.computeObjectiveValue(AbstractUnivariateRealOptimizer.java:197)
            org.apache.commons.math.optimization.univariate.BrentOptimizer.localMin(BrentOptimizer.java:119) */
        Class brentOptimizerClazz = Class.forName("org.apache.commons.math.optimization.univariate.BrentOptimizer");
        Class booleanType = boolean.class;
        Class polynomialSplineFunctionType = Class.forName("org.apache.commons.math.analysis.UnivariateRealFunction");
        Class goalTypeType = Class.forName("org.apache.commons.math.optimization.GoalType");
        Class doubleType = double.class;
        Method localMinMethod = brentOptimizerClazz.getDeclaredMethod("localMin", booleanType, polynomialSplineFunctionType, goalTypeType, doubleType, doubleType, doubleType, doubleType, doubleType);
        localMinMethod.setAccessible(true);
        java.lang.Object[] localMinMethodArguments = new java.lang.Object[8];
        localMinMethodArguments[0] = false;
        localMinMethodArguments[1] = polynomialSplineFunction;
        localMinMethodArguments[2] = ((Object) null);
        localMinMethodArguments[3] = 0.0;
        localMinMethodArguments[4] = 2.83227555819057E-309;
        localMinMethodArguments[5] = 0.0;
        localMinMethodArguments[6] = 2.225073858523391E-308;
        localMinMethodArguments[7] = 2.225073858507202E-308;
        try {
            localMinMethod.invoke(brentOptimizer, localMinMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link BrentOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.univariate.BrentOptimizer#localMin(boolean,org.apache.commons.math.analysis.UnivariateRealFunction,org.apache.commons.math.optimization.GoalType,double,double,double,double,double)}
 * @utbot.executesCondition {@code (lo < hi): False}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: double fx = computeObjectiveValue(f, x);
 *  */
    @Test
    public void testLocalMin_ThrowArrayIndexOutOfBoundsException_3() throws Throwable  {
        BrentOptimizer brentOptimizer = ((BrentOptimizer) createInstance("org.apache.commons.math.optimization.univariate.BrentOptimizer"));
        brentOptimizer.setMaxEvaluations(Integer.MIN_VALUE);
        setField(brentOptimizer, "org.apache.commons.math.optimization.univariate.AbstractUnivariateRealOptimizer", "evaluations", Integer.MAX_VALUE);
        PolynomialSplineFunction polynomialSplineFunction = ((PolynomialSplineFunction) createInstance("org.apache.commons.math.analysis.polynomials.PolynomialSplineFunction"));
        double[] knots = {-16.000000000000004, 4.000000000000001, 2.000000000000001};
        setField(polynomialSplineFunction, "org.apache.commons.math.analysis.polynomials.PolynomialSplineFunction", "knots", knots);
        org.apache.commons.math.analysis.polynomials.PolynomialFunction[] polynomials = {};
        setField(polynomialSplineFunction, "org.apache.commons.math.analysis.polynomials.PolynomialSplineFunction", "polynomials", polynomials);
        setField(polynomialSplineFunction, "org.apache.commons.math.analysis.polynomials.PolynomialSplineFunction", "n", 2);
        
        /* This test fails because method [org.apache.commons.math.optimization.univariate.BrentOptimizer.localMin] produces [java.lang.ArrayIndexOutOfBoundsException: Index -1 out of bounds for length 0]
            org.apache.commons.math.analysis.polynomials.PolynomialSplineFunction.value(PolynomialSplineFunction.java:150)
            org.apache.commons.math.optimization.univariate.AbstractUnivariateRealOptimizer.computeObjectiveValue(AbstractUnivariateRealOptimizer.java:197)
            org.apache.commons.math.optimization.univariate.BrentOptimizer.localMin(BrentOptimizer.java:119) */
        Class brentOptimizerClazz = Class.forName("org.apache.commons.math.optimization.univariate.BrentOptimizer");
        Class booleanType = boolean.class;
        Class polynomialSplineFunctionType = Class.forName("org.apache.commons.math.analysis.UnivariateRealFunction");
        Class goalTypeType = Class.forName("org.apache.commons.math.optimization.GoalType");
        Class doubleType = double.class;
        Method localMinMethod = brentOptimizerClazz.getDeclaredMethod("localMin", booleanType, polynomialSplineFunctionType, goalTypeType, doubleType, doubleType, doubleType, doubleType, doubleType);
        localMinMethod.setAccessible(true);
        java.lang.Object[] localMinMethodArguments = new java.lang.Object[8];
        localMinMethodArguments[0] = false;
        localMinMethodArguments[1] = polynomialSplineFunction;
        localMinMethodArguments[2] = ((Object) null);
        localMinMethodArguments[3] = 3.0696840960281E-310;
        localMinMethodArguments[4] = 2.000000000000001;
        localMinMethodArguments[5] = 3.0696840960281E-310;
        localMinMethodArguments[6] = 1.7800590872202134E-307;
        localMinMethodArguments[7] = 2.0000000000000004;
        try {
            localMinMethod.invoke(brentOptimizer, localMinMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: CHECKED EXCEPTIONS for method localMin(boolean, org.apache.commons.math.analysis.UnivariateRealFunction, org.apache.commons.math.optimization.GoalType, double, double, double, double, double)
    
    @Test(expected = MaxIterationsExceededException.class)
    public void testLocalMin1() throws Throwable  {
        BrentOptimizer brentOptimizer = ((BrentOptimizer) createInstance("org.apache.commons.math.optimization.univariate.BrentOptimizer"));
        setField(brentOptimizer, "org.apache.commons.math.optimization.univariate.AbstractUnivariateRealOptimizer", "evaluations", -2);
        brentOptimizer.setMaximalIterationCount(1);
        PolynomialFunction polynomialFunction = ((PolynomialFunction) createInstance("org.apache.commons.math.analysis.polynomials.PolynomialFunction"));
        double[] coefficients = {0.0, 0.0};
        setField(polynomialFunction, "org.apache.commons.math.analysis.polynomials.PolynomialFunction", "coefficients", coefficients);
        GoalType goalType = GoalType.MINIMIZE;
        
        Class brentOptimizerClazz = Class.forName("org.apache.commons.math.optimization.univariate.BrentOptimizer");
        Class booleanType = boolean.class;
        Class polynomialFunctionType = Class.forName("org.apache.commons.math.analysis.UnivariateRealFunction");
        Class goalTypeType = Class.forName("org.apache.commons.math.optimization.GoalType");
        Class doubleType = double.class;
        Method localMinMethod = brentOptimizerClazz.getDeclaredMethod("localMin", booleanType, polynomialFunctionType, goalTypeType, doubleType, doubleType, doubleType, doubleType, doubleType);
        localMinMethod.setAccessible(true);
        java.lang.Object[] localMinMethodArguments = new java.lang.Object[8];
        localMinMethodArguments[0] = false;
        localMinMethodArguments[1] = polynomialFunction;
        localMinMethodArguments[2] = goalType;
        localMinMethodArguments[3] = -152.16821298003197;
        localMinMethodArguments[4] = 2.225073858507202E-308;
        localMinMethodArguments[5] = 1.495724200087323E-304;
        localMinMethodArguments[6] = 2.2250738585395805E-308;
        localMinMethodArguments[7] = 2.225074389006149E-308;
        try {
            localMinMethod.invoke(brentOptimizer, localMinMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = MaxIterationsExceededException.class)
    public void testLocalMin2() throws Throwable  {
        BrentOptimizer brentOptimizer = ((BrentOptimizer) createInstance("org.apache.commons.math.optimization.univariate.BrentOptimizer"));
        setField(brentOptimizer, "org.apache.commons.math.optimization.univariate.AbstractUnivariateRealOptimizer", "evaluations", -538968098);
        PolynomialSplineFunction polynomialSplineFunction = ((PolynomialSplineFunction) createInstance("org.apache.commons.math.analysis.polynomials.PolynomialSplineFunction"));
        double[] knots = {-1.780059086805762E-307, -4.450147717014404E-308, java.lang.Double.NaN};
        setField(polynomialSplineFunction, "org.apache.commons.math.analysis.polynomials.PolynomialSplineFunction", "knots", knots);
        org.apache.commons.math.analysis.polynomials.PolynomialFunction[] polynomials = new org.apache.commons.math.analysis.polynomials.PolynomialFunction[1];
        PolynomialFunction polynomialFunction = ((PolynomialFunction) createInstance("org.apache.commons.math.analysis.polynomials.PolynomialFunction"));
        double[] coefficients = {0.0};
        setField(polynomialFunction, "org.apache.commons.math.analysis.polynomials.PolynomialFunction", "coefficients", coefficients);
        polynomials[0] = polynomialFunction;
        setField(polynomialSplineFunction, "org.apache.commons.math.analysis.polynomials.PolynomialSplineFunction", "polynomials", polynomials);
        setField(polynomialSplineFunction, "org.apache.commons.math.analysis.polynomials.PolynomialSplineFunction", "n", 2);
        GoalType goalType = GoalType.MINIMIZE;
        
        Class brentOptimizerClazz = Class.forName("org.apache.commons.math.optimization.univariate.BrentOptimizer");
        Class booleanType = boolean.class;
        Class polynomialSplineFunctionType = Class.forName("org.apache.commons.math.analysis.UnivariateRealFunction");
        Class goalTypeType = Class.forName("org.apache.commons.math.optimization.GoalType");
        Class doubleType = double.class;
        Method localMinMethod = brentOptimizerClazz.getDeclaredMethod("localMin", booleanType, polynomialSplineFunctionType, goalTypeType, doubleType, doubleType, doubleType, doubleType, doubleType);
        localMinMethod.setAccessible(true);
        java.lang.Object[] localMinMethodArguments = new java.lang.Object[8];
        localMinMethodArguments[0] = false;
        localMinMethodArguments[1] = polynomialSplineFunction;
        localMinMethodArguments[2] = goalType;
        localMinMethodArguments[3] = 5.755920543817201E-116;
        localMinMethodArguments[4] = -4.450147717014404E-308;
        localMinMethodArguments[5] = 2.6278034639862107E-231;
        localMinMethodArguments[6] = 1.7800591133307085E-307;
        localMinMethodArguments[7] = 2.225073858507328E-308;
        try {
            localMinMethod.invoke(brentOptimizer, localMinMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = MaxIterationsExceededException.class)
    public void testLocalMin3() throws Throwable  {
        BrentOptimizer brentOptimizer = ((BrentOptimizer) createInstance("org.apache.commons.math.optimization.univariate.BrentOptimizer"));
        setField(brentOptimizer, "org.apache.commons.math.optimization.univariate.AbstractUnivariateRealOptimizer", "evaluations", -2);
        brentOptimizer.setMaximalIterationCount(1);
        PolynomialSplineFunction polynomialSplineFunction = ((PolynomialSplineFunction) createInstance("org.apache.commons.math.analysis.polynomials.PolynomialSplineFunction"));
        double[] knots = {-4.000000000000001, 4.000000000000001, java.lang.Double.NaN};
        setField(polynomialSplineFunction, "org.apache.commons.math.analysis.polynomials.PolynomialSplineFunction", "knots", knots);
        org.apache.commons.math.analysis.polynomials.PolynomialFunction[] polynomials = new org.apache.commons.math.analysis.polynomials.PolynomialFunction[9];
        PolynomialFunction polynomialFunction = ((PolynomialFunction) createInstance("org.apache.commons.math.analysis.polynomials.PolynomialFunction"));
        double[] coefficients = {0.0};
        setField(polynomialFunction, "org.apache.commons.math.analysis.polynomials.PolynomialFunction", "coefficients", coefficients);
        polynomials[0] = polynomialFunction;
        setField(polynomialSplineFunction, "org.apache.commons.math.analysis.polynomials.PolynomialSplineFunction", "polynomials", polynomials);
        setField(polynomialSplineFunction, "org.apache.commons.math.analysis.polynomials.PolynomialSplineFunction", "n", 2);
        GoalType goalType = GoalType.MAXIMIZE;
        
        Class brentOptimizerClazz = Class.forName("org.apache.commons.math.optimization.univariate.BrentOptimizer");
        Class booleanType = boolean.class;
        Class polynomialSplineFunctionType = Class.forName("org.apache.commons.math.analysis.UnivariateRealFunction");
        Class goalTypeType = Class.forName("org.apache.commons.math.optimization.GoalType");
        Class doubleType = double.class;
        Method localMinMethod = brentOptimizerClazz.getDeclaredMethod("localMin", booleanType, polynomialSplineFunctionType, goalTypeType, doubleType, doubleType, doubleType, doubleType, doubleType);
        localMinMethod.setAccessible(true);
        java.lang.Object[] localMinMethodArguments = new java.lang.Object[8];
        localMinMethodArguments[0] = false;
        localMinMethodArguments[1] = polynomialSplineFunction;
        localMinMethodArguments[2] = goalType;
        localMinMethodArguments[3] = 8.18925825800156E-152;
        localMinMethodArguments[4] = 2.0;
        localMinMethodArguments[5] = -2.198042159676306E-230;
        localMinMethodArguments[6] = 4.728281949327803E-308;
        localMinMethodArguments[7] = 1.2882297635174863E-231;
        try {
            localMinMethod.invoke(brentOptimizer, localMinMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = MaxIterationsExceededException.class)
    public void testLocalMin4() throws Throwable  {
        BrentOptimizer brentOptimizer = ((BrentOptimizer) createInstance("org.apache.commons.math.optimization.univariate.BrentOptimizer"));
        setField(brentOptimizer, "org.apache.commons.math.optimization.univariate.AbstractUnivariateRealOptimizer", "evaluations", -2);
        brentOptimizer.setMaximalIterationCount(1);
        PolynomialSplineFunction polynomialSplineFunction = ((PolynomialSplineFunction) createInstance("org.apache.commons.math.analysis.polynomials.PolynomialSplineFunction"));
        double[] knots = {-3.689348814741911E19, 2.68156158598852E154, java.lang.Double.NaN};
        setField(polynomialSplineFunction, "org.apache.commons.math.analysis.polynomials.PolynomialSplineFunction", "knots", knots);
        org.apache.commons.math.analysis.polynomials.PolynomialFunction[] polynomials = new org.apache.commons.math.analysis.polynomials.PolynomialFunction[9];
        PolynomialFunction polynomialFunction = ((PolynomialFunction) createInstance("org.apache.commons.math.analysis.polynomials.PolynomialFunction"));
        double[] coefficients = {0.0};
        setField(polynomialFunction, "org.apache.commons.math.analysis.polynomials.PolynomialFunction", "coefficients", coefficients);
        polynomials[0] = polynomialFunction;
        setField(polynomialSplineFunction, "org.apache.commons.math.analysis.polynomials.PolynomialSplineFunction", "polynomials", polynomials);
        setField(polynomialSplineFunction, "org.apache.commons.math.analysis.polynomials.PolynomialSplineFunction", "n", 2);
        GoalType goalType = GoalType.MAXIMIZE;
        
        Class brentOptimizerClazz = Class.forName("org.apache.commons.math.optimization.univariate.BrentOptimizer");
        Class booleanType = boolean.class;
        Class polynomialSplineFunctionType = Class.forName("org.apache.commons.math.analysis.UnivariateRealFunction");
        Class goalTypeType = Class.forName("org.apache.commons.math.optimization.GoalType");
        Class doubleType = double.class;
        Method localMinMethod = brentOptimizerClazz.getDeclaredMethod("localMin", booleanType, polynomialSplineFunctionType, goalTypeType, doubleType, doubleType, doubleType, doubleType, doubleType);
        localMinMethod.setAccessible(true);
        java.lang.Object[] localMinMethodArguments = new java.lang.Object[8];
        localMinMethodArguments[0] = false;
        localMinMethodArguments[1] = polynomialSplineFunction;
        localMinMethodArguments[2] = goalType;
        localMinMethodArguments[3] = 3.4443556640295196E-308;
        localMinMethodArguments[4] = -2.983336292482796E-154;
        localMinMethodArguments[5] = -1.4699834067490666E-308;
        localMinMethodArguments[6] = 1.4916681462400417E-154;
        localMinMethodArguments[7] = 1.358077306218E-312;
        try {
            localMinMethod.invoke(brentOptimizer, localMinMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = MaxIterationsExceededException.class)
    public void testLocalMin5() throws Throwable  {
        BrentOptimizer brentOptimizer = ((BrentOptimizer) createInstance("org.apache.commons.math.optimization.univariate.BrentOptimizer"));
        setField(brentOptimizer, "org.apache.commons.math.optimization.univariate.AbstractUnivariateRealOptimizer", "evaluations", -2);
        PolynomialSplineFunction polynomialSplineFunction = ((PolynomialSplineFunction) createInstance("org.apache.commons.math.analysis.polynomials.PolynomialSplineFunction"));
        double[] knots = {-3.0};
        setField(polynomialSplineFunction, "org.apache.commons.math.analysis.polynomials.PolynomialSplineFunction", "knots", knots);
        org.apache.commons.math.analysis.polynomials.PolynomialFunction[] polynomials = new org.apache.commons.math.analysis.polynomials.PolynomialFunction[9];
        PolynomialFunction polynomialFunction = ((PolynomialFunction) createInstance("org.apache.commons.math.analysis.polynomials.PolynomialFunction"));
        double[] coefficients = {
            0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0
        };
        setField(polynomialFunction, "org.apache.commons.math.analysis.polynomials.PolynomialFunction", "coefficients", coefficients);
        polynomials[0] = polynomialFunction;
        setField(polynomialSplineFunction, "org.apache.commons.math.analysis.polynomials.PolynomialSplineFunction", "polynomials", polynomials);
        
        Class brentOptimizerClazz = Class.forName("org.apache.commons.math.optimization.univariate.BrentOptimizer");
        Class booleanType = boolean.class;
        Class polynomialSplineFunctionType = Class.forName("org.apache.commons.math.analysis.UnivariateRealFunction");
        Class goalTypeType = Class.forName("org.apache.commons.math.optimization.GoalType");
        Class doubleType = double.class;
        Method localMinMethod = brentOptimizerClazz.getDeclaredMethod("localMin", booleanType, polynomialSplineFunctionType, goalTypeType, doubleType, doubleType, doubleType, doubleType, doubleType);
        localMinMethod.setAccessible(true);
        java.lang.Object[] localMinMethodArguments = new java.lang.Object[8];
        localMinMethodArguments[0] = false;
        localMinMethodArguments[1] = polynomialSplineFunction;
        localMinMethodArguments[2] = ((Object) null);
        localMinMethodArguments[3] = 5.797418744574605E-270;
        localMinMethodArguments[4] = java.lang.Double.NaN;
        localMinMethodArguments[5] = -1.1361026908392824E-269;
        localMinMethodArguments[6] = 2.8481054035076675E-306;
        localMinMethodArguments[7] = 2.22507392481957E-308;
        try {
            localMinMethod.invoke(brentOptimizer, localMinMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method localMin(boolean, org.apache.commons.math.analysis.UnivariateRealFunction, org.apache.commons.math.optimization.GoalType, double, double, double, double, double)
    
    @Test
    public void testLocalMin6() throws Throwable  {
        BrentOptimizer brentOptimizer = ((BrentOptimizer) createInstance("org.apache.commons.math.optimization.univariate.BrentOptimizer"));
        setField(brentOptimizer, "org.apache.commons.math.optimization.univariate.AbstractUnivariateRealOptimizer", "evaluations", -2);
        PolynomialSplineFunction polynomialSplineFunction = ((PolynomialSplineFunction) createInstance("org.apache.commons.math.analysis.polynomials.PolynomialSplineFunction"));
        double[] knots = {-3.0};
        setField(polynomialSplineFunction, "org.apache.commons.math.analysis.polynomials.PolynomialSplineFunction", "knots", knots);
        org.apache.commons.math.analysis.polynomials.PolynomialFunction[] polynomials = new org.apache.commons.math.analysis.polynomials.PolynomialFunction[9];
        PolynomialFunction polynomialFunction = ((PolynomialFunction) createInstance("org.apache.commons.math.analysis.polynomials.PolynomialFunction"));
        polynomials[0] = polynomialFunction;
        setField(polynomialSplineFunction, "org.apache.commons.math.analysis.polynomials.PolynomialSplineFunction", "polynomials", polynomials);
        GoalType goalType = GoalType.MAXIMIZE;
        
        /* This test fails because method [org.apache.commons.math.optimization.univariate.BrentOptimizer.localMin] produces [java.lang.NullPointerException]
            org.apache.commons.math.analysis.polynomials.PolynomialFunction.evaluate(PolynomialFunction.java:124)
            org.apache.commons.math.analysis.polynomials.PolynomialFunction.value(PolynomialFunction.java:88)
            org.apache.commons.math.analysis.polynomials.PolynomialSplineFunction.value(PolynomialSplineFunction.java:150)
            org.apache.commons.math.optimization.univariate.AbstractUnivariateRealOptimizer.computeObjectiveValue(AbstractUnivariateRealOptimizer.java:197)
            org.apache.commons.math.optimization.univariate.BrentOptimizer.localMin(BrentOptimizer.java:119) */
        Class brentOptimizerClazz = Class.forName("org.apache.commons.math.optimization.univariate.BrentOptimizer");
        Class booleanType = boolean.class;
        Class polynomialSplineFunctionType = Class.forName("org.apache.commons.math.analysis.UnivariateRealFunction");
        Class goalTypeType = Class.forName("org.apache.commons.math.optimization.GoalType");
        Class doubleType = double.class;
        Method localMinMethod = brentOptimizerClazz.getDeclaredMethod("localMin", booleanType, polynomialSplineFunctionType, goalTypeType, doubleType, doubleType, doubleType, doubleType, doubleType);
        localMinMethod.setAccessible(true);
        java.lang.Object[] localMinMethodArguments = new java.lang.Object[8];
        localMinMethodArguments[0] = false;
        localMinMethodArguments[1] = polynomialSplineFunction;
        localMinMethodArguments[2] = goalType;
        localMinMethodArguments[3] = 5.803165448066814E173;
        localMinMethodArguments[4] = java.lang.Double.NaN;
        localMinMethodArguments[5] = 1.0988325864893322E-115;
        localMinMethodArguments[6] = 2.225073859025267E-308;
        localMinMethodArguments[7] = 5.180654E-318;
        try {
            localMinMethod.invoke(brentOptimizer, localMinMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testLocalMin7() throws Throwable  {
        BrentOptimizer brentOptimizer = ((BrentOptimizer) createInstance("org.apache.commons.math.optimization.univariate.BrentOptimizer"));
        setField(brentOptimizer, "org.apache.commons.math.optimization.univariate.AbstractUnivariateRealOptimizer", "evaluations", -1551905124);
        PolynomialSplineFunction polynomialSplineFunction = ((PolynomialSplineFunction) createInstance("org.apache.commons.math.analysis.polynomials.PolynomialSplineFunction"));
        double[] knots = {java.lang.Double.NaN};
        setField(polynomialSplineFunction, "org.apache.commons.math.analysis.polynomials.PolynomialSplineFunction", "knots", knots);
        
        /* This test fails because method [org.apache.commons.math.optimization.univariate.BrentOptimizer.localMin] produces [java.lang.NullPointerException]
            org.apache.commons.math.analysis.polynomials.PolynomialSplineFunction.value(PolynomialSplineFunction.java:147)
            org.apache.commons.math.optimization.univariate.AbstractUnivariateRealOptimizer.computeObjectiveValue(AbstractUnivariateRealOptimizer.java:197)
            org.apache.commons.math.optimization.univariate.BrentOptimizer.localMin(BrentOptimizer.java:119) */
        Class brentOptimizerClazz = Class.forName("org.apache.commons.math.optimization.univariate.BrentOptimizer");
        Class booleanType = boolean.class;
        Class polynomialSplineFunctionType = Class.forName("org.apache.commons.math.analysis.UnivariateRealFunction");
        Class goalTypeType = Class.forName("org.apache.commons.math.optimization.GoalType");
        Class doubleType = double.class;
        Method localMinMethod = brentOptimizerClazz.getDeclaredMethod("localMin", booleanType, polynomialSplineFunctionType, goalTypeType, doubleType, doubleType, doubleType, doubleType, doubleType);
        localMinMethod.setAccessible(true);
        java.lang.Object[] localMinMethodArguments = new java.lang.Object[8];
        localMinMethodArguments[0] = false;
        localMinMethodArguments[1] = polynomialSplineFunction;
        localMinMethodArguments[2] = ((Object) null);
        localMinMethodArguments[3] = 0.0;
        localMinMethodArguments[4] = 7.197787198367099E-211;
        localMinMethodArguments[5] = -0.0;
        localMinMethodArguments[6] = 2.225074919505097E-308;
        localMinMethodArguments[7] = java.lang.Double.NaN;
        try {
            localMinMethod.invoke(brentOptimizer, localMinMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testLocalMin8() throws Throwable  {
        BrentOptimizer brentOptimizer = ((BrentOptimizer) createInstance("org.apache.commons.math.optimization.univariate.BrentOptimizer"));
        setField(brentOptimizer, "org.apache.commons.math.optimization.univariate.AbstractUnivariateRealOptimizer", "evaluations", -2);
        PolynomialSplineFunction polynomialSplineFunction = ((PolynomialSplineFunction) createInstance("org.apache.commons.math.analysis.polynomials.PolynomialSplineFunction"));
        double[] knots = {-2.6700886302086417E-307};
        setField(polynomialSplineFunction, "org.apache.commons.math.analysis.polynomials.PolynomialSplineFunction", "knots", knots);
        org.apache.commons.math.analysis.polynomials.PolynomialFunction[] polynomials = {null, null, null, null, null, null, null, null, null};
        setField(polynomialSplineFunction, "org.apache.commons.math.analysis.polynomials.PolynomialSplineFunction", "polynomials", polynomials);
        GoalType goalType = GoalType.MINIMIZE;
        
        /* This test fails because method [org.apache.commons.math.optimization.univariate.BrentOptimizer.localMin] produces [java.lang.NullPointerException]
            org.apache.commons.math.analysis.polynomials.PolynomialSplineFunction.value(PolynomialSplineFunction.java:150)
            org.apache.commons.math.optimization.univariate.AbstractUnivariateRealOptimizer.computeObjectiveValue(AbstractUnivariateRealOptimizer.java:197)
            org.apache.commons.math.optimization.univariate.BrentOptimizer.localMin(BrentOptimizer.java:119) */
        Class brentOptimizerClazz = Class.forName("org.apache.commons.math.optimization.univariate.BrentOptimizer");
        Class booleanType = boolean.class;
        Class polynomialSplineFunctionType = Class.forName("org.apache.commons.math.analysis.UnivariateRealFunction");
        Class goalTypeType = Class.forName("org.apache.commons.math.optimization.GoalType");
        Class doubleType = double.class;
        Method localMinMethod = brentOptimizerClazz.getDeclaredMethod("localMin", booleanType, polynomialSplineFunctionType, goalTypeType, doubleType, doubleType, doubleType, doubleType, doubleType);
        localMinMethod.setAccessible(true);
        java.lang.Object[] localMinMethodArguments = new java.lang.Object[8];
        localMinMethodArguments[0] = false;
        localMinMethodArguments[1] = polynomialSplineFunction;
        localMinMethodArguments[2] = goalType;
        localMinMethodArguments[3] = 3.47667790391755E-310;
        localMinMethodArguments[4] = -2.6700886302086417E-307;
        localMinMethodArguments[5] = -2.259976445276998E-308;
        localMinMethodArguments[6] = 4.45014771701845E-308;
        localMinMethodArguments[7] = 2.0000038146972656;
        try {
            localMinMethod.invoke(brentOptimizer, localMinMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Util methods
    
    private static Object getStaticFieldValue(Class<?> clazz, String fieldName) throws IllegalAccessException, NoSuchFieldException {
        java.lang.reflect.Field field;
        Class<?> originClass = clazz;
        do {
            try {
                field = clazz.getDeclaredField(fieldName);
                field.setAccessible(true);
                
                java.lang.reflect.Field modifiersField;
                
            java.lang.reflect.Method methodForGetDeclaredFields737748401227300 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields737748401227300.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass737748401235000 = (java.lang.reflect.Field[]) methodForGetDeclaredFields737748401227300.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass737748401235000).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields737748403656000 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields737748403656000.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass737748403659800 = (java.lang.reflect.Field[]) methodForGetDeclaredFields737748403656000.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass737748403659800).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
    
    private static Object createInstance(String className) throws Exception {
        Class<?> clazz = Class.forName(className);
        return Class.forName("sun.misc.Unsafe").getDeclaredMethod("allocateInstance", Class.class)
            .invoke(getUnsafeInstance(), clazz);
    }
    
        private static void setField(Object object, String fieldClassName, String fieldName, Object fieldValue) throws ClassNotFoundException, NoSuchFieldException, NoSuchMethodException, IllegalAccessException, java.lang.reflect.InvocationTargetException {
        Class<?> clazz = Class.forName(fieldClassName);
        java.lang.reflect.Field field = clazz.getDeclaredField(fieldName);
    
        java.lang.reflect.Field modifiersField;
        
                java.lang.reflect.Method methodForGetDeclaredFields737748404113400 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields737748404113400.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass737748404116100 = (java.lang.reflect.Field[]) methodForGetDeclaredFields737748404113400.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass737748404116100).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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

