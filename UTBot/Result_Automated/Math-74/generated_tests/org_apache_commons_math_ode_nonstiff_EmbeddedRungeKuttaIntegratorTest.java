package org.apache.commons.math.ode.nonstiff;

import org.junit.Test;
import org.apache.commons.math.ode.FirstOrderConverter;
import org.apache.commons.math.ode.IntegratorException;
import java.lang.reflect.Method;
import org.apache.commons.math.ode.DerivativeException;
import java.util.HashSet;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

import static org.junit.Assert.assertEquals;

public final class org_apache_commons_math_ode_nonstiff_EmbeddedRungeKuttaIntegratorTest {
    ///region Test suites for executable org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator.integrate
    
    ///region SYMBOLIC EXECUTION: CHECKED EXCEPTIONS for method integrate(org.apache.commons.math.ode.FirstOrderDifferentialEquations, double, [D, double, [D)
    
    /**
    @utbot.classUnderTest {@link EmbeddedRungeKuttaIntegrator}
 * @utbot.methodUnderTest {@link org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator#integrate(org.apache.commons.math.ode.FirstOrderDifferentialEquations,double,double[],double,double[])}
 * @utbot.throwsException {@link org.apache.commons.math.ode.IntegratorException} in: sanityChecks(equations, t0, y0, t, y);
 *  */
    @Test(expected = IntegratorException.class)
    public void testIntegrate_ThrowIntegratorException_1() throws Exception  {
        DormandPrince853Integrator dormandPrince853Integrator = ((DormandPrince853Integrator) createInstance("org.apache.commons.math.ode.nonstiff.DormandPrince853Integrator"));
        FirstOrderConverter firstOrderConverter = ((FirstOrderConverter) createInstance("org.apache.commons.math.ode.FirstOrderConverter"));
        setField(firstOrderConverter, "org.apache.commons.math.ode.FirstOrderConverter", "dimension", 1);
        double[] doubleArray = {0.0, 0.0};
        double[] doubleArray1 = {0.0};
        
        dormandPrince853Integrator.integrate(firstOrderConverter, java.lang.Double.NaN, doubleArray, java.lang.Double.NaN, doubleArray1);
    }
    
    /**
    @utbot.classUnderTest {@link EmbeddedRungeKuttaIntegrator}
 * @utbot.methodUnderTest {@link org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator#integrate(org.apache.commons.math.ode.FirstOrderDifferentialEquations,double,double[],double,double[])}
 * @utbot.throwsException {@link org.apache.commons.math.ode.IntegratorException} in: sanityChecks(equations, t0, y0, t, y);
 *  */
    @Test(expected = IntegratorException.class)
    public void testIntegrate_ThrowIntegratorException_3() throws Exception  {
        DormandPrince54Integrator dormandPrince54Integrator = ((DormandPrince54Integrator) createInstance("org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator"));
        FirstOrderConverter firstOrderConverter = ((FirstOrderConverter) createInstance("org.apache.commons.math.ode.FirstOrderConverter"));
        double[] doubleArray = {};
        
        dormandPrince54Integrator.integrate(firstOrderConverter, -0.0, doubleArray, 0.0, doubleArray);
    }
    
