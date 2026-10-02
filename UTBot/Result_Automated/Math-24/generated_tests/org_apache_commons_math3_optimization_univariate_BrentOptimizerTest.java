package org.apache.commons.math3.optimization.univariate;

import org.junit.Test;
import org.apache.commons.math3.util.Incrementor;
import org.apache.commons.math3.util.Incrementor.MaxCountExceededCallback;
import org.apache.commons.math3.optimization.GoalType;
import org.apache.commons.math3.exception.TooManyEvaluationsException;
import org.apache.commons.math3.analysis.function.Acos;
import java.lang.reflect.Method;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertEquals;

public final class org_apache_commons_math3_optimization_univariate_BrentOptimizerTest {
    ///region Test suites for executable org.apache.commons.math3.optimization.univariate.BrentOptimizer.doOptimize
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method doOptimize()
    
    /**
    @utbot.classUnderTest {@link BrentOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.univariate.BrentOptimizer#doOptimize()}
 * @utbot.executesCondition {@code (lo < hi): True}
 * @utbot.throwsException {@link org.apache.commons.math3.exception.TooManyEvaluationsException} in: double fx = computeObjectiveValue(x);
 *  */
    @Test(expected = TooManyEvaluationsException.class)
    public void testDoOptimize_ThrowTooManyEvaluationsException() throws Exception  {
        BrentOptimizer brentOptimizer = ((BrentOptimizer) createInstance("org.apache.commons.math3.optimization.univariate.BrentOptimizer"));
        Incrementor evaluations = ((Incrementor) createInstance("org.apache.commons.math3.util.Incrementor"));
        Incrementor.MaxCountExceededCallback maxCountCallback = ((Incrementor.MaxCountExceededCallback) createInstance("org.apache.commons.math3.util.Incrementor$1"));
        setField(evaluations, "org.apache.commons.math3.util.Incrementor", "maxCountCallback", maxCountCallback);
        setField(brentOptimizer, "org.apache.commons.math3.optimization.univariate.BaseAbstractUnivariateOptimizer", "evaluations", evaluations);
        GoalType goal = GoalType.MINIMIZE;
        setField(brentOptimizer, "org.apache.commons.math3.optimization.univariate.BaseAbstractUnivariateOptimizer", "goal", goal);
        setField(brentOptimizer, "org.apache.commons.math3.optimization.univariate.BaseAbstractUnivariateOptimizer", "searchMin", -1.878200929445198E50);
        setField(brentOptimizer, "org.apache.commons.math3.optimization.univariate.BaseAbstractUnivariateOptimizer", "searchMax", -1.9468960492372947E-208);
        setField(brentOptimizer, "org.apache.commons.math3.optimization.univariate.BaseAbstractUnivariateOptimizer", "searchStart", 0.0);
        
        brentOptimizer.doOptimize();
    }
    
    /**
    @utbot.classUnderTest {@link BrentOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.univariate.BrentOptimizer#doOptimize()}
 * @utbot.executesCondition {@code (lo < hi): False}
 * @utbot.throwsException {@link org.apache.commons.math3.exception.TooManyEvaluationsException} in: double fx = computeObjectiveValue(x);
 *  */
    @Test(expected = TooManyEvaluationsException.class)
    public void testDoOptimize_ThrowTooManyEvaluationsException_1() throws Exception  {
        BrentOptimizer brentOptimizer = ((BrentOptimizer) createInstance("org.apache.commons.math3.optimization.univariate.BrentOptimizer"));
        Incrementor evaluations = ((Incrementor) createInstance("org.apache.commons.math3.util.Incrementor"));
        Incrementor.MaxCountExceededCallback maxCountCallback = ((Incrementor.MaxCountExceededCallback) createInstance("org.apache.commons.math3.util.Incrementor$1"));
        setField(evaluations, "org.apache.commons.math3.util.Incrementor", "maxCountCallback", maxCountCallback);
        setField(brentOptimizer, "org.apache.commons.math3.optimization.univariate.BaseAbstractUnivariateOptimizer", "evaluations", evaluations);
        GoalType goal = GoalType.MINIMIZE;
        setField(brentOptimizer, "org.apache.commons.math3.optimization.univariate.BaseAbstractUnivariateOptimizer", "goal", goal);
        setField(brentOptimizer, "org.apache.commons.math3.optimization.univariate.BaseAbstractUnivariateOptimizer", "searchMin", 4.9E-324);
        setField(brentOptimizer, "org.apache.commons.math3.optimization.univariate.BaseAbstractUnivariateOptimizer", "searchMax", 4.9E-324);
        setField(brentOptimizer, "org.apache.commons.math3.optimization.univariate.BaseAbstractUnivariateOptimizer", "searchStart", 0.0);
        
        brentOptimizer.doOptimize();
    }
    
