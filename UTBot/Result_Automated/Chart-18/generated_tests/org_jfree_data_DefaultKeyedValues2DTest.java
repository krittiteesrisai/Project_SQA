package org.jfree.data;

import org.junit.Test;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import org.jfree.data.xy.XYDataItem;
import java.lang.reflect.Method;
import org.jfree.data.time.SimpleTimePeriod;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.HashMap;
import java.time.LocalDateTime;
import java.time.YearMonth;
import org.jfree.chart.axis.DateTickUnit;
import java.lang.module.ModuleDescriptor.Opens;
import java.lang.module.ModuleDescriptor;
import java.time.chrono.MinguoDate;
import org.jfree.data.jdbc.JDBCCategoryDataset;
import org.jfree.data.gantt.TaskSeriesCollection;
import org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;
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

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public final class org_jfree_data_DefaultKeyedValues2DTest {
    ///region Test suites for executable org.jfree.data.DefaultKeyedValues2D.addValue
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method addValue(java.lang.Number, java.lang.Comparable, java.lang.Comparable)
    
    /**
     * @utbot.classUnderTest {@link org.jfree.data.DefaultKeyedValues2D}
     * @utbot.methodUnderTest {@link org.jfree.data.DefaultKeyedValues2D#addValue(java.lang.Number,java.lang.Comparable,java.lang.Comparable)}
     */
    @Test
    public void testAddValue() throws ClassNotFoundException, NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException  {
        DefaultKeyedValues2D defaultKeyedValues2D = new DefaultKeyedValues2D(true);
        Class xYDataItemClazz = Class.forName("org.jfree.data.xy.XYDataItem");
        Class numberType = Class.forName("java.lang.Number");
        Constructor xYDataItemConstructor = xYDataItemClazz.getDeclaredConstructor(numberType, numberType);
        xYDataItemConstructor.setAccessible(true);
        java.lang.Object[] xYDataItemConstructorArguments = new java.lang.Object[2];
        xYDataItemConstructorArguments[0] = java.lang.Double.POSITIVE_INFINITY;
        xYDataItemConstructorArguments[1] = java.lang.Double.NaN;
        XYDataItem xYDataItem = ((XYDataItem) xYDataItemConstructor.newInstance(xYDataItemConstructorArguments));
        Method setYMethod = xYDataItemClazz.getDeclaredMethod("setY", numberType);
        setYMethod.setAccessible(true);
        java.lang.Object[] setYMethodArguments = new java.lang.Object[1];
        setYMethodArguments[0] = java.lang.Float.NEGATIVE_INFINITY;
        setYMethod.invoke(xYDataItem, setYMethodArguments);
        SimpleTimePeriod simpleTimePeriod = new SimpleTimePeriod(java.lang.Long.MIN_VALUE, java.lang.Long.MAX_VALUE);
        
        Class defaultKeyedValues2DClazz = Class.forName("org.jfree.data.DefaultKeyedValues2D");
        Class xYDataItemType = Class.forName("java.lang.Comparable");
        Method addValueMethod = defaultKeyedValues2DClazz.getDeclaredMethod("addValue", numberType, xYDataItemType, xYDataItemType);
        addValueMethod.setAccessible(true);
        java.lang.Object[] addValueMethodArguments = new java.lang.Object[3];
        addValueMethodArguments[0] = (byte) -1;
        addValueMethodArguments[1] = xYDataItem;
        addValueMethodArguments[2] = simpleTimePeriod;
        addValueMethod.invoke(defaultKeyedValues2D, addValueMethodArguments);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.data.DefaultKeyedValues2D.getRowCount
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getRowCount()
    
    /**
    @utbot.classUnderTest {@link DefaultKeyedValues2D}
 * @utbot.methodUnderTest {@link org.jfree.data.DefaultKeyedValues2D#getRowCount()}
 * @utbot.invokes {@link java.util.List#size()}
 * @utbot.returnsFrom {@code return this.rowKeys.size();}
 *  */
    @Test
    public void testGetRowCount_ListSize() throws Exception  {
        DefaultKeyedValues2D defaultKeyedValues2D = ((DefaultKeyedValues2D) createInstance("org.jfree.data.DefaultKeyedValues2D"));
        ArrayList rowKeys = new ArrayList();
        rowKeys.add(null);
        rowKeys.add(null);
        rowKeys.add(null);
        setField(defaultKeyedValues2D, "org.jfree.data.DefaultKeyedValues2D", "rowKeys", rowKeys);
        
        int actual = defaultKeyedValues2D.getRowCount();
        
        assertEquals(3, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getRowCount()
    
    /**
    @utbot.classUnderTest {@link DefaultKeyedValues2D}
 * @utbot.methodUnderTest {@link org.jfree.data.DefaultKeyedValues2D#getRowCount()}
 * @utbot.invokes {@link java.util.List#size()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return this.rowKeys.size();
 *  */
    @Test
    public void testGetRowCount_ThrowNullPointerException() throws Exception  {
        DefaultKeyedValues2D defaultKeyedValues2D = ((DefaultKeyedValues2D) createInstance("org.jfree.data.DefaultKeyedValues2D"));
        
        /* This test fails because method [org.jfree.data.DefaultKeyedValues2D.getRowCount] produces [java.lang.NullPointerException]
            org.jfree.data.DefaultKeyedValues2D.getRowCount(DefaultKeyedValues2D.java:118) */
        defaultKeyedValues2D.getRowCount();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.data.DefaultKeyedValues2D.getColumnCount
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getColumnCount()
    
    /**
    @utbot.classUnderTest {@link DefaultKeyedValues2D}
 * @utbot.methodUnderTest {@link org.jfree.data.DefaultKeyedValues2D#getColumnCount()}
 * @utbot.invokes {@link java.util.List#size()}
 * @utbot.returnsFrom {@code return this.columnKeys.size();}
 *  */
    @Test
    public void testGetColumnCount_ListSize() throws Exception  {
        DefaultKeyedValues2D defaultKeyedValues2D = ((DefaultKeyedValues2D) createInstance("org.jfree.data.DefaultKeyedValues2D"));
        ArrayList columnKeys = new ArrayList();
        columnKeys.add(null);
        columnKeys.add(null);
        columnKeys.add(null);
        setField(defaultKeyedValues2D, "org.jfree.data.DefaultKeyedValues2D", "columnKeys", columnKeys);
        
        int actual = defaultKeyedValues2D.getColumnCount();
        
        assertEquals(3, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getColumnCount()
    
    /**
    @utbot.classUnderTest {@link DefaultKeyedValues2D}
 * @utbot.methodUnderTest {@link org.jfree.data.DefaultKeyedValues2D#getColumnCount()}
 * @utbot.invokes {@link java.util.List#size()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return this.columnKeys.size();
 *  */
    @Test
    public void testGetColumnCount_ThrowNullPointerException() throws Exception  {
        DefaultKeyedValues2D defaultKeyedValues2D = ((DefaultKeyedValues2D) createInstance("org.jfree.data.DefaultKeyedValues2D"));
        
        /* This test fails because method [org.jfree.data.DefaultKeyedValues2D.getColumnCount] produces [java.lang.NullPointerException]
            org.jfree.data.DefaultKeyedValues2D.getColumnCount(DefaultKeyedValues2D.java:129) */
        defaultKeyedValues2D.getColumnCount();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.data.DefaultKeyedValues2D.removeValue
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method removeValue(java.lang.Comparable, java.lang.Comparable)
    
    /**
    @utbot.classUnderTest {@link DefaultKeyedValues2D}
 * @utbot.methodUnderTest {@link org.jfree.data.DefaultKeyedValues2D#removeValue(java.lang.Comparable,java.lang.Comparable)}
 * @utbot.invokes {@link org.jfree.data.DefaultKeyedValues2D#setValue(java.lang.Number,java.lang.Comparable,java.lang.Comparable)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: setValue(null, rowKey, columnKey);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testRemoveValue_ThrowIllegalArgumentException() {
        DefaultKeyedValues2D defaultKeyedValues2D = new DefaultKeyedValues2D();
        
        defaultKeyedValues2D.removeValue(null, null);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method removeValue(java.lang.Comparable, java.lang.Comparable)
    
    /**
     * @utbot.classUnderTest {@link org.jfree.data.DefaultKeyedValues2D}
     * @utbot.methodUnderTest {@link org.jfree.data.DefaultKeyedValues2D#removeValue(java.lang.Comparable,java.lang.Comparable)}
     */
    @Test
    public void testRemoveValue() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        DefaultKeyedValues2D defaultKeyedValues2D = new DefaultKeyedValues2D(false);
        XYDataItem xYDataItem = new XYDataItem(0.0, java.lang.Double.POSITIVE_INFINITY);
        Class xYDataItemClazz = Class.forName("org.jfree.data.xy.XYDataItem");
        Class numberType = Class.forName("java.lang.Number");
        Method setYMethod = xYDataItemClazz.getDeclaredMethod("setY", numberType);
        setYMethod.setAccessible(true);
        java.lang.Object[] setYMethodArguments = new java.lang.Object[1];
        setYMethodArguments[0] = 0.0f;
        setYMethod.invoke(xYDataItem, setYMethodArguments);
        Date date = new Date(0, Integer.MIN_VALUE, Integer.MAX_VALUE);
        Date date1 = new Date(Integer.MIN_VALUE, 0, 0, 65, 0, -1);
        SimpleTimePeriod simpleTimePeriod = new SimpleTimePeriod(date, date1);
        
        defaultKeyedValues2D.removeValue(xYDataItem, simpleTimePeriod);
    }
    
    /**
     * @utbot.classUnderTest {@link org.jfree.data.DefaultKeyedValues2D}
     * @utbot.methodUnderTest {@link org.jfree.data.DefaultKeyedValues2D#removeValue(java.lang.Comparable,java.lang.Comparable)}
     */
    @Test
    public void testRemoveValue1() {
        DefaultKeyedValues2D defaultKeyedValues2D = new DefaultKeyedValues2D(false);
        Date date = new Date();
        SimpleTimePeriod simpleTimePeriod = new SimpleTimePeriod(date, date);
        Object object = new Object();
        ComparableObjectItem comparableObjectItem = new ComparableObjectItem(simpleTimePeriod, object);
        Date date1 = new Date(Integer.MIN_VALUE, 0, -1, -1, 0);
        SimpleTimePeriod simpleTimePeriod1 = new SimpleTimePeriod(date, date1);
        
        defaultKeyedValues2D.removeValue(comparableObjectItem, simpleTimePeriod1);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.data.DefaultKeyedValues2D.getRowKey
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getRowKey(int)
    
    /**
    @utbot.classUnderTest {@link DefaultKeyedValues2D}
 * @utbot.methodUnderTest {@link org.jfree.data.DefaultKeyedValues2D#getRowKey(int)}
 * @utbot.invokes {@link java.util.List#get(int)}
 * @utbot.returnsFrom {@code return (Comparable) this.rowKeys.get(row);}
 *  */
    @Test
    public void testGetRowKey_ListGet() throws Exception  {
        DefaultKeyedValues2D defaultKeyedValues2D = ((DefaultKeyedValues2D) createInstance("org.jfree.data.DefaultKeyedValues2D"));
        ArrayList rowKeys = new ArrayList();
        rowKeys.add(null);
        setField(defaultKeyedValues2D, "org.jfree.data.DefaultKeyedValues2D", "rowKeys", rowKeys);
        
        Comparable actual = defaultKeyedValues2D.getRowKey(0);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getRowKey(int)
    
    /**
    @utbot.classUnderTest {@link DefaultKeyedValues2D}
 * @utbot.methodUnderTest {@link org.jfree.data.DefaultKeyedValues2D#getRowKey(int)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: return (Comparable) this.rowKeys.get(row);
 *  */
    @Test
    public void testGetRowKey_ThrowClassCastException() throws Exception  {
        DefaultKeyedValues2D defaultKeyedValues2D = ((DefaultKeyedValues2D) createInstance("org.jfree.data.DefaultKeyedValues2D"));
        ArrayList rowKeys = new ArrayList();
        Object object = createInstance("java.lang.Object");
        rowKeys.add(object);
        setField(defaultKeyedValues2D, "org.jfree.data.DefaultKeyedValues2D", "rowKeys", rowKeys);
        
        /* This test fails because method [org.jfree.data.DefaultKeyedValues2D.getRowKey] produces [java.lang.ClassCastException: class java.lang.Object cannot be cast to class java.lang.Comparable (java.lang.Object and java.lang.Comparable are in module java.base of loader 'bootstrap')]
            org.jfree.data.DefaultKeyedValues2D.getRowKey(DefaultKeyedValues2D.java:168) */
        defaultKeyedValues2D.getRowKey(0);
    }
    
    /**
    @utbot.classUnderTest {@link DefaultKeyedValues2D}
 * @utbot.methodUnderTest {@link org.jfree.data.DefaultKeyedValues2D#getRowKey(int)}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: return (Comparable) this.rowKeys.get(row);
 *  */
    @Test
    public void testGetRowKey_ThrowIndexOutOfBoundsException() throws Exception  {
        DefaultKeyedValues2D defaultKeyedValues2D = ((DefaultKeyedValues2D) createInstance("org.jfree.data.DefaultKeyedValues2D"));
        ArrayList rowKeys = new ArrayList();
        rowKeys.add(null);
        rowKeys.add(null);
        rowKeys.add(null);
        setField(defaultKeyedValues2D, "org.jfree.data.DefaultKeyedValues2D", "rowKeys", rowKeys);
        
        /* This test fails because method [org.jfree.data.DefaultKeyedValues2D.getRowKey] produces [java.lang.IndexOutOfBoundsException: Index -1 out of bounds for length 3]
            java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
            java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
            java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:266)
            java.base/java.util.Objects.checkIndex(Objects.java:359)
            java.base/java.util.ArrayList.get(ArrayList.java:427)
            org.jfree.data.DefaultKeyedValues2D.getRowKey(DefaultKeyedValues2D.java:168) */
        defaultKeyedValues2D.getRowKey(-1);
    }
    
    /**
    @utbot.classUnderTest {@link DefaultKeyedValues2D}
 * @utbot.methodUnderTest {@link org.jfree.data.DefaultKeyedValues2D#getRowKey(int)}
 * @utbot.invokes {@link java.util.List#get(int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return (Comparable) this.rowKeys.get(row);
 *  */
    @Test
    public void testGetRowKey_ThrowNullPointerException() throws Exception  {
        DefaultKeyedValues2D defaultKeyedValues2D = ((DefaultKeyedValues2D) createInstance("org.jfree.data.DefaultKeyedValues2D"));
        
        /* This test fails because method [org.jfree.data.DefaultKeyedValues2D.getRowKey] produces [java.lang.NullPointerException]
            org.jfree.data.DefaultKeyedValues2D.getRowKey(DefaultKeyedValues2D.java:168) */
        defaultKeyedValues2D.getRowKey(-255);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.data.DefaultKeyedValues2D.getRowIndex
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getRowIndex(java.lang.Comparable)
    
    /**
    @utbot.classUnderTest {@link DefaultKeyedValues2D}
 * @utbot.methodUnderTest {@link org.jfree.data.DefaultKeyedValues2D#getRowIndex(java.lang.Comparable)}
 * @utbot.executesCondition {@code (key == null): False}
 * @utbot.executesCondition {@code (this.sortRowKeys): False}
 * @utbot.invokes {@link java.util.List#indexOf(java.lang.Object)}
 * @utbot.returnsFrom {@code return this.rowKeys.indexOf(key);}
 *  */
    @Test
    public void testGetRowIndex_NotThisSortRowKeys() throws Exception  {
        DefaultKeyedValues2D defaultKeyedValues2D = ((DefaultKeyedValues2D) createInstance("org.jfree.data.DefaultKeyedValues2D"));
        ArrayList rowKeys = new ArrayList();
        setField(defaultKeyedValues2D, "org.jfree.data.DefaultKeyedValues2D", "rowKeys", rowKeys);
        Integer integer = 0;
        
        int actual = defaultKeyedValues2D.getRowIndex(integer);
        
        assertEquals(-1, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method getRowIndex(java.lang.Comparable)
    
    /**
    @utbot.classUnderTest {@link DefaultKeyedValues2D}
 * @utbot.methodUnderTest {@link org.jfree.data.DefaultKeyedValues2D#getRowIndex(java.lang.Comparable)}
 * @utbot.executesCondition {@code (key == null): True}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: key == null
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testGetRowIndex_ThrowIllegalArgumentException() {
        DefaultKeyedValues2D defaultKeyedValues2D = new DefaultKeyedValues2D();
        
        defaultKeyedValues2D.getRowIndex(null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getRowIndex(java.lang.Comparable)
    
    /**
    @utbot.classUnderTest {@link DefaultKeyedValues2D}
 * @utbot.methodUnderTest {@link org.jfree.data.DefaultKeyedValues2D#getRowIndex(java.lang.Comparable)}
 * @utbot.executesCondition {@code (key == null): False}
 * @utbot.executesCondition {@code (this.sortRowKeys): False}
 * @utbot.invokes {@link java.util.List#indexOf(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return this.rowKeys.indexOf(key);
 *  */
    @Test
    public void testGetRowIndex_ThrowNullPointerException() throws Exception  {
        DefaultKeyedValues2D defaultKeyedValues2D = ((DefaultKeyedValues2D) createInstance("org.jfree.data.DefaultKeyedValues2D"));
        Integer integer = 0;
        
        /* This test fails because method [org.jfree.data.DefaultKeyedValues2D.getRowIndex] produces [java.lang.NullPointerException]
            org.jfree.data.DefaultKeyedValues2D.getRowIndex(DefaultKeyedValues2D.java:189) */
        defaultKeyedValues2D.getRowIndex(integer);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method getRowIndex(java.lang.Comparable)
    
    /**
     * @utbot.classUnderTest {@link org.jfree.data.DefaultKeyedValues2D}
     * @utbot.methodUnderTest {@link org.jfree.data.DefaultKeyedValues2D#getRowIndex(java.lang.Comparable)}
     */
    @Test
    public void testGetRowIndex() {
        DefaultKeyedValues2D defaultKeyedValues2D = new DefaultKeyedValues2D(true);
        Date date = new Date();
        SimpleTimePeriod simpleTimePeriod = new SimpleTimePeriod(date, date);
        Object object = new Object();
        ComparableObjectItem comparableObjectItem = new ComparableObjectItem(simpleTimePeriod, object);
        
        int actual = defaultKeyedValues2D.getRowIndex(comparableObjectItem);
        
        assertEquals(-1, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.data.DefaultKeyedValues2D.removeRow
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method removeRow(java.lang.Comparable)
    
    /**
    @utbot.classUnderTest {@link DefaultKeyedValues2D}
 * @utbot.methodUnderTest {@link org.jfree.data.DefaultKeyedValues2D#removeRow(java.lang.Comparable)}
 * @utbot.invokes {@link org.jfree.data.DefaultKeyedValues2D#getRowIndex(java.lang.Comparable)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: removeRow(getRowIndex(rowKey));
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testRemoveRow_ThrowIllegalArgumentException() {
        DefaultKeyedValues2D defaultKeyedValues2D = new DefaultKeyedValues2D();
        
        defaultKeyedValues2D.removeRow(((Comparable) null));
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method removeRow(java.lang.Comparable)
    
    /**
     * @utbot.classUnderTest {@link org.jfree.data.DefaultKeyedValues2D}
     * @utbot.methodUnderTest {@link org.jfree.data.DefaultKeyedValues2D#removeRow(java.lang.Comparable)}
     */
    @Test
    public void testRemoveRowThrowsIOOBE() {
        DefaultKeyedValues2D defaultKeyedValues2D = new DefaultKeyedValues2D(false);
        Date date = new Date();
        SimpleTimePeriod simpleTimePeriod = new SimpleTimePeriod(date, date);
        Object object = new Object();
        ComparableObjectItem comparableObjectItem = new ComparableObjectItem(simpleTimePeriod, object);
        
        /* This test fails because method [org.jfree.data.DefaultKeyedValues2D.removeRow] produces [java.lang.IndexOutOfBoundsException: Index -1 out of bounds for length 0]
            java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
            java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
            java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:266)
            java.base/java.util.Objects.checkIndex(Objects.java:359)
            java.base/java.util.ArrayList.remove(ArrayList.java:504)
            org.jfree.data.DefaultKeyedValues2D.removeRow(DefaultKeyedValues2D.java:412)
            org.jfree.data.DefaultKeyedValues2D.removeRow(DefaultKeyedValues2D.java:425) */
        defaultKeyedValues2D.removeRow(comparableObjectItem);
    }
    
    /**
     * @utbot.classUnderTest {@link org.jfree.data.DefaultKeyedValues2D}
     * @utbot.methodUnderTest {@link org.jfree.data.DefaultKeyedValues2D#removeRow(java.lang.Comparable)}
     */
    @Test
    public void testRemoveRowThrowsIOOBE1() {
        DefaultKeyedValues2D defaultKeyedValues2D = new DefaultKeyedValues2D(true);
        Date date = new Date();
        SimpleTimePeriod simpleTimePeriod = new SimpleTimePeriod(date, date);
        Object object = new Object();
        ComparableObjectItem comparableObjectItem = new ComparableObjectItem(simpleTimePeriod, object);
        
        /* This test fails because method [org.jfree.data.DefaultKeyedValues2D.removeRow] produces [java.lang.IndexOutOfBoundsException: Index -1 out of bounds for length 0]
            java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
            java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
            java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:266)
            java.base/java.util.Objects.checkIndex(Objects.java:359)
            java.base/java.util.ArrayList.remove(ArrayList.java:504)
            org.jfree.data.DefaultKeyedValues2D.removeRow(DefaultKeyedValues2D.java:412)
            org.jfree.data.DefaultKeyedValues2D.removeRow(DefaultKeyedValues2D.java:425) */
        defaultKeyedValues2D.removeRow(comparableObjectItem);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.data.DefaultKeyedValues2D.removeRow
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method removeRow(int)
    
    /**
    @utbot.classUnderTest {@link DefaultKeyedValues2D}
 * @utbot.methodUnderTest {@link org.jfree.data.DefaultKeyedValues2D#removeRow(int)}
 * @utbot.invokes {@link java.util.List#remove(int)}
 * @utbot.invokes {@link java.util.List#remove(int)}
 *  */
    @Test
    public void testRemoveRow_ListRemove() throws Exception  {
        DefaultKeyedValues2D defaultKeyedValues2D = ((DefaultKeyedValues2D) createInstance("org.jfree.data.DefaultKeyedValues2D"));
        ArrayList rowKeys = new ArrayList();
        rowKeys.add(null);
        rowKeys.add(null);
        rowKeys.add(null);
        setField(defaultKeyedValues2D, "org.jfree.data.DefaultKeyedValues2D", "rowKeys", rowKeys);
        setField(defaultKeyedValues2D, "org.jfree.data.DefaultKeyedValues2D", "rows", rowKeys);
        
        defaultKeyedValues2D.removeRow(0);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method removeRow(int)
    
    /**
    @utbot.classUnderTest {@link DefaultKeyedValues2D}
 * @utbot.methodUnderTest {@link org.jfree.data.DefaultKeyedValues2D#removeRow(int)}
 * @utbot.invokes {@link java.util.List#remove(int)}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: this.rows.remove(rowIndex);
 *  */
    @Test
    public void testRemoveRow_ThrowIndexOutOfBoundsException() throws Exception  {
        DefaultKeyedValues2D defaultKeyedValues2D = ((DefaultKeyedValues2D) createInstance("org.jfree.data.DefaultKeyedValues2D"));
        ArrayList rowKeys = new ArrayList();
        rowKeys.add(null);
        setField(defaultKeyedValues2D, "org.jfree.data.DefaultKeyedValues2D", "rowKeys", rowKeys);
        setField(defaultKeyedValues2D, "org.jfree.data.DefaultKeyedValues2D", "rows", rowKeys);
        
        /* This test fails because method [org.jfree.data.DefaultKeyedValues2D.removeRow] produces [java.lang.IndexOutOfBoundsException: Index 0 out of bounds for length 0]
            java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
            java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
            java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:266)
            java.base/java.util.Objects.checkIndex(Objects.java:359)
            java.base/java.util.ArrayList.remove(ArrayList.java:504)
            org.jfree.data.DefaultKeyedValues2D.removeRow(DefaultKeyedValues2D.java:413) */
        defaultKeyedValues2D.removeRow(0);
    }
    
    /**
    @utbot.classUnderTest {@link DefaultKeyedValues2D}
 * @utbot.methodUnderTest {@link org.jfree.data.DefaultKeyedValues2D#removeRow(int)}
 * @utbot.invokes {@link java.util.List#remove(int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: this.rowKeys.remove(rowIndex);
 *  */
    @Test
    public void testRemoveRow_ThrowNullPointerException() throws Exception  {
        DefaultKeyedValues2D defaultKeyedValues2D = ((DefaultKeyedValues2D) createInstance("org.jfree.data.DefaultKeyedValues2D"));
        
        /* This test fails because method [org.jfree.data.DefaultKeyedValues2D.removeRow] produces [java.lang.NullPointerException]
            org.jfree.data.DefaultKeyedValues2D.removeRow(DefaultKeyedValues2D.java:412) */
        defaultKeyedValues2D.removeRow(-255);
    }
    
    /**
    @utbot.classUnderTest {@link DefaultKeyedValues2D}
 * @utbot.methodUnderTest {@link org.jfree.data.DefaultKeyedValues2D#removeRow(int)}
 * @utbot.invokes {@link java.util.List#remove(int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: this.rows.remove(rowIndex);
 *  */
    @Test
    public void testRemoveRow_ThrowNullPointerException_1() throws Exception  {
        DefaultKeyedValues2D defaultKeyedValues2D = ((DefaultKeyedValues2D) createInstance("org.jfree.data.DefaultKeyedValues2D"));
        ArrayList rowKeys = new ArrayList();
        rowKeys.add(null);
        setField(defaultKeyedValues2D, "org.jfree.data.DefaultKeyedValues2D", "rowKeys", rowKeys);
        
        /* This test fails because method [org.jfree.data.DefaultKeyedValues2D.removeRow] produces [java.lang.NullPointerException]
            org.jfree.data.DefaultKeyedValues2D.removeRow(DefaultKeyedValues2D.java:413) */
        defaultKeyedValues2D.removeRow(0);
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method removeRow(int)
    
    /**
     * @utbot.classUnderTest {@link org.jfree.data.DefaultKeyedValues2D}
     * @utbot.methodUnderTest {@link org.jfree.data.DefaultKeyedValues2D#removeRow(int)}
     */
    @Test
    public void testRemoveRowThrowsIOOBE2() {
        DefaultKeyedValues2D defaultKeyedValues2D = new DefaultKeyedValues2D(true);
        
        /* This test fails because method [org.jfree.data.DefaultKeyedValues2D.removeRow] produces [java.lang.IndexOutOfBoundsException: Index -3 out of bounds for length 0]
            java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
            java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
            java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:266)
            java.base/java.util.Objects.checkIndex(Objects.java:359)
            java.base/java.util.ArrayList.remove(ArrayList.java:504)
            org.jfree.data.DefaultKeyedValues2D.removeRow(DefaultKeyedValues2D.java:412) */
        defaultKeyedValues2D.removeRow(-3);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.data.DefaultKeyedValues2D.getColumnKey
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getColumnKey(int)
    
    /**
    @utbot.classUnderTest {@link DefaultKeyedValues2D}
 * @utbot.methodUnderTest {@link org.jfree.data.DefaultKeyedValues2D#getColumnKey(int)}
 * @utbot.invokes {@link java.util.List#get(int)}
 * @utbot.returnsFrom {@code return (Comparable) this.columnKeys.get(column);}
 *  */
    @Test
    public void testGetColumnKey_ListGet() throws Exception  {
        DefaultKeyedValues2D defaultKeyedValues2D = ((DefaultKeyedValues2D) createInstance("org.jfree.data.DefaultKeyedValues2D"));
        ArrayList columnKeys = new ArrayList();
        columnKeys.add(null);
        setField(defaultKeyedValues2D, "org.jfree.data.DefaultKeyedValues2D", "columnKeys", columnKeys);
        
        Comparable actual = defaultKeyedValues2D.getColumnKey(0);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getColumnKey(int)
    
    /**
    @utbot.classUnderTest {@link DefaultKeyedValues2D}
 * @utbot.methodUnderTest {@link org.jfree.data.DefaultKeyedValues2D#getColumnKey(int)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: return (Comparable) this.columnKeys.get(column);
 *  */
    @Test
    public void testGetColumnKey_ThrowClassCastException() throws Exception  {
        DefaultKeyedValues2D defaultKeyedValues2D = ((DefaultKeyedValues2D) createInstance("org.jfree.data.DefaultKeyedValues2D"));
        ArrayList columnKeys = new ArrayList();
        Object object = createInstance("java.lang.Object");
        columnKeys.add(object);
        setField(defaultKeyedValues2D, "org.jfree.data.DefaultKeyedValues2D", "columnKeys", columnKeys);
        
        /* This test fails because method [org.jfree.data.DefaultKeyedValues2D.getColumnKey] produces [java.lang.ClassCastException: class java.lang.Object cannot be cast to class java.lang.Comparable (java.lang.Object and java.lang.Comparable are in module java.base of loader 'bootstrap')]
            org.jfree.data.DefaultKeyedValues2D.getColumnKey(DefaultKeyedValues2D.java:216) */
        defaultKeyedValues2D.getColumnKey(0);
    }
    
    /**
    @utbot.classUnderTest {@link DefaultKeyedValues2D}
 * @utbot.methodUnderTest {@link org.jfree.data.DefaultKeyedValues2D#getColumnKey(int)}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: return (Comparable) this.columnKeys.get(column);
 *  */
    @Test
    public void testGetColumnKey_ThrowIndexOutOfBoundsException() throws Exception  {
        DefaultKeyedValues2D defaultKeyedValues2D = ((DefaultKeyedValues2D) createInstance("org.jfree.data.DefaultKeyedValues2D"));
        ArrayList columnKeys = new ArrayList();
        columnKeys.add(null);
        columnKeys.add(null);
        columnKeys.add(null);
        setField(defaultKeyedValues2D, "org.jfree.data.DefaultKeyedValues2D", "columnKeys", columnKeys);
        
        /* This test fails because method [org.jfree.data.DefaultKeyedValues2D.getColumnKey] produces [java.lang.IndexOutOfBoundsException: Index -1 out of bounds for length 3]
            java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
            java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
            java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:266)
            java.base/java.util.Objects.checkIndex(Objects.java:359)
            java.base/java.util.ArrayList.get(ArrayList.java:427)
            org.jfree.data.DefaultKeyedValues2D.getColumnKey(DefaultKeyedValues2D.java:216) */
        defaultKeyedValues2D.getColumnKey(-1);
    }
    
    /**
    @utbot.classUnderTest {@link DefaultKeyedValues2D}
 * @utbot.methodUnderTest {@link org.jfree.data.DefaultKeyedValues2D#getColumnKey(int)}
 * @utbot.invokes {@link java.util.List#get(int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return (Comparable) this.columnKeys.get(column);
 *  */
    @Test
    public void testGetColumnKey_ThrowNullPointerException() throws Exception  {
        DefaultKeyedValues2D defaultKeyedValues2D = ((DefaultKeyedValues2D) createInstance("org.jfree.data.DefaultKeyedValues2D"));
        
        /* This test fails because method [org.jfree.data.DefaultKeyedValues2D.getColumnKey] produces [java.lang.NullPointerException]
            org.jfree.data.DefaultKeyedValues2D.getColumnKey(DefaultKeyedValues2D.java:216) */
        defaultKeyedValues2D.getColumnKey(-255);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.data.DefaultKeyedValues2D.getRowKeys
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getRowKeys()
    
    /**
    @utbot.classUnderTest {@link DefaultKeyedValues2D}
 * @utbot.methodUnderTest {@link org.jfree.data.DefaultKeyedValues2D#getRowKeys()}
 * @utbot.invokes {@link java.util.Collections#unmodifiableList(java.util.List)}
 * @utbot.returnsFrom {@code return Collections.unmodifiableList(this.rowKeys);}
 *  */
    @Test
    public void testGetRowKeys_CollectionsUnmodifiableList() throws Exception  {
        DefaultKeyedValues2D defaultKeyedValues2D = ((DefaultKeyedValues2D) createInstance("org.jfree.data.DefaultKeyedValues2D"));
        ArrayList rowKeys = new ArrayList();
        setField(defaultKeyedValues2D, "org.jfree.data.DefaultKeyedValues2D", "rowKeys", rowKeys);
        
        List actual = defaultKeyedValues2D.getRowKeys();
        
        List expected = new ArrayList();
        
        assertTrue(deepEquals(expected, actual));
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.data.DefaultKeyedValues2D.getColumnIndex
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getColumnIndex(java.lang.Comparable)
    
    /**
    @utbot.classUnderTest {@link DefaultKeyedValues2D}
 * @utbot.methodUnderTest {@link org.jfree.data.DefaultKeyedValues2D#getColumnIndex(java.lang.Comparable)}
 * @utbot.executesCondition {@code (key == null): False}
 * @utbot.invokes {@link java.util.List#indexOf(java.lang.Object)}
 * @utbot.returnsFrom {@code return this.columnKeys.indexOf(key);}
 *  */
    @Test
    public void testGetColumnIndex_KeyNotEqualsNull() throws Exception  {
        DefaultKeyedValues2D defaultKeyedValues2D = ((DefaultKeyedValues2D) createInstance("org.jfree.data.DefaultKeyedValues2D"));
        ArrayList columnKeys = new ArrayList();
        setField(defaultKeyedValues2D, "org.jfree.data.DefaultKeyedValues2D", "columnKeys", columnKeys);
        Integer integer = 0;
        
        int actual = defaultKeyedValues2D.getColumnIndex(integer);
        
        assertEquals(-1, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method getColumnIndex(java.lang.Comparable)
    
    /**
    @utbot.classUnderTest {@link DefaultKeyedValues2D}
 * @utbot.methodUnderTest {@link org.jfree.data.DefaultKeyedValues2D#getColumnIndex(java.lang.Comparable)}
 * @utbot.executesCondition {@code (key == null): True}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: key == null
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testGetColumnIndex_ThrowIllegalArgumentException() {
        DefaultKeyedValues2D defaultKeyedValues2D = new DefaultKeyedValues2D();
        
        defaultKeyedValues2D.getColumnIndex(null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getColumnIndex(java.lang.Comparable)
    
    /**
    @utbot.classUnderTest {@link DefaultKeyedValues2D}
 * @utbot.methodUnderTest {@link org.jfree.data.DefaultKeyedValues2D#getColumnIndex(java.lang.Comparable)}
 * @utbot.executesCondition {@code (key == null): False}
 * @utbot.invokes {@link java.util.List#indexOf(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return this.columnKeys.indexOf(key);
 *  */
    @Test
    public void testGetColumnIndex_ThrowNullPointerException() throws Exception  {
        DefaultKeyedValues2D defaultKeyedValues2D = ((DefaultKeyedValues2D) createInstance("org.jfree.data.DefaultKeyedValues2D"));
        Integer integer = 0;
        
        /* This test fails because method [org.jfree.data.DefaultKeyedValues2D.getColumnIndex] produces [java.lang.NullPointerException]
            org.jfree.data.DefaultKeyedValues2D.getColumnIndex(DefaultKeyedValues2D.java:233) */
        defaultKeyedValues2D.getColumnIndex(integer);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.data.DefaultKeyedValues2D.getColumnKeys
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getColumnKeys()
    
    /**
    @utbot.classUnderTest {@link DefaultKeyedValues2D}
 * @utbot.methodUnderTest {@link org.jfree.data.DefaultKeyedValues2D#getColumnKeys()}
 * @utbot.invokes {@link java.util.Collections#unmodifiableList(java.util.List)}
 * @utbot.returnsFrom {@code return Collections.unmodifiableList(this.columnKeys);}
 *  */
    @Test
    public void testGetColumnKeys_CollectionsUnmodifiableList() throws Exception  {
        DefaultKeyedValues2D defaultKeyedValues2D = ((DefaultKeyedValues2D) createInstance("org.jfree.data.DefaultKeyedValues2D"));
        ArrayList columnKeys = new ArrayList();
        setField(defaultKeyedValues2D, "org.jfree.data.DefaultKeyedValues2D", "columnKeys", columnKeys);
        
        List actual = defaultKeyedValues2D.getColumnKeys();
        
        List expected = new ArrayList();
        
        assertTrue(deepEquals(expected, actual));
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.data.DefaultKeyedValues2D.removeColumn
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method removeColumn(java.lang.Comparable)
    
    /**
    @utbot.classUnderTest {@link DefaultKeyedValues2D}
 * @utbot.methodUnderTest {@link org.jfree.data.DefaultKeyedValues2D#removeColumn(java.lang.Comparable)}
 * @utbot.invokes {@link java.util.List#iterator()}
 * @utbot.invokes {@link java.util.List#remove(java.lang.Object)}
 *  */
    @Test
    public void testRemoveColumn_IteratorHasNext() throws Exception  {
        DefaultKeyedValues2D defaultKeyedValues2D = ((DefaultKeyedValues2D) createInstance("org.jfree.data.DefaultKeyedValues2D"));
        ArrayList columnKeys = new ArrayList();
        setField(defaultKeyedValues2D, "org.jfree.data.DefaultKeyedValues2D", "columnKeys", columnKeys);
        setField(defaultKeyedValues2D, "org.jfree.data.DefaultKeyedValues2D", "rows", columnKeys);
        Integer integer = 0;
        
        defaultKeyedValues2D.removeColumn(((Comparable) integer));
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method removeColumn(java.lang.Comparable)
    
    /**
    @utbot.classUnderTest {@link DefaultKeyedValues2D}
 * @utbot.methodUnderTest {@link org.jfree.data.DefaultKeyedValues2D#removeColumn(java.lang.Comparable)}
 * @utbot.iterates iterate the loop {@code while(iterator.hasNext())} once
 * @utbot.throwsException {@link java.lang.ClassCastException} in: DefaultKeyedValues rowData = (DefaultKeyedValues) iterator.next();
 *  */
    @Test
    public void testRemoveColumn_ThrowClassCastException() throws Exception  {
        DefaultKeyedValues2D defaultKeyedValues2D = ((DefaultKeyedValues2D) createInstance("org.jfree.data.DefaultKeyedValues2D"));
        ArrayList rows = new ArrayList();
        Object object = createInstance("java.lang.Object");
        rows.add(object);
        rows.add(null);
        rows.add(null);
        rows.add(null);
        rows.add(null);
        rows.add(null);
        rows.add(null);
        rows.add(null);
        rows.add(null);
        rows.add(null);
        setField(defaultKeyedValues2D, "org.jfree.data.DefaultKeyedValues2D", "rows", rows);
        
        /* This test fails because method [org.jfree.data.DefaultKeyedValues2D.removeColumn] produces [java.lang.ClassCastException: class java.lang.Object cannot be cast to class org.jfree.data.DefaultKeyedValues (java.lang.Object is in module java.base of loader 'bootstrap'; org.jfree.data.DefaultKeyedValues is in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @60349b9b)]
            org.jfree.data.DefaultKeyedValues2D.removeColumn(DefaultKeyedValues2D.java:457) */
        defaultKeyedValues2D.removeColumn(((Comparable) null));
    }
    
    /**
    @utbot.classUnderTest {@link DefaultKeyedValues2D}
 * @utbot.methodUnderTest {@link org.jfree.data.DefaultKeyedValues2D#removeColumn(java.lang.Comparable)}
 * @utbot.iterates iterate the loop {@code while(iterator.hasNext())} once
 * @utbot.throwsException {@link java.lang.ClassCastException} in: rowData.removeValue(columnKey);
 *  */
    @Test
    public void testRemoveColumn_ThrowClassCastException_1() throws Exception  {
        DefaultKeyedValues2D defaultKeyedValues2D = ((DefaultKeyedValues2D) createInstance("org.jfree.data.DefaultKeyedValues2D"));
        ArrayList rows = new ArrayList();
        DefaultKeyedValues defaultKeyedValues = ((DefaultKeyedValues) createInstance("org.jfree.data.DefaultKeyedValues"));
        HashMap indexMap = new HashMap();
        Integer integer = 0;
        short[] shortArray = {};
        indexMap.put(integer, shortArray);
        setField(defaultKeyedValues, "org.jfree.data.DefaultKeyedValues", "indexMap", indexMap);
        rows.add(defaultKeyedValues);
        rows.add(null);
        rows.add(null);
        rows.add(null);
        rows.add(null);
        rows.add(null);
        rows.add(null);
        rows.add(null);
        rows.add(null);
        rows.add(null);
        setField(defaultKeyedValues2D, "org.jfree.data.DefaultKeyedValues2D", "rows", rows);
        
        /* This test fails because method [org.jfree.data.DefaultKeyedValues2D.removeColumn] produces [java.lang.ClassCastException: class [S cannot be cast to class java.lang.Integer ([S and java.lang.Integer are in module java.base of loader 'bootstrap')]
            org.jfree.data.DefaultKeyedValues.getIndex(DefaultKeyedValues.java:153)
            org.jfree.data.DefaultKeyedValues.removeValue(DefaultKeyedValues.java:333)
            org.jfree.data.DefaultKeyedValues2D.removeColumn(DefaultKeyedValues2D.java:458) */
        defaultKeyedValues2D.removeColumn(((Comparable) integer));
    }
    
    /**
    @utbot.classUnderTest {@link DefaultKeyedValues2D}
 * @utbot.methodUnderTest {@link org.jfree.data.DefaultKeyedValues2D#removeColumn(java.lang.Comparable)}
 * @utbot.invokes {@link java.util.List#iterator()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Iterator iterator = this.rows.iterator();
 *  */
    @Test
    public void testRemoveColumn_ThrowNullPointerException() throws Exception  {
        DefaultKeyedValues2D defaultKeyedValues2D = ((DefaultKeyedValues2D) createInstance("org.jfree.data.DefaultKeyedValues2D"));
        
        /* This test fails because method [org.jfree.data.DefaultKeyedValues2D.removeColumn] produces [java.lang.NullPointerException]
            org.jfree.data.DefaultKeyedValues2D.removeColumn(DefaultKeyedValues2D.java:455) */
        defaultKeyedValues2D.removeColumn(((Comparable) null));
    }
    
    /**
    @utbot.classUnderTest {@link DefaultKeyedValues2D}
 * @utbot.methodUnderTest {@link org.jfree.data.DefaultKeyedValues2D#removeColumn(java.lang.Comparable)}
 * @utbot.invokes {@link java.util.List#remove(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: this.columnKeys.remove(columnKey);
 *  */
    @Test
    public void testRemoveColumn_ThrowNullPointerException_1() throws Exception  {
        DefaultKeyedValues2D defaultKeyedValues2D = ((DefaultKeyedValues2D) createInstance("org.jfree.data.DefaultKeyedValues2D"));
        ArrayList rows = new ArrayList();
        setField(defaultKeyedValues2D, "org.jfree.data.DefaultKeyedValues2D", "rows", rows);
        
        /* This test fails because method [org.jfree.data.DefaultKeyedValues2D.removeColumn] produces [java.lang.NullPointerException]
            org.jfree.data.DefaultKeyedValues2D.removeColumn(DefaultKeyedValues2D.java:460) */
        defaultKeyedValues2D.removeColumn(((Comparable) null));
    }
    
    /**
    @utbot.classUnderTest {@link DefaultKeyedValues2D}
 * @utbot.methodUnderTest {@link org.jfree.data.DefaultKeyedValues2D#removeColumn(java.lang.Comparable)}
 * @utbot.iterates iterate the loop {@code while(iterator.hasNext())} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: rowData.removeValue(columnKey);
 *  */
    @Test
    public void testRemoveColumn_ThrowNullPointerException_2() throws Exception  {
        DefaultKeyedValues2D defaultKeyedValues2D = ((DefaultKeyedValues2D) createInstance("org.jfree.data.DefaultKeyedValues2D"));
        ArrayList rows = new ArrayList();
        rows.add(null);
        rows.add(null);
        rows.add(null);
        rows.add(null);
        rows.add(null);
        rows.add(null);
        rows.add(null);
        rows.add(null);
        rows.add(null);
        rows.add(null);
        setField(defaultKeyedValues2D, "org.jfree.data.DefaultKeyedValues2D", "rows", rows);
        
        /* This test fails because method [org.jfree.data.DefaultKeyedValues2D.removeColumn] produces [java.lang.NullPointerException]
            org.jfree.data.DefaultKeyedValues2D.removeColumn(DefaultKeyedValues2D.java:458) */
        defaultKeyedValues2D.removeColumn(((Comparable) null));
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method removeColumn(java.lang.Comparable)
    
    /**
    @utbot.classUnderTest {@link DefaultKeyedValues2D}
 * @utbot.methodUnderTest {@link org.jfree.data.DefaultKeyedValues2D#removeColumn(java.lang.Comparable)}
 * @utbot.invokes {@link java.util.List#iterator()}
 * @utbot.iterates iterate the loop {@code while(iterator.hasNext())} once
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: rowData.removeValue(columnKey);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testRemoveColumn_ThrowIllegalArgumentException() throws Exception  {
        DefaultKeyedValues2D defaultKeyedValues2D = ((DefaultKeyedValues2D) createInstance("org.jfree.data.DefaultKeyedValues2D"));
        ArrayList rows = new ArrayList();
        DefaultKeyedValues defaultKeyedValues = ((DefaultKeyedValues) createInstance("org.jfree.data.DefaultKeyedValues"));
        rows.add(defaultKeyedValues);
        rows.add(null);
        rows.add(null);
        rows.add(null);
        rows.add(null);
        rows.add(null);
        rows.add(null);
        rows.add(null);
        rows.add(null);
        rows.add(null);
        setField(defaultKeyedValues2D, "org.jfree.data.DefaultKeyedValues2D", "rows", rows);
        
        defaultKeyedValues2D.removeColumn(((Comparable) null));
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method removeColumn(java.lang.Comparable)
    
    @Test
    public void testRemoveColumn1() throws Exception  {
        DefaultKeyedValues2D defaultKeyedValues2D = ((DefaultKeyedValues2D) createInstance("org.jfree.data.DefaultKeyedValues2D"));
        ArrayList rows = new ArrayList();
        DefaultKeyedValues defaultKeyedValues = ((DefaultKeyedValues) createInstance("org.jfree.data.DefaultKeyedValues"));
        ArrayList keys = new ArrayList();
        setField(defaultKeyedValues, "org.jfree.data.DefaultKeyedValues", "keys", keys);
        HashMap indexMap = new HashMap();
        Integer integer = 0;
        indexMap.put(integer, integer);
        setField(defaultKeyedValues, "org.jfree.data.DefaultKeyedValues", "indexMap", indexMap);
        rows.add(defaultKeyedValues);
        ArrayList arrayList = new ArrayList();
        rows.add(arrayList);
        rows.add(arrayList);
        setField(defaultKeyedValues2D, "org.jfree.data.DefaultKeyedValues2D", "rows", rows);
        
        /* This test fails because method [org.jfree.data.DefaultKeyedValues2D.removeColumn] produces [java.lang.IndexOutOfBoundsException: Index 0 out of bounds for length 0]
            java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
            java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
            java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:266)
            java.base/java.util.Objects.checkIndex(Objects.java:359)
            java.base/java.util.ArrayList.remove(ArrayList.java:504)
            org.jfree.data.DefaultKeyedValues.removeValue(DefaultKeyedValues.java:316)
            org.jfree.data.DefaultKeyedValues.removeValue(DefaultKeyedValues.java:337)
            org.jfree.data.DefaultKeyedValues2D.removeColumn(DefaultKeyedValues2D.java:458) */
        defaultKeyedValues2D.removeColumn(((Comparable) integer));
    }
    
    @Test
    public void testRemoveColumn2() throws Exception  {
        DefaultKeyedValues2D defaultKeyedValues2D = ((DefaultKeyedValues2D) createInstance("org.jfree.data.DefaultKeyedValues2D"));
        ArrayList rows = new ArrayList();
        DefaultKeyedValues defaultKeyedValues = ((DefaultKeyedValues) createInstance("org.jfree.data.DefaultKeyedValues"));
        HashMap indexMap = new HashMap();
        Integer integer = 1;
        Object object = createInstance("java.lang.Object");
        indexMap.put(integer, object);
        Integer integer1 = 0;
        indexMap.put(integer1, null);
        setField(defaultKeyedValues, "org.jfree.data.DefaultKeyedValues", "indexMap", indexMap);
        rows.add(defaultKeyedValues);
        rows.add(object);
        ArrayList arrayList = new ArrayList();
        rows.add(arrayList);
        setField(defaultKeyedValues2D, "org.jfree.data.DefaultKeyedValues2D", "rows", rows);
        LocalDateTime localDateTime = ((LocalDateTime) createInstance("java.time.LocalDateTime"));
        
        /* This test fails because method [org.jfree.data.DefaultKeyedValues2D.removeColumn] produces [java.lang.NullPointerException]
            java.base/java.time.LocalDateTime.hashCode(LocalDateTime.java:1942)
            java.base/java.util.HashMap.hash(HashMap.java:338)
            java.base/java.util.HashMap.getNode(HashMap.java:568)
            java.base/java.util.HashMap.get(HashMap.java:556)
            org.jfree.data.DefaultKeyedValues.getIndex(DefaultKeyedValues.java:153)
            org.jfree.data.DefaultKeyedValues.removeValue(DefaultKeyedValues.java:333)
            org.jfree.data.DefaultKeyedValues2D.removeColumn(DefaultKeyedValues2D.java:458) */
        defaultKeyedValues2D.removeColumn(localDateTime);
    }
    ///endregion
    
    ///region Errors report for removeColumn
    
    public void testRemoveColumn_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.data.DefaultKeyedValues2D.removeColumn
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method removeColumn(int)
    
    /**
    @utbot.classUnderTest {@link DefaultKeyedValues2D}
 * @utbot.methodUnderTest {@link org.jfree.data.DefaultKeyedValues2D#removeColumn(int)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: Comparable columnKey = getColumnKey(columnIndex);
 *  */
    @Test
    public void testRemoveColumn_ThrowClassCastException1() throws Exception  {
        DefaultKeyedValues2D defaultKeyedValues2D = ((DefaultKeyedValues2D) createInstance("org.jfree.data.DefaultKeyedValues2D"));
        ArrayList columnKeys = new ArrayList();
        Object object = createInstance("java.lang.Object");
        columnKeys.add(object);
        setField(defaultKeyedValues2D, "org.jfree.data.DefaultKeyedValues2D", "columnKeys", columnKeys);
        
        /* This test fails because method [org.jfree.data.DefaultKeyedValues2D.removeColumn] produces [java.lang.ClassCastException: class java.lang.Object cannot be cast to class java.lang.Comparable (java.lang.Object and java.lang.Comparable are in module java.base of loader 'bootstrap')]
            org.jfree.data.DefaultKeyedValues2D.getColumnKey(DefaultKeyedValues2D.java:216)
            org.jfree.data.DefaultKeyedValues2D.removeColumn(DefaultKeyedValues2D.java:437) */
        defaultKeyedValues2D.removeColumn(0);
    }
    
    /**
    @utbot.classUnderTest {@link DefaultKeyedValues2D}
 * @utbot.methodUnderTest {@link org.jfree.data.DefaultKeyedValues2D#removeColumn(int)}
 * @utbot.invokes {@link org.jfree.data.DefaultKeyedValues2D#removeColumn(java.lang.Comparable)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: removeColumn(columnKey);
 *  */
    @Test
    public void testRemoveColumn_ThrowClassCastException_11() throws Exception  {
        DefaultKeyedValues2D defaultKeyedValues2D = ((DefaultKeyedValues2D) createInstance("org.jfree.data.DefaultKeyedValues2D"));
        ArrayList columnKeys = new ArrayList();
        Object object = createInstance("java.lang.Object");
        columnKeys.add(object);
        columnKeys.add(null);
        columnKeys.add(null);
        setField(defaultKeyedValues2D, "org.jfree.data.DefaultKeyedValues2D", "columnKeys", columnKeys);
        setField(defaultKeyedValues2D, "org.jfree.data.DefaultKeyedValues2D", "rows", columnKeys);
        
        /* This test fails because method [org.jfree.data.DefaultKeyedValues2D.removeColumn] produces [java.lang.ClassCastException: class java.lang.Object cannot be cast to class org.jfree.data.DefaultKeyedValues (java.lang.Object is in module java.base of loader 'bootstrap'; org.jfree.data.DefaultKeyedValues is in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @60349b9b)]
            org.jfree.data.DefaultKeyedValues2D.removeColumn(DefaultKeyedValues2D.java:457)
            org.jfree.data.DefaultKeyedValues2D.removeColumn(DefaultKeyedValues2D.java:438) */
        defaultKeyedValues2D.removeColumn(2);
    }
    
    /**
    @utbot.classUnderTest {@link DefaultKeyedValues2D}
 * @utbot.methodUnderTest {@link org.jfree.data.DefaultKeyedValues2D#removeColumn(int)}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: Comparable columnKey = getColumnKey(columnIndex);
 *  */
    @Test
    public void testRemoveColumn_ThrowIndexOutOfBoundsException() throws Exception  {
        DefaultKeyedValues2D defaultKeyedValues2D = ((DefaultKeyedValues2D) createInstance("org.jfree.data.DefaultKeyedValues2D"));
        ArrayList columnKeys = new ArrayList();
        columnKeys.add(null);
        columnKeys.add(null);
        columnKeys.add(null);
        setField(defaultKeyedValues2D, "org.jfree.data.DefaultKeyedValues2D", "columnKeys", columnKeys);
        
        /* This test fails because method [org.jfree.data.DefaultKeyedValues2D.removeColumn] produces [java.lang.IndexOutOfBoundsException: Index -1 out of bounds for length 3]
            java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
            java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
            java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:266)
            java.base/java.util.Objects.checkIndex(Objects.java:359)
            java.base/java.util.ArrayList.get(ArrayList.java:427)
            org.jfree.data.DefaultKeyedValues2D.getColumnKey(DefaultKeyedValues2D.java:216)
            org.jfree.data.DefaultKeyedValues2D.removeColumn(DefaultKeyedValues2D.java:437) */
        defaultKeyedValues2D.removeColumn(-1);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method removeColumn(int)
    
    /**
    @utbot.classUnderTest {@link DefaultKeyedValues2D}
 * @utbot.methodUnderTest {@link org.jfree.data.DefaultKeyedValues2D#removeColumn(int)}
 * @utbot.invokes {@link org.jfree.data.DefaultKeyedValues2D#getColumnKey(int)}
 * @utbot.invokes {@link org.jfree.data.DefaultKeyedValues2D#removeColumn(java.lang.Comparable)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: removeColumn(columnKey);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testRemoveColumn_ThrowIllegalArgumentException1() throws Exception  {
        DefaultKeyedValues2D defaultKeyedValues2D = ((DefaultKeyedValues2D) createInstance("org.jfree.data.DefaultKeyedValues2D"));
        ArrayList columnKeys = new ArrayList();
        DefaultKeyedValues defaultKeyedValues = ((DefaultKeyedValues) createInstance("org.jfree.data.DefaultKeyedValues"));
        columnKeys.add(defaultKeyedValues);
        columnKeys.add(null);
        columnKeys.add(null);
        columnKeys.add(null);
        columnKeys.add(null);
        columnKeys.add(null);
        columnKeys.add(null);
        columnKeys.add(null);
        columnKeys.add(null);
        columnKeys.add(null);
        setField(defaultKeyedValues2D, "org.jfree.data.DefaultKeyedValues2D", "columnKeys", columnKeys);
        setField(defaultKeyedValues2D, "org.jfree.data.DefaultKeyedValues2D", "rows", columnKeys);
        
        defaultKeyedValues2D.removeColumn(9);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method removeColumn(int)
    
    @Test
    public void testRemoveColumn3() throws Exception  {
        DefaultKeyedValues2D defaultKeyedValues2D = ((DefaultKeyedValues2D) createInstance("org.jfree.data.DefaultKeyedValues2D"));
        ArrayList columnKeys = new ArrayList();
        DefaultKeyedValues defaultKeyedValues = ((DefaultKeyedValues) createInstance("org.jfree.data.DefaultKeyedValues"));
        HashMap indexMap = new HashMap();
        Integer integer = 0;
        Object object = createInstance("java.lang.Object");
        indexMap.put(integer, object);
        Integer integer1 = 0;
        indexMap.put(integer1, null);
        setField(defaultKeyedValues, "org.jfree.data.DefaultKeyedValues", "indexMap", indexMap);
        columnKeys.add(defaultKeyedValues);
        columnKeys.add(object);
        YearMonth yearMonth = ((YearMonth) createInstance("java.time.YearMonth"));
        columnKeys.add(yearMonth);
        setField(defaultKeyedValues2D, "org.jfree.data.DefaultKeyedValues2D", "columnKeys", columnKeys);
        setField(defaultKeyedValues2D, "org.jfree.data.DefaultKeyedValues2D", "rows", columnKeys);
        
        /* This test fails because method [org.jfree.data.DefaultKeyedValues2D.removeColumn] produces [java.lang.ClassCastException: class java.lang.Object cannot be cast to class org.jfree.data.DefaultKeyedValues (java.lang.Object is in module java.base of loader 'bootstrap'; org.jfree.data.DefaultKeyedValues is in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @60349b9b)]
            org.jfree.data.DefaultKeyedValues2D.removeColumn(DefaultKeyedValues2D.java:457)
            org.jfree.data.DefaultKeyedValues2D.removeColumn(DefaultKeyedValues2D.java:438) */
        defaultKeyedValues2D.removeColumn(2);
    }
    
    @Test
    public void testRemoveColumn4() throws Exception  {
        DefaultKeyedValues2D defaultKeyedValues2D = ((DefaultKeyedValues2D) createInstance("org.jfree.data.DefaultKeyedValues2D"));
        ArrayList columnKeys = new ArrayList();
        DefaultKeyedValues defaultKeyedValues = ((DefaultKeyedValues) createInstance("org.jfree.data.DefaultKeyedValues"));
        HashMap indexMap = new HashMap();
        setField(defaultKeyedValues, "org.jfree.data.DefaultKeyedValues", "indexMap", indexMap);
        columnKeys.add(defaultKeyedValues);
        columnKeys.add(null);
        DateTickUnit dateTickUnit = ((DateTickUnit) createInstance("org.jfree.chart.axis.DateTickUnit"));
        columnKeys.add(dateTickUnit);
        setField(defaultKeyedValues2D, "org.jfree.data.DefaultKeyedValues2D", "columnKeys", columnKeys);
        setField(defaultKeyedValues2D, "org.jfree.data.DefaultKeyedValues2D", "rows", columnKeys);
        
        /* This test fails because method [org.jfree.data.DefaultKeyedValues2D.removeColumn] produces [java.lang.NullPointerException]
            org.jfree.data.DefaultKeyedValues2D.removeColumn(DefaultKeyedValues2D.java:458)
            org.jfree.data.DefaultKeyedValues2D.removeColumn(DefaultKeyedValues2D.java:438) */
        defaultKeyedValues2D.removeColumn(2);
    }
    
    @Test
    public void testRemoveColumn5() throws Exception  {
        DefaultKeyedValues2D defaultKeyedValues2D = ((DefaultKeyedValues2D) createInstance("org.jfree.data.DefaultKeyedValues2D"));
        ArrayList columnKeys = new ArrayList();
        DefaultKeyedValues defaultKeyedValues = ((DefaultKeyedValues) createInstance("org.jfree.data.DefaultKeyedValues"));
        HashMap indexMap = new HashMap();
        Integer integer = 0;
        Object object = createInstance("java.lang.Object");
        indexMap.put(integer, object);
        setField(defaultKeyedValues, "org.jfree.data.DefaultKeyedValues", "indexMap", indexMap);
        columnKeys.add(defaultKeyedValues);
        ModuleDescriptor.Opens opens = ((ModuleDescriptor.Opens) createInstance("java.lang.module.ModuleDescriptor$Opens"));
        columnKeys.add(opens);
        columnKeys.add(null);
        setField(defaultKeyedValues2D, "org.jfree.data.DefaultKeyedValues2D", "columnKeys", columnKeys);
        setField(defaultKeyedValues2D, "org.jfree.data.DefaultKeyedValues2D", "rows", columnKeys);
        
        /* This test fails because method [org.jfree.data.DefaultKeyedValues2D.removeColumn] produces [java.lang.NullPointerException]
            java.base/java.lang.module.ModuleDescriptor$Opens.hashCode(ModuleDescriptor.java:711)
            java.base/java.util.HashMap.hash(HashMap.java:338)
            java.base/java.util.HashMap.getNode(HashMap.java:568)
            java.base/java.util.HashMap.get(HashMap.java:556)
            org.jfree.data.DefaultKeyedValues.getIndex(DefaultKeyedValues.java:153)
            org.jfree.data.DefaultKeyedValues.removeValue(DefaultKeyedValues.java:333)
            org.jfree.data.DefaultKeyedValues2D.removeColumn(DefaultKeyedValues2D.java:458)
            org.jfree.data.DefaultKeyedValues2D.removeColumn(DefaultKeyedValues2D.java:438) */
        defaultKeyedValues2D.removeColumn(1);
    }
    
    @Test
    public void testRemoveColumn6() throws Exception  {
        DefaultKeyedValues2D defaultKeyedValues2D = ((DefaultKeyedValues2D) createInstance("org.jfree.data.DefaultKeyedValues2D"));
        ArrayList columnKeys = new ArrayList();
        MinguoDate minguoDate = ((MinguoDate) createInstance("java.time.chrono.MinguoDate"));
        columnKeys.add(minguoDate);
        columnKeys.add(null);
        columnKeys.add(null);
        setField(defaultKeyedValues2D, "org.jfree.data.DefaultKeyedValues2D", "columnKeys", columnKeys);
        ArrayList rows = new ArrayList();
        rows.add(null);
        rows.add(null);
        rows.add(null);
        setField(defaultKeyedValues2D, "org.jfree.data.DefaultKeyedValues2D", "rows", rows);
        
        /* This test fails because method [org.jfree.data.DefaultKeyedValues2D.removeColumn] produces [java.lang.NullPointerException]
            org.jfree.data.DefaultKeyedValues2D.removeColumn(DefaultKeyedValues2D.java:458)
            org.jfree.data.DefaultKeyedValues2D.removeColumn(DefaultKeyedValues2D.java:438) */
        defaultKeyedValues2D.removeColumn(0);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.data.DefaultKeyedValues2D.equals
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method equals(java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link DefaultKeyedValues2D}
 * @utbot.methodUnderTest {@link org.jfree.data.DefaultKeyedValues2D#equals(java.lang.Object)}
 * @utbot.executesCondition {@code (o == null): False}
 * @utbot.executesCondition {@code (o): False}
 * @utbot.executesCondition {@code (!(o instanceof KeyedValues2D)): True}
 *  */
    @Test
    public void testEquals_NotOInstanceOfKeyedValues2D() {
        DefaultKeyedValues2D defaultKeyedValues2D = new DefaultKeyedValues2D();
        byte[] byteArray = {};
        
        boolean actual = defaultKeyedValues2D.equals(byteArray);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link DefaultKeyedValues2D}
 * @utbot.methodUnderTest {@link org.jfree.data.DefaultKeyedValues2D#equals(java.lang.Object)}
 * @utbot.executesCondition {@code (o == null): True}
 *  */
    @Test
    public void testEquals_OEqualsNull() {
        DefaultKeyedValues2D defaultKeyedValues2D = new DefaultKeyedValues2D();
        
        boolean actual = defaultKeyedValues2D.equals(null);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link DefaultKeyedValues2D}
 * @utbot.methodUnderTest {@link org.jfree.data.DefaultKeyedValues2D#equals(java.lang.Object)}
 * @utbot.executesCondition {@code (o == null): False}
 * @utbot.executesCondition {@code (o): True}
 *  */
    @Test
    public void testEquals_O() {
        DefaultKeyedValues2D defaultKeyedValues2D = new DefaultKeyedValues2D();
        
        boolean actual = defaultKeyedValues2D.equals(defaultKeyedValues2D);
        
        assertTrue(actual);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method equals(java.lang.Object)
    
    @Test
    public void testEquals1() throws Exception  {
        DefaultKeyedValues2D defaultKeyedValues2D = ((DefaultKeyedValues2D) createInstance("org.jfree.data.DefaultKeyedValues2D"));
        ArrayList rowKeys = new ArrayList();
        rowKeys.add(null);
        rowKeys.add(null);
        rowKeys.add(null);
        setField(defaultKeyedValues2D, "org.jfree.data.DefaultKeyedValues2D", "rowKeys", rowKeys);
        JDBCCategoryDataset jDBCCategoryDataset = ((JDBCCategoryDataset) createInstance("org.jfree.data.jdbc.JDBCCategoryDataset"));
        DefaultKeyedValues2D data = ((DefaultKeyedValues2D) createInstance("org.jfree.data.DefaultKeyedValues2D"));
        ArrayList rowKeys1 = new ArrayList();
        setField(data, "org.jfree.data.DefaultKeyedValues2D", "rowKeys", rowKeys1);
        setField(jDBCCategoryDataset, "org.jfree.data.category.DefaultCategoryDataset", "data", data);
        
        boolean actual = defaultKeyedValues2D.equals(jDBCCategoryDataset);
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method equals(java.lang.Object)
    
    @Test
    public void testEquals2() throws Exception  {
        DefaultKeyedValues2D defaultKeyedValues2D = ((DefaultKeyedValues2D) createInstance("org.jfree.data.DefaultKeyedValues2D"));
        ArrayList rowKeys = new ArrayList();
        setField(defaultKeyedValues2D, "org.jfree.data.DefaultKeyedValues2D", "rowKeys", rowKeys);
        TaskSeriesCollection taskSeriesCollection = new TaskSeriesCollection();
        
        /* This test fails because method [org.jfree.data.DefaultKeyedValues2D.equals] produces [java.lang.NullPointerException]
            java.base/java.util.Collections.unmodifiableList(Collections.java:1319)
            org.jfree.data.DefaultKeyedValues2D.getColumnKeys(DefaultKeyedValues2D.java:244)
            org.jfree.data.DefaultKeyedValues2D.equals(DefaultKeyedValues2D.java:495) */
        defaultKeyedValues2D.equals(taskSeriesCollection);
    }
    
    @Test
    public void testEquals3() throws Exception  {
        DefaultKeyedValues2D defaultKeyedValues2D = ((DefaultKeyedValues2D) createInstance("org.jfree.data.DefaultKeyedValues2D"));
        ArrayList rowKeys = new ArrayList();
        setField(defaultKeyedValues2D, "org.jfree.data.DefaultKeyedValues2D", "rowKeys", rowKeys);
        DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset = new DefaultBoxAndWhiskerCategoryDataset();
        
        /* This test fails because method [org.jfree.data.DefaultKeyedValues2D.equals] produces [java.lang.NullPointerException]
            java.base/java.util.Collections.unmodifiableList(Collections.java:1319)
            org.jfree.data.DefaultKeyedValues2D.getColumnKeys(DefaultKeyedValues2D.java:244)
            org.jfree.data.DefaultKeyedValues2D.equals(DefaultKeyedValues2D.java:495) */
        defaultKeyedValues2D.equals(defaultBoxAndWhiskerCategoryDataset);
    }
    
    @Test
    public void testEquals4() throws Exception  {
        DefaultKeyedValues2D defaultKeyedValues2D = ((DefaultKeyedValues2D) createInstance("org.jfree.data.DefaultKeyedValues2D"));
        ArrayList rowKeys = new ArrayList();
        setField(defaultKeyedValues2D, "org.jfree.data.DefaultKeyedValues2D", "rowKeys", rowKeys);
        DefaultKeyedValues2D defaultKeyedValues2D1 = ((DefaultKeyedValues2D) createInstance("org.jfree.data.DefaultKeyedValues2D"));
        setField(defaultKeyedValues2D1, "org.jfree.data.DefaultKeyedValues2D", "rowKeys", rowKeys);
        
        /* This test fails because method [org.jfree.data.DefaultKeyedValues2D.equals] produces [java.lang.NullPointerException]
            java.base/java.util.Collections.unmodifiableList(Collections.java:1319)
            org.jfree.data.DefaultKeyedValues2D.getColumnKeys(DefaultKeyedValues2D.java:244)
            org.jfree.data.DefaultKeyedValues2D.equals(DefaultKeyedValues2D.java:495) */
        defaultKeyedValues2D.equals(defaultKeyedValues2D1);
    }
    
    @Test
    public void testEquals5() throws Exception  {
        DefaultKeyedValues2D defaultKeyedValues2D = ((DefaultKeyedValues2D) createInstance("org.jfree.data.DefaultKeyedValues2D"));
        ArrayList rowKeys = new ArrayList();
        setField(defaultKeyedValues2D, "org.jfree.data.DefaultKeyedValues2D", "rowKeys", rowKeys);
        DefaultCategoryDataset defaultCategoryDataset = ((DefaultCategoryDataset) createInstance("org.jfree.data.category.DefaultCategoryDataset"));
        DefaultKeyedValues2D data = ((DefaultKeyedValues2D) createInstance("org.jfree.data.DefaultKeyedValues2D"));
        ArrayList rowKeys1 = new ArrayList();
        setField(data, "org.jfree.data.DefaultKeyedValues2D", "rowKeys", rowKeys1);
        setField(defaultCategoryDataset, "org.jfree.data.category.DefaultCategoryDataset", "data", data);
        
        /* This test fails because method [org.jfree.data.DefaultKeyedValues2D.equals] produces [java.lang.NullPointerException]
            java.base/java.util.Collections.unmodifiableList(Collections.java:1319)
            org.jfree.data.DefaultKeyedValues2D.getColumnKeys(DefaultKeyedValues2D.java:244)
            org.jfree.data.DefaultKeyedValues2D.equals(DefaultKeyedValues2D.java:495) */
        defaultKeyedValues2D.equals(defaultCategoryDataset);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.data.DefaultKeyedValues2D.hashCode
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method hashCode()
    
    /**
    @utbot.classUnderTest {@link DefaultKeyedValues2D}
 * @utbot.methodUnderTest {@link org.jfree.data.DefaultKeyedValues2D#hashCode()}
 * @utbot.invokes {@link java.util.List#hashCode()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: result = this.rowKeys.hashCode();
 *  */
    @Test
    public void testHashCode_ThrowNullPointerException() throws Exception  {
        DefaultKeyedValues2D defaultKeyedValues2D = ((DefaultKeyedValues2D) createInstance("org.jfree.data.DefaultKeyedValues2D"));
        
        /* This test fails because method [org.jfree.data.DefaultKeyedValues2D.hashCode] produces [java.lang.NullPointerException]
            org.jfree.data.DefaultKeyedValues2D.hashCode(DefaultKeyedValues2D.java:534) */
        defaultKeyedValues2D.hashCode();
    }
    
    /**
    @utbot.classUnderTest {@link DefaultKeyedValues2D}
 * @utbot.methodUnderTest {@link org.jfree.data.DefaultKeyedValues2D#hashCode()}
 * @utbot.invokes {@link java.util.List#hashCode()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: result = 29 * result + this.columnKeys.hashCode();
 *  */
    @Test
    public void testHashCode_ThrowNullPointerException_1() throws Exception  {
        DefaultKeyedValues2D defaultKeyedValues2D = ((DefaultKeyedValues2D) createInstance("org.jfree.data.DefaultKeyedValues2D"));
        ArrayList rowKeys = new ArrayList();
        setField(defaultKeyedValues2D, "org.jfree.data.DefaultKeyedValues2D", "rowKeys", rowKeys);
        
        /* This test fails because method [org.jfree.data.DefaultKeyedValues2D.hashCode] produces [java.lang.NullPointerException]
            org.jfree.data.DefaultKeyedValues2D.hashCode(DefaultKeyedValues2D.java:535) */
        defaultKeyedValues2D.hashCode();
    }
    
    /**
    @utbot.classUnderTest {@link DefaultKeyedValues2D}
 * @utbot.methodUnderTest {@link org.jfree.data.DefaultKeyedValues2D#hashCode()}
 * @utbot.invokes {@link java.util.List#hashCode()}
 * @utbot.invokes {@link java.util.List#hashCode()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: result = 29 * result + this.rows.hashCode();
 *  */
    @Test
    public void testHashCode_ThrowNullPointerException_2() throws Exception  {
        DefaultKeyedValues2D defaultKeyedValues2D = ((DefaultKeyedValues2D) createInstance("org.jfree.data.DefaultKeyedValues2D"));
        ArrayList rowKeys = new ArrayList();
        setField(defaultKeyedValues2D, "org.jfree.data.DefaultKeyedValues2D", "rowKeys", rowKeys);
        setField(defaultKeyedValues2D, "org.jfree.data.DefaultKeyedValues2D", "columnKeys", rowKeys);
        
        /* This test fails because method [org.jfree.data.DefaultKeyedValues2D.hashCode] produces [java.lang.NullPointerException]
            org.jfree.data.DefaultKeyedValues2D.hashCode(DefaultKeyedValues2D.java:536) */
        defaultKeyedValues2D.hashCode();
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method hashCode()
    
    @Test
    public void testHashCode1() throws Exception  {
        DefaultKeyedValues2D defaultKeyedValues2D = ((DefaultKeyedValues2D) createInstance("org.jfree.data.DefaultKeyedValues2D"));
        ArrayList rowKeys = new ArrayList();
        setField(defaultKeyedValues2D, "org.jfree.data.DefaultKeyedValues2D", "rowKeys", rowKeys);
        setField(defaultKeyedValues2D, "org.jfree.data.DefaultKeyedValues2D", "columnKeys", rowKeys);
        setField(defaultKeyedValues2D, "org.jfree.data.DefaultKeyedValues2D", "rows", rowKeys);
        
        int actual = defaultKeyedValues2D.hashCode();
        
        assertEquals(871, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.data.DefaultKeyedValues2D.clone
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method clone()
    
    /**
    @utbot.classUnderTest {@link DefaultKeyedValues2D}
 * @utbot.methodUnderTest {@link org.jfree.data.DefaultKeyedValues2D#clone()}
 * @utbot.invokes {@link java.lang.Object#clone()}
 *  */
    @Test
    public void testClone_ObjectClone() throws Exception  {
        DefaultKeyedValues2D defaultKeyedValues2D = new DefaultKeyedValues2D();
        
        DefaultKeyedValues2D actual = ((DefaultKeyedValues2D) defaultKeyedValues2D.clone());
        
        DefaultKeyedValues2D expected = ((DefaultKeyedValues2D) createInstance("org.jfree.data.DefaultKeyedValues2D"));
        ArrayList rowKeys = new ArrayList();
        setField(expected, "org.jfree.data.DefaultKeyedValues2D", "rowKeys", rowKeys);
        ArrayList columnKeys = new ArrayList();
        setField(expected, "org.jfree.data.DefaultKeyedValues2D", "columnKeys", columnKeys);
        ArrayList rows = new ArrayList();
        setField(expected, "org.jfree.data.DefaultKeyedValues2D", "rows", rows);
        
        // org.jfree.data.DefaultKeyedValues2D has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.data.DefaultKeyedValues2D.clear
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method clear()
    
    /**
    @utbot.classUnderTest {@link DefaultKeyedValues2D}
 * @utbot.methodUnderTest {@link org.jfree.data.DefaultKeyedValues2D#clear()}
 * @utbot.invokes {@link java.util.List#clear()}
 * @utbot.invokes {@link java.util.List#clear()}
 * @utbot.invokes {@link java.util.List#clear()}
 *  */
    @Test
    public void testClear_ListClear() throws Exception  {
        DefaultKeyedValues2D defaultKeyedValues2D = ((DefaultKeyedValues2D) createInstance("org.jfree.data.DefaultKeyedValues2D"));
        ArrayList rowKeys = new ArrayList();
        rowKeys.add(null);
        rowKeys.add(null);
        rowKeys.add(null);
        setField(defaultKeyedValues2D, "org.jfree.data.DefaultKeyedValues2D", "rowKeys", rowKeys);
        setField(defaultKeyedValues2D, "org.jfree.data.DefaultKeyedValues2D", "columnKeys", rowKeys);
        setField(defaultKeyedValues2D, "org.jfree.data.DefaultKeyedValues2D", "rows", rowKeys);
        
        defaultKeyedValues2D.clear();
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method clear()
    
    /**
    @utbot.classUnderTest {@link DefaultKeyedValues2D}
 * @utbot.methodUnderTest {@link org.jfree.data.DefaultKeyedValues2D#clear()}
 * @utbot.invokes {@link java.util.List#clear()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: this.rowKeys.clear();
 *  */
    @Test
    public void testClear_ThrowNullPointerException() throws Exception  {
        DefaultKeyedValues2D defaultKeyedValues2D = ((DefaultKeyedValues2D) createInstance("org.jfree.data.DefaultKeyedValues2D"));
        
        /* This test fails because method [org.jfree.data.DefaultKeyedValues2D.clear] produces [java.lang.NullPointerException]
            org.jfree.data.DefaultKeyedValues2D.clear(DefaultKeyedValues2D.java:467) */
        defaultKeyedValues2D.clear();
    }
    
    /**
    @utbot.classUnderTest {@link DefaultKeyedValues2D}
 * @utbot.methodUnderTest {@link org.jfree.data.DefaultKeyedValues2D#clear()}
 * @utbot.invokes {@link java.util.List#clear()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: this.columnKeys.clear();
 *  */
    @Test
    public void testClear_ThrowNullPointerException_1() throws Exception  {
        DefaultKeyedValues2D defaultKeyedValues2D = ((DefaultKeyedValues2D) createInstance("org.jfree.data.DefaultKeyedValues2D"));
        ArrayList rowKeys = new ArrayList();
        rowKeys.add(null);
        rowKeys.add(null);
        rowKeys.add(null);
        setField(defaultKeyedValues2D, "org.jfree.data.DefaultKeyedValues2D", "rowKeys", rowKeys);
        
        /* This test fails because method [org.jfree.data.DefaultKeyedValues2D.clear] produces [java.lang.NullPointerException]
            org.jfree.data.DefaultKeyedValues2D.clear(DefaultKeyedValues2D.java:468) */
        defaultKeyedValues2D.clear();
    }
    
    /**
    @utbot.classUnderTest {@link DefaultKeyedValues2D}
 * @utbot.methodUnderTest {@link org.jfree.data.DefaultKeyedValues2D#clear()}
 * @utbot.invokes {@link java.util.List#clear()}
 * @utbot.invokes {@link java.util.List#clear()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: this.rows.clear();
 *  */
    @Test
    public void testClear_ThrowNullPointerException_2() throws Exception  {
        DefaultKeyedValues2D defaultKeyedValues2D = ((DefaultKeyedValues2D) createInstance("org.jfree.data.DefaultKeyedValues2D"));
        ArrayList rowKeys = new ArrayList();
        rowKeys.add(null);
        rowKeys.add(null);
        rowKeys.add(null);
        setField(defaultKeyedValues2D, "org.jfree.data.DefaultKeyedValues2D", "rowKeys", rowKeys);
        setField(defaultKeyedValues2D, "org.jfree.data.DefaultKeyedValues2D", "columnKeys", rowKeys);
        
        /* This test fails because method [org.jfree.data.DefaultKeyedValues2D.clear] produces [java.lang.NullPointerException]
            org.jfree.data.DefaultKeyedValues2D.clear(DefaultKeyedValues2D.java:469) */
        defaultKeyedValues2D.clear();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.data.DefaultKeyedValues2D.getValue
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getValue(int, int)
    
    /**
    @utbot.classUnderTest {@link DefaultKeyedValues2D}
 * @utbot.methodUnderTest {@link org.jfree.data.DefaultKeyedValues2D#getValue(int,int)}
 * @utbot.executesCondition {@code (rowData != null): False}
 * @utbot.invokes {@link java.util.List#get(int)}
 * @utbot.returnsFrom {@code return result;}
 *  */
    @Test
    public void testGetValue_RowDataEqualsNull() throws Exception  {
        DefaultKeyedValues2D defaultKeyedValues2D = ((DefaultKeyedValues2D) createInstance("org.jfree.data.DefaultKeyedValues2D"));
        ArrayList rows = new ArrayList();
        rows.add(null);
        setField(defaultKeyedValues2D, "org.jfree.data.DefaultKeyedValues2D", "rows", rows);
        
        Number actual = defaultKeyedValues2D.getValue(0, -255);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getValue(int, int)
    
    /**
    @utbot.classUnderTest {@link DefaultKeyedValues2D}
 * @utbot.methodUnderTest {@link org.jfree.data.DefaultKeyedValues2D#getValue(int,int)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: DefaultKeyedValues rowData = (DefaultKeyedValues) this.rows.get(row);
 *  */
    @Test
    public void testGetValue_ThrowClassCastException() throws Exception  {
        DefaultKeyedValues2D defaultKeyedValues2D = ((DefaultKeyedValues2D) createInstance("org.jfree.data.DefaultKeyedValues2D"));
        ArrayList rows = new ArrayList();
        Object object = createInstance("java.lang.Object");
        rows.add(object);
        setField(defaultKeyedValues2D, "org.jfree.data.DefaultKeyedValues2D", "rows", rows);
        
        /* This test fails because method [org.jfree.data.DefaultKeyedValues2D.getValue] produces [java.lang.ClassCastException: class java.lang.Object cannot be cast to class org.jfree.data.DefaultKeyedValues (java.lang.Object is in module java.base of loader 'bootstrap'; org.jfree.data.DefaultKeyedValues is in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @60349b9b)]
            org.jfree.data.DefaultKeyedValues2D.getValue(DefaultKeyedValues2D.java:144) */
        defaultKeyedValues2D.getValue(0, -255);
    }
    
    /**
    @utbot.classUnderTest {@link DefaultKeyedValues2D}
 * @utbot.methodUnderTest {@link org.jfree.data.DefaultKeyedValues2D#getValue(int,int)}
 * @utbot.executesCondition {@code (rowData != null): True}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: Comparable columnKey = (Comparable) this.columnKeys.get(column);
 *  */
    @Test
    public void testGetValue_ThrowIndexOutOfBoundsException() throws Exception  {
        DefaultKeyedValues2D defaultKeyedValues2D = ((DefaultKeyedValues2D) createInstance("org.jfree.data.DefaultKeyedValues2D"));
        ArrayList columnKeys = new ArrayList();
        DefaultKeyedValues defaultKeyedValues = ((DefaultKeyedValues) createInstance("org.jfree.data.DefaultKeyedValues"));
        columnKeys.add(defaultKeyedValues);
        setField(defaultKeyedValues2D, "org.jfree.data.DefaultKeyedValues2D", "columnKeys", columnKeys);
        setField(defaultKeyedValues2D, "org.jfree.data.DefaultKeyedValues2D", "rows", columnKeys);
        
        /* This test fails because method [org.jfree.data.DefaultKeyedValues2D.getValue] produces [java.lang.IndexOutOfBoundsException: Index -1 out of bounds for length 1]
            java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
            java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
            java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:266)
            java.base/java.util.Objects.checkIndex(Objects.java:359)
            java.base/java.util.ArrayList.get(ArrayList.java:427)
            org.jfree.data.DefaultKeyedValues2D.getValue(DefaultKeyedValues2D.java:146) */
        defaultKeyedValues2D.getValue(0, -1);
    }
    
    /**
    @utbot.classUnderTest {@link DefaultKeyedValues2D}
 * @utbot.methodUnderTest {@link org.jfree.data.DefaultKeyedValues2D#getValue(int,int)}
 * @utbot.executesCondition {@code (rowData != null): True}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: Comparable columnKey = (Comparable) this.columnKeys.get(column);
 *  */
    @Test
    public void testGetValue_ThrowClassCastException_1() throws Exception  {
        DefaultKeyedValues2D defaultKeyedValues2D = ((DefaultKeyedValues2D) createInstance("org.jfree.data.DefaultKeyedValues2D"));
        ArrayList columnKeys = new ArrayList();
        DefaultKeyedValues defaultKeyedValues = ((DefaultKeyedValues) createInstance("org.jfree.data.DefaultKeyedValues"));
        columnKeys.add(defaultKeyedValues);
        columnKeys.add(null);
        columnKeys.add(null);
        setField(defaultKeyedValues2D, "org.jfree.data.DefaultKeyedValues2D", "columnKeys", columnKeys);
        setField(defaultKeyedValues2D, "org.jfree.data.DefaultKeyedValues2D", "rows", columnKeys);
        
        /* This test fails because method [org.jfree.data.DefaultKeyedValues2D.getValue] produces [java.lang.ClassCastException: class org.jfree.data.DefaultKeyedValues cannot be cast to class java.lang.Comparable (org.jfree.data.DefaultKeyedValues is in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @60349b9b; java.lang.Comparable is in module java.base of loader 'bootstrap')]
            org.jfree.data.DefaultKeyedValues2D.getValue(DefaultKeyedValues2D.java:146) */
        defaultKeyedValues2D.getValue(0, 0);
    }
    
    /**
    @utbot.classUnderTest {@link DefaultKeyedValues2D}
 * @utbot.methodUnderTest {@link org.jfree.data.DefaultKeyedValues2D#getValue(int,int)}
 * @utbot.invokes {@link java.util.List#get(int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: DefaultKeyedValues rowData = (DefaultKeyedValues) this.rows.get(row);
 *  */
    @Test
    public void testGetValue_ThrowNullPointerException() throws Exception  {
        DefaultKeyedValues2D defaultKeyedValues2D = ((DefaultKeyedValues2D) createInstance("org.jfree.data.DefaultKeyedValues2D"));
        
        /* This test fails because method [org.jfree.data.DefaultKeyedValues2D.getValue] produces [java.lang.NullPointerException]
            org.jfree.data.DefaultKeyedValues2D.getValue(DefaultKeyedValues2D.java:144) */
        defaultKeyedValues2D.getValue(-255, -255);
    }
    
    /**
    @utbot.classUnderTest {@link DefaultKeyedValues2D}
 * @utbot.methodUnderTest {@link org.jfree.data.DefaultKeyedValues2D#getValue(int,int)}
 * @utbot.executesCondition {@code (rowData != null): True}
 * @utbot.invokes {@link java.util.List#get(int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Comparable columnKey = (Comparable) this.columnKeys.get(column);
 *  */
    @Test
    public void testGetValue_ThrowNullPointerException_1() throws Exception  {
        DefaultKeyedValues2D defaultKeyedValues2D = ((DefaultKeyedValues2D) createInstance("org.jfree.data.DefaultKeyedValues2D"));
        ArrayList rows = new ArrayList();
        DefaultKeyedValues defaultKeyedValues = ((DefaultKeyedValues) createInstance("org.jfree.data.DefaultKeyedValues"));
        rows.add(defaultKeyedValues);
        setField(defaultKeyedValues2D, "org.jfree.data.DefaultKeyedValues2D", "rows", rows);
        
        /* This test fails because method [org.jfree.data.DefaultKeyedValues2D.getValue] produces [java.lang.NullPointerException]
            org.jfree.data.DefaultKeyedValues2D.getValue(DefaultKeyedValues2D.java:146) */
        defaultKeyedValues2D.getValue(0, -255);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method getValue(int, int)
    
    /**
    @utbot.classUnderTest {@link DefaultKeyedValues2D}
 * @utbot.methodUnderTest {@link org.jfree.data.DefaultKeyedValues2D#getValue(int,int)}
 * @utbot.executesCondition {@code (rowData != null): True}
 * @utbot.invokes {@link java.util.List#get(int)}
 * @utbot.invokes {@link java.util.List#get(int)}
 * @utbot.invokes {@link org.jfree.data.DefaultKeyedValues#getIndex(java.lang.Comparable)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: int index = rowData.getIndex(columnKey);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testGetValue_ThrowIllegalArgumentException() throws Exception  {
        DefaultKeyedValues2D defaultKeyedValues2D = ((DefaultKeyedValues2D) createInstance("org.jfree.data.DefaultKeyedValues2D"));
        ArrayList columnKeys = new ArrayList();
        DefaultKeyedValues defaultKeyedValues = ((DefaultKeyedValues) createInstance("org.jfree.data.DefaultKeyedValues"));
        columnKeys.add(defaultKeyedValues);
        columnKeys.add(null);
        columnKeys.add(null);
        setField(defaultKeyedValues2D, "org.jfree.data.DefaultKeyedValues2D", "columnKeys", columnKeys);
        setField(defaultKeyedValues2D, "org.jfree.data.DefaultKeyedValues2D", "rows", columnKeys);
        
        defaultKeyedValues2D.getValue(0, 2);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method getValue(int, int)
    
    @Test
    public void testGetValue1() throws Exception  {
        DefaultKeyedValues2D defaultKeyedValues2D = ((DefaultKeyedValues2D) createInstance("org.jfree.data.DefaultKeyedValues2D"));
        ArrayList columnKeys = new ArrayList();
        Object object = createInstance("java.lang.Object");
        columnKeys.add(object);
        DefaultKeyedValues defaultKeyedValues = ((DefaultKeyedValues) createInstance("org.jfree.data.DefaultKeyedValues"));
        HashMap indexMap = new HashMap();
        Character character = '\u0000';
        indexMap.put(character, object);
        setField(defaultKeyedValues, "org.jfree.data.DefaultKeyedValues", "indexMap", indexMap);
        columnKeys.add(defaultKeyedValues);
        Integer integer = 0;
        columnKeys.add(integer);
        setField(defaultKeyedValues2D, "org.jfree.data.DefaultKeyedValues2D", "columnKeys", columnKeys);
        setField(defaultKeyedValues2D, "org.jfree.data.DefaultKeyedValues2D", "rows", columnKeys);
        
        Number actual = defaultKeyedValues2D.getValue(1, 2);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method getValue(int, int)
    
    @Test
    public void testGetValue2() throws Exception  {
        DefaultKeyedValues2D defaultKeyedValues2D = ((DefaultKeyedValues2D) createInstance("org.jfree.data.DefaultKeyedValues2D"));
        ArrayList rows = new ArrayList();
        rows.add(null);
        rows.add(null);
        rows.add(null);
        setField(defaultKeyedValues2D, "org.jfree.data.DefaultKeyedValues2D", "rows", rows);
        
        /* This test fails because method [org.jfree.data.DefaultKeyedValues2D.getValue] produces [java.lang.IndexOutOfBoundsException: Index 1073741824 out of bounds for length 3]
            java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
            java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
            java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:266)
            java.base/java.util.Objects.checkIndex(Objects.java:359)
            java.base/java.util.ArrayList.get(ArrayList.java:427)
            org.jfree.data.DefaultKeyedValues2D.getValue(DefaultKeyedValues2D.java:144) */
        defaultKeyedValues2D.getValue(1073741824, 0);
    }
    
    @Test
    public void testGetValue3() throws Exception  {
        DefaultKeyedValues2D defaultKeyedValues2D = ((DefaultKeyedValues2D) createInstance("org.jfree.data.DefaultKeyedValues2D"));
        ArrayList columnKeys = new ArrayList();
        Object object = createInstance("java.lang.Object");
        columnKeys.add(object);
        DefaultKeyedValues defaultKeyedValues = ((DefaultKeyedValues) createInstance("org.jfree.data.DefaultKeyedValues"));
        HashMap indexMap = new HashMap();
        Integer integer = 0;
        indexMap.put(integer, object);
        setField(defaultKeyedValues, "org.jfree.data.DefaultKeyedValues", "indexMap", indexMap);
        columnKeys.add(defaultKeyedValues);
        columnKeys.add(integer);
        setField(defaultKeyedValues2D, "org.jfree.data.DefaultKeyedValues2D", "columnKeys", columnKeys);
        setField(defaultKeyedValues2D, "org.jfree.data.DefaultKeyedValues2D", "rows", columnKeys);
        
        /* This test fails because method [org.jfree.data.DefaultKeyedValues2D.getValue] produces [java.lang.ClassCastException: class java.lang.Object cannot be cast to class java.lang.Integer (java.lang.Object and java.lang.Integer are in module java.base of loader 'bootstrap')]
            org.jfree.data.DefaultKeyedValues.getIndex(DefaultKeyedValues.java:153)
            org.jfree.data.DefaultKeyedValues2D.getValue(DefaultKeyedValues2D.java:149) */
        defaultKeyedValues2D.getValue(1, 2);
    }
    
    @Test
    public void testGetValue4() throws Exception  {
        DefaultKeyedValues2D defaultKeyedValues2D = ((DefaultKeyedValues2D) createInstance("org.jfree.data.DefaultKeyedValues2D"));
        ArrayList columnKeys = new ArrayList();
        Integer integer = 0;
        columnKeys.add(integer);
        columnKeys.add(null);
        DefaultKeyedValues defaultKeyedValues = ((DefaultKeyedValues) createInstance("org.jfree.data.DefaultKeyedValues"));
        HashMap indexMap = new HashMap();
        indexMap.put(integer, integer);
        setField(defaultKeyedValues, "org.jfree.data.DefaultKeyedValues", "indexMap", indexMap);
        columnKeys.add(defaultKeyedValues);
        setField(defaultKeyedValues2D, "org.jfree.data.DefaultKeyedValues2D", "columnKeys", columnKeys);
        setField(defaultKeyedValues2D, "org.jfree.data.DefaultKeyedValues2D", "rows", columnKeys);
        
        /* This test fails because method [org.jfree.data.DefaultKeyedValues2D.getValue] produces [java.lang.NullPointerException]
            org.jfree.data.DefaultKeyedValues.getValue(DefaultKeyedValues.java:123)
            org.jfree.data.DefaultKeyedValues2D.getValue(DefaultKeyedValues2D.java:151) */
        defaultKeyedValues2D.getValue(2, 0);
    }
    
    @Test
    public void testGetValue5() throws Exception  {
        DefaultKeyedValues2D defaultKeyedValues2D = ((DefaultKeyedValues2D) createInstance("org.jfree.data.DefaultKeyedValues2D"));
        ArrayList columnKeys = new ArrayList();
        Object object = createInstance("java.lang.Object");
        columnKeys.add(object);
        columnKeys.add(object);
        MinguoDate minguoDate = ((MinguoDate) createInstance("java.time.chrono.MinguoDate"));
        columnKeys.add(minguoDate);
        columnKeys.add(null);
        DefaultKeyedValues defaultKeyedValues = ((DefaultKeyedValues) createInstance("org.jfree.data.DefaultKeyedValues"));
        HashMap indexMap = new HashMap();
        Integer integer = 0;
        indexMap.put(integer, object);
        Object object1 = createInstance("java.lang.Object");
        indexMap.put(object1, null);
        setField(defaultKeyedValues, "org.jfree.data.DefaultKeyedValues", "indexMap", indexMap);
        columnKeys.add(defaultKeyedValues);
        columnKeys.add(null);
        columnKeys.add(null);
        setField(defaultKeyedValues2D, "org.jfree.data.DefaultKeyedValues2D", "columnKeys", columnKeys);
        setField(defaultKeyedValues2D, "org.jfree.data.DefaultKeyedValues2D", "rows", columnKeys);
        
        /* This test fails because method [org.jfree.data.DefaultKeyedValues2D.getValue] produces [java.lang.NullPointerException]
            java.base/java.time.chrono.MinguoDate.hashCode(MinguoDate.java:472)
            java.base/java.util.HashMap.hash(HashMap.java:338)
            java.base/java.util.HashMap.getNode(HashMap.java:568)
            java.base/java.util.HashMap.get(HashMap.java:556)
            org.jfree.data.DefaultKeyedValues.getIndex(DefaultKeyedValues.java:153)
            org.jfree.data.DefaultKeyedValues2D.getValue(DefaultKeyedValues2D.java:149) */
        defaultKeyedValues2D.getValue(4, 2);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.data.DefaultKeyedValues2D.getValue
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method getValue(java.lang.Comparable, java.lang.Comparable)
    
    /**
    @utbot.classUnderTest {@link DefaultKeyedValues2D}
 * @utbot.methodUnderTest {@link org.jfree.data.DefaultKeyedValues2D#getValue(java.lang.Comparable,java.lang.Comparable)}
 * @utbot.executesCondition {@code (rowKey == null): True}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: rowKey == null
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testGetValue_ThrowIllegalArgumentException1() {
        DefaultKeyedValues2D defaultKeyedValues2D = new DefaultKeyedValues2D();
        
        defaultKeyedValues2D.getValue(((Comparable) null), ((Comparable) null));
    }
    
    /**
    @utbot.classUnderTest {@link DefaultKeyedValues2D}
 * @utbot.methodUnderTest {@link org.jfree.data.DefaultKeyedValues2D#getValue(java.lang.Comparable,java.lang.Comparable)}
 * @utbot.executesCondition {@code (rowKey == null): False}
 * @utbot.executesCondition {@code (columnKey == null): True}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: columnKey == null
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testGetValue_ThrowIllegalArgumentException_1() {
        DefaultKeyedValues2D defaultKeyedValues2D = new DefaultKeyedValues2D();
        Integer integer = 0;
        
        defaultKeyedValues2D.getValue(((Comparable) integer), ((Comparable) null));
    }
    
    /**
    @utbot.classUnderTest {@link DefaultKeyedValues2D}
 * @utbot.methodUnderTest {@link org.jfree.data.DefaultKeyedValues2D#getValue(java.lang.Comparable,java.lang.Comparable)}
 * @utbot.executesCondition {@code (rowKey == null): False}
 * @utbot.executesCondition {@code (columnKey == null): False}
 * @utbot.invokes {@link java.util.List#contains(java.lang.Object)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.Object)}
 * @utbot.invokes {@link java.lang.StringBuilder#toString()}
 * @utbot.throwsException {@link org.jfree.data.UnknownKeyException} when: !(this.columnKeys.contains(columnKey))
 *  */
    @Test(expected = UnknownKeyException.class)
    public void testGetValue_ThrowUnknownKeyException() throws Exception  {
        DefaultKeyedValues2D defaultKeyedValues2D = ((DefaultKeyedValues2D) createInstance("org.jfree.data.DefaultKeyedValues2D"));
        ArrayList columnKeys = new ArrayList();
        setField(defaultKeyedValues2D, "org.jfree.data.DefaultKeyedValues2D", "columnKeys", columnKeys);
        Integer integer = 0;
        Integer integer1 = 0;
        
        defaultKeyedValues2D.getValue(((Comparable) integer), ((Comparable) integer1));
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getValue(java.lang.Comparable, java.lang.Comparable)
    
    /**
    @utbot.classUnderTest {@link DefaultKeyedValues2D}
 * @utbot.methodUnderTest {@link org.jfree.data.DefaultKeyedValues2D#getValue(java.lang.Comparable,java.lang.Comparable)}
 * @utbot.executesCondition {@code (rowKey == null): False}
 * @utbot.executesCondition {@code (columnKey == null): False}
 * @utbot.invokes {@link java.util.List#contains(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: !(this.columnKeys.contains(columnKey))
 *  */
    @Test
    public void testGetValue_ThrowNullPointerException1() throws Exception  {
        DefaultKeyedValues2D defaultKeyedValues2D = ((DefaultKeyedValues2D) createInstance("org.jfree.data.DefaultKeyedValues2D"));
        Integer integer = 0;
        
        /* This test fails because method [org.jfree.data.DefaultKeyedValues2D.getValue] produces [java.lang.NullPointerException]
            org.jfree.data.DefaultKeyedValues2D.getValue(DefaultKeyedValues2D.java:269) */
        defaultKeyedValues2D.getValue(((Comparable) integer), ((Comparable) integer));
    }
    ///endregion
    
    ///region FUZZER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method getValue(java.lang.Comparable, java.lang.Comparable)
    
    /**
     * @utbot.classUnderTest {@link org.jfree.data.DefaultKeyedValues2D}
     * @utbot.methodUnderTest {@link org.jfree.data.DefaultKeyedValues2D#getValue(java.lang.Comparable,java.lang.Comparable)}
     */
    @Test(expected = UnknownKeyException.class)
    public void testGetValueThrowsUKE() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        DefaultKeyedValues2D defaultKeyedValues2D = new DefaultKeyedValues2D(false);
        XYDataItem xYDataItem = new XYDataItem(0.0, java.lang.Double.POSITIVE_INFINITY);
        Class xYDataItemClazz = Class.forName("org.jfree.data.xy.XYDataItem");
        Class numberType = Class.forName("java.lang.Number");
        Method setYMethod = xYDataItemClazz.getDeclaredMethod("setY", numberType);
        setYMethod.setAccessible(true);
        java.lang.Object[] setYMethodArguments = new java.lang.Object[1];
        setYMethodArguments[0] = 0.0f;
        setYMethod.invoke(xYDataItem, setYMethodArguments);
        Date date = new Date(-1, 0, Integer.MIN_VALUE);
        Date date1 = new Date(0, Integer.MAX_VALUE, Integer.MAX_VALUE, 64, 0, -1);
        SimpleTimePeriod simpleTimePeriod = new SimpleTimePeriod(date, date1);
        
        defaultKeyedValues2D.getValue(xYDataItem, simpleTimePeriod);
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method getValue(java.lang.Comparable, java.lang.Comparable)
    
    @Test(expected = UnknownKeyException.class)
    public void testGetValue6() throws Throwable  {
        DefaultKeyedValues2D defaultKeyedValues2D = ((DefaultKeyedValues2D) createInstance("org.jfree.data.DefaultKeyedValues2D"));
        ArrayList rowKeys = new ArrayList();
        setField(defaultKeyedValues2D, "org.jfree.data.DefaultKeyedValues2D", "rowKeys", rowKeys);
        ArrayList columnKeys = new ArrayList();
        Integer integer = 0;
        columnKeys.add(integer);
        columnKeys.add(null);
        columnKeys.add(null);
        setField(defaultKeyedValues2D, "org.jfree.data.DefaultKeyedValues2D", "columnKeys", columnKeys);
        setField(defaultKeyedValues2D, "org.jfree.data.DefaultKeyedValues2D", "sortRowKeys", true);
        Object anonymousField = createInstance("java.time.temporal.IsoFields$Field$3");
        
        Class defaultKeyedValues2DClazz = Class.forName("org.jfree.data.DefaultKeyedValues2D");
        Class anonymousFieldType = Class.forName("java.lang.Comparable");
        Method getValueMethod = defaultKeyedValues2DClazz.getDeclaredMethod("getValue", anonymousFieldType, anonymousFieldType);
        getValueMethod.setAccessible(true);
        java.lang.Object[] getValueMethodArguments = new java.lang.Object[2];
        getValueMethodArguments[0] = anonymousField;
        getValueMethodArguments[1] = integer;
        try {
            getValueMethod.invoke(defaultKeyedValues2D, getValueMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = UnknownKeyException.class)
    public void testGetValue7() throws Throwable  {
        DefaultKeyedValues2D defaultKeyedValues2D = ((DefaultKeyedValues2D) createInstance("org.jfree.data.DefaultKeyedValues2D"));
        ArrayList rowKeys = new ArrayList();
        setField(defaultKeyedValues2D, "org.jfree.data.DefaultKeyedValues2D", "rowKeys", rowKeys);
        ArrayList columnKeys = new ArrayList();
        Integer integer = 0;
        columnKeys.add(integer);
        columnKeys.add(null);
        columnKeys.add(null);
        setField(defaultKeyedValues2D, "org.jfree.data.DefaultKeyedValues2D", "columnKeys", columnKeys);
        Object anonymousField = createInstance("java.time.temporal.IsoFields$Field$1");
        
        Class defaultKeyedValues2DClazz = Class.forName("org.jfree.data.DefaultKeyedValues2D");
        Class anonymousFieldType = Class.forName("java.lang.Comparable");
        Method getValueMethod = defaultKeyedValues2DClazz.getDeclaredMethod("getValue", anonymousFieldType, anonymousFieldType);
        getValueMethod.setAccessible(true);
        java.lang.Object[] getValueMethodArguments = new java.lang.Object[2];
        getValueMethodArguments[0] = anonymousField;
        getValueMethodArguments[1] = integer;
        try {
            getValueMethod.invoke(defaultKeyedValues2D, getValueMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method getValue(java.lang.Comparable, java.lang.Comparable)
    
    @Test
    public void testGetValue8() throws Exception  {
        DefaultKeyedValues2D defaultKeyedValues2D = ((DefaultKeyedValues2D) createInstance("org.jfree.data.DefaultKeyedValues2D"));
        ArrayList rowKeys = new ArrayList();
        Integer integer = 0;
        rowKeys.add(integer);
        Object object = createInstance("java.lang.Object");
        rowKeys.add(object);
        rowKeys.add(object);
        setField(defaultKeyedValues2D, "org.jfree.data.DefaultKeyedValues2D", "rowKeys", rowKeys);
        setField(defaultKeyedValues2D, "org.jfree.data.DefaultKeyedValues2D", "columnKeys", rowKeys);
        setField(defaultKeyedValues2D, "org.jfree.data.DefaultKeyedValues2D", "sortRowKeys", true);
        SimpleTimePeriod simpleTimePeriod = ((SimpleTimePeriod) createInstance("org.jfree.data.time.SimpleTimePeriod"));
        
        /* This test fails because method [org.jfree.data.DefaultKeyedValues2D.getValue] produces [java.lang.ClassCastException: class java.lang.Object cannot be cast to class java.lang.Comparable (java.lang.Object and java.lang.Comparable are in module java.base of loader 'bootstrap')]
            java.base/java.util.Collections.indexedBinarySearch(Collections.java:229)
            java.base/java.util.Collections.binarySearch(Collections.java:217)
            org.jfree.data.DefaultKeyedValues2D.getRowIndex(DefaultKeyedValues2D.java:186)
            org.jfree.data.DefaultKeyedValues2D.getValue(DefaultKeyedValues2D.java:277) */
        defaultKeyedValues2D.getValue(simpleTimePeriod, ((Comparable) integer));
    }
    
    @Test
    public void testGetValue9() throws Exception  {
        DefaultKeyedValues2D defaultKeyedValues2D = ((DefaultKeyedValues2D) createInstance("org.jfree.data.DefaultKeyedValues2D"));
        ArrayList rowKeys = new ArrayList();
        Integer integer = 0;
        rowKeys.add(integer);
        rowKeys.add(null);
        rowKeys.add(null);
        setField(defaultKeyedValues2D, "org.jfree.data.DefaultKeyedValues2D", "rowKeys", rowKeys);
        setField(defaultKeyedValues2D, "org.jfree.data.DefaultKeyedValues2D", "columnKeys", rowKeys);
        
        /* This test fails because method [org.jfree.data.DefaultKeyedValues2D.getValue] produces [java.lang.NullPointerException]
            org.jfree.data.DefaultKeyedValues2D.getValue(DefaultKeyedValues2D.java:280) */
        defaultKeyedValues2D.getValue(((Comparable) integer), ((Comparable) integer));
    }
    
    @Test
    public void testGetValue10() throws Throwable  {
        DefaultKeyedValues2D defaultKeyedValues2D = ((DefaultKeyedValues2D) createInstance("org.jfree.data.DefaultKeyedValues2D"));
        ArrayList columnKeys = new ArrayList();
        Character character = '\u0000';
        columnKeys.add(character);
        columnKeys.add(null);
        columnKeys.add(null);
        setField(defaultKeyedValues2D, "org.jfree.data.DefaultKeyedValues2D", "columnKeys", columnKeys);
        setField(defaultKeyedValues2D, "org.jfree.data.DefaultKeyedValues2D", "sortRowKeys", true);
        Object heapCharBufferR = createInstance("java.nio.HeapCharBufferR");
        
        /* This test fails because method [org.jfree.data.DefaultKeyedValues2D.getValue] produces [java.lang.NullPointerException]
            java.base/java.util.Collections.binarySearch(Collections.java:216)
            org.jfree.data.DefaultKeyedValues2D.getRowIndex(DefaultKeyedValues2D.java:186)
            org.jfree.data.DefaultKeyedValues2D.getValue(DefaultKeyedValues2D.java:277) */
        Class defaultKeyedValues2DClazz = Class.forName("org.jfree.data.DefaultKeyedValues2D");
        Class heapCharBufferRType = Class.forName("java.lang.Comparable");
        Method getValueMethod = defaultKeyedValues2DClazz.getDeclaredMethod("getValue", heapCharBufferRType, heapCharBufferRType);
        getValueMethod.setAccessible(true);
        java.lang.Object[] getValueMethodArguments = new java.lang.Object[2];
        getValueMethodArguments[0] = heapCharBufferR;
        getValueMethodArguments[1] = character;
        try {
            getValueMethod.invoke(defaultKeyedValues2D, getValueMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region Errors report for getValue
    
    public void testGetValue_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.data.DefaultKeyedValues2D.setValue
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method setValue(java.lang.Number, java.lang.Comparable, java.lang.Comparable)
    
    /**
    @utbot.classUnderTest {@link DefaultKeyedValues2D}
 * @utbot.methodUnderTest {@link org.jfree.data.DefaultKeyedValues2D#setValue(java.lang.Number,java.lang.Comparable,java.lang.Comparable)}
 * @utbot.invokes {@link org.jfree.data.DefaultKeyedValues2D#getRowIndex(java.lang.Comparable)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: int rowIndex = getRowIndex(rowKey);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testSetValue_ThrowIllegalArgumentException() {
        DefaultKeyedValues2D defaultKeyedValues2D = new DefaultKeyedValues2D();
        
        defaultKeyedValues2D.setValue(null, null, null);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method setValue(java.lang.Number, java.lang.Comparable, java.lang.Comparable)
    
    /**
     * @utbot.classUnderTest {@link org.jfree.data.DefaultKeyedValues2D}
     * @utbot.methodUnderTest {@link org.jfree.data.DefaultKeyedValues2D#setValue(java.lang.Number,java.lang.Comparable,java.lang.Comparable)}
     */
    @Test
    public void testSetValue() throws ClassNotFoundException, NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException  {
        DefaultKeyedValues2D defaultKeyedValues2D = new DefaultKeyedValues2D(true);
        Class xYDataItemClazz = Class.forName("org.jfree.data.xy.XYDataItem");
        Class numberType = Class.forName("java.lang.Number");
        Constructor xYDataItemConstructor = xYDataItemClazz.getDeclaredConstructor(numberType, numberType);
        xYDataItemConstructor.setAccessible(true);
        java.lang.Object[] xYDataItemConstructorArguments = new java.lang.Object[2];
        xYDataItemConstructorArguments[0] = java.lang.Double.POSITIVE_INFINITY;
        xYDataItemConstructorArguments[1] = java.lang.Double.NaN;
        XYDataItem xYDataItem = ((XYDataItem) xYDataItemConstructor.newInstance(xYDataItemConstructorArguments));
        Method setYMethod = xYDataItemClazz.getDeclaredMethod("setY", numberType);
        setYMethod.setAccessible(true);
        java.lang.Object[] setYMethodArguments = new java.lang.Object[1];
        setYMethodArguments[0] = java.lang.Float.NEGATIVE_INFINITY;
        setYMethod.invoke(xYDataItem, setYMethodArguments);
        SimpleTimePeriod simpleTimePeriod = new SimpleTimePeriod(java.lang.Long.MIN_VALUE, 2147483649L);
        
        Class defaultKeyedValues2DClazz = Class.forName("org.jfree.data.DefaultKeyedValues2D");
        Class xYDataItemType = Class.forName("java.lang.Comparable");
        Method setValueMethod = defaultKeyedValues2DClazz.getDeclaredMethod("setValue", numberType, xYDataItemType, xYDataItemType);
        setValueMethod.setAccessible(true);
        java.lang.Object[] setValueMethodArguments = new java.lang.Object[3];
        setValueMethodArguments[0] = (byte) -1;
        setValueMethodArguments[1] = xYDataItem;
        setValueMethodArguments[2] = simpleTimePeriod;
        setValueMethod.invoke(defaultKeyedValues2D, setValueMethodArguments);
    }
    
    /**
     * @utbot.classUnderTest {@link org.jfree.data.DefaultKeyedValues2D}
     * @utbot.methodUnderTest {@link org.jfree.data.DefaultKeyedValues2D#setValue(java.lang.Number,java.lang.Comparable,java.lang.Comparable)}
     */
    @Test
    public void testSetValue1() throws ClassNotFoundException, NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException  {
        DefaultKeyedValues2D defaultKeyedValues2D = new DefaultKeyedValues2D(false);
        Class xYDataItemClazz = Class.forName("org.jfree.data.xy.XYDataItem");
        Class numberType = Class.forName("java.lang.Number");
        Constructor xYDataItemConstructor = xYDataItemClazz.getDeclaredConstructor(numberType, numberType);
        xYDataItemConstructor.setAccessible(true);
        java.lang.Object[] xYDataItemConstructorArguments = new java.lang.Object[2];
        xYDataItemConstructorArguments[0] = java.lang.Double.POSITIVE_INFINITY;
        xYDataItemConstructorArguments[1] = java.lang.Double.NaN;
        XYDataItem xYDataItem = ((XYDataItem) xYDataItemConstructor.newInstance(xYDataItemConstructorArguments));
        Method setYMethod = xYDataItemClazz.getDeclaredMethod("setY", numberType);
        setYMethod.setAccessible(true);
        java.lang.Object[] setYMethodArguments = new java.lang.Object[1];
        setYMethodArguments[0] = java.lang.Float.NEGATIVE_INFINITY;
        setYMethod.invoke(xYDataItem, setYMethodArguments);
        SimpleTimePeriod simpleTimePeriod = new SimpleTimePeriod(java.lang.Long.MIN_VALUE, 2147483649L);
        
        Class defaultKeyedValues2DClazz = Class.forName("org.jfree.data.DefaultKeyedValues2D");
        Class xYDataItemType = Class.forName("java.lang.Comparable");
        Method setValueMethod = defaultKeyedValues2DClazz.getDeclaredMethod("setValue", numberType, xYDataItemType, xYDataItemType);
        setValueMethod.setAccessible(true);
        java.lang.Object[] setValueMethodArguments = new java.lang.Object[3];
        setValueMethodArguments[0] = (byte) -1;
        setValueMethodArguments[1] = xYDataItem;
        setValueMethodArguments[2] = simpleTimePeriod;
        setValueMethod.invoke(defaultKeyedValues2D, setValueMethodArguments);
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
        
                java.lang.reflect.Method methodForGetDeclaredFields799100220456200 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields799100220456200.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass799100220463700 = (java.lang.reflect.Field[]) methodForGetDeclaredFields799100220456200.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass799100220463700).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
    
    private static Object getUnsafeInstance() throws ClassNotFoundException, NoSuchFieldException, IllegalAccessException {
        java.lang.reflect.Field f = Class.forName("sun.misc.Unsafe").getDeclaredField("theUnsafe");
        f.setAccessible(true);
        return f.get(null);
    }
    ///endregion
}

