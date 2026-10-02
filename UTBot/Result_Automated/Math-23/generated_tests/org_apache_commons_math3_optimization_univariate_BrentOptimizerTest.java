package org.apache.commons.math3.optimization.univariate;

import org.junit.Test;
import org.apache.commons.math3.util.Incrementor;
import org.apache.commons.math3.util.Incrementor.MaxCountExceededCallback;
import org.apache.commons.math3.optimization.GoalType;
import org.apache.commons.math3.exception.TooManyEvaluationsException;
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
        setField(brentOptimizer, "org.apache.commons.math3.optimization.univariate.BaseAbstractUnivariateOptimizer", "searchMin", -4.13825773286811E90);
        setField(brentOptimizer, "org.apache.commons.math3.optimization.univariate.BaseAbstractUnivariateOptimizer", "searchMax", 1.5659043478627052E-185);
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
        GoalType goal = GoalType.MINIMIZE;
        setField(brentOptimizer, "org.apache.commons.math3.optimization.univariate.BaseAbstractUnivariateOptimizer", "goal", goal);
        setField(brentOptimizer, "org.apache.commons.math3.optimization.univariate.BaseAbstractUnivariateOptimizer", "searchMin", -7.251804806042323E167);
        setField(brentOptimizer, "org.apache.commons.math3.optimization.univariate.BaseAbstractUnivariateOptimizer", "searchMax", -7.251804806042323E167);
        setField(brentOptimizer, "org.apache.commons.math3.optimization.univariate.BaseAbstractUnivariateOptimizer", "searchStart", 0.0);
        
        brentOptimizer.doOptimize();
    }
    
    /**
    @utbot.classUnderTest {@link BrentOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.univariate.BrentOptimizer#doOptimize()}
 * @utbot.executesCondition {@code (lo < hi): True}
 * @utbot.throwsException {@link org.apache.commons.math3.exception.TooManyEvaluationsException} in: double fx = computeObjectiveValue(x);
 *  */
    @Test(expected = TooManyEvaluationsException.class)
    public void testDoOptimize_ThrowTooManyEvaluationsException_1() throws Exception  {
        BrentOptimizer brentOptimizer = ((BrentOptimizer) createInstance("org.apache.commons.math3.optimization.univariate.BrentOptimizer"));
        Incrementor evaluations = ((Incrementor) createInstance("org.apache.commons.math3.util.Incrementor"));
        Incrementor.MaxCountExceededCallback maxCountCallback = ((Incrementor.MaxCountExceededCallback) createInstance("org.apache.commons.math3.util.Incrementor$1"));
        setField(evaluations, "org.apache.commons.math3.util.Incrementor", "maxCountCallback", maxCountCallback);
        setField(brentOptimizer, "org.apache.commons.math3.optimization.univariate.BaseAbstractUnivariateOptimizer", "evaluations", evaluations);
        setField(brentOptimizer, "org.apache.commons.math3.optimization.univariate.BaseAbstractUnivariateOptimizer", "searchMin", -1.3964540903424E13);
        setField(brentOptimizer, "org.apache.commons.math3.optimization.univariate.BaseAbstractUnivariateOptimizer", "searchMax", 5.570862050878216E-283);
        setField(brentOptimizer, "org.apache.commons.math3.optimization.univariate.BaseAbstractUnivariateOptimizer", "searchStart", 0.0);
        
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
 * @utbot.executesCondition {@code (a.getValue() <= b.getValue()): False}
 * @utbot.returnsFrom {@code return a.getValue() <= b.getValue() ? a : b;}
 *  */
    @Test
    public void testBest_AGetValueGreaterThanBGetValue() throws Exception  {
        BrentOptimizer brentOptimizer = ((BrentOptimizer) createInstance("org.apache.commons.math3.optimization.univariate.BrentOptimizer"));
        UnivariatePointValuePair univariatePointValuePair = new UnivariatePointValuePair(0.0, 7.637341136359508E-152);
        UnivariatePointValuePair univariatePointValuePair1 = new UnivariatePointValuePair(0.0, -6.864797864717524E156);
        
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
        
        double univariatePointValuePair1Point = univariatePointValuePair1.getPoint();
        double actualPoint = actual.getPoint();
        assertEquals(univariatePointValuePair1Point, actualPoint, 1.0E-6);
        
        double univariatePointValuePair1Value = univariatePointValuePair1.getValue();
        double actualValue = actual.getValue();
        assertEquals(univariatePointValuePair1Value, actualValue, 1.0E-6);
        
    }
    
    /**
    @utbot.classUnderTest {@link BrentOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.univariate.BrentOptimizer#best(org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair,org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair,boolean)}
 * @utbot.executesCondition {@code (a == null): False}
 * @utbot.executesCondition {@code (b == null): False}
 * @utbot.executesCondition {@code (isMinim): True}
 * @utbot.executesCondition {@code (a.getValue() <= b.getValue()): True}
 * @utbot.returnsFrom {@code return a.getValue() <= b.getValue() ? a : b;}
 *  */
    @Test
    public void testBest_AGetValueLessOrEqualBGetValue() throws Exception  {
        BrentOptimizer brentOptimizer = ((BrentOptimizer) createInstance("org.apache.commons.math3.optimization.univariate.BrentOptimizer"));
        UnivariatePointValuePair univariatePointValuePair = new UnivariatePointValuePair(0.0, -3.839442778483072E-93);
        UnivariatePointValuePair univariatePointValuePair1 = new UnivariatePointValuePair(0.0, -3.839442778483072E-93);
        
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
 * @utbot.executesCondition {@code (a.getValue() >= b.getValue()): True}
 * @utbot.returnsFrom {@code return a.getValue() >= b.getValue() ? a : b;}
 *  */
    @Test
    public void testBest_AGetValueGreaterOrEqualBGetValue() throws Exception  {
        BrentOptimizer brentOptimizer = ((BrentOptimizer) createInstance("org.apache.commons.math3.optimization.univariate.BrentOptimizer"));
        UnivariatePointValuePair univariatePointValuePair = new UnivariatePointValuePair(0.0, 0.0);
        UnivariatePointValuePair univariatePointValuePair1 = new UnivariatePointValuePair(0.0, -0.0);
        
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
 * @utbot.executesCondition {@code (a.getValue() >= b.getValue()): False}
 * @utbot.returnsFrom {@code return a.getValue() >= b.getValue() ? a : b;}
 *  */
    @Test
    public void testBest_AGetValueLessThanBGetValue() throws Exception  {
        BrentOptimizer brentOptimizer = ((BrentOptimizer) createInstance("org.apache.commons.math3.optimization.univariate.BrentOptimizer"));
        UnivariatePointValuePair univariatePointValuePair = new UnivariatePointValuePair(0.0, -8.58136334967093E155);
        UnivariatePointValuePair univariatePointValuePair1 = new UnivariatePointValuePair(0.0, -8.00034147500992);
        
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
        
                java.lang.reflect.Method methodForGetDeclaredFields721882128540100 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields721882128540100.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass721882128546700 = (java.lang.reflect.Field[]) methodForGetDeclaredFields721882128540100.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass721882128546700).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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

