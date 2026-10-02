package org.jfree.data.statistics;

import org.junit.Test;
import org.jfree.data.KeyedObjects2D;
import java.util.ArrayList;
import java.time.chrono.MinguoEra;
import org.jfree.data.xy.XYCoordinate;
import java.lang.reflect.Method;
import org.jfree.data.general.DatasetGroup;
import java.util.LinkedList;
import java.util.Date;
import org.jfree.data.xy.OHLCDataItem;
import org.jfree.data.Range;
import javax.swing.event.EventListenerList;
import org.jfree.data.time.SimpleTimePeriod;
import org.jfree.data.UnknownKeyException;
import org.jfree.data.KeyedObjects;
import org.jfree.data.KeyedObject;
import java.time.chrono.HijrahChronology;
import com.sun.org.apache.xerces.internal.utils.XMLSecurityPropertyManager.State;
import com.sun.org.apache.xerces.internal.utils.XMLSecurityPropertyManager;
import java.io.ObjectStreamField;
import java.time.chrono.IsoChronology;
import java.time.chrono.ThaiBuddhistDate;
import jdk.xml.internal.JdkXmlFeatures.XmlFeature;
import jdk.xml.internal.JdkXmlFeatures;
import java.util.List;
import org.jfree.data.time.Year;
import sun.security.util.KnownOIDs;
import java.lang.reflect.InvocationTargetException;
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
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public final class org_jfree_data_statistics_DefaultBoxAndWhiskerCategoryDatasetTest {
    ///region Test suites for executable org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset.add
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method add(org.jfree.data.statistics.BoxAndWhiskerItem, java.lang.Comparable, java.lang.Comparable)
    
    /**
    @utbot.classUnderTest {@link DefaultBoxAndWhiskerCategoryDataset}
 * @utbot.methodUnderTest {@link org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset#add(org.jfree.data.statistics.BoxAndWhiskerItem,java.lang.Comparable,java.lang.Comparable)}
 * @utbot.invokes {@link org.jfree.data.KeyedObjects2D#addObject(java.lang.Object,java.lang.Comparable,java.lang.Comparable)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: this.data.addObject(item, rowKey, columnKey);
 *  */
    @Test
    public void testAdd_ThrowNullPointerException() throws Exception  {
        DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset = ((DefaultBoxAndWhiskerCategoryDataset) createInstance("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset"));
        
        /* This test fails because method [org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset.add] produces [java.lang.NullPointerException]
            org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset.add(DefaultBoxAndWhiskerCategoryDataset.java:147) */
        defaultBoxAndWhiskerCategoryDataset.add(((BoxAndWhiskerItem) null), ((Comparable) null), ((Comparable) null));
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method add(org.jfree.data.statistics.BoxAndWhiskerItem, java.lang.Comparable, java.lang.Comparable)
    
    @Test
    public void testAdd1() throws Throwable  {
        DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset = ((DefaultBoxAndWhiskerCategoryDataset) createInstance("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset"));
        KeyedObjects2D data = ((KeyedObjects2D) createInstance("org.jfree.data.KeyedObjects2D"));
        ArrayList rowKeys = new ArrayList();
        setField(data, "org.jfree.data.KeyedObjects2D", "rowKeys", rowKeys);
        defaultBoxAndWhiskerCategoryDataset.data = data;
        MinguoEra minguoEra = MinguoEra.BEFORE_ROC;
        XYCoordinate xYCoordinate = new XYCoordinate();
        
        /* This test fails because method [org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset.add] produces [java.lang.NullPointerException]
            org.jfree.data.KeyedObjects2D.setObject(KeyedObjects2D.java:277)
            org.jfree.data.KeyedObjects2D.addObject(KeyedObjects2D.java:250)
            org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset.add(DefaultBoxAndWhiskerCategoryDataset.java:147) */
        Class defaultBoxAndWhiskerCategoryDatasetClazz = Class.forName("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset");
        Class boxAndWhiskerItemType = Class.forName("org.jfree.data.statistics.BoxAndWhiskerItem");
        Class minguoEraType = Class.forName("java.lang.Comparable");
        Method addMethod = defaultBoxAndWhiskerCategoryDatasetClazz.getDeclaredMethod("add", boxAndWhiskerItemType, minguoEraType, minguoEraType);
        addMethod.setAccessible(true);
        java.lang.Object[] addMethodArguments = new java.lang.Object[3];
        addMethodArguments[0] = ((Object) null);
        addMethodArguments[1] = minguoEra;
        addMethodArguments[2] = xYCoordinate;
        try {
            addMethod.invoke(defaultBoxAndWhiskerCategoryDataset, addMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region Errors report for add
    
    public void testAdd_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset.add
    
    ///region FUZZER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method add(java.util.List, java.lang.Comparable, java.lang.Comparable)
    
    /**
     * @utbot.classUnderTest {@link org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset}
     * @utbot.methodUnderTest {@link org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset#add(java.util.List,java.lang.Comparable,java.lang.Comparable)}
     */
    @Test(expected = IllegalArgumentException.class)
    public void testAddThrowsIAE() {
        DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset = new DefaultBoxAndWhiskerCategoryDataset();
        DatasetGroup datasetGroup = new DatasetGroup("XZ");
        defaultBoxAndWhiskerCategoryDataset.setGroup(datasetGroup);
        LinkedList linkedList = new LinkedList();
        Object object = new Object();
        linkedList.add(object);
        Object object1 = new Object();
        linkedList.add(object1);
        Object object2 = new Object();
        linkedList.add(object2);
        Object object3 = new Object();
        linkedList.add(object3);
        Object object4 = new Object();
        linkedList.add(object4);
        Date date = new Date(1, Integer.MIN_VALUE, Integer.MIN_VALUE, -1, Integer.MAX_VALUE);
        OHLCDataItem oHLCDataItem = new OHLCDataItem(date, java.lang.Double.POSITIVE_INFINITY, java.lang.Double.POSITIVE_INFINITY, java.lang.Double.POSITIVE_INFINITY, -1.0, java.lang.Double.POSITIVE_INFINITY);
        
        defaultBoxAndWhiskerCategoryDataset.add(linkedList, ((Comparable) null), ((Comparable) oHLCDataItem));
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset.equals
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method equals(java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link DefaultBoxAndWhiskerCategoryDataset}
 * @utbot.methodUnderTest {@link org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset#equals(java.lang.Object)}
 * @utbot.executesCondition {@code (obj): True}
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void testEquals_Obj() throws Exception  {
        DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset = ((DefaultBoxAndWhiskerCategoryDataset) createInstance("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset"));
        
        boolean actual = defaultBoxAndWhiskerCategoryDataset.equals(defaultBoxAndWhiskerCategoryDataset);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link DefaultBoxAndWhiskerCategoryDataset}
 * @utbot.methodUnderTest {@link org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset#equals(java.lang.Object)}
 * @utbot.executesCondition {@code (obj): False}
 * @utbot.executesCondition {@code (obj instanceof DefaultBoxAndWhiskerCategoryDataset): False}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testEquals_NotObjNotInstanceOfDefaultBoxAndWhiskerCategoryDataset() throws Exception  {
        DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset = ((DefaultBoxAndWhiskerCategoryDataset) createInstance("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset"));
        
        boolean actual = defaultBoxAndWhiskerCategoryDataset.equals(null);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link DefaultBoxAndWhiskerCategoryDataset}
 * @utbot.methodUnderTest {@link org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset#equals(java.lang.Object)}
 * @utbot.executesCondition {@code (obj): False}
 * @utbot.executesCondition {@code (obj instanceof DefaultBoxAndWhiskerCategoryDataset): True}
 * @utbot.returnsFrom {@code return ObjectUtilities.equal(this.data, dataset.data);}
 *  */
    @Test
    public void testEquals_ObjInstanceOfDefaultBoxAndWhiskerCategoryDataset_1() throws Exception  {
        DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset = ((DefaultBoxAndWhiskerCategoryDataset) createInstance("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset"));
        DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset1 = ((DefaultBoxAndWhiskerCategoryDataset) createInstance("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset"));
        KeyedObjects2D data = ((KeyedObjects2D) createInstance("org.jfree.data.KeyedObjects2D"));
        defaultBoxAndWhiskerCategoryDataset1.data = data;
        
        boolean actual = defaultBoxAndWhiskerCategoryDataset.equals(defaultBoxAndWhiskerCategoryDataset1);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link DefaultBoxAndWhiskerCategoryDataset}
 * @utbot.methodUnderTest {@link org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset#equals(java.lang.Object)}
 * @utbot.executesCondition {@code (obj): False}
 * @utbot.executesCondition {@code (obj instanceof DefaultBoxAndWhiskerCategoryDataset): True}
 * @utbot.returnsFrom {@code return ObjectUtilities.equal(this.data, dataset.data);}
 *  */
    @Test
    public void testEquals_ObjInstanceOfDefaultBoxAndWhiskerCategoryDataset_2() throws Exception  {
        DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset = ((DefaultBoxAndWhiskerCategoryDataset) createInstance("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset"));
        KeyedObjects2D data = ((KeyedObjects2D) createInstance("org.jfree.data.KeyedObjects2D"));
        defaultBoxAndWhiskerCategoryDataset.data = data;
        DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset1 = ((DefaultBoxAndWhiskerCategoryDataset) createInstance("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset"));
        
        boolean actual = defaultBoxAndWhiskerCategoryDataset.equals(defaultBoxAndWhiskerCategoryDataset1);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link DefaultBoxAndWhiskerCategoryDataset}
 * @utbot.methodUnderTest {@link org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset#equals(java.lang.Object)}
 * @utbot.executesCondition {@code (obj): False}
 * @utbot.executesCondition {@code (obj instanceof DefaultBoxAndWhiskerCategoryDataset): True}
 * @utbot.returnsFrom {@code return ObjectUtilities.equal(this.data, dataset.data);}
 *  */
    @Test
    public void testEquals_ObjInstanceOfDefaultBoxAndWhiskerCategoryDataset() throws Exception  {
        DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset = ((DefaultBoxAndWhiskerCategoryDataset) createInstance("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset"));
        DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset1 = ((DefaultBoxAndWhiskerCategoryDataset) createInstance("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset"));
        
        boolean actual = defaultBoxAndWhiskerCategoryDataset.equals(defaultBoxAndWhiskerCategoryDataset1);
        
        assertTrue(actual);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method equals(java.lang.Object)
    
    @Test
    public void testEquals1() throws Exception  {
        DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset = ((DefaultBoxAndWhiskerCategoryDataset) createInstance("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset"));
        KeyedObjects2D data = ((KeyedObjects2D) createInstance("org.jfree.data.KeyedObjects2D"));
        ArrayList rowKeys = new ArrayList();
        setField(data, "org.jfree.data.KeyedObjects2D", "rowKeys", rowKeys);
        defaultBoxAndWhiskerCategoryDataset.data = data;
        DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset1 = ((DefaultBoxAndWhiskerCategoryDataset) createInstance("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset"));
        KeyedObjects2D data1 = ((KeyedObjects2D) createInstance("org.jfree.data.KeyedObjects2D"));
        setField(data1, "org.jfree.data.KeyedObjects2D", "rowKeys", rowKeys);
        defaultBoxAndWhiskerCategoryDataset1.data = data1;
        
        /* This test fails because method [org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset.equals] produces [java.lang.NullPointerException]
            java.base/java.util.Collections.unmodifiableList(Collections.java:1319)
            org.jfree.data.KeyedObjects2D.getColumnKeys(KeyedObjects2D.java:198)
            org.jfree.data.KeyedObjects2D.equals(KeyedObjects2D.java:431)
            org.jfree.chart.util.ObjectUtilities.equal(ObjectUtilities.java:131)
            org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset.equals(DefaultBoxAndWhiskerCategoryDataset.java:758) */
        defaultBoxAndWhiskerCategoryDataset.equals(defaultBoxAndWhiskerCategoryDataset1);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset.clone
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method clone()
    
    /**
    @utbot.classUnderTest {@link DefaultBoxAndWhiskerCategoryDataset}
 * @utbot.methodUnderTest {@link org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset#clone()}
 * @utbot.invokes {@link org.jfree.data.general.AbstractDataset#clone()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: (DefaultBoxAndWhiskerCategoryDataset) super.clone()
 *  */
    @Test
    public void testClone_ThrowNullPointerException() throws Exception  {
        DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset = ((DefaultBoxAndWhiskerCategoryDataset) createInstance("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset"));
        
        /* This test fails because method [org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset.clone] produces [java.lang.NullPointerException]
            org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset.clone(DefaultBoxAndWhiskerCategoryDataset.java:773) */
        defaultBoxAndWhiskerCategoryDataset.clone();
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method clone()
    
    /**
     * @utbot.classUnderTest {@link org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset}
     * @utbot.methodUnderTest {@link org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset#clone()}
     */
    @Test
    public void testClone() throws Exception  {
        DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset = new DefaultBoxAndWhiskerCategoryDataset();
        DatasetGroup datasetGroup = new DatasetGroup();
        defaultBoxAndWhiskerCategoryDataset.setGroup(datasetGroup);
        
        DefaultBoxAndWhiskerCategoryDataset actual = ((DefaultBoxAndWhiskerCategoryDataset) defaultBoxAndWhiskerCategoryDataset.clone());
        
        DefaultBoxAndWhiskerCategoryDataset expected = ((DefaultBoxAndWhiskerCategoryDataset) createInstance("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset"));
        KeyedObjects2D data = ((KeyedObjects2D) createInstance("org.jfree.data.KeyedObjects2D"));
        ArrayList rowKeys = new ArrayList();
        setField(data, "org.jfree.data.KeyedObjects2D", "rowKeys", rowKeys);
        ArrayList columnKeys = new ArrayList();
        setField(data, "org.jfree.data.KeyedObjects2D", "columnKeys", columnKeys);
        ArrayList rows = new ArrayList();
        setField(data, "org.jfree.data.KeyedObjects2D", "rows", rows);
        expected.data = data;
        setField(expected, "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "minimumRangeValue", java.lang.Double.NaN);
        setField(expected, "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "minimumRangeValueRow", -1);
        setField(expected, "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "minimumRangeValueColumn", -1);
        setField(expected, "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "maximumRangeValue", java.lang.Double.NaN);
        setField(expected, "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "maximumRangeValueRow", -1);
        setField(expected, "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "maximumRangeValueColumn", -1);
        Range rangeBounds = ((Range) createInstance("org.jfree.data.Range"));
        setField(rangeBounds, "org.jfree.data.Range", "lower", 0.0);
        setField(rangeBounds, "org.jfree.data.Range", "upper", 0.0);
        setField(expected, "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "rangeBounds", rangeBounds);
        DatasetGroup group = ((DatasetGroup) createInstance("org.jfree.data.general.DatasetGroup"));
        String id = "NOID";
        setField(group, "org.jfree.data.general.DatasetGroup", "id", id);
        expected.setGroup(group);
        EventListenerList listenerList = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
        setField(expected, "org.jfree.data.general.AbstractDataset", "listenerList", listenerList);
        
        // org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset.getValue
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method getValue(java.lang.Comparable, java.lang.Comparable)
    
    /**
    @utbot.classUnderTest {@link DefaultBoxAndWhiskerCategoryDataset}
 * @utbot.methodUnderTest {@link org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset#getValue(java.lang.Comparable,java.lang.Comparable)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return getMedianValue(rowKey, columnKey);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testGetValue_ThrowIllegalArgumentException() throws Exception  {
        DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset = ((DefaultBoxAndWhiskerCategoryDataset) createInstance("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset"));
        KeyedObjects2D data = ((KeyedObjects2D) createInstance("org.jfree.data.KeyedObjects2D"));
        defaultBoxAndWhiskerCategoryDataset.data = data;
        
        defaultBoxAndWhiskerCategoryDataset.getValue(((Comparable) null), ((Comparable) null));
    }
    
    /**
    @utbot.classUnderTest {@link DefaultBoxAndWhiskerCategoryDataset}
 * @utbot.methodUnderTest {@link org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset#getValue(java.lang.Comparable,java.lang.Comparable)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return getMedianValue(rowKey, columnKey);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testGetValue_ThrowIllegalArgumentException_1() throws Exception  {
        DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset = ((DefaultBoxAndWhiskerCategoryDataset) createInstance("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset"));
        KeyedObjects2D data = ((KeyedObjects2D) createInstance("org.jfree.data.KeyedObjects2D"));
        defaultBoxAndWhiskerCategoryDataset.data = data;
        Integer integer = 0;
        
        defaultBoxAndWhiskerCategoryDataset.getValue(((Comparable) integer), ((Comparable) null));
    }
    ///endregion
    
    ///region FUZZER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method getValue(java.lang.Comparable, java.lang.Comparable)
    
    /**
     * @utbot.classUnderTest {@link org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset}
     * @utbot.methodUnderTest {@link org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset#getValue(java.lang.Comparable,java.lang.Comparable)}
     */
    @Test(expected = UnknownKeyException.class)
    public void testGetValueThrowsUKE() {
        DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset = new DefaultBoxAndWhiskerCategoryDataset();
        DatasetGroup datasetGroup = new DatasetGroup("");
        defaultBoxAndWhiskerCategoryDataset.setGroup(datasetGroup);
        SimpleTimePeriod simpleTimePeriod = new SimpleTimePeriod(java.lang.Long.MIN_VALUE, -1L);
        XYCoordinate xYCoordinate = new XYCoordinate(-1.0, -1.0);
        
        defaultBoxAndWhiskerCategoryDataset.getValue(simpleTimePeriod, xYCoordinate);
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method getValue(java.lang.Comparable, java.lang.Comparable)
    
    @Test(expected = UnknownKeyException.class)
    public void testGetValue1() throws Throwable  {
        DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset = ((DefaultBoxAndWhiskerCategoryDataset) createInstance("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset"));
        KeyedObjects2D data = ((KeyedObjects2D) createInstance("org.jfree.data.KeyedObjects2D"));
        ArrayList rowKeys = new ArrayList();
        Integer integer = 0;
        rowKeys.add(integer);
        rowKeys.add(defaultBoxAndWhiskerCategoryDataset);
        rowKeys.add(defaultBoxAndWhiskerCategoryDataset);
        setField(data, "org.jfree.data.KeyedObjects2D", "rowKeys", rowKeys);
        defaultBoxAndWhiskerCategoryDataset.data = data;
        Integer integer1 = -1;
        Class qtypeClazz = Class.forName("java.util.regex.Pattern$Qtype");
        Object qtype = getEnumConstantByName(qtypeClazz, "GREEDY");
        
        Class defaultBoxAndWhiskerCategoryDatasetClazz = Class.forName("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset");
        Class integer1Type = Class.forName("java.lang.Comparable");
        Method getValueMethod = defaultBoxAndWhiskerCategoryDatasetClazz.getDeclaredMethod("getValue", integer1Type, integer1Type);
        getValueMethod.setAccessible(true);
        java.lang.Object[] getValueMethodArguments = new java.lang.Object[2];
        getValueMethodArguments[0] = integer1;
        getValueMethodArguments[1] = qtype;
        try {
            getValueMethod.invoke(defaultBoxAndWhiskerCategoryDataset, getValueMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = UnknownKeyException.class)
    public void testGetValue2() throws Throwable  {
        DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset = ((DefaultBoxAndWhiskerCategoryDataset) createInstance("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset"));
        KeyedObjects2D data = ((KeyedObjects2D) createInstance("org.jfree.data.KeyedObjects2D"));
        ArrayList rowKeys = new ArrayList();
        Integer integer = 0;
        rowKeys.add(integer);
        rowKeys.add(null);
        rowKeys.add(null);
        setField(data, "org.jfree.data.KeyedObjects2D", "rowKeys", rowKeys);
        setField(data, "org.jfree.data.KeyedObjects2D", "columnKeys", rowKeys);
        defaultBoxAndWhiskerCategoryDataset.data = data;
        Class basicTypeClazz = Class.forName("java.lang.invoke.LambdaForm$BasicType");
        Object basicType = getEnumConstantByName(basicTypeClazz, "L_TYPE");
        
        Class defaultBoxAndWhiskerCategoryDatasetClazz = Class.forName("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset");
        Class integerType = Class.forName("java.lang.Comparable");
        Method getValueMethod = defaultBoxAndWhiskerCategoryDatasetClazz.getDeclaredMethod("getValue", integerType, integerType);
        getValueMethod.setAccessible(true);
        java.lang.Object[] getValueMethodArguments = new java.lang.Object[2];
        getValueMethodArguments[0] = integer;
        getValueMethodArguments[1] = basicType;
        try {
            getValueMethod.invoke(defaultBoxAndWhiskerCategoryDataset, getValueMethodArguments);
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
    
    ///region Test suites for executable org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset.getValue
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getValue(int, int)
    
    /**
    @utbot.classUnderTest {@link DefaultBoxAndWhiskerCategoryDataset}
 * @utbot.methodUnderTest {@link org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset#getValue(int,int)}
 * @utbot.returnsFrom {@code return getMedianValue(row, column);}
 *  */
    @Test
    public void testGetValue_ReturnGetMedianValue() throws Exception  {
        DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset = ((DefaultBoxAndWhiskerCategoryDataset) createInstance("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset"));
        KeyedObjects2D data = ((KeyedObjects2D) createInstance("org.jfree.data.KeyedObjects2D"));
        ArrayList rows = new ArrayList();
        rows.add(null);
        setField(data, "org.jfree.data.KeyedObjects2D", "rows", rows);
        defaultBoxAndWhiskerCategoryDataset.data = data;
        
        Number actual = defaultBoxAndWhiskerCategoryDataset.getValue(0, -255);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link DefaultBoxAndWhiskerCategoryDataset}
 * @utbot.methodUnderTest {@link org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset#getValue(int,int)}
 * @utbot.returnsFrom {@code return getMedianValue(row, column);}
 *  */
    @Test
    public void testGetValue_ReturnGetMedianValue_1() throws Exception  {
        DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset = ((DefaultBoxAndWhiskerCategoryDataset) createInstance("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset"));
        KeyedObjects2D data = ((KeyedObjects2D) createInstance("org.jfree.data.KeyedObjects2D"));
        ArrayList columnKeys = new ArrayList();
        KeyedObjects keyedObjects = ((KeyedObjects) createInstance("org.jfree.data.KeyedObjects"));
        columnKeys.add(keyedObjects);
        columnKeys.add(null);
        columnKeys.add(null);
        setField(data, "org.jfree.data.KeyedObjects2D", "columnKeys", columnKeys);
        setField(data, "org.jfree.data.KeyedObjects2D", "rows", columnKeys);
        defaultBoxAndWhiskerCategoryDataset.data = data;
        
        Number actual = defaultBoxAndWhiskerCategoryDataset.getValue(0, 2);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getValue(int, int)
    
    /**
    @utbot.classUnderTest {@link DefaultBoxAndWhiskerCategoryDataset}
 * @utbot.methodUnderTest {@link org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset#getValue(int,int)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: return getMedianValue(row, column);
 *  */
    @Test
    public void testGetValue_ThrowClassCastException() throws Exception  {
        DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset = ((DefaultBoxAndWhiskerCategoryDataset) createInstance("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset"));
        KeyedObjects2D data = ((KeyedObjects2D) createInstance("org.jfree.data.KeyedObjects2D"));
        ArrayList rows = new ArrayList();
        Object object = createInstance("java.lang.Object");
        rows.add(object);
        setField(data, "org.jfree.data.KeyedObjects2D", "rows", rows);
        defaultBoxAndWhiskerCategoryDataset.data = data;
        
        /* This test fails because method [org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset.getValue] produces [java.lang.ClassCastException: class java.lang.Object cannot be cast to class org.jfree.data.KeyedObjects (java.lang.Object is in module java.base of loader 'bootstrap'; org.jfree.data.KeyedObjects is in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @731af3fd)]
            org.jfree.data.KeyedObjects2D.getObject(KeyedObjects2D.java:114)
            org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset.getMedianValue(DefaultBoxAndWhiskerCategoryDataset.java:291)
            org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset.getValue(DefaultBoxAndWhiskerCategoryDataset.java:219) */
        defaultBoxAndWhiskerCategoryDataset.getValue(0, -255);
    }
    
    /**
    @utbot.classUnderTest {@link DefaultBoxAndWhiskerCategoryDataset}
 * @utbot.methodUnderTest {@link org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset#getValue(int,int)}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: return getMedianValue(row, column);
 *  */
    @Test
    public void testGetValue_ThrowIndexOutOfBoundsException_1() throws Exception  {
        DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset = ((DefaultBoxAndWhiskerCategoryDataset) createInstance("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset"));
        KeyedObjects2D data = ((KeyedObjects2D) createInstance("org.jfree.data.KeyedObjects2D"));
        ArrayList columnKeys = new ArrayList();
        KeyedObjects keyedObjects = ((KeyedObjects) createInstance("org.jfree.data.KeyedObjects"));
        columnKeys.add(keyedObjects);
        setField(data, "org.jfree.data.KeyedObjects2D", "columnKeys", columnKeys);
        setField(data, "org.jfree.data.KeyedObjects2D", "rows", columnKeys);
        defaultBoxAndWhiskerCategoryDataset.data = data;
        
        /* This test fails because method [org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset.getValue] produces [java.lang.IndexOutOfBoundsException: Index -1 out of bounds for length 1]
            java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
            java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
            java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:266)
            java.base/java.util.Objects.checkIndex(Objects.java:359)
            java.base/java.util.ArrayList.get(ArrayList.java:427)
            org.jfree.data.KeyedObjects2D.getObject(KeyedObjects2D.java:116)
            org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset.getMedianValue(DefaultBoxAndWhiskerCategoryDataset.java:291)
            org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset.getValue(DefaultBoxAndWhiskerCategoryDataset.java:219) */
        defaultBoxAndWhiskerCategoryDataset.getValue(0, -1);
    }
    
    /**
    @utbot.classUnderTest {@link DefaultBoxAndWhiskerCategoryDataset}
 * @utbot.methodUnderTest {@link org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset#getValue(int,int)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: return getMedianValue(row, column);
 *  */
    @Test
    public void testGetValue_ThrowClassCastException_1() throws Exception  {
        DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset = ((DefaultBoxAndWhiskerCategoryDataset) createInstance("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset"));
        KeyedObjects2D data = ((KeyedObjects2D) createInstance("org.jfree.data.KeyedObjects2D"));
        ArrayList columnKeys = new ArrayList();
        KeyedObjects keyedObjects = ((KeyedObjects) createInstance("org.jfree.data.KeyedObjects"));
        columnKeys.add(keyedObjects);
        columnKeys.add(null);
        columnKeys.add(null);
        setField(data, "org.jfree.data.KeyedObjects2D", "columnKeys", columnKeys);
        setField(data, "org.jfree.data.KeyedObjects2D", "rows", columnKeys);
        defaultBoxAndWhiskerCategoryDataset.data = data;
        
        /* This test fails because method [org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset.getValue] produces [java.lang.ClassCastException: class org.jfree.data.KeyedObjects cannot be cast to class java.lang.Comparable (org.jfree.data.KeyedObjects is in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @731af3fd; java.lang.Comparable is in module java.base of loader 'bootstrap')]
            org.jfree.data.KeyedObjects2D.getObject(KeyedObjects2D.java:116)
            org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset.getMedianValue(DefaultBoxAndWhiskerCategoryDataset.java:291)
            org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset.getValue(DefaultBoxAndWhiskerCategoryDataset.java:219) */
        defaultBoxAndWhiskerCategoryDataset.getValue(0, 0);
    }
    
    /**
    @utbot.classUnderTest {@link DefaultBoxAndWhiskerCategoryDataset}
 * @utbot.methodUnderTest {@link org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset#getValue(int,int)}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: return getMedianValue(row, column);
 *  */
    @Test
    public void testGetValue_ThrowIndexOutOfBoundsException() throws Exception  {
        DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset = ((DefaultBoxAndWhiskerCategoryDataset) createInstance("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset"));
        KeyedObjects2D data = ((KeyedObjects2D) createInstance("org.jfree.data.KeyedObjects2D"));
        ArrayList rows = new ArrayList();
        rows.add(null);
        rows.add(null);
        rows.add(null);
        setField(data, "org.jfree.data.KeyedObjects2D", "rows", rows);
        defaultBoxAndWhiskerCategoryDataset.data = data;
        
        /* This test fails because method [org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset.getValue] produces [java.lang.IndexOutOfBoundsException: Index -1 out of bounds for length 3]
            java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
            java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
            java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:266)
            java.base/java.util.Objects.checkIndex(Objects.java:359)
            java.base/java.util.ArrayList.get(ArrayList.java:427)
            org.jfree.data.KeyedObjects2D.getObject(KeyedObjects2D.java:114)
            org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset.getMedianValue(DefaultBoxAndWhiskerCategoryDataset.java:291)
            org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset.getValue(DefaultBoxAndWhiskerCategoryDataset.java:219) */
        defaultBoxAndWhiskerCategoryDataset.getValue(-1, -255);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method getValue(int, int)
    
    @Test
    public void testGetValue3() throws Exception  {
        DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset = ((DefaultBoxAndWhiskerCategoryDataset) createInstance("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset"));
        KeyedObjects2D data = ((KeyedObjects2D) createInstance("org.jfree.data.KeyedObjects2D"));
        ArrayList columnKeys = new ArrayList();
        KeyedObject keyedObject = ((KeyedObject) createInstance("org.jfree.data.KeyedObject"));
        Integer key = 0;
        setField(keyedObject, "org.jfree.data.KeyedObject", "key", key);
        columnKeys.add(keyedObject);
        KeyedObjects keyedObjects = ((KeyedObjects) createInstance("org.jfree.data.KeyedObjects"));
        setField(keyedObjects, "org.jfree.data.KeyedObjects", "data", columnKeys);
        columnKeys.add(keyedObjects);
        Integer integer = 0;
        columnKeys.add(integer);
        setField(data, "org.jfree.data.KeyedObjects2D", "columnKeys", columnKeys);
        setField(data, "org.jfree.data.KeyedObjects2D", "rows", columnKeys);
        defaultBoxAndWhiskerCategoryDataset.data = data;
        
        Number actual = defaultBoxAndWhiskerCategoryDataset.getValue(1, 2);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method getValue(int, int)
    
    @Test
    public void testGetValue4() throws Exception  {
        DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset = ((DefaultBoxAndWhiskerCategoryDataset) createInstance("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset"));
        KeyedObjects2D data = ((KeyedObjects2D) createInstance("org.jfree.data.KeyedObjects2D"));
        ArrayList columnKeys = new ArrayList();
        KeyedObjects keyedObjects = ((KeyedObjects) createInstance("org.jfree.data.KeyedObjects"));
        columnKeys.add(keyedObjects);
        LinkedList linkedList = new LinkedList();
        columnKeys.add(linkedList);
        columnKeys.add(linkedList);
        setField(data, "org.jfree.data.KeyedObjects2D", "columnKeys", columnKeys);
        setField(data, "org.jfree.data.KeyedObjects2D", "rows", linkedList);
        defaultBoxAndWhiskerCategoryDataset.data = data;
        
        /* This test fails because method [org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset.getValue] produces [java.lang.IndexOutOfBoundsException: Index: 0, Size: 0]
            java.base/java.util.LinkedList.checkElementIndex(LinkedList.java:559)
            java.base/java.util.LinkedList.get(LinkedList.java:480)
            org.jfree.data.KeyedObjects2D.getObject(KeyedObjects2D.java:114)
            org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset.getMedianValue(DefaultBoxAndWhiskerCategoryDataset.java:291)
            org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset.getValue(DefaultBoxAndWhiskerCategoryDataset.java:219) */
        defaultBoxAndWhiskerCategoryDataset.getValue(0, 0);
    }
    
    @Test
    public void testGetValue5() throws Exception  {
        DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset = ((DefaultBoxAndWhiskerCategoryDataset) createInstance("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset"));
        KeyedObjects2D data = ((KeyedObjects2D) createInstance("org.jfree.data.KeyedObjects2D"));
        ArrayList columnKeys = new ArrayList();
        KeyedObject keyedObject = ((KeyedObject) createInstance("org.jfree.data.KeyedObject"));
        Integer key = 511;
        setField(keyedObject, "org.jfree.data.KeyedObject", "key", key);
        columnKeys.add(keyedObject);
        Object object = createInstance("java.lang.Object");
        columnKeys.add(object);
        Integer integer = 0;
        columnKeys.add(integer);
        columnKeys.add(object);
        KeyedObjects keyedObjects = ((KeyedObjects) createInstance("org.jfree.data.KeyedObjects"));
        setField(keyedObjects, "org.jfree.data.KeyedObjects", "data", columnKeys);
        columnKeys.add(keyedObjects);
        columnKeys.add(object);
        columnKeys.add(object);
        setField(data, "org.jfree.data.KeyedObjects2D", "columnKeys", columnKeys);
        setField(data, "org.jfree.data.KeyedObjects2D", "rows", columnKeys);
        defaultBoxAndWhiskerCategoryDataset.data = data;
        
        /* This test fails because method [org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset.getValue] produces [java.lang.ClassCastException: class java.lang.Object cannot be cast to class org.jfree.data.KeyedObject (java.lang.Object is in module java.base of loader 'bootstrap'; org.jfree.data.KeyedObject is in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @731af3fd)]
            org.jfree.data.KeyedObjects.getIndex(KeyedObjects.java:134)
            org.jfree.data.KeyedObjects2D.getObject(KeyedObjects2D.java:118)
            org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset.getMedianValue(DefaultBoxAndWhiskerCategoryDataset.java:291)
            org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset.getValue(DefaultBoxAndWhiskerCategoryDataset.java:219) */
        defaultBoxAndWhiskerCategoryDataset.getValue(4, 2);
    }
    
    @Test
    public void testGetValue6() throws Exception  {
        DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset = ((DefaultBoxAndWhiskerCategoryDataset) createInstance("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset"));
        KeyedObjects2D data = ((KeyedObjects2D) createInstance("org.jfree.data.KeyedObjects2D"));
        ArrayList columnKeys = new ArrayList();
        Object processHandleImpl = createInstance("java.lang.ProcessHandleImpl");
        columnKeys.add(processHandleImpl);
        KeyedObjects keyedObjects = ((KeyedObjects) createInstance("org.jfree.data.KeyedObjects"));
        ArrayList data1 = new ArrayList();
        data1.add(null);
        data1.add(null);
        data1.add(null);
        setField(keyedObjects, "org.jfree.data.KeyedObjects", "data", data1);
        columnKeys.add(keyedObjects);
        columnKeys.add(null);
        setField(data, "org.jfree.data.KeyedObjects2D", "columnKeys", columnKeys);
        setField(data, "org.jfree.data.KeyedObjects2D", "rows", columnKeys);
        defaultBoxAndWhiskerCategoryDataset.data = data;
        
        /* This test fails because method [org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset.getValue] produces [java.lang.NullPointerException]
            org.jfree.data.KeyedObjects.getIndex(KeyedObjects.java:135)
            org.jfree.data.KeyedObjects2D.getObject(KeyedObjects2D.java:118)
            org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset.getMedianValue(DefaultBoxAndWhiskerCategoryDataset.java:291)
            org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset.getValue(DefaultBoxAndWhiskerCategoryDataset.java:219) */
        defaultBoxAndWhiskerCategoryDataset.getValue(1, 0);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset.getItem
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getItem(int, int)
    
    /**
    @utbot.classUnderTest {@link DefaultBoxAndWhiskerCategoryDataset}
 * @utbot.methodUnderTest {@link org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset#getItem(int,int)}
 * @utbot.returnsFrom {@code return (BoxAndWhiskerItem) this.data.getObject(row, column);}
 *  */
    @Test
    public void testGetItem_ReturnThisDataGetObjectRowcolumn() throws Exception  {
        DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset = ((DefaultBoxAndWhiskerCategoryDataset) createInstance("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset"));
        KeyedObjects2D data = ((KeyedObjects2D) createInstance("org.jfree.data.KeyedObjects2D"));
        ArrayList rows = new ArrayList();
        rows.add(null);
        setField(data, "org.jfree.data.KeyedObjects2D", "rows", rows);
        defaultBoxAndWhiskerCategoryDataset.data = data;
        
        BoxAndWhiskerItem actual = defaultBoxAndWhiskerCategoryDataset.getItem(0, -255);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link DefaultBoxAndWhiskerCategoryDataset}
 * @utbot.methodUnderTest {@link org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset#getItem(int,int)}
 * @utbot.returnsFrom {@code return (BoxAndWhiskerItem) this.data.getObject(row, column);}
 *  */
    @Test
    public void testGetItem_ReturnThisDataGetObjectRowcolumn_1() throws Exception  {
        DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset = ((DefaultBoxAndWhiskerCategoryDataset) createInstance("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset"));
        KeyedObjects2D data = ((KeyedObjects2D) createInstance("org.jfree.data.KeyedObjects2D"));
        ArrayList columnKeys = new ArrayList();
        KeyedObjects keyedObjects = ((KeyedObjects) createInstance("org.jfree.data.KeyedObjects"));
        columnKeys.add(keyedObjects);
        columnKeys.add(null);
        columnKeys.add(null);
        setField(data, "org.jfree.data.KeyedObjects2D", "columnKeys", columnKeys);
        setField(data, "org.jfree.data.KeyedObjects2D", "rows", columnKeys);
        defaultBoxAndWhiskerCategoryDataset.data = data;
        
        BoxAndWhiskerItem actual = defaultBoxAndWhiskerCategoryDataset.getItem(0, 2);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getItem(int, int)
    
    /**
    @utbot.classUnderTest {@link DefaultBoxAndWhiskerCategoryDataset}
 * @utbot.methodUnderTest {@link org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset#getItem(int,int)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: return (BoxAndWhiskerItem) this.data.getObject(row, column);
 *  */
    @Test
    public void testGetItem_ThrowClassCastException() throws Exception  {
        DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset = ((DefaultBoxAndWhiskerCategoryDataset) createInstance("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset"));
        KeyedObjects2D data = ((KeyedObjects2D) createInstance("org.jfree.data.KeyedObjects2D"));
        ArrayList rows = new ArrayList();
        Object object = createInstance("java.lang.Object");
        rows.add(object);
        setField(data, "org.jfree.data.KeyedObjects2D", "rows", rows);
        defaultBoxAndWhiskerCategoryDataset.data = data;
        
        /* This test fails because method [org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset.getItem] produces [java.lang.ClassCastException: class java.lang.Object cannot be cast to class org.jfree.data.KeyedObjects (java.lang.Object is in module java.base of loader 'bootstrap'; org.jfree.data.KeyedObjects is in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @731af3fd)]
            org.jfree.data.KeyedObjects2D.getObject(KeyedObjects2D.java:114)
            org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset.getItem(DefaultBoxAndWhiskerCategoryDataset.java:204) */
        defaultBoxAndWhiskerCategoryDataset.getItem(0, -255);
    }
    
    /**
    @utbot.classUnderTest {@link DefaultBoxAndWhiskerCategoryDataset}
 * @utbot.methodUnderTest {@link org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset#getItem(int,int)}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: return (BoxAndWhiskerItem) this.data.getObject(row, column);
 *  */
    @Test
    public void testGetItem_ThrowIndexOutOfBoundsException_1() throws Exception  {
        DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset = ((DefaultBoxAndWhiskerCategoryDataset) createInstance("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset"));
        KeyedObjects2D data = ((KeyedObjects2D) createInstance("org.jfree.data.KeyedObjects2D"));
        ArrayList columnKeys = new ArrayList();
        KeyedObjects keyedObjects = ((KeyedObjects) createInstance("org.jfree.data.KeyedObjects"));
        columnKeys.add(keyedObjects);
        columnKeys.add(null);
        columnKeys.add(null);
        setField(data, "org.jfree.data.KeyedObjects2D", "columnKeys", columnKeys);
        setField(data, "org.jfree.data.KeyedObjects2D", "rows", columnKeys);
        defaultBoxAndWhiskerCategoryDataset.data = data;
        
        /* This test fails because method [org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset.getItem] produces [java.lang.IndexOutOfBoundsException: Index 130 out of bounds for length 3]
            java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
            java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
            java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:266)
            java.base/java.util.Objects.checkIndex(Objects.java:359)
            java.base/java.util.ArrayList.get(ArrayList.java:427)
            org.jfree.data.KeyedObjects2D.getObject(KeyedObjects2D.java:116)
            org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset.getItem(DefaultBoxAndWhiskerCategoryDataset.java:204) */
        defaultBoxAndWhiskerCategoryDataset.getItem(0, 130);
    }
    
    /**
    @utbot.classUnderTest {@link DefaultBoxAndWhiskerCategoryDataset}
 * @utbot.methodUnderTest {@link org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset#getItem(int,int)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: return (BoxAndWhiskerItem) this.data.getObject(row, column);
 *  */
    @Test
    public void testGetItem_ThrowClassCastException_1() throws Exception  {
        DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset = ((DefaultBoxAndWhiskerCategoryDataset) createInstance("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset"));
        KeyedObjects2D data = ((KeyedObjects2D) createInstance("org.jfree.data.KeyedObjects2D"));
        ArrayList columnKeys = new ArrayList();
        KeyedObjects keyedObjects = ((KeyedObjects) createInstance("org.jfree.data.KeyedObjects"));
        columnKeys.add(keyedObjects);
        columnKeys.add(null);
        columnKeys.add(null);
        setField(data, "org.jfree.data.KeyedObjects2D", "columnKeys", columnKeys);
        setField(data, "org.jfree.data.KeyedObjects2D", "rows", columnKeys);
        defaultBoxAndWhiskerCategoryDataset.data = data;
        
        /* This test fails because method [org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset.getItem] produces [java.lang.ClassCastException: class org.jfree.data.KeyedObjects cannot be cast to class java.lang.Comparable (org.jfree.data.KeyedObjects is in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @731af3fd; java.lang.Comparable is in module java.base of loader 'bootstrap')]
            org.jfree.data.KeyedObjects2D.getObject(KeyedObjects2D.java:116)
            org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset.getItem(DefaultBoxAndWhiskerCategoryDataset.java:204) */
        defaultBoxAndWhiskerCategoryDataset.getItem(0, 0);
    }
    
    /**
    @utbot.classUnderTest {@link DefaultBoxAndWhiskerCategoryDataset}
 * @utbot.methodUnderTest {@link org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset#getItem(int,int)}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: return (BoxAndWhiskerItem) this.data.getObject(row, column);
 *  */
    @Test
    public void testGetItem_ThrowIndexOutOfBoundsException() throws Exception  {
        DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset = ((DefaultBoxAndWhiskerCategoryDataset) createInstance("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset"));
        KeyedObjects2D data = ((KeyedObjects2D) createInstance("org.jfree.data.KeyedObjects2D"));
        ArrayList rows = new ArrayList();
        rows.add(null);
        rows.add(null);
        rows.add(null);
        setField(data, "org.jfree.data.KeyedObjects2D", "rows", rows);
        defaultBoxAndWhiskerCategoryDataset.data = data;
        
        /* This test fails because method [org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset.getItem] produces [java.lang.IndexOutOfBoundsException: Index -1 out of bounds for length 3]
            java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
            java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
            java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:266)
            java.base/java.util.Objects.checkIndex(Objects.java:359)
            java.base/java.util.ArrayList.get(ArrayList.java:427)
            org.jfree.data.KeyedObjects2D.getObject(KeyedObjects2D.java:114)
            org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset.getItem(DefaultBoxAndWhiskerCategoryDataset.java:204) */
        defaultBoxAndWhiskerCategoryDataset.getItem(-1, -255);
    }
    
    /**
    @utbot.classUnderTest {@link DefaultBoxAndWhiskerCategoryDataset}
 * @utbot.methodUnderTest {@link org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset#getItem(int,int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return (BoxAndWhiskerItem) this.data.getObject(row, column);
 *  */
    @Test
    public void testGetItem_ThrowNullPointerException() throws Exception  {
        DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset = ((DefaultBoxAndWhiskerCategoryDataset) createInstance("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset"));
        
        /* This test fails because method [org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset.getItem] produces [java.lang.NullPointerException]
            org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset.getItem(DefaultBoxAndWhiskerCategoryDataset.java:204) */
        defaultBoxAndWhiskerCategoryDataset.getItem(-255, -255);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method getItem(int, int)
    
    @Test
    public void testGetItem1() throws Exception  {
        DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset = ((DefaultBoxAndWhiskerCategoryDataset) createInstance("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset"));
        KeyedObjects2D data = ((KeyedObjects2D) createInstance("org.jfree.data.KeyedObjects2D"));
        ArrayList columnKeys = new ArrayList();
        HijrahChronology hijrahChronology = ((HijrahChronology) createInstance("java.time.chrono.HijrahChronology"));
        columnKeys.add(hijrahChronology);
        Object object = createInstance("java.lang.Object");
        columnKeys.add(object);
        columnKeys.add(object);
        setField(data, "org.jfree.data.KeyedObjects2D", "columnKeys", columnKeys);
        ArrayList rows = new ArrayList();
        rows.add(hijrahChronology);
        rows.add(object);
        KeyedObjects keyedObjects = ((KeyedObjects) createInstance("org.jfree.data.KeyedObjects"));
        ArrayList data1 = new ArrayList();
        setField(keyedObjects, "org.jfree.data.KeyedObjects", "data", data1);
        rows.add(keyedObjects);
        setField(data, "org.jfree.data.KeyedObjects2D", "rows", rows);
        defaultBoxAndWhiskerCategoryDataset.data = data;
        
        BoxAndWhiskerItem actual = defaultBoxAndWhiskerCategoryDataset.getItem(2, 0);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method getItem(int, int)
    
    @Test
    public void testGetItem2() throws Exception  {
        DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset = ((DefaultBoxAndWhiskerCategoryDataset) createInstance("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset"));
        KeyedObjects2D data = ((KeyedObjects2D) createInstance("org.jfree.data.KeyedObjects2D"));
        ArrayList columnKeys = new ArrayList();
        XMLSecurityPropertyManager.State state = XMLSecurityPropertyManager.State.DEFAULT;
        columnKeys.add(state);
        columnKeys.add(null);
        columnKeys.add(null);
        setField(data, "org.jfree.data.KeyedObjects2D", "columnKeys", columnKeys);
        ArrayList rows = new ArrayList();
        rows.add(state);
        rows.add(null);
        rows.add(null);
        rows.add(null);
        KeyedObjects keyedObjects = ((KeyedObjects) createInstance("org.jfree.data.KeyedObjects"));
        setField(keyedObjects, "org.jfree.data.KeyedObjects", "data", rows);
        rows.add(keyedObjects);
        rows.add(null);
        rows.add(null);
        setField(data, "org.jfree.data.KeyedObjects2D", "rows", rows);
        defaultBoxAndWhiskerCategoryDataset.data = data;
        
        /* This test fails because method [org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset.getItem] produces [java.lang.ClassCastException: class com.sun.org.apache.xerces.internal.utils.XMLSecurityPropertyManager$State cannot be cast to class org.jfree.data.KeyedObject (com.sun.org.apache.xerces.internal.utils.XMLSecurityPropertyManager$State is in module java.xml of loader 'bootstrap'; org.jfree.data.KeyedObject is in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @731af3fd)]
            org.jfree.data.KeyedObjects.getIndex(KeyedObjects.java:134)
            org.jfree.data.KeyedObjects2D.getObject(KeyedObjects2D.java:118)
            org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset.getItem(DefaultBoxAndWhiskerCategoryDataset.java:204) */
        defaultBoxAndWhiskerCategoryDataset.getItem(4, 0);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset.getQ3Value
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method getQ3Value(java.lang.Comparable, java.lang.Comparable)
    
    /**
    @utbot.classUnderTest {@link DefaultBoxAndWhiskerCategoryDataset}
 * @utbot.methodUnderTest {@link org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset#getQ3Value(java.lang.Comparable,java.lang.Comparable)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: BoxAndWhiskerItem item = (BoxAndWhiskerItem) this.data.getObject(rowKey, columnKey);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testGetQ3Value_ThrowIllegalArgumentException() throws Exception  {
        DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset = ((DefaultBoxAndWhiskerCategoryDataset) createInstance("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset"));
        KeyedObjects2D data = ((KeyedObjects2D) createInstance("org.jfree.data.KeyedObjects2D"));
        defaultBoxAndWhiskerCategoryDataset.data = data;
        
        defaultBoxAndWhiskerCategoryDataset.getQ3Value(((Comparable) null), ((Comparable) null));
    }
    
    /**
    @utbot.classUnderTest {@link DefaultBoxAndWhiskerCategoryDataset}
 * @utbot.methodUnderTest {@link org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset#getQ3Value(java.lang.Comparable,java.lang.Comparable)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: BoxAndWhiskerItem item = (BoxAndWhiskerItem) this.data.getObject(rowKey, columnKey);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testGetQ3Value_ThrowIllegalArgumentException_1() throws Exception  {
        DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset = ((DefaultBoxAndWhiskerCategoryDataset) createInstance("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset"));
        KeyedObjects2D data = ((KeyedObjects2D) createInstance("org.jfree.data.KeyedObjects2D"));
        defaultBoxAndWhiskerCategoryDataset.data = data;
        Integer integer = 0;
        
        defaultBoxAndWhiskerCategoryDataset.getQ3Value(((Comparable) integer), ((Comparable) null));
    }
    
    /**
    @utbot.classUnderTest {@link DefaultBoxAndWhiskerCategoryDataset}
 * @utbot.methodUnderTest {@link org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset#getQ3Value(java.lang.Comparable,java.lang.Comparable)}
 * @utbot.throwsException {@link org.jfree.data.UnknownKeyException} in: BoxAndWhiskerItem item = (BoxAndWhiskerItem) this.data.getObject(rowKey, columnKey);
 *  */
    @Test(expected = UnknownKeyException.class)
    public void testGetQ3Value_ThrowUnknownKeyException() throws Exception  {
        DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset = ((DefaultBoxAndWhiskerCategoryDataset) createInstance("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset"));
        KeyedObjects2D data = ((KeyedObjects2D) createInstance("org.jfree.data.KeyedObjects2D"));
        ArrayList rowKeys = new ArrayList();
        setField(data, "org.jfree.data.KeyedObjects2D", "rowKeys", rowKeys);
        defaultBoxAndWhiskerCategoryDataset.data = data;
        Integer integer = 0;
        
        defaultBoxAndWhiskerCategoryDataset.getQ3Value(((Comparable) integer), ((Comparable) integer));
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getQ3Value(java.lang.Comparable, java.lang.Comparable)
    
    /**
    @utbot.classUnderTest {@link DefaultBoxAndWhiskerCategoryDataset}
 * @utbot.methodUnderTest {@link org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset#getQ3Value(java.lang.Comparable,java.lang.Comparable)}
 * @utbot.invokes {@link org.jfree.data.KeyedObjects2D#getObject(java.lang.Comparable,java.lang.Comparable)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: BoxAndWhiskerItem item = (BoxAndWhiskerItem) this.data.getObject(rowKey, columnKey);
 *  */
    @Test
    public void testGetQ3Value_ThrowNullPointerException() throws Exception  {
        DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset = ((DefaultBoxAndWhiskerCategoryDataset) createInstance("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset"));
        
        /* This test fails because method [org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset.getQ3Value] produces [java.lang.NullPointerException]
            org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset.getQ3Value(DefaultBoxAndWhiskerCategoryDataset.java:391) */
        defaultBoxAndWhiskerCategoryDataset.getQ3Value(((Comparable) null), ((Comparable) null));
    }
    ///endregion
    
    ///region FUZZER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method getQ3Value(java.lang.Comparable, java.lang.Comparable)
    
    /**
     * @utbot.classUnderTest {@link org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset}
     * @utbot.methodUnderTest {@link org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset#getQ3Value(java.lang.Comparable,java.lang.Comparable)}
     */
    @Test(expected = UnknownKeyException.class)
    public void testGetQ3ValueThrowsUKE() {
        DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset = new DefaultBoxAndWhiskerCategoryDataset();
        DatasetGroup datasetGroup = new DatasetGroup("");
        defaultBoxAndWhiskerCategoryDataset.setGroup(datasetGroup);
        SimpleTimePeriod simpleTimePeriod = new SimpleTimePeriod(java.lang.Long.MIN_VALUE, -1L);
        XYCoordinate xYCoordinate = new XYCoordinate(-1.0, -1.0);
        
        defaultBoxAndWhiskerCategoryDataset.getQ3Value(simpleTimePeriod, xYCoordinate);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method getQ3Value(java.lang.Comparable, java.lang.Comparable)
    
    @Test
    public void testGetQ3Value1() throws Throwable  {
        DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset = ((DefaultBoxAndWhiskerCategoryDataset) createInstance("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset"));
        KeyedObjects2D data = ((KeyedObjects2D) createInstance("org.jfree.data.KeyedObjects2D"));
        ArrayList rowKeys = new ArrayList();
        Integer integer = 0;
        rowKeys.add(integer);
        Integer integer1 = -1;
        rowKeys.add(integer1);
        rowKeys.add(integer1);
        setField(data, "org.jfree.data.KeyedObjects2D", "rowKeys", rowKeys);
        defaultBoxAndWhiskerCategoryDataset.data = data;
        Class kindClazz = Class.forName("java.lang.invoke.LambdaForm$Kind");
        Object kind = getEnumConstantByName(kindClazz, "GENERIC");
        
        /* This test fails because method [org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset.getQ3Value] produces [java.lang.NullPointerException]
            org.jfree.data.KeyedObjects2D.getObject(KeyedObjects2D.java:226)
            org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset.getQ3Value(DefaultBoxAndWhiskerCategoryDataset.java:391) */
        Class defaultBoxAndWhiskerCategoryDatasetClazz = Class.forName("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset");
        Class integer1Type = Class.forName("java.lang.Comparable");
        Method getQ3ValueMethod = defaultBoxAndWhiskerCategoryDatasetClazz.getDeclaredMethod("getQ3Value", integer1Type, integer1Type);
        getQ3ValueMethod.setAccessible(true);
        java.lang.Object[] getQ3ValueMethodArguments = new java.lang.Object[2];
        getQ3ValueMethodArguments[0] = integer1;
        getQ3ValueMethodArguments[1] = kind;
        try {
            getQ3ValueMethod.invoke(defaultBoxAndWhiskerCategoryDataset, getQ3ValueMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testGetQ3Value2() throws Exception  {
        DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset = ((DefaultBoxAndWhiskerCategoryDataset) createInstance("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset"));
        KeyedObjects2D data = ((KeyedObjects2D) createInstance("org.jfree.data.KeyedObjects2D"));
        ArrayList rowKeys = new ArrayList();
        Integer integer = 0;
        rowKeys.add(integer);
        rowKeys.add(null);
        rowKeys.add(null);
        setField(data, "org.jfree.data.KeyedObjects2D", "rowKeys", rowKeys);
        ArrayList columnKeys = new ArrayList();
        setField(data, "org.jfree.data.KeyedObjects2D", "columnKeys", columnKeys);
        defaultBoxAndWhiskerCategoryDataset.data = data;
        Integer integer1 = 0;
        ObjectStreamField objectStreamField = ((ObjectStreamField) createInstance("java.io.ObjectStreamField"));
        
        /* This test fails because method [org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset.getQ3Value] produces [java.lang.NullPointerException]
            java.base/java.io.ObjectStreamField.getClassSignature(ObjectStreamField.java:157)
            java.base/java.io.ObjectStreamField.getSignature(ObjectStreamField.java:350)
            java.base/java.io.ObjectStreamField.toString(ObjectStreamField.java:325)
            java.base/java.lang.String.valueOf(String.java:4222)
            java.base/java.lang.StringBuilder.append(StringBuilder.java:173)
            org.jfree.data.KeyedObjects2D.getObject(KeyedObjects2D.java:228)
            org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset.getQ3Value(DefaultBoxAndWhiskerCategoryDataset.java:391) */
        defaultBoxAndWhiskerCategoryDataset.getQ3Value(((Comparable) integer1), objectStreamField);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset.getQ3Value
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getQ3Value(int, int)
    
    /**
    @utbot.classUnderTest {@link DefaultBoxAndWhiskerCategoryDataset}
 * @utbot.methodUnderTest {@link org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset#getQ3Value(int,int)}
 * @utbot.returnsFrom {@code return result;}
 *  */
    @Test
    public void testGetQ3Value_ReturnResult() throws Exception  {
        DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset = ((DefaultBoxAndWhiskerCategoryDataset) createInstance("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset"));
        KeyedObjects2D data = ((KeyedObjects2D) createInstance("org.jfree.data.KeyedObjects2D"));
        ArrayList rows = new ArrayList();
        rows.add(null);
        setField(data, "org.jfree.data.KeyedObjects2D", "rows", rows);
        defaultBoxAndWhiskerCategoryDataset.data = data;
        
        Number actual = defaultBoxAndWhiskerCategoryDataset.getQ3Value(0, -255);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link DefaultBoxAndWhiskerCategoryDataset}
 * @utbot.methodUnderTest {@link org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset#getQ3Value(int,int)}
 * @utbot.returnsFrom {@code return result;}
 *  */
    @Test
    public void testGetQ3Value_ReturnResult_1() throws Exception  {
        DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset = ((DefaultBoxAndWhiskerCategoryDataset) createInstance("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset"));
        KeyedObjects2D data = ((KeyedObjects2D) createInstance("org.jfree.data.KeyedObjects2D"));
        ArrayList columnKeys = new ArrayList();
        KeyedObjects keyedObjects = ((KeyedObjects) createInstance("org.jfree.data.KeyedObjects"));
        columnKeys.add(keyedObjects);
        columnKeys.add(null);
        columnKeys.add(null);
        setField(data, "org.jfree.data.KeyedObjects2D", "columnKeys", columnKeys);
        setField(data, "org.jfree.data.KeyedObjects2D", "rows", columnKeys);
        defaultBoxAndWhiskerCategoryDataset.data = data;
        
        Number actual = defaultBoxAndWhiskerCategoryDataset.getQ3Value(0, 2);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getQ3Value(int, int)
    
    /**
    @utbot.classUnderTest {@link DefaultBoxAndWhiskerCategoryDataset}
 * @utbot.methodUnderTest {@link org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset#getQ3Value(int,int)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: BoxAndWhiskerItem item = (BoxAndWhiskerItem) this.data.getObject(row, column);
 *  */
    @Test
    public void testGetQ3Value_ThrowClassCastException() throws Exception  {
        DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset = ((DefaultBoxAndWhiskerCategoryDataset) createInstance("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset"));
        KeyedObjects2D data = ((KeyedObjects2D) createInstance("org.jfree.data.KeyedObjects2D"));
        ArrayList rows = new ArrayList();
        Object object = createInstance("java.lang.Object");
        rows.add(object);
        setField(data, "org.jfree.data.KeyedObjects2D", "rows", rows);
        defaultBoxAndWhiskerCategoryDataset.data = data;
        
        /* This test fails because method [org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset.getQ3Value] produces [java.lang.ClassCastException: class java.lang.Object cannot be cast to class org.jfree.data.KeyedObjects (java.lang.Object is in module java.base of loader 'bootstrap'; org.jfree.data.KeyedObjects is in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @731af3fd)]
            org.jfree.data.KeyedObjects2D.getObject(KeyedObjects2D.java:114)
            org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset.getQ3Value(DefaultBoxAndWhiskerCategoryDataset.java:371) */
        defaultBoxAndWhiskerCategoryDataset.getQ3Value(0, -255);
    }
    
    /**
    @utbot.classUnderTest {@link DefaultBoxAndWhiskerCategoryDataset}
 * @utbot.methodUnderTest {@link org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset#getQ3Value(int,int)}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: BoxAndWhiskerItem item = (BoxAndWhiskerItem) this.data.getObject(row, column);
 *  */
    @Test
    public void testGetQ3Value_ThrowIndexOutOfBoundsException_1() throws Exception  {
        DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset = ((DefaultBoxAndWhiskerCategoryDataset) createInstance("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset"));
        KeyedObjects2D data = ((KeyedObjects2D) createInstance("org.jfree.data.KeyedObjects2D"));
        ArrayList columnKeys = new ArrayList();
        KeyedObjects keyedObjects = ((KeyedObjects) createInstance("org.jfree.data.KeyedObjects"));
        columnKeys.add(keyedObjects);
        setField(data, "org.jfree.data.KeyedObjects2D", "columnKeys", columnKeys);
        setField(data, "org.jfree.data.KeyedObjects2D", "rows", columnKeys);
        defaultBoxAndWhiskerCategoryDataset.data = data;
        
        /* This test fails because method [org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset.getQ3Value] produces [java.lang.IndexOutOfBoundsException: Index -1 out of bounds for length 1]
            java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
            java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
            java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:266)
            java.base/java.util.Objects.checkIndex(Objects.java:359)
            java.base/java.util.ArrayList.get(ArrayList.java:427)
            org.jfree.data.KeyedObjects2D.getObject(KeyedObjects2D.java:116)
            org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset.getQ3Value(DefaultBoxAndWhiskerCategoryDataset.java:371) */
        defaultBoxAndWhiskerCategoryDataset.getQ3Value(0, -1);
    }
    
    /**
    @utbot.classUnderTest {@link DefaultBoxAndWhiskerCategoryDataset}
 * @utbot.methodUnderTest {@link org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset#getQ3Value(int,int)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: BoxAndWhiskerItem item = (BoxAndWhiskerItem) this.data.getObject(row, column);
 *  */
    @Test
    public void testGetQ3Value_ThrowClassCastException_1() throws Exception  {
        DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset = ((DefaultBoxAndWhiskerCategoryDataset) createInstance("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset"));
        KeyedObjects2D data = ((KeyedObjects2D) createInstance("org.jfree.data.KeyedObjects2D"));
        ArrayList columnKeys = new ArrayList();
        KeyedObjects keyedObjects = ((KeyedObjects) createInstance("org.jfree.data.KeyedObjects"));
        columnKeys.add(keyedObjects);
        columnKeys.add(null);
        columnKeys.add(null);
        setField(data, "org.jfree.data.KeyedObjects2D", "columnKeys", columnKeys);
        setField(data, "org.jfree.data.KeyedObjects2D", "rows", columnKeys);
        defaultBoxAndWhiskerCategoryDataset.data = data;
        
        /* This test fails because method [org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset.getQ3Value] produces [java.lang.ClassCastException: class org.jfree.data.KeyedObjects cannot be cast to class java.lang.Comparable (org.jfree.data.KeyedObjects is in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @731af3fd; java.lang.Comparable is in module java.base of loader 'bootstrap')]
            org.jfree.data.KeyedObjects2D.getObject(KeyedObjects2D.java:116)
            org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset.getQ3Value(DefaultBoxAndWhiskerCategoryDataset.java:371) */
        defaultBoxAndWhiskerCategoryDataset.getQ3Value(0, 0);
    }
    
    /**
    @utbot.classUnderTest {@link DefaultBoxAndWhiskerCategoryDataset}
 * @utbot.methodUnderTest {@link org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset#getQ3Value(int,int)}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: BoxAndWhiskerItem item = (BoxAndWhiskerItem) this.data.getObject(row, column);
 *  */
    @Test
    public void testGetQ3Value_ThrowIndexOutOfBoundsException() throws Exception  {
        DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset = ((DefaultBoxAndWhiskerCategoryDataset) createInstance("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset"));
        KeyedObjects2D data = ((KeyedObjects2D) createInstance("org.jfree.data.KeyedObjects2D"));
        ArrayList rows = new ArrayList();
        rows.add(null);
        rows.add(null);
        rows.add(null);
        setField(data, "org.jfree.data.KeyedObjects2D", "rows", rows);
        defaultBoxAndWhiskerCategoryDataset.data = data;
        
        /* This test fails because method [org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset.getQ3Value] produces [java.lang.IndexOutOfBoundsException: Index -1 out of bounds for length 3]
            java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
            java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
            java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:266)
            java.base/java.util.Objects.checkIndex(Objects.java:359)
            java.base/java.util.ArrayList.get(ArrayList.java:427)
            org.jfree.data.KeyedObjects2D.getObject(KeyedObjects2D.java:114)
            org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset.getQ3Value(DefaultBoxAndWhiskerCategoryDataset.java:371) */
        defaultBoxAndWhiskerCategoryDataset.getQ3Value(-1, -255);
    }
    
    /**
    @utbot.classUnderTest {@link DefaultBoxAndWhiskerCategoryDataset}
 * @utbot.methodUnderTest {@link org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset#getQ3Value(int,int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: BoxAndWhiskerItem item = (BoxAndWhiskerItem) this.data.getObject(row, column);
 *  */
    @Test
    public void testGetQ3Value_ThrowNullPointerException1() throws Exception  {
        DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset = ((DefaultBoxAndWhiskerCategoryDataset) createInstance("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset"));
        
        /* This test fails because method [org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset.getQ3Value] produces [java.lang.NullPointerException]
            org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset.getQ3Value(DefaultBoxAndWhiskerCategoryDataset.java:371) */
        defaultBoxAndWhiskerCategoryDataset.getQ3Value(-255, -255);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method getQ3Value(int, int)
    
    @Test
    public void testGetQ3Value3() throws Exception  {
        DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset = ((DefaultBoxAndWhiskerCategoryDataset) createInstance("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset"));
        KeyedObjects2D data = ((KeyedObjects2D) createInstance("org.jfree.data.KeyedObjects2D"));
        ArrayList columnKeys = new ArrayList();
        Object chronoZonedDateTimeImpl = createInstance("java.time.chrono.ChronoZonedDateTimeImpl");
        columnKeys.add(chronoZonedDateTimeImpl);
        Object object = createInstance("java.lang.Object");
        columnKeys.add(object);
        KeyedObjects keyedObjects = ((KeyedObjects) createInstance("org.jfree.data.KeyedObjects"));
        setField(keyedObjects, "org.jfree.data.KeyedObjects", "data", columnKeys);
        columnKeys.add(keyedObjects);
        setField(data, "org.jfree.data.KeyedObjects2D", "columnKeys", columnKeys);
        setField(data, "org.jfree.data.KeyedObjects2D", "rows", columnKeys);
        defaultBoxAndWhiskerCategoryDataset.data = data;
        
        /* This test fails because method [org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset.getQ3Value] produces [java.lang.ClassCastException: class java.time.chrono.ChronoZonedDateTimeImpl cannot be cast to class org.jfree.data.KeyedObject (java.time.chrono.ChronoZonedDateTimeImpl is in module java.base of loader 'bootstrap'; org.jfree.data.KeyedObject is in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @731af3fd)]
            org.jfree.data.KeyedObjects.getIndex(KeyedObjects.java:134)
            org.jfree.data.KeyedObjects2D.getObject(KeyedObjects2D.java:118)
            org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset.getQ3Value(DefaultBoxAndWhiskerCategoryDataset.java:371) */
        defaultBoxAndWhiskerCategoryDataset.getQ3Value(2, 0);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset.getColumnKey
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getColumnKey(int)
    
    /**
    @utbot.classUnderTest {@link DefaultBoxAndWhiskerCategoryDataset}
 * @utbot.methodUnderTest {@link org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset#getColumnKey(int)}
 * @utbot.invokes {@link org.jfree.data.KeyedObjects2D#getColumnKey(int)}
 * @utbot.returnsFrom {@code return this.data.getColumnKey(column);}
 *  */
    @Test
    public void testGetColumnKey_KeyedObjects2DGetColumnKey() throws Exception  {
        DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset = ((DefaultBoxAndWhiskerCategoryDataset) createInstance("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset"));
        KeyedObjects2D data = ((KeyedObjects2D) createInstance("org.jfree.data.KeyedObjects2D"));
        ArrayList columnKeys = new ArrayList();
        columnKeys.add(null);
        setField(data, "org.jfree.data.KeyedObjects2D", "columnKeys", columnKeys);
        defaultBoxAndWhiskerCategoryDataset.data = data;
        
        Comparable actual = defaultBoxAndWhiskerCategoryDataset.getColumnKey(0);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getColumnKey(int)
    
    /**
    @utbot.classUnderTest {@link DefaultBoxAndWhiskerCategoryDataset}
 * @utbot.methodUnderTest {@link org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset#getColumnKey(int)}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: return this.data.getColumnKey(column);
 *  */
    @Test
    public void testGetColumnKey_ThrowIndexOutOfBoundsException() throws Exception  {
        DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset = ((DefaultBoxAndWhiskerCategoryDataset) createInstance("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset"));
        KeyedObjects2D data = ((KeyedObjects2D) createInstance("org.jfree.data.KeyedObjects2D"));
        ArrayList columnKeys = new ArrayList();
        setField(data, "org.jfree.data.KeyedObjects2D", "columnKeys", columnKeys);
        defaultBoxAndWhiskerCategoryDataset.data = data;
        
        /* This test fails because method [org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset.getColumnKey] produces [java.lang.IndexOutOfBoundsException: Index 0 out of bounds for length 0]
            java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
            java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
            java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:266)
            java.base/java.util.Objects.checkIndex(Objects.java:359)
            java.base/java.util.ArrayList.get(ArrayList.java:427)
            org.jfree.data.KeyedObjects2D.getColumnKey(KeyedObjects2D.java:174)
            org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset.getColumnKey(DefaultBoxAndWhiskerCategoryDataset.java:422) */
        defaultBoxAndWhiskerCategoryDataset.getColumnKey(0);
    }
    
    /**
    @utbot.classUnderTest {@link DefaultBoxAndWhiskerCategoryDataset}
 * @utbot.methodUnderTest {@link org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset#getColumnKey(int)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: return this.data.getColumnKey(column);
 *  */
    @Test
    public void testGetColumnKey_ThrowClassCastException() throws Exception  {
        DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset = ((DefaultBoxAndWhiskerCategoryDataset) createInstance("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset"));
        KeyedObjects2D data = ((KeyedObjects2D) createInstance("org.jfree.data.KeyedObjects2D"));
        ArrayList columnKeys = new ArrayList();
        Object object = createInstance("java.lang.Object");
        columnKeys.add(object);
        setField(data, "org.jfree.data.KeyedObjects2D", "columnKeys", columnKeys);
        defaultBoxAndWhiskerCategoryDataset.data = data;
        
        /* This test fails because method [org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset.getColumnKey] produces [java.lang.ClassCastException: class java.lang.Object cannot be cast to class java.lang.Comparable (java.lang.Object and java.lang.Comparable are in module java.base of loader 'bootstrap')]
            org.jfree.data.KeyedObjects2D.getColumnKey(KeyedObjects2D.java:174)
            org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset.getColumnKey(DefaultBoxAndWhiskerCategoryDataset.java:422) */
        defaultBoxAndWhiskerCategoryDataset.getColumnKey(0);
    }
    
    /**
    @utbot.classUnderTest {@link DefaultBoxAndWhiskerCategoryDataset}
 * @utbot.methodUnderTest {@link org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset#getColumnKey(int)}
 * @utbot.invokes {@link org.jfree.data.KeyedObjects2D#getColumnKey(int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return this.data.getColumnKey(column);
 *  */
    @Test
    public void testGetColumnKey_ThrowNullPointerException() throws Exception  {
        DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset = ((DefaultBoxAndWhiskerCategoryDataset) createInstance("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset"));
        
        /* This test fails because method [org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset.getColumnKey] produces [java.lang.NullPointerException]
            org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset.getColumnKey(DefaultBoxAndWhiskerCategoryDataset.java:422) */
        defaultBoxAndWhiskerCategoryDataset.getColumnKey(-255);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset.getMeanValue
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method getMeanValue(java.lang.Comparable, java.lang.Comparable)
    
    /**
    @utbot.classUnderTest {@link DefaultBoxAndWhiskerCategoryDataset}
 * @utbot.methodUnderTest {@link org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset#getMeanValue(java.lang.Comparable,java.lang.Comparable)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: BoxAndWhiskerItem item = (BoxAndWhiskerItem) this.data.getObject(rowKey, columnKey);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testGetMeanValue_ThrowIllegalArgumentException() throws Exception  {
        DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset = ((DefaultBoxAndWhiskerCategoryDataset) createInstance("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset"));
        KeyedObjects2D data = ((KeyedObjects2D) createInstance("org.jfree.data.KeyedObjects2D"));
        defaultBoxAndWhiskerCategoryDataset.data = data;
        
        defaultBoxAndWhiskerCategoryDataset.getMeanValue(((Comparable) null), ((Comparable) null));
    }
    
    /**
    @utbot.classUnderTest {@link DefaultBoxAndWhiskerCategoryDataset}
 * @utbot.methodUnderTest {@link org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset#getMeanValue(java.lang.Comparable,java.lang.Comparable)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: BoxAndWhiskerItem item = (BoxAndWhiskerItem) this.data.getObject(rowKey, columnKey);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testGetMeanValue_ThrowIllegalArgumentException_1() throws Exception  {
        DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset = ((DefaultBoxAndWhiskerCategoryDataset) createInstance("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset"));
        KeyedObjects2D data = ((KeyedObjects2D) createInstance("org.jfree.data.KeyedObjects2D"));
        defaultBoxAndWhiskerCategoryDataset.data = data;
        Integer integer = 0;
        
        defaultBoxAndWhiskerCategoryDataset.getMeanValue(((Comparable) integer), ((Comparable) null));
    }
    
    /**
    @utbot.classUnderTest {@link DefaultBoxAndWhiskerCategoryDataset}
 * @utbot.methodUnderTest {@link org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset#getMeanValue(java.lang.Comparable,java.lang.Comparable)}
 * @utbot.throwsException {@link org.jfree.data.UnknownKeyException} in: BoxAndWhiskerItem item = (BoxAndWhiskerItem) this.data.getObject(rowKey, columnKey);
 *  */
    @Test(expected = UnknownKeyException.class)
    public void testGetMeanValue_ThrowUnknownKeyException() throws Exception  {
        DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset = ((DefaultBoxAndWhiskerCategoryDataset) createInstance("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset"));
        KeyedObjects2D data = ((KeyedObjects2D) createInstance("org.jfree.data.KeyedObjects2D"));
        ArrayList rowKeys = new ArrayList();
        setField(data, "org.jfree.data.KeyedObjects2D", "rowKeys", rowKeys);
        defaultBoxAndWhiskerCategoryDataset.data = data;
        Integer integer = 0;
        
        defaultBoxAndWhiskerCategoryDataset.getMeanValue(((Comparable) integer), ((Comparable) integer));
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getMeanValue(java.lang.Comparable, java.lang.Comparable)
    
    /**
    @utbot.classUnderTest {@link DefaultBoxAndWhiskerCategoryDataset}
 * @utbot.methodUnderTest {@link org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset#getMeanValue(java.lang.Comparable,java.lang.Comparable)}
 * @utbot.invokes {@link org.jfree.data.KeyedObjects2D#getObject(java.lang.Comparable,java.lang.Comparable)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: BoxAndWhiskerItem item = (BoxAndWhiskerItem) this.data.getObject(rowKey, columnKey);
 *  */
    @Test
    public void testGetMeanValue_ThrowNullPointerException() throws Exception  {
        DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset = ((DefaultBoxAndWhiskerCategoryDataset) createInstance("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset"));
        
        /* This test fails because method [org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset.getMeanValue] produces [java.lang.NullPointerException]
            org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset.getMeanValue(DefaultBoxAndWhiskerCategoryDataset.java:271) */
        defaultBoxAndWhiskerCategoryDataset.getMeanValue(((Comparable) null), ((Comparable) null));
    }
    ///endregion
    
    ///region FUZZER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method getMeanValue(java.lang.Comparable, java.lang.Comparable)
    
    /**
     * @utbot.classUnderTest {@link org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset}
     * @utbot.methodUnderTest {@link org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset#getMeanValue(java.lang.Comparable,java.lang.Comparable)}
     */
    @Test(expected = UnknownKeyException.class)
    public void testGetMeanValueThrowsUKE() {
        DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset = new DefaultBoxAndWhiskerCategoryDataset();
        DatasetGroup datasetGroup = new DatasetGroup("");
        defaultBoxAndWhiskerCategoryDataset.setGroup(datasetGroup);
        SimpleTimePeriod simpleTimePeriod = new SimpleTimePeriod(java.lang.Long.MIN_VALUE, -1L);
        XYCoordinate xYCoordinate = new XYCoordinate(-1.0, -1.0);
        
        defaultBoxAndWhiskerCategoryDataset.getMeanValue(simpleTimePeriod, xYCoordinate);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method getMeanValue(java.lang.Comparable, java.lang.Comparable)
    
    @Test
    public void testGetMeanValue1() throws Throwable  {
        DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset = ((DefaultBoxAndWhiskerCategoryDataset) createInstance("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset"));
        KeyedObjects2D data = ((KeyedObjects2D) createInstance("org.jfree.data.KeyedObjects2D"));
        ArrayList rowKeys = new ArrayList();
        Integer integer = 0;
        rowKeys.add(integer);
        Integer integer1 = -1;
        rowKeys.add(integer1);
        rowKeys.add(integer1);
        setField(data, "org.jfree.data.KeyedObjects2D", "rowKeys", rowKeys);
        defaultBoxAndWhiskerCategoryDataset.data = data;
        Class kindClazz = Class.forName("java.lang.invoke.LambdaForm$Kind");
        Object kind = getEnumConstantByName(kindClazz, "GENERIC");
        
        /* This test fails because method [org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset.getMeanValue] produces [java.lang.NullPointerException]
            org.jfree.data.KeyedObjects2D.getObject(KeyedObjects2D.java:226)
            org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset.getMeanValue(DefaultBoxAndWhiskerCategoryDataset.java:271) */
        Class defaultBoxAndWhiskerCategoryDatasetClazz = Class.forName("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset");
        Class integer1Type = Class.forName("java.lang.Comparable");
        Method getMeanValueMethod = defaultBoxAndWhiskerCategoryDatasetClazz.getDeclaredMethod("getMeanValue", integer1Type, integer1Type);
        getMeanValueMethod.setAccessible(true);
        java.lang.Object[] getMeanValueMethodArguments = new java.lang.Object[2];
        getMeanValueMethodArguments[0] = integer1;
        getMeanValueMethodArguments[1] = kind;
        try {
            getMeanValueMethod.invoke(defaultBoxAndWhiskerCategoryDataset, getMeanValueMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testGetMeanValue2() throws Exception  {
        DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset = ((DefaultBoxAndWhiskerCategoryDataset) createInstance("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset"));
        KeyedObjects2D data = ((KeyedObjects2D) createInstance("org.jfree.data.KeyedObjects2D"));
        ArrayList rowKeys = new ArrayList();
        Integer integer = 0;
        rowKeys.add(integer);
        rowKeys.add(null);
        rowKeys.add(null);
        setField(data, "org.jfree.data.KeyedObjects2D", "rowKeys", rowKeys);
        ArrayList columnKeys = new ArrayList();
        setField(data, "org.jfree.data.KeyedObjects2D", "columnKeys", columnKeys);
        defaultBoxAndWhiskerCategoryDataset.data = data;
        Integer integer1 = 0;
        ObjectStreamField objectStreamField = ((ObjectStreamField) createInstance("java.io.ObjectStreamField"));
        
        /* This test fails because method [org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset.getMeanValue] produces [java.lang.NullPointerException]
            java.base/java.io.ObjectStreamField.getClassSignature(ObjectStreamField.java:157)
            java.base/java.io.ObjectStreamField.getSignature(ObjectStreamField.java:350)
            java.base/java.io.ObjectStreamField.toString(ObjectStreamField.java:325)
            java.base/java.lang.String.valueOf(String.java:4222)
            java.base/java.lang.StringBuilder.append(StringBuilder.java:173)
            org.jfree.data.KeyedObjects2D.getObject(KeyedObjects2D.java:228)
            org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset.getMeanValue(DefaultBoxAndWhiskerCategoryDataset.java:271) */
        defaultBoxAndWhiskerCategoryDataset.getMeanValue(((Comparable) integer1), objectStreamField);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset.getMeanValue
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getMeanValue(int, int)
    
    /**
    @utbot.classUnderTest {@link DefaultBoxAndWhiskerCategoryDataset}
 * @utbot.methodUnderTest {@link org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset#getMeanValue(int,int)}
 * @utbot.returnsFrom {@code return result;}
 *  */
    @Test
    public void testGetMeanValue_ReturnResult() throws Exception  {
        DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset = ((DefaultBoxAndWhiskerCategoryDataset) createInstance("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset"));
        KeyedObjects2D data = ((KeyedObjects2D) createInstance("org.jfree.data.KeyedObjects2D"));
        ArrayList rows = new ArrayList();
        rows.add(null);
        setField(data, "org.jfree.data.KeyedObjects2D", "rows", rows);
        defaultBoxAndWhiskerCategoryDataset.data = data;
        
        Number actual = defaultBoxAndWhiskerCategoryDataset.getMeanValue(0, -255);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link DefaultBoxAndWhiskerCategoryDataset}
 * @utbot.methodUnderTest {@link org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset#getMeanValue(int,int)}
 * @utbot.returnsFrom {@code return result;}
 *  */
    @Test
    public void testGetMeanValue_ReturnResult_1() throws Exception  {
        DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset = ((DefaultBoxAndWhiskerCategoryDataset) createInstance("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset"));
        KeyedObjects2D data = ((KeyedObjects2D) createInstance("org.jfree.data.KeyedObjects2D"));
        ArrayList columnKeys = new ArrayList();
        KeyedObjects keyedObjects = ((KeyedObjects) createInstance("org.jfree.data.KeyedObjects"));
        columnKeys.add(keyedObjects);
        columnKeys.add(null);
        columnKeys.add(null);
        setField(data, "org.jfree.data.KeyedObjects2D", "columnKeys", columnKeys);
        setField(data, "org.jfree.data.KeyedObjects2D", "rows", columnKeys);
        defaultBoxAndWhiskerCategoryDataset.data = data;
        
        Number actual = defaultBoxAndWhiskerCategoryDataset.getMeanValue(0, 2);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getMeanValue(int, int)
    
    /**
    @utbot.classUnderTest {@link DefaultBoxAndWhiskerCategoryDataset}
 * @utbot.methodUnderTest {@link org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset#getMeanValue(int,int)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: BoxAndWhiskerItem item = (BoxAndWhiskerItem) this.data.getObject(row, column);
 *  */
    @Test
    public void testGetMeanValue_ThrowClassCastException() throws Exception  {
        DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset = ((DefaultBoxAndWhiskerCategoryDataset) createInstance("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset"));
        KeyedObjects2D data = ((KeyedObjects2D) createInstance("org.jfree.data.KeyedObjects2D"));
        ArrayList rows = new ArrayList();
        Object object = createInstance("java.lang.Object");
        rows.add(object);
        setField(data, "org.jfree.data.KeyedObjects2D", "rows", rows);
        defaultBoxAndWhiskerCategoryDataset.data = data;
        
        /* This test fails because method [org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset.getMeanValue] produces [java.lang.ClassCastException: class java.lang.Object cannot be cast to class org.jfree.data.KeyedObjects (java.lang.Object is in module java.base of loader 'bootstrap'; org.jfree.data.KeyedObjects is in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @731af3fd)]
            org.jfree.data.KeyedObjects2D.getObject(KeyedObjects2D.java:114)
            org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset.getMeanValue(DefaultBoxAndWhiskerCategoryDataset.java:250) */
        defaultBoxAndWhiskerCategoryDataset.getMeanValue(0, -255);
    }
    
    /**
    @utbot.classUnderTest {@link DefaultBoxAndWhiskerCategoryDataset}
 * @utbot.methodUnderTest {@link org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset#getMeanValue(int,int)}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: BoxAndWhiskerItem item = (BoxAndWhiskerItem) this.data.getObject(row, column);
 *  */
    @Test
    public void testGetMeanValue_ThrowIndexOutOfBoundsException_1() throws Exception  {
        DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset = ((DefaultBoxAndWhiskerCategoryDataset) createInstance("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset"));
        KeyedObjects2D data = ((KeyedObjects2D) createInstance("org.jfree.data.KeyedObjects2D"));
        ArrayList columnKeys = new ArrayList();
        KeyedObjects keyedObjects = ((KeyedObjects) createInstance("org.jfree.data.KeyedObjects"));
        columnKeys.add(keyedObjects);
        setField(data, "org.jfree.data.KeyedObjects2D", "columnKeys", columnKeys);
        setField(data, "org.jfree.data.KeyedObjects2D", "rows", columnKeys);
        defaultBoxAndWhiskerCategoryDataset.data = data;
        
        /* This test fails because method [org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset.getMeanValue] produces [java.lang.IndexOutOfBoundsException: Index -1 out of bounds for length 1]
            java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
            java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
            java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:266)
            java.base/java.util.Objects.checkIndex(Objects.java:359)
            java.base/java.util.ArrayList.get(ArrayList.java:427)
            org.jfree.data.KeyedObjects2D.getObject(KeyedObjects2D.java:116)
            org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset.getMeanValue(DefaultBoxAndWhiskerCategoryDataset.java:250) */
        defaultBoxAndWhiskerCategoryDataset.getMeanValue(0, -1);
    }
    
    /**
    @utbot.classUnderTest {@link DefaultBoxAndWhiskerCategoryDataset}
 * @utbot.methodUnderTest {@link org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset#getMeanValue(int,int)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: BoxAndWhiskerItem item = (BoxAndWhiskerItem) this.data.getObject(row, column);
 *  */
    @Test
    public void testGetMeanValue_ThrowClassCastException_1() throws Exception  {
        DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset = ((DefaultBoxAndWhiskerCategoryDataset) createInstance("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset"));
        KeyedObjects2D data = ((KeyedObjects2D) createInstance("org.jfree.data.KeyedObjects2D"));
        ArrayList columnKeys = new ArrayList();
        KeyedObjects keyedObjects = ((KeyedObjects) createInstance("org.jfree.data.KeyedObjects"));
        columnKeys.add(keyedObjects);
        columnKeys.add(null);
        columnKeys.add(null);
        setField(data, "org.jfree.data.KeyedObjects2D", "columnKeys", columnKeys);
        setField(data, "org.jfree.data.KeyedObjects2D", "rows", columnKeys);
        defaultBoxAndWhiskerCategoryDataset.data = data;
        
        /* This test fails because method [org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset.getMeanValue] produces [java.lang.ClassCastException: class org.jfree.data.KeyedObjects cannot be cast to class java.lang.Comparable (org.jfree.data.KeyedObjects is in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @731af3fd; java.lang.Comparable is in module java.base of loader 'bootstrap')]
            org.jfree.data.KeyedObjects2D.getObject(KeyedObjects2D.java:116)
            org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset.getMeanValue(DefaultBoxAndWhiskerCategoryDataset.java:250) */
        defaultBoxAndWhiskerCategoryDataset.getMeanValue(0, 0);
    }
    
    /**
    @utbot.classUnderTest {@link DefaultBoxAndWhiskerCategoryDataset}
 * @utbot.methodUnderTest {@link org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset#getMeanValue(int,int)}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: BoxAndWhiskerItem item = (BoxAndWhiskerItem) this.data.getObject(row, column);
 *  */
    @Test
    public void testGetMeanValue_ThrowIndexOutOfBoundsException() throws Exception  {
        DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset = ((DefaultBoxAndWhiskerCategoryDataset) createInstance("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset"));
        KeyedObjects2D data = ((KeyedObjects2D) createInstance("org.jfree.data.KeyedObjects2D"));
        ArrayList rows = new ArrayList();
        rows.add(null);
        rows.add(null);
        rows.add(null);
        setField(data, "org.jfree.data.KeyedObjects2D", "rows", rows);
        defaultBoxAndWhiskerCategoryDataset.data = data;
        
        /* This test fails because method [org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset.getMeanValue] produces [java.lang.IndexOutOfBoundsException: Index -1 out of bounds for length 3]
            java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
            java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
            java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:266)
            java.base/java.util.Objects.checkIndex(Objects.java:359)
            java.base/java.util.ArrayList.get(ArrayList.java:427)
            org.jfree.data.KeyedObjects2D.getObject(KeyedObjects2D.java:114)
            org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset.getMeanValue(DefaultBoxAndWhiskerCategoryDataset.java:250) */
        defaultBoxAndWhiskerCategoryDataset.getMeanValue(-1, -255);
    }
    
    /**
    @utbot.classUnderTest {@link DefaultBoxAndWhiskerCategoryDataset}
 * @utbot.methodUnderTest {@link org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset#getMeanValue(int,int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: BoxAndWhiskerItem item = (BoxAndWhiskerItem) this.data.getObject(row, column);
 *  */
    @Test
    public void testGetMeanValue_ThrowNullPointerException1() throws Exception  {
        DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset = ((DefaultBoxAndWhiskerCategoryDataset) createInstance("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset"));
        
        /* This test fails because method [org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset.getMeanValue] produces [java.lang.NullPointerException]
            org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset.getMeanValue(DefaultBoxAndWhiskerCategoryDataset.java:250) */
        defaultBoxAndWhiskerCategoryDataset.getMeanValue(-255, -255);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method getMeanValue(int, int)
    
    @Test
    public void testGetMeanValue3() throws Exception  {
        DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset = ((DefaultBoxAndWhiskerCategoryDataset) createInstance("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset"));
        KeyedObjects2D data = ((KeyedObjects2D) createInstance("org.jfree.data.KeyedObjects2D"));
        ArrayList columnKeys = new ArrayList();
        KeyedObject keyedObject = ((KeyedObject) createInstance("org.jfree.data.KeyedObject"));
        Integer key = 0;
        setField(keyedObject, "org.jfree.data.KeyedObject", "key", key);
        columnKeys.add(keyedObject);
        Integer integer = 0;
        columnKeys.add(integer);
        KeyedObjects keyedObjects = ((KeyedObjects) createInstance("org.jfree.data.KeyedObjects"));
        setField(keyedObjects, "org.jfree.data.KeyedObjects", "data", columnKeys);
        columnKeys.add(keyedObjects);
        columnKeys.add(defaultBoxAndWhiskerCategoryDataset);
        columnKeys.add(defaultBoxAndWhiskerCategoryDataset);
        columnKeys.add(defaultBoxAndWhiskerCategoryDataset);
        columnKeys.add(defaultBoxAndWhiskerCategoryDataset);
        columnKeys.add(defaultBoxAndWhiskerCategoryDataset);
        setField(data, "org.jfree.data.KeyedObjects2D", "columnKeys", columnKeys);
        setField(data, "org.jfree.data.KeyedObjects2D", "rows", columnKeys);
        defaultBoxAndWhiskerCategoryDataset.data = data;
        
        Number actual = defaultBoxAndWhiskerCategoryDataset.getMeanValue(2, 1);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method getMeanValue(int, int)
    
    @Test
    public void testGetMeanValue4() throws Exception  {
        DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset = ((DefaultBoxAndWhiskerCategoryDataset) createInstance("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset"));
        KeyedObjects2D data = ((KeyedObjects2D) createInstance("org.jfree.data.KeyedObjects2D"));
        ArrayList columnKeys = new ArrayList();
        KeyedObject keyedObject = ((KeyedObject) createInstance("org.jfree.data.KeyedObject"));
        Integer key = 0;
        setField(keyedObject, "org.jfree.data.KeyedObject", "key", key);
        columnKeys.add(keyedObject);
        Object chronoLocalDateTimeImpl = createInstance("java.time.chrono.ChronoLocalDateTimeImpl");
        columnKeys.add(chronoLocalDateTimeImpl);
        KeyedObjects keyedObjects = ((KeyedObjects) createInstance("org.jfree.data.KeyedObjects"));
        setField(keyedObjects, "org.jfree.data.KeyedObjects", "data", columnKeys);
        columnKeys.add(keyedObjects);
        setField(data, "org.jfree.data.KeyedObjects2D", "columnKeys", columnKeys);
        setField(data, "org.jfree.data.KeyedObjects2D", "rows", columnKeys);
        defaultBoxAndWhiskerCategoryDataset.data = data;
        
        /* This test fails because method [org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset.getMeanValue] produces [java.lang.ClassCastException: class java.time.chrono.ChronoLocalDateTimeImpl cannot be cast to class org.jfree.data.KeyedObject (java.time.chrono.ChronoLocalDateTimeImpl is in module java.base of loader 'bootstrap'; org.jfree.data.KeyedObject is in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @731af3fd)]
            org.jfree.data.KeyedObjects.getIndex(KeyedObjects.java:134)
            org.jfree.data.KeyedObjects2D.getObject(KeyedObjects2D.java:118)
            org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset.getMeanValue(DefaultBoxAndWhiskerCategoryDataset.java:250) */
        defaultBoxAndWhiskerCategoryDataset.getMeanValue(2, 1);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset.getMedianValue
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getMedianValue(int, int)
    
    /**
    @utbot.classUnderTest {@link DefaultBoxAndWhiskerCategoryDataset}
 * @utbot.methodUnderTest {@link org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset#getMedianValue(int,int)}
 * @utbot.returnsFrom {@code return result;}
 *  */
    @Test
    public void testGetMedianValue_ReturnResult() throws Exception  {
        DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset = ((DefaultBoxAndWhiskerCategoryDataset) createInstance("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset"));
        KeyedObjects2D data = ((KeyedObjects2D) createInstance("org.jfree.data.KeyedObjects2D"));
        ArrayList rows = new ArrayList();
        rows.add(null);
        setField(data, "org.jfree.data.KeyedObjects2D", "rows", rows);
        defaultBoxAndWhiskerCategoryDataset.data = data;
        
        Number actual = defaultBoxAndWhiskerCategoryDataset.getMedianValue(0, -255);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link DefaultBoxAndWhiskerCategoryDataset}
 * @utbot.methodUnderTest {@link org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset#getMedianValue(int,int)}
 * @utbot.returnsFrom {@code return result;}
 *  */
    @Test
    public void testGetMedianValue_ReturnResult_1() throws Exception  {
        DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset = ((DefaultBoxAndWhiskerCategoryDataset) createInstance("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset"));
        KeyedObjects2D data = ((KeyedObjects2D) createInstance("org.jfree.data.KeyedObjects2D"));
        ArrayList columnKeys = new ArrayList();
        KeyedObjects keyedObjects = ((KeyedObjects) createInstance("org.jfree.data.KeyedObjects"));
        columnKeys.add(keyedObjects);
        columnKeys.add(null);
        columnKeys.add(null);
        setField(data, "org.jfree.data.KeyedObjects2D", "columnKeys", columnKeys);
        setField(data, "org.jfree.data.KeyedObjects2D", "rows", columnKeys);
        defaultBoxAndWhiskerCategoryDataset.data = data;
        
        Number actual = defaultBoxAndWhiskerCategoryDataset.getMedianValue(0, 2);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getMedianValue(int, int)
    
    /**
    @utbot.classUnderTest {@link DefaultBoxAndWhiskerCategoryDataset}
 * @utbot.methodUnderTest {@link org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset#getMedianValue(int,int)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: BoxAndWhiskerItem item = (BoxAndWhiskerItem) this.data.getObject(row, column);
 *  */
    @Test
    public void testGetMedianValue_ThrowClassCastException() throws Exception  {
        DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset = ((DefaultBoxAndWhiskerCategoryDataset) createInstance("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset"));
        KeyedObjects2D data = ((KeyedObjects2D) createInstance("org.jfree.data.KeyedObjects2D"));
        ArrayList rows = new ArrayList();
        Object object = createInstance("java.lang.Object");
        rows.add(object);
        setField(data, "org.jfree.data.KeyedObjects2D", "rows", rows);
        defaultBoxAndWhiskerCategoryDataset.data = data;
        
        /* This test fails because method [org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset.getMedianValue] produces [java.lang.ClassCastException: class java.lang.Object cannot be cast to class org.jfree.data.KeyedObjects (java.lang.Object is in module java.base of loader 'bootstrap'; org.jfree.data.KeyedObjects is in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @731af3fd)]
            org.jfree.data.KeyedObjects2D.getObject(KeyedObjects2D.java:114)
            org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset.getMedianValue(DefaultBoxAndWhiskerCategoryDataset.java:291) */
        defaultBoxAndWhiskerCategoryDataset.getMedianValue(0, -255);
    }
    
    /**
    @utbot.classUnderTest {@link DefaultBoxAndWhiskerCategoryDataset}
 * @utbot.methodUnderTest {@link org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset#getMedianValue(int,int)}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: BoxAndWhiskerItem item = (BoxAndWhiskerItem) this.data.getObject(row, column);
 *  */
    @Test
    public void testGetMedianValue_ThrowIndexOutOfBoundsException_1() throws Exception  {
        DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset = ((DefaultBoxAndWhiskerCategoryDataset) createInstance("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset"));
        KeyedObjects2D data = ((KeyedObjects2D) createInstance("org.jfree.data.KeyedObjects2D"));
        ArrayList columnKeys = new ArrayList();
        KeyedObjects keyedObjects = ((KeyedObjects) createInstance("org.jfree.data.KeyedObjects"));
        columnKeys.add(keyedObjects);
        setField(data, "org.jfree.data.KeyedObjects2D", "columnKeys", columnKeys);
        setField(data, "org.jfree.data.KeyedObjects2D", "rows", columnKeys);
        defaultBoxAndWhiskerCategoryDataset.data = data;
        
        /* This test fails because method [org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset.getMedianValue] produces [java.lang.IndexOutOfBoundsException: Index -1 out of bounds for length 1]
            java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
            java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
            java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:266)
            java.base/java.util.Objects.checkIndex(Objects.java:359)
            java.base/java.util.ArrayList.get(ArrayList.java:427)
            org.jfree.data.KeyedObjects2D.getObject(KeyedObjects2D.java:116)
            org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset.getMedianValue(DefaultBoxAndWhiskerCategoryDataset.java:291) */
        defaultBoxAndWhiskerCategoryDataset.getMedianValue(0, -1);
    }
    
    /**
    @utbot.classUnderTest {@link DefaultBoxAndWhiskerCategoryDataset}
 * @utbot.methodUnderTest {@link org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset#getMedianValue(int,int)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: BoxAndWhiskerItem item = (BoxAndWhiskerItem) this.data.getObject(row, column);
 *  */
    @Test
    public void testGetMedianValue_ThrowClassCastException_1() throws Exception  {
        DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset = ((DefaultBoxAndWhiskerCategoryDataset) createInstance("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset"));
        KeyedObjects2D data = ((KeyedObjects2D) createInstance("org.jfree.data.KeyedObjects2D"));
        ArrayList columnKeys = new ArrayList();
        KeyedObjects keyedObjects = ((KeyedObjects) createInstance("org.jfree.data.KeyedObjects"));
        columnKeys.add(keyedObjects);
        columnKeys.add(null);
        columnKeys.add(null);
        setField(data, "org.jfree.data.KeyedObjects2D", "columnKeys", columnKeys);
        setField(data, "org.jfree.data.KeyedObjects2D", "rows", columnKeys);
        defaultBoxAndWhiskerCategoryDataset.data = data;
        
        /* This test fails because method [org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset.getMedianValue] produces [java.lang.ClassCastException: class org.jfree.data.KeyedObjects cannot be cast to class java.lang.Comparable (org.jfree.data.KeyedObjects is in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @731af3fd; java.lang.Comparable is in module java.base of loader 'bootstrap')]
            org.jfree.data.KeyedObjects2D.getObject(KeyedObjects2D.java:116)
            org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset.getMedianValue(DefaultBoxAndWhiskerCategoryDataset.java:291) */
        defaultBoxAndWhiskerCategoryDataset.getMedianValue(0, 0);
    }
    
    /**
    @utbot.classUnderTest {@link DefaultBoxAndWhiskerCategoryDataset}
 * @utbot.methodUnderTest {@link org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset#getMedianValue(int,int)}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: BoxAndWhiskerItem item = (BoxAndWhiskerItem) this.data.getObject(row, column);
 *  */
    @Test
    public void testGetMedianValue_ThrowIndexOutOfBoundsException() throws Exception  {
        DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset = ((DefaultBoxAndWhiskerCategoryDataset) createInstance("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset"));
        KeyedObjects2D data = ((KeyedObjects2D) createInstance("org.jfree.data.KeyedObjects2D"));
        ArrayList rows = new ArrayList();
        rows.add(null);
        rows.add(null);
        rows.add(null);
        setField(data, "org.jfree.data.KeyedObjects2D", "rows", rows);
        defaultBoxAndWhiskerCategoryDataset.data = data;
        
        /* This test fails because method [org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset.getMedianValue] produces [java.lang.IndexOutOfBoundsException: Index -1 out of bounds for length 3]
            java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
            java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
            java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:266)
            java.base/java.util.Objects.checkIndex(Objects.java:359)
            java.base/java.util.ArrayList.get(ArrayList.java:427)
            org.jfree.data.KeyedObjects2D.getObject(KeyedObjects2D.java:114)
            org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset.getMedianValue(DefaultBoxAndWhiskerCategoryDataset.java:291) */
        defaultBoxAndWhiskerCategoryDataset.getMedianValue(-1, -255);
    }
    
    /**
    @utbot.classUnderTest {@link DefaultBoxAndWhiskerCategoryDataset}
 * @utbot.methodUnderTest {@link org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset#getMedianValue(int,int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: BoxAndWhiskerItem item = (BoxAndWhiskerItem) this.data.getObject(row, column);
 *  */
    @Test
    public void testGetMedianValue_ThrowNullPointerException() throws Exception  {
        DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset = ((DefaultBoxAndWhiskerCategoryDataset) createInstance("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset"));
        
        /* This test fails because method [org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset.getMedianValue] produces [java.lang.NullPointerException]
            org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset.getMedianValue(DefaultBoxAndWhiskerCategoryDataset.java:291) */
        defaultBoxAndWhiskerCategoryDataset.getMedianValue(-255, -255);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method getMedianValue(int, int)
    
    @Test
    public void testGetMedianValue1() throws Exception  {
        DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset = ((DefaultBoxAndWhiskerCategoryDataset) createInstance("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset"));
        KeyedObjects2D data = ((KeyedObjects2D) createInstance("org.jfree.data.KeyedObjects2D"));
        ArrayList columnKeys = new ArrayList();
        KeyedObject keyedObject = ((KeyedObject) createInstance("org.jfree.data.KeyedObject"));
        Integer key = 0;
        setField(keyedObject, "org.jfree.data.KeyedObject", "key", key);
        columnKeys.add(keyedObject);
        Integer integer = 0;
        columnKeys.add(integer);
        KeyedObjects keyedObjects = ((KeyedObjects) createInstance("org.jfree.data.KeyedObjects"));
        setField(keyedObjects, "org.jfree.data.KeyedObjects", "data", columnKeys);
        columnKeys.add(keyedObjects);
        setField(data, "org.jfree.data.KeyedObjects2D", "columnKeys", columnKeys);
        setField(data, "org.jfree.data.KeyedObjects2D", "rows", columnKeys);
        defaultBoxAndWhiskerCategoryDataset.data = data;
        
        Number actual = defaultBoxAndWhiskerCategoryDataset.getMedianValue(2, 1);
        
        assertNull(actual);
    }
    
    @Test
    public void testGetMedianValue2() throws Exception  {
        DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset = ((DefaultBoxAndWhiskerCategoryDataset) createInstance("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset"));
        KeyedObjects2D data = ((KeyedObjects2D) createInstance("org.jfree.data.KeyedObjects2D"));
        ArrayList columnKeys = new ArrayList();
        Object chronoZonedDateTimeImpl = createInstance("java.time.chrono.ChronoZonedDateTimeImpl");
        columnKeys.add(chronoZonedDateTimeImpl);
        KeyedObjects keyedObjects = ((KeyedObjects) createInstance("org.jfree.data.KeyedObjects"));
        ArrayList data1 = new ArrayList();
        setField(keyedObjects, "org.jfree.data.KeyedObjects", "data", data1);
        columnKeys.add(keyedObjects);
        columnKeys.add(null);
        setField(data, "org.jfree.data.KeyedObjects2D", "columnKeys", columnKeys);
        setField(data, "org.jfree.data.KeyedObjects2D", "rows", columnKeys);
        defaultBoxAndWhiskerCategoryDataset.data = data;
        
        Number actual = defaultBoxAndWhiskerCategoryDataset.getMedianValue(1, 0);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method getMedianValue(int, int)
    
    @Test
    public void testGetMedianValue3() throws Exception  {
        DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset = ((DefaultBoxAndWhiskerCategoryDataset) createInstance("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset"));
        KeyedObjects2D data = ((KeyedObjects2D) createInstance("org.jfree.data.KeyedObjects2D"));
        ArrayList columnKeys = new ArrayList();
        KeyedObject keyedObject = ((KeyedObject) createInstance("org.jfree.data.KeyedObject"));
        Integer key = 0;
        setField(keyedObject, "org.jfree.data.KeyedObject", "key", key);
        columnKeys.add(keyedObject);
        IsoChronology isoChronology = ((IsoChronology) createInstance("java.time.chrono.IsoChronology"));
        columnKeys.add(isoChronology);
        KeyedObjects keyedObjects = ((KeyedObjects) createInstance("org.jfree.data.KeyedObjects"));
        setField(keyedObjects, "org.jfree.data.KeyedObjects", "data", columnKeys);
        columnKeys.add(keyedObjects);
        setField(data, "org.jfree.data.KeyedObjects2D", "columnKeys", columnKeys);
        setField(data, "org.jfree.data.KeyedObjects2D", "rows", columnKeys);
        defaultBoxAndWhiskerCategoryDataset.data = data;
        
        /* This test fails because method [org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset.getMedianValue] produces [java.lang.ClassCastException: class java.time.chrono.IsoChronology cannot be cast to class org.jfree.data.KeyedObject (java.time.chrono.IsoChronology is in module java.base of loader 'bootstrap'; org.jfree.data.KeyedObject is in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @731af3fd)]
            org.jfree.data.KeyedObjects.getIndex(KeyedObjects.java:134)
            org.jfree.data.KeyedObjects2D.getObject(KeyedObjects2D.java:118)
            org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset.getMedianValue(DefaultBoxAndWhiskerCategoryDataset.java:291) */
        defaultBoxAndWhiskerCategoryDataset.getMedianValue(2, 1);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset.getMedianValue
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method getMedianValue(java.lang.Comparable, java.lang.Comparable)
    
    /**
    @utbot.classUnderTest {@link DefaultBoxAndWhiskerCategoryDataset}
 * @utbot.methodUnderTest {@link org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset#getMedianValue(java.lang.Comparable,java.lang.Comparable)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: BoxAndWhiskerItem item = (BoxAndWhiskerItem) this.data.getObject(rowKey, columnKey);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testGetMedianValue_ThrowIllegalArgumentException() throws Exception  {
        DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset = ((DefaultBoxAndWhiskerCategoryDataset) createInstance("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset"));
        KeyedObjects2D data = ((KeyedObjects2D) createInstance("org.jfree.data.KeyedObjects2D"));
        defaultBoxAndWhiskerCategoryDataset.data = data;
        
        defaultBoxAndWhiskerCategoryDataset.getMedianValue(((Comparable) null), ((Comparable) null));
    }
    
    /**
    @utbot.classUnderTest {@link DefaultBoxAndWhiskerCategoryDataset}
 * @utbot.methodUnderTest {@link org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset#getMedianValue(java.lang.Comparable,java.lang.Comparable)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: BoxAndWhiskerItem item = (BoxAndWhiskerItem) this.data.getObject(rowKey, columnKey);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testGetMedianValue_ThrowIllegalArgumentException_1() throws Exception  {
        DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset = ((DefaultBoxAndWhiskerCategoryDataset) createInstance("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset"));
        KeyedObjects2D data = ((KeyedObjects2D) createInstance("org.jfree.data.KeyedObjects2D"));
        defaultBoxAndWhiskerCategoryDataset.data = data;
        Integer integer = 0;
        
        defaultBoxAndWhiskerCategoryDataset.getMedianValue(((Comparable) integer), ((Comparable) null));
    }
    
    /**
    @utbot.classUnderTest {@link DefaultBoxAndWhiskerCategoryDataset}
 * @utbot.methodUnderTest {@link org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset#getMedianValue(java.lang.Comparable,java.lang.Comparable)}
 * @utbot.throwsException {@link org.jfree.data.UnknownKeyException} in: BoxAndWhiskerItem item = (BoxAndWhiskerItem) this.data.getObject(rowKey, columnKey);
 *  */
    @Test(expected = UnknownKeyException.class)
    public void testGetMedianValue_ThrowUnknownKeyException() throws Exception  {
        DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset = ((DefaultBoxAndWhiskerCategoryDataset) createInstance("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset"));
        KeyedObjects2D data = ((KeyedObjects2D) createInstance("org.jfree.data.KeyedObjects2D"));
        ArrayList rowKeys = new ArrayList();
        setField(data, "org.jfree.data.KeyedObjects2D", "rowKeys", rowKeys);
        defaultBoxAndWhiskerCategoryDataset.data = data;
        Integer integer = 0;
        
        defaultBoxAndWhiskerCategoryDataset.getMedianValue(((Comparable) integer), ((Comparable) integer));
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getMedianValue(java.lang.Comparable, java.lang.Comparable)
    
    /**
    @utbot.classUnderTest {@link DefaultBoxAndWhiskerCategoryDataset}
 * @utbot.methodUnderTest {@link org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset#getMedianValue(java.lang.Comparable,java.lang.Comparable)}
 * @utbot.invokes {@link org.jfree.data.KeyedObjects2D#getObject(java.lang.Comparable,java.lang.Comparable)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: BoxAndWhiskerItem item = (BoxAndWhiskerItem) this.data.getObject(rowKey, columnKey);
 *  */
    @Test
    public void testGetMedianValue_ThrowNullPointerException1() throws Exception  {
        DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset = ((DefaultBoxAndWhiskerCategoryDataset) createInstance("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset"));
        
        /* This test fails because method [org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset.getMedianValue] produces [java.lang.NullPointerException]
            org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset.getMedianValue(DefaultBoxAndWhiskerCategoryDataset.java:311) */
        defaultBoxAndWhiskerCategoryDataset.getMedianValue(((Comparable) null), ((Comparable) null));
    }
    ///endregion
    
    ///region FUZZER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method getMedianValue(java.lang.Comparable, java.lang.Comparable)
    
    /**
     * @utbot.classUnderTest {@link org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset}
     * @utbot.methodUnderTest {@link org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset#getMedianValue(java.lang.Comparable,java.lang.Comparable)}
     */
    @Test(expected = UnknownKeyException.class)
    public void testGetMedianValueThrowsUKE() {
        DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset = new DefaultBoxAndWhiskerCategoryDataset();
        DatasetGroup datasetGroup = new DatasetGroup("");
        defaultBoxAndWhiskerCategoryDataset.setGroup(datasetGroup);
        SimpleTimePeriod simpleTimePeriod = new SimpleTimePeriod(java.lang.Long.MIN_VALUE, -1L);
        XYCoordinate xYCoordinate = new XYCoordinate(-1.0, -1.0);
        
        defaultBoxAndWhiskerCategoryDataset.getMedianValue(simpleTimePeriod, xYCoordinate);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method getMedianValue(java.lang.Comparable, java.lang.Comparable)
    
    @Test
    public void testGetMedianValue4() throws Throwable  {
        DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset = ((DefaultBoxAndWhiskerCategoryDataset) createInstance("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset"));
        KeyedObjects2D data = ((KeyedObjects2D) createInstance("org.jfree.data.KeyedObjects2D"));
        ArrayList rowKeys = new ArrayList();
        Integer integer = 0;
        rowKeys.add(integer);
        Integer integer1 = -1;
        rowKeys.add(integer1);
        rowKeys.add(integer1);
        setField(data, "org.jfree.data.KeyedObjects2D", "rowKeys", rowKeys);
        defaultBoxAndWhiskerCategoryDataset.data = data;
        Class kindClazz = Class.forName("java.lang.invoke.LambdaForm$Kind");
        Object kind = getEnumConstantByName(kindClazz, "GENERIC");
        
        /* This test fails because method [org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset.getMedianValue] produces [java.lang.NullPointerException]
            org.jfree.data.KeyedObjects2D.getObject(KeyedObjects2D.java:226)
            org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset.getMedianValue(DefaultBoxAndWhiskerCategoryDataset.java:311) */
        Class defaultBoxAndWhiskerCategoryDatasetClazz = Class.forName("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset");
        Class integer1Type = Class.forName("java.lang.Comparable");
        Method getMedianValueMethod = defaultBoxAndWhiskerCategoryDatasetClazz.getDeclaredMethod("getMedianValue", integer1Type, integer1Type);
        getMedianValueMethod.setAccessible(true);
        java.lang.Object[] getMedianValueMethodArguments = new java.lang.Object[2];
        getMedianValueMethodArguments[0] = integer1;
        getMedianValueMethodArguments[1] = kind;
        try {
            getMedianValueMethod.invoke(defaultBoxAndWhiskerCategoryDataset, getMedianValueMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region Errors report for getMedianValue
    
    public void testGetMedianValue_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset.getQ1Value
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getQ1Value(int, int)
    
    /**
    @utbot.classUnderTest {@link DefaultBoxAndWhiskerCategoryDataset}
 * @utbot.methodUnderTest {@link org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset#getQ1Value(int,int)}
 * @utbot.returnsFrom {@code return result;}
 *  */
    @Test
    public void testGetQ1Value_ReturnResult() throws Exception  {
        DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset = ((DefaultBoxAndWhiskerCategoryDataset) createInstance("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset"));
        KeyedObjects2D data = ((KeyedObjects2D) createInstance("org.jfree.data.KeyedObjects2D"));
        ArrayList rows = new ArrayList();
        rows.add(null);
        setField(data, "org.jfree.data.KeyedObjects2D", "rows", rows);
        defaultBoxAndWhiskerCategoryDataset.data = data;
        
        Number actual = defaultBoxAndWhiskerCategoryDataset.getQ1Value(0, -255);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link DefaultBoxAndWhiskerCategoryDataset}
 * @utbot.methodUnderTest {@link org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset#getQ1Value(int,int)}
 * @utbot.returnsFrom {@code return result;}
 *  */
    @Test
    public void testGetQ1Value_ReturnResult_1() throws Exception  {
        DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset = ((DefaultBoxAndWhiskerCategoryDataset) createInstance("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset"));
        KeyedObjects2D data = ((KeyedObjects2D) createInstance("org.jfree.data.KeyedObjects2D"));
        ArrayList columnKeys = new ArrayList();
        KeyedObjects keyedObjects = ((KeyedObjects) createInstance("org.jfree.data.KeyedObjects"));
        columnKeys.add(keyedObjects);
        columnKeys.add(null);
        columnKeys.add(null);
        setField(data, "org.jfree.data.KeyedObjects2D", "columnKeys", columnKeys);
        setField(data, "org.jfree.data.KeyedObjects2D", "rows", columnKeys);
        defaultBoxAndWhiskerCategoryDataset.data = data;
        
        Number actual = defaultBoxAndWhiskerCategoryDataset.getQ1Value(0, 2);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getQ1Value(int, int)
    
    /**
    @utbot.classUnderTest {@link DefaultBoxAndWhiskerCategoryDataset}
 * @utbot.methodUnderTest {@link org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset#getQ1Value(int,int)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: BoxAndWhiskerItem item = (BoxAndWhiskerItem) this.data.getObject(row, column);
 *  */
    @Test
    public void testGetQ1Value_ThrowClassCastException() throws Exception  {
        DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset = ((DefaultBoxAndWhiskerCategoryDataset) createInstance("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset"));
        KeyedObjects2D data = ((KeyedObjects2D) createInstance("org.jfree.data.KeyedObjects2D"));
        ArrayList rows = new ArrayList();
        Object object = createInstance("java.lang.Object");
        rows.add(object);
        setField(data, "org.jfree.data.KeyedObjects2D", "rows", rows);
        defaultBoxAndWhiskerCategoryDataset.data = data;
        
        /* This test fails because method [org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset.getQ1Value] produces [java.lang.ClassCastException: class java.lang.Object cannot be cast to class org.jfree.data.KeyedObjects (java.lang.Object is in module java.base of loader 'bootstrap'; org.jfree.data.KeyedObjects is in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @731af3fd)]
            org.jfree.data.KeyedObjects2D.getObject(KeyedObjects2D.java:114)
            org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset.getQ1Value(DefaultBoxAndWhiskerCategoryDataset.java:331) */
        defaultBoxAndWhiskerCategoryDataset.getQ1Value(0, -255);
    }
    
    /**
    @utbot.classUnderTest {@link DefaultBoxAndWhiskerCategoryDataset}
 * @utbot.methodUnderTest {@link org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset#getQ1Value(int,int)}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: BoxAndWhiskerItem item = (BoxAndWhiskerItem) this.data.getObject(row, column);
 *  */
    @Test
    public void testGetQ1Value_ThrowIndexOutOfBoundsException_1() throws Exception  {
        DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset = ((DefaultBoxAndWhiskerCategoryDataset) createInstance("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset"));
        KeyedObjects2D data = ((KeyedObjects2D) createInstance("org.jfree.data.KeyedObjects2D"));
        ArrayList columnKeys = new ArrayList();
        KeyedObjects keyedObjects = ((KeyedObjects) createInstance("org.jfree.data.KeyedObjects"));
        columnKeys.add(keyedObjects);
        setField(data, "org.jfree.data.KeyedObjects2D", "columnKeys", columnKeys);
        setField(data, "org.jfree.data.KeyedObjects2D", "rows", columnKeys);
        defaultBoxAndWhiskerCategoryDataset.data = data;
        
        /* This test fails because method [org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset.getQ1Value] produces [java.lang.IndexOutOfBoundsException: Index -1 out of bounds for length 1]
            java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
            java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
            java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:266)
            java.base/java.util.Objects.checkIndex(Objects.java:359)
            java.base/java.util.ArrayList.get(ArrayList.java:427)
            org.jfree.data.KeyedObjects2D.getObject(KeyedObjects2D.java:116)
            org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset.getQ1Value(DefaultBoxAndWhiskerCategoryDataset.java:331) */
        defaultBoxAndWhiskerCategoryDataset.getQ1Value(0, -1);
    }
    
    /**
    @utbot.classUnderTest {@link DefaultBoxAndWhiskerCategoryDataset}
 * @utbot.methodUnderTest {@link org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset#getQ1Value(int,int)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: BoxAndWhiskerItem item = (BoxAndWhiskerItem) this.data.getObject(row, column);
 *  */
    @Test
    public void testGetQ1Value_ThrowClassCastException_1() throws Exception  {
        DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset = ((DefaultBoxAndWhiskerCategoryDataset) createInstance("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset"));
        KeyedObjects2D data = ((KeyedObjects2D) createInstance("org.jfree.data.KeyedObjects2D"));
        ArrayList columnKeys = new ArrayList();
        KeyedObjects keyedObjects = ((KeyedObjects) createInstance("org.jfree.data.KeyedObjects"));
        columnKeys.add(keyedObjects);
        columnKeys.add(null);
        columnKeys.add(null);
        setField(data, "org.jfree.data.KeyedObjects2D", "columnKeys", columnKeys);
        setField(data, "org.jfree.data.KeyedObjects2D", "rows", columnKeys);
        defaultBoxAndWhiskerCategoryDataset.data = data;
        
        /* This test fails because method [org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset.getQ1Value] produces [java.lang.ClassCastException: class org.jfree.data.KeyedObjects cannot be cast to class java.lang.Comparable (org.jfree.data.KeyedObjects is in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @731af3fd; java.lang.Comparable is in module java.base of loader 'bootstrap')]
            org.jfree.data.KeyedObjects2D.getObject(KeyedObjects2D.java:116)
            org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset.getQ1Value(DefaultBoxAndWhiskerCategoryDataset.java:331) */
        defaultBoxAndWhiskerCategoryDataset.getQ1Value(0, 0);
    }
    
    /**
    @utbot.classUnderTest {@link DefaultBoxAndWhiskerCategoryDataset}
 * @utbot.methodUnderTest {@link org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset#getQ1Value(int,int)}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: BoxAndWhiskerItem item = (BoxAndWhiskerItem) this.data.getObject(row, column);
 *  */
    @Test
    public void testGetQ1Value_ThrowIndexOutOfBoundsException() throws Exception  {
        DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset = ((DefaultBoxAndWhiskerCategoryDataset) createInstance("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset"));
        KeyedObjects2D data = ((KeyedObjects2D) createInstance("org.jfree.data.KeyedObjects2D"));
        ArrayList rows = new ArrayList();
        rows.add(null);
        rows.add(null);
        rows.add(null);
        setField(data, "org.jfree.data.KeyedObjects2D", "rows", rows);
        defaultBoxAndWhiskerCategoryDataset.data = data;
        
        /* This test fails because method [org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset.getQ1Value] produces [java.lang.IndexOutOfBoundsException: Index -1 out of bounds for length 3]
            java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
            java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
            java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:266)
            java.base/java.util.Objects.checkIndex(Objects.java:359)
            java.base/java.util.ArrayList.get(ArrayList.java:427)
            org.jfree.data.KeyedObjects2D.getObject(KeyedObjects2D.java:114)
            org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset.getQ1Value(DefaultBoxAndWhiskerCategoryDataset.java:331) */
        defaultBoxAndWhiskerCategoryDataset.getQ1Value(-1, -255);
    }
    
    /**
    @utbot.classUnderTest {@link DefaultBoxAndWhiskerCategoryDataset}
 * @utbot.methodUnderTest {@link org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset#getQ1Value(int,int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: BoxAndWhiskerItem item = (BoxAndWhiskerItem) this.data.getObject(row, column);
 *  */
    @Test
    public void testGetQ1Value_ThrowNullPointerException() throws Exception  {
        DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset = ((DefaultBoxAndWhiskerCategoryDataset) createInstance("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset"));
        
        /* This test fails because method [org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset.getQ1Value] produces [java.lang.NullPointerException]
            org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset.getQ1Value(DefaultBoxAndWhiskerCategoryDataset.java:331) */
        defaultBoxAndWhiskerCategoryDataset.getQ1Value(-255, -255);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method getQ1Value(int, int)
    
    @Test
    public void testGetQ1Value1() throws Exception  {
        DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset = ((DefaultBoxAndWhiskerCategoryDataset) createInstance("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset"));
        KeyedObjects2D data = ((KeyedObjects2D) createInstance("org.jfree.data.KeyedObjects2D"));
        ArrayList columnKeys = new ArrayList();
        KeyedObject keyedObject = ((KeyedObject) createInstance("org.jfree.data.KeyedObject"));
        Integer key = 0;
        setField(keyedObject, "org.jfree.data.KeyedObject", "key", key);
        columnKeys.add(keyedObject);
        Object object = createInstance("java.lang.Object");
        columnKeys.add(object);
        columnKeys.add(object);
        columnKeys.add(object);
        KeyedObjects keyedObjects = ((KeyedObjects) createInstance("org.jfree.data.KeyedObjects"));
        setField(keyedObjects, "org.jfree.data.KeyedObjects", "data", columnKeys);
        columnKeys.add(keyedObjects);
        columnKeys.add(object);
        columnKeys.add(object);
        columnKeys.add(object);
        ThaiBuddhistDate thaiBuddhistDate = ((ThaiBuddhistDate) createInstance("java.time.chrono.ThaiBuddhistDate"));
        columnKeys.add(thaiBuddhistDate);
        setField(data, "org.jfree.data.KeyedObjects2D", "columnKeys", columnKeys);
        setField(data, "org.jfree.data.KeyedObjects2D", "rows", columnKeys);
        defaultBoxAndWhiskerCategoryDataset.data = data;
        
        /* This test fails because method [org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset.getQ1Value] produces [java.lang.ClassCastException: class java.lang.Object cannot be cast to class org.jfree.data.KeyedObject (java.lang.Object is in module java.base of loader 'bootstrap'; org.jfree.data.KeyedObject is in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @731af3fd)]
            org.jfree.data.KeyedObjects.getIndex(KeyedObjects.java:134)
            org.jfree.data.KeyedObjects2D.getObject(KeyedObjects2D.java:118)
            org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset.getQ1Value(DefaultBoxAndWhiskerCategoryDataset.java:331) */
        defaultBoxAndWhiskerCategoryDataset.getQ1Value(4, 8);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset.getQ1Value
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method getQ1Value(java.lang.Comparable, java.lang.Comparable)
    
    /**
    @utbot.classUnderTest {@link DefaultBoxAndWhiskerCategoryDataset}
 * @utbot.methodUnderTest {@link org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset#getQ1Value(java.lang.Comparable,java.lang.Comparable)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: BoxAndWhiskerItem item = (BoxAndWhiskerItem) this.data.getObject(rowKey, columnKey);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testGetQ1Value_ThrowIllegalArgumentException() throws Exception  {
        DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset = ((DefaultBoxAndWhiskerCategoryDataset) createInstance("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset"));
        KeyedObjects2D data = ((KeyedObjects2D) createInstance("org.jfree.data.KeyedObjects2D"));
        defaultBoxAndWhiskerCategoryDataset.data = data;
        
        defaultBoxAndWhiskerCategoryDataset.getQ1Value(((Comparable) null), ((Comparable) null));
    }
    
    /**
    @utbot.classUnderTest {@link DefaultBoxAndWhiskerCategoryDataset}
 * @utbot.methodUnderTest {@link org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset#getQ1Value(java.lang.Comparable,java.lang.Comparable)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: BoxAndWhiskerItem item = (BoxAndWhiskerItem) this.data.getObject(rowKey, columnKey);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testGetQ1Value_ThrowIllegalArgumentException_1() throws Exception  {
        DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset = ((DefaultBoxAndWhiskerCategoryDataset) createInstance("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset"));
        KeyedObjects2D data = ((KeyedObjects2D) createInstance("org.jfree.data.KeyedObjects2D"));
        defaultBoxAndWhiskerCategoryDataset.data = data;
        Integer integer = 0;
        
        defaultBoxAndWhiskerCategoryDataset.getQ1Value(((Comparable) integer), ((Comparable) null));
    }
    
    /**
    @utbot.classUnderTest {@link DefaultBoxAndWhiskerCategoryDataset}
 * @utbot.methodUnderTest {@link org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset#getQ1Value(java.lang.Comparable,java.lang.Comparable)}
 * @utbot.throwsException {@link org.jfree.data.UnknownKeyException} in: BoxAndWhiskerItem item = (BoxAndWhiskerItem) this.data.getObject(rowKey, columnKey);
 *  */
    @Test(expected = UnknownKeyException.class)
    public void testGetQ1Value_ThrowUnknownKeyException() throws Exception  {
        DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset = ((DefaultBoxAndWhiskerCategoryDataset) createInstance("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset"));
        KeyedObjects2D data = ((KeyedObjects2D) createInstance("org.jfree.data.KeyedObjects2D"));
        ArrayList rowKeys = new ArrayList();
        setField(data, "org.jfree.data.KeyedObjects2D", "rowKeys", rowKeys);
        defaultBoxAndWhiskerCategoryDataset.data = data;
        Integer integer = 0;
        
        defaultBoxAndWhiskerCategoryDataset.getQ1Value(((Comparable) integer), ((Comparable) integer));
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getQ1Value(java.lang.Comparable, java.lang.Comparable)
    
    /**
    @utbot.classUnderTest {@link DefaultBoxAndWhiskerCategoryDataset}
 * @utbot.methodUnderTest {@link org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset#getQ1Value(java.lang.Comparable,java.lang.Comparable)}
 * @utbot.invokes {@link org.jfree.data.KeyedObjects2D#getObject(java.lang.Comparable,java.lang.Comparable)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: BoxAndWhiskerItem item = (BoxAndWhiskerItem) this.data.getObject(rowKey, columnKey);
 *  */
    @Test
    public void testGetQ1Value_ThrowNullPointerException1() throws Exception  {
        DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset = ((DefaultBoxAndWhiskerCategoryDataset) createInstance("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset"));
        
        /* This test fails because method [org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset.getQ1Value] produces [java.lang.NullPointerException]
            org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset.getQ1Value(DefaultBoxAndWhiskerCategoryDataset.java:351) */
        defaultBoxAndWhiskerCategoryDataset.getQ1Value(((Comparable) null), ((Comparable) null));
    }
    ///endregion
    
    ///region FUZZER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method getQ1Value(java.lang.Comparable, java.lang.Comparable)
    
    /**
     * @utbot.classUnderTest {@link org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset}
     * @utbot.methodUnderTest {@link org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset#getQ1Value(java.lang.Comparable,java.lang.Comparable)}
     */
    @Test(expected = UnknownKeyException.class)
    public void testGetQ1ValueThrowsUKE() {
        DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset = new DefaultBoxAndWhiskerCategoryDataset();
        DatasetGroup datasetGroup = new DatasetGroup("");
        defaultBoxAndWhiskerCategoryDataset.setGroup(datasetGroup);
        SimpleTimePeriod simpleTimePeriod = new SimpleTimePeriod(java.lang.Long.MIN_VALUE, -1L);
        XYCoordinate xYCoordinate = new XYCoordinate(-1.0, -1.0);
        
        defaultBoxAndWhiskerCategoryDataset.getQ1Value(simpleTimePeriod, xYCoordinate);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method getQ1Value(java.lang.Comparable, java.lang.Comparable)
    
    @Test
    public void testGetQ1Value2() throws Throwable  {
        DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset = ((DefaultBoxAndWhiskerCategoryDataset) createInstance("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset"));
        KeyedObjects2D data = ((KeyedObjects2D) createInstance("org.jfree.data.KeyedObjects2D"));
        ArrayList rowKeys = new ArrayList();
        Integer integer = 0;
        rowKeys.add(integer);
        Integer integer1 = -1;
        rowKeys.add(integer1);
        rowKeys.add(integer1);
        setField(data, "org.jfree.data.KeyedObjects2D", "rowKeys", rowKeys);
        defaultBoxAndWhiskerCategoryDataset.data = data;
        Class kindClazz = Class.forName("java.lang.invoke.LambdaForm$Kind");
        Object kind = getEnumConstantByName(kindClazz, "GENERIC");
        
        /* This test fails because method [org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset.getQ1Value] produces [java.lang.NullPointerException]
            org.jfree.data.KeyedObjects2D.getObject(KeyedObjects2D.java:226)
            org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset.getQ1Value(DefaultBoxAndWhiskerCategoryDataset.java:351) */
        Class defaultBoxAndWhiskerCategoryDatasetClazz = Class.forName("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset");
        Class integer1Type = Class.forName("java.lang.Comparable");
        Method getQ1ValueMethod = defaultBoxAndWhiskerCategoryDatasetClazz.getDeclaredMethod("getQ1Value", integer1Type, integer1Type);
        getQ1ValueMethod.setAccessible(true);
        java.lang.Object[] getQ1ValueMethodArguments = new java.lang.Object[2];
        getQ1ValueMethodArguments[0] = integer1;
        getQ1ValueMethodArguments[1] = kind;
        try {
            getQ1ValueMethod.invoke(defaultBoxAndWhiskerCategoryDataset, getQ1ValueMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testGetQ1Value3() throws Exception  {
        DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset = ((DefaultBoxAndWhiskerCategoryDataset) createInstance("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset"));
        KeyedObjects2D data = ((KeyedObjects2D) createInstance("org.jfree.data.KeyedObjects2D"));
        ArrayList rowKeys = new ArrayList();
        Integer integer = 0;
        rowKeys.add(integer);
        rowKeys.add(null);
        rowKeys.add(null);
        setField(data, "org.jfree.data.KeyedObjects2D", "rowKeys", rowKeys);
        ArrayList columnKeys = new ArrayList();
        setField(data, "org.jfree.data.KeyedObjects2D", "columnKeys", columnKeys);
        defaultBoxAndWhiskerCategoryDataset.data = data;
        Integer integer1 = 0;
        ObjectStreamField objectStreamField = ((ObjectStreamField) createInstance("java.io.ObjectStreamField"));
        
        /* This test fails because method [org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset.getQ1Value] produces [java.lang.NullPointerException]
            java.base/java.io.ObjectStreamField.getClassSignature(ObjectStreamField.java:157)
            java.base/java.io.ObjectStreamField.getSignature(ObjectStreamField.java:350)
            java.base/java.io.ObjectStreamField.toString(ObjectStreamField.java:325)
            java.base/java.lang.String.valueOf(String.java:4222)
            java.base/java.lang.StringBuilder.append(StringBuilder.java:173)
            org.jfree.data.KeyedObjects2D.getObject(KeyedObjects2D.java:228)
            org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset.getQ1Value(DefaultBoxAndWhiskerCategoryDataset.java:351) */
        defaultBoxAndWhiskerCategoryDataset.getQ1Value(((Comparable) integer1), objectStreamField);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset.getColumnIndex
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getColumnIndex(java.lang.Comparable)
    
    /**
    @utbot.classUnderTest {@link DefaultBoxAndWhiskerCategoryDataset}
 * @utbot.methodUnderTest {@link org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset#getColumnIndex(java.lang.Comparable)}
 * @utbot.invokes {@link org.jfree.data.KeyedObjects2D#getColumnIndex(java.lang.Comparable)}
 * @utbot.returnsFrom {@code return this.data.getColumnIndex(key);}
 *  */
    @Test
    public void testGetColumnIndex_KeyedObjects2DGetColumnIndex() throws Exception  {
        DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset = ((DefaultBoxAndWhiskerCategoryDataset) createInstance("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset"));
        KeyedObjects2D data = ((KeyedObjects2D) createInstance("org.jfree.data.KeyedObjects2D"));
        ArrayList columnKeys = new ArrayList();
        setField(data, "org.jfree.data.KeyedObjects2D", "columnKeys", columnKeys);
        defaultBoxAndWhiskerCategoryDataset.data = data;
        Integer integer = 0;
        
        int actual = defaultBoxAndWhiskerCategoryDataset.getColumnIndex(integer);
        
        assertEquals(-1, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getColumnIndex(java.lang.Comparable)
    
    /**
    @utbot.classUnderTest {@link DefaultBoxAndWhiskerCategoryDataset}
 * @utbot.methodUnderTest {@link org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset#getColumnIndex(java.lang.Comparable)}
 * @utbot.invokes {@link org.jfree.data.KeyedObjects2D#getColumnIndex(java.lang.Comparable)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return this.data.getColumnIndex(key);
 *  */
    @Test
    public void testGetColumnIndex_ThrowNullPointerException() throws Exception  {
        DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset = ((DefaultBoxAndWhiskerCategoryDataset) createInstance("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset"));
        
        /* This test fails because method [org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset.getColumnIndex] produces [java.lang.NullPointerException]
            org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset.getColumnIndex(DefaultBoxAndWhiskerCategoryDataset.java:409) */
        defaultBoxAndWhiskerCategoryDataset.getColumnIndex(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset.getMaxRegularValue
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getMaxRegularValue(int, int)
    
    /**
    @utbot.classUnderTest {@link DefaultBoxAndWhiskerCategoryDataset}
 * @utbot.methodUnderTest {@link org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset#getMaxRegularValue(int,int)}
 * @utbot.returnsFrom {@code return result;}
 *  */
    @Test
    public void testGetMaxRegularValue_ReturnResult() throws Exception  {
        DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset = ((DefaultBoxAndWhiskerCategoryDataset) createInstance("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset"));
        KeyedObjects2D data = ((KeyedObjects2D) createInstance("org.jfree.data.KeyedObjects2D"));
        ArrayList rows = new ArrayList();
        rows.add(null);
        setField(data, "org.jfree.data.KeyedObjects2D", "rows", rows);
        defaultBoxAndWhiskerCategoryDataset.data = data;
        
        Number actual = defaultBoxAndWhiskerCategoryDataset.getMaxRegularValue(0, -255);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link DefaultBoxAndWhiskerCategoryDataset}
 * @utbot.methodUnderTest {@link org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset#getMaxRegularValue(int,int)}
 * @utbot.returnsFrom {@code return result;}
 *  */
    @Test
    public void testGetMaxRegularValue_ReturnResult_1() throws Exception  {
        DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset = ((DefaultBoxAndWhiskerCategoryDataset) createInstance("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset"));
        KeyedObjects2D data = ((KeyedObjects2D) createInstance("org.jfree.data.KeyedObjects2D"));
        ArrayList columnKeys = new ArrayList();
        KeyedObjects keyedObjects = ((KeyedObjects) createInstance("org.jfree.data.KeyedObjects"));
        columnKeys.add(keyedObjects);
        columnKeys.add(null);
        columnKeys.add(null);
        setField(data, "org.jfree.data.KeyedObjects2D", "columnKeys", columnKeys);
        setField(data, "org.jfree.data.KeyedObjects2D", "rows", columnKeys);
        defaultBoxAndWhiskerCategoryDataset.data = data;
        
        Number actual = defaultBoxAndWhiskerCategoryDataset.getMaxRegularValue(0, 2);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getMaxRegularValue(int, int)
    
    /**
    @utbot.classUnderTest {@link DefaultBoxAndWhiskerCategoryDataset}
 * @utbot.methodUnderTest {@link org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset#getMaxRegularValue(int,int)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: BoxAndWhiskerItem item = (BoxAndWhiskerItem) this.data.getObject(row, column);
 *  */
    @Test
    public void testGetMaxRegularValue_ThrowClassCastException() throws Exception  {
        DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset = ((DefaultBoxAndWhiskerCategoryDataset) createInstance("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset"));
        KeyedObjects2D data = ((KeyedObjects2D) createInstance("org.jfree.data.KeyedObjects2D"));
        ArrayList rows = new ArrayList();
        Object object = createInstance("java.lang.Object");
        rows.add(object);
        setField(data, "org.jfree.data.KeyedObjects2D", "rows", rows);
        defaultBoxAndWhiskerCategoryDataset.data = data;
        
        /* This test fails because method [org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset.getMaxRegularValue] produces [java.lang.ClassCastException: class java.lang.Object cannot be cast to class org.jfree.data.KeyedObjects (java.lang.Object is in module java.base of loader 'bootstrap'; org.jfree.data.KeyedObjects is in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @731af3fd)]
            org.jfree.data.KeyedObjects2D.getObject(KeyedObjects2D.java:114)
            org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset.getMaxRegularValue(DefaultBoxAndWhiskerCategoryDataset.java:587) */
        defaultBoxAndWhiskerCategoryDataset.getMaxRegularValue(0, -255);
    }
    
    /**
    @utbot.classUnderTest {@link DefaultBoxAndWhiskerCategoryDataset}
 * @utbot.methodUnderTest {@link org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset#getMaxRegularValue(int,int)}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: BoxAndWhiskerItem item = (BoxAndWhiskerItem) this.data.getObject(row, column);
 *  */
    @Test
    public void testGetMaxRegularValue_ThrowIndexOutOfBoundsException_1() throws Exception  {
        DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset = ((DefaultBoxAndWhiskerCategoryDataset) createInstance("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset"));
        KeyedObjects2D data = ((KeyedObjects2D) createInstance("org.jfree.data.KeyedObjects2D"));
        ArrayList columnKeys = new ArrayList();
        KeyedObjects keyedObjects = ((KeyedObjects) createInstance("org.jfree.data.KeyedObjects"));
        columnKeys.add(keyedObjects);
        setField(data, "org.jfree.data.KeyedObjects2D", "columnKeys", columnKeys);
        setField(data, "org.jfree.data.KeyedObjects2D", "rows", columnKeys);
        defaultBoxAndWhiskerCategoryDataset.data = data;
        
        /* This test fails because method [org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset.getMaxRegularValue] produces [java.lang.IndexOutOfBoundsException: Index -1 out of bounds for length 1]
            java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
            java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
            java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:266)
            java.base/java.util.Objects.checkIndex(Objects.java:359)
            java.base/java.util.ArrayList.get(ArrayList.java:427)
            org.jfree.data.KeyedObjects2D.getObject(KeyedObjects2D.java:116)
            org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset.getMaxRegularValue(DefaultBoxAndWhiskerCategoryDataset.java:587) */
        defaultBoxAndWhiskerCategoryDataset.getMaxRegularValue(0, -1);
    }
    
    /**
    @utbot.classUnderTest {@link DefaultBoxAndWhiskerCategoryDataset}
 * @utbot.methodUnderTest {@link org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset#getMaxRegularValue(int,int)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: BoxAndWhiskerItem item = (BoxAndWhiskerItem) this.data.getObject(row, column);
 *  */
    @Test
    public void testGetMaxRegularValue_ThrowClassCastException_1() throws Exception  {
        DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset = ((DefaultBoxAndWhiskerCategoryDataset) createInstance("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset"));
        KeyedObjects2D data = ((KeyedObjects2D) createInstance("org.jfree.data.KeyedObjects2D"));
        ArrayList columnKeys = new ArrayList();
        KeyedObjects keyedObjects = ((KeyedObjects) createInstance("org.jfree.data.KeyedObjects"));
        columnKeys.add(keyedObjects);
        columnKeys.add(null);
        columnKeys.add(null);
        setField(data, "org.jfree.data.KeyedObjects2D", "columnKeys", columnKeys);
        setField(data, "org.jfree.data.KeyedObjects2D", "rows", columnKeys);
        defaultBoxAndWhiskerCategoryDataset.data = data;
        
        /* This test fails because method [org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset.getMaxRegularValue] produces [java.lang.ClassCastException: class org.jfree.data.KeyedObjects cannot be cast to class java.lang.Comparable (org.jfree.data.KeyedObjects is in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @731af3fd; java.lang.Comparable is in module java.base of loader 'bootstrap')]
            org.jfree.data.KeyedObjects2D.getObject(KeyedObjects2D.java:116)
            org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset.getMaxRegularValue(DefaultBoxAndWhiskerCategoryDataset.java:587) */
        defaultBoxAndWhiskerCategoryDataset.getMaxRegularValue(0, 0);
    }
    
    /**
    @utbot.classUnderTest {@link DefaultBoxAndWhiskerCategoryDataset}
 * @utbot.methodUnderTest {@link org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset#getMaxRegularValue(int,int)}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: BoxAndWhiskerItem item = (BoxAndWhiskerItem) this.data.getObject(row, column);
 *  */
    @Test
    public void testGetMaxRegularValue_ThrowIndexOutOfBoundsException() throws Exception  {
        DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset = ((DefaultBoxAndWhiskerCategoryDataset) createInstance("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset"));
        KeyedObjects2D data = ((KeyedObjects2D) createInstance("org.jfree.data.KeyedObjects2D"));
        ArrayList rows = new ArrayList();
        rows.add(null);
        rows.add(null);
        rows.add(null);
        setField(data, "org.jfree.data.KeyedObjects2D", "rows", rows);
        defaultBoxAndWhiskerCategoryDataset.data = data;
        
        /* This test fails because method [org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset.getMaxRegularValue] produces [java.lang.IndexOutOfBoundsException: Index -1 out of bounds for length 3]
            java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
            java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
            java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:266)
            java.base/java.util.Objects.checkIndex(Objects.java:359)
            java.base/java.util.ArrayList.get(ArrayList.java:427)
            org.jfree.data.KeyedObjects2D.getObject(KeyedObjects2D.java:114)
            org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset.getMaxRegularValue(DefaultBoxAndWhiskerCategoryDataset.java:587) */
        defaultBoxAndWhiskerCategoryDataset.getMaxRegularValue(-1, -255);
    }
    
    /**
    @utbot.classUnderTest {@link DefaultBoxAndWhiskerCategoryDataset}
 * @utbot.methodUnderTest {@link org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset#getMaxRegularValue(int,int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: BoxAndWhiskerItem item = (BoxAndWhiskerItem) this.data.getObject(row, column);
 *  */
    @Test
    public void testGetMaxRegularValue_ThrowNullPointerException() throws Exception  {
        DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset = ((DefaultBoxAndWhiskerCategoryDataset) createInstance("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset"));
        
        /* This test fails because method [org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset.getMaxRegularValue] produces [java.lang.NullPointerException]
            org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset.getMaxRegularValue(DefaultBoxAndWhiskerCategoryDataset.java:587) */
        defaultBoxAndWhiskerCategoryDataset.getMaxRegularValue(-255, -255);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method getMaxRegularValue(int, int)
    
    @Test
    public void testGetMaxRegularValue1() throws Exception  {
        DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset = ((DefaultBoxAndWhiskerCategoryDataset) createInstance("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset"));
        KeyedObjects2D data = ((KeyedObjects2D) createInstance("org.jfree.data.KeyedObjects2D"));
        ArrayList columnKeys = new ArrayList();
        KeyedObject keyedObject = ((KeyedObject) createInstance("org.jfree.data.KeyedObject"));
        Integer key = 0;
        setField(keyedObject, "org.jfree.data.KeyedObject", "key", key);
        columnKeys.add(keyedObject);
        JdkXmlFeatures.XmlFeature xmlFeature = JdkXmlFeatures.XmlFeature.ENABLE_EXTENSION_FUNCTION;
        columnKeys.add(xmlFeature);
        KeyedObjects keyedObjects = ((KeyedObjects) createInstance("org.jfree.data.KeyedObjects"));
        setField(keyedObjects, "org.jfree.data.KeyedObjects", "data", columnKeys);
        columnKeys.add(keyedObjects);
        setField(data, "org.jfree.data.KeyedObjects2D", "columnKeys", columnKeys);
        setField(data, "org.jfree.data.KeyedObjects2D", "rows", columnKeys);
        defaultBoxAndWhiskerCategoryDataset.data = data;
        
        /* This test fails because method [org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset.getMaxRegularValue] produces [java.lang.ClassCastException: class jdk.xml.internal.JdkXmlFeatures$XmlFeature cannot be cast to class org.jfree.data.KeyedObject (jdk.xml.internal.JdkXmlFeatures$XmlFeature is in module java.xml of loader 'bootstrap'; org.jfree.data.KeyedObject is in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @731af3fd)]
            org.jfree.data.KeyedObjects.getIndex(KeyedObjects.java:134)
            org.jfree.data.KeyedObjects2D.getObject(KeyedObjects2D.java:118)
            org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset.getMaxRegularValue(DefaultBoxAndWhiskerCategoryDataset.java:587) */
        defaultBoxAndWhiskerCategoryDataset.getMaxRegularValue(2, 1);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset.getMaxRegularValue
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method getMaxRegularValue(java.lang.Comparable, java.lang.Comparable)
    
    /**
    @utbot.classUnderTest {@link DefaultBoxAndWhiskerCategoryDataset}
 * @utbot.methodUnderTest {@link org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset#getMaxRegularValue(java.lang.Comparable,java.lang.Comparable)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: BoxAndWhiskerItem item = (BoxAndWhiskerItem) this.data.getObject(rowKey, columnKey);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testGetMaxRegularValue_ThrowIllegalArgumentException() throws Exception  {
        DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset = ((DefaultBoxAndWhiskerCategoryDataset) createInstance("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset"));
        KeyedObjects2D data = ((KeyedObjects2D) createInstance("org.jfree.data.KeyedObjects2D"));
        defaultBoxAndWhiskerCategoryDataset.data = data;
        
        defaultBoxAndWhiskerCategoryDataset.getMaxRegularValue(((Comparable) null), ((Comparable) null));
    }
    
    /**
    @utbot.classUnderTest {@link DefaultBoxAndWhiskerCategoryDataset}
 * @utbot.methodUnderTest {@link org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset#getMaxRegularValue(java.lang.Comparable,java.lang.Comparable)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: BoxAndWhiskerItem item = (BoxAndWhiskerItem) this.data.getObject(rowKey, columnKey);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testGetMaxRegularValue_ThrowIllegalArgumentException_1() throws Exception  {
        DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset = ((DefaultBoxAndWhiskerCategoryDataset) createInstance("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset"));
        KeyedObjects2D data = ((KeyedObjects2D) createInstance("org.jfree.data.KeyedObjects2D"));
        defaultBoxAndWhiskerCategoryDataset.data = data;
        Integer integer = 0;
        
        defaultBoxAndWhiskerCategoryDataset.getMaxRegularValue(((Comparable) integer), ((Comparable) null));
    }
    
    /**
    @utbot.classUnderTest {@link DefaultBoxAndWhiskerCategoryDataset}
 * @utbot.methodUnderTest {@link org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset#getMaxRegularValue(java.lang.Comparable,java.lang.Comparable)}
 * @utbot.throwsException {@link org.jfree.data.UnknownKeyException} in: BoxAndWhiskerItem item = (BoxAndWhiskerItem) this.data.getObject(rowKey, columnKey);
 *  */
    @Test(expected = UnknownKeyException.class)
    public void testGetMaxRegularValue_ThrowUnknownKeyException() throws Exception  {
        DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset = ((DefaultBoxAndWhiskerCategoryDataset) createInstance("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset"));
        KeyedObjects2D data = ((KeyedObjects2D) createInstance("org.jfree.data.KeyedObjects2D"));
        ArrayList rowKeys = new ArrayList();
        setField(data, "org.jfree.data.KeyedObjects2D", "rowKeys", rowKeys);
        defaultBoxAndWhiskerCategoryDataset.data = data;
        Integer integer = 0;
        
        defaultBoxAndWhiskerCategoryDataset.getMaxRegularValue(((Comparable) integer), ((Comparable) integer));
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getMaxRegularValue(java.lang.Comparable, java.lang.Comparable)
    
    /**
    @utbot.classUnderTest {@link DefaultBoxAndWhiskerCategoryDataset}
 * @utbot.methodUnderTest {@link org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset#getMaxRegularValue(java.lang.Comparable,java.lang.Comparable)}
 * @utbot.invokes {@link org.jfree.data.KeyedObjects2D#getObject(java.lang.Comparable,java.lang.Comparable)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: BoxAndWhiskerItem item = (BoxAndWhiskerItem) this.data.getObject(rowKey, columnKey);
 *  */
    @Test
    public void testGetMaxRegularValue_ThrowNullPointerException1() throws Exception  {
        DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset = ((DefaultBoxAndWhiskerCategoryDataset) createInstance("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset"));
        
        /* This test fails because method [org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset.getMaxRegularValue] produces [java.lang.NullPointerException]
            org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset.getMaxRegularValue(DefaultBoxAndWhiskerCategoryDataset.java:607) */
        defaultBoxAndWhiskerCategoryDataset.getMaxRegularValue(((Comparable) null), ((Comparable) null));
    }
    ///endregion
    
    ///region FUZZER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method getMaxRegularValue(java.lang.Comparable, java.lang.Comparable)
    
    /**
     * @utbot.classUnderTest {@link org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset}
     * @utbot.methodUnderTest {@link org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset#getMaxRegularValue(java.lang.Comparable,java.lang.Comparable)}
     */
    @Test(expected = UnknownKeyException.class)
    public void testGetMaxRegularValueThrowsUKE() {
        DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset = new DefaultBoxAndWhiskerCategoryDataset();
        DatasetGroup datasetGroup = new DatasetGroup("");
        defaultBoxAndWhiskerCategoryDataset.setGroup(datasetGroup);
        SimpleTimePeriod simpleTimePeriod = new SimpleTimePeriod(java.lang.Long.MIN_VALUE, -1L);
        XYCoordinate xYCoordinate = new XYCoordinate(-1.0, -1.0);
        
        defaultBoxAndWhiskerCategoryDataset.getMaxRegularValue(simpleTimePeriod, xYCoordinate);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method getMaxRegularValue(java.lang.Comparable, java.lang.Comparable)
    
    @Test
    public void testGetMaxRegularValue2() throws Throwable  {
        DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset = ((DefaultBoxAndWhiskerCategoryDataset) createInstance("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset"));
        KeyedObjects2D data = ((KeyedObjects2D) createInstance("org.jfree.data.KeyedObjects2D"));
        ArrayList rowKeys = new ArrayList();
        Integer integer = 0;
        rowKeys.add(integer);
        Integer integer1 = -1;
        rowKeys.add(integer1);
        rowKeys.add(integer1);
        setField(data, "org.jfree.data.KeyedObjects2D", "rowKeys", rowKeys);
        defaultBoxAndWhiskerCategoryDataset.data = data;
        Class kindClazz = Class.forName("java.lang.invoke.LambdaForm$Kind");
        Object kind = getEnumConstantByName(kindClazz, "GENERIC");
        
        /* This test fails because method [org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset.getMaxRegularValue] produces [java.lang.NullPointerException]
            org.jfree.data.KeyedObjects2D.getObject(KeyedObjects2D.java:226)
            org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset.getMaxRegularValue(DefaultBoxAndWhiskerCategoryDataset.java:607) */
        Class defaultBoxAndWhiskerCategoryDatasetClazz = Class.forName("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset");
        Class integer1Type = Class.forName("java.lang.Comparable");
        Method getMaxRegularValueMethod = defaultBoxAndWhiskerCategoryDatasetClazz.getDeclaredMethod("getMaxRegularValue", integer1Type, integer1Type);
        getMaxRegularValueMethod.setAccessible(true);
        java.lang.Object[] getMaxRegularValueMethodArguments = new java.lang.Object[2];
        getMaxRegularValueMethodArguments[0] = integer1;
        getMaxRegularValueMethodArguments[1] = kind;
        try {
            getMaxRegularValueMethod.invoke(defaultBoxAndWhiskerCategoryDataset, getMaxRegularValueMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testGetMaxRegularValue3() throws Exception  {
        DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset = ((DefaultBoxAndWhiskerCategoryDataset) createInstance("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset"));
        KeyedObjects2D data = ((KeyedObjects2D) createInstance("org.jfree.data.KeyedObjects2D"));
        ArrayList rowKeys = new ArrayList();
        Integer integer = 0;
        rowKeys.add(integer);
        rowKeys.add(null);
        rowKeys.add(null);
        setField(data, "org.jfree.data.KeyedObjects2D", "rowKeys", rowKeys);
        ArrayList columnKeys = new ArrayList();
        setField(data, "org.jfree.data.KeyedObjects2D", "columnKeys", columnKeys);
        defaultBoxAndWhiskerCategoryDataset.data = data;
        Integer integer1 = 0;
        ObjectStreamField objectStreamField = ((ObjectStreamField) createInstance("java.io.ObjectStreamField"));
        
        /* This test fails because method [org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset.getMaxRegularValue] produces [java.lang.NullPointerException]
            java.base/java.io.ObjectStreamField.getClassSignature(ObjectStreamField.java:157)
            java.base/java.io.ObjectStreamField.getSignature(ObjectStreamField.java:350)
            java.base/java.io.ObjectStreamField.toString(ObjectStreamField.java:325)
            java.base/java.lang.String.valueOf(String.java:4222)
            java.base/java.lang.StringBuilder.append(StringBuilder.java:173)
            org.jfree.data.KeyedObjects2D.getObject(KeyedObjects2D.java:228)
            org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset.getMaxRegularValue(DefaultBoxAndWhiskerCategoryDataset.java:607) */
        defaultBoxAndWhiskerCategoryDataset.getMaxRegularValue(((Comparable) integer1), objectStreamField);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset.getColumnCount
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getColumnCount()
    
    /**
    @utbot.classUnderTest {@link DefaultBoxAndWhiskerCategoryDataset}
 * @utbot.methodUnderTest {@link org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset#getColumnCount()}
 * @utbot.invokes {@link org.jfree.data.KeyedObjects2D#getColumnCount()}
 * @utbot.returnsFrom {@code return this.data.getColumnCount();}
 *  */
    @Test
    public void testGetColumnCount_KeyedObjects2DGetColumnCount() throws Exception  {
        DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset = ((DefaultBoxAndWhiskerCategoryDataset) createInstance("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset"));
        KeyedObjects2D data = ((KeyedObjects2D) createInstance("org.jfree.data.KeyedObjects2D"));
        ArrayList columnKeys = new ArrayList();
        columnKeys.add(null);
        columnKeys.add(null);
        columnKeys.add(null);
        setField(data, "org.jfree.data.KeyedObjects2D", "columnKeys", columnKeys);
        defaultBoxAndWhiskerCategoryDataset.data = data;
        
        int actual = defaultBoxAndWhiskerCategoryDataset.getColumnCount();
        
        assertEquals(3, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getColumnCount()
    
    /**
    @utbot.classUnderTest {@link DefaultBoxAndWhiskerCategoryDataset}
 * @utbot.methodUnderTest {@link org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset#getColumnCount()}
 * @utbot.invokes {@link org.jfree.data.KeyedObjects2D#getColumnCount()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return this.data.getColumnCount();
 *  */
    @Test
    public void testGetColumnCount_ThrowNullPointerException() throws Exception  {
        DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset = ((DefaultBoxAndWhiskerCategoryDataset) createInstance("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset"));
        
        /* This test fails because method [org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset.getColumnCount] produces [java.lang.NullPointerException]
            org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset.getColumnCount(DefaultBoxAndWhiskerCategoryDataset.java:492) */
        defaultBoxAndWhiskerCategoryDataset.getColumnCount();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset.getRangeUpperBound
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getRangeUpperBound(boolean)
    
    /**
    @utbot.classUnderTest {@link DefaultBoxAndWhiskerCategoryDataset}
 * @utbot.methodUnderTest {@link org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset#getRangeUpperBound(boolean)}
 * @utbot.returnsFrom {@code return this.maximumRangeValue;}
 *  */
    @Test
    public void testGetRangeUpperBound_ReturnThisMaximumRangeValue() throws Exception  {
        DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset = ((DefaultBoxAndWhiskerCategoryDataset) createInstance("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset"));
        setField(defaultBoxAndWhiskerCategoryDataset, "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "maximumRangeValue", 0.0);
        
        double actual = defaultBoxAndWhiskerCategoryDataset.getRangeUpperBound(false);
        
        org.junit.Assert.assertEquals(0.0, actual, 1.0E-6);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset.getOutliers
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getOutliers(int, int)
    
    /**
    @utbot.classUnderTest {@link DefaultBoxAndWhiskerCategoryDataset}
 * @utbot.methodUnderTest {@link org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset#getOutliers(int,int)}
 * @utbot.returnsFrom {@code return result;}
 *  */
    @Test
    public void testGetOutliers_ReturnResult() throws Exception  {
        DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset = ((DefaultBoxAndWhiskerCategoryDataset) createInstance("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset"));
        KeyedObjects2D data = ((KeyedObjects2D) createInstance("org.jfree.data.KeyedObjects2D"));
        ArrayList rows = new ArrayList();
        rows.add(null);
        setField(data, "org.jfree.data.KeyedObjects2D", "rows", rows);
        defaultBoxAndWhiskerCategoryDataset.data = data;
        
        List actual = defaultBoxAndWhiskerCategoryDataset.getOutliers(0, -255);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link DefaultBoxAndWhiskerCategoryDataset}
 * @utbot.methodUnderTest {@link org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset#getOutliers(int,int)}
 * @utbot.returnsFrom {@code return result;}
 *  */
    @Test
    public void testGetOutliers_ReturnResult_1() throws Exception  {
        DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset = ((DefaultBoxAndWhiskerCategoryDataset) createInstance("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset"));
        KeyedObjects2D data = ((KeyedObjects2D) createInstance("org.jfree.data.KeyedObjects2D"));
        ArrayList columnKeys = new ArrayList();
        KeyedObjects keyedObjects = ((KeyedObjects) createInstance("org.jfree.data.KeyedObjects"));
        columnKeys.add(keyedObjects);
        columnKeys.add(null);
        columnKeys.add(null);
        setField(data, "org.jfree.data.KeyedObjects2D", "columnKeys", columnKeys);
        setField(data, "org.jfree.data.KeyedObjects2D", "rows", columnKeys);
        defaultBoxAndWhiskerCategoryDataset.data = data;
        
        List actual = defaultBoxAndWhiskerCategoryDataset.getOutliers(0, 2);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getOutliers(int, int)
    
    /**
    @utbot.classUnderTest {@link DefaultBoxAndWhiskerCategoryDataset}
 * @utbot.methodUnderTest {@link org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset#getOutliers(int,int)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: BoxAndWhiskerItem item = (BoxAndWhiskerItem) this.data.getObject(row, column);
 *  */
    @Test
    public void testGetOutliers_ThrowClassCastException() throws Exception  {
        DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset = ((DefaultBoxAndWhiskerCategoryDataset) createInstance("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset"));
        KeyedObjects2D data = ((KeyedObjects2D) createInstance("org.jfree.data.KeyedObjects2D"));
        ArrayList rows = new ArrayList();
        Object object = createInstance("java.lang.Object");
        rows.add(object);
        setField(data, "org.jfree.data.KeyedObjects2D", "rows", rows);
        defaultBoxAndWhiskerCategoryDataset.data = data;
        
        /* This test fails because method [org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset.getOutliers] produces [java.lang.ClassCastException: class java.lang.Object cannot be cast to class org.jfree.data.KeyedObjects (java.lang.Object is in module java.base of loader 'bootstrap'; org.jfree.data.KeyedObjects is in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @731af3fd)]
            org.jfree.data.KeyedObjects2D.getObject(KeyedObjects2D.java:114)
            org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset.getOutliers(DefaultBoxAndWhiskerCategoryDataset.java:707) */
        defaultBoxAndWhiskerCategoryDataset.getOutliers(0, -255);
    }
    
    /**
    @utbot.classUnderTest {@link DefaultBoxAndWhiskerCategoryDataset}
 * @utbot.methodUnderTest {@link org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset#getOutliers(int,int)}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: BoxAndWhiskerItem item = (BoxAndWhiskerItem) this.data.getObject(row, column);
 *  */
    @Test
    public void testGetOutliers_ThrowIndexOutOfBoundsException_1() throws Exception  {
        DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset = ((DefaultBoxAndWhiskerCategoryDataset) createInstance("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset"));
        KeyedObjects2D data = ((KeyedObjects2D) createInstance("org.jfree.data.KeyedObjects2D"));
        ArrayList columnKeys = new ArrayList();
        KeyedObjects keyedObjects = ((KeyedObjects) createInstance("org.jfree.data.KeyedObjects"));
        columnKeys.add(keyedObjects);
        setField(data, "org.jfree.data.KeyedObjects2D", "columnKeys", columnKeys);
        setField(data, "org.jfree.data.KeyedObjects2D", "rows", columnKeys);
        defaultBoxAndWhiskerCategoryDataset.data = data;
        
        /* This test fails because method [org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset.getOutliers] produces [java.lang.IndexOutOfBoundsException: Index -1 out of bounds for length 1]
            java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
            java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
            java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:266)
            java.base/java.util.Objects.checkIndex(Objects.java:359)
            java.base/java.util.ArrayList.get(ArrayList.java:427)
            org.jfree.data.KeyedObjects2D.getObject(KeyedObjects2D.java:116)
            org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset.getOutliers(DefaultBoxAndWhiskerCategoryDataset.java:707) */
        defaultBoxAndWhiskerCategoryDataset.getOutliers(0, -1);
    }
    
    /**
    @utbot.classUnderTest {@link DefaultBoxAndWhiskerCategoryDataset}
 * @utbot.methodUnderTest {@link org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset#getOutliers(int,int)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: BoxAndWhiskerItem item = (BoxAndWhiskerItem) this.data.getObject(row, column);
 *  */
    @Test
    public void testGetOutliers_ThrowClassCastException_1() throws Exception  {
        DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset = ((DefaultBoxAndWhiskerCategoryDataset) createInstance("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset"));
        KeyedObjects2D data = ((KeyedObjects2D) createInstance("org.jfree.data.KeyedObjects2D"));
        ArrayList columnKeys = new ArrayList();
        KeyedObjects keyedObjects = ((KeyedObjects) createInstance("org.jfree.data.KeyedObjects"));
        columnKeys.add(keyedObjects);
        columnKeys.add(null);
        columnKeys.add(null);
        setField(data, "org.jfree.data.KeyedObjects2D", "columnKeys", columnKeys);
        setField(data, "org.jfree.data.KeyedObjects2D", "rows", columnKeys);
        defaultBoxAndWhiskerCategoryDataset.data = data;
        
        /* This test fails because method [org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset.getOutliers] produces [java.lang.ClassCastException: class org.jfree.data.KeyedObjects cannot be cast to class java.lang.Comparable (org.jfree.data.KeyedObjects is in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @731af3fd; java.lang.Comparable is in module java.base of loader 'bootstrap')]
            org.jfree.data.KeyedObjects2D.getObject(KeyedObjects2D.java:116)
            org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset.getOutliers(DefaultBoxAndWhiskerCategoryDataset.java:707) */
        defaultBoxAndWhiskerCategoryDataset.getOutliers(0, 0);
    }
    
    /**
    @utbot.classUnderTest {@link DefaultBoxAndWhiskerCategoryDataset}
 * @utbot.methodUnderTest {@link org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset#getOutliers(int,int)}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: BoxAndWhiskerItem item = (BoxAndWhiskerItem) this.data.getObject(row, column);
 *  */
    @Test
    public void testGetOutliers_ThrowIndexOutOfBoundsException() throws Exception  {
        DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset = ((DefaultBoxAndWhiskerCategoryDataset) createInstance("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset"));
        KeyedObjects2D data = ((KeyedObjects2D) createInstance("org.jfree.data.KeyedObjects2D"));
        ArrayList rows = new ArrayList();
        rows.add(null);
        rows.add(null);
        rows.add(null);
        setField(data, "org.jfree.data.KeyedObjects2D", "rows", rows);
        defaultBoxAndWhiskerCategoryDataset.data = data;
        
        /* This test fails because method [org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset.getOutliers] produces [java.lang.IndexOutOfBoundsException: Index -1 out of bounds for length 3]
            java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
            java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
            java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:266)
            java.base/java.util.Objects.checkIndex(Objects.java:359)
            java.base/java.util.ArrayList.get(ArrayList.java:427)
            org.jfree.data.KeyedObjects2D.getObject(KeyedObjects2D.java:114)
            org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset.getOutliers(DefaultBoxAndWhiskerCategoryDataset.java:707) */
        defaultBoxAndWhiskerCategoryDataset.getOutliers(-1, -255);
    }
    
    /**
    @utbot.classUnderTest {@link DefaultBoxAndWhiskerCategoryDataset}
 * @utbot.methodUnderTest {@link org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset#getOutliers(int,int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: BoxAndWhiskerItem item = (BoxAndWhiskerItem) this.data.getObject(row, column);
 *  */
    @Test
    public void testGetOutliers_ThrowNullPointerException() throws Exception  {
        DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset = ((DefaultBoxAndWhiskerCategoryDataset) createInstance("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset"));
        
        /* This test fails because method [org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset.getOutliers] produces [java.lang.NullPointerException]
            org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset.getOutliers(DefaultBoxAndWhiskerCategoryDataset.java:707) */
        defaultBoxAndWhiskerCategoryDataset.getOutliers(-255, -255);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method getOutliers(int, int)
    
    @Test
    public void testGetOutliers1() throws Exception  {
        DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset = ((DefaultBoxAndWhiskerCategoryDataset) createInstance("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset"));
        KeyedObjects2D data = ((KeyedObjects2D) createInstance("org.jfree.data.KeyedObjects2D"));
        ArrayList columnKeys = new ArrayList();
        KeyedObject keyedObject = ((KeyedObject) createInstance("org.jfree.data.KeyedObject"));
        Integer key = 0;
        setField(keyedObject, "org.jfree.data.KeyedObject", "key", key);
        columnKeys.add(keyedObject);
        ThaiBuddhistDate thaiBuddhistDate = ((ThaiBuddhistDate) createInstance("java.time.chrono.ThaiBuddhistDate"));
        columnKeys.add(thaiBuddhistDate);
        KeyedObjects keyedObjects = ((KeyedObjects) createInstance("org.jfree.data.KeyedObjects"));
        setField(keyedObjects, "org.jfree.data.KeyedObjects", "data", columnKeys);
        columnKeys.add(keyedObjects);
        setField(data, "org.jfree.data.KeyedObjects2D", "columnKeys", columnKeys);
        setField(data, "org.jfree.data.KeyedObjects2D", "rows", columnKeys);
        defaultBoxAndWhiskerCategoryDataset.data = data;
        
        /* This test fails because method [org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset.getOutliers] produces [java.lang.ClassCastException: class java.time.chrono.ThaiBuddhistDate cannot be cast to class org.jfree.data.KeyedObject (java.time.chrono.ThaiBuddhistDate is in module java.base of loader 'bootstrap'; org.jfree.data.KeyedObject is in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @731af3fd)]
            org.jfree.data.KeyedObjects.getIndex(KeyedObjects.java:134)
            org.jfree.data.KeyedObjects2D.getObject(KeyedObjects2D.java:118)
            org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset.getOutliers(DefaultBoxAndWhiskerCategoryDataset.java:707) */
        defaultBoxAndWhiskerCategoryDataset.getOutliers(2, 1);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset.getOutliers
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method getOutliers(java.lang.Comparable, java.lang.Comparable)
    
    /**
    @utbot.classUnderTest {@link DefaultBoxAndWhiskerCategoryDataset}
 * @utbot.methodUnderTest {@link org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset#getOutliers(java.lang.Comparable,java.lang.Comparable)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: BoxAndWhiskerItem item = (BoxAndWhiskerItem) this.data.getObject(rowKey, columnKey);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testGetOutliers_ThrowIllegalArgumentException() throws Exception  {
        DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset = ((DefaultBoxAndWhiskerCategoryDataset) createInstance("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset"));
        KeyedObjects2D data = ((KeyedObjects2D) createInstance("org.jfree.data.KeyedObjects2D"));
        defaultBoxAndWhiskerCategoryDataset.data = data;
        
        defaultBoxAndWhiskerCategoryDataset.getOutliers(((Comparable) null), ((Comparable) null));
    }
    
    /**
    @utbot.classUnderTest {@link DefaultBoxAndWhiskerCategoryDataset}
 * @utbot.methodUnderTest {@link org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset#getOutliers(java.lang.Comparable,java.lang.Comparable)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: BoxAndWhiskerItem item = (BoxAndWhiskerItem) this.data.getObject(rowKey, columnKey);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testGetOutliers_ThrowIllegalArgumentException_1() throws Exception  {
        DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset = ((DefaultBoxAndWhiskerCategoryDataset) createInstance("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset"));
        KeyedObjects2D data = ((KeyedObjects2D) createInstance("org.jfree.data.KeyedObjects2D"));
        defaultBoxAndWhiskerCategoryDataset.data = data;
        Integer integer = 0;
        
        defaultBoxAndWhiskerCategoryDataset.getOutliers(((Comparable) integer), ((Comparable) null));
    }
    
    /**
    @utbot.classUnderTest {@link DefaultBoxAndWhiskerCategoryDataset}
 * @utbot.methodUnderTest {@link org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset#getOutliers(java.lang.Comparable,java.lang.Comparable)}
 * @utbot.throwsException {@link org.jfree.data.UnknownKeyException} in: BoxAndWhiskerItem item = (BoxAndWhiskerItem) this.data.getObject(rowKey, columnKey);
 *  */
    @Test(expected = UnknownKeyException.class)
    public void testGetOutliers_ThrowUnknownKeyException() throws Exception  {
        DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset = ((DefaultBoxAndWhiskerCategoryDataset) createInstance("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset"));
        KeyedObjects2D data = ((KeyedObjects2D) createInstance("org.jfree.data.KeyedObjects2D"));
        ArrayList rowKeys = new ArrayList();
        setField(data, "org.jfree.data.KeyedObjects2D", "rowKeys", rowKeys);
        defaultBoxAndWhiskerCategoryDataset.data = data;
        Integer integer = 0;
        
        defaultBoxAndWhiskerCategoryDataset.getOutliers(((Comparable) integer), ((Comparable) integer));
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getOutliers(java.lang.Comparable, java.lang.Comparable)
    
    /**
    @utbot.classUnderTest {@link DefaultBoxAndWhiskerCategoryDataset}
 * @utbot.methodUnderTest {@link org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset#getOutliers(java.lang.Comparable,java.lang.Comparable)}
 * @utbot.invokes {@link org.jfree.data.KeyedObjects2D#getObject(java.lang.Comparable,java.lang.Comparable)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: BoxAndWhiskerItem item = (BoxAndWhiskerItem) this.data.getObject(rowKey, columnKey);
 *  */
    @Test
    public void testGetOutliers_ThrowNullPointerException1() throws Exception  {
        DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset = ((DefaultBoxAndWhiskerCategoryDataset) createInstance("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset"));
        
        /* This test fails because method [org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset.getOutliers] produces [java.lang.NullPointerException]
            org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset.getOutliers(DefaultBoxAndWhiskerCategoryDataset.java:727) */
        defaultBoxAndWhiskerCategoryDataset.getOutliers(((Comparable) null), ((Comparable) null));
    }
    ///endregion
    
    ///region FUZZER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method getOutliers(java.lang.Comparable, java.lang.Comparable)
    
    /**
     * @utbot.classUnderTest {@link org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset}
     * @utbot.methodUnderTest {@link org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset#getOutliers(java.lang.Comparable,java.lang.Comparable)}
     */
    @Test(expected = UnknownKeyException.class)
    public void testGetOutliersThrowsUKE() {
        DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset = new DefaultBoxAndWhiskerCategoryDataset();
        DatasetGroup datasetGroup = new DatasetGroup("");
        defaultBoxAndWhiskerCategoryDataset.setGroup(datasetGroup);
        SimpleTimePeriod simpleTimePeriod = new SimpleTimePeriod(java.lang.Long.MIN_VALUE, -1L);
        XYCoordinate xYCoordinate = new XYCoordinate(-1.0, -1.0);
        
        defaultBoxAndWhiskerCategoryDataset.getOutliers(simpleTimePeriod, xYCoordinate);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method getOutliers(java.lang.Comparable, java.lang.Comparable)
    
    @Test
    public void testGetOutliers2() throws Throwable  {
        DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset = ((DefaultBoxAndWhiskerCategoryDataset) createInstance("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset"));
        KeyedObjects2D data = ((KeyedObjects2D) createInstance("org.jfree.data.KeyedObjects2D"));
        ArrayList rowKeys = new ArrayList();
        Integer integer = 0;
        rowKeys.add(integer);
        Integer integer1 = -1;
        rowKeys.add(integer1);
        rowKeys.add(integer1);
        setField(data, "org.jfree.data.KeyedObjects2D", "rowKeys", rowKeys);
        defaultBoxAndWhiskerCategoryDataset.data = data;
        Class kindClazz = Class.forName("java.lang.invoke.LambdaForm$Kind");
        Object kind = getEnumConstantByName(kindClazz, "GENERIC");
        
        /* This test fails because method [org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset.getOutliers] produces [java.lang.NullPointerException]
            org.jfree.data.KeyedObjects2D.getObject(KeyedObjects2D.java:226)
            org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset.getOutliers(DefaultBoxAndWhiskerCategoryDataset.java:727) */
        Class defaultBoxAndWhiskerCategoryDatasetClazz = Class.forName("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset");
        Class integer1Type = Class.forName("java.lang.Comparable");
        Method getOutliersMethod = defaultBoxAndWhiskerCategoryDatasetClazz.getDeclaredMethod("getOutliers", integer1Type, integer1Type);
        getOutliersMethod.setAccessible(true);
        java.lang.Object[] getOutliersMethodArguments = new java.lang.Object[2];
        getOutliersMethodArguments[0] = integer1;
        getOutliersMethodArguments[1] = kind;
        try {
            getOutliersMethod.invoke(defaultBoxAndWhiskerCategoryDataset, getOutliersMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testGetOutliers3() throws Exception  {
        DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset = ((DefaultBoxAndWhiskerCategoryDataset) createInstance("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset"));
        KeyedObjects2D data = ((KeyedObjects2D) createInstance("org.jfree.data.KeyedObjects2D"));
        ArrayList rowKeys = new ArrayList();
        Integer integer = 0;
        rowKeys.add(integer);
        rowKeys.add(null);
        rowKeys.add(null);
        setField(data, "org.jfree.data.KeyedObjects2D", "rowKeys", rowKeys);
        ArrayList columnKeys = new ArrayList();
        setField(data, "org.jfree.data.KeyedObjects2D", "columnKeys", columnKeys);
        defaultBoxAndWhiskerCategoryDataset.data = data;
        Integer integer1 = 0;
        ObjectStreamField objectStreamField = ((ObjectStreamField) createInstance("java.io.ObjectStreamField"));
        
        /* This test fails because method [org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset.getOutliers] produces [java.lang.NullPointerException]
            java.base/java.io.ObjectStreamField.getClassSignature(ObjectStreamField.java:157)
            java.base/java.io.ObjectStreamField.getSignature(ObjectStreamField.java:350)
            java.base/java.io.ObjectStreamField.toString(ObjectStreamField.java:325)
            java.base/java.lang.String.valueOf(String.java:4222)
            java.base/java.lang.StringBuilder.append(StringBuilder.java:173)
            org.jfree.data.KeyedObjects2D.getObject(KeyedObjects2D.java:228)
            org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset.getOutliers(DefaultBoxAndWhiskerCategoryDataset.java:727) */
        defaultBoxAndWhiskerCategoryDataset.getOutliers(((Comparable) integer1), objectStreamField);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset.getMinRegularValue
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getMinRegularValue(int, int)
    
    /**
    @utbot.classUnderTest {@link DefaultBoxAndWhiskerCategoryDataset}
 * @utbot.methodUnderTest {@link org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset#getMinRegularValue(int,int)}
 * @utbot.returnsFrom {@code return result;}
 *  */
    @Test
    public void testGetMinRegularValue_ReturnResult() throws Exception  {
        DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset = ((DefaultBoxAndWhiskerCategoryDataset) createInstance("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset"));
        KeyedObjects2D data = ((KeyedObjects2D) createInstance("org.jfree.data.KeyedObjects2D"));
        ArrayList rows = new ArrayList();
        rows.add(null);
        setField(data, "org.jfree.data.KeyedObjects2D", "rows", rows);
        defaultBoxAndWhiskerCategoryDataset.data = data;
        
        Number actual = defaultBoxAndWhiskerCategoryDataset.getMinRegularValue(0, -255);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link DefaultBoxAndWhiskerCategoryDataset}
 * @utbot.methodUnderTest {@link org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset#getMinRegularValue(int,int)}
 * @utbot.returnsFrom {@code return result;}
 *  */
    @Test
    public void testGetMinRegularValue_ReturnResult_1() throws Exception  {
        DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset = ((DefaultBoxAndWhiskerCategoryDataset) createInstance("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset"));
        KeyedObjects2D data = ((KeyedObjects2D) createInstance("org.jfree.data.KeyedObjects2D"));
        ArrayList columnKeys = new ArrayList();
        KeyedObjects keyedObjects = ((KeyedObjects) createInstance("org.jfree.data.KeyedObjects"));
        columnKeys.add(keyedObjects);
        columnKeys.add(null);
        columnKeys.add(null);
        setField(data, "org.jfree.data.KeyedObjects2D", "columnKeys", columnKeys);
        setField(data, "org.jfree.data.KeyedObjects2D", "rows", columnKeys);
        defaultBoxAndWhiskerCategoryDataset.data = data;
        
        Number actual = defaultBoxAndWhiskerCategoryDataset.getMinRegularValue(0, 2);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getMinRegularValue(int, int)
    
    /**
    @utbot.classUnderTest {@link DefaultBoxAndWhiskerCategoryDataset}
 * @utbot.methodUnderTest {@link org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset#getMinRegularValue(int,int)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: BoxAndWhiskerItem item = (BoxAndWhiskerItem) this.data.getObject(row, column);
 *  */
    @Test
    public void testGetMinRegularValue_ThrowClassCastException() throws Exception  {
        DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset = ((DefaultBoxAndWhiskerCategoryDataset) createInstance("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset"));
        KeyedObjects2D data = ((KeyedObjects2D) createInstance("org.jfree.data.KeyedObjects2D"));
        ArrayList rows = new ArrayList();
        Object object = createInstance("java.lang.Object");
        rows.add(object);
        setField(data, "org.jfree.data.KeyedObjects2D", "rows", rows);
        defaultBoxAndWhiskerCategoryDataset.data = data;
        
        /* This test fails because method [org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset.getMinRegularValue] produces [java.lang.ClassCastException: class java.lang.Object cannot be cast to class org.jfree.data.KeyedObjects (java.lang.Object is in module java.base of loader 'bootstrap'; org.jfree.data.KeyedObjects is in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @731af3fd)]
            org.jfree.data.KeyedObjects2D.getObject(KeyedObjects2D.java:114)
            org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset.getMinRegularValue(DefaultBoxAndWhiskerCategoryDataset.java:547) */
        defaultBoxAndWhiskerCategoryDataset.getMinRegularValue(0, -255);
    }
    
    /**
    @utbot.classUnderTest {@link DefaultBoxAndWhiskerCategoryDataset}
 * @utbot.methodUnderTest {@link org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset#getMinRegularValue(int,int)}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: BoxAndWhiskerItem item = (BoxAndWhiskerItem) this.data.getObject(row, column);
 *  */
    @Test
    public void testGetMinRegularValue_ThrowIndexOutOfBoundsException_1() throws Exception  {
        DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset = ((DefaultBoxAndWhiskerCategoryDataset) createInstance("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset"));
        KeyedObjects2D data = ((KeyedObjects2D) createInstance("org.jfree.data.KeyedObjects2D"));
        ArrayList columnKeys = new ArrayList();
        KeyedObjects keyedObjects = ((KeyedObjects) createInstance("org.jfree.data.KeyedObjects"));
        columnKeys.add(keyedObjects);
        setField(data, "org.jfree.data.KeyedObjects2D", "columnKeys", columnKeys);
        setField(data, "org.jfree.data.KeyedObjects2D", "rows", columnKeys);
        defaultBoxAndWhiskerCategoryDataset.data = data;
        
        /* This test fails because method [org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset.getMinRegularValue] produces [java.lang.IndexOutOfBoundsException: Index -1 out of bounds for length 1]
            java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
            java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
            java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:266)
            java.base/java.util.Objects.checkIndex(Objects.java:359)
            java.base/java.util.ArrayList.get(ArrayList.java:427)
            org.jfree.data.KeyedObjects2D.getObject(KeyedObjects2D.java:116)
            org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset.getMinRegularValue(DefaultBoxAndWhiskerCategoryDataset.java:547) */
        defaultBoxAndWhiskerCategoryDataset.getMinRegularValue(0, -1);
    }
    
    /**
    @utbot.classUnderTest {@link DefaultBoxAndWhiskerCategoryDataset}
 * @utbot.methodUnderTest {@link org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset#getMinRegularValue(int,int)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: BoxAndWhiskerItem item = (BoxAndWhiskerItem) this.data.getObject(row, column);
 *  */
    @Test
    public void testGetMinRegularValue_ThrowClassCastException_1() throws Exception  {
        DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset = ((DefaultBoxAndWhiskerCategoryDataset) createInstance("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset"));
        KeyedObjects2D data = ((KeyedObjects2D) createInstance("org.jfree.data.KeyedObjects2D"));
        ArrayList columnKeys = new ArrayList();
        KeyedObjects keyedObjects = ((KeyedObjects) createInstance("org.jfree.data.KeyedObjects"));
        columnKeys.add(keyedObjects);
        columnKeys.add(null);
        columnKeys.add(null);
        setField(data, "org.jfree.data.KeyedObjects2D", "columnKeys", columnKeys);
        setField(data, "org.jfree.data.KeyedObjects2D", "rows", columnKeys);
        defaultBoxAndWhiskerCategoryDataset.data = data;
        
        /* This test fails because method [org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset.getMinRegularValue] produces [java.lang.ClassCastException: class org.jfree.data.KeyedObjects cannot be cast to class java.lang.Comparable (org.jfree.data.KeyedObjects is in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @731af3fd; java.lang.Comparable is in module java.base of loader 'bootstrap')]
            org.jfree.data.KeyedObjects2D.getObject(KeyedObjects2D.java:116)
            org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset.getMinRegularValue(DefaultBoxAndWhiskerCategoryDataset.java:547) */
        defaultBoxAndWhiskerCategoryDataset.getMinRegularValue(0, 0);
    }
    
    /**
    @utbot.classUnderTest {@link DefaultBoxAndWhiskerCategoryDataset}
 * @utbot.methodUnderTest {@link org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset#getMinRegularValue(int,int)}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: BoxAndWhiskerItem item = (BoxAndWhiskerItem) this.data.getObject(row, column);
 *  */
    @Test
    public void testGetMinRegularValue_ThrowIndexOutOfBoundsException() throws Exception  {
        DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset = ((DefaultBoxAndWhiskerCategoryDataset) createInstance("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset"));
        KeyedObjects2D data = ((KeyedObjects2D) createInstance("org.jfree.data.KeyedObjects2D"));
        ArrayList rows = new ArrayList();
        rows.add(null);
        rows.add(null);
        rows.add(null);
        setField(data, "org.jfree.data.KeyedObjects2D", "rows", rows);
        defaultBoxAndWhiskerCategoryDataset.data = data;
        
        /* This test fails because method [org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset.getMinRegularValue] produces [java.lang.IndexOutOfBoundsException: Index -1 out of bounds for length 3]
            java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
            java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
            java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:266)
            java.base/java.util.Objects.checkIndex(Objects.java:359)
            java.base/java.util.ArrayList.get(ArrayList.java:427)
            org.jfree.data.KeyedObjects2D.getObject(KeyedObjects2D.java:114)
            org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset.getMinRegularValue(DefaultBoxAndWhiskerCategoryDataset.java:547) */
        defaultBoxAndWhiskerCategoryDataset.getMinRegularValue(-1, -255);
    }
    
    /**
    @utbot.classUnderTest {@link DefaultBoxAndWhiskerCategoryDataset}
 * @utbot.methodUnderTest {@link org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset#getMinRegularValue(int,int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: BoxAndWhiskerItem item = (BoxAndWhiskerItem) this.data.getObject(row, column);
 *  */
    @Test
    public void testGetMinRegularValue_ThrowNullPointerException() throws Exception  {
        DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset = ((DefaultBoxAndWhiskerCategoryDataset) createInstance("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset"));
        
        /* This test fails because method [org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset.getMinRegularValue] produces [java.lang.NullPointerException]
            org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset.getMinRegularValue(DefaultBoxAndWhiskerCategoryDataset.java:547) */
        defaultBoxAndWhiskerCategoryDataset.getMinRegularValue(-255, -255);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method getMinRegularValue(int, int)
    
    @Test
    public void testGetMinRegularValue1() throws Exception  {
        DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset = ((DefaultBoxAndWhiskerCategoryDataset) createInstance("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset"));
        KeyedObjects2D data = ((KeyedObjects2D) createInstance("org.jfree.data.KeyedObjects2D"));
        ArrayList columnKeys = new ArrayList();
        Object chronoZonedDateTimeImpl = createInstance("java.time.chrono.ChronoZonedDateTimeImpl");
        columnKeys.add(chronoZonedDateTimeImpl);
        KeyedObjects keyedObjects = ((KeyedObjects) createInstance("org.jfree.data.KeyedObjects"));
        ArrayList data1 = new ArrayList();
        setField(keyedObjects, "org.jfree.data.KeyedObjects", "data", data1);
        columnKeys.add(keyedObjects);
        columnKeys.add(null);
        setField(data, "org.jfree.data.KeyedObjects2D", "columnKeys", columnKeys);
        setField(data, "org.jfree.data.KeyedObjects2D", "rows", columnKeys);
        defaultBoxAndWhiskerCategoryDataset.data = data;
        
        Number actual = defaultBoxAndWhiskerCategoryDataset.getMinRegularValue(1, 0);
        
        assertNull(actual);
    }
    
    @Test
    public void testGetMinRegularValue2() throws Exception  {
        DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset = ((DefaultBoxAndWhiskerCategoryDataset) createInstance("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset"));
        KeyedObjects2D data = ((KeyedObjects2D) createInstance("org.jfree.data.KeyedObjects2D"));
        ArrayList columnKeys = new ArrayList();
        KeyedObject keyedObject = ((KeyedObject) createInstance("org.jfree.data.KeyedObject"));
        Integer key = 0;
        setField(keyedObject, "org.jfree.data.KeyedObject", "key", key);
        columnKeys.add(keyedObject);
        Integer integer = 0;
        columnKeys.add(integer);
        KeyedObjects keyedObjects = ((KeyedObjects) createInstance("org.jfree.data.KeyedObjects"));
        setField(keyedObjects, "org.jfree.data.KeyedObjects", "data", columnKeys);
        columnKeys.add(keyedObjects);
        Object object = createInstance("java.lang.Object");
        columnKeys.add(object);
        columnKeys.add(object);
        columnKeys.add(object);
        columnKeys.add(object);
        columnKeys.add(object);
        setField(data, "org.jfree.data.KeyedObjects2D", "columnKeys", columnKeys);
        setField(data, "org.jfree.data.KeyedObjects2D", "rows", columnKeys);
        defaultBoxAndWhiskerCategoryDataset.data = data;
        
        Number actual = defaultBoxAndWhiskerCategoryDataset.getMinRegularValue(2, 1);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method getMinRegularValue(int, int)
    
    @Test
    public void testGetMinRegularValue3() throws Exception  {
        DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset = ((DefaultBoxAndWhiskerCategoryDataset) createInstance("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset"));
        KeyedObjects2D data = ((KeyedObjects2D) createInstance("org.jfree.data.KeyedObjects2D"));
        ArrayList columnKeys = new ArrayList();
        KeyedObject keyedObject = ((KeyedObject) createInstance("org.jfree.data.KeyedObject"));
        Integer key = 0;
        setField(keyedObject, "org.jfree.data.KeyedObject", "key", key);
        columnKeys.add(keyedObject);
        Object chronoLocalDateTimeImpl = createInstance("java.time.chrono.ChronoLocalDateTimeImpl");
        columnKeys.add(chronoLocalDateTimeImpl);
        KeyedObjects keyedObjects = ((KeyedObjects) createInstance("org.jfree.data.KeyedObjects"));
        setField(keyedObjects, "org.jfree.data.KeyedObjects", "data", columnKeys);
        columnKeys.add(keyedObjects);
        setField(data, "org.jfree.data.KeyedObjects2D", "columnKeys", columnKeys);
        setField(data, "org.jfree.data.KeyedObjects2D", "rows", columnKeys);
        defaultBoxAndWhiskerCategoryDataset.data = data;
        
        /* This test fails because method [org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset.getMinRegularValue] produces [java.lang.ClassCastException: class java.time.chrono.ChronoLocalDateTimeImpl cannot be cast to class org.jfree.data.KeyedObject (java.time.chrono.ChronoLocalDateTimeImpl is in module java.base of loader 'bootstrap'; org.jfree.data.KeyedObject is in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @731af3fd)]
            org.jfree.data.KeyedObjects.getIndex(KeyedObjects.java:134)
            org.jfree.data.KeyedObjects2D.getObject(KeyedObjects2D.java:118)
            org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset.getMinRegularValue(DefaultBoxAndWhiskerCategoryDataset.java:547) */
        defaultBoxAndWhiskerCategoryDataset.getMinRegularValue(2, 1);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset.getMinRegularValue
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method getMinRegularValue(java.lang.Comparable, java.lang.Comparable)
    
    /**
    @utbot.classUnderTest {@link DefaultBoxAndWhiskerCategoryDataset}
 * @utbot.methodUnderTest {@link org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset#getMinRegularValue(java.lang.Comparable,java.lang.Comparable)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: BoxAndWhiskerItem item = (BoxAndWhiskerItem) this.data.getObject(rowKey, columnKey);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testGetMinRegularValue_ThrowIllegalArgumentException() throws Exception  {
        DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset = ((DefaultBoxAndWhiskerCategoryDataset) createInstance("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset"));
        KeyedObjects2D data = ((KeyedObjects2D) createInstance("org.jfree.data.KeyedObjects2D"));
        defaultBoxAndWhiskerCategoryDataset.data = data;
        
        defaultBoxAndWhiskerCategoryDataset.getMinRegularValue(((Comparable) null), ((Comparable) null));
    }
    
    /**
    @utbot.classUnderTest {@link DefaultBoxAndWhiskerCategoryDataset}
 * @utbot.methodUnderTest {@link org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset#getMinRegularValue(java.lang.Comparable,java.lang.Comparable)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: BoxAndWhiskerItem item = (BoxAndWhiskerItem) this.data.getObject(rowKey, columnKey);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testGetMinRegularValue_ThrowIllegalArgumentException_1() throws Exception  {
        DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset = ((DefaultBoxAndWhiskerCategoryDataset) createInstance("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset"));
        KeyedObjects2D data = ((KeyedObjects2D) createInstance("org.jfree.data.KeyedObjects2D"));
        defaultBoxAndWhiskerCategoryDataset.data = data;
        Integer integer = 0;
        
        defaultBoxAndWhiskerCategoryDataset.getMinRegularValue(((Comparable) integer), ((Comparable) null));
    }
    
    /**
    @utbot.classUnderTest {@link DefaultBoxAndWhiskerCategoryDataset}
 * @utbot.methodUnderTest {@link org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset#getMinRegularValue(java.lang.Comparable,java.lang.Comparable)}
 * @utbot.throwsException {@link org.jfree.data.UnknownKeyException} in: BoxAndWhiskerItem item = (BoxAndWhiskerItem) this.data.getObject(rowKey, columnKey);
 *  */
    @Test(expected = UnknownKeyException.class)
    public void testGetMinRegularValue_ThrowUnknownKeyException() throws Exception  {
        DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset = ((DefaultBoxAndWhiskerCategoryDataset) createInstance("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset"));
        KeyedObjects2D data = ((KeyedObjects2D) createInstance("org.jfree.data.KeyedObjects2D"));
        ArrayList rowKeys = new ArrayList();
        setField(data, "org.jfree.data.KeyedObjects2D", "rowKeys", rowKeys);
        defaultBoxAndWhiskerCategoryDataset.data = data;
        Integer integer = 0;
        
        defaultBoxAndWhiskerCategoryDataset.getMinRegularValue(((Comparable) integer), ((Comparable) integer));
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getMinRegularValue(java.lang.Comparable, java.lang.Comparable)
    
    /**
    @utbot.classUnderTest {@link DefaultBoxAndWhiskerCategoryDataset}
 * @utbot.methodUnderTest {@link org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset#getMinRegularValue(java.lang.Comparable,java.lang.Comparable)}
 * @utbot.invokes {@link org.jfree.data.KeyedObjects2D#getObject(java.lang.Comparable,java.lang.Comparable)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: BoxAndWhiskerItem item = (BoxAndWhiskerItem) this.data.getObject(rowKey, columnKey);
 *  */
    @Test
    public void testGetMinRegularValue_ThrowNullPointerException1() throws Exception  {
        DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset = ((DefaultBoxAndWhiskerCategoryDataset) createInstance("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset"));
        
        /* This test fails because method [org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset.getMinRegularValue] produces [java.lang.NullPointerException]
            org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset.getMinRegularValue(DefaultBoxAndWhiskerCategoryDataset.java:567) */
        defaultBoxAndWhiskerCategoryDataset.getMinRegularValue(((Comparable) null), ((Comparable) null));
    }
    ///endregion
    
    ///region FUZZER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method getMinRegularValue(java.lang.Comparable, java.lang.Comparable)
    
    /**
     * @utbot.classUnderTest {@link org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset}
     * @utbot.methodUnderTest {@link org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset#getMinRegularValue(java.lang.Comparable,java.lang.Comparable)}
     */
    @Test(expected = UnknownKeyException.class)
    public void testGetMinRegularValueThrowsUKE() {
        DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset = new DefaultBoxAndWhiskerCategoryDataset();
        DatasetGroup datasetGroup = new DatasetGroup("");
        defaultBoxAndWhiskerCategoryDataset.setGroup(datasetGroup);
        SimpleTimePeriod simpleTimePeriod = new SimpleTimePeriod(java.lang.Long.MIN_VALUE, -1L);
        XYCoordinate xYCoordinate = new XYCoordinate(-1.0, -1.0);
        
        defaultBoxAndWhiskerCategoryDataset.getMinRegularValue(simpleTimePeriod, xYCoordinate);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method getMinRegularValue(java.lang.Comparable, java.lang.Comparable)
    
    @Test
    public void testGetMinRegularValue4() throws Throwable  {
        DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset = ((DefaultBoxAndWhiskerCategoryDataset) createInstance("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset"));
        KeyedObjects2D data = ((KeyedObjects2D) createInstance("org.jfree.data.KeyedObjects2D"));
        ArrayList rowKeys = new ArrayList();
        Integer integer = 0;
        rowKeys.add(integer);
        Integer integer1 = -1;
        rowKeys.add(integer1);
        rowKeys.add(integer1);
        setField(data, "org.jfree.data.KeyedObjects2D", "rowKeys", rowKeys);
        defaultBoxAndWhiskerCategoryDataset.data = data;
        Class kindClazz = Class.forName("java.lang.invoke.LambdaForm$Kind");
        Object kind = getEnumConstantByName(kindClazz, "GENERIC");
        
        /* This test fails because method [org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset.getMinRegularValue] produces [java.lang.NullPointerException]
            org.jfree.data.KeyedObjects2D.getObject(KeyedObjects2D.java:226)
            org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset.getMinRegularValue(DefaultBoxAndWhiskerCategoryDataset.java:567) */
        Class defaultBoxAndWhiskerCategoryDatasetClazz = Class.forName("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset");
        Class integer1Type = Class.forName("java.lang.Comparable");
        Method getMinRegularValueMethod = defaultBoxAndWhiskerCategoryDatasetClazz.getDeclaredMethod("getMinRegularValue", integer1Type, integer1Type);
        getMinRegularValueMethod.setAccessible(true);
        java.lang.Object[] getMinRegularValueMethodArguments = new java.lang.Object[2];
        getMinRegularValueMethodArguments[0] = integer1;
        getMinRegularValueMethodArguments[1] = kind;
        try {
            getMinRegularValueMethod.invoke(defaultBoxAndWhiskerCategoryDataset, getMinRegularValueMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset.getColumnKeys
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getColumnKeys()
    
    /**
    @utbot.classUnderTest {@link DefaultBoxAndWhiskerCategoryDataset}
 * @utbot.methodUnderTest {@link org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset#getColumnKeys()}
 * @utbot.invokes {@link org.jfree.data.KeyedObjects2D#getColumnKeys()}
 * @utbot.returnsFrom {@code return this.data.getColumnKeys();}
 *  */
    @Test
    public void testGetColumnKeys_KeyedObjects2DGetColumnKeys() throws Exception  {
        DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset = ((DefaultBoxAndWhiskerCategoryDataset) createInstance("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset"));
        KeyedObjects2D data = ((KeyedObjects2D) createInstance("org.jfree.data.KeyedObjects2D"));
        ArrayList columnKeys = new ArrayList();
        setField(data, "org.jfree.data.KeyedObjects2D", "columnKeys", columnKeys);
        defaultBoxAndWhiskerCategoryDataset.data = data;
        
        List actual = defaultBoxAndWhiskerCategoryDataset.getColumnKeys();
        
        List expected = new ArrayList();
        
        assertTrue(deepEquals(expected, actual));
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getColumnKeys()
    
    /**
    @utbot.classUnderTest {@link DefaultBoxAndWhiskerCategoryDataset}
 * @utbot.methodUnderTest {@link org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset#getColumnKeys()}
 * @utbot.invokes {@link org.jfree.data.KeyedObjects2D#getColumnKeys()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return this.data.getColumnKeys();
 *  */
    @Test
    public void testGetColumnKeys_ThrowNullPointerException() throws Exception  {
        DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset = ((DefaultBoxAndWhiskerCategoryDataset) createInstance("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset"));
        
        /* This test fails because method [org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset.getColumnKeys] produces [java.lang.NullPointerException]
            org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset.getColumnKeys(DefaultBoxAndWhiskerCategoryDataset.java:433) */
        defaultBoxAndWhiskerCategoryDataset.getColumnKeys();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset.getMaxOutlier
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method getMaxOutlier(java.lang.Comparable, java.lang.Comparable)
    
    /**
    @utbot.classUnderTest {@link DefaultBoxAndWhiskerCategoryDataset}
 * @utbot.methodUnderTest {@link org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset#getMaxOutlier(java.lang.Comparable,java.lang.Comparable)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: BoxAndWhiskerItem item = (BoxAndWhiskerItem) this.data.getObject(rowKey, columnKey);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testGetMaxOutlier_ThrowIllegalArgumentException() throws Exception  {
        DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset = ((DefaultBoxAndWhiskerCategoryDataset) createInstance("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset"));
        KeyedObjects2D data = ((KeyedObjects2D) createInstance("org.jfree.data.KeyedObjects2D"));
        defaultBoxAndWhiskerCategoryDataset.data = data;
        
        defaultBoxAndWhiskerCategoryDataset.getMaxOutlier(((Comparable) null), ((Comparable) null));
    }
    
    /**
    @utbot.classUnderTest {@link DefaultBoxAndWhiskerCategoryDataset}
 * @utbot.methodUnderTest {@link org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset#getMaxOutlier(java.lang.Comparable,java.lang.Comparable)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: BoxAndWhiskerItem item = (BoxAndWhiskerItem) this.data.getObject(rowKey, columnKey);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testGetMaxOutlier_ThrowIllegalArgumentException_1() throws Exception  {
        DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset = ((DefaultBoxAndWhiskerCategoryDataset) createInstance("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset"));
        KeyedObjects2D data = ((KeyedObjects2D) createInstance("org.jfree.data.KeyedObjects2D"));
        defaultBoxAndWhiskerCategoryDataset.data = data;
        Integer integer = 0;
        
        defaultBoxAndWhiskerCategoryDataset.getMaxOutlier(((Comparable) integer), ((Comparable) null));
    }
    
    /**
    @utbot.classUnderTest {@link DefaultBoxAndWhiskerCategoryDataset}
 * @utbot.methodUnderTest {@link org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset#getMaxOutlier(java.lang.Comparable,java.lang.Comparable)}
 * @utbot.throwsException {@link org.jfree.data.UnknownKeyException} in: BoxAndWhiskerItem item = (BoxAndWhiskerItem) this.data.getObject(rowKey, columnKey);
 *  */
    @Test(expected = UnknownKeyException.class)
    public void testGetMaxOutlier_ThrowUnknownKeyException() throws Exception  {
        DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset = ((DefaultBoxAndWhiskerCategoryDataset) createInstance("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset"));
        KeyedObjects2D data = ((KeyedObjects2D) createInstance("org.jfree.data.KeyedObjects2D"));
        ArrayList rowKeys = new ArrayList();
        setField(data, "org.jfree.data.KeyedObjects2D", "rowKeys", rowKeys);
        defaultBoxAndWhiskerCategoryDataset.data = data;
        Integer integer = 0;
        
        defaultBoxAndWhiskerCategoryDataset.getMaxOutlier(((Comparable) integer), ((Comparable) integer));
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getMaxOutlier(java.lang.Comparable, java.lang.Comparable)
    
    /**
    @utbot.classUnderTest {@link DefaultBoxAndWhiskerCategoryDataset}
 * @utbot.methodUnderTest {@link org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset#getMaxOutlier(java.lang.Comparable,java.lang.Comparable)}
 * @utbot.invokes {@link org.jfree.data.KeyedObjects2D#getObject(java.lang.Comparable,java.lang.Comparable)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: BoxAndWhiskerItem item = (BoxAndWhiskerItem) this.data.getObject(rowKey, columnKey);
 *  */
    @Test
    public void testGetMaxOutlier_ThrowNullPointerException() throws Exception  {
        DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset = ((DefaultBoxAndWhiskerCategoryDataset) createInstance("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset"));
        
        /* This test fails because method [org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset.getMaxOutlier] produces [java.lang.NullPointerException]
            org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset.getMaxOutlier(DefaultBoxAndWhiskerCategoryDataset.java:687) */
        defaultBoxAndWhiskerCategoryDataset.getMaxOutlier(((Comparable) null), ((Comparable) null));
    }
    ///endregion
    
    ///region FUZZER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method getMaxOutlier(java.lang.Comparable, java.lang.Comparable)
    
    /**
     * @utbot.classUnderTest {@link org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset}
     * @utbot.methodUnderTest {@link org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset#getMaxOutlier(java.lang.Comparable,java.lang.Comparable)}
     */
    @Test(expected = UnknownKeyException.class)
    public void testGetMaxOutlierThrowsUKE() {
        DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset = new DefaultBoxAndWhiskerCategoryDataset();
        DatasetGroup datasetGroup = new DatasetGroup("");
        defaultBoxAndWhiskerCategoryDataset.setGroup(datasetGroup);
        SimpleTimePeriod simpleTimePeriod = new SimpleTimePeriod(java.lang.Long.MIN_VALUE, -1L);
        XYCoordinate xYCoordinate = new XYCoordinate(-1.0, -1.0);
        
        defaultBoxAndWhiskerCategoryDataset.getMaxOutlier(simpleTimePeriod, xYCoordinate);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method getMaxOutlier(java.lang.Comparable, java.lang.Comparable)
    
    @Test
    public void testGetMaxOutlier1() throws Throwable  {
        DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset = ((DefaultBoxAndWhiskerCategoryDataset) createInstance("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset"));
        KeyedObjects2D data = ((KeyedObjects2D) createInstance("org.jfree.data.KeyedObjects2D"));
        ArrayList rowKeys = new ArrayList();
        Integer integer = 0;
        rowKeys.add(integer);
        rowKeys.add(null);
        rowKeys.add(null);
        setField(data, "org.jfree.data.KeyedObjects2D", "rowKeys", rowKeys);
        defaultBoxAndWhiskerCategoryDataset.data = data;
        Integer integer1 = 0;
        Year year = ((Year) createInstance("org.jfree.data.time.Year"));
        
        /* This test fails because method [org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset.getMaxOutlier] produces [java.lang.NullPointerException]
            org.jfree.data.KeyedObjects2D.getObject(KeyedObjects2D.java:226)
            org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset.getMaxOutlier(DefaultBoxAndWhiskerCategoryDataset.java:687) */
        Class defaultBoxAndWhiskerCategoryDatasetClazz = Class.forName("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset");
        Class integer1Type = Class.forName("java.lang.Comparable");
        Method getMaxOutlierMethod = defaultBoxAndWhiskerCategoryDatasetClazz.getDeclaredMethod("getMaxOutlier", integer1Type, integer1Type);
        getMaxOutlierMethod.setAccessible(true);
        java.lang.Object[] getMaxOutlierMethodArguments = new java.lang.Object[2];
        getMaxOutlierMethodArguments[0] = integer1;
        getMaxOutlierMethodArguments[1] = year;
        try {
            getMaxOutlierMethod.invoke(defaultBoxAndWhiskerCategoryDataset, getMaxOutlierMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset.getMaxOutlier
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getMaxOutlier(int, int)
    
    /**
    @utbot.classUnderTest {@link DefaultBoxAndWhiskerCategoryDataset}
 * @utbot.methodUnderTest {@link org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset#getMaxOutlier(int,int)}
 * @utbot.returnsFrom {@code return result;}
 *  */
    @Test
    public void testGetMaxOutlier_ReturnResult() throws Exception  {
        DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset = ((DefaultBoxAndWhiskerCategoryDataset) createInstance("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset"));
        KeyedObjects2D data = ((KeyedObjects2D) createInstance("org.jfree.data.KeyedObjects2D"));
        ArrayList rows = new ArrayList();
        rows.add(null);
        setField(data, "org.jfree.data.KeyedObjects2D", "rows", rows);
        defaultBoxAndWhiskerCategoryDataset.data = data;
        
        Number actual = defaultBoxAndWhiskerCategoryDataset.getMaxOutlier(0, -255);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link DefaultBoxAndWhiskerCategoryDataset}
 * @utbot.methodUnderTest {@link org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset#getMaxOutlier(int,int)}
 * @utbot.returnsFrom {@code return result;}
 *  */
    @Test
    public void testGetMaxOutlier_ReturnResult_1() throws Exception  {
        DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset = ((DefaultBoxAndWhiskerCategoryDataset) createInstance("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset"));
        KeyedObjects2D data = ((KeyedObjects2D) createInstance("org.jfree.data.KeyedObjects2D"));
        ArrayList columnKeys = new ArrayList();
        KeyedObjects keyedObjects = ((KeyedObjects) createInstance("org.jfree.data.KeyedObjects"));
        columnKeys.add(keyedObjects);
        columnKeys.add(null);
        columnKeys.add(null);
        setField(data, "org.jfree.data.KeyedObjects2D", "columnKeys", columnKeys);
        setField(data, "org.jfree.data.KeyedObjects2D", "rows", columnKeys);
        defaultBoxAndWhiskerCategoryDataset.data = data;
        
        Number actual = defaultBoxAndWhiskerCategoryDataset.getMaxOutlier(0, 2);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getMaxOutlier(int, int)
    
    /**
    @utbot.classUnderTest {@link DefaultBoxAndWhiskerCategoryDataset}
 * @utbot.methodUnderTest {@link org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset#getMaxOutlier(int,int)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: BoxAndWhiskerItem item = (BoxAndWhiskerItem) this.data.getObject(row, column);
 *  */
    @Test
    public void testGetMaxOutlier_ThrowClassCastException() throws Exception  {
        DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset = ((DefaultBoxAndWhiskerCategoryDataset) createInstance("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset"));
        KeyedObjects2D data = ((KeyedObjects2D) createInstance("org.jfree.data.KeyedObjects2D"));
        ArrayList rows = new ArrayList();
        Object object = createInstance("java.lang.Object");
        rows.add(object);
        setField(data, "org.jfree.data.KeyedObjects2D", "rows", rows);
        defaultBoxAndWhiskerCategoryDataset.data = data;
        
        /* This test fails because method [org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset.getMaxOutlier] produces [java.lang.ClassCastException: class java.lang.Object cannot be cast to class org.jfree.data.KeyedObjects (java.lang.Object is in module java.base of loader 'bootstrap'; org.jfree.data.KeyedObjects is in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @731af3fd)]
            org.jfree.data.KeyedObjects2D.getObject(KeyedObjects2D.java:114)
            org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset.getMaxOutlier(DefaultBoxAndWhiskerCategoryDataset.java:667) */
        defaultBoxAndWhiskerCategoryDataset.getMaxOutlier(0, -255);
    }
    
    /**
    @utbot.classUnderTest {@link DefaultBoxAndWhiskerCategoryDataset}
 * @utbot.methodUnderTest {@link org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset#getMaxOutlier(int,int)}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: BoxAndWhiskerItem item = (BoxAndWhiskerItem) this.data.getObject(row, column);
 *  */
    @Test
    public void testGetMaxOutlier_ThrowIndexOutOfBoundsException_1() throws Exception  {
        DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset = ((DefaultBoxAndWhiskerCategoryDataset) createInstance("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset"));
        KeyedObjects2D data = ((KeyedObjects2D) createInstance("org.jfree.data.KeyedObjects2D"));
        ArrayList columnKeys = new ArrayList();
        KeyedObjects keyedObjects = ((KeyedObjects) createInstance("org.jfree.data.KeyedObjects"));
        columnKeys.add(keyedObjects);
        setField(data, "org.jfree.data.KeyedObjects2D", "columnKeys", columnKeys);
        setField(data, "org.jfree.data.KeyedObjects2D", "rows", columnKeys);
        defaultBoxAndWhiskerCategoryDataset.data = data;
        
        /* This test fails because method [org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset.getMaxOutlier] produces [java.lang.IndexOutOfBoundsException: Index -1 out of bounds for length 1]
            java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
            java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
            java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:266)
            java.base/java.util.Objects.checkIndex(Objects.java:359)
            java.base/java.util.ArrayList.get(ArrayList.java:427)
            org.jfree.data.KeyedObjects2D.getObject(KeyedObjects2D.java:116)
            org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset.getMaxOutlier(DefaultBoxAndWhiskerCategoryDataset.java:667) */
        defaultBoxAndWhiskerCategoryDataset.getMaxOutlier(0, -1);
    }
    
    /**
    @utbot.classUnderTest {@link DefaultBoxAndWhiskerCategoryDataset}
 * @utbot.methodUnderTest {@link org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset#getMaxOutlier(int,int)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: BoxAndWhiskerItem item = (BoxAndWhiskerItem) this.data.getObject(row, column);
 *  */
    @Test
    public void testGetMaxOutlier_ThrowClassCastException_1() throws Exception  {
        DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset = ((DefaultBoxAndWhiskerCategoryDataset) createInstance("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset"));
        KeyedObjects2D data = ((KeyedObjects2D) createInstance("org.jfree.data.KeyedObjects2D"));
        ArrayList columnKeys = new ArrayList();
        KeyedObjects keyedObjects = ((KeyedObjects) createInstance("org.jfree.data.KeyedObjects"));
        columnKeys.add(keyedObjects);
        columnKeys.add(null);
        columnKeys.add(null);
        setField(data, "org.jfree.data.KeyedObjects2D", "columnKeys", columnKeys);
        setField(data, "org.jfree.data.KeyedObjects2D", "rows", columnKeys);
        defaultBoxAndWhiskerCategoryDataset.data = data;
        
        /* This test fails because method [org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset.getMaxOutlier] produces [java.lang.ClassCastException: class org.jfree.data.KeyedObjects cannot be cast to class java.lang.Comparable (org.jfree.data.KeyedObjects is in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @731af3fd; java.lang.Comparable is in module java.base of loader 'bootstrap')]
            org.jfree.data.KeyedObjects2D.getObject(KeyedObjects2D.java:116)
            org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset.getMaxOutlier(DefaultBoxAndWhiskerCategoryDataset.java:667) */
        defaultBoxAndWhiskerCategoryDataset.getMaxOutlier(0, 0);
    }
    
    /**
    @utbot.classUnderTest {@link DefaultBoxAndWhiskerCategoryDataset}
 * @utbot.methodUnderTest {@link org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset#getMaxOutlier(int,int)}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: BoxAndWhiskerItem item = (BoxAndWhiskerItem) this.data.getObject(row, column);
 *  */
    @Test
    public void testGetMaxOutlier_ThrowIndexOutOfBoundsException() throws Exception  {
        DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset = ((DefaultBoxAndWhiskerCategoryDataset) createInstance("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset"));
        KeyedObjects2D data = ((KeyedObjects2D) createInstance("org.jfree.data.KeyedObjects2D"));
        ArrayList rows = new ArrayList();
        rows.add(null);
        rows.add(null);
        rows.add(null);
        setField(data, "org.jfree.data.KeyedObjects2D", "rows", rows);
        defaultBoxAndWhiskerCategoryDataset.data = data;
        
        /* This test fails because method [org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset.getMaxOutlier] produces [java.lang.IndexOutOfBoundsException: Index -1 out of bounds for length 3]
            java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
            java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
            java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:266)
            java.base/java.util.Objects.checkIndex(Objects.java:359)
            java.base/java.util.ArrayList.get(ArrayList.java:427)
            org.jfree.data.KeyedObjects2D.getObject(KeyedObjects2D.java:114)
            org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset.getMaxOutlier(DefaultBoxAndWhiskerCategoryDataset.java:667) */
        defaultBoxAndWhiskerCategoryDataset.getMaxOutlier(-1, -255);
    }
    
    /**
    @utbot.classUnderTest {@link DefaultBoxAndWhiskerCategoryDataset}
 * @utbot.methodUnderTest {@link org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset#getMaxOutlier(int,int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: BoxAndWhiskerItem item = (BoxAndWhiskerItem) this.data.getObject(row, column);
 *  */
    @Test
    public void testGetMaxOutlier_ThrowNullPointerException1() throws Exception  {
        DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset = ((DefaultBoxAndWhiskerCategoryDataset) createInstance("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset"));
        
        /* This test fails because method [org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset.getMaxOutlier] produces [java.lang.NullPointerException]
            org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset.getMaxOutlier(DefaultBoxAndWhiskerCategoryDataset.java:667) */
        defaultBoxAndWhiskerCategoryDataset.getMaxOutlier(-255, -255);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method getMaxOutlier(int, int)
    
    @Test
    public void testGetMaxOutlier2() throws Exception  {
        DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset = ((DefaultBoxAndWhiskerCategoryDataset) createInstance("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset"));
        KeyedObjects2D data = ((KeyedObjects2D) createInstance("org.jfree.data.KeyedObjects2D"));
        ArrayList columnKeys = new ArrayList();
        Object chronoZonedDateTimeImpl = createInstance("java.time.chrono.ChronoZonedDateTimeImpl");
        columnKeys.add(chronoZonedDateTimeImpl);
        Object object = createInstance("java.lang.Object");
        columnKeys.add(object);
        KeyedObjects keyedObjects = ((KeyedObjects) createInstance("org.jfree.data.KeyedObjects"));
        setField(keyedObjects, "org.jfree.data.KeyedObjects", "data", columnKeys);
        columnKeys.add(keyedObjects);
        setField(data, "org.jfree.data.KeyedObjects2D", "columnKeys", columnKeys);
        setField(data, "org.jfree.data.KeyedObjects2D", "rows", columnKeys);
        defaultBoxAndWhiskerCategoryDataset.data = data;
        
        /* This test fails because method [org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset.getMaxOutlier] produces [java.lang.ClassCastException: class java.time.chrono.ChronoZonedDateTimeImpl cannot be cast to class org.jfree.data.KeyedObject (java.time.chrono.ChronoZonedDateTimeImpl is in module java.base of loader 'bootstrap'; org.jfree.data.KeyedObject is in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @731af3fd)]
            org.jfree.data.KeyedObjects.getIndex(KeyedObjects.java:134)
            org.jfree.data.KeyedObjects2D.getObject(KeyedObjects2D.java:118)
            org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset.getMaxOutlier(DefaultBoxAndWhiskerCategoryDataset.java:667) */
        defaultBoxAndWhiskerCategoryDataset.getMaxOutlier(2, 0);
    }
    
    @Test
    public void testGetMaxOutlier3() throws Exception  {
        DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset = ((DefaultBoxAndWhiskerCategoryDataset) createInstance("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset"));
        KeyedObjects2D data = ((KeyedObjects2D) createInstance("org.jfree.data.KeyedObjects2D"));
        ArrayList columnKeys = new ArrayList();
        KeyedObjects keyedObjects = ((KeyedObjects) createInstance("org.jfree.data.KeyedObjects"));
        ArrayList data1 = new ArrayList();
        data1.add(null);
        data1.add(null);
        data1.add(null);
        setField(keyedObjects, "org.jfree.data.KeyedObjects", "data", data1);
        columnKeys.add(keyedObjects);
        columnKeys.add(null);
        KnownOIDs anonymousKnownOIDs = ((KnownOIDs) createInstance("sun.security.util.KnownOIDs$3"));
        columnKeys.add(anonymousKnownOIDs);
        setField(data, "org.jfree.data.KeyedObjects2D", "columnKeys", columnKeys);
        setField(data, "org.jfree.data.KeyedObjects2D", "rows", columnKeys);
        defaultBoxAndWhiskerCategoryDataset.data = data;
        
        /* This test fails because method [org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset.getMaxOutlier] produces [java.lang.NullPointerException]
            org.jfree.data.KeyedObjects.getIndex(KeyedObjects.java:135)
            org.jfree.data.KeyedObjects2D.getObject(KeyedObjects2D.java:118)
            org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset.getMaxOutlier(DefaultBoxAndWhiskerCategoryDataset.java:667) */
        defaultBoxAndWhiskerCategoryDataset.getMaxOutlier(0, 2);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset.getMinOutlier
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getMinOutlier(int, int)
    
    /**
    @utbot.classUnderTest {@link DefaultBoxAndWhiskerCategoryDataset}
 * @utbot.methodUnderTest {@link org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset#getMinOutlier(int,int)}
 * @utbot.returnsFrom {@code return result;}
 *  */
    @Test
    public void testGetMinOutlier_ReturnResult() throws Exception  {
        DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset = ((DefaultBoxAndWhiskerCategoryDataset) createInstance("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset"));
        KeyedObjects2D data = ((KeyedObjects2D) createInstance("org.jfree.data.KeyedObjects2D"));
        ArrayList rows = new ArrayList();
        rows.add(null);
        setField(data, "org.jfree.data.KeyedObjects2D", "rows", rows);
        defaultBoxAndWhiskerCategoryDataset.data = data;
        
        Number actual = defaultBoxAndWhiskerCategoryDataset.getMinOutlier(0, -255);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link DefaultBoxAndWhiskerCategoryDataset}
 * @utbot.methodUnderTest {@link org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset#getMinOutlier(int,int)}
 * @utbot.returnsFrom {@code return result;}
 *  */
    @Test
    public void testGetMinOutlier_ReturnResult_1() throws Exception  {
        DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset = ((DefaultBoxAndWhiskerCategoryDataset) createInstance("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset"));
        KeyedObjects2D data = ((KeyedObjects2D) createInstance("org.jfree.data.KeyedObjects2D"));
        ArrayList columnKeys = new ArrayList();
        KeyedObjects keyedObjects = ((KeyedObjects) createInstance("org.jfree.data.KeyedObjects"));
        columnKeys.add(keyedObjects);
        columnKeys.add(null);
        columnKeys.add(null);
        setField(data, "org.jfree.data.KeyedObjects2D", "columnKeys", columnKeys);
        setField(data, "org.jfree.data.KeyedObjects2D", "rows", columnKeys);
        defaultBoxAndWhiskerCategoryDataset.data = data;
        
        Number actual = defaultBoxAndWhiskerCategoryDataset.getMinOutlier(0, 2);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getMinOutlier(int, int)
    
    /**
    @utbot.classUnderTest {@link DefaultBoxAndWhiskerCategoryDataset}
 * @utbot.methodUnderTest {@link org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset#getMinOutlier(int,int)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: BoxAndWhiskerItem item = (BoxAndWhiskerItem) this.data.getObject(row, column);
 *  */
    @Test
    public void testGetMinOutlier_ThrowClassCastException() throws Exception  {
        DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset = ((DefaultBoxAndWhiskerCategoryDataset) createInstance("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset"));
        KeyedObjects2D data = ((KeyedObjects2D) createInstance("org.jfree.data.KeyedObjects2D"));
        ArrayList rows = new ArrayList();
        Object object = createInstance("java.lang.Object");
        rows.add(object);
        setField(data, "org.jfree.data.KeyedObjects2D", "rows", rows);
        defaultBoxAndWhiskerCategoryDataset.data = data;
        
        /* This test fails because method [org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset.getMinOutlier] produces [java.lang.ClassCastException: class java.lang.Object cannot be cast to class org.jfree.data.KeyedObjects (java.lang.Object is in module java.base of loader 'bootstrap'; org.jfree.data.KeyedObjects is in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @731af3fd)]
            org.jfree.data.KeyedObjects2D.getObject(KeyedObjects2D.java:114)
            org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset.getMinOutlier(DefaultBoxAndWhiskerCategoryDataset.java:627) */
        defaultBoxAndWhiskerCategoryDataset.getMinOutlier(0, -255);
    }
    
    /**
    @utbot.classUnderTest {@link DefaultBoxAndWhiskerCategoryDataset}
 * @utbot.methodUnderTest {@link org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset#getMinOutlier(int,int)}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: BoxAndWhiskerItem item = (BoxAndWhiskerItem) this.data.getObject(row, column);
 *  */
    @Test
    public void testGetMinOutlier_ThrowIndexOutOfBoundsException_1() throws Exception  {
        DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset = ((DefaultBoxAndWhiskerCategoryDataset) createInstance("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset"));
        KeyedObjects2D data = ((KeyedObjects2D) createInstance("org.jfree.data.KeyedObjects2D"));
        ArrayList columnKeys = new ArrayList();
        KeyedObjects keyedObjects = ((KeyedObjects) createInstance("org.jfree.data.KeyedObjects"));
        columnKeys.add(keyedObjects);
        setField(data, "org.jfree.data.KeyedObjects2D", "columnKeys", columnKeys);
        setField(data, "org.jfree.data.KeyedObjects2D", "rows", columnKeys);
        defaultBoxAndWhiskerCategoryDataset.data = data;
        
        /* This test fails because method [org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset.getMinOutlier] produces [java.lang.IndexOutOfBoundsException: Index -1 out of bounds for length 1]
            java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
            java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
            java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:266)
            java.base/java.util.Objects.checkIndex(Objects.java:359)
            java.base/java.util.ArrayList.get(ArrayList.java:427)
            org.jfree.data.KeyedObjects2D.getObject(KeyedObjects2D.java:116)
            org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset.getMinOutlier(DefaultBoxAndWhiskerCategoryDataset.java:627) */
        defaultBoxAndWhiskerCategoryDataset.getMinOutlier(0, -1);
    }
    
    /**
    @utbot.classUnderTest {@link DefaultBoxAndWhiskerCategoryDataset}
 * @utbot.methodUnderTest {@link org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset#getMinOutlier(int,int)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: BoxAndWhiskerItem item = (BoxAndWhiskerItem) this.data.getObject(row, column);
 *  */
    @Test
    public void testGetMinOutlier_ThrowClassCastException_1() throws Exception  {
        DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset = ((DefaultBoxAndWhiskerCategoryDataset) createInstance("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset"));
        KeyedObjects2D data = ((KeyedObjects2D) createInstance("org.jfree.data.KeyedObjects2D"));
        ArrayList columnKeys = new ArrayList();
        KeyedObjects keyedObjects = ((KeyedObjects) createInstance("org.jfree.data.KeyedObjects"));
        columnKeys.add(keyedObjects);
        columnKeys.add(null);
        columnKeys.add(null);
        setField(data, "org.jfree.data.KeyedObjects2D", "columnKeys", columnKeys);
        setField(data, "org.jfree.data.KeyedObjects2D", "rows", columnKeys);
        defaultBoxAndWhiskerCategoryDataset.data = data;
        
        /* This test fails because method [org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset.getMinOutlier] produces [java.lang.ClassCastException: class org.jfree.data.KeyedObjects cannot be cast to class java.lang.Comparable (org.jfree.data.KeyedObjects is in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @731af3fd; java.lang.Comparable is in module java.base of loader 'bootstrap')]
            org.jfree.data.KeyedObjects2D.getObject(KeyedObjects2D.java:116)
            org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset.getMinOutlier(DefaultBoxAndWhiskerCategoryDataset.java:627) */
        defaultBoxAndWhiskerCategoryDataset.getMinOutlier(0, 0);
    }
    
    /**
    @utbot.classUnderTest {@link DefaultBoxAndWhiskerCategoryDataset}
 * @utbot.methodUnderTest {@link org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset#getMinOutlier(int,int)}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: BoxAndWhiskerItem item = (BoxAndWhiskerItem) this.data.getObject(row, column);
 *  */
    @Test
    public void testGetMinOutlier_ThrowIndexOutOfBoundsException() throws Exception  {
        DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset = ((DefaultBoxAndWhiskerCategoryDataset) createInstance("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset"));
        KeyedObjects2D data = ((KeyedObjects2D) createInstance("org.jfree.data.KeyedObjects2D"));
        ArrayList rows = new ArrayList();
        rows.add(null);
        rows.add(null);
        rows.add(null);
        setField(data, "org.jfree.data.KeyedObjects2D", "rows", rows);
        defaultBoxAndWhiskerCategoryDataset.data = data;
        
        /* This test fails because method [org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset.getMinOutlier] produces [java.lang.IndexOutOfBoundsException: Index -1 out of bounds for length 3]
            java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
            java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
            java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:266)
            java.base/java.util.Objects.checkIndex(Objects.java:359)
            java.base/java.util.ArrayList.get(ArrayList.java:427)
            org.jfree.data.KeyedObjects2D.getObject(KeyedObjects2D.java:114)
            org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset.getMinOutlier(DefaultBoxAndWhiskerCategoryDataset.java:627) */
        defaultBoxAndWhiskerCategoryDataset.getMinOutlier(-1, -255);
    }
    
    /**
    @utbot.classUnderTest {@link DefaultBoxAndWhiskerCategoryDataset}
 * @utbot.methodUnderTest {@link org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset#getMinOutlier(int,int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: BoxAndWhiskerItem item = (BoxAndWhiskerItem) this.data.getObject(row, column);
 *  */
    @Test
    public void testGetMinOutlier_ThrowNullPointerException() throws Exception  {
        DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset = ((DefaultBoxAndWhiskerCategoryDataset) createInstance("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset"));
        
        /* This test fails because method [org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset.getMinOutlier] produces [java.lang.NullPointerException]
            org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset.getMinOutlier(DefaultBoxAndWhiskerCategoryDataset.java:627) */
        defaultBoxAndWhiskerCategoryDataset.getMinOutlier(-255, -255);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method getMinOutlier(int, int)
    
    @Test
    public void testGetMinOutlier1() throws Exception  {
        DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset = ((DefaultBoxAndWhiskerCategoryDataset) createInstance("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset"));
        KeyedObjects2D data = ((KeyedObjects2D) createInstance("org.jfree.data.KeyedObjects2D"));
        ArrayList columnKeys = new ArrayList();
        Object processHandleImpl = createInstance("java.lang.ProcessHandleImpl");
        columnKeys.add(processHandleImpl);
        KeyedObjects keyedObjects = ((KeyedObjects) createInstance("org.jfree.data.KeyedObjects"));
        ArrayList data1 = new ArrayList();
        data1.add(processHandleImpl);
        data1.add(null);
        data1.add(null);
        setField(keyedObjects, "org.jfree.data.KeyedObjects", "data", data1);
        columnKeys.add(keyedObjects);
        columnKeys.add(null);
        setField(data, "org.jfree.data.KeyedObjects2D", "columnKeys", columnKeys);
        setField(data, "org.jfree.data.KeyedObjects2D", "rows", columnKeys);
        defaultBoxAndWhiskerCategoryDataset.data = data;
        
        /* This test fails because method [org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset.getMinOutlier] produces [java.lang.ClassCastException: class java.lang.ProcessHandleImpl cannot be cast to class org.jfree.data.KeyedObject (java.lang.ProcessHandleImpl is in module java.base of loader 'bootstrap'; org.jfree.data.KeyedObject is in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @731af3fd)]
            org.jfree.data.KeyedObjects.getIndex(KeyedObjects.java:134)
            org.jfree.data.KeyedObjects2D.getObject(KeyedObjects2D.java:118)
            org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset.getMinOutlier(DefaultBoxAndWhiskerCategoryDataset.java:627) */
        defaultBoxAndWhiskerCategoryDataset.getMinOutlier(1, 0);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset.getMinOutlier
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method getMinOutlier(java.lang.Comparable, java.lang.Comparable)
    
    /**
    @utbot.classUnderTest {@link DefaultBoxAndWhiskerCategoryDataset}
 * @utbot.methodUnderTest {@link org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset#getMinOutlier(java.lang.Comparable,java.lang.Comparable)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: BoxAndWhiskerItem item = (BoxAndWhiskerItem) this.data.getObject(rowKey, columnKey);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testGetMinOutlier_ThrowIllegalArgumentException() throws Exception  {
        DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset = ((DefaultBoxAndWhiskerCategoryDataset) createInstance("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset"));
        KeyedObjects2D data = ((KeyedObjects2D) createInstance("org.jfree.data.KeyedObjects2D"));
        defaultBoxAndWhiskerCategoryDataset.data = data;
        
        defaultBoxAndWhiskerCategoryDataset.getMinOutlier(((Comparable) null), ((Comparable) null));
    }
    
    /**
    @utbot.classUnderTest {@link DefaultBoxAndWhiskerCategoryDataset}
 * @utbot.methodUnderTest {@link org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset#getMinOutlier(java.lang.Comparable,java.lang.Comparable)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: BoxAndWhiskerItem item = (BoxAndWhiskerItem) this.data.getObject(rowKey, columnKey);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testGetMinOutlier_ThrowIllegalArgumentException_1() throws Exception  {
        DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset = ((DefaultBoxAndWhiskerCategoryDataset) createInstance("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset"));
        KeyedObjects2D data = ((KeyedObjects2D) createInstance("org.jfree.data.KeyedObjects2D"));
        defaultBoxAndWhiskerCategoryDataset.data = data;
        Integer integer = 0;
        
        defaultBoxAndWhiskerCategoryDataset.getMinOutlier(((Comparable) integer), ((Comparable) null));
    }
    
    /**
    @utbot.classUnderTest {@link DefaultBoxAndWhiskerCategoryDataset}
 * @utbot.methodUnderTest {@link org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset#getMinOutlier(java.lang.Comparable,java.lang.Comparable)}
 * @utbot.throwsException {@link org.jfree.data.UnknownKeyException} in: BoxAndWhiskerItem item = (BoxAndWhiskerItem) this.data.getObject(rowKey, columnKey);
 *  */
    @Test(expected = UnknownKeyException.class)
    public void testGetMinOutlier_ThrowUnknownKeyException() throws Exception  {
        DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset = ((DefaultBoxAndWhiskerCategoryDataset) createInstance("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset"));
        KeyedObjects2D data = ((KeyedObjects2D) createInstance("org.jfree.data.KeyedObjects2D"));
        ArrayList rowKeys = new ArrayList();
        setField(data, "org.jfree.data.KeyedObjects2D", "rowKeys", rowKeys);
        defaultBoxAndWhiskerCategoryDataset.data = data;
        Integer integer = 0;
        
        defaultBoxAndWhiskerCategoryDataset.getMinOutlier(((Comparable) integer), ((Comparable) integer));
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getMinOutlier(java.lang.Comparable, java.lang.Comparable)
    
    /**
    @utbot.classUnderTest {@link DefaultBoxAndWhiskerCategoryDataset}
 * @utbot.methodUnderTest {@link org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset#getMinOutlier(java.lang.Comparable,java.lang.Comparable)}
 * @utbot.invokes {@link org.jfree.data.KeyedObjects2D#getObject(java.lang.Comparable,java.lang.Comparable)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: BoxAndWhiskerItem item = (BoxAndWhiskerItem) this.data.getObject(rowKey, columnKey);
 *  */
    @Test
    public void testGetMinOutlier_ThrowNullPointerException1() throws Exception  {
        DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset = ((DefaultBoxAndWhiskerCategoryDataset) createInstance("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset"));
        
        /* This test fails because method [org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset.getMinOutlier] produces [java.lang.NullPointerException]
            org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset.getMinOutlier(DefaultBoxAndWhiskerCategoryDataset.java:647) */
        defaultBoxAndWhiskerCategoryDataset.getMinOutlier(((Comparable) null), ((Comparable) null));
    }
    ///endregion
    
    ///region FUZZER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method getMinOutlier(java.lang.Comparable, java.lang.Comparable)
    
    /**
     * @utbot.classUnderTest {@link org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset}
     * @utbot.methodUnderTest {@link org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset#getMinOutlier(java.lang.Comparable,java.lang.Comparable)}
     */
    @Test(expected = UnknownKeyException.class)
    public void testGetMinOutlierThrowsUKE() {
        DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset = new DefaultBoxAndWhiskerCategoryDataset();
        DatasetGroup datasetGroup = new DatasetGroup("");
        defaultBoxAndWhiskerCategoryDataset.setGroup(datasetGroup);
        SimpleTimePeriod simpleTimePeriod = new SimpleTimePeriod(java.lang.Long.MIN_VALUE, -1L);
        XYCoordinate xYCoordinate = new XYCoordinate(-1.0, -1.0);
        
        defaultBoxAndWhiskerCategoryDataset.getMinOutlier(simpleTimePeriod, xYCoordinate);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method getMinOutlier(java.lang.Comparable, java.lang.Comparable)
    
    @Test
    public void testGetMinOutlier2() throws Throwable  {
        DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset = ((DefaultBoxAndWhiskerCategoryDataset) createInstance("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset"));
        KeyedObjects2D data = ((KeyedObjects2D) createInstance("org.jfree.data.KeyedObjects2D"));
        ArrayList rowKeys = new ArrayList();
        Integer integer = 0;
        rowKeys.add(integer);
        rowKeys.add(null);
        rowKeys.add(null);
        setField(data, "org.jfree.data.KeyedObjects2D", "rowKeys", rowKeys);
        defaultBoxAndWhiskerCategoryDataset.data = data;
        Integer integer1 = 0;
        Year year = ((Year) createInstance("org.jfree.data.time.Year"));
        
        /* This test fails because method [org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset.getMinOutlier] produces [java.lang.NullPointerException]
            org.jfree.data.KeyedObjects2D.getObject(KeyedObjects2D.java:226)
            org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset.getMinOutlier(DefaultBoxAndWhiskerCategoryDataset.java:647) */
        Class defaultBoxAndWhiskerCategoryDatasetClazz = Class.forName("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset");
        Class integer1Type = Class.forName("java.lang.Comparable");
        Method getMinOutlierMethod = defaultBoxAndWhiskerCategoryDatasetClazz.getDeclaredMethod("getMinOutlier", integer1Type, integer1Type);
        getMinOutlierMethod.setAccessible(true);
        java.lang.Object[] getMinOutlierMethodArguments = new java.lang.Object[2];
        getMinOutlierMethodArguments[0] = integer1;
        getMinOutlierMethodArguments[1] = year;
        try {
            getMinOutlierMethod.invoke(defaultBoxAndWhiskerCategoryDataset, getMinOutlierMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset.getRowKey
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getRowKey(int)
    
    /**
    @utbot.classUnderTest {@link DefaultBoxAndWhiskerCategoryDataset}
 * @utbot.methodUnderTest {@link org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset#getRowKey(int)}
 * @utbot.invokes {@link org.jfree.data.KeyedObjects2D#getRowKey(int)}
 * @utbot.returnsFrom {@code return this.data.getRowKey(row);}
 *  */
    @Test
    public void testGetRowKey_KeyedObjects2DGetRowKey() throws Exception  {
        DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset = ((DefaultBoxAndWhiskerCategoryDataset) createInstance("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset"));
        KeyedObjects2D data = ((KeyedObjects2D) createInstance("org.jfree.data.KeyedObjects2D"));
        ArrayList rowKeys = new ArrayList();
        rowKeys.add(null);
        setField(data, "org.jfree.data.KeyedObjects2D", "rowKeys", rowKeys);
        defaultBoxAndWhiskerCategoryDataset.data = data;
        
        Comparable actual = defaultBoxAndWhiskerCategoryDataset.getRowKey(0);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getRowKey(int)
    
    /**
    @utbot.classUnderTest {@link DefaultBoxAndWhiskerCategoryDataset}
 * @utbot.methodUnderTest {@link org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset#getRowKey(int)}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: return this.data.getRowKey(row);
 *  */
    @Test
    public void testGetRowKey_ThrowIndexOutOfBoundsException() throws Exception  {
        DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset = ((DefaultBoxAndWhiskerCategoryDataset) createInstance("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset"));
        KeyedObjects2D data = ((KeyedObjects2D) createInstance("org.jfree.data.KeyedObjects2D"));
        ArrayList rowKeys = new ArrayList();
        setField(data, "org.jfree.data.KeyedObjects2D", "rowKeys", rowKeys);
        defaultBoxAndWhiskerCategoryDataset.data = data;
        
        /* This test fails because method [org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset.getRowKey] produces [java.lang.IndexOutOfBoundsException: Index 0 out of bounds for length 0]
            java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
            java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
            java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:266)
            java.base/java.util.Objects.checkIndex(Objects.java:359)
            java.base/java.util.ArrayList.get(ArrayList.java:427)
            org.jfree.data.KeyedObjects2D.getRowKey(KeyedObjects2D.java:137)
            org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset.getRowKey(DefaultBoxAndWhiskerCategoryDataset.java:459) */
        defaultBoxAndWhiskerCategoryDataset.getRowKey(0);
    }
    
    /**
    @utbot.classUnderTest {@link DefaultBoxAndWhiskerCategoryDataset}
 * @utbot.methodUnderTest {@link org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset#getRowKey(int)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: return this.data.getRowKey(row);
 *  */
    @Test
    public void testGetRowKey_ThrowClassCastException() throws Exception  {
        DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset = ((DefaultBoxAndWhiskerCategoryDataset) createInstance("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset"));
        KeyedObjects2D data = ((KeyedObjects2D) createInstance("org.jfree.data.KeyedObjects2D"));
        ArrayList rowKeys = new ArrayList();
        Object object = createInstance("java.lang.Object");
        rowKeys.add(object);
        setField(data, "org.jfree.data.KeyedObjects2D", "rowKeys", rowKeys);
        defaultBoxAndWhiskerCategoryDataset.data = data;
        
        /* This test fails because method [org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset.getRowKey] produces [java.lang.ClassCastException: class java.lang.Object cannot be cast to class java.lang.Comparable (java.lang.Object and java.lang.Comparable are in module java.base of loader 'bootstrap')]
            org.jfree.data.KeyedObjects2D.getRowKey(KeyedObjects2D.java:137)
            org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset.getRowKey(DefaultBoxAndWhiskerCategoryDataset.java:459) */
        defaultBoxAndWhiskerCategoryDataset.getRowKey(0);
    }
    
    /**
    @utbot.classUnderTest {@link DefaultBoxAndWhiskerCategoryDataset}
 * @utbot.methodUnderTest {@link org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset#getRowKey(int)}
 * @utbot.invokes {@link org.jfree.data.KeyedObjects2D#getRowKey(int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return this.data.getRowKey(row);
 *  */
    @Test
    public void testGetRowKey_ThrowNullPointerException() throws Exception  {
        DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset = ((DefaultBoxAndWhiskerCategoryDataset) createInstance("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset"));
        
        /* This test fails because method [org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset.getRowKey] produces [java.lang.NullPointerException]
            org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset.getRowKey(DefaultBoxAndWhiskerCategoryDataset.java:459) */
        defaultBoxAndWhiskerCategoryDataset.getRowKey(-255);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset.getRowIndex
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getRowIndex(java.lang.Comparable)
    
    /**
    @utbot.classUnderTest {@link DefaultBoxAndWhiskerCategoryDataset}
 * @utbot.methodUnderTest {@link org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset#getRowIndex(java.lang.Comparable)}
 * @utbot.invokes {@link org.jfree.data.KeyedObjects2D#getRowIndex(java.lang.Comparable)}
 * @utbot.returnsFrom {@code return this.data.getRowIndex(key);}
 *  */
    @Test
    public void testGetRowIndex_KeyedObjects2DGetRowIndex() throws Exception  {
        DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset = ((DefaultBoxAndWhiskerCategoryDataset) createInstance("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset"));
        KeyedObjects2D data = ((KeyedObjects2D) createInstance("org.jfree.data.KeyedObjects2D"));
        ArrayList rowKeys = new ArrayList();
        setField(data, "org.jfree.data.KeyedObjects2D", "rowKeys", rowKeys);
        defaultBoxAndWhiskerCategoryDataset.data = data;
        Integer integer = 0;
        
        int actual = defaultBoxAndWhiskerCategoryDataset.getRowIndex(integer);
        
        assertEquals(-1, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getRowIndex(java.lang.Comparable)
    
    /**
    @utbot.classUnderTest {@link DefaultBoxAndWhiskerCategoryDataset}
 * @utbot.methodUnderTest {@link org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset#getRowIndex(java.lang.Comparable)}
 * @utbot.invokes {@link org.jfree.data.KeyedObjects2D#getRowIndex(java.lang.Comparable)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return this.data.getRowIndex(key);
 *  */
    @Test
    public void testGetRowIndex_ThrowNullPointerException() throws Exception  {
        DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset = ((DefaultBoxAndWhiskerCategoryDataset) createInstance("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset"));
        
        /* This test fails because method [org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset.getRowIndex] produces [java.lang.NullPointerException]
            org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset.getRowIndex(DefaultBoxAndWhiskerCategoryDataset.java:446) */
        defaultBoxAndWhiskerCategoryDataset.getRowIndex(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset.updateBounds
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method updateBounds()
    
    /**
    @utbot.classUnderTest {@link DefaultBoxAndWhiskerCategoryDataset}
 * @utbot.methodUnderTest {@link org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset#updateBounds()}
 *  */
    @Test
    public void testUpdateBounds() throws Exception  {
        DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset = ((DefaultBoxAndWhiskerCategoryDataset) createInstance("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset"));
        setField(defaultBoxAndWhiskerCategoryDataset, "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "minimumRangeValue", 0.0);
        setField(defaultBoxAndWhiskerCategoryDataset, "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "maximumRangeValue", 0.0);
        
        Class defaultBoxAndWhiskerCategoryDatasetClazz = Class.forName("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset");
        Method updateBoundsMethod = defaultBoxAndWhiskerCategoryDatasetClazz.getDeclaredMethod("updateBounds");
        updateBoundsMethod.setAccessible(true);
        java.lang.Object[] updateBoundsMethodArguments = new java.lang.Object[0];
        updateBoundsMethod.invoke(defaultBoxAndWhiskerCategoryDataset, updateBoundsMethodArguments);
        
        double finalDefaultBoxAndWhiskerCategoryDatasetMinimumRangeValue = ((Double) getFieldValue(defaultBoxAndWhiskerCategoryDataset, "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "minimumRangeValue"));
        double finalDefaultBoxAndWhiskerCategoryDatasetMaximumRangeValue = ((Double) getFieldValue(defaultBoxAndWhiskerCategoryDataset, "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "maximumRangeValue"));
        
        org.junit.Assert.assertEquals(java.lang.Double.NaN, finalDefaultBoxAndWhiskerCategoryDatasetMinimumRangeValue, 1.0E-6);
        
        org.junit.Assert.assertEquals(java.lang.Double.NaN, finalDefaultBoxAndWhiskerCategoryDatasetMaximumRangeValue, 1.0E-6);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset.getRangeBounds
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getRangeBounds(boolean)
    
    /**
    @utbot.classUnderTest {@link DefaultBoxAndWhiskerCategoryDataset}
 * @utbot.methodUnderTest {@link org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset#getRangeBounds(boolean)}
 * @utbot.returnsFrom {@code return this.rangeBounds;}
 *  */
    @Test
    public void testGetRangeBounds_ReturnThisRangeBounds() throws Exception  {
        DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset = ((DefaultBoxAndWhiskerCategoryDataset) createInstance("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset"));
        
        Range actual = defaultBoxAndWhiskerCategoryDataset.getRangeBounds(false);
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset.getRangeLowerBound
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getRangeLowerBound(boolean)
    
    /**
    @utbot.classUnderTest {@link DefaultBoxAndWhiskerCategoryDataset}
 * @utbot.methodUnderTest {@link org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset#getRangeLowerBound(boolean)}
 * @utbot.returnsFrom {@code return this.minimumRangeValue;}
 *  */
    @Test
    public void testGetRangeLowerBound_ReturnThisMinimumRangeValue() throws Exception  {
        DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset = ((DefaultBoxAndWhiskerCategoryDataset) createInstance("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset"));
        setField(defaultBoxAndWhiskerCategoryDataset, "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "minimumRangeValue", 0.0);
        
        double actual = defaultBoxAndWhiskerCategoryDataset.getRangeLowerBound(false);
        
        org.junit.Assert.assertEquals(0.0, actual, 1.0E-6);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset.getRowCount
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getRowCount()
    
    /**
    @utbot.classUnderTest {@link DefaultBoxAndWhiskerCategoryDataset}
 * @utbot.methodUnderTest {@link org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset#getRowCount()}
 * @utbot.invokes {@link org.jfree.data.KeyedObjects2D#getRowCount()}
 * @utbot.returnsFrom {@code return this.data.getRowCount();}
 *  */
    @Test
    public void testGetRowCount_KeyedObjects2DGetRowCount() throws Exception  {
        DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset = ((DefaultBoxAndWhiskerCategoryDataset) createInstance("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset"));
        KeyedObjects2D data = ((KeyedObjects2D) createInstance("org.jfree.data.KeyedObjects2D"));
        ArrayList rowKeys = new ArrayList();
        rowKeys.add(null);
        rowKeys.add(null);
        rowKeys.add(null);
        setField(data, "org.jfree.data.KeyedObjects2D", "rowKeys", rowKeys);
        defaultBoxAndWhiskerCategoryDataset.data = data;
        
        int actual = defaultBoxAndWhiskerCategoryDataset.getRowCount();
        
        assertEquals(3, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getRowCount()
    
    /**
    @utbot.classUnderTest {@link DefaultBoxAndWhiskerCategoryDataset}
 * @utbot.methodUnderTest {@link org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset#getRowCount()}
 * @utbot.invokes {@link org.jfree.data.KeyedObjects2D#getRowCount()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return this.data.getRowCount();
 *  */
    @Test
    public void testGetRowCount_ThrowNullPointerException() throws Exception  {
        DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset = ((DefaultBoxAndWhiskerCategoryDataset) createInstance("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset"));
        
        /* This test fails because method [org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset.getRowCount] produces [java.lang.NullPointerException]
            org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset.getRowCount(DefaultBoxAndWhiskerCategoryDataset.java:481) */
        defaultBoxAndWhiskerCategoryDataset.getRowCount();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset.getRowKeys
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getRowKeys()
    
    /**
    @utbot.classUnderTest {@link DefaultBoxAndWhiskerCategoryDataset}
 * @utbot.methodUnderTest {@link org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset#getRowKeys()}
 * @utbot.invokes {@link org.jfree.data.KeyedObjects2D#getRowKeys()}
 * @utbot.returnsFrom {@code return this.data.getRowKeys();}
 *  */
    @Test
    public void testGetRowKeys_KeyedObjects2DGetRowKeys() throws Exception  {
        DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset = ((DefaultBoxAndWhiskerCategoryDataset) createInstance("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset"));
        KeyedObjects2D data = ((KeyedObjects2D) createInstance("org.jfree.data.KeyedObjects2D"));
        ArrayList rowKeys = new ArrayList();
        setField(data, "org.jfree.data.KeyedObjects2D", "rowKeys", rowKeys);
        defaultBoxAndWhiskerCategoryDataset.data = data;
        
        List actual = defaultBoxAndWhiskerCategoryDataset.getRowKeys();
        
        List expected = new ArrayList();
        
        assertTrue(deepEquals(expected, actual));
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getRowKeys()
    
    /**
    @utbot.classUnderTest {@link DefaultBoxAndWhiskerCategoryDataset}
 * @utbot.methodUnderTest {@link org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset#getRowKeys()}
 * @utbot.invokes {@link org.jfree.data.KeyedObjects2D#getRowKeys()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return this.data.getRowKeys();
 *  */
    @Test
    public void testGetRowKeys_ThrowNullPointerException() throws Exception  {
        DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset = ((DefaultBoxAndWhiskerCategoryDataset) createInstance("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset"));
        
        /* This test fails because method [org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset.getRowKeys] produces [java.lang.NullPointerException]
            org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset.getRowKeys(DefaultBoxAndWhiskerCategoryDataset.java:470) */
        defaultBoxAndWhiskerCategoryDataset.getRowKeys();
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
        
                java.lang.reflect.Method methodForGetDeclaredFields799654680204100 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields799654680204100.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass799654680209700 = (java.lang.reflect.Field[]) methodForGetDeclaredFields799654680204100.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass799654680209700).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
        modifiersField.setAccessible(true);
        modifiersField.setInt(field, field.getModifiers() & ~java.lang.reflect.Modifier.FINAL);
    
        field.setAccessible(true);
        field.set(object, fieldValue);
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
    
    private static Object getFieldValue(Object obj, String fieldClassName, String fieldName) throws ClassNotFoundException, NoSuchMethodException, java.lang.reflect.InvocationTargetException, IllegalAccessException, NoSuchFieldException {
        Class<?> clazz = Class.forName(fieldClassName);
        java.lang.reflect.Field field = clazz.getDeclaredField(fieldName);
        
        field.setAccessible(true);
        
        java.lang.reflect.Field modifiersField;
        
            java.lang.reflect.Method methodForGetDeclaredFields799654684163400 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields799654684163400.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass799654684166300 = (java.lang.reflect.Field[]) methodForGetDeclaredFields799654684163400.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass799654684166300).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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

