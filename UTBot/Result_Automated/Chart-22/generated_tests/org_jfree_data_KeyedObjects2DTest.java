package org.jfree.data;

import org.junit.Test;
import java.util.ArrayList;
import java.util.Locale.FilteringMode;
import java.util.Locale;
import java.lang.reflect.Method;
import org.jfree.data.time.Minute;
import java.time.LocalDate;
import javax.xml.catalog.CatalogFeatures.Feature;
import javax.xml.catalog.CatalogFeatures;
import java.util.List;
import org.jfree.data.time.SimpleTimePeriod;
import org.jfree.data.xy.XYDataItem;
import java.lang.reflect.InvocationTargetException;
import java.time.chrono.MinguoDate;
import java.text.Normalizer.Form;
import java.text.Normalizer;
import com.sun.java.swing.plaf.windows.TMSchema.State;
import com.sun.java.swing.plaf.windows.TMSchema;
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

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public final class org_jfree_data_KeyedObjects2DTest {
    ///region Test suites for executable org.jfree.data.KeyedObjects2D.removeObject
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method removeObject(java.lang.Comparable, java.lang.Comparable)
    
    /**
    @utbot.classUnderTest {@link KeyedObjects2D}
 * @utbot.methodUnderTest {@link org.jfree.data.KeyedObjects2D#removeObject(java.lang.Comparable,java.lang.Comparable)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: setObject(null, rowKey, columnKey);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testRemoveObject_ThrowIllegalArgumentException() {
        KeyedObjects2D keyedObjects2D = new KeyedObjects2D();
        
        keyedObjects2D.removeObject(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link KeyedObjects2D}
 * @utbot.methodUnderTest {@link org.jfree.data.KeyedObjects2D#removeObject(java.lang.Comparable,java.lang.Comparable)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: setObject(null, rowKey, columnKey);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testRemoveObject_ThrowIllegalArgumentException_1() {
        KeyedObjects2D keyedObjects2D = new KeyedObjects2D();
        Integer integer = 0;
        
        keyedObjects2D.removeObject(integer, null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method removeObject(java.lang.Comparable, java.lang.Comparable)
    
    /**
    @utbot.classUnderTest {@link KeyedObjects2D}
 * @utbot.methodUnderTest {@link org.jfree.data.KeyedObjects2D#removeObject(java.lang.Comparable,java.lang.Comparable)}
 * @utbot.invokes {@link org.jfree.data.KeyedObjects2D#setObject(java.lang.Object,java.lang.Comparable,java.lang.Comparable)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: setObject(null, rowKey, columnKey);
 *  */
    @Test
    public void testRemoveObject_ThrowClassCastException() throws Exception  {
        KeyedObjects2D keyedObjects2D = ((KeyedObjects2D) createInstance("org.jfree.data.KeyedObjects2D"));
        ArrayList rowKeys = new ArrayList();
        Integer integer = 0;
        rowKeys.add(integer);
        setField(keyedObjects2D, "org.jfree.data.KeyedObjects2D", "rowKeys", rowKeys);
        setField(keyedObjects2D, "org.jfree.data.KeyedObjects2D", "rows", rowKeys);
        Long long1 = 0L;
        
        /* This test fails because method [org.jfree.data.KeyedObjects2D.removeObject] produces [java.lang.ClassCastException: class java.lang.Integer cannot be cast to class org.jfree.data.KeyedObjects (java.lang.Integer is in module java.base of loader 'bootstrap'; org.jfree.data.KeyedObjects is in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @89641db)]
            org.jfree.data.KeyedObjects2D.setObject(KeyedObjects2D.java:271)
            org.jfree.data.KeyedObjects2D.removeObject(KeyedObjects2D.java:297) */
        keyedObjects2D.removeObject(integer, long1);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method removeObject(java.lang.Comparable, java.lang.Comparable)
    
    @Test
    public void testRemoveObject1() throws Throwable  {
        KeyedObjects2D keyedObjects2D = ((KeyedObjects2D) createInstance("org.jfree.data.KeyedObjects2D"));
        ArrayList rowKeys = new ArrayList();
        Integer integer = 0;
        rowKeys.add(integer);
        rowKeys.add(null);
        rowKeys.add(null);
        setField(keyedObjects2D, "org.jfree.data.KeyedObjects2D", "rowKeys", rowKeys);
        ArrayList rows = new ArrayList();
        setField(keyedObjects2D, "org.jfree.data.KeyedObjects2D", "rows", rows);
        Locale.FilteringMode filteringMode = Locale.FilteringMode.AUTOSELECT_FILTERING;
        
        /* This test fails because method [org.jfree.data.KeyedObjects2D.removeObject] produces [java.lang.IndexOutOfBoundsException: Index 0 out of bounds for length 0]
            java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
            java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
            java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:266)
            java.base/java.util.Objects.checkIndex(Objects.java:359)
            java.base/java.util.ArrayList.get(ArrayList.java:427)
            org.jfree.data.KeyedObjects2D.setObject(KeyedObjects2D.java:271)
            org.jfree.data.KeyedObjects2D.removeObject(KeyedObjects2D.java:297) */
        Class keyedObjects2DClazz = Class.forName("org.jfree.data.KeyedObjects2D");
        Class integerType = Class.forName("java.lang.Comparable");
        Method removeObjectMethod = keyedObjects2DClazz.getDeclaredMethod("removeObject", integerType, integerType);
        removeObjectMethod.setAccessible(true);
        java.lang.Object[] removeObjectMethodArguments = new java.lang.Object[2];
        removeObjectMethodArguments[0] = integer;
        removeObjectMethodArguments[1] = filteringMode;
        try {
            removeObjectMethod.invoke(keyedObjects2D, removeObjectMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testRemoveObject2() throws Throwable  {
        KeyedObjects2D keyedObjects2D = ((KeyedObjects2D) createInstance("org.jfree.data.KeyedObjects2D"));
        ArrayList rowKeys = new ArrayList();
        setField(keyedObjects2D, "org.jfree.data.KeyedObjects2D", "rowKeys", rowKeys);
        ArrayList rows = new ArrayList();
        setField(keyedObjects2D, "org.jfree.data.KeyedObjects2D", "rows", rows);
        Object windowsPathWithAttributes = createInstance("sun.nio.fs.WindowsPath$WindowsPathWithAttributes");
        Class qtypeClazz = Class.forName("java.util.regex.Pattern$Qtype");
        Object qtype = getEnumConstantByName(qtypeClazz, "GREEDY");
        
        /* This test fails because method [org.jfree.data.KeyedObjects2D.removeObject] produces [java.lang.NullPointerException]
            org.jfree.data.KeyedObjects2D.setObject(KeyedObjects2D.java:279)
            org.jfree.data.KeyedObjects2D.removeObject(KeyedObjects2D.java:297) */
        Class keyedObjects2DClazz = Class.forName("org.jfree.data.KeyedObjects2D");
        Class windowsPathWithAttributesType = Class.forName("java.lang.Comparable");
        Method removeObjectMethod = keyedObjects2DClazz.getDeclaredMethod("removeObject", windowsPathWithAttributesType, windowsPathWithAttributesType);
        removeObjectMethod.setAccessible(true);
        java.lang.Object[] removeObjectMethodArguments = new java.lang.Object[2];
        removeObjectMethodArguments[0] = windowsPathWithAttributes;
        removeObjectMethodArguments[1] = qtype;
        try {
            removeObjectMethod.invoke(keyedObjects2D, removeObjectMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testRemoveObject3() throws Throwable  {
        KeyedObjects2D keyedObjects2D = ((KeyedObjects2D) createInstance("org.jfree.data.KeyedObjects2D"));
        ArrayList rowKeys = new ArrayList();
        Object object = createInstance("java.lang.Object");
        rowKeys.add(object);
        rowKeys.add(object);
        setField(keyedObjects2D, "org.jfree.data.KeyedObjects2D", "rowKeys", rowKeys);
        Integer integer = 0;
        Class typeClazz = Class.forName("javax.swing.MultiUIDefaults$MultiUIDefaultsEnumerator$Type");
        Object type = getEnumConstantByName(typeClazz, "KEYS");
        
        /* This test fails because method [org.jfree.data.KeyedObjects2D.removeObject] produces [java.lang.NullPointerException]
            org.jfree.data.KeyedObjects2D.setObject(KeyedObjects2D.java:276)
            org.jfree.data.KeyedObjects2D.removeObject(KeyedObjects2D.java:297) */
        Class keyedObjects2DClazz = Class.forName("org.jfree.data.KeyedObjects2D");
        Class integerType = Class.forName("java.lang.Comparable");
        Method removeObjectMethod = keyedObjects2DClazz.getDeclaredMethod("removeObject", integerType, integerType);
        removeObjectMethod.setAccessible(true);
        java.lang.Object[] removeObjectMethodArguments = new java.lang.Object[2];
        removeObjectMethodArguments[0] = integer;
        removeObjectMethodArguments[1] = type;
        try {
            removeObjectMethod.invoke(keyedObjects2D, removeObjectMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region Errors report for removeObject
    
    public void testRemoveObject_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.data.KeyedObjects2D.setObject
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method setObject(java.lang.Object, java.lang.Comparable, java.lang.Comparable)
    
    /**
    @utbot.classUnderTest {@link KeyedObjects2D}
 * @utbot.methodUnderTest {@link org.jfree.data.KeyedObjects2D#setObject(java.lang.Object,java.lang.Comparable,java.lang.Comparable)}
 * @utbot.executesCondition {@code (rowKey == null): True}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: rowKey == null
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testSetObject_ThrowIllegalArgumentException() {
        KeyedObjects2D keyedObjects2D = new KeyedObjects2D();
        
        keyedObjects2D.setObject(null, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link KeyedObjects2D}
 * @utbot.methodUnderTest {@link org.jfree.data.KeyedObjects2D#setObject(java.lang.Object,java.lang.Comparable,java.lang.Comparable)}
 * @utbot.executesCondition {@code (rowKey == null): False}
 * @utbot.executesCondition {@code (columnKey == null): True}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: columnKey == null
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testSetObject_ThrowIllegalArgumentException_1() {
        KeyedObjects2D keyedObjects2D = new KeyedObjects2D();
        Character character = '\u0000';
        
        keyedObjects2D.setObject(null, character, null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method setObject(java.lang.Object, java.lang.Comparable, java.lang.Comparable)
    
    /**
    @utbot.classUnderTest {@link KeyedObjects2D}
 * @utbot.methodUnderTest {@link org.jfree.data.KeyedObjects2D#setObject(java.lang.Object,java.lang.Comparable,java.lang.Comparable)}
 * @utbot.executesCondition {@code (rowIndex >= 0): True}
 * @utbot.invokes {@link java.util.List#get(int)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: row = (KeyedObjects) this.rows.get(rowIndex);
 *  */
    @Test
    public void testSetObject_ThrowClassCastException() throws Exception  {
        KeyedObjects2D keyedObjects2D = ((KeyedObjects2D) createInstance("org.jfree.data.KeyedObjects2D"));
        ArrayList rowKeys = new ArrayList();
        Integer integer = 0;
        rowKeys.add(integer);
        setField(keyedObjects2D, "org.jfree.data.KeyedObjects2D", "rowKeys", rowKeys);
        setField(keyedObjects2D, "org.jfree.data.KeyedObjects2D", "rows", rowKeys);
        Character character = '\u0000';
        
        /* This test fails because method [org.jfree.data.KeyedObjects2D.setObject] produces [java.lang.ClassCastException: class java.lang.Integer cannot be cast to class org.jfree.data.KeyedObjects (java.lang.Integer is in module java.base of loader 'bootstrap'; org.jfree.data.KeyedObjects is in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @89641db)]
            org.jfree.data.KeyedObjects2D.setObject(KeyedObjects2D.java:271) */
        keyedObjects2D.setObject(null, integer, character);
    }
    
    /**
    @utbot.classUnderTest {@link KeyedObjects2D}
 * @utbot.methodUnderTest {@link org.jfree.data.KeyedObjects2D#setObject(java.lang.Object,java.lang.Comparable,java.lang.Comparable)}
 * @utbot.invokes {@link java.util.List#indexOf(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: int rowIndex = this.rowKeys.indexOf(rowKey);
 *  */
    @Test
    public void testSetObject_ThrowNullPointerException() throws Exception  {
        KeyedObjects2D keyedObjects2D = ((KeyedObjects2D) createInstance("org.jfree.data.KeyedObjects2D"));
        Integer integer = 0;
        
        /* This test fails because method [org.jfree.data.KeyedObjects2D.setObject] produces [java.lang.NullPointerException]
            org.jfree.data.KeyedObjects2D.setObject(KeyedObjects2D.java:269) */
        keyedObjects2D.setObject(null, integer, integer);
    }
    
    /**
    @utbot.classUnderTest {@link KeyedObjects2D}
 * @utbot.methodUnderTest {@link org.jfree.data.KeyedObjects2D#setObject(java.lang.Object,java.lang.Comparable,java.lang.Comparable)}
 * @utbot.executesCondition {@code (rowIndex >= 0): False}
 * @utbot.invokes {@link java.util.List#add(java.lang.Object)}
 * @utbot.invokes {@link java.util.List#add(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: this.rows.add(row);
 *  */
    @Test
    public void testSetObject_ThrowNullPointerException_2() throws Exception  {
        KeyedObjects2D keyedObjects2D = ((KeyedObjects2D) createInstance("org.jfree.data.KeyedObjects2D"));
        ArrayList rowKeys = new ArrayList();
        setField(keyedObjects2D, "org.jfree.data.KeyedObjects2D", "rowKeys", rowKeys);
        Integer integer = 0;
        
        /* This test fails because method [org.jfree.data.KeyedObjects2D.setObject] produces [java.lang.NullPointerException]
            org.jfree.data.KeyedObjects2D.setObject(KeyedObjects2D.java:276) */
        keyedObjects2D.setObject(null, integer, integer);
    }
    
    /**
    @utbot.classUnderTest {@link KeyedObjects2D}
 * @utbot.methodUnderTest {@link org.jfree.data.KeyedObjects2D#setObject(java.lang.Object,java.lang.Comparable,java.lang.Comparable)}
 * @utbot.executesCondition {@code (rowIndex >= 0): True}
 * @utbot.invokes {@link java.util.List#get(int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: row = (KeyedObjects) this.rows.get(rowIndex);
 *  */
    @Test
    public void testSetObject_ThrowNullPointerException_1() throws Exception  {
        KeyedObjects2D keyedObjects2D = ((KeyedObjects2D) createInstance("org.jfree.data.KeyedObjects2D"));
        ArrayList rowKeys = new ArrayList();
        Integer integer = 0;
        rowKeys.add(integer);
        rowKeys.add(null);
        rowKeys.add(null);
        setField(keyedObjects2D, "org.jfree.data.KeyedObjects2D", "rowKeys", rowKeys);
        Character character = '\u0000';
        
        /* This test fails because method [org.jfree.data.KeyedObjects2D.setObject] produces [java.lang.NullPointerException]
            org.jfree.data.KeyedObjects2D.setObject(KeyedObjects2D.java:271) */
        keyedObjects2D.setObject(null, integer, character);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.data.KeyedObjects2D.equals
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method equals(java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link KeyedObjects2D}
 * @utbot.methodUnderTest {@link org.jfree.data.KeyedObjects2D#equals(java.lang.Object)}
 * @utbot.executesCondition {@code (obj): False}
 * @utbot.executesCondition {@code (!(obj instanceof KeyedObjects2D)): True}
 *  */
    @Test
    public void testEquals_NotObjInstanceOfKeyedObjects2D() {
        KeyedObjects2D keyedObjects2D = new KeyedObjects2D();
        
        boolean actual = keyedObjects2D.equals(null);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link KeyedObjects2D}
 * @utbot.methodUnderTest {@link org.jfree.data.KeyedObjects2D#equals(java.lang.Object)}
 * @utbot.executesCondition {@code (obj): True}
 *  */
    @Test
    public void testEquals_Obj() {
        KeyedObjects2D keyedObjects2D = new KeyedObjects2D();
        
        boolean actual = keyedObjects2D.equals(keyedObjects2D);
        
        assertTrue(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.data.KeyedObjects2D.hashCode
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method hashCode()
    
    /**
    @utbot.classUnderTest {@link KeyedObjects2D}
 * @utbot.methodUnderTest {@link org.jfree.data.KeyedObjects2D#hashCode()}
 * @utbot.invokes {@link java.util.List#hashCode()}
 * @utbot.invokes {@link java.util.List#hashCode()}
 * @utbot.invokes {@link java.util.List#hashCode()}
 * @utbot.returnsFrom {@code return result;}
 *  */
    @Test
    public void testHashCode_ListHashCode() throws Exception  {
        KeyedObjects2D keyedObjects2D = ((KeyedObjects2D) createInstance("org.jfree.data.KeyedObjects2D"));
        ArrayList rowKeys = new ArrayList();
        setField(keyedObjects2D, "org.jfree.data.KeyedObjects2D", "rowKeys", rowKeys);
        ArrayList columnKeys = new ArrayList();
        setField(keyedObjects2D, "org.jfree.data.KeyedObjects2D", "columnKeys", columnKeys);
        setField(keyedObjects2D, "org.jfree.data.KeyedObjects2D", "rows", rowKeys);
        
        int actual = keyedObjects2D.hashCode();
        
        assertEquals(871, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method hashCode()
    
    /**
    @utbot.classUnderTest {@link KeyedObjects2D}
 * @utbot.methodUnderTest {@link org.jfree.data.KeyedObjects2D#hashCode()}
 * @utbot.invokes {@link java.util.List#hashCode()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: result = this.rowKeys.hashCode();
 *  */
    @Test
    public void testHashCode_ThrowNullPointerException() throws Exception  {
        KeyedObjects2D keyedObjects2D = ((KeyedObjects2D) createInstance("org.jfree.data.KeyedObjects2D"));
        
        /* This test fails because method [org.jfree.data.KeyedObjects2D.hashCode] produces [java.lang.NullPointerException]
            org.jfree.data.KeyedObjects2D.hashCode(KeyedObjects2D.java:439) */
        keyedObjects2D.hashCode();
    }
    
    /**
    @utbot.classUnderTest {@link KeyedObjects2D}
 * @utbot.methodUnderTest {@link org.jfree.data.KeyedObjects2D#hashCode()}
 * @utbot.invokes {@link java.util.List#hashCode()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: result = 29 * result + this.columnKeys.hashCode();
 *  */
    @Test
    public void testHashCode_ThrowNullPointerException_1() throws Exception  {
        KeyedObjects2D keyedObjects2D = ((KeyedObjects2D) createInstance("org.jfree.data.KeyedObjects2D"));
        ArrayList rowKeys = new ArrayList();
        setField(keyedObjects2D, "org.jfree.data.KeyedObjects2D", "rowKeys", rowKeys);
        
        /* This test fails because method [org.jfree.data.KeyedObjects2D.hashCode] produces [java.lang.NullPointerException]
            org.jfree.data.KeyedObjects2D.hashCode(KeyedObjects2D.java:440) */
        keyedObjects2D.hashCode();
    }
    
    /**
    @utbot.classUnderTest {@link KeyedObjects2D}
 * @utbot.methodUnderTest {@link org.jfree.data.KeyedObjects2D#hashCode()}
 * @utbot.invokes {@link java.util.List#hashCode()}
 * @utbot.invokes {@link java.util.List#hashCode()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: result = 29 * result + this.rows.hashCode();
 *  */
    @Test
    public void testHashCode_ThrowNullPointerException_2() throws Exception  {
        KeyedObjects2D keyedObjects2D = ((KeyedObjects2D) createInstance("org.jfree.data.KeyedObjects2D"));
        ArrayList rowKeys = new ArrayList();
        setField(keyedObjects2D, "org.jfree.data.KeyedObjects2D", "rowKeys", rowKeys);
        setField(keyedObjects2D, "org.jfree.data.KeyedObjects2D", "columnKeys", rowKeys);
        
        /* This test fails because method [org.jfree.data.KeyedObjects2D.hashCode] produces [java.lang.NullPointerException]
            org.jfree.data.KeyedObjects2D.hashCode(KeyedObjects2D.java:441) */
        keyedObjects2D.hashCode();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.data.KeyedObjects2D.clone
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method clone()
    
    /**
    @utbot.classUnderTest {@link KeyedObjects2D}
 * @utbot.methodUnderTest {@link org.jfree.data.KeyedObjects2D#clone()}
 * @utbot.invokes {@link java.lang.Object#clone()}
 *  */
    @Test
    public void testClone_ObjectClone() throws Exception  {
        KeyedObjects2D keyedObjects2D = new KeyedObjects2D();
        
        KeyedObjects2D actual = ((KeyedObjects2D) keyedObjects2D.clone());
        
        KeyedObjects2D expected = ((KeyedObjects2D) createInstance("org.jfree.data.KeyedObjects2D"));
        ArrayList rowKeys = new ArrayList();
        setField(expected, "org.jfree.data.KeyedObjects2D", "rowKeys", rowKeys);
        ArrayList columnKeys = new ArrayList();
        setField(expected, "org.jfree.data.KeyedObjects2D", "columnKeys", columnKeys);
        ArrayList rows = new ArrayList();
        setField(expected, "org.jfree.data.KeyedObjects2D", "rows", rows);
        
        // org.jfree.data.KeyedObjects2D has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.data.KeyedObjects2D.getObject
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method getObject(java.lang.Comparable, java.lang.Comparable)
    
    /**
    @utbot.classUnderTest {@link KeyedObjects2D}
 * @utbot.methodUnderTest {@link org.jfree.data.KeyedObjects2D#getObject(java.lang.Comparable,java.lang.Comparable)}
 * @utbot.executesCondition {@code (rowKey == null): True}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: rowKey == null
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testGetObject_ThrowIllegalArgumentException() {
        KeyedObjects2D keyedObjects2D = new KeyedObjects2D();
        
        keyedObjects2D.getObject(((Comparable) null), ((Comparable) null));
    }
    
    /**
    @utbot.classUnderTest {@link KeyedObjects2D}
 * @utbot.methodUnderTest {@link org.jfree.data.KeyedObjects2D#getObject(java.lang.Comparable,java.lang.Comparable)}
 * @utbot.executesCondition {@code (rowKey == null): False}
 * @utbot.executesCondition {@code (columnKey == null): True}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: columnKey == null
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testGetObject_ThrowIllegalArgumentException_1() {
        KeyedObjects2D keyedObjects2D = new KeyedObjects2D();
        Long long1 = 0L;
        
        keyedObjects2D.getObject(long1, ((Comparable) null));
    }
    
    /**
    @utbot.classUnderTest {@link KeyedObjects2D}
 * @utbot.methodUnderTest {@link org.jfree.data.KeyedObjects2D#getObject(java.lang.Comparable,java.lang.Comparable)}
 * @utbot.executesCondition {@code (rowKey == null): False}
 * @utbot.executesCondition {@code (columnKey == null): False}
 * @utbot.executesCondition {@code (row < 0): True}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.Object)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#toString()}
 * @utbot.throwsException {@link org.jfree.data.UnknownKeyException} when: row < 0
 *  */
    @Test(expected = UnknownKeyException.class)
    public void testGetObject_ThrowUnknownKeyException() throws Exception  {
        KeyedObjects2D keyedObjects2D = ((KeyedObjects2D) createInstance("org.jfree.data.KeyedObjects2D"));
        ArrayList rowKeys = new ArrayList();
        setField(keyedObjects2D, "org.jfree.data.KeyedObjects2D", "rowKeys", rowKeys);
        Integer integer = 0;
        Integer integer1 = 0;
        
        keyedObjects2D.getObject(((Comparable) integer), ((Comparable) integer1));
    }
    
    /**
    @utbot.classUnderTest {@link KeyedObjects2D}
 * @utbot.methodUnderTest {@link org.jfree.data.KeyedObjects2D#getObject(java.lang.Comparable,java.lang.Comparable)}
 * @utbot.executesCondition {@code (rowKey == null): False}
 * @utbot.executesCondition {@code (columnKey == null): False}
 * @utbot.executesCondition {@code (row < 0): False}
 * @utbot.executesCondition {@code (column < 0): True}
 * @utbot.invokes {@link java.util.List#indexOf(java.lang.Object)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.Object)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#toString()}
 * @utbot.throwsException {@link org.jfree.data.UnknownKeyException} when: column < 0
 *  */
    @Test(expected = UnknownKeyException.class)
    public void testGetObject_ThrowUnknownKeyException_1() throws Exception  {
        KeyedObjects2D keyedObjects2D = ((KeyedObjects2D) createInstance("org.jfree.data.KeyedObjects2D"));
        ArrayList rowKeys = new ArrayList();
        Integer integer = 0;
        rowKeys.add(integer);
        setField(keyedObjects2D, "org.jfree.data.KeyedObjects2D", "rowKeys", rowKeys);
        setField(keyedObjects2D, "org.jfree.data.KeyedObjects2D", "columnKeys", rowKeys);
        Character character = '\u0000';
        
        keyedObjects2D.getObject(((Comparable) integer), character);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getObject(java.lang.Comparable, java.lang.Comparable)
    
    /**
    @utbot.classUnderTest {@link KeyedObjects2D}
 * @utbot.methodUnderTest {@link org.jfree.data.KeyedObjects2D#getObject(java.lang.Comparable,java.lang.Comparable)}
 * @utbot.executesCondition {@code (rowKey == null): False}
 * @utbot.executesCondition {@code (columnKey == null): False}
 * @utbot.invokes {@link java.util.List#indexOf(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: int row = this.rowKeys.indexOf(rowKey);
 *  */
    @Test
    public void testGetObject_ThrowNullPointerException() throws Exception  {
        KeyedObjects2D keyedObjects2D = ((KeyedObjects2D) createInstance("org.jfree.data.KeyedObjects2D"));
        Integer integer = 0;
        
        /* This test fails because method [org.jfree.data.KeyedObjects2D.getObject] produces [java.lang.NullPointerException]
            org.jfree.data.KeyedObjects2D.getObject(KeyedObjects2D.java:221) */
        keyedObjects2D.getObject(((Comparable) integer), ((Comparable) integer));
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method getObject(java.lang.Comparable, java.lang.Comparable)
    
    @Test(expected = UnknownKeyException.class)
    public void testGetObject1() throws Throwable  {
        KeyedObjects2D keyedObjects2D = ((KeyedObjects2D) createInstance("org.jfree.data.KeyedObjects2D"));
        ArrayList rowKeys = new ArrayList();
        Character character = '\u0000';
        rowKeys.add(character);
        Character character1 = '\u0000';
        rowKeys.add(character1);
        rowKeys.add(character1);
        setField(keyedObjects2D, "org.jfree.data.KeyedObjects2D", "rowKeys", rowKeys);
        setField(keyedObjects2D, "org.jfree.data.KeyedObjects2D", "columnKeys", rowKeys);
        Minute minute = ((Minute) createInstance("org.jfree.data.time.Minute"));
        
        Class keyedObjects2DClazz = Class.forName("org.jfree.data.KeyedObjects2D");
        Class character1Type = Class.forName("java.lang.Comparable");
        Method getObjectMethod = keyedObjects2DClazz.getDeclaredMethod("getObject", character1Type, character1Type);
        getObjectMethod.setAccessible(true);
        java.lang.Object[] getObjectMethodArguments = new java.lang.Object[2];
        getObjectMethodArguments[0] = character1;
        getObjectMethodArguments[1] = minute;
        try {
            getObjectMethod.invoke(keyedObjects2D, getObjectMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method getObject(java.lang.Comparable, java.lang.Comparable)
    
    @Test
    public void testGetObject2() throws Throwable  {
        KeyedObjects2D keyedObjects2D = ((KeyedObjects2D) createInstance("org.jfree.data.KeyedObjects2D"));
        ArrayList rowKeys = new ArrayList();
        Character character = '\u0000';
        rowKeys.add(character);
        Character character1 = '\uFFFF';
        rowKeys.add(character1);
        rowKeys.add(character1);
        setField(keyedObjects2D, "org.jfree.data.KeyedObjects2D", "rowKeys", rowKeys);
        Object directCharBufferS = createInstance("java.nio.DirectCharBufferS");
        
        /* This test fails because method [org.jfree.data.KeyedObjects2D.getObject] produces [java.lang.NullPointerException]
            org.jfree.data.KeyedObjects2D.getObject(KeyedObjects2D.java:226) */
        Class keyedObjects2DClazz = Class.forName("org.jfree.data.KeyedObjects2D");
        Class character1Type = Class.forName("java.lang.Comparable");
        Method getObjectMethod = keyedObjects2DClazz.getDeclaredMethod("getObject", character1Type, character1Type);
        getObjectMethod.setAccessible(true);
        java.lang.Object[] getObjectMethodArguments = new java.lang.Object[2];
        getObjectMethodArguments[0] = character1;
        getObjectMethodArguments[1] = directCharBufferS;
        try {
            getObjectMethod.invoke(keyedObjects2D, getObjectMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testGetObject3() throws Exception  {
        KeyedObjects2D keyedObjects2D = ((KeyedObjects2D) createInstance("org.jfree.data.KeyedObjects2D"));
        ArrayList rowKeys = new ArrayList();
        Integer integer = 0;
        rowKeys.add(integer);
        rowKeys.add(null);
        rowKeys.add(null);
        setField(keyedObjects2D, "org.jfree.data.KeyedObjects2D", "rowKeys", rowKeys);
        setField(keyedObjects2D, "org.jfree.data.KeyedObjects2D", "columnKeys", rowKeys);
        
        /* This test fails because method [org.jfree.data.KeyedObjects2D.getObject] produces [java.lang.NullPointerException]
            org.jfree.data.KeyedObjects2D.getObject(KeyedObjects2D.java:232) */
        keyedObjects2D.getObject(((Comparable) integer), ((Comparable) integer));
    }
    ///endregion
    
    ///region Errors report for getObject
    
    public void testGetObject_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 3 occurrences of:
        // Concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.data.KeyedObjects2D.getObject
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getObject(int, int)
    
    /**
    @utbot.classUnderTest {@link KeyedObjects2D}
 * @utbot.methodUnderTest {@link org.jfree.data.KeyedObjects2D#getObject(int,int)}
 * @utbot.executesCondition {@code (rowData != null): False}
 * @utbot.returnsFrom {@code return result;}
 *  */
    @Test
    public void testGetObject_RowDataEqualsNull() throws Exception  {
        KeyedObjects2D keyedObjects2D = ((KeyedObjects2D) createInstance("org.jfree.data.KeyedObjects2D"));
        ArrayList rows = new ArrayList();
        rows.add(null);
        setField(keyedObjects2D, "org.jfree.data.KeyedObjects2D", "rows", rows);
        
        Object actual = keyedObjects2D.getObject(0, -255);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link KeyedObjects2D}
 * @utbot.methodUnderTest {@link org.jfree.data.KeyedObjects2D#getObject(int,int)}
 * @utbot.executesCondition {@code (rowData != null): True}
 * @utbot.executesCondition {@code (columnKey != null): False}
 * @utbot.returnsFrom {@code return result;}
 *  */
    @Test
    public void testGetObject_ColumnKeyEqualsNull() throws Exception  {
        KeyedObjects2D keyedObjects2D = ((KeyedObjects2D) createInstance("org.jfree.data.KeyedObjects2D"));
        ArrayList columnKeys = new ArrayList();
        KeyedObjects keyedObjects = ((KeyedObjects) createInstance("org.jfree.data.KeyedObjects"));
        columnKeys.add(keyedObjects);
        columnKeys.add(null);
        columnKeys.add(null);
        setField(keyedObjects2D, "org.jfree.data.KeyedObjects2D", "columnKeys", columnKeys);
        setField(keyedObjects2D, "org.jfree.data.KeyedObjects2D", "rows", columnKeys);
        
        Object actual = keyedObjects2D.getObject(0, 1);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link KeyedObjects2D}
 * @utbot.methodUnderTest {@link org.jfree.data.KeyedObjects2D#getObject(int,int)}
 * @utbot.executesCondition {@code (rowData != null): True}
 * @utbot.executesCondition {@code (columnKey != null): True}
 * @utbot.executesCondition {@code (index >= 0): False}
 * @utbot.invokes {@link org.jfree.data.KeyedObjects#getIndex(java.lang.Comparable)}
 * @utbot.returnsFrom {@code return result;}
 *  */
    @Test
    public void testGetObject_IndexLessThanZero() throws Exception  {
        KeyedObjects2D keyedObjects2D = ((KeyedObjects2D) createInstance("org.jfree.data.KeyedObjects2D"));
        ArrayList columnKeys = new ArrayList();
        KeyedObjects keyedObjects = ((KeyedObjects) createInstance("org.jfree.data.KeyedObjects"));
        ArrayList data = new ArrayList();
        setField(keyedObjects, "org.jfree.data.KeyedObjects", "data", data);
        columnKeys.add(keyedObjects);
        columnKeys.add(data);
        columnKeys.add(null);
        columnKeys.add(null);
        Character character = '\u0000';
        columnKeys.add(character);
        columnKeys.add(data);
        columnKeys.add(data);
        columnKeys.add(data);
        columnKeys.add(data);
        setField(keyedObjects2D, "org.jfree.data.KeyedObjects2D", "columnKeys", columnKeys);
        setField(keyedObjects2D, "org.jfree.data.KeyedObjects2D", "rows", columnKeys);
        
        Object actual = keyedObjects2D.getObject(0, 4);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getObject(int, int)
    
    /**
    @utbot.classUnderTest {@link KeyedObjects2D}
 * @utbot.methodUnderTest {@link org.jfree.data.KeyedObjects2D#getObject(int,int)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: KeyedObjects rowData = (KeyedObjects) this.rows.get(row);
 *  */
    @Test
    public void testGetObject_ThrowClassCastException() throws Exception  {
        KeyedObjects2D keyedObjects2D = ((KeyedObjects2D) createInstance("org.jfree.data.KeyedObjects2D"));
        ArrayList rows = new ArrayList();
        Object object = createInstance("java.lang.Object");
        rows.add(object);
        setField(keyedObjects2D, "org.jfree.data.KeyedObjects2D", "rows", rows);
        
        /* This test fails because method [org.jfree.data.KeyedObjects2D.getObject] produces [java.lang.ClassCastException: class java.lang.Object cannot be cast to class org.jfree.data.KeyedObjects (java.lang.Object is in module java.base of loader 'bootstrap'; org.jfree.data.KeyedObjects is in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @89641db)]
            org.jfree.data.KeyedObjects2D.getObject(KeyedObjects2D.java:114) */
        keyedObjects2D.getObject(0, -254);
    }
    
    /**
    @utbot.classUnderTest {@link KeyedObjects2D}
 * @utbot.methodUnderTest {@link org.jfree.data.KeyedObjects2D#getObject(int,int)}
 * @utbot.executesCondition {@code (rowData != null): True}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: Comparable columnKey = (Comparable) this.columnKeys.get(column);
 *  */
    @Test
    public void testGetObject_ThrowIndexOutOfBoundsException() throws Exception  {
        KeyedObjects2D keyedObjects2D = ((KeyedObjects2D) createInstance("org.jfree.data.KeyedObjects2D"));
        ArrayList columnKeys = new ArrayList();
        KeyedObjects keyedObjects = ((KeyedObjects) createInstance("org.jfree.data.KeyedObjects"));
        columnKeys.add(keyedObjects);
        setField(keyedObjects2D, "org.jfree.data.KeyedObjects2D", "columnKeys", columnKeys);
        setField(keyedObjects2D, "org.jfree.data.KeyedObjects2D", "rows", columnKeys);
        
        /* This test fails because method [org.jfree.data.KeyedObjects2D.getObject] produces [java.lang.IndexOutOfBoundsException: Index -1 out of bounds for length 1]
            java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
            java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
            java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:266)
            java.base/java.util.Objects.checkIndex(Objects.java:359)
            java.base/java.util.ArrayList.get(ArrayList.java:427)
            org.jfree.data.KeyedObjects2D.getObject(KeyedObjects2D.java:116) */
        keyedObjects2D.getObject(0, -1);
    }
    
    /**
    @utbot.classUnderTest {@link KeyedObjects2D}
 * @utbot.methodUnderTest {@link org.jfree.data.KeyedObjects2D#getObject(int,int)}
 * @utbot.executesCondition {@code (rowData != null): True}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: Comparable columnKey = (Comparable) this.columnKeys.get(column);
 *  */
    @Test
    public void testGetObject_ThrowClassCastException_1() throws Exception  {
        KeyedObjects2D keyedObjects2D = ((KeyedObjects2D) createInstance("org.jfree.data.KeyedObjects2D"));
        ArrayList columnKeys = new ArrayList();
        KeyedObjects keyedObjects = ((KeyedObjects) createInstance("org.jfree.data.KeyedObjects"));
        columnKeys.add(keyedObjects);
        columnKeys.add(null);
        columnKeys.add(null);
        columnKeys.add(null);
        columnKeys.add(null);
        setField(keyedObjects2D, "org.jfree.data.KeyedObjects2D", "columnKeys", columnKeys);
        setField(keyedObjects2D, "org.jfree.data.KeyedObjects2D", "rows", columnKeys);
        
        /* This test fails because method [org.jfree.data.KeyedObjects2D.getObject] produces [java.lang.ClassCastException: class org.jfree.data.KeyedObjects cannot be cast to class java.lang.Comparable (org.jfree.data.KeyedObjects is in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @89641db; java.lang.Comparable is in module java.base of loader 'bootstrap')]
            org.jfree.data.KeyedObjects2D.getObject(KeyedObjects2D.java:116) */
        keyedObjects2D.getObject(0, 0);
    }
    
    /**
    @utbot.classUnderTest {@link KeyedObjects2D}
 * @utbot.methodUnderTest {@link org.jfree.data.KeyedObjects2D#getObject(int,int)}
 * @utbot.invokes {@link java.util.List#get(int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: KeyedObjects rowData = (KeyedObjects) this.rows.get(row);
 *  */
    @Test
    public void testGetObject_ThrowNullPointerException1() throws Exception  {
        KeyedObjects2D keyedObjects2D = ((KeyedObjects2D) createInstance("org.jfree.data.KeyedObjects2D"));
        
        /* This test fails because method [org.jfree.data.KeyedObjects2D.getObject] produces [java.lang.NullPointerException]
            org.jfree.data.KeyedObjects2D.getObject(KeyedObjects2D.java:114) */
        keyedObjects2D.getObject(-255, -255);
    }
    
    /**
    @utbot.classUnderTest {@link KeyedObjects2D}
 * @utbot.methodUnderTest {@link org.jfree.data.KeyedObjects2D#getObject(int,int)}
 * @utbot.executesCondition {@code (rowData != null): True}
 * @utbot.invokes {@link java.util.List#get(int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Comparable columnKey = (Comparable) this.columnKeys.get(column);
 *  */
    @Test
    public void testGetObject_ThrowNullPointerException_1() throws Exception  {
        KeyedObjects2D keyedObjects2D = ((KeyedObjects2D) createInstance("org.jfree.data.KeyedObjects2D"));
        ArrayList rows = new ArrayList();
        KeyedObjects keyedObjects = ((KeyedObjects) createInstance("org.jfree.data.KeyedObjects"));
        rows.add(keyedObjects);
        setField(keyedObjects2D, "org.jfree.data.KeyedObjects2D", "rows", rows);
        
        /* This test fails because method [org.jfree.data.KeyedObjects2D.getObject] produces [java.lang.NullPointerException]
            org.jfree.data.KeyedObjects2D.getObject(KeyedObjects2D.java:116) */
        keyedObjects2D.getObject(0, -255);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method getObject(int, int)
    
    @Test
    public void testGetObject4() throws Exception  {
        KeyedObjects2D keyedObjects2D = ((KeyedObjects2D) createInstance("org.jfree.data.KeyedObjects2D"));
        ArrayList columnKeys = new ArrayList();
        KeyedObject keyedObject = ((KeyedObject) createInstance("org.jfree.data.KeyedObject"));
        Integer key = 0;
        setField(keyedObject, "org.jfree.data.KeyedObject", "key", key);
        columnKeys.add(keyedObject);
        columnKeys.add(null);
        columnKeys.add(null);
        columnKeys.add(null);
        KeyedObjects keyedObjects = ((KeyedObjects) createInstance("org.jfree.data.KeyedObjects"));
        setField(keyedObjects, "org.jfree.data.KeyedObjects", "data", columnKeys);
        columnKeys.add(keyedObjects);
        columnKeys.add(null);
        columnKeys.add(null);
        columnKeys.add(null);
        Integer integer = 0;
        columnKeys.add(integer);
        setField(keyedObjects2D, "org.jfree.data.KeyedObjects2D", "columnKeys", columnKeys);
        setField(keyedObjects2D, "org.jfree.data.KeyedObjects2D", "rows", columnKeys);
        
        Object actual = keyedObjects2D.getObject(4, 8);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method getObject(int, int)
    
    @Test
    public void testGetObject5() throws Exception  {
        KeyedObjects2D keyedObjects2D = ((KeyedObjects2D) createInstance("org.jfree.data.KeyedObjects2D"));
        ArrayList rows = new ArrayList();
        rows.add(null);
        rows.add(null);
        rows.add(null);
        setField(keyedObjects2D, "org.jfree.data.KeyedObjects2D", "rows", rows);
        
        /* This test fails because method [org.jfree.data.KeyedObjects2D.getObject] produces [java.lang.IndexOutOfBoundsException: Index 1073741824 out of bounds for length 3]
            java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
            java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
            java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:266)
            java.base/java.util.Objects.checkIndex(Objects.java:359)
            java.base/java.util.ArrayList.get(ArrayList.java:427)
            org.jfree.data.KeyedObjects2D.getObject(KeyedObjects2D.java:114) */
        keyedObjects2D.getObject(1073741824, 0);
    }
    
    @Test
    public void testGetObject6() throws Exception  {
        KeyedObjects2D keyedObjects2D = ((KeyedObjects2D) createInstance("org.jfree.data.KeyedObjects2D"));
        ArrayList columnKeys = new ArrayList();
        LocalDate localDate = ((LocalDate) createInstance("java.time.LocalDate"));
        columnKeys.add(localDate);
        columnKeys.add(null);
        columnKeys.add(null);
        setField(keyedObjects2D, "org.jfree.data.KeyedObjects2D", "columnKeys", columnKeys);
        ArrayList rows = new ArrayList();
        rows.add(localDate);
        rows.add(null);
        KeyedObjects keyedObjects = ((KeyedObjects) createInstance("org.jfree.data.KeyedObjects"));
        setField(keyedObjects, "org.jfree.data.KeyedObjects", "data", columnKeys);
        rows.add(keyedObjects);
        setField(keyedObjects2D, "org.jfree.data.KeyedObjects2D", "rows", rows);
        
        /* This test fails because method [org.jfree.data.KeyedObjects2D.getObject] produces [java.lang.ClassCastException: class java.time.LocalDate cannot be cast to class org.jfree.data.KeyedObject (java.time.LocalDate is in module java.base of loader 'bootstrap'; org.jfree.data.KeyedObject is in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @89641db)]
            org.jfree.data.KeyedObjects.getIndex(KeyedObjects.java:134)
            org.jfree.data.KeyedObjects2D.getObject(KeyedObjects2D.java:118) */
        keyedObjects2D.getObject(2, 0);
    }
    
    @Test
    public void testGetObject7() throws Exception  {
        KeyedObjects2D keyedObjects2D = ((KeyedObjects2D) createInstance("org.jfree.data.KeyedObjects2D"));
        ArrayList columnKeys = new ArrayList();
        KeyedObject keyedObject = ((KeyedObject) createInstance("org.jfree.data.KeyedObject"));
        columnKeys.add(keyedObject);
        KeyedObjects keyedObjects = ((KeyedObjects) createInstance("org.jfree.data.KeyedObjects"));
        ArrayList data = new ArrayList();
        data.add(keyedObject);
        data.add(keyedObjects);
        data.add(keyedObjects);
        setField(keyedObjects, "org.jfree.data.KeyedObjects", "data", data);
        columnKeys.add(keyedObjects);
        Object x509IssuerSerial = createInstance("sun.security.x509.X509CRLImpl$X509IssuerSerial");
        columnKeys.add(x509IssuerSerial);
        setField(keyedObjects2D, "org.jfree.data.KeyedObjects2D", "columnKeys", columnKeys);
        setField(keyedObjects2D, "org.jfree.data.KeyedObjects2D", "rows", columnKeys);
        
        /* This test fails because method [org.jfree.data.KeyedObjects2D.getObject] produces [java.lang.NullPointerException]
            org.jfree.data.KeyedObjects.getIndex(KeyedObjects.java:135)
            org.jfree.data.KeyedObjects2D.getObject(KeyedObjects2D.java:118) */
        keyedObjects2D.getObject(1, 2);
    }
    
    @Test
    public void testGetObject8() throws Exception  {
        KeyedObjects2D keyedObjects2D = ((KeyedObjects2D) createInstance("org.jfree.data.KeyedObjects2D"));
        ArrayList columnKeys = new ArrayList();
        KeyedObject keyedObject = ((KeyedObject) createInstance("org.jfree.data.KeyedObject"));
        Integer key = 0;
        setField(keyedObject, "org.jfree.data.KeyedObject", "key", key);
        columnKeys.add(keyedObject);
        columnKeys.add(null);
        CatalogFeatures.Feature feature = CatalogFeatures.Feature.FILES;
        columnKeys.add(feature);
        columnKeys.add(null);
        KeyedObjects keyedObjects = ((KeyedObjects) createInstance("org.jfree.data.KeyedObjects"));
        setField(keyedObjects, "org.jfree.data.KeyedObjects", "data", columnKeys);
        columnKeys.add(keyedObjects);
        columnKeys.add(null);
        columnKeys.add(null);
        setField(keyedObjects2D, "org.jfree.data.KeyedObjects2D", "columnKeys", columnKeys);
        setField(keyedObjects2D, "org.jfree.data.KeyedObjects2D", "rows", columnKeys);
        
        /* This test fails because method [org.jfree.data.KeyedObjects2D.getObject] produces [java.lang.NullPointerException]
            org.jfree.data.KeyedObjects.getIndex(KeyedObjects.java:135)
            org.jfree.data.KeyedObjects2D.getObject(KeyedObjects2D.java:118) */
        keyedObjects2D.getObject(4, 2);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.data.KeyedObjects2D.getRowKeys
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getRowKeys()
    
    /**
    @utbot.classUnderTest {@link KeyedObjects2D}
 * @utbot.methodUnderTest {@link org.jfree.data.KeyedObjects2D#getRowKeys()}
 * @utbot.invokes {@link java.util.Collections#unmodifiableList(java.util.List)}
 * @utbot.returnsFrom {@code return Collections.unmodifiableList(this.rowKeys);}
 *  */
    @Test
    public void testGetRowKeys_CollectionsUnmodifiableList() throws Exception  {
        KeyedObjects2D keyedObjects2D = ((KeyedObjects2D) createInstance("org.jfree.data.KeyedObjects2D"));
        ArrayList rowKeys = new ArrayList();
        setField(keyedObjects2D, "org.jfree.data.KeyedObjects2D", "rowKeys", rowKeys);
        
        List actual = keyedObjects2D.getRowKeys();
        
        List expected = new ArrayList();
        
        assertTrue(deepEquals(expected, actual));
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.data.KeyedObjects2D.getColumnIndex
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getColumnIndex(java.lang.Comparable)
    
    /**
    @utbot.classUnderTest {@link KeyedObjects2D}
 * @utbot.methodUnderTest {@link org.jfree.data.KeyedObjects2D#getColumnIndex(java.lang.Comparable)}
 * @utbot.invokes {@link java.util.List#indexOf(java.lang.Object)}
 * @utbot.returnsFrom {@code return this.columnKeys.indexOf(key);}
 *  */
    @Test
    public void testGetColumnIndex_ListIndexOf() throws Exception  {
        KeyedObjects2D keyedObjects2D = ((KeyedObjects2D) createInstance("org.jfree.data.KeyedObjects2D"));
        ArrayList columnKeys = new ArrayList();
        setField(keyedObjects2D, "org.jfree.data.KeyedObjects2D", "columnKeys", columnKeys);
        Integer integer = 0;
        
        int actual = keyedObjects2D.getColumnIndex(integer);
        
        assertEquals(-1, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getColumnIndex(java.lang.Comparable)
    
    /**
    @utbot.classUnderTest {@link KeyedObjects2D}
 * @utbot.methodUnderTest {@link org.jfree.data.KeyedObjects2D#getColumnIndex(java.lang.Comparable)}
 * @utbot.invokes {@link java.util.List#indexOf(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return this.columnKeys.indexOf(key);
 *  */
    @Test
    public void testGetColumnIndex_ThrowNullPointerException() throws Exception  {
        KeyedObjects2D keyedObjects2D = ((KeyedObjects2D) createInstance("org.jfree.data.KeyedObjects2D"));
        
        /* This test fails because method [org.jfree.data.KeyedObjects2D.getColumnIndex] produces [java.lang.NullPointerException]
            org.jfree.data.KeyedObjects2D.getColumnIndex(KeyedObjects2D.java:187) */
        keyedObjects2D.getColumnIndex(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.data.KeyedObjects2D.getColumnKeys
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getColumnKeys()
    
    /**
    @utbot.classUnderTest {@link KeyedObjects2D}
 * @utbot.methodUnderTest {@link org.jfree.data.KeyedObjects2D#getColumnKeys()}
 * @utbot.invokes {@link java.util.Collections#unmodifiableList(java.util.List)}
 * @utbot.returnsFrom {@code return Collections.unmodifiableList(this.columnKeys);}
 *  */
    @Test
    public void testGetColumnKeys_CollectionsUnmodifiableList() throws Exception  {
        KeyedObjects2D keyedObjects2D = ((KeyedObjects2D) createInstance("org.jfree.data.KeyedObjects2D"));
        ArrayList columnKeys = new ArrayList();
        setField(keyedObjects2D, "org.jfree.data.KeyedObjects2D", "columnKeys", columnKeys);
        
        List actual = keyedObjects2D.getColumnKeys();
        
        List expected = new ArrayList();
        
        assertTrue(deepEquals(expected, actual));
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.data.KeyedObjects2D.getRowIndex
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getRowIndex(java.lang.Comparable)
    
    /**
    @utbot.classUnderTest {@link KeyedObjects2D}
 * @utbot.methodUnderTest {@link org.jfree.data.KeyedObjects2D#getRowIndex(java.lang.Comparable)}
 * @utbot.invokes {@link java.util.List#indexOf(java.lang.Object)}
 * @utbot.returnsFrom {@code return this.rowKeys.indexOf(key);}
 *  */
    @Test
    public void testGetRowIndex_ListIndexOf() throws Exception  {
        KeyedObjects2D keyedObjects2D = ((KeyedObjects2D) createInstance("org.jfree.data.KeyedObjects2D"));
        ArrayList rowKeys = new ArrayList();
        setField(keyedObjects2D, "org.jfree.data.KeyedObjects2D", "rowKeys", rowKeys);
        Integer integer = 0;
        
        int actual = keyedObjects2D.getRowIndex(integer);
        
        assertEquals(-1, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getRowIndex(java.lang.Comparable)
    
    /**
    @utbot.classUnderTest {@link KeyedObjects2D}
 * @utbot.methodUnderTest {@link org.jfree.data.KeyedObjects2D#getRowIndex(java.lang.Comparable)}
 * @utbot.invokes {@link java.util.List#indexOf(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return this.rowKeys.indexOf(key);
 *  */
    @Test
    public void testGetRowIndex_ThrowNullPointerException() throws Exception  {
        KeyedObjects2D keyedObjects2D = ((KeyedObjects2D) createInstance("org.jfree.data.KeyedObjects2D"));
        
        /* This test fails because method [org.jfree.data.KeyedObjects2D.getRowIndex] produces [java.lang.NullPointerException]
            org.jfree.data.KeyedObjects2D.getRowIndex(KeyedObjects2D.java:150) */
        keyedObjects2D.getRowIndex(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.data.KeyedObjects2D.addObject
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method addObject(java.lang.Object, java.lang.Comparable, java.lang.Comparable)
    
    /**
    @utbot.classUnderTest {@link KeyedObjects2D}
 * @utbot.methodUnderTest {@link org.jfree.data.KeyedObjects2D#addObject(java.lang.Object,java.lang.Comparable,java.lang.Comparable)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: setObject(object, rowKey, columnKey);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testAddObject_ThrowIllegalArgumentException() {
        KeyedObjects2D keyedObjects2D = new KeyedObjects2D();
        
        keyedObjects2D.addObject(null, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link KeyedObjects2D}
 * @utbot.methodUnderTest {@link org.jfree.data.KeyedObjects2D#addObject(java.lang.Object,java.lang.Comparable,java.lang.Comparable)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: setObject(object, rowKey, columnKey);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testAddObject_ThrowIllegalArgumentException_1() {
        KeyedObjects2D keyedObjects2D = new KeyedObjects2D();
        Integer integer = 0;
        
        keyedObjects2D.addObject(null, integer, null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method addObject(java.lang.Object, java.lang.Comparable, java.lang.Comparable)
    
    /**
    @utbot.classUnderTest {@link KeyedObjects2D}
 * @utbot.methodUnderTest {@link org.jfree.data.KeyedObjects2D#addObject(java.lang.Object,java.lang.Comparable,java.lang.Comparable)}
 * @utbot.invokes {@link org.jfree.data.KeyedObjects2D#setObject(java.lang.Object,java.lang.Comparable,java.lang.Comparable)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: setObject(object, rowKey, columnKey);
 *  */
    @Test
    public void testAddObject_ThrowClassCastException() throws Exception  {
        KeyedObjects2D keyedObjects2D = ((KeyedObjects2D) createInstance("org.jfree.data.KeyedObjects2D"));
        ArrayList rowKeys = new ArrayList();
        Integer integer = 0;
        rowKeys.add(integer);
        setField(keyedObjects2D, "org.jfree.data.KeyedObjects2D", "rowKeys", rowKeys);
        setField(keyedObjects2D, "org.jfree.data.KeyedObjects2D", "rows", rowKeys);
        Long long1 = 0L;
        
        /* This test fails because method [org.jfree.data.KeyedObjects2D.addObject] produces [java.lang.ClassCastException: class java.lang.Integer cannot be cast to class org.jfree.data.KeyedObjects (java.lang.Integer is in module java.base of loader 'bootstrap'; org.jfree.data.KeyedObjects is in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @89641db)]
            org.jfree.data.KeyedObjects2D.setObject(KeyedObjects2D.java:271)
            org.jfree.data.KeyedObjects2D.addObject(KeyedObjects2D.java:249) */
        keyedObjects2D.addObject(null, integer, long1);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method addObject(java.lang.Object, java.lang.Comparable, java.lang.Comparable)
    
    /**
     * @utbot.classUnderTest {@link org.jfree.data.KeyedObjects2D}
     * @utbot.methodUnderTest {@link org.jfree.data.KeyedObjects2D#addObject(java.lang.Object,java.lang.Comparable,java.lang.Comparable)}
     */
    @Test
    public void testAddObject() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        KeyedObjects2D keyedObjects2D = new KeyedObjects2D();
        Object object = new Object();
        SimpleTimePeriod simpleTimePeriod = new SimpleTimePeriod(1L, 1L);
        XYDataItem xYDataItem = new XYDataItem(java.lang.Double.NEGATIVE_INFINITY, -1.0);
        Class xYDataItemClazz = Class.forName("org.jfree.data.xy.XYDataItem");
        Class numberType = Class.forName("java.lang.Number");
        Method setYMethod = xYDataItemClazz.getDeclaredMethod("setY", numberType);
        setYMethod.setAccessible(true);
        java.lang.Object[] setYMethodArguments = new java.lang.Object[1];
        setYMethodArguments[0] = 1.0;
        setYMethod.invoke(xYDataItem, setYMethodArguments);
        
        keyedObjects2D.addObject(object, simpleTimePeriod, xYDataItem);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method addObject(java.lang.Object, java.lang.Comparable, java.lang.Comparable)
    
    @Test
    public void testAddObject1() throws Exception  {
        KeyedObjects2D keyedObjects2D = ((KeyedObjects2D) createInstance("org.jfree.data.KeyedObjects2D"));
        ArrayList rowKeys = new ArrayList();
        Integer integer = 0;
        rowKeys.add(integer);
        MinguoDate minguoDate = ((MinguoDate) createInstance("java.time.chrono.MinguoDate"));
        rowKeys.add(minguoDate);
        rowKeys.add(minguoDate);
        setField(keyedObjects2D, "org.jfree.data.KeyedObjects2D", "rowKeys", rowKeys);
        ArrayList rows = new ArrayList();
        setField(keyedObjects2D, "org.jfree.data.KeyedObjects2D", "rows", rows);
        Object object = new Object();
        Integer integer1 = 0;
        
        /* This test fails because method [org.jfree.data.KeyedObjects2D.addObject] produces [java.lang.IndexOutOfBoundsException: Index 0 out of bounds for length 0]
            java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
            java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
            java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:266)
            java.base/java.util.Objects.checkIndex(Objects.java:359)
            java.base/java.util.ArrayList.get(ArrayList.java:427)
            org.jfree.data.KeyedObjects2D.setObject(KeyedObjects2D.java:271)
            org.jfree.data.KeyedObjects2D.addObject(KeyedObjects2D.java:249) */
        keyedObjects2D.addObject(object, integer1, minguoDate);
    }
    
    @Test
    public void testAddObject2() throws Throwable  {
        KeyedObjects2D keyedObjects2D = ((KeyedObjects2D) createInstance("org.jfree.data.KeyedObjects2D"));
        ArrayList rowKeys = new ArrayList();
        setField(keyedObjects2D, "org.jfree.data.KeyedObjects2D", "rowKeys", rowKeys);
        ArrayList rows = new ArrayList();
        setField(keyedObjects2D, "org.jfree.data.KeyedObjects2D", "rows", rows);
        Object object = new Object();
        LocalDate localDate = ((LocalDate) createInstance("java.time.LocalDate"));
        Normalizer.Form form = Normalizer.Form.NFD;
        
        /* This test fails because method [org.jfree.data.KeyedObjects2D.addObject] produces [java.lang.NullPointerException]
            org.jfree.data.KeyedObjects2D.setObject(KeyedObjects2D.java:279)
            org.jfree.data.KeyedObjects2D.addObject(KeyedObjects2D.java:249) */
        Class keyedObjects2DClazz = Class.forName("org.jfree.data.KeyedObjects2D");
        Class objectType = Class.forName("java.lang.Object");
        Class localDateType = Class.forName("java.lang.Comparable");
        Method addObjectMethod = keyedObjects2DClazz.getDeclaredMethod("addObject", objectType, localDateType, localDateType);
        addObjectMethod.setAccessible(true);
        java.lang.Object[] addObjectMethodArguments = new java.lang.Object[3];
        addObjectMethodArguments[0] = object;
        addObjectMethodArguments[1] = localDate;
        addObjectMethodArguments[2] = form;
        try {
            addObjectMethod.invoke(keyedObjects2D, addObjectMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testAddObject3() throws Throwable  {
        KeyedObjects2D keyedObjects2D = ((KeyedObjects2D) createInstance("org.jfree.data.KeyedObjects2D"));
        ArrayList rowKeys = new ArrayList();
        Object object = createInstance("java.lang.Object");
        rowKeys.add(object);
        setField(keyedObjects2D, "org.jfree.data.KeyedObjects2D", "rowKeys", rowKeys);
        Object object1 = new Object();
        Character character = '\u0000';
        TMSchema.State state = TMSchema.State.ACTIVE;
        
        /* This test fails because method [org.jfree.data.KeyedObjects2D.addObject] produces [java.lang.NullPointerException]
            org.jfree.data.KeyedObjects2D.setObject(KeyedObjects2D.java:276)
            org.jfree.data.KeyedObjects2D.addObject(KeyedObjects2D.java:249) */
        Class keyedObjects2DClazz = Class.forName("org.jfree.data.KeyedObjects2D");
        Class object1Type = Class.forName("java.lang.Object");
        Class characterType = Class.forName("java.lang.Comparable");
        Method addObjectMethod = keyedObjects2DClazz.getDeclaredMethod("addObject", object1Type, characterType, characterType);
        addObjectMethod.setAccessible(true);
        java.lang.Object[] addObjectMethodArguments = new java.lang.Object[3];
        addObjectMethodArguments[0] = object1;
        addObjectMethodArguments[1] = character;
        addObjectMethodArguments[2] = state;
        try {
            addObjectMethod.invoke(keyedObjects2D, addObjectMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.data.KeyedObjects2D.removeRow
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method removeRow(java.lang.Comparable)
    
    /**
    @utbot.classUnderTest {@link KeyedObjects2D}
 * @utbot.methodUnderTest {@link org.jfree.data.KeyedObjects2D#removeRow(java.lang.Comparable)}
 * @utbot.invokes {@link org.jfree.data.KeyedObjects2D#getRowIndex(java.lang.Comparable)}
 * @utbot.invokes {@link org.jfree.data.KeyedObjects2D#removeRow(int)}
 *  */
    @Test
    public void testRemoveRow_KeyedObjects2DRemoveRow() throws Exception  {
        KeyedObjects2D keyedObjects2D = ((KeyedObjects2D) createInstance("org.jfree.data.KeyedObjects2D"));
        ArrayList rowKeys = new ArrayList();
        Integer integer = 0;
        rowKeys.add(integer);
        rowKeys.add(null);
        setField(keyedObjects2D, "org.jfree.data.KeyedObjects2D", "rowKeys", rowKeys);
        setField(keyedObjects2D, "org.jfree.data.KeyedObjects2D", "rows", rowKeys);
        
        keyedObjects2D.removeRow(((Comparable) integer));
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method removeRow(java.lang.Comparable)
    
    /**
    @utbot.classUnderTest {@link KeyedObjects2D}
 * @utbot.methodUnderTest {@link org.jfree.data.KeyedObjects2D#removeRow(java.lang.Comparable)}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: removeRow(index);
 *  */
    @Test
    public void testRemoveRow_ThrowIndexOutOfBoundsException() throws Exception  {
        KeyedObjects2D keyedObjects2D = ((KeyedObjects2D) createInstance("org.jfree.data.KeyedObjects2D"));
        ArrayList rowKeys = new ArrayList();
        setField(keyedObjects2D, "org.jfree.data.KeyedObjects2D", "rowKeys", rowKeys);
        Integer integer = 0;
        
        /* This test fails because method [org.jfree.data.KeyedObjects2D.removeRow] produces [java.lang.IndexOutOfBoundsException: Index -1 out of bounds for length 0]
            java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
            java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
            java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:266)
            java.base/java.util.Objects.checkIndex(Objects.java:359)
            java.base/java.util.ArrayList.remove(ArrayList.java:504)
            org.jfree.data.KeyedObjects2D.removeRow(KeyedObjects2D.java:330)
            org.jfree.data.KeyedObjects2D.removeRow(KeyedObjects2D.java:345) */
        keyedObjects2D.removeRow(((Comparable) integer));
    }
    
    /**
    @utbot.classUnderTest {@link KeyedObjects2D}
 * @utbot.methodUnderTest {@link org.jfree.data.KeyedObjects2D#removeRow(java.lang.Comparable)}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: removeRow(index);
 *  */
    @Test
    public void testRemoveRow_ThrowIndexOutOfBoundsException_1() throws Exception  {
        KeyedObjects2D keyedObjects2D = ((KeyedObjects2D) createInstance("org.jfree.data.KeyedObjects2D"));
        ArrayList rowKeys = new ArrayList();
        rowKeys.add(null);
        setField(keyedObjects2D, "org.jfree.data.KeyedObjects2D", "rowKeys", rowKeys);
        setField(keyedObjects2D, "org.jfree.data.KeyedObjects2D", "rows", rowKeys);
        
        /* This test fails because method [org.jfree.data.KeyedObjects2D.removeRow] produces [java.lang.IndexOutOfBoundsException: Index 0 out of bounds for length 0]
            java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
            java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
            java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:266)
            java.base/java.util.Objects.checkIndex(Objects.java:359)
            java.base/java.util.ArrayList.remove(ArrayList.java:504)
            org.jfree.data.KeyedObjects2D.removeRow(KeyedObjects2D.java:331)
            org.jfree.data.KeyedObjects2D.removeRow(KeyedObjects2D.java:345) */
        keyedObjects2D.removeRow(((Comparable) null));
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method removeRow(java.lang.Comparable)
    
    @Test
    public void testRemoveRow1() throws Exception  {
        KeyedObjects2D keyedObjects2D = ((KeyedObjects2D) createInstance("org.jfree.data.KeyedObjects2D"));
        ArrayList rowKeys = new ArrayList();
        Object object = createInstance("java.lang.Object");
        rowKeys.add(object);
        rowKeys.add(object);
        rowKeys.add(null);
        setField(keyedObjects2D, "org.jfree.data.KeyedObjects2D", "rowKeys", rowKeys);
        
        /* This test fails because method [org.jfree.data.KeyedObjects2D.removeRow] produces [java.lang.NullPointerException]
            org.jfree.data.KeyedObjects2D.removeRow(KeyedObjects2D.java:331)
            org.jfree.data.KeyedObjects2D.removeRow(KeyedObjects2D.java:345) */
        keyedObjects2D.removeRow(((Comparable) null));
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.data.KeyedObjects2D.removeRow
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method removeRow(int)
    
    /**
    @utbot.classUnderTest {@link KeyedObjects2D}
 * @utbot.methodUnderTest {@link org.jfree.data.KeyedObjects2D#removeRow(int)}
 * @utbot.invokes {@link java.util.List#remove(int)}
 * @utbot.invokes {@link java.util.List#remove(int)}
 *  */
    @Test
    public void testRemoveRow_ListRemove() throws Exception  {
        KeyedObjects2D keyedObjects2D = ((KeyedObjects2D) createInstance("org.jfree.data.KeyedObjects2D"));
        ArrayList rowKeys = new ArrayList();
        rowKeys.add(null);
        rowKeys.add(null);
        rowKeys.add(null);
        setField(keyedObjects2D, "org.jfree.data.KeyedObjects2D", "rowKeys", rowKeys);
        setField(keyedObjects2D, "org.jfree.data.KeyedObjects2D", "rows", rowKeys);
        
        keyedObjects2D.removeRow(0);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method removeRow(int)
    
    /**
    @utbot.classUnderTest {@link KeyedObjects2D}
 * @utbot.methodUnderTest {@link org.jfree.data.KeyedObjects2D#removeRow(int)}
 * @utbot.invokes {@link java.util.List#remove(int)}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: this.rows.remove(rowIndex);
 *  */
    @Test
    public void testRemoveRow_ThrowIndexOutOfBoundsException1() throws Exception  {
        KeyedObjects2D keyedObjects2D = ((KeyedObjects2D) createInstance("org.jfree.data.KeyedObjects2D"));
        ArrayList rowKeys = new ArrayList();
        rowKeys.add(null);
        setField(keyedObjects2D, "org.jfree.data.KeyedObjects2D", "rowKeys", rowKeys);
        setField(keyedObjects2D, "org.jfree.data.KeyedObjects2D", "rows", rowKeys);
        
        /* This test fails because method [org.jfree.data.KeyedObjects2D.removeRow] produces [java.lang.IndexOutOfBoundsException: Index 0 out of bounds for length 0]
            java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
            java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
            java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:266)
            java.base/java.util.Objects.checkIndex(Objects.java:359)
            java.base/java.util.ArrayList.remove(ArrayList.java:504)
            org.jfree.data.KeyedObjects2D.removeRow(KeyedObjects2D.java:331) */
        keyedObjects2D.removeRow(0);
    }
    
    /**
    @utbot.classUnderTest {@link KeyedObjects2D}
 * @utbot.methodUnderTest {@link org.jfree.data.KeyedObjects2D#removeRow(int)}
 * @utbot.invokes {@link java.util.List#remove(int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: this.rowKeys.remove(rowIndex);
 *  */
    @Test
    public void testRemoveRow_ThrowNullPointerException() throws Exception  {
        KeyedObjects2D keyedObjects2D = ((KeyedObjects2D) createInstance("org.jfree.data.KeyedObjects2D"));
        
        /* This test fails because method [org.jfree.data.KeyedObjects2D.removeRow] produces [java.lang.NullPointerException]
            org.jfree.data.KeyedObjects2D.removeRow(KeyedObjects2D.java:330) */
        keyedObjects2D.removeRow(-255);
    }
    
    /**
    @utbot.classUnderTest {@link KeyedObjects2D}
 * @utbot.methodUnderTest {@link org.jfree.data.KeyedObjects2D#removeRow(int)}
 * @utbot.invokes {@link java.util.List#remove(int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: this.rows.remove(rowIndex);
 *  */
    @Test
    public void testRemoveRow_ThrowNullPointerException_1() throws Exception  {
        KeyedObjects2D keyedObjects2D = ((KeyedObjects2D) createInstance("org.jfree.data.KeyedObjects2D"));
        ArrayList rowKeys = new ArrayList();
        rowKeys.add(null);
        setField(keyedObjects2D, "org.jfree.data.KeyedObjects2D", "rowKeys", rowKeys);
        
        /* This test fails because method [org.jfree.data.KeyedObjects2D.removeRow] produces [java.lang.NullPointerException]
            org.jfree.data.KeyedObjects2D.removeRow(KeyedObjects2D.java:331) */
        keyedObjects2D.removeRow(0);
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method removeRow(int)
    
    /**
     * @utbot.classUnderTest {@link org.jfree.data.KeyedObjects2D}
     * @utbot.methodUnderTest {@link org.jfree.data.KeyedObjects2D#removeRow(int)}
     */
    @Test
    public void testRemoveRowThrowsIOOBE() {
        KeyedObjects2D keyedObjects2D = new KeyedObjects2D();
        
        /* This test fails because method [org.jfree.data.KeyedObjects2D.removeRow] produces [java.lang.IndexOutOfBoundsException: Index -2147483647 out of bounds for length 0]
            java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
            java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
            java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:266)
            java.base/java.util.Objects.checkIndex(Objects.java:359)
            java.base/java.util.ArrayList.remove(ArrayList.java:504)
            org.jfree.data.KeyedObjects2D.removeRow(KeyedObjects2D.java:330) */
        keyedObjects2D.removeRow(-2147483647);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.data.KeyedObjects2D.removeColumn
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method removeColumn(java.lang.Comparable)
    
    /**
    @utbot.classUnderTest {@link KeyedObjects2D}
 * @utbot.methodUnderTest {@link org.jfree.data.KeyedObjects2D#removeColumn(java.lang.Comparable)}
 * @utbot.invokes {@link org.jfree.data.KeyedObjects2D#getColumnIndex(java.lang.Comparable)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.Object)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#toString()}
 * @utbot.throwsException {@link org.jfree.data.UnknownKeyException} when: index < 0
 *  */
    @Test(expected = UnknownKeyException.class)
    public void testRemoveColumn_ThrowUnknownKeyException() throws Exception  {
        KeyedObjects2D keyedObjects2D = ((KeyedObjects2D) createInstance("org.jfree.data.KeyedObjects2D"));
        ArrayList columnKeys = new ArrayList();
        setField(keyedObjects2D, "org.jfree.data.KeyedObjects2D", "columnKeys", columnKeys);
        
        keyedObjects2D.removeColumn(((Comparable) null));
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method removeColumn(java.lang.Comparable)
    
    /**
    @utbot.classUnderTest {@link KeyedObjects2D}
 * @utbot.methodUnderTest {@link org.jfree.data.KeyedObjects2D#removeColumn(java.lang.Comparable)}
 * @utbot.invokes {@link org.jfree.data.KeyedObjects2D#getColumnIndex(java.lang.Comparable)}
 * @utbot.invokes {@link java.util.List#iterator()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: rowData.removeValue(columnKey);
 *  */
    @Test
    public void testRemoveColumn_ThrowNullPointerException() throws Exception  {
        KeyedObjects2D keyedObjects2D = ((KeyedObjects2D) createInstance("org.jfree.data.KeyedObjects2D"));
        ArrayList columnKeys = new ArrayList();
        columnKeys.add(null);
        columnKeys.add(null);
        columnKeys.add(null);
        setField(keyedObjects2D, "org.jfree.data.KeyedObjects2D", "columnKeys", columnKeys);
        setField(keyedObjects2D, "org.jfree.data.KeyedObjects2D", "rows", columnKeys);
        
        /* This test fails because method [org.jfree.data.KeyedObjects2D.removeColumn] produces [java.lang.NullPointerException]
            org.jfree.data.KeyedObjects2D.removeColumn(KeyedObjects2D.java:378) */
        keyedObjects2D.removeColumn(((Comparable) null));
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method removeColumn(java.lang.Comparable)
    
    @Test
    public void testRemoveColumn1() throws Exception  {
        KeyedObjects2D keyedObjects2D = ((KeyedObjects2D) createInstance("org.jfree.data.KeyedObjects2D"));
        ArrayList columnKeys = new ArrayList();
        Object object = createInstance("java.lang.Object");
        columnKeys.add(object);
        Integer integer = 0;
        columnKeys.add(integer);
        columnKeys.add(null);
        setField(keyedObjects2D, "org.jfree.data.KeyedObjects2D", "columnKeys", columnKeys);
        ArrayList rows = new ArrayList();
        setField(keyedObjects2D, "org.jfree.data.KeyedObjects2D", "rows", rows);
        
        keyedObjects2D.removeColumn(((Comparable) integer));
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method removeColumn(java.lang.Comparable)
    
    @Test
    public void testRemoveColumn2() throws Exception  {
        KeyedObjects2D keyedObjects2D = ((KeyedObjects2D) createInstance("org.jfree.data.KeyedObjects2D"));
        ArrayList columnKeys = new ArrayList();
        Object object = createInstance("java.lang.Object");
        columnKeys.add(object);
        Object object1 = createInstance("java.lang.Object");
        columnKeys.add(object1);
        columnKeys.add(null);
        setField(keyedObjects2D, "org.jfree.data.KeyedObjects2D", "columnKeys", columnKeys);
        setField(keyedObjects2D, "org.jfree.data.KeyedObjects2D", "rows", columnKeys);
        
        /* This test fails because method [org.jfree.data.KeyedObjects2D.removeColumn] produces [java.lang.ClassCastException: class java.lang.Object cannot be cast to class org.jfree.data.KeyedObjects (java.lang.Object is in module java.base of loader 'bootstrap'; org.jfree.data.KeyedObjects is in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @89641db)]
            org.jfree.data.KeyedObjects2D.removeColumn(KeyedObjects2D.java:377) */
        keyedObjects2D.removeColumn(((Comparable) null));
    }
    
    @Test
    public void testRemoveColumn3() throws Exception  {
        KeyedObjects2D keyedObjects2D = ((KeyedObjects2D) createInstance("org.jfree.data.KeyedObjects2D"));
        ArrayList columnKeys = new ArrayList();
        Object object = createInstance("java.lang.Object");
        columnKeys.add(object);
        Object object1 = createInstance("java.lang.Object");
        columnKeys.add(object1);
        Integer integer = 0;
        columnKeys.add(integer);
        setField(keyedObjects2D, "org.jfree.data.KeyedObjects2D", "columnKeys", columnKeys);
        Integer integer1 = 0;
        
        /* This test fails because method [org.jfree.data.KeyedObjects2D.removeColumn] produces [java.lang.NullPointerException]
            org.jfree.data.KeyedObjects2D.removeColumn(KeyedObjects2D.java:375) */
        keyedObjects2D.removeColumn(((Comparable) integer1));
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.data.KeyedObjects2D.removeColumn
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method removeColumn(int)
    
    /**
    @utbot.classUnderTest {@link KeyedObjects2D}
 * @utbot.methodUnderTest {@link org.jfree.data.KeyedObjects2D#removeColumn(int)}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: Comparable columnKey = getColumnKey(columnIndex);
 *  */
    @Test
    public void testRemoveColumn_ThrowIndexOutOfBoundsException() throws Exception  {
        KeyedObjects2D keyedObjects2D = ((KeyedObjects2D) createInstance("org.jfree.data.KeyedObjects2D"));
        ArrayList columnKeys = new ArrayList();
        setField(keyedObjects2D, "org.jfree.data.KeyedObjects2D", "columnKeys", columnKeys);
        
        /* This test fails because method [org.jfree.data.KeyedObjects2D.removeColumn] produces [java.lang.IndexOutOfBoundsException: Index 0 out of bounds for length 0]
            java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
            java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
            java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:266)
            java.base/java.util.Objects.checkIndex(Objects.java:359)
            java.base/java.util.ArrayList.get(ArrayList.java:427)
            org.jfree.data.KeyedObjects2D.getColumnKey(KeyedObjects2D.java:174)
            org.jfree.data.KeyedObjects2D.removeColumn(KeyedObjects2D.java:356) */
        keyedObjects2D.removeColumn(0);
    }
    
    /**
    @utbot.classUnderTest {@link KeyedObjects2D}
 * @utbot.methodUnderTest {@link org.jfree.data.KeyedObjects2D#removeColumn(int)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: Comparable columnKey = getColumnKey(columnIndex);
 *  */
    @Test
    public void testRemoveColumn_ThrowClassCastException() throws Exception  {
        KeyedObjects2D keyedObjects2D = ((KeyedObjects2D) createInstance("org.jfree.data.KeyedObjects2D"));
        ArrayList columnKeys = new ArrayList();
        Object object = createInstance("java.lang.Object");
        columnKeys.add(object);
        setField(keyedObjects2D, "org.jfree.data.KeyedObjects2D", "columnKeys", columnKeys);
        
        /* This test fails because method [org.jfree.data.KeyedObjects2D.removeColumn] produces [java.lang.ClassCastException: class java.lang.Object cannot be cast to class java.lang.Comparable (java.lang.Object and java.lang.Comparable are in module java.base of loader 'bootstrap')]
            org.jfree.data.KeyedObjects2D.getColumnKey(KeyedObjects2D.java:174)
            org.jfree.data.KeyedObjects2D.removeColumn(KeyedObjects2D.java:356) */
        keyedObjects2D.removeColumn(0);
    }
    
    /**
    @utbot.classUnderTest {@link KeyedObjects2D}
 * @utbot.methodUnderTest {@link org.jfree.data.KeyedObjects2D#removeColumn(int)}
 * @utbot.invokes {@link org.jfree.data.KeyedObjects2D#removeColumn(java.lang.Comparable)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: removeColumn(columnKey);
 *  */
    @Test
    public void testRemoveColumn_ThrowClassCastException_1() throws Exception  {
        KeyedObjects2D keyedObjects2D = ((KeyedObjects2D) createInstance("org.jfree.data.KeyedObjects2D"));
        ArrayList columnKeys = new ArrayList();
        Integer integer = 0;
        columnKeys.add(integer);
        setField(keyedObjects2D, "org.jfree.data.KeyedObjects2D", "columnKeys", columnKeys);
        setField(keyedObjects2D, "org.jfree.data.KeyedObjects2D", "rows", columnKeys);
        
        /* This test fails because method [org.jfree.data.KeyedObjects2D.removeColumn] produces [java.lang.ClassCastException: class java.lang.Integer cannot be cast to class org.jfree.data.KeyedObjects (java.lang.Integer is in module java.base of loader 'bootstrap'; org.jfree.data.KeyedObjects is in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @89641db)]
            org.jfree.data.KeyedObjects2D.removeColumn(KeyedObjects2D.java:377)
            org.jfree.data.KeyedObjects2D.removeColumn(KeyedObjects2D.java:357) */
        keyedObjects2D.removeColumn(0);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method removeColumn(int)
    
    @Test
    public void testRemoveColumn4() throws Exception  {
        KeyedObjects2D keyedObjects2D = ((KeyedObjects2D) createInstance("org.jfree.data.KeyedObjects2D"));
        ArrayList columnKeys = new ArrayList();
        Object object = createInstance("java.lang.Object");
        columnKeys.add(object);
        columnKeys.add(object);
        Integer integer = 0;
        columnKeys.add(integer);
        setField(keyedObjects2D, "org.jfree.data.KeyedObjects2D", "columnKeys", columnKeys);
        ArrayList rows = new ArrayList();
        setField(keyedObjects2D, "org.jfree.data.KeyedObjects2D", "rows", rows);
        
        keyedObjects2D.removeColumn(2);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method removeColumn(int)
    
    @Test
    public void testRemoveColumn5() throws Exception  {
        KeyedObjects2D keyedObjects2D = ((KeyedObjects2D) createInstance("org.jfree.data.KeyedObjects2D"));
        ArrayList columnKeys = new ArrayList();
        Object object = createInstance("java.lang.Object");
        columnKeys.add(object);
        columnKeys.add(object);
        Character character = '\u0000';
        columnKeys.add(character);
        setField(keyedObjects2D, "org.jfree.data.KeyedObjects2D", "columnKeys", columnKeys);
        
        /* This test fails because method [org.jfree.data.KeyedObjects2D.removeColumn] produces [java.lang.NullPointerException]
            org.jfree.data.KeyedObjects2D.removeColumn(KeyedObjects2D.java:375)
            org.jfree.data.KeyedObjects2D.removeColumn(KeyedObjects2D.java:357) */
        keyedObjects2D.removeColumn(2);
    }
    
    @Test
    public void testRemoveColumn6() throws Exception  {
        KeyedObjects2D keyedObjects2D = ((KeyedObjects2D) createInstance("org.jfree.data.KeyedObjects2D"));
        ArrayList columnKeys = new ArrayList();
        Character character = '\u0000';
        columnKeys.add(character);
        Object object = createInstance("java.lang.Object");
        columnKeys.add(object);
        columnKeys.add(object);
        setField(keyedObjects2D, "org.jfree.data.KeyedObjects2D", "columnKeys", columnKeys);
        ArrayList rows = new ArrayList();
        rows.add(null);
        rows.add(null);
        rows.add(null);
        setField(keyedObjects2D, "org.jfree.data.KeyedObjects2D", "rows", rows);
        
        /* This test fails because method [org.jfree.data.KeyedObjects2D.removeColumn] produces [java.lang.NullPointerException]
            org.jfree.data.KeyedObjects2D.removeColumn(KeyedObjects2D.java:378)
            org.jfree.data.KeyedObjects2D.removeColumn(KeyedObjects2D.java:357) */
        keyedObjects2D.removeColumn(0);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.data.KeyedObjects2D.getColumnCount
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getColumnCount()
    
    /**
    @utbot.classUnderTest {@link KeyedObjects2D}
 * @utbot.methodUnderTest {@link org.jfree.data.KeyedObjects2D#getColumnCount()}
 * @utbot.invokes {@link java.util.List#size()}
 * @utbot.returnsFrom {@code return this.columnKeys.size();}
 *  */
    @Test
    public void testGetColumnCount_ListSize() throws Exception  {
        KeyedObjects2D keyedObjects2D = ((KeyedObjects2D) createInstance("org.jfree.data.KeyedObjects2D"));
        ArrayList columnKeys = new ArrayList();
        columnKeys.add(null);
        columnKeys.add(null);
        columnKeys.add(null);
        setField(keyedObjects2D, "org.jfree.data.KeyedObjects2D", "columnKeys", columnKeys);
        
        int actual = keyedObjects2D.getColumnCount();
        
        assertEquals(3, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getColumnCount()
    
    /**
    @utbot.classUnderTest {@link KeyedObjects2D}
 * @utbot.methodUnderTest {@link org.jfree.data.KeyedObjects2D#getColumnCount()}
 * @utbot.invokes {@link java.util.List#size()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return this.columnKeys.size();
 *  */
    @Test
    public void testGetColumnCount_ThrowNullPointerException() throws Exception  {
        KeyedObjects2D keyedObjects2D = ((KeyedObjects2D) createInstance("org.jfree.data.KeyedObjects2D"));
        
        /* This test fails because method [org.jfree.data.KeyedObjects2D.getColumnCount] produces [java.lang.NullPointerException]
            org.jfree.data.KeyedObjects2D.getColumnCount(KeyedObjects2D.java:99) */
        keyedObjects2D.getColumnCount();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.data.KeyedObjects2D.getColumnKey
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getColumnKey(int)
    
    /**
    @utbot.classUnderTest {@link KeyedObjects2D}
 * @utbot.methodUnderTest {@link org.jfree.data.KeyedObjects2D#getColumnKey(int)}
 * @utbot.invokes {@link java.util.List#get(int)}
 * @utbot.returnsFrom {@code return (Comparable) this.columnKeys.get(column);}
 *  */
    @Test
    public void testGetColumnKey_ListGet() throws Exception  {
        KeyedObjects2D keyedObjects2D = ((KeyedObjects2D) createInstance("org.jfree.data.KeyedObjects2D"));
        ArrayList columnKeys = new ArrayList();
        columnKeys.add(null);
        setField(keyedObjects2D, "org.jfree.data.KeyedObjects2D", "columnKeys", columnKeys);
        
        Comparable actual = keyedObjects2D.getColumnKey(0);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getColumnKey(int)
    
    /**
    @utbot.classUnderTest {@link KeyedObjects2D}
 * @utbot.methodUnderTest {@link org.jfree.data.KeyedObjects2D#getColumnKey(int)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: return (Comparable) this.columnKeys.get(column);
 *  */
    @Test
    public void testGetColumnKey_ThrowClassCastException() throws Exception  {
        KeyedObjects2D keyedObjects2D = ((KeyedObjects2D) createInstance("org.jfree.data.KeyedObjects2D"));
        ArrayList columnKeys = new ArrayList();
        Object object = createInstance("java.lang.Object");
        columnKeys.add(object);
        setField(keyedObjects2D, "org.jfree.data.KeyedObjects2D", "columnKeys", columnKeys);
        
        /* This test fails because method [org.jfree.data.KeyedObjects2D.getColumnKey] produces [java.lang.ClassCastException: class java.lang.Object cannot be cast to class java.lang.Comparable (java.lang.Object and java.lang.Comparable are in module java.base of loader 'bootstrap')]
            org.jfree.data.KeyedObjects2D.getColumnKey(KeyedObjects2D.java:174) */
        keyedObjects2D.getColumnKey(0);
    }
    
    /**
    @utbot.classUnderTest {@link KeyedObjects2D}
 * @utbot.methodUnderTest {@link org.jfree.data.KeyedObjects2D#getColumnKey(int)}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: return (Comparable) this.columnKeys.get(column);
 *  */
    @Test
    public void testGetColumnKey_ThrowIndexOutOfBoundsException() throws Exception  {
        KeyedObjects2D keyedObjects2D = ((KeyedObjects2D) createInstance("org.jfree.data.KeyedObjects2D"));
        ArrayList columnKeys = new ArrayList();
        columnKeys.add(null);
        columnKeys.add(null);
        columnKeys.add(null);
        setField(keyedObjects2D, "org.jfree.data.KeyedObjects2D", "columnKeys", columnKeys);
        
        /* This test fails because method [org.jfree.data.KeyedObjects2D.getColumnKey] produces [java.lang.IndexOutOfBoundsException: Index -1 out of bounds for length 3]
            java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
            java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
            java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:266)
            java.base/java.util.Objects.checkIndex(Objects.java:359)
            java.base/java.util.ArrayList.get(ArrayList.java:427)
            org.jfree.data.KeyedObjects2D.getColumnKey(KeyedObjects2D.java:174) */
        keyedObjects2D.getColumnKey(-1);
    }
    
    /**
    @utbot.classUnderTest {@link KeyedObjects2D}
 * @utbot.methodUnderTest {@link org.jfree.data.KeyedObjects2D#getColumnKey(int)}
 * @utbot.invokes {@link java.util.List#get(int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return (Comparable) this.columnKeys.get(column);
 *  */
    @Test
    public void testGetColumnKey_ThrowNullPointerException() throws Exception  {
        KeyedObjects2D keyedObjects2D = ((KeyedObjects2D) createInstance("org.jfree.data.KeyedObjects2D"));
        
        /* This test fails because method [org.jfree.data.KeyedObjects2D.getColumnKey] produces [java.lang.NullPointerException]
            org.jfree.data.KeyedObjects2D.getColumnKey(KeyedObjects2D.java:174) */
        keyedObjects2D.getColumnKey(-255);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.data.KeyedObjects2D.getRowKey
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getRowKey(int)
    
    /**
    @utbot.classUnderTest {@link KeyedObjects2D}
 * @utbot.methodUnderTest {@link org.jfree.data.KeyedObjects2D#getRowKey(int)}
 * @utbot.invokes {@link java.util.List#get(int)}
 * @utbot.returnsFrom {@code return (Comparable) this.rowKeys.get(row);}
 *  */
    @Test
    public void testGetRowKey_ListGet() throws Exception  {
        KeyedObjects2D keyedObjects2D = ((KeyedObjects2D) createInstance("org.jfree.data.KeyedObjects2D"));
        ArrayList rowKeys = new ArrayList();
        rowKeys.add(null);
        setField(keyedObjects2D, "org.jfree.data.KeyedObjects2D", "rowKeys", rowKeys);
        
        Comparable actual = keyedObjects2D.getRowKey(0);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getRowKey(int)
    
    /**
    @utbot.classUnderTest {@link KeyedObjects2D}
 * @utbot.methodUnderTest {@link org.jfree.data.KeyedObjects2D#getRowKey(int)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: return (Comparable) this.rowKeys.get(row);
 *  */
    @Test
    public void testGetRowKey_ThrowClassCastException() throws Exception  {
        KeyedObjects2D keyedObjects2D = ((KeyedObjects2D) createInstance("org.jfree.data.KeyedObjects2D"));
        ArrayList rowKeys = new ArrayList();
        Object object = createInstance("java.lang.Object");
        rowKeys.add(object);
        setField(keyedObjects2D, "org.jfree.data.KeyedObjects2D", "rowKeys", rowKeys);
        
        /* This test fails because method [org.jfree.data.KeyedObjects2D.getRowKey] produces [java.lang.ClassCastException: class java.lang.Object cannot be cast to class java.lang.Comparable (java.lang.Object and java.lang.Comparable are in module java.base of loader 'bootstrap')]
            org.jfree.data.KeyedObjects2D.getRowKey(KeyedObjects2D.java:137) */
        keyedObjects2D.getRowKey(0);
    }
    
    /**
    @utbot.classUnderTest {@link KeyedObjects2D}
 * @utbot.methodUnderTest {@link org.jfree.data.KeyedObjects2D#getRowKey(int)}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: return (Comparable) this.rowKeys.get(row);
 *  */
    @Test
    public void testGetRowKey_ThrowIndexOutOfBoundsException() throws Exception  {
        KeyedObjects2D keyedObjects2D = ((KeyedObjects2D) createInstance("org.jfree.data.KeyedObjects2D"));
        ArrayList rowKeys = new ArrayList();
        rowKeys.add(null);
        rowKeys.add(null);
        rowKeys.add(null);
        setField(keyedObjects2D, "org.jfree.data.KeyedObjects2D", "rowKeys", rowKeys);
        
        /* This test fails because method [org.jfree.data.KeyedObjects2D.getRowKey] produces [java.lang.IndexOutOfBoundsException: Index -1 out of bounds for length 3]
            java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
            java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
            java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:266)
            java.base/java.util.Objects.checkIndex(Objects.java:359)
            java.base/java.util.ArrayList.get(ArrayList.java:427)
            org.jfree.data.KeyedObjects2D.getRowKey(KeyedObjects2D.java:137) */
        keyedObjects2D.getRowKey(-1);
    }
    
    /**
    @utbot.classUnderTest {@link KeyedObjects2D}
 * @utbot.methodUnderTest {@link org.jfree.data.KeyedObjects2D#getRowKey(int)}
 * @utbot.invokes {@link java.util.List#get(int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return (Comparable) this.rowKeys.get(row);
 *  */
    @Test
    public void testGetRowKey_ThrowNullPointerException() throws Exception  {
        KeyedObjects2D keyedObjects2D = ((KeyedObjects2D) createInstance("org.jfree.data.KeyedObjects2D"));
        
        /* This test fails because method [org.jfree.data.KeyedObjects2D.getRowKey] produces [java.lang.NullPointerException]
            org.jfree.data.KeyedObjects2D.getRowKey(KeyedObjects2D.java:137) */
        keyedObjects2D.getRowKey(-255);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.data.KeyedObjects2D.getRowCount
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getRowCount()
    
    /**
    @utbot.classUnderTest {@link KeyedObjects2D}
 * @utbot.methodUnderTest {@link org.jfree.data.KeyedObjects2D#getRowCount()}
 * @utbot.invokes {@link java.util.List#size()}
 * @utbot.returnsFrom {@code return this.rowKeys.size();}
 *  */
    @Test
    public void testGetRowCount_ListSize() throws Exception  {
        KeyedObjects2D keyedObjects2D = ((KeyedObjects2D) createInstance("org.jfree.data.KeyedObjects2D"));
        ArrayList rowKeys = new ArrayList();
        rowKeys.add(null);
        rowKeys.add(null);
        rowKeys.add(null);
        setField(keyedObjects2D, "org.jfree.data.KeyedObjects2D", "rowKeys", rowKeys);
        
        int actual = keyedObjects2D.getRowCount();
        
        assertEquals(3, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getRowCount()
    
    /**
    @utbot.classUnderTest {@link KeyedObjects2D}
 * @utbot.methodUnderTest {@link org.jfree.data.KeyedObjects2D#getRowCount()}
 * @utbot.invokes {@link java.util.List#size()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return this.rowKeys.size();
 *  */
    @Test
    public void testGetRowCount_ThrowNullPointerException() throws Exception  {
        KeyedObjects2D keyedObjects2D = ((KeyedObjects2D) createInstance("org.jfree.data.KeyedObjects2D"));
        
        /* This test fails because method [org.jfree.data.KeyedObjects2D.getRowCount] produces [java.lang.NullPointerException]
            org.jfree.data.KeyedObjects2D.getRowCount(KeyedObjects2D.java:88) */
        keyedObjects2D.getRowCount();
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
        
                java.lang.reflect.Method methodForGetDeclaredFields799841991736200 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields799841991736200.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass799841991741100 = (java.lang.reflect.Field[]) methodForGetDeclaredFields799841991736200.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass799841991741100).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
    
    private static Object getUnsafeInstance() throws ClassNotFoundException, NoSuchFieldException, IllegalAccessException {
        java.lang.reflect.Field f = Class.forName("sun.misc.Unsafe").getDeclaredField("theUnsafe");
        f.setAccessible(true);
        return f.get(null);
    }
    ///endregion
}