    /**
    @utbot.classUnderTest {@link BrentOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.univariate.BrentOptimizer#doOptimize()}
 * @utbot.executesCondition {@code (lo < hi): False}
 * @utbot.throwsException {@link org.apache.commons.math3.exception.TooManyEvaluationsException} in: double fx = computeObjectiveValue(x);
 *  */
    @Test(expected = TooManyEvaluationsException.class)
    public void testDoOptimize_ThrowTooManyEvaluationsException_2() throws Exception  {
        BrentOptimizer brentOptimizer = ((BrentOptimizer) createInstance("org.apache.commons.math3.optimization.univariate.BrentOptimizer"));
        Incrementor evaluations = ((Incrementor) createInstance("org.apache.commons.math3.util.Incrementor"));
        Incrementor.MaxCountExceededCallback maxCountCallback = ((Incrementor.MaxCountExceededCallback) createInstance("org.apache.commons.math3.util.Incrementor$1"));
        setField(evaluations, "org.apache.commons.math3.util.Incrementor", "maxCountCallback", maxCountCallback);
        setField(brentOptimizer, "org.apache.commons.math3.optimization.univariate.BaseAbstractUnivariateOptimizer", "evaluations", evaluations);
        setField(brentOptimizer, "org.apache.commons.math3.optimization.univariate.BaseAbstractUnivariateOptimizer", "searchMin", 1.7078809685723383E-166);
        setField(brentOptimizer, "org.apache.commons.math3.optimization.univariate.BaseAbstractUnivariateOptimizer", "searchMax", 1.7078809685723383E-166);
        setField(brentOptimizer, "org.apache.commons.math3.optimization.univariate.BaseAbstractUnivariateOptimizer", "searchStart", 0.0);
        
        brentOptimizer.doOptimize();
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method doOptimize()
    
    @Test
    public void testDoOptimize1() throws Exception  {
        BrentOptimizer brentOptimizer = ((BrentOptimizer) createInstance("org.apache.commons.math3.optimization.univariate.BrentOptimizer"));
        setField(brentOptimizer, "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "relativeThreshold", 0.0);
        setField(brentOptimizer, "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "absoluteThreshold", java.lang.Double.NaN);
        Incrementor evaluations = ((Incrementor) createInstance("org.apache.commons.math3.util.Incrementor"));
        setField(evaluations, "org.apache.commons.math3.util.Incrementor", "count", -2);
        setField(brentOptimizer, "org.apache.commons.math3.optimization.univariate.BaseAbstractUnivariateOptimizer", "evaluations", evaluations);
        setField(brentOptimizer, "org.apache.commons.math3.optimization.univariate.BaseAbstractUnivariateOptimizer", "searchMin", -1.4289042378384215E193);
        setField(brentOptimizer, "org.apache.commons.math3.optimization.univariate.BaseAbstractUnivariateOptimizer", "searchMax", 8.398344302220313E154);
        setField(brentOptimizer, "org.apache.commons.math3.optimization.univariate.BaseAbstractUnivariateOptimizer", "searchStart", -2.0000000000000004);
        Acos function = ((Acos) createInstance("org.apache.commons.math3.analysis.function.Acos"));
        setField(brentOptimizer, "org.apache.commons.math3.optimization.univariate.BaseAbstractUnivariateOptimizer", "function", function);
        
        /* This test fails because method [org.apache.commons.math3.optimization.univariate.BrentOptimizer.doOptimize] produces [java.lang.NullPointerException]
            org.apache.commons.math3.util.Incrementor.incrementCount(Incrementor.java:156)
            org.apache.commons.math3.optimization.univariate.BaseAbstractUnivariateOptimizer.computeObjectiveValue(BaseAbstractUnivariateOptimizer.java:104)
            org.apache.commons.math3.optimization.univariate.BrentOptimizer.doOptimize(BrentOptimizer.java:219) */
        brentOptimizer.doOptimize();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.optimization.univariate.BrentOptimizer.best
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method best(org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair, org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair, boolean)
    
    /**
    @utbot.classUnderTest {@link BrentOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.univariate.BrentOptimizer#best(org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair,org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair,boolean)}
 * @utbot.executesCondition {@code (a == null): True}
 * @utbot.returnsFrom {@code return b;}
 *  */
    @Test
    public void testBest_AEqualsNull() throws Exception  {
        BrentOptimizer brentOptimizer = ((BrentOptimizer) createInstance("org.apache.commons.math3.optimization.univariate.BrentOptimizer"));
        
        Class brentOptimizerClazz = Class.forName("org.apache.commons.math3.optimization.univariate.BrentOptimizer");
        Class univariatePointValuePairType = Class.forName("org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair");
        Class booleanType = boolean.class;
        Method bestMethod = brentOptimizerClazz.getDeclaredMethod("best", univariatePointValuePairType, univariatePointValuePairType, booleanType);
        bestMethod.setAccessible(true);
        java.lang.Object[] bestMethodArguments = new java.lang.Object[3];
        bestMethodArguments[0] = ((Object) null);
        bestMethodArguments[1] = ((Object) null);
        bestMethodArguments[2] = false;
        UnivariatePointValuePair actual = ((UnivariatePointValuePair) bestMethod.invoke(brentOptimizer, bestMethodArguments));
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link BrentOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.univariate.BrentOptimizer#best(org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair,org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair,boolean)}
 * @utbot.executesCondition {@code (a == null): False}
 * @utbot.executesCondition {@code (b == null): True}
 * @utbot.returnsFrom {@code return a;}
 *  */
    @Test
    public void testBest_BEqualsNull() throws Exception  {
        BrentOptimizer brentOptimizer = ((BrentOptimizer) createInstance("org.apache.commons.math3.optimization.univariate.BrentOptimizer"));
        UnivariatePointValuePair univariatePointValuePair = new UnivariatePointValuePair(0.0, 0.0);
        
        Class brentOptimizerClazz = Class.forName("org.apache.commons.math3.optimization.univariate.BrentOptimizer");
        Class univariatePointValuePairType = Class.forName("org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair");
        Class booleanType = boolean.class;
        Method bestMethod = brentOptimizerClazz.getDeclaredMethod("best", univariatePointValuePairType, univariatePointValuePairType, booleanType);
        bestMethod.setAccessible(true);
        java.lang.Object[] bestMethodArguments = new java.lang.Object[3];
        bestMethodArguments[0] = univariatePointValuePair;
        bestMethodArguments[1] = ((Object) null);
        bestMethodArguments[2] = false;
        UnivariatePointValuePair actual = ((UnivariatePointValuePair) bestMethod.invoke(brentOptimizer, bestMethodArguments));
        
        double univariatePointValuePairPoint = univariatePointValuePair.getPoint();
        double actualPoint = actual.getPoint();
        assertEquals(univariatePointValuePairPoint, actualPoint, 1.0E-6);
        
        double univariatePointValuePairValue = univariatePointValuePair.getValue();
        double actualValue = actual.getValue();
        assertEquals(univariatePointValuePairValue, actualValue, 1.0E-6);
        
    }
    
    /**
    @utbot.classUnderTest {@link BrentOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.univariate.BrentOptimizer#best(org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair,org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair,boolean)}
 * @utbot.executesCondition {@code (a == null): False}
 * @utbot.executesCondition {@code (b == null): False}
 * @utbot.executesCondition {@code (isMinim): True}
 * @utbot.executesCondition {@code (a.getValue() < b.getValue()): False}
 * @utbot.returnsFrom {@code return a.getValue() < b.getValue() ? a : b;}
 *  */
    @Test
    public void testBest_AGetValueGreaterOrEqualBGetValue() throws Exception  {
        BrentOptimizer brentOptimizer = ((BrentOptimizer) createInstance("org.apache.commons.math3.optimization.univariate.BrentOptimizer"));
        UnivariatePointValuePair univariatePointValuePair = new UnivariatePointValuePair(0.0, 4.9E-324);
        
        Class brentOptimizerClazz = Class.forName("org.apache.commons.math3.optimization.univariate.BrentOptimizer");
        Class univariatePointValuePairType = Class.forName("org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair");
        Class booleanType = boolean.class;
        Method bestMethod = brentOptimizerClazz.getDeclaredMethod("best", univariatePointValuePairType, univariatePointValuePairType, booleanType);
        bestMethod.setAccessible(true);
        java.lang.Object[] bestMethodArguments = new java.lang.Object[3];
        bestMethodArguments[0] = univariatePointValuePair;
        bestMethodArguments[1] = univariatePointValuePair;
        bestMethodArguments[2] = true;
        UnivariatePointValuePair actual = ((UnivariatePointValuePair) bestMethod.invoke(brentOptimizer, bestMethodArguments));
        
        double univariatePointValuePairPoint = univariatePointValuePair.getPoint();
        double actualPoint = actual.getPoint();
        assertEquals(univariatePointValuePairPoint, actualPoint, 1.0E-6);
        
        double univariatePointValuePairValue = univariatePointValuePair.getValue();
        double actualValue = actual.getValue();
        assertEquals(univariatePointValuePairValue, actualValue, 1.0E-6);
        
    }
    
    /**
    @utbot.classUnderTest {@link BrentOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.univariate.BrentOptimizer#best(org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair,org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair,boolean)}
 * @utbot.executesCondition {@code (a == null): False}
 * @utbot.executesCondition {@code (b == null): False}
 * @utbot.executesCondition {@code (isMinim): True}
 * @utbot.executesCondition {@code (a.getValue() < b.getValue()): True}
 * @utbot.returnsFrom {@code return a.getValue() < b.getValue() ? a : b;}
 *  */
    @Test
    public void testBest_AGetValueLessThanBGetValue() throws Exception  {
        BrentOptimizer brentOptimizer = ((BrentOptimizer) createInstance("org.apache.commons.math3.optimization.univariate.BrentOptimizer"));
        UnivariatePointValuePair univariatePointValuePair = new UnivariatePointValuePair(0.0, 4.414726859451519E217);
        UnivariatePointValuePair univariatePointValuePair1 = new UnivariatePointValuePair(0.0, 2.21691826503271E276);
        
        Class brentOptimizerClazz = Class.forName("org.apache.commons.math3.optimization.univariate.BrentOptimizer");
        Class univariatePointValuePairType = Class.forName("org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair");
        Class booleanType = boolean.class;
        Method bestMethod = brentOptimizerClazz.getDeclaredMethod("best", univariatePointValuePairType, univariatePointValuePairType, booleanType);
        bestMethod.setAccessible(true);
        java.lang.Object[] bestMethodArguments = new java.lang.Object[3];
        bestMethodArguments[0] = univariatePointValuePair;
        bestMethodArguments[1] = univariatePointValuePair1;
        bestMethodArguments[2] = true;
        UnivariatePointValuePair actual = ((UnivariatePointValuePair) bestMethod.invoke(brentOptimizer, bestMethodArguments));
        
        double univariatePointValuePairPoint = univariatePointValuePair.getPoint();
        double actualPoint = actual.getPoint();
        assertEquals(univariatePointValuePairPoint, actualPoint, 1.0E-6);
        
        double univariatePointValuePairValue = univariatePointValuePair.getValue();
        double actualValue = actual.getValue();
        assertEquals(univariatePointValuePairValue, actualValue, 1.0E-6);
        
    }
    
    /**
    @utbot.classUnderTest {@link BrentOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.univariate.BrentOptimizer#best(org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair,org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair,boolean)}
 * @utbot.executesCondition {@code (a == null): False}
 * @utbot.executesCondition {@code (b == null): False}
 * @utbot.executesCondition {@code (isMinim): False}
 * @utbot.executesCondition {@code (a.getValue() > b.getValue()): True}
 * @utbot.returnsFrom {@code return a.getValue() > b.getValue() ? a : b;}
 *  */
    @Test
    public void testBest_AGetValueGreaterThanBGetValue() throws Exception  {
        BrentOptimizer brentOptimizer = ((BrentOptimizer) createInstance("org.apache.commons.math3.optimization.univariate.BrentOptimizer"));
        UnivariatePointValuePair univariatePointValuePair = new UnivariatePointValuePair(0.0, 1024.744140625);
        UnivariatePointValuePair univariatePointValuePair1 = new UnivariatePointValuePair(0.0, 32.01354980468751);
        
        Class brentOptimizerClazz = Class.forName("org.apache.commons.math3.optimization.univariate.BrentOptimizer");
        Class univariatePointValuePairType = Class.forName("org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair");
        Class booleanType = boolean.class;
        Method bestMethod = brentOptimizerClazz.getDeclaredMethod("best", univariatePointValuePairType, univariatePointValuePairType, booleanType);
        bestMethod.setAccessible(true);
        java.lang.Object[] bestMethodArguments = new java.lang.Object[3];
        bestMethodArguments[0] = univariatePointValuePair;
        bestMethodArguments[1] = univariatePointValuePair1;
        bestMethodArguments[2] = false;
        UnivariatePointValuePair actual = ((UnivariatePointValuePair) bestMethod.invoke(brentOptimizer, bestMethodArguments));
        
        double univariatePointValuePairPoint = univariatePointValuePair.getPoint();
        double actualPoint = actual.getPoint();
        assertEquals(univariatePointValuePairPoint, actualPoint, 1.0E-6);
        
        double univariatePointValuePairValue = univariatePointValuePair.getValue();
        double actualValue = actual.getValue();
        assertEquals(univariatePointValuePairValue, actualValue, 1.0E-6);
        
    }
    
    /**
    @utbot.classUnderTest {@link BrentOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.univariate.BrentOptimizer#best(org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair,org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair,boolean)}
 * @utbot.executesCondition {@code (a == null): False}
 * @utbot.executesCondition {@code (b == null): False}
 * @utbot.executesCondition {@code (isMinim): False}
 * @utbot.executesCondition {@code (a.getValue() > b.getValue()): False}
 * @utbot.returnsFrom {@code return a.getValue() > b.getValue() ? a : b;}
 *  */
    @Test
    public void testBest_AGetValueLessOrEqualBGetValue() throws Exception  {
        BrentOptimizer brentOptimizer = ((BrentOptimizer) createInstance("org.apache.commons.math3.optimization.univariate.BrentOptimizer"));
        UnivariatePointValuePair univariatePointValuePair = new UnivariatePointValuePair(0.0, -1.7800590868057611E-307);
        UnivariatePointValuePair univariatePointValuePair1 = new UnivariatePointValuePair(0.0, -1.7800590868057611E-307);
        
        Class brentOptimizerClazz = Class.forName("org.apache.commons.math3.optimization.univariate.BrentOptimizer");
        Class univariatePointValuePairType = Class.forName("org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair");
        Class booleanType = boolean.class;
        Method bestMethod = brentOptimizerClazz.getDeclaredMethod("best", univariatePointValuePairType, univariatePointValuePairType, booleanType);
        bestMethod.setAccessible(true);
        java.lang.Object[] bestMethodArguments = new java.lang.Object[3];
        bestMethodArguments[0] = univariatePointValuePair;
        bestMethodArguments[1] = univariatePointValuePair1;
        bestMethodArguments[2] = false;
        UnivariatePointValuePair actual = ((UnivariatePointValuePair) bestMethod.invoke(brentOptimizer, bestMethodArguments));
        
        double univariatePointValuePair1Point = univariatePointValuePair1.getPoint();
        double actualPoint = actual.getPoint();
        assertEquals(univariatePointValuePair1Point, actualPoint, 1.0E-6);
        
        double univariatePointValuePair1Value = univariatePointValuePair1.getValue();
        double actualValue = actual.getValue();
        assertEquals(univariatePointValuePair1Value, actualValue, 1.0E-6);
        
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
        
                java.lang.reflect.Method methodForGetDeclaredFields722264342926300 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields722264342926300.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass722264342932700 = (java.lang.reflect.Field[]) methodForGetDeclaredFields722264342926300.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass722264342932700).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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

