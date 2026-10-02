package org.apache.commons.math.ode.nonstiff;

import org.junit.Test;
import org.apache.commons.math.ode.FirstOrderConverter;
import org.apache.commons.math.ode.IntegratorException;
import org.apache.commons.math.ode.DerivativeException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

public final class org_apache_commons_math_ode_nonstiff_RungeKuttaIntegratorTest {
    ///region Test suites for executable org.apache.commons.math.ode.nonstiff.RungeKuttaIntegrator.integrate
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method integrate(org.apache.commons.math.ode.FirstOrderDifferentialEquations, double, [D, double, [D)
    
    /**
    @utbot.classUnderTest {@link RungeKuttaIntegrator}
 * @utbot.methodUnderTest {@link org.apache.commons.math.ode.nonstiff.RungeKuttaIntegrator#integrate(org.apache.commons.math.ode.FirstOrderDifferentialEquations,double,double[],double,double[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: final int stages = c.length + 1;
 *  */
    @Test
    public void testIntegrate_ThrowNullPointerException() throws Exception  {
        ThreeEighthesIntegrator threeEighthesIntegrator = ((ThreeEighthesIntegrator) createInstance("org.apache.commons.math.ode.nonstiff.ThreeEighthesIntegrator"));
        FirstOrderConverter firstOrderConverter = ((FirstOrderConverter) createInstance("org.apache.commons.math.ode.FirstOrderConverter"));
        double[] doubleArray = {};
        double[] doubleArray1 = {};
        
        /* This test fails because method [org.apache.commons.math.ode.nonstiff.RungeKuttaIntegrator.integrate] produces [java.lang.NullPointerException]
            org.apache.commons.math.ode.nonstiff.RungeKuttaIntegrator.integrate(RungeKuttaIntegrator.java:106) */
        threeEighthesIntegrator.integrate(firstOrderConverter, 1.4000359098427973E33, doubleArray, 7.521742976058813E30, doubleArray1);
    }
    
    /**
    @utbot.classUnderTest {@link RungeKuttaIntegrator}
 * @utbot.methodUnderTest {@link org.apache.commons.math.ode.nonstiff.RungeKuttaIntegrator#integrate(org.apache.commons.math.ode.FirstOrderDifferentialEquations,double,double[],double,double[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: final int stages = c.length + 1;
 *  */
    @Test
    public void testIntegrate_ThrowNullPointerException_1() throws Exception  {
        EulerIntegrator eulerIntegrator = ((EulerIntegrator) createInstance("org.apache.commons.math.ode.nonstiff.EulerIntegrator"));
        FirstOrderConverter firstOrderConverter = ((FirstOrderConverter) createInstance("org.apache.commons.math.ode.FirstOrderConverter"));
        double[] doubleArray = {};
        double[] doubleArray1 = {};
        
        /* This test fails because method [org.apache.commons.math.ode.nonstiff.RungeKuttaIntegrator.integrate] produces [java.lang.NullPointerException]
            org.apache.commons.math.ode.nonstiff.RungeKuttaIntegrator.integrate(RungeKuttaIntegrator.java:106) */
        eulerIntegrator.integrate(firstOrderConverter, 2.0499010545315145E233, doubleArray, 2.9818364265778034E233, doubleArray1);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: CHECKED EXCEPTIONS for method integrate(org.apache.commons.math.ode.FirstOrderDifferentialEquations, double, [D, double, [D)
    
    /**
    @utbot.classUnderTest {@link RungeKuttaIntegrator}
 * @utbot.methodUnderTest {@link org.apache.commons.math.ode.nonstiff.RungeKuttaIntegrator#integrate(org.apache.commons.math.ode.FirstOrderDifferentialEquations,double,double[],double,double[])}
 * @utbot.throwsException {@link org.apache.commons.math.ode.IntegratorException} in: sanityChecks(equations, t0, y0, t, y);
 *  */
    @Test(expected = IntegratorException.class)
    public void testIntegrate_ThrowIntegratorException_1() throws Exception  {
        EulerIntegrator eulerIntegrator = ((EulerIntegrator) createInstance("org.apache.commons.math.ode.nonstiff.EulerIntegrator"));
        FirstOrderConverter firstOrderConverter = ((FirstOrderConverter) createInstance("org.apache.commons.math.ode.FirstOrderConverter"));
        setField(firstOrderConverter, "org.apache.commons.math.ode.FirstOrderConverter", "dimension", 1);
        double[] doubleArray = {0.0, 0.0};
        double[] doubleArray1 = {0.0};
        
        eulerIntegrator.integrate(firstOrderConverter, java.lang.Double.NaN, doubleArray, java.lang.Double.NaN, doubleArray1);
    }
    
    /**
    @utbot.classUnderTest {@link RungeKuttaIntegrator}
 * @utbot.methodUnderTest {@link org.apache.commons.math.ode.nonstiff.RungeKuttaIntegrator#integrate(org.apache.commons.math.ode.FirstOrderDifferentialEquations,double,double[],double,double[])}
 * @utbot.throwsException {@link org.apache.commons.math.ode.IntegratorException} in: sanityChecks(equations, t0, y0, t, y);
 *  */
    @Test(expected = IntegratorException.class)
    public void testIntegrate_ThrowIntegratorException_2() throws Exception  {
        ClassicalRungeKuttaIntegrator classicalRungeKuttaIntegrator = ((ClassicalRungeKuttaIntegrator) createInstance("org.apache.commons.math.ode.nonstiff.ClassicalRungeKuttaIntegrator"));
        FirstOrderConverter firstOrderConverter = ((FirstOrderConverter) createInstance("org.apache.commons.math.ode.FirstOrderConverter"));
        double[] doubleArray = {};
        double[] doubleArray1 = {};
        
        classicalRungeKuttaIntegrator.integrate(firstOrderConverter, java.lang.Double.NEGATIVE_INFINITY, doubleArray, 3.423177476070157E38, doubleArray1);
    }
    
    /**
    @utbot.classUnderTest {@link RungeKuttaIntegrator}
 * @utbot.methodUnderTest {@link org.apache.commons.math.ode.nonstiff.RungeKuttaIntegrator#integrate(org.apache.commons.math.ode.FirstOrderDifferentialEquations,double,double[],double,double[])}
 * @utbot.throwsException {@link org.apache.commons.math.ode.IntegratorException} in: sanityChecks(equations, t0, y0, t, y);
 *  */
    @Test(expected = IntegratorException.class)
    public void testIntegrate_ThrowIntegratorException() throws Exception  {
        GillIntegrator gillIntegrator = ((GillIntegrator) createInstance("org.apache.commons.math.ode.nonstiff.GillIntegrator"));
        FirstOrderConverter firstOrderConverter = ((FirstOrderConverter) createInstance("org.apache.commons.math.ode.FirstOrderConverter"));
        setField(firstOrderConverter, "org.apache.commons.math.ode.FirstOrderConverter", "dimension", 2147483646);
        double[] doubleArray = {0.0, 0.0};
        
        gillIntegrator.integrate(firstOrderConverter, java.lang.Double.NaN, doubleArray, java.lang.Double.NaN, null);
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method integrate(org.apache.commons.math.ode.FirstOrderDifferentialEquations, double, [D, double, [D)
    
    @Test
    public void testIntegrateByFuzzer() throws DerivativeException, IntegratorException  {
        GillIntegrator gillIntegrator = new GillIntegrator(java.lang.Double.NEGATIVE_INFINITY);
        gillIntegrator.setMaxEvaluations(Integer.MIN_VALUE);
        double[] doubleArray = {java.lang.Double.NEGATIVE_INFINITY, java.lang.Double.NaN, 0.0};
        double[] doubleArray1 = {1.0, 1.0, java.lang.Double.POSITIVE_INFINITY, java.lang.Double.NEGATIVE_INFINITY, 1.0};
        
        /* This test fails because method [org.apache.commons.math.ode.nonstiff.RungeKuttaIntegrator.integrate] produces [java.lang.NullPointerException]
            org.apache.commons.math.ode.AbstractIntegrator.sanityChecks(AbstractIntegrator.java:198)
            org.apache.commons.math.ode.nonstiff.RungeKuttaIntegrator.integrate(RungeKuttaIntegrator.java:100) */
        gillIntegrator.integrate(null, 4.1145930515952665E303, doubleArray, java.lang.Double.POSITIVE_INFINITY, doubleArray1);
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
        
                java.lang.reflect.Method methodForGetDeclaredFields739140095475000 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields739140095475000.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass739140095480600 = (java.lang.reflect.Field[]) methodForGetDeclaredFields739140095475000.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass739140095480600).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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