    /**
    @utbot.classUnderTest {@link EmbeddedRungeKuttaIntegrator}
 * @utbot.methodUnderTest {@link org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator#integrate(org.apache.commons.math.ode.FirstOrderDifferentialEquations,double,double[],double,double[])}
 * @utbot.throwsException {@link org.apache.commons.math.ode.IntegratorException} in: sanityChecks(equations, t0, y0, t, y);
 *  */
    @Test(expected = IntegratorException.class)
    public void testIntegrate_ThrowIntegratorException_6() throws Throwable  {
        DormandPrince853Integrator dormandPrince853Integrator = ((DormandPrince853Integrator) createInstance("org.apache.commons.math.ode.nonstiff.DormandPrince853Integrator"));
        Object countingDifferentialEquations = createInstance("org.apache.commons.math.ode.MultistepIntegrator$CountingDifferentialEquations");
        setField(countingDifferentialEquations, "org.apache.commons.math.ode.MultistepIntegrator$CountingDifferentialEquations", "dimension", 1);
        double[] doubleArray = {0.0};
        double[] doubleArray1 = {0.0, 0.0};
        
        Class embeddedRungeKuttaIntegratorClazz = Class.forName("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator");
        Class countingDifferentialEquationsType = Class.forName("org.apache.commons.math.ode.FirstOrderDifferentialEquations");
        Class doubleType = double.class;
        Class doubleArrayType = Class.forName("[D");
        Method integrateMethod = embeddedRungeKuttaIntegratorClazz.getDeclaredMethod("integrate", countingDifferentialEquationsType, doubleType, doubleArrayType, doubleType, doubleArrayType);
        integrateMethod.setAccessible(true);
        java.lang.Object[] integrateMethodArguments = new java.lang.Object[5];
        integrateMethodArguments[0] = countingDifferentialEquations;
        integrateMethodArguments[1] = java.lang.Double.NaN;
        integrateMethodArguments[2] = ((Object) doubleArray);
        integrateMethodArguments[3] = java.lang.Double.NaN;
        integrateMethodArguments[4] = ((Object) doubleArray1);
        try {
            integrateMethod.invoke(dormandPrince853Integrator, integrateMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link EmbeddedRungeKuttaIntegrator}
 * @utbot.methodUnderTest {@link org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator#integrate(org.apache.commons.math.ode.FirstOrderDifferentialEquations,double,double[],double,double[])}
 * @utbot.throwsException {@link org.apache.commons.math.ode.IntegratorException} in: sanityChecks(equations, t0, y0, t, y);
 *  */
    @Test(expected = IntegratorException.class)
    public void testIntegrate_ThrowIntegratorException() throws Exception  {
        DormandPrince853Integrator dormandPrince853Integrator = ((DormandPrince853Integrator) createInstance("org.apache.commons.math.ode.nonstiff.DormandPrince853Integrator"));
        FirstOrderConverter firstOrderConverter = ((FirstOrderConverter) createInstance("org.apache.commons.math.ode.FirstOrderConverter"));
        setField(firstOrderConverter, "org.apache.commons.math.ode.FirstOrderConverter", "dimension", 2147483646);
        double[] doubleArray = {0.0, 0.0};
        
        dormandPrince853Integrator.integrate(firstOrderConverter, java.lang.Double.NaN, doubleArray, java.lang.Double.NaN, null);
    }
    
    /**
    @utbot.classUnderTest {@link EmbeddedRungeKuttaIntegrator}
 * @utbot.methodUnderTest {@link org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator#integrate(org.apache.commons.math.ode.FirstOrderDifferentialEquations,double,double[],double,double[])}
 * @utbot.throwsException {@link org.apache.commons.math.ode.IntegratorException} in: sanityChecks(equations, t0, y0, t, y);
 *  */
    @Test(expected = IntegratorException.class)
    public void testIntegrate_ThrowIntegratorException_4() throws Exception  {
        HighamHall54Integrator highamHall54Integrator = ((HighamHall54Integrator) createInstance("org.apache.commons.math.ode.nonstiff.HighamHall54Integrator"));
        double[] vecAbsoluteTolerance = {0.0};
        setField(highamHall54Integrator, "org.apache.commons.math.ode.nonstiff.AdaptiveStepsizeIntegrator", "vecAbsoluteTolerance", vecAbsoluteTolerance);
        FirstOrderConverter firstOrderConverter = ((FirstOrderConverter) createInstance("org.apache.commons.math.ode.FirstOrderConverter"));
        setField(firstOrderConverter, "org.apache.commons.math.ode.FirstOrderConverter", "dimension", 1);
        double[] doubleArray = {0.0, 0.0};
        
        highamHall54Integrator.integrate(firstOrderConverter, java.lang.Double.NaN, doubleArray, 3.058118225111392E-297, doubleArray);
    }
    
    /**
    @utbot.classUnderTest {@link EmbeddedRungeKuttaIntegrator}
 * @utbot.methodUnderTest {@link org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator#integrate(org.apache.commons.math.ode.FirstOrderDifferentialEquations,double,double[],double,double[])}
 * @utbot.throwsException {@link org.apache.commons.math.ode.IntegratorException} in: sanityChecks(equations, t0, y0, t, y);
 *  */
    @Test(expected = IntegratorException.class)
    public void testIntegrate_ThrowIntegratorException_5() throws Throwable  {
        DormandPrince853Integrator dormandPrince853Integrator = ((DormandPrince853Integrator) createInstance("org.apache.commons.math.ode.nonstiff.DormandPrince853Integrator"));
        Object countingDifferentialEquations = createInstance("org.apache.commons.math.ode.MultistepIntegrator$CountingDifferentialEquations");
        setField(countingDifferentialEquations, "org.apache.commons.math.ode.MultistepIntegrator$CountingDifferentialEquations", "dimension", -3);
        double[] doubleArray = {0.0, 0.0};
        
        Class embeddedRungeKuttaIntegratorClazz = Class.forName("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator");
        Class countingDifferentialEquationsType = Class.forName("org.apache.commons.math.ode.FirstOrderDifferentialEquations");
        Class doubleType = double.class;
        Class doubleArrayType = Class.forName("[D");
        Method integrateMethod = embeddedRungeKuttaIntegratorClazz.getDeclaredMethod("integrate", countingDifferentialEquationsType, doubleType, doubleArrayType, doubleType, doubleArrayType);
        integrateMethod.setAccessible(true);
        java.lang.Object[] integrateMethodArguments = new java.lang.Object[5];
        integrateMethodArguments[0] = countingDifferentialEquations;
        integrateMethodArguments[1] = java.lang.Double.NaN;
        integrateMethodArguments[2] = ((Object) doubleArray);
        integrateMethodArguments[3] = java.lang.Double.NaN;
        integrateMethodArguments[4] = ((Object) null);
        try {
            integrateMethod.invoke(dormandPrince853Integrator, integrateMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link EmbeddedRungeKuttaIntegrator}
 * @utbot.methodUnderTest {@link org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator#integrate(org.apache.commons.math.ode.FirstOrderDifferentialEquations,double,double[],double,double[])}
 * @utbot.throwsException {@link org.apache.commons.math.ode.IntegratorException} in: sanityChecks(equations, t0, y0, t, y);
 *  */
    @Test(expected = IntegratorException.class)
    public void testIntegrate_ThrowIntegratorException_2() throws Exception  {
        DormandPrince54Integrator dormandPrince54Integrator = ((DormandPrince54Integrator) createInstance("org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator"));
        double[] vecRelativeTolerance = {0.0};
        setField(dormandPrince54Integrator, "org.apache.commons.math.ode.nonstiff.AdaptiveStepsizeIntegrator", "vecRelativeTolerance", vecRelativeTolerance);
        FirstOrderConverter firstOrderConverter = ((FirstOrderConverter) createInstance("org.apache.commons.math.ode.FirstOrderConverter"));
        setField(firstOrderConverter, "org.apache.commons.math.ode.FirstOrderConverter", "dimension", 1);
        double[] doubleArray = {0.0, 0.0};
        double[] doubleArray1 = {0.0, 0.0};
        
        dormandPrince54Integrator.integrate(firstOrderConverter, -0.0, doubleArray, -2.3422735050509573E-302, doubleArray1);
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method integrate(org.apache.commons.math.ode.FirstOrderDifferentialEquations, double, [D, double, [D)
    
    @Test
    public void testIntegrateByFuzzer() throws DerivativeException, IntegratorException  {
        double[] doubleArray = {1.0, 1.0, 0.0, -1.0, 0.0};
        double[] doubleArray1 = {1.0, java.lang.Double.NaN};
        DormandPrince853Integrator dormandPrince853Integrator = new DormandPrince853Integrator(-1.0, 1.0, doubleArray, doubleArray1);
        dormandPrince853Integrator.setMaxEvaluations(0);
        dormandPrince853Integrator.setMinReduction(0.0);
        dormandPrince853Integrator.setMaxGrowth(0.0);
        dormandPrince853Integrator.setSafety(0.0);
        double[] doubleArray2 = {1.0};
        double[] doubleArray3 = {0.0, 0.0};
        
        /* This test fails because method [org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator.integrate] produces [java.lang.NullPointerException]
            org.apache.commons.math.ode.AbstractIntegrator.sanityChecks(AbstractIntegrator.java:198)
            org.apache.commons.math.ode.nonstiff.AdaptiveStepsizeIntegrator.sanityChecks(AdaptiveStepsizeIntegrator.java:171)
            org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator.integrate(EmbeddedRungeKuttaIntegrator.java:197) */
        dormandPrince853Integrator.integrate(null, 1.03125, doubleArray2, 1.0, doubleArray3);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method integrate(org.apache.commons.math.ode.FirstOrderDifferentialEquations, double, [D, double, [D)
    
    @Test
    public void testIntegrate1() throws Throwable  {
        HighamHall54Integrator highamHall54Integrator = ((HighamHall54Integrator) createInstance("org.apache.commons.math.ode.nonstiff.HighamHall54Integrator"));
        Object countingDifferentialEquations = createInstance("org.apache.commons.math.ode.MultistepIntegrator$CountingDifferentialEquations");
        double[] doubleArray = {};
        double[] doubleArray1 = {};
        
        /* This test fails because method [org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator.integrate] produces [java.lang.NullPointerException]
            org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator.integrate(EmbeddedRungeKuttaIntegrator.java:203) */
        Class embeddedRungeKuttaIntegratorClazz = Class.forName("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator");
        Class countingDifferentialEquationsType = Class.forName("org.apache.commons.math.ode.FirstOrderDifferentialEquations");
        Class doubleType = double.class;
        Class doubleArrayType = Class.forName("[D");
        Method integrateMethod = embeddedRungeKuttaIntegratorClazz.getDeclaredMethod("integrate", countingDifferentialEquationsType, doubleType, doubleArrayType, doubleType, doubleArrayType);
        integrateMethod.setAccessible(true);
        java.lang.Object[] integrateMethodArguments = new java.lang.Object[5];
        integrateMethodArguments[0] = countingDifferentialEquations;
        integrateMethodArguments[1] = -5.104235503814077E38;
        integrateMethodArguments[2] = ((Object) doubleArray);
        integrateMethodArguments[3] = -2.3984375;
        integrateMethodArguments[4] = ((Object) doubleArray1);
        try {
            integrateMethod.invoke(highamHall54Integrator, integrateMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testIntegrate2() throws Exception  {
        HighamHall54Integrator highamHall54Integrator = ((HighamHall54Integrator) createInstance("org.apache.commons.math.ode.nonstiff.HighamHall54Integrator"));
        double[] vecAbsoluteTolerance = {0.0, 0.0};
        setField(highamHall54Integrator, "org.apache.commons.math.ode.nonstiff.AdaptiveStepsizeIntegrator", "vecAbsoluteTolerance", vecAbsoluteTolerance);
        FirstOrderConverter firstOrderConverter = ((FirstOrderConverter) createInstance("org.apache.commons.math.ode.FirstOrderConverter"));
        setField(firstOrderConverter, "org.apache.commons.math.ode.FirstOrderConverter", "dimension", 1);
        double[] doubleArray = {0.0, 0.0};
        double[] doubleArray1 = {0.0, 0.0};
        
        /* This test fails because method [org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator.integrate] produces [java.lang.NullPointerException]
            org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator.integrate(EmbeddedRungeKuttaIntegrator.java:203) */
        highamHall54Integrator.integrate(firstOrderConverter, java.lang.Double.NaN, doubleArray, -2.437664309131097E-305, doubleArray1);
    }
    
    @Test
    public void testIntegrate3() throws Throwable  {
        DormandPrince54Integrator dormandPrince54Integrator = ((DormandPrince54Integrator) createInstance("org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator"));
        double[] vecRelativeTolerance = {
            0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0
        };
        setField(dormandPrince54Integrator, "org.apache.commons.math.ode.nonstiff.AdaptiveStepsizeIntegrator", "vecRelativeTolerance", vecRelativeTolerance);
        Object countingDifferentialEquations = createInstance("org.apache.commons.math.ode.MultistepIntegrator$CountingDifferentialEquations");
        setField(countingDifferentialEquations, "org.apache.commons.math.ode.MultistepIntegrator$CountingDifferentialEquations", "dimension", 9);
        double[] doubleArray = {
            0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0
        };
        
        /* This test fails because method [org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator.integrate] produces [java.lang.NullPointerException]
            org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator.integrate(EmbeddedRungeKuttaIntegrator.java:203) */
        Class embeddedRungeKuttaIntegratorClazz = Class.forName("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator");
        Class countingDifferentialEquationsType = Class.forName("org.apache.commons.math.ode.FirstOrderDifferentialEquations");
        Class doubleType = double.class;
        Class doubleArrayType = Class.forName("[D");
        Method integrateMethod = embeddedRungeKuttaIntegratorClazz.getDeclaredMethod("integrate", countingDifferentialEquationsType, doubleType, doubleArrayType, doubleType, doubleArrayType);
        integrateMethod.setAccessible(true);
        java.lang.Object[] integrateMethodArguments = new java.lang.Object[5];
        integrateMethodArguments[0] = countingDifferentialEquations;
        integrateMethodArguments[1] = java.lang.Double.NaN;
        integrateMethodArguments[2] = ((Object) doubleArray);
        integrateMethodArguments[3] = -7.815655116355238E230;
        integrateMethodArguments[4] = ((Object) doubleArray);
        try {
            integrateMethod.invoke(dormandPrince54Integrator, integrateMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testIntegrate4() throws Throwable  {
        DormandPrince853Integrator dormandPrince853Integrator = ((DormandPrince853Integrator) createInstance("org.apache.commons.math.ode.nonstiff.DormandPrince853Integrator"));
        double[] vecAbsoluteTolerance = {0.0};
        setField(dormandPrince853Integrator, "org.apache.commons.math.ode.nonstiff.AdaptiveStepsizeIntegrator", "vecAbsoluteTolerance", vecAbsoluteTolerance);
        Object countingDifferentialEquations = createInstance("org.apache.commons.math.ode.MultistepIntegrator$CountingDifferentialEquations");
        setField(countingDifferentialEquations, "org.apache.commons.math.ode.MultistepIntegrator$CountingDifferentialEquations", "dimension", 1);
        double[] doubleArray = {0.0};
        double[] doubleArray1 = {0.0};
        
        /* This test fails because method [org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator.integrate] produces [java.lang.NullPointerException]
            org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator.integrate(EmbeddedRungeKuttaIntegrator.java:203) */
        Class embeddedRungeKuttaIntegratorClazz = Class.forName("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator");
        Class countingDifferentialEquationsType = Class.forName("org.apache.commons.math.ode.FirstOrderDifferentialEquations");
        Class doubleType = double.class;
        Class doubleArrayType = Class.forName("[D");
        Method integrateMethod = embeddedRungeKuttaIntegratorClazz.getDeclaredMethod("integrate", countingDifferentialEquationsType, doubleType, doubleArrayType, doubleType, doubleArrayType);
        integrateMethod.setAccessible(true);
        java.lang.Object[] integrateMethodArguments = new java.lang.Object[5];
        integrateMethodArguments[0] = countingDifferentialEquations;
        integrateMethodArguments[1] = java.lang.Double.NaN;
        integrateMethodArguments[2] = ((Object) doubleArray);
        integrateMethodArguments[3] = 1.73799417029244E-309;
        integrateMethodArguments[4] = ((Object) doubleArray1);
        try {
            integrateMethod.invoke(dormandPrince853Integrator, integrateMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testIntegrate5() throws Exception  {
        DormandPrince54Integrator dormandPrince54Integrator = ((DormandPrince54Integrator) createInstance("org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator"));
        double[] c = {
            0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0
        };
        setField(dormandPrince54Integrator, "org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "c", c);
        double[] vecRelativeTolerance = {};
        setField(dormandPrince54Integrator, "org.apache.commons.math.ode.nonstiff.AdaptiveStepsizeIntegrator", "vecRelativeTolerance", vecRelativeTolerance);
        FirstOrderConverter firstOrderConverter = ((FirstOrderConverter) createInstance("org.apache.commons.math.ode.FirstOrderConverter"));
        double[] doubleArray = {};
        double[] doubleArray1 = {};
        
        /* This test fails because method [org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator.integrate] produces [java.lang.NullPointerException]
            org.apache.commons.math.ode.AbstractIntegrator.requiresDenseOutput(AbstractIntegrator.java:123)
            org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator.integrate(EmbeddedRungeKuttaIntegrator.java:212) */
        dormandPrince54Integrator.integrate(firstOrderConverter, -0.0, doubleArray, java.lang.Double.NaN, doubleArray1);
    }
    
    @Test
    public void testIntegrate6() throws Exception  {
        DormandPrince54Integrator dormandPrince54Integrator = ((DormandPrince54Integrator) createInstance("org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator"));
        double[] c = {};
        setField(dormandPrince54Integrator, "org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "c", c);
        HashSet stepHandlers = new HashSet();
        setField(dormandPrince54Integrator, "org.apache.commons.math.ode.AbstractIntegrator", "stepHandlers", stepHandlers);
        FirstOrderConverter firstOrderConverter = ((FirstOrderConverter) createInstance("org.apache.commons.math.ode.FirstOrderConverter"));
        setField(firstOrderConverter, "org.apache.commons.math.ode.FirstOrderConverter", "dimension", 5);
        double[] doubleArray = {
            0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0, 0.0
        };
        
        /* This test fails because method [org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator.integrate] produces [java.lang.NullPointerException]
            org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator.integrate(EmbeddedRungeKuttaIntegrator.java:212) */
        dormandPrince54Integrator.integrate(firstOrderConverter, -0.0, doubleArray, 4.9E-324, doubleArray);
    }
    ///endregion
    
    ///region OTHER: CHECKED EXCEPTIONS for method integrate(org.apache.commons.math.ode.FirstOrderDifferentialEquations, double, [D, double, [D)
    
    @Test(expected = IntegratorException.class)
    public void testIntegrate7() throws Throwable  {
        DormandPrince54Integrator dormandPrince54Integrator = ((DormandPrince54Integrator) createInstance("org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator"));
        double[] vecAbsoluteTolerance = {
            0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0
        };
        setField(dormandPrince54Integrator, "org.apache.commons.math.ode.nonstiff.AdaptiveStepsizeIntegrator", "vecAbsoluteTolerance", vecAbsoluteTolerance);
        Object countingDifferentialEquations = createInstance("org.apache.commons.math.ode.MultistepIntegrator$CountingDifferentialEquations");
        setField(countingDifferentialEquations, "org.apache.commons.math.ode.MultistepIntegrator$CountingDifferentialEquations", "dimension", 1);
        double[] doubleArray = {0.0};
        
        Class embeddedRungeKuttaIntegratorClazz = Class.forName("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator");
        Class countingDifferentialEquationsType = Class.forName("org.apache.commons.math.ode.FirstOrderDifferentialEquations");
        Class doubleType = double.class;
        Class doubleArrayType = Class.forName("[D");
        Method integrateMethod = embeddedRungeKuttaIntegratorClazz.getDeclaredMethod("integrate", countingDifferentialEquationsType, doubleType, doubleArrayType, doubleType, doubleArrayType);
        integrateMethod.setAccessible(true);
        java.lang.Object[] integrateMethodArguments = new java.lang.Object[5];
        integrateMethodArguments[0] = countingDifferentialEquations;
        integrateMethodArguments[1] = java.lang.Double.POSITIVE_INFINITY;
        integrateMethodArguments[2] = ((Object) doubleArray);
        integrateMethodArguments[3] = java.lang.Double.POSITIVE_INFINITY;
        integrateMethodArguments[4] = ((Object) doubleArray);
        try {
            integrateMethod.invoke(dormandPrince54Integrator, integrateMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator.setMinReduction
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setMinReduction(double)
    
    /**
    @utbot.classUnderTest {@link EmbeddedRungeKuttaIntegrator}
 * @utbot.methodUnderTest {@link org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator#setMinReduction(double)}
 *  */
    @Test
    public void testSetMinReduction() throws Exception  {
        DormandPrince853Integrator dormandPrince853Integrator = ((DormandPrince853Integrator) createInstance("org.apache.commons.math.ode.nonstiff.DormandPrince853Integrator"));
        dormandPrince853Integrator.setMinReduction(0.0);
        
        dormandPrince853Integrator.setMinReduction(java.lang.Double.NaN);
        
        double finalDormandPrince853IntegratorMinReduction = ((Double) getFieldValue(dormandPrince853Integrator, "org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "minReduction"));
        
        assertEquals(java.lang.Double.NaN, finalDormandPrince853IntegratorMinReduction, 1.0E-6);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator.getMaxGrowth
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getMaxGrowth()
    
    /**
    @utbot.classUnderTest {@link EmbeddedRungeKuttaIntegrator}
 * @utbot.methodUnderTest {@link org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator#getMaxGrowth()}
 * @utbot.returnsFrom {@code return maxGrowth;}
 *  */
    @Test
    public void testGetMaxGrowth_ReturnMaxGrowth() throws Exception  {
        DormandPrince853Integrator dormandPrince853Integrator = ((DormandPrince853Integrator) createInstance("org.apache.commons.math.ode.nonstiff.DormandPrince853Integrator"));
        dormandPrince853Integrator.setMaxGrowth(0.0);
        
        double actual = dormandPrince853Integrator.getMaxGrowth();
        
        assertEquals(0.0, actual, 1.0E-6);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator.setMaxGrowth
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setMaxGrowth(double)
    
    /**
    @utbot.classUnderTest {@link EmbeddedRungeKuttaIntegrator}
 * @utbot.methodUnderTest {@link org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator#setMaxGrowth(double)}
 *  */
    @Test
    public void testSetMaxGrowth() throws Exception  {
        DormandPrince853Integrator dormandPrince853Integrator = ((DormandPrince853Integrator) createInstance("org.apache.commons.math.ode.nonstiff.DormandPrince853Integrator"));
        dormandPrince853Integrator.setMaxGrowth(0.0);
        
        dormandPrince853Integrator.setMaxGrowth(java.lang.Double.NaN);
        
        double finalDormandPrince853IntegratorMaxGrowth = ((Double) getFieldValue(dormandPrince853Integrator, "org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "maxGrowth"));
        
        assertEquals(java.lang.Double.NaN, finalDormandPrince853IntegratorMaxGrowth, 1.0E-6);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator.setSafety
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setSafety(double)
    
    /**
    @utbot.classUnderTest {@link EmbeddedRungeKuttaIntegrator}
 * @utbot.methodUnderTest {@link org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator#setSafety(double)}
 *  */
    @Test
    public void testSetSafety() throws Exception  {
        DormandPrince853Integrator dormandPrince853Integrator = ((DormandPrince853Integrator) createInstance("org.apache.commons.math.ode.nonstiff.DormandPrince853Integrator"));
        dormandPrince853Integrator.setSafety(0.0);
        
        dormandPrince853Integrator.setSafety(java.lang.Double.NaN);
        
        double finalDormandPrince853IntegratorSafety = ((Double) getFieldValue(dormandPrince853Integrator, "org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "safety"));
        
        assertEquals(java.lang.Double.NaN, finalDormandPrince853IntegratorSafety, 1.0E-6);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator.getMinReduction
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getMinReduction()
    
    /**
    @utbot.classUnderTest {@link EmbeddedRungeKuttaIntegrator}
 * @utbot.methodUnderTest {@link org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator#getMinReduction()}
 * @utbot.returnsFrom {@code return minReduction;}
 *  */
    @Test
    public void testGetMinReduction_ReturnMinReduction() throws Exception  {
        DormandPrince853Integrator dormandPrince853Integrator = ((DormandPrince853Integrator) createInstance("org.apache.commons.math.ode.nonstiff.DormandPrince853Integrator"));
        dormandPrince853Integrator.setMinReduction(0.0);
        
        double actual = dormandPrince853Integrator.getMinReduction();
        
        assertEquals(0.0, actual, 1.0E-6);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator.getSafety
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getSafety()
    
    /**
    @utbot.classUnderTest {@link EmbeddedRungeKuttaIntegrator}
 * @utbot.methodUnderTest {@link org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator#getSafety()}
 * @utbot.returnsFrom {@code return safety;}
 *  */
    @Test
    public void testGetSafety_ReturnSafety() throws Exception  {
        DormandPrince853Integrator dormandPrince853Integrator = ((DormandPrince853Integrator) createInstance("org.apache.commons.math.ode.nonstiff.DormandPrince853Integrator"));
        dormandPrince853Integrator.setSafety(0.0);
        
        double actual = dormandPrince853Integrator.getSafety();
        
        assertEquals(0.0, actual, 1.0E-6);
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
        
                java.lang.reflect.Method methodForGetDeclaredFields739903759380600 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields739903759380600.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass739903759388400 = (java.lang.reflect.Field[]) methodForGetDeclaredFields739903759380600.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass739903759388400).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields739903760383200 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields739903760383200.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass739903760386900 = (java.lang.reflect.Field[]) methodForGetDeclaredFields739903760383200.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass739903760386900).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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

