package org.apache.commons.math3.optim.nonlinear.scalar.gradient;

import org.junit.Test;
import org.apache.commons.math3.optim.OptimizationData;
import org.apache.commons.math3.exception.NumberIsTooSmallException;
import org.apache.commons.math3.exception.DimensionMismatchException;
import org.apache.commons.math3.exception.MathUnsupportedOperationException;
import org.apache.commons.math3.analysis.differentiation.GradientFunction;
import org.apache.commons.math3.analysis.differentiation.MultivariateDifferentiableFunction;
import org.apache.commons.math3.optim.SimpleVectorValueChecker;
import org.apache.commons.math3.optimization.fitting.GaussianFitter;
import java.util.ArrayList;
import org.apache.commons.math3.optim.nonlinear.scalar.GoalType;
import java.util.concurrent.atomic.AtomicReference;
import org.apache.commons.math3.analysis.differentiation.DSCompiler;
import org.apache.commons.math3.optim.univariate.SimpleUnivariateValueChecker;
import org.apache.commons.math3.analysis.function.Acos;
import java.lang.reflect.Method;
import org.apache.commons.math3.exception.MathIllegalStateException;
import org.apache.commons.math3.analysis.function.Identity;
import org.apache.commons.math3.util.Incrementor;
import org.apache.commons.math3.optim.MaxEval;
import org.apache.commons.math3.exception.NumberIsTooLargeException;
import org.apache.commons.math3.optim.SimpleBounds;
import org.apache.commons.math3.optim.nonlinear.scalar.ObjectiveFunction;
import org.apache.commons.math3.optim.nonlinear.scalar.ObjectiveFunctionGradient;
import org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.BracketingStep;
import org.apache.commons.math3.optim.MaxIter;
import org.apache.commons.math3.optim.InitialGuess;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public final class org_apache_commons_math3_optim_nonlinear_scalar_gradient_NonLinearConjugateGradientOptimizerTest {
    ///region Test suites for executable org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.optimize
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method optimize([Lorg.apache.commons.math3.optim.OptimizationData;)
    
    /**
    @utbot.classUnderTest {@link NonLinearConjugateGradientOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer#optimize(org.apache.commons.math3.optim.OptimizationData[])}
 * @utbot.throwsException {@link org.apache.commons.math3.exception.NumberIsTooSmallException} 
 *  */
    @Test(expected = NumberIsTooSmallException.class)
    public void testOptimize_ThrowNumberIsTooSmallException() throws Exception  {
        NonLinearConjugateGradientOptimizer nonLinearConjugateGradientOptimizer = ((NonLinearConjugateGradientOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer"));
        double[] start = {-3.54418688E10};
        setField(nonLinearConjugateGradientOptimizer, "org.apache.commons.math3.optim.BaseMultivariateOptimizer", "start", start);
        double[] lowerBound = {1.0056115163181023E-287};
        setField(nonLinearConjugateGradientOptimizer, "org.apache.commons.math3.optim.BaseMultivariateOptimizer", "lowerBound", lowerBound);
        org.apache.commons.math3.optim.OptimizationData[] optimizationDataArray = {};
        
        nonLinearConjugateGradientOptimizer.optimize(optimizationDataArray);
    }
    
    /**
    @utbot.classUnderTest {@link NonLinearConjugateGradientOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer#optimize(org.apache.commons.math3.optim.OptimizationData[])}
 * @utbot.throwsException {@link org.apache.commons.math3.exception.DimensionMismatchException} 
 *  */
    @Test(expected = DimensionMismatchException.class)
    public void testOptimize_ThrowDimensionMismatchException_1() throws Exception  {
        NonLinearConjugateGradientOptimizer nonLinearConjugateGradientOptimizer = ((NonLinearConjugateGradientOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer"));
        double[] start = {0.0, 0.0};
        setField(nonLinearConjugateGradientOptimizer, "org.apache.commons.math3.optim.BaseMultivariateOptimizer", "start", start);
        double[] lowerBound = {0.0};
        setField(nonLinearConjugateGradientOptimizer, "org.apache.commons.math3.optim.BaseMultivariateOptimizer", "lowerBound", lowerBound);
        org.apache.commons.math3.optim.OptimizationData[] optimizationDataArray = {};
        
        nonLinearConjugateGradientOptimizer.optimize(optimizationDataArray);
    }
    
    /**
    @utbot.classUnderTest {@link NonLinearConjugateGradientOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer#optimize(org.apache.commons.math3.optim.OptimizationData[])}
 * @utbot.throwsException {@link org.apache.commons.math3.exception.MathUnsupportedOperationException} 
 *  */
    @Test(expected = MathUnsupportedOperationException.class)
    public void testOptimize_ThrowMathUnsupportedOperationException() throws Exception  {
        NonLinearConjugateGradientOptimizer nonLinearConjugateGradientOptimizer = ((NonLinearConjugateGradientOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer"));
        double[] lowerBound = {1.288229753938173E-231};
        setField(nonLinearConjugateGradientOptimizer, "org.apache.commons.math3.optim.BaseMultivariateOptimizer", "lowerBound", lowerBound);
        org.apache.commons.math3.optim.OptimizationData[] optimizationDataArray = {};
        
        nonLinearConjugateGradientOptimizer.optimize(optimizationDataArray);
    }
    
    /**
    @utbot.classUnderTest {@link NonLinearConjugateGradientOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer#optimize(org.apache.commons.math3.optim.OptimizationData[])}
 * @utbot.throwsException {@link org.apache.commons.math3.exception.MathUnsupportedOperationException} 
 *  */
    @Test(expected = MathUnsupportedOperationException.class)
    public void testOptimize_ThrowMathUnsupportedOperationException_1() throws Exception  {
        NonLinearConjugateGradientOptimizer nonLinearConjugateGradientOptimizer = ((NonLinearConjugateGradientOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer"));
        double[] start = {-1.1582208164387783E-305};
        setField(nonLinearConjugateGradientOptimizer, "org.apache.commons.math3.optim.BaseMultivariateOptimizer", "start", start);
        double[] lowerBound = {-1.1582208164387783E-305};
        setField(nonLinearConjugateGradientOptimizer, "org.apache.commons.math3.optim.BaseMultivariateOptimizer", "lowerBound", lowerBound);
        double[] upperBound = {-1.1582208164387783E-305};
        setField(nonLinearConjugateGradientOptimizer, "org.apache.commons.math3.optim.BaseMultivariateOptimizer", "upperBound", upperBound);
        org.apache.commons.math3.optim.OptimizationData[] optimizationDataArray = {};
        
        nonLinearConjugateGradientOptimizer.optimize(optimizationDataArray);
    }
    
    /**
    @utbot.classUnderTest {@link NonLinearConjugateGradientOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer#optimize(org.apache.commons.math3.optim.OptimizationData[])}
 * @utbot.throwsException {@link org.apache.commons.math3.exception.DimensionMismatchException} 
 *  */
    @Test(expected = DimensionMismatchException.class)
    public void testOptimize_ThrowDimensionMismatchException() throws Exception  {
        NonLinearConjugateGradientOptimizer nonLinearConjugateGradientOptimizer = ((NonLinearConjugateGradientOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer"));
        double[] start = {4.9E-324};
        setField(nonLinearConjugateGradientOptimizer, "org.apache.commons.math3.optim.BaseMultivariateOptimizer", "start", start);
        double[] lowerBound = {4.9E-324};
        setField(nonLinearConjugateGradientOptimizer, "org.apache.commons.math3.optim.BaseMultivariateOptimizer", "lowerBound", lowerBound);
        double[] upperBound = {0.0, 0.0};
        setField(nonLinearConjugateGradientOptimizer, "org.apache.commons.math3.optim.BaseMultivariateOptimizer", "upperBound", upperBound);
        org.apache.commons.math3.optim.OptimizationData[] optimizationDataArray = {};
        
        nonLinearConjugateGradientOptimizer.optimize(optimizationDataArray);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.doOptimize
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method doOptimize()
    
    /**
    @utbot.classUnderTest {@link NonLinearConjugateGradientOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer#doOptimize()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: double[] r = computeObjectiveGradient(point);
 *  */
    @Test
    public void testDoOptimize_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        NonLinearConjugateGradientOptimizer nonLinearConjugateGradientOptimizer = ((NonLinearConjugateGradientOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer"));
        GradientFunction gradient = ((GradientFunction) createInstance("org.apache.commons.math3.analysis.differentiation.GradientFunction"));
        MultivariateDifferentiableFunction f = ((MultivariateDifferentiableFunction) createInstance("org.apache.commons.math3.analysis.FunctionUtils$17"));
        setField(gradient, "org.apache.commons.math3.analysis.differentiation.GradientFunction", "f", f);
        setField(nonLinearConjugateGradientOptimizer, "org.apache.commons.math3.optim.nonlinear.scalar.GradientMultivariateOptimizer", "gradient", gradient);
        double[] start = {};
        setField(nonLinearConjugateGradientOptimizer, "org.apache.commons.math3.optim.BaseMultivariateOptimizer", "start", start);
        SimpleVectorValueChecker checker = ((SimpleVectorValueChecker) createInstance("org.apache.commons.math3.optim.SimpleVectorValueChecker"));
        setField(nonLinearConjugateGradientOptimizer, "org.apache.commons.math3.optim.BaseOptimizer", "checker", checker);
        
        /* This test fails because method [org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.doOptimize] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math3.analysis.FunctionUtils$17.value(FunctionUtils.java:622)
            org.apache.commons.math3.analysis.differentiation.GradientFunction.value(GradientFunction.java:51)
            org.apache.commons.math3.optim.nonlinear.scalar.GradientMultivariateOptimizer.computeObjectiveGradient(GradientMultivariateOptimizer.java:54)
            org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.doOptimize(NonLinearConjugateGradientOptimizer.java:197) */
        nonLinearConjugateGradientOptimizer.doOptimize();
    }
    
    /**
    @utbot.classUnderTest {@link NonLinearConjugateGradientOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer#doOptimize()}
 * @utbot.executesCondition {@code (goal == GoalType.MINIMIZE): True}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < n; i++)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: r[i] = -r[i];
 *  */
    @Test
    public void testDoOptimize_ThrowArrayIndexOutOfBoundsException_5() throws Exception  {
        NonLinearConjugateGradientOptimizer nonLinearConjugateGradientOptimizer = ((NonLinearConjugateGradientOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer"));
        Object gradient = createInstance("org.apache.commons.math3.optimization.fitting.CurveFitter$OldTheoreticalValuesFunction");
        GaussianFitter this$0 = ((GaussianFitter) createInstance("org.apache.commons.math3.optimization.fitting.GaussianFitter"));
        ArrayList observations = new ArrayList();
        setField(this$0, "org.apache.commons.math3.optimization.fitting.CurveFitter", "observations", observations);
        setField(gradient, "org.apache.commons.math3.optimization.fitting.CurveFitter$OldTheoreticalValuesFunction", "this$0", this$0);
        setField(nonLinearConjugateGradientOptimizer, "org.apache.commons.math3.optim.nonlinear.scalar.GradientMultivariateOptimizer", "gradient", gradient);
        GoalType goal = GoalType.MINIMIZE;
        setField(nonLinearConjugateGradientOptimizer, "org.apache.commons.math3.optim.nonlinear.scalar.MultivariateOptimizer", "goal", goal);
        double[] start = {4.450147717014656E-308};
        setField(nonLinearConjugateGradientOptimizer, "org.apache.commons.math3.optim.BaseMultivariateOptimizer", "start", start);
        
        /* This test fails because method [org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.doOptimize] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.doOptimize(NonLinearConjugateGradientOptimizer.java:200) */
        nonLinearConjugateGradientOptimizer.doOptimize();
    }
    
    /**
    @utbot.classUnderTest {@link NonLinearConjugateGradientOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer#doOptimize()}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: double[] r = computeObjectiveGradient(point);
 *  */
    @Test
    public void testDoOptimize_ThrowClassCastException() throws Exception  {
        Class dSCompilerClazz = Class.forName("org.apache.commons.math3.analysis.differentiation.DSCompiler");
        AtomicReference prevCompilers = ((AtomicReference) getStaticFieldValue(dSCompilerClazz, "compilers"));
        try {
            byte[] byteArray = {};
            AtomicReference compilers = new AtomicReference(byteArray);
            setStaticField(dSCompilerClazz, "compilers", compilers);
            NonLinearConjugateGradientOptimizer nonLinearConjugateGradientOptimizer = ((NonLinearConjugateGradientOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer"));
            GradientFunction gradient = ((GradientFunction) createInstance("org.apache.commons.math3.analysis.differentiation.GradientFunction"));
            setField(nonLinearConjugateGradientOptimizer, "org.apache.commons.math3.optim.nonlinear.scalar.GradientMultivariateOptimizer", "gradient", gradient);
            double[] start = {4.9E-324};
            setField(nonLinearConjugateGradientOptimizer, "org.apache.commons.math3.optim.BaseMultivariateOptimizer", "start", start);
            
            /* This test fails because method [org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.doOptimize] produces [java.lang.ClassCastException: class [B cannot be cast to class [[Lorg.apache.commons.math3.analysis.differentiation.DSCompiler; ([B is in module java.base of loader 'bootstrap'; [[Lorg.apache.commons.math3.analysis.differentiation.DSCompiler; is in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @4ddea21a)]
                org.apache.commons.math3.analysis.differentiation.DSCompiler.getCompiler(DSCompiler.java:195)
                org.apache.commons.math3.analysis.differentiation.DerivativeStructure.<init>(DerivativeStructure.java:88)
                org.apache.commons.math3.analysis.differentiation.DerivativeStructure.<init>(DerivativeStructure.java:100)
                org.apache.commons.math3.analysis.differentiation.DerivativeStructure.<init>(DerivativeStructure.java:119)
                org.apache.commons.math3.analysis.differentiation.GradientFunction.value(GradientFunction.java:47)
                org.apache.commons.math3.optim.nonlinear.scalar.GradientMultivariateOptimizer.computeObjectiveGradient(GradientMultivariateOptimizer.java:54)
                org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.doOptimize(NonLinearConjugateGradientOptimizer.java:197) */
            nonLinearConjugateGradientOptimizer.doOptimize();
        } finally {
            setStaticField(DSCompiler.class, "compilers", prevCompilers);
        }
    }
    
    /**
    @utbot.classUnderTest {@link NonLinearConjugateGradientOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer#doOptimize()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: double[] r = computeObjectiveGradient(point);
 *  */
    @Test
    public void testDoOptimize_ThrowArrayIndexOutOfBoundsException_1() throws Exception  {
        Class dSCompilerClazz = Class.forName("org.apache.commons.math3.analysis.differentiation.DSCompiler");
        AtomicReference prevCompilers = ((AtomicReference) getStaticFieldValue(dSCompilerClazz, "compilers"));
        try {
            org.apache.commons.math3.analysis.differentiation.DSCompiler[][] dSCompilerArray = {};
            AtomicReference compilers = new AtomicReference(dSCompilerArray);
            setStaticField(dSCompilerClazz, "compilers", compilers);
            NonLinearConjugateGradientOptimizer nonLinearConjugateGradientOptimizer = ((NonLinearConjugateGradientOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer"));
            GradientFunction gradient = ((GradientFunction) createInstance("org.apache.commons.math3.analysis.differentiation.GradientFunction"));
            setField(nonLinearConjugateGradientOptimizer, "org.apache.commons.math3.optim.nonlinear.scalar.GradientMultivariateOptimizer", "gradient", gradient);
            double[] start = {4.0E-323};
            setField(nonLinearConjugateGradientOptimizer, "org.apache.commons.math3.optim.BaseMultivariateOptimizer", "start", start);
            
            /* This test fails because method [org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.doOptimize] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
                org.apache.commons.math3.analysis.differentiation.DSCompiler.getCompiler(DSCompiler.java:205)
                org.apache.commons.math3.analysis.differentiation.DerivativeStructure.<init>(DerivativeStructure.java:88)
                org.apache.commons.math3.analysis.differentiation.DerivativeStructure.<init>(DerivativeStructure.java:100)
                org.apache.commons.math3.analysis.differentiation.DerivativeStructure.<init>(DerivativeStructure.java:119)
                org.apache.commons.math3.analysis.differentiation.GradientFunction.value(GradientFunction.java:47)
                org.apache.commons.math3.optim.nonlinear.scalar.GradientMultivariateOptimizer.computeObjectiveGradient(GradientMultivariateOptimizer.java:54)
                org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.doOptimize(NonLinearConjugateGradientOptimizer.java:197) */
            nonLinearConjugateGradientOptimizer.doOptimize();
        } finally {
            setStaticField(DSCompiler.class, "compilers", prevCompilers);
        }
    }
    
    /**
    @utbot.classUnderTest {@link NonLinearConjugateGradientOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer#doOptimize()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} 
 *  */
    @Test
    public void testDoOptimize_ThrowArrayIndexOutOfBoundsException_2() throws Exception  {
        Class dSCompilerClazz = Class.forName("org.apache.commons.math3.analysis.differentiation.DSCompiler");
        AtomicReference prevCompilers = ((AtomicReference) getStaticFieldValue(dSCompilerClazz, "compilers"));
        try {
            org.apache.commons.math3.analysis.differentiation.DSCompiler[][] dSCompilerArray = new org.apache.commons.math3.analysis.differentiation.DSCompiler[2][];
            org.apache.commons.math3.analysis.differentiation.DSCompiler[] dSCompilerArray1 = {};
            dSCompilerArray[0] = dSCompilerArray1;
            org.apache.commons.math3.analysis.differentiation.DSCompiler[] dSCompilerArray2 = new org.apache.commons.math3.analysis.differentiation.DSCompiler[2];
            DSCompiler dSCompiler = ((DSCompiler) createInstance("org.apache.commons.math3.analysis.differentiation.DSCompiler"));
            setField(dSCompiler, "org.apache.commons.math3.analysis.differentiation.DSCompiler", "parameters", 1073741824);
            int[][] sizes = {null};
            setField(dSCompiler, "org.apache.commons.math3.analysis.differentiation.DSCompiler", "sizes", sizes);
            dSCompilerArray2[1] = dSCompiler;
            dSCompilerArray[1] = dSCompilerArray2;
            AtomicReference compilers = new AtomicReference(dSCompilerArray);
            setStaticField(dSCompilerClazz, "compilers", compilers);
            NonLinearConjugateGradientOptimizer nonLinearConjugateGradientOptimizer = ((NonLinearConjugateGradientOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer"));
            GradientFunction gradient = ((GradientFunction) createInstance("org.apache.commons.math3.analysis.differentiation.GradientFunction"));
            setField(nonLinearConjugateGradientOptimizer, "org.apache.commons.math3.optim.nonlinear.scalar.GradientMultivariateOptimizer", "gradient", gradient);
            double[] start = {3.31561842E-316};
            setField(nonLinearConjugateGradientOptimizer, "org.apache.commons.math3.optim.BaseMultivariateOptimizer", "start", start);
            
            /* This test fails because method [org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.doOptimize] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1073741824 out of bounds for length 1]
                org.apache.commons.math3.analysis.differentiation.DSCompiler.getSize(DSCompiler.java:653)
                org.apache.commons.math3.analysis.differentiation.DerivativeStructure.<init>(DerivativeStructure.java:78)
                org.apache.commons.math3.analysis.differentiation.DerivativeStructure.<init>(DerivativeStructure.java:88)
                org.apache.commons.math3.analysis.differentiation.DerivativeStructure.<init>(DerivativeStructure.java:100)
                org.apache.commons.math3.analysis.differentiation.DerivativeStructure.<init>(DerivativeStructure.java:119)
                org.apache.commons.math3.analysis.differentiation.GradientFunction.value(GradientFunction.java:47)
                org.apache.commons.math3.optim.nonlinear.scalar.GradientMultivariateOptimizer.computeObjectiveGradient(GradientMultivariateOptimizer.java:54)
                org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.doOptimize(NonLinearConjugateGradientOptimizer.java:197) */
            nonLinearConjugateGradientOptimizer.doOptimize();
        } finally {
            setStaticField(DSCompiler.class, "compilers", prevCompilers);
        }
    }
    
    /**
    @utbot.classUnderTest {@link NonLinearConjugateGradientOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer#doOptimize()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: double[] r = computeObjectiveGradient(point);
 *  */
    @Test
    public void testDoOptimize_ThrowArrayIndexOutOfBoundsException_3() throws Exception  {
        Class dSCompilerClazz = Class.forName("org.apache.commons.math3.analysis.differentiation.DSCompiler");
        AtomicReference prevCompilers = ((AtomicReference) getStaticFieldValue(dSCompilerClazz, "compilers"));
        try {
            org.apache.commons.math3.analysis.differentiation.DSCompiler[][] dSCompilerArray = new org.apache.commons.math3.analysis.differentiation.DSCompiler[2][];
            org.apache.commons.math3.analysis.differentiation.DSCompiler[] dSCompilerArray1 = {};
            dSCompilerArray[0] = dSCompilerArray1;
            org.apache.commons.math3.analysis.differentiation.DSCompiler[] dSCompilerArray2 = new org.apache.commons.math3.analysis.differentiation.DSCompiler[2];
            DSCompiler dSCompiler = ((DSCompiler) createInstance("org.apache.commons.math3.analysis.differentiation.DSCompiler"));
            int[][] sizes = new int[1][];
            int[] intArray = {0};
            sizes[0] = intArray;
            setField(dSCompiler, "org.apache.commons.math3.analysis.differentiation.DSCompiler", "sizes", sizes);
            dSCompilerArray2[1] = dSCompiler;
            dSCompilerArray[1] = dSCompilerArray2;
            AtomicReference compilers = new AtomicReference(dSCompilerArray);
            setStaticField(dSCompilerClazz, "compilers", compilers);
            NonLinearConjugateGradientOptimizer nonLinearConjugateGradientOptimizer = ((NonLinearConjugateGradientOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer"));
            GradientFunction gradient = ((GradientFunction) createInstance("org.apache.commons.math3.analysis.differentiation.GradientFunction"));
            setField(nonLinearConjugateGradientOptimizer, "org.apache.commons.math3.optim.nonlinear.scalar.GradientMultivariateOptimizer", "gradient", gradient);
            double[] start = {4.450147717014404E-308};
            setField(nonLinearConjugateGradientOptimizer, "org.apache.commons.math3.optim.BaseMultivariateOptimizer", "start", start);
            
            /* This test fails because method [org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.doOptimize] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
                org.apache.commons.math3.analysis.differentiation.DerivativeStructure.<init>(DerivativeStructure.java:101)
                org.apache.commons.math3.analysis.differentiation.DerivativeStructure.<init>(DerivativeStructure.java:119)
                org.apache.commons.math3.analysis.differentiation.GradientFunction.value(GradientFunction.java:47)
                org.apache.commons.math3.optim.nonlinear.scalar.GradientMultivariateOptimizer.computeObjectiveGradient(GradientMultivariateOptimizer.java:54)
                org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.doOptimize(NonLinearConjugateGradientOptimizer.java:197) */
            nonLinearConjugateGradientOptimizer.doOptimize();
        } finally {
            setStaticField(DSCompiler.class, "compilers", prevCompilers);
        }
    }
    
    /**
    @utbot.classUnderTest {@link NonLinearConjugateGradientOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer#doOptimize()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} 
 *  */
    @Test
    public void testDoOptimize_ThrowArrayIndexOutOfBoundsException_4() throws Exception  {
        Class dSCompilerClazz = Class.forName("org.apache.commons.math3.analysis.differentiation.DSCompiler");
        AtomicReference prevCompilers = ((AtomicReference) getStaticFieldValue(dSCompilerClazz, "compilers"));
        try {
            org.apache.commons.math3.analysis.differentiation.DSCompiler[][] dSCompilerArray = new org.apache.commons.math3.analysis.differentiation.DSCompiler[2][];
            org.apache.commons.math3.analysis.differentiation.DSCompiler[] dSCompilerArray1 = {};
            dSCompilerArray[0] = dSCompilerArray1;
            org.apache.commons.math3.analysis.differentiation.DSCompiler[] dSCompilerArray2 = new org.apache.commons.math3.analysis.differentiation.DSCompiler[2];
            DSCompiler dSCompiler = ((DSCompiler) createInstance("org.apache.commons.math3.analysis.differentiation.DSCompiler"));
            setField(dSCompiler, "org.apache.commons.math3.analysis.differentiation.DSCompiler", "order", Integer.MIN_VALUE);
            int[][] sizes = new int[1][];
            int[] intArray = {0};
            sizes[0] = intArray;
            setField(dSCompiler, "org.apache.commons.math3.analysis.differentiation.DSCompiler", "sizes", sizes);
            dSCompilerArray2[1] = dSCompiler;
            dSCompilerArray[1] = dSCompilerArray2;
            AtomicReference compilers = new AtomicReference(dSCompilerArray);
            setStaticField(dSCompilerClazz, "compilers", compilers);
            NonLinearConjugateGradientOptimizer nonLinearConjugateGradientOptimizer = ((NonLinearConjugateGradientOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer"));
            GradientFunction gradient = ((GradientFunction) createInstance("org.apache.commons.math3.analysis.differentiation.GradientFunction"));
            setField(nonLinearConjugateGradientOptimizer, "org.apache.commons.math3.optim.nonlinear.scalar.GradientMultivariateOptimizer", "gradient", gradient);
            double[] start = {8.0948E-320};
            setField(nonLinearConjugateGradientOptimizer, "org.apache.commons.math3.optim.BaseMultivariateOptimizer", "start", start);
            
            /* This test fails because method [org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.doOptimize] produces [java.lang.ArrayIndexOutOfBoundsException: Index -2147483648 out of bounds for length 1]
                org.apache.commons.math3.analysis.differentiation.DSCompiler.getSize(DSCompiler.java:653)
                org.apache.commons.math3.analysis.differentiation.DerivativeStructure.<init>(DerivativeStructure.java:78)
                org.apache.commons.math3.analysis.differentiation.DerivativeStructure.<init>(DerivativeStructure.java:88)
                org.apache.commons.math3.analysis.differentiation.DerivativeStructure.<init>(DerivativeStructure.java:100)
                org.apache.commons.math3.analysis.differentiation.DerivativeStructure.<init>(DerivativeStructure.java:119)
                org.apache.commons.math3.analysis.differentiation.GradientFunction.value(GradientFunction.java:47)
                org.apache.commons.math3.optim.nonlinear.scalar.GradientMultivariateOptimizer.computeObjectiveGradient(GradientMultivariateOptimizer.java:54)
                org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.doOptimize(NonLinearConjugateGradientOptimizer.java:197) */
            nonLinearConjugateGradientOptimizer.doOptimize();
        } finally {
            setStaticField(DSCompiler.class, "compilers", prevCompilers);
        }
    }
    
    /**
    @utbot.classUnderTest {@link NonLinearConjugateGradientOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer#doOptimize()}
 * @utbot.throwsException {@link java.lang.NegativeArraySizeException} in: double[] r = computeObjectiveGradient(point);
 *  */
    @Test
    public void testDoOptimize_ThrowNegativeArraySizeException() throws Exception  {
        Class dSCompilerClazz = Class.forName("org.apache.commons.math3.analysis.differentiation.DSCompiler");
        AtomicReference prevCompilers = ((AtomicReference) getStaticFieldValue(dSCompilerClazz, "compilers"));
        try {
            org.apache.commons.math3.analysis.differentiation.DSCompiler[][] dSCompilerArray = new org.apache.commons.math3.analysis.differentiation.DSCompiler[2][];
            dSCompilerArray[0] = ((org.apache.commons.math3.analysis.differentiation.DSCompiler[]) null);
            org.apache.commons.math3.analysis.differentiation.DSCompiler[] dSCompilerArray1 = new org.apache.commons.math3.analysis.differentiation.DSCompiler[2];
            DSCompiler dSCompiler = ((DSCompiler) createInstance("org.apache.commons.math3.analysis.differentiation.DSCompiler"));
            int[][] sizes = new int[1][];
            int[] intArray = {Integer.MIN_VALUE};
            sizes[0] = intArray;
            setField(dSCompiler, "org.apache.commons.math3.analysis.differentiation.DSCompiler", "sizes", sizes);
            dSCompilerArray1[1] = dSCompiler;
            dSCompilerArray[1] = dSCompilerArray1;
            AtomicReference compilers = new AtomicReference(dSCompilerArray);
            setStaticField(dSCompilerClazz, "compilers", compilers);
            NonLinearConjugateGradientOptimizer nonLinearConjugateGradientOptimizer = ((NonLinearConjugateGradientOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer"));
            GradientFunction gradient = ((GradientFunction) createInstance("org.apache.commons.math3.analysis.differentiation.GradientFunction"));
            setField(nonLinearConjugateGradientOptimizer, "org.apache.commons.math3.optim.nonlinear.scalar.GradientMultivariateOptimizer", "gradient", gradient);
            double[] start = {2.0000000596046448};
            setField(nonLinearConjugateGradientOptimizer, "org.apache.commons.math3.optim.BaseMultivariateOptimizer", "start", start);
            
            /* This test fails because method [org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.doOptimize] produces [java.lang.NegativeArraySizeException: -2147483648]
                org.apache.commons.math3.analysis.differentiation.DerivativeStructure.<init>(DerivativeStructure.java:78)
                org.apache.commons.math3.analysis.differentiation.DerivativeStructure.<init>(DerivativeStructure.java:88)
                org.apache.commons.math3.analysis.differentiation.DerivativeStructure.<init>(DerivativeStructure.java:100)
                org.apache.commons.math3.analysis.differentiation.DerivativeStructure.<init>(DerivativeStructure.java:119)
                org.apache.commons.math3.analysis.differentiation.GradientFunction.value(GradientFunction.java:47)
                org.apache.commons.math3.optim.nonlinear.scalar.GradientMultivariateOptimizer.computeObjectiveGradient(GradientMultivariateOptimizer.java:54)
                org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.doOptimize(NonLinearConjugateGradientOptimizer.java:197) */
            nonLinearConjugateGradientOptimizer.doOptimize();
        } finally {
            setStaticField(DSCompiler.class, "compilers", prevCompilers);
        }
    }
    
    /**
    @utbot.classUnderTest {@link NonLinearConjugateGradientOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer#doOptimize()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: final int n = point.length;
 *  */
    @Test
    public void testDoOptimize_ThrowNullPointerException() throws Exception  {
        NonLinearConjugateGradientOptimizer nonLinearConjugateGradientOptimizer = ((NonLinearConjugateGradientOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer"));
        
        /* This test fails because method [org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.doOptimize] produces [java.lang.NullPointerException]
            org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.doOptimize(NonLinearConjugateGradientOptimizer.java:196) */
        nonLinearConjugateGradientOptimizer.doOptimize();
    }
    
    /**
    @utbot.classUnderTest {@link NonLinearConjugateGradientOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer#doOptimize()}
 * @utbot.executesCondition {@code (goal == GoalType.MINIMIZE): True}
 * @utbot.invokes {@link org.apache.commons.math3.optim.nonlinear.scalar.gradient.Preconditioner#precondition(double[],double[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: double[] steepestDescent = preconditioner.precondition(point, r);
 *  */
    @Test
    public void testDoOptimize_ThrowNullPointerException_1() throws Exception  {
        NonLinearConjugateGradientOptimizer nonLinearConjugateGradientOptimizer = ((NonLinearConjugateGradientOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer"));
        Object gradient = createInstance("org.apache.commons.math3.optimization.fitting.CurveFitter$OldTheoreticalValuesFunction");
        GaussianFitter this$0 = ((GaussianFitter) createInstance("org.apache.commons.math3.optimization.fitting.GaussianFitter"));
        ArrayList observations = new ArrayList();
        setField(this$0, "org.apache.commons.math3.optimization.fitting.CurveFitter", "observations", observations);
        setField(gradient, "org.apache.commons.math3.optimization.fitting.CurveFitter$OldTheoreticalValuesFunction", "this$0", this$0);
        setField(nonLinearConjugateGradientOptimizer, "org.apache.commons.math3.optim.nonlinear.scalar.GradientMultivariateOptimizer", "gradient", gradient);
        GoalType goal = GoalType.MINIMIZE;
        setField(nonLinearConjugateGradientOptimizer, "org.apache.commons.math3.optim.nonlinear.scalar.MultivariateOptimizer", "goal", goal);
        double[] start = {};
        setField(nonLinearConjugateGradientOptimizer, "org.apache.commons.math3.optim.BaseMultivariateOptimizer", "start", start);
        SimpleUnivariateValueChecker checker = ((SimpleUnivariateValueChecker) createInstance("org.apache.commons.math3.optim.univariate.SimpleUnivariateValueChecker"));
        setField(nonLinearConjugateGradientOptimizer, "org.apache.commons.math3.optim.BaseOptimizer", "checker", checker);
        
        /* This test fails because method [org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.doOptimize] produces [java.lang.NullPointerException]
            org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.doOptimize(NonLinearConjugateGradientOptimizer.java:205) */
        nonLinearConjugateGradientOptimizer.doOptimize();
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method doOptimize()
    
    @Test
    public void testDoOptimize1() throws Exception  {
        Class dSCompilerClazz = Class.forName("org.apache.commons.math3.analysis.differentiation.DSCompiler");
        AtomicReference prevCompilers = ((AtomicReference) getStaticFieldValue(dSCompilerClazz, "compilers"));
        try {
            org.apache.commons.math3.analysis.differentiation.DSCompiler[][] dSCompilerArray = new org.apache.commons.math3.analysis.differentiation.DSCompiler[2][];
            org.apache.commons.math3.analysis.differentiation.DSCompiler[] dSCompilerArray1 = {};
            dSCompilerArray[0] = dSCompilerArray1;
            org.apache.commons.math3.analysis.differentiation.DSCompiler[] dSCompilerArray2 = new org.apache.commons.math3.analysis.differentiation.DSCompiler[10];
            DSCompiler dSCompiler = ((DSCompiler) createInstance("org.apache.commons.math3.analysis.differentiation.DSCompiler"));
            dSCompilerArray2[0] = dSCompiler;
            dSCompilerArray2[2] = dSCompiler;
            dSCompilerArray2[3] = dSCompiler;
            dSCompilerArray2[4] = dSCompiler;
            dSCompilerArray2[5] = dSCompiler;
            dSCompilerArray2[6] = dSCompiler;
            dSCompilerArray2[7] = dSCompiler;
            dSCompilerArray2[8] = dSCompiler;
            dSCompilerArray2[9] = dSCompiler;
            dSCompilerArray[1] = dSCompilerArray2;
            AtomicReference compilers = new AtomicReference(dSCompilerArray);
            setStaticField(dSCompilerClazz, "compilers", compilers);
            NonLinearConjugateGradientOptimizer nonLinearConjugateGradientOptimizer = ((NonLinearConjugateGradientOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer"));
            GradientFunction gradient = ((GradientFunction) createInstance("org.apache.commons.math3.analysis.differentiation.GradientFunction"));
            setField(nonLinearConjugateGradientOptimizer, "org.apache.commons.math3.optim.nonlinear.scalar.GradientMultivariateOptimizer", "gradient", gradient);
            double[] start = {2.1729236899484E-311};
            setField(nonLinearConjugateGradientOptimizer, "org.apache.commons.math3.optim.BaseMultivariateOptimizer", "start", start);
            
            /* This test fails because method [org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.doOptimize] produces [java.lang.ArrayIndexOutOfBoundsException: arraycopy: last destination index 10 out of bounds for object array[2]]
                java.base/java.lang.System.arraycopy(Native Method)
                org.apache.commons.math3.analysis.differentiation.DSCompiler.getCompiler(DSCompiler.java:211)
                org.apache.commons.math3.analysis.differentiation.DerivativeStructure.<init>(DerivativeStructure.java:88)
                org.apache.commons.math3.analysis.differentiation.DerivativeStructure.<init>(DerivativeStructure.java:100)
                org.apache.commons.math3.analysis.differentiation.DerivativeStructure.<init>(DerivativeStructure.java:119)
                org.apache.commons.math3.analysis.differentiation.GradientFunction.value(GradientFunction.java:47)
                org.apache.commons.math3.optim.nonlinear.scalar.GradientMultivariateOptimizer.computeObjectiveGradient(GradientMultivariateOptimizer.java:54)
                org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.doOptimize(NonLinearConjugateGradientOptimizer.java:197) */
            nonLinearConjugateGradientOptimizer.doOptimize();
        } finally {
            setStaticField(DSCompiler.class, "compilers", prevCompilers);
        }
    }
    
    @Test
    public void testDoOptimize2() throws Exception  {
        Class dSCompilerClazz = Class.forName("org.apache.commons.math3.analysis.differentiation.DSCompiler");
        AtomicReference prevCompilers = ((AtomicReference) getStaticFieldValue(dSCompilerClazz, "compilers"));
        try {
            org.apache.commons.math3.analysis.differentiation.DSCompiler[][] dSCompilerArray = new org.apache.commons.math3.analysis.differentiation.DSCompiler[1][];
            org.apache.commons.math3.analysis.differentiation.DSCompiler[] dSCompilerArray1 = new org.apache.commons.math3.analysis.differentiation.DSCompiler[9];
            DSCompiler dSCompiler = ((DSCompiler) createInstance("org.apache.commons.math3.analysis.differentiation.DSCompiler"));
            dSCompilerArray1[0] = dSCompiler;
            dSCompilerArray[0] = dSCompilerArray1;
            AtomicReference compilers = new AtomicReference(dSCompilerArray);
            setStaticField(dSCompilerClazz, "compilers", compilers);
            NonLinearConjugateGradientOptimizer nonLinearConjugateGradientOptimizer = ((NonLinearConjugateGradientOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer"));
            GradientFunction gradient = ((GradientFunction) createInstance("org.apache.commons.math3.analysis.differentiation.GradientFunction"));
            setField(nonLinearConjugateGradientOptimizer, "org.apache.commons.math3.optim.nonlinear.scalar.GradientMultivariateOptimizer", "gradient", gradient);
            double[] start = {4.7783097267364807E-299, 1.390671161567E-309};
            setField(nonLinearConjugateGradientOptimizer, "org.apache.commons.math3.optim.BaseMultivariateOptimizer", "start", start);
            
            /* This test fails because method [org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.doOptimize] produces [java.lang.NullPointerException]
                java.base/java.lang.System.arraycopy(Native Method)
                org.apache.commons.math3.analysis.differentiation.DSCompiler.compileSizes(DSCompiler.java:247)
                org.apache.commons.math3.analysis.differentiation.DSCompiler.<init>(DSCompiler.java:168)
                org.apache.commons.math3.analysis.differentiation.DSCompiler.getCompiler(DSCompiler.java:222)
                org.apache.commons.math3.analysis.differentiation.DerivativeStructure.<init>(DerivativeStructure.java:88)
                org.apache.commons.math3.analysis.differentiation.DerivativeStructure.<init>(DerivativeStructure.java:100)
                org.apache.commons.math3.analysis.differentiation.DerivativeStructure.<init>(DerivativeStructure.java:119)
                org.apache.commons.math3.analysis.differentiation.GradientFunction.value(GradientFunction.java:47)
                org.apache.commons.math3.optim.nonlinear.scalar.GradientMultivariateOptimizer.computeObjectiveGradient(GradientMultivariateOptimizer.java:54)
                org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.doOptimize(NonLinearConjugateGradientOptimizer.java:197) */
            nonLinearConjugateGradientOptimizer.doOptimize();
        } finally {
            setStaticField(DSCompiler.class, "compilers", prevCompilers);
        }
    }
    
    @Test
    public void testDoOptimize3() throws Exception  {
        Class dSCompilerClazz = Class.forName("org.apache.commons.math3.analysis.differentiation.DSCompiler");
        AtomicReference prevCompilers = ((AtomicReference) getStaticFieldValue(dSCompilerClazz, "compilers"));
        try {
            AtomicReference compilers = new AtomicReference(null);
            setStaticField(dSCompilerClazz, "compilers", compilers);
            NonLinearConjugateGradientOptimizer nonLinearConjugateGradientOptimizer = ((NonLinearConjugateGradientOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer"));
            GradientFunction gradient = ((GradientFunction) createInstance("org.apache.commons.math3.analysis.differentiation.GradientFunction"));
            setField(nonLinearConjugateGradientOptimizer, "org.apache.commons.math3.optim.nonlinear.scalar.GradientMultivariateOptimizer", "gradient", gradient);
            double[] start = {2.0522684006491881E-289, 2.781342323134002E-309};
            setField(nonLinearConjugateGradientOptimizer, "org.apache.commons.math3.optim.BaseMultivariateOptimizer", "start", start);
            SimpleVectorValueChecker checker = ((SimpleVectorValueChecker) createInstance("org.apache.commons.math3.optim.SimpleVectorValueChecker"));
            setField(nonLinearConjugateGradientOptimizer, "org.apache.commons.math3.optim.BaseOptimizer", "checker", checker);
            
            /* This test fails because method [org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.doOptimize] produces [java.lang.NullPointerException]
                org.apache.commons.math3.analysis.differentiation.GradientFunction.value(GradientFunction.java:51)
                org.apache.commons.math3.optim.nonlinear.scalar.GradientMultivariateOptimizer.computeObjectiveGradient(GradientMultivariateOptimizer.java:54)
                org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.doOptimize(NonLinearConjugateGradientOptimizer.java:197) */
            nonLinearConjugateGradientOptimizer.doOptimize();
        } finally {
            setStaticField(DSCompiler.class, "compilers", prevCompilers);
        }
    }
    
    @Test
    public void testDoOptimize4() throws Exception  {
        Class dSCompilerClazz = Class.forName("org.apache.commons.math3.analysis.differentiation.DSCompiler");
        AtomicReference prevCompilers = ((AtomicReference) getStaticFieldValue(dSCompilerClazz, "compilers"));
        try {
            org.apache.commons.math3.analysis.differentiation.DSCompiler[][] dSCompilerArray = new org.apache.commons.math3.analysis.differentiation.DSCompiler[3][];
            org.apache.commons.math3.analysis.differentiation.DSCompiler[] dSCompilerArray1 = {null, null, null, null, null, null, null, null};
            dSCompilerArray[0] = dSCompilerArray1;
            org.apache.commons.math3.analysis.differentiation.DSCompiler[] dSCompilerArray2 = {};
            dSCompilerArray[1] = dSCompilerArray2;
            dSCompilerArray[2] = ((org.apache.commons.math3.analysis.differentiation.DSCompiler[]) null);
            AtomicReference compilers = new AtomicReference(dSCompilerArray);
            setStaticField(dSCompilerClazz, "compilers", compilers);
            NonLinearConjugateGradientOptimizer nonLinearConjugateGradientOptimizer = ((NonLinearConjugateGradientOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer"));
            GradientFunction gradient = ((GradientFunction) createInstance("org.apache.commons.math3.analysis.differentiation.GradientFunction"));
            setField(nonLinearConjugateGradientOptimizer, "org.apache.commons.math3.optim.nonlinear.scalar.GradientMultivariateOptimizer", "gradient", gradient);
            double[] start = {3.800555148060764E-270};
            setField(nonLinearConjugateGradientOptimizer, "org.apache.commons.math3.optim.BaseMultivariateOptimizer", "start", start);
            
            /* This test fails because method [org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.doOptimize] produces [java.lang.NullPointerException]
                org.apache.commons.math3.analysis.differentiation.DSCompiler.getCompiler(DSCompiler.java:211)
                org.apache.commons.math3.analysis.differentiation.DerivativeStructure.<init>(DerivativeStructure.java:88)
                org.apache.commons.math3.analysis.differentiation.DerivativeStructure.<init>(DerivativeStructure.java:100)
                org.apache.commons.math3.analysis.differentiation.DerivativeStructure.<init>(DerivativeStructure.java:119)
                org.apache.commons.math3.analysis.differentiation.GradientFunction.value(GradientFunction.java:47)
                org.apache.commons.math3.optim.nonlinear.scalar.GradientMultivariateOptimizer.computeObjectiveGradient(GradientMultivariateOptimizer.java:54)
                org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.doOptimize(NonLinearConjugateGradientOptimizer.java:197) */
            nonLinearConjugateGradientOptimizer.doOptimize();
        } finally {
            setStaticField(DSCompiler.class, "compilers", prevCompilers);
        }
    }
    
    @Test
    public void testDoOptimize5() throws Exception  {
        Class dSCompilerClazz = Class.forName("org.apache.commons.math3.analysis.differentiation.DSCompiler");
        AtomicReference prevCompilers = ((AtomicReference) getStaticFieldValue(dSCompilerClazz, "compilers"));
        try {
            org.apache.commons.math3.analysis.differentiation.DSCompiler[][] dSCompilerArray = new org.apache.commons.math3.analysis.differentiation.DSCompiler[2][];
            org.apache.commons.math3.analysis.differentiation.DSCompiler[] dSCompilerArray1 = {};
            dSCompilerArray[0] = dSCompilerArray1;
            org.apache.commons.math3.analysis.differentiation.DSCompiler[] dSCompilerArray2 = {};
            dSCompilerArray[1] = dSCompilerArray2;
            AtomicReference compilers = new AtomicReference(dSCompilerArray);
            setStaticField(dSCompilerClazz, "compilers", compilers);
            NonLinearConjugateGradientOptimizer nonLinearConjugateGradientOptimizer = ((NonLinearConjugateGradientOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer"));
            GradientFunction gradient = ((GradientFunction) createInstance("org.apache.commons.math3.analysis.differentiation.GradientFunction"));
            setField(nonLinearConjugateGradientOptimizer, "org.apache.commons.math3.optim.nonlinear.scalar.GradientMultivariateOptimizer", "gradient", gradient);
            double[] start = {1.0864618449742E-311};
            setField(nonLinearConjugateGradientOptimizer, "org.apache.commons.math3.optim.BaseMultivariateOptimizer", "start", start);
            
            /* This test fails because method [org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.doOptimize] produces [java.lang.NullPointerException]
                org.apache.commons.math3.analysis.differentiation.GradientFunction.value(GradientFunction.java:51)
                org.apache.commons.math3.optim.nonlinear.scalar.GradientMultivariateOptimizer.computeObjectiveGradient(GradientMultivariateOptimizer.java:54)
                org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.doOptimize(NonLinearConjugateGradientOptimizer.java:197) */
            nonLinearConjugateGradientOptimizer.doOptimize();
        } finally {
            setStaticField(DSCompiler.class, "compilers", prevCompilers);
        }
    }
    
    @Test
    public void testDoOptimize6() throws Exception  {
        NonLinearConjugateGradientOptimizer nonLinearConjugateGradientOptimizer = ((NonLinearConjugateGradientOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer"));
        Object gradient = createInstance("org.apache.commons.math3.optimization.fitting.CurveFitter$OldTheoreticalValuesFunction");
        GaussianFitter this$0 = ((GaussianFitter) createInstance("org.apache.commons.math3.optimization.fitting.GaussianFitter"));
        ArrayList observations = new ArrayList();
        observations.add(null);
        observations.add(null);
        observations.add(null);
        setField(this$0, "org.apache.commons.math3.optimization.fitting.CurveFitter", "observations", observations);
        setField(gradient, "org.apache.commons.math3.optimization.fitting.CurveFitter$OldTheoreticalValuesFunction", "this$0", this$0);
        setField(nonLinearConjugateGradientOptimizer, "org.apache.commons.math3.optim.nonlinear.scalar.GradientMultivariateOptimizer", "gradient", gradient);
        double[] start = new double[17];
        start[0] = 2.0000000000002274;
        start[1] = 2.652494739E-315;
        start[2] = 4.778309726806014E-299;
        start[3] = 2.225073859543332E-308;
        start[4] = 5.562684646268003E-309;
        start[5] = 4.9E-324;
        start[6] = 1.6578092E-316;
        start[7] = 2.781342323134002E-309;
        start[8] = 1.265E-321;
        start[9] = 2.2946074165855514E-308;
        start[10] = 3.16E-322;
        start[11] = 1.0361308E-317;
        start[12] = 4.9E-324;
        start[14] = 1.4916681462400837E-154;
        start[15] = -0.0;
        start[16] = 4.9E-324;
        setField(nonLinearConjugateGradientOptimizer, "org.apache.commons.math3.optim.BaseMultivariateOptimizer", "start", start);
        
        /* This test fails because method [org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.doOptimize] produces [java.lang.NullPointerException]
            org.apache.commons.math3.optimization.fitting.CurveFitter$OldTheoreticalValuesFunction.value(CurveFitter.java:236)
            org.apache.commons.math3.optim.nonlinear.scalar.GradientMultivariateOptimizer.computeObjectiveGradient(GradientMultivariateOptimizer.java:54)
            org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.doOptimize(NonLinearConjugateGradientOptimizer.java:197) */
        nonLinearConjugateGradientOptimizer.doOptimize();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.findUpperBound
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method findUpperBound(org.apache.commons.math3.analysis.UnivariateFunction, double, double)
    
    /**
    @utbot.classUnderTest {@link NonLinearConjugateGradientOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer#findUpperBound(org.apache.commons.math3.analysis.UnivariateFunction,double,double)}
 * @utbot.invokes {@link org.apache.commons.math3.analysis.UnivariateFunction#value(double)}
 * @utbot.iterates iterate the loop {@code for(double step = h; step < Double.MAX_VALUE; step *= FastMath.max(2, yA / yB))} once
 *  */
    @Test
    public void testFindUpperBound_YAMultiplyYBLessOrEqualZero() throws Exception  {
        NonLinearConjugateGradientOptimizer nonLinearConjugateGradientOptimizer = ((NonLinearConjugateGradientOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer"));
        Acos acos = new Acos();
        
        Class nonLinearConjugateGradientOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer");
        Class acosType = Class.forName("org.apache.commons.math3.analysis.UnivariateFunction");
        Class doubleType = double.class;
        Method findUpperBoundMethod = nonLinearConjugateGradientOptimizerClazz.getDeclaredMethod("findUpperBound", acosType, doubleType, doubleType);
        findUpperBoundMethod.setAccessible(true);
        java.lang.Object[] findUpperBoundMethodArguments = new java.lang.Object[3];
        findUpperBoundMethodArguments[0] = acos;
        findUpperBoundMethodArguments[1] = -1.0;
        findUpperBoundMethodArguments[2] = 2.0;
        double actual = ((Double) findUpperBoundMethod.invoke(nonLinearConjugateGradientOptimizer, findUpperBoundMethodArguments));
        
        assertEquals(1.0, actual, 1.0E-6);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method findUpperBound(org.apache.commons.math3.analysis.UnivariateFunction, double, double)
    
    /**
    @utbot.classUnderTest {@link NonLinearConjugateGradientOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer#findUpperBound(org.apache.commons.math3.analysis.UnivariateFunction,double,double)}
 * @utbot.invokes {@link org.apache.commons.math3.analysis.UnivariateFunction#value(double)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: final double yA = f.value(a);
 *  */
    @Test
    public void testFindUpperBound_ThrowNullPointerException() throws Throwable  {
        NonLinearConjugateGradientOptimizer nonLinearConjugateGradientOptimizer = ((NonLinearConjugateGradientOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer"));
        
        /* This test fails because method [org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.findUpperBound] produces [java.lang.NullPointerException]
            org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.findUpperBound(NonLinearConjugateGradientOptimizer.java:330) */
        Class nonLinearConjugateGradientOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer");
        Class univariateFunctionType = Class.forName("org.apache.commons.math3.analysis.UnivariateFunction");
        Class doubleType = double.class;
        Method findUpperBoundMethod = nonLinearConjugateGradientOptimizerClazz.getDeclaredMethod("findUpperBound", univariateFunctionType, doubleType, doubleType);
        findUpperBoundMethod.setAccessible(true);
        java.lang.Object[] findUpperBoundMethodArguments = new java.lang.Object[3];
        findUpperBoundMethodArguments[0] = ((Object) null);
        findUpperBoundMethodArguments[1] = java.lang.Double.NaN;
        findUpperBoundMethodArguments[2] = java.lang.Double.NaN;
        try {
            findUpperBoundMethod.invoke(nonLinearConjugateGradientOptimizer, findUpperBoundMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method findUpperBound(org.apache.commons.math3.analysis.UnivariateFunction, double, double)
    
    /**
    @utbot.classUnderTest {@link NonLinearConjugateGradientOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer#findUpperBound(org.apache.commons.math3.analysis.UnivariateFunction,double,double)}
 * @utbot.throwsException {@link org.apache.commons.math3.exception.MathIllegalStateException} in: throw new MathIllegalStateException(LocalizedFormats.UNABLE_TO_BRACKET_OPTIMUM_IN_LINE_SEARCH);
 *  */
    @Test(expected = MathIllegalStateException.class)
    public void testFindUpperBound_ThrowMathIllegalStateException() throws Throwable  {
        NonLinearConjugateGradientOptimizer nonLinearConjugateGradientOptimizer = ((NonLinearConjugateGradientOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer"));
        Acos acos = new Acos();
        
        Class nonLinearConjugateGradientOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer");
        Class acosType = Class.forName("org.apache.commons.math3.analysis.UnivariateFunction");
        Class doubleType = double.class;
        Method findUpperBoundMethod = nonLinearConjugateGradientOptimizerClazz.getDeclaredMethod("findUpperBound", acosType, doubleType, doubleType);
        findUpperBoundMethod.setAccessible(true);
        java.lang.Object[] findUpperBoundMethodArguments = new java.lang.Object[3];
        findUpperBoundMethodArguments[0] = acos;
        findUpperBoundMethodArguments[1] = -2.0000000000000004;
        findUpperBoundMethodArguments[2] = 1.7976931348623157E308;
        try {
            findUpperBoundMethod.invoke(nonLinearConjugateGradientOptimizer, findUpperBoundMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link NonLinearConjugateGradientOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer#findUpperBound(org.apache.commons.math3.analysis.UnivariateFunction,double,double)}
 * @utbot.throwsException {@link org.apache.commons.math3.exception.MathIllegalStateException} in: throw new MathIllegalStateException(LocalizedFormats.UNABLE_TO_BRACKET_OPTIMUM_IN_LINE_SEARCH);
 *  */
    @Test(expected = MathIllegalStateException.class)
    public void testFindUpperBound_ThrowMathIllegalStateException_1() throws Throwable  {
        NonLinearConjugateGradientOptimizer nonLinearConjugateGradientOptimizer = ((NonLinearConjugateGradientOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer"));
        Acos acos = new Acos();
        
        Class nonLinearConjugateGradientOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer");
        Class acosType = Class.forName("org.apache.commons.math3.analysis.UnivariateFunction");
        Class doubleType = double.class;
        Method findUpperBoundMethod = nonLinearConjugateGradientOptimizerClazz.getDeclaredMethod("findUpperBound", acosType, doubleType, doubleType);
        findUpperBoundMethod.setAccessible(true);
        java.lang.Object[] findUpperBoundMethodArguments = new java.lang.Object[3];
        findUpperBoundMethodArguments[0] = acos;
        findUpperBoundMethodArguments[1] = java.lang.Double.NaN;
        findUpperBoundMethodArguments[2] = 1.7976931348623157E308;
        try {
            findUpperBoundMethod.invoke(nonLinearConjugateGradientOptimizer, findUpperBoundMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link NonLinearConjugateGradientOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer#findUpperBound(org.apache.commons.math3.analysis.UnivariateFunction,double,double)}
 * @utbot.throwsException {@link org.apache.commons.math3.exception.MathIllegalStateException} in: throw new MathIllegalStateException(LocalizedFormats.UNABLE_TO_BRACKET_OPTIMUM_IN_LINE_SEARCH);
 *  */
    @Test(expected = MathIllegalStateException.class)
    public void testFindUpperBound_ThrowMathIllegalStateException_2() throws Throwable  {
        NonLinearConjugateGradientOptimizer nonLinearConjugateGradientOptimizer = ((NonLinearConjugateGradientOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer"));
        Identity identity = new Identity();
        
        Class nonLinearConjugateGradientOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer");
        Class identityType = Class.forName("org.apache.commons.math3.analysis.UnivariateFunction");
        Class doubleType = double.class;
        Method findUpperBoundMethod = nonLinearConjugateGradientOptimizerClazz.getDeclaredMethod("findUpperBound", identityType, doubleType, doubleType);
        findUpperBoundMethod.setAccessible(true);
        java.lang.Object[] findUpperBoundMethodArguments = new java.lang.Object[3];
        findUpperBoundMethodArguments[0] = identity;
        findUpperBoundMethodArguments[1] = java.lang.Double.NaN;
        findUpperBoundMethodArguments[2] = 1.7976931348623157E308;
        try {
            findUpperBoundMethod.invoke(nonLinearConjugateGradientOptimizer, findUpperBoundMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method findUpperBound(org.apache.commons.math3.analysis.UnivariateFunction, double, double)
    
    @Test
    public void testFindUpperBound1() throws Exception  {
        NonLinearConjugateGradientOptimizer nonLinearConjugateGradientOptimizer = ((NonLinearConjugateGradientOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer"));
        Acos acos = new Acos();
        
        Class nonLinearConjugateGradientOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer");
        Class acosType = Class.forName("org.apache.commons.math3.analysis.UnivariateFunction");
        Class doubleType = double.class;
        Method findUpperBoundMethod = nonLinearConjugateGradientOptimizerClazz.getDeclaredMethod("findUpperBound", acosType, doubleType, doubleType);
        findUpperBoundMethod.setAccessible(true);
        java.lang.Object[] findUpperBoundMethodArguments = new java.lang.Object[3];
        findUpperBoundMethodArguments[0] = acos;
        findUpperBoundMethodArguments[1] = 1.0;
        findUpperBoundMethodArguments[2] = -5.820766091346746E-11;
        double actual = ((Double) findUpperBoundMethod.invoke(nonLinearConjugateGradientOptimizer, findUpperBoundMethodArguments));
        
        assertEquals(0.9999999999417923, actual, 1.0E-6);
    }
    
    @Test
    public void testFindUpperBound2() throws Exception  {
        NonLinearConjugateGradientOptimizer nonLinearConjugateGradientOptimizer = ((NonLinearConjugateGradientOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer"));
        Acos acos = new Acos();
        
        Class nonLinearConjugateGradientOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer");
        Class acosType = Class.forName("org.apache.commons.math3.analysis.UnivariateFunction");
        Class doubleType = double.class;
        Method findUpperBoundMethod = nonLinearConjugateGradientOptimizerClazz.getDeclaredMethod("findUpperBound", acosType, doubleType, doubleType);
        findUpperBoundMethod.setAccessible(true);
        java.lang.Object[] findUpperBoundMethodArguments = new java.lang.Object[3];
        findUpperBoundMethodArguments[0] = acos;
        findUpperBoundMethodArguments[1] = 1.0;
        findUpperBoundMethodArguments[2] = -1.0;
        double actual = ((Double) findUpperBoundMethod.invoke(nonLinearConjugateGradientOptimizer, findUpperBoundMethodArguments));
        
        assertEquals(0.0, actual, 1.0E-6);
    }
    
    @Test
    public void testFindUpperBound3() throws Exception  {
        NonLinearConjugateGradientOptimizer nonLinearConjugateGradientOptimizer = ((NonLinearConjugateGradientOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer"));
        Acos acos = new Acos();
        
        Class nonLinearConjugateGradientOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer");
        Class acosType = Class.forName("org.apache.commons.math3.analysis.UnivariateFunction");
        Class doubleType = double.class;
        Method findUpperBoundMethod = nonLinearConjugateGradientOptimizerClazz.getDeclaredMethod("findUpperBound", acosType, doubleType, doubleType);
        findUpperBoundMethod.setAccessible(true);
        java.lang.Object[] findUpperBoundMethodArguments = new java.lang.Object[3];
        findUpperBoundMethodArguments[0] = acos;
        findUpperBoundMethodArguments[1] = -1.0;
        findUpperBoundMethodArguments[2] = 1.0;
        double actual = ((Double) findUpperBoundMethod.invoke(nonLinearConjugateGradientOptimizer, findUpperBoundMethodArguments));
        
        assertEquals(1.0, actual, 1.0E-6);
    }
    
    @Test
    public void testFindUpperBound4() throws Exception  {
        NonLinearConjugateGradientOptimizer nonLinearConjugateGradientOptimizer = ((NonLinearConjugateGradientOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer"));
        Acos acos = new Acos();
        
        Class nonLinearConjugateGradientOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer");
        Class acosType = Class.forName("org.apache.commons.math3.analysis.UnivariateFunction");
        Class doubleType = double.class;
        Method findUpperBoundMethod = nonLinearConjugateGradientOptimizerClazz.getDeclaredMethod("findUpperBound", acosType, doubleType, doubleType);
        findUpperBoundMethod.setAccessible(true);
        java.lang.Object[] findUpperBoundMethodArguments = new java.lang.Object[3];
        findUpperBoundMethodArguments[0] = acos;
        findUpperBoundMethodArguments[1] = 1.0;
        findUpperBoundMethodArguments[2] = -2.0;
        double actual = ((Double) findUpperBoundMethod.invoke(nonLinearConjugateGradientOptimizer, findUpperBoundMethodArguments));
        
        assertEquals(-1.0, actual, 1.0E-6);
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method findUpperBound(org.apache.commons.math3.analysis.UnivariateFunction, double, double)
    
    @Test(expected = MathIllegalStateException.class)
    public void testFindUpperBound5() throws Throwable  {
        NonLinearConjugateGradientOptimizer nonLinearConjugateGradientOptimizer = ((NonLinearConjugateGradientOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer"));
        Acos acos = new Acos();
        
        Class nonLinearConjugateGradientOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer");
        Class acosType = Class.forName("org.apache.commons.math3.analysis.UnivariateFunction");
        Class doubleType = double.class;
        Method findUpperBoundMethod = nonLinearConjugateGradientOptimizerClazz.getDeclaredMethod("findUpperBound", acosType, doubleType, doubleType);
        findUpperBoundMethod.setAccessible(true);
        java.lang.Object[] findUpperBoundMethodArguments = new java.lang.Object[3];
        findUpperBoundMethodArguments[0] = acos;
        findUpperBoundMethodArguments[1] = -1.183349609375;
        findUpperBoundMethodArguments[2] = 0.43334960937499983;
        try {
            findUpperBoundMethod.invoke(nonLinearConjugateGradientOptimizer, findUpperBoundMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = MathIllegalStateException.class)
    public void testFindUpperBound6() throws Throwable  {
        NonLinearConjugateGradientOptimizer nonLinearConjugateGradientOptimizer = ((NonLinearConjugateGradientOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer"));
        Acos acos = new Acos();
        
        Class nonLinearConjugateGradientOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer");
        Class acosType = Class.forName("org.apache.commons.math3.analysis.UnivariateFunction");
        Class doubleType = double.class;
        Method findUpperBoundMethod = nonLinearConjugateGradientOptimizerClazz.getDeclaredMethod("findUpperBound", acosType, doubleType, doubleType);
        findUpperBoundMethod.setAccessible(true);
        java.lang.Object[] findUpperBoundMethodArguments = new java.lang.Object[3];
        findUpperBoundMethodArguments[0] = acos;
        findUpperBoundMethodArguments[1] = -0.0;
        findUpperBoundMethodArguments[2] = -4.9E-324;
        try {
            findUpperBoundMethod.invoke(nonLinearConjugateGradientOptimizer, findUpperBoundMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = MathIllegalStateException.class)
    public void testFindUpperBound7() throws Throwable  {
        NonLinearConjugateGradientOptimizer nonLinearConjugateGradientOptimizer = ((NonLinearConjugateGradientOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer"));
        Acos acos = new Acos();
        
        Class nonLinearConjugateGradientOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer");
        Class acosType = Class.forName("org.apache.commons.math3.analysis.UnivariateFunction");
        Class doubleType = double.class;
        Method findUpperBoundMethod = nonLinearConjugateGradientOptimizerClazz.getDeclaredMethod("findUpperBound", acosType, doubleType, doubleType);
        findUpperBoundMethod.setAccessible(true);
        java.lang.Object[] findUpperBoundMethodArguments = new java.lang.Object[3];
        findUpperBoundMethodArguments[0] = acos;
        findUpperBoundMethodArguments[1] = 1.0;
        findUpperBoundMethodArguments[2] = 73727.0146522522;
        try {
            findUpperBoundMethod.invoke(nonLinearConjugateGradientOptimizer, findUpperBoundMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = MathIllegalStateException.class)
    public void testFindUpperBound8() throws Throwable  {
        NonLinearConjugateGradientOptimizer nonLinearConjugateGradientOptimizer = ((NonLinearConjugateGradientOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer"));
        Acos acos = new Acos();
        
        Class nonLinearConjugateGradientOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer");
        Class acosType = Class.forName("org.apache.commons.math3.analysis.UnivariateFunction");
        Class doubleType = double.class;
        Method findUpperBoundMethod = nonLinearConjugateGradientOptimizerClazz.getDeclaredMethod("findUpperBound", acosType, doubleType, doubleType);
        findUpperBoundMethod.setAccessible(true);
        java.lang.Object[] findUpperBoundMethodArguments = new java.lang.Object[3];
        findUpperBoundMethodArguments[0] = acos;
        findUpperBoundMethodArguments[1] = 1.001586914077338;
        findUpperBoundMethodArguments[2] = -0.9995112434261971;
        try {
            findUpperBoundMethod.invoke(nonLinearConjugateGradientOptimizer, findUpperBoundMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = MathIllegalStateException.class)
    public void testFindUpperBound9() throws Throwable  {
        NonLinearConjugateGradientOptimizer nonLinearConjugateGradientOptimizer = ((NonLinearConjugateGradientOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer"));
        Acos acos = new Acos();
        
        Class nonLinearConjugateGradientOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer");
        Class acosType = Class.forName("org.apache.commons.math3.analysis.UnivariateFunction");
        Class doubleType = double.class;
        Method findUpperBoundMethod = nonLinearConjugateGradientOptimizerClazz.getDeclaredMethod("findUpperBound", acosType, doubleType, doubleType);
        findUpperBoundMethod.setAccessible(true);
        java.lang.Object[] findUpperBoundMethodArguments = new java.lang.Object[3];
        findUpperBoundMethodArguments[0] = acos;
        findUpperBoundMethodArguments[1] = java.lang.Double.POSITIVE_INFINITY;
        findUpperBoundMethodArguments[2] = java.lang.Double.NEGATIVE_INFINITY;
        try {
            findUpperBoundMethod.invoke(nonLinearConjugateGradientOptimizer, findUpperBoundMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = MathIllegalStateException.class)
    public void testFindUpperBound10() throws Throwable  {
        NonLinearConjugateGradientOptimizer nonLinearConjugateGradientOptimizer = ((NonLinearConjugateGradientOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer"));
        Acos acos = new Acos();
        
        Class nonLinearConjugateGradientOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer");
        Class acosType = Class.forName("org.apache.commons.math3.analysis.UnivariateFunction");
        Class doubleType = double.class;
        Method findUpperBoundMethod = nonLinearConjugateGradientOptimizerClazz.getDeclaredMethod("findUpperBound", acosType, doubleType, doubleType);
        findUpperBoundMethod.setAccessible(true);
        java.lang.Object[] findUpperBoundMethodArguments = new java.lang.Object[3];
        findUpperBoundMethodArguments[0] = acos;
        findUpperBoundMethodArguments[1] = java.lang.Double.NaN;
        findUpperBoundMethodArguments[2] = -4.9E-324;
        try {
            findUpperBoundMethod.invoke(nonLinearConjugateGradientOptimizer, findUpperBoundMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.checkParameters
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method checkParameters()
    
    /**
    @utbot.classUnderTest {@link NonLinearConjugateGradientOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer#checkParameters()}
 * @utbot.executesCondition {@code (getLowerBound() != null): False}
 * @utbot.executesCondition {@code (getUpperBound() != null): False}
 * @utbot.invokes {@link org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer#getLowerBound()}
 * @utbot.invokes {@link org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer#getUpperBound()}
 *  */
    @Test
    public void testCheckParameters_GetUpperBoundEqualsNull() throws Exception  {
        NonLinearConjugateGradientOptimizer nonLinearConjugateGradientOptimizer = ((NonLinearConjugateGradientOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer"));
        
        Class nonLinearConjugateGradientOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer");
        Method checkParametersMethod = nonLinearConjugateGradientOptimizerClazz.getDeclaredMethod("checkParameters");
        checkParametersMethod.setAccessible(true);
        java.lang.Object[] checkParametersMethodArguments = new java.lang.Object[0];
        checkParametersMethod.invoke(nonLinearConjugateGradientOptimizer, checkParametersMethodArguments);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method checkParameters()
    
    /**
    @utbot.classUnderTest {@link NonLinearConjugateGradientOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer#checkParameters()}
 * @utbot.executesCondition {@code (getLowerBound() != null): True}
 * @utbot.throwsException {@link org.apache.commons.math3.exception.MathUnsupportedOperationException} when: getLowerBound() != null || getUpperBound() != null
 *  */
    @Test(expected = MathUnsupportedOperationException.class)
    public void testCheckParameters_ThrowMathUnsupportedOperationException() throws Throwable  {
        NonLinearConjugateGradientOptimizer nonLinearConjugateGradientOptimizer = ((NonLinearConjugateGradientOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer"));
        double[] lowerBound = {};
        setField(nonLinearConjugateGradientOptimizer, "org.apache.commons.math3.optim.BaseMultivariateOptimizer", "lowerBound", lowerBound);
        
        Class nonLinearConjugateGradientOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer");
        Method checkParametersMethod = nonLinearConjugateGradientOptimizerClazz.getDeclaredMethod("checkParameters");
        checkParametersMethod.setAccessible(true);
        java.lang.Object[] checkParametersMethodArguments = new java.lang.Object[0];
        try {
            checkParametersMethod.invoke(nonLinearConjugateGradientOptimizer, checkParametersMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link NonLinearConjugateGradientOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer#checkParameters()}
 * @utbot.executesCondition {@code (getLowerBound() != null): False}
 * @utbot.executesCondition {@code (getUpperBound() != null): True}
 * @utbot.invokes {@link org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer#getUpperBound()}
 * @utbot.throwsException {@link org.apache.commons.math3.exception.MathUnsupportedOperationException} when: getLowerBound() != null || getUpperBound() != null
 *  */
    @Test(expected = MathUnsupportedOperationException.class)
    public void testCheckParameters_ThrowMathUnsupportedOperationException_1() throws Throwable  {
        NonLinearConjugateGradientOptimizer nonLinearConjugateGradientOptimizer = ((NonLinearConjugateGradientOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer"));
        double[] upperBound = {};
        setField(nonLinearConjugateGradientOptimizer, "org.apache.commons.math3.optim.BaseMultivariateOptimizer", "upperBound", upperBound);
        
        Class nonLinearConjugateGradientOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer");
        Method checkParametersMethod = nonLinearConjugateGradientOptimizerClazz.getDeclaredMethod("checkParameters");
        checkParametersMethod.setAccessible(true);
        java.lang.Object[] checkParametersMethodArguments = new java.lang.Object[0];
        try {
            checkParametersMethod.invoke(nonLinearConjugateGradientOptimizer, checkParametersMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.parseOptimizationData
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method parseOptimizationData([Lorg.apache.commons.math3.optim.OptimizationData;)
    
    /**
    @utbot.classUnderTest {@link NonLinearConjugateGradientOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer#parseOptimizationData(org.apache.commons.math3.optim.OptimizationData[])}
 *  */
    @Test
    public void testParseOptimizationData_1() throws Exception  {
        NonLinearConjugateGradientOptimizer nonLinearConjugateGradientOptimizer = ((NonLinearConjugateGradientOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer"));
        double[] start = {0.0};
        setField(nonLinearConjugateGradientOptimizer, "org.apache.commons.math3.optim.BaseMultivariateOptimizer", "start", start);
        org.apache.commons.math3.optim.OptimizationData[] optimizationDataArray = {};
        
        nonLinearConjugateGradientOptimizer.parseOptimizationData(optimizationDataArray);
    }
    
    /**
    @utbot.classUnderTest {@link NonLinearConjugateGradientOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer#parseOptimizationData(org.apache.commons.math3.optim.OptimizationData[])}
 *  */
    @Test
    public void testParseOptimizationData() throws Exception  {
        NonLinearConjugateGradientOptimizer nonLinearConjugateGradientOptimizer = ((NonLinearConjugateGradientOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer"));
        org.apache.commons.math3.optim.OptimizationData[] optimizationDataArray = {};
        
        nonLinearConjugateGradientOptimizer.parseOptimizationData(optimizationDataArray);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method parseOptimizationData([Lorg.apache.commons.math3.optim.OptimizationData;)
    
    /**
    @utbot.classUnderTest {@link NonLinearConjugateGradientOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer#parseOptimizationData(org.apache.commons.math3.optim.OptimizationData[])}
 * @utbot.throwsException {@link org.apache.commons.math3.exception.NumberIsTooSmallException} in: super.parseOptimizationData(optData);
 *  */
    @Test(expected = NumberIsTooSmallException.class)
    public void testParseOptimizationData_ThrowNumberIsTooSmallException() throws Exception  {
        NonLinearConjugateGradientOptimizer nonLinearConjugateGradientOptimizer = ((NonLinearConjugateGradientOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer"));
        double[] start = {-1.49196970922936E87};
        setField(nonLinearConjugateGradientOptimizer, "org.apache.commons.math3.optim.BaseMultivariateOptimizer", "start", start);
        double[] lowerBound = {6.947525354238973E77};
        setField(nonLinearConjugateGradientOptimizer, "org.apache.commons.math3.optim.BaseMultivariateOptimizer", "lowerBound", lowerBound);
        org.apache.commons.math3.optim.OptimizationData[] optimizationDataArray = {null};
        
        nonLinearConjugateGradientOptimizer.parseOptimizationData(optimizationDataArray);
    }
    
    /**
    @utbot.classUnderTest {@link NonLinearConjugateGradientOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer#parseOptimizationData(org.apache.commons.math3.optim.OptimizationData[])}
 * @utbot.throwsException {@link org.apache.commons.math3.exception.DimensionMismatchException} in: super.parseOptimizationData(optData);
 *  */
    @Test(expected = DimensionMismatchException.class)
    public void testParseOptimizationData_ThrowDimensionMismatchException_2() throws Exception  {
        NonLinearConjugateGradientOptimizer nonLinearConjugateGradientOptimizer = ((NonLinearConjugateGradientOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer"));
        double[] start = {0.0, 0.0};
        setField(nonLinearConjugateGradientOptimizer, "org.apache.commons.math3.optim.BaseMultivariateOptimizer", "start", start);
        double[] lowerBound = {0.0};
        setField(nonLinearConjugateGradientOptimizer, "org.apache.commons.math3.optim.BaseMultivariateOptimizer", "lowerBound", lowerBound);
        org.apache.commons.math3.optim.OptimizationData[] optimizationDataArray = {};
        
        nonLinearConjugateGradientOptimizer.parseOptimizationData(optimizationDataArray);
    }
    
    /**
    @utbot.classUnderTest {@link NonLinearConjugateGradientOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer#parseOptimizationData(org.apache.commons.math3.optim.OptimizationData[])}
 * @utbot.throwsException {@link org.apache.commons.math3.exception.DimensionMismatchException} in: super.parseOptimizationData(optData);
 *  */
    @Test(expected = DimensionMismatchException.class)
    public void testParseOptimizationData_ThrowDimensionMismatchException_1() throws Exception  {
        NonLinearConjugateGradientOptimizer nonLinearConjugateGradientOptimizer = ((NonLinearConjugateGradientOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer"));
        double[] start = {2.232397249117964E-103};
        setField(nonLinearConjugateGradientOptimizer, "org.apache.commons.math3.optim.BaseMultivariateOptimizer", "start", start);
        double[] lowerBound = {2.232397249117964E-103};
        setField(nonLinearConjugateGradientOptimizer, "org.apache.commons.math3.optim.BaseMultivariateOptimizer", "lowerBound", lowerBound);
        double[] upperBound = {0.0, 0.0};
        setField(nonLinearConjugateGradientOptimizer, "org.apache.commons.math3.optim.BaseMultivariateOptimizer", "upperBound", upperBound);
        org.apache.commons.math3.optim.OptimizationData[] optimizationDataArray = {null};
        
        nonLinearConjugateGradientOptimizer.parseOptimizationData(optimizationDataArray);
    }
    
    /**
    @utbot.classUnderTest {@link NonLinearConjugateGradientOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer#parseOptimizationData(org.apache.commons.math3.optim.OptimizationData[])}
 * @utbot.throwsException {@link org.apache.commons.math3.exception.MathUnsupportedOperationException} in: checkParameters();
 *  */
    @Test(expected = MathUnsupportedOperationException.class)
    public void testParseOptimizationData_ThrowMathUnsupportedOperationException_3() throws Exception  {
        NonLinearConjugateGradientOptimizer nonLinearConjugateGradientOptimizer = ((NonLinearConjugateGradientOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer"));
        double[] lowerBound = {};
        setField(nonLinearConjugateGradientOptimizer, "org.apache.commons.math3.optim.BaseMultivariateOptimizer", "lowerBound", lowerBound);
        org.apache.commons.math3.optim.OptimizationData[] optimizationDataArray = {};
        
        nonLinearConjugateGradientOptimizer.parseOptimizationData(optimizationDataArray);
    }
    
    /**
    @utbot.classUnderTest {@link NonLinearConjugateGradientOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer#parseOptimizationData(org.apache.commons.math3.optim.OptimizationData[])}
 * @utbot.throwsException {@link org.apache.commons.math3.exception.MathUnsupportedOperationException} in: checkParameters();
 *  */
    @Test(expected = MathUnsupportedOperationException.class)
    public void testParseOptimizationData_ThrowMathUnsupportedOperationException_4() throws Exception  {
        NonLinearConjugateGradientOptimizer nonLinearConjugateGradientOptimizer = ((NonLinearConjugateGradientOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer"));
        double[] start = {};
        setField(nonLinearConjugateGradientOptimizer, "org.apache.commons.math3.optim.BaseMultivariateOptimizer", "start", start);
        double[] lowerBound = {};
        setField(nonLinearConjugateGradientOptimizer, "org.apache.commons.math3.optim.BaseMultivariateOptimizer", "lowerBound", lowerBound);
        double[] upperBound = {};
        setField(nonLinearConjugateGradientOptimizer, "org.apache.commons.math3.optim.BaseMultivariateOptimizer", "upperBound", upperBound);
        org.apache.commons.math3.optim.OptimizationData[] optimizationDataArray = {};
        
        nonLinearConjugateGradientOptimizer.parseOptimizationData(optimizationDataArray);
    }
    
    /**
    @utbot.classUnderTest {@link NonLinearConjugateGradientOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer#parseOptimizationData(org.apache.commons.math3.optim.OptimizationData[])}
 * @utbot.throwsException {@link org.apache.commons.math3.exception.NumberIsTooSmallException} in: super.parseOptimizationData(optData);
 *  */
    @Test(expected = NumberIsTooSmallException.class)
    public void testParseOptimizationData_ThrowNumberIsTooSmallException_1() throws Exception  {
        NonLinearConjugateGradientOptimizer nonLinearConjugateGradientOptimizer = ((NonLinearConjugateGradientOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer"));
        double[] start = {-1.1104624383844765E30};
        setField(nonLinearConjugateGradientOptimizer, "org.apache.commons.math3.optim.BaseMultivariateOptimizer", "start", start);
        double[] lowerBound = {3.9129891640452305E-249};
        setField(nonLinearConjugateGradientOptimizer, "org.apache.commons.math3.optim.BaseMultivariateOptimizer", "lowerBound", lowerBound);
        Incrementor evaluations = ((Incrementor) createInstance("org.apache.commons.math3.util.Incrementor"));
        evaluations.setMaximalCount(-255);
        setField(nonLinearConjugateGradientOptimizer, "org.apache.commons.math3.optim.BaseOptimizer", "evaluations", evaluations);
        org.apache.commons.math3.optim.OptimizationData[] optimizationDataArray = new org.apache.commons.math3.optim.OptimizationData[1];
        MaxEval maxEval = ((MaxEval) createInstance("org.apache.commons.math3.optim.MaxEval"));
        optimizationDataArray[0] = ((OptimizationData) maxEval);
        
        nonLinearConjugateGradientOptimizer.parseOptimizationData(optimizationDataArray);
    }
    
    /**
    @utbot.classUnderTest {@link NonLinearConjugateGradientOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer#parseOptimizationData(org.apache.commons.math3.optim.OptimizationData[])}
 * @utbot.throwsException {@link org.apache.commons.math3.exception.NumberIsTooLargeException} in: super.parseOptimizationData(optData);
 *  */
    @Test(expected = NumberIsTooLargeException.class)
    public void testParseOptimizationData_ThrowNumberIsTooLargeException() throws Exception  {
        NonLinearConjugateGradientOptimizer nonLinearConjugateGradientOptimizer = ((NonLinearConjugateGradientOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer"));
        double[] start = {1.0118E-320, 128.0001220703125};
        setField(nonLinearConjugateGradientOptimizer, "org.apache.commons.math3.optim.BaseMultivariateOptimizer", "start", start);
        double[] upperBound = {1.0118E-320, -8.900303922011971E-308};
        setField(nonLinearConjugateGradientOptimizer, "org.apache.commons.math3.optim.BaseMultivariateOptimizer", "upperBound", upperBound);
        org.apache.commons.math3.optim.OptimizationData[] optimizationDataArray = {};
        
        nonLinearConjugateGradientOptimizer.parseOptimizationData(optimizationDataArray);
    }
    
    /**
    @utbot.classUnderTest {@link NonLinearConjugateGradientOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer#parseOptimizationData(org.apache.commons.math3.optim.OptimizationData[])}
 * @utbot.throwsException {@link org.apache.commons.math3.exception.DimensionMismatchException} in: super.parseOptimizationData(optData);
 *  */
    @Test(expected = DimensionMismatchException.class)
    public void testParseOptimizationData_ThrowDimensionMismatchException() throws Exception  {
        NonLinearConjugateGradientOptimizer nonLinearConjugateGradientOptimizer = ((NonLinearConjugateGradientOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer"));
        double[] start = {0.0};
        setField(nonLinearConjugateGradientOptimizer, "org.apache.commons.math3.optim.BaseMultivariateOptimizer", "start", start);
        org.apache.commons.math3.optim.OptimizationData[] optimizationDataArray = new org.apache.commons.math3.optim.OptimizationData[1];
        SimpleBounds simpleBounds = ((SimpleBounds) createInstance("org.apache.commons.math3.optim.SimpleBounds"));
        double[] lower = {};
        setField(simpleBounds, "org.apache.commons.math3.optim.SimpleBounds", "lower", lower);
        double[] upper = {7.291122019558055E-304, 0.0};
        setField(simpleBounds, "org.apache.commons.math3.optim.SimpleBounds", "upper", upper);
        optimizationDataArray[0] = ((OptimizationData) simpleBounds);
        
        nonLinearConjugateGradientOptimizer.parseOptimizationData(optimizationDataArray);
    }
    
    /**
    @utbot.classUnderTest {@link NonLinearConjugateGradientOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer#parseOptimizationData(org.apache.commons.math3.optim.OptimizationData[])}
 * @utbot.iterates iterate the loop {@code for(OptimizationData data: optData)} once
 * @utbot.throwsException {@link org.apache.commons.math3.exception.MathUnsupportedOperationException} in: checkParameters();
 *  */
    @Test(expected = MathUnsupportedOperationException.class)
    public void testParseOptimizationData_ThrowMathUnsupportedOperationException() throws Exception  {
        NonLinearConjugateGradientOptimizer nonLinearConjugateGradientOptimizer = ((NonLinearConjugateGradientOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer"));
        double[] lowerBound = {};
        setField(nonLinearConjugateGradientOptimizer, "org.apache.commons.math3.optim.BaseMultivariateOptimizer", "lowerBound", lowerBound);
        org.apache.commons.math3.optim.OptimizationData[] optimizationDataArray = new org.apache.commons.math3.optim.OptimizationData[1];
        ObjectiveFunction objectiveFunction = new ObjectiveFunction(null);
        optimizationDataArray[0] = ((OptimizationData) objectiveFunction);
        
        nonLinearConjugateGradientOptimizer.parseOptimizationData(optimizationDataArray);
    }
    
    /**
    @utbot.classUnderTest {@link NonLinearConjugateGradientOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer#parseOptimizationData(org.apache.commons.math3.optim.OptimizationData[])}
 * @utbot.throwsException {@link org.apache.commons.math3.exception.MathUnsupportedOperationException} in: checkParameters();
 *  */
    @Test(expected = MathUnsupportedOperationException.class)
    public void testParseOptimizationData_ThrowMathUnsupportedOperationException_2() throws Exception  {
        NonLinearConjugateGradientOptimizer nonLinearConjugateGradientOptimizer = ((NonLinearConjugateGradientOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer"));
        double[] upperBound = {1.2882297539197196E-231};
        setField(nonLinearConjugateGradientOptimizer, "org.apache.commons.math3.optim.BaseMultivariateOptimizer", "upperBound", upperBound);
        org.apache.commons.math3.optim.OptimizationData[] optimizationDataArray = {};
        
        nonLinearConjugateGradientOptimizer.parseOptimizationData(optimizationDataArray);
    }
    
    /**
    @utbot.classUnderTest {@link NonLinearConjugateGradientOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer#parseOptimizationData(org.apache.commons.math3.optim.OptimizationData[])}
 * @utbot.iterates iterate the loop {@code for(OptimizationData data: optData)} once
 * @utbot.throwsException {@link org.apache.commons.math3.exception.MathUnsupportedOperationException} in: checkParameters();
 *  */
    @Test(expected = MathUnsupportedOperationException.class)
    public void testParseOptimizationData_ThrowMathUnsupportedOperationException_1() throws Exception  {
        NonLinearConjugateGradientOptimizer nonLinearConjugateGradientOptimizer = ((NonLinearConjugateGradientOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer"));
        double[] start = {};
        setField(nonLinearConjugateGradientOptimizer, "org.apache.commons.math3.optim.BaseMultivariateOptimizer", "start", start);
        double[] lowerBound = {};
        setField(nonLinearConjugateGradientOptimizer, "org.apache.commons.math3.optim.BaseMultivariateOptimizer", "lowerBound", lowerBound);
        org.apache.commons.math3.optim.OptimizationData[] optimizationDataArray = new org.apache.commons.math3.optim.OptimizationData[1];
        ObjectiveFunctionGradient objectiveFunctionGradient = new ObjectiveFunctionGradient(null);
        optimizationDataArray[0] = ((OptimizationData) objectiveFunctionGradient);
        
        nonLinearConjugateGradientOptimizer.parseOptimizationData(optimizationDataArray);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method parseOptimizationData([Lorg.apache.commons.math3.optim.OptimizationData;)
    
    @Test
    public void testParseOptimizationData1() throws Exception  {
        NonLinearConjugateGradientOptimizer nonLinearConjugateGradientOptimizer = ((NonLinearConjugateGradientOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer"));
        org.apache.commons.math3.optim.OptimizationData[] optimizationDataArray = {null};
        
        nonLinearConjugateGradientOptimizer.parseOptimizationData(optimizationDataArray);
        
        OptimizationData finalOptimizationDataArray0 = optimizationDataArray[0];
        
        assertNull(finalOptimizationDataArray0);
    }
    
    @Test
    public void testParseOptimizationData2() throws Exception  {
        NonLinearConjugateGradientOptimizer nonLinearConjugateGradientOptimizer = ((NonLinearConjugateGradientOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer"));
        setField(nonLinearConjugateGradientOptimizer, "org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer", "initialStep", java.lang.Double.NaN);
        double[] start = {
            0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0
        };
        setField(nonLinearConjugateGradientOptimizer, "org.apache.commons.math3.optim.BaseMultivariateOptimizer", "start", start);
        org.apache.commons.math3.optim.OptimizationData[] optimizationDataArray = new org.apache.commons.math3.optim.OptimizationData[1];
        NonLinearConjugateGradientOptimizer.BracketingStep bracketingStep = new NonLinearConjugateGradientOptimizer.BracketingStep(java.lang.Double.NaN);
        optimizationDataArray[0] = ((OptimizationData) bracketingStep);
        
        nonLinearConjugateGradientOptimizer.parseOptimizationData(optimizationDataArray);
    }
    
    @Test
    public void testParseOptimizationData3() throws Exception  {
        NonLinearConjugateGradientOptimizer nonLinearConjugateGradientOptimizer = ((NonLinearConjugateGradientOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer"));
        double[] start = {
            java.lang.Double.NaN, java.lang.Double.NaN, java.lang.Double.NaN, java.lang.Double.NaN, java.lang.Double.NaN, java.lang.Double.NaN,
            java.lang.Double.NaN, java.lang.Double.NaN, java.lang.Double.NaN
        };
        setField(nonLinearConjugateGradientOptimizer, "org.apache.commons.math3.optim.BaseMultivariateOptimizer", "start", start);
        Incrementor iterations = ((Incrementor) createInstance("org.apache.commons.math3.util.Incrementor"));
        setField(nonLinearConjugateGradientOptimizer, "org.apache.commons.math3.optim.BaseOptimizer", "iterations", iterations);
        org.apache.commons.math3.optim.OptimizationData[] optimizationDataArray = new org.apache.commons.math3.optim.OptimizationData[1];
        MaxIter maxIter = ((MaxIter) createInstance("org.apache.commons.math3.optim.MaxIter"));
        optimizationDataArray[0] = ((OptimizationData) maxIter);
        
        nonLinearConjugateGradientOptimizer.parseOptimizationData(optimizationDataArray);
    }
    
    @Test
    public void testParseOptimizationData4() throws Exception  {
        NonLinearConjugateGradientOptimizer nonLinearConjugateGradientOptimizer = ((NonLinearConjugateGradientOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer"));
        double[] start = {
            0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0
        };
        setField(nonLinearConjugateGradientOptimizer, "org.apache.commons.math3.optim.BaseMultivariateOptimizer", "start", start);
        org.apache.commons.math3.optim.OptimizationData[] optimizationDataArray = new org.apache.commons.math3.optim.OptimizationData[1];
        GoalType goalType = GoalType.MINIMIZE;
        optimizationDataArray[0] = ((OptimizationData) goalType);
        
        GoalType initialNonLinearConjugateGradientOptimizerGoal = ((GoalType) getFieldValue(nonLinearConjugateGradientOptimizer, "org.apache.commons.math3.optim.nonlinear.scalar.MultivariateOptimizer", "goal"));
        
        nonLinearConjugateGradientOptimizer.parseOptimizationData(optimizationDataArray);
        
        GoalType finalNonLinearConjugateGradientOptimizerGoal = ((GoalType) getFieldValue(nonLinearConjugateGradientOptimizer, "org.apache.commons.math3.optim.nonlinear.scalar.MultivariateOptimizer", "goal"));
        
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method parseOptimizationData([Lorg.apache.commons.math3.optim.OptimizationData;)
    
    @Test(expected = NumberIsTooLargeException.class)
    public void testParseOptimizationData5() throws Exception  {
        NonLinearConjugateGradientOptimizer nonLinearConjugateGradientOptimizer = ((NonLinearConjugateGradientOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer"));
        double[] start = {2.75};
        setField(nonLinearConjugateGradientOptimizer, "org.apache.commons.math3.optim.BaseMultivariateOptimizer", "start", start);
        setField(nonLinearConjugateGradientOptimizer, "org.apache.commons.math3.optim.BaseMultivariateOptimizer", "lowerBound", start);
        double[] upperBound = {-2.781342323134002E-308};
        setField(nonLinearConjugateGradientOptimizer, "org.apache.commons.math3.optim.BaseMultivariateOptimizer", "upperBound", upperBound);
        org.apache.commons.math3.optim.OptimizationData[] optimizationDataArray = {null};
        
        nonLinearConjugateGradientOptimizer.parseOptimizationData(optimizationDataArray);
    }
    
    @Test(expected = NumberIsTooSmallException.class)
    public void testParseOptimizationData6() throws Exception  {
        NonLinearConjugateGradientOptimizer nonLinearConjugateGradientOptimizer = ((NonLinearConjugateGradientOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer"));
        double[] start = {0.0, 0.0};
        setField(nonLinearConjugateGradientOptimizer, "org.apache.commons.math3.optim.BaseMultivariateOptimizer", "start", start);
        double[] lowerBound = {-0.0, 2.225073858507202E-308};
        setField(nonLinearConjugateGradientOptimizer, "org.apache.commons.math3.optim.BaseMultivariateOptimizer", "lowerBound", lowerBound);
        org.apache.commons.math3.optim.OptimizationData[] optimizationDataArray = {};
        
        nonLinearConjugateGradientOptimizer.parseOptimizationData(optimizationDataArray);
    }
    
    @Test(expected = MathUnsupportedOperationException.class)
    public void testParseOptimizationData7() throws Exception  {
        NonLinearConjugateGradientOptimizer nonLinearConjugateGradientOptimizer = ((NonLinearConjugateGradientOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer"));
        double[] lowerBound = {0.0};
        setField(nonLinearConjugateGradientOptimizer, "org.apache.commons.math3.optim.BaseMultivariateOptimizer", "lowerBound", lowerBound);
        setField(nonLinearConjugateGradientOptimizer, "org.apache.commons.math3.optim.BaseMultivariateOptimizer", "upperBound", lowerBound);
        org.apache.commons.math3.optim.OptimizationData[] optimizationDataArray = new org.apache.commons.math3.optim.OptimizationData[1];
        InitialGuess initialGuess = ((InitialGuess) createInstance("org.apache.commons.math3.optim.InitialGuess"));
        double[] init = {0.0};
        setField(initialGuess, "org.apache.commons.math3.optim.InitialGuess", "init", init);
        optimizationDataArray[0] = ((OptimizationData) initialGuess);
        
        nonLinearConjugateGradientOptimizer.parseOptimizationData(optimizationDataArray);
    }
    
    @Test(expected = DimensionMismatchException.class)
    public void testParseOptimizationData8() throws Exception  {
        NonLinearConjugateGradientOptimizer nonLinearConjugateGradientOptimizer = ((NonLinearConjugateGradientOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer"));
        double[] start = {};
        setField(nonLinearConjugateGradientOptimizer, "org.apache.commons.math3.optim.BaseMultivariateOptimizer", "start", start);
        setField(nonLinearConjugateGradientOptimizer, "org.apache.commons.math3.optim.BaseMultivariateOptimizer", "lowerBound", start);
        double[] upperBound = {
            0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0
        };
        setField(nonLinearConjugateGradientOptimizer, "org.apache.commons.math3.optim.BaseMultivariateOptimizer", "upperBound", upperBound);
        Incrementor evaluations = ((Incrementor) createInstance("org.apache.commons.math3.util.Incrementor"));
        setField(nonLinearConjugateGradientOptimizer, "org.apache.commons.math3.optim.BaseOptimizer", "evaluations", evaluations);
        org.apache.commons.math3.optim.OptimizationData[] optimizationDataArray = new org.apache.commons.math3.optim.OptimizationData[1];
        MaxEval maxEval = ((MaxEval) createInstance("org.apache.commons.math3.optim.MaxEval"));
        optimizationDataArray[0] = ((OptimizationData) maxEval);
        
        nonLinearConjugateGradientOptimizer.parseOptimizationData(optimizationDataArray);
    }
    
    @Test(expected = MathUnsupportedOperationException.class)
    public void testParseOptimizationData9() throws Exception  {
        NonLinearConjugateGradientOptimizer nonLinearConjugateGradientOptimizer = ((NonLinearConjugateGradientOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer"));
        double[] start = {};
        setField(nonLinearConjugateGradientOptimizer, "org.apache.commons.math3.optim.BaseMultivariateOptimizer", "start", start);
        setField(nonLinearConjugateGradientOptimizer, "org.apache.commons.math3.optim.BaseMultivariateOptimizer", "lowerBound", start);
        Incrementor evaluations = ((Incrementor) createInstance("org.apache.commons.math3.util.Incrementor"));
        setField(nonLinearConjugateGradientOptimizer, "org.apache.commons.math3.optim.BaseOptimizer", "evaluations", evaluations);
        org.apache.commons.math3.optim.OptimizationData[] optimizationDataArray = new org.apache.commons.math3.optim.OptimizationData[1];
        MaxEval maxEval = ((MaxEval) createInstance("org.apache.commons.math3.optim.MaxEval"));
        optimizationDataArray[0] = ((OptimizationData) maxEval);
        
        nonLinearConjugateGradientOptimizer.parseOptimizationData(optimizationDataArray);
    }
    
    @Test(expected = MathUnsupportedOperationException.class)
    public void testParseOptimizationData10() throws Exception  {
        NonLinearConjugateGradientOptimizer nonLinearConjugateGradientOptimizer = ((NonLinearConjugateGradientOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer"));
        double[] start = {};
        setField(nonLinearConjugateGradientOptimizer, "org.apache.commons.math3.optim.BaseMultivariateOptimizer", "start", start);
        setField(nonLinearConjugateGradientOptimizer, "org.apache.commons.math3.optim.BaseMultivariateOptimizer", "upperBound", start);
        org.apache.commons.math3.optim.OptimizationData[] optimizationDataArray = new org.apache.commons.math3.optim.OptimizationData[1];
        GoalType goalType = GoalType.MINIMIZE;
        optimizationDataArray[0] = ((OptimizationData) goalType);
        
        nonLinearConjugateGradientOptimizer.parseOptimizationData(optimizationDataArray);
    }
    
    @Test(expected = DimensionMismatchException.class)
    public void testParseOptimizationData11() throws Exception  {
        NonLinearConjugateGradientOptimizer nonLinearConjugateGradientOptimizer = ((NonLinearConjugateGradientOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer"));
        double[] start = {
            0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0, 0.0
        };
        setField(nonLinearConjugateGradientOptimizer, "org.apache.commons.math3.optim.BaseMultivariateOptimizer", "start", start);
        double[] upperBound = {
            0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0
        };
        setField(nonLinearConjugateGradientOptimizer, "org.apache.commons.math3.optim.BaseMultivariateOptimizer", "upperBound", upperBound);
        Incrementor iterations = ((Incrementor) createInstance("org.apache.commons.math3.util.Incrementor"));
        setField(nonLinearConjugateGradientOptimizer, "org.apache.commons.math3.optim.BaseOptimizer", "iterations", iterations);
        org.apache.commons.math3.optim.OptimizationData[] optimizationDataArray = new org.apache.commons.math3.optim.OptimizationData[1];
        MaxIter maxIter = ((MaxIter) createInstance("org.apache.commons.math3.optim.MaxIter"));
        optimizationDataArray[0] = ((OptimizationData) maxIter);
        
        nonLinearConjugateGradientOptimizer.parseOptimizationData(optimizationDataArray);
    }
    
    @Test(expected = MathUnsupportedOperationException.class)
    public void testParseOptimizationData12() throws Exception  {
        NonLinearConjugateGradientOptimizer nonLinearConjugateGradientOptimizer = ((NonLinearConjugateGradientOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer"));
        double[] start = {0.0};
        setField(nonLinearConjugateGradientOptimizer, "org.apache.commons.math3.optim.BaseMultivariateOptimizer", "start", start);
        double[] lowerBound = {-0.0};
        setField(nonLinearConjugateGradientOptimizer, "org.apache.commons.math3.optim.BaseMultivariateOptimizer", "lowerBound", lowerBound);
        Incrementor iterations = ((Incrementor) createInstance("org.apache.commons.math3.util.Incrementor"));
        setField(nonLinearConjugateGradientOptimizer, "org.apache.commons.math3.optim.BaseOptimizer", "iterations", iterations);
        org.apache.commons.math3.optim.OptimizationData[] optimizationDataArray = new org.apache.commons.math3.optim.OptimizationData[1];
        MaxIter maxIter = ((MaxIter) createInstance("org.apache.commons.math3.optim.MaxIter"));
        optimizationDataArray[0] = ((OptimizationData) maxIter);
        
        nonLinearConjugateGradientOptimizer.parseOptimizationData(optimizationDataArray);
    }
    
    @Test(expected = MathUnsupportedOperationException.class)
    public void testParseOptimizationData13() throws Exception  {
        NonLinearConjugateGradientOptimizer nonLinearConjugateGradientOptimizer = ((NonLinearConjugateGradientOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer"));
        double[] start = {-7.258882045355063E-232};
        setField(nonLinearConjugateGradientOptimizer, "org.apache.commons.math3.optim.BaseMultivariateOptimizer", "start", start);
        double[] upperBound = {java.lang.Double.NaN};
        setField(nonLinearConjugateGradientOptimizer, "org.apache.commons.math3.optim.BaseMultivariateOptimizer", "upperBound", upperBound);
        Incrementor evaluations = ((Incrementor) createInstance("org.apache.commons.math3.util.Incrementor"));
        setField(nonLinearConjugateGradientOptimizer, "org.apache.commons.math3.optim.BaseOptimizer", "evaluations", evaluations);
        org.apache.commons.math3.optim.OptimizationData[] optimizationDataArray = new org.apache.commons.math3.optim.OptimizationData[1];
        MaxEval maxEval = ((MaxEval) createInstance("org.apache.commons.math3.optim.MaxEval"));
        optimizationDataArray[0] = ((OptimizationData) maxEval);
        
        nonLinearConjugateGradientOptimizer.parseOptimizationData(optimizationDataArray);
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
        
                java.lang.reflect.Method methodForGetDeclaredFields715499039739200 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields715499039739200.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass715499039746400 = (java.lang.reflect.Field[]) methodForGetDeclaredFields715499039739200.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass715499039746400).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
                
            java.lang.reflect.Method methodForGetDeclaredFields715499040114100 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields715499040114100.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass715499040118000 = (java.lang.reflect.Field[]) methodForGetDeclaredFields715499040114100.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass715499040118000).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields715499040772700 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields715499040772700.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass715499040775400 = (java.lang.reflect.Field[]) methodForGetDeclaredFields715499040772700.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass715499040775400).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields715499041419400 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields715499041419400.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass715499041421800 = (java.lang.reflect.Field[]) methodForGetDeclaredFields715499041419400.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass715499041421800).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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

