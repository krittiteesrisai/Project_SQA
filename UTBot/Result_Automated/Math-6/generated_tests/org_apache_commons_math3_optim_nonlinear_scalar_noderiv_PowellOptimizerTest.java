package org.apache.commons.math3.optim.nonlinear.scalar.noderiv;

import org.junit.Test;
import java.lang.reflect.Method;
import org.apache.commons.math3.exception.MathUnsupportedOperationException;
import org.apache.commons.math3.optim.nonlinear.scalar.LeastSquaresConverter;
import org.apache.commons.math3.analysis.differentiation.GradientFunction;
import org.apache.commons.math3.analysis.differentiation.MultivariateDifferentiableFunction;
import org.apache.commons.math3.util.Incrementor;
import org.apache.commons.math3.optim.linear.LinearObjectiveFunction;
import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.linear.ArrayRealVector;
import org.apache.commons.math3.optim.univariate.SimpleUnivariateValueChecker;
import org.apache.commons.math3.exception.TooManyIterationsException;
import org.apache.commons.math3.exception.TooManyEvaluationsException;
import org.apache.commons.math3.optim.nonlinear.scalar.GoalType;
import org.apache.commons.math3.exception.DimensionMismatchException;
import org.apache.commons.math3.optim.univariate.BracketFinder;
import org.apache.commons.math3.analysis.interpolation.MicrosphereInterpolatingFunction;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import org.apache.commons.math3.linear.OpenMapRealVector;
import org.apache.commons.math3.util.OpenIntToDoubleHashMap;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertArrayEquals;

public final class org_apache_commons_math3_optim_nonlinear_scalar_noderiv_PowellOptimizerTest {
    ///region Test suites for executable org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer.checkParameters
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method checkParameters()
    
