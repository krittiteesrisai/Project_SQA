package org.apache.commons.collections.functors;

import org.junit.Test;
import org.apache.commons.collections.Predicate;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.lang.reflect.Array;

import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertArrayEquals;

public final class org_apache_commons_collections_functors_EqualPredicateTest {
    ///region Test suites for executable org.apache.commons.collections.functors.EqualPredicate.getValue
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getValue()
    
    /**
    @utbot.classUnderTest {@link EqualPredicate}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.functors.EqualPredicate#getValue()}
 * @utbot.returnsFrom {@code return iValue;}
 *  */
    @Test
    public void testGetValue_ReturnIValue() {
        EqualPredicate equalPredicate = new EqualPredicate(null, null);
        
        Object actual = equalPredicate.getValue();
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.collections.functors.EqualPredicate.evaluate
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #0 for method evaluate(java.lang.Object)
    /// 
    /// Common steps:
    /// <pre>
    /// Tests invoke:
    ///     {@link org.apache.commons.collections.functors.Equator#equate(java.lang.Object,java.lang.Object)} twice
    /// return from: {@code return equator.equate(iValue, object);}
    /// </pre>
    
    /**
    @utbot.classUnderTest {@link EqualPredicate}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.functors.EqualPredicate#evaluate(java.lang.Object)}
 * @utbot.returnsFrom {@code return equator.equate(iValue, object);}
 *  */
    @Test
    public void testEvaluate_ReturnEquatorEquate_1() {
        DefaultEquator defaultEquator = new DefaultEquator();
        EqualPredicate equalPredicate = new EqualPredicate(null, defaultEquator);
        byte[] byteArray = {};
        
        boolean actual = equalPredicate.evaluate(byteArray);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link EqualPredicate}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.functors.EqualPredicate#evaluate(java.lang.Object)}
 * @utbot.returnsFrom {@code return equator.equate(iValue, object);}
 *  */
    @Test
    public void testEvaluate_ReturnEquatorEquate() {
        Integer integer = -1;
        DefaultEquator defaultEquator = new DefaultEquator();
        EqualPredicate equalPredicate = new EqualPredicate(integer, defaultEquator);
        Integer integer1 = 0;
        
        boolean actual = equalPredicate.evaluate(integer1);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link EqualPredicate}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.functors.EqualPredicate#evaluate(java.lang.Object)}
 * @utbot.returnsFrom {@code return equator.equate(iValue, object);}
 *  */
    @Test
    public void testEvaluate_ReturnEquatorEquate_2() {
        Integer integer = 0;
        DefaultEquator defaultEquator = new DefaultEquator();
        EqualPredicate equalPredicate = new EqualPredicate(integer, defaultEquator);
        Integer integer1 = 0;
        
        boolean actual = equalPredicate.evaluate(integer1);
        
        assertTrue(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #1 for method evaluate(java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link EqualPredicate}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.functors.EqualPredicate#evaluate(java.lang.Object)}
 * @utbot.invokes {@link org.apache.commons.collections.functors.Equator#equate(java.lang.Object,java.lang.Object)}
 * @utbot.returnsFrom {@code return equator.equate(iValue, object);}
 *  */
    @Test
    public void testEvaluate_EquatorEquate() {
        DefaultEquator defaultEquator = new DefaultEquator();
        EqualPredicate equalPredicate = new EqualPredicate(null, defaultEquator);
        
        boolean actual = equalPredicate.evaluate(null);
        
        assertTrue(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method evaluate(java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link EqualPredicate}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.functors.EqualPredicate#evaluate(java.lang.Object)}
 * @utbot.invokes {@link org.apache.commons.collections.functors.Equator#equate(java.lang.Object,java.lang.Object)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return equator.equate(iValue, object);
 *  */
    @Test
    public void testEvaluate_ThrowNullPointerException() {
        EqualPredicate equalPredicate = new EqualPredicate(null, null);
        
        /* This test fails because method [org.apache.commons.collections.functors.EqualPredicate.evaluate] produces [java.lang.NullPointerException]
            org.apache.commons.collections.functors.EqualPredicate.evaluate(EqualPredicate.java:108) */
        equalPredicate.evaluate(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.collections.functors.EqualPredicate.equalPredicate
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method equalPredicate(java.lang.Object, org.apache.commons.collections.functors.Equator)
    
    /**
    @utbot.classUnderTest {@link EqualPredicate}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.functors.EqualPredicate#equalPredicate(java.lang.Object,org.apache.commons.collections.functors.Equator)}
 * @utbot.executesCondition {@code (object == null): True}
 * @utbot.invokes {@link org.apache.commons.collections.functors.NullPredicate#nullPredicate()}
 * @utbot.returnsFrom {@code return nullPredicate();}
 *  */
    @Test
    public void testEqualPredicate_ObjectEqualsNull() throws Exception  {
        Predicate prevINSTANCE = NullPredicate.INSTANCE;
        try {
            NullPredicate instance = ((NullPredicate) createInstance("org.apache.commons.collections.functors.NullPredicate"));
            Class nullPredicateClazz = Class.forName("org.apache.commons.collections.functors.NullPredicate");
            setStaticField(nullPredicateClazz, "INSTANCE", instance);
            
            NullPredicate actual = ((NullPredicate) EqualPredicate.equalPredicate(null, null));
            
        } finally {
            setStaticField(NullPredicate.class, "INSTANCE", prevINSTANCE);
        }
    }
    
    /**
    @utbot.classUnderTest {@link EqualPredicate}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.functors.EqualPredicate#equalPredicate(java.lang.Object,org.apache.commons.collections.functors.Equator)}
 * @utbot.executesCondition {@code (object == null): False}
 * @utbot.returnsFrom {@code return new EqualPredicate<T>(object, equator);}
 *  */
    @Test
    public void testEqualPredicate_ObjectNotEqualsNull() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException, InvocationTargetException, NoSuchMethodException  {
        int[] intArray = {};
        
        EqualPredicate actual = ((EqualPredicate) EqualPredicate.equalPredicate(intArray, null));
        
        EqualPredicate expected = new EqualPredicate(intArray, null);
        
        Object expectedIValue = getFieldValue(expected, "org.apache.commons.collections.functors.EqualPredicate", "iValue");
        Object actualIValue = getFieldValue(actual, "org.apache.commons.collections.functors.EqualPredicate", "iValue");
        int expectedIValueSize = getArrayLength(expectedIValue);
        assertEquals(expectedIValueSize, getArrayLength(actualIValue));
        assertArrayEquals(((int[]) expectedIValue), ((int[]) actualIValue));
        
        Equator actualEquator = ((Equator) getFieldValue(actual, "org.apache.commons.collections.functors.EqualPredicate", "equator"));
        assertNull(actualEquator);
        
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method equalPredicate(java.lang.Object, org.apache.commons.collections.functors.Equator)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.collections.functors.EqualPredicate}
     * @utbot.methodUnderTest {@link org.apache.commons.collections.functors.EqualPredicate#equalPredicate(java.lang.Object,org.apache.commons.collections.functors.Equator)}
     */
    @Test
    public void testEqualPredicate() throws Exception  {
        NullPredicate actual = ((NullPredicate) EqualPredicate.equalPredicate(null, null));
        
        NullPredicate expected = ((NullPredicate) createInstance("org.apache.commons.collections.functors.NullPredicate"));
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.collections.functors.EqualPredicate.equalPredicate
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method equalPredicate(java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link EqualPredicate}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.functors.EqualPredicate#equalPredicate(java.lang.Object)}
 * @utbot.executesCondition {@code (object == null): True}
 * @utbot.invokes {@link org.apache.commons.collections.functors.NullPredicate#nullPredicate()}
 * @utbot.returnsFrom {@code return nullPredicate();}
 *  */
    @Test
    public void testEqualPredicate_ObjectEqualsNull1() throws Exception  {
        Predicate prevINSTANCE = NullPredicate.INSTANCE;
        try {
            NullPredicate instance = ((NullPredicate) createInstance("org.apache.commons.collections.functors.NullPredicate"));
            Class nullPredicateClazz = Class.forName("org.apache.commons.collections.functors.NullPredicate");
            setStaticField(nullPredicateClazz, "INSTANCE", instance);
            
            NullPredicate actual = ((NullPredicate) EqualPredicate.equalPredicate(null));
            
        } finally {
            setStaticField(NullPredicate.class, "INSTANCE", prevINSTANCE);
        }
    }
    
    /**
    @utbot.classUnderTest {@link EqualPredicate}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.functors.EqualPredicate#equalPredicate(java.lang.Object)}
 * @utbot.executesCondition {@code (object == null): False}
 * @utbot.returnsFrom {@code return new EqualPredicate<T>(object);}
 *  */
    @Test
    public void testEqualPredicate_ObjectNotEqualsNull1() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException, InvocationTargetException, NoSuchMethodException  {
        byte[] byteArray = {};
        
        EqualPredicate actual = ((EqualPredicate) EqualPredicate.equalPredicate(byteArray));
        
        DefaultEquator defaultEquator = new DefaultEquator();
        EqualPredicate expected = new EqualPredicate(byteArray, defaultEquator);
        
        Object expectedIValue = getFieldValue(expected, "org.apache.commons.collections.functors.EqualPredicate", "iValue");
        Object actualIValue = getFieldValue(actual, "org.apache.commons.collections.functors.EqualPredicate", "iValue");
        int expectedIValueSize = getArrayLength(expectedIValue);
        assertEquals(expectedIValueSize, getArrayLength(actualIValue));
        org.junit.Assert.assertArrayEquals(((byte[]) expectedIValue), ((byte[]) actualIValue));
        
        Equator expectedEquator = ((Equator) getFieldValue(expected, "org.apache.commons.collections.functors.EqualPredicate", "equator"));
        Equator actualEquator = ((Equator) getFieldValue(actual, "org.apache.commons.collections.functors.EqualPredicate", "equator"));
        
    }
    ///endregion
    
    ///endregion
    
    ///region Util methods
    
    private static Object createInstance(String className) throws Exception {
        Class<?> clazz = Class.forName(className);
        return Class.forName("sun.misc.Unsafe").getDeclaredMethod("allocateInstance", Class.class)
            .invoke(getUnsafeInstance(), clazz);
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
        
            java.lang.reflect.Method methodForGetDeclaredFields947392534058000 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields947392534058000.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass947392534069100 = (java.lang.reflect.Field[]) methodForGetDeclaredFields947392534058000.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass947392534069100).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields947392535851800 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields947392535851800.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass947392535856000 = (java.lang.reflect.Field[]) methodForGetDeclaredFields947392535851800.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass947392535856000).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
        modifiersField.setAccessible(true);
        modifiersField.setInt(field, field.getModifiers() & ~java.lang.reflect.Modifier.FINAL);
        
        return field.get(obj);
    }
    
    private static int getArrayLength(Object arr) {
        return java.lang.reflect.Array.getLength(arr);
    }
    
    private static Object getUnsafeInstance() throws ClassNotFoundException, NoSuchFieldException, IllegalAccessException {
        java.lang.reflect.Field f = Class.forName("sun.misc.Unsafe").getDeclaredField("theUnsafe");
        f.setAccessible(true);
        return f.get(null);
    }
    ///endregion
}

