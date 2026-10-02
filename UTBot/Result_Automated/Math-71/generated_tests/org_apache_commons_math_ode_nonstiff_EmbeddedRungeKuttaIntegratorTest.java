package org.apache.commons.math.ode.nonstiff;

import org.junit.Test;
import org.apache.commons.math.ode.FirstOrderConverter;
import java.util.HashSet;
import org.apache.commons.math.ode.IntegratorException;
import org.apache.commons.math.ode.DerivativeException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

import static org.junit.Assert.assertEquals;

public final class org_apache_commons_math_ode_nonstiff_EmbeddedRungeKuttaIntegratorTest {
    ///region Test suites for executable org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator.setMinReduction
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setMinReduction(double)
    
    /**
    @utbot.classUnderTest {@link EmbeddedRungeKuttaIntegrator}
 * @utbot.methodUnderTest {@link org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator#setMinReduction(double)}
 *  */
    @Test
    public void testSetMinReduction() throws Exception  {
        DormandPrince54Integrator dormandPrince54Integrator = ((DormandPrince54Integrator) createInstance("org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator"));
        dormandPrince54Integrator.setMinReduction(0.0);
        
        dormandPrince54Integrator.setMinReduction(java.lang.Double.NaN);
        
        double finalDormandPrince54IntegratorMinReduction = ((Double) getFieldValue(dormandPrince54Integrator, "org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "minReduction"));
        
        assertEquals(java.lang.Double.NaN, finalDormandPrince54IntegratorMinReduction, 1.0E-6);
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
        DormandPrince54Integrator dormandPrince54Integrator = ((DormandPrince54Integrator) createInstance("org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator"));
        dormandPrince54Integrator.setMinReduction(0.0);
        
        double actual = dormandPrince54Integrator.getMinReduction();
        
        assertEquals(0.0, actual, 1.0E-6);
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
        DormandPrince54Integrator dormandPrince54Integrator = ((DormandPrince54Integrator) createInstance("org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator"));
        dormandPrince54Integrator.setSafety(0.0);
        
        dormandPrince54Integrator.setSafety(java.lang.Double.NaN);
        
        double finalDormandPrince54IntegratorSafety = ((Double) getFieldValue(dormandPrince54Integrator, "org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "safety"));
        
        assertEquals(java.lang.Double.NaN, finalDormandPrince54IntegratorSafety, 1.0E-6);
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
        DormandPrince54Integrator dormandPrince54Integrator = ((DormandPrince54Integrator) createInstance("org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator"));
        dormandPrince54Integrator.setMaxGrowth(0.0);
        
        double actual = dormandPrince54Integrator.getMaxGrowth();
        
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
        DormandPrince54Integrator dormandPrince54Integrator = ((DormandPrince54Integrator) createInstance("org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator"));
        dormandPrince54Integrator.setMaxGrowth(0.0);
        
        dormandPrince54Integrator.setMaxGrowth(java.lang.Double.NaN);
        
        double finalDormandPrince54IntegratorMaxGrowth = ((Double) getFieldValue(dormandPrince54Integrator, "org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "maxGrowth"));
        
        assertEquals(java.lang.Double.NaN, finalDormandPrince54IntegratorMaxGrowth, 1.0E-6);
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
        DormandPrince54Integrator dormandPrince54Integrator = ((DormandPrince54Integrator) createInstance("org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator"));
        dormandPrince54Integrator.setSafety(0.0);
        
        double actual = dormandPrince54Integrator.getSafety();
        
        assertEquals(0.0, actual, 1.0E-6);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator.integrate
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method integrate(org.apache.commons.math.ode.FirstOrderDifferentialEquations, double, [D, double, [D)
    
    /**
    @utbot.classUnderTest {@link EmbeddedRungeKuttaIntegrator}
 * @utbot.methodUnderTest {@link org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator#integrate(org.apache.commons.math.ode.FirstOrderDifferentialEquations,double,double[],double,double[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: final int stages = c.length + 1;
 *  */
    @Test
    public void testIntegrate_ThrowNullPointerException_2() throws Exception  {
        DormandPrince853Integrator dormandPrince853Integrator = ((DormandPrince853Integrator) createInstance("org.apache.commons.math.ode.nonstiff.DormandPrince853Integrator"));
        double[] vecAbsoluteTolerance = {};
        setField(dormandPrince853Integrator, "org.apache.commons.math.ode.nonstiff.AdaptiveStepsizeIntegrator", "vecAbsoluteTolerance", vecAbsoluteTolerance);
        double[] vecRelativeTolerance = {};
        setField(dormandPrince853Integrator, "org.apache.commons.math.ode.nonstiff.AdaptiveStepsizeIntegrator", "vecRelativeTolerance", vecRelativeTolerance);
        FirstOrderConverter firstOrderConverter = ((FirstOrderConverter) createInstance("org.apache.commons.math.ode.FirstOrderConverter"));
        double[] doubleArray = {};
        double[] doubleArray1 = {};
        
        /* This test fails because method [org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator.integrate] produces [java.lang.NullPointerException]
            org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator.integrate(EmbeddedRungeKuttaIntegrator.java:203) */
        dormandPrince853Integrator.integrate(firstOrderConverter, -2.5652630318088426E-159, doubleArray, 2.5652630318088426E-159, doubleArray1);
    }
    
    /**
    @utbot.classUnderTest {@link EmbeddedRungeKuttaIntegrator}
 * @utbot.methodUnderTest {@link org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator#integrate(org.apache.commons.math.ode.FirstOrderDifferentialEquations,double,double[],double,double[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: final int stages = c.length + 1;
 *  */
    @Test
    public void testIntegrate_ThrowNullPointerException_1() throws Exception  {
        HighamHall54Integrator highamHall54Integrator = ((HighamHall54Integrator) createInstance("org.apache.commons.math.ode.nonstiff.HighamHall54Integrator"));
        double[] vecAbsoluteTolerance = {};
        setField(highamHall54Integrator, "org.apache.commons.math.ode.nonstiff.AdaptiveStepsizeIntegrator", "vecAbsoluteTolerance", vecAbsoluteTolerance);
        FirstOrderConverter firstOrderConverter = ((FirstOrderConverter) createInstance("org.apache.commons.math.ode.FirstOrderConverter"));
        double[] doubleArray = {};
        double[] doubleArray1 = {};
        
        /* This test fails because method [org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator.integrate] produces [java.lang.NullPointerException]
            org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator.integrate(EmbeddedRungeKuttaIntegrator.java:203) */
        highamHall54Integrator.integrate(firstOrderConverter, -1.302762880477897E225, doubleArray, java.lang.Double.NaN, doubleArray1);
    }
    
    /**
    @utbot.classUnderTest {@link EmbeddedRungeKuttaIntegrator}
 * @utbot.methodUnderTest {@link org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator#integrate(org.apache.commons.math.ode.FirstOrderDifferentialEquations,double,double[],double,double[])}
 * @utbot.executesCondition {@code (y != y0): False}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.invokes {@link org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator#requiresDenseOutput()}
 * @utbot.invokes {@link org.apache.commons.math.ode.events.CombinedEventsManager#isEmpty()}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: requiresDenseOutput() || (!eventsHandlersManager.isEmpty())
 *  */
    @Test
    public void testIntegrate_ThrowNullPointerException() throws Exception  {
        DormandPrince853Integrator dormandPrince853Integrator = ((DormandPrince853Integrator) createInstance("org.apache.commons.math.ode.nonstiff.DormandPrince853Integrator"));
        double[] c = {};
        setField(dormandPrince853Integrator, "org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "c", c);
        HashSet stepHandlers = new HashSet();
        setField(dormandPrince853Integrator, "org.apache.commons.math.ode.AbstractIntegrator", "stepHandlers", stepHandlers);
        FirstOrderConverter equations = ((FirstOrderConverter) createInstance("org.apache.commons.math.ode.FirstOrderConverter"));
        setField(dormandPrince853Integrator, "org.apache.commons.math.ode.AbstractIntegrator", "equations", equations);
        FirstOrderConverter firstOrderConverter = ((FirstOrderConverter) createInstance("org.apache.commons.math.ode.FirstOrderConverter"));
        setField(firstOrderConverter, "org.apache.commons.math.ode.FirstOrderConverter", "dimension", 1);
        double[] doubleArray = {0.0, 0.0};
        
        /* This test fails because method [org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator.integrate] produces [java.lang.NullPointerException]
            org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator.integrate(EmbeddedRungeKuttaIntegrator.java:212) */
        dormandPrince853Integrator.integrate(firstOrderConverter, 0.0, doubleArray, java.lang.Double.NaN, doubleArray);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: CHECKED EXCEPTIONS for method integrate(org.apache.commons.math.ode.FirstOrderDifferentialEquations, double, [D, double, [D)
    
    /**
    @utbot.classUnderTest {@link EmbeddedRungeKuttaIntegrator}
 * @utbot.methodUnderTest {@link org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator#integrate(org.apache.commons.math.ode.FirstOrderDifferentialEquations,double,double[],double,double[])}
 * @utbot.throwsException {@link org.apache.commons.math.ode.IntegratorException} in: sanityChecks(equations, t0, y0, t, y);
 *  */
    @Test(expected = IntegratorException.class)
    public void testIntegrate_ThrowIntegratorException_1() throws Exception  {
        DormandPrince54Integrator dormandPrince54Integrator = ((DormandPrince54Integrator) createInstance("org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator"));
        FirstOrderConverter firstOrderConverter = ((FirstOrderConverter) createInstance("org.apache.commons.math.ode.FirstOrderConverter"));
        setField(firstOrderConverter, "org.apache.commons.math.ode.FirstOrderConverter", "dimension", 1);
        double[] doubleArray = {0.0, 0.0};
        double[] doubleArray1 = {0.0};
        
        dormandPrince54Integrator.integrate(firstOrderConverter, java.lang.Double.NaN, doubleArray, java.lang.Double.NaN, doubleArray1);
    }
    
    /**
    @utbot.classUnderTest {@link EmbeddedRungeKuttaIntegrator}
 * @utbot.methodUnderTest {@link org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator#integrate(org.apache.commons.math.ode.FirstOrderDifferentialEquations,double,double[],double,double[])}
 * @utbot.throwsException {@link org.apache.commons.math.ode.IntegratorException} in: sanityChecks(equations, t0, y0, t, y);
 *  */
    @Test(expected = IntegratorException.class)
    public void testIntegrate_ThrowIntegratorException() throws Exception  {
        DormandPrince54Integrator dormandPrince54Integrator = ((DormandPrince54Integrator) createInstance("org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator"));
        FirstOrderConverter firstOrderConverter = ((FirstOrderConverter) createInstance("org.apache.commons.math.ode.FirstOrderConverter"));
        setField(firstOrderConverter, "org.apache.commons.math.ode.FirstOrderConverter", "dimension", 2147483646);
        double[] doubleArray = {0.0, 0.0};
        
        dormandPrince54Integrator.integrate(firstOrderConverter, java.lang.Double.NaN, doubleArray, java.lang.Double.NaN, null);
    }
    
    /**
    @utbot.classUnderTest {@link EmbeddedRungeKuttaIntegrator}
 * @utbot.methodUnderTest {@link org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator#integrate(org.apache.commons.math.ode.FirstOrderDifferentialEquations,double,double[],double,double[])}
 * @utbot.throwsException {@link org.apache.commons.math.ode.IntegratorException} in: sanityChecks(equations, t0, y0, t, y);
 *  */
    @Test(expected = IntegratorException.class)
    public void testIntegrate_ThrowIntegratorException_2() throws Exception  {
        DormandPrince54Integrator dormandPrince54Integrator = ((DormandPrince54Integrator) createInstance("org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator"));
        double[] vecAbsoluteTolerance = {0.0};
        setField(dormandPrince54Integrator, "org.apache.commons.math.ode.nonstiff.AdaptiveStepsizeIntegrator", "vecAbsoluteTolerance", vecAbsoluteTolerance);
        FirstOrderConverter firstOrderConverter = ((FirstOrderConverter) createInstance("org.apache.commons.math.ode.FirstOrderConverter"));
        setField(firstOrderConverter, "org.apache.commons.math.ode.FirstOrderConverter", "dimension", 1);
        double[] doubleArray = {0.0, 0.0};
        
        dormandPrince54Integrator.integrate(firstOrderConverter, -2.1505380254467983E-296, doubleArray, 0.0, doubleArray);
    }
    
    /**
    @utbot.classUnderTest {@link EmbeddedRungeKuttaIntegrator}
 * @utbot.methodUnderTest {@link org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator#integrate(org.apache.commons.math.ode.FirstOrderDifferentialEquations,double,double[],double,double[])}
 * @utbot.throwsException {@link org.apache.commons.math.ode.IntegratorException} in: sanityChecks(equations, t0, y0, t, y);
 *  */
    @Test(expected = IntegratorException.class)
    public void testIntegrate_ThrowIntegratorException_3() throws Exception  {
        DormandPrince853Integrator dormandPrince853Integrator = ((DormandPrince853Integrator) createInstance("org.apache.commons.math.ode.nonstiff.DormandPrince853Integrator"));
        double[] vecAbsoluteTolerance = {0.0, 0.0};
        setField(dormandPrince853Integrator, "org.apache.commons.math.ode.nonstiff.AdaptiveStepsizeIntegrator", "vecAbsoluteTolerance", vecAbsoluteTolerance);
        double[] vecRelativeTolerance = {0.0};
        setField(dormandPrince853Integrator, "org.apache.commons.math.ode.nonstiff.AdaptiveStepsizeIntegrator", "vecRelativeTolerance", vecRelativeTolerance);
        FirstOrderConverter firstOrderConverter = ((FirstOrderConverter) createInstance("org.apache.commons.math.ode.FirstOrderConverter"));
        setField(firstOrderConverter, "org.apache.commons.math.ode.FirstOrderConverter", "dimension", 1);
        double[] doubleArray = {0.0, 0.0};
        double[] doubleArray1 = {0.0, 0.0};
        
        dormandPrince853Integrator.integrate(firstOrderConverter, -5.562684646351338E-309, doubleArray, -1.456028631945964E-309, doubleArray1);
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method integrate(org.apache.commons.math.ode.FirstOrderDifferentialEquations, double, [D, double, [D)
    
    @Test
    public void testIntegrateByFuzzer() throws DerivativeException, IntegratorException  {
        HighamHall54Integrator highamHall54Integrator = new HighamHall54Integrator(0.0, 1.0, java.lang.Double.POSITIVE_INFINITY, 0.0);
        highamHall54Integrator.setSafety(java.lang.Double.NEGATIVE_INFINITY);
        highamHall54Integrator.setMaxEvaluations(-1);
        highamHall54Integrator.setMaxGrowth(1.0);
        highamHall54Integrator.setMinReduction(java.lang.Double.NaN);
        double[] doubleArray = {java.lang.Double.NaN};
        double[] doubleArray1 = {1.0, -1.0, -1.0};
        
        /* This test fails because method [org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator.integrate] produces [java.lang.NullPointerException]
            org.apache.commons.math.ode.AbstractIntegrator.sanityChecks(AbstractIntegrator.java:198)
            org.apache.commons.math.ode.nonstiff.AdaptiveStepsizeIntegrator.sanityChecks(AdaptiveStepsizeIntegrator.java:171)
            org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator.integrate(EmbeddedRungeKuttaIntegrator.java:197) */
        highamHall54Integrator.integrate(null, 2.9387358770557188E-39, doubleArray, 0.0, doubleArray1);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method integrate(org.apache.commons.math.ode.FirstOrderDifferentialEquations, double, [D, double, [D)
    
    @Test
    public void testIntegrate1() throws Exception  {
        DormandPrince54Integrator dormandPrince54Integrator = ((DormandPrince54Integrator) createInstance("org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator"));
        FirstOrderConverter firstOrderConverter = ((FirstOrderConverter) createInstance("org.apache.commons.math.ode.FirstOrderConverter"));
        double[] doubleArray = {};
        double[] doubleArray1 = {};
        
        /* This test fails because method [org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator.integrate] produces [java.lang.NullPointerException]
            org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator.integrate(EmbeddedRungeKuttaIntegrator.java:203) */
        dormandPrince54Integrator.integrate(firstOrderConverter, 1.4473208395425877E76, doubleArray, 4.631696824077391E77, doubleArray1);
    }
    
    @Test
    public void testIntegrate2() throws Exception  {
        HighamHall54Integrator highamHall54Integrator = ((HighamHall54Integrator) createInstance("org.apache.commons.math.ode.nonstiff.HighamHall54Integrator"));
        double[] vecRelativeTolerance = {0.0, 0.0, 0.0, 0.0};
        setField(highamHall54Integrator, "org.apache.commons.math.ode.nonstiff.AdaptiveStepsizeIntegrator", "vecRelativeTolerance", vecRelativeTolerance);
        FirstOrderConverter firstOrderConverter = ((FirstOrderConverter) createInstance("org.apache.commons.math.ode.FirstOrderConverter"));
        setField(firstOrderConverter, "org.apache.commons.math.ode.FirstOrderConverter", "dimension", 2);
        double[] doubleArray = {0.0, 0.0, 0.0, 0.0};
        double[] doubleArray1 = {0.0, 0.0, 0.0, 0.0};
        
        /* This test fails because method [org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator.integrate] produces [java.lang.NullPointerException]
            org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator.integrate(EmbeddedRungeKuttaIntegrator.java:203) */
        highamHall54Integrator.integrate(firstOrderConverter, java.lang.Double.NaN, doubleArray, -7.130492547060324E-306, doubleArray1);
    }
    ///endregion
    
    ///endregion
    
    ///region Util methods
    
    private static Object createInstance(String className) throws Exception {
        Class<?> clazz = Class.forName(className);
        return Class.forName("sun.misc.Unsafe").getDeclaredMethod("allocateInstance", Class.class)
            .invoke(getUnsafeInstance(), clazz);
    }
    
    private static Object getFieldValue(Object obj, String fieldClassName, String fieldName) throws ClassNotFoundException, NoSuchMethodException, java.lang.reflect.InvocationTargetException, IllegalAccessException, NoSuchFieldException {
        Class<?> clazz = Class.forName(fieldClassName);
        java.lang.reflect.Field field = clazz.getDeclaredField(fieldName);
        
        field.setAccessible(true);
        
        java.lang.reflect.Field modifiersField;
        
            java.lang.reflect.Method methodForGetDeclaredFields739013808488900 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields739013808488900.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass739013808496400 = (java.lang.reflect.Field[]) methodForGetDeclaredFields739013808488900.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass739013808496400).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
        modifiersField.setAccessible(true);
        modifiersField.setInt(field, field.getModifiers() & ~java.lang.reflect.Modifier.FINAL);
        
        return field.get(obj);
    }
    
        private static void setField(Object object, String fieldClassName, String fieldName, Object fieldValue) throws ClassNotFoundException, NoSuchFieldException, NoSuchMethodException, IllegalAccessException, java.lang.reflect.InvocationTargetException {
        Class<?> clazz = Class.forName(fieldClassName);
        java.lang.reflect.Field field = clazz.getDeclaredField(fieldName);
    
        java.lang.reflect.Field modifiersField;
        
                java.lang.reflect.Method methodForGetDeclaredFields739013808952000 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields739013808952000.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass739013808954600 = (java.lang.reflect.Field[]) methodForGetDeclaredFields739013808952000.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass739013808954600).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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

