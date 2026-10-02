package org.jfree.data;

import org.junit.Test;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import org.jfree.data.xy.XYDataItem;
import java.lang.reflect.Method;
import java.util.Date;
import org.jfree.data.xy.OHLCDataItem;
import org.jfree.chart.renderer.Outlier;
import java.awt.Point;
import java.util.HashMap;
import org.jfree.data.general.DefaultKeyedValuesDataset;
import java.util.ArrayList;
import org.jfree.chart.util.SortOrder;
import sun.nio.cs.UTF_16LE;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Objects;
import java.util.Map;
import java.util.List;
import java.util.Set;
import java.util.HashSet;
import java.util.Arrays;
import java.lang.reflect.Array;
import java.util.Iterator;
import java.util.stream.BaseStream;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public final class org_jfree_data_DefaultKeyedValuesTest {
    ///region Test suites for executable org.jfree.data.DefaultKeyedValues.addValue
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method addValue(java.lang.Comparable, double)
    
    /**
    @utbot.classUnderTest {@link DefaultKeyedValues}
 * @utbot.methodUnderTest {@link org.jfree.data.DefaultKeyedValues#addValue(java.lang.Comparable,double)}
 * @utbot.invokes {@link org.jfree.data.DefaultKeyedValues#addValue(java.lang.Comparable,java.lang.Number)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: addValue(key, new Double(value));
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testAddValue_ThrowIllegalArgumentException() {
        DefaultKeyedValues defaultKeyedValues = new DefaultKeyedValues();
        
        defaultKeyedValues.addValue(((Comparable) null), java.lang.Double.NaN);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method addValue(java.lang.Comparable, double)
    
    /**
     * @utbot.classUnderTest {@link org.jfree.data.DefaultKeyedValues}
     * @utbot.methodUnderTest {@link org.jfree.data.DefaultKeyedValues#addValue(java.lang.Comparable,double)}
     */
    @Test
    public void testAddValue() throws ClassNotFoundException, NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException  {
        DefaultKeyedValues defaultKeyedValues = new DefaultKeyedValues();
        Class xYDataItemClazz = Class.forName("org.jfree.data.xy.XYDataItem");
        Class numberType = Class.forName("java.lang.Number");
        Constructor xYDataItemConstructor = xYDataItemClazz.getDeclaredConstructor(numberType, numberType);
        xYDataItemConstructor.setAccessible(true);
        java.lang.Object[] xYDataItemConstructorArguments = new java.lang.Object[2];
        xYDataItemConstructorArguments[0] = 1.0;
        xYDataItemConstructorArguments[1] = Integer.MAX_VALUE;
        XYDataItem xYDataItem = ((XYDataItem) xYDataItemConstructor.newInstance(xYDataItemConstructorArguments));
        Method setYMethod = xYDataItemClazz.getDeclaredMethod("setY", numberType);
        setYMethod.setAccessible(true);
        java.lang.Object[] setYMethodArguments = new java.lang.Object[1];
        setYMethodArguments[0] = 0;
        setYMethod.invoke(xYDataItem, setYMethodArguments);
        
        defaultKeyedValues.addValue(((Comparable) xYDataItem), 1.34078079299426E154);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.data.DefaultKeyedValues.addValue
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method addValue(java.lang.Comparable, java.lang.Number)
    
    /**
    @utbot.classUnderTest {@link DefaultKeyedValues}
 * @utbot.methodUnderTest {@link org.jfree.data.DefaultKeyedValues#addValue(java.lang.Comparable,java.lang.Number)}
 * @utbot.invokes {@link org.jfree.data.DefaultKeyedValues#setValue(java.lang.Comparable,java.lang.Number)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: setValue(key, value);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testAddValue_ThrowIllegalArgumentException1() {
        DefaultKeyedValues defaultKeyedValues = new DefaultKeyedValues();
        
        defaultKeyedValues.addValue(((Comparable) null), ((Number) null));
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method addValue(java.lang.Comparable, java.lang.Number)
    
    /**
     * @utbot.classUnderTest {@link org.jfree.data.DefaultKeyedValues}
     * @utbot.methodUnderTest {@link org.jfree.data.DefaultKeyedValues#addValue(java.lang.Comparable,java.lang.Number)}
     */
    @Test
    public void testAddValueWithCornerCase() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        DefaultKeyedValues defaultKeyedValues = new DefaultKeyedValues();
        Date date = new Date();
        OHLCDataItem oHLCDataItem = new OHLCDataItem(date, java.lang.Double.NEGATIVE_INFINITY, java.lang.Double.POSITIVE_INFINITY, -1.0, 1.0, java.lang.Double.NaN);
        Object object = new Object();
        ComparableObjectItem comparableObjectItem = new ComparableObjectItem(oHLCDataItem, object);
        
        Class defaultKeyedValuesClazz = Class.forName("org.jfree.data.DefaultKeyedValues");
        Class comparableObjectItemType = Class.forName("java.lang.Comparable");
        Class numberType = Class.forName("java.lang.Number");
        Method addValueMethod = defaultKeyedValuesClazz.getDeclaredMethod("addValue", comparableObjectItemType, numberType);
        addValueMethod.setAccessible(true);
        java.lang.Object[] addValueMethodArguments = new java.lang.Object[2];
        addValueMethodArguments[0] = comparableObjectItem;
        addValueMethodArguments[1] = java.lang.Float.POSITIVE_INFINITY;
        addValueMethod.invoke(defaultKeyedValues, addValueMethodArguments);
    }
    
    /**
     * @utbot.classUnderTest {@link org.jfree.data.DefaultKeyedValues}
     * @utbot.methodUnderTest {@link org.jfree.data.DefaultKeyedValues#addValue(java.lang.Comparable,java.lang.Number)}
     */
    @Test
    public void testAddValue1() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        DefaultKeyedValues defaultKeyedValues = new DefaultKeyedValues();
        Outlier outlier = new Outlier(java.lang.Double.NEGATIVE_INFINITY, java.lang.Double.POSITIVE_INFINITY, java.lang.Double.POSITIVE_INFINITY);
        outlier.setRadius(java.lang.Double.POSITIVE_INFINITY);
        Point point = new Point(0, Integer.MAX_VALUE);
        point.x = 0;
        point.y = 0;
        outlier.setPoint(point);
        
        Class defaultKeyedValuesClazz = Class.forName("org.jfree.data.DefaultKeyedValues");
        Class outlierType = Class.forName("java.lang.Comparable");
        Class numberType = Class.forName("java.lang.Number");
        Method addValueMethod = defaultKeyedValuesClazz.getDeclaredMethod("addValue", outlierType, numberType);
        addValueMethod.setAccessible(true);
        java.lang.Object[] addValueMethodArguments = new java.lang.Object[2];
        addValueMethodArguments[0] = outlier;
        addValueMethodArguments[1] = -2147221504;
        addValueMethod.invoke(defaultKeyedValues, addValueMethodArguments);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.data.DefaultKeyedValues.equals
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method equals(java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link DefaultKeyedValues}
 * @utbot.methodUnderTest {@link org.jfree.data.DefaultKeyedValues#equals(java.lang.Object)}
 * @utbot.executesCondition {@code (obj): False}
 * @utbot.executesCondition {@code (!(obj instanceof KeyedValues)): True}
 *  */
    @Test
    public void testEquals_NotObjInstanceOfKeyedValues() {
        DefaultKeyedValues defaultKeyedValues = new DefaultKeyedValues();
        
        boolean actual = defaultKeyedValues.equals(null);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link DefaultKeyedValues}
 * @utbot.methodUnderTest {@link org.jfree.data.DefaultKeyedValues#equals(java.lang.Object)}
 * @utbot.executesCondition {@code (obj): True}
 *  */
    @Test
    public void testEquals_Obj() {
        DefaultKeyedValues defaultKeyedValues = new DefaultKeyedValues();
        
        boolean actual = defaultKeyedValues.equals(defaultKeyedValues);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link DefaultKeyedValues}
 * @utbot.methodUnderTest {@link org.jfree.data.DefaultKeyedValues#equals(java.lang.Object)}
 * @utbot.executesCondition {@code (obj): False}
 * @utbot.executesCondition {@code (!(obj instanceof KeyedValues)): False}
 * @utbot.executesCondition {@code (count != that.getItemCount()): False}
 * @utbot.invokes {@link org.jfree.data.DefaultKeyedValues#getItemCount()}
 * @utbot.invokes {@link org.jfree.data.KeyedValues#getItemCount()}
 *  */
    @Test
    public void testEquals_CountEqualsThatGetItemCount() throws Exception  {
        DefaultKeyedValues defaultKeyedValues = ((DefaultKeyedValues) createInstance("org.jfree.data.DefaultKeyedValues"));
        HashMap indexMap = new HashMap();
        setField(defaultKeyedValues, "org.jfree.data.DefaultKeyedValues", "indexMap", indexMap);
        DefaultKeyedValuesDataset defaultKeyedValuesDataset = ((DefaultKeyedValuesDataset) createInstance("org.jfree.data.general.DefaultKeyedValuesDataset"));
        DefaultKeyedValues data = ((DefaultKeyedValues) createInstance("org.jfree.data.DefaultKeyedValues"));
        setField(data, "org.jfree.data.DefaultKeyedValues", "indexMap", indexMap);
        setField(defaultKeyedValuesDataset, "org.jfree.data.general.DefaultPieDataset", "data", data);
        
        boolean actual = defaultKeyedValues.equals(defaultKeyedValuesDataset);
        
        assertTrue(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method equals(java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link DefaultKeyedValues}
 * @utbot.methodUnderTest {@link org.jfree.data.DefaultKeyedValues#equals(java.lang.Object)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < count; i++)} once
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: Comparable k1 = getKey(i);
 *  */
    @Test
    public void testEquals_ThrowIndexOutOfBoundsException_1() throws Exception  {
        DefaultKeyedValues defaultKeyedValues = ((DefaultKeyedValues) createInstance("org.jfree.data.DefaultKeyedValues"));
        ArrayList keys = new ArrayList();
        setField(defaultKeyedValues, "org.jfree.data.DefaultKeyedValues", "keys", keys);
        HashMap indexMap = new HashMap();
        Integer integer = 0;
        Object object = createInstance("java.lang.Object");
        indexMap.put(integer, object);
        setField(defaultKeyedValues, "org.jfree.data.DefaultKeyedValues", "indexMap", indexMap);
        DefaultKeyedValues defaultKeyedValues1 = ((DefaultKeyedValues) createInstance("org.jfree.data.DefaultKeyedValues"));
        setField(defaultKeyedValues1, "org.jfree.data.DefaultKeyedValues", "indexMap", indexMap);
        
        /* This test fails because method [org.jfree.data.DefaultKeyedValues.equals] produces [java.lang.IndexOutOfBoundsException: Index 0 out of bounds for length 0]
            java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
            java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
            java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:266)
            java.base/java.util.Objects.checkIndex(Objects.java:359)
            java.base/java.util.ArrayList.get(ArrayList.java:427)
            org.jfree.data.DefaultKeyedValues.getKey(DefaultKeyedValues.java:136)
            org.jfree.data.DefaultKeyedValues.equals(DefaultKeyedValues.java:425) */
        defaultKeyedValues.equals(defaultKeyedValues1);
    }
    
    /**
    @utbot.classUnderTest {@link DefaultKeyedValues}
 * @utbot.methodUnderTest {@link org.jfree.data.DefaultKeyedValues#equals(java.lang.Object)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < count; i++)} once
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: Comparable k1 = getKey(i);
 *  */
    @Test
    public void testEquals_ThrowIndexOutOfBoundsException() throws Exception  {
        DefaultKeyedValues defaultKeyedValues = ((DefaultKeyedValues) createInstance("org.jfree.data.DefaultKeyedValues"));
        ArrayList keys = new ArrayList();
        setField(defaultKeyedValues, "org.jfree.data.DefaultKeyedValues", "keys", keys);
        HashMap indexMap = new HashMap();
        indexMap.put(null, null);
        setField(defaultKeyedValues, "org.jfree.data.DefaultKeyedValues", "indexMap", indexMap);
        DefaultKeyedValuesDataset defaultKeyedValuesDataset = ((DefaultKeyedValuesDataset) createInstance("org.jfree.data.general.DefaultKeyedValuesDataset"));
        DefaultKeyedValues data = ((DefaultKeyedValues) createInstance("org.jfree.data.DefaultKeyedValues"));
        setField(data, "org.jfree.data.DefaultKeyedValues", "indexMap", indexMap);
        setField(defaultKeyedValuesDataset, "org.jfree.data.general.DefaultPieDataset", "data", data);
        
        /* This test fails because method [org.jfree.data.DefaultKeyedValues.equals] produces [java.lang.IndexOutOfBoundsException: Index 0 out of bounds for length 0]
            java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
            java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
            java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:266)
            java.base/java.util.Objects.checkIndex(Objects.java:359)
            java.base/java.util.ArrayList.get(ArrayList.java:427)
            org.jfree.data.DefaultKeyedValues.getKey(DefaultKeyedValues.java:136)
            org.jfree.data.DefaultKeyedValues.equals(DefaultKeyedValues.java:425) */
        defaultKeyedValues.equals(defaultKeyedValuesDataset);
    }
    
    /**
    @utbot.classUnderTest {@link DefaultKeyedValues}
 * @utbot.methodUnderTest {@link org.jfree.data.DefaultKeyedValues#equals(java.lang.Object)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < count; i++)} once
 * @utbot.throwsException {@link java.lang.ClassCastException} in: Comparable k1 = getKey(i);
 *  */
    @Test
    public void testEquals_ThrowClassCastException() throws Exception  {
        DefaultKeyedValues defaultKeyedValues = ((DefaultKeyedValues) createInstance("org.jfree.data.DefaultKeyedValues"));
        ArrayList keys = new ArrayList();
        Object object = createInstance("java.lang.Object");
        keys.add(object);
        setField(defaultKeyedValues, "org.jfree.data.DefaultKeyedValues", "keys", keys);
        HashMap indexMap = new HashMap();
        indexMap.put(null, null);
        setField(defaultKeyedValues, "org.jfree.data.DefaultKeyedValues", "indexMap", indexMap);
        DefaultKeyedValuesDataset defaultKeyedValuesDataset = ((DefaultKeyedValuesDataset) createInstance("org.jfree.data.general.DefaultKeyedValuesDataset"));
        DefaultKeyedValues data = ((DefaultKeyedValues) createInstance("org.jfree.data.DefaultKeyedValues"));
        setField(data, "org.jfree.data.DefaultKeyedValues", "indexMap", indexMap);
        setField(defaultKeyedValuesDataset, "org.jfree.data.general.DefaultPieDataset", "data", data);
        
        /* This test fails because method [org.jfree.data.DefaultKeyedValues.equals] produces [java.lang.ClassCastException: class java.lang.Object cannot be cast to class java.lang.Comparable (java.lang.Object and java.lang.Comparable are in module java.base of loader 'bootstrap')]
            org.jfree.data.DefaultKeyedValues.getKey(DefaultKeyedValues.java:136)
            org.jfree.data.DefaultKeyedValues.equals(DefaultKeyedValues.java:425) */
        defaultKeyedValues.equals(defaultKeyedValuesDataset);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.data.DefaultKeyedValues.hashCode
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method hashCode()
    
    /**
    @utbot.classUnderTest {@link DefaultKeyedValues}
 * @utbot.methodUnderTest {@link org.jfree.data.DefaultKeyedValues#hashCode()}
 * @utbot.executesCondition {@code (this.keys != null): True}
 * @utbot.invokes {@link java.util.ArrayList#hashCode()}
 * @utbot.returnsFrom {@code return (this.keys != null ? this.keys.hashCode() : 0);}
 *  */
    @Test
    public void testHashCode_ThisKeysNotEqualsNull() throws Exception  {
        DefaultKeyedValues defaultKeyedValues = ((DefaultKeyedValues) createInstance("org.jfree.data.DefaultKeyedValues"));
        ArrayList keys = new ArrayList();
        setField(defaultKeyedValues, "org.jfree.data.DefaultKeyedValues", "keys", keys);
        
        int actual = defaultKeyedValues.hashCode();
        
        assertEquals(1, actual);
    }
    
    /**
    @utbot.classUnderTest {@link DefaultKeyedValues}
 * @utbot.methodUnderTest {@link org.jfree.data.DefaultKeyedValues#hashCode()}
 * @utbot.executesCondition {@code (this.keys != null): False}
 * @utbot.returnsFrom {@code return (this.keys != null ? this.keys.hashCode() : 0);}
 *  */
    @Test
    public void testHashCode_ThisKeysEqualsNull() throws Exception  {
        DefaultKeyedValues defaultKeyedValues = ((DefaultKeyedValues) createInstance("org.jfree.data.DefaultKeyedValues"));
        
        int actual = defaultKeyedValues.hashCode();
        
        assertEquals(0, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.data.DefaultKeyedValues.clone
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method clone()
    
    /**
    @utbot.classUnderTest {@link DefaultKeyedValues}
 * @utbot.methodUnderTest {@link org.jfree.data.DefaultKeyedValues#clone()}
 * @utbot.invokes {@link java.lang.Object#clone()}
 *  */
    @Test
    public void testClone_ObjectClone() throws Exception  {
        DefaultKeyedValues defaultKeyedValues = new DefaultKeyedValues();
        
        DefaultKeyedValues actual = ((DefaultKeyedValues) defaultKeyedValues.clone());
        
        DefaultKeyedValues expected = ((DefaultKeyedValues) createInstance("org.jfree.data.DefaultKeyedValues"));
        ArrayList keys = new ArrayList();
        setField(expected, "org.jfree.data.DefaultKeyedValues", "keys", keys);
        ArrayList values = new ArrayList();
        setField(expected, "org.jfree.data.DefaultKeyedValues", "values", values);
        HashMap indexMap = new HashMap();
        setField(expected, "org.jfree.data.DefaultKeyedValues", "indexMap", indexMap);
        
        // org.jfree.data.DefaultKeyedValues has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.data.DefaultKeyedValues.clear
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method clear()
    
    /**
    @utbot.classUnderTest {@link DefaultKeyedValues}
 * @utbot.methodUnderTest {@link org.jfree.data.DefaultKeyedValues#clear()}
 * @utbot.invokes {@link java.util.ArrayList#clear()}
 * @utbot.invokes {@link java.util.ArrayList#clear()}
 * @utbot.invokes {@link java.util.HashMap#clear()}
 *  */
    @Test
    public void testClear_HashMapClear() throws Exception  {
        DefaultKeyedValues defaultKeyedValues = ((DefaultKeyedValues) createInstance("org.jfree.data.DefaultKeyedValues"));
        ArrayList keys = new ArrayList();
        keys.add(null);
        keys.add(null);
        keys.add(null);
        setField(defaultKeyedValues, "org.jfree.data.DefaultKeyedValues", "keys", keys);
        setField(defaultKeyedValues, "org.jfree.data.DefaultKeyedValues", "values", keys);
        HashMap indexMap = new HashMap();
        setField(defaultKeyedValues, "org.jfree.data.DefaultKeyedValues", "indexMap", indexMap);
        
        defaultKeyedValues.clear();
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method clear()
    
    /**
    @utbot.classUnderTest {@link DefaultKeyedValues}
 * @utbot.methodUnderTest {@link org.jfree.data.DefaultKeyedValues#clear()}
 * @utbot.invokes {@link java.util.ArrayList#clear()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: this.keys.clear();
 *  */
    @Test
    public void testClear_ThrowNullPointerException() throws Exception  {
        DefaultKeyedValues defaultKeyedValues = ((DefaultKeyedValues) createInstance("org.jfree.data.DefaultKeyedValues"));
        
        /* This test fails because method [org.jfree.data.DefaultKeyedValues.clear] produces [java.lang.NullPointerException]
            org.jfree.data.DefaultKeyedValues.clear(DefaultKeyedValues.java:346) */
        defaultKeyedValues.clear();
    }
    
    /**
    @utbot.classUnderTest {@link DefaultKeyedValues}
 * @utbot.methodUnderTest {@link org.jfree.data.DefaultKeyedValues#clear()}
 * @utbot.invokes {@link java.util.ArrayList#clear()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: this.values.clear();
 *  */
    @Test
    public void testClear_ThrowNullPointerException_1() throws Exception  {
        DefaultKeyedValues defaultKeyedValues = ((DefaultKeyedValues) createInstance("org.jfree.data.DefaultKeyedValues"));
        ArrayList keys = new ArrayList();
        keys.add(null);
        keys.add(null);
        keys.add(null);
        setField(defaultKeyedValues, "org.jfree.data.DefaultKeyedValues", "keys", keys);
        
        /* This test fails because method [org.jfree.data.DefaultKeyedValues.clear] produces [java.lang.NullPointerException]
            org.jfree.data.DefaultKeyedValues.clear(DefaultKeyedValues.java:347) */
        defaultKeyedValues.clear();
    }
    
    /**
    @utbot.classUnderTest {@link DefaultKeyedValues}
 * @utbot.methodUnderTest {@link org.jfree.data.DefaultKeyedValues#clear()}
 * @utbot.invokes {@link java.util.ArrayList#clear()}
 * @utbot.invokes {@link java.util.HashMap#clear()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: this.indexMap.clear();
 *  */
    @Test
    public void testClear_ThrowNullPointerException_2() throws Exception  {
        DefaultKeyedValues defaultKeyedValues = ((DefaultKeyedValues) createInstance("org.jfree.data.DefaultKeyedValues"));
        ArrayList keys = new ArrayList();
        keys.add(null);
        keys.add(null);
        keys.add(null);
        setField(defaultKeyedValues, "org.jfree.data.DefaultKeyedValues", "keys", keys);
        setField(defaultKeyedValues, "org.jfree.data.DefaultKeyedValues", "values", keys);
        
        /* This test fails because method [org.jfree.data.DefaultKeyedValues.clear] produces [java.lang.NullPointerException]
            org.jfree.data.DefaultKeyedValues.clear(DefaultKeyedValues.java:348) */
        defaultKeyedValues.clear();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.data.DefaultKeyedValues.getValue
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getValue(int)
    
    /**
    @utbot.classUnderTest {@link DefaultKeyedValues}
 * @utbot.methodUnderTest {@link org.jfree.data.DefaultKeyedValues#getValue(int)}
 * @utbot.invokes {@link java.util.ArrayList#get(int)}
 * @utbot.returnsFrom {@code return (Number) this.values.get(item);}
 *  */
    @Test
    public void testGetValue_ArrayListGet() throws Exception  {
        DefaultKeyedValues defaultKeyedValues = ((DefaultKeyedValues) createInstance("org.jfree.data.DefaultKeyedValues"));
        ArrayList values = new ArrayList();
        values.add(null);
        setField(defaultKeyedValues, "org.jfree.data.DefaultKeyedValues", "values", values);
        
        Number actual = defaultKeyedValues.getValue(0);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getValue(int)
    
    /**
    @utbot.classUnderTest {@link DefaultKeyedValues}
 * @utbot.methodUnderTest {@link org.jfree.data.DefaultKeyedValues#getValue(int)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: return (Number) this.values.get(item);
 *  */
    @Test
    public void testGetValue_ThrowClassCastException() throws Exception  {
        DefaultKeyedValues defaultKeyedValues = ((DefaultKeyedValues) createInstance("org.jfree.data.DefaultKeyedValues"));
        ArrayList values = new ArrayList();
        Object object = createInstance("java.lang.Object");
        values.add(object);
        setField(defaultKeyedValues, "org.jfree.data.DefaultKeyedValues", "values", values);
        
        /* This test fails because method [org.jfree.data.DefaultKeyedValues.getValue] produces [java.lang.ClassCastException: class java.lang.Object cannot be cast to class java.lang.Number (java.lang.Object and java.lang.Number are in module java.base of loader 'bootstrap')]
            org.jfree.data.DefaultKeyedValues.getValue(DefaultKeyedValues.java:123) */
        defaultKeyedValues.getValue(0);
    }
    
    /**
    @utbot.classUnderTest {@link DefaultKeyedValues}
 * @utbot.methodUnderTest {@link org.jfree.data.DefaultKeyedValues#getValue(int)}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: return (Number) this.values.get(item);
 *  */
    @Test
    public void testGetValue_ThrowIndexOutOfBoundsException() throws Exception  {
        DefaultKeyedValues defaultKeyedValues = ((DefaultKeyedValues) createInstance("org.jfree.data.DefaultKeyedValues"));
        ArrayList values = new ArrayList();
        values.add(null);
        values.add(null);
        values.add(null);
        setField(defaultKeyedValues, "org.jfree.data.DefaultKeyedValues", "values", values);
        
        /* This test fails because method [org.jfree.data.DefaultKeyedValues.getValue] produces [java.lang.IndexOutOfBoundsException: Index -1 out of bounds for length 3]
            java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
            java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
            java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:266)
            java.base/java.util.Objects.checkIndex(Objects.java:359)
            java.base/java.util.ArrayList.get(ArrayList.java:427)
            org.jfree.data.DefaultKeyedValues.getValue(DefaultKeyedValues.java:123) */
        defaultKeyedValues.getValue(-1);
    }
    
    /**
    @utbot.classUnderTest {@link DefaultKeyedValues}
 * @utbot.methodUnderTest {@link org.jfree.data.DefaultKeyedValues#getValue(int)}
 * @utbot.invokes {@link java.util.ArrayList#get(int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return (Number) this.values.get(item);
 *  */
    @Test
    public void testGetValue_ThrowNullPointerException() throws Exception  {
        DefaultKeyedValues defaultKeyedValues = ((DefaultKeyedValues) createInstance("org.jfree.data.DefaultKeyedValues"));
        
        /* This test fails because method [org.jfree.data.DefaultKeyedValues.getValue] produces [java.lang.NullPointerException]
            org.jfree.data.DefaultKeyedValues.getValue(DefaultKeyedValues.java:123) */
        defaultKeyedValues.getValue(-255);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.data.DefaultKeyedValues.getValue
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getValue(java.lang.Comparable)
    
    /**
    @utbot.classUnderTest {@link DefaultKeyedValues}
 * @utbot.methodUnderTest {@link org.jfree.data.DefaultKeyedValues#getValue(java.lang.Comparable)}
 * @utbot.invokes {@link org.jfree.data.DefaultKeyedValues#getIndex(java.lang.Comparable)}
 * @utbot.invokes {@link org.jfree.data.DefaultKeyedValues#getValue(int)}
 * @utbot.returnsFrom {@code return getValue(index);}
 *  */
    @Test
    public void testGetValue_DefaultKeyedValuesGetValue() throws Exception  {
        DefaultKeyedValues defaultKeyedValues = ((DefaultKeyedValues) createInstance("org.jfree.data.DefaultKeyedValues"));
        ArrayList values = new ArrayList();
        values.add(null);
        setField(defaultKeyedValues, "org.jfree.data.DefaultKeyedValues", "values", values);
        HashMap indexMap = new HashMap();
        Integer integer = 0;
        Integer integer1 = 0;
        indexMap.put(integer, integer1);
        setField(defaultKeyedValues, "org.jfree.data.DefaultKeyedValues", "indexMap", indexMap);
        
        Number actual = defaultKeyedValues.getValue(((Comparable) integer));
        
        assertNull(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method getValue(java.lang.Comparable)
    
    /**
    @utbot.classUnderTest {@link DefaultKeyedValues}
 * @utbot.methodUnderTest {@link org.jfree.data.DefaultKeyedValues#getValue(java.lang.Comparable)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: int index = getIndex(key);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testGetValue_ThrowIllegalArgumentException() {
        DefaultKeyedValues defaultKeyedValues = new DefaultKeyedValues();
        
        defaultKeyedValues.getValue(((Comparable) null));
    }
    
    /**
    @utbot.classUnderTest {@link DefaultKeyedValues}
 * @utbot.methodUnderTest {@link org.jfree.data.DefaultKeyedValues#getValue(java.lang.Comparable)}
 * @utbot.throwsException {@link org.jfree.data.UnknownKeyException} when: index < 0
 *  */
    @Test(expected = UnknownKeyException.class)
    public void testGetValue_ThrowUnknownKeyException() throws Exception  {
        DefaultKeyedValues defaultKeyedValues = ((DefaultKeyedValues) createInstance("org.jfree.data.DefaultKeyedValues"));
        HashMap indexMap = new HashMap();
        setField(defaultKeyedValues, "org.jfree.data.DefaultKeyedValues", "indexMap", indexMap);
        Integer integer = 0;
        
        defaultKeyedValues.getValue(((Comparable) integer));
    }
    
    /**
    @utbot.classUnderTest {@link DefaultKeyedValues}
 * @utbot.methodUnderTest {@link org.jfree.data.DefaultKeyedValues#getValue(java.lang.Comparable)}
 * @utbot.throwsException {@link org.jfree.data.UnknownKeyException} when: index < 0
 *  */
    @Test(expected = UnknownKeyException.class)
    public void testGetValue_ThrowUnknownKeyException_1() throws Exception  {
        DefaultKeyedValues defaultKeyedValues = ((DefaultKeyedValues) createInstance("org.jfree.data.DefaultKeyedValues"));
        HashMap indexMap = new HashMap();
        Integer integer = 0;
        Integer integer1 = -1;
        indexMap.put(integer, integer1);
        setField(defaultKeyedValues, "org.jfree.data.DefaultKeyedValues", "indexMap", indexMap);
        
        defaultKeyedValues.getValue(((Comparable) integer));
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getValue(java.lang.Comparable)
    
    /**
    @utbot.classUnderTest {@link DefaultKeyedValues}
 * @utbot.methodUnderTest {@link org.jfree.data.DefaultKeyedValues#getValue(java.lang.Comparable)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: int index = getIndex(key);
 *  */
    @Test
    public void testGetValue_ThrowClassCastException1() throws Exception  {
        DefaultKeyedValues defaultKeyedValues = ((DefaultKeyedValues) createInstance("org.jfree.data.DefaultKeyedValues"));
        HashMap indexMap = new HashMap();
        Integer integer = 0;
        int[] intArray = {0};
        indexMap.put(integer, intArray);
        setField(defaultKeyedValues, "org.jfree.data.DefaultKeyedValues", "indexMap", indexMap);
        
        /* This test fails because method [org.jfree.data.DefaultKeyedValues.getValue] produces [java.lang.ClassCastException: class [I cannot be cast to class java.lang.Integer ([I and java.lang.Integer are in module java.base of loader 'bootstrap')]
            org.jfree.data.DefaultKeyedValues.getIndex(DefaultKeyedValues.java:153)
            org.jfree.data.DefaultKeyedValues.getValue(DefaultKeyedValues.java:181) */
        defaultKeyedValues.getValue(((Comparable) integer));
    }
    
    /**
    @utbot.classUnderTest {@link DefaultKeyedValues}
 * @utbot.methodUnderTest {@link org.jfree.data.DefaultKeyedValues#getValue(java.lang.Comparable)}
 * @utbot.invokes {@link org.jfree.data.DefaultKeyedValues#getValue(int)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: return getValue(index);
 *  */
    @Test
    public void testGetValue_ThrowClassCastException_1() throws Exception  {
        DefaultKeyedValues defaultKeyedValues = ((DefaultKeyedValues) createInstance("org.jfree.data.DefaultKeyedValues"));
        ArrayList values = new ArrayList();
        Object object = createInstance("java.lang.Object");
        values.add(object);
        setField(defaultKeyedValues, "org.jfree.data.DefaultKeyedValues", "values", values);
        HashMap indexMap = new HashMap();
        Integer integer = 0;
        indexMap.put(integer, integer);
        setField(defaultKeyedValues, "org.jfree.data.DefaultKeyedValues", "indexMap", indexMap);
        Integer integer1 = 0;
        
        /* This test fails because method [org.jfree.data.DefaultKeyedValues.getValue] produces [java.lang.ClassCastException: class java.lang.Object cannot be cast to class java.lang.Number (java.lang.Object and java.lang.Number are in module java.base of loader 'bootstrap')]
            org.jfree.data.DefaultKeyedValues.getValue(DefaultKeyedValues.java:123)
            org.jfree.data.DefaultKeyedValues.getValue(DefaultKeyedValues.java:185) */
        defaultKeyedValues.getValue(((Comparable) integer1));
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.data.DefaultKeyedValues.getKey
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getKey(int)
    
    /**
    @utbot.classUnderTest {@link DefaultKeyedValues}
 * @utbot.methodUnderTest {@link org.jfree.data.DefaultKeyedValues#getKey(int)}
 * @utbot.invokes {@link java.util.ArrayList#get(int)}
 * @utbot.returnsFrom {@code return (Comparable) this.keys.get(index);}
 *  */
    @Test
    public void testGetKey_ArrayListGet() throws Exception  {
        DefaultKeyedValues defaultKeyedValues = ((DefaultKeyedValues) createInstance("org.jfree.data.DefaultKeyedValues"));
        ArrayList keys = new ArrayList();
        keys.add(null);
        setField(defaultKeyedValues, "org.jfree.data.DefaultKeyedValues", "keys", keys);
        
        Comparable actual = defaultKeyedValues.getKey(0);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getKey(int)
    
    /**
    @utbot.classUnderTest {@link DefaultKeyedValues}
 * @utbot.methodUnderTest {@link org.jfree.data.DefaultKeyedValues#getKey(int)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: return (Comparable) this.keys.get(index);
 *  */
    @Test
    public void testGetKey_ThrowClassCastException() throws Exception  {
        DefaultKeyedValues defaultKeyedValues = ((DefaultKeyedValues) createInstance("org.jfree.data.DefaultKeyedValues"));
        ArrayList keys = new ArrayList();
        Object object = createInstance("java.lang.Object");
        keys.add(object);
        setField(defaultKeyedValues, "org.jfree.data.DefaultKeyedValues", "keys", keys);
        
        /* This test fails because method [org.jfree.data.DefaultKeyedValues.getKey] produces [java.lang.ClassCastException: class java.lang.Object cannot be cast to class java.lang.Comparable (java.lang.Object and java.lang.Comparable are in module java.base of loader 'bootstrap')]
            org.jfree.data.DefaultKeyedValues.getKey(DefaultKeyedValues.java:136) */
        defaultKeyedValues.getKey(0);
    }
    
    /**
    @utbot.classUnderTest {@link DefaultKeyedValues}
 * @utbot.methodUnderTest {@link org.jfree.data.DefaultKeyedValues#getKey(int)}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: return (Comparable) this.keys.get(index);
 *  */
    @Test
    public void testGetKey_ThrowIndexOutOfBoundsException() throws Exception  {
        DefaultKeyedValues defaultKeyedValues = ((DefaultKeyedValues) createInstance("org.jfree.data.DefaultKeyedValues"));
        ArrayList keys = new ArrayList();
        keys.add(null);
        keys.add(null);
        keys.add(null);
        setField(defaultKeyedValues, "org.jfree.data.DefaultKeyedValues", "keys", keys);
        
        /* This test fails because method [org.jfree.data.DefaultKeyedValues.getKey] produces [java.lang.IndexOutOfBoundsException: Index -1 out of bounds for length 3]
            java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
            java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
            java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:266)
            java.base/java.util.Objects.checkIndex(Objects.java:359)
            java.base/java.util.ArrayList.get(ArrayList.java:427)
            org.jfree.data.DefaultKeyedValues.getKey(DefaultKeyedValues.java:136) */
        defaultKeyedValues.getKey(-1);
    }
    
    /**
    @utbot.classUnderTest {@link DefaultKeyedValues}
 * @utbot.methodUnderTest {@link org.jfree.data.DefaultKeyedValues#getKey(int)}
 * @utbot.invokes {@link java.util.ArrayList#get(int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return (Comparable) this.keys.get(index);
 *  */
    @Test
    public void testGetKey_ThrowNullPointerException() throws Exception  {
        DefaultKeyedValues defaultKeyedValues = ((DefaultKeyedValues) createInstance("org.jfree.data.DefaultKeyedValues"));
        
        /* This test fails because method [org.jfree.data.DefaultKeyedValues.getKey] produces [java.lang.NullPointerException]
            org.jfree.data.DefaultKeyedValues.getKey(DefaultKeyedValues.java:136) */
        defaultKeyedValues.getKey(-255);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.data.DefaultKeyedValues.setValue
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method setValue(java.lang.Comparable, java.lang.Number)
    
    /**
    @utbot.classUnderTest {@link DefaultKeyedValues}
 * @utbot.methodUnderTest {@link org.jfree.data.DefaultKeyedValues#setValue(java.lang.Comparable,java.lang.Number)}
 * @utbot.executesCondition {@code (key == null): True}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: key == null
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testSetValue_ThrowIllegalArgumentException() {
        DefaultKeyedValues defaultKeyedValues = new DefaultKeyedValues();
        
        defaultKeyedValues.setValue(((Comparable) null), ((Number) null));
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method setValue(java.lang.Comparable, java.lang.Number)
    
    /**
    @utbot.classUnderTest {@link DefaultKeyedValues}
 * @utbot.methodUnderTest {@link org.jfree.data.DefaultKeyedValues#setValue(java.lang.Comparable,java.lang.Number)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: int keyIndex = getIndex(key);
 *  */
    @Test
    public void testSetValue_ThrowClassCastException() throws Exception  {
        DefaultKeyedValues defaultKeyedValues = ((DefaultKeyedValues) createInstance("org.jfree.data.DefaultKeyedValues"));
        HashMap indexMap = new HashMap();
        Integer integer = 0;
        int[] intArray = {0};
        indexMap.put(integer, intArray);
        setField(defaultKeyedValues, "org.jfree.data.DefaultKeyedValues", "indexMap", indexMap);
        
        /* This test fails because method [org.jfree.data.DefaultKeyedValues.setValue] produces [java.lang.ClassCastException: class [I cannot be cast to class java.lang.Integer ([I and java.lang.Integer are in module java.base of loader 'bootstrap')]
            org.jfree.data.DefaultKeyedValues.getIndex(DefaultKeyedValues.java:153)
            org.jfree.data.DefaultKeyedValues.setValue(DefaultKeyedValues.java:232) */
        defaultKeyedValues.setValue(((Comparable) integer), ((Number) null));
    }
    
    /**
    @utbot.classUnderTest {@link DefaultKeyedValues}
 * @utbot.methodUnderTest {@link org.jfree.data.DefaultKeyedValues#setValue(java.lang.Comparable,java.lang.Number)}
 * @utbot.executesCondition {@code (keyIndex >= 0): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: this.keys.add(key);
 *  */
    @Test
    public void testSetValue_ThrowNullPointerException() throws Exception  {
        DefaultKeyedValues defaultKeyedValues = ((DefaultKeyedValues) createInstance("org.jfree.data.DefaultKeyedValues"));
        HashMap indexMap = new HashMap();
        setField(defaultKeyedValues, "org.jfree.data.DefaultKeyedValues", "indexMap", indexMap);
        Integer integer = 0;
        
        /* This test fails because method [org.jfree.data.DefaultKeyedValues.setValue] produces [java.lang.NullPointerException]
            org.jfree.data.DefaultKeyedValues.setValue(DefaultKeyedValues.java:238) */
        defaultKeyedValues.setValue(((Comparable) integer), ((Number) null));
    }
    
    /**
    @utbot.classUnderTest {@link DefaultKeyedValues}
 * @utbot.methodUnderTest {@link org.jfree.data.DefaultKeyedValues#setValue(java.lang.Comparable,java.lang.Number)}
 * @utbot.executesCondition {@code (keyIndex >= 0): True}
 * @utbot.invokes {@link java.util.ArrayList#set(int,java.lang.Object)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: this.keys.set(keyIndex, key);
 *  */
    @Test
    public void testSetValue_ThrowNullPointerException_3() throws Exception  {
        DefaultKeyedValues defaultKeyedValues = ((DefaultKeyedValues) createInstance("org.jfree.data.DefaultKeyedValues"));
        HashMap indexMap = new HashMap();
        Integer integer = 0;
        indexMap.put(integer, integer);
        setField(defaultKeyedValues, "org.jfree.data.DefaultKeyedValues", "indexMap", indexMap);
        
        /* This test fails because method [org.jfree.data.DefaultKeyedValues.setValue] produces [java.lang.NullPointerException]
            org.jfree.data.DefaultKeyedValues.setValue(DefaultKeyedValues.java:234) */
        defaultKeyedValues.setValue(((Comparable) integer), ((Number) null));
    }
    
    /**
    @utbot.classUnderTest {@link DefaultKeyedValues}
 * @utbot.methodUnderTest {@link org.jfree.data.DefaultKeyedValues#setValue(java.lang.Comparable,java.lang.Number)}
 * @utbot.executesCondition {@code (keyIndex >= 0): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: this.keys.add(key);
 *  */
    @Test
    public void testSetValue_ThrowNullPointerException_2() throws Exception  {
        DefaultKeyedValues defaultKeyedValues = ((DefaultKeyedValues) createInstance("org.jfree.data.DefaultKeyedValues"));
        HashMap indexMap = new HashMap();
        Integer integer = 0;
        Integer integer1 = -1;
        indexMap.put(integer, integer1);
        setField(defaultKeyedValues, "org.jfree.data.DefaultKeyedValues", "indexMap", indexMap);
        
        /* This test fails because method [org.jfree.data.DefaultKeyedValues.setValue] produces [java.lang.NullPointerException]
            org.jfree.data.DefaultKeyedValues.setValue(DefaultKeyedValues.java:238) */
        defaultKeyedValues.setValue(((Comparable) integer), ((Number) null));
    }
    
    /**
    @utbot.classUnderTest {@link DefaultKeyedValues}
 * @utbot.methodUnderTest {@link org.jfree.data.DefaultKeyedValues#setValue(java.lang.Comparable,java.lang.Number)}
 * @utbot.executesCondition {@code (keyIndex >= 0): False}
 * @utbot.invokes {@link java.util.ArrayList#add(java.lang.Object)}
 * @utbot.invokes {@link java.util.ArrayList#add(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: this.values.add(value);
 *  */
    @Test
    public void testSetValue_ThrowNullPointerException_1() throws Exception  {
        DefaultKeyedValues defaultKeyedValues = ((DefaultKeyedValues) createInstance("org.jfree.data.DefaultKeyedValues"));
        ArrayList keys = new ArrayList();
        keys.add(null);
        keys.add(null);
        keys.add(null);
        setField(defaultKeyedValues, "org.jfree.data.DefaultKeyedValues", "keys", keys);
        HashMap indexMap = new HashMap();
        setField(defaultKeyedValues, "org.jfree.data.DefaultKeyedValues", "indexMap", indexMap);
        Integer integer = 0;
        
        /* This test fails because method [org.jfree.data.DefaultKeyedValues.setValue] produces [java.lang.NullPointerException]
            org.jfree.data.DefaultKeyedValues.setValue(DefaultKeyedValues.java:239) */
        defaultKeyedValues.setValue(((Comparable) integer), ((Number) null));
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method setValue(java.lang.Comparable, java.lang.Number)
    
    /**
     * @utbot.classUnderTest {@link org.jfree.data.DefaultKeyedValues}
     * @utbot.methodUnderTest {@link org.jfree.data.DefaultKeyedValues#setValue(java.lang.Comparable,java.lang.Number)}
     */
    @Test
    public void testSetValueWithCornerCase() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        DefaultKeyedValues defaultKeyedValues = new DefaultKeyedValues();
        Date date = new Date();
        OHLCDataItem oHLCDataItem = new OHLCDataItem(date, java.lang.Double.NEGATIVE_INFINITY, java.lang.Double.POSITIVE_INFINITY, -1.0, 1.0, java.lang.Double.NaN);
        Object object = new Object();
        ComparableObjectItem comparableObjectItem = new ComparableObjectItem(oHLCDataItem, object);
        
        Class defaultKeyedValuesClazz = Class.forName("org.jfree.data.DefaultKeyedValues");
        Class comparableObjectItemType = Class.forName("java.lang.Comparable");
        Class numberType = Class.forName("java.lang.Number");
        Method setValueMethod = defaultKeyedValuesClazz.getDeclaredMethod("setValue", comparableObjectItemType, numberType);
        setValueMethod.setAccessible(true);
        java.lang.Object[] setValueMethodArguments = new java.lang.Object[2];
        setValueMethodArguments[0] = comparableObjectItem;
        setValueMethodArguments[1] = java.lang.Float.POSITIVE_INFINITY;
        setValueMethod.invoke(defaultKeyedValues, setValueMethodArguments);
    }
    
    /**
     * @utbot.classUnderTest {@link org.jfree.data.DefaultKeyedValues}
     * @utbot.methodUnderTest {@link org.jfree.data.DefaultKeyedValues#setValue(java.lang.Comparable,java.lang.Number)}
     */
    @Test
    public void testSetValue() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        DefaultKeyedValues defaultKeyedValues = new DefaultKeyedValues();
        Outlier outlier = new Outlier(java.lang.Double.NEGATIVE_INFINITY, java.lang.Double.POSITIVE_INFINITY, java.lang.Double.POSITIVE_INFINITY);
        outlier.setRadius(java.lang.Double.POSITIVE_INFINITY);
        Point point = new Point(-1, 0);
        point.x = 0;
        point.y = Integer.MAX_VALUE;
        outlier.setPoint(point);
        
        Class defaultKeyedValuesClazz = Class.forName("org.jfree.data.DefaultKeyedValues");
        Class outlierType = Class.forName("java.lang.Comparable");
        Class numberType = Class.forName("java.lang.Number");
        Method setValueMethod = defaultKeyedValuesClazz.getDeclaredMethod("setValue", outlierType, numberType);
        setValueMethod.setAccessible(true);
        java.lang.Object[] setValueMethodArguments = new java.lang.Object[2];
        setValueMethodArguments[0] = outlier;
        setValueMethodArguments[1] = 262144;
        setValueMethod.invoke(defaultKeyedValues, setValueMethodArguments);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.data.DefaultKeyedValues.setValue
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method setValue(java.lang.Comparable, double)
    
    /**
    @utbot.classUnderTest {@link DefaultKeyedValues}
 * @utbot.methodUnderTest {@link org.jfree.data.DefaultKeyedValues#setValue(java.lang.Comparable,double)}
 * @utbot.invokes {@link org.jfree.data.DefaultKeyedValues#setValue(java.lang.Comparable,java.lang.Number)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: setValue(key, new Double(value));
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testSetValue_ThrowIllegalArgumentException1() {
        DefaultKeyedValues defaultKeyedValues = new DefaultKeyedValues();
        
        defaultKeyedValues.setValue(((Comparable) null), java.lang.Double.NaN);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method setValue(java.lang.Comparable, double)
    
    /**
     * @utbot.classUnderTest {@link org.jfree.data.DefaultKeyedValues}
     * @utbot.methodUnderTest {@link org.jfree.data.DefaultKeyedValues#setValue(java.lang.Comparable,double)}
     */
    @Test
    public void testSetValue1() throws ClassNotFoundException, NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException  {
        DefaultKeyedValues defaultKeyedValues = new DefaultKeyedValues();
        Class xYDataItemClazz = Class.forName("org.jfree.data.xy.XYDataItem");
        Class numberType = Class.forName("java.lang.Number");
        Constructor xYDataItemConstructor = xYDataItemClazz.getDeclaredConstructor(numberType, numberType);
        xYDataItemConstructor.setAccessible(true);
        java.lang.Object[] xYDataItemConstructorArguments = new java.lang.Object[2];
        xYDataItemConstructorArguments[0] = 1.0;
        xYDataItemConstructorArguments[1] = Integer.MAX_VALUE;
        XYDataItem xYDataItem = ((XYDataItem) xYDataItemConstructor.newInstance(xYDataItemConstructorArguments));
        Method setYMethod = xYDataItemClazz.getDeclaredMethod("setY", numberType);
        setYMethod.setAccessible(true);
        java.lang.Object[] setYMethodArguments = new java.lang.Object[1];
        setYMethodArguments[0] = 0;
        setYMethod.invoke(xYDataItem, setYMethodArguments);
        
        defaultKeyedValues.setValue(((Comparable) xYDataItem), 1.34078079299426E154);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.data.DefaultKeyedValues.getIndex
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getIndex(java.lang.Comparable)
    
    /**
    @utbot.classUnderTest {@link DefaultKeyedValues}
 * @utbot.methodUnderTest {@link org.jfree.data.DefaultKeyedValues#getIndex(java.lang.Comparable)}
 * @utbot.executesCondition {@code (i == null): True}
 * @utbot.returnsFrom {@code return -1;}
 *  */
    @Test
    public void testGetIndex_IEqualsNull() throws Exception  {
        DefaultKeyedValues defaultKeyedValues = ((DefaultKeyedValues) createInstance("org.jfree.data.DefaultKeyedValues"));
        HashMap indexMap = new HashMap();
        setField(defaultKeyedValues, "org.jfree.data.DefaultKeyedValues", "indexMap", indexMap);
        Integer integer = 0;
        
        int actual = defaultKeyedValues.getIndex(integer);
        
        assertEquals(-1, actual);
    }
    
    /**
    @utbot.classUnderTest {@link DefaultKeyedValues}
 * @utbot.methodUnderTest {@link org.jfree.data.DefaultKeyedValues#getIndex(java.lang.Comparable)}
 * @utbot.executesCondition {@code (i == null): False}
 * @utbot.invokes {@link java.lang.Integer#intValue()}
 * @utbot.returnsFrom {@code return i.intValue();}
 *  */
    @Test
    public void testGetIndex_INotEqualsNull() throws Exception  {
        DefaultKeyedValues defaultKeyedValues = ((DefaultKeyedValues) createInstance("org.jfree.data.DefaultKeyedValues"));
        HashMap indexMap = new HashMap();
        Integer integer = 0;
        indexMap.put(integer, integer);
        setField(defaultKeyedValues, "org.jfree.data.DefaultKeyedValues", "indexMap", indexMap);
        
        int actual = defaultKeyedValues.getIndex(integer);
        
        assertEquals(0, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method getIndex(java.lang.Comparable)
    
    /**
    @utbot.classUnderTest {@link DefaultKeyedValues}
 * @utbot.methodUnderTest {@link org.jfree.data.DefaultKeyedValues#getIndex(java.lang.Comparable)}
 * @utbot.executesCondition {@code (key == null): True}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: key == null
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testGetIndex_ThrowIllegalArgumentException() {
        DefaultKeyedValues defaultKeyedValues = new DefaultKeyedValues();
        
        defaultKeyedValues.getIndex(null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getIndex(java.lang.Comparable)
    
    /**
    @utbot.classUnderTest {@link DefaultKeyedValues}
 * @utbot.methodUnderTest {@link org.jfree.data.DefaultKeyedValues#getIndex(java.lang.Comparable)}
 * @utbot.invokes {@link java.util.HashMap#get(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: final Integer i = (Integer) this.indexMap.get(key);
 *  */
    @Test
    public void testGetIndex_ThrowClassCastException() throws Exception  {
        DefaultKeyedValues defaultKeyedValues = ((DefaultKeyedValues) createInstance("org.jfree.data.DefaultKeyedValues"));
        HashMap indexMap = new HashMap();
        Integer integer = 0;
        int[] intArray = {0};
        indexMap.put(integer, intArray);
        setField(defaultKeyedValues, "org.jfree.data.DefaultKeyedValues", "indexMap", indexMap);
        
        /* This test fails because method [org.jfree.data.DefaultKeyedValues.getIndex] produces [java.lang.ClassCastException: class [I cannot be cast to class java.lang.Integer ([I and java.lang.Integer are in module java.base of loader 'bootstrap')]
            org.jfree.data.DefaultKeyedValues.getIndex(DefaultKeyedValues.java:153) */
        defaultKeyedValues.getIndex(integer);
    }
    
    /**
    @utbot.classUnderTest {@link DefaultKeyedValues}
 * @utbot.methodUnderTest {@link org.jfree.data.DefaultKeyedValues#getIndex(java.lang.Comparable)}
 * @utbot.invokes {@link java.util.HashMap#get(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: final Integer i = (Integer) this.indexMap.get(key);
 *  */
    @Test
    public void testGetIndex_ThrowNullPointerException() throws Exception  {
        DefaultKeyedValues defaultKeyedValues = ((DefaultKeyedValues) createInstance("org.jfree.data.DefaultKeyedValues"));
        Integer integer = 0;
        
        /* This test fails because method [org.jfree.data.DefaultKeyedValues.getIndex] produces [java.lang.NullPointerException]
            org.jfree.data.DefaultKeyedValues.getIndex(DefaultKeyedValues.java:153) */
        defaultKeyedValues.getIndex(integer);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.data.DefaultKeyedValues.getItemCount
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getItemCount()
    
    /**
    @utbot.classUnderTest {@link DefaultKeyedValues}
 * @utbot.methodUnderTest {@link org.jfree.data.DefaultKeyedValues#getItemCount()}
 * @utbot.invokes {@link java.util.HashMap#size()}
 * @utbot.returnsFrom {@code return this.indexMap.size();}
 *  */
    @Test
    public void testGetItemCount_HashMapSize() throws Exception  {
        DefaultKeyedValues defaultKeyedValues = ((DefaultKeyedValues) createInstance("org.jfree.data.DefaultKeyedValues"));
        HashMap indexMap = new HashMap();
        setField(defaultKeyedValues, "org.jfree.data.DefaultKeyedValues", "indexMap", indexMap);
        
        int actual = defaultKeyedValues.getItemCount();
        
        assertEquals(0, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getItemCount()
    
    /**
    @utbot.classUnderTest {@link DefaultKeyedValues}
 * @utbot.methodUnderTest {@link org.jfree.data.DefaultKeyedValues#getItemCount()}
 * @utbot.invokes {@link java.util.HashMap#size()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return this.indexMap.size();
 *  */
    @Test
    public void testGetItemCount_ThrowNullPointerException() throws Exception  {
        DefaultKeyedValues defaultKeyedValues = ((DefaultKeyedValues) createInstance("org.jfree.data.DefaultKeyedValues"));
        
        /* This test fails because method [org.jfree.data.DefaultKeyedValues.getItemCount] produces [java.lang.NullPointerException]
            org.jfree.data.DefaultKeyedValues.getItemCount(DefaultKeyedValues.java:110) */
        defaultKeyedValues.getItemCount();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.data.DefaultKeyedValues.getKeys
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method getKeys()
    
    /**
     * @utbot.classUnderTest {@link org.jfree.data.DefaultKeyedValues}
     * @utbot.methodUnderTest {@link org.jfree.data.DefaultKeyedValues#getKeys()}
     */
    @Test
    public void testGetKeys() {
        DefaultKeyedValues defaultKeyedValues = new DefaultKeyedValues();
        
        ArrayList actual = ((ArrayList) defaultKeyedValues.getKeys());
        
        ArrayList expected = new ArrayList();
        
        assertTrue(deepEquals(expected, actual));
    }
    ///endregion
    
    ///region Errors report for getKeys
    
    public void testGetKeys_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // No method source set for method <java.lang.Object: java.lang.Object clone()>
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.data.DefaultKeyedValues.insertValue
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method insertValue(int, java.lang.Comparable, java.lang.Number)
    
    /**
    @utbot.classUnderTest {@link DefaultKeyedValues}
 * @utbot.methodUnderTest {@link org.jfree.data.DefaultKeyedValues#insertValue(int,java.lang.Comparable,java.lang.Number)}
 * @utbot.executesCondition {@code (position < 0): True}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: position < 0 || position > getItemCount()
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testInsertValue_ThrowIllegalArgumentException_1() {
        DefaultKeyedValues defaultKeyedValues = new DefaultKeyedValues();
        
        defaultKeyedValues.insertValue(-1, ((Comparable) null), ((Number) null));
    }
    
    /**
    @utbot.classUnderTest {@link DefaultKeyedValues}
 * @utbot.methodUnderTest {@link org.jfree.data.DefaultKeyedValues#insertValue(int,java.lang.Comparable,java.lang.Number)}
 * @utbot.executesCondition {@code (position < 0): False}
 * @utbot.executesCondition {@code (position > getItemCount()): True}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: position < 0 || position > getItemCount()
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testInsertValue_ThrowIllegalArgumentException() throws Exception  {
        DefaultKeyedValues defaultKeyedValues = ((DefaultKeyedValues) createInstance("org.jfree.data.DefaultKeyedValues"));
        HashMap indexMap = new HashMap();
        setField(defaultKeyedValues, "org.jfree.data.DefaultKeyedValues", "indexMap", indexMap);
        
        defaultKeyedValues.insertValue(1, ((Comparable) null), ((Number) null));
    }
    
    /**
    @utbot.classUnderTest {@link DefaultKeyedValues}
 * @utbot.methodUnderTest {@link org.jfree.data.DefaultKeyedValues#insertValue(int,java.lang.Comparable,java.lang.Number)}
 * @utbot.executesCondition {@code (position < 0): False}
 * @utbot.executesCondition {@code (position > getItemCount()): False}
 * @utbot.executesCondition {@code (key == null): True}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: key == null
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testInsertValue_ThrowIllegalArgumentException_2() throws Exception  {
        DefaultKeyedValues defaultKeyedValues = ((DefaultKeyedValues) createInstance("org.jfree.data.DefaultKeyedValues"));
        HashMap indexMap = new HashMap();
        setField(defaultKeyedValues, "org.jfree.data.DefaultKeyedValues", "indexMap", indexMap);
        
        defaultKeyedValues.insertValue(0, ((Comparable) null), ((Number) null));
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method insertValue(int, java.lang.Comparable, java.lang.Number)
    
    /**
    @utbot.classUnderTest {@link DefaultKeyedValues}
 * @utbot.methodUnderTest {@link org.jfree.data.DefaultKeyedValues#insertValue(int,java.lang.Comparable,java.lang.Number)}
 * @utbot.invokes {@link java.util.ArrayList#add(int,java.lang.Object)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: this.keys.add(position, key);
 *  */
    @Test
    public void testInsertValue_ThrowNullPointerException() throws Exception  {
        DefaultKeyedValues defaultKeyedValues = ((DefaultKeyedValues) createInstance("org.jfree.data.DefaultKeyedValues"));
        HashMap indexMap = new HashMap();
        setField(defaultKeyedValues, "org.jfree.data.DefaultKeyedValues", "indexMap", indexMap);
        Integer integer = 0;
        
        /* This test fails because method [org.jfree.data.DefaultKeyedValues.insertValue] produces [java.lang.NullPointerException]
            org.jfree.data.DefaultKeyedValues.insertValue(DefaultKeyedValues.java:288) */
        defaultKeyedValues.insertValue(0, ((Comparable) integer), ((Number) null));
    }
    
    /**
    @utbot.classUnderTest {@link DefaultKeyedValues}
 * @utbot.methodUnderTest {@link org.jfree.data.DefaultKeyedValues#insertValue(int,java.lang.Comparable,java.lang.Number)}
 * @utbot.invokes {@link java.util.ArrayList#add(int,java.lang.Object)}
 * @utbot.invokes {@link java.util.ArrayList#add(int,java.lang.Object)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: this.values.add(position, value);
 *  */
    @Test
    public void testInsertValue_ThrowNullPointerException_1() throws Exception  {
        DefaultKeyedValues defaultKeyedValues = ((DefaultKeyedValues) createInstance("org.jfree.data.DefaultKeyedValues"));
        ArrayList keys = new ArrayList();
        keys.add(null);
        keys.add(null);
        keys.add(null);
        setField(defaultKeyedValues, "org.jfree.data.DefaultKeyedValues", "keys", keys);
        HashMap indexMap = new HashMap();
        setField(defaultKeyedValues, "org.jfree.data.DefaultKeyedValues", "indexMap", indexMap);
        Integer integer = 0;
        
        /* This test fails because method [org.jfree.data.DefaultKeyedValues.insertValue] produces [java.lang.NullPointerException]
            org.jfree.data.DefaultKeyedValues.insertValue(DefaultKeyedValues.java:289) */
        defaultKeyedValues.insertValue(0, ((Comparable) integer), ((Number) null));
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.data.DefaultKeyedValues.insertValue
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method insertValue(int, java.lang.Comparable, double)
    
    /**
    @utbot.classUnderTest {@link DefaultKeyedValues}
 * @utbot.methodUnderTest {@link org.jfree.data.DefaultKeyedValues#insertValue(int,java.lang.Comparable,double)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: insertValue(position, key, new Double(value));
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testInsertValue_ThrowIllegalArgumentException1() {
        DefaultKeyedValues defaultKeyedValues = new DefaultKeyedValues();
        
        defaultKeyedValues.insertValue(-1, ((Comparable) null), java.lang.Double.NaN);
    }
    
    /**
    @utbot.classUnderTest {@link DefaultKeyedValues}
 * @utbot.methodUnderTest {@link org.jfree.data.DefaultKeyedValues#insertValue(int,java.lang.Comparable,double)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: insertValue(position, key, new Double(value));
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testInsertValue_ThrowIllegalArgumentException_11() throws Exception  {
        DefaultKeyedValues defaultKeyedValues = ((DefaultKeyedValues) createInstance("org.jfree.data.DefaultKeyedValues"));
        HashMap indexMap = new HashMap();
        setField(defaultKeyedValues, "org.jfree.data.DefaultKeyedValues", "indexMap", indexMap);
        
        defaultKeyedValues.insertValue(0, ((Comparable) null), 4.450147717016426E-308);
    }
    
    /**
    @utbot.classUnderTest {@link DefaultKeyedValues}
 * @utbot.methodUnderTest {@link org.jfree.data.DefaultKeyedValues#insertValue(int,java.lang.Comparable,double)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: insertValue(position, key, new Double(value));
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testInsertValue_ThrowIllegalArgumentException_21() throws Exception  {
        DefaultKeyedValues defaultKeyedValues = ((DefaultKeyedValues) createInstance("org.jfree.data.DefaultKeyedValues"));
        HashMap indexMap = new HashMap();
        setField(defaultKeyedValues, "org.jfree.data.DefaultKeyedValues", "indexMap", indexMap);
        
        defaultKeyedValues.insertValue(1, ((Comparable) null), java.lang.Double.NaN);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.data.DefaultKeyedValues.sortByValues
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method sortByValues(org.jfree.chart.util.SortOrder)
    
    /**
    @utbot.classUnderTest {@link DefaultKeyedValues}
 * @utbot.methodUnderTest {@link org.jfree.data.DefaultKeyedValues#sortByValues(org.jfree.chart.util.SortOrder)}
 * @utbot.invokes {@link java.util.ArrayList#size()}
 * @utbot.invokes {@link java.util.Arrays#sort(java.lang.Object[],java.util.Comparator)}
 * @utbot.invokes {@link org.jfree.data.DefaultKeyedValues#clear()}
 *  */
    @Test
    public void testSortByValues_ArrayListSize() throws Exception  {
        KeyedValueComparatorType prevBY_VALUE = KeyedValueComparatorType.BY_VALUE;
        try {
            KeyedValueComparatorType byValue = ((KeyedValueComparatorType) createInstance("org.jfree.data.KeyedValueComparatorType"));
            String name = "KeyedValueComparatorType.BY_VALUE";
            setField(byValue, "org.jfree.data.KeyedValueComparatorType", "name", name);
            Class keyedValueComparatorTypeClazz = Class.forName("org.jfree.data.KeyedValueComparatorType");
            setStaticField(keyedValueComparatorTypeClazz, "BY_VALUE", byValue);
            DefaultKeyedValues defaultKeyedValues = ((DefaultKeyedValues) createInstance("org.jfree.data.DefaultKeyedValues"));
            ArrayList keys = new ArrayList();
            setField(defaultKeyedValues, "org.jfree.data.DefaultKeyedValues", "keys", keys);
            setField(defaultKeyedValues, "org.jfree.data.DefaultKeyedValues", "values", keys);
            HashMap indexMap = new HashMap();
            setField(defaultKeyedValues, "org.jfree.data.DefaultKeyedValues", "indexMap", indexMap);
            SortOrder sortOrder = ((SortOrder) createInstance("org.jfree.chart.util.SortOrder"));
            
            defaultKeyedValues.sortByValues(sortOrder);
        } finally {
            setStaticField(KeyedValueComparatorType.class, "BY_VALUE", prevBY_VALUE);
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method sortByValues(org.jfree.chart.util.SortOrder)
    
    /**
    @utbot.classUnderTest {@link DefaultKeyedValues}
 * @utbot.methodUnderTest {@link org.jfree.data.DefaultKeyedValues#sortByValues(org.jfree.chart.util.SortOrder)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: Comparator comparator = new KeyedValueComparator(KeyedValueComparatorType.BY_VALUE, order);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testSortByValues_ThrowIllegalArgumentException() throws Exception  {
        KeyedValueComparatorType prevBY_VALUE = KeyedValueComparatorType.BY_VALUE;
        try {
            KeyedValueComparatorType byValue = ((KeyedValueComparatorType) createInstance("org.jfree.data.KeyedValueComparatorType"));
            String name = "KeyedValueComparatorType.BY_VALUE";
            setField(byValue, "org.jfree.data.KeyedValueComparatorType", "name", name);
            Class keyedValueComparatorTypeClazz = Class.forName("org.jfree.data.KeyedValueComparatorType");
            setStaticField(keyedValueComparatorTypeClazz, "BY_VALUE", byValue);
            DefaultKeyedValues defaultKeyedValues = ((DefaultKeyedValues) createInstance("org.jfree.data.DefaultKeyedValues"));
            ArrayList keys = new ArrayList();
            setField(defaultKeyedValues, "org.jfree.data.DefaultKeyedValues", "keys", keys);
            
            defaultKeyedValues.sortByValues(null);
        } finally {
            setStaticField(KeyedValueComparatorType.class, "BY_VALUE", prevBY_VALUE);
        }
    }
    
    /**
    @utbot.classUnderTest {@link DefaultKeyedValues}
 * @utbot.methodUnderTest {@link org.jfree.data.DefaultKeyedValues#sortByValues(org.jfree.chart.util.SortOrder)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < size; i++)} once
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: Comparator comparator = new KeyedValueComparator(KeyedValueComparatorType.BY_VALUE, order);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testSortByValues_ThrowIllegalArgumentException_1() throws Exception  {
        KeyedValueComparatorType prevBY_VALUE = KeyedValueComparatorType.BY_VALUE;
        try {
            KeyedValueComparatorType byValue = ((KeyedValueComparatorType) createInstance("org.jfree.data.KeyedValueComparatorType"));
            String name = "KeyedValueComparatorType.BY_VALUE";
            setField(byValue, "org.jfree.data.KeyedValueComparatorType", "name", name);
            Class keyedValueComparatorTypeClazz = Class.forName("org.jfree.data.KeyedValueComparatorType");
            setStaticField(keyedValueComparatorTypeClazz, "BY_VALUE", byValue);
            DefaultKeyedValues defaultKeyedValues = ((DefaultKeyedValues) createInstance("org.jfree.data.DefaultKeyedValues"));
            ArrayList keys = new ArrayList();
            keys.add(null);
            setField(defaultKeyedValues, "org.jfree.data.DefaultKeyedValues", "keys", keys);
            setField(defaultKeyedValues, "org.jfree.data.DefaultKeyedValues", "values", keys);
            
            defaultKeyedValues.sortByValues(null);
        } finally {
            setStaticField(KeyedValueComparatorType.class, "BY_VALUE", prevBY_VALUE);
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method sortByValues(org.jfree.chart.util.SortOrder)
    
    /**
    @utbot.classUnderTest {@link DefaultKeyedValues}
 * @utbot.methodUnderTest {@link org.jfree.data.DefaultKeyedValues#sortByValues(org.jfree.chart.util.SortOrder)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < size; i++)} once
 * @utbot.throwsException {@link java.lang.ClassCastException} in: (Number) this.values.get(i)
 *  */
    @Test
    public void testSortByValues_ThrowClassCastException() throws Exception  {
        DefaultKeyedValues defaultKeyedValues = ((DefaultKeyedValues) createInstance("org.jfree.data.DefaultKeyedValues"));
        ArrayList keys = new ArrayList();
        Object object = createInstance("java.lang.Object");
        keys.add(object);
        setField(defaultKeyedValues, "org.jfree.data.DefaultKeyedValues", "keys", keys);
        
        /* This test fails because method [org.jfree.data.DefaultKeyedValues.sortByValues] produces [java.lang.ClassCastException: class java.lang.Object cannot be cast to class java.lang.Comparable (java.lang.Object and java.lang.Comparable are in module java.base of loader 'bootstrap')]
            org.jfree.data.DefaultKeyedValues.sortByValues(DefaultKeyedValues.java:387) */
        defaultKeyedValues.sortByValues(null);
    }
    
    /**
    @utbot.classUnderTest {@link DefaultKeyedValues}
 * @utbot.methodUnderTest {@link org.jfree.data.DefaultKeyedValues#sortByValues(org.jfree.chart.util.SortOrder)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < size; i++)} once
 * @utbot.throwsException {@link java.lang.ClassCastException} in: (Number) this.values.get(i)
 *  */
    @Test
    public void testSortByValues_ThrowClassCastException_1() throws Exception  {
        DefaultKeyedValues defaultKeyedValues = ((DefaultKeyedValues) createInstance("org.jfree.data.DefaultKeyedValues"));
        ArrayList keys = new ArrayList();
        Class walkerStateClazz = Class.forName("java.lang.StackStreamFactory$WalkerState");
        Object walkerState = getEnumConstantByName(walkerStateClazz, "NEW");
        keys.add(walkerState);
        setField(defaultKeyedValues, "org.jfree.data.DefaultKeyedValues", "keys", keys);
        setField(defaultKeyedValues, "org.jfree.data.DefaultKeyedValues", "values", keys);
        
        /* This test fails because method [org.jfree.data.DefaultKeyedValues.sortByValues] produces [java.lang.ClassCastException: class java.lang.StackStreamFactory$WalkerState cannot be cast to class java.lang.Number (java.lang.StackStreamFactory$WalkerState and java.lang.Number are in module java.base of loader 'bootstrap')]
            org.jfree.data.DefaultKeyedValues.sortByValues(DefaultKeyedValues.java:388) */
        defaultKeyedValues.sortByValues(null);
    }
    
    /**
    @utbot.classUnderTest {@link DefaultKeyedValues}
 * @utbot.methodUnderTest {@link org.jfree.data.DefaultKeyedValues#sortByValues(org.jfree.chart.util.SortOrder)}
 * @utbot.invokes {@link java.util.ArrayList#size()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: final int size = this.keys.size();
 *  */
    @Test
    public void testSortByValues_ThrowNullPointerException() throws Exception  {
        DefaultKeyedValues defaultKeyedValues = ((DefaultKeyedValues) createInstance("org.jfree.data.DefaultKeyedValues"));
        
        /* This test fails because method [org.jfree.data.DefaultKeyedValues.sortByValues] produces [java.lang.NullPointerException]
            org.jfree.data.DefaultKeyedValues.sortByValues(DefaultKeyedValues.java:384) */
        defaultKeyedValues.sortByValues(null);
    }
    
    /**
    @utbot.classUnderTest {@link DefaultKeyedValues}
 * @utbot.methodUnderTest {@link org.jfree.data.DefaultKeyedValues#sortByValues(org.jfree.chart.util.SortOrder)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < size; i++)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: (Number) this.values.get(i)
 *  */
    @Test
    public void testSortByValues_ThrowNullPointerException_1() throws Exception  {
        DefaultKeyedValues defaultKeyedValues = ((DefaultKeyedValues) createInstance("org.jfree.data.DefaultKeyedValues"));
        ArrayList keys = new ArrayList();
        keys.add(null);
        setField(defaultKeyedValues, "org.jfree.data.DefaultKeyedValues", "keys", keys);
        
        /* This test fails because method [org.jfree.data.DefaultKeyedValues.sortByValues] produces [java.lang.NullPointerException]
            org.jfree.data.DefaultKeyedValues.sortByValues(DefaultKeyedValues.java:388) */
        defaultKeyedValues.sortByValues(null);
    }
    ///endregion
    
    ///region FUZZER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method sortByValues(org.jfree.chart.util.SortOrder)
    
    /**
     * @utbot.classUnderTest {@link org.jfree.data.DefaultKeyedValues}
     * @utbot.methodUnderTest {@link org.jfree.data.DefaultKeyedValues#sortByValues(org.jfree.chart.util.SortOrder)}
     */
    @Test(expected = IllegalArgumentException.class)
    public void testSortByValuesThrowsIAE() {
        DefaultKeyedValues defaultKeyedValues = new DefaultKeyedValues();
        
        defaultKeyedValues.sortByValues(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.data.DefaultKeyedValues.removeValue
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method removeValue(int)
    
    /**
    @utbot.classUnderTest {@link DefaultKeyedValues}
 * @utbot.methodUnderTest {@link org.jfree.data.DefaultKeyedValues#removeValue(int)}
 * @utbot.executesCondition {@code (index < this.keys.size()): False}
 *  */
    @Test
    public void testRemoveValue_IndexGreaterOrEqualThisKeysSize() throws Exception  {
        DefaultKeyedValues defaultKeyedValues = ((DefaultKeyedValues) createInstance("org.jfree.data.DefaultKeyedValues"));
        ArrayList keys = new ArrayList();
        keys.add(null);
        keys.add(null);
        setField(defaultKeyedValues, "org.jfree.data.DefaultKeyedValues", "keys", keys);
        setField(defaultKeyedValues, "org.jfree.data.DefaultKeyedValues", "values", keys);
        
        defaultKeyedValues.removeValue(0);
    }
    
    /**
    @utbot.classUnderTest {@link DefaultKeyedValues}
 * @utbot.methodUnderTest {@link org.jfree.data.DefaultKeyedValues#removeValue(int)}
 * @utbot.executesCondition {@code (index < this.keys.size()): True}
 * @utbot.invokes org.jfree.data.DefaultKeyedValues#rebuildIndex()
 *  */
    @Test
    public void testRemoveValue_IndexLessThanThisKeysSize() throws Exception  {
        DefaultKeyedValues defaultKeyedValues = ((DefaultKeyedValues) createInstance("org.jfree.data.DefaultKeyedValues"));
        ArrayList keys = new ArrayList();
        keys.add(null);
        keys.add(null);
        Integer integer = 0;
        keys.add(integer);
        setField(defaultKeyedValues, "org.jfree.data.DefaultKeyedValues", "keys", keys);
        setField(defaultKeyedValues, "org.jfree.data.DefaultKeyedValues", "values", keys);
        HashMap indexMap = new HashMap();
        indexMap.put(null, null);
        indexMap.put(null, null);
        Object object = createInstance("java.lang.Object");
        indexMap.put(integer, object);
        setField(defaultKeyedValues, "org.jfree.data.DefaultKeyedValues", "indexMap", indexMap);
        
        defaultKeyedValues.removeValue(0);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method removeValue(int)
    
    /**
    @utbot.classUnderTest {@link DefaultKeyedValues}
 * @utbot.methodUnderTest {@link org.jfree.data.DefaultKeyedValues#removeValue(int)}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: this.values.remove(index);
 *  */
    @Test
    public void testRemoveValue_ThrowIndexOutOfBoundsException() throws Exception  {
        DefaultKeyedValues defaultKeyedValues = ((DefaultKeyedValues) createInstance("org.jfree.data.DefaultKeyedValues"));
        ArrayList keys = new ArrayList();
        keys.add(null);
        setField(defaultKeyedValues, "org.jfree.data.DefaultKeyedValues", "keys", keys);
        setField(defaultKeyedValues, "org.jfree.data.DefaultKeyedValues", "values", keys);
        
        /* This test fails because method [org.jfree.data.DefaultKeyedValues.removeValue] produces [java.lang.IndexOutOfBoundsException: Index 0 out of bounds for length 0]
            java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
            java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
            java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:266)
            java.base/java.util.Objects.checkIndex(Objects.java:359)
            java.base/java.util.ArrayList.remove(ArrayList.java:504)
            org.jfree.data.DefaultKeyedValues.removeValue(DefaultKeyedValues.java:317) */
        defaultKeyedValues.removeValue(0);
    }
    
    /**
    @utbot.classUnderTest {@link DefaultKeyedValues}
 * @utbot.methodUnderTest {@link org.jfree.data.DefaultKeyedValues#removeValue(int)}
 * @utbot.invokes {@link java.util.ArrayList#remove(int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: this.keys.remove(index);
 *  */
    @Test
    public void testRemoveValue_ThrowNullPointerException() throws Exception  {
        DefaultKeyedValues defaultKeyedValues = ((DefaultKeyedValues) createInstance("org.jfree.data.DefaultKeyedValues"));
        
        /* This test fails because method [org.jfree.data.DefaultKeyedValues.removeValue] produces [java.lang.NullPointerException]
            org.jfree.data.DefaultKeyedValues.removeValue(DefaultKeyedValues.java:316) */
        defaultKeyedValues.removeValue(-255);
    }
    
    /**
    @utbot.classUnderTest {@link DefaultKeyedValues}
 * @utbot.methodUnderTest {@link org.jfree.data.DefaultKeyedValues#removeValue(int)}
 * @utbot.invokes {@link java.util.ArrayList#remove(int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: this.values.remove(index);
 *  */
    @Test
    public void testRemoveValue_ThrowNullPointerException_1() throws Exception  {
        DefaultKeyedValues defaultKeyedValues = ((DefaultKeyedValues) createInstance("org.jfree.data.DefaultKeyedValues"));
        ArrayList keys = new ArrayList();
        keys.add(null);
        setField(defaultKeyedValues, "org.jfree.data.DefaultKeyedValues", "keys", keys);
        
        /* This test fails because method [org.jfree.data.DefaultKeyedValues.removeValue] produces [java.lang.NullPointerException]
            org.jfree.data.DefaultKeyedValues.removeValue(DefaultKeyedValues.java:317) */
        defaultKeyedValues.removeValue(0);
    }
    
    /**
    @utbot.classUnderTest {@link DefaultKeyedValues}
 * @utbot.methodUnderTest {@link org.jfree.data.DefaultKeyedValues#removeValue(int)}
 * @utbot.executesCondition {@code (index < this.keys.size()): True}
 * @utbot.invokes {@link java.util.ArrayList#size()}
 * @utbot.invokes org.jfree.data.DefaultKeyedValues#rebuildIndex()
 * @utbot.throwsException {@link java.lang.NullPointerException} in: rebuildIndex();
 *  */
    @Test
    public void testRemoveValue_ThrowNullPointerException_2() throws Exception  {
        DefaultKeyedValues defaultKeyedValues = ((DefaultKeyedValues) createInstance("org.jfree.data.DefaultKeyedValues"));
        ArrayList keys = new ArrayList();
        keys.add(null);
        keys.add(null);
        keys.add(null);
        setField(defaultKeyedValues, "org.jfree.data.DefaultKeyedValues", "keys", keys);
        setField(defaultKeyedValues, "org.jfree.data.DefaultKeyedValues", "values", keys);
        
        /* This test fails because method [org.jfree.data.DefaultKeyedValues.removeValue] produces [java.lang.NullPointerException]
            org.jfree.data.DefaultKeyedValues.rebuildIndex(DefaultKeyedValues.java:299)
            org.jfree.data.DefaultKeyedValues.removeValue(DefaultKeyedValues.java:319) */
        defaultKeyedValues.removeValue(0);
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method removeValue(int)
    
    /**
     * @utbot.classUnderTest {@link org.jfree.data.DefaultKeyedValues}
     * @utbot.methodUnderTest {@link org.jfree.data.DefaultKeyedValues#removeValue(int)}
     */
    @Test
    public void testRemoveValueThrowsIOOBE() {
        DefaultKeyedValues defaultKeyedValues = new DefaultKeyedValues();
        
        /* This test fails because method [org.jfree.data.DefaultKeyedValues.removeValue] produces [java.lang.IndexOutOfBoundsException: Index -2147483647 out of bounds for length 0]
            java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
            java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
            java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:266)
            java.base/java.util.Objects.checkIndex(Objects.java:359)
            java.base/java.util.ArrayList.remove(ArrayList.java:504)
            org.jfree.data.DefaultKeyedValues.removeValue(DefaultKeyedValues.java:316) */
        defaultKeyedValues.removeValue(-2147483647);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.data.DefaultKeyedValues.removeValue
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method removeValue(java.lang.Comparable)
    
    /**
    @utbot.classUnderTest {@link DefaultKeyedValues}
 * @utbot.methodUnderTest {@link org.jfree.data.DefaultKeyedValues#removeValue(java.lang.Comparable)}
 * @utbot.returnsFrom {@code return;}
 *  */
    @Test
    public void testRemoveValue_Return() throws Exception  {
        DefaultKeyedValues defaultKeyedValues = ((DefaultKeyedValues) createInstance("org.jfree.data.DefaultKeyedValues"));
        HashMap indexMap = new HashMap();
        setField(defaultKeyedValues, "org.jfree.data.DefaultKeyedValues", "indexMap", indexMap);
        Integer integer = 0;
        
        defaultKeyedValues.removeValue(((Comparable) integer));
    }
    
    /**
    @utbot.classUnderTest {@link DefaultKeyedValues}
 * @utbot.methodUnderTest {@link org.jfree.data.DefaultKeyedValues#removeValue(java.lang.Comparable)}
 * @utbot.returnsFrom {@code return;}
 *  */
    @Test
    public void testRemoveValue_Return_1() throws Exception  {
        DefaultKeyedValues defaultKeyedValues = ((DefaultKeyedValues) createInstance("org.jfree.data.DefaultKeyedValues"));
        HashMap indexMap = new HashMap();
        Integer integer = 0;
        Integer integer1 = -1;
        indexMap.put(integer, integer1);
        setField(defaultKeyedValues, "org.jfree.data.DefaultKeyedValues", "indexMap", indexMap);
        
        defaultKeyedValues.removeValue(((Comparable) integer));
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method removeValue(java.lang.Comparable)
    
    /**
    @utbot.classUnderTest {@link DefaultKeyedValues}
 * @utbot.methodUnderTest {@link org.jfree.data.DefaultKeyedValues#removeValue(java.lang.Comparable)}
 * @utbot.invokes {@link org.jfree.data.DefaultKeyedValues#getIndex(java.lang.Comparable)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: int index = getIndex(key);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testRemoveValue_ThrowIllegalArgumentException() {
        DefaultKeyedValues defaultKeyedValues = new DefaultKeyedValues();
        
        defaultKeyedValues.removeValue(((Comparable) null));
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method removeValue(java.lang.Comparable)
    
    /**
    @utbot.classUnderTest {@link DefaultKeyedValues}
 * @utbot.methodUnderTest {@link org.jfree.data.DefaultKeyedValues#removeValue(java.lang.Comparable)}
 * @utbot.invokes {@link org.jfree.data.DefaultKeyedValues#getIndex(java.lang.Comparable)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: int index = getIndex(key);
 *  */
    @Test
    public void testRemoveValue_ThrowClassCastException() throws Exception  {
        DefaultKeyedValues defaultKeyedValues = ((DefaultKeyedValues) createInstance("org.jfree.data.DefaultKeyedValues"));
        HashMap indexMap = new HashMap();
        Integer integer = 0;
        byte[] byteArray = {(byte) 0};
        indexMap.put(integer, byteArray);
        setField(defaultKeyedValues, "org.jfree.data.DefaultKeyedValues", "indexMap", indexMap);
        
        /* This test fails because method [org.jfree.data.DefaultKeyedValues.removeValue] produces [java.lang.ClassCastException: class [B cannot be cast to class java.lang.Integer ([B and java.lang.Integer are in module java.base of loader 'bootstrap')]
            org.jfree.data.DefaultKeyedValues.getIndex(DefaultKeyedValues.java:153)
            org.jfree.data.DefaultKeyedValues.removeValue(DefaultKeyedValues.java:333) */
        defaultKeyedValues.removeValue(((Comparable) integer));
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.data.DefaultKeyedValues.sortByKeys
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method sortByKeys(org.jfree.chart.util.SortOrder)
    
    /**
    @utbot.classUnderTest {@link DefaultKeyedValues}
 * @utbot.methodUnderTest {@link org.jfree.data.DefaultKeyedValues#sortByKeys(org.jfree.chart.util.SortOrder)}
 * @utbot.invokes {@link java.util.ArrayList#size()}
 * @utbot.invokes {@link java.util.Arrays#sort(java.lang.Object[],java.util.Comparator)}
 * @utbot.invokes {@link org.jfree.data.DefaultKeyedValues#clear()}
 *  */
    @Test
    public void testSortByKeys_ArrayListSize() throws Exception  {
        KeyedValueComparatorType prevBY_KEY = KeyedValueComparatorType.BY_KEY;
        try {
            KeyedValueComparatorType byKey = ((KeyedValueComparatorType) createInstance("org.jfree.data.KeyedValueComparatorType"));
            String name = "KeyedValueComparatorType.BY_KEY";
            setField(byKey, "org.jfree.data.KeyedValueComparatorType", "name", name);
            Class keyedValueComparatorTypeClazz = Class.forName("org.jfree.data.KeyedValueComparatorType");
            setStaticField(keyedValueComparatorTypeClazz, "BY_KEY", byKey);
            DefaultKeyedValues defaultKeyedValues = ((DefaultKeyedValues) createInstance("org.jfree.data.DefaultKeyedValues"));
            ArrayList keys = new ArrayList();
            setField(defaultKeyedValues, "org.jfree.data.DefaultKeyedValues", "keys", keys);
            setField(defaultKeyedValues, "org.jfree.data.DefaultKeyedValues", "values", keys);
            HashMap indexMap = new HashMap();
            setField(defaultKeyedValues, "org.jfree.data.DefaultKeyedValues", "indexMap", indexMap);
            SortOrder sortOrder = ((SortOrder) createInstance("org.jfree.chart.util.SortOrder"));
            
            defaultKeyedValues.sortByKeys(sortOrder);
        } finally {
            setStaticField(KeyedValueComparatorType.class, "BY_KEY", prevBY_KEY);
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method sortByKeys(org.jfree.chart.util.SortOrder)
    
    /**
    @utbot.classUnderTest {@link DefaultKeyedValues}
 * @utbot.methodUnderTest {@link org.jfree.data.DefaultKeyedValues#sortByKeys(org.jfree.chart.util.SortOrder)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: Comparator comparator = new KeyedValueComparator(KeyedValueComparatorType.BY_KEY, order);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testSortByKeys_ThrowIllegalArgumentException() throws Exception  {
        KeyedValueComparatorType prevBY_KEY = KeyedValueComparatorType.BY_KEY;
        try {
            KeyedValueComparatorType byKey = ((KeyedValueComparatorType) createInstance("org.jfree.data.KeyedValueComparatorType"));
            String name = "KeyedValueComparatorType.BY_KEY";
            setField(byKey, "org.jfree.data.KeyedValueComparatorType", "name", name);
            Class keyedValueComparatorTypeClazz = Class.forName("org.jfree.data.KeyedValueComparatorType");
            setStaticField(keyedValueComparatorTypeClazz, "BY_KEY", byKey);
            DefaultKeyedValues defaultKeyedValues = ((DefaultKeyedValues) createInstance("org.jfree.data.DefaultKeyedValues"));
            ArrayList keys = new ArrayList();
            setField(defaultKeyedValues, "org.jfree.data.DefaultKeyedValues", "keys", keys);
            
            defaultKeyedValues.sortByKeys(null);
        } finally {
            setStaticField(KeyedValueComparatorType.class, "BY_KEY", prevBY_KEY);
        }
    }
    
    /**
    @utbot.classUnderTest {@link DefaultKeyedValues}
 * @utbot.methodUnderTest {@link org.jfree.data.DefaultKeyedValues#sortByKeys(org.jfree.chart.util.SortOrder)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < size; i++)} once
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: Comparator comparator = new KeyedValueComparator(KeyedValueComparatorType.BY_KEY, order);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testSortByKeys_ThrowIllegalArgumentException_1() throws Exception  {
        KeyedValueComparatorType prevBY_KEY = KeyedValueComparatorType.BY_KEY;
        try {
            KeyedValueComparatorType byKey = ((KeyedValueComparatorType) createInstance("org.jfree.data.KeyedValueComparatorType"));
            String name = "KeyedValueComparatorType.BY_KEY";
            setField(byKey, "org.jfree.data.KeyedValueComparatorType", "name", name);
            Class keyedValueComparatorTypeClazz = Class.forName("org.jfree.data.KeyedValueComparatorType");
            setStaticField(keyedValueComparatorTypeClazz, "BY_KEY", byKey);
            DefaultKeyedValues defaultKeyedValues = ((DefaultKeyedValues) createInstance("org.jfree.data.DefaultKeyedValues"));
            ArrayList keys = new ArrayList();
            keys.add(null);
            setField(defaultKeyedValues, "org.jfree.data.DefaultKeyedValues", "keys", keys);
            setField(defaultKeyedValues, "org.jfree.data.DefaultKeyedValues", "values", keys);
            
            defaultKeyedValues.sortByKeys(null);
        } finally {
            setStaticField(KeyedValueComparatorType.class, "BY_KEY", prevBY_KEY);
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method sortByKeys(org.jfree.chart.util.SortOrder)
    
    /**
    @utbot.classUnderTest {@link DefaultKeyedValues}
 * @utbot.methodUnderTest {@link org.jfree.data.DefaultKeyedValues#sortByKeys(org.jfree.chart.util.SortOrder)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < size; i++)} once
 * @utbot.throwsException {@link java.lang.ClassCastException} in: (Number) this.values.get(i)
 *  */
    @Test
    public void testSortByKeys_ThrowClassCastException() throws Exception  {
        DefaultKeyedValues defaultKeyedValues = ((DefaultKeyedValues) createInstance("org.jfree.data.DefaultKeyedValues"));
        ArrayList keys = new ArrayList();
        Object object = createInstance("java.lang.Object");
        keys.add(object);
        setField(defaultKeyedValues, "org.jfree.data.DefaultKeyedValues", "keys", keys);
        
        /* This test fails because method [org.jfree.data.DefaultKeyedValues.sortByKeys] produces [java.lang.ClassCastException: class java.lang.Object cannot be cast to class java.lang.Comparable (java.lang.Object and java.lang.Comparable are in module java.base of loader 'bootstrap')]
            org.jfree.data.DefaultKeyedValues.sortByKeys(DefaultKeyedValues.java:361) */
        defaultKeyedValues.sortByKeys(null);
    }
    
    /**
    @utbot.classUnderTest {@link DefaultKeyedValues}
 * @utbot.methodUnderTest {@link org.jfree.data.DefaultKeyedValues#sortByKeys(org.jfree.chart.util.SortOrder)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < size; i++)} once
 * @utbot.throwsException {@link java.lang.ClassCastException} in: (Number) this.values.get(i)
 *  */
    @Test
    public void testSortByKeys_ThrowClassCastException_1() throws Exception  {
        DefaultKeyedValues defaultKeyedValues = ((DefaultKeyedValues) createInstance("org.jfree.data.DefaultKeyedValues"));
        ArrayList keys = new ArrayList();
        UTF_16LE utf16le = ((UTF_16LE) createInstance("sun.nio.cs.UTF_16LE"));
        keys.add(utf16le);
        setField(defaultKeyedValues, "org.jfree.data.DefaultKeyedValues", "keys", keys);
        setField(defaultKeyedValues, "org.jfree.data.DefaultKeyedValues", "values", keys);
        
        /* This test fails because method [org.jfree.data.DefaultKeyedValues.sortByKeys] produces [java.lang.ClassCastException: class sun.nio.cs.UTF_16LE cannot be cast to class java.lang.Number (sun.nio.cs.UTF_16LE and java.lang.Number are in module java.base of loader 'bootstrap')]
            org.jfree.data.DefaultKeyedValues.sortByKeys(DefaultKeyedValues.java:362) */
        defaultKeyedValues.sortByKeys(null);
    }
    
    /**
    @utbot.classUnderTest {@link DefaultKeyedValues}
 * @utbot.methodUnderTest {@link org.jfree.data.DefaultKeyedValues#sortByKeys(org.jfree.chart.util.SortOrder)}
 * @utbot.invokes {@link java.util.ArrayList#size()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: final int size = this.keys.size();
 *  */
    @Test
    public void testSortByKeys_ThrowNullPointerException() throws Exception  {
        DefaultKeyedValues defaultKeyedValues = ((DefaultKeyedValues) createInstance("org.jfree.data.DefaultKeyedValues"));
        
        /* This test fails because method [org.jfree.data.DefaultKeyedValues.sortByKeys] produces [java.lang.NullPointerException]
            org.jfree.data.DefaultKeyedValues.sortByKeys(DefaultKeyedValues.java:357) */
        defaultKeyedValues.sortByKeys(null);
    }
    
    /**
    @utbot.classUnderTest {@link DefaultKeyedValues}
 * @utbot.methodUnderTest {@link org.jfree.data.DefaultKeyedValues#sortByKeys(org.jfree.chart.util.SortOrder)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < size; i++)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: (Number) this.values.get(i)
 *  */
    @Test
    public void testSortByKeys_ThrowNullPointerException_1() throws Exception  {
        DefaultKeyedValues defaultKeyedValues = ((DefaultKeyedValues) createInstance("org.jfree.data.DefaultKeyedValues"));
        ArrayList keys = new ArrayList();
        keys.add(null);
        setField(defaultKeyedValues, "org.jfree.data.DefaultKeyedValues", "keys", keys);
        
        /* This test fails because method [org.jfree.data.DefaultKeyedValues.sortByKeys] produces [java.lang.NullPointerException]
            org.jfree.data.DefaultKeyedValues.sortByKeys(DefaultKeyedValues.java:362) */
        defaultKeyedValues.sortByKeys(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.data.DefaultKeyedValues.rebuildIndex
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method rebuildIndex()
    
    /**
    @utbot.classUnderTest {@link DefaultKeyedValues}
 * @utbot.methodUnderTest {@link org.jfree.data.DefaultKeyedValues#rebuildIndex()}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < this.keys.size(); i++)} once
 *  */
    @Test
    public void testRebuildIndex_IterateForLoop() throws Exception  {
        DefaultKeyedValues defaultKeyedValues = ((DefaultKeyedValues) createInstance("org.jfree.data.DefaultKeyedValues"));
        ArrayList keys = new ArrayList();
        setField(defaultKeyedValues, "org.jfree.data.DefaultKeyedValues", "keys", keys);
        HashMap indexMap = new HashMap();
        setField(defaultKeyedValues, "org.jfree.data.DefaultKeyedValues", "indexMap", indexMap);
        
        Class defaultKeyedValuesClazz = Class.forName("org.jfree.data.DefaultKeyedValues");
        Method rebuildIndexMethod = defaultKeyedValuesClazz.getDeclaredMethod("rebuildIndex");
        rebuildIndexMethod.setAccessible(true);
        java.lang.Object[] rebuildIndexMethodArguments = new java.lang.Object[0];
        rebuildIndexMethod.invoke(defaultKeyedValues, rebuildIndexMethodArguments);
    }
    
    /**
    @utbot.classUnderTest {@link DefaultKeyedValues}
 * @utbot.methodUnderTest {@link org.jfree.data.DefaultKeyedValues#rebuildIndex()}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < this.keys.size(); i++)} twice
 *  */
    @Test
    public void testRebuildIndex_HashMapPut() throws Exception  {
        DefaultKeyedValues defaultKeyedValues = ((DefaultKeyedValues) createInstance("org.jfree.data.DefaultKeyedValues"));
        ArrayList keys = new ArrayList();
        keys.add(null);
        setField(defaultKeyedValues, "org.jfree.data.DefaultKeyedValues", "keys", keys);
        HashMap indexMap = new HashMap();
        setField(defaultKeyedValues, "org.jfree.data.DefaultKeyedValues", "indexMap", indexMap);
        
        Class defaultKeyedValuesClazz = Class.forName("org.jfree.data.DefaultKeyedValues");
        Method rebuildIndexMethod = defaultKeyedValuesClazz.getDeclaredMethod("rebuildIndex");
        rebuildIndexMethod.setAccessible(true);
        java.lang.Object[] rebuildIndexMethodArguments = new java.lang.Object[0];
        rebuildIndexMethod.invoke(defaultKeyedValues, rebuildIndexMethodArguments);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method rebuildIndex()
    
    /**
    @utbot.classUnderTest {@link DefaultKeyedValues}
 * @utbot.methodUnderTest {@link org.jfree.data.DefaultKeyedValues#rebuildIndex()}
 * @utbot.invokes {@link java.util.HashMap#clear()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: this.indexMap.clear();
 *  */
    @Test
    public void testRebuildIndex_ThrowNullPointerException() throws Throwable  {
        DefaultKeyedValues defaultKeyedValues = ((DefaultKeyedValues) createInstance("org.jfree.data.DefaultKeyedValues"));
        
        /* This test fails because method [org.jfree.data.DefaultKeyedValues.rebuildIndex] produces [java.lang.NullPointerException]
            org.jfree.data.DefaultKeyedValues.rebuildIndex(DefaultKeyedValues.java:299) */
        Class defaultKeyedValuesClazz = Class.forName("org.jfree.data.DefaultKeyedValues");
        Method rebuildIndexMethod = defaultKeyedValuesClazz.getDeclaredMethod("rebuildIndex");
        rebuildIndexMethod.setAccessible(true);
        java.lang.Object[] rebuildIndexMethodArguments = new java.lang.Object[0];
        try {
            rebuildIndexMethod.invoke(defaultKeyedValues, rebuildIndexMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link DefaultKeyedValues}
 * @utbot.methodUnderTest {@link org.jfree.data.DefaultKeyedValues#rebuildIndex()}
 * @utbot.invokes {@link java.util.HashMap#clear()}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < this.keys.size(); i++)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(int i = 0; i < this.keys.size(); i++)
 *  */
    @Test
    public void testRebuildIndex_ThrowNullPointerException_1() throws Throwable  {
        DefaultKeyedValues defaultKeyedValues = ((DefaultKeyedValues) createInstance("org.jfree.data.DefaultKeyedValues"));
        HashMap indexMap = new HashMap();
        setField(defaultKeyedValues, "org.jfree.data.DefaultKeyedValues", "indexMap", indexMap);
        
        /* This test fails because method [org.jfree.data.DefaultKeyedValues.rebuildIndex] produces [java.lang.NullPointerException]
            org.jfree.data.DefaultKeyedValues.rebuildIndex(DefaultKeyedValues.java:300) */
        Class defaultKeyedValuesClazz = Class.forName("org.jfree.data.DefaultKeyedValues");
        Method rebuildIndexMethod = defaultKeyedValuesClazz.getDeclaredMethod("rebuildIndex");
        rebuildIndexMethod.setAccessible(true);
        java.lang.Object[] rebuildIndexMethodArguments = new java.lang.Object[0];
        try {
            rebuildIndexMethod.invoke(defaultKeyedValues, rebuildIndexMethodArguments);
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
        
                java.lang.reflect.Method methodForGetDeclaredFields798961588175700 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields798961588175700.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass798961588181400 = (java.lang.reflect.Field[]) methodForGetDeclaredFields798961588175700.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass798961588181400).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields798961590978500 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields798961590978500.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass798961590980200 = (java.lang.reflect.Field[]) methodForGetDeclaredFields798961590978500.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass798961590980200).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
    
    private static Object getUnsafeInstance() throws ClassNotFoundException, NoSuchFieldException, IllegalAccessException {
        java.lang.reflect.Field f = Class.forName("sun.misc.Unsafe").getDeclaredField("theUnsafe");
        f.setAccessible(true);
        return f.get(null);
    }
    ///endregion
}