    /**
    @utbot.classUnderTest {@link PowellOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer#checkParameters()}
 * @utbot.executesCondition {@code (getLowerBound() != null): False}
 * @utbot.executesCondition {@code (getUpperBound() != null): False}
 * @utbot.invokes {@link org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer#getLowerBound()}
 * @utbot.invokes {@link org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer#getUpperBound()}
 *  */
    @Test
    public void testCheckParameters_GetUpperBoundEqualsNull() throws Exception  {
        PowellOptimizer powellOptimizer = ((PowellOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer"));
        
        Class powellOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer");
        Method checkParametersMethod = powellOptimizerClazz.getDeclaredMethod("checkParameters");
        checkParametersMethod.setAccessible(true);
        java.lang.Object[] checkParametersMethodArguments = new java.lang.Object[0];
        checkParametersMethod.invoke(powellOptimizer, checkParametersMethodArguments);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method checkParameters()
    
    /**
    @utbot.classUnderTest {@link PowellOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer#checkParameters()}
 * @utbot.executesCondition {@code (getLowerBound() != null): True}
 * @utbot.throwsException {@link org.apache.commons.math3.exception.MathUnsupportedOperationException} when: getLowerBound() != null || getUpperBound() != null
 *  */
    @Test(expected = MathUnsupportedOperationException.class)
    public void testCheckParameters_ThrowMathUnsupportedOperationException() throws Throwable  {
        PowellOptimizer powellOptimizer = ((PowellOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer"));
        double[] lowerBound = {};
        setField(powellOptimizer, "org.apache.commons.math3.optim.BaseMultivariateOptimizer", "lowerBound", lowerBound);
        
        Class powellOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer");
        Method checkParametersMethod = powellOptimizerClazz.getDeclaredMethod("checkParameters");
        checkParametersMethod.setAccessible(true);
        java.lang.Object[] checkParametersMethodArguments = new java.lang.Object[0];
        try {
            checkParametersMethod.invoke(powellOptimizer, checkParametersMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link PowellOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer#checkParameters()}
 * @utbot.executesCondition {@code (getLowerBound() != null): False}
 * @utbot.executesCondition {@code (getUpperBound() != null): True}
 * @utbot.invokes {@link org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer#getUpperBound()}
 * @utbot.throwsException {@link org.apache.commons.math3.exception.MathUnsupportedOperationException} when: getLowerBound() != null || getUpperBound() != null
 *  */
    @Test(expected = MathUnsupportedOperationException.class)
    public void testCheckParameters_ThrowMathUnsupportedOperationException_1() throws Throwable  {
        PowellOptimizer powellOptimizer = ((PowellOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer"));
        double[] upperBound = {2.590327E-318, 2.0E-323};
        setField(powellOptimizer, "org.apache.commons.math3.optim.BaseMultivariateOptimizer", "upperBound", upperBound);
        
        Class powellOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer");
        Method checkParametersMethod = powellOptimizerClazz.getDeclaredMethod("checkParameters");
        checkParametersMethod.setAccessible(true);
        java.lang.Object[] checkParametersMethodArguments = new java.lang.Object[0];
        try {
            checkParametersMethod.invoke(powellOptimizer, checkParametersMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer.doOptimize
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method doOptimize()
    
    /**
    @utbot.classUnderTest {@link PowellOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer#doOptimize()}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: double fVal = computeObjectiveValue(x);
 *  */
    @Test
    public void testDoOptimize_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        PowellOptimizer powellOptimizer = ((PowellOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer"));
        LeastSquaresConverter function = ((LeastSquaresConverter) createInstance("org.apache.commons.math3.optim.nonlinear.scalar.LeastSquaresConverter"));
        GradientFunction function1 = ((GradientFunction) createInstance("org.apache.commons.math3.analysis.differentiation.GradientFunction"));
        MultivariateDifferentiableFunction f = ((MultivariateDifferentiableFunction) createInstance("org.apache.commons.math3.analysis.FunctionUtils$17"));
        setField(function1, "org.apache.commons.math3.analysis.differentiation.GradientFunction", "f", f);
        setField(function, "org.apache.commons.math3.optim.nonlinear.scalar.LeastSquaresConverter", "function", function1);
        setField(powellOptimizer, "org.apache.commons.math3.optim.nonlinear.scalar.MultivariateOptimizer", "function", function);
        double[] start = {};
        setField(powellOptimizer, "org.apache.commons.math3.optim.BaseMultivariateOptimizer", "start", start);
        Incrementor evaluations = ((Incrementor) createInstance("org.apache.commons.math3.util.Incrementor"));
        evaluations.setMaximalCount(Integer.MIN_VALUE);
        setField(evaluations, "org.apache.commons.math3.util.Incrementor", "count", Integer.MAX_VALUE);
        setField(powellOptimizer, "org.apache.commons.math3.optim.BaseOptimizer", "evaluations", evaluations);
        
        /* This test fails because method [org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer.doOptimize] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math3.analysis.FunctionUtils$17.value(FunctionUtils.java:622)
            org.apache.commons.math3.analysis.differentiation.GradientFunction.value(GradientFunction.java:51)
            org.apache.commons.math3.optim.nonlinear.scalar.LeastSquaresConverter.value(LeastSquaresConverter.java:160)
            org.apache.commons.math3.optim.nonlinear.scalar.MultivariateOptimizer.computeObjectiveValue(MultivariateOptimizer.java:116)
            org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer.doOptimize(PowellOptimizer.java:189) */
        powellOptimizer.doOptimize();
    }
    
    /**
    @utbot.classUnderTest {@link PowellOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer#doOptimize()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: final int n = guess.length;
 *  */
    @Test
    public void testDoOptimize_ThrowNullPointerException() throws Exception  {
        PowellOptimizer powellOptimizer = ((PowellOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer"));
        
        /* This test fails because method [org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer.doOptimize] produces [java.lang.NullPointerException]
            org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer.doOptimize(PowellOptimizer.java:178) */
        powellOptimizer.doOptimize();
    }
    
    /**
    @utbot.classUnderTest {@link PowellOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer#doOptimize()}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.invokes {@link java.lang.Object#clone()}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < n; i++)} once
 * @utbot.iterates iterate the loop {@code } once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: final UnivariatePointValuePair optimum = line.search(x, d);
 *  */
    @Test
    public void testDoOptimize_ThrowNullPointerException_1() throws Exception  {
        PowellOptimizer powellOptimizer = ((PowellOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer"));
        LinearObjectiveFunction function = ((LinearObjectiveFunction) createInstance("org.apache.commons.math3.optim.linear.LinearObjectiveFunction"));
        RealVector coefficients = ((RealVector) createInstance("org.apache.commons.math3.linear.RealVector$2"));
        ArrayRealVector val$v = ((ArrayRealVector) createInstance("org.apache.commons.math3.linear.ArrayRealVector"));
        double[] data = {5.304989477E-315};
        setField(val$v, "org.apache.commons.math3.linear.ArrayRealVector", "data", data);
        setField(coefficients, "org.apache.commons.math3.linear.RealVector$2", "val$v", val$v);
        setField(function, "org.apache.commons.math3.optim.linear.LinearObjectiveFunction", "coefficients", coefficients);
        setField(function, "org.apache.commons.math3.optim.linear.LinearObjectiveFunction", "constantTerm", 0.0);
        setField(powellOptimizer, "org.apache.commons.math3.optim.nonlinear.scalar.MultivariateOptimizer", "function", function);
        setField(powellOptimizer, "org.apache.commons.math3.optim.BaseMultivariateOptimizer", "start", data);
        Incrementor evaluations = ((Incrementor) createInstance("org.apache.commons.math3.util.Incrementor"));
        evaluations.setMaximalCount(Integer.MIN_VALUE);
        setField(evaluations, "org.apache.commons.math3.util.Incrementor", "count", Integer.MAX_VALUE);
        setField(powellOptimizer, "org.apache.commons.math3.optim.BaseOptimizer", "evaluations", evaluations);
        
        /* This test fails because method [org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer.doOptimize] produces [java.lang.NullPointerException]
            org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer.doOptimize(PowellOptimizer.java:206) */
        powellOptimizer.doOptimize();
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method doOptimize()
    
    /**
    @utbot.classUnderTest {@link PowellOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer#doOptimize()}
 * @utbot.throwsException {@link org.apache.commons.math3.exception.MathUnsupportedOperationException} in: checkParameters();
 *  */
    @Test(expected = MathUnsupportedOperationException.class)
    public void testDoOptimize_ThrowMathUnsupportedOperationException() throws Exception  {
        PowellOptimizer powellOptimizer = ((PowellOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer"));
        double[] lowerBound = {};
        setField(powellOptimizer, "org.apache.commons.math3.optim.BaseMultivariateOptimizer", "lowerBound", lowerBound);
        
        powellOptimizer.doOptimize();
    }
    
    /**
    @utbot.classUnderTest {@link PowellOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer#doOptimize()}
 * @utbot.throwsException {@link org.apache.commons.math3.exception.MathUnsupportedOperationException} in: checkParameters();
 *  */
    @Test(expected = MathUnsupportedOperationException.class)
    public void testDoOptimize_ThrowMathUnsupportedOperationException_1() throws Exception  {
        PowellOptimizer powellOptimizer = ((PowellOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer"));
        double[] upperBound = {};
        setField(powellOptimizer, "org.apache.commons.math3.optim.BaseMultivariateOptimizer", "upperBound", upperBound);
        
        powellOptimizer.doOptimize();
    }
    
    /**
    @utbot.classUnderTest {@link PowellOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer#doOptimize()}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < n; i++)} once
 * @utbot.throwsException {@link org.apache.commons.math3.exception.TooManyIterationsException} in: double fVal = computeObjectiveValue(x);
 *  */
    @Test(expected = TooManyIterationsException.class)
    public void testDoOptimize_ThrowTooManyIterationsException() throws Exception  {
        PowellOptimizer powellOptimizer = ((PowellOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer"));
        double[] start = {6.47582E-319};
        setField(powellOptimizer, "org.apache.commons.math3.optim.BaseMultivariateOptimizer", "start", start);
        Incrementor evaluations = ((Incrementor) createInstance("org.apache.commons.math3.util.Incrementor"));
        Object maxCountCallback = createInstance("org.apache.commons.math3.optim.BaseOptimizer$MaxIterCallback");
        setField(evaluations, "org.apache.commons.math3.util.Incrementor", "maxCountCallback", maxCountCallback);
        setField(powellOptimizer, "org.apache.commons.math3.optim.BaseOptimizer", "evaluations", evaluations);
        SimpleUnivariateValueChecker checker = ((SimpleUnivariateValueChecker) createInstance("org.apache.commons.math3.optim.univariate.SimpleUnivariateValueChecker"));
        setField(powellOptimizer, "org.apache.commons.math3.optim.BaseOptimizer", "checker", checker);
        
        powellOptimizer.doOptimize();
    }
    
    /**
    @utbot.classUnderTest {@link PowellOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer#doOptimize()}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.throwsException {@link org.apache.commons.math3.exception.TooManyEvaluationsException} in: double fVal = computeObjectiveValue(x);
 *  */
    @Test(expected = TooManyEvaluationsException.class)
    public void testDoOptimize_ThrowTooManyEvaluationsException() throws Exception  {
        PowellOptimizer powellOptimizer = ((PowellOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer"));
        double[] start = {};
        setField(powellOptimizer, "org.apache.commons.math3.optim.BaseMultivariateOptimizer", "start", start);
        Incrementor evaluations = ((Incrementor) createInstance("org.apache.commons.math3.util.Incrementor"));
        Object maxCountCallback = createInstance("org.apache.commons.math3.optim.BaseOptimizer$MaxEvalCallback");
        setField(evaluations, "org.apache.commons.math3.util.Incrementor", "maxCountCallback", maxCountCallback);
        setField(powellOptimizer, "org.apache.commons.math3.optim.BaseOptimizer", "evaluations", evaluations);
        
        powellOptimizer.doOptimize();
    }
    
    /**
    @utbot.classUnderTest {@link PowellOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer#doOptimize()}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < n; i++)} once
 * @utbot.throwsException {@link org.apache.commons.math3.exception.DimensionMismatchException} in: double fVal = computeObjectiveValue(x);
 *  */
    @Test(expected = DimensionMismatchException.class)
    public void testDoOptimize_ThrowDimensionMismatchException() throws Exception  {
        PowellOptimizer powellOptimizer = ((PowellOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer"));
        LinearObjectiveFunction function = ((LinearObjectiveFunction) createInstance("org.apache.commons.math3.optim.linear.LinearObjectiveFunction"));
        ArrayRealVector coefficients = ((ArrayRealVector) createInstance("org.apache.commons.math3.linear.ArrayRealVector"));
        double[] data = {0.0, 0.0};
        setField(coefficients, "org.apache.commons.math3.linear.ArrayRealVector", "data", data);
        setField(function, "org.apache.commons.math3.optim.linear.LinearObjectiveFunction", "coefficients", coefficients);
        setField(powellOptimizer, "org.apache.commons.math3.optim.nonlinear.scalar.MultivariateOptimizer", "function", function);
        GoalType goal = GoalType.MAXIMIZE;
        setField(powellOptimizer, "org.apache.commons.math3.optim.nonlinear.scalar.MultivariateOptimizer", "goal", goal);
        double[] start = {3.31561842E-316};
        setField(powellOptimizer, "org.apache.commons.math3.optim.BaseMultivariateOptimizer", "start", start);
        Incrementor evaluations = ((Incrementor) createInstance("org.apache.commons.math3.util.Incrementor"));
        evaluations.setMaximalCount(Integer.MIN_VALUE);
        setField(evaluations, "org.apache.commons.math3.util.Incrementor", "count", Integer.MAX_VALUE);
        setField(powellOptimizer, "org.apache.commons.math3.optim.BaseOptimizer", "evaluations", evaluations);
        
        powellOptimizer.doOptimize();
    }
    
    /**
    @utbot.classUnderTest {@link PowellOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer#doOptimize()}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.throwsException {@link org.apache.commons.math3.exception.DimensionMismatchException} 
 *  */
    @Test(expected = DimensionMismatchException.class)
    public void testDoOptimize_ThrowDimensionMismatchException_1() throws Exception  {
        PowellOptimizer powellOptimizer = ((PowellOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer"));
        LinearObjectiveFunction function = ((LinearObjectiveFunction) createInstance("org.apache.commons.math3.optim.linear.LinearObjectiveFunction"));
        RealVector coefficients = ((RealVector) createInstance("org.apache.commons.math3.linear.RealVector$2"));
        RealVector val$v = ((RealVector) createInstance("org.apache.commons.math3.linear.RealVector$2"));
        ArrayRealVector val$v1 = ((ArrayRealVector) createInstance("org.apache.commons.math3.linear.ArrayRealVector"));
        double[] data = {0.0};
        setField(val$v1, "org.apache.commons.math3.linear.ArrayRealVector", "data", data);
        setField(val$v, "org.apache.commons.math3.linear.RealVector$2", "val$v", val$v1);
        setField(coefficients, "org.apache.commons.math3.linear.RealVector$2", "val$v", val$v);
        setField(function, "org.apache.commons.math3.optim.linear.LinearObjectiveFunction", "coefficients", coefficients);
        setField(powellOptimizer, "org.apache.commons.math3.optim.nonlinear.scalar.MultivariateOptimizer", "function", function);
        double[] start = {};
        setField(powellOptimizer, "org.apache.commons.math3.optim.BaseMultivariateOptimizer", "start", start);
        Incrementor evaluations = ((Incrementor) createInstance("org.apache.commons.math3.util.Incrementor"));
        evaluations.setMaximalCount(Integer.MIN_VALUE);
        setField(evaluations, "org.apache.commons.math3.util.Incrementor", "count", Integer.MAX_VALUE);
        setField(powellOptimizer, "org.apache.commons.math3.optim.BaseOptimizer", "evaluations", evaluations);
        
        powellOptimizer.doOptimize();
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method doOptimize()
    
    @Test
    public void testDoOptimize1() throws Exception  {
        PowellOptimizer powellOptimizer = ((PowellOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer"));
        Object line = createInstance("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer$LineSearch");
        BracketFinder bracket = ((BracketFinder) createInstance("org.apache.commons.math3.optim.univariate.BracketFinder"));
        Incrementor evaluations = ((Incrementor) createInstance("org.apache.commons.math3.util.Incrementor"));
        evaluations.setMaximalCount(1073741824);
        setField(bracket, "org.apache.commons.math3.optim.univariate.BracketFinder", "evaluations", evaluations);
        setField(line, "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer$LineSearch", "bracket", bracket);
        PowellOptimizer this$0 = ((PowellOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer"));
        GoalType goal = GoalType.MINIMIZE;
        setField(this$0, "org.apache.commons.math3.optim.nonlinear.scalar.MultivariateOptimizer", "goal", goal);
        setField(line, "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer$LineSearch", "this$0", this$0);
        setField(powellOptimizer, "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer", "line", line);
        LinearObjectiveFunction function = ((LinearObjectiveFunction) createInstance("org.apache.commons.math3.optim.linear.LinearObjectiveFunction"));
        ArrayRealVector coefficients = ((ArrayRealVector) createInstance("org.apache.commons.math3.linear.ArrayRealVector"));
        double[] data = {0.0};
        setField(coefficients, "org.apache.commons.math3.linear.ArrayRealVector", "data", data);
        setField(function, "org.apache.commons.math3.optim.linear.LinearObjectiveFunction", "coefficients", coefficients);
        setField(function, "org.apache.commons.math3.optim.linear.LinearObjectiveFunction", "constantTerm", 0.0);
        setField(powellOptimizer, "org.apache.commons.math3.optim.nonlinear.scalar.MultivariateOptimizer", "function", function);
        GoalType goal1 = GoalType.MINIMIZE;
        setField(powellOptimizer, "org.apache.commons.math3.optim.nonlinear.scalar.MultivariateOptimizer", "goal", goal1);
        double[] start = {2.0E-323};
        setField(powellOptimizer, "org.apache.commons.math3.optim.BaseMultivariateOptimizer", "start", start);
        Incrementor evaluations1 = ((Incrementor) createInstance("org.apache.commons.math3.util.Incrementor"));
        setField(evaluations1, "org.apache.commons.math3.util.Incrementor", "count", -2);
        setField(powellOptimizer, "org.apache.commons.math3.optim.BaseOptimizer", "evaluations", evaluations1);
        
        /* This test fails because method [org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer.doOptimize] produces [java.lang.NullPointerException]
            org.apache.commons.math3.optim.BaseOptimizer.incrementEvaluationCount(BaseOptimizer.java:162)
            org.apache.commons.math3.optim.nonlinear.scalar.MultivariateOptimizer.computeObjectiveValue(MultivariateOptimizer.java:115)
            org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer.access$000(PowellOptimizer.java:65)
            org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer$LineSearch$1.value(PowellOptimizer.java:352)
            org.apache.commons.math3.optim.univariate.BracketFinder.eval(BracketFinder.java:285)
            org.apache.commons.math3.optim.univariate.BracketFinder.search(BracketFinder.java:116)
            org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer$LineSearch.search(PowellOptimizer.java:358)
            org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer.doOptimize(PowellOptimizer.java:206) */
        powellOptimizer.doOptimize();
    }
    
    @Test
    public void testDoOptimize2() throws Exception  {
        PowellOptimizer powellOptimizer = ((PowellOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer"));
        MicrosphereInterpolatingFunction function = ((MicrosphereInterpolatingFunction) createInstance("org.apache.commons.math3.analysis.interpolation.MicrosphereInterpolatingFunction"));
        ArrayList microsphere = new ArrayList();
        setField(function, "org.apache.commons.math3.analysis.interpolation.MicrosphereInterpolatingFunction", "microsphere", microsphere);
        LinkedHashMap samples = new LinkedHashMap();
        Double double1 = 0.0;
        samples.put(null, double1);
        setField(function, "org.apache.commons.math3.analysis.interpolation.MicrosphereInterpolatingFunction", "samples", samples);
        setField(powellOptimizer, "org.apache.commons.math3.optim.nonlinear.scalar.MultivariateOptimizer", "function", function);
        GoalType goal = GoalType.MAXIMIZE;
        setField(powellOptimizer, "org.apache.commons.math3.optim.nonlinear.scalar.MultivariateOptimizer", "goal", goal);
        double[] start = {2.781342323134002E-309};
        setField(powellOptimizer, "org.apache.commons.math3.optim.BaseMultivariateOptimizer", "start", start);
        Incrementor evaluations = ((Incrementor) createInstance("org.apache.commons.math3.util.Incrementor"));
        setField(evaluations, "org.apache.commons.math3.util.Incrementor", "count", -2);
        setField(powellOptimizer, "org.apache.commons.math3.optim.BaseOptimizer", "evaluations", evaluations);
        
        /* This test fails because method [org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer.doOptimize] produces [java.lang.NullPointerException]
            org.apache.commons.math3.analysis.interpolation.MicrosphereInterpolatingFunction.value(MicrosphereInterpolatingFunction.java:210)
            org.apache.commons.math3.optim.nonlinear.scalar.MultivariateOptimizer.computeObjectiveValue(MultivariateOptimizer.java:116)
            org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer.doOptimize(PowellOptimizer.java:189) */
        powellOptimizer.doOptimize();
    }
    
    @Test
    public void testDoOptimize3() throws Exception  {
        PowellOptimizer powellOptimizer = ((PowellOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer"));
        MicrosphereInterpolatingFunction function = ((MicrosphereInterpolatingFunction) createInstance("org.apache.commons.math3.analysis.interpolation.MicrosphereInterpolatingFunction"));
        ArrayList microsphere = new ArrayList();
        setField(function, "org.apache.commons.math3.analysis.interpolation.MicrosphereInterpolatingFunction", "microsphere", microsphere);
        LinkedHashMap samples = new LinkedHashMap();
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math3.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        byte[] states = {
            (byte) 1, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0,
            (byte) 0
        };
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states);
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "entries", entries);
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "epsilon", -2.001953125);
        Double double1 = 0.0;
        samples.put(openMapRealVector, double1);
        setField(function, "org.apache.commons.math3.analysis.interpolation.MicrosphereInterpolatingFunction", "samples", samples);
        setField(powellOptimizer, "org.apache.commons.math3.optim.nonlinear.scalar.MultivariateOptimizer", "function", function);
        double[] start = {4.9E-324};
        setField(powellOptimizer, "org.apache.commons.math3.optim.BaseMultivariateOptimizer", "start", start);
        Incrementor evaluations = ((Incrementor) createInstance("org.apache.commons.math3.util.Incrementor"));
        setField(evaluations, "org.apache.commons.math3.util.Incrementor", "count", -537395206);
        setField(powellOptimizer, "org.apache.commons.math3.optim.BaseOptimizer", "evaluations", evaluations);
        
        /* This test fails because method [org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer.doOptimize] produces [java.lang.NullPointerException]
            org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer.doOptimize(PowellOptimizer.java:206) */
        powellOptimizer.doOptimize();
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method doOptimize()
    
    @Test(expected = TooManyEvaluationsException.class)
    public void testDoOptimize4() throws Exception  {
        PowellOptimizer powellOptimizer = ((PowellOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer"));
        Object line = createInstance("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer$LineSearch");
        BracketFinder bracket = ((BracketFinder) createInstance("org.apache.commons.math3.optim.univariate.BracketFinder"));
        Incrementor evaluations = ((Incrementor) createInstance("org.apache.commons.math3.util.Incrementor"));
        setField(evaluations, "org.apache.commons.math3.util.Incrementor", "count", -2);
        Object maxCountCallback = createInstance("org.apache.commons.math3.optim.BaseOptimizer$MaxIterCallback");
        setField(evaluations, "org.apache.commons.math3.util.Incrementor", "maxCountCallback", maxCountCallback);
        setField(bracket, "org.apache.commons.math3.optim.univariate.BracketFinder", "evaluations", evaluations);
        setField(line, "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer$LineSearch", "bracket", bracket);
        PowellOptimizer this$0 = ((PowellOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer"));
        setField(line, "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer$LineSearch", "this$0", this$0);
        setField(powellOptimizer, "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer", "line", line);
        LinearObjectiveFunction function = ((LinearObjectiveFunction) createInstance("org.apache.commons.math3.optim.linear.LinearObjectiveFunction"));
        RealVector coefficients = ((RealVector) createInstance("org.apache.commons.math3.linear.RealVector$2"));
        ArrayRealVector val$v = ((ArrayRealVector) createInstance("org.apache.commons.math3.linear.ArrayRealVector"));
        double[] data = {0.0};
        setField(val$v, "org.apache.commons.math3.linear.ArrayRealVector", "data", data);
        setField(coefficients, "org.apache.commons.math3.linear.RealVector$2", "val$v", val$v);
        setField(function, "org.apache.commons.math3.optim.linear.LinearObjectiveFunction", "coefficients", coefficients);
        setField(function, "org.apache.commons.math3.optim.linear.LinearObjectiveFunction", "constantTerm", 0.0);
        setField(powellOptimizer, "org.apache.commons.math3.optim.nonlinear.scalar.MultivariateOptimizer", "function", function);
        double[] start = {4.9E-324};
        setField(powellOptimizer, "org.apache.commons.math3.optim.BaseMultivariateOptimizer", "start", start);
        setField(powellOptimizer, "org.apache.commons.math3.optim.BaseOptimizer", "evaluations", evaluations);
        
        powellOptimizer.doOptimize();
    }
    
    @Test(expected = DimensionMismatchException.class)
    public void testDoOptimize5() throws Exception  {
        PowellOptimizer powellOptimizer = ((PowellOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer"));
        MicrosphereInterpolatingFunction function = ((MicrosphereInterpolatingFunction) createInstance("org.apache.commons.math3.analysis.interpolation.MicrosphereInterpolatingFunction"));
        ArrayList microsphere = new ArrayList();
        setField(function, "org.apache.commons.math3.analysis.interpolation.MicrosphereInterpolatingFunction", "microsphere", microsphere);
        LinkedHashMap samples = new LinkedHashMap();
        ArrayRealVector arrayRealVector = ((ArrayRealVector) createInstance("org.apache.commons.math3.linear.ArrayRealVector"));
        double[] data = {};
        setField(arrayRealVector, "org.apache.commons.math3.linear.ArrayRealVector", "data", data);
        Double double1 = 0.0;
        samples.put(arrayRealVector, double1);
        setField(function, "org.apache.commons.math3.analysis.interpolation.MicrosphereInterpolatingFunction", "samples", samples);
        setField(powellOptimizer, "org.apache.commons.math3.optim.nonlinear.scalar.MultivariateOptimizer", "function", function);
        double[] start = {4.9E-324};
        setField(powellOptimizer, "org.apache.commons.math3.optim.BaseMultivariateOptimizer", "start", start);
        Incrementor evaluations = ((Incrementor) createInstance("org.apache.commons.math3.util.Incrementor"));
        setField(evaluations, "org.apache.commons.math3.util.Incrementor", "count", -220045162);
        setField(powellOptimizer, "org.apache.commons.math3.optim.BaseOptimizer", "evaluations", evaluations);
        
        powellOptimizer.doOptimize();
    }
    
    @Test(expected = TooManyEvaluationsException.class)
    public void testDoOptimize6() throws Exception  {
        PowellOptimizer powellOptimizer = ((PowellOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer"));
        Object line = createInstance("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer$LineSearch");
        BracketFinder bracket = ((BracketFinder) createInstance("org.apache.commons.math3.optim.univariate.BracketFinder"));
        Incrementor evaluations = ((Incrementor) createInstance("org.apache.commons.math3.util.Incrementor"));
        Object maxCountCallback = createInstance("org.apache.commons.math3.optim.BaseOptimizer$MaxEvalCallback");
        setField(evaluations, "org.apache.commons.math3.util.Incrementor", "maxCountCallback", maxCountCallback);
        setField(bracket, "org.apache.commons.math3.optim.univariate.BracketFinder", "evaluations", evaluations);
        setField(line, "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer$LineSearch", "bracket", bracket);
        PowellOptimizer this$0 = ((PowellOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer"));
        GoalType goal = GoalType.MINIMIZE;
        setField(this$0, "org.apache.commons.math3.optim.nonlinear.scalar.MultivariateOptimizer", "goal", goal);
        setField(line, "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer$LineSearch", "this$0", this$0);
        setField(powellOptimizer, "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer", "line", line);
        LinearObjectiveFunction function = ((LinearObjectiveFunction) createInstance("org.apache.commons.math3.optim.linear.LinearObjectiveFunction"));
        RealVector coefficients = ((RealVector) createInstance("org.apache.commons.math3.linear.RealVector$2"));
        ArrayRealVector val$v = ((ArrayRealVector) createInstance("org.apache.commons.math3.linear.ArrayRealVector"));
        double[] data = {0.0};
        setField(val$v, "org.apache.commons.math3.linear.ArrayRealVector", "data", data);
        setField(coefficients, "org.apache.commons.math3.linear.RealVector$2", "val$v", val$v);
        setField(function, "org.apache.commons.math3.optim.linear.LinearObjectiveFunction", "coefficients", coefficients);
        setField(function, "org.apache.commons.math3.optim.linear.LinearObjectiveFunction", "constantTerm", 0.0);
        setField(powellOptimizer, "org.apache.commons.math3.optim.nonlinear.scalar.MultivariateOptimizer", "function", function);
        double[] start = {-0.0};
        setField(powellOptimizer, "org.apache.commons.math3.optim.BaseMultivariateOptimizer", "start", start);
        Incrementor evaluations1 = ((Incrementor) createInstance("org.apache.commons.math3.util.Incrementor"));
        evaluations1.setMaximalCount(1073741824);
        setField(evaluations1, "org.apache.commons.math3.util.Incrementor", "count", 256);
        setField(powellOptimizer, "org.apache.commons.math3.optim.BaseOptimizer", "evaluations", evaluations1);
        
        powellOptimizer.doOptimize();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer.newPointAndDirection
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method newPointAndDirection([D, [D, double)
    
    /**
    @utbot.classUnderTest {@link PowellOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer#newPointAndDirection(double[],double[],double)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < n; i++)} once
 * @utbot.returnsFrom {@code return result;}
 *  */
    @Test
    public void testNewPointAndDirection_IterateForLoop() throws Exception  {
        PowellOptimizer powellOptimizer = ((PowellOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer"));
        double[] doubleArray = {0.0};
        
        Class powellOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer");
        Class doubleArrayType = Class.forName("[D");
        Class doubleType = double.class;
        Method newPointAndDirectionMethod = powellOptimizerClazz.getDeclaredMethod("newPointAndDirection", doubleArrayType, doubleArrayType, doubleType);
        newPointAndDirectionMethod.setAccessible(true);
        java.lang.Object[] newPointAndDirectionMethodArguments = new java.lang.Object[3];
        newPointAndDirectionMethodArguments[0] = ((Object) doubleArray);
        newPointAndDirectionMethodArguments[1] = ((Object) doubleArray);
        newPointAndDirectionMethodArguments[2] = java.lang.Double.NaN;
        double[][] actual = ((double[][]) newPointAndDirectionMethod.invoke(powellOptimizer, newPointAndDirectionMethodArguments));
        
        double[][] expected = new double[2][];
        double[] doubleArray1 = {java.lang.Double.NaN};
        expected[0] = doubleArray1;
        double[] doubleArray2 = {java.lang.Double.NaN};
        expected[1] = doubleArray2;
        
        int expectedSize = expected.length;
        assertEquals(expectedSize, actual.length);
        for (int i = 0; i < expectedSize; i++) {
            double[] expectedNestedElement1 = expected[i];
            double[] actualNestedElement1 = actual[i];
            
            if (expectedNestedElement1 == null) {
                assertNull(actualNestedElement1);
            } else {
                int expectedNestedElement1Size = expectedNestedElement1.length;
                assertEquals(expectedNestedElement1Size, actualNestedElement1.length);
                assertArrayEquals(expectedNestedElement1, actualNestedElement1, 1.0E-6);
            }
        }
    }
    
    /**
    @utbot.classUnderTest {@link PowellOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer#newPointAndDirection(double[],double[],double)}
 * @utbot.returnsFrom {@code return result;}
 *  */
    @Test
    public void testNewPointAndDirection_ReturnResult() throws Exception  {
        PowellOptimizer powellOptimizer = ((PowellOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer"));
        double[] doubleArray = {};
        
        Class powellOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer");
        Class doubleArrayType = Class.forName("[D");
        Class doubleType = double.class;
        Method newPointAndDirectionMethod = powellOptimizerClazz.getDeclaredMethod("newPointAndDirection", doubleArrayType, doubleArrayType, doubleType);
        newPointAndDirectionMethod.setAccessible(true);
        java.lang.Object[] newPointAndDirectionMethodArguments = new java.lang.Object[3];
        newPointAndDirectionMethodArguments[0] = ((Object) doubleArray);
        newPointAndDirectionMethodArguments[1] = ((Object) null);
        newPointAndDirectionMethodArguments[2] = java.lang.Double.NaN;
        double[][] actual = ((double[][]) newPointAndDirectionMethod.invoke(powellOptimizer, newPointAndDirectionMethodArguments));
        
        double[][] expected = new double[2][];
        double[] doubleArray1 = {};
        expected[0] = doubleArray1;
        double[] doubleArray2 = {};
        expected[1] = doubleArray2;
        
        int expectedSize = expected.length;
        assertEquals(expectedSize, actual.length);
        for (int i = 0; i < expectedSize; i++) {
            double[] expectedNestedElement1 = expected[i];
            double[] actualNestedElement1 = actual[i];
            
            if (expectedNestedElement1 == null) {
                assertNull(actualNestedElement1);
            } else {
                int expectedNestedElement1Size = expectedNestedElement1.length;
                assertEquals(expectedNestedElement1Size, actualNestedElement1.length);
                assertArrayEquals(expectedNestedElement1, actualNestedElement1, 1.0E-6);
            }
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method newPointAndDirection([D, [D, double)
    
    /**
    @utbot.classUnderTest {@link PowellOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer#newPointAndDirection(double[],double[],double)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < n; i++)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: nD[i] = d[i] * optimum;
 *  */
    @Test
    public void testNewPointAndDirection_ThrowArrayIndexOutOfBoundsException() throws Throwable  {
        PowellOptimizer powellOptimizer = ((PowellOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer"));
        double[] doubleArray = {0.0};
        double[] doubleArray1 = {};
        
        /* This test fails because method [org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer.newPointAndDirection] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer.newPointAndDirection(PowellOptimizer.java:287) */
        Class powellOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer");
        Class doubleArrayType = Class.forName("[D");
        Class doubleType = double.class;
        Method newPointAndDirectionMethod = powellOptimizerClazz.getDeclaredMethod("newPointAndDirection", doubleArrayType, doubleArrayType, doubleType);
        newPointAndDirectionMethod.setAccessible(true);
        java.lang.Object[] newPointAndDirectionMethodArguments = new java.lang.Object[3];
        newPointAndDirectionMethodArguments[0] = ((Object) doubleArray);
        newPointAndDirectionMethodArguments[1] = ((Object) doubleArray1);
        newPointAndDirectionMethodArguments[2] = java.lang.Double.NaN;
        try {
            newPointAndDirectionMethod.invoke(powellOptimizer, newPointAndDirectionMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link PowellOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer#newPointAndDirection(double[],double[],double)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < n; i++)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: nD[i] = d[i] * optimum;
 *  */
    @Test
    public void testNewPointAndDirection_ThrowNullPointerException_1() throws Throwable  {
        PowellOptimizer powellOptimizer = ((PowellOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer"));
        double[] doubleArray = {0.0};
        
        /* This test fails because method [org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer.newPointAndDirection] produces [java.lang.NullPointerException]
            org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer.newPointAndDirection(PowellOptimizer.java:287) */
        Class powellOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer");
        Class doubleArrayType = Class.forName("[D");
        Class doubleType = double.class;
        Method newPointAndDirectionMethod = powellOptimizerClazz.getDeclaredMethod("newPointAndDirection", doubleArrayType, doubleArrayType, doubleType);
        newPointAndDirectionMethod.setAccessible(true);
        java.lang.Object[] newPointAndDirectionMethodArguments = new java.lang.Object[3];
        newPointAndDirectionMethodArguments[0] = ((Object) doubleArray);
        newPointAndDirectionMethodArguments[1] = ((Object) null);
        newPointAndDirectionMethodArguments[2] = java.lang.Double.NaN;
        try {
            newPointAndDirectionMethod.invoke(powellOptimizer, newPointAndDirectionMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link PowellOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer#newPointAndDirection(double[],double[],double)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: final int n = p.length;
 *  */
    @Test
    public void testNewPointAndDirection_ThrowNullPointerException() throws Throwable  {
        PowellOptimizer powellOptimizer = ((PowellOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer"));
        
        /* This test fails because method [org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer.newPointAndDirection] produces [java.lang.NullPointerException]
            org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer.newPointAndDirection(PowellOptimizer.java:283) */
        Class powellOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer");
        Class doubleArrayType = Class.forName("[D");
        Class doubleType = double.class;
        Method newPointAndDirectionMethod = powellOptimizerClazz.getDeclaredMethod("newPointAndDirection", doubleArrayType, doubleArrayType, doubleType);
        newPointAndDirectionMethod.setAccessible(true);
        java.lang.Object[] newPointAndDirectionMethodArguments = new java.lang.Object[3];
        newPointAndDirectionMethodArguments[0] = ((Object) null);
        newPointAndDirectionMethodArguments[1] = ((Object) null);
        newPointAndDirectionMethodArguments[2] = java.lang.Double.NaN;
        try {
            newPointAndDirectionMethod.invoke(powellOptimizer, newPointAndDirectionMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
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
        
                java.lang.reflect.Method methodForGetDeclaredFields715782939480600 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields715782939480600.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass715782939487300 = (java.lang.reflect.Field[]) methodForGetDeclaredFields715782939480600.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass715782939487300).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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

