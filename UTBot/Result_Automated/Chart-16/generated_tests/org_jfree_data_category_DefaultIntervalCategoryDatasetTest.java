package org.jfree.data.category;

import org.junit.Test;
import java.lang.reflect.Method;
import java.lang.reflect.InvocationTargetException;
import org.jfree.data.general.DatasetGroup;
import javax.swing.event.EventListenerList;
import org.jfree.data.UnknownKeyException;
import java.util.concurrent.atomic.LongAdder;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Objects;
import java.util.Map;
import java.util.Set;
import java.util.HashSet;
import java.util.Arrays;
import java.lang.reflect.Array;
import java.util.Iterator;
import java.util.stream.BaseStream;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static java.lang.reflect.Array.get;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertEquals;

public final class org_jfree_data_category_DefaultIntervalCategoryDatasetTest {
    ///region Test suites for executable org.jfree.data.category.DefaultIntervalCategoryDataset.equals
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method equals(java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link DefaultIntervalCategoryDataset}
 * @utbot.methodUnderTest {@link org.jfree.data.category.DefaultIntervalCategoryDataset#equals(java.lang.Object)}
 * @utbot.executesCondition {@code (obj): True}
 *  */
    @Test
    public void testEquals_Obj() throws Exception  {
        DefaultIntervalCategoryDataset defaultIntervalCategoryDataset = ((DefaultIntervalCategoryDataset) createInstance("org.jfree.data.category.DefaultIntervalCategoryDataset"));
        
        boolean actual = defaultIntervalCategoryDataset.equals(defaultIntervalCategoryDataset);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link DefaultIntervalCategoryDataset}
 * @utbot.methodUnderTest {@link org.jfree.data.category.DefaultIntervalCategoryDataset#equals(java.lang.Object)}
 * @utbot.executesCondition {@code (obj): False}
 * @utbot.executesCondition {@code (!(obj instanceof DefaultIntervalCategoryDataset)): True}
 *  */
    @Test
    public void testEquals_NotObjInstanceOfDefaultIntervalCategoryDataset() throws Exception  {
        DefaultIntervalCategoryDataset defaultIntervalCategoryDataset = ((DefaultIntervalCategoryDataset) createInstance("org.jfree.data.category.DefaultIntervalCategoryDataset"));
        
        boolean actual = defaultIntervalCategoryDataset.equals(null);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link DefaultIntervalCategoryDataset}
 * @utbot.methodUnderTest {@link org.jfree.data.category.DefaultIntervalCategoryDataset#equals(java.lang.Object)}
 * @utbot.executesCondition {@code (obj): False}
 * @utbot.executesCondition {@code (!(obj instanceof DefaultIntervalCategoryDataset)): False}
 * @utbot.executesCondition {@code (!Arrays.equals(this.seriesKeys, that.seriesKeys)): True}
 *  */
    @Test
    public void testEquals_NotArraysEquals() throws Exception  {
        DefaultIntervalCategoryDataset defaultIntervalCategoryDataset = ((DefaultIntervalCategoryDataset) createInstance("org.jfree.data.category.DefaultIntervalCategoryDataset"));
        java.lang.Comparable[] seriesKeys = {null};
        defaultIntervalCategoryDataset.setSeriesKeys(seriesKeys);
        DefaultIntervalCategoryDataset defaultIntervalCategoryDataset1 = ((DefaultIntervalCategoryDataset) createInstance("org.jfree.data.category.DefaultIntervalCategoryDataset"));
        java.lang.Comparable[] seriesKeys1 = new java.lang.Comparable[1];
        Character character = '\u0000';
        seriesKeys1[0] = ((Comparable) character);
        defaultIntervalCategoryDataset1.setSeriesKeys(seriesKeys1);
        
        boolean actual = defaultIntervalCategoryDataset.equals(defaultIntervalCategoryDataset1);
        
        assertFalse(actual);
        
        java.lang.Comparable[] defaultIntervalCategoryDatasetSeriesKeys = ((java.lang.Comparable[]) getFieldValue(defaultIntervalCategoryDataset, "org.jfree.data.category.DefaultIntervalCategoryDataset", "seriesKeys"));
        Comparable finalDefaultIntervalCategoryDatasetSeriesKeys0 = ((Comparable) get(defaultIntervalCategoryDatasetSeriesKeys, 0));
        
        assertNull(finalDefaultIntervalCategoryDatasetSeriesKeys0);
    }
    
    /**
    @utbot.classUnderTest {@link DefaultIntervalCategoryDataset}
 * @utbot.methodUnderTest {@link org.jfree.data.category.DefaultIntervalCategoryDataset#equals(java.lang.Object)}
 * @utbot.executesCondition {@code (obj): False}
 * @utbot.executesCondition {@code (!(obj instanceof DefaultIntervalCategoryDataset)): False}
 * @utbot.executesCondition {@code (!Arrays.equals(this.seriesKeys, that.seriesKeys)): False}
 * @utbot.executesCondition {@code (!Arrays.equals(this.categoryKeys, that.categoryKeys)): True}
 *  */
    @Test
    public void testEquals_NotArraysEquals_1() throws Exception  {
        DefaultIntervalCategoryDataset defaultIntervalCategoryDataset = ((DefaultIntervalCategoryDataset) createInstance("org.jfree.data.category.DefaultIntervalCategoryDataset"));
        java.lang.Comparable[] categoryKeys = {null, null};
        defaultIntervalCategoryDataset.setCategoryKeys(categoryKeys);
        DefaultIntervalCategoryDataset defaultIntervalCategoryDataset1 = ((DefaultIntervalCategoryDataset) createInstance("org.jfree.data.category.DefaultIntervalCategoryDataset"));
        java.lang.Comparable[] categoryKeys1 = {null};
        defaultIntervalCategoryDataset1.setCategoryKeys(categoryKeys1);
        
        boolean actual = defaultIntervalCategoryDataset.equals(defaultIntervalCategoryDataset1);
        
        assertFalse(actual);
        
        java.lang.Comparable[] defaultIntervalCategoryDatasetCategoryKeys = ((java.lang.Comparable[]) getFieldValue(defaultIntervalCategoryDataset, "org.jfree.data.category.DefaultIntervalCategoryDataset", "categoryKeys"));
        Comparable finalDefaultIntervalCategoryDatasetCategoryKeys0 = ((Comparable) get(defaultIntervalCategoryDatasetCategoryKeys, 0));
        java.lang.Comparable[] defaultIntervalCategoryDatasetCategoryKeys1 = ((java.lang.Comparable[]) getFieldValue(defaultIntervalCategoryDataset, "org.jfree.data.category.DefaultIntervalCategoryDataset", "categoryKeys"));
        Comparable finalDefaultIntervalCategoryDatasetCategoryKeys1 = ((Comparable) get(defaultIntervalCategoryDatasetCategoryKeys1, 1));
        
        java.lang.Comparable[] defaultIntervalCategoryDataset1CategoryKeys = ((java.lang.Comparable[]) getFieldValue(defaultIntervalCategoryDataset1, "org.jfree.data.category.DefaultIntervalCategoryDataset", "categoryKeys"));
        Comparable finalDefaultIntervalCategoryDataset1CategoryKeys0 = ((Comparable) get(defaultIntervalCategoryDataset1CategoryKeys, 0));
        
        assertNull(finalDefaultIntervalCategoryDatasetCategoryKeys0);
        
        assertNull(finalDefaultIntervalCategoryDatasetCategoryKeys1);
        
        assertNull(finalDefaultIntervalCategoryDataset1CategoryKeys0);
    }
    
    /**
    @utbot.classUnderTest {@link DefaultIntervalCategoryDataset}
 * @utbot.methodUnderTest {@link org.jfree.data.category.DefaultIntervalCategoryDataset#equals(java.lang.Object)}
 * @utbot.executesCondition {@code (obj): False}
 * @utbot.executesCondition {@code (!(obj instanceof DefaultIntervalCategoryDataset)): False}
 * @utbot.executesCondition {@code (!Arrays.equals(this.seriesKeys, that.seriesKeys)): False}
 * @utbot.executesCondition {@code (!Arrays.equals(this.categoryKeys, that.categoryKeys)): False}
 * @utbot.executesCondition {@code (!equal(this.startData, that.startData)): True}
 *  */
    @Test
    public void testEquals_NotEqual_2() throws Exception  {
        DefaultIntervalCategoryDataset defaultIntervalCategoryDataset = ((DefaultIntervalCategoryDataset) createInstance("org.jfree.data.category.DefaultIntervalCategoryDataset"));
        java.lang.Number[][] startData = {
            null,
            null
        };
        setField(defaultIntervalCategoryDataset, "org.jfree.data.category.DefaultIntervalCategoryDataset", "startData", startData);
        DefaultIntervalCategoryDataset defaultIntervalCategoryDataset1 = ((DefaultIntervalCategoryDataset) createInstance("org.jfree.data.category.DefaultIntervalCategoryDataset"));
        java.lang.Number[][] startData1 = {null};
        setField(defaultIntervalCategoryDataset1, "org.jfree.data.category.DefaultIntervalCategoryDataset", "startData", startData1);
        
        boolean actual = defaultIntervalCategoryDataset.equals(defaultIntervalCategoryDataset1);
        
        assertFalse(actual);
        
        java.lang.Number[][] defaultIntervalCategoryDatasetStartData = ((java.lang.Number[][]) getFieldValue(defaultIntervalCategoryDataset, "org.jfree.data.category.DefaultIntervalCategoryDataset", "startData"));
        java.lang.Number[] finalDefaultIntervalCategoryDatasetStartData0 = ((java.lang.Number[]) get(defaultIntervalCategoryDatasetStartData, 0));
        java.lang.Number[][] defaultIntervalCategoryDatasetStartData1 = ((java.lang.Number[][]) getFieldValue(defaultIntervalCategoryDataset, "org.jfree.data.category.DefaultIntervalCategoryDataset", "startData"));
        java.lang.Number[] finalDefaultIntervalCategoryDatasetStartData1 = ((java.lang.Number[]) get(defaultIntervalCategoryDatasetStartData1, 1));
        
        java.lang.Number[][] defaultIntervalCategoryDataset1StartData = ((java.lang.Number[][]) getFieldValue(defaultIntervalCategoryDataset1, "org.jfree.data.category.DefaultIntervalCategoryDataset", "startData"));
        java.lang.Number[] finalDefaultIntervalCategoryDataset1StartData0 = ((java.lang.Number[]) get(defaultIntervalCategoryDataset1StartData, 0));
        
        assertNull(finalDefaultIntervalCategoryDatasetStartData0);
        
        assertNull(finalDefaultIntervalCategoryDatasetStartData1);
        
        assertNull(finalDefaultIntervalCategoryDataset1StartData0);
    }
    
    /**
    @utbot.classUnderTest {@link DefaultIntervalCategoryDataset}
 * @utbot.methodUnderTest {@link org.jfree.data.category.DefaultIntervalCategoryDataset#equals(java.lang.Object)}
 * @utbot.executesCondition {@code (obj): False}
 * @utbot.executesCondition {@code (!(obj instanceof DefaultIntervalCategoryDataset)): False}
 * @utbot.executesCondition {@code (!Arrays.equals(this.seriesKeys, that.seriesKeys)): False}
 * @utbot.executesCondition {@code (!Arrays.equals(this.categoryKeys, that.categoryKeys)): False}
 * @utbot.executesCondition {@code (!equal(this.startData, that.startData)): True}
 *  */
    @Test
    public void testEquals_NotEqual() throws Exception  {
        DefaultIntervalCategoryDataset defaultIntervalCategoryDataset = ((DefaultIntervalCategoryDataset) createInstance("org.jfree.data.category.DefaultIntervalCategoryDataset"));
        java.lang.Number[][] startData = {null};
        setField(defaultIntervalCategoryDataset, "org.jfree.data.category.DefaultIntervalCategoryDataset", "startData", startData);
        DefaultIntervalCategoryDataset defaultIntervalCategoryDataset1 = ((DefaultIntervalCategoryDataset) createInstance("org.jfree.data.category.DefaultIntervalCategoryDataset"));
        
        boolean actual = defaultIntervalCategoryDataset.equals(defaultIntervalCategoryDataset1);
        
        assertFalse(actual);
        
        java.lang.Number[][] defaultIntervalCategoryDatasetStartData = ((java.lang.Number[][]) getFieldValue(defaultIntervalCategoryDataset, "org.jfree.data.category.DefaultIntervalCategoryDataset", "startData"));
        java.lang.Number[] finalDefaultIntervalCategoryDatasetStartData0 = ((java.lang.Number[]) get(defaultIntervalCategoryDatasetStartData, 0));
        
        assertNull(finalDefaultIntervalCategoryDatasetStartData0);
    }
    
    /**
    @utbot.classUnderTest {@link DefaultIntervalCategoryDataset}
 * @utbot.methodUnderTest {@link org.jfree.data.category.DefaultIntervalCategoryDataset#equals(java.lang.Object)}
 * @utbot.executesCondition {@code (obj): False}
 * @utbot.executesCondition {@code (!(obj instanceof DefaultIntervalCategoryDataset)): False}
 * @utbot.executesCondition {@code (!Arrays.equals(this.seriesKeys, that.seriesKeys)): False}
 * @utbot.executesCondition {@code (!Arrays.equals(this.categoryKeys, that.categoryKeys)): False}
 * @utbot.executesCondition {@code (!equal(this.startData, that.startData)): True}
 *  */
    @Test
    public void testEquals_NotEqual_1() throws Exception  {
        DefaultIntervalCategoryDataset defaultIntervalCategoryDataset = ((DefaultIntervalCategoryDataset) createInstance("org.jfree.data.category.DefaultIntervalCategoryDataset"));
        DefaultIntervalCategoryDataset defaultIntervalCategoryDataset1 = ((DefaultIntervalCategoryDataset) createInstance("org.jfree.data.category.DefaultIntervalCategoryDataset"));
        java.lang.Number[][] startData = {null};
        setField(defaultIntervalCategoryDataset1, "org.jfree.data.category.DefaultIntervalCategoryDataset", "startData", startData);
        
        boolean actual = defaultIntervalCategoryDataset.equals(defaultIntervalCategoryDataset1);
        
        assertFalse(actual);
        
        java.lang.Number[][] defaultIntervalCategoryDataset1StartData = ((java.lang.Number[][]) getFieldValue(defaultIntervalCategoryDataset1, "org.jfree.data.category.DefaultIntervalCategoryDataset", "startData"));
        java.lang.Number[] finalDefaultIntervalCategoryDataset1StartData0 = ((java.lang.Number[]) get(defaultIntervalCategoryDataset1StartData, 0));
        
        assertNull(finalDefaultIntervalCategoryDataset1StartData0);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method equals(java.lang.Object)
    
    @Test
    public void testEquals1() throws Exception  {
        DefaultIntervalCategoryDataset defaultIntervalCategoryDataset = ((DefaultIntervalCategoryDataset) createInstance("org.jfree.data.category.DefaultIntervalCategoryDataset"));
        java.lang.Comparable[] categoryKeys = {};
        defaultIntervalCategoryDataset.setCategoryKeys(categoryKeys);
        java.lang.Number[][] startData = {};
        setField(defaultIntervalCategoryDataset, "org.jfree.data.category.DefaultIntervalCategoryDataset", "startData", startData);
        DefaultIntervalCategoryDataset defaultIntervalCategoryDataset1 = ((DefaultIntervalCategoryDataset) createInstance("org.jfree.data.category.DefaultIntervalCategoryDataset"));
        java.lang.Comparable[] categoryKeys1 = {};
        defaultIntervalCategoryDataset1.setCategoryKeys(categoryKeys1);
        java.lang.Number[][] startData1 = {};
        setField(defaultIntervalCategoryDataset1, "org.jfree.data.category.DefaultIntervalCategoryDataset", "startData", startData1);
        
        boolean actual = defaultIntervalCategoryDataset.equals(defaultIntervalCategoryDataset1);
        
        assertTrue(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.data.category.DefaultIntervalCategoryDataset.clone
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method clone([[Ljava.lang.Number;)
    
    /**
    @utbot.classUnderTest {@link DefaultIntervalCategoryDataset}
 * @utbot.methodUnderTest {@link org.jfree.data.category.DefaultIntervalCategoryDataset#clone(java.lang.Number[][])}
 * @utbot.returnsFrom {@code return result;}
 *  */
    @Test
    public void testClone_ReturnResult() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        java.lang.Number[][] numberArray = {};
        
        Class defaultIntervalCategoryDatasetClazz = Class.forName("org.jfree.data.category.DefaultIntervalCategoryDataset");
        Class numberArrayType = Class.forName("[[Ljava.lang.Number;");
        Method cloneMethod = defaultIntervalCategoryDatasetClazz.getDeclaredMethod("clone", numberArrayType);
        cloneMethod.setAccessible(true);
        java.lang.Object[] cloneMethodArguments = new java.lang.Object[1];
        cloneMethodArguments[0] = ((Object) numberArray);
        java.lang.Number[][] actual = ((java.lang.Number[][]) cloneMethod.invoke(null, cloneMethodArguments));
        
        java.lang.Number[][] expected = {};
        
        int expectedSize = expected.length;
        assertEquals(expectedSize, actual.length);
        assertTrue(deepEquals(expected, actual));
    }
    
    /**
    @utbot.classUnderTest {@link DefaultIntervalCategoryDataset}
 * @utbot.methodUnderTest {@link org.jfree.data.category.DefaultIntervalCategoryDataset#clone(java.lang.Number[][])}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < array.length; i++)} once
 * @utbot.returnsFrom {@code return result;}
 *  */
    @Test
    public void testClone_SystemArraycopy() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        java.lang.Number[][] numberArray = new java.lang.Number[1][];
        java.lang.Double[] doubleArray = {};
        numberArray[0] = ((java.lang.Number[]) doubleArray);
        
        Class defaultIntervalCategoryDatasetClazz = Class.forName("org.jfree.data.category.DefaultIntervalCategoryDataset");
        Class numberArrayType = Class.forName("[[Ljava.lang.Number;");
        Method cloneMethod = defaultIntervalCategoryDatasetClazz.getDeclaredMethod("clone", numberArrayType);
        cloneMethod.setAccessible(true);
        java.lang.Object[] cloneMethodArguments = new java.lang.Object[1];
        cloneMethodArguments[0] = ((Object) numberArray);
        java.lang.Number[][] actual = ((java.lang.Number[][]) cloneMethod.invoke(null, cloneMethodArguments));
        
        java.lang.Number[][] expected = new java.lang.Number[1][];
        java.lang.Number[] numberArray1 = {};
        expected[0] = numberArray1;
        
        int expectedSize = expected.length;
        assertEquals(expectedSize, actual.length);
        assertTrue(deepEquals(expected, actual));
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method clone([[Ljava.lang.Number;)
    
    /**
    @utbot.classUnderTest {@link DefaultIntervalCategoryDataset}
 * @utbot.methodUnderTest {@link org.jfree.data.category.DefaultIntervalCategoryDataset#clone(java.lang.Number[][])}
 * @utbot.executesCondition {@code (array == null): True}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: array == null
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testClone_ThrowIllegalArgumentException() throws Throwable  {
        Class defaultIntervalCategoryDatasetClazz = Class.forName("org.jfree.data.category.DefaultIntervalCategoryDataset");
        Class numberArrayType = Class.forName("[[Ljava.lang.Number;");
        Method cloneMethod = defaultIntervalCategoryDatasetClazz.getDeclaredMethod("clone", numberArrayType);
        cloneMethod.setAccessible(true);
        java.lang.Object[] cloneMethodArguments = new java.lang.Object[1];
        cloneMethodArguments[0] = ((Object) null);
        try {
            cloneMethod.invoke(null, cloneMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method clone([[Ljava.lang.Number;)
    
    /**
    @utbot.classUnderTest {@link DefaultIntervalCategoryDataset}
 * @utbot.methodUnderTest {@link org.jfree.data.category.DefaultIntervalCategoryDataset#clone(java.lang.Number[][])}
 * @utbot.executesCondition {@code (array == null): False}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < array.length; i++)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Number[] copychild = new Number[child.length];
 *  */
    @Test
    public void testClone_ThrowNullPointerException() throws Throwable  {
        java.lang.Number[][] numberArray = {null};
        
        /* This test fails because method [org.jfree.data.category.DefaultIntervalCategoryDataset.clone] produces [java.lang.NullPointerException]
            org.jfree.data.category.DefaultIntervalCategoryDataset.clone(DefaultIntervalCategoryDataset.java:795) */
        Class defaultIntervalCategoryDatasetClazz = Class.forName("org.jfree.data.category.DefaultIntervalCategoryDataset");
        Class numberArrayType = Class.forName("[[Ljava.lang.Number;");
        Method cloneMethod = defaultIntervalCategoryDatasetClazz.getDeclaredMethod("clone", numberArrayType);
        cloneMethod.setAccessible(true);
        java.lang.Object[] cloneMethodArguments = new java.lang.Object[1];
        cloneMethodArguments[0] = ((Object) numberArray);
        try {
            cloneMethod.invoke(null, cloneMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method clone([[Ljava.lang.Number;)
    
    /**
     * @utbot.classUnderTest {@link org.jfree.data.category.DefaultIntervalCategoryDataset}
     * @utbot.methodUnderTest {@link org.jfree.data.category.DefaultIntervalCategoryDataset#clone(java.lang.Number[][])}
     */
    @Test
    public void testCloneWithNonEmptyObjectArray() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        java.lang.Number[][] numberArray = new java.lang.Number[3][];
        java.lang.Number[] numberArray1 = {(short) 0, 1.0, 1};
        numberArray[0] = numberArray1;
        java.lang.Number[] numberArray2 = {java.lang.Float.NEGATIVE_INFINITY, (short) 1, java.lang.Double.NaN};
        numberArray[1] = numberArray2;
        java.lang.Number[] numberArray3 = {java.lang.Byte.MAX_VALUE, 1.0, (byte) 0, 1.0};
        numberArray[2] = numberArray3;
        
        Class defaultIntervalCategoryDatasetClazz = Class.forName("org.jfree.data.category.DefaultIntervalCategoryDataset");
        Class numberArrayType = Class.forName("[[Ljava.lang.Number;");
        Method cloneMethod = defaultIntervalCategoryDatasetClazz.getDeclaredMethod("clone", numberArrayType);
        cloneMethod.setAccessible(true);
        java.lang.Object[] cloneMethodArguments = new java.lang.Object[1];
        cloneMethodArguments[0] = ((Object) numberArray);
        java.lang.Number[][] actual = ((java.lang.Number[][]) cloneMethod.invoke(null, cloneMethodArguments));
        
        java.lang.Number[][] expected = new java.lang.Number[3][];
        java.lang.Number[] numberArray4 = new java.lang.Number[3];
        Short short1 = (short) 0;
        numberArray4[0] = ((Number) short1);
        Double double1 = 1.0;
        numberArray4[1] = ((Number) double1);
        Integer integer = 1;
        numberArray4[2] = ((Number) integer);
        expected[0] = numberArray4;
        java.lang.Number[] numberArray5 = new java.lang.Number[3];
        Float float1 = java.lang.Float.NEGATIVE_INFINITY;
        numberArray5[0] = ((Number) float1);
        Short short2 = (short) 1;
        numberArray5[1] = ((Number) short2);
        Double double2 = java.lang.Double.NaN;
        numberArray5[2] = ((Number) double2);
        expected[1] = numberArray5;
        java.lang.Number[] numberArray6 = new java.lang.Number[4];
        Byte byte1 = java.lang.Byte.MAX_VALUE;
        numberArray6[0] = ((Number) byte1);
        Double double3 = 1.0;
        numberArray6[1] = ((Number) double3);
        Byte byte2 = (byte) 0;
        numberArray6[2] = ((Number) byte2);
        Double double4 = 1.0;
        numberArray6[3] = ((Number) double4);
        expected[2] = numberArray6;
        
        int expectedSize = expected.length;
        assertEquals(expectedSize, actual.length);
        assertTrue(deepEquals(expected, actual));
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.data.category.DefaultIntervalCategoryDataset.clone
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method clone()
    
    /**
    @utbot.classUnderTest {@link DefaultIntervalCategoryDataset}
 * @utbot.methodUnderTest {@link org.jfree.data.category.DefaultIntervalCategoryDataset#clone()}
 * @utbot.invokes {@link org.jfree.data.general.AbstractSeriesDataset#clone()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: (DefaultIntervalCategoryDataset) super.clone()
 *  */
    @Test
    public void testClone_ThrowNullPointerException1() throws Exception  {
        DefaultIntervalCategoryDataset defaultIntervalCategoryDataset = ((DefaultIntervalCategoryDataset) createInstance("org.jfree.data.category.DefaultIntervalCategoryDataset"));
        
        /* This test fails because method [org.jfree.data.category.DefaultIntervalCategoryDataset.clone] produces [java.lang.NullPointerException]
            org.jfree.data.category.DefaultIntervalCategoryDataset.clone(DefaultIntervalCategoryDataset.java:748) */
        defaultIntervalCategoryDataset.clone();
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method clone()
    
    /**
     * @utbot.classUnderTest {@link org.jfree.data.category.DefaultIntervalCategoryDataset}
     * @utbot.methodUnderTest {@link org.jfree.data.category.DefaultIntervalCategoryDataset#clone()}
     */
    @Test
    public void testClone() throws Exception  {
        java.lang.Number[][] numberArray = new java.lang.Number[5][];
        java.lang.Number[] numberArray1 = {java.lang.Double.NaN};
        numberArray[0] = numberArray1;
        java.lang.Number[] numberArray2 = {java.lang.Float.NEGATIVE_INFINITY, -1, java.lang.Float.POSITIVE_INFINITY, java.lang.Long.MAX_VALUE, java.lang.Float.POSITIVE_INFINITY};
        numberArray[1] = numberArray2;
        java.lang.Number[] numberArray3 = {java.lang.Byte.MAX_VALUE, java.lang.Byte.MAX_VALUE, java.lang.Byte.MAX_VALUE, java.lang.Byte.MAX_VALUE, java.lang.Byte.MAX_VALUE};
        numberArray[2] = numberArray3;
        java.lang.Number[] numberArray4 = {java.lang.Byte.MIN_VALUE, java.lang.Float.POSITIVE_INFINITY, java.lang.Float.POSITIVE_INFINITY, java.lang.Short.MIN_VALUE, 0.0f};
        numberArray[3] = numberArray4;
        java.lang.Number[] numberArray5 = {Integer.MAX_VALUE, 0, java.lang.Long.MAX_VALUE};
        numberArray[4] = numberArray5;
        java.lang.Number[][] numberArray6 = new java.lang.Number[5][];
        java.lang.Number[] numberArray7 = {(short) -1};
        numberArray6[0] = numberArray7;
        java.lang.Number[] numberArray8 = {0L, 0.0f, 1, (short) -1, java.lang.Byte.MAX_VALUE};
        numberArray6[1] = numberArray8;
        java.lang.Number[] numberArray9 = {-1.0f, -1, -1, (byte) 0, (short) 1};
        numberArray6[2] = numberArray9;
        java.lang.Number[] numberArray10 = {(byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0};
        numberArray6[3] = numberArray10;
        java.lang.Number[] numberArray11 = {java.lang.Double.NaN, Integer.MIN_VALUE, java.lang.Double.NaN, java.lang.Long.MAX_VALUE, -1.0};
        numberArray6[4] = numberArray11;
        DefaultIntervalCategoryDataset defaultIntervalCategoryDataset = new DefaultIntervalCategoryDataset(numberArray, numberArray6);
        DatasetGroup datasetGroup = new DatasetGroup("-3");
        defaultIntervalCategoryDataset.setGroup(datasetGroup);
        
        DefaultIntervalCategoryDataset actual = ((DefaultIntervalCategoryDataset) defaultIntervalCategoryDataset.clone());
        
        DefaultIntervalCategoryDataset expected = ((DefaultIntervalCategoryDataset) createInstance("org.jfree.data.category.DefaultIntervalCategoryDataset"));
        java.lang.Comparable[] seriesKeys = new java.lang.Comparable[5];
        String string = "Series 1";
        seriesKeys[0] = ((Comparable) string);
        String string1 = "Series 2";
        seriesKeys[1] = ((Comparable) string1);
        String string2 = "Series 3";
        seriesKeys[2] = ((Comparable) string2);
        String string3 = "Series 4";
        seriesKeys[3] = ((Comparable) string3);
        String string4 = "Series 5";
        seriesKeys[4] = ((Comparable) string4);
        expected.setSeriesKeys(seriesKeys);
        java.lang.Comparable[] categoryKeys = new java.lang.Comparable[1];
        String string5 = "Category 1";
        categoryKeys[0] = ((Comparable) string5);
        expected.setCategoryKeys(categoryKeys);
        java.lang.Number[][] startData = new java.lang.Number[5][];
        java.lang.Number[] numberArray12 = new java.lang.Number[1];
        Double double1 = java.lang.Double.NaN;
        numberArray12[0] = ((Number) double1);
        startData[0] = numberArray12;
        java.lang.Number[] numberArray13 = new java.lang.Number[5];
        Float float1 = java.lang.Float.NEGATIVE_INFINITY;
        numberArray13[0] = ((Number) float1);
        Integer integer = -1;
        numberArray13[1] = ((Number) integer);
        Float float2 = java.lang.Float.POSITIVE_INFINITY;
        numberArray13[2] = ((Number) float2);
        Long long1 = java.lang.Long.MAX_VALUE;
        numberArray13[3] = ((Number) long1);
        Float float3 = java.lang.Float.POSITIVE_INFINITY;
        numberArray13[4] = ((Number) float3);
        startData[1] = numberArray13;
        java.lang.Number[] numberArray14 = new java.lang.Number[5];
        Byte byte1 = java.lang.Byte.MAX_VALUE;
        numberArray14[0] = ((Number) byte1);
        numberArray14[1] = ((Number) byte1);
        numberArray14[2] = ((Number) byte1);
        numberArray14[3] = ((Number) byte1);
        numberArray14[4] = ((Number) byte1);
        startData[2] = numberArray14;
        java.lang.Number[] numberArray15 = new java.lang.Number[5];
        Byte byte2 = java.lang.Byte.MIN_VALUE;
        numberArray15[0] = ((Number) byte2);
        Float float4 = java.lang.Float.POSITIVE_INFINITY;
        numberArray15[1] = ((Number) float4);
        Float float5 = java.lang.Float.POSITIVE_INFINITY;
        numberArray15[2] = ((Number) float5);
        Short short1 = java.lang.Short.MIN_VALUE;
        numberArray15[3] = ((Number) short1);
        Float float6 = 0.0f;
        numberArray15[4] = ((Number) float6);
        startData[3] = numberArray15;
        java.lang.Number[] numberArray16 = new java.lang.Number[3];
        Integer integer1 = Integer.MAX_VALUE;
        numberArray16[0] = ((Number) integer1);
        Integer integer2 = 0;
        numberArray16[1] = ((Number) integer2);
        Long long2 = java.lang.Long.MAX_VALUE;
        numberArray16[2] = ((Number) long2);
        startData[4] = numberArray16;
        setField(expected, "org.jfree.data.category.DefaultIntervalCategoryDataset", "startData", startData);
        java.lang.Number[][] endData = new java.lang.Number[5][];
        java.lang.Number[] numberArray17 = new java.lang.Number[1];
        Short short2 = (short) -1;
        numberArray17[0] = ((Number) short2);
        endData[0] = numberArray17;
        java.lang.Number[] numberArray18 = new java.lang.Number[5];
        Long long3 = 0L;
        numberArray18[0] = ((Number) long3);
        Float float7 = 0.0f;
        numberArray18[1] = ((Number) float7);
        Integer integer3 = 1;
        numberArray18[2] = ((Number) integer3);
        numberArray18[3] = ((Number) short2);
        numberArray18[4] = ((Number) byte1);
        endData[1] = numberArray18;
        java.lang.Number[] numberArray19 = new java.lang.Number[5];
        Float float8 = -1.0f;
        numberArray19[0] = ((Number) float8);
        numberArray19[1] = ((Number) integer);
        numberArray19[2] = ((Number) integer);
        Byte byte3 = (byte) 0;
        numberArray19[3] = ((Number) byte3);
        Short short3 = (short) 1;
        numberArray19[4] = ((Number) short3);
        endData[2] = numberArray19;
        java.lang.Number[] numberArray20 = new java.lang.Number[5];
        numberArray20[0] = ((Number) byte3);
        numberArray20[1] = ((Number) byte3);
        numberArray20[2] = ((Number) byte3);
        numberArray20[3] = ((Number) byte3);
        numberArray20[4] = ((Number) byte3);
        endData[3] = numberArray20;
        java.lang.Number[] numberArray21 = new java.lang.Number[5];
        Double double2 = java.lang.Double.NaN;
        numberArray21[0] = ((Number) double2);
        Integer integer4 = Integer.MIN_VALUE;
        numberArray21[1] = ((Number) integer4);
        Double double3 = java.lang.Double.NaN;
        numberArray21[2] = ((Number) double3);
        Long long4 = java.lang.Long.MAX_VALUE;
        numberArray21[3] = ((Number) long4);
        Double double4 = -1.0;
        numberArray21[4] = ((Number) double4);
        endData[4] = numberArray21;
        setField(expected, "org.jfree.data.category.DefaultIntervalCategoryDataset", "endData", endData);
        DatasetGroup group = ((DatasetGroup) createInstance("org.jfree.data.general.DatasetGroup"));
        String id = "-3";
        setField(group, "org.jfree.data.general.DatasetGroup", "id", id);
        expected.setGroup(group);
        EventListenerList listenerList = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
        setField(expected, "org.jfree.data.general.AbstractDataset", "listenerList", listenerList);
        
        // org.jfree.data.category.DefaultIntervalCategoryDataset has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.data.category.DefaultIntervalCategoryDataset.getValue
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method getValue(java.lang.Comparable, java.lang.Comparable)
    
    /**
    @utbot.classUnderTest {@link DefaultIntervalCategoryDataset}
 * @utbot.methodUnderTest {@link org.jfree.data.category.DefaultIntervalCategoryDataset#getValue(java.lang.Comparable,java.lang.Comparable)}
 * @utbot.throwsException {@link org.jfree.data.UnknownKeyException} when: seriesIndex < 0
 *  */
    @Test(expected = UnknownKeyException.class)
    public void testGetValue_ThrowUnknownKeyException() throws Exception  {
        DefaultIntervalCategoryDataset defaultIntervalCategoryDataset = ((DefaultIntervalCategoryDataset) createInstance("org.jfree.data.category.DefaultIntervalCategoryDataset"));
        java.lang.Comparable[] seriesKeys = {};
        defaultIntervalCategoryDataset.setSeriesKeys(seriesKeys);
        
        defaultIntervalCategoryDataset.getValue(((Comparable) null), ((Comparable) null));
    }
    
    /**
    @utbot.classUnderTest {@link DefaultIntervalCategoryDataset}
 * @utbot.methodUnderTest {@link org.jfree.data.category.DefaultIntervalCategoryDataset#getValue(java.lang.Comparable,java.lang.Comparable)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: int itemIndex = getColumnIndex(category);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testGetValue_ThrowIllegalArgumentException() throws Exception  {
        DefaultIntervalCategoryDataset defaultIntervalCategoryDataset = ((DefaultIntervalCategoryDataset) createInstance("org.jfree.data.category.DefaultIntervalCategoryDataset"));
        java.lang.Comparable[] seriesKeys = new java.lang.Comparable[1];
        Integer integer = 0;
        seriesKeys[0] = ((Comparable) integer);
        defaultIntervalCategoryDataset.setSeriesKeys(seriesKeys);
        Integer integer1 = 0;
        
        defaultIntervalCategoryDataset.getValue(((Comparable) integer1), ((Comparable) null));
    }
    
    /**
    @utbot.classUnderTest {@link DefaultIntervalCategoryDataset}
 * @utbot.methodUnderTest {@link org.jfree.data.category.DefaultIntervalCategoryDataset#getValue(java.lang.Comparable,java.lang.Comparable)}
 * @utbot.throwsException {@link org.jfree.data.UnknownKeyException} when: seriesIndex < 0
 *  */
    @Test(expected = UnknownKeyException.class)
    public void testGetValue_ThrowUnknownKeyException_2() throws Exception  {
        DefaultIntervalCategoryDataset defaultIntervalCategoryDataset = ((DefaultIntervalCategoryDataset) createInstance("org.jfree.data.category.DefaultIntervalCategoryDataset"));
        java.lang.Comparable[] seriesKeys = {null};
        defaultIntervalCategoryDataset.setSeriesKeys(seriesKeys);
        Integer integer = 0;
        
        defaultIntervalCategoryDataset.getValue(((Comparable) integer), ((Comparable) null));
    }
    
    /**
    @utbot.classUnderTest {@link DefaultIntervalCategoryDataset}
 * @utbot.methodUnderTest {@link org.jfree.data.category.DefaultIntervalCategoryDataset#getValue(java.lang.Comparable,java.lang.Comparable)}
 * @utbot.throwsException {@link org.jfree.data.UnknownKeyException} when: itemIndex < 0
 *  */
    @Test(expected = UnknownKeyException.class)
    public void testGetValue_ThrowUnknownKeyException_1() throws Exception  {
        DefaultIntervalCategoryDataset defaultIntervalCategoryDataset = ((DefaultIntervalCategoryDataset) createInstance("org.jfree.data.category.DefaultIntervalCategoryDataset"));
        java.lang.Comparable[] seriesKeys = new java.lang.Comparable[1];
        Integer integer = 0;
        seriesKeys[0] = ((Comparable) integer);
        defaultIntervalCategoryDataset.setSeriesKeys(seriesKeys);
        java.lang.Comparable[] categoryKeys = {null};
        defaultIntervalCategoryDataset.setCategoryKeys(categoryKeys);
        Integer integer1 = 0;
        Character character = '\u0000';
        
        defaultIntervalCategoryDataset.getValue(((Comparable) integer1), character);
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method getValue(java.lang.Comparable, java.lang.Comparable)
    
    @Test(expected = UnknownKeyException.class)
    public void testGetValue1() throws Throwable  {
        DefaultIntervalCategoryDataset defaultIntervalCategoryDataset = ((DefaultIntervalCategoryDataset) createInstance("org.jfree.data.category.DefaultIntervalCategoryDataset"));
        java.lang.Comparable[] seriesKeys = {null, null, null, null, null, null, null, null, null};
        defaultIntervalCategoryDataset.setSeriesKeys(seriesKeys);
        Integer integer = 0;
        Class unitClazz = Class.forName("java.time.temporal.IsoFields$Unit");
        Object unit = getEnumConstantByName(unitClazz, "WEEK_BASED_YEARS");
        
        Class defaultIntervalCategoryDatasetClazz = Class.forName("org.jfree.data.category.DefaultIntervalCategoryDataset");
        Class integerType = Class.forName("java.lang.Comparable");
        Method getValueMethod = defaultIntervalCategoryDatasetClazz.getDeclaredMethod("getValue", integerType, integerType);
        getValueMethod.setAccessible(true);
        java.lang.Object[] getValueMethodArguments = new java.lang.Object[2];
        getValueMethodArguments[0] = integer;
        getValueMethodArguments[1] = unit;
        try {
            getValueMethod.invoke(defaultIntervalCategoryDataset, getValueMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testGetValue2() throws Exception  {
        DefaultIntervalCategoryDataset defaultIntervalCategoryDataset = ((DefaultIntervalCategoryDataset) createInstance("org.jfree.data.category.DefaultIntervalCategoryDataset"));
        java.lang.Comparable[] seriesKeys = new java.lang.Comparable[9];
        Integer integer = 0;
        seriesKeys[0] = ((Comparable) integer);
        defaultIntervalCategoryDataset.setSeriesKeys(seriesKeys);
        java.lang.Comparable[] categoryKeys = new java.lang.Comparable[9];
        Integer integer1 = 0;
        categoryKeys[0] = ((Comparable) integer1);
        defaultIntervalCategoryDataset.setCategoryKeys(categoryKeys);
        Integer integer2 = 0;
        
        defaultIntervalCategoryDataset.getValue(((Comparable) integer2), ((Comparable) integer2));
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method getValue(java.lang.Comparable, java.lang.Comparable)
    
    @Test
    public void testGetValue3() throws Throwable  {
        DefaultIntervalCategoryDataset defaultIntervalCategoryDataset = ((DefaultIntervalCategoryDataset) createInstance("org.jfree.data.category.DefaultIntervalCategoryDataset"));
        java.lang.Comparable[] seriesKeys = new java.lang.Comparable[10];
        Integer integer = 0;
        seriesKeys[0] = ((Comparable) integer);
        Integer integer1 = 1;
        seriesKeys[2] = ((Comparable) integer1);
        seriesKeys[3] = ((Comparable) integer1);
        seriesKeys[4] = ((Comparable) integer1);
        seriesKeys[5] = ((Comparable) integer1);
        seriesKeys[6] = ((Comparable) integer1);
        seriesKeys[7] = ((Comparable) integer1);
        seriesKeys[8] = ((Comparable) integer1);
        seriesKeys[9] = ((Comparable) integer1);
        defaultIntervalCategoryDataset.setSeriesKeys(seriesKeys);
        Object anonymousField = createInstance("java.time.temporal.IsoFields$Field$2");
        
        /* This test fails because method [org.jfree.data.category.DefaultIntervalCategoryDataset.getValue] produces [java.lang.NullPointerException]
            org.jfree.data.category.DefaultIntervalCategoryDataset.getCategoryIndex(DefaultIntervalCategoryDataset.java:574)
            org.jfree.data.category.DefaultIntervalCategoryDataset.getColumnIndex(DefaultIntervalCategoryDataset.java:628)
            org.jfree.data.category.DefaultIntervalCategoryDataset.getValue(DefaultIntervalCategoryDataset.java:371) */
        Class defaultIntervalCategoryDatasetClazz = Class.forName("org.jfree.data.category.DefaultIntervalCategoryDataset");
        Class integer1Type = Class.forName("java.lang.Comparable");
        Method getValueMethod = defaultIntervalCategoryDatasetClazz.getDeclaredMethod("getValue", integer1Type, integer1Type);
        getValueMethod.setAccessible(true);
        java.lang.Object[] getValueMethodArguments = new java.lang.Object[2];
        getValueMethodArguments[0] = integer1;
        getValueMethodArguments[1] = anonymousField;
        try {
            getValueMethod.invoke(defaultIntervalCategoryDataset, getValueMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testGetValue4() throws Throwable  {
        DefaultIntervalCategoryDataset defaultIntervalCategoryDataset = ((DefaultIntervalCategoryDataset) createInstance("org.jfree.data.category.DefaultIntervalCategoryDataset"));
        java.lang.Comparable[] seriesKeys = new java.lang.Comparable[9];
        Character character = '\u0000';
        seriesKeys[0] = ((Comparable) character);
        seriesKeys[1] = ((Comparable) character);
        seriesKeys[2] = ((Comparable) character);
        seriesKeys[3] = ((Comparable) character);
        seriesKeys[4] = ((Comparable) character);
        seriesKeys[5] = ((Comparable) character);
        seriesKeys[6] = ((Comparable) character);
        seriesKeys[7] = ((Comparable) character);
        seriesKeys[8] = ((Comparable) character);
        defaultIntervalCategoryDataset.setSeriesKeys(seriesKeys);
        Character character1 = '\u0000';
        Class unitClazz = Class.forName("java.time.temporal.IsoFields$Unit");
        Object unit = getEnumConstantByName(unitClazz, "WEEK_BASED_YEARS");
        
        /* This test fails because method [org.jfree.data.category.DefaultIntervalCategoryDataset.getValue] produces [java.lang.NullPointerException]
            org.jfree.data.category.DefaultIntervalCategoryDataset.getCategoryIndex(DefaultIntervalCategoryDataset.java:574)
            org.jfree.data.category.DefaultIntervalCategoryDataset.getColumnIndex(DefaultIntervalCategoryDataset.java:628)
            org.jfree.data.category.DefaultIntervalCategoryDataset.getValue(DefaultIntervalCategoryDataset.java:371) */
        Class defaultIntervalCategoryDatasetClazz = Class.forName("org.jfree.data.category.DefaultIntervalCategoryDataset");
        Class character1Type = Class.forName("java.lang.Comparable");
        Method getValueMethod = defaultIntervalCategoryDatasetClazz.getDeclaredMethod("getValue", character1Type, character1Type);
        getValueMethod.setAccessible(true);
        java.lang.Object[] getValueMethodArguments = new java.lang.Object[2];
        getValueMethodArguments[0] = character1;
        getValueMethodArguments[1] = unit;
        try {
            getValueMethod.invoke(defaultIntervalCategoryDataset, getValueMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testGetValue5() throws Exception  {
        DefaultIntervalCategoryDataset defaultIntervalCategoryDataset = ((DefaultIntervalCategoryDataset) createInstance("org.jfree.data.category.DefaultIntervalCategoryDataset"));
        java.lang.Comparable[] seriesKeys = new java.lang.Comparable[9];
        Integer integer = 0;
        seriesKeys[0] = ((Comparable) integer);
        Character character = '\u0000';
        seriesKeys[1] = ((Comparable) character);
        seriesKeys[2] = ((Comparable) character);
        seriesKeys[3] = ((Comparable) character);
        seriesKeys[4] = ((Comparable) character);
        seriesKeys[5] = ((Comparable) character);
        seriesKeys[6] = ((Comparable) character);
        seriesKeys[7] = ((Comparable) character);
        seriesKeys[8] = ((Comparable) character);
        defaultIntervalCategoryDataset.setSeriesKeys(seriesKeys);
        java.lang.Comparable[] categoryKeys = new java.lang.Comparable[9];
        Character character1 = '\u0000';
        categoryKeys[0] = ((Comparable) character1);
        defaultIntervalCategoryDataset.setCategoryKeys(categoryKeys);
        java.lang.Number[][] startData = {
            null,
            null,
            null,
            null,
            null,
            null,
            null,
            null,
            null
        };
        setField(defaultIntervalCategoryDataset, "org.jfree.data.category.DefaultIntervalCategoryDataset", "startData", startData);
        Integer integer1 = 0;
        
        /* This test fails because method [org.jfree.data.category.DefaultIntervalCategoryDataset.getValue] produces [java.lang.NullPointerException]
            org.jfree.data.category.DefaultIntervalCategoryDataset.getCategoryCount(DefaultIntervalCategoryDataset.java:299)
            org.jfree.data.category.DefaultIntervalCategoryDataset.getEndValue(DefaultIntervalCategoryDataset.java:488)
            org.jfree.data.category.DefaultIntervalCategoryDataset.getValue(DefaultIntervalCategoryDataset.java:392)
            org.jfree.data.category.DefaultIntervalCategoryDataset.getValue(DefaultIntervalCategoryDataset.java:375) */
        defaultIntervalCategoryDataset.getValue(((Comparable) integer1), character);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.data.category.DefaultIntervalCategoryDataset.getValue
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getValue(int, int)
    
    /**
    @utbot.classUnderTest {@link DefaultIntervalCategoryDataset}
 * @utbot.methodUnderTest {@link org.jfree.data.category.DefaultIntervalCategoryDataset#getValue(int,int)}
 * @utbot.invokes {@link org.jfree.data.category.DefaultIntervalCategoryDataset#getEndValue(int,int)}
 * @utbot.returnsFrom {@code return getEndValue(series, category);}
 *  */
    @Test
    public void testGetValue_DefaultIntervalCategoryDatasetGetEndValue() throws Exception  {
        DefaultIntervalCategoryDataset defaultIntervalCategoryDataset = ((DefaultIntervalCategoryDataset) createInstance("org.jfree.data.category.DefaultIntervalCategoryDataset"));
        java.lang.Number[][] startData = new java.lang.Number[1][];
        java.util.concurrent.atomic.LongAdder[] longAdderArray = {null};
        startData[0] = ((java.lang.Number[]) longAdderArray);
        setField(defaultIntervalCategoryDataset, "org.jfree.data.category.DefaultIntervalCategoryDataset", "startData", startData);
        java.lang.Number[][] endData = new java.lang.Number[1][];
        endData[0] = ((java.lang.Number[]) longAdderArray);
        setField(defaultIntervalCategoryDataset, "org.jfree.data.category.DefaultIntervalCategoryDataset", "endData", endData);
        
        Number actual = defaultIntervalCategoryDataset.getValue(0, 0);
        
        assertNull(actual);
        
        java.lang.Number[][] defaultIntervalCategoryDatasetStartData = ((java.lang.Number[][]) getFieldValue(defaultIntervalCategoryDataset, "org.jfree.data.category.DefaultIntervalCategoryDataset", "startData"));
        java.lang.Number[] defaultIntervalCategoryDatasetStartDataStartData0 = ((java.lang.Number[]) get(defaultIntervalCategoryDatasetStartData, 0));
        LongAdder finalDefaultIntervalCategoryDatasetStartData00 = ((LongAdder) get(defaultIntervalCategoryDatasetStartDataStartData0, 0));
        
        assertNull(finalDefaultIntervalCategoryDatasetStartData00);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method getValue(int, int)
    
    /**
    @utbot.classUnderTest {@link DefaultIntervalCategoryDataset}
 * @utbot.methodUnderTest {@link org.jfree.data.category.DefaultIntervalCategoryDataset#getValue(int,int)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return getEndValue(series, category);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testGetValue_ThrowIllegalArgumentException_2() throws Exception  {
        DefaultIntervalCategoryDataset defaultIntervalCategoryDataset = ((DefaultIntervalCategoryDataset) createInstance("org.jfree.data.category.DefaultIntervalCategoryDataset"));
        
        defaultIntervalCategoryDataset.getValue(-1, -255);
    }
    
    /**
    @utbot.classUnderTest {@link DefaultIntervalCategoryDataset}
 * @utbot.methodUnderTest {@link org.jfree.data.category.DefaultIntervalCategoryDataset#getValue(int,int)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return getEndValue(series, category);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testGetValue_ThrowIllegalArgumentException1() throws Exception  {
        DefaultIntervalCategoryDataset defaultIntervalCategoryDataset = ((DefaultIntervalCategoryDataset) createInstance("org.jfree.data.category.DefaultIntervalCategoryDataset"));
        java.lang.Number[][] startData = new java.lang.Number[1][];
        java.util.concurrent.atomic.LongAdder[] longAdderArray = {};
        startData[0] = ((java.lang.Number[]) longAdderArray);
        setField(defaultIntervalCategoryDataset, "org.jfree.data.category.DefaultIntervalCategoryDataset", "startData", startData);
        
        defaultIntervalCategoryDataset.getValue(0, 0);
    }
    
    /**
    @utbot.classUnderTest {@link DefaultIntervalCategoryDataset}
 * @utbot.methodUnderTest {@link org.jfree.data.category.DefaultIntervalCategoryDataset#getValue(int,int)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return getEndValue(series, category);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testGetValue_ThrowIllegalArgumentException_1() throws Exception  {
        DefaultIntervalCategoryDataset defaultIntervalCategoryDataset = ((DefaultIntervalCategoryDataset) createInstance("org.jfree.data.category.DefaultIntervalCategoryDataset"));
        java.lang.Number[][] startData = {null};
        setField(defaultIntervalCategoryDataset, "org.jfree.data.category.DefaultIntervalCategoryDataset", "startData", startData);
        
        defaultIntervalCategoryDataset.getValue(0, -1);
    }
    
    /**
    @utbot.classUnderTest {@link DefaultIntervalCategoryDataset}
 * @utbot.methodUnderTest {@link org.jfree.data.category.DefaultIntervalCategoryDataset#getValue(int,int)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return getEndValue(series, category);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testGetValue_ThrowIllegalArgumentException_4() throws Exception  {
        DefaultIntervalCategoryDataset defaultIntervalCategoryDataset = ((DefaultIntervalCategoryDataset) createInstance("org.jfree.data.category.DefaultIntervalCategoryDataset"));
        java.lang.Number[][] startData = {};
        setField(defaultIntervalCategoryDataset, "org.jfree.data.category.DefaultIntervalCategoryDataset", "startData", startData);
        
        defaultIntervalCategoryDataset.getValue(0, -255);
    }
    
    /**
    @utbot.classUnderTest {@link DefaultIntervalCategoryDataset}
 * @utbot.methodUnderTest {@link org.jfree.data.category.DefaultIntervalCategoryDataset#getValue(int,int)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return getEndValue(series, category);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testGetValue_ThrowIllegalArgumentException_3() throws Exception  {
        DefaultIntervalCategoryDataset defaultIntervalCategoryDataset = ((DefaultIntervalCategoryDataset) createInstance("org.jfree.data.category.DefaultIntervalCategoryDataset"));
        
        defaultIntervalCategoryDataset.getValue(0, -255);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getValue(int, int)
    
    /**
    @utbot.classUnderTest {@link DefaultIntervalCategoryDataset}
 * @utbot.methodUnderTest {@link org.jfree.data.category.DefaultIntervalCategoryDataset#getValue(int,int)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return getEndValue(series, category);
 *  */
    @Test
    public void testGetValue_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        DefaultIntervalCategoryDataset defaultIntervalCategoryDataset = ((DefaultIntervalCategoryDataset) createInstance("org.jfree.data.category.DefaultIntervalCategoryDataset"));
        java.lang.Number[][] startData = new java.lang.Number[1][];
        java.util.concurrent.atomic.LongAdder[] longAdderArray = {null};
        startData[0] = ((java.lang.Number[]) longAdderArray);
        setField(defaultIntervalCategoryDataset, "org.jfree.data.category.DefaultIntervalCategoryDataset", "startData", startData);
        java.lang.Number[][] endData = {};
        setField(defaultIntervalCategoryDataset, "org.jfree.data.category.DefaultIntervalCategoryDataset", "endData", endData);
        
        /* This test fails because method [org.jfree.data.category.DefaultIntervalCategoryDataset.getValue] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.jfree.data.category.DefaultIntervalCategoryDataset.getEndValue(DefaultIntervalCategoryDataset.java:494)
            org.jfree.data.category.DefaultIntervalCategoryDataset.getValue(DefaultIntervalCategoryDataset.java:392) */
        defaultIntervalCategoryDataset.getValue(0, 0);
    }
    
    /**
    @utbot.classUnderTest {@link DefaultIntervalCategoryDataset}
 * @utbot.methodUnderTest {@link org.jfree.data.category.DefaultIntervalCategoryDataset#getValue(int,int)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return getEndValue(series, category);
 *  */
    @Test
    public void testGetValue_ThrowArrayIndexOutOfBoundsException_1() throws Exception  {
        DefaultIntervalCategoryDataset defaultIntervalCategoryDataset = ((DefaultIntervalCategoryDataset) createInstance("org.jfree.data.category.DefaultIntervalCategoryDataset"));
        java.lang.Number[][] startData = new java.lang.Number[1][];
        java.util.concurrent.atomic.LongAdder[] longAdderArray = {null};
        startData[0] = ((java.lang.Number[]) longAdderArray);
        setField(defaultIntervalCategoryDataset, "org.jfree.data.category.DefaultIntervalCategoryDataset", "startData", startData);
        java.lang.Number[][] endData = new java.lang.Number[1][];
        java.util.concurrent.atomic.LongAdder[] longAdderArray1 = {};
        endData[0] = ((java.lang.Number[]) longAdderArray1);
        setField(defaultIntervalCategoryDataset, "org.jfree.data.category.DefaultIntervalCategoryDataset", "endData", endData);
        
        /* This test fails because method [org.jfree.data.category.DefaultIntervalCategoryDataset.getValue] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.jfree.data.category.DefaultIntervalCategoryDataset.getEndValue(DefaultIntervalCategoryDataset.java:494)
            org.jfree.data.category.DefaultIntervalCategoryDataset.getValue(DefaultIntervalCategoryDataset.java:392) */
        defaultIntervalCategoryDataset.getValue(0, 0);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.data.category.DefaultIntervalCategoryDataset.equal
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method equal([[Ljava.lang.Number;, [[Ljava.lang.Number;)
    
    /**
    @utbot.classUnderTest {@link DefaultIntervalCategoryDataset}
 * @utbot.methodUnderTest {@link org.jfree.data.category.DefaultIntervalCategoryDataset#equal(java.lang.Number[][],java.lang.Number[][])}
 * @utbot.executesCondition {@code (array1 == null): False}
 * @utbot.executesCondition {@code (array2 == null): False}
 * @utbot.executesCondition {@code (array1.length != array2.length): True}
 *  */
    @Test
    public void testEqual_Array1LengthNotEqualsArray2Length() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        java.lang.Number[][] numberArray = {
            null,
            null
        };
        java.lang.Number[][] numberArray1 = {null};
        
        Class defaultIntervalCategoryDatasetClazz = Class.forName("org.jfree.data.category.DefaultIntervalCategoryDataset");
        Class numberArrayType = Class.forName("[[Ljava.lang.Number;");
        Method equalMethod = defaultIntervalCategoryDatasetClazz.getDeclaredMethod("equal", numberArrayType, numberArrayType);
        equalMethod.setAccessible(true);
        java.lang.Object[] equalMethodArguments = new java.lang.Object[2];
        equalMethodArguments[0] = ((Object) numberArray);
        equalMethodArguments[1] = ((Object) numberArray1);
        boolean actual = ((Boolean) equalMethod.invoke(null, equalMethodArguments));
        
        assertFalse(actual);
        
        java.lang.Number[] finalNumberArray0 = numberArray[0];
        java.lang.Number[] finalNumberArray1 = numberArray[1];
        
        java.lang.Number[] finalNumberArray10 = numberArray1[0];
        
        assertNull(finalNumberArray0);
        
        assertNull(finalNumberArray1);
        
        assertNull(finalNumberArray10);
    }
    
    /**
    @utbot.classUnderTest {@link DefaultIntervalCategoryDataset}
 * @utbot.methodUnderTest {@link org.jfree.data.category.DefaultIntervalCategoryDataset#equal(java.lang.Number[][],java.lang.Number[][])}
 * @utbot.executesCondition {@code (array1 == null): False}
 * @utbot.executesCondition {@code (array2 == null): False}
 * @utbot.executesCondition {@code (array1.length != array2.length): False}
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void testEqual_Array1LengthEqualsArray2Length() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        java.lang.Number[][] numberArray = {};
        
        Class defaultIntervalCategoryDatasetClazz = Class.forName("org.jfree.data.category.DefaultIntervalCategoryDataset");
        Class numberArrayType = Class.forName("[[Ljava.lang.Number;");
        Method equalMethod = defaultIntervalCategoryDatasetClazz.getDeclaredMethod("equal", numberArrayType, numberArrayType);
        equalMethod.setAccessible(true);
        java.lang.Object[] equalMethodArguments = new java.lang.Object[2];
        equalMethodArguments[0] = ((Object) numberArray);
        equalMethodArguments[1] = ((Object) numberArray);
        boolean actual = ((Boolean) equalMethod.invoke(null, equalMethodArguments));
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link DefaultIntervalCategoryDataset}
 * @utbot.methodUnderTest {@link org.jfree.data.category.DefaultIntervalCategoryDataset#equal(java.lang.Number[][],java.lang.Number[][])}
 * @utbot.executesCondition {@code (array1 == null): False}
 * @utbot.executesCondition {@code (array2 == null): False}
 * @utbot.executesCondition {@code (array1.length != array2.length): False}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < array1.length; i++)} once
 *  */
    @Test
    public void testEqual_NotArraysEquals() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        java.lang.Number[][] numberArray = new java.lang.Number[1][];
        java.lang.Double[] doubleArray = {null};
        numberArray[0] = ((java.lang.Number[]) doubleArray);
        java.lang.Number[][] numberArray1 = {null};
        
        Class defaultIntervalCategoryDatasetClazz = Class.forName("org.jfree.data.category.DefaultIntervalCategoryDataset");
        Class numberArrayType = Class.forName("[[Ljava.lang.Number;");
        Method equalMethod = defaultIntervalCategoryDatasetClazz.getDeclaredMethod("equal", numberArrayType, numberArrayType);
        equalMethod.setAccessible(true);
        java.lang.Object[] equalMethodArguments = new java.lang.Object[2];
        equalMethodArguments[0] = ((Object) numberArray);
        equalMethodArguments[1] = ((Object) numberArray1);
        boolean actual = ((Boolean) equalMethod.invoke(null, equalMethodArguments));
        
        assertFalse(actual);
        
        Double finalNumberArray00 = ((Double) numberArray[0][0]);
        
        java.lang.Number[] finalNumberArray10 = numberArray1[0];
        
        assertNull(finalNumberArray00);
        
        assertNull(finalNumberArray10);
    }
    
    /**
    @utbot.classUnderTest {@link DefaultIntervalCategoryDataset}
 * @utbot.methodUnderTest {@link org.jfree.data.category.DefaultIntervalCategoryDataset#equal(java.lang.Number[][],java.lang.Number[][])}
 * @utbot.executesCondition {@code (array1 == null): False}
 * @utbot.executesCondition {@code (array2 == null): False}
 * @utbot.executesCondition {@code (array1.length != array2.length): False}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < array1.length; i++)} once
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void testEqual_ArraysEquals() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        java.lang.Number[][] numberArray = new java.lang.Number[1][];
        java.lang.Double[] doubleArray = {};
        numberArray[0] = ((java.lang.Number[]) doubleArray);
        java.lang.Number[][] numberArray1 = new java.lang.Number[1][];
        java.lang.Double[] doubleArray1 = {};
        numberArray1[0] = ((java.lang.Number[]) doubleArray1);
        
        Class defaultIntervalCategoryDatasetClazz = Class.forName("org.jfree.data.category.DefaultIntervalCategoryDataset");
        Class numberArrayType = Class.forName("[[Ljava.lang.Number;");
        Method equalMethod = defaultIntervalCategoryDatasetClazz.getDeclaredMethod("equal", numberArrayType, numberArrayType);
        equalMethod.setAccessible(true);
        java.lang.Object[] equalMethodArguments = new java.lang.Object[2];
        equalMethodArguments[0] = ((Object) numberArray);
        equalMethodArguments[1] = ((Object) numberArray1);
        boolean actual = ((Boolean) equalMethod.invoke(null, equalMethodArguments));
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link DefaultIntervalCategoryDataset}
 * @utbot.methodUnderTest {@link org.jfree.data.category.DefaultIntervalCategoryDataset#equal(java.lang.Number[][],java.lang.Number[][])}
 * @utbot.executesCondition {@code (array1 == null): False}
 * @utbot.executesCondition {@code (array2 == null): True}
 *  */
    @Test
    public void testEqual_Array2EqualsNull() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        java.lang.Number[][] numberArray = {null};
        
        Class defaultIntervalCategoryDatasetClazz = Class.forName("org.jfree.data.category.DefaultIntervalCategoryDataset");
        Class numberArrayType = Class.forName("[[Ljava.lang.Number;");
        Method equalMethod = defaultIntervalCategoryDatasetClazz.getDeclaredMethod("equal", numberArrayType, numberArrayType);
        equalMethod.setAccessible(true);
        java.lang.Object[] equalMethodArguments = new java.lang.Object[2];
        equalMethodArguments[0] = ((Object) numberArray);
        equalMethodArguments[1] = ((Object) null);
        boolean actual = ((Boolean) equalMethod.invoke(null, equalMethodArguments));
        
        assertFalse(actual);
        
        java.lang.Number[] finalNumberArray0 = numberArray[0];
        
        assertNull(finalNumberArray0);
    }
    
    /**
    @utbot.classUnderTest {@link DefaultIntervalCategoryDataset}
 * @utbot.methodUnderTest {@link org.jfree.data.category.DefaultIntervalCategoryDataset#equal(java.lang.Number[][],java.lang.Number[][])}
 * @utbot.executesCondition {@code (array1 == null): True}
 * @utbot.returnsFrom {@code return (array2 == null);}
 *  */
    @Test
    public void testEqual_Array2NotEqualsNull() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        java.lang.Number[][] numberArray = {null};
        
        Class defaultIntervalCategoryDatasetClazz = Class.forName("org.jfree.data.category.DefaultIntervalCategoryDataset");
        Class numberArrayType = Class.forName("[[Ljava.lang.Number;");
        Method equalMethod = defaultIntervalCategoryDatasetClazz.getDeclaredMethod("equal", numberArrayType, numberArrayType);
        equalMethod.setAccessible(true);
        java.lang.Object[] equalMethodArguments = new java.lang.Object[2];
        equalMethodArguments[0] = ((Object) null);
        equalMethodArguments[1] = ((Object) numberArray);
        boolean actual = ((Boolean) equalMethod.invoke(null, equalMethodArguments));
        
        assertFalse(actual);
        
        java.lang.Number[] finalNumberArray0 = numberArray[0];
        
        assertNull(finalNumberArray0);
    }
    
    /**
    @utbot.classUnderTest {@link DefaultIntervalCategoryDataset}
 * @utbot.methodUnderTest {@link org.jfree.data.category.DefaultIntervalCategoryDataset#equal(java.lang.Number[][],java.lang.Number[][])}
 * @utbot.executesCondition {@code (array1 == null): True}
 * @utbot.returnsFrom {@code return (array2 == null);}
 *  */
    @Test
    public void testEqual_Array2EqualsNull_1() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        Class defaultIntervalCategoryDatasetClazz = Class.forName("org.jfree.data.category.DefaultIntervalCategoryDataset");
        Class numberArrayType = Class.forName("[[Ljava.lang.Number;");
        Method equalMethod = defaultIntervalCategoryDatasetClazz.getDeclaredMethod("equal", numberArrayType, numberArrayType);
        equalMethod.setAccessible(true);
        java.lang.Object[] equalMethodArguments = new java.lang.Object[2];
        equalMethodArguments[0] = ((Object) null);
        equalMethodArguments[1] = ((Object) null);
        boolean actual = ((Boolean) equalMethod.invoke(null, equalMethodArguments));
        
        assertTrue(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.data.category.DefaultIntervalCategoryDataset.getColumnCount
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getColumnCount()
    
    /**
    @utbot.classUnderTest {@link DefaultIntervalCategoryDataset}
 * @utbot.methodUnderTest {@link org.jfree.data.category.DefaultIntervalCategoryDataset#getColumnCount()}
 * @utbot.returnsFrom {@code return this.categoryKeys.length;}
 *  */
    @Test
    public void testGetColumnCount_ReturnThisCategoryKeysLength() throws Exception  {
        DefaultIntervalCategoryDataset defaultIntervalCategoryDataset = ((DefaultIntervalCategoryDataset) createInstance("org.jfree.data.category.DefaultIntervalCategoryDataset"));
        java.lang.Comparable[] categoryKeys = {null, null};
        defaultIntervalCategoryDataset.setCategoryKeys(categoryKeys);
        
        int actual = defaultIntervalCategoryDataset.getColumnCount();
        
        assertEquals(2, actual);
        
        java.lang.Comparable[] defaultIntervalCategoryDatasetCategoryKeys = ((java.lang.Comparable[]) getFieldValue(defaultIntervalCategoryDataset, "org.jfree.data.category.DefaultIntervalCategoryDataset", "categoryKeys"));
        Comparable finalDefaultIntervalCategoryDatasetCategoryKeys0 = ((Comparable) get(defaultIntervalCategoryDatasetCategoryKeys, 0));
        java.lang.Comparable[] defaultIntervalCategoryDatasetCategoryKeys1 = ((java.lang.Comparable[]) getFieldValue(defaultIntervalCategoryDataset, "org.jfree.data.category.DefaultIntervalCategoryDataset", "categoryKeys"));
        Comparable finalDefaultIntervalCategoryDatasetCategoryKeys1 = ((Comparable) get(defaultIntervalCategoryDatasetCategoryKeys1, 1));
        
        assertNull(finalDefaultIntervalCategoryDatasetCategoryKeys0);
        
        assertNull(finalDefaultIntervalCategoryDatasetCategoryKeys1);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getColumnCount()
    
    /**
    @utbot.classUnderTest {@link DefaultIntervalCategoryDataset}
 * @utbot.methodUnderTest {@link org.jfree.data.category.DefaultIntervalCategoryDataset#getColumnCount()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return this.categoryKeys.length;
 *  */
    @Test
    public void testGetColumnCount_ThrowNullPointerException() throws Exception  {
        DefaultIntervalCategoryDataset defaultIntervalCategoryDataset = ((DefaultIntervalCategoryDataset) createInstance("org.jfree.data.category.DefaultIntervalCategoryDataset"));
        
        /* This test fails because method [org.jfree.data.category.DefaultIntervalCategoryDataset.getColumnCount] produces [java.lang.NullPointerException]
            org.jfree.data.category.DefaultIntervalCategoryDataset.getColumnCount(DefaultIntervalCategoryDataset.java:690) */
        defaultIntervalCategoryDataset.getColumnCount();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.data.category.DefaultIntervalCategoryDataset.getStartValue
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method getStartValue(java.lang.Comparable, java.lang.Comparable)
    
    /**
    @utbot.classUnderTest {@link DefaultIntervalCategoryDataset}
 * @utbot.methodUnderTest {@link org.jfree.data.category.DefaultIntervalCategoryDataset#getStartValue(java.lang.Comparable,java.lang.Comparable)}
 * @utbot.throwsException {@link org.jfree.data.UnknownKeyException} when: seriesIndex < 0
 *  */
    @Test(expected = UnknownKeyException.class)
    public void testGetStartValue_ThrowUnknownKeyException() throws Exception  {
        DefaultIntervalCategoryDataset defaultIntervalCategoryDataset = ((DefaultIntervalCategoryDataset) createInstance("org.jfree.data.category.DefaultIntervalCategoryDataset"));
        java.lang.Comparable[] seriesKeys = {};
        defaultIntervalCategoryDataset.setSeriesKeys(seriesKeys);
        
        defaultIntervalCategoryDataset.getStartValue(((Comparable) null), ((Comparable) null));
    }
    
    /**
    @utbot.classUnderTest {@link DefaultIntervalCategoryDataset}
 * @utbot.methodUnderTest {@link org.jfree.data.category.DefaultIntervalCategoryDataset#getStartValue(java.lang.Comparable,java.lang.Comparable)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: int itemIndex = getColumnIndex(category);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testGetStartValue_ThrowIllegalArgumentException() throws Exception  {
        DefaultIntervalCategoryDataset defaultIntervalCategoryDataset = ((DefaultIntervalCategoryDataset) createInstance("org.jfree.data.category.DefaultIntervalCategoryDataset"));
        java.lang.Comparable[] seriesKeys = new java.lang.Comparable[1];
        Integer integer = 0;
        seriesKeys[0] = ((Comparable) integer);
        defaultIntervalCategoryDataset.setSeriesKeys(seriesKeys);
        Integer integer1 = 0;
        
        defaultIntervalCategoryDataset.getStartValue(((Comparable) integer1), ((Comparable) null));
    }
    
    /**
    @utbot.classUnderTest {@link DefaultIntervalCategoryDataset}
 * @utbot.methodUnderTest {@link org.jfree.data.category.DefaultIntervalCategoryDataset#getStartValue(java.lang.Comparable,java.lang.Comparable)}
 * @utbot.throwsException {@link org.jfree.data.UnknownKeyException} when: seriesIndex < 0
 *  */
    @Test(expected = UnknownKeyException.class)
    public void testGetStartValue_ThrowUnknownKeyException_2() throws Exception  {
        DefaultIntervalCategoryDataset defaultIntervalCategoryDataset = ((DefaultIntervalCategoryDataset) createInstance("org.jfree.data.category.DefaultIntervalCategoryDataset"));
        java.lang.Comparable[] seriesKeys = {null};
        defaultIntervalCategoryDataset.setSeriesKeys(seriesKeys);
        Integer integer = 0;
        
        defaultIntervalCategoryDataset.getStartValue(((Comparable) integer), ((Comparable) null));
    }
    
    /**
    @utbot.classUnderTest {@link DefaultIntervalCategoryDataset}
 * @utbot.methodUnderTest {@link org.jfree.data.category.DefaultIntervalCategoryDataset#getStartValue(java.lang.Comparable,java.lang.Comparable)}
 * @utbot.throwsException {@link org.jfree.data.UnknownKeyException} when: itemIndex < 0
 *  */
    @Test(expected = UnknownKeyException.class)
    public void testGetStartValue_ThrowUnknownKeyException_1() throws Exception  {
        DefaultIntervalCategoryDataset defaultIntervalCategoryDataset = ((DefaultIntervalCategoryDataset) createInstance("org.jfree.data.category.DefaultIntervalCategoryDataset"));
        java.lang.Comparable[] seriesKeys = new java.lang.Comparable[1];
        Integer integer = 0;
        seriesKeys[0] = ((Comparable) integer);
        defaultIntervalCategoryDataset.setSeriesKeys(seriesKeys);
        java.lang.Comparable[] categoryKeys = {};
        defaultIntervalCategoryDataset.setCategoryKeys(categoryKeys);
        Integer integer1 = 0;
        Integer integer2 = 0;
        
        defaultIntervalCategoryDataset.getStartValue(((Comparable) integer1), ((Comparable) integer2));
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method getStartValue(java.lang.Comparable, java.lang.Comparable)
    
    @Test(expected = UnknownKeyException.class)
    public void testGetStartValue1() throws Throwable  {
        DefaultIntervalCategoryDataset defaultIntervalCategoryDataset = ((DefaultIntervalCategoryDataset) createInstance("org.jfree.data.category.DefaultIntervalCategoryDataset"));
        java.lang.Comparable[] seriesKeys = {null, null, null, null, null, null, null, null, null};
        defaultIntervalCategoryDataset.setSeriesKeys(seriesKeys);
        Character character = '\u0000';
        Class unitClazz = Class.forName("java.time.temporal.IsoFields$Unit");
        Object unit = getEnumConstantByName(unitClazz, "WEEK_BASED_YEARS");
        
        Class defaultIntervalCategoryDatasetClazz = Class.forName("org.jfree.data.category.DefaultIntervalCategoryDataset");
        Class characterType = Class.forName("java.lang.Comparable");
        Method getStartValueMethod = defaultIntervalCategoryDatasetClazz.getDeclaredMethod("getStartValue", characterType, characterType);
        getStartValueMethod.setAccessible(true);
        java.lang.Object[] getStartValueMethodArguments = new java.lang.Object[2];
        getStartValueMethodArguments[0] = character;
        getStartValueMethodArguments[1] = unit;
        try {
            getStartValueMethod.invoke(defaultIntervalCategoryDataset, getStartValueMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testGetStartValue2() throws Exception  {
        DefaultIntervalCategoryDataset defaultIntervalCategoryDataset = ((DefaultIntervalCategoryDataset) createInstance("org.jfree.data.category.DefaultIntervalCategoryDataset"));
        java.lang.Comparable[] seriesKeys = new java.lang.Comparable[9];
        Integer integer = 0;
        seriesKeys[0] = ((Comparable) integer);
        Integer integer1 = 0;
        seriesKeys[1] = ((Comparable) integer1);
        seriesKeys[2] = ((Comparable) integer1);
        seriesKeys[3] = ((Comparable) integer1);
        seriesKeys[4] = ((Comparable) integer1);
        seriesKeys[5] = ((Comparable) integer1);
        seriesKeys[6] = ((Comparable) integer1);
        seriesKeys[7] = ((Comparable) integer1);
        seriesKeys[8] = ((Comparable) integer1);
        defaultIntervalCategoryDataset.setSeriesKeys(seriesKeys);
        java.lang.Comparable[] categoryKeys = new java.lang.Comparable[9];
        Character character = '\u0000';
        categoryKeys[1] = ((Comparable) character);
        categoryKeys[2] = ((Comparable) character);
        categoryKeys[3] = ((Comparable) character);
        categoryKeys[4] = ((Comparable) character);
        categoryKeys[5] = ((Comparable) character);
        categoryKeys[6] = ((Comparable) character);
        categoryKeys[7] = ((Comparable) character);
        categoryKeys[8] = ((Comparable) character);
        defaultIntervalCategoryDataset.setCategoryKeys(categoryKeys);
        
        defaultIntervalCategoryDataset.getStartValue(((Comparable) integer1), character);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method getStartValue(java.lang.Comparable, java.lang.Comparable)
    
    @Test
    public void testGetStartValue3() throws Throwable  {
        DefaultIntervalCategoryDataset defaultIntervalCategoryDataset = ((DefaultIntervalCategoryDataset) createInstance("org.jfree.data.category.DefaultIntervalCategoryDataset"));
        java.lang.Comparable[] seriesKeys = new java.lang.Comparable[10];
        Integer integer = 0;
        seriesKeys[0] = ((Comparable) integer);
        Integer integer1 = 0;
        seriesKeys[1] = ((Comparable) integer1);
        Integer integer2 = 1;
        seriesKeys[2] = ((Comparable) integer2);
        seriesKeys[3] = ((Comparable) integer2);
        seriesKeys[4] = ((Comparable) integer2);
        seriesKeys[5] = ((Comparable) integer2);
        seriesKeys[6] = ((Comparable) integer2);
        seriesKeys[7] = ((Comparable) integer2);
        seriesKeys[8] = ((Comparable) integer2);
        seriesKeys[9] = ((Comparable) integer2);
        defaultIntervalCategoryDataset.setSeriesKeys(seriesKeys);
        Object anonymousField = createInstance("java.time.temporal.IsoFields$Field$2");
        
        /* This test fails because method [org.jfree.data.category.DefaultIntervalCategoryDataset.getStartValue] produces [java.lang.NullPointerException]
            org.jfree.data.category.DefaultIntervalCategoryDataset.getCategoryIndex(DefaultIntervalCategoryDataset.java:574)
            org.jfree.data.category.DefaultIntervalCategoryDataset.getColumnIndex(DefaultIntervalCategoryDataset.java:628)
            org.jfree.data.category.DefaultIntervalCategoryDataset.getStartValue(DefaultIntervalCategoryDataset.java:411) */
        Class defaultIntervalCategoryDatasetClazz = Class.forName("org.jfree.data.category.DefaultIntervalCategoryDataset");
        Class integer2Type = Class.forName("java.lang.Comparable");
        Method getStartValueMethod = defaultIntervalCategoryDatasetClazz.getDeclaredMethod("getStartValue", integer2Type, integer2Type);
        getStartValueMethod.setAccessible(true);
        java.lang.Object[] getStartValueMethodArguments = new java.lang.Object[2];
        getStartValueMethodArguments[0] = integer2;
        getStartValueMethodArguments[1] = anonymousField;
        try {
            getStartValueMethod.invoke(defaultIntervalCategoryDataset, getStartValueMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testGetStartValue4() throws Throwable  {
        DefaultIntervalCategoryDataset defaultIntervalCategoryDataset = ((DefaultIntervalCategoryDataset) createInstance("org.jfree.data.category.DefaultIntervalCategoryDataset"));
        java.lang.Comparable[] seriesKeys = new java.lang.Comparable[9];
        Character character = '\u0000';
        seriesKeys[0] = ((Comparable) character);
        seriesKeys[1] = ((Comparable) character);
        seriesKeys[2] = ((Comparable) character);
        seriesKeys[3] = ((Comparable) character);
        seriesKeys[4] = ((Comparable) character);
        seriesKeys[5] = ((Comparable) character);
        seriesKeys[6] = ((Comparable) character);
        seriesKeys[7] = ((Comparable) character);
        seriesKeys[8] = ((Comparable) character);
        defaultIntervalCategoryDataset.setSeriesKeys(seriesKeys);
        Character character1 = '\u0000';
        Class unitClazz = Class.forName("java.time.temporal.IsoFields$Unit");
        Object unit = getEnumConstantByName(unitClazz, "WEEK_BASED_YEARS");
        
        /* This test fails because method [org.jfree.data.category.DefaultIntervalCategoryDataset.getStartValue] produces [java.lang.NullPointerException]
            org.jfree.data.category.DefaultIntervalCategoryDataset.getCategoryIndex(DefaultIntervalCategoryDataset.java:574)
            org.jfree.data.category.DefaultIntervalCategoryDataset.getColumnIndex(DefaultIntervalCategoryDataset.java:628)
            org.jfree.data.category.DefaultIntervalCategoryDataset.getStartValue(DefaultIntervalCategoryDataset.java:411) */
        Class defaultIntervalCategoryDatasetClazz = Class.forName("org.jfree.data.category.DefaultIntervalCategoryDataset");
        Class character1Type = Class.forName("java.lang.Comparable");
        Method getStartValueMethod = defaultIntervalCategoryDatasetClazz.getDeclaredMethod("getStartValue", character1Type, character1Type);
        getStartValueMethod.setAccessible(true);
        java.lang.Object[] getStartValueMethodArguments = new java.lang.Object[2];
        getStartValueMethodArguments[0] = character1;
        getStartValueMethodArguments[1] = unit;
        try {
            getStartValueMethod.invoke(defaultIntervalCategoryDataset, getStartValueMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testGetStartValue5() throws Exception  {
        DefaultIntervalCategoryDataset defaultIntervalCategoryDataset = ((DefaultIntervalCategoryDataset) createInstance("org.jfree.data.category.DefaultIntervalCategoryDataset"));
        java.lang.Comparable[] seriesKeys = new java.lang.Comparable[9];
        Integer integer = 0;
        seriesKeys[0] = ((Comparable) integer);
        Character character = '\u0000';
        seriesKeys[1] = ((Comparable) character);
        seriesKeys[2] = ((Comparable) character);
        seriesKeys[3] = ((Comparable) character);
        seriesKeys[4] = ((Comparable) character);
        seriesKeys[5] = ((Comparable) character);
        seriesKeys[6] = ((Comparable) character);
        seriesKeys[7] = ((Comparable) character);
        seriesKeys[8] = ((Comparable) character);
        defaultIntervalCategoryDataset.setSeriesKeys(seriesKeys);
        java.lang.Comparable[] categoryKeys = new java.lang.Comparable[9];
        Character character1 = '\u0000';
        categoryKeys[0] = ((Comparable) character1);
        defaultIntervalCategoryDataset.setCategoryKeys(categoryKeys);
        java.lang.Number[][] startData = {
            null,
            null,
            null,
            null,
            null,
            null,
            null,
            null,
            null
        };
        setField(defaultIntervalCategoryDataset, "org.jfree.data.category.DefaultIntervalCategoryDataset", "startData", startData);
        Integer integer1 = 0;
        
        /* This test fails because method [org.jfree.data.category.DefaultIntervalCategoryDataset.getStartValue] produces [java.lang.NullPointerException]
            org.jfree.data.category.DefaultIntervalCategoryDataset.getCategoryCount(DefaultIntervalCategoryDataset.java:299)
            org.jfree.data.category.DefaultIntervalCategoryDataset.getStartValue(DefaultIntervalCategoryDataset.java:438)
            org.jfree.data.category.DefaultIntervalCategoryDataset.getStartValue(DefaultIntervalCategoryDataset.java:415) */
        defaultIntervalCategoryDataset.getStartValue(((Comparable) integer1), character);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.data.category.DefaultIntervalCategoryDataset.getStartValue
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getStartValue(int, int)
    
    /**
    @utbot.classUnderTest {@link DefaultIntervalCategoryDataset}
 * @utbot.methodUnderTest {@link org.jfree.data.category.DefaultIntervalCategoryDataset#getStartValue(int,int)}
 * @utbot.executesCondition {@code (series < 0): False}
 * @utbot.executesCondition {@code (series >= getSeriesCount()): False}
 * @utbot.executesCondition {@code (category < 0): False}
 * @utbot.executesCondition {@code (category >= getCategoryCount()): False}
 * @utbot.invokes {@link org.jfree.data.category.DefaultIntervalCategoryDataset#getSeriesCount()}
 * @utbot.invokes {@link org.jfree.data.category.DefaultIntervalCategoryDataset#getCategoryCount()}
 * @utbot.returnsFrom {@code return this.startData[series][category];}
 *  */
    @Test
    public void testGetStartValue_CategoryLessThanGetCategoryCount() throws Exception  {
        DefaultIntervalCategoryDataset defaultIntervalCategoryDataset = ((DefaultIntervalCategoryDataset) createInstance("org.jfree.data.category.DefaultIntervalCategoryDataset"));
        java.lang.Number[][] startData = new java.lang.Number[1][];
        java.util.concurrent.atomic.LongAdder[] longAdderArray = {null};
        startData[0] = ((java.lang.Number[]) longAdderArray);
        setField(defaultIntervalCategoryDataset, "org.jfree.data.category.DefaultIntervalCategoryDataset", "startData", startData);
        
        Number actual = defaultIntervalCategoryDataset.getStartValue(0, 0);
        
        assertNull(actual);
        
        java.lang.Number[][] defaultIntervalCategoryDatasetStartData = ((java.lang.Number[][]) getFieldValue(defaultIntervalCategoryDataset, "org.jfree.data.category.DefaultIntervalCategoryDataset", "startData"));
        java.lang.Number[] defaultIntervalCategoryDatasetStartDataStartData0 = ((java.lang.Number[]) get(defaultIntervalCategoryDatasetStartData, 0));
        LongAdder finalDefaultIntervalCategoryDatasetStartData00 = ((LongAdder) get(defaultIntervalCategoryDatasetStartDataStartData0, 0));
        
        assertNull(finalDefaultIntervalCategoryDatasetStartData00);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method getStartValue(int, int)
    
    /**
    @utbot.classUnderTest {@link DefaultIntervalCategoryDataset}
 * @utbot.methodUnderTest {@link org.jfree.data.category.DefaultIntervalCategoryDataset#getStartValue(int,int)}
 * @utbot.executesCondition {@code (series < 0): True}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: (series < 0) || (series >= getSeriesCount())
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testGetStartValue_ThrowIllegalArgumentException_2() throws Exception  {
        DefaultIntervalCategoryDataset defaultIntervalCategoryDataset = ((DefaultIntervalCategoryDataset) createInstance("org.jfree.data.category.DefaultIntervalCategoryDataset"));
        
        defaultIntervalCategoryDataset.getStartValue(-1, -255);
    }
    
    /**
    @utbot.classUnderTest {@link DefaultIntervalCategoryDataset}
 * @utbot.methodUnderTest {@link org.jfree.data.category.DefaultIntervalCategoryDataset#getStartValue(int,int)}
 * @utbot.executesCondition {@code (series < 0): False}
 * @utbot.executesCondition {@code (series >= getSeriesCount()): False}
 * @utbot.executesCondition {@code (category < 0): False}
 * @utbot.executesCondition {@code (category >= getCategoryCount()): True}
 * @utbot.invokes {@link org.jfree.data.category.DefaultIntervalCategoryDataset#getCategoryCount()}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: (category < 0) || (category >= getCategoryCount())
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testGetStartValue_ThrowIllegalArgumentException1() throws Exception  {
        DefaultIntervalCategoryDataset defaultIntervalCategoryDataset = ((DefaultIntervalCategoryDataset) createInstance("org.jfree.data.category.DefaultIntervalCategoryDataset"));
        java.lang.Number[][] startData = new java.lang.Number[1][];
        java.util.concurrent.atomic.LongAdder[] longAdderArray = {};
        startData[0] = ((java.lang.Number[]) longAdderArray);
        setField(defaultIntervalCategoryDataset, "org.jfree.data.category.DefaultIntervalCategoryDataset", "startData", startData);
        
        defaultIntervalCategoryDataset.getStartValue(0, 0);
    }
    
    /**
    @utbot.classUnderTest {@link DefaultIntervalCategoryDataset}
 * @utbot.methodUnderTest {@link org.jfree.data.category.DefaultIntervalCategoryDataset#getStartValue(int,int)}
 * @utbot.executesCondition {@code (series < 0): False}
 * @utbot.executesCondition {@code (series >= getSeriesCount()): False}
 * @utbot.executesCondition {@code (category < 0): True}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: (category < 0) || (category >= getCategoryCount())
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testGetStartValue_ThrowIllegalArgumentException_1() throws Exception  {
        DefaultIntervalCategoryDataset defaultIntervalCategoryDataset = ((DefaultIntervalCategoryDataset) createInstance("org.jfree.data.category.DefaultIntervalCategoryDataset"));
        java.lang.Number[][] startData = {null};
        setField(defaultIntervalCategoryDataset, "org.jfree.data.category.DefaultIntervalCategoryDataset", "startData", startData);
        
        defaultIntervalCategoryDataset.getStartValue(0, -1);
    }
    
    /**
    @utbot.classUnderTest {@link DefaultIntervalCategoryDataset}
 * @utbot.methodUnderTest {@link org.jfree.data.category.DefaultIntervalCategoryDataset#getStartValue(int,int)}
 * @utbot.executesCondition {@code (series < 0): False}
 * @utbot.executesCondition {@code (series >= getSeriesCount()): True}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: (series < 0) || (series >= getSeriesCount())
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testGetStartValue_ThrowIllegalArgumentException_3() throws Exception  {
        DefaultIntervalCategoryDataset defaultIntervalCategoryDataset = ((DefaultIntervalCategoryDataset) createInstance("org.jfree.data.category.DefaultIntervalCategoryDataset"));
        java.lang.Number[][] startData = {};
        setField(defaultIntervalCategoryDataset, "org.jfree.data.category.DefaultIntervalCategoryDataset", "startData", startData);
        
        defaultIntervalCategoryDataset.getStartValue(0, -255);
    }
    
    /**
    @utbot.classUnderTest {@link DefaultIntervalCategoryDataset}
 * @utbot.methodUnderTest {@link org.jfree.data.category.DefaultIntervalCategoryDataset#getStartValue(int,int)}
 * @utbot.executesCondition {@code (series < 0): False}
 * @utbot.executesCondition {@code (series >= getSeriesCount()): True}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: (series < 0) || (series >= getSeriesCount())
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testGetStartValue_ThrowIllegalArgumentException_4() throws Exception  {
        DefaultIntervalCategoryDataset defaultIntervalCategoryDataset = ((DefaultIntervalCategoryDataset) createInstance("org.jfree.data.category.DefaultIntervalCategoryDataset"));
        
        defaultIntervalCategoryDataset.getStartValue(0, -255);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getStartValue(int, int)
    
    /**
    @utbot.classUnderTest {@link DefaultIntervalCategoryDataset}
 * @utbot.methodUnderTest {@link org.jfree.data.category.DefaultIntervalCategoryDataset#getStartValue(int,int)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return this.startData[series][category];
 *  */
    @Test
    public void testGetStartValue_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        DefaultIntervalCategoryDataset defaultIntervalCategoryDataset = ((DefaultIntervalCategoryDataset) createInstance("org.jfree.data.category.DefaultIntervalCategoryDataset"));
        java.lang.Number[][] startData = new java.lang.Number[33][];
        java.util.concurrent.atomic.LongAdder[] longAdderArray = new java.util.concurrent.atomic.LongAdder[33];
        startData[0] = ((java.lang.Number[]) longAdderArray);
        startData[1] = ((java.lang.Number[]) null);
        startData[2] = ((java.lang.Number[]) null);
        startData[3] = ((java.lang.Number[]) null);
        startData[4] = ((java.lang.Number[]) null);
        startData[5] = ((java.lang.Number[]) null);
        startData[6] = ((java.lang.Number[]) null);
        startData[7] = ((java.lang.Number[]) null);
        startData[8] = ((java.lang.Number[]) null);
        startData[9] = ((java.lang.Number[]) null);
        startData[10] = ((java.lang.Number[]) null);
        startData[11] = ((java.lang.Number[]) null);
        startData[12] = ((java.lang.Number[]) null);
        startData[13] = ((java.lang.Number[]) null);
        startData[14] = ((java.lang.Number[]) null);
        startData[15] = ((java.lang.Number[]) null);
        startData[16] = ((java.lang.Number[]) null);
        startData[17] = ((java.lang.Number[]) null);
        startData[18] = ((java.lang.Number[]) null);
        startData[19] = ((java.lang.Number[]) null);
        startData[20] = ((java.lang.Number[]) null);
        startData[21] = ((java.lang.Number[]) null);
        startData[22] = ((java.lang.Number[]) null);
        startData[23] = ((java.lang.Number[]) null);
        startData[24] = ((java.lang.Number[]) null);
        startData[25] = ((java.lang.Number[]) null);
        startData[26] = ((java.lang.Number[]) null);
        startData[27] = ((java.lang.Number[]) null);
        startData[28] = ((java.lang.Number[]) null);
        startData[29] = ((java.lang.Number[]) null);
        startData[30] = ((java.lang.Number[]) null);
        startData[31] = ((java.lang.Number[]) null);
        java.util.concurrent.atomic.LongAdder[] longAdderArray1 = {null};
        startData[32] = ((java.lang.Number[]) longAdderArray1);
        setField(defaultIntervalCategoryDataset, "org.jfree.data.category.DefaultIntervalCategoryDataset", "startData", startData);
        
        /* This test fails because method [org.jfree.data.category.DefaultIntervalCategoryDataset.getStartValue] produces [java.lang.ArrayIndexOutOfBoundsException: Index 32 out of bounds for length 1]
            org.jfree.data.category.DefaultIntervalCategoryDataset.getStartValue(DefaultIntervalCategoryDataset.java:445) */
        defaultIntervalCategoryDataset.getStartValue(32, 32);
    }
    
    /**
    @utbot.classUnderTest {@link DefaultIntervalCategoryDataset}
 * @utbot.methodUnderTest {@link org.jfree.data.category.DefaultIntervalCategoryDataset#getStartValue(int,int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return this.startData[series][category];
 *  */
    @Test
    public void testGetStartValue_ThrowNullPointerException() throws Exception  {
        DefaultIntervalCategoryDataset defaultIntervalCategoryDataset = ((DefaultIntervalCategoryDataset) createInstance("org.jfree.data.category.DefaultIntervalCategoryDataset"));
        java.lang.Number[][] startData = new java.lang.Number[19][];
        java.util.concurrent.atomic.LongAdder[] longAdderArray = {null};
        startData[0] = ((java.lang.Number[]) longAdderArray);
        startData[1] = ((java.lang.Number[]) null);
        startData[2] = ((java.lang.Number[]) null);
        startData[3] = ((java.lang.Number[]) null);
        startData[4] = ((java.lang.Number[]) null);
        startData[5] = ((java.lang.Number[]) null);
        startData[6] = ((java.lang.Number[]) null);
        startData[7] = ((java.lang.Number[]) null);
        startData[8] = ((java.lang.Number[]) null);
        startData[9] = ((java.lang.Number[]) null);
        startData[10] = ((java.lang.Number[]) null);
        startData[11] = ((java.lang.Number[]) null);
        startData[12] = ((java.lang.Number[]) null);
        startData[13] = ((java.lang.Number[]) null);
        startData[14] = ((java.lang.Number[]) null);
        startData[15] = ((java.lang.Number[]) null);
        startData[16] = ((java.lang.Number[]) null);
        startData[17] = ((java.lang.Number[]) null);
        startData[18] = ((java.lang.Number[]) null);
        setField(defaultIntervalCategoryDataset, "org.jfree.data.category.DefaultIntervalCategoryDataset", "startData", startData);
        
        /* This test fails because method [org.jfree.data.category.DefaultIntervalCategoryDataset.getStartValue] produces [java.lang.NullPointerException]
            org.jfree.data.category.DefaultIntervalCategoryDataset.getStartValue(DefaultIntervalCategoryDataset.java:445) */
        defaultIntervalCategoryDataset.getStartValue(2, 0);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.data.category.DefaultIntervalCategoryDataset.getRowKeys
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getRowKeys()
    
    /**
    @utbot.classUnderTest {@link DefaultIntervalCategoryDataset}
 * @utbot.methodUnderTest {@link org.jfree.data.category.DefaultIntervalCategoryDataset#getRowKeys()}
 * @utbot.executesCondition {@code (this.seriesKeys == null): True}
 * @utbot.returnsFrom {@code return new java.util.ArrayList();}
 *  */
    @Test
    public void testGetRowKeys_ThisSeriesKeysEqualsNull() throws Exception  {
        DefaultIntervalCategoryDataset defaultIntervalCategoryDataset = ((DefaultIntervalCategoryDataset) createInstance("org.jfree.data.category.DefaultIntervalCategoryDataset"));
        
        ArrayList actual = ((ArrayList) defaultIntervalCategoryDataset.getRowKeys());
        
        ArrayList expected = new ArrayList();
        
        assertTrue(deepEquals(expected, actual));
    }
    
    /**
    @utbot.classUnderTest {@link DefaultIntervalCategoryDataset}
 * @utbot.methodUnderTest {@link org.jfree.data.category.DefaultIntervalCategoryDataset#getRowKeys()}
 * @utbot.executesCondition {@code (this.seriesKeys == null): False}
 * @utbot.invokes {@link java.util.Arrays#asList(java.lang.Object[])}
 * @utbot.invokes {@link java.util.Collections#unmodifiableList(java.util.List)}
 * @utbot.returnsFrom {@code return Collections.unmodifiableList(Arrays.asList(this.seriesKeys));}
 *  */
    @Test
    public void testGetRowKeys_ThisSeriesKeysNotEqualsNull() throws Exception  {
        DefaultIntervalCategoryDataset defaultIntervalCategoryDataset = ((DefaultIntervalCategoryDataset) createInstance("org.jfree.data.category.DefaultIntervalCategoryDataset"));
        java.lang.Comparable[] seriesKeys = {null};
        defaultIntervalCategoryDataset.setSeriesKeys(seriesKeys);
        
        List actual = defaultIntervalCategoryDataset.getRowKeys();
        
        List expected = new ArrayList();
        expected.add(null);
        
        assertTrue(deepEquals(expected, actual));
        
        java.lang.Comparable[] defaultIntervalCategoryDatasetSeriesKeys = ((java.lang.Comparable[]) getFieldValue(defaultIntervalCategoryDataset, "org.jfree.data.category.DefaultIntervalCategoryDataset", "seriesKeys"));
        Comparable finalDefaultIntervalCategoryDatasetSeriesKeys0 = ((Comparable) get(defaultIntervalCategoryDatasetSeriesKeys, 0));
        
        assertNull(finalDefaultIntervalCategoryDatasetSeriesKeys0);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.data.category.DefaultIntervalCategoryDataset.getCategoryCount
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getCategoryCount()
    
    /**
    @utbot.classUnderTest {@link DefaultIntervalCategoryDataset}
 * @utbot.methodUnderTest {@link org.jfree.data.category.DefaultIntervalCategoryDataset#getCategoryCount()}
 * @utbot.executesCondition {@code (this.startData != null): True}
 * @utbot.executesCondition {@code (getSeriesCount() > 0): True}
 * @utbot.returnsFrom {@code return result;}
 *  */
    @Test
    public void testGetCategoryCount_GetSeriesCountGreaterThanZero() throws Exception  {
        DefaultIntervalCategoryDataset defaultIntervalCategoryDataset = ((DefaultIntervalCategoryDataset) createInstance("org.jfree.data.category.DefaultIntervalCategoryDataset"));
        java.lang.Number[][] startData = new java.lang.Number[1][];
        java.lang.Object[] striped64Array = createArray("java.util.concurrent.atomic.Striped64", 1);
        startData[0] = ((java.lang.Number[]) striped64Array);
        setField(defaultIntervalCategoryDataset, "org.jfree.data.category.DefaultIntervalCategoryDataset", "startData", startData);
        
        int actual = defaultIntervalCategoryDataset.getCategoryCount();
        
        assertEquals(1, actual);
        
        java.lang.Number[][] defaultIntervalCategoryDatasetStartData = ((java.lang.Number[][]) getFieldValue(defaultIntervalCategoryDataset, "org.jfree.data.category.DefaultIntervalCategoryDataset", "startData"));
        java.lang.Number[] defaultIntervalCategoryDatasetStartDataStartData0 = ((java.lang.Number[]) get(defaultIntervalCategoryDatasetStartData, 0));
        Object finalDefaultIntervalCategoryDatasetStartData00 = get(defaultIntervalCategoryDatasetStartDataStartData0, 0);
        
        assertNull(finalDefaultIntervalCategoryDatasetStartData00);
    }
    
    /**
    @utbot.classUnderTest {@link DefaultIntervalCategoryDataset}
 * @utbot.methodUnderTest {@link org.jfree.data.category.DefaultIntervalCategoryDataset#getCategoryCount()}
 * @utbot.executesCondition {@code (this.startData != null): True}
 * @utbot.executesCondition {@code (getSeriesCount() > 0): False}
 * @utbot.returnsFrom {@code return result;}
 *  */
    @Test
    public void testGetCategoryCount_GetSeriesCountLessOrEqualZero() throws Exception  {
        DefaultIntervalCategoryDataset defaultIntervalCategoryDataset = ((DefaultIntervalCategoryDataset) createInstance("org.jfree.data.category.DefaultIntervalCategoryDataset"));
        java.lang.Number[][] startData = {};
        setField(defaultIntervalCategoryDataset, "org.jfree.data.category.DefaultIntervalCategoryDataset", "startData", startData);
        
        int actual = defaultIntervalCategoryDataset.getCategoryCount();
        
        assertEquals(0, actual);
    }
    
    /**
    @utbot.classUnderTest {@link DefaultIntervalCategoryDataset}
 * @utbot.methodUnderTest {@link org.jfree.data.category.DefaultIntervalCategoryDataset#getCategoryCount()}
 * @utbot.executesCondition {@code (this.startData != null): False}
 * @utbot.returnsFrom {@code return result;}
 *  */
    @Test
    public void testGetCategoryCount_ThisStartDataEqualsNull() throws Exception  {
        DefaultIntervalCategoryDataset defaultIntervalCategoryDataset = ((DefaultIntervalCategoryDataset) createInstance("org.jfree.data.category.DefaultIntervalCategoryDataset"));
        
        int actual = defaultIntervalCategoryDataset.getCategoryCount();
        
        assertEquals(0, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getCategoryCount()
    
    /**
    @utbot.classUnderTest {@link DefaultIntervalCategoryDataset}
 * @utbot.methodUnderTest {@link org.jfree.data.category.DefaultIntervalCategoryDataset#getCategoryCount()}
 * @utbot.executesCondition {@code (this.startData != null): True}
 * @utbot.executesCondition {@code (getSeriesCount() > 0): True}
 * @utbot.invokes {@link org.jfree.data.category.DefaultIntervalCategoryDataset#getSeriesCount()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: result = this.startData[0].length;
 *  */
    @Test
    public void testGetCategoryCount_ThrowNullPointerException() throws Exception  {
        DefaultIntervalCategoryDataset defaultIntervalCategoryDataset = ((DefaultIntervalCategoryDataset) createInstance("org.jfree.data.category.DefaultIntervalCategoryDataset"));
        java.lang.Number[][] startData = {null};
        setField(defaultIntervalCategoryDataset, "org.jfree.data.category.DefaultIntervalCategoryDataset", "startData", startData);
        
        /* This test fails because method [org.jfree.data.category.DefaultIntervalCategoryDataset.getCategoryCount] produces [java.lang.NullPointerException]
            org.jfree.data.category.DefaultIntervalCategoryDataset.getCategoryCount(DefaultIntervalCategoryDataset.java:299) */
        defaultIntervalCategoryDataset.getCategoryCount();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.data.category.DefaultIntervalCategoryDataset.setSeriesKeys
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setSeriesKeys([Ljava.lang.Comparable;)
    
    /**
    @utbot.classUnderTest {@link DefaultIntervalCategoryDataset}
 * @utbot.methodUnderTest {@link org.jfree.data.category.DefaultIntervalCategoryDataset#setSeriesKeys(java.lang.Comparable[])}
 * @utbot.executesCondition {@code (seriesKeys == null): False}
 * @utbot.executesCondition {@code (seriesKeys.length != getSeriesCount()): False}
 * @utbot.invokes {@link org.jfree.data.category.DefaultIntervalCategoryDataset#getSeriesCount()}
 * @utbot.invokes {@link org.jfree.data.category.DefaultIntervalCategoryDataset#fireDatasetChanged()}
 *  */
    @Test
    public void testSetSeriesKeys_SeriesKeysLengthEqualsGetSeriesCount() throws Exception  {
        DefaultIntervalCategoryDataset defaultIntervalCategoryDataset = ((DefaultIntervalCategoryDataset) createInstance("org.jfree.data.category.DefaultIntervalCategoryDataset"));
        java.lang.Comparable[] seriesKeys = {null};
        defaultIntervalCategoryDataset.setSeriesKeys(seriesKeys);
        EventListenerList listenerList = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
        java.lang.Object[] listenerList1 = {null, null};
        setField(listenerList, "javax.swing.event.EventListenerList", "listenerList", listenerList1);
        setField(defaultIntervalCategoryDataset, "org.jfree.data.general.AbstractDataset", "listenerList", listenerList);
        java.lang.Comparable[] comparableArray = {};
        
        java.lang.Comparable[] initialDefaultIntervalCategoryDatasetSeriesKeys = ((java.lang.Comparable[]) getFieldValue(defaultIntervalCategoryDataset, "org.jfree.data.category.DefaultIntervalCategoryDataset", "seriesKeys"));
        
        defaultIntervalCategoryDataset.setSeriesKeys(comparableArray);
        
        java.lang.Comparable[] finalDefaultIntervalCategoryDatasetSeriesKeys = ((java.lang.Comparable[]) getFieldValue(defaultIntervalCategoryDataset, "org.jfree.data.category.DefaultIntervalCategoryDataset", "seriesKeys"));
        
        assertFalse(initialDefaultIntervalCategoryDatasetSeriesKeys == finalDefaultIntervalCategoryDatasetSeriesKeys);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method setSeriesKeys([Ljava.lang.Comparable;)
    
    /**
    @utbot.classUnderTest {@link DefaultIntervalCategoryDataset}
 * @utbot.methodUnderTest {@link org.jfree.data.category.DefaultIntervalCategoryDataset#setSeriesKeys(java.lang.Comparable[])}
 * @utbot.executesCondition {@code (seriesKeys == null): True}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: seriesKeys == null
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testSetSeriesKeys_ThrowIllegalArgumentException() throws Exception  {
        DefaultIntervalCategoryDataset defaultIntervalCategoryDataset = ((DefaultIntervalCategoryDataset) createInstance("org.jfree.data.category.DefaultIntervalCategoryDataset"));
        
        defaultIntervalCategoryDataset.setSeriesKeys(null);
    }
    
    /**
    @utbot.classUnderTest {@link DefaultIntervalCategoryDataset}
 * @utbot.methodUnderTest {@link org.jfree.data.category.DefaultIntervalCategoryDataset#setSeriesKeys(java.lang.Comparable[])}
 * @utbot.executesCondition {@code (seriesKeys == null): False}
 * @utbot.executesCondition {@code (seriesKeys.length != getSeriesCount()): True}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: seriesKeys.length != getSeriesCount()
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testSetSeriesKeys_ThrowIllegalArgumentException_1() throws Exception  {
        DefaultIntervalCategoryDataset defaultIntervalCategoryDataset = ((DefaultIntervalCategoryDataset) createInstance("org.jfree.data.category.DefaultIntervalCategoryDataset"));
        java.lang.Number[][] startData = {};
        setField(defaultIntervalCategoryDataset, "org.jfree.data.category.DefaultIntervalCategoryDataset", "startData", startData);
        java.lang.Comparable[] comparableArray = {null};
        
        defaultIntervalCategoryDataset.setSeriesKeys(comparableArray);
    }
    
    /**
    @utbot.classUnderTest {@link DefaultIntervalCategoryDataset}
 * @utbot.methodUnderTest {@link org.jfree.data.category.DefaultIntervalCategoryDataset#setSeriesKeys(java.lang.Comparable[])}
 * @utbot.executesCondition {@code (seriesKeys == null): False}
 * @utbot.executesCondition {@code (seriesKeys.length != getSeriesCount()): True}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: seriesKeys.length != getSeriesCount()
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testSetSeriesKeys_ThrowIllegalArgumentException_2() throws Exception  {
        DefaultIntervalCategoryDataset defaultIntervalCategoryDataset = ((DefaultIntervalCategoryDataset) createInstance("org.jfree.data.category.DefaultIntervalCategoryDataset"));
        java.lang.Comparable[] comparableArray = {null};
        
        defaultIntervalCategoryDataset.setSeriesKeys(comparableArray);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method setSeriesKeys([Ljava.lang.Comparable;)
    
    /**
    @utbot.classUnderTest {@link DefaultIntervalCategoryDataset}
 * @utbot.methodUnderTest {@link org.jfree.data.category.DefaultIntervalCategoryDataset#setSeriesKeys(java.lang.Comparable[])}
 * @utbot.executesCondition {@code (seriesKeys == null): False}
 * @utbot.executesCondition {@code (seriesKeys.length != getSeriesCount()): False}
 * @utbot.invokes {@link org.jfree.data.category.DefaultIntervalCategoryDataset#getSeriesCount()}
 * @utbot.invokes {@link org.jfree.data.category.DefaultIntervalCategoryDataset#fireDatasetChanged()}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: fireDatasetChanged();
 *  */
    @Test
    public void testSetSeriesKeys_ThrowClassCastException() throws Exception  {
        DefaultIntervalCategoryDataset defaultIntervalCategoryDataset = ((DefaultIntervalCategoryDataset) createInstance("org.jfree.data.category.DefaultIntervalCategoryDataset"));
        java.lang.Comparable[] seriesKeys = {null};
        defaultIntervalCategoryDataset.setSeriesKeys(seriesKeys);
        java.lang.Number[][] startData = {};
        setField(defaultIntervalCategoryDataset, "org.jfree.data.category.DefaultIntervalCategoryDataset", "startData", startData);
        EventListenerList listenerList = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
        java.lang.Object[] listenerList1 = new java.lang.Object[2];
        Class class1 = Object.class;
        listenerList1[0] = ((Object) class1);
        Object object = createInstance("java.lang.Object");
        listenerList1[1] = object;
        setField(listenerList, "javax.swing.event.EventListenerList", "listenerList", listenerList1);
        setField(defaultIntervalCategoryDataset, "org.jfree.data.general.AbstractDataset", "listenerList", listenerList);
        java.lang.Comparable[] comparableArray = {};
        
        /* This test fails because method [org.jfree.data.category.DefaultIntervalCategoryDataset.setSeriesKeys] produces [java.lang.ClassCastException: The object with type java.lang.Object can not be casted to org.jfree.data.general.DatasetChangeListener] */
        defaultIntervalCategoryDataset.setSeriesKeys(comparableArray);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.data.category.DefaultIntervalCategoryDataset.getEndValue
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getEndValue(int, int)
    
    /**
    @utbot.classUnderTest {@link DefaultIntervalCategoryDataset}
 * @utbot.methodUnderTest {@link org.jfree.data.category.DefaultIntervalCategoryDataset#getEndValue(int,int)}
 * @utbot.executesCondition {@code (series < 0): False}
 * @utbot.executesCondition {@code (category < 0): False}
 * @utbot.invokes {@link org.jfree.data.category.DefaultIntervalCategoryDataset#getSeriesCount()}
 * @utbot.invokes {@link org.jfree.data.category.DefaultIntervalCategoryDataset#getCategoryCount()}
 * @utbot.returnsFrom {@code return this.endData[series][category];}
 *  */
    @Test
    public void testGetEndValue_CategoryGreaterOrEqualZero() throws Exception  {
        DefaultIntervalCategoryDataset defaultIntervalCategoryDataset = ((DefaultIntervalCategoryDataset) createInstance("org.jfree.data.category.DefaultIntervalCategoryDataset"));
        java.lang.Number[][] startData = new java.lang.Number[1][];
        java.util.concurrent.atomic.LongAdder[] longAdderArray = {null};
        startData[0] = ((java.lang.Number[]) longAdderArray);
        setField(defaultIntervalCategoryDataset, "org.jfree.data.category.DefaultIntervalCategoryDataset", "startData", startData);
        java.lang.Number[][] endData = new java.lang.Number[1][];
        endData[0] = ((java.lang.Number[]) longAdderArray);
        setField(defaultIntervalCategoryDataset, "org.jfree.data.category.DefaultIntervalCategoryDataset", "endData", endData);
        
        Number actual = defaultIntervalCategoryDataset.getEndValue(0, 0);
        
        assertNull(actual);
        
        java.lang.Number[][] defaultIntervalCategoryDatasetStartData = ((java.lang.Number[][]) getFieldValue(defaultIntervalCategoryDataset, "org.jfree.data.category.DefaultIntervalCategoryDataset", "startData"));
        java.lang.Number[] defaultIntervalCategoryDatasetStartDataStartData0 = ((java.lang.Number[]) get(defaultIntervalCategoryDatasetStartData, 0));
        LongAdder finalDefaultIntervalCategoryDatasetStartData00 = ((LongAdder) get(defaultIntervalCategoryDatasetStartDataStartData0, 0));
        
        assertNull(finalDefaultIntervalCategoryDatasetStartData00);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method getEndValue(int, int)
    
    /**
    @utbot.classUnderTest {@link DefaultIntervalCategoryDataset}
 * @utbot.methodUnderTest {@link org.jfree.data.category.DefaultIntervalCategoryDataset#getEndValue(int,int)}
 * @utbot.executesCondition {@code (series < 0): True}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: (series < 0) || (series >= getSeriesCount())
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testGetEndValue_ThrowIllegalArgumentException_2() throws Exception  {
        DefaultIntervalCategoryDataset defaultIntervalCategoryDataset = ((DefaultIntervalCategoryDataset) createInstance("org.jfree.data.category.DefaultIntervalCategoryDataset"));
        
        defaultIntervalCategoryDataset.getEndValue(-1, -255);
    }
    
    /**
    @utbot.classUnderTest {@link DefaultIntervalCategoryDataset}
 * @utbot.methodUnderTest {@link org.jfree.data.category.DefaultIntervalCategoryDataset#getEndValue(int,int)}
 * @utbot.executesCondition {@code (series < 0): False}
 * @utbot.executesCondition {@code (category < 0): False}
 * @utbot.invokes {@link org.jfree.data.category.DefaultIntervalCategoryDataset#getCategoryCount()}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: (category < 0) || (category >= getCategoryCount())
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testGetEndValue_ThrowIllegalArgumentException() throws Exception  {
        DefaultIntervalCategoryDataset defaultIntervalCategoryDataset = ((DefaultIntervalCategoryDataset) createInstance("org.jfree.data.category.DefaultIntervalCategoryDataset"));
        java.lang.Number[][] startData = new java.lang.Number[1][];
        java.util.concurrent.atomic.LongAdder[] longAdderArray = {};
        startData[0] = ((java.lang.Number[]) longAdderArray);
        setField(defaultIntervalCategoryDataset, "org.jfree.data.category.DefaultIntervalCategoryDataset", "startData", startData);
        
        defaultIntervalCategoryDataset.getEndValue(0, 0);
    }
    
    /**
    @utbot.classUnderTest {@link DefaultIntervalCategoryDataset}
 * @utbot.methodUnderTest {@link org.jfree.data.category.DefaultIntervalCategoryDataset#getEndValue(int,int)}
 * @utbot.executesCondition {@code (series < 0): False}
 * @utbot.executesCondition {@code (category < 0): True}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: (category < 0) || (category >= getCategoryCount())
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testGetEndValue_ThrowIllegalArgumentException_1() throws Exception  {
        DefaultIntervalCategoryDataset defaultIntervalCategoryDataset = ((DefaultIntervalCategoryDataset) createInstance("org.jfree.data.category.DefaultIntervalCategoryDataset"));
        java.lang.Number[][] startData = {null};
        setField(defaultIntervalCategoryDataset, "org.jfree.data.category.DefaultIntervalCategoryDataset", "startData", startData);
        
        defaultIntervalCategoryDataset.getEndValue(0, -1);
    }
    
    /**
    @utbot.classUnderTest {@link DefaultIntervalCategoryDataset}
 * @utbot.methodUnderTest {@link org.jfree.data.category.DefaultIntervalCategoryDataset#getEndValue(int,int)}
 * @utbot.executesCondition {@code (series < 0): False}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: (series < 0) || (series >= getSeriesCount())
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testGetEndValue_ThrowIllegalArgumentException_3() throws Exception  {
        DefaultIntervalCategoryDataset defaultIntervalCategoryDataset = ((DefaultIntervalCategoryDataset) createInstance("org.jfree.data.category.DefaultIntervalCategoryDataset"));
        java.lang.Number[][] startData = {};
        setField(defaultIntervalCategoryDataset, "org.jfree.data.category.DefaultIntervalCategoryDataset", "startData", startData);
        
        defaultIntervalCategoryDataset.getEndValue(0, -255);
    }
    
    /**
    @utbot.classUnderTest {@link DefaultIntervalCategoryDataset}
 * @utbot.methodUnderTest {@link org.jfree.data.category.DefaultIntervalCategoryDataset#getEndValue(int,int)}
 * @utbot.executesCondition {@code (series < 0): False}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: (series < 0) || (series >= getSeriesCount())
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testGetEndValue_ThrowIllegalArgumentException_4() throws Exception  {
        DefaultIntervalCategoryDataset defaultIntervalCategoryDataset = ((DefaultIntervalCategoryDataset) createInstance("org.jfree.data.category.DefaultIntervalCategoryDataset"));
        
        defaultIntervalCategoryDataset.getEndValue(0, -255);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getEndValue(int, int)
    
    /**
    @utbot.classUnderTest {@link DefaultIntervalCategoryDataset}
 * @utbot.methodUnderTest {@link org.jfree.data.category.DefaultIntervalCategoryDataset#getEndValue(int,int)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return this.endData[series][category];
 *  */
    @Test
    public void testGetEndValue_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        DefaultIntervalCategoryDataset defaultIntervalCategoryDataset = ((DefaultIntervalCategoryDataset) createInstance("org.jfree.data.category.DefaultIntervalCategoryDataset"));
        java.lang.Number[][] startData = new java.lang.Number[1][];
        java.util.concurrent.atomic.LongAdder[] longAdderArray = {null};
        startData[0] = ((java.lang.Number[]) longAdderArray);
        setField(defaultIntervalCategoryDataset, "org.jfree.data.category.DefaultIntervalCategoryDataset", "startData", startData);
        java.lang.Number[][] endData = {};
        setField(defaultIntervalCategoryDataset, "org.jfree.data.category.DefaultIntervalCategoryDataset", "endData", endData);
        
        /* This test fails because method [org.jfree.data.category.DefaultIntervalCategoryDataset.getEndValue] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.jfree.data.category.DefaultIntervalCategoryDataset.getEndValue(DefaultIntervalCategoryDataset.java:494) */
        defaultIntervalCategoryDataset.getEndValue(0, 0);
    }
    
    /**
    @utbot.classUnderTest {@link DefaultIntervalCategoryDataset}
 * @utbot.methodUnderTest {@link org.jfree.data.category.DefaultIntervalCategoryDataset#getEndValue(int,int)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return this.endData[series][category];
 *  */
    @Test
    public void testGetEndValue_ThrowArrayIndexOutOfBoundsException_1() throws Exception  {
        DefaultIntervalCategoryDataset defaultIntervalCategoryDataset = ((DefaultIntervalCategoryDataset) createInstance("org.jfree.data.category.DefaultIntervalCategoryDataset"));
        java.lang.Number[][] startData = new java.lang.Number[1][];
        java.util.concurrent.atomic.LongAdder[] longAdderArray = {null};
        startData[0] = ((java.lang.Number[]) longAdderArray);
        setField(defaultIntervalCategoryDataset, "org.jfree.data.category.DefaultIntervalCategoryDataset", "startData", startData);
        java.lang.Number[][] endData = new java.lang.Number[1][];
        java.util.concurrent.atomic.LongAdder[] longAdderArray1 = {};
        endData[0] = ((java.lang.Number[]) longAdderArray1);
        setField(defaultIntervalCategoryDataset, "org.jfree.data.category.DefaultIntervalCategoryDataset", "endData", endData);
        
        /* This test fails because method [org.jfree.data.category.DefaultIntervalCategoryDataset.getEndValue] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.jfree.data.category.DefaultIntervalCategoryDataset.getEndValue(DefaultIntervalCategoryDataset.java:494) */
        defaultIntervalCategoryDataset.getEndValue(0, 0);
    }
    
    /**
    @utbot.classUnderTest {@link DefaultIntervalCategoryDataset}
 * @utbot.methodUnderTest {@link org.jfree.data.category.DefaultIntervalCategoryDataset#getEndValue(int,int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return this.endData[series][category];
 *  */
    @Test
    public void testGetEndValue_ThrowNullPointerException_1() throws Exception  {
        DefaultIntervalCategoryDataset defaultIntervalCategoryDataset = ((DefaultIntervalCategoryDataset) createInstance("org.jfree.data.category.DefaultIntervalCategoryDataset"));
        java.lang.Number[][] startData = new java.lang.Number[1][];
        java.util.concurrent.atomic.LongAdder[] longAdderArray = {null};
        startData[0] = ((java.lang.Number[]) longAdderArray);
        setField(defaultIntervalCategoryDataset, "org.jfree.data.category.DefaultIntervalCategoryDataset", "startData", startData);
        java.lang.Number[][] endData = {null};
        setField(defaultIntervalCategoryDataset, "org.jfree.data.category.DefaultIntervalCategoryDataset", "endData", endData);
        
        /* This test fails because method [org.jfree.data.category.DefaultIntervalCategoryDataset.getEndValue] produces [java.lang.NullPointerException]
            org.jfree.data.category.DefaultIntervalCategoryDataset.getEndValue(DefaultIntervalCategoryDataset.java:494) */
        defaultIntervalCategoryDataset.getEndValue(0, 0);
    }
    
    /**
    @utbot.classUnderTest {@link DefaultIntervalCategoryDataset}
 * @utbot.methodUnderTest {@link org.jfree.data.category.DefaultIntervalCategoryDataset#getEndValue(int,int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return this.endData[series][category];
 *  */
    @Test
    public void testGetEndValue_ThrowNullPointerException() throws Exception  {
        DefaultIntervalCategoryDataset defaultIntervalCategoryDataset = ((DefaultIntervalCategoryDataset) createInstance("org.jfree.data.category.DefaultIntervalCategoryDataset"));
        java.lang.Number[][] startData = new java.lang.Number[1][];
        java.util.concurrent.atomic.LongAdder[] longAdderArray = {null};
        startData[0] = ((java.lang.Number[]) longAdderArray);
        setField(defaultIntervalCategoryDataset, "org.jfree.data.category.DefaultIntervalCategoryDataset", "startData", startData);
        
        /* This test fails because method [org.jfree.data.category.DefaultIntervalCategoryDataset.getEndValue] produces [java.lang.NullPointerException]
            org.jfree.data.category.DefaultIntervalCategoryDataset.getEndValue(DefaultIntervalCategoryDataset.java:494) */
        defaultIntervalCategoryDataset.getEndValue(0, 0);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.data.category.DefaultIntervalCategoryDataset.getEndValue
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method getEndValue(java.lang.Comparable, java.lang.Comparable)
    
    /**
    @utbot.classUnderTest {@link DefaultIntervalCategoryDataset}
 * @utbot.methodUnderTest {@link org.jfree.data.category.DefaultIntervalCategoryDataset#getEndValue(java.lang.Comparable,java.lang.Comparable)}
 * @utbot.throwsException {@link org.jfree.data.UnknownKeyException} when: seriesIndex < 0
 *  */
    @Test(expected = UnknownKeyException.class)
    public void testGetEndValue_ThrowUnknownKeyException() throws Exception  {
        DefaultIntervalCategoryDataset defaultIntervalCategoryDataset = ((DefaultIntervalCategoryDataset) createInstance("org.jfree.data.category.DefaultIntervalCategoryDataset"));
        java.lang.Comparable[] seriesKeys = {};
        defaultIntervalCategoryDataset.setSeriesKeys(seriesKeys);
        
        defaultIntervalCategoryDataset.getEndValue(((Comparable) null), ((Comparable) null));
    }
    
    /**
    @utbot.classUnderTest {@link DefaultIntervalCategoryDataset}
 * @utbot.methodUnderTest {@link org.jfree.data.category.DefaultIntervalCategoryDataset#getEndValue(java.lang.Comparable,java.lang.Comparable)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: int itemIndex = getColumnIndex(category);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testGetEndValue_ThrowIllegalArgumentException1() throws Exception  {
        DefaultIntervalCategoryDataset defaultIntervalCategoryDataset = ((DefaultIntervalCategoryDataset) createInstance("org.jfree.data.category.DefaultIntervalCategoryDataset"));
        java.lang.Comparable[] seriesKeys = new java.lang.Comparable[1];
        Integer integer = 0;
        seriesKeys[0] = ((Comparable) integer);
        defaultIntervalCategoryDataset.setSeriesKeys(seriesKeys);
        Integer integer1 = 0;
        
        defaultIntervalCategoryDataset.getEndValue(((Comparable) integer1), ((Comparable) null));
    }
    
    /**
    @utbot.classUnderTest {@link DefaultIntervalCategoryDataset}
 * @utbot.methodUnderTest {@link org.jfree.data.category.DefaultIntervalCategoryDataset#getEndValue(java.lang.Comparable,java.lang.Comparable)}
 * @utbot.throwsException {@link org.jfree.data.UnknownKeyException} when: seriesIndex < 0
 *  */
    @Test(expected = UnknownKeyException.class)
    public void testGetEndValue_ThrowUnknownKeyException_2() throws Exception  {
        DefaultIntervalCategoryDataset defaultIntervalCategoryDataset = ((DefaultIntervalCategoryDataset) createInstance("org.jfree.data.category.DefaultIntervalCategoryDataset"));
        java.lang.Comparable[] seriesKeys = {null};
        defaultIntervalCategoryDataset.setSeriesKeys(seriesKeys);
        Integer integer = 0;
        
        defaultIntervalCategoryDataset.getEndValue(((Comparable) integer), ((Comparable) null));
    }
    
    /**
    @utbot.classUnderTest {@link DefaultIntervalCategoryDataset}
 * @utbot.methodUnderTest {@link org.jfree.data.category.DefaultIntervalCategoryDataset#getEndValue(java.lang.Comparable,java.lang.Comparable)}
 * @utbot.throwsException {@link org.jfree.data.UnknownKeyException} when: itemIndex < 0
 *  */
    @Test(expected = UnknownKeyException.class)
    public void testGetEndValue_ThrowUnknownKeyException_1() throws Exception  {
        DefaultIntervalCategoryDataset defaultIntervalCategoryDataset = ((DefaultIntervalCategoryDataset) createInstance("org.jfree.data.category.DefaultIntervalCategoryDataset"));
        java.lang.Comparable[] seriesKeys = new java.lang.Comparable[1];
        Integer integer = 0;
        seriesKeys[0] = ((Comparable) integer);
        defaultIntervalCategoryDataset.setSeriesKeys(seriesKeys);
        java.lang.Comparable[] categoryKeys = {};
        defaultIntervalCategoryDataset.setCategoryKeys(categoryKeys);
        Integer integer1 = 0;
        Integer integer2 = 0;
        
        defaultIntervalCategoryDataset.getEndValue(((Comparable) integer1), ((Comparable) integer2));
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method getEndValue(java.lang.Comparable, java.lang.Comparable)
    
    @Test(expected = UnknownKeyException.class)
    public void testGetEndValue1() throws Throwable  {
        DefaultIntervalCategoryDataset defaultIntervalCategoryDataset = ((DefaultIntervalCategoryDataset) createInstance("org.jfree.data.category.DefaultIntervalCategoryDataset"));
        java.lang.Comparable[] seriesKeys = {null, null, null, null, null, null, null, null, null};
        defaultIntervalCategoryDataset.setSeriesKeys(seriesKeys);
        Character character = '\u0000';
        Class unitClazz = Class.forName("java.time.temporal.IsoFields$Unit");
        Object unit = getEnumConstantByName(unitClazz, "WEEK_BASED_YEARS");
        
        Class defaultIntervalCategoryDatasetClazz = Class.forName("org.jfree.data.category.DefaultIntervalCategoryDataset");
        Class characterType = Class.forName("java.lang.Comparable");
        Method getEndValueMethod = defaultIntervalCategoryDatasetClazz.getDeclaredMethod("getEndValue", characterType, characterType);
        getEndValueMethod.setAccessible(true);
        java.lang.Object[] getEndValueMethodArguments = new java.lang.Object[2];
        getEndValueMethodArguments[0] = character;
        getEndValueMethodArguments[1] = unit;
        try {
            getEndValueMethod.invoke(defaultIntervalCategoryDataset, getEndValueMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testGetEndValue2() throws Exception  {
        DefaultIntervalCategoryDataset defaultIntervalCategoryDataset = ((DefaultIntervalCategoryDataset) createInstance("org.jfree.data.category.DefaultIntervalCategoryDataset"));
        java.lang.Comparable[] seriesKeys = new java.lang.Comparable[9];
        Integer integer = 0;
        seriesKeys[0] = ((Comparable) integer);
        Integer integer1 = 0;
        seriesKeys[1] = ((Comparable) integer1);
        seriesKeys[2] = ((Comparable) integer1);
        seriesKeys[3] = ((Comparable) integer1);
        seriesKeys[4] = ((Comparable) integer1);
        seriesKeys[5] = ((Comparable) integer1);
        seriesKeys[6] = ((Comparable) integer1);
        seriesKeys[7] = ((Comparable) integer1);
        seriesKeys[8] = ((Comparable) integer1);
        defaultIntervalCategoryDataset.setSeriesKeys(seriesKeys);
        java.lang.Comparable[] categoryKeys = new java.lang.Comparable[9];
        Character character = '\u0000';
        categoryKeys[1] = ((Comparable) character);
        categoryKeys[2] = ((Comparable) character);
        categoryKeys[3] = ((Comparable) character);
        categoryKeys[4] = ((Comparable) character);
        categoryKeys[5] = ((Comparable) character);
        categoryKeys[6] = ((Comparable) character);
        categoryKeys[7] = ((Comparable) character);
        categoryKeys[8] = ((Comparable) character);
        defaultIntervalCategoryDataset.setCategoryKeys(categoryKeys);
        
        defaultIntervalCategoryDataset.getEndValue(((Comparable) integer1), character);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method getEndValue(java.lang.Comparable, java.lang.Comparable)
    
    @Test
    public void testGetEndValue3() throws Throwable  {
        DefaultIntervalCategoryDataset defaultIntervalCategoryDataset = ((DefaultIntervalCategoryDataset) createInstance("org.jfree.data.category.DefaultIntervalCategoryDataset"));
        java.lang.Comparable[] seriesKeys = new java.lang.Comparable[10];
        Integer integer = 0;
        seriesKeys[0] = ((Comparable) integer);
        Integer integer1 = 0;
        seriesKeys[1] = ((Comparable) integer1);
        Integer integer2 = 1;
        seriesKeys[2] = ((Comparable) integer2);
        seriesKeys[3] = ((Comparable) integer2);
        seriesKeys[4] = ((Comparable) integer2);
        seriesKeys[5] = ((Comparable) integer2);
        seriesKeys[6] = ((Comparable) integer2);
        seriesKeys[7] = ((Comparable) integer2);
        seriesKeys[8] = ((Comparable) integer2);
        seriesKeys[9] = ((Comparable) integer2);
        defaultIntervalCategoryDataset.setSeriesKeys(seriesKeys);
        Object anonymousField = createInstance("java.time.temporal.IsoFields$Field$2");
        
        /* This test fails because method [org.jfree.data.category.DefaultIntervalCategoryDataset.getEndValue] produces [java.lang.NullPointerException]
            org.jfree.data.category.DefaultIntervalCategoryDataset.getCategoryIndex(DefaultIntervalCategoryDataset.java:574)
            org.jfree.data.category.DefaultIntervalCategoryDataset.getColumnIndex(DefaultIntervalCategoryDataset.java:628)
            org.jfree.data.category.DefaultIntervalCategoryDataset.getEndValue(DefaultIntervalCategoryDataset.java:464) */
        Class defaultIntervalCategoryDatasetClazz = Class.forName("org.jfree.data.category.DefaultIntervalCategoryDataset");
        Class integer2Type = Class.forName("java.lang.Comparable");
        Method getEndValueMethod = defaultIntervalCategoryDatasetClazz.getDeclaredMethod("getEndValue", integer2Type, integer2Type);
        getEndValueMethod.setAccessible(true);
        java.lang.Object[] getEndValueMethodArguments = new java.lang.Object[2];
        getEndValueMethodArguments[0] = integer2;
        getEndValueMethodArguments[1] = anonymousField;
        try {
            getEndValueMethod.invoke(defaultIntervalCategoryDataset, getEndValueMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testGetEndValue4() throws Throwable  {
        DefaultIntervalCategoryDataset defaultIntervalCategoryDataset = ((DefaultIntervalCategoryDataset) createInstance("org.jfree.data.category.DefaultIntervalCategoryDataset"));
        java.lang.Comparable[] seriesKeys = new java.lang.Comparable[9];
        Character character = '\u0000';
        seriesKeys[0] = ((Comparable) character);
        seriesKeys[1] = ((Comparable) character);
        seriesKeys[2] = ((Comparable) character);
        seriesKeys[3] = ((Comparable) character);
        seriesKeys[4] = ((Comparable) character);
        seriesKeys[5] = ((Comparable) character);
        seriesKeys[6] = ((Comparable) character);
        seriesKeys[7] = ((Comparable) character);
        seriesKeys[8] = ((Comparable) character);
        defaultIntervalCategoryDataset.setSeriesKeys(seriesKeys);
        Character character1 = '\u0000';
        Class unitClazz = Class.forName("java.time.temporal.IsoFields$Unit");
        Object unit = getEnumConstantByName(unitClazz, "WEEK_BASED_YEARS");
        
        /* This test fails because method [org.jfree.data.category.DefaultIntervalCategoryDataset.getEndValue] produces [java.lang.NullPointerException]
            org.jfree.data.category.DefaultIntervalCategoryDataset.getCategoryIndex(DefaultIntervalCategoryDataset.java:574)
            org.jfree.data.category.DefaultIntervalCategoryDataset.getColumnIndex(DefaultIntervalCategoryDataset.java:628)
            org.jfree.data.category.DefaultIntervalCategoryDataset.getEndValue(DefaultIntervalCategoryDataset.java:464) */
        Class defaultIntervalCategoryDatasetClazz = Class.forName("org.jfree.data.category.DefaultIntervalCategoryDataset");
        Class character1Type = Class.forName("java.lang.Comparable");
        Method getEndValueMethod = defaultIntervalCategoryDatasetClazz.getDeclaredMethod("getEndValue", character1Type, character1Type);
        getEndValueMethod.setAccessible(true);
        java.lang.Object[] getEndValueMethodArguments = new java.lang.Object[2];
        getEndValueMethodArguments[0] = character1;
        getEndValueMethodArguments[1] = unit;
        try {
            getEndValueMethod.invoke(defaultIntervalCategoryDataset, getEndValueMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testGetEndValue5() throws Exception  {
        DefaultIntervalCategoryDataset defaultIntervalCategoryDataset = ((DefaultIntervalCategoryDataset) createInstance("org.jfree.data.category.DefaultIntervalCategoryDataset"));
        java.lang.Comparable[] seriesKeys = new java.lang.Comparable[9];
        Integer integer = 0;
        seriesKeys[0] = ((Comparable) integer);
        defaultIntervalCategoryDataset.setSeriesKeys(seriesKeys);
        java.lang.Comparable[] categoryKeys = new java.lang.Comparable[9];
        Character character = '\u0000';
        categoryKeys[0] = ((Comparable) character);
        defaultIntervalCategoryDataset.setCategoryKeys(categoryKeys);
        java.lang.Number[][] startData = {
            null,
            null,
            null,
            null,
            null,
            null,
            null,
            null,
            null
        };
        setField(defaultIntervalCategoryDataset, "org.jfree.data.category.DefaultIntervalCategoryDataset", "startData", startData);
        Integer integer1 = 0;
        Character character1 = '\u0000';
        
        /* This test fails because method [org.jfree.data.category.DefaultIntervalCategoryDataset.getEndValue] produces [java.lang.NullPointerException]
            org.jfree.data.category.DefaultIntervalCategoryDataset.getCategoryCount(DefaultIntervalCategoryDataset.java:299)
            org.jfree.data.category.DefaultIntervalCategoryDataset.getEndValue(DefaultIntervalCategoryDataset.java:488)
            org.jfree.data.category.DefaultIntervalCategoryDataset.getEndValue(DefaultIntervalCategoryDataset.java:468) */
        defaultIntervalCategoryDataset.getEndValue(((Comparable) integer1), character1);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.data.category.DefaultIntervalCategoryDataset.getSeriesKey
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getSeriesKey(int)
    
    /**
    @utbot.classUnderTest {@link DefaultIntervalCategoryDataset}
 * @utbot.methodUnderTest {@link org.jfree.data.category.DefaultIntervalCategoryDataset#getSeriesKey(int)}
 * @utbot.executesCondition {@code (series < 0): False}
 * @utbot.invokes {@link org.jfree.data.category.DefaultIntervalCategoryDataset#getSeriesCount()}
 * @utbot.returnsFrom {@code return this.seriesKeys[series];}
 *  */
    @Test
    public void testGetSeriesKey_SeriesGreaterOrEqualZero() throws Exception  {
        DefaultIntervalCategoryDataset defaultIntervalCategoryDataset = ((DefaultIntervalCategoryDataset) createInstance("org.jfree.data.category.DefaultIntervalCategoryDataset"));
        java.lang.Comparable[] seriesKeys = {null};
        defaultIntervalCategoryDataset.setSeriesKeys(seriesKeys);
        java.lang.Number[][] startData = {null};
        setField(defaultIntervalCategoryDataset, "org.jfree.data.category.DefaultIntervalCategoryDataset", "startData", startData);
        
        Comparable actual = defaultIntervalCategoryDataset.getSeriesKey(0);
        
        assertNull(actual);
        
        java.lang.Comparable[] defaultIntervalCategoryDatasetSeriesKeys = ((java.lang.Comparable[]) getFieldValue(defaultIntervalCategoryDataset, "org.jfree.data.category.DefaultIntervalCategoryDataset", "seriesKeys"));
        Comparable finalDefaultIntervalCategoryDatasetSeriesKeys0 = ((Comparable) get(defaultIntervalCategoryDatasetSeriesKeys, 0));
        java.lang.Number[][] defaultIntervalCategoryDatasetStartData = ((java.lang.Number[][]) getFieldValue(defaultIntervalCategoryDataset, "org.jfree.data.category.DefaultIntervalCategoryDataset", "startData"));
        java.lang.Number[] finalDefaultIntervalCategoryDatasetStartData0 = ((java.lang.Number[]) get(defaultIntervalCategoryDatasetStartData, 0));
        
        assertNull(finalDefaultIntervalCategoryDatasetSeriesKeys0);
        
        assertNull(finalDefaultIntervalCategoryDatasetStartData0);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method getSeriesKey(int)
    
    /**
    @utbot.classUnderTest {@link DefaultIntervalCategoryDataset}
 * @utbot.methodUnderTest {@link org.jfree.data.category.DefaultIntervalCategoryDataset#getSeriesKey(int)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: (series >= getSeriesCount()) || (series < 0)
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testGetSeriesKey_ThrowIllegalArgumentException_2() throws Exception  {
        DefaultIntervalCategoryDataset defaultIntervalCategoryDataset = ((DefaultIntervalCategoryDataset) createInstance("org.jfree.data.category.DefaultIntervalCategoryDataset"));
        java.lang.Number[][] startData = {
            null,
            null
        };
        setField(defaultIntervalCategoryDataset, "org.jfree.data.category.DefaultIntervalCategoryDataset", "startData", startData);
        
        defaultIntervalCategoryDataset.getSeriesKey(2);
    }
    
    /**
    @utbot.classUnderTest {@link DefaultIntervalCategoryDataset}
 * @utbot.methodUnderTest {@link org.jfree.data.category.DefaultIntervalCategoryDataset#getSeriesKey(int)}
 * @utbot.executesCondition {@code (series < 0): True}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: (series >= getSeriesCount()) || (series < 0)
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testGetSeriesKey_ThrowIllegalArgumentException() throws Exception  {
        DefaultIntervalCategoryDataset defaultIntervalCategoryDataset = ((DefaultIntervalCategoryDataset) createInstance("org.jfree.data.category.DefaultIntervalCategoryDataset"));
        
        defaultIntervalCategoryDataset.getSeriesKey(-1);
    }
    
    /**
    @utbot.classUnderTest {@link DefaultIntervalCategoryDataset}
 * @utbot.methodUnderTest {@link org.jfree.data.category.DefaultIntervalCategoryDataset#getSeriesKey(int)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: (series >= getSeriesCount()) || (series < 0)
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testGetSeriesKey_ThrowIllegalArgumentException_1() throws Exception  {
        DefaultIntervalCategoryDataset defaultIntervalCategoryDataset = ((DefaultIntervalCategoryDataset) createInstance("org.jfree.data.category.DefaultIntervalCategoryDataset"));
        
        defaultIntervalCategoryDataset.getSeriesKey(0);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getSeriesKey(int)
    
    /**
    @utbot.classUnderTest {@link DefaultIntervalCategoryDataset}
 * @utbot.methodUnderTest {@link org.jfree.data.category.DefaultIntervalCategoryDataset#getSeriesKey(int)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return this.seriesKeys[series];
 *  */
    @Test
    public void testGetSeriesKey_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        DefaultIntervalCategoryDataset defaultIntervalCategoryDataset = ((DefaultIntervalCategoryDataset) createInstance("org.jfree.data.category.DefaultIntervalCategoryDataset"));
        java.lang.Comparable[] seriesKeys = {};
        defaultIntervalCategoryDataset.setSeriesKeys(seriesKeys);
        java.lang.Number[][] startData = {null};
        setField(defaultIntervalCategoryDataset, "org.jfree.data.category.DefaultIntervalCategoryDataset", "startData", startData);
        
        /* This test fails because method [org.jfree.data.category.DefaultIntervalCategoryDataset.getSeriesKey] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.jfree.data.category.DefaultIntervalCategoryDataset.getSeriesKey(DefaultIntervalCategoryDataset.java:264) */
        defaultIntervalCategoryDataset.getSeriesKey(0);
    }
    
    /**
    @utbot.classUnderTest {@link DefaultIntervalCategoryDataset}
 * @utbot.methodUnderTest {@link org.jfree.data.category.DefaultIntervalCategoryDataset#getSeriesKey(int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return this.seriesKeys[series];
 *  */
    @Test
    public void testGetSeriesKey_ThrowNullPointerException() throws Exception  {
        DefaultIntervalCategoryDataset defaultIntervalCategoryDataset = ((DefaultIntervalCategoryDataset) createInstance("org.jfree.data.category.DefaultIntervalCategoryDataset"));
        java.lang.Number[][] startData = {null};
        setField(defaultIntervalCategoryDataset, "org.jfree.data.category.DefaultIntervalCategoryDataset", "startData", startData);
        
        /* This test fails because method [org.jfree.data.category.DefaultIntervalCategoryDataset.getSeriesKey] produces [java.lang.NullPointerException]
            org.jfree.data.category.DefaultIntervalCategoryDataset.getSeriesKey(DefaultIntervalCategoryDataset.java:264) */
        defaultIntervalCategoryDataset.getSeriesKey(0);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.data.category.DefaultIntervalCategoryDataset.setEndValue
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setEndValue(int, java.lang.Comparable, java.lang.Number)
    
    /**
    @utbot.classUnderTest {@link DefaultIntervalCategoryDataset}
 * @utbot.methodUnderTest {@link org.jfree.data.category.DefaultIntervalCategoryDataset#setEndValue(int,java.lang.Comparable,java.lang.Number)}
 * @utbot.executesCondition {@code (series < 0): False}
 * @utbot.executesCondition {@code (series > getSeriesCount() - 1): False}
 * @utbot.invokes {@link org.jfree.data.category.DefaultIntervalCategoryDataset#getSeriesCount()}
 * @utbot.invokes {@link org.jfree.data.category.DefaultIntervalCategoryDataset#getCategoryIndex(java.lang.Comparable)}
 * @utbot.invokes {@link org.jfree.data.category.DefaultIntervalCategoryDataset#fireDatasetChanged()}
 *  */
    @Test
    public void testSetEndValue_SeriesLessOrEqualGetSeriesCountMinus1() throws Exception  {
        DefaultIntervalCategoryDataset defaultIntervalCategoryDataset = ((DefaultIntervalCategoryDataset) createInstance("org.jfree.data.category.DefaultIntervalCategoryDataset"));
        java.lang.Comparable[] categoryKeys = new java.lang.Comparable[1];
        Integer integer = 0;
        categoryKeys[0] = ((Comparable) integer);
        defaultIntervalCategoryDataset.setCategoryKeys(categoryKeys);
        java.lang.Number[][] startData = new java.lang.Number[1][];
        java.lang.Double[] doubleArray = {null};
        startData[0] = ((java.lang.Number[]) doubleArray);
        setField(defaultIntervalCategoryDataset, "org.jfree.data.category.DefaultIntervalCategoryDataset", "startData", startData);
        setField(defaultIntervalCategoryDataset, "org.jfree.data.category.DefaultIntervalCategoryDataset", "endData", startData);
        EventListenerList listenerList = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
        java.lang.Object[] listenerList1 = {null};
        setField(listenerList, "javax.swing.event.EventListenerList", "listenerList", listenerList1);
        setField(defaultIntervalCategoryDataset, "org.jfree.data.general.AbstractDataset", "listenerList", listenerList);
        Integer integer1 = 0;
        
        defaultIntervalCategoryDataset.setEndValue(0, integer1, null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method setEndValue(int, java.lang.Comparable, java.lang.Number)
    
    /**
    @utbot.classUnderTest {@link DefaultIntervalCategoryDataset}
 * @utbot.methodUnderTest {@link org.jfree.data.category.DefaultIntervalCategoryDataset#setEndValue(int,java.lang.Comparable,java.lang.Number)}
 * @utbot.executesCondition {@code (series < 0): True}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: (series < 0) || (series > getSeriesCount() - 1)
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testSetEndValue_ThrowIllegalArgumentException() throws Exception  {
        DefaultIntervalCategoryDataset defaultIntervalCategoryDataset = ((DefaultIntervalCategoryDataset) createInstance("org.jfree.data.category.DefaultIntervalCategoryDataset"));
        
        defaultIntervalCategoryDataset.setEndValue(-1, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link DefaultIntervalCategoryDataset}
 * @utbot.methodUnderTest {@link org.jfree.data.category.DefaultIntervalCategoryDataset#setEndValue(int,java.lang.Comparable,java.lang.Number)}
 * @utbot.executesCondition {@code (series < 0): False}
 * @utbot.executesCondition {@code (series > getSeriesCount() - 1): True}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: (series < 0) || (series > getSeriesCount() - 1)
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testSetEndValue_ThrowIllegalArgumentException_2() throws Exception  {
        DefaultIntervalCategoryDataset defaultIntervalCategoryDataset = ((DefaultIntervalCategoryDataset) createInstance("org.jfree.data.category.DefaultIntervalCategoryDataset"));
        java.lang.Number[][] startData = {};
        setField(defaultIntervalCategoryDataset, "org.jfree.data.category.DefaultIntervalCategoryDataset", "startData", startData);
        
        defaultIntervalCategoryDataset.setEndValue(0, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link DefaultIntervalCategoryDataset}
 * @utbot.methodUnderTest {@link org.jfree.data.category.DefaultIntervalCategoryDataset#setEndValue(int,java.lang.Comparable,java.lang.Number)}
 * @utbot.executesCondition {@code (series < 0): False}
 * @utbot.executesCondition {@code (series > getSeriesCount() - 1): True}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: (series < 0) || (series > getSeriesCount() - 1)
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testSetEndValue_ThrowIllegalArgumentException_1() throws Exception  {
        DefaultIntervalCategoryDataset defaultIntervalCategoryDataset = ((DefaultIntervalCategoryDataset) createInstance("org.jfree.data.category.DefaultIntervalCategoryDataset"));
        
        defaultIntervalCategoryDataset.setEndValue(0, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link DefaultIntervalCategoryDataset}
 * @utbot.methodUnderTest {@link org.jfree.data.category.DefaultIntervalCategoryDataset#setEndValue(int,java.lang.Comparable,java.lang.Number)}
 * @utbot.executesCondition {@code (series < 0): False}
 * @utbot.executesCondition {@code (series > getSeriesCount() - 1): False}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: categoryIndex < 0
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testSetEndValue_ThrowIllegalArgumentException_3() throws Exception  {
        DefaultIntervalCategoryDataset defaultIntervalCategoryDataset = ((DefaultIntervalCategoryDataset) createInstance("org.jfree.data.category.DefaultIntervalCategoryDataset"));
        java.lang.Comparable[] categoryKeys = {};
        defaultIntervalCategoryDataset.setCategoryKeys(categoryKeys);
        java.lang.Number[][] startData = {null};
        setField(defaultIntervalCategoryDataset, "org.jfree.data.category.DefaultIntervalCategoryDataset", "startData", startData);
        
        defaultIntervalCategoryDataset.setEndValue(0, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link DefaultIntervalCategoryDataset}
 * @utbot.methodUnderTest {@link org.jfree.data.category.DefaultIntervalCategoryDataset#setEndValue(int,java.lang.Comparable,java.lang.Number)}
 * @utbot.executesCondition {@code (series < 0): False}
 * @utbot.executesCondition {@code (series > getSeriesCount() - 1): False}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: categoryIndex < 0
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testSetEndValue_ThrowIllegalArgumentException_4() throws Exception  {
        DefaultIntervalCategoryDataset defaultIntervalCategoryDataset = ((DefaultIntervalCategoryDataset) createInstance("org.jfree.data.category.DefaultIntervalCategoryDataset"));
        java.lang.Comparable[] categoryKeys = {null};
        defaultIntervalCategoryDataset.setCategoryKeys(categoryKeys);
        java.lang.Number[][] startData = {null};
        setField(defaultIntervalCategoryDataset, "org.jfree.data.category.DefaultIntervalCategoryDataset", "startData", startData);
        Integer integer = 0;
        
        defaultIntervalCategoryDataset.setEndValue(0, integer, null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method setEndValue(int, java.lang.Comparable, java.lang.Number)
    
    /**
    @utbot.classUnderTest {@link DefaultIntervalCategoryDataset}
 * @utbot.methodUnderTest {@link org.jfree.data.category.DefaultIntervalCategoryDataset#setEndValue(int,java.lang.Comparable,java.lang.Number)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: this.endData[series][categoryIndex] = value;
 *  */
    @Test
    public void testSetEndValue_ThrowArrayIndexOutOfBoundsException_1() throws Exception  {
        DefaultIntervalCategoryDataset defaultIntervalCategoryDataset = ((DefaultIntervalCategoryDataset) createInstance("org.jfree.data.category.DefaultIntervalCategoryDataset"));
        java.lang.Comparable[] categoryKeys = new java.lang.Comparable[1];
        Integer integer = 0;
        categoryKeys[0] = ((Comparable) integer);
        defaultIntervalCategoryDataset.setCategoryKeys(categoryKeys);
        java.lang.Number[][] startData = new java.lang.Number[1][];
        java.lang.Number[] numberArray = {};
        startData[0] = numberArray;
        setField(defaultIntervalCategoryDataset, "org.jfree.data.category.DefaultIntervalCategoryDataset", "startData", startData);
        setField(defaultIntervalCategoryDataset, "org.jfree.data.category.DefaultIntervalCategoryDataset", "endData", startData);
        Integer integer1 = 0;
        
        /* This test fails because method [org.jfree.data.category.DefaultIntervalCategoryDataset.setEndValue] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.jfree.data.category.DefaultIntervalCategoryDataset.setEndValue(DefaultIntervalCategoryDataset.java:558) */
        defaultIntervalCategoryDataset.setEndValue(0, integer1, null);
    }
    
    /**
    @utbot.classUnderTest {@link DefaultIntervalCategoryDataset}
 * @utbot.methodUnderTest {@link org.jfree.data.category.DefaultIntervalCategoryDataset#setEndValue(int,java.lang.Comparable,java.lang.Number)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: this.endData[series][categoryIndex] = value;
 *  */
    @Test
    public void testSetEndValue_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        DefaultIntervalCategoryDataset defaultIntervalCategoryDataset = ((DefaultIntervalCategoryDataset) createInstance("org.jfree.data.category.DefaultIntervalCategoryDataset"));
        java.lang.Comparable[] categoryKeys = new java.lang.Comparable[1];
        Integer integer = 0;
        categoryKeys[0] = ((Comparable) integer);
        defaultIntervalCategoryDataset.setCategoryKeys(categoryKeys);
        java.lang.Number[][] startData = {null};
        setField(defaultIntervalCategoryDataset, "org.jfree.data.category.DefaultIntervalCategoryDataset", "startData", startData);
        java.lang.Number[][] endData = {};
        setField(defaultIntervalCategoryDataset, "org.jfree.data.category.DefaultIntervalCategoryDataset", "endData", endData);
        Integer integer1 = 0;
        
        /* This test fails because method [org.jfree.data.category.DefaultIntervalCategoryDataset.setEndValue] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.jfree.data.category.DefaultIntervalCategoryDataset.setEndValue(DefaultIntervalCategoryDataset.java:558) */
        defaultIntervalCategoryDataset.setEndValue(0, integer1, null);
    }
    
    /**
    @utbot.classUnderTest {@link DefaultIntervalCategoryDataset}
 * @utbot.methodUnderTest {@link org.jfree.data.category.DefaultIntervalCategoryDataset#setEndValue(int,java.lang.Comparable,java.lang.Number)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: this.endData[series][categoryIndex] = value;
 *  */
    @Test
    public void testSetEndValue_ThrowNullPointerException() throws Exception  {
        DefaultIntervalCategoryDataset defaultIntervalCategoryDataset = ((DefaultIntervalCategoryDataset) createInstance("org.jfree.data.category.DefaultIntervalCategoryDataset"));
        java.lang.Comparable[] categoryKeys = new java.lang.Comparable[1];
        Integer integer = 0;
        categoryKeys[0] = ((Comparable) integer);
        defaultIntervalCategoryDataset.setCategoryKeys(categoryKeys);
        java.lang.Number[][] startData = {null};
        setField(defaultIntervalCategoryDataset, "org.jfree.data.category.DefaultIntervalCategoryDataset", "startData", startData);
        setField(defaultIntervalCategoryDataset, "org.jfree.data.category.DefaultIntervalCategoryDataset", "endData", startData);
        Integer integer1 = 0;
        
        /* This test fails because method [org.jfree.data.category.DefaultIntervalCategoryDataset.setEndValue] produces [java.lang.NullPointerException]
            org.jfree.data.category.DefaultIntervalCategoryDataset.setEndValue(DefaultIntervalCategoryDataset.java:558) */
        defaultIntervalCategoryDataset.setEndValue(0, integer1, null);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method setEndValue(int, java.lang.Comparable, java.lang.Number)
    
    @Test
    public void testSetEndValue1() throws Exception  {
        DefaultIntervalCategoryDataset defaultIntervalCategoryDataset = ((DefaultIntervalCategoryDataset) createInstance("org.jfree.data.category.DefaultIntervalCategoryDataset"));
        java.lang.Comparable[] categoryKeys = new java.lang.Comparable[9];
        Character character = '\u0000';
        categoryKeys[0] = ((Comparable) character);
        defaultIntervalCategoryDataset.setCategoryKeys(categoryKeys);
        java.lang.Number[][] startData = new java.lang.Number[33][];
        startData[0] = ((java.lang.Number[]) null);
        startData[1] = ((java.lang.Number[]) null);
        startData[2] = ((java.lang.Number[]) null);
        startData[3] = ((java.lang.Number[]) null);
        startData[4] = ((java.lang.Number[]) null);
        startData[5] = ((java.lang.Number[]) null);
        startData[6] = ((java.lang.Number[]) null);
        startData[7] = ((java.lang.Number[]) null);
        startData[8] = ((java.lang.Number[]) null);
        startData[9] = ((java.lang.Number[]) null);
        startData[10] = ((java.lang.Number[]) null);
        startData[11] = ((java.lang.Number[]) null);
        startData[12] = ((java.lang.Number[]) null);
        startData[13] = ((java.lang.Number[]) null);
        startData[14] = ((java.lang.Number[]) null);
        startData[15] = ((java.lang.Number[]) null);
        startData[16] = ((java.lang.Number[]) null);
        startData[17] = ((java.lang.Number[]) null);
        startData[18] = ((java.lang.Number[]) null);
        startData[19] = ((java.lang.Number[]) null);
        startData[20] = ((java.lang.Number[]) null);
        startData[21] = ((java.lang.Number[]) null);
        startData[22] = ((java.lang.Number[]) null);
        startData[23] = ((java.lang.Number[]) null);
        startData[24] = ((java.lang.Number[]) null);
        startData[25] = ((java.lang.Number[]) null);
        startData[26] = ((java.lang.Number[]) null);
        startData[27] = ((java.lang.Number[]) null);
        startData[28] = ((java.lang.Number[]) null);
        startData[29] = ((java.lang.Number[]) null);
        startData[30] = ((java.lang.Number[]) null);
        startData[31] = ((java.lang.Number[]) null);
        startData[32] = ((java.lang.Number[]) null);
        setField(defaultIntervalCategoryDataset, "org.jfree.data.category.DefaultIntervalCategoryDataset", "startData", startData);
        Character character1 = '\u0000';
        
        /* This test fails because method [org.jfree.data.category.DefaultIntervalCategoryDataset.setEndValue] produces [java.lang.NullPointerException]
            org.jfree.data.category.DefaultIntervalCategoryDataset.setEndValue(DefaultIntervalCategoryDataset.java:558) */
        defaultIntervalCategoryDataset.setEndValue(1, character1, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.data.category.DefaultIntervalCategoryDataset.setStartValue
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setStartValue(int, java.lang.Comparable, java.lang.Number)
    
    /**
    @utbot.classUnderTest {@link DefaultIntervalCategoryDataset}
 * @utbot.methodUnderTest {@link org.jfree.data.category.DefaultIntervalCategoryDataset#setStartValue(int,java.lang.Comparable,java.lang.Number)}
 *  */
    @Test
    public void testSetStartValue() throws Exception  {
        DefaultIntervalCategoryDataset defaultIntervalCategoryDataset = ((DefaultIntervalCategoryDataset) createInstance("org.jfree.data.category.DefaultIntervalCategoryDataset"));
        java.lang.Comparable[] categoryKeys = new java.lang.Comparable[1];
        Integer integer = 0;
        categoryKeys[0] = ((Comparable) integer);
        defaultIntervalCategoryDataset.setCategoryKeys(categoryKeys);
        java.lang.Number[][] startData = new java.lang.Number[1][];
        java.lang.Double[] doubleArray = {null};
        startData[0] = ((java.lang.Number[]) doubleArray);
        setField(defaultIntervalCategoryDataset, "org.jfree.data.category.DefaultIntervalCategoryDataset", "startData", startData);
        EventListenerList listenerList = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
        java.lang.Object[] listenerList1 = {null};
        setField(listenerList, "javax.swing.event.EventListenerList", "listenerList", listenerList1);
        setField(defaultIntervalCategoryDataset, "org.jfree.data.general.AbstractDataset", "listenerList", listenerList);
        Integer integer1 = 0;
        
        defaultIntervalCategoryDataset.setStartValue(0, integer1, null);
    }
    
    /**
    @utbot.classUnderTest {@link DefaultIntervalCategoryDataset}
 * @utbot.methodUnderTest {@link org.jfree.data.category.DefaultIntervalCategoryDataset#setStartValue(int,java.lang.Comparable,java.lang.Number)}
 *  */
    @Test
    public void testSetStartValue_1() throws Exception  {
        DefaultIntervalCategoryDataset defaultIntervalCategoryDataset = ((DefaultIntervalCategoryDataset) createInstance("org.jfree.data.category.DefaultIntervalCategoryDataset"));
        java.lang.Comparable[] categoryKeys = new java.lang.Comparable[1];
        Integer integer = 0;
        categoryKeys[0] = ((Comparable) integer);
        defaultIntervalCategoryDataset.setCategoryKeys(categoryKeys);
        java.lang.Number[][] startData = new java.lang.Number[1][];
        java.lang.Double[] doubleArray = {null};
        startData[0] = ((java.lang.Number[]) doubleArray);
        setField(defaultIntervalCategoryDataset, "org.jfree.data.category.DefaultIntervalCategoryDataset", "startData", startData);
        EventListenerList listenerList = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
        java.lang.Object[] listenerList1 = {null, null};
        setField(listenerList, "javax.swing.event.EventListenerList", "listenerList", listenerList1);
        setField(defaultIntervalCategoryDataset, "org.jfree.data.general.AbstractDataset", "listenerList", listenerList);
        Integer integer1 = 0;
        
        defaultIntervalCategoryDataset.setStartValue(0, integer1, null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method setStartValue(int, java.lang.Comparable, java.lang.Number)
    
    /**
    @utbot.classUnderTest {@link DefaultIntervalCategoryDataset}
 * @utbot.methodUnderTest {@link org.jfree.data.category.DefaultIntervalCategoryDataset#setStartValue(int,java.lang.Comparable,java.lang.Number)}
 * @utbot.executesCondition {@code (series < 0): True}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: (series < 0) || (series > getSeriesCount() - 1)
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testSetStartValue_ThrowIllegalArgumentException() throws Exception  {
        DefaultIntervalCategoryDataset defaultIntervalCategoryDataset = ((DefaultIntervalCategoryDataset) createInstance("org.jfree.data.category.DefaultIntervalCategoryDataset"));
        
        defaultIntervalCategoryDataset.setStartValue(-1, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link DefaultIntervalCategoryDataset}
 * @utbot.methodUnderTest {@link org.jfree.data.category.DefaultIntervalCategoryDataset#setStartValue(int,java.lang.Comparable,java.lang.Number)}
 * @utbot.executesCondition {@code (series < 0): False}
 * @utbot.executesCondition {@code (series > getSeriesCount() - 1): True}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: (series < 0) || (series > getSeriesCount() - 1)
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testSetStartValue_ThrowIllegalArgumentException_2() throws Exception  {
        DefaultIntervalCategoryDataset defaultIntervalCategoryDataset = ((DefaultIntervalCategoryDataset) createInstance("org.jfree.data.category.DefaultIntervalCategoryDataset"));
        java.lang.Number[][] startData = {};
        setField(defaultIntervalCategoryDataset, "org.jfree.data.category.DefaultIntervalCategoryDataset", "startData", startData);
        
        defaultIntervalCategoryDataset.setStartValue(0, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link DefaultIntervalCategoryDataset}
 * @utbot.methodUnderTest {@link org.jfree.data.category.DefaultIntervalCategoryDataset#setStartValue(int,java.lang.Comparable,java.lang.Number)}
 * @utbot.executesCondition {@code (series < 0): False}
 * @utbot.executesCondition {@code (series > getSeriesCount() - 1): True}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: (series < 0) || (series > getSeriesCount() - 1)
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testSetStartValue_ThrowIllegalArgumentException_1() throws Exception  {
        DefaultIntervalCategoryDataset defaultIntervalCategoryDataset = ((DefaultIntervalCategoryDataset) createInstance("org.jfree.data.category.DefaultIntervalCategoryDataset"));
        
        defaultIntervalCategoryDataset.setStartValue(0, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link DefaultIntervalCategoryDataset}
 * @utbot.methodUnderTest {@link org.jfree.data.category.DefaultIntervalCategoryDataset#setStartValue(int,java.lang.Comparable,java.lang.Number)}
 * @utbot.executesCondition {@code (series < 0): False}
 * @utbot.executesCondition {@code (series > getSeriesCount() - 1): False}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: categoryIndex < 0
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testSetStartValue_ThrowIllegalArgumentException_3() throws Exception  {
        DefaultIntervalCategoryDataset defaultIntervalCategoryDataset = ((DefaultIntervalCategoryDataset) createInstance("org.jfree.data.category.DefaultIntervalCategoryDataset"));
        java.lang.Comparable[] categoryKeys = {};
        defaultIntervalCategoryDataset.setCategoryKeys(categoryKeys);
        java.lang.Number[][] startData = {null};
        setField(defaultIntervalCategoryDataset, "org.jfree.data.category.DefaultIntervalCategoryDataset", "startData", startData);
        
        defaultIntervalCategoryDataset.setStartValue(0, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link DefaultIntervalCategoryDataset}
 * @utbot.methodUnderTest {@link org.jfree.data.category.DefaultIntervalCategoryDataset#setStartValue(int,java.lang.Comparable,java.lang.Number)}
 * @utbot.executesCondition {@code (series < 0): False}
 * @utbot.executesCondition {@code (series > getSeriesCount() - 1): False}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: categoryIndex < 0
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testSetStartValue_ThrowIllegalArgumentException_4() throws Exception  {
        DefaultIntervalCategoryDataset defaultIntervalCategoryDataset = ((DefaultIntervalCategoryDataset) createInstance("org.jfree.data.category.DefaultIntervalCategoryDataset"));
        java.lang.Comparable[] categoryKeys = {null};
        defaultIntervalCategoryDataset.setCategoryKeys(categoryKeys);
        java.lang.Number[][] startData = {null};
        setField(defaultIntervalCategoryDataset, "org.jfree.data.category.DefaultIntervalCategoryDataset", "startData", startData);
        Integer integer = 0;
        
        defaultIntervalCategoryDataset.setStartValue(0, integer, null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method setStartValue(int, java.lang.Comparable, java.lang.Number)
    
    /**
    @utbot.classUnderTest {@link DefaultIntervalCategoryDataset}
 * @utbot.methodUnderTest {@link org.jfree.data.category.DefaultIntervalCategoryDataset#setStartValue(int,java.lang.Comparable,java.lang.Number)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: this.startData[series][categoryIndex] = value;
 *  */
    @Test
    public void testSetStartValue_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        DefaultIntervalCategoryDataset defaultIntervalCategoryDataset = ((DefaultIntervalCategoryDataset) createInstance("org.jfree.data.category.DefaultIntervalCategoryDataset"));
        java.lang.Comparable[] categoryKeys = new java.lang.Comparable[1];
        Integer integer = 0;
        categoryKeys[0] = ((Comparable) integer);
        defaultIntervalCategoryDataset.setCategoryKeys(categoryKeys);
        java.lang.Number[][] startData = new java.lang.Number[1][];
        java.lang.Number[] numberArray = {};
        startData[0] = numberArray;
        setField(defaultIntervalCategoryDataset, "org.jfree.data.category.DefaultIntervalCategoryDataset", "startData", startData);
        Integer integer1 = 0;
        
        /* This test fails because method [org.jfree.data.category.DefaultIntervalCategoryDataset.setStartValue] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.jfree.data.category.DefaultIntervalCategoryDataset.setStartValue(DefaultIntervalCategoryDataset.java:525) */
        defaultIntervalCategoryDataset.setStartValue(0, integer1, null);
    }
    
    /**
    @utbot.classUnderTest {@link DefaultIntervalCategoryDataset}
 * @utbot.methodUnderTest {@link org.jfree.data.category.DefaultIntervalCategoryDataset#setStartValue(int,java.lang.Comparable,java.lang.Number)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: this.startData[series][categoryIndex] = value;
 *  */
    @Test
    public void testSetStartValue_ThrowNullPointerException() throws Exception  {
        DefaultIntervalCategoryDataset defaultIntervalCategoryDataset = ((DefaultIntervalCategoryDataset) createInstance("org.jfree.data.category.DefaultIntervalCategoryDataset"));
        java.lang.Comparable[] categoryKeys = new java.lang.Comparable[1];
        Integer integer = 0;
        categoryKeys[0] = ((Comparable) integer);
        defaultIntervalCategoryDataset.setCategoryKeys(categoryKeys);
        java.lang.Number[][] startData = {null};
        setField(defaultIntervalCategoryDataset, "org.jfree.data.category.DefaultIntervalCategoryDataset", "startData", startData);
        Integer integer1 = 0;
        
        /* This test fails because method [org.jfree.data.category.DefaultIntervalCategoryDataset.setStartValue] produces [java.lang.NullPointerException]
            org.jfree.data.category.DefaultIntervalCategoryDataset.setStartValue(DefaultIntervalCategoryDataset.java:525) */
        defaultIntervalCategoryDataset.setStartValue(0, integer1, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.data.category.DefaultIntervalCategoryDataset.getCategoryIndex
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getCategoryIndex(java.lang.Comparable)
    
    /**
    @utbot.classUnderTest {@link DefaultIntervalCategoryDataset}
 * @utbot.methodUnderTest {@link org.jfree.data.category.DefaultIntervalCategoryDataset#getCategoryIndex(java.lang.Comparable)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < this.categoryKeys.length; i++)} once
 * @utbot.returnsFrom {@code return result;}
 *  */
    @Test
    public void testGetCategoryIndex_IterateForLoop() throws Exception  {
        DefaultIntervalCategoryDataset defaultIntervalCategoryDataset = ((DefaultIntervalCategoryDataset) createInstance("org.jfree.data.category.DefaultIntervalCategoryDataset"));
        java.lang.Comparable[] categoryKeys = {};
        defaultIntervalCategoryDataset.setCategoryKeys(categoryKeys);
        
        int actual = defaultIntervalCategoryDataset.getCategoryIndex(null);
        
        assertEquals(-1, actual);
    }
    
    /**
    @utbot.classUnderTest {@link DefaultIntervalCategoryDataset}
 * @utbot.methodUnderTest {@link org.jfree.data.category.DefaultIntervalCategoryDataset#getCategoryIndex(java.lang.Comparable)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < this.categoryKeys.length; i++)} once
 * @utbot.returnsFrom {@code return result;}
 *  */
    @Test
    public void testGetCategoryIndex_CategoryEquals() throws Exception  {
        DefaultIntervalCategoryDataset defaultIntervalCategoryDataset = ((DefaultIntervalCategoryDataset) createInstance("org.jfree.data.category.DefaultIntervalCategoryDataset"));
        java.lang.Comparable[] categoryKeys = new java.lang.Comparable[1];
        Integer integer = 0;
        categoryKeys[0] = ((Comparable) integer);
        defaultIntervalCategoryDataset.setCategoryKeys(categoryKeys);
        Integer integer1 = 0;
        
        int actual = defaultIntervalCategoryDataset.getCategoryIndex(integer1);
        
        assertEquals(0, actual);
    }
    
    /**
    @utbot.classUnderTest {@link DefaultIntervalCategoryDataset}
 * @utbot.methodUnderTest {@link org.jfree.data.category.DefaultIntervalCategoryDataset#getCategoryIndex(java.lang.Comparable)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < this.categoryKeys.length; i++)} twice
 * @utbot.returnsFrom {@code return result;}
 *  */
    @Test
    public void testGetCategoryIndex_NotCategoryEquals() throws Exception  {
        DefaultIntervalCategoryDataset defaultIntervalCategoryDataset = ((DefaultIntervalCategoryDataset) createInstance("org.jfree.data.category.DefaultIntervalCategoryDataset"));
        java.lang.Comparable[] categoryKeys = {null};
        defaultIntervalCategoryDataset.setCategoryKeys(categoryKeys);
        Integer integer = 0;
        
        int actual = defaultIntervalCategoryDataset.getCategoryIndex(integer);
        
        assertEquals(-1, actual);
        
        java.lang.Comparable[] defaultIntervalCategoryDatasetCategoryKeys = ((java.lang.Comparable[]) getFieldValue(defaultIntervalCategoryDataset, "org.jfree.data.category.DefaultIntervalCategoryDataset", "categoryKeys"));
        Comparable finalDefaultIntervalCategoryDatasetCategoryKeys0 = ((Comparable) get(defaultIntervalCategoryDatasetCategoryKeys, 0));
        
        assertNull(finalDefaultIntervalCategoryDatasetCategoryKeys0);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getCategoryIndex(java.lang.Comparable)
    
    /**
    @utbot.classUnderTest {@link DefaultIntervalCategoryDataset}
 * @utbot.methodUnderTest {@link org.jfree.data.category.DefaultIntervalCategoryDataset#getCategoryIndex(java.lang.Comparable)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < this.categoryKeys.length; i++)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} when: category.equals(this.categoryKeys[i])
 *  */
    @Test
    public void testGetCategoryIndex_ThrowNullPointerException_1() throws Exception  {
        DefaultIntervalCategoryDataset defaultIntervalCategoryDataset = ((DefaultIntervalCategoryDataset) createInstance("org.jfree.data.category.DefaultIntervalCategoryDataset"));
        java.lang.Comparable[] categoryKeys = {null};
        defaultIntervalCategoryDataset.setCategoryKeys(categoryKeys);
        
        /* This test fails because method [org.jfree.data.category.DefaultIntervalCategoryDataset.getCategoryIndex] produces [java.lang.NullPointerException]
            org.jfree.data.category.DefaultIntervalCategoryDataset.getCategoryIndex(DefaultIntervalCategoryDataset.java:575) */
        defaultIntervalCategoryDataset.getCategoryIndex(null);
    }
    
    /**
    @utbot.classUnderTest {@link DefaultIntervalCategoryDataset}
 * @utbot.methodUnderTest {@link org.jfree.data.category.DefaultIntervalCategoryDataset#getCategoryIndex(java.lang.Comparable)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < this.categoryKeys.length; i++)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(int i = 0; i < this.categoryKeys.length; i++)
 *  */
    @Test
    public void testGetCategoryIndex_ThrowNullPointerException() throws Exception  {
        DefaultIntervalCategoryDataset defaultIntervalCategoryDataset = ((DefaultIntervalCategoryDataset) createInstance("org.jfree.data.category.DefaultIntervalCategoryDataset"));
        
        /* This test fails because method [org.jfree.data.category.DefaultIntervalCategoryDataset.getCategoryIndex] produces [java.lang.NullPointerException]
            org.jfree.data.category.DefaultIntervalCategoryDataset.getCategoryIndex(DefaultIntervalCategoryDataset.java:574) */
        defaultIntervalCategoryDataset.getCategoryIndex(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.data.category.DefaultIntervalCategoryDataset.getColumnKey
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getColumnKey(int)
    
    /**
    @utbot.classUnderTest {@link DefaultIntervalCategoryDataset}
 * @utbot.methodUnderTest {@link org.jfree.data.category.DefaultIntervalCategoryDataset#getColumnKey(int)}
 * @utbot.returnsFrom {@code return this.categoryKeys[column];}
 *  */
    @Test
    public void testGetColumnKey_ReturnColumnOfThisCategoryKeys() throws Exception  {
        DefaultIntervalCategoryDataset defaultIntervalCategoryDataset = ((DefaultIntervalCategoryDataset) createInstance("org.jfree.data.category.DefaultIntervalCategoryDataset"));
        java.lang.Comparable[] categoryKeys = {null, null};
        defaultIntervalCategoryDataset.setCategoryKeys(categoryKeys);
        
        Comparable actual = defaultIntervalCategoryDataset.getColumnKey(1);
        
        assertNull(actual);
        
        java.lang.Comparable[] defaultIntervalCategoryDatasetCategoryKeys = ((java.lang.Comparable[]) getFieldValue(defaultIntervalCategoryDataset, "org.jfree.data.category.DefaultIntervalCategoryDataset", "categoryKeys"));
        Comparable finalDefaultIntervalCategoryDatasetCategoryKeys0 = ((Comparable) get(defaultIntervalCategoryDatasetCategoryKeys, 0));
        java.lang.Comparable[] defaultIntervalCategoryDatasetCategoryKeys1 = ((java.lang.Comparable[]) getFieldValue(defaultIntervalCategoryDataset, "org.jfree.data.category.DefaultIntervalCategoryDataset", "categoryKeys"));
        Comparable finalDefaultIntervalCategoryDatasetCategoryKeys1 = ((Comparable) get(defaultIntervalCategoryDatasetCategoryKeys1, 1));
        
        assertNull(finalDefaultIntervalCategoryDatasetCategoryKeys0);
        
        assertNull(finalDefaultIntervalCategoryDatasetCategoryKeys1);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getColumnKey(int)
    
    /**
    @utbot.classUnderTest {@link DefaultIntervalCategoryDataset}
 * @utbot.methodUnderTest {@link org.jfree.data.category.DefaultIntervalCategoryDataset#getColumnKey(int)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return this.categoryKeys[column];
 *  */
    @Test
    public void testGetColumnKey_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        DefaultIntervalCategoryDataset defaultIntervalCategoryDataset = ((DefaultIntervalCategoryDataset) createInstance("org.jfree.data.category.DefaultIntervalCategoryDataset"));
        java.lang.Comparable[] categoryKeys = {};
        defaultIntervalCategoryDataset.setCategoryKeys(categoryKeys);
        
        /* This test fails because method [org.jfree.data.category.DefaultIntervalCategoryDataset.getColumnKey] produces [java.lang.ArrayIndexOutOfBoundsException: Index -256 out of bounds for length 0]
            org.jfree.data.category.DefaultIntervalCategoryDataset.getColumnKey(DefaultIntervalCategoryDataset.java:612) */
        defaultIntervalCategoryDataset.getColumnKey(-256);
    }
    
    /**
    @utbot.classUnderTest {@link DefaultIntervalCategoryDataset}
 * @utbot.methodUnderTest {@link org.jfree.data.category.DefaultIntervalCategoryDataset#getColumnKey(int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return this.categoryKeys[column];
 *  */
    @Test
    public void testGetColumnKey_ThrowNullPointerException() throws Exception  {
        DefaultIntervalCategoryDataset defaultIntervalCategoryDataset = ((DefaultIntervalCategoryDataset) createInstance("org.jfree.data.category.DefaultIntervalCategoryDataset"));
        
        /* This test fails because method [org.jfree.data.category.DefaultIntervalCategoryDataset.getColumnKey] produces [java.lang.NullPointerException]
            org.jfree.data.category.DefaultIntervalCategoryDataset.getColumnKey(DefaultIntervalCategoryDataset.java:612) */
        defaultIntervalCategoryDataset.getColumnKey(-255);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.data.category.DefaultIntervalCategoryDataset.getColumnIndex
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getColumnIndex(java.lang.Comparable)
    
    /**
    @utbot.classUnderTest {@link DefaultIntervalCategoryDataset}
 * @utbot.methodUnderTest {@link org.jfree.data.category.DefaultIntervalCategoryDataset#getColumnIndex(java.lang.Comparable)}
 * @utbot.returnsFrom {@code return getCategoryIndex(columnKey);}
 *  */
    @Test
    public void testGetColumnIndex_ReturnGetCategoryIndex() throws Exception  {
        DefaultIntervalCategoryDataset defaultIntervalCategoryDataset = ((DefaultIntervalCategoryDataset) createInstance("org.jfree.data.category.DefaultIntervalCategoryDataset"));
        java.lang.Comparable[] categoryKeys = {};
        defaultIntervalCategoryDataset.setCategoryKeys(categoryKeys);
        Integer integer = 0;
        
        int actual = defaultIntervalCategoryDataset.getColumnIndex(integer);
        
        assertEquals(-1, actual);
    }
    
    /**
    @utbot.classUnderTest {@link DefaultIntervalCategoryDataset}
 * @utbot.methodUnderTest {@link org.jfree.data.category.DefaultIntervalCategoryDataset#getColumnIndex(java.lang.Comparable)}
 * @utbot.returnsFrom {@code return getCategoryIndex(columnKey);}
 *  */
    @Test
    public void testGetColumnIndex_ReturnGetCategoryIndex_1() throws Exception  {
        DefaultIntervalCategoryDataset defaultIntervalCategoryDataset = ((DefaultIntervalCategoryDataset) createInstance("org.jfree.data.category.DefaultIntervalCategoryDataset"));
        java.lang.Comparable[] categoryKeys = new java.lang.Comparable[1];
        Integer integer = 0;
        categoryKeys[0] = ((Comparable) integer);
        defaultIntervalCategoryDataset.setCategoryKeys(categoryKeys);
        Integer integer1 = 0;
        
        int actual = defaultIntervalCategoryDataset.getColumnIndex(integer1);
        
        assertEquals(0, actual);
    }
    
    /**
    @utbot.classUnderTest {@link DefaultIntervalCategoryDataset}
 * @utbot.methodUnderTest {@link org.jfree.data.category.DefaultIntervalCategoryDataset#getColumnIndex(java.lang.Comparable)}
 * @utbot.returnsFrom {@code return getCategoryIndex(columnKey);}
 *  */
    @Test
    public void testGetColumnIndex_ReturnGetCategoryIndex_2() throws Exception  {
        DefaultIntervalCategoryDataset defaultIntervalCategoryDataset = ((DefaultIntervalCategoryDataset) createInstance("org.jfree.data.category.DefaultIntervalCategoryDataset"));
        java.lang.Comparable[] categoryKeys = {null};
        defaultIntervalCategoryDataset.setCategoryKeys(categoryKeys);
        Integer integer = 0;
        
        int actual = defaultIntervalCategoryDataset.getColumnIndex(integer);
        
        assertEquals(-1, actual);
        
        java.lang.Comparable[] defaultIntervalCategoryDatasetCategoryKeys = ((java.lang.Comparable[]) getFieldValue(defaultIntervalCategoryDataset, "org.jfree.data.category.DefaultIntervalCategoryDataset", "categoryKeys"));
        Comparable finalDefaultIntervalCategoryDatasetCategoryKeys0 = ((Comparable) get(defaultIntervalCategoryDatasetCategoryKeys, 0));
        
        assertNull(finalDefaultIntervalCategoryDatasetCategoryKeys0);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method getColumnIndex(java.lang.Comparable)
    
    /**
    @utbot.classUnderTest {@link DefaultIntervalCategoryDataset}
 * @utbot.methodUnderTest {@link org.jfree.data.category.DefaultIntervalCategoryDataset#getColumnIndex(java.lang.Comparable)}
 * @utbot.executesCondition {@code (columnKey == null): True}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: columnKey == null
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testGetColumnIndex_ThrowIllegalArgumentException() throws Exception  {
        DefaultIntervalCategoryDataset defaultIntervalCategoryDataset = ((DefaultIntervalCategoryDataset) createInstance("org.jfree.data.category.DefaultIntervalCategoryDataset"));
        
        defaultIntervalCategoryDataset.getColumnIndex(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.data.category.DefaultIntervalCategoryDataset.generateKeys
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method generateKeys(int, java.lang.String)
    
    /**
    @utbot.classUnderTest {@link DefaultIntervalCategoryDataset}
 * @utbot.methodUnderTest {@link org.jfree.data.category.DefaultIntervalCategoryDataset#generateKeys(int,java.lang.String)}
 * @utbot.returnsFrom {@code return result;}
 *  */
    @Test
    public void testGenerateKeys_ReturnResult() throws Exception  {
        DefaultIntervalCategoryDataset defaultIntervalCategoryDataset = ((DefaultIntervalCategoryDataset) createInstance("org.jfree.data.category.DefaultIntervalCategoryDataset"));
        
        Class defaultIntervalCategoryDatasetClazz = Class.forName("org.jfree.data.category.DefaultIntervalCategoryDataset");
        Class intType = int.class;
        Class stringType = Class.forName("java.lang.String");
        Method generateKeysMethod = defaultIntervalCategoryDatasetClazz.getDeclaredMethod("generateKeys", intType, stringType);
        generateKeysMethod.setAccessible(true);
        java.lang.Object[] generateKeysMethodArguments = new java.lang.Object[2];
        generateKeysMethodArguments[0] = 0;
        generateKeysMethodArguments[1] = ((Object) null);
        java.lang.Comparable[] actual = ((java.lang.Comparable[]) generateKeysMethod.invoke(defaultIntervalCategoryDataset, generateKeysMethodArguments));
        
        java.lang.Comparable[] expected = {};
        
        int expectedSize = expected.length;
        assertEquals(expectedSize, actual.length);
        assertTrue(deepEquals(expected, actual));
    }
    
    /**
    @utbot.classUnderTest {@link DefaultIntervalCategoryDataset}
 * @utbot.methodUnderTest {@link org.jfree.data.category.DefaultIntervalCategoryDataset#generateKeys(int,java.lang.String)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < count; i++)} once
 * @utbot.returnsFrom {@code return result;}
 *  */
    @Test
    public void testGenerateKeys_StringBuilderToString() throws Exception  {
        DefaultIntervalCategoryDataset defaultIntervalCategoryDataset = ((DefaultIntervalCategoryDataset) createInstance("org.jfree.data.category.DefaultIntervalCategoryDataset"));
        
        Class defaultIntervalCategoryDatasetClazz = Class.forName("org.jfree.data.category.DefaultIntervalCategoryDataset");
        Class intType = int.class;
        Class stringType = Class.forName("java.lang.String");
        Method generateKeysMethod = defaultIntervalCategoryDatasetClazz.getDeclaredMethod("generateKeys", intType, stringType);
        generateKeysMethod.setAccessible(true);
        java.lang.Object[] generateKeysMethodArguments = new java.lang.Object[2];
        generateKeysMethodArguments[0] = 1;
        generateKeysMethodArguments[1] = ((Object) null);
        java.lang.Comparable[] actual = ((java.lang.Comparable[]) generateKeysMethod.invoke(defaultIntervalCategoryDataset, generateKeysMethodArguments));
        
        java.lang.Comparable[] expected = new java.lang.Comparable[1];
        String string = "null1";
        expected[0] = ((Comparable) string);
        
        int expectedSize = expected.length;
        assertEquals(expectedSize, actual.length);
        assertTrue(deepEquals(expected, actual));
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method generateKeys(int, java.lang.String)
    
    /**
    @utbot.classUnderTest {@link DefaultIntervalCategoryDataset}
 * @utbot.methodUnderTest {@link org.jfree.data.category.DefaultIntervalCategoryDataset#generateKeys(int,java.lang.String)}
 * @utbot.throwsException {@link java.lang.NegativeArraySizeException} in: Comparable[] result = new Comparable[count];
 *  */
    @Test
    public void testGenerateKeys_ThrowNegativeArraySizeException() throws Throwable  {
        DefaultIntervalCategoryDataset defaultIntervalCategoryDataset = ((DefaultIntervalCategoryDataset) createInstance("org.jfree.data.category.DefaultIntervalCategoryDataset"));
        
        /* This test fails because method [org.jfree.data.category.DefaultIntervalCategoryDataset.generateKeys] produces [java.lang.NegativeArraySizeException: -256]
            org.jfree.data.category.DefaultIntervalCategoryDataset.generateKeys(DefaultIntervalCategoryDataset.java:593) */
        Class defaultIntervalCategoryDatasetClazz = Class.forName("org.jfree.data.category.DefaultIntervalCategoryDataset");
        Class intType = int.class;
        Class stringType = Class.forName("java.lang.String");
        Method generateKeysMethod = defaultIntervalCategoryDatasetClazz.getDeclaredMethod("generateKeys", intType, stringType);
        generateKeysMethod.setAccessible(true);
        java.lang.Object[] generateKeysMethodArguments = new java.lang.Object[2];
        generateKeysMethodArguments[0] = -256;
        generateKeysMethodArguments[1] = ((Object) null);
        try {
            generateKeysMethod.invoke(defaultIntervalCategoryDataset, generateKeysMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.data.category.DefaultIntervalCategoryDataset.getRowIndex
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getRowIndex(java.lang.Comparable)
    
    /**
    @utbot.classUnderTest {@link DefaultIntervalCategoryDataset}
 * @utbot.methodUnderTest {@link org.jfree.data.category.DefaultIntervalCategoryDataset#getRowIndex(java.lang.Comparable)}
 * @utbot.returnsFrom {@code return getSeriesIndex(rowKey);}
 *  */
    @Test
    public void testGetRowIndex_ReturnGetSeriesIndex() throws Exception  {
        DefaultIntervalCategoryDataset defaultIntervalCategoryDataset = ((DefaultIntervalCategoryDataset) createInstance("org.jfree.data.category.DefaultIntervalCategoryDataset"));
        java.lang.Comparable[] seriesKeys = new java.lang.Comparable[1];
        Integer integer = 0;
        seriesKeys[0] = ((Comparable) integer);
        defaultIntervalCategoryDataset.setSeriesKeys(seriesKeys);
        Integer integer1 = 0;
        
        int actual = defaultIntervalCategoryDataset.getRowIndex(integer1);
        
        assertEquals(0, actual);
    }
    
    /**
    @utbot.classUnderTest {@link DefaultIntervalCategoryDataset}
 * @utbot.methodUnderTest {@link org.jfree.data.category.DefaultIntervalCategoryDataset#getRowIndex(java.lang.Comparable)}
 * @utbot.returnsFrom {@code return getSeriesIndex(rowKey);}
 *  */
    @Test
    public void testGetRowIndex_ReturnGetSeriesIndex_1() throws Exception  {
        DefaultIntervalCategoryDataset defaultIntervalCategoryDataset = ((DefaultIntervalCategoryDataset) createInstance("org.jfree.data.category.DefaultIntervalCategoryDataset"));
        java.lang.Comparable[] seriesKeys = {};
        defaultIntervalCategoryDataset.setSeriesKeys(seriesKeys);
        
        int actual = defaultIntervalCategoryDataset.getRowIndex(null);
        
        assertEquals(-1, actual);
    }
    
    /**
    @utbot.classUnderTest {@link DefaultIntervalCategoryDataset}
 * @utbot.methodUnderTest {@link org.jfree.data.category.DefaultIntervalCategoryDataset#getRowIndex(java.lang.Comparable)}
 * @utbot.returnsFrom {@code return getSeriesIndex(rowKey);}
 *  */
    @Test
    public void testGetRowIndex_ReturnGetSeriesIndex_2() throws Exception  {
        DefaultIntervalCategoryDataset defaultIntervalCategoryDataset = ((DefaultIntervalCategoryDataset) createInstance("org.jfree.data.category.DefaultIntervalCategoryDataset"));
        java.lang.Comparable[] seriesKeys = {null};
        defaultIntervalCategoryDataset.setSeriesKeys(seriesKeys);
        Integer integer = 0;
        
        int actual = defaultIntervalCategoryDataset.getRowIndex(integer);
        
        assertEquals(-1, actual);
        
        java.lang.Comparable[] defaultIntervalCategoryDatasetSeriesKeys = ((java.lang.Comparable[]) getFieldValue(defaultIntervalCategoryDataset, "org.jfree.data.category.DefaultIntervalCategoryDataset", "seriesKeys"));
        Comparable finalDefaultIntervalCategoryDatasetSeriesKeys0 = ((Comparable) get(defaultIntervalCategoryDatasetSeriesKeys, 0));
        
        assertNull(finalDefaultIntervalCategoryDatasetSeriesKeys0);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.data.category.DefaultIntervalCategoryDataset.getColumnKeys
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getColumnKeys()
    
    /**
    @utbot.classUnderTest {@link DefaultIntervalCategoryDataset}
 * @utbot.methodUnderTest {@link org.jfree.data.category.DefaultIntervalCategoryDataset#getColumnKeys()}
 * @utbot.executesCondition {@code (this.categoryKeys == null): True}
 * @utbot.returnsFrom {@code return new ArrayList();}
 *  */
    @Test
    public void testGetColumnKeys_ThisCategoryKeysEqualsNull() throws Exception  {
        DefaultIntervalCategoryDataset defaultIntervalCategoryDataset = ((DefaultIntervalCategoryDataset) createInstance("org.jfree.data.category.DefaultIntervalCategoryDataset"));
        
        ArrayList actual = ((ArrayList) defaultIntervalCategoryDataset.getColumnKeys());
        
        ArrayList expected = new ArrayList();
        
        assertTrue(deepEquals(expected, actual));
    }
    
    /**
    @utbot.classUnderTest {@link DefaultIntervalCategoryDataset}
 * @utbot.methodUnderTest {@link org.jfree.data.category.DefaultIntervalCategoryDataset#getColumnKeys()}
 * @utbot.executesCondition {@code (this.categoryKeys == null): False}
 * @utbot.invokes {@link java.util.Arrays#asList(java.lang.Object[])}
 * @utbot.invokes {@link java.util.Collections#unmodifiableList(java.util.List)}
 * @utbot.returnsFrom {@code return Collections.unmodifiableList(Arrays.asList(this.categoryKeys));}
 *  */
    @Test
    public void testGetColumnKeys_ThisCategoryKeysNotEqualsNull() throws Exception  {
        DefaultIntervalCategoryDataset defaultIntervalCategoryDataset = ((DefaultIntervalCategoryDataset) createInstance("org.jfree.data.category.DefaultIntervalCategoryDataset"));
        java.lang.Comparable[] categoryKeys = {null};
        defaultIntervalCategoryDataset.setCategoryKeys(categoryKeys);
        
        List actual = defaultIntervalCategoryDataset.getColumnKeys();
        
        List expected = new ArrayList();
        expected.add(null);
        
        assertTrue(deepEquals(expected, actual));
        
        java.lang.Comparable[] defaultIntervalCategoryDatasetCategoryKeys = ((java.lang.Comparable[]) getFieldValue(defaultIntervalCategoryDataset, "org.jfree.data.category.DefaultIntervalCategoryDataset", "categoryKeys"));
        Comparable finalDefaultIntervalCategoryDatasetCategoryKeys0 = ((Comparable) get(defaultIntervalCategoryDatasetCategoryKeys, 0));
        
        assertNull(finalDefaultIntervalCategoryDatasetCategoryKeys0);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.data.category.DefaultIntervalCategoryDataset.getRowCount
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getRowCount()
    
    /**
    @utbot.classUnderTest {@link DefaultIntervalCategoryDataset}
 * @utbot.methodUnderTest {@link org.jfree.data.category.DefaultIntervalCategoryDataset#getRowCount()}
 * @utbot.returnsFrom {@code return this.seriesKeys.length;}
 *  */
    @Test
    public void testGetRowCount_ReturnThisSeriesKeysLength() throws Exception  {
        DefaultIntervalCategoryDataset defaultIntervalCategoryDataset = ((DefaultIntervalCategoryDataset) createInstance("org.jfree.data.category.DefaultIntervalCategoryDataset"));
        java.lang.Comparable[] seriesKeys = {null, null};
        defaultIntervalCategoryDataset.setSeriesKeys(seriesKeys);
        
        int actual = defaultIntervalCategoryDataset.getRowCount();
        
        assertEquals(2, actual);
        
        java.lang.Comparable[] defaultIntervalCategoryDatasetSeriesKeys = ((java.lang.Comparable[]) getFieldValue(defaultIntervalCategoryDataset, "org.jfree.data.category.DefaultIntervalCategoryDataset", "seriesKeys"));
        Comparable finalDefaultIntervalCategoryDatasetSeriesKeys0 = ((Comparable) get(defaultIntervalCategoryDatasetSeriesKeys, 0));
        java.lang.Comparable[] defaultIntervalCategoryDatasetSeriesKeys1 = ((java.lang.Comparable[]) getFieldValue(defaultIntervalCategoryDataset, "org.jfree.data.category.DefaultIntervalCategoryDataset", "seriesKeys"));
        Comparable finalDefaultIntervalCategoryDatasetSeriesKeys1 = ((Comparable) get(defaultIntervalCategoryDatasetSeriesKeys1, 1));
        
        assertNull(finalDefaultIntervalCategoryDatasetSeriesKeys0);
        
        assertNull(finalDefaultIntervalCategoryDatasetSeriesKeys1);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getRowCount()
    
    /**
    @utbot.classUnderTest {@link DefaultIntervalCategoryDataset}
 * @utbot.methodUnderTest {@link org.jfree.data.category.DefaultIntervalCategoryDataset#getRowCount()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return this.seriesKeys.length;
 *  */
    @Test
    public void testGetRowCount_ThrowNullPointerException() throws Exception  {
        DefaultIntervalCategoryDataset defaultIntervalCategoryDataset = ((DefaultIntervalCategoryDataset) createInstance("org.jfree.data.category.DefaultIntervalCategoryDataset"));
        
        /* This test fails because method [org.jfree.data.category.DefaultIntervalCategoryDataset.getRowCount] produces [java.lang.NullPointerException]
            org.jfree.data.category.DefaultIntervalCategoryDataset.getRowCount(DefaultIntervalCategoryDataset.java:702) */
        defaultIntervalCategoryDataset.getRowCount();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.data.category.DefaultIntervalCategoryDataset.setCategoryKeys
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setCategoryKeys([Ljava.lang.Comparable;)
    
    /**
    @utbot.classUnderTest {@link DefaultIntervalCategoryDataset}
 * @utbot.methodUnderTest {@link org.jfree.data.category.DefaultIntervalCategoryDataset#setCategoryKeys(java.lang.Comparable[])}
 *  */
    @Test
    public void testSetCategoryKeys() throws Exception  {
        DefaultIntervalCategoryDataset defaultIntervalCategoryDataset = ((DefaultIntervalCategoryDataset) createInstance("org.jfree.data.category.DefaultIntervalCategoryDataset"));
        java.lang.Comparable[] categoryKeys = {null};
        defaultIntervalCategoryDataset.setCategoryKeys(categoryKeys);
        java.lang.Number[][] startData = new java.lang.Number[1][];
        java.util.concurrent.atomic.AtomicInteger[] atomicIntegerArray = {};
        startData[0] = ((java.lang.Number[]) atomicIntegerArray);
        setField(defaultIntervalCategoryDataset, "org.jfree.data.category.DefaultIntervalCategoryDataset", "startData", startData);
        EventListenerList listenerList = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
        java.lang.Object[] listenerList1 = {null};
        setField(listenerList, "javax.swing.event.EventListenerList", "listenerList", listenerList1);
        setField(defaultIntervalCategoryDataset, "org.jfree.data.general.AbstractDataset", "listenerList", listenerList);
        java.lang.Comparable[] comparableArray = {};
        
        java.lang.Comparable[] initialDefaultIntervalCategoryDatasetCategoryKeys = ((java.lang.Comparable[]) getFieldValue(defaultIntervalCategoryDataset, "org.jfree.data.category.DefaultIntervalCategoryDataset", "categoryKeys"));
        
        defaultIntervalCategoryDataset.setCategoryKeys(comparableArray);
        
        java.lang.Comparable[] finalDefaultIntervalCategoryDatasetCategoryKeys = ((java.lang.Comparable[]) getFieldValue(defaultIntervalCategoryDataset, "org.jfree.data.category.DefaultIntervalCategoryDataset", "categoryKeys"));
        
        assertFalse(initialDefaultIntervalCategoryDatasetCategoryKeys == finalDefaultIntervalCategoryDatasetCategoryKeys);
    }
    
    /**
    @utbot.classUnderTest {@link DefaultIntervalCategoryDataset}
 * @utbot.methodUnderTest {@link org.jfree.data.category.DefaultIntervalCategoryDataset#setCategoryKeys(java.lang.Comparable[])}
 *  */
    @Test
    public void testSetCategoryKeys_1() throws Exception  {
        DefaultIntervalCategoryDataset defaultIntervalCategoryDataset = ((DefaultIntervalCategoryDataset) createInstance("org.jfree.data.category.DefaultIntervalCategoryDataset"));
        java.lang.Comparable[] categoryKeys = {null};
        defaultIntervalCategoryDataset.setCategoryKeys(categoryKeys);
        java.lang.Number[][] startData = new java.lang.Number[1][];
        java.util.concurrent.atomic.AtomicInteger[] atomicIntegerArray = {};
        startData[0] = ((java.lang.Number[]) atomicIntegerArray);
        setField(defaultIntervalCategoryDataset, "org.jfree.data.category.DefaultIntervalCategoryDataset", "startData", startData);
        EventListenerList listenerList = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
        java.lang.Object[] listenerList1 = {null, null};
        setField(listenerList, "javax.swing.event.EventListenerList", "listenerList", listenerList1);
        setField(defaultIntervalCategoryDataset, "org.jfree.data.general.AbstractDataset", "listenerList", listenerList);
        java.lang.Comparable[] comparableArray = {};
        
        java.lang.Comparable[] initialDefaultIntervalCategoryDatasetCategoryKeys = ((java.lang.Comparable[]) getFieldValue(defaultIntervalCategoryDataset, "org.jfree.data.category.DefaultIntervalCategoryDataset", "categoryKeys"));
        
        defaultIntervalCategoryDataset.setCategoryKeys(comparableArray);
        
        java.lang.Comparable[] finalDefaultIntervalCategoryDatasetCategoryKeys = ((java.lang.Comparable[]) getFieldValue(defaultIntervalCategoryDataset, "org.jfree.data.category.DefaultIntervalCategoryDataset", "categoryKeys"));
        
        assertFalse(initialDefaultIntervalCategoryDatasetCategoryKeys == finalDefaultIntervalCategoryDatasetCategoryKeys);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method setCategoryKeys([Ljava.lang.Comparable;)
    
    /**
    @utbot.classUnderTest {@link DefaultIntervalCategoryDataset}
 * @utbot.methodUnderTest {@link org.jfree.data.category.DefaultIntervalCategoryDataset#setCategoryKeys(java.lang.Comparable[])}
 * @utbot.executesCondition {@code (categoryKeys == null): True}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: categoryKeys == null
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testSetCategoryKeys_ThrowIllegalArgumentException() throws Exception  {
        DefaultIntervalCategoryDataset defaultIntervalCategoryDataset = ((DefaultIntervalCategoryDataset) createInstance("org.jfree.data.category.DefaultIntervalCategoryDataset"));
        
        defaultIntervalCategoryDataset.setCategoryKeys(null);
    }
    
    /**
    @utbot.classUnderTest {@link DefaultIntervalCategoryDataset}
 * @utbot.methodUnderTest {@link org.jfree.data.category.DefaultIntervalCategoryDataset#setCategoryKeys(java.lang.Comparable[])}
 * @utbot.executesCondition {@code (categoryKeys == null): False}
 * @utbot.executesCondition {@code (categoryKeys.length != this.startData[0].length): True}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: categoryKeys.length != this.startData[0].length
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testSetCategoryKeys_ThrowIllegalArgumentException_1() throws Exception  {
        DefaultIntervalCategoryDataset defaultIntervalCategoryDataset = ((DefaultIntervalCategoryDataset) createInstance("org.jfree.data.category.DefaultIntervalCategoryDataset"));
        java.lang.Number[][] startData = new java.lang.Number[1][];
        java.lang.Float[] floatArray = {null};
        startData[0] = ((java.lang.Number[]) floatArray);
        setField(defaultIntervalCategoryDataset, "org.jfree.data.category.DefaultIntervalCategoryDataset", "startData", startData);
        java.lang.Comparable[] comparableArray = {null, null};
        
        defaultIntervalCategoryDataset.setCategoryKeys(comparableArray);
    }
    
    /**
    @utbot.classUnderTest {@link DefaultIntervalCategoryDataset}
 * @utbot.methodUnderTest {@link org.jfree.data.category.DefaultIntervalCategoryDataset#setCategoryKeys(java.lang.Comparable[])}
 * @utbot.executesCondition {@code (categoryKeys == null): False}
 * @utbot.executesCondition {@code (categoryKeys.length != this.startData[0].length): False}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < categoryKeys.length; i++)} once
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: categoryKeys[i] == null
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testSetCategoryKeys_ThrowIllegalArgumentException_2() throws Exception  {
        DefaultIntervalCategoryDataset defaultIntervalCategoryDataset = ((DefaultIntervalCategoryDataset) createInstance("org.jfree.data.category.DefaultIntervalCategoryDataset"));
        java.lang.Number[][] startData = new java.lang.Number[1][];
        java.util.concurrent.atomic.AtomicInteger[] atomicIntegerArray = {null};
        startData[0] = ((java.lang.Number[]) atomicIntegerArray);
        setField(defaultIntervalCategoryDataset, "org.jfree.data.category.DefaultIntervalCategoryDataset", "startData", startData);
        java.lang.Comparable[] comparableArray = {null};
        
        defaultIntervalCategoryDataset.setCategoryKeys(comparableArray);
    }
    
    /**
    @utbot.classUnderTest {@link DefaultIntervalCategoryDataset}
 * @utbot.methodUnderTest {@link org.jfree.data.category.DefaultIntervalCategoryDataset#setCategoryKeys(java.lang.Comparable[])}
 * @utbot.executesCondition {@code (categoryKeys == null): False}
 * @utbot.executesCondition {@code (categoryKeys.length != this.startData[0].length): False}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < categoryKeys.length; i++)} twice
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: categoryKeys[i] == null
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testSetCategoryKeys_ThrowIllegalArgumentException_3() throws Exception  {
        DefaultIntervalCategoryDataset defaultIntervalCategoryDataset = ((DefaultIntervalCategoryDataset) createInstance("org.jfree.data.category.DefaultIntervalCategoryDataset"));
        java.lang.Number[][] startData = new java.lang.Number[1][];
        java.util.concurrent.atomic.AtomicInteger[] atomicIntegerArray = {null, null};
        startData[0] = ((java.lang.Number[]) atomicIntegerArray);
        setField(defaultIntervalCategoryDataset, "org.jfree.data.category.DefaultIntervalCategoryDataset", "startData", startData);
        java.lang.Comparable[] comparableArray = new java.lang.Comparable[2];
        Integer integer = 0;
        comparableArray[0] = ((Comparable) integer);
        
        defaultIntervalCategoryDataset.setCategoryKeys(comparableArray);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method setCategoryKeys([Ljava.lang.Comparable;)
    
    /**
    @utbot.classUnderTest {@link DefaultIntervalCategoryDataset}
 * @utbot.methodUnderTest {@link org.jfree.data.category.DefaultIntervalCategoryDataset#setCategoryKeys(java.lang.Comparable[])}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} when: categoryKeys.length != this.startData[0].length
 *  */
    @Test
    public void testSetCategoryKeys_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        DefaultIntervalCategoryDataset defaultIntervalCategoryDataset = ((DefaultIntervalCategoryDataset) createInstance("org.jfree.data.category.DefaultIntervalCategoryDataset"));
        java.lang.Number[][] startData = {};
        setField(defaultIntervalCategoryDataset, "org.jfree.data.category.DefaultIntervalCategoryDataset", "startData", startData);
        java.lang.Comparable[] comparableArray = {null};
        
        /* This test fails because method [org.jfree.data.category.DefaultIntervalCategoryDataset.setCategoryKeys] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.jfree.data.category.DefaultIntervalCategoryDataset.setCategoryKeys(DefaultIntervalCategoryDataset.java:338) */
        defaultIntervalCategoryDataset.setCategoryKeys(comparableArray);
    }
    
    /**
    @utbot.classUnderTest {@link DefaultIntervalCategoryDataset}
 * @utbot.methodUnderTest {@link org.jfree.data.category.DefaultIntervalCategoryDataset#setCategoryKeys(java.lang.Comparable[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: categoryKeys.length != this.startData[0].length
 *  */
    @Test
    public void testSetCategoryKeys_ThrowNullPointerException_1() throws Exception  {
        DefaultIntervalCategoryDataset defaultIntervalCategoryDataset = ((DefaultIntervalCategoryDataset) createInstance("org.jfree.data.category.DefaultIntervalCategoryDataset"));
        java.lang.Number[][] startData = {null};
        setField(defaultIntervalCategoryDataset, "org.jfree.data.category.DefaultIntervalCategoryDataset", "startData", startData);
        java.lang.Comparable[] comparableArray = {null};
        
        /* This test fails because method [org.jfree.data.category.DefaultIntervalCategoryDataset.setCategoryKeys] produces [java.lang.NullPointerException]
            org.jfree.data.category.DefaultIntervalCategoryDataset.setCategoryKeys(DefaultIntervalCategoryDataset.java:338) */
        defaultIntervalCategoryDataset.setCategoryKeys(comparableArray);
    }
    
    /**
    @utbot.classUnderTest {@link DefaultIntervalCategoryDataset}
 * @utbot.methodUnderTest {@link org.jfree.data.category.DefaultIntervalCategoryDataset#setCategoryKeys(java.lang.Comparable[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: categoryKeys.length != this.startData[0].length
 *  */
    @Test
    public void testSetCategoryKeys_ThrowNullPointerException() throws Exception  {
        DefaultIntervalCategoryDataset defaultIntervalCategoryDataset = ((DefaultIntervalCategoryDataset) createInstance("org.jfree.data.category.DefaultIntervalCategoryDataset"));
        java.lang.Comparable[] comparableArray = {null};
        
        /* This test fails because method [org.jfree.data.category.DefaultIntervalCategoryDataset.setCategoryKeys] produces [java.lang.NullPointerException]
            org.jfree.data.category.DefaultIntervalCategoryDataset.setCategoryKeys(DefaultIntervalCategoryDataset.java:338) */
        defaultIntervalCategoryDataset.setCategoryKeys(comparableArray);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.data.category.DefaultIntervalCategoryDataset.getRowKey
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getRowKey(int)
    
    /**
    @utbot.classUnderTest {@link DefaultIntervalCategoryDataset}
 * @utbot.methodUnderTest {@link org.jfree.data.category.DefaultIntervalCategoryDataset#getRowKey(int)}
 * @utbot.executesCondition {@code (row >= getRowCount()): False}
 * @utbot.executesCondition {@code (row < 0): False}
 * @utbot.invokes {@link org.jfree.data.category.DefaultIntervalCategoryDataset#getRowCount()}
 * @utbot.returnsFrom {@code return this.seriesKeys[row];}
 *  */
    @Test
    public void testGetRowKey_RowGreaterOrEqualZero() throws Exception  {
        DefaultIntervalCategoryDataset defaultIntervalCategoryDataset = ((DefaultIntervalCategoryDataset) createInstance("org.jfree.data.category.DefaultIntervalCategoryDataset"));
        java.lang.Comparable[] seriesKeys = {null};
        defaultIntervalCategoryDataset.setSeriesKeys(seriesKeys);
        
        Comparable actual = defaultIntervalCategoryDataset.getRowKey(0);
        
        assertNull(actual);
        
        java.lang.Comparable[] defaultIntervalCategoryDatasetSeriesKeys = ((java.lang.Comparable[]) getFieldValue(defaultIntervalCategoryDataset, "org.jfree.data.category.DefaultIntervalCategoryDataset", "seriesKeys"));
        Comparable finalDefaultIntervalCategoryDatasetSeriesKeys0 = ((Comparable) get(defaultIntervalCategoryDatasetSeriesKeys, 0));
        
        assertNull(finalDefaultIntervalCategoryDatasetSeriesKeys0);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method getRowKey(int)
    
    /**
    @utbot.classUnderTest {@link DefaultIntervalCategoryDataset}
 * @utbot.methodUnderTest {@link org.jfree.data.category.DefaultIntervalCategoryDataset#getRowKey(int)}
 * @utbot.executesCondition {@code (row >= getRowCount()): False}
 * @utbot.executesCondition {@code (row < 0): True}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: (row >= getRowCount()) || (row < 0)
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testGetRowKey_ThrowIllegalArgumentException() throws Exception  {
        DefaultIntervalCategoryDataset defaultIntervalCategoryDataset = ((DefaultIntervalCategoryDataset) createInstance("org.jfree.data.category.DefaultIntervalCategoryDataset"));
        java.lang.Comparable[] seriesKeys = {};
        defaultIntervalCategoryDataset.setSeriesKeys(seriesKeys);
        
        defaultIntervalCategoryDataset.getRowKey(-1);
    }
    
    /**
    @utbot.classUnderTest {@link DefaultIntervalCategoryDataset}
 * @utbot.methodUnderTest {@link org.jfree.data.category.DefaultIntervalCategoryDataset#getRowKey(int)}
 * @utbot.executesCondition {@code (row >= getRowCount()): True}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: (row >= getRowCount()) || (row < 0)
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testGetRowKey_ThrowIllegalArgumentException_1() throws Exception  {
        DefaultIntervalCategoryDataset defaultIntervalCategoryDataset = ((DefaultIntervalCategoryDataset) createInstance("org.jfree.data.category.DefaultIntervalCategoryDataset"));
        java.lang.Comparable[] seriesKeys = {null};
        defaultIntervalCategoryDataset.setSeriesKeys(seriesKeys);
        
        defaultIntervalCategoryDataset.getRowKey(1);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.data.category.DefaultIntervalCategoryDataset.getSeriesCount
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getSeriesCount()
    
    /**
    @utbot.classUnderTest {@link DefaultIntervalCategoryDataset}
 * @utbot.methodUnderTest {@link org.jfree.data.category.DefaultIntervalCategoryDataset#getSeriesCount()}
 * @utbot.executesCondition {@code (this.startData != null): True}
 * @utbot.returnsFrom {@code return result;}
 *  */
    @Test
    public void testGetSeriesCount_ThisStartDataNotEqualsNull() throws Exception  {
        DefaultIntervalCategoryDataset defaultIntervalCategoryDataset = ((DefaultIntervalCategoryDataset) createInstance("org.jfree.data.category.DefaultIntervalCategoryDataset"));
        java.lang.Number[][] startData = {null};
        setField(defaultIntervalCategoryDataset, "org.jfree.data.category.DefaultIntervalCategoryDataset", "startData", startData);
        
        int actual = defaultIntervalCategoryDataset.getSeriesCount();
        
        assertEquals(1, actual);
        
        java.lang.Number[][] defaultIntervalCategoryDatasetStartData = ((java.lang.Number[][]) getFieldValue(defaultIntervalCategoryDataset, "org.jfree.data.category.DefaultIntervalCategoryDataset", "startData"));
        java.lang.Number[] finalDefaultIntervalCategoryDatasetStartData0 = ((java.lang.Number[]) get(defaultIntervalCategoryDatasetStartData, 0));
        
        assertNull(finalDefaultIntervalCategoryDatasetStartData0);
    }
    
    /**
    @utbot.classUnderTest {@link DefaultIntervalCategoryDataset}
 * @utbot.methodUnderTest {@link org.jfree.data.category.DefaultIntervalCategoryDataset#getSeriesCount()}
 * @utbot.executesCondition {@code (this.startData != null): False}
 * @utbot.returnsFrom {@code return result;}
 *  */
    @Test
    public void testGetSeriesCount_ThisStartDataEqualsNull() throws Exception  {
        DefaultIntervalCategoryDataset defaultIntervalCategoryDataset = ((DefaultIntervalCategoryDataset) createInstance("org.jfree.data.category.DefaultIntervalCategoryDataset"));
        
        int actual = defaultIntervalCategoryDataset.getSeriesCount();
        
        assertEquals(0, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.data.category.DefaultIntervalCategoryDataset.getSeriesIndex
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getSeriesIndex(java.lang.Comparable)
    
    /**
    @utbot.classUnderTest {@link DefaultIntervalCategoryDataset}
 * @utbot.methodUnderTest {@link org.jfree.data.category.DefaultIntervalCategoryDataset#getSeriesIndex(java.lang.Comparable)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < this.seriesKeys.length; i++)} once
 * @utbot.returnsFrom {@code return result;}
 *  */
    @Test
    public void testGetSeriesIndex_IterateForLoop() throws Exception  {
        DefaultIntervalCategoryDataset defaultIntervalCategoryDataset = ((DefaultIntervalCategoryDataset) createInstance("org.jfree.data.category.DefaultIntervalCategoryDataset"));
        java.lang.Comparable[] seriesKeys = {};
        defaultIntervalCategoryDataset.setSeriesKeys(seriesKeys);
        
        int actual = defaultIntervalCategoryDataset.getSeriesIndex(null);
        
        assertEquals(-1, actual);
    }
    
    /**
    @utbot.classUnderTest {@link DefaultIntervalCategoryDataset}
 * @utbot.methodUnderTest {@link org.jfree.data.category.DefaultIntervalCategoryDataset#getSeriesIndex(java.lang.Comparable)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < this.seriesKeys.length; i++)} once
 * @utbot.returnsFrom {@code return result;}
 *  */
    @Test
    public void testGetSeriesIndex_SeriesKeyEquals() throws Exception  {
        DefaultIntervalCategoryDataset defaultIntervalCategoryDataset = ((DefaultIntervalCategoryDataset) createInstance("org.jfree.data.category.DefaultIntervalCategoryDataset"));
        java.lang.Comparable[] seriesKeys = new java.lang.Comparable[1];
        Integer integer = 0;
        seriesKeys[0] = ((Comparable) integer);
        defaultIntervalCategoryDataset.setSeriesKeys(seriesKeys);
        Integer integer1 = 0;
        
        int actual = defaultIntervalCategoryDataset.getSeriesIndex(integer1);
        
        assertEquals(0, actual);
    }
    
    /**
    @utbot.classUnderTest {@link DefaultIntervalCategoryDataset}
 * @utbot.methodUnderTest {@link org.jfree.data.category.DefaultIntervalCategoryDataset#getSeriesIndex(java.lang.Comparable)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < this.seriesKeys.length; i++)} twice
 * @utbot.returnsFrom {@code return result;}
 *  */
    @Test
    public void testGetSeriesIndex_NotSeriesKeyEquals() throws Exception  {
        DefaultIntervalCategoryDataset defaultIntervalCategoryDataset = ((DefaultIntervalCategoryDataset) createInstance("org.jfree.data.category.DefaultIntervalCategoryDataset"));
        java.lang.Comparable[] seriesKeys = {null};
        defaultIntervalCategoryDataset.setSeriesKeys(seriesKeys);
        Integer integer = 0;
        
        int actual = defaultIntervalCategoryDataset.getSeriesIndex(integer);
        
        assertEquals(-1, actual);
        
        java.lang.Comparable[] defaultIntervalCategoryDatasetSeriesKeys = ((java.lang.Comparable[]) getFieldValue(defaultIntervalCategoryDataset, "org.jfree.data.category.DefaultIntervalCategoryDataset", "seriesKeys"));
        Comparable finalDefaultIntervalCategoryDatasetSeriesKeys0 = ((Comparable) get(defaultIntervalCategoryDatasetSeriesKeys, 0));
        
        assertNull(finalDefaultIntervalCategoryDatasetSeriesKeys0);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getSeriesIndex(java.lang.Comparable)
    
    /**
    @utbot.classUnderTest {@link DefaultIntervalCategoryDataset}
 * @utbot.methodUnderTest {@link org.jfree.data.category.DefaultIntervalCategoryDataset#getSeriesIndex(java.lang.Comparable)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < this.seriesKeys.length; i++)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} when: seriesKey.equals(this.seriesKeys[i])
 *  */
    @Test
    public void testGetSeriesIndex_ThrowNullPointerException_1() throws Exception  {
        DefaultIntervalCategoryDataset defaultIntervalCategoryDataset = ((DefaultIntervalCategoryDataset) createInstance("org.jfree.data.category.DefaultIntervalCategoryDataset"));
        java.lang.Comparable[] seriesKeys = {null};
        defaultIntervalCategoryDataset.setSeriesKeys(seriesKeys);
        
        /* This test fails because method [org.jfree.data.category.DefaultIntervalCategoryDataset.getSeriesIndex] produces [java.lang.NullPointerException]
            org.jfree.data.category.DefaultIntervalCategoryDataset.getSeriesIndex(DefaultIntervalCategoryDataset.java:243) */
        defaultIntervalCategoryDataset.getSeriesIndex(null);
    }
    
    /**
    @utbot.classUnderTest {@link DefaultIntervalCategoryDataset}
 * @utbot.methodUnderTest {@link org.jfree.data.category.DefaultIntervalCategoryDataset#getSeriesIndex(java.lang.Comparable)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < this.seriesKeys.length; i++)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(int i = 0; i < this.seriesKeys.length; i++)
 *  */
    @Test
    public void testGetSeriesIndex_ThrowNullPointerException() throws Exception  {
        DefaultIntervalCategoryDataset defaultIntervalCategoryDataset = ((DefaultIntervalCategoryDataset) createInstance("org.jfree.data.category.DefaultIntervalCategoryDataset"));
        
        /* This test fails because method [org.jfree.data.category.DefaultIntervalCategoryDataset.getSeriesIndex] produces [java.lang.NullPointerException]
            org.jfree.data.category.DefaultIntervalCategoryDataset.getSeriesIndex(DefaultIntervalCategoryDataset.java:242) */
        defaultIntervalCategoryDataset.getSeriesIndex(null);
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
        
            java.lang.reflect.Method methodForGetDeclaredFields798565566473800 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields798565566473800.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass798565566481400 = (java.lang.reflect.Field[]) methodForGetDeclaredFields798565566473800.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass798565566481400).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
        modifiersField.setAccessible(true);
        modifiersField.setInt(field, field.getModifiers() & ~java.lang.reflect.Modifier.FINAL);
        
        return field.get(obj);
    }
    
        private static void setField(Object object, String fieldClassName, String fieldName, Object fieldValue) throws ClassNotFoundException, NoSuchFieldException, NoSuchMethodException, IllegalAccessException, java.lang.reflect.InvocationTargetException {
        Class<?> clazz = Class.forName(fieldClassName);
        java.lang.reflect.Field field = clazz.getDeclaredField(fieldName);
    
        java.lang.reflect.Field modifiersField;
        
                java.lang.reflect.Method methodForGetDeclaredFields798565566792300 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields798565566792300.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass798565566793900 = (java.lang.reflect.Field[]) methodForGetDeclaredFields798565566792300.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass798565566793900).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
        modifiersField.setAccessible(true);
        modifiersField.setInt(field, field.getModifiers() & ~java.lang.reflect.Modifier.FINAL);
    
        field.setAccessible(true);
        field.set(object, fieldValue);
    }
    
    static class FieldsPair {
        final Object o1;
        final Object o2;
    
        public FieldsPair(Object o1, Object o2) {
            this.o1 = o1;
            this.o2 = o2;
        }
    
        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            FieldsPair that = (FieldsPair) o;
            return java.util.Objects.equals(o1, that.o1) && java.util.Objects.equals(o2, that.o2);
        }
    
        @Override
        public int hashCode() {
            return java.util.Objects.hash(o1, o2);
        }
    }
    
    private static boolean deepEquals(Object o1, Object o2) {
        return deepEquals(o1, o2, new java.util.HashSet<>());
    }
    
    private static boolean deepEquals(Object o1, Object o2, java.util.Set<FieldsPair> visited) {
        visited.add(new FieldsPair(o1, o2));
    
        if (o1 == o2) {
            return true;
        }
    
        if (o1 == null || o2 == null) {
            return false;
        }
    
        if (o1 instanceof Iterable) {
            if (!(o2 instanceof Iterable)) {
                return false;
            }
    
            return iterablesDeepEquals((Iterable<?>) o1, (Iterable<?>) o2, visited);
        }
        
        if (o2 instanceof Iterable) {
            return false;
        }
        
        if (o1 instanceof java.util.stream.BaseStream) {
            if (!(o2 instanceof java.util.stream.BaseStream)) {
                return false;
            }
    
            return streamsDeepEquals((java.util.stream.BaseStream<?, ?>) o1, (java.util.stream.BaseStream<?, ?>) o2, visited);
        }
    
        if (o2 instanceof java.util.stream.BaseStream) {
            return false;
        }
    
        if (o1 instanceof java.util.Map) {
            if (!(o2 instanceof java.util.Map)) {
                return false;
            }
    
            return mapsDeepEquals((java.util.Map<?, ?>) o1, (java.util.Map<?, ?>) o2, visited);
        }
        
        if (o2 instanceof java.util.Map) {
            return false;
        }
    
        Class<?> firstClass = o1.getClass();
        if (firstClass.isArray()) {
            if (!o2.getClass().isArray()) {
                return false;
            }
    
            // Primitive arrays should not appear here
            return arraysDeepEquals(o1, o2, visited);
        }
    
        // common classes
    
        // check if class has custom equals method (including wrappers and strings)
        // It is very important to check it here but not earlier because iterables and maps also have custom equals 
        // based on elements equals 
        if (hasCustomEquals(firstClass)) {
            return o1.equals(o2);
        }
    
        // common classes without custom equals, use comparison by fields
        final java.util.List<java.lang.reflect.Field> fields = new java.util.ArrayList<>();
        while (firstClass != Object.class) {
            fields.addAll(java.util.Arrays.asList(firstClass.getDeclaredFields()));
            // Interface should not appear here
            firstClass = firstClass.getSuperclass();
        }
    
        for (java.lang.reflect.Field field : fields) {
            field.setAccessible(true);
            try {
                final Object field1 = field.get(o1);
                final Object field2 = field.get(o2);
                if (!visited.contains(new FieldsPair(field1, field2)) && !deepEquals(field1, field2, visited)) {
                    return false;
                }
            } catch (IllegalArgumentException e) {
                return false;
            } catch (IllegalAccessException e) {
                // should never occur because field was set accessible
                return false;
            }
        }
    
        return true;
    }
    
    private static boolean arraysDeepEquals(Object arr1, Object arr2, java.util.Set<FieldsPair> visited) {
        final int length = java.lang.reflect.Array.getLength(arr1);
        if (length != java.lang.reflect.Array.getLength(arr2)) {
            return false;
        }
    
        for (int i = 0; i < length; i++) {
            if (!deepEquals(java.lang.reflect.Array.get(arr1, i), java.lang.reflect.Array.get(arr2, i), visited)) {
                return false;
            }
        }
    
        return true;
    }
    
    private static boolean iterablesDeepEquals(Iterable<?> i1, Iterable<?> i2, java.util.Set<FieldsPair> visited) {
        final java.util.Iterator<?> firstIterator = i1.iterator();
        final java.util.Iterator<?> secondIterator = i2.iterator();
        while (firstIterator.hasNext() && secondIterator.hasNext()) {
            if (!deepEquals(firstIterator.next(), secondIterator.next(), visited)) {
                return false;
            }
        }
    
        if (firstIterator.hasNext()) {
            return false;
        }
    
        return !secondIterator.hasNext();
    }
    
    private static boolean streamsDeepEquals(
        java.util.stream.BaseStream<?, ?> s1, 
        java.util.stream.BaseStream<?, ?> s2, 
        java.util.Set<FieldsPair> visited
    ) {
        final java.util.Iterator<?> firstIterator = s1.iterator();
        final java.util.Iterator<?> secondIterator = s2.iterator();
        while (firstIterator.hasNext() && secondIterator.hasNext()) {
            if (!deepEquals(firstIterator.next(), secondIterator.next(), visited)) {
                return false;
            }
        }
    
        if (firstIterator.hasNext()) {
            return false;
        }
    
        return !secondIterator.hasNext();
    }
    
    private static boolean mapsDeepEquals(
        java.util.Map<?, ?> m1, 
        java.util.Map<?, ?> m2, 
        java.util.Set<FieldsPair> visited
    ) {
        final java.util.Iterator<? extends java.util.Map.Entry<?, ?>> firstIterator = m1.entrySet().iterator();
        final java.util.Iterator<? extends java.util.Map.Entry<?, ?>> secondIterator = m2.entrySet().iterator();
        while (firstIterator.hasNext() && secondIterator.hasNext()) {
            final java.util.Map.Entry<?, ?> firstEntry = firstIterator.next();
            final java.util.Map.Entry<?, ?> secondEntry = secondIterator.next();
    
            if (!deepEquals(firstEntry.getKey(), secondEntry.getKey(), visited)) {
                return false;
            }
    
            if (!deepEquals(firstEntry.getValue(), secondEntry.getValue(), visited)) {
                return false;
            }
        }
    
        if (firstIterator.hasNext()) {
            return false;
        }
    
        return !secondIterator.hasNext();
    }
    
    private static boolean hasCustomEquals(Class<?> clazz) {
        while (!Object.class.equals(clazz)) {
            try {
                clazz.getDeclaredMethod("equals", Object.class);
                return true;
            } catch (Exception e) { 
                // Interface should not appear here
                clazz = clazz.getSuperclass();
            }
        }
    
        return false;
    }
    
    private static Object getEnumConstantByName(Class<?> enumClass, String name) throws IllegalAccessException {
        java.lang.reflect.Field[] fields = enumClass.getDeclaredFields();
        for (java.lang.reflect.Field field : fields) {
            String fieldName = field.getName();
            if (field.isEnumConstant() && fieldName.equals(name)) {
                field.setAccessible(true);
                
                return field.get(null);
            }
        }
        
        return null;
    }
    
    private static Object[] createArray(String className, int length, Object... values) throws ClassNotFoundException {
        Object array = java.lang.reflect.Array.newInstance(Class.forName(className), length);
    
        for (int i = 0; i < values.length; i++) {
            java.lang.reflect.Array.set(array, i, values[i]);
        }
        
        return (Object[]) array;
    }
    
    private static Object getUnsafeInstance() throws ClassNotFoundException, NoSuchFieldException, IllegalAccessException {
        java.lang.reflect.Field f = Class.forName("sun.misc.Unsafe").getDeclaredField("theUnsafe");
        f.setAccessible(true);
        return f.get(null);
    }
    ///endregion
}

